package com.p051p1.mobile.putong.live.external.module.api;

import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveIdCardVerificationInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveVerificationAnchor;
import com.p051p1.mobile.putong.live.base.data.BLiveVerificationCenter;
import com.p051p1.mobile.putong.live.external.module.api.LiveVerificationApi;
import com.tantanapp.common.utils.CrashHelper;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p153l.bk3;
import p153l.dhw;
import p153l.fk3;
import p153l.itd0;
import p153l.jxd0;
import p153l.jyb;
import p153l.mbs;
import p153l.mqr;
import p153l.nsh0;
import p153l.qcj;
import p153l.rnl;
import p153l.tbs;
import p153l.y20;
import p153l.zvr;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVerificationApi {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m71653a(BLiveEnvelope bLiveEnvelope) {
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Boolean m71655c(BLiveVerificationCenter bLiveVerificationCenter) {
        BLiveIdCardVerificationInfo bLiveIdCardVerificationInfo = bLiveVerificationCenter.idCard;
        return Boolean.valueOf(bLiveIdCardVerificationInfo != null && TEnum.equals(bLiveIdCardVerificationInfo.status, "verified"));
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Boolean m71656d(BLiveVerificationCenter bLiveVerificationCenter) {
        BLiveVerificationAnchor bLiveVerificationAnchor = bLiveVerificationCenter.anchor;
        return Boolean.valueOf(bLiveVerificationAnchor != null && TEnum.equals(bLiveVerificationAnchor.status, "verified"));
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m71658f(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleNormalLiveAnchorVerification(BLiveEnvelope bLiveEnvelope, y20<Boolean> y20Var) {
        List<BLiveVerificationCenter> list = bLiveEnvelope.data.verificationCenter;
        if (list.size() > 0) {
            BLiveVerificationCenter bLiveVerificationCenter = (BLiveVerificationCenter) jyb.m147529r(list, new qcj() { // from class: l.dvu
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return LiveVerificationApi.m71656d((BLiveVerificationCenter) obj);
                }
            });
            BLiveVerificationCenter bLiveVerificationCenter2 = (BLiveVerificationCenter) jyb.m147529r(list, new qcj() { // from class: l.evu
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return LiveVerificationApi.m71655c((BLiveVerificationCenter) obj);
                }
            });
            if (bLiveVerificationCenter != null || bLiveVerificationCenter2 != null) {
                nsh0.m164608j("[live]verification", "request verification success, put value : true");
                jxd0 jxd0Var = ((bk3) tbs.m190077m(itd0.f116822d)).f77043f;
                Boolean bool = Boolean.TRUE;
                jxd0Var.put(bool);
                ((fk3) tbs.m190077m(itd0.f116820b)).f99470u.onNext(1);
                if (y20Var != null) {
                    y20Var.call(bool);
                    return;
                }
                return;
            }
        }
        nsh0.m164608j("[live]verification", "request verification success, put value : false");
        jxd0 jxd0Var2 = ((bk3) tbs.m190077m(itd0.f116822d)).f77043f;
        Boolean bool2 = Boolean.FALSE;
        jxd0Var2.put(bool2);
        ((fk3) tbs.m190077m(itd0.f116820b)).f99470u.onNext(1);
        if (y20Var != null) {
            y20Var.call(bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void handleNormalLiveAnchorVerificationError(y20<Boolean> y20Var) {
        nsh0.m164608j("[live]verification", "request verification failed,do nothing!");
        if (y20Var != null) {
            y20Var.call(Boolean.FALSE);
        }
    }

    public static boolean noVerificationInfo() {
        Integer numM222761e = ((fk3) tbs.m190077m(itd0.f116820b)).f99470u.m222761e();
        Boolean bool = ((bk3) tbs.m190077m(itd0.f116822d)).f77043f.get();
        nsh0.m164608j("[live]verification", "check no verificateInfo state: obs value =" + numM222761e + ",anchor verification state =" + bool);
        return numM222761e.intValue() == -1 && !bool.booleanValue();
    }

    public static C22421c<BLiveEnvelope> patchUserAsPersonalAnchor() {
        String str;
        String strM157870o0 = mbs.m157870o0();
        boolean zM203428H5 = tbs.f172989b.m203428H5();
        String str2 = zM203428H5 ? "users" : "anchors";
        StringBuilder sb = new StringBuilder("/");
        sb.append(str2);
        sb.append("/me/verifications");
        String string = "";
        if (zM203428H5) {
            str = "/" + strM157870o0;
        } else {
            str = "";
        }
        sb.append(str);
        String strM221802b = zvr.m221802b(sb.toString());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", strM157870o0);
            jSONObject.put("user_id", strM157870o0);
            jSONObject.put("anchor", new JSONObject());
            jSONObject.put("type", "verification");
            if (!zM203428H5) {
                jSONObject.put("anchorType", "video");
            }
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        if (zM203428H5) {
            return LiveExternalApi.buildLivePatchNetReqObs(rnl.m182263l(strM221802b), "patch_anchor" + strM157870o0, string);
        }
        return LiveExternalApi.buildLivePostNetReqObs(rnl.m182263l(strM221802b), "patch_anchor" + strM157870o0, string);
    }

    public static void requestLiveVerification(@Nullable final y20<Boolean> y20Var) {
        if (mqr.m159591k()) {
            String strM157870o0 = mbs.m157870o0();
            LiveExternalApi.buildLiveReadReq(rnl.m182263l(zvr.m221802b("/users/" + strM157870o0 + "/verifications/" + strM157870o0)), "liveVerification").doOnNext(new y20() { // from class: l.fvu
                @Override // p153l.y20
                public final void call(Object obj) {
                    LiveVerificationApi.handleNormalLiveAnchorVerification((BLiveEnvelope) obj, y20Var);
                }
            }).doOnError(new y20() { // from class: l.gvu
                @Override // p153l.y20
                public final void call(Object obj) {
                    LiveVerificationApi.handleNormalLiveAnchorVerificationError(y20Var);
                }
            }).subscribe(dhw.m115826e(new y20() { // from class: l.hvu
                @Override // p153l.y20
                public final void call(Object obj) {
                    LiveVerificationApi.m71653a((BLiveEnvelope) obj);
                }
            }, new y20() { // from class: l.ivu
                @Override // p153l.y20
                public final void call(Object obj) {
                    LiveVerificationApi.m71658f((Throwable) obj);
                }
            }));
        }
    }

    public static void requestLiveVerification() {
        requestLiveVerification(null);
    }
}
