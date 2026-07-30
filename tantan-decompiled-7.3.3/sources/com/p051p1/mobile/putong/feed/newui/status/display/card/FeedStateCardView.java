package com.p051p1.mobile.putong.feed.newui.status.display.card;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p051p1.mobile.putong.feed.newui.status.display.card.bgrender.FeedStateCardBgRenderCenter;
import com.p051p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView;
import com.p051p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p051p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p051p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import com.p051p1.mobile.putong.feed.p065ui.PreviewVideoLikeImageView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.b2i;
import p153l.bnl0;
import p153l.cmg;
import p153l.h3i;
import p153l.i4g0;
import p153l.ie80;
import p153l.jyb;
import p153l.ksg;
import p153l.lbc0;
import p153l.o1j0;
import p153l.otg;
import p153l.owi;
import p153l.p6i;
import p153l.psd0;
import p153l.qa00;
import p153l.r1j0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedStateCardView extends VFrame {

    /* JADX INFO: renamed from: p */
    public static boolean f43578p = true;

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f43579a;

    /* JADX INFO: renamed from: b */
    public FeedStatesMediaView f43580b;

    /* JADX INFO: renamed from: c */
    public VImage f43581c;

    /* JADX INFO: renamed from: d */
    public FeedVideoLikeContainerView f43582d;

    /* JADX INFO: renamed from: e */
    public VText f43583e;

    /* JADX INFO: renamed from: f */
    public TextView f43584f;

    /* JADX INFO: renamed from: g */
    public VText f43585g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f43586h;

    /* JADX INFO: renamed from: i */
    public TextView f43587i;

    /* JADX INFO: renamed from: j */
    public TextView f43588j;

    /* JADX INFO: renamed from: k */
    public TextView f43589k;

    /* JADX INFO: renamed from: l */
    public Context f43590l;

    /* JADX INFO: renamed from: m */
    public BubbleInfo f43591m;

    /* JADX INFO: renamed from: n */
    public ArrayList<PreviewVideoLikeImageView> f43592n;

    /* JADX INFO: renamed from: o */
    public boolean f43593o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView$a */
    public class C11493a extends ie80.C17711c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PhotoAlbumPlayerView f43594a;

        public C11493a(PhotoAlbumPlayerView photoAlbumPlayerView) {
            this.f43594a = photoAlbumPlayerView;
        }

        @Override // p153l.ie80.C17711c, p153l.ie80.InterfaceC17710b
        public void onStart() {
            super.onStart();
            FeedStateCardView.this.m66693M(this.f43594a, FeedStateCardView.f43578p);
        }
    }

    public FeedStateCardView(Context context) {
        super(context);
        this.f43592n = new ArrayList<>();
        m66683V(context);
    }

    /* JADX INFO: renamed from: V */
    private void m66683V(Context context) {
        this.f43590l = context;
        addView(m66690G(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: G */
    public View m66690G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b2i.m102167b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: K */
    public final void m66691K() {
        if (this.f43588j.getHeight() < this.f43588j.getLineHeight() * this.f43588j.getLineCount()) {
            for (int lineCount = this.f43588j.getLineCount() - 1; lineCount > 0; lineCount--) {
                if (this.f43588j.getHeight() >= this.f43588j.getLineHeight() * lineCount) {
                    this.f43588j.setMaxLines(lineCount);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m66692L() {
        m66722u0();
        this.f43580b.getChildPlayerView().m66601F();
    }

    /* JADX INFO: renamed from: M */
    public final void m66693M(PhotoAlbumPlayerView photoAlbumPlayerView, boolean z) {
        photoAlbumPlayerView.m66599D(z);
        m66718q0(z);
    }

    /* JADX INFO: renamed from: N */
    public void m66694N(boolean z, boolean z2) {
        PhotoAlbumPlayerView childPlayerView = this.f43580b.getChildPlayerView();
        if (childPlayerView != null) {
            childPlayerView.m66599D(z);
            if (z2) {
                m66718q0(z);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m66695O() {
        i4g0.m138523u("e_other_state_like", "p_other_state", jyb.m147494Y("be_liked", Boolean.valueOf(this.f43591m.haveLiked)), jyb.m147494Y("state_id", this.f43591m.f39578id), jyb.m147494Y("owner_id", this.f43591m.owner.f39651id));
    }

    /* JADX INFO: renamed from: P */
    public final void m66696P() {
        i4g0.m138492A("e_other_state_like", "p_other_state", jyb.m147494Y("be_liked", Boolean.valueOf(this.f43591m.haveLiked)), jyb.m147494Y("state_id", this.f43591m.f39578id), jyb.m147494Y("owner_id", this.f43591m.owner.f39651id));
    }

    /* JADX INFO: renamed from: Q */
    public final void m66697Q() {
        BubbleInfo bubbleInfo = this.f43591m;
        if (bubbleInfo.haveLiked) {
            FeedModule.f39703d.m145631W6(bubbleInfo.f39578id, bubbleInfo.owner.f39651id).subscribe(psd0.m173597H(new y20() { // from class: l.x1i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f192062a.m66704Z((Envelope) obj);
                }
            }, new y20() { // from class: l.y1i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197102a.m66712j0((Throwable) obj);
                }
            }));
        } else {
            FeedModule.f39703d.m145531Hb(bubbleInfo.f39578id, bubbleInfo.owner.f39651id, false).subscribe(psd0.m173597H(new y20() { // from class: l.z1i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f202559a.m66705a0((Envelope) obj);
                }
            }, new y20() { // from class: l.y1i
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f197102a.m66712j0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: R */
    public void m66698R() {
        this.f43588j.setVisibility(8);
        post(new Runnable() { // from class: l.t1i
            @Override // java.lang.Runnable
            public final void run() {
                this.f171672a.m66706b0();
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public void m66699S() {
        this.f43593o = true;
        this.f43585g.setBackgroundResource(lbc0.f131084l5);
        this.f43585g.setOnClickListener(new View.OnClickListener() { // from class: l.w1i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186815a.m66707c0(view);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m66700T() {
        this.f43593o = false;
        boolean z = this.f43591m.haveLiked;
        VText vText = this.f43585g;
        if (z) {
            vText.setBackgroundResource(lbc0.f131092m5);
        } else {
            vText.setBackgroundResource(lbc0.f131076k5);
        }
        this.f43585g.setOnClickListener(new View.OnClickListener() { // from class: l.a2i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f67996a.m66708e0(view);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public void m66701W() {
        if (!NullChecker.m82486a(this.f43582d) || FeedModule.m61406H().me_().f56859id.equals(this.f43591m.owner.f39651id)) {
            return;
        }
        this.f43582d.setOnClick(new Runnable() { // from class: l.s1i
            @Override // java.lang.Runnable
            public final void run() {
                this.f165792a.m66709f0();
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public PreviewVideoLikeImageView m66702X() {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        PreviewVideoLikeImageView previewVideoLikeImageView = new PreviewVideoLikeImageView(this.f43590l);
        previewVideoLikeImageView.setBackgroundResource(lbc0.f130966W3);
        previewVideoLikeImageView.setLayoutParams(layoutParams);
        previewVideoLikeImageView.setVisibility(8);
        return previewVideoLikeImageView;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m66703Y() {
        return this.f43591m.media.size() > 0 && (this.f43591m.media.get(0) instanceof Video);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m66704Z(Envelope envelope) {
        m66695O();
        this.f43591m.haveLiked = false;
        this.f43585g.setBackgroundResource(lbc0.f131076k5);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m66705a0(Envelope envelope) {
        m66695O();
        this.f43591m.haveLiked = true;
        this.f43585g.setBackgroundResource(lbc0.f131092m5);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m66706b0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f43586h.getLayoutParams();
        float width = getWidth() / qa00.m175859d(295.0f);
        if (width != 1.0f) {
            marginLayoutParams.height = (int) (marginLayoutParams.height * width);
            marginLayoutParams.width = (int) (marginLayoutParams.width * width);
        }
        this.f43586h.setLayoutParams(marginLayoutParams);
        bnl0.m105540X(this.f43588j, (int) (qa00.m175859d(30.0f) * width));
        this.f43588j.setVisibility(0);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m66707c0(View view) {
        m66723v0();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m66708e0(View view) {
        m66697Q();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m66709f0() {
        PreviewVideoLikeImageView previewVideoLikeImageViewM66702X = m66702X();
        FeedVideoLikeContainerView feedVideoLikeContainerView = this.f43582d;
        feedVideoLikeContainerView.addView(previewVideoLikeImageViewM66702X, feedVideoLikeContainerView.getChildCount());
        this.f43592n.add(previewVideoLikeImageViewM66702X);
        previewVideoLikeImageViewM66702X.setRotation((int) (Math.random() * ((double) (Math.random() > 0.5d ? 1 : -1)) * 20.0d));
        previewVideoLikeImageViewM66702X.setScaleX(1.5f);
        previewVideoLikeImageViewM66702X.setScaleY(1.5f);
        previewVideoLikeImageViewM66702X.setY(this.f43582d.f44285c - qa00.m175859d(30.0f));
        previewVideoLikeImageViewM66702X.setX(this.f43582d.f44284b - qa00.m175859d(27.0f));
        previewVideoLikeImageViewM66702X.setVisibility(0);
        m66714l0(this.f43582d);
        if (this.f43591m.haveLiked) {
            return;
        }
        m66697Q();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m66710g0(View view) {
        m66692L();
    }

    /* JADX INFO: renamed from: h0 */
    public void m66711h0() {
        if (!m66703Y() || this.f43580b.getChildPlayerView() == null) {
            return;
        }
        this.f43580b.getChildPlayerView().m66605J();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m66712j0(Throwable th) {
        FeedModule.f39703d.f121380t1.onNext(Boolean.TRUE);
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 400) {
            o1j0.m165651y("状态已结束");
            return;
        }
        boolean z = th instanceof TantanException.Client.TantanForbidden;
        if (z && ((TantanException.Client.TantanForbidden) th).code == 40309) {
            r1j0.m179420g("对方拉黑了你");
        } else if (z && ((TantanException.Client.TantanForbidden) th).code == 40308) {
            r1j0.m179420g("操作失败，已拉黑对方");
        } else {
            o1j0.m165651y("对方账号异常");
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m66713k0() {
        if (m66703Y()) {
            if (this.f43580b.getChildPlayerView() == null) {
                this.f43580b.setSuccessAttachCallback(new y20() { // from class: l.v1i
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f181975a.m66710g0((View) obj);
                    }
                });
            } else {
                m66692L();
            }
        }
        if (this.f43593o) {
            return;
        }
        m66696P();
    }

    /* JADX INFO: renamed from: l0 */
    public void m66714l0(ViewGroup viewGroup) {
        for (int size = this.f43592n.size() - 1; size > 0; size--) {
            PreviewVideoLikeImageView previewVideoLikeImageView = this.f43592n.get(size);
            if (previewVideoLikeImageView.getVisibility() == 8) {
                viewGroup.removeView(previewVideoLikeImageView);
                this.f43592n.remove(previewVideoLikeImageView);
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m66715m0(BubbleInfo bubbleInfo) {
        this.f43591m = bubbleInfo;
        m66720s0();
        m66716o0();
        m66719r0();
        m66717p0();
        m66701W();
        m66698R();
        m66718q0(f43578p);
    }

    /* JADX INFO: renamed from: o0 */
    public void m66716o0() {
        if (TextUtils.isEmpty(this.f43591m.location.name)) {
            this.f43589k.setVisibility(8);
            return;
        }
        SpannableString spannableString = new SpannableString("  " + this.f43591m.location.name);
        spannableString.setSpan(new otg(this.f43590l, BitmapFactory.decodeResource(getResources(), lbc0.f130996a5)), 0, 1, 33);
        this.f43589k.setText(spannableString);
        if (cmg.m111177E()) {
            this.f43589k.setTextColor(Color.parseColor("#cc000000"));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m66717p0() {
        FeedStateCardBgRenderCenter.doRender(this, this.f43591m);
    }

    /* JADX INFO: renamed from: q0 */
    public void m66718q0(boolean z) {
        VText vText = this.f43583e;
        if (z) {
            vText.setBackgroundResource(lbc0.f130981Y4);
        } else {
            vText.setBackgroundResource(lbc0.f130988Z4);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m66719r0() {
        this.f43588j.setMaxLines(3);
        uqb0.f180374G.m127115L0(this.f43586h, this.f43591m.emotion.emojiUrl);
        this.f43587i.setText(this.f43591m.emotion.text);
        if (cmg.m111177E()) {
            this.f43587i.setTextColor(Color.parseColor("#e6000000"));
            this.f43588j.setTextColor(Color.parseColor("#e6000000"));
        }
        this.f43588j.setText(this.f43591m.value);
        this.f43588j.post(new Runnable() { // from class: l.u1i
            @Override // java.lang.Runnable
            public final void run() {
                this.f177003a.m66691K();
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public void m66720s0() {
        User userM145688e8 = FeedModule.f39703d.m145688e8(this.f43591m.owner.f39651id);
        bnl0.m105524M(this.f43584f, true);
        if (FeedModule.m61406H().me_().f56859id.equals(userM145688e8.f56859id)) {
            if (TextUtils.equals(this.f43591m.status, "pending")) {
                this.f43584f.setText(R$string.f39899e5);
                this.f43584f.setTextColor(Color.parseColor("#4d000000"));
                bnl0.m105524M(this.f43584f, owi.m169567c());
                return;
            }
            return;
        }
        boolean zM111177E = cmg.m111177E();
        TextView textView = this.f43584f;
        if (zM111177E) {
            textView.setText(ksg.m151182Q(userM145688e8, (long) this.f43591m.createdTime, userM145688e8.getLastActiveTimeMillis()));
            this.f43584f.setTextColor(Color.parseColor("#4d000000"));
        } else {
            textView.setText("即将在" + p6i.m170906o(this.f43591m.createdTime + 8.64E7d) + "后消失");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m66721t0() {
        PhotoAlbumPlayerView childPlayerView = this.f43580b.getChildPlayerView();
        if (childPlayerView != null) {
            boolean z = !childPlayerView.m66613x();
            m66693M(childPlayerView, z);
            f43578p = z;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m66722u0() {
        PhotoAlbumPlayerView childPlayerView = this.f43580b.getChildPlayerView();
        if (childPlayerView != null) {
            childPlayerView.m66607r(new C11493a(childPlayerView));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m66723v0() {
        if (h3i.m133486d((Act) this.f43590l, "p_other_state")) {
            return;
        }
        boolean zM111169A = cmg.m111169A();
        Context context = this.f43590l;
        if (zM111169A) {
            context.startActivity(FeedSelectAndPostStatusAct.m66995r2((Act) context, this.f43591m, "p_other_state"));
        } else {
            context.startActivity(FeedPostStatusAct.m66988r2((Act) context, this.f43591m, "p_other_state"));
        }
        ((Act) this.f43590l).overridePendingTransition(0, 0);
        i4g0.m138523u("e_my_state_edit", "p_my_state", jyb.m147494Y("state_id", this.f43591m.f39578id));
    }

    public FeedStateCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43592n = new ArrayList<>();
        m66683V(context);
    }

    public FeedStateCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43592n = new ArrayList<>();
        m66683V(context);
    }
}
