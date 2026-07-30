package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p048ui.poplevel.C4371a;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4729a0;
import com.p046p1.mobile.putong.core.api.C4732c;
import com.p046p1.mobile.putong.core.api.C4755u;
import com.p046p1.mobile.putong.core.api.C4756v;
import com.p046p1.mobile.putong.core.api.CoreProduct;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.FreeTrialEnvelope;
import com.p046p1.mobile.putong.core.data.Greeting;
import com.p046p1.mobile.putong.core.data.UserId;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p046p1.mobile.putong.core.newui.home.C7865a;
import com.p046p1.mobile.putong.core.newui.main.C8096a;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.message.IntlDynamicGreetListAct;
import com.p046p1.mobile.putong.core.p053ui.intloperation.campingactivity.C8382b;
import com.p046p1.mobile.putong.core.p053ui.marry.status.MarryStatusSetAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupProfileAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchMatchUser;
import com.p046p1.mobile.putong.core.p053ui.poplevel.CorePopLevel;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.quickaudio.DropDownAct;
import com.p046p1.mobile.putong.core.p053ui.quicklogin.C8821a;
import com.p046p1.mobile.putong.core.p053ui.settings.SettingsFragOld;
import com.p046p1.mobile.putong.core.p053ui.vip.VipAct;
import com.p046p1.mobile.putong.core.p053ui.vip.VipLocationHistoryAct;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.core.p053ui.vip.picks.act.PicksAct;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MomentFeedPushArgs;
import com.p046p1.mobile.putong.data.NavigationCardIntent;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.OMSDialogInfo;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveSettings;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import com.p046p1.mobile.putong.live.base.data.BLiveTraceServerLocation;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p046p1.mobile.putong.location.Location;
import com.p046p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.splash.SplashProxyAct;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.s7m;

/* JADX INFO: loaded from: classes11.dex */
public abstract class y030<V extends s7m> extends jq2<V> {

    /* JADX INFO: renamed from: p */
    public static boolean f195253p = false;

    /* JADX INFO: renamed from: q */
    public static boolean f195254q = false;

    /* JADX INFO: renamed from: a */
    public Act f195255a;

    /* JADX INFO: renamed from: b */
    public TabName f195256b;

    /* JADX INFO: renamed from: c */
    public C22392a<roj0> f195257c;

    /* JADX INFO: renamed from: d */
    public hpd0 f195258d;

    /* JADX INFO: renamed from: e */
    public long f195259e;

    /* JADX INFO: renamed from: f */
    public boolean f195260f;

    /* JADX INFO: renamed from: g */
    public boolean f195261g;

    /* JADX INFO: renamed from: h */
    public NavigationIntent f195262h;

    /* JADX INFO: renamed from: i */
    public HashMap<String, String> f195263i;

    /* JADX INFO: renamed from: j */
    public int f195264j;

    /* JADX INFO: renamed from: k */
    public NavigationCardIntent f195265k;

    /* JADX INFO: renamed from: l */
    public C8096a.v f195266l;

    /* JADX INFO: renamed from: m */
    public boolean f195267m;

    /* JADX INFO: renamed from: n */
    public boolean f195268n;

    /* JADX INFO: renamed from: o */
    public C22392a<roj0> f195269o;

