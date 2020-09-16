package us.lsi.common;


	public final class Tuple4<T1, T2, T3, T4> {

		
		public final T1 v1;
		public final T2 v2;
		public final T3 v3;
		public final T4 v4;
		
		protected Tuple4(T1 p1, T2 p2, T3 p3, T4 p4) {
			super();
			this.v1 = p1;
			this.v2 = p2;
			this.v3 = p3;
			this.v4 = p4;
		}		

		public T1 getV1() {
			return v1;
		}

		public T2 getV2() {
			return v2;
		}

		public T3 getV3() {
			return v3;
		}

		public T4 getV4() {
			return v4;
		}

		public Tuple4<T1, T2, T3, T4> copy(){
			return Tuple.create(this.getV1(), this.getV2(), this.getV3(), this.getV4());
		}
		
		public Tuple4<T1, T2, T3, T4> setP1(T1 p1) {
			return Tuple.create(p1,v2,v3,v4);
		}

		
		public Tuple4<T1, T2, T3, T4> setP2(T2 p2) {
			return Tuple.create(v1,p2,v3,v4);
		}
		
		
		public Tuple4<T1, T2, T3, T4> setP3(T3 p3) {
			return Tuple.create(v1,v2,p3,v4);
		}

		public Tuple4<T1, T2, T3, T4> setP4(T4 p4) {
			return Tuple.create(v1,v2,v3,p4);
		}
		

		@Override
		public String toString() {
			return "(" + v1 + "," + v2 + "," + v3 + ","
					+ v4 + ")";
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((v1 == null) ? 0 : v1.hashCode());
			result = prime * result + ((v2 == null) ? 0 : v2.hashCode());
			result = prime * result + ((v3 == null) ? 0 : v3.hashCode());
			result = prime * result + ((v4 == null) ? 0 : v4.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (!(obj instanceof Tuple4))
				return false;
			Tuple4<?,?,?,?> other = (Tuple4<?,?,?,?>) obj;
			if (v1 == null) {
				if (other.v1 != null)
					return false;
			} else if (!v1.equals(other.v1))
				return false;
			if (v2 == null) {
				if (other.v2 != null)
					return false;
			} else if (!v2.equals(other.v2))
				return false;
			if (v3 == null) {
				if (other.v3 != null)
					return false;
			} else if (!v3.equals(other.v3))
				return false;
			if (v4 == null) {
				if (other.v4 != null)
					return false;
			} else if (!v4.equals(other.v4))
				return false;
			return true;
		}
		
		
		

}
