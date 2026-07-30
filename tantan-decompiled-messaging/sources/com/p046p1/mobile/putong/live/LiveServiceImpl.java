package com.p046p1.mobile.putong.live;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.LiveBubbleConfig;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveState;
import com.p046p1.mobile.putong.data.UserWealthGradeConfig;
import com.p046p1.mobile.putong.data.VoiceLiveState;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.LiveServiceImpl;
import com.p046p1.mobile.putong.live.base.apibean.FanBaseGroupSummaryBean;
import com.p046p1.mobile.putong.live.base.bean.AnchorStartData;
import com.p046p1.mobile.putong.live.base.bean.AudienceStartData;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveMonetizationConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveRoomInProfile;
import com.p046p1.mobile.putong.live.base.data.BLiveSchema;
import com.p046p1.mobile.putong.live.base.data.BLiveVideoChatAssets;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceRoomInProfile;
import com.p046p1.mobile.putong.live.base.data.LiveCommonData;
import com.p046p1.mobile.putong.live.base.webview.LiveWebViewAct;
import com.p046p1.mobile.putong.live.external.internal.api.LiveVoiceApi;
import com.p046p1.mobile.putong.live.external.internal.live.square.LiveSquareHomeFragDomestic;
import com.p046p1.mobile.putong.live.external.internal.live.square.fragments.videochat.LiveVideoChatFrag;
import com.p046p1.mobile.putong.live.external.internal.vchat.C12505a;
import com.p046p1.mobile.putong.live.external.intl.livesquare.home.IntlLiveSquareHomeFrag;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlChatLivingStateView;
import com.p046p1.mobile.putong.live.external.intl.view.widgets.IntlVoiceActivitiesInChatView;
import com.p046p1.mobile.putong.live.external.module.api.LiveSquareApi;
import com.p046p1.mobile.putong.live.external.module.api.MyRoomInProfileNewApi;
import com.p046p1.mobile.putong.live.external.module.arch.LiveBaseAct;
import com.p046p1.mobile.putong.live.external.page.profile.myroom.MyRoomInProfileFrag;
import com.p046p1.mobile.putong.live.external.page.profile.myroom.view.MyRoomInExpandedCard;
import com.p046p1.mobile.putong.live.external.page.profile.myroomnew.MyRoomInProfileNewFrag;
import com.p046p1.mobile.putong.live.external.page.setting.LiveIndependentSettingAct;
import com.p046p1.mobile.putong.live.external.page.teenmode.LiveTeenDialogAct;
import com.p046p1.mobile.putong.live.external.square.home.LiveSquareHomeFrag;
import com.p046p1.mobile.putong.live.external.voiceslipcard.popularroom.group.LiveGroupChatFrag;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LivingBaseAct;
import com.p046p1.mobile.putong.live.livingroom.virtual.api.VoiceVirtualApi;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveSettingArgs;
import com.tantanapp.android.injecter.facade.annotation.Route;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import p133rx.C22306c;
import p147v.VText;
import p149l.C18367m2;
import p149l.a8m;
import p149l.bco;
import p149l.bkn0;
import p149l.btu;
import p149l.c5c0;
import p149l.cco;
import p149l.cqp;
import p149l.d30;
import p149l.ddv;
import p149l.dim0;
import p149l.dnk0;
import p149l.e30;
import p149l.e5s;
import p149l.eeg;
import p149l.ekn0;
import p149l.f5c0;
import p149l.ffw;
import p149l.fvm0;
import p149l.fzl0;
import p149l.fzs;
import p149l.g9s;
import p149l.gl3;
import p149l.gld0;
import p149l.gvm0;
import p149l.h9s;
import p149l.hl3;
import p149l.huk;
import p149l.itu;
import p149l.iuk;
import p149l.iuu;
import p149l.j2e0;
import p149l.j760;
import p149l.j7d0;
import p149l.jj3;
import p149l.k8k0;
import p149l.l9s;
import p149l.lor;
import p149l.lsi0;
import p149l.m0t;
import p149l.m1n0;
import p149l.mor;
import p149l.n0t;
import p149l.nj3;
import p149l.o1n0;
import p149l.o7h0;
import p149l.osi0;
import p149l.p2h;
import p149l.p6c0;
import p149l.pgi0;
import p149l.q2h;
import p149l.q7h0;
import p149l.qib0;
import p149l.rw0;
import p149l.rwj0;
import p149l.rzt;
import p149l.s9s;
import p149l.sqa0;
import p149l.tvp;
import p149l.tzt;
import p149l.ult;
import p149l.uvr;
import p149l.vdt;
import p149l.vwb;
import p149l.w8u;
import p149l.w9j;
import p149l.wb3;
import p149l.wdo0;
import p149l.wlt;
import p149l.wp1;
import p149l.x4u;
import p149l.x7m;
import p149l.xaj0;
import p149l.xdo0;
import p149l.xpf;
import p149l.yyl0;

