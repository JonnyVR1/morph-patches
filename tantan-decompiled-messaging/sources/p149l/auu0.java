package p149l;

import android.text.TextUtils;
import com.google.android.gms.common.api.Api;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class auu0 implements ogx0 {

    /* JADX INFO: renamed from: a */
    public final ehx0 f71863a;

    public auu0(ehx0 ehx0Var) {
        this.f71863a = ehx0Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0051  */
    /* JADX WARN: Code duplicated, block: B:18:0x003c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    @Override // p149l.ehx0
    public final /* bridge */ /* synthetic */ Object zzb() {
        String strValueOf;
        iyv0 iyv0VarM190906a = ((twt0) this.f71863a).m190906a();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132320m7)).booleanValue()) {
            String str = iyv0VarM190906a.f115494d.zzx;
            if (!TextUtils.isEmpty(str)) {
                try {
                    strValueOf = new JSONObject(str).getString("request_id");
                    if (TextUtils.isEmpty(strValueOf)) {
                        if (iyv0VarM190906a.f115494d.zzs != null) {
                            try {
                                strValueOf = new JSONObject(iyv0VarM190906a.f115494d.zzs.zza).getString("request_id");
                                if (TextUtils.isEmpty(strValueOf)) {
                                    strValueOf = String.valueOf(exr0.m118706e().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                                }
                            } catch (JSONException unused) {
                            }
                        } else {
                            strValueOf = String.valueOf(exr0.m118706e().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                        }
                    }
                } catch (JSONException unused2) {
                }
            } else if (iyv0VarM190906a.f115494d.zzs != null) {
                strValueOf = new JSONObject(iyv0VarM190906a.f115494d.zzs.zza).getString("request_id");
                if (TextUtils.isEmpty(strValueOf)) {
                    strValueOf = String.valueOf(exr0.m118706e().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
                }
            } else {
                strValueOf = String.valueOf(exr0.m118706e().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
            }
        } else {
            strValueOf = String.valueOf(exr0.m118706e().nextInt() & Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
        wgx0.m203089b(strValueOf);
        return strValueOf;
    }
}
