		package utilTest;
		
		import java.util.HashMap;
		
		public class HashMapTest {
			//Ű�� ������ �̷�������� �� 
			//interface�� ������ ���� �����Ѱ��� �ؽ���
			//�ߺ� ��� ����    ������ �������<-> array :�ߺ���� ������Ŵ
			
			public static void main(String[] args) {
				HashMap<String,String> hm=new HashMap<String,String>();
				hm.put("one","ù��°");
				hm.put("two","�ι�°");
				hm.put("three","����°");
				hm.put("four","�׹�°");
			System.out.println(hm);
			System.out.println(hm.size());
			hm.put("one","ù��°one");
			System.out.println(hm);
			System.out.println(hm.size());
			System.out.println(hm.get("two"));
			hm.put("1","���γ���");
			System.out.println(hm);
			//key���� ���
			for(String s:hm.keySet()){
			System.out.println(s);
			}
			//value���� ���
			for(String s:hm.keySet()){
				 System.out.println(hm.get(s));
				 }
			System.out.println(hm.containsKey("1"));
			System.out.println(hm.containsValue("�ι�°"));
			for(String s:hm.values()) {
				System.out.println(s);
			}
	}
	}