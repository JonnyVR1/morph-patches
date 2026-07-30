package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.LivePhoto;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView;
import com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView;
import com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p051p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p051p1.mobile.putong.feed.newui.view.FeedDragDismissContainerView;
import com.p051p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p151v.VImage;

/* JADX INFO: loaded from: classes13.dex */
public class wf70 extends lb2 {

    /* JADX INFO: renamed from: y */
    public static boolean f188748y = false;

    /* JADX INFO: renamed from: e */
    public FeedDragDismissContainerView f188749e;

    /* JADX INFO: renamed from: f */
    public FeedVideoLikeContainerView f188750f;

    /* JADX INFO: renamed from: g */
    public ie80 f188751g;

    /* JADX INFO: renamed from: h */
    public ie80 f188752h;

    /* JADX INFO: renamed from: i */
    public z3h f188753i;

    /* JADX INFO: renamed from: j */
    public ie80.C17711c f188754j;

    /* JADX INFO: renamed from: k */
    public Act f188755k;

    /* JADX INFO: renamed from: l */
    public ArrayList<Media> f188756l;

    /* JADX INFO: renamed from: m */
    public Moment f188757m;

    /* JADX INFO: renamed from: n */
    public boolean f188758n;

    /* JADX INFO: renamed from: o */
    public int f188759o;

    /* JADX INFO: renamed from: p */
    public PhotoAlbumPlayerView f188760p;

    /* JADX INFO: renamed from: s */
    public jxh f188763s;

    /* JADX INFO: renamed from: u */
    public VImage f188765u;

    /* JADX INFO: renamed from: q */
    public HashMap<Integer, PhotoAlbumLivePhotoView> f188761q = new HashMap<>();

    /* JADX INFO: renamed from: r */
    public boolean f188762r = true;

    /* JADX INFO: renamed from: t */
    public boolean f188764t = false;

    /* JADX INFO: renamed from: v */
    public boolean f188766v = false;

    /* JADX INFO: renamed from: w */
    public int f188767w = 0;

    /* JADX INFO: renamed from: x */
    public ga1 f188768x = new C21094c();

