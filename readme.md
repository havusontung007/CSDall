
===============================================
--------LIST-----------------------------------
===============================================

- addToHead: add vào đầu list

- insertToIndex: insert vào 1 index nào đó

- swapElementAt: (swapElementAt + getNodeAt): hoán đổi giá trị của 2 node

- Sort: với sort thì nhớ thay điều kiện <?> đi thành 1 thuộc tính ở đây tạm để dèfault còn nếu thuộc tính là String thì dùng CompareTo

- reverse: reverse from element from element at a and b -1 

- reverse all: copy 2 hàm reverse(int a, int b) và reverse() và sử dụng reverse

=> hướng dẫn

-   hàm <val()> là cực kì quan trọng nhớ chỉnh dửa để tránh lỗi
    thay dấu ? bằng thuộc tính <key>

===============================================
--------TREE-----------------------------------
===============================================

<<< Lưu ý>>> cần thay dấu * trong hàm val bằng key để sử dụng

- val: lấy gt của key

- insert: dùng để chèn

- findFirstNodeOnlyLeft: lấy cái node đầu tiên chỉ có node <trái> nếu có điều kiện thì thêm trong if đầu tiên

- findFirstNodeOnlyRight: lấy cái node đầu tiên chỉ có node <Phải> nếu có điều kiện thì thêm trong if đầu tiên

- findFirstNode2Child: lấy node có cả 2 con

- findFather : tìm cha của 1 node, trả về null nếu k tìm thấy hoặc node đó là null hay <root>

- rotate: hàm dùng để quay 

=> hd: 

- copy đầy đủ hàm

- hàm <val()> là cực kì quan trọng nhớ chỉnh dửa để tránh lỗi
    thay dấu ? bằng thuộc tính <key>
- với hàm quay thì đầu tiên thực hiện find sau đó dựa vào đề 
    giả sử: s = findFirstNodeOnlyLeft();

    nếu đề yêu cầu <p to right about its’ left son>

    rotate(s.left)
===============================================
--------GRAPH----------------------------------
===============================================

<Lưu ý> : Nếu đề bài có 2 câu hỏi Q1 và Q2, thì có nghĩa là Q3 và Q2 bình thường sẽ gộp lại thành Q2, do vậy sẽ có 2 class về Stack và Queue 

để thích hợp cho từng câu hỏi về BsTree và Graph (BStack, GStack, BQueue, GQueue), cho nên khi sử dụng hàm trong đây sẽ bị lỗi ở stack. Mọi 

người chú ý sửa stack sao cho thích hợp với từng format để
-> Hưỡng dẫn : 
	+ Nếu đề có 2 câu hỏi, các hàm sau đây sẽ giữ nguyên format, chỉ cần modify về các giá trị khởi tạo
	
	+ Nếu đề có 3 câu hỏi, các hàm sau đây sẽ bị lỗi ở Stack , Queue tương ứng. Chỉ cần sửa lại thành Stack, Queue (BStack-> Stack,BQueue-> Queue....).

- Dijkstra :  Sử dụng Dijksta để tìm đường đi ngắn nhất giữa 2 đinh trong đồ thị

- Euler : Tìm và in ra các đỉnh theo Euler Cycle.

* Cách sử dụng : 

	- Dijkstra : copy toàn bộ từ bắt đầu tới //end dijstra. Khi truyền vào nhớ thay đổi giá trị khở tạo tùy theo đầu bài, 
		
		vd : dijkstra(0, 4, f);	< Tìm đường đi ngắn nhất từ đỉnh 0->4 >
	
	- Euler : copy toàn bộ từ bắt đầu tới //end euler. Khi truyền vào nhớ thay đổi giá trị khở tạo tùy theo đầu bài, 
		
		vd : EulerCycle(1, f);;	< Tìm và in ra chu trình Euler bắt đầu từ đỉnh 1 >


