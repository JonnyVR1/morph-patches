package com.p051p1.mobile.putong.core.api;

import android.annotation.SuppressLint;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4886d0;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.FeedbackQuestion;
import com.p051p1.mobile.putong.core.data.PicVerificationInfo;
import com.p051p1.mobile.putong.core.data.PictureVerifyRightedInfo;
import com.p051p1.mobile.putong.core.data.ProfileEditInfo;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.data.AgeVerificationPatchInfo;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.StudentVerificationStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VerificationPatchInfo;
import com.p051p1.mobile.putong.data.VerificationToken;
import com.p051p1.mobile.putong.data.VerificationTokenIdentity;
import com.p051p1.mobile.putong.data.VerificationTokenRequestParam;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.byd0;
import p153l.dy6;
import p153l.ecj;
import p153l.gta;
import p153l.i1y;
import p153l.jxd0;
import p153l.jyb;
import p153l.l51;
import p153l.oki;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.qi20;
import p153l.sim;
import p153l.ti20;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vxd0;
import p153l.wyd0;
import p153l.x20;
import p153l.z1d0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.d0 */
/* JADX INFO: loaded from: classes9.dex */
public class C4886d0 extends dy6 {

    /* JADX INFO: renamed from: l0 */
    public static final String f20484l0;

    /* JADX INFO: renamed from: m0 */
    public static final String f20485m0;

    /* JADX INFO: renamed from: R */
    public jxd0 f20486R;

    /* JADX INFO: renamed from: S */
    public jxd0 f20487S;

    /* JADX INFO: renamed from: T */
    public jxd0 f20488T;

    /* JADX INFO: renamed from: U */
    public jxd0 f20489U;

    /* JADX INFO: renamed from: V */
    public jxd0 f20490V;

    /* JADX INFO: renamed from: W */
    @SuppressLint({"SV_USE_DUP_ID"})
    public vxd0 f20491W;

    /* JADX INFO: renamed from: X */
    public wyd0 f20492X;

    /* JADX INFO: renamed from: Y */
    public byd0 f20493Y;

    /* JADX INFO: renamed from: Z */
    public byd0 f20494Z;

    /* JADX INFO: renamed from: a0 */
    @SuppressLint({"SV_USE_DUP_ID"})
    public byd0 f20495a0;

    /* JADX INFO: renamed from: b0 */
    @SuppressLint({"SV_USE_DUP_ID"})
    public vxd0 f20496b0;

    /* JADX INFO: renamed from: c0 */
    public wyd0 f20497c0;

    /* JADX INFO: renamed from: d0 */
    public byd0 f20498d0;

    /* JADX INFO: renamed from: e0 */
    public byd0 f20499e0;

    /* JADX INFO: renamed from: f0 */
    public byd0 f20500f0;

    /* JADX INFO: renamed from: g0 */
    public vxd0 f20501g0;

    /* JADX INFO: renamed from: h0 */
    public wyd0 f20502h0;

    /* JADX INFO: renamed from: i0 */
    public jxd0 f20503i0;

    /* JADX INFO: renamed from: j0 */
    public C22507a<Long> f20504j0;

    /* JADX INFO: renamed from: k0 */
    public final C22507a<List<FeedbackQuestion>> f20505k0;

    static {
        String str = ecj.m120375I() + "/sensetime/";
        f20484l0 = str;
        f20485m0 = str + "silent_liveness/silent_liveness_image.jpg";
    }

