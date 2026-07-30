package com.p046p1.mobile.putong.core.api;

import android.annotation.SuppressLint;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4735d0;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.FeedbackQuestion;
import com.p046p1.mobile.putong.core.data.PicVerificationInfo;
import com.p046p1.mobile.putong.core.data.PictureVerifyRightedInfo;
import com.p046p1.mobile.putong.core.data.ProfileEditInfo;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.data.AgeVerificationPatchInfo;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.StudentVerificationStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VerificationPatchInfo;
import com.p046p1.mobile.putong.data.VerificationToken;
import com.p046p1.mobile.putong.data.VerificationTokenIdentity;
import com.p046p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.ax6;
import p149l.d30;
import p149l.e51;
import p149l.hpd0;
import p149l.ia20;
import p149l.j760;
import p149l.k9j;
import p149l.la20;
import p149l.lsx;
import p149l.mkd0;
import p149l.mqi0;
import p149l.pgm;
import p149l.qib0;
import p149l.rhi;
import p149l.roj0;
import p149l.tpd0;
import p149l.uqd0;
import p149l.ura;
import p149l.utc0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.d0 */
/* JADX INFO: loaded from: classes9.dex */
public class C4735d0 extends ax6 {

    /* JADX INFO: renamed from: l0 */
    public static final String f19742l0;

    /* JADX INFO: renamed from: m0 */
    public static final String f19743m0;

    /* JADX INFO: renamed from: R */
    public hpd0 f19744R;

    /* JADX INFO: renamed from: S */
    public hpd0 f19745S;

    /* JADX INFO: renamed from: T */
    public hpd0 f19746T;

    /* JADX INFO: renamed from: U */
    public hpd0 f19747U;

    /* JADX INFO: renamed from: V */
    public hpd0 f19748V;

    /* JADX INFO: renamed from: W */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f19749W;

    /* JADX INFO: renamed from: X */
    public uqd0 f19750X;

    /* JADX INFO: renamed from: Y */
    public zpd0 f19751Y;

    /* JADX INFO: renamed from: Z */
    public zpd0 f19752Z;

    /* JADX INFO: renamed from: a0 */
    @SuppressLint({"SV_USE_DUP_ID"})
    public zpd0 f19753a0;

    /* JADX INFO: renamed from: b0 */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f19754b0;

    /* JADX INFO: renamed from: c0 */
    public uqd0 f19755c0;

    /* JADX INFO: renamed from: d0 */
    public zpd0 f19756d0;

    /* JADX INFO: renamed from: e0 */
    public zpd0 f19757e0;

    /* JADX INFO: renamed from: f0 */
    public zpd0 f19758f0;

    /* JADX INFO: renamed from: g0 */
    public tpd0 f19759g0;

    /* JADX INFO: renamed from: h0 */
    public uqd0 f19760h0;

    /* JADX INFO: renamed from: i0 */
    public hpd0 f19761i0;

    /* JADX INFO: renamed from: j0 */
    public C22392a<Long> f19762j0;

    /* JADX INFO: renamed from: k0 */
    public final C22392a<List<FeedbackQuestion>> f19763k0;

    static {
        String str = k9j.m145077I() + "/sensetime/";
        f19742l0 = str;
        f19743m0 = str + "silent_liveness/silent_liveness_image.jpg";
    }

