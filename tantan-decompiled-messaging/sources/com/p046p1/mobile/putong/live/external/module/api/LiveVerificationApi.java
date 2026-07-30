package com.p046p1.mobile.putong.live.external.module.api;

import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p046p1.mobile.putong.live.base.data.BLiveIdCardVerificationInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveVerificationAnchor;
import com.p046p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.p046p1.mobile.putong.live.external.module.api.LiveVerificationApi;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p149l.cll;
import p149l.e30;
import p149l.ffw;
import p149l.gkh0;
import p149l.gld0;
import p149l.hpd0;
import p149l.jj3;
import p149l.l9s;
import p149l.lor;
import p149l.nj3;
import p149l.s9s;
import p149l.vwb;
import p149l.w9j;
import p149l.ytr;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVerificationApi {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m70470a(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m70472c(BLiveVerificationCenter bLiveVerificationCenter) {
        BLiveIdCardVerificationInfo bLiveIdCardVerificationInfo = bLiveVerificationCenter.idCard;
        return Boolean.valueOf(bLiveIdCardVerificationInfo != null && TEnum.equals(bLiveIdCardVerificationInfo.status, "verified"));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Boolean m70473d(BLiveVerificationCenter bLiveVerificationCenter) {
        BLiveVerificationAnchor bLiveVerificationAnchor = bLiveVerificationCenter.anchor;
        return Boolean.valueOf(bLiveVerificationAnchor != null && TEnum.equals(bLiveVerificationAnchor.status, "verified"));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m70475f(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleNormalLiveAnchorVerification(BLiveEnvelope bLiveEnvelope, e30<Boolean> e30Var) {
        List<BLiveVerificationCenter> list = bLiveEnvelope.data.verificationCenter;
        if (list.size() > 0) {
            BLiveVerificationCenter bLiveVerificationCenter = (BLiveVerificationCenter) vwb.m200346r(list, new w9j() { // from class: l.ctu
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LiveVerificationApi.m70473d((BLiveVerificationCenter) obj);
                }
            });
            BLiveVerificationCenter bLiveVerificationCenter2 = (BLiveVerificationCenter) vwb.m200346r(list, new w9j() { // from class: l.dtu
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return LiveVerificationApi.m70472c((BLiveVerificationCenter) obj);
                }
            });
            if (bLiveVerificationCenter != null || bLiveVerificationCenter2 != null) {
                gkh0.m126627j("[live]verification", "request verification success, put value : true");
                hpd0 hpd0Var = ((jj3) s9s.m182763m(gld0.f103314d)).f118225f;
                Boolean bool = Boolean.TRUE;
                hpd0Var.put(bool);
                ((nj3) s9s.m182763m(gld0.f103312b)).f139197u.onNext(1);
                if (e30Var != null) {
                    e30Var.call(bool);
                    return;
                }
                return;
            }
        }
        gkh0.m126627j("[live]verification", "request verification success, put value : false");
        hpd0 hpd0Var2 = ((jj3) s9s.m182763m(gld0.f103314d)).f118225f;
        Boolean bool2 = Boolean.FALSE;
        hpd0Var2.put(bool2);
        ((nj3) s9s.m182763m(gld0.f103312b)).f139197u.onNext(1);
        if (e30Var != null) {
            e30Var.call(bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleNormalLiveAnchorVerificationError(e30<Boolean> e30Var) {
        gkh0.m126627j("[live]verification", "request verification failed,do nothing!");
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
    }

    public static boolean noVerificationInfo() {
        Integer numM221515e = ((nj3) s9s.m182763m(gld0.f103312b)).f139197u.m221515e();
        Boolean bool = ((jj3) s9s.m182763m(gld0.f103314d)).f118225f.get();
        gkh0.m126627j("[live]verification", "check no verificateInfo state: obs value =" + numM221515e + ",anchor verification state =" + bool);
        return numM221515e.intValue() == -1 && !bool.booleanValue();
    }

    public static C22306c<BLiveEnvelope> patchUserAsPersonalAnchor() {
        String str;
        String strM149093o0 = l9s.m149093o0();
        boolean zM195641H5 = s9s.f163228b.m195641H5();
        String str2 = zM195641H5 ? "users" : "anchors";
        StringBuilder sb = new StringBuilder("/");
        sb.append(str2);
        sb.append("/me/verifications");
        String string = "";
        if (zM195641H5) {
            str = "/" + strM149093o0;
        } else {
            str = "";
        }
        sb.append(str);
        String strM216073b = ytr.m216073b(sb.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", strM149093o0);
            jSONObject.put("user_id", strM149093o0);
            jSONObject.put("anchor", new JSONObject());
            jSONObject.put("type", "verification");
            if (!zM195641H5) {
                jSONObject.put("anchorType", "video");
            }
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        if (zM195641H5) {
            return LiveExternalApi.buildLivePatchNetReqObs(cll.m107499l(strM216073b), "patch_anchor" + strM149093o0, string);
        }
        return LiveExternalApi.buildLivePostNetReqObs(cll.m107499l(strM216073b), "patch_anchor" + strM149093o0, string);
    }

    public static void requestLiveVerification(@Nullable final e30<Boolean> e30Var) {
        if (lor.m150806k()) {
            String strM149093o0 = l9s.m149093o0();
            LiveExternalApi.buildLiveReadReq(cll.m107499l(ytr.m216073b("/users/" + strM149093o0 + "/verifications/" + strM149093o0)), "liveVerification").doOnNext(new e30() { // from class: l.etu
                @Override // p149l.e30
                public final void call(Object obj) {
                    LiveVerificationApi.handleNormalLiveAnchorVerification((BLiveEnvelope) obj, e30Var);
                }
            }).doOnError(new e30() { // from class: l.ftu
                @Override // p149l.e30
                public final void call(Object obj) {
                    LiveVerificationApi.handleNormalLiveAnchorVerificationError(e30Var);
                }
            }).subscribe(ffw.m121194e(new e30() { // from class: l.gtu
                @Override // p149l.e30
                public final void call(Object obj) {
                    LiveVerificationApi.m70470a((BLiveEnvelope) obj);
                }
            }, new e30() { // from class: l.htu
                @Override // p149l.e30
                public final void call(Object obj) {
                    LiveVerificationApi.m70475f((Throwable) obj);
                }
            }));
        }
    }

    public static void requestLiveVerification() {
        requestLiveVerification(null);
    }
}
