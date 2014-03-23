package com.tutorials

/**
 * Created by sujay on 3/23/14.
 */
class FileListingSpec extends UnitSpec {

  "File listing" should "list files in the current directory ending with .iml extension" in {
    val ls = FileListing.filesEnding(".", ".iml")
    assert(ls.length == 1)
  }

  "File listing" should "list file in the current directory containing letter 's'" in {
    val ls = FileListing.filesContain(".", "s")
    assert(ls.length == 3)
  }
}
