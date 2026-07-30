package p149l;

import com.tencent.youtu.sdkkitframework.common.WeJson;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public final class kkg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f123556a;

    public kkg0(oqg0 oqg0Var) {
        this.f123556a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        try {
            String str5 = (String) this.f123556a.f145149l.get(new JSONObject(str4).getString("state"));
            if (str5 == null) {
                str5 = WeJson.EMPTY_MAP;
            }
            y6g0Var.success(str5);
        } catch (Exception unused) {
            y6g0Var.failure("{\"ret_code\":-1, \"ret_msg\":\"json serialize fail\"}");
        }
    }
}
