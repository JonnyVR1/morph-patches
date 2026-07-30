package com.p000p1.mobile.putong.core.api;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.sdk.app.AuthTask;
import com.p000p1.mobile.putong.app.C0125a;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.api.CoreCommonServiceImpl;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Identity;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.Reminder;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService;
import com.p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p1.mobile.putong.data.Contract;
import com.p1.mobile.putong.data.ContractEnvelope;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.UploadSource;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l.d30;
import l.e30;
import l.gl5;
import l.j760;
import l.jqa;
import l.kqa;
import l.l3f;
import l.mkd0;
import l.op8;
import l.oqa;
import l.qy4;
import l.roj0;
import l.ry4;
import l.stc0;
import l.v9j;
import l.vrx;
import l.vwb;
import l.w9j;
import l.ygh0;
import l.yij0;
import l.zvf0;
import p006l.C1000m2;
import p006l.ek8;
import p006l.ku6;
import p006l.pp8;
import p006l.ura;
import p006l.xh5;
import p006l.ya5;
import rx.c;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Route(name = "putong-common 使用的 core 服务", path = "/core_common_service/service")
public class CoreCommonServiceImpl implements CoreCommonService {

    /* JADX INFO: renamed from: a */
    public C1000m2 f3159a = new ku6();

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ roj0 m2020F(a aVar, ContractEnvelope contractEnvelope) {
        aVar.onNext((ArrayList) contractEnvelope.data.contracts);
        return roj0.a;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ Picture m2023K(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ Picture m2024L(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m2025M(Throwable th, roj0 roj0Var) {
        if (CoreModule.m1851K().me_().isJailedOrRestrict()) {
            ura.m25555e().m25559d().m5702Vc();
        } else {
            yij0.G(th);
        }
    }

    /* JADX INFO: renamed from: A2 */
    public vrx m2028A2() {
        return new oqa();
    }

    /* JADX INFO: renamed from: C3 */
    public c<Boolean> m2029C3(String str) {
        return CoreModule.f1534c.f3559H0.m27565z4(str);
    }

    /* JADX INFO: renamed from: G */
    public C0125a m2030G(PutongAct putongAct) {
        return ura.m25555e().m25559d().m5625G(putongAct);
    }

    /* JADX INFO: renamed from: I */
    public boolean m2031I(Envelope envelope) {
        Identity identity;
        return (vwb.J(envelope.getModuleData(CoreData.class).verificationCenter) || (identity = ((VerificationCenter) envelope.getModuleData(CoreData.class).verificationCenter.get(0)).identity) == null || !TEnum.equals(identity.status, "verified")) ? false : true;
    }

    /* JADX INFO: renamed from: L0 */
    public vrx m2032L0() {
        return new qy4();
    }

    /* JADX INFO: renamed from: P1 */
    public String m2033P1() {
        return ygh0.f;
    }

    /* JADX INFO: renamed from: P4 */
    public vrx m2034P4() {
        return new ry4();
    }

    /* JADX INFO: renamed from: R3 */
    public void m2035R3(final Throwable th) {
        if (CoreModule.m1851K().me_().isJailedOrRestrict()) {
            ura.m25555e().m25559d().m5702Vc();
        } else {
            CoreModule.m1851K().refreshUser(CoreModule.m1850H().userId()).subscribe(mkd0.H(new e30() { // from class: l.po7
                public final void call(Object obj) {
                    CoreCommonServiceImpl.m2025M(th, (roj0) obj);
                }
            }, new e30() { // from class: l.qo7
                public final void call(Object obj) {
                    yij0.G(th);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: T3 */
    public void m2036T3(Envelope envelope, HashSet<String> hashSet, Integer num) {
        String str;
        String str2;
        CoreData moduleData = envelope.getModuleData(CoreData.class);
        for (Message message : moduleData.messages) {
            if (!User.isTeamAccount(message.cid) || message.moment == null) {
                message.localInConversation = (xh5.MESSAGE_IN_CONVERSATION & num.intValue()) != 0;
            } else {
                message.localInConversation = false;
            }
            Boolean bool = message.recalled;
            if (bool != null && bool.booleanValue()) {
                message.localInMoment = false;
            } else if ((num.intValue() & xh5.INFER_INVALID_MOMENT_REFERENCE) != 0 && (str2 = message.likeOfMoment) != null && !hashSet.contains(str2)) {
                message.likeOfMoment = ek8.f11194t;
                message.localInMoment = false;
            } else if ((num.intValue() & xh5.INFER_INVALID_MOMENT_REFERENCE) != 0 && (str = message.moment) != null && !hashSet.contains(str)) {
                message.moment = ek8.f11194t;
                message.localInMoment = false;
            } else if (User.isTeamAccount(message.cid)) {
                message.localInMoment = true;
            } else {
                message.localInMoment = ((xh5.MESSAGE_IN_MOMENTS & num.intValue()) == 0 || message.moment == null) ? false : true;
            }
        }
        for (Reminder reminder : moduleData.reminders) {
            if (TEnum.equals(reminder.reference.type, "moment") && (num.intValue() & xh5.INFER_INVALID_MOMENT_REFERENCE) != 0) {
                reminder.moment = hashSet.contains(reminder.reference.id) ? reminder.reference.id : ek8.f11194t;
            }
        }
    }

    /* JADX INFO: renamed from: U4 */
    public boolean m2037U4() {
        return CoreModule.f1534c == null;
    }

    /* JADX INFO: renamed from: X4 */
    public boolean m2038X4() {
        if (m2044km()) {
            return false;
        }
        return ((Boolean) gl5.a.get()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y1 */
    public c<Picture> m2039Y1(Picture picture) {
        return ya5.m28127I(vwb.f0(new Media[]{picture}), "profile").map(new w9j() { // from class: l.no7
            public final Object call(Object obj) {
                return CoreCommonServiceImpl.m2024L((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public op8 m2040a() {
        return pp8.m21639l();
    }

    /* JADX INFO: renamed from: a3 */
    public int m2041a3() {
        return 9000;
    }

    public c<j760<Integer, String>> alipayAuthWithErrorCode(AuthTask authTask) {
        return CoreModule.f1534c.f3559H0.m27535k4(authTask);
    }

    /* JADX INFO: renamed from: c2 */
    public void m2042c2(final PutongAct putongAct, final d30 d30Var) {
        putongAct.dialog().t0(R$string.f2647k4, new Runnable() { // from class: l.so7
            @Override // java.lang.Runnable
            public final void run() {
                ura.m25555e().m25559d().m5649Jo(putongAct, d30Var);
            }
        }).F("绑定支付宝前请先绑定手机号").k0(R$string.f2397c).B(false).z0();
    }

    public Counter counter_() {
        return CoreModule.f1534c.m3414o3();
    }

    public Intent getMainActIntent(Context context) {
        return ura.m25555e().m25559d().getMainActIntent(context);
    }

    public User getUserByIdInModule(String str) {
        return CoreModule.f1534c.f3628e0.m21393Pa(str);
    }

    public void init(Context context) {
    }

    /* JADX INFO: renamed from: j0 */
    public vrx m2043j0() {
        return new kqa();
    }

    /* JADX INFO: renamed from: km */
    public boolean m2044km() {
        return ura.m25555e().m25559d().m5811km();
    }

    /* JADX INFO: renamed from: l3 */
    public c<List<Picture>> m2045l3(List<Media> list) {
        return ya5.m28129K(list, "report", null, UploadSource.get("report")).map(new w9j() { // from class: l.to7
            public final Object call(Object obj) {
                return vwb.Q((List) obj, new w9j() { // from class: l.uo7
                    public final Object call(Object obj2) {
                        return CoreCommonServiceImpl.m2023K((Media) obj2);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: l5 */
    public vrx m2046l5() {
        return new jqa();
    }

    /* JADX INFO: renamed from: me */
    public c<User> m2047me() {
        return CoreModule.f1534c.f3628e0.m21486o9();
    }

    public User me_() {
        return CoreModule.f1534c.f3628e0.m21490p9();
    }

    public void mergeNetworkStateIntoLocalState(Envelope envelope, d30 d30Var) {
        CoreModule.m1851K().mergeNetworkStateIntoLocalState(envelope, d30Var);
    }

    public void pollUserCounters() {
        CoreModule.f1534c.f3628e0.m21360H9();
    }

    public User queryMe() {
        return CoreModule.f1534c.f3628e0.m21392P9();
    }

    /* JADX INFO: renamed from: r */
    public void m2048r(Act act) {
        ura.m25555e().m25559d().m5849r(act);
    }

    public void trackPlayerBlockTime(long j, String str, String str2) {
        if (j <= 200 || TextUtils.isEmpty(str)) {
            return;
        }
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(j);
        l3f l3fVar = new l3f();
        l3fVar.d = EventNameEnum.SYS_CHECK;
        str.getClass();
        String str3 = "moments";
        switch (str) {
            case "from_nearby_falls_feed":
                l3fVar.s = "e_VideoStuck_feed";
                l3fVar.n = "p_nearby";
                str3 = "nearby";
                break;
            case "moments":
                l3fVar.s = "e_VideoStuck_feed";
                l3fVar.n = "p_moment_fullscreen_view";
                break;
            case "from_nearby_focus":
                l3fVar.s = "e_VideoStuck_feed";
                l3fVar.n = "p_follow";
                str3 = "follow";
                break;
            case "home_card":
                l3fVar.s = "e_VideoStuck_profile";
                l3fVar.n = "p_suggest_user_profile_info_view";
            default:
                str3 = "";
                break;
        }
        map.put("duration", strValueOf);
        map.put("tag", str3);
        if (!TextUtils.isEmpty(str2)) {
            map.put("url", str2);
        }
        if (TextUtils.isEmpty(l3fVar.s)) {
            return;
        }
        zvf0.n(l3fVar, map);
    }

    /* JADX INFO: renamed from: u4 */
    public c<AlipayAuthEnvelop> m2049u4(String str, String str2) {
        return CoreModule.f1534c.f3559H0.m27550r5(str, str2);
    }

    /* JADX INFO: renamed from: v0 */
    public Class<? extends Act> m2050v0() {
        return NewMainAct.class;
    }

    /* JADX INFO: renamed from: z5 */
    public c<roj0> m2051z5(final v9j<stc0> v9jVar, final a<ArrayList<Contract>> aVar) {
        return CoreModule.f1534c.scheduled("contracts", 0, new v9j() { // from class: l.oo7
            public final Object call() {
                return new ka20(v9jVar, ContractEnvelope.JSON_ADAPTER).compose(mkd0.C()).map(new w9j() { // from class: l.ro7
                    public final Object call(Object obj) {
                        return CoreCommonServiceImpl.m2020F(aVar, (ContractEnvelope) obj);
                    }
                });
            }
        });
    }
}
