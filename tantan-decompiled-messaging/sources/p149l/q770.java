package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.LivePhoto;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumLivePhotoView;
import com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView;
import com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p046p1.mobile.putong.feed.newui.videoflow.FeedVideoFlowAct;
import com.p046p1.mobile.putong.feed.newui.view.FeedDragDismissContainerView;
import com.p046p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;
import p147v.VImage;

/* JADX INFO: loaded from: classes12.dex */
public class q770 extends eb2 {

    /* JADX INFO: renamed from: y */
    public static boolean f152991y = false;

    /* JADX INFO: renamed from: e */
    public FeedDragDismissContainerView f152992e;

    /* JADX INFO: renamed from: f */
    public FeedVideoLikeContainerView f152993f;

    /* JADX INFO: renamed from: g */
    public c680 f152994g;

    /* JADX INFO: renamed from: h */
    public c680 f152995h;

    /* JADX INFO: renamed from: i */
    public k2h f152996i;

    /* JADX INFO: renamed from: j */
    public c680.C16085c f152997j;

    /* JADX INFO: renamed from: k */
    public Act f152998k;

    /* JADX INFO: renamed from: l */
    public ArrayList<Media> f152999l;

    /* JADX INFO: renamed from: m */
    public Moment f153000m;

    /* JADX INFO: renamed from: n */
    public boolean f153001n;

    /* JADX INFO: renamed from: o */
    public int f153002o;

    /* JADX INFO: renamed from: p */
    public PhotoAlbumPlayerView f153003p;

    /* JADX INFO: renamed from: s */
    public uvh f153006s;

    /* JADX INFO: renamed from: u */
    public VImage f153008u;

    /* JADX INFO: renamed from: q */
    public HashMap<Integer, PhotoAlbumLivePhotoView> f153004q = new HashMap<>();

    /* JADX INFO: renamed from: r */
    public boolean f153005r = true;

    /* JADX INFO: renamed from: t */
    public boolean f153007t = false;

    /* JADX INFO: renamed from: v */
    public boolean f153009v = false;

    /* JADX INFO: renamed from: w */
    public int f153010w = 0;

    /* JADX INFO: renamed from: x */
    public z91 f153011x = new C19440c();

