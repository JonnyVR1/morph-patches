package p153l;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes.dex */
public class ulj implements dez {

    /* JADX INFO: renamed from: a */
    public static final ulj f179514a = new ulj();

    /* JADX INFO: renamed from: c */
    public static ulj m196557c() {
        return f179514a;
    }

    @Override // p153l.dez
    /* JADX INFO: renamed from: a */
    public cez mo115488a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            wg3.m206174a("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (cez) GeneratedMessageLite.m1626q(cls.asSubclass(GeneratedMessageLite.class)).m1637j();
        } catch (Exception e) {
            vtq0.m202761a("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // p153l.dez
    /* JADX INFO: renamed from: b */
    public boolean mo115489b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
