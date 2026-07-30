package p153l;

import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.meet.IMeetListData;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetFeedItemData;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.util.TrackMediaUploadUtil;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VFrame_ColorFilter;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VTexturePlayer;

/* JADX INFO: loaded from: classes11.dex */
public class bby implements czl, VTexturePlayer.InterfaceC22698b, eam {

    /* JADX INFO: renamed from: a */
    public FrameLayout f76003a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f76004b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f76005c;

    /* JADX INFO: renamed from: d */
    public VFrame_ColorFilter f76006d;

    /* JADX INFO: renamed from: e */
    public VImage f76007e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f76008f;

    /* JADX INFO: renamed from: g */
    public ProgressBar f76009g;

    /* JADX INFO: renamed from: h */
    public VImage f76010h;

    /* JADX INFO: renamed from: i */
    public Video f76011i;

    /* JADX INFO: renamed from: j */
    public VTexturePlayer f76012j;

    /* JADX INFO: renamed from: k */
    public boolean f76013k;

    /* JADX INFO: renamed from: l */
    public long f76014l = -1;

    /* JADX INFO: renamed from: m */
    public long f76015m = -1;

    /* JADX INFO: renamed from: n */
    public kcg0 f76016n;

    /* JADX INFO: renamed from: o */
    public kcg0 f76017o;

    /* JADX INFO: renamed from: p */
    public kcg0 f76018p;

    /* JADX INFO: renamed from: q */
    public kcg0 f76019q;

    /* JADX INFO: renamed from: r */
    public boolean f76020r;

    /* JADX INFO: renamed from: l.bby$a */
    public class C15966a implements VTexturePlayer.InterfaceC22699c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f76021a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f76022b;