    public C4886d0(C4883c c4883c) {
        super(c4883c);
        String str = uqb0.f180396b0.f170324a.userId() + "needShownTantanVerifiedDlg";
        Boolean bool = Boolean.FALSE;
        this.f20486R = new jxd0(str, bool);
        this.f20487S = new jxd0(uqb0.f180396b0.f170324a.userId() + "needShownTantanRejectedDlg", bool);
        this.f20488T = new jxd0("needShownIdVerificationDlg", bool);
        this.f20489U = new jxd0(CoreModule.m30929H().userId() + "needShownPicVerifiedDlg", bool);
        this.f20490V = new jxd0(CoreModule.m30929H().userId() + "needShownPicRejectedDlg", bool);
        StringBuilder sb = new StringBuilder("picAndAvatarVerSwipeNotifyCount");
        sb.append(CoreModule.m30929H().userId());
        this.f20491W = new vxd0(sb.toString(), 0);
        this.f20492X = new wyd0("picAndAvatarVerSwipeNotifyDate" + CoreModule.m30929H().userId(), "");
        this.f20493Y = new byd0("picAndAvatarVerSwipeCount" + CoreModule.m30929H().userId(), 0L);
        this.f20494Z = new byd0("picFirstShowAndAvatarVerSwipeCount" + CoreModule.m30929H().userId(), 0L);
        this.f20495a0 = new byd0("lastPicAndAvatarVerShowTime" + CoreModule.m30929H().userId(), 0L);
        this.f20496b0 = new vxd0("tantanAuthSwipeNotifyCount" + CoreModule.m30929H().userId(), 0);
        this.f20497c0 = new wyd0("tantanAuthSwipeDate" + CoreModule.m30929H().userId(), "");
        this.f20498d0 = new byd0("tantanAuthSwipeCount" + CoreModule.m30929H().userId(), 0L);
        this.f20499e0 = new byd0("continuousMaleLikeForVerify" + CoreModule.m30929H().userId(), 0L);
        this.f20500f0 = new byd0("continuousFemaleDisLikeForVerify" + CoreModule.m30929H().userId(), 0L);
        this.f20501g0 = new vxd0("pic_verify_me_tab_red_dot_show_count" + CoreModule.m30929H().userId(), 0);
        this.f20502h0 = CoreModule.f18269h.f186117g;
        this.f20504j0 = C22507a.m222759c(0L);
        this.f20505k0 = C22507a.m222758b();
        this.f20503i0 = new jxd0("cert_center_entry_dot" + CoreModule.m30929H().userId(), bool);
    }

    /* JADX INFO: renamed from: A3 */
    public static /* synthetic */ VerificationToken m32553A3(Envelope envelope) {
        List<VerificationToken> list = ((CoreData) envelope.getModuleData(CoreData.class)).verificationTokens;
        if (jyb.m147479J(list)) {
            return null;
        }
        return list.get(0);
    }

    /* JADX INFO: renamed from: E3 */
    public static /* synthetic */ VerificationCenter m32557E3(VerificationCenter verificationCenter) {
        Picture picture = verificationCenter.picVerificationInfo.media;
        if (TEnum.equals(picture.status, "raw") && (picture.size == null || picture.mediaType == null)) {
            sim simVar = new sim(oki.m168038z(picture.url));
            picture.size = new Dimension(simVar.f168843d);
            picture.mediaType = simVar.f168842c;
        }
        return verificationCenter;
    }

    /* JADX INFO: renamed from: O3 */
    public static /* synthetic */ C22421c m32567O3(qcj qcjVar, VerificationCenter verificationCenter) {
        return (C22421c) qcjVar.call(verificationCenter);
    }

