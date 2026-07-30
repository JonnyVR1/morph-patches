package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Music;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.camera.MusicAggregateAct;
import com.p046p1.mobile.putong.feed.newui.camera.widget.RotatingDiscView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VProgressBar;
import p147v.VTexturePlayer;
import p149l.b5c0;
import p149l.d30;
import p149l.e30;
import p149l.eb1;
import p149l.fyx;
import p149l.lsi0;
import p149l.mkd0;
import p149l.o6c0;
import p149l.pa70;
import p149l.qib0;
import p149l.r5l0;
import p149l.rhi;
import p149l.s5l0;
import p149l.u2h;
import p149l.x1l0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class PhotoAlbumPictureView extends FrameLayout implements View.OnClickListener, VTexturePlayer.InterfaceC22583b {

    /* JADX INFO: renamed from: a */
    public VDraweeView f41317a;

    /* JADX INFO: renamed from: b */
    public VFrame_ColorFilter f41318b;

    /* JADX INFO: renamed from: c */
    public ImageView f41319c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f41320d;

    /* JADX INFO: renamed from: e */
    public ImageView f41321e;

    /* JADX INFO: renamed from: f */
    public VTexturePlayer f41322f;

    /* JADX INFO: renamed from: g */
    public VTexturePlayer.InterfaceC22583b f41323g;

    /* JADX INFO: renamed from: h */
    public Media f41324h;

    /* JADX INFO: renamed from: i */
    public boolean f41325i;

    /* JADX INFO: renamed from: j */
    public boolean f41326j;

    /* JADX INFO: renamed from: k */
    public long f41327k;

    /* JADX INFO: renamed from: l */
    public long f41328l;

    /* JADX INFO: renamed from: m */
    public RotatingDiscView f41329m;

    /* JADX INFO: renamed from: n */
    public d30 f41330n;

    /* JADX INFO: renamed from: o */
    public Moment f41331o;

    /* JADX INFO: renamed from: p */
    public boolean f41332p;

    /* JADX INFO: renamed from: q */
    public int f41333q;

    /* JADX INFO: renamed from: r */
    public float f41334r;

    /* JADX INFO: renamed from: s */
    public int f41335s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView$a */
    public class C11279a implements VTexturePlayer.InterfaceC22584c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f41336a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f41337b;

        public C11279a(String str, int i) {
            this.f41336a = str;
            this.f41337b = i;
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: O */
        public void mo36129O() {
            PhotoAlbumPictureView.this.f41328l = System.currentTimeMillis();
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: a */
        public void mo36130a() {
            fyx.m123809c(PhotoAlbumPictureView.this.f41327k, System.currentTimeMillis(), this.f41336a, this.f41337b);
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: b */
        public void mo36131b(int i, int i2) {
            fyx.m123811e(i, i2, !Network.isConnected(FeedModule.f38852a), this.f41336a, this.f41337b);
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: c */
        public void mo36132c(long j) {
            if (PhotoAlbumPictureView.this.f41328l == -1 || !NullChecker.m81304b(PhotoAlbumPictureView.this.f41324h)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - PhotoAlbumPictureView.this.f41328l >= 200) {
                fyx.m123808b(PhotoAlbumPictureView.this.f41328l, jCurrentTimeMillis, this.f41336a, this.f41337b);
            }
            PhotoAlbumPictureView.this.f41328l = -1L;
        }
    }

    public PhotoAlbumPictureView(Context context) {
        super(context);
        this.f41327k = -1L;
        this.f41328l = -1L;
        this.f41332p = true;
        this.f41333q = b5c0.f73602q1;
        this.f41334r = 0.0f;
        this.f41335s = 500;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m63849c(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m63852g(Object obj) {
        if (Network.isConnected(FeedModule.f38852a)) {
            return;
        }
        lsi0.m151579i(R$string.f38981U, true);
    }

    private float getVideoDisplayRatio() {
        int width = getWidth();
        if (width == 0) {
            return 0.0f;
        }
        return (getHeight() * 1.0f) / width;
    }

    /* JADX INFO: renamed from: m */
    private Act m63856m() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: n */
    private void m63857n(int i) {
        this.f41333q = i;
        for (int i2 = 0; i2 < this.f41318b.getChildCount(); i2++) {
            int id = this.f41318b.getChildAt(i2).getId();
            VFrame_ColorFilter vFrame_ColorFilter = this.f41318b;
            if (id != i) {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(4);
            } else {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private void m63858p() {
        if (this.f41322f == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f41322f = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f41322f.setId(b5c0.f73516R1);
            if (getMeasuredHeight() > 0) {
                this.f41322f.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f41322f.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            addViewInLayout(this.f41322f, 1, generateDefaultLayoutParams(), true);
            this.f41322f.getLayoutParams().height = -1;
            this.f41322f.getLayoutParams().width = -1;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m63859u(View view, boolean z) {
        if (view instanceof PhotoAlbumPictureView) {
            if (z) {
                ((PhotoAlbumPictureView) view).m63861o(true);
            } else {
                ((PhotoAlbumPictureView) view).m63865t();
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
            m63859u(viewGroup.getChildAt(i), z);
            i++;
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: d */
    public void mo36116d() {
        VFrame_ColorFilter vFrame_ColorFilter;
        if (m63856m() == null || m63856m().isFinishing() || (vFrame_ColorFilter = this.f41318b) == null) {
            return;
        }
        vFrame_ColorFilter.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (NullChecker.m81303a(this.f41322f) && this.f41322f.getAlpha() != 0.0f) {
            this.f41322f.animate().alpha(0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).start();
        }
        m63857n(b5c0.f73602q1);
        if (NullChecker.m81303a(this.f41323g)) {
            this.f41323g.mo36116d();
        }
        if (NullChecker.m81303a(this.f41329m)) {
            this.f41329m.m61706g();
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: h */
    public void mo36117h() {
        m63857n(b5c0.f73485H0);
        if (NullChecker.m81303a(this.f41323g)) {
            this.f41323g.mo36117h();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m63860l(View view) {
        pa70.m168082a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public void m63861o(boolean z) {
        if (NullChecker.m81303a(this.f41322f)) {
            this.f41322f.m223298i(z);
            this.f41322f.animate().cancel();
            this.f41322f.setAlpha(0.0f);
            this.f41322f.setVisibility(4);
        }
        qib0.f154691G.m184725o(this.f41317a);
        this.f41317a.setVisibility(0);
        m63857n(b5c0.f73602q1);
        this.f41318b.animate().cancel();
        this.f41318b.setAlpha(1.0f);
        this.f41322f = null;
        if (NullChecker.m81304b(this.f41317a) && NullChecker.m81304b(this.f41324h)) {
            qib0.f154691G.m102331L0(this.f41317a, this.f41324h.cover().url);
            xdl0.m208344M(this.f41318b, this.f41324h instanceof Video);
        }
        if (NullChecker.m81303a(this.f41329m)) {
            this.f41329m.m61706g();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (xdl0.m208349O0(this.f41318b)) {
            int i = this.f41333q;
            if (i == b5c0.f73602q1) {
                if (this.f41332p) {
                    this.f41332p = false;
                }
                m63866v();
            } else if (i == b5c0.f73575i1) {
                m63865t();
            } else if (i == b5c0.f73485H0) {
                m63865t();
            }
        }
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onComplete() {
        this.f41322f.m223311v();
        this.f41318b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        onPause();
        this.f41322f.animate().alpha(0.0f).setDuration(600L).setInterpolator(new LinearInterpolator()).start();
        postDelayed(new Runnable() { // from class: l.na70
            @Override // java.lang.Runnable
            public final void run() {
                this.f137863a.m63862q();
            }
        }, 400L);
        if (NullChecker.m81303a(this.f41323g)) {
            this.f41323g.onComplete();
        }
        if (NullChecker.m81303a(this.f41330n)) {
            this.f41330n.call();
        }
        this.f41332p = true;
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onError(int i, int i2) {
        CrashHelper.m81297d(new Throwable("PhotoAlbumPictureView play video error " + this.f41325i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2), 100);
        if (NullChecker.m81303a(this.f41323g)) {
            this.f41323g.onError(i, i2);
        }
        if (NullChecker.m81303a(this.f41329m)) {
            this.f41329m.m61706g();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m63860l(this);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onPause() {
        m63857n(b5c0.f73602q1);
        if (NullChecker.m81303a(this.f41323g)) {
            this.f41323g.onPause();
        }
        if (NullChecker.m81303a(this.f41329m)) {
            this.f41329m.m61706g();
        }
        this.f41332p = false;
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onResume() {
        this.f41318b.animate().alpha(this.f41334r).setDuration(this.f41335s).start();
        m63857n(b5c0.f73575i1);
        if (NullChecker.m81303a(this.f41323g)) {
            this.f41323g.onResume();
        }
        if (NullChecker.m81303a(this.f41329m)) {
            this.f41329m.m61705f();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m63862q() {
        if (NullChecker.m81303a(this.f41322f)) {
            this.f41322f.m223311v();
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m63863r(String str, int i, Integer num) {
        fyx.m123810d(this.f41327k, num.intValue(), str, i);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m63864s(Music music) {
        m63856m().startActivity(MusicAggregateAct.m61052k2(getContext(), music));
    }

    public void setOnCompleteAction(d30 d30Var) {
        this.f41330n = d30Var;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (xdl0.m208355S(f)) {
            return;
        }
        if (NullChecker.m81303a(this.f41318b) && this.f41318b.getVisibility() == 0) {
            float f2 = -this.f41318b.getLeft();
            if (this.f41318b.getPivotX() != f2) {
                this.f41318b.setPivotX(f2);
            }
            this.f41318b.setScaleX(1.0f / f);
        }
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (xdl0.m208355S(f)) {
            return;
        }
        if (NullChecker.m81303a(this.f41318b) && this.f41318b.getVisibility() == 0) {
            float height = getHeight() - this.f41318b.getTop();
            if (this.f41318b.getPivotY() != height) {
                this.f41318b.setPivotY(height);
            }
            this.f41318b.setScaleY(1.0f / f);
        }
        super.setScaleY(f);
    }

    /* JADX INFO: renamed from: t */
    public void m63865t() {
        if (NullChecker.m81303a(this.f41322f)) {
            this.f41318b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f41318b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f41322f.m223307r();
            if (NullChecker.m81303a(this.f41329m)) {
                this.f41329m.m61706g();
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m63866v() {
        if (C4319c.f15548i != m63856m().lifecycle_()) {
            return;
        }
        this.f41318b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        Media media = this.f41324h;
        if (media instanceof Video) {
            Video videoMo223809clone = (Video) media;
            m63858p();
            m63867w(this.f41331o);
            if (videoMo223809clone.size == null && TEnum.equals(videoMo223809clone.status, "raw")) {
                videoMo223809clone = videoMo223809clone.mo223809clone();
                s5l0 s5l0Var = new s5l0(new r5l0(rhi.m179382z(videoMo223809clone.url)), this.f41326j, false);
                videoMo223809clone.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
                videoMo223809clone.size = new Dimension(s5l0Var.m182364m());
                videoMo223809clone.duration = s5l0Var.f162561b;
            }
            float videoDisplayRatio = getVideoDisplayRatio();
            final String square = this.f41326j ? videoMo223809clone.formatSquare() : videoMo223809clone.formatAspectRatio();
            boolean zM191496e = u2h.m191496e();
            this.f41327k = System.currentTimeMillis();
            final int i = fyx.f99914a;
            this.f41322f.setIsInABGroup(zM191496e);
            this.f41322f.setOnBufferListener(new C11279a(square, i));
            this.f41322f.setNetErrorListener(new e30() { // from class: l.ja70
                @Override // p149l.e30
                public final void call(Object obj) {
                    PhotoAlbumPictureView.m63852g(obj);
                }
            });
            this.f41322f.m223312w(null, C22306c.fromCallable(new Callable() { // from class: l.ka70
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(x1l0.m206744n().m206753u(square));
                }
            }).compose(mkd0.m154951C()), videoMo223809clone.duration);
            this.f41322f.m223308s(Uri.parse(qib0.m174812d0(square)), videoDisplayRatio, square, (zM191496e || !videoMo223809clone.url.startsWith("http") || Network.isConnected(FeedModule.f38852a)) ? false : true, R$string.f38981U, R$string.f38866A4);
            x1l0.m206744n().m206751q(square).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.la70
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f127169a.m63863r(square, i, (Integer) obj);
                }
            }, new e30() { // from class: l.ma70
                @Override // p149l.e30
                public final void call(Object obj) {
                    PhotoAlbumPictureView.m63849c((Throwable) obj);
                }
            }));
            eb1.m115447b(null, 1);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m63867w(Moment moment) {
        final Music music;
        if ((NullChecker.m81303a(moment) && moment.isAnonymousMoment()) || NullChecker.m81303a(this.f41329m)) {
            return;
        }
        Media media = this.f41324h;
        if (!(media instanceof Video) || (music = ((Video) media).music) == null || TextUtils.isEmpty(music.f38781id)) {
            return;
        }
        RotatingDiscView rotatingDiscView = (RotatingDiscView) m63856m().inflater().inflate(o6c0.f142326y5, (ViewGroup) this, false);
        this.f41329m = rotatingDiscView;
        addView(rotatingDiscView);
        this.f41329m.m61704e(music.cover);
        this.f41329m.m61703d(new d30() { // from class: l.oa70
            @Override // p149l.d30
            public final void call() {
                this.f142782a.m63864s(music);
            }
        });
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: y */
    public void mo36127y() {
        this.f41322f.setVisibility(0);
        if (this.f41322f.getAlpha() < 1.0f) {
            this.f41322f.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
        this.f41318b.animate().alpha(this.f41334r).setDuration(this.f41335s).setInterpolator(new LinearInterpolator()).start();
        m63857n(b5c0.f73575i1);
        if (NullChecker.m81303a(this.f41323g)) {
            this.f41323g.mo36127y();
        }
        if (NullChecker.m81303a(this.f41329m)) {
            this.f41329m.m61705f();
        }
        this.f41332p = false;
    }

    public PhotoAlbumPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f41327k = -1L;
        this.f41328l = -1L;
        this.f41332p = true;
        this.f41333q = b5c0.f73602q1;
        this.f41334r = 0.0f;
        this.f41335s = 500;
    }

    public PhotoAlbumPictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f41327k = -1L;
        this.f41328l = -1L;
        this.f41332p = true;
        this.f41333q = b5c0.f73602q1;
        this.f41334r = 0.0f;
        this.f41335s = 500;
    }
}
