package com.p051p1.mobile.putong.feed.newui.photoalbum;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Music;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.camera.MusicAggregateAct;
import com.p051p1.mobile.putong.feed.newui.camera.widget.RotatingDiscView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame_ColorFilter;
import p151v.VProgressBar;
import p151v.VTexturePlayer;
import p153l.bnl0;
import p153l.c7y;
import p153l.cbl0;
import p153l.hdc0;
import p153l.j4h;
import p153l.lb1;
import p153l.o1j0;
import p153l.oki;
import p153l.psd0;
import p153l.tec0;
import p153l.uqb0;
import p153l.vel0;
import p153l.vi70;
import p153l.wel0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class PhotoAlbumPictureView extends FrameLayout implements View.OnClickListener, VTexturePlayer.InterfaceC22698b {

    /* JADX INFO: renamed from: a */
    public VDraweeView f42165a;

    /* JADX INFO: renamed from: b */
    public VFrame_ColorFilter f42166b;

    /* JADX INFO: renamed from: c */
    public ImageView f42167c;

    /* JADX INFO: renamed from: d */
    public VProgressBar f42168d;

    /* JADX INFO: renamed from: e */
    public ImageView f42169e;

    /* JADX INFO: renamed from: f */
    public VTexturePlayer f42170f;

    /* JADX INFO: renamed from: g */
    public VTexturePlayer.InterfaceC22698b f42171g;

    /* JADX INFO: renamed from: h */
    public Media f42172h;

    /* JADX INFO: renamed from: i */
    public boolean f42173i;

    /* JADX INFO: renamed from: j */
    public boolean f42174j;

    /* JADX INFO: renamed from: k */
    public long f42175k;

    /* JADX INFO: renamed from: l */
    public long f42176l;

    /* JADX INFO: renamed from: m */
    public RotatingDiscView f42177m;

    /* JADX INFO: renamed from: n */
    public x20 f42178n;

    /* JADX INFO: renamed from: o */
    public Moment f42179o;

    /* JADX INFO: renamed from: p */
    public boolean f42180p;

    /* JADX INFO: renamed from: q */
    public int f42181q;

    /* JADX INFO: renamed from: r */
    public float f42182r;

    /* JADX INFO: renamed from: s */
    public int f42183s;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.PhotoAlbumPictureView$a */
    public class C11442a implements VTexturePlayer.InterfaceC22699c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f42184a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f42185b;

        public C11442a(String str, int i) {
            this.f42184a = str;
            this.f42185b = i;
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: O */
        public void mo37132O() {
            PhotoAlbumPictureView.this.f42176l = System.currentTimeMillis();
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: a */
        public void mo37133a() {
            c7y.m108344c(PhotoAlbumPictureView.this.f42175k, System.currentTimeMillis(), this.f42184a, this.f42185b);
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: b */
        public void mo37134b(int i, int i2) {
            c7y.m108346e(i, i2, !Network.isConnected(FeedModule.f39700a), this.f42184a, this.f42185b);
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: c */
        public void mo37135c(long j) {
            if (PhotoAlbumPictureView.this.f42176l == -1 || !NullChecker.m82487b(PhotoAlbumPictureView.this.f42172h)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - PhotoAlbumPictureView.this.f42176l >= 200) {
                c7y.m108343b(PhotoAlbumPictureView.this.f42176l, jCurrentTimeMillis, this.f42184a, this.f42185b);
            }
            PhotoAlbumPictureView.this.f42176l = -1L;
        }
    }

    public PhotoAlbumPictureView(Context context) {
        super(context);
        this.f42175k = -1L;
        this.f42176l = -1L;
        this.f42180p = true;
        this.f42181q = hdc0.f108955q1;
        this.f42182r = 0.0f;
        this.f42183s = 500;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m65032c(Throwable th) {
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m65035g(Object obj) {
        if (Network.isConnected(FeedModule.f39700a)) {
            return;
        }
        o1j0.m165635i(R$string.f39829U, true);
    }

    private float getVideoDisplayRatio() {
        int width = getWidth();
        if (width == 0) {
            return 0.0f;
        }
        return (getHeight() * 1.0f) / width;
    }

    /* JADX INFO: renamed from: m */
    private Act m65039m() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: n */
    private void m65040n(int i) {
        this.f42181q = i;
        for (int i2 = 0; i2 < this.f42166b.getChildCount(); i2++) {
            int id = this.f42166b.getChildAt(i2).getId();
            VFrame_ColorFilter vFrame_ColorFilter = this.f42166b;
            if (id != i) {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(4);
            } else {
                vFrame_ColorFilter.getChildAt(i2).setVisibility(0);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private void m65041p() {
        if (this.f42170f == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(getContext(), this);
            this.f42170f = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f42170f.setId(hdc0.f108869R1);
            if (getMeasuredHeight() > 0) {
                this.f42170f.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                this.f42170f.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
            addViewInLayout(this.f42170f, 1, generateDefaultLayoutParams(), true);
            this.f42170f.getLayoutParams().height = -1;
            this.f42170f.getLayoutParams().width = -1;
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m65042u(View view, boolean z) {
        if (view instanceof PhotoAlbumPictureView) {
            if (z) {
                ((PhotoAlbumPictureView) view).m65044o(true);
            } else {
                ((PhotoAlbumPictureView) view).m65048t();
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
            m65042u(viewGroup.getChildAt(i), z);
            i++;
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: d */
    public void mo37119d() {
        VFrame_ColorFilter vFrame_ColorFilter;
        if (m65039m() == null || m65039m().isFinishing() || (vFrame_ColorFilter = this.f42166b) == null) {
            return;
        }
        vFrame_ColorFilter.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        if (NullChecker.m82486a(this.f42170f) && this.f42170f.getAlpha() != 0.0f) {
            this.f42170f.animate().alpha(0.0f).setDuration(400L).setInterpolator(new LinearInterpolator()).start();
        }
        m65040n(hdc0.f108955q1);
        if (NullChecker.m82486a(this.f42171g)) {
            this.f42171g.mo37119d();
        }
        if (NullChecker.m82486a(this.f42177m)) {
            this.f42177m.m62890g();
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: h */
    public void mo37120h() {
        m65040n(hdc0.f108838H0);
        if (NullChecker.m82486a(this.f42171g)) {
            this.f42171g.mo37120h();
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m65043l(View view) {
        vi70.m201332a(this, view);
    }

    /* JADX INFO: renamed from: o */
    public void m65044o(boolean z) {
        if (NullChecker.m82486a(this.f42170f)) {
            this.f42170f.m224544i(z);
            this.f42170f.animate().cancel();
            this.f42170f.setAlpha(0.0f);
            this.f42170f.setVisibility(4);
        }
        uqb0.f180374G.m98798o(this.f42165a);
        this.f42165a.setVisibility(0);
        m65040n(hdc0.f108955q1);
        this.f42166b.animate().cancel();
        this.f42166b.setAlpha(1.0f);
        this.f42170f = null;
        if (NullChecker.m82487b(this.f42165a) && NullChecker.m82487b(this.f42172h)) {
            uqb0.f180374G.m127115L0(this.f42165a, this.f42172h.cover().url);
            bnl0.m105524M(this.f42166b, this.f42172h instanceof Video);
        }
        if (NullChecker.m82486a(this.f42177m)) {
            this.f42177m.m62890g();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (bnl0.m105529O0(this.f42166b)) {
            int i = this.f42181q;
            if (i == hdc0.f108955q1) {
                if (this.f42180p) {
                    this.f42180p = false;
                }
                m65049v();
            } else if (i == hdc0.f108928i1) {
                m65048t();
            } else if (i == hdc0.f108838H0) {
                m65048t();
            }
        }
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onComplete() {
        this.f42170f.m224557v();
        this.f42166b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        onPause();
        this.f42170f.animate().alpha(0.0f).setDuration(600L).setInterpolator(new LinearInterpolator()).start();
        postDelayed(new Runnable() { // from class: l.ti70
            @Override // java.lang.Runnable
            public final void run() {
                this.f174449a.m65045q();
            }
        }, 400L);
        if (NullChecker.m82486a(this.f42171g)) {
            this.f42171g.onComplete();
        }
        if (NullChecker.m82486a(this.f42178n)) {
            this.f42178n.call();
        }
        this.f42180p = true;
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onError(int i, int i2) {
        CrashHelper.m82480d(new Throwable("PhotoAlbumPictureView play video error " + this.f42173i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2), 100);
        if (NullChecker.m82486a(this.f42171g)) {
            this.f42171g.onError(i, i2);
        }
        if (NullChecker.m82486a(this.f42177m)) {
            this.f42177m.m62890g();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m65043l(this);
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onPause() {
        m65040n(hdc0.f108955q1);
        if (NullChecker.m82486a(this.f42171g)) {
            this.f42171g.onPause();
        }
        if (NullChecker.m82486a(this.f42177m)) {
            this.f42177m.m62890g();
        }
        this.f42180p = false;
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onResume() {
        this.f42166b.animate().alpha(this.f42182r).setDuration(this.f42183s).start();
        m65040n(hdc0.f108928i1);
        if (NullChecker.m82486a(this.f42171g)) {
            this.f42171g.onResume();
        }
        if (NullChecker.m82486a(this.f42177m)) {
            this.f42177m.m62889f();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m65045q() {
        if (NullChecker.m82486a(this.f42170f)) {
            this.f42170f.m224557v();
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m65046r(String str, int i, Integer num) {
        c7y.m108345d(this.f42175k, num.intValue(), str, i);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m65047s(Music music) {
        m65039m().startActivity(MusicAggregateAct.m62236l2(getContext(), music));
    }

    public void setOnCompleteAction(x20 x20Var) {
        this.f42178n = x20Var;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        if (bnl0.m105535S(f)) {
            return;
        }
        if (NullChecker.m82486a(this.f42166b) && this.f42166b.getVisibility() == 0) {
            float f2 = -this.f42166b.getLeft();
            if (this.f42166b.getPivotX() != f2) {
                this.f42166b.setPivotX(f2);
            }
            this.f42166b.setScaleX(1.0f / f);
        }
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        if (bnl0.m105535S(f)) {
            return;
        }
        if (NullChecker.m82486a(this.f42166b) && this.f42166b.getVisibility() == 0) {
            float height = getHeight() - this.f42166b.getTop();
            if (this.f42166b.getPivotY() != height) {
                this.f42166b.setPivotY(height);
            }
            this.f42166b.setScaleY(1.0f / f);
        }
        super.setScaleY(f);
    }

    /* JADX INFO: renamed from: t */
    public void m65048t() {
        if (NullChecker.m82486a(this.f42170f)) {
            this.f42166b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f42166b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
            this.f42170f.m224553r();
            if (NullChecker.m82486a(this.f42177m)) {
                this.f42177m.m62890g();
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m65049v() {
        if (C4470c.f16267i != m65039m().lifecycle_()) {
            return;
        }
        this.f42166b.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        Media media = this.f42172h;
        if (media instanceof Video) {
            Video videoMo225055clone = (Video) media;
            m65041p();
            m65050w(this.f42179o);
            if (videoMo225055clone.size == null && TEnum.equals(videoMo225055clone.status, "raw")) {
                videoMo225055clone = videoMo225055clone.mo225055clone();
                wel0 wel0Var = new wel0(new vel0(oki.m168038z(videoMo225055clone.url)), this.f42174j, false);
                videoMo225055clone.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4;
                videoMo225055clone.size = new Dimension(wel0Var.m206021m());
                videoMo225055clone.duration = wel0Var.f188702b;
            }
            float videoDisplayRatio = getVideoDisplayRatio();
            final String square = this.f42174j ? videoMo225055clone.formatSquare() : videoMo225055clone.formatAspectRatio();
            boolean zM143421e = j4h.m143421e();
            this.f42175k = System.currentTimeMillis();
            final int i = c7y.f80160a;
            this.f42170f.setIsInABGroup(zM143421e);
            this.f42170f.setOnBufferListener(new C11442a(square, i));
            this.f42170f.setNetErrorListener(new y20() { // from class: l.pi70
                @Override // p153l.y20
                public final void call(Object obj) {
                    PhotoAlbumPictureView.m65035g(obj);
                }
            });
            this.f42170f.m224558w(null, C22421c.fromCallable(new Callable() { // from class: l.qi70
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(cbl0.m108642n().m108651u(square));
                }
            }).compose(psd0.m173592C()), videoMo225055clone.duration);
            this.f42170f.m224554s(Uri.parse(uqb0.m197266d0(square)), videoDisplayRatio, square, (zM143421e || !videoMo225055clone.url.startsWith("http") || Network.isConnected(FeedModule.f39700a)) ? false : true, R$string.f39829U, R$string.f39714A4);
            cbl0.m108642n().m108649q(square).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.ri70
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f163342a.m65046r(square, i, (Integer) obj);
                }
            }, new y20() { // from class: l.si70
                @Override // p153l.y20
                public final void call(Object obj) {
                    PhotoAlbumPictureView.m65032c((Throwable) obj);
                }
            }));
            lb1.m153552b(null, 1);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m65050w(Moment moment) {
        final Music music;
        if ((NullChecker.m82486a(moment) && moment.isAnonymousMoment()) || NullChecker.m82486a(this.f42177m)) {
            return;
        }
        Media media = this.f42172h;
        if (!(media instanceof Video) || (music = ((Video) media).music) == null || TextUtils.isEmpty(music.f39629id)) {
            return;
        }
        RotatingDiscView rotatingDiscView = (RotatingDiscView) m65039m().inflater().inflate(tec0.f173795y5, (ViewGroup) this, false);
        this.f42177m = rotatingDiscView;
        addView(rotatingDiscView);
        this.f42177m.m62888e(music.cover);
        this.f42177m.m62887d(new x20() { // from class: l.ui70
            @Override // p153l.x20
            public final void call() {
                this.f179081a.m65047s(music);
            }
        });
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: y */
    public void mo37130y() {
        this.f42170f.setVisibility(0);
        if (this.f42170f.getAlpha() < 1.0f) {
            this.f42170f.animate().alpha(1.0f).setDuration(200L).setInterpolator(new LinearInterpolator()).start();
        }
        this.f42166b.animate().alpha(this.f42182r).setDuration(this.f42183s).setInterpolator(new LinearInterpolator()).start();
        m65040n(hdc0.f108928i1);
        if (NullChecker.m82486a(this.f42171g)) {
            this.f42171g.mo37130y();
        }
        if (NullChecker.m82486a(this.f42177m)) {
            this.f42177m.m62889f();
        }
        this.f42180p = false;
    }

    public PhotoAlbumPictureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42175k = -1L;
        this.f42176l = -1L;
        this.f42180p = true;
        this.f42181q = hdc0.f108955q1;
        this.f42182r = 0.0f;
        this.f42183s = 500;
    }

    public PhotoAlbumPictureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42175k = -1L;
        this.f42176l = -1L;
        this.f42180p = true;
        this.f42181q = hdc0.f108955q1;
        this.f42182r = 0.0f;
        this.f42183s = 500;
    }
}
