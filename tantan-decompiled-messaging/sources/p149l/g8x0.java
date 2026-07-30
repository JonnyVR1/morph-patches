package p149l;

/* JADX INFO: loaded from: classes6.dex */
public final class g8x0 {

    /* JADX INFO: renamed from: a */
    public static final e8x0 f101527a = new f8x0();

    /* JADX INFO: renamed from: b */
    public static final e8x0 f101528b;

    static {
        e8x0 e8x0Var = null;
        try {
            e8x0Var = (e8x0) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        f101528b = e8x0Var;
    }

    /* JADX INFO: renamed from: a */
    public static e8x0 m124773a() {
        e8x0 e8x0Var = f101528b;
        if (e8x0Var != null) {
            return e8x0Var;
        }
        qkq0.m175383a("Protobuf runtime is not correctly loaded.");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static e8x0 m124774b() {
        return f101527a;
    }
}
