package p149l;

import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.runtime.p137a.InterfaceC22400a;

/* JADX INFO: loaded from: classes.dex */
public final class a9g0 implements InterfaceC22400a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ h8g0 f68170a;

    public a9g0(h8g0 h8g0Var) {
        this.f68170a = h8g0Var;
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a.a
    /* JADX INFO: renamed from: a */
    public final void mo95422a(String str) {
        try {
            int i = new JSONObject(str).getInt("obj");
            h8g0 h8g0Var = this.f68170a;
            gpg0 gpg0Var = (gpg0) h8g0Var.f106413d.get(i);
            if (gpg0Var == null) {
                qkg0.m175377c("WXGame", String.format("objectDestroy: obj %d not found", Integer.valueOf(i)));
            } else {
                h8g0Var.f106413d.remove(i);
                gpg0Var.mo110228d();
            }
        } catch (JSONException e) {
            qkg0.m175377c("WXGame", "ObjDestroy:" + e.getMessage());
        }
    }
}
