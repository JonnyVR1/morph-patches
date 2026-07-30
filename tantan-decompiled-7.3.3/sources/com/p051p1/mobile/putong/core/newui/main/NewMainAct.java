package com.p051p1.mobile.putong.core.newui.main;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.PopupWindow;
import androidx.fragment.app.Fragment;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4896k;
import com.p051p1.mobile.putong.core.data.AppealInfo;
import com.p051p1.mobile.putong.core.data.DatingGuideData;
import com.p051p1.mobile.putong.core.data.Figure;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag;
import com.p051p1.mobile.putong.core.newui.loveletter.LoveLetterAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p051p1.mobile.putong.core.newui.profile.ProfileFrag;
import com.p051p1.mobile.putong.core.p058ui.p060gp.C8509a;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.data.LookingFor;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.NavigationCardIntent;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.data.SliderData;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.splash.SplashProxyAct;
import com.p051p1.mobile.putong.remote_config.C13262b;
import com.p051p1.mobile.putong.util.launch.LaunchStep;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;
import p153l.a0g;
import p153l.adc0;
import p153l.b9c;
import p153l.bem;
import p153l.bm5;
import p153l.cjj;
import p153l.cu3;
import p153l.d1k0;
import p153l.dyf;
import p153l.esf0;
import p153l.f5g;
import p153l.f6g0;
import p153l.g9r;
import p153l.gbl;
import p153l.gra;
import p153l.hmq0;
import p153l.hxf;
import p153l.i0f0;
import p153l.i4g0;
import p153l.iig0;
import p153l.ji30;
import p153l.jxd0;
import p153l.jyb;
import p153l.k4h;
import p153l.kec0;
import p153l.l51;
import p153l.l9c;
import p153l.lhl;
import p153l.ln7;
import p153l.nae0;
import p153l.o1j0;
import p153l.o2c;
import p153l.oki;
import p153l.ou90;
import p153l.pf60;
import p153l.psd0;
import p153l.q9c;
import p153l.qcj;
import p153l.qtk;
import p153l.r130;
import p153l.rlg;
import p153l.t4j;
import p153l.tk5;
import p153l.tx0;
import p153l.u1z;
import p153l.uj4;
import p153l.uqb0;
import p153l.uqi;
import p153l.uxj0;
import p153l.vd0;
import p153l.vel0;
import p153l.vk80;
import p153l.w1j0;
import p153l.wxf;
import p153l.x20;
import p153l.xwa;
import p153l.y20;
import p153l.yhi0;
import p153l.yw0;
import p153l.z20;

/* JADX INFO: loaded from: classes11.dex */
public class NewMainAct extends NewMainBaseAct<C8247a> implements w1j0, hmq0 {

    /* JADX INFO: renamed from: r */
    public static final jxd0 f25176r = new jxd0("s_r_s_b_l", Boolean.FALSE);

    /* JADX INFO: renamed from: s */
    public static C22508b<pf60<Boolean, Integer>> f25177s = C22508b.m222767b();

    /* JADX INFO: renamed from: m */
    public NewMainViewModel f25178m;

    /* JADX INFO: renamed from: n */
    public final long f25179n = System.currentTimeMillis();

    /* JADX INFO: renamed from: o */
    public PopupWindow f25180o;

    /* JADX INFO: renamed from: p */
    public boolean f25181p;

    /* JADX INFO: renamed from: q */
    public List<User> f25182q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainAct$a */
    public class RunnableC8241a implements Runnable {
        public RunnableC8241a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            l51.m152885E();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainAct$b */
    public class C8242b implements Dialog.InterfaceC4462g {
        public C8242b() {
        }

        @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
        /* JADX INFO: renamed from: a */
        public void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
            if (charSequence.equals("open")) {
                i0f0.m137961c();
            } else if (charSequence.equals("close")) {
                i0f0.m137960b();
            } else if (charSequence.equals("上传数据")) {
                i0f0.m137962d();
            }
        }
    }

    public NewMainAct() {
        t4j.m189281g("Activity Init");
        this.f25182q = new ArrayList();
    }

