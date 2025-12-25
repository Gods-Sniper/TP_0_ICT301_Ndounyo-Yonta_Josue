public class DataImporter {
    private FileLoader loader;
    private StorageGateway gateway;

    public DataImporter(FileLoader loader, StorageGateway gateway) {
        this.loader = loader;
        this.gateway = gateway;
    }

    public void importFile(String file) {
        // utilise les abstractions
    }
}