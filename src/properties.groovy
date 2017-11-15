def properties

def resolve() {
    def properties = new Properties()
    loadPropertiesFile("global.properties", properties)

    properties
}

def loadPropertiesFile(String propertiesFile, Properties properties) {
    def propertiesExists = fileExists file: propertiesFile

    if (propertiesExists) {
        echo "Reading ${propertiesFile}..."
        def propertiesContents = readFile file: propertiesFile, encoding: 'utf-8'
        properties.load( new StringReader(propertiesContents) )
    }
}

