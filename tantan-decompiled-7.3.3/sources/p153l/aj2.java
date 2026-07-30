package p153l;

/* JADX INFO: loaded from: classes.dex */
public abstract class aj2<T> implements s6c<T> {
    @Override // p153l.s6c
    /* JADX INFO: renamed from: b */
    public void mo98343b(i6c<T> i6cVar) {
        boolean zMo8236e = i6cVar.mo8236e();
        try {
            mo98347f(i6cVar);
        } finally {
            if (zMo8236e) {
                i6cVar.close();
            }
        }
    }

    @Override // p153l.s6c
    /* JADX INFO: renamed from: d */
    public void mo98345d(i6c<T> i6cVar) {
        try {
            mo98346e(i6cVar);
        } finally {
            i6cVar.close();
        }
    }

    /* JADX INFO: renamed from: e */
    public abstract void mo98346e(i6c<T> i6cVar);

    /* JADX INFO: renamed from: f */
    public abstract void mo98347f(i6c<T> i6cVar);

    @Override // p153l.s6c
    /* JADX INFO: renamed from: a */
    public void mo98342a(i6c<T> i6cVar) {
    }

    @Override // p153l.s6c
    /* JADX INFO: renamed from: c */
    public void mo98344c(i6c<T> i6cVar) {
    }
}
