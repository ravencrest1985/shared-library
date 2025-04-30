def call(Map config = [:]) {
    bat """
    robocopy E:\\Windchill\\HTTPServer E:\\apache_backup /MT /MIR"
    IF ERRORLEVEL 1 (echo ROBOCOPY STATUS = OK) ELSE (echo ROBOCOPY STATUS = FAILURE)
    exit /B 0
    """
}
