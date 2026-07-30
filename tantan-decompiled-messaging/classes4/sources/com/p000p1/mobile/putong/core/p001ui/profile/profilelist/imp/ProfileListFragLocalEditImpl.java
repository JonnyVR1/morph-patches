package com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp;

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
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.core.p001ui.notifications.SysnotifListener;
import com.p000p1.mobile.putong.core.p001ui.profile.MediaReorderCard;
import com.p000p1.mobile.putong.core.p001ui.profile.MediaReorderCards;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfileAct;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCard;
import com.p000p1.mobile.putong.core.p001ui.profile.VReorderCards;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.PerformanceLogUtil;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.ProfileLogEntity;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.photo.AvatarCards;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.PicPostDlgView;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.ProfileListFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.SmoothScrollLinearLayoutManager;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListFragLocalEditImpl;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.api.p;
import com.p1.mobile.putong.core.data.CardInfoRenderFrom;
import com.p1.mobile.putong.core.data.CategorySuggestions;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.core.data.DatingGuideData;
import com.p1.mobile.putong.core.data.FakeGuideData;
import com.p1.mobile.putong.core.data.Literatures;
import com.p1.mobile.putong.core.data.LiteraturesComments;
import com.p1.mobile.putong.core.data.MyTabTask;
import com.p1.mobile.putong.core.data.ProfileEditInfo;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p1.mobile.putong.core.newui.home.NewNewProfileCard;
import com.p1.mobile.putong.core.newui.home.card.expanded.UserProfileExpandedCard;
import com.p1.mobile.putong.core.newui.view.PicCertGuideView;
import com.p1.mobile.putong.core.newui.view.RoundedRectangleProgressView;
import com.p1.mobile.putong.core.ui.account.JailedDialogLikeAct;
import com.p1.mobile.putong.core.ui.report.f;
import com.p1.mobile.putong.core.util.CertificationUtil;
import com.p1.mobile.putong.core.util.DebugUtil;
import com.p1.mobile.putong.core.util.bookmoviesdramas.BookMoviesDramasHelper;
import com.p1.mobile.putong.data.DbLinks;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLabel;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Purpose;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.mediapicker.MediaPickerBaseAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
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
import l.a5m;
import l.ark;
import l.asm;
import l.cwf0;
import l.d30;
import l.d5m;
import l.dd80;
import l.e30;
import l.e51;
import l.eqh0;
import l.f6c0;
import l.ft4;
import l.g30;
import l.g9a0;
import l.h7c0;
import l.hpd0;
import l.i0g0;
import l.ic50;
import l.j760;
import l.jjb0;
import l.jo0;
import l.knb0;
import l.l9b;
import l.lqa;
import l.lra0;
import l.lsi0;
import l.mkd0;
import l.o6j0;
import l.o7r;
import l.osi0;
import l.p420;
import l.pib;
import l.q860;
import l.qib0;
import l.roj0;
import l.rzb0;
import l.t100;
import l.t7c0;
import l.tpd0;
import l.tw6;
import l.u4c0;
import l.upa;
import l.v7c;
import l.v9j;
import l.vi4;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.wn90;
import l.wuh0;
import l.x2c0;
import l.xdl0;
import l.xh0;
import l.xx0;
import l.ygh0;
import l.yij0;
import l.z9j;
import l.zvf0;
import org.joor.Reflect;
import p002l.ame;
import p002l.cme;
import p002l.cqa0;
import p002l.fj90;
import p002l.fle;
import p002l.gd70;
import p002l.hn2;
import p002l.ine;
import p002l.mt90;
import p002l.vme;
import rx.subjects.a;
import v.VButton;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VProgressBar;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileListFragLocalEditImpl extends ProfileListBaseFrag {

    /* JADX INFO: renamed from: r1 */
    public static cwf0 f1718r1 = new cwf0("p_edit_profile_post_pic_popup", Dialog.class.getName());

    /* JADX INFO: renamed from: s1 */
    public static Field f1719s1 = Reflect.on(Toolbar.class).field0("mMenuView");

    /* JADX INFO: renamed from: t1 */
    public static CategorySuggestions f1720t1;

    /* JADX INFO: renamed from: A */
    public VNavigationBar f1721A;

    /* JADX INFO: renamed from: B */
    public View f1722B;

    /* JADX INFO: renamed from: C */
    public TabLayout f1723C;

    /* JADX INFO: renamed from: D */
    public VFrame f1724D;

    /* JADX INFO: renamed from: E */
    public VProgressBar f1725E;

    /* JADX INFO: renamed from: E0 */
    public User f1726E0;

    /* JADX INFO: renamed from: F */
    public VFrame f1727F;

    /* JADX INFO: renamed from: F0 */
    public User f1728F0;

    /* JADX INFO: renamed from: G */
    public VProgressBar f1729G;

    /* JADX INFO: renamed from: H */
    public VLinear f1731H;

    /* JADX INFO: renamed from: H0 */
    public j760<List<Literatures>, List<LiteraturesComments>> f1732H0;

    /* JADX INFO: renamed from: I */
    public FrameLayout f1733I;

    /* JADX INFO: renamed from: I0 */
    public ValueAnimator f1734I0;

    /* JADX INFO: renamed from: J */
    public CardView f1735J;

    /* JADX INFO: renamed from: K */
    public CardView f1737K;

    /* JADX INFO: renamed from: L */
    public CardView f1739L;

    /* JADX INFO: renamed from: L0 */
    public PicCertGuideView f1740L0;

    /* JADX INFO: renamed from: M */
    public RoundedRectangleProgressView f1741M;

    /* JADX INFO: renamed from: N */
    public RoundedRectangleProgressView f1743N;

    /* JADX INFO: renamed from: O */
    public VImage f1745O;

    /* JADX INFO: renamed from: O0 */
    public String f1746O0;

    /* JADX INFO: renamed from: P */
    public VImage f1747P;

    /* JADX INFO: renamed from: Q */
    public VText f1749Q;

    /* JADX INFO: renamed from: Q0 */
    public String f1750Q0;

    /* JADX INFO: renamed from: R */
    public VText f1751R;

    /* JADX INFO: renamed from: S */
    public ViewStub f1753S;

    /* JADX INFO: renamed from: T */
    public ViewStub f1755T;

    /* JADX INFO: renamed from: U */
    public RecyclerView f1757U;

    /* JADX INFO: renamed from: X */
    public a5m f1763X;

    /* JADX INFO: renamed from: Z */
    public LinearLayoutManager f1767Z;

    /* JADX INFO: renamed from: a1 */
    public wuh0 f1769a1;

    /* JADX INFO: renamed from: d1 */
    public int f1772d1;

    /* JADX INFO: renamed from: e1 */
    public final RecyclerView.t f1773e1;

    /* JADX INFO: renamed from: f1 */
    public boolean f1774f1;

    /* JADX INFO: renamed from: g1 */
    public final List<hn2<?>> f1775g1;

    /* JADX INFO: renamed from: h1 */
    public cqa0 f1776h1;

    /* JADX INFO: renamed from: i1 */
    public cme f1777i1;

    /* JADX INFO: renamed from: j1 */
    public fle f1778j1;

    /* JADX INFO: renamed from: k1 */
    public vme f1780k1;

    /* JADX INFO: renamed from: l1 */
    public ame f1781l1;

    /* JADX INFO: renamed from: m1 */
    public int f1782m1;

    /* JADX INFO: renamed from: n1 */
    public boolean f1783n1;

    /* JADX INFO: renamed from: o1 */
    public boolean f1784o1;

    /* JADX INFO: renamed from: p1 */
    public cwf0 f1786p1;

    /* JADX INFO: renamed from: q1 */
    public cwf0 f1787q1;

    /* JADX INFO: renamed from: z */
    public VLinear f1788z;

    /* JADX INFO: renamed from: V */
    @SuppressLint({"SV_USE_DUP_ID"})
    public tpd0 f1759V = new tpd0("show_pic_post_dialog_count_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: W */
    @SuppressLint({"SV_USE_DUP_ID"})
    public hpd0 f1761W = new hpd0("is_show_shimmer" + CoreModule.H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: Y */
    public final a<User> f1765Y = a.b();

    /* JADX INFO: renamed from: k0 */
    public boolean f1779k0 = false;

    /* JADX INFO: renamed from: p0 */
    public boolean f1785p0 = false;

    /* JADX INFO: renamed from: G0 */
    public final a<roj0> f1730G0 = a.b();

    /* JADX INFO: renamed from: J0 */
    public boolean f1736J0 = false;

    /* JADX INFO: renamed from: K0 */
    public HashMap<String, String> f1738K0 = new HashMap<>();

    /* JADX INFO: renamed from: M0 */
    public fj90 f1742M0 = new fj90(this, this);

    /* JADX INFO: renamed from: N0 */
    public mt90 f1744N0 = new mt90();

    /* JADX INFO: renamed from: P0 */
    public String f1748P0 = "";

    /* JADX INFO: renamed from: R0 */
    public boolean f1752R0 = false;

    /* JADX INFO: renamed from: S0 */
    public boolean f1754S0 = false;

    /* JADX INFO: renamed from: T0 */
    public final ArrayList<View> f1756T0 = new ArrayList<>();

    /* JADX INFO: renamed from: U0 */
    public final ArrayList<TextView> f1758U0 = new ArrayList<>();

    /* JADX INFO: renamed from: V0 */
    public final ArrayList<View> f1760V0 = new ArrayList<>();

    /* JADX INFO: renamed from: W0 */
    public final ArrayList<View> f1762W0 = new ArrayList<>();

    /* JADX INFO: renamed from: X0 */
    public int f1764X0 = 4;

    /* JADX INFO: renamed from: Y0 */
    public boolean f1766Y0 = false;

    /* JADX INFO: renamed from: Z0 */
    public final NewNewProfileCard.d f1768Z0 = new NewNewProfileCard.d() { // from class: l.f6a0
    };

    /* JADX INFO: renamed from: b1 */
    public final d30 f1770b1 = new C0150b();

    /* JADX INFO: renamed from: c1 */
    public final List<e30<a5m>> f1771c1 = new ArrayList();

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
    public class C0149a implements TabLayout.OnTabSelectedListener {
        public C0149a() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            if (!ProfileListFragLocalEditImpl.this.f1766Y0 && tab.getPosition() == 0) {
                ProfileListFragLocalEditImpl.this.m3166g9();
            }
            ProfileListFragLocalEditImpl.this.f1766Y0 = false;
            ProfileListFragLocalEditImpl profileListFragLocalEditImpl = ProfileListFragLocalEditImpl.this;
            profileListFragLocalEditImpl.m3177m9(profileListFragLocalEditImpl.f1723C.getSelectedTabPosition());
            if (ProfileListFragLocalEditImpl.this.f1723C.getSelectedTabPosition() == 0 && ProfileListFragLocalEditImpl.this.f1763X != null) {
                ProfileListFragLocalEditImpl.this.f1763X.s();
            }
            if (upa.w2() && tab.getPosition() == 0 && ProfileListFragLocalEditImpl.this.f1763X != null && !ProfileListFragLocalEditImpl.this.f1774f1) {
                ProfileListFragLocalEditImpl.this.m3131Q6();
            }
            if (upa.p2() && tab.getPosition() == 1) {
                ProfileListFragLocalEditImpl.this.m3158e7();
            }
        }

        public void onTabUnselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$b */
    public class C0150b implements d30 {
        public C0150b() {
        }

        public void call() {
            Intent intentM1177q2 = ProfileAct.m1177q2(ProfileListFragLocalEditImpl.this.getContext(), ((DbObject) ProfileListFragLocalEditImpl.this.m9268i2()).id, "preview_card", false, false, ProfileListFragLocalEditImpl.this.f1763X instanceof d5m ? ProfileListFragLocalEditImpl.this.f1763X.getShowPictureIndex() : -1);
            intentM1177q2.putExtra("preview_user_info", (Serializable) ProfileListFragLocalEditImpl.this.m9268i2());
            ProfileListFragLocalEditImpl.this.startActivity(intentM1177q2);
            ProfileListFragLocalEditImpl.this.act().overridePendingTransition(rzb0.y, 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$c */
    public class C0151c extends RecyclerView.t {
        public C0151c() {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            ProfileListFragLocalEditImpl.this.f1772d1 += i2;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$d */
    public class C0152d implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f1792a;

        public C0152d(int i) {
            this.f1792a = i;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            wn90.F().m.put(Integer.valueOf(this.f1792a));
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$e */
    public class C0153e implements e30<Boolean> {
        public C0153e() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Boolean bool) {
            ProfileListFragLocalEditImpl.this.m2871tc();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$f */
    public class C0154f implements w9j<Media, Boolean> {
        public C0154f() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Media media) {
            return ((media instanceof Picture) && TEnum.equals(media.status, "normal") && ((Picture) media).isAiFakePic()) ? Boolean.FALSE : Boolean.TRUE;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.imp.ProfileListFragLocalEditImpl$g */
    public class C0155g implements w9j<Media, Boolean> {
        public C0155g() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(Media media) {
            if ((media instanceof Picture) && TEnum.equals(media.status, "normal")) {
                Picture picture = (Picture) media;
                if (picture.isLow() || picture.isLabelJudge(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE")) || picture.isLabelJudge(MediaLabel.get("WITH_NET_MAIN_PICTURE"))) {
                    return Boolean.FALSE;
                }
            }
            return Boolean.TRUE;
        }
    }

    public ProfileListFragLocalEditImpl() {
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.g6a0
            public final void call(Object obj) {
                PerformanceLogUtil.logSingle(((c) obj).c);
            }
        }));
        this.f1772d1 = 0;
        this.f1773e1 = new C0151c();
        this.f1774f1 = false;
        this.f1775g1 = new ArrayList();
        this.f1782m1 = -1;
        this.f1783n1 = false;
        this.f1784o1 = false;
        creates(new e30() { // from class: l.h6a0
            public final void call(Object obj) {
                ProfileListFragLocalEditImpl.m2992O5((Bundle) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: A7 */
    public /* synthetic */ void m2960A7() {
        new dd80.a(act()).y0("温馨提示").t0("xxx").c0("更换照片", new Runnable() { // from class: l.z7a0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileListFragLocalEditImpl.m3086t6();
            }
        }).X("稍后再说", new Runnable() { // from class: l.b8a0
            @Override // java.lang.Runnable
            public final void run() {
                ProfileListFragLocalEditImpl.m3098y5();
            }
        }).o0(new DialogInterface.OnShowListener() { // from class: l.c8a0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                ProfileListFragLocalEditImpl.m3030a6(dialogInterface);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.d8a0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ProfileListFragLocalEditImpl.m3063l5(dialogInterface);
            }
        }).r0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B7 */
    public /* synthetic */ void m2963B7() {
        if (NullChecker.a(mo1517K2())) {
            DebugUtil.zk(mo1517K2(), act());
        }
    }

    /* JADX INFO: renamed from: E5 */
    public static /* synthetic */ void m2968E5() {
        try {
            ProfileListFrag.f1432I4 = (CategorySuggestions) CategorySuggestions.JSON_ADAPTER.parse(CoreModule.b.getResources().openRawResource(t7c0.a));
        } catch (IOException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: F8 */
    private void m2972F8() {
        xdl0.b0(this.f1727F, new v9j() { // from class: l.n5a0
            public final Object call() {
                return ProfileListFragLocalEditImpl.m3093w5();
            }
        });
    }

    /* JADX INFO: renamed from: G5 */
    public static /* synthetic */ void m2973G5(Throwable th) {
    }

    /* JADX INFO: renamed from: G8 */
    private rx.c<q860<CoreMomentInfo>> m2975G8() {
        String strUserId = CoreModule.H().userId();
        if (!TextUtils.equals(strUserId, CoreModule.H().userId())) {
            return CoreModule.N().personalMediaMomentsFeedPrevious(strUserId, false, CoreMomentInfo.JSON_ADAPTER).map(new w9j() { // from class: l.i7a0
                public final Object call(Object obj) {
                    return ProfileListFragLocalEditImpl.m3033b6((j760) obj);
                }
            });
        }
        CoreModule.N().personalMediaMomentsFeedPrevious(strUserId, false, CoreMomentInfo.JSON_ADAPTER);
        return CoreModule.N().di(CoreMomentInfo.JSON_ADAPTER).map(new w9j() { // from class: l.h7a0
            public final Object call(Object obj) {
                return ProfileListFragLocalEditImpl.m2990N5((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: J8 */
    private void m2982J8() {
        m3117I8(new C0153e());
    }

    /* JADX INFO: renamed from: K5 */
    public static /* synthetic */ void m2983K5(e30 e30Var) {
        if (e30Var != null) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: L8 */
    public static void m2987L8() {
        f1718r1.k();
        f1718r1.j();
    }

    /* JADX INFO: renamed from: M8 */
    public static void m2989M8(int i) {
        f1718r1.o(ic50.j().f().U("p_edit_profile_post_pic_popup", ygh0.m(new j760[]{vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("popup_times", Integer.valueOf(i))})));
        f1718r1.i();
        f1718r1.l();
    }

    /* JADX INFO: renamed from: N5 */
    public static /* synthetic */ q860 m2990N5(List list) {
        return new q860(list, (DbLinks) null);
    }

    /* JADX INFO: renamed from: O4 */
    public static /* synthetic */ ProfileEditInfo m2991O4(Throwable th) {
        return null;
    }

    /* JADX INFO: renamed from: O5 */
    public static /* synthetic */ void m2992O5(Bundle bundle) {
        if (f1720t1 == null) {
            e51.y(new Runnable() { // from class: l.s8a0
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListFragLocalEditImpl.m2998Q5();
                }
            });
        }
        CoreModule.c.d0.R.k().first().subscribe(mkd0.B());
    }

    @MainThread
    /* JADX INFO: renamed from: P6 */
    private void m2995P6() {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.AFTER_GET_USER_INFO;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        m2996P8();
        if (NullChecker.a(mo1506F1(false)) && this.f1754S0) {
            User user = wn90.F().a;
            if (!TEnum.equals(this.f1726E0.profile.zodiac, user.profile.zodiac)) {
                user.profile.zodiac = this.f1726E0.profile.zodiac;
            }
            wn90.F().a = this.f1726E0.clone();
            wn90.F().a.description = user.description;
            wn90.F().a.pictures = user.pictures;
            wn90.F().a.profile = user.profile;
            wn90.F().a.voice = user.voice;
            wn90.F().a.name = user.name;
            wn90.F().a.settings.birthdate = user.settings.birthdate;
            wn90.F().a.settings.getSettingGroup().privacy.hideSchool = user.settings.getSettingGroup().privacy.hideSchool;
            wn90.F().a.profile.extensions.physical.bloodType = this.f1726E0.profile.extensions.physical.bloodType;
            wn90.F().a.profile.extensions.interest.emoji = this.f1726E0.profile.extensions.interest.emoji;
            wn90.F().a.profile.extensions.basic.idealType = this.f1726E0.profile.extensions.basic.idealType;
            wn90.F().a.profile.extensions.basic.ideal = this.f1726E0.profile.extensions.basic.ideal;
        } else {
            this.f1754S0 = true;
            m3141W8();
            wn90.F().a = this.f1726E0.clone();
        }
        m3007S8(wn90.F().a);
        m3002R6();
        m3006S6();
        this.f1729G.setVisibility(4);
        this.f1757U.setVisibility(0);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        if (this.f1782m1 == -1) {
            this.f1782m1 = CoreModule.c.e0.p9().isVIP() ? 1 : 0;
        }
    }

    /* JADX INFO: renamed from: P8 */
    private void m2996P8() {
        this.f1744N0.m18160M(m3036c7(this.f1775g1));
        m3073o7();
    }

    /* JADX INFO: renamed from: Q5 */
    public static /* synthetic */ void m2998Q5() {
        try {
            f1720t1 = (CategorySuggestions) CategorySuggestions.JSON_ADAPTER.parse(CoreModule.b.getResources().openRawResource(t7c0.a));
        } catch (IOException e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: Q8 */
    private void m2999Q8(List<Media> list) {
        m3003R8(list, false);
    }

    /* JADX INFO: renamed from: R6 */
    private void m3002R6() {
        if ((!TextUtils.equals(this.f1750Q0, "from_card_upload_photo") && !TextUtils.equals(this.f1750Q0, "from_profile_upload_photo") && !TextUtils.equals(this.f1750Q0, "thin_popup")) || this.f1779k0) {
            if (this.f1779k0) {
                return;
            }
            this.f1779k0 = m3139W6();
            return;
        }
        byte b = 1;
        this.f1779k0 = true;
        if (!upa.u2()) {
            LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD;
            if (vwb.J(LoopFragmentFactory.m1987z(loopCreateEntryType, null, wn90.F().a))) {
                return;
            }
            LoopFragmentFactory.m1959U(wn90.F().a, this, null, loopCreateEntryType, this.f1750Q0);
            return;
        }
        LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType2 = LoopFragmentFactory.LoopCreateEntryType.ENTRY_CARD;
        if (vwb.J(LoopFragmentFactory.m1940B(loopCreateEntryType2, null, wn90.F().a, true, true, this.f1750Q0))) {
            return;
        }
        String str = this.f1750Q0;
        str.getClass();
        switch (str.hashCode()) {
            case -338162810:
                b = !str.equals("thin_popup") ? (byte) -1 : (byte) 0;
                break;
            case 182867647:
                if (!str.equals("from_profile_upload_photo")) {
                    b = -1;
                }
                break;
            case 1120730606:
                b = !str.equals("from_card_upload_photo") ? (byte) -1 : (byte) 2;
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
        LoopFragmentFactory.m1959U(wn90.F().a, this, null, loopCreateEntryType2, this.f1750Q0);
    }

    /* JADX INFO: renamed from: R8 */
    private void m3003R8(final List<Media> list, final boolean z) {
        if (lqa.a()) {
            this.f1778j1.mo14451a(new d30() { // from class: l.q5a0
                public final void call() {
                    this.f17815a.m3179n8(list, z);
                }
            });
        } else {
            this.f1777i1.mo14451a(new d30() { // from class: l.r5a0
                public final void call() {
                    this.f18368a.m3183p8(z, list);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S4 */
    public static /* synthetic */ void m3004S4(Throwable th) {
    }

    /* JADX INFO: renamed from: S6 */
    private void m3006S6() {
        if (!TextUtils.equals(this.f1738K0.get("action"), "signature") || this.f1779k0) {
            return;
        }
        this.f1779k0 = true;
        LoopFragmentFactory.m1957S(m9268i2(), mo1514J1(), LoopInputType.SIGNATURE);
    }

    /* JADX INFO: renamed from: S8 */
    private void m3007S8(User user) {
        m3011T8(user, false);
    }

    /* JADX INFO: renamed from: T6 */
    private boolean m3010T6() {
        if (upa.s1()) {
            List list = wn90.F().a.pictures;
            if (!vwb.J(list)) {
                Picture picture = (Media) list.get(0);
                if (picture instanceof Picture) {
                    return picture.isAiFakePic();
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: T8 */
    private void m3011T8(User user, boolean z) {
        m2996P8();
        m3003R8(user.pictures, z);
    }

    /* JADX INFO: renamed from: U5 */
    public static /* synthetic */ void m3013U5(int i, a5m a5mVar) {
        if (i == 1) {
            a5mVar.G();
        } else {
            a5mVar.s();
        }
    }

    /* JADX INFO: renamed from: U6 */
    private boolean m3014U6() {
        if (upa.G2() || upa.H2()) {
            List list = wn90.F().a.pictures;
            if (!vwb.J(list)) {
                Picture picture = (Media) list.get(0);
                if (picture instanceof Picture) {
                    return picture.isLabelJudge(MediaLabel.get("WITH_NET_MAIN_PICTURE"));
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: U8 */
    private void m3015U8(User user) {
        wn90.F().a = user;
        m2995P6();
    }

    /* JADX INFO: renamed from: V4 */
    public static /* synthetic */ void m3016V4(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: V6 */
    private boolean m3018V6() {
        if (upa.G2() || upa.H2()) {
            List list = wn90.F().a.pictures;
            if (!vwb.J(list)) {
                Picture picture = (Media) list.get(0);
                if (picture instanceof Picture) {
                    return picture.isLabelJudge(MediaLabel.get("WITH_REPEAT_MAIN_PICTURE"));
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: W4 */
    public static /* synthetic */ void m3019W4(a5m a5mVar, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) a5mVar.getCardView().getLayoutParams();
        int i = t100.m;
        marginLayoutParams.topMargin = i;
        int i2 = t100.h;
        marginLayoutParams.rightMargin = i2;
        marginLayoutParams.leftMargin = i2;
        marginLayoutParams.bottomMargin = i;
        a5mVar.getCardView().requestLayout();
    }

    /* JADX INFO: renamed from: Z6 */
    private User m3027Z6() {
        User userClone = this.f1726E0.clone();
        if (this.f1776h1.m11332V()) {
            userClone.profile.extensions.momentSwitch.noSyncMoment.clear();
            userClone.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f1776h1.m11331U() ? "false" : "true");
        }
        return userClone.subtract(this.f1726E0);
    }

    /* JADX INFO: renamed from: Z8 */
    private void m3028Z8(User user) {
        this.f1728F0 = user;
    }

    /* JADX INFO: renamed from: a6 */
    public static /* synthetic */ void m3030a6(DialogInterface dialogInterface) {
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: a7 */
    private void m3031a7() {
        this.f1757U.setFocusableInTouchMode(true);
        this.f1757U.setDescendantFocusability(131072);
        this.f1757U.setFocusable(true);
    }

    /* JADX INFO: renamed from: b5 */
    public static /* synthetic */ void m3032b5(Throwable th) {
    }

    /* JADX INFO: renamed from: b6 */
    public static /* synthetic */ q860 m3033b6(j760 j760Var) {
        return new q860((List) j760Var.b, (DbLinks) null);
    }

    /* JADX INFO: renamed from: c7 */
    private List<hn2<?>> m3036c7(List<hn2<?>> list) {
        ArrayList arrayList = new ArrayList();
        for (hn2<?> hn2Var : list) {
            if (hn2Var.mo3280l()) {
                arrayList.add(hn2Var);
                if (hn2Var.mo2919k()) {
                    fj90 fj90Var = new fj90(this, this);
                    if (hn2Var.mo11100d() != 0) {
                        fj90Var.m14464v(hn2Var.mo11100d());
                    }
                    arrayList.add(fj90Var);
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c9 */
    private void m3037c9(User user) {
        User userRiskAuditUser;
        if (user == null) {
            userRiskAuditUser = null;
        } else {
            userRiskAuditUser = user.riskAuditUser(CoreModule.K().getUserById("fake_risk_audit_default_" + this.f1746O0));
        }
        this.f1726E0 = userRiskAuditUser;
    }

    /* JADX INFO: renamed from: d7 */
    private List<Media> m3040d7() {
        if (lqa.a()) {
            return this.f1778j1.m13292T();
        }
        ArrayList arrayList = new ArrayList();
        MediaReorderCards mediaReorderCards = this.f1777i1.f8746v;
        if (NullChecker.a(mediaReorderCards)) {
            for (int i = 0; i < mediaReorderCards.getChildCount(); i++) {
                if (mediaReorderCards.m1257h(i).getAddPhotos().size() > 0) {
                    arrayList.addAll(mediaReorderCards.m1257h(i).getAddPhotos());
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e9 */
    private void m3043e9(final boolean z) {
        if (this.f1786p1 == null) {
            this.f1786p1 = new cwf0("p_lowqualityphoto_save_popup", Dialog.class.getName());
        }
        new xh0.a(act()).s("检测到不符合要求的照片").g(false).j("若继续保存，不符合要求的照片(重复图、网图、五官不清晰或有遮挡的照片等）将被删除").r("保存其他资料").o(new View.OnClickListener() { // from class: l.y5a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22664a.m3190v8(view);
            }
        }).f(z ? "不保存" : "继续编辑").c(new View.OnClickListener() { // from class: l.z5a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23255a.m3191w8(z, view);
            }
        }).n(new DialogInterface.OnShowListener() { // from class: l.a6a0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f7417a.m3187t8(dialogInterface);
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.b6a0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f8004a.m3189u8(dialogInterface);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: g7 */
    public static void m3048g7(CoreSuggested.UserInfo userInfo) {
        if (!NullChecker.a(userInfo.myTabTask) || TextUtils.isEmpty(userInfo.myTabTask.title)) {
            return;
        }
        MyTabTask myTabTask = userInfo.myTabTask;
        if (TextUtils.equals(myTabTask.type, "mbti")) {
            User user = wn90.F().a;
            if (NullChecker.a(user) && wn90.Q(user)) {
                userInfo.myTabTask = null;
                return;
            }
            return;
        }
        if (TextUtils.equals(myTabTask.type, "game")) {
            User user2 = wn90.F().a;
            if (!NullChecker.a(user2) || !NullChecker.a(user2.profile) || !NullChecker.a(user2.profile.extensions) || !NullChecker.a(user2.profile.extensions.game) || vwb.J(user2.profile.extensions.game.name) || vwb.J(user2.profile.extensions.game.together) || TextUtils.isEmpty((CharSequence) user2.profile.extensions.game.name.get(0)) || TextUtils.isEmpty((CharSequence) user2.profile.extensions.game.together.get(0))) {
                return;
            }
            userInfo.myTabTask = null;
        }
    }

    /* JADX INFO: renamed from: h7 */
    private void m3051h7(String str) {
        str.getClass();
        switch (str) {
            case "school":
                LoopFragmentFactory.m1957S(m9268i2(), mo1514J1(), LoopInputType.SCHOOL);
                break;
            case "photo":
                LoopFragmentFactory.m1957S(m9268i2(), mo1514J1(), LoopInputType.PHOTO);
                break;
            case "industry":
                LoopFragmentFactory.m1957S(m9268i2(), mo1514J1(), LoopInputType.INDUSTRY);
                break;
            case "company":
                LoopFragmentFactory.m1957S(m9268i2(), mo1514J1(), LoopInputType.COMPANY);
                break;
            case "about_me":
                LoopFragmentFactory.m1957S(m9268i2(), mo1514J1(), LoopInputType.ABOUT_ME);
                break;
        }
    }

    /* JADX INFO: renamed from: h9 */
    private void m3052h9(final boolean z) {
        if (this.f1787q1 == null) {
            this.f1787q1 = new cwf0("p_lowqualityphoto_save_popup", Dialog.class.getName());
        }
        new xh0.a(act()).s("检测到不符合要求的照片").g(false).j("若继续保存，不符合要求的照片(重复图、网图、五官不清晰的照片等）将被删除").r("保存其他资料").o(new View.OnClickListener() { // from class: l.t5a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19421a.m3195y8(view);
            }
        }).f(z ? "不保存" : "继续编辑").c(new View.OnClickListener() { // from class: l.u5a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20494a.m3196z8(z, view);
            }
        }).n(new DialogInterface.OnShowListener() { // from class: l.v5a0
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f20977a.m3103A8(dialogInterface);
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.w5a0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f21464a.m3104B8(dialogInterface);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: i7 */
    private void m3055i7(User user) {
        User user2;
        if (user == null || (user2 = this.f1726E0) == null) {
            return;
        }
        user.profile.moments = user2.profile.moments;
    }

    /* JADX INFO: renamed from: i9 */
    private void m3056i9() {
        new xh0.a(act()).s(act().getString(R.string.Fk)).g(false).j(act().getString(R.string.Dk)).r(act().getString(R.string.Ek)).o(new View.OnClickListener() { // from class: l.i6a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13078a.m3107C8(view);
            }
        }).f(act().getString(R.string.Ck)).c(new View.OnClickListener() { // from class: l.t6a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19454a.m3109D8(view);
            }
        }).a().g();
    }

    private void initState() {
        if (upa.p2()) {
            User userP9 = CoreModule.c.e0.p9();
            if (!NullChecker.a(userP9) || (!TextUtils.isEmpty(userP9.description) && userP9.pictures.size() >= 3)) {
                CoreModule.c.e0.Y6 = false;
                return;
            }
            pib pibVar = CoreModule.c.e0;
            pibVar.Y6 = true;
            pibVar.Z6 = false;
            pibVar.a7 = false;
        }
    }

    /* JADX INFO: renamed from: j9 */
    private void m3059j9(int i) {
        if (i > 0) {
            m3163f9(i);
        } else {
            m2982J8();
        }
    }

    /* JADX INFO: renamed from: k6 */
    public static /* synthetic */ void m3061k6(Throwable th) {
    }

    /* JADX INFO: renamed from: k7 */
    private void m3062k7() {
        if (TextUtils.equals(this.f1750Q0, "from_auto_scroll_to_question") || TextUtils.equals(this.f1750Q0, "p_tantanx_card")) {
            e51.I(this, new Runnable() { // from class: l.x5a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22123a.m3113G7();
                }
            }, 500L);
        }
    }

    /* JADX INFO: renamed from: l5 */
    public static /* synthetic */ void m3063l5(DialogInterface dialogInterface) {
    }

    /* JADX INFO: renamed from: l9 */
    private void m3065l9(int i, String str, MediaReorderCards mediaReorderCards) {
        if (i == mediaReorderCards.getChildCount()) {
            mediaReorderCards.m1257h(mediaReorderCards.getChildCount() - 1).m1108S1(null);
            return;
        }
        mediaReorderCards.m1257h(i).m1108S1(str);
        if (i < mediaReorderCards.getChildCount() - 1) {
            mediaReorderCards.m1257h(i + 1).m1108S1(null);
        }
        if (i > 0) {
            mediaReorderCards.m1257h(i - 1).m1108S1(null);
        }
    }

    /* JADX INFO: renamed from: n7 */
    private void m3070n7() {
        ine ineVar = new ine(this, this);
        this.f1775g1.addAll(ineVar.m19694c());
        this.f1776h1 = (cqa0) ineVar.m19695d(cqa0.class);
        if (lqa.a()) {
            this.f1778j1 = (fle) ineVar.m19695d(fle.class);
        } else {
            this.f1777i1 = (cme) ineVar.m19695d(cme.class);
        }
        this.f1780k1 = (vme) ineVar.m19695d(vme.class);
        this.f1781l1 = (ame) ineVar.m19695d(ame.class);
    }

    /* JADX INFO: renamed from: o5 */
    public static /* synthetic */ knb0 m3071o5(User user, User user2, q860 q860Var, MyTabTask myTabTask) {
        return new knb0(user, user2, q860Var, myTabTask);
    }

    /* JADX INFO: renamed from: o6 */
    public static /* synthetic */ void m3072o6(Throwable th) {
    }

    /* JADX INFO: renamed from: o7 */
    private void m3073o7() {
        if (CoreModule.c.e0.na().status.contains(UserStatus.get("audit")) || CertificationUtil.l() || !jjb0.b()) {
            PicCertGuideView picCertGuideView = this.f1740L0;
            if (picCertGuideView != null) {
                xdl0.M(picCertGuideView, false);
                return;
            }
            return;
        }
        if (xdl0.O0(this.f1755T)) {
            return;
        }
        if (this.f1740L0 == null) {
            PicCertGuideView picCertGuideViewInflate = this.f1753S.inflate();
            this.f1740L0 = picCertGuideViewInflate;
            picCertGuideViewInflate.k0(act(), "完成头像认证，你的卡片将被优先推荐", "去认证", "e_edit_profile_view_edit_verification", "p_edit_profile_view", (String) null, (Runnable) null);
            if (this.f1723C.getSelectedTabPosition() == 0) {
                this.f1740L0.l0();
            }
            duringCreated(CoreModule.c.B0.j4().filter(new w9j() { // from class: l.o5a0
                public final Object call(Object obj) {
                    VerificationCenter verificationCenter = (VerificationCenter) obj;
                    return Boolean.valueOf(NullChecker.a(verificationCenter) && NullChecker.a(verificationCenter.picVerificationInfo));
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.p5a0
                public final void call(Object obj) {
                    this.f17010a.m3123M7((VerificationCenter) obj);
                }
            }));
        }
        xdl0.M(this.f1740L0, true);
        xdl0.M(this.f1735J, false);
        xdl0.M(this.f1737K, false);
        xdl0.M(this.f1739L, false);
        xdl0.M(this.f1733I, true);
    }

    /* JADX INFO: renamed from: q7 */
    private void m3078q7() {
        this.f1767Z = new SmoothScrollLinearLayoutManager(getContext());
        this.f1757U.setItemAnimator((RecyclerView.l) null);
        this.f1757U.setLayoutManager(this.f1767Z);
        this.f1757U.setAdapter(this.f1744N0);
        this.f1757U.addOnScrollListener(this.f1773e1);
    }

    /* JADX INFO: renamed from: r7 */
    private void m3081r7() {
        gd70.m13725b().m13728e(Boolean.FALSE);
        xdl0.M(this.f1721A, true);
        View viewInflate = act().inflater().inflate(f6c0.B9, (ViewGroup) null);
        VButton vButtonFindViewById = viewInflate.findViewById(u4c0.m4);
        xdl0.W(vButtonFindViewById, t100.e);
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.c6a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8497a.m3134S7(view);
            }
        };
        View.OnClickListener onClickListener2 = new View.OnClickListener() { // from class: l.d6a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9073a.m3135T7(view);
            }
        };
        xdl0.E0(vButtonFindViewById, onClickListener);
        this.f1721A.setLeftIconOnClick(onClickListener2);
        this.f1721A.z(new View[]{viewInflate});
        this.f1721A.setLeftIconOnClick(new View.OnClickListener() { // from class: l.e6a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9591a.m3136U7(view);
            }
        });
    }

    /* JADX INFO: renamed from: s5 */
    public static /* synthetic */ void m3082s5(Throwable th) {
    }

    /* JADX INFO: renamed from: s7 */
    private void m3084s7() {
        duringCreated(CoreModule.c.e0.o9()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.s5a0
            public final void call(Object obj) {
                this.f18799a.m3137V7((User) obj);
            }
        }));
        if (!upa.Y1() || TextUtils.equals(this.f1750Q0, "from_ideal_type_mine_tab_guide") || TextUtils.equals(this.f1750Q0, "from_ideal_type_profile_item")) {
            return;
        }
        TextUtils.equals(this.f1750Q0, "from_ideal_type_other_profile");
    }

    /* JADX INFO: renamed from: t6 */
    public static /* synthetic */ void m3086t6() {
    }

    /* JADX INFO: renamed from: t7 */
    private void m3087t7() {
        if (CoreModule.c.e0.i8() && !CoreModule.c.e0.p9().isAudit()) {
            duringCreated(CoreModule.c.e0.xa().filter(new w9j() { // from class: l.n8a0
                public final Object call(Object obj) {
                    FakeGuideData fakeGuideData = (FakeGuideData) obj;
                    return Boolean.valueOf(NullChecker.a(fakeGuideData) && fakeGuideData.changeAvatar && "mainAvatar".equals(fakeGuideData.type));
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.o8a0
                public final void call(Object obj) {
                    this.f16426a.m3140W7((FakeGuideData) obj);
                }
            }, new e30() { // from class: l.p8a0
                public final void call(Object obj) {
                    ProfileListFragLocalEditImpl.m3032b5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: v7 */
    private void m3092v7() {
        m3031a7();
        this.f1757U.setBackgroundColor(Color.parseColor("#ffffff"));
    }

    /* JADX INFO: renamed from: w5 */
    public static /* synthetic */ Boolean m3093w5() {
        PerformanceLogUtil.logEnd(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        PerformanceLogUtil.instance().endTrance();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: w7 */
    private boolean m3095w7() {
        if (lqa.a()) {
            return this.f1778j1.m13293U();
        }
        MediaReorderCards mediaReorderCards = this.f1777i1.f8746v;
        if (NullChecker.a(mediaReorderCards)) {
            for (int i = 0; i < mediaReorderCards.getChildCount(); i++) {
                if (mediaReorderCards.m1257h(i).m1091K0()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: y5 */
    public static /* synthetic */ void m3098y5() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: z7 */
    public /* synthetic */ void m3102z7() {
        b4().F(this.f1746O0).z0();
    }

    /* JADX INFO: renamed from: A8 */
    public final /* synthetic */ void m3103A8(DialogInterface dialogInterface) {
        this.f1787q1.i();
        this.f1787q1.l();
    }

    /* JADX INFO: renamed from: B8 */
    public final /* synthetic */ void m3104B8(DialogInterface dialogInterface) {
        this.f1787q1.k();
        this.f1787q1.j();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: C2 */
    public CategorySuggestions mo1498C2() {
        return f1720t1;
    }

    /* JADX INFO: renamed from: C7 */
    public final /* synthetic */ void m3106C7(Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals("右滑无配对引导")) {
            DatingGuideData datingGuideDataNew_ = DatingGuideData.new_();
            datingGuideDataNew_.titles.add(String.format(Locale.getDefault(), "刚刚看过的%d个%s更想了解你的兴趣爱好", Integer.valueOf(CoreModule.c.m0.y0), CoreModule.c.e0.p9().isFemale() ? "男生" : "女生"));
            datingGuideDataNew_.subTitles.add("添加生活照展示你的兴趣爱好，更容易配对");
            datingGuideDataNew_.button = "立即添加";
            datingGuideDataNew_.pageId = "p_add_lifestyle_guidance";
            datingGuideDataNew_.deeplink = "tantan://profile/edit?mode=guidePicAndTag&from=right_swipe_add_lifestyle";
            datingGuideDataNew_.pictures.add(CoreModule.c.e0.p9().isFemale() ? "https://auto.tancdn.com/v1/raw/8da6f26f-c9b6-440e-9bbc-57f1a124a66f14.webp" : "https://auto.tancdn.com/v1/raw/484a6490-eca3-4af1-bf18-0b43971e70c114.webp");
            datingGuideDataNew_.buttonId = "e_add_lifestyle";
            new v7c.b(act()).c(datingGuideDataNew_).b("right_swipe_no_match").a().show();
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
            datingGuideDataNew_5.pageId = "p_add_lifestyle_guidance";
            datingGuideDataNew_5.deeplink = "tantan://profile/edit?mode=guidePicAndTag&from=right_swipe_add_lifestyle";
            datingGuideDataNew_5.pictures.add("https://auto.tancdn.com/v1/raw/c9488f16-cae9-48fa-9558-4e8e5f0552dd14.webp");
            new v7c.b(act()).c(datingGuideDataNew_5).a().show();
        }
    }

    /* JADX INFO: renamed from: C8 */
    public final /* synthetic */ void m3107C8(View view) {
        m2982J8();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: D2 */
    public boolean mo1501D2() {
        return true;
    }

    /* JADX INFO: renamed from: D7 */
    public final /* synthetic */ void m3108D7() {
        b4().f0(new String[]{"右滑无配对引导", "连续左滑引导", "老用户引导给照片加标签", "老用户引导给旧标签配图", "收到喜欢很少引导上传生活照"}).g0(new Dialog.g() { // from class: l.g8a0
            /* JADX INFO: renamed from: a */
            public final void m13651a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f11306a.m3106C7(dialog, view, i, charSequence);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: D8 */
    public final /* synthetic */ void m3109D8(View view) {
        m2871tc();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: E */
    public void mo1504E() {
    }

    /* JADX INFO: renamed from: E7 */
    public final /* synthetic */ void m3110E7(PicCertGuideView picCertGuideView, VerificationCenter verificationCenter) {
        if (TEnum.equals(verificationCenter.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenter.picVerificationInfo.status, "pending")) {
            if (NullChecker.a(picCertGuideView)) {
                xdl0.M(picCertGuideView, false);
            }
            mo1504E();
        }
    }

    /* JADX INFO: renamed from: E8 */
    public final /* synthetic */ void m3111E8(int i, Media media) {
        VReorderCard vReorderCardM3151b7 = m3151b7(i);
        if (vReorderCardM3151b7 instanceof MediaReorderCard) {
            MediaReorderCard mediaReorderCard = (MediaReorderCard) vReorderCardM3151b7;
            if (media instanceof Video) {
                mediaReorderCard.m1150z1((Video) media);
            } else {
                mediaReorderCard.m1144w1((Picture) media);
            }
            mo1540Z2();
            if (upa.u2()) {
                for (int i2 = 0; i2 < this.f1777i1.f8746v.getChildCount(); i2++) {
                    mediaReorderCard.m1080E1(i2, "p_edit_profile_view");
                }
            }
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: F1 */
    public User mo1506F1(boolean z) {
        if (!NullChecker.a(wn90.F().a)) {
            if (z) {
                CrashHelper.c(new NullPointerException("ProfileListFrag editingUser is null when refresh"));
            }
            wn90.F().a = CoreModule.c.e0.p9().clone();
        }
        return wn90.F().a;
    }

    /* JADX INFO: renamed from: F7 */
    public final /* synthetic */ void m3112F7(View view, PicCertGuideView picCertGuideView, User user) {
        if (user.status.contains(UserStatus.get("audit"))) {
            xdl0.M(view, true);
            xdl0.M(picCertGuideView, false);
        } else if (!jjb0.b() || CertificationUtil.l()) {
            xdl0.M(view, false);
            xdl0.M(picCertGuideView, false);
        } else {
            picCertGuideView.k0(act(), "完成头像认证，你的卡片将被优先推荐", "去认证", "e_edit_profile_view_preview_verification", "p_edit_profile_view", (String) null, (Runnable) null);
            xdl0.M(view, false);
            xdl0.M(picCertGuideView, true);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: G */
    public void mo1508G(View... viewArr) {
        for (View view : viewArr) {
            xdl0.E0(view, m2939N4(this.f1726E0));
        }
    }

    /* JADX INFO: renamed from: G7 */
    public final /* synthetic */ void m3113G7() {
        int iM18155H;
        if (this.f1744N0 == null) {
            return;
        }
        if (TextUtils.equals(this.f1750Q0, "from_auto_scroll_to_question")) {
            iM18155H = this.f1744N0.m18158K();
        } else {
            iM18155H = TextUtils.equals(this.f1750Q0, "p_tantanx_card") ? this.f1744N0.m18155H() : -1;
        }
        if (iM18155H < 0 || iM18155H >= this.f1744N0.m18152C()) {
            return;
        }
        this.f1757U.scrollToPosition(iM18155H);
        if (NullChecker.a(this.f1767Z)) {
            this.f1767Z.scrollToPositionWithOffset(iM18155H, 0);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: H3 */
    public j760<List<Literatures>, List<LiteraturesComments>> mo1510H3() {
        return this.f1732H0;
    }

    /* JADX INFO: renamed from: H7 */
    public final /* synthetic */ void m3114H7(Boolean bool) {
        ft4.b().j(bool.booleanValue());
        mo1575o();
    }

    /* JADX INFO: renamed from: H8 */
    public void m3115H8(final List<Media> list, int i) {
        if (i == 15) {
            this.f1781l1.m14452b(new d30() { // from class: l.f9a0
                public final void call() {
                    this.f10195a.m3167h8(list);
                }
            });
        }
    }

    /* JADX INFO: renamed from: I7 */
    public final /* synthetic */ void m3116I7(roj0 roj0Var) {
        m2995P6();
    }

    /* JADX INFO: renamed from: I8 */
    public final void m3117I8(final e30<Boolean> e30Var) {
        if (this.f1776h1.m11332V()) {
            wn90.F().a.profile.extensions.momentSwitch.noSyncMoment.clear();
            wn90.F().a.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f1776h1.m11331U() ? "false" : "true");
        }
        if (vwb.J(wn90.F().a.pictures)) {
            b4().F("你的个人资料页需要至少一张照片").t0(R.string.Q, new Runnable() { // from class: l.h8a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11939a.m2871tc();
                }
            }).k0(R.string.c).z0();
            return;
        }
        final User userM3145Y6 = m3145Y6();
        User userM3027Z6 = m3027Z6();
        boolean z = true;
        if (NullChecker.a(userM3145Y6) && NullChecker.a(userM3027Z6) && userM3145Y6.equals(userM3027Z6)) {
            this.f1784o1 = true;
        }
        final User userClone = wn90.F().a.clone();
        final User userClone2 = this.f1726E0.clone();
        ArrayList<String> arrayList = new ArrayList();
        if (NullChecker.a(userM3145Y6) && NullChecker.a(userM3145Y6.profile) && NullChecker.a(userM3145Y6.profile.extensions) && NullChecker.a(userM3145Y6.profile.extensions.basic) && !TextUtils.isEmpty(userM3145Y6.description)) {
            arrayList.add("about_me");
        }
        StringBuilder sb = new StringBuilder();
        for (String str : arrayList) {
            if (!z) {
                sb.append(",");
            }
            sb.append(str);
            z = false;
        }
        o6j0.c("e_profile_save_button", pageId(), new o6j0.a[]{o6j0.a.h("edit_profile_content_modified", sb.toString())});
        if (!NullChecker.a(userM3145Y6)) {
            if (e30Var != null) {
                e30Var.call(Boolean.FALSE);
                return;
            }
            return;
        }
        o4(R.string.J5);
        ProfileEditInfo profileEditInfoNew_ = ProfileEditInfo.new_();
        profileEditInfoNew_.user = userClone;
        if (NullChecker.a(userM3145Y6.profile) && NullChecker.a(userM3145Y6.profile.extensions)) {
            userM3145Y6.profile.extensions.voiceSignature = null;
        }
        final boolean zEquals = (upa.e2() && NullChecker.a(userM3145Y6) && NullChecker.a(userM3145Y6.profile) && NullChecker.a(userM3145Y6.profile.extensions) && NullChecker.a(userM3145Y6.profile.extensions.basic) && !vwb.J(userM3145Y6.profile.extensions.basic.friendPurpose)) ? TEnum.equals((Purpose) userM3145Y6.profile.extensions.basic.friendPurpose.get(0), "marriage") : false;
        duringCreated(CoreModule.c.B0.t4(profileEditInfoNew_).onErrorReturn(new w9j() { // from class: l.i8a0
            public final Object call(Object obj) {
                return ProfileListFragLocalEditImpl.m2991O4((Throwable) obj);
            }
        }).flatMap(new w9j() { // from class: l.j8a0
            public final Object call(Object obj) {
                return this.f13635a.m3168i8(userM3145Y6, (ProfileEditInfo) obj);
            }
        })).subscribe(mkd0.K(new e30() { // from class: l.k8a0
            public final void call(Object obj) {
                this.f14239a.m3170j8(zEquals, userClone, userClone2, e30Var, userM3145Y6, (roj0) obj);
            }
        }, new e30() { // from class: l.m8a0
            public final void call(Object obj) {
                this.f15272a.m3171k8(userClone2, userM3145Y6, e30Var, (Throwable) obj);
            }
        }, false));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: J1 */
    public PutongFrag mo1514J1() {
        return this;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: J3 */
    public void mo1515J3() {
        if (this.f1728F0 == null || this.f1726E0 == null) {
            return;
        }
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "reRenderPage!!!");
        this.f1730G0.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: J7 */
    public final /* synthetic */ void m3118J7(c cVar) {
        if (cVar == c.i && this.f1726E0 == null) {
            this.f1757U.setVisibility(4);
            this.f1729G.setVisibility(0);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.c5m
    /* JADX INFO: renamed from: K2 */
    public User mo1517K2() {
        if (this.f1726E0 == null && !mo2659N2()) {
            m3037c9(CoreModule.K().getUserById(this.f1746O0));
        }
        return this.f1726E0;
    }

    /* JADX INFO: renamed from: K7 */
    public final /* synthetic */ Boolean m3119K7() {
        if (this.f1752R0) {
            act().m1203X2(0);
            this.f1752R0 = false;
        }
        if (!TextUtils.isEmpty(this.f1748P0)) {
            m3051h7(this.f1748P0);
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: K8 */
    public void m3120K8() {
        if (isDetached()) {
            act().finish();
            return;
        }
        int iM3129O8 = m3129O8();
        if (m3010T6()) {
            m3043e9(true);
            return;
        }
        if (m3018V6()) {
            m3052h9(true);
            return;
        }
        if (m3014U6()) {
            m3052h9(true);
            return;
        }
        if (iM3129O8 > 0) {
            m3163f9(iM3129O8);
        } else if (NullChecker.a(m3145Y6())) {
            m3056i9();
        } else {
            m2871tc();
        }
    }

    /* JADX INFO: renamed from: L7 */
    public final /* synthetic */ void m3121L7(Bundle bundle) {
        act().setTitle(x4(R.string.vj));
        if (CoreModule.K().me_().isBanned()) {
            JailedDialogLikeAct.o2(true);
        }
        CoreModule.c.e0.u0.put(Boolean.FALSE);
        if (NullChecker.a(bundle)) {
            m3037c9(CoreModule.K().me_());
            if (NullChecker.a(m9268i2())) {
                m3007S8(wn90.F().a);
                mo1515J3();
            }
        }
        xdl0.b0(act().findViewById(android.R.id.content), new v9j() { // from class: l.g7a0
            public final Object call() {
                return this.f11293a.m3119K7();
            }
        });
    }

    /* JADX INFO: renamed from: M6 */
    public View m3122M6(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g9a0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: M7 */
    public final /* synthetic */ void m3123M7(VerificationCenter verificationCenter) {
        if (TEnum.equals(verificationCenter.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenter.picVerificationInfo.status, "pending")) {
            if (NullChecker.a(this.f1740L0)) {
                xdl0.M(this.f1740L0, false);
            }
            m3175m7();
        }
    }

    /* JADX INFO: renamed from: N6 */
    public void m3124N6(e30<a5m> e30Var) {
        a5m a5mVar = this.f1763X;
        if (a5mVar == null) {
            this.f1771c1.add(e30Var);
        } else {
            e30Var.call(a5mVar);
        }
    }

    /* JADX INFO: renamed from: N7 */
    public final /* synthetic */ void m3125N7(View view, int i, ViewGroup viewGroup) {
        this.f1763X = (a5m) view;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        if (NullChecker.a(getContext())) {
            this.f1724D.addView(m3161f7(view), layoutParams);
        }
        if (view instanceof UserProfileExpandedCard) {
            UserProfileExpandedCard userProfileExpandedCard = this.f1763X;
            int i2 = t100.h;
            userProfileExpandedCard.b1(i2, t100.m, i2, t100.d(68.0f));
        } else if (view instanceof d5m) {
            m3144X8();
            this.f1763X.S(this.f1770b1);
        }
        Iterator<e30<a5m>> it = this.f1771c1.iterator();
        while (it.hasNext()) {
            it.next().call(this.f1763X);
        }
        this.f1771c1.clear();
    }

    /* JADX INFO: renamed from: N8 */
    public final void m3126N8(final int i) {
        int i2 = this.f1764X0;
        if (i2 < 3) {
            this.f1764X0 = i2 + 1;
        } else {
            o6j0.c("e_edit_profile_tab", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("edit_profile_tab", i == 0 ? "edit" : i == 1 ? "preview" : "example")});
        }
        if (this.f1758U0.size() != 0) {
            if (i != 0 && NullChecker.a(wn90.F().a)) {
                mo1540Z2();
            }
            if (i != 0) {
                act().hideInput();
            }
            m3124N6(new e30() { // from class: l.y7a0
                public final void call(Object obj) {
                    ProfileListFragLocalEditImpl.m3013U5(i, (a5m) obj);
                }
            });
            if (i == 2 && ((Boolean) CoreModule.c.e0.c1.get()).booleanValue()) {
                CoreModule.c.e0.c1.put(Boolean.FALSE);
                this.f1762W0.get(2).setVisibility(8);
            }
            if (i == 1) {
                mo1504E();
                m3144X8();
            } else if (i == 0 && NullChecker.a(this.f1726E0)) {
                mo1504E();
                m3015U8(wn90.F().a);
            }
            for (int i3 = 0; i3 < this.f1758U0.size(); i3++) {
                ArrayList<TextView> arrayList = this.f1758U0;
                if (i3 == i) {
                    arrayList.get(i3).setTextColor(act().color(w0c0.I));
                    xdl0.M0(this.f1760V0.get(i3), true);
                } else {
                    arrayList.get(i3).setTextColor(act().color(w0c0.j0));
                    xdl0.M0(this.f1760V0.get(i3), false);
                }
            }
            m3138V8(i);
        }
    }

    /* JADX INFO: renamed from: O6 */
    public final void m3127O6(int i, boolean z, String str, boolean z2) {
        View viewA = asm.a(act(), f6c0.Ma, (ViewGroup) null);
        TextView textView = (TextView) viewA.findViewById(u4c0.Cd);
        textView.setText(str);
        View viewFindViewById = viewA.findViewById(u4c0.Ed);
        xdl0.M0(viewA.findViewById(u4c0.Cb), z2);
        this.f1758U0.add(textView);
        this.f1760V0.add(viewFindViewById);
        this.f1762W0.add(viewA.findViewById(u4c0.e3));
        this.f1723C.setClipChildren(false);
        TabLayout tabLayout = this.f1723C;
        tabLayout.addTab(tabLayout.newTab().setCustomView(viewA), i, z);
    }

    /* JADX INFO: renamed from: O7 */
    public final /* synthetic */ void m3128O7() {
        this.f1776h1.m11335Z(true);
        mo1575o();
        o6j0.c("e_edit_profile_post_pic_popup_confirm", "p_edit_profile_post_pic_popup", new o6j0.a[0]);
        m2987L8();
    }

    /* JADX INFO: renamed from: O8 */
    public int m3129O8() {
        int i = 0;
        if (lqa.a()) {
            AvatarCards avatarCards = this.f1778j1.f10457u;
            if (!NullChecker.a(avatarCards)) {
                return 0;
            }
            int i2 = 0;
            while (i < avatarCards.getChildCount() && !avatarCards.m1257h(i).m1240n()) {
                if (!TEnum.equals(avatarCards.m1257h(i).getMedia().status, "normal")) {
                    i2++;
                }
                i++;
            }
            return i2;
        }
        MediaReorderCards mediaReorderCards = this.f1777i1.f8746v;
        if (!NullChecker.a(mediaReorderCards)) {
            return 0;
        }
        int i3 = 0;
        while (i < mediaReorderCards.getChildCount() && !mediaReorderCards.m1257h(i).m1240n()) {
            if (!TEnum.equals(mediaReorderCards.m1257h(i).f798N.status, "normal")) {
                i3++;
            }
            i++;
        }
        return i3;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: P1 */
    public boolean mo1523P1() {
        return true;
    }

    /* JADX INFO: renamed from: P7 */
    public final /* synthetic */ void m3130P7() {
        this.f1776h1.m11335Z(false);
        m2987L8();
        mo1575o();
    }

    /* JADX INFO: renamed from: Q6 */
    public void m3131Q6() {
        cme cmeVar;
        if (lqa.a() || (cmeVar = this.f1777i1) == null) {
            return;
        }
        this.f1774f1 = true;
        cmeVar.mo14451a(new d30() { // from class: l.u8a0
            public final void call() {
                this.f20536a.m3194y7();
            }
        });
    }

    /* JADX INFO: renamed from: Q7 */
    public final /* synthetic */ void m3132Q7(String str, List list) {
        if (vwb.J(list)) {
            mo1575o();
        } else {
            ft4.b().k(act(), str);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: R */
    public boolean mo1526R() {
        return ((Boolean) CoreModule.c.m0.x0.get()).booleanValue();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: R0 */
    public boolean mo1527R0() {
        return getActivity() instanceof NewUI1ContainerActivity;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: R3 */
    public void m2871tc() {
        act().finish();
    }

    /* JADX INFO: renamed from: R7 */
    public final /* synthetic */ void m3133R7(Throwable th) {
        mo1575o();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: S */
    public boolean mo1530S() {
        return true;
    }

    /* JADX WARN: Type inference failed for: r4v11, types: [android.view.View, com.p1.mobile.putong.core.ui.profile.profilelist.PicPostDlgView] */
    /* JADX INFO: renamed from: S7 */
    public final /* synthetic */ void m3134S7(View view) {
        lra0.h("button");
        if (!this.f1776h1.m11333W() || !m3095w7()) {
            final String strC = ft4.b().c(this.f1726E0, wn90.F().a);
            if (ft4.b().i(strC)) {
                act().duringCreated(CoreModule.c.U1.i3("profile", strC)).subscribe(mkd0.H(new e30() { // from class: l.u7a0
                    public final void call(Object obj) {
                        this.f20525a.m3132Q7(strC, (List) obj);
                    }
                }, new e30() { // from class: l.v7a0
                    public final void call(Object obj) {
                        this.f21024a.m3133R7((Throwable) obj);
                    }
                }));
                return;
            } else {
                mo1575o();
                return;
            }
        }
        ?? r4 = (PicPostDlgView) act().inflater().inflate(f6c0.u8, (ViewGroup) null);
        r4.m2351s(m3040d7());
        new Random().nextInt(26);
        this.f1759V.put(Integer.valueOf(((Integer) this.f1759V.get()).intValue() + 1));
        new dd80.a(act()).R((View) r4).x0(R.string.f5, new Object[0]).s0(R.string.g5, new Object[0]).u0(t100.g, t100.q).P(false).a0(R.string.d5, new Runnable() { // from class: l.s7a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f18817a.m3128O7();
            }
        }).f0(R.string.e5, new Runnable() { // from class: l.t7a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20118a.m3130P7();
            }
        }).i0(x2c0.jj).r0();
        m2989M8(((Integer) this.f1759V.get()).intValue());
    }

    /* JADX INFO: renamed from: T7 */
    public final /* synthetic */ void m3135T7(View view) {
        lra0.h("button");
        m2871tc();
    }

    /* JADX INFO: renamed from: U7 */
    public final /* synthetic */ void m3136U7(View view) {
        m3120K8();
    }

    /* JADX INFO: renamed from: V7 */
    public final /* synthetic */ void m3137V7(User user) {
        m3028Z8(user);
        m3037c9(user);
        this.f1730G0.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: V8 */
    public final void m3138V8(int i) {
        if (i == 0) {
            if (NullChecker.a(this.f1740L0) && xdl0.O0(this.f1740L0)) {
                this.f1740L0.l0();
                return;
            }
            return;
        }
        if (i == 1 && NullChecker.a(this.f1763X)) {
            ViewGroup viewGroup = (ViewGroup) this.f1763X.getCardView().getParent();
            if (NullChecker.a(viewGroup)) {
                PicCertGuideView picCertGuideViewFindViewById = viewGroup.findViewById(u4c0.H9);
                if (NullChecker.a(picCertGuideViewFindViewById) && xdl0.O0(picCertGuideViewFindViewById)) {
                    picCertGuideViewFindViewById.l0();
                }
            }
        }
    }

    /* JADX INFO: renamed from: W6 */
    public final boolean m3139W6() {
        LoopFragmentFactory.LoopCreateEntryType loopCreateEntryType = TextUtils.equals(this.f1750Q0, "chat_complete_profile") ? LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_CHAT_COMPLETE_PROFILE : null;
        if (TextUtils.equals(this.f1750Q0, "mytab_complete_profile")) {
            loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_MYTAB_COMPLETE_PROFILE;
        }
        if (TextUtils.equals(this.f1750Q0, "left_swipe_complete_profile")) {
            loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LEFT_SWIPE_COMPLETE_PROFILE;
        }
        if (TextUtils.equals(this.f1750Q0, "received_profile_like_not_null") || TextUtils.equals(this.f1750Q0, "received_profile_like_is_null")) {
            loopCreateEntryType = LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_LIKE_COMPLETE_PROFILE;
        }
        if (TextUtils.equals(this.f1750Q0, "from_ideal_type_mine_tab_guide")) {
            LoopFragmentFactory.m1959U(wn90.F().a, this, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_GUIDE, "from_ideal_guide_dialog");
            return true;
        }
        if (TextUtils.equals(this.f1750Q0, "from_ideal_type_other_profile")) {
            LoopFragmentFactory.m1959U(wn90.F().a, this, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_OTHER_PROFILE_FEEDBACK, "from_ideal_guide_dialog");
            return true;
        }
        if (TextUtils.equals(this.f1750Q0, "from_ideal_type_profile_item")) {
            LoopFragmentFactory.m1959U(wn90.F().a, this, null, LoopFragmentFactory.LoopCreateEntryType.ENTRY_FROM_IDEAL_PROFILE_ITEM, "from_ideal_guide_profile_item");
            return true;
        }
        if (!NullChecker.a(loopCreateEntryType)) {
            return false;
        }
        LoopFragmentFactory.m1959U(wn90.F().a, this, null, loopCreateEntryType, this.f1750Q0);
        return true;
    }

    /* JADX INFO: renamed from: W7 */
    public final /* synthetic */ void m3140W7(FakeGuideData fakeGuideData) {
        xdl0.M(this.f1755T, true);
        xdl0.M(this.f1735J, false);
        xdl0.M(this.f1737K, false);
        xdl0.M(this.f1739L, false);
        if (NullChecker.a(this.f1740L0)) {
            xdl0.M(this.f1740L0, false);
        }
        xdl0.M(this.f1733I, true);
    }

    /* JADX INFO: renamed from: W8 */
    public final void m3141W8() {
        if (upa.p2()) {
            int i = 0;
            if (lqa.a()) {
                AvatarCards avatarCards = this.f1778j1.f10457u;
                if (NullChecker.a(avatarCards)) {
                    int childCount = avatarCards.getChildCount();
                    while (i < childCount) {
                        avatarCards.m1257h(i).m2306n0(null);
                        i++;
                    }
                    return;
                }
                return;
            }
            MediaReorderCards mediaReorderCards = this.f1777i1.f8746v;
            if (NullChecker.a(mediaReorderCards)) {
                int childCount2 = mediaReorderCards.getChildCount();
                while (i < childCount2) {
                    mediaReorderCards.m1257h(i).f798N = null;
                    i++;
                }
            }
        }
    }

    /* JADX INFO: renamed from: X6, reason: merged with bridge method [inline-methods] */
    public ArrayList<j760<String, d30>> m3105C4() {
        ArrayList<j760<String, d30>> arrayList = new ArrayList<>();
        arrayList.add(vwb.Y("user id", new d30() { // from class: l.e7a0
            public final void call() {
                this.f9604a.m3102z7();
            }
        }));
        arrayList.add(vwb.Y("温馨提示框", new d30() { // from class: l.p7a0
            public final void call() {
                this.f17033a.m2960A7();
            }
        }));
        arrayList.add(vwb.Y("用户位置信息", new d30() { // from class: l.a8a0
            public final void call() {
                this.f7442a.m2963B7();
            }
        }));
        arrayList.add(vwb.Y("Profile Guide", new d30() { // from class: l.l8a0
            public final void call() {
                this.f14715a.m3108D7();
            }
        }));
        return arrayList;
    }

    /* JADX INFO: renamed from: X7 */
    public final /* synthetic */ void m3143X7(Bundle bundle) {
        act().setTitle(x4(R.string.vj));
        CoreModule.c.e0.u0.put(Boolean.FALSE);
        mo1559h3();
        if (ProfileListFrag.f1432I4 == null) {
            e51.y(new Runnable() { // from class: l.w7a0
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListFragLocalEditImpl.m2968E5();
                }
            });
        }
        CoreModule.c.d0.R.k().first().subscribe(mkd0.B());
    }

    /* JADX INFO: renamed from: X8 */
    public final void m3144X8() {
        m3124N6(new e30() { // from class: l.c9a0
            public final void call(Object obj) {
                this.f8562a.m3184q8((a5m) obj);
            }
        });
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: Y0 */
    public ViewGroup mo1537Y0() {
        return this.f1757U;
    }

    /* JADX INFO: renamed from: Y6 */
    public User m3145Y6() {
        if (NullChecker.a(mo1506F1(false)) && this.f1776h1.m11332V()) {
            wn90.F().a.profile.extensions.momentSwitch.noSyncMoment.clear();
            wn90.F().a.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f1776h1.m11331U() ? "false" : "true");
        }
        User userClone = wn90.F().a.clone();
        m3055i7(userClone);
        return userClone.subtract(this.f1726E0);
    }

    /* JADX INFO: renamed from: Y7 */
    public final /* synthetic */ void m3146Y7(roj0 roj0Var) {
        mo1559h3();
    }

    /* JADX INFO: renamed from: Y8 */
    public final void m3147Y8() {
        final int iC;
        if (this.f1741M == null || this.f1743N == null || ((Integer) wn90.F().m.get()).intValue() == (iC = wn90.F().C(act(), wn90.F().a, true))) {
            return;
        }
        SpannableStringBuilder spannableStringBuilderB0 = iC < 100 ? i0g0.b0("达到100%被喜欢的概率将提升4倍！", vwb.f0(new String[]{"4倍"}), -98787, eqh0.c(2)) : i0g0.b0("被喜欢的概率已超过70%的用户！", vwb.f0(new String[]{"70%"}), -98787, eqh0.c(2));
        if (iC == 0) {
            xdl0.M(this.f1745O, true);
            xdl0.M(this.f1747P, false);
        }
        this.f1751R.setText(spannableStringBuilderB0);
        this.f1741M.c(100.0f, act().color(w0c0.w), t100.d(6.0f), t100.d(3.0f));
        e51.H(act(), new Runnable() { // from class: l.t8a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f20123a.m3185r8(iC);
            }
        }, 300L);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: Z2 */
    public int mo1540Z2() {
        int i = 0;
        if (lqa.a()) {
            AvatarCards avatarCards = this.f1778j1.f10457u;
            if (!NullChecker.a(avatarCards)) {
                return 0;
            }
            if (avatarCards.m1257h(0).m1240n()) {
                CrashHelper.c(new NullPointerException("The first pic cannot be empty！"));
            }
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            while (i < avatarCards.getChildCount() && !avatarCards.m1257h(i).m1240n()) {
                Media media = avatarCards.m1257h(i).getMedia();
                arrayList.add(media);
                if (NullChecker.a(media) && !TEnum.equals(avatarCards.m1257h(i).getMedia().status, "normal")) {
                    i2++;
                }
                i++;
            }
            int size = arrayList.size();
            if (!NullChecker.a(wn90.F().a)) {
                CrashHelper.c(new NullPointerException("ProfileListFrag editingUser is null when edit pic"));
                wn90.F().a = CoreModule.c.e0.p9().clone();
            }
            if (size > 0) {
                wn90.F().a.pictures = arrayList;
                return i2;
            }
            if (wn90.F().a.pictures.isEmpty()) {
                wn90.F().a.pictures = this.f1726E0.pictures;
            }
            return i2;
        }
        MediaReorderCards mediaReorderCards = this.f1777i1.f8746v;
        if (!NullChecker.a(mediaReorderCards)) {
            return 0;
        }
        if (mediaReorderCards.m1257h(0).m1240n()) {
            CrashHelper.c(new NullPointerException("The first pic cannot be empty！"));
        }
        ArrayList arrayList2 = new ArrayList();
        int i3 = 0;
        while (i < mediaReorderCards.getChildCount() && !mediaReorderCards.m1257h(i).m1240n()) {
            Media media2 = mediaReorderCards.m1257h(i).f798N;
            arrayList2.add(media2);
            if (NullChecker.a(media2) && !TEnum.equals(mediaReorderCards.m1257h(i).f798N.status, "normal")) {
                i3++;
            }
            i++;
        }
        int size2 = arrayList2.size();
        if (!NullChecker.a(wn90.F().a)) {
            CrashHelper.c(new NullPointerException("ProfileListFrag editingUser is null when edit pic"));
            wn90.F().a = CoreModule.c.e0.p9().clone();
        }
        if (size2 > 0) {
            wn90.F().a.pictures = arrayList2;
        } else if (wn90.F().a.pictures.isEmpty()) {
            wn90.F().a.pictures = this.f1726E0.pictures;
        }
        if (size2 <= mediaReorderCards.getChildCount()) {
            m3065l9(size2, null, mediaReorderCards);
        }
        return i3;
    }

    /* JADX INFO: renamed from: Z7 */
    public final /* synthetic */ void m3148Z7(c cVar) {
        if (this.f1723C.getSelectedTabPosition() == 0) {
            e51.H(act(), new Runnable() { // from class: l.r7a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18407a.m3131Q6();
                }
            }, 1000L);
        }
    }

    /* JADX INFO: renamed from: a8 */
    public final /* synthetic */ Boolean m3149a8(c cVar) {
        return Boolean.valueOf(this.f1723C.getSelectedTabPosition() == 1);
    }

    /* JADX INFO: renamed from: a9 */
    public void m3150a9() {
        ((PutongFrag) this).pageHelper.q(pageId());
        f.b().f(this.f1750Q0);
    }

    /* JADX INFO: renamed from: b7 */
    public VReorderCard m3151b7(int i) {
        cme cmeVar;
        MediaReorderCards mediaReorderCards;
        if (lqa.a() || (cmeVar = this.f1777i1) == null || (mediaReorderCards = cmeVar.f8746v) == null) {
            return null;
        }
        return mediaReorderCards.m1257h(i);
    }

    /* JADX INFO: renamed from: b8 */
    public final /* synthetic */ void m3152b8(c cVar) {
        m3158e7();
    }

    /* JADX INFO: renamed from: b9 */
    public void m3153b9(int i, int i2) {
        if (NullChecker.a(this.f1734I0) && this.f1734I0.isRunning()) {
            return;
        }
        if (i == 0 && i2 - i >= 20) {
            i = i2 - 20;
        }
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(i, i2);
        this.f1734I0 = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(400L);
        this.f1734I0.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.d9a0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9117a.m3186s8(valueAnimator);
            }
        });
        this.f1734I0.addListener(new C0152d(i2));
        this.f1734I0.setInterpolator(new LinearInterpolator());
        this.f1734I0.start();
    }

    /* JADX INFO: renamed from: c8 */
    public final /* synthetic */ void m3154c8(User user, CoreSuggested.UserInfo userInfo, a5m a5mVar) {
        a5mVar.setPageHelper(this.f1768Z0);
        a5mVar.T(user, userInfo, 0);
        xdl0.M(this.f1725E, false);
        if (xdl0.O0(this.f1724D)) {
            a5mVar.G();
        }
    }

    /* JADX INFO: renamed from: d4 */
    public void m3155d4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.d4();
        wn90.F().a = CoreModule.c.e0.na().clone();
        duringCreated(this.f1730G0).onBackpressureLatest().observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.k6a0
            public final void call(Object obj) {
                this.f14218a.m3116I7((roj0) obj);
            }
        }, new e30() { // from class: l.l6a0
            public final void call(Object obj) {
                CrashHelper.c((Throwable) obj);
            }
        }));
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.m6a0
            public final void call(Object obj) {
                this.f15250a.m3118J7((c) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.n6a0
            public final Object call() {
                return rx.c.timer(450L, TimeUnit.MILLISECONDS);
            }
        }).compose(mkd0.C()).subscribe(mkd0.G(new e30() { // from class: l.o6a0
            public final void call(Object obj) {
                CoreModule.c.B0.p4(CoreModule.H().userId());
            }
        }));
        creates(new e30() { // from class: l.p6a0
            public final void call(Object obj) {
                this.f17021a.m3121L7((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: d8 */
    public final /* synthetic */ void m3156d8(knb0 knb0Var) {
        final User user = (User) knb0Var.a;
        Object obj = knb0Var.b;
        user.friendCommentInfo = ((User) obj).friendCommentInfo;
        user.verifications = ((User) obj).verifications;
        final CoreSuggested.UserInfo userInfo = new CoreSuggested.UserInfo();
        userInfo.id = ((DbObject) user).id;
        userInfo.renderFrom = CardInfoRenderFrom.PROFILE_PREVIEW;
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(knb0Var.c)) {
            List<CoreMomentInfo> list = ((q860) knb0Var.c).a;
            if (!vwb.J(list)) {
                for (CoreMomentInfo coreMomentInfo : list) {
                    if (!vwb.J(coreMomentInfo.media)) {
                        for (Media media : coreMomentInfo.media) {
                            if ((media instanceof Picture) || (media instanceof Video)) {
                                arrayList.add(media);
                            }
                        }
                    }
                }
            }
        }
        userInfo.userMedia = arrayList;
        userInfo.coreMomentInfoList = ((q860) knb0Var.c).a;
        userInfo.myTabTask = (MyTabTask) knb0Var.d;
        m3048g7(userInfo);
        m3124N6(new e30() { // from class: l.x7a0
            public final void call(Object obj2) {
                this.f22152a.m3154c8(user, userInfo, (a5m) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: d9 */
    public boolean m3157d9() {
        return "profile_frag_me_avatar".equals(this.f1750Q0);
    }

    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: e7 */
    public final void m3158e7() {
        if (wn90.U(CoreModule.c.e0.na())) {
            CoreModule.c.e0.k7.onNext(MyTabTask.new_());
        } else {
            if (upa.e2() && TextUtils.equals((CharSequence) CoreModule.c.e0.Z3.get(), "marryMode")) {
                return;
            }
            CoreModule.c.e0.C7();
        }
    }

    /* JADX INFO: renamed from: e8 */
    public final /* synthetic */ void m3159e8(boolean z) {
        mo1540Z2();
    }

    /* JADX INFO: renamed from: f4 */
    public void m3160f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.f4();
        creates(new e30() { // from class: l.q6a0
            public final void call(Object obj) {
                this.f17822a.m3143X7((Bundle) obj);
            }
        });
        duringCreated(p.f0).subscribe(mkd0.G(new e30() { // from class: l.r6a0
            public final void call(Object obj) {
                this.f18375a.m3146Y7((roj0) obj);
            }
        }));
        duringCreated(p.g0).subscribe(mkd0.G(new e30() { // from class: l.s6a0
            public final void call(Object obj) {
                ProfileListFragLocalEditImpl.m3016V4((roj0) obj);
            }
        }));
        duringCreated(CoreModule.c.d0.j3()).subscribe(mkd0.B());
        m3173l7();
        m3087t7();
        if (lqa.k()) {
            lifecycle().filter(new w9j() { // from class: l.u6a0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i);
                }
            }).first().subscribe(mkd0.H(new e30() { // from class: l.v6a0
                public final void call(Object obj) {
                    this.f21013a.m3148Z7((c) obj);
                }
            }, new e30() { // from class: l.w6a0
                public final void call(Object obj) {
                    ProfileListFragLocalEditImpl.m3072o6((Throwable) obj);
                }
            }));
        }
        if (upa.p2()) {
            lifecycle().filter(new w9j() { // from class: l.x6a0
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.i);
                }
            }).filter(new w9j() { // from class: l.y6a0
                public final Object call(Object obj) {
                    return this.f22690a.m3149a8((c) obj);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.z6a0
                public final void call(Object obj) {
                    this.f23278a.m3152b8((c) obj);
                }
            }, new e30() { // from class: l.a7a0
                public final void call(Object obj) {
                    ProfileListFragLocalEditImpl.m3082s5((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: f7 */
    public final LinearLayout m3161f7(View view) {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        final View viewInflate = o7r.a(getContext()).inflate(f6c0.pa, (ViewGroup) linearLayout, false);
        linearLayout.addView(viewInflate);
        final PicCertGuideView picCertGuideViewInflate = o7r.a(getContext()).inflate(f6c0.t8, (ViewGroup) linearLayout, false);
        xdl0.X(picCertGuideViewInflate, t100.d(12.0f));
        xdl0.V(picCertGuideViewInflate, t100.d(8.0f));
        xdl0.W(picCertGuideViewInflate, t100.d(8.0f));
        xdl0.U(picCertGuideViewInflate, -t100.d(3.0f));
        linearLayout.addView(picCertGuideViewInflate);
        if (view instanceof UserProfileExpandedCard) {
            ((UserProfileExpandedCard) view).b1(0, 0, 0, t100.d(44.0f));
            linearLayout.addView(m3180n9(view));
        } else {
            linearLayout.addView(view);
        }
        duringCreated(CoreModule.c.e0.o9()).distinctUntilChanged(new w9j() { // from class: l.v8a0
            public final Object call(Object obj) {
                return ((User) obj).status;
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.x8a0
            public final void call(Object obj) {
                this.f22163a.m3112F7(viewInflate, picCertGuideViewInflate, (User) obj);
            }
        }, new e30() { // from class: l.y8a0
            public final void call(Object obj) {
                ProfileListFragLocalEditImpl.m2973G5((Throwable) obj);
            }
        }));
        if (jjb0.b()) {
            duringCreated(CoreModule.c.B0.j4().filter(new w9j() { // from class: l.z8a0
                public final Object call(Object obj) {
                    VerificationCenter verificationCenter = (VerificationCenter) obj;
                    return Boolean.valueOf(NullChecker.a(verificationCenter) && NullChecker.a(verificationCenter.picVerificationInfo));
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.a9a0
                public final void call(Object obj) {
                    this.f7451a.m3110E7(picCertGuideViewInflate, (VerificationCenter) obj);
                }
            }));
        }
        return linearLayout;
    }

    /* JADX INFO: renamed from: f8 */
    public final /* synthetic */ void m3162f8() {
        this.f1777i1.f8746v.setViewCatchListener(new VReorderCards.InterfaceC0052c() { // from class: l.o7a0
            @Override // com.p000p1.mobile.putong.core.p001ui.profile.VReorderCards.InterfaceC0052c
            /* JADX INFO: renamed from: a */
            public final void mo1268a(boolean z) {
                this.f16415a.m3159e8(z);
            }
        });
        if (lqa.w()) {
            this.f1777i1.f8746v.m1265q(new Runnable() { // from class: l.q7a0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17834a.mo1540Z2();
                }
            });
        }
    }

    /* JADX INFO: renamed from: f9 */
    public void m3163f9(final int i) {
        new xh0.a(act()).s(x4(R.string.Oq)).g(false).i(R.string.Nq).q(R.string.Mq).o(new View.OnClickListener() { // from class: l.m5a0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15241a.m3193x8(i, view);
            }
        }).e(R.string.c).a().g();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    public String from() {
        return this.f1750Q0;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: g3 */
    public boolean mo1556g3() {
        return false;
    }

    /* JADX INFO: renamed from: g4 */
    public void m3164g4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INIT_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        m3081r7();
        m2972F8();
        if (NullChecker.a(act().getSupportActionBar())) {
            act().getSupportActionBar().m();
        }
        m3092v7();
        m3188u7();
        m3078q7();
        initState();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: g8 */
    public final /* synthetic */ void m3165g8(MenuItem menuItem, View view) {
        startActivity(ProfileAct.m1176p2(act() == null ? menuItem.getActionView().getContext() : act(), this.f1746O0, "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: g9 */
    public final void m3166g9() {
        if (CoreModule.K().me_().isBanned()) {
            return;
        }
        if (CoreModule.c.e0.e8()) {
            xx0.h(act());
        } else if (CoreModule.K().me_().isAudit()) {
            xx0.f(act());
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: h3 */
    public void mo1559h3() {
        duringCreated(CoreModule.c.e0.W9(userId()).flatMap(new w9j() { // from class: l.k7a0
            public final Object call(Object obj) {
                return CoreModule.c.s1.s3();
            }
        }).map(new w9j() { // from class: l.l7a0
            public final Object call(Object obj) {
                return this.f14703a.m3174l8((List) obj);
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.m7a0
            public final void call(Object obj) {
                this.f15259a.m3176m8((j760) obj);
            }
        }, new e30() { // from class: l.n7a0
            public final void call(Object obj) {
                ProfileListFragLocalEditImpl.m3061k6((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h8 */
    public final /* synthetic */ void m3167h8(List list) {
        this.f1781l1.m9913i0(list);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: i3 */
    public int mo1562i3() {
        return this.f1772d1;
    }

    /* JADX INFO: renamed from: i8 */
    public final /* synthetic */ rx.c m3168i8(User user, ProfileEditInfo profileEditInfo) {
        if (profileEditInfo == null || !profileEditInfo.isHit) {
            return CoreModule.c.e0.E9(user);
        }
        wn90.F().a.description = profileEditInfo.user.description;
        wn90.F().a.profile = profileEditInfo.user.profile;
        User user2 = wn90.F().a;
        User user3 = profileEditInfo.user;
        user2.name = user3.name;
        if (TextUtils.isEmpty(((Media) user3.pictures.get(0)).url)) {
            m3011T8(wn90.F().a, true);
            if (!lqa.a()) {
                xdl0.M(this.f1777i1.f8747w, false);
            }
        } else {
            if (!lqa.a()) {
                xdl0.M(this.f1777i1.f8747w, true);
            }
            wn90.F().a.pictures = profileEditInfo.user.pictures;
            m3011T8(wn90.F().a, false);
        }
        throw new ProfileEditInfoException(profileEditInfo);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INFLATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        View viewM3122M6 = m3122M6(layoutInflater, viewGroup);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        return viewM3122M6;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: j3 */
    public void mo1564j3(int i) {
        Intent intent = new Intent();
        if (!NullChecker.a(this.f1726E0)) {
            act().finish();
        } else {
            act().setResult(i, intent);
            act().finish();
        }
    }

    /* JADX INFO: renamed from: j7 */
    public void m3169j7() {
        this.f1746O0 = getArguments().getString(SysnotifListener.KEY_USER_ID);
        this.f1750Q0 = getArguments().getString("from");
        if (TextUtils.isEmpty(this.f1746O0)) {
            CrashHelper.d(new NullPointerException("profilelistFrag_initArguments_userid_null,from:" + this.f1750Q0), 1000);
            act().finish();
            return;
        }
        this.f1748P0 = getArguments().getString("input_type");
        this.f1752R0 = getArguments().getBoolean("open_media_picker");
        Serializable serializable = getArguments().getSerializable("params_extra_map_data");
        if (serializable instanceof HashMap) {
            this.f1738K0 = (HashMap) serializable;
        }
    }

    /* JADX INFO: renamed from: j8 */
    public final /* synthetic */ void m3170j8(boolean z, User user, User user2, e30 e30Var, User user3, roj0 roj0Var) {
        if (z) {
            CoreModule.c.e0.g4.onNext("");
        }
        if (user.pictures.size() - user2.pictures.size() > 0) {
            zvf0.D("e_upload_photos_success", pageId(), new j760[]{vwb.Y("upload_page_name", "edit_profile_page"), vwb.Y("upload_photos_count", Integer.valueOf(user.pictures.size() - user2.pictures.size()))});
        }
        if (upa.p2() && NullChecker.a(this.f1726E0) && !TextUtils.isEmpty(this.f1726E0.description) && !vwb.J(this.f1726E0.pictures) && this.f1726E0.pictures.size() >= 3) {
            pib pibVar = CoreModule.c.e0;
            if (pibVar.Y6 && !pibVar.a7) {
                pibVar.a7 = true;
                zvf0.D("e_complete_card_success", "p_edit_profile_view", new j760[0]);
            }
        }
        if (e30Var != null) {
            e30Var.call(Boolean.TRUE);
        }
        if (NullChecker.a(user3.pictures) && user3.pictures.size() > 0) {
            CoreModule.c.e0.H7();
        }
        if (m3095w7() && this.f1776h1.m11331U() && !this.f1784o1) {
            wn90.F().d.onNext(Integer.valueOf(gd70.f11374c));
            wn90.F().e.onNext(roj0.a);
        } else if (!this.f1784o1) {
            wn90.F().d.onNext(Integer.valueOf((NullChecker.a(this.f1726E0) && this.f1726E0.status.contains(UserStatus.get("audit"))) ? gd70.f11375d : gd70.f11376e));
        }
        s4();
    }

    /* JADX INFO: renamed from: k8 */
    public final /* synthetic */ void m3171k8(User user, User user2, final e30 e30Var, Throwable th) {
        if (yij0.H(th)) {
            s4();
            return;
        }
        if (th instanceof ProfileEditInfoException) {
            s4();
            if (tw6.d(((ProfileEditInfoException) th).getEditInfo(), pageId())) {
                lsi0.w(R.string.c0);
                return;
            } else {
                osi0.f(R.string.K7);
                return;
            }
        }
        if (NullChecker.a(act())) {
            s4();
            String string = act().getString(R.string.Fk);
            double dDoubleValue = (NullChecker.a(user.settings) && NullChecker.a(user.settings.birthdate)) ? user.settings.birthdate.doubleValue() : 0.0d;
            if (NullChecker.a(user2.settings) && NullChecker.a(user2.settings.birthdate)) {
                dDoubleValue = user2.settings.birthdate.doubleValue();
            }
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis((long) dDoubleValue);
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(qib0.H.guessedCurrentServerTime());
            int iT = l9b.T(calendar, calendar2);
            if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name) && iT > 120) {
                string = act().getString(R.string.T3);
            } else if (TextUtils.isEmpty(user2.name) && TextUtils.isEmpty(user.name)) {
                string = act().getString(R.string.U3);
            } else if (iT > 120) {
                string = act().getString(R.string.V3);
            }
            b4().F(string).t0(R.string.Q, new Runnable() { // from class: l.b9a0
                @Override // java.lang.Runnable
                public final void run() {
                    ProfileListFragLocalEditImpl.m2983K5(e30Var);
                }
            }).k0(R.string.c).z0();
        }
    }

    /* JADX INFO: renamed from: k9 */
    public void m3172k9() {
        lra0.h("android_back");
    }

    /* JADX INFO: renamed from: l7 */
    public void m3173l7() {
        if (ft4.b().g()) {
            act().duringCreated(CoreModule.c.U1.S).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.q8a0
                public final void call(Object obj) {
                    this.f17852a.m3114H7((Boolean) obj);
                }
            }, new e30() { // from class: l.r8a0
                public final void call(Object obj) {
                    ProfileListFragLocalEditImpl.m3004S4((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: l8 */
    public final /* synthetic */ j760 m3174l8(List list) {
        return vwb.Y(list, BookMoviesDramasHelper.l(userId()));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: m0 */
    public boolean mo1570m0() {
        return true;
    }

    /* JADX INFO: renamed from: m7 */
    public final void m3175m7() {
        if (CertificationUtil.l() || !NullChecker.a(mo1506F1(false)) || wn90.F().a.status.contains(UserStatus.get("audit"))) {
            if (!NullChecker.a(mo1506F1(false))) {
                xdl0.M(this.f1733I, false);
                return;
            }
            if (m3192x7()) {
                xdl0.M(this.f1733I, true);
                boolean zContains = wn90.F().a.status.contains(UserStatus.get("audit"));
                this.f1736J0 = zContains;
                xdl0.M(this.f1735J, zContains);
                xdl0.M(this.f1737K, false);
                xdl0.M(this.f1739L, !this.f1736J0);
                if (this.f1736J0) {
                    xdl0.M(this.f1739L, false);
                } else {
                    m3147Y8();
                }
            }
        }
    }

    /* JADX INFO: renamed from: m8 */
    public final /* synthetic */ void m3176m8(j760 j760Var) {
        this.f1732H0 = j760Var;
        mo1515J3();
    }

    /* JADX INFO: renamed from: m9 */
    public void m3177m9(int i) {
        if (i > this.f1756T0.size()) {
            return;
        }
        int i2 = 0;
        while (i2 < this.f1756T0.size()) {
            xdl0.M(this.f1756T0.get(i2), i2 == i);
            i2++;
        }
        m3126N8(i);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: me */
    public User mo2827me() {
        if (this.f1728F0 == null) {
            m3028Z8(CoreModule.K().me_());
        }
        return this.f1728F0;
    }

    /* JADX INFO: renamed from: n4 */
    public void m3178n4(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.PRE_CREATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        setHasOptionsMenu(true);
        m3169j7();
        m3070n7();
        if ("my_tab_profile_like".equals(this.f1750Q0)) {
            ((PutongFrag) this).pageHelper.q(pageId());
        } else {
            m3150a9();
        }
        m3084s7();
        p420.t(act());
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        m3062k7();
    }

    /* JADX INFO: renamed from: n8 */
    public final /* synthetic */ void m3179n8(List list, boolean z) {
        this.f1778j1.m13295W(list, z);
    }

    /* JADX INFO: renamed from: n9 */
    public final View m3180n9(View view) {
        FrameLayout frameLayout = new FrameLayout(view.getContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setBackgroundColor(Color.parseColor("#f3f3f3"));
        View view2 = new View(view.getContext());
        view2.setBackground(view.getContext().getDrawable(x2c0.o7));
        frameLayout.addView(view2, new FrameLayout.LayoutParams(-1, t100.d(27.0f)));
        frameLayout.addView(view, new FrameLayout.LayoutParams(-1, -1));
        return frameLayout;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: o */
    public void mo1575o() {
        boolean zEquals = TextUtils.equals(wn90.F().a.description, this.f1728F0.description);
        String str = "about_me_pop_ups";
        if (!TextUtils.equals(this.f1750Q0, "about_me_pop_ups")) {
            str = "about_me_banner";
            if (!TextUtils.equals(this.f1750Q0, "about_me_banner")) {
                str = "edit_data_button";
                if (!TextUtils.equals(this.f1750Q0, "edit_data_button")) {
                    str = "edit_home_page";
                    if (!TextUtils.equals(this.f1750Q0, "edit_home_page")) {
                        str = LiveMessage.LiveMessageType.OTHER;
                    }
                }
            }
        }
        o6j0.c("e_edit_personal_profile_finish", "p_edit_profile_view", new o6j0.a[]{o6j0.a.h("about_me_is_modified", zEquals ? "no" : "yes"), o6j0.a.h("previous_page", str)});
        if (!NullChecker.a(mo1506F1(false)) || !NullChecker.a(this.f1726E0)) {
            m2871tc();
            return;
        }
        if (this.f1776h1.m11332V()) {
            wn90.F().a.profile.extensions.momentSwitch.noSyncMoment.clear();
            wn90.F().a.profile.extensions.momentSwitch.noSyncMoment.add(0, this.f1776h1.m11331U() ? "false" : "true");
        }
        int iMo1540Z2 = mo1540Z2();
        if (m3010T6()) {
            m3043e9(false);
            return;
        }
        if (m3018V6()) {
            m3052h9(false);
            return;
        }
        if (m3014U6()) {
            m3052h9(false);
        } else if (wn90.F().a.equals(this.f1726E0)) {
            m2871tc();
        } else {
            m3059j9(iMo1540Z2);
        }
    }

    /* JADX INFO: renamed from: o8 */
    public final /* synthetic */ void m3181o8(Media media, Boolean bool, Boolean bool2) {
        mo1540Z2();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 786) {
            if (i2 == -1) {
                ark.L0(act(), (ArrayList) intent.getSerializableExtra(MediaPickerBaseAct.h));
                return;
            }
            return;
        }
        if (1 == i && NullChecker.a(intent)) {
            String stringExtra = intent.getStringExtra("about_me");
            wn90.F().a.description = vwb.k(stringExtra).trim();
            mo1504E();
            m3015U8(wn90.F().a);
            return;
        }
        if (NullChecker.a(intent) && i2 == -1 && LoopFragmentFactory.m1952N(i, wn90.F().a, intent)) {
            mo1504E();
            m3015U8(wn90.F().a);
            if (i == LoopInputType.HIDDEN_SCHOOL.requestCode) {
                this.f1780k1.m23051R0();
                return;
            }
            return;
        }
        if (i == 3500 && i2 == -1 && NullChecker.a(intent)) {
            if (NullChecker.a(wn90.F().a)) {
                LoopFragmentFactory.m1971j(act());
                if (upa.u2()) {
                    m2999Q8(wn90.F().a.pictures);
                }
                mo1504E();
                m3015U8(wn90.F().a);
                return;
            }
            return;
        }
        if (i == 3001) {
            mo1504E();
            m3015U8(wn90.F().a);
        } else if (i == 3003) {
            mo1515J3();
        } else {
            super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
        }
    }

    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater menuInflater) {
        if (getActivity() instanceof NewUI1ContainerActivity) {
            menuInflater.inflate(h7c0.f, menu);
            final MenuItem menuItemFindItem = menu.findItem(u4c0.i8);
            menuItemFindItem.getActionView().setOnClickListener(new View.OnClickListener() { // from class: l.j6a0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13601a.m3165g8(menuItemFindItem, view);
                }
            });
            CoreBusinessModule.m0().e(menuItemFindItem);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        PerformanceLogUtil.instance().endTrance();
    }

    public void onSaveInstanceState(Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onSaveInstanceState(bundle);
        if (NullChecker.a(mo1506F1(false))) {
            mo1540Z2();
            bundle.putBoolean("saveInstanceKey", true);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: p */
    public ViewGroup mo1577p() {
        return this.f1727F;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.a1m
    /* JADX INFO: renamed from: p3 */
    public void mo1578p3(final int i, final Media media) {
        if (lqa.a()) {
            return;
        }
        this.f1777i1.mo14451a(new d30() { // from class: l.w8a0
            public final void call() {
                this.f21552a.m3111E8(i, media);
            }
        });
    }

    /* JADX INFO: renamed from: p7 */
    public final void m3182p7() {
        if (this.f1769a1 == null) {
            this.f1769a1 = new wuh0(act());
        }
        this.f1769a1.d(vi4.a().a(true), this.f1724D, new wuh0.e() { // from class: l.j7a0
            /* JADX INFO: renamed from: a */
            public final void m15721a(View view, int i, ViewGroup viewGroup) {
                this.f13615a.m3125N7(view, i, viewGroup);
            }
        });
    }

    /* JADX INFO: renamed from: p8 */
    public final /* synthetic */ void m3183p8(boolean z, List list) {
        MediaReorderCards mediaReorderCards = this.f1777i1.f8746v;
        mediaReorderCards.setCurPageId("p_edit_profile_view");
        int i = 0;
        while (true) {
            if (i >= mediaReorderCards.getChildCount()) {
                break;
            }
            mediaReorderCards.m1257h(i).setIllegalPicture(z && i < list.size());
            mediaReorderCards.m1257h(i).m1076C1(i < list.size() ? (Media) list.get(i) : null);
            mediaReorderCards.m1257h(i).setChangeAction(new g30() { // from class: l.f8a0
                /* JADX INFO: renamed from: a */
                public final void m12997a(Object obj, Object obj2, Object obj3) {
                    this.f10186a.m3181o8((Media) obj, (Boolean) obj2, (Boolean) obj3);
                }
            });
            if (upa.u2()) {
                mediaReorderCards.m1257h(i).m1080E1(i, "p_edit_profile_view");
                if (!((Boolean) this.f1761W.get()).booleanValue() && i == list.size()) {
                    mediaReorderCards.m1257h(i).m1102P1();
                    this.f1761W.put(Boolean.TRUE);
                }
            }
            mediaReorderCards.m1257h(i).m1087I0(i);
            i++;
        }
        int size = list.size();
        if (size < mediaReorderCards.getChildCount()) {
            m3065l9(size, null, mediaReorderCards);
        }
    }

    @Override // p002l.a1m
    public String pageId() {
        return "p_edit_profile_view";
    }

    /* JADX INFO: renamed from: q8 */
    public final /* synthetic */ void m3184q8(final a5m a5mVar) {
        if (a5mVar instanceof UserProfileExpandedCard) {
            return;
        }
        xdl0.Q0(this.f1724D, new e30() { // from class: l.e9a0
            public final void call(Object obj) {
                ProfileListFragLocalEditImpl.m3019W4(a5mVar, (int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: r8 */
    public final /* synthetic */ void m3185r8(int i) {
        m3153b9(((Integer) wn90.F().m.get()).intValue(), i);
    }

    /* JADX INFO: renamed from: s8 */
    public final /* synthetic */ void m3186s8(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f1743N.c(iIntValue, act().color(w0c0.I), t100.d(6.0f), t100.d(3.0f));
        this.f1749Q.setText(String.format("已完成%s", iIntValue + "%"));
    }

    /* JADX INFO: renamed from: t8 */
    public final /* synthetic */ void m3187t8(DialogInterface dialogInterface) {
        this.f1786p1.i();
        this.f1786p1.l();
    }

    /* JADX INFO: renamed from: u7 */
    public final void m3188u7() {
        this.f1756T0.add(this.f1727F);
        this.f1756T0.add(this.f1724D);
        xdl0.M(this.f1723C, true);
        int i = getArguments().getInt("preview_type", 0);
        xdl0.X(this.f1727F, t100.d(56.0f));
        xdl0.X(this.f1724D, t100.d(56.0f));
        m3127O6(0, i == 0, act().getString(R.string.W3), true);
        m3127O6(1, i == 1, act().getString(R.string.R3), false);
        m3182p7();
        if (this.f1723C.getTabCount() > 1 && m3157d9()) {
            this.f1764X0 = 0;
        }
        m3177m9(i);
        this.f1723C.setScrollPosition(i, 0.0f, false);
        this.f1723C.addOnTabSelectedListener(new C0149a());
        duringCreated(mkd0.t(this.f1765Y, CoreModule.c.e0.o9().distinctUntilChanged(), m2975G8(), CoreModule.c.e0.k7.distinctUntilChanged(), new z9j() { // from class: l.b7a0
            /* JADX INFO: renamed from: b */
            public final Object m10202b(Object obj, Object obj2, Object obj3, Object obj4) {
                return ProfileListFragLocalEditImpl.m3071o5((User) obj, (User) obj2, (q860) obj3, (MyTabTask) obj4);
            }
        })).filter(new w9j() { // from class: l.c7a0
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a(((knb0) obj).a));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.d7a0
            public final void call(Object obj) {
                this.f9084a.m3156d8((knb0) obj);
            }
        }));
        if (!lqa.a()) {
            this.f1777i1.mo14451a(new d30() { // from class: l.f7a0
                public final void call() {
                    this.f10164a.m3162f8();
                }
            });
        }
        if (this.f1723C.getTabCount() <= 1 || !m3157d9()) {
            if (this.f1723C.getSelectedTabPosition() == 0) {
                m3166g9();
                return;
            }
            return;
        }
        this.f1766Y0 = true;
        TabLayout tabLayout = this.f1723C;
        tabLayout.selectTab(tabLayout.getTabAt(0));
        TabLayout tabLayout2 = this.f1723C;
        if (tabLayout2 != null) {
            this.f1766Y0 = true;
            tabLayout2.selectTab(tabLayout2.getTabAt(1));
        }
    }

    /* JADX INFO: renamed from: u8 */
    public final /* synthetic */ void m3189u8(DialogInterface dialogInterface) {
        this.f1786p1.k();
        this.f1786p1.j();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListBaseFrag, p002l.c5m
    public String userId() {
        return this.f1746O0;
    }

    /* JADX INFO: renamed from: v8 */
    public final /* synthetic */ void m3190v8(View view) {
        List listN = vwb.n(wn90.F().a.pictures, new C0154f());
        User user = wn90.F().a;
        if (vwb.J(listN)) {
            listN = this.f1726E0.pictures;
        }
        user.pictures = listN;
        zvf0.r("e_delete_photo_saveothers", "p_lowqualityphoto_save_popup");
        m2982J8();
    }

    /* JADX INFO: renamed from: w8 */
    public final /* synthetic */ void m3191w8(boolean z, View view) {
        if (!z) {
            zvf0.r("e_ontinue_editing", "p_lowqualityphoto_save_popup");
        } else {
            zvf0.r("e_not_save", "p_lowqualityphoto_save_popup");
            m2871tc();
        }
    }

    /* JADX INFO: renamed from: x7 */
    public final boolean m3192x7() {
        return wn90.F().a.status.contains(UserStatus.get("audit"));
    }

    /* JADX INFO: renamed from: x8 */
    public final /* synthetic */ void m3193x8(int i, View view) {
        if (i == wn90.F().a.pictures.size()) {
            wn90.F().a.pictures = this.f1726E0.pictures;
        } else {
            wn90.F().a.pictures = vwb.n(wn90.F().a.pictures, new w9j() { // from class: l.e8a0
                public final Object call(Object obj) {
                    return Boolean.valueOf(TEnum.equals(((Media) obj).status, "normal"));
                }
            });
        }
        m2982J8();
    }

    /* JADX INFO: renamed from: y7 */
    public final /* synthetic */ void m3194y7() {
        MediaReorderCard mediaReorderCardM1257h = this.f1777i1.f8746v.m1257h(1);
        MediaReorderCard mediaReorderCardM1257h2 = this.f1777i1.f8746v.m1257h(2);
        mediaReorderCardM1257h.m1149z0();
        mediaReorderCardM1257h2.m1149z0();
    }

    /* JADX INFO: renamed from: y8 */
    public final /* synthetic */ void m3195y8(View view) {
        List listN = vwb.n(wn90.F().a.pictures, new C0155g());
        User user = wn90.F().a;
        if (vwb.J(listN)) {
            listN = this.f1726E0.pictures;
        }
        user.pictures = listN;
        zvf0.r("e_delete_photo_saveothers", "p_lowqualityphoto_save_popup");
        m2982J8();
    }

    /* JADX INFO: renamed from: z8 */
    public final /* synthetic */ void m3196z8(boolean z, View view) {
        if (!z) {
            zvf0.r("e_ontinue_editing", "p_lowqualityphoto_save_popup");
        } else {
            zvf0.r("e_not_save", "p_lowqualityphoto_save_popup");
            m2871tc();
        }
    }
}
