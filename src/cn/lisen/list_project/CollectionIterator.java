package cn.lisen.list_project;

public class CollectionIterator {
	// JDK8 Iterable接口新增了一个forEach方法，参数是函数式接口类型，可使用Lambda表达式
		// Iterable接口是Collection接口的父接口，可用forEach遍历集合元素
		public static void main(String[] args) {
			Collection books = new HashSet();// set集合元素是無序的
			books.add("轻量级JavaEE企业应用实战");
			// books.add("轻量级企业应用实战");
			books.add("疯狂Java讲义");
			books.add("疯狂Android讲义");
			// 调用forEach()方法
			// books.forEach(obj->System.out.println("迭代集合元素"+obj));
			Iterator it = books.iterator();// 获取集合对应的迭代器
			while (it.hasNext()) {
				String book = (String) it.next();
				if ("疯狂Android讲义".equals(book)) {
					// it.remove();

					// 迭代器具有fail-fast机制
					books.remove(book);// 使用迭代器时，修改集合中的元素，会导致java.util.ConcurrentModificationException并发修改异常

				}
				System.out.println(book);
				// book="测试字符串";//对book临时变量赋值不会改变集合元素本身,只是将集合元素的值传给这个迭代变量
			}
			System.out.println(books);

			/*
			 * iterator 是工作在一个独立的线程中，并且拥有一个 mutex 锁。 Iterator
			 * 被创建之后会建立一个指向原来对象的单链索引表，当原来的对象数量发生变化时，
			 * 这个索引表的内容不会同步改变，所以当索引指针往后移动的时候就找不到要迭代的对象， 所以按照 fail-fast 原则 Iterator 会马上抛出
			 * java.util.ConcurrentModificationException 异常。 但可以使用 Iterator 本身的方法 remove()
			 * 来删除对象， Iterator.remove() 方法会在删除当前迭代对象的同时维护索引的一致性。
			 */
		}
}
