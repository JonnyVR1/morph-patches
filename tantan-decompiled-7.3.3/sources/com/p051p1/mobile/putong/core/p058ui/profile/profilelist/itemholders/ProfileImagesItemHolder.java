package com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.data.LikedUser;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.newui.home.NewPictureContainerIndicator;
import com.p051p1.mobile.putong.core.newui.view.CoreSupremePartnerMysteriousModeCoverView;
import com.p051p1.mobile.putong.core.newui.view.LiveLightView;
import com.p051p1.mobile.putong.core.p058ui.PictureView;
import com.p051p1.mobile.putong.core.p058ui.account.JailedDialogLikeAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ParallaxView;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfilePictureItemView;
import com.p051p1.mobile.putong.core.p058ui.profile.TagGuidePicAct;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.PerformanceLogUtil;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.ProfileLogEntity;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.AdmobMedia;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ClipRectFrameLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.views.VPager_SquaredRefactor;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p051p1.mobile.putong.data.CityC;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveState;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
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
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p151v.VDivider;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VPagerCircleIndicator;
import p151v.VText;
import p153l.a2i0;
import p153l.adc0;
import p153l.aia0;
import p153l.asj0;
import p153l.bnl0;
import p153l.br5;
import p153l.c9c0;
import p153l.cac0;
import p153l.dbc0;
import p153l.dnd0;
import p153l.end0;
import p153l.ep90;
import p153l.ey0;
import p153l.f760;
import p153l.fo0;
import p153l.fsb0;
import p153l.gra;
import p153l.gt0;
import p153l.h1e0;
import p153l.hkl0;
import p153l.i4g0;
import p153l.jek;
import p153l.jyb;
import p153l.kcg0;
import p153l.kec0;
import p153l.l51;
import p153l.lb2;
import p153l.ner;
import p153l.nwb;
import p153l.p6w;
import p153l.p9r;
import p153l.pcj;
import p153l.pf60;
import p153l.psd0;
import p153l.pza0;
import p153l.q3m;
import p153l.qa00;
import p153l.qap;
import p153l.qcj;
import p153l.rc80;
import p153l.s75;
import p153l.sfj0;
import p153l.t3m;
import p153l.tvn;
import p153l.uqb0;
import p153l.v60;
import p153l.vq8;
import p153l.we60;
import p153l.wj90;
import p153l.x20;
import p153l.xu90;
import p153l.y20;
import p153l.zx90;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileImagesItemHolder extends ep90 implements ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: k1 */
    public static int f34845k1 = (int) (bnl0.m105592y0() * 0.25f);

    /* JADX INFO: renamed from: l1 */
    public static int f34846l1 = (int) (bnl0.m105592y0() * 1.25f);

    /* JADX INFO: renamed from: A */
    public ViewStub f34847A;

    /* JADX INFO: renamed from: B */
    public VDraweeView f34848B;

    /* JADX INFO: renamed from: C */
    public LinearLayout f34849C;

    /* JADX INFO: renamed from: D */
    public VImage f34850D;

    /* JADX INFO: renamed from: E */
    public View f34851E;

    /* JADX INFO: renamed from: E0 */
    public VFrame f34852E0;

    /* JADX INFO: renamed from: F */
    public FrameLayout f34853F;

    /* JADX INFO: renamed from: F0 */
    public ClipRectFrameLayout f34854F0;

    /* JADX INFO: renamed from: G */
    public NewPictureContainerIndicator f34855G;

    /* JADX INFO: renamed from: G0 */
    public VDraweeView f34856G0;

    /* JADX INFO: renamed from: H */
    public VImage f34857H;

    /* JADX INFO: renamed from: H0 */
    public View f34858H0;

    /* JADX INFO: renamed from: I */
    public VImage f34859I;

    /* JADX INFO: renamed from: I0 */
    public SVGAnimationView f34860I0;

    /* JADX INFO: renamed from: J */
    public VText f34861J;

    /* JADX INFO: renamed from: J0 */
    public SVGAnimationView f34862J0;

    /* JADX INFO: renamed from: K */
    public VImage f34863K;

    /* JADX INFO: renamed from: K0 */
    public TextView f34864K0;

    /* JADX INFO: renamed from: L */
    public LinearLayout f34865L;

    /* JADX INFO: renamed from: L0 */
    public TextView f34866L0;

    /* JADX INFO: renamed from: M */
    public VImage f34867M;

    /* JADX INFO: renamed from: M0 */
    public SVGAnimationView f34868M0;

    /* JADX INFO: renamed from: N */
    public FrameLayout f34869N;

    /* JADX INFO: renamed from: N0 */
    public VDraweeView f34870N0;

    /* JADX INFO: renamed from: O */
    public LiveLightView f34871O;

    /* JADX INFO: renamed from: O0 */
    public VFrame f34872O0;

    /* JADX INFO: renamed from: P */
    public VText f34873P;

    /* JADX INFO: renamed from: P0 */
    public final C8900c f34874P0;

    /* JADX INFO: renamed from: Q */
    public VImage f34875Q;

    /* JADX INFO: renamed from: Q0 */
    public boolean f34876Q0;

    /* JADX INFO: renamed from: R */
    public TextView f34877R;

    /* JADX INFO: renamed from: R0 */
    public boolean f34878R0;

    /* JADX INFO: renamed from: S */
    public FrameLayout f34879S;

    /* JADX INFO: renamed from: S0 */
    public boolean f34880S0;

    /* JADX INFO: renamed from: T */
    public LinearLayout f34881T;

    /* JADX INFO: renamed from: T0 */
    public int f34882T0;

    /* JADX INFO: renamed from: U */
    public SVGAnimationView f34883U;

    /* JADX INFO: renamed from: U0 */
    public int f34884U0;

    /* JADX INFO: renamed from: V */
    public LinearLayout f34885V;

    /* JADX INFO: renamed from: V0 */
    public int f34886V0;

    /* JADX INFO: renamed from: W */
    public VText f34887W;

    /* JADX INFO: renamed from: W0 */
    public float f34888W0;

    /* JADX INFO: renamed from: X */
    public VImage f34889X;

    /* JADX INFO: renamed from: X0 */
    public Map<Integer, View> f34890X0;

    /* JADX INFO: renamed from: Y */
    public SuperLikeComboAnimView f34891Y;

    /* JADX INFO: renamed from: Y0 */
    public int f34892Y0;

    /* JADX INFO: renamed from: Z */
    public VImage f34893Z;

    /* JADX INFO: renamed from: Z0 */
    public List<View> f34894Z0;

    /* JADX INFO: renamed from: a1 */
    public CoreSupremePartnerMysteriousModeCoverView f34895a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f34896b1;

    /* JADX INFO: renamed from: c1 */
    public int f34897c1;

    /* JADX INFO: renamed from: d1 */
    public boolean f34898d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f34899e1;

    /* JADX INFO: renamed from: f1 */
    public kcg0 f34900f1;

    /* JADX INFO: renamed from: g1 */
    public View f34901g1;

    /* JADX INFO: renamed from: h1 */
    public int f34902h1;

    /* JADX INFO: renamed from: i1 */
    public boolean f34903i1;

    /* JADX INFO: renamed from: j1 */
    public boolean f34904j1;

    /* JADX INFO: renamed from: k0 */
    public VImage f34905k0;

    /* JADX INFO: renamed from: p0 */
    public VDraweeView f34906p0;

    /* JADX INFO: renamed from: u */
    public ParallaxView f34907u;

    /* JADX INFO: renamed from: v */
    public FrameLayout f34908v;

    /* JADX INFO: renamed from: w */
    public LinearLayout f34909w;

    /* JADX INFO: renamed from: x */
    public VPager_SquaredRefactor f34910x;

    /* JADX INFO: renamed from: y */
    public VPagerCircleIndicator f34911y;

    /* JADX INFO: renamed from: z */
    public View f34912z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileImagesItemHolder$a */
    public class C8898a implements ViewPager.InterfaceC0718j {
        public C8898a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            ProfileImagesItemHolder.this.f34892Y0 = i;
            ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
            profileImagesItemHolder.m53975J0(profileImagesItemHolder.f34892Y0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileImagesItemHolder$b */
    public class C8899b extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public final int[] f34915a = new int[2];

        /* JADX INFO: renamed from: b */
        public int f34916b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f34917c;

        public C8899b(View view) {
            this.f34917c = view;
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final void m54026b() {
            if (this.f34917c.isAttachedToWindow()) {
                this.f34917c.getLocationInWindow(this.f34915a);
                int[] iArr = this.f34915a;
                if (iArr[1] > 0) {
                    iArr[1] = 0;
                }
                ProfileImagesItemHolder.this.f34907u.setScroll(Math.abs(iArr[1]));
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 0) {
                l51.m152889I(ProfileImagesItemHolder.this.mo53983O().mo52249J1(), new Runnable() { // from class: l.nx90
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f144098a.m54026b();
                    }
                }, 6L);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            m54026b();
            this.f34916b -= i2;
            ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
            if (profileImagesItemHolder.f34904j1 && NullChecker.m82486a(profileImagesItemHolder.f34901g1)) {
                ProfileImagesItemHolder profileImagesItemHolder2 = ProfileImagesItemHolder.this;
                profileImagesItemHolder2.m53997V0(profileImagesItemHolder2.f34901g1, false);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileImagesItemHolder$c */
    public class C8900c extends lb2 {

        /* JADX INFO: renamed from: e */
        public boolean f34919e;

        /* JADX INFO: renamed from: f */
        public boolean f34920f;

        /* JADX INFO: renamed from: g */
        public List<Media> f34921g = new ArrayList();

        /* JADX INFO: renamed from: h */
        public Stack<View> f34922h = new Stack<>();

        /* JADX INFO: renamed from: i */
        public int f34923i = 0;

        public C8900c() {
        }

        /* JADX INFO: renamed from: D */
        private Act m54030D() {
            return ProfileImagesItemHolder.this.mo53983O().act();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: K */
        public /* synthetic */ void m54031K(View view) {
            if (ProfileImagesItemHolder.this.f34876Q0) {
                ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
                if (profileImagesItemHolder.f34904j1 || (profileImagesItemHolder.m53996U0() && ProfileImagesItemHolder.this.m53982N1())) {
                    ProfileImagesItemHolder.this.m53978L0(4000L, true);
                    return;
                }
            }
            ProfileImagesItemHolder.this.m53991R1();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: L */
        public /* synthetic */ void m54032L(View view) {
            if (ProfileImagesItemHolder.this.f34876Q0) {
                ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
                if (profileImagesItemHolder.f34904j1 || (profileImagesItemHolder.m53996U0() && ProfileImagesItemHolder.this.m53982N1())) {
                    ProfileImagesItemHolder.this.m53978L0(4000L, true);
                    return;
                }
            }
            ProfileImagesItemHolder.this.m53987P1();
        }

        /* JADX INFO: renamed from: W */
        private void m54033W(PictureView pictureView, Media media) {
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(ProfileImagesItemHolder.this.mo53983O().mo52252K2().f56859id);
            if (NullChecker.m82486a(pictureView) && NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isQuickChatClearAvatar(CoreModule.f18264c.f20381e0.m116593na())) {
                uqb0.f180374G.m127115L0(pictureView.f28918a, media.url);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: v */
        public static /* synthetic */ Integer m54039v(pf60 pf60Var) {
            return (Integer) pf60Var.f152156a;
        }

        /* JADX INFO: renamed from: E */
        public View m54044E(int i) {
            View viewM54045F = m54045F(i);
            return (NullChecker.m82486a(viewM54045F) && (viewM54045F instanceof ProfilePictureItemView)) ? ((ProfilePictureItemView) viewM54045F).f33890b : viewM54045F;
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
        public View m54045F(int i) {
            if (ProfileImagesItemHolder.this.f34910x != null) {
                for (int i2 = 0; i2 < ProfileImagesItemHolder.this.f34910x.getChildCount(); i2++) {
                    Object tag = ProfileImagesItemHolder.this.f34910x.getChildAt(i2).getTag();
                    if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                        return ProfileImagesItemHolder.this.f34910x.getChildAt(i2);
                    }
                }
                return null;
            }
            StringBuilder sb = new StringBuilder("images is null from : ");
            sb.append(ProfileImagesItemHolder.this.mo53983O().from());
            sb.append(" content is null ");
            sb.append(ProfileImagesItemHolder.this.mo53983O().mo53306M0() == null);
            sb.append(" life + ");
            sb.append(ProfileImagesItemHolder.this.mo53983O().lifecycle_().f16276c);
            sb.append(" hasRender ");
            sb.append(ProfileImagesItemHolder.this.m168317h());
            CrashHelper.m82479c(new IllegalStateException(sb.toString()));
            return null;
        }

        /* JADX INFO: renamed from: G */
        public final void m54046G(PictureView pictureView) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) pictureView.f28924g.getLayoutParams();
            layoutParams.gravity = 17;
            layoutParams.bottomMargin = 0;
            layoutParams.topMargin = 0;
            layoutParams.rightMargin = 0;
            layoutParams.leftMargin = 0;
            pictureView.f28924g.setLayoutParams(layoutParams);
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m54047H(int i) {
            this.f34921g.remove(i);
            this.f34919e = true;
            ProfileImagesItemHolder.this.f34874P0.m54055R(this.f34921g);
            if (ProfileImagesItemHolder.this.mo53983O().mo53549y2()) {
                ProfileImagesItemHolder.this.f34855G.setIndicatorCount(this.f34921g.size());
            }
        }

        /* JADX INFO: renamed from: I */
        public final /* synthetic */ void m54048I(PictureView pictureView, int i, Integer num) {
            if (num.intValue() >= 100) {
                bnl0.m105524M(pictureView.f28921d, false);
            }
            m54054Q(pictureView, this.f34921g.get(i), num.intValue());
        }

        /* JADX INFO: renamed from: J */
        public final /* synthetic */ void m54049J(PictureView pictureView, boolean z, boolean z2, View view) {
            int iM45172T = pictureView.m45172T();
            if (iM45172T == -1 && ProfileImagesItemHolder.this.f34910x.getCurrentItem() > 0) {
                VPager_SquaredRefactor vPager_SquaredRefactor = ProfileImagesItemHolder.this.f34910x;
                vPager_SquaredRefactor.setCurrentItem(vPager_SquaredRefactor.getCurrentItem() - 1);
                return;
            }
            if (iM45172T == 1 && ProfileImagesItemHolder.this.f34910x.getCurrentItem() < getCount() - 1) {
                VPager_SquaredRefactor vPager_SquaredRefactor2 = ProfileImagesItemHolder.this.f34910x;
                vPager_SquaredRefactor2.setCurrentItem(vPager_SquaredRefactor2.getCurrentItem() + 1);
            } else {
                if (iM45172T != 0 || ProfileImagesItemHolder.this.mo53983O().mo53313N2()) {
                    return;
                }
                if (z && !z2 && (ProfileImagesItemHolder.this.mo53983O().act() instanceof NewUI1ContainerActivity)) {
                    ProfileImagesItemHolder.this.mo53983O().act().startActivity(ProfileAct.m51922q2(ProfileImagesItemHolder.this.mo53983O().act(), ProfileImagesItemHolder.this.mo53983O().userId(), "profile_frag_picture", false, true));
                } else {
                    ProfileImagesItemHolder.this.mo53983O().m53521tc();
                }
            }
        }

        /* JADX INFO: renamed from: M */
        public final /* synthetic */ void m54050M(boolean z, View view) {
            if (ProfileImagesItemHolder.this.f34876Q0) {
                ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
                if (profileImagesItemHolder.f34904j1 || (profileImagesItemHolder.m53996U0() && ProfileImagesItemHolder.this.m53982N1())) {
                    ProfileImagesItemHolder.this.m53978L0(4000L, true);
                    return;
                }
            }
            if (z && ProfileImagesItemHolder.this.m53996U0() && ProfileImagesItemHolder.this.m53982N1()) {
                ProfileImagesItemHolder.this.m53978L0(4000L, true);
            } else {
                pza0.m174356h("hotspot");
                ProfileImagesItemHolder.this.mo53983O().mo52306o();
            }
        }

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ void m54051N(int i, View view) {
            i4g0.m138523u("e_invisible_photo_upload", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("invisible_photo_location", Integer.valueOf(i)), jyb.m147494Y("invisible_photo_is_thumbnail", Boolean.FALSE));
            we60.m205991a(m54030D(), CoreStaticData.ProfileFromType.FROM_PROFILE_UPLOAD_PHOTO);
        }

        /* JADX INFO: renamed from: O */
        public final /* synthetic */ void m54052O(int i, View view) {
            if (CoreModule.f18264c.f20381e0.m116600p9().isBanned()) {
                JailedDialogLikeAct.m45369p2(true);
                return;
            }
            if (CoreModule.f18264c.f20381e0.m116600p9().isProfileJailed()) {
                ey0.m123127i(m54030D(), false);
                return;
            }
            a2i0.m95674b().m95678e(CoreModule.f18264c.f20381e0.m116593na().mo225055clone());
            m54030D().startActivity(TagGuidePicAct.m51955Z1(m54030D(), true, "from_upload_pic", "from_complete_equity_guide"));
            i4g0.m138523u("e_invisible_photo_upload", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("invisible_photo_location", Integer.valueOf(i)), jyb.m147494Y("need_photo_count", Integer.valueOf(3 - CoreModule.f18264c.f20381e0.m116593na().pictures.size())), jyb.m147494Y("invisible_photo_is_thumbnail", Boolean.FALSE));
        }

        /* JADX INFO: renamed from: P */
        public final /* synthetic */ void m54053P(View view) {
            ProfileImagesItemHolder.this.mo53983O().mo52296j3(SwipeDirection.UP.getValue());
        }

        /* JADX INFO: renamed from: Q */
        public void m54054Q(PictureView pictureView, Media media, int i) {
            if (ProfileImagesItemHolder.this.m121838I()) {
                return;
            }
            if (wj90.m206620c(ProfileImagesItemHolder.this.mo53983O().mo52252K2())) {
                pictureView.m45185g0(media);
            } else {
                pictureView.m45177Y(media, i);
            }
            m54033W(pictureView, media);
            ProfileImagesItemHolder.this.mo53983O().mo53341R1(i);
        }

        /* JADX INFO: renamed from: R */
        public void m54055R(List<Media> list) {
            if (list.equals(this.f34921g) && !this.f34919e) {
                ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
                profileImagesItemHolder.m53995T1(profileImagesItemHolder.mo53983O().mo52252K2(), ProfileImagesItemHolder.this.m53981N0());
            } else {
                this.f34919e = false;
                this.f34923i = getCount();
                this.f34921g = list;
                ProfileImagesItemHolder.this.f34874P0.notifyDataSetChanged();
            }
        }

        /* JADX INFO: renamed from: S */
        public void m54056S(PictureView pictureView, Media media, int i, int i2) {
            if (ProfileImagesItemHolder.this.m121838I()) {
                return;
            }
            if (wj90.m206620c(ProfileImagesItemHolder.this.mo53983O().mo52252K2())) {
                bnl0.m105525M0(pictureView.f28938s, false);
                pictureView.m45185g0(media);
                return;
            }
            if (CoreModule.m30930K().me_().pictures.size() != 1 || ProfileImagesItemHolder.this.mo53983O().mo52252K2().isMe()) {
                bnl0.m105525M0(pictureView.f28938s, false);
                pictureView.m45177Y(media, i);
                m54033W(pictureView, media);
                ProfileImagesItemHolder.this.mo53983O().mo53341R1(i);
                return;
            }
            int iM131674e0 = gra.m131674e0();
            if (iM131674e0 >= 1 && i2 == iM131674e0) {
                m54059V(pictureView, media, i2);
                return;
            }
            bnl0.m105525M0(pictureView.f28938s, false);
            pictureView.m45177Y(media, i);
            m54033W(pictureView, media);
            ProfileImagesItemHolder.this.mo53983O().mo53341R1(i);
        }

        /* JADX INFO: renamed from: T */
        public void m54057T(PictureView pictureView, Media media, final int i) {
            if (ProfileImagesItemHolder.this.mo53983O().mo52252K2() == null || ProfileImagesItemHolder.this.mo53983O().mo52252K2().isMe() || ProfileImagesItemHolder.this.mo53983O().mo52252K2().onlineMatchAvatarUnlock(true) || ProfileImagesItemHolder.this.m121838I()) {
                return;
            }
            if (wj90.m206620c(ProfileImagesItemHolder.this.mo53983O().mo52252K2())) {
                bnl0.m105525M0(pictureView.f28938s, false);
                pictureView.m45185g0(media);
                return;
            }
            int size = CoreModule.f18264c.f20381e0.m116600p9().pictures.size();
            boolean z = i >= size && size <= 2;
            bnl0.m105524M(pictureView.f28938s, z);
            if (!z) {
                pictureView.m45177Y(media, -1);
                m54033W(pictureView, media);
                ProfileImagesItemHolder.this.mo53983O().mo53341R1(-1);
                return;
            }
            pictureView.m45181c0(media, true);
            pictureView.f28940u.setText(String.format("再上传%s张照片\n即可查看%s的全部照片", Integer.valueOf(3 - CoreModule.f18264c.f20381e0.m116600p9().pictures.size()), ProfileImagesItemHolder.this.mo53983O().mo52252K2().getPronoun()));
            bnl0.m105524M(pictureView.f28940u, true);
            bnl0.m105524M(pictureView.f28939t, true);
            bnl0.m105524M(pictureView.f28941v, true);
            bnl0.m105524M(pictureView.f28942w, false);
            bnl0.m105524M(pictureView.f28943x, false);
            bnl0.m105524M(pictureView.f28944y, false);
            bnl0.m105509E0(pictureView.f28941v, new View.OnClickListener() { // from class: l.wx90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f191385a.m54052O(i, view);
                }
            });
        }

        /* JADX INFO: renamed from: U */
        public final void m54058U(PictureView pictureView) {
            pictureView.f28924g.setVisibility(4);
            View viewInflate = ProfileImagesItemHolder.this.mo53983O().mo146493H2().inflate(kec0.f125463Ie, (ViewGroup) pictureView, true);
            View viewFindViewById = viewInflate.findViewById(adc0.f70323ec);
            viewInflate.findViewById(adc0.f70345g0);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70226Z);
            VDraweeView vDraweeView2 = (VDraweeView) viewInflate.findViewById(adc0.f70311e0);
            uqb0.f180374G.m127115L0(vDraweeView, CoreModule.f18264c.f20381e0.m116600p9().picture(0).url);
            uqb0.f180374G.m127115L0(vDraweeView2, this.f34921g.get(0).cover().url);
            viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.xx90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f196621a.m54053P(view);
                }
            });
        }

        /* JADX INFO: renamed from: V */
        public final void m54059V(PictureView pictureView, Media media, int i) {
            pictureView.f28943x.setText(m54030D().getString(R$string.f19525oh));
            bnl0.m105525M0(pictureView.f28938s, true);
            pictureView.m45181c0(media, true);
            m54033W(pictureView, media);
            if (i == ProfileImagesItemHolder.this.f34910x.getCurrentItem()) {
                i4g0.m138492A("e_invisible_photo_upload", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("invisible_photo_location", Integer.valueOf(i)), jyb.m147494Y("need_photo_count", Integer.valueOf(3 - CoreModule.f18264c.f20381e0.m116593na().pictures.size())), jyb.m147494Y("invisible_photo_is_thumbnail", Boolean.FALSE));
            }
        }

        @Override // p153l.lb2, p153l.cf60
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            super.destroyItem(viewGroup, i, obj);
        }

        @Override // p153l.cf60
        public int getCount() {
            if (!ProfileImagesItemHolder.this.m121838I() || jyb.m147479J(this.f34921g)) {
                return this.f34921g.size();
            }
            return 1;
        }

        @Override // p153l.cf60
        public int getItemPosition(Object obj) {
            if (ProfileImagesItemHolder.this.m121838I()) {
                return -2;
            }
            int i = this.f34923i;
            if (i <= 0) {
                return super.getItemPosition(obj);
            }
            this.f34923i = i - 1;
            return -2;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            this.f34919e = true;
            if (i == ProfileImagesItemHolder.this.f34910x.getCurrentItem()) {
                hkl0.m135638a(ProfileImagesItemHolder.this.f34910x, false);
            }
            viewGroup.removeView((View) obj);
            if (obj instanceof PictureView) {
                this.f34922h.add((PictureView) obj);
            }
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, final int i) {
            int iHashCode = new Object().hashCode();
            ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.CUSTOM;
            PerformanceLogUtil.logBegin(iHashCode, profileLogName, getClass().getSimpleName().concat(" onInstantiateItem"));
            if (this.f34921g.get(i) instanceof AdmobMedia) {
                FrameLayout frameLayout = new FrameLayout(m54030D());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, ProfileImagesItemHolder.this.f34910x.getHeight()));
                aia0.m97972m().m97973A(frameLayout, m54030D(), new x20() { // from class: l.ox90
                    @Override // p153l.x20
                    public final void call() {
                        this.f149631a.m54047H(i);
                    }
                });
                frameLayout.setTag(Integer.valueOf(i));
                viewGroup.addView(frameLayout);
                return frameLayout;
            }
            final PictureView pictureView = !this.f34922h.isEmpty() ? (PictureView) this.f34922h.pop() : (PictureView) ProfileImagesItemHolder.this.mo53983O().mo146493H2().inflate(kec0.f125431Ge, viewGroup, false);
            boolean zMo53530v1 = ProfileImagesItemHolder.this.mo53983O().mo53530v1();
            boolean zMo53484o1 = ProfileImagesItemHolder.this.mo53983O().mo53484o1();
            int iMo53293K3 = ProfileImagesItemHolder.this.mo53983O().mo53293K3();
            boolean zMo53385X1 = ProfileImagesItemHolder.this.mo53983O().mo53385X1();
            boolean zMo53405a0 = ProfileImagesItemHolder.this.mo53983O().mo53405a0();
            final boolean zMo52236D2 = ProfileImagesItemHolder.this.mo53983O().mo52236D2();
            final boolean zMo52302m0 = ProfileImagesItemHolder.this.mo53983O().mo52302m0();
            final boolean zMo52258P1 = ProfileImagesItemHolder.this.mo53983O().mo52258P1();
            boolean zMo53493p2 = ProfileImagesItemHolder.this.mo53983O().mo53493p2();
            User userMo52252K2 = ProfileImagesItemHolder.this.mo53983O().mo52252K2();
            int iM213123a = xu90.m213122d().m213123a(userMo52252K2);
            if (NullChecker.m82486a(userMo52252K2) && !userMo52252K2.isMe()) {
                pictureView.setShowPetTag(true);
                pictureView.setIsFemale(userMo52252K2.isFemale());
            }
            if (iM213123a != -1) {
                pictureView.f28880A.setVisibility(0);
                pictureView.f28881B.setVisibility(0);
                xu90.m213122d().m213130i(iM213123a, pictureView.f28882C);
            } else {
                pictureView.f28880A.setVisibility(8);
                pictureView.f28881B.setVisibility(8);
            }
            String strFrom = ProfileImagesItemHolder.this.mo53983O().from();
            if (ProfileImagesItemHolder.this.mo53983O().mo53422d1() == i) {
                bnl0.m105524M(pictureView.f28931m, zMo53530v1);
                bnl0.m105524M(pictureView.f28932n, zMo53484o1);
                if (iMo53293K3 > 0) {
                    pictureView.f28933o.setWidth(iMo53293K3);
                    if (zMo53385X1) {
                        pictureView.f28933o.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                }
                pf60<Integer, Integer> pf60VarMo53255E2 = ProfileImagesItemHolder.this.mo53983O().mo53255E2();
                if (pf60VarMo53255E2 != null && zMo53405a0) {
                    ViewGroup.LayoutParams layoutParams = pictureView.f28918a.getLayoutParams();
                    layoutParams.width = pf60VarMo53255E2.f152156a.intValue();
                    layoutParams.height = pf60VarMo53255E2.f152157b.intValue();
                    pictureView.f28918a.setLayoutParams(layoutParams);
                }
                if (zMo52236D2 && pf60VarMo53255E2 != null && zMo53405a0) {
                    ViewGroup.LayoutParams layoutParams2 = pictureView.f28918a.getLayoutParams();
                    layoutParams2.width = pf60VarMo53255E2.f152156a.intValue();
                    layoutParams2.height = pf60VarMo53255E2.f152157b.intValue();
                    pictureView.f28918a.setLayoutParams(layoutParams2);
                }
            }
            pictureView.setFrom(strFrom);
            pictureView.f28918a.getHierarchy().m207045H(null);
            pictureView.f28918a.getHierarchy().m207038A(ProfileImagesItemHolder.this.mo53983O().act().getResources().getDrawable(c9c0.f80363P));
            if (zMo52236D2) {
                pictureView.m45166K(true, false, true);
            } else {
                pictureView.m45165J(true, false);
                pictureView.setAspectRateFitWidth(0.8f);
                pictureView.f28918a.getHierarchy().m207062w(h1e0.f107452i);
            }
            pictureView.m45188k0();
            if ("live_profile_voice_mask_mode".equals(strFrom)) {
                m54054Q(pictureView, this.f34921g.get(i), 0);
            } else {
                boolean zM54003c1 = ProfileImagesItemHolder.this.m54003c1(userMo52252K2);
                ProfileImagesItemHolder profileImagesItemHolder = ProfileImagesItemHolder.this;
                if (zM54003c1) {
                    profileImagesItemHolder.f34878R0 = true;
                    m54054Q(pictureView, this.f34921g.get(i), 15);
                } else {
                    boolean zM53921K0 = profileImagesItemHolder.m53921K0();
                    ProfileImagesItemHolder profileImagesItemHolder2 = ProfileImagesItemHolder.this;
                    if (zM53921K0) {
                        profileImagesItemHolder2.f34878R0 = true;
                        m54054Q(pictureView, this.f34921g.get(i), 0);
                    } else if (profileImagesItemHolder2.m54002b1(userMo52252K2)) {
                        ProfileImagesItemHolder.this.f34878R0 = true;
                        p6w p6wVar = p6w.INSTANCE;
                        if (p6wVar.m171055C(userMo52252K2.f56859id)) {
                            m54054Q(pictureView, this.f34921g.get(i), 0);
                        } else {
                            m153557n(ProfileImagesItemHolder.this.m168321p(), p6wVar.m171058F(ProfileImagesItemHolder.this.mo53983O().userId())).map(new qcj() { // from class: l.px90
                                @Override // p153l.qcj
                                public final Object call(Object obj) {
                                    return ProfileImagesItemHolder.C8900c.m54039v((pf60) obj);
                                }
                            }).subscribe(psd0.m173596G(new y20() { // from class: l.qx90
                                @Override // p153l.y20
                                public final void call(Object obj) {
                                    this.f160022a.m54048I(pictureView, i, (Integer) obj);
                                }
                            }));
                        }
                        if (!"from_voice_buzz".equals(strFrom)) {
                            bnl0.m105524M(pictureView.f28921d, true);
                        }
                    } else if (zMo53493p2 && (!zMo53493p2 || i >= this.f34921g.size())) {
                        ProfileImagesItemHolder.this.f34878R0 = true;
                        m54054Q(pictureView, this.f34921g.get(i - 1), 15);
                        m54058U(pictureView);
                    } else if (gra.m131776y2() && (ProfileImagesItemHolder.this.mo53983O().mo52252K2() == null || !ProfileImagesItemHolder.this.mo53983O().mo52252K2().isMe())) {
                        m54057T(pictureView, this.f34921g.get(i), i);
                    } else if (gra.m131756u2() && ProfileImagesItemHolder.this.mo53983O().mo52261R()) {
                        m54056S(pictureView, this.f34921g.get(i), -1, i);
                    } else {
                        m54054Q(pictureView, this.f34921g.get(i), -1);
                    }
                }
            }
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(userMo52252K2.f56859id);
            if (NullChecker.m82486a(conversationM33859Xe) && conversationM33859Xe.isQuickChatClearAvatar(CoreModule.f18264c.f20381e0.m116593na())) {
                bnl0.m105524M(pictureView.f28921d, false);
            }
            pictureView.setOnClickListener(new View.OnClickListener() { // from class: l.rx90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f165317a.m54049J(pictureView, zMo52258P1, zMo52302m0, view);
                }
            });
            pictureView.setTag(Integer.valueOf(i));
            pictureView.setPivotX(0.0f);
            pictureView.setPivotY(0.0f);
            viewGroup.addView(pictureView);
            if (ProfileImagesItemHolder.this.mo53983O().mo53549y2()) {
                pictureView.setOnClickListener(null);
                View viewInflate = p9r.m171370a(ProfileImagesItemHolder.this.mo53983O().act()).inflate(kec0.f126085u9, (ViewGroup) null);
                pictureView.addView(viewInflate, 1);
                bnl0.m105548c0(viewInflate, 0);
                View viewFindViewById = viewInflate.findViewById(adc0.f70276c);
                View viewFindViewById2 = viewInflate.findViewById(adc0.f70293d);
                View viewFindViewById3 = viewInflate.findViewById(adc0.f70327f);
                ProfileImagesItemHolder.this.mo53983O().m189087s();
                viewFindViewById2.setOnClickListener(new View.OnClickListener() { // from class: l.sx90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f171099a.m54031K(view);
                    }
                });
                viewFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.tx90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f176536a.m54032L(view);
                    }
                });
                if (ProfileImagesItemHolder.this.f34876Q0 && !gra.m131638V2()) {
                    bnl0.m105525M0(viewFindViewById3, true);
                    ProfileImagesItemHolder.this.f34890X0.put(Integer.valueOf(i), viewFindViewById3);
                    bnl0.m105505C0(viewFindViewById3, ((int) ((ProfileImagesItemHolder.f34846l1 - ProfileImagesItemHolder.this.f34886V0) * ProfileImagesItemHolder.this.f34888W0)) + (ProfileImagesItemHolder.this.f34886V0 / 2));
                    viewFindViewById3.setOnClickListener(new View.OnClickListener() { // from class: l.ux90
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.f181357a.m54050M(zMo52236D2, view);
                        }
                    });
                }
            }
            if (i == ProfileImagesItemHolder.this.f34910x.getCurrentItem() && ProfileImagesItemHolder.this.mo53983O().mo53499q3() && ((!zMo52258P1 || !this.f34920f) && asj0.m99935d0() && !ProfileImagesItemHolder.this.mo53983O().mo53531v2() && !ProfileImagesItemHolder.this.m54003c1(userMo52252K2) && !ProfileImagesItemHolder.this.m54002b1(userMo52252K2) && !wj90.m206620c(ProfileImagesItemHolder.this.mo53983O().mo52252K2()))) {
                if (zMo52258P1 && !this.f34920f) {
                    this.f34920f = true;
                }
                if ((!ProfileImagesItemHolder.this.mo53983O().mo53549y2() || getCount() < 2 || CoreModule.f18264c.f20381e0.f89151W0.get().booleanValue()) && !ProfileImagesItemHolder.this.m53921K0()) {
                    pictureView.m45174V();
                }
            }
            if (zMo52236D2) {
                if (!ProfileImagesItemHolder.this.f34876Q0) {
                    m54046G(pictureView);
                }
                if (NullChecker.m82486a(pictureView.f28918a.getHierarchy()) && !ProfileImagesItemHolder.this.m121838I()) {
                    pictureView.f28918a.getHierarchy().m207042E(new rc80(0.0f));
                    pictureView.f28918a.getHierarchy().m207040C(m54030D().getDrawable(dbc0.f86656V7));
                }
            }
            PerformanceLogUtil.logEnd(iHashCode, profileLogName, getClass().getSimpleName().concat(" onInstantiateItem"));
            if (gra.m131756u2()) {
                bnl0.m105509E0(pictureView.f28945z, new View.OnClickListener() { // from class: l.vx90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f186251a.m54051N(i, view);
                    }
                });
            }
            if (ProfileImagesItemHolder.this.m121838I()) {
                uqb0.f180374G.m127138Y0(pictureView.f28918a, dbc0.f87061hm);
                pictureView.m45190m0();
            }
            return pictureView;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileImagesItemHolder$d */
    public static class RunnableC8901d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final User f34925a;

        /* JADX INFO: renamed from: b */
        public final boolean f34926b;

        public RunnableC8901d(User user, boolean z) {
            this.f34925a = user;
            this.f34926b = z;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ void m54060a(boolean z, pf60 pf60Var) {
            Priority priority;
            F f = pf60Var.f152156a;
            String str = (!(f instanceof Video) || z) ? "profile" : "";
            Picture.ImageUri imageUriM164968f = nwb.m164968f((Media) f);
            fsb0 fsb0Var = uqb0.f180374G;
            if (((Integer) pf60Var.f152157b).intValue() == 0) {
                priority = Priority.HIGH;
            } else {
                priority = ((Integer) pf60Var.f152157b).intValue() == 1 ? Priority.MEDIUM : Priority.LOW;
            }
            fsb0Var.m127159w0(imageUriM164968f, priority, str);
        }

        /* JADX INFO: renamed from: b */
        public final void m54061b(User user, final boolean z) {
            if (ConnectivityReceiver.m82469i()) {
                jyb.m147537z(jyb.m147527p0(user.pictures), new y20() { // from class: l.yx90
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ProfileImagesItemHolder.RunnableC8901d.m54060a(z, (pf60) obj);
                    }
                });
            } else {
                uqb0.f180374G.m127159w0(nwb.m164968f(user.media(0)), Priority.HIGH, (!(user.pictures.get(0) instanceof Video) || z) ? "profile" : "");
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            m54061b(this.f34925a, this.f34926b);
        }
    }

    public ProfileImagesItemHolder(@NonNull q3m q3mVar, @NonNull ner nerVar) {
        super(q3mVar, nerVar);
        this.f34874P0 = new C8900c();
        this.f34876Q0 = mo53983O().m189087s();
        this.f34878R0 = false;
        this.f34880S0 = false;
        this.f34882T0 = 0;
        this.f34884U0 = -1;
        this.f34886V0 = 0;
        this.f34888W0 = 0.25f;
        this.f34890X0 = new HashMap();
        this.f34892Y0 = 0;
        this.f34894Z0 = new ArrayList();
        this.f34897c1 = -1;
        this.f34902h1 = -1;
        m168321p().creates(new y20() { // from class: l.yw90
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileImagesItemHolder.m53929X((Bundle) obj);
            }
        }, new x20() { // from class: l.fx90
            @Override // p153l.x20
            public final void call() {
                this.f101245a.m53952p1();
            }
        });
    }

    /* JADX INFO: renamed from: E1 */
    private void m53919E1() {
        if (NullChecker.m82486a(this.f34851E)) {
            bnl0.m105524M(this.f34851E, true);
        }
        if (NullChecker.m82486a(this.f34879S)) {
            bnl0.m105524M(this.f34879S, true);
        }
        if (NullChecker.m82486a(this.f34865L)) {
            bnl0.m105524M(this.f34865L, false);
        }
        if (NullChecker.m82486a(this.f34863K)) {
            if (mo53983O().mo52252K2().isMe() && !mo53983O().mo53313N2() && mo53983O().mo52262R0()) {
                bnl0.m105524M(this.f34863K, true);
            } else {
                bnl0.m105524M(this.f34863K, false);
            }
        }
    }

    /* JADX INFO: renamed from: F0 */
    private Act m53920F0() {
        return mo53983O().act();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: K0 */
    public boolean m53921K0() {
        mo53983O().userId();
        return false;
    }

    /* JADX INFO: renamed from: M1 */
    private void m53922M1(boolean z) {
        gt0.m132170p(this.f34910x, "translationX", 0L, 150L, null, (z ? -1 : 1) * qa00.m175859d(10.0f), 0.0f).start();
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m53924S(Throwable th) {
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m53929X(Bundle bundle) {
    }

    /* JADX INFO: renamed from: Z0 */
    private void m53932Z0() {
        ViewGroup.LayoutParams layoutParams = this.f34853F.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, -2);
        }
        layoutParams.height = qa00.f156333t;
        this.f34853F.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m53939g0(x20 x20Var, x20 x20Var2, View view) {
        if (x20Var != null) {
            x20Var.call();
        }
        if (NullChecker.m82486a(x20Var2)) {
            x20Var2.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public /* synthetic */ void m53945l1(View view) {
        pza0.m174356h("button");
        mo53983O().mo52306o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m1 */
    public /* synthetic */ void m53947m1(View view) {
        m53920F0().m68056e2();
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m53949o0(x20 x20Var, View view) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o1 */
    public /* synthetic */ void m53950o1() {
        if (NullChecker.m82486a(m53920F0()) && !m53920F0().isFinishing() && NullChecker.m82486a(this.f34852E0)) {
            SVGALoader.with(m53920F0()).from("https://auto.tancdn.com/v1/raw/e0fb50e8-bc26-443a-bbca-9266fed1008b14.svga").repeatCount(-1).into(this.f34860I0);
            this.f34860I0.startAnimation();
            SVGALoader.with(m53920F0()).from("https://auto.tancdn.com/v1/raw/1bed74ff-0197-4140-a352-6a36cb500d0e14.svga").repeatCount(1).into(this.f34862J0);
            SVGALoader.with(m53920F0()).from("https://auto.tancdn.com/v1/raw/ff7cd57b-6461-4d0b-ac99-83ad19f3bf0a14.svga").repeatCount(1).into(this.f34868M0);
            this.f34862J0.startAnimation();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p1 */
    public /* synthetic */ void m53952p1() {
        this.f34874P0.f34919e = true;
        this.f34874P0.f34920f = false;
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f34910x;
        if (vPager_SquaredRefactor != null) {
            hkl0.m135638a(vPager_SquaredRefactor, true);
            if (mo53983O().mo52302m0() || !NullChecker.m82486a(mo53983O().mo52252K2())) {
                return;
            }
            for (int i = 0; i < mo53983O().mo52252K2().pictures.size(); i++) {
                if (i != this.f34910x.getCurrentItem()) {
                    uqb0.f180374G.m127126R(nwb.m164968f(mo53983O().mo52252K2().media(i)).formatted());
                }
            }
        }
    }

    /* JADX INFO: renamed from: A1 */
    public void m53963A1() {
        m53994T0();
    }

    /* JADX INFO: renamed from: B1 */
    public final void m53964B1(VText vText, VText vText2, VText vText3) {
        if (mo53983O().mo52252K2().isMe()) {
            vText.setText(m53920F0().getString(R$string.f18495Gn));
            vText2.setText(m53920F0().getString(R$string.f18433En));
        } else {
            vText.setText(TEnum.equals(mo53983O().mo52252K2().gender, "female") ? m53920F0().getString(R$string.f19171d1) : m53920F0().getString(R$string.f19201e1));
            vText2.setText(TEnum.equals(mo53983O().mo52252K2().gender, "female") ? m53920F0().getString(R$string.f19109b1) : m53920F0().getString(R$string.f19140c1));
        }
        vText3.setText(m53920F0().getString(R$string.f18917Uk));
        vText3.setTextColor(-1);
    }

    /* JADX INFO: renamed from: C1 */
    public void m53965C1(User user) {
        if (this.f34895a1 == null) {
            this.f34895a1 = (CoreSupremePartnerMysteriousModeCoverView) this.f34847A.inflate();
            this.f34910x.post(new Runnable() { // from class: l.qw90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f159873a.m54016r1();
                }
            });
        }
        bnl0.m105524M(this.f34895a1, true);
        this.f34895a1.m44885b(user, 2);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m53966D0(View view) {
        zx90.m221978a(this, view);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m53967D1() {
        if (vq8.m202358b() && uqb0.f180396b0.f170326c.mo68395Bq()) {
            final String strUserId = mo53983O().userId();
            final String strFrom = mo53983O().from();
            final UserLiveState userLiveStateMo68455lt = CoreModule.m30934Q().mo68455lt(strUserId);
            this.f34881T.setOnClickListener(null);
            bnl0.m105524M(this.f34881T, false);
            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(strUserId);
            if (!(!TextUtils.isEmpty(CoreModule.f18264c.f20405m0.f20180o2) && TextUtils.equals(CoreModule.f18264c.f20405m0.f20180o2, strUserId) && conversationM33859Xe == null) && NullChecker.m82486a(CoreModule.m30934Q().getUserLiveId(strUserId))) {
                final User userMo52252K2 = mo53983O().mo52252K2();
                bnl0.m105524M(this.f34881T, true);
                ViewGroup.LayoutParams layoutParams = this.f34883U.getLayoutParams();
                if (layoutParams instanceof FrameLayout.LayoutParams) {
                    layoutParams.width = qa00.m175859d(30.0f);
                    layoutParams.height = qa00.m175859d(30.0f);
                    this.f34883U.setLayoutParams(layoutParams);
                }
                this.f34898d1 = true;
                this.f34887W.setTypeface(Typeface.DEFAULT_BOLD);
                bnl0.m105509E0(this.f34881T, new View.OnClickListener() { // from class: l.mx90
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f139210a.m54018t1(strUserId, strFrom, userMo52252K2, userLiveStateMo68455lt, view);
                    }
                });
                if (!this.f34896b1) {
                    this.f34896b1 = true;
                    i4g0.m138527y("e_live_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, m53990R0(userMo52252K2, userLiveStateMo68455lt, strFrom));
                }
                if (userLiveStateMo68455lt != null && !TextUtils.isEmpty(userLiveStateMo68455lt.multiCallInfo.onGoingMultiCallId)) {
                    bnl0.m105525M0(this.f34881T, true);
                    this.f34898d1 = true;
                    if (TextUtils.equals(this.f34887W.getText(), m53920F0().getResources().getString(R$string.f19835yh))) {
                        return;
                    } else {
                        this.f34887W.setText(R$string.f19835yh);
                    }
                }
                if (this.f34883U.isAnimating()) {
                    return;
                }
                SVGALoader.with(m53920F0()).from("https://auto.tancdn.com/v1/raw/b83d11f9-6b88-41a2-a0dd-c3617bde118510.so").into(this.f34883U);
            }
        }
    }

    /* JADX INFO: renamed from: F1 */
    public void m53968F1(User user) {
        if (user != null && user.isMe()) {
            bnl0.m105524M(this.f34893Z, false);
            return;
        }
        boolean zM106046q = br5.m106046q(user);
        VImage vImage = this.f34893Z;
        if (zM106046q) {
            bnl0.m105524M(vImage, false);
            return;
        }
        bnl0.m105524M(vImage, !((!user.superLikedMe() && !user.letter()) || f760.INSTANCE.m124362i(user.f56859id) || qap.INSTANCE.m175972j(user.f56859id)) || TextUtils.equals(CoreModule.f18264c.f20367Z0.m210759B3(), user.f56859id));
        if ("from_meet_feed".equals(mo53983O().from())) {
            LikedUser likedUserMo53511s2 = mo53983O().mo53511s2();
            if (NullChecker.m82486a(likedUserMo53511s2) && (TEnum.equals(likedUserMo53511s2.status, "superliked") || TEnum.equals(likedUserMo53511s2.status, "lettered"))) {
                bnl0.m105524M(this.f34893Z, true);
            }
        }
        if (IntlCountryCodeController.m29125v() && bnl0.m105529O0(this.f34893Z)) {
            this.f34893Z.setImageResource(dbc0.f87580xi);
        }
        if (bnl0.m105529O0(this.f34893Z) || bnl0.m105529O0(this.f34870N0)) {
            bnl0.m105524M(this.f34906p0, false);
            this.f34899e1 = true;
        }
    }

    /* JADX INFO: renamed from: G0 */
    public View m53969G0(int i) {
        return this.f34874P0.m54044E(i);
    }

    /* JADX INFO: renamed from: G1 */
    public void m53970G1() {
        this.f34884U0 = -1;
    }

    /* JADX INFO: renamed from: H0 */
    public final void m53971H0() {
        View viewM54044E = this.f34874P0.m54044E(this.f34910x.getCurrentItem());
        if (viewM54044E instanceof PictureView) {
            PictureView pictureView = (PictureView) viewM54044E;
            User userMo52252K2 = mo53983O().mo52252K2();
            if (NullChecker.m82486a(userMo52252K2) && this.f34910x.getCurrentItem() < userMo52252K2.pictures.size() && (userMo52252K2.pictures.get(this.f34910x.getCurrentItem()) instanceof Video) && asj0.m99935d0()) {
                pictureView.m45174V();
            }
        }
    }

    /* JADX INFO: renamed from: H1 */
    public final void m53972H1(Drawable drawable, boolean z) {
        if (this.f34904j1 || m121838I()) {
            return;
        }
        View viewInflate = p9r.m171370a(m53920F0()).inflate(kec0.f125601R8, (ViewGroup) this.f34908v, false);
        this.f34901g1 = viewInflate;
        VText vText = (VText) viewInflate.findViewById(adc0.f70032N6);
        VText vText2 = (VText) this.f34901g1.findViewById(adc0.f69833Bb);
        VDivider vDivider = (VDivider) this.f34901g1.findViewById(adc0.f70647xe);
        RelativeLayout relativeLayout = (RelativeLayout) this.f34901g1.findViewById(adc0.f70330f2);
        ConstraintLayout constraintLayout = (ConstraintLayout) this.f34901g1.findViewById(adc0.f70347g2);
        View viewFindViewById = this.f34901g1.findViewById(adc0.f70582u0);
        if (NullChecker.m82486a(mo53983O().mo52252K2())) {
            m53964B1(vText, vText2, (VText) this.f34901g1.findViewById(adc0.f70412k0));
        }
        sfj0.m185601h("e_profile_guide_first", mo53983O().pageId(), new sfj0.C20032a[0]);
        ViewGroup.LayoutParams layoutParams = this.f34901g1.getLayoutParams();
        if (layoutParams == null) {
            layoutParams = new ViewGroup.LayoutParams(-1, this.f34910x.getHeight());
        } else {
            layoutParams.height = this.f34910x.getHeight();
            layoutParams.width = -1;
        }
        if (gra.m131638V2()) {
            bnl0.m105505C0(relativeLayout, 0);
            bnl0.m105505C0(constraintLayout, this.f34910x.getHeight());
            bnl0.m105524M(viewFindViewById, false);
            bnl0.m105524M(relativeLayout, false);
            vDivider.setDividerColor(872415231);
            vText.setCompoundDrawablesWithIntrinsicBounds(0, dbc0.f86832an, 0, 0);
            vText2.setCompoundDrawablesWithIntrinsicBounds(0, dbc0.f86865bn, 0, 0);
        } else if (this.f34910x.getHeight() - this.f34886V0 > 0) {
            bnl0.m105505C0(relativeLayout, (int) ((this.f34910x.getHeight() - this.f34886V0) * this.f34888W0));
            bnl0.m105505C0(constraintLayout, this.f34910x.getHeight() - this.f34886V0);
        }
        this.f34901g1.setLayoutParams(layoutParams);
        this.f34908v.addView(this.f34901g1, layoutParams);
        this.f34901g1.setOnClickListener(new View.OnClickListener() { // from class: l.ex90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96261a.m54019u1(view);
            }
        });
        ((VImage) this.f34901g1.findViewById(adc0.f70313e2)).setBackground(drawable);
        if (NullChecker.m82486a(this.f34900f1) && !this.f34900f1.isUnsubscribed()) {
            this.f34900f1.unsubscribe();
            this.f34900f1 = null;
        }
        this.f34903i1 = true;
        this.f34904j1 = true;
        if (mo53983O().mo52236D2()) {
            if (z) {
                pza0.f154795v = true;
            }
            CoreModule.f18264c.f20381e0.f89151W0.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public final void m53973I0() {
        if (mo53983O().mo53549y2()) {
            if (!mo53983O().mo52258P1() && !mo53983O().mo52236D2()) {
                m53989Q1(800L);
            }
            bnl0.m105524M(this.f34911y, false);
            bnl0.m105524M(this.f34855G, true);
        }
    }

    /* JADX INFO: renamed from: I1 */
    public void m53974I1(final y20<LinearLayout> y20Var, long j) {
        this.f34865L.postDelayed(new Runnable() { // from class: l.rw90
            @Override // java.lang.Runnable
            public final void run() {
                this.f165121a.m54020v1(y20Var);
            }
        }, j);
    }

    /* JADX INFO: renamed from: J0 */
    public final void m53975J0(int i) {
        if (gra.m131776y2()) {
            m53999X0(i);
        }
    }

    /* JADX INFO: renamed from: J1 */
    public void m53976J1(int i, boolean z) {
        if (m168318i() && !m121838I()) {
            this.f34910x.m4178T(i, z);
        }
    }

    /* JADX INFO: renamed from: K1 */
    public void m53977K1(final x20 x20Var) {
        this.f34863K.setOnClickListener(new View.OnClickListener() { // from class: l.pw90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileImagesItemHolder.m53949o0(x20Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    public void m53978L0(final long j, final boolean z) {
        if (m121838I()) {
            return;
        }
        if (NullChecker.m82486a(this.f34900f1) && !this.f34900f1.isUnsubscribed()) {
            this.f34900f1.unsubscribe();
            this.f34900f1 = null;
        }
        if ((this.f34874P0.f34921g.get(this.f34910x.getCurrentItem()) instanceof Video) && asj0.m99935d0()) {
            hkl0.m135638a(this.f34910x, false);
        }
        this.f34900f1 = m53920F0().duringCreated(((C22421c) new pcj() { // from class: l.tw90
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f176389a.m54005e1();
            }
        }.call()).compose(psd0.m173607R()).observeOn(Schedulers.computation()).flatMap(new qcj() { // from class: l.uw90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                return C22421c.just(asj0.m99938p(bitmap, bitmap.getWidth(), bitmap.getHeight(), 1275068416));
            }
        }).compose(psd0.m173632y()).map(new qcj() { // from class: l.vw90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f186110a.m54006f1((Bitmap) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.ww90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191253a.m54009i1(z, j, (Drawable) obj);
            }
        }));
        m168321p().lifecycle().skip(1).filter(new qcj() { // from class: l.xw90
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f196474a.m54010j1((C4470c) obj);
            }
        }).take(1).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.zw90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206328a.m54011k1((C4470c) obj);
            }
        }, new y20() { // from class: l.ax90
            @Override // p153l.y20
            public final void call(Object obj) {
                ProfileImagesItemHolder.m53924S((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L1 */
    public void m53979L1(final x20 x20Var, final x20 x20Var2) {
        this.f34865L.setOnClickListener(new View.OnClickListener() { // from class: l.sw90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfileImagesItemHolder.m53939g0(x20Var, x20Var2, view);
            }
        });
    }

    /* JADX INFO: renamed from: M0 */
    public CoreSupremePartnerMysteriousModeCoverView m53980M0() {
        return this.f34895a1;
    }

    /* JADX INFO: renamed from: N0 */
    public int m53981N0() {
        if (!m168318i()) {
            return 0;
        }
        int currentItem = this.f34910x.getCurrentItem();
        int i = this.f34884U0;
        if (i < 0 || i > currentItem) {
            return this.f34910x.getCurrentItem();
        }
        return Math.min(Math.max(0, currentItem - 1), NullChecker.m82486a(mo53983O().mo52252K2()) ? mo53983O().mo52252K2().pictures.size() - 1 : 0);
    }

    /* JADX INFO: renamed from: N1 */
    public boolean m53982N1() {
        if (m121838I() || CoreModule.f18264c.f20381e0.f89151W0.get().booleanValue() || this.f34886V0 > f34845k1) {
            return false;
        }
        if (this.f34876Q0) {
            return !mo53983O().mo52252K2().isTeamAccount() && !"from_guess_liker_result".equals(mo53983O().from()) && NullChecker.m82486a(mo53983O().mo52252K2()) && NullChecker.m82486a(this.f34910x);
        }
        return (mo53983O().mo52252K2() == null || this.f34910x == null || !"home_card".equals(mo53983O().from())) ? false : true;
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return m168325w();
    }

    /* JADX INFO: renamed from: O0 */
    public int m53984O0() {
        if (m168318i()) {
            return this.f34910x.getCurrentItem();
        }
        return 0;
    }

    /* JADX INFO: renamed from: O1 */
    public final void m53985O1() {
        int childCount = this.f34908v.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f34908v.getChildAt(i);
            bnl0.m105525M0(childAt, childAt == this.f34909w || childAt == this.f34857H || childAt == this.f34851E || childAt == this.f34865L);
        }
        if (mo53983O().mo52252K2().isBannedNew()) {
            bnl0.m105524M(this.f34865L, false);
        }
        bnl0.m105524M(this.f34912z, false);
    }

    /* JADX INFO: renamed from: P0 */
    public PictureView m53986P0() {
        View viewM54044E = this.f34874P0.m54044E(this.f34910x.getCurrentItem());
        if (!(viewM54044E instanceof PictureView)) {
            viewM54044E = this.f34874P0.m54044E(this.f34910x.getCurrentItem() - 1);
        }
        if (viewM54044E instanceof PictureView) {
            return (PictureView) viewM54044E;
        }
        return null;
    }

    /* JADX INFO: renamed from: P1 */
    public void m53987P1() {
        User userMo52252K2 = mo53983O().mo52252K2();
        if (NullChecker.m82486a(this.f34910x)) {
            if (this.f34910x.getCurrentItem() <= 0) {
                m53922M1(false);
                pza0.m174355g(OMSDialogPositon.p_suggest_user_profile_info_view, false, true, userMo52252K2, "");
            } else {
                VPager_SquaredRefactor vPager_SquaredRefactor = this.f34910x;
                vPager_SquaredRefactor.m4178T(vPager_SquaredRefactor.getCurrentItem() - 1, false);
                pza0.m174355g(OMSDialogPositon.p_suggest_user_profile_info_view, true, true, userMo52252K2, "");
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public final String m53988Q0(@Nullable UserLiveState userLiveState) {
        return CoreModule.m30934Q().mo68397Dr(NullChecker.m82486a(userLiveState) ? userLiveState.multiCallInfo.onGoingMultiCallRole : "");
    }

    /* JADX INFO: renamed from: Q1 */
    public final void m53989Q1(long j) {
        if (m53982N1()) {
            l51.m152888H(mo53983O().act(), new Runnable() { // from class: l.ow90
                @Override // java.lang.Runnable
                public final void run() {
                    this.f149465a.m54021w1();
                }
            }, j);
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final HashMap<String, Object> m53990R0(User user, UserLiveState userLiveState, String str) {
        HashMap<String, Object> map = new HashMap<>();
        boolean z = (userLiveState == null || TextUtils.isEmpty(userLiveState.multiCallInfo.onGoingMultiCallId)) ? false : true;
        map.put("liveId", CoreModule.m30934Q().getUserLiveId(user.f56859id));
        map.put("anchorId", user.f56859id);
        map.put(FirebaseAnalytics.Param.INDEX, "NA");
        map.put("module", "e_profile_album");
        map.put("trace_id", "");
        map.put("live_status", (userLiveState == null || !userLiveState.isLiveOpened()) ? BLiveOperationTitleShowType.off : "on");
        map.put("right_recommend_type", "");
        if (!z) {
            userLiveState = null;
        }
        map.put("live_room_live_type", m53988Q0(userLiveState));
        map.put("show_label", z ? "连线" : "");
        map.put("refer_pid", "home_card".equals(str) ? "home_card" : "");
        map.put("liveRecommendCategory", "NA");
        if (CoreModule.f18264c.f20405m0.m32023L6(user.f56859id) && "home_card".equals(str)) {
            map.put("live_enter_source", "suggest_live_card_profile");
            return map;
        }
        map.put("live_enter_source", "NA");
        return map;
    }

    /* JADX INFO: renamed from: R1 */
    public void m53991R1() {
        User userMo52252K2 = mo53983O().mo52252K2();
        if (this.f34910x.getCurrentItem() >= this.f34874P0.getCount() - 1) {
            m53922M1(true);
            pza0.m174355g(OMSDialogPositon.p_suggest_user_profile_info_view, false, false, userMo52252K2, "");
        } else {
            VPager_SquaredRefactor vPager_SquaredRefactor = this.f34910x;
            vPager_SquaredRefactor.m4178T(vPager_SquaredRefactor.getCurrentItem() + 1, false);
            pza0.m174355g(OMSDialogPositon.p_suggest_user_profile_info_view, true, false, userMo52252K2, "");
        }
    }

    /* JADX INFO: renamed from: S0 */
    public int m53992S0() {
        return this.f34884U0;
    }

    /* JADX INFO: renamed from: S1 */
    public void m53993S1(int i) {
        if (NullChecker.m82486a(this.f34907u) && NullChecker.m82486a(this.f34879S) && NullChecker.m82486a(this.f34908v)) {
            this.f34886V0 = i;
            int i2 = ((int) ((f34846l1 - i) * this.f34888W0)) + (i / 2);
            if (this.f34890X0.isEmpty() || i >= f34846l1 || i2 <= 0) {
                return;
            }
            for (Integer num : this.f34890X0.keySet()) {
                num.intValue();
                if (NullChecker.m82486a(this.f34890X0.get(num))) {
                    bnl0.m105505C0(this.f34890X0.get(num), i2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final void m53994T0() {
        if (!mo53983O().mo53399Z1()) {
            bnl0.m105524M(this.f34865L, false);
        }
        bnl0.m105524M(this.f34857H, false);
        bnl0.m105524M(this.f34865L, false);
        bnl0.m105524M(this.f34851E, false);
        bnl0.m105524M(this.f34879S, false);
        bnl0.m105524M(this.f34861J, false);
    }

    /* JADX INFO: renamed from: T1 */
    public void m53995T1(User user, int i) {
        if (!NullChecker.m82486a(user) || i >= user.pictures.size() || this.f34897c1 == i) {
            return;
        }
        i4g0.m138492A("e_profilePhoto", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("url", user.picture(i).url), jyb.m147494Y("moments_user_id", mo53983O().userId()));
        View viewM54044E = this.f34874P0.m54044E(this.f34910x.getCurrentItem());
        if (viewM54044E instanceof PictureView) {
            PictureView pictureView = (PictureView) viewM54044E;
            if (gra.m131756u2() && bnl0.m105529O0(pictureView.f28938s)) {
                i4g0.m138492A("e_invisible_photo_upload", OMSDialogPositon.p_suggest_user_profile_info_view, jyb.m147494Y("invisible_photo_location", Integer.valueOf(i)), jyb.m147494Y("need_photo_count", Integer.valueOf(3 - CoreModule.f18264c.f20381e0.m116593na().pictures.size())), jyb.m147494Y("invisible_photo_is_thumbnail", Boolean.FALSE));
            }
        }
        this.f34897c1 = i;
    }

    /* JADX INFO: renamed from: U0 */
    public final boolean m53996U0() {
        View viewM54044E = this.f34874P0.m54044E(this.f34910x.getCurrentItem());
        if (!(viewM54044E instanceof PictureView)) {
            return false;
        }
        PictureView pictureView = (PictureView) viewM54044E;
        if (gra.m131756u2() && bnl0.m105529O0(pictureView.f28938s)) {
            return true;
        }
        return pictureView.f28893I0.m222761e().booleanValue();
    }

    /* JADX INFO: renamed from: V0 */
    public void m53997V0(View view, boolean z) {
        mo53983O().mo53398Z(0);
        this.f34904j1 = false;
        pza0.f154795v = false;
        if (NullChecker.m82486a(this.f34900f1) && !this.f34900f1.isUnsubscribed()) {
            this.f34900f1.unsubscribe();
            this.f34900f1 = null;
        }
        if (mo53983O().mo52236D2()) {
            CoreModule.f18264c.f20381e0.f89151W0.put(Boolean.TRUE);
        }
        if (z) {
            CoreModule.f18264c.f20381e0.f89151W0.put(Boolean.TRUE);
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup == null) {
            return;
        }
        viewGroup.removeView(view);
        if (!z || this.f34876Q0) {
            return;
        }
        m53971H0();
    }

    /* JADX INFO: renamed from: W0 */
    public final void m53998W0() {
        this.f34894Z0.add(this.f34869N);
        this.f34894Z0.add(this.f34881T);
        this.f34894Z0.add(this.f34891Y);
        this.f34894Z0.add(this.f34893Z);
        this.f34894Z0.add(this.f34905k0);
        this.f34894Z0.add(this.f34906p0);
        this.f34894Z0.add(this.f34852E0);
        this.f34894Z0.add(this.f34870N0);
    }

    /* JADX INFO: renamed from: X0 */
    public final void m53999X0(int i) {
        View viewM54044E = this.f34874P0.m54044E(i);
        if (viewM54044E instanceof PictureView) {
            PictureView pictureView = (PictureView) viewM54044E;
            if (!gra.m131776y2() || (mo53983O().mo52252K2() != null && mo53983O().mo52252K2().isMe())) {
                C8900c c8900c = this.f34874P0;
                c8900c.m54056S(pictureView, c8900c.f34921g.get(i), -1, i);
            } else {
                C8900c c8900c2 = this.f34874P0;
                c8900c2.m54057T(pictureView, c8900c2.f34921g.get(i), i);
            }
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m54000Y0() {
        String strFrom = mo53983O().from();
        boolean zMo52302m0 = mo53983O().mo52302m0();
        if ("home_menu".equals(strFrom) || "preview_card".equals(strFrom) || zMo52302m0) {
            return;
        }
        if (NullChecker.m82486a(m53920F0().getSupportActionBar())) {
            m53920F0().getSupportActionBar().mo102186m();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f34849C.getLayoutParams();
        marginLayoutParams.topMargin = m53920F0().getResources().getDimensionPixelOffset(cac0.f80574d);
        marginLayoutParams.rightMargin = m53920F0().getResources().getDimensionPixelOffset(cac0.f80573c);
        this.f34849C.setLayoutParams(marginLayoutParams);
    }

    /* JADX INFO: renamed from: a1 */
    public final boolean m54001a1() {
        return TextUtils.equals(mo53983O().from(), "live_profile_voice_mask_mode");
    }

    /* JADX INFO: renamed from: b1 */
    public final boolean m54002b1(User user) {
        return mo53983O().mo53416c3(user);
    }

    /* JADX INFO: renamed from: c1 */
    public final boolean m54003c1(User user) {
        return mo53983O().mo53472m3(user);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ Bitmap m54004d1() throws Exception {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f34908v.getWidth(), this.f34908v.getHeight(), Bitmap.Config.ARGB_4444);
        this.f34908v.draw(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ C22421c m54005e1() {
        return C22421c.fromCallable(new Callable() { // from class: l.bx90
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f78855a.m54004d1();
            }
        });
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ Drawable m54006f1(Bitmap bitmap) {
        dnd0 dnd0VarM121524a = end0.m121524a(m53920F0().getResources(), bitmap);
        dnd0VarM121524a.m117059e(qa00.m175859d(0.0f));
        return dnd0VarM121524a;
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m54007g1(Long l2) {
        m53997V0(this.f34901g1, false);
    }

    /* JADX INFO: renamed from: h1 */
    public final /* synthetic */ void m54008h1(Throwable th) {
        m53997V0(this.f34901g1, false);
    }

    /* JADX INFO: renamed from: i1 */
    public final /* synthetic */ void m54009i1(boolean z, long j, Drawable drawable) {
        m53972H1(drawable, z);
        if (j >= 0) {
            m53920F0().duringCreated(C22421c.timer(j, TimeUnit.MILLISECONDS)).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.cx90
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f84191a.m54007g1((Long) obj);
                }
            }, new y20() { // from class: l.dx90
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f91079a.m54008h1((Throwable) obj);
                }
            }));
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f34910x.setAdapter(this.f34874P0);
        this.f34910x.m4187d(new C8898a());
        ((LinearLayout.LayoutParams) this.f34911y.getLayoutParams()).gravity = mo53983O().mo53510s1() ? 3 : 1;
        mo53983O().mo53378W().addOnScrollListener(new C8899b(view));
        m54000Y0();
        bnl0.m105509E0(this.f34857H, new View.OnClickListener() { // from class: l.gx90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f106917a.m53945l1(view2);
            }
        });
        m53932Z0();
        m53973I0();
        m53919E1();
        if (mo53983O().mo53531v2()) {
            this.f34853F.setVisibility(4);
        }
        if (gra.m131637V1() && (TextUtils.equals(mo53983O().from(), "chat_group_anonymity") || TextUtils.equals(mo53983O().from(), "group_notification_anonymity"))) {
            bnl0.m105524M(this.f34848B, true);
            bnl0.m105509E0(this.f34848B, new View.OnClickListener() { // from class: l.hx90
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f111971a.m53947m1(view2);
                }
            });
            User userMo52252K2 = mo53983O().mo52252K2();
            if (NullChecker.m82486a(userMo52252K2)) {
                uqb0.f180374G.m127140Z0(this.f34848B, jek.m144579k(userMo52252K2));
            } else {
                uqb0.f180374G.m127140Z0(this.f34848B, jek.m144582n());
            }
        }
        if (gra.m131756u2() && mo53983O().mo52261R()) {
            m168321p().duringCreated(CoreModule.f18264c.f20381e0.m116596o9()).distinctUntilChanged(new qcj() { // from class: l.ix90
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).pictures;
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.jx90
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f123013a.m54013n1((User) obj);
                }
            }));
        }
        if (!s75.m184965m() && !wj90.m206622e(mo53983O().mo52252K2())) {
            bnl0.m105524M(this.f34852E0, false);
            return;
        }
        User userMo52252K3 = mo53983O().mo52252K2();
        if ((!NullChecker.m82486a(userMo52252K3) || !NullChecker.m82486a(userMo52252K3.settings) || !userMo52252K3.settings.isCityTop()) && !TextUtils.equals(mo53983O().from(), "from_city_center_conv_banner")) {
            bnl0.m105524M(this.f34852E0, false);
            return;
        }
        bnl0.m105524M(this.f34852E0, true);
        bnl0.m105524M(this.f34879S, false);
        this.f34854F0.setBackgroundResource(dbc0.f87535w5);
        CityC cityTopInfo = userMo52252K3.settings.getCityTopInfo();
        if (NullChecker.m82486a(cityTopInfo)) {
            this.f34866L0.setText(s75.m184964l().m184970k(cityTopInfo.cost));
        }
        if (!NullChecker.m82486a(m53920F0()) || m53920F0().isFinishing()) {
            return;
        }
        l51.m152886F(m53920F0(), new Runnable() { // from class: l.kx90
            @Override // java.lang.Runnable
            public final void run() {
                this.f129180a.m53950o1();
            }
        });
    }

    /* JADX INFO: renamed from: j1 */
    public final /* synthetic */ Boolean m54010j1(C4470c c4470c) {
        return Boolean.valueOf(c4470c.equals(C4470c.f16266h) && NullChecker.m82486a(this.f34901g1));
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: k */
    public boolean mo53568k() {
        return false;
    }

    /* JADX INFO: renamed from: k1 */
    public final /* synthetic */ void m54011k1(C4470c c4470c) {
        m53997V0(this.f34901g1, false);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return !mo53983O().mo52302m0();
    }

    @Override // p153l.ep90, p153l.on2
    /* JADX INFO: renamed from: m */
    public boolean mo54012m() {
        return true;
    }

    /* JADX INFO: renamed from: n1 */
    public final /* synthetic */ void m54013n1(User user) {
        if (NullChecker.m82486a(this.f34910x)) {
            m53999X0(this.f34910x.getCurrentItem());
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        User userMo52252K2 = mo53983O().mo52252K2();
        mo53983O().mo52302m0();
        mo53983O().mo52258P1();
        hkl0.m135638a(this.f34910x, false);
        if (mo53983O().mo53549y2()) {
            this.f34855G.m37958b(i);
        }
        if (NullChecker.m82486a(this.f34874P0.m54044E(i)) && !(this.f34874P0.m54044E(i) instanceof PictureView) && !aia0.m97972m().m97980o()) {
            aia0.m97972m().m97976D(true);
        }
        if (this.f34874P0.m54044E(i) instanceof PictureView) {
            if (this.f34898d1 && !bnl0.m105529O0(this.f34881T)) {
                this.f34881T.setVisibility(0);
            }
            if (this.f34899e1 && !bnl0.m105529O0(this.f34891Y) && userMo52252K2.receiveSuperLikeNum() > 1) {
                this.f34891Y.setVisibility(0);
            } else if (this.f34899e1 && !bnl0.m105529O0(this.f34893Z)) {
                this.f34893Z.setVisibility(0);
            }
        } else {
            this.f34881T.setVisibility(8);
            this.f34893Z.setVisibility(8);
            this.f34891Y.setVisibility(8);
        }
        View viewM54044E = this.f34874P0.m54044E(i);
        m53995T1(userMo52252K2, i);
        if (!NullChecker.m82486a(viewM54044E) || !asj0.m99935d0() || mo53983O().mo53531v2() || m54003c1(userMo52252K2) || m54002b1(userMo52252K2) || m54001a1() || wj90.m206620c(mo53983O().mo52252K2())) {
            return;
        }
        if ((!mo53983O().mo53549y2() || this.f34874P0.getCount() < 2 || CoreModule.f18264c.f20381e0.f89151W0.get().booleanValue()) && !m53921K0() && mo53983O().lifecycle_() == C4470c.f16267i && (viewM54044E instanceof PictureView)) {
            ((PictureView) viewM54044E).m45174V();
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final /* synthetic */ void m54014q1(Boolean bool) {
        mo53983O().mo53378W().requestDisallowInterceptTouchEvent(bool.booleanValue());
    }

    @Override // p153l.ep90, p153l.on2
    /* JADX INFO: renamed from: r */
    public void mo54015r(View view) {
    }

    /* JADX INFO: renamed from: r1 */
    public final /* synthetic */ void m54016r1() {
        bnl0.m105505C0(this.f34847A, this.f34910x.getHeight());
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        m53966D0(mo53983O().mo53306M0());
        FrameLayout frameLayout = new FrameLayout(viewGroup.getContext()) { // from class: com.p1.mobile.putong.core.ui.profile.profilelist.itemholders.ProfileImagesItemHolder.1
            @Override // android.view.ViewGroup, android.view.View
            public boolean dispatchTouchEvent(MotionEvent motionEvent) {
                return ProfileImagesItemHolder.this.f34907u.dispatchTouchEvent(motionEvent);
            }

            @Override // android.view.ViewGroup
            public boolean onInterceptHoverEvent(MotionEvent motionEvent) {
                return ProfileImagesItemHolder.this.f34907u.onInterceptHoverEvent(motionEvent);
            }

            @Override // android.widget.FrameLayout, android.view.View
            public void onMeasure(int i, int i2) {
                setMeasuredDimension(ProfileImagesItemHolder.this.f34907u.getMeasuredWidth(), ProfileImagesItemHolder.this.f34907u.getMeasuredHeight());
            }

            @Override // android.view.View
            public boolean onTouchEvent(MotionEvent motionEvent) {
                return ProfileImagesItemHolder.this.f34907u.onTouchEvent(motionEvent);
            }
        };
        this.f34907u.m51904Q(new y20() { // from class: l.lx90
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133913a.m54014q1((Boolean) obj);
            }
        });
        m53998W0();
        return frameLayout;
    }

    /* JADX INFO: renamed from: s1 */
    public final /* synthetic */ void m54017s1(List list, Boolean bool) {
        if (!bool.booleanValue()) {
            this.f34884U0 = -1;
            return;
        }
        ArrayList arrayList = new ArrayList(list);
        AdmobMedia admobMedia = new AdmobMedia();
        this.f34884U0 = arrayList.size();
        arrayList.add(admobMedia);
        this.f34874P0.m54055R(arrayList);
        VPagerCircleIndicator vPagerCircleIndicator = this.f34911y;
        VPager_SquaredRefactor vPager_SquaredRefactor = this.f34910x;
        vPagerCircleIndicator.m224389c(vPager_SquaredRefactor, vPager_SquaredRefactor.getCurrentItem());
        this.f34911y.invalidate();
        bnl0.m105525M0(this.f34911y, arrayList.size() > 1);
        if (mo53983O().mo53549y2()) {
            this.f34855G.setIndicatorCount(arrayList.size());
        }
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        User userMo52252K2 = mo53983O().mo52252K2();
        boolean zMo52302m0 = mo53983O().mo52302m0();
        final ArrayList arrayList = new ArrayList();
        if (!zMo52302m0) {
            arrayList.addAll(userMo52252K2.pictures);
            l51.m152919y(new RunnableC8901d(userMo52252K2, zMo52302m0));
            this.f34874P0.m54055R(arrayList);
            VPagerCircleIndicator vPagerCircleIndicator = this.f34911y;
            VPager_SquaredRefactor vPager_SquaredRefactor = this.f34910x;
            vPagerCircleIndicator.m224389c(vPager_SquaredRefactor, vPager_SquaredRefactor.getCurrentItem());
            this.f34911y.setOnPageChangeListener(this);
            this.f34911y.invalidate();
            bnl0.m105525M0(this.f34911y, userMo52252K2.pictures.size() > 1);
            if (mo53983O().mo53549y2()) {
                bnl0.m105524M(this.f34911y, false);
            }
            m53967D1();
            m53968F1(userMo52252K2);
            if (wj90.m206620c(mo53983O().mo52252K2())) {
                m53965C1(userMo52252K2);
            } else if (NullChecker.m82486a(this.f34895a1)) {
                bnl0.m105524M(this.f34895a1, false);
            }
            if (aia0.m97972m().m97981p(userMo52252K2) && m168325w().mo53279I1() && arrayList.size() >= 2) {
                m53920F0().duringCreated(aia0.m97972m().m97990y(m53920F0(), false)).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.nw90
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f143935a.m54017s1(arrayList, (Boolean) obj);
                    }
                }, new v60()));
            } else {
                this.f34884U0 = -1;
            }
        }
        if (mo53983O().mo53549y2()) {
            this.f34855G.setIndicatorCount(arrayList.size());
            if (mo53983O().mo52252K2().pictures.size() <= 1) {
                bnl0.m105524M(this.f34855G, false);
            }
        }
        boolean zM105529O0 = bnl0.m105529O0(this.f34855G);
        VImage vImage = this.f34857H;
        if (zM105529O0) {
            int i = qa00.f156328o;
            bnl0.m105540X(vImage, i);
            bnl0.m105540X(this.f34865L, i);
            bnl0.m105540X(this.f34863K, i);
            bnl0.m105540X(this.f34861J, i);
        } else {
            int i2 = qa00.f156321h;
            bnl0.m105540X(vImage, i2);
            bnl0.m105540X(this.f34865L, i2);
            bnl0.m105540X(this.f34863K, i2);
            bnl0.m105540X(this.f34861J, i2);
        }
        this.f34882T0++;
        if (m121838I()) {
            m53985O1();
            this.f34874P0.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: t1 */
    public final /* synthetic */ void m54018t1(String str, String str2, User user, UserLiveState userLiveState, View view) {
        if (mo53983O().mo52258P1()) {
            CoreModule.m30934Q().mo68400F8(m53920F0(), false, true, null);
        } else {
            CoreModule.m30934Q().startAudienceLive(m53920F0(), CoreModule.m30934Q().getUserLiveId(str), "profile", null);
        }
        if (CoreModule.f18264c.f20405m0.m32023L6(str) && TextUtils.equals("home_card", str2)) {
            tvn.m192813a(OMSDialogPositon.p_suggest_user_profile_info_view, user);
        } else {
            i4g0.m138521s("e_live_room_enter", OMSDialogPositon.p_suggest_user_profile_info_view, m53990R0(user, userLiveState, str2));
        }
    }

    /* JADX INFO: renamed from: u1 */
    public final /* synthetic */ void m54019u1(View view) {
        sfj0.m185596c("e_profile_guide_first", mo53983O().pageId(), new sfj0.C20032a[0]);
        m53997V0(view, true);
    }

    /* JADX INFO: renamed from: v1 */
    public final /* synthetic */ void m54020v1(y20 y20Var) {
        if (y20Var != null) {
            y20Var.call(this.f34865L);
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final /* synthetic */ void m54021w1() {
        if (m53982N1()) {
            m53978L0(-1L, false);
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m54022x1(boolean z) {
        if (!z) {
            bnl0.m105505C0(this.f34865L, qa00.m175859d(32.0f));
            bnl0.m105548c0(this.f34863K, 0);
            bnl0.m105548c0(this.f34865L, 0);
            bnl0.m105548c0(this.f34857H, 0);
            return;
        }
        VImage vImage = this.f34863K;
        int i = qa00.f156333t;
        bnl0.m105548c0(vImage, i);
        bnl0.m105548c0(this.f34865L, i);
        bnl0.m105505C0(this.f34865L, qa00.m175859d(62.0f));
        bnl0.m105548c0(this.f34857H, i);
    }

    /* JADX INFO: renamed from: y1 */
    public void m54023y1() {
        m53919E1();
    }

    /* JADX INFO: renamed from: z1 */
    public void m54024z1() {
        m53994T0();
    }
}
