def call(Map args = [:]) {
  def python = args.get("python","python")
  def requirements = args.get("requirements","requirements.txt")

  if (!fileExists(requirements)) {
    error "Requirements file is not present"
  }

  if (!fileExists("venv/Scripts/activate.bat") {
    bat "${python} -m venv venv"
  }
      
  bat """
  ${python} -m venv venv
  call venv/Scripts/activate
  pip install -r ${requirements}
  """
}