    public C4735d0(C4732c c4732c) {
        super(c4732c);
        String str = qib0.f154713b0.f139230a.userId() + "needShownTantanVerifiedDlg";
        Boolean bool = Boolean.FALSE;
        this.f19744R = new hpd0(str, bool);
        this.f19745S = new hpd0(qib0.f154713b0.f139230a.userId() + "needShownTantanRejectedDlg", bool);
        this.f19746T = new hpd0("needShownIdVerificationDlg", bool);
        this.f19747U = new hpd0(CoreModule.m29931H().userId() + "needShownPicVerifiedDlg", bool);
        this.f19748V = new hpd0(CoreModule.m29931H().userId() + "needShownPicRejectedDlg", bool);
        StringBuilder sb = new StringBuilder("picAndAvatarVerSwipeNotifyCount");
        sb.append(CoreModule.m29931H().userId());
        this.f19749W = new tpd0(sb.toString(), 0);
        this.f19750X = new uqd0("picAndAvatarVerSwipeNotifyDate" + CoreModule.m29931H().userId(), "");
        this.f19751Y = new zpd0("picAndAvatarVerSwipeCount" + CoreModule.m29931H().userId(), 0L);
        this.f19752Z = new zpd0("picFirstShowAndAvatarVerSwipeCount" + CoreModule.m29931H().userId(), 0L);
        this.f19753a0 = new zpd0("lastPicAndAvatarVerShowTime" + CoreModule.m29931H().userId(), 0L);
        this.f19754b0 = new tpd0("tantanAuthSwipeNotifyCount" + CoreModule.m29931H().userId(), 0);
        this.f19755c0 = new uqd0("tantanAuthSwipeDate" + CoreModule.m29931H().userId(), "");
        this.f19756d0 = new zpd0("tantanAuthSwipeCount" + CoreModule.m29931H().userId(), 0L);
        this.f19757e0 = new zpd0("continuousMaleLikeForVerify" + CoreModule.m29931H().userId(), 0L);
        this.f19758f0 = new zpd0("continuousFemaleDisLikeForVerify" + CoreModule.m29931H().userId(), 0L);
        this.f19759g0 = new tpd0("pic_verify_me_tab_red_dot_show_count" + CoreModule.m29931H().userId(), 0);
        this.f19760h0 = CoreModule.f17550h.f119924g;
        this.f19762j0 = C22392a.m221513c(0L);
        this.f19763k0 = C22392a.m221512b();
        this.f19761i0 = new hpd0("cert_center_entry_dot" + CoreModule.m29931H().userId(), bool);
    }

