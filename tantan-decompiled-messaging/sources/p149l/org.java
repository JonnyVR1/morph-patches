package p149l;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p046p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p046p1.mobile.putong.feed.newui.preview.gesture.PlayerViewWithTransAnim;
import com.p046p1.mobile.putong.feed.p060ui.PlayerView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes12.dex */
public class org {

    /* JADX INFO: renamed from: a */
    public FeedCenterForwardVideoView f145268a;

    /* JADX INFO: renamed from: b */
    public Video f145269b;

    /* JADX INFO: renamed from: c */
    public int f145270c;

    /* JADX INFO: renamed from: d */
    public int f145271d;

    /* JADX INFO: renamed from: e */
    public Moment f145272e;

    /* JADX INFO: renamed from: f */
    public Moment f145273f;

    /* JADX INFO: renamed from: l.org$a */
    public class C19007a extends c680.C16085c {

        /* JADX INFO: renamed from: a */
        public boolean f145274a;

        public C19007a() {
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            this.f145274a = true;
            p6j0.m167672f("e_video_play_over", z5i.m217340u(org.this.f145268a.f41896k), p6j0.C19147a.m167678g("moment_id", org.this.f145268a.f41894i.f56011id), p6j0.C19147a.m167678g("owner_id", org.this.f145268a.f41894i.owner));
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onComplete() {
            super.onComplete();
            p6j0.m167672f("e_video_play_over", z5i.m217340u(org.this.f145268a.f41896k), p6j0.C19147a.m167678g("moment_id", org.this.f145268a.f41894i.f56011id), p6j0.C19147a.m167678g("owner_id", org.this.f145268a.f41894i.owner));
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onResume() {
            if (this.f145274a) {
                p6j0.m167672f("e_video_play_start", z5i.m217340u(org.this.f145268a.f41896k), p6j0.C19147a.m167678g("moment_id", org.this.f145268a.f41894i.f56011id), p6j0.C19147a.m167678g("owner_id", org.this.f145268a.f41894i.owner));
            }
            this.f145274a = false;
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onStart() {
            p6j0.m167672f("e_video_play_start", z5i.m217340u(org.this.f145268a.f41896k), p6j0.C19147a.m167678g("moment_id", org.this.f145268a.f41894i.f56011id), p6j0.C19147a.m167678g("owner_id", org.this.f145268a.f41894i.owner));
        }
    }

    public org(FeedCenterForwardVideoView feedCenterForwardVideoView) {
        this.f145268a = feedCenterForwardVideoView;
        m165557e();
    }

    /* JADX INFO: renamed from: d */
    public void m165556d(View view, boolean z) {
        if (NullChecker.m81303a(view)) {
            xdl0.m208344M(view, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m165557e() {
        this.f145268a.f41811D.f43602h.setBackground(null);
        this.f145268a.f41811D.f43603i.setImageResource(f3c0.f94617s0);
        this.f145268a.f41811D.f43596b.setBackgroundColor(Color.parseColor("#eeeeee"));
        this.f145268a.f41811D.m66571L(new d30() { // from class: l.lrg
            @Override // p149l.d30
            public final void call() {
                this.f129695a.m165559g();
            }
        });
        this.f145268a.f41811D.f43596b.getHierarchy().m112048C(new ColorDrawable(402653184));
        this.f145268a.f41811D.f43602h.setBackgroundColor(0);
        this.f145268a.f41811D.setLoopMode(true);
        this.f145268a.f41811D.setRadius(4.0f);
    }

    /* JADX INFO: renamed from: f */
    public final void m165558f() {
        this.f145268a.f41811D.getPlayListener().clear();
        if (TextUtils.isEmpty(this.f145268a.f41896k)) {
            return;
        }
        this.f145268a.f41811D.m66579x(new C19007a());
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m165559g() {
        FeedCenterForwardVideoView feedCenterForwardVideoView = this.f145268a;
        if (feedCenterForwardVideoView.f41894i == null) {
            return;
        }
        PhotoAlbumFeedPreviewAct.f42598m = true;
        feedCenterForwardVideoView.m64651c0(0);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m165560h(HashMap map, Moment moment, boolean z) {
        map.put(moment.f56011id, Boolean.valueOf(z));
        this.f145268a.m64641O(z);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m165561i(View view) {
        PhotoAlbumFeedPreviewAct.f42598m = true;
        m165562j();
    }

    /* JADX INFO: renamed from: j */
    public final void m165562j() {
        if (nkg.m159859P() && this.f145268a.m64639M()) {
            this.f145268a.m64656j0(this.f145273f);
        } else {
            FeedCenterForwardVideoView feedCenterForwardVideoView = this.f145268a;
            feedCenterForwardVideoView.m64654g0(this.f145273f, 0, feedCenterForwardVideoView.f41898m, feedCenterForwardVideoView.f41899n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: k */
    public final void m165563k() {
        Dimension dimension;
        int i;
        Video video = this.f145269b;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m81304b(picture) && NullChecker.m81304b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                if (NullChecker.m81304b(this.f145269b.size)) {
                    dimension = this.f145269b.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m81304b(this.f145269b.size)) {
            dimension = this.f145269b.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(360, 640);
            }
        } else {
            dimension = new Dimension(360, 640);
        }
        float f = dimension.width / dimension.height;
        int iM158496c = (n8i.m158496c(n8i.f137647c, n8i.f137648d) * 2) + t100.m186890d(FeedCenterVideoView.f41878H);
        if (f <= 0.7f) {
            i = (iM158496c * 9) / 16;
        } else if (f <= 0.83f) {
            i = (iM158496c * 3) / 4;
        } else if (f >= 1.2f) {
            i = iM158496c;
            iM158496c = (iM158496c * 3) / 4;
        } else {
            i = iM158496c;
        }
        this.f145271d = iM158496c;
        this.f145270c = i;
        this.f145268a.f41811D.setLayoutParams(new FrameLayout.LayoutParams(i, iM158496c));
    }

    /* JADX INFO: renamed from: l */
    public void m165564l() {
        xdl0.m208344M(this.f145268a.f41812E, true);
        xdl0.m208344M(this.f145268a.f41815H, false);
        xdl0.m208344M(this.f145268a.f41811D, false);
        this.f145268a.f41811D.m66576R();
        this.f145268a.f41811D.m66574P();
        this.f145268a.f41811D.setPlayer(null);
        boolean zM211770b = xyi.m211770b(this.f145268a.f41894i);
        FeedCenterForwardVideoView feedCenterForwardVideoView = this.f145268a;
        if (zM211770b) {
            feedCenterForwardVideoView.f41813F.setText("抱歉，此动态已被删除或失效");
        } else {
            feedCenterForwardVideoView.f41813F.setText("抱歉，此动态已被作者禁止转发");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m165565m(Video video, Picture picture) {
        m165567o(video, picture, n8i.m158497d(n8i.f137647c), false);
    }

    /* JADX INFO: renamed from: n */
    public void m165566n(int i, final Moment moment, final HashMap<String, Boolean> map) {
        Video video;
        Picture picture;
        this.f145273f = moment;
        m165558f();
        m165556d(this.f145268a.f41892g, false);
        CharSequence charSequenceM64636E = this.f145268a.m64636E(moment.momentValue);
        m165556d(this.f145268a.f41891f, !TextUtils.isEmpty(charSequenceM64636E));
        this.f145268a.f41891f.m79200L(map.get(moment.f56011id) == null ? false : map.get(moment.f56011id).booleanValue()).m79205Q(new VExpandableTextContainer.InterfaceC13090e() { // from class: l.mrg
            @Override // com.p046p1.mobile.putong.newui.view.VExpandableTextContainer.InterfaceC13090e
            /* JADX INFO: renamed from: a */
            public final void mo79216a(boolean z) {
                this.f135362a.m165560h(map, moment, z);
            }
        }).m79201M(charSequenceM64636E);
        if (xyi.m211769a(moment)) {
            moment.curForwardRenderState = 2;
            m165564l();
            return;
        }
        moment.curForwardRenderState = 1;
        xdl0.m208344M(this.f145268a.f41812E, false);
        xdl0.m208344M(this.f145268a.f41815H, true);
        xdl0.m208344M(this.f145268a.f41811D, true);
        this.f145272e = FeedModule.f38855d.m209572w7(moment.thirdShareSource.sourceId);
        this.f145268a.f41814G.setText("@" + FeedModule.f38855d.m209447e8(this.f145272e.owner).name + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + this.f145272e.value);
        List<Media> list = this.f145272e.media;
        if (list.size() != 1) {
            return;
        }
        Media media = list.get(0);
        if ((media instanceof Video) && (picture = (video = (Video) media).cover) != null) {
            m165565m(video, picture);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m165567o(Video video, Picture picture, int i, boolean z) {
        if (!video.equals(this.f145269b)) {
            this.f145268a.f41811D.m66576R();
            this.f145268a.f41811D.m66574P();
            this.f145268a.f41811D.setPlayer(null);
            this.f145268a.f41811D.m66575Q(video, z);
            PlayerView playerView = this.f145268a.f41811D;
            if (playerView instanceof PlayerViewWithTransAnim) {
                ((PlayerViewWithTransAnim) playerView).setZoomAnimationKey(Media.URL_TO_CACHEKEY(video.url));
            }
        }
        this.f145269b = video;
        Dimension dimension = picture.size;
        Point pointM208121b = xck0.m208121b(i, new Point(dimension.width, dimension.height));
        xdl0.m208345M0(this.f145268a.f41811D, true);
        m165563k();
        VDraweeView vDraweeView = (VDraweeView) this.f145268a.f41811D.findViewById(b5c0.f73472D);
        xdl0.m208329E0(this.f145268a.f41815H, new View.OnClickListener() { // from class: l.nrg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140186a.m165561i(view);
            }
        });
        if (!TEnum.equals(picture.status, "raw") && !TextUtils.isEmpty(picture.url)) {
            qib0.f154691G.m102341Q0(vDraweeView, picture.calculatedWidth(pointM208121b.x));
            vDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        }
        this.f145268a.f41811D.m66577S(this.f145270c, this.f145271d);
    }
}
