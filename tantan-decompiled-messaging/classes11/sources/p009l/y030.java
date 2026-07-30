package p009l;

import android.appwidget.AppWidgetManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.SystemClock;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p000p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p000p1.mobile.putong.core.newui.home.C0029a;
import com.p000p1.mobile.putong.core.newui.main.C0260a;
import com.p000p1.mobile.putong.core.oms.OmsDialog;
import com.p000p1.mobile.putong.core.p002ui.intloperation.campingactivity.C0426b;
import com.p000p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p000p1.mobile.putong.location.Location;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p000p1.mobile.putong.p004ui.splash.SplashProxyAct;
import com.p000p1.mobile.putong.p004ui.webview.WebViewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.app.TantanApp;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreProduct;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.a0;
import com.p1.mobile.putong.core.api.c;
import com.p1.mobile.putong.core.api.u;
import com.p1.mobile.putong.core.api.v;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.FreeTrialEnvelope;
import com.p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.intl.greet.message.IntlDynamicGreetListAct;
import com.p1.mobile.putong.core.ui.marry.status.MarryStatusSetAct;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.group.GroupProfileAct;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchMatchUser;
import com.p1.mobile.putong.core.ui.poplevel.CorePopLevel;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.quickaudio.DropDownAct;
import com.p1.mobile.putong.core.ui.settings.SettingsFragOld;
import com.p1.mobile.putong.core.ui.vip.VipAct;
import com.p1.mobile.putong.core.ui.vip.VipLocationHistoryAct;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.core.ui.vip.picks.act.PicksAct;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.LikeExtraData;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MomentFeedPushArgs;
import com.p1.mobile.putong.data.NavigationCardIntent;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.OMSDialogInfo;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveSettings;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import l.cp60;
import l.du2;
import l.e30;
import l.e51;
import l.exb0;
import l.ezc0;
import l.gx5;
import l.hpd0;
import l.isd;
import l.j760;
import l.jo0;
import l.jq2;
import l.k0g0;
import l.lsi0;
import l.lva;
import l.mcr;
import l.mkd0;
import l.mx0;
import l.oci0;
import l.ogl0;
import l.osi0;
import l.q8p;
import l.qh7;
import l.qib0;
import l.roj0;
import l.s7m;
import l.u59;
import l.uc80;
import l.upa;
import l.vch;
import l.vwb;
import l.vx6;
import l.w9j;
import l.wc80;
import l.wm20;
import l.xck0;
import l.xh40;
import l.xij0;
import l.xma;
import l.y3h0;
import l.ygh0;
import l.zvf0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class y030<V extends s7m> extends jq2<V> {

    /* JADX INFO: renamed from: p */
    public static boolean f22821p = false;

    /* JADX INFO: renamed from: q */
    public static boolean f22822q = false;

    /* JADX INFO: renamed from: a */
    public Act f22823a;

    /* JADX INFO: renamed from: b */
    public TabName f22824b;

    /* JADX INFO: renamed from: c */
    public a<roj0> f22825c;

    /* JADX INFO: renamed from: d */
    public hpd0 f22826d;

    /* JADX INFO: renamed from: e */
    public long f22827e;

    /* JADX INFO: renamed from: f */
    public boolean f22828f;

    /* JADX INFO: renamed from: g */
    public boolean f22829g;

    /* JADX INFO: renamed from: h */
    public NavigationIntent f22830h;

    /* JADX INFO: renamed from: i */
    public HashMap<String, String> f22831i;

    /* JADX INFO: renamed from: j */
    public int f22832j;

    /* JADX INFO: renamed from: k */
    public NavigationCardIntent f22833k;

    /* JADX INFO: renamed from: l */
    public C0260a.v f22834l;

    /* JADX INFO: renamed from: m */
    public boolean f22835m;

    /* JADX INFO: renamed from: n */
    public boolean f22836n;

    /* JADX INFO: renamed from: o */
    public a<roj0> f22837o;

    /* JADX INFO: renamed from: l.y030$a */
    public class RunnableC1318a implements Runnable {
        public RunnableC1318a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            lsi0.y(CoreModule.b.getResources().getString(R.string.F6));
        }
    }

    /* JADX INFO: renamed from: l.y030$b */
    public static abstract class AbstractC1319b<V extends y030> {

        /* JADX INFO: renamed from: a */
        public V f22839a;

        public AbstractC1319b(V v) {
            this.f22839a = v;
        }
    }

    public y030(mcr mcrVar) {
        super(mcrVar);
        this.f22824b = CoreModule.Q().m9020M7() ? TabName.Live : TabName.Card;
        this.f22825c = a.c(roj0.a);
        this.f22826d = new hpd0("settingLocationShown" + CoreModule.H().userId(), Boolean.FALSE);
        this.f22827e = -92233720368547758L;
        this.f22828f = false;
        this.f22829g = false;
        this.f22835m = false;
        this.f22836n = false;
        this.f22837o = a.b();
        mo4465h1();
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m25101A0() {
    }

    /* JADX INFO: renamed from: F0 */
    public static /* synthetic */ void m25105F0(Throwable th) {
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m25107H0(roj0 roj0Var) {
        if (upa.O2()) {
            och0.m19661d();
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m25108I0(Throwable th) {
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m25109J0(Counter counter) {
        c cVar = CoreModule.c;
        if (cVar.J2) {
            return;
        }
        cVar.J2 = true;
    }

    /* JADX INFO: renamed from: O0 */
    public static /* synthetic */ boolean m25112O0() {
        if (NotificationCheckerCommon.m9539a() == NotificationCheckerCommon.State.opened) {
            ygh0.J(true);
        } else {
            ygh0.J(false);
        }
        if (PermissionHelper.m10210b("android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION")) {
            ygh0.H(true);
        } else {
            ygh0.H(false);
        }
        if (PermissionHelper.m10210b("android.permission.READ_CONTACTS")) {
            ygh0.a(true);
        } else {
            ygh0.a(false);
        }
        if (PermissionHelper.m10210b("android.permission.READ_EXTERNAL_STORAGE")) {
            ygh0.b(true);
        } else {
            ygh0.b(false);
        }
        ygh0.O();
        return false;
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m25113P0(Throwable th) {
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m25115R0(CoreSuggested.UserInfo userInfo) {
    }

    /* JADX INFO: renamed from: V0 */
    public static /* synthetic */ void m25118V0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m25128k0(SettingGroups settingGroups) {
        isd.a.put("");
        isd.b.put(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m25129l0(roj0 roj0Var) {
        CoreModule.c.f1.m4();
        CoreModule.c.f0.Fo();
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ rx.c m25130m0(roj0 roj0Var) {
        rx.c<Location> cVarM9159p = qib0.E.m9159p();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        return cVarM9159p.take(5L, timeUnit).buffer(6L, timeUnit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m25131m1(com.p1.mobile.android.app.c cVar) {
        if (cVar == com.p1.mobile.android.app.c.i && Act.isFromBackground) {
            if (m25147b1() == TabName.Card || m25147b1() == TabName.Msg) {
                mx0.o().K(act());
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m25133o0(Throwable th) {
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m25138t0(Throwable th) {
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m25139u0(CoreSuggested.UserInfo userInfo) {
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m25141y0(List list) {
        if (list.size() == 0) {
            return;
        }
        vwb.m(list, new w9j() { // from class: l.p030
            public final Object call(Object obj) {
                return Boolean.valueOf(((Location) obj).m9130z() > System.currentTimeMillis() - 43200000);
            }
        });
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ void m25142z0(NetworkInfo networkInfo) {
        CoreModule.c.m0.W8().first().subscribe();
        CoreModule.c.f0.Ye().first().subscribe(mkd0.B());
    }

    /* JADX INFO: renamed from: B1 */
    public void m25143B1(int i) {
        qib0.E.m9163t();
        duringCreated(qib0.E.m9159p().take(10L, TimeUnit.SECONDS)).observeOn(jo0.a()).materialize().first().subscribe(mkd0.G(new e30() { // from class: l.jz20
            public final void call(Object obj) {
                CoreModule.c.m0.m8();
            }
        }));
        if (i == 33) {
            this.f22825c.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m25144C(V v) {
        super.C(v);
        this.f22823a = v.act();
    }

    /* JADX INFO: renamed from: C1 */
    public final void m25145C1(final String str) {
        if (upa.V1()) {
            duringCreated(CoreModule.c.g0.H6(str).filter(new qh7()).take(1)).subscribe(mkd0.H(new e30() { // from class: l.n030
                public final void call(Object obj) {
                    this.f17172a.m25158o1(str, (ChatGroup) obj);
                }
            }, new e30() { // from class: l.o030
                public final void call(Object obj) {
                    y030.m25133o0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: D1 */
    public void m25146D1() {
        String str;
        long longExtra = m25148c1().getLongExtra("extra_heartbeat_expire_time", -1L);
        if (longExtra > 0 && mqi0.m18550o() > longExtra) {
            e51.H(act(), new RunnableC1318a(), 1000L);
            m25148c1().removeExtra("extra_heartbeat_expire_time");
        }
        if (TEnum.equals(this.f22830h, "menu")) {
            mo4436a1(TabName.Msg, false);
        } else if (TEnum.equals(this.f22830h, "moment")) {
            mo4436a1(TabName.Moment, false);
            duringCreated(CoreModule.c.e0.A0.filter(new w9j() { // from class: l.s030
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.a((MomentFeedPushArgs) obj));
                }
            }).first().compose(mkd0.C())).subscribe(mkd0.G(new e30() { // from class: l.oz20
                public final void call(Object obj) {
                    this.f18302a.m25165v1((MomentFeedPushArgs) obj);
                }
            }));
        } else if (TEnum.equals(this.f22830h, "setting")) {
            mo4436a1(TabName.Me, false);
            Intent intent = new Intent((Context) act(), (Class<?>) NewUI1ContainerActivity.class);
            intent.putExtra("fragmentName", SettingsFragOld.class.getSimpleName());
            intent.putExtra("setting_scroll_to_bottom", this.f22835m);
            this.f22823a.startActivity(intent);
        } else if (TEnum.equals(this.f22830h, "profile")) {
            mo4436a1(TabName.Me, false);
        } else {
            String str2 = null;
            if (TEnum.equals(this.f22830h, "live")) {
                mo4436a1(TabName.Live, false);
                IntentParams intentParams = (IntentParams) m25148c1().getSerializableExtra("main_jump_live_tag");
                if (m25148c1().getBooleanExtra("main_jump_live_has_params", false)) {
                    if (intentParams == null) {
                        IntentParams.C0457b c0457b = new IntentParams.C0457b("samsung_intent_params_saved", null);
                        IntentParams intentParams2 = (IntentParams) c0457b.get();
                        c0457b.put(new IntentParams());
                        intentParams = intentParams2;
                    }
                    if (NullChecker.a(intentParams) && !k0g0.b(intentParams.liveId)) {
                        act().startActivity(CoreModule.Q().m9032Xh(act(), intentParams));
                    }
                    m25148c1().removeExtra("main_jump_live_tag");
                    m25148c1().removeExtra("main_jump_live_has_params");
                }
            } else if (TEnum.equals(this.f22830h, "profile_edit")) {
                mo4436a1(TabName.Me, false);
                act().startActivity(ProfileAct.p2(act(), ((DbObject) CoreModule.c.e0.p9()).id, "profile_frag_menu", false, true));
            } else if (TEnum.equals(this.f22830h, "profile_edit_continuous")) {
                mo4436a1(TabName.Me, false);
                act().startActivity(ProfileAct.p2(act(), ((DbObject) CoreModule.c.e0.p9()).id, "from_profile_frag_edit", false, true));
            } else if (TEnum.equals(this.f22830h, "cards")) {
                mo4436a1(TabName.Card, false);
                if (NullChecker.a(this.f22831i) && this.f22831i.size() > 0) {
                    TextUtils.equals(this.f22831i.get("cardType"), "main");
                }
            } else if (TEnum.equals(this.f22830h, "webview")) {
                Act act = this.f22823a;
                act.startActivity(lva.A(act, m25148c1().getStringExtra("webview_title"), m25148c1().getStringExtra("webview_url"), m25148c1().getBooleanExtra("hideNavigationBar", false), m25148c1().getBooleanExtra("hardwareAccelerated", false), m25148c1().getBooleanExtra("useMkWebview", false)));
            } else if (TEnum.equals(this.f22830h, "seeLikes")) {
                mo4436a1(TabName.Msg, false);
                this.f22836n = true;
                this.f22837o.onNext(roj0.a);
            } else if (TEnum.equals(this.f22830h, "seeSidePush")) {
                Act act2 = this.f22823a;
                act2.startActivity(LikersAct.X1(act2, "push_call2buysee"));
            } else if (TEnum.equals(this.f22830h, "seeSideMsg")) {
                Act act3 = this.f22823a;
                act3.startActivity(LikersAct.X1(act3, "msg_call2buysee"));
            } else if (TEnum.equals(this.f22830h, "seeSideNewPush")) {
                Act act4 = this.f22823a;
                act4.startActivity(LikersAct.X1(act4, "push_call2buysee_side_new"));
            } else if (TEnum.equals(this.f22830h, "seeSideNewMsg")) {
                Act act5 = this.f22823a;
                act5.startActivity(LikersAct.X1(act5, "msg_call2buysee_side_new"));
            } else if (TEnum.equals(this.f22830h, "liveAnchor")) {
                CoreModule.Q().m9007F8(this.f22823a, true, true, "p_core_push");
            } else if (TEnum.equals(this.f22830h, "startVoiceLive")) {
                CoreModule.Q().m9019M6().m12090i(this.f22823a, "");
            } else if (TEnum.equals(this.f22830h, "quickchat")) {
                mo4436a1(TabName.Msg, false);
                CoreModule.c.f0.go();
                e51.F(act(), new Runnable() { // from class: l.pz20
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreModule.c.e0.z0.onNext(Boolean.TRUE);
                    }
                });
            } else if (TEnum.equals(this.f22830h, "greetChat")) {
                if (!u59.T()) {
                    return;
                }
                mo4436a1(TabName.Msg, false);
                duringCreated(CoreModule.c.r0.o5(m25148c1().getStringExtra("greetingId"))).take(1).subscribe(mkd0.H(new e30() { // from class: l.qz20
                    public final void call(Object obj) {
                        this.f19591a.m25166x1((Greeting) obj);
                    }
                }, new e30() { // from class: l.rz20
                    public final void call(Object obj) {
                        y030.m25118V0((Throwable) obj);
                    }
                }));
            } else if (TEnum.equals(this.f22830h, "quickChatMatch")) {
                mo4436a1(TabName.Msg, false);
                final OnlineMatchMatchUser serializableExtra = m25148c1().getSerializableExtra("otherUser");
                if (NullChecker.a(serializableExtra)) {
                    serializableExtra.user = CoreModule.c.e0.Pa(serializableExtra.userId);
                    e51.H(act(), new Runnable() { // from class: l.sz20
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.a0.onNext(vwb.Y("match_success", serializableExtra));
                        }
                    }, 800L);
                }
            } else if (TEnum.equals(this.f22830h, "freeTrialPromotion")) {
                if (CoreModule.c.j0.Q4()) {
                    Intent intentM10499a2 = WebViewAct.m10499a2(act(), CoreModule.c.j0.C4().titleText, CoreModule.c.j0.C4().promotionUrl, true);
                    intentM10499a2.putExtra("hideNavigationBar", true);
                    act().startActivity(intentM10499a2);
                } else if (CoreProduct.PromotionStatus.NONE != CoreModule.c.j0.H4()) {
                    lsi0.h(R.string.M5);
                } else if (!IntlCountryCodeController.k()) {
                    act().progress(R.string.J5);
                    duringCreated(CoreModule.c.j0.G4()).subscribe(mkd0.H(new e30() { // from class: l.tz20
                        public final void call(Object obj) {
                            this.f20924a.m25159p1((FreeTrialEnvelope) obj);
                        }
                    }, new e30() { // from class: l.vz20
                        public final void call(Object obj) {
                            this.f21824a.m25160q1((Throwable) obj);
                        }
                    }));
                }
            } else if (!TEnum.equals(this.f22830h, "introPromotion")) {
                if (TEnum.equals(this.f22830h, "setting_chooselocation")) {
                    act().startActivity(VipLocationHistoryAct.V1(act(), ""));
                } else if (TEnum.equals(this.f22830h, "vip")) {
                    act().startActivity(VipAct.b2(act(), this.f22832j));
                } else if (TEnum.equals(this.f22830h, "fakealert")) {
                    if (CoreModule.c.e0.Z7()) {
                        wm20.m(act());
                    }
                } else if (TEnum.equals(this.f22830h, "welcomeBack")) {
                    kb50 kb50VarM16322f = ic50.m16316j().m16322f();
                    OmsDialog omsDialog = OmsDialog.p_welcomeback_popup;
                    OMSDialogInfo oMSDialogInfoM17398S = kb50VarM16322f.m17398S(omsDialog.getIdentifier());
                    if (NullChecker.a(oMSDialogInfoM17398S) && ic50.m16316j().m16322f().m17392M(omsDialog.getIdentifier(), !oMSDialogInfoM17398S.constraint.userDimension)) {
                        ic50.m16316j().m16322f().m17426u0(act(), oMSDialogInfoM17398S, true, null);
                    }
                } else if (TEnum.equals(this.f22830h, "voiceChat")) {
                    mo4436a1(TabName.VoiceChat, false);
                } else if (TEnum.equals(this.f22830h, "seePicks")) {
                    mo4436a1(TabName.Msg, false);
                    act().startActivity(new Intent((Context) act(), (Class<?>) PicksAct.class));
                } else if (TEnum.equals(this.f22830h, "quickChat2Floor")) {
                    mo4436a1(TabName.Msg, false);
                    if (NullChecker.a(this.f22831i)) {
                        str2 = this.f22831i.get("active");
                        str = this.f22831i.get("from");
                    } else {
                        str = null;
                    }
                    Act act6 = act();
                    Act act7 = act();
                    if (TextUtils.isEmpty(str)) {
                        str = "push_quickchat";
                    }
                    act6.startActivity(DropDownAct.a2(act7, str2, str));
                } else if (TEnum.equals(this.f22830h, "profile_purchase_svip")) {
                    mo4436a1(TabName.Me, false);
                    CoreModule.P().a().qm(act(), "NA,NA,push_click", (Privilege) null, (e30) null);
                } else if (TEnum.equals(this.f22830h, "profile_purchase_see")) {
                    mo4436a1(TabName.Me, false);
                    CoreModule.P().a().l1(act(), "NA,NA,push_click");
                } else if (TEnum.equals(this.f22830h, "profile_purchase_vip")) {
                    mo4436a1(TabName.Me, false);
                    com.p1.mobile.putong.core.ui.purchase.c.I1(act(), "NA,NA,push_click");
                } else if (TEnum.equals(this.f22830h, "intl_operating_pet")) {
                    if (C0029a.INSTANCE.m960f()) {
                        mo4436a1(TabName.Card, false);
                        cp60.INSTANCE.e0(act(), 3);
                    }
                } else if (TEnum.equals(this.f22830h, "intl_similar_interests")) {
                    if (C0029a.INSTANCE.m961g()) {
                        mo4436a1(TabName.Card, false);
                        qff0.INSTANCE.m20949n(act(), 3);
                    }
                } else if (TEnum.equals(this.f22830h, "intl_camping")) {
                    if (C0029a.INSTANCE.m957c()) {
                        mo4436a1(TabName.Card, false);
                        C0426b.INSTANCE.m8375i(act(), 3);
                    }
                } else if (TEnum.equals(this.f22830h, "regular_main_popup")) {
                    if (!C0029a.INSTANCE.m955a()) {
                        mo4436a1(TabName.Card, false);
                        ubo.INSTANCE.m22783m(act(), 3);
                    }
                } else if (TEnum.equals(this.f22830h, "intl_third_pay_quick_login")) {
                    com.p1.mobile.putong.core.ui.quicklogin.a.INSTANCE.b(act());
                } else if (TEnum.equals(this.f22830h, "loveBuzz")) {
                    if (u59.d0()) {
                        mo4436a1(TabName.Buzz, false);
                    }
                } else if (TEnum.equals(this.f22830h, "intlTribe")) {
                    mo4436a1(TabName.Meet, false);
                    CoreModule.c.n1.z3().onNext(Boolean.TRUE);
                } else if (TEnum.equals(this.f22830h, "heartbeatMatch")) {
                    zvf0.D("e_heart_signal_enter", "", new j760[0]);
                    if (m25148c1().getBooleanExtra("bundle_check_exp", false)) {
                        long longExtra2 = m25148c1().getLongExtra("bundle_push_exp_time", 0L);
                        if (longExtra2 <= 0 || mqi0.m18550o() <= longExtra2) {
                            CoreModule.c.H1.h0 = mqi0.m18550o() + 20000;
                            mo4436a1(TabName.Msg, false);
                            String stringExtra = m25148c1().getStringExtra("traker");
                            final String stringExtra2 = m25148c1().getStringExtra("userid");
                            duringCreated(CoreModule.c.H1.V3(stringExtra).take(1)).subscribe(mkd0.H(new e30() { // from class: l.xz20
                                public final void call(Object obj) {
                                    CoreModule.c.f0.ap(stringExtra2);
                                }
                            }, new e30() { // from class: l.t030
                                public final void call(Object obj) {
                                    osi0.g("网络异常！");
                                }
                            }));
                        } else {
                            e51.H(act(), new Runnable() { // from class: l.wz20
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f22372a.m25161r1();
                                }
                            }, 1000L);
                        }
                    }
                    m25148c1().removeExtra("bundle_check_exp");
                    m25148c1().removeExtra("bundle_push_exp_time");
                } else if (TEnum.equals(this.f22830h, "verify_avatar")) {
                    mo4436a1(TabName.Card, false);
                    if (NullChecker.a(this.f22831i) && this.f22831i.size() > 0) {
                        bcp.INSTANCE.m11960u(act(), this.f22831i.get("status"));
                    }
                } else if (TEnum.equals(this.f22830h, "internal_voice_square")) {
                    CoreModule.Q().m9019M6().m12099r(act(), m25148c1().getStringExtra("live_internal_voice_square_tab_id"));
                    m25148c1().removeExtra("live_internal_voice_square_tab_id");
                }
            }
        }
        this.f22830h = NavigationIntent.get("unknown_");
        if (!k0g0.b(m25148c1().getStringExtra("superlike_user_id"))) {
            mo4436a1(TabName.Card, false);
            CoreModule.c.m0.a9(m25148c1().getStringExtra("superlike_user_id")).subscribe(mkd0.H(new e30() { // from class: l.u030
                public final void call(Object obj) {
                    y030.m25115R0((CoreSuggested.UserInfo) obj);
                }
            }, new e30() { // from class: l.v030
                public final void call(Object obj) {
                    y030.m25138t0((Throwable) obj);
                }
            }));
            m25148c1().removeExtra("superlike_user_id");
            return;
        }
        if (!k0g0.b(m25148c1().getStringExtra("album_user_id"))) {
            mo4436a1(TabName.Me, false);
            this.f22823a.startActivity(CoreModule.N().argsToPhotoAlbumFeedAct(act(), m25148c1().getStringExtra("album_user_id"), "push", -1, (String) null, 2));
            m25148c1().removeExtra("album_user_id");
            return;
        }
        if (m25148c1().hasExtra("extra_to_caption")) {
            if (m25148c1().getBooleanExtra("extra_to_caption", false)) {
                mo4436a1(TabName.Moment, false);
            }
            m25148c1().removeExtra("extra_to_caption");
            return;
        }
        if (!k0g0.b(m25148c1().getStringExtra("card_push_link"))) {
            mo4436a1(TabName.Card, false);
            CoreModule.c.m0.Y8(m25148c1().getStringExtra("card_push_link"));
            m25148c1().removeExtra("card_push_link");
            return;
        }
        if (m25148c1().hasExtra("oms_dialog_link")) {
            if (!TextUtils.isEmpty(m25148c1().getStringExtra("oms_id")) && !TextUtils.isEmpty(m25148c1().getStringExtra("oms_identifier"))) {
                OMSDialogInfo oMSDialogInfoM17398S2 = ic50.m16316j().m16322f().m17398S(m25148c1().getStringExtra("oms_identifier"));
                if (NullChecker.a(oMSDialogInfoM17398S2)) {
                    ic50.m16316j().m16322f().m17423r0(true);
                    ic50.m16316j().m16322f().m17425t0(act(), oMSDialogInfoM17398S2, false, true, null);
                } else {
                    duringCreated(ic50.m16316j().m16322f().m17421p0(m25148c1().getStringExtra("oms_id"))).subscribe(mkd0.H(new e30() { // from class: l.w030
                        public final void call(Object obj) {
                            this.f21830a.m25162s1((OMSDialogInfo) obj);
                        }
                    }, new e30() { // from class: l.x030
                        public final void call(Object obj) {
                            y030.m25113P0((Throwable) obj);
                        }
                    }));
                }
            }
            m25148c1().removeExtra("oms_dialog_link");
            return;
        }
        if (m25148c1().hasExtra("extra_to_conversation")) {
            if (m25148c1().getBooleanExtra("extra_to_conversation", false)) {
                mo4436a1(TabName.Msg, false);
            }
            m25148c1().removeExtra("extra_to_conversation");
            return;
        }
        if (!k0g0.b(m25148c1().getStringExtra("letter_user_id")) && !k0g0.b(m25148c1().getStringExtra("letter_content"))) {
            mo4436a1(TabName.Card, false);
            CoreModule.c.m0.X8(m25148c1().getStringExtra("letter_user_id"), m25148c1().getStringExtra("letter_content")).subscribe(mkd0.H(new e30() { // from class: l.kz20
                public final void call(Object obj) {
                    y030.m25139u0((CoreSuggested.UserInfo) obj);
                }
            }, new e30() { // from class: l.lz20
                public final void call(Object obj) {
                    y030.m25108I0((Throwable) obj);
                }
            }));
            m25148c1().removeExtra("letter_user_id");
            m25148c1().removeExtra("letter_content");
            return;
        }
        if (m25148c1().hasExtra("extra_to_message") && m25148c1().getBooleanExtra("extra_to_message", false)) {
            m25148c1().removeExtra("extra_to_message");
            String stringExtra3 = m25148c1().getStringExtra("extra_message_user_id");
            if (TextUtils.isEmpty(stringExtra3)) {
                CrashHelper.c(new Exception("NewMainAct error: can not go to MessagesAct, because userId = null"));
                return;
            } else {
                final Intent intentM2 = MessagesAct.m2(act(), stringExtra3, false, false, m25148c1().getIntExtra("from", 1), m25148c1().getBooleanExtra("media_keyboard", false));
                e51.H(this.f22823a, new Runnable() { // from class: l.mz20
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f17160a.m25163t1(intentM2);
                    }
                }, 500L);
                return;
            }
        }
        if (!k0g0.b(m25148c1().getStringExtra("album_comment_or_like_user_id"))) {
            m25148c1().removeExtra("album_comment_or_like_user_id");
            mo4436a1(TabName.Moment, false);
            this.f22823a.startActivity(CoreModule.N().argsToPhotoAlbumActivitiesAct(act(), "activities", true, true, true));
            return;
        }
        if (!k0g0.b(m25148c1().getStringExtra("extra_new_main_type")) && TextUtils.equals(m25148c1().getStringExtra("extra_new_main_type"), "extra_new_main_type_moment_live")) {
            mo4436a1(TabName.Moment, false);
            m25148c1().removeExtra("extra_new_main_type");
            return;
        }
        if (!k0g0.b(m25148c1().getStringExtra("extra_new_main_type")) && TextUtils.equals(m25148c1().getStringExtra("extra_new_main_type"), "extra_new_main_type_live")) {
            mo4436a1(TabName.Live, false);
            m25148c1().removeExtra("extra_new_main_type");
            return;
        }
        if (!TextUtils.isEmpty(m25148c1().getStringExtra("extra_join_group_id"))) {
            mo4436a1(TabName.Card, false);
            m25145C1(m25148c1().getStringExtra("extra_join_group_id"));
            m25148c1().removeExtra("extra_join_group_id");
            return;
        }
        if (m25148c1().hasExtra("navigation_to_picks")) {
            mo4436a1(TabName.Msg, false);
            this.f22823a.startActivity(new Intent((Context) this.f22823a, (Class<?>) PicksAct.class));
            m25148c1().removeExtra("navigation_to_picks");
            return;
        }
        if (!m25148c1().hasExtra("navigation_to_moment_post")) {
            if (upa.M2() && m25148c1().hasExtra("extra_show_surprise_box_dialog") && m25148c1().getBooleanExtra("extra_show_surprise_box_dialog", false)) {
                y3h0 y3h0Var = new y3h0(act());
                if (com.p1.mobile.android.ui.poplevel.a.p().I()) {
                    com.p1.mobile.android.ui.poplevel.a.p().C(CorePopLevel.SURPRISE_BOX, act(), y3h0Var, 20000);
                } else {
                    wc80.e().q(uc80.a(y3h0Var));
                }
                m25148c1().removeExtra("extra_show_surprise_box_dialog");
                return;
            }
            return;
        }
        mo4436a1(TabName.Moment, false);
        String stringExtra4 = m25148c1().getStringExtra("extra_topic_id");
        String stringExtra5 = m25148c1().getStringExtra("extra_topic_name");
        String stringExtra6 = m25148c1().getStringExtra("extra_from_key");
        vch feedMediaHandler = CoreModule.N().getFeedMediaHandler(this.f22823a);
        Act act8 = this.f22823a;
        ArrayList arrayListF0 = vwb.f0(new Media[0]);
        if (TextUtils.isEmpty(stringExtra6)) {
            stringExtra6 = "other";
        }
        feedMediaHandler.b(act8, arrayListF0, true, stringExtra6, stringExtra4, stringExtra5, xck0.a(400, new e30() { // from class: l.nz20
            public final void call(Object obj) {
                this.f17779a.m25164u1((Intent) obj);
            }
        }), (String) null);
        m25148c1().removeExtra("navigation_to_moment_post");
    }

    /* JADX INFO: renamed from: a0 */
    public void mo4435a0() {
        y8i0.m25203a("NewMainBasePresenter initSubscription");
        duringCreated(qib0.v0).take(1).subscribe(mkd0.G(new e30() { // from class: l.a030
            public final void call(Object obj) {
                y030.m25129l0((roj0) obj);
            }
        }));
        duringCreated(CoreModule.c.j0.J5()).subscribe(mkd0.H(new e30() { // from class: l.c030
            public final void call(Object obj) {
                y030.m25107H0((roj0) obj);
            }
        }, new e30() { // from class: l.d030
            public final void call(Object obj) {
                du2.a("[core][merchandise]", "refresh merchandise error :" + ((Throwable) obj).toString());
            }
        }));
        duringCreated(this.f22825c.switchMap(new w9j() { // from class: l.e030
            public final Object call(Object obj) {
                return y030.m25130m0((roj0) obj);
            }
        }).observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.g030
            public final void call(Object obj) {
                y030.m25141y0((List) obj);
            }
        }, new e30() { // from class: l.h030
            public final void call(Object obj) {
                y030.m25105F0((Throwable) obj);
            }
        }));
        duringCreated(CoreModule.c.n3()).subscribe(mkd0.G(new e30() { // from class: l.i030
            public final void call(Object obj) {
                y030.m25109J0((Counter) obj);
            }
        }));
        creates(new e30() { // from class: l.j030
            public final void call(Object obj) {
                this.f14878a.m25156l1((Bundle) obj);
            }
        });
        duringCreated(ConnectivityReceiver.m()).skip(1).filter(new w9j() { // from class: l.k030
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).subscribe(new e30() { // from class: l.l030
            public final void call(Object obj) {
                y030.m25142z0((NetworkInfo) obj);
            }
        });
        u.a3();
        vx6.M();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.b030
            public final void call(Object obj) {
                this.f9778a.m25131m1((com.p1.mobile.android.app.c) obj);
            }
        }));
        y8i0.m25204b();
    }

    /* JADX INFO: renamed from: a1 */
    public abstract void mo4436a1(TabName tabName, boolean z);

    /* JADX INFO: renamed from: b1 */
    public TabName m25147b1() {
        return this.f22824b;
    }

    /* JADX INFO: renamed from: c1 */
    public Intent m25148c1() {
        return this.f22823a.getIntent();
    }

    /* JADX INFO: renamed from: d1 */
    public C0260a.v m25149d1() {
        return this.f22834l;
    }

    /* JADX INFO: renamed from: e1 */
    public String m25150e1() {
        NavigationIntent navigationIntent = this.f22830h;
        if (navigationIntent == null) {
            return null;
        }
        return navigationIntent.toString();
    }

    /* JADX INFO: renamed from: f1 */
    public void m25151f1(Intent intent) {
        try {
            this.f22830h = m25148c1().getSerializableExtra("extra_navigation_to_tenum");
        } catch (Throwable th) {
            CrashHelper.c(th);
            try {
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    Iterator<String> it = extras.keySet().iterator();
                    while (it.hasNext()) {
                        intent.removeExtra(it.next());
                    }
                    this.f22823a.setIntent(intent);
                }
            } catch (Throwable th2) {
                CrashHelper.c(th2);
            }
        }
        if (this.f22830h == null) {
            this.f22830h = NavigationIntent.get("unknown_");
        }
        f22821p = m25148c1().getBooleanExtra("EXTRA_SHOW_TUTORIAL", false);
        this.f22828f = m25148c1().getBooleanExtra("from_sign_up", false);
        this.f22829g = m25148c1().getBooleanExtra("extra_show_secret_crush_introduction", false);
        Intent intent2 = (Intent) m25148c1().getParcelableExtra("extra_from_push_transfer");
        NavigationCardIntent serializableExtra = m25148c1().getSerializableExtra("extra_navigation_card_to");
        this.f22833k = serializableExtra;
        if (serializableExtra == null) {
            this.f22833k = NavigationCardIntent.get("unknown_");
        }
        this.f22835m = m25148c1().getBooleanExtra("extra_scroll_to_setting_bottom", false);
        this.f22832j = m25148c1().getIntExtra("navigation_to_vip_page_index", 0);
        this.f22831i = (HashMap) m25148c1().getSerializableExtra("extra_param_2");
        String stringExtra = m25148c1().getStringExtra("tarot_dialog");
        String stringExtra2 = m25148c1().getStringExtra("horoscope_dialog");
        if (!TextUtils.isEmpty(stringExtra)) {
            oci0.a(act());
        }
        if (!TextUtils.isEmpty(stringExtra2)) {
            gx5.a(act());
        }
        String stringExtra3 = m25148c1().getStringExtra("bundle_notify_type");
        if (TextUtils.equals(stringExtra3, "common.link") || TextUtils.equals(stringExtra3, "heartbeat.match.link")) {
            try {
                if (m25148c1().getBooleanExtra("bundle_check_exp", false)) {
                    long longExtra = m25148c1().getLongExtra("bundle_push_exp_time", 0L);
                    if (!CoreModule.c.H1.J3() && longExtra > 0 && mqi0.m18550o() > longExtra) {
                        e51.H(act(), new Runnable() { // from class: l.uz20
                            @Override // java.lang.Runnable
                            public final void run() {
                                y030.m25101A0();
                            }
                        }, 1000L);
                        CoreModule.c.H1.d4();
                    }
                    CoreModule.c.H1.J3();
                }
                m25148c1().removeExtra("bundle_check_exp");
                m25148c1().removeExtra("bundle_push_exp_time");
            } catch (Exception unused) {
            }
        } else if (ogl0.Q() && TextUtils.equals(stringExtra3, "quickchat.party")) {
            exb0.i().h(act());
        }
        m25148c1().removeExtra("extra_param_2");
        m25148c1().removeExtra("extra_navigation_to_tenum");
        m25148c1().removeExtra("extra_navigation_card_to");
        if (TEnum.equals(this.f22830h, "menu") && mgh0.m18455i(m25148c1())) {
            xij0.e0();
        }
        if (this.f22828f) {
            CoreModule.c.e0.S.put(Boolean.TRUE);
            xh40.a().a = true;
        }
        a0.j().g();
        if (((Boolean) isd.b.get()).booleanValue()) {
            e51.H(act(), new Runnable() { // from class: l.f030
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12743a.m25154j1();
                }
            }, 300L);
            if (!TextUtils.isEmpty((CharSequence) isd.a.get())) {
                e51.H(act(), new Runnable() { // from class: l.q030
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f18981a.m25155k1();
                    }
                }, 400L);
            }
        }
        if (this.f22828f) {
            m25153i1();
        }
        if (intent2 != null) {
            act().startActivity(intent2);
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final void m25152g1() {
        if (CoreModule.o.b().wf() && !CoreModule.K().me_().isFemale()) {
            if (!xma.e4()) {
                q8p.a aVar = q8p.Companion;
                if (!TextUtils.isEmpty(aVar.h())) {
                    User userById = CoreModule.K().getUserById(aVar.h());
                    if (NullChecker.a(userById)) {
                        CoreModule.c.m0.U7(true, false, (Map) null, userById, (LikeExtraData) null, LikeFrom.get("fakeMatch"));
                        return;
                    }
                    return;
                }
            }
            CoreModule.c.v2.w3();
            return;
        }
        if (!xma.e4()) {
            q8p.a aVar2 = q8p.Companion;
            if (!TextUtils.isEmpty(aVar2.h())) {
                User userById2 = CoreModule.K().getUserById(aVar2.h());
                if (NullChecker.a(userById2)) {
                    CoreModule.c.m0.U7(true, false, (Map) null, userById2, (LikeExtraData) null, LikeFrom.get("fakeMatch"));
                    return;
                }
                return;
            }
        }
        String strCh = CoreModule.K().Ch();
        if (!TextUtils.isEmpty(strCh)) {
            CoreModule.c.v2.u3(strCh);
            CoreModule.K().Rp("");
        }
        CoreModule.c.v2.q3();
    }

    /* JADX INFO: renamed from: h1 */
    public abstract void mo4465h1();

    /* JADX INFO: renamed from: i1 */
    public final void m25153i1() {
        if (upa.e2()) {
            act().startActivityForResult(MarryStatusSetAct.Z1(act(), this.f22828f), 23);
            act().overridePendingTransition(0, 0);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ void m25154j1() {
        mo4436a1(TabName.Live, false);
        zvf0.D("e_intl_skip_to_live_room", "p_suggest_users_home_view", new j760[]{vwb.Y("live_id_enter", (String) isd.a.get()), vwb.Y("skip_from", "fb")});
        if (TEnum.equals(qib0.h0, "unknown_") || TEnum.equals(qib0.h0, "oversea")) {
            UserLiveSettings userLiveSettings = new UserLiveSettings();
            userLiveSettings.intlAdUser = Boolean.TRUE;
            userLiveSettings.regionTag = "oversea_chinese";
            duringCreated(CoreModule.c.e0.z9(userLiveSettings)).subscribe(mkd0.G(new e30() { // from class: l.r030
                public final void call(Object obj) {
                    y030.m25128k0((SettingGroups) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m25155k1() {
        CoreModule.Q().startAudienceLive(act(), (String) isd.a.get(), "chat", null);
    }

    /* JADX INFO: renamed from: l1 */
    public final /* synthetic */ void m25156l1(Bundle bundle) {
        this.f22823a.getWindow().setBackgroundDrawable(null);
        mgh0.m18455i(m25148c1());
        Looper.myQueue().addIdleHandler(new MessageQueue.IdleHandler() { // from class: l.m030
            @Override // android.os.MessageQueue.IdleHandler
            public final boolean queueIdle() {
                return y030.m25112O0();
            }
        });
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m25157n1(com.p1.mobile.android.app.c cVar) {
        AppWidgetManager.getInstance(this.f22823a).getAppWidgetIds(new ComponentName((Context) this.f22823a, (Class<?>) MiniWidgetProvider.class));
    }

    /* JADX INFO: renamed from: o1 */
    public final /* synthetic */ void m25158o1(String str, ChatGroup chatGroup) {
        act().startActivity(GroupProfileAct.Z1(act(), str, chatGroup, true));
    }

    /* JADX INFO: renamed from: p1 */
    public final /* synthetic */ void m25159p1(FreeTrialEnvelope freeTrialEnvelope) {
        act().progressDismiss();
        if (!CoreModule.c.j0.Q4()) {
            lsi0.h(R.string.M5);
            return;
        }
        Intent intentM10499a2 = WebViewAct.m10499a2(act(), CoreModule.c.j0.C4().titleText, CoreModule.c.j0.C4().promotionUrl, true);
        intentM10499a2.putExtra("hideNavigationBar", true);
        act().startActivity(intentM10499a2);
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m25160q1(Throwable th) {
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m25161r1() {
        lsi0.y(act().getString(R.string.F6));
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m25162s1(OMSDialogInfo oMSDialogInfo) {
        if (NullChecker.a(oMSDialogInfo)) {
            ic50.m16316j().m16322f().m17423r0(true);
            ic50.m16316j().m16322f().m17425t0(act(), oMSDialogInfo, false, true, null);
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m25163t1(Intent intent) {
        this.f22823a.startActivity(intent);
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m25164u1(Intent intent) {
        this.f22823a.startActivityForResult(intent, 786);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m25165v1(MomentFeedPushArgs momentFeedPushArgs) {
        CoreModule.c.e0.A0.onNext((Object) null);
        if ("comment".equals(momentFeedPushArgs.path)) {
            act().startActivity(CoreModule.N().argsToMomentActivitiesAct(act(), (String) null));
        }
        if ("user".equals(momentFeedPushArgs.path)) {
            act().startActivity(CoreModule.N().argsToMomentsFeedAct(act()));
            User userPa = CoreModule.c.e0.Pa(momentFeedPushArgs.uid);
            if (NullChecker.a(userPa) && NullChecker.a(userPa.localRelationship) && TEnum.equals(userPa.localRelationship.state, "matched")) {
                act().startActivity(CoreModule.N().argsToMomentsInProfileAct(act(), momentFeedPushArgs.uid, "scheme"));
            }
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final /* synthetic */ void m25166x1(Greeting greeting) {
        act().startActivity(u59.T() ? IntlDynamicGreetListAct.V1(act(), greeting) : DynamicGreetListAct.m383V1(act(), greeting));
    }

    /* JADX INFO: renamed from: z1 */
    public void mo4538z1() {
        if (!f22822q && SplashProxyAct.f8331i >= TantanApp.h && SplashProxyAct.f8331i - TantanApp.h < 3000) {
            f22822q = true;
            SystemClock.elapsedRealtime();
            qib0 qib0Var = TantanApp.b;
            zvf0.B("e_app_launch_duration", "", new j760[]{j760.a("during_time", Long.valueOf(SystemClock.elapsedRealtime() - TantanApp.f)), j760.a("from_sign", Boolean.valueOf(qib0.n0)), j760.a("first_record", Boolean.valueOf(TantanApp.g))});
        }
        CoreModule.d.k();
        qib0.E.m9167x();
        CoreModule.c.C0.u4();
        CoreModule.c.a0.q3();
        if (ezc0.m0()) {
            CoreModule.c.G0.p3();
        }
        if (((Long) CoreModule.c.u0.l0.get()).longValue() <= 0) {
            CoreModule.c.u0.l0.put(Long.valueOf(mqi0.m18550o()));
        }
        m25152g1();
        lifecycle().filter(new w9j() { // from class: l.yz20
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.k);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.zz20
            public final void call(Object obj) {
                this.f24054a.m25157n1((com.p1.mobile.android.app.c) obj);
            }
        }));
    }

    public void destroy() {
    }
}
