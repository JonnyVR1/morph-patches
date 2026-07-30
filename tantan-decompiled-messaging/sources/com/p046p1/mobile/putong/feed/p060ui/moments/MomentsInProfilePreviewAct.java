package com.p046p1.mobile.putong.feed.p060ui.moments;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.p060ui.FeedPhotoPreviewView;
import com.p046p1.mobile.putong.feed.p060ui.PlayerView;
import com.p046p1.mobile.putong.feed.p060ui.moments.MomentsInProfilePreviewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p147v.VFrame;
import p147v.VPager;
import p147v.VText;
import p149l.ag3;
import p149l.c4g0;
import p149l.c680;
import p149l.d30;
import p149l.e1c0;
import p149l.e30;
import p149l.eb2;
import p149l.f3c0;
import p149l.fce;
import p149l.i0g0;
import p149l.ijb0;
import p149l.kr00;
import p149l.l680;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o6c0;
import p149l.q860;
import p149l.qib0;
import p149l.roj0;
import p149l.s680;
import p149l.t100;
import p149l.v1h;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class MomentsInProfilePreviewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VPager f43913c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f43914d;

    /* JADX INFO: renamed from: e */
    public VText f43915e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f43916f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f43917g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f43918h;

    /* JADX INFO: renamed from: i */
    public ImageView f43919i;

    /* JADX INFO: renamed from: j */
    public VFrame f43920j;

    /* JADX INFO: renamed from: k */
    public VText f43921k;

    /* JADX INFO: renamed from: l */
    public C11407a f43922l;

    /* JADX INFO: renamed from: m */
    public String f43923m;

    /* JADX INFO: renamed from: n */
    public String f43924n;

    /* JADX INFO: renamed from: p */
    public String f43926p;

    /* JADX INFO: renamed from: q */
    public CommentCheckMarkView f43927q;

    /* JADX INFO: renamed from: r */
    public Boolean f43928r;

    /* JADX INFO: renamed from: s */
    public User f43929s;

    /* JADX INFO: renamed from: v */
    public c680 f43932v;

    /* JADX INFO: renamed from: w */
    public c680 f43933w;

    /* JADX INFO: renamed from: y */
    public c4g0 f43935y;

    /* JADX INFO: renamed from: o */
    public int f43925o = -1;

    /* JADX INFO: renamed from: t */
    public q860<C11408b> f43930t = q860.m173341a();

    /* JADX INFO: renamed from: u */
    public int f43931u = 0;

    /* JADX INFO: renamed from: x */
    public boolean f43934x = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentsInProfilePreviewAct$a */
    public class C11407a extends eb2 implements ViewPager.InterfaceC0716j {

        /* JADX INFO: renamed from: e */
        public ViewPropertyAnimator f43936e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentsInProfilePreviewAct$a$a */
        public class a extends c680.C16085c {
            public a() {
            }

            @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
            /* JADX INFO: renamed from: d */
            public void mo44053d() {
                C11407a.this.m66990y(false, false);
            }

            @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
            public void onPause() {
                C11407a.this.m66990y(false, false);
            }

            @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
            public void onResume() {
                C11407a.this.m66990y(true, true);
            }

            @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
            public void onStart() {
                MomentsInProfilePreviewAct.this.f43934x = false;
            }
        }

        public C11407a() {
        }

        /* JADX INFO: renamed from: u */
        public static /* synthetic */ void m66982u(Throwable th) {
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m66986A(C11408b c11408b, Moment moment) {
            Moment moment2;
            if (c11408b == null || (moment2 = c11408b.f43940b) == null) {
                return;
            }
            moment2.messages = moment.messages;
            moment2.likes = moment.likes;
            moment2.haveLiked = moment.haveLiked;
            if (moment2.f56011id.equals(MomentsInProfilePreviewAct.this.f43926p)) {
                MomentsInProfilePreviewAct.this.m66971i3(c11408b.f43940b);
            }
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m66987C() {
            if (TextUtils.isEmpty(MomentsInProfilePreviewAct.this.f43915e.getText())) {
                MomentsInProfilePreviewAct.this.f43914d.setVisibility(4);
            }
            MomentsInProfilePreviewAct.this.f43916f.setVisibility(4);
            this.f43936e = null;
        }

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ boolean m66988D(C11408b c11408b) {
            if (MomentsInProfilePreviewAct.this.lifecycle_() != C4319c.f15548i) {
                return true;
            }
            v1h.m196576N0(MomentsInProfilePreviewAct.this.act, c11408b.f43939a, null);
            return true;
        }

        /* JADX INFO: renamed from: E */
        public final /* synthetic */ void m66989E() {
            m66990y(MomentsInProfilePreviewAct.this.getSupportActionBar().mo134128o(), MomentsInProfilePreviewAct.this.f43916f.getVisibility() == 0);
        }

        @Override // p149l.w660
        public int getCount() {
            return MomentsInProfilePreviewAct.this.f43930t.f153135a.size();
        }

        @Override // p149l.w660
        public int getItemPosition(Object obj) {
            return MomentsInProfilePreviewAct.this.f43930t.f153135a.indexOf(obj);
        }

        @Override // p149l.w660
        public boolean isViewFromObject(View view, Object obj) {
            return view.getTag().equals(obj);
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: m */
        public void mo43284m(Object obj) {
            final C11408b c11408b = (C11408b) obj;
            m115452n(MomentsInProfilePreviewAct.this, FeedModule.f38854c.m60707W3(c11408b.f43940b.f56011id)).map(new w9j() { // from class: l.er00
                @Override // p149l.w9j
                public final Object call(Object obj2) {
                    return FeedModule.f38854c.m60709X3(((Moment) obj2).f56011id);
                }
            }).filter(new w9j() { // from class: l.fr00
                @Override // p149l.w9j
                public final Object call(Object obj2) {
                    return Boolean.valueOf(((Moment) obj2) != null);
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.gr00
                @Override // p149l.e30
                public final void call(Object obj2) {
                    this.f104004a.m66986A(c11408b, (Moment) obj2);
                }
            }, new e30() { // from class: l.hr00
                @Override // p149l.e30
                public final void call(Object obj2) {
                    MomentsInProfilePreviewAct.C11407a.m66982u((Throwable) obj2);
                }
            }));
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
            if (NullChecker.m81303a(viewFindViewWithTag)) {
                if (viewFindViewWithTag instanceof PlayerView) {
                    ((PlayerView) viewFindViewWithTag).setPlayer(null);
                }
                viewFindViewWithTag.setTag(null);
                viewGroup.removeView(viewFindViewWithTag);
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
            C11408b c11408b;
            View viewFindViewWithTag;
            Media media;
            if (MomentsInProfilePreviewAct.this.f43925o < 0 || MomentsInProfilePreviewAct.this.f43925o >= MomentsInProfilePreviewAct.this.f43930t.f153135a.size()) {
                c11408b = null;
                viewFindViewWithTag = null;
            } else {
                MomentsInProfilePreviewAct momentsInProfilePreviewAct = MomentsInProfilePreviewAct.this;
                c11408b = momentsInProfilePreviewAct.f43930t.f153135a.get(momentsInProfilePreviewAct.f43925o);
                viewFindViewWithTag = MomentsInProfilePreviewAct.this.f43913c.findViewWithTag(c11408b);
                if (viewFindViewWithTag instanceof FeedPhotoPreviewView) {
                    ((FeedPhotoPreviewView) viewFindViewWithTag).reset();
                }
            }
            if (i < 0 || i >= MomentsInProfilePreviewAct.this.f43930t.f153135a.size()) {
                return;
            }
            Moment moment = MomentsInProfilePreviewAct.this.f43930t.f153135a.get(i).f43940b;
            MomentsInProfilePreviewAct.this.m66971i3(moment);
            if (i == MomentsInProfilePreviewAct.this.f43930t.f153135a.size() - 1) {
                MomentsInProfilePreviewAct.this.m66975n3();
            }
            if (moment.f56011id.equals(MomentsInProfilePreviewAct.this.f43926p) && MomentsInProfilePreviewAct.this.f43925o != i && MomentsInProfilePreviewAct.this.getSupportActionBar().mo134128o()) {
                m66990y(true, true);
            } else if (!moment.f56011id.equals(MomentsInProfilePreviewAct.this.f43926p) && !MomentsInProfilePreviewAct.this.getSupportActionBar().mo134128o()) {
                m66990y(false, false);
            }
            MomentsInProfilePreviewAct.this.f43926p = moment.f56011id;
            C11408b c11408b2 = MomentsInProfilePreviewAct.this.f43930t.f153135a.get(i);
            MomentsInProfilePreviewAct.this.f43925o = i;
            if ((c11408b2 == null || c11408b == null || (media = c11408b.f43939a) == null || !media.equals(c11408b2.f43939a)) && (viewFindViewWithTag instanceof PlayerView)) {
                PlayerView playerView = (PlayerView) viewFindViewWithTag;
                if (playerView.m66565D()) {
                    playerView.m66576R();
                }
            }
            MomentsInProfilePreviewAct.this.supportInvalidateOptionsMenu();
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            final C11408b c11408b = MomentsInProfilePreviewAct.this.f43930t.f153135a.get(i);
            Media media = c11408b.f43939a;
            if (media instanceof Picture) {
                FeedPhotoPreviewView feedPhotoPreviewView = new FeedPhotoPreviewView(MomentsInProfilePreviewAct.this.act);
                feedPhotoPreviewView.m66508M((Picture) c11408b.f43939a, true);
                feedPhotoPreviewView.setOnLongPressListener(new FeedPhotoPreviewView.InterfaceC11396b() { // from class: l.cr00
                    @Override // com.p046p1.mobile.putong.feed.p060ui.FeedPhotoPreviewView.InterfaceC11396b
                    /* JADX INFO: renamed from: a */
                    public final boolean mo66509a() {
                        return this.f82141a.m66988D(c11408b);
                    }
                });
                feedPhotoPreviewView.setOnTapListener(new FeedPhotoPreviewView.InterfaceC11397c() { // from class: l.dr00
                    @Override // com.p046p1.mobile.putong.feed.p060ui.FeedPhotoPreviewView.InterfaceC11397c
                    /* JADX INFO: renamed from: a */
                    public final void mo66510a() {
                        this.f87566a.m66989E();
                    }
                });
                feedPhotoPreviewView.setTag(c11408b);
                viewGroup.addView(feedPhotoPreviewView);
                return c11408b;
            }
            if (media instanceof Video) {
                Video video = (Video) media;
                PlayerView playerView = new PlayerView(MomentsInProfilePreviewAct.this.act);
                playerView.setProgressBarsEnabled(false);
                MomentsInProfilePreviewAct momentsInProfilePreviewAct = MomentsInProfilePreviewAct.this;
                Media media2 = c11408b.f43939a;
                playerView.setPlayer(momentsInProfilePreviewAct.m66955K2(media2 != null ? media2.url : ""));
                viewGroup.addView(playerView);
                playerView.setTag(c11408b);
                playerView.setVideo(video);
                if (NullChecker.m81304b(video) && !TextUtils.isEmpty(video.formatAspectRatio())) {
                    qib0.m174792S0(video.formatAspectRatio());
                }
                playerView.m66579x(new a());
            }
            return c11408b;
        }

        /* JADX INFO: renamed from: y */
        public final void m66990y(boolean z, boolean z2) {
            MomentsInProfilePreviewAct momentsInProfilePreviewAct = MomentsInProfilePreviewAct.this;
            if (z) {
                momentsInProfilePreviewAct.getSupportActionBar().mo134126m();
            } else {
                momentsInProfilePreviewAct.getSupportActionBar().mo134117G();
            }
            m66991z(z2);
        }

        /* JADX INFO: renamed from: z */
        public final void m66991z(boolean z) {
            if (z) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = MomentsInProfilePreviewAct.this.f43914d.animate();
                this.f43936e = viewPropertyAnimatorAnimate;
                viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: l.ir00
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f114576a.m66987C();
                    }
                }).translationY(MomentsInProfilePreviewAct.this.f43916f.getHeight()).setDuration(300L).setInterpolator(new AccelerateInterpolator()).start();
                return;
            }
            if (NullChecker.m81303a(this.f43936e)) {
                this.f43936e.cancel();
                this.f43936e = null;
            }
            MomentsInProfilePreviewAct.this.f43914d.setVisibility(0);
            if (MomentsInProfilePreviewAct.this.m66976q3()) {
                MomentsInProfilePreviewAct.this.f43916f.setAlpha(0.0f);
                MomentsInProfilePreviewAct.this.f43916f.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                MomentsInProfilePreviewAct.this.f43916f.setVisibility(0);
                MomentsInProfilePreviewAct.this.f43914d.animate().translationY(0.0f).setDuration(200L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                MomentsInProfilePreviewAct.this.f43916f.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentsInProfilePreviewAct$b */
    public static class C11408b {

        /* JADX INFO: renamed from: a */
        public Media f43939a;

        /* JADX INFO: renamed from: b */
        public Moment f43940b;

        public C11408b(Media media, Moment moment) {
            this.f43939a = media;
            this.f43940b = moment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C11408b c11408b = (C11408b) obj;
                if (!NullChecker.m81303a(this.f43939a) ? !NullChecker.m81303a(c11408b.f43939a) : this.f43939a.equals(c11408b.f43939a)) {
                    return false;
                }
                Moment moment = this.f43940b;
                Moment moment2 = c11408b.f43940b;
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
            Media media = this.f43939a;
            int iHashCode = (media != null ? media.hashCode() : 0) * 31;
            Moment moment = this.f43940b;
            return iHashCode + (moment != null ? moment.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: I2 */
    public static Intent m66919I2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MomentsInProfilePreviewAct.class);
        intent.putExtra("moment id", str);
        intent.putExtra("user id", str2);
        return intent;
    }

    /* JADX INFO: renamed from: M2 */
    private boolean m66920M2() {
        if (this.f43928r == null) {
            this.f43928r = Boolean.valueOf(ijb0.m136586z(this.f43924n));
        }
        return this.f43928r.booleanValue();
    }

    /* JADX INFO: renamed from: N2 */
    private boolean m66921N2() {
        return this.f43924n.equals(FeedModule.m60221F().userId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public /* synthetic */ void m66922Q2(View view) {
        if (qib0.f154713b0.f139231b.shouldLockComment(this.f43924n)) {
            qib0.f154713b0.f139231b.showProofAgeDlg(act(), "moment_detail");
        } else {
            this.f43927q.m66607t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public /* synthetic */ void m66923R2() {
        if (this.f43914d.getHeight() == 0) {
            return;
        }
        this.f43914d.setBackgroundDrawable(fce.m120424a(TextUtils.isEmpty(this.f43915e.getText()) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : ((double) t100.m186890d(30.0f)) / ((double) this.f43914d.getHeight()), 1.0d, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, GradientDrawable.Orientation.BOTTOM_TOP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public /* synthetic */ void m66925V2() {
        if (NullChecker.m81303a(this.f43933w)) {
            this.f43933w.release();
        }
        if (NullChecker.m81303a(this.f43932v)) {
            this.f43932v.release();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ Moment m66927Y1(Moment moment) {
        Moment momentMo223809clone = moment.mo223809clone();
        momentMo223809clone.messages = null;
        momentMo223809clone.likes = null;
        momentMo223809clone.haveLiked = false;
        return momentMo223809clone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ C22306c m66934e3() {
        return ijb0.m136559W(this.f43924n);
    }

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ void m66941n2(Moment moment, View view, CommentCheckMarkView commentCheckMarkView, View view2) {
        if (qib0.f154713b0.f139231b.shouldLockComment(moment.owner)) {
            qib0.f154713b0.f139231b.showProofAgeDlg((Act) view.getContext(), "moment_detail");
        } else {
            commentCheckMarkView.m66607t();
        }
    }

    /* JADX INFO: renamed from: o3 */
    public static void m66943o3(Moment moment, View view, int i, TextView textView, CommentCheckMarkView commentCheckMarkView) {
        m66945p3(moment, view, i, textView, commentCheckMarkView, null);
    }

    /* JADX INFO: renamed from: p3 */
    public static void m66945p3(final Moment moment, final View view, int i, TextView textView, final CommentCheckMarkView commentCheckMarkView, d30 d30Var) {
        textView.setText(i0g0.m133867h0(i));
        view.setOnClickListener(new View.OnClickListener() { // from class: l.qq00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MomentsInProfilePreviewAct.m66941n2(moment, view, commentCheckMarkView, view2);
            }
        });
        if (!qib0.f154713b0.f139231b.isCurrentMessageBlock(moment.owner)) {
            xdl0.m208344M(view, !moment.owner.equals(FeedModule.m60221F().userId()));
        }
        commentCheckMarkView.m66606s(moment.owner, moment.f56011id, d30Var);
    }

    /* JADX INFO: renamed from: H2 */
    public View m66954H2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kr00.m146964b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: K2 */
    public c680 m66955K2(String str) {
        if (!NullChecker.m81303a(str) || str.startsWith("http")) {
            if (this.f43933w == null) {
                this.f43933w = new s680();
            }
            return this.f43933w;
        }
        if (this.f43932v == null) {
            this.f43932v = new l680();
        }
        return this.f43932v;
    }

    /* JADX INFO: renamed from: L2 */
    public final boolean m66956L2() {
        User user = this.f43929s;
        return user != null && user.verifications.anchor.verified;
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ C22306c m66957S2() {
        return ijb0.m136561a(this.f43924n);
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m66958T2(roj0 roj0Var) {
        m47815F2();
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m66959U2(Bundle bundle) {
        C11407a c11407a = new C11407a();
        this.f43922l = c11407a;
        this.f43913c.setAdapter(c11407a);
        this.f43913c.m4185d(this.f43922l);
        this.f43913c.setPageMargin(t100.m186890d(8.0f));
        if (qib0.f154713b0.f139231b.isCurrentMessageBlock(this.f43924n)) {
            xdl0.m208344M(this.f43917g, false);
        }
        this.f43917g.setOnClickListener(new View.OnClickListener() { // from class: l.gq00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103869a.m66922Q2(view);
            }
        });
        this.f43914d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.hq00
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f109022a.m66923R2();
            }
        });
        if (m66920M2()) {
            duringCreated(new v9j() { // from class: l.iq00
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f114367a.m66957S2();
                }
            }, false).subscribe(mkd0.m154955G(new e30() { // from class: l.jq00
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f119247a.m66958T2((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ Boolean m66960W2(C11408b c11408b) {
        return Boolean.valueOf(c11408b.f43940b.f56011id.equals(this.f43923m));
    }

    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m66961X2(View view) {
        int i = this.f43925o;
        if (i >= 0) {
            Moment moment = this.f43930t.f153135a.get(i).f43940b;
            startActivity(MomentDetailAct.m66660V1(this.act, moment.f56011id, moment.owner, false, false));
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m66962Y2(View view) {
        int i = this.f43925o;
        if (i >= 0) {
            MomentView.m66737h0(this.f43930t.f153135a.get(i).f43940b, this.f43919i, false);
        }
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m66963Z2() {
        int currentItem;
        if (this.f43934x && lifecycle_() == C4319c.f15548i && (currentItem = this.f43913c.getCurrentItem()) >= 0 && currentItem < this.f43930t.f153135a.size()) {
            C11408b c11408b = this.f43930t.f153135a.get(currentItem);
            if (c11408b.f43939a instanceof Video) {
                View viewFindViewWithTag = this.f43913c.findViewWithTag(c11408b);
                if (viewFindViewWithTag instanceof PlayerView) {
                    PlayerView playerView = (PlayerView) viewFindViewWithTag;
                    if (playerView.m66565D()) {
                        return;
                    }
                    playerView.m66573N();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m66964a3(q860 q860Var) {
        if (q860Var.f153135a.isEmpty()) {
            m47815F2();
            return;
        }
        q860<C11408b> q860Var2 = new q860<>(new ArrayList(), q860Var.f153136b);
        for (int i = 0; i < q860Var.f153135a.size(); i++) {
            Moment moment = (Moment) q860Var.f153135a.get(i);
            for (int i2 = 0; i2 < moment.media.size(); i2++) {
                q860Var2.f153135a.add(new C11408b(moment.media.get(i2), moment));
            }
        }
        if (q860Var.m173343c() && q860Var2.f153135a.size() <= this.f43925o) {
            m66975n3();
            return;
        }
        int i3 = this.f43925o;
        C11408b c11408b = i3 >= 0 ? this.f43930t.f153135a.get(i3) : null;
        if (NullChecker.m81303a(c11408b) && (this.f43913c.findViewWithTag(c11408b) instanceof PlayerView) && ((PlayerView) this.f43913c.findViewWithTag(c11408b)).m66565D()) {
            ((PlayerView) this.f43913c.findViewWithTag(c11408b)).m66572M();
        }
        this.f43930t = q860Var2;
        this.f43922l.notifyDataSetChanged();
        if (NullChecker.m81303a(this.f43923m)) {
            int iM200293G = vwb.m200293G(this.f43930t.f153135a, new w9j() { // from class: l.kq00
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f124215a.m66960W2((MomentsInProfilePreviewAct.C11408b) obj);
                }
            });
            if (iM200293G >= 0) {
                this.f43913c.setCurrentItem(iM200293G);
            }
            if (iM200293G == 0) {
                this.f43922l.onPageSelected(iM200293G);
            }
            this.f43923m = null;
        } else {
            int iMin = Math.min(this.f43925o, this.f43930t.f153135a.size() - 1);
            this.f43925o = iMin;
            C11408b c11408b2 = iMin >= 0 ? this.f43930t.f153135a.get(iMin) : null;
            if (c11408b == null || !c11408b.equals(c11408b2)) {
                C11407a c11407a = new C11407a();
                this.f43922l = c11407a;
                this.f43913c.setAdapter(c11407a);
            }
            int i4 = this.f43925o;
            if (i4 >= 0) {
                this.f43913c.setCurrentItem(i4);
                this.f43922l.onPageSelected(this.f43925o);
            }
            if (NullChecker.m81303a(c11408b) && this.f43925o < 0) {
                m47815F2();
            }
        }
        this.f43920j.setOnClickListener(new View.OnClickListener() { // from class: l.lq00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129266a.m66961X2(view);
            }
        });
        this.f43918h.setOnClickListener(new View.OnClickListener() { // from class: l.mq00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f135144a.m66962Y2(view);
            }
        });
        this.f43913c.post(new Runnable() { // from class: l.oq00
            @Override // java.lang.Runnable
            public final void run() {
                this.f145073a.m66963Z2();
            }
        });
        if (this.f43931u < 5) {
            m66975n3();
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ C22306c m66965b3() {
        return ijb0.m136585y(this.f43924n);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m66966c3(Boolean bool) {
        this.f43928r = bool;
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m66967d3(C4319c c4319c) {
        if (NullChecker.m81303a(this.f43932v)) {
            this.f43932v.stop();
        }
        if (NullChecker.m81303a(this.f43933w)) {
            this.f43933w.stop();
        }
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ C22306c m66968f3(User user) {
        this.f43929s = user;
        this.f43916f.setVisibility(4);
        if (m66976q3()) {
            this.f43916f.setVisibility(0);
        }
        return (m66920M2() || m66921N2() || m66956L2()) ? FeedModule.f38854c.m60713Z3(this.f43924n) : FeedModule.f38854c.m60706W2(this.f43924n, 0);
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ Moment m66969g3() {
        return this.f43930t.f153135a.get(this.f43925o).f43940b;
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ Media m66970h3() {
        return this.f43930t.f153135a.get(this.f43925o).f43939a;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM66954H2 = m66954H2(layoutInflater, viewGroup);
        CommentCheckMarkView commentCheckMarkView = (CommentCheckMarkView) layoutInflater.inflate(o6c0.f142262p4, viewGroup, false);
        this.f43927q = commentCheckMarkView;
        return setUpKeyboardDetectorLayout(viewM66954H2, commentCheckMarkView, commentCheckMarkView.f43632f);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.cq00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82014a.m66959U2((Bundle) obj);
            }
        }, new d30() { // from class: l.nq00
            @Override // p149l.d30
            public final void call() {
                this.f140024a.m66925V2();
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        duringCreated(new v9j() { // from class: l.uq00
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f177694a.m66934e3();
            }
        }).flatMap(new w9j() { // from class: l.vq00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f182562a.m66968f3((User) obj);
            }
        }).distinctUntilChanged(new w9j() { // from class: l.wq00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return vwb.m200303Q(((q860) obj).f153135a, new w9j() { // from class: l.pq00
                    @Override // p149l.w9j
                    public final Object call(Object obj2) {
                        return MomentsInProfilePreviewAct.m66927Y1((Moment) obj2);
                    }
                });
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.xq00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193975a.m66964a3((q860) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.yq00
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return this.f199513a.m66965b3();
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.zq00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204338a.m66966c3((Boolean) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.ar00
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15549j);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.br00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76828a.m66967d3((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ void m66972j3(final Moment moment, q860 q860Var) {
        m66945p3(moment, this.f43917g, q860Var.m173344d() + moment.likes.count, this.f43921k, this.f43927q, new d30() { // from class: l.tq00
            @Override // p149l.d30
            public final void call() {
                this.f171540a.m66971i3(moment);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m66973k3(Moment moment, View view) {
        Act act = this.act;
        act.startActivity(MomentDetailAct.m66660V1(act, moment.f56011id, moment.owner, false, false));
    }

    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public void m66971i3(final Moment moment) {
        setTitle(mqi0.m155946q().format(Double.valueOf(moment.createdTime)));
        xdl0.m208344M(this.f43915e, !moment.value.isEmpty());
        this.f43915e.setText(moment.value);
        int i = f3c0.f94499d2;
        ImageView imageView = this.f43919i;
        if (!moment.haveLiked) {
            i = f3c0.f94607q6;
        }
        imageView.setImageResource(i);
        if (NullChecker.m81303a(this.f43935y) && !this.f43935y.isUnsubscribed()) {
            this.f43935y.unsubscribe();
        }
        this.f43935y = this.act.duringCreated(FeedModule.f38854c.m60718c3(moment.f56011id)).subscribe(mkd0.m154955G(new e30() { // from class: l.rq00
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160584a.m66972j3(moment, (q860) obj);
            }
        }));
        this.f43920j.setOnClickListener(new View.OnClickListener() { // from class: l.sq00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165907a.m66973k3(moment, view);
            }
        });
        boolean zEquals = TEnum.equals(moment.status(), "normal");
        xdl0.m208411y(this.f43917g, zEquals);
        xdl0.m208411y(this.f43918h, zEquals);
        xdl0.m208411y(this.f43920j, zEquals);
        if (qib0.f154713b0.f139231b.isCurrentMessageBlock(this.f43924n)) {
            xdl0.m208344M(this.f43917g, false);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public void m66975n3() {
        if (m66921N2() || m66920M2()) {
            FeedModule.f38854c.m60717b4(this.f43924n);
        }
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        List<C11408b> list;
        int i;
        q860<C11408b> q860Var = this.f43930t;
        if (q860Var != null && (list = q860Var.f153135a) != null && (i = this.f43925o) >= 0 && i < list.size()) {
            v1h.m196560F0(this, menu, this.f43924n, new v9j() { // from class: l.dq00
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f87377a.m66969g3();
                }
            }, new v9j() { // from class: l.eq00
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f92748a.m66970h3();
                }
            }, null, new d30() { // from class: l.fq00
                @Override // p149l.d30
                public final void call() {
                    this.f98755a.m66977r3();
                }
            }, null, null, null, false, false, m66920M2(), (m66920M2() || m66921N2()) && !(this.f43930t.f153135a.get(this.f43925o).f43939a instanceof Video));
            try {
                ((ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(toolbar())).setOverflowIcon(getResources().getDrawable(f3c0.f94483b2));
            } catch (IllegalAccessException e) {
                CrashHelper.m81296c(e);
            }
        }
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_user_moment_fullscreen_browse_view";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        setStatusBarColor(getResources().getColor(e1c0.f88801o0));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f43923m = getIntent().getStringExtra("moment id");
        this.f43924n = getIntent().getStringExtra("user id");
        super.preCreateView(bundle);
    }

    /* JADX INFO: renamed from: q3 */
    public final boolean m66976q3() {
        return m66920M2() || m66921N2() || m66956L2();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m66977r3() {
        int currentItem;
        if (lifecycle_() == C4319c.f15548i && (currentItem = this.f43913c.getCurrentItem()) >= 0 && currentItem < this.f43930t.f153135a.size()) {
            C11408b c11408b = this.f43930t.f153135a.get(currentItem);
            if (c11408b.f43939a instanceof Video) {
                View viewFindViewWithTag = this.f43913c.findViewWithTag(c11408b);
                if (viewFindViewWithTag instanceof PlayerView) {
                    PlayerView playerView = (PlayerView) viewFindViewWithTag;
                    if (playerView.m66565D()) {
                        playerView.m66576R();
                    }
                }
            }
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientActionBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public List<Object> trackedArgs() {
        String str = this.f43924n;
        ag3<Object> ag3Var = ag3.f69254c;
        return vwb.m200324f0("other user id", str, ag3Var, "moment id", this.f43923m, ag3Var);
    }
}
