class Mp3 extends USB1 with USB2 with  USB3 {
  override def slot(): Unit = {
    printf("~~~~~~~~~~~")
  }
  override def slot2(): Unit = {
  }
  override def slot3(): Unit ={
  }

}
