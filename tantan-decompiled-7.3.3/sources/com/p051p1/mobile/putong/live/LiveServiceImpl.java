package com.p051p1.mobile.putong.live;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.LiveBubbleConfig;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveState;
import com.p051p1.mobile.putong.data.UserWealthGradeConfig;
import com.p051p1.mobile.putong.data.VoiceLiveState;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.LiveServiceImpl;
import com.p051p1.mobile.putong.live.base.apibean.FanBaseGroupSummaryBean;
import com.p051p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p051p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveRoomInProfile;
import com.p051p1.mobile.putong.live.base.data.BLiveSchema;
import com.p051p1.mobile.putong.live.base.data.BLiveVideoChatAssets;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceRoomInProfile;
import com.p051p1.mobile.putong.live.base.data.LiveCommonData;
import com.p051p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p051p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p051p1.mobile.putong.live.external.internal.live.square.LiveSquareHomeFragDomestic;
import com.p051p1.mobile.putong.live.external.internal.live.square.fragments.videochat.LiveVideoChatFrag;
import com.p051p1.mobile.putong.live.external.internal.vchat.C12668a;
import com.p051p1.mobile.putong.live.external.intl.livesquare.home.IntlLiveSquareHomeFrag;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlChatLivingStateView;
import com.p051p1.mobile.putong.live.external.intl.view.widgets.IntlVoiceActivitiesInChatView;
import com.p051p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p051p1.mobile.putong.live.external.module.api.MyRoomInProfileNewApi;
import com.p051p1.mobile.putong.live.external.module.arch.LiveBaseAct;
import com.p051p1.mobile.putong.live.external.page.profile.myroom.MyRoomInProfileFrag;
import com.p051p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInExpandedCard;
import com.p051p1.mobile.putong.live.external.page.profile.myroomnew.MyRoomInProfileNewFrag;
import com.p051p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p051p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import com.p051p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag;
import com.p051p1.mobile.putong.live.external.voiceslipcard.popularroom.group.LiveGroupChatFrag;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LivingBaseAct;
import com.p051p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveSettingArgs;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p137rx.C22421c;
import p151v.VText;
import p153l.C18526m2;
import p153l.ano0;
import p153l.beo;
import p153l.bk3;
import p153l.bkj0;
import p153l.bno0;
import p153l.c8m0;
import p153l.ceo;
import p153l.csp;
import p153l.cvu;
import p153l.dhw;
import p153l.dq1;
import p153l.e4h;
import p153l.efv;
import p153l.erf;
import p153l.f4h;
import p153l.f7s;
import p153l.fk3;
import p153l.fm3;
import p153l.ftn0;
import p153l.g1t;
import p153l.gm3;
import p153l.hbs;
import p153l.hrm0;
import p153l.ibs;
import p153l.idc0;
import p153l.itd0;
import p153l.itn0;
import p153l.j4n0;
import p153l.j8m0;
import p153l.jvu;
import p153l.jwk0;
import p153l.jwu;
import p153l.jyb;
import p153l.k4n0;
import p153l.lc3;
import p153l.ldc0;
import p153l.mbs;
import p153l.mfd0;
import p153l.mqr;
import p153l.n2t;
import p153l.nae0;
import p153l.nam;
import p153l.nqr;
import p153l.o1j0;
import p153l.o2t;
import p153l.pf60;
import p153l.ppi0;
import p153l.qam;
import p153l.qan0;
import p153l.qcj;
import p153l.qhk0;
import p153l.r1j0;
import p153l.s1u;
import p153l.san0;
import p153l.sfg;
import p153l.tbs;
import p153l.txp;
import p153l.u1u;
import p153l.uec0;
import p153l.uqb0;
import p153l.v5k0;
import p153l.vxr;
import p153l.wfh0;
import p153l.wft;
import p153l.wnt;
import p153l.wya0;
import p153l.x20;
import p153l.xau;
import p153l.xwk;
import p153l.y20;
import p153l.y6u;
import p153l.yfh0;
import p153l.ynt;
import p153l.yw0;
import p153l.ywk;

