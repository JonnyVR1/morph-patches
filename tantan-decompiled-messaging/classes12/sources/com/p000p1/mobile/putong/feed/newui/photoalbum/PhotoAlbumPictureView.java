package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Music;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.camera.MusicAggregateAct;
import com.p000p1.mobile.putong.feed.newui.camera.widget.RotatingDiscView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.api.api.Network;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import l.d30;
import l.e30;
import l.fyx;
import l.lsi0;
import l.mkd0;
import l.qib0;
import l.r5l0;
import l.rhi;
import l.s5l0;
import l.x1l0;
import l.xdl0;
import p007l.b5c0;
import p007l.eb1;
import p007l.o6c0;
import p007l.pa70;
import p007l.u2h;
import v.VDraweeView;
import v.VFrame_ColorFilter;
import v.VProgressBar;
import v.VTexturePlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class PhotoAlbumPictureView extends FrameLayout implements View.OnClickListener, VTexturePlayer.b {

    /* JADX INFO: renamed from: a */
    public VDraweeView f2778a;

    /* JADX INFO: renamed from: b */
    public VFrame_ColorFilter f2779b;

    /* JADX INFO: renamed from: c */
    public ImageView f2780c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f2781d;

    /* JADX INFO: renamed from: e */
    public ImageView f2782e;

    /* JADX INFO: renamed from: f */
    public VTexturePlayer f2783f;

    /* JADX INFO: renamed from: g */
    public VTexturePlayer.b f2784g;

    /* JADX INFO: renamed from: h */
    public Media f2785h;

    /* JADX INFO: renamed from: i */
    public boolean f2786i;

    /* JADX INFO: renamed from: j */
    public boolean f2787j;

    /* JADX INFO: renamed from: k */
    public long f2788k;

    /* JADX INFO: renamed from: l */
    public long f2789l;

    /* JADX INFO: renamed from: m */
    public RotatingDiscView f2790m;

    /* JADX INFO: renamed from: n */
    public d30 f2791n;

    /* JADX INFO: renamed from: o */
    public Moment f2792o;

    /* JADX INFO: renamed from: p */
    public boolean f2793p;

    /* JADX INFO: renamed from: q */
    public int f2794q;

    /* JADX INFO: renamed from: r */
    public float f2795r;

    /* JADX INFO: renamed from: s */
    public int f2796s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView$a */
    public class C2123a implements VTexturePlayer.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f2797a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f2798b;

        public C2123a(String str, int i) {
            this.f2797a = str;
            this.f2798b = i;
        }

        /* JADX INFO: renamed from: O */
        public void m4898O() {
            PhotoAlbumPictureView.this.f2789l = System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: a */
        public void m4899a() {
            fyx.c(PhotoAlbumPictureView.this.f2788k, System.currentTimeMillis(), this.f2797a, this.f2798b);
        }

        /* JADX INFO: renamed from: b */
        public void m4900b(int i, int i2) {
            fyx.e(i, i2, !Network.isConnected(FeedModule.f313a), this.f2797a, this.f2798b);
        }

        /* JADX INFO: renamed from: c */
        public void m4901c(long j) {
            if (PhotoAlbumPictureView.this.f2789l == -1 || !NullChecker.b(PhotoAlbumPictureView.this.f2785h)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - PhotoAlbumPictureView.this.f2789l >= 200) {
                fyx.b(PhotoAlbumPictureView.this.f2789l, jCurrentTimeMillis, this.f2797a, this.f2798b);
            }
            PhotoAlbumPictureView.this.f2789l = -1L;
        }
    }

    public PhotoAlbumPictureView(Context context) {
        super(context);
        this.f2788k = -1L;
        this.f2789l = -1L;
        this.f2793p = true;
        this.f2794q = b5c0.f6083q1;
        this.f2795r = 0.0f;
        this.f2796s = 500;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m4876c(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m4879g(Object obj) {
        if (Network.isConnected(FeedModule.f313a)) {
            return;
        }
        lsi0.i(R$string.f442U, true);
    }

    private float getVideoDisplayRatio() {
        int width = getWidth();
        if (width == 0) {
            return 0.0f;
        }
        return (getHeight() * 1.0f) / width;
    }

    /* JADX INFO: renamed from: m */
    private Act m4883m() {
        return getContext();
    }

    /* JADX INFO: renamed from: n */
    private void m4884n(int i) {
        this.f2794q = i;
        for (int i2 = 0; i2 < this.f2779b.getChildCount(); i2++) {
            int id = this.f2779b.getChildAt(i2).getId();
            VFrame_ColorFilter vFrame_ColorFilter = this.f2779b;
            if (id != i) {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(4);
            } else {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private void m4885p() {
        if (this.f2783f == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f2783f = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f2783f.setId(b5c0.f5997R1);
            if (getMeasuredHeight() > 0) {
                this.f2783f.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f2783f.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            addViewInLayout(this.f2783f, 1, generateDefaultLayoutParams(), true);
            this.f2783f.getLayoutParams().height = -1;
            this.f2783f.getLayoutParams().width = -1;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m4886u(View view, boolean z) {
        if (view instanceof PhotoAlbumPictureView) {
            if (z) {
                ((PhotoAlbumPictureView) view).m4890o(true);
            } else {
                ((PhotoAlbumPictureView) view).m4894t();
            }
        }
        if (!(view instanceof ViewGroup)) {
            return;
        }
        int i = 0;
        while (true) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (i >= viewGroup.getChildCount()) {
                return;
            }
            m4886u(viewGroup.getChildAt(i), z);
            i++;
        }
    }

    /* JADX INFO: renamed from: d */
    public void m4887d() {
        VFrame_ColorFilter vFrame_ColorFilter;
        if (m4883m() == null || m4883m().isFinishing() || (vFrame_ColorFilter = this.f2779b) == null) {
            return;
        }
        vFrame_ColorFilter.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (NullChecker.a(this.f2783f) && this.f2783f.getAlpha() != 0.0f) {
            this.f2783f.animate().alpha(0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).start();
        }
        m4884n(b5c0.f6083q1);
        if (NullChecker.a(this.f2784g)) {
            this.f2784g.d();
        }
        if (NullChecker.a(this.f2790m)) {
            this.f2790m.m2658g();
        }
    }

    /* JADX INFO: renamed from: h */
    public void m4888h() {
        m4884n(b5c0.f5966H0);
        if (NullChecker.a(this.f2784g)) {
            this.f2784g.h();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m4889l(View view) {
        pa70.m12951a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public void m4890o(boolean z) {
        if (NullChecker.a(this.f2783f)) {
            this.f2783f.i(z);
            this.f2783f.animate().cancel();
            this.f2783f.setAlpha(0.0f);
            this.f2783f.setVisibility(4);
        }
        qib0.G.o(this.f2778a);
        this.f2778a.setVisibility(0);
        m4884n(b5c0.f6083q1);
        this.f2779b.animate().cancel();
        this.f2779b.setAlpha(1.0f);
        this.f2783f = null;
        if (NullChecker.b(this.f2778a) && NullChecker.b(this.f2785h)) {
            qib0.G.L0(this.f2778a, this.f2785h.cover().url);
            xdl0.M(this.f2779b, this.f2785h instanceof Video);
        }
        if (NullChecker.a(this.f2790m)) {
            this.f2790m.m2658g();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (xdl0.O0(this.f2779b)) {
            int i = this.f2794q;
            if (i == b5c0.f6083q1) {
                if (this.f2793p) {
                    this.f2793p = false;
                }
                m4895v();
            } else if (i == b5c0.f6056i1) {
                m4894t();
            } else if (i == b5c0.f5966H0) {
                m4894t();
            }
        }
    }

    public void onComplete() {
        this.f2783f.v();
        this.f2779b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        onPause();
        this.f2783f.animate().alpha(0.0f).setDuration(600L).setInterpolator(new LinearInterpolator()).start();
        postDelayed(new Runnable() { // from class: l.na70
            @Override // java.lang.Runnable
            public final void run() {
                this.f10726a.m4891q();
            }
        }, 400L);
        if (NullChecker.a(this.f2784g)) {
            this.f2784g.onComplete();
        }
        if (NullChecker.a(this.f2791n)) {
            this.f2791n.call();
        }
        this.f2793p = true;
    }

    public void onError(int i, int i2) {
        CrashHelper.d(new Throwable("PhotoAlbumPictureView play video error " + this.f2786i + " " + i + " " + i2), 100);
        if (NullChecker.a(this.f2784g)) {
            this.f2784g.onError(i, i2);
        }
        if (NullChecker.a(this.f2790m)) {
            this.f2790m.m2658g();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m4889l(this);
    }

    public void onPause() {
        m4884n(b5c0.f6083q1);
        if (NullChecker.a(this.f2784g)) {
            this.f2784g.onPause();
        }
        if (NullChecker.a(this.f2790m)) {
            this.f2790m.m2658g();
        }
        this.f2793p = false;
    }

    public void onResume() {
        this.f2779b.animate().alpha(this.f2795r).setDuration(this.f2796s).start();
        m4884n(b5c0.f6056i1);
        if (NullChecker.a(this.f2784g)) {
            this.f2784g.onResume();
        }
        if (NullChecker.a(this.f2790m)) {
            this.f2790m.m2657f();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m4891q() {
        if (NullChecker.a(this.f2783f)) {
            this.f2783f.v();
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m4892r(String str, int i, Integer num) {
        fyx.d(this.f2788k, num.intValue(), str, i);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m4893s(Music music) {
        m4883m().startActivity(MusicAggregateAct.m1982k2(getContext(), music));
    }

    public void setOnCompleteAction(d30 d30Var) {
        this.f2791n = d30Var;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (xdl0.S(f)) {
            return;
        }
        if (NullChecker.a(this.f2779b) && this.f2779b.getVisibility() == 0) {
            float f2 = -this.f2779b.getLeft();
            if (this.f2779b.getPivotX() != f2) {
                this.f2779b.setPivotX(f2);
            }
            this.f2779b.setScaleX(1.0f / f);
        }
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (xdl0.S(f)) {
            return;
        }
        if (NullChecker.a(this.f2779b) && this.f2779b.getVisibility() == 0) {
            float height = getHeight() - this.f2779b.getTop();
            if (this.f2779b.getPivotY() != height) {
                this.f2779b.setPivotY(height);
            }
            this.f2779b.setScaleY(1.0f / f);
        }
        super.setScaleY(f);
    }

    /* JADX INFO: renamed from: t */
    public void m4894t() {
        if (NullChecker.a(this.f2783f)) {
            this.f2779b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f2779b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f2783f.r();
            if (NullChecker.a(this.f2790m)) {
                this.f2790m.m2658g();
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m4895v() {
        if (c.i != m4883m().lifecycle_()) {
            return;
        }
        this.f2779b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        Media media = this.f2785h;
        if (media instanceof Video) {
            Video videoMo17714clone = (Video) media;
            m4885p();
            m4896w(this.f2792o);
            if (videoMo17714clone.size == null && TEnum.equals(videoMo17714clone.status, MediaLocalStatus.raw)) {
                videoMo17714clone = videoMo17714clone.mo17714clone();
                s5l0 s5l0Var = new s5l0(new r5l0(rhi.z(videoMo17714clone.url)), this.f2787j, false);
                videoMo17714clone.mediaType = "video/mp4";
                videoMo17714clone.size = new Dimension(s5l0Var.m());
                videoMo17714clone.duration = s5l0Var.b;
            }
            float videoDisplayRatio = getVideoDisplayRatio();
            final String square = this.f2787j ? videoMo17714clone.formatSquare() : videoMo17714clone.formatAspectRatio();
            boolean zM14720e = u2h.m14720e();
            this.f2788k = System.currentTimeMillis();
            final int i = fyx.a;
            this.f2783f.setIsInABGroup(zM14720e);
            this.f2783f.setOnBufferListener(new C2123a(square, i));
            this.f2783f.setNetErrorListener(new e30() { // from class: l.ja70
                public final void call(Object obj) {
                    PhotoAlbumPictureView.m4879g(obj);
                }
            });
            this.f2783f.w((VTexturePlayer.a) null, rx.c.fromCallable(new Callable() { // from class: l.ka70
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(x1l0.n().u(square));
                }
            }).compose(mkd0.C()), videoMo17714clone.duration);
            this.f2783f.s(Uri.parse(qib0.d0(square)), videoDisplayRatio, square, (zM14720e || !videoMo17714clone.url.startsWith("http") || Network.isConnected(FeedModule.f313a)) ? false : true, R$string.f442U, R$string.f327A4);
            x1l0.n().q(square).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.la70
                public final void call(Object obj) {
                    this.f9972a.m4892r(square, i, (Integer) obj);
                }
            }, new e30() { // from class: l.ma70
                public final void call(Object obj) {
                    PhotoAlbumPictureView.m4876c((Throwable) obj);
                }
            }));
            eb1.m9689b(null, 1);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m4896w(Moment moment) {
        final Music music;
        if ((NullChecker.a(moment) && moment.isAnonymousMoment()) || NullChecker.a(this.f2790m)) {
            return;
        }
        Media media = this.f2785h;
        if (!(media instanceof Video) || (music = ((Video) media).music) == null || TextUtils.isEmpty(music.f242id)) {
            return;
        }
        RotatingDiscView rotatingDiscView = (RotatingDiscView) m4883m().inflater().inflate(o6c0.f11345y5, (ViewGroup) this, false);
        this.f2790m = rotatingDiscView;
        addView(rotatingDiscView);
        this.f2790m.m2656e(music.cover);
        this.f2790m.m2655d(new d30() { // from class: l.oa70
            public final void call() {
                this.f11402a.m4893s(music);
            }
        });
    }

    /* JADX INFO: renamed from: y */
    public void m4897y() {
        this.f2783f.setVisibility(0);
        if (this.f2783f.getAlpha() < 1.0f) {
            this.f2783f.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
        this.f2779b.animate().alpha(this.f2795r).setDuration(this.f2796s).setInterpolator(new LinearInterpolator()).start();
        m4884n(b5c0.f6056i1);
        if (NullChecker.a(this.f2784g)) {
            this.f2784g.y();
        }
        if (NullChecker.a(this.f2790m)) {
            this.f2790m.m2657f();
        }
        this.f2793p = false;
    }

    public PhotoAlbumPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2788k = -1L;
        this.f2789l = -1L;
        this.f2793p = true;
        this.f2794q = b5c0.f6083q1;
        this.f2795r = 0.0f;
        this.f2796s = 500;
    }

    public PhotoAlbumPictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2788k = -1L;
        this.f2789l = -1L;
        this.f2793p = true;
        this.f2794q = b5c0.f6083q1;
        this.f2795r = 0.0f;
        this.f2796s = 500;
    }
}
