package p153l;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p051p1.mobile.putong.feed.newui.photoalbum.live.LiveTagView;
import com.p051p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p051p1.mobile.putong.feed.newui.preview.gesture.PlayerViewWithTransAnim;
import com.p051p1.mobile.putong.feed.p065ui.PlayerView;
import com.p051p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import java.util.HashMap;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class mug {

    /* JADX INFO: renamed from: A */
    public boolean f138779A;

    /* JADX INFO: renamed from: B */
    public int f138780B;

    /* JADX INFO: renamed from: C */
    public n570 f138781C;

    /* JADX INFO: renamed from: D */
    public int f138782D;

    /* JADX INFO: renamed from: E */
    public int f138783E;

    /* JADX INFO: renamed from: a */
    public FeedCenterVideoView f138784a;

    /* JADX INFO: renamed from: b */
    public View f138785b;

    /* JADX INFO: renamed from: c */
    public VLinear f138786c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f138787d;

    /* JADX INFO: renamed from: e */
    public LiveTagView f138788e;

    /* JADX INFO: renamed from: f */
    public VText f138789f;

    /* JADX INFO: renamed from: g */
    public VText f138790g;

    /* JADX INFO: renamed from: h */
    public VExpandableTextContainer f138791h;

    /* JADX INFO: renamed from: i */
    public VText f138792i;

    /* JADX INFO: renamed from: j */
    public PlayerView f138793j;

    /* JADX INFO: renamed from: k */
    public VFrame f138794k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f138795l;

    /* JADX INFO: renamed from: m */
    public VImage f138796m;

    /* JADX INFO: renamed from: n */
    public VImage f138797n;

    /* JADX INFO: renamed from: o */
    public VText f138798o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayout f138799p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f138800q;

    /* JADX INFO: renamed from: r */
    public VText f138801r;

    /* JADX INFO: renamed from: s */
    public AnimEffectPlayer f138802s;

    /* JADX INFO: renamed from: t */
    public VImage f138803t;

    /* JADX INFO: renamed from: u */
    public View f138804u;

    /* JADX INFO: renamed from: v */
    public Act f138805v;

    /* JADX INFO: renamed from: w */
    public Video f138806w;

    /* JADX INFO: renamed from: x */
    public FeedCenterVideoView f138807x;

    /* JADX INFO: renamed from: y */
    public Moment f138808y;

    /* JADX INFO: renamed from: z */
    public String f138809z;

    /* JADX INFO: renamed from: l.mug$a */
    public class C18714a extends ie80.C17711c {

        /* JADX INFO: renamed from: a */
        public boolean f138810a;

        public C18714a() {
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        /* JADX INFO: renamed from: d */
        public void mo45236d() {
            this.f138810a = true;
            tfj0.m190943f("e_video_play_over", o7i.m166350u(mug.this.f138809z), tfj0.C20302a.m190949g("moment_id", mug.this.f138808y.f56859id), tfj0.C20302a.m190949g("owner_id", mug.this.f138808y.owner));
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onComplete() {
            super.onComplete();
            tfj0.m190943f("e_video_play_over", o7i.m166350u(mug.this.f138809z), tfj0.C20302a.m190949g("moment_id", mug.this.f138808y.f56859id), tfj0.C20302a.m190949g("owner_id", mug.this.f138808y.owner));
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onResume() {
            if (this.f138810a) {
                tfj0.m190943f("e_video_play_start", o7i.m166350u(mug.this.f138809z), tfj0.C20302a.m190949g("moment_id", mug.this.f138808y.f56859id), tfj0.C20302a.m190949g("owner_id", mug.this.f138808y.owner));
            }
            this.f138810a = false;
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onStart() {
            tfj0.m190943f("e_video_play_start", o7i.m166350u(mug.this.f138809z), tfj0.C20302a.m190949g("moment_id", mug.this.f138808y.f56859id), tfj0.C20302a.m190949g("owner_id", mug.this.f138808y.owner));
        }
    }

    public mug(Act act, hug hugVar, FeedCenterVideoView feedCenterVideoView) {
        this.f138805v = act;
        this.f138807x = feedCenterVideoView;
        this.f138808y = feedCenterVideoView.f42742i;
        this.f138809z = feedCenterVideoView.f42744k;
        this.f138779A = feedCenterVideoView.f42749p;
        this.f138780B = feedCenterVideoView.f42750q;
        this.f138781C = feedCenterVideoView.f42752s;
        this.f138784a = hugVar.m137210j();
        this.f138785b = hugVar.m137207g();
        this.f138786c = hugVar.m137205e();
        this.f138787d = hugVar.m137214n();
        this.f138788e = hugVar.m137215o();
        this.f138789f = hugVar.m137216p();
        this.f138790g = hugVar.m137217q();
        this.f138791h = hugVar.m137212l();
        this.f138792i = hugVar.m137218r();
        this.f138793j = hugVar.m137200B();
        this.f138794k = hugVar.m137219s();
        this.f138795l = hugVar.m137220t();
        this.f138796m = hugVar.m137222v();
        this.f138797n = hugVar.m137221u();
        this.f138798o = hugVar.m137223w();
        this.f138799p = hugVar.m137225y();
        this.f138800q = hugVar.m137199A();
        this.f138801r = hugVar.m137226z();
        this.f138802s = hugVar.m137206f();
        this.f138803t = hugVar.m137224x();
        this.f138804u = hugVar.m137209i();
        bnl0.m105524M(this.f138793j, false);
        this.f138786c.removeView(this.f138793j);
        this.f138793j = null;
        m160147e();
    }

    /* JADX INFO: renamed from: d */
    public void m160146d(View view, boolean z) {
        if (NullChecker.m82486a(view)) {
            bnl0.m105524M(view, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m160147e() {
        PlayerView playerView = this.f138793j;
        if (playerView == null) {
            return;
        }
        playerView.f44450h.setBackground(null);
        this.f138793j.f44451i.setImageResource(lbc0.f131135s0);
        this.f138793j.f44444b.setBackgroundColor(Color.parseColor("#eeeeee"));
        this.f138793j.m67754L(new x20() { // from class: l.jug
            @Override // p153l.x20
            public final void call() {
                this.f122717a.m160148f();
            }
        });
        this.f138793j.f44444b.getHierarchy().m207040C(new ColorDrawable(402653184));
        this.f138793j.f44450h.setBackgroundColor(0);
        this.f138793j.setLoopMode(true);
        this.f138793j.setRadius(4.0f);
        if (TextUtils.isEmpty(this.f138809z)) {
            return;
        }
        this.f138793j.getPlayListener().clear();
        this.f138793j.m67762x(new C18714a());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m160148f() {
        if (this.f138808y == null) {
            return;
        }
        PhotoAlbumFeedPreviewAct.f43446m = true;
        this.f138807x.m65834c0(0);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m160149g(View view) {
        PhotoAlbumFeedPreviewAct.f43446m = true;
        this.f138807x.m65834c0(0);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m160150h(View view) {
        PhotoAlbumFeedPreviewAct.f43446m = true;
        this.f138807x.m65834c0(0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: i */
    public final void m160151i() {
        Dimension dimension;
        int i;
        Video video = this.f138806w;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m82487b(picture) && NullChecker.m82487b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                if (NullChecker.m82487b(this.f138806w.size)) {
                    dimension = this.f138806w.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m82487b(this.f138806w.size)) {
            dimension = this.f138806w.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(360, 640);
            }
        } else {
            dimension = new Dimension(360, 640);
        }
        float f = dimension.width / dimension.height;
        int iM175859d = (this.f138807x.f42729D * 2) + qa00.m175859d(FeedCenterVideoView.f42726H);
        if (f <= 0.7f) {
            i = (iM175859d * 9) / 16;
        } else if (f <= 0.83f) {
            i = (iM175859d * 3) / 4;
        } else if (f >= 1.2f) {
            i = iM175859d;
            iM175859d = (iM175859d * 3) / 4;
        } else {
            i = iM175859d;
        }
        this.f138783E = iM175859d;
        this.f138782D = i;
        this.f138793j.setLayoutParams(new FrameLayout.LayoutParams(i, iM175859d));
    }

    /* JADX INFO: renamed from: j */
    public void m160152j(Video video, Picture picture) {
        int i = this.f138807x.f42728C;
        if (NullChecker.m82486a(this.f138793j)) {
            m160154m(video, picture, i, false, false);
        } else {
            m160155n(picture, (int) (i * 0.83f));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m160153k(Video video, Picture picture) {
        int i = this.f138807x.f42728C;
        if (NullChecker.m82486a(this.f138793j)) {
            m160154m(video, picture, i, true, false);
        } else {
            m160155n(picture, (int) (i * 0.83f));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m160154m(Video video, Picture picture, int i, boolean z, boolean z2) {
        if (!video.equals(this.f138806w)) {
            this.f138793j.m67759R();
            this.f138793j.m67757P();
            this.f138793j.setPlayer(null);
            this.f138793j.m67758Q(video, z);
            PlayerView playerView = this.f138793j;
            if (playerView instanceof PlayerViewWithTransAnim) {
                ((PlayerViewWithTransAnim) playerView).setZoomAnimationKey(Media.URL_TO_CACHEKEY(video.url));
            }
        }
        this.f138806w = video;
        Dimension dimension = picture.size;
        Point pointM116963b = dmk0.m116963b(i, new Point(dimension.width, dimension.height));
        bnl0.m105525M0(this.f138793j, true);
        m160151i();
        VDraweeView vDraweeView = (VDraweeView) this.f138793j.findViewById(hdc0.f108825D);
        bnl0.m105509E0(vDraweeView, new View.OnClickListener() { // from class: l.kug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f128867a.m160149g(view);
            }
        });
        if (!TEnum.equals(picture.status, "raw") && !TextUtils.isEmpty(picture.url)) {
            if (vDraweeView instanceof AutoVDraweeView) {
                ((AutoVDraweeView) vDraweeView).setImageUrl(picture.url);
            } else {
                uqb0.f180374G.m127125Q0(vDraweeView, picture.calculatedWidth(pointM116963b.x));
            }
            vDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        }
        this.f138793j.m67760S(this.f138782D, this.f138783E);
    }

    /* JADX INFO: renamed from: n */
    public final void m160155n(Picture picture, int i) {
        m160156o(picture, i);
        this.f138797n.setImageResource(lbc0.f130936S1);
        bnl0.m105525M0(this.f138796m, false);
    }

    /* JADX INFO: renamed from: o */
    public final void m160156o(Picture picture, int i) {
        Dimension dimension = picture.size;
        Point pointM116963b = dmk0.m116963b(i, new Point(dimension.width, dimension.height));
        bnl0.m105525M0(this.f138794k, true);
        this.f138794k.setLayoutParams(new FrameLayout.LayoutParams(pointM116963b.x, pointM116963b.y));
        bnl0.m105509E0(this.f138795l, new View.OnClickListener() { // from class: l.lug
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f133632a.m160150h(view);
            }
        });
        this.f138797n.setImageResource(lbc0.f130813B6);
        if (TEnum.equals(picture.status, "raw") || TextUtils.isEmpty(picture.url)) {
            return;
        }
        uqb0.f180374G.m127125Q0(this.f138795l, picture.calculatedWidth(pointM116963b.x));
        this.f138795l.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
    }

    /* JADX INFO: renamed from: l */
    public void mo122569l(int i, Moment moment, HashMap<String, Boolean> map) {
    }
}
