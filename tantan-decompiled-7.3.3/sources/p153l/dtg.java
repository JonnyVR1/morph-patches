package p153l;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p051p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p051p1.mobile.putong.feed.newui.preview.gesture.PlayerViewWithTransAnim;
import com.p051p1.mobile.putong.feed.p065ui.PlayerView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes13.dex */
public class dtg {

    /* JADX INFO: renamed from: a */
    public FeedCenterForwardVideoView f90568a;

    /* JADX INFO: renamed from: b */
    public Video f90569b;

    /* JADX INFO: renamed from: c */
    public int f90570c;

    /* JADX INFO: renamed from: d */
    public int f90571d;

    /* JADX INFO: renamed from: e */
    public Moment f90572e;

    /* JADX INFO: renamed from: f */
    public Moment f90573f;

    /* JADX INFO: renamed from: l.dtg$a */
    public class C16619a extends ie80.C17711c {

        /* JADX INFO: renamed from: a */
        public boolean f90574a;

        public C16619a() {
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            this.f90574a = true;
            tfj0.m190943f("e_video_play_over", o7i.m166350u(dtg.this.f90568a.f42744k), tfj0.C20302a.m190949g("moment_id", dtg.this.f90568a.f42742i.f56859id), tfj0.C20302a.m190949g("owner_id", dtg.this.f90568a.f42742i.owner));
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onComplete() {
            super.onComplete();
            tfj0.m190943f("e_video_play_over", o7i.m166350u(dtg.this.f90568a.f42744k), tfj0.C20302a.m190949g("moment_id", dtg.this.f90568a.f42742i.f56859id), tfj0.C20302a.m190949g("owner_id", dtg.this.f90568a.f42742i.owner));
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onResume() {
            if (this.f90574a) {
                tfj0.m190943f("e_video_play_start", o7i.m166350u(dtg.this.f90568a.f42744k), tfj0.C20302a.m190949g("moment_id", dtg.this.f90568a.f42742i.f56859id), tfj0.C20302a.m190949g("owner_id", dtg.this.f90568a.f42742i.owner));
            }
            this.f90574a = false;
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onStart() {
            tfj0.m190943f("e_video_play_start", o7i.m166350u(dtg.this.f90568a.f42744k), tfj0.C20302a.m190949g("moment_id", dtg.this.f90568a.f42742i.f56859id), tfj0.C20302a.m190949g("owner_id", dtg.this.f90568a.f42742i.owner));
        }
    }

    public dtg(FeedCenterForwardVideoView feedCenterForwardVideoView) {
        this.f90568a = feedCenterForwardVideoView;
        m117858e();
    }

    /* JADX INFO: renamed from: d */
    public void m117857d(View view, boolean z) {
        if (NullChecker.m82486a(view)) {
            bnl0.m105524M(view, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m117858e() {
        this.f90568a.f42659D.f44450h.setBackground(null);
        this.f90568a.f42659D.f44451i.setImageResource(lbc0.f131135s0);
        this.f90568a.f42659D.f44444b.setBackgroundColor(Color.parseColor("#eeeeee"));
        this.f90568a.f42659D.m67754L(new x20() { // from class: l.atg
            @Override // p153l.x20
            public final void call() {
                this.f73351a.m117860g();
            }
        });
        this.f90568a.f42659D.f44444b.getHierarchy().m207040C(new ColorDrawable(402653184));
        this.f90568a.f42659D.f44450h.setBackgroundColor(0);
        this.f90568a.f42659D.setLoopMode(true);
        this.f90568a.f42659D.setRadius(4.0f);
    }

    /* JADX INFO: renamed from: f */
    public final void m117859f() {
        this.f90568a.f42659D.getPlayListener().clear();
        if (TextUtils.isEmpty(this.f90568a.f42744k)) {
            return;
        }
        this.f90568a.f42659D.m67762x(new C16619a());
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m117860g() {
        FeedCenterForwardVideoView feedCenterForwardVideoView = this.f90568a;
        if (feedCenterForwardVideoView.f42742i == null) {
            return;
        }
        PhotoAlbumFeedPreviewAct.f43446m = true;
        feedCenterForwardVideoView.m65834c0(0);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m117861h(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56859id, Boolean.valueOf(z));
        this.f90568a.m65824O(z);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m117862i(View view) {
        PhotoAlbumFeedPreviewAct.f43446m = true;
        m117863j();
    }

    /* JADX INFO: renamed from: j */
    public final void m117863j() {
        if (cmg.m111188P() && this.f90568a.m65822M()) {
            this.f90568a.m65839j0(this.f90573f);
        } else {
            FeedCenterForwardVideoView feedCenterForwardVideoView = this.f90568a;
            feedCenterForwardVideoView.m65837g0(this.f90573f, 0, feedCenterForwardVideoView.f42746m, feedCenterForwardVideoView.f42747n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: k */
    public final void m117864k() {
        Dimension dimension;
        int i;
        Video video = this.f90569b;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m82487b(picture) && NullChecker.m82487b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                if (NullChecker.m82487b(this.f90569b.size)) {
                    dimension = this.f90569b.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m82487b(this.f90569b.size)) {
            dimension = this.f90569b.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(360, 640);
            }
        } else {
            dimension = new Dimension(360, 640);
        }
        float f = dimension.width / dimension.height;
        int iM108495c = (cai.m108495c(cai.f80594c, cai.f80595d) * 2) + qa00.m175859d(FeedCenterVideoView.f42726H);
        if (f <= 0.7f) {
            i = (iM108495c * 9) / 16;
        } else if (f <= 0.83f) {
            i = (iM108495c * 3) / 4;
        } else if (f >= 1.2f) {
            i = iM108495c;
            iM108495c = (iM108495c * 3) / 4;
        } else {
            i = iM108495c;
        }
        this.f90571d = iM108495c;
        this.f90570c = i;
        this.f90568a.f42659D.setLayoutParams(new FrameLayout.LayoutParams(i, iM108495c));
    }

    /* JADX INFO: renamed from: l */
    public void m117865l() {
        bnl0.m105524M(this.f90568a.f42660E, true);
        bnl0.m105524M(this.f90568a.f42663H, false);
        bnl0.m105524M(this.f90568a.f42659D, false);
        this.f90568a.f42659D.m67759R();
        this.f90568a.f42659D.m67757P();
        this.f90568a.f42659D.setPlayer(null);
        boolean zM184048b = s1j.m184048b(this.f90568a.f42742i);
        FeedCenterForwardVideoView feedCenterForwardVideoView = this.f90568a;
        if (zM184048b) {
            feedCenterForwardVideoView.f42661F.setText("抱歉，此动态已被删除或失效");
        } else {
            feedCenterForwardVideoView.f42661F.setText("抱歉，此动态已被作者禁止转发");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m117866m(Video video, Picture picture) {
        m117868o(video, picture, cai.m108496d(cai.f80594c), false);
    }

    /* JADX INFO: renamed from: n */
    public void m117867n(int i, final Moment moment, final HashMap<String, Boolean> map) {
        Video video;
        Picture picture;
        this.f90573f = moment;
        m117859f();
        m117857d(this.f90568a.f42740g, false);
        CharSequence charSequenceM65819E = this.f90568a.m65819E(moment.momentValue);
        m117857d(this.f90568a.f42739f, !TextUtils.isEmpty(charSequenceM65819E));
        this.f90568a.f42739f.m80383L(map.get(moment.f56859id) == null ? false : map.get(moment.f56859id).booleanValue()).m80388Q(new VExpandableTextContainer.InterfaceC13253e() { // from class: l.btg
            @Override // com.p051p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13253e
            /* JADX INFO: renamed from: a */
            public final void mo80399a(boolean z) {
                this.f78353a.m117861h(map, moment, z);
            }
        }).m80384M(charSequenceM65819E);
        if (s1j.m184047a(moment)) {
            moment.curForwardRenderState = 2;
            m117865l();
            return;
        }
        moment.curForwardRenderState = 1;
        bnl0.m105524M(this.f90568a.f42660E, false);
        bnl0.m105524M(this.f90568a.f42663H, true);
        bnl0.m105524M(this.f90568a.f42659D, true);
        this.f90572e = FeedModule.f39703d.m145813w7(moment.thirdShareSource.sourceId);
        this.f90568a.f42662G.setText("@" + FeedModule.f39703d.m145688e8(this.f90572e.owner).name + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f90572e.value);
        List<Media> list = this.f90572e.media;
        if (list.size() != 1) {
            return;
        }
        Media media = list.get(0);
        if ((media instanceof Video) && (picture = (video = (Video) media).cover) != null) {
            m117866m(video, picture);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m117868o(Video video, Picture picture, int i, boolean z) {
        if (!video.equals(this.f90569b)) {
            this.f90568a.f42659D.m67759R();
            this.f90568a.f42659D.m67757P();
            this.f90568a.f42659D.setPlayer(null);
            this.f90568a.f42659D.m67758Q(video, z);
            PlayerView playerView = this.f90568a.f42659D;
            if (playerView instanceof PlayerViewWithTransAnim) {
                ((PlayerViewWithTransAnim) playerView).setZoomAnimationKey(Media.URL_TO_CACHEKEY(video.url));
            }
        }
        this.f90569b = video;
        Dimension dimension = picture.size;
        Point pointM116963b = dmk0.m116963b(i, new Point(dimension.width, dimension.height));
        bnl0.m105525M0(this.f90568a.f42659D, true);
        m117864k();
        VDraweeView vDraweeView = (VDraweeView) this.f90568a.f42659D.findViewById(hdc0.f108825D);
        bnl0.m105509E0(this.f90568a.f42663H, new View.OnClickListener() { // from class: l.ctg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83695a.m117862i(view);
            }
        });
        if (!TEnum.equals(picture.status, "raw") && !TextUtils.isEmpty(picture.url)) {
            uqb0.f180374G.m127125Q0(vDraweeView, picture.calculatedWidth(pointM116963b.x));
            vDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        }
        this.f90568a.f42659D.m67760S(this.f90570c, this.f90571d);
    }
}