    /* JADX INFO: renamed from: A3 */
    public static /* synthetic */ VerificationToken m31550A3(Envelope envelope) {
        List<VerificationToken> list = ((CoreData) envelope.getModuleData(CoreData.class)).verificationTokens;
        if (vwb.m200296J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: E3 */
    public static /* synthetic */ VerificationCenter m31554E3(VerificationCenter verificationCenter) {
        Picture picture = verificationCenter.picVerificationInfo.media;
        if (TEnum.equals(picture.status, "raw") && (picture.size == null || picture.mediaType == null)) {
            pgm pgmVar = new pgm(rhi.m179382z(picture.url));
            picture.size = new Dimension(pgmVar.f148730d);
            picture.mediaType = pgmVar.f148729c;
        }
        return verificationCenter;
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ C22306c m31564O3(w9j w9jVar, VerificationCenter verificationCenter) {
        return (C22306c) w9jVar.call(verificationCenter);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ C22306c m31569e3(w9j w9jVar, VerificationCenter verificationCenter) {
        return (C22306c) w9jVar.call(verificationCenter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ roj0 m31573h4(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ C22306c m31575j3(final VerificationCenter verificationCenter) {
        if (verificationCenter.picVerificationInfo.media == null) {
            return C22306c.just(verificationCenter);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(verificationCenter.picVerificationInfo.media);
        return new lsx(arrayList, false).flatMap(new w9j() { // from class: l.xjb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ya5.m213793I((List) obj, "pic_verification");
            }
        }).map(new w9j() { // from class: l.zjb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4735d0.m31578m3(verificationCenter, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ VerificationPatchInfo m31577l3(AgeVerificationPatchInfo ageVerificationPatchInfo, List list) {
        VerificationPatchInfo verificationPatchInfoNew_ = VerificationPatchInfo.new_();
        ageVerificationPatchInfo.media = (Picture) list.get(0);
        verificationPatchInfoNew_.age = ageVerificationPatchInfo;
        return verificationPatchInfoNew_;
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ VerificationCenter m31578m3(VerificationCenter verificationCenter, List list) {
        VerificationCenter verificationCenterMo223809clone = verificationCenter.mo223809clone();
        verificationCenterMo223809clone.picVerificationInfo.media = (Picture) list.get(0);
        return verificationCenterMo223809clone;
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ C22306c m31589x3(String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("actorUserID", str);
            jSONObject.put("otherUserID", str2);
        } catch (Exception unused) {
        }
        return ia20.m135117a(new v9j() { // from class: l.hjb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/picture-verification/invitation")).m185893l(utc0.create(Network.JSON, jSONObject.toString())).m185883b();
            }
        }).map(new w9j() { // from class: l.ijb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return roj0.f160388a;
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ void m31591z3(String str) {
        CoreModule.f17553k.f91945h.delete(CoreModule.m29931H().userId());
        qib0.f154722k0.f176631d.update(vwb.m200324f0(vwb.m200311Y(User.VERIFICATIONS_PICVERIFICATIONRESULT_VERIFIED, Boolean.FALSE)), User.f38825ID.mo60175EQ(str));
    }

    /* JADX INFO: renamed from: P3 */
    public C22306c<roj0> m31592P3(double d) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("birthdate", Converter.dateToApiDateString(d));
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return this.f72126Q.now("checkBirthdayWithVerified", new la20(new v9j() { // from class: l.nkb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31213J0("/verifications/" + CoreModule.m29931H().userId() + "/check-birthdate")).m185893l(utc0VarCreate).m185883b();
            }
        }).map(new w9j() { // from class: l.okb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f144408a.m31599W3((Envelope) obj);
            }
        }).compose(C4728a.m31252T2()), false);
    }

    /* JADX INFO: renamed from: Q3 */
    public void m31593Q3(final String str, final String str2) {
        this.f72126Q.now(null, new la20(new v9j() { // from class: l.qkb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31212J(str, str2)).m185885d().m185883b();
            }
        }).map(new w9j() { // from class: l.djb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f86512a.m31600X3(str, (Envelope) obj);
            }
        }).compose(C4728a.m31252T2()));
    }

    /* JADX INFO: renamed from: R3 */
    public List<FeedbackQuestion> m31594R3() {
        return this.f19763k0.m221515e();
    }

    /* JADX INFO: renamed from: S3 */
    public C22306c<VerificationToken> m31595S3() {
        final VerificationTokenRequestParam verificationTokenRequestParamNew_ = VerificationTokenRequestParam.new_();
        verificationTokenRequestParamNew_.appId = "1";
        verificationTokenRequestParamNew_.productId = "1";
        verificationTokenRequestParamNew_.verifyType = "picture";
        VerificationTokenIdentity verificationTokenIdentityNew_ = VerificationTokenIdentity.new_();
        verificationTokenRequestParamNew_.picture = verificationTokenIdentityNew_;
        verificationTokenIdentityNew_.provider = "manual";
        return this.f72126Q.scheduled("getManualToken", 0, new v9j() { // from class: l.tjb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new ka20(new v9j() { // from class: l.ekb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31354t2(CoreModule.m29931H().userId())).m185893l(utc0.create(Network.JSON, verificationTokenRequestParam.toJson())).m185883b();
                    }
                }, Envelope.JSON_ADAPTER).compose(C4728a.m31252T2()).map(new w9j() { // from class: l.fkb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4735d0.m31550A3((Envelope) obj);
                    }
                });
            }
        }, false);
    }

    /* JADX INFO: renamed from: T3 */
    public C22306c<PictureVerifyRightedInfo> m31596T3() {
        return this.f72126Q.scheduled("getPicVerifyExtraInfo" + mqi0.m155944o(), 0, new v9j() { // from class: l.pkb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.jjb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/picture-verify/righted/info")).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.kjb
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).pictureVerifyRightedInfo;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public C22306c<j760<List<FeedbackQuestion>, Integer>> m31597U3() {
        return this.f72126Q.scheduled("getQuestionsOfNotVerify", 0, new v9j() { // from class: l.sjb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f164824a.m31602Z3();
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public C22306c<roj0> m31598V3(final String str, final String str2) {
        return this.f72126Q.scheduled("invite_user_verify_" + str, -1, new v9j() { // from class: l.mkb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4735d0.m31589x3(str2, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ roj0 m31599W3(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ roj0 m31600X3(final String str, Envelope envelope) {
        this.f72126Q.f19609U.m109085a(new d30() { // from class: l.rjb
            @Override // p149l.d30
            public final void call() {
                C4735d0.m31591z3(str);
            }
        });
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ j760 m31601Y3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        List<FeedbackQuestion> list = coreData.feedbackQuestions;
        this.f19763k0.m132487l(list);
        return vwb.m200311Y(list, Integer.valueOf(coreData.feedbackRemainedNum));
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ C22306c m31602Z3() {
        return ia20.m135117a(new v9j() { // from class: l.akb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/verification/feedback")).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.bkb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f75987a.m31601Y3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ roj0 m31603a4(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ C22306c m31604b4(final VerificationPatchInfo verificationPatchInfo) {
        return new la20(new v9j() { // from class: l.ckb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31279b(CoreModule.m29931H().userId())).m185892k(utc0.create(Network.JSON, verificationPatchInfo.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.dkb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f86642a.m31603a4((Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ C22306c m31605c4(final VerificationPatchInfo verificationPatchInfo) {
        return scheduled("patch_age_verification", -1, new v9j() { // from class: l.vjb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f181671a.m31604b4(verificationPatchInfo);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ roj0 m31606d4(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ C22306c m31607e4(final VerificationCenter verificationCenter) {
        return new la20(new v9j() { // from class: l.gkb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31365w1(CoreModule.m29931H().userId())).m185893l(utc0.create(Network.JSON, verificationCenter.toJson())).m185883b();
            }
        }).map(new w9j() { // from class: l.hkb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f108169a.m31609g4((Envelope) obj);
            }
        }).compose(mkd0.m154951C());
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ C22306c m31608f4(final VerificationCenter verificationCenter) {
        return this.f72126Q.scheduled("postPicVerificationInfo", -1, new v9j() { // from class: l.wjb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f186623a.m31607e4(verificationCenter);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ roj0 m31609g4(Envelope envelope) {
        this.f72126Q.m31492w3(envelope, null);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ C22306c m31610i4(final String str) {
        return new la20(new v9j() { // from class: l.yjb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31361v1(str)).m185887f().m185883b();
            }
        }).map(new w9j() { // from class: l.jkb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f118347a.m31573h4((Envelope) obj);
            }
        }).compose(C4728a.m31252T2());
    }

    /* JADX INFO: renamed from: j4 */
    public C22306c<VerificationCenter> m31611j4() {
        return CoreModule.f17553k.f91945h.uiGet(CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: k4 */
    public VerificationCenter m31612k4() {
        return (VerificationCenter) CoreModule.f17553k.f91945h.queryCache(CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: l4 */
    public j760<Boolean, Boolean> m31613l4() {
        boolean zMo33730O = ura.m195053e().m195057d().mo33730O();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        boolean z = false;
        if (ura.m195053e().m195057d().mo33730O() && (userM169527p9.isIdCardVerified() || (NullChecker.m81303a(verificationCenterM31612k4) && NullChecker.m81303a(verificationCenterM31612k4.idCard) && (TEnum.equals(verificationCenterM31612k4.idCard.status, "pending") || TEnum.equals(verificationCenterM31612k4.idCard.status, "verified"))))) {
            zMo33730O = false;
        }
        if (!userM169527p9.isPicVerificationVerified() && (!NullChecker.m81303a(verificationCenterM31612k4) || !NullChecker.m81303a(verificationCenterM31612k4.picVerificationInfo) || (!TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending") && !TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")))) {
            z = true;
        }
        return vwb.m200311Y(Boolean.valueOf(z), Boolean.valueOf(zMo33730O));
    }

    /* JADX INFO: renamed from: m4 */
    public C22306c<roj0> m31614m4(List<Media> list, final AgeVerificationPatchInfo ageVerificationPatchInfo) {
        return new lsx(list, false).flatMap(new w9j() { // from class: l.ejb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ya5.m213793I((List) obj, "age_verification");
            }
        }).map(new w9j() { // from class: l.fjb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4735d0.m31577l3(ageVerificationPatchInfo, (List) obj);
            }
        }).compose(mkd0.m154965Q()).flatMap(new w9j() { // from class: l.gjb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f103019a.m31605c4((VerificationPatchInfo) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public C22306c<roj0> m31615n4(String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("url", str);
            jSONObject3.put("mediaType", DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4);
            jSONObject2.put("provider", "manual");
            jSONObject2.put("media", jSONObject3);
            jSONObject.put("picture", jSONObject2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return this.f72126Q.now("patchManualFaceVerification", new la20(new v9j() { // from class: l.ikb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C4728a.f19494P.auth().m185898q(C4728a.m31220L(CoreModule.m29931H().userId())).m185892k(utc0VarCreate).m185883b();
            }
        }).map(new w9j() { // from class: l.kkb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123539a.m31606d4((Envelope) obj);
            }
        }).compose(C4728a.m31252T2()), false);
    }

    /* JADX INFO: renamed from: o4 */
    public C22306c<roj0> m31616o4(final VerificationCenter verificationCenter) {
        v9j v9jVar = new v9j() { // from class: l.ljb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C22306c.fromCallable(new Callable() { // from class: l.ujb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C4735d0.m31554E3(verificationCenter);
                    }
                });
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.mjb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4735d0.m31575j3((VerificationCenter) obj);
            }
        };
        final w9j w9jVar2 = new w9j() { // from class: l.ojb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f144261a.m31608f4((VerificationCenter) obj);
            }
        };
        return ((C22306c) v9jVar.call()).flatMap(new w9j() { // from class: l.pjb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4735d0.m31564O3(w9jVar, (VerificationCenter) obj);
            }
        }).compose(mkd0.m154965Q()).flatMap(new w9j() { // from class: l.qjb
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4735d0.m31569e3(w9jVar2, (VerificationCenter) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public C22306c<roj0> m31617p4(final String str) {
        return this.f72126Q.scheduled("verification/" + str, 0, new v9j() { // from class: l.cjb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f81158a.m31610i4(str);
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    public VerificationCenter m31618q4() {
        return e51.m114739D() ? m31612k4() : (VerificationCenter) CoreModule.f17553k.f91945h.query(CoreModule.m29931H().userId());
    }

    /* JADX INFO: renamed from: r4 */
    public void m31619r4(final String str) {
        this.f72126Q.scheduled("verificationFeedback" + str, -1, new v9j() { // from class: l.njb
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ia20.m135117a(new v9j() { // from class: l.lkb
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/verification/feedback")).m185893l(utc0.create(Network.JSON, "{\"scene\": \"" + str + "\"}")).m185883b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public StudentVerificationStatus m31620s4() {
        PicVerificationInfo picVerificationInfo;
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        return (verificationCenterM31612k4 == null || (picVerificationInfo = verificationCenterM31612k4.picVerificationInfo) == null) ? StudentVerificationStatus.get("unknown_") : picVerificationInfo.status;
    }

    /* JADX INFO: renamed from: t4 */
    public C22306c<ProfileEditInfo> m31621t4(ProfileEditInfo profileEditInfo) {
        return C22306c.just(null);
    }
}
