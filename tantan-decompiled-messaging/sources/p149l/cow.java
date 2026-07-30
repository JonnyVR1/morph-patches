package p149l;

import android.content.Intent;

/* JADX INFO: loaded from: classes2.dex */
public class cow {

    /* JADX INFO: renamed from: b */
    private String f81871b;

    /* JADX INFO: renamed from: c */
    private String f81872c;

    /* JADX INFO: renamed from: d */
    private String f81873d;

    /* JADX INFO: renamed from: a */
    private boolean f81870a = false;

    /* JADX INFO: renamed from: e */
    private boolean f81874e = false;

    private cow() {
    }

    /* JADX INFO: renamed from: a */
    public static cow m108032a(Intent intent, String str) {
        cow cowVar = new cow();
        cowVar.f81874e = false;
        cowVar.f81873d = str;
        if (intent != null) {
            cowVar.f81871b = intent.getStringExtra("PARAM_SERVICE_ID");
            cowVar.f81872c = intent.getStringExtra("PARAM_WORKER_ID");
            cowVar.f81870a = true;
        }
        return cowVar;
    }

    /* JADX INFO: renamed from: b */
    public static cow m108033b(String str) {
        cow cowVar = new cow();
        cowVar.f81874e = true;
        cowVar.f81873d = str;
        cowVar.f81870a = false;
        return cowVar;
    }

    /* JADX INFO: renamed from: c */
    public String m108034c() {
        return this.f81871b;
    }

    /* JADX INFO: renamed from: d */
    public String m108035d() {
        return this.f81873d;
    }

    /* JADX INFO: renamed from: e */
    public String m108036e() {
        return this.f81872c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m108037f() {
        return this.f81870a;
    }

    /* JADX INFO: renamed from: g */
    public boolean m108038g() {
        return this.f81874e;
    }
}
