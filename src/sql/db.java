@Entity
@Table(name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    @Column(name = "correo_electronico")
    private String correoElectronico;
    private String contrasena;

    // Constructor, getters y setters
}

@Entity
@Table(name = "recetas")
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String titulo;
    private String descripcion;
    @Column(name = "tiempo_preparacion")
    private int tiempoPreparacion;
    @Column(name = "tiempo_coccion")
    private int tiempoCoccion;
    private int porciones;
    private String dificultad;
    private String imagen;
    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
    @OneToMany(mappedBy = "receta")
    private List<RecetaIngrediente> recetaIngredientes;
    @OneToMany(mappedBy = "receta")
    private List<Paso> pasos;

    // Constructor, getters y setters
}

@Entity
@Table(name = "ingredientes")
public class Ingrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    private String cantidad;
    @OneToMany(mappedBy = "ingrediente")
    private List<RecetaIngrediente> recetaIngredientes;

    // Constructor, getters y setters
}

@Entity
@Table(name = "recetas_ingredientes")
public class RecetaIngrediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne
    @JoinColumn(name = "receta_id")
    private Receta receta;
    @ManyToOne
    @JoinColumn(name = "ingrediente_id")
    private Ingrediente ingrediente;

    // Constructor, getters y setters
}

@Entity
@Table(name = "pasos")
public class Paso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String descripcion;
    private int orden;
    @ManyToOne
    @JoinColumn(name = "receta_id")
    private Receta receta;

    // Constructor, getters y setters
}