        public C15966a(String str, int i) {
            this.f76021a = str;
            this.f76022b = i;
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: O */
        public void mo37132O() {
            bby.this.f76015m = System.currentTimeMillis();
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: a */
        public void mo37133a() {
            c7y.m108344c(bby.this.f76014l, System.currentTimeMillis(), this.f76021a, this.f76022b);
            bby.this.f76012j.setVolume(cey.m109473f().m109481j());
            bby.this.f76012j.setLooping(true);
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: b */
        public void mo37134b(int i, int i2) {
            c7y.m108346e(i, i2, !Network.isConnected(CoreModule.f18263b), this.f76021a, this.f76022b);
        }

        @Override // p151v.VTexturePlayer.InterfaceC22699c
        /* JADX INFO: renamed from: c */
        public void mo37135c(long j) {
            if (bby.this.f76015m == -1 || !NullChecker.m82486a(bby.this.f76011i)) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (jCurrentTimeMillis - bby.this.f76015m >= 200) {
                TrackMediaUploadUtil.m81493h0(jCurrentTimeMillis - bby.this.f76015m, null, this.f76021a);
                c7y.m108343b(bby.this.f76015m, jCurrentTimeMillis, this.f76021a, this.f76022b);
            }
            bby.this.f76015m = -1L;
        }
    }

    /* JADX INFO: renamed from: A */
    private void m103319A(boolean z) {
        if (this.f76012j != null) {
            m103353P(z);
            this.f76012j.m224544i(z);
            this.f76012j.animate().cancel();
            bnl0.m105525M0(this.f76012j, false);
            bnl0.m105525M0(this.f76004b, true);
            m103342z(ddc0.f87871A);
            this.f76006d.setAlpha(1.0f);
            if (z) {
                this.f76012j = null;
                this.f76005c.removeAllViews();
                this.f76009g.setProgress(0);
                psd0.m173633z(this.f76016n);
                psd0.m173633z(this.f76017o);
                psd0.m173633z(this.f76018p);
                this.f76016n = null;
                this.f76017o = null;
                this.f76018p = null;
            }
        }
    }

    /* JADX INFO: renamed from: B */
    private void m103320B() {
        if (this.f76012j == null && this.f76005c.getChildAt(0) != null) {
            this.f76012j = (VTexturePlayer) this.f76005c.getChildAt(0);
            return;
        }
        if (this.f76012j == null) {
            VTexturePlayer vTexturePlayer = new VTexturePlayer(this.f76005c.getContext(), this);
            this.f76012j = vTexturePlayer;
            vTexturePlayer.setIfUseTTDynamicCache(true);
            this.f76012j.setId(ddc0.f87881K);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 17;
            if (m103343C() < 1.0f) {
                layoutParams.height = -1;
                layoutParams.width = (this.f76011i.cover.size.width * this.f76005c.getHeight()) / this.f76011i.cover.size.height;
            } else if (m103343C() > 1.0f) {
                layoutParams.height = (this.f76011i.cover.size.height * bnl0.m105592y0()) / this.f76011i.cover.size.width;
                layoutParams.width = -1;
            } else {
                layoutParams.height = bnl0.m105592y0();
                layoutParams.width = bnl0.m105592y0();
            }
            this.f76005c.addView(this.f76012j, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m103321F(View view) {
        VTexturePlayer vTexturePlayer = this.f76012j;
        if (vTexturePlayer == null || !vTexturePlayer.m224556u()) {
            this.f76013k = false;
            m103351N();
        } else {
            this.f76013k = true;
            m103350M();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: G */
    public /* synthetic */ void m103322G(View view) {
        this.f76005c.performClick();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: J */
    public /* synthetic */ void m103323J(Boolean bool) {
        this.f76010h.setImageResource(cey.m109473f().m109481j() ? gbc0.f103367o1 : gbc0.f103375p1);
        VTexturePlayer vTexturePlayer = this.f76012j;
        if (vTexturePlayer != null) {
            vTexturePlayer.setVolume(bool.booleanValue());
        }
    }

    /* JADX INFO: renamed from: g */
    public static /* synthetic */ void m103326g(Throwable th) {
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m103328j(Object obj) {
        if (Network.isConnected(CoreModule.f18263b)) {
            return;
        }
        o1j0.m165635i(R$string.f21320F, true);
    }

    /* JADX INFO: renamed from: z */
    private void m103342z(int i) {
        int childCount = this.f76006d.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f76006d.getChildAt(i2);
            bnl0.m105525M0(childAt, childAt.getId() == i);
        }
    }

    /* JADX INFO: renamed from: C */
    public final float m103343C() {
        Dimension dimension = this.f76011i.size;
        int i = dimension.width;
        if (i == 0) {
            return 1.0f;
        }
        return (dimension.height * 1.0f) / i;
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m103344D() {
        this.f76012j.m224557v();
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m103345E(String str, int i, Integer num) {
        c7y.m108345d(this.f76014l, num.intValue(), str, i);
    }

    /* JADX INFO: renamed from: H */
    public final /* synthetic */ void m103346H(Media media) {
        if (media.equals(this.f76011i)) {
            return;
        }
        mo37118b(false);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m103347I(C4470c c4470c) {
        if (c4470c == C4470c.f16268j) {
            m103350M();
        } else if (c4470c == C4470c.f16267i && cey.m109473f().m109479d() != null && cey.m109473f().m109479d().equals(this.f76011i)) {
            m103351N();
        }
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ Boolean m103348K(Long l2) {
        VTexturePlayer vTexturePlayer;
        return Boolean.valueOf((this.f76020r || (vTexturePlayer = this.f76012j) == null || vTexturePlayer.f210409t == null) ? false : true);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m103349L(Long l2) {
        int currentPosition = (int) this.f76012j.f210409t.getCurrentPosition();
        if (currentPosition > this.f76009g.getProgress() || currentPosition == 0) {
            int progress = this.f76009g.getProgress();
            ProgressBar progressBar = this.f76009g;
            if (currentPosition > progress) {
                progressBar.setProgress(currentPosition, true);
            } else {
                progressBar.setProgress(currentPosition);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public void m103350M() {
        VTexturePlayer vTexturePlayer = this.f76012j;
        if (vTexturePlayer == null || !vTexturePlayer.m224556u()) {
            return;
        }
        m103353P(false);
        this.f76012j.m224553r();
    }

    /* JADX INFO: renamed from: N */
    public void m103351N() {
        if (this.f76013k) {
            return;
        }
        VTexturePlayer vTexturePlayer = this.f76012j;
        if (vTexturePlayer == null || !vTexturePlayer.m224556u()) {
            m103320B();
            m103352O();
            cey.m109473f().m109482m(this.f76011i);
            cey.m109473f().m109483o(true);
            this.f76012j.setVolume(cey.m109473f().m109481j());
            float fM103343C = m103343C();
            Video video = this.f76011i;
            final String square = fM103343C == 1.0f ? video.formatSquare() : video.formatAspectRatio();
            boolean zMo34603u5 = CoreModule.m30933P().m143405a().mo34603u5();
            this.f76014l = System.currentTimeMillis();
            final int i = c7y.f80160a;
            this.f76012j.setIsInABGroup(zMo34603u5);
            this.f76012j.setOnBufferListener(new C15966a(square, i));
            this.f76012j.setNetErrorListener(new y20() { // from class: l.say
                @Override // p153l.y20
                public final void call(Object obj) {
                    bby.m103328j(obj);
                }
            });
            this.f76012j.m224558w(null, C22421c.fromCallable(new Callable() { // from class: l.tay
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(cbl0.m108642n().m108651u(square));
                }
            }).compose(psd0.m173592C()), this.f76011i.duration);
            this.f76012j.m224554s(Uri.parse(uqb0.m197266d0(square)), fM103343C, square, (zMo34603u5 || !this.f76011i.url.startsWith("http") || Network.isConnected(CoreModule.f18263b)) ? false : true, R$string.f21320F, R$string.f21352R0);
            cbl0.m108642n().m108649q(square).compose(psd0.m173592C()).subscribe(psd0.m173597H(new y20() { // from class: l.uay
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f178247a.m103345E(square, i, (Integer) obj);
                }
            }, new y20() { // from class: l.vay
                @Override // p153l.y20
                public final void call(Object obj) {
                    bby.m103326g((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m103352O() {
        this.f76020r = false;
    }

    /* JADX INFO: renamed from: P */
    public final void m103353P(boolean z) {
        this.f76020r = true;
        cey.m109473f().m109483o(false);
        if (z) {
            psd0.m173633z(this.f76019q);
            this.f76019q = null;
            this.f76009g.clearAnimation();
        }
    }

    @Override // p153l.czl
    /* JADX INFO: renamed from: a */
    public void mo103244a(IMeetListData iMeetListData, Act act) {
        this.f76011i = (Video) ((MeetFeedItemData) iMeetListData).moment.media.get(0);
        this.f76005c.setOnClickListener(new View.OnClickListener() { // from class: l.way
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188177a.m103321F(view);
            }
        });
        this.f76006d.setOnClickListener(new View.OnClickListener() { // from class: l.xay
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193092a.m103322G(view);
            }
        });
        this.f76009g.setMax((int) (this.f76011i.duration * 1000.0f));
        if (TEnum.equals(this.f76011i.status, "raw")) {
            uqb0.f180374G.m127148k0(this.f76004b, this.f76011i.url);
        } else {
            Picture.ImageUri imageUriMo34785Xf = gta.m132210e().m132214d().mo34785Xf(this.f76011i);
            if (imageUriMo34785Xf == null) {
                CrashHelper.m82485i(new IllegalStateException("not supported yet"), "core_newmeet_video_uri", CrashHelper.ReportLevel.p6, 100);
            } else {
                uqb0.f180374G.m127096B0(this.f76004b, imageUriMo34785Xf);
            }
        }
        this.f76010h.setImageResource(cey.m109473f().m109481j() ? gbc0.f103367o1 : gbc0.f103375p1);
        this.f76010h.setOnClickListener(new View.OnClickListener() { // from class: l.yay
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cey.m109473f().m109484p(!cey.m109473f().m109481j());
            }
        });
        if (cey.m109473f().m109479d() != null && cey.m109473f().m109479d().equals(this.f76011i)) {
            this.f76005c.post(new Runnable() { // from class: l.zay
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203604a.m103351N();
                }
            });
        }
        if (this.f76016n == null) {
            this.f76016n = act.duringCreated(cey.m109473f().m109485q()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.aby
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f69665a.m103346H((Media) obj);
                }
            }));
        }
        if (this.f76018p == null) {
            this.f76018p = act.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.oay
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f145764a.m103347I((C4470c) obj);
                }
            }));
        }
        this.f76017o = act.duringCreated(cey.m109473f().m109486r()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.pay
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151338a.m103323J((Boolean) obj);
            }
        }));
        if (this.f76019q == null) {
            this.f76019q = act.duringCreated((C22421c) C22421c.interval(80L, TimeUnit.MILLISECONDS).onBackpressureLatest().compose(psd0.m173592C())).filter(new qcj() { // from class: l.qay
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f156439a.m103348K((Long) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.ray
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f161957a.m103349L((Long) obj);
                }
            }));
        }
    }

    @Override // p153l.eam
    /* JADX INFO: renamed from: b */
    public void mo37118b(boolean z) {
        if (z) {
            m103319A(z);
        } else {
            m103350M();
        }
    }

    @Override // p153l.czl
    /* JADX INFO: renamed from: c */
    public View mo103246c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m103354x(layoutInflater, viewGroup);
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: d */
    public void mo37119d() {
        m103342z(ddc0.f87871A);
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: h */
    public void mo37120h() {
        m103342z(ddc0.f87911q);
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onComplete() {
        this.f76012j.m224557v();
        onPause();
        this.f76012j.postDelayed(new Runnable() { // from class: l.nay
            @Override // java.lang.Runnable
            public final void run() {
                this.f141059a.m103344D();
            }
        }, 400L);
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onError(int i, int i2) {
        CrashHelper.m82480d(new Throwable("MeetFeedImageItemView play video error" + i + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + i2), 100);
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onPause() {
        m103342z(ddc0.f87871A);
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    public void onResume() {
        m103342z(-1);
    }

    @Override // p153l.czl
    public void release() {
        m103319A(true);
    }

    /* JADX INFO: renamed from: x */
    public View m103354x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cby.m108662b(this, layoutInflater, viewGroup);
    }

    @Override // p151v.VTexturePlayer.InterfaceC22698b
    /* JADX INFO: renamed from: y */
    public void mo37130y() {
        m103342z(-1);
    }
}
