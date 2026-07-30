package p007l;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.LivePhoto;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Moments;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView;
import com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView;
import com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p000p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p000p1.mobile.putong.feed.newui.view.FeedDragDismissContainerView;
import com.p000p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import l.c680;
import l.e30;
import l.eb2;
import l.ib1;
import l.j760;
import l.l680;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.s680;
import l.t100;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.z91;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class q770 extends eb2 {

    /* JADX INFO: renamed from: y */
    public static boolean f12120y = false;

    /* JADX INFO: renamed from: e */
    public FeedDragDismissContainerView f12121e;

    /* JADX INFO: renamed from: f */
    public FeedVideoLikeContainerView f12122f;

    /* JADX INFO: renamed from: g */
    public c680 f12123g;

    /* JADX INFO: renamed from: h */
    public c680 f12124h;

    /* JADX INFO: renamed from: i */
    public k2h f12125i;

    /* JADX INFO: renamed from: j */
    public c680.c f12126j;

    /* JADX INFO: renamed from: k */
    public Act f12127k;

    /* JADX INFO: renamed from: l */
    public ArrayList<Media> f12128l;

    /* JADX INFO: renamed from: m */
    public Moment f12129m;

    /* JADX INFO: renamed from: n */
    public boolean f12130n;

    /* JADX INFO: renamed from: o */
    public int f12131o;

    /* JADX INFO: renamed from: p */
    public PhotoAlbumPlayerView f12132p;

    /* JADX INFO: renamed from: s */
    public uvh f12135s;

    /* JADX INFO: renamed from: u */
    public VImage f12137u;

    /* JADX INFO: renamed from: q */
    public HashMap<Integer, PhotoAlbumLivePhotoView> f12133q = new HashMap<>();

    /* JADX INFO: renamed from: r */
    public boolean f12134r = true;

    /* JADX INFO: renamed from: t */
    public boolean f12136t = false;

    /* JADX INFO: renamed from: v */
    public boolean f12138v = false;

    /* JADX INFO: renamed from: w */
    public int f12139w = 0;

    /* JADX INFO: renamed from: x */
    public z91 f12140x = new C2466c();

    /* JADX INFO: renamed from: l.q770$a */
    public class C2464a extends c680.c {
        public C2464a() {
        }

        /* JADX INFO: renamed from: a */
        public void m13481a(Exception exc) {
            super.a(exc);
            if (NullChecker.a(q770.this.f12126j)) {
                q770.this.f12126j.a(exc);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m13482d() {
            super.d();
            if (NullChecker.a(q770.this.f12126j)) {
                q770.this.f12126j.d();
            }
        }

        public void onComplete() {
            super.onComplete();
            if (NullChecker.a(q770.this.f12126j)) {
                q770.this.f12126j.onComplete();
            }
        }

        public void onPause() {
            super.onPause();
            if (NullChecker.a(q770.this.f12126j)) {
                q770.this.f12126j.onPause();
            }
            q770.this.m13467c0(false);
        }

        public void onResume() {
            super.onResume();
            if (NullChecker.a(q770.this.f12126j)) {
                q770.this.f12126j.onResume();
            }
            q770.this.m13467c0(false);
        }

        public void onStart() {
            if (NullChecker.a(q770.this.f12126j)) {
                q770.this.f12126j.onStart();
            }
            eb1.m9689b(null, 1);
        }
    }

    /* JADX INFO: renamed from: l.q770$b */
    public class C2465b extends c680.c {
        public C2465b() {
        }

        /* JADX INFO: renamed from: a */
        public void m13483a(Exception exc) {
            super.a(exc);
            if (NullChecker.a(q770.this.f12126j)) {
                q770.this.f12126j.a(exc);
            }
        }

        /* JADX INFO: renamed from: d */
        public void m13484d() {
            super.d();
            if (NullChecker.a(q770.this.f12126j)) {
                q770.this.f12126j.d();
            }
        }

        public void onComplete() {
            super.onComplete();
            if (NullChecker.a(q770.this.f12126j)) {
                q770.this.f12126j.onComplete();
            }
        }

        public void onPause() {
            super.onPause();
            if (NullChecker.a(q770.this.f12126j)) {
                q770.this.f12126j.onPause();
            }
        }

        public void onResume() {
            super.onResume();
            if (NullChecker.a(q770.this.f12126j)) {
                q770.this.f12126j.onResume();
            }
        }

        public void onStart() {
            if (NullChecker.a(q770.this.f12126j)) {
                q770.this.f12126j.onStart();
            }
            eb1.m9689b(null, 1);
        }
    }

    /* JADX INFO: renamed from: l.q770$c */
    public class C2466c implements z91 {
        public C2466c() {
        }

        /* JADX INFO: renamed from: b */
        public void m13485b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            if (q770.this.f12139w == -1) {
                q770 q770Var = q770.this;
                q770Var.m13473i0(q770Var.f12132p);
                return;
            }
            if (!FeedModule.f316d.f14924H) {
                q770.this.m13452H();
            }
            if (q770.this.m13438R()) {
                return;
            }
            q770.this.m13480p0();
        }

        /* JADX INFO: renamed from: d */
        public void m13486d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (!ib1.b().d(audioBusinessType2)) {
                ib1.b().g(str, audioBusinessType, z91Var);
                int i = q770.this.f12139w;
                q770 q770Var = q770.this;
                if (i == -1) {
                    q770Var.m13473i0(q770Var.f12132p);
                    return;
                } else {
                    q770Var.m13452H();
                    q770.this.m13480p0();
                    return;
                }
            }
            osi0.g(audioBusinessType2.getBusinessMsg());
            if (q770.this.f12139w == -1) {
                if (!q770.this.m13438R()) {
                    q770.this.m13480p0();
                }
                boolean z = FeedModule.f316d.f14924H;
                q770 q770Var2 = q770.this;
                if (z) {
                    q770Var2.m13473i0(q770Var2.f12132p);
                } else {
                    q770Var2.m13452H();
                }
            }
        }

        public void success() {
            int i = q770.this.f12139w;
            q770 q770Var = q770.this;
            if (i == -1) {
                q770Var.m13473i0(q770Var.f12132p);
            } else {
                q770Var.m13452H();
                q770.this.m13480p0();
            }
        }
    }

    public q770(Act act, ArrayList<Media> arrayList, Moment moment) {
        this.f12127k = act;
        this.f12128l = arrayList;
        this.f12129m = moment;
    }

    /* JADX INFO: renamed from: F */
    private View m13432F(View view, Media media) {
        FeedDragDismissContainerView feedDragDismissContainerView = new FeedDragDismissContainerView((Context) this.f12127k, this.f12136t);
        this.f12121e = feedDragDismissContainerView;
        feedDragDismissContainerView.setFeedDragDismissListener(this.f12125i);
        this.f12121e.setInnerContentView(view);
        if (m13437Q(media) && (view instanceof PhotoAlbumLivePhotoView)) {
            this.f12121e.setFeedDragDismissBackListener(((PhotoAlbumLivePhotoView) view).getDragBackListener());
        }
        if (this.f12134r) {
            this.f12121e.setZoomAnimationKey(Media.URL_TO_CACHEKEY(media.url));
        }
        m13436P(media);
        return this.f12121e;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: G */
    private View m13433G(View view, Media media) {
        if (!(media instanceof Video)) {
            if (media instanceof Picture) {
                Dimension dimension = ((Picture) media).size;
                if (!vqg.m15534p0(dimension.width, dimension.height)) {
                    if (!m13437Q(media)) {
                        return view;
                    }
                }
            } else if (!m13437Q(media)) {
                return view;
            }
        }
        return m13432F(view, media);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView] */
    @NotNull
    /* JADX INFO: renamed from: L */
    private View m13434L(final Media media) {
        final ?? photoAlbumPhotoPreviewView = new PhotoAlbumPhotoPreviewView(this.f12127k);
        photoAlbumPhotoPreviewView.m6509V((Picture) media, false);
        photoAlbumPhotoPreviewView.setOnLongPressListener(new PhotoAlbumPhotoPreviewView.InterfaceC2165b() { // from class: l.k770
            @Override // com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView.InterfaceC2165b
            /* JADX INFO: renamed from: a */
            public final boolean mo6515a() {
                return this.f9626a.m13460U(media);
            }
        });
        photoAlbumPhotoPreviewView.setOnTapListener(new PhotoAlbumPhotoPreviewView.InterfaceC2166c() { // from class: l.l770
            @Override // com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView.InterfaceC2166c
            /* JADX INFO: renamed from: a */
            public final void mo3330a() {
                this.f9910a.m13462W(photoAlbumPhotoPreviewView);
            }
        });
        if (this.f12130n) {
            photoAlbumPhotoPreviewView.f4117a.setOnDragDismissListenler(this.f12125i);
        }
        return photoAlbumPhotoPreviewView;
    }

    /* JADX INFO: renamed from: N */
    public static void m13435N() {
        if (d.l().x("moment_preview_vedio_voice_mute")) {
            d.l().k("moment_preview_vedio_voice_mute");
        }
    }

    /* JADX INFO: renamed from: P */
    private void m13436P(Media media) {
        this.f12121e.setId(b5c0.f6077o1);
        if (media instanceof Video) {
            Video video = (Video) media;
            this.f12121e.setOriginalHeight(video.size.height);
            this.f12121e.setOriginalWidth(video.size.width);
        } else if (media instanceof Picture) {
            Picture picture = (Picture) media;
            this.f12121e.setOriginalHeight(Math.min(xdl0.w0(), picture.size.height));
            this.f12121e.setOriginalWidth(picture.size.width);
        }
    }

    /* JADX INFO: renamed from: Q */
    private boolean m13437Q(Media media) {
        return nkg.m12270v0() && (media instanceof Picture) && NullChecker.a(((Picture) media).livePhoto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public boolean m13438R() {
        try {
            String strF = RemoteConfig.x().F("livephoto_function");
            if (!TextUtils.isEmpty(strF)) {
                new JSONObject(strF);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    private Video m13439b0(Picture picture) {
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
    private void m13440k0() {
        this.f12127k.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.g770
            public final void call(Object obj) {
                this.f8374a.m13465Z((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public static void m13441l0(boolean z) {
        f12120y = z;
    }

    /* JADX INFO: renamed from: H */
    public void m13452H() {
        xia xiaVar = FeedModule.f316d;
        boolean z = xiaVar.f14924H;
        xiaVar.f14924H = !z;
        zvf0.u("e_video_voice_switch", "p_moment_preview", new j760[]{vwb.Y("voiceswitch", !z ? "off" : "on")});
        m13473i0(this.f12132p);
    }

    /* JADX INFO: renamed from: I */
    public final PhotoAlbumLivePhotoView m13453I() {
        if (NullChecker.a(this.f12133q) && this.f12133q.containsKey(Integer.valueOf(this.f12131o))) {
            return this.f12133q.get(Integer.valueOf(this.f12131o));
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public View m13454J(Media media, int i) {
        View viewM13456M;
        if (m13437Q(media)) {
            viewM13456M = m13455K((Picture) media);
        } else if (media instanceof Picture) {
            viewM13456M = m13434L(media);
        } else {
            viewM13456M = media instanceof Video ? m13456M((Video) media) : null;
        }
        if (NullChecker.a(this.f12135s)) {
            this.f12135s.m15177d(i, viewM13456M);
        }
        boolean z = viewM13456M instanceof PhotoAlbumPlayerView;
        if (z) {
            this.f12132p = (PhotoAlbumPlayerView) viewM13456M;
            m13440k0();
        } else if (viewM13456M instanceof PhotoAlbumLivePhotoView) {
            this.f12133q.put(Integer.valueOf(i), (PhotoAlbumLivePhotoView) viewM13456M);
            if (this.f12133q.size() == 1) {
                m13440k0();
            }
        }
        View viewM13433G = m13433G(viewM13456M, media);
        if (!z && !(viewM13456M instanceof PhotoAlbumLivePhotoView)) {
            return viewM13433G;
        }
        FeedVideoLikeContainerView feedVideoLikeContainerView = new FeedVideoLikeContainerView(this.f12127k);
        this.f12122f = feedVideoLikeContainerView;
        feedVideoLikeContainerView.addView(viewM13433G, 0);
        if (NullChecker.a(this.f12135s)) {
            this.f12135s.mo11314l(this.f12122f);
        }
        return this.f12122f;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final PhotoAlbumLivePhotoView m13455K(Picture picture) {
        Video videoM13439b0 = m13439b0(picture);
        final PhotoAlbumLivePhotoView photoAlbumLivePhotoView = new PhotoAlbumLivePhotoView(this.f12127k);
        photoAlbumLivePhotoView.setProgressBarsEnabled(false);
        m13457O(videoM13439b0.url).a(Moments.TYPE);
        photoAlbumLivePhotoView.setPlayer(m13457O(videoM13439b0.url));
        photoAlbumLivePhotoView.setVideo(videoM13439b0);
        photoAlbumLivePhotoView.m6469q(xdl0.y0(), xdl0.w0() - xdl0.F0());
        this.f12139w = -1;
        ib1.b().f("PhotoAlbumFeedPreviewAdapter", AudioBusinessType.NORMAL, this.f12140x);
        if (!TextUtils.isEmpty(videoM13439b0.formatAspectRatio())) {
            qib0.S0(videoM13439b0.formatAspectRatio());
        }
        photoAlbumLivePhotoView.setOnTapListener(new PhotoAlbumPhotoPreviewView.InterfaceC2166c() { // from class: l.j770
            @Override // com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView.InterfaceC2166c
            /* JADX INFO: renamed from: a */
            public final void mo3330a() {
                this.f9245a.m13459T(photoAlbumLivePhotoView);
            }
        });
        photoAlbumLivePhotoView.m6467o(new C2465b());
        return photoAlbumLivePhotoView;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final PhotoAlbumPlayerView m13456M(Video video) {
        PhotoAlbumPlayerView photoAlbumPlayerView = new PhotoAlbumPlayerView(this.f12127k);
        photoAlbumPlayerView.f4132h.setBackground(null);
        photoAlbumPlayerView.f4133i.setImageResource(u2h.m14723h() ? f3c0.f7717U3 : f3c0.f7710T3);
        photoAlbumPlayerView.setOnClickButtonListener(new PhotoAlbumPlayerView.InterfaceC2169c() { // from class: l.i770
            @Override // com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView.InterfaceC2169c
            /* JADX INFO: renamed from: a */
            public final void mo6552a(boolean z) {
                this.f8917a.m13463X(z);
            }
        });
        m13468d0(photoAlbumPlayerView);
        photoAlbumPlayerView.setProgressBarsEnabled(false);
        m13457O(video != null ? video.url : "").a(Moments.TYPE);
        photoAlbumPlayerView.setPlayer(m13457O(video != null ? video.url : ""));
        photoAlbumPlayerView.setVideo(video);
        photoAlbumPlayerView.m6545t(xdl0.y0(), xdl0.w0() - xdl0.F0());
        this.f12139w = -1;
        ib1.b().f("PhotoAlbumFeedPreviewAdapter", AudioBusinessType.NORMAL, this.f12140x);
        if (NullChecker.b(video) && !TextUtils.isEmpty(video.formatAspectRatio())) {
            qib0.S0(video.formatAspectRatio());
        }
        photoAlbumPlayerView.m6543r(new C2464a());
        return photoAlbumPlayerView;
    }

    /* JADX INFO: renamed from: O */
    public c680 m13457O(String str) {
        if (!NullChecker.a(str) || str.startsWith("http")) {
            if (this.f12124h == null) {
                this.f12124h = new s680();
            }
            return this.f12124h;
        }
        if (this.f12123g == null) {
            this.f12123g = new l680();
        }
        return this.f12123g;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m13458S() {
        m13467c0(true);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m13459T(PhotoAlbumLivePhotoView photoAlbumLivePhotoView) {
        photoAlbumLivePhotoView.postDelayed(new Runnable() { // from class: l.o770
            @Override // java.lang.Runnable
            public final void run() {
                this.f11359a.m13458S();
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ boolean m13460U(Media media) {
        if (this.f12127k.lifecycle_() != c.i) {
            return true;
        }
        vwi.m15602Q(this.f12129m, new w9j() { // from class: l.n770
            public final Object call(Object obj) {
                return FeedModule.f316d.m16543S6((Moment) obj);
            }
        }, FeedModule.f316d.m16628e8(this.f12129m.owner), this.f12127k, "p_moment_preview", true, media);
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m13461V() {
        m13467c0(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m13462W(PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView) {
        photoAlbumPhotoPreviewView.postDelayed(new Runnable() { // from class: l.m770
            @Override // java.lang.Runnable
            public final void run() {
                this.f10247a.m13461V();
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m13463X(boolean z) {
        this.f12138v = z;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m13465Z(c cVar) {
        if (cVar == c.i) {
            if (!NullChecker.a(this.f12132p)) {
                if (NullChecker.a(m13453I())) {
                    m13453I().m6478z();
                }
            } else {
                m13473i0(this.f12132p);
                if (this.f12127k instanceof FeedVideoFlowAct) {
                    return;
                }
                this.f12132p.m6537F();
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m13466a0(View view) {
        if (!FeedModule.f316d.f14924H) {
            m13452H();
        } else {
            this.f12139w = 0;
            ib1.b().f("PhotoAlbumFeedPreviewAdapter", AudioBusinessType.NORMAL, this.f12140x);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m13467c0(boolean z) {
        if (NullChecker.a(this.f12135s)) {
            this.f12135s.mo11228g();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m13469e0() {
        if (NullChecker.a(this.f12124h)) {
            this.f12124h.release();
        }
        if (NullChecker.a(this.f12123g)) {
            this.f12123g.release();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m13470f0(boolean z) {
        this.f12136t = z;
    }

    /* JADX INFO: renamed from: g0 */
    public void m13471g0(uvh uvhVar) {
        this.f12135s = uvhVar;
        this.f12126j = uvhVar.mo11305e();
    }

    public int getCount() {
        return this.f12128l.size();
    }

    public int getItemPosition(Object obj) {
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: h0 */
    public void m13472h0(k2h k2hVar) {
        this.f12125i = k2hVar;
    }

    /* JADX INFO: renamed from: i0 */
    public void m13473i0(PhotoAlbumPlayerView photoAlbumPlayerView) {
        if (NullChecker.a(photoAlbumPlayerView)) {
            photoAlbumPlayerView.m6535D(FeedModule.f316d.f14924H);
        }
        if (NullChecker.a(this.f12137u)) {
            xdl0.M0(this.f12137u, true);
            boolean zM14723h = u2h.m14723h();
            VImage vImage = this.f12137u;
            if (zM14723h) {
                vImage.setImageResource(FeedModule.f316d.f14924H ? f3c0.f7670N5 : f3c0.f7684P5);
            } else {
                vImage.setImageResource(FeedModule.f316d.f14924H ? f3c0.f7663M5 : f3c0.f7677O5);
            }
            if (((Boolean) FeedModule.f316d.f14927I.get()).booleanValue() || nkg.m12200A0()) {
                return;
            }
            this.f12137u.post(new Runnable() { // from class: l.p770
                @Override // java.lang.Runnable
                public final void run() {
                    this.f11714a.m13464Y();
                }
            });
        }
    }

    public boolean isViewFromObject(View view, Object obj) {
        return view.getTag().equals(obj);
    }

    /* JADX INFO: renamed from: j0 */
    public void m13474j0(boolean z) {
        this.f12130n = z;
    }

    /* JADX INFO: renamed from: m0 */
    public void m13475m0(VImage vImage) {
        this.f12137u = vImage;
        if (NullChecker.a(vImage)) {
            xdl0.E0(this.f12137u, new View.OnClickListener() { // from class: l.h770
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f8607a.m13466a0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void m13464Y() {
        if (((Boolean) FeedModule.f316d.f14927I.get()).booleanValue()) {
            return;
        }
        FeedModule.f316d.f14927I.put(Boolean.TRUE);
        d.l().u(new a(this.f12127k).D("视频声音默认关闭，单击开启").k(new int[]{this.f12127k.getResources().getColor(u2h.m14723h() ? e1c0.f7144i : e1c0.f7154n)}).J(13.0f).E(true).b(10000L).e(true).q(a.N | a.P).o(a.P, t100.d(6.0f)), this.f12137u, "moment_preview_vedio_voice_mute");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o */
    public void m13477o(ViewGroup viewGroup, int i, Object obj) {
        View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
        if (NullChecker.a(viewFindViewWithTag)) {
            if (viewFindViewWithTag instanceof PhotoAlbumPlayerView) {
                ((PhotoAlbumPlayerView) viewFindViewWithTag).setPlayer(null);
            } else if (viewFindViewWithTag instanceof PhotoAlbumLivePhotoView) {
                ((PhotoAlbumLivePhotoView) viewFindViewWithTag).setPlayer(null);
            } else if (viewFindViewWithTag instanceof PhotoAlbumPhotoPreviewView) {
                ((PhotoAlbumPhotoPreviewView) viewFindViewWithTag).m6508T();
            }
            viewFindViewWithTag.setTag(null);
            viewGroup.removeView(viewFindViewWithTag);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m13478o0() {
        if (NullChecker.a(this.f12124h)) {
            this.f12124h.stop();
        }
        if (NullChecker.a(this.f12123g)) {
            this.f12123g.stop();
        }
    }

    public void onPageSelected(int i) {
        if (this.f12131o != i && NullChecker.a(this.f12132p)) {
            if (NullChecker.a(this.f12124h)) {
                this.f12124h.stop();
            }
            if (NullChecker.a(this.f12123g)) {
                this.f12123g.stop();
            }
        }
        if (this.f12131o != i && NullChecker.a(this.f12133q)) {
            if (NullChecker.a(m13453I())) {
                m13453I().m6465B();
            }
            this.f12131o = i;
            if (NullChecker.a(m13453I())) {
                m13453I().m6478z();
            }
        }
        this.f12131o = i;
    }

    /* JADX INFO: renamed from: p */
    public Object m13479p(ViewGroup viewGroup, int i) {
        View viewM13454J = m13454J(this.f12128l.get(i), i);
        viewM13454J.setTag(Integer.valueOf(i));
        viewGroup.addView(viewM13454J);
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: p0 */
    public void m13480p0() {
        if (NullChecker.a(m13453I())) {
            m13453I().m6476x(!m13438R());
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m13468d0(PhotoAlbumPlayerView photoAlbumPlayerView) {
    }
}