    /* JADX INFO: renamed from: e3 */
    public static /* synthetic */ C22421c m32572e3(qcj qcjVar, VerificationCenter verificationCenter) {
        return (C22421c) qcjVar.call(verificationCenter);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ uxj0 m32576h4(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ C22421c m32578j3(final VerificationCenter verificationCenter) {
        if (verificationCenter.picVerificationInfo.media == null) {
            return C22421c.just(verificationCenter);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(verificationCenter.picVerificationInfo.media);
        return new i1y(arrayList, false).flatMap(new qcj() { // from class: l.llb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yb5.m214980I((List) obj, "pic_verification");
            }
        }).map(new qcj() { // from class: l.nlb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4886d0.m32581m3(verificationCenter, (List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l3 */
    public static /* synthetic */ VerificationPatchInfo m32580l3(AgeVerificationPatchInfo ageVerificationPatchInfo, List list) {
        VerificationPatchInfo verificationPatchInfoNew_ = VerificationPatchInfo.new_();
        ageVerificationPatchInfo.media = (Picture) list.get(0);
        verificationPatchInfoNew_.age = ageVerificationPatchInfo;
        return verificationPatchInfoNew_;
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ VerificationCenter m32581m3(VerificationCenter verificationCenter, List list) {
        VerificationCenter verificationCenterMo225055clone = verificationCenter.mo225055clone();
        verificationCenterMo225055clone.picVerificationInfo.media = (Picture) list.get(0);
        return verificationCenterMo225055clone;
    }

    /* JADX INFO: renamed from: x3 */
    public static /* synthetic */ C22421c m32592x3(String str, String str2) {
        final JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("actorUserID", str);
            jSONObject.put("otherUserID", str2);
        } catch (Exception unused) {
        }
        return qi20.m176654a(new pcj() { // from class: l.vkb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/picture-verification/invitation")).m209038l(z1d0.create(Network.JSON, jSONObject.toString())).m209028b();
            }
        }).map(new qcj() { // from class: l.wkb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return uxj0.f181467a;
            }
        });
    }

    /* JADX INFO: renamed from: z3 */
    public static /* synthetic */ void m32594z3(String str) {
        CoreModule.f18272k.f115540h.delete(CoreModule.m30929H().userId());
        uqb0.f180405k0.f184355d.update(jyb.m147507f0(jyb.m147494Y(User.VERIFICATIONS_PICVERIFICATIONRESULT_VERIFIED, Boolean.FALSE)), User.f39673ID.mo61359EQ(str));
    }

    /* JADX INFO: renamed from: P3 */
    public C22421c<uxj0> m32595P3(double d) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("birthdate", Converter.dateToApiDateString(d));
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            string = "";
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, string);
        return this.f91137Q.now("checkBirthdayWithVerified", new ti20(new pcj() { // from class: l.bmb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32216J0("/verifications/" + CoreModule.m30929H().userId() + "/check-birthdate")).m209038l(z1d0VarCreate).m209028b();
            }
        }).map(new qcj() { // from class: l.cmb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f82565a.m32602W3((Envelope) obj);
            }
        }).compose(C4879a.m32255T2()), false);
    }

    /* JADX INFO: renamed from: Q3 */
    public void m32596Q3(final String str, final String str2) {
        this.f91137Q.now(null, new ti20(new pcj() { // from class: l.emb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32215J(str, str2)).m209030d().m209028b();
            }
        }).map(new qcj() { // from class: l.rkb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163554a.m32603X3(str, (Envelope) obj);
            }
        }).compose(C4879a.m32255T2()));
    }

    /* JADX INFO: renamed from: R3 */
    public List<FeedbackQuestion> m32597R3() {
        return this.f20505k0.m222761e();
    }

    /* JADX INFO: renamed from: S3 */
    public C22421c<VerificationToken> m32598S3() {
        final VerificationTokenRequestParam verificationTokenRequestParamNew_ = VerificationTokenRequestParam.new_();
        verificationTokenRequestParamNew_.appId = "1";
        verificationTokenRequestParamNew_.productId = "1";
        verificationTokenRequestParamNew_.verifyType = "picture";
        VerificationTokenIdentity verificationTokenIdentityNew_ = VerificationTokenIdentity.new_();
        verificationTokenRequestParamNew_.picture = verificationTokenIdentityNew_;
        verificationTokenIdentityNew_.provider = "manual";
        return this.f91137Q.scheduled("getManualToken", 0, new pcj() { // from class: l.hlb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new si20(new pcj() { // from class: l.slb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32357t2(CoreModule.m30929H().userId())).m209038l(z1d0.create(Network.JSON, verificationTokenRequestParam.toJson())).m209028b();
                    }
                }, Envelope.JSON_ADAPTER).compose(C4879a.m32255T2()).map(new qcj() { // from class: l.tlb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4886d0.m32553A3((Envelope) obj);
                    }
                });
            }
        }, false);
    }

    /* JADX INFO: renamed from: T3 */
    public C22421c<PictureVerifyRightedInfo> m32599T3() {
        return this.f91137Q.scheduled("getPicVerifyExtraInfo" + pzi0.m174454o(), 0, new pcj() { // from class: l.dmb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.xkb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/picture-verify/righted/info")).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.ykb
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).pictureVerifyRightedInfo;
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: U3 */
    public C22421c<pf60<List<FeedbackQuestion>, Integer>> m32600U3() {
        return this.f91137Q.scheduled("getQuestionsOfNotVerify", 0, new pcj() { // from class: l.glb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f104834a.m32605Z3();
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public C22421c<uxj0> m32601V3(final String str, final String str2) {
        return this.f91137Q.scheduled("invite_user_verify_" + str, -1, new pcj() { // from class: l.amb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4886d0.m32592x3(str2, str);
            }
        }, false);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ uxj0 m32602W3(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ uxj0 m32603X3(final String str, Envelope envelope) {
        this.f91137Q.f20351U.m128074a(new x20() { // from class: l.flb
            @Override // p153l.x20
            public final void call() {
                C4886d0.m32594z3(str);
            }
        });
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ pf60 m32604Y3(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        List<FeedbackQuestion> list = coreData.feedbackQuestions;
        this.f20505k0.m137019l(list);
        return jyb.m147494Y(list, Integer.valueOf(coreData.feedbackRemainedNum));
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ C22421c m32605Z3() {
        return qi20.m176654a(new pcj() { // from class: l.olb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/verification/feedback")).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.plb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f153017a.m32604Y3((Envelope) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ uxj0 m32606a4(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ C22421c m32607b4(final VerificationPatchInfo verificationPatchInfo) {
        return new ti20(new pcj() { // from class: l.qlb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32282b(CoreModule.m30929H().userId())).m209037k(z1d0.create(Network.JSON, verificationPatchInfo.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.rlb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f163711a.m32606a4((Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ C22421c m32608c4(final VerificationPatchInfo verificationPatchInfo) {
        return scheduled("patch_age_verification", -1, new pcj() { // from class: l.jlb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f121540a.m32607b4(verificationPatchInfo);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ uxj0 m32609d4(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ C22421c m32610e4(final VerificationCenter verificationCenter) {
        return new ti20(new pcj() { // from class: l.ulb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32368w1(CoreModule.m30929H().userId())).m209038l(z1d0.create(Network.JSON, verificationCenter.toJson())).m209028b();
            }
        }).map(new qcj() { // from class: l.vlb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f184555a.m32612g4((Envelope) obj);
            }
        }).compose(psd0.m173592C());
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ C22421c m32611f4(final VerificationCenter verificationCenter) {
        return this.f91137Q.scheduled("postPicVerificationInfo", -1, new pcj() { // from class: l.klb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f127358a.m32610e4(verificationCenter);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ uxj0 m32612g4(Envelope envelope) {
        this.f91137Q.m32495w3(envelope, null);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: i4 */
    public final /* synthetic */ C22421c m32613i4(final String str) {
        return new ti20(new pcj() { // from class: l.mlb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32364v1(str)).m209032f().m209028b();
            }
        }).map(new qcj() { // from class: l.xlb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f194939a.m32576h4((Envelope) obj);
            }
        }).compose(C4879a.m32255T2());
    }

    /* JADX INFO: renamed from: j4 */
    public C22421c<VerificationCenter> m32614j4() {
        return CoreModule.f18272k.f115540h.uiGet(CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: k4 */
    public VerificationCenter m32615k4() {
        return (VerificationCenter) CoreModule.f18272k.f115540h.queryCache(CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: l4 */
    public pf60<Boolean, Boolean> m32616l4() {
        boolean zMo34733O = gta.m132210e().m132214d().mo34733O();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        boolean z = false;
        if (gta.m132210e().m132214d().mo34733O() && (userM116600p9.isIdCardVerified() || (NullChecker.m82486a(verificationCenterM32615k4) && NullChecker.m82486a(verificationCenterM32615k4.idCard) && (TEnum.equals(verificationCenterM32615k4.idCard.status, "pending") || TEnum.equals(verificationCenterM32615k4.idCard.status, "verified"))))) {
            zMo34733O = false;
        }
        if (!userM116600p9.isPicVerificationVerified() && (!NullChecker.m82486a(verificationCenterM32615k4) || !NullChecker.m82486a(verificationCenterM32615k4.picVerificationInfo) || (!TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending") && !TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")))) {
            z = true;
        }
        return jyb.m147494Y(Boolean.valueOf(z), Boolean.valueOf(zMo34733O));
    }

    /* JADX INFO: renamed from: m4 */
    public C22421c<uxj0> m32617m4(List<Media> list, final AgeVerificationPatchInfo ageVerificationPatchInfo) {
        return new i1y(list, false).flatMap(new qcj() { // from class: l.skb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return yb5.m214980I((List) obj, "age_verification");
            }
        }).map(new qcj() { // from class: l.tkb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4886d0.m32580l3(ageVerificationPatchInfo, (List) obj);
            }
        }).compose(psd0.m173606Q()).flatMap(new qcj() { // from class: l.ukb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f179382a.m32608c4((VerificationPatchInfo) obj);
            }
        });
    }

    /* JADX INFO: renamed from: n4 */
    public C22421c<uxj0> m32618n4(String str) {
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
            CrashHelper.m82479c(e);
            string = "";
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, string);
        return this.f91137Q.now("patchManualFaceVerification", new ti20(new pcj() { // from class: l.wlb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C4879a.f20236P.auth().m209043q(C4879a.m32223L(CoreModule.m30929H().userId())).m209037k(z1d0VarCreate).m209028b();
            }
        }).map(new qcj() { // from class: l.ylb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f200542a.m32609d4((Envelope) obj);
            }
        }).compose(C4879a.m32255T2()), false);
    }

    /* JADX INFO: renamed from: o4 */
    public C22421c<uxj0> m32619o4(final VerificationCenter verificationCenter) {
        pcj pcjVar = new pcj() { // from class: l.zkb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C22421c.fromCallable(new Callable() { // from class: l.ilb
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return C4886d0.m32557E3(verificationCenter);
                    }
                });
            }
        };
        final qcj qcjVar = new qcj() { // from class: l.alb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4886d0.m32578j3((VerificationCenter) obj);
            }
        };
        final qcj qcjVar2 = new qcj() { // from class: l.clb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f82364a.m32611f4((VerificationCenter) obj);
            }
        };
        return ((C22421c) pcjVar.call()).flatMap(new qcj() { // from class: l.dlb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4886d0.m32567O3(qcjVar, (VerificationCenter) obj);
            }
        }).compose(psd0.m173606Q()).flatMap(new qcj() { // from class: l.elb
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4886d0.m32572e3(qcjVar2, (VerificationCenter) obj);
            }
        });
    }

    /* JADX INFO: renamed from: p4 */
    public C22421c<uxj0> m32620p4(final String str) {
        return this.f91137Q.scheduled("verification/" + str, 0, new pcj() { // from class: l.qkb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f158118a.m32613i4(str);
            }
        });
    }

    /* JADX INFO: renamed from: q4 */
    public VerificationCenter m32621q4() {
        return l51.m152884D() ? m32615k4() : (VerificationCenter) CoreModule.f18272k.f115540h.query(CoreModule.m30929H().userId());
    }

    /* JADX INFO: renamed from: r4 */
    public void m32622r4(final String str) {
        this.f91137Q.scheduled("verificationFeedback" + str, -1, new pcj() { // from class: l.blb
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return qi20.m176654a(new pcj() { // from class: l.zlb
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/verification/feedback")).m209038l(z1d0.create(Network.JSON, "{\"scene\": \"" + str + "\"}")).m209028b();
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: s4 */
    public StudentVerificationStatus m32623s4() {
        PicVerificationInfo picVerificationInfo;
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        return (verificationCenterM32615k4 == null || (picVerificationInfo = verificationCenterM32615k4.picVerificationInfo) == null) ? StudentVerificationStatus.get("unknown_") : picVerificationInfo.status;
    }

    /* JADX INFO: renamed from: t4 */
    public C22421c<ProfileEditInfo> m32624t4(ProfileEditInfo profileEditInfo) {
        return C22421c.just(null);
    }
}
