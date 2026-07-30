package p149l;

import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.ads.zzbrm;
import com.google.android.gms.internal.ads.zzead;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.Callable;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class t6v0 implements n6v0 {

    /* JADX INFO: renamed from: a */
    public final kau0 f168644a;

    /* JADX INFO: renamed from: b */
    public final rmw0 f168645b;

    /* JADX INFO: renamed from: c */
    public final qfu0 f168646c;

    /* JADX INFO: renamed from: d */
    public final mzv0 f168647d;

    /* JADX INFO: renamed from: e */
    public final viu0 f168648e;

    public t6v0(kau0 kau0Var, rmw0 rmw0Var, qfu0 qfu0Var, mzv0 mzv0Var, viu0 viu0Var) {
        this.f168644a = kau0Var;
        this.f168645b = rmw0Var;
        this.f168646c = qfu0Var;
        this.f168647d = mzv0Var;
        this.f168648e = viu0Var;
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: a */
    public final boolean mo120127a(vxv0 vxv0Var, kxv0 kxv0Var) {
        oxv0 oxv0Var = kxv0Var.f125221t;
        return (oxv0Var == null || oxv0Var.f146255c == null) ? false : true;
    }

    @Override // p149l.j3v0
    /* JADX INFO: renamed from: b */
    public final gnr mo120128b(final vxv0 vxv0Var, final kxv0 kxv0Var) {
        return jmw0.m142241n(jmw0.m142241n(this.f168647d.m157171a(), new rlw0() { // from class: l.q6v0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f152962a.m187389e(kxv0Var, (kiu0) obj);
            }
        }, this.f168645b), new rlw0() { // from class: l.r6v0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f157981a.m187390f(vxv0Var, kxv0Var, (JSONArray) obj);
            }
        }, this.f168645b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ccu0 m187387c(gnr gnrVar, gnr gnrVar2, vxv0 vxv0Var, kxv0 kxv0Var, JSONObject jSONObject) throws Exception {
        ocu0 ocu0Var = (ocu0) gnrVar.get();
        kiu0 kiu0Var = (kiu0) gnrVar2.get();
        pcu0 pcu0VarMo145184c = this.f168644a.mo145184c(new uqt0(vxv0Var, kxv0Var, null), new adu0(ocu0Var), new zau0(jSONObject, kiu0Var));
        pcu0VarMo145184c.mo168373j().m203243b();
        pcu0VarMo145184c.mo168374k().m126403a(kiu0Var);
        pcu0VarMo145184c.mo168372i().m96735a(ocu0Var.m163595f0());
        pcu0VarMo145184c.mo168375l().m193961a(this.f168648e);
        return pcu0VarMo145184c.mo126223h();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ gnr m187388d(kiu0 kiu0Var, JSONObject jSONObject) throws Exception {
        this.f168647d.m157172b(jmw0.m142235h(kiu0Var));
        if (jSONObject.optBoolean("success")) {
            return jmw0.m142235h(jSONObject.getJSONObject("json").getJSONArray("ads"));
        }
        throw new zzbrm("process json failed");
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ gnr m187389e(kxv0 kxv0Var, final kiu0 kiu0Var) throws Exception {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("isNonagon", true);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132447w8)).booleanValue() && PlatformVersion.isAtLeastR()) {
            jSONObject.put("skipDeepLinkValidation", true);
        }
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("response", kxv0Var.f125221t.f146255c);
        jSONObject2.put("sdk_params", jSONObject);
        return jmw0.m142241n(kiu0Var.m146139d("google.afma.nativeAds.preProcessJson", jSONObject2), new rlw0() { // from class: l.p6v0
            @Override // p149l.rlw0
            public final gnr zza(Object obj) {
                return this.f147447a.m187388d(kiu0Var, (JSONObject) obj);
            }
        }, this.f168645b);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ gnr m187390f(vxv0 vxv0Var, kxv0 kxv0Var, JSONArray jSONArray) throws Exception {
        if (jSONArray.length() == 0) {
            return jmw0.m142234g(new zzead(3));
        }
        if (vxv0Var.f183477a.f166831a.f115501k <= 1) {
            return jmw0.m142240m(m187391g(vxv0Var, kxv0Var, jSONArray.getJSONObject(0)), new yew0() { // from class: l.s6v0
                @Override // p149l.yew0
                public final Object apply(Object obj) {
                    return Collections.singletonList(jmw0.m142235h((ccu0) obj));
                }
            }, this.f168645b);
        }
        int length = jSONArray.length();
        this.f168647d.m157173c(Math.min(length, vxv0Var.f183477a.f166831a.f115501k));
        ArrayList arrayList = new ArrayList(vxv0Var.f183477a.f166831a.f115501k);
        for (int i = 0; i < vxv0Var.f183477a.f166831a.f115501k; i++) {
            if (i < length) {
                arrayList.add(m187391g(vxv0Var, kxv0Var, jSONArray.getJSONObject(i)));
            } else {
                arrayList.add(jmw0.m142234g(new zzead(3)));
            }
        }
        return jmw0.m142235h(arrayList);
    }

    /* JADX INFO: renamed from: g */
    public final gnr m187391g(final vxv0 vxv0Var, final kxv0 kxv0Var, final JSONObject jSONObject) {
        qfu0 qfu0Var = this.f168646c;
        final gnr gnrVarM157171a = this.f168647d.m157171a();
        final gnr gnrVarM174373a = qfu0Var.m174373a(vxv0Var, kxv0Var, jSONObject);
        return jmw0.m142230c(gnrVarM157171a, gnrVarM174373a).m137091a(new Callable() { // from class: l.o6v0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f142425a.m187387c(gnrVarM174373a, gnrVarM157171a, vxv0Var, kxv0Var, jSONObject);
            }
        }, this.f168645b);
    }
}
