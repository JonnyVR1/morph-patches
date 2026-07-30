package p153l;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes8.dex */
public class bfj {

    /* JADX INFO: renamed from: a */
    private zej f76493a;

    /* JADX INFO: renamed from: b */
    private z5m f76494b;

    public bfj(z5m z5mVar, zej zejVar) {
        this.f76494b = z5mVar;
        this.f76493a = zejVar;
        if (zejVar != null) {
            zejVar.m219496T1(false);
        }
    }

    /* JADX INFO: renamed from: a */
    public gfj m103901a() {
        return this.f76494b.getInput();
    }

    /* JADX INFO: renamed from: b */
    public zej m103902b() {
        return this.f76493a;
    }

    /* JADX INFO: renamed from: c */
    public z5m m103903c() {
        return this.f76494b;
    }

    /* JADX INFO: renamed from: d */
    public void m103904d() {
        this.f76493a = null;
        this.f76494b = null;
    }

    /* JADX INFO: renamed from: e */
    public void m103905e(@NonNull zej zejVar) {
        this.f76493a = zejVar;
        if (zejVar != null) {
            zejVar.m219496T1(false);
        }
    }
}
