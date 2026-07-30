package p153l;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p053ui.poplevel.C4522a;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4880a0;
import com.p051p1.mobile.putong.core.api.C4883c;
import com.p051p1.mobile.putong.core.api.C4906u;
import com.p051p1.mobile.putong.core.api.C4907v;
import com.p051p1.mobile.putong.core.api.CoreProduct;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.FreeTrialEnvelope;
import com.p051p1.mobile.putong.core.data.Greeting;
import com.p051p1.mobile.putong.core.data.UserId;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p051p1.mobile.putong.core.newui.home.C8016a;
import com.p051p1.mobile.putong.core.newui.main.C8247a;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.message.IntlDynamicGreetListAct;
import com.p051p1.mobile.putong.core.p058ui.intloperation.campingactivity.C8545b;
import com.p051p1.mobile.putong.core.p058ui.marry.status.MarryStatusSetAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupProfileAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchMatchUser;
import com.p051p1.mobile.putong.core.p058ui.poplevel.CorePopLevel;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.quickaudio.DropDownAct;
import com.p051p1.mobile.putong.core.p058ui.quicklogin.C8984a;
import com.p051p1.mobile.putong.core.p058ui.settings.SettingsFragOld;
import com.p051p1.mobile.putong.core.p058ui.vip.VipAct;
import com.p051p1.mobile.putong.core.p058ui.vip.VipLocationHistoryAct;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.core.p058ui.vip.picks.act.PicksAct;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MomentFeedPushArgs;
import com.p051p1.mobile.putong.data.NavigationCardIntent;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.OMSDialogInfo;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveSettings;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import com.p051p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p051p1.mobile.putong.location.Location;
import com.p051p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.iam;

/* JADX INFO: loaded from: classes11.dex */
public abstract class k930<V extends iam> extends ar2<V> {

    /* JADX INFO: renamed from: p */
    public static boolean f124436p = false;

    /* JADX INFO: renamed from: q */
    public static boolean f124437q = false;

    /* JADX INFO: renamed from: a */
    public Act f124438a;

    /* JADX INFO: renamed from: b */
    public TabName f124439b;

    /* JADX INFO: renamed from: c */
    public C22507a<uxj0> f124440c;

    /* JADX INFO: renamed from: d */
    public jxd0 f124441d;

    /* JADX INFO: renamed from: e */
    public long f124442e;

    /* JADX INFO: renamed from: f */
    public boolean f124443f;

    /* JADX INFO: renamed from: g */
    public boolean f124444g;

    /* JADX INFO: renamed from: h */
    public NavigationIntent f124445h;

    /* JADX INFO: renamed from: i */
    public HashMap<String, String> f124446i;

    /* JADX INFO: renamed from: j */
    public int f124447j;

    /* JADX INFO: renamed from: k */
    public NavigationCardIntent f124448k;

    /* JADX INFO: renamed from: l */
    public C8247a.v f124449l;

    /* JADX INFO: renamed from: m */
    public boolean f124450m;

    /* JADX INFO: renamed from: n */
    public boolean f124451n;

    /* JADX INFO: renamed from: o */
    public C22507a<uxj0> f124452o;

