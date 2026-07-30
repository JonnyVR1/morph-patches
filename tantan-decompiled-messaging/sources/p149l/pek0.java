package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p046p1.mobile.putong.app.media.MediaFrontService;
import com.tencent.could.component.common.p079ai.eventreport.entry.NetWorkParam;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import com.tencent.liteav.TXLiteAVCode;
import com.tencent.mmkv.MMKV;
import com.tencent.ugc.TXRecordCommon;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class pek0 {

    /* JADX INFO: renamed from: a */
    private boolean f148454a;

    /* JADX INFO: renamed from: l.pek0$b */
    public static class C19194b {

        /* JADX INFO: renamed from: a */
        private static pek0 f148455a = new pek0();
    }

    private pek0() {
        this.f148454a = true;
    }

    /* JADX INFO: renamed from: a */
    public static pek0 m168517a() {
        return C19194b.f148455a;
    }

    /* JADX INFO: renamed from: d */
    private void m168518d(JSONObject jSONObject, ejx ejxVar) {
        ku5 ku5Var;
        if (jSONObject != null) {
            try {
                ku5Var = (ku5) jod0.m142454b().m142455a(jSONObject.toString(), ku5.class);
            } catch (Exception e) {
                eyx.m118802c().m118808g("safeJsonParse fromJson error" + e.toString());
                ku5Var = null;
            }
            if (ku5Var != null) {
                ejxVar.f91848a = 1;
                ejxVar.f91851b = 1;
                if (ku5Var.m147239a() != null) {
                    ejxVar.f91860e = ku5Var.m147239a().m193372a();
                    ejxVar.f91898q1 = ku5Var.m147239a().m193373b();
                }
                if (ku5Var.m147242d() != null && ku5Var.m147242d().m96060j() != null) {
                    ejxVar.f91806F = ku5Var.m147242d().m96060j().m198264a();
                    ejxVar.f91808G = ku5Var.m147242d().m96060j().m198265b();
                    ejxVar.f91810H = ku5Var.m147242d().m96060j().m198272i();
                    ejxVar.f91800C = ku5Var.m147242d().m96060j().m198268e();
                    ejxVar.f91802D = ku5Var.m147242d().m96060j().m198267d();
                    ejxVar.f91816K = ku5Var.m147242d().m96060j().m198271h();
                    ejxVar.f91818L = ku5Var.m147242d().m96060j().m198270g();
                    ejxVar.f91820M = ku5Var.m147242d().m96060j().m198269f();
                    ejxVar.f91900r0 = ku5Var.m147242d().m96060j().m198266c();
                }
                if (ku5Var.m147242d() != null) {
                    ejxVar.f91849a0 = ku5Var.m147242d().m96057g();
                    ejxVar.f91852b0 = ku5Var.m147242d().m96056f();
                    ejxVar.f91897q0 = ku5Var.m147242d().m96059i();
                    ejxVar.f91901s = ku5Var.m147242d().m96062l();
                    if (ku5Var.m147242d().m96052b() != null && ku5Var.m147242d().m96052b().size() >= 2) {
                        ejxVar.f91855c0 = ku5Var.m147242d().m96052b().get(0).intValue();
                        ejxVar.f91858d0 = ku5Var.m147242d().m96052b().get(1).intValue();
                    }
                    if (ku5Var.m147242d().m96068r() != null && ku5Var.m147242d().m96068r().size() >= 2) {
                        ejxVar.f91861e0 = ku5Var.m147242d().m96068r().get(0).intValue();
                        ejxVar.f91864f0 = ku5Var.m147242d().m96068r().get(1).intValue();
                    }
                    ejxVar.f91867g0 = ku5Var.m147242d().m96065o();
                    ejxVar.f91870h0 = ku5Var.m147242d().m96067q();
                    ejxVar.f91876j0 = ku5Var.m147242d().m96051a();
                    ejxVar.f91805E0 = ku5Var.m147242d().m96063m();
                    ejxVar.f91873i0 = ku5Var.m147242d().m96064n();
                    ejxVar.f91879k0 = ku5Var.m147242d().m96053c();
                    ejxVar.f91882l0 = ku5Var.m147242d().m96069s();
                    ejxVar.f91885m0 = ku5Var.m147242d().m96055e();
                    ejxVar.f91888n0 = ku5Var.m147242d().m96054d();
                    if (ku5Var.m147242d().m96070t() != null) {
                        ejxVar.f91891o0.addAll(ku5Var.m147242d().m96070t());
                    }
                }
                if (ku5Var.m147242d() != null && ku5Var.m147242d().m96066p() != null) {
                    int iM147086c = ku5Var.m147242d().m96066p().m147086c();
                    ejxVar.f91902s0 = iM147086c;
                    if (iM147086c <= 0) {
                        ejxVar.f91902s0 = 1000;
                    }
                    int iM147087d = ku5Var.m147242d().m96066p().m147087d();
                    ejxVar.f91904t0 = iM147087d;
                    if (iM147087d <= 0) {
                        ejxVar.f91904t0 = 200;
                    }
                    int iM147090g = ku5Var.m147242d().m96066p().m147090g();
                    ejxVar.f91906u0 = iM147090g;
                    if (iM147090g <= 0) {
                        ejxVar.f91906u0 = 5;
                    }
                    int iM147091h = ku5Var.m147242d().m96066p().m147091h();
                    ejxVar.f91908v0 = iM147091h;
                    if (iM147091h <= 0) {
                        ejxVar.f91908v0 = 15;
                    }
                    int iM147085b = ku5Var.m147242d().m96066p().m147085b();
                    ejxVar.f91916z0 = iM147085b;
                    if (iM147085b <= 0) {
                        ejxVar.f91916z0 = 1000;
                    }
                    ejxVar.f91914y0 = ku5Var.m147242d().m96066p().m147092i();
                    int iM147089f = ku5Var.m147242d().m96066p().m147089f();
                    ejxVar.f91797A0 = iM147089f;
                    if (iM147089f <= 0) {
                        ejxVar.f91797A0 = 200;
                    }
                    int iM147088e = ku5Var.m147242d().m96066p().m147088e();
                    ejxVar.f91910w0 = iM147088e;
                    if (iM147088e <= 0) {
                        ejxVar.f91910w0 = 500;
                    }
                    int iM147093j = ku5Var.m147242d().m96066p().m147093j();
                    ejxVar.f91912x0 = iM147093j;
                    if (iM147093j <= 0) {
                        ejxVar.f91912x0 = 200;
                    }
                    double dM147084a = ku5Var.m147242d().m96066p().m147084a();
                    ejxVar.f91799B0 = dM147084a;
                    if (dM147084a <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                        ejxVar.f91799B0 = 0.8d;
                    }
                    for (lsk0 lsk0Var : ku5Var.m147242d().m96066p().m147094k()) {
                        ejxVar.f91801C0.add(new fjx.C16863b(lsk0Var.vbrMin * 1000, lsk0Var.f129881w, lsk0Var.f129880h));
                    }
                }
                if (ku5Var.m147242d() != null && ku5Var.m147242d().m96061k() != null) {
                    ejxVar.f91803D0.m121828o(ku5Var.m147242d().m96061k().m157119a());
                    ejxVar.f91803D0.m121834u(ku5Var.m147242d().m96061k().m157120b());
                    ejxVar.f91803D0.m121836w(ku5Var.m147242d().m96061k().m157122d());
                    ejxVar.f91803D0.m121838y(ku5Var.m147242d().m96061k().m157123e());
                    ejxVar.f91803D0.m121839z(ku5Var.m147242d().m96061k().m157124f());
                    ejxVar.f91803D0.m121837x(ku5Var.m147242d().m96061k().m157130l());
                    ejxVar.f91803D0.m121813B(ku5Var.m147242d().m96061k().m157132n());
                    ejxVar.f91803D0.m121812A(ku5Var.m147242d().m96061k().m157131m());
                    ejxVar.f91803D0.m121830q(ku5Var.m147242d().m96061k().m157126h());
                    ejxVar.f91803D0.m121831r(ku5Var.m147242d().m96061k().m157127i());
                    ejxVar.f91803D0.m121829p(ku5Var.m147242d().m96061k().m157125g());
                    ejxVar.f91803D0.m121833t(ku5Var.m147242d().m96061k().m157129k());
                    ejxVar.f91803D0.m121832s(ku5Var.m147242d().m96061k().m157128j());
                    ejxVar.f91803D0.m121835v(ku5Var.m147242d().m96061k().m157121c());
                }
                if (ku5Var.m147242d() != null && ku5Var.m147242d().m96058h() != null) {
                    ejxVar.f91824O = ku5Var.m147242d().m96058h().m143216e();
                    ejxVar.f91826P = ku5Var.m147242d().m96058h().m143218g();
                    ejxVar.f91828Q = ku5Var.m147242d().m96058h().m143217f();
                    ejxVar.f91830R = ku5Var.m147242d().m96058h().m143215d();
                    ejxVar.f91834T = ku5Var.m147242d().m96058h().m143212a();
                    ejxVar.f91836U = ku5Var.m147242d().m96058h().m143214c().enable;
                    ejxVar.f91838V = ku5Var.m147242d().m96058h().m143214c().lutUrl;
                    ejxVar.f91840W = ku5Var.m147242d().m96058h().m143213b().lut;
                }
                if (ku5Var.m147240b() != null) {
                    if (ku5Var.m147240b().m181463c() != null && ku5Var.m147240b().m181463c().size() >= 2) {
                        ejxVar.f91878k = ku5Var.m147240b().m181463c().get(0).intValue();
                        ejxVar.f91881l = ku5Var.m147240b().m181463c().get(1).intValue();
                    }
                    if (ku5Var.m147240b().m181462b() != null && ku5Var.m147240b().m181462b().size() >= 2) {
                        ejxVar.f91884m = ku5Var.m147240b().m181462b().get(0).intValue();
                        ejxVar.f91887n = ku5Var.m147240b().m181462b().get(1).intValue();
                    }
                    if (ku5Var.m147240b().m181461a() != null && ku5Var.m147240b().m181461a().size() >= 5) {
                        ejxVar.f91863f = ku5Var.m147240b().m181461a().get(0).intValue();
                        ejxVar.f91866g = ku5Var.m147240b().m181461a().get(1).intValue();
                        ejxVar.f91869h = ku5Var.m147240b().m181461a().get(2).intValue();
                        ejxVar.f91872i = ku5Var.m147240b().m181461a().get(3).intValue();
                        ejxVar.f91875j = ku5Var.m147240b().m181461a().get(4).intValue();
                    }
                }
                if (ku5Var.m147241c() != null) {
                    if (ku5Var.m147241c().m191138a() != null && ku5Var.m147241c().m191138a().size() >= 20) {
                        ejxVar.f91807F0 = ku5Var.m147241c().m191138a().get(0).intValue();
                        ejxVar.f91809G0 = ku5Var.m147241c().m191138a().get(1).intValue();
                        ejxVar.f91811H0 = ku5Var.m147241c().m191138a().get(2).intValue();
                        ejxVar.f91813I0 = ku5Var.m147241c().m191138a().get(3).intValue();
                        ejxVar.f91815J0 = ku5Var.m147241c().m191138a().get(4).intValue();
                        ejxVar.f91817K0 = ku5Var.m147241c().m191138a().get(5).intValue();
                        ejxVar.f91819L0 = ku5Var.m147241c().m191138a().get(6).intValue();
                        ejxVar.f91821M0 = ku5Var.m147241c().m191138a().get(7).intValue();
                        ejxVar.f91823N0 = ku5Var.m147241c().m191138a().get(8).intValue();
                        ejxVar.f91825O0 = ku5Var.m147241c().m191138a().get(9).intValue();
                        ejxVar.f91827P0 = ku5Var.m147241c().m191138a().get(10).floatValue();
                        ejxVar.f91829Q0 = ku5Var.m147241c().m191138a().get(11).intValue();
                        ejxVar.f91831R0 = ku5Var.m147241c().m191138a().get(12).floatValue();
                        ejxVar.f91833S0 = ku5Var.m147241c().m191138a().get(17).intValue();
                        ejxVar.f91835T0 = ku5Var.m147241c().m191138a().get(19).intValue();
                    }
                    if (ku5Var.m147241c().m191140c() != null && ku5Var.m147241c().m191140c().size() >= 10) {
                        ejxVar.f91841W0 = ku5Var.m147241c().m191140c().get(0).intValue();
                        ejxVar.f91843X0 = ku5Var.m147241c().m191140c().get(1).intValue();
                        ejxVar.f91845Y0 = ku5Var.m147241c().m191140c().get(2).intValue();
                        ejxVar.f91847Z0 = ku5Var.m147241c().m191140c().get(3).intValue();
                        ejxVar.f91850a1 = ku5Var.m147241c().m191140c().get(4).floatValue();
                        ejxVar.f91853b1 = ku5Var.m147241c().m191140c().get(5).intValue();
                        ejxVar.f91856c1 = ku5Var.m147241c().m191140c().get(6).intValue();
                        ejxVar.f91859d1 = ku5Var.m147241c().m191140c().get(7).intValue();
                        ejxVar.f91862e1 = ku5Var.m147241c().m191140c().get(8).intValue();
                        ejxVar.f91865f1 = ku5Var.m147241c().m191140c().get(9).intValue();
                    }
                    if (ku5Var.m147241c() != null && ku5Var.m147241c().m191139b() != null) {
                        ejxVar.f91839V0 = ku5Var.m147241c().m191139b().m186748a();
                    }
                    if (ku5Var.m147243e() != null) {
                        ejxVar.f91886m1 = ku5Var.m147243e().m202446b();
                        ejxVar.f91889n1 = ku5Var.m147243e().m202445a();
                        Map<String, Integer> mapM202448d = ku5Var.m147243e().m202448d();
                        ejxVar.f91895p1 = mapM202448d;
                        if (mapM202448d == null) {
                            ejxVar.f91895p1 = new HashMap();
                        }
                        ejxVar.f91892o1 = ku5Var.m147243e().m202447c();
                    }
                }
            }
        }
    }

    /* JADX WARN: Failed to calculate best type for var: r0v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v1 ??, new type: org.json.JSONArray
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r0v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r0v1 ??, new type: org.json.JSONArray
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: org.json.JSONObject
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 ??, new type: org.json.JSONObject
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v1 org.json.JSONObject, new type: org.json.JSONObject
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.applyWithWiderIgnSame(TypeUpdate.java:73)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.applyResolvedVars(TypeSearch.java:100)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:76)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 5 more
     */
    /* JADX INFO: renamed from: b */
    public ejx m168519b(String str) {
        JSONArray jSONArrayOptJSONArray;
        ejx ejxVar = new ejx();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("pull_comm") && (jSONArrayOptJSONArray = jSONObject.optJSONArray("pull_comm")) != null) {
                    ejxVar.f91807F0 = jSONArrayOptJSONArray.optInt(0, 0);
                    ejxVar.f91809G0 = jSONArrayOptJSONArray.optInt(1, 0);
                    ejxVar.f91811H0 = jSONArrayOptJSONArray.optInt(2, 10000);
                    ejxVar.f91813I0 = jSONArrayOptJSONArray.optInt(3, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                    ejxVar.f91815J0 = jSONArrayOptJSONArray.optInt(4, 0);
                    ejxVar.f91817K0 = jSONArrayOptJSONArray.optInt(5, 500);
                    ejxVar.f91819L0 = jSONArrayOptJSONArray.optInt(6, 10);
                    ejxVar.f91821M0 = jSONArrayOptJSONArray.optInt(7, 10);
                    ejxVar.f91823N0 = jSONArrayOptJSONArray.optInt(8, 0);
                    ejxVar.f91825O0 = jSONArrayOptJSONArray.optInt(9, 0);
                    ejxVar.f91827P0 = (float) jSONArrayOptJSONArray.optDouble(10, 1.5d);
                    ejxVar.f91831R0 = (float) jSONArrayOptJSONArray.optDouble(11, 0.5d);
                    ejxVar.f91837U0 = jSONArrayOptJSONArray.optInt(14, -1);
                }
                if (jSONObject.has("pull_delay")) {
                    String string = jSONObject.getString("pull_delay");
                    if (!TextUtils.isEmpty(string)) {
                        if (string.contains("[")) {
                            string = string.replace("[", "");
                        }
                        if (string.contains(Constants.AES_SUFFIX)) {
                            string = string.replace(Constants.AES_SUFFIX, "");
                        }
                        String[] strArrSplit = string.split(Constants.SEPARATOR_COMMA);
                        if (strArrSplit != null) {
                            if (strArrSplit.length >= 5) {
                                ejxVar.f91841W0 = Integer.parseInt(strArrSplit[0]);
                                ejxVar.f91843X0 = Integer.parseInt(strArrSplit[r15]);
                                ejxVar.f91845Y0 = Integer.parseInt(strArrSplit[2]);
                                ejxVar.f91847Z0 = Integer.parseInt(strArrSplit[3]);
                                ejxVar.f91850a1 = Float.parseFloat(strArrSplit[4]);
                            }
                            if (strArrSplit.length >= 10) {
                                ejxVar.f91853b1 = Integer.parseInt(strArrSplit[5]);
                                ejxVar.f91856c1 = Integer.parseInt(strArrSplit[6]);
                                ejxVar.f91859d1 = Integer.parseInt(strArrSplit[7]);
                                ejxVar.f91862e1 = Integer.parseInt(strArrSplit[8]);
                                ejxVar.f91865f1 = Integer.parseInt(strArrSplit[9]);
                            }
                        }
                    }
                }
                if (jSONObject.has("filter_config")) {
                    JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("filter_config");
                    ejxVar.f91868g1 = jSONArrayOptJSONArray2.optInt(0, 0);
                    ejxVar.f91871h1 = (float) jSONArrayOptJSONArray2.optDouble(1, 1.0d);
                    ejxVar.f91874i1 = (float) jSONArrayOptJSONArray2.optDouble(r14, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);
                    ejxVar.f91877j1 = (float) jSONArrayOptJSONArray2.optDouble(r13, 1.0d);
                    ejxVar.f91880k1 = (float) jSONArrayOptJSONArray2.optDouble(r12, 1.0d);
                    ejxVar.f91883l1 = (float) jSONArrayOptJSONArray2.optDouble(5, 1.0d);
                }
            } catch (Exception unused) {
            }
        }
        return ejxVar;
    }

    /* JADX INFO: renamed from: c */
    public ejx m168520c(String str, boolean z) {
        JSONObject jSONObjectOptJSONObject;
        JSONArray jSONArrayOptJSONArray;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        JSONObject jSONObject;
        ejx ejxVar = new ejx();
        try {
            JSONObject jSONObject2 = new JSONObject(str);
            if (jSONObject2.has("em") && "OK".equals(jSONObject2.optString("em")) && jSONObject2.has("data")) {
                JSONObject jSONObjectOptJSONObject2 = jSONObject2.optJSONObject("data");
                if (this.f148454a) {
                    m168518d(jSONObjectOptJSONObject2, ejxVar);
                } else {
                    if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.has("comm_config")) {
                        ejxVar.f91848a = 1;
                        ejxVar.f91851b = 1;
                        JSONArray jSONArrayOptJSONArray2 = jSONObjectOptJSONObject2.optJSONObject("comm_config").optJSONArray("v6pburl");
                        if (jSONArrayOptJSONArray2 != null) {
                            ejxVar.f91854c = new String[jSONArrayOptJSONArray2.length()];
                            for (int i = 0; i < jSONArrayOptJSONArray2.length(); i++) {
                                ejxVar.f91854c[i] = jSONArrayOptJSONArray2.optString(i);
                            }
                        }
                        ejxVar.f91857d = jSONObjectOptJSONObject2.optJSONObject("comm_config").optInt("V6detectInterval", MMKV.ExpireInHour);
                        ejxVar.f91860e = jSONObjectOptJSONObject2.optJSONObject("comm_config").optInt("enable_apm_plugin");
                    }
                    if (jSONObjectOptJSONObject2 != null && jSONObjectOptJSONObject2.has("push_config")) {
                        JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject("push_config");
                        if (jSONObjectOptJSONObject3 != null) {
                            if (jSONObjectOptJSONObject3.has("comm_parms") && (jSONObject = jSONObjectOptJSONObject3.getJSONObject("comm_parms")) != null) {
                                ejxVar.f91806F = jSONObject.optInt("android_cam_cap_switch", 0);
                                ejxVar.f91808G = jSONObject.optInt("android_cam_cap_value", 0);
                                ejxVar.f91810H = jSONObject.optInt("sox", 0);
                                ejxVar.f91800C = jSONObject.optInt("noise_reduction_switch", 0);
                                ejxVar.f91802D = jSONObject.optInt("noise_reduction_mode", 0);
                                ejxVar.f91816K = jSONObject.optInt("push_drop_switch", 0);
                                ejxVar.f91818L = jSONObject.optInt("push_drop_high_water_marker", NetWorkParam.DEFAULT_CONNECT_TIME_OUT);
                                ejxVar.f91820M = jSONObject.optInt("push_drop_base_water_marker", 2000);
                                ejxVar.f91900r0 = jSONObject.optInt("dynamic_update_params", 1);
                            }
                            ejxVar.f91849a0 = jSONObjectOptJSONObject3.optInt("audio_scenario", -1);
                            ejxVar.f91852b0 = jSONObjectOptJSONObject3.optInt("audio_profile", -1);
                            ejxVar.f91897q0 = jSONObjectOptJSONObject3.optInt("clear_view", 0);
                            ejxVar.f91901s = jSONObjectOptJSONObject3.optInt("enable_B_encode", 0);
                            if (jSONObjectOptJSONObject3.has("agora_minkbs") && (jSONArray2 = jSONObjectOptJSONObject3.getJSONArray("agora_minkbs")) != null) {
                                ejxVar.f91855c0 = jSONArray2.optInt(0, 0);
                                ejxVar.f91858d0 = jSONArray2.optInt(1, 60);
                            }
                            if (jSONObjectOptJSONObject3.has("volc_minkbs") && (jSONArray = jSONObjectOptJSONObject3.getJSONArray("volc_minkbs")) != null) {
                                ejxVar.f91861e0 = jSONArray.optInt(0, 0);
                                ejxVar.f91864f0 = jSONArray.optInt(1, 60);
                            }
                            ejxVar.f91867g0 = jSONObjectOptJSONObject3.optInt("tanscode_aBitrate", 128);
                            ejxVar.f91870h0 = jSONObjectOptJSONObject3.optInt("volc_gl_flush", 0);
                            ejxVar.f91876j0 = jSONObjectOptJSONObject3.optInt("agora_gl_flush", 1);
                            ejxVar.f91805E0 = jSONObjectOptJSONObject3.optInt("focus_enable", 0);
                            if (jSONObjectOptJSONObject3.has("volc_test_appid_list") && (jSONArrayOptJSONArray = jSONObjectOptJSONObject3.optJSONArray("volc_test_appid_list")) != null) {
                                for (int i2 = 0; i2 < jSONArrayOptJSONArray.length(); i2++) {
                                    ejxVar.f91891o0.add(jSONArrayOptJSONArray.optString(i2, ""));
                                }
                            }
                            if (jSONObjectOptJSONObject3.has("vbr_config")) {
                                JSONObject jSONObject3 = jSONObjectOptJSONObject3.getJSONObject("vbr_config");
                                int iOptInt = jSONObject3.optInt("audio_stacking_duration", 1000);
                                ejxVar.f91902s0 = iOptInt;
                                if (iOptInt <= 0) {
                                    ejxVar.f91902s0 = 1000;
                                }
                                int iOptInt2 = jSONObject3.optInt("detection_interval", 200);
                                ejxVar.f91904t0 = iOptInt2;
                                if (iOptInt2 <= 0) {
                                    ejxVar.f91904t0 = 200;
                                }
                                int iOptInt3 = jSONObject3.optInt("netspeed_bad_count", 5);
                                ejxVar.f91906u0 = iOptInt3;
                                if (iOptInt3 <= 0) {
                                    ejxVar.f91906u0 = 5;
                                }
                                int iOptInt4 = jSONObject3.optInt("netspeed_good_count", 15);
                                ejxVar.f91908v0 = iOptInt4;
                                if (iOptInt4 <= 0) {
                                    ejxVar.f91908v0 = 15;
                                }
                                int iOptInt5 = jSONObject3.optInt("abr_duration", 1000);
                                ejxVar.f91916z0 = iOptInt5;
                                if (iOptInt5 <= 0) {
                                    ejxVar.f91916z0 = 1000;
                                }
                                ejxVar.f91914y0 = jSONObject3.optInt("push_level_change", 0);
                                int iOptInt6 = jSONObject3.optInt("increase_br_step", 200);
                                ejxVar.f91797A0 = iOptInt6;
                                if (iOptInt6 <= 0) {
                                    ejxVar.f91797A0 = 200;
                                }
                                int iOptInt7 = jSONObject3.optInt("down_audio_duration", 500);
                                ejxVar.f91910w0 = iOptInt7;
                                if (iOptInt7 <= 0) {
                                    ejxVar.f91910w0 = 500;
                                }
                                int iOptInt8 = jSONObject3.optInt("up_audio_duration", 200);
                                ejxVar.f91912x0 = iOptInt8;
                                if (iOptInt8 <= 0) {
                                    ejxVar.f91912x0 = 200;
                                }
                                double dOptDouble = jSONObject3.optDouble("abr_coefficient", 0.8d);
                                ejxVar.f91799B0 = dOptDouble;
                                if (dOptDouble <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                                    ejxVar.f91799B0 = 0.8d;
                                }
                                if (jSONObject3.has("vbr_list")) {
                                    JSONArray jSONArrayOptJSONArray3 = jSONObject3.optJSONArray("vbr_list");
                                    for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                                        ejxVar.f91801C0.add(new fjx.C16863b(jSONArrayOptJSONArray3.getJSONObject(i3).optInt("vbr_min") * 1000, jSONArrayOptJSONArray3.getJSONObject(i3).optInt("w"), jSONArrayOptJSONArray3.getJSONObject(i3).optInt("h")));
                                    }
                                }
                            }
                            JSONObject jSONObjectOptJSONObject4 = jSONObjectOptJSONObject3.optJSONObject("cv_config");
                            if (jSONObjectOptJSONObject4 != null) {
                                ejxVar.f91803D0.m121828o(jSONObjectOptJSONObject4.optInt(MediaFrontService.BUSINESS_TYPE));
                                ejxVar.f91803D0.m121834u(jSONObjectOptJSONObject4.optInt("face_alignment_version"));
                                ejxVar.f91803D0.m121836w(jSONObjectOptJSONObject4.optInt("max_faces"));
                                ejxVar.f91803D0.m121838y(jSONObjectOptJSONObject4.optInt("pose_estimation_type"));
                                ejxVar.f91803D0.m121839z(jSONObjectOptJSONObject4.optInt("pose_stable_coef"));
                                ejxVar.f91803D0.m121837x(jSONObjectOptJSONObject4.optBoolean("npd_accelerate"));
                                ejxVar.f91803D0.m121813B(jSONObjectOptJSONObject4.optBoolean("use_npd"));
                                ejxVar.f91803D0.m121812A(jSONObjectOptJSONObject4.optBoolean("use_mix"));
                                ejxVar.f91803D0.m121830q(jSONObjectOptJSONObject4.optBoolean("enable_expression"));
                                ejxVar.f91803D0.m121831r(jSONObjectOptJSONObject4.optBoolean("enable_eye_classify"));
                                ejxVar.f91803D0.m121829p(jSONObjectOptJSONObject4.optBoolean("enable_beauty"));
                                ejxVar.f91803D0.m121833t(jSONObjectOptJSONObject4.optBoolean("enable_skin"));
                                ejxVar.f91803D0.m121832s(jSONObjectOptJSONObject4.optBoolean("enable_face_warp_gradual"));
                                ejxVar.f91803D0.m121835v(jSONObjectOptJSONObject4.optInt("face_warp_gradual_thresh"));
                            }
                            JSONObject jSONObjectOptJSONObject5 = jSONObjectOptJSONObject3.optJSONObject("beauty_config");
                            if (jSONObjectOptJSONObject5 != null) {
                                ejxVar.f91824O = jSONObjectOptJSONObject5.optInt("use_usm_enable", 0);
                                ejxVar.f91826P = jSONObjectOptJSONObject5.optInt("use_usm_scale", 7);
                                ejxVar.f91828Q = jSONObjectOptJSONObject5.optInt("use_usm_saturation", 110);
                                ejxVar.f91830R = jSONObjectOptJSONObject5.optInt("use_usm_contrast", 110);
                                ejxVar.f91834T = jSONObjectOptJSONObject5.optInt("face_skip", 1);
                                JSONObject jSONObjectOptJSONObject6 = jSONObjectOptJSONObject5.optJSONObject("use_lut");
                                if (jSONObjectOptJSONObject6 != null) {
                                    ejxVar.f91836U = jSONObjectOptJSONObject6.optInt("enable", 0);
                                    ejxVar.f91838V = jSONObjectOptJSONObject6.optString("lut_url", "");
                                }
                                JSONObject jSONObjectOptJSONObject7 = jSONObjectOptJSONObject5.optJSONObject("use_filter_scale");
                                if (jSONObjectOptJSONObject7 != null) {
                                    ejxVar.f91840W = jSONObjectOptJSONObject7.optInt("lut", 80);
                                }
                            }
                            JSONObject jSONObjectOptJSONObject8 = jSONObjectOptJSONObject3.optJSONObject("cam");
                            if (jSONObjectOptJSONObject8 != null) {
                                ejxVar.f91842X = jSONObjectOptJSONObject8.optInt("enable_camera2", 0);
                            }
                        }
                        if (jSONObjectOptJSONObject2.has("log_config")) {
                            JSONObject jSONObjectOptJSONObject9 = jSONObjectOptJSONObject2.optJSONObject("log_config");
                            JSONArray jSONArrayOptJSONArray4 = jSONObjectOptJSONObject9.optJSONArray("push");
                            JSONArray jSONArrayOptJSONArray5 = jSONObjectOptJSONObject9.optJSONArray("pull");
                            JSONArray jSONArrayOptJSONArray6 = jSONObjectOptJSONObject9.optJSONArray("comm");
                            if (jSONArrayOptJSONArray4 != null) {
                                ejxVar.f91878k = jSONArrayOptJSONArray4.optInt(0, 6);
                                ejxVar.f91881l = jSONArrayOptJSONArray4.optInt(1, 5000);
                                hjx.m131418a("Utils", "push_log: " + jSONArrayOptJSONArray4.toString());
                            }
                            if (jSONArrayOptJSONArray5 != null) {
                                ejxVar.f91884m = jSONArrayOptJSONArray5.optInt(0, 6);
                                ejxVar.f91887n = jSONArrayOptJSONArray5.optInt(1, HuiYanResultSender.TIMEOUT_MS);
                            }
                            if (jSONArrayOptJSONArray6 != null) {
                                ejxVar.f91863f = jSONArrayOptJSONArray6.optInt(0, 0);
                                ejxVar.f91866g = jSONArrayOptJSONArray6.optInt(1, 0);
                                ejxVar.f91869h = jSONArrayOptJSONArray6.optInt(2, 5000);
                                ejxVar.f91872i = jSONArrayOptJSONArray6.optInt(3, 0);
                                ejxVar.f91875j = jSONArrayOptJSONArray6.optInt(4, 1);
                            }
                        }
                        if (jSONObjectOptJSONObject2.has("pull_config") && (jSONObjectOptJSONObject = jSONObjectOptJSONObject2.optJSONObject("pull_config")) != null) {
                            ejxVar.f91894p0 = jSONObjectOptJSONObject.toString();
                            if (jSONObjectOptJSONObject.has("pull_comm")) {
                                JSONArray jSONArrayOptJSONArray7 = jSONObjectOptJSONObject.optJSONArray("pull_comm");
                                ejxVar.f91807F0 = jSONArrayOptJSONArray7.optInt(0, 0);
                                ejxVar.f91809G0 = jSONArrayOptJSONArray7.optInt(1, 0);
                                ejxVar.f91811H0 = jSONArrayOptJSONArray7.optInt(2, 10000);
                                ejxVar.f91813I0 = jSONArrayOptJSONArray7.optInt(3, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                                ejxVar.f91815J0 = jSONArrayOptJSONArray7.optInt(4, 0);
                                ejxVar.f91817K0 = jSONArrayOptJSONArray7.optInt(5, 500);
                                ejxVar.f91819L0 = jSONArrayOptJSONArray7.optInt(6, 10);
                                ejxVar.f91821M0 = jSONArrayOptJSONArray7.optInt(7, 10);
                                ejxVar.f91823N0 = jSONArrayOptJSONArray7.optInt(8, 0);
                                ejxVar.f91825O0 = jSONArrayOptJSONArray7.optInt(9, 0);
                                ejxVar.f91827P0 = (float) jSONArrayOptJSONArray7.optDouble(10, 1.5d);
                                ejxVar.f91829Q0 = jSONArrayOptJSONArray7.optInt(11, 1);
                                ejxVar.f91831R0 = (float) jSONArrayOptJSONArray7.optDouble(12, 0.5d);
                                ejxVar.f91833S0 = jSONArrayOptJSONArray7.optInt(17, 0);
                            }
                            if (jSONObjectOptJSONObject.has("pull_delay")) {
                                JSONArray jSONArrayOptJSONArray8 = jSONObjectOptJSONObject.optJSONArray("pull_delay");
                                ejxVar.f91841W0 = jSONArrayOptJSONArray8.optInt(0, 1);
                                ejxVar.f91843X0 = jSONArrayOptJSONArray8.optInt(1, TXLiteAVCode.WARNING_START_CAPTURE_IGNORED);
                                ejxVar.f91845Y0 = jSONArrayOptJSONArray8.optInt(2, 7999);
                                ejxVar.f91847Z0 = jSONArrayOptJSONArray8.optInt(3, TXRecordCommon.AUDIO_SAMPLERATE_8000);
                                ejxVar.f91850a1 = (float) jSONArrayOptJSONArray8.optDouble(4, 1.100000023841858d);
                                ejxVar.f91853b1 = jSONArrayOptJSONArray8.optInt(5, 0);
                                ejxVar.f91856c1 = jSONArrayOptJSONArray8.optInt(6, 0);
                                ejxVar.f91859d1 = jSONArrayOptJSONArray8.optInt(7, 0);
                                ejxVar.f91862e1 = jSONArrayOptJSONArray8.optInt(8, 0);
                                ejxVar.f91865f1 = jSONArrayOptJSONArray8.optInt(9, 0);
                            }
                        }
                    }
                }
                if (z) {
                    m168521e(ejxVar);
                }
            }
        } catch (Exception unused) {
        }
        fjx.m121638R().m121665I1(ejxVar.f91872i);
        return ejxVar;
    }

    /* JADX INFO: renamed from: e */
    public void m168521e(ejx ejxVar) {
        fjx.m121638R().m121680N1(ejxVar.f91878k);
        fjx.m121638R().m121677M1(ejxVar.f91881l);
        fjx.m121638R().m121671K1(ejxVar.f91884m);
        fjx.m121638R().m121668J1(ejxVar.f91887n);
        fjx.m121638R().m121686P1(ejxVar.f91866g);
        fjx.m121638R().m121683O1(ejxVar.f91869h);
        fjx.m121638R().m121665I1(ejxVar.f91872i);
        fjx.m121638R().m121762l1(ejxVar.f91890o, ejxVar.f91893p, ejxVar.f91896q, ejxVar.f91899r);
        fjx.m121638R().m121719a2(ejxVar.f91822N);
        fjx.m121638R().m121731d2(ejxVar.f91824O);
        fjx.m121638R().m121743g2(ejxVar.f91826P / 100.0f);
        fjx.m121638R().m121739f2(ejxVar.f91828Q / 100.0f);
        fjx.m121638R().m121735e2(ejxVar.f91830R / 100.0f);
        fjx.m121638R().m121801x1(ejxVar.f91834T);
        fjx.m121638R().m121650D1(ejxVar.f91836U);
        fjx.m121638R().m121656F1(ejxVar.f91838V);
        fjx.m121638R().m121653E1(ejxVar.f91840W / 100.0f);
        fjx.m121638R().m121742g1(ejxVar.f91803D0);
        fjx.m121638R().m121715Z1(ejxVar.f91842X);
        fjx.m121638R().m121734e1(ejxVar.f91852b0);
        fjx.m121638R().m121738f1(ejxVar.f91849a0);
        fjx.m121638R().m121674L1(ejxVar.f91816K, ejxVar.f91820M, ejxVar.f91818L);
        fjx.m121638R().m121798w1(ejxVar.f91901s);
        fjx.m121638R().m121795v1(ejxVar.f91875j);
        fjx.m121638R().m121759k2(ejxVar.f91897q0);
        fjx.m121638R().m121644B1(ejxVar.f91900r0);
        fjx.m121638R().m121751i2(ejxVar.f91870h0);
        fjx.m121638R().m121763l2(ejxVar.f91873i0);
        fjx.m121638R().m121722b1(ejxVar.f91876j0);
        fjx.m121638R().m121755j2(ejxVar.f91879k0);
        fjx.m121638R().m121767m2(ejxVar.f91882l0);
        fjx.m121638R().m121726c1(ejxVar.f91888n0);
        fjx.m121638R().m121730d1(ejxVar.f91885m0);
        fjx.m121638R().m121770n1(ejxVar.f91860e == 1);
        fjx.m121638R().m121780q1(ejxVar.f91892o1 == 1);
        if (ejxVar.f91898q1 != null) {
            fjx.m121638R().m121766m1(ejxVar.f91898q1.m152602d());
            fjx.m121638R().m121747h2(ejxVar.f91898q1.m152620v());
            fjx.m121638R().m121774o1(ejxVar.f91898q1.m152603e());
            fjx.m121638R().m121783r1(ejxVar.f91898q1.m152605g());
            fjx.m121638R().m121789t1(ejxVar.f91898q1.m152606h());
            fjx.m121638R().m121694S1(ejxVar.f91898q1.m152613o());
            fjx.m121638R().m121750i1(ejxVar.f91898q1.m152600b());
            fjx.m121638R().m121754j1(ejxVar.f91898q1.m152601c());
            fjx.m121638R().m121689Q1(ejxVar.f91898q1.m152611m());
            fjx.m121638R().m121706W1(ejxVar.f91898q1.m152617s());
            fjx.m121638R().m121659G1(ejxVar.f91898q1.m152610l());
            fjx.m121638R().m121777p1(ejxVar.f91898q1.m152604f());
            fjx.m121638R().m121746h1(ejxVar.f91898q1.m152599a());
            fjx.m121638R().m121691R1(ejxVar.f91898q1.m152612n());
            fjx.m121638R().m121641A1(ejxVar.f91898q1.m152609k());
            fjx.m121638R().m121703V1(ejxVar.f91898q1.m152616r());
            fjx.m121638R().m121804y1(ejxVar.f91898q1.m152607i());
            fjx.m121638R().m121697T1(ejxVar.f91898q1.m152614p());
            fjx.m121638R().m121807z1(ejxVar.f91898q1.m152608j());
            fjx.m121638R().m121700U1(ejxVar.f91898q1.m152615q());
            fjx.m121638R().m121712Y1(ejxVar.f91898q1.m152619u());
            fjx.m121638R().m121709X1(ejxVar.f91898q1.m152618t());
        }
    }
}