    /* JADX INFO: renamed from: B4 */
    public static /* synthetic */ void m40668B4() {
        jxd0 jxd0Var = f25176r;
        jxd0Var.put(Boolean.valueOf(!jxd0Var.get().booleanValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B6 */
    public /* synthetic */ void m40670B6() {
        l51.m152919y(new Runnable() { // from class: l.f530
            @Override // java.lang.Runnable
            public final void run() {
                this.f97188a.m40781z6();
            }
        });
    }

    /* JADX INFO: renamed from: E4 */
    public static /* synthetic */ void m40675E4(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("debug_open")) {
            C4896k.m35163C3(true);
            return;
        }
        if (charSequence.equals("debug_close")) {
            C4896k.m35163C3(false);
        } else if (charSequence.equals("staging1")) {
            C4896k.m35164D3("http://m.staging1.p1staff.com/monetization/codapay/?from=");
        } else if (charSequence.equals("staging2")) {
            C4896k.m35164D3("http://m.staging2.p1staff.com/monetization/codapay/?from=");
        }
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ void m40676E5() {
        l51.m152911q(rlg.m181991b());
        o1j0.m165651y("复制token成功");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E6 */
    public /* synthetic */ void m40677E6() {
        Intent intentM51922q2 = ProfileAct.m51922q2(act(), uqb0.f180396b0.f170324a.userId(), "edit_data_button", false, true);
        intentM51922q2.putExtra("preview_type", 0);
        intentM51922q2.putExtra("REFACTOR_TAG", false);
        act().startActivity(intentM51922q2);
    }

    /* JADX INFO: renamed from: F4 */
    public static /* synthetic */ void m40678F4(Throwable th) {
    }

    /* JADX INFO: renamed from: F5 */
    public static /* synthetic */ void m40679F5(Bundle bundle) {
        if (bundle != null && SystemClock.elapsedRealtime() - TantanApp.f17902f > AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED) {
            CoreModule.m30932N().mo61509Um("recover NewMainAct");
        }
        g9r.m129599b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F6 */
    public /* synthetic */ void m40680F6() {
        Intent intentM51922q2 = ProfileAct.m51922q2(act(), uqb0.f180396b0.f170324a.userId(), "edit_data_button", false, true);
        intentM51922q2.putExtra("preview_type", 0);
        intentM51922q2.putExtra("REFACTOR_TAG", true);
        act().startActivity(intentM51922q2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G6 */
    public /* synthetic */ void m40683G6() {
        this.act.startActivity(o2c.m165711i(act(), "test"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H6 */
    public /* synthetic */ void m40686H6() {
        nae0.m162083m(this, Uri.parse("tantanapp://jumpToMarket?iosLink=xxx&original=test&apkName=com.p1.mobile.putong&&fallback=https%3A%2F%2Ftantanapp.com%2F&appType=tantan"));
    }

    /* JADX INFO: renamed from: I5 */
    public static /* synthetic */ void m40688I5(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("刷新接口")) {
            CoreModule.f18264c.f20391h1.m166319k3();
        } else if (charSequence.equals("本地添加一个banner")) {
            CoreModule.f18264c.f20391h1.m166321m3();
        } else if (charSequence.equals("本地添加一篇文章")) {
            CoreModule.f18264c.f20391h1.m166320l3();
        }
    }

    /* JADX INFO: renamed from: K5 */
    private void m40692K5() {
        PopupWindow popupWindow = new PopupWindow();
        this.f25180o = popupWindow;
        popupWindow.setContentView(act().inflater().inflate(kec0.f125330Ae, (ViewGroup) null, false));
        this.f25180o.setInputMethodMode(1);
        this.f25180o.setWidth(0);
        this.f25180o.setHeight(0);
    }

    /* JADX INFO: renamed from: L4 */
    public static /* synthetic */ void m40693L4() {
    }

    /* JADX INFO: renamed from: L5 */
    public static void m40694L5(Context context, Intent intent) {
        intent.setClass(context, NewMainAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L6 */
    public /* synthetic */ void m40695L6() {
        duringCreated(CoreModule.f18264c.f20422r2.m158741p3("swipe")).subscribe(psd0.m173597H(new y20() { // from class: l.y430
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197409a.m40790K6((List) obj);
            }
        }, new y20() { // from class: l.z430
            @Override // p153l.y20
            public final void call(Object obj) {
                NewMainAct.m40743k5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: M5 */
    public static Intent m40697M5(Context context, NavigationIntent navigationIntent) {
        return m40699N5(context, navigationIntent, null);
    }

    /* JADX INFO: renamed from: N5 */
    public static Intent m40699N5(Context context, NavigationIntent navigationIntent, NavigationCardIntent navigationCardIntent) {
        return m40702O5(context, navigationIntent, navigationCardIntent, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N6 */
    public /* synthetic */ void m40700N6() {
        duringCreated(CoreModule.f18264c.f20422r2.m158741p3("message")).subscribe(psd0.m173597H(new y20() { // from class: l.c530
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f79760a.m40793M6((List) obj);
            }
        }, new y20() { // from class: l.d530
            @Override // p153l.y20
            public final void call(Object obj) {
                NewMainAct.m40678F4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O5 */
    public static Intent m40702O5(Context context, NavigationIntent navigationIntent, NavigationCardIntent navigationCardIntent, Map<String, String> map) {
        return m40704P5(context, navigationIntent, navigationCardIntent, map, -1L);
    }

    /* JADX INFO: renamed from: P4 */
    public static /* synthetic */ void m40703P4() {
        String str = "is_fake_avatar_query_" + CoreModule.m30929H().userId();
        Boolean bool = Boolean.FALSE;
        new jxd0(str, bool).put(bool);
    }

    /* JADX INFO: renamed from: P5 */
    public static Intent m40704P5(Context context, NavigationIntent navigationIntent, NavigationCardIntent navigationCardIntent, Map<String, String> map, long j) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        if (NullChecker.m82486a(navigationIntent)) {
            intent.putExtra("extra_navigation_to_tenum", navigationIntent);
        }
        if (NullChecker.m82486a(navigationCardIntent)) {
            intent.putExtra("extra_navigation_card_to", navigationCardIntent);
        }
        if (j > 0) {
            intent.putExtra("extra_heartbeat_expire_time", j);
        }
        if (TEnum.equals(navigationIntent, "moment")) {
            return null;
        }
        if (NullChecker.m82486a(map) && map.size() > 0) {
            intent.putExtra("extra_param_2", new HashMap(map));
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P6 */
    public /* synthetic */ void m40705P6() {
        vd0.m200895H(this).m200902O();
    }

    /* JADX INFO: renamed from: Q5 */
    public static Intent m40707Q5(Context context, NavigationIntent navigationIntent) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        if (NullChecker.m82486a(navigationIntent)) {
            intent.putExtra("extra_navigation_to_tenum", navigationIntent);
            intent.putExtra("extra_scroll_to_setting_bottom", true);
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q6 */
    public /* synthetic */ void m40708Q6() {
        new tk5.C20336a(this.act).m191529k(String.format("完善资料，认识更多理想%s", m40806a6(false))).m191528j("丰富的资料更受欢迎，同时可向你推荐更多符合你的理想型的人").m191524f("https://auto.tancdn.com/v1/raw/e2aa538c-be50-4e82-94af-5ed7d02c0a8b14.webp").m191521c(new View.OnClickListener() { // from class: l.s430
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166152a.m40795O6(view);
            }
        }).m191519a().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R6 */
    public /* synthetic */ void m40710R6() {
        xwa.m213304D(this.act, Uri.parse("tantan://profile/edit?mode=dating&from=from_ideal_type_mine_tab_guide"));
    }

    /* JADX INFO: renamed from: S5 */
    public static Intent m40712S5(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        intent.putExtra("extra_to_caption", z);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S6 */
    public /* synthetic */ void m40713S6() {
        xwa.m213304D(this.act, Uri.parse("tantan://moment/detail?uid=-1&mid=3434451013413637115&web=1"));
    }

    /* JADX INFO: renamed from: T5 */
    public static Intent m40715T5(Context context, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.addFlags(268468224);
        intent.putExtra("EXTRA_SHOW_TUTORIAL", z);
        intent.putExtra("extra_show_secret_crush_introduction", z2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T6 */
    public /* synthetic */ void m40716T6() {
        Act act = this.act;
        act.startActivity(LoveLetterAct.m40549a2(act));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U6 */
    public /* synthetic */ void m40718U6() {
        lhl lhlVar = lhl.INSTANCE;
        lhlVar.m154227t(!lhlVar.m154213f());
        l51.m152892L(this, SplashProxyAct.class);
    }

    /* JADX INFO: renamed from: V5 */
    private boolean m40720V5(MotionEvent motionEvent, boolean z) {
        PutongFrag putongFragM41428q6 = ((C8247a) this.f25187h).m41428q6();
        if (!(putongFragM41428q6 instanceof HomeLayoutFrag)) {
            if (putongFragM41428q6 instanceof NewNewHomeFrag) {
                return ((NewNewHomeFrag) putongFragM41428q6).mo30632D4(motionEvent, z);
            }
            return false;
        }
        PutongFrag putongFragM39504V4 = ((HomeLayoutFrag) putongFragM41428q6).m39504V4();
        if (putongFragM39504V4 instanceof NewNewHomeFrag) {
            return putongFragM39504V4.mo30632D4(motionEvent, z);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V6 */
    public /* synthetic */ void m40721V6() {
        lhl lhlVar = lhl.INSTANCE;
        lhlVar.m154228u(!lhlVar.m154214g());
        l51.m152892L(this, SplashProxyAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W6 */
    public /* synthetic */ void m40723W6() {
        if (CoreModule.f18264c.f20351U != null) {
            l9c.m153394o().m153404j();
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC8241a(), 500L);
    }

    /* JADX INFO: renamed from: Z6 */
    public static Intent m40727Z6(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.putExtra(str, str2);
        return intent;
    }

    /* JADX INFO: renamed from: a5 */
    public static /* synthetic */ void m40728a5() {
        SliderData sliderDataNew_ = SliderData.new_();
        sliderDataNew_.uuid = "asldfjsiofui283sdhf9s08923jkdsjfi";
        sliderDataNew_.supplier = 0;
        sliderDataNew_.retryClose = 0;
        sliderDataNew_.delayClose = 0;
        sliderDataNew_.allowClose = 1;
        esf0.m122324e().m122344v(sliderDataNew_);
    }

    /* JADX INFO: renamed from: a7 */
    public static Intent m40729a7(Context context, String str, int i, int i2, boolean z) {
        Intent intentM40731b7 = m40731b7(context, str, i, z);
        intentM40731b7.putExtra("extra_message_push_type", i2);
        return intentM40731b7;
    }

    /* JADX INFO: renamed from: b7 */
    public static Intent m40731b7(Context context, String str, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.putExtra("extra_message_user_id", str);
        intent.putExtra("from", i);
        intent.putExtra("extra_to_message", true);
        intent.putExtra("media_keyboard", z);
        return intent;
    }

    /* JADX INFO: renamed from: c7 */
    public static Intent m40733c7(Context context, NavigationIntent navigationIntent, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        if (NullChecker.m82486a(navigationIntent)) {
            intent.putExtra("extra_navigation_to_tenum", navigationIntent);
        }
        intent.putExtra(str, str2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e4 */
    public /* synthetic */ void m40735e4() {
        uqb0.f180393Y.m159274k().subscribe(psd0.m173596G(new y20() { // from class: l.w430
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f187224a.m40784D6((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: e5 */
    public static /* synthetic */ void m40736e5() {
        CoreModule.f18264c.f20381e0.f89303p2.put("");
        CoreModule.f18264c.f20381e0.f89296o2.put(0);
    }

    /* JADX INFO: renamed from: f5 */
    public static /* synthetic */ void m40737f5() {
        SliderData sliderDataNew_ = SliderData.new_();
        sliderDataNew_.uuid = "asldfjsiofui283sdhf9s08923jkdsjfi";
        sliderDataNew_.supplier = 0;
        sliderDataNew_.retryClose = 2;
        sliderDataNew_.delayClose = 5;
        sliderDataNew_.allowClose = 0;
        esf0.m122324e().m122344v(sliderDataNew_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m40739h4(C4470c c4470c) {
        if (c4470c == C4470c.f16271m) {
            m40797U5();
        }
    }

    /* JADX INFO: renamed from: k5 */
    public static /* synthetic */ void m40743k5(Throwable th) {
    }

    /* JADX INFO: renamed from: l6 */
    public static Intent m40746l6(Context context, IntentParams intentParams) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.putExtra("extra_navigation_to_tenum", NavigationIntent.get("live"));
        intent.putExtra("main_jump_live_tag", intentParams);
        intent.putExtra("main_jump_live_has_params", true);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m6 */
    public /* synthetic */ void m40749m6() {
        dialog().m21535f0(new String[]{"debug_open", "debug_close", "staging1", "staging2"}).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.a530
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                NewMainAct.m40675E4(dialog, view, i, charSequence);
            }
        }).m21567z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n6 */
    public /* synthetic */ void m40752n6() {
        dialog().m21535f0(new String[]{"open", "close", "上传数据"}).m21536g0(new C8242b()).m21567z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o6 */
    public /* synthetic */ void m40755o6() {
        dialog().m21535f0(new String[]{"刷新接口", "本地添加一个banner", "本地添加一篇文章"}).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.e530
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                NewMainAct.m40688I5(dialog, view, i, charSequence);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: p4 */
    public static /* synthetic */ void m40756p4() {
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ void m40757p5() {
        if (gra.m131606N3()) {
            ExpandedCardStyleHelper.m39092i();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p6 */
    public /* synthetic */ void m40758p6() {
        a0g.m95363S(this.act, "netPictureDlg");
    }

    /* JADX INFO: renamed from: q7 */
    public static Intent m40761q7(Context context) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        intent.putExtra("extra_to_conversation", true);
        return intent;
    }

    /* JADX INFO: renamed from: r7 */
    public static Intent m40764r7(Context context) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        intent.putExtra("navigation_to_picks", true);
        return intent;
    }

    /* JADX INFO: renamed from: s5 */
    public static /* synthetic */ void m40766s5() {
    }

    /* JADX INFO: renamed from: u5 */
    public static /* synthetic */ void m40770u5() {
        jxd0 jxd0Var = u1z.f177145j;
        Boolean bool = Boolean.FALSE;
        jxd0Var.put(bool);
        u1z.f177146k.put(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z6 */
    public /* synthetic */ void m40781z6() {
        String json = CoreModule.f18264c.f20381e0.m116593na().toJson();
        for (int i = 0; i < 10000; i++) {
            try {
                this.f25182q.add(User.JSON_ADAPTER.parse(json));
            } catch (IOException e) {
                CrashHelper.m82479c(e);
                iig0.m140070a(e);
                return;
            }
        }
        o1j0.m165636j("debugUserList.size=" + this.f25182q.size());
    }

    /* JADX INFO: renamed from: A6 */
    public final /* synthetic */ void m40782A6(Fragment fragment) {
        f5g.m124131i(this.act, (PutongFrag) fragment, PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: C6 */
    public final /* synthetic */ void m40783C6(final Fragment fragment) {
        AppealInfo appealInfo = new AppealInfo();
        appealInfo.appeal_count = 0;
        appealInfo.status = OMSSwipeMoment.before;
        wxf.m208408e().m208410g(this, new Runnable() { // from class: l.x430
            @Override // java.lang.Runnable
            public final void run() {
                this.f192333a.m40782A6(fragment);
            }
        }, appealInfo);
    }

    /* JADX INFO: renamed from: D6 */
    public final /* synthetic */ void m40784D6(String str) {
        new Dialog.C4460e(this).m21503F("curMD5:" + uqb0.f180393Y.f17817h.get() + "\nData:" + str).m21566z().show();
    }

    @Override // p153l.w1j0
    /* JADX INFO: renamed from: G */
    public boolean mo37586G() {
        return !((C8247a) this.f25187h).m41289I7(TabName.Me);
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m40785G3() {
        dialog().m21535f0(new String[]{"start", "vip商品查询", "探探币查询", "boost"}).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.r430
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f161139a.m40835t6(dialog, view, i, charSequence);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m40786I3() {
        qtk.m177993Q0(this.act, CoreModule.f18264c.f20381e0.m116600p9().picture(0).url, new x20() { // from class: l.t430
            @Override // p153l.x20
            public final void call() {
                NewMainAct.m40766s5();
            }
        });
    }

    /* JADX INFO: renamed from: I6 */
    public final /* synthetic */ void m40787I6(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("右滑无配对引导")) {
            DatingGuideData datingGuideDataNew_ = DatingGuideData.new_();
            datingGuideDataNew_.titles.add(String.format(Locale.getDefault(), "刚刚看过的%d个%s更想了解你的兴趣爱好", Integer.valueOf(CoreModule.f18264c.f20405m0.f20208y0), CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "男生" : "女生"));
            datingGuideDataNew_.subTitles.add("添加生活照展示你的兴趣爱好，更容易配对");
            datingGuideDataNew_.button = "立即添加";
            datingGuideDataNew_.pageId = "p_add_lifestyle_guidance";
            datingGuideDataNew_.deeplink = "tantan://profile/edit?mode=guidePicAndTag&from=right_swipe_add_lifestyle";
            datingGuideDataNew_.pictures.add(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "https://auto.tancdn.com/v1/raw/8da6f26f-c9b6-440e-9bbc-57f1a124a66f14.webp" : "https://auto.tancdn.com/v1/raw/484a6490-eca3-4af1-bf18-0b43971e70c114.webp");
            datingGuideDataNew_.buttonId = "e_add_lifestyle";
            new b9c.C15951b(this.act).m103090c(datingGuideDataNew_).m103089b("right_swipe_no_match").m103088a().show();
            return;
        }
        if (charSequence.equals("连续左滑引导")) {
            DatingGuideData datingGuideDataNew_2 = DatingGuideData.new_();
            datingGuideDataNew_2.titles.add("丰富个人资料\n为你推荐更多合适的人");
            datingGuideDataNew_2.subTitles.add("个人资料越完善，匹配越精准");
            datingGuideDataNew_2.button = "立即完善";
            datingGuideDataNew_2.deeplink = "tantan://profile/edit?mode=dating&from=left_swipe_complete_profile";
            datingGuideDataNew_2.pageId = "p_left_swipe_complete_profile";
            datingGuideDataNew_2.pictures.add("https://auto.tancdn.com/v1/raw/4bb88ee6-8f5e-47fe-9ff3-2d2affccb71914.webp");
            if (gra.m131778z()) {
                datingGuideDataNew_2.pictures = jyb.m147482M("https://auto.tancdn.com/v1/images/eyJpZCI6IkxNM042TTU3VTUyNkY2MlpaTEY3TUw1UVNGVklOVjE0IiwidyI6NDIwLCJoIjozMzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1ODUzMjgzMTUyNjkxMzN9.png");
            }
            datingGuideDataNew_2.buttonId = "e_complete_profile";
            new b9c.C15951b(act()).m103090c(datingGuideDataNew_2).m103088a().show();
            return;
        }
        if (charSequence.equals("老用户引导给照片加标签")) {
            DatingGuideData datingGuideDataNew_3 = DatingGuideData.new_();
            datingGuideDataNew_3.titles.add("为照片添加标签，展示你的精彩生活，获得更多喜欢");
            datingGuideDataNew_3.button = "立即添加";
            datingGuideDataNew_3.deeplink = "tantan://profile/edit?mode=picMatchTag";
            datingGuideDataNew_3.pageId = "p_add_tag_to_photo";
            datingGuideDataNew_3.pictures.add("https://auto.tancdn.com/v1/raw/3a12313d-44a8-44b4-8f6d-402fbe4559a714.webp");
            datingGuideDataNew_3.buttonId = "e_add_tag_to_photo";
            new b9c.C15951b(act()).m103090c(datingGuideDataNew_3).m103088a().show();
            return;
        }
        if (charSequence.equals("老用户引导给旧标签配图")) {
            DatingGuideData datingGuideDataNew_4 = DatingGuideData.new_();
            datingGuideDataNew_4.titles.add("为你的标签添加生活照");
            datingGuideDataNew_4.subTitles.add("展示你的独特亮点，遇见兴趣相投的人，获得更多配对");
            datingGuideDataNew_4.button = "立即添加";
            datingGuideDataNew_4.deeplink = "tantan://profile/edit?mode=tagMatchPic";
            datingGuideDataNew_4.pageId = "p_add_photo_to_tag";
            datingGuideDataNew_4.pictures.add("https://auto.tancdn.com/v1/raw/30f447dd-3551-470b-b120-7117032e364714.webp");
            datingGuideDataNew_4.buttonId = "e_add_photo_to_tag";
            new b9c.C15951b(act()).m103090c(datingGuideDataNew_4).m103088a().show();
            return;
        }
        if (charSequence.equals("收到喜欢很少引导上传生活照")) {
            DatingGuideData datingGuideDataNew_5 = DatingGuideData.new_();
            datingGuideDataNew_5.titles.add("19位女生看过你的资料");
            datingGuideDataNew_5.subTitles.add("她们想深入了解你的兴趣爱好，添加生活照，展示你的兴趣，收获更多喜欢");
            datingGuideDataNew_5.button = "立即添加";
            datingGuideDataNew_5.buttonId = "e_add_lifestyle";
            datingGuideDataNew_5.pageId = "p_add_lifestyle_guidance";
            datingGuideDataNew_5.deeplink = "tantan://profile/edit?mode=guidePicAndTag&from=right_swipe_add_lifestyle";
            datingGuideDataNew_5.pictures.add("https://auto.tancdn.com/v1/raw/c9488f16-cae9-48fa-9558-4e8e5f0552dd14.webp");
            new b9c.C15951b(act()).m103090c(datingGuideDataNew_5).m103088a().show();
        }
    }

    /* JADX INFO: renamed from: J6 */
    public final /* synthetic */ void m40788J6() {
        dialog().m21535f0(new String[]{"右滑无配对引导", "连续左滑引导", "老用户引导给照片加标签", "老用户引导给旧标签配图", "收到喜欢很少引导上传生活照"}).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.b530
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f75019a.m40787I6(dialog, view, i, charSequence);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m40789K3() {
        tx0.m193419I(act(), false, 5.0f, "test");
    }

    /* JADX INFO: renamed from: K6 */
    public final /* synthetic */ void m40790K6(List list) {
        if (jyb.m147479J(list) || act().isDialogShowing()) {
            return;
        }
        bem bemVar = new bem(act());
        bemVar.m103733U(list, "swipe");
        bemVar.show();
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m40791L3() {
        act().dialog().m21503F("活跃天数: " + tx0.m193439o().f176474d.get() + "\n当天打开次数: " + tx0.m193439o().f176473c.get() + "\n当天打开时间（秒）: " + tx0.m193439o().f176472b.get() + "\n当天接受消息: " + C8509a.m46746j().f30156k.get() + "\n当天发送消息: " + C8509a.m46746j().f30157l.get() + "\n当前语言是否满足入组条件：false").m21567z0();
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m40792M3() {
        PermissionHelper.m81065c().m81083r("android.permission.CAMERA").m81088w(false).m81086u(true).m81075j(false).m81080o(new x20() { // from class: l.u430
            @Override // p153l.x20
            public final void call() {
                this.f177429a.m40840w6();
            }
        }).m81074i(this.act);
    }

    /* JADX INFO: renamed from: M6 */
    public final /* synthetic */ void m40793M6(List list) {
        if (jyb.m147479J(list) || act().isDialogShowing()) {
            return;
        }
        bem bemVar = new bem(act());
        bemVar.m103733U(list, "conversation");
        bemVar.show();
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m40794N3() {
        C13262b.m80531a(this);
    }

    /* JADX INFO: renamed from: O6 */
    public final /* synthetic */ void m40795O6(View view) {
        ou90.m169278l(this.act);
    }

    /* JADX INFO: renamed from: R5 */
    public void m40796R5(TabName tabName) {
        m40936v3(tabName, false);
    }

    /* JADX INFO: renamed from: U5 */
    public void m40797U5() {
        if (NullChecker.m82486a(this.f25180o) && this.f25180o.isShowing()) {
            this.f25180o.dismiss();
            this.f25180o = null;
        }
    }

    /* JADX INFO: renamed from: W5 */
    public C22421c<Boolean> m40798W5() {
        return ((C8247a) this.f25187h).f25238E;
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m40799X3() {
        new bm5(this).show();
    }

    /* JADX INFO: renamed from: X5 */
    public int m40800X5() {
        Resources resources;
        int identifier;
        this.act.setNavigationBarColor(0);
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        if (viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (viewGroup.getChildAt(i).getId() != -1 && "navigationBarBackground".equals(getResources().getResourceEntryName(viewGroup.getChildAt(i).getId()))) {
                    if (gbl.m129800c(this.act) && (identifier = (resources = act().getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
                        return resources.getDimensionPixelSize(identifier);
                    }
                    return 0;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: X6 */
    public final /* synthetic */ void m40801X6(int i) {
        m40800X5();
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m40802Y3() {
        try {
            File file = new File(act().getFilesDir(), "effectCache");
            if (file.exists()) {
                oki.m168024l(file);
                o1j0.m165651y("直播特效删除成功");
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: Y5 */
    public C8247a.v m40803Y5() {
        return ((C8247a) this.f25187h).m148845d1();
    }

    /* JADX INFO: renamed from: Y6 */
    public final Frag m40804Y6() {
        TabName tabNameM144964h = ji30.m144964h();
        if (tabNameM144964h != null) {
            return ((C8247a) this.f25187h).m41440t6(tabNameM144964h);
        }
        return null;
    }

    /* JADX INFO: renamed from: Z5 */
    public C8247a m40805Z5() {
        return (C8247a) this.f25187h;
    }

    /* JADX INFO: renamed from: a6 */
    public final String m40806a6(boolean z) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (TEnum.equals(userM116600p9.settings.getLookingFor(), LookingFor.get(userM116600p9.isFemale() ? "female" : "male"))) {
            if (z) {
                return userM116600p9.isFemale() ? "她们" : "他们";
            }
            return userM116600p9.isFemale() ? "女生" : "男生";
        }
        if (z) {
            return userM116600p9.isFemale() ? "他们" : "她们";
        }
        return userM116600p9.isFemale() ? "男生" : "女生";
    }

    /* JADX INFO: renamed from: b6 */
    public View m40807b6(TabName tabName) {
        P p = this.f25187h;
        if (p instanceof C8247a) {
            return ((C8247a) p).m41449v6(tabName);
        }
        return null;
    }

    /* JADX INFO: renamed from: c6 */
    public pf60<String, String> m40808c6() {
        PutongFrag putongFragM41428q6 = ((C8247a) this.f25187h).m41428q6();
        if (CoreModule.m30934Q().isLiveSquareHome(putongFragM41428q6)) {
            return jyb.m147494Y(CoreModule.m30934Q().getTopShowingPageId(putongFragM41428q6), "");
        }
        if (CoreModule.m30932N().isPhotoAlbumFrag(putongFragM41428q6)) {
            return jyb.m147494Y(CoreModule.m30932N().getTopShowingPageId(putongFragM41428q6), "");
        }
        if (putongFragM41428q6 instanceof ConversationsTabFrag) {
            return ((ConversationsTabFrag) putongFragM41428q6).m42623G5();
        }
        if (putongFragM41428q6 instanceof ProfileFrag) {
            return jyb.m147494Y(OMSDialogPositon.p_navigation_view, "");
        }
        return NullChecker.m82486a(putongFragM41428q6) ? jyb.m147494Y(putongFragM41428q6.pageId(), "") : jyb.m147494Y("", "");
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m40809d4() {
        new dyf(this).show();
    }

    /* JADX INFO: renamed from: d6 */
    public NewMainViewModel m40810d6() {
        return this.f25178m;
    }

    /* JADX INFO: renamed from: d7 */
    public void m40811d7() {
        this.f25181p = false;
    }

    @Override // com.p051p1.mobile.putong.core.newui.main.NewMainBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        ArrayList<pf60<String, x20>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(jyb.m147494Y("try add 10000 user in memory", new x20() { // from class: l.s230
            @Override // p153l.x20
            public final void call() {
                this.f165858a.m40670B6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("try jump to market", new x20() { // from class: l.u230
            @Override // p153l.x20
            public final void call() {
                this.f177176a.m40686H6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("showAiAlbumDlg", new x20() { // from class: l.g330
            @Override // p153l.x20
            public final void call() {
                this.f101942a.m40705P6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Delete core database and kill self", new x20() { // from class: l.s330
            @Override // p153l.x20
            public final void call() {
                this.f165972a.m40723W6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("coda debug 测试", new x20() { // from class: l.e430
            @Override // p153l.x20
            public final void call() {
                this.f92049a.m40749m6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("shadow string", new x20() { // from class: l.h430
            @Override // p153l.x20
            public final void call() {
                this.f107750a.m40752n6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("活动中心", new x20() { // from class: l.i430
            @Override // p153l.x20
            public final void call() {
                this.f112827a.m40755o6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("下载动态表情", new x20() { // from class: l.j430
            @Override // p153l.x20
            public final void call() {
                bze.m107153h().m107154e();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("展示头像审核弹窗", new x20() { // from class: l.l430
            @Override // p153l.x20
            public final void call() {
                this.f129927a.m40758p6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("头像审核弹窗商业策略请求缓存清除", new x20() { // from class: l.m430
            @Override // p153l.x20
            public final void call() {
                NewMainAct.m40703P4();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("sku流程优化", new x20() { // from class: l.d330
            @Override // p153l.x20
            public final void call() {
                this.f84848a.m40785G3();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("是否是当日登录用户：" + CoreModule.m30929H().mo29154Jr(), new x20() { // from class: l.o330
            @Override // p153l.x20
            public final void call() {
                NewMainAct.m40693L4();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("change title !!!!!", new x20() { // from class: l.z330
            @Override // p153l.x20
            public final void call() {
                this.f202777a.m40837u6();
            }
        }));
        final Fragment fragmentM2558i0 = fragmentManager().m2558i0(((C8247a) this.f25187h).m148843b1().toString());
        if (fragmentM2558i0 instanceof NewNewHomeFrag) {
            arrayListDebugItems.addAll(((NewNewHomeFrag) fragmentM2558i0).mo30631C4());
        } else if (fragmentM2558i0 instanceof HomeLayoutFrag) {
            arrayListDebugItems.addAll(((HomeLayoutFrag) fragmentM2558i0).mo30631C4());
        } else if (fragmentM2558i0 instanceof PutongFrag) {
            Collection<? extends pf60<String, x20>> collectionMo30631C4 = ((PutongFrag) fragmentM2558i0).mo30631C4();
            if (!jyb.m147479J(collectionMo30631C4)) {
                arrayListDebugItems.addAll(collectionMo30631C4);
            }
        }
        r130.m179327A(arrayListDebugItems, this);
        arrayListDebugItems.add(jyb.m147494Y("good2fake dialog", new x20() { // from class: l.k430
            @Override // p153l.x20
            public final void call() {
                this.f123825a.m40786I3();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("show screen size ", new x20() { // from class: l.v430
            @Override // p153l.x20
            public final void call() {
                o1j0.m165651y("【" + vnb.m201957q1() + Constants.SEPARATOR_COMMA + vnb.m201956p1() + "】");
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("tantan star rank", new x20() { // from class: l.g530
            @Override // p153l.x20
            public final void call() {
                this.f102278a.m40839v6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("tantan appstore rank guide", new x20() { // from class: l.o530
            @Override // p153l.x20
            public final void call() {
                this.f145031a.m40789K3();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("show app store guide status", new x20() { // from class: l.p530
            @Override // p153l.x20
            public final void call() {
                this.f150591a.m40791L3();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("qr_scan", new x20() { // from class: l.q530
            @Override // p153l.x20
            public final void call() {
                this.f155658a.m40792M3();
            }
        }));
        arrayListDebugItems.add(new pf60<>("进入照相页面", new x20() { // from class: l.t230
            @Override // p153l.x20
            public final void call() {
                this.f171712a.m40842x6();
            }
        }));
        arrayListDebugItems.add(new pf60<>("进入RemoteConfig信息页", new x20() { // from class: l.v230
            @Override // p153l.x20
            public final void call() {
                this.f182066a.m40794N3();
            }
        }));
        arrayListDebugItems.add(new pf60<>("触发升级下载弹框", new x20() { // from class: l.w230
            @Override // p153l.x20
            public final void call() {
                this.f186867a.m40843y6();
            }
        }));
        arrayListDebugItems.add(new pf60<>("实拍气泡引导" + f25176r.get(), new x20() { // from class: l.x230
            @Override // p153l.x20
            public final void call() {
                NewMainAct.m40668B4();
            }
        }));
        arrayListDebugItems.add(new pf60<>("测试读取本地token", new x20() { // from class: l.y230
            @Override // p153l.x20
            public final void call() {
                esf0.m122324e().m122332i();
            }
        }));
        arrayListDebugItems.add(new pf60<>("测试写入本地token：非空", new x20() { // from class: l.z230
            @Override // p153l.x20
            public final void call() {
                NewMainAct.m40728a5();
            }
        }));
        arrayListDebugItems.add(new pf60<>("测试写入本地token：非空", new x20() { // from class: l.a330
            @Override // p153l.x20
            public final void call() {
                NewMainAct.m40737f5();
            }
        }));
        arrayListDebugItems.add(new pf60<>("测试写入本地token：空", new x20() { // from class: l.b330
            @Override // p153l.x20
            public final void call() {
                esf0.m122324e().m122344v(null);
            }
        }));
        arrayListDebugItems.add(new pf60<>("实拍Tips引导" + u1z.f177145j.get(), new x20() { // from class: l.c330
            @Override // p153l.x20
            public final void call() {
                NewMainAct.m40770u5();
            }
        }));
        arrayListDebugItems.add(new pf60<>("隐私协议", new x20() { // from class: l.e330
            @Override // p153l.x20
            public final void call() {
                this.f91922a.m40799X3();
            }
        }));
        arrayListDebugItems.add(new pf60<>("清除直播间特效文件", new x20() { // from class: l.f330
            @Override // p153l.x20
            public final void call() {
                this.f96947a.m40802Y3();
            }
        }));
        arrayListDebugItems.add(new pf60<>("当前运行环境：".concat(cu3.m112649a(App.f16088e) ? "64Bit" : "32Bit"), new x20() { // from class: l.h330
            @Override // p153l.x20
            public final void call() {
                NewMainAct.m40756p4();
            }
        }));
        arrayListDebugItems.add(new pf60<>("firebasetoken", new x20() { // from class: l.i330
            @Override // p153l.x20
            public final void call() {
                NewMainAct.m40676E5();
            }
        }));
        arrayListDebugItems.add(new pf60<>("firebase安装ID", new x20() { // from class: l.j330
            @Override // p153l.x20
            public final void call() {
                rlg.m181990a();
            }
        }));
        arrayListDebugItems.add(new pf60<>("网图Fake弹窗", new x20() { // from class: l.k330
            @Override // p153l.x20
            public final void call() {
                this.f123678a.m40783C6(fragmentM2558i0);
            }
        }));
        arrayListDebugItems.add(new pf60<>("网图Fake协议弹窗", new x20() { // from class: l.l330
            @Override // p153l.x20
            public final void call() {
                this.f129837a.m40809d4();
            }
        }));
        arrayListDebugItems.add(new pf60<>("认证弹框清理", new x20() { // from class: l.m330
            @Override // p153l.x20
            public final void call() {
                NewMainAct.m40736e5();
            }
        }));
        arrayListDebugItems.add(new pf60<>("asset数据", new x20() { // from class: l.n330
            @Override // p153l.x20
            public final void call() {
                this.f139932a.m40735e4();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("弹出先发like弹窗", new x20() { // from class: l.p330
            @Override // p153l.x20
            public final void call() {
                wgx.m206283A().m206314N(CoreModule.m30930K().me_().f56859id);
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Profile Edit Online", new x20() { // from class: l.q330
            @Override // p153l.x20
            public final void call() {
                this.f155421a.m40677E6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Profile Edit Refactor", new x20() { // from class: l.r330
            @Override // p153l.x20
            public final void call() {
                this.f160995a.m40680F6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Profile Picks", new x20() { // from class: l.t330
            @Override // p153l.x20
            public final void call() {
                this.f171892a.m40683G6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Profile Picks Entry Notify", new x20() { // from class: l.u330
            @Override // p153l.x20
            public final void call() {
                CoreModule.m30932N().mo61565p6(true);
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Dating MyTab Guide", new x20() { // from class: l.v330
            @Override // p153l.x20
            public final void call() {
                CoreModule.f18264c.f20422r2.m158738m3();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("Profile Guide", new x20() { // from class: l.w330
            @Override // p153l.x20
            public final void call() {
                this.f187072a.m40788J6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("ideal guide dialog in SWIPE", new x20() { // from class: l.x330
            @Override // p153l.x20
            public final void call() {
                this.f192217a.m40695L6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("ideal guide dialog in Conversation", new x20() { // from class: l.y330
            @Override // p153l.x20
            public final void call() {
                this.f197300a.m40700N6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("ideal profile guide dialog", new x20() { // from class: l.a430
            @Override // p153l.x20
            public final void call() {
                this.f68350a.m40708Q6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("ideal profile mine tab guide", new x20() { // from class: l.b430
            @Override // p153l.x20
            public final void call() {
                this.f74857a.m40710R6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("deeplink: moment detail", new x20() { // from class: l.c430
            @Override // p153l.x20
            public final void call() {
                this.f79661a.m40713S6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("love letter act", new x20() { // from class: l.d430
            @Override // p153l.x20
            public final void call() {
                this.f84997a.m40716T6();
            }
        }));
        StringBuilder sb = new StringBuilder("web host change:");
        lhl lhlVar = lhl.INSTANCE;
        sb.append(lhlVar.m154213f());
        arrayListDebugItems.add(jyb.m147494Y(sb.toString(), new x20() { // from class: l.f430
            @Override // p153l.x20
            public final void call() {
                this.f97048a.m40718U6();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("web host change firebase(web host change是false时才会生效):" + lhlVar.m154214g(), new x20() { // from class: l.g430
            @Override // p153l.x20
            public final void call() {
                this.f102130a.m40721V6();
            }
        }));
        return arrayListDebugItems;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.core.LauncherAct, com.p051p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return m40720V5(motionEvent, false) || super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e6 */
    public void m40812e6() {
        ((C8247a) this.f25187h).m41457x6();
    }

    @Deprecated
    /* JADX INFO: renamed from: e7 */
    public void m40813e7(TabName tabName, boolean z) {
        ((C8247a) this.f25187h).m41456w9(tabName, z);
    }

    @Override // com.p051p1.mobile.putong.core.newui.main.NewMainBaseAct
    /* JADX INFO: renamed from: f6, reason: merged with bridge method [inline-methods] */
    public C8247a mo40844z3() {
        this.f25178m = new NewMainViewModel(act());
        C8247a c8247a = new C8247a(this);
        c8247a.mo52715C(this.f25178m);
        return c8247a;
    }

    /* JADX INFO: renamed from: f7 */
    public void m40815f7(boolean z) {
        ((C8247a) this.f25187h).m41459x9(z);
    }

    /* JADX INFO: renamed from: g6 */
    public boolean m40816g6() {
        return this.f25181p;
    }

    /* JADX INFO: renamed from: g7 */
    public void m40817g7() {
        ((C8247a) this.f25187h).m41463y9();
    }

    @Override // com.p051p1.mobile.android.app.Act, p153l.e3m
    public String getPopLifeName() {
        Frag fragM40804Y6 = m40804Y6();
        return fragM40804Y6 != null ? fragM40804Y6.getPopLifeName() : super.getPopLifeName();
    }

    /* JADX INFO: renamed from: h6 */
    public boolean m40818h6() {
        return m40820i6(TabName.Card);
    }

    /* JADX INFO: renamed from: h7 */
    public void m40819h7(boolean z) {
        ((C8247a) this.f25187h).f25238E.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: i6 */
    public boolean m40820i6(TabName tabName) {
        return ((C8247a) this.f25187h).m41289I7(tabName);
    }

    /* JADX INFO: renamed from: i7 */
    public void m40821i7(Boolean bool) {
        ((C8247a) this.f25187h).m41468z9(bool);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        yhi0.m215967a("NewMainAct inflateView");
        LaunchStep launchStep = LaunchStep.MainActInflate;
        uqi.m197339f(launchStep);
        View viewM41282G7 = ((C8247a) this.f25187h).m41282G7(layoutInflater, viewGroup);
        uqi.m197337d(launchStep);
        if (!CoreModule.m30932N().mo61568qg()) {
            yhi0.m215968b();
            return viewM41282G7;
        }
        act().setUpKeyboardDetectorLayout(new View(act()), getWindow().getDecorView(), new z20() { // from class: l.o430
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                NewMainAct.f25177s.onNext(new pf60<>((Boolean) obj, (Integer) obj2));
            }
        });
        if (ln7.m154967b()) {
            m40692K5();
        }
        yhi0.m215968b();
        return viewM41282G7;
    }

    @Override // com.p051p1.mobile.putong.core.newui.main.NewMainBaseAct, com.p051p1.mobile.putong.core.LauncherAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        yhi0.m215967a("NewMainAct initDataOnCreate");
        uqi.m197337d(LaunchStep.MainStartWait);
        uqi.m197339f(LaunchStep.NewMainCreate, LaunchStep.HomeFragWait);
        super.initDataOnCreate();
        creates(new y20() { // from class: l.p430
            @Override // p153l.y20
            public final void call(Object obj) {
                NewMainAct.m40679F5((Bundle) obj);
            }
        }, new x20() { // from class: l.q430
            @Override // p153l.x20
            public final void call() {
                NewMainAct.m40757p5();
            }
        });
        yhi0.m215968b();
    }

    @Override // com.p051p1.mobile.putong.core.newui.main.NewMainBaseAct, com.p051p1.mobile.putong.core.LauncherAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        yhi0.m215967a("NewMainAct initSubscription");
        super.initSubscription();
        if (CoreModule.m30932N().mo61568qg() && ln7.m154967b()) {
            lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.n430
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f140165a.m40739h4((C4470c) obj);
                }
            }));
        }
        yhi0.m215968b();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return (m40820i6(TabName.Card) || m40820i6(TabName.Live)) ? false : true;
    }

    /* JADX INFO: renamed from: j6 */
    public boolean m40822j6(TabName tabName) {
        return ((C8247a) this.f25187h).m41289I7(tabName);
    }

    /* JADX INFO: renamed from: j7 */
    public Runnable m40823j7(Runnable runnable) {
        ((C8247a) this.f25187h).f25242r = runnable;
        return runnable;
    }

    /* JADX INFO: renamed from: k6 */
    public boolean m40824k6() {
        return ((C8247a) this.f25187h).m41297K7();
    }

    /* JADX INFO: renamed from: k7 */
    public void m40825k7(TabName tabName, int i) {
        ((C8247a) this.f25187h).m41264B9(tabName, i);
    }

    /* JADX INFO: renamed from: l7 */
    public void m40826l7() {
        ((C8247a) this.f25187h).f25244t.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: m7 */
    public void m40827m7(CharSequence charSequence, String str, Figure figure, String str2, double d, x20 x20Var) {
        ((C8247a) this.f25187h).m41307M9(charSequence, str, figure, str2, d, x20Var);
    }

    /* JADX INFO: renamed from: n7 */
    public void m40828n7() {
        final int iM40800X5 = m40800X5();
        l51.m152886F(this, new Runnable() { // from class: l.n530
            @Override // java.lang.Runnable
            public final void run() {
                this.f140278a.m40801X6(iM40800X5);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public boolean needMarkResume() {
        return false;
    }

    /* JADX INFO: renamed from: o7 */
    public C22421c<TabName> m40829o7() {
        return ((C8247a) this.f25187h).m41331S9();
    }

    @Override // com.p051p1.mobile.putong.core.newui.main.NewMainBaseAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == k4h.f123888a) {
            if (i2 == -1) {
                if (((C8247a) this.f25187h).m41407k9(intent.getExtras().getString("last_moment_id"))) {
                    return;
                }
            }
        } else if (i == 1012) {
            if (intent == null || intent.getExtras() == null) {
                o1j0.m165651y("打开失败，请重试");
                return;
            }
            Bundle extras = intent.getExtras();
            String string = extras.getInt("result_type") == 1 ? extras.getString("result_string") : "";
            if (TextUtils.isEmpty(string)) {
                o1j0.m165651y("打开失败，请重试");
                return;
            }
            try {
                if (!string.startsWith("tantan") && !string.startsWith("tantanapp") && !string.startsWith("tantantribe")) {
                    xwa.m213304D(act(), Uri.parse("tantanapp://webview?url=".concat(string)));
                    return;
                }
                xwa.m213304D(act(), Uri.parse(string));
                return;
            } catch (Exception unused) {
                o1j0.m165651y("打开失败，请重试");
                return;
            }
        }
        if (uqb0.f180396b0.f170324a.onActivityResultForSmartLock(i, i2, intent)) {
            return;
        }
        Fragment fragmentM2558i0 = fragmentManager().m2558i0(TabName.Msg.toString());
        if (NullChecker.m82486a(fragmentM2558i0)) {
            fragmentM2558i0.onActivityResult(i, i2, intent);
        }
        Fragment fragmentM2558i1 = fragmentManager().m2558i0(TabName.Meet.toString());
        if (NullChecker.m82486a(fragmentM2558i1)) {
            fragmentM2558i1.onActivityResult(i, i2, intent);
        }
        if (i == 4099 && i2 == -1) {
            qtk.m177983L0(act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h));
        }
        if (i == 786 && i2 == -1) {
            String stringExtra = intent.getStringExtra("from");
            ArrayList<Media> arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h);
            if ("from_intl_pet_photo".equals(stringExtra)) {
                PutongFrag putongFragM41428q6 = ((C8247a) this.f25187h).m41428q6();
                if (NullChecker.m82487b(arrayList) && !arrayList.isEmpty() && (putongFragM41428q6 instanceof HomeLayoutFrag)) {
                    PutongFrag putongFragM39504V4 = ((HomeLayoutFrag) putongFragM41428q6).m39504V4();
                    if (putongFragM39504V4 instanceof NewNewHomeFrag) {
                        ((NewNewHomeFrag) putongFragM39504V4).f22420C.m38391z5(arrayList);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (gra.m131726o2() && i == 25) {
            PutongFrag putongFragM41428q7 = ((C8247a) this.f25187h).m41428q6();
            if (putongFragM41428q7 instanceof ProfileFrag) {
                putongFragM41428q7.onActivityResult(i, i2, intent);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        t4j.m189281g("Activity AttachedToWindow");
        i4g0.m138495D("e_main_displayed", "p_suggest_users_home_view", jyb.m147494Y("displayed_time", Long.valueOf(System.currentTimeMillis() - this.f25179n)));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((C8247a) this.f25187h).m41453w6();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CoreModule.f18264c.f20381e0.f89047I1.onNext(Boolean.TRUE);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.AutoReleaseVideoAct, com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        CoreModule.m30934Q().mo68412M6().mo127331b();
        yw0.m217561d(false);
    }

    @Override // com.p051p1.mobile.android.app.Act, p153l.r1e
    public void onDialogAttachToWindow(android.app.Dialog dialog) {
        super.onDialogAttachToWindow(dialog);
        if (m40935k4()) {
            this.f25178m.m40977I();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (!NullChecker.m82486a(list) || list.size() <= 0 || !(list.get(0) instanceof Video) || new vel0(oki.m168038z(list.get(0).url)).f183806b <= Constants.ONE_MIN_IN_MILLIS) {
            CoreModule.m30932N().toCaptionPage(this.act, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list), false, null);
        } else {
            o1j0.m165634h(R$string.f19372jj);
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        bundle.setClassLoader(NewMainAct.class.getClassLoader());
        super.onRestoreInstanceState(bundle);
        ((C8247a) this.f25187h).m41411l9(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        super.onResumeFragments();
        ((C8247a) this.f25187h).m41415m9();
        Act.isActResumed = true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ((C8247a) this.f25187h).m41419n9(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Fragment fragmentM2558i0 = fragmentManager().m2558i0(TabName.Card.toString());
        if (fragmentM2558i0 instanceof NewNewHomeFrag) {
            ((NewNewHomeFrag) fragmentM2558i0).m37756b5(z);
        }
        if (CoreModule.m30932N().mo61568qg() && z && ln7.m154967b() && NullChecker.m82486a(this.f25180o) && !this.f25180o.isShowing()) {
            this.f25180o.setBackgroundDrawable(new ColorDrawable(0));
            this.f25180o.showAtLocation(this.act.getWindow().getDecorView(), 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: p7 */
    public TabName m40830p7() {
        return ((C8247a) this.f25187h).m41334T9();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        P p = this.f25187h;
        return p != 0 ? ((C8247a) p).m41448v() : super.pageId();
    }

    @Override // com.p051p1.mobile.android.app.Act, p153l.e3m
    public C22507a<vk80> popLifeObs() {
        Frag fragM40804Y6 = m40804Y6();
        return fragM40804Y6 == null ? super.popLifeObs() : fragM40804Y6.popLifeObs();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        CoreModule.f18264c.f20405m0.f20210y2 = System.currentTimeMillis();
        yhi0.m215967a("NewMainAct preCreateView");
        uqi.m197339f(LaunchStep.AsyncLayout);
        uj4.m196316a().mo136053g(this, this);
        setSwipeBackEnable(false);
        m40937y3();
        super.preCreateView(bundle);
        setTransparentStatusBar();
        yw0.m217561d(true);
        yhi0.m215968b();
    }

    /* JADX INFO: renamed from: q6 */
    public final /* synthetic */ C22421c m40831q6(List list) {
        return cjj.m110205M(this, list);
    }

    /* JADX INFO: renamed from: r6 */
    public final /* synthetic */ C22421c m40832r6(List list) {
        return cjj.m110205M(this, list);
    }

    /* JADX INFO: renamed from: s6 */
    public final /* synthetic */ C22421c m40833s6(List list) {
        return cjj.m110205M(this, list);
    }

    /* JADX INFO: renamed from: s7 */
    public void m40834s7(boolean z) {
        ((C8247a) this.f25187h).f25237D = true;
        this.f25178m.m40980J0(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        yhi0.m215967a("NewMainAct setTheme");
        LaunchStep launchStep = LaunchStep.ThemeChange;
        uqi.m197339f(launchStep);
        if (NullChecker.m82486a(getSupportActionBar())) {
            getSupportActionBar().mo102168A(0.0f);
        }
        getAppTheme().mo134831k(getWindow());
        uqi.m197337d(launchStep);
        yhi0.m215968b();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        if (m40935k4()) {
            Window window = getWindow();
            window.clearFlags(134217728);
            window.getDecorView().setSystemUiVisibility(1536);
            window.addFlags(Integer.MIN_VALUE);
            setNavigationBarColor(0);
        }
        if (NullChecker.m82486a(CoreModule.f18264c)) {
            CoreBusinessModule.m30906m0().mo122550j(this);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldWrapContentViewWithTransparentHeader() {
        return false;
    }

    /* JADX INFO: renamed from: t6 */
    public final /* synthetic */ void m40835t6(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("start")) {
            cjj.m110198F();
            return;
        }
        if (charSequence.equals("vip商品查询")) {
            CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get(ProductCategory.tttVip)).filter(new qcj() { // from class: l.h530
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).flatMap(new qcj() { // from class: l.i530
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f112996a.m40831q6((List) obj);
                }
            }).subscribe();
        } else if (charSequence.equals("探探币查询")) {
            CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get("coin")).filter(new qcj() { // from class: l.j530
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).flatMap(new qcj() { // from class: l.k530
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f123967a.m40832r6((List) obj);
                }
            }).subscribe();
        } else if (charSequence.equals("boost")) {
            CoreModule.f18264c.f20396j0.m31647y5(ProductCategory.get("boost")).filter(new qcj() { // from class: l.l530
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).flatMap(new qcj() { // from class: l.m530
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f134862a.m40833s6((List) obj);
                }
            }).subscribe();
        }
    }

    /* JADX INFO: renamed from: t7 */
    public void m40836t7() {
        ((C8247a) this.f25187h).m41261A9();
    }

    /* JADX INFO: renamed from: u6 */
    public final /* synthetic */ void m40837u6() {
        setTitle("Tantan");
    }

    /* JADX INFO: renamed from: u7 */
    public void m40838u7(boolean z) {
        ((C8247a) this.f25187h).f25237D = false;
        this.f25178m.m40988N0(z);
    }

    /* JADX INFO: renamed from: v6 */
    public final /* synthetic */ void m40839v6() {
        tx0.m193424O(act(), "test");
    }

    /* JADX INFO: renamed from: w6 */
    public final /* synthetic */ void m40840w6() {
        Act act = this.act;
        act.startActivityForResult(q9c.m175835a(act), 1012);
    }

    @Override // com.p051p1.mobile.putong.core.newui.main.NewMainBaseAct
    /* JADX INFO: renamed from: x3 */
    public String mo40841x3() {
        try {
            return getSupportFragmentManager().m2555h0(adc0.f69809A4).getTag();
        } catch (Exception unused) {
            return NewNewHomeFrag.class.getSimpleName();
        }
    }

    /* JADX INFO: renamed from: x6 */
    public final /* synthetic */ void m40842x6() {
        hxf.m137595p(this.act, OMSTemplateType.dialog);
    }

    /* JADX INFO: renamed from: y6 */
    public final /* synthetic */ void m40843y6() {
        File file = new File(f6g0.m124271b());
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                file2.delete();
            }
        }
        d1k0.m113613x(this);
    }
}
