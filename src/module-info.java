module job_insights_ui {
	
	    requires java.desktop; // Nécessaire pour JFreeChart
	    requires javafx.graphics; // Pour les graphiques JavaFX
	    requires javafx.controls; // Pour les contrôles UI (comme Button, TextField, etc.)
	    requires org.jfree.jfreechart; // Pour JFreeChart (assurez-vous que la dépendance est bien configurée)

	    exports app;
}
