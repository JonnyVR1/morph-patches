package p149l;

/* JADX INFO: loaded from: classes.dex */
public abstract class ti2<T> implements m5c<T> {
    @Override // p149l.m5c
    /* JADX INFO: renamed from: b */
    public void mo153133b(c5c<T> c5cVar) {
        boolean zMo8182e = c5cVar.mo8182e();
        try {
            mo96183f(c5cVar);
        } finally {
            if (zMo8182e) {
                c5cVar.close();
            }
        }
    }

    @Override // p149l.m5c
    /* JADX INFO: renamed from: d */
    public void mo153135d(c5c<T> c5cVar) {
        try {
            mo102384e(c5cVar);
        } finally {
            c5cVar.close();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo102384e(c5c<T> c5cVar);

    /* JADX INFO: renamed from: f */
    public abstract void mo96183f(c5c<T> c5cVar);

    @Override // p149l.m5c
    /* JADX INFO: renamed from: a */
    public void mo129617a(c5c<T> c5cVar) {
    }

    @Override // p149l.m5c
    /* JADX INFO: renamed from: c */
    public void mo153134c(c5c<T> c5cVar) {
    }
}
