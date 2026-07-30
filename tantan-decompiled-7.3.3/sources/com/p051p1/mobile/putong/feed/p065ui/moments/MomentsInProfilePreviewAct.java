package com.p051p1.mobile.putong.feed.p065ui.moments;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.viewpager.widget.ViewPager;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.p065ui.FeedPhotoPreviewView;
import com.p051p1.mobile.putong.feed.p065ui.PlayerView;
import com.p051p1.mobile.putong.feed.p065ui.moments.MomentsInProfilePreviewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p151v.VFrame;
import p151v.VPager;
import p151v.VText;
import p153l.bnl0;
import p153l.ie80;
import p153l.jde;
import p153l.jyb;
import p153l.k3h;
import p153l.k9c0;
import p153l.kcg0;
import p153l.lb2;
import p153l.lbc0;
import p153l.mrb0;
import p153l.og3;
import p153l.pcj;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.re80;
import p153l.tec0;
import p153l.tz00;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vg60;
import p153l.x20;
import p153l.y20;
import p153l.ye80;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class MomentsInProfilePreviewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VPager f44761c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f44762d;

    /* JADX INFO: renamed from: e */
    public VText f44763e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f44764f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f44765g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f44766h;

    /* JADX INFO: renamed from: i */
    public ImageView f44767i;

    /* JADX INFO: renamed from: j */
    public VFrame f44768j;

    /* JADX INFO: renamed from: k */
    public VText f44769k;

    /* JADX INFO: renamed from: l */
    public C11570a f44770l;

    /* JADX INFO: renamed from: m */
    public String f44771m;

    /* JADX INFO: renamed from: n */
    public String f44772n;

    /* JADX INFO: renamed from: p */
    public String f44774p;

    /* JADX INFO: renamed from: q */
    public CommentCheckMarkView f44775q;

    /* JADX INFO: renamed from: r */
    public Boolean f44776r;

    /* JADX INFO: renamed from: s */
    public User f44777s;

    /* JADX INFO: renamed from: v */
    public ie80 f44780v;

    /* JADX INFO: renamed from: w */
    public ie80 f44781w;

    /* JADX INFO: renamed from: y */
    public kcg0 f44783y;

    /* JADX INFO: renamed from: o */
    public int f44773o = -1;

    /* JADX INFO: renamed from: t */
    public vg60<C11571b> f44778t = vg60.m201219a();

    /* JADX INFO: renamed from: u */
    public int f44779u = 0;

    /* JADX INFO: renamed from: x */
    public boolean f44782x = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentsInProfilePreviewAct$a */
    public class C11570a extends lb2 implements ViewPager.InterfaceC0718j {

        /* JADX INFO: renamed from: e */
        public ViewPropertyAnimator f44784e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentsInProfilePreviewAct$a$a */
        public class a extends ie80.C17711c {
            public a() {
            }

            @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
            /* JADX INFO: renamed from: d */
            public void mo45236d() {
                C11570a.this.m68173y(false, false);
            }

            @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
            public void onPause() {
                C11570a.this.m68173y(false, false);
            }

            @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
            public void onResume() {
                C11570a.this.m68173y(true, true);
            }

            @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
            public void onStart() {
                MomentsInProfilePreviewAct.this.f44782x = false;
            }
        }

        public C11570a() {
        }

        /* JADX INFO: renamed from: u */
        public static /* synthetic */ void m68165u(Throwable th) {
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m68169A(C11571b c11571b, Moment moment) {
            Moment moment2;
            if (c11571b == null || (moment2 = c11571b.f44788b) == null) {
                return;
            }
            moment2.messages = moment.messages;
            moment2.likes = moment.likes;
            moment2.haveLiked = moment.haveLiked;
            if (moment2.f56859id.equals(MomentsInProfilePreviewAct.this.f44774p)) {
                MomentsInProfilePreviewAct.this.m68154k3(c11571b.f44788b);
            }
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m68170C() {
            if (TextUtils.isEmpty(MomentsInProfilePreviewAct.this.f44763e.getText())) {
                MomentsInProfilePreviewAct.this.f44762d.setVisibility(4);
            }
            MomentsInProfilePreviewAct.this.f44764f.setVisibility(4);
            this.f44784e = null;
        }

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ boolean m68171D(C11571b c11571b) {
            if (MomentsInProfilePreviewAct.this.lifecycle_() != C4470c.f16267i) {
                return true;
            }
            k3h.m148053N0(MomentsInProfilePreviewAct.this.act, c11571b.f44787a, null);
            return true;
        }

        /* JADX INFO: renamed from: E */
        public final /* synthetic */ void m68172E() {
            m68173y(MomentsInProfilePreviewAct.this.getSupportActionBar().mo102188o(), MomentsInProfilePreviewAct.this.f44764f.getVisibility() == 0);
        }

        @Override // p153l.cf60
        public int getCount() {
            return MomentsInProfilePreviewAct.this.f44778t.f184001a.size();
        }

        @Override // p153l.cf60
        public int getItemPosition(Object obj) {
            return MomentsInProfilePreviewAct.this.f44778t.f184001a.indexOf(obj);
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(View view, Object obj) {
            return view.getTag().equals(obj);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: m */
        public void mo44299m(Object obj) {
            final C11571b c11571b = (C11571b) obj;
            m153557n(MomentsInProfilePreviewAct.this, FeedModule.f39702c.m61891W3(c11571b.f44788b.f56859id)).map(new qcj() { // from class: l.nz00
                @Override // p153l.qcj
                public final Object call(Object obj2) {
                    return FeedModule.f39702c.m61893X3(((Moment) obj2).f56859id);
                }
            }).filter(new qcj() { // from class: l.oz00
                @Override // p153l.qcj
                public final Object call(Object obj2) {
                    return Boolean.valueOf(((Moment) obj2) != null);
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.pz00
                @Override // p153l.y20
                public final void call(Object obj2) {
                    this.f154703a.m68169A(c11571b, (Moment) obj2);
                }
            }, new y20() { // from class: l.qz00
                @Override // p153l.y20
                public final void call(Object obj2) {
                    MomentsInProfilePreviewAct.C11570a.m68165u((Throwable) obj2);
                }
            }));
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
            if (NullChecker.m82486a(viewFindViewWithTag)) {
                if (viewFindViewWithTag instanceof PlayerView) {
                    ((PlayerView) viewFindViewWithTag).setPlayer(null);
                }
                viewFindViewWithTag.setTag(null);
                viewGroup.removeView(viewFindViewWithTag);
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
            C11571b c11571b;
            View viewFindViewWithTag;
            Media media;
            if (MomentsInProfilePreviewAct.this.f44773o < 0 || MomentsInProfilePreviewAct.this.f44773o >= MomentsInProfilePreviewAct.this.f44778t.f184001a.size()) {
                c11571b = null;
                viewFindViewWithTag = null;
            } else {
                MomentsInProfilePreviewAct momentsInProfilePreviewAct = MomentsInProfilePreviewAct.this;
                c11571b = momentsInProfilePreviewAct.f44778t.f184001a.get(momentsInProfilePreviewAct.f44773o);
                viewFindViewWithTag = MomentsInProfilePreviewAct.this.f44761c.findViewWithTag(c11571b);
                if (viewFindViewWithTag instanceof FeedPhotoPreviewView) {
                    ((FeedPhotoPreviewView) viewFindViewWithTag).reset();
                }
            }
            if (i < 0 || i >= MomentsInProfilePreviewAct.this.f44778t.f184001a.size()) {
                return;
            }
            Moment moment = MomentsInProfilePreviewAct.this.f44778t.f184001a.get(i).f44788b;
            MomentsInProfilePreviewAct.this.m68154k3(moment);
            if (i == MomentsInProfilePreviewAct.this.f44778t.f184001a.size() - 1) {
                MomentsInProfilePreviewAct.this.m68158p3();
            }
            if (moment.f56859id.equals(MomentsInProfilePreviewAct.this.f44774p) && MomentsInProfilePreviewAct.this.f44773o != i && MomentsInProfilePreviewAct.this.getSupportActionBar().mo102188o()) {
                m68173y(true, true);
            } else if (!moment.f56859id.equals(MomentsInProfilePreviewAct.this.f44774p) && !MomentsInProfilePreviewAct.this.getSupportActionBar().mo102188o()) {
                m68173y(false, false);
            }
            MomentsInProfilePreviewAct.this.f44774p = moment.f56859id;
            C11571b c11571b2 = MomentsInProfilePreviewAct.this.f44778t.f184001a.get(i);
            MomentsInProfilePreviewAct.this.f44773o = i;
            if ((c11571b2 == null || c11571b == null || (media = c11571b.f44787a) == null || !media.equals(c11571b2.f44787a)) && (viewFindViewWithTag instanceof PlayerView)) {
                PlayerView playerView = (PlayerView) viewFindViewWithTag;
                if (playerView.m67748D()) {
                    playerView.m67759R();
                }
            }
            MomentsInProfilePreviewAct.this.supportInvalidateOptionsMenu();
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            final C11571b c11571b = MomentsInProfilePreviewAct.this.f44778t.f184001a.get(i);
            Media media = c11571b.f44787a;
            if (media instanceof Picture) {
                FeedPhotoPreviewView feedPhotoPreviewView = new FeedPhotoPreviewView(MomentsInProfilePreviewAct.this.act);
                feedPhotoPreviewView.m67691M((Picture) c11571b.f44787a, true);
                feedPhotoPreviewView.setOnLongPressListener(new FeedPhotoPreviewView.InterfaceC11559b() { // from class: l.lz00
                    @Override // com.p051p1.mobile.putong.feed.p065ui.FeedPhotoPreviewView.InterfaceC11559b
                    /* JADX INFO: renamed from: a */
                    public final boolean mo67692a() {
                        return this.f134152a.m68171D(c11571b);
                    }
                });
                feedPhotoPreviewView.setOnTapListener(new FeedPhotoPreviewView.InterfaceC11560c() { // from class: l.mz00
                    @Override // com.p051p1.mobile.putong.feed.p065ui.FeedPhotoPreviewView.InterfaceC11560c
                    /* JADX INFO: renamed from: a */
                    public final void mo67693a() {
                        this.f139451a.m68172E();
                    }
                });
                feedPhotoPreviewView.setTag(c11571b);
                viewGroup.addView(feedPhotoPreviewView);
                return c11571b;
            }
            if (media instanceof Video) {
                Video video = (Video) media;
                PlayerView playerView = new PlayerView(MomentsInProfilePreviewAct.this.act);
                playerView.setProgressBarsEnabled(false);
                MomentsInProfilePreviewAct momentsInProfilePreviewAct = MomentsInProfilePreviewAct.this;
                Media media2 = c11571b.f44787a;
                playerView.setPlayer(momentsInProfilePreviewAct.m68138L2(media2 != null ? media2.url : ""));
                viewGroup.addView(playerView);
                playerView.setTag(c11571b);
                playerView.setVideo(video);
                if (NullChecker.m82487b(video) && !TextUtils.isEmpty(video.formatAspectRatio())) {
                    uqb0.m197246S0(video.formatAspectRatio());
                }
                playerView.m67762x(new a());
            }
            return c11571b;
        }

        /* JADX INFO: renamed from: y */
        public final void m68173y(boolean z, boolean z2) {
            MomentsInProfilePreviewAct momentsInProfilePreviewAct = MomentsInProfilePreviewAct.this;
            if (z) {
                momentsInProfilePreviewAct.getSupportActionBar().mo102186m();
            } else {
                momentsInProfilePreviewAct.getSupportActionBar().mo102174G();
            }
            m68174z(z2);
        }

        /* JADX INFO: renamed from: z */
        public final void m68174z(boolean z) {
            if (z) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = MomentsInProfilePreviewAct.this.f44762d.animate();
                this.f44784e = viewPropertyAnimatorAnimate;
                viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: l.rz00
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f165479a.m68170C();
                    }
                }).translationY(MomentsInProfilePreviewAct.this.f44764f.getHeight()).setDuration(300L).setInterpolator(new AccelerateInterpolator()).start();
                return;
            }
            if (NullChecker.m82486a(this.f44784e)) {
                this.f44784e.cancel();
                this.f44784e = null;
            }
            MomentsInProfilePreviewAct.this.f44762d.setVisibility(0);
            if (MomentsInProfilePreviewAct.this.m68159s3()) {
                MomentsInProfilePreviewAct.this.f44764f.setAlpha(0.0f);
                MomentsInProfilePreviewAct.this.f44764f.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                MomentsInProfilePreviewAct.this.f44764f.setVisibility(0);
                MomentsInProfilePreviewAct.this.f44762d.animate().translationY(0.0f).setDuration(200L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                MomentsInProfilePreviewAct.this.f44764f.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentsInProfilePreviewAct$b */
    public static class C11571b {

        /* JADX INFO: renamed from: a */
        public Media f44787a;

        /* JADX INFO: renamed from: b */
        public Moment f44788b;

        public C11571b(Media media, Moment moment) {
            this.f44787a = media;
            this.f44788b = moment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C11571b c11571b = (C11571b) obj;
                if (!NullChecker.m82486a(this.f44787a) ? !NullChecker.m82486a(c11571b.f44787a) : this.f44787a.equals(c11571b.f44787a)) {
                    return false;
                }
                Moment moment = this.f44788b;
                Moment moment2 = c11571b.f44788b;
                if (moment != null) {
                    return moment.equals(moment2);
                }
                if (moment2 == null) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Media media = this.f44787a;
            int iHashCode = (media != null ? media.hashCode() : 0) * 31;
            Moment moment = this.f44788b;
            return iHashCode + (moment != null ? moment.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: K2 */
    public static Intent m68103K2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MomentsInProfilePreviewAct.class);
        intent.putExtra("moment id", str);
        intent.putExtra("user id", str2);
        return intent;
    }

    /* JADX INFO: renamed from: N2 */
    private boolean m68104N2() {
        if (this.f44776r == null) {
            this.f44776r = Boolean.valueOf(mrb0.m159672z(this.f44772n));
        }
        return this.f44776r.booleanValue();
    }

    /* JADX INFO: renamed from: Q2 */
    private boolean m68105Q2() {
        return this.f44772n.equals(FeedModule.m61405F().userId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public /* synthetic */ void m68106R2(View view) {
        if (uqb0.f180396b0.f170325b.shouldLockComment(this.f44772n)) {
            uqb0.f180396b0.f170325b.showProofAgeDlg(act(), "moment_detail");
        } else {
            this.f44775q.m67790t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S2 */
    public /* synthetic */ void m68107S2() {
        if (this.f44762d.getHeight() == 0) {
            return;
        }
        this.f44762d.setBackgroundDrawable(jde.m144405a(TextUtils.isEmpty(this.f44763e.getText()) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((double) qa00.m175859d(30.0f)) / ((double) this.f44762d.getHeight()), 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, GradientDrawable.Orientation.BOTTOM_TOP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W2 */
    public /* synthetic */ void m68108W2() {
        if (NullChecker.m82486a(this.f44781w)) {
            this.f44781w.release();
        }
        if (NullChecker.m82486a(this.f44780v)) {
            this.f44780v.release();
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public static /* synthetic */ Moment m68111Z1(Moment moment) {
        Moment momentMo225055clone = moment.mo225055clone();
        momentMo225055clone.messages = null;
        momentMo225055clone.likes = null;
        momentMo225055clone.haveLiked = false;
        return momentMo225055clone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g3 */
    public /* synthetic */ C22421c m68118g3() {
        return mrb0.m159645W(this.f44772n);
    }

    /* JADX INFO: renamed from: o2 */
    public static /* synthetic */ void m68125o2(Moment moment, View view, CommentCheckMarkView commentCheckMarkView, View view2) {
        if (uqb0.f180396b0.f170325b.shouldLockComment(moment.owner)) {
            uqb0.f180396b0.f170325b.showProofAgeDlg((Act) view.getContext(), "moment_detail");
        } else {
            commentCheckMarkView.m67790t();
        }
    }

    /* JADX INFO: renamed from: q3 */
    public static void m68128q3(Moment moment, View view, int i, TextView textView, CommentCheckMarkView commentCheckMarkView) {
        m68130r3(moment, view, i, textView, commentCheckMarkView, null);
    }

    /* JADX INFO: renamed from: r3 */
    public static void m68130r3(final Moment moment, final View view, int i, TextView textView, final CommentCheckMarkView commentCheckMarkView, x20 x20Var) {
        textView.setText(q8g0.m175802h0(i));
        view.setOnClickListener(new View.OnClickListener() { // from class: l.zy00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MomentsInProfilePreviewAct.m68125o2(moment, view, commentCheckMarkView, view2);
            }
        });
        if (!uqb0.f180396b0.f170325b.isCurrentMessageBlock(moment.owner)) {
            bnl0.m105524M(view, !moment.owner.equals(FeedModule.m61405F().userId()));
        }
        commentCheckMarkView.m67789s(moment.owner, moment.f56859id, x20Var);
    }

    /* JADX INFO: renamed from: I2 */
    public View m68137I2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tz00.m193634b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: L2 */
    public ie80 m68138L2(String str) {
        if (!NullChecker.m82486a(str) || str.startsWith("http")) {
            if (this.f44781w == null) {
                this.f44781w = new ye80();
            }
            return this.f44781w;
        }
        if (this.f44780v == null) {
            this.f44780v = new re80();
        }
        return this.f44780v;
    }

    /* JADX INFO: renamed from: M2 */
    public final boolean m68139M2() {
        User user = this.f44777s;
        return user != null && user.verifications.anchor.verified;
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ C22421c m68140T2() {
        return mrb0.m159647a(this.f44772n);
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m68141U2(uxj0 uxj0Var) {
        m48999H2();
    }

    /* JADX INFO: renamed from: V2 */
    public final /* synthetic */ void m68142V2(Bundle bundle) {
        C11570a c11570a = new C11570a();
        this.f44770l = c11570a;
        this.f44761c.setAdapter(c11570a);
        this.f44761c.m4187d(this.f44770l);
        this.f44761c.setPageMargin(qa00.m175859d(8.0f));
        if (uqb0.f180396b0.f170325b.isCurrentMessageBlock(this.f44772n)) {
            bnl0.m105524M(this.f44765g, false);
        }
        this.f44765g.setOnClickListener(new View.OnClickListener() { // from class: l.py00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f154613a.m68106R2(view);
            }
        });
        this.f44762d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.qy00
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f160088a.m68107S2();
            }
        });
        if (m68104N2()) {
            duringCreated(new pcj() { // from class: l.ry00
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f165394a.m68140T2();
                }
            }, false).subscribe(psd0.m173596G(new y20() { // from class: l.sy00
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f171206a.m68141U2((uxj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ Boolean m68143X2(C11571b c11571b) {
        return Boolean.valueOf(c11571b.f44788b.f56859id.equals(this.f44771m));
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m68144Z2(View view) {
        int i = this.f44773o;
        if (i >= 0) {
            Moment moment = this.f44778t.f184001a.get(i).f44788b;
            startActivity(MomentDetailAct.m67843X1(this.act, moment.f56859id, moment.owner, false, false));
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m68145a3(View view) {
        int i = this.f44773o;
        if (i >= 0) {
            MomentView.m67920h0(this.f44778t.f184001a.get(i).f44788b, this.f44767i, false);
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ void m68146b3() {
        int currentItem;
        if (this.f44782x && lifecycle_() == C4470c.f16267i && (currentItem = this.f44761c.getCurrentItem()) >= 0 && currentItem < this.f44778t.f184001a.size()) {
            C11571b c11571b = this.f44778t.f184001a.get(currentItem);
            if (c11571b.f44787a instanceof Video) {
                View viewFindViewWithTag = this.f44761c.findViewWithTag(c11571b);
                if (viewFindViewWithTag instanceof PlayerView) {
                    PlayerView playerView = (PlayerView) viewFindViewWithTag;
                    if (playerView.m67748D()) {
                        return;
                    }
                    playerView.m67756N();
                }
            }
        }
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m68147c3(vg60 vg60Var) {
        if (vg60Var.f184001a.isEmpty()) {
            m48999H2();
            return;
        }
        vg60<C11571b> vg60Var2 = new vg60<>(new ArrayList(), vg60Var.f184002b);
        for (int i = 0; i < vg60Var.f184001a.size(); i++) {
            Moment moment = (Moment) vg60Var.f184001a.get(i);
            for (int i2 = 0; i2 < moment.media.size(); i2++) {
                vg60Var2.f184001a.add(new C11571b(moment.media.get(i2), moment));
            }
        }
        if (vg60Var.m201221c() && vg60Var2.f184001a.size() <= this.f44773o) {
            m68158p3();
            return;
        }
        int i3 = this.f44773o;
        C11571b c11571b = i3 >= 0 ? this.f44778t.f184001a.get(i3) : null;
        if (NullChecker.m82486a(c11571b) && (this.f44761c.findViewWithTag(c11571b) instanceof PlayerView) && ((PlayerView) this.f44761c.findViewWithTag(c11571b)).m67748D()) {
            ((PlayerView) this.f44761c.findViewWithTag(c11571b)).m67755M();
        }
        this.f44778t = vg60Var2;
        this.f44770l.notifyDataSetChanged();
        if (NullChecker.m82486a(this.f44771m)) {
            int iM147476G = jyb.m147476G(this.f44778t.f184001a, new qcj() { // from class: l.ty00
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f176630a.m68143X2((MomentsInProfilePreviewAct.C11571b) obj);
                }
            });
            if (iM147476G >= 0) {
                this.f44761c.setCurrentItem(iM147476G);
            }
            if (iM147476G == 0) {
                this.f44770l.onPageSelected(iM147476G);
            }
            this.f44771m = null;
        } else {
            int iMin = Math.min(this.f44773o, this.f44778t.f184001a.size() - 1);
            this.f44773o = iMin;
            C11571b c11571b2 = iMin >= 0 ? this.f44778t.f184001a.get(iMin) : null;
            if (c11571b == null || !c11571b.equals(c11571b2)) {
                C11570a c11570a = new C11570a();
                this.f44770l = c11570a;
                this.f44761c.setAdapter(c11570a);
            }
            int i4 = this.f44773o;
            if (i4 >= 0) {
                this.f44761c.setCurrentItem(i4);
                this.f44770l.onPageSelected(this.f44773o);
            }
            if (NullChecker.m82486a(c11571b) && this.f44773o < 0) {
                m48999H2();
            }
        }
        this.f44768j.setOnClickListener(new View.OnClickListener() { // from class: l.uy00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181530a.m68144Z2(view);
            }
        });
        this.f44766h.setOnClickListener(new View.OnClickListener() { // from class: l.vy00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186316a.m68145a3(view);
            }
        });
        this.f44761c.post(new Runnable() { // from class: l.xy00
            @Override // java.lang.Runnable
            public final void run() {
                this.f196709a.m68146b3();
            }
        });
        if (this.f44779u < 5) {
            m68158p3();
        }
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ C22421c m68148d3() {
        return mrb0.m159671y(this.f44772n);
    }

    /* JADX INFO: renamed from: e3 */
    public final /* synthetic */ void m68149e3(Boolean bool) {
        this.f44776r = bool;
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ void m68150f3(C4470c c4470c) {
        if (NullChecker.m82486a(this.f44780v)) {
            this.f44780v.stop();
        }
        if (NullChecker.m82486a(this.f44781w)) {
            this.f44781w.stop();
        }
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ C22421c m68151h3(User user) {
        this.f44777s = user;
        this.f44764f.setVisibility(4);
        if (m68159s3()) {
            this.f44764f.setVisibility(0);
        }
        return (m68104N2() || m68105Q2() || m68139M2()) ? FeedModule.f39702c.m61897Z3(this.f44772n) : FeedModule.f39702c.m61890W2(this.f44772n, 0);
    }

    /* JADX INFO: renamed from: i3 */
    public final /* synthetic */ Moment m68152i3() {
        return this.f44778t.f184001a.get(this.f44773o).f44788b;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM68137I2 = m68137I2(layoutInflater, viewGroup);
        CommentCheckMarkView commentCheckMarkView = (CommentCheckMarkView) layoutInflater.inflate(tec0.f173731p4, viewGroup, false);
        this.f44775q = commentCheckMarkView;
        return setUpKeyboardDetectorLayout(viewM68137I2, commentCheckMarkView, commentCheckMarkView.f44480f);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.ly00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134023a.m68142V2((Bundle) obj);
            }
        }, new x20() { // from class: l.wy00
            @Override // p153l.x20
            public final void call() {
                this.f191564a.m68108W2();
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        duringCreated(new pcj() { // from class: l.dz00
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f91317a.m68118g3();
            }
        }).flatMap(new qcj() { // from class: l.ez00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f96554a.m68151h3((User) obj);
            }
        }).distinctUntilChanged(new qcj() { // from class: l.fz00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return jyb.m147486Q(((vg60) obj).f184001a, new qcj() { // from class: l.yy00
                    @Override // p153l.qcj
                    public final Object call(Object obj2) {
                        return MomentsInProfilePreviewAct.m68111Z1((Moment) obj2);
                    }
                });
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.gz00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107135a.m68147c3((vg60) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.hz00
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return this.f112184a.m68148d3();
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.iz00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f117652a.m68149e3((Boolean) obj);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.jz00
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16268j);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.kz00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129380a.m68150f3((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ Media m68153j3() {
        return this.f44778t.f184001a.get(this.f44773o).f44787a;
    }

    /* JADX INFO: renamed from: m3 */
    public final /* synthetic */ void m68155m3(final Moment moment, vg60 vg60Var) {
        m68130r3(moment, this.f44765g, vg60Var.m201222d() + moment.likes.count, this.f44769k, this.f44775q, new x20() { // from class: l.cz00
            @Override // p153l.x20
            public final void call() {
                this.f84414a.m68154k3(moment);
            }
        });
    }

    /* JADX INFO: renamed from: n3 */
    public final /* synthetic */ void m68156n3(Moment moment, View view) {
        Act act = this.act;
        act.startActivity(MomentDetailAct.m67843X1(act, moment.f56859id, moment.owner, false, false));
    }

    /* JADX INFO: renamed from: o3, reason: merged with bridge method [inline-methods] */
    public void m68154k3(final Moment moment) {
        setTitle(pzi0.m174456q().format(Double.valueOf(moment.createdTime)));
        bnl0.m105524M(this.f44763e, !moment.value.isEmpty());
        this.f44763e.setText(moment.value);
        int i = lbc0.f131017d2;
        ImageView imageView = this.f44767i;
        if (!moment.haveLiked) {
            i = lbc0.f131125q6;
        }
        imageView.setImageResource(i);
        if (NullChecker.m82486a(this.f44783y) && !this.f44783y.isUnsubscribed()) {
            this.f44783y.unsubscribe();
        }
        this.f44783y = this.act.duringCreated(FeedModule.f39702c.m61902c3(moment.f56859id)).subscribe(psd0.m173596G(new y20() { // from class: l.az00
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f74067a.m68155m3(moment, (vg60) obj);
            }
        }));
        this.f44768j.setOnClickListener(new View.OnClickListener() { // from class: l.bz00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79088a.m68156n3(moment, view);
            }
        });
        boolean zEquals = TEnum.equals(moment.status(), "normal");
        bnl0.m105591y(this.f44765g, zEquals);
        bnl0.m105591y(this.f44766h, zEquals);
        bnl0.m105591y(this.f44768j, zEquals);
        if (uqb0.f180396b0.f170325b.isCurrentMessageBlock(this.f44772n)) {
            bnl0.m105524M(this.f44765g, false);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        List<C11571b> list;
        int i;
        vg60<C11571b> vg60Var = this.f44778t;
        if (vg60Var != null && (list = vg60Var.f184001a) != null && (i = this.f44773o) >= 0 && i < list.size()) {
            k3h.m148037F0(this, menu, this.f44772n, new pcj() { // from class: l.my00
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f139310a.m68152i3();
                }
            }, new pcj() { // from class: l.ny00
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f144284a.m68153j3();
                }
            }, null, new x20() { // from class: l.oy00
                @Override // p153l.x20
                public final void call() {
                    this.f149730a.m68160t3();
                }
            }, null, null, null, false, false, m68104N2(), (m68104N2() || m68105Q2()) && !(this.f44778t.f184001a.get(this.f44773o).f44787a instanceof Video));
            try {
                ((ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(toolbar())).setOverflowIcon(getResources().getDrawable(lbc0.f131001b2));
            } catch (IllegalAccessException e) {
                CrashHelper.m82479c(e);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: p3 */
    public void m68158p3() {
        if (m68105Q2() || m68104N2()) {
            FeedModule.f39702c.m61901b4(this.f44772n);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_user_moment_fullscreen_browse_view";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setStatusBarColor(getResources().getColor(k9c0.f124524o0));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f44771m = getIntent().getStringExtra("moment id");
        this.f44772n = getIntent().getStringExtra("user id");
        super.preCreateView(bundle);
    }

    /* JADX INFO: renamed from: s3 */
    public final boolean m68159s3() {
        return m68104N2() || m68105Q2() || m68139M2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    /* JADX INFO: renamed from: t3 */
    public final void m68160t3() {
        int currentItem;
        if (lifecycle_() == C4470c.f16267i && (currentItem = this.f44761c.getCurrentItem()) >= 0 && currentItem < this.f44778t.f184001a.size()) {
            C11571b c11571b = this.f44778t.f184001a.get(currentItem);
            if (c11571b.f44787a instanceof Video) {
                View viewFindViewWithTag = this.f44761c.findViewWithTag(c11571b);
                if (viewFindViewWithTag instanceof PlayerView) {
                    PlayerView playerView = (PlayerView) viewFindViewWithTag;
                    if (playerView.m67748D()) {
                        playerView.m67759R();
                    }
                }
            }
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        String str = this.f44772n;
        og3<Object> og3Var = og3.f147188c;
        return jyb.m147507f0("other user id", str, og3Var, "moment id", this.f44771m, og3Var);
    }
}
