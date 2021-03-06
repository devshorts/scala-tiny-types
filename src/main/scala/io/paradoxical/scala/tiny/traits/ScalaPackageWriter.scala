package io.paradoxical.scala.tiny.traits

import java.io.{BufferedWriter, File, FileWriter}

trait ScalaPackageWriter extends Output {
  val folder: String

  val packageName: String

  val fileHeader = ""

  def write(content: String, fileName: String): Unit = {
    val dir = s"$folder/${packageName.replace('.', '/')}"

    val f = new File(s"$dir/$fileName")

    if (!f.getParentFile.exists()) {
      f.getParentFile.mkdirs()
    }

    val writer = new BufferedWriter(new FileWriter(f))

    println(s"Writing to ${f.getAbsolutePath}")

    writer.write( s"""${fileHeader}
package $packageName

$content""")

    writer.close()
  }
}
