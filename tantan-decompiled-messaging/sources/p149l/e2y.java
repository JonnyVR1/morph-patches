package p149l;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetFeedItemData;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VFrame_ColorFilter;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VTexturePlayer;

/* JADX INFO: loaded from: classes11.dex */
public class e2y implements kwl, VTexturePlayer.InterfaceC22583b, o7m {

    /* JADX INFO: renamed from: a */
    public FrameLayout f88961a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f88962b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f88963c;

    /* JADX INFO: renamed from: d */
    public VFrame_ColorFilter f88964d;

    /* JADX INFO: renamed from: e */
    public VImage f88965e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f88966f;

    /* JADX INFO: renamed from: g */
    public ProgressBar f88967g;

    /* JADX INFO: renamed from: h */
    public VImage f88968h;

    /* JADX INFO: renamed from: i */
    public Video f88969i;

    /* JADX INFO: renamed from: j */
    public VTexturePlayer f88970j;

    /* JADX INFO: renamed from: k */
    public boolean f88971k;

    /* JADX INFO: renamed from: l */
    public long f88972l = -1;

    /* JADX INFO: renamed from: m */
    public long f88973m = -1;

    /* JADX INFO: renamed from: n */
    public c4g0 f88974n;

    /* JADX INFO: renamed from: o */
    public c4g0 f88975o;

    /* JADX INFO: renamed from: p */
    public c4g0 f88976p;

    /* JADX INFO: renamed from: q */
    public c4g0 f88977q;

    /* JADX INFO: renamed from: r */
    public boolean f88978r;

    /* JADX INFO: renamed from: l.e2y$a */
    public class C16528a implements VTexturePlayer.InterfaceC22584c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f88979a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f88980b;

