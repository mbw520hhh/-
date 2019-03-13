
public class Test2_9 {
	static int max=50;                   	//����Ĭ�ϴ�С
	static int[] x=new int[max];         	//�ж���ɫ�Ƿ���ͬ
	static int[][] map= {					//�õ�ͼ���ڽӾ���
			{0,1,1,0,0,1},
			{1,0,1,0,0,0},
			{1,1,0,1,0,1},
			{0,0,1,0,1,1},
			{0,0,0,1,0,1},
			{1,0,1,1,1,0}
	};	//ͼ���ڽӾ���
	static int sum=0;                    	//��¼��ĸ���
	static int n,m;                    //n Ϊ�ڵ����   m��ɫ������  edge�Ǳ���
	
	public static void main(String [] args) {
		n=6;//�����ڵ�
		m=4;//������ɫ
		backTrack(0);
	}

	private static void backTrack(int t) {        //��t���ڵ�
		if(t>=n) {     //�ﵽҶ�ӽڵ�  ��¼���н� ��sum++
			sum++;
			System.out.println("��"+sum+"�ַ���:");
			for(int i=0;i<n;i++) {
				System.out.print((x[i]+1)+" ");          //��ӡ����sum�ַ������������
			}
			System.out.println();
		}else {                                     //ÿ���ڵ㳢��m����ɫ  ��˳����
			for(int i=0;i<m;i++) {
				x[t]=i;
				if(ok(t))                            //�ж��Ƿ���ǰt-1���ڵ��Ƿ�����ȴ��ͬɫ
					backTrack(t+1);              // yes�Ļ���  ����������һ��չ�ڵ�   no�����ѭ��
			}
		}
	}
		
	
	/*�ж��Ƿ���ǰt-1���ڵ��Ƿ�����ȴ��ͬɫ*/
	private static boolean ok(int t) {
		for(int j=0;j<t;j++) {                           //��ǰt-1���ڵ���бȽ�
			if(map[t][j]==1) {                       //t��j����
				if(x[t]==x[j])			 //�ж�ɫ���Ƿ���ͬ   ��ͬ  �򷵻�false
					return false;
			}
		}
		return true;                                
	}

}