package p007l;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterForwardVideoView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p000p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p000p1.mobile.putong.feed.newui.preview.gesture.PlayerViewWithTransAnim;
import com.p000p1.mobile.putong.feed.p005ui.PlayerView;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import l.c680;
import l.d30;
import l.qib0;
import l.t100;
import l.xck0;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class org {

    /* JADX INFO: renamed from: a */
    public FeedCenterForwardVideoView f11558a;

    /* JADX INFO: renamed from: b */
    public Video f11559b;

    /* JADX INFO: renamed from: c */
    public int f11560c;

    /* JADX INFO: renamed from: d */
    public int f11561d;

    /* JADX INFO: renamed from: e */
    public Moment f11562e;

    /* JADX INFO: renamed from: f */
    public Moment f11563f;

    /* JADX INFO: renamed from: l.org$a */
    public class C2451a extends c680.c {

        /* JADX INFO: renamed from: a */
        public boolean f11564a;

        public C2451a() {
        }

        /* JADX INFO: renamed from: d */
        public void m12744d() {
            this.f11564a = true;
            p6j0.m12916f("e_video_play_over", z5i.m17228u(org.this.f11558a.f3357k), p6j0.C2456a.m12922g("moment_id", ((DbObject) org.this.f11558a.f3355i).id), p6j0.C2456a.m12922g("owner_id", org.this.f11558a.f3355i.owner));
        }

        public void onComplete() {
            super.onComplete();
            p6j0.m12916f("e_video_play_over", z5i.m17228u(org.this.f11558a.f3357k), p6j0.C2456a.m12922g("moment_id", ((DbObject) org.this.f11558a.f3355i).id), p6j0.C2456a.m12922g("owner_id", org.this.f11558a.f3355i.owner));
        }

        public void onResume() {
            if (this.f11564a) {
                p6j0.m12916f("e_video_play_start", z5i.m17228u(org.this.f11558a.f3357k), p6j0.C2456a.m12922g("moment_id", ((DbObject) org.this.f11558a.f3355i).id), p6j0.C2456a.m12922g("owner_id", org.this.f11558a.f3355i.owner));
            }
            this.f11564a = false;
        }

        public void onStart() {
            p6j0.m12916f("e_video_play_start", z5i.m17228u(org.this.f11558a.f3357k), p6j0.C2456a.m12922g("moment_id", ((DbObject) org.this.f11558a.f3355i).id), p6j0.C2456a.m12922g("owner_id", org.this.f11558a.f3355i.owner));
        }
    }

    public org(FeedCenterForwardVideoView feedCenterForwardVideoView) {
        this.f11558a = feedCenterForwardVideoView;
        m12733e();
    }

    /* JADX INFO: renamed from: d */
    public void m12732d(View view, boolean z) {
        if (NullChecker.a(view)) {
            xdl0.M(view, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m12733e() {
        this.f11558a.f3272D.f5063h.setBackground(null);
        this.f11558a.f3272D.f5064i.setImageResource(f3c0.f7900s0);
        this.f11558a.f3272D.f5057b.setBackgroundColor(Color.parseColor("#eeeeee"));
        this.f11558a.f3272D.m7755L(new d30() { // from class: l.lrg
            public final void call() {
                this.f10108a.m12735g();
            }
        });
        this.f11558a.f3272D.f5057b.getHierarchy().C(new ColorDrawable(402653184));
        this.f11558a.f3272D.f5063h.setBackgroundColor(0);
        this.f11558a.f3272D.setLoopMode(true);
        this.f11558a.f3272D.setRadius(4.0f);
    }

    /* JADX INFO: renamed from: f */
    public final void m12734f() {
        this.f11558a.f3272D.getPlayListener().clear();
        if (TextUtils.isEmpty(this.f11558a.f3357k)) {
            return;
        }
        this.f11558a.f3272D.m7763x(new C2451a());
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m12735g() {
        FeedCenterForwardVideoView feedCenterForwardVideoView = this.f11558a;
        if (feedCenterForwardVideoView.f3355i == null) {
            return;
        }
        PhotoAlbumFeedPreviewAct.f4059m = true;
        feedCenterForwardVideoView.m5745c0(0);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m12736h(HashMap map, Moment moment, boolean z) {
        map.put(((DbObject) moment).id, Boolean.valueOf(z));
        this.f11558a.m5735O(z);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m12737i(View view) {
        PhotoAlbumFeedPreviewAct.f4059m = true;
        m12738j();
    }

    /* JADX INFO: renamed from: j */
    public final void m12738j() {
        if (nkg.m12218P() && this.f11558a.m5733M()) {
            this.f11558a.m5750j0(this.f11563f);
        } else {
            FeedCenterForwardVideoView feedCenterForwardVideoView = this.f11558a;
            feedCenterForwardVideoView.m5748g0(this.f11563f, 0, feedCenterForwardVideoView.f3359m, feedCenterForwardVideoView.f3360n);
        }
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: k */
    public final void m12739k() {
        Dimension dimension;
        int i;
        Video video = this.f11559b;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.b(picture) && NullChecker.b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                if (NullChecker.b(this.f11559b.size)) {
                    dimension = this.f11559b.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.b(this.f11559b.size)) {
            dimension = this.f11559b.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(360, 640);
            }
        } else {
            dimension = new Dimension(360, 640);
        }
        float f = dimension.width / dimension.height;
        int iM12109c = (n8i.m12109c(n8i.f10701c, n8i.f10702d) * 2) + t100.d(FeedCenterVideoView.f3339H);
        if (f <= 0.7f) {
            i = (iM12109c * 9) / 16;
        } else if (f <= 0.83f) {
            i = (iM12109c * 3) / 4;
        } else if (f >= 1.2f) {
            i = iM12109c;
            iM12109c = (iM12109c * 3) / 4;
        } else {
            i = iM12109c;
        }
        this.f11561d = iM12109c;
        this.f11560c = i;
        this.f11558a.f3272D.setLayoutParams(new FrameLayout.LayoutParams(i, iM12109c));
    }

    /* JADX INFO: renamed from: l */
    public void m12740l() {
        xdl0.M(this.f11558a.f3273E, true);
        xdl0.M(this.f11558a.f3276H, false);
        xdl0.M(this.f11558a.f3272D, false);
        this.f11558a.f3272D.m7760R();
        this.f11558a.f3272D.m7758P();
        this.f11558a.f3272D.setPlayer(null);
        boolean zM16875b = xyi.m16875b(this.f11558a.f3355i);
        FeedCenterForwardVideoView feedCenterForwardVideoView = this.f11558a;
        if (zM16875b) {
            feedCenterForwardVideoView.f3274F.setText("抱歉，此动态已被删除或失效");
        } else {
            feedCenterForwardVideoView.f3274F.setText("抱歉，此动态已被作者禁止转发");
        }
    }

    /* JADX INFO: renamed from: m */
    public void m12741m(Video video, Picture picture) {
        m12743o(video, picture, n8i.m12110d(n8i.f10701c), false);
    }

    /* JADX INFO: renamed from: n */
    public void m12742n(int i, final Moment moment, final HashMap<String, Boolean> map) {
        Video video;
        Picture picture;
        this.f11563f = moment;
        m12734f();
        m12732d(this.f11558a.f3353g, false);
        CharSequence charSequenceM5730E = this.f11558a.m5730E(moment.momentValue);
        m12732d(this.f11558a.f3352f, !TextUtils.isEmpty(charSequenceM5730E));
        this.f11558a.f3352f.L(map.get(((DbObject) moment).id) == null ? false : map.get(((DbObject) moment).id).booleanValue()).Q(new VExpandableTextContainer.e() { // from class: l.mrg
            /* JADX INFO: renamed from: a */
            public final void m12010a(boolean z) {
                this.f10545a.m12736h(map, moment, z);
            }
        }).M(charSequenceM5730E);
        if (xyi.m16874a(moment)) {
            moment.curForwardRenderState = 2;
            m12740l();
            return;
        }
        moment.curForwardRenderState = 1;
        xdl0.M(this.f11558a.f3273E, false);
        xdl0.M(this.f11558a.f3276H, true);
        xdl0.M(this.f11558a.f3272D, true);
        this.f11562e = FeedModule.f316d.m16753w7(moment.thirdShareSource.sourceId);
        this.f11558a.f3275G.setText("@" + FeedModule.f316d.m16628e8(this.f11562e.owner).name + " " + this.f11562e.value);
        List<Media> list = this.f11562e.media;
        if (list.size() != 1) {
            return;
        }
        Media media = list.get(0);
        if ((media instanceof Video) && (picture = (video = (Video) media).cover) != null) {
            m12741m(video, picture);
        }
    }

    /* JADX INFO: renamed from: o */
    public final void m12743o(Video video, Picture picture, int i, boolean z) {
        if (!video.equals(this.f11559b)) {
            this.f11558a.f3272D.m7760R();
            this.f11558a.f3272D.m7758P();
            this.f11558a.f3272D.setPlayer(null);
            this.f11558a.f3272D.m7759Q(video, z);
            PlayerView playerView = this.f11558a.f3272D;
            if (playerView instanceof PlayerViewWithTransAnim) {
                ((PlayerViewWithTransAnim) playerView).setZoomAnimationKey(Media.URL_TO_CACHEKEY(video.url));
            }
        }
        this.f11559b = video;
        Dimension dimension = picture.size;
        Point pointB = xck0.b(i, new Point(dimension.width, dimension.height));
        xdl0.M0(this.f11558a.f3272D, true);
        m12739k();
        VDraweeView vDraweeViewFindViewById = this.f11558a.f3272D.findViewById(b5c0.f5953D);
        xdl0.E0(this.f11558a.f3276H, new View.OnClickListener() { // from class: l.nrg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10855a.m12737i(view);
            }
        });
        if (!TEnum.equals(picture.status, MediaLocalStatus.raw) && !TextUtils.isEmpty(picture.url)) {
            qib0.G.Q0(vDraweeViewFindViewById, picture.calculatedWidth(pointB.x));
            vDraweeViewFindViewById.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        }
        this.f11558a.f3272D.m7761S(this.f11560c, this.f11561d);
    }
}