/* JADX INFO: loaded from: classes13.dex */
@Route(name = "LiveService服务", path = "/live_service/service")
public class LiveServiceImpl implements LiveService {

    /* JADX INFO: renamed from: a */
    public q7h0 f44065a;

    /* JADX INFO: renamed from: b */
    public p2h f44066b;

    /* JADX INFO: renamed from: c */
    public btu f44067c;

    /* JADX INFO: renamed from: d */
    public huk f44068d;

    /* JADX INFO: renamed from: e */
    public volatile bkn0 f44069e;

    /* JADX INFO: renamed from: f */
    public volatile fvm0 f44070f;

    /* JADX INFO: renamed from: g */
    public volatile wdo0 f44071g;

    /* JADX INFO: renamed from: h */
    public volatile yyl0 f44072h;

    /* JADX INFO: renamed from: i */
    public x7m f44073i;

    /* JADX INFO: renamed from: j */
    public WeakReference<a8m> f44074j;

    /* JADX INFO: renamed from: k */
    public fzs f44075k;

    /* JADX INFO: renamed from: l */
    public rzt f44076l;

    /* JADX INFO: renamed from: m */
    public m0t f44077m;

    /* JADX INFO: renamed from: n */
    public cco f44078n;

    /* JADX INFO: renamed from: o */
    public cqp f44079o;

    /* JADX INFO: renamed from: p */
    public C18367m2 f44080p = new mor();

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.LiveServiceImpl$a */
    public class ViewOnClickListenerC11419a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f44081a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ FanBaseGroupSummaryBean f44082b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Dialog f44083c;