/* JADX INFO: loaded from: classes13.dex */
@Route(name = "LiveService服务", path = "/live_service/service")
public class LiveServiceImpl implements LiveService {

    /* JADX INFO: renamed from: a */
    public yfh0 f44913a;

    /* JADX INFO: renamed from: b */
    public e4h f44914b;

    /* JADX INFO: renamed from: c */
    public cvu f44915c;

    /* JADX INFO: renamed from: d */
    public xwk f44916d;

    /* JADX INFO: renamed from: e */
    public volatile ftn0 f44917e;

    /* JADX INFO: renamed from: f */
    public volatile j4n0 f44918f;

    /* JADX INFO: renamed from: g */
    public volatile ano0 f44919g;

    /* JADX INFO: renamed from: h */
    public volatile c8m0 f44920h;

    /* JADX INFO: renamed from: i */
    public nam f44921i;

    /* JADX INFO: renamed from: j */
    public WeakReference<qam> f44922j;

    /* JADX INFO: renamed from: k */
    public g1t f44923k;

    /* JADX INFO: renamed from: l */
    public s1u f44924l;

    /* JADX INFO: renamed from: m */
    public n2t f44925m;

    /* JADX INFO: renamed from: n */
    public ceo f44926n;

    /* JADX INFO: renamed from: o */
    public csp f44927o;

    /* JADX INFO: renamed from: p */
    public C18526m2 f44928p = new nqr();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.LiveServiceImpl$a */
    public class ViewOnClickListenerC11582a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f44929a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FanBaseGroupSummaryBean f44930b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Dialog f44931c;

