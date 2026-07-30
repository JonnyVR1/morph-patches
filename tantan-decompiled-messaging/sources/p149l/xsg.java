package p149l;

import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feedcenter.FeedCenterVideoView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.live.LiveTagView;
import com.p046p1.mobile.putong.feed.newui.preview.act.PhotoAlbumFeedPreviewAct;
import com.p046p1.mobile.putong.feed.newui.preview.gesture.PlayerViewWithTransAnim;
import com.p046p1.mobile.putong.feed.p060ui.PlayerView;
import com.p046p1.mobile.putong.newui.view.VExpandableTextContainer;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer;
import java.util.HashMap;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class xsg {

    /* JADX INFO: renamed from: A */
    public boolean f194241A;

    /* JADX INFO: renamed from: B */
    public int f194242B;

    /* JADX INFO: renamed from: C */
    public hx60 f194243C;

    /* JADX INFO: renamed from: D */
    public int f194244D;

    /* JADX INFO: renamed from: E */
    public int f194245E;

    /* JADX INFO: renamed from: a */
    public FeedCenterVideoView f194246a;

    /* JADX INFO: renamed from: b */
    public View f194247b;

    /* JADX INFO: renamed from: c */
    public VLinear f194248c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f194249d;

    /* JADX INFO: renamed from: e */
    public LiveTagView f194250e;

    /* JADX INFO: renamed from: f */
    public VText f194251f;

    /* JADX INFO: renamed from: g */
    public VText f194252g;

    /* JADX INFO: renamed from: h */
    public VExpandableTextContainer f194253h;

    /* JADX INFO: renamed from: i */
    public VText f194254i;

    /* JADX INFO: renamed from: j */
    public PlayerView f194255j;

    /* JADX INFO: renamed from: k */
    public VFrame f194256k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f194257l;

    /* JADX INFO: renamed from: m */
    public VImage f194258m;

    /* JADX INFO: renamed from: n */
    public VImage f194259n;

    /* JADX INFO: renamed from: o */
    public VText f194260o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayout f194261p;

    /* JADX INFO: renamed from: q */
    public LinearLayout f194262q;

    /* JADX INFO: renamed from: r */
    public VText f194263r;

    /* JADX INFO: renamed from: s */
    public AnimEffectPlayer f194264s;

    /* JADX INFO: renamed from: t */
    public VImage f194265t;

    /* JADX INFO: renamed from: u */
    public View f194266u;

    /* JADX INFO: renamed from: v */
    public Act f194267v;

    /* JADX INFO: renamed from: w */
    public Video f194268w;

    /* JADX INFO: renamed from: x */
    public FeedCenterVideoView f194269x;

    /* JADX INFO: renamed from: y */
    public Moment f194270y;

    /* JADX INFO: renamed from: z */
    public String f194271z;

    /* JADX INFO: renamed from: l.xsg$a */
    public class C21207a extends c680.C16085c {

        /* JADX INFO: renamed from: a */
        public boolean f194272a;

        public C21207a() {
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        /* JADX INFO: renamed from: d */
        public void mo44053d() {
            this.f194272a = true;
            p6j0.m167672f("e_video_play_over", z5i.m217340u(xsg.this.f194271z), p6j0.C19147a.m167678g("moment_id", xsg.this.f194270y.f56011id), p6j0.C19147a.m167678g("owner_id", xsg.this.f194270y.owner));
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onComplete() {
            super.onComplete();
            p6j0.m167672f("e_video_play_over", z5i.m217340u(xsg.this.f194271z), p6j0.C19147a.m167678g("moment_id", xsg.this.f194270y.f56011id), p6j0.C19147a.m167678g("owner_id", xsg.this.f194270y.owner));
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onResume() {
            if (this.f194272a) {
                p6j0.m167672f("e_video_play_start", z5i.m217340u(xsg.this.f194271z), p6j0.C19147a.m167678g("moment_id", xsg.this.f194270y.f56011id), p6j0.C19147a.m167678g("owner_id", xsg.this.f194270y.owner));
            }
            this.f194272a = false;
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onStart() {
            p6j0.m167672f("e_video_play_start", z5i.m217340u(xsg.this.f194271z), p6j0.C19147a.m167678g("moment_id", xsg.this.f194270y.f56011id), p6j0.C19147a.m167678g("owner_id", xsg.this.f194270y.owner));
        }
    }

    public xsg(Act act, ssg ssgVar, FeedCenterVideoView feedCenterVideoView) {
        this.f194267v = act;
        this.f194269x = feedCenterVideoView;
        this.f194270y = feedCenterVideoView.f41894i;
        this.f194271z = feedCenterVideoView.f41896k;
        this.f194241A = feedCenterVideoView.f41901p;
        this.f194242B = feedCenterVideoView.f41902q;
        this.f194243C = feedCenterVideoView.f41904s;
        this.f194246a = ssgVar.m185728j();
        this.f194247b = ssgVar.m185725g();
        this.f194248c = ssgVar.m185723e();
        this.f194249d = ssgVar.m185732n();
        this.f194250e = ssgVar.m185733o();
        this.f194251f = ssgVar.m185734p();
        this.f194252g = ssgVar.m185735q();
        this.f194253h = ssgVar.m185730l();
        this.f194254i = ssgVar.m185736r();
        this.f194255j = ssgVar.m185718B();
        this.f194256k = ssgVar.m185737s();
        this.f194257l = ssgVar.m185738t();
        this.f194258m = ssgVar.m185740v();
        this.f194259n = ssgVar.m185739u();
        this.f194260o = ssgVar.m185741w();
        this.f194261p = ssgVar.m185743y();
        this.f194262q = ssgVar.m185717A();
        this.f194263r = ssgVar.m185744z();
        this.f194264s = ssgVar.m185724f();
        this.f194265t = ssgVar.m185742x();
        this.f194266u = ssgVar.m185727i();
        xdl0.m208344M(this.f194255j, false);
        this.f194248c.removeView(this.f194255j);
        this.f194255j = null;
        m210748e();
    }

    /* JADX INFO: renamed from: d */
    public void m210747d(View view, boolean z) {
        if (NullChecker.m81303a(view)) {
            xdl0.m208344M(view, z);
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m210748e() {
        PlayerView playerView = this.f194255j;
        if (playerView == null) {
            return;
        }
        playerView.f43602h.setBackground(null);
        this.f194255j.f43603i.setImageResource(f3c0.f94617s0);
        this.f194255j.f43596b.setBackgroundColor(Color.parseColor("#eeeeee"));
        this.f194255j.m66571L(new d30() { // from class: l.usg
            @Override // p149l.d30
            public final void call() {
                this.f177970a.m210749f();
            }
        });
        this.f194255j.f43596b.getHierarchy().m112048C(new ColorDrawable(402653184));
        this.f194255j.f43602h.setBackgroundColor(0);
        this.f194255j.setLoopMode(true);
        this.f194255j.setRadius(4.0f);
        if (TextUtils.isEmpty(this.f194271z)) {
            return;
        }
        this.f194255j.getPlayListener().clear();
        this.f194255j.m66579x(new C21207a());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m210749f() {
        if (this.f194270y == null) {
            return;
        }
        PhotoAlbumFeedPreviewAct.f42598m = true;
        this.f194269x.m64651c0(0);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m210750g(View view) {
        PhotoAlbumFeedPreviewAct.f42598m = true;
        this.f194269x.m64651c0(0);
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m210751h(View view) {
        PhotoAlbumFeedPreviewAct.f42598m = true;
        this.f194269x.m64651c0(0);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002f  */
    /* JADX INFO: renamed from: i */
    public final void m210752i() {
        Dimension dimension;
        int i;
        Video video = this.f194268w;
        if (video == null) {
            return;
        }
        Picture picture = video.cover;
        if (NullChecker.m81304b(picture) && NullChecker.m81304b(picture.size)) {
            dimension = picture.size;
            if (dimension.height <= 0) {
                if (NullChecker.m81304b(this.f194268w.size)) {
                    dimension = this.f194268w.size;
                    if (dimension.width <= 0) {
                        dimension = new Dimension(360, 640);
                    }
                } else {
                    dimension = new Dimension(360, 640);
                }
            }
        } else if (NullChecker.m81304b(this.f194268w.size)) {
            dimension = this.f194268w.size;
            if (dimension.width <= 0) {
                dimension = new Dimension(360, 640);
            }
        } else {
            dimension = new Dimension(360, 640);
        }
        float f = dimension.width / dimension.height;
        int iM186890d = (this.f194269x.f41881D * 2) + t100.m186890d(FeedCenterVideoView.f41878H);
        if (f <= 0.7f) {
            i = (iM186890d * 9) / 16;
        } else if (f <= 0.83f) {
            i = (iM186890d * 3) / 4;
        } else if (f >= 1.2f) {
            i = iM186890d;
            iM186890d = (iM186890d * 3) / 4;
        } else {
            i = iM186890d;
        }
        this.f194245E = iM186890d;
        this.f194244D = i;
        this.f194255j.setLayoutParams(new FrameLayout.LayoutParams(i, iM186890d));
    }

    /* JADX INFO: renamed from: j */
    public void m210753j(Video video, Picture picture) {
        int i = this.f194269x.f41880C;
        if (NullChecker.m81303a(this.f194255j)) {
            m210755m(video, picture, i, false, false);
        } else {
            m210756n(picture, (int) (i * 0.83f));
        }
    }

    /* JADX INFO: renamed from: k */
    public void m210754k(Video video, Picture picture) {
        int i = this.f194269x.f41880C;
        if (NullChecker.m81303a(this.f194255j)) {
            m210755m(video, picture, i, true, false);
        } else {
            m210756n(picture, (int) (i * 0.83f));
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m210755m(Video video, Picture picture, int i, boolean z, boolean z2) {
        if (!video.equals(this.f194268w)) {
            this.f194255j.m66576R();
            this.f194255j.m66574P();
            this.f194255j.setPlayer(null);
            this.f194255j.m66575Q(video, z);
            PlayerView playerView = this.f194255j;
            if (playerView instanceof PlayerViewWithTransAnim) {
                ((PlayerViewWithTransAnim) playerView).setZoomAnimationKey(Media.URL_TO_CACHEKEY(video.url));
            }
        }
        this.f194268w = video;
        Dimension dimension = picture.size;
        Point pointM208121b = xck0.m208121b(i, new Point(dimension.width, dimension.height));
        xdl0.m208345M0(this.f194255j, true);
        m210752i();
        VDraweeView vDraweeView = (VDraweeView) this.f194255j.findViewById(b5c0.f73472D);
        xdl0.m208329E0(vDraweeView, new View.OnClickListener() { // from class: l.vsg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182846a.m210750g(view);
            }
        });
        if (!TEnum.equals(picture.status, "raw") && !TextUtils.isEmpty(picture.url)) {
            if (vDraweeView instanceof AutoVDraweeView) {
                ((AutoVDraweeView) vDraweeView).setImageUrl(picture.url);
            } else {
                qib0.f154691G.m102341Q0(vDraweeView, picture.calculatedWidth(pointM208121b.x));
            }
            vDraweeView.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
        }
        this.f194255j.m66577S(this.f194244D, this.f194245E);
    }

    /* JADX INFO: renamed from: n */
    public final void m210756n(Picture picture, int i) {
        m210757o(picture, i);
        this.f194259n.setImageResource(f3c0.f94418S1);
        xdl0.m208345M0(this.f194258m, false);
    }

    /* JADX INFO: renamed from: o */
    public final void m210757o(Picture picture, int i) {
        Dimension dimension = picture.size;
        Point pointM208121b = xck0.m208121b(i, new Point(dimension.width, dimension.height));
        xdl0.m208345M0(this.f194256k, true);
        this.f194256k.setLayoutParams(new FrameLayout.LayoutParams(pointM208121b.x, pointM208121b.y));
        xdl0.m208329E0(this.f194257l, new View.OnClickListener() { // from class: l.wsg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f187930a.m210751h(view);
            }
        });
        this.f194259n.setImageResource(f3c0.f94295B6);
        if (TEnum.equals(picture.status, "raw") || TextUtils.isEmpty(picture.url)) {
            return;
        }
        qib0.f154691G.m102341Q0(this.f194257l, picture.calculatedWidth(pointM208121b.x));
        this.f194257l.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
    }

    /* JADX INFO: renamed from: l */
    public void mo171138l(int i, Moment moment, HashMap<String, Boolean> map) {
    }
}
