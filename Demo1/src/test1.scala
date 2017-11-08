/**
 *	scala 基础
 * 	对象: 包含属性和行为
 * 	类: 类是对象的抽象，而对象是类的具体实例
 * 	方法: 方法描述的基本行为
 * 	字段: 每个对象都有它唯一的实例变量集合
 * 	
 * 	scala collection(集合)
 * 	List、Set、Map、元组、Option、迭代器
 * 
 * 	scala Trait(特征) 相当于 java的接口，但是功能更加强大
 * 	他可以定义属性和方法的实现
 * 	trait Equal {
 * 		def isEqual(x: Any):Boolean
 * 		def isNotEqual(x: Any):Boolean = !isEqual(x)
 * 	} 
 *	class Point(xc: Int, yc: Int) extends Equal {
 * 	
 * 	}
 * 
 * 	scala 提取器
 * 
 * 	scala 模式匹配 相当于 switch
 * 	
 *
 */

object test1 {
  def main (args:Array[String]) : Unit = {
    println("hello world")
  }
}