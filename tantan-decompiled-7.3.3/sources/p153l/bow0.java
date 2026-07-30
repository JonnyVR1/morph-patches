package p153l;

/* JADX INFO: loaded from: classes6.dex */
public abstract class bow0 implements uow0 {
    /* JADX INFO: renamed from: b */
    public static bow0 m105711b(char c) {
        return new ynw0(c);
    }

    /* JADX INFO: renamed from: a */
    public abstract boolean mo99233a(char c);

    @Override // p153l.uow0
    @Deprecated
    public final /* synthetic */ boolean zza(Object obj) {
        return mo99233a(((Character) obj).charValue());
    }
}