    /* JADX INFO: renamed from: l.wf70$a */
    public class C21092a extends ie80.C17711c {
        public C21092a() {
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: a */
        public void mo45233a(Exception exc) {
            super.mo45233a(exc);
            if (NullChecker.m82486a(wf70.this.f188754j)) {
                wf70.this.f188754j.mo45233a(exc);
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            super.mo45236d();
            if (NullChecker.m82486a(wf70.this.f188754j)) {
                wf70.this.f188754j.mo45236d();
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onComplete() {
            super.onComplete();
            if (NullChecker.m82486a(wf70.this.f188754j)) {
                wf70.this.f188754j.onComplete();
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onPause() {
            super.onPause();
            if (NullChecker.m82486a(wf70.this.f188754j)) {
                wf70.this.f188754j.onPause();
            }
            wf70.this.m206086c0(false);
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onResume() {
            super.onResume();
            if (NullChecker.m82486a(wf70.this.f188754j)) {
                wf70.this.f188754j.onResume();
            }
            wf70.this.m206086c0(false);
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onStart() {
            if (NullChecker.m82486a(wf70.this.f188754j)) {
                wf70.this.f188754j.onStart();
            }
            lb1.m153552b(null, 1);
        }
    }

    /* JADX INFO: renamed from: l.wf70$b */
    public class C21093b extends ie80.C17711c {
        public C21093b() {
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: a */
        public void mo45233a(Exception exc) {
            super.mo45233a(exc);
            if (NullChecker.m82486a(wf70.this.f188754j)) {
                wf70.this.f188754j.mo45233a(exc);
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            super.mo45236d();
            if (NullChecker.m82486a(wf70.this.f188754j)) {
                wf70.this.f188754j.mo45236d();
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onComplete() {
            super.onComplete();
            if (NullChecker.m82486a(wf70.this.f188754j)) {
                wf70.this.f188754j.onComplete();
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onPause() {
            super.onPause();
            if (NullChecker.m82486a(wf70.this.f188754j)) {
                wf70.this.f188754j.onPause();
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onResume() {
            super.onResume();
            if (NullChecker.m82486a(wf70.this.f188754j)) {
                wf70.this.f188754j.onResume();
            }
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onStart() {
            if (NullChecker.m82486a(wf70.this.f188754j)) {
                wf70.this.f188754j.onStart();
            }
            lb1.m153552b(null, 1);
        }
    }

    /* JADX INFO: renamed from: l.wf70$c */
    public class C21094c implements ga1 {
        public C21094c() {
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: b */
        public void mo40108b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            if (wf70.this.f188767w == -1) {
                wf70 wf70Var = wf70.this;
                wf70Var.m206092i0(wf70Var.f188760p);
                return;
            }
            if (!FeedModule.f39703d.f121299H) {
                wf70.this.m206071H();
            }
            if (wf70.this.m206057R()) {
                return;
            }
            wf70.this.m206097p0();
        }

        @Override // p153l.ga1
        /* JADX INFO: renamed from: d */
        public void mo40109d(String str, AudioBusinessType audioBusinessType, ga1 ga1Var, String str2, AudioBusinessType audioBusinessType2) {
            if (!pb1.m171472b().mo171475d(audioBusinessType2)) {
                pb1.m171472b().mo171478g(str, audioBusinessType, ga1Var);
                int i = wf70.this.f188767w;
                wf70 wf70Var = wf70.this;
                if (i == -1) {
                    wf70Var.m206092i0(wf70Var.f188760p);
                    return;
                } else {
                    wf70Var.m206071H();
                    wf70.this.m206097p0();
                    return;
                }
            }
            r1j0.m179420g(audioBusinessType2.getBusinessMsg());
            if (wf70.this.f188767w == -1) {
                if (!wf70.this.m206057R()) {
                    wf70.this.m206097p0();
                }
                boolean z = FeedModule.f39703d.f121299H;
                wf70 wf70Var2 = wf70.this;
                if (z) {
                    wf70Var2.m206092i0(wf70Var2.f188760p);
                } else {
                    wf70Var2.m206071H();
                }
            }
        }

        @Override // p153l.ga1
        public void success() {
            int i = wf70.this.f188767w;
            wf70 wf70Var = wf70.this;
            if (i == -1) {
                wf70Var.m206092i0(wf70Var.f188760p);
            } else {
                wf70Var.m206071H();
                wf70.this.m206097p0();
            }
        }
    }

    public wf70(Act act, ArrayList<Media> arrayList, Moment moment) {
        this.f188755k = act;
        this.f188756l = arrayList;
        this.f188757m = moment;
    }

    /* JADX INFO: renamed from: F */
    private View m206051F(View view, Media media) {
        FeedDragDismissContainerView feedDragDismissContainerView = new FeedDragDismissContainerView(this.f188755k, this.f188764t);
        this.f188749e = feedDragDismissContainerView;
        feedDragDismissContainerView.setFeedDragDismissListener(this.f188753i);
        this.f188749e.setInnerContentView(view);
        if (m206056Q(media) && (view instanceof PhotoAlbumLivePhotoView)) {
            this.f188749e.setFeedDragDismissBackListener(((PhotoAlbumLivePhotoView) view).getDragBackListener());
        }
        if (this.f188762r) {
            this.f188749e.setZoomAnimationKey(Media.URL_TO_CACHEKEY(media.url));
        }
        m206055P(media);
        return this.f188749e;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: G */
    private View m206052G(View view, Media media) {
        if (!(media instanceof Video)) {
            if (media instanceof Picture) {
                Dimension dimension = ((Picture) media).size;
                if (!ksg.m151223p0(dimension.width, dimension.height)) {
                    if (!m206056Q(media)) {
                        return view;
                    }
                }
            } else if (!m206056Q(media)) {
                return view;
            }
        }
        return m206051F(view, media);
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    private View m206053L(final Media media) {
        final PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView = new PhotoAlbumPhotoPreviewView(this.f188755k);
        photoAlbumPhotoPreviewView.m66577V((Picture) media, false);
        photoAlbumPhotoPreviewView.setOnLongPressListener(new PhotoAlbumPhotoPreviewView.InterfaceC11484b() { // from class: l.qf70
            @Override // com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView.InterfaceC11484b
            /* JADX INFO: renamed from: a */
            public final boolean mo66579a() {
                return this.f157273a.m206079U(media);
            }
        });
        photoAlbumPhotoPreviewView.setOnTapListener(new PhotoAlbumPhotoPreviewView.InterfaceC11485c() { // from class: l.rf70
            @Override // com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView.InterfaceC11485c
            /* JADX INFO: renamed from: a */
            public final void mo63519a() {
                this.f162765a.m206081W(photoAlbumPhotoPreviewView);
            }
        });
        if (this.f188758n) {
            photoAlbumPhotoPreviewView.f43504a.setOnDragDismissListenler(this.f188753i);
        }
        return photoAlbumPhotoPreviewView;
    }

    /* JADX INFO: renamed from: N */
    public static void m206054N() {
        if (C4499d.m21895l().m21911x("moment_preview_vedio_voice_mute")) {
            C4499d.m21895l().m21899k("moment_preview_vedio_voice_mute");
        }
    }

    /* JADX INFO: renamed from: P */
    private void m206055P(Media media) {
        this.f188749e.setId(hdc0.f108949o1);
        if (media instanceof Video) {
            Video video = (Video) media;
            this.f188749e.setOriginalHeight(video.size.height);
            this.f188749e.setOriginalWidth(video.size.width);
        } else if (media instanceof Picture) {
            Picture picture = (Picture) media;
            this.f188749e.setOriginalHeight(Math.min(bnl0.m105588w0(), picture.size.height));
            this.f188749e.setOriginalWidth(picture.size.width);
        }
    }

    /* JADX INFO: renamed from: Q */
    private boolean m206056Q(Media media) {
        return cmg.m111240v0() && (media instanceof Picture) && NullChecker.m82486a(((Picture) media).livePhoto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public boolean m206057R() {
        try {
            String strM80485F = RemoteConfig.m80481x().m80485F("livephoto_function");
            if (!TextUtils.isEmpty(strM80485F)) {
                new JSONObject(strM80485F);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    private Video m206058b0(Picture picture) {
        Video video = new Video();
        Picture pictureNew_ = Picture.new_();
        video.cover = pictureNew_;
        pictureNew_.url = picture.url;
        pictureNew_.urlKey = Media.URL_TO_CACHEKEY(picture.url);
        Picture picture2 = video.cover;
        picture2.mediaType = picture.mediaType;
        MediaLocalStatus mediaLocalStatus = picture.status;
        if (mediaLocalStatus == null) {
            picture2.status = MediaLocalStatus.get("normal");
        } else {
            picture2.status = mediaLocalStatus;
        }
        Picture picture3 = video.cover;
        picture3.labels = picture.labels;
        picture3.gaussianBlurParameters = picture.gaussianBlurParameters;
        picture3.size = picture.size;
        LivePhoto livePhoto = picture.livePhoto;
        video.url = livePhoto.url;
        video.mediaType = livePhoto.mediaType;
        video.duration = livePhoto.duration;
        video.size = livePhoto.size;
        return video;
    }

    /* JADX INFO: renamed from: k0 */
    private void m206059k0() {
        this.f188755k.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.mf70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f136617a.m206084Z((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public static void m206060l0(boolean z) {
        f188748y = z;
    }

    /* JADX INFO: renamed from: H */
    public void m206071H() {
        jka jkaVar = FeedModule.f39703d;
        boolean z = jkaVar.f121299H;
        jkaVar.f121299H = !z;
        i4g0.m138523u("e_video_voice_switch", "p_moment_preview", jyb.m147494Y("voiceswitch", !z ? BLiveOperationTitleShowType.off : "on"));
        m206092i0(this.f188760p);
    }

    /* JADX INFO: renamed from: I */
    public final PhotoAlbumLivePhotoView m206072I() {
        if (NullChecker.m82486a(this.f188761q) && this.f188761q.containsKey(Integer.valueOf(this.f188759o))) {
            return this.f188761q.get(Integer.valueOf(this.f188759o));
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public View m206073J(Media media, int i) {
        View viewM206075M;
        if (m206056Q(media)) {
            viewM206075M = m206074K((Picture) media);
        } else if (media instanceof Picture) {
            viewM206075M = m206053L(media);
        } else {
            viewM206075M = media instanceof Video ? m206075M((Video) media) : null;
        }
        if (NullChecker.m82486a(this.f188763s)) {
            this.f188763s.m147343d(i, viewM206075M);
        }
        boolean z = viewM206075M instanceof PhotoAlbumPlayerView;
        if (z) {
            this.f188760p = (PhotoAlbumPlayerView) viewM206075M;
            m206059k0();
        } else if (viewM206075M instanceof PhotoAlbumLivePhotoView) {
            this.f188761q.put(Integer.valueOf(i), (PhotoAlbumLivePhotoView) viewM206075M);
            if (this.f188761q.size() == 1) {
                m206059k0();
            }
        }
        View viewM206052G = m206052G(viewM206075M, media);
        if (!z && !(viewM206075M instanceof PhotoAlbumLivePhotoView)) {
            return viewM206052G;
        }
        FeedVideoLikeContainerView feedVideoLikeContainerView = new FeedVideoLikeContainerView(this.f188755k);
        this.f188750f = feedVideoLikeContainerView;
        feedVideoLikeContainerView.addView(viewM206052G, 0);
        if (NullChecker.m82486a(this.f188763s)) {
            this.f188763s.mo107418l(this.f188750f);
        }
        return this.f188750f;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final PhotoAlbumLivePhotoView m206074K(Picture picture) {
        Video videoM206058b0 = m206058b0(picture);
        final PhotoAlbumLivePhotoView photoAlbumLivePhotoView = new PhotoAlbumLivePhotoView(this.f188755k);
        photoAlbumLivePhotoView.setProgressBarsEnabled(false);
        m206076O(videoM206058b0.url).mo139591a(Moments.TYPE);
        photoAlbumLivePhotoView.setPlayer(m206076O(videoM206058b0.url));
        photoAlbumLivePhotoView.setVideo(videoM206058b0);
        photoAlbumLivePhotoView.m66544q(bnl0.m105592y0(), bnl0.m105588w0() - bnl0.m105511F0());
        this.f188767w = -1;
        pb1.m171472b().mo171477f("PhotoAlbumFeedPreviewAdapter", AudioBusinessType.NORMAL, this.f188768x);
        if (!TextUtils.isEmpty(videoM206058b0.formatAspectRatio())) {
            uqb0.m197246S0(videoM206058b0.formatAspectRatio());
        }
        photoAlbumLivePhotoView.setOnTapListener(new PhotoAlbumPhotoPreviewView.InterfaceC11485c() { // from class: l.pf70
            @Override // com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView.InterfaceC11485c
            /* JADX INFO: renamed from: a */
            public final void mo63519a() {
                this.f152158a.m206078T(photoAlbumLivePhotoView);
            }
        });
        photoAlbumLivePhotoView.m66542o(new C21093b());
        return photoAlbumLivePhotoView;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final PhotoAlbumPlayerView m206075M(Video video) {
        PhotoAlbumPlayerView photoAlbumPlayerView = new PhotoAlbumPlayerView(this.f188755k);
        photoAlbumPlayerView.f43519h.setBackground(null);
        photoAlbumPlayerView.f43520i.setImageResource(j4h.m143424h() ? lbc0.f130952U3 : lbc0.f130945T3);
        photoAlbumPlayerView.setOnClickButtonListener(new PhotoAlbumPlayerView.InterfaceC11488c() { // from class: l.of70
            @Override // com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView.InterfaceC11488c
            /* JADX INFO: renamed from: a */
            public final void mo66616a(boolean z) {
                this.f147054a.m206082X(z);
            }
        });
        m206087d0(photoAlbumPlayerView);
        photoAlbumPlayerView.setProgressBarsEnabled(false);
        m206076O(video != null ? video.url : "").mo139591a(Moments.TYPE);
        photoAlbumPlayerView.setPlayer(m206076O(video != null ? video.url : ""));
        photoAlbumPlayerView.setVideo(video);
        photoAlbumPlayerView.m66609t(bnl0.m105592y0(), bnl0.m105588w0() - bnl0.m105511F0());
        this.f188767w = -1;
        pb1.m171472b().mo171477f("PhotoAlbumFeedPreviewAdapter", AudioBusinessType.NORMAL, this.f188768x);
        if (NullChecker.m82487b(video) && !TextUtils.isEmpty(video.formatAspectRatio())) {
            uqb0.m197246S0(video.formatAspectRatio());
        }
        photoAlbumPlayerView.m66607r(new C21092a());
        return photoAlbumPlayerView;
    }

    /* JADX INFO: renamed from: O */
    public ie80 m206076O(String str) {
        if (!NullChecker.m82486a(str) || str.startsWith("http")) {
            if (this.f188752h == null) {
                this.f188752h = new ye80();
            }
            return this.f188752h;
        }
        if (this.f188751g == null) {
            this.f188751g = new re80();
        }
        return this.f188751g;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m206077S() {
        m206086c0(true);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m206078T(PhotoAlbumLivePhotoView photoAlbumLivePhotoView) {
        photoAlbumLivePhotoView.postDelayed(new Runnable() { // from class: l.uf70
            @Override // java.lang.Runnable
            public final void run() {
                this.f178740a.m206077S();
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ boolean m206079U(Media media) {
        if (this.f188755k.lifecycle_() != C4470c.f16267i) {
            return true;
        }
        rzi.m183770Q(this.f188757m, new qcj() { // from class: l.tf70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return FeedModule.f39703d.m145603S6((Moment) obj);
            }
        }, FeedModule.f39703d.m145688e8(this.f188757m.owner), this.f188755k, "p_moment_preview", true, media);
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m206080V() {
        m206086c0(true);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m206081W(PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView) {
        photoAlbumPhotoPreviewView.postDelayed(new Runnable() { // from class: l.sf70
            @Override // java.lang.Runnable
            public final void run() {
                this.f167673a.m206080V();
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m206082X(boolean z) {
        this.f188766v = z;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m206084Z(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            if (!NullChecker.m82486a(this.f188760p)) {
                if (NullChecker.m82486a(m206072I())) {
                    m206072I().m66553z();
                }
            } else {
                m206092i0(this.f188760p);
                if (this.f188755k instanceof FeedVideoFlowAct) {
                    return;
                }
                this.f188760p.m66601F();
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m206085a0(View view) {
        if (!FeedModule.f39703d.f121299H) {
            m206071H();
        } else {
            this.f188767w = 0;
            pb1.m171472b().mo171477f("PhotoAlbumFeedPreviewAdapter", AudioBusinessType.NORMAL, this.f188768x);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m206086c0(boolean z) {
        if (NullChecker.m82486a(this.f188763s)) {
            this.f188763s.mo107414g();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m206088e0() {
        if (NullChecker.m82486a(this.f188752h)) {
            this.f188752h.release();
        }
        if (NullChecker.m82486a(this.f188751g)) {
            this.f188751g.release();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m206089f0(boolean z) {
        this.f188764t = z;
    }

    /* JADX INFO: renamed from: g0 */
    public void m206090g0(jxh jxhVar) {
        this.f188763s = jxhVar;
        this.f188754j = jxhVar.mo107412e();
    }

    @Override // p153l.cf60
    public int getCount() {
        return this.f188756l.size();
    }

    @Override // p153l.cf60
    public int getItemPosition(Object obj) {
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: h0 */
    public void m206091h0(z3h z3hVar) {
        this.f188753i = z3hVar;
    }

    /* JADX INFO: renamed from: i0 */
    public void m206092i0(PhotoAlbumPlayerView photoAlbumPlayerView) {
        if (NullChecker.m82486a(photoAlbumPlayerView)) {
            photoAlbumPlayerView.m66599D(FeedModule.f39703d.f121299H);
        }
        if (NullChecker.m82486a(this.f188765u)) {
            bnl0.m105525M0(this.f188765u, true);
            boolean zM143424h = j4h.m143424h();
            VImage vImage = this.f188765u;
            if (zM143424h) {
                vImage.setImageResource(FeedModule.f39703d.f121299H ? lbc0.f130905N5 : lbc0.f130919P5);
            } else {
                vImage.setImageResource(FeedModule.f39703d.f121299H ? lbc0.f130898M5 : lbc0.f130912O5);
            }
            if (FeedModule.f39703d.f121302I.get().booleanValue() || cmg.m111170A0()) {
                return;
            }
            this.f188765u.post(new Runnable() { // from class: l.vf70
                @Override // java.lang.Runnable
                public final void run() {
                    this.f183885a.m206083Y();
                }
            });
        }
    }

    @Override // p153l.cf60
    public boolean isViewFromObject(View view, Object obj) {
        return view.getTag().equals(obj);
    }

    /* JADX INFO: renamed from: j0 */
    public void m206093j0(boolean z) {
        this.f188758n = z;
    }

    /* JADX INFO: renamed from: m0 */
    public void m206094m0(VImage vImage) {
        this.f188765u = vImage;
        if (NullChecker.m82486a(vImage)) {
            bnl0.m105509E0(this.f188765u, new View.OnClickListener() { // from class: l.nf70
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f141715a.m206085a0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void m206083Y() {
        if (FeedModule.f39703d.f121302I.get().booleanValue()) {
            return;
        }
        FeedModule.f39703d.f121302I.put(Boolean.TRUE);
        C4499d.m21895l().m21908u(new C4496a(this.f188755k).m21848D("视频声音默认关闭，单击开启").m21869k(this.f188755k.getResources().getColor(j4h.m143424h() ? k9c0.f124511i : k9c0.f124521n)).m21854J(13.0f).m21849E(true).m21860b(10000L).m21863e(true).m21874q(C4496a.f16399N | C4496a.f16401P).m21872o(C4496a.f16401P, qa00.m175859d(6.0f)), this.f188765u, "moment_preview_vedio_voice_mute");
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: o */
    public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
        View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
        if (NullChecker.m82486a(viewFindViewWithTag)) {
            if (viewFindViewWithTag instanceof PhotoAlbumPlayerView) {
                ((PhotoAlbumPlayerView) viewFindViewWithTag).setPlayer(null);
            } else if (viewFindViewWithTag instanceof PhotoAlbumLivePhotoView) {
                ((PhotoAlbumLivePhotoView) viewFindViewWithTag).setPlayer(null);
            } else if (viewFindViewWithTag instanceof PhotoAlbumPhotoPreviewView) {
                ((PhotoAlbumPhotoPreviewView) viewFindViewWithTag).m66576T();
            }
            viewFindViewWithTag.setTag(null);
            viewGroup.removeView(viewFindViewWithTag);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m206096o0() {
        if (NullChecker.m82486a(this.f188752h)) {
            this.f188752h.stop();
        }
        if (NullChecker.m82486a(this.f188751g)) {
            this.f188751g.stop();
        }
    }

    public void onPageSelected(int i) {
        if (this.f188759o != i && NullChecker.m82486a(this.f188760p)) {
            if (NullChecker.m82486a(this.f188752h)) {
                this.f188752h.stop();
            }
            if (NullChecker.m82486a(this.f188751g)) {
                this.f188751g.stop();
            }
        }
        if (this.f188759o != i && NullChecker.m82486a(this.f188761q)) {
            if (NullChecker.m82486a(m206072I())) {
                m206072I().m66540B();
            }
            this.f188759o = i;
            if (NullChecker.m82486a(m206072I())) {
                m206072I().m66553z();
            }
        }
        this.f188759o = i;
    }

    @Override // p153l.lb2
    /* JADX INFO: renamed from: p */
    public Object mo40046p(ViewGroup viewGroup, int i) {
        View viewM206073J = m206073J(this.f188756l.get(i), i);
        viewM206073J.setTag(Integer.valueOf(i));
        viewGroup.addView(viewM206073J);
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: p0 */
    public void m206097p0() {
        if (NullChecker.m82486a(m206072I())) {
            m206072I().m66551x(!m206057R());
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m206087d0(PhotoAlbumPlayerView photoAlbumPlayerView) {
    }
}
