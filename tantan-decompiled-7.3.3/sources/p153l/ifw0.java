package p153l;

import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzfol;
import com.google.android.gms.internal.ads.zzfom;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ifw0 {

    /* JADX INFO: renamed from: a */
    public final zzfom f114714a;

    /* JADX INFO: renamed from: b */
    public final zzfom f114715b;

    /* JADX INFO: renamed from: c */
    public final zzfoi f114716c;

    /* JADX INFO: renamed from: d */
    public final zzfol f114717d;

    public ifw0(zzfoi zzfoiVar, zzfol zzfolVar, zzfom zzfomVar, zzfom zzfomVar2, boolean z) {
        this.f114716c = zzfoiVar;
        this.f114717d = zzfolVar;
        this.f114714a = zzfomVar;
        if (zzfomVar2 == null) {
            this.f114715b = zzfom.NONE;
        } else {
            this.f114715b = zzfomVar2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static ifw0 m139752a(zzfoi zzfoiVar, zzfol zzfolVar, zzfom zzfomVar, zzfom zzfomVar2, boolean z) {
        tgw0.m191133b(zzfolVar, "ImpressionType is null");
        tgw0.m191133b(zzfomVar, "Impression owner is null");
        if (zzfomVar == zzfom.NONE) {
            wg3.m206174a("Impression owner is none");
            return null;
        }
        if (zzfoiVar == zzfoi.DEFINED_BY_JAVASCRIPT && zzfomVar == zzfom.NATIVE) {
            wg3.m206174a("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            return null;
        }
        if (zzfolVar != zzfol.DEFINED_BY_JAVASCRIPT || zzfomVar != zzfom.NATIVE) {
            return new ifw0(zzfoiVar, zzfolVar, zzfomVar, zzfomVar2, true);
        }
        wg3.m206174a("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m139753b() {
        JSONObject jSONObject = new JSONObject();
        qgw0.m176525e(jSONObject, "impressionOwner", this.f114714a);
        qgw0.m176525e(jSONObject, "mediaEventsOwner", this.f114715b);
        qgw0.m176525e(jSONObject, "creativeType", this.f114716c);
        qgw0.m176525e(jSONObject, "impressionType", this.f114717d);
        qgw0.m176525e(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
