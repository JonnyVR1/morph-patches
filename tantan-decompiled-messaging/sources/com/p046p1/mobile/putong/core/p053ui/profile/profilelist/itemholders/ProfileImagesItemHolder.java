package com.p046p1.mobile.putong.core.p053ui.profile.profilelist.itemholders;

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
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.facebook.imagepipeline.common.Priority;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.data.LikedUser;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p046p1.mobile.putong.core.newui.view.CoreSupremePartnerMysteriousModeCoverView;
import com.p046p1.mobile.putong.core.newui.view.LiveLightView;
import com.p046p1.mobile.putong.core.p053ui.PictureView;
import com.p046p1.mobile.putong.core.p053ui.account.JailedDialogLikeAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ParallaxView;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfilePictureItemView;
import com.p046p1.mobile.putong.core.p053ui.profile.TagGuidePicAct;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.PerformanceLogUtil;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.ProfileLogEntity;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.AdmobMedia;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ClipRectFrameLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.views.VPager_SquaredRefactor;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p046p1.mobile.putong.data.CityC;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveState;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
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
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p147v.VDivider;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VPagerCircleIndicator;
import p147v.VText;
import p149l.a1m;
import p149l.ah90;
import p149l.az50;
import p149l.bfd0;
import p149l.bkb0;
import p149l.bt0;
import p149l.c4g0;
import p149l.cfd0;
import p149l.d30;
import p149l.dbl0;
import p149l.e30;
import p149l.e51;
import p149l.eb2;
import p149l.f6c0;
import p149l.ftd0;
import p149l.j760;
import p149l.jo0;
import p149l.l480;
import p149l.lra0;
import p149l.mcr;
import p149l.mkd0;
import p149l.o6j0;
import p149l.o7r;
import p149l.q660;
import p149l.q8p;
import p149l.qib0;
import p149l.qp8;
import p149l.r4w;
import p149l.r65;
import p149l.sb90;
import p149l.sth0;
import p149l.t100;
import p149l.tbk;
import p149l.tm90;
import p149l.ttn;
import p149l.u4c0;
import p149l.upa;
import p149l.v1c0;
import p149l.v9j;
import p149l.vp90;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9a0;
import p149l.w9j;
import p149l.x0m;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xij0;
import p149l.xp5;
import p149l.xx0;
import p149l.z60;
import p149l.zub;
import p149l.zvf0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileImagesItemHolder extends ah90 implements ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: k1 */
    public static int f33997k1 = (int) (xdl0.m208412y0() * 0.25f);

    /* JADX INFO: renamed from: l1 */
    public static int f33998l1 = (int) (xdl0.m208412y0() * 1.25f);

    /* JADX INFO: renamed from: A */
    public ViewStub f33999A;

    /* JADX INFO: renamed from: B */
    public VDraweeView f34000B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f34001C;

    /* JADX INFO: renamed from: D */
    public VImage f34002D;

    /* JADX INFO: renamed from: E */
    public View f34003E;

    /* JADX INFO: renamed from: E0 */
    public VFrame f34004E0;

    /* JADX INFO: renamed from: F */
    public FrameLayout f34005F;

    /* JADX INFO: renamed from: F0 */
    public ClipRectFrameLayout f34006F0;

    /* JADX INFO: renamed from: G */
    public NewPictureContainerIndicator f34007G;

    /* JADX INFO: renamed from: G0 */
    public VDraweeView f34008G0;

    /* JADX INFO: renamed from: H */
    public VImage f34009H;

    /* JADX INFO: renamed from: H0 */
    public View f34010H0;

    /* JADX INFO: renamed from: I */
    public VImage f34011I;

    /* JADX INFO: renamed from: I0 */
    public SVGAnimationView f34012I0;

    /* JADX INFO: renamed from: J */
    public VText f34013J;

    /* JADX INFO: renamed from: J0 */
    public SVGAnimationView f34014J0;

    /* JADX INFO: renamed from: K */
    public VImage f34015K;

    /* JADX INFO: renamed from: K0 */
    public TextView f34016K0;

    /* JADX INFO: renamed from: L */
    public LinearLayout f34017L;

    /* JADX INFO: renamed from: L0 */
    public TextView f34018L0;

    /* JADX INFO: renamed from: M */
    public VImage f34019M;

    /* JADX INFO: renamed from: M0 */
    public SVGAnimationView f34020M0;

    /* JADX INFO: renamed from: N */
    public FrameLayout f34021N;

    /* JADX INFO: renamed from: N0 */
    public VDraweeView f34022N0;

    /* JADX INFO: renamed from: O */
    public LiveLightView f34023O;

    /* JADX INFO: renamed from: O0 */
    public VFrame f34024O0;

    /* JADX INFO: renamed from: P */
    public VText f34025P;

    /* JADX INFO: renamed from: P0 */
    public final C8737c f34026P0;

    /* JADX INFO: renamed from: Q */
    public VImage f34027Q;

    /* JADX INFO: renamed from: Q0 */
    public boolean f34028Q0;

    /* JADX INFO: renamed from: R */
    public TextView f34029R;

    /* JADX INFO: renamed from: R0 */
    public boolean f34030R0;

    /* JADX INFO: renamed from: S */
    public FrameLayout f34031S;

    /* JADX INFO: renamed from: S0 */
    public boolean f34032S0;

    /* JADX INFO: renamed from: T */
    public LinearLayout f34033T;

    /* JADX INFO: renamed from: T0 */
    public int f34034T0;

    /* JADX INFO: renamed from: U */
    public SVGAnimationView f34035U;

    /* JADX INFO: renamed from: U0 */
    public int f34036U0;

    /* JADX INFO: renamed from: V */
    public LinearLayout f34037V;

    /* JADX INFO: renamed from: V0 */
    public int f34038V0;

    /* JADX INFO: renamed from: W */
    public VText f34039W;

    /* JADX INFO: renamed from: W0 */
    public float f34040W0;

    /* JADX INFO: renamed from: X */
    public VImage f34041X;

    /* JADX INFO: renamed from: X0 */
    public Map<Integer, View> f34042X0;

    /* JADX INFO: renamed from: Y */
    public SuperLikeComboAnimView f34043Y;

    /* JADX INFO: renamed from: Y0 */
    public int f34044Y0;

    /* JADX INFO: renamed from: Z */
    public VImage f34045Z;

    /* JADX INFO: renamed from: Z0 */
    public List<View> f34046Z0;

    /* JADX INFO: renamed from: a1 */
    public CoreSupremePartnerMysteriousModeCoverView f34047a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f34048b1;

    /* JADX INFO: renamed from: c1 */
    public int f34049c1;

    /* JADX INFO: renamed from: d1 */
    public boolean f34050d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f34051e1;

    /* JADX INFO: renamed from: f1 */
    public c4g0 f34052f1;

    /* JADX INFO: renamed from: g1 */
    public View f34053g1;

    /* JADX INFO: renamed from: h1 */
    public int f34054h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f34055i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f34056j1;

    /* JADX INFO: renamed from: k0 */
    public VImage f34057k0;

    /* JADX INFO: renamed from: p0 */
    public VDraweeView f34058p0;

    /* JADX INFO: renamed from: u */
    public ParallaxView f34059u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f34060v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f34061w;

    /* JADX INFO: renamed from: x */
    public VPager_SquaredRefactor f34062x;

    /* JADX INFO: renamed from: y */
    public VPagerCircleIndicator f34063y;

    /* JADX INFO: renamed from: z */
    public View f34064z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileImagesItemHolder$a */
    public class C8735a implements ViewPager.InterfaceC0716j {
        public C8735a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            ProfileImagesItemHolder.this.f34044Y0 = i;
            ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
            profileImagesItemHolder.m52792J0(profileImagesItemHolder.f34044Y0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileImagesItemHolder$b */
    public class C8736b extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public final int[] f34067a = new int[2];

        /* JADX INFO: renamed from: b */
        public int f34068b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f34069c;

        public C8736b(View view) {
            this.f34069c = view;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void m52843b() {
            if (this.f34069c.isAttachedToWindow()) {
                this.f34069c.getLocationInWindow(this.f34067a);
                int[] iArr = this.f34067a;
                if (iArr[1] > 0) {
                    iArr[1] = 0;
                }
                ProfileImagesItemHolder.this.f34059u.setScroll(Math.abs(iArr[1]));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                e51.m114744I(ProfileImagesItemHolder.this.mo52800O().mo51066J1(), new Runnable() { // from class: l.jp90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f119135a.m52843b();
                    }
                }, 6L);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            m52843b();
            this.f34068b -= i2;
            ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
            if (profileImagesItemHolder.f34056j1 && NullChecker.m81303a(profileImagesItemHolder.f34053g1)) {
                ProfileImagesItemHolder profileImagesItemHolder2 = ProfileImagesItemHolder.this;
                profileImagesItemHolder2.m52814V0(profileImagesItemHolder2.f34053g1, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileImagesItemHolder$c */
    public class C8737c extends eb2 {

        /* JADX INFO: renamed from: e */
        public boolean f34071e;

        /* JADX INFO: renamed from: f */
        public boolean f34072f;

        /* JADX INFO: renamed from: g */
        public List<Media> f34073g = new ArrayList();

        /* JADX INFO: renamed from: h */
        public Stack<View> f34074h = new Stack<>();

        /* JADX INFO: renamed from: i */
        public int f34075i = 0;

        public C8737c() {
        }

        /* JADX INFO: renamed from: D */
        private Act m52847D() {
            return ProfileImagesItemHolder.this.mo52800O().act();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: K */
        public /* synthetic */ void m52848K(View view) {
            if (ProfileImagesItemHolder.this.f34028Q0) {
                ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
                if (profileImagesItemHolder.f34056j1 || (profileImagesItemHolder.m52813U0() && ProfileImagesItemHolder.this.m52799N1())) {
                    ProfileImagesItemHolder.this.m52795L0(4000L, true);
                    return;
                }
            }
            ProfileImagesItemHolder.this.m52808R1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: L */
        public /* synthetic */ void m52849L(View view) {
            if (ProfileImagesItemHolder.this.f34028Q0) {
                ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
                if (profileImagesItemHolder.f34056j1 || (profileImagesItemHolder.m52813U0() && ProfileImagesItemHolder.this.m52799N1())) {
                    ProfileImagesItemHolder.this.m52795L0(4000L, true);
                    return;
                }
            }
            ProfileImagesItemHolder.this.m52804P1();
        }

        /* JADX INFO: renamed from: W */
        private void m52850W(PictureView pictureView, Media media) {
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(ProfileImagesItemHolder.this.mo52800O().mo51069K2().f56011id);
            if (NullChecker.m81303a(pictureView) && NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isQuickChatClearAvatar(CoreModule.f17545c.f19639e0.m169520na())) {
                qib0.f154691G.m102331L0(pictureView.f28070a, media.url);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: v */
        public static /* synthetic */ Integer m52856v(j760 j760Var) {
            return (Integer) j760Var.f116564a;
        }

        /* JADX INFO: renamed from: E */
        public View m52861E(int i) {
            View viewM52862F = m52862F(i);
            return (NullChecker.m81303a(viewM52862F) && (viewM52862F instanceof ProfilePictureItemView)) ? ((ProfilePictureItemView) viewM52862F).f33042b : viewM52862F;
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
        public View m52862F(int i) {
            if (ProfileImagesItemHolder.this.f34062x != null) {
                for (int i2 = 0; i2 < ProfileImagesItemHolder.this.f34062x.getChildCount(); i2++) {
                    Object tag = ProfileImagesItemHolder.this.f34062x.getChildAt(i2).getTag();
                    if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                        return ProfileImagesItemHolder.this.f34062x.getChildAt(i2);
                    }
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("images is null from : ");
            sb.append(ProfileImagesItemHolder.this.mo52800O().from());
            sb.append(" content is null ");
            sb.append(ProfileImagesItemHolder.this.mo52800O().mo52123M0() == null);
            sb.append(" life + ");
            sb.append(ProfileImagesItemHolder.this.mo52800O().lifecycle_().f15557c);
            sb.append(" hasRender ");
            sb.append(ProfileImagesItemHolder.this.m131817h());
            CrashHelper.m81296c(new IllegalStateException(sb.toString()));
            return null;
        }

        /* JADX INFO: renamed from: G */
        public final void m52863G(PictureView pictureView) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pictureView.f28076g.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.bottomMargin = 0;
            layoutParams.topMargin = 0;
            layoutParams.rightMargin = 0;
            layoutParams.leftMargin = 0;
            pictureView.f28076g.setLayoutParams(layoutParams);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m52864H(int i) {
            this.f34073g.remove(i);
            this.f34071e = true;
            ProfileImagesItemHolder.this.f34026P0.m52872R(this.f34073g);
            if (ProfileImagesItemHolder.this.mo52800O().mo52366y2()) {
                ProfileImagesItemHolder.this.f34007G.setIndicatorCount(this.f34073g.size());
            }
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m52865I(PictureView pictureView, int i, Integer num) {
            if (num.intValue() >= 100) {
                xdl0.m208344M(pictureView.f28073d, false);
            }
            m52871Q(pictureView, this.f34073g.get(i), num.intValue());
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m52866J(PictureView pictureView, boolean z, boolean z2, View view) {
            int iM43989T = pictureView.m43989T();
            if (iM43989T == -1 && ProfileImagesItemHolder.this.f34062x.getCurrentItem() > 0) {
                VPager_SquaredRefactor vPager_SquaredRefactor = ProfileImagesItemHolder.this.f34062x;
                vPager_SquaredRefactor.setCurrentItem(vPager_SquaredRefactor.getCurrentItem() - 1);
                return;
            }
            if (iM43989T == 1 && ProfileImagesItemHolder.this.f34062x.getCurrentItem() < getCount() - 1) {
                VPager_SquaredRefactor vPager_SquaredRefactor2 = ProfileImagesItemHolder.this.f34062x;
                vPager_SquaredRefactor2.setCurrentItem(vPager_SquaredRefactor2.getCurrentItem() + 1);
            } else {
                if (iM43989T != 0 || ProfileImagesItemHolder.this.mo52800O().mo52130N2()) {
                    return;
                }
                if (z && !z2 && (ProfileImagesItemHolder.this.mo52800O().act() instanceof NewUI1ContainerActivity)) {
                    ProfileImagesItemHolder.this.mo52800O().act().startActivity(ProfileAct.m50738p2(ProfileImagesItemHolder.this.mo52800O().act(), ProfileImagesItemHolder.this.mo52800O().userId(), "profile_frag_picture", false, true));
                } else {
                    ProfileImagesItemHolder.this.mo52800O().m52338tc();
                }
            }
        }

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ void m52867M(boolean z, View view) {
            if (ProfileImagesItemHolder.this.f34028Q0) {
                ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
                if (profileImagesItemHolder.f34056j1 || (profileImagesItemHolder.m52813U0() && ProfileImagesItemHolder.this.m52799N1())) {
                    ProfileImagesItemHolder.this.m52795L0(4000L, true);
                    return;
                }
            }
            if (z && ProfileImagesItemHolder.this.m52813U0() && ProfileImagesItemHolder.this.m52799N1()) {
                ProfileImagesItemHolder.this.m52795L0(4000L, true);
            } else {
                lra0.m151149h("hotspot");
                ProfileImagesItemHolder.this.mo52800O().mo51123o();
            }
        }

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ void m52868N(int i, View view) {
            zvf0.m220399u("e_invisible_photo_upload", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("invisible_photo_location", Integer.valueOf(i)), vwb.m200311Y("invisible_photo_is_thumbnail", Boolean.FALSE));
            q660.m173125a(m52847D(), CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO);
        }

        /* JADX INFO: renamed from: O */
        public final /* synthetic */ void m52869O(int i, View view) {
            if (CoreModule.f17545c.f19639e0.m169527p9().isBanned()) {
                JailedDialogLikeAct.m44186o2(true);
                return;
            }
            if (CoreModule.f17545c.f19639e0.m169527p9().isProfileJailed()) {
                xx0.m211440i(m52847D(), false);
                return;
            }
            sth0.m185950b().m185954e(CoreModule.f17545c.f19639e0.m169520na().mo223809clone());
            m52847D().startActivity(TagGuidePicAct.m50772Y1(m52847D(), true, "from_upload_pic", "from_complete_equity_guide"));
            zvf0.m220399u("e_invisible_photo_upload", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("invisible_photo_location", Integer.valueOf(i)), vwb.m200311Y("need_photo_count", Integer.valueOf(3 - CoreModule.f17545c.f19639e0.m169520na().pictures.size())), vwb.m200311Y("invisible_photo_is_thumbnail", Boolean.FALSE));
        }

        /* JADX INFO: renamed from: P */
        public final /* synthetic */ void m52870P(View view) {
            ProfileImagesItemHolder.this.mo52800O().mo51113j3(SwipeDirection.UP.getValue());
        }

        /* JADX INFO: renamed from: Q */
        public void m52871Q(PictureView pictureView, Media media, int i) {
            if (ProfileImagesItemHolder.this.m96413I()) {
                return;
            }
            if (sb90.m183207c(ProfileImagesItemHolder.this.mo52800O().mo51069K2())) {
                pictureView.m44002g0(media);
            } else {
                pictureView.m43994Y(media, i);
            }
            m52850W(pictureView, media);
            ProfileImagesItemHolder.this.mo52800O().mo52158R1(i);
        }

        /* JADX INFO: renamed from: R */
        public void m52872R(List<Media> list) {
            if (list.equals(this.f34073g) && !this.f34071e) {
                ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
                profileImagesItemHolder.m52812T1(profileImagesItemHolder.mo52800O().mo51069K2(), ProfileImagesItemHolder.this.m52798N0());
            } else {
                this.f34071e = false;
                this.f34075i = getCount();
                this.f34073g = list;
                ProfileImagesItemHolder.this.f34026P0.notifyDataSetChanged();
            }
        }

        /* JADX INFO: renamed from: S */
        public void m52873S(PictureView pictureView, Media media, int i, int i2) {
            if (ProfileImagesItemHolder.this.m96413I()) {
                return;
            }
            if (sb90.m183207c(ProfileImagesItemHolder.this.mo52800O().mo51069K2())) {
                xdl0.m208345M0(pictureView.f28090s, false);
                pictureView.m44002g0(media);
                return;
            }
            if (CoreModule.m29932K().me_().pictures.size() != 1 || ProfileImagesItemHolder.this.mo52800O().mo51069K2().isMe()) {
                xdl0.m208345M0(pictureView.f28090s, false);
                pictureView.m43994Y(media, i);
                m52850W(pictureView, media);
                ProfileImagesItemHolder.this.mo52800O().mo52158R1(i);
                return;
            }
            int iM194743e0 = upa.m194743e0();
            if (iM194743e0 >= 1 && i2 == iM194743e0) {
                m52876V(pictureView, media, i2);
                return;
            }
            xdl0.m208345M0(pictureView.f28090s, false);
            pictureView.m43994Y(media, i);
            m52850W(pictureView, media);
            ProfileImagesItemHolder.this.mo52800O().mo52158R1(i);
        }

        /* JADX INFO: renamed from: T */
        public void m52874T(PictureView pictureView, Media media, final int i) {
            if (ProfileImagesItemHolder.this.mo52800O().mo51069K2() == null || ProfileImagesItemHolder.this.mo52800O().mo51069K2().isMe() || ProfileImagesItemHolder.this.mo52800O().mo51069K2().onlineMatchAvatarUnlock(true) || ProfileImagesItemHolder.this.m96413I()) {
                return;
            }
            if (sb90.m183207c(ProfileImagesItemHolder.this.mo52800O().mo51069K2())) {
                xdl0.m208345M0(pictureView.f28090s, false);
                pictureView.m44002g0(media);
                return;
            }
            int size = CoreModule.f17545c.f19639e0.m169527p9().pictures.size();
            boolean z = i >= size && size <= 2;
            xdl0.m208344M(pictureView.f28090s, z);
            if (!z) {
                pictureView.m43994Y(media, -1);
                m52850W(pictureView, media);
                ProfileImagesItemHolder.this.mo52800O().mo52158R1(-1);
                return;
            }
            pictureView.m43998c0(media, true);
            pictureView.f28092u.setText(String.format("再上传%s张照片\n即可查看%s的全部照片", Integer.valueOf(3 - CoreModule.f17545c.f19639e0.m169527p9().pictures.size()), ProfileImagesItemHolder.this.mo52800O().mo51069K2().getPronoun()));
            xdl0.m208344M(pictureView.f28092u, true);
            xdl0.m208344M(pictureView.f28091t, true);
            xdl0.m208344M(pictureView.f28093v, true);
            xdl0.m208344M(pictureView.f28094w, false);
            xdl0.m208344M(pictureView.f28095x, false);
            xdl0.m208344M(pictureView.f28096y, false);
            xdl0.m208329E0(pictureView.f28093v, new View.OnClickListener() { // from class: l.sp90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f165762a.m52869O(i, view);
                }
            });
        }

        /* JADX INFO: renamed from: U */
        public final void m52875U(PictureView pictureView) {
            pictureView.f28076g.setVisibility(4);
            View viewInflate = ProfileImagesItemHolder.this.mo52800O().mo94568H2().inflate(f6c0.f95297Be, (ViewGroup) pictureView, true);
            View viewFindViewById = viewInflate.findViewById(u4c0.f174198cc);
            viewInflate.findViewById(u4c0.f174254g0);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f174135Z);
            VDraweeView vDraweeView2 = (VDraweeView) viewInflate.findViewById(u4c0.f174220e0);
            qib0.f154691G.m102331L0(vDraweeView, CoreModule.f17545c.f19639e0.m169527p9().picture(0).url);
            qib0.f154691G.m102331L0(vDraweeView2, this.f34073g.get(0).cover().url);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.tp90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f171453a.m52870P(view);
                }
            });
        }

        /* JADX INFO: renamed from: V */
        public final void m52876V(PictureView pictureView, Media media, int i) {
            pictureView.f28095x.setText(m52847D().getString(R$string.f18153Tg));
            xdl0.m208345M0(pictureView.f28090s, true);
            pictureView.m43998c0(media, true);
            m52850W(pictureView, media);
            if (i == ProfileImagesItemHolder.this.f34062x.getCurrentItem()) {
                zvf0.m220368A("e_invisible_photo_upload", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("invisible_photo_location", Integer.valueOf(i)), vwb.m200311Y("need_photo_count", Integer.valueOf(3 - CoreModule.f17545c.f19639e0.m169520na().pictures.size())), vwb.m200311Y("invisible_photo_is_thumbnail", Boolean.FALSE));
            }
        }

        @Override // p149l.eb2, p149l.w660
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            super.destroyItem(viewGroup, i, obj);
        }

        @Override // p149l.w660
        public int getCount() {
            if (!ProfileImagesItemHolder.this.m96413I() || vwb.m200296J(this.f34073g)) {
                return this.f34073g.size();
            }
            return 1;
        }

        @Override // p149l.w660
        public int getItemPosition(Object obj) {
            if (ProfileImagesItemHolder.this.m96413I()) {
                return -2;
            }
            int i = this.f34075i;
            if (i <= 0) {
                return super.getItemPosition(obj);
            }
            this.f34075i = i - 1;
            return -2;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            this.f34071e = true;
            if (i == ProfileImagesItemHolder.this.f34062x.getCurrentItem()) {
                dbl0.m110646a(ProfileImagesItemHolder.this.f34062x, false);
            }
            viewGroup.removeView((View) obj);
            if (obj instanceof PictureView) {
                this.f34074h.add((PictureView) obj);
            }
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, final int i) {
            int iHashCode = new Object().hashCode();
            ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.CUSTOM;
            PerformanceLogUtil.logBegin(iHashCode, profileLogName, getClass().getSimpleName().concat(" onInstantiateItem"));
            if (this.f34073g.get(i) instanceof AdmobMedia) {
                FrameLayout frameLayout = new FrameLayout(m52847D());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, ProfileImagesItemHolder.this.f34062x.getHeight()));
                w9a0.m202285m().m202286A(frameLayout, m52847D(), new d30() { // from class: l.kp90
                    @Override // p149l.d30
                    public final void call() {
                        this.f124129a.m52864H(i);
                    }
                });
                frameLayout.setTag(Integer.valueOf(i));
                viewGroup.addView(frameLayout);
                return frameLayout;
            }
            final PictureView pictureView = !this.f34074h.isEmpty() ? (PictureView) this.f34074h.pop() : (PictureView) ProfileImagesItemHolder.this.mo52800O().mo94568H2().inflate(f6c0.f96120ze, viewGroup, false);
            boolean zMo52347v1 = ProfileImagesItemHolder.this.mo52800O().mo52347v1();
            boolean zMo52301o1 = ProfileImagesItemHolder.this.mo52800O().mo52301o1();
            int iMo52110K3 = ProfileImagesItemHolder.this.mo52800O().mo52110K3();
            boolean zMo52202X1 = ProfileImagesItemHolder.this.mo52800O().mo52202X1();
            boolean zMo52222a0 = ProfileImagesItemHolder.this.mo52800O().mo52222a0();
            final boolean zMo51053D2 = ProfileImagesItemHolder.this.mo52800O().mo51053D2();
            final boolean zMo51119m0 = ProfileImagesItemHolder.this.mo52800O().mo51119m0();
            final boolean zMo51075P1 = ProfileImagesItemHolder.this.mo52800O().mo51075P1();
            boolean zMo52310p2 = ProfileImagesItemHolder.this.mo52800O().mo52310p2();
            User userMo51069K2 = ProfileImagesItemHolder.this.mo52800O().mo51069K2();
            int iM189644a = tm90.m189643d().m189644a(userMo51069K2);
            if (NullChecker.m81303a(userMo51069K2) && !userMo51069K2.isMe()) {
                pictureView.setShowPetTag(true);
                pictureView.setIsFemale(userMo51069K2.isFemale());
            }
            if (iM189644a != -1) {
                pictureView.f28032A.setVisibility(0);
                pictureView.f28033B.setVisibility(0);
                tm90.m189643d().m189651i(iM189644a, pictureView.f28034C);
            } else {
                pictureView.f28032A.setVisibility(8);
                pictureView.f28033B.setVisibility(8);
            }
            String strFrom = ProfileImagesItemHolder.this.mo52800O().from();
            if (ProfileImagesItemHolder.this.mo52800O().mo52239d1() == i) {
                xdl0.m208344M(pictureView.f28083m, zMo52347v1);
                xdl0.m208344M(pictureView.f28084n, zMo52301o1);
                if (iMo52110K3 > 0) {
                    pictureView.f28085o.setWidth(iMo52110K3);
                    if (zMo52202X1) {
                        pictureView.f28085o.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
                j760<Integer, Integer> j760VarMo52072E2 = ProfileImagesItemHolder.this.mo52800O().mo52072E2();
                if (j760VarMo52072E2 != null && zMo52222a0) {
                    ViewGroup.LayoutParams layoutParams = pictureView.f28070a.getLayoutParams();
                    layoutParams.width = j760VarMo52072E2.f116564a.intValue();
                    layoutParams.height = j760VarMo52072E2.f116565b.intValue();
                    pictureView.f28070a.setLayoutParams(layoutParams);
                }
                if (zMo51053D2 && j760VarMo52072E2 != null && zMo52222a0) {
                    ViewGroup.LayoutParams layoutParams2 = pictureView.f28070a.getLayoutParams();
                    layoutParams2.width = j760VarMo52072E2.f116564a.intValue();
                    layoutParams2.height = j760VarMo52072E2.f116565b.intValue();
                    pictureView.f28070a.setLayoutParams(layoutParams2);
                }
            }
            pictureView.setFrom(strFrom);
            pictureView.f28070a.getHierarchy().m112053H(null);
            pictureView.f28070a.getHierarchy().m112046A(ProfileImagesItemHolder.this.mo52800O().act().getResources().getDrawable(w0c0.f183794P));
            if (zMo51053D2) {
                pictureView.m43983K(true, false, true);
            } else {
                pictureView.m43982J(true, false);
                pictureView.setAspectRateFitWidth(0.8f);
                pictureView.f28070a.getHierarchy().m112076w(ftd0.f99185i);
            }
            pictureView.m44005k0();
            if ("live_profile_voice_mask_mode".equals(strFrom)) {
                m52871Q(pictureView, this.f34073g.get(i), 0);
            } else {
                boolean zM52820c1 = ProfileImagesItemHolder.this.m52820c1(userMo51069K2);
                ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
                if (zM52820c1) {
                    profileImagesItemHolder.f34030R0 = true;
                    m52871Q(pictureView, this.f34073g.get(i), 15);
                } else {
                    boolean zM52738K0 = profileImagesItemHolder.m52738K0();
                    ProfileImagesItemHolder profileImagesItemHolder2 = ProfileImagesItemHolder.this;
                    if (zM52738K0) {
                        profileImagesItemHolder2.f34030R0 = true;
                        m52871Q(pictureView, this.f34073g.get(i), 0);
                    } else if (profileImagesItemHolder2.m52819b1(userMo51069K2)) {
                        ProfileImagesItemHolder.this.f34030R0 = true;
                        r4w r4wVar = r4w.INSTANCE;
                        if (r4wVar.m177848C(userMo51069K2.f56011id)) {
                            m52871Q(pictureView, this.f34073g.get(i), 0);
                        } else {
                            m115452n(ProfileImagesItemHolder.this.m131821p(), r4wVar.m177851F(ProfileImagesItemHolder.this.mo52800O().userId())).map(new w9j() { // from class: l.lp90
                                @Override // p149l.w9j
                                public final Object call(Object obj) {
                                    return ProfileImagesItemHolder.C8737c.m52856v((j760) obj);
                                }
                            }).subscribe(mkd0.m154955G(new e30() { // from class: l.mp90
                                @Override // p149l.e30
                                public final void call(Object obj) {
                                    this.f135026a.m52865I(pictureView, i, (Integer) obj);
                                }
                            }));
                        }
                        if (!"from_voice_buzz".equals(strFrom)) {
                            xdl0.m208344M(pictureView.f28073d, true);
                        }
                    } else if (zMo52310p2 && (!zMo52310p2 || i >= this.f34073g.size())) {
                        ProfileImagesItemHolder.this.f34030R0 = true;
                        m52871Q(pictureView, this.f34073g.get(i - 1), 15);
                        m52875U(pictureView);
                    } else if (upa.m194845y2() && (ProfileImagesItemHolder.this.mo52800O().mo51069K2() == null || !ProfileImagesItemHolder.this.mo52800O().mo51069K2().isMe())) {
                        m52874T(pictureView, this.f34073g.get(i), i);
                    } else if (upa.m194825u2() && ProfileImagesItemHolder.this.mo52800O().mo51078R()) {
                        m52873S(pictureView, this.f34073g.get(i), -1, i);
                    } else {
                        m52871Q(pictureView, this.f34073g.get(i), -1);
                    }
                }
            }
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(userMo51069K2.f56011id);
            if (NullChecker.m81303a(conversationM32856Xe) && conversationM32856Xe.isQuickChatClearAvatar(CoreModule.f17545c.f19639e0.m169520na())) {
                xdl0.m208344M(pictureView.f28073d, false);
            }
            pictureView.setOnClickListener(new View.OnClickListener() { // from class: l.np90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f139940a.m52866J(pictureView, zMo51075P1, zMo51119m0, view);
                }
            });
            pictureView.setTag(Integer.valueOf(i));
            pictureView.setPivotX(0.0f);
            pictureView.setPivotY(0.0f);
            viewGroup.addView(pictureView);
            if (ProfileImagesItemHolder.this.mo52800O().mo52366y2()) {
                pictureView.setOnClickListener(null);
                View viewInflate = o7r.m163037a(ProfileImagesItemHolder.this.mo52800O().act()).inflate(f6c0.f95912n9, (ViewGroup) null);
                pictureView.addView(viewInflate, 1);
                xdl0.m208368c0(viewInflate, 0);
                View viewFindViewById = viewInflate.findViewById(u4c0.f174185c);
                View viewFindViewById2 = viewInflate.findViewById(u4c0.f174202d);
                View viewFindViewById3 = viewInflate.findViewById(u4c0.f174236f);
                ProfileImagesItemHolder.this.mo52800O().m94571s();
                viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.op90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f144959a.m52848K(view);
                    }
                });
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.pp90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f150634a.m52849L(view);
                    }
                });
                if (ProfileImagesItemHolder.this.f34028Q0 && !upa.m194707V2()) {
                    xdl0.m208345M0(viewFindViewById3, true);
                    ProfileImagesItemHolder.this.f34042X0.put(Integer.valueOf(i), viewFindViewById3);
                    xdl0.m208325C0(viewFindViewById3, ((int) ((ProfileImagesItemHolder.f33998l1 - ProfileImagesItemHolder.this.f34038V0) * ProfileImagesItemHolder.this.f34040W0)) + (ProfileImagesItemHolder.this.f34038V0 / 2));
                    viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.qp90
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f155681a.m52867M(zMo51053D2, view);
                        }
                    });
                }
            }
            if (i == ProfileImagesItemHolder.this.f34062x.getCurrentItem() && ProfileImagesItemHolder.this.mo52800O().mo52316q3() && ((!zMo51075P1 || !this.f34072f) && xij0.m209661d0() && !ProfileImagesItemHolder.this.mo52800O().mo52348v2() && !ProfileImagesItemHolder.this.m52820c1(userMo51069K2) && !ProfileImagesItemHolder.this.m52819b1(userMo51069K2) && !sb90.m183207c(ProfileImagesItemHolder.this.mo52800O().mo51069K2()))) {
                if (zMo51075P1 && !this.f34072f) {
                    this.f34072f = true;
                }
                if ((!ProfileImagesItemHolder.this.mo52800O().mo52366y2() || getCount() < 2 || CoreModule.f17545c.f19639e0.f149294W0.get().booleanValue()) && !ProfileImagesItemHolder.this.m52738K0()) {
                    pictureView.m43991V();
                }
            }
            if (zMo51053D2) {
                if (!ProfileImagesItemHolder.this.f34028Q0) {
                    m52863G(pictureView);
                }
                if (NullChecker.m81303a(pictureView.f28070a.getHierarchy()) && !ProfileImagesItemHolder.this.m96413I()) {
                    pictureView.f28070a.getHierarchy().m112050E(new l480(0.0f));
                    pictureView.f28070a.getHierarchy().m112048C(m52847D().getDrawable(x2c0.f189787U7));
                }
            }
            PerformanceLogUtil.logEnd(iHashCode, profileLogName, getClass().getSimpleName().concat(" onInstantiateItem"));
            if (upa.m194825u2()) {
                xdl0.m208329E0(pictureView.f28097z, new View.OnClickListener() { // from class: l.rp90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f160488a.m52868N(i, view);
                    }
                });
            }
            if (ProfileImagesItemHolder.this.m96413I()) {
                qib0.f154691G.m102354Y0(pictureView.f28070a, x2c0.f190592tl);
                pictureView.m44007m0();
            }
            return pictureView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileImagesItemHolder$d */
    public static class RunnableC8738d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final User f34077a;

        /* JADX INFO: renamed from: b */
        public final boolean f34078b;

        public RunnableC8738d(User user, boolean z) {
            this.f34077a = user;
            this.f34078b = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m52877a(boolean z, j760 j760Var) {
            Priority priority;
            F f = j760Var.f116564a;
            String str = (!(f instanceof Video) || z) ? "profile" : "";
            Picture.ImageUri imageUriM220207f = zub.m220207f((Media) f);
            bkb0 bkb0Var = qib0.f154691G;
            if (((Integer) j760Var.f116565b).intValue() == 0) {
                priority = Priority.HIGH;
            } else {
                priority = ((Integer) j760Var.f116565b).intValue() == 1 ? Priority.MEDIUM : Priority.LOW;
            }
            bkb0Var.m102376w0(imageUriM220207f, priority, str);
        }

        /* JADX INFO: renamed from: b */
        public final void m52878b(User user, final boolean z) {
            if (ConnectivityReceiver.m81286i()) {
                vwb.m200354z(vwb.m200344p0(user.pictures), new e30() { // from class: l.up90
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ProfileImagesItemHolder.RunnableC8738d.m52877a(z, (j760) obj);
                    }
                });
            } else {
                qib0.f154691G.m102376w0(zub.m220207f(user.media(0)), Priority.HIGH, (!(user.pictures.get(0) instanceof Video) || z) ? "profile" : "");
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m52878b(this.f34077a, this.f34078b);
        }
    }

    public ProfileImagesItemHolder(@NonNull x0m x0mVar, @NonNull mcr mcrVar) {
        super(x0mVar, mcrVar);
        this.f34026P0 = new C8737c();
        this.f34028Q0 = mo52800O().m94571s();
        this.f34030R0 = false;
        this.f34032S0 = false;
        this.f34034T0 = 0;
        this.f34036U0 = -1;
        this.f34038V0 = 0;
        this.f34040W0 = 0.25f;
        this.f34042X0 = new HashMap();
        this.f34044Y0 = 0;
        this.f34046Z0 = new ArrayList();
        this.f34049c1 = -1;
        this.f34054h1 = -1;
        m131821p().creates(new e30() { // from class: l.uo90
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileImagesItemHolder.m52746X((Bundle) obj);
            }
        }, new d30() { // from class: l.bp90
            @Override // p149l.d30
            public final void call() {
                this.f76614a.m52769p1();
            }
        });
    }

    /* JADX INFO: renamed from: E1 */
    private void m52736E1() {
        if (NullChecker.m81303a(this.f34003E)) {
            xdl0.m208344M(this.f34003E, true);
        }
        if (NullChecker.m81303a(this.f34031S)) {
            xdl0.m208344M(this.f34031S, true);
        }
        if (NullChecker.m81303a(this.f34017L)) {
            xdl0.m208344M(this.f34017L, false);
        }
        if (NullChecker.m81303a(this.f34015K)) {
            if (mo52800O().mo51069K2().isMe() && !mo52800O().mo52130N2() && mo52800O().mo51079R0()) {
                xdl0.m208344M(this.f34015K, true);
            } else {
                xdl0.m208344M(this.f34015K, false);
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    private Act m52737F0() {
        return mo52800O().act();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public boolean m52738K0() {
        mo52800O().userId();
        return false;
    }

    /* JADX INFO: renamed from: M1 */
    private void m52739M1(boolean z) {
        bt0.m103743p(this.f34062x, "translationX", 0L, 150L, null, (z ? -1 : 1) * t100.m186890d(10.0f), 0.0f).start();
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m52741S(Throwable th) {
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m52746X(Bundle bundle) {
    }

    /* JADX INFO: renamed from: Z0 */
    private void m52749Z0() {
        ViewGroup.LayoutParams layoutParams = this.f34005F.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.height = t100.f167271t;
        this.f34005F.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m52756g0(d30 d30Var, d30 d30Var2, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
        if (NullChecker.m81303a(d30Var2)) {
            d30Var2.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m52762l1(View view) {
        lra0.m151149h("button");
        mo52800O().mo51123o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m52764m1(View view) {
        m52737F0().m66873d2();
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m52766o0(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m52767o1() {
        if (NullChecker.m81303a(m52737F0()) && !m52737F0().isFinishing() && NullChecker.m81303a(this.f34004E0)) {
            SVGALoader.with(m52737F0()).from("https://auto.tancdn.com/v1/raw/e0fb50e8-bc26-443a-bbca-9266fed1008b14.svga").repeatCount(-1).into(this.f34012I0);
            this.f34012I0.startAnimation();
            SVGALoader.with(m52737F0()).from("https://auto.tancdn.com/v1/raw/1bed74ff-0197-4140-a352-6a36cb500d0e14.svga").repeatCount(1).into(this.f34014J0);
            SVGALoader.with(m52737F0()).from("https://auto.tancdn.com/v1/raw/ff7cd57b-6461-4d0b-ac99-83ad19f3bf0a14.svga").repeatCount(1).into(this.f34020M0);
            this.f34014J0.startAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m52769p1() {
        this.f34026P0.f34071e = true;
        this.f34026P0.f34072f = false;
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f34062x;
        if (vPager_SquaredRefactor != null) {
            dbl0.m110646a(vPager_SquaredRefactor, true);
            if (mo52800O().mo51119m0() || !NullChecker.m81303a(mo52800O().mo51069K2())) {
                return;
            }
            for (int i = 0; i < mo52800O().mo51069K2().pictures.size(); i++) {
                if (i != this.f34062x.getCurrentItem()) {
                    qib0.f154691G.m102342R(zub.m220207f(mo52800O().mo51069K2().media(i)).formatted());
                }
            }
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m52780A1() {
        m52811T0();
    }

    /* JADX INFO: renamed from: B1 */
    public final void m52781B1(VText vText, VText vText2, VText vText3) {
        if (mo52800O().mo51069K2().isMe()) {
            vText.setText(m52737F0().getString(R$string.f18677kn));
            vText2.setText(m52737F0().getString(R$string.f18616in));
        } else {
            vText.setText(TEnum.equals(mo52800O().mo51069K2().gender, "female") ? m52737F0().getString(R$string.f18441d1) : m52737F0().getString(R$string.f18471e1));
            vText2.setText(TEnum.equals(mo52800O().mo51069K2().gender, "female") ? m52737F0().getString(R$string.f18379b1) : m52737F0().getString(R$string.f18410c1));
        }
        vText3.setText(m52737F0().getString(R$string.f19099yk));
        vText3.setTextColor(-1);
    }

    /* JADX INFO: renamed from: C1 */
    public void m52782C1(User user) {
        if (this.f34047a1 == null) {
            this.f34047a1 = (CoreSupremePartnerMysteriousModeCoverView) this.f33999A.inflate();
            this.f34062x.post(new Runnable() { // from class: l.mo90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f134875a.m52833r1();
                }
            });
        }
        xdl0.m208344M(this.f34047a1, true);
        this.f34047a1.m43699b(user, 2);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m52783D0(View view) {
        vp90.m199223a(this, view);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m52784D1() {
        if (qp8.m175817b() && qib0.f154713b0.f139232c.mo67212Bq()) {
            final String strUserId = mo52800O().userId();
            final String strFrom = mo52800O().from();
            final UserLiveState userLiveStateMo67272lt = CoreModule.m29936Q().mo67272lt(strUserId);
            this.f34033T.setOnClickListener(null);
            xdl0.m208344M(this.f34033T, false);
            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(strUserId);
            if (!(!TextUtils.isEmpty(CoreModule.f17545c.f19663m0.f19438o2) && TextUtils.equals(CoreModule.f17545c.f19663m0.f19438o2, strUserId) && conversationM32856Xe == null) && NullChecker.m81303a(CoreModule.m29936Q().getUserLiveId(strUserId))) {
                final User userMo51069K2 = mo52800O().mo51069K2();
                xdl0.m208344M(this.f34033T, true);
                ViewGroup.LayoutParams layoutParams = this.f34035U.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    layoutParams.width = t100.m186890d(30.0f);
                    layoutParams.height = t100.m186890d(30.0f);
                    this.f34035U.setLayoutParams(layoutParams);
                }
                this.f34050d1 = true;
                this.f34039W.setTypeface(Typeface.DEFAULT_BOLD);
                xdl0.m208329E0(this.f34033T, new View.OnClickListener() { // from class: l.ip90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f114277a.m52835t1(strUserId, strFrom, userMo51069K2, userLiveStateMo67272lt, view);
                    }
                });
                if (!this.f34048b1) {
                    this.f34048b1 = true;
                    zvf0.m220403y("e_live_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, m52807R0(userMo51069K2, userLiveStateMo67272lt, strFrom));
                }
                if (userLiveStateMo67272lt != null && !TextUtils.isEmpty(userLiveStateMo67272lt.multiCallInfo.onGoingMultiCallId)) {
                    xdl0.m208345M0(this.f34033T, true);
                    this.f34050d1 = true;
                    if (TextUtils.equals(this.f34039W.getText(), m52737F0().getResources().getString(R$string.f18457dh))) {
                        return;
                    } else {
                        this.f34039W.setText(R$string.f18457dh);
                    }
                }
                if (this.f34035U.isAnimating()) {
                    return;
                }
                SVGALoader.with(m52737F0()).from("https://auto.tancdn.com/v1/raw/b83d11f9-6b88-41a2-a0dd-c3617bde118510.so").into(this.f34035U);
            }
        }
    }

    /* JADX INFO: renamed from: F1 */
    public void m52785F1(User user) {
        if (user != null && user.isMe()) {
            xdl0.m208344M(this.f34045Z, false);
            return;
        }
        boolean zM210477q = xp5.m210477q(user);
        VImage vImage = this.f34045Z;
        if (zM210477q) {
            xdl0.m208344M(vImage, false);
            return;
        }
        xdl0.m208344M(vImage, !((!user.superLikedMe() && !user.letter()) || az50.INSTANCE.m99629i(user.f56011id) || q8p.INSTANCE.m173435j(user.f56011id)) || TextUtils.equals(CoreModule.f17545c.f19625Z0.m163901B3(), user.f56011id));
        if ("from_meet_feed".equals(mo52800O().from())) {
            LikedUser likedUserMo52328s2 = mo52800O().mo52328s2();
            if (NullChecker.m81303a(likedUserMo52328s2) && (TEnum.equals(likedUserMo52328s2.status, "superliked") || TEnum.equals(likedUserMo52328s2.status, "lettered"))) {
                xdl0.m208344M(this.f34045Z, true);
            }
        }
        if (IntlCountryCodeController.m28126v() && xdl0.m208349O0(this.f34045Z)) {
            this.f34045Z.setImageResource(x2c0.f189456Jh);
        }
        if (xdl0.m208349O0(this.f34045Z) || xdl0.m208349O0(this.f34022N0)) {
            xdl0.m208344M(this.f34058p0, false);
            this.f34051e1 = true;
        }
    }

    /* JADX INFO: renamed from: G0 */
    public View m52786G0(int i) {
        return this.f34026P0.m52861E(i);
    }

    /* JADX INFO: renamed from: G1 */
    public void m52787G1() {
        this.f34036U0 = -1;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m52788H0() {
        View viewM52861E = this.f34026P0.m52861E(this.f34062x.getCurrentItem());
        if (viewM52861E instanceof PictureView) {
            PictureView pictureView = (PictureView) viewM52861E;
            User userMo51069K2 = mo52800O().mo51069K2();
            if (NullChecker.m81303a(userMo51069K2) && this.f34062x.getCurrentItem() < userMo51069K2.pictures.size() && (userMo51069K2.pictures.get(this.f34062x.getCurrentItem()) instanceof Video) && xij0.m209661d0()) {
                pictureView.m43991V();
            }
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m52789H1(Drawable drawable, boolean z) {
        if (this.f34056j1 || m96413I()) {
            return;
        }
        View viewInflate = o7r.m163037a(m52737F0()).inflate(f6c0.f95435K8, (ViewGroup) this.f34060v, false);
        this.f34053g1 = viewInflate;
        VText vText = (VText) viewInflate.findViewById(u4c0.f173910L6);
        VText vText2 = (VText) this.f34053g1.findViewById(u4c0.f174587zb);
        VDivider vDivider = (VDivider) this.f34053g1.findViewById(u4c0.f174505ue);
        RelativeLayout relativeLayout = (RelativeLayout) this.f34053g1.findViewById(u4c0.f174205d2);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f34053g1.findViewById(u4c0.f174222e2);
        View viewFindViewById = this.f34053g1.findViewById(u4c0.f174491u0);
        if (NullChecker.m81303a(mo52800O().mo51069K2())) {
            m52781B1(vText, vText2, (VText) this.f34053g1.findViewById(u4c0.f174321k0));
        }
        o6j0.m162864h("e_profile_guide_first", mo52800O().pageId(), new o6j0.C18854a[0]);
        ViewGroup.LayoutParams layoutParams = this.f34053g1.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, this.f34062x.getHeight());
        } else {
            layoutParams.height = this.f34062x.getHeight();
            layoutParams.width = -1;
        }
        if (upa.m194707V2()) {
            xdl0.m208325C0(relativeLayout, 0);
            xdl0.m208325C0(constraintLayout, this.f34062x.getHeight());
            xdl0.m208344M(viewFindViewById, false);
            xdl0.m208344M(relativeLayout, false);
            vDivider.setDividerColor(872415231);
            vText.setCompoundDrawablesWithIntrinsicBounds(0, x2c0.f190369mm, 0, 0);
            vText2.setCompoundDrawablesWithIntrinsicBounds(0, x2c0.f190401nm, 0, 0);
        } else if (this.f34062x.getHeight() - this.f34038V0 > 0) {
            xdl0.m208325C0(relativeLayout, (int) ((this.f34062x.getHeight() - this.f34038V0) * this.f34040W0));
            xdl0.m208325C0(constraintLayout, this.f34062x.getHeight() - this.f34038V0);
        }
        this.f34053g1.setLayoutParams(layoutParams);
        this.f34060v.addView(this.f34053g1, layoutParams);
        this.f34053g1.setOnClickListener(new View.OnClickListener() { // from class: l.ap90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71005a.m52836u1(view);
            }
        });
        ((VImage) this.f34053g1.findViewById(u4c0.f174188c2)).setBackground(drawable);
        if (NullChecker.m81303a(this.f34052f1) && !this.f34052f1.isUnsubscribed()) {
            this.f34052f1.unsubscribe();
            this.f34052f1 = null;
        }
        this.f34055i1 = true;
        this.f34056j1 = true;
        if (mo52800O().mo51053D2()) {
            if (z) {
                lra0.f129535v = true;
            }
            CoreModule.f17545c.f19639e0.f149294W0.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m52790I0() {
        if (mo52800O().mo52366y2()) {
            if (!mo52800O().mo51075P1() && !mo52800O().mo51053D2()) {
                m52806Q1(800L);
            }
            xdl0.m208344M(this.f34063y, false);
            xdl0.m208344M(this.f34007G, true);
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m52791I1(final e30<LinearLayout> e30Var, long j) {
        this.f34017L.postDelayed(new Runnable() { // from class: l.no90
            @Override // java.lang.Runnable
            public final void run() {
                this.f139824a.m52837v1(e30Var);
            }
        }, j);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m52792J0(int i) {
        if (upa.m194845y2()) {
            m52816X0(i);
        }
    }

    /* JADX INFO: renamed from: J1 */
    public void m52793J1(int i, boolean z) {
        if (m131818i() && !m96413I()) {
            this.f34062x.m4176T(i, z);
        }
    }

    /* JADX INFO: renamed from: K1 */
    public void m52794K1(final d30 d30Var) {
        this.f34015K.setOnClickListener(new View.OnClickListener() { // from class: l.lo90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileImagesItemHolder.m52766o0(d30Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    public void m52795L0(final long j, final boolean z) {
        if (m96413I()) {
            return;
        }
        if (NullChecker.m81303a(this.f34052f1) && !this.f34052f1.isUnsubscribed()) {
            this.f34052f1.unsubscribe();
            this.f34052f1 = null;
        }
        if ((this.f34026P0.f34073g.get(this.f34062x.getCurrentItem()) instanceof Video) && xij0.m209661d0()) {
            dbl0.m110646a(this.f34062x, false);
        }
        this.f34052f1 = m52737F0().duringCreated(((C22306c) new v9j() { // from class: l.po90
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f150496a.m52822e1();
            }
        }.call()).compose(mkd0.m154966R()).observeOn(Schedulers.computation()).flatMap(new w9j() { // from class: l.qo90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                return C22306c.just(xij0.m209664p(bitmap, bitmap.getWidth(), bitmap.getHeight(), 1275068416));
            }
        }).compose(mkd0.m154991y()).map(new w9j() { // from class: l.ro90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f160371a.m52823f1((Bitmap) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.so90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165659a.m52826i1(z, j, (Drawable) obj);
            }
        }));
        m131821p().lifecycle().skip(1).filter(new w9j() { // from class: l.to90
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f171324a.m52827j1((C4319c) obj);
            }
        }).take(1).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.vo90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182375a.m52828k1((C4319c) obj);
            }
        }, new e30() { // from class: l.wo90
            @Override // p149l.e30
            public final void call(Object obj) {
                ProfileImagesItemHolder.m52741S((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L1 */
    public void m52796L1(final d30 d30Var, final d30 d30Var2) {
        this.f34017L.setOnClickListener(new View.OnClickListener() { // from class: l.oo90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileImagesItemHolder.m52756g0(d30Var, d30Var2, view);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public CoreSupremePartnerMysteriousModeCoverView m52797M0() {
        return this.f34047a1;
    }

    /* JADX INFO: renamed from: N0 */
    public int m52798N0() {
        if (!m131818i()) {
            return 0;
        }
        int currentItem = this.f34062x.getCurrentItem();
        int i = this.f34036U0;
        if (i < 0 || i > currentItem) {
            return this.f34062x.getCurrentItem();
        }
        return Math.min(Math.max(0, currentItem - 1), NullChecker.m81303a(mo52800O().mo51069K2()) ? mo52800O().mo51069K2().pictures.size() - 1 : 0);
    }

    /* JADX INFO: renamed from: N1 */
    public boolean m52799N1() {
        if (m96413I() || CoreModule.f17545c.f19639e0.f149294W0.get().booleanValue() || this.f34038V0 > f33997k1) {
            return false;
        }
        if (this.f34028Q0) {
            return !mo52800O().mo51069K2().isTeamAccount() && !"from_guess_liker_result".equals(mo52800O().from()) && NullChecker.m81303a(mo52800O().mo51069K2()) && NullChecker.m81303a(this.f34062x);
        }
        return (mo52800O().mo51069K2() == null || this.f34062x == null || !"home_card".equals(mo52800O().from())) ? false : true;
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return m131825w();
    }

    /* JADX INFO: renamed from: O0 */
    public int m52801O0() {
        if (m131818i()) {
            return this.f34062x.getCurrentItem();
        }
        return 0;
    }

    /* JADX INFO: renamed from: O1 */
    public final void m52802O1() {
        int childCount = this.f34060v.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f34060v.getChildAt(i);
            xdl0.m208345M0(childAt, childAt == this.f34061w || childAt == this.f34009H || childAt == this.f34003E || childAt == this.f34017L);
        }
        if (mo52800O().mo51069K2().isBannedNew()) {
            xdl0.m208344M(this.f34017L, false);
        }
        xdl0.m208344M(this.f34064z, false);
    }

    /* JADX INFO: renamed from: P0 */
    public PictureView m52803P0() {
        View viewM52861E = this.f34026P0.m52861E(this.f34062x.getCurrentItem());
        if (!(viewM52861E instanceof PictureView)) {
            viewM52861E = this.f34026P0.m52861E(this.f34062x.getCurrentItem() - 1);
        }
        if (viewM52861E instanceof PictureView) {
            return (PictureView) viewM52861E;
        }
        return null;
    }

    /* JADX INFO: renamed from: P1 */
    public void m52804P1() {
        User userMo51069K2 = mo52800O().mo51069K2();
        if (NullChecker.m81303a(this.f34062x)) {
            if (this.f34062x.getCurrentItem() <= 0) {
                m52739M1(false);
                lra0.m151148g(OMSDialogPositon.p_suggest_user_profile_info_view, false, true, userMo51069K2, "");
            } else {
                VPager_SquaredRefactor vPager_SquaredRefactor = this.f34062x;
                vPager_SquaredRefactor.m4176T(vPager_SquaredRefactor.getCurrentItem() - 1, false);
                lra0.m151148g(OMSDialogPositon.p_suggest_user_profile_info_view, true, true, userMo51069K2, "");
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final String m52805Q0(@Nullable UserLiveState userLiveState) {
        return CoreModule.m29936Q().mo67214Dr(NullChecker.m81303a(userLiveState) ? userLiveState.multiCallInfo.onGoingMultiCallRole : "");
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m52806Q1(long j) {
        if (m52799N1()) {
            e51.m114743H(mo52800O().act(), new Runnable() { // from class: l.ko90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f123973a.m52838w1();
                }
            }, j);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final HashMap<String, Object> m52807R0(User user, UserLiveState userLiveState, String str) {
        HashMap<String, Object> map = new HashMap<>();
        boolean z = (userLiveState == null || TextUtils.isEmpty(userLiveState.multiCallInfo.onGoingMultiCallId)) ? false : true;
        map.put("liveId", CoreModule.m29936Q().getUserLiveId(user.f56011id));
        map.put("anchorId", user.f56011id);
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("module", "e_profile_album");
        map.put("trace_id", "");
        map.put("live_status", (userLiveState == null || !userLiveState.isLiveOpened()) ? BLiveOperationTitleShowType.off : "on");
        map.put("right_recommend_type", "");
        if (!z) {
            userLiveState = null;
        }
        map.put("live_room_live_type", m52805Q0(userLiveState));
        map.put("show_label", z ? "连线" : "");
        map.put("refer_pid", "home_card".equals(str) ? "home_card" : "");
        map.put("liveRecommendCategory", "NA");
        if (CoreModule.f17545c.f19663m0.m31020L6(user.f56011id) && "home_card".equals(str)) {
            map.put("live_enter_source", "suggest_live_card_profile");
            return map;
        }
        map.put("live_enter_source", "NA");
        return map;
    }

    /* JADX INFO: renamed from: R1 */
    public void m52808R1() {
        User userMo51069K2 = mo52800O().mo51069K2();
        if (this.f34062x.getCurrentItem() >= this.f34026P0.getCount() - 1) {
            m52739M1(true);
            lra0.m151148g(OMSDialogPositon.p_suggest_user_profile_info_view, false, false, userMo51069K2, "");
        } else {
            VPager_SquaredRefactor vPager_SquaredRefactor = this.f34062x;
            vPager_SquaredRefactor.m4176T(vPager_SquaredRefactor.getCurrentItem() + 1, false);
            lra0.m151148g(OMSDialogPositon.p_suggest_user_profile_info_view, true, false, userMo51069K2, "");
        }
    }

    /* JADX INFO: renamed from: S0 */
    public int m52809S0() {
        return this.f34036U0;
    }

    /* JADX INFO: renamed from: S1 */
    public void m52810S1(int i) {
        if (NullChecker.m81303a(this.f34059u) && NullChecker.m81303a(this.f34031S) && NullChecker.m81303a(this.f34060v)) {
            this.f34038V0 = i;
            int i2 = ((int) ((f33998l1 - i) * this.f34040W0)) + (i / 2);
            if (this.f34042X0.isEmpty() || i >= f33998l1 || i2 <= 0) {
                return;
            }
            for (Integer num : this.f34042X0.keySet()) {
                num.intValue();
                if (NullChecker.m81303a(this.f34042X0.get(num))) {
                    xdl0.m208325C0(this.f34042X0.get(num), i2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m52811T0() {
        if (!mo52800O().mo52216Z1()) {
            xdl0.m208344M(this.f34017L, false);
        }
        xdl0.m208344M(this.f34009H, false);
        xdl0.m208344M(this.f34017L, false);
        xdl0.m208344M(this.f34003E, false);
        xdl0.m208344M(this.f34031S, false);
        xdl0.m208344M(this.f34013J, false);
    }

    /* JADX INFO: renamed from: T1 */
    public void m52812T1(User user, int i) {
        if (!NullChecker.m81303a(user) || i >= user.pictures.size() || this.f34049c1 == i) {
            return;
        }
        zvf0.m220368A("e_profilePhoto", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("url", user.picture(i).url), vwb.m200311Y("moments_user_id", mo52800O().userId()));
        View viewM52861E = this.f34026P0.m52861E(this.f34062x.getCurrentItem());
        if (viewM52861E instanceof PictureView) {
            PictureView pictureView = (PictureView) viewM52861E;
            if (upa.m194825u2() && xdl0.m208349O0(pictureView.f28090s)) {
                zvf0.m220368A("e_invisible_photo_upload", OMSDialogPositon.p_suggest_user_profile_info_view, vwb.m200311Y("invisible_photo_location", Integer.valueOf(i)), vwb.m200311Y("need_photo_count", Integer.valueOf(3 - CoreModule.f17545c.f19639e0.m169520na().pictures.size())), vwb.m200311Y("invisible_photo_is_thumbnail", Boolean.FALSE));
            }
        }
        this.f34049c1 = i;
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m52813U0() {
        View viewM52861E = this.f34026P0.m52861E(this.f34062x.getCurrentItem());
        if (!(viewM52861E instanceof PictureView)) {
            return false;
        }
        PictureView pictureView = (PictureView) viewM52861E;
        if (upa.m194825u2() && xdl0.m208349O0(pictureView.f28090s)) {
            return true;
        }
        return pictureView.f28045I0.m221515e().booleanValue();
    }

    /* JADX INFO: renamed from: V0 */
    public void m52814V0(View view, boolean z) {
        mo52800O().mo52215Z(0);
        this.f34056j1 = false;
        lra0.f129535v = false;
        if (NullChecker.m81303a(this.f34052f1) && !this.f34052f1.isUnsubscribed()) {
            this.f34052f1.unsubscribe();
            this.f34052f1 = null;
        }
        if (mo52800O().mo51053D2()) {
            CoreModule.f17545c.f19639e0.f149294W0.put(Boolean.TRUE);
        }
        if (z) {
            CoreModule.f17545c.f19639e0.f149294W0.put(Boolean.TRUE);
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeView(view);
        if (!z || this.f34028Q0) {
            return;
        }
        m52788H0();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m52815W0() {
        this.f34046Z0.add(this.f34021N);
        this.f34046Z0.add(this.f34033T);
        this.f34046Z0.add(this.f34043Y);
        this.f34046Z0.add(this.f34045Z);
        this.f34046Z0.add(this.f34057k0);
        this.f34046Z0.add(this.f34058p0);
        this.f34046Z0.add(this.f34004E0);
        this.f34046Z0.add(this.f34022N0);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m52816X0(int i) {
        View viewM52861E = this.f34026P0.m52861E(i);
        if (viewM52861E instanceof PictureView) {
            PictureView pictureView = (PictureView) viewM52861E;
            if (!upa.m194845y2() || (mo52800O().mo51069K2() != null && mo52800O().mo51069K2().isMe())) {
                C8737c c8737c = this.f34026P0;
                c8737c.m52873S(pictureView, c8737c.f34073g.get(i), -1, i);
            } else {
                C8737c c8737c2 = this.f34026P0;
                c8737c2.m52874T(pictureView, c8737c2.f34073g.get(i), i);
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m52817Y0() {
        String strFrom = mo52800O().from();
        boolean zMo51119m0 = mo52800O().mo51119m0();
        if ("home_menu".equals(strFrom) || "preview_card".equals(strFrom) || zMo51119m0) {
            return;
        }
        if (NullChecker.m81303a(m52737F0().getSupportActionBar())) {
            m52737F0().getSupportActionBar().mo134126m();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f34001C.getLayoutParams();
        marginLayoutParams.topMargin = m52737F0().getResources().getDimensionPixelOffset(v1c0.f179228d);
        marginLayoutParams.rightMargin = m52737F0().getResources().getDimensionPixelOffset(v1c0.f179227c);
        this.f34001C.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m52818a1() {
        return TextUtils.equals(mo52800O().from(), "live_profile_voice_mask_mode");
    }

    /* JADX INFO: renamed from: b1 */
    public final boolean m52819b1(User user) {
        return mo52800O().mo52233c3(user);
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m52820c1(User user) {
        return mo52800O().mo52289m3(user);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ Bitmap m52821d1() throws Exception {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f34060v.getWidth(), this.f34060v.getHeight(), Bitmap.Config.ARGB_4444);
        this.f34060v.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ C22306c m52822e1() {
        return C22306c.fromCallable(new Callable() { // from class: l.xo90
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f193794a.m52821d1();
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ Drawable m52823f1(Bitmap bitmap) {
        bfd0 bfd0VarM106505a = cfd0.m106505a(m52737F0().getResources(), bitmap);
        bfd0VarM106505a.m101528e(t100.m186890d(0.0f));
        return bfd0VarM106505a;
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m52824g1(Long l2) {
        m52814V0(this.f34053g1, false);
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m52825h1(Throwable th) {
        m52814V0(this.f34053g1, false);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m52826i1(boolean z, long j, Drawable drawable) {
        m52789H1(drawable, z);
        if (j >= 0) {
            m52737F0().duringCreated(C22306c.timer(j, TimeUnit.MILLISECONDS)).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.yo90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f199278a.m52824g1((Long) obj);
                }
            }, new e30() { // from class: l.zo90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f204094a.m52825h1((Throwable) obj);
                }
            }));
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f34062x.setAdapter(this.f34026P0);
        this.f34062x.m4185d(new C8735a());
        ((LinearLayout.LayoutParams) this.f34063y.getLayoutParams()).gravity = mo52800O().mo52327s1() ? 3 : 1;
        mo52800O().mo52195W().addOnScrollListener(new C8736b(view));
        m52817Y0();
        xdl0.m208329E0(this.f34009H, new View.OnClickListener() { // from class: l.cp90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f81911a.m52762l1(view2);
            }
        });
        m52749Z0();
        m52790I0();
        m52736E1();
        if (mo52800O().mo52348v2()) {
            this.f34005F.setVisibility(4);
        }
        if (upa.m194706V1() && (TextUtils.equals(mo52800O().from(), "chat_group_anonymity") || TextUtils.equals(mo52800O().from(), "group_notification_anonymity"))) {
            xdl0.m208344M(this.f34000B, true);
            xdl0.m208329E0(this.f34000B, new View.OnClickListener() { // from class: l.dp90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f87249a.m52764m1(view2);
                }
            });
            User userMo51069K2 = mo52800O().mo51069K2();
            if (NullChecker.m81303a(userMo51069K2)) {
                qib0.f154691G.m102356Z0(this.f34000B, tbk.m187864k(userMo51069K2));
            } else {
                qib0.f154691G.m102356Z0(this.f34000B, tbk.m187867n());
            }
        }
        if (upa.m194825u2() && mo52800O().mo51078R()) {
            m131821p().duringCreated(CoreModule.f17545c.f19639e0.m169523o9()).distinctUntilChanged(new w9j() { // from class: l.ep90
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).pictures;
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.fp90
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f98676a.m52830n1((User) obj);
                }
            }));
        }
        if (!r65.m178035m() && !sb90.m183209e(mo52800O().mo51069K2())) {
            xdl0.m208344M(this.f34004E0, false);
            return;
        }
        User userMo51069K3 = mo52800O().mo51069K2();
        if ((!NullChecker.m81303a(userMo51069K3) || !NullChecker.m81303a(userMo51069K3.settings) || !userMo51069K3.settings.isCityTop()) && !TextUtils.equals(mo52800O().from(), "from_city_center_conv_banner")) {
            xdl0.m208344M(this.f34004E0, false);
            return;
        }
        xdl0.m208344M(this.f34004E0, true);
        xdl0.m208344M(this.f34031S, false);
        this.f34006F0.setBackgroundResource(x2c0.f190640v5);
        CityC cityTopInfo = userMo51069K3.settings.getCityTopInfo();
        if (NullChecker.m81303a(cityTopInfo)) {
            this.f34018L0.setText(r65.m178034l().m178040k(cityTopInfo.cost));
        }
        if (!NullChecker.m81303a(m52737F0()) || m52737F0().isFinishing()) {
            return;
        }
        e51.m114741F(m52737F0(), new Runnable() { // from class: l.gp90
            @Override // java.lang.Runnable
            public final void run() {
                this.f103771a.m52767o1();
            }
        });
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ Boolean m52827j1(C4319c c4319c) {
        return Boolean.valueOf(c4319c.equals(C4319c.f15547h) && NullChecker.m81303a(this.f34053g1));
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: k */
    public boolean mo52385k() {
        return false;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m52828k1(C4319c c4319c) {
        m52814V0(this.f34053g1, false);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return !mo52800O().mo51119m0();
    }

    @Override // p149l.ah90, p149l.hn2
    /* JADX INFO: renamed from: m */
    public boolean mo52829m() {
        return true;
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m52830n1(User user) {
        if (NullChecker.m81303a(this.f34062x)) {
            m52816X0(this.f34062x.getCurrentItem());
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        User userMo51069K2 = mo52800O().mo51069K2();
        mo52800O().mo51119m0();
        mo52800O().mo51075P1();
        dbl0.m110646a(this.f34062x, false);
        if (mo52800O().mo52366y2()) {
            this.f34007G.m36955b(i);
        }
        if (NullChecker.m81303a(this.f34026P0.m52861E(i)) && !(this.f34026P0.m52861E(i) instanceof PictureView) && !w9a0.m202285m().m202293o()) {
            w9a0.m202285m().m202289D(true);
        }
        if (this.f34026P0.m52861E(i) instanceof PictureView) {
            if (this.f34050d1 && !xdl0.m208349O0(this.f34033T)) {
                this.f34033T.setVisibility(0);
            }
            if (this.f34051e1 && !xdl0.m208349O0(this.f34043Y) && userMo51069K2.receiveSuperLikeNum() > 1) {
                this.f34043Y.setVisibility(0);
            } else if (this.f34051e1 && !xdl0.m208349O0(this.f34045Z)) {
                this.f34045Z.setVisibility(0);
            }
        } else {
            this.f34033T.setVisibility(8);
            this.f34045Z.setVisibility(8);
            this.f34043Y.setVisibility(8);
        }
        View viewM52861E = this.f34026P0.m52861E(i);
        m52812T1(userMo51069K2, i);
        if (!NullChecker.m81303a(viewM52861E) || !xij0.m209661d0() || mo52800O().mo52348v2() || m52820c1(userMo51069K2) || m52819b1(userMo51069K2) || m52818a1() || sb90.m183207c(mo52800O().mo51069K2())) {
            return;
        }
        if ((!mo52800O().mo52366y2() || this.f34026P0.getCount() < 2 || CoreModule.f17545c.f19639e0.f149294W0.get().booleanValue()) && !m52738K0() && mo52800O().lifecycle_() == C4319c.f15548i && (viewM52861E instanceof PictureView)) {
            ((PictureView) viewM52861E).m43991V();
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m52831q1(Boolean bool) {
        mo52800O().mo52195W().requestDisallowInterceptTouchEvent(bool.booleanValue());
    }

    @Override // p149l.ah90, p149l.hn2
    /* JADX INFO: renamed from: r */
    public void mo52832r(View view) {
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m52833r1() {
        xdl0.m208325C0(this.f33999A, this.f34062x.getHeight());
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        m52783D0(mo52800O().mo52123M0());
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext()) { // from class: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileImagesItemHolder.1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return ProfileImagesItemHolder.this.f34059u.dispatchTouchEvent(motionEvent);
            }

            @Override // android.view.ViewGroup
            public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
                return ProfileImagesItemHolder.this.f34059u.onInterceptHoverEvent(motionEvent);
            }

            @Override // android.widget.FrameLayout, android.view.View
            public void onMeasure(int i, int i2) {
                setMeasuredDimension(ProfileImagesItemHolder.this.f34059u.getMeasuredWidth(), ProfileImagesItemHolder.this.f34059u.getMeasuredHeight());
            }

            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return ProfileImagesItemHolder.this.f34059u.onTouchEvent(motionEvent);
            }
        };
        this.f34059u.m50721Q(new e30() { // from class: l.hp90
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108904a.m52831q1((Boolean) obj);
            }
        });
        m52815W0();
        return frameLayout;
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m52834s1(List list, Boolean bool) {
        if (!bool.booleanValue()) {
            this.f34036U0 = -1;
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        AdmobMedia admobMedia = new AdmobMedia();
        this.f34036U0 = arrayList.size();
        arrayList.add(admobMedia);
        this.f34026P0.m52872R(arrayList);
        VPagerCircleIndicator vPagerCircleIndicator = this.f34063y;
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f34062x;
        vPagerCircleIndicator.m223143c(vPager_SquaredRefactor, vPager_SquaredRefactor.getCurrentItem());
        this.f34063y.invalidate();
        xdl0.m208345M0(this.f34063y, arrayList.size() > 1);
        if (mo52800O().mo52366y2()) {
            this.f34007G.setIndicatorCount(arrayList.size());
        }
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        User userMo51069K2 = mo52800O().mo51069K2();
        boolean zMo51119m0 = mo52800O().mo51119m0();
        final ArrayList arrayList = new ArrayList();
        if (!zMo51119m0) {
            arrayList.addAll(userMo51069K2.pictures);
            e51.m114774y(new RunnableC8738d(userMo51069K2, zMo51119m0));
            this.f34026P0.m52872R(arrayList);
            VPagerCircleIndicator vPagerCircleIndicator = this.f34063y;
            VPager_SquaredRefactor vPager_SquaredRefactor = this.f34062x;
            vPagerCircleIndicator.m223143c(vPager_SquaredRefactor, vPager_SquaredRefactor.getCurrentItem());
            this.f34063y.setOnPageChangeListener(this);
            this.f34063y.invalidate();
            xdl0.m208345M0(this.f34063y, userMo51069K2.pictures.size() > 1);
            if (mo52800O().mo52366y2()) {
                xdl0.m208344M(this.f34063y, false);
            }
            m52784D1();
            m52785F1(userMo51069K2);
            if (sb90.m183207c(mo52800O().mo51069K2())) {
                m52782C1(userMo51069K2);
            } else if (NullChecker.m81303a(this.f34047a1)) {
                xdl0.m208344M(this.f34047a1, false);
            }
            if (w9a0.m202285m().m202294p(userMo51069K2) && m131825w().mo52096I1() && arrayList.size() >= 2) {
                m52737F0().duringCreated(w9a0.m202285m().m202303y(m52737F0(), false)).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.jo90
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f118925a.m52834s1(arrayList, (Boolean) obj);
                    }
                }, new z60()));
            } else {
                this.f34036U0 = -1;
            }
        }
        if (mo52800O().mo52366y2()) {
            this.f34007G.setIndicatorCount(arrayList.size());
            if (mo52800O().mo51069K2().pictures.size() <= 1) {
                xdl0.m208344M(this.f34007G, false);
            }
        }
        boolean zM208349O0 = xdl0.m208349O0(this.f34007G);
        VImage vImage = this.f34009H;
        if (zM208349O0) {
            int i = t100.f167266o;
            xdl0.m208360X(vImage, i);
            xdl0.m208360X(this.f34017L, i);
            xdl0.m208360X(this.f34015K, i);
            xdl0.m208360X(this.f34013J, i);
        } else {
            int i2 = t100.f167259h;
            xdl0.m208360X(vImage, i2);
            xdl0.m208360X(this.f34017L, i2);
            xdl0.m208360X(this.f34015K, i2);
            xdl0.m208360X(this.f34013J, i2);
        }
        this.f34034T0++;
        if (m96413I()) {
            m52802O1();
            this.f34026P0.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m52835t1(String str, String str2, User user, UserLiveState userLiveState, View view) {
        if (mo52800O().mo51075P1()) {
            CoreModule.m29936Q().mo67217F8(m52737F0(), false, true, null);
        } else {
            CoreModule.m29936Q().startAudienceLive(m52737F0(), CoreModule.m29936Q().getUserLiveId(str), "profile", null);
        }
        if (CoreModule.f17545c.f19663m0.m31020L6(str) && TextUtils.equals("home_card", str2)) {
            ttn.m190607a(OMSDialogPositon.p_suggest_user_profile_info_view, user);
        } else {
            zvf0.m220397s("e_live_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, m52807R0(user, userLiveState, str2));
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m52836u1(View view) {
        o6j0.m162859c("e_profile_guide_first", mo52800O().pageId(), new o6j0.C18854a[0]);
        m52814V0(view, true);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m52837v1(e30 e30Var) {
        if (e30Var != null) {
            e30Var.call(this.f34017L);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m52838w1() {
        if (m52799N1()) {
            m52795L0(-1L, false);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m52839x1(boolean z) {
        if (!z) {
            xdl0.m208325C0(this.f34017L, t100.m186890d(32.0f));
            xdl0.m208368c0(this.f34015K, 0);
            xdl0.m208368c0(this.f34017L, 0);
            xdl0.m208368c0(this.f34009H, 0);
            return;
        }
        VImage vImage = this.f34015K;
        int i = t100.f167271t;
        xdl0.m208368c0(vImage, i);
        xdl0.m208368c0(this.f34017L, i);
        xdl0.m208325C0(this.f34017L, t100.m186890d(62.0f));
        xdl0.m208368c0(this.f34009H, i);
    }

    /* JADX INFO: renamed from: y1 */
    public void m52840y1() {
        m52736E1();
    }

    /* JADX INFO: renamed from: z1 */
    public void m52841z1() {
        m52811T0();
    }
}
