package p153l;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class g3v0 implements upx0 {

    /* JADX INFO: renamed from: a */
    public final kqx0 f102027a;

    public g3v0(kqx0 kqx0Var) {
        this.f102027a = kqx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // p153l.kqx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        String strValueOf;
        o7w0 o7w0VarM218742a = ((z5u0) this.f102027a).m218742a();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168391m7)).booleanValue()) {
            String str = o7w0VarM218742a.f145318d.zzx;
            if (!TextUtils.isEmpty(str)) {
                try {
                    strValueOf = new JSONObject(str).getString("request_id");
                    if (TextUtils.isEmpty(strValueOf)) {
                        if (o7w0VarM218742a.f145318d.zzs != null) {
                            try {
                                strValueOf = new JSONObject(o7w0VarM218742a.f145318d.zzs.zza).getString("request_id");
                                if (TextUtils.isEmpty(strValueOf)) {
                                    strValueOf = String.valueOf(k6s0.m148572e().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                                }
                            } catch (JSONException unused) {
                            }
                        } else {
                            strValueOf = String.valueOf(k6s0.m148572e().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                        }
                    }
                } catch (JSONException unused2) {
                }
            } else if (o7w0VarM218742a.f145318d.zzs != null) {
                strValueOf = new JSONObject(o7w0VarM218742a.f145318d.zzs.zza).getString("request_id");
                if (TextUtils.isEmpty(strValueOf)) {
                    strValueOf = String.valueOf(k6s0.m148572e().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                }
            } else {
                strValueOf = String.valueOf(k6s0.m148572e().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
        } else {
            strValueOf = String.valueOf(k6s0.m148572e().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        cqx0.m111999b(strValueOf);
        return strValueOf;
    }
}
