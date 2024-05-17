package ma.projet.dao;

import java.util.List;

public interface IDao<T> {
    // Méthode permettant d'ajouter un objet de type T
    boolean create(T o);

    // Méthode permettant de supprimer un objet de type T
    boolean delete(T o);

    // Méthode permettant de modifier un objet de type T
    boolean update(T o);

    // Méthode permettant de renvoyer un objet de type T dont l'id est passé en paramètre
    T findById(int id);

    // Méthode permettant de renvoyer la liste des objets de type T
    List<T> findAll();
}
