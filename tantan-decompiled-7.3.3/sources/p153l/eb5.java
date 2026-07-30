package p153l;

/* JADX INFO: loaded from: classes.dex */
public class eb5<T> extends AbstractC19532q7<fb5<T>> {
    public eb5(wk90<fb5<T>> wk90Var, eve0 eve0Var, k2d0 k2d0Var) {
        super(wk90Var, eve0Var, k2d0Var);
    }

    /* JADX INFO: renamed from: H */
    public static <T> i6c<fb5<T>> m120151H(wk90<fb5<T>> wk90Var, eve0 eve0Var, k2d0 k2d0Var) {
        if (i9j.m139099d()) {
            i9j.m139097a("CloseableProducerToDataSourceAdapter#create");
        }
        eb5 eb5Var = new eb5(wk90Var, eve0Var, k2d0Var);
        if (i9j.m139099d()) {
            i9j.m139098b();
        }
        return eb5Var;
    }

    @Override // com.facebook.datasource.AbstractDataSource
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo8238g(fb5<T> fb5Var) {
        fb5.m124874v(fb5Var);
    }

    @Override // com.facebook.datasource.AbstractDataSource, p153l.i6c
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public fb5<T> getResult() {
        return fb5.m124872t((fb5) super.getResult());
    }

    @Override // p153l.AbstractC19532q7
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo120152F(fb5<T> fb5Var, int i, yk90 yk90Var) {
        super.mo120152F(fb5.m124872t(fb5Var), i, yk90Var);
    }
}
