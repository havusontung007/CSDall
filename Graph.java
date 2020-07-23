/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PST91
 */
public class Graph {
    public static void main(String[] args) {
    }
    void dijkstra(int fro, int to, RandomAccessFile f) throws Exception
    {int i,j,k,t,INF;
      INF=999;
      boolean [] S = new boolean[n];
      int [] d = new int[n];
      int [] p = new int[n];
      for(i=0;i<n;i++)
        {S[i] = false;
          d[i] = a[fro][i];
          p[i] = fro;
        }

      int [] ss = new int[n]; // ss[0], ss[1], ss[2],... are vertices sequentially selected to S
      int [] pp = new int[n]; // ss[0] -> ss[1] -> ss[2],... is the shortest path
      int m, r; // m is number of vertices in S,
                    // r is the number of vertices in shortest path 
      j = 0;

      // select fro into the set S
      S[fro] = true; ss[0] = fro;
      while(true)
        {// find min d[i] in the set of those vertices not selected into S
          k = -1; t = INF;
          for(i=0;i<n;i++)
            {if(S[i]==true) continue;
              if(d[i] < t) {k = i; t = d[i];}
            }
           if(k==-1) return; // no solution
           // select k into the set S
           S[k] = true;
           j++;
           ss[j] = k;
           if(k==to) break;
           // Recalculate d[i]
           for(i=0;i<n;i++)
             {if(S[i] == true) continue;
               if(d[i] > d[k] + a[k][i])
                {d[i] = d[k] + a[k][i];
                  p[i] = k;
                }
             }
        }
       m = j;
      Stack s = new Stack();
      i = to;
      while(true)
        {s.push(i);
          if(i==fro) break;
          i = p[i];
        }
      j = 0;
      while(!s.isEmpty())
        {i = s.pop();
          pp[j++] = i;
         }
      r = j;
   f.writeBytes(""+v[pp[0]]);
   for(i = 1;i<r;i++) f.writeBytes("   " +v[pp[i]]);
   f.writeBytes("\r\n");
   f.writeBytes(""+d[pp[0]]);
   for(i = 1;i<r;i++) f.writeBytes("   " +d[pp[i]]);
   f.writeBytes("\r\n");
 }

}
