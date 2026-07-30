package p153l;

import org.json.JSONException;
import org.json.JSONObject;
import tech.sud.runtime.p141a.InterfaceC22515a;

/* JADX INFO: loaded from: classes.dex */
public final class ihg0 implements InterfaceC22515a.a {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ pgg0 f114938a;

    public ihg0(pgg0 pgg0Var) {
        this.f114938a = pgg0Var;
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a.a
    /* JADX INFO: renamed from: a */
    public final void mo106566a(String str) {
        try {
            int i = new JSONObject(str).getInt("obj");
            pgg0 pgg0Var = this.f114938a;
            oxg0 oxg0Var = (oxg0) pgg0Var.f152267d.get(i);
            if (oxg0Var == null) {
                ysg0.m217257c("WXGame", String.format("objectDestroy: obj %d not found", Integer.valueOf(i)));
            } else {
                pgg0Var.f152267d.remove(i);
                oxg0Var.mo112983d();
            }
        } catch (JSONException e) {
            ysg0.m217257c("WXGame", "ObjDestroy:" + e.getMessage());
        }
    }
}