        public ViewOnClickListenerC11582a(Act act, FanBaseGroupSummaryBean fanBaseGroupSummaryBean, Dialog dialog) {
            this.f44929a = act;
            this.f44930b = fanBaseGroupSummaryBean;
            this.f44931c = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Act act = this.f44929a;
            act.startActivity(tbs.f172993f.m143704f(act, AudienceStartData.getBuilder().m68777E(this.f44930b.getLiveId()).m68787O("group_profile_fans").m68794u()));
            this.f44931c.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.LiveServiceImpl$b */
    public class ViewOnClickListenerC11583b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dialog f44933a;

        public ViewOnClickListenerC11583b(Dialog dialog) {
            this.f44933a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f44933a.dismiss();
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m68388F(Act act, BLiveSchema bLiveSchema) {
        if (bLiveSchema != null) {
            o1j0.m165651y(bLiveSchema.tip);
            nae0.m162083m(act, Uri.parse(bLiveSchema.schema));
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m68391K(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            o1j0.m165651y(((TantanException.Client.CoreService) th).metaMessage);
        } else {
            o1j0.m165649w(R$string.f44938d);
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m68392L(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            o1j0.m165651y(coreService.metaMessage);
            if (coreService.code == 41063) {
                o1j0.m165651y(coreService.metaMessage);
                return;
            }
        }
        o1j0.m165649w(R$string.f44935a);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m68393M(String str, Act act, BLiveVideoChatAssets bLiveVideoChatAssets) {
        if (!bLiveVideoChatAssets.canEnterTab) {
            r1j0.m179420g(bLiveVideoChatAssets.enterFailTip);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(LiveVideoChatFrag.KEY_VIDEO_CHAT_PAGE_SOURCE, str);
        act.startActivity(LiveIndependentSettingAct.m71882Z1(act, "live_video_chat", bundle));
    }

    /* JADX INFO: renamed from: N */
    public static boolean m68394N(boolean z) {
        return z || App.m21426f();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Bq */
    public boolean mo68395Bq() {
        return m68394N(!tbs.f172989b.m203785z6());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: C8 */
    public boolean mo68396C8() {
        return m68394N(!tbs.f172989b.m203397D6());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Dr */
    public String mo68397Dr(String str) {
        return m68417P(str, "onlive");
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Ei */
    public boolean mo68398Ei(int i) {
        return wft.m206159b(i);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Ep */
    public void mo68399Ep() {
        LiveSquareApi.notifyEntryMainPager();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: F8 */
    public void mo68400F8(Act act, boolean z, boolean z2, String str) {
        tbs.f172993f.m143699a(act, AnchorStartData.getBuilder().m68745m(z2).m68744l(z).m68746n(str).m68743k());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Fr */
    public void mo68401Fr() {
        LiveTeenDialogAct.m71986X1("为呵护未成年人健康成长，探探特别推出青少年模式，该模式下部分功能无法使用。请监护人主动选择，并设置监护密码");
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Gj */
    public UserWealthGradeConfig mo68402Gj(int i, boolean z) {
        return tbs.f172989b.m203717r5(i, z);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Gr */
    public Intent mo68403Gr(Context context, @Nullable LiveSettingArgs liveSettingArgs) {
        Bundle bundle = new Bundle();
        if (liveSettingArgs != null) {
            bundle.putParcelable("live_setting_frag_arg", liveSettingArgs);
        }
        return LiveIndependentSettingAct.m71882Z1(context, "live_setting_page", bundle);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: He */
    public void mo68404He(HashMap<String, ValueObject> map, HashMap<String, ValueObject> map2, Envelope envelope) {
        LiveCommonData liveCommonData = (LiveCommonData) envelope.getModuleData(LiveCommonData.class);
        if (liveCommonData != null) {
            List<BLiveRoomInProfile> list = liveCommonData.profileLiveRooms;
            List<BLiveVoiceRoomInProfile> list2 = liveCommonData.profileVoiceRooms;
            if (!jyb.m147479J(list)) {
                for (BLiveRoomInProfile bLiveRoomInProfile : list) {
                    map.put(bLiveRoomInProfile.anchorId, bLiveRoomInProfile);
                }
            }
            if (jyb.m147479J(list2)) {
                return;
            }
            for (BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile : list2) {
                map2.put(bLiveVoiceRoomInProfile.anchorId, bLiveVoiceRoomInProfile);
            }
        }
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Hh */
    public String mo68405Hh() {
        return tbs.f172989b.m203611e5();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: I6 */
    public j4n0 mo68406I6() {
        if (this.f44918f == null) {
            this.f44918f = new k4n0();
        }
        return this.f44918f;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Ii */
    public boolean mo68407Ii(Intent intent) {
        return intent.getBooleanExtra("tt_live_flag_extra", false);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Ir */
    public void mo68408Ir(String str, String str2) {
        LiveVoiceApi.livePushPGCReport(str, str2);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Kb */
    public boolean mo68409Kb() {
        return m68394N(!tbs.f172989b.m203413F6() || m68418Q());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: L7 */
    public C22421c<Boolean> mo68410L7() {
        return wya0.m208478b().m208479a();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Lh */
    public qam mo68411Lh() {
        WeakReference<qam> weakReference = this.f44922j;
        if (weakReference == null || weakReference.get() == null) {
            if (wft.m206159b(3)) {
                this.f44922j = new WeakReference<>(new san0());
            } else {
                this.f44922j = new WeakReference<>(new qan0());
            }
        }
        return this.f44922j.get();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: M6 */
    public ftn0 mo68412M6() {
        if (this.f44917e == null) {
            synchronized (LiveServiceImpl.class) {
                try {
                    if (this.f44917e == null) {
                        this.f44917e = new itn0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f44917e;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: M7 */
    public boolean mo68413M7() {
        return ppi0.m173207l().m173228x();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Ms */
    public csp mo68414Ms(Act act, dq1 dq1Var) {
        if (this.f44927o == null) {
            this.f44927o = new IntlVoiceActivitiesInChatView(act, dq1Var);
        }
        return this.f44927o;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Ok */
    public boolean mo68415Ok() {
        if (mqr.m159592l()) {
            return !((bk3) tbs.m190077m(itd0.f116822d)).f77038a.get().booleanValue();
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Om */
    public boolean mo68416Om() {
        return m68394N(!tbs.f172989b.m203777y6());
    }

    /* JADX INFO: renamed from: P */
    public String m68417P(String str, String str2) {
        return mfd0.m158165b(str, str2);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m68418Q() {
        return m68394N(tbs.f172989b.m203380B5());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Qc */
    public boolean mo68419Qc() {
        return m68394N(!tbs.f172989b.m203754v6() || m68418Q());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Qj */
    public boolean mo68420Qj() {
        return m68394N(!tbs.f172989b.m203429H6() || m68418Q());
    }

    /* JADX INFO: renamed from: R */
    public final boolean m68421R() {
        return m68394N(!tbs.f172989b.m203769x6() || !tbs.f172989b.m203421G6()) || tbs.f172989b.m203685n7();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Rh */
    public boolean mo68422Rh() {
        return tbs.f172989b.m203705pb();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m68423S(Act act, FanBaseGroupSummaryBean fanBaseGroupSummaryBean) {
        if (fanBaseGroupSummaryBean.getCode() == 50002) {
            m68426T(act, fanBaseGroupSummaryBean);
        } else if (fanBaseGroupSummaryBean.getCode() == 50001) {
            o1j0.m165651y(fanBaseGroupSummaryBean.getMsg());
        } else {
            o1j0.m165649w(R$string.f44937c);
        }
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: S8 */
    public C22421c<pf60<ValueObject, ValueObject>> mo68424S8(String str) {
        return new MyRoomInProfileNewApi().getMyRoomInProfileNew(str).map(new qcj() { // from class: l.xnt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                pf60 pf60Var = (pf60) obj;
                return pf60.m172085a((ValueObject) pf60Var.f152156a, (ValueObject) pf60Var.f152157b);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Sf */
    public void mo68425Sf() {
        ((fk3) tbs.m190077m(itd0.f116820b)).m125943J();
    }

    /* JADX INFO: renamed from: T */
    public final void m68426T(Act act, FanBaseGroupSummaryBean fanBaseGroupSummaryBean) {
        Dialog dialogM21566z = act.dialog().m21516M(uec0.f178645a).m21558v().m21566z();
        dialogM21566z.m21457P().findViewById(idc0.f114498a).setOnClickListener(new ViewOnClickListenerC11582a(act, fanBaseGroupSummaryBean, dialogM21566z));
        dialogM21566z.m21457P().findViewById(idc0.f114499b).setOnClickListener(new ViewOnClickListenerC11583b(dialogM21566z));
        dialogM21566z.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ((VText) dialogM21566z.m21457P().findViewById(ldc0.f131500R1)).setTypeface(null, 1);
        dialogM21566z.show();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Tc */
    public void mo68427Tc(Act act, String str, boolean z) {
        jwk0.m147173g(act, str, z);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Uf */
    public g1t mo68428Uf(Context context) {
        if (this.f44923k == null) {
            this.f44923k = new IntlChatLivingStateView(context);
        }
        return new IntlChatLivingStateView(context);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Vm */
    public boolean mo68429Vm(ValueObject valueObject) {
        if (valueObject instanceof BLiveVoiceRoomInProfile) {
            return TextUtils.equals(((BLiveVoiceRoomInProfile) valueObject).status, "onlive");
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Xh */
    public Intent mo68430Xh(Context context, IntentParams intentParams) {
        return tbs.f172993f.m143704f(context, AudienceStartData.getBuilder().m68777E(intentParams.liveId).m68787O(intentParams.source).m68798y(intentParams.category).m68782J(intentParams.open).m68779G(intentParams.liveSchema).m68783K(intentParams.requestExtra).m68794u());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Y8 */
    public void mo68431Y8(Act act, boolean z, int i, x20 x20Var) {
        C12668a.m70427n(act, z, i, x20Var);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Yk */
    public boolean mo68432Yk(String str) {
        List<String> listM203571Z4 = tbs.f172989b.m203571Z4();
        if (listM203571Z4 == null || listM203571Z4.size() == 0) {
            return !str.equalsIgnoreCase("live");
        }
        Iterator<String> it = listM203571Z4.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Ys */
    public lc3 mo68433Ys() {
        return ((fk3) tbs.m190077m(itd0.f116820b)).m125969t();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Z8 */
    public void mo68434Z8(Act act, Bundle bundle) {
        y6u.m214520x(act, bundle);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    @Nullable
    /* JADX INFO: renamed from: Zl */
    public VoiceLiveState mo68435Zl(String str) {
        return ((fk3) tbs.m190077m(itd0.f116820b)).m125938E(str);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Zo */
    public nam mo68436Zo() {
        if (this.f44921i == null) {
            this.f44921i = new hrm0();
        }
        return this.f44921i;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Zr */
    public boolean mo68437Zr() {
        return m68394N(!tbs.f172989b.m203389C6() || m68418Q());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: a */
    public hbs mo68438a() {
        return ibs.m139400g();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: a7 */
    public String mo68439a7() {
        if (wft.m206159b(1)) {
            return tbs.f172989b.m203419G4();
        }
        return (TEnum.equals(uqb0.f180402h0, LiveRegionTag.taiwan) || TEnum.equals(uqb0.f180402h0, LiveRegionTag.indonesia)) ? xau.m209910t(R$string.f44936b) : tbs.f172989b.m203419G4();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ao */
    public C22421c<Boolean> mo68440ao(String str) {
        if (wft.m206159b(2)) {
            return C22421c.just(Boolean.FALSE);
        }
        return mqr.m159583c() ? txp.INSTANCE.m193526c(str) : C22421c.just(Boolean.FALSE);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: b7 */
    public PutongFrag mo68441b7() {
        return !wft.m206159b(2) ? new LiveGroupChatFrag() : new PutongFrag();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: bl */
    public C22421c<f7s> mo68442bl() {
        return ((gm3) tbs.m190077m(itd0.f116821c)).m130733h().map(new ynt());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public Fragment buildLiveSquareFrag() {
        if (mqr.m159592l()) {
            return wft.m206159b(2) ? new LiveSquareHomeFragDomestic() : new IntlLiveSquareHomeFrag();
        }
        return null;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: c8 */
    public int mo68443c8() {
        return tbs.f172989b.m203372A5();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ce */
    public f7s mo68444ce() {
        return erf.m122172d(((gm3) tbs.m190077m(itd0.f116821c)).m130733h().m222761e());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: co */
    public ano0 mo68445co() {
        if (this.f44919g == null) {
            this.f44919g = new bno0();
        }
        return this.f44919g;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ek */
    public void mo68446ek(final Act act, String str) {
        act.duringCreated(sfg.m185587b(str, mbs.m157870o0())).subscribe(dhw.m115826e(new y20() { // from class: l.znt
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205250a.m68423S(act, (FanBaseGroupSummaryBean) obj);
            }
        }, new y20() { // from class: l.aot
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveServiceImpl.m68391K((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: es */
    public boolean mo68447es() {
        return m68394N(!tbs.f172989b.m203762w6() || m68418Q());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public e4h feedEntry() {
        if (this.f44914b == null) {
            this.f44914b = new f4h();
        }
        return this.f44914b;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: g6 */
    public void mo68448g6(String str) {
        v5k0.m199899k(str, null);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: g9 */
    public boolean mo68449g9() {
        return m68394N(!tbs.f172989b.m203405E6() || m68418Q());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ga */
    public void mo68450ga(final Act act, String str, String str2) {
        act.duringCreated(VoiceVirtualApi.getLiveSchemaStatus(str, str2)).subscribe(dhw.m115826e(new y20() { // from class: l.bot
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveServiceImpl.m68388F(act, (BLiveSchema) obj);
            }
        }, new y20() { // from class: l.cot
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveServiceImpl.m68392L((Throwable) obj);
            }
        }));
    }

    @NonNull
    public C18526m2 getAbHooker() {
        return this.f44928p;
    }

    public C22421c<ArrayList<LiveBubbleConfig>> getBubbleConfig() {
        return ((fk3) tbs.m190077m(itd0.f116820b)).m125959j().map(new qcj() { // from class: l.unt
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return erf.m122171c((BLiveMonetizationConfig) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public xwk getH5PageApi() {
        if (this.f44916d == null) {
            this.f44916d = new ywk();
        }
        return this.f44916d;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public int getHomeLiveTabPosition() {
        return (mqr.m159592l() && m68421R()) ? 1 : -1;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public String getLiveCardText() {
        return tbs.f172989b.m203759w3();
    }

    public String getLiveFakeTitle() {
        if (NullChecker.m82486a(tbs.f172989b)) {
            return tbs.f172989b.m203674m4();
        }
        return null;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public cvu getLiveVerification() {
        if (this.f44915c == null) {
            this.f44915c = new jvu();
        }
        return this.f44915c;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public String getTopShowingPageId(Fragment fragment) {
        return isLiveSquareHome(fragment) ? ((LiveSquareHomeFrag) fragment).mo70126M4() : "";
    }

    @Override // p153l.qhk0
    public User getUserById(String str) {
        return qhk0.C19577a.m176593a(this, str);
    }

    @Override // p153l.qhk0
    public User getUserByIdInModule(String str) {
        if (!mqr.m159592l()) {
            return null;
        }
        User userM125971v = ((fk3) tbs.m190077m(itd0.f116820b)).m125971v(str);
        return (userM125971v == null && NullChecker.m82486a(tbs.f172993f)) ? tbs.f172993f.m143709k(str) : userM125971v;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public String getUserLiveId(String str) {
        return ((fk3) tbs.m190077m(itd0.f116820b)).m125935B(str);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public String getUserVirtualVoiceId(String str) {
        return ((fk3) tbs.m190077m(itd0.f116820b)).m125937D(str);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: gg */
    public int mo68451gg() {
        return uec0.f178646b;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: gj */
    public void mo68452gj(Act act, String str) {
        nae0.m162083m(act, Uri.parse(str));
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public boolean hasLiveSettingEntry() {
        if (!mo68476yn()) {
            return false;
        }
        if (mqr.m159592l() && tbs.f172989b.m203746u7()) {
            return true;
        }
        return (mqr.m159592l() && tbs.f172989b.m203402E3()) || mqr.m159588h();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ih */
    public String mo68453ih() {
        return tbs.f172989b.m203483O4();
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    public boolean isLiveAct(Activity activity) {
        return (activity instanceof LiveBaseAct) || (activity instanceof LivingBaseAct);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public boolean isLiveSquareHome(Fragment fragment) {
        return fragment instanceof LiveSquareHomeFrag;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public boolean isLiving() {
        Act.C4450r c4450rForeground_ = Act.foreground_();
        return c4450rForeground_ != null && tbs.f172993f.m143711m(c4450rForeground_.f16062a.get()) && c4450rForeground_.f16063b == C4470c.f16267i;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public boolean liveShowMomentLikesAndComments() {
        return tbs.f172989b.m203697ob();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: lp */
    public boolean mo68454lp() {
        return m68394N(!tbs.f172989b.m203745u6());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    @Nullable
    /* JADX INFO: renamed from: lt */
    public UserLiveState mo68455lt(String str) {
        return ((fk3) tbs.m190077m(itd0.f116820b)).m125936C(str);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: mg */
    public s1u mo68456mg() {
        if (this.f44924l == null) {
            this.f44924l = new u1u();
        }
        return this.f44924l;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ne */
    public void mo68457ne() {
        ((fm3) tbs.m190077m(itd0.f116823e)).m126179g(System.currentTimeMillis());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: nf */
    public void mo68458nf(final Act act, final String str) {
        act.duringCreated(jwu.m147232G(str)).subscribe(dhw.m115826e(new y20() { // from class: l.vnt
            @Override // p153l.y20
            public final void call(Object obj) {
                LiveServiceImpl.m68393M(str, act, (BLiveVideoChatAssets) obj);
            }
        }, new wnt()));
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: oj */
    public void mo68459oj(View view, bkj0<ValueObject, ValueObject, Boolean> bkj0Var, String str) {
        if (view instanceof MyRoomInExpandedCard) {
            ((MyRoomInExpandedCard) view).m71706l(bkj0Var, str);
        }
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: oo */
    public wfh0 mo68460oo() {
        if (this.f44913a == null) {
            this.f44913a = new yfh0();
        }
        return this.f44913a;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: p8 */
    public boolean mo68461p8() {
        return m68394N(!tbs.f172989b.m203381B6() || m68418Q());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public void putLiveState(List<User> list) {
        ((fk3) tbs.m190077m(itd0.f116820b)).m125944K(list);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: qs */
    public ceo mo68462qs() {
        if (this.f44926n == null) {
            this.f44926n = new beo();
        }
        return this.f44926n;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: r9 */
    public c8m0 mo68463r9() {
        if (this.f44920h == null) {
            this.f44920h = new j8m0();
        }
        return this.f44920h;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: rb */
    public boolean mo68464rb() {
        return tbs.f172989b.m203751v3();
    }

    public void release() {
        this.f44914b = null;
        this.f44915c = null;
        this.f44922j = null;
        this.f44921i = null;
        this.f44923k = null;
        ceo ceoVar = this.f44926n;
        if (ceoVar != null) {
            ceoVar.release();
            this.f44926n = null;
        }
        csp cspVar = this.f44927o;
        if (cspVar != null) {
            cspVar.release();
            this.f44927o = null;
        }
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: rh */
    public void mo68465rh(Act act) {
        Intent intentM157875r = mbs.m157875r(act, NavigationIntent.get("live"));
        Bundle bundle = new Bundle();
        bundle.putString("navigation_live_intent", BLiveAbsData.VOICE_LIVE);
        intentM157875r.putExtra("extra_new_main_bundle", bundle);
        act.startActivity(intentM157875r);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: rk */
    public void mo68466rk(LiveRegionTag liveRegionTag) {
        if (yw0.m217558a()) {
            tbs.m190078n(liveRegionTag);
            return;
        }
        tbs.f172989b.m159280q();
        vxr.m203876d().m159280q();
        tbs.f172993f.m143716r(liveRegionTag);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: sd */
    public long mo68467sd() {
        return ((fk3) tbs.m190077m(itd0.f116820b)).m125972w();
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: sj */
    public String mo68468sj() {
        return tbs.f172988a.getString(R$string.f44939e);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public void startAudienceLive(Context context, IntentParams intentParams) {
        context.startActivity(tbs.f172993f.m143704f(context, AudienceStartData.getBuilder().m68776D(erf.m122173e(intentParams.live)).m68787O(intentParams.source).m68779G(intentParams.liveSchema).m68798y(intentParams.category).m68785M(intentParams.showSignInDialog).m68794u()));
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public void startLiveVerificationPage(Context context) {
        context.startActivity(LiveWebViewAct.m70066d2(context, efv.f93851h));
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: t7 */
    public n2t mo68469t7() {
        if (this.f44925m == null) {
            this.f44925m = new o2t();
        }
        return this.f44925m;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ub */
    public boolean mo68470ub(ValueObject valueObject) {
        if (valueObject instanceof BLiveRoomInProfile) {
            return TextUtils.equals(((BLiveRoomInProfile) valueObject).status, "onlive");
        }
        return false;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ue */
    public Frag mo68471ue(String str, String str2) {
        return !wft.m206159b(2) ? MyRoomInProfileFrag.m71693M4(str, str2) : MyRoomInProfileNewFrag.m71733M4(str, str2);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public void updateLiveMemberUser(User user, boolean z) {
        if (mqr.m159592l()) {
            ((fk3) tbs.m190077m(itd0.f116820b)).m125952S(user, z);
        }
    }

    @Override // p153l.qhk0
    public void updateUser(User user) {
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: uq */
    public void mo68472uq(Act act, String str, String str2) {
        jwk0.m147171e(act, str, str2);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: vf */
    public Intent mo68473vf(Intent intent) {
        intent.putExtra("tt_live_flag_extra", true);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: wc */
    public void mo68474wc(String str) {
        LiveSquareApi.livePushShown(str);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: wd */
    public void mo68475wd(Context context, String str, String str2, @Nullable String str3) {
        tbs.f172993f.m143713o(context, str, str2);
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: yn */
    public boolean mo68476yn() {
        return m68394N(!tbs.f172989b.m203373A6() || m68418Q());
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: zn */
    public void mo68477zn(Act act, String str) {
    }

    @Override // com.p051p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public void startAudienceLive(Context context, String str, String str2, @Nullable String str3) {
        context.startActivity(tbs.f172993f.m143704f(context, AudienceStartData.getBuilder().m68777E(str).m68787O(str2).m68798y(str3).m68794u()));
    }
}