    /* JADX INFO: renamed from: l.q770$a */
    public class C19438a extends c680.C16085c {
        public C19438a() {
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: a */
        public void mo44050a(Exception exc) {
            super.mo44050a(exc);
            if (NullChecker.m81303a(q770.this.f152997j)) {
                q770.this.f152997j.mo44050a(exc);
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            super.mo44053d();
            if (NullChecker.m81303a(q770.this.f152997j)) {
                q770.this.f152997j.mo44053d();
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onComplete() {
            super.onComplete();
            if (NullChecker.m81303a(q770.this.f152997j)) {
                q770.this.f152997j.onComplete();
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onPause() {
            super.onPause();
            if (NullChecker.m81303a(q770.this.f152997j)) {
                q770.this.f152997j.onPause();
            }
            q770.this.m173223c0(false);
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onResume() {
            super.onResume();
            if (NullChecker.m81303a(q770.this.f152997j)) {
                q770.this.f152997j.onResume();
            }
            q770.this.m173223c0(false);
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onStart() {
            if (NullChecker.m81303a(q770.this.f152997j)) {
                q770.this.f152997j.onStart();
            }
            eb1.m115447b(null, 1);
        }
    }

    /* JADX INFO: renamed from: l.q770$b */
    public class C19439b extends c680.C16085c {
        public C19439b() {
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: a */
        public void mo44050a(Exception exc) {
            super.mo44050a(exc);
            if (NullChecker.m81303a(q770.this.f152997j)) {
                q770.this.f152997j.mo44050a(exc);
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            super.mo44053d();
            if (NullChecker.m81303a(q770.this.f152997j)) {
                q770.this.f152997j.mo44053d();
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onComplete() {
            super.onComplete();
            if (NullChecker.m81303a(q770.this.f152997j)) {
                q770.this.f152997j.onComplete();
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onPause() {
            super.onPause();
            if (NullChecker.m81303a(q770.this.f152997j)) {
                q770.this.f152997j.onPause();
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onResume() {
            super.onResume();
            if (NullChecker.m81303a(q770.this.f152997j)) {
                q770.this.f152997j.onResume();
            }
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onStart() {
            if (NullChecker.m81303a(q770.this.f152997j)) {
                q770.this.f152997j.onStart();
            }
            eb1.m115447b(null, 1);
        }
    }

    /* JADX INFO: renamed from: l.q770$c */
    public class C19440c implements z91 {
        public C19440c() {
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: b */
        public void mo39105b(AudioBusinessType audioBusinessType, String str, AudioBusinessType audioBusinessType2) {
            if (q770.this.f153010w == -1) {
                q770 q770Var = q770.this;
                q770Var.m173229i0(q770Var.f153003p);
                return;
            }
            if (!FeedModule.f38855d.f192989H) {
                q770.this.m173208H();
            }
            if (q770.this.m173194R()) {
                return;
            }
            q770.this.m173234p0();
        }

        @Override // p149l.z91
        /* JADX INFO: renamed from: d */
        public void mo39106d(String str, AudioBusinessType audioBusinessType, z91 z91Var, String str2, AudioBusinessType audioBusinessType2) {
            if (!ib1.m135233b().mo135236d(audioBusinessType2)) {
                ib1.m135233b().mo135239g(str, audioBusinessType, z91Var);
                int i = q770.this.f153010w;
                q770 q770Var = q770.this;
                if (i == -1) {
                    q770Var.m173229i0(q770Var.f153003p);
                    return;
                } else {
                    q770Var.m173208H();
                    q770.this.m173234p0();
                    return;
                }
            }
            osi0.m165783g(audioBusinessType2.getBusinessMsg());
            if (q770.this.f153010w == -1) {
                if (!q770.this.m173194R()) {
                    q770.this.m173234p0();
                }
                boolean z = FeedModule.f38855d.f192989H;
                q770 q770Var2 = q770.this;
                if (z) {
                    q770Var2.m173229i0(q770Var2.f153003p);
                } else {
                    q770Var2.m173208H();
                }
            }
        }

        @Override // p149l.z91
        public void success() {
            int i = q770.this.f153010w;
            q770 q770Var = q770.this;
            if (i == -1) {
                q770Var.m173229i0(q770Var.f153003p);
            } else {
                q770Var.m173208H();
                q770.this.m173234p0();
            }
        }
    }

    public q770(Act act, ArrayList<Media> arrayList, Moment moment) {
        this.f152998k = act;
        this.f152999l = arrayList;
        this.f153000m = moment;
    }

    /* JADX INFO: renamed from: F */
    private View m173188F(View view, Media media) {
        FeedDragDismissContainerView feedDragDismissContainerView = new FeedDragDismissContainerView(this.f152998k, this.f153007t);
        this.f152992e = feedDragDismissContainerView;
        feedDragDismissContainerView.setFeedDragDismissListener(this.f152996i);
        this.f152992e.setInnerContentView(view);
        if (m173193Q(media) && (view instanceof PhotoAlbumLivePhotoView)) {
            this.f152992e.setFeedDragDismissBackListener(((PhotoAlbumLivePhotoView) view).getDragBackListener());
        }
        if (this.f153005r) {
            this.f152992e.setZoomAnimationKey(Media.URL_TO_CACHEKEY(media.url));
        }
        m173192P(media);
        return this.f152992e;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0020 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:8:0x0019  */
    /* JADX INFO: renamed from: G */
    private View m173189G(View view, Media media) {
        if (!(media instanceof Video)) {
            if (media instanceof Picture) {
                Dimension dimension = ((Picture) media).size;
                if (!vqg.m199564p0(dimension.width, dimension.height)) {
                    if (!m173193Q(media)) {
                        return view;
                    }
                }
            } else if (!m173193Q(media)) {
                return view;
            }
        }
        return m173188F(view, media);
    }

    @NotNull
    /* JADX INFO: renamed from: L */
    private View m173190L(final Media media) {
        final PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView = new PhotoAlbumPhotoPreviewView(this.f152998k);
        photoAlbumPhotoPreviewView.m65394V((Picture) media, false);
        photoAlbumPhotoPreviewView.setOnLongPressListener(new PhotoAlbumPhotoPreviewView.InterfaceC11321b() { // from class: l.k770
            @Override // com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView.InterfaceC11321b
            /* JADX INFO: renamed from: a */
            public final boolean mo65396a() {
                return this.f121555a.m173216U(media);
            }
        });
        photoAlbumPhotoPreviewView.setOnTapListener(new PhotoAlbumPhotoPreviewView.InterfaceC11322c() { // from class: l.l770
            @Override // com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView.InterfaceC11322c
            /* JADX INFO: renamed from: a */
            public final void mo62336a() {
                this.f126696a.m173218W(photoAlbumPhotoPreviewView);
            }
        });
        if (this.f153001n) {
            photoAlbumPhotoPreviewView.f42656a.setOnDragDismissListenler(this.f152996i);
        }
        return photoAlbumPhotoPreviewView;
    }

    /* JADX INFO: renamed from: N */
    public static void m173191N() {
        if (C4348d.m20896l().m20912x("moment_preview_vedio_voice_mute")) {
            C4348d.m20896l().m20900k("moment_preview_vedio_voice_mute");
        }
    }

    /* JADX INFO: renamed from: P */
    private void m173192P(Media media) {
        this.f152992e.setId(b5c0.f73596o1);
        if (media instanceof Video) {
            Video video = (Video) media;
            this.f152992e.setOriginalHeight(video.size.height);
            this.f152992e.setOriginalWidth(video.size.width);
        } else if (media instanceof Picture) {
            Picture picture = (Picture) media;
            this.f152992e.setOriginalHeight(Math.min(xdl0.m208408w0(), picture.size.height));
            this.f152992e.setOriginalWidth(picture.size.width);
        }
    }

    /* JADX INFO: renamed from: Q */
    private boolean m173193Q(Media media) {
        return nkg.m159911v0() && (media instanceof Picture) && NullChecker.m81303a(((Picture) media).livePhoto);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public boolean m173194R() {
        try {
            String strM79302F = RemoteConfig.m79298x().m79302F("livephoto_function");
            if (!TextUtils.isEmpty(strM79302F)) {
                new JSONObject(strM79302F);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* JADX INFO: renamed from: b0 */
    private Video m173195b0(Picture picture) {
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
    private void m173196k0() {
        this.f152998k.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.g770
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f101335a.m173221Z((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l0 */
    public static void m173197l0(boolean z) {
        f152991y = z;
    }

    /* JADX INFO: renamed from: H */
    public void m173208H() {
        xia xiaVar = FeedModule.f38855d;
        boolean z = xiaVar.f192989H;
        xiaVar.f192989H = !z;
        zvf0.m220399u("e_video_voice_switch", "p_moment_preview", vwb.m200311Y("voiceswitch", !z ? BLiveOperationTitleShowType.off : "on"));
        m173229i0(this.f153003p);
    }

    /* JADX INFO: renamed from: I */
    public final PhotoAlbumLivePhotoView m173209I() {
        if (NullChecker.m81303a(this.f153004q) && this.f153004q.containsKey(Integer.valueOf(this.f153002o))) {
            return this.f153004q.get(Integer.valueOf(this.f153002o));
        }
        return null;
    }

    /* JADX INFO: renamed from: J */
    public View m173210J(Media media, int i) {
        View viewM173212M;
        if (m173193Q(media)) {
            viewM173212M = m173211K((Picture) media);
        } else if (media instanceof Picture) {
            viewM173212M = m173190L(media);
        } else {
            viewM173212M = media instanceof Video ? m173212M((Video) media) : null;
        }
        if (NullChecker.m81303a(this.f153006s)) {
            this.f153006s.m196080d(i, viewM173212M);
        }
        boolean z = viewM173212M instanceof PhotoAlbumPlayerView;
        if (z) {
            this.f153003p = (PhotoAlbumPlayerView) viewM173212M;
            m173196k0();
        } else if (viewM173212M instanceof PhotoAlbumLivePhotoView) {
            this.f153004q.put(Integer.valueOf(i), (PhotoAlbumLivePhotoView) viewM173212M);
            if (this.f153004q.size() == 1) {
                m173196k0();
            }
        }
        View viewM173189G = m173189G(viewM173212M, media);
        if (!z && !(viewM173212M instanceof PhotoAlbumLivePhotoView)) {
            return viewM173189G;
        }
        FeedVideoLikeContainerView feedVideoLikeContainerView = new FeedVideoLikeContainerView(this.f152998k);
        this.f152993f = feedVideoLikeContainerView;
        feedVideoLikeContainerView.addView(viewM173189G, 0);
        if (NullChecker.m81303a(this.f153006s)) {
            this.f153006s.mo142730l(this.f152993f);
        }
        return this.f152993f;
    }

    @NotNull
    /* JADX INFO: renamed from: K */
    public final PhotoAlbumLivePhotoView m173211K(Picture picture) {
        Video videoM173195b0 = m173195b0(picture);
        final PhotoAlbumLivePhotoView photoAlbumLivePhotoView = new PhotoAlbumLivePhotoView(this.f152998k);
        photoAlbumLivePhotoView.setProgressBarsEnabled(false);
        m173213O(videoM173195b0.url).mo105366a(Moments.TYPE);
        photoAlbumLivePhotoView.setPlayer(m173213O(videoM173195b0.url));
        photoAlbumLivePhotoView.setVideo(videoM173195b0);
        photoAlbumLivePhotoView.m65361q(xdl0.m208412y0(), xdl0.m208408w0() - xdl0.m208331F0());
        this.f153010w = -1;
        ib1.m135233b().mo135238f("PhotoAlbumFeedPreviewAdapter", AudioBusinessType.NORMAL, this.f153011x);
        if (!TextUtils.isEmpty(videoM173195b0.formatAspectRatio())) {
            qib0.m174792S0(videoM173195b0.formatAspectRatio());
        }
        photoAlbumLivePhotoView.setOnTapListener(new PhotoAlbumPhotoPreviewView.InterfaceC11322c() { // from class: l.j770
            @Override // com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPhotoPreviewView.InterfaceC11322c
            /* JADX INFO: renamed from: a */
            public final void mo62336a() {
                this.f116568a.m173215T(photoAlbumLivePhotoView);
            }
        });
        photoAlbumLivePhotoView.m65359o(new C19439b());
        return photoAlbumLivePhotoView;
    }

    @NotNull
    /* JADX INFO: renamed from: M */
    public final PhotoAlbumPlayerView m173212M(Video video) {
        PhotoAlbumPlayerView photoAlbumPlayerView = new PhotoAlbumPlayerView(this.f152998k);
        photoAlbumPlayerView.f42671h.setBackground(null);
        photoAlbumPlayerView.f42672i.setImageResource(u2h.m191499h() ? f3c0.f94434U3 : f3c0.f94427T3);
        photoAlbumPlayerView.setOnClickButtonListener(new PhotoAlbumPlayerView.InterfaceC11325c() { // from class: l.i770
            @Override // com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView.InterfaceC11325c
            /* JADX INFO: renamed from: a */
            public final void mo65433a(boolean z) {
                this.f111836a.m173219X(z);
            }
        });
        m173224d0(photoAlbumPlayerView);
        photoAlbumPlayerView.setProgressBarsEnabled(false);
        m173213O(video != null ? video.url : "").mo105366a(Moments.TYPE);
        photoAlbumPlayerView.setPlayer(m173213O(video != null ? video.url : ""));
        photoAlbumPlayerView.setVideo(video);
        photoAlbumPlayerView.m65426t(xdl0.m208412y0(), xdl0.m208408w0() - xdl0.m208331F0());
        this.f153010w = -1;
        ib1.m135233b().mo135238f("PhotoAlbumFeedPreviewAdapter", AudioBusinessType.NORMAL, this.f153011x);
        if (NullChecker.m81304b(video) && !TextUtils.isEmpty(video.formatAspectRatio())) {
            qib0.m174792S0(video.formatAspectRatio());
        }
        photoAlbumPlayerView.m65424r(new C19438a());
        return photoAlbumPlayerView;
    }

    /* JADX INFO: renamed from: O */
    public c680 m173213O(String str) {
        if (!NullChecker.m81303a(str) || str.startsWith("http")) {
            if (this.f152995h == null) {
                this.f152995h = new s680();
            }
            return this.f152995h;
        }
        if (this.f152994g == null) {
            this.f152994g = new l680();
        }
        return this.f152994g;
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m173214S() {
        m173223c0(true);
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m173215T(PhotoAlbumLivePhotoView photoAlbumLivePhotoView) {
        photoAlbumLivePhotoView.postDelayed(new Runnable() { // from class: l.o770
            @Override // java.lang.Runnable
            public final void run() {
                this.f142471a.m173214S();
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ boolean m173216U(Media media) {
        if (this.f152998k.lifecycle_() != C4319c.f15548i) {
            return true;
        }
        vwi.m200386Q(this.f153000m, new w9j() { // from class: l.n770
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return FeedModule.f38855d.m209362S6((Moment) obj);
            }
        }, FeedModule.f38855d.m209447e8(this.f153000m.owner), this.f152998k, "p_moment_preview", true, media);
        return true;
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m173217V() {
        m173223c0(true);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m173218W(PhotoAlbumPhotoPreviewView photoAlbumPhotoPreviewView) {
        photoAlbumPhotoPreviewView.postDelayed(new Runnable() { // from class: l.m770
            @Override // java.lang.Runnable
            public final void run() {
                this.f131795a.m173217V();
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m173219X(boolean z) {
        this.f153009v = z;
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m173221Z(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            if (!NullChecker.m81303a(this.f153003p)) {
                if (NullChecker.m81303a(m173209I())) {
                    m173209I().m65370z();
                }
            } else {
                m173229i0(this.f153003p);
                if (this.f152998k instanceof FeedVideoFlowAct) {
                    return;
                }
                this.f153003p.m65418F();
            }
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m173222a0(View view) {
        if (!FeedModule.f38855d.f192989H) {
            m173208H();
        } else {
            this.f153010w = 0;
            ib1.m135233b().mo135238f("PhotoAlbumFeedPreviewAdapter", AudioBusinessType.NORMAL, this.f153011x);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public void m173223c0(boolean z) {
        if (NullChecker.m81303a(this.f153006s)) {
            this.f153006s.mo142210g();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public void m173225e0() {
        if (NullChecker.m81303a(this.f152995h)) {
            this.f152995h.release();
        }
        if (NullChecker.m81303a(this.f152994g)) {
            this.f152994g.release();
        }
    }

    /* JADX INFO: renamed from: f0 */
    public void m173226f0(boolean z) {
        this.f153007t = z;
    }

    /* JADX INFO: renamed from: g0 */
    public void m173227g0(uvh uvhVar) {
        this.f153006s = uvhVar;
        this.f152997j = uvhVar.mo142722e();
    }

    @Override // p149l.w660
    public int getCount() {
        return this.f152999l.size();
    }

    @Override // p149l.w660
    public int getItemPosition(Object obj) {
        return ((Integer) obj).intValue();
    }

    /* JADX INFO: renamed from: h0 */
    public void m173228h0(k2h k2hVar) {
        this.f152996i = k2hVar;
    }

    /* JADX INFO: renamed from: i0 */
    public void m173229i0(PhotoAlbumPlayerView photoAlbumPlayerView) {
        if (NullChecker.m81303a(photoAlbumPlayerView)) {
            photoAlbumPlayerView.m65416D(FeedModule.f38855d.f192989H);
        }
        if (NullChecker.m81303a(this.f153008u)) {
            xdl0.m208345M0(this.f153008u, true);
            boolean zM191499h = u2h.m191499h();
            VImage vImage = this.f153008u;
            if (zM191499h) {
                vImage.setImageResource(FeedModule.f38855d.f192989H ? f3c0.f94387N5 : f3c0.f94401P5);
            } else {
                vImage.setImageResource(FeedModule.f38855d.f192989H ? f3c0.f94380M5 : f3c0.f94394O5);
            }
            if (FeedModule.f38855d.f192992I.get().booleanValue() || nkg.m159841A0()) {
                return;
            }
            this.f153008u.post(new Runnable() { // from class: l.p770
                @Override // java.lang.Runnable
                public final void run() {
                    this.f147481a.m173220Y();
                }
            });
        }
    }

    @Override // p149l.w660
    public boolean isViewFromObject(View view, Object obj) {
        return view.getTag().equals(obj);
    }

    /* JADX INFO: renamed from: j0 */
    public void m173230j0(boolean z) {
        this.f153001n = z;
    }

    /* JADX INFO: renamed from: m0 */
    public void m173231m0(VImage vImage) {
        this.f153008u = vImage;
        if (NullChecker.m81303a(vImage)) {
            xdl0.m208329E0(this.f153008u, new View.OnClickListener() { // from class: l.h770
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f106199a.m173222a0(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public void m173220Y() {
        if (FeedModule.f38855d.f192992I.get().booleanValue()) {
            return;
        }
        FeedModule.f38855d.f192992I.put(Boolean.TRUE);
        C4348d.m20896l().m20909u(new C4345a(this.f152998k).m20849D("视频声音默认关闭，单击开启").m20870k(this.f152998k.getResources().getColor(u2h.m191499h() ? e1c0.f88788i : e1c0.f88798n)).m20855J(13.0f).m20850E(true).m20861b(10000L).m20864e(true).m20875q(C4345a.f15680N | C4345a.f15682P).m20873o(C4345a.f15682P, t100.m186890d(6.0f)), this.f153008u, "moment_preview_vedio_voice_mute");
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: o */
    public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
        View viewFindViewWithTag = viewGroup.findViewWithTag(obj);
        if (NullChecker.m81303a(viewFindViewWithTag)) {
            if (viewFindViewWithTag instanceof PhotoAlbumPlayerView) {
                ((PhotoAlbumPlayerView) viewFindViewWithTag).setPlayer(null);
            } else if (viewFindViewWithTag instanceof PhotoAlbumLivePhotoView) {
                ((PhotoAlbumLivePhotoView) viewFindViewWithTag).setPlayer(null);
            } else if (viewFindViewWithTag instanceof PhotoAlbumPhotoPreviewView) {
                ((PhotoAlbumPhotoPreviewView) viewFindViewWithTag).m65393T();
            }
            viewFindViewWithTag.setTag(null);
            viewGroup.removeView(viewFindViewWithTag);
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m173233o0() {
        if (NullChecker.m81303a(this.f152995h)) {
            this.f152995h.stop();
        }
        if (NullChecker.m81303a(this.f152994g)) {
            this.f152994g.stop();
        }
    }

    public void onPageSelected(int i) {
        if (this.f153002o != i && NullChecker.m81303a(this.f153003p)) {
            if (NullChecker.m81303a(this.f152995h)) {
                this.f152995h.stop();
            }
            if (NullChecker.m81303a(this.f152994g)) {
                this.f152994g.stop();
            }
        }
        if (this.f153002o != i && NullChecker.m81303a(this.f153004q)) {
            if (NullChecker.m81303a(m173209I())) {
                m173209I().m65357B();
            }
            this.f153002o = i;
            if (NullChecker.m81303a(m173209I())) {
                m173209I().m65370z();
            }
        }
        this.f153002o = i;
    }

    @Override // p149l.eb2
    /* JADX INFO: renamed from: p */
    public Object mo39043p(ViewGroup viewGroup, int i) {
        View viewM173210J = m173210J(this.f152999l.get(i), i);
        viewM173210J.setTag(Integer.valueOf(i));
        viewGroup.addView(viewM173210J);
        return Integer.valueOf(i);
    }

    /* JADX INFO: renamed from: p0 */
    public void m173234p0() {
        if (NullChecker.m81303a(m173209I())) {
            m173209I().m65368x(!m173194R());
        }
    }

    /* JADX INFO: renamed from: d0 */
    public void m173224d0(PhotoAlbumPlayerView photoAlbumPlayerView) {
    }
}
