public interface Set<E> {
	public void addElement(E e);

	public void removeElement(E e);

	public boolean has(E e);

	public Set<E> union(Set<E> other);

	public Set<E> intersection(Set<E> other);

	public Set<E> equals (Object o);
}