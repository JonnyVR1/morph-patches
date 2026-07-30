package com.p000p1.mobile.putong.core.api;

import android.annotation.SuppressLint;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0161d0;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.FeedbackQuestion;
import com.p1.mobile.putong.core.data.PicVerificationInfo;
import com.p1.mobile.putong.core.data.PictureVerifyRightedInfo;
import com.p1.mobile.putong.core.data.ProfileEditInfo;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.data.AgeVerificationPatchInfo;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.StudentVerificationStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.VerificationPatchInfo;
import com.p1.mobile.putong.data.VerificationToken;
import com.p1.mobile.putong.data.VerificationTokenIdentity;
import com.p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import l.d30;
import l.e51;
import l.hpd0;
import l.j760;
import l.k9j;
import l.mkd0;
import l.mqi0;
import l.pgm;
import l.rhi;
import l.roj0;
import l.tpd0;
import l.uqd0;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.ax6;
import p006l.ia20;
import p006l.la20;
import p006l.lsx;
import p006l.qib0;
import p006l.ura;
import rx.c;
import rx.subjects.a;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.d0 */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0161d0 extends ax6 {

    /* JADX INFO: renamed from: l0 */
    public static final String f3731l0;

    /* JADX INFO: renamed from: m0 */
    public static final String f3732m0;

    /* JADX INFO: renamed from: R */
    public hpd0 f3733R;

    /* JADX INFO: renamed from: S */
    public hpd0 f3734S;

    /* JADX INFO: renamed from: T */
    public hpd0 f3735T;

    /* JADX INFO: renamed from: U */
    public hpd0 f3736U;

    /* JADX INFO: renamed from: V */
    public hpd0 f3737V;

    /* JADX INFO: renamed from: W */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f3738W;

    /* JADX INFO: renamed from: X */
    public uqd0 f3739X;

    /* JADX INFO: renamed from: Y */
    public zpd0 f3740Y;

    /* JADX INFO: renamed from: Z */
    public zpd0 f3741Z;

    /* JADX INFO: renamed from: a0 */
    @SuppressLint({"SV_USE_DUP_ID"})
    public zpd0 f3742a0;

    /* JADX INFO: renamed from: b0 */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f3743b0;

    /* JADX INFO: renamed from: c0 */
    public uqd0 f3744c0;

    /* JADX INFO: renamed from: d0 */
    public zpd0 f3745d0;

    /* JADX INFO: renamed from: e0 */
    public zpd0 f3746e0;

    /* JADX INFO: renamed from: f0 */
    public zpd0 f3747f0;

    /* JADX INFO: renamed from: g0 */
    public tpd0 f3748g0;

    /* JADX INFO: renamed from: h0 */
    public uqd0 f3749h0;

    /* JADX INFO: renamed from: i0 */
    public hpd0 f3750i0;

    /* JADX INFO: renamed from: j0 */
    public a<Long> f3751j0;

    /* JADX INFO: renamed from: k0 */
    public final a<List<FeedbackQuestion>> f3752k0;

    static {
        String str = k9j.I() + "/sensetime/";
        f3731l0 = str;
        f3732m0 = str + "silent_liveness/silent_liveness_image.jpg";
    }

    public C0161d0(C0158c c0158c) {
        super(c0158c);
        String str = qib0.f19804b0.f17706a.userId() + "needShownTantanVerifiedDlg";
        Boolean bool = Boolean.FALSE;
        this.f3733R = new hpd0(str, bool);
        this.f3734S = new hpd0(qib0.f19804b0.f17706a.userId() + "needShownTantanRejectedDlg", bool);
        this.f3735T = new hpd0("needShownIdVerificationDlg", bool);
        this.f3736U = new hpd0(CoreModule.m1850H().userId() + "needShownPicVerifiedDlg", bool);
        this.f3737V = new hpd0(CoreModule.m1850H().userId() + "needShownPicRejectedDlg", bool);
        StringBuilder sb = new StringBuilder("picAndAvatarVerSwipeNotifyCount");
        sb.append(CoreModule.m1850H().userId());
        this.f3738W = new tpd0(sb.toString(), 0);
        this.f3739X = new uqd0("picAndAvatarVerSwipeNotifyDate" + CoreModule.m1850H().userId(), "");
        this.f3740Y = new zpd0("picAndAvatarVerSwipeCount" + CoreModule.m1850H().userId(), 0L);
        this.f3741Z = new zpd0("picFirstShowAndAvatarVerSwipeCount" + CoreModule.m1850H().userId(), 0L);
        this.f3742a0 = new zpd0("lastPicAndAvatarVerShowTime" + CoreModule.m1850H().userId(), 0L);
        this.f3743b0 = new tpd0("tantanAuthSwipeNotifyCount" + CoreModule.m1850H().userId(), 0);
        this.f3744c0 = new uqd0("tantanAuthSwipeDate" + CoreModule.m1850H().userId(), "");
        this.f3745d0 = new zpd0("tantanAuthSwipeCount" + CoreModule.m1850H().userId(), 0L);
        this.f3746e0 = new zpd0("continuousMaleLikeForVerify" + CoreModule.m1850H().userId(), 0L);
        this.f3747f0 = new zpd0("continuousFemaleDisLikeForVerify" + CoreModule.m1850H().userId(), 0L);
        this.f3748g0 = new tpd0("pic_verify_me_tab_red_dot_show_count" + CoreModule.m1850H().userId(), 0);
        this.f3749h0 = CoreModule.f1539h.f15450g;
        this.f3751j0 = a.c(0L);
        this.f3752k0 = a.b();
        this.f3750i0 = new hpd0("cert_center_entry_dot" + CoreModule.m1850H().userId(), bool);
    }

    /* JADX INFO: renamed from: A3 */
    public static /* synthetic */ VerificationToken m3480A3(Envelope envelope) {
        List list = envelope.getModuleData(CoreData.class).verificationTokens;
        if (vwb.J(list)) {
            return null;
        }
        return (VerificationToken) list.get(0);
    }

    /* JADX INFO: renamed from: E3 */
    public static /* synthetic */ VerificationCenter m3484E3(VerificationCenter verificationCenter) {
        Picture picture = verificationCenter.picVerificationInfo.media;
        if (TEnum.equals(((Media) picture).status, "raw") && (picture.size == null || ((Media) picture).mediaType == null)) {
            pgm pgmVar = new pgm(rhi.z(((Media) picture).url));
            picture.size = new Dimension(pgmVar.d);
            ((Media) picture).mediaType = pgmVar.c;
        }
        return verificationCenter;
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ c m3494O3(w9j w9jVar, VerificationCenter verificationCenter) {
        return (c) w9jVar.call(verificationCenter);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ c m3499e3(w9j w9jVar, VerificationCenter verificationCenter) {
        return (c) w9jVar.call(verificationCenter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ roj0 m3503h4(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ c m3505j3(final VerificationCenter verificationCenter) {
        if (verificationCenter.picVerificationInfo.media == null) {
            return c.just(verificationCenter);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(verificationCenter.picVerificationInfo.media);
        return new lsx(arrayList, false).flatMap(new w9j() { // from class: l.xjb
            public final Object call(Object obj) {
                return ya5.m28127I((List) obj, "pic_verification");
            }
        }).map(new w9j() { // from class: l.zjb
            public final Object call(Object obj) {
                return C0161d0.m3508m3(verificationCenter, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ VerificationPatchInfo m3507l3(AgeVerificationPatchInfo ageVerificationPatchInfo, List list) {
        VerificationPatchInfo verificationPatchInfoNew_ = VerificationPatchInfo.new_();
        ageVerificationPatchInfo.media = (Picture) list.get(0);
        verificationPatchInfoNew_.age = ageVerificationPatchInfo;
        return verificationPatchInfoNew_;
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ VerificationCenter m3508m3(VerificationCenter verificationCenter, List list) {
        VerificationCenter verificationCenterClone = verificationCenter.clone();
        verificationCenterClone.picVerificationInfo.media = (Picture) list.get(0);
        return verificationCenterClone;
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ c m3519x3(String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("actorUserID", str);
            jSONObject.put("otherUserID", str2);
        } catch (Exception unused) {
        }
        return ia20.m16567a(new v9j() { // from class: l.hjb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/picture-verification/invitation")).l(utc0.create(Network.JSON, jSONObject.toString())).b();
            }
        }).map(new w9j() { // from class: l.ijb
            public final Object call(Object obj) {
                return roj0.a;
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ void m3521z3(String str) {
        CoreModule.f1542k.f11200h.delete(CoreModule.m1850H().userId());
        qib0.f19813k0.f23551d.update(vwb.f0(new j760[]{vwb.Y(User.VERIFICATIONS_PICVERIFICATIONRESULT_VERIFIED, Boolean.FALSE)}), User.ID.EQ(str));
    }

    /* JADX INFO: renamed from: P3 */
    public c<roj0> m3522P3(double d) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("birthdate", Converter.dateToApiDateString(d));
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return this.f8580Q.now("checkBirthdayWithVerified", new la20(new v9j() { // from class: l.nkb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3143J0("/verifications/" + CoreModule.m1850H().userId() + "/check-birthdate")).l(utc0VarCreate).b();
            }
        }).map(new w9j() { // from class: l.okb
            public final Object call(Object obj) {
                return this.f18266a.m3529W3((Envelope) obj);
            }
        }).compose(C0154a.m3182T2()), false);
    }

    /* JADX INFO: renamed from: Q3 */
    public void m3523Q3(final String str, final String str2) {
        this.f8580Q.now((String) null, new la20(new v9j() { // from class: l.qkb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3142J(str, str2)).d().b();
            }
        }).map(new w9j() { // from class: l.djb
            public final Object call(Object obj) {
                return this.f10425a.m3530X3(str, (Envelope) obj);
            }
        }).compose(C0154a.m3182T2()));
    }

    /* JADX INFO: renamed from: R3 */
    public List<FeedbackQuestion> m3524R3() {
        return (List) this.f3752k0.e();
    }

    /* JADX INFO: renamed from: S3 */
    public c<VerificationToken> m3525S3() {
        final VerificationTokenRequestParam verificationTokenRequestParamNew_ = VerificationTokenRequestParam.new_();
        verificationTokenRequestParamNew_.appId = "1";
        verificationTokenRequestParamNew_.productId = "1";
        verificationTokenRequestParamNew_.verifyType = "picture";
        VerificationTokenIdentity verificationTokenIdentityNew_ = VerificationTokenIdentity.new_();
        verificationTokenRequestParamNew_.picture = verificationTokenIdentityNew_;
        verificationTokenIdentityNew_.provider = "manual";
        return this.f8580Q.scheduled("getManualToken", 0, new v9j() { // from class: l.tjb
            public final Object call() {
                return new ka20(new v9j() { // from class: l.ekb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3284t2(CoreModule.m1850H().userId())).l(utc0.create(Network.JSON, verificationTokenRequestParam.toJson())).b();
                    }
                }, Envelope.JSON_ADAPTER).compose(C0154a.m3182T2()).map(new w9j() { // from class: l.fkb
                    public final Object call(Object obj) {
                        return C0161d0.m3480A3((Envelope) obj);
                    }
                });
            }
        }, false);
    }

    /* JADX INFO: renamed from: T3 */
    public c<PictureVerifyRightedInfo> m3526T3() {
        return this.f8580Q.scheduled("getPicVerifyExtraInfo" + mqi0.o(), 0, new v9j() { // from class: l.pkb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.jjb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/picture-verify/righted/info")).f().b();
                    }
                }).map(new w9j() { // from class: l.kjb
                    public final Object call(Object obj) {
                        return ((Envelope) obj).getModuleData(CoreData.class).pictureVerifyRightedInfo;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public c<j760<List<FeedbackQuestion>, Integer>> m3527U3() {
        return this.f8580Q.scheduled("getQuestionsOfNotVerify", 0, new v9j() { // from class: l.sjb
            public final Object call() {
                return this.f21362a.m3532Z3();
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public c<roj0> m3528V3(final String str, final String str2) {
        return this.f8580Q.scheduled("invite_user_verify_" + str, -1, new v9j() { // from class: l.mkb
            public final Object call() {
                return C0161d0.m3519x3(str2, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ roj0 m3529W3(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ roj0 m3530X3(final String str, Envelope envelope) {
        this.f8580Q.f3598U.m13685a(new d30() { // from class: l.rjb
            public final void call() {
                C0161d0.m3521z3(str);
            }
        });
        return roj0.a;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ j760 m3531Y3(Envelope envelope) {
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        List list = moduleData.feedbackQuestions;
        this.f3752k0.onNext(list);
        return vwb.Y(list, Integer.valueOf(moduleData.feedbackRemainedNum));
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ c m3532Z3() {
        return ia20.m16567a(new v9j() { // from class: l.akb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3130G("/verification/feedback")).f().b();
            }
        }).map(new w9j() { // from class: l.bkb
            public final Object call(Object obj) {
                return this.f8938a.m3531Y3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ roj0 m3533a4(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ c m3534b4(final VerificationPatchInfo verificationPatchInfo) {
        return new la20(new v9j() { // from class: l.ckb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3209b(CoreModule.m1850H().userId())).k(utc0.create(Network.JSON, verificationPatchInfo.toJson())).b();
            }
        }).map(new w9j() { // from class: l.dkb
            public final Object call(Object obj) {
                return this.f10450a.m3533a4((Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ c m3535c4(final VerificationPatchInfo verificationPatchInfo) {
        return scheduled("patch_age_verification", -1, new v9j() { // from class: l.vjb
            public final Object call() {
                return this.f24345a.m3534b4(verificationPatchInfo);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ roj0 m3536d4(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ c m3537e4(final VerificationCenter verificationCenter) {
        return new la20(new v9j() { // from class: l.gkb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3295w1(CoreModule.m1850H().userId())).l(utc0.create(Network.JSON, verificationCenter.toJson())).b();
            }
        }).map(new w9j() { // from class: l.hkb
            public final Object call(Object obj) {
                return this.f13923a.m3539g4((Envelope) obj);
            }
        }).compose(mkd0.C());
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ c m3538f4(final VerificationCenter verificationCenter) {
        return this.f8580Q.scheduled("postPicVerificationInfo", -1, new v9j() { // from class: l.wjb
            public final Object call() {
                return this.f25182a.m3537e4(verificationCenter);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ roj0 m3539g4(Envelope envelope) {
        this.f8580Q.m3422w3(envelope, null);
        return roj0.a;
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ c m3540i4(final String str) {
        return new la20(new v9j() { // from class: l.yjb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3291v1(str)).f().b();
            }
        }).map(new w9j() { // from class: l.jkb
            public final Object call(Object obj) {
                return this.f15192a.m3503h4((Envelope) obj);
            }
        }).compose(C0154a.m3182T2());
    }

    /* JADX INFO: renamed from: j4 */
    public c<VerificationCenter> m3541j4() {
        return CoreModule.f1542k.f11200h.uiGet(CoreModule.m1850H().userId());
    }

    /* JADX INFO: renamed from: k4 */
    public VerificationCenter m3542k4() {
        return CoreModule.f1542k.f11200h.queryCache(CoreModule.m1850H().userId());
    }

    /* JADX INFO: renamed from: l4 */
    public j760<Boolean, Boolean> m3543l4() {
        boolean zM5667O = ura.m25555e().m25559d().m5667O();
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        VerificationCenter verificationCenterM3542k4 = CoreModule.f1534c.f3541B0.m3542k4();
        boolean z = false;
        if (ura.m25555e().m25559d().m5667O() && (userM21490p9.isIdCardVerified() || (NullChecker.a(verificationCenterM3542k4) && NullChecker.a(verificationCenterM3542k4.idCard) && (TEnum.equals(verificationCenterM3542k4.idCard.status, "pending") || TEnum.equals(verificationCenterM3542k4.idCard.status, "verified"))))) {
            zM5667O = false;
        }
        if (!userM21490p9.isPicVerificationVerified() && (!NullChecker.a(verificationCenterM3542k4) || !NullChecker.a(verificationCenterM3542k4.picVerificationInfo) || (!TEnum.equals(verificationCenterM3542k4.picVerificationInfo.status, "pending") && !TEnum.equals(verificationCenterM3542k4.picVerificationInfo.status, "verified")))) {
            z = true;
        }
        return vwb.Y(Boolean.valueOf(z), Boolean.valueOf(zM5667O));
    }

    /* JADX INFO: renamed from: m4 */
    public c<roj0> m3544m4(List<Media> list, final AgeVerificationPatchInfo ageVerificationPatchInfo) {
        return new lsx(list, false).flatMap(new w9j() { // from class: l.ejb
            public final Object call(Object obj) {
                return ya5.m28127I((List) obj, "age_verification");
            }
        }).map(new w9j() { // from class: l.fjb
            public final Object call(Object obj) {
                return C0161d0.m3507l3(ageVerificationPatchInfo, (List) obj);
            }
        }).compose(mkd0.Q()).flatMap(new w9j() { // from class: l.gjb
            public final Object call(Object obj) {
                return this.f13338a.m3535c4((VerificationPatchInfo) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public c<roj0> m3545n4(String str) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("url", str);
            jSONObject3.put("mediaType", "video/mp4");
            jSONObject2.put("provider", "manual");
            jSONObject2.put("media", jSONObject3);
            jSONObject.put("picture", jSONObject2);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return this.f8580Q.now("patchManualFaceVerification", new la20(new v9j() { // from class: l.ikb
            public final Object call() {
                return C0154a.f3483P.auth().q(C0154a.m3150L(CoreModule.m1850H().userId())).k(utc0VarCreate).b();
            }
        }).map(new w9j() { // from class: l.kkb
            public final Object call(Object obj) {
                return this.f15862a.m3536d4((Envelope) obj);
            }
        }).compose(C0154a.m3182T2()), false);
    }

    /* JADX INFO: renamed from: o4 */
    public c<roj0> m3546o4(final VerificationCenter verificationCenter) {
        v9j v9jVar = new v9j() { // from class: l.ljb
            public final Object call() {
                return c.fromCallable(new Callable() { // from class: l.ujb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C0161d0.m3484E3(verificationCenter);
                    }
                });
            }
        };
        final w9j w9jVar = new w9j() { // from class: l.mjb
            public final Object call(Object obj) {
                return C0161d0.m3505j3((VerificationCenter) obj);
            }
        };
        final w9j w9jVar2 = new w9j() { // from class: l.ojb
            public final Object call(Object obj) {
                return this.f18257a.m3538f4((VerificationCenter) obj);
            }
        };
        return ((c) v9jVar.call()).flatMap(new w9j() { // from class: l.pjb
            public final Object call(Object obj) {
                return C0161d0.m3494O3(w9jVar, (VerificationCenter) obj);
            }
        }).compose(mkd0.Q()).flatMap(new w9j() { // from class: l.qjb
            public final Object call(Object obj) {
                return C0161d0.m3499e3(w9jVar2, (VerificationCenter) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public c<roj0> m3547p4(final String str) {
        return this.f8580Q.scheduled("verification/" + str, 0, new v9j() { // from class: l.cjb
            public final Object call() {
                return this.f9677a.m3540i4(str);
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    public VerificationCenter m3548q4() {
        return e51.D() ? m3542k4() : CoreModule.f1542k.f11200h.query(CoreModule.m1850H().userId());
    }

    /* JADX INFO: renamed from: r4 */
    public void m3549r4(final String str) {
        this.f8580Q.scheduled("verificationFeedback" + str, -1, new v9j() { // from class: l.njb
            public final Object call() {
                return ia20.m16567a(new v9j() { // from class: l.lkb
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/verification/feedback")).l(utc0.create(Network.JSON, "{\"scene\": \"" + str + "\"}")).b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public StudentVerificationStatus m3550s4() {
        PicVerificationInfo picVerificationInfo;
        VerificationCenter verificationCenterM3542k4 = CoreModule.f1534c.f3541B0.m3542k4();
        return (verificationCenterM3542k4 == null || (picVerificationInfo = verificationCenterM3542k4.picVerificationInfo) == null) ? StudentVerificationStatus.get("unknown_") : picVerificationInfo.status;
    }

    /* JADX INFO: renamed from: t4 */
    public c<ProfileEditInfo> m3551t4(ProfileEditInfo profileEditInfo) {
        return c.just((Object) null);
    }
}
