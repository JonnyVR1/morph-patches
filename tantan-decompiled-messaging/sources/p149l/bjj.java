package p149l;

import androidx.datastore.preferences.protobuf.GeneratedMessageLite;

/* JADX INFO: loaded from: classes.dex */
public class bjj implements g5z {

    /* JADX INFO: renamed from: a */
    public static final bjj f75918a = new bjj();

    /* JADX INFO: renamed from: c */
    public static bjj m102182c() {
        return f75918a;
    }

    @Override // p149l.g5z
    /* JADX INFO: renamed from: a */
    public f5z mo102183a(Class<?> cls) {
        if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
            ig3.m135964a("Unsupported message type: ".concat(cls.getName()));
            return null;
        }
        try {
            return (f5z) GeneratedMessageLite.m1625q(cls.asSubclass(GeneratedMessageLite.class)).m1636j();
        } catch (Exception e) {
            pkq0.m170054a("Unable to get message info for ".concat(cls.getName()), e);
            return null;
        }
    }

    @Override // p149l.g5z
    /* JADX INFO: renamed from: b */
    public boolean mo102184b(Class<?> cls) {
        return GeneratedMessageLite.class.isAssignableFrom(cls);
    }
}
