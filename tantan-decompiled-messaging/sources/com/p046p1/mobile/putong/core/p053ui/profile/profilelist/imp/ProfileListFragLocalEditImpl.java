package com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp;

import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4750p;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p046p1.mobile.putong.core.data.CategorySuggestions;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.DatingGuideData;
import com.p046p1.mobile.putong.core.data.FakeGuideData;
import com.p046p1.mobile.putong.core.data.Literatures;
import com.p046p1.mobile.putong.core.data.LiteraturesComments;
import com.p046p1.mobile.putong.core.data.MyTabTask;
import com.p046p1.mobile.putong.core.data.ProfileEditInfo;
import com.p046p1.mobile.putong.core.data.ProfileLikeType;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard;
import com.p046p1.mobile.putong.core.newui.view.PicCertGuideView;
import com.p046p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p046p1.mobile.putong.core.p053ui.account.JailedDialogLikeAct;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.MediaReorderCards;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCard;
import com.p046p1.mobile.putong.core.p053ui.profile.VReorderCards;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.PerformanceLogUtil;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.ProfileLogEntity;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.photo.AvatarCards;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.PicPostDlgView;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.ProfileListFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.SmoothScrollLinearLayoutManager;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import com.p046p1.mobile.putong.core.p053ui.report.C8829f;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.core.util.DebugUtil;
import com.p046p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLabel;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.SchemeKey;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p065ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tencent.open.SocialOperation;
import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import org.joor.Reflect;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VButton;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VProgressBar;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;
import p149l.a5m;
import p149l.ame;
import p149l.ark;
import p149l.asm;
import p149l.cme;
import p149l.cqa0;
import p149l.cwf0;
import p149l.d30;
import p149l.d5m;
import p149l.dd80;
import p149l.e30;
import p149l.e51;
import p149l.eqh0;
import p149l.f6c0;
import p149l.fj90;
import p149l.fle;
import p149l.ft4;
import p149l.g30;
import p149l.g9a0;
import p149l.gd70;
import p149l.h7c0;
import p149l.hn2;
import p149l.hpd0;
import p149l.i0g0;
import p149l.ic50;
import p149l.ine;
import p149l.j760;
import p149l.jjb0;
import p149l.jo0;
import p149l.knb0;
import p149l.l9b;
import p149l.lqa;
import p149l.lra0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mt90;
import p149l.o6j0;
import p149l.o7r;
import p149l.osi0;
import p149l.p420;
import p149l.pib;
import p149l.q860;
import p149l.qib0;
import p149l.roj0;
import p149l.rzb0;
import p149l.t100;
import p149l.t7c0;
import p149l.tpd0;
import p149l.tw6;
import p149l.u4c0;
import p149l.upa;
import p149l.v7c;
import p149l.v9j;
import p149l.vi4;
import p149l.vme;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.wn90;
import p149l.wuh0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xh0;
import p149l.xx0;
import p149l.ygh0;
import p149l.yij0;
import p149l.z9j;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileListFragLocalEditImpl extends ProfileListBaseFrag {

    /* JADX INFO: renamed from: r1 */
    public static cwf0 f33896r1 = new cwf0("p_edit_profile_post_pic_popup", Dialog.class.getName());

    /* JADX INFO: renamed from: s1 */
    public static Field f33897s1 = Reflect.m221135on((Class<?>) Toolbar.class).field0("mMenuView");

    /* JADX INFO: renamed from: t1 */
    public static CategorySuggestions f33898t1;

    /* JADX INFO: renamed from: A */
    public VNavigationBar f33899A;

    /* JADX INFO: renamed from: B */
    public View f33900B;

    /* JADX INFO: renamed from: C */
    public TabLayout f33901C;

    /* JADX INFO: renamed from: D */
    public VFrame f33902D;

    /* JADX INFO: renamed from: E */
    public VProgressBar f33903E;

    /* JADX INFO: renamed from: E0 */
    public User f33904E0;

    /* JADX INFO: renamed from: F */
    public VFrame f33905F;

    /* JADX INFO: renamed from: F0 */
    public User f33906F0;

    /* JADX INFO: renamed from: G */
    public VProgressBar f33907G;

    /* JADX INFO: renamed from: H */
    public VLinear f33909H;

    /* JADX INFO: renamed from: H0 */
    public j760<List<Literatures>, List<LiteraturesComments>> f33910H0;

    /* JADX INFO: renamed from: I */
    public FrameLayout f33911I;

    /* JADX INFO: renamed from: I0 */
    public ValueAnimator f33912I0;

    /* JADX INFO: renamed from: J */
    public CardView f33913J;

    /* JADX INFO: renamed from: K */
    public CardView f33915K;

    /* JADX INFO: renamed from: L */
    public CardView f33917L;

    /* JADX INFO: renamed from: L0 */
    public PicCertGuideView f33918L0;

    /* JADX INFO: renamed from: M */
    public RoundedRectangleProgressView f33919M;

    /* JADX INFO: renamed from: N */
    public RoundedRectangleProgressView f33921N;

    /* JADX INFO: renamed from: O */
    public VImage f33923O;

    /* JADX INFO: renamed from: O0 */
    public String f33924O0;

    /* JADX INFO: renamed from: P */
    public VImage f33925P;

    /* JADX INFO: renamed from: Q */
    public VText f33927Q;

    /* JADX INFO: renamed from: Q0 */
    public String f33928Q0;

    /* JADX INFO: renamed from: R */
    public VText f33929R;

    /* JADX INFO: renamed from: S */
    public ViewStub f33931S;

    /* JADX INFO: renamed from: T */
    public ViewStub f33933T;

    /* JADX INFO: renamed from: U */
    public RecyclerView f33935U;

    /* JADX INFO: renamed from: X */
    public a5m f33941X;

    /* JADX INFO: renamed from: Z */
    public LinearLayoutManager f33945Z;

    /* JADX INFO: renamed from: a1 */
    public wuh0 f33947a1;

    /* JADX INFO: renamed from: d1 */
    public int f33950d1;

    /* JADX INFO: renamed from: e1 */
    public final RecyclerView.AbstractC0582t f33951e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f33952f1;

    /* JADX INFO: renamed from: g1 */
    public final List<hn2<?>> f33953g1;

    /* JADX INFO: renamed from: h1 */
    public cqa0 f33954h1;

    /* JADX INFO: renamed from: i1 */
    public cme f33955i1;

    /* JADX INFO: renamed from: j1 */
    public fle f33956j1;

    /* JADX INFO: renamed from: k1 */
    public vme f33958k1;

    /* JADX INFO: renamed from: l1 */
    public ame f33959l1;

    /* JADX INFO: renamed from: m1 */
    public int f33960m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f33961n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f33962o1;

    /* JADX INFO: renamed from: p1 */
    public cwf0 f33964p1;

    /* JADX INFO: renamed from: q1 */
    public cwf0 f33965q1;

    /* JADX INFO: renamed from: z */
    public VLinear f33966z;

    /* JADX INFO: renamed from: V */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f33937V = new tpd0("show_pic_post_dialog_count_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: W */
    @SuppressLint({"SV_USE_DUP_ID"})
    public hpd0 f33939W = new hpd0("is_show_shimmer" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: Y */
    public final C22392a<User> f33943Y = C22392a.m221512b();

    /* JADX INFO: renamed from: k0 */
    public boolean f33957k0 = false;

    /* JADX INFO: renamed from: p0 */
    public boolean f33963p0 = false;

    /* JADX INFO: renamed from: G0 */
    public final C22392a<roj0> f33908G0 = C22392a.m221512b();

    /* JADX INFO: renamed from: J0 */
    public boolean f33914J0 = false;

    /* JADX INFO: renamed from: K0 */
    public HashMap<String, String> f33916K0 = new HashMap<>();

    /* JADX INFO: renamed from: M0 */
    public fj90 f33920M0 = new fj90(this, this);

    /* JADX INFO: renamed from: N0 */
    public mt90 f33922N0 = new mt90();

    /* JADX INFO: renamed from: P0 */
    public String f33926P0 = "";

    /* JADX INFO: renamed from: R0 */
    public boolean f33930R0 = false;

    /* JADX INFO: renamed from: S0 */
    public boolean f33932S0 = false;

    /* JADX INFO: renamed from: T0 */
    public final ArrayList<View> f33934T0 = new ArrayList<>();

    /* JADX INFO: renamed from: U0 */
    public final ArrayList<TextView> f33936U0 = new ArrayList<>();

    /* JADX INFO: renamed from: V0 */
    public final ArrayList<View> f33938V0 = new ArrayList<>();

    /* JADX INFO: renamed from: W0 */
    public final ArrayList<View> f33940W0 = new ArrayList<>();

    /* JADX INFO: renamed from: X0 */
    public int f33942X0 = 4;

    /* JADX INFO: renamed from: Y0 */
    public boolean f33944Y0 = false;

    /* JADX INFO: renamed from: Z0 */
    public final NewNewProfileCard.InterfaceC7863d f33946Z0 = new NewNewProfileCard.InterfaceC7863d() { // from class: l.f6a0
    };

    /* JADX INFO: renamed from: b1 */
    public final d30 f33948b1 = new C8725b();

    /* JADX INFO: renamed from: c1 */
    public final List<e30<a5m>> f33949c1 = new ArrayList();

    public static class ProfileEditInfoException extends RuntimeException {
        private ProfileEditInfo editInfo;

        public ProfileEditInfoException(ProfileEditInfo profileEditInfo) {
            this.editInfo = profileEditInfo;
        }

        public ProfileEditInfo getEditInfo() {
            return this.editInfo;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$a */
    public class C8724a implements TabLayout.OnTabSelectedListener {
        public C8724a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (!ProfileListFragLocalEditImpl.this.f33944Y0 && tab.getPosition() == 0) {
                ProfileListFragLocalEditImpl.this.m52622g9();
            }
            ProfileListFragLocalEditImpl.this.f33944Y0 = false;
            ProfileListFragLocalEditImpl profileListFragLocalEditImpl = ProfileListFragLocalEditImpl.this;
            profileListFragLocalEditImpl.m52633m9(profileListFragLocalEditImpl.f33901C.getSelectedTabPosition());
            if (ProfileListFragLocalEditImpl.this.f33901C.getSelectedTabPosition() == 0 && ProfileListFragLocalEditImpl.this.f33941X != null) {
                ProfileListFragLocalEditImpl.this.f33941X.mo36929s();
            }
            if (upa.m194835w2() && tab.getPosition() == 0 && ProfileListFragLocalEditImpl.this.f33941X != null && !ProfileListFragLocalEditImpl.this.f33952f1) {
                ProfileListFragLocalEditImpl.this.m52590Q6();
            }
            if (upa.m194800p2() && tab.getPosition() == 1) {
                ProfileListFragLocalEditImpl.this.m52616e7();
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$b */
    public class C8725b implements d30 {
        public C8725b() {
        }

        @Override // p149l.d30
        public void call() {
            Intent intentM50739q2 = ProfileAct.m50739q2(ProfileListFragLocalEditImpl.this.getContext(), ProfileListFragLocalEditImpl.this.m94569i2().f56011id, "preview_card", false, false, ProfileListFragLocalEditImpl.this.f33941X instanceof d5m ? ((d5m) ProfileListFragLocalEditImpl.this.f33941X).getShowPictureIndex() : -1);
            intentM50739q2.putExtra("preview_user_info", ProfileListFragLocalEditImpl.this.m94569i2());
            ProfileListFragLocalEditImpl.this.startActivity(intentM50739q2);
            ProfileListFragLocalEditImpl.this.act().overridePendingTransition(rzb0.f161653y, 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$c */
    public class C8726c extends RecyclerView.AbstractC0582t {
        public C8726c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            ProfileListFragLocalEditImpl.this.f33950d1 += i2;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$d */
    public class C8727d implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f33970a;

        public C8727d(int i) {
            this.f33970a = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            wn90.m204602F().f187281m.put(Integer.valueOf(this.f33970a));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$e */
    public class C8728e implements e30<Boolean> {
        public C8728e() {
        }

        @Override // p149l.e30
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            ProfileListFragLocalEditImpl.this.m51073N6();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$f */
    public class C8729f implements w9j<Media, Boolean> {
        public C8729f() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Media media) {
            return ((media instanceof Picture) && TEnum.equals(media.status, "normal") && ((Picture) media).isAiFakePic()) ? Boolean.FALSE : Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$g */
    public class C8730g implements w9j<Media, Boolean> {
        public C8730g() {
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Media media) {
            if ((media instanceof Picture) && TEnum.equals(media.status, "normal")) {
                Picture picture = (Picture) media;
                if (picture.isLow() || picture.isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE)) || picture.isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE))) {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
    }

    public ProfileListFragLocalEditImpl() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.g6a0
            @Override // p149l.e30
            public final void call(Object obj) {
                PerformanceLogUtil.logSingle(((C4319c) obj).f15557c);
            }
        }));
        this.f33950d1 = 0;
        this.f33951e1 = new C8726c();
        this.f33952f1 = false;
        this.f33953g1 = new ArrayList();
        this.f33960m1 = -1;
        this.f33961n1 = false;
        this.f33962o1 = false;
        creates(new e30() { // from class: l.h6a0
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileListFragLocalEditImpl.m52452O5((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A7 */
    public /* synthetic */ void m52420A7() {
        new dd80.C16336a(act()).m110996y0("温馨提示").m110991t0("xxx").m110974c0("更换照片", new Runnable() { // from class: l.z7a0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileListFragLocalEditImpl.m52546t6();
            }
        }).m110969X("稍后再说", new Runnable() { // from class: l.b8a0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileListFragLocalEditImpl.m52558y5();
            }
        }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.c8a0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ProfileListFragLocalEditImpl.m52490a6(dialogInterface);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.d8a0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ProfileListFragLocalEditImpl.m52523l5(dialogInterface);
            }
        }).m110989r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B7 */
    public /* synthetic */ void m52423B7() {
        if (NullChecker.m81303a(mo51069K2())) {
            DebugUtil.m59280zk(mo51069K2(), act());
        }
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ void m52428E5() {
        try {
            ProfileListFrag.f33610I4 = CategorySuggestions.JSON_ADAPTER.parse(CoreModule.f17544b.getResources().openRawResource(t7c0.f168687a));
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: F8 */
    private void m52432F8() {
        xdl0.m208366b0(this.f33905F, new v9j() { // from class: l.n5a0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return ProfileListFragLocalEditImpl.m52553w5();
            }
        });
    }

    /* JADX INFO: renamed from: G5 */
    public static /* synthetic */ void m52433G5(Throwable th) {
    }

    /* JADX INFO: renamed from: G8 */
    private C22306c<q860<CoreMomentInfo>> m52435G8() {
        String strUserId = CoreModule.m29931H().userId();
        if (!TextUtils.equals(strUserId, CoreModule.m29931H().userId())) {
            return CoreModule.m29934N().personalMediaMomentsFeedPrevious(strUserId, false, CoreMomentInfo.JSON_ADAPTER).map(new w9j() { // from class: l.i7a0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ProfileListFragLocalEditImpl.m52493b6((j760) obj);
                }
            });
        }
        CoreModule.m29934N().personalMediaMomentsFeedPrevious(strUserId, false, CoreMomentInfo.JSON_ADAPTER);
        return CoreModule.m29934N().mo60346di(CoreMomentInfo.JSON_ADAPTER).map(new w9j() { // from class: l.h7a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ProfileListFragLocalEditImpl.m52450N5((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J8 */
    private void m52442J8() {
        m52576I8(new C8728e());
    }

    /* JADX INFO: renamed from: K5 */
    public static /* synthetic */ void m52443K5(e30 e30Var) {
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: L8 */
    public static void m52447L8() {
        f33896r1.m109035k();
        f33896r1.m109034j();
    }

    /* JADX INFO: renamed from: M8 */
    public static void m52449M8(int i) {
        f33896r1.m109039o(ic50.m135327j().m135333f().m145234U("p_edit_profile_post_pic_popup", ygh0.m214692m(vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("popup_times", Integer.valueOf(i)))));
        f33896r1.m109033i();
        f33896r1.m109036l();
    }

    /* JADX INFO: renamed from: N5 */
    public static /* synthetic */ q860 m52450N5(List list) {
        return new q860(list, null);
    }

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ ProfileEditInfo m52451O4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: O5 */
    public static /* synthetic */ void m52452O5(Bundle bundle) {
        if (f33898t1 == null) {
            e51.m114774y(new Runnable() { // from class: l.s8a0
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListFragLocalEditImpl.m52458Q5();
                }
            });
        }
        CoreModule.f17545c.f19636d0.f199753R.m121230k().first().subscribe(mkd0.m154950B());
    }

    @MainThread
    /* JADX INFO: renamed from: P6 */
    private void m52455P6() {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.AFTER_GET_USER_INFO;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        m52456P8();
        if (NullChecker.m81303a(mo51058F1(false)) && this.f33932S0) {
            User user = wn90.m204602F().f187269a;
            if (!TEnum.equals(this.f33904E0.profile.zodiac, user.profile.zodiac)) {
                user.profile.zodiac = this.f33904E0.profile.zodiac;
            }
            wn90.m204602F().f187269a = this.f33904E0.mo223809clone();
            wn90.m204602F().f187269a.description = user.description;
            wn90.m204602F().f187269a.pictures = user.pictures;
            wn90.m204602F().f187269a.profile = user.profile;
            wn90.m204602F().f187269a.voice = user.voice;
            wn90.m204602F().f187269a.name = user.name;
            wn90.m204602F().f187269a.settings.birthdate = user.settings.birthdate;
            wn90.m204602F().f187269a.settings.getSettingGroup().privacy.hideSchool = user.settings.getSettingGroup().privacy.hideSchool;
            wn90.m204602F().f187269a.profile.extensions.physical.bloodType = this.f33904E0.profile.extensions.physical.bloodType;
            wn90.m204602F().f187269a.profile.extensions.interest.emoji = this.f33904E0.profile.extensions.interest.emoji;
            wn90.m204602F().f187269a.profile.extensions.basic.idealType = this.f33904E0.profile.extensions.basic.idealType;
            wn90.m204602F().f187269a.profile.extensions.basic.ideal = this.f33904E0.profile.extensions.basic.ideal;
        } else {
            this.f33932S0 = true;
            m52600W8();
            wn90.m204602F().f187269a = this.f33904E0.mo223809clone();
        }
        m52467S8(wn90.m204602F().f187269a);
        m52462R6();
        m52466S6();
        this.f33907G.setVisibility(4);
        this.f33935U.setVisibility(0);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        if (this.f33960m1 == -1) {
            this.f33960m1 = CoreModule.f17545c.f19639e0.m169527p9().isVIP() ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: P8 */
    private void m52456P8() {
        this.f33922N0.m156190M(m52496c7(this.f33953g1));
        m52533o7();
    }

    /* JADX INFO: renamed from: Q5 */
    public static /* synthetic */ void m52458Q5() {
        try {
            f33898t1 = CategorySuggestions.JSON_ADAPTER.parse(CoreModule.f17544b.getResources().openRawResource(t7c0.f168687a));
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: Q8 */
    private void m52459Q8(List<Media> list) {
        m52463R8(list, false);
    }

    /* JADX INFO: renamed from: R6 */
    private void m52462R6() {
        if ((!TextUtils.equals(this.f33928Q0, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) && !TextUtils.equals(this.f33928Q0, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO) && !TextUtils.equals(this.f33928Q0, CoreStaticData.ProfileFromType.FROM_THIN_POPUP)) || this.f33957k0) {
            if (this.f33957k0) {
                return;
            }
            this.f33957k0 = m52598W6();
            return;
        }
        byte b = 1;
        this.f33957k0 = true;
        if (!upa.m194825u2()) {
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD;
            if (vwb.m200296J(LoopFragmentFactory.m51505z(loopCreateEntryType, null, wn90.m204602F().f187269a))) {
                return;
            }
            LoopFragmentFactory.m51477U(wn90.m204602F().f187269a, this, null, loopCreateEntryType, this.f33928Q0);
            return;
        }
        LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType2 = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD;
        if (vwb.m200296J(LoopFragmentFactory.m51458B(loopCreateEntryType2, null, wn90.m204602F().f187269a, true, true, this.f33928Q0))) {
            return;
        }
        String str = this.f33928Q0;
        str.getClass();
        switch (str.hashCode()) {
            case -338162810:
                b = !str.equals(CoreStaticData.ProfileFromType.FROM_THIN_POPUP) ? (byte) -1 : (byte) 0;
                break;
            case 182867647:
                if (!str.equals(CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO)) {
                    b = -1;
                }
                break;
            case 1120730606:
                b = !str.equals(CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) ? (byte) -1 : (byte) 2;
                break;
            default:
                b = -1;
                break;
        }
        switch (b) {
            case 0:
                break;
            case 1:
                loopCreateEntryType2 = LoopFragmentFactory.LoopCreateEntryType.ENTRY_PROFILE_UPLOAD_PHOTO;
                break;
            case 2:
                loopCreateEntryType2 = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD_UPLOAD_PHOTO;
                break;
            default:
                loopCreateEntryType2 = null;
                break;
        }
        LoopFragmentFactory.m51477U(wn90.m204602F().f187269a, this, null, loopCreateEntryType2, this.f33928Q0);
    }

    /* JADX INFO: renamed from: R8 */
    private void m52463R8(final List<Media> list, final boolean z) {
        if (lqa.m150963a()) {
            this.f33956j1.mo131811a(new d30() { // from class: l.q5a0
                @Override // p149l.d30
                public final void call() {
                    this.f152749a.m52634n8(list, z);
                }
            });
        } else {
            this.f33955i1.mo131811a(new d30() { // from class: l.r5a0
                @Override // p149l.d30
                public final void call() {
                    this.f157767a.m52638p8(z, list);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S4 */
    public static /* synthetic */ void m52464S4(Throwable th) {
    }

    /* JADX INFO: renamed from: S6 */
    private void m52466S6() {
        if (!TextUtils.equals(this.f33916K0.get("action"), SocialOperation.GAME_SIGNATURE) || this.f33957k0) {
            return;
        }
        this.f33957k0 = true;
        LoopFragmentFactory.m51475S(m94569i2(), mo51066J1(), LoopInputType.SIGNATURE);
    }

    /* JADX INFO: renamed from: S8 */
    private void m52467S8(User user) {
        m52471T8(user, false);
    }

    /* JADX INFO: renamed from: T6 */
    private boolean m52470T6() {
        if (upa.m194814s1()) {
            List<Media> list = wn90.m204602F().f187269a.pictures;
            if (!vwb.m200296J(list)) {
                Media media = list.get(0);
                if (media instanceof Picture) {
                    return ((Picture) media).isAiFakePic();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: T8 */
    private void m52471T8(User user, boolean z) {
        m52456P8();
        m52463R8(user.pictures, z);
    }

    /* JADX INFO: renamed from: U5 */
    public static /* synthetic */ void m52473U5(int i, a5m a5mVar) {
        if (i == 1) {
            a5mVar.mo36817G();
        } else {
            a5mVar.mo36929s();
        }
    }

    /* JADX INFO: renamed from: U6 */
    private boolean m52474U6() {
        if (upa.m194639G2() || upa.m194644H2()) {
            List<Media> list = wn90.m204602F().f187269a.pictures;
            if (!vwb.m200296J(list)) {
                Media media = list.get(0);
                if (media instanceof Picture) {
                    return ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: U8 */
    private void m52475U8(User user) {
        wn90.m204602F().f187269a = user;
        m52455P6();
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ void m52476V4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: V6 */
    private boolean m52478V6() {
        if (upa.m194639G2() || upa.m194644H2()) {
            List<Media> list = wn90.m204602F().f187269a.pictures;
            if (!vwb.m200296J(list)) {
                Media media = list.get(0);
                if (media instanceof Picture) {
                    return ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: W4 */
    public static /* synthetic */ void m52479W4(a5m a5mVar, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a5mVar.getCardView().getLayoutParams();
        int i = t100.f167264m;
        marginLayoutParams.topMargin = i;
        int i2 = t100.f167259h;
        marginLayoutParams.rightMargin = i2;
        marginLayoutParams.leftMargin = i2;
        marginLayoutParams.bottomMargin = i;
        a5mVar.getCardView().requestLayout();
    }

    /* JADX INFO: renamed from: Z6 */
    private User m52487Z6() {
        User userMo223809clone = this.f33904E0.mo223809clone();
        if (this.f33954h1.m108241V()) {
            userMo223809clone.profile.extensions.momentSwitch.noSyncMoment.clear();
            userMo223809clone.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f33954h1.m108240U() ? "false" : "true");
        }
        return userMo223809clone.subtract(this.f33904E0);
    }

    /* JADX INFO: renamed from: Z8 */
    private void m52488Z8(User user) {
        this.f33906F0 = user;
    }

    /* JADX INFO: renamed from: a6 */
    public static /* synthetic */ void m52490a6(DialogInterface dialogInterface) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: a7 */
    private void m52491a7() {
        this.f33935U.setFocusableInTouchMode(true);
        this.f33935U.setDescendantFocusability(131072);
        this.f33935U.setFocusable(true);
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m52492b5(Throwable th) {
    }

    /* JADX INFO: renamed from: b6 */
    public static /* synthetic */ q860 m52493b6(j760 j760Var) {
        return new q860((List) j760Var.f116565b, null);
    }

    /* JADX INFO: renamed from: c7 */
    private List<hn2<?>> m52496c7(List<hn2<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (hn2<?> hn2Var : list) {
            if (hn2Var.mo52729l()) {
                arrayList.add(hn2Var);
                if (hn2Var.mo52385k()) {
                    fj90 fj90Var = new fj90(this, this);
                    if (hn2Var.mo107404d() != 0) {
                        fj90Var.m131824v(hn2Var.mo107404d());
                    }
                    arrayList.add(fj90Var);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c9 */
    private void m52497c9(User user) {
        User userRiskAuditUser;
        if (user == null) {
            userRiskAuditUser = null;
        } else {
            userRiskAuditUser = user.riskAuditUser(CoreModule.m29932K().getUserById("fake_risk_audit_default_" + this.f33924O0));
        }
        this.f33904E0 = userRiskAuditUser;
    }

    /* JADX INFO: renamed from: d7 */
    private List<Media> m52500d7() {
        if (lqa.m150963a()) {
            return this.f33956j1.m121969T();
        }
        ArrayList arrayList = new ArrayList();
        MediaReorderCards mediaReorderCards = this.f33955i1.f81526v;
        if (NullChecker.m81303a(mediaReorderCards)) {
            for (int i = 0; i < mediaReorderCards.getChildCount(); i++) {
                if (mediaReorderCards.m50811h(i).getAddPhotos().size() > 0) {
                    arrayList.addAll(mediaReorderCards.m50811h(i).getAddPhotos());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e9 */
    private void m52503e9(final boolean z) {
        if (this.f33964p1 == null) {
            this.f33964p1 = new cwf0("p_lowqualityphoto_save_popup", Dialog.class.getName());
        }
        new xh0.C21150a(act()).m208740s("检测到不符合要求的照片").m208728g(false).m208731j("若继续保存，不符合要求的照片(重复图、网图、五官不清晰或有遮挡的照片等）将被删除").m208739r("保存其他资料").m208736o(new View.OnClickListener() { // from class: l.y5a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196391a.m52645v8(view);
            }
        }).m208727f(z ? "不保存" : "继续编辑").m208724c(new View.OnClickListener() { // from class: l.z5a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201789a.m52646w8(z, view);
            }
        }).m208735n(new DialogInterface.OnShowListener() { // from class: l.a6a0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f67751a.m52642t8(dialogInterface);
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.b6a0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f73762a.m52644u8(dialogInterface);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: g7 */
    public static void m52508g7(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m81303a(userInfo.myTabTask) || TextUtils.isEmpty(userInfo.myTabTask.title)) {
            return;
        }
        MyTabTask myTabTask = userInfo.myTabTask;
        if (TextUtils.equals(myTabTask.type, ProfileLikeType.mbti)) {
            User user = wn90.m204602F().f187269a;
            if (NullChecker.m81303a(user) && wn90.m204604Q(user)) {
                userInfo.myTabTask = null;
                return;
            }
            return;
        }
        if (TextUtils.equals(myTabTask.type, "game")) {
            User user2 = wn90.m204602F().f187269a;
            if (!NullChecker.m81303a(user2) || !NullChecker.m81303a(user2.profile) || !NullChecker.m81303a(user2.profile.extensions) || !NullChecker.m81303a(user2.profile.extensions.game) || vwb.m200296J(user2.profile.extensions.game.name) || vwb.m200296J(user2.profile.extensions.game.together) || TextUtils.isEmpty(user2.profile.extensions.game.name.get(0)) || TextUtils.isEmpty(user2.profile.extensions.game.together.get(0))) {
                return;
            }
            userInfo.myTabTask = null;
        }
    }

    /* JADX INFO: renamed from: h7 */
    private void m52511h7(String str) {
        str.getClass();
        switch (str) {
            case "school":
                LoopFragmentFactory.m51475S(m94569i2(), mo51066J1(), LoopInputType.SCHOOL);
                break;
            case "photo":
                LoopFragmentFactory.m51475S(m94569i2(), mo51066J1(), LoopInputType.PHOTO);
                break;
            case "industry":
                LoopFragmentFactory.m51475S(m94569i2(), mo51066J1(), LoopInputType.INDUSTRY);
                break;
            case "company":
                LoopFragmentFactory.m51475S(m94569i2(), mo51066J1(), LoopInputType.COMPANY);
                break;
            case "about_me":
                LoopFragmentFactory.m51475S(m94569i2(), mo51066J1(), LoopInputType.ABOUT_ME);
                break;
        }
    }

    /* JADX INFO: renamed from: h9 */
    private void m52512h9(final boolean z) {
        if (this.f33965q1 == null) {
            this.f33965q1 = new cwf0("p_lowqualityphoto_save_popup", Dialog.class.getName());
        }
        new xh0.C21150a(act()).m208740s("检测到不符合要求的照片").m208728g(false).m208731j("若继续保存，不符合要求的照片(重复图、网图、五官不清晰的照片等）将被删除").m208739r("保存其他资料").m208736o(new View.OnClickListener() { // from class: l.t5a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167796a.m52650y8(view);
            }
        }).m208727f(z ? "不保存" : "继续编辑").m208724c(new View.OnClickListener() { // from class: l.u5a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174690a.m52651z8(z, view);
            }
        }).m208735n(new DialogInterface.OnShowListener() { // from class: l.v5a0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f180016a.m52563A8(dialogInterface);
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.w5a0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f184655a.m52564B8(dialogInterface);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: i7 */
    private void m52515i7(User user) {
        User user2;
        if (user == null || (user2 = this.f33904E0) == null) {
            return;
        }
        user.profile.moments = user2.profile.moments;
    }

    /* JADX INFO: renamed from: i9 */
    private void m52516i9() {
        new xh0.C21150a(act()).m208740s(act().getString(R$string.f17737Fk)).m208728g(false).m208731j(act().getString(R$string.f17677Dk)).m208739r(act().getString(R$string.f17707Ek)).m208736o(new View.OnClickListener() { // from class: l.i6a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f111702a.m52566C8(view);
            }
        }).m208727f(act().getString(R$string.f17647Ck)).m208724c(new View.OnClickListener() { // from class: l.t6a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167940a.m52568D8(view);
            }
        }).m208722a().m208721g();
    }

    private void initState() {
        if (upa.m194800p2()) {
            User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
            if (!NullChecker.m81303a(userM169527p9) || (!TextUtils.isEmpty(userM169527p9.description) && userM169527p9.pictures.size() >= 3)) {
                CoreModule.f17545c.f19639e0.f149316Y6 = false;
                return;
            }
            pib pibVar = CoreModule.f17545c.f19639e0;
            pibVar.f149316Y6 = true;
            pibVar.f149324Z6 = false;
            pibVar.f149332a7 = false;
        }
    }

    /* JADX INFO: renamed from: j9 */
    private void m52519j9(int i) {
        if (i > 0) {
            m52620f9(i);
        } else {
            m52442J8();
        }
    }

    /* JADX INFO: renamed from: k6 */
    public static /* synthetic */ void m52521k6(Throwable th) {
    }

    /* JADX INFO: renamed from: k7 */
    private void m52522k7() {
        if (TextUtils.equals(this.f33928Q0, "from_auto_scroll_to_question") || TextUtils.equals(this.f33928Q0, "p_tantanx_card")) {
            e51.m114744I(this, new Runnable() { // from class: l.x5a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f191102a.m52572G7();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m52523l5(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: l9 */
    private void m52525l9(int i, String str, MediaReorderCards mediaReorderCards) {
        if (i == mediaReorderCards.getChildCount()) {
            mediaReorderCards.m50811h(mediaReorderCards.getChildCount() - 1).m50672S1(null);
            return;
        }
        mediaReorderCards.m50811h(i).m50672S1(str);
        if (i < mediaReorderCards.getChildCount() - 1) {
            mediaReorderCards.m50811h(i + 1).m50672S1(null);
        }
        if (i > 0) {
            mediaReorderCards.m50811h(i - 1).m50672S1(null);
        }
    }

    /* JADX INFO: renamed from: n7 */
    private void m52530n7() {
        ine ineVar = new ine(this, this);
        this.f33953g1.addAll(ineVar.m165526c());
        this.f33954h1 = (cqa0) ineVar.m165527d(cqa0.class);
        if (lqa.m150963a()) {
            this.f33956j1 = (fle) ineVar.m165527d(fle.class);
        } else {
            this.f33955i1 = (cme) ineVar.m165527d(cme.class);
        }
        this.f33958k1 = (vme) ineVar.m165527d(vme.class);
        this.f33959l1 = (ame) ineVar.m165527d(ame.class);
    }

    /* JADX INFO: renamed from: o5 */
    public static /* synthetic */ knb0 m52531o5(User user, User user2, q860 q860Var, MyTabTask myTabTask) {
        return new knb0(user, user2, q860Var, myTabTask);
    }

    /* JADX INFO: renamed from: o6 */
    public static /* synthetic */ void m52532o6(Throwable th) {
    }

    /* JADX INFO: renamed from: o7 */
    private void m52533o7() {
        if (CoreModule.f17545c.f19639e0.m169520na().status.contains(UserStatus.get(UserStatus.audit)) || CertificationUtil.m58153l() || !jjb0.m141784b()) {
            PicCertGuideView picCertGuideView = this.f33918L0;
            if (picCertGuideView != null) {
                xdl0.m208344M(picCertGuideView, false);
                return;
            }
            return;
        }
        if (xdl0.m208349O0(this.f33933T)) {
            return;
        }
        if (this.f33918L0 == null) {
            PicCertGuideView picCertGuideView2 = (PicCertGuideView) this.f33931S.inflate();
            this.f33918L0 = picCertGuideView2;
            picCertGuideView2.m43736k0(act(), "完成头像认证，你的卡片将被优先推荐", "去认证", "e_edit_profile_view_edit_verification", "p_edit_profile_view", null, null);
            if (this.f33901C.getSelectedTabPosition() == 0) {
                this.f33918L0.m43737l0();
            }
            duringCreated(CoreModule.f17545c.f19552B0.m31611j4().filter(new w9j() { // from class: l.o5a0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    VerificationCenter verificationCenter = (VerificationCenter) obj;
                    return Boolean.valueOf(NullChecker.m81303a(verificationCenter) && NullChecker.m81303a(verificationCenter.picVerificationInfo));
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.p5a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f147275a.m52582M7((VerificationCenter) obj);
                }
            }));
        }
        xdl0.m208344M(this.f33918L0, true);
        xdl0.m208344M(this.f33913J, false);
        xdl0.m208344M(this.f33915K, false);
        xdl0.m208344M(this.f33917L, false);
        xdl0.m208344M(this.f33911I, true);
    }

    /* JADX INFO: renamed from: q7 */
    private void m52538q7() {
        this.f33945Z = new SmoothScrollLinearLayoutManager(getContext());
        this.f33935U.setItemAnimator(null);
        this.f33935U.setLayoutManager(this.f33945Z);
        this.f33935U.setAdapter(this.f33922N0);
        this.f33935U.addOnScrollListener(this.f33951e1);
    }

    /* JADX INFO: renamed from: r7 */
    private void m52541r7() {
        gd70.m125540b().m125543e(Boolean.FALSE);
        xdl0.m208344M(this.f33899A, true);
        View viewInflate = act().inflater().inflate(f6c0.f95292B9, (ViewGroup) null);
        VButton vButton = (VButton) viewInflate.findViewById(u4c0.f174359m4);
        xdl0.m208359W(vButton, t100.f167256e);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.c6a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79455a.m52593S7(view);
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.d6a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84610a.m52594T7(view);
            }
        };
        xdl0.m208329E0(vButton, onClickListener);
        this.f33899A.setLeftIconOnClick(onClickListener2);
        this.f33899A.m223589z(viewInflate);
        this.f33899A.setLeftIconOnClick(new View.OnClickListener() { // from class: l.e6a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f89514a.m52595U7(view);
            }
        });
    }

    /* JADX INFO: renamed from: s5 */
    public static /* synthetic */ void m52542s5(Throwable th) {
    }

    /* JADX INFO: renamed from: s7 */
    private void m52544s7() {
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.s5a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162493a.m52596V7((User) obj);
            }
        }));
        if (!upa.m194718Y1() || TextUtils.equals(this.f33928Q0, "from_ideal_type_mine_tab_guide") || TextUtils.equals(this.f33928Q0, "from_ideal_type_profile_item")) {
            return;
        }
        TextUtils.equals(this.f33928Q0, "from_ideal_type_other_profile");
    }

    /* JADX INFO: renamed from: t6 */
    public static /* synthetic */ void m52546t6() {
    }

    /* JADX INFO: renamed from: t7 */
    private void m52547t7() {
        if (CoreModule.f17545c.f19639e0.m169498i8() && !CoreModule.f17545c.f19639e0.m169527p9().isAudit()) {
            duringCreated(CoreModule.f17545c.f19639e0.m169560xa().filter(new w9j() { // from class: l.n8a0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    FakeGuideData fakeGuideData = (FakeGuideData) obj;
                    return Boolean.valueOf(NullChecker.m81303a(fakeGuideData) && fakeGuideData.changeAvatar && "mainAvatar".equals(fakeGuideData.type));
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.o8a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f142606a.m52599W7((FakeGuideData) obj);
                }
            }, new e30() { // from class: l.p8a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ProfileListFragLocalEditImpl.m52492b5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v7 */
    private void m52552v7() {
        m52491a7();
        this.f33935U.setBackgroundColor(Color.parseColor("#ffffff"));
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ Boolean m52553w5() {
        PerformanceLogUtil.logEnd(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        PerformanceLogUtil.instance().endTrance();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: w7 */
    private boolean m52555w7() {
        if (lqa.m150963a()) {
            return this.f33956j1.m121970U();
        }
        MediaReorderCards mediaReorderCards = this.f33955i1.f81526v;
        if (NullChecker.m81303a(mediaReorderCards)) {
            for (int i = 0; i < mediaReorderCards.getChildCount(); i++) {
                if (mediaReorderCards.m50811h(i).m50655K0()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y5 */
    public static /* synthetic */ void m52558y5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z7 */
    public /* synthetic */ void m52562z7() {
        m20581b4().m20504F(this.f33924O0).m20568z0();
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ void m52563A8(DialogInterface dialogInterface) {
        this.f33965q1.m109033i();
        this.f33965q1.m109036l();
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ void m52564B8(DialogInterface dialogInterface) {
        this.f33965q1.m109035k();
        this.f33965q1.m109034j();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: C2 */
    public CategorySuggestions mo51050C2() {
        return f33898t1;
    }

    /* JADX INFO: renamed from: C7 */
    public final /* synthetic */ void m52565C7(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("右滑无配对引导")) {
            DatingGuideData datingGuideDataNew_ = DatingGuideData.new_();
            datingGuideDataNew_.titles.add(String.format(Locale.getDefault(), "刚刚看过的%d个%s更想了解你的兴趣爱好", Integer.valueOf(CoreModule.f17545c.f19663m0.f19466y0), CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "男生" : "女生"));
            datingGuideDataNew_.subTitles.add("添加生活照展示你的兴趣爱好，更容易配对");
            datingGuideDataNew_.button = "立即添加";
            datingGuideDataNew_.pageId = "p_add_lifestyle_guidance";
            datingGuideDataNew_.deeplink = "tantan://profile/edit?mode=guidePicAndTag&from=right_swipe_add_lifestyle";
            datingGuideDataNew_.pictures.add(CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "https://auto.tancdn.com/v1/raw/8da6f26f-c9b6-440e-9bbc-57f1a124a66f14.webp" : "https://auto.tancdn.com/v1/raw/484a6490-eca3-4af1-bf18-0b43971e70c114.webp");
            datingGuideDataNew_.buttonId = "e_add_lifestyle";
            new v7c.C20593b(act()).m197375c(datingGuideDataNew_).m197374b("right_swipe_no_match").m197373a().show();
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
            datingGuideDataNew_5.pageId = "p_add_lifestyle_guidance";
            datingGuideDataNew_5.deeplink = "tantan://profile/edit?mode=guidePicAndTag&from=right_swipe_add_lifestyle";
            datingGuideDataNew_5.pictures.add("https://auto.tancdn.com/v1/raw/c9488f16-cae9-48fa-9558-4e8e5f0552dd14.webp");
            new v7c.C20593b(act()).m197375c(datingGuideDataNew_5).m197373a().show();
        }
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ void m52566C8(View view) {
        m52442J8();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: D2 */
    public boolean mo51053D2() {
        return true;
    }

    /* JADX INFO: renamed from: D7 */
    public final /* synthetic */ void m52567D7() {
        m20581b4().m20536f0(new String[]{"右滑无配对引导", "连续左滑引导", "老用户引导给照片加标签", "老用户引导给旧标签配图", "收到喜欢很少引导上传生活照"}).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.g8a0
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f101485a.m52565C7(dialog, view, i, charSequence);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: D8 */
    public final /* synthetic */ void m52568D8(View view) {
        m51073N6();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: E */
    public void mo51056E() {
    }

    /* JADX INFO: renamed from: E7 */
    public final /* synthetic */ void m52569E7(PicCertGuideView picCertGuideView, VerificationCenter verificationCenter) {
        if (TEnum.equals(verificationCenter.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenter.picVerificationInfo.status, "pending")) {
            if (NullChecker.m81303a(picCertGuideView)) {
                xdl0.m208344M(picCertGuideView, false);
            }
            mo51056E();
        }
    }

    /* JADX INFO: renamed from: E8 */
    public final /* synthetic */ void m52570E8(int i, Media media) {
        VReorderCard vReorderCardM52610b7 = m52610b7(i);
        if (vReorderCardM52610b7 instanceof MediaReorderCard) {
            MediaReorderCard mediaReorderCard = (MediaReorderCard) vReorderCardM52610b7;
            if (media instanceof Video) {
                mediaReorderCard.m50714z1((Video) media);
            } else {
                mediaReorderCard.m50708w1((Picture) media);
            }
            mo51092Z2();
            if (upa.m194825u2()) {
                for (int i2 = 0; i2 < this.f33955i1.f81526v.getChildCount(); i2++) {
                    mediaReorderCard.m50644E1(i2, "p_edit_profile_view");
                }
            }
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: F1 */
    public User mo51058F1(boolean z) {
        if (!NullChecker.m81303a(wn90.m204602F().f187269a)) {
            if (z) {
                CrashHelper.m81296c(new NullPointerException("ProfileListFrag editingUser is null when refresh"));
            }
            wn90.m204602F().f187269a = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        }
        return wn90.m204602F().f187269a;
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ void m52571F7(View view, PicCertGuideView picCertGuideView, User user) {
        if (user.status.contains(UserStatus.get(UserStatus.audit))) {
            xdl0.m208344M(view, true);
            xdl0.m208344M(picCertGuideView, false);
        } else if (!jjb0.m141784b() || CertificationUtil.m58153l()) {
            xdl0.m208344M(view, false);
            xdl0.m208344M(picCertGuideView, false);
        } else {
            picCertGuideView.m43736k0(act(), "完成头像认证，你的卡片将被优先推荐", "去认证", "e_edit_profile_view_preview_verification", "p_edit_profile_view", null, null);
            xdl0.m208344M(view, false);
            xdl0.m208344M(picCertGuideView, true);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: G */
    public void mo51060G(View... viewArr) {
        for (View view : viewArr) {
            xdl0.m208329E0(view, m52405N4(this.f33904E0));
        }
    }

    /* JADX INFO: renamed from: G7 */
    public final /* synthetic */ void m52572G7() {
        int iM156185H;
        if (this.f33922N0 == null) {
            return;
        }
        if (TextUtils.equals(this.f33928Q0, "from_auto_scroll_to_question")) {
            iM156185H = this.f33922N0.m156188K();
        } else {
            iM156185H = TextUtils.equals(this.f33928Q0, "p_tantanx_card") ? this.f33922N0.m156185H() : -1;
        }
        if (iM156185H < 0 || iM156185H >= this.f33922N0.getPageCount()) {
            return;
        }
        this.f33935U.scrollToPosition(iM156185H);
        if (NullChecker.m81303a(this.f33945Z)) {
            this.f33945Z.scrollToPositionWithOffset(iM156185H, 0);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: H3 */
    public j760<List<Literatures>, List<LiteraturesComments>> mo51062H3() {
        return this.f33910H0;
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ void m52573H7(Boolean bool) {
        ft4.m123008b().m123017j(bool.booleanValue());
        mo51123o();
    }

    /* JADX INFO: renamed from: H8 */
    public void m52574H8(final List<Media> list, int i) {
        if (i == 15) {
            this.f33959l1.m131812b(new d30() { // from class: l.f9a0
                @Override // p149l.d30
                public final void call() {
                    this.f96468a.m52623h8(list);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I7 */
    public final /* synthetic */ void m52575I7(roj0 roj0Var) {
        m52455P6();
    }

    /* JADX INFO: renamed from: I8 */
    public final void m52576I8(final e30<Boolean> e30Var) {
        if (this.f33954h1.m108241V()) {
            wn90.m204602F().f187269a.profile.extensions.momentSwitch.noSyncMoment.clear();
            wn90.m204602F().f187269a.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f33954h1.m108240U() ? "false" : "true");
        }
        if (vwb.m200296J(wn90.m204602F().f187269a.pictures)) {
            m20581b4().m20504F("你的个人资料页需要至少一张照片").m20556t0(R$string.f18046Q, new Runnable() { // from class: l.h8a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f106400a.m51073N6();
                }
            }).m20541k0(R$string.f18408c).m20568z0();
            return;
        }
        final User userM52604Y6 = m52604Y6();
        User userM52487Z6 = m52487Z6();
        boolean z = true;
        if (NullChecker.m81303a(userM52604Y6) && NullChecker.m81303a(userM52487Z6) && userM52604Y6.equals(userM52487Z6)) {
            this.f33962o1 = true;
        }
        final User userMo223809clone = wn90.m204602F().f187269a.mo223809clone();
        final User userMo223809clone2 = this.f33904E0.mo223809clone();
        ArrayList<String> arrayList = new ArrayList();
        if (NullChecker.m81303a(userM52604Y6) && NullChecker.m81303a(userM52604Y6.profile) && NullChecker.m81303a(userM52604Y6.profile.extensions) && NullChecker.m81303a(userM52604Y6.profile.extensions.basic) && !TextUtils.isEmpty(userM52604Y6.description)) {
            arrayList.add("about_me");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (!z) {
                sb.append(Constants.SEPARATOR_COMMA);
            }
            sb.append(str);
            z = false;
        }
        o6j0.m162859c("e_profile_save_button", pageId(), o6j0.C18854a.m162878h("edit_profile_content_modified", sb.toString()));
        if (!NullChecker.m81303a(userM52604Y6)) {
            if (e30Var != null) {
                e30Var.call(Boolean.FALSE);
                return;
            }
            return;
        }
        m20595o4(R$string.f17842J5);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userMo223809clone;
        if (NullChecker.m81303a(userM52604Y6.profile) && NullChecker.m81303a(userM52604Y6.profile.extensions)) {
            userM52604Y6.profile.extensions.voiceSignature = null;
        }
        final boolean zEquals = (upa.m194745e2() && NullChecker.m81303a(userM52604Y6) && NullChecker.m81303a(userM52604Y6.profile) && NullChecker.m81303a(userM52604Y6.profile.extensions) && NullChecker.m81303a(userM52604Y6.profile.extensions.basic) && !vwb.m200296J(userM52604Y6.profile.extensions.basic.friendPurpose)) ? TEnum.equals(userM52604Y6.profile.extensions.basic.friendPurpose.get(0), "marriage") : false;
        duringCreated((C22306c) CoreModule.f17545c.f19552B0.m31621t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.i8a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ProfileListFragLocalEditImpl.m52451O4((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.j8a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f116695a.m52624i8(userM52604Y6, (ProfileEditInfo) obj);
            }
        })).subscribe(mkd0.m154959K(new e30() { // from class: l.k8a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121791a.m52626j8(zEquals, userMo223809clone, userMo223809clone2, e30Var, userM52604Y6, (roj0) obj);
            }
        }, new e30() { // from class: l.m8a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f132552a.m52627k8(userMo223809clone2, userM52604Y6, e30Var, (Throwable) obj);
            }
        }, false));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: J1 */
    public PutongFrag mo51066J1() {
        return this;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: J3 */
    public void mo51067J3() {
        if (this.f33906F0 == null || this.f33904E0 == null) {
            return;
        }
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "reRenderPage!!!");
        this.f33908G0.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: J7 */
    public final /* synthetic */ void m52577J7(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && this.f33904E0 == null) {
            this.f33935U.setVisibility(4);
            this.f33907G.setVisibility(0);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.c5m
    /* JADX INFO: renamed from: K2 */
    public User mo51069K2() {
        if (this.f33904E0 == null && !mo52130N2()) {
            m52497c9(CoreModule.m29932K().getUserById(this.f33924O0));
        }
        return this.f33904E0;
    }

    /* JADX INFO: renamed from: K7 */
    public final /* synthetic */ Boolean m52578K7() {
        if (this.f33930R0) {
            ((ProfileAct) act()).m50765X2(0);
            this.f33930R0 = false;
        }
        if (!TextUtils.isEmpty(this.f33926P0)) {
            m52511h7(this.f33926P0);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: K8 */
    public void m52579K8() {
        if (isDetached()) {
            act().m66873d2();
            return;
        }
        int iM52588O8 = m52588O8();
        if (m52470T6()) {
            m52503e9(true);
            return;
        }
        if (m52478V6()) {
            m52512h9(true);
            return;
        }
        if (m52474U6()) {
            m52512h9(true);
            return;
        }
        if (iM52588O8 > 0) {
            m52620f9(iM52588O8);
        } else if (NullChecker.m81303a(m52604Y6())) {
            m52516i9();
        } else {
            m51073N6();
        }
    }

    /* JADX INFO: renamed from: L7 */
    public final /* synthetic */ void m52580L7(Bundle bundle) {
        act().setTitle(m20604x4(R$string.f19008vj));
        if (CoreModule.m29932K().me_().isBanned()) {
            JailedDialogLikeAct.m44186o2(true);
        }
        CoreModule.f17545c.f19639e0.f149479u0.put(Boolean.FALSE);
        if (NullChecker.m81303a(bundle)) {
            m52497c9(CoreModule.m29932K().me_());
            if (NullChecker.m81303a(m94569i2())) {
                m52467S8(wn90.m204602F().f187269a);
                mo51067J3();
            }
        }
        xdl0.m208366b0(act().findViewById(R.id.content), new v9j() { // from class: l.g7a0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f101344a.m52578K7();
            }
        });
    }

    /* JADX INFO: renamed from: M6 */
    public View m52581M6(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g9a0.m124782b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M7 */
    public final /* synthetic */ void m52582M7(VerificationCenter verificationCenter) {
        if (TEnum.equals(verificationCenter.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenter.picVerificationInfo.status, "pending")) {
            if (NullChecker.m81303a(this.f33918L0)) {
                xdl0.m208344M(this.f33918L0, false);
            }
            m52631m7();
        }
    }

    /* JADX INFO: renamed from: N6 */
    public void m52583N6(e30<a5m> e30Var) {
        a5m a5mVar = this.f33941X;
        if (a5mVar == null) {
            this.f33949c1.add(e30Var);
        } else {
            e30Var.call(a5mVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ void m52584N7(View view, int i, ViewGroup viewGroup) {
        this.f33941X = (a5m) view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (NullChecker.m81303a(getContext())) {
            this.f33902D.addView(m52618f7(view), layoutParams);
        }
        if (view instanceof UserProfileExpandedCard) {
            UserProfileExpandedCard userProfileExpandedCard = (UserProfileExpandedCard) this.f33941X;
            int i2 = t100.f167259h;
            userProfileExpandedCard.m38020b1(i2, t100.f167264m, i2, t100.m186890d(68.0f));
        } else if (view instanceof d5m) {
            m52603X8();
            ((d5m) this.f33941X).mo36850S(this.f33948b1);
        }
        Iterator<e30<a5m>> it = this.f33949c1.iterator();
        while (it.hasNext()) {
            it.next().call(this.f33941X);
        }
        this.f33949c1.clear();
    }

    /* JADX INFO: renamed from: N8 */
    public final void m52585N8(final int i) {
        int i2 = this.f33942X0;
        if (i2 < 3) {
            this.f33942X0 = i2 + 1;
        } else {
            o6j0.m162859c("e_edit_profile_tab", "p_edit_profile_view", o6j0.C18854a.m162878h("edit_profile_tab", i == 0 ? SchemeKey.edit : i == 1 ? "preview" : "example"));
        }
        if (this.f33936U0.size() != 0) {
            if (i != 0 && NullChecker.m81303a(wn90.m204602F().f187269a)) {
                mo51092Z2();
            }
            if (i != 0) {
                act().hideInput();
            }
            m52583N6(new e30() { // from class: l.y7a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ProfileListFragLocalEditImpl.m52473U5(i, (a5m) obj);
                }
            });
            if (i == 2 && CoreModule.f17545c.f19639e0.f149342c1.get().booleanValue()) {
                CoreModule.f17545c.f19639e0.f149342c1.put(Boolean.FALSE);
                this.f33940W0.get(2).setVisibility(8);
            }
            if (i == 1) {
                mo51056E();
                m52603X8();
            } else if (i == 0 && NullChecker.m81303a(this.f33904E0)) {
                mo51056E();
                m52475U8(wn90.m204602F().f187269a);
            }
            for (int i3 = 0; i3 < this.f33936U0.size(); i3++) {
                ArrayList<TextView> arrayList = this.f33936U0;
                if (i3 == i) {
                    arrayList.get(i3).setTextColor(act().color(w0c0.f183773I));
                    xdl0.m208345M0(this.f33938V0.get(i3), true);
                } else {
                    arrayList.get(i3).setTextColor(act().color(w0c0.f183858j0));
                    xdl0.m208345M0(this.f33938V0.get(i3), false);
                }
            }
            m52597V8(i);
        }
    }

    /* JADX INFO: renamed from: O6 */
    public final void m52586O6(int i, boolean z, String str, boolean z2) {
        View viewM98599a = asm.m98599a(act(), f6c0.f95469Ma, null);
        TextView textView = (TextView) viewM98599a.findViewById(u4c0.f173764Cd);
        textView.setText(str);
        View viewFindViewById = viewM98599a.findViewById(u4c0.f173798Ed);
        xdl0.m208345M0(viewM98599a.findViewById(u4c0.f173762Cb), z2);
        this.f33936U0.add(textView);
        this.f33938V0.add(viewFindViewById);
        this.f33940W0.add(viewM98599a.findViewById(u4c0.f174223e3));
        this.f33901C.setClipChildren(false);
        TabLayout tabLayout = this.f33901C;
        tabLayout.addTab(tabLayout.newTab().setCustomView(viewM98599a), i, z);
    }

    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ void m52587O7() {
        this.f33954h1.m108244Z(true);
        mo51123o();
        o6j0.m162859c("e_edit_profile_post_pic_popup_confirm", "p_edit_profile_post_pic_popup", new o6j0.C18854a[0]);
        m52447L8();
    }

    /* JADX INFO: renamed from: O8 */
    public int m52588O8() {
        int i = 0;
        if (lqa.m150963a()) {
            AvatarCards avatarCards = this.f33956j1.f98153u;
            if (!NullChecker.m81303a(avatarCards)) {
                return 0;
            }
            int i2 = 0;
            while (i < avatarCards.getChildCount() && !avatarCards.m50811h(i).m50794n()) {
                if (!TEnum.equals(avatarCards.m50811h(i).getMedia().status, "normal")) {
                    i2++;
                }
                i++;
            }
            return i2;
        }
        MediaReorderCards mediaReorderCards = this.f33955i1.f81526v;
        if (!NullChecker.m81303a(mediaReorderCards)) {
            return 0;
        }
        int i3 = 0;
        while (i < mediaReorderCards.getChildCount() && !mediaReorderCards.m50811h(i).m50794n()) {
            if (!TEnum.equals(mediaReorderCards.m50811h(i).f32976N.status, "normal")) {
                i3++;
            }
            i++;
        }
        return i3;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: P1 */
    public boolean mo51075P1() {
        return true;
    }

    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ void m52589P7() {
        this.f33954h1.m108244Z(false);
        m52447L8();
        mo51123o();
    }

    /* JADX INFO: renamed from: Q6 */
    public void m52590Q6() {
        cme cmeVar;
        if (lqa.m150963a() || (cmeVar = this.f33955i1) == null) {
            return;
        }
        this.f33952f1 = true;
        cmeVar.mo131811a(new d30() { // from class: l.u8a0
            @Override // p149l.d30
            public final void call() {
                this.f175108a.m52649y7();
            }
        });
    }

    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ void m52591Q7(String str, List list) {
        if (vwb.m200296J(list)) {
            mo51123o();
        } else {
            ft4.m123008b().m123018k(act(), str);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: R */
    public boolean mo51078R() {
        return CoreModule.f17545c.f19663m0.f19463x0.get().booleanValue();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: R0 */
    public boolean mo51079R0() {
        return getActivity() instanceof NewUI1ContainerActivity;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: R3 */
    public void m51073N6() {
        act().m66873d2();
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ void m52592R7(Throwable th) {
        mo51123o();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: S */
    public boolean mo51082S() {
        return true;
    }

    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ void m52593S7(View view) {
        lra0.m151149h("button");
        if (!this.f33954h1.m108242W() || !m52555w7()) {
            final String strM123010c = ft4.m123008b().m123010c(this.f33904E0, wn90.m204602F().f187269a);
            if (ft4.m123008b().m123016i(strM123010c)) {
                act().duringCreated(CoreModule.f17545c.f19611U1.m101523i3("profile", strM123010c)).subscribe(mkd0.m154956H(new e30() { // from class: l.u7a0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f174953a.m52591Q7(strM123010c, (List) obj);
                    }
                }, new e30() { // from class: l.v7a0
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f180318a.m52592R7((Throwable) obj);
                    }
                }));
                return;
            } else {
                mo51123o();
                return;
            }
        }
        PicPostDlgView picPostDlgView = (PicPostDlgView) act().inflater().inflate(f6c0.f96030u8, (ViewGroup) null);
        picPostDlgView.m51823s(m52500d7());
        new Random().nextInt(26);
        this.f33937V.put(Integer.valueOf(this.f33937V.get().intValue() + 1));
        new dd80.C16336a(act()).m110963R(picPostDlgView).m110995x0(R$string.f18506f5, new Object[0]).m110990s0(R$string.f18537g5, new Object[0]).m110992u0(t100.f167258g, t100.f167268q).m110961P(false).m110972a0(R$string.f18445d5, new Runnable() { // from class: l.s7a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f162904a.m52587O7();
            }
        }).m110977f0(R$string.f18475e5, new Runnable() { // from class: l.t7a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f168683a.m52589P7();
            }
        }).m110980i0(x2c0.f190270jj).m110989r0();
        m52449M8(this.f33937V.get().intValue());
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ void m52594T7(View view) {
        lra0.m151149h("button");
        m51073N6();
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ void m52595U7(View view) {
        m52579K8();
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ void m52596V7(User user) {
        m52488Z8(user);
        m52497c9(user);
        this.f33908G0.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: V8 */
    public final void m52597V8(int i) {
        if (i == 0) {
            if (NullChecker.m81303a(this.f33918L0) && xdl0.m208349O0(this.f33918L0)) {
                this.f33918L0.m43737l0();
                return;
            }
            return;
        }
        if (i == 1 && NullChecker.m81303a(this.f33941X)) {
            ViewGroup viewGroup = (ViewGroup) this.f33941X.getCardView().getParent();
            if (NullChecker.m81303a(viewGroup)) {
                PicCertGuideView picCertGuideView = (PicCertGuideView) viewGroup.findViewById(u4c0.f173845H9);
                if (NullChecker.m81303a(picCertGuideView) && xdl0.m208349O0(picCertGuideView)) {
                    picCertGuideView.m43737l0();
                }
            }
        }
    }

    /* JADX INFO: renamed from: W6 */
    public final boolean m52598W6() {
        LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = TextUtils.equals(this.f33928Q0, "chat_complete_profile") ? LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_CHAT_COMPLETE_PROFILE : null;
        if (TextUtils.equals(this.f33928Q0, "mytab_complete_profile")) {
            loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MYTAB_COMPLETE_PROFILE;
        }
        if (TextUtils.equals(this.f33928Q0, "left_swipe_complete_profile")) {
            loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LEFT_SWIPE_COMPLETE_PROFILE;
        }
        if (TextUtils.equals(this.f33928Q0, "received_profile_like_not_null") || TextUtils.equals(this.f33928Q0, "received_profile_like_is_null")) {
            loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE;
        }
        if (TextUtils.equals(this.f33928Q0, "from_ideal_type_mine_tab_guide")) {
            LoopFragmentFactory.m51477U(wn90.m204602F().f187269a, this, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_GUIDE, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG);
            return true;
        }
        if (TextUtils.equals(this.f33928Q0, "from_ideal_type_other_profile")) {
            LoopFragmentFactory.m51477U(wn90.m204602F().f187269a, this, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_OTHER_PROFILE_FEEDBACK, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG);
            return true;
        }
        if (TextUtils.equals(this.f33928Q0, "from_ideal_type_profile_item")) {
            LoopFragmentFactory.m51477U(wn90.m204602F().f187269a, this, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_ITEM, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_PROFILE_ITEM);
            return true;
        }
        if (!NullChecker.m81303a(loopCreateEntryType)) {
            return false;
        }
        LoopFragmentFactory.m51477U(wn90.m204602F().f187269a, this, null, loopCreateEntryType, this.f33928Q0);
        return true;
    }

    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ void m52599W7(FakeGuideData fakeGuideData) {
        xdl0.m208344M(this.f33933T, true);
        xdl0.m208344M(this.f33913J, false);
        xdl0.m208344M(this.f33915K, false);
        xdl0.m208344M(this.f33917L, false);
        if (NullChecker.m81303a(this.f33918L0)) {
            xdl0.m208344M(this.f33918L0, false);
        }
        xdl0.m208344M(this.f33911I, true);
    }

    /* JADX INFO: renamed from: W8 */
    public final void m52600W8() {
        if (upa.m194800p2()) {
            int i = 0;
            if (lqa.m150963a()) {
                AvatarCards avatarCards = this.f33956j1.f98153u;
                if (NullChecker.m81303a(avatarCards)) {
                    int childCount = avatarCards.getChildCount();
                    while (i < childCount) {
                        avatarCards.m50811h(i).m51778n0(null);
                        i++;
                    }
                    return;
                }
                return;
            }
            MediaReorderCards mediaReorderCards = this.f33955i1.f81526v;
            if (NullChecker.m81303a(mediaReorderCards)) {
                int childCount2 = mediaReorderCards.getChildCount();
                while (i < childCount2) {
                    mediaReorderCards.m50811h(i).f32976N = null;
                    i++;
                }
            }
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: X6, reason: merged with bridge method [inline-methods] */
    public ArrayList<j760<String, d30>> mo29633C4() {
        ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        arrayList.add(vwb.m200311Y("user id", new d30() { // from class: l.e7a0
            @Override // p149l.d30
            public final void call() {
                this.f89680a.m52562z7();
            }
        }));
        arrayList.add(vwb.m200311Y("温馨提示框", new d30() { // from class: l.p7a0
            @Override // p149l.d30
            public final void call() {
                this.f147486a.m52420A7();
            }
        }));
        arrayList.add(vwb.m200311Y("用户位置信息", new d30() { // from class: l.a8a0
            @Override // p149l.d30
            public final void call() {
                this.f68009a.m52423B7();
            }
        }));
        arrayList.add(vwb.m200311Y("Profile Guide", new d30() { // from class: l.l8a0
            @Override // p149l.d30
            public final void call() {
                this.f126799a.m52567D7();
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ void m52602X7(Bundle bundle) {
        act().setTitle(m20604x4(R$string.f19008vj));
        CoreModule.f17545c.f19639e0.f149479u0.put(Boolean.FALSE);
        mo51108h3();
        if (ProfileListFrag.f33610I4 == null) {
            e51.m114774y(new Runnable() { // from class: l.w7a0
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListFragLocalEditImpl.m52428E5();
                }
            });
        }
        CoreModule.f17545c.f19636d0.f199753R.m121230k().first().subscribe(mkd0.m154950B());
    }

    /* JADX INFO: renamed from: X8 */
    public final void m52603X8() {
        m52583N6(new e30() { // from class: l.c9a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79876a.m52639q8((a5m) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: Y0 */
    public ViewGroup mo51089Y0() {
        return this.f33935U;
    }

    /* JADX INFO: renamed from: Y6 */
    public User m52604Y6() {
        if (NullChecker.m81303a(mo51058F1(false)) && this.f33954h1.m108241V()) {
            wn90.m204602F().f187269a.profile.extensions.momentSwitch.noSyncMoment.clear();
            wn90.m204602F().f187269a.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f33954h1.m108240U() ? "false" : "true");
        }
        User userMo223809clone = wn90.m204602F().f187269a.mo223809clone();
        m52515i7(userMo223809clone);
        return userMo223809clone.subtract(this.f33904E0);
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ void m52605Y7(roj0 roj0Var) {
        mo51108h3();
    }

    /* JADX INFO: renamed from: Y8 */
    public final void m52606Y8() {
        final int iM204635C;
        if (this.f33919M == null || this.f33921N == null || wn90.m204602F().f187281m.get().intValue() == (iM204635C = wn90.m204602F().m204635C(act(), wn90.m204602F().f187269a, true))) {
            return;
        }
        SpannableStringBuilder spannableStringBuilderM133861b0 = iM204635C < 100 ? i0g0.m133861b0("达到100%被喜欢的概率将提升4倍！", vwb.m200324f0("4倍"), -98787, eqh0.m117752c(2)) : i0g0.m133861b0("被喜欢的概率已超过70%的用户！", vwb.m200324f0("70%"), -98787, eqh0.m117752c(2));
        if (iM204635C == 0) {
            xdl0.m208344M(this.f33923O, true);
            xdl0.m208344M(this.f33925P, false);
        }
        this.f33929R.setText(spannableStringBuilderM133861b0);
        this.f33919M.m43746c(100.0f, act().color(w0c0.f183896w), t100.m186890d(6.0f), t100.m186890d(3.0f));
        e51.m114743H(act(), new Runnable() { // from class: l.t8a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f168814a.m52640r8(iM204635C);
            }
        }, 300L);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: Z2 */
    public int mo51092Z2() {
        int i = 0;
        if (lqa.m150963a()) {
            AvatarCards avatarCards = this.f33956j1.f98153u;
            if (!NullChecker.m81303a(avatarCards)) {
                return 0;
            }
            if (avatarCards.m50811h(0).m50794n()) {
                CrashHelper.m81296c(new NullPointerException("The first pic cannot be empty！"));
            }
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i < avatarCards.getChildCount() && !avatarCards.m50811h(i).m50794n()) {
                Media media = avatarCards.m50811h(i).getMedia();
                arrayList.add(media);
                if (NullChecker.m81303a(media) && !TEnum.equals(avatarCards.m50811h(i).getMedia().status, "normal")) {
                    i2++;
                }
                i++;
            }
            int size = arrayList.size();
            if (!NullChecker.m81303a(wn90.m204602F().f187269a)) {
                CrashHelper.m81296c(new NullPointerException("ProfileListFrag editingUser is null when edit pic"));
                wn90.m204602F().f187269a = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
            }
            if (size > 0) {
                wn90.m204602F().f187269a.pictures = arrayList;
                return i2;
            }
            if (wn90.m204602F().f187269a.pictures.isEmpty()) {
                wn90.m204602F().f187269a.pictures = this.f33904E0.pictures;
            }
            return i2;
        }
        MediaReorderCards mediaReorderCards = this.f33955i1.f81526v;
        if (!NullChecker.m81303a(mediaReorderCards)) {
            return 0;
        }
        if (mediaReorderCards.m50811h(0).m50794n()) {
            CrashHelper.m81296c(new NullPointerException("The first pic cannot be empty！"));
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (i < mediaReorderCards.getChildCount() && !mediaReorderCards.m50811h(i).m50794n()) {
            Media media2 = mediaReorderCards.m50811h(i).f32976N;
            arrayList2.add(media2);
            if (NullChecker.m81303a(media2) && !TEnum.equals(mediaReorderCards.m50811h(i).f32976N.status, "normal")) {
                i3++;
            }
            i++;
        }
        int size2 = arrayList2.size();
        if (!NullChecker.m81303a(wn90.m204602F().f187269a)) {
            CrashHelper.m81296c(new NullPointerException("ProfileListFrag editingUser is null when edit pic"));
            wn90.m204602F().f187269a = CoreModule.f17545c.f19639e0.m169527p9().mo223809clone();
        }
        if (size2 > 0) {
            wn90.m204602F().f187269a.pictures = arrayList2;
        } else if (wn90.m204602F().f187269a.pictures.isEmpty()) {
            wn90.m204602F().f187269a.pictures = this.f33904E0.pictures;
        }
        if (size2 <= mediaReorderCards.getChildCount()) {
            m52525l9(size2, null, mediaReorderCards);
        }
        return i3;
    }

    /* JADX INFO: renamed from: Z7 */
    public final /* synthetic */ void m52607Z7(C4319c c4319c) {
        if (this.f33901C.getSelectedTabPosition() == 0) {
            e51.m114743H(act(), new Runnable() { // from class: l.r7a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f158017a.m52590Q6();
                }
            }, 1000L);
        }
    }

    /* JADX INFO: renamed from: a8 */
    public final /* synthetic */ Boolean m52608a8(C4319c c4319c) {
        return Boolean.valueOf(this.f33901C.getSelectedTabPosition() == 1);
    }

    /* JADX INFO: renamed from: a9 */
    public void m52609a9() {
        this.pageHelper.m109041q(pageId());
        C8829f.m54696b().m54701f(this.f33928Q0);
    }

    /* JADX INFO: renamed from: b7 */
    public VReorderCard m52610b7(int i) {
        cme cmeVar;
        MediaReorderCards mediaReorderCards;
        if (lqa.m150963a() || (cmeVar = this.f33955i1) == null || (mediaReorderCards = cmeVar.f81526v) == null) {
            return null;
        }
        return mediaReorderCards.m50811h(i);
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ void m52611b8(C4319c c4319c) {
        m52616e7();
    }

    /* JADX INFO: renamed from: b9 */
    public void m52612b9(int i, int i2) {
        if (NullChecker.m81303a(this.f33912I0) && this.f33912I0.isRunning()) {
            return;
        }
        if (i == 0 && i2 - i >= 20) {
            i = i2 - 20;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        this.f33912I0 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(400L);
        this.f33912I0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.d9a0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f84945a.m52641s8(valueAnimator);
            }
        });
        this.f33912I0.addListener(new C8727d(i2));
        this.f33912I0.setInterpolator(new LinearInterpolator());
        this.f33912I0.start();
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ void m52613c8(User user, CoreSuggested.UserInfo userInfo, a5m a5mVar) {
        a5mVar.setPageHelper(this.f33946Z0);
        a5mVar.mo36852T(user, userInfo, 0);
        xdl0.m208344M(this.f33903E, false);
        if (xdl0.m208349O0(this.f33902D)) {
            a5mVar.mo36817G();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        wn90.m204602F().f187269a = CoreModule.f17545c.f19639e0.m169520na().mo223809clone();
        duringCreated(this.f33908G0).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.k6a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121277a.m52575I7((roj0) obj);
            }
        }, new e30() { // from class: l.l6a0
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81296c((Throwable) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.m6a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131453a.m52577J7((C4319c) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.n6a0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return C22306c.timer(450L, TimeUnit.MILLISECONDS);
            }
        }).compose(mkd0.m154951C()).subscribe(mkd0.m154955G(new e30() { // from class: l.o6a0
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19552B0.m31617p4(CoreModule.m29931H().userId());
            }
        }));
        creates(new e30() { // from class: l.p6a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147383a.m52580L7((Bundle) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d8 */
    public final /* synthetic */ void m52614d8(knb0 knb0Var) {
        final User user = (User) knb0Var.f123873a;
        B b = knb0Var.f123874b;
        user.friendCommentInfo = ((User) b).friendCommentInfo;
        user.verifications = ((User) b).verifications;
        final CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f19472id = user.f56011id;
        userInfo.renderFrom = CardInfoRenderFrom.PROFILE_PREVIEW;
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(knb0Var.f123875c)) {
            List<T> list = ((q860) knb0Var.f123875c).f153135a;
            if (!vwb.m200296J(list)) {
                for (T t : list) {
                    if (!vwb.m200296J(t.media)) {
                        for (Media media : t.media) {
                            if ((media instanceof Picture) || (media instanceof Video)) {
                                arrayList.add(media);
                            }
                        }
                    }
                }
            }
        }
        userInfo.userMedia = arrayList;
        userInfo.coreMomentInfoList = ((q860) knb0Var.f123875c).f153135a;
        userInfo.myTabTask = (MyTabTask) knb0Var.f123876d;
        m52508g7(userInfo);
        m52583N6(new e30() { // from class: l.x7a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191329a.m52613c8(user, userInfo, (a5m) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d9 */
    public boolean m52615d9() {
        return "profile_frag_me_avatar".equals(this.f33928Q0);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: e7 */
    public final void m52616e7() {
        if (wn90.m204606U(CoreModule.f17545c.f19639e0.m169520na())) {
            CoreModule.f17545c.f19639e0.f149412k7.m132487l(MyTabTask.new_());
        } else {
            if (upa.m194745e2() && TextUtils.equals(CoreModule.f17545c.f19639e0.f149321Z3.get(), UserHomeMode.marryMode)) {
                return;
            }
            CoreModule.f17545c.f19639e0.m169375C7();
        }
    }

    /* JADX INFO: renamed from: e8 */
    public final /* synthetic */ void m52617e8(boolean z) {
        mo51092Z2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        creates(new e30() { // from class: l.q6a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152860a.m52602X7((Bundle) obj);
            }
        });
        duringCreated(C4750p.f20079f0).subscribe(mkd0.m154955G(new e30() { // from class: l.r6a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157906a.m52605Y7((roj0) obj);
            }
        }));
        duringCreated(C4750p.f20080g0).subscribe(mkd0.m154955G(new e30() { // from class: l.s6a0
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileListFragLocalEditImpl.m52476V4((roj0) obj);
            }
        }));
        duringCreated(CoreModule.f17545c.f19636d0.m215895j3()).subscribe(mkd0.m154950B());
        m52629l7();
        m52547t7();
        if (lqa.m150973k()) {
            lifecycle().filter(new w9j() { // from class: l.u6a0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            }).first().subscribe(mkd0.m154956H(new e30() { // from class: l.v6a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f180174a.m52607Z7((C4319c) obj);
                }
            }, new e30() { // from class: l.w6a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ProfileListFragLocalEditImpl.m52532o6((Throwable) obj);
                }
            }));
        }
        if (upa.m194800p2()) {
            lifecycle().filter(new w9j() { // from class: l.x6a0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
                }
            }).filter(new w9j() { // from class: l.y6a0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f196537a.m52608a8((C4319c) obj);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.z6a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f201901a.m52611b8((C4319c) obj);
                }
            }, new e30() { // from class: l.a7a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ProfileListFragLocalEditImpl.m52542s5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f7 */
    public final LinearLayout m52618f7(View view) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        final View viewInflate = o7r.m163037a(getContext()).inflate(f6c0.f95947pa, (ViewGroup) linearLayout, false);
        linearLayout.addView(viewInflate);
        final PicCertGuideView picCertGuideView = (PicCertGuideView) o7r.m163037a(getContext()).inflate(f6c0.f96013t8, (ViewGroup) linearLayout, false);
        xdl0.m208360X(picCertGuideView, t100.m186890d(12.0f));
        xdl0.m208358V(picCertGuideView, t100.m186890d(8.0f));
        xdl0.m208359W(picCertGuideView, t100.m186890d(8.0f));
        xdl0.m208357U(picCertGuideView, -t100.m186890d(3.0f));
        linearLayout.addView(picCertGuideView);
        if (view instanceof UserProfileExpandedCard) {
            ((UserProfileExpandedCard) view).m38020b1(0, 0, 0, t100.m186890d(44.0f));
            linearLayout.addView(m52635n9(view));
        } else {
            linearLayout.addView(view);
        }
        duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged(new w9j() { // from class: l.v8a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).status;
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.x8a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f191453a.m52571F7(viewInflate, picCertGuideView, (User) obj);
            }
        }, new e30() { // from class: l.y8a0
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileListFragLocalEditImpl.m52433G5((Throwable) obj);
            }
        }));
        if (jjb0.m141784b()) {
            duringCreated(CoreModule.f17545c.f19552B0.m31611j4().filter(new w9j() { // from class: l.z8a0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    VerificationCenter verificationCenter = (VerificationCenter) obj;
                    return Boolean.valueOf(NullChecker.m81303a(verificationCenter) && NullChecker.m81303a(verificationCenter.picVerificationInfo));
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.a9a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f68125a.m52569E7(picCertGuideView, (VerificationCenter) obj);
                }
            }));
        }
        return linearLayout;
    }

    /* JADX INFO: renamed from: f8 */
    public final /* synthetic */ void m52619f8() {
        this.f33955i1.f81526v.setViewCatchListener(new VReorderCards.InterfaceC8627c() { // from class: l.o7a0
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.VReorderCards.InterfaceC8627c
            /* JADX INFO: renamed from: a */
            public final void mo50822a(boolean z) {
                this.f142476a.m52617e8(z);
            }
        });
        if (lqa.m150985w()) {
            this.f33955i1.f81526v.m50819q(new Runnable() { // from class: l.q7a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f153024a.mo51092Z2();
                }
            });
        }
    }

    /* JADX INFO: renamed from: f9 */
    public void m52620f9(final int i) {
        new xh0.C21150a(act()).m208740s(m20604x4(R$string.f18013Oq)).m208728g(false).m208730i(R$string.f17983Nq).m208738q(R$string.f17953Mq).m208736o(new View.OnClickListener() { // from class: l.m5a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131384a.m52648x8(i, view);
            }
        }).m208726e(R$string.f18408c).m208722a().m208721g();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    public String from() {
        return this.f33928Q0;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: g3 */
    public boolean mo51106g3() {
        return false;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INIT_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        super.mo20586g4(bundle);
        m52541r7();
        m52432F8();
        if (NullChecker.m81303a(act().getSupportActionBar())) {
            act().getSupportActionBar().mo134126m();
        }
        m52552v7();
        m52643u7();
        m52538q7();
        initState();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: g8 */
    public final /* synthetic */ void m52621g8(MenuItem menuItem, View view) {
        startActivity(ProfileAct.m50738p2(act() == null ? menuItem.getActionView().getContext() : act(), this.f33924O0, "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: g9 */
    public final void m52622g9() {
        if (CoreModule.m29932K().me_().isBanned()) {
            return;
        }
        if (CoreModule.f17545c.f19639e0.m169482e8()) {
            xx0.m211439h(act());
        } else if (CoreModule.m29932K().me_().isAudit()) {
            xx0.m211437f(act());
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: h3 */
    public void mo51108h3() {
        duringCreated(CoreModule.f17545c.f19639e0.m169454W9(userId()).flatMap(new w9j() { // from class: l.k7a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19682s1.m34369s3();
            }
        }).map(new w9j() { // from class: l.l7a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f126704a.m52630l8((List) obj);
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.m7a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131802a.m52632m8((j760) obj);
            }
        }, new e30() { // from class: l.n7a0
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileListFragLocalEditImpl.m52521k6((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h8 */
    public final /* synthetic */ void m52623h8(List list) {
        this.f33959l1.m97553i0(list);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: i3 */
    public int mo51111i3() {
        return this.f33950d1;
    }

    /* JADX INFO: renamed from: i8 */
    public final /* synthetic */ C22306c m52624i8(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f17545c.f19639e0.m169385E9(user);
        }
        wn90.m204602F().f187269a.description = profileEditInfo.user.description;
        wn90.m204602F().f187269a.profile = profileEditInfo.user.profile;
        User user2 = wn90.m204602F().f187269a;
        User user3 = profileEditInfo.user;
        user2.name = user3.name;
        if (TextUtils.isEmpty(user3.pictures.get(0).url)) {
            m52471T8(wn90.m204602F().f187269a, true);
            if (!lqa.m150963a()) {
                xdl0.m208344M(this.f33955i1.f81527w, false);
            }
        } else {
            if (!lqa.m150963a()) {
                xdl0.m208344M(this.f33955i1.f81527w, true);
            }
            wn90.m204602F().f187269a.pictures = profileEditInfo.user.pictures;
            m52471T8(wn90.m204602F().f187269a, false);
        }
        throw new ProfileEditInfoException(profileEditInfo);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INFLATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        View viewM52581M6 = m52581M6(layoutInflater, viewGroup);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        return viewM52581M6;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: j3 */
    public void mo51113j3(int i) {
        Intent intent = new Intent();
        if (!NullChecker.m81303a(this.f33904E0)) {
            act().m66873d2();
        } else {
            act().setResult(i, intent);
            act().m66873d2();
        }
    }

    /* JADX INFO: renamed from: j7 */
    public void m52625j7() {
        this.f33924O0 = getArguments().getString("user_id");
        this.f33928Q0 = getArguments().getString("from");
        if (TextUtils.isEmpty(this.f33924O0)) {
            CrashHelper.m81297d(new NullPointerException("profilelistFrag_initArguments_userid_null,from:" + this.f33928Q0), 1000);
            act().m66873d2();
            return;
        }
        this.f33926P0 = getArguments().getString("input_type");
        this.f33930R0 = getArguments().getBoolean("open_media_picker");
        Serializable serializable = getArguments().getSerializable("params_extra_map_data");
        if (serializable instanceof HashMap) {
            this.f33916K0 = (HashMap) serializable;
        }
    }

    /* JADX INFO: renamed from: j8 */
    public final /* synthetic */ void m52626j8(boolean z, User user, User user2, e30 e30Var, User user3, roj0 roj0Var) {
        if (z) {
            CoreModule.f17545c.f19639e0.f149377g4.m132487l("");
        }
        if (user.pictures.size() - user2.pictures.size() > 0) {
            zvf0.m220371D("e_upload_photos_success", pageId(), vwb.m200311Y("upload_page_name", "edit_profile_page"), vwb.m200311Y("upload_photos_count", Integer.valueOf(user.pictures.size() - user2.pictures.size())));
        }
        if (upa.m194800p2() && NullChecker.m81303a(this.f33904E0) && !TextUtils.isEmpty(this.f33904E0.description) && !vwb.m200296J(this.f33904E0.pictures) && this.f33904E0.pictures.size() >= 3) {
            pib pibVar = CoreModule.f17545c.f19639e0;
            if (pibVar.f149316Y6 && !pibVar.f149332a7) {
                pibVar.f149332a7 = true;
                zvf0.m220371D("e_complete_card_success", "p_edit_profile_view", new j760[0]);
            }
        }
        if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
        if (NullChecker.m81303a(user3.pictures) && user3.pictures.size() > 0) {
            CoreModule.f17545c.f19639e0.m169395H7();
        }
        if (m52555w7() && this.f33954h1.m108240U() && !this.f33962o1) {
            wn90.m204602F().f187272d.m132487l(Integer.valueOf(gd70.f102083c));
            wn90.m204602F().f187273e.m132487l(roj0.f160388a);
        } else if (!this.f33962o1) {
            wn90.m204602F().f187272d.m132487l(Integer.valueOf((NullChecker.m81303a(this.f33904E0) && this.f33904E0.status.contains(UserStatus.get(UserStatus.audit))) ? gd70.f102084d : gd70.f102085e));
        }
        m20599s4();
    }

    /* JADX INFO: renamed from: k8 */
    public final /* synthetic */ void m52627k8(User user, User user2, final e30 e30Var, Throwable th) {
        if (yij0.m214930H(th)) {
            m20599s4();
            return;
        }
        if (th instanceof ProfileEditInfoException) {
            m20599s4();
            if (tw6.m190849d(((ProfileEditInfoException) th).getEditInfo(), pageId())) {
                lsi0.m151593w(R$string.f18409c0);
                return;
            } else {
                osi0.m165782f(R$string.f17874K7);
                return;
            }
        }
        if (NullChecker.m81303a(act())) {
            m20599s4();
            String string = act().getString(R$string.f17737Fk);
            double dDoubleValue = (NullChecker.m81303a(user.settings) && NullChecker.m81303a(user.settings.birthdate)) ? user.settings.birthdate.doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (NullChecker.m81303a(user2.settings) && NullChecker.m81303a(user2.settings.birthdate)) {
                dDoubleValue = user2.settings.birthdate.doubleValue();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis((long) dDoubleValue);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(qib0.f154693H.guessedCurrentServerTime());
            int iM149011T = l9b.m149011T(calendar, calendar2);
            if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name) && iM149011T > 120) {
                string = act().getString(R$string.f18140T3);
            } else if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name)) {
                string = act().getString(R$string.f18170U3);
            } else if (iM149011T > 120) {
                string = act().getString(R$string.f18200V3);
            }
            m20581b4().m20504F(string).m20556t0(R$string.f18046Q, new Runnable() { // from class: l.b9a0
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListFragLocalEditImpl.m52443K5(e30Var);
                }
            }).m20541k0(R$string.f18408c).m20568z0();
        }
    }

    /* JADX INFO: renamed from: k9 */
    public void m52628k9() {
        lra0.m151149h("android_back");
    }

    /* JADX INFO: renamed from: l7 */
    public void m52629l7() {
        if (ft4.m123008b().m123014g()) {
            act().duringCreated(CoreModule.f17545c.f19611U1.f75278S).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.q8a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f153148a.m52573H7((Boolean) obj);
                }
            }, new e30() { // from class: l.r8a0
                @Override // p149l.e30
                public final void call(Object obj) {
                    ProfileListFragLocalEditImpl.m52464S4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l8 */
    public final /* synthetic */ j760 m52630l8(List list) {
        return vwb.m200311Y(list, BookMoviesDramasHelper.m59445l(userId()));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: m0 */
    public boolean mo51119m0() {
        return true;
    }

    /* JADX INFO: renamed from: m7 */
    public final void m52631m7() {
        if (CertificationUtil.m58153l() || !NullChecker.m81303a(mo51058F1(false)) || wn90.m204602F().f187269a.status.contains(UserStatus.get(UserStatus.audit))) {
            if (!NullChecker.m81303a(mo51058F1(false))) {
                xdl0.m208344M(this.f33911I, false);
                return;
            }
            if (m52647x7()) {
                xdl0.m208344M(this.f33911I, true);
                boolean zContains = wn90.m204602F().f187269a.status.contains(UserStatus.get(UserStatus.audit));
                this.f33914J0 = zContains;
                xdl0.m208344M(this.f33913J, zContains);
                xdl0.m208344M(this.f33915K, false);
                xdl0.m208344M(this.f33917L, !this.f33914J0);
                if (this.f33914J0) {
                    xdl0.m208344M(this.f33917L, false);
                } else {
                    m52606Y8();
                }
            }
        }
    }

    /* JADX INFO: renamed from: m8 */
    public final /* synthetic */ void m52632m8(j760 j760Var) {
        this.f33910H0 = j760Var;
        mo51067J3();
    }

    /* JADX INFO: renamed from: m9 */
    public void m52633m9(int i) {
        if (i > this.f33934T0.size()) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f33934T0.size()) {
            xdl0.m208344M(this.f33934T0.get(i2), i2 == i);
            i2++;
        }
        m52585N8(i);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: me */
    public User mo52295me() {
        if (this.f33906F0 == null) {
            m52488Z8(CoreModule.m29932K().me_());
        }
        return this.f33906F0;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo20594n4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.PRE_CREATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        setHasOptionsMenu(true);
        m52625j7();
        m52530n7();
        if ("my_tab_profile_like".equals(this.f33928Q0)) {
            this.pageHelper.m109041q(pageId());
        } else {
            m52609a9();
        }
        m52544s7();
        p420.m167354t(act());
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        m52522k7();
    }

    /* JADX INFO: renamed from: n8 */
    public final /* synthetic */ void m52634n8(List list, boolean z) {
        this.f33956j1.m121972W(list, z);
    }

    /* JADX INFO: renamed from: n9 */
    public final View m52635n9(View view) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(Color.parseColor("#f3f3f3"));
        View view2 = new View(view.getContext());
        view2.setBackground(view.getContext().getDrawable(x2c0.f190418o7));
        frameLayout.addView(view2, new FrameLayout.LayoutParams(-1, t100.m186890d(27.0f)));
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: o */
    public void mo51123o() {
        boolean zEquals = TextUtils.equals(wn90.m204602F().f187269a.description, this.f33906F0.description);
        String str = "about_me_pop_ups";
        if (!TextUtils.equals(this.f33928Q0, "about_me_pop_ups")) {
            str = "about_me_banner";
            if (!TextUtils.equals(this.f33928Q0, "about_me_banner")) {
                str = "edit_data_button";
                if (!TextUtils.equals(this.f33928Q0, "edit_data_button")) {
                    str = "edit_home_page";
                    if (!TextUtils.equals(this.f33928Q0, "edit_home_page")) {
                        str = "other";
                    }
                }
            }
        }
        o6j0.m162859c("e_edit_personal_profile_finish", "p_edit_profile_view", o6j0.C18854a.m162878h("about_me_is_modified", zEquals ? "no" : "yes"), o6j0.C18854a.m162878h("previous_page", str));
        if (!NullChecker.m81303a(mo51058F1(false)) || !NullChecker.m81303a(this.f33904E0)) {
            m51073N6();
            return;
        }
        if (this.f33954h1.m108241V()) {
            wn90.m204602F().f187269a.profile.extensions.momentSwitch.noSyncMoment.clear();
            wn90.m204602F().f187269a.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f33954h1.m108240U() ? "false" : "true");
        }
        int iMo51092Z2 = mo51092Z2();
        if (m52470T6()) {
            m52503e9(false);
            return;
        }
        if (m52478V6()) {
            m52512h9(false);
            return;
        }
        if (m52474U6()) {
            m52512h9(false);
        } else if (wn90.m204602F().f187269a.equals(this.f33904E0)) {
            m51073N6();
        } else {
            m52519j9(iMo51092Z2);
        }
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ void m52636o8(Media media, Boolean bool, Boolean bool2) {
        mo51092Z2();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 786) {
            if (i2 == -1) {
                ark.m98433L0(act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f54603h));
                return;
            }
            return;
        }
        if (1 == i && NullChecker.m81303a(intent)) {
            String stringExtra = intent.getStringExtra("about_me");
            wn90.m204602F().f187269a.description = vwb.m200333k(stringExtra).trim();
            mo51056E();
            m52475U8(wn90.m204602F().f187269a);
            return;
        }
        if (NullChecker.m81303a(intent) && i2 == -1 && LoopFragmentFactory.m51470N(i, wn90.m204602F().f187269a, intent)) {
            mo51056E();
            m52475U8(wn90.m204602F().f187269a);
            if (i == LoopInputType.HIDDEN_SCHOOL.requestCode) {
                this.f33958k1.m189686R0();
                return;
            }
            return;
        }
        if (i == 3500 && i2 == -1 && NullChecker.m81303a(intent)) {
            if (NullChecker.m81303a(wn90.m204602F().f187269a)) {
                LoopFragmentFactory.m51489j(act());
                if (upa.m194825u2()) {
                    m52459Q8(wn90.m204602F().f187269a.pictures);
                }
                mo51056E();
                m52475U8(wn90.m204602F().f187269a);
                return;
            }
            return;
        }
        if (i == 3001) {
            mo51056E();
            m52475U8(wn90.m204602F().f187269a);
        } else if (i == 3003) {
            mo51067J3();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (getActivity() instanceof NewUI1ContainerActivity) {
            menuInflater.inflate(h7c0.f106224f, menu);
            final MenuItem menuItemFindItem = menu.findItem(u4c0.f174296i8);
            menuItemFindItem.getActionView().setOnClickListener(new View.OnClickListener() { // from class: l.j6a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f116403a.m52621g8(menuItemFindItem, view);
                }
            });
            CoreBusinessModule.m29908m0().mo190518e(menuItemFindItem);
        }
    }

    @Override // com.p046p1.mobile.putong.core.app.AutoReleaseVideoFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        PerformanceLogUtil.instance().endTrance();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (NullChecker.m81303a(mo51058F1(false))) {
            mo51092Z2();
            bundle.putBoolean("saveInstanceKey", true);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: p */
    public ViewGroup mo51125p() {
        return this.f33905F;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.a1m
    /* JADX INFO: renamed from: p3 */
    public void mo51126p3(final int i, final Media media) {
        if (lqa.m150963a()) {
            return;
        }
        this.f33955i1.mo131811a(new d30() { // from class: l.w8a0
            @Override // p149l.d30
            public final void call() {
                this.f185171a.m52570E8(i, media);
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public final void m52637p7() {
        if (this.f33947a1 == null) {
            this.f33947a1 = new wuh0(act());
        }
        this.f33947a1.m205638d(vi4.m198495a().mo102628a(true), this.f33902D, new wuh0.InterfaceC20963e() { // from class: l.j7a0
            @Override // p149l.wuh0.InterfaceC20963e
            /* JADX INFO: renamed from: a */
            public final void mo102516a(View view, int i, ViewGroup viewGroup) {
                this.f116577a.m52584N7(view, i, viewGroup);
            }
        });
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ void m52638p8(boolean z, List list) {
        MediaReorderCards mediaReorderCards = this.f33955i1.f81526v;
        mediaReorderCards.setCurPageId("p_edit_profile_view");
        int i = 0;
        while (true) {
            if (i >= mediaReorderCards.getChildCount()) {
                break;
            }
            mediaReorderCards.m50811h(i).setIllegalPicture(z && i < list.size());
            mediaReorderCards.m50811h(i).m50640C1(i < list.size() ? (Media) list.get(i) : null);
            mediaReorderCards.m50811h(i).setChangeAction(new g30() { // from class: l.f8a0
                @Override // p149l.g30
                /* JADX INFO: renamed from: a */
                public final void mo36055a(Object obj, Object obj2, Object obj3) {
                    this.f96329a.m52636o8((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            if (upa.m194825u2()) {
                mediaReorderCards.m50811h(i).m50644E1(i, "p_edit_profile_view");
                if (!this.f33939W.get().booleanValue() && i == list.size()) {
                    mediaReorderCards.m50811h(i).m50666P1();
                    this.f33939W.put(Boolean.TRUE);
                }
            }
            mediaReorderCards.m50811h(i).m50651I0(i);
            i++;
        }
        int size = list.size();
        if (size < mediaReorderCards.getChildCount()) {
            m52525l9(size, null, mediaReorderCards);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_edit_profile_view";
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m52639q8(final a5m a5mVar) {
        if (a5mVar instanceof UserProfileExpandedCard) {
            return;
        }
        xdl0.m208353Q0(this.f33902D, new e30() { // from class: l.e9a0
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileListFragLocalEditImpl.m52479W4(a5mVar, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m52640r8(int i) {
        m52612b9(wn90.m204602F().f187281m.get().intValue(), i);
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ void m52641s8(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f33921N.m43746c(iIntValue, act().color(w0c0.f183773I), t100.m186890d(6.0f), t100.m186890d(3.0f));
        this.f33927Q.setText(String.format("已完成%s", iIntValue + "%"));
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ void m52642t8(DialogInterface dialogInterface) {
        this.f33964p1.m109033i();
        this.f33964p1.m109036l();
    }

    /* JADX INFO: renamed from: u7 */
    public final void m52643u7() {
        this.f33934T0.add(this.f33905F);
        this.f33934T0.add(this.f33902D);
        xdl0.m208344M(this.f33901C, true);
        int i = getArguments().getInt("preview_type", 0);
        xdl0.m208360X(this.f33905F, t100.m186890d(56.0f));
        xdl0.m208360X(this.f33902D, t100.m186890d(56.0f));
        m52586O6(0, i == 0, act().getString(R$string.f18230W3), true);
        m52586O6(1, i == 1, act().getString(R$string.f18080R3), false);
        m52637p7();
        if (this.f33901C.getTabCount() > 1 && m52615d9()) {
            this.f33942X0 = 0;
        }
        m52633m9(i);
        this.f33901C.setScrollPosition(i, 0.0f, false);
        this.f33901C.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C8724a());
        duringCreated(mkd0.m154986t(this.f33943Y, CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged(), m52435G8(), CoreModule.f17545c.f19639e0.f149412k7.distinctUntilChanged(), new z9j() { // from class: l.b7a0
            @Override // p149l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                return ProfileListFragLocalEditImpl.m52531o5((User) obj, (User) obj2, (q860) obj3, (MyTabTask) obj4);
            }
        })).filter(new w9j() { // from class: l.c7a0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a(((knb0) obj).f123873a));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.d7a0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84722a.m52614d8((knb0) obj);
            }
        }));
        if (!lqa.m150963a()) {
            this.f33955i1.mo131811a(new d30() { // from class: l.f7a0
                @Override // p149l.d30
                public final void call() {
                    this.f96232a.m52619f8();
                }
            });
        }
        if (this.f33901C.getTabCount() <= 1 || !m52615d9()) {
            if (this.f33901C.getSelectedTabPosition() == 0) {
                m52622g9();
                return;
            }
            return;
        }
        this.f33944Y0 = true;
        TabLayout tabLayout = this.f33901C;
        tabLayout.selectTab(tabLayout.getTabAt(0));
        TabLayout tabLayout2 = this.f33901C;
        if (tabLayout2 != null) {
            this.f33944Y0 = true;
            tabLayout2.selectTab(tabLayout2.getTabAt(1));
        }
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ void m52644u8(DialogInterface dialogInterface) {
        this.f33964p1.m109035k();
        this.f33964p1.m109034j();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListBaseFrag, p149l.c5m
    public String userId() {
        return this.f33924O0;
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ void m52645v8(View view) {
        List<Media> listM200339n = vwb.m200339n(wn90.m204602F().f187269a.pictures, new C8729f());
        User user = wn90.m204602F().f187269a;
        if (vwb.m200296J(listM200339n)) {
            listM200339n = this.f33904E0.pictures;
        }
        user.pictures = listM200339n;
        zvf0.m220396r("e_delete_photo_saveothers", "p_lowqualityphoto_save_popup");
        m52442J8();
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ void m52646w8(boolean z, View view) {
        if (!z) {
            zvf0.m220396r("e_ontinue_editing", "p_lowqualityphoto_save_popup");
        } else {
            zvf0.m220396r("e_not_save", "p_lowqualityphoto_save_popup");
            m51073N6();
        }
    }

    /* JADX INFO: renamed from: x7 */
    public final boolean m52647x7() {
        return wn90.m204602F().f187269a.status.contains(UserStatus.get(UserStatus.audit));
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ void m52648x8(int i, View view) {
        if (i == wn90.m204602F().f187269a.pictures.size()) {
            wn90.m204602F().f187269a.pictures = this.f33904E0.pictures;
        } else {
            wn90.m204602F().f187269a.pictures = vwb.m200339n(wn90.m204602F().f187269a.pictures, new w9j() { // from class: l.e8a0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Media) obj).status, "normal"));
                }
            });
        }
        m52442J8();
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ void m52649y7() {
        MediaReorderCard mediaReorderCardM50811h = this.f33955i1.f81526v.m50811h(1);
        MediaReorderCard mediaReorderCardM50811h2 = this.f33955i1.f81526v.m50811h(2);
        mediaReorderCardM50811h.m50713z0();
        mediaReorderCardM50811h2.m50713z0();
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ void m52650y8(View view) {
        List<Media> listM200339n = vwb.m200339n(wn90.m204602F().f187269a.pictures, new C8730g());
        User user = wn90.m204602F().f187269a;
        if (vwb.m200296J(listM200339n)) {
            listM200339n = this.f33904E0.pictures;
        }
        user.pictures = listM200339n;
        zvf0.m220396r("e_delete_photo_saveothers", "p_lowqualityphoto_save_popup");
        m52442J8();
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ void m52651z8(boolean z, View view) {
        if (!z) {
            zvf0.m220396r("e_ontinue_editing", "p_lowqualityphoto_save_popup");
        } else {
            zvf0.m220396r("e_not_save", "p_lowqualityphoto_save_popup");
            m51073N6();
        }
    }
}
