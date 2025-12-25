// Implémentation basée sur le diagramme : DataImporter dépend de classes concrètes
class CsvFileLoader {
    // Logique pour charger fichier CSV
}

class DataGateway {
    // Logique pour stocker en BD
}

class DataImporter {
    private CsvFileLoader loader = new CsvFileLoader();
    private DataGateway gateway = new DataGateway();

    public void importFile(String file) {
        // Utilise loader et gateway directement
    }
}