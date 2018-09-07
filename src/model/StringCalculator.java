package model;

import java.util.StringTokenizer;

class StringCalculator {

	public static int add(String source) {
		if (source == null || source.equals("")) {
			return 0;
		} else {
			StringBuffer sb = new StringBuffer();
			for (String retval : source.split(",")) {
				sb.append(retval);
				sb.append(" ");
			}
			int result = 0;
			StringTokenizer st = new StringTokenizer(sb.toString());
			while (st.hasMoreElements()) {
				String token = st.nextToken();
				int temp = Integer.parseInt(token);
				if (temp < 1001) {
					result = result + temp;
				}
			}
			return result;
		}
	}
}
