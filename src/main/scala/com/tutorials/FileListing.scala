package com.tutorials

/**
 * Created by sujay on 3/23/14.
 */
object FileListing {



  def filesMatching(dir: String, matcher: (String) => Boolean): Array[java.io.File] = {
    val files = (new java.io.File(dir)).listFiles
    for(file <- files; if matcher(file.getName))
      yield file
  }

  def filesEnding(dir: String, query: String) =
    filesMatching(dir, _.endsWith(query))

  def filesContain(dir: String, query: String) =
    filesMatching(dir, _.contains(query))
}