    /* JADX INFO: renamed from: l.k930$a */
    public class RunnableC18121a implements Runnable {
        public RunnableC18121a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            o1j0.m165651y(CoreModule.f18263b.getResources().getString(R$string.f18509H6));
        }
    }

    /* JADX INFO: renamed from: l.k930$b */
    public static abstract class AbstractC18122b<V extends k930> {

        /* JADX INFO: renamed from: a */
        public V f124454a;

        public AbstractC18122b(V v2) {
            this.f124454a = v2;
        }
    }

    public k930(ner nerVar) {
        super(nerVar);
        this.f124439b = CoreModule.m30934Q().mo68413M7() ? TabName.Live : TabName.Card;
        this.f124440c = C22507a.m222759c(uxj0.f181467a);
        this.f124441d = new jxd0("settingLocationShown" + CoreModule.m30929H().userId(), Boolean.FALSE);
        this.f124442e = -92233720368547758L;
        this.f124443f = false;
        this.f124444g = false;
        this.f124450m = false;
        this.f124451n = false;
        this.f124452o = C22507a.m222758b();
        mo41391h1();
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m148798A0() {
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m148802F0(Throwable th) {
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m148804H0(uxj0 uxj0Var) {
        if (gra.m131610O2()) {
            wkh0.m206818d();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m148805I0(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m148806J0(Counter counter) {
        C4883c c4883c = CoreModule.f18264c;
        if (c4883c.f20320J2) {
            return;
        }
        c4883c.f20320J2 = true;
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ boolean m148809O0() {
        if (NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.opened) {
            fph0.m126639J(true);
        } else {
            fph0.m126639J(false);
        }
        if (PermissionHelper.m81064b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            fph0.m126637H(true);
        } else {
            fph0.m126637H(false);
        }
        if (PermissionHelper.m81064b("android.permission.READ_CONTACTS")) {
            fph0.m126656a(true);
        } else {
            fph0.m126656a(false);
        }
        if (PermissionHelper.m81064b("android.permission.READ_EXTERNAL_STORAGE")) {
            fph0.m126658b(true);
        } else {
            fph0.m126658b(false);
        }
        fph0.m126644O();
        return false;
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m148810P0(Throwable th) {
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m148812R0(CoreSuggested.UserInfo userInfo) {
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m148815V0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m148825k0(SettingGroups settingGroups) {
        wtd.f190738a.put("");
        wtd.f190739b.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m148826l0(uxj0 uxj0Var) {
        CoreModule.f18264c.f20385f1.m155913m4();
        CoreModule.f18264c.f20384f0.m33653Fo();
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ C22421c m148827m0(uxj0 uxj0Var) {
        C22421c<Location> c22421cM80047p = uqb0.f180370E.m80047p();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return c22421cM80047p.take(5L, timeUnit).buffer(6L, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m148828m1(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && Act.isFromBackground) {
            if (m148843b1() == TabName.Card || m148843b1() == TabName.Msg) {
                tx0.m193439o().m193448K(act());
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m148830o0(Throwable th) {
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m148835t0(Throwable th) {
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m148836u0(CoreSuggested.UserInfo userInfo) {
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m148838y0(List list) {
        if (list.size() == 0) {
            return;
        }
        jyb.m147520m(list, new qcj() { // from class: l.b930
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Location) obj).m80018z() > System.currentTimeMillis() - 43200000);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m148839z0(NetworkInfo networkInfo) {
        CoreModule.f18264c.f20405m0.m32069W8().first().subscribe();
        CoreModule.f18264c.f20384f0.m33871Ye().first().subscribe(psd0.m173591B());
    }

    /* JADX INFO: renamed from: B1 */
    public void m148840B1(int i) {
        uqb0.f180370E.m80051t();
        duringCreated(uqb0.f180370E.m80047p().take(10L, TimeUnit.SECONDS)).observeOn(fo0.m126432a()).materialize().first().subscribe(psd0.m173596G(new y20() { // from class: l.v730
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20405m0.m32130m8();
            }
        }));
        if (i == 33) {
            this.f124440c.m137019l(uxj0.f181467a);
        }
    }

    @Override // p153l.ar2, p153l.k3m
    /* JADX INFO: renamed from: C */
    public void mo52715C(V v2) {
        super.mo52715C(v2);
        this.f124438a = v2.getAct();
    }

    /* JADX INFO: renamed from: C1 */
    public final void m148841C1(final String str) {
        if (gra.m131637V1()) {
            duringCreated(CoreModule.f18264c.f20387g0.m32812H6(str).filter(new ui7()).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.z830
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f203304a.m148854o1(str, (ChatGroup) obj);
                }
            }, new y20() { // from class: l.a930
                @Override // p153l.y20
                public final void call(Object obj) {
                    k930.m148830o0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: D1 */
    public void m148842D1() {
        String str;
        long longExtra = m148844c1().getLongExtra("extra_heartbeat_expire_time", -1L);
        if (longExtra > 0 && pzi0.m174454o() > longExtra) {
            l51.m152888H(act(), new RunnableC18121a(), 1000L);
            m148844c1().removeExtra("extra_heartbeat_expire_time");
        }
        if (TEnum.equals(this.f124445h, NavigationIntent.menu)) {
            mo41360a1(TabName.Msg, false);
        } else if (TEnum.equals(this.f124445h, "moment")) {
            mo41360a1(TabName.Moment, false);
            duringCreated(CoreModule.f18264c.f20381e0.f88991A0.filter(new qcj() { // from class: l.e930
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m82486a((MomentFeedPushArgs) obj));
                }
            }).first().compose(psd0.m173592C())).subscribe(psd0.m173596G(new y20() { // from class: l.a830
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f68885a.m148861v1((MomentFeedPushArgs) obj);
                }
            }));
        } else if (TEnum.equals(this.f124445h, "setting")) {
            mo41360a1(TabName.Me, false);
            Intent intent = new Intent(act(), (Class<?>) NewUI1ContainerActivity.class);
            intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
            intent.putExtra("setting_scroll_to_bottom", this.f124450m);
            this.f124438a.startActivity(intent);
        } else if (TEnum.equals(this.f124445h, "profile")) {
            mo41360a1(TabName.Me, false);
        } else {
            String str2 = null;
            if (TEnum.equals(this.f124445h, "live")) {
                mo41360a1(TabName.Live, false);
                IntentParams intentParams = (IntentParams) m148844c1().getSerializableExtra("main_jump_live_tag");
                if (m148844c1().getBooleanExtra("main_jump_live_has_params", false)) {
                    if (intentParams == null) {
                        IntentParams.C13218b c13218b = new IntentParams.C13218b("samsung_intent_params_saved", null);
                        IntentParams intentParams2 = c13218b.get();
                        c13218b.put(new IntentParams());
                        intentParams = intentParams2;
                    }
                    if (NullChecker.m82486a(intentParams) && !r8g0.m180203b(intentParams.liveId)) {
                        act().startActivity(CoreModule.m30934Q().mo68430Xh(act(), intentParams));
                    }
                    m148844c1().removeExtra("main_jump_live_tag");
                    m148844c1().removeExtra("main_jump_live_has_params");
                }
            } else if (TEnum.equals(this.f124445h, NavigationIntent.profile_edit)) {
                mo41360a1(TabName.Me, false);
                act().startActivity(ProfileAct.m51922q2(act(), CoreModule.f18264c.f20381e0.m116600p9().f56859id, "profile_frag_menu", false, true));
            } else if (TEnum.equals(this.f124445h, NavigationIntent.profile_edit_continuous)) {
                mo41360a1(TabName.Me, false);
                act().startActivity(ProfileAct.m51922q2(act(), CoreModule.f18264c.f20381e0.m116600p9().f56859id, CoreStaticData.ProfileFromType.FROM_PROFILE_FRAG_EDIT, false, true));
            } else if (TEnum.equals(this.f124445h, "cards")) {
                mo41360a1(TabName.Card, false);
                if (NullChecker.m82486a(this.f124446i) && this.f124446i.size() > 0) {
                    TextUtils.equals(this.f124446i.get("cardType"), BLiveTraceServerLocation.main);
                }
            } else if (TEnum.equals(this.f124445h, "webview")) {
                Act act = this.f124438a;
                act.startActivity(xwa.m213301A(act, m148844c1().getStringExtra("webview_title"), m148844c1().getStringExtra("webview_url"), m148844c1().getBooleanExtra("hideNavigationBar", false), m148844c1().getBooleanExtra("hardwareAccelerated", false), m148844c1().getBooleanExtra("useMkWebview", false)));
            } else if (TEnum.equals(this.f124445h, "seeLikes")) {
                mo41360a1(TabName.Msg, false);
                this.f124451n = true;
                this.f124452o.m137019l(uxj0.f181467a);
            } else if (TEnum.equals(this.f124445h, NavigationIntent.seeSidePush)) {
                Act act2 = this.f124438a;
                act2.startActivity(LikersAct.m57727Y1(act2, SchemeKey.push_call2buysee));
            } else if (TEnum.equals(this.f124445h, NavigationIntent.seeSideMsg)) {
                Act act3 = this.f124438a;
                act3.startActivity(LikersAct.m57727Y1(act3, "msg_call2buysee"));
            } else if (TEnum.equals(this.f124445h, NavigationIntent.seeSideNewPush)) {
                Act act4 = this.f124438a;
                act4.startActivity(LikersAct.m57727Y1(act4, SchemeKey.push_call2buysee_side_new));
            } else if (TEnum.equals(this.f124445h, NavigationIntent.seeSideNewMsg)) {
                Act act5 = this.f124438a;
                act5.startActivity(LikersAct.m57727Y1(act5, "msg_call2buysee_side_new"));
            } else if (TEnum.equals(this.f124445h, "liveAnchor")) {
                CoreModule.m30934Q().mo68400F8(this.f124438a, true, true, "p_core_push");
            } else if (TEnum.equals(this.f124445h, "startVoiceLive")) {
                CoreModule.m30934Q().mo68412M6().mo127338i(this.f124438a, "");
            } else if (TEnum.equals(this.f124445h, "quickchat")) {
                mo41360a1(TabName.Msg, false);
                CoreModule.f18264c.f20384f0.m33975go();
                l51.m152886F(act(), new Runnable() { // from class: l.b830
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f18264c.f20381e0.f89371z0.m137019l(Boolean.TRUE);
                    }
                });
            } else if (TEnum.equals(this.f124445h, NavigationIntent.greetChat)) {
                if (!d79.m114662U()) {
                    return;
                }
                mo41360a1(TabName.Msg, false);
                duringCreated(CoreModule.f18264c.f20420r0.m35139o5(m148844c1().getStringExtra("greetingId"))).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.c830
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f80178a.m148862x1((Greeting) obj);
                    }
                }, new y20() { // from class: l.d830
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        k930.m148815V0((Throwable) obj);
                    }
                }));
            } else if (TEnum.equals(this.f124445h, NavigationIntent.quickChatMatch)) {
                mo41360a1(TabName.Msg, false);
                final OnlineMatchMatchUser onlineMatchMatchUser = (OnlineMatchMatchUser) m148844c1().getSerializableExtra("otherUser");
                if (NullChecker.m82486a(onlineMatchMatchUser)) {
                    onlineMatchMatchUser.user = CoreModule.f18264c.f20381e0.m116503Pa(onlineMatchMatchUser.userId);
                    l51.m152888H(act(), new Runnable() { // from class: l.e830
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4907v.f20865a0.m137019l(jyb.m147494Y("match_success", onlineMatchMatchUser));
                        }
                    }, 800L);
                }
            } else if (TEnum.equals(this.f124445h, "freeTrialPromotion")) {
                if (CoreModule.f18264c.f20396j0.m31607Q4()) {
                    Intent intentM81348b2 = WebViewAct.m81348b2(act(), CoreModule.f18264c.f20396j0.m31579C4().titleText, CoreModule.f18264c.f20396j0.m31579C4().promotionUrl, true);
                    intentM81348b2.putExtra("hideNavigationBar", true);
                    act().startActivity(intentM81348b2);
                } else if (CoreProduct.PromotionStatus.NONE != CoreModule.f18264c.f20396j0.m31589H4()) {
                    o1j0.m165634h(R$string.f18722O5);
                } else if (!IntlCountryCodeController.m29114k()) {
                    act().progress(R$string.f18632L5);
                    duringCreated(CoreModule.f18264c.f20396j0.m31587G4()).subscribe(psd0.m173597H(new y20() { // from class: l.f830
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f97698a.m148855p1((FreeTrialEnvelope) obj);
                        }
                    }, new y20() { // from class: l.h830
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f108205a.m148856q1((Throwable) obj);
                        }
                    }));
                }
            } else if (!TEnum.equals(this.f124445h, "introPromotion")) {
                if (TEnum.equals(this.f124445h, "setting_chooselocation")) {
                    act().startActivity(VipLocationHistoryAct.m57459X1(act(), ""));
                } else if (TEnum.equals(this.f124445h, "vip")) {
                    act().startActivity(VipAct.m57420c2(act(), this.f124447j));
                } else if (TEnum.equals(this.f124445h, NavigationIntent.fakealert)) {
                    if (CoreModule.f18264c.f20381e0.m116537Z7()) {
                        gv20.m132478m(act());
                    }
                } else if (TEnum.equals(this.f124445h, NavigationIntent.welcomeBack)) {
                    rj50 rj50VarM172574f = pk50.m172568j().m172574f();
                    OmsDialog omsDialog = OmsDialog.p_welcomeback_popup;
                    OMSDialogInfo oMSDialogInfoM181655S = rj50VarM172574f.m181655S(omsDialog.getIdentifier());
                    if (NullChecker.m82486a(oMSDialogInfoM181655S) && pk50.m172568j().m172574f().m181649M(omsDialog.getIdentifier(), !oMSDialogInfoM181655S.constraint.userDimension)) {
                        pk50.m172568j().m172574f().m181683u0(act(), oMSDialogInfoM181655S, true, null);
                    }
                } else if (TEnum.equals(this.f124445h, NavigationIntent.voiceChat)) {
                    mo41360a1(TabName.VoiceChat, false);
                } else if (TEnum.equals(this.f124445h, "seePicks")) {
                    mo41360a1(TabName.Msg, false);
                    act().startActivity(new Intent(act(), (Class<?>) PicksAct.class));
                } else if (TEnum.equals(this.f124445h, "quickChat2Floor")) {
                    mo41360a1(TabName.Msg, false);
                    if (NullChecker.m82486a(this.f124446i)) {
                        str2 = this.f124446i.get(Active.TYPE);
                        str = this.f124446i.get("from");
                    } else {
                        str = null;
                    }
                    Act act6 = act();
                    Act act7 = act();
                    if (TextUtils.isEmpty(str)) {
                        str = "push_quickchat";
                    }
                    act6.startActivity(DropDownAct.m55630b2(act7, str2, str));
                } else if (TEnum.equals(this.f124445h, NavigationIntent.profile_purchase_svip)) {
                    mo41360a1(TabName.Me, false);
                    CoreModule.m30933P().m143405a().mo34575qm(act(), "NA,NA,push_click", null, null);
                } else if (TEnum.equals(this.f124445h, NavigationIntent.profile_purchase_see)) {
                    mo41360a1(TabName.Me, false);
                    CoreModule.m30933P().m143405a().mo34537l1(act(), "NA,NA,push_click");
                } else if (TEnum.equals(this.f124445h, NavigationIntent.profile_purchase_vip)) {
                    mo41360a1(TabName.Me, false);
                    C8927c.m54583I1(act(), "NA,NA,push_click");
                } else if (TEnum.equals(this.f124445h, NavigationIntent.intl_operating_pet)) {
                    if (C8016a.INSTANCE.m37996f()) {
                        mo41360a1(TabName.Card, false);
                        ix60.INSTANCE.m142470e0(act(), 3);
                    }
                } else if (TEnum.equals(this.f124445h, NavigationIntent.intl_similar_interests)) {
                    if (C8016a.INSTANCE.m37997g()) {
                        mo41360a1(TabName.Card, false);
                        xnf0.INSTANCE.m212196n(act(), 3);
                    }
                } else if (TEnum.equals(this.f124445h, NavigationIntent.intl_camping)) {
                    if (C8016a.INSTANCE.m37993c()) {
                        mo41360a1(TabName.Card, false);
                        C8545b.INSTANCE.m47470i(act(), 3);
                    }
                } else if (TEnum.equals(this.f124445h, "regular_main_popup")) {
                    if (!C8016a.INSTANCE.m37991a()) {
                        mo41360a1(TabName.Card, false);
                        udo.INSTANCE.m195513m(act(), 3);
                    }
                } else if (TEnum.equals(this.f124445h, NavigationIntent.intl_third_pay_quick_login)) {
                    C8984a.INSTANCE.m55807b(act());
                } else if (TEnum.equals(this.f124445h, "loveBuzz")) {
                    if (d79.m114675e0()) {
                        mo41360a1(TabName.Buzz, false);
                    }
                } else if (TEnum.equals(this.f124445h, "intlTribe")) {
                    mo41360a1(TabName.Meet, false);
                    CoreModule.f18264c.f20409n1.m35278z3().m137019l(Boolean.TRUE);
                } else if (TEnum.equals(this.f124445h, "heartbeatMatch")) {
                    i4g0.m138495D("e_heart_signal_enter", "", new pf60[0]);
                    if (m148844c1().getBooleanExtra("bundle_check_exp", false)) {
                        long longExtra2 = m148844c1().getLongExtra("bundle_push_exp_time", 0L);
                        if (longExtra2 <= 0 || pzi0.m174454o() <= longExtra2) {
                            CoreModule.f18264c.f20313H1.f97080h0 = pzi0.m174454o() + 20000;
                            mo41360a1(TabName.Msg, false);
                            String stringExtra = m148844c1().getStringExtra("traker");
                            final String stringExtra2 = m148844c1().getStringExtra(UserId.TYPE);
                            duringCreated(CoreModule.f18264c.f20313H1.m123916V3(stringExtra).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.j830
                                @Override // p153l.y20
                                public final void call(Object obj) {
                                    CoreModule.f18264c.f20384f0.m33905ap(stringExtra2);
                                }
                            }, new y20() { // from class: l.f930
                                @Override // p153l.y20
                                public final void call(Object obj) {
                                    r1j0.m179420g("网络异常！");
                                }
                            }));
                        } else {
                            l51.m152888H(act(), new Runnable() { // from class: l.i830
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f113319a.m148857r1();
                                }
                            }, 1000L);
                        }
                    }
                    m148844c1().removeExtra("bundle_check_exp");
                    m148844c1().removeExtra("bundle_push_exp_time");
                } else if (TEnum.equals(this.f124445h, NavigationIntent.verify_avatar)) {
                    mo41360a1(TabName.Card, false);
                    if (NullChecker.m82486a(this.f124446i) && this.f124446i.size() > 0) {
                        bep.INSTANCE.m103756u(act(), this.f124446i.get(NotificationCompat.CATEGORY_STATUS));
                    }
                } else if (TEnum.equals(this.f124445h, NavigationIntent.internal_voice_square)) {
                    CoreModule.m30934Q().mo68412M6().mo127347r(act(), m148844c1().getStringExtra("live_internal_voice_square_tab_id"));
                    m148844c1().removeExtra("live_internal_voice_square_tab_id");
                }
            }
        }
        this.f124445h = NavigationIntent.get("unknown_");
        if (!r8g0.m180203b(m148844c1().getStringExtra("superlike_user_id"))) {
            mo41360a1(TabName.Card, false);
            CoreModule.f18264c.f20405m0.m32085a9(m148844c1().getStringExtra("superlike_user_id")).subscribe(psd0.m173597H(new y20() { // from class: l.g930
                @Override // p153l.y20
                public final void call(Object obj) {
                    k930.m148812R0((CoreSuggested.UserInfo) obj);
                }
            }, new y20() { // from class: l.h930
                @Override // p153l.y20
                public final void call(Object obj) {
                    k930.m148835t0((Throwable) obj);
                }
            }));
            m148844c1().removeExtra("superlike_user_id");
            return;
        }
        if (!r8g0.m180203b(m148844c1().getStringExtra("album_user_id"))) {
            mo41360a1(TabName.Me, false);
            this.f124438a.startActivity(CoreModule.m30932N().argsToPhotoAlbumFeedAct(act(), m148844c1().getStringExtra("album_user_id"), "push", -1, null, 2));
            m148844c1().removeExtra("album_user_id");
            return;
        }
        if (m148844c1().hasExtra("extra_to_caption")) {
            if (m148844c1().getBooleanExtra("extra_to_caption", false)) {
                mo41360a1(TabName.Moment, false);
            }
            m148844c1().removeExtra("extra_to_caption");
            return;
        }
        if (!r8g0.m180203b(m148844c1().getStringExtra("card_push_link"))) {
            mo41360a1(TabName.Card, false);
            CoreModule.f18264c.f20405m0.m32077Y8(m148844c1().getStringExtra("card_push_link"));
            m148844c1().removeExtra("card_push_link");
            return;
        }
        if (m148844c1().hasExtra("oms_dialog_link")) {
            if (!TextUtils.isEmpty(m148844c1().getStringExtra("oms_id")) && !TextUtils.isEmpty(m148844c1().getStringExtra("oms_identifier"))) {
                OMSDialogInfo oMSDialogInfoM181655S2 = pk50.m172568j().m172574f().m181655S(m148844c1().getStringExtra("oms_identifier"));
                if (NullChecker.m82486a(oMSDialogInfoM181655S2)) {
                    pk50.m172568j().m172574f().m181680r0(true);
                    pk50.m172568j().m172574f().m181682t0(act(), oMSDialogInfoM181655S2, false, true, null);
                } else {
                    duringCreated(pk50.m172568j().m172574f().m181678p0(m148844c1().getStringExtra("oms_id"))).subscribe(psd0.m173597H(new y20() { // from class: l.i930
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f113407a.m148858s1((OMSDialogInfo) obj);
                        }
                    }, new y20() { // from class: l.j930
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            k930.m148810P0((Throwable) obj);
                        }
                    }));
                }
            }
            m148844c1().removeExtra("oms_dialog_link");
            return;
        }
        if (m148844c1().hasExtra("extra_to_conversation")) {
            if (m148844c1().getBooleanExtra("extra_to_conversation", false)) {
                mo41360a1(TabName.Msg, false);
            }
            m148844c1().removeExtra("extra_to_conversation");
            return;
        }
        if (!r8g0.m180203b(m148844c1().getStringExtra("letter_user_id")) && !r8g0.m180203b(m148844c1().getStringExtra("letter_content"))) {
            mo41360a1(TabName.Card, false);
            CoreModule.f18264c.f20405m0.m32073X8(m148844c1().getStringExtra("letter_user_id"), m148844c1().getStringExtra("letter_content")).subscribe(psd0.m173597H(new y20() { // from class: l.w730
                @Override // p153l.y20
                public final void call(Object obj) {
                    k930.m148836u0((CoreSuggested.UserInfo) obj);
                }
            }, new y20() { // from class: l.x730
                @Override // p153l.y20
                public final void call(Object obj) {
                    k930.m148805I0((Throwable) obj);
                }
            }));
            m148844c1().removeExtra("letter_user_id");
            m148844c1().removeExtra("letter_content");
            return;
        }
        if (m148844c1().hasExtra("extra_to_message") && m148844c1().getBooleanExtra("extra_to_message", false)) {
            m148844c1().removeExtra("extra_to_message");
            String stringExtra3 = m148844c1().getStringExtra("extra_message_user_id");
            if (TextUtils.isEmpty(stringExtra3)) {
                CrashHelper.m82479c(new Exception("NewMainAct error: can not go to MessagesAct, because userId = null"));
                return;
            } else {
                final Intent intentM50129n2 = MessagesAct.m50129n2(act(), stringExtra3, false, false, m148844c1().getIntExtra("from", 1), m148844c1().getBooleanExtra("media_keyboard", false));
                l51.m152888H(this.f124438a, new Runnable() { // from class: l.y730
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f197737a.m148859t1(intentM50129n2);
                    }
                }, 500L);
                return;
            }
        }
        if (!r8g0.m180203b(m148844c1().getStringExtra("album_comment_or_like_user_id"))) {
            m148844c1().removeExtra("album_comment_or_like_user_id");
            mo41360a1(TabName.Moment, false);
            this.f124438a.startActivity(CoreModule.m30932N().argsToPhotoAlbumActivitiesAct(act(), "activities", true, true, true));
            return;
        }
        if (!r8g0.m180203b(m148844c1().getStringExtra("extra_new_main_type")) && TextUtils.equals(m148844c1().getStringExtra("extra_new_main_type"), "extra_new_main_type_moment_live")) {
            mo41360a1(TabName.Moment, false);
            m148844c1().removeExtra("extra_new_main_type");
            return;
        }
        if (!r8g0.m180203b(m148844c1().getStringExtra("extra_new_main_type")) && TextUtils.equals(m148844c1().getStringExtra("extra_new_main_type"), "extra_new_main_type_live")) {
            mo41360a1(TabName.Live, false);
            m148844c1().removeExtra("extra_new_main_type");
            return;
        }
        if (!TextUtils.isEmpty(m148844c1().getStringExtra("extra_join_group_id"))) {
            mo41360a1(TabName.Card, false);
            m148841C1(m148844c1().getStringExtra("extra_join_group_id"));
            m148844c1().removeExtra("extra_join_group_id");
            return;
        }
        if (m148844c1().hasExtra("navigation_to_picks")) {
            mo41360a1(TabName.Msg, false);
            this.f124438a.startActivity(new Intent(this.f124438a, (Class<?>) PicksAct.class));
            m148844c1().removeExtra("navigation_to_picks");
            return;
        }
        if (!m148844c1().hasExtra("navigation_to_moment_post")) {
            if (gra.m131600M2() && m148844c1().hasExtra("extra_show_surprise_box_dialog") && m148844c1().getBooleanExtra("extra_show_surprise_box_dialog", false)) {
                gch0 gch0Var = new gch0(act());
                if (C4522a.m22099p().m22107I()) {
                    C4522a.m22099p().m22102C(CorePopLevel.SURPRISE_BOX, act(), gch0Var, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                } else {
                    cl80.m110426e().m110439q(al80.m98641a(gch0Var));
                }
                m148844c1().removeExtra("extra_show_surprise_box_dialog");
                return;
            }
            return;
        }
        mo41360a1(TabName.Moment, false);
        String stringExtra4 = m148844c1().getStringExtra("extra_topic_id");
        String stringExtra5 = m148844c1().getStringExtra("extra_topic_name");
        String stringExtra6 = m148844c1().getStringExtra("extra_from_key");
        keh feedMediaHandler = CoreModule.m30932N().getFeedMediaHandler(this.f124438a);
        Act act8 = this.f124438a;
        ArrayList<Media> arrayListM147507f0 = jyb.m147507f0(new Media[0]);
        if (TextUtils.isEmpty(stringExtra6)) {
            stringExtra6 = "other";
        }
        feedMediaHandler.mo149320b(act8, arrayListM147507f0, true, stringExtra6, stringExtra4, stringExtra5, dmk0.m116962a(400, new y20() { // from class: l.z730
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203216a.m148860u1((Intent) obj);
            }
        }), null);
        m148844c1().removeExtra("navigation_to_moment_post");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        yhi0.m215967a("NewMainBasePresenter initSubscription");
        duringCreated(uqb0.f180420v0).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.m830
            @Override // p153l.y20
            public final void call(Object obj) {
                k930.m148826l0((uxj0) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20396j0.m31594J5()).subscribe(psd0.m173597H(new y20() { // from class: l.o830
            @Override // p153l.y20
            public final void call(Object obj) {
                k930.m148804H0((uxj0) obj);
            }
        }, new y20() { // from class: l.p830
            @Override // p153l.y20
            public final void call(Object obj) {
                tu2.m192703a("[core][merchandise]", "refresh merchandise error :" + ((Throwable) obj).toString());
            }
        }));
        duringCreated(this.f124440c.switchMap(new qcj() { // from class: l.q830
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return k930.m148827m0((uxj0) obj);
            }
        }).observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.s830
            @Override // p153l.y20
            public final void call(Object obj) {
                k930.m148838y0((List) obj);
            }
        }, new y20() { // from class: l.t830
            @Override // p153l.y20
            public final void call(Object obj) {
                k930.m148802F0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.m32486n3()).subscribe(psd0.m173596G(new y20() { // from class: l.u830
            @Override // p153l.y20
            public final void call(Object obj) {
                k930.m148806J0((Counter) obj);
            }
        }));
        creates(new y20() { // from class: l.v830
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f182848a.m148852l1((Bundle) obj);
            }
        });
        duringCreated(ConnectivityReceiver.m82473m()).skip(1).filter(new qcj() { // from class: l.w830
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).subscribe(new y20() { // from class: l.x830
            @Override // p153l.y20
            public final void call(Object obj) {
                k930.m148839z0((NetworkInfo) obj);
            }
        });
        C4906u.m35769a3();
        yy6.m217930M();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.n830
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f140646a.m148828m1((C4470c) obj);
            }
        }));
        yhi0.m215968b();
    }

    /* JADX INFO: renamed from: a1 */
    public abstract void mo41360a1(TabName tabName, boolean z);

    /* JADX INFO: renamed from: b1 */
    public TabName m148843b1() {
        return this.f124439b;
    }

    /* JADX INFO: renamed from: c1 */
    public Intent m148844c1() {
        return this.f124438a.getIntent();
    }

    /* JADX INFO: renamed from: d1 */
    public C8247a.v m148845d1() {
        return this.f124449l;
    }

    /* JADX INFO: renamed from: e1 */
    public String m148846e1() {
        NavigationIntent navigationIntent = this.f124445h;
        if (navigationIntent == null) {
            return null;
        }
        return navigationIntent.toString();
    }

    /* JADX INFO: renamed from: f1 */
    public void m148847f1(Intent intent) {
        try {
            this.f124445h = (NavigationIntent) m148844c1().getSerializableExtra("extra_navigation_to_tenum");
        } catch (Throwable th) {
            CrashHelper.m82479c(th);
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    Iterator<String> it = extras.keySet().iterator();
                    while (it.hasNext()) {
                        intent.removeExtra(it.next());
                    }
                    this.f124438a.setIntent(intent);
                }
            } catch (Throwable th2) {
                CrashHelper.m82479c(th2);
            }
        }
        if (this.f124445h == null) {
            this.f124445h = NavigationIntent.get("unknown_");
        }
        f124436p = m148844c1().getBooleanExtra("EXTRA_SHOW_TUTORIAL", false);
        this.f124443f = m148844c1().getBooleanExtra("from_sign_up", false);
        this.f124444g = m148844c1().getBooleanExtra("extra_show_secret_crush_introduction", false);
        Intent intent2 = (Intent) m148844c1().getParcelableExtra("extra_from_push_transfer");
        NavigationCardIntent navigationCardIntent = (NavigationCardIntent) m148844c1().getSerializableExtra("extra_navigation_card_to");
        this.f124448k = navigationCardIntent;
        if (navigationCardIntent == null) {
            this.f124448k = NavigationCardIntent.get("unknown_");
        }
        this.f124450m = m148844c1().getBooleanExtra("extra_scroll_to_setting_bottom", false);
        this.f124447j = m148844c1().getIntExtra("navigation_to_vip_page_index", 0);
        this.f124446i = (HashMap) m148844c1().getSerializableExtra("extra_param_2");
        String stringExtra = m148844c1().getStringExtra("tarot_dialog");
        String stringExtra2 = m148844c1().getStringExtra("horoscope_dialog");
        if (!TextUtils.isEmpty(stringExtra)) {
            oli0.m168122a(act());
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            ly5.m156256a(act());
        }
        String stringExtra3 = m148844c1().getStringExtra("bundle_notify_type");
        if (TextUtils.equals(stringExtra3, "common.link") || TextUtils.equals(stringExtra3, "heartbeat.match.link")) {
            try {
                if (m148844c1().getBooleanExtra("bundle_check_exp", false)) {
                    long longExtra = m148844c1().getLongExtra("bundle_push_exp_time", 0L);
                    if (!CoreModule.f18264c.f20313H1.m123904J3() && longExtra > 0 && pzi0.m174454o() > longExtra) {
                        l51.m152888H(act(), new Runnable() { // from class: l.g830
                            @Override // java.lang.Runnable
                            public final void run() {
                                k930.m148798A0();
                            }
                        }, 1000L);
                        CoreModule.f18264c.f20313H1.m123924d4();
                    }
                    CoreModule.f18264c.f20313H1.m123904J3();
                }
                m148844c1().removeExtra("bundle_check_exp");
                m148844c1().removeExtra("bundle_push_exp_time");
            } catch (Exception unused) {
            }
        } else if (spl0.m187365Q() && TextUtils.equals(stringExtra3, "quickchat.party")) {
            i5c0.m138650i().m138652h(act());
        }
        m148844c1().removeExtra("extra_param_2");
        m148844c1().removeExtra("extra_navigation_to_tenum");
        m148844c1().removeExtra("extra_navigation_card_to");
        if (TEnum.equals(this.f124445h, NavigationIntent.menu) && toh0.m192049i(m148844c1())) {
            asj0.m99936e0();
        }
        if (this.f124443f) {
            CoreModule.f18264c.f20381e0.f89118S.put(Boolean.TRUE);
            lq40.m155316a().f133143a = true;
        }
        C4880a0.m32390j().m32393g();
        if (wtd.f190739b.get().booleanValue()) {
            l51.m152888H(act(), new Runnable() { // from class: l.r830
                @Override // java.lang.Runnable
                public final void run() {
                    this.f161661a.m148850j1();
                }
            }, 300L);
            if (!TextUtils.isEmpty(wtd.f190738a.get())) {
                l51.m152888H(act(), new Runnable() { // from class: l.c930
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f80284a.m148851k1();
                    }
                }, 400L);
            }
        }
        if (this.f124443f) {
            m148849i1();
        }
        if (intent2 != null) {
            act().startActivity(intent2);
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m148848g1() {
        if (CoreModule.f18276o.m132212b().mo34652wf() && !CoreModule.m30930K().me_().isFemale()) {
            if (!joa.m146386f4()) {
                qap.Companion companion = qap.INSTANCE;
                if (!TextUtils.isEmpty(companion.m175970h())) {
                    User userById = CoreModule.m30930K().getUserById(companion.m175970h());
                    if (NullChecker.m82486a(userById)) {
                        CoreModule.f18264c.f20405m0.m32060U7(true, false, null, userById, null, LikeFrom.get(LikeFrom.fakeMatch));
                        return;
                    }
                    return;
                }
            }
            CoreModule.f18264c.f20434v2.m175898w3();
            return;
        }
        if (!joa.m146386f4()) {
            qap.Companion companion2 = qap.INSTANCE;
            if (!TextUtils.isEmpty(companion2.m175970h())) {
                User userById2 = CoreModule.m30930K().getUserById(companion2.m175970h());
                if (NullChecker.m82486a(userById2)) {
                    CoreModule.f18264c.f20405m0.m32060U7(true, false, null, userById2, null, LikeFrom.get(LikeFrom.fakeMatch));
                    return;
                }
                return;
            }
        }
        String strMo31681Ch = CoreModule.m30930K().mo31681Ch();
        if (!TextUtils.isEmpty(strMo31681Ch)) {
            CoreModule.f18264c.f20434v2.m175897u3(strMo31681Ch);
            CoreModule.m30930K().mo31727Rp("");
        }
        CoreModule.f18264c.f20434v2.m175896q3();
    }

    /* JADX INFO: renamed from: h1 */
    public abstract void mo41391h1();

    /* JADX INFO: renamed from: i1 */
    public final void m148849i1() {
        if (gra.m131676e2()) {
            act().startActivityForResult(MarryStatusSetAct.m48735a2(act(), this.f124443f), 23);
            act().overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m148850j1() {
        mo41360a1(TabName.Live, false);
        i4g0.m138495D("e_intl_skip_to_live_room", "p_suggest_users_home_view", jyb.m147494Y("live_id_enter", wtd.f190738a.get()), jyb.m147494Y("skip_from", "fb"));
        if (TEnum.equals(uqb0.f180402h0, "unknown_") || TEnum.equals(uqb0.f180402h0, LiveRegionTag.oversea)) {
            UserLiveSettings userLiveSettings = new UserLiveSettings();
            userLiveSettings.intlAdUser = Boolean.TRUE;
            userLiveSettings.regionTag = LiveRegionTag.oversea_chinese;
            duringCreated(CoreModule.f18264c.f20381e0.m116640z9(userLiveSettings)).subscribe(psd0.m173596G(new y20() { // from class: l.d930
                @Override // p153l.y20
                public final void call(Object obj) {
                    k930.m148825k0((SettingGroups) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m148851k1() {
        CoreModule.m30934Q().startAudienceLive(act(), wtd.f190738a.get(), "chat", null);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m148852l1(Bundle bundle) {
        this.f124438a.getWindow().setBackgroundDrawable(null);
        toh0.m192049i(m148844c1());
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: l.y830
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return k930.m148809O0();
            }
        });
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m148853n1(C4470c c4470c) {
        AppWidgetManager.getInstance(this.f124438a).getAppWidgetIds(new ComponentName(this.f124438a, (Class<?>) MiniWidgetProvider.class));
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m148854o1(String str, ChatGroup chatGroup) {
        act().startActivity(GroupProfileAct.m50290a2(act(), str, chatGroup, true));
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m148855p1(FreeTrialEnvelope freeTrialEnvelope) {
        act().progressDismiss();
        if (!CoreModule.f18264c.f20396j0.m31607Q4()) {
            o1j0.m165634h(R$string.f18722O5);
            return;
        }
        Intent intentM81348b2 = WebViewAct.m81348b2(act(), CoreModule.f18264c.f20396j0.m31579C4().titleText, CoreModule.f18264c.f20396j0.m31579C4().promotionUrl, true);
        intentM81348b2.putExtra("hideNavigationBar", true);
        act().startActivity(intentM81348b2);
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m148856q1(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m148857r1() {
        o1j0.m165651y(act().getString(R$string.f18509H6));
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m148858s1(OMSDialogInfo oMSDialogInfo) {
        if (NullChecker.m82486a(oMSDialogInfo)) {
            pk50.m172568j().m172574f().m181680r0(true);
            pk50.m172568j().m172574f().m181682t0(act(), oMSDialogInfo, false, true, null);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m148859t1(Intent intent) {
        this.f124438a.startActivity(intent);
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m148860u1(Intent intent) {
        this.f124438a.startActivityForResult(intent, PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m148861v1(MomentFeedPushArgs momentFeedPushArgs) {
        CoreModule.f18264c.f20381e0.f88991A0.m137019l(null);
        if ("comment".equals(momentFeedPushArgs.path)) {
            act().startActivity(CoreModule.m30932N().argsToMomentActivitiesAct(act(), null));
        }
        if ("user".equals(momentFeedPushArgs.path)) {
            act().startActivity(CoreModule.m30932N().argsToMomentsFeedAct(act()));
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(momentFeedPushArgs.uid);
            if (NullChecker.m82486a(userM116503Pa) && NullChecker.m82486a(userM116503Pa.localRelationship) && TEnum.equals(userM116503Pa.localRelationship.state, "matched")) {
                act().startActivity(CoreModule.m30932N().argsToMomentsInProfileAct(act(), momentFeedPushArgs.uid, BLiveOperationClickAction.scheme));
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m148862x1(Greeting greeting) {
        act().startActivity(d79.m114662U() ? IntlDynamicGreetListAct.m47344X1(act(), greeting) : DynamicGreetListAct.m37457X1(act(), greeting));
    }

    /* JADX INFO: renamed from: z1 */
    public void mo41464z1() {
        if (!f124437q && SplashProxyAct.f55573i >= TantanApp.f17904h && SplashProxyAct.f55573i - TantanApp.f17904h < 3000) {
            f124437q = true;
            SystemClock.elapsedRealtime();
            uqb0 uqb0Var = TantanApp.f17898b;
            i4g0.m138493B("e_app_launch_duration", "", pf60.m172085a("during_time", Long.valueOf(SystemClock.elapsedRealtime() - TantanApp.f17902f)), pf60.m172085a("from_sign", Boolean.valueOf(uqb0.f180408n0)), pf60.m172085a("first_record", Boolean.valueOf(TantanApp.f17903g)));
        }
        CoreModule.f18265d.m144648k();
        uqb0.f180370E.m80055x();
        CoreModule.f18264c.f20297C0.m146425v4();
        CoreModule.f18264c.f20369a0.m188265q3();
        if (h7d0.m133774m0()) {
            CoreModule.f18264c.f20309G0.m183913p3();
        }
        if (CoreModule.f18264c.f20429u0.f19997m0.get().longValue() <= 0) {
            CoreModule.f18264c.f20429u0.f19997m0.put(Long.valueOf(pzi0.m174454o()));
        }
        m148848g1();
        lifecycle().filter(new qcj() { // from class: l.k830
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16269k);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.l830
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f130411a.m148853n1((C4470c) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
