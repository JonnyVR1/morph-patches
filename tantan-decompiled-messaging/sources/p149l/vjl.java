package p149l;

import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public abstract class vjl implements x74 {

    /* JADX INFO: renamed from: a */
    private t500 f181738a;

    /* JADX INFO: renamed from: a */
    public abstract void m198677a(t500 t500Var, IOException iOException);

    /* JADX INFO: renamed from: b */
    public abstract void m198678b(t500 t500Var, u500 u500Var) throws IOException;

    @Override // p149l.x74
    public void onFailure(sx3 sx3Var, IOException iOException) {
        m198677a(this.f181738a, iOException);
    }

    @Override // p149l.x74
    public void onResponse(sx3 sx3Var, exc0 exc0Var) throws IOException {
        m198678b(this.f181738a, new u500(exc0Var));
    }
}
