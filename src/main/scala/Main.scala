import java.io.File
// import org.apache.poi.ss.usermodel.{ DataFormatter, WorkbookFactory, Row }
import scala.io.Source


object Main extends App {
  println("Hello, World!")
  val filename ="mysurveyfile.xlsx"

  for (line <- Source.fromFile(filename).toString()){
    println(line)
  }
}