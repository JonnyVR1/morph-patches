package p003l;

import android.content.Context;
import android.media.AudioManager;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.mediapreview.DragDismissContainerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.PhotoPreviewView;
import com.p1.mobile.putong.core.ui.PlayerView;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.c680;
import l.fb1;
import l.hmb;
import l.ib1;
import l.j760;
import l.l680;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.s680;
import l.t100;
import l.u4c0;
import l.upa;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.z91;
import l.zvf0;
import p028v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ck5 extends eb2 {

    /* JADX INFO: renamed from: f */
    public final Act f2701f;

    /* JADX INFO: renamed from: g */
    public final List<Media> f2702g;

    /* JADX INFO: renamed from: h */
    public li80 f2703h;

    /* JADX INFO: renamed from: i */
    public PlayerView f2704i;

    /* JADX INFO: renamed from: j */
    public c680 f2705j;

    /* JADX INFO: renamed from: k */
    public c680 f2706k;

    /* JADX INFO: renamed from: l */
    public DragDismissContainerView f2707l;

    /* JADX INFO: renamed from: n */
    public c680.c f2709n;

    /* JADX INFO: renamed from: o */
    public boolean f2710o;

    /* JADX INFO: renamed from: p */
    public boolean f2711p;

    /* JADX INFO: renamed from: q */
    public int f2712q;

    /* JADX INFO: renamed from: r */
    public VImage f2713r;

    /* JADX INFO: renamed from: e */
    public boolean f2700e = false;

    /* JADX INFO: renamed from: m */
    public final t9e f2708m = new t9e();

    /* JADX INFO: renamed from: s */
    public int f2714s = 0;

    /* JADX INFO: renamed from: t */
    public z91 f2715t = new C0205b();

    /* JADX INFO: renamed from: l.ck5$a */
    public class C0204a extends c680.c {
        public C0204a() {
        }

        /* JADX INFO: renamed from: a */
        public void m3370a(Exception exc) {
            super.a(exc);
            if (NullChecker.a(ck5.this.f2709n)) {
                ck5.this.f2709n.a(exc);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m3371d() {
            super.d();
            if (NullChecker.a(ck5.this.f2709n)) {
                ck5.this.f2709n.d();
            }
        }

        public void onComplete() {
            super.onComplete();
            if (NullChecker.a(ck5.this.f2709n)) {
                ck5.this.f2709n.onComplete();
            }
        }

        public void onPause() {
            super.onPause();
            if (NullChecker.a(ck5.this.f2709n)) {
                ck5.this.f2709n.onPause();
            }
            ck5.this.m3360L(false);
        }

        public void onResume() {
            super.onResume();
            if (NullChecker.a(ck5.this.f2709n)) {
                ck5.this.f2709n.onResume();
            }
            ck5.this.m3360L(false);
        }

        public void onStart() {
            if (NullChecker.a(ck5.this.f2709n)) {
                ck5.this.f2709n.onStart();
            }
            fb1.a((AudioManager.OnAudioFocusChangeListener) null, 1);
        }
    }

    /* JADX INFO: renamed from: l.ck5$b */
    public class C0205b implements z91 {
        public C0205b() {
        }

        /* JADX INFO: renamed from: b */
        public void m3372b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            if (ck5.this.f2714s == -1) {
                ck5 ck5Var = ck5.this;
                ck5Var.m3363O(ck5Var.f2704i);
            } else {
                if (CoreModule.N().sh()) {
                    return;
                }
                ck5.this.m3352A();
            }
        }

        /* JADX INFO: renamed from: d */
        public void m3373d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (!ib1.b().d(audioBusinessType2)) {
                ib1.b().g(str, audioBusinessType, z91Var);
                int i = ck5.this.f2714s;
                ck5 ck5Var = ck5.this;
                if (i == -1) {
                    ck5Var.m3363O(ck5Var.f2704i);
                    return;
                } else {
                    ck5Var.m3352A();
                    return;
                }
            }
            osi0.g(audioBusinessType2.getBusinessMsg());
            if (ck5.this.f2714s == -1) {
                boolean zSh = CoreModule.N().sh();
                ck5 ck5Var2 = ck5.this;
                if (zSh) {
                    ck5Var2.m3363O(ck5Var2.f2704i);
                } else {
                    ck5Var2.m3352A();
                }
            }
        }

        public void success() {
            int i = ck5.this.f2714s;
            ck5 ck5Var = ck5.this;
            if (i == -1) {
                ck5Var.m3363O(ck5Var.f2704i);
            } else {
                ck5Var.m3352A();
            }
        }
    }

    public ck5(Act act, List<Media> list) {
        this.f2701f = act;
        this.f2702g = list;
    }

    /* JADX INFO: renamed from: C */
    private View m3342C(Media media, int i) {
        View viewM3354E;
        if (media instanceof Picture) {
            viewM3354E = m3353D(media);
        } else {
            viewM3354E = media instanceof Video ? m3354E((Video) media) : null;
        }
        if (NullChecker.a(this.f2703h)) {
            this.f2703h.m6027d(i, viewM3354E);
        }
        if (viewM3354E instanceof PlayerView) {
            this.f2704i = (PlayerView) viewM3354E;
            m3365Q();
        }
        return m3369z(viewM3354E, media);
    }

    /* JADX INFO: renamed from: G */
    private void m3343G(Media media) {
        this.f2707l.setId(u4c0.x9);
        if (media instanceof Video) {
            Video video = (Video) media;
            this.f2707l.setOriginalHeight(video.size.height);
            this.f2707l.setOriginalWidth(video.size.width);
        } else if (media instanceof Picture) {
            Picture picture = (Picture) media;
            this.f2707l.setOriginalHeight(Math.min(xdl0.w0(), picture.size.height));
            this.f2707l.setOriginalWidth(picture.size.width);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m3344q(View view) {
        return true;
    }

    /* JADX INFO: renamed from: y */
    private View m3351y(View view, Media media) {
        DragDismissContainerView dragDismissContainerView = new DragDismissContainerView((Context) this.f2701f, this.f2700e);
        this.f2707l = dragDismissContainerView;
        dragDismissContainerView.setFeedDragDismissListener(this.f2708m);
        this.f2707l.setInnerContentView(view);
        if (this.f2710o) {
            this.f2707l.setZoomAnimationKey(Media.URL_TO_CACHEKEY(media.url));
        }
        m3343G(media);
        return this.f2707l;
    }

    /* JADX INFO: renamed from: A */
    public void m3352A() {
        CoreModule.N().Re(!CoreModule.N().sh());
        zvf0.u("e_video_voice_switch", this.f2701f.pageId(), new j760[]{vwb.Y("voiceswitch", CoreModule.N().sh() ? "off" : "on")});
        m3363O(this.f2704i);
    }

    /* JADX INFO: renamed from: D */
    public final View m3353D(Media media) {
        final PhotoPreviewView photoPreviewView = new PhotoPreviewView(this.f2701f);
        photoPreviewView.N((Picture) media, false);
        photoPreviewView.setReplayVisibility(8);
        photoPreviewView.setOnTapListener(new PhotoPreviewView.c() { // from class: l.zj5
            /* JADX INFO: renamed from: a */
            public final void m9428a() {
                this.f9374a.m3358J(photoPreviewView);
            }
        });
        photoPreviewView.a.setOnDragDismissListenler(this.f2708m);
        return photoPreviewView;
    }

    /* JADX INFO: renamed from: E */
    public final View m3354E(Video video) {
        PlayerView playerView = new PlayerView(this.f2701f);
        playerView.setProgressBarsEnabled(false);
        c680 c680VarM3355F = m3355F(((Media) video).url);
        c680VarM3355F.a("profile");
        playerView.setPlayer(c680VarM3355F);
        playerView.h.setBackground(null);
        playerView.setVideo(video);
        playerView.x(xdl0.y0(), xdl0.w0() - xdl0.F0());
        playerView.setReplayVisibility(4);
        this.f2714s = -1;
        ib1.b().f("CommonMediaPreviewAdapter", AudioBusinessType.NORMAL, this.f2715t);
        if (!TextUtils.isEmpty(video.formatAspectRatio())) {
            qib0.S0(video.formatAspectRatio());
        }
        playerView.K();
        playerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.yj5
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ck5.m3344q(view);
            }
        });
        playerView.v(new C0204a());
        return playerView;
    }

    /* JADX INFO: renamed from: F */
    public c680 m3355F(String str) {
        if (!NullChecker.a(str) || str.startsWith("http")) {
            if (this.f2706k == null) {
                this.f2706k = new s680();
            }
            return this.f2706k;
        }
        if (this.f2705j == null) {
            this.f2705j = new l680();
        }
        return this.f2705j;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m3356H(Media media) {
        return (media instanceof Picture) && NullChecker.a(((Picture) media).livePhoto);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m3357I() {
        m3360L(true);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m3358J(PhotoPreviewView photoPreviewView) {
        photoPreviewView.postDelayed(new Runnable() { // from class: l.ak5
            @Override // java.lang.Runnable
            public final void run() {
                this.f2230a.m3357I();
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m3359K(c cVar) {
        if (cVar == c.i && NullChecker.a(this.f2704i)) {
            this.f2704i.K();
        }
    }

    /* JADX INFO: renamed from: L */
    public void m3360L(boolean z) {
        if (NullChecker.a(this.f2703h)) {
            this.f2703h.mo6030g();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m3361M() {
        if (NullChecker.a(this.f2706k)) {
            this.f2706k.release();
        }
        if (NullChecker.a(this.f2705j)) {
            this.f2705j.release();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m3362N(li80 li80Var) {
        this.f2703h = li80Var;
        this.f2709n = li80Var.mo6028e();
    }

    /* JADX INFO: renamed from: O */
    public void m3363O(PlayerView playerView) {
        if (NullChecker.a(playerView)) {
            playerView.H(CoreModule.N().sh());
        }
        if (NullChecker.a(this.f2713r)) {
            xdl0.M0(this.f2713r, true);
            this.f2713r.setImageResource(CoreModule.N().sh() ? x2c0.cr : x2c0.dr);
            if (((Boolean) CoreModule.N().ln().get()).booleanValue() || upa.Y2()) {
                return;
            }
            this.f2713r.post(new Runnable() { // from class: l.bk5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f2402a.m3366R();
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public void m3364P(boolean z) {
        this.f2711p = z;
    }

    /* JADX INFO: renamed from: Q */
    public final void m3365Q() {
        this.f2701f.lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.xj5
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8789a.m3359K((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public void m3366R() {
        CoreModule.N().ln().put(Boolean.TRUE);
        d.l().u(new a(this.f2701f).D("视频声音默认关闭，单击开启").k(new int[]{this.f2701f.getResources().getColor(w0c0.I)}).J(13.0f).E(true).b(10000L).e(true).q(a.N | a.P).o(a.P, t100.d(6.0f)), this.f2713r, "preview_vedio_voice_mute");
    }

    /* JADX INFO: renamed from: S */
    public void m3367S() {
        if (NullChecker.a(this.f2706k)) {
            this.f2706k.stop();
        }
        if (NullChecker.a(this.f2705j)) {
            this.f2705j.stop();
        }
    }

    public int getCount() {
        return this.f2702g.size();
    }

    public int getItemPosition(@NonNull Object obj) {
        return ((Integer) obj).intValue();
    }

    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view.getTag().equals(obj);
    }

    @Override // p003l.eb2
    /* JADX INFO: renamed from: o */
    public void mo923o(ViewGroup viewGroup, int i, Object obj) {
        PlayerView playerViewFindViewWithTag = viewGroup.findViewWithTag(obj);
        if (NullChecker.a(playerViewFindViewWithTag)) {
            if (playerViewFindViewWithTag instanceof PlayerView) {
                playerViewFindViewWithTag.setPlayer((c680) null);
            } else if (playerViewFindViewWithTag instanceof PhotoPreviewView) {
                ((PhotoPreviewView) playerViewFindViewWithTag).M();
            }
            playerViewFindViewWithTag.setTag(null);
            viewGroup.removeView(playerViewFindViewWithTag);
        }
    }

    public void onPageSelected(int i) {
        if (this.f2712q != i && NullChecker.a(this.f2704i)) {
            if (NullChecker.a(this.f2706k)) {
                this.f2706k.stop();
            }
            if (NullChecker.a(this.f2705j)) {
                this.f2705j.stop();
            }
        }
        this.f2712q = i;
    }

    @Override // p003l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo924p(ViewGroup viewGroup, int i) {
        View viewM3342C = m3342C(this.f2702g.get(i), i);
        viewM3342C.setTag(Integer.valueOf(i));
        viewGroup.addView(viewM3342C);
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: x */
    public void m3368x(n9e n9eVar) {
        this.f2708m.m7706g(n9eVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: z */
    public final View m3369z(View view, Media media) {
        if (!(media instanceof Video)) {
            if (media instanceof Picture) {
                Dimension dimension = ((Picture) media).size;
                if (!hmb.r1(dimension.width, dimension.height)) {
                    if (!m3356H(media)) {
                        return view;
                    }
                }
            } else if (!m3356H(media)) {
                return view;
            }
        }
        return m3351y(view, media);
    }
}
