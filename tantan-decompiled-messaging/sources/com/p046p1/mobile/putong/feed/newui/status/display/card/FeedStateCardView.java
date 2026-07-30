package com.p046p1.mobile.putong.feed.newui.status.display.card;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p046p1.mobile.putong.feed.newui.status.display.card.bgrender.FeedStateCardBgRenderCenter;
import com.p046p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView;
import com.p046p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p046p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p046p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import com.p046p1.mobile.putong.feed.p060ui.PreviewVideoLikeImageView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.a5i;
import p149l.c680;
import p149l.e30;
import p149l.f3c0;
import p149l.lsi0;
import p149l.m0i;
import p149l.mkd0;
import p149l.nkg;
import p149l.osi0;
import p149l.qib0;
import p149l.s1i;
import p149l.sti;
import p149l.t100;
import p149l.vqg;
import p149l.vwb;
import p149l.xdl0;
import p149l.zrg;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedStateCardView extends VFrame {

    /* JADX INFO: renamed from: p */
    public static boolean f42730p = true;

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f42731a;

    /* JADX INFO: renamed from: b */
    public FeedStatesMediaView f42732b;

    /* JADX INFO: renamed from: c */
    public VImage f42733c;

    /* JADX INFO: renamed from: d */
    public FeedVideoLikeContainerView f42734d;

    /* JADX INFO: renamed from: e */
    public VText f42735e;

    /* JADX INFO: renamed from: f */
    public TextView f42736f;

    /* JADX INFO: renamed from: g */
    public VText f42737g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f42738h;

    /* JADX INFO: renamed from: i */
    public TextView f42739i;

    /* JADX INFO: renamed from: j */
    public TextView f42740j;

    /* JADX INFO: renamed from: k */
    public TextView f42741k;

    /* JADX INFO: renamed from: l */
    public Context f42742l;

    /* JADX INFO: renamed from: m */
    public BubbleInfo f42743m;

    /* JADX INFO: renamed from: n */
    public ArrayList<PreviewVideoLikeImageView> f42744n;

    /* JADX INFO: renamed from: o */
    public boolean f42745o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView$a */
    public class C11330a extends c680.C16085c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PhotoAlbumPlayerView f42746a;

        public C11330a(PhotoAlbumPlayerView photoAlbumPlayerView) {
            this.f42746a = photoAlbumPlayerView;
        }

        @Override // p149l.c680.C16085c, p149l.c680.InterfaceC16084b
        public void onStart() {
            super.onStart();
            FeedStateCardView.this.m65510M(this.f42746a, FeedStateCardView.f42730p);
        }
    }

    public FeedStateCardView(Context context) {
        super(context);
        this.f42744n = new ArrayList<>();
        m65500V(context);
    }

    /* JADX INFO: renamed from: V */
    private void m65500V(Context context) {
        this.f42742l = context;
        addView(m65507G(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: G */
    public View m65507G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m0i.m152507b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: K */
    public final void m65508K() {
        if (this.f42740j.getHeight() < this.f42740j.getLineHeight() * this.f42740j.getLineCount()) {
            for (int lineCount = this.f42740j.getLineCount() - 1; lineCount > 0; lineCount--) {
                if (this.f42740j.getHeight() >= this.f42740j.getLineHeight() * lineCount) {
                    this.f42740j.setMaxLines(lineCount);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m65509L() {
        m65539u0();
        this.f42732b.getChildPlayerView().m65418F();
    }

    /* JADX INFO: renamed from: M */
    public final void m65510M(PhotoAlbumPlayerView photoAlbumPlayerView, boolean z) {
        photoAlbumPlayerView.m65416D(z);
        m65535q0(z);
    }

    /* JADX INFO: renamed from: N */
    public void m65511N(boolean z, boolean z2) {
        PhotoAlbumPlayerView childPlayerView = this.f42732b.getChildPlayerView();
        if (childPlayerView != null) {
            childPlayerView.m65416D(z);
            if (z2) {
                m65535q0(z);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m65512O() {
        zvf0.m220399u("e_other_state_like", "p_other_state", vwb.m200311Y("be_liked", Boolean.valueOf(this.f42743m.haveLiked)), vwb.m200311Y("state_id", this.f42743m.f38730id), vwb.m200311Y("owner_id", this.f42743m.owner.f38803id));
    }

    /* JADX INFO: renamed from: P */
    public final void m65513P() {
        zvf0.m220368A("e_other_state_like", "p_other_state", vwb.m200311Y("be_liked", Boolean.valueOf(this.f42743m.haveLiked)), vwb.m200311Y("state_id", this.f42743m.f38730id), vwb.m200311Y("owner_id", this.f42743m.owner.f38803id));
    }

    /* JADX INFO: renamed from: Q */
    public final void m65514Q() {
        BubbleInfo bubbleInfo = this.f42743m;
        if (bubbleInfo.haveLiked) {
            FeedModule.f38855d.m209390W6(bubbleInfo.f38730id, bubbleInfo.owner.f38803id).subscribe(mkd0.m154956H(new e30() { // from class: l.i0i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f110345a.m65521Z((Envelope) obj);
                }
            }, new e30() { // from class: l.j0i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f115676a.m65529j0((Throwable) obj);
                }
            }));
        } else {
            FeedModule.f38855d.m209290Hb(bubbleInfo.f38730id, bubbleInfo.owner.f38803id, false).subscribe(mkd0.m154956H(new e30() { // from class: l.k0i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f120490a.m65522a0((Envelope) obj);
                }
            }, new e30() { // from class: l.j0i
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f115676a.m65529j0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: R */
    public void m65515R() {
        this.f42740j.setVisibility(8);
        post(new Runnable() { // from class: l.e0i
            @Override // java.lang.Runnable
            public final void run() {
                this.f88618a.m65523b0();
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public void m65516S() {
        this.f42745o = true;
        this.f42737g.setBackgroundResource(f3c0.f94566l5);
        this.f42737g.setOnClickListener(new View.OnClickListener() { // from class: l.h0i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105219a.m65524c0(view);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m65517T() {
        this.f42745o = false;
        boolean z = this.f42743m.haveLiked;
        VText vText = this.f42737g;
        if (z) {
            vText.setBackgroundResource(f3c0.f94574m5);
        } else {
            vText.setBackgroundResource(f3c0.f94558k5);
        }
        this.f42737g.setOnClickListener(new View.OnClickListener() { // from class: l.l0i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125544a.m65525e0(view);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public void m65518W() {
        if (!NullChecker.m81303a(this.f42734d) || FeedModule.m60222H().me_().f56011id.equals(this.f42743m.owner.f38803id)) {
            return;
        }
        this.f42734d.setOnClick(new Runnable() { // from class: l.d0i
            @Override // java.lang.Runnable
            public final void run() {
                this.f83188a.m65526f0();
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public PreviewVideoLikeImageView m65519X() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        PreviewVideoLikeImageView previewVideoLikeImageView = new PreviewVideoLikeImageView(this.f42742l);
        previewVideoLikeImageView.setBackgroundResource(f3c0.f94448W3);
        previewVideoLikeImageView.setLayoutParams(layoutParams);
        previewVideoLikeImageView.setVisibility(8);
        return previewVideoLikeImageView;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m65520Y() {
        return this.f42743m.media.size() > 0 && (this.f42743m.media.get(0) instanceof Video);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m65521Z(Envelope envelope) {
        m65512O();
        this.f42743m.haveLiked = false;
        this.f42737g.setBackgroundResource(f3c0.f94558k5);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m65522a0(Envelope envelope) {
        m65512O();
        this.f42743m.haveLiked = true;
        this.f42737g.setBackgroundResource(f3c0.f94574m5);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m65523b0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f42738h.getLayoutParams();
        float width = getWidth() / t100.m186890d(295.0f);
        if (width != 1.0f) {
            marginLayoutParams.height = (int) (marginLayoutParams.height * width);
            marginLayoutParams.width = (int) (marginLayoutParams.width * width);
        }
        this.f42738h.setLayoutParams(marginLayoutParams);
        xdl0.m208360X(this.f42740j, (int) (t100.m186890d(30.0f) * width));
        this.f42740j.setVisibility(0);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m65524c0(View view) {
        m65540v0();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m65525e0(View view) {
        m65514Q();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m65526f0() {
        PreviewVideoLikeImageView previewVideoLikeImageViewM65519X = m65519X();
        FeedVideoLikeContainerView feedVideoLikeContainerView = this.f42734d;
        feedVideoLikeContainerView.addView(previewVideoLikeImageViewM65519X, feedVideoLikeContainerView.getChildCount());
        this.f42744n.add(previewVideoLikeImageViewM65519X);
        previewVideoLikeImageViewM65519X.setRotation((int) (Math.random() * ((double) (Math.random() > 0.5d ? 1 : -1)) * 20.0d));
        previewVideoLikeImageViewM65519X.setScaleX(1.5f);
        previewVideoLikeImageViewM65519X.setScaleY(1.5f);
        previewVideoLikeImageViewM65519X.setY(this.f42734d.f43437c - t100.m186890d(30.0f));
        previewVideoLikeImageViewM65519X.setX(this.f42734d.f43436b - t100.m186890d(27.0f));
        previewVideoLikeImageViewM65519X.setVisibility(0);
        m65531l0(this.f42734d);
        if (this.f42743m.haveLiked) {
            return;
        }
        m65514Q();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m65527g0(View view) {
        m65509L();
    }

    /* JADX INFO: renamed from: h0 */
    public void m65528h0() {
        if (!m65520Y() || this.f42732b.getChildPlayerView() == null) {
            return;
        }
        this.f42732b.getChildPlayerView().m65422J();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m65529j0(Throwable th) {
        FeedModule.f38855d.f193070t1.onNext(Boolean.TRUE);
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 400) {
            lsi0.m151595y("状态已结束");
            return;
        }
        boolean z = th instanceof TantanException.Client.TantanForbidden;
        if (z && ((TantanException.Client.TantanForbidden) th).code == 40309) {
            osi0.m165783g("对方拉黑了你");
        } else if (z && ((TantanException.Client.TantanForbidden) th).code == 40308) {
            osi0.m165783g("操作失败，已拉黑对方");
        } else {
            lsi0.m151595y("对方账号异常");
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m65530k0() {
        if (m65520Y()) {
            if (this.f42732b.getChildPlayerView() == null) {
                this.f42732b.setSuccessAttachCallback(new e30() { // from class: l.g0i
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f100045a.m65527g0((View) obj);
                    }
                });
            } else {
                m65509L();
            }
        }
        if (this.f42745o) {
            return;
        }
        m65513P();
    }

    /* JADX INFO: renamed from: l0 */
    public void m65531l0(ViewGroup viewGroup) {
        for (int size = this.f42744n.size() - 1; size > 0; size--) {
            PreviewVideoLikeImageView previewVideoLikeImageView = this.f42744n.get(size);
            if (previewVideoLikeImageView.getVisibility() == 8) {
                viewGroup.removeView(previewVideoLikeImageView);
                this.f42744n.remove(previewVideoLikeImageView);
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m65532m0(BubbleInfo bubbleInfo) {
        this.f42743m = bubbleInfo;
        m65537s0();
        m65533o0();
        m65536r0();
        m65534p0();
        m65518W();
        m65515R();
        m65535q0(f42730p);
    }

    /* JADX INFO: renamed from: o0 */
    public void m65533o0() {
        if (TextUtils.isEmpty(this.f42743m.location.name)) {
            this.f42741k.setVisibility(8);
            return;
        }
        SpannableString spannableString = new SpannableString("  " + this.f42743m.location.name);
        spannableString.setSpan(new zrg(this.f42742l, BitmapFactory.decodeResource(getResources(), f3c0.f94478a5)), 0, 1, 33);
        this.f42741k.setText(spannableString);
        if (nkg.m159848E()) {
            this.f42741k.setTextColor(Color.parseColor("#cc000000"));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m65534p0() {
        FeedStateCardBgRenderCenter.doRender(this, this.f42743m);
    }

    /* JADX INFO: renamed from: q0 */
    public void m65535q0(boolean z) {
        VText vText = this.f42735e;
        if (z) {
            vText.setBackgroundResource(f3c0.f94463Y4);
        } else {
            vText.setBackgroundResource(f3c0.f94470Z4);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m65536r0() {
        this.f42740j.setMaxLines(3);
        qib0.f154691G.m102331L0(this.f42738h, this.f42743m.emotion.emojiUrl);
        this.f42739i.setText(this.f42743m.emotion.text);
        if (nkg.m159848E()) {
            this.f42739i.setTextColor(Color.parseColor("#e6000000"));
            this.f42740j.setTextColor(Color.parseColor("#e6000000"));
        }
        this.f42740j.setText(this.f42743m.value);
        this.f42740j.post(new Runnable() { // from class: l.f0i
            @Override // java.lang.Runnable
            public final void run() {
                this.f93983a.m65508K();
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public void m65537s0() {
        User userM209447e8 = FeedModule.f38855d.m209447e8(this.f42743m.owner.f38803id);
        xdl0.m208344M(this.f42736f, true);
        if (FeedModule.m60222H().me_().f56011id.equals(userM209447e8.f56011id)) {
            if (TextUtils.equals(this.f42743m.status, "pending")) {
                this.f42736f.setText(R$string.f39051e5);
                this.f42736f.setTextColor(Color.parseColor("#4d000000"));
                xdl0.m208344M(this.f42736f, sti.m185957c());
                return;
            }
            return;
        }
        boolean zM159848E = nkg.m159848E();
        TextView textView = this.f42736f;
        if (zM159848E) {
            textView.setText(vqg.m199523Q(userM209447e8, (long) this.f42743m.createdTime, userM209447e8.getLastActiveTimeMillis()));
            this.f42736f.setTextColor(Color.parseColor("#4d000000"));
        } else {
            textView.setText("即将在" + a5i.m95039o(this.f42743m.createdTime + 8.64E7d) + "后消失");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m65538t0() {
        PhotoAlbumPlayerView childPlayerView = this.f42732b.getChildPlayerView();
        if (childPlayerView != null) {
            boolean z = !childPlayerView.m65430x();
            m65510M(childPlayerView, z);
            f42730p = z;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m65539u0() {
        PhotoAlbumPlayerView childPlayerView = this.f42732b.getChildPlayerView();
        if (childPlayerView != null) {
            childPlayerView.m65424r(new C11330a(childPlayerView));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m65540v0() {
        if (s1i.m181964d((Act) this.f42742l, "p_other_state")) {
            return;
        }
        boolean zM159840A = nkg.m159840A();
        Context context = this.f42742l;
        if (zM159840A) {
            context.startActivity(FeedSelectAndPostStatusAct.m65812q2((Act) context, this.f42743m, "p_other_state"));
        } else {
            context.startActivity(FeedPostStatusAct.m65805q2((Act) context, this.f42743m, "p_other_state"));
        }
        ((Act) this.f42742l).overridePendingTransition(0, 0);
        zvf0.m220399u("e_my_state_edit", "p_my_state", vwb.m200311Y("state_id", this.f42743m.f38730id));
    }

    public FeedStateCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42744n = new ArrayList<>();
        m65500V(context);
    }

    public FeedStateCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42744n = new ArrayList<>();
        m65500V(context);
    }
}
