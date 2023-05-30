def call(Map config = [:]) {
    bat "robocopy E:\ptc\Windchill_11.2\HTTPServer F:\apache_backup /MT /MIR"
}
