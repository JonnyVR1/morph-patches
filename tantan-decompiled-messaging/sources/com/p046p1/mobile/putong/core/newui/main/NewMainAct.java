package com.p046p1.mobile.putong.core.newui.main;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4745k;
import com.p046p1.mobile.putong.core.data.AppealInfo;
import com.p046p1.mobile.putong.core.data.DatingGuideData;
import com.p046p1.mobile.putong.core.data.Figure;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag;
import com.p046p1.mobile.putong.core.newui.loveletter.LoveLetterAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p046p1.mobile.putong.core.newui.profile.ProfileFrag;
import com.p046p1.mobile.putong.core.p053ui.p055gp.C8346a;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.data.LookingFor;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.NavigationCardIntent;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.data.SliderData;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.remote_config.C13099b;
import com.p046p1.mobile.putong.util.launch.LaunchStep;
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
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;
import p149l.aag0;
import p149l.ark;
import p149l.b1c;
import p149l.bse0;
import p149l.cdq0;
import p149l.d30;
import p149l.dkg;
import p149l.dt3;
import p149l.e30;
import p149l.e51;
import p149l.f30;
import p149l.f6c0;
import p149l.f7r;
import p149l.f8c;
import p149l.hm7;
import p149l.hpd0;
import p149l.ht20;
import p149l.igj;
import p149l.iwf;
import p149l.j2e0;
import p149l.j760;
import p149l.k8c;
import p149l.km90;
import p149l.lbm;
import p149l.lsi0;
import p149l.lva;
import p149l.mkd0;
import p149l.mx0;
import p149l.myf;
import p149l.pc80;
import p149l.pwf;
import p149l.q8l;
import p149l.qib0;
import p149l.r3g;
import p149l.r5l0;
import p149l.rhi;
import p149l.roj0;
import p149l.rw0;
import p149l.sj5;
import p149l.tsi0;
import p149l.tvf;
import p149l.u4c0;
import p149l.upa;
import p149l.v2h;
import p149l.v7c;
import p149l.v930;
import p149l.vi4;
import p149l.vjf0;
import p149l.vwb;
import p149l.w9j;
import p149l.xsy;
import p149l.xxf0;
import p149l.y1j;
import p149l.y8i0;
import p149l.yk5;
import p149l.yni;
import p149l.zd0;
import p149l.zrj0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class NewMainAct extends NewMainBaseAct<C8096a> implements tsi0, cdq0 {

    /* JADX INFO: renamed from: r */
    public static final hpd0 f24434r = new hpd0("s_r_s_b_l", Boolean.FALSE);

    /* JADX INFO: renamed from: s */
    public static C22393b<j760<Boolean, Integer>> f24435s = C22393b.m221521b();

    /* JADX INFO: renamed from: m */
    public NewMainViewModel f24436m;

    /* JADX INFO: renamed from: n */
    public final long f24437n = System.currentTimeMillis();

    /* JADX INFO: renamed from: o */
    public PopupWindow f24438o;

    /* JADX INFO: renamed from: p */
    public boolean f24439p;

    /* JADX INFO: renamed from: q */
    public List<User> f24440q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainAct$a */
    public class RunnableC8090a implements Runnable {
        public RunnableC8090a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e51.m114740E();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainAct$b */
    public class C8091b implements Dialog.InterfaceC4311g {
        public C8091b() {
        }

        @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
        /* JADX INFO: renamed from: a */
        public void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
            if (charSequence.equals("open")) {
                bse0.m103700c();
            } else if (charSequence.equals("close")) {
                bse0.m103699b();
            } else if (charSequence.equals("上传数据")) {
                bse0.m103701d();
            }
        }
    }

    public NewMainAct() {
        y1j.m212198g("Activity Init");
        this.f24440q = new ArrayList();
    }

    /* JADX INFO: renamed from: A4 */
    public static /* synthetic */ void m39663A4() {
        hpd0 hpd0Var = f24434r;
        hpd0Var.put(Boolean.valueOf(!hpd0Var.get().booleanValue()));
    }

    /* JADX INFO: renamed from: A5 */
    public static /* synthetic */ void m39664A5() {
        e51.m114766q(dkg.m112222b());
        lsi0.m151595y("复制token成功");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A6 */
    public /* synthetic */ void m39665A6() {
        Intent intentM50738p2 = ProfileAct.m50738p2(act(), qib0.f154713b0.f139230a.userId(), "edit_data_button", false, true);
        intentM50738p2.putExtra("preview_type", 0);
        intentM50738p2.putExtra("REFACTOR_TAG", false);
        act().startActivity(intentM50738p2);
    }

    /* JADX INFO: renamed from: B5 */
    public static /* synthetic */ void m39667B5(Bundle bundle) {
        if (bundle != null && SystemClock.elapsedRealtime() - TantanApp.f17183f > AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED) {
            CoreModule.m29934N().mo60325Um("recover NewMainAct");
        }
        f7r.m119818b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B6 */
    public /* synthetic */ void m39668B6() {
        Intent intentM50738p2 = ProfileAct.m50738p2(act(), qib0.f154713b0.f139230a.userId(), "edit_data_button", false, true);
        intentM50738p2.putExtra("preview_type", 0);
        intentM50738p2.putExtra("REFACTOR_TAG", true);
        act().startActivity(intentM50738p2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C6 */
    public /* synthetic */ void m39671C6() {
        this.act.startActivity(b1c.m99820i(act(), "test"));
    }

    /* JADX INFO: renamed from: D4 */
    public static /* synthetic */ void m39672D4(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("debug_open")) {
            C4745k.m34160C3(true);
            return;
        }
        if (charSequence.equals("debug_close")) {
            C4745k.m34160C3(false);
        } else if (charSequence.equals("staging1")) {
            C4745k.m34161D3("http://m.staging1.p1staff.com/monetization/codapay/?from=");
        } else if (charSequence.equals("staging2")) {
            C4745k.m34161D3("http://m.staging2.p1staff.com/monetization/codapay/?from=");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: D6 */
    public /* synthetic */ void m39674D6() {
        j2e0.m139446m(this, Uri.parse("tantanapp://jumpToMarket?iosLink=xxx&original=test&apkName=com.p1.mobile.putong&&fallback=https%3A%2F%2Ftantanapp.com%2F&appType=tantan"));
    }

    /* JADX INFO: renamed from: E4 */
    public static /* synthetic */ void m39675E4(Throwable th) {
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ void m39676E5(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("刷新接口")) {
            CoreModule.f17545c.f19649h1.m105395k3();
        } else if (charSequence.equals("本地添加一个banner")) {
            CoreModule.f17545c.f19649h1.m105397m3();
        } else if (charSequence.equals("本地添加一篇文章")) {
            CoreModule.f17545c.f19649h1.m105396l3();
        }
    }

    /* JADX INFO: renamed from: G5 */
    private void m39680G5() {
        PopupWindow popupWindow = new PopupWindow();
        this.f24438o = popupWindow;
        popupWindow.setContentView(act().inflater().inflate(f6c0.f96019te, (ViewGroup) null, false));
        this.f24438o.setInputMethodMode(1);
        this.f24438o.setWidth(0);
        this.f24438o.setHeight(0);
    }

    /* JADX INFO: renamed from: H5 */
    public static void m39682H5(Context context, Intent intent) {
        intent.setClass(context, NewMainAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H6 */
    public /* synthetic */ void m39683H6() {
        duringCreated(CoreModule.f17545c.f19680r2.m136526p3("swipe")).subscribe(mkd0.m154956H(new e30() { // from class: l.mw20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136011a.m39779G6((List) obj);
            }
        }, new e30() { // from class: l.nw20
            @Override // p149l.e30
            public final void call(Object obj) {
                NewMainAct.m39730h5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I5 */
    public static Intent m39685I5(Context context, NavigationIntent navigationIntent) {
        return m39687J5(context, navigationIntent, null);
    }

    /* JADX INFO: renamed from: J4 */
    public static /* synthetic */ void m39686J4() {
    }

    /* JADX INFO: renamed from: J5 */
    public static Intent m39687J5(Context context, NavigationIntent navigationIntent, NavigationCardIntent navigationCardIntent) {
        return m39690K5(context, navigationIntent, navigationCardIntent, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J6 */
    public /* synthetic */ void m39688J6() {
        duringCreated(CoreModule.f17545c.f19680r2.m136526p3("message")).subscribe(mkd0.m154956H(new e30() { // from class: l.qw20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f156654a.m39781I6((List) obj);
            }
        }, new e30() { // from class: l.rw20
            @Override // p149l.e30
            public final void call(Object obj) {
                NewMainAct.m39675E4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K5 */
    public static Intent m39690K5(Context context, NavigationIntent navigationIntent, NavigationCardIntent navigationCardIntent, Map<String, String> map) {
        return m39692L5(context, navigationIntent, navigationCardIntent, map, -1L);
    }

    /* JADX INFO: renamed from: L5 */
    public static Intent m39692L5(Context context, NavigationIntent navigationIntent, NavigationCardIntent navigationCardIntent, Map<String, String> map, long j) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        if (NullChecker.m81303a(navigationIntent)) {
            intent.putExtra("extra_navigation_to_tenum", navigationIntent);
        }
        if (NullChecker.m81303a(navigationCardIntent)) {
            intent.putExtra("extra_navigation_card_to", navigationCardIntent);
        }
        if (j > 0) {
            intent.putExtra("extra_heartbeat_expire_time", j);
        }
        if (TEnum.equals(navigationIntent, "moment")) {
            return null;
        }
        if (NullChecker.m81303a(map) && map.size() > 0) {
            intent.putExtra("extra_param_2", new HashMap(map));
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L6 */
    public /* synthetic */ void m39693L6() {
        zd0.m218114H(this).m218121O();
    }

    /* JADX INFO: renamed from: M5 */
    public static Intent m39695M5(Context context, NavigationIntent navigationIntent) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        if (NullChecker.m81303a(navigationIntent)) {
            intent.putExtra("extra_navigation_to_tenum", navigationIntent);
            intent.putExtra("extra_scroll_to_setting_bottom", true);
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M6 */
    public /* synthetic */ void m39696M6() {
        new sj5.C19956a(this.act).m184444k(String.format("完善资料，认识更多理想%s", m39796W5(false))).m184443j("丰富的资料更受欢迎，同时可向你推荐更多符合你的理想型的人").m184439f("https://auto.tancdn.com/v1/raw/e2aa538c-be50-4e82-94af-5ed7d02c0a8b14.webp").m184436c(new View.OnClickListener() { // from class: l.gw20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104654a.m39784K6(view);
            }
        }).m184434a().show();
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m39697N4() {
        String str = "is_fake_avatar_query_" + CoreModule.m29931H().userId();
        Boolean bool = Boolean.FALSE;
        new hpd0(str, bool).put(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N6 */
    public /* synthetic */ void m39698N6() {
        lva.m151843D(this.act, Uri.parse("tantan://profile/edit?mode=dating&from=from_ideal_type_mine_tab_guide"));
    }

    /* JADX INFO: renamed from: O5 */
    public static Intent m39700O5(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        intent.putExtra("extra_to_caption", z);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O6 */
    public /* synthetic */ void m39701O6() {
        lva.m151843D(this.act, Uri.parse("tantan://moment/detail?uid=-1&mid=3434451013413637115&web=1"));
    }

    /* JADX INFO: renamed from: P5 */
    public static Intent m39703P5(Context context, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.addFlags(268468224);
        intent.putExtra("EXTRA_SHOW_TUTORIAL", z);
        intent.putExtra("extra_show_secret_crush_introduction", z2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P6 */
    public /* synthetic */ void m39704P6() {
        Act act = this.act;
        act.startActivity(LoveLetterAct.m39546Z1(act));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q6 */
    public /* synthetic */ void m39706Q6() {
        if (CoreModule.f17545c.f19609U != null) {
            f8c.m119878o().m119888j();
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC8090a(), 500L);
    }

    /* JADX INFO: renamed from: R5 */
    private boolean m39708R5(MotionEvent motionEvent, boolean z) {
        PutongFrag putongFragM40410o6 = ((C8096a) this.f24445h).m40410o6();
        if (!(putongFragM40410o6 instanceof HomeLayoutFrag)) {
            if (putongFragM40410o6 instanceof NewNewHomeFrag) {
                return ((NewNewHomeFrag) putongFragM40410o6).mo29634D4(motionEvent, z);
            }
            return false;
        }
        PutongFrag putongFragM38501V4 = ((HomeLayoutFrag) putongFragM40410o6).m38501V4();
        if (putongFragM38501V4 instanceof NewNewHomeFrag) {
            return putongFragM38501V4.mo29634D4(motionEvent, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: T6 */
    public static Intent m39711T6(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.putExtra(str, str2);
        return intent;
    }

    /* JADX INFO: renamed from: U6 */
    public static Intent m39713U6(Context context, String str, int i, int i2, boolean z) {
        Intent intentM39715V6 = m39715V6(context, str, i, z);
        intentM39715V6.putExtra("extra_message_push_type", i2);
        return intentM39715V6;
    }

    /* JADX INFO: renamed from: V6 */
    public static Intent m39715V6(Context context, String str, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.putExtra("extra_message_user_id", str);
        intent.putExtra("from", i);
        intent.putExtra("extra_to_message", true);
        intent.putExtra("media_keyboard", z);
        return intent;
    }

    /* JADX INFO: renamed from: W6 */
    public static Intent m39717W6(Context context, NavigationIntent navigationIntent, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        if (NullChecker.m81303a(navigationIntent)) {
            intent.putExtra("extra_navigation_to_tenum", navigationIntent);
        }
        intent.putExtra(str, str2);
        return intent;
    }

    /* JADX INFO: renamed from: X4 */
    public static /* synthetic */ void m39718X4() {
        SliderData sliderDataNew_ = SliderData.new_();
        sliderDataNew_.uuid = "asldfjsiofui283sdhf9s08923jkdsjfi";
        sliderDataNew_.supplier = 0;
        sliderDataNew_.retryClose = 0;
        sliderDataNew_.delayClose = 0;
        sliderDataNew_.allowClose = 1;
        vjf0.m198623e().m198643v(sliderDataNew_);
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m39722b5() {
        CoreModule.f17545c.f19639e0.f149446p2.put("");
        CoreModule.f17545c.f19639e0.f149439o2.put(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m39723c4() {
        qib0.f154710Y.m121230k().subscribe(mkd0.m154955G(new e30() { // from class: l.jw20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f120012a.m39837z6((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ void m39724c5() {
        SliderData sliderDataNew_ = SliderData.new_();
        sliderDataNew_.uuid = "asldfjsiofui283sdhf9s08923jkdsjfi";
        sliderDataNew_.supplier = 0;
        sliderDataNew_.retryClose = 2;
        sliderDataNew_.delayClose = 5;
        sliderDataNew_.allowClose = 0;
        vjf0.m198623e().m198643v(sliderDataNew_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m39727f4(C4319c c4319c) {
        if (c4319c == C4319c.f15552m) {
            m39787Q5();
        }
    }

    /* JADX INFO: renamed from: h5 */
    public static /* synthetic */ void m39730h5(Throwable th) {
    }

    /* JADX INFO: renamed from: h6 */
    public static Intent m39731h6(Context context, IntentParams intentParams) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.putExtra("extra_navigation_to_tenum", NavigationIntent.get("live"));
        intent.putExtra("main_jump_live_tag", intentParams);
        intent.putExtra("main_jump_live_has_params", true);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i6 */
    public /* synthetic */ void m39733i6() {
        dialog().m20536f0(new String[]{"debug_open", "debug_close", "staging1", "staging2"}).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.ow20
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                NewMainAct.m39672D4(dialog, view, i, charSequence);
            }
        }).m20568z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j6 */
    public /* synthetic */ void m39736j6() {
        dialog().m20536f0(new String[]{"open", "close", "上传数据"}).m20537g0(new C8091b()).m20568z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k6 */
    public /* synthetic */ void m39739k6() {
        dialog().m20536f0(new String[]{"刷新接口", "本地添加一个banner", "本地添加一篇文章"}).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.sw20
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                NewMainAct.m39676E5(dialog, view, i, charSequence);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: k7 */
    public static Intent m39740k7(Context context) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        intent.putExtra("extra_to_conversation", true);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l6 */
    public /* synthetic */ void m39743l6() {
        myf.m157039S(this.act, "netPictureDlg");
    }

    /* JADX INFO: renamed from: l7 */
    public static Intent m39744l7(Context context) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        intent.putExtra("navigation_to_picks", true);
        return intent;
    }

    /* JADX INFO: renamed from: m5 */
    public static /* synthetic */ void m39746m5() {
        if (upa.m194675N3()) {
            ExpandedCardStyleHelper.m38089i();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ void m39749o4() {
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ void m39752p5() {
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ void m39756r5() {
        hpd0 hpd0Var = xsy.f194328j;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        xsy.f194329k.put(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v6 */
    public /* synthetic */ void m39765v6() {
        String json = CoreModule.f17545c.f19639e0.m169520na().toJson();
        for (int i = 0; i < 10000; i++) {
            try {
                this.f24440q.add(User.JSON_ADAPTER.parse(json));
            } catch (IOException e) {
                CrashHelper.m81296c(e);
                aag0.m95543a(e);
                return;
            }
        }
        lsi0.m151580j("debugUserList.size=" + this.f24440q.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x6 */
    public /* synthetic */ void m39770x6() {
        e51.m114774y(new Runnable() { // from class: l.tw20
            @Override // java.lang.Runnable
            public final void run() {
                this.f172358a.m39765v6();
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m39775E3() {
        dialog().m20536f0(new String[]{"start", "vip商品查询", "探探币查询", "boost"}).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.fw20
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f99599a.m39827p6(dialog, view, i, charSequence);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: E6 */
    public final /* synthetic */ void m39776E6(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("右滑无配对引导")) {
            DatingGuideData datingGuideDataNew_ = DatingGuideData.new_();
            datingGuideDataNew_.titles.add(String.format(Locale.getDefault(), "刚刚看过的%d个%s更想了解你的兴趣爱好", Integer.valueOf(CoreModule.f17545c.f19663m0.f19466y0), CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "男生" : "女生"));
            datingGuideDataNew_.subTitles.add("添加生活照展示你的兴趣爱好，更容易配对");
            datingGuideDataNew_.button = "立即添加";
            datingGuideDataNew_.pageId = "p_add_lifestyle_guidance";
            datingGuideDataNew_.deeplink = "tantan://profile/edit?mode=guidePicAndTag&from=right_swipe_add_lifestyle";
            datingGuideDataNew_.pictures.add(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "https://auto.tancdn.com/v1/raw/8da6f26f-c9b6-440e-9bbc-57f1a124a66f14.webp" : "https://auto.tancdn.com/v1/raw/484a6490-eca3-4af1-bf18-0b43971e70c114.webp");
            datingGuideDataNew_.buttonId = "e_add_lifestyle";
            new v7c.C20593b(this.act).m197375c(datingGuideDataNew_).m197374b("right_swipe_no_match").m197373a().show();
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
            if (upa.m194847z()) {
                datingGuideDataNew_2.pictures = vwb.m200299M("https://auto.tancdn.com/v1/images/eyJpZCI6IkxNM042TTU3VTUyNkY2MlpaTEY3TUw1UVNGVklOVjE0IiwidyI6NDIwLCJoIjozMzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1ODUzMjgzMTUyNjkxMzN9.png");
            }
            datingGuideDataNew_2.buttonId = "e_complete_profile";
            new v7c.C20593b(act()).m197375c(datingGuideDataNew_2).m197373a().show();
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
            new v7c.C20593b(act()).m197375c(datingGuideDataNew_3).m197373a().show();
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
            new v7c.C20593b(act()).m197375c(datingGuideDataNew_4).m197373a().show();
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
            new v7c.C20593b(act()).m197375c(datingGuideDataNew_5).m197373a().show();
        }
    }

    @Override // p149l.tsi0
    /* JADX INFO: renamed from: F */
    public boolean mo36583F() {
        return !((C8096a) this.f24445h).m40273G7(TabName.Me);
    }

    /* JADX INFO: renamed from: F6 */
    public final /* synthetic */ void m39777F6() {
        dialog().m20536f0(new String[]{"右滑无配对引导", "连续左滑引导", "老用户引导给照片加标签", "老用户引导给旧标签配图", "收到喜欢很少引导上传生活照"}).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.pw20
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f151530a.m39776E6(dialog, view, i, charSequence);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m39778G3() {
        ark.m98443Q0(this.act, CoreModule.f17545c.f19639e0.m169527p9().picture(0).url, new d30() { // from class: l.hw20
            @Override // p149l.d30
            public final void call() {
                NewMainAct.m39752p5();
            }
        });
    }

    /* JADX INFO: renamed from: G6 */
    public final /* synthetic */ void m39779G6(List list) {
        if (vwb.m200296J(list) || act().isDialogShowing()) {
            return;
        }
        lbm lbmVar = new lbm(act());
        lbmVar.m149256U(list, "swipe");
        lbmVar.show();
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m39780I3() {
        mx0.m156782I(act(), false, 5.0f, "test");
    }

    /* JADX INFO: renamed from: I6 */
    public final /* synthetic */ void m39781I6(List list) {
        if (vwb.m200296J(list) || act().isDialogShowing()) {
            return;
        }
        lbm lbmVar = new lbm(act());
        lbmVar.m149256U(list, "conversation");
        lbmVar.show();
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m39782J3() {
        act().dialog().m20504F("活跃天数: " + mx0.m156802o().f136104d.get() + "\n当天打开次数: " + mx0.m156802o().f136103c.get() + "\n当天打开时间（秒）: " + mx0.m156802o().f136102b.get() + "\n当天接受消息: " + C8346a.m45563j().f29308k.get() + "\n当天发送消息: " + C8346a.m45563j().f29309l.get() + "\n当前语言是否满足入组条件：false").m20568z0();
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m39783K3() {
        PermissionHelper.m79882c().m79900r("android.permission.CAMERA").m79905w(false).m79903u(true).m79892j(false).m79897o(new d30() { // from class: l.iw20
            @Override // p149l.d30
            public final void call() {
                this.f115221a.m39830s6();
            }
        }).m79891i(this.act);
    }

    /* JADX INFO: renamed from: K6 */
    public final /* synthetic */ void m39784K6(View view) {
        km90.m146484l(this.act);
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m39785L3() {
        C13099b.m79348a(this);
    }

    /* JADX INFO: renamed from: N5 */
    public void m39786N5(TabName tabName) {
        m39928t3(tabName, false);
    }

    /* JADX INFO: renamed from: Q5 */
    public void m39787Q5() {
        if (NullChecker.m81303a(this.f24438o) && this.f24438o.isShowing()) {
            this.f24438o.dismiss();
            this.f24438o = null;
        }
    }

    /* JADX INFO: renamed from: R6 */
    public final /* synthetic */ void m39788R6(int i) {
        m39791T5();
    }

    /* JADX INFO: renamed from: S5 */
    public C22306c<Boolean> m39789S5() {
        return ((C8096a) this.f24445h).f24496E;
    }

    /* JADX INFO: renamed from: S6 */
    public final Frag m39790S6() {
        TabName tabNameM197534h = v930.m197534h();
        if (tabNameM197534h != null) {
            return ((C8096a) this.f24445h).m40422r6(tabNameM197534h);
        }
        return null;
    }

    /* JADX INFO: renamed from: T5 */
    public int m39791T5() {
        Resources resources;
        int identifier;
        this.act.setNavigationBarColor(0);
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        if (viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (viewGroup.getChildAt(i).getId() != -1 && "navigationBarBackground".equals(getResources().getResourceEntryName(viewGroup.getChildAt(i).getId()))) {
                    if (q8l.m173414c(this.act) && (identifier = (resources = act().getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
                        return resources.getDimensionPixelSize(identifier);
                    }
                    return 0;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: U5 */
    public C8096a.v m39792U5() {
        return ((C8096a) this.f24445h).m212085d1();
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m39793V3() {
        new yk5(this).show();
    }

    /* JADX INFO: renamed from: V5 */
    public C8096a m39794V5() {
        return (C8096a) this.f24445h;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m39795W3() {
        try {
            File file = new File(act().getFilesDir(), "effectCache");
            if (file.exists()) {
                rhi.m179368l(file);
                lsi0.m151595y("直播特效删除成功");
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: W5 */
    public final String m39796W5(boolean z) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (TEnum.equals(userM169527p9.settings.getLookingFor(), LookingFor.get(userM169527p9.isFemale() ? "female" : "male"))) {
            if (z) {
                return userM169527p9.isFemale() ? "她们" : "他们";
            }
            return userM169527p9.isFemale() ? "女生" : "男生";
        }
        if (z) {
            return userM169527p9.isFemale() ? "他们" : "她们";
        }
        return userM169527p9.isFemale() ? "男生" : "女生";
    }

    /* JADX INFO: renamed from: X5 */
    public View m39797X5(TabName tabName) {
        P p = this.f24445h;
        if (p instanceof C8096a) {
            return ((C8096a) p).m40430t6(tabName);
        }
        return null;
    }

    /* JADX INFO: renamed from: X6 */
    public void m39798X6() {
        this.f24439p = false;
    }

    /* JADX INFO: renamed from: Y5 */
    public j760<String, String> m39799Y5() {
        PutongFrag putongFragM40410o6 = ((C8096a) this.f24445h).m40410o6();
        if (CoreModule.m29936Q().isLiveSquareHome(putongFragM40410o6)) {
            return vwb.m200311Y(CoreModule.m29936Q().getTopShowingPageId(putongFragM40410o6), "");
        }
        if (CoreModule.m29934N().isPhotoAlbumFrag(putongFragM40410o6)) {
            return vwb.m200311Y(CoreModule.m29934N().getTopShowingPageId(putongFragM40410o6), "");
        }
        if (putongFragM40410o6 instanceof ConversationsTabFrag) {
            return ((ConversationsTabFrag) putongFragM40410o6).m41612G5();
        }
        if (putongFragM40410o6 instanceof ProfileFrag) {
            return vwb.m200311Y(OMSDialogPositon.p_navigation_view, "");
        }
        return NullChecker.m81303a(putongFragM40410o6) ? vwb.m200311Y(putongFragM40410o6.pageId(), "") : vwb.m200311Y("", "");
    }

    @Deprecated
    /* JADX INFO: renamed from: Y6 */
    public void m39800Y6(TabName tabName, boolean z) {
        ((C8096a) this.f24445h).m40433t9(tabName, z);
    }

    /* JADX INFO: renamed from: Z5 */
    public NewMainViewModel m39801Z5() {
        return this.f24436m;
    }

    /* JADX INFO: renamed from: Z6 */
    public void m39802Z6(boolean z) {
        ((C8096a) this.f24445h).m40437u9(z);
    }

    /* JADX INFO: renamed from: a6 */
    public void m39803a6() {
        ((C8096a) this.f24445h).m40439v6();
    }

    /* JADX INFO: renamed from: a7 */
    public void m39804a7() {
        ((C8096a) this.f24445h).m40441v9();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m39805b4() {
        new pwf(this).show();
    }

    @Override // com.p046p1.mobile.putong.core.newui.main.NewMainBaseAct
    /* JADX INFO: renamed from: b6, reason: merged with bridge method [inline-methods] */
    public C8096a mo39835x3() {
        this.f24436m = new NewMainViewModel(act());
        C8096a c8096a = new C8096a(this);
        c8096a.mo51532C(this.f24436m);
        return c8096a;
    }

    /* JADX INFO: renamed from: b7 */
    public void m39807b7(boolean z) {
        ((C8096a) this.f24445h).f24496E.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: c6 */
    public boolean m39808c6() {
        return this.f24439p;
    }

    /* JADX INFO: renamed from: c7 */
    public void m39809c7(Boolean bool) {
        ((C8096a) this.f24445h).m40445w9(bool);
    }

    /* JADX INFO: renamed from: d6 */
    public boolean m39810d6() {
        return m39812e6(TabName.Card);
    }

    /* JADX INFO: renamed from: d7 */
    public Runnable m39811d7(Runnable runnable) {
        ((C8096a) this.f24445h).f24500r = runnable;
        return runnable;
    }

    @Override // com.p046p1.mobile.putong.core.newui.main.NewMainBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(vwb.m200311Y("try add 10000 user in memory", new d30() { // from class: l.iu20
            @Override // p149l.d30
            public final void call() {
                this.f114966a.m39770x6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("try jump to market", new d30() { // from class: l.ku20
            @Override // p149l.d30
            public final void call() {
                this.f124642a.m39674D6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("showAiAlbumDlg", new d30() { // from class: l.wu20
            @Override // p149l.d30
            public final void call() {
                this.f188078a.m39693L6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Delete core database and kill self", new d30() { // from class: l.iv20
            @Override // p149l.d30
            public final void call() {
                this.f115083a.m39706Q6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("coda debug 测试", new d30() { // from class: l.uv20
            @Override // p149l.d30
            public final void call() {
                this.f178493a.m39733i6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("shadow string", new d30() { // from class: l.vv20
            @Override // p149l.d30
            public final void call() {
                this.f183145a.m39736j6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("活动中心", new d30() { // from class: l.wv20
            @Override // p149l.d30
            public final void call() {
                this.f188212a.m39739k6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("下载动态表情", new d30() { // from class: l.xv20
            @Override // p149l.d30
            public final void call() {
                xxe.m211469h().m211470e();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("展示头像审核弹窗", new d30() { // from class: l.yv20
            @Override // p149l.d30
            public final void call() {
                this.f200217a.m39743l6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("头像审核弹窗商业策略请求缓存清除", new d30() { // from class: l.zv20
            @Override // p149l.d30
            public final void call() {
                NewMainAct.m39697N4();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("sku流程优化", new d30() { // from class: l.tu20
            @Override // p149l.d30
            public final void call() {
                this.f172113a.m39775E3();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("是否是当日登录用户：" + CoreModule.m29931H().mo28155Jr(), new d30() { // from class: l.ev20
            @Override // p149l.d30
            public final void call() {
                NewMainAct.m39686J4();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("change title !!!!!", new d30() { // from class: l.pv20
            @Override // p149l.d30
            public final void call() {
                this.f151383a.m39828q6();
            }
        }));
        final Fragment fragmentM2557i0 = fragmentManager().m2557i0(((C8096a) this.f24445h).m212083b1().toString());
        if (fragmentM2557i0 instanceof NewNewHomeFrag) {
            arrayListDebugItems.addAll(((NewNewHomeFrag) fragmentM2557i0).mo29633C4());
        } else if (fragmentM2557i0 instanceof HomeLayoutFrag) {
            arrayListDebugItems.addAll(((HomeLayoutFrag) fragmentM2557i0).mo29633C4());
        } else if (fragmentM2557i0 instanceof PutongFrag) {
            Collection<? extends j760<String, d30>> collectionMo29633C4 = ((PutongFrag) fragmentM2557i0).mo29633C4();
            if (!vwb.m200296J(collectionMo29633C4)) {
                arrayListDebugItems.addAll(collectionMo29633C4);
            }
        }
        ht20.m132814A(arrayListDebugItems, this);
        arrayListDebugItems.add(vwb.m200311Y("good2fake dialog", new d30() { // from class: l.aw20
            @Override // p149l.d30
            public final void call() {
                this.f72008a.m39778G3();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("show screen size ", new d30() { // from class: l.lw20
            @Override // p149l.d30
            public final void call() {
                lsi0.m151595y("【" + hmb.m131712q1() + Constants.SEPARATOR_COMMA + hmb.m131711p1() + "】");
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("tantan star rank", new d30() { // from class: l.ww20
            @Override // p149l.d30
            public final void call() {
                this.f188322a.m39829r6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("tantan appstore rank guide", new d30() { // from class: l.cx20
            @Override // p149l.d30
            public final void call() {
                this.f82829a.m39780I3();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("show app store guide status", new d30() { // from class: l.dx20
            @Override // p149l.d30
            public final void call() {
                this.f88231a.m39782J3();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("qr_scan", new d30() { // from class: l.ex20
            @Override // p149l.d30
            public final void call() {
                this.f93571a.m39783K3();
            }
        }));
        arrayListDebugItems.add(new j760<>("进入照相页面", new d30() { // from class: l.ju20
            @Override // p149l.d30
            public final void call() {
                this.f119725a.m39831t6();
            }
        }));
        arrayListDebugItems.add(new j760<>("进入RemoteConfig信息页", new d30() { // from class: l.lu20
            @Override // p149l.d30
            public final void call() {
                this.f130028a.m39785L3();
            }
        }));
        arrayListDebugItems.add(new j760<>("触发升级下载弹框", new d30() { // from class: l.mu20
            @Override // p149l.d30
            public final void call() {
                this.f135719a.m39832u6();
            }
        }));
        arrayListDebugItems.add(new j760<>("实拍气泡引导" + f24434r.get(), new d30() { // from class: l.nu20
            @Override // p149l.d30
            public final void call() {
                NewMainAct.m39663A4();
            }
        }));
        arrayListDebugItems.add(new j760<>("测试读取本地token", new d30() { // from class: l.ou20
            @Override // p149l.d30
            public final void call() {
                vjf0.m198623e().m198631i();
            }
        }));
        arrayListDebugItems.add(new j760<>("测试写入本地token：非空", new d30() { // from class: l.pu20
            @Override // p149l.d30
            public final void call() {
                NewMainAct.m39718X4();
            }
        }));
        arrayListDebugItems.add(new j760<>("测试写入本地token：非空", new d30() { // from class: l.qu20
            @Override // p149l.d30
            public final void call() {
                NewMainAct.m39724c5();
            }
        }));
        arrayListDebugItems.add(new j760<>("测试写入本地token：空", new d30() { // from class: l.ru20
            @Override // p149l.d30
            public final void call() {
                vjf0.m198623e().m198643v(null);
            }
        }));
        arrayListDebugItems.add(new j760<>("实拍Tips引导" + xsy.f194328j.get(), new d30() { // from class: l.su20
            @Override // p149l.d30
            public final void call() {
                NewMainAct.m39756r5();
            }
        }));
        arrayListDebugItems.add(new j760<>("隐私协议", new d30() { // from class: l.uu20
            @Override // p149l.d30
            public final void call() {
                this.f178311a.m39793V3();
            }
        }));
        arrayListDebugItems.add(new j760<>("清除直播间特效文件", new d30() { // from class: l.vu20
            @Override // p149l.d30
            public final void call() {
                this.f183025a.m39795W3();
            }
        }));
        arrayListDebugItems.add(new j760<>("当前运行环境：".concat(dt3.m113531a(App.f15369e) ? "64Bit" : "32Bit"), new d30() { // from class: l.xu20
            @Override // p149l.d30
            public final void call() {
                NewMainAct.m39749o4();
            }
        }));
        arrayListDebugItems.add(new j760<>("firebasetoken", new d30() { // from class: l.yu20
            @Override // p149l.d30
            public final void call() {
                NewMainAct.m39664A5();
            }
        }));
        arrayListDebugItems.add(new j760<>("firebase安装ID", new d30() { // from class: l.zu20
            @Override // p149l.d30
            public final void call() {
                dkg.m112221a();
            }
        }));
        arrayListDebugItems.add(new j760<>("网图Fake弹窗", new d30() { // from class: l.av20
            @Override // p149l.d30
            public final void call() {
                this.f71890a.m39836y6(fragmentM2557i0);
            }
        }));
        arrayListDebugItems.add(new j760<>("网图Fake协议弹窗", new d30() { // from class: l.bv20
            @Override // p149l.d30
            public final void call() {
                this.f77389a.m39805b4();
            }
        }));
        arrayListDebugItems.add(new j760<>("认证弹框清理", new d30() { // from class: l.cv20
            @Override // p149l.d30
            public final void call() {
                NewMainAct.m39722b5();
            }
        }));
        arrayListDebugItems.add(new j760<>("asset数据", new d30() { // from class: l.dv20
            @Override // p149l.d30
            public final void call() {
                this.f88030a.m39723c4();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("弹出先发like弹窗", new d30() { // from class: l.fv20
            @Override // p149l.d30
            public final void call() {
                xdx.m208433A().m208464N(CoreModule.m29932K().me_().f56011id);
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Profile Edit Online", new d30() { // from class: l.gv20
            @Override // p149l.d30
            public final void call() {
                this.f104522a.m39665A6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Profile Edit Refactor", new d30() { // from class: l.hv20
            @Override // p149l.d30
            public final void call() {
                this.f109610a.m39668B6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Profile Picks", new d30() { // from class: l.jv20
            @Override // p149l.d30
            public final void call() {
                this.f119849a.m39671C6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Profile Picks Entry Notify", new d30() { // from class: l.kv20
            @Override // p149l.d30
            public final void call() {
                CoreModule.m29934N().mo60381p6(true);
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Dating MyTab Guide", new d30() { // from class: l.lv20
            @Override // p149l.d30
            public final void call() {
                CoreModule.f17545c.f19680r2.m136523m3();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("Profile Guide", new d30() { // from class: l.mv20
            @Override // p149l.d30
            public final void call() {
                this.f135866a.m39777F6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("ideal guide dialog in SWIPE", new d30() { // from class: l.nv20
            @Override // p149l.d30
            public final void call() {
                this.f140664a.m39683H6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("ideal guide dialog in Conversation", new d30() { // from class: l.ov20
            @Override // p149l.d30
            public final void call() {
                this.f145759a.m39688J6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("ideal profile guide dialog", new d30() { // from class: l.qv20
            @Override // p149l.d30
            public final void call() {
                this.f156574a.m39696M6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("ideal profile mine tab guide", new d30() { // from class: l.rv20
            @Override // p149l.d30
            public final void call() {
                this.f161157a.m39698N6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("deeplink: moment detail", new d30() { // from class: l.sv20
            @Override // p149l.d30
            public final void call() {
                this.f166518a.m39701O6();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("love letter act", new d30() { // from class: l.tv20
            @Override // p149l.d30
            public final void call() {
                this.f172245a.m39704P6();
            }
        }));
        return arrayListDebugItems;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.core.LauncherAct, com.p046p1.mobile.putong.app.PutongAct, android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return m39708R5(motionEvent, false) || super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e6 */
    public boolean m39812e6(TabName tabName) {
        return ((C8096a) this.f24445h).m40273G7(tabName);
    }

    /* JADX INFO: renamed from: e7 */
    public void m39813e7(TabName tabName, int i) {
        ((C8096a) this.f24445h).m40453y9(tabName, i);
    }

    /* JADX INFO: renamed from: f6 */
    public boolean m39814f6(TabName tabName) {
        return ((C8096a) this.f24445h).m40273G7(tabName);
    }

    /* JADX INFO: renamed from: f7 */
    public void m39815f7() {
        ((C8096a) this.f24445h).f24502t.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: g6 */
    public boolean m39816g6() {
        return ((C8096a) this.f24445h).m40281I7();
    }

    /* JADX INFO: renamed from: g7 */
    public void m39817g7(CharSequence charSequence, String str, Figure figure, String str2, double d, d30 d30Var) {
        ((C8096a) this.f24445h).m40283I9(charSequence, str, figure, str2, d, d30Var);
    }

    @Override // com.p046p1.mobile.android.app.Act, p149l.k0m
    public String getPopLifeName() {
        Frag fragM39790S6 = m39790S6();
        return fragM39790S6 != null ? fragM39790S6.getPopLifeName() : super.getPopLifeName();
    }

    /* JADX INFO: renamed from: h7 */
    public void m39818h7() {
        final int iM39791T5 = m39791T5();
        e51.m114741F(this, new Runnable() { // from class: l.bx20
            @Override // java.lang.Runnable
            public final void run() {
                this.f77729a.m39788R6(iM39791T5);
            }
        });
    }

    /* JADX INFO: renamed from: i7 */
    public C22306c<TabName> m39819i7() {
        return ((C8096a) this.f24445h).m40307O9();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        y8i0.m213379a("NewMainAct inflateView");
        LaunchStep launchStep = LaunchStep.MainActInflate;
        yni.m215417f(launchStep);
        View viewM40266E7 = ((C8096a) this.f24445h).m40266E7(layoutInflater, viewGroup);
        yni.m215415d(launchStep);
        if (!CoreModule.m29934N().mo60384qg()) {
            y8i0.m213380b();
            return viewM40266E7;
        }
        act().setUpKeyboardDetectorLayout(new View(act()), getWindow().getDecorView(), new f30() { // from class: l.cw20
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                NewMainAct.f24435s.onNext(new j760<>((Boolean) obj, (Integer) obj2));
            }
        });
        if (hm7.m131700b()) {
            m39680G5();
        }
        y8i0.m213380b();
        return viewM40266E7;
    }

    @Override // com.p046p1.mobile.putong.core.newui.main.NewMainBaseAct, com.p046p1.mobile.putong.core.LauncherAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        y8i0.m213379a("NewMainAct initDataOnCreate");
        yni.m215415d(LaunchStep.MainStartWait);
        yni.m215417f(LaunchStep.NewMainCreate, LaunchStep.HomeFragWait);
        super.initDataOnCreate();
        creates(new e30() { // from class: l.dw20
            @Override // p149l.e30
            public final void call(Object obj) {
                NewMainAct.m39667B5((Bundle) obj);
            }
        }, new d30() { // from class: l.ew20
            @Override // p149l.d30
            public final void call() {
                NewMainAct.m39746m5();
            }
        });
        y8i0.m213380b();
    }

    @Override // com.p046p1.mobile.putong.core.newui.main.NewMainBaseAct, com.p046p1.mobile.putong.core.LauncherAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        y8i0.m213379a("NewMainAct initSubscription");
        super.initSubscription();
        if (CoreModule.m29934N().mo60384qg() && hm7.m131700b()) {
            lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.bw20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f77577a.m39727f4((C4319c) obj);
                }
            }));
        }
        y8i0.m213380b();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean isAnonymousMode() {
        return (m39812e6(TabName.Card) || m39812e6(TabName.Live)) ? false : true;
    }

    /* JADX INFO: renamed from: j7 */
    public TabName m39820j7() {
        return ((C8096a) this.f24445h).m40311P9();
    }

    /* JADX INFO: renamed from: m6 */
    public final /* synthetic */ C22306c m39821m6(List list) {
        return igj.m136009M(this, list);
    }

    /* JADX INFO: renamed from: m7 */
    public void m39822m7(boolean z) {
        ((C8096a) this.f24445h).f24495D = true;
        this.f24436m.m39973J0(z);
    }

    /* JADX INFO: renamed from: n6 */
    public final /* synthetic */ C22306c m39823n6(List list) {
        return igj.m136009M(this, list);
    }

    /* JADX INFO: renamed from: n7 */
    public void m39824n7() {
        ((C8096a) this.f24445h).m40449x9();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean needBindBillingService() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public boolean needMarkResume() {
        return false;
    }

    /* JADX INFO: renamed from: o6 */
    public final /* synthetic */ C22306c m39825o6(List list) {
        return igj.m136009M(this, list);
    }

    /* JADX INFO: renamed from: o7 */
    public void m39826o7(boolean z) {
        ((C8096a) this.f24445h).f24495D = false;
        this.f24436m.m39981N0(z);
    }

    @Override // com.p046p1.mobile.putong.core.newui.main.NewMainBaseAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == v2h.f179548a) {
            if (i2 == -1) {
                if (((C8096a) this.f24445h).m40385h9(intent.getExtras().getString("last_moment_id"))) {
                    return;
                }
            }
        } else if (i == 1012) {
            if (intent == null || intent.getExtras() == null) {
                lsi0.m151595y("打开失败，请重试");
                return;
            }
            Bundle extras = intent.getExtras();
            String string = extras.getInt("result_type") == 1 ? extras.getString("result_string") : "";
            if (TextUtils.isEmpty(string)) {
                lsi0.m151595y("打开失败，请重试");
                return;
            }
            try {
                if (!string.startsWith("tantan") && !string.startsWith("tantanapp") && !string.startsWith("tantantribe")) {
                    lva.m151843D(act(), Uri.parse("tantanapp://webview?url=".concat(string)));
                    return;
                }
                lva.m151843D(act(), Uri.parse(string));
                return;
            } catch (Exception unused) {
                lsi0.m151595y("打开失败，请重试");
                return;
            }
        }
        if (qib0.f154713b0.f139230a.onActivityResultForSmartLock(i, i2, intent)) {
            return;
        }
        Fragment fragmentM2557i0 = fragmentManager().m2557i0(TabName.Msg.toString());
        if (NullChecker.m81303a(fragmentM2557i0)) {
            fragmentM2557i0.onActivityResult(i, i2, intent);
        }
        Fragment fragmentM2557i1 = fragmentManager().m2557i0(TabName.Meet.toString());
        if (NullChecker.m81303a(fragmentM2557i1)) {
            fragmentM2557i1.onActivityResult(i, i2, intent);
        }
        if (i == 4099 && i2 == -1) {
            ark.m98433L0(act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h));
        }
        if (i == 786 && i2 == -1) {
            String stringExtra = intent.getStringExtra("from");
            ArrayList<Media> arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h);
            if ("from_intl_pet_photo".equals(stringExtra)) {
                PutongFrag putongFragM40410o6 = ((C8096a) this.f24445h).m40410o6();
                if (NullChecker.m81304b(arrayList) && !arrayList.isEmpty() && (putongFragM40410o6 instanceof HomeLayoutFrag)) {
                    PutongFrag putongFragM38501V4 = ((HomeLayoutFrag) putongFragM40410o6).m38501V4();
                    if (putongFragM38501V4 instanceof NewNewHomeFrag) {
                        ((NewNewHomeFrag) putongFragM38501V4).f21678C.m37388z5(arrayList);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (upa.m194795o2() && i == 25) {
            PutongFrag putongFragM40410o7 = ((C8096a) this.f24445h).m40410o6();
            if (putongFragM40410o7 instanceof ProfileFrag) {
                putongFragM40410o7.onActivityResult(i, i2, intent);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        y1j.m212198g("Activity AttachedToWindow");
        zvf0.m220371D("e_main_displayed", "p_suggest_users_home_view", vwb.m200311Y("displayed_time", Long.valueOf(System.currentTimeMillis() - this.f24437n)));
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        ((C8096a) this.f24445h).m40434u6();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        CoreModule.f17545c.f19639e0.f149190I1.onNext(Boolean.TRUE);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.AutoReleaseVideoAct, com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onDestroyLifecycle() {
        super.onDestroyLifecycle();
        CoreModule.m29936Q().mo67229M6().mo102417b();
        rw0.m181370d(false);
    }

    @Override // com.p046p1.mobile.android.app.Act, p149l.d0e
    public void onDialogAttachToWindow(android.app.Dialog dialog) {
        super.onDialogAttachToWindow(dialog);
        if (m39927i4()) {
            this.f24436m.m39970I();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (!NullChecker.m81303a(list) || list.size() <= 0 || !(list.get(0) instanceof Video) || new r5l0(rhi.m179382z(list.get(0).url)).f157831b <= Constants.ONE_MIN_IN_MILLIS) {
            CoreModule.m29934N().toCaptionPage(this.act, list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list), false, null);
        } else {
            lsi0.m151578h(R$string.f17975Ni);
        }
    }

    @Override // android.app.Activity
    public void onRestoreInstanceState(Bundle bundle) {
        bundle.setClassLoader(NewMainAct.class.getClassLoader());
        super.onRestoreInstanceState(bundle);
        ((C8096a) this.f24445h).m40389i9(bundle);
    }

    @Override // androidx.fragment.app.FragmentActivity
    public void onResumeFragments() {
        super.onResumeFragments();
        ((C8096a) this.f24445h).m40393j9();
        Act.isActResumed = true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.appcompat.app.AppCompatActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        ((C8096a) this.f24445h).m40397k9(bundle);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        Fragment fragmentM2557i0 = fragmentManager().m2557i0(TabName.Card.toString());
        if (fragmentM2557i0 instanceof NewNewHomeFrag) {
            ((NewNewHomeFrag) fragmentM2557i0).m36753b5(z);
        }
        if (CoreModule.m29934N().mo60384qg() && z && hm7.m131700b() && NullChecker.m81303a(this.f24438o) && !this.f24438o.isShowing()) {
            this.f24438o.setBackgroundDrawable(new ColorDrawable(0));
            this.f24438o.showAtLocation(this.act.getWindow().getDecorView(), 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: p6 */
    public final /* synthetic */ void m39827p6(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("start")) {
            igj.m136002F();
            return;
        }
        if (charSequence.equals("vip商品查询")) {
            CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get(ProductCategory.tttVip)).filter(new w9j() { // from class: l.uw20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).flatMap(new w9j() { // from class: l.vw20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f183299a.m39821m6((List) obj);
                }
            }).subscribe();
        } else if (charSequence.equals("探探币查询")) {
            CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get("coin")).filter(new w9j() { // from class: l.xw20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).flatMap(new w9j() { // from class: l.yw20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f200359a.m39823n6((List) obj);
                }
            }).subscribe();
        } else if (charSequence.equals("boost")) {
            CoreModule.f17545c.f19654j0.m30644y5(ProductCategory.get("boost")).filter(new w9j() { // from class: l.zw20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).flatMap(new w9j() { // from class: l.ax20
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f72102a.m39825o6((List) obj);
                }
            }).subscribe();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        P p = this.f24445h;
        return p != 0 ? ((C8096a) p).m40438v() : super.pageId();
    }

    @Override // com.p046p1.mobile.android.app.Act, p149l.k0m
    public C22392a<pc80> popLifeObs() {
        Frag fragM39790S6 = m39790S6();
        return fragM39790S6 == null ? super.popLifeObs() : fragM39790S6.popLifeObs();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        CoreModule.f17545c.f19663m0.f19468y2 = System.currentTimeMillis();
        y8i0.m213379a("NewMainAct preCreateView");
        yni.m215417f(LaunchStep.AsyncLayout);
        vi4.m198495a().mo102633g(this, this);
        setSwipeBackEnable(false);
        m39929w3();
        super.preCreateView(bundle);
        setTransparentStatusBar();
        rw0.m181370d(true);
        y8i0.m213380b();
    }

    /* JADX INFO: renamed from: q6 */
    public final /* synthetic */ void m39828q6() {
        setTitle("Tantan");
    }

    /* JADX INFO: renamed from: r6 */
    public final /* synthetic */ void m39829r6() {
        mx0.m156787O(act(), "test");
    }

    /* JADX INFO: renamed from: s6 */
    public final /* synthetic */ void m39830s6() {
        Act act = this.act;
        act.startActivityForResult(k8c.m144925a(act), 1012);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        y8i0.m213379a("NewMainAct setTheme");
        LaunchStep launchStep = LaunchStep.ThemeChange;
        yni.m215417f(launchStep);
        if (NullChecker.m81303a(getSupportActionBar())) {
            getSupportActionBar().mo134111A(0.0f);
        }
        getAppTheme().mo105496k(getWindow());
        yni.m215415d(launchStep);
        y8i0.m213380b();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void setTransparentStatusBar() {
        super.setTransparentStatusBar();
        if (m39927i4()) {
            Window window = getWindow();
            window.clearFlags(134217728);
            window.getDecorView().setSystemUiVisibility(1536);
            window.addFlags(Integer.MIN_VALUE);
            setNavigationBarColor(0);
        }
        if (NullChecker.m81303a(CoreModule.f17545c)) {
            CoreBusinessModule.m29908m0().mo190523j(this);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldWrapContentViewWithTransparentHeader() {
        return false;
    }

    /* JADX INFO: renamed from: t6 */
    public final /* synthetic */ void m39831t6() {
        tvf.m190738p(this.act, OMSTemplateType.dialog);
    }

    /* JADX INFO: renamed from: u6 */
    public final /* synthetic */ void m39832u6() {
        File file = new File(xxf0.m211478b());
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                file2.delete();
            }
        }
        zrj0.m219975x(this);
    }

    @Override // com.p046p1.mobile.putong.core.newui.main.NewMainBaseAct
    /* JADX INFO: renamed from: v3 */
    public String mo39833v3() {
        try {
            return getSupportFragmentManager().m2554h0(u4c0.f174563y4).getTag();
        } catch (Exception unused) {
            return NewNewHomeFrag.class.getSimpleName();
        }
    }

    /* JADX INFO: renamed from: w6 */
    public final /* synthetic */ void m39834w6(Fragment fragment) {
        r3g.m177670i(this.act, (PutongFrag) fragment, PutongAct.REQUEST_CODE_PICKER);
    }

    /* JADX INFO: renamed from: y6 */
    public final /* synthetic */ void m39836y6(final Fragment fragment) {
        AppealInfo appealInfo = new AppealInfo();
        appealInfo.appeal_count = 0;
        appealInfo.status = OMSSwipeMoment.before;
        iwf.m138738e().m138740g(this, new Runnable() { // from class: l.kw20
            @Override // java.lang.Runnable
            public final void run() {
                this.f124917a.m39834w6(fragment);
            }
        }, appealInfo);
    }

    /* JADX INFO: renamed from: z6 */
    public final /* synthetic */ void m39837z6(String str) {
        new Dialog.C4309e(this).m20504F("curMD5:" + qib0.f154710Y.f17098h.get() + "\nData:" + str).m20567z().show();
    }
}
