package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.PhotoPreviewView;
import com.p046p1.mobile.putong.core.p053ui.PlayerView;
import com.p046p1.mobile.putong.core.p053ui.mediapreview.DragDismissContainerView;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VImage;

/* JADX INFO: loaded from: classes3.dex */
public class ck5 extends eb2 {

    /* JADX INFO: renamed from: f */
    public final Act f81277f;

    /* JADX INFO: renamed from: g */
    public final List<Media> f81278g;

    /* JADX INFO: renamed from: h */
    public li80 f81279h;

    /* JADX INFO: renamed from: i */
    public PlayerView f81280i;

    /* JADX INFO: renamed from: j */
    public c680 f81281j;

    /* JADX INFO: renamed from: k */
    public c680 f81282k;

    /* JADX INFO: renamed from: l */
    public DragDismissContainerView f81283l;

    /* JADX INFO: renamed from: n */
    public c680.C16085c f81285n;

    /* JADX INFO: renamed from: o */
    public boolean f81286o;

    /* JADX INFO: renamed from: p */
    public boolean f81287p;

    /* JADX INFO: renamed from: q */
    public int f81288q;

    /* JADX INFO: renamed from: r */
    public VImage f81289r;

    /* JADX INFO: renamed from: e */
    public boolean f81276e = false;

    /* JADX INFO: renamed from: m */
    public final t9e f81284m = new t9e();

    /* JADX INFO: renamed from: s */
    public int f81290s = 0;

    /* JADX INFO: renamed from: t */
    public z91 f81291t = new C16180b();