    /* JADX INFO: renamed from: l.y030$a */
    public class RunnableC21271a implements Runnable {
        public RunnableC21271a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            lsi0.m151595y(CoreModule.f17544b.getResources().getString(R$string.f17723F6));
        }
    }

    /* JADX INFO: renamed from: l.y030$b */
    public static abstract class AbstractC21272b<V extends y030> {

        /* JADX INFO: renamed from: a */
        public V f195271a;

        public AbstractC21272b(V v2) {
            this.f195271a = v2;
        }
    }

    public y030(mcr mcrVar) {
        super(mcrVar);
        this.f195256b = CoreModule.m29936Q().mo67230M7() ? TabName.Live : TabName.Card;
        this.f195257c = C22392a.m221513c(roj0.f160388a);
        this.f195258d = new hpd0("settingLocationShown" + CoreModule.m29931H().userId(), Boolean.FALSE);
        this.f195259e = -92233720368547758L;
        this.f195260f = false;
        this.f195261g = false;
        this.f195267m = false;
        this.f195268n = false;
        this.f195269o = C22392a.m221512b();
        mo40381h1();
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m212038A0() {
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m212042F0(Throwable th) {
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m212044H0(roj0 roj0Var) {
        if (upa.m194679O2()) {
            och0.m163516d();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m212045I0(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m212046J0(Counter counter) {
        C4732c c4732c = CoreModule.f17545c;
        if (c4732c.f19578J2) {
            return;
        }
        c4732c.f19578J2 = true;
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ boolean m212049O0() {
        if (NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.opened) {
            ygh0.m214651J(true);
        } else {
            ygh0.m214651J(false);
        }
        if (PermissionHelper.m79881b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            ygh0.m214649H(true);
        } else {
            ygh0.m214649H(false);
        }
        if (PermissionHelper.m79881b("android.permission.READ_CONTACTS")) {
            ygh0.m214668a(true);
        } else {
            ygh0.m214668a(false);
        }
        if (PermissionHelper.m79881b("android.permission.READ_EXTERNAL_STORAGE")) {
            ygh0.m214670b(true);
        } else {
            ygh0.m214670b(false);
        }
        ygh0.m214656O();
        return false;
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m212050P0(Throwable th) {
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m212052R0(CoreSuggested.UserInfo userInfo) {
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m212055V0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m212065k0(SettingGroups settingGroups) {
        isd.f114750a.put("");
        isd.f114751b.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m212066l0(roj0 roj0Var) {
        CoreModule.f17545c.f19643f1.m118075m4();
        CoreModule.f17545c.f19642f0.m32650Fo();
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ C22306c m212067m0(roj0 roj0Var) {
        C22306c<Location> c22306cM78864p = qib0.f154687E.m78864p();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return c22306cM78864p.take(5L, timeUnit).buffer(6L, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m212068m1(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && Act.isFromBackground) {
            if (m212083b1() == TabName.Card || m212083b1() == TabName.Msg) {
                mx0.m156802o().m156811K(act());
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m212070o0(Throwable th) {
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m212075t0(Throwable th) {
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m212076u0(CoreSuggested.UserInfo userInfo) {
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m212078y0(List list) {
        if (list.size() == 0) {
            return;
        }
        vwb.m200337m(list, new w9j() { // from class: l.p030
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Location) obj).m78835z() > System.currentTimeMillis() - 43200000);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m212079z0(NetworkInfo networkInfo) {
        CoreModule.f17545c.f19663m0.m31066W8().first().subscribe();
        CoreModule.f17545c.f19642f0.m32868Ye().first().subscribe(mkd0.m154950B());
    }

    /* JADX INFO: renamed from: B1 */
    public void m212080B1(int i) {
        qib0.f154687E.m78868t();
        duringCreated(qib0.f154687E.m78864p().take(10L, TimeUnit.SECONDS)).observeOn(jo0.m142408a()).materialize().first().subscribe(mkd0.m154955G(new e30() { // from class: l.jz20
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19663m0.m31127m8();
            }
        }));
        if (i == 33) {
            this.f195257c.m132487l(roj0.f160388a);
        }
    }

    @Override // p149l.jq2, p149l.q0m
    /* JADX INFO: renamed from: C */
    public void mo51532C(V v2) {
        super.mo51532C(v2);
        this.f195255a = v2.getAct();
    }

    /* JADX INFO: renamed from: C1 */
    public final void m212081C1(final String str) {
        if (upa.m194706V1()) {
            duringCreated(CoreModule.f17545c.f19645g0.m31809H6(str).filter(new qh7()).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.n030
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f136462a.m212094o1(str, (ChatGroup) obj);
                }
            }, new e30() { // from class: l.o030
                @Override // p149l.e30
                public final void call(Object obj) {
                    y030.m212070o0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: D1 */
    public void m212082D1() {
        String str;
        long longExtra = m212084c1().getLongExtra("extra_heartbeat_expire_time", -1L);
        if (longExtra > 0 && mqi0.m155944o() > longExtra) {
            e51.m114743H(act(), new RunnableC21271a(), 1000L);
            m212084c1().removeExtra("extra_heartbeat_expire_time");
        }
        if (TEnum.equals(this.f195262h, NavigationIntent.menu)) {
            mo40352a1(TabName.Msg, false);
        } else if (TEnum.equals(this.f195262h, "moment")) {
            mo40352a1(TabName.Moment, false);
            duringCreated(CoreModule.f17545c.f19639e0.f149134A0.filter(new w9j() { // from class: l.s030
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m81303a((MomentFeedPushArgs) obj));
                }
            }).first().compose(mkd0.m154951C())).subscribe(mkd0.m154955G(new e30() { // from class: l.oz20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f146379a.m212101v1((MomentFeedPushArgs) obj);
                }
            }));
        } else if (TEnum.equals(this.f195262h, "setting")) {
            mo40352a1(TabName.Me, false);
            Intent intent = new Intent(act(), (Class<?>) NewUI1ContainerActivity.class);
            intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
            intent.putExtra("setting_scroll_to_bottom", this.f195267m);
            this.f195255a.startActivity(intent);
        } else if (TEnum.equals(this.f195262h, "profile")) {
            mo40352a1(TabName.Me, false);
        } else {
            String str2 = null;
            if (TEnum.equals(this.f195262h, "live")) {
                mo40352a1(TabName.Live, false);
                IntentParams intentParams = (IntentParams) m212084c1().getSerializableExtra("main_jump_live_tag");
                if (m212084c1().getBooleanExtra("main_jump_live_has_params", false)) {
                    if (intentParams == null) {
                        IntentParams.C13055b c13055b = new IntentParams.C13055b("samsung_intent_params_saved", null);
                        IntentParams intentParams2 = c13055b.get();
                        c13055b.put(new IntentParams());
                        intentParams = intentParams2;
                    }
                    if (NullChecker.m81303a(intentParams) && !k0g0.m144048b(intentParams.liveId)) {
                        act().startActivity(CoreModule.m29936Q().mo67247Xh(act(), intentParams));
                    }
                    m212084c1().removeExtra("main_jump_live_tag");
                    m212084c1().removeExtra("main_jump_live_has_params");
                }
            } else if (TEnum.equals(this.f195262h, NavigationIntent.profile_edit)) {
                mo40352a1(TabName.Me, false);
                act().startActivity(ProfileAct.m50738p2(act(), CoreModule.f17545c.f19639e0.m169527p9().f56011id, "profile_frag_menu", false, true));
            } else if (TEnum.equals(this.f195262h, NavigationIntent.profile_edit_continuous)) {
                mo40352a1(TabName.Me, false);
                act().startActivity(ProfileAct.m50738p2(act(), CoreModule.f17545c.f19639e0.m169527p9().f56011id, CoreStaticData.ProfileFromType.FROM_PROFILE_FRAG_EDIT, false, true));
            } else if (TEnum.equals(this.f195262h, "cards")) {
                mo40352a1(TabName.Card, false);
                if (NullChecker.m81303a(this.f195263i) && this.f195263i.size() > 0) {
                    TextUtils.equals(this.f195263i.get("cardType"), BLiveTraceServerLocation.main);
                }
            } else if (TEnum.equals(this.f195262h, "webview")) {
                Act act = this.f195255a;
                act.startActivity(lva.m151840A(act, m212084c1().getStringExtra("webview_title"), m212084c1().getStringExtra("webview_url"), m212084c1().getBooleanExtra("hideNavigationBar", false), m212084c1().getBooleanExtra("hardwareAccelerated", false), m212084c1().getBooleanExtra("useMkWebview", false)));
            } else if (TEnum.equals(this.f195262h, "seeLikes")) {
                mo40352a1(TabName.Msg, false);
                this.f195268n = true;
                this.f195269o.m132487l(roj0.f160388a);
            } else if (TEnum.equals(this.f195262h, NavigationIntent.seeSidePush)) {
                Act act2 = this.f195255a;
                act2.startActivity(LikersAct.m56544X1(act2, SchemeKey.push_call2buysee));
            } else if (TEnum.equals(this.f195262h, NavigationIntent.seeSideMsg)) {
                Act act3 = this.f195255a;
                act3.startActivity(LikersAct.m56544X1(act3, "msg_call2buysee"));
            } else if (TEnum.equals(this.f195262h, NavigationIntent.seeSideNewPush)) {
                Act act4 = this.f195255a;
                act4.startActivity(LikersAct.m56544X1(act4, SchemeKey.push_call2buysee_side_new));
            } else if (TEnum.equals(this.f195262h, NavigationIntent.seeSideNewMsg)) {
                Act act5 = this.f195255a;
                act5.startActivity(LikersAct.m56544X1(act5, "msg_call2buysee_side_new"));
            } else if (TEnum.equals(this.f195262h, "liveAnchor")) {
                CoreModule.m29936Q().mo67217F8(this.f195255a, true, true, "p_core_push");
            } else if (TEnum.equals(this.f195262h, "startVoiceLive")) {
                CoreModule.m29936Q().mo67229M6().mo102424i(this.f195255a, "");
            } else if (TEnum.equals(this.f195262h, "quickchat")) {
                mo40352a1(TabName.Msg, false);
                CoreModule.f17545c.f19642f0.m32972go();
                e51.m114741F(act(), new Runnable() { // from class: l.pz20
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.f17545c.f19639e0.f149514z0.m132487l(Boolean.TRUE);
                    }
                });
            } else if (TEnum.equals(this.f195262h, NavigationIntent.greetChat)) {
                if (!u59.m191811T()) {
                    return;
                }
                mo40352a1(TabName.Msg, false);
                duringCreated(CoreModule.f17545c.f19678r0.m34136o5(m212084c1().getStringExtra("greetingId"))).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.qz20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f156990a.m212102x1((Greeting) obj);
                    }
                }, new e30() { // from class: l.rz20
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        y030.m212055V0((Throwable) obj);
                    }
                }));
            } else if (TEnum.equals(this.f195262h, NavigationIntent.quickChatMatch)) {
                mo40352a1(TabName.Msg, false);
                final OnlineMatchMatchUser onlineMatchMatchUser = (OnlineMatchMatchUser) m212084c1().getSerializableExtra("otherUser");
                if (NullChecker.m81303a(onlineMatchMatchUser)) {
                    onlineMatchMatchUser.user = CoreModule.f17545c.f19639e0.m169430Pa(onlineMatchMatchUser.userId);
                    e51.m114743H(act(), new Runnable() { // from class: l.sz20
                        @Override // java.lang.Runnable
                        public final void run() {
                            C4756v.f20123a0.m132487l(vwb.m200311Y("match_success", onlineMatchMatchUser));
                        }
                    }, 800L);
                }
            } else if (TEnum.equals(this.f195262h, "freeTrialPromotion")) {
                if (CoreModule.f17545c.f19654j0.m30604Q4()) {
                    Intent intentM80165a2 = WebViewAct.m80165a2(act(), CoreModule.f17545c.f19654j0.m30576C4().titleText, CoreModule.f17545c.f19654j0.m30576C4().promotionUrl, true);
                    intentM80165a2.putExtra("hideNavigationBar", true);
                    act().startActivity(intentM80165a2);
                } else if (CoreProduct.PromotionStatus.NONE != CoreModule.f17545c.f19654j0.m30586H4()) {
                    lsi0.m151578h(R$string.f17932M5);
                } else if (!IntlCountryCodeController.m28115k()) {
                    act().progress(R$string.f17842J5);
                    duringCreated(CoreModule.f17545c.f19654j0.m30584G4()).subscribe(mkd0.m154956H(new e30() { // from class: l.tz20
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f172682a.m212095p1((FreeTrialEnvelope) obj);
                        }
                    }, new e30() { // from class: l.vz20
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f183580a.m212096q1((Throwable) obj);
                        }
                    }));
                }
            } else if (!TEnum.equals(this.f195262h, "introPromotion")) {
                if (TEnum.equals(this.f195262h, "setting_chooselocation")) {
                    act().startActivity(VipLocationHistoryAct.m56276V1(act(), ""));
                } else if (TEnum.equals(this.f195262h, "vip")) {
                    act().startActivity(VipAct.m56237b2(act(), this.f195264j));
                } else if (TEnum.equals(this.f195262h, NavigationIntent.fakealert)) {
                    if (CoreModule.f17545c.f19639e0.m169464Z7()) {
                        wm20.m203973m(act());
                    }
                } else if (TEnum.equals(this.f195262h, NavigationIntent.welcomeBack)) {
                    kb50 kb50VarM135333f = ic50.m135327j().m135333f();
                    OmsDialog omsDialog = OmsDialog.p_welcomeback_popup;
                    OMSDialogInfo oMSDialogInfoM145232S = kb50VarM135333f.m145232S(omsDialog.getIdentifier());
                    if (NullChecker.m81303a(oMSDialogInfoM145232S) && ic50.m135327j().m135333f().m145226M(omsDialog.getIdentifier(), !oMSDialogInfoM145232S.constraint.userDimension)) {
                        ic50.m135327j().m135333f().m145260u0(act(), oMSDialogInfoM145232S, true, null);
                    }
                } else if (TEnum.equals(this.f195262h, NavigationIntent.voiceChat)) {
                    mo40352a1(TabName.VoiceChat, false);
                } else if (TEnum.equals(this.f195262h, "seePicks")) {
                    mo40352a1(TabName.Msg, false);
                    act().startActivity(new Intent(act(), (Class<?>) PicksAct.class));
                } else if (TEnum.equals(this.f195262h, "quickChat2Floor")) {
                    mo40352a1(TabName.Msg, false);
                    if (NullChecker.m81303a(this.f195263i)) {
                        str2 = this.f195263i.get(Active.TYPE);
                        str = this.f195263i.get("from");
                    } else {
                        str = null;
                    }
                    Act act6 = act();
                    Act act7 = act();
                    if (TextUtils.isEmpty(str)) {
                        str = "push_quickchat";
                    }
                    act6.startActivity(DropDownAct.m54447a2(act7, str2, str));
                } else if (TEnum.equals(this.f195262h, NavigationIntent.profile_purchase_svip)) {
                    mo40352a1(TabName.Me, false);
                    CoreModule.m29935P().m94651a().mo33572qm(act(), "NA,NA,push_click", null, null);
                } else if (TEnum.equals(this.f195262h, NavigationIntent.profile_purchase_see)) {
                    mo40352a1(TabName.Me, false);
                    CoreModule.m29935P().m94651a().mo33534l1(act(), "NA,NA,push_click");
                } else if (TEnum.equals(this.f195262h, NavigationIntent.profile_purchase_vip)) {
                    mo40352a1(TabName.Me, false);
                    C8764c.m53400I1(act(), "NA,NA,push_click");
                } else if (TEnum.equals(this.f195262h, NavigationIntent.intl_operating_pet)) {
                    if (C7865a.INSTANCE.m36993f()) {
                        mo40352a1(TabName.Card, false);
                        cp60.INSTANCE.m108087e0(act(), 3);
                    }
                } else if (TEnum.equals(this.f195262h, NavigationIntent.intl_similar_interests)) {
                    if (C7865a.INSTANCE.m36994g()) {
                        mo40352a1(TabName.Card, false);
                        qff0.INSTANCE.m174302n(act(), 3);
                    }
                } else if (TEnum.equals(this.f195262h, NavigationIntent.intl_camping)) {
                    if (C7865a.INSTANCE.m36990c()) {
                        mo40352a1(TabName.Card, false);
                        C8382b.INSTANCE.m46287i(act(), 3);
                    }
                } else if (TEnum.equals(this.f195262h, "regular_main_popup")) {
                    if (!C7865a.INSTANCE.m36988a()) {
                        mo40352a1(TabName.Card, false);
                        ubo.INSTANCE.m192892m(act(), 3);
                    }
                } else if (TEnum.equals(this.f195262h, NavigationIntent.intl_third_pay_quick_login)) {
                    C8821a.INSTANCE.m54624b(act());
                } else if (TEnum.equals(this.f195262h, "loveBuzz")) {
                    if (u59.m191823d0()) {
                        mo40352a1(TabName.Buzz, false);
                    }
                } else if (TEnum.equals(this.f195262h, "intlTribe")) {
                    mo40352a1(TabName.Meet, false);
                    CoreModule.f17545c.f19667n1.m34275z3().m132487l(Boolean.TRUE);
                } else if (TEnum.equals(this.f195262h, "heartbeatMatch")) {
                    zvf0.m220371D("e_heart_signal_enter", "", new j760[0]);
                    if (m212084c1().getBooleanExtra("bundle_check_exp", false)) {
                        long longExtra2 = m212084c1().getLongExtra("bundle_push_exp_time", 0L);
                        if (longExtra2 <= 0 || mqi0.m155944o() <= longExtra2) {
                            CoreModule.f17545c.f19571H1.f184114h0 = mqi0.m155944o() + 20000;
                            mo40352a1(TabName.Msg, false);
                            String stringExtra = m212084c1().getStringExtra("traker");
                            final String stringExtra2 = m212084c1().getStringExtra(UserId.TYPE);
                            duringCreated(CoreModule.f17545c.f19571H1.m201063V3(stringExtra).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.xz20
                                @Override // p149l.e30
                                public final void call(Object obj) {
                                    CoreModule.f17545c.f19642f0.m32902ap(stringExtra2);
                                }
                            }, new e30() { // from class: l.t030
                                @Override // p149l.e30
                                public final void call(Object obj) {
                                    osi0.m165783g("网络异常！");
                                }
                            }));
                        } else {
                            e51.m114743H(act(), new Runnable() { // from class: l.wz20
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f188701a.m212097r1();
                                }
                            }, 1000L);
                        }
                    }
                    m212084c1().removeExtra("bundle_check_exp");
                    m212084c1().removeExtra("bundle_push_exp_time");
                } else if (TEnum.equals(this.f195262h, NavigationIntent.verify_avatar)) {
                    mo40352a1(TabName.Card, false);
                    if (NullChecker.m81303a(this.f195263i) && this.f195263i.size() > 0) {
                        bcp.INSTANCE.m101117u(act(), this.f195263i.get(NotificationCompat.CATEGORY_STATUS));
                    }
                } else if (TEnum.equals(this.f195262h, NavigationIntent.internal_voice_square)) {
                    CoreModule.m29936Q().mo67229M6().mo102433r(act(), m212084c1().getStringExtra("live_internal_voice_square_tab_id"));
                    m212084c1().removeExtra("live_internal_voice_square_tab_id");
                }
            }
        }
        this.f195262h = NavigationIntent.get("unknown_");
        if (!k0g0.m144048b(m212084c1().getStringExtra("superlike_user_id"))) {
            mo40352a1(TabName.Card, false);
            CoreModule.f17545c.f19663m0.m31082a9(m212084c1().getStringExtra("superlike_user_id")).subscribe(mkd0.m154956H(new e30() { // from class: l.u030
                @Override // p149l.e30
                public final void call(Object obj) {
                    y030.m212052R0((CoreSuggested.UserInfo) obj);
                }
            }, new e30() { // from class: l.v030
                @Override // p149l.e30
                public final void call(Object obj) {
                    y030.m212075t0((Throwable) obj);
                }
            }));
            m212084c1().removeExtra("superlike_user_id");
            return;
        }
        if (!k0g0.m144048b(m212084c1().getStringExtra("album_user_id"))) {
            mo40352a1(TabName.Me, false);
            this.f195255a.startActivity(CoreModule.m29934N().argsToPhotoAlbumFeedAct(act(), m212084c1().getStringExtra("album_user_id"), "push", -1, null, 2));
            m212084c1().removeExtra("album_user_id");
            return;
        }
        if (m212084c1().hasExtra("extra_to_caption")) {
            if (m212084c1().getBooleanExtra("extra_to_caption", false)) {
                mo40352a1(TabName.Moment, false);
            }
            m212084c1().removeExtra("extra_to_caption");
            return;
        }
        if (!k0g0.m144048b(m212084c1().getStringExtra("card_push_link"))) {
            mo40352a1(TabName.Card, false);
            CoreModule.f17545c.f19663m0.m31074Y8(m212084c1().getStringExtra("card_push_link"));
            m212084c1().removeExtra("card_push_link");
            return;
        }
        if (m212084c1().hasExtra("oms_dialog_link")) {
            if (!TextUtils.isEmpty(m212084c1().getStringExtra("oms_id")) && !TextUtils.isEmpty(m212084c1().getStringExtra("oms_identifier"))) {
                OMSDialogInfo oMSDialogInfoM145232S2 = ic50.m135327j().m135333f().m145232S(m212084c1().getStringExtra("oms_identifier"));
                if (NullChecker.m81303a(oMSDialogInfoM145232S2)) {
                    ic50.m135327j().m135333f().m145257r0(true);
                    ic50.m135327j().m135333f().m145259t0(act(), oMSDialogInfoM145232S2, false, true, null);
                } else {
                    duringCreated(ic50.m135327j().m135333f().m145255p0(m212084c1().getStringExtra("oms_id"))).subscribe(mkd0.m154956H(new e30() { // from class: l.w030
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f183708a.m212098s1((OMSDialogInfo) obj);
                        }
                    }, new e30() { // from class: l.x030
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            y030.m212050P0((Throwable) obj);
                        }
                    }));
                }
            }
            m212084c1().removeExtra("oms_dialog_link");
            return;
        }
        if (m212084c1().hasExtra("extra_to_conversation")) {
            if (m212084c1().getBooleanExtra("extra_to_conversation", false)) {
                mo40352a1(TabName.Msg, false);
            }
            m212084c1().removeExtra("extra_to_conversation");
            return;
        }
        if (!k0g0.m144048b(m212084c1().getStringExtra("letter_user_id")) && !k0g0.m144048b(m212084c1().getStringExtra("letter_content"))) {
            mo40352a1(TabName.Card, false);
            CoreModule.f17545c.f19663m0.m31070X8(m212084c1().getStringExtra("letter_user_id"), m212084c1().getStringExtra("letter_content")).subscribe(mkd0.m154956H(new e30() { // from class: l.kz20
                @Override // p149l.e30
                public final void call(Object obj) {
                    y030.m212076u0((CoreSuggested.UserInfo) obj);
                }
            }, new e30() { // from class: l.lz20
                @Override // p149l.e30
                public final void call(Object obj) {
                    y030.m212045I0((Throwable) obj);
                }
            }));
            m212084c1().removeExtra("letter_user_id");
            m212084c1().removeExtra("letter_content");
            return;
        }
        if (m212084c1().hasExtra("extra_to_message") && m212084c1().getBooleanExtra("extra_to_message", false)) {
            m212084c1().removeExtra("extra_to_message");
            String stringExtra3 = m212084c1().getStringExtra("extra_message_user_id");
            if (TextUtils.isEmpty(stringExtra3)) {
                CrashHelper.m81296c(new Exception("NewMainAct error: can not go to MessagesAct, because userId = null"));
                return;
            } else {
                final Intent intentM48946m2 = MessagesAct.m48946m2(act(), stringExtra3, false, false, m212084c1().getIntExtra("from", 1), m212084c1().getBooleanExtra("media_keyboard", false));
                e51.m114743H(this.f195255a, new Runnable() { // from class: l.mz20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f136345a.m212099t1(intentM48946m2);
                    }
                }, 500L);
                return;
            }
        }
        if (!k0g0.m144048b(m212084c1().getStringExtra("album_comment_or_like_user_id"))) {
            m212084c1().removeExtra("album_comment_or_like_user_id");
            mo40352a1(TabName.Moment, false);
            this.f195255a.startActivity(CoreModule.m29934N().argsToPhotoAlbumActivitiesAct(act(), "activities", true, true, true));
            return;
        }
        if (!k0g0.m144048b(m212084c1().getStringExtra("extra_new_main_type")) && TextUtils.equals(m212084c1().getStringExtra("extra_new_main_type"), "extra_new_main_type_moment_live")) {
            mo40352a1(TabName.Moment, false);
            m212084c1().removeExtra("extra_new_main_type");
            return;
        }
        if (!k0g0.m144048b(m212084c1().getStringExtra("extra_new_main_type")) && TextUtils.equals(m212084c1().getStringExtra("extra_new_main_type"), "extra_new_main_type_live")) {
            mo40352a1(TabName.Live, false);
            m212084c1().removeExtra("extra_new_main_type");
            return;
        }
        if (!TextUtils.isEmpty(m212084c1().getStringExtra("extra_join_group_id"))) {
            mo40352a1(TabName.Card, false);
            m212081C1(m212084c1().getStringExtra("extra_join_group_id"));
            m212084c1().removeExtra("extra_join_group_id");
            return;
        }
        if (m212084c1().hasExtra("navigation_to_picks")) {
            mo40352a1(TabName.Msg, false);
            this.f195255a.startActivity(new Intent(this.f195255a, (Class<?>) PicksAct.class));
            m212084c1().removeExtra("navigation_to_picks");
            return;
        }
        if (!m212084c1().hasExtra("navigation_to_moment_post")) {
            if (upa.m194669M2() && m212084c1().hasExtra("extra_show_surprise_box_dialog") && m212084c1().getBooleanExtra("extra_show_surprise_box_dialog", false)) {
                y3h0 y3h0Var = new y3h0(act());
                if (C4371a.m21100p().m21108I()) {
                    C4371a.m21100p().m21103C(CorePopLevel.SURPRISE_BOX, act(), y3h0Var, ijkStreamerUtil.FFS_PROP_INT64_CREAT_TIME);
                } else {
                    wc80.m202636e().m202649q(uc80.m192995a(y3h0Var));
                }
                m212084c1().removeExtra("extra_show_surprise_box_dialog");
                return;
            }
            return;
        }
        mo40352a1(TabName.Moment, false);
        String stringExtra4 = m212084c1().getStringExtra("extra_topic_id");
        String stringExtra5 = m212084c1().getStringExtra("extra_topic_name");
        String stringExtra6 = m212084c1().getStringExtra("extra_from_key");
        vch feedMediaHandler = CoreModule.m29934N().getFeedMediaHandler(this.f195255a);
        Act act8 = this.f195255a;
        ArrayList<Media> arrayListM200324f0 = vwb.m200324f0(new Media[0]);
        if (TextUtils.isEmpty(stringExtra6)) {
            stringExtra6 = "other";
        }
        feedMediaHandler.mo197763b(act8, arrayListM200324f0, true, stringExtra6, stringExtra4, stringExtra5, xck0.m208120a(400, new e30() { // from class: l.nz20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141183a.m212100u1((Intent) obj);
            }
        }), null);
        m212084c1().removeExtra("navigation_to_moment_post");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        y8i0.m213379a("NewMainBasePresenter initSubscription");
        duringCreated(qib0.f154737v0).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.a030
            @Override // p149l.e30
            public final void call(Object obj) {
                y030.m212066l0((roj0) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19654j0.m30591J5()).subscribe(mkd0.m154956H(new e30() { // from class: l.c030
            @Override // p149l.e30
            public final void call(Object obj) {
                y030.m212044H0((roj0) obj);
            }
        }, new e30() { // from class: l.d030
            @Override // p149l.e30
            public final void call(Object obj) {
                du2.m113670a("[core][merchandise]", "refresh merchandise error :" + ((Throwable) obj).toString());
            }
        }));
        duringCreated(this.f195257c.switchMap(new w9j() { // from class: l.e030
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return y030.m212067m0((roj0) obj);
            }
        }).observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.g030
            @Override // p149l.e30
            public final void call(Object obj) {
                y030.m212078y0((List) obj);
            }
        }, new e30() { // from class: l.h030
            @Override // p149l.e30
            public final void call(Object obj) {
                y030.m212042F0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.m31483n3()).subscribe(mkd0.m154955G(new e30() { // from class: l.i030
            @Override // p149l.e30
            public final void call(Object obj) {
                y030.m212046J0((Counter) obj);
            }
        }));
        creates(new e30() { // from class: l.j030
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115633a.m212092l1((Bundle) obj);
            }
        });
        duringCreated(ConnectivityReceiver.m81290m()).skip(1).filter(new w9j() { // from class: l.k030
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).subscribe(new e30() { // from class: l.l030
            @Override // p149l.e30
            public final void call(Object obj) {
                y030.m212079z0((NetworkInfo) obj);
            }
        });
        C4755u.m34766a3();
        vx6.m200484M();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.b030
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f72405a.m212068m1((C4319c) obj);
            }
        }));
        y8i0.m213380b();
    }

    /* JADX INFO: renamed from: a1 */
    public abstract void mo40352a1(TabName tabName, boolean z);

    /* JADX INFO: renamed from: b1 */
    public TabName m212083b1() {
        return this.f195256b;
    }

    /* JADX INFO: renamed from: c1 */
    public Intent m212084c1() {
        return this.f195255a.getIntent();
    }

    /* JADX INFO: renamed from: d1 */
    public C8096a.v m212085d1() {
        return this.f195266l;
    }

    /* JADX INFO: renamed from: e1 */
    public String m212086e1() {
        NavigationIntent navigationIntent = this.f195262h;
        if (navigationIntent == null) {
            return null;
        }
        return navigationIntent.toString();
    }

    /* JADX INFO: renamed from: f1 */
    public void m212087f1(Intent intent) {
        try {
            this.f195262h = (NavigationIntent) m212084c1().getSerializableExtra("extra_navigation_to_tenum");
        } catch (Throwable th) {
            CrashHelper.m81296c(th);
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    Iterator<String> it = extras.keySet().iterator();
                    while (it.hasNext()) {
                        intent.removeExtra(it.next());
                    }
                    this.f195255a.setIntent(intent);
                }
            } catch (Throwable th2) {
                CrashHelper.m81296c(th2);
            }
        }
        if (this.f195262h == null) {
            this.f195262h = NavigationIntent.get("unknown_");
        }
        f195253p = m212084c1().getBooleanExtra("EXTRA_SHOW_TUTORIAL", false);
        this.f195260f = m212084c1().getBooleanExtra("from_sign_up", false);
        this.f195261g = m212084c1().getBooleanExtra("extra_show_secret_crush_introduction", false);
        Intent intent2 = (Intent) m212084c1().getParcelableExtra("extra_from_push_transfer");
        NavigationCardIntent navigationCardIntent = (NavigationCardIntent) m212084c1().getSerializableExtra("extra_navigation_card_to");
        this.f195265k = navigationCardIntent;
        if (navigationCardIntent == null) {
            this.f195265k = NavigationCardIntent.get("unknown_");
        }
        this.f195267m = m212084c1().getBooleanExtra("extra_scroll_to_setting_bottom", false);
        this.f195264j = m212084c1().getIntExtra("navigation_to_vip_page_index", 0);
        this.f195263i = (HashMap) m212084c1().getSerializableExtra("extra_param_2");
        String stringExtra = m212084c1().getStringExtra("tarot_dialog");
        String stringExtra2 = m212084c1().getStringExtra("horoscope_dialog");
        if (!TextUtils.isEmpty(stringExtra)) {
            oci0.m163519a(act());
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            gx5.m128532a(act());
        }
        String stringExtra3 = m212084c1().getStringExtra("bundle_notify_type");
        if (TextUtils.equals(stringExtra3, "common.link") || TextUtils.equals(stringExtra3, "heartbeat.match.link")) {
            try {
                if (m212084c1().getBooleanExtra("bundle_check_exp", false)) {
                    long longExtra = m212084c1().getLongExtra("bundle_push_exp_time", 0L);
                    if (!CoreModule.f17545c.f19571H1.m201051J3() && longExtra > 0 && mqi0.m155944o() > longExtra) {
                        e51.m114743H(act(), new Runnable() { // from class: l.uz20
                            @Override // java.lang.Runnable
                            public final void run() {
                                y030.m212038A0();
                            }
                        }, 1000L);
                        CoreModule.f17545c.f19571H1.m201071d4();
                    }
                    CoreModule.f17545c.f19571H1.m201051J3();
                }
                m212084c1().removeExtra("bundle_check_exp");
                m212084c1().removeExtra("bundle_push_exp_time");
            } catch (Exception unused) {
            }
        } else if (ogl0.m164238Q() && TextUtils.equals(stringExtra3, "quickchat.party")) {
            exb0.m118586i().m118588h(act());
        }
        m212084c1().removeExtra("extra_param_2");
        m212084c1().removeExtra("extra_navigation_to_tenum");
        m212084c1().removeExtra("extra_navigation_card_to");
        if (TEnum.equals(this.f195262h, NavigationIntent.menu) && mgh0.m154553i(m212084c1())) {
            xij0.m209662e0();
        }
        if (this.f195260f) {
            CoreModule.f17545c.f19639e0.f149261S.put(Boolean.TRUE);
            xh40.m208751a().f192857a = true;
        }
        C4729a0.m31387j().m31390g();
        if (isd.f114751b.get().booleanValue()) {
            e51.m114743H(act(), new Runnable() { // from class: l.f030
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93956a.m212090j1();
                }
            }, 300L);
            if (!TextUtils.isEmpty(isd.f114750a.get())) {
                e51.m114743H(act(), new Runnable() { // from class: l.q030
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f151999a.m212091k1();
                    }
                }, 400L);
            }
        }
        if (this.f195260f) {
            m212089i1();
        }
        if (intent2 != null) {
            act().startActivity(intent2);
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m212088g1() {
        if (CoreModule.f17557o.m195055b().mo33649wf() && !CoreModule.m29932K().me_().isFemale()) {
            if (!xma.m210071e4()) {
                q8p.Companion companion = q8p.INSTANCE;
                if (!TextUtils.isEmpty(companion.m173433h())) {
                    User userById = CoreModule.m29932K().getUserById(companion.m173433h());
                    if (NullChecker.m81303a(userById)) {
                        CoreModule.f17545c.f19663m0.m31057U7(true, false, null, userById, null, LikeFrom.get(LikeFrom.fakeMatch));
                        return;
                    }
                    return;
                }
            }
            CoreModule.f17545c.f19692v2.m129986w3();
            return;
        }
        if (!xma.m210071e4()) {
            q8p.Companion companion2 = q8p.INSTANCE;
            if (!TextUtils.isEmpty(companion2.m173433h())) {
                User userById2 = CoreModule.m29932K().getUserById(companion2.m173433h());
                if (NullChecker.m81303a(userById2)) {
                    CoreModule.f17545c.f19663m0.m31057U7(true, false, null, userById2, null, LikeFrom.get(LikeFrom.fakeMatch));
                    return;
                }
                return;
            }
        }
        String strMo30678Ch = CoreModule.m29932K().mo30678Ch();
        if (!TextUtils.isEmpty(strMo30678Ch)) {
            CoreModule.f17545c.f19692v2.m129985u3(strMo30678Ch);
            CoreModule.m29932K().mo30724Rp("");
        }
        CoreModule.f17545c.f19692v2.m129984q3();
    }

    /* JADX INFO: renamed from: h1 */
    public abstract void mo40381h1();

    /* JADX INFO: renamed from: i1 */
    public final void m212089i1() {
        if (upa.m194745e2()) {
            act().startActivityForResult(MarryStatusSetAct.m47552Z1(act(), this.f195260f), 23);
            act().overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m212090j1() {
        mo40352a1(TabName.Live, false);
        zvf0.m220371D("e_intl_skip_to_live_room", "p_suggest_users_home_view", vwb.m200311Y("live_id_enter", isd.f114750a.get()), vwb.m200311Y("skip_from", "fb"));
        if (TEnum.equals(qib0.f154719h0, "unknown_") || TEnum.equals(qib0.f154719h0, LiveRegionTag.oversea)) {
            UserLiveSettings userLiveSettings = new UserLiveSettings();
            userLiveSettings.intlAdUser = Boolean.TRUE;
            userLiveSettings.regionTag = LiveRegionTag.oversea_chinese;
            duringCreated(CoreModule.f17545c.f19639e0.m169567z9(userLiveSettings)).subscribe(mkd0.m154955G(new e30() { // from class: l.r030
                @Override // p149l.e30
                public final void call(Object obj) {
                    y030.m212065k0((SettingGroups) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m212091k1() {
        CoreModule.m29936Q().startAudienceLive(act(), isd.f114750a.get(), "chat", null);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m212092l1(Bundle bundle) {
        this.f195255a.getWindow().setBackgroundDrawable(null);
        mgh0.m154553i(m212084c1());
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: l.m030
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return y030.m212049O0();
            }
        });
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m212093n1(C4319c c4319c) {
        AppWidgetManager.getInstance(this.f195255a).getAppWidgetIds(new ComponentName(this.f195255a, (Class<?>) MiniWidgetProvider.class));
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m212094o1(String str, ChatGroup chatGroup) {
        act().startActivity(GroupProfileAct.m49107Z1(act(), str, chatGroup, true));
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m212095p1(FreeTrialEnvelope freeTrialEnvelope) {
        act().progressDismiss();
        if (!CoreModule.f17545c.f19654j0.m30604Q4()) {
            lsi0.m151578h(R$string.f17932M5);
            return;
        }
        Intent intentM80165a2 = WebViewAct.m80165a2(act(), CoreModule.f17545c.f19654j0.m30576C4().titleText, CoreModule.f17545c.f19654j0.m30576C4().promotionUrl, true);
        intentM80165a2.putExtra("hideNavigationBar", true);
        act().startActivity(intentM80165a2);
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m212096q1(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m212097r1() {
        lsi0.m151595y(act().getString(R$string.f17723F6));
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m212098s1(OMSDialogInfo oMSDialogInfo) {
        if (NullChecker.m81303a(oMSDialogInfo)) {
            ic50.m135327j().m135333f().m145257r0(true);
            ic50.m135327j().m135333f().m145259t0(act(), oMSDialogInfo, false, true, null);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m212099t1(Intent intent) {
        this.f195255a.startActivity(intent);
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m212100u1(Intent intent) {
        this.f195255a.startActivityForResult(intent, PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m212101v1(MomentFeedPushArgs momentFeedPushArgs) {
        CoreModule.f17545c.f19639e0.f149134A0.m132487l(null);
        if ("comment".equals(momentFeedPushArgs.path)) {
            act().startActivity(CoreModule.m29934N().argsToMomentActivitiesAct(act(), null));
        }
        if ("user".equals(momentFeedPushArgs.path)) {
            act().startActivity(CoreModule.m29934N().argsToMomentsFeedAct(act()));
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(momentFeedPushArgs.uid);
            if (NullChecker.m81303a(userM169430Pa) && NullChecker.m81303a(userM169430Pa.localRelationship) && TEnum.equals(userM169430Pa.localRelationship.state, "matched")) {
                act().startActivity(CoreModule.m29934N().argsToMomentsInProfileAct(act(), momentFeedPushArgs.uid, BLiveOperationClickAction.scheme));
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m212102x1(Greeting greeting) {
        act().startActivity(u59.m191811T() ? IntlDynamicGreetListAct.m46161V1(act(), greeting) : DynamicGreetListAct.m36454V1(act(), greeting));
    }

    /* JADX INFO: renamed from: z1 */
    public void mo40454z1() {
        if (!f195254q && SplashProxyAct.f54725i >= TantanApp.f17185h && SplashProxyAct.f54725i - TantanApp.f17185h < 3000) {
            f195254q = true;
            SystemClock.elapsedRealtime();
            qib0 qib0Var = TantanApp.f17179b;
            zvf0.m220369B("e_app_launch_duration", "", j760.m140076a("during_time", Long.valueOf(SystemClock.elapsedRealtime() - TantanApp.f17183f)), j760.m140076a("from_sign", Boolean.valueOf(qib0.f154725n0)), j760.m140076a("first_record", Boolean.valueOf(TantanApp.f17184g)));
        }
        CoreModule.f17546d.m95181k();
        qib0.f154687E.m78872x();
        CoreModule.f17545c.f19555C0.m210112u4();
        CoreModule.f17545c.f19627a0.m171569q3();
        if (ezc0.m118907m0()) {
            CoreModule.f17545c.f19567G0.m172212p3();
        }
        if (CoreModule.f17545c.f19687u0.f19255l0.get().longValue() <= 0) {
            CoreModule.f17545c.f19687u0.f19255l0.put(Long.valueOf(mqi0.m155944o()));
        }
        m212088g1();
        lifecycle().filter(new w9j() { // from class: l.yz20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15550k);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.zz20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f205776a.m212093n1((C4319c) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
