package com.p051p1.mobile.putong.core.api;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.sdk.app.AuthTask;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.C4850a;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.CoreCommonServiceImpl;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Identity;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.Reminder;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService;
import com.p051p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p051p1.mobile.putong.data.Contract;
import com.p051p1.mobile.putong.data.ContractEnvelope;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.UploadSource;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.C18526m2;
import p153l.asa;
import p153l.bsj0;
import p153l.fph0;
import p153l.gta;
import p153l.i4g0;
import p153l.il8;
import p153l.jm5;
import p153l.jyb;
import p153l.nv6;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.pz4;
import p153l.q4f;
import p153l.qcj;
import p153l.qz4;
import p153l.s0y;
import p153l.tq8;
import p153l.uq8;
import p153l.uxj0;
import p153l.vra;
import p153l.wra;
import p153l.x1d0;
import p153l.x20;
import p153l.xi5;
import p153l.y20;
import p153l.yb5;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "putong-common 使用的 core 服务", path = "/core_common_service/service")
public class CoreCommonServiceImpl implements CoreCommonService {

    /* JADX INFO: renamed from: a */
    public C18526m2 f19911a = new nv6();

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ uxj0 m31090F(C22507a c22507a, ContractEnvelope contractEnvelope) {
        c22507a.m137019l((ArrayList) contractEnvelope.data.contracts);
        return uxj0.f181467a;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ Picture m31093K(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ Picture m31094L(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m31095M(Throwable th, uxj0 uxj0Var) {
        if (CoreModule.m30930K().me_().isJailedOrRestrict()) {
            gta.m132210e().m132214d().mo34768Vc();
        } else {
            bsj0.m106249G(th);
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: A2 */
    public s0y mo31098A2() {
        return new asa();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: C3 */
    public C22421c<Boolean> mo31099C3(String str) {
        return CoreModule.f18264c.f20312H0.m155478z4(str);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: G */
    public C4850a mo31100G(PutongAct putongAct) {
        return gta.m132210e().m132214d().mo34691G(putongAct);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: I */
    public boolean mo31101I(Envelope envelope) {
        Identity identity;
        return (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).verificationCenter) || (identity = ((CoreData) envelope.getModuleData(CoreData.class)).verificationCenter.get(0).identity) == null || !TEnum.equals(identity.status, "verified")) ? false : true;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: L0 */
    public s0y mo31102L0() {
        return new pz4();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: P1 */
    public String mo31103P1() {
        return fph0.f100173f;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: P4 */
    public s0y mo31104P4() {
        return new qz4();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: R3 */
    public void mo31105R3(final Throwable th) {
        if (CoreModule.m30930K().me_().isJailedOrRestrict()) {
            gta.m132210e().m132214d().mo34768Vc();
        } else {
            CoreModule.m30930K().refreshUser(CoreModule.m30929H().userId()).subscribe(psd0.m173597H(new y20() { // from class: l.tp7
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreCommonServiceImpl.m31095M(th, (uxj0) obj);
                }
            }, new y20() { // from class: l.up7
                @Override // p153l.y20
                public final void call(Object obj) {
                    bsj0.m106249G(th);
                }
            }));
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: T3 */
    public void mo31106T3(Envelope envelope, HashSet<String> hashSet, Integer num) {
        String str;
        String str2;
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        for (Message message : coreData.messages) {
            if (!User.isTeamAccount(message.cid) || message.moment == null) {
                message.localInConversation = (xi5.MESSAGE_IN_CONVERSATION & num.intValue()) != 0;
            } else {
                message.localInConversation = false;
            }
            Boolean bool = message.recalled;
            if (bool != null && bool.booleanValue()) {
                message.localInMoment = false;
            } else if ((num.intValue() & xi5.INFER_INVALID_MOMENT_REFERENCE) != 0 && (str2 = message.likeOfMoment) != null && !hashSet.contains(str2)) {
                message.likeOfMoment = il8.f115534t;
                message.localInMoment = false;
            } else if ((num.intValue() & xi5.INFER_INVALID_MOMENT_REFERENCE) != 0 && (str = message.moment) != null && !hashSet.contains(str)) {
                message.moment = il8.f115534t;
                message.localInMoment = false;
            } else if (User.isTeamAccount(message.cid)) {
                message.localInMoment = true;
            } else {
                message.localInMoment = ((xi5.MESSAGE_IN_MOMENTS & num.intValue()) == 0 || message.moment == null) ? false : true;
            }
        }
        for (Reminder reminder : coreData.reminders) {
            if (TEnum.equals(reminder.reference.type, "moment") && (num.intValue() & xi5.INFER_INVALID_MOMENT_REFERENCE) != 0) {
                reminder.moment = hashSet.contains(reminder.reference.f21237id) ? reminder.reference.f21237id : il8.f115534t;
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: U4 */
    public boolean mo31107U4() {
        return CoreModule.f18264c == null;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: X4 */
    public boolean mo31108X4() {
        if (m31114km()) {
            return false;
        }
        return jm5.f121638a.get().booleanValue();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: Y1 */
    public C22421c<Picture> mo31109Y1(Picture picture) {
        return yb5.m214980I(jyb.m147507f0(picture), "profile").map(new qcj() { // from class: l.rp7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreCommonServiceImpl.m31094L((List) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: a */
    public tq8 mo31110a() {
        return uq8.m197218l();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: a3 */
    public int mo31111a3() {
        return 9000;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public C22421c<pf60<Integer, String>> alipayAuthWithErrorCode(AuthTask authTask) {
        return CoreModule.f18264c.f20312H0.m155448k4(authTask);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: c2 */
    public void mo31112c2(final PutongAct putongAct, final x20 x20Var) {
        putongAct.dialog().m21555t0(R$string.f19450m4, new Runnable() { // from class: l.wp7
            @Override // java.lang.Runnable
            public final void run() {
                gta.m132210e().m132214d().mo34715Jo(putongAct, x20Var);
            }
        }).m21503F("绑定支付宝前请先绑定手机号").m21540k0(R$string.f19138c).m21495B(false).m21567z0();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public Counter counter_() {
        return CoreModule.f18264c.m32487o3();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public Intent getMainActIntent(Context context) {
        return gta.m132210e().m132214d().getMainActIntent(context);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public User getUserByIdInModule(String str) {
        return CoreModule.f18264c.f20381e0.m116503Pa(str);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: j0 */
    public s0y mo31113j0() {
        return new wra();
    }

    /* JADX INFO: renamed from: km */
    public boolean m31114km() {
        return gta.m132210e().m132214d().mo34877km();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: l3 */
    public C22421c<List<Picture>> mo31115l3(List<Media> list) {
        return yb5.m214982K(list, "report", null, UploadSource.get("report")).map(new qcj() { // from class: l.xp7
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147486Q((List) obj, new qcj() { // from class: l.yp7
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return CoreCommonServiceImpl.m31093K((Media) obj2);
                    }
                });
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: l5 */
    public s0y mo31116l5() {
        return new vra();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: me */
    public C22421c<User> mo31117me() {
        return CoreModule.f18264c.f20381e0.m116596o9();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public User me_() {
        return CoreModule.f18264c.f20381e0.m116600p9();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public void mergeNetworkStateIntoLocalState(Envelope envelope, x20 x20Var) {
        CoreModule.m30930K().mergeNetworkStateIntoLocalState(envelope, x20Var);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public void pollUserCounters() {
        CoreModule.f18264c.f20381e0.m116470H9();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public User queryMe() {
        return CoreModule.f18264c.f20381e0.m116502P9();
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: r */
    public void mo31118r(Act act) {
        gta.m132210e().m132214d().mo34915r(act);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public void trackPlayerBlockTime(long j, String str, String str2) {
        if (j <= 200 || TextUtils.isEmpty(str)) {
            return;
        }
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(j);
        q4f q4fVar = new q4f();
        q4fVar.f155566d = EventNameEnum.SYS_CHECK;
        str.getClass();
        String str3 = Moments.TYPE;
        switch (str) {
            case "from_nearby_falls_feed":
                q4fVar.f155581s = "e_VideoStuck_feed";
                q4fVar.f155576n = OMSDialogPositon.p_nearby;
                str3 = "nearby";
                break;
            case "moments":
                q4fVar.f155581s = "e_VideoStuck_feed";
                q4fVar.f155576n = "p_moment_fullscreen_view";
                break;
            case "from_nearby_focus":
                q4fVar.f155581s = "e_VideoStuck_feed";
                q4fVar.f155576n = "p_follow";
                str3 = "follow";
                break;
            case "home_card":
                q4fVar.f155581s = "e_VideoStuck_profile";
                q4fVar.f155576n = OMSDialogPositon.p_suggest_user_profile_info_view;
            default:
                str3 = "";
                break;
        }
        map.put(BLiveOperationTitleShowType.duration, strValueOf);
        map.put("tag", str3);
        if (!TextUtils.isEmpty(str2)) {
            map.put("url", str2);
        }
        if (TextUtils.isEmpty(q4fVar.f155581s)) {
            return;
        }
        i4g0.m138516n(q4fVar, map);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: u4 */
    public C22421c<AlipayAuthEnvelop> mo31119u4(String str, String str2) {
        return CoreModule.f18264c.f20312H0.m155463r5(str, str2);
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: v0 */
    public Class<? extends Act> mo31120v0() {
        return NewMainAct.class;
    }

    @Override // com.p051p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: z5 */
    public C22421c<uxj0> mo31121z5(final pcj<x1d0> pcjVar, final C22507a<ArrayList<Contract>> c22507a) {
        return CoreModule.f18264c.scheduled("contracts", 0, new pcj() { // from class: l.sp7
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new si20(pcjVar, ContractEnvelope.JSON_ADAPTER).compose(psd0.m173592C()).map(new qcj() { // from class: l.vp7
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return CoreCommonServiceImpl.m31090F(c22507a, (ContractEnvelope) obj);
                    }
                });
            }
        });
    }
}
