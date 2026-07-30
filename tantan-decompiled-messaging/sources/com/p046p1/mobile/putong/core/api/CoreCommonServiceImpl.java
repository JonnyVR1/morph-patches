package com.p046p1.mobile.putong.core.api;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.alipay.sdk.app.AuthTask;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.C4699a;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.CoreCommonServiceImpl;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Identity;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.Reminder;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService;
import com.p046p1.mobile.putong.data.AlipayAuthEnvelop;
import com.p046p1.mobile.putong.data.Contract;
import com.p046p1.mobile.putong.data.ContractEnvelope;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.UploadSource;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.foxstatistics.entity.EventNameEnum;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.C18367m2;
import p149l.d30;
import p149l.e30;
import p149l.ek8;
import p149l.gl5;
import p149l.j760;
import p149l.jqa;
import p149l.kqa;
import p149l.ku6;
import p149l.l3f;
import p149l.mkd0;
import p149l.op8;
import p149l.oqa;
import p149l.pp8;
import p149l.qy4;
import p149l.roj0;
import p149l.ry4;
import p149l.stc0;
import p149l.ura;
import p149l.v9j;
import p149l.vrx;
import p149l.vwb;
import p149l.w9j;
import p149l.xh5;
import p149l.ya5;
import p149l.ygh0;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
@Route(name = "putong-common 使用的 core 服务", path = "/core_common_service/service")
public class CoreCommonServiceImpl implements CoreCommonService {

