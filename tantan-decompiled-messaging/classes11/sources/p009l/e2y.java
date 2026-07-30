package p009l;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.p000p1.mobile.putong.util.TrackMediaUploadUtil;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.api.api.Network;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p1.mobile.putong.core.businessdata.meet.MeetFeedItemData;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import l.b3c0;
import l.c4g0;
import l.e30;
import l.f2y;
import l.lsi0;
import l.mkd0;
import l.o7m;
import l.qib0;
import l.ura;
import l.w9j;
import l.x1l0;
import l.x4c0;
import l.xdl0;
import v.VDraweeView;
import v.VFrame_ColorFilter;
import v.VImage;
import v.VProgressBar;
import v.VTexturePlayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class e2y implements kwl, VTexturePlayer.b, o7m {

    /* JADX INFO: renamed from: a */
    public FrameLayout f12169a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f12170b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f12171c;

    /* JADX INFO: renamed from: d */
    public VFrame_ColorFilter f12172d;

    /* JADX INFO: renamed from: e */
    public VImage f12173e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f12174f;

    /* JADX INFO: renamed from: g */
    public ProgressBar f12175g;

    /* JADX INFO: renamed from: h */
    public VImage f12176h;

    /* JADX INFO: renamed from: i */
    public Video f12177i;

    /* JADX INFO: renamed from: j */
    public VTexturePlayer f12178j;

    /* JADX INFO: renamed from: k */
    public boolean f12179k;

    /* JADX INFO: renamed from: l */
    public long f12180l = -1;

    /* JADX INFO: renamed from: m */
    public long f12181m = -1;

    /* JADX INFO: renamed from: n */
    public c4g0 f12182n;

    /* JADX INFO: renamed from: o */
    public c4g0 f12183o;

    /* JADX INFO: renamed from: p */
    public c4g0 f12184p;

    /* JADX INFO: renamed from: q */
    public c4g0 f12185q;

    /* JADX INFO: renamed from: r */
    public boolean f12186r;

    /* JADX INFO: renamed from: l.e2y$a */
    public class C0869a implements VTexturePlayer.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f12187a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f12188b;

        public C0869a(String str, int i) {
            this.f12187a = str;
            this.f12188b = i;
        }

        /* JADX INFO: renamed from: O */
        public void m13697O() {
            e2y.this.f12181m = System.currentTimeMillis();
        }

        /* JADX INFO: renamed from: a */
        public void m13698a() {
            fyx.m14674c(e2y.this.f12180l, System.currentTimeMillis(), this.f12187a, this.f12188b);
            e2y.this.f12178j.setVolume(f5y.m14274f().m14282j());
            e2y.this.f12178j.setLooping(true);
        }

        /* JADX INFO: renamed from: b */
        public void m13699b(int i, int i2) {
            fyx.m14676e(i, i2, !Network.isConnected(CoreModule.b), this.f12187a, this.f12188b);
        }

        /* JADX INFO: renamed from: c */
        public void m13700c(long j) {
            if (e2y.this.f12181m == -1 || !NullChecker.a(e2y.this.f12177i)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - e2y.this.f12181m >= 200) {
                TrackMediaUploadUtil.m10661h0(jCurrentTimeMillis - e2y.this.f12181m, null, this.f12187a);
                fyx.m14673b(e2y.this.f12181m, jCurrentTimeMillis, this.f12187a, this.f12188b);
            }
            e2y.this.f12181m = -1L;
        }
    }

    /* JADX INFO: renamed from: A */
    private void m13657A(boolean z) {
        if (this.f12178j != null) {
            m13691P(z);
            this.f12178j.i(z);
            this.f12178j.animate().cancel();
            xdl0.M0(this.f12178j, false);
            xdl0.M0(this.f12170b, true);
            m13680z(x4c0.A);
            this.f12172d.setAlpha(1.0f);
            if (z) {
                this.f12178j = null;
                this.f12171c.removeAllViews();
                this.f12175g.setProgress(0);
                mkd0.z(this.f12182n);
                mkd0.z(this.f12183o);
                mkd0.z(this.f12184p);
                this.f12182n = null;
                this.f12183o = null;
                this.f12184p = null;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    private void m13658B() {
        if (this.f12178j == null && this.f12171c.getChildAt(0) != null) {
            this.f12178j = this.f12171c.getChildAt(0);
            return;
        }
        if (this.f12178j == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(this.f12171c.getContext(), this);
            this.f12178j = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f12178j.setId(x4c0.K);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            if (m13681C() < 1.0f) {
                layoutParams.height = -1;
                layoutParams.width = (this.f12177i.cover.size.width * this.f12171c.getHeight()) / this.f12177i.cover.size.height;
            } else if (m13681C() > 1.0f) {
                layoutParams.height = (this.f12177i.cover.size.height * xdl0.y0()) / this.f12177i.cover.size.width;
                layoutParams.width = -1;
            } else {
                layoutParams.height = xdl0.y0();
                layoutParams.width = xdl0.y0();
            }
            this.f12171c.addView((View) this.f12178j, (ViewGroup.LayoutParams) layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m13659F(View view) {
        VTexturePlayer vTexturePlayer = this.f12178j;
        if (vTexturePlayer == null || !vTexturePlayer.u()) {
            this.f12179k = false;
            m13689N();
        } else {
            this.f12179k = true;
            m13688M();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m13660G(View view) {
        this.f12171c.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m13661J(Boolean bool) {
        this.f12176h.setImageResource(f5y.m14274f().m14282j() ? b3c0.o1 : b3c0.p1);
        VTexturePlayer vTexturePlayer = this.f12178j;
        if (vTexturePlayer != null) {
            vTexturePlayer.setVolume(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m13664g(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m13666j(Object obj) {
        if (Network.isConnected(CoreModule.b)) {
            return;
        }
        lsi0.i(R.string.F, true);
    }

    /* JADX INFO: renamed from: z */
    private void m13680z(int i) {
        int childCount = this.f12172d.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f12172d.getChildAt(i2);
            xdl0.M0(childAt, childAt.getId() == i);
        }
    }

    /* JADX INFO: renamed from: C */
    public final float m13681C() {
        Dimension dimension = this.f12177i.size;
        int i = dimension.width;
        if (i == 0) {
            return 1.0f;
        }
        return (dimension.height * 1.0f) / i;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m13682D() {
        this.f12178j.v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m13683E(String str, int i, Integer num) {
        fyx.m14675d(this.f12180l, num.intValue(), str, i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m13684H(Media media) {
        if (media.equals(this.f12177i)) {
            return;
        }
        m13692b(false);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m13685I(c cVar) {
        if (cVar == c.j) {
            m13688M();
        } else if (cVar == c.i && f5y.m14274f().m14280d() != null && f5y.m14274f().m14280d().equals(this.f12177i)) {
            m13689N();
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Boolean m13686K(Long l2) {
        VTexturePlayer vTexturePlayer;
        return Boolean.valueOf((this.f12186r || (vTexturePlayer = this.f12178j) == null || vTexturePlayer.t == null) ? false : true);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m13687L(Long l2) {
        int currentPosition = (int) this.f12178j.t.getCurrentPosition();
        if (currentPosition > this.f12175g.getProgress() || currentPosition == 0) {
            int progress = this.f12175g.getProgress();
            ProgressBar progressBar = this.f12175g;
            if (currentPosition > progress) {
                progressBar.setProgress(currentPosition, true);
            } else {
                progressBar.setProgress(currentPosition);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m13688M() {
        VTexturePlayer vTexturePlayer = this.f12178j;
        if (vTexturePlayer == null || !vTexturePlayer.u()) {
            return;
        }
        m13691P(false);
        this.f12178j.r();
    }

    /* JADX INFO: renamed from: N */
    public void m13689N() {
        if (this.f12179k) {
            return;
        }
        VTexturePlayer vTexturePlayer = this.f12178j;
        if (vTexturePlayer == null || !vTexturePlayer.u()) {
            m13658B();
            m13690O();
            f5y.m14274f().m14283m(this.f12177i);
            f5y.m14274f().m14284o(true);
            this.f12178j.setVolume(f5y.m14274f().m14282j());
            float fM13681C = m13681C();
            Video video = this.f12177i;
            final String square = fM13681C == 1.0f ? video.formatSquare() : video.formatAspectRatio();
            boolean zU5 = CoreModule.P().a().u5();
            this.f12180l = System.currentTimeMillis();
            final int i = fyx.f13233a;
            this.f12178j.setIsInABGroup(zU5);
            this.f12178j.setOnBufferListener(new C0869a(square, i));
            this.f12178j.setNetErrorListener(new e30() { // from class: l.v1y
                public final void call(Object obj) {
                    e2y.m13666j(obj);
                }
            });
            this.f12178j.w((VTexturePlayer.a) null, rx.c.fromCallable(new Callable() { // from class: l.w1y
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(x1l0.n().u(square));
                }
            }).compose(mkd0.C()), this.f12177i.duration);
            this.f12178j.s(Uri.parse(qib0.d0(square)), fM13681C, square, (zU5 || !((Media) this.f12177i).url.startsWith("http") || Network.isConnected(CoreModule.b)) ? false : true, R.string.F, R.string.R0);
            x1l0.n().q(square).compose(mkd0.C()).subscribe(mkd0.H(new e30() { // from class: l.x1y
                public final void call(Object obj) {
                    this.f22403a.m13683E(square, i, (Integer) obj);
                }
            }, new e30() { // from class: l.y1y
                public final void call(Object obj) {
                    e2y.m13664g((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m13690O() {
        this.f12186r = false;
    }

    /* JADX INFO: renamed from: P */
    public final void m13691P(boolean z) {
        this.f12186r = true;
        f5y.m14274f().m14284o(false);
        if (z) {
            mkd0.z(this.f12185q);
            this.f12185q = null;
            this.f12175g.clearAnimation();
        }
    }

    @Override // p009l.kwl
    /* JADX INFO: renamed from: a */
    public void mo11817a(IMeetListData iMeetListData, Act act) {
        this.f12177i = (Video) ((MeetFeedItemData) iMeetListData).moment.media.get(0);
        this.f12171c.setOnClickListener(new View.OnClickListener() { // from class: l.z1y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23321a.m13659F(view);
            }
        });
        this.f12172d.setOnClickListener(new View.OnClickListener() { // from class: l.a2y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9194a.m13660G(view);
            }
        });
        this.f12175g.setMax((int) (this.f12177i.duration * 1000.0f));
        if (TEnum.equals(((Media) this.f12177i).status, "raw")) {
            qib0.G.k0(this.f12170b, ((Media) this.f12177i).url);
        } else {
            Picture.ImageUri imageUriXf = ura.e().d().Xf(this.f12177i);
            if (imageUriXf == null) {
                CrashHelper.i(new IllegalStateException("not supported yet"), "core_newmeet_video_uri", CrashHelper.ReportLevel.p6, 100);
            } else {
                qib0.G.B0(this.f12170b, imageUriXf);
            }
        }
        this.f12176h.setImageResource(f5y.m14274f().m14282j() ? b3c0.o1 : b3c0.p1);
        this.f12176h.setOnClickListener(new View.OnClickListener() { // from class: l.b2y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f5y.m14274f().m14285p(!f5y.m14274f().m14282j());
            }
        });
        if (f5y.m14274f().m14280d() != null && f5y.m14274f().m14280d().equals(this.f12177i)) {
            this.f12171c.post(new Runnable() { // from class: l.c2y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10427a.m13689N();
                }
            });
        }
        if (this.f12182n == null) {
            this.f12182n = act.duringCreated(f5y.m14274f().m14286q()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.d2y
                public final void call(Object obj) {
                    this.f10905a.m13684H((Media) obj);
                }
            }));
        }
        if (this.f12184p == null) {
            this.f12184p = act.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.r1y
                public final void call(Object obj) {
                    this.f19612a.m13685I((c) obj);
                }
            }));
        }
        this.f12183o = act.duringCreated(f5y.m14274f().m14287r()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.s1y
            public final void call(Object obj) {
                this.f20077a.m13661J((Boolean) obj);
            }
        }));
        if (this.f12185q == null) {
            this.f12185q = act.duringCreated(rx.c.interval(80L, TimeUnit.MILLISECONDS).onBackpressureLatest().compose(mkd0.C())).filter(new w9j() { // from class: l.t1y
                public final Object call(Object obj) {
                    return this.f20522a.m13686K((Long) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.u1y
                public final void call(Object obj) {
                    this.f20961a.m13687L((Long) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: b */
    public void m13692b(boolean z) {
        if (z) {
            m13657A(z);
        } else {
            m13688M();
        }
    }

    @Override // p009l.kwl
    /* JADX INFO: renamed from: c */
    public View mo11818c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m13695x(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m13693d() {
        m13680z(x4c0.A);
    }

    /* JADX INFO: renamed from: h */
    public void m13694h() {
        m13680z(x4c0.q);
    }

    public void onComplete() {
        this.f12178j.v();
        onPause();
        this.f12178j.postDelayed(new Runnable() { // from class: l.q1y
            @Override // java.lang.Runnable
            public final void run() {
                this.f18993a.m13682D();
            }
        }, 400L);
    }

    public void onError(int i, int i2) {
        CrashHelper.d(new Throwable("MeetFeedImageItemView play video error" + i + " " + i2), 100);
    }

    public void onPause() {
        m13680z(x4c0.A);
    }

    public void onResume() {
        m13680z(-1);
    }

    @Override // p009l.kwl
    public void release() {
        m13657A(true);
    }

    /* JADX INFO: renamed from: x */
    public View m13695x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f2y.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: y */
    public void m13696y() {
        m13680z(-1);
    }
}
