def call(){
  try {
    bat """
    call venv\\Scripts\\activate
    pip install -r requirements.txt
    """
  } catch ( Exception e ) {
    error("Dependency installation failed with error : ${e.message}")
  }
}
