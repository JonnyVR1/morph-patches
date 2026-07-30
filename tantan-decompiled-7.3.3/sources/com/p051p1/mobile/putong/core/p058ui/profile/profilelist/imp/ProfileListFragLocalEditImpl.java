package com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp;

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
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4901p;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p051p1.mobile.putong.core.data.CategorySuggestions;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.DatingGuideData;
import com.p051p1.mobile.putong.core.data.FakeGuideData;
import com.p051p1.mobile.putong.core.data.Literatures;
import com.p051p1.mobile.putong.core.data.LiteraturesComments;
import com.p051p1.mobile.putong.core.data.MyTabTask;
import com.p051p1.mobile.putong.core.data.ProfileEditInfo;
import com.p051p1.mobile.putong.core.data.ProfileLikeType;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard;
import com.p051p1.mobile.putong.core.newui.view.PicCertGuideView;
import com.p051p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p051p1.mobile.putong.core.p058ui.account.JailedDialogLikeAct;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.MediaReorderCards;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCard;
import com.p051p1.mobile.putong.core.p058ui.profile.VReorderCards;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.PerformanceLogUtil;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.ProfileLogEntity;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.photo.AvatarCards;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.PicPostDlgView;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.ProfileListFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.SmoothScrollLinearLayoutManager;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import com.p051p1.mobile.putong.core.p058ui.report.C8992f;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.core.util.DebugUtil;
import com.p051p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLabel;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.SchemeKey;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p070ui.mediapicker.MediaPickerBaseAct;
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
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VButton;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VProgressBar;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;
import p153l.a30;
import p153l.adc0;
import p153l.aw90;
import p153l.b9c;
import p153l.bnl0;
import p153l.bsj0;
import p153l.c9c0;
import p153l.cum;
import p153l.dbc0;
import p153l.dkb;
import p153l.e3i0;
import p153l.ene;
import p153l.eu4;
import p153l.ey0;
import p153l.fo0;
import p153l.fph0;
import p153l.gne;
import p153l.gra;
import p153l.gya0;
import p153l.i4g0;
import p153l.jl80;
import p153l.jme;
import p153l.jr90;
import p153l.jxd0;
import p153l.jyb;
import p153l.kec0;
import p153l.kha0;
import p153l.l4g0;
import p153l.l51;
import p153l.lfc0;
import p153l.lyh0;
import p153l.ml70;
import p153l.moe;
import p153l.nrb0;
import p153l.o1j0;
import p153l.on2;
import p153l.ovb0;
import p153l.p9r;
import p153l.pcj;
import p153l.pf60;
import p153l.pk50;
import p153l.psd0;
import p153l.pza0;
import p153l.q1a0;
import p153l.q7m;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.qtk;
import p153l.r1j0;
import p153l.sfj0;
import p153l.t7m;
import p153l.tcj;
import p153l.th0;
import p153l.uj4;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vg60;
import p153l.vxd0;
import p153l.wx6;
import p153l.x20;
import p153l.x7c0;
import p153l.xc20;
import p153l.xfc0;
import p153l.xra;
import p153l.y20;
import p153l.yab;
import p153l.zne;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileListFragLocalEditImpl extends ProfileListBaseFrag {

    /* JADX INFO: renamed from: r1 */
    public static l4g0 f34744r1 = new l4g0("p_edit_profile_post_pic_popup", Dialog.class.getName());

    /* JADX INFO: renamed from: s1 */
    public static Field f34745s1 = Reflect.m222381on((Class<?>) Toolbar.class).field0("mMenuView");

    /* JADX INFO: renamed from: t1 */
    public static CategorySuggestions f34746t1;

    /* JADX INFO: renamed from: A */
    public VNavigationBar f34747A;

    /* JADX INFO: renamed from: B */
    public View f34748B;

    /* JADX INFO: renamed from: C */
    public TabLayout f34749C;

    /* JADX INFO: renamed from: D */
    public VFrame f34750D;

    /* JADX INFO: renamed from: E */
    public VProgressBar f34751E;

    /* JADX INFO: renamed from: E0 */
    public User f34752E0;

    /* JADX INFO: renamed from: F */
    public VFrame f34753F;

    /* JADX INFO: renamed from: F0 */
    public User f34754F0;

    /* JADX INFO: renamed from: G */
    public VProgressBar f34755G;

    /* JADX INFO: renamed from: H */
    public VLinear f34757H;

    /* JADX INFO: renamed from: H0 */
    public pf60<List<Literatures>, List<LiteraturesComments>> f34758H0;

    /* JADX INFO: renamed from: I */
    public FrameLayout f34759I;

    /* JADX INFO: renamed from: I0 */
    public ValueAnimator f34760I0;

    /* JADX INFO: renamed from: J */
    public CardView f34761J;

    /* JADX INFO: renamed from: K */
    public CardView f34763K;

    /* JADX INFO: renamed from: L */
    public CardView f34765L;

    /* JADX INFO: renamed from: L0 */
    public PicCertGuideView f34766L0;

    /* JADX INFO: renamed from: M */
    public RoundedRectangleProgressView f34767M;

    /* JADX INFO: renamed from: N */
    public RoundedRectangleProgressView f34769N;

    /* JADX INFO: renamed from: O */
    public VImage f34771O;

    /* JADX INFO: renamed from: O0 */
    public String f34772O0;

    /* JADX INFO: renamed from: P */
    public VImage f34773P;

    /* JADX INFO: renamed from: Q */
    public VText f34775Q;

    /* JADX INFO: renamed from: Q0 */
    public String f34776Q0;

    /* JADX INFO: renamed from: R */
    public VText f34777R;

    /* JADX INFO: renamed from: S */
    public ViewStub f34779S;

    /* JADX INFO: renamed from: T */
    public ViewStub f34781T;

    /* JADX INFO: renamed from: U */
    public RecyclerView f34783U;

    /* JADX INFO: renamed from: X */
    public q7m f34789X;

    /* JADX INFO: renamed from: Z */
    public LinearLayoutManager f34793Z;

    /* JADX INFO: renamed from: a1 */
    public e3i0 f34795a1;

    /* JADX INFO: renamed from: d1 */
    public int f34798d1;

    /* JADX INFO: renamed from: e1 */
    public final RecyclerView.AbstractC0584t f34799e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f34800f1;

    /* JADX INFO: renamed from: g1 */
    public final List<on2<?>> f34801g1;

    /* JADX INFO: renamed from: h1 */
    public gya0 f34802h1;

    /* JADX INFO: renamed from: i1 */
    public gne f34803i1;

    /* JADX INFO: renamed from: j1 */
    public jme f34804j1;

    /* JADX INFO: renamed from: k1 */
    public zne f34806k1;

    /* JADX INFO: renamed from: l1 */
    public ene f34807l1;

    /* JADX INFO: renamed from: m1 */
    public int f34808m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f34809n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f34810o1;

    /* JADX INFO: renamed from: p1 */
    public l4g0 f34812p1;

    /* JADX INFO: renamed from: q1 */
    public l4g0 f34813q1;

    /* JADX INFO: renamed from: z */
    public VLinear f34814z;

    /* JADX INFO: renamed from: V */
    @SuppressLint({"SV_USE_DUP_ID"})
    public vxd0 f34785V = new vxd0("show_pic_post_dialog_count_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: W */
    @SuppressLint({"SV_USE_DUP_ID"})
    public jxd0 f34787W = new jxd0("is_show_shimmer" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: Y */
    public final C22507a<User> f34791Y = C22507a.m222758b();

    /* JADX INFO: renamed from: k0 */
    public boolean f34805k0 = false;

    /* JADX INFO: renamed from: p0 */
    public boolean f34811p0 = false;

    /* JADX INFO: renamed from: G0 */
    public final C22507a<uxj0> f34756G0 = C22507a.m222758b();

    /* JADX INFO: renamed from: J0 */
    public boolean f34762J0 = false;

    /* JADX INFO: renamed from: K0 */
    public HashMap<String, String> f34764K0 = new HashMap<>();

    /* JADX INFO: renamed from: M0 */
    public jr90 f34768M0 = new jr90(this, this);

    /* JADX INFO: renamed from: N0 */
    public q1a0 f34770N0 = new q1a0();

    /* JADX INFO: renamed from: P0 */
    public String f34774P0 = "";

    /* JADX INFO: renamed from: R0 */
    public boolean f34778R0 = false;

    /* JADX INFO: renamed from: S0 */
    public boolean f34780S0 = false;

    /* JADX INFO: renamed from: T0 */
    public final ArrayList<View> f34782T0 = new ArrayList<>();

    /* JADX INFO: renamed from: U0 */
    public final ArrayList<TextView> f34784U0 = new ArrayList<>();

    /* JADX INFO: renamed from: V0 */
    public final ArrayList<View> f34786V0 = new ArrayList<>();

    /* JADX INFO: renamed from: W0 */
    public final ArrayList<View> f34788W0 = new ArrayList<>();

    /* JADX INFO: renamed from: X0 */
    public int f34790X0 = 4;

    /* JADX INFO: renamed from: Y0 */
    public boolean f34792Y0 = false;

    /* JADX INFO: renamed from: Z0 */
    public final NewNewProfileCard.InterfaceC8014d f34794Z0 = new NewNewProfileCard.InterfaceC8014d() { // from class: l.jea0
    };

    /* JADX INFO: renamed from: b1 */
    public final x20 f34796b1 = new C8888b();

    /* JADX INFO: renamed from: c1 */
    public final List<y20<q7m>> f34797c1 = new ArrayList();

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
    public class C8887a implements TabLayout.OnTabSelectedListener {
        public C8887a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            if (!ProfileListFragLocalEditImpl.this.f34792Y0 && tab.getPosition() == 0) {
                ProfileListFragLocalEditImpl.this.m53805g9();
            }
            ProfileListFragLocalEditImpl.this.f34792Y0 = false;
            ProfileListFragLocalEditImpl profileListFragLocalEditImpl = ProfileListFragLocalEditImpl.this;
            profileListFragLocalEditImpl.m53816m9(profileListFragLocalEditImpl.f34749C.getSelectedTabPosition());
            if (ProfileListFragLocalEditImpl.this.f34749C.getSelectedTabPosition() == 0 && ProfileListFragLocalEditImpl.this.f34789X != null) {
                ProfileListFragLocalEditImpl.this.f34789X.mo37932s();
            }
            if (gra.m131766w2() && tab.getPosition() == 0 && ProfileListFragLocalEditImpl.this.f34789X != null && !ProfileListFragLocalEditImpl.this.f34800f1) {
                ProfileListFragLocalEditImpl.this.m53773Q6();
            }
            if (gra.m131731p2() && tab.getPosition() == 1) {
                ProfileListFragLocalEditImpl.this.m53799e7();
            }
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$b */
    public class C8888b implements x20 {
        public C8888b() {
        }

        @Override // p153l.x20
        public void call() {
            Intent intentM51923r2 = ProfileAct.m51923r2(ProfileListFragLocalEditImpl.this.getContext(), ProfileListFragLocalEditImpl.this.m189086i2().f56859id, "preview_card", false, false, ProfileListFragLocalEditImpl.this.f34789X instanceof t7m ? ((t7m) ProfileListFragLocalEditImpl.this.f34789X).getShowPictureIndex() : -1);
            intentM51923r2.putExtra("preview_user_info", ProfileListFragLocalEditImpl.this.m189086i2());
            ProfileListFragLocalEditImpl.this.startActivity(intentM51923r2);
            ProfileListFragLocalEditImpl.this.act().overridePendingTransition(x7c0.f192710y, 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$c */
    public class C8889c extends RecyclerView.AbstractC0584t {
        public C8889c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            ProfileListFragLocalEditImpl.this.f34798d1 += i2;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$d */
    public class C8890d implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f34818a;

        public C8890d(int i) {
            this.f34818a = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            aw90.m100562F().f73713m.put(Integer.valueOf(this.f34818a));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$e */
    public class C8891e implements y20<Boolean> {
        public C8891e() {
        }

        @Override // p153l.y20
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            ProfileListFragLocalEditImpl.this.m52256N6();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$f */
    public class C8892f implements qcj<Media, Boolean> {
        public C8892f() {
        }

        @Override // p153l.qcj
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Media media) {
            return ((media instanceof Picture) && TEnum.equals(media.status, "normal") && ((Picture) media).isAiFakePic()) ? Boolean.FALSE : Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$g */
    public class C8893g implements qcj<Media, Boolean> {
        public C8893g() {
        }

        @Override // p153l.qcj
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
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.kea0
            @Override // p153l.y20
            public final void call(Object obj) {
                PerformanceLogUtil.logSingle(((C4470c) obj).f16276c);
            }
        }));
        this.f34798d1 = 0;
        this.f34799e1 = new C8889c();
        this.f34800f1 = false;
        this.f34801g1 = new ArrayList();
        this.f34808m1 = -1;
        this.f34809n1 = false;
        this.f34810o1 = false;
        creates(new y20() { // from class: l.lea0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileListFragLocalEditImpl.m53635O5((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A7 */
    public /* synthetic */ void m53603A7() {
        new jl80.C17971a(act()).m146056y0("温馨提示").m146051t0("xxx").m146034c0("更换照片", new Runnable() { // from class: l.dga0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileListFragLocalEditImpl.m53729t6();
            }
        }).m146029X("稍后再说", new Runnable() { // from class: l.fga0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileListFragLocalEditImpl.m53741y5();
            }
        }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.gga0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ProfileListFragLocalEditImpl.m53673a6(dialogInterface);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.hga0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ProfileListFragLocalEditImpl.m53706l5(dialogInterface);
            }
        }).m146049r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B7 */
    public /* synthetic */ void m53606B7() {
        if (NullChecker.m82486a(mo52252K2())) {
            DebugUtil.m59358Ak(mo52252K2(), act());
        }
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ void m53611E5() {
        try {
            ProfileListFrag.f34458I4 = CategorySuggestions.JSON_ADAPTER.parse(CoreModule.f18263b.getResources().openRawResource(xfc0.f194022a));
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: F8 */
    private void m53615F8() {
        bnl0.m105546b0(this.f34753F, new pcj() { // from class: l.rda0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return ProfileListFragLocalEditImpl.m53736w5();
            }
        });
    }

    /* JADX INFO: renamed from: G5 */
    public static /* synthetic */ void m53616G5(Throwable th) {
    }

    /* JADX INFO: renamed from: G8 */
    private C22421c<vg60<CoreMomentInfo>> m53618G8() {
        String strUserId = CoreModule.m30929H().userId();
        if (!TextUtils.equals(strUserId, CoreModule.m30929H().userId())) {
            return CoreModule.m30932N().personalMediaMomentsFeedPrevious(strUserId, false, CoreMomentInfo.JSON_ADAPTER).map(new qcj() { // from class: l.mfa0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ProfileListFragLocalEditImpl.m53676b6((pf60) obj);
                }
            });
        }
        CoreModule.m30932N().personalMediaMomentsFeedPrevious(strUserId, false, CoreMomentInfo.JSON_ADAPTER);
        return CoreModule.m30932N().mo61530di(CoreMomentInfo.JSON_ADAPTER).map(new qcj() { // from class: l.lfa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ProfileListFragLocalEditImpl.m53633N5((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J8 */
    private void m53625J8() {
        m53759I8(new C8891e());
    }

    /* JADX INFO: renamed from: K5 */
    public static /* synthetic */ void m53626K5(y20 y20Var) {
        if (y20Var != null) {
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: L8 */
    public static void m53630L8() {
        f34744r1.m152776k();
        f34744r1.m152775j();
    }

    /* JADX INFO: renamed from: M8 */
    public static void m53632M8(int i) {
        f34744r1.m152780o(pk50.m172568j().m172574f().m181657U("p_edit_profile_post_pic_popup", fph0.m126680m(jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("popup_times", Integer.valueOf(i)))));
        f34744r1.m152774i();
        f34744r1.m152777l();
    }

    /* JADX INFO: renamed from: N5 */
    public static /* synthetic */ vg60 m53633N5(List list) {
        return new vg60(list, null);
    }

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ ProfileEditInfo m53634O4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: O5 */
    public static /* synthetic */ void m53635O5(Bundle bundle) {
        if (f34746t1 == null) {
            l51.m152919y(new Runnable() { // from class: l.wga0
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListFragLocalEditImpl.m53641Q5();
                }
            });
        }
        CoreModule.f18264c.f20378d0.f128826R.m159274k().first().subscribe(psd0.m173591B());
    }

    @MainThread
    /* JADX INFO: renamed from: P6 */
    private void m53638P6() {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.AFTER_GET_USER_INFO;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        m53639P8();
        if (NullChecker.m82486a(mo52241F1(false)) && this.f34780S0) {
            User user = aw90.m100562F().f73701a;
            if (!TEnum.equals(this.f34752E0.profile.zodiac, user.profile.zodiac)) {
                user.profile.zodiac = this.f34752E0.profile.zodiac;
            }
            aw90.m100562F().f73701a = this.f34752E0.mo225055clone();
            aw90.m100562F().f73701a.description = user.description;
            aw90.m100562F().f73701a.pictures = user.pictures;
            aw90.m100562F().f73701a.profile = user.profile;
            aw90.m100562F().f73701a.voice = user.voice;
            aw90.m100562F().f73701a.name = user.name;
            aw90.m100562F().f73701a.settings.birthdate = user.settings.birthdate;
            aw90.m100562F().f73701a.settings.getSettingGroup().privacy.hideSchool = user.settings.getSettingGroup().privacy.hideSchool;
            aw90.m100562F().f73701a.profile.extensions.physical.bloodType = this.f34752E0.profile.extensions.physical.bloodType;
            aw90.m100562F().f73701a.profile.extensions.interest.emoji = this.f34752E0.profile.extensions.interest.emoji;
            aw90.m100562F().f73701a.profile.extensions.basic.idealType = this.f34752E0.profile.extensions.basic.idealType;
            aw90.m100562F().f73701a.profile.extensions.basic.ideal = this.f34752E0.profile.extensions.basic.ideal;
        } else {
            this.f34780S0 = true;
            m53783W8();
            aw90.m100562F().f73701a = this.f34752E0.mo225055clone();
        }
        m53650S8(aw90.m100562F().f73701a);
        m53645R6();
        m53649S6();
        this.f34755G.setVisibility(4);
        this.f34783U.setVisibility(0);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        if (this.f34808m1 == -1) {
            this.f34808m1 = CoreModule.f18264c.f20381e0.m116600p9().isVIP() ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: P8 */
    private void m53639P8() {
        this.f34770N0.m174851M(m53679c7(this.f34801g1));
        m53716o7();
    }

    /* JADX INFO: renamed from: Q5 */
    public static /* synthetic */ void m53641Q5() {
        try {
            f34746t1 = CategorySuggestions.JSON_ADAPTER.parse(CoreModule.f18263b.getResources().openRawResource(xfc0.f194022a));
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: Q8 */
    private void m53642Q8(List<Media> list) {
        m53646R8(list, false);
    }

    /* JADX INFO: renamed from: R6 */
    private void m53645R6() {
        if ((!TextUtils.equals(this.f34776Q0, CoreStaticData.ProfileFromType.FROM_CARD_UPLOAD_PHOTO) && !TextUtils.equals(this.f34776Q0, CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO) && !TextUtils.equals(this.f34776Q0, CoreStaticData.ProfileFromType.FROM_THIN_POPUP)) || this.f34805k0) {
            if (this.f34805k0) {
                return;
            }
            this.f34805k0 = m53781W6();
            return;
        }
        byte b = 1;
        this.f34805k0 = true;
        if (!gra.m131756u2()) {
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD;
            if (jyb.m147479J(LoopFragmentFactory.m52688z(loopCreateEntryType, null, aw90.m100562F().f73701a))) {
                return;
            }
            LoopFragmentFactory.m52660U(aw90.m100562F().f73701a, this, null, loopCreateEntryType, this.f34776Q0);
            return;
        }
        LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType2 = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD;
        if (jyb.m147479J(LoopFragmentFactory.m52641B(loopCreateEntryType2, null, aw90.m100562F().f73701a, true, true, this.f34776Q0))) {
            return;
        }
        String str = this.f34776Q0;
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
        LoopFragmentFactory.m52660U(aw90.m100562F().f73701a, this, null, loopCreateEntryType2, this.f34776Q0);
    }

    /* JADX INFO: renamed from: R8 */
    private void m53646R8(final List<Media> list, final boolean z) {
        if (xra.m212782a()) {
            this.f34804j1.mo168208a(new x20() { // from class: l.uda0
                @Override // p153l.x20
                public final void call() {
                    this.f178512a.m53817n8(list, z);
                }
            });
        } else {
            this.f34803i1.mo168208a(new x20() { // from class: l.vda0
                @Override // p153l.x20
                public final void call() {
                    this.f183550a.m53821p8(z, list);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S4 */
    public static /* synthetic */ void m53647S4(Throwable th) {
    }

    /* JADX INFO: renamed from: S6 */
    private void m53649S6() {
        if (!TextUtils.equals(this.f34764K0.get("action"), SocialOperation.GAME_SIGNATURE) || this.f34805k0) {
            return;
        }
        this.f34805k0 = true;
        LoopFragmentFactory.m52658S(m189086i2(), mo52249J1(), LoopInputType.SIGNATURE);
    }

    /* JADX INFO: renamed from: S8 */
    private void m53650S8(User user) {
        m53654T8(user, false);
    }

    /* JADX INFO: renamed from: T6 */
    private boolean m53653T6() {
        if (gra.m131745s1()) {
            List<Media> list = aw90.m100562F().f73701a.pictures;
            if (!jyb.m147479J(list)) {
                Media media = list.get(0);
                if (media instanceof Picture) {
                    return ((Picture) media).isAiFakePic();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: T8 */
    private void m53654T8(User user, boolean z) {
        m53639P8();
        m53646R8(user.pictures, z);
    }

    /* JADX INFO: renamed from: U5 */
    public static /* synthetic */ void m53656U5(int i, q7m q7mVar) {
        if (i == 1) {
            q7mVar.mo37820G();
        } else {
            q7mVar.mo37932s();
        }
    }

    /* JADX INFO: renamed from: U6 */
    private boolean m53657U6() {
        if (gra.m131570G2() || gra.m131575H2()) {
            List<Media> list = aw90.m100562F().f73701a.pictures;
            if (!jyb.m147479J(list)) {
                Media media = list.get(0);
                if (media instanceof Picture) {
                    return ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_NET_MAIN_PICTURE));
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: U8 */
    private void m53658U8(User user) {
        aw90.m100562F().f73701a = user;
        m53638P6();
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ void m53659V4(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: V6 */
    private boolean m53661V6() {
        if (gra.m131570G2() || gra.m131575H2()) {
            List<Media> list = aw90.m100562F().f73701a.pictures;
            if (!jyb.m147479J(list)) {
                Media media = list.get(0);
                if (media instanceof Picture) {
                    return ((Picture) media).isLabelJudge(MediaLabel.get(MediaLabel.WITH_REPEAT_MAIN_PICTURE));
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: W4 */
    public static /* synthetic */ void m53662W4(q7m q7mVar, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) q7mVar.getCardView().getLayoutParams();
        int i = qa00.f156326m;
        marginLayoutParams.topMargin = i;
        int i2 = qa00.f156321h;
        marginLayoutParams.rightMargin = i2;
        marginLayoutParams.leftMargin = i2;
        marginLayoutParams.bottomMargin = i;
        q7mVar.getCardView().requestLayout();
    }

    /* JADX INFO: renamed from: Z6 */
    private User m53670Z6() {
        User userMo225055clone = this.f34752E0.mo225055clone();
        if (this.f34802h1.m132952V()) {
            userMo225055clone.profile.extensions.momentSwitch.noSyncMoment.clear();
            userMo225055clone.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f34802h1.m132951U() ? "false" : "true");
        }
        return userMo225055clone.subtract(this.f34752E0);
    }

    /* JADX INFO: renamed from: Z8 */
    private void m53671Z8(User user) {
        this.f34754F0 = user;
    }

    /* JADX INFO: renamed from: a6 */
    public static /* synthetic */ void m53673a6(DialogInterface dialogInterface) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: a7 */
    private void m53674a7() {
        this.f34783U.setFocusableInTouchMode(true);
        this.f34783U.setDescendantFocusability(131072);
        this.f34783U.setFocusable(true);
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m53675b5(Throwable th) {
    }

    /* JADX INFO: renamed from: b6 */
    public static /* synthetic */ vg60 m53676b6(pf60 pf60Var) {
        return new vg60((List) pf60Var.f152157b, null);
    }

    /* JADX INFO: renamed from: c7 */
    private List<on2<?>> m53679c7(List<on2<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (on2<?> on2Var : list) {
            if (on2Var.mo53912l()) {
                arrayList.add(on2Var);
                if (on2Var.mo53568k()) {
                    jr90 jr90Var = new jr90(this, this);
                    if (on2Var.mo130650d() != 0) {
                        jr90Var.m168324v(on2Var.mo130650d());
                    }
                    arrayList.add(jr90Var);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c9 */
    private void m53680c9(User user) {
        User userRiskAuditUser;
        if (user == null) {
            userRiskAuditUser = null;
        } else {
            userRiskAuditUser = user.riskAuditUser(CoreModule.m30930K().getUserById("fake_risk_audit_default_" + this.f34772O0));
        }
        this.f34752E0 = userRiskAuditUser;
    }

    /* JADX INFO: renamed from: d7 */
    private List<Media> m53683d7() {
        if (xra.m212782a()) {
            return this.f34804j1.m146154T();
        }
        ArrayList arrayList = new ArrayList();
        MediaReorderCards mediaReorderCards = this.f34803i1.f105078v;
        if (NullChecker.m82486a(mediaReorderCards)) {
            for (int i = 0; i < mediaReorderCards.getChildCount(); i++) {
                if (mediaReorderCards.m51994h(i).getAddPhotos().size() > 0) {
                    arrayList.addAll(mediaReorderCards.m51994h(i).getAddPhotos());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e9 */
    private void m53686e9(final boolean z) {
        if (this.f34812p1 == null) {
            this.f34812p1 = new l4g0("p_lowqualityphoto_save_popup", Dialog.class.getName());
        }
        new th0.C20312a(act()).m191160s("检测到不符合要求的照片").m191148g(false).m191151j("若继续保存，不符合要求的照片(重复图、网图、五官不清晰或有遮挡的照片等）将被删除").m191159r("保存其他资料").m191156o(new View.OnClickListener() { // from class: l.cea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f81319a.m53828v8(view);
            }
        }).m191147f(z ? "不保存" : "继续编辑").m191144c(new View.OnClickListener() { // from class: l.dea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87993a.m53829w8(z, view);
            }
        }).m191155n(new DialogInterface.OnShowListener() { // from class: l.eea0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f93628a.m53825t8(dialogInterface);
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.fea0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f98649a.m53827u8(dialogInterface);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: g7 */
    public static void m53691g7(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.m82486a(userInfo.myTabTask) || TextUtils.isEmpty(userInfo.myTabTask.title)) {
            return;
        }
        MyTabTask myTabTask = userInfo.myTabTask;
        if (TextUtils.equals(myTabTask.type, ProfileLikeType.mbti)) {
            User user = aw90.m100562F().f73701a;
            if (NullChecker.m82486a(user) && aw90.m100564Q(user)) {
                userInfo.myTabTask = null;
                return;
            }
            return;
        }
        if (TextUtils.equals(myTabTask.type, "game")) {
            User user2 = aw90.m100562F().f73701a;
            if (!NullChecker.m82486a(user2) || !NullChecker.m82486a(user2.profile) || !NullChecker.m82486a(user2.profile.extensions) || !NullChecker.m82486a(user2.profile.extensions.game) || jyb.m147479J(user2.profile.extensions.game.name) || jyb.m147479J(user2.profile.extensions.game.together) || TextUtils.isEmpty(user2.profile.extensions.game.name.get(0)) || TextUtils.isEmpty(user2.profile.extensions.game.together.get(0))) {
                return;
            }
            userInfo.myTabTask = null;
        }
    }

    /* JADX INFO: renamed from: h7 */
    private void m53694h7(String str) {
        str.getClass();
        switch (str) {
            case "school":
                LoopFragmentFactory.m52658S(m189086i2(), mo52249J1(), LoopInputType.SCHOOL);
                break;
            case "photo":
                LoopFragmentFactory.m52658S(m189086i2(), mo52249J1(), LoopInputType.PHOTO);
                break;
            case "industry":
                LoopFragmentFactory.m52658S(m189086i2(), mo52249J1(), LoopInputType.INDUSTRY);
                break;
            case "company":
                LoopFragmentFactory.m52658S(m189086i2(), mo52249J1(), LoopInputType.COMPANY);
                break;
            case "about_me":
                LoopFragmentFactory.m52658S(m189086i2(), mo52249J1(), LoopInputType.ABOUT_ME);
                break;
        }
    }

    /* JADX INFO: renamed from: h9 */
    private void m53695h9(final boolean z) {
        if (this.f34813q1 == null) {
            this.f34813q1 = new l4g0("p_lowqualityphoto_save_popup", Dialog.class.getName());
        }
        new th0.C20312a(act()).m191160s("检测到不符合要求的照片").m191148g(false).m191151j("若继续保存，不符合要求的照片(重复图、网图、五官不清晰的照片等）将被删除").m191159r("保存其他资料").m191156o(new View.OnClickListener() { // from class: l.xda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193519a.m53833y8(view);
            }
        }).m191147f(z ? "不保存" : "继续编辑").m191144c(new View.OnClickListener() { // from class: l.yda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198586a.m53834z8(z, view);
            }
        }).m191155n(new DialogInterface.OnShowListener() { // from class: l.zda0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f203865a.m53746A8(dialogInterface);
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.aea0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f70779a.m53747B8(dialogInterface);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: i7 */
    private void m53698i7(User user) {
        User user2;
        if (user == null || (user2 = this.f34752E0) == null) {
            return;
        }
        user.profile.moments = user2.profile.moments;
    }

    /* JADX INFO: renamed from: i9 */
    private void m53699i9() {
        new th0.C20312a(act()).m191160s(act().getString(R$string.f19129bl)).m191148g(false).m191151j(act().getString(R$string.f19067Zk)).m191159r(act().getString(R$string.f19098al)).m191156o(new View.OnClickListener() { // from class: l.mea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f136453a.m53749C8(view);
            }
        }).m191147f(act().getString(R$string.f19037Yk)).m191144c(new View.OnClickListener() { // from class: l.xea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193743a.m53751D8(view);
            }
        }).m191142a().m191141g();
    }

    private void initState() {
        if (gra.m131731p2()) {
            User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
            if (!NullChecker.m82486a(userM116600p9) || (!TextUtils.isEmpty(userM116600p9.description) && userM116600p9.pictures.size() >= 3)) {
                CoreModule.f18264c.f20381e0.f89173Y6 = false;
                return;
            }
            dkb dkbVar = CoreModule.f18264c.f20381e0;
            dkbVar.f89173Y6 = true;
            dkbVar.f89181Z6 = false;
            dkbVar.f89189a7 = false;
        }
    }

    /* JADX INFO: renamed from: j9 */
    private void m53702j9(int i) {
        if (i > 0) {
            m53803f9(i);
        } else {
            m53625J8();
        }
    }

    /* JADX INFO: renamed from: k6 */
    public static /* synthetic */ void m53704k6(Throwable th) {
    }

    /* JADX INFO: renamed from: k7 */
    private void m53705k7() {
        if (TextUtils.equals(this.f34776Q0, "from_auto_scroll_to_question") || TextUtils.equals(this.f34776Q0, "p_tantanx_card")) {
            l51.m152889I(this, new Runnable() { // from class: l.bea0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f76355a.m53755G7();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m53706l5(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: l9 */
    private void m53708l9(int i, String str, MediaReorderCards mediaReorderCards) {
        if (i == mediaReorderCards.getChildCount()) {
            mediaReorderCards.m51994h(mediaReorderCards.getChildCount() - 1).m51855S1(null);
            return;
        }
        mediaReorderCards.m51994h(i).m51855S1(str);
        if (i < mediaReorderCards.getChildCount() - 1) {
            mediaReorderCards.m51994h(i + 1).m51855S1(null);
        }
        if (i > 0) {
            mediaReorderCards.m51994h(i - 1).m51855S1(null);
        }
    }

    /* JADX INFO: renamed from: n7 */
    private void m53713n7() {
        moe moeVar = new moe(this, this);
        this.f34801g1.addAll(moeVar.m188629c());
        this.f34802h1 = (gya0) moeVar.m188630d(gya0.class);
        if (xra.m212782a()) {
            this.f34804j1 = (jme) moeVar.m188630d(jme.class);
        } else {
            this.f34803i1 = (gne) moeVar.m188630d(gne.class);
        }
        this.f34806k1 = (zne) moeVar.m188630d(zne.class);
        this.f34807l1 = (ene) moeVar.m188630d(ene.class);
    }

    /* JADX INFO: renamed from: o5 */
    public static /* synthetic */ ovb0 m53714o5(User user, User user2, vg60 vg60Var, MyTabTask myTabTask) {
        return new ovb0(user, user2, vg60Var, myTabTask);
    }

    /* JADX INFO: renamed from: o6 */
    public static /* synthetic */ void m53715o6(Throwable th) {
    }

    /* JADX INFO: renamed from: o7 */
    private void m53716o7() {
        if (CoreModule.f18264c.f20381e0.m116593na().status.contains(UserStatus.get(UserStatus.audit)) || CertificationUtil.m59336l() || !nrb0.m164466b()) {
            PicCertGuideView picCertGuideView = this.f34766L0;
            if (picCertGuideView != null) {
                bnl0.m105524M(picCertGuideView, false);
                return;
            }
            return;
        }
        if (bnl0.m105529O0(this.f34781T)) {
            return;
        }
        if (this.f34766L0 == null) {
            PicCertGuideView picCertGuideView2 = (PicCertGuideView) this.f34779S.inflate();
            this.f34766L0 = picCertGuideView2;
            picCertGuideView2.m44922k0(act(), "完成头像认证，你的卡片将被优先推荐", "去认证", "e_edit_profile_view_edit_verification", "p_edit_profile_view", null, null);
            if (this.f34749C.getSelectedTabPosition() == 0) {
                this.f34766L0.m44923l0();
            }
            duringCreated(CoreModule.f18264c.f20294B0.m32614j4().filter(new qcj() { // from class: l.sda0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    VerificationCenter verificationCenter = (VerificationCenter) obj;
                    return Boolean.valueOf(NullChecker.m82486a(verificationCenter) && NullChecker.m82486a(verificationCenter.picVerificationInfo));
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.tda0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f173320a.m53765M7((VerificationCenter) obj);
                }
            }));
        }
        bnl0.m105524M(this.f34766L0, true);
        bnl0.m105524M(this.f34761J, false);
        bnl0.m105524M(this.f34763K, false);
        bnl0.m105524M(this.f34765L, false);
        bnl0.m105524M(this.f34759I, true);
    }

    /* JADX INFO: renamed from: q7 */
    private void m53721q7() {
        this.f34793Z = new SmoothScrollLinearLayoutManager(getContext());
        this.f34783U.setItemAnimator(null);
        this.f34783U.setLayoutManager(this.f34793Z);
        this.f34783U.setAdapter(this.f34770N0);
        this.f34783U.addOnScrollListener(this.f34799e1);
    }

    /* JADX INFO: renamed from: r7 */
    private void m53724r7() {
        ml70.m158856b().m158859e(Boolean.FALSE);
        bnl0.m105524M(this.f34747A, true);
        View viewInflate = act().inflater().inflate(kec0.f125458I9, (ViewGroup) null);
        VButton vButton = (VButton) viewInflate.findViewById(adc0.f70484o4);
        bnl0.m105539W(vButton, qa00.f156318e);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.gea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103776a.m53776S7(view);
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.hea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109070a.m53777T7(view);
            }
        };
        bnl0.m105509E0(vButton, onClickListener);
        this.f34747A.setLeftIconOnClick(onClickListener2);
        this.f34747A.m224835z(viewInflate);
        this.f34747A.setLeftIconOnClick(new View.OnClickListener() { // from class: l.iea0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114563a.m53778U7(view);
            }
        });
    }

    /* JADX INFO: renamed from: s5 */
    public static /* synthetic */ void m53725s5(Throwable th) {
    }

    /* JADX INFO: renamed from: s7 */
    private void m53727s7() {
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.wda0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188536a.m53779V7((User) obj);
            }
        }));
        if (!gra.m131649Y1() || TextUtils.equals(this.f34776Q0, "from_ideal_type_mine_tab_guide") || TextUtils.equals(this.f34776Q0, "from_ideal_type_profile_item")) {
            return;
        }
        TextUtils.equals(this.f34776Q0, "from_ideal_type_other_profile");
    }

    /* JADX INFO: renamed from: t6 */
    public static /* synthetic */ void m53729t6() {
    }

    /* JADX INFO: renamed from: t7 */
    private void m53730t7() {
        if (CoreModule.f18264c.f20381e0.m116571i8() && !CoreModule.f18264c.f20381e0.m116600p9().isAudit()) {
            duringCreated(CoreModule.f18264c.f20381e0.m116633xa().filter(new qcj() { // from class: l.rga0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    FakeGuideData fakeGuideData = (FakeGuideData) obj;
                    return Boolean.valueOf(NullChecker.m82486a(fakeGuideData) && fakeGuideData.changeAvatar && "mainAvatar".equals(fakeGuideData.type));
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.sga0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f167841a.m53782W7((FakeGuideData) obj);
                }
            }, new y20() { // from class: l.tga0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ProfileListFragLocalEditImpl.m53675b5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v7 */
    private void m53735v7() {
        m53674a7();
        this.f34783U.setBackgroundColor(Color.parseColor("#ffffff"));
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ Boolean m53736w5() {
        PerformanceLogUtil.logEnd(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        PerformanceLogUtil.instance().endTrance();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: w7 */
    private boolean m53738w7() {
        if (xra.m212782a()) {
            return this.f34804j1.m146155U();
        }
        MediaReorderCards mediaReorderCards = this.f34803i1.f105078v;
        if (NullChecker.m82486a(mediaReorderCards)) {
            for (int i = 0; i < mediaReorderCards.getChildCount(); i++) {
                if (mediaReorderCards.m51994h(i).m51838K0()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y5 */
    public static /* synthetic */ void m53741y5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z7 */
    public /* synthetic */ void m53745z7() {
        m21580b4().m21503F(this.f34772O0).m21567z0();
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ void m53746A8(DialogInterface dialogInterface) {
        this.f34813q1.m152774i();
        this.f34813q1.m152777l();
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ void m53747B8(DialogInterface dialogInterface) {
        this.f34813q1.m152776k();
        this.f34813q1.m152775j();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: C2 */
    public CategorySuggestions mo52233C2() {
        return f34746t1;
    }

    /* JADX INFO: renamed from: C7 */
    public final /* synthetic */ void m53748C7(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("右滑无配对引导")) {
            DatingGuideData datingGuideDataNew_ = DatingGuideData.new_();
            datingGuideDataNew_.titles.add(String.format(Locale.getDefault(), "刚刚看过的%d个%s更想了解你的兴趣爱好", Integer.valueOf(CoreModule.f18264c.f20405m0.f20208y0), CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "男生" : "女生"));
            datingGuideDataNew_.subTitles.add("添加生活照展示你的兴趣爱好，更容易配对");
            datingGuideDataNew_.button = "立即添加";
            datingGuideDataNew_.pageId = "p_add_lifestyle_guidance";
            datingGuideDataNew_.deeplink = "tantan://profile/edit?mode=guidePicAndTag&from=right_swipe_add_lifestyle";
            datingGuideDataNew_.pictures.add(CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "https://auto.tancdn.com/v1/raw/8da6f26f-c9b6-440e-9bbc-57f1a124a66f14.webp" : "https://auto.tancdn.com/v1/raw/484a6490-eca3-4af1-bf18-0b43971e70c114.webp");
            datingGuideDataNew_.buttonId = "e_add_lifestyle";
            new b9c.C15951b(act()).m103090c(datingGuideDataNew_).m103089b("right_swipe_no_match").m103088a().show();
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
            datingGuideDataNew_5.pageId = "p_add_lifestyle_guidance";
            datingGuideDataNew_5.deeplink = "tantan://profile/edit?mode=guidePicAndTag&from=right_swipe_add_lifestyle";
            datingGuideDataNew_5.pictures.add("https://auto.tancdn.com/v1/raw/c9488f16-cae9-48fa-9558-4e8e5f0552dd14.webp");
            new b9c.C15951b(act()).m103090c(datingGuideDataNew_5).m103088a().show();
        }
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ void m53749C8(View view) {
        m53625J8();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: D2 */
    public boolean mo52236D2() {
        return true;
    }

    /* JADX INFO: renamed from: D7 */
    public final /* synthetic */ void m53750D7() {
        m21580b4().m21535f0(new String[]{"右滑无配对引导", "连续左滑引导", "老用户引导给照片加标签", "老用户引导给旧标签配图", "收到喜欢很少引导上传生活照"}).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.kga0
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f126593a.m53748C7(dialog, view, i, charSequence);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: D8 */
    public final /* synthetic */ void m53751D8(View view) {
        m52256N6();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: E */
    public void mo52239E() {
    }

    /* JADX INFO: renamed from: E7 */
    public final /* synthetic */ void m53752E7(PicCertGuideView picCertGuideView, VerificationCenter verificationCenter) {
        if (TEnum.equals(verificationCenter.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenter.picVerificationInfo.status, "pending")) {
            if (NullChecker.m82486a(picCertGuideView)) {
                bnl0.m105524M(picCertGuideView, false);
            }
            mo52239E();
        }
    }

    /* JADX INFO: renamed from: E8 */
    public final /* synthetic */ void m53753E8(int i, Media media) {
        VReorderCard vReorderCardM53793b7 = m53793b7(i);
        if (vReorderCardM53793b7 instanceof MediaReorderCard) {
            MediaReorderCard mediaReorderCard = (MediaReorderCard) vReorderCardM53793b7;
            if (media instanceof Video) {
                mediaReorderCard.m51897z1((Video) media);
            } else {
                mediaReorderCard.m51891w1((Picture) media);
            }
            mo52275Z2();
            if (gra.m131756u2()) {
                for (int i2 = 0; i2 < this.f34803i1.f105078v.getChildCount(); i2++) {
                    mediaReorderCard.m51827E1(i2, "p_edit_profile_view");
                }
            }
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: F1 */
    public User mo52241F1(boolean z) {
        if (!NullChecker.m82486a(aw90.m100562F().f73701a)) {
            if (z) {
                CrashHelper.m82479c(new NullPointerException("ProfileListFrag editingUser is null when refresh"));
            }
            aw90.m100562F().f73701a = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
        }
        return aw90.m100562F().f73701a;
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ void m53754F7(View view, PicCertGuideView picCertGuideView, User user) {
        if (user.status.contains(UserStatus.get(UserStatus.audit))) {
            bnl0.m105524M(view, true);
            bnl0.m105524M(picCertGuideView, false);
        } else if (!nrb0.m164466b() || CertificationUtil.m59336l()) {
            bnl0.m105524M(view, false);
            bnl0.m105524M(picCertGuideView, false);
        } else {
            picCertGuideView.m44922k0(act(), "完成头像认证，你的卡片将被优先推荐", "去认证", "e_edit_profile_view_preview_verification", "p_edit_profile_view", null, null);
            bnl0.m105524M(view, false);
            bnl0.m105524M(picCertGuideView, true);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: G */
    public void mo52243G(View... viewArr) {
        for (View view : viewArr) {
            bnl0.m105509E0(view, m53588N4(this.f34752E0));
        }
    }

    /* JADX INFO: renamed from: G7 */
    public final /* synthetic */ void m53755G7() {
        int iM174846H;
        if (this.f34770N0 == null) {
            return;
        }
        if (TextUtils.equals(this.f34776Q0, "from_auto_scroll_to_question")) {
            iM174846H = this.f34770N0.m174849K();
        } else {
            iM174846H = TextUtils.equals(this.f34776Q0, "p_tantanx_card") ? this.f34770N0.m174846H() : -1;
        }
        if (iM174846H < 0 || iM174846H >= this.f34770N0.getPageCount()) {
            return;
        }
        this.f34783U.scrollToPosition(iM174846H);
        if (NullChecker.m82486a(this.f34793Z)) {
            this.f34793Z.scrollToPositionWithOffset(iM174846H, 0);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: H3 */
    public pf60<List<Literatures>, List<LiteraturesComments>> mo52245H3() {
        return this.f34758H0;
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ void m53756H7(Boolean bool) {
        eu4.m122523b().m122532j(bool.booleanValue());
        mo52306o();
    }

    /* JADX INFO: renamed from: H8 */
    public void m53757H8(final List<Media> list, int i) {
        if (i == 15) {
            this.f34807l1.m168312b(new x20() { // from class: l.jha0
                @Override // p153l.x20
                public final void call() {
                    this.f120829a.m53806h8(list);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I7 */
    public final /* synthetic */ void m53758I7(uxj0 uxj0Var) {
        m53638P6();
    }

    /* JADX INFO: renamed from: I8 */
    public final void m53759I8(final y20<Boolean> y20Var) {
        if (this.f34802h1.m132952V()) {
            aw90.m100562F().f73701a.profile.extensions.momentSwitch.noSyncMoment.clear();
            aw90.m100562F().f73701a.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f34802h1.m132951U() ? "false" : "true");
        }
        if (jyb.m147479J(aw90.m100562F().f73701a.pictures)) {
            m21580b4().m21503F("你的个人资料页需要至少一张照片").m21555t0(R$string.f18776Q, new Runnable() { // from class: l.lga0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f131947a.m52256N6();
                }
            }).m21540k0(R$string.f19138c).m21567z0();
            return;
        }
        final User userM53787Y6 = m53787Y6();
        User userM53670Z6 = m53670Z6();
        boolean z = true;
        if (NullChecker.m82486a(userM53787Y6) && NullChecker.m82486a(userM53670Z6) && userM53787Y6.equals(userM53670Z6)) {
            this.f34810o1 = true;
        }
        final User userMo225055clone = aw90.m100562F().f73701a.mo225055clone();
        final User userMo225055clone2 = this.f34752E0.mo225055clone();
        ArrayList<String> arrayList = new ArrayList();
        if (NullChecker.m82486a(userM53787Y6) && NullChecker.m82486a(userM53787Y6.profile) && NullChecker.m82486a(userM53787Y6.profile.extensions) && NullChecker.m82486a(userM53787Y6.profile.extensions.basic) && !TextUtils.isEmpty(userM53787Y6.description)) {
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
        sfj0.m185596c("e_profile_save_button", pageId(), sfj0.C20032a.m185615h("edit_profile_content_modified", sb.toString()));
        if (!NullChecker.m82486a(userM53787Y6)) {
            if (y20Var != null) {
                y20Var.call(Boolean.FALSE);
                return;
            }
            return;
        }
        m21594o4(R$string.f18632L5);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userMo225055clone;
        if (NullChecker.m82486a(userM53787Y6.profile) && NullChecker.m82486a(userM53787Y6.profile.extensions)) {
            userM53787Y6.profile.extensions.voiceSignature = null;
        }
        final boolean zEquals = (gra.m131676e2() && NullChecker.m82486a(userM53787Y6) && NullChecker.m82486a(userM53787Y6.profile) && NullChecker.m82486a(userM53787Y6.profile.extensions) && NullChecker.m82486a(userM53787Y6.profile.extensions.basic) && !jyb.m147479J(userM53787Y6.profile.extensions.basic.friendPurpose)) ? TEnum.equals(userM53787Y6.profile.extensions.basic.friendPurpose.get(0), "marriage") : false;
        duringCreated((C22421c) CoreModule.f18264c.f20294B0.m32624t4(profileEditInfoNew_).onErrorReturn(new qcj() { // from class: l.mga0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ProfileListFragLocalEditImpl.m53634O4((Throwable) obj);
            }
        }).flatMap(new qcj() { // from class: l.nga0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f141803a.m53807i8(userM53787Y6, (ProfileEditInfo) obj);
            }
        })).subscribe(psd0.m173600K(new y20() { // from class: l.oga0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147201a.m53809j8(zEquals, userMo225055clone, userMo225055clone2, y20Var, userM53787Y6, (uxj0) obj);
            }
        }, new y20() { // from class: l.qga0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157394a.m53810k8(userMo225055clone2, userM53787Y6, y20Var, (Throwable) obj);
            }
        }, false));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: J1 */
    public PutongFrag mo52249J1() {
        return this;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: J3 */
    public void mo52250J3() {
        if (this.f34754F0 == null || this.f34752E0 == null) {
            return;
        }
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "reRenderPage!!!");
        this.f34756G0.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: J7 */
    public final /* synthetic */ void m53760J7(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && this.f34752E0 == null) {
            this.f34783U.setVisibility(4);
            this.f34755G.setVisibility(0);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.s7m
    /* JADX INFO: renamed from: K2 */
    public User mo52252K2() {
        if (this.f34752E0 == null && !mo53313N2()) {
            m53680c9(CoreModule.m30930K().getUserById(this.f34772O0));
        }
        return this.f34752E0;
    }

    /* JADX INFO: renamed from: K7 */
    public final /* synthetic */ Boolean m53761K7() {
        if (this.f34778R0) {
            ((ProfileAct) act()).m51948Z2(0);
            this.f34778R0 = false;
        }
        if (!TextUtils.isEmpty(this.f34774P0)) {
            m53694h7(this.f34774P0);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: K8 */
    public void m53762K8() {
        if (isDetached()) {
            act().m68056e2();
            return;
        }
        int iM53771O8 = m53771O8();
        if (m53653T6()) {
            m53686e9(true);
            return;
        }
        if (m53661V6()) {
            m53695h9(true);
            return;
        }
        if (m53657U6()) {
            m53695h9(true);
            return;
        }
        if (iM53771O8 > 0) {
            m53803f9(iM53771O8);
        } else if (NullChecker.m82486a(m53787Y6())) {
            m53699i9();
        } else {
            m52256N6();
        }
    }

    /* JADX INFO: renamed from: L7 */
    public final /* synthetic */ void m53763L7(Bundle bundle) {
        act().setTitle(m21603x4(R$string.f18826Rj));
        if (CoreModule.m30930K().me_().isBanned()) {
            JailedDialogLikeAct.m45369p2(true);
        }
        CoreModule.f18264c.f20381e0.f89336u0.put(Boolean.FALSE);
        if (NullChecker.m82486a(bundle)) {
            m53680c9(CoreModule.m30930K().me_());
            if (NullChecker.m82486a(m189086i2())) {
                m53650S8(aw90.m100562F().f73701a);
                mo52250J3();
            }
        }
        bnl0.m105546b0(act().findViewById(R.id.content), new pcj() { // from class: l.kfa0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f126261a.m53761K7();
            }
        });
    }

    /* JADX INFO: renamed from: M6 */
    public View m53764M6(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kha0.m149789b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M7 */
    public final /* synthetic */ void m53765M7(VerificationCenter verificationCenter) {
        if (TEnum.equals(verificationCenter.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenter.picVerificationInfo.status, "pending")) {
            if (NullChecker.m82486a(this.f34766L0)) {
                bnl0.m105524M(this.f34766L0, false);
            }
            m53814m7();
        }
    }

    /* JADX INFO: renamed from: N6 */
    public void m53766N6(y20<q7m> y20Var) {
        q7m q7mVar = this.f34789X;
        if (q7mVar == null) {
            this.f34797c1.add(y20Var);
        } else {
            y20Var.call(q7mVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ void m53767N7(View view, int i, ViewGroup viewGroup) {
        this.f34789X = (q7m) view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (NullChecker.m82486a(getContext())) {
            this.f34750D.addView(m53801f7(view), layoutParams);
        }
        if (view instanceof UserProfileExpandedCard) {
            UserProfileExpandedCard userProfileExpandedCard = (UserProfileExpandedCard) this.f34789X;
            int i2 = qa00.f156321h;
            userProfileExpandedCard.m39023b1(i2, qa00.f156326m, i2, qa00.m175859d(68.0f));
        } else if (view instanceof t7m) {
            m53786X8();
            ((t7m) this.f34789X).mo37853S(this.f34796b1);
        }
        Iterator<y20<q7m>> it = this.f34797c1.iterator();
        while (it.hasNext()) {
            it.next().call(this.f34789X);
        }
        this.f34797c1.clear();
    }

    /* JADX INFO: renamed from: N8 */
    public final void m53768N8(final int i) {
        int i2 = this.f34790X0;
        if (i2 < 3) {
            this.f34790X0 = i2 + 1;
        } else {
            sfj0.m185596c("e_edit_profile_tab", "p_edit_profile_view", sfj0.C20032a.m185615h("edit_profile_tab", i == 0 ? SchemeKey.edit : i == 1 ? "preview" : "example"));
        }
        if (this.f34784U0.size() != 0) {
            if (i != 0 && NullChecker.m82486a(aw90.m100562F().f73701a)) {
                mo52275Z2();
            }
            if (i != 0) {
                act().hideInput();
            }
            m53766N6(new y20() { // from class: l.cga0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ProfileListFragLocalEditImpl.m53656U5(i, (q7m) obj);
                }
            });
            if (i == 2 && CoreModule.f18264c.f20381e0.f89199c1.get().booleanValue()) {
                CoreModule.f18264c.f20381e0.f89199c1.put(Boolean.FALSE);
                this.f34788W0.get(2).setVisibility(8);
            }
            if (i == 1) {
                mo52239E();
                m53786X8();
            } else if (i == 0 && NullChecker.m82486a(this.f34752E0)) {
                mo52239E();
                m53658U8(aw90.m100562F().f73701a);
            }
            for (int i3 = 0; i3 < this.f34784U0.size(); i3++) {
                ArrayList<TextView> arrayList = this.f34784U0;
                if (i3 == i) {
                    arrayList.get(i3).setTextColor(act().color(c9c0.f80342I));
                    bnl0.m105525M0(this.f34786V0.get(i3), true);
                } else {
                    arrayList.get(i3).setTextColor(act().color(c9c0.f80431k0));
                    bnl0.m105525M0(this.f34786V0.get(i3), false);
                }
            }
            m53780V8(i);
        }
    }

    /* JADX INFO: renamed from: O6 */
    public final void m53769O6(int i, boolean z, String str, boolean z2) {
        View viewM112692a = cum.m112692a(act(), kec0.f125635Ta, null);
        TextView textView = (TextView) viewM112692a.findViewById(adc0.f69886Ed);
        textView.setText(str);
        View viewFindViewById = viewM112692a.findViewById(adc0.f69920Gd);
        bnl0.m105525M0(viewM112692a.findViewById(adc0.f69884Eb), z2);
        this.f34784U0.add(textView);
        this.f34786V0.add(viewFindViewById);
        this.f34788W0.add(viewM112692a.findViewById(adc0.f70348g3));
        this.f34749C.setClipChildren(false);
        TabLayout tabLayout = this.f34749C;
        tabLayout.addTab(tabLayout.newTab().setCustomView(viewM112692a), i, z);
    }

    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ void m53770O7() {
        this.f34802h1.m132955Z(true);
        mo52306o();
        sfj0.m185596c("e_edit_profile_post_pic_popup_confirm", "p_edit_profile_post_pic_popup", new sfj0.C20032a[0]);
        m53630L8();
    }

    /* JADX INFO: renamed from: O8 */
    public int m53771O8() {
        int i = 0;
        if (xra.m212782a()) {
            AvatarCards avatarCards = this.f34804j1.f121666u;
            if (!NullChecker.m82486a(avatarCards)) {
                return 0;
            }
            int i2 = 0;
            while (i < avatarCards.getChildCount() && !avatarCards.m51994h(i).m51977n()) {
                if (!TEnum.equals(avatarCards.m51994h(i).getMedia().status, "normal")) {
                    i2++;
                }
                i++;
            }
            return i2;
        }
        MediaReorderCards mediaReorderCards = this.f34803i1.f105078v;
        if (!NullChecker.m82486a(mediaReorderCards)) {
            return 0;
        }
        int i3 = 0;
        while (i < mediaReorderCards.getChildCount() && !mediaReorderCards.m51994h(i).m51977n()) {
            if (!TEnum.equals(mediaReorderCards.m51994h(i).f33824N.status, "normal")) {
                i3++;
            }
            i++;
        }
        return i3;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: P1 */
    public boolean mo52258P1() {
        return true;
    }

    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ void m53772P7() {
        this.f34802h1.m132955Z(false);
        m53630L8();
        mo52306o();
    }

    /* JADX INFO: renamed from: Q6 */
    public void m53773Q6() {
        gne gneVar;
        if (xra.m212782a() || (gneVar = this.f34803i1) == null) {
            return;
        }
        this.f34800f1 = true;
        gneVar.mo168208a(new x20() { // from class: l.yga0
            @Override // p153l.x20
            public final void call() {
                this.f199746a.m53832y7();
            }
        });
    }

    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ void m53774Q7(String str, List list) {
        if (jyb.m147479J(list)) {
            mo52306o();
        } else {
            eu4.m122523b().m122533k(act(), str);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: R */
    public boolean mo52261R() {
        return CoreModule.f18264c.f20405m0.f20205x0.get().booleanValue();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: R0 */
    public boolean mo52262R0() {
        return getActivity() instanceof NewUI1ContainerActivity;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: R3 */
    public void m52256N6() {
        act().m68056e2();
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ void m53775R7(Throwable th) {
        mo52306o();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: S */
    public boolean mo52265S() {
        return true;
    }

    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ void m53776S7(View view) {
        pza0.m174356h("button");
        if (!this.f34802h1.m132953W() || !m53738w7()) {
            final String strM122525c = eu4.m122523b().m122525c(this.f34752E0, aw90.m100562F().f73701a);
            if (eu4.m122523b().m122531i(strM122525c)) {
                act().duringCreated(CoreModule.f18264c.f20353U1.m125490i3("profile", strM122525c)).subscribe(psd0.m173597H(new y20() { // from class: l.yfa0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f199458a.m53774Q7(strM122525c, (List) obj);
                    }
                }, new y20() { // from class: l.zfa0
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f204113a.m53775R7((Throwable) obj);
                    }
                }));
                return;
            } else {
                mo52306o();
                return;
            }
        }
        PicPostDlgView picPostDlgView = (PicPostDlgView) act().inflater().inflate(kec0.f125341B8, (ViewGroup) null);
        picPostDlgView.m53006s(m53683d7());
        new Random().nextInt(26);
        this.f34785V.put(Integer.valueOf(this.f34785V.get().intValue() + 1));
        new jl80.C17971a(act()).m146023R(picPostDlgView).m146055x0(R$string.f19298h5, new Object[0]).m146050s0(R$string.f19329i5, new Object[0]).m146052u0(qa00.f156320g, qa00.f156330q).m146021P(false).m146032a0(R$string.f19236f5, new Runnable() { // from class: l.wfa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f188780a.m53770O7();
            }
        }).m146037f0(R$string.f19267g5, new Runnable() { // from class: l.xfa0
            @Override // java.lang.Runnable
            public final void run() {
                this.f194019a.m53772P7();
            }
        }).m146040i0(dbc0.f86732Xj).m146049r0();
        m53632M8(this.f34785V.get().intValue());
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ void m53777T7(View view) {
        pza0.m174356h("button");
        m52256N6();
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ void m53778U7(View view) {
        m53762K8();
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ void m53779V7(User user) {
        m53671Z8(user);
        m53680c9(user);
        this.f34756G0.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: V8 */
    public final void m53780V8(int i) {
        if (i == 0) {
            if (NullChecker.m82486a(this.f34766L0) && bnl0.m105529O0(this.f34766L0)) {
                this.f34766L0.m44923l0();
                return;
            }
            return;
        }
        if (i == 1 && NullChecker.m82486a(this.f34789X)) {
            ViewGroup viewGroup = (ViewGroup) this.f34789X.getCardView().getParent();
            if (NullChecker.m82486a(viewGroup)) {
                PicCertGuideView picCertGuideView = (PicCertGuideView) viewGroup.findViewById(adc0.f69967J9);
                if (NullChecker.m82486a(picCertGuideView) && bnl0.m105529O0(picCertGuideView)) {
                    picCertGuideView.m44923l0();
                }
            }
        }
    }

    /* JADX INFO: renamed from: W6 */
    public final boolean m53781W6() {
        LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = TextUtils.equals(this.f34776Q0, "chat_complete_profile") ? LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_CHAT_COMPLETE_PROFILE : null;
        if (TextUtils.equals(this.f34776Q0, "mytab_complete_profile")) {
            loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MYTAB_COMPLETE_PROFILE;
        }
        if (TextUtils.equals(this.f34776Q0, "left_swipe_complete_profile")) {
            loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LEFT_SWIPE_COMPLETE_PROFILE;
        }
        if (TextUtils.equals(this.f34776Q0, "received_profile_like_not_null") || TextUtils.equals(this.f34776Q0, "received_profile_like_is_null")) {
            loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE;
        }
        if (TextUtils.equals(this.f34776Q0, "from_ideal_type_mine_tab_guide")) {
            LoopFragmentFactory.m52660U(aw90.m100562F().f73701a, this, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_GUIDE, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG);
            return true;
        }
        if (TextUtils.equals(this.f34776Q0, "from_ideal_type_other_profile")) {
            LoopFragmentFactory.m52660U(aw90.m100562F().f73701a, this, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_OTHER_PROFILE_FEEDBACK, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_DIALOG);
            return true;
        }
        if (TextUtils.equals(this.f34776Q0, "from_ideal_type_profile_item")) {
            LoopFragmentFactory.m52660U(aw90.m100562F().f73701a, this, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_ITEM, CoreStaticData.ProfileFromType.FROM_IDEAL_GUIDE_PROFILE_ITEM);
            return true;
        }
        if (!NullChecker.m82486a(loopCreateEntryType)) {
            return false;
        }
        LoopFragmentFactory.m52660U(aw90.m100562F().f73701a, this, null, loopCreateEntryType, this.f34776Q0);
        return true;
    }

    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ void m53782W7(FakeGuideData fakeGuideData) {
        bnl0.m105524M(this.f34781T, true);
        bnl0.m105524M(this.f34761J, false);
        bnl0.m105524M(this.f34763K, false);
        bnl0.m105524M(this.f34765L, false);
        if (NullChecker.m82486a(this.f34766L0)) {
            bnl0.m105524M(this.f34766L0, false);
        }
        bnl0.m105524M(this.f34759I, true);
    }

    /* JADX INFO: renamed from: W8 */
    public final void m53783W8() {
        if (gra.m131731p2()) {
            int i = 0;
            if (xra.m212782a()) {
                AvatarCards avatarCards = this.f34804j1.f121666u;
                if (NullChecker.m82486a(avatarCards)) {
                    int childCount = avatarCards.getChildCount();
                    while (i < childCount) {
                        avatarCards.m51994h(i).m52961n0(null);
                        i++;
                    }
                    return;
                }
                return;
            }
            MediaReorderCards mediaReorderCards = this.f34803i1.f105078v;
            if (NullChecker.m82486a(mediaReorderCards)) {
                int childCount2 = mediaReorderCards.getChildCount();
                while (i < childCount2) {
                    mediaReorderCards.m51994h(i).f33824N = null;
                    i++;
                }
            }
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: X6, reason: merged with bridge method [inline-methods] */
    public ArrayList<pf60<String, x20>> mo30631C4() {
        ArrayList<pf60<String, x20>> arrayList = new ArrayList<>();
        arrayList.add(jyb.m147494Y("user id", new x20() { // from class: l.ifa0
            @Override // p153l.x20
            public final void call() {
                this.f114652a.m53745z7();
            }
        }));
        arrayList.add(jyb.m147494Y("温馨提示框", new x20() { // from class: l.tfa0
            @Override // p153l.x20
            public final void call() {
                this.f173939a.m53603A7();
            }
        }));
        arrayList.add(jyb.m147494Y("用户位置信息", new x20() { // from class: l.ega0
            @Override // p153l.x20
            public final void call() {
                this.f93911a.m53606B7();
            }
        }));
        arrayList.add(jyb.m147494Y("Profile Guide", new x20() { // from class: l.pga0
            @Override // p153l.x20
            public final void call() {
                this.f152251a.m53750D7();
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ void m53785X7(Bundle bundle) {
        act().setTitle(m21603x4(R$string.f18826Rj));
        CoreModule.f18264c.f20381e0.f89336u0.put(Boolean.FALSE);
        mo52291h3();
        if (ProfileListFrag.f34458I4 == null) {
            l51.m152919y(new Runnable() { // from class: l.aga0
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListFragLocalEditImpl.m53611E5();
                }
            });
        }
        CoreModule.f18264c.f20378d0.f128826R.m159274k().first().subscribe(psd0.m173591B());
    }

    /* JADX INFO: renamed from: X8 */
    public final void m53786X8() {
        m53766N6(new y20() { // from class: l.gha0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f104088a.m53822q8((q7m) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: Y0 */
    public ViewGroup mo52272Y0() {
        return this.f34783U;
    }

    /* JADX INFO: renamed from: Y6 */
    public User m53787Y6() {
        if (NullChecker.m82486a(mo52241F1(false)) && this.f34802h1.m132952V()) {
            aw90.m100562F().f73701a.profile.extensions.momentSwitch.noSyncMoment.clear();
            aw90.m100562F().f73701a.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f34802h1.m132951U() ? "false" : "true");
        }
        User userMo225055clone = aw90.m100562F().f73701a.mo225055clone();
        m53698i7(userMo225055clone);
        return userMo225055clone.subtract(this.f34752E0);
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ void m53788Y7(uxj0 uxj0Var) {
        mo52291h3();
    }

    /* JADX INFO: renamed from: Y8 */
    public final void m53789Y8() {
        final int iM100595C;
        if (this.f34767M == null || this.f34769N == null || aw90.m100562F().f73713m.get().intValue() == (iM100595C = aw90.m100562F().m100595C(act(), aw90.m100562F().f73701a, true))) {
            return;
        }
        SpannableStringBuilder spannableStringBuilderM175796b0 = iM100595C < 100 ? q8g0.m175796b0("达到100%被喜欢的概率将提升4倍！", jyb.m147507f0("4倍"), -98787, lyh0.m156283c(2)) : q8g0.m175796b0("被喜欢的概率已超过70%的用户！", jyb.m147507f0("70%"), -98787, lyh0.m156283c(2));
        if (iM100595C == 0) {
            bnl0.m105524M(this.f34771O, true);
            bnl0.m105524M(this.f34773P, false);
        }
        this.f34777R.setText(spannableStringBuilderM175796b0);
        this.f34767M.m44932c(100.0f, act().color(c9c0.f80466w), qa00.m175859d(6.0f), qa00.m175859d(3.0f));
        l51.m152888H(act(), new Runnable() { // from class: l.xga0
            @Override // java.lang.Runnable
            public final void run() {
                this.f194164a.m53823r8(iM100595C);
            }
        }, 300L);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: Z2 */
    public int mo52275Z2() {
        int i = 0;
        if (xra.m212782a()) {
            AvatarCards avatarCards = this.f34804j1.f121666u;
            if (!NullChecker.m82486a(avatarCards)) {
                return 0;
            }
            if (avatarCards.m51994h(0).m51977n()) {
                CrashHelper.m82479c(new NullPointerException("The first pic cannot be empty！"));
            }
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i < avatarCards.getChildCount() && !avatarCards.m51994h(i).m51977n()) {
                Media media = avatarCards.m51994h(i).getMedia();
                arrayList.add(media);
                if (NullChecker.m82486a(media) && !TEnum.equals(avatarCards.m51994h(i).getMedia().status, "normal")) {
                    i2++;
                }
                i++;
            }
            int size = arrayList.size();
            if (!NullChecker.m82486a(aw90.m100562F().f73701a)) {
                CrashHelper.m82479c(new NullPointerException("ProfileListFrag editingUser is null when edit pic"));
                aw90.m100562F().f73701a = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
            }
            if (size > 0) {
                aw90.m100562F().f73701a.pictures = arrayList;
                return i2;
            }
            if (aw90.m100562F().f73701a.pictures.isEmpty()) {
                aw90.m100562F().f73701a.pictures = this.f34752E0.pictures;
            }
            return i2;
        }
        MediaReorderCards mediaReorderCards = this.f34803i1.f105078v;
        if (!NullChecker.m82486a(mediaReorderCards)) {
            return 0;
        }
        if (mediaReorderCards.m51994h(0).m51977n()) {
            CrashHelper.m82479c(new NullPointerException("The first pic cannot be empty！"));
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (i < mediaReorderCards.getChildCount() && !mediaReorderCards.m51994h(i).m51977n()) {
            Media media2 = mediaReorderCards.m51994h(i).f33824N;
            arrayList2.add(media2);
            if (NullChecker.m82486a(media2) && !TEnum.equals(mediaReorderCards.m51994h(i).f33824N.status, "normal")) {
                i3++;
            }
            i++;
        }
        int size2 = arrayList2.size();
        if (!NullChecker.m82486a(aw90.m100562F().f73701a)) {
            CrashHelper.m82479c(new NullPointerException("ProfileListFrag editingUser is null when edit pic"));
            aw90.m100562F().f73701a = CoreModule.f18264c.f20381e0.m116600p9().mo225055clone();
        }
        if (size2 > 0) {
            aw90.m100562F().f73701a.pictures = arrayList2;
        } else if (aw90.m100562F().f73701a.pictures.isEmpty()) {
            aw90.m100562F().f73701a.pictures = this.f34752E0.pictures;
        }
        if (size2 <= mediaReorderCards.getChildCount()) {
            m53708l9(size2, null, mediaReorderCards);
        }
        return i3;
    }

    /* JADX INFO: renamed from: Z7 */
    public final /* synthetic */ void m53790Z7(C4470c c4470c) {
        if (this.f34749C.getSelectedTabPosition() == 0) {
            l51.m152888H(act(), new Runnable() { // from class: l.vfa0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f183888a.m53773Q6();
                }
            }, 1000L);
        }
    }

    /* JADX INFO: renamed from: a8 */
    public final /* synthetic */ Boolean m53791a8(C4470c c4470c) {
        return Boolean.valueOf(this.f34749C.getSelectedTabPosition() == 1);
    }

    /* JADX INFO: renamed from: a9 */
    public void m53792a9() {
        this.pageHelper.m152782q(pageId());
        C8992f.m55879b().m55884f(this.f34776Q0);
    }

    /* JADX INFO: renamed from: b7 */
    public VReorderCard m53793b7(int i) {
        gne gneVar;
        MediaReorderCards mediaReorderCards;
        if (xra.m212782a() || (gneVar = this.f34803i1) == null || (mediaReorderCards = gneVar.f105078v) == null) {
            return null;
        }
        return mediaReorderCards.m51994h(i);
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ void m53794b8(C4470c c4470c) {
        m53799e7();
    }

    /* JADX INFO: renamed from: b9 */
    public void m53795b9(int i, int i2) {
        if (NullChecker.m82486a(this.f34760I0) && this.f34760I0.isRunning()) {
            return;
        }
        if (i == 0 && i2 - i >= 20) {
            i = i2 - 20;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        this.f34760I0 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(400L);
        this.f34760I0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.hha0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f109492a.m53824s8(valueAnimator);
            }
        });
        this.f34760I0.addListener(new C8890d(i2));
        this.f34760I0.setInterpolator(new LinearInterpolator());
        this.f34760I0.start();
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ void m53796c8(User user, CoreSuggested.UserInfo userInfo, q7m q7mVar) {
        q7mVar.setPageHelper(this.f34794Z0);
        q7mVar.mo37855T(user, userInfo, 0);
        bnl0.m105524M(this.f34751E, false);
        if (bnl0.m105529O0(this.f34750D)) {
            q7mVar.mo37820G();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        aw90.m100562F().f73701a = CoreModule.f18264c.f20381e0.m116593na().mo225055clone();
        duringCreated(this.f34756G0).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.oea0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f146978a.m53758I7((uxj0) obj);
            }
        }, new y20() { // from class: l.pea0
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82479c((Throwable) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.qea0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156803a.m53760J7((C4470c) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.rea0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return C22421c.timer(450L, TimeUnit.MILLISECONDS);
            }
        }).compose(psd0.m173592C()).subscribe(psd0.m173596G(new y20() { // from class: l.sea0
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20294B0.m32620p4(CoreModule.m30929H().userId());
            }
        }));
        creates(new y20() { // from class: l.tea0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173453a.m53763L7((Bundle) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: d8 */
    public final /* synthetic */ void m53797d8(ovb0 ovb0Var) {
        final User user = (User) ovb0Var.f149248a;
        B b = ovb0Var.f149249b;
        user.friendCommentInfo = ((User) b).friendCommentInfo;
        user.verifications = ((User) b).verifications;
        final CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.f20214id = user.f56859id;
        userInfo.renderFrom = CardInfoRenderFrom.PROFILE_PREVIEW;
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(ovb0Var.f149250c)) {
            List<T> list = ((vg60) ovb0Var.f149250c).f184001a;
            if (!jyb.m147479J(list)) {
                for (T t : list) {
                    if (!jyb.m147479J(t.media)) {
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
        userInfo.coreMomentInfoList = ((vg60) ovb0Var.f149250c).f184001a;
        userInfo.myTabTask = (MyTabTask) ovb0Var.f149251d;
        m53691g7(userInfo);
        m53766N6(new y20() { // from class: l.bga0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76575a.m53796c8(user, userInfo, (q7m) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d9 */
    public boolean m53798d9() {
        return "profile_frag_me_avatar".equals(this.f34776Q0);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: e7 */
    public final void m53799e7() {
        if (aw90.m100566U(CoreModule.f18264c.f20381e0.m116593na())) {
            CoreModule.f18264c.f20381e0.f89269k7.m137019l(MyTabTask.new_());
        } else {
            if (gra.m131676e2() && TextUtils.equals(CoreModule.f18264c.f20381e0.f89178Z3.get(), UserHomeMode.marryMode)) {
                return;
            }
            CoreModule.f18264c.f20381e0.m116448C7();
        }
    }

    /* JADX INFO: renamed from: e8 */
    public final /* synthetic */ void m53800e8(boolean z) {
        mo52275Z2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        creates(new y20() { // from class: l.uea0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f178644a.m53785X7((Bundle) obj);
            }
        });
        duringCreated(C4901p.f20821f0).subscribe(psd0.m173596G(new y20() { // from class: l.vea0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f183715a.m53788Y7((uxj0) obj);
            }
        }));
        duringCreated(C4901p.f20822g0).subscribe(psd0.m173596G(new y20() { // from class: l.wea0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileListFragLocalEditImpl.m53659V4((uxj0) obj);
            }
        }));
        duringCreated(CoreModule.f18264c.f20378d0.m151460j3()).subscribe(psd0.m173591B());
        m53812l7();
        m53730t7();
        if (xra.m212792k()) {
            lifecycle().filter(new qcj() { // from class: l.yea0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            }).first().subscribe(psd0.m173597H(new y20() { // from class: l.zea0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f203987a.m53790Z7((C4470c) obj);
                }
            }, new y20() { // from class: l.afa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ProfileListFragLocalEditImpl.m53715o6((Throwable) obj);
                }
            }));
        }
        if (gra.m131731p2()) {
            lifecycle().filter(new qcj() { // from class: l.bfa0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
                }
            }).filter(new qcj() { // from class: l.cfa0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f81494a.m53791a8((C4470c) obj);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.dfa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f88145a.m53794b8((C4470c) obj);
                }
            }, new y20() { // from class: l.efa0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ProfileListFragLocalEditImpl.m53725s5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f7 */
    public final LinearLayout m53801f7(View view) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        final View viewInflate = p9r.m171370a(getContext()).inflate(kec0.f126120wa, (ViewGroup) linearLayout, false);
        linearLayout.addView(viewInflate);
        final PicCertGuideView picCertGuideView = (PicCertGuideView) p9r.m171370a(getContext()).inflate(kec0.f125324A8, (ViewGroup) linearLayout, false);
        bnl0.m105540X(picCertGuideView, qa00.m175859d(12.0f));
        bnl0.m105538V(picCertGuideView, qa00.m175859d(8.0f));
        bnl0.m105539W(picCertGuideView, qa00.m175859d(8.0f));
        bnl0.m105537U(picCertGuideView, -qa00.m175859d(3.0f));
        linearLayout.addView(picCertGuideView);
        if (view instanceof UserProfileExpandedCard) {
            ((UserProfileExpandedCard) view).m39023b1(0, 0, 0, qa00.m175859d(44.0f));
            linearLayout.addView(m53818n9(view));
        } else {
            linearLayout.addView(view);
        }
        duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged(new qcj() { // from class: l.zga0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).status;
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.bha0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76742a.m53754F7(viewInflate, picCertGuideView, (User) obj);
            }
        }, new y20() { // from class: l.cha0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileListFragLocalEditImpl.m53616G5((Throwable) obj);
            }
        }));
        if (nrb0.m164466b()) {
            duringCreated(CoreModule.f18264c.f20294B0.m32614j4().filter(new qcj() { // from class: l.dha0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    VerificationCenter verificationCenter = (VerificationCenter) obj;
                    return Boolean.valueOf(NullChecker.m82486a(verificationCenter) && NullChecker.m82486a(verificationCenter.picVerificationInfo));
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.eha0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f94014a.m53752E7(picCertGuideView, (VerificationCenter) obj);
                }
            }));
        }
        return linearLayout;
    }

    /* JADX INFO: renamed from: f8 */
    public final /* synthetic */ void m53802f8() {
        this.f34803i1.f105078v.setViewCatchListener(new VReorderCards.InterfaceC8790c() { // from class: l.sfa0
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.VReorderCards.InterfaceC8790c
            /* JADX INFO: renamed from: a */
            public final void mo52005a(boolean z) {
                this.f167680a.m53800e8(z);
            }
        });
        if (xra.m212804w()) {
            this.f34803i1.f105078v.m52002q(new Runnable() { // from class: l.ufa0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f178745a.mo52275Z2();
                }
            });
        }
    }

    /* JADX INFO: renamed from: f9 */
    public void m53803f9(final int i) {
        new th0.C20312a(act()).m191160s(m21603x4(R$string.f19380jr)).m191148g(false).m191150i(R$string.f19350ir).m191158q(R$string.f19320hr).m191156o(new View.OnClickListener() { // from class: l.qda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f156682a.m53831x8(i, view);
            }
        }).m191146e(R$string.f19138c).m191142a().m191141g();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    public String from() {
        return this.f34776Q0;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: g3 */
    public boolean mo52289g3() {
        return false;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INIT_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        super.mo21585g4(bundle);
        m53724r7();
        m53615F8();
        if (NullChecker.m82486a(act().getSupportActionBar())) {
            act().getSupportActionBar().mo102186m();
        }
        m53735v7();
        m53826u7();
        m53721q7();
        initState();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: g8 */
    public final /* synthetic */ void m53804g8(MenuItem menuItem, View view) {
        startActivity(ProfileAct.m51922q2(act() == null ? menuItem.getActionView().getContext() : act(), this.f34772O0, "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: g9 */
    public final void m53805g9() {
        if (CoreModule.m30930K().me_().isBanned()) {
            return;
        }
        if (CoreModule.f18264c.f20381e0.m116555e8()) {
            ey0.m123126h(act());
        } else if (CoreModule.m30930K().me_().isAudit()) {
            ey0.m123124f(act());
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: h3 */
    public void mo52291h3() {
        duringCreated(CoreModule.f18264c.f20381e0.m116527W9(userId()).flatMap(new qcj() { // from class: l.ofa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20424s1.m35372s3();
            }
        }).map(new qcj() { // from class: l.pfa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f152166a.m53813l8((List) obj);
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.qfa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157280a.m53815m8((pf60) obj);
            }
        }, new y20() { // from class: l.rfa0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileListFragLocalEditImpl.m53704k6((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h8 */
    public final /* synthetic */ void m53806h8(List list) {
        this.f34807l1.m121543i0(list);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: i3 */
    public int mo52294i3() {
        return this.f34798d1;
    }

    /* JADX INFO: renamed from: i8 */
    public final /* synthetic */ C22421c m53807i8(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.f18264c.f20381e0.m116458E9(user);
        }
        aw90.m100562F().f73701a.description = profileEditInfo.user.description;
        aw90.m100562F().f73701a.profile = profileEditInfo.user.profile;
        User user2 = aw90.m100562F().f73701a;
        User user3 = profileEditInfo.user;
        user2.name = user3.name;
        if (TextUtils.isEmpty(user3.pictures.get(0).url)) {
            m53654T8(aw90.m100562F().f73701a, true);
            if (!xra.m212782a()) {
                bnl0.m105524M(this.f34803i1.f105079w, false);
            }
        } else {
            if (!xra.m212782a()) {
                bnl0.m105524M(this.f34803i1.f105079w, true);
            }
            aw90.m100562F().f73701a.pictures = profileEditInfo.user.pictures;
            m53654T8(aw90.m100562F().f73701a, false);
        }
        throw new ProfileEditInfoException(profileEditInfo);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INFLATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        View viewM53764M6 = m53764M6(layoutInflater, viewGroup);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        return viewM53764M6;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: j3 */
    public void mo52296j3(int i) {
        Intent intent = new Intent();
        if (!NullChecker.m82486a(this.f34752E0)) {
            act().m68056e2();
        } else {
            act().setResult(i, intent);
            act().m68056e2();
        }
    }

    /* JADX INFO: renamed from: j7 */
    public void m53808j7() {
        this.f34772O0 = getArguments().getString("user_id");
        this.f34776Q0 = getArguments().getString("from");
        if (TextUtils.isEmpty(this.f34772O0)) {
            CrashHelper.m82480d(new NullPointerException("profilelistFrag_initArguments_userid_null,from:" + this.f34776Q0), 1000);
            act().m68056e2();
            return;
        }
        this.f34774P0 = getArguments().getString("input_type");
        this.f34778R0 = getArguments().getBoolean("open_media_picker");
        Serializable serializable = getArguments().getSerializable("params_extra_map_data");
        if (serializable instanceof HashMap) {
            this.f34764K0 = (HashMap) serializable;
        }
    }

    /* JADX INFO: renamed from: j8 */
    public final /* synthetic */ void m53809j8(boolean z, User user, User user2, y20 y20Var, User user3, uxj0 uxj0Var) {
        if (z) {
            CoreModule.f18264c.f20381e0.f89234g4.m137019l("");
        }
        if (user.pictures.size() - user2.pictures.size() > 0) {
            i4g0.m138495D("e_upload_photos_success", pageId(), jyb.m147494Y("upload_page_name", "edit_profile_page"), jyb.m147494Y("upload_photos_count", Integer.valueOf(user.pictures.size() - user2.pictures.size())));
        }
        if (gra.m131731p2() && NullChecker.m82486a(this.f34752E0) && !TextUtils.isEmpty(this.f34752E0.description) && !jyb.m147479J(this.f34752E0.pictures) && this.f34752E0.pictures.size() >= 3) {
            dkb dkbVar = CoreModule.f18264c.f20381e0;
            if (dkbVar.f89173Y6 && !dkbVar.f89189a7) {
                dkbVar.f89189a7 = true;
                i4g0.m138495D("e_complete_card_success", "p_edit_profile_view", new pf60[0]);
            }
        }
        if (y20Var != null) {
            y20Var.call(Boolean.TRUE);
        }
        if (NullChecker.m82486a(user3.pictures) && user3.pictures.size() > 0) {
            CoreModule.f18264c.f20381e0.m116468H7();
        }
        if (m53738w7() && this.f34802h1.m132951U() && !this.f34810o1) {
            aw90.m100562F().f73704d.m137019l(Integer.valueOf(ml70.f137369c));
            aw90.m100562F().f73705e.m137019l(uxj0.f181467a);
        } else if (!this.f34810o1) {
            aw90.m100562F().f73704d.m137019l(Integer.valueOf((NullChecker.m82486a(this.f34752E0) && this.f34752E0.status.contains(UserStatus.get(UserStatus.audit))) ? ml70.f137370d : ml70.f137371e));
        }
        m21598s4();
    }

    /* JADX INFO: renamed from: k8 */
    public final /* synthetic */ void m53810k8(User user, User user2, final y20 y20Var, Throwable th) {
        if (bsj0.m106250H(th)) {
            m21598s4();
            return;
        }
        if (th instanceof ProfileEditInfoException) {
            m21598s4();
            if (wx6.m208374d(((ProfileEditInfoException) th).getEditInfo(), pageId())) {
                o1j0.m165649w(R$string.f19139c0);
                return;
            } else {
                r1j0.m179419f(R$string.f18664M7);
                return;
            }
        }
        if (NullChecker.m82486a(act())) {
            m21598s4();
            String string = act().getString(R$string.f19129bl);
            double dDoubleValue = (NullChecker.m82486a(user.settings) && NullChecker.m82486a(user.settings.birthdate)) ? user.settings.birthdate.doubleValue() : FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            if (NullChecker.m82486a(user2.settings) && NullChecker.m82486a(user2.settings.birthdate)) {
                dDoubleValue = user2.settings.birthdate.doubleValue();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis((long) dDoubleValue);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(uqb0.f180376H.guessedCurrentServerTime());
            int iM214863T = yab.m214863T(calendar, calendar2);
            if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name) && iM214863T > 120) {
                string = act().getString(R$string.f18930V3);
            } else if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name)) {
                string = act().getString(R$string.f18960W3);
            } else if (iM214863T > 120) {
                string = act().getString(R$string.f18990X3);
            }
            m21580b4().m21503F(string).m21555t0(R$string.f18776Q, new Runnable() { // from class: l.fha0
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListFragLocalEditImpl.m53626K5(y20Var);
                }
            }).m21540k0(R$string.f19138c).m21567z0();
        }
    }

    /* JADX INFO: renamed from: k9 */
    public void m53811k9() {
        pza0.m174356h("android_back");
    }

    /* JADX INFO: renamed from: l7 */
    public void m53812l7() {
        if (eu4.m122523b().m122529g()) {
            act().duringCreated(CoreModule.f18264c.f20353U1.f98891S).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.uga0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178878a.m53756H7((Boolean) obj);
                }
            }, new y20() { // from class: l.vga0
                @Override // p153l.y20
                public final void call(Object obj) {
                    ProfileListFragLocalEditImpl.m53647S4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l8 */
    public final /* synthetic */ pf60 m53813l8(List list) {
        return jyb.m147494Y(list, BookMoviesDramasHelper.m60629l(userId()));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: m0 */
    public boolean mo52302m0() {
        return true;
    }

    /* JADX INFO: renamed from: m7 */
    public final void m53814m7() {
        if (CertificationUtil.m59336l() || !NullChecker.m82486a(mo52241F1(false)) || aw90.m100562F().f73701a.status.contains(UserStatus.get(UserStatus.audit))) {
            if (!NullChecker.m82486a(mo52241F1(false))) {
                bnl0.m105524M(this.f34759I, false);
                return;
            }
            if (m53830x7()) {
                bnl0.m105524M(this.f34759I, true);
                boolean zContains = aw90.m100562F().f73701a.status.contains(UserStatus.get(UserStatus.audit));
                this.f34762J0 = zContains;
                bnl0.m105524M(this.f34761J, zContains);
                bnl0.m105524M(this.f34763K, false);
                bnl0.m105524M(this.f34765L, !this.f34762J0);
                if (this.f34762J0) {
                    bnl0.m105524M(this.f34765L, false);
                } else {
                    m53789Y8();
                }
            }
        }
    }

    /* JADX INFO: renamed from: m8 */
    public final /* synthetic */ void m53815m8(pf60 pf60Var) {
        this.f34758H0 = pf60Var;
        mo52250J3();
    }

    /* JADX INFO: renamed from: m9 */
    public void m53816m9(int i) {
        if (i > this.f34782T0.size()) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f34782T0.size()) {
            bnl0.m105524M(this.f34782T0.get(i2), i2 == i);
            i2++;
        }
        m53768N8(i);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: me */
    public User mo53478me() {
        if (this.f34754F0 == null) {
            m53671Z8(CoreModule.m30930K().me_());
        }
        return this.f34754F0;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: n4 */
    public void mo21593n4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.PRE_CREATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        setHasOptionsMenu(true);
        m53808j7();
        m53713n7();
        if ("my_tab_profile_like".equals(this.f34776Q0)) {
            this.pageHelper.m152782q(pageId());
        } else {
            m53792a9();
        }
        m53727s7();
        xc20.m210108t(act());
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        m53705k7();
    }

    /* JADX INFO: renamed from: n8 */
    public final /* synthetic */ void m53817n8(List list, boolean z) {
        this.f34804j1.m146157W(list, z);
    }

    /* JADX INFO: renamed from: n9 */
    public final View m53818n9(View view) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(Color.parseColor("#f3f3f3"));
        View view2 = new View(view.getContext());
        view2.setBackground(view.getContext().getDrawable(dbc0.f87308p7));
        frameLayout.addView(view2, new FrameLayout.LayoutParams(-1, qa00.m175859d(27.0f)));
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: o */
    public void mo52306o() {
        boolean zEquals = TextUtils.equals(aw90.m100562F().f73701a.description, this.f34754F0.description);
        String str = "about_me_pop_ups";
        if (!TextUtils.equals(this.f34776Q0, "about_me_pop_ups")) {
            str = "about_me_banner";
            if (!TextUtils.equals(this.f34776Q0, "about_me_banner")) {
                str = "edit_data_button";
                if (!TextUtils.equals(this.f34776Q0, "edit_data_button")) {
                    str = "edit_home_page";
                    if (!TextUtils.equals(this.f34776Q0, "edit_home_page")) {
                        str = "other";
                    }
                }
            }
        }
        sfj0.m185596c("e_edit_personal_profile_finish", "p_edit_profile_view", sfj0.C20032a.m185615h("about_me_is_modified", zEquals ? "no" : "yes"), sfj0.C20032a.m185615h("previous_page", str));
        if (!NullChecker.m82486a(mo52241F1(false)) || !NullChecker.m82486a(this.f34752E0)) {
            m52256N6();
            return;
        }
        if (this.f34802h1.m132952V()) {
            aw90.m100562F().f73701a.profile.extensions.momentSwitch.noSyncMoment.clear();
            aw90.m100562F().f73701a.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f34802h1.m132951U() ? "false" : "true");
        }
        int iMo52275Z2 = mo52275Z2();
        if (m53653T6()) {
            m53686e9(false);
            return;
        }
        if (m53661V6()) {
            m53695h9(false);
            return;
        }
        if (m53657U6()) {
            m53695h9(false);
        } else if (aw90.m100562F().f73701a.equals(this.f34752E0)) {
            m52256N6();
        } else {
            m53702j9(iMo52275Z2);
        }
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ void m53819o8(Media media, Boolean bool, Boolean bool2) {
        mo52275Z2();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 786) {
            if (i2 == -1) {
                qtk.m177983L0(act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.f55451h));
                return;
            }
            return;
        }
        if (1 == i && NullChecker.m82486a(intent)) {
            String stringExtra = intent.getStringExtra("about_me");
            aw90.m100562F().f73701a.description = jyb.m147516k(stringExtra).trim();
            mo52239E();
            m53658U8(aw90.m100562F().f73701a);
            return;
        }
        if (NullChecker.m82486a(intent) && i2 == -1 && LoopFragmentFactory.m52653N(i, aw90.m100562F().f73701a, intent)) {
            mo52239E();
            m53658U8(aw90.m100562F().f73701a);
            if (i == LoopInputType.HIDDEN_SCHOOL.requestCode) {
                this.f34806k1.m212180R0();
                return;
            }
            return;
        }
        if (i == 3500 && i2 == -1 && NullChecker.m82486a(intent)) {
            if (NullChecker.m82486a(aw90.m100562F().f73701a)) {
                LoopFragmentFactory.m52672j(act());
                if (gra.m131756u2()) {
                    m53642Q8(aw90.m100562F().f73701a.pictures);
                }
                mo52239E();
                m53658U8(aw90.m100562F().f73701a);
                return;
            }
            return;
        }
        if (i == 3001) {
            mo52239E();
            m53658U8(aw90.m100562F().f73701a);
        } else if (i == 3003) {
            mo52250J3();
        } else {
            super.onActivityResult(i, i2, intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (getActivity() instanceof NewUI1ContainerActivity) {
            menuInflater.inflate(lfc0.f131843f, menu);
            final MenuItem menuItemFindItem = menu.findItem(adc0.f70420k8);
            menuItemFindItem.getActionView().setOnClickListener(new View.OnClickListener() { // from class: l.nea0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f141580a.m53804g8(menuItemFindItem, view);
                }
            });
            CoreBusinessModule.m30906m0().mo122545e(menuItemFindItem);
        }
    }

    @Override // com.p051p1.mobile.putong.core.app.AutoReleaseVideoFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        PerformanceLogUtil.instance().endTrance();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (NullChecker.m82486a(mo52241F1(false))) {
            mo52275Z2();
            bundle.putBoolean("saveInstanceKey", true);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: p3 */
    public void mo52308p3(final int i, final Media media) {
        if (xra.m212782a()) {
            return;
        }
        this.f34803i1.mo168208a(new x20() { // from class: l.aha0
            @Override // p153l.x20
            public final void call() {
                this.f71334a.m53753E8(i, media);
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public final void m53820p7() {
        if (this.f34795a1 == null) {
            this.f34795a1 = new e3i0(act());
        }
        this.f34795a1.m119299d(uj4.m196316a().mo136048a(true), this.f34750D, new e3i0.InterfaceC16697e() { // from class: l.nfa0
            @Override // p153l.e3i0.InterfaceC16697e
            /* JADX INFO: renamed from: a */
            public final void mo111496a(View view, int i, ViewGroup viewGroup) {
                this.f141719a.m53767N7(view, i, viewGroup);
            }
        });
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ void m53821p8(boolean z, List list) {
        MediaReorderCards mediaReorderCards = this.f34803i1.f105078v;
        mediaReorderCards.setCurPageId("p_edit_profile_view");
        int i = 0;
        while (true) {
            if (i >= mediaReorderCards.getChildCount()) {
                break;
            }
            mediaReorderCards.m51994h(i).setIllegalPicture(z && i < list.size());
            mediaReorderCards.m51994h(i).m51823C1(i < list.size() ? (Media) list.get(i) : null);
            mediaReorderCards.m51994h(i).setChangeAction(new a30() { // from class: l.jga0
                @Override // p153l.a30
                /* JADX INFO: renamed from: a */
                public final void mo37058a(Object obj, Object obj2, Object obj3) {
                    this.f120691a.m53819o8((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            if (gra.m131756u2()) {
                mediaReorderCards.m51994h(i).m51827E1(i, "p_edit_profile_view");
                if (!this.f34787W.get().booleanValue() && i == list.size()) {
                    mediaReorderCards.m51994h(i).m51849P1();
                    this.f34787W.put(Boolean.TRUE);
                }
            }
            mediaReorderCards.m51994h(i).m51834I0(i);
            i++;
        }
        int size = list.size();
        if (size < mediaReorderCards.getChildCount()) {
            m53708l9(size, null, mediaReorderCards);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_edit_profile_view";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.t3m
    /* JADX INFO: renamed from: q */
    public ViewGroup mo52310q() {
        return this.f34753F;
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m53822q8(final q7m q7mVar) {
        if (q7mVar instanceof UserProfileExpandedCard) {
            return;
        }
        bnl0.m105533Q0(this.f34750D, new y20() { // from class: l.iha0
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileListFragLocalEditImpl.m53662W4(q7mVar, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m53823r8(int i) {
        m53795b9(aw90.m100562F().f73713m.get().intValue(), i);
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ void m53824s8(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f34769N.m44932c(iIntValue, act().color(c9c0.f80342I), qa00.m175859d(6.0f), qa00.m175859d(3.0f));
        this.f34775Q.setText(String.format("已完成%s", iIntValue + "%"));
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ void m53825t8(DialogInterface dialogInterface) {
        this.f34812p1.m152774i();
        this.f34812p1.m152777l();
    }

    /* JADX INFO: renamed from: u7 */
    public final void m53826u7() {
        this.f34782T0.add(this.f34753F);
        this.f34782T0.add(this.f34750D);
        bnl0.m105524M(this.f34749C, true);
        int i = getArguments().getInt("preview_type", 0);
        bnl0.m105540X(this.f34753F, qa00.m175859d(56.0f));
        bnl0.m105540X(this.f34750D, qa00.m175859d(56.0f));
        m53769O6(0, i == 0, act().getString(R$string.f19020Y3), true);
        m53769O6(1, i == 1, act().getString(R$string.f18870T3), false);
        m53820p7();
        if (this.f34749C.getTabCount() > 1 && m53798d9()) {
            this.f34790X0 = 0;
        }
        m53816m9(i);
        this.f34749C.setScrollPosition(i, 0.0f, false);
        this.f34749C.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C8887a());
        duringCreated(psd0.m173627t(this.f34791Y, CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged(), m53618G8(), CoreModule.f18264c.f20381e0.f89269k7.distinctUntilChanged(), new tcj() { // from class: l.ffa0
            @Override // p153l.tcj
            /* JADX INFO: renamed from: b */
            public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                return ProfileListFragLocalEditImpl.m53714o5((User) obj, (User) obj2, (vg60) obj3, (MyTabTask) obj4);
            }
        })).filter(new qcj() { // from class: l.gfa0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a(((ovb0) obj).f149248a));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.hfa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f109266a.m53797d8((ovb0) obj);
            }
        }));
        if (!xra.m212782a()) {
            this.f34803i1.mo168208a(new x20() { // from class: l.jfa0
                @Override // p153l.x20
                public final void call() {
                    this.f120576a.m53802f8();
                }
            });
        }
        if (this.f34749C.getTabCount() <= 1 || !m53798d9()) {
            if (this.f34749C.getSelectedTabPosition() == 0) {
                m53805g9();
                return;
            }
            return;
        }
        this.f34792Y0 = true;
        TabLayout tabLayout = this.f34749C;
        tabLayout.selectTab(tabLayout.getTabAt(0));
        TabLayout tabLayout2 = this.f34749C;
        if (tabLayout2 != null) {
            this.f34792Y0 = true;
            tabLayout2.selectTab(tabLayout2.getTabAt(1));
        }
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ void m53827u8(DialogInterface dialogInterface) {
        this.f34812p1.m152776k();
        this.f34812p1.m152775j();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListBaseFrag, p153l.s7m
    public String userId() {
        return this.f34772O0;
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ void m53828v8(View view) {
        List<Media> listM147522n = jyb.m147522n(aw90.m100562F().f73701a.pictures, new C8892f());
        User user = aw90.m100562F().f73701a;
        if (jyb.m147479J(listM147522n)) {
            listM147522n = this.f34752E0.pictures;
        }
        user.pictures = listM147522n;
        i4g0.m138520r("e_delete_photo_saveothers", "p_lowqualityphoto_save_popup");
        m53625J8();
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ void m53829w8(boolean z, View view) {
        if (!z) {
            i4g0.m138520r("e_ontinue_editing", "p_lowqualityphoto_save_popup");
        } else {
            i4g0.m138520r("e_not_save", "p_lowqualityphoto_save_popup");
            m52256N6();
        }
    }

    /* JADX INFO: renamed from: x7 */
    public final boolean m53830x7() {
        return aw90.m100562F().f73701a.status.contains(UserStatus.get(UserStatus.audit));
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ void m53831x8(int i, View view) {
        if (i == aw90.m100562F().f73701a.pictures.size()) {
            aw90.m100562F().f73701a.pictures = this.f34752E0.pictures;
        } else {
            aw90.m100562F().f73701a.pictures = jyb.m147522n(aw90.m100562F().f73701a.pictures, new qcj() { // from class: l.iga0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Media) obj).status, "normal"));
                }
            });
        }
        m53625J8();
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ void m53832y7() {
        MediaReorderCard mediaReorderCardM51994h = this.f34803i1.f105078v.m51994h(1);
        MediaReorderCard mediaReorderCardM51994h2 = this.f34803i1.f105078v.m51994h(2);
        mediaReorderCardM51994h.m51896z0();
        mediaReorderCardM51994h2.m51896z0();
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ void m53833y8(View view) {
        List<Media> listM147522n = jyb.m147522n(aw90.m100562F().f73701a.pictures, new C8893g());
        User user = aw90.m100562F().f73701a;
        if (jyb.m147479J(listM147522n)) {
            listM147522n = this.f34752E0.pictures;
        }
        user.pictures = listM147522n;
        i4g0.m138520r("e_delete_photo_saveothers", "p_lowqualityphoto_save_popup");
        m53625J8();
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ void m53834z8(boolean z, View view) {
        if (!z) {
            i4g0.m138520r("e_ontinue_editing", "p_lowqualityphoto_save_popup");
        } else {
            i4g0.m138520r("e_not_save", "p_lowqualityphoto_save_popup");
            m52256N6();
        }
    }
}
