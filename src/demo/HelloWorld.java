package demo;

public class HelloWorld {
	    
	    //��� main ����
	    public static void main(String[] args) {
	        
	        // �������󣬶�����Ϊhello
			HelloWorld hello = new HelloWorld(); 
	        
	        // ���÷�����������ֵ�����ڱ�����
	        int maxScore=hello.getMaxAge();
	        
			// ����������
			System.out.println("�������Ϊ��" + maxScore); 
		}

		/*
		 * ���ܣ����ѧ����������ֵ 
	     * ����һ���޲εķ���������ֵΪ��������ֵ
	     * �ο����裺
	     * 1������һ���������� ages ������ѧ�����䣬����Ԫ������Ϊ 18 ,23 ,21 ,19 ,25 ,29 ,17
	     * 2������һ�����α��� max ,����ѧ��������䣬��ʼʱ�ٶ������еĵ�һ��Ԫ��Ϊ���ֵ
	     * 3��ʹ�� for ѭ�����������е�Ԫ�أ�����ٶ������ֵ�Ƚϣ�����ȼٶ������ֵҪ�����滻��ǰ�����ֵ
	     * 4��ʹ�� return �������ֵ
		 */
		public int getMaxAge() {
		int[] ages={18,23,21,19,25,29,17};
	    int max=ages[0];
	    for(int i=0;i<ages.length;i++){
	        if(ages[i]>max)
	        {max=ages[i];}
	        
	    }
	    return max;
	    
	    
	    
	    
	    
		}
	}
