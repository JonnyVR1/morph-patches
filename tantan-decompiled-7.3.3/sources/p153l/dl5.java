package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.PhotoPreviewView;
import com.p051p1.mobile.putong.core.p058ui.PlayerView;
import com.p051p1.mobile.putong.core.p058ui.mediapreview.DragDismissContainerView;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VImage;

/* JADX INFO: loaded from: classes3.dex */
public class dl5 extends lb2 {

    /* JADX INFO: renamed from: f */
    public final Act f89496f;

    /* JADX INFO: renamed from: g */
    public final List<Media> f89497g;

    /* JADX INFO: renamed from: h */
    public pq80 f89498h;

    /* JADX INFO: renamed from: i */
    public PlayerView f89499i;

    /* JADX INFO: renamed from: j */
    public ie80 f89500j;

    /* JADX INFO: renamed from: k */
    public ie80 f89501k;

    /* JADX INFO: renamed from: l */
    public DragDismissContainerView f89502l;

    /* JADX INFO: renamed from: n */
    public ie80.C17711c f89504n;

    /* JADX INFO: renamed from: o */
    public boolean f89505o;

    /* JADX INFO: renamed from: p */
    public boolean f89506p;

    /* JADX INFO: renamed from: q */
    public int f89507q;

    /* JADX INFO: renamed from: r */
    public VImage f89508r;

    /* JADX INFO: renamed from: e */
    public boolean f89495e = false;

    /* JADX INFO: renamed from: m */
    public final xae f89503m = new xae();

    /* JADX INFO: renamed from: s */
    public int f89509s = 0;

    /* JADX INFO: renamed from: t */
    public ga1 f89510t = new C16570b();

