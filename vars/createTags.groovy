def call(Map args){
  def version = createTag(args.base ?: "app")
  bat "echo ${version}"
}
private def createTag(String base) {
  if ( base.contains(" ") ){
    error("tag base contains spaces.")
  }
  def ts = new Date().format("yyyyMMddHHmmss")
  return "${base}.${ts}"
}
