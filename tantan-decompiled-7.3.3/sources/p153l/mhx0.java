package p153l;

/* JADX INFO: loaded from: classes6.dex */
public final class mhx0 {

    /* JADX INFO: renamed from: a */
    public static final khx0 f136897a = new lhx0();

    /* JADX INFO: renamed from: b */
    public static final khx0 f136898b;

    static {
        khx0 khx0Var = null;
        try {
            khx0Var = (khx0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f136898b = khx0Var;
    }

    /* JADX INFO: renamed from: a */
    public static khx0 m158439a() {
        khx0 khx0Var = f136898b;
        if (khx0Var != null) {
            return khx0Var;
        }
        wtq0.m207906a("Protobuf runtime is not correctly loaded.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static khx0 m158440b() {
        return f136897a;
    }
}
