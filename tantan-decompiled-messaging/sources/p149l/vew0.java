package p149l;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vew0 implements ofw0 {
    /* JADX INFO: renamed from: b */
    public static vew0 m198261b(char c) {
        return new sew0(c);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo183725a(char c);

    @Override // p149l.ofw0
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return mo183725a(((Character) obj).charValue());
    }
}
