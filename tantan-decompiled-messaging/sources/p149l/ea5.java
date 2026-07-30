package p149l;

/* JADX INFO: loaded from: classes.dex */
public class ea5<T> extends AbstractC20588v7<fa5<T>> {
    public ea5(sc90<fa5<T>> sc90Var, xme0 xme0Var, huc0 huc0Var) {
        super(sc90Var, xme0Var, huc0Var);
    }

    /* JADX INFO: renamed from: H */
    public static <T> c5c<fa5<T>> m115409H(sc90<fa5<T>> sc90Var, xme0 xme0Var, huc0 huc0Var) {
        if (o6j.m162852d()) {
            o6j.m162850a("CloseableProducerToDataSourceAdapter#create");
        }
        ea5 ea5Var = new ea5(sc90Var, xme0Var, huc0Var);
        if (o6j.m162852d()) {
            o6j.m162851b();
        }
        return ea5Var;
    }

    @Override // com.facebook.datasource.AbstractDataSource
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public void mo8184g(fa5<T> fa5Var) {
        fa5.m120154v(fa5Var);
    }

    @Override // com.facebook.datasource.AbstractDataSource, p149l.c5c
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public fa5<T> getResult() {
        return fa5.m120152t((fa5) super.getResult());
    }

    @Override // p149l.AbstractC20588v7
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo115410F(fa5<T> fa5Var, int i, uc90 uc90Var) {
        super.mo115410F(fa5.m120152t(fa5Var), i, uc90Var);
    }
}
