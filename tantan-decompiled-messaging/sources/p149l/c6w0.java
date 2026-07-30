package p149l;

import com.google.android.gms.internal.ads.zzfoi;
import com.google.android.gms.internal.ads.zzfol;
import com.google.android.gms.internal.ads.zzfom;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c6w0 {

    /* JADX INFO: renamed from: a */
    public final zzfom f79576a;

    /* JADX INFO: renamed from: b */
    public final zzfom f79577b;

    /* JADX INFO: renamed from: c */
    public final zzfoi f79578c;

    /* JADX INFO: renamed from: d */
    public final zzfol f79579d;

    public c6w0(zzfoi zzfoiVar, zzfol zzfolVar, zzfom zzfomVar, zzfom zzfomVar2, boolean z) {
        this.f79578c = zzfoiVar;
        this.f79579d = zzfolVar;
        this.f79576a = zzfomVar;
        if (zzfomVar2 == null) {
            this.f79577b = zzfom.NONE;
        } else {
            this.f79577b = zzfomVar2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static c6w0 m105510a(zzfoi zzfoiVar, zzfol zzfolVar, zzfom zzfomVar, zzfom zzfomVar2, boolean z) {
        n7w0.m158171b(zzfolVar, "ImpressionType is null");
        n7w0.m158171b(zzfomVar, "Impression owner is null");
        if (zzfomVar == zzfom.NONE) {
            ig3.m135964a("Impression owner is none");
            return null;
        }
        if (zzfoiVar == zzfoi.DEFINED_BY_JAVASCRIPT && zzfomVar == zzfom.NATIVE) {
            ig3.m135964a("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
            return null;
        }
        if (zzfolVar != zzfol.DEFINED_BY_JAVASCRIPT || zzfomVar != zzfom.NATIVE) {
            return new c6w0(zzfoiVar, zzfolVar, zzfomVar, zzfomVar2, true);
        }
        ig3.m135964a("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final JSONObject m105511b() {
        JSONObject jSONObject = new JSONObject();
        k7w0.m144708e(jSONObject, "impressionOwner", this.f79576a);
        k7w0.m144708e(jSONObject, "mediaEventsOwner", this.f79577b);
        k7w0.m144708e(jSONObject, "creativeType", this.f79578c);
        k7w0.m144708e(jSONObject, "impressionType", this.f79579d);
        k7w0.m144708e(jSONObject, "isolateVerificationScripts", Boolean.TRUE);
        return jSONObject;
    }
}
