		package utilTest;
		
		import java.util.HashMap;
		
		public class HashMapTest {
			//키와 벨류로 이루어진것을 맵 
			//interface를 가지고 맵을 구현한것을 해쉬맵
			//중복 허용 ㄴㄴ    순서는 상관없음<-> array :중복허용 순서지킴
			
			public static void main(String[] args) {
				HashMap<String,String> hm=new HashMap<String,String>();
				hm.put("one","첫번째");
				hm.put("two","두번째");
				hm.put("three","세번째");
				hm.put("four","네번째");
			System.out.println(hm);
			System.out.println(hm.size());
			hm.put("one","첫번째one");
			System.out.println(hm);
			System.out.println(hm.size());
			System.out.println(hm.get("two"));
			hm.put("1","새로넣음");
			System.out.println(hm);
			//key값을 출력
			for(String s:hm.keySet()){
			System.out.println(s);
			}
			//value값을 출력
			for(String s:hm.keySet()){
				 System.out.println(hm.get(s));
				 }
			System.out.println(hm.containsKey("1"));
			System.out.println(hm.containsValue("두번째"));
			for(String s:hm.values()) {
				System.out.println(s);
			}
	}
	}