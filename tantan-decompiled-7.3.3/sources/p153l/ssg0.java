package p153l;

import com.tencent.youtu.sdkkitframework.common.WeJson;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class ssg0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f170456a;

    public ssg0(wyg0 wyg0Var) {
        this.f170456a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        try {
            String str5 = (String) this.f170456a.f191651l.get(new JSONObject(str4).getString("state"));
            if (str5 == null) {
                str5 = WeJson.EMPTY_MAP;
            }
            gfg0Var.success(str5);
        } catch (Exception unused) {
            gfg0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
        }
    }
}
