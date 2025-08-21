def call(){
  try {
    bat """
    python -m venv venv
    call venv/Scripts/activate
    pip install -r requirements.txt
    """
  } catch ( Exception e ) {
    error("Dependency installation failed with error : ${e.message}")
  }
}
