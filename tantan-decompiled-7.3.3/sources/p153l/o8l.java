package p153l;

/* JADX INFO: loaded from: classes11.dex */
public abstract class o8l extends AbstractC18774n4 {

    /* JADX INFO: renamed from: a */
    public String f145424a;

    /* JADX INFO: renamed from: b */
    public boolean f145425b;

    public o8l(String str, boolean z) {
        this.f145424a = str;
        this.f145425b = z;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean mo38500a(p8l.C19323a c19323a) {
        boolean zMo130140d = mo130140d(c19323a);
        if (zMo130140d && spl0.m187354F()) {
            pk50.m172568j().m172574f().m181664b0(this.f145424a, 0, this.f145425b);
        }
        return Boolean.valueOf(zMo130140d);
    }

    /* JADX INFO: renamed from: d */
    public abstract boolean mo130140d(p8l.C19323a c19323a);

    @Override // p153l.g6m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(p8l.C19323a c19323a) {
        if (!mo130142f(c19323a)) {
            return false;
        }
        if (spl0.m187354F()) {
            return pk50.m172568j().m172574f().m181649M(this.f145424a, this.f145425b);
        }
        return true;
    }

    /* JADX INFO: renamed from: f */
    public abstract boolean mo130142f(p8l.C19323a c19323a);
}
