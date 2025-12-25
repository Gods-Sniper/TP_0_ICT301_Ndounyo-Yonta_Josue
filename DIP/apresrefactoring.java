// Refactoring avec interfaces (basé sur le principe, pas de code exact dans le support pour cet exemple)
interface FileLoader {
    // Méthode abstraite
}

interface StorageGateway {
    // Méthode abstraite
}

class CsvFileLoader implements FileLoader {
    // Impl
}

class DataGateway implements StorageGateway {
    // Impl
}

class DataImporter {
    private FileLoader loader;
    private StorageGateway gateway;

    public DataImporter(FileLoader loader, StorageGateway gateway) {
        this.loader = loader;
        this.gateway = gateway;
    }

    public void importFile(String file) {
        // Utilise abstractions
    }
}