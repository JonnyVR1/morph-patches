package com.p000p1.mobile.putong.core.p001ui.profile.profilelist.itemholders;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.drawee.generic.RoundingParams;
import com.facebook.imagepipeline.common.Priority;
import com.p000p1.mobile.putong.core.p001ui.profile.ParallaxView;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfileAct;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfilePictureItemView;
import com.p000p1.mobile.putong.core.p001ui.profile.TagGuidePicAct;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.PerformanceLogUtil;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.ProfileLogEntity;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.AdmobMedia;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ClipRectFrameLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.views.VPager_SquaredRefactor;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.LikedUser;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p1.mobile.putong.core.newui.view.CoreSupremePartnerMysteriousModeCoverView;
import com.p1.mobile.putong.core.newui.view.LiveLightView;
import com.p1.mobile.putong.core.ui.PictureView;
import com.p1.mobile.putong.core.ui.account.JailedDialogLikeAct;
import com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p1.mobile.putong.data.CityC;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveState;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import l.bfd0;
import l.bkb0;
import l.bt0;
import l.c4g0;
import l.cfd0;
import l.d30;
import l.dbl0;
import l.e30;
import l.e51;
import l.eb2;
import l.f6c0;
import l.ftd0;
import l.j760;
import l.jo0;
import l.l480;
import l.lra0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.o7r;
import l.q660;
import l.qib0;
import l.qp8;
import l.r4w;
import l.r65;
import l.sb90;
import l.sth0;
import l.t100;
import l.tbk;
import l.ttn;
import l.u4c0;
import l.upa;
import l.v1c0;
import l.v9j;
import l.vp90;
import l.vwb;
import l.w0c0;
import l.w9a0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.xij0;
import l.xp5;
import l.xx0;
import l.z60;
import l.zub;
import l.zvf0;
import p002l.a1m;
import p002l.ah90;
import p002l.az50;
import p002l.q8p;
import p002l.tm90;
import p002l.x0m;
import rx.c;
import rx.schedulers.Schedulers;
import v.VDivider;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VPager;
import v.VPagerCircleIndicator;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileImagesItemHolder extends ah90 implements ViewPager.j {

    /* JADX INFO: renamed from: k1 */
    public static int f1819k1 = (int) (xdl0.y0() * 0.25f);

    /* JADX INFO: renamed from: l1 */
    public static int f1820l1 = (int) (xdl0.y0() * 1.25f);

    /* JADX INFO: renamed from: A */
    public ViewStub f1821A;

    /* JADX INFO: renamed from: B */
    public VDraweeView f1822B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f1823C;

    /* JADX INFO: renamed from: D */
    public VImage f1824D;

    /* JADX INFO: renamed from: E */
    public View f1825E;

    /* JADX INFO: renamed from: E0 */
    public VFrame f1826E0;

    /* JADX INFO: renamed from: F */
    public FrameLayout f1827F;

    /* JADX INFO: renamed from: F0 */
    public ClipRectFrameLayout f1828F0;

    /* JADX INFO: renamed from: G */
    public NewPictureContainerIndicator f1829G;

    /* JADX INFO: renamed from: G0 */
    public VDraweeView f1830G0;

    /* JADX INFO: renamed from: H */
    public VImage f1831H;

    /* JADX INFO: renamed from: H0 */
    public View f1832H0;

    /* JADX INFO: renamed from: I */
    public VImage f1833I;

    /* JADX INFO: renamed from: I0 */
    public SVGAnimationView f1834I0;

    /* JADX INFO: renamed from: J */
    public VText f1835J;

    /* JADX INFO: renamed from: J0 */
    public SVGAnimationView f1836J0;

    /* JADX INFO: renamed from: K */
    public VImage f1837K;

    /* JADX INFO: renamed from: K0 */
    public TextView f1838K0;

    /* JADX INFO: renamed from: L */
    public LinearLayout f1839L;

    /* JADX INFO: renamed from: L0 */
    public TextView f1840L0;

    /* JADX INFO: renamed from: M */
    public VImage f1841M;

    /* JADX INFO: renamed from: M0 */
    public SVGAnimationView f1842M0;

    /* JADX INFO: renamed from: N */
    public FrameLayout f1843N;

    /* JADX INFO: renamed from: N0 */
    public VDraweeView f1844N0;

    /* JADX INFO: renamed from: O */
    public LiveLightView f1845O;

    /* JADX INFO: renamed from: O0 */
    public VFrame f1846O0;

    /* JADX INFO: renamed from: P */
    public VText f1847P;

    /* JADX INFO: renamed from: P0 */
    public final C0162c f1848P0;

    /* JADX INFO: renamed from: Q */
    public VImage f1849Q;

    /* JADX INFO: renamed from: Q0 */
    public boolean f1850Q0;

    /* JADX INFO: renamed from: R */
    public TextView f1851R;

    /* JADX INFO: renamed from: R0 */
    public boolean f1852R0;

    /* JADX INFO: renamed from: S */
    public FrameLayout f1853S;

    /* JADX INFO: renamed from: S0 */
    public boolean f1854S0;

    /* JADX INFO: renamed from: T */
    public LinearLayout f1855T;

    /* JADX INFO: renamed from: T0 */
    public int f1856T0;

    /* JADX INFO: renamed from: U */
    public SVGAnimationView f1857U;

    /* JADX INFO: renamed from: U0 */
    public int f1858U0;

    /* JADX INFO: renamed from: V */
    public LinearLayout f1859V;

    /* JADX INFO: renamed from: V0 */
    public int f1860V0;

    /* JADX INFO: renamed from: W */
    public VText f1861W;

    /* JADX INFO: renamed from: W0 */
    public float f1862W0;

    /* JADX INFO: renamed from: X */
    public VImage f1863X;

    /* JADX INFO: renamed from: X0 */
    public Map<Integer, View> f1864X0;

    /* JADX INFO: renamed from: Y */
    public SuperLikeComboAnimView f1865Y;

    /* JADX INFO: renamed from: Y0 */
    public int f1866Y0;

    /* JADX INFO: renamed from: Z */
    public VImage f1867Z;

    /* JADX INFO: renamed from: Z0 */
    public List<View> f1868Z0;

    /* JADX INFO: renamed from: a1 */
    public CoreSupremePartnerMysteriousModeCoverView f1869a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f1870b1;

    /* JADX INFO: renamed from: c1 */
    public int f1871c1;

    /* JADX INFO: renamed from: d1 */
    public boolean f1872d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f1873e1;

    /* JADX INFO: renamed from: f1 */
    public c4g0 f1874f1;

    /* JADX INFO: renamed from: g1 */
    public View f1875g1;

    /* JADX INFO: renamed from: h1 */
    public int f1876h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f1877i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f1878j1;

    /* JADX INFO: renamed from: k0 */
    public VImage f1879k0;

    /* JADX INFO: renamed from: p0 */
    public VDraweeView f1880p0;

    /* JADX INFO: renamed from: u */
    public ParallaxView f1881u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f1882v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f1883w;

    /* JADX INFO: renamed from: x */
    public VPager_SquaredRefactor f1884x;

    /* JADX INFO: renamed from: y */
    public VPagerCircleIndicator f1885y;

    /* JADX INFO: renamed from: z */
    public View f1886z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileImagesItemHolder$a */
    public class C0160a implements ViewPager.j {
        public C0160a() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            ProfileImagesItemHolder.this.f1866Y0 = i;
            ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
            profileImagesItemHolder.m3343J0(profileImagesItemHolder.f1866Y0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileImagesItemHolder$b */
    public class C0161b extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public final int[] f1889a = new int[2];

        /* JADX INFO: renamed from: b */
        public int f1890b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f1891c;

        public C0161b(View view) {
            this.f1891c = view;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void m3394b() {
            if (this.f1891c.isAttachedToWindow()) {
                this.f1891c.getLocationInWindow(this.f1889a);
                int[] iArr = this.f1889a;
                if (iArr[1] > 0) {
                    iArr[1] = 0;
                }
                ProfileImagesItemHolder.this.f1881u.setScroll(Math.abs(iArr[1]));
            }
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                e51.I(ProfileImagesItemHolder.this.mo3351O().mo1514J1(), new Runnable() { // from class: l.jp90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13969a.m3394b();
                    }
                }, 6L);
            }
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            m3394b();
            this.f1890b -= i2;
            ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
            if (profileImagesItemHolder.f1878j1 && NullChecker.a(profileImagesItemHolder.f1875g1)) {
                ProfileImagesItemHolder profileImagesItemHolder2 = ProfileImagesItemHolder.this;
                profileImagesItemHolder2.m3365V0(profileImagesItemHolder2.f1875g1, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileImagesItemHolder$c */
    public class C0162c extends eb2 {

        /* JADX INFO: renamed from: e */
        public boolean f1893e;

        /* JADX INFO: renamed from: f */
        public boolean f1894f;

        /* JADX INFO: renamed from: g */
        public List<Media> f1895g = new ArrayList();

        /* JADX INFO: renamed from: h */
        public Stack<View> f1896h = new Stack<>();

        /* JADX INFO: renamed from: i */
        public int f1897i = 0;

        public C0162c() {
        }

        /* JADX INFO: renamed from: D */
        private Act m3398D() {
            return ProfileImagesItemHolder.this.mo3351O().act();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: K */
        public /* synthetic */ void m3399K(View view) {
            if (ProfileImagesItemHolder.this.f1850Q0) {
                ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
                if (profileImagesItemHolder.f1878j1 || (profileImagesItemHolder.m3364U0() && ProfileImagesItemHolder.this.m3350N1())) {
                    ProfileImagesItemHolder.this.m3346L0(4000L, true);
                    return;
                }
            }
            ProfileImagesItemHolder.this.m3359R1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: L */
        public /* synthetic */ void m3400L(View view) {
            if (ProfileImagesItemHolder.this.f1850Q0) {
                ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
                if (profileImagesItemHolder.f1878j1 || (profileImagesItemHolder.m3364U0() && ProfileImagesItemHolder.this.m3350N1())) {
                    ProfileImagesItemHolder.this.m3346L0(4000L, true);
                    return;
                }
            }
            ProfileImagesItemHolder.this.m3355P1();
        }

        /* JADX INFO: renamed from: W */
        private void m3401W(PictureView pictureView, Media media) {
            Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) ProfileImagesItemHolder.this.mo3351O().mo1517K2()).id);
            if (NullChecker.a(pictureView) && NullChecker.a(conversationXe) && conversationXe.isQuickChatClearAvatar(CoreModule.c.e0.na())) {
                qib0.G.L0(pictureView.a, media.url);
            }
        }

        /* JADX INFO: renamed from: v */
        public static /* synthetic */ Integer m3407v(j760 j760Var) {
            return (Integer) j760Var.a;
        }

        /* JADX INFO: renamed from: E */
        public View m3412E(int i) {
            View viewM3413F = m3413F(i);
            return (NullChecker.a(viewM3413F) && (viewM3413F instanceof ProfilePictureItemView)) ? ((ProfilePictureItemView) viewM3413F).f864b : viewM3413F;
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: F */
        public View m3413F(int i) {
            if (ProfileImagesItemHolder.this.f1884x != null) {
                for (int i2 = 0; i2 < ProfileImagesItemHolder.this.f1884x.getChildCount(); i2++) {
                    Object tag = ProfileImagesItemHolder.this.f1884x.getChildAt(i2).getTag();
                    if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                        return ProfileImagesItemHolder.this.f1884x.getChildAt(i2);
                    }
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("images is null from : ");
            sb.append(ProfileImagesItemHolder.this.mo3351O().from());
            sb.append(" content is null ");
            sb.append(ProfileImagesItemHolder.this.mo3351O().mo2652M0() == null);
            sb.append(" life + ");
            sb.append(ProfileImagesItemHolder.this.mo3351O().lifecycle_().c);
            sb.append(" hasRender ");
            sb.append(ProfileImagesItemHolder.this.m14457h());
            CrashHelper.c(new IllegalStateException(sb.toString()));
            return null;
        }

        /* JADX INFO: renamed from: G */
        public final void m3414G(PictureView pictureView) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pictureView.g.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.bottomMargin = 0;
            layoutParams.topMargin = 0;
            layoutParams.rightMargin = 0;
            layoutParams.leftMargin = 0;
            pictureView.g.setLayoutParams(layoutParams);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m3415H(int i) {
            this.f1895g.remove(i);
            this.f1893e = true;
            ProfileImagesItemHolder.this.f1848P0.m3423R(this.f1895g);
            if (ProfileImagesItemHolder.this.mo3351O().mo2899y2()) {
                ProfileImagesItemHolder.this.f1829G.setIndicatorCount(this.f1895g.size());
            }
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m3416I(PictureView pictureView, int i, Integer num) {
            if (num.intValue() >= 100) {
                xdl0.M(pictureView.d, false);
            }
            m3422Q(pictureView, this.f1895g.get(i), num.intValue());
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m3417J(PictureView pictureView, boolean z, boolean z2, View view) {
            int iT = pictureView.T();
            if (iT == -1 && ProfileImagesItemHolder.this.f1884x.getCurrentItem() > 0) {
                VPager_SquaredRefactor vPager_SquaredRefactor = ProfileImagesItemHolder.this.f1884x;
                vPager_SquaredRefactor.setCurrentItem(vPager_SquaredRefactor.getCurrentItem() - 1);
                return;
            }
            if (iT == 1 && ProfileImagesItemHolder.this.f1884x.getCurrentItem() < getCount() - 1) {
                VPager_SquaredRefactor vPager_SquaredRefactor2 = ProfileImagesItemHolder.this.f1884x;
                vPager_SquaredRefactor2.setCurrentItem(vPager_SquaredRefactor2.getCurrentItem() + 1);
            } else {
                if (iT != 0 || ProfileImagesItemHolder.this.mo3351O().mo2659N2()) {
                    return;
                }
                if (z && !z2 && (ProfileImagesItemHolder.this.mo3351O().act() instanceof NewUI1ContainerActivity)) {
                    ProfileImagesItemHolder.this.mo3351O().act().startActivity(ProfileAct.m1176p2(ProfileImagesItemHolder.this.mo3351O().act(), ProfileImagesItemHolder.this.mo3351O().userId(), "profile_frag_picture", false, true));
                } else {
                    ProfileImagesItemHolder.this.mo3351O().m2871tc();
                }
            }
        }

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ void m3418M(boolean z, View view) {
            if (ProfileImagesItemHolder.this.f1850Q0) {
                ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
                if (profileImagesItemHolder.f1878j1 || (profileImagesItemHolder.m3364U0() && ProfileImagesItemHolder.this.m3350N1())) {
                    ProfileImagesItemHolder.this.m3346L0(4000L, true);
                    return;
                }
            }
            if (z && ProfileImagesItemHolder.this.m3364U0() && ProfileImagesItemHolder.this.m3350N1()) {
                ProfileImagesItemHolder.this.m3346L0(4000L, true);
            } else {
                lra0.h("hotspot");
                ProfileImagesItemHolder.this.mo3351O().mo1575o();
            }
        }

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ void m3419N(int i, View view) {
            zvf0.u("e_invisible_photo_upload", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("invisible_photo_location", Integer.valueOf(i)), vwb.Y("invisible_photo_is_thumbnail", Boolean.FALSE)});
            q660.a(m3398D(), "from_profile_upload_photo");
        }

        /* JADX INFO: renamed from: O */
        public final /* synthetic */ void m3420O(int i, View view) {
            if (CoreModule.c.e0.p9().isBanned()) {
                JailedDialogLikeAct.o2(true);
                return;
            }
            if (CoreModule.c.e0.p9().isProfileJailed()) {
                xx0.i(m3398D(), false);
                return;
            }
            sth0.b().e(CoreModule.c.e0.na().clone());
            m3398D().startActivity(TagGuidePicAct.m1216Y1(m3398D(), true, "from_upload_pic", "from_complete_equity_guide"));
            zvf0.u("e_invisible_photo_upload", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("invisible_photo_location", Integer.valueOf(i)), vwb.Y("need_photo_count", Integer.valueOf(3 - CoreModule.c.e0.na().pictures.size())), vwb.Y("invisible_photo_is_thumbnail", Boolean.FALSE)});
        }

        /* JADX INFO: renamed from: P */
        public final /* synthetic */ void m3421P(View view) {
            ProfileImagesItemHolder.this.mo3351O().mo1564j3(SwipeDirection.UP.getValue());
        }

        /* JADX INFO: renamed from: Q */
        public void m3422Q(PictureView pictureView, Media media, int i) {
            if (ProfileImagesItemHolder.this.m9644I()) {
                return;
            }
            if (sb90.c(ProfileImagesItemHolder.this.mo3351O().mo1517K2())) {
                pictureView.g0(media);
            } else {
                pictureView.Y(media, i);
            }
            m3401W(pictureView, media);
            ProfileImagesItemHolder.this.mo3351O().mo2687R1(i);
        }

        /* JADX INFO: renamed from: R */
        public void m3423R(List<Media> list) {
            if (list.equals(this.f1895g) && !this.f1893e) {
                ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
                profileImagesItemHolder.m3363T1(profileImagesItemHolder.mo3351O().mo1517K2(), ProfileImagesItemHolder.this.m3349N0());
            } else {
                this.f1893e = false;
                this.f1897i = getCount();
                this.f1895g = list;
                ProfileImagesItemHolder.this.f1848P0.notifyDataSetChanged();
            }
        }

        /* JADX INFO: renamed from: S */
        public void m3424S(PictureView pictureView, Media media, int i, int i2) {
            if (ProfileImagesItemHolder.this.m9644I()) {
                return;
            }
            if (sb90.c(ProfileImagesItemHolder.this.mo3351O().mo1517K2())) {
                xdl0.M0(pictureView.s, false);
                pictureView.g0(media);
                return;
            }
            if (CoreModule.K().me_().pictures.size() != 1 || ProfileImagesItemHolder.this.mo3351O().mo1517K2().isMe()) {
                xdl0.M0(pictureView.s, false);
                pictureView.Y(media, i);
                m3401W(pictureView, media);
                ProfileImagesItemHolder.this.mo3351O().mo2687R1(i);
                return;
            }
            int iE0 = upa.e0();
            if (iE0 >= 1 && i2 == iE0) {
                m3427V(pictureView, media, i2);
                return;
            }
            xdl0.M0(pictureView.s, false);
            pictureView.Y(media, i);
            m3401W(pictureView, media);
            ProfileImagesItemHolder.this.mo3351O().mo2687R1(i);
        }

        /* JADX INFO: renamed from: T */
        public void m3425T(PictureView pictureView, Media media, final int i) {
            if (ProfileImagesItemHolder.this.mo3351O().mo1517K2() == null || ProfileImagesItemHolder.this.mo3351O().mo1517K2().isMe() || ProfileImagesItemHolder.this.mo3351O().mo1517K2().onlineMatchAvatarUnlock(true) || ProfileImagesItemHolder.this.m9644I()) {
                return;
            }
            if (sb90.c(ProfileImagesItemHolder.this.mo3351O().mo1517K2())) {
                xdl0.M0(pictureView.s, false);
                pictureView.g0(media);
                return;
            }
            int size = CoreModule.c.e0.p9().pictures.size();
            boolean z = i >= size && size <= 2;
            xdl0.M(pictureView.s, z);
            if (!z) {
                pictureView.Y(media, -1);
                m3401W(pictureView, media);
                ProfileImagesItemHolder.this.mo3351O().mo2687R1(-1);
                return;
            }
            pictureView.c0(media, true);
            pictureView.u.setText(String.format("再上传%s张照片\n即可查看%s的全部照片", Integer.valueOf(3 - CoreModule.c.e0.p9().pictures.size()), ProfileImagesItemHolder.this.mo3351O().mo1517K2().getPronoun()));
            xdl0.M(pictureView.u, true);
            xdl0.M(pictureView.t, true);
            xdl0.M(pictureView.v, true);
            xdl0.M(pictureView.w, false);
            xdl0.M(pictureView.x, false);
            xdl0.M(pictureView.y, false);
            xdl0.E0(pictureView.v, new View.OnClickListener() { // from class: l.sp90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f19152a.m3420O(i, view);
                }
            });
        }

        /* JADX INFO: renamed from: U */
        public final void m3426U(PictureView pictureView) {
            pictureView.g.setVisibility(4);
            View viewInflate = ProfileImagesItemHolder.this.mo3351O().mo9267H2().inflate(f6c0.Be, (ViewGroup) pictureView, true);
            View viewFindViewById = viewInflate.findViewById(u4c0.cc);
            viewInflate.findViewById(u4c0.g0);
            VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.Z);
            VDraweeView vDraweeViewFindViewById2 = viewInflate.findViewById(u4c0.e0);
            qib0.G.L0(vDraweeViewFindViewById, ((Media) CoreModule.c.e0.p9().picture(0)).url);
            qib0.G.L0(vDraweeViewFindViewById2, ((Media) this.f1895g.get(0).cover()).url);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.tp90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f20331a.m3421P(view);
                }
            });
        }

        /* JADX INFO: renamed from: V */
        public final void m3427V(PictureView pictureView, Media media, int i) {
            pictureView.x.setText(m3398D().getString(R.string.Tg));
            xdl0.M0(pictureView.s, true);
            pictureView.c0(media, true);
            m3401W(pictureView, media);
            if (i == ProfileImagesItemHolder.this.f1884x.getCurrentItem()) {
                zvf0.A("e_invisible_photo_upload", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("invisible_photo_location", Integer.valueOf(i)), vwb.Y("need_photo_count", Integer.valueOf(3 - CoreModule.c.e0.na().pictures.size())), vwb.Y("invisible_photo_is_thumbnail", Boolean.FALSE)});
            }
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            super.destroyItem(viewGroup, i, obj);
        }

        public int getCount() {
            if (!ProfileImagesItemHolder.this.m9644I() || vwb.J(this.f1895g)) {
                return this.f1895g.size();
            }
            return 1;
        }

        public int getItemPosition(Object obj) {
            if (ProfileImagesItemHolder.this.m9644I()) {
                return -2;
            }
            int i = this.f1897i;
            if (i <= 0) {
                return super/*l.w660*/.getItemPosition(obj);
            }
            this.f1897i = i - 1;
            return -2;
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: o */
        public void m3428o(ViewGroup viewGroup, int i, Object obj) {
            this.f1893e = true;
            if (i == ProfileImagesItemHolder.this.f1884x.getCurrentItem()) {
                dbl0.a(ProfileImagesItemHolder.this.f1884x, false);
            }
            viewGroup.removeView((View) obj);
            if (obj instanceof PictureView) {
                this.f1896h.add((PictureView) obj);
            }
        }

        /* JADX INFO: renamed from: p */
        public Object m3429p(ViewGroup viewGroup, final int i) {
            int iHashCode = new Object().hashCode();
            ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.CUSTOM;
            PerformanceLogUtil.logBegin(iHashCode, profileLogName, getClass().getSimpleName().concat(" onInstantiateItem"));
            if (this.f1895g.get(i) instanceof AdmobMedia) {
                FrameLayout frameLayout = new FrameLayout(m3398D());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, ProfileImagesItemHolder.this.f1884x.getHeight()));
                w9a0.m().A(frameLayout, m3398D(), new d30() { // from class: l.kp90
                    public final void call() {
                        this.f14450a.m3415H(i);
                    }
                });
                frameLayout.setTag(Integer.valueOf(i));
                viewGroup.addView(frameLayout);
                return frameLayout;
            }
            final PictureView pictureView = !this.f1896h.isEmpty() ? (PictureView) this.f1896h.pop() : (PictureView) ProfileImagesItemHolder.this.mo3351O().mo9267H2().inflate(f6c0.ze, viewGroup, false);
            boolean zMo2880v1 = ProfileImagesItemHolder.this.mo3351O().mo2880v1();
            boolean zMo2834o1 = ProfileImagesItemHolder.this.mo3351O().mo2834o1();
            int iMo2639K3 = ProfileImagesItemHolder.this.mo3351O().mo2639K3();
            boolean zMo2731X1 = ProfileImagesItemHolder.this.mo3351O().mo2731X1();
            boolean zMo2751a0 = ProfileImagesItemHolder.this.mo3351O().mo2751a0();
            final boolean zMo1501D2 = ProfileImagesItemHolder.this.mo3351O().mo1501D2();
            final boolean zMo1570m0 = ProfileImagesItemHolder.this.mo3351O().mo1570m0();
            final boolean zMo1523P1 = ProfileImagesItemHolder.this.mo3351O().mo1523P1();
            boolean zMo2843p2 = ProfileImagesItemHolder.this.mo3351O().mo2843p2();
            User userMo1517K2 = ProfileImagesItemHolder.this.mo3351O().mo1517K2();
            int iM23009a = tm90.m23008d().m23009a(userMo1517K2);
            if (NullChecker.a(userMo1517K2) && !userMo1517K2.isMe()) {
                pictureView.setShowPetTag(true);
                pictureView.setIsFemale(userMo1517K2.isFemale());
            }
            if (iM23009a != -1) {
                pictureView.A.setVisibility(0);
                pictureView.B.setVisibility(0);
                tm90.m23008d().m23016i(iM23009a, pictureView.C);
            } else {
                pictureView.A.setVisibility(8);
                pictureView.B.setVisibility(8);
            }
            String strFrom = ProfileImagesItemHolder.this.mo3351O().from();
            if (ProfileImagesItemHolder.this.mo3351O().mo2768d1() == i) {
                xdl0.M(pictureView.m, zMo2880v1);
                xdl0.M(pictureView.n, zMo2834o1);
                if (iMo2639K3 > 0) {
                    pictureView.o.setWidth(iMo2639K3);
                    if (zMo2731X1) {
                        pictureView.o.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
                j760<Integer, Integer> j760VarMo2601E2 = ProfileImagesItemHolder.this.mo3351O().mo2601E2();
                if (j760VarMo2601E2 != null && zMo2751a0) {
                    ViewGroup.LayoutParams layoutParams = pictureView.a.getLayoutParams();
                    layoutParams.width = ((Integer) j760VarMo2601E2.a).intValue();
                    layoutParams.height = ((Integer) j760VarMo2601E2.b).intValue();
                    pictureView.a.setLayoutParams(layoutParams);
                }
                if (zMo1501D2 && j760VarMo2601E2 != null && zMo2751a0) {
                    ViewGroup.LayoutParams layoutParams2 = pictureView.a.getLayoutParams();
                    layoutParams2.width = ((Integer) j760VarMo2601E2.a).intValue();
                    layoutParams2.height = ((Integer) j760VarMo2601E2.b).intValue();
                    pictureView.a.setLayoutParams(layoutParams2);
                }
            }
            pictureView.setFrom(strFrom);
            pictureView.a.getHierarchy().H((RoundingParams) null);
            pictureView.a.getHierarchy().A(ProfileImagesItemHolder.this.mo3351O().act().getResources().getDrawable(w0c0.P));
            if (zMo1501D2) {
                pictureView.K(true, false, true);
            } else {
                pictureView.J(true, false);
                pictureView.setAspectRateFitWidth(0.8f);
                pictureView.a.getHierarchy().w(ftd0.i);
            }
            pictureView.k0();
            if ("live_profile_voice_mask_mode".equals(strFrom)) {
                m3422Q(pictureView, this.f1895g.get(i), 0);
            } else {
                boolean zM3371c1 = ProfileImagesItemHolder.this.m3371c1(userMo1517K2);
                ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
                if (zM3371c1) {
                    profileImagesItemHolder.f1852R0 = true;
                    m3422Q(pictureView, this.f1895g.get(i), 15);
                } else {
                    boolean zM3289K0 = profileImagesItemHolder.m3289K0();
                    ProfileImagesItemHolder profileImagesItemHolder2 = ProfileImagesItemHolder.this;
                    if (zM3289K0) {
                        profileImagesItemHolder2.f1852R0 = true;
                        m3422Q(pictureView, this.f1895g.get(i), 0);
                    } else if (profileImagesItemHolder2.m3370b1(userMo1517K2)) {
                        ProfileImagesItemHolder.this.f1852R0 = true;
                        r4w r4wVar = r4w.INSTANCE;
                        if (r4wVar.C(((DbObject) userMo1517K2).id)) {
                            m3422Q(pictureView, this.f1895g.get(i), 0);
                        } else {
                            n(ProfileImagesItemHolder.this.m14461p(), r4wVar.F(ProfileImagesItemHolder.this.mo3351O().userId())).map(new w9j() { // from class: l.lp90
                                public final Object call(Object obj) {
                                    return ProfileImagesItemHolder.C0162c.m3407v((j760) obj);
                                }
                            }).subscribe(mkd0.G(new e30() { // from class: l.mp90
                                public final void call(Object obj) {
                                    this.f15513a.m3416I(pictureView, i, (Integer) obj);
                                }
                            }));
                        }
                        if (!"from_voice_buzz".equals(strFrom)) {
                            xdl0.M(pictureView.d, true);
                        }
                    } else if (zMo2843p2 && (!zMo2843p2 || i >= this.f1895g.size())) {
                        ProfileImagesItemHolder.this.f1852R0 = true;
                        m3422Q(pictureView, this.f1895g.get(i - 1), 15);
                        m3426U(pictureView);
                    } else if (upa.y2() && (ProfileImagesItemHolder.this.mo3351O().mo1517K2() == null || !ProfileImagesItemHolder.this.mo3351O().mo1517K2().isMe())) {
                        m3425T(pictureView, this.f1895g.get(i), i);
                    } else if (upa.u2() && ProfileImagesItemHolder.this.mo3351O().mo1526R()) {
                        m3424S(pictureView, this.f1895g.get(i), -1, i);
                    } else {
                        m3422Q(pictureView, this.f1895g.get(i), -1);
                    }
                }
            }
            Conversation conversationXe = CoreModule.c.f0.Xe(((DbObject) userMo1517K2).id);
            if (NullChecker.a(conversationXe) && conversationXe.isQuickChatClearAvatar(CoreModule.c.e0.na())) {
                xdl0.M(pictureView.d, false);
            }
            pictureView.setOnClickListener(new View.OnClickListener() { // from class: l.np90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16139a.m3417J(pictureView, zMo1523P1, zMo1570m0, view);
                }
            });
            pictureView.setTag(Integer.valueOf(i));
            pictureView.setPivotX(0.0f);
            pictureView.setPivotY(0.0f);
            viewGroup.addView(pictureView);
            if (ProfileImagesItemHolder.this.mo3351O().mo2899y2()) {
                pictureView.setOnClickListener(null);
                View viewInflate = o7r.a(ProfileImagesItemHolder.this.mo3351O().act()).inflate(f6c0.n9, (ViewGroup) null);
                pictureView.addView(viewInflate, 1);
                xdl0.c0(viewInflate, 0);
                View viewFindViewById = viewInflate.findViewById(u4c0.c);
                View viewFindViewById2 = viewInflate.findViewById(u4c0.d);
                View viewFindViewById3 = viewInflate.findViewById(u4c0.f);
                ProfileImagesItemHolder.this.mo3351O().m9270s();
                viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.op90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f16736a.m3399K(view);
                    }
                });
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.pp90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f17566a.m3400L(view);
                    }
                });
                if (ProfileImagesItemHolder.this.f1850Q0 && !upa.V2()) {
                    xdl0.M0(viewFindViewById3, true);
                    ProfileImagesItemHolder.this.f1864X0.put(Integer.valueOf(i), viewFindViewById3);
                    xdl0.C0(viewFindViewById3, ((int) ((ProfileImagesItemHolder.f1820l1 - ProfileImagesItemHolder.this.f1860V0) * ProfileImagesItemHolder.this.f1862W0)) + (ProfileImagesItemHolder.this.f1860V0 / 2));
                    viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.qp90
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f18114a.m3418M(zMo1501D2, view);
                        }
                    });
                }
            }
            if (i == ProfileImagesItemHolder.this.f1884x.getCurrentItem() && ProfileImagesItemHolder.this.mo3351O().mo2849q3() && ((!zMo1523P1 || !this.f1894f) && xij0.d0() && !ProfileImagesItemHolder.this.mo3351O().mo2881v2() && !ProfileImagesItemHolder.this.m3371c1(userMo1517K2) && !ProfileImagesItemHolder.this.m3370b1(userMo1517K2) && !sb90.c(ProfileImagesItemHolder.this.mo3351O().mo1517K2()))) {
                if (zMo1523P1 && !this.f1894f) {
                    this.f1894f = true;
                }
                if ((!ProfileImagesItemHolder.this.mo3351O().mo2899y2() || getCount() < 2 || ((Boolean) CoreModule.c.e0.W0.get()).booleanValue()) && !ProfileImagesItemHolder.this.m3289K0()) {
                    pictureView.V();
                }
            }
            if (zMo1501D2) {
                if (!ProfileImagesItemHolder.this.f1850Q0) {
                    m3414G(pictureView);
                }
                if (NullChecker.a(pictureView.a.getHierarchy()) && !ProfileImagesItemHolder.this.m9644I()) {
                    pictureView.a.getHierarchy().E(new l480(0.0f));
                    pictureView.a.getHierarchy().C(m3398D().getDrawable(x2c0.U7));
                }
            }
            PerformanceLogUtil.logEnd(iHashCode, profileLogName, getClass().getSimpleName().concat(" onInstantiateItem"));
            if (upa.u2()) {
                xdl0.E0(pictureView.z, new View.OnClickListener() { // from class: l.rp90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f18632a.m3419N(i, view);
                    }
                });
            }
            if (ProfileImagesItemHolder.this.m9644I()) {
                qib0.G.Y0(pictureView.a, x2c0.tl);
                pictureView.m0();
            }
            return pictureView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileImagesItemHolder$d */
    public static class RunnableC0163d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final User f1899a;

        /* JADX INFO: renamed from: b */
        public final boolean f1900b;

        public RunnableC0163d(User user, boolean z) {
            this.f1899a = user;
            this.f1900b = z;
        }

        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m3430a(boolean z, j760 j760Var) {
            Priority priority;
            Object obj = j760Var.a;
            String str = (!(obj instanceof Video) || z) ? "profile" : "";
            Picture.ImageUri imageUriF = zub.f((Media) obj);
            bkb0 bkb0Var = qib0.G;
            if (((Integer) j760Var.b).intValue() == 0) {
                priority = Priority.HIGH;
            } else {
                priority = ((Integer) j760Var.b).intValue() == 1 ? Priority.MEDIUM : Priority.LOW;
            }
            bkb0Var.w0(imageUriF, priority, str);
        }

        /* JADX INFO: renamed from: b */
        public final void m3431b(User user, final boolean z) {
            if (ConnectivityReceiver.i()) {
                vwb.z(vwb.p0(user.pictures), new e30() { // from class: l.up90
                    public final void call(Object obj) {
                        ProfileImagesItemHolder.RunnableC0163d.m3430a(z, (j760) obj);
                    }
                });
            } else {
                qib0.G.w0(zub.f(user.media(0)), Priority.HIGH, (!(user.pictures.get(0) instanceof Video) || z) ? "profile" : "");
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m3431b(this.f1899a, this.f1900b);
        }
    }

    public ProfileImagesItemHolder(@NonNull x0m x0mVar, @NonNull mcr mcrVar) {
        super(x0mVar, mcrVar);
        this.f1848P0 = new C0162c();
        this.f1850Q0 = mo3351O().m9270s();
        this.f1852R0 = false;
        this.f1854S0 = false;
        this.f1856T0 = 0;
        this.f1858U0 = -1;
        this.f1860V0 = 0;
        this.f1862W0 = 0.25f;
        this.f1864X0 = new HashMap();
        this.f1866Y0 = 0;
        this.f1868Z0 = new ArrayList();
        this.f1871c1 = -1;
        this.f1876h1 = -1;
        m14461p().creates(new e30() { // from class: l.uo90
            public final void call(Object obj) {
                ProfileImagesItemHolder.m3297X((Bundle) obj);
            }
        }, new d30() { // from class: l.bp90
            public final void call() {
                this.f8300a.m3320p1();
            }
        });
    }

    /* JADX INFO: renamed from: E1 */
    private void m3287E1() {
        if (NullChecker.a(this.f1825E)) {
            xdl0.M(this.f1825E, true);
        }
        if (NullChecker.a(this.f1853S)) {
            xdl0.M(this.f1853S, true);
        }
        if (NullChecker.a(this.f1839L)) {
            xdl0.M(this.f1839L, false);
        }
        if (NullChecker.a(this.f1837K)) {
            if (mo3351O().mo1517K2().isMe() && !mo3351O().mo2659N2() && mo3351O().mo1527R0()) {
                xdl0.M(this.f1837K, true);
            } else {
                xdl0.M(this.f1837K, false);
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    private Act m3288F0() {
        return mo3351O().act();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public boolean m3289K0() {
        mo3351O().userId();
        return false;
    }

    /* JADX INFO: renamed from: M1 */
    private void m3290M1(boolean z) {
        bt0.p(this.f1884x, "translationX", 0L, 150L, (Interpolator) null, new float[]{(z ? -1 : 1) * t100.d(10.0f), 0.0f}).start();
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m3292S(Throwable th) {
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m3297X(Bundle bundle) {
    }

    /* JADX INFO: renamed from: Z0 */
    private void m3300Z0() {
        ViewGroup.LayoutParams layoutParams = this.f1827F.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.height = t100.t;
        this.f1827F.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m3307g0(d30 d30Var, d30 d30Var2, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
        if (NullChecker.a(d30Var2)) {
            d30Var2.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m3313l1(View view) {
        lra0.h("button");
        mo3351O().mo1575o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m3315m1(View view) {
        m3288F0().finish();
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m3317o0(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m3318o1() {
        if (NullChecker.a(m3288F0()) && !m3288F0().isFinishing() && NullChecker.a(this.f1826E0)) {
            SVGALoader.with(m3288F0()).from("https://auto.tancdn.com/v1/raw/e0fb50e8-bc26-443a-bbca-9266fed1008b14.svga").repeatCount(-1).into(this.f1834I0);
            this.f1834I0.startAnimation();
            SVGALoader.with(m3288F0()).from("https://auto.tancdn.com/v1/raw/1bed74ff-0197-4140-a352-6a36cb500d0e14.svga").repeatCount(1).into(this.f1836J0);
            SVGALoader.with(m3288F0()).from("https://auto.tancdn.com/v1/raw/ff7cd57b-6461-4d0b-ac99-83ad19f3bf0a14.svga").repeatCount(1).into(this.f1842M0);
            this.f1836J0.startAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m3320p1() {
        this.f1848P0.f1893e = true;
        this.f1848P0.f1894f = false;
        VPager vPager = this.f1884x;
        if (vPager != null) {
            dbl0.a(vPager, true);
            if (mo3351O().mo1570m0() || !NullChecker.a(mo3351O().mo1517K2())) {
                return;
            }
            for (int i = 0; i < mo3351O().mo1517K2().pictures.size(); i++) {
                if (i != this.f1884x.getCurrentItem()) {
                    qib0.G.R(zub.f(mo3351O().mo1517K2().media(i)).formatted());
                }
            }
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m3331A1() {
        m3362T0();
    }

    /* JADX INFO: renamed from: B1 */
    public final void m3332B1(VText vText, VText vText2, VText vText3) {
        if (mo3351O().mo1517K2().isMe()) {
            vText.setText(m3288F0().getString(R.string.kn));
            vText2.setText(m3288F0().getString(R.string.in));
        } else {
            vText.setText(TEnum.equals(mo3351O().mo1517K2().gender, "female") ? m3288F0().getString(R.string.d1) : m3288F0().getString(R.string.e1));
            vText2.setText(TEnum.equals(mo3351O().mo1517K2().gender, "female") ? m3288F0().getString(R.string.b1) : m3288F0().getString(R.string.c1));
        }
        vText3.setText(m3288F0().getString(R.string.yk));
        vText3.setTextColor(-1);
    }

    /* JADX INFO: renamed from: C1 */
    public void m3333C1(User user) {
        if (this.f1869a1 == null) {
            this.f1869a1 = this.f1821A.inflate();
            this.f1884x.post(new Runnable() { // from class: l.mo90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f15502a.m3384r1();
                }
            });
        }
        xdl0.M(this.f1869a1, true);
        this.f1869a1.b(user, 2);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m3334D0(View view) {
        vp90.a(this, view);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m3335D1() {
        if (qp8.b() && qib0.b0.c.Bq()) {
            final String strUserId = mo3351O().userId();
            final String strFrom = mo3351O().from();
            final UserLiveState userLiveStateLt = CoreModule.Q().lt(strUserId);
            this.f1855T.setOnClickListener(null);
            xdl0.M(this.f1855T, false);
            Conversation conversationXe = CoreModule.c.f0.Xe(strUserId);
            if (!(!TextUtils.isEmpty(CoreModule.c.m0.o2) && TextUtils.equals(CoreModule.c.m0.o2, strUserId) && conversationXe == null) && NullChecker.a(CoreModule.Q().getUserLiveId(strUserId))) {
                final User userMo1517K2 = mo3351O().mo1517K2();
                xdl0.M(this.f1855T, true);
                ViewGroup.LayoutParams layoutParams = this.f1857U.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    layoutParams.width = t100.d(30.0f);
                    layoutParams.height = t100.d(30.0f);
                    this.f1857U.setLayoutParams(layoutParams);
                }
                this.f1872d1 = true;
                this.f1861W.setTypeface(Typeface.DEFAULT_BOLD);
                xdl0.E0(this.f1855T, new View.OnClickListener() { // from class: l.ip90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f13346a.m3386t1(strUserId, strFrom, userMo1517K2, userLiveStateLt, view);
                    }
                });
                if (!this.f1870b1) {
                    this.f1870b1 = true;
                    zvf0.y("e_live_room_enter", "p_suggest_user_profile_info_view", m3358R0(userMo1517K2, userLiveStateLt, strFrom));
                }
                if (userLiveStateLt != null && !TextUtils.isEmpty(userLiveStateLt.multiCallInfo.onGoingMultiCallId)) {
                    xdl0.M0(this.f1855T, true);
                    this.f1872d1 = true;
                    if (TextUtils.equals(this.f1861W.getText(), m3288F0().getResources().getString(R.string.dh))) {
                        return;
                    } else {
                        this.f1861W.setText(R.string.dh);
                    }
                }
                if (this.f1857U.isAnimating()) {
                    return;
                }
                SVGALoader.with(m3288F0()).from("https://auto.tancdn.com/v1/raw/b83d11f9-6b88-41a2-a0dd-c3617bde118510.so").into(this.f1857U);
            }
        }
    }

    /* JADX INFO: renamed from: F1 */
    public void m3336F1(User user) {
        if (user != null && user.isMe()) {
            xdl0.M(this.f1867Z, false);
            return;
        }
        boolean zQ = xp5.q(user);
        VImage vImage = this.f1867Z;
        if (zQ) {
            xdl0.M(vImage, false);
            return;
        }
        xdl0.M(vImage, !((!user.superLikedMe() && !user.letter()) || az50.INSTANCE.m10128i(((DbObject) user).id) || q8p.INSTANCE.m21088j(((DbObject) user).id)) || TextUtils.equals(CoreModule.c.Z0.B3(), ((DbObject) user).id));
        if ("from_meet_feed".equals(mo3351O().from())) {
            LikedUser likedUserMo2861s2 = mo3351O().mo2861s2();
            if (NullChecker.a(likedUserMo2861s2) && (TEnum.equals(likedUserMo2861s2.status, "superliked") || TEnum.equals(likedUserMo2861s2.status, "lettered"))) {
                xdl0.M(this.f1867Z, true);
            }
        }
        if (IntlCountryCodeController.v() && xdl0.O0(this.f1867Z)) {
            this.f1867Z.setImageResource(x2c0.Jh);
        }
        if (xdl0.O0(this.f1867Z) || xdl0.O0(this.f1844N0)) {
            xdl0.M(this.f1880p0, false);
            this.f1873e1 = true;
        }
    }

    /* JADX INFO: renamed from: G0 */
    public View m3337G0(int i) {
        return this.f1848P0.m3412E(i);
    }

    /* JADX INFO: renamed from: G1 */
    public void m3338G1() {
        this.f1858U0 = -1;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m3339H0() {
        PictureView pictureViewM3412E = this.f1848P0.m3412E(this.f1884x.getCurrentItem());
        if (pictureViewM3412E instanceof PictureView) {
            PictureView pictureView = pictureViewM3412E;
            User userMo1517K2 = mo3351O().mo1517K2();
            if (NullChecker.a(userMo1517K2) && this.f1884x.getCurrentItem() < userMo1517K2.pictures.size() && (((Media) userMo1517K2.pictures.get(this.f1884x.getCurrentItem())) instanceof Video) && xij0.d0()) {
                pictureView.V();
            }
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m3340H1(Drawable drawable, boolean z) {
        if (this.f1878j1 || m9644I()) {
            return;
        }
        View viewInflate = o7r.a(m3288F0()).inflate(f6c0.K8, (ViewGroup) this.f1882v, false);
        this.f1875g1 = viewInflate;
        VText vText = (VText) viewInflate.findViewById(u4c0.L6);
        VText vText2 = (VText) this.f1875g1.findViewById(u4c0.zb);
        VDivider vDividerFindViewById = this.f1875g1.findViewById(u4c0.ue);
        RelativeLayout relativeLayout = (RelativeLayout) this.f1875g1.findViewById(u4c0.d2);
        ConstraintLayout constraintLayoutFindViewById = this.f1875g1.findViewById(u4c0.e2);
        View viewFindViewById = this.f1875g1.findViewById(u4c0.u0);
        if (NullChecker.a(mo3351O().mo1517K2())) {
            m3332B1(vText, vText2, (VText) this.f1875g1.findViewById(u4c0.k0));
        }
        o6j0.h("e_profile_guide_first", mo3351O().pageId(), new o6j0.a[0]);
        ViewGroup.LayoutParams layoutParams = this.f1875g1.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, this.f1884x.getHeight());
        } else {
            layoutParams.height = this.f1884x.getHeight();
            layoutParams.width = -1;
        }
        if (upa.V2()) {
            xdl0.C0(relativeLayout, 0);
            xdl0.C0(constraintLayoutFindViewById, this.f1884x.getHeight());
            xdl0.M(viewFindViewById, false);
            xdl0.M(relativeLayout, false);
            vDividerFindViewById.setDividerColor(872415231);
            vText.setCompoundDrawablesWithIntrinsicBounds(0, x2c0.mm, 0, 0);
            vText2.setCompoundDrawablesWithIntrinsicBounds(0, x2c0.nm, 0, 0);
        } else if (this.f1884x.getHeight() - this.f1860V0 > 0) {
            xdl0.C0(relativeLayout, (int) ((this.f1884x.getHeight() - this.f1860V0) * this.f1862W0));
            xdl0.C0(constraintLayoutFindViewById, this.f1884x.getHeight() - this.f1860V0);
        }
        this.f1875g1.setLayoutParams(layoutParams);
        this.f1882v.addView(this.f1875g1, layoutParams);
        this.f1875g1.setOnClickListener(new View.OnClickListener() { // from class: l.ap90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7842a.m3387u1(view);
            }
        });
        this.f1875g1.findViewById(u4c0.c2).setBackground(drawable);
        if (NullChecker.a(this.f1874f1) && !this.f1874f1.isUnsubscribed()) {
            this.f1874f1.unsubscribe();
            this.f1874f1 = null;
        }
        this.f1877i1 = true;
        this.f1878j1 = true;
        if (mo3351O().mo1501D2()) {
            if (z) {
                lra0.v = true;
            }
            CoreModule.c.e0.W0.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m3341I0() {
        if (mo3351O().mo2899y2()) {
            if (!mo3351O().mo1523P1() && !mo3351O().mo1501D2()) {
                m3357Q1(800L);
            }
            xdl0.M(this.f1885y, false);
            xdl0.M(this.f1829G, true);
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m3342I1(final e30<LinearLayout> e30Var, long j) {
        this.f1839L.postDelayed(new Runnable() { // from class: l.no90
            @Override // java.lang.Runnable
            public final void run() {
                this.f16133a.m3388v1(e30Var);
            }
        }, j);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m3343J0(int i) {
        if (upa.y2()) {
            m3367X0(i);
        }
    }

    /* JADX INFO: renamed from: J1 */
    public void m3344J1(int i, boolean z) {
        if (m14458i() && !m9644I()) {
            this.f1884x.T(i, z);
        }
    }

    /* JADX INFO: renamed from: K1 */
    public void m3345K1(final d30 d30Var) {
        this.f1837K.setOnClickListener(new View.OnClickListener() { // from class: l.lo90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileImagesItemHolder.m3317o0(d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    public void m3346L0(final long j, final boolean z) {
        if (m9644I()) {
            return;
        }
        if (NullChecker.a(this.f1874f1) && !this.f1874f1.isUnsubscribed()) {
            this.f1874f1.unsubscribe();
            this.f1874f1 = null;
        }
        if ((this.f1848P0.f1895g.get(this.f1884x.getCurrentItem()) instanceof Video) && xij0.d0()) {
            dbl0.a(this.f1884x, false);
        }
        this.f1874f1 = m3288F0().duringCreated(((c) new v9j() { // from class: l.po90
            public final Object call() {
                return this.f17558a.m3373e1();
            }
        }.call()).compose(mkd0.R()).observeOn(Schedulers.computation()).flatMap(new w9j() { // from class: l.qo90
            public final Object call(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                return c.just(xij0.p(bitmap, bitmap.getWidth(), bitmap.getHeight(), 1275068416));
            }
        }).compose(mkd0.y()).map(new w9j() { // from class: l.ro90
            public final Object call(Object obj) {
                return this.f18622a.m3374f1((Bitmap) obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.so90
            public final void call(Object obj) {
                this.f19141a.m3377i1(z, j, (Drawable) obj);
            }
        }));
        m14461p().lifecycle().skip(1).filter(new w9j() { // from class: l.to90
            public final Object call(Object obj) {
                return this.f20317a.m3378j1((com.p1.mobile.android.app.c) obj);
            }
        }).take(1).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.vo90
            public final void call(Object obj) {
                this.f21248a.m3379k1((com.p1.mobile.android.app.c) obj);
            }
        }, new e30() { // from class: l.wo90
            public final void call(Object obj) {
                ProfileImagesItemHolder.m3292S((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L1 */
    public void m3347L1(final d30 d30Var, final d30 d30Var2) {
        this.f1839L.setOnClickListener(new View.OnClickListener() { // from class: l.oo90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileImagesItemHolder.m3307g0(d30Var, d30Var2, view);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public CoreSupremePartnerMysteriousModeCoverView m3348M0() {
        return this.f1869a1;
    }

    /* JADX INFO: renamed from: N0 */
    public int m3349N0() {
        if (!m14458i()) {
            return 0;
        }
        int currentItem = this.f1884x.getCurrentItem();
        int i = this.f1858U0;
        if (i < 0 || i > currentItem) {
            return this.f1884x.getCurrentItem();
        }
        return Math.min(Math.max(0, currentItem - 1), NullChecker.a(mo3351O().mo1517K2()) ? mo3351O().mo1517K2().pictures.size() - 1 : 0);
    }

    /* JADX INFO: renamed from: N1 */
    public boolean m3350N1() {
        if (m9644I() || ((Boolean) CoreModule.c.e0.W0.get()).booleanValue() || this.f1860V0 > f1819k1) {
            return false;
        }
        if (this.f1850Q0) {
            return !mo3351O().mo1517K2().isTeamAccount() && !"from_guess_liker_result".equals(mo3351O().from()) && NullChecker.a(mo3351O().mo1517K2()) && NullChecker.a(this.f1884x);
        }
        return (mo3351O().mo1517K2() == null || this.f1884x == null || !"home_card".equals(mo3351O().from())) ? false : true;
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return m14465w();
    }

    /* JADX INFO: renamed from: O0 */
    public int m3352O0() {
        if (m14458i()) {
            return this.f1884x.getCurrentItem();
        }
        return 0;
    }

    /* JADX INFO: renamed from: O1 */
    public final void m3353O1() {
        int childCount = this.f1882v.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f1882v.getChildAt(i);
            xdl0.M0(childAt, childAt == this.f1883w || childAt == this.f1831H || childAt == this.f1825E || childAt == this.f1839L);
        }
        if (mo3351O().mo1517K2().isBannedNew()) {
            xdl0.M(this.f1839L, false);
        }
        xdl0.M(this.f1886z, false);
    }

    /* JADX INFO: renamed from: P0 */
    public PictureView m3354P0() {
        View viewM3412E = this.f1848P0.m3412E(this.f1884x.getCurrentItem());
        if (!(viewM3412E instanceof PictureView)) {
            viewM3412E = this.f1848P0.m3412E(this.f1884x.getCurrentItem() - 1);
        }
        if (viewM3412E instanceof PictureView) {
            return (PictureView) viewM3412E;
        }
        return null;
    }

    /* JADX INFO: renamed from: P1 */
    public void m3355P1() {
        User userMo1517K2 = mo3351O().mo1517K2();
        if (NullChecker.a(this.f1884x)) {
            if (this.f1884x.getCurrentItem() <= 0) {
                m3290M1(false);
                lra0.g("p_suggest_user_profile_info_view", false, true, userMo1517K2, "");
            } else {
                VPager_SquaredRefactor vPager_SquaredRefactor = this.f1884x;
                vPager_SquaredRefactor.T(vPager_SquaredRefactor.getCurrentItem() - 1, false);
                lra0.g("p_suggest_user_profile_info_view", true, true, userMo1517K2, "");
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final String m3356Q0(@Nullable UserLiveState userLiveState) {
        return CoreModule.Q().Dr(NullChecker.a(userLiveState) ? userLiveState.multiCallInfo.onGoingMultiCallRole : "");
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m3357Q1(long j) {
        if (m3350N1()) {
            e51.H(mo3351O().act(), new Runnable() { // from class: l.ko90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14443a.m3389w1();
                }
            }, j);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final HashMap<String, Object> m3358R0(User user, UserLiveState userLiveState, String str) {
        HashMap<String, Object> map = new HashMap<>();
        boolean z = (userLiveState == null || TextUtils.isEmpty(userLiveState.multiCallInfo.onGoingMultiCallId)) ? false : true;
        map.put("liveId", CoreModule.Q().getUserLiveId(((DbObject) user).id));
        map.put("anchorId", ((DbObject) user).id);
        map.put("index", "NA");
        map.put("module", "e_profile_album");
        map.put("trace_id", "");
        map.put("live_status", (userLiveState == null || !userLiveState.isLiveOpened()) ? "off" : "on");
        map.put("right_recommend_type", "");
        if (!z) {
            userLiveState = null;
        }
        map.put("live_room_live_type", m3356Q0(userLiveState));
        map.put("show_label", z ? "连线" : "");
        map.put("refer_pid", "home_card".equals(str) ? "home_card" : "");
        map.put("liveRecommendCategory", "NA");
        if (CoreModule.c.m0.L6(((DbObject) user).id) && "home_card".equals(str)) {
            map.put("live_enter_source", "suggest_live_card_profile");
            return map;
        }
        map.put("live_enter_source", "NA");
        return map;
    }

    /* JADX INFO: renamed from: R1 */
    public void m3359R1() {
        User userMo1517K2 = mo3351O().mo1517K2();
        if (this.f1884x.getCurrentItem() >= this.f1848P0.getCount() - 1) {
            m3290M1(true);
            lra0.g("p_suggest_user_profile_info_view", false, false, userMo1517K2, "");
        } else {
            VPager_SquaredRefactor vPager_SquaredRefactor = this.f1884x;
            vPager_SquaredRefactor.T(vPager_SquaredRefactor.getCurrentItem() + 1, false);
            lra0.g("p_suggest_user_profile_info_view", true, false, userMo1517K2, "");
        }
    }

    /* JADX INFO: renamed from: S0 */
    public int m3360S0() {
        return this.f1858U0;
    }

    /* JADX INFO: renamed from: S1 */
    public void m3361S1(int i) {
        if (NullChecker.a(this.f1881u) && NullChecker.a(this.f1853S) && NullChecker.a(this.f1882v)) {
            this.f1860V0 = i;
            int i2 = ((int) ((f1820l1 - i) * this.f1862W0)) + (i / 2);
            if (this.f1864X0.isEmpty() || i >= f1820l1 || i2 <= 0) {
                return;
            }
            for (Integer num : this.f1864X0.keySet()) {
                num.intValue();
                if (NullChecker.a(this.f1864X0.get(num))) {
                    xdl0.C0(this.f1864X0.get(num), i2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m3362T0() {
        if (!mo3351O().mo2745Z1()) {
            xdl0.M(this.f1839L, false);
        }
        xdl0.M(this.f1831H, false);
        xdl0.M(this.f1839L, false);
        xdl0.M(this.f1825E, false);
        xdl0.M(this.f1853S, false);
        xdl0.M(this.f1835J, false);
    }

    /* JADX INFO: renamed from: T1 */
    public void m3363T1(User user, int i) {
        if (!NullChecker.a(user) || i >= user.pictures.size() || this.f1871c1 == i) {
            return;
        }
        zvf0.A("e_profilePhoto", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("url", ((Media) user.picture(i)).url), vwb.Y("moments_user_id", mo3351O().userId())});
        PictureView pictureViewM3412E = this.f1848P0.m3412E(this.f1884x.getCurrentItem());
        if (pictureViewM3412E instanceof PictureView) {
            PictureView pictureView = pictureViewM3412E;
            if (upa.u2() && xdl0.O0(pictureView.s)) {
                zvf0.A("e_invisible_photo_upload", "p_suggest_user_profile_info_view", new j760[]{vwb.Y("invisible_photo_location", Integer.valueOf(i)), vwb.Y("need_photo_count", Integer.valueOf(3 - CoreModule.c.e0.na().pictures.size())), vwb.Y("invisible_photo_is_thumbnail", Boolean.FALSE)});
            }
        }
        this.f1871c1 = i;
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m3364U0() {
        PictureView pictureViewM3412E = this.f1848P0.m3412E(this.f1884x.getCurrentItem());
        if (!(pictureViewM3412E instanceof PictureView)) {
            return false;
        }
        PictureView pictureView = pictureViewM3412E;
        if (upa.u2() && xdl0.O0(pictureView.s)) {
            return true;
        }
        return ((Boolean) pictureView.I0.e()).booleanValue();
    }

    /* JADX INFO: renamed from: V0 */
    public void m3365V0(View view, boolean z) {
        mo3351O().mo2744Z(0);
        this.f1878j1 = false;
        lra0.v = false;
        if (NullChecker.a(this.f1874f1) && !this.f1874f1.isUnsubscribed()) {
            this.f1874f1.unsubscribe();
            this.f1874f1 = null;
        }
        if (mo3351O().mo1501D2()) {
            CoreModule.c.e0.W0.put(Boolean.TRUE);
        }
        if (z) {
            CoreModule.c.e0.W0.put(Boolean.TRUE);
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeView(view);
        if (!z || this.f1850Q0) {
            return;
        }
        m3339H0();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m3366W0() {
        this.f1868Z0.add(this.f1843N);
        this.f1868Z0.add(this.f1855T);
        this.f1868Z0.add(this.f1865Y);
        this.f1868Z0.add(this.f1867Z);
        this.f1868Z0.add(this.f1879k0);
        this.f1868Z0.add(this.f1880p0);
        this.f1868Z0.add(this.f1826E0);
        this.f1868Z0.add(this.f1844N0);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m3367X0(int i) {
        PictureView pictureViewM3412E = this.f1848P0.m3412E(i);
        if (pictureViewM3412E instanceof PictureView) {
            PictureView pictureView = pictureViewM3412E;
            if (!upa.y2() || (mo3351O().mo1517K2() != null && mo3351O().mo1517K2().isMe())) {
                C0162c c0162c = this.f1848P0;
                c0162c.m3424S(pictureView, c0162c.f1895g.get(i), -1, i);
            } else {
                C0162c c0162c2 = this.f1848P0;
                c0162c2.m3425T(pictureView, c0162c2.f1895g.get(i), i);
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m3368Y0() {
        String strFrom = mo3351O().from();
        boolean zMo1570m0 = mo3351O().mo1570m0();
        if ("home_menu".equals(strFrom) || "preview_card".equals(strFrom) || zMo1570m0) {
            return;
        }
        if (NullChecker.a(m3288F0().getSupportActionBar())) {
            m3288F0().getSupportActionBar().m();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1823C.getLayoutParams();
        marginLayoutParams.topMargin = m3288F0().getResources().getDimensionPixelOffset(v1c0.d);
        marginLayoutParams.rightMargin = m3288F0().getResources().getDimensionPixelOffset(v1c0.c);
        this.f1823C.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m3369a1() {
        return TextUtils.equals(mo3351O().from(), "live_profile_voice_mask_mode");
    }

    /* JADX INFO: renamed from: b1 */
    public final boolean m3370b1(User user) {
        return mo3351O().mo2762c3(user);
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m3371c1(User user) {
        return mo3351O().mo2821m3(user);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ Bitmap m3372d1() throws Exception {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f1882v.getWidth(), this.f1882v.getHeight(), Bitmap.Config.ARGB_4444);
        this.f1882v.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ c m3373e1() {
        return c.fromCallable(new Callable() { // from class: l.xo90
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f22385a.m3372d1();
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ Drawable m3374f1(Bitmap bitmap) {
        bfd0 bfd0VarA = cfd0.a(m3288F0().getResources(), bitmap);
        bfd0VarA.e(t100.d(0.0f));
        return bfd0VarA;
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m3375g1(Long l2) {
        m3365V0(this.f1875g1, false);
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m3376h1(Throwable th) {
        m3365V0(this.f1875g1, false);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m3377i1(boolean z, long j, Drawable drawable) {
        m3340H1(drawable, z);
        if (j >= 0) {
            m3288F0().duringCreated(c.timer(j, TimeUnit.MILLISECONDS)).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.yo90
                public final void call(Object obj) {
                    this.f23000a.m3375g1((Long) obj);
                }
            }, new e30() { // from class: l.zo90
                public final void call(Object obj) {
                    this.f23522a.m3376h1((Throwable) obj);
                }
            }));
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f1884x.setAdapter(this.f1848P0);
        this.f1884x.d(new C0160a());
        ((LinearLayout.LayoutParams) this.f1885y.getLayoutParams()).gravity = mo3351O().mo2860s1() ? 3 : 1;
        mo3351O().mo2724W().addOnScrollListener(new C0161b(view));
        m3368Y0();
        xdl0.E0(this.f1831H, new View.OnClickListener() { // from class: l.cp90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f8853a.m3313l1(view2);
            }
        });
        m3300Z0();
        m3341I0();
        m3287E1();
        if (mo3351O().mo2881v2()) {
            this.f1827F.setVisibility(4);
        }
        if (upa.V1() && (TextUtils.equals(mo3351O().from(), "chat_group_anonymity") || TextUtils.equals(mo3351O().from(), "group_notification_anonymity"))) {
            xdl0.M(this.f1822B, true);
            xdl0.E0(this.f1822B, new View.OnClickListener() { // from class: l.dp90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f9380a.m3315m1(view2);
                }
            });
            User userMo1517K2 = mo3351O().mo1517K2();
            if (NullChecker.a(userMo1517K2)) {
                qib0.G.Z0(this.f1822B, tbk.k(userMo1517K2));
            } else {
                qib0.G.Z0(this.f1822B, tbk.n());
            }
        }
        if (upa.u2() && mo3351O().mo1526R()) {
            m14461p().duringCreated(CoreModule.c.e0.o9()).distinctUntilChanged(new w9j() { // from class: l.ep90
                public final Object call(Object obj) {
                    return ((User) obj).pictures;
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.fp90
                public final void call(Object obj) {
                    this.f10583a.m3381n1((User) obj);
                }
            }));
        }
        if (!r65.m() && !sb90.e(mo3351O().mo1517K2())) {
            xdl0.M(this.f1826E0, false);
            return;
        }
        User userMo1517K3 = mo3351O().mo1517K2();
        if ((!NullChecker.a(userMo1517K3) || !NullChecker.a(userMo1517K3.settings) || !userMo1517K3.settings.isCityTop()) && !TextUtils.equals(mo3351O().from(), "from_city_center_conv_banner")) {
            xdl0.M(this.f1826E0, false);
            return;
        }
        xdl0.M(this.f1826E0, true);
        xdl0.M(this.f1853S, false);
        this.f1828F0.setBackgroundResource(x2c0.v5);
        CityC cityTopInfo = userMo1517K3.settings.getCityTopInfo();
        if (NullChecker.a(cityTopInfo)) {
            this.f1840L0.setText(r65.l().k(cityTopInfo.cost));
        }
        if (!NullChecker.a(m3288F0()) || m3288F0().isFinishing()) {
            return;
        }
        e51.F(m3288F0(), new Runnable() { // from class: l.gp90
            @Override // java.lang.Runnable
            public final void run() {
                this.f11573a.m3318o1();
            }
        });
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ Boolean m3378j1(com.p1.mobile.android.app.c cVar) {
        return Boolean.valueOf(cVar.equals(com.p1.mobile.android.app.c.h) && NullChecker.a(this.f1875g1));
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo2919k() {
        return false;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m3379k1(com.p1.mobile.android.app.c cVar) {
        m3365V0(this.f1875g1, false);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return !mo3351O().mo1570m0();
    }

    @Override // p002l.ah90, p002l.hn2
    /* JADX INFO: renamed from: m */
    public boolean mo3380m() {
        return true;
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m3381n1(User user) {
        if (NullChecker.a(this.f1884x)) {
            m3367X0(this.f1884x.getCurrentItem());
        }
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        User userMo1517K2 = mo3351O().mo1517K2();
        mo3351O().mo1570m0();
        mo3351O().mo1523P1();
        dbl0.a(this.f1884x, false);
        if (mo3351O().mo2899y2()) {
            this.f1829G.b(i);
        }
        if (NullChecker.a(this.f1848P0.m3412E(i)) && !(this.f1848P0.m3412E(i) instanceof PictureView) && !w9a0.m().o()) {
            w9a0.m().D(true);
        }
        if (this.f1848P0.m3412E(i) instanceof PictureView) {
            if (this.f1872d1 && !xdl0.O0(this.f1855T)) {
                this.f1855T.setVisibility(0);
            }
            if (this.f1873e1 && !xdl0.O0(this.f1865Y) && userMo1517K2.receiveSuperLikeNum() > 1) {
                this.f1865Y.setVisibility(0);
            } else if (this.f1873e1 && !xdl0.O0(this.f1867Z)) {
                this.f1867Z.setVisibility(0);
            }
        } else {
            this.f1855T.setVisibility(8);
            this.f1867Z.setVisibility(8);
            this.f1865Y.setVisibility(8);
        }
        PictureView pictureViewM3412E = this.f1848P0.m3412E(i);
        m3363T1(userMo1517K2, i);
        if (!NullChecker.a(pictureViewM3412E) || !xij0.d0() || mo3351O().mo2881v2() || m3371c1(userMo1517K2) || m3370b1(userMo1517K2) || m3369a1() || sb90.c(mo3351O().mo1517K2())) {
            return;
        }
        if ((!mo3351O().mo2899y2() || this.f1848P0.getCount() < 2 || ((Boolean) CoreModule.c.e0.W0.get()).booleanValue()) && !m3289K0() && mo3351O().lifecycle_() == com.p1.mobile.android.app.c.i && (pictureViewM3412E instanceof PictureView)) {
            pictureViewM3412E.V();
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m3382q1(Boolean bool) {
        mo3351O().mo2724W().requestDisallowInterceptTouchEvent(bool.booleanValue());
    }

    @Override // p002l.ah90, p002l.hn2
    /* JADX INFO: renamed from: r */
    public void mo3383r(View view) {
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m3384r1() {
        xdl0.C0(this.f1821A, this.f1884x.getHeight());
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        m3334D0(mo3351O().mo2652M0());
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext()) { // from class: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileImagesItemHolder.1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return ProfileImagesItemHolder.this.f1881u.dispatchTouchEvent(motionEvent);
            }

            @Override // android.view.ViewGroup
            public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
                return ProfileImagesItemHolder.this.f1881u.onInterceptHoverEvent(motionEvent);
            }

            @Override // android.widget.FrameLayout, android.view.View
            public void onMeasure(int i, int i2) {
                setMeasuredDimension(ProfileImagesItemHolder.this.f1881u.getMeasuredWidth(), ProfileImagesItemHolder.this.f1881u.getMeasuredHeight());
            }

            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return ProfileImagesItemHolder.this.f1881u.onTouchEvent(motionEvent);
            }
        };
        this.f1881u.m1159Q(new e30() { // from class: l.hp90
            public final void call(Object obj) {
                this.f12209a.m3382q1((Boolean) obj);
            }
        });
        m3366W0();
        return frameLayout;
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m3385s1(List list, Boolean bool) {
        if (!bool.booleanValue()) {
            this.f1858U0 = -1;
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        AdmobMedia admobMedia = new AdmobMedia();
        this.f1858U0 = arrayList.size();
        arrayList.add(admobMedia);
        this.f1848P0.m3423R(arrayList);
        VPagerCircleIndicator vPagerCircleIndicator = this.f1885y;
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f1884x;
        vPagerCircleIndicator.c(vPager_SquaredRefactor, vPager_SquaredRefactor.getCurrentItem());
        this.f1885y.invalidate();
        xdl0.M0(this.f1885y, arrayList.size() > 1);
        if (mo3351O().mo2899y2()) {
            this.f1829G.setIndicatorCount(arrayList.size());
        }
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        User userMo1517K2 = mo3351O().mo1517K2();
        boolean zMo1570m0 = mo3351O().mo1570m0();
        final ArrayList arrayList = new ArrayList();
        if (!zMo1570m0) {
            arrayList.addAll(userMo1517K2.pictures);
            e51.y(new RunnableC0163d(userMo1517K2, zMo1570m0));
            this.f1848P0.m3423R(arrayList);
            VPagerCircleIndicator vPagerCircleIndicator = this.f1885y;
            VPager_SquaredRefactor vPager_SquaredRefactor = this.f1884x;
            vPagerCircleIndicator.c(vPager_SquaredRefactor, vPager_SquaredRefactor.getCurrentItem());
            this.f1885y.setOnPageChangeListener(this);
            this.f1885y.invalidate();
            xdl0.M0(this.f1885y, userMo1517K2.pictures.size() > 1);
            if (mo3351O().mo2899y2()) {
                xdl0.M(this.f1885y, false);
            }
            m3335D1();
            m3336F1(userMo1517K2);
            if (sb90.c(mo3351O().mo1517K2())) {
                m3333C1(userMo1517K2);
            } else if (NullChecker.a(this.f1869a1)) {
                xdl0.M(this.f1869a1, false);
            }
            if (w9a0.m().p(userMo1517K2) && m14465w().mo2625I1() && arrayList.size() >= 2) {
                m3288F0().duringCreated(w9a0.m().y(m3288F0(), false)).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.jo90
                    public final void call(Object obj) {
                        this.f13882a.m3385s1(arrayList, (Boolean) obj);
                    }
                }, new z60()));
            } else {
                this.f1858U0 = -1;
            }
        }
        if (mo3351O().mo2899y2()) {
            this.f1829G.setIndicatorCount(arrayList.size());
            if (mo3351O().mo1517K2().pictures.size() <= 1) {
                xdl0.M(this.f1829G, false);
            }
        }
        boolean zO0 = xdl0.O0(this.f1829G);
        VImage vImage = this.f1831H;
        if (zO0) {
            int i = t100.o;
            xdl0.X(vImage, i);
            xdl0.X(this.f1839L, i);
            xdl0.X(this.f1837K, i);
            xdl0.X(this.f1835J, i);
        } else {
            int i2 = t100.h;
            xdl0.X(vImage, i2);
            xdl0.X(this.f1839L, i2);
            xdl0.X(this.f1837K, i2);
            xdl0.X(this.f1835J, i2);
        }
        this.f1856T0++;
        if (m9644I()) {
            m3353O1();
            this.f1848P0.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m3386t1(String str, String str2, User user, UserLiveState userLiveState, View view) {
        if (mo3351O().mo1523P1()) {
            CoreModule.Q().F8(m3288F0(), false, true, (String) null);
        } else {
            CoreModule.Q().startAudienceLive(m3288F0(), CoreModule.Q().getUserLiveId(str), "profile", (String) null);
        }
        if (CoreModule.c.m0.L6(str) && TextUtils.equals("home_card", str2)) {
            ttn.a("p_suggest_user_profile_info_view", user);
        } else {
            zvf0.s("e_live_room_enter", "p_suggest_user_profile_info_view", m3358R0(user, userLiveState, str2));
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m3387u1(View view) {
        o6j0.c("e_profile_guide_first", mo3351O().pageId(), new o6j0.a[0]);
        m3365V0(view, true);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m3388v1(e30 e30Var) {
        if (e30Var != null) {
            e30Var.call(this.f1839L);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m3389w1() {
        if (m3350N1()) {
            m3346L0(-1L, false);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m3390x1(boolean z) {
        if (!z) {
            xdl0.C0(this.f1839L, t100.d(32.0f));
            xdl0.c0(this.f1837K, 0);
            xdl0.c0(this.f1839L, 0);
            xdl0.c0(this.f1831H, 0);
            return;
        }
        VImage vImage = this.f1837K;
        int i = t100.t;
        xdl0.c0(vImage, i);
        xdl0.c0(this.f1839L, i);
        xdl0.C0(this.f1839L, t100.d(62.0f));
        xdl0.c0(this.f1831H, i);
    }

    /* JADX INFO: renamed from: y1 */
    public void m3391y1() {
        m3287E1();
    }

    /* JADX INFO: renamed from: z1 */
    public void m3392z1() {
        m3362T0();
    }
}