    /* JADX INFO: renamed from: a */
    public C18367m2 f19170a = new ku6();

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ roj0 m30092F(C22392a c22392a, ContractEnvelope contractEnvelope) {
        c22392a.m132487l((ArrayList) contractEnvelope.data.contracts);
        return roj0.f160388a;
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ Picture m30095K(Media media) {
        return (Picture) media;
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ Picture m30096L(List list) {
        return (Picture) list.get(0);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m30097M(Throwable th, roj0 roj0Var) {
        if (CoreModule.m29932K().me_().isJailedOrRestrict()) {
            ura.m195053e().m195057d().mo33765Vc();
        } else {
            yij0.m214929G(th);
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: A2 */
    public vrx mo30100A2() {
        return new oqa();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: C3 */
    public C22306c<Boolean> mo30101C3(String str) {
        return CoreModule.f17545c.f19570H0.m210390z4(str);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: G */
    public C4699a mo30102G(PutongAct putongAct) {
        return ura.m195053e().m195057d().mo33688G(putongAct);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: I */
    public boolean mo30103I(Envelope envelope) {
        Identity identity;
        return (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).verificationCenter) || (identity = ((CoreData) envelope.getModuleData(CoreData.class)).verificationCenter.get(0).identity) == null || !TEnum.equals(identity.status, "verified")) ? false : true;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: L0 */
    public vrx mo30104L0() {
        return new qy4();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: P1 */
    public String mo30105P1() {
        return ygh0.f198171f;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: P4 */
    public vrx mo30106P4() {
        return new ry4();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: R3 */
    public void mo30107R3(final Throwable th) {
        if (CoreModule.m29932K().me_().isJailedOrRestrict()) {
            ura.m195053e().m195057d().mo33765Vc();
        } else {
            CoreModule.m29932K().refreshUser(CoreModule.m29931H().userId()).subscribe(mkd0.m154956H(new e30() { // from class: l.po7
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreCommonServiceImpl.m30097M(th, (roj0) obj);
                }
            }, new e30() { // from class: l.qo7
                @Override // p149l.e30
                public final void call(Object obj) {
                    yij0.m214929G(th);
                }
            }));
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: T3 */
    public void mo30108T3(Envelope envelope, HashSet<String> hashSet, Integer num) {
        String str;
        String str2;
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        for (Message message : coreData.messages) {
            if (!User.isTeamAccount(message.cid) || message.moment == null) {
                message.localInConversation = (xh5.MESSAGE_IN_CONVERSATION & num.intValue()) != 0;
            } else {
                message.localInConversation = false;
            }
            Boolean bool = message.recalled;
            if (bool != null && bool.booleanValue()) {
                message.localInMoment = false;
            } else if ((num.intValue() & xh5.INFER_INVALID_MOMENT_REFERENCE) != 0 && (str2 = message.likeOfMoment) != null && !hashSet.contains(str2)) {
                message.likeOfMoment = ek8.f91939t;
                message.localInMoment = false;
            } else if ((num.intValue() & xh5.INFER_INVALID_MOMENT_REFERENCE) != 0 && (str = message.moment) != null && !hashSet.contains(str)) {
                message.moment = ek8.f91939t;
                message.localInMoment = false;
            } else if (User.isTeamAccount(message.cid)) {
                message.localInMoment = true;
            } else {
                message.localInMoment = ((xh5.MESSAGE_IN_MOMENTS & num.intValue()) == 0 || message.moment == null) ? false : true;
            }
        }
        for (Reminder reminder : coreData.reminders) {
            if (TEnum.equals(reminder.reference.type, "moment") && (num.intValue() & xh5.INFER_INVALID_MOMENT_REFERENCE) != 0) {
                reminder.moment = hashSet.contains(reminder.reference.f20495id) ? reminder.reference.f20495id : ek8.f91939t;
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: U4 */
    public boolean mo30109U4() {
        return CoreModule.f17545c == null;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: X4 */
    public boolean mo30110X4() {
        if (m30116km()) {
            return false;
        }
        return gl5.f103293a.get().booleanValue();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: Y1 */
    public C22306c<Picture> mo30111Y1(Picture picture) {
        return ya5.m213793I(vwb.m200324f0(picture), "profile").map(new w9j() { // from class: l.no7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreCommonServiceImpl.m30096L((List) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: a */
    public op8 mo30112a() {
        return pp8.m170711l();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: a3 */
    public int mo30113a3() {
        return 9000;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public C22306c<j760<Integer, String>> alipayAuthWithErrorCode(AuthTask authTask) {
        return CoreModule.f17545c.f19570H0.m210360k4(authTask);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: c2 */
    public void mo30114c2(final PutongAct putongAct, final d30 d30Var) {
        putongAct.dialog().m20556t0(R$string.f18658k4, new Runnable() { // from class: l.so7
            @Override // java.lang.Runnable
            public final void run() {
                ura.m195053e().m195057d().mo33712Jo(putongAct, d30Var);
            }
        }).m20504F("绑定支付宝前请先绑定手机号").m20541k0(R$string.f18408c).m20496B(false).m20568z0();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public Counter counter_() {
        return CoreModule.f17545c.m31484o3();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public Intent getMainActIntent(Context context) {
        return ura.m195053e().m195057d().getMainActIntent(context);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public User getUserByIdInModule(String str) {
        return CoreModule.f17545c.f19639e0.m169430Pa(str);
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: j0 */
    public vrx mo30115j0() {
        return new kqa();
    }

    /* JADX INFO: renamed from: km */
    public boolean m30116km() {
        return ura.m195053e().m195057d().mo33874km();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: l3 */
    public C22306c<List<Picture>> mo30117l3(List<Media> list) {
        return ya5.m213795K(list, "report", null, UploadSource.get("report")).map(new w9j() { // from class: l.to7
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200303Q((List) obj, new w9j() { // from class: l.uo7
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return CoreCommonServiceImpl.m30095K((Media) obj2);
                    }
                });
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: l5 */
    public vrx mo30118l5() {
        return new jqa();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: me */
    public C22306c<User> mo30119me() {
        return CoreModule.f17545c.f19639e0.m169523o9();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public User me_() {
        return CoreModule.f17545c.f19639e0.m169527p9();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public void mergeNetworkStateIntoLocalState(Envelope envelope, d30 d30Var) {
        CoreModule.m29932K().mergeNetworkStateIntoLocalState(envelope, d30Var);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public void pollUserCounters() {
        CoreModule.f17545c.f19639e0.m169397H9();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public User queryMe() {
        return CoreModule.f17545c.f19639e0.m169429P9();
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: r */
    public void mo30120r(Act act) {
        ura.m195053e().m195057d().mo33912r(act);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    public void trackPlayerBlockTime(long j, String str, String str2) {
        if (j <= 200 || TextUtils.isEmpty(str)) {
            return;
        }
        HashMap map = new HashMap();
        String strValueOf = String.valueOf(j);
        l3f l3fVar = new l3f();
        l3fVar.f125885d = EventNameEnum.SYS_CHECK;
        str.getClass();
        String str3 = Moments.TYPE;
        switch (str) {
            case "from_nearby_falls_feed":
                l3fVar.f125900s = "e_VideoStuck_feed";
                l3fVar.f125895n = OMSDialogPositon.p_nearby;
                str3 = "nearby";
                break;
            case "moments":
                l3fVar.f125900s = "e_VideoStuck_feed";
                l3fVar.f125895n = "p_moment_fullscreen_view";
                break;
            case "from_nearby_focus":
                l3fVar.f125900s = "e_VideoStuck_feed";
                l3fVar.f125895n = "p_follow";
                str3 = "follow";
                break;
            case "home_card":
                l3fVar.f125900s = "e_VideoStuck_profile";
                l3fVar.f125895n = OMSDialogPositon.p_suggest_user_profile_info_view;
            default:
                str3 = "";
                break;
        }
        map.put(BLiveOperationTitleShowType.duration, strValueOf);
        map.put("tag", str3);
        if (!TextUtils.isEmpty(str2)) {
            map.put("url", str2);
        }
        if (TextUtils.isEmpty(l3fVar.f125900s)) {
            return;
        }
        zvf0.m220392n(l3fVar, map);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: u4 */
    public C22306c<AlipayAuthEnvelop> mo30121u4(String str, String str2) {
        return CoreModule.f17545c.f19570H0.m210375r5(str, str2);
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: v0 */
    public Class<? extends Act> mo30122v0() {
        return NewMainAct.class;
    }

    @Override // com.p046p1.mobile.putong.core_api.api.serviceprovider.api.core.CoreCommonService
    /* JADX INFO: renamed from: z5 */
    public C22306c<roj0> mo30123z5(final v9j<stc0> v9jVar, final C22392a<ArrayList<Contract>> c22392a) {
        return CoreModule.f17545c.scheduled("contracts", 0, new v9j() { // from class: l.oo7
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new ka20(v9jVar, ContractEnvelope.JSON_ADAPTER).compose(mkd0.m154951C()).map(new w9j() { // from class: l.ro7
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return CoreCommonServiceImpl.m30092F(c22392a, (ContractEnvelope) obj);
                    }
                });
            }
        });
    }
}