        public ViewOnClickListenerC11419a(Act act, FanBaseGroupSummaryBean fanBaseGroupSummaryBean, Dialog dialog) {
            this.f44081a = act;
            this.f44082b = fanBaseGroupSummaryBean;
            this.f44083c = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Act act = this.f44081a;
            act.startActivity(s9s.f163232f.m134373f(act, AudienceStartData.getBuilder().m67594E(this.f44082b.getLiveId()).m67604O("group_profile_fans").m67611u()));
            this.f44083c.dismiss();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.LiveServiceImpl$b */
    public class ViewOnClickListenerC11420b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Dialog f44085a;

        public ViewOnClickListenerC11420b(Dialog dialog) {
            this.f44085a = dialog;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f44085a.dismiss();
        }
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m67205F(Act act, BLiveSchema bLiveSchema) {
        if (bLiveSchema != null) {
            lsi0.m151595y(bLiveSchema.tip);
            j2e0.m139446m(act, Uri.parse(bLiveSchema.schema));
        }
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m67208K(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            lsi0.m151595y(((TantanException.Client.CoreService) th).metaMessage);
        } else {
            lsi0.m151593w(R$string.f44090d);
        }
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m67209L(Throwable th) {
        if (th instanceof TantanException.Client.CoreService) {
            TantanException.Client.CoreService coreService = (TantanException.Client.CoreService) th;
            lsi0.m151595y(coreService.metaMessage);
            if (coreService.code == 41063) {
                lsi0.m151595y(coreService.metaMessage);
                return;
            }
        }
        lsi0.m151593w(R$string.f44087a);
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m67210M(String str, Act act, BLiveVideoChatAssets bLiveVideoChatAssets) {
        if (!bLiveVideoChatAssets.canEnterTab) {
            osi0.m165783g(bLiveVideoChatAssets.enterFailTip);
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString(LiveVideoChatFrag.KEY_VIDEO_CHAT_PAGE_SOURCE, str);
        act.startActivity(LiveIndependentSettingAct.m70699Y1(act, "live_video_chat", bundle));
    }

    /* JADX INFO: renamed from: N */
    public static boolean m67211N(boolean z) {
        return z || App.m20427f();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Bq */
    public boolean mo67212Bq() {
        return m67211N(!s9s.f163228b.m195998z6());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: C8 */
    public boolean mo67213C8() {
        return m67211N(!s9s.f163228b.m195610D6());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Dr */
    public String mo67214Dr(String str) {
        return m67234P(str, "onlive");
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Ei */
    public boolean mo67215Ei(int i) {
        return vdt.m198092b(i);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Ep */
    public void mo67216Ep() {
        LiveSquareApi.notifyEntryMainPager();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: F8 */
    public void mo67217F8(Act act, boolean z, boolean z2, String str) {
        s9s.f163232f.m134368a(act, AnchorStartData.getBuilder().m67562m(z2).m67561l(z).m67563n(str).m67560k());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Fr */
    public void mo67218Fr() {
        LiveTeenDialogAct.m70803V1("为呵护未成年人健康成长，探探特别推出青少年模式，该模式下部分功能无法使用。请监护人主动选择，并设置监护密码");
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Gj */
    public UserWealthGradeConfig mo67219Gj(int i, boolean z) {
        return s9s.f163228b.m195930r5(i, z);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Gr */
    public Intent mo67220Gr(Context context, @Nullable LiveSettingArgs liveSettingArgs) {
        Bundle bundle = new Bundle();
        if (liveSettingArgs != null) {
            bundle.putParcelable("live_setting_frag_arg", liveSettingArgs);
        }
        return LiveIndependentSettingAct.m70699Y1(context, "live_setting_page", bundle);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: He */
    public void mo67221He(HashMap<String, ValueObject> map, HashMap<String, ValueObject> map2, Envelope envelope) {
        LiveCommonData liveCommonData = (LiveCommonData) envelope.getModuleData(LiveCommonData.class);
        if (liveCommonData != null) {
            List<BLiveRoomInProfile> list = liveCommonData.profileLiveRooms;
            List<BLiveVoiceRoomInProfile> list2 = liveCommonData.profileVoiceRooms;
            if (!vwb.m200296J(list)) {
                for (BLiveRoomInProfile bLiveRoomInProfile : list) {
                    map.put(bLiveRoomInProfile.anchorId, bLiveRoomInProfile);
                }
            }
            if (vwb.m200296J(list2)) {
                return;
            }
            for (BLiveVoiceRoomInProfile bLiveVoiceRoomInProfile : list2) {
                map2.put(bLiveVoiceRoomInProfile.anchorId, bLiveVoiceRoomInProfile);
            }
        }
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Hh */
    public String mo67222Hh() {
        return s9s.f163228b.m195824e5();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: I6 */
    public fvm0 mo67223I6() {
        if (this.f44070f == null) {
            this.f44070f = new gvm0();
        }
        return this.f44070f;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Ii */
    public boolean mo67224Ii(Intent intent) {
        return intent.getBooleanExtra("tt_live_flag_extra", false);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Ir */
    public void mo67225Ir(String str, String str2) {
        LiveVoiceApi.livePushPGCReport(str, str2);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Kb */
    public boolean mo67226Kb() {
        return m67211N(!s9s.f163228b.m195626F6() || m67235Q());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: L7 */
    public C22306c<Boolean> mo67227L7() {
        return sqa0.m185475b().m185476a();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Lh */
    public a8m mo67228Lh() {
        WeakReference<a8m> weakReference = this.f44074j;
        if (weakReference == null || weakReference.get() == null) {
            if (vdt.m198092b(3)) {
                this.f44074j = new WeakReference<>(new o1n0());
            } else {
                this.f44074j = new WeakReference<>(new m1n0());
            }
        }
        return this.f44074j.get();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: M6 */
    public bkn0 mo67229M6() {
        if (this.f44069e == null) {
            synchronized (LiveServiceImpl.class) {
                try {
                    if (this.f44069e == null) {
                        this.f44069e = new ekn0();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.f44069e;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: M7 */
    public boolean mo67230M7() {
        return pgi0.m168730l().m168751x();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Ms */
    public cqp mo67231Ms(Act act, wp1 wp1Var) {
        if (this.f44079o == null) {
            this.f44079o = new IntlVoiceActivitiesInChatView(act, wp1Var);
        }
        return this.f44079o;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Ok */
    public boolean mo67232Ok() {
        if (lor.m150807l()) {
            return !((jj3) s9s.m182763m(gld0.f103314d)).f118220a.get().booleanValue();
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Om */
    public boolean mo67233Om() {
        return m67211N(!s9s.f163228b.m195990y6());
    }

    /* JADX INFO: renamed from: P */
    public String m67234P(String str, String str2) {
        return j7d0.m140091b(str, str2);
    }

    /* JADX INFO: renamed from: Q */
    public boolean m67235Q() {
        return m67211N(s9s.f163228b.m195593B5());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Qc */
    public boolean mo67236Qc() {
        return m67211N(!s9s.f163228b.m195967v6() || m67235Q());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Qj */
    public boolean mo67237Qj() {
        return m67211N(!s9s.f163228b.m195642H6() || m67235Q());
    }

    /* JADX INFO: renamed from: R */
    public final boolean m67238R() {
        return m67211N(!s9s.f163228b.m195982x6() || !s9s.f163228b.m195634G6()) || s9s.f163228b.m195898n7();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Rh */
    public boolean mo67239Rh() {
        return s9s.f163228b.m195918pb();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m67240S(Act act, FanBaseGroupSummaryBean fanBaseGroupSummaryBean) {
        if (fanBaseGroupSummaryBean.getCode() == 50002) {
            m67243T(act, fanBaseGroupSummaryBean);
        } else if (fanBaseGroupSummaryBean.getCode() == 50001) {
            lsi0.m151595y(fanBaseGroupSummaryBean.getMsg());
        } else {
            lsi0.m151593w(R$string.f44089c);
        }
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: S8 */
    public C22306c<j760<ValueObject, ValueObject>> mo67241S8(String str) {
        return new MyRoomInProfileNewApi().getMyRoomInProfileNew(str).map(new w9j() { // from class: l.vlt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return j760.m140076a((ValueObject) j760Var.f116564a, (ValueObject) j760Var.f116565b);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Sf */
    public void mo67242Sf() {
        ((nj3) s9s.m182763m(gld0.f103312b)).m159612J();
    }

    /* JADX INFO: renamed from: T */
    public final void m67243T(Act act, FanBaseGroupSummaryBean fanBaseGroupSummaryBean) {
        Dialog dialogM20567z = act.dialog().m20517M(p6c0.f147394a).m20559v().m20567z();
        dialogM20567z.m20458P().findViewById(c5c0.f79360a).setOnClickListener(new ViewOnClickListenerC11419a(act, fanBaseGroupSummaryBean, dialogM20567z));
        dialogM20567z.m20458P().findViewById(c5c0.f79361b).setOnClickListener(new ViewOnClickListenerC11420b(dialogM20567z));
        dialogM20567z.getWindow().setBackgroundDrawable(new ColorDrawable(0));
        ((VText) dialogM20567z.m20458P().findViewById(f5c0.f95043R1)).setTypeface(null, 1);
        dialogM20567z.show();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Tc */
    public void mo67244Tc(Act act, String str, boolean z) {
        dnk0.m112648g(act, str, z);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Uf */
    public fzs mo67245Uf(Context context) {
        if (this.f44075k == null) {
            this.f44075k = new IntlChatLivingStateView(context);
        }
        return new IntlChatLivingStateView(context);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Vm */
    public boolean mo67246Vm(ValueObject valueObject) {
        if (valueObject instanceof BLiveVoiceRoomInProfile) {
            return TextUtils.equals(((BLiveVoiceRoomInProfile) valueObject).status, "onlive");
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Xh */
    public Intent mo67247Xh(Context context, IntentParams intentParams) {
        return s9s.f163232f.m134373f(context, AudienceStartData.getBuilder().m67594E(intentParams.liveId).m67604O(intentParams.source).m67615y(intentParams.category).m67599J(intentParams.open).m67596G(intentParams.liveSchema).m67600K(intentParams.requestExtra).m67611u());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Y8 */
    public void mo67248Y8(Act act, boolean z, int i, d30 d30Var) {
        C12505a.m69244n(act, z, i, d30Var);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Yk */
    public boolean mo67249Yk(String str) {
        List<String> listM195784Z4 = s9s.f163228b.m195784Z4();
        if (listM195784Z4 == null || listM195784Z4.size() == 0) {
            return !str.equalsIgnoreCase("live");
        }
        Iterator<String> it = listM195784Z4.iterator();
        while (it.hasNext()) {
            if (it.next().equalsIgnoreCase(str)) {
                return false;
            }
        }
        return true;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Ys */
    public wb3 mo67250Ys() {
        return ((nj3) s9s.m182763m(gld0.f103312b)).m159638t();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Z8 */
    public void mo67251Z8(Act act, Bundle bundle) {
        x4u.m207038x(act, bundle);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    @Nullable
    /* JADX INFO: renamed from: Zl */
    public VoiceLiveState mo67252Zl(String str) {
        return ((nj3) s9s.m182763m(gld0.f103312b)).m159607E(str);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Zo */
    public x7m mo67253Zo() {
        if (this.f44073i == null) {
            this.f44073i = new dim0();
        }
        return this.f44073i;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: Zr */
    public boolean mo67254Zr() {
        return m67211N(!s9s.f163228b.m195602C6() || m67235Q());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: a */
    public g9s mo67255a() {
        return h9s.m130033g();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: a7 */
    public String mo67256a7() {
        if (vdt.m198092b(1)) {
            return s9s.f163228b.m195632G4();
        }
        return (TEnum.equals(qib0.f154719h0, LiveRegionTag.taiwan) || TEnum.equals(qib0.f154719h0, LiveRegionTag.indonesia)) ? w8u.m202217t(R$string.f44088b) : s9s.f163228b.m195632G4();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ao */
    public C22306c<Boolean> mo67257ao(String str) {
        if (vdt.m198092b(2)) {
            return C22306c.just(Boolean.FALSE);
        }
        return lor.m150798c() ? tvp.INSTANCE.m190773c(str) : C22306c.just(Boolean.FALSE);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: b7 */
    public PutongFrag mo67258b7() {
        return !vdt.m198092b(2) ? new LiveGroupChatFrag() : new PutongFrag();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: bl */
    public C22306c<e5s> mo67259bl() {
        return ((hl3) s9s.m182763m(gld0.f103313c)).m131634h().map(new wlt());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public Fragment buildLiveSquareFrag() {
        if (lor.m150807l()) {
            return vdt.m198092b(2) ? new LiveSquareHomeFragDomestic() : new IntlLiveSquareHomeFrag();
        }
        return null;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: c8 */
    public int mo67260c8() {
        return s9s.f163228b.m195585A5();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ce */
    public e5s mo67261ce() {
        return xpf.m210488d(((hl3) s9s.m182763m(gld0.f103313c)).m131634h().m221515e());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: co */
    public wdo0 mo67262co() {
        if (this.f44071g == null) {
            this.f44071g = new xdo0();
        }
        return this.f44071g;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ek */
    public void mo67263ek(final Act act, String str) {
        act.duringCreated(eeg.m115965b(str, l9s.m149093o0())).subscribe(ffw.m121194e(new e30() { // from class: l.xlt
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193495a.m67240S(act, (FanBaseGroupSummaryBean) obj);
            }
        }, new e30() { // from class: l.ylt
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveServiceImpl.m67208K((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: es */
    public boolean mo67264es() {
        return m67211N(!s9s.f163228b.m195975w6() || m67235Q());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public p2h feedEntry() {
        if (this.f44066b == null) {
            this.f44066b = new q2h();
        }
        return this.f44066b;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: g6 */
    public void mo67265g6(String str) {
        rwj0.m181412k(str, null);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: g9 */
    public boolean mo67266g9() {
        return m67211N(!s9s.f163228b.m195618E6() || m67235Q());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ga */
    public void mo67267ga(final Act act, String str, String str2) {
        act.duringCreated(VoiceVirtualApi.getLiveSchemaStatus(str, str2)).subscribe(ffw.m121194e(new e30() { // from class: l.zlt
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveServiceImpl.m67205F(act, (BLiveSchema) obj);
            }
        }, new e30() { // from class: l.amt
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveServiceImpl.m67209L((Throwable) obj);
            }
        }));
    }

    @NonNull
    public C18367m2 getAbHooker() {
        return this.f44080p;
    }

    public C22306c<ArrayList<LiveBubbleConfig>> getBubbleConfig() {
        return ((nj3) s9s.m182763m(gld0.f103312b)).m159628j().map(new w9j() { // from class: l.slt
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return xpf.m210487c((BLiveMonetizationConfig) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public huk getH5PageApi() {
        if (this.f44068d == null) {
            this.f44068d = new iuk();
        }
        return this.f44068d;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public int getHomeLiveTabPosition() {
        return (lor.m150807l() && m67238R()) ? 1 : -1;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public String getLiveCardText() {
        return s9s.f163228b.m195972w3();
    }

    public String getLiveFakeTitle() {
        if (NullChecker.m81303a(s9s.f163228b)) {
            return s9s.f163228b.m195887m4();
        }
        return null;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public btu getLiveVerification() {
        if (this.f44067c == null) {
            this.f44067c = new itu();
        }
        return this.f44067c;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public String getTopShowingPageId(Fragment fragment) {
        return isLiveSquareHome(fragment) ? ((LiveSquareHomeFrag) fragment).mo68943M4() : "";
    }

    @Override // p149l.k8k0
    public User getUserById(String str) {
        return k8k0.C17956a.m144943a(this, str);
    }

    @Override // p149l.k8k0
    public User getUserByIdInModule(String str) {
        if (!lor.m150807l()) {
            return null;
        }
        User userM159640v = ((nj3) s9s.m182763m(gld0.f103312b)).m159640v(str);
        return (userM159640v == null && NullChecker.m81303a(s9s.f163232f)) ? s9s.f163232f.m134378k(str) : userM159640v;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public String getUserLiveId(String str) {
        return ((nj3) s9s.m182763m(gld0.f103312b)).m159604B(str);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public String getUserVirtualVoiceId(String str) {
        return ((nj3) s9s.m182763m(gld0.f103312b)).m159606D(str);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: gg */
    public int mo67268gg() {
        return p6c0.f147395b;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: gj */
    public void mo67269gj(Act act, String str) {
        j2e0.m139446m(act, Uri.parse(str));
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public boolean hasLiveSettingEntry() {
        if (!mo67293yn()) {
            return false;
        }
        if (lor.m150807l() && s9s.f163228b.m195959u7()) {
            return true;
        }
        return (lor.m150807l() && s9s.f163228b.m195615E3()) || lor.m150803h();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ih */
    public String mo67270ih() {
        return s9s.f163228b.m195696O4();
    }

    @Override // com.tantanapp.android.injecter.facade.template.IProvider
    public void init(Context context) {
    }

    public boolean isLiveAct(Activity activity) {
        return (activity instanceof LiveBaseAct) || (activity instanceof LivingBaseAct);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public boolean isLiveSquareHome(Fragment fragment) {
        return fragment instanceof LiveSquareHomeFrag;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public boolean isLiving() {
        Act.C4299r c4299rForeground_ = Act.foreground_();
        return c4299rForeground_ != null && s9s.f163232f.m134380m(c4299rForeground_.f15343a.get()) && c4299rForeground_.f15344b == C4319c.f15548i;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public boolean liveShowMomentLikesAndComments() {
        return s9s.f163228b.m195910ob();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: lp */
    public boolean mo67271lp() {
        return m67211N(!s9s.f163228b.m195958u6());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    @Nullable
    /* JADX INFO: renamed from: lt */
    public UserLiveState mo67272lt(String str) {
        return ((nj3) s9s.m182763m(gld0.f103312b)).m159605C(str);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: mg */
    public rzt mo67273mg() {
        if (this.f44076l == null) {
            this.f44076l = new tzt();
        }
        return this.f44076l;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ne */
    public void mo67274ne() {
        ((gl3) s9s.m182763m(gld0.f103315e)).m126744g(System.currentTimeMillis());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: nf */
    public void mo67275nf(final Act act, final String str) {
        act.duringCreated(iuu.m138446G(str)).subscribe(ffw.m121194e(new e30() { // from class: l.tlt
            @Override // p149l.e30
            public final void call(Object obj) {
                LiveServiceImpl.m67210M(str, act, (BLiveVideoChatAssets) obj);
            }
        }, new ult()));
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: oj */
    public void mo67276oj(View view, xaj0<ValueObject, ValueObject, Boolean> xaj0Var, String str) {
        if (view instanceof MyRoomInExpandedCard) {
            ((MyRoomInExpandedCard) view).m70523l(xaj0Var, str);
        }
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: oo */
    public o7h0 mo67277oo() {
        if (this.f44065a == null) {
            this.f44065a = new q7h0();
        }
        return this.f44065a;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: p8 */
    public boolean mo67278p8() {
        return m67211N(!s9s.f163228b.m195594B6() || m67235Q());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public void putLiveState(List<User> list) {
        ((nj3) s9s.m182763m(gld0.f103312b)).m159613K(list);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: qs */
    public cco mo67279qs() {
        if (this.f44078n == null) {
            this.f44078n = new bco();
        }
        return this.f44078n;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: r9 */
    public yyl0 mo67280r9() {
        if (this.f44072h == null) {
            this.f44072h = new fzl0();
        }
        return this.f44072h;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: rb */
    public boolean mo67281rb() {
        return s9s.f163228b.m195964v3();
    }

    public void release() {
        this.f44066b = null;
        this.f44067c = null;
        this.f44074j = null;
        this.f44073i = null;
        this.f44075k = null;
        cco ccoVar = this.f44078n;
        if (ccoVar != null) {
            ccoVar.release();
            this.f44078n = null;
        }
        cqp cqpVar = this.f44079o;
        if (cqpVar != null) {
            cqpVar.release();
            this.f44079o = null;
        }
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: rh */
    public void mo67282rh(Act act) {
        Intent intentM149098r = l9s.m149098r(act, NavigationIntent.get("live"));
        Bundle bundle = new Bundle();
        bundle.putString("navigation_live_intent", BLiveAbsData.VOICE_LIVE);
        intentM149098r.putExtra("extra_new_main_bundle", bundle);
        act.startActivity(intentM149098r);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: rk */
    public void mo67283rk(LiveRegionTag liveRegionTag) {
        if (rw0.m181367a()) {
            s9s.m182764n(liveRegionTag);
            return;
        }
        s9s.f163228b.m121236q();
        uvr.m196087d().m121236q();
        s9s.f163232f.m134385r(liveRegionTag);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: sd */
    public long mo67284sd() {
        return ((nj3) s9s.m182763m(gld0.f103312b)).m159641w();
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: sj */
    public String mo67285sj() {
        return s9s.f163227a.getString(R$string.f44091e);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public void startAudienceLive(Context context, IntentParams intentParams) {
        context.startActivity(s9s.f163232f.m134373f(context, AudienceStartData.getBuilder().m67593D(xpf.m210489e(intentParams.live)).m67604O(intentParams.source).m67596G(intentParams.liveSchema).m67615y(intentParams.category).m67602M(intentParams.showSignInDialog).m67611u()));
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public void startLiveVerificationPage(Context context) {
        context.startActivity(LiveWebViewAct.m68883c2(context, ddv.f85658h));
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: t7 */
    public m0t mo67286t7() {
        if (this.f44077m == null) {
            this.f44077m = new n0t();
        }
        return this.f44077m;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ub */
    public boolean mo67287ub(ValueObject valueObject) {
        if (valueObject instanceof BLiveRoomInProfile) {
            return TextUtils.equals(((BLiveRoomInProfile) valueObject).status, "onlive");
        }
        return false;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: ue */
    public Frag mo67288ue(String str, String str2) {
        return !vdt.m198092b(2) ? MyRoomInProfileFrag.m70510M4(str, str2) : MyRoomInProfileNewFrag.m70550M4(str, str2);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public void updateLiveMemberUser(User user, boolean z) {
        if (lor.m150807l()) {
            ((nj3) s9s.m182763m(gld0.f103312b)).m159621S(user, z);
        }
    }

    @Override // p149l.k8k0
    public void updateUser(User user) {
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: uq */
    public void mo67289uq(Act act, String str, String str2) {
        dnk0.m112646e(act, str, str2);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: vf */
    public Intent mo67290vf(Intent intent) {
        intent.putExtra("tt_live_flag_extra", true);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: wc */
    public void mo67291wc(String str) {
        LiveSquareApi.livePushShown(str);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: wd */
    public void mo67292wd(Context context, String str, String str2, @Nullable String str3) {
        s9s.f163232f.m134382o(context, str, str2);
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: yn */
    public boolean mo67293yn() {
        return m67211N(!s9s.f163228b.m195586A6() || m67235Q());
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    /* JADX INFO: renamed from: zn */
    public void mo67294zn(Act act, String str) {
    }

    @Override // com.p046p1.mobile.putong.live_api.api.serviceprovider.api.LiveService
    public void startAudienceLive(Context context, String str, String str2, @Nullable String str3) {
        context.startActivity(s9s.f163232f.m134373f(context, AudienceStartData.getBuilder().m67594E(str).m67604O(str2).m67615y(str3).m67611u()));
    }
}
