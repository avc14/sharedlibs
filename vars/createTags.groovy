def call(Map args){
  def version = createTag(arg.base ?: "app")
  bat "echo %version%"
}
private def createTag(String base) {
  def ts = new Date().format("yyyyMMddHHmmss")
  return "${base}.${ts}"
}
