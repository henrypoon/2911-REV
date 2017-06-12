public class ArrayListSet<E> implements Set<E> {

	private ArrayList<E> array;

	public void addElement(E e){
		if (!this.has(e)){
			this.array.add(e);
		}
	}

	public void removeElement(E e){
		if (this.has(e)){
			this.array.remove(e);
		}
	}

	public boolean has(Object e){
		return this.array.contains(e);
	}

	public Set<E> union (Set<E> other){
		ArrayListSet<E> r = new ArrayListSet<E>();
		for (E e: this){
			r.addElement(e);
		}
		for (E e: other){
			r.addElement(e);
		}
		return r;
	}

	public Set<E> intersection(Set<E> other){
		ArrayListSet<E> r = new ArrayListSet<E>();
		for (E e: this){
			if (other.has(e)){
				r.addElement(e);
			}
		}
		return r;
	}

	public boolean equals(Object other){
		if (other == null) return false;
		if (! (other instanceof Set)) return false;
		Set<?> s = (Set<?>) other;
		for (Object e: s){
			if (!this.has(e)) return false;
		}
		for (Object e: this){
			if (!this.has(e)) return false;
		}
		return true;
	}
}