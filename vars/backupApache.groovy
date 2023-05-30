def call(Map config = [:]) {
    bat """
    robocopy E:\\ptc\\Windchill_11.2\\HTTPServer F:\\apache_backup /MT /MIR"
    IF ERRORLEVEL 1 (echo ROBOCOPY STATUS = OK) ELSE (echo ROBOCOPY STATUS = FAILURE)
    exit /B 0
    """
}