        public C16528a(String str, int i) {
            this.f88979a = str;
            this.f88980b = i;
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: O */
        public void mo36129O() {
            e2y.this.f88973m = System.currentTimeMillis();
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: a */
        public void mo36130a() {
            fyx.m123809c(e2y.this.f88972l, System.currentTimeMillis(), this.f88979a, this.f88980b);
            e2y.this.f88970j.setVolume(f5y.m119543f().m119551j());
            e2y.this.f88970j.setLooping(true);
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: b */
        public void mo36131b(int i, int i2) {
            fyx.m123811e(i, i2, !Network.isConnected(CoreModule.f17544b), this.f88979a, this.f88980b);
        }

        @Override // p147v.VTexturePlayer.InterfaceC22584c
        /* JADX INFO: renamed from: c */
        public void mo36132c(long j) {
            if (e2y.this.f88973m == -1 || !NullChecker.m81303a(e2y.this.f88969i)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - e2y.this.f88973m >= 200) {
                TrackMediaUploadUtil.m80310h0(jCurrentTimeMillis - e2y.this.f88973m, null, this.f88979a);
                fyx.m123808b(e2y.this.f88973m, jCurrentTimeMillis, this.f88979a, this.f88980b);
            }
            e2y.this.f88973m = -1L;
        }
    }

    /* JADX INFO: renamed from: A */
    private void m114536A(boolean z) {
        if (this.f88970j != null) {
            m114570P(z);
            this.f88970j.m223298i(z);
            this.f88970j.animate().cancel();
            xdl0.m208345M0(this.f88970j, false);
            xdl0.m208345M0(this.f88962b, true);
            m114559z(x4c0.f190966A);
            this.f88964d.setAlpha(1.0f);
            if (z) {
                this.f88970j = null;
                this.f88963c.removeAllViews();
                this.f88967g.setProgress(0);
                mkd0.m154992z(this.f88974n);
                mkd0.m154992z(this.f88975o);
                mkd0.m154992z(this.f88976p);
                this.f88974n = null;
                this.f88975o = null;
                this.f88976p = null;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    private void m114537B() {
        if (this.f88970j == null && this.f88963c.getChildAt(0) != null) {
            this.f88970j = (VTexturePlayer) this.f88963c.getChildAt(0);
            return;
        }
        if (this.f88970j == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(this.f88963c.getContext(), this);
            this.f88970j = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f88970j.setId(x4c0.f190976K);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            if (m114560C() < 1.0f) {
                layoutParams.height = -1;
                layoutParams.width = (this.f88969i.cover.size.width * this.f88963c.getHeight()) / this.f88969i.cover.size.height;
            } else if (m114560C() > 1.0f) {
                layoutParams.height = (this.f88969i.cover.size.height * xdl0.m208412y0()) / this.f88969i.cover.size.width;
                layoutParams.width = -1;
            } else {
                layoutParams.height = xdl0.m208412y0();
                layoutParams.width = xdl0.m208412y0();
            }
            this.f88963c.addView(this.f88970j, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m114538F(View view) {
        VTexturePlayer vTexturePlayer = this.f88970j;
        if (vTexturePlayer == null || !vTexturePlayer.m223310u()) {
            this.f88971k = false;
            m114568N();
        } else {
            this.f88971k = true;
            m114567M();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m114539G(View view) {
        this.f88963c.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m114540J(Boolean bool) {
        this.f88968h.setImageResource(f5y.m119543f().m119551j() ? b3c0.f73116o1 : b3c0.f73124p1);
        VTexturePlayer vTexturePlayer = this.f88970j;
        if (vTexturePlayer != null) {
            vTexturePlayer.setVolume(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m114543g(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m114545j(Object obj) {
        if (Network.isConnected(CoreModule.f17544b)) {
            return;
        }
        lsi0.m151579i(R$string.f20578F, true);
    }

    /* JADX INFO: renamed from: z */
    private void m114559z(int i) {
        int childCount = this.f88964d.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f88964d.getChildAt(i2);
            xdl0.m208345M0(childAt, childAt.getId() == i);
        }
    }

    /* JADX INFO: renamed from: C */
    public final float m114560C() {
        Dimension dimension = this.f88969i.size;
        int i = dimension.width;
        if (i == 0) {
            return 1.0f;
        }
        return (dimension.height * 1.0f) / i;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m114561D() {
        this.f88970j.m223311v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m114562E(String str, int i, Integer num) {
        fyx.m123810d(this.f88972l, num.intValue(), str, i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m114563H(Media media) {
        if (media.equals(this.f88969i)) {
            return;
        }
        mo36115b(false);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m114564I(C4319c c4319c) {
        if (c4319c == C4319c.f15549j) {
            m114567M();
        } else if (c4319c == C4319c.f15548i && f5y.m119543f().m119549d() != null && f5y.m119543f().m119549d().equals(this.f88969i)) {
            m114568N();
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Boolean m114565K(Long l2) {
        VTexturePlayer vTexturePlayer;
        return Boolean.valueOf((this.f88978r || (vTexturePlayer = this.f88970j) == null || vTexturePlayer.f209487t == null) ? false : true);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m114566L(Long l2) {
        int currentPosition = (int) this.f88970j.f209487t.getCurrentPosition();
        if (currentPosition > this.f88967g.getProgress() || currentPosition == 0) {
            int progress = this.f88967g.getProgress();
            ProgressBar progressBar = this.f88967g;
            if (currentPosition > progress) {
                progressBar.setProgress(currentPosition, true);
            } else {
                progressBar.setProgress(currentPosition);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m114567M() {
        VTexturePlayer vTexturePlayer = this.f88970j;
        if (vTexturePlayer == null || !vTexturePlayer.m223310u()) {
            return;
        }
        m114570P(false);
        this.f88970j.m223307r();
    }

    /* JADX INFO: renamed from: N */
    public void m114568N() {
        if (this.f88971k) {
            return;
        }
        VTexturePlayer vTexturePlayer = this.f88970j;
        if (vTexturePlayer == null || !vTexturePlayer.m223310u()) {
            m114537B();
            m114569O();
            f5y.m119543f().m119552m(this.f88969i);
            f5y.m119543f().m119553o(true);
            this.f88970j.setVolume(f5y.m119543f().m119551j());
            float fM114560C = m114560C();
            Video video = this.f88969i;
            final String square = fM114560C == 1.0f ? video.formatSquare() : video.formatAspectRatio();
            boolean zMo33600u5 = CoreModule.m29935P().m94651a().mo33600u5();
            this.f88972l = System.currentTimeMillis();
            final int i = fyx.f99914a;
            this.f88970j.setIsInABGroup(zMo33600u5);
            this.f88970j.setOnBufferListener(new C16528a(square, i));
            this.f88970j.setNetErrorListener(new e30() { // from class: l.v1y
                @Override // p149l.e30
                public final void call(Object obj) {
                    e2y.m114545j(obj);
                }
            });
            this.f88970j.m223312w(null, C22306c.fromCallable(new Callable() { // from class: l.w1y
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(x1l0.m206744n().m206753u(square));
                }
            }).compose(mkd0.m154951C()), this.f88969i.duration);
            this.f88970j.m223308s(Uri.parse(qib0.m174812d0(square)), fM114560C, square, (zMo33600u5 || !this.f88969i.url.startsWith("http") || Network.isConnected(CoreModule.f17544b)) ? false : true, R$string.f20578F, R$string.f20610R0);
            x1l0.m206744n().m206751q(square).compose(mkd0.m154951C()).subscribe(mkd0.m154956H(new e30() { // from class: l.x1y
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f189108a.m114562E(square, i, (Integer) obj);
                }
            }, new e30() { // from class: l.y1y
                @Override // p149l.e30
                public final void call(Object obj) {
                    e2y.m114543g((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m114569O() {
        this.f88978r = false;
    }

    /* JADX INFO: renamed from: P */
    public final void m114570P(boolean z) {
        this.f88978r = true;
        f5y.m119543f().m119553o(false);
        if (z) {
            mkd0.m154992z(this.f88977q);
            this.f88977q = null;
            this.f88967g.clearAnimation();
        }
    }

    @Override // p149l.kwl
    /* JADX INFO: renamed from: a */
    public void mo99891a(IMeetListData iMeetListData, Act act) {
        this.f88969i = (Video) ((MeetFeedItemData) iMeetListData).moment.media.get(0);
        this.f88963c.setOnClickListener(new View.OnClickListener() { // from class: l.z1y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201112a.m114538F(view);
            }
        });
        this.f88964d.setOnClickListener(new View.OnClickListener() { // from class: l.a2y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67303a.m114539G(view);
            }
        });
        this.f88967g.setMax((int) (this.f88969i.duration * 1000.0f));
        if (TEnum.equals(this.f88969i.status, "raw")) {
            qib0.f154691G.m102365k0(this.f88962b, this.f88969i.url);
        } else {
            Picture.ImageUri imageUriMo33782Xf = ura.m195053e().m195057d().mo33782Xf(this.f88969i);
            if (imageUriMo33782Xf == null) {
                CrashHelper.m81302i(new IllegalStateException("not supported yet"), "core_newmeet_video_uri", CrashHelper.ReportLevel.p6, 100);
            } else {
                qib0.f154691G.m102312B0(this.f88962b, imageUriMo33782Xf);
            }
        }
        this.f88968h.setImageResource(f5y.m119543f().m119551j() ? b3c0.f73116o1 : b3c0.f73124p1);
        this.f88968h.setOnClickListener(new View.OnClickListener() { // from class: l.b2y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f5y.m119543f().m119554p(!f5y.m119543f().m119551j());
            }
        });
        if (f5y.m119543f().m119549d() != null && f5y.m119543f().m119549d().equals(this.f88969i)) {
            this.f88963c.post(new Runnable() { // from class: l.c2y
                @Override // java.lang.Runnable
                public final void run() {
                    this.f78404a.m114568N();
                }
            });
        }
        if (this.f88974n == null) {
            this.f88974n = act.duringCreated(f5y.m119543f().m119555q()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.d2y
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f83439a.m114563H((Media) obj);
                }
            }));
        }
        if (this.f88976p == null) {
            this.f88976p = act.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.r1y
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f157346a.m114564I((C4319c) obj);
                }
            }));
        }
        this.f88975o = act.duringCreated(f5y.m119543f().m119556r()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.s1y
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161953a.m114540J((Boolean) obj);
            }
        }));
        if (this.f88977q == null) {
            this.f88977q = act.duringCreated((C22306c) C22306c.interval(80L, TimeUnit.MILLISECONDS).onBackpressureLatest().compose(mkd0.m154951C())).filter(new w9j() { // from class: l.t1y
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f167408a.m114565K((Long) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.u1y
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f173054a.m114566L((Long) obj);
                }
            }));
        }
    }

    @Override // p149l.o7m
    /* JADX INFO: renamed from: b */
    public void mo36115b(boolean z) {
        if (z) {
            m114536A(z);
        } else {
            m114567M();
        }
    }

    @Override // p149l.kwl
    /* JADX INFO: renamed from: c */
    public View mo99892c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m114571x(layoutInflater, viewGroup);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: d */
    public void mo36116d() {
        m114559z(x4c0.f190966A);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: h */
    public void mo36117h() {
        m114559z(x4c0.f191006q);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onComplete() {
        this.f88970j.m223311v();
        onPause();
        this.f88970j.postDelayed(new Runnable() { // from class: l.q1y
            @Override // java.lang.Runnable
            public final void run() {
                this.f152177a.m114561D();
            }
        }, 400L);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onError(int i, int i2) {
        CrashHelper.m81297d(new Throwable("MeetFeedImageItemView play video error" + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2), 100);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onPause() {
        m114559z(x4c0.f190966A);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    public void onResume() {
        m114559z(-1);
    }

    @Override // p149l.kwl
    public void release() {
        m114536A(true);
    }

    /* JADX INFO: renamed from: x */
    public View m114571x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f2y.m119244b(this, layoutInflater, viewGroup);
    }

    @Override // p147v.VTexturePlayer.InterfaceC22583b
    /* JADX INFO: renamed from: y */
    public void mo36127y() {
        m114559z(-1);
    }
}
