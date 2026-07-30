package com.p000p1.mobile.putong.core.newui.main;

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
import com.p000p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.home.frag.base.HomeLayoutFrag;
import com.p000p1.mobile.putong.core.newui.loveletter.LoveLetterAct;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p000p1.mobile.putong.core.newui.profile.ProfileFrag;
import com.p000p1.mobile.putong.live_api.api.serviceprovider.api.IntentParams;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.p004ui.mediapicker.MediaPickerBaseAct;
import com.p000p1.mobile.putong.p004ui.permission.PermissionHelper;
import com.p000p1.mobile.putong.remote_config.C0501b;
import com.p000p1.mobile.putong.util.launch.LaunchStep;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.app.TantanApp;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.k;
import com.p1.mobile.putong.core.data.AppealInfo;
import com.p1.mobile.putong.core.data.DatingGuideData;
import com.p1.mobile.putong.core.data.Figure;
import com.p1.mobile.putong.core.data.ProductCategory;
import com.p1.mobile.putong.core.ui.gp.a;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.data.LookingFor;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.NavigationCardIntent;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.data.SliderData;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import l.aag0;
import l.ark;
import l.b1c;
import l.cdq0;
import l.d30;
import l.dkg;
import l.e30;
import l.e51;
import l.f30;
import l.f6c0;
import l.f7r;
import l.f8c;
import l.hm7;
import l.hmb;
import l.hpd0;
import l.igj;
import l.j2e0;
import l.j760;
import l.k8c;
import l.km90;
import l.lsi0;
import l.lva;
import l.mkd0;
import l.mx0;
import l.pc80;
import l.qib0;
import l.r3g;
import l.r5l0;
import l.rhi;
import l.roj0;
import l.rw0;
import l.tvf;
import l.u4c0;
import l.upa;
import l.v2h;
import l.v7c;
import l.v930;
import l.vwb;
import l.w9j;
import l.xsy;
import l.xxe;
import l.xxf0;
import l.zd0;
import l.zrj0;
import l.zvf0;
import p009l.bse0;
import p009l.dt3;
import p009l.ht20;
import p009l.iwf;
import p009l.lbm;
import p009l.myf;
import p009l.pwf;
import p009l.q8l;
import p009l.sj5;
import p009l.tsi0;
import p009l.vi4;
import p009l.vjf0;
import p009l.y1j;
import p009l.y8i0;
import p009l.yk5;
import p009l.yni;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewMainAct extends NewMainBaseAct<C0260a> implements tsi0, cdq0 {

    /* JADX INFO: renamed from: r */
    public static final hpd0 f3212r = new hpd0("s_r_s_b_l", Boolean.FALSE);

    /* JADX INFO: renamed from: s */
    public static b<j760<Boolean, Integer>> f3213s = b.b();

    /* JADX INFO: renamed from: m */
    public NewMainViewModel f3214m;

    /* JADX INFO: renamed from: n */
    public final long f3215n = System.currentTimeMillis();

    /* JADX INFO: renamed from: o */
    public PopupWindow f3216o;

    /* JADX INFO: renamed from: p */
    public boolean f3217p;

    /* JADX INFO: renamed from: q */
    public List<User> f3218q;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainAct$a */
    public class RunnableC0254a implements Runnable {
        public RunnableC0254a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e51.E();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainAct$b */
    public class C0255b implements Dialog.g {
        public C0255b() {
        }

        /* JADX INFO: renamed from: a */
        public void m3914a(Dialog dialog, View view, int i, CharSequence charSequence) {
            if (charSequence.equals("open")) {
                bse0.m12226c();
            } else if (charSequence.equals("close")) {
                bse0.m12225b();
            } else if (charSequence.equals("上传数据")) {
                bse0.m12227d();
            }
        }
    }

    public NewMainAct() {
        y1j.m25170g("Activity Init");
        this.f3218q = new ArrayList();
    }

    /* JADX INFO: renamed from: A4 */
    public static /* synthetic */ void m3739A4() {
        hpd0 hpd0Var = f3212r;
        hpd0Var.put(Boolean.valueOf(!((Boolean) hpd0Var.get()).booleanValue()));
    }

    /* JADX INFO: renamed from: A5 */
    public static /* synthetic */ void m3740A5() {
        e51.q(dkg.b());
        lsi0.y("复制token成功");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A6 */
    public /* synthetic */ void m3741A6() {
        Intent intentP2 = ProfileAct.p2(act(), qib0.b0.a.userId(), "edit_data_button", false, true);
        intentP2.putExtra("preview_type", 0);
        intentP2.putExtra("REFACTOR_TAG", false);
        act().startActivity(intentP2);
    }

    /* JADX INFO: renamed from: B5 */
    public static /* synthetic */ void m3743B5(Bundle bundle) {
        if (bundle != null && SystemClock.elapsedRealtime() - TantanApp.f > 600000) {
            CoreModule.N().Um("recover NewMainAct");
        }
        f7r.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B6 */
    public /* synthetic */ void m3744B6() {
        Intent intentP2 = ProfileAct.p2(act(), qib0.b0.a.userId(), "edit_data_button", false, true);
        intentP2.putExtra("preview_type", 0);
        intentP2.putExtra("REFACTOR_TAG", true);
        act().startActivity(intentP2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C6 */
    public /* synthetic */ void m3747C6() {
        ((Act) this).act.startActivity(b1c.i(act(), "test"));
    }

    /* JADX INFO: renamed from: D4 */
    public static /* synthetic */ void m3748D4(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("debug_open")) {
            k.C3(true);
            return;
        }
        if (charSequence.equals("debug_close")) {
            k.C3(false);
        } else if (charSequence.equals("staging1")) {
            k.D3("http://m.staging1.p1staff.com/monetization/codapay/?from=");
        } else if (charSequence.equals("staging2")) {
            k.D3("http://m.staging2.p1staff.com/monetization/codapay/?from=");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D6 */
    public /* synthetic */ void m3750D6() {
        j2e0.m(this, Uri.parse("tantanapp://jumpToMarket?iosLink=xxx&original=test&apkName=com.p1.mobile.putong&&fallback=https%3A%2F%2Ftantanapp.com%2F&appType=tantan"));
    }

    /* JADX INFO: renamed from: E4 */
    public static /* synthetic */ void m3751E4(Throwable th) {
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ void m3752E5(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("刷新接口")) {
            CoreModule.c.h1.k3();
        } else if (charSequence.equals("本地添加一个banner")) {
            CoreModule.c.h1.m3();
        } else if (charSequence.equals("本地添加一篇文章")) {
            CoreModule.c.h1.l3();
        }
    }

    /* JADX INFO: renamed from: G5 */
    private void m3756G5() {
        PopupWindow popupWindow = new PopupWindow();
        this.f3216o = popupWindow;
        popupWindow.setContentView(act().inflater().inflate(f6c0.te, (ViewGroup) null, false));
        this.f3216o.setInputMethodMode(1);
        this.f3216o.setWidth(0);
        this.f3216o.setHeight(0);
    }

    /* JADX INFO: renamed from: H5 */
    public static void m3758H5(Context context, Intent intent) {
        intent.setClass(context, NewMainAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H6 */
    public /* synthetic */ void m3759H6() {
        duringCreated(CoreModule.c.r2.p3("swipe")).subscribe(mkd0.H(new e30() { // from class: l.mw20
            public final void call(Object obj) {
                this.f17124a.m3855G6((List) obj);
            }
        }, new e30() { // from class: l.nw20
            public final void call(Object obj) {
                NewMainAct.m3806h5((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I5 */
    public static Intent m3761I5(Context context, NavigationIntent navigationIntent) {
        return m3763J5(context, navigationIntent, null);
    }

    /* JADX INFO: renamed from: J4 */
    public static /* synthetic */ void m3762J4() {
    }

    /* JADX INFO: renamed from: J5 */
    public static Intent m3763J5(Context context, NavigationIntent navigationIntent, NavigationCardIntent navigationCardIntent) {
        return m3766K5(context, navigationIntent, navigationCardIntent, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J6 */
    public /* synthetic */ void m3764J6() {
        duringCreated(CoreModule.c.r2.p3("message")).subscribe(mkd0.H(new e30() { // from class: l.qw20
            public final void call(Object obj) {
                this.f19561a.m3857I6((List) obj);
            }
        }, new e30() { // from class: l.rw20
            public final void call(Object obj) {
                NewMainAct.m3751E4((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K5 */
    public static Intent m3766K5(Context context, NavigationIntent navigationIntent, NavigationCardIntent navigationCardIntent, Map<String, String> map) {
        return m3768L5(context, navigationIntent, navigationCardIntent, map, -1L);
    }

    /* JADX INFO: renamed from: L5 */
    public static Intent m3768L5(Context context, NavigationIntent navigationIntent, NavigationCardIntent navigationCardIntent, Map<String, String> map, long j) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        if (NullChecker.a(navigationIntent)) {
            intent.putExtra("extra_navigation_to_tenum", (Serializable) navigationIntent);
        }
        if (NullChecker.a(navigationCardIntent)) {
            intent.putExtra("extra_navigation_card_to", (Serializable) navigationCardIntent);
        }
        if (j > 0) {
            intent.putExtra("extra_heartbeat_expire_time", j);
        }
        if (TEnum.equals(navigationIntent, "moment")) {
            return null;
        }
        if (NullChecker.a(map) && map.size() > 0) {
            intent.putExtra("extra_param_2", new HashMap(map));
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L6 */
    public /* synthetic */ void m3769L6() {
        zd0.H(this).O();
    }

    /* JADX INFO: renamed from: M5 */
    public static Intent m3771M5(Context context, NavigationIntent navigationIntent) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        if (NullChecker.a(navigationIntent)) {
            intent.putExtra("extra_navigation_to_tenum", (Serializable) navigationIntent);
            intent.putExtra("extra_scroll_to_setting_bottom", true);
        }
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M6 */
    public /* synthetic */ void m3772M6() {
        new sj5.C1191a(((Act) this).act).m22227k(String.format("完善资料，认识更多理想%s", m3872W5(false))).m22226j("丰富的资料更受欢迎，同时可向你推荐更多符合你的理想型的人").m22222f("https://auto.tancdn.com/v1/raw/e2aa538c-be50-4e82-94af-5ed7d02c0a8b14.webp").m22219c(new View.OnClickListener() { // from class: l.gw20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13794a.m3860K6(view);
            }
        }).m22217a().show();
    }

    /* JADX INFO: renamed from: N4 */
    public static /* synthetic */ void m3773N4() {
        String str = "is_fake_avatar_query_" + CoreModule.H().userId();
        Boolean bool = Boolean.FALSE;
        new hpd0(str, bool).put(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N6 */
    public /* synthetic */ void m3774N6() {
        lva.D(((Act) this).act, Uri.parse("tantan://profile/edit?mode=dating&from=from_ideal_type_mine_tab_guide"));
    }

    /* JADX INFO: renamed from: O5 */
    public static Intent m3776O5(Context context, boolean z) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.addFlags(67108864);
        intent.putExtra("extra_to_caption", z);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O6 */
    public /* synthetic */ void m3777O6() {
        lva.D(((Act) this).act, Uri.parse("tantan://moment/detail?uid=-1&mid=3434451013413637115&web=1"));
    }

    /* JADX INFO: renamed from: P5 */
    public static Intent m3779P5(Context context, boolean z, boolean z2) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.addFlags(268468224);
        intent.putExtra("EXTRA_SHOW_TUTORIAL", z);
        intent.putExtra("extra_show_secret_crush_introduction", z2);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: P6 */
    public /* synthetic */ void m3780P6() {
        Act act = ((Act) this).act;
        act.startActivity(LoveLetterAct.m3615Z1(act));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q6 */
    public /* synthetic */ void m3782Q6() {
        if (CoreModule.c.U != null) {
            f8c.o().j();
        }
        new Handler(Looper.getMainLooper()).postDelayed(new RunnableC0254a(), 500L);
    }

    /* JADX INFO: renamed from: R5 */
    private boolean m3784R5(MotionEvent motionEvent, boolean z) {
        PutongFrag putongFragM4494o6 = ((C0260a) this.f3223h).m4494o6();
        if (!(putongFragM4494o6 instanceof HomeLayoutFrag)) {
            if (putongFragM4494o6 instanceof NewNewHomeFrag) {
                return ((NewNewHomeFrag) putongFragM4494o6).m689D4(motionEvent, z);
            }
            return false;
        }
        PutongFrag putongFragM2479V4 = ((HomeLayoutFrag) putongFragM4494o6).m2479V4();
        if (putongFragM2479V4 instanceof NewNewHomeFrag) {
            return putongFragM2479V4.D4(motionEvent, z);
        }
        return false;
    }

    /* JADX INFO: renamed from: T6 */
    public static Intent m3787T6(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.putExtra(str, str2);
        return intent;
    }

    /* JADX INFO: renamed from: U6 */
    public static Intent m3789U6(Context context, String str, int i, int i2, boolean z) {
        Intent intentM3791V6 = m3791V6(context, str, i, z);
        intentM3791V6.putExtra("extra_message_push_type", i2);
        return intentM3791V6;
    }

    /* JADX INFO: renamed from: V6 */
    public static Intent m3791V6(Context context, String str, int i, boolean z) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.putExtra("extra_message_user_id", str);
        intent.putExtra("from", i);
        intent.putExtra("extra_to_message", true);
        intent.putExtra("media_keyboard", z);
        return intent;
    }

    /* JADX INFO: renamed from: W6 */
    public static Intent m3793W6(Context context, NavigationIntent navigationIntent, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        if (NullChecker.a(navigationIntent)) {
            intent.putExtra("extra_navigation_to_tenum", (Serializable) navigationIntent);
        }
        intent.putExtra(str, str2);
        return intent;
    }

    /* JADX INFO: renamed from: X4 */
    public static /* synthetic */ void m3794X4() {
        SliderData sliderDataNew_ = SliderData.new_();
        sliderDataNew_.uuid = "asldfjsiofui283sdhf9s08923jkdsjfi";
        sliderDataNew_.supplier = 0;
        sliderDataNew_.retryClose = 0;
        sliderDataNew_.delayClose = 0;
        sliderDataNew_.allowClose = 1;
        vjf0.m23406e().m23426v(sliderDataNew_);
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m3798b5() {
        CoreModule.c.e0.p2.put("");
        CoreModule.c.e0.o2.put(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c4 */
    public /* synthetic */ void m3799c4() {
        qib0.Y.k().subscribe(mkd0.G(new e30() { // from class: l.jw20
            public final void call(Object obj) {
                this.f15341a.m3913z6((String) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: c5 */
    public static /* synthetic */ void m3800c5() {
        SliderData sliderDataNew_ = SliderData.new_();
        sliderDataNew_.uuid = "asldfjsiofui283sdhf9s08923jkdsjfi";
        sliderDataNew_.supplier = 0;
        sliderDataNew_.retryClose = 2;
        sliderDataNew_.delayClose = 5;
        sliderDataNew_.allowClose = 0;
        vjf0.m23406e().m23426v(sliderDataNew_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f4 */
    public /* synthetic */ void m3803f4(c cVar) {
        if (cVar == c.m) {
            m3863Q5();
        }
    }

    /* JADX INFO: renamed from: h5 */
    public static /* synthetic */ void m3806h5(Throwable th) {
    }

    /* JADX INFO: renamed from: h6 */
    public static Intent m3807h6(Context context, IntentParams intentParams) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.putExtra("extra_navigation_to_tenum", (Serializable) NavigationIntent.get("live"));
        intent.putExtra("main_jump_live_tag", intentParams);
        intent.putExtra("main_jump_live_has_params", true);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i6 */
    public /* synthetic */ void m3809i6() {
        dialog().f0(new String[]{"debug_open", "debug_close", "staging1", "staging2"}).g0(new Dialog.g() { // from class: l.ow20
            /* JADX INFO: renamed from: a */
            public final void m20036a(Dialog dialog, View view, int i, CharSequence charSequence) {
                NewMainAct.m3748D4(dialog, view, i, charSequence);
            }
        }).z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j6 */
    public /* synthetic */ void m3812j6() {
        dialog().f0(new String[]{"open", "close", "上传数据"}).g0(new C0255b()).z0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k6 */
    public /* synthetic */ void m3815k6() {
        dialog().f0(new String[]{"刷新接口", "本地添加一个banner", "本地添加一篇文章"}).g0(new Dialog.g() { // from class: l.sw20
            /* JADX INFO: renamed from: a */
            public final void m22407a(Dialog dialog, View view, int i, CharSequence charSequence) {
                NewMainAct.m3752E5(dialog, view, i, charSequence);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: k7 */
    public static Intent m3816k7(Context context) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.addFlags(67108864);
        intent.putExtra("extra_to_conversation", true);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l6 */
    public /* synthetic */ void m3819l6() {
        myf.m18697S(((Act) this).act, "netPictureDlg");
    }

    /* JADX INFO: renamed from: l7 */
    public static Intent m3820l7(Context context) {
        Intent intent = new Intent(context, (Class<?>) NewMainAct.class);
        intent.addFlags(67108864);
        intent.putExtra("navigation_to_picks", true);
        return intent;
    }

    /* JADX INFO: renamed from: m5 */
    public static /* synthetic */ void m3822m5() {
        if (upa.N3()) {
            ExpandedCardStyleHelper.m2063i();
        }
    }

    /* JADX INFO: renamed from: o4 */
    public static /* synthetic */ void m3825o4() {
    }

    /* JADX INFO: renamed from: p5 */
    public static /* synthetic */ void m3828p5() {
    }

    /* JADX INFO: renamed from: r5 */
    public static /* synthetic */ void m3832r5() {
        hpd0 hpd0Var = xsy.j;
        Boolean bool = Boolean.FALSE;
        hpd0Var.put(bool);
        xsy.k.put(bool);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v6 */
    public /* synthetic */ void m3841v6() {
        String json = CoreModule.c.e0.na().toJson();
        for (int i = 0; i < 10000; i++) {
            try {
                this.f3218q.add((User) User.JSON_ADAPTER.parse(json));
            } catch (IOException e) {
                CrashHelper.c(e);
                aag0.a(e);
                return;
            }
        }
        lsi0.j("debugUserList.size=" + this.f3218q.size());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x6 */
    public /* synthetic */ void m3846x6() {
        e51.y(new Runnable() { // from class: l.tw20
            @Override // java.lang.Runnable
            public final void run() {
                this.f20887a.m3841v6();
            }
        });
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m3851E3() {
        dialog().f0(new String[]{"start", "vip商品查询", "探探币查询", "boost"}).g0(new Dialog.g() { // from class: l.fw20
            /* JADX INFO: renamed from: a */
            public final void m14596a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f13184a.m3903p6(dialog, view, i, charSequence);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: E6 */
    public final /* synthetic */ void m3852E6(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("右滑无配对引导")) {
            DatingGuideData datingGuideDataNew_ = DatingGuideData.new_();
            datingGuideDataNew_.titles.add(String.format(Locale.getDefault(), "刚刚看过的%d个%s更想了解你的兴趣爱好", Integer.valueOf(CoreModule.c.m0.y0), CoreModule.c.e0.p9().isFemale() ? "男生" : "女生"));
            datingGuideDataNew_.subTitles.add("添加生活照展示你的兴趣爱好，更容易配对");
            datingGuideDataNew_.button = "立即添加";
            datingGuideDataNew_.pageId = "p_add_lifestyle_guidance";
            datingGuideDataNew_.deeplink = "tantan://profile/edit?mode=guidePicAndTag&from=right_swipe_add_lifestyle";
            datingGuideDataNew_.pictures.add(CoreModule.c.e0.p9().isFemale() ? "https://auto.tancdn.com/v1/raw/8da6f26f-c9b6-440e-9bbc-57f1a124a66f14.webp" : "https://auto.tancdn.com/v1/raw/484a6490-eca3-4af1-bf18-0b43971e70c114.webp");
            datingGuideDataNew_.buttonId = "e_add_lifestyle";
            new v7c.b(((Act) this).act).c(datingGuideDataNew_).b("right_swipe_no_match").a().show();
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
            if (upa.z()) {
                datingGuideDataNew_2.pictures = vwb.M("https://auto.tancdn.com/v1/images/eyJpZCI6IkxNM042TTU3VTUyNkY2MlpaTEY3TUw1UVNGVklOVjE0IiwidyI6NDIwLCJoIjozMzAsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo1ODUzMjgzMTUyNjkxMzN9.png");
            }
            datingGuideDataNew_2.buttonId = "e_complete_profile";
            new v7c.b(act()).c(datingGuideDataNew_2).a().show();
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
            new v7c.b(act()).c(datingGuideDataNew_3).a().show();
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
            new v7c.b(act()).c(datingGuideDataNew_4).a().show();
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
            new v7c.b(act()).c(datingGuideDataNew_5).a().show();
        }
    }

    @Override // p009l.tsi0
    /* JADX INFO: renamed from: F */
    public boolean mo522F() {
        return !((C0260a) this.f3223h).m4356G7(TabName.Me);
    }

    /* JADX INFO: renamed from: F6 */
    public final /* synthetic */ void m3853F6() {
        dialog().f0(new String[]{"右滑无配对引导", "连续左滑引导", "老用户引导给照片加标签", "老用户引导给旧标签配图", "收到喜欢很少引导上传生活照"}).g0(new Dialog.g() { // from class: l.pw20
            /* JADX INFO: renamed from: a */
            public final void m20732a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f18935a.m3852E6(dialog, view, i, charSequence);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m3854G3() {
        ark.Q0(((Act) this).act, ((Media) CoreModule.c.e0.p9().picture(0)).url, new d30() { // from class: l.hw20
            public final void call() {
                NewMainAct.m3828p5();
            }
        });
    }

    /* JADX INFO: renamed from: G6 */
    public final /* synthetic */ void m3855G6(List list) {
        if (vwb.J(list) || act().isDialogShowing()) {
            return;
        }
        lbm lbmVar = new lbm(act());
        lbmVar.m17808U(list, "swipe");
        lbmVar.show();
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m3856I3() {
        mx0.I(act(), false, 5.0f, "test");
    }

    /* JADX INFO: renamed from: I6 */
    public final /* synthetic */ void m3857I6(List list) {
        if (vwb.J(list) || act().isDialogShowing()) {
            return;
        }
        lbm lbmVar = new lbm(act());
        lbmVar.m17808U(list, "conversation");
        lbmVar.show();
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m3858J3() {
        act().dialog().F("活跃天数: " + mx0.o().d.get() + "\n当天打开次数: " + mx0.o().c.get() + "\n当天打开时间（秒）: " + mx0.o().b.get() + "\n当天接受消息: " + a.j().k.get() + "\n当天发送消息: " + a.j().l.get() + "\n当前语言是否满足入组条件：false").z0();
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m3859K3() {
        PermissionHelper.m10211c().m10229r("android.permission.CAMERA").m10234w(false).m10232u(true).m10221j(false).m10226o(new d30() { // from class: l.iw20
            public final void call() {
                this.f14838a.m3906s6();
            }
        }).m10220i(((Act) this).act);
    }

    /* JADX INFO: renamed from: K6 */
    public final /* synthetic */ void m3860K6(View view) {
        km90.l(((Act) this).act);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m3861L3() {
        C0501b.m9669a(this);
    }

    /* JADX INFO: renamed from: N5 */
    public void m3862N5(TabName tabName) {
        m4005t3(tabName, false);
    }

    /* JADX INFO: renamed from: Q5 */
    public void m3863Q5() {
        if (NullChecker.a(this.f3216o) && this.f3216o.isShowing()) {
            this.f3216o.dismiss();
            this.f3216o = null;
        }
    }

    /* JADX INFO: renamed from: R6 */
    public final /* synthetic */ void m3864R6(int i) {
        m3867T5();
    }

    /* JADX INFO: renamed from: S5 */
    public rx.c<Boolean> m3865S5() {
        return ((C0260a) this.f3223h).f3274E;
    }

    /* JADX INFO: renamed from: S6 */
    public final Frag m3866S6() {
        TabName tabNameH = v930.h();
        if (tabNameH != null) {
            return ((C0260a) this.f3223h).m4506r6(tabNameH);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T5 */
    public int m3867T5() {
        Resources resources;
        int identifier;
        ((Act) this).act.setNavigationBarColor(0);
        ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
        if (viewGroup != null) {
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                if (viewGroup.getChildAt(i).getId() != -1 && "navigationBarBackground".equals(getResources().getResourceEntryName(viewGroup.getChildAt(i).getId()))) {
                    if (q8l.m20838c(((Act) this).act) && (identifier = (resources = act().getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
                        return resources.getDimensionPixelSize(identifier);
                    }
                    return 0;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: U5 */
    public C0260a.v m3868U5() {
        return ((C0260a) this.f3223h).m25149d1();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m3869V3() {
        new yk5(this).show();
    }

    /* JADX INFO: renamed from: V5 */
    public C0260a m3870V5() {
        return (C0260a) this.f3223h;
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m3871W3() {
        try {
            File file = new File(act().getFilesDir(), "effectCache");
            if (file.exists()) {
                rhi.l(file);
                lsi0.y("直播特效删除成功");
            }
        } catch (IOException unused) {
        }
    }

    /* JADX INFO: renamed from: W5 */
    public final String m3872W5(boolean z) {
        User userP9 = CoreModule.c.e0.p9();
        if (TEnum.equals(userP9.settings.getLookingFor(), LookingFor.get(userP9.isFemale() ? "female" : "male"))) {
            if (z) {
                return userP9.isFemale() ? "她们" : "他们";
            }
            return userP9.isFemale() ? "女生" : "男生";
        }
        if (z) {
            return userP9.isFemale() ? "他们" : "她们";
        }
        return userP9.isFemale() ? "男生" : "女生";
    }

    /* JADX INFO: renamed from: X5 */
    public View m3873X5(TabName tabName) {
        P p = this.f3223h;
        if (p instanceof C0260a) {
            return ((C0260a) p).m4514t6(tabName);
        }
        return null;
    }

    /* JADX INFO: renamed from: X6 */
    public void m3874X6() {
        this.f3217p = false;
    }

    /* JADX INFO: renamed from: Y5 */
    public j760<String, String> m3875Y5() {
        Fragment fragmentM4494o6 = ((C0260a) this.f3223h).m4494o6();
        if (CoreModule.Q().isLiveSquareHome(fragmentM4494o6)) {
            return vwb.Y(CoreModule.Q().getTopShowingPageId(fragmentM4494o6), "");
        }
        if (CoreModule.N().isPhotoAlbumFrag(fragmentM4494o6)) {
            return vwb.Y(CoreModule.N().getTopShowingPageId(fragmentM4494o6), "");
        }
        if (fragmentM4494o6 instanceof ConversationsTabFrag) {
            return ((ConversationsTabFrag) fragmentM4494o6).m5724G5();
        }
        if (fragmentM4494o6 instanceof ProfileFrag) {
            return vwb.Y("p_navigation_view", "");
        }
        return NullChecker.a(fragmentM4494o6) ? vwb.Y(fragmentM4494o6.pageId(), "") : vwb.Y("", "");
    }

    @Deprecated
    /* JADX INFO: renamed from: Y6 */
    public void m3876Y6(TabName tabName, boolean z) {
        ((C0260a) this.f3223h).m4517t9(tabName, z);
    }

    /* JADX INFO: renamed from: Z5 */
    public NewMainViewModel m3877Z5() {
        return this.f3214m;
    }

    /* JADX INFO: renamed from: Z6 */
    public void m3878Z6(boolean z) {
        ((C0260a) this.f3223h).m4521u9(z);
    }

    /* JADX INFO: renamed from: a6 */
    public void m3879a6() {
        ((C0260a) this.f3223h).m4523v6();
    }

    /* JADX INFO: renamed from: a7 */
    public void m3880a7() {
        ((C0260a) this.f3223h).m4525v9();
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m3881b4() {
        new pwf(this).show();
    }

    @Override // com.p000p1.mobile.putong.core.newui.main.NewMainBaseAct
    /* JADX INFO: renamed from: b6, reason: merged with bridge method [inline-methods] */
    public C0260a mo3911x3() {
        this.f3214m = new NewMainViewModel(act());
        C0260a c0260a = new C0260a(this);
        c0260a.m25144C(this.f3214m);
        return c0260a;
    }

    /* JADX INFO: renamed from: b7 */
    public void m3883b7(boolean z) {
        ((C0260a) this.f3223h).f3274E.onNext(Boolean.valueOf(z));
    }

    /* JADX INFO: renamed from: c6 */
    public boolean m3884c6() {
        return this.f3217p;
    }

    /* JADX INFO: renamed from: c7 */
    public void m3885c7(Boolean bool) {
        ((C0260a) this.f3223h).m4529w9(bool);
    }

    /* JADX INFO: renamed from: d6 */
    public boolean m3886d6() {
        return m3888e6(TabName.Card);
    }

    /* JADX INFO: renamed from: d7 */
    public Runnable m3887d7(Runnable runnable) {
        ((C0260a) this.f3223h).f3278r = runnable;
        return runnable;
    }

    @Override // com.p000p1.mobile.putong.core.newui.main.NewMainBaseAct
    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(vwb.Y("try add 10000 user in memory", new d30() { // from class: l.iu20
            public final void call() {
                this.f14812a.m3846x6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("try jump to market", new d30() { // from class: l.ku20
            public final void call() {
                this.f15856a.m3750D6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("showAiAlbumDlg", new d30() { // from class: l.wu20
            public final void call() {
                this.f22328a.m3769L6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Delete core database and kill self", new d30() { // from class: l.iv20
            public final void call() {
                this.f14827a.m3782Q6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("coda debug 测试", new d30() { // from class: l.uv20
            public final void call() {
                this.f21345a.m3809i6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("shadow string", new d30() { // from class: l.vv20
            public final void call() {
                this.f21801a.m3812j6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("活动中心", new d30() { // from class: l.wv20
            public final void call() {
                this.f22335a.m3815k6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("下载动态表情", new d30() { // from class: l.xv20
            public final void call() {
                xxe.h().e();
            }
        }));
        arrayListDebugItems.add(vwb.Y("展示头像审核弹窗", new d30() { // from class: l.yv20
            public final void call() {
                this.f23252a.m3819l6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("头像审核弹窗商业策略请求缓存清除", new d30() { // from class: l.zv20
            public final void call() {
                NewMainAct.m3773N4();
            }
        }));
        arrayListDebugItems.add(vwb.Y("sku流程优化", new d30() { // from class: l.tu20
            public final void call() {
                this.f20872a.m3851E3();
            }
        }));
        arrayListDebugItems.add(vwb.Y("是否是当日登录用户：" + CoreModule.H().Jr(), new d30() { // from class: l.ev20
            public final void call() {
                NewMainAct.m3762J4();
            }
        }));
        arrayListDebugItems.add(vwb.Y("change title !!!!!", new d30() { // from class: l.pv20
            public final void call() {
                this.f18932a.m3904q6();
            }
        }));
        final PutongFrag putongFragI0 = fragmentManager().i0(((C0260a) this.f3223h).m25147b1().toString());
        if (putongFragI0 instanceof NewNewHomeFrag) {
            arrayListDebugItems.addAll(((NewNewHomeFrag) putongFragI0).m688C4());
        } else if (putongFragI0 instanceof HomeLayoutFrag) {
            arrayListDebugItems.addAll(((HomeLayoutFrag) putongFragI0).m2521C4());
        } else if (putongFragI0 instanceof PutongFrag) {
            Collection<? extends j760<String, d30>> collectionC4 = putongFragI0.C4();
            if (!vwb.J(collectionC4)) {
                arrayListDebugItems.addAll(collectionC4);
            }
        }
        ht20.m15950A(arrayListDebugItems, this);
        arrayListDebugItems.add(vwb.Y("good2fake dialog", new d30() { // from class: l.aw20
            public final void call() {
                this.f9715a.m3854G3();
            }
        }));
        arrayListDebugItems.add(vwb.Y("show screen size ", new d30() { // from class: l.lw20
            public final void call() {
                lsi0.y("【" + hmb.q1() + "," + hmb.p1() + "】");
            }
        }));
        arrayListDebugItems.add(vwb.Y("tantan star rank", new d30() { // from class: l.ww20
            public final void call() {
                this.f22345a.m3905r6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("tantan appstore rank guide", new d30() { // from class: l.cx20
            public final void call() {
                this.f10803a.m3856I3();
            }
        }));
        arrayListDebugItems.add(vwb.Y("show app store guide status", new d30() { // from class: l.dx20
            public final void call() {
                this.f12018a.m3858J3();
            }
        }));
        arrayListDebugItems.add(vwb.Y("qr_scan", new d30() { // from class: l.ex20
            public final void call() {
                this.f12707a.m3859K3();
            }
        }));
        arrayListDebugItems.add(new j760<>("进入照相页面", new d30() { // from class: l.ju20
            public final void call() {
                this.f15325a.m3907t6();
            }
        }));
        arrayListDebugItems.add(new j760<>("进入RemoteConfig信息页", new d30() { // from class: l.lu20
            public final void call() {
                this.f16414a.m3861L3();
            }
        }));
        arrayListDebugItems.add(new j760<>("触发升级下载弹框", new d30() { // from class: l.mu20
            public final void call() {
                this.f17109a.m3908u6();
            }
        }));
        arrayListDebugItems.add(new j760<>("实拍气泡引导" + f3212r.get(), new d30() { // from class: l.nu20
            public final void call() {
                NewMainAct.m3739A4();
            }
        }));
        arrayListDebugItems.add(new j760<>("测试读取本地token", new d30() { // from class: l.ou20
            public final void call() {
                vjf0.m23406e().m23414i();
            }
        }));
        arrayListDebugItems.add(new j760<>("测试写入本地token：非空", new d30() { // from class: l.pu20
            public final void call() {
                NewMainAct.m3794X4();
            }
        }));
        arrayListDebugItems.add(new j760<>("测试写入本地token：非空", new d30() { // from class: l.qu20
            public final void call() {
                NewMainAct.m3800c5();
            }
        }));
        arrayListDebugItems.add(new j760<>("测试写入本地token：空", new d30() { // from class: l.ru20
            public final void call() {
                vjf0.m23406e().m23426v(null);
            }
        }));
        arrayListDebugItems.add(new j760<>("实拍Tips引导" + xsy.j.get(), new d30() { // from class: l.su20
            public final void call() {
                NewMainAct.m3832r5();
            }
        }));
        arrayListDebugItems.add(new j760<>("隐私协议", new d30() { // from class: l.uu20
            public final void call() {
                this.f21336a.m3869V3();
            }
        }));
        arrayListDebugItems.add(new j760<>("清除直播间特效文件", new d30() { // from class: l.vu20
            public final void call() {
                this.f21789a.m3871W3();
            }
        }));
        arrayListDebugItems.add(new j760<>("当前运行环境：".concat(dt3.m13469a(App.e) ? "64Bit" : "32Bit"), new d30() { // from class: l.xu20
            public final void call() {
                NewMainAct.m3825o4();
            }
        }));
        arrayListDebugItems.add(new j760<>("firebasetoken", new d30() { // from class: l.yu20
            public final void call() {
                NewMainAct.m3740A5();
            }
        }));
        arrayListDebugItems.add(new j760<>("firebase安装ID", new d30() { // from class: l.zu20
            public final void call() {
                dkg.a();
            }
        }));
        arrayListDebugItems.add(new j760<>("网图Fake弹窗", new d30() { // from class: l.av20
            public final void call() {
                this.f9704a.m3912y6(putongFragI0);
            }
        }));
        arrayListDebugItems.add(new j760<>("网图Fake协议弹窗", new d30() { // from class: l.bv20
            public final void call() {
                this.f10321a.m3881b4();
            }
        }));
        arrayListDebugItems.add(new j760<>("认证弹框清理", new d30() { // from class: l.cv20
            public final void call() {
                NewMainAct.m3798b5();
            }
        }));
        arrayListDebugItems.add(new j760<>("asset数据", new d30() { // from class: l.dv20
            public final void call() {
                this.f12010a.m3799c4();
            }
        }));
        arrayListDebugItems.add(vwb.Y("弹出先发like弹窗", new d30() { // from class: l.fv20
            public final void call() {
                xdx.m24778A().m24809N(((DbObject) CoreModule.K().me_()).id);
            }
        }));
        arrayListDebugItems.add(vwb.Y("Profile Edit Online", new d30() { // from class: l.gv20
            public final void call() {
                this.f13777a.m3741A6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Profile Edit Refactor", new d30() { // from class: l.hv20
            public final void call() {
                this.f14261a.m3744B6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Profile Picks", new d30() { // from class: l.jv20
            public final void call() {
                this.f15337a.m3747C6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Profile Picks Entry Notify", new d30() { // from class: l.kv20
            public final void call() {
                CoreModule.N().p6(true);
            }
        }));
        arrayListDebugItems.add(vwb.Y("Dating MyTab Guide", new d30() { // from class: l.lv20
            public final void call() {
                CoreModule.c.r2.m3();
            }
        }));
        arrayListDebugItems.add(vwb.Y("Profile Guide", new d30() { // from class: l.mv20
            public final void call() {
                this.f17118a.m3853F6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("ideal guide dialog in SWIPE", new d30() { // from class: l.nv20
            public final void call() {
                this.f17748a.m3759H6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("ideal guide dialog in Conversation", new d30() { // from class: l.ov20
            public final void call() {
                this.f18260a.m3764J6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("ideal profile guide dialog", new d30() { // from class: l.qv20
            public final void call() {
                this.f19558a.m3772M6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("ideal profile mine tab guide", new d30() { // from class: l.rv20
            public final void call() {
                this.f19989a.m3774N6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("deeplink: moment detail", new d30() { // from class: l.sv20
            public final void call() {
                this.f20478a.m3777O6();
            }
        }));
        arrayListDebugItems.add(vwb.Y("love letter act", new d30() { // from class: l.tv20
            public final void call() {
                this.f20879a.m3780P6();
            }
        }));
        return arrayListDebugItems;
    }

    public boolean disableAutoPV() {
        return true;
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return m3784R5(motionEvent, false) || super.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: e6 */
    public boolean m3888e6(TabName tabName) {
        return ((C0260a) this.f3223h).m4356G7(tabName);
    }

    /* JADX INFO: renamed from: e7 */
    public void m3889e7(TabName tabName, int i) {
        ((C0260a) this.f3223h).m4537y9(tabName, i);
    }

    /* JADX INFO: renamed from: f6 */
    public boolean m3890f6(TabName tabName) {
        return ((C0260a) this.f3223h).m4356G7(tabName);
    }

    /* JADX INFO: renamed from: f7 */
    public void m3891f7() {
        ((C0260a) this.f3223h).f3280t.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: g6 */
    public boolean m3892g6() {
        return ((C0260a) this.f3223h).m4364I7();
    }

    /* JADX INFO: renamed from: g7 */
    public void m3893g7(CharSequence charSequence, String str, Figure figure, String str2, double d, d30 d30Var) {
        ((C0260a) this.f3223h).m4366I9(charSequence, str, figure, str2, d, d30Var);
    }

    public String getPopLifeName() {
        Frag fragM3866S6 = m3866S6();
        return fragM3866S6 != null ? fragM3866S6.getPopLifeName() : super/*com.p1.mobile.android.app.Act*/.getPopLifeName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h7 */
    public void m3894h7() {
        final int iM3867T5 = m3867T5();
        e51.F(this, new Runnable() { // from class: l.bx20
            @Override // java.lang.Runnable
            public final void run() {
                this.f10345a.m3864R6(iM3867T5);
            }
        });
    }

    /* JADX INFO: renamed from: i7 */
    public rx.c<TabName> m3895i7() {
        return ((C0260a) this.f3223h).m4390O9();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        y8i0.m25203a("NewMainAct inflateView");
        LaunchStep launchStep = LaunchStep.MainActInflate;
        yni.m25474f(launchStep);
        View viewM4349E7 = ((C0260a) this.f3223h).m4349E7(layoutInflater, viewGroup);
        yni.m25472d(launchStep);
        if (!CoreModule.N().qg()) {
            y8i0.m25204b();
            return viewM4349E7;
        }
        act().setUpKeyboardDetectorLayout(new View(act()), getWindow().getDecorView(), new f30() { // from class: l.cw20
            public final void call(Object obj, Object obj2) {
                NewMainAct.f3213s.onNext(new j760((Boolean) obj, (Integer) obj2));
            }
        });
        if (hm7.b()) {
            m3756G5();
        }
        y8i0.m25204b();
        return viewM4349E7;
    }

    @Override // com.p000p1.mobile.putong.core.newui.main.NewMainBaseAct
    public void initDataOnCreate() {
        y8i0.m25203a("NewMainAct initDataOnCreate");
        yni.m25472d(LaunchStep.MainStartWait);
        yni.m25474f(LaunchStep.NewMainCreate, LaunchStep.HomeFragWait);
        super.initDataOnCreate();
        creates(new e30() { // from class: l.dw20
            public final void call(Object obj) {
                NewMainAct.m3743B5((Bundle) obj);
            }
        }, new d30() { // from class: l.ew20
            public final void call() {
                NewMainAct.m3822m5();
            }
        });
        y8i0.m25204b();
    }

    @Override // com.p000p1.mobile.putong.core.newui.main.NewMainBaseAct
    public void initSubscription() {
        y8i0.m25203a("NewMainAct initSubscription");
        super.initSubscription();
        if (CoreModule.N().qg() && hm7.b()) {
            lifecycle().subscribe(mkd0.G(new e30() { // from class: l.bw20
                public final void call(Object obj) {
                    this.f10337a.m3803f4((c) obj);
                }
            }));
        }
        y8i0.m25204b();
    }

    public boolean isAnonymousMode() {
        return (m3888e6(TabName.Card) || m3888e6(TabName.Live)) ? false : true;
    }

    /* JADX INFO: renamed from: j7 */
    public TabName m3896j7() {
        return ((C0260a) this.f3223h).m4394P9();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m6 */
    public final /* synthetic */ rx.c m3897m6(List list) {
        return igj.M(this, list);
    }

    /* JADX INFO: renamed from: m7 */
    public void m3898m7(boolean z) {
        ((C0260a) this.f3223h).f3273D = true;
        this.f3214m.m4051J0(z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n6 */
    public final /* synthetic */ rx.c m3899n6(List list) {
        return igj.M(this, list);
    }

    /* JADX INFO: renamed from: n7 */
    public void m3900n7() {
        ((C0260a) this.f3223h).m4533x9();
    }

    public boolean needBindBillingService() {
        return true;
    }

    public boolean needMarkResume() {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o6 */
    public final /* synthetic */ rx.c m3901o6(List list) {
        return igj.M(this, list);
    }

    /* JADX INFO: renamed from: o7 */
    public void m3902o7(boolean z) {
        ((C0260a) this.f3223h).f3273D = false;
        this.f3214m.m4059N0(z);
    }

    @Override // com.p000p1.mobile.putong.core.newui.main.NewMainBaseAct
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == v2h.a) {
            if (i2 == -1) {
                if (((C0260a) this.f3223h).m4469h9(intent.getExtras().getString("last_moment_id"))) {
                    return;
                }
            }
        } else if (i == 1012) {
            if (intent == null || intent.getExtras() == null) {
                lsi0.y("打开失败，请重试");
                return;
            }
            Bundle extras = intent.getExtras();
            String string = extras.getInt("result_type") == 1 ? extras.getString("result_string") : "";
            if (TextUtils.isEmpty(string)) {
                lsi0.y("打开失败，请重试");
                return;
            }
            try {
                if (!string.startsWith("tantan") && !string.startsWith("tantanapp") && !string.startsWith("tantantribe")) {
                    lva.D(act(), Uri.parse("tantanapp://webview?url=".concat(string)));
                    return;
                }
                lva.D(act(), Uri.parse(string));
                return;
            } catch (Exception unused) {
                lsi0.y("打开失败，请重试");
                return;
            }
        }
        if (qib0.b0.a.onActivityResultForSmartLock(i, i2, intent)) {
            return;
        }
        Fragment fragmentI0 = fragmentManager().i0(TabName.Msg.toString());
        if (NullChecker.a(fragmentI0)) {
            fragmentI0.onActivityResult(i, i2, intent);
        }
        Fragment fragmentI1 = fragmentManager().i0(TabName.Meet.toString());
        if (NullChecker.a(fragmentI1)) {
            fragmentI1.onActivityResult(i, i2, intent);
        }
        if (i == 4099 && i2 == -1) {
            ark.L0(act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f8209h));
        }
        if (i == 786 && i2 == -1) {
            String stringExtra = intent.getStringExtra("from");
            ArrayList<Media> arrayList = (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f8209h);
            if ("from_intl_pet_photo".equals(stringExtra)) {
                PutongFrag putongFragM4494o6 = ((C0260a) this.f3223h).m4494o6();
                if (NullChecker.b(arrayList) && !arrayList.isEmpty() && (putongFragM4494o6 instanceof HomeLayoutFrag)) {
                    NewNewHomeFrag newNewHomeFragM2479V4 = ((HomeLayoutFrag) putongFragM4494o6).m2479V4();
                    if (newNewHomeFragM2479V4 instanceof NewNewHomeFrag) {
                        newNewHomeFragM2479V4.f456C.m1357z5(arrayList);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        if (upa.o2() && i == 25) {
            PutongFrag putongFragM4494o7 = ((C0260a) this.f3223h).m4494o6();
            if (putongFragM4494o7 instanceof ProfileFrag) {
                putongFragM4494o7.onActivityResult(i, i2, intent);
            }
        }
        super.onActivityResult(i, i2, intent);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.app.Activity*/.onAttachedToWindow();
        y1j.m25170g("Activity AttachedToWindow");
        zvf0.D("e_main_displayed", "p_suggest_users_home_view", new j760[]{vwb.Y("displayed_time", Long.valueOf(System.currentTimeMillis() - this.f3215n))});
    }

    public void onBackPressed() {
        ((C0260a) this.f3223h).m4518u6();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onConfigurationChanged(configuration);
        CoreModule.c.e0.I1.onNext(Boolean.TRUE);
    }

    public void onDestroyLifecycle() {
        super/*com.p1.mobile.putong.core.ui.AutoReleaseVideoAct*/.onDestroyLifecycle();
        CoreModule.Q().m9019M6().m12083b();
        rw0.d(false);
    }

    public void onDialogAttachToWindow(android.app.Dialog dialog) {
        super/*com.p1.mobile.android.app.Act*/.onDialogAttachToWindow(dialog);
        if (m4004i4()) {
            this.f3214m.m4048I();
        }
    }

    public void onPickImagesResult(List<Media> list) {
        if (!NullChecker.a(list) || list.size() <= 0 || !(list.get(0) instanceof Video) || new r5l0(rhi.z(list.get(0).url)).b <= 60000) {
            CoreModule.N().toCaptionPage(((Act) this).act, list instanceof ArrayList ? (ArrayList) list : new ArrayList(list), false, (String) null);
        } else {
            lsi0.h(R.string.Ni);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onRestoreInstanceState(Bundle bundle) {
        bundle.setClassLoader(NewMainAct.class.getClassLoader());
        super/*android.app.Activity*/.onRestoreInstanceState(bundle);
        ((C0260a) this.f3223h).m4473i9(bundle);
    }

    public void onResumeFragments() {
        super/*androidx.fragment.app.FragmentActivity*/.onResumeFragments();
        ((C0260a) this.f3223h).m4477j9();
        Act.isActResumed = true;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*com.p1.mobile.putong.app.PutongAct*/.onSaveInstanceState(bundle);
        ((C0260a) this.f3223h).m4481k9(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onWindowFocusChanged(boolean z) {
        super/*android.app.Activity*/.onWindowFocusChanged(z);
        NewNewHomeFrag newNewHomeFragI0 = fragmentManager().i0(TabName.Card.toString());
        if (newNewHomeFragI0 instanceof NewNewHomeFrag) {
            newNewHomeFragI0.m705b5(z);
        }
        if (CoreModule.N().qg() && z && hm7.b() && NullChecker.a(this.f3216o) && !this.f3216o.isShowing()) {
            this.f3216o.setBackgroundDrawable(new ColorDrawable(0));
            this.f3216o.showAtLocation(((Act) this).act.getWindow().getDecorView(), 0, 0, 0);
        }
    }

    /* JADX INFO: renamed from: p6 */
    public final /* synthetic */ void m3903p6(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("start")) {
            igj.F();
            return;
        }
        if (charSequence.equals("vip商品查询")) {
            CoreModule.c.j0.y5(ProductCategory.get("tttVip")).filter(new w9j() { // from class: l.uw20
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).flatMap(new w9j() { // from class: l.vw20
                public final Object call(Object obj) {
                    return this.f21806a.m3897m6((List) obj);
                }
            }).subscribe();
        } else if (charSequence.equals("探探币查询")) {
            CoreModule.c.j0.y5(ProductCategory.get("coin")).filter(new w9j() { // from class: l.xw20
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).flatMap(new w9j() { // from class: l.yw20
                public final Object call(Object obj) {
                    return this.f23255a.m3899n6((List) obj);
                }
            }).subscribe();
        } else if (charSequence.equals("boost")) {
            CoreModule.c.j0.y5(ProductCategory.get("boost")).filter(new w9j() { // from class: l.zw20
                public final Object call(Object obj) {
                    return Boolean.valueOf(!((List) obj).isEmpty());
                }
            }).flatMap(new w9j() { // from class: l.ax20
                public final Object call(Object obj) {
                    return this.f9723a.m3901o6((List) obj);
                }
            }).subscribe();
        }
    }

    public String pageId() {
        P p = this.f3223h;
        return p != 0 ? ((C0260a) p).m4522v() : super/*com.p1.mobile.putong.app.PutongAct*/.pageId();
    }

    public rx.subjects.a<pc80> popLifeObs() {
        Frag fragM3866S6 = m3866S6();
        return fragM3866S6 == null ? super/*com.p1.mobile.android.app.Act*/.popLifeObs() : fragM3866S6.popLifeObs();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        CoreModule.c.m0.y2 = System.currentTimeMillis();
        y8i0.m25203a("NewMainAct preCreateView");
        yni.m25474f(LaunchStep.AsyncLayout);
        vi4.m23378a().mo12119g(this, this);
        setSwipeBackEnable(false);
        m4006w3();
        super/*com.p1.mobile.putong.app.PutongAct*/.preCreateView(bundle);
        setTransparentStatusBar();
        rw0.d(true);
        y8i0.m25204b();
    }

    /* JADX INFO: renamed from: q6 */
    public final /* synthetic */ void m3904q6() {
        setTitle("Tantan");
    }

    /* JADX INFO: renamed from: r6 */
    public final /* synthetic */ void m3905r6() {
        mx0.O(act(), "test");
    }

    /* JADX INFO: renamed from: s6 */
    public final /* synthetic */ void m3906s6() {
        Act act = ((Act) this).act;
        act.startActivityForResult(k8c.a(act), 1012);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTheme() {
        y8i0.m25203a("NewMainAct setTheme");
        LaunchStep launchStep = LaunchStep.ThemeChange;
        yni.m25474f(launchStep);
        if (NullChecker.a(getSupportActionBar())) {
            getSupportActionBar().A(0.0f);
        }
        getAppTheme().k(getWindow());
        yni.m25472d(launchStep);
        y8i0.m25204b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTransparentStatusBar() {
        super/*com.p1.mobile.putong.app.PutongAct*/.setTransparentStatusBar();
        if (m4004i4()) {
            Window window = getWindow();
            window.clearFlags(134217728);
            window.getDecorView().setSystemUiVisibility(1536);
            window.addFlags(Integer.MIN_VALUE);
            setNavigationBarColor(0);
        }
        if (NullChecker.a(CoreModule.c)) {
            CoreBusinessModule.m0().j(this);
        }
    }

    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    public boolean shouldSwitchToTransparentStatus() {
        return true;
    }

    public boolean shouldWrapContentViewWithTransparentHeader() {
        return false;
    }

    /* JADX INFO: renamed from: t6 */
    public final /* synthetic */ void m3907t6() {
        tvf.p(((Act) this).act, "dialog");
    }

    /* JADX INFO: renamed from: u6 */
    public final /* synthetic */ void m3908u6() {
        File file = new File(xxf0.b());
        if (file.exists()) {
            for (File file2 : file.listFiles()) {
                file2.delete();
            }
        }
        zrj0.x(this);
    }

    @Override // com.p000p1.mobile.putong.core.newui.main.NewMainBaseAct
    /* JADX INFO: renamed from: v3 */
    public String mo3909v3() {
        try {
            return getSupportFragmentManager().h0(u4c0.y4).getTag();
        } catch (Exception unused) {
            return NewNewHomeFrag.class.getSimpleName();
        }
    }

    /* JADX INFO: renamed from: w6 */
    public final /* synthetic */ void m3910w6(Fragment fragment) {
        r3g.i(((Act) this).act, (PutongFrag) fragment, 786);
    }

    /* JADX INFO: renamed from: y6 */
    public final /* synthetic */ void m3912y6(final Fragment fragment) {
        AppealInfo appealInfo = new AppealInfo();
        appealInfo.appeal_count = 0;
        appealInfo.status = "before";
        iwf.m16776e().m16778g(this, new Runnable() { // from class: l.kw20
            @Override // java.lang.Runnable
            public final void run() {
                this.f15866a.m3910w6(fragment);
            }
        }, appealInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z6 */
    public final /* synthetic */ void m3913z6(String str) {
        new Dialog.e(this).F("curMD5:" + ((String) qib0.Y.h.get()) + "\nData:" + str).z().show();
    }
}
