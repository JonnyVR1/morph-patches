package p007l;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.data.Dimension;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p000p1.mobile.putong.feed.newui.photoalbum.live.LiveTagView;
import com.p000p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p000p1.mobile.putong.feed.newui.preview.gesture.PlayerViewWithTransAnim;
import com.p000p1.mobile.putong.feed.p005ui.PlayerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import java.util.HashMap;
import l.c680;
import l.d30;
import l.qib0;
import l.t100;
import l.xck0;
import l.xdl0;
import v.AutoVDraweeView;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class xsg {

    /* JADX INFO: renamed from: A */
    public boolean f15114A;

    /* JADX INFO: renamed from: B */
    public int f15115B;

    /* JADX INFO: renamed from: C */
    public hx60 f15116C;

    /* JADX INFO: renamed from: D */
    public int f15117D;

    /* JADX INFO: renamed from: E */
    public int f15118E;

    /* JADX INFO: renamed from: a */
    public FeedCenterVideoView f15119a;

    /* JADX INFO: renamed from: b */
    public View f15120b;

    /* JADX INFO: renamed from: c */
    public VLinear f15121c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f15122d;

    /* JADX INFO: renamed from: e */
    public LiveTagView f15123e;

    /* JADX INFO: renamed from: f */
    public VText f15124f;

    /* JADX INFO: renamed from: g */
    public VText f15125g;

    /* JADX INFO: renamed from: h */
    public VExpandableTextContainer f15126h;

    /* JADX INFO: renamed from: i */
    public VText f15127i;

    /* JADX INFO: renamed from: j */
    public PlayerView f15128j;

    /* JADX INFO: renamed from: k */
    public VFrame f15129k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f15130l;

    /* JADX INFO: renamed from: m */
    public VImage f15131m;

    /* JADX INFO: renamed from: n */
    public VImage f15132n;

    /* JADX INFO: renamed from: o */
    public VText f15133o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayout f15134p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f15135q;

    /* JADX INFO: renamed from: r */
    public VText f15136r;

    /* JADX INFO: renamed from: s */
    public AnimEffectPlayer f15137s;

    /* JADX INFO: renamed from: t */
    public VImage f15138t;

    /* JADX INFO: renamed from: u */
    public View f15139u;

    /* JADX INFO: renamed from: v */
    public Act f15140v;

    /* JADX INFO: renamed from: w */
    public Video f15141w;

    /* JADX INFO: renamed from: x */
    public FeedCenterVideoView f15142x;

    /* JADX INFO: renamed from: y */
    public Moment f15143y;

    /* JADX INFO: renamed from: z */
    public String f15144z;

    /* JADX INFO: renamed from: l.xsg$a */
    public class C2534a extends c680.c {

        /* JADX INFO: renamed from: a */
        public boolean f15145a;

        public C2534a() {
        }

        /* JADX INFO: renamed from: d */
        public void m16854d() {
            this.f15145a = true;
            p6j0.m12916f("e_video_play_over", z5i.m17228u(xsg.this.f15144z), p6j0.C2456a.m12922g("moment_id", ((DbObject) xsg.this.f15143y).id), p6j0.C2456a.m12922g("owner_id", xsg.this.f15143y.owner));
        }

        public void onComplete() {
            super.onComplete();
            p6j0.m12916f("e_video_play_over", z5i.m17228u(xsg.this.f15144z), p6j0.C2456a.m12922g("moment_id", ((DbObject) xsg.this.f15143y).id), p6j0.C2456a.m12922g("owner_id", xsg.this.f15143y.owner));
        }

        public void onResume() {
            if (this.f15145a) {
                p6j0.m12916f("e_video_play_start", z5i.m17228u(xsg.this.f15144z), p6j0.C2456a.m12922g("moment_id", ((DbObject) xsg.this.f15143y).id), p6j0.C2456a.m12922g("owner_id", xsg.this.f15143y.owner));
            }
            this.f15145a = false;
        }

        public void onStart() {
            p6j0.m12916f("e_video_play_start", z5i.m17228u(xsg.this.f15144z), p6j0.C2456a.m12922g("moment_id", ((DbObject) xsg.this.f15143y).id), p6j0.C2456a.m12922g("owner_id", xsg.this.f15143y.owner));
        }
    }

    public xsg(Act act, ssg ssgVar, FeedCenterVideoView feedCenterVideoView) {
        this.f15140v = act;
        this.f15142x = feedCenterVideoView;
        this.f15143y = feedCenterVideoView.f3355i;
        this.f15144z = feedCenterVideoView.f3357k;
        this.f15114A = feedCenterVideoView.f3362p;
        this.f15115B = feedCenterVideoView.f3363q;
        this.f15116C = feedCenterVideoView.f3365s;
        this.f15119a = ssgVar.m14298j();
        this.f15120b = ssgVar.m14295g();
        this.f15121c = ssgVar.m14293e();
        this.f15122d = ssgVar.m14302n();
        this.f15123e = ssgVar.m14303o();
        this.f15124f = ssgVar.m14304p();
        this.f15125g = ssgVar.m14305q();
        this.f15126h = ssgVar.m14300l();
        this.f15127i = ssgVar.m14306r();
        this.f15128j = ssgVar.m14288B();
        this.f15129k = ssgVar.m14307s();
        this.f15130l = ssgVar.m14308t();
        this.f15131m = ssgVar.m14310v();
        this.f15132n = ssgVar.m14309u();
        this.f15133o = ssgVar.m14311w();
        this.f15134p = ssgVar.m14313y();
        this.f15135q = ssgVar.m14287A();
        this.f15136r = ssgVar.m14314z();
        this.f15137s = ssgVar.m14294f();
        this.f15138t = ssgVar.m14312x();
        this.f15139u = ssgVar.m14297i();
        xdl0.M(this.f15128j, false);
        this.f15121c.removeView(this.f15128j);
        this.f15128j = null;
        m16844e();
    }

    /* JADX INFO: renamed from: d */
    public void m16843d(View view, boolean z) {
        if (NullChecker.a(view)) {
            xdl0.M(view, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m16844e() {
        PlayerView playerView = this.f15128j;
        if (playerView == null) {
            return;
        }
        playerView.f5063h.setBackground(null);
        this.f15128j.f5064i.setImageResource(f3c0.f7900s0);
        this.f15128j.f5057b.setBackgroundColor(Color.parseColor("#eeeeee"));
        this.f15128j.m7755L(new d30() { // from class: l.usg
            public final void call() {
                this.f13925a.m16845f();
            }
        });
        this.f15128j.f5057b.getHierarchy().C(new ColorDrawable(402653184));
        this.f15128j.f5063h.setBackgroundColor(0);
        this.f15128j.setLoopMode(true);
        this.f15128j.setRadius(4.0f);
        if (TextUtils.isEmpty(this.f15144z)) {
            return;
        }
        this.f15128j.getPlayListener().clear();
        this.f15128j.m7763x(new C2534a());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m16845f() {
        if (this.f15143y == null) {
            return;
        }
        PhotoAlbumFeedPreviewAct.f4059m = true;
        this.f15142x.m5745c0(0);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m16846g(View view) {
        PhotoAlbumFeedPreviewAct.f4059m = true;
        this.f15142x.m5745c0(0);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m16847h(View view) {
        PhotoAlbumFeedPreviewAct.f4059m = true;
        this.f15142x.m5745c0(0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: i */
    public final void m16848i() {
        Dimension dimension;
        int i;
        Video video = this.f15141w;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.b(picture) && NullChecker.b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                if (NullChecker.b(this.f15141w.size)) {
                    dimension = this.f15141w.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.b(this.f15141w.size)) {
            dimension = this.f15141w.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(360, 640);
            }
        } else {
            dimension = new Dimension(360, 640);
        }
        float f = dimension.width / dimension.height;
        int iD = (this.f15142x.f3342D * 2) + t100.d(FeedCenterVideoView.f3339H);
        if (f <= 0.7f) {
            i = (iD * 9) / 16;
        } else if (f <= 0.83f) {
            i = (iD * 3) / 4;
        } else if (f >= 1.2f) {
            i = iD;
            iD = (iD * 3) / 4;
        } else {
            i = iD;
        }
        this.f15118E = iD;
        this.f15117D = i;
        this.f15128j.setLayoutParams(new FrameLayout.LayoutParams(i, iD));
    }

    /* JADX INFO: renamed from: j */
    public void m16849j(Video video, Picture picture) {
        int i = this.f15142x.f3341C;
        if (NullChecker.a(this.f15128j)) {
            m16851m(video, picture, i, false, false);
        } else {
            m16852n(picture, (int) (i * 0.83f));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m16850k(Video video, Picture picture) {
        int i = this.f15142x.f3341C;
        if (NullChecker.a(this.f15128j)) {
            m16851m(video, picture, i, true, false);
        } else {
            m16852n(picture, (int) (i * 0.83f));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m16851m(Video video, Picture picture, int i, boolean z, boolean z2) {
        if (!video.equals(this.f15141w)) {
            this.f15128j.m7760R();
            this.f15128j.m7758P();
            this.f15128j.setPlayer(null);
            this.f15128j.m7759Q(video, z);
            PlayerView playerView = this.f15128j;
            if (playerView instanceof PlayerViewWithTransAnim) {
                ((PlayerViewWithTransAnim) playerView).setZoomAnimationKey(Media.URL_TO_CACHEKEY(video.url));
            }
        }
        this.f15141w = video;
        Dimension dimension = picture.size;
        Point pointB = xck0.b(i, new Point(dimension.width, dimension.height));
        xdl0.M0(this.f15128j, true);
        m16848i();
        AutoVDraweeView autoVDraweeView = (VDraweeView) this.f15128j.findViewById(b5c0.f5953D);
        xdl0.E0(autoVDraweeView, new View.OnClickListener() { // from class: l.vsg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14291a.m16846g(view);
            }
        });
        if (!TEnum.equals(picture.status, MediaLocalStatus.raw) && !TextUtils.isEmpty(picture.url)) {
            if (autoVDraweeView instanceof AutoVDraweeView) {
                autoVDraweeView.setImageUrl(picture.url);
            } else {
                qib0.G.Q0(autoVDraweeView, picture.calculatedWidth(pointB.x));
            }
            autoVDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        }
        this.f15128j.m7761S(this.f15117D, this.f15118E);
    }

    /* JADX INFO: renamed from: n */
    public final void m16852n(Picture picture, int i) {
        m16853o(picture, i);
        this.f15132n.setImageResource(f3c0.f7701S1);
        xdl0.M0(this.f15131m, false);
    }

    /* JADX INFO: renamed from: o */
    public final void m16853o(Picture picture, int i) {
        Dimension dimension = picture.size;
        Point pointB = xck0.b(i, new Point(dimension.width, dimension.height));
        xdl0.M0(this.f15129k, true);
        this.f15129k.setLayoutParams(new FrameLayout.LayoutParams(pointB.x, pointB.y));
        xdl0.E0(this.f15130l, new View.OnClickListener() { // from class: l.wsg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14673a.m16847h(view);
            }
        });
        this.f15132n.setImageResource(f3c0.f7578B6);
        if (TEnum.equals(picture.status, MediaLocalStatus.raw) || TextUtils.isEmpty(picture.url)) {
            return;
        }
        qib0.G.Q0(this.f15130l, picture.calculatedWidth(pointB.x));
        this.f15130l.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
    }

    /* JADX INFO: renamed from: l */
    public void mo13215l(int i, Moment moment, HashMap<String, Boolean> map) {
    }
}