    /* JADX INFO: renamed from: l.ck5$a */
    public class C16179a extends c680.C16085c {
        public C16179a() {
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: a */
        public void mo44050a(Exception exc) {
            super.mo44050a(exc);
            if (NullChecker.m81303a(ck5.this.f81285n)) {
                ck5.this.f81285n.mo44050a(exc);
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            super.mo44053d();
            if (NullChecker.m81303a(ck5.this.f81285n)) {
                ck5.this.f81285n.mo44053d();
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onComplete() {
            super.onComplete();
            if (NullChecker.m81303a(ck5.this.f81285n)) {
                ck5.this.f81285n.onComplete();
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onPause() {
            super.onPause();
            if (NullChecker.m81303a(ck5.this.f81285n)) {
                ck5.this.f81285n.onPause();
            }
            ck5.this.m107376L(false);
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onResume() {
            super.onResume();
            if (NullChecker.m81303a(ck5.this.f81285n)) {
                ck5.this.f81285n.onResume();
            }
            ck5.this.m107376L(false);
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onStart() {
            if (NullChecker.m81303a(ck5.this.f81285n)) {
                ck5.this.f81285n.onStart();
            }
            fb1.m120341a(null, 1);
        }
    }

    /* JADX INFO: renamed from: l.ck5$b */
    public class C16180b implements z91 {
        public C16180b() {
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            if (ck5.this.f81290s == -1) {
                ck5 ck5Var = ck5.this;
                ck5Var.m107379O(ck5Var.f81280i);
            } else {
                if (CoreModule.m29934N().mo60388sh()) {
                    return;
                }
                ck5.this.m107368A();
            }
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (!ib1.m135233b().mo135236d(audioBusinessType2)) {
                ib1.m135233b().mo135239g(str, audioBusinessType, z91Var);
                int i = ck5.this.f81290s;
                ck5 ck5Var = ck5.this;
                if (i == -1) {
                    ck5Var.m107379O(ck5Var.f81280i);
                    return;
                } else {
                    ck5Var.m107368A();
                    return;
                }
            }
            osi0.m165783g(audioBusinessType2.getBusinessMsg());
            if (ck5.this.f81290s == -1) {
                boolean zMo60388sh = CoreModule.m29934N().mo60388sh();
                ck5 ck5Var2 = ck5.this;
                if (zMo60388sh) {
                    ck5Var2.m107379O(ck5Var2.f81280i);
                } else {
                    ck5Var2.m107368A();
                }
            }
        }

        @Override // p149l.z91
        public void success() {
            int i = ck5.this.f81290s;
            ck5 ck5Var = ck5.this;
            if (i == -1) {
                ck5Var.m107379O(ck5Var.f81280i);
            } else {
                ck5Var.m107368A();
            }
        }
    }

    public ck5(Act act, List<Media> list) {
        this.f81277f = act;
        this.f81278g = list;
    }

    /* JADX INFO: renamed from: C */
    private View m107358C(Media media, int i) {
        View viewM107370E;
        if (media instanceof Picture) {
            viewM107370E = m107369D(media);
        } else {
            viewM107370E = media instanceof Video ? m107370E((Video) media) : null;
        }
        if (NullChecker.m81303a(this.f81279h)) {
            this.f81279h.m149881d(i, viewM107370E);
        }
        if (viewM107370E instanceof PlayerView) {
            this.f81280i = (PlayerView) viewM107370E;
            m107381Q();
        }
        return m107385z(viewM107370E, media);
    }

    /* JADX INFO: renamed from: G */
    private void m107359G(Media media) {
        this.f81283l.setId(u4c0.f174551x9);
        if (media instanceof Video) {
            Video video = (Video) media;
            this.f81283l.setOriginalHeight(video.size.height);
            this.f81283l.setOriginalWidth(video.size.width);
        } else if (media instanceof Picture) {
            Picture picture = (Picture) media;
            this.f81283l.setOriginalHeight(Math.min(xdl0.m208408w0(), picture.size.height));
            this.f81283l.setOriginalWidth(picture.size.width);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ boolean m107360q(View view) {
        return true;
    }

    /* JADX INFO: renamed from: y */
    private View m107367y(View view, Media media) {
        DragDismissContainerView dragDismissContainerView = new DragDismissContainerView(this.f81277f, this.f81276e);
        this.f81283l = dragDismissContainerView;
        dragDismissContainerView.setFeedDragDismissListener(this.f81284m);
        this.f81283l.setInnerContentView(view);
        if (this.f81286o) {
            this.f81283l.setZoomAnimationKey(Media.URL_TO_CACHEKEY(media.url));
        }
        m107359G(media);
        return this.f81283l;
    }

    /* JADX INFO: renamed from: A */
    public void m107368A() {
        CoreModule.m29934N().mo60313Re(!CoreModule.m29934N().mo60388sh());
        zvf0.m220399u("e_video_voice_switch", this.f81277f.pageId(), vwb.m200311Y("voiceswitch", CoreModule.m29934N().mo60388sh() ? BLiveOperationTitleShowType.off : "on"));
        m107379O(this.f81280i);
    }

    /* JADX INFO: renamed from: D */
    public final View m107369D(Media media) {
        final PhotoPreviewView photoPreviewView = new PhotoPreviewView(this.f81277f);
        photoPreviewView.m43944N((Picture) media, false);
        photoPreviewView.setReplayVisibility(8);
        photoPreviewView.setOnTapListener(new PhotoPreviewView.InterfaceC8263c() { // from class: l.zj5
            @Override // com.p046p1.mobile.putong.core.p053ui.PhotoPreviewView.InterfaceC8263c
            /* JADX INFO: renamed from: a */
            public final void mo43950a() {
                this.f203380a.m107374J(photoPreviewView);
            }
        });
        photoPreviewView.f28022a.setOnDragDismissListenler(this.f81284m);
        return photoPreviewView;
    }

    /* JADX INFO: renamed from: E */
    public final View m107370E(Video video) {
        PlayerView playerView = new PlayerView(this.f81277f);
        playerView.setProgressBarsEnabled(false);
        c680 c680VarM107371F = m107371F(video.url);
        c680VarM107371F.mo105366a("profile");
        playerView.setPlayer(c680VarM107371F);
        playerView.f28115h.setBackground(null);
        playerView.setVideo(video);
        playerView.m44048x(xdl0.m208412y0(), xdl0.m208408w0() - xdl0.m208331F0());
        playerView.setReplayVisibility(4);
        this.f81290s = -1;
        ib1.m135233b().mo135238f("CommonMediaPreviewAdapter", AudioBusinessType.NORMAL, this.f81291t);
        if (!TextUtils.isEmpty(video.formatAspectRatio())) {
            qib0.m174792S0(video.formatAspectRatio());
        }
        playerView.m44042K();
        playerView.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.yj5
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return ck5.m107360q(view);
            }
        });
        playerView.m44047v(new C16179a());
        return playerView;
    }

    /* JADX INFO: renamed from: F */
    public c680 m107371F(String str) {
        if (!NullChecker.m81303a(str) || str.startsWith("http")) {
            if (this.f81282k == null) {
                this.f81282k = new s680();
            }
            return this.f81282k;
        }
        if (this.f81281j == null) {
            this.f81281j = new l680();
        }
        return this.f81281j;
    }

    /* JADX INFO: renamed from: H */
    public final boolean m107372H(Media media) {
        return (media instanceof Picture) && NullChecker.m81303a(((Picture) media).livePhoto);
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m107373I() {
        m107376L(true);
    }

    /* JADX INFO: renamed from: J */
    public final /* synthetic */ void m107374J(PhotoPreviewView photoPreviewView) {
        photoPreviewView.postDelayed(new Runnable() { // from class: l.ak5
            @Override // java.lang.Runnable
            public final void run() {
                this.f70238a.m107373I();
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: K */
    public final /* synthetic */ void m107375K(C4319c c4319c) {
        if (c4319c == C4319c.f15548i && NullChecker.m81303a(this.f81280i)) {
            this.f81280i.m44042K();
        }
    }

    /* JADX INFO: renamed from: L */
    public void m107376L(boolean z) {
        if (NullChecker.m81303a(this.f81279h)) {
            this.f81279h.mo149884g();
        }
    }

    /* JADX INFO: renamed from: M */
    public void m107377M() {
        if (NullChecker.m81303a(this.f81282k)) {
            this.f81282k.release();
        }
        if (NullChecker.m81303a(this.f81281j)) {
            this.f81281j.release();
        }
    }

    /* JADX INFO: renamed from: N */
    public void m107378N(li80 li80Var) {
        this.f81279h = li80Var;
        this.f81285n = li80Var.mo149882e();
    }

    /* JADX INFO: renamed from: O */
    public void m107379O(PlayerView playerView) {
        if (NullChecker.m81303a(playerView)) {
            playerView.m44039H(CoreModule.m29934N().mo60388sh());
        }
        if (NullChecker.m81303a(this.f81289r)) {
            xdl0.m208345M0(this.f81289r, true);
            this.f81289r.setImageResource(CoreModule.m29934N().mo60388sh() ? x2c0.f190057cr : x2c0.f190088dr);
            if (CoreModule.m29934N().mo60370ln().get().booleanValue() || upa.m194719Y2()) {
                return;
            }
            this.f81289r.post(new Runnable() { // from class: l.bk5
                @Override // java.lang.Runnable
                public final void run() {
                    this.f75965a.m107382R();
                }
            });
        }
    }

    /* JADX INFO: renamed from: P */
    public void m107380P(boolean z) {
        this.f81287p = z;
    }

    /* JADX INFO: renamed from: Q */
    public final void m107381Q() {
        this.f81277f.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.xj5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193178a.m107375K((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public void m107382R() {
        CoreModule.m29934N().mo60370ln().put(Boolean.TRUE);
        C4348d.m20896l().m20909u(new C4345a(this.f81277f).m20849D("视频声音默认关闭，单击开启").m20870k(this.f81277f.getResources().getColor(w0c0.f183773I)).m20855J(13.0f).m20850E(true).m20861b(10000L).m20864e(true).m20875q(C4345a.f15680N | C4345a.f15682P).m20873o(C4345a.f15682P, t100.m186890d(6.0f)), this.f81289r, "preview_vedio_voice_mute");
    }

    /* JADX INFO: renamed from: S */
    public void m107383S() {
        if (NullChecker.m81303a(this.f81282k)) {
            this.f81282k.stop();
        }
        if (NullChecker.m81303a(this.f81281j)) {
            this.f81281j.stop();
        }
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f81278g.size();
    }

    @Override // p149l.w660
    public int getItemPosition(@NonNull Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // p149l.w660
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        return view.getTag().equals(obj);
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
        if (NullChecker.m81303a(viewFindViewWithTag)) {
            if (viewFindViewWithTag instanceof PlayerView) {
                ((PlayerView) viewFindViewWithTag).setPlayer(null);
            } else if (viewFindViewWithTag instanceof PhotoPreviewView) {
                ((PhotoPreviewView) viewFindViewWithTag).m43943M();
            }
            viewFindViewWithTag.setTag(null);
            viewGroup.removeView(viewFindViewWithTag);
        }
    }

    public void onPageSelected(int i) {
        if (this.f81288q != i && NullChecker.m81303a(this.f81280i)) {
            if (NullChecker.m81303a(this.f81282k)) {
                this.f81282k.stop();
            }
            if (NullChecker.m81303a(this.f81281j)) {
                this.f81281j.stop();
            }
        }
        this.f81288q = i;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        View viewM107358C = m107358C(this.f81278g.get(i), i);
        viewM107358C.setTag(Integer.valueOf(i));
        viewGroup.addView(viewM107358C);
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: x */
    public void m107384x(n9e n9eVar) {
        this.f81284m.m187629g(n9eVar);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: z */
    public final View m107385z(View view, Media media) {
        if (!(media instanceof Video)) {
            if (media instanceof Picture) {
                Dimension dimension = ((Picture) media).size;
                if (!hmb.m131713r1(dimension.width, dimension.height)) {
                    if (!m107372H(media)) {
                        return view;
                    }
                }
            } else if (!m107372H(media)) {
                return view;
            }
        }
        return m107367y(view, media);
    }
}
