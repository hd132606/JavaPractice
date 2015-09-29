package org.dimigo.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MelonChart {

	public static void main(String[] args) {
        List<Music> list = new ArrayList<Music>();
        
        list.add(new Music("바람이나 좀 쐐", "개리"));
        list.add(new Music("보통연애", "박경"));
        list.add(new Music("취향저격", "iKON"));

        System.out.println("-- << 멜론 챠트 >> --\n");
        printList(list);

        list.add(1, new Music("레옹", "이유갓지"));
        System.out.println("-- << 2위 곡 추가 >> --\n");
        printList(list);

        list.set(2, new Music("맙소사", "황태지"));
        System.out.println("-- << 3위 곡 변경 >> --\n");
        printList(list);

        list.remove(3);
        System.out.println("-- << 4위 곡 삭제 >> --\n");
        printList(list);

        list.clear();
        System.out.println("-- << 전체 리스트 삭제 >> --\n");
        printList(list);
    }
	
	public static void printList(List<Music> list) {
		Iterator<Music> i = list.iterator();
		while(i.hasNext()){
			System.out.println(i.next());
		};
	}
}
