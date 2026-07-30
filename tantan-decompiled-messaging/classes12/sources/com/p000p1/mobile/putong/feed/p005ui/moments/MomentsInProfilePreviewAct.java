package com.p000p1.mobile.putong.feed.p005ui.moments;

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
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.p005ui.FeedPhotoPreviewView;
import com.p000p1.mobile.putong.feed.p005ui.PlayerView;
import com.p000p1.mobile.putong.feed.p005ui.moments.MomentsInProfilePreviewAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.ag3;
import l.c4g0;
import l.c680;
import l.d30;
import l.e30;
import l.eb2;
import l.fce;
import l.i0g0;
import l.l680;
import l.mkd0;
import l.mqi0;
import l.q860;
import l.qib0;
import l.roj0;
import l.s680;
import l.t100;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xdl0;
import p007l.e1c0;
import p007l.f3c0;
import p007l.ijb0;
import p007l.kr00;
import p007l.o6c0;
import p007l.v1h;
import v.VFrame;
import v.VPager;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentsInProfilePreviewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VPager f5374c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f5375d;

    /* JADX INFO: renamed from: e */
    public VText f5376e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f5377f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f5378g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f5379h;

    /* JADX INFO: renamed from: i */
    public ImageView f5380i;

    /* JADX INFO: renamed from: j */
    public VFrame f5381j;

    /* JADX INFO: renamed from: k */
    public VText f5382k;

    /* JADX INFO: renamed from: l */
    public C2251a f5383l;

    /* JADX INFO: renamed from: m */
    public String f5384m;

    /* JADX INFO: renamed from: n */
    public String f5385n;

    /* JADX INFO: renamed from: p */
    public String f5387p;

    /* JADX INFO: renamed from: q */
    public CommentCheckMarkView f5388q;

    /* JADX INFO: renamed from: r */
    public Boolean f5389r;

    /* JADX INFO: renamed from: s */
    public User f5390s;

    /* JADX INFO: renamed from: v */
    public c680 f5393v;

    /* JADX INFO: renamed from: w */
    public c680 f5394w;

    /* JADX INFO: renamed from: y */
    public c4g0 f5396y;

    /* JADX INFO: renamed from: o */
    public int f5386o = -1;

    /* JADX INFO: renamed from: t */
    public q860<C2252b> f5391t = q860.a();

    /* JADX INFO: renamed from: u */
    public int f5392u = 0;

    /* JADX INFO: renamed from: x */
    public boolean f5395x = true;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentsInProfilePreviewAct$a */
    public class C2251a extends eb2 implements ViewPager.j {

        /* JADX INFO: renamed from: e */
        public ViewPropertyAnimator f5397e;

        /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentsInProfilePreviewAct$a$a */
        public class a extends c680.c {
            public a() {
            }

            /* JADX INFO: renamed from: d */
            public void m8193d() {
                C2251a.this.m8191y(false, false);
            }

            public void onPause() {
                C2251a.this.m8191y(false, false);
            }

            public void onResume() {
                C2251a.this.m8191y(true, true);
            }

            public void onStart() {
                MomentsInProfilePreviewAct.this.f5395x = false;
            }
        }

        public C2251a() {
        }

        /* JADX INFO: renamed from: u */
        public static /* synthetic */ void m8180u(Throwable th) {
        }

        /* JADX INFO: renamed from: A */
        public final /* synthetic */ void m8184A(C2252b c2252b, Moment moment) {
            Moment moment2;
            if (c2252b == null || (moment2 = c2252b.f5401b) == null) {
                return;
            }
            moment2.messages = moment.messages;
            moment2.likes = moment.likes;
            moment2.haveLiked = moment.haveLiked;
            if (((DbObject) moment2).id.equals(MomentsInProfilePreviewAct.this.f5387p)) {
                MomentsInProfilePreviewAct.this.m8169i3(c2252b.f5401b);
            }
        }

        /* JADX INFO: renamed from: C */
        public final /* synthetic */ void m8185C() {
            if (TextUtils.isEmpty(MomentsInProfilePreviewAct.this.f5376e.getText())) {
                MomentsInProfilePreviewAct.this.f5375d.setVisibility(4);
            }
            MomentsInProfilePreviewAct.this.f5377f.setVisibility(4);
            this.f5397e = null;
        }

        /* JADX INFO: renamed from: D */
        public final /* synthetic */ boolean m8186D(C2252b c2252b) {
            if (MomentsInProfilePreviewAct.this.lifecycle_() != c.i) {
                return true;
            }
            v1h.m15215N0(((Act) MomentsInProfilePreviewAct.this).act, c2252b.f5400a, null);
            return true;
        }

        /* JADX INFO: renamed from: E */
        public final /* synthetic */ void m8187E() {
            m8191y(MomentsInProfilePreviewAct.this.getSupportActionBar().o(), MomentsInProfilePreviewAct.this.f5377f.getVisibility() == 0);
        }

        public int getCount() {
            return MomentsInProfilePreviewAct.this.f5391t.a.size();
        }

        public int getItemPosition(Object obj) {
            return MomentsInProfilePreviewAct.this.f5391t.a.indexOf(obj);
        }

        public boolean isViewFromObject(View view, Object obj) {
            return view.getTag().equals(obj);
        }

        /* JADX INFO: renamed from: m */
        public void m8188m(Object obj) {
            final C2252b c2252b = (C2252b) obj;
            n(MomentsInProfilePreviewAct.this, FeedModule.f315c.m1633W3(((DbObject) c2252b.f5401b).id)).map(new w9j() { // from class: l.er00
                public final Object call(Object obj2) {
                    return FeedModule.f315c.m1635X3(((DbObject) ((Moment) obj2)).id);
                }
            }).filter(new w9j() { // from class: l.fr00
                public final Object call(Object obj2) {
                    return Boolean.valueOf(((Moment) obj2) != null);
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.gr00
                public final void call(Object obj2) {
                    this.f8502a.m8184A(c2252b, (Moment) obj2);
                }
            }, new e30() { // from class: l.hr00
                public final void call(Object obj2) {
                    MomentsInProfilePreviewAct.C2251a.m8180u((Throwable) obj2);
                }
            }));
        }

        /* JADX INFO: renamed from: o */
        public void m8189o(ViewGroup viewGroup, int i, Object obj) {
            View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
            if (NullChecker.a(viewFindViewWithTag)) {
                if (viewFindViewWithTag instanceof PlayerView) {
                    ((PlayerView) viewFindViewWithTag).setPlayer(null);
                }
                viewFindViewWithTag.setTag(null);
                viewGroup.removeView(viewFindViewWithTag);
            }
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            C2252b c2252b;
            Object objFindViewWithTag;
            Media media;
            if (MomentsInProfilePreviewAct.this.f5386o < 0 || MomentsInProfilePreviewAct.this.f5386o >= MomentsInProfilePreviewAct.this.f5391t.a.size()) {
                c2252b = null;
                objFindViewWithTag = null;
            } else {
                MomentsInProfilePreviewAct momentsInProfilePreviewAct = MomentsInProfilePreviewAct.this;
                c2252b = (C2252b) momentsInProfilePreviewAct.f5391t.a.get(momentsInProfilePreviewAct.f5386o);
                objFindViewWithTag = MomentsInProfilePreviewAct.this.f5374c.findViewWithTag(c2252b);
                if (objFindViewWithTag instanceof FeedPhotoPreviewView) {
                    ((FeedPhotoPreviewView) objFindViewWithTag).reset();
                }
            }
            if (i < 0 || i >= MomentsInProfilePreviewAct.this.f5391t.a.size()) {
                return;
            }
            Moment moment = ((C2252b) MomentsInProfilePreviewAct.this.f5391t.a.get(i)).f5401b;
            MomentsInProfilePreviewAct.this.m8169i3(moment);
            if (i == MomentsInProfilePreviewAct.this.f5391t.a.size() - 1) {
                MomentsInProfilePreviewAct.this.m8173n3();
            }
            if (((DbObject) moment).id.equals(MomentsInProfilePreviewAct.this.f5387p) && MomentsInProfilePreviewAct.this.f5386o != i && MomentsInProfilePreviewAct.this.getSupportActionBar().o()) {
                m8191y(true, true);
            } else if (!((DbObject) moment).id.equals(MomentsInProfilePreviewAct.this.f5387p) && !MomentsInProfilePreviewAct.this.getSupportActionBar().o()) {
                m8191y(false, false);
            }
            MomentsInProfilePreviewAct.this.f5387p = ((DbObject) moment).id;
            C2252b c2252b2 = (C2252b) MomentsInProfilePreviewAct.this.f5391t.a.get(i);
            MomentsInProfilePreviewAct.this.f5386o = i;
            if ((c2252b2 == null || c2252b == null || (media = c2252b.f5400a) == null || !media.equals(c2252b2.f5400a)) && (objFindViewWithTag instanceof PlayerView)) {
                PlayerView playerView = (PlayerView) objFindViewWithTag;
                if (playerView.m7749D()) {
                    playerView.m7760R();
                }
            }
            MomentsInProfilePreviewAct.this.supportInvalidateOptionsMenu();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v5, types: [android.view.View, com.p1.mobile.putong.feed.ui.FeedPhotoPreviewView] */
        /* JADX INFO: renamed from: p */
        public Object m8190p(ViewGroup viewGroup, int i) {
            final C2252b c2252b = (C2252b) MomentsInProfilePreviewAct.this.f5391t.a.get(i);
            Media media = c2252b.f5400a;
            if (media instanceof Picture) {
                ?? feedPhotoPreviewView = new FeedPhotoPreviewView(((Act) MomentsInProfilePreviewAct.this).act);
                feedPhotoPreviewView.m7679M((Picture) c2252b.f5400a, true);
                feedPhotoPreviewView.setOnLongPressListener(new FeedPhotoPreviewView.InterfaceC2240b() { // from class: l.cr00
                    @Override // com.p000p1.mobile.putong.feed.p005ui.FeedPhotoPreviewView.InterfaceC2240b
                    /* JADX INFO: renamed from: a */
                    public final boolean mo7684a() {
                        return this.f6715a.m8186D(c2252b);
                    }
                });
                feedPhotoPreviewView.setOnTapListener(new FeedPhotoPreviewView.InterfaceC2241c() { // from class: l.dr00
                    @Override // com.p000p1.mobile.putong.feed.p005ui.FeedPhotoPreviewView.InterfaceC2241c
                    /* JADX INFO: renamed from: a */
                    public final void mo7685a() {
                        this.f7038a.m8187E();
                    }
                });
                feedPhotoPreviewView.setTag(c2252b);
                viewGroup.addView(feedPhotoPreviewView);
                return c2252b;
            }
            if (media instanceof Video) {
                Video video = (Video) media;
                PlayerView playerView = new PlayerView(((Act) MomentsInProfilePreviewAct.this).act);
                playerView.setProgressBarsEnabled(false);
                MomentsInProfilePreviewAct momentsInProfilePreviewAct = MomentsInProfilePreviewAct.this;
                Media media2 = c2252b.f5400a;
                playerView.setPlayer(momentsInProfilePreviewAct.m8153K2(media2 != null ? media2.url : ""));
                viewGroup.addView(playerView);
                playerView.setTag(c2252b);
                playerView.setVideo(video);
                if (NullChecker.b(video) && !TextUtils.isEmpty(video.formatAspectRatio())) {
                    qib0.S0(video.formatAspectRatio());
                }
                playerView.m7763x(new a());
            }
            return c2252b;
        }

        /* JADX INFO: renamed from: y */
        public final void m8191y(boolean z, boolean z2) {
            MomentsInProfilePreviewAct momentsInProfilePreviewAct = MomentsInProfilePreviewAct.this;
            if (z) {
                momentsInProfilePreviewAct.getSupportActionBar().m();
            } else {
                momentsInProfilePreviewAct.getSupportActionBar().G();
            }
            m8192z(z2);
        }

        /* JADX INFO: renamed from: z */
        public final void m8192z(boolean z) {
            if (z) {
                ViewPropertyAnimator viewPropertyAnimatorAnimate = MomentsInProfilePreviewAct.this.f5375d.animate();
                this.f5397e = viewPropertyAnimatorAnimate;
                viewPropertyAnimatorAnimate.withEndAction(new Runnable() { // from class: l.ir00
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9118a.m8185C();
                    }
                }).translationY(MomentsInProfilePreviewAct.this.f5377f.getHeight()).setDuration(300L).setInterpolator(new AccelerateInterpolator()).start();
                return;
            }
            if (NullChecker.a(this.f5397e)) {
                this.f5397e.cancel();
                this.f5397e = null;
            }
            MomentsInProfilePreviewAct.this.f5375d.setVisibility(0);
            if (MomentsInProfilePreviewAct.this.m8174q3()) {
                MomentsInProfilePreviewAct.this.f5377f.setAlpha(0.0f);
                MomentsInProfilePreviewAct.this.f5377f.animate().alpha(1.0f).setDuration(300L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                MomentsInProfilePreviewAct.this.f5377f.setVisibility(0);
                MomentsInProfilePreviewAct.this.f5375d.animate().translationY(0.0f).setDuration(200L).setInterpolator(new AccelerateDecelerateInterpolator()).start();
                MomentsInProfilePreviewAct.this.f5377f.setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.ui.moments.MomentsInProfilePreviewAct$b */
    public static class C2252b {

        /* JADX INFO: renamed from: a */
        public Media f5400a;

        /* JADX INFO: renamed from: b */
        public Moment f5401b;

        public C2252b(Media media, Moment moment) {
            this.f5400a = media;
            this.f5401b = moment;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && getClass() == obj.getClass()) {
                C2252b c2252b = (C2252b) obj;
                if (!NullChecker.a(this.f5400a) ? !NullChecker.a(c2252b.f5400a) : this.f5400a.equals(c2252b.f5400a)) {
                    return false;
                }
                Moment moment = this.f5401b;
                Moment moment2 = c2252b.f5401b;
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
            Media media = this.f5400a;
            int iHashCode = (media != null ? media.hashCode() : 0) * 31;
            Moment moment = this.f5401b;
            return iHashCode + (moment != null ? moment.hashCode() : 0);
        }
    }

    /* JADX INFO: renamed from: I2 */
    public static Intent m8117I2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) MomentsInProfilePreviewAct.class);
        intent.putExtra("moment id", str);
        intent.putExtra("user id", str2);
        return intent;
    }

    /* JADX INFO: renamed from: M2 */
    private boolean m8118M2() {
        if (this.f5389r == null) {
            this.f5389r = Boolean.valueOf(ijb0.m10939z(this.f5385n));
        }
        return this.f5389r.booleanValue();
    }

    /* JADX INFO: renamed from: N2 */
    private boolean m8119N2() {
        return this.f5385n.equals(FeedModule.m1139F().userId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q2 */
    public /* synthetic */ void m8120Q2(View view) {
        if (qib0.b0.b.shouldLockComment(this.f5385n)) {
            qib0.b0.b.showProofAgeDlg(act(), "moment_detail");
        } else {
            this.f5388q.m7798t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R2 */
    public /* synthetic */ void m8121R2() {
        if (this.f5375d.getHeight() == 0) {
            return;
        }
        this.f5375d.setBackgroundDrawable(fce.a(TextUtils.isEmpty(this.f5376e.getText()) ? 0.0d : ((double) t100.d(30.0f)) / ((double) this.f5375d.getHeight()), 1.0d, 0.0d, GradientDrawable.Orientation.BOTTOM_TOP));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V2 */
    public /* synthetic */ void m8123V2() {
        if (NullChecker.a(this.f5394w)) {
            this.f5394w.release();
        }
        if (NullChecker.a(this.f5393v)) {
            this.f5393v.release();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static /* synthetic */ Moment m8125Y1(Moment moment) {
        Moment momentM19592clone = moment.m19592clone();
        momentM19592clone.messages = null;
        momentM19592clone.likes = null;
        momentM19592clone.haveLiked = false;
        return momentM19592clone;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e3 */
    public /* synthetic */ rx.c m8132e3() {
        return ijb0.m10912W(this.f5385n);
    }

    /* JADX INFO: renamed from: n2 */
    public static /* synthetic */ void m8139n2(Moment moment, View view, CommentCheckMarkView commentCheckMarkView, View view2) {
        if (qib0.b0.b.shouldLockComment(moment.owner)) {
            qib0.b0.b.showProofAgeDlg(view.getContext(), "moment_detail");
        } else {
            commentCheckMarkView.m7798t();
        }
    }

    /* JADX INFO: renamed from: o3 */
    public static void m8141o3(Moment moment, View view, int i, TextView textView, CommentCheckMarkView commentCheckMarkView) {
        m8143p3(moment, view, i, textView, commentCheckMarkView, null);
    }

    /* JADX INFO: renamed from: p3 */
    public static void m8143p3(final Moment moment, final View view, int i, TextView textView, final CommentCheckMarkView commentCheckMarkView, d30 d30Var) {
        textView.setText(i0g0.h0(i));
        view.setOnClickListener(new View.OnClickListener() { // from class: l.qq00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                MomentsInProfilePreviewAct.m8139n2(moment, view, commentCheckMarkView, view2);
            }
        });
        if (!qib0.b0.b.isCurrentMessageBlock(moment.owner)) {
            xdl0.M(view, !moment.owner.equals(FeedModule.m1139F().userId()));
        }
        commentCheckMarkView.m7797s(moment.owner, ((DbObject) moment).id, d30Var);
    }

    /* JADX INFO: renamed from: H2 */
    public View m8152H2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kr00.m11514b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: K2 */
    public c680 m8153K2(String str) {
        if (!NullChecker.a(str) || str.startsWith("http")) {
            if (this.f5394w == null) {
                this.f5394w = new s680();
            }
            return this.f5394w;
        }
        if (this.f5393v == null) {
            this.f5393v = new l680();
        }
        return this.f5393v;
    }

    /* JADX INFO: renamed from: L2 */
    public final boolean m8154L2() {
        User user = this.f5390s;
        return user != null && user.verifications.anchor.verified;
    }

    /* JADX INFO: renamed from: S2 */
    public final /* synthetic */ rx.c m8155S2() {
        return ijb0.m10914a(this.f5385n);
    }

    /* JADX INFO: renamed from: T2 */
    public final /* synthetic */ void m8156T2(roj0 roj0Var) {
        finish();
    }

    /* JADX INFO: renamed from: U2 */
    public final /* synthetic */ void m8157U2(Bundle bundle) {
        C2251a c2251a = new C2251a();
        this.f5383l = c2251a;
        this.f5374c.setAdapter(c2251a);
        this.f5374c.d(this.f5383l);
        this.f5374c.setPageMargin(t100.d(8.0f));
        if (qib0.b0.b.isCurrentMessageBlock(this.f5385n)) {
            xdl0.M(this.f5378g, false);
        }
        this.f5378g.setOnClickListener(new View.OnClickListener() { // from class: l.gq00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8497a.m8120Q2(view);
            }
        });
        this.f5375d.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: l.hq00
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                this.f8788a.m8121R2();
            }
        });
        if (m8118M2()) {
            duringCreated(new v9j() { // from class: l.iq00
                public final Object call() {
                    return this.f9116a.m8155S2();
                }
            }, false).subscribe(mkd0.G(new e30() { // from class: l.jq00
                public final void call(Object obj) {
                    this.f9502a.m8156T2((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: W2 */
    public final /* synthetic */ Boolean m8158W2(C2252b c2252b) {
        return Boolean.valueOf(((DbObject) c2252b.f5401b).id.equals(this.f5384m));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X2 */
    public final /* synthetic */ void m8159X2(View view) {
        int i = this.f5386o;
        if (i >= 0) {
            Moment moment = ((C2252b) this.f5391t.a.get(i)).f5401b;
            startActivity(MomentDetailAct.m7851V1(((Act) this).act, ((DbObject) moment).id, moment.owner, false, false));
        }
    }

    /* JADX INFO: renamed from: Y2 */
    public final /* synthetic */ void m8160Y2(View view) {
        int i = this.f5386o;
        if (i >= 0) {
            MomentView.m7928h0(((C2252b) this.f5391t.a.get(i)).f5401b, this.f5380i, false);
        }
    }

    /* JADX INFO: renamed from: Z2 */
    public final /* synthetic */ void m8161Z2() {
        int currentItem;
        if (this.f5395x && lifecycle_() == c.i && (currentItem = this.f5374c.getCurrentItem()) >= 0 && currentItem < this.f5391t.a.size()) {
            C2252b c2252b = (C2252b) this.f5391t.a.get(currentItem);
            if (c2252b.f5400a instanceof Video) {
                View viewFindViewWithTag = this.f5374c.findViewWithTag(c2252b);
                if (viewFindViewWithTag instanceof PlayerView) {
                    PlayerView playerView = (PlayerView) viewFindViewWithTag;
                    if (playerView.m7749D()) {
                        return;
                    }
                    playerView.m7757N();
                }
            }
        }
    }

    /* JADX INFO: renamed from: a3 */
    public final /* synthetic */ void m8162a3(q860 q860Var) {
        if (q860Var.a.isEmpty()) {
            finish();
            return;
        }
        q860<C2252b> q860Var2 = new q860<>(new ArrayList(), q860Var.b);
        for (int i = 0; i < q860Var.a.size(); i++) {
            Moment moment = (Moment) q860Var.a.get(i);
            for (int i2 = 0; i2 < moment.media.size(); i2++) {
                q860Var2.a.add(new C2252b(moment.media.get(i2), moment));
            }
        }
        if (q860Var.c() && q860Var2.a.size() <= this.f5386o) {
            m8173n3();
            return;
        }
        int i3 = this.f5386o;
        C2252b c2252b = i3 >= 0 ? (C2252b) this.f5391t.a.get(i3) : null;
        if (NullChecker.a(c2252b) && (this.f5374c.findViewWithTag(c2252b) instanceof PlayerView) && ((PlayerView) this.f5374c.findViewWithTag(c2252b)).m7749D()) {
            ((PlayerView) this.f5374c.findViewWithTag(c2252b)).m7756M();
        }
        this.f5391t = q860Var2;
        this.f5383l.notifyDataSetChanged();
        if (NullChecker.a(this.f5384m)) {
            int iG = vwb.G(this.f5391t.a, new w9j() { // from class: l.kq00
                public final Object call(Object obj) {
                    return this.f9766a.m8158W2((MomentsInProfilePreviewAct.C2252b) obj);
                }
            });
            if (iG >= 0) {
                this.f5374c.setCurrentItem(iG);
            }
            if (iG == 0) {
                this.f5383l.onPageSelected(iG);
            }
            this.f5384m = null;
        } else {
            int iMin = Math.min(this.f5386o, this.f5391t.a.size() - 1);
            this.f5386o = iMin;
            C2252b c2252b2 = iMin >= 0 ? (C2252b) this.f5391t.a.get(iMin) : null;
            if (c2252b == null || !c2252b.equals(c2252b2)) {
                C2251a c2251a = new C2251a();
                this.f5383l = c2251a;
                this.f5374c.setAdapter(c2251a);
            }
            int i4 = this.f5386o;
            if (i4 >= 0) {
                this.f5374c.setCurrentItem(i4);
                this.f5383l.onPageSelected(this.f5386o);
            }
            if (NullChecker.a(c2252b) && this.f5386o < 0) {
                finish();
            }
        }
        this.f5381j.setOnClickListener(new View.OnClickListener() { // from class: l.lq00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10100a.m8159X2(view);
            }
        });
        this.f5379h.setOnClickListener(new View.OnClickListener() { // from class: l.mq00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10540a.m8160Y2(view);
            }
        });
        this.f5374c.post(new Runnable() { // from class: l.oq00
            @Override // java.lang.Runnable
            public final void run() {
                this.f11553a.m8161Z2();
            }
        });
        if (this.f5392u < 5) {
            m8173n3();
        }
    }

    /* JADX INFO: renamed from: b3 */
    public final /* synthetic */ rx.c m8163b3() {
        return ijb0.m10938y(this.f5385n);
    }

    /* JADX INFO: renamed from: c3 */
    public final /* synthetic */ void m8164c3(Boolean bool) {
        this.f5389r = bool;
    }

    /* JADX INFO: renamed from: d3 */
    public final /* synthetic */ void m8165d3(c cVar) {
        if (NullChecker.a(this.f5393v)) {
            this.f5393v.stop();
        }
        if (NullChecker.a(this.f5394w)) {
            this.f5394w.stop();
        }
    }

    /* JADX INFO: renamed from: f3 */
    public final /* synthetic */ rx.c m8166f3(User user) {
        this.f5390s = user;
        this.f5377f.setVisibility(4);
        if (m8174q3()) {
            this.f5377f.setVisibility(0);
        }
        return (m8118M2() || m8119N2() || m8154L2()) ? FeedModule.f315c.m1639Z3(this.f5385n) : FeedModule.f315c.m1632W2(this.f5385n, 0);
    }

    /* JADX INFO: renamed from: g3 */
    public final /* synthetic */ Moment m8167g3() {
        return ((C2252b) this.f5391t.a.get(this.f5386o)).f5401b;
    }

    /* JADX INFO: renamed from: h3 */
    public final /* synthetic */ Media m8168h3() {
        return ((C2252b) this.f5391t.a.get(this.f5386o)).f5400a;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM8152H2 = m8152H2(layoutInflater, viewGroup);
        CommentCheckMarkView commentCheckMarkView = (CommentCheckMarkView) layoutInflater.inflate(o6c0.f11281p4, viewGroup, false);
        this.f5388q = commentCheckMarkView;
        return setUpKeyboardDetectorLayout(viewM8152H2, commentCheckMarkView, commentCheckMarkView.f5093f);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.cq00
            public final void call(Object obj) {
                this.f6705a.m8157U2((Bundle) obj);
            }
        }, new d30() { // from class: l.nq00
            public final void call() {
                this.f10850a.m8123V2();
            }
        });
    }

    public void initSubscription() {
        super.initSubscription();
        duringCreated(new v9j() { // from class: l.uq00
            public final Object call() {
                return this.f13912a.m8132e3();
            }
        }).flatMap(new w9j() { // from class: l.vq00
            public final Object call(Object obj) {
                return this.f14263a.m8166f3((User) obj);
            }
        }).distinctUntilChanged(new w9j() { // from class: l.wq00
            public final Object call(Object obj) {
                return vwb.Q(((q860) obj).a, new w9j() { // from class: l.pq00
                    public final Object call(Object obj2) {
                        return MomentsInProfilePreviewAct.m8125Y1((Moment) obj2);
                    }
                });
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.xq00
            public final void call(Object obj) {
                this.f15067a.m8162a3((q860) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.yq00
            public final Object call() {
                return this.f15489a.m8163b3();
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.zq00
            public final void call(Object obj) {
                this.f15827a.m8164c3((Boolean) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.ar00
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.j);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.br00
            public final void call(Object obj) {
                this.f6415a.m8165d3((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j3 */
    public final /* synthetic */ void m8170j3(final Moment moment, q860 q860Var) {
        m8143p3(moment, this.f5378g, q860Var.d() + moment.likes.count, this.f5382k, this.f5388q, new d30() { // from class: l.tq00
            public final void call() {
                this.f13375a.m8169i3(moment);
            }
        });
    }

    /* JADX INFO: renamed from: k3 */
    public final /* synthetic */ void m8171k3(Moment moment, View view) {
        Act act = ((Act) this).act;
        act.startActivity(MomentDetailAct.m7851V1(act, ((DbObject) moment).id, moment.owner, false, false));
    }

    /* JADX INFO: renamed from: m3, reason: merged with bridge method [inline-methods] */
    public void m8169i3(final Moment moment) {
        setTitle(mqi0.q().format(Double.valueOf(moment.createdTime)));
        xdl0.M(this.f5376e, !moment.value.isEmpty());
        this.f5376e.setText(moment.value);
        int i = f3c0.f7782d2;
        ImageView imageView = this.f5380i;
        if (!moment.haveLiked) {
            i = f3c0.f7890q6;
        }
        imageView.setImageResource(i);
        if (NullChecker.a(this.f5396y) && !this.f5396y.isUnsubscribed()) {
            this.f5396y.unsubscribe();
        }
        this.f5396y = ((Act) this).act.duringCreated(FeedModule.f315c.m1644c3(((DbObject) moment).id)).subscribe(mkd0.G(new e30() { // from class: l.rq00
            public final void call(Object obj) {
                this.f12713a.m8170j3(moment, (q860) obj);
            }
        }));
        this.f5381j.setOnClickListener(new View.OnClickListener() { // from class: l.sq00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13033a.m8171k3(moment, view);
            }
        });
        boolean zEquals = TEnum.equals(moment.status(), "normal");
        xdl0.y(this.f5378g, zEquals);
        xdl0.y(this.f5379h, zEquals);
        xdl0.y(this.f5381j, zEquals);
        if (qib0.b0.b.isCurrentMessageBlock(this.f5385n)) {
            xdl0.M(this.f5378g, false);
        }
    }

    /* JADX INFO: renamed from: n3 */
    public void m8173n3() {
        if (m8119N2() || m8118M2()) {
            FeedModule.f315c.m1643b4(this.f5385n);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        List list;
        int i;
        q860<C2252b> q860Var = this.f5391t;
        if (q860Var != null && (list = q860Var.a) != null && (i = this.f5386o) >= 0 && i < list.size()) {
            v1h.m15199F0(this, menu, this.f5385n, new v9j() { // from class: l.dq00
                public final Object call() {
                    return this.f7026a.m8167g3();
                }
            }, new v9j() { // from class: l.eq00
                public final Object call() {
                    return this.f7453a.m8168h3();
                }
            }, null, new d30() { // from class: l.fq00
                public final void call() {
                    this.f8183a.m8175r3();
                }
            }, null, null, null, false, false, m8118M2(), (m8118M2() || m8119N2()) && !(((C2252b) this.f5391t.a.get(this.f5386o)).f5400a instanceof Video));
            try {
                ((ActionMenuView) Act.TOOLBAR_MENU_VIEW_FILED.get(toolbar())).setOverflowIcon(getResources().getDrawable(f3c0.f7766b2));
            } catch (IllegalAccessException e) {
                CrashHelper.c(e);
            }
        }
        return true;
    }

    public String pageId() {
        return "p_user_moment_fullscreen_browse_view";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        setStatusBarColor(getResources().getColor(e1c0.f7157o0));
        decorOrSwipingDecorView().setBackgroundColor(-16777216);
        this.f5384m = getIntent().getStringExtra("moment id");
        this.f5385n = getIntent().getStringExtra("user id");
        super.preCreateView(bundle);
    }

    /* JADX INFO: renamed from: q3 */
    public final boolean m8174q3() {
        return m8118M2() || m8119N2() || m8154L2();
    }

    /* JADX INFO: renamed from: r3 */
    public final void m8175r3() {
        int currentItem;
        if (lifecycle_() == c.i && (currentItem = this.f5374c.getCurrentItem()) >= 0 && currentItem < this.f5391t.a.size()) {
            C2252b c2252b = (C2252b) this.f5391t.a.get(currentItem);
            if (c2252b.f5400a instanceof Video) {
                View viewFindViewWithTag = this.f5374c.findViewWithTag(c2252b);
                if (viewFindViewWithTag instanceof PlayerView) {
                    PlayerView playerView = (PlayerView) viewFindViewWithTag;
                    if (playerView.m7749D()) {
                        playerView.m7760R();
                    }
                }
            }
        }
    }

    public boolean shouldShowGradientActionBar() {
        return false;
    }

    public boolean shouldShowGradientStatusBar() {
        return false;
    }

    public boolean shouldSwitchToGradientColoredStatusBar() {
        return false;
    }

    public List<Object> trackedArgs() {
        String str = this.f5385n;
        ag3 ag3Var = ag3.c;
        return vwb.f0(new Object[]{"other user id", str, ag3Var, "moment id", this.f5384m, ag3Var});
    }
}
