package p153l;

import android.content.Intent;

/* JADX INFO: loaded from: classes7.dex */
public class brw {

    /* JADX INFO: renamed from: b */
    private String f78062b;

    /* JADX INFO: renamed from: c */
    private String f78063c;

    /* JADX INFO: renamed from: d */
    private String f78064d;

    /* JADX INFO: renamed from: a */
    private boolean f78061a = false;

    /* JADX INFO: renamed from: e */
    private boolean f78065e = false;

    private brw() {
    }

    /* JADX INFO: renamed from: a */
    public static brw m106162a(Intent intent, String str) {
        brw brwVar = new brw();
        brwVar.f78065e = false;
        brwVar.f78064d = str;
        if (intent != null) {
            brwVar.f78062b = intent.getStringExtra("PARAM_SERVICE_ID");
            brwVar.f78063c = intent.getStringExtra("PARAM_WORKER_ID");
            brwVar.f78061a = true;
        }
        return brwVar;
    }

    /* JADX INFO: renamed from: b */
    public static brw m106163b(String str) {
        brw brwVar = new brw();
        brwVar.f78065e = true;
        brwVar.f78064d = str;
        brwVar.f78061a = false;
        return brwVar;
    }

    /* JADX INFO: renamed from: c */
    public String m106164c() {
        return this.f78062b;
    }

    /* JADX INFO: renamed from: d */
    public String m106165d() {
        return this.f78064d;
    }

    /* JADX INFO: renamed from: e */
    public String m106166e() {
        return this.f78063c;
    }

    /* JADX INFO: renamed from: f */
    public boolean m106167f() {
        return this.f78061a;
    }

    /* JADX INFO: renamed from: g */
    public boolean m106168g() {
        return this.f78065e;
    }
}