    /* JADX INFO: renamed from: l.dl5$a */
    public class C16569a extends ie80.C17711c {
        public C16569a() {
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: a */
        public void mo45233a(Exception exc) {
            super.mo45233a(exc);
            if (NullChecker.m82486a(dl5.this.f89504n)) {
                dl5.this.f89504n.mo45233a(exc);
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            super.mo45236d();
            if (NullChecker.m82486a(dl5.this.f89504n)) {
                dl5.this.f89504n.mo45236d();
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onComplete() {
            super.onComplete();
            if (NullChecker.m82486a(dl5.this.f89504n)) {
                dl5.this.f89504n.onComplete();
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onPause() {
            super.onPause();
            if (NullChecker.m82486a(dl5.this.f89504n)) {
                dl5.this.f89504n.onPause();
            }
            dl5.this.m116729L(false);
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onResume() {
            super.onResume();
            if (NullChecker.m82486a(dl5.this.f89504n)) {
                dl5.this.f89504n.onResume();
            }
            dl5.this.m116729L(false);
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onStart() {
            if (NullChecker.m82486a(dl5.this.f89504n)) {
                dl5.this.f89504n.onStart();
            }
            mb1.m157763a(null, 1);
        }
    }

    /* JADX INFO: renamed from: l.dl5$b */
    public class C16570b implements ga1 {
        public C16570b() {
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            if (dl5.this.f89509s == -1) {
                dl5 dl5Var = dl5.this;
                dl5Var.m116732O(dl5Var.f89499i);
            } else {
                if (CoreModule.m30932N().mo61572sh()) {
                    return;
                }
                dl5.this.m116721A();
            }
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
            if (!pb1.m171472b().mo171475d(audioBusinessType2)) {
                pb1.m171472b().mo171478g(str, audioBusinessType, ga1Var);
                int i = dl5.this.f89509s;
                dl5 dl5Var = dl5.this;
                if (i == -1) {
                    dl5Var.m116732O(dl5Var.f89499i);
                    return;
                } else {
                    dl5Var.m116721A();
                    return;
                }
            }
            r1j0.m179420g(audioBusinessType2.getBusinessMsg());
            if (dl5.this.f89509s == -1) {
                boolean zMo61572sh = CoreModule.m30932N().mo61572sh();
                dl5 dl5Var2 = dl5.this;
                if (zMo61572sh) {
                    dl5Var2.m116732O(dl5Var2.f89499i);
                } else {
                    dl5Var2.m116721A();
                }
            }
        }

        @Override // p153l.ga1
        public void success() {
            int i = dl5.this.f89509s;
            dl5 dl5Var = dl5.this;
            if (i == -1) {
                dl5Var.m116732O(dl5Var.f89499i);
            } else {
                dl5Var.m116721A();
            }
        }
    }

    public dl5(Act act, List<Media> list) {
        this.f89496f = act;
        this.f89497g = list;
    }

    /* JADX INFO: renamed from: C */
    private View m116711C(Media media, int i) {
        View viewM116723E;
        if (media instanceof Picture) {
            viewM116723E = m116722D(media);
        } else {
            viewM116723E = media instanceof Video ? m116723E((Video) media) : null;
        }
        if (NullChecker.m82486a(this.f89498h)) {
            this.f89498h.m173327d(i, viewM116723E);
        }
        if (viewM116723E instanceof PlayerView) {
            this.f89499i = (PlayerView) viewM116723E;
            m116734Q();
        }
        return m116738z(viewM116723E, media);
    }

    /* JADX INFO: renamed from: G */
    private void m116712G(Media media) {
        this.f89502l.setId(adc0.f70676z9);
        if (media instanceof Video) {
            Video video = (Video) media;
            this.f89502l.setOriginalHeight(video.size.height);
            this.f89502l.setOriginalWidth(video.size.width);
        } else if (media instanceof Picture) {
            Picture picture = (Picture) media;
            this.f89502l.setOriginalHeight(Math.min(bnl0.m105588w0(), picture.size.height));
            this.f89502l.setOriginalWidth(picture.size.width);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m116713q(View view) {
        return true;
    }

    /* JADX INFO: renamed from: y */
    private View m116720y(View view, Media media) {
        DragDismissContainerView dragDismissContainerView = new DragDismissContainerView(this.f89496f, this.f89495e);
        this.f89502l = dragDismissContainerView;
        dragDismissContainerView.setFeedDragDismissListener(this.f89503m);
        this.f89502l.setInnerContentView(view);
        if (this.f89505o) {
            this.f89502l.setZoomAnimationKey(Media.URL_TO_CACHEKEY(media.url));
        }
        m116712G(media);
        return this.f89502l;
    }

    /* JADX INFO: renamed from: A */
    public void m116721A() {
        CoreModule.m30932N().mo61497Re(!CoreModule.m30932N().mo61572sh());
        i4g0.m138523u("e_video_voice_switch", this.f89496f.pageId(), jyb.m147494Y("voiceswitch", CoreModule.m30932N().mo61572sh() ? BLiveOperationTitleShowType.off : "on"));
        m116732O(this.f89499i);
    }

    /* JADX INFO: renamed from: D */
    public final View m116722D(Media media) {
        final PhotoPreviewView photoPreviewView = new PhotoPreviewView(this.f89496f);
        photoPreviewView.m45127N((Picture) media, false);
        photoPreviewView.setReplayVisibility(8);
        photoPreviewView.setOnTapListener(new PhotoPreviewView.InterfaceC8426c() { // from class: l.al5
            @Override // com.p051p1.mobile.putong.core.p058ui.PhotoPreviewView.InterfaceC8426c
            /* JADX INFO: renamed from: a */
            public final void mo45133a() {
                this.f72072a.m116727J(photoPreviewView);
            }
        });
        photoPreviewView.f28870a.setOnDragDismissListenler(this.f89503m);
        return photoPreviewView;
    }

    /* JADX INFO: renamed from: E */
    public final View m116723E(Video video) {
        PlayerView playerView = new PlayerView(this.f89496f);
        playerView.setProgressBarsEnabled(false);
        ie80 ie80VarM116724F = m116724F(video.url);
        ie80VarM116724F.mo139591a("profile");
        playerView.setPlayer(ie80VarM116724F);
        playerView.f28963h.setBackground(null);
        playerView.setVideo(video);
        playerView.m45231x(bnl0.m105592y0(), bnl0.m105588w0() - bnl0.m105511F0());
        playerView.setReplayVisibility(4);
        this.f89509s = -1;
        pb1.m171472b().mo171477f("CommonMediaPreviewAdapter", AudioBusinessType.NORMAL, this.f89510t);
        if (!TextUtils.isEmpty(video.formatAspectRatio())) {
            uqb0.m197246S0(video.formatAspectRatio());
        }
        playerView.m45225K();
        playerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.zk5
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return dl5.m116713q(view);
            }
        });
        playerView.m45230v(new C16569a());
        return playerView;
    }

    /* JADX INFO: renamed from: F */
    public ie80 m116724F(String str) {
        if (!NullChecker.m82486a(str) || str.startsWith("http")) {
            if (this.f89501k == null) {
                this.f89501k = new ye80();
            }
            return this.f89501k;
        }
        if (this.f89500j == null) {
            this.f89500j = new re80();
        }
        return this.f89500j;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m116725H(Media media) {
        return (media instanceof Picture) && NullChecker.m82486a(((Picture) media).livePhoto);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m116726I() {
        m116729L(true);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m116727J(PhotoPreviewView photoPreviewView) {
        photoPreviewView.postDelayed(new Runnable() { // from class: l.bl5
            @Override // java.lang.Runnable
            public final void run() {
                this.f77146a.m116726I();
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m116728K(C4470c c4470c) {
        if (c4470c == C4470c.f16267i && NullChecker.m82486a(this.f89499i)) {
            this.f89499i.m45225K();
        }
    }

    /* JADX INFO: renamed from: L */
    public void m116729L(boolean z) {
        if (NullChecker.m82486a(this.f89498h)) {
            this.f89498h.mo173330g();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m116730M() {
        if (NullChecker.m82486a(this.f89501k)) {
            this.f89501k.release();
        }
        if (NullChecker.m82486a(this.f89500j)) {
            this.f89500j.release();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m116731N(pq80 pq80Var) {
        this.f89498h = pq80Var;
        this.f89504n = pq80Var.mo173328e();
    }

    /* JADX INFO: renamed from: O */
    public void m116732O(PlayerView playerView) {
        if (NullChecker.m82486a(playerView)) {
            playerView.m45222H(CoreModule.m30932N().mo61572sh());
        }
        if (NullChecker.m82486a(this.f89508r)) {
            bnl0.m105525M0(this.f89508r, true);
            this.f89508r.setImageResource(CoreModule.m30932N().mo61572sh() ? dbc0.f86516Qr : dbc0.f86548Rr);
            if (CoreModule.m30932N().mo61554ln().get().booleanValue() || gra.m131650Y2()) {
                return;
            }
            this.f89508r.post(new Runnable() { // from class: l.cl5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f82347a.m116735R();
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public void m116733P(boolean z) {
        this.f89506p = z;
    }

    /* JADX INFO: renamed from: Q */
    public final void m116734Q() {
        this.f89496f.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.yk5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200374a.m116728K((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public void m116735R() {
        CoreModule.m30932N().mo61554ln().put(Boolean.TRUE);
        C4499d.m21895l().m21908u(new C4496a(this.f89496f).m21848D("视频声音默认关闭，单击开启").m21869k(this.f89496f.getResources().getColor(c9c0.f80342I)).m21854J(13.0f).m21849E(true).m21860b(10000L).m21863e(true).m21874q(C4496a.f16399N | C4496a.f16401P).m21872o(C4496a.f16401P, qa00.m175859d(6.0f)), this.f89508r, "preview_vedio_voice_mute");
    }

    /* JADX INFO: renamed from: S */
    public void m116736S() {
        if (NullChecker.m82486a(this.f89501k)) {
            this.f89501k.stop();
        }
        if (NullChecker.m82486a(this.f89500j)) {
            this.f89500j.stop();
        }
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f89497g.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(@NonNull Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view.getTag().equals(obj);
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
        if (NullChecker.m82486a(viewFindViewWithTag)) {
            if (viewFindViewWithTag instanceof PlayerView) {
                ((PlayerView) viewFindViewWithTag).setPlayer(null);
            } else if (viewFindViewWithTag instanceof PhotoPreviewView) {
                ((PhotoPreviewView) viewFindViewWithTag).m45126M();
            }
            viewFindViewWithTag.setTag(null);
            viewGroup.removeView(viewFindViewWithTag);
        }
    }

    public void onPageSelected(int i) {
        if (this.f89507q != i && NullChecker.m82486a(this.f89499i)) {
            if (NullChecker.m82486a(this.f89501k)) {
                this.f89501k.stop();
            }
            if (NullChecker.m82486a(this.f89500j)) {
                this.f89500j.stop();
            }
        }
        this.f89507q = i;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        View viewM116711C = m116711C(this.f89497g.get(i), i);
        viewM116711C.setTag(Integer.valueOf(i));
        viewGroup.addView(viewM116711C);
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: x */
    public void m116737x(rae raeVar) {
        this.f89503m.m209846g(raeVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: z */
    public final View m116738z(View view, Media media) {
        if (!(media instanceof Video)) {
            if (media instanceof Picture) {
                Dimension dimension = ((Picture) media).size;
                if (!vnb.m201958r1(dimension.width, dimension.height)) {
                    if (!m116725H(media)) {
                        return view;
                    }
                }
            } else if (!m116725H(media)) {
                return view;
            }
        }
        return m116720y(view, media);
    }
}
