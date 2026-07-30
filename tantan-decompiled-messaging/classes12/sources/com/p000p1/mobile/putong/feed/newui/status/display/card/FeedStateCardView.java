package com.p000p1.mobile.putong.feed.newui.status.display.card;

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
import androidx.appcompat.widget.AppCompatImageView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.newui.preview.pageritem.PhotoAlbumPlayerView;
import com.p000p1.mobile.putong.feed.newui.status.display.card.bgrender.FeedStateCardBgRenderCenter;
import com.p000p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView;
import com.p000p1.mobile.putong.feed.newui.status.post.FeedPostStatusAct;
import com.p000p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectAndPostStatusAct;
import com.p000p1.mobile.putong.feed.newui.view.FeedVideoLikeContainerView;
import com.p000p1.mobile.putong.feed.p005ui.PreviewVideoLikeImageView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.api.api.TantanException;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.c680;
import l.e30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p007l.a5i;
import p007l.f3c0;
import p007l.m0i;
import p007l.nkg;
import p007l.s1i;
import p007l.sti;
import p007l.vqg;
import p007l.zrg;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedStateCardView extends VFrame {

    /* JADX INFO: renamed from: p */
    public static boolean f4191p = true;

    /* JADX INFO: renamed from: a */
    public SimpleDraweeView f4192a;

    /* JADX INFO: renamed from: b */
    public FeedStatesMediaView f4193b;

    /* JADX INFO: renamed from: c */
    public VImage f4194c;

    /* JADX INFO: renamed from: d */
    public FeedVideoLikeContainerView f4195d;

    /* JADX INFO: renamed from: e */
    public VText f4196e;

    /* JADX INFO: renamed from: f */
    public TextView f4197f;

    /* JADX INFO: renamed from: g */
    public VText f4198g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f4199h;

    /* JADX INFO: renamed from: i */
    public TextView f4200i;

    /* JADX INFO: renamed from: j */
    public TextView f4201j;

    /* JADX INFO: renamed from: k */
    public TextView f4202k;

    /* JADX INFO: renamed from: l */
    public Context f4203l;

    /* JADX INFO: renamed from: m */
    public BubbleInfo f4204m;

    /* JADX INFO: renamed from: n */
    public ArrayList<PreviewVideoLikeImageView> f4205n;

    /* JADX INFO: renamed from: o */
    public boolean f4206o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView$a */
    public class C2174a extends c680.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ PhotoAlbumPlayerView f4207a;

        public C2174a(PhotoAlbumPlayerView photoAlbumPlayerView) {
            this.f4207a = photoAlbumPlayerView;
        }

        public void onStart() {
            super.onStart();
            FeedStateCardView.this.m6637M(this.f4207a, FeedStateCardView.f4191p);
        }
    }

    public FeedStateCardView(Context context) {
        super(context);
        this.f4205n = new ArrayList<>();
        m6627V(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    private void m6627V(Context context) {
        this.f4203l = context;
        addView(m6634G(LayoutInflater.from(context), this));
    }

    /* JADX INFO: renamed from: G */
    public View m6634G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m0i.m11746b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: K */
    public final void m6635K() {
        if (this.f4201j.getHeight() < this.f4201j.getLineHeight() * this.f4201j.getLineCount()) {
            for (int lineCount = this.f4201j.getLineCount() - 1; lineCount > 0; lineCount--) {
                if (this.f4201j.getHeight() >= this.f4201j.getLineHeight() * lineCount) {
                    this.f4201j.setMaxLines(lineCount);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: L */
    public void m6636L() {
        m6666u0();
        this.f4193b.getChildPlayerView().m6537F();
    }

    /* JADX INFO: renamed from: M */
    public final void m6637M(PhotoAlbumPlayerView photoAlbumPlayerView, boolean z) {
        photoAlbumPlayerView.m6535D(z);
        m6662q0(z);
    }

    /* JADX INFO: renamed from: N */
    public void m6638N(boolean z, boolean z2) {
        PhotoAlbumPlayerView childPlayerView = this.f4193b.getChildPlayerView();
        if (childPlayerView != null) {
            childPlayerView.m6535D(z);
            if (z2) {
                m6662q0(z);
            }
        }
    }

    /* JADX INFO: renamed from: O */
    public final void m6639O() {
        zvf0.u("e_other_state_like", "p_other_state", new j760[]{vwb.Y("be_liked", Boolean.valueOf(this.f4204m.haveLiked)), vwb.Y("state_id", this.f4204m.f191id), vwb.Y("owner_id", this.f4204m.owner.f264id)});
    }

    /* JADX INFO: renamed from: P */
    public final void m6640P() {
        zvf0.A("e_other_state_like", "p_other_state", new j760[]{vwb.Y("be_liked", Boolean.valueOf(this.f4204m.haveLiked)), vwb.Y("state_id", this.f4204m.f191id), vwb.Y("owner_id", this.f4204m.owner.f264id)});
    }

    /* JADX INFO: renamed from: Q */
    public final void m6641Q() {
        BubbleInfo bubbleInfo = this.f4204m;
        if (bubbleInfo.haveLiked) {
            FeedModule.f316d.m16571W6(bubbleInfo.f191id, bubbleInfo.owner.f264id).subscribe(mkd0.H(new e30() { // from class: l.i0i
                public final void call(Object obj) {
                    this.f8854a.m6648Z((Envelope) obj);
                }
            }, new e30() { // from class: l.j0i
                public final void call(Object obj) {
                    this.f9174a.m6656j0((Throwable) obj);
                }
            }));
        } else {
            FeedModule.f316d.m16471Hb(bubbleInfo.f191id, bubbleInfo.owner.f264id, false).subscribe(mkd0.H(new e30() { // from class: l.k0i
                public final void call(Object obj) {
                    this.f9563a.m6649a0((Envelope) obj);
                }
            }, new e30() { // from class: l.j0i
                public final void call(Object obj) {
                    this.f9174a.m6656j0((Throwable) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public void m6642R() {
        this.f4201j.setVisibility(8);
        post(new Runnable() { // from class: l.e0i
            @Override // java.lang.Runnable
            public final void run() {
                this.f7098a.m6650b0();
            }
        });
    }

    /* JADX INFO: renamed from: S */
    public void m6643S() {
        this.f4206o = true;
        this.f4198g.setBackgroundResource(f3c0.f7849l5);
        this.f4198g.setOnClickListener(new View.OnClickListener() { // from class: l.h0i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8545a.m6651c0(view);
            }
        });
    }

    /* JADX INFO: renamed from: T */
    public void m6644T() {
        this.f4206o = false;
        boolean z = this.f4204m.haveLiked;
        VText vText = this.f4198g;
        if (z) {
            vText.setBackgroundResource(f3c0.f7857m5);
        } else {
            vText.setBackgroundResource(f3c0.f7841k5);
        }
        this.f4198g.setOnClickListener(new View.OnClickListener() { // from class: l.l0i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9839a.m6652e0(view);
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public void m6645W() {
        if (!NullChecker.a(this.f4195d) || ((DbObject) FeedModule.m1140H().me_()).id.equals(this.f4204m.owner.f264id)) {
            return;
        }
        this.f4195d.setOnClick(new Runnable() { // from class: l.d0i
            @Override // java.lang.Runnable
            public final void run() {
                this.f6768a.m6653f0();
            }
        });
    }

    /* JADX INFO: renamed from: X */
    public PreviewVideoLikeImageView m6646X() {
        ViewGroup.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        AppCompatImageView previewVideoLikeImageView = new PreviewVideoLikeImageView(this.f4203l);
        previewVideoLikeImageView.setBackgroundResource(f3c0.f7731W3);
        previewVideoLikeImageView.setLayoutParams(layoutParams);
        previewVideoLikeImageView.setVisibility(8);
        return previewVideoLikeImageView;
    }

    /* JADX INFO: renamed from: Y */
    public boolean m6647Y() {
        return this.f4204m.media.size() > 0 && (this.f4204m.media.get(0) instanceof Video);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m6648Z(Envelope envelope) {
        m6639O();
        this.f4204m.haveLiked = false;
        this.f4198g.setBackgroundResource(f3c0.f7841k5);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m6649a0(Envelope envelope) {
        m6639O();
        this.f4204m.haveLiked = true;
        this.f4198g.setBackgroundResource(f3c0.f7857m5);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m6650b0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f4199h.getLayoutParams();
        float width = getWidth() / t100.d(295.0f);
        if (width != 1.0f) {
            marginLayoutParams.height = (int) (marginLayoutParams.height * width);
            marginLayoutParams.width = (int) (marginLayoutParams.width * width);
        }
        this.f4199h.setLayoutParams(marginLayoutParams);
        xdl0.X(this.f4201j, (int) (t100.d(30.0f) * width));
        this.f4201j.setVisibility(0);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m6651c0(View view) {
        m6667v0();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m6652e0(View view) {
        m6641Q();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.View, com.p1.mobile.putong.feed.ui.PreviewVideoLikeImageView, java.lang.Object] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m6653f0() {
        ?? M6646X = m6646X();
        FeedVideoLikeContainerView feedVideoLikeContainerView = this.f4195d;
        feedVideoLikeContainerView.addView((View) M6646X, feedVideoLikeContainerView.getChildCount());
        this.f4205n.add(M6646X);
        M6646X.setRotation((int) (Math.random() * ((double) (Math.random() > 0.5d ? 1 : -1)) * 20.0d));
        M6646X.setScaleX(1.5f);
        M6646X.setScaleY(1.5f);
        M6646X.setY(this.f4195d.f4898c - t100.d(30.0f));
        M6646X.setX(this.f4195d.f4897b - t100.d(27.0f));
        M6646X.setVisibility(0);
        m6658l0(this.f4195d);
        if (this.f4204m.haveLiked) {
            return;
        }
        m6641Q();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m6654g0(View view) {
        m6636L();
    }

    /* JADX INFO: renamed from: h0 */
    public void m6655h0() {
        if (!m6647Y() || this.f4193b.getChildPlayerView() == null) {
            return;
        }
        this.f4193b.getChildPlayerView().m6541J();
    }

    /* JADX INFO: renamed from: j0 */
    public final void m6656j0(Throwable th) {
        FeedModule.f316d.f15005t1.onNext(Boolean.TRUE);
        if ((th instanceof TantanException.Client.CoreService) && ((TantanException.Client.CoreService) th).code == 400) {
            lsi0.y("状态已结束");
            return;
        }
        boolean z = th instanceof TantanException.Client.TantanForbidden;
        if (z && ((TantanException.Client.TantanForbidden) th).code == 40309) {
            osi0.g("对方拉黑了你");
        } else if (z && ((TantanException.Client.TantanForbidden) th).code == 40308) {
            osi0.g("操作失败，已拉黑对方");
        } else {
            lsi0.y("对方账号异常");
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m6657k0() {
        if (m6647Y()) {
            if (this.f4193b.getChildPlayerView() == null) {
                this.f4193b.setSuccessAttachCallback(new e30() { // from class: l.g0i
                    public final void call(Object obj) {
                        this.f8292a.m6654g0((View) obj);
                    }
                });
            } else {
                m6636L();
            }
        }
        if (this.f4206o) {
            return;
        }
        m6640P();
    }

    /* JADX INFO: renamed from: l0 */
    public void m6658l0(ViewGroup viewGroup) {
        for (int size = this.f4205n.size() - 1; size > 0; size--) {
            VImage vImage = (PreviewVideoLikeImageView) this.f4205n.get(size);
            if (vImage.getVisibility() == 8) {
                viewGroup.removeView(vImage);
                this.f4205n.remove(vImage);
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m6659m0(BubbleInfo bubbleInfo) {
        this.f4204m = bubbleInfo;
        m6664s0();
        m6660o0();
        m6663r0();
        m6661p0();
        m6645W();
        m6642R();
        m6662q0(f4191p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: o0 */
    public void m6660o0() {
        if (TextUtils.isEmpty(this.f4204m.location.name)) {
            this.f4202k.setVisibility(8);
            return;
        }
        SpannableString spannableString = new SpannableString("  " + this.f4204m.location.name);
        spannableString.setSpan(new zrg(this.f4203l, BitmapFactory.decodeResource(getResources(), f3c0.f7761a5)), 0, 1, 33);
        this.f4202k.setText(spannableString);
        if (nkg.m12207E()) {
            this.f4202k.setTextColor(Color.parseColor("#cc000000"));
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final void m6661p0() {
        FeedStateCardBgRenderCenter.doRender(this, this.f4204m);
    }

    /* JADX INFO: renamed from: q0 */
    public void m6662q0(boolean z) {
        VText vText = this.f4196e;
        if (z) {
            vText.setBackgroundResource(f3c0.f7746Y4);
        } else {
            vText.setBackgroundResource(f3c0.f7753Z4);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public void m6663r0() {
        this.f4201j.setMaxLines(3);
        qib0.G.L0(this.f4199h, this.f4204m.emotion.emojiUrl);
        this.f4200i.setText(this.f4204m.emotion.text);
        if (nkg.m12207E()) {
            this.f4200i.setTextColor(Color.parseColor("#e6000000"));
            this.f4201j.setTextColor(Color.parseColor("#e6000000"));
        }
        this.f4201j.setText(this.f4204m.value);
        this.f4201j.post(new Runnable() { // from class: l.f0i
            @Override // java.lang.Runnable
            public final void run() {
                this.f7512a.m6635K();
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public void m6664s0() {
        User userM16628e8 = FeedModule.f316d.m16628e8(this.f4204m.owner.f264id);
        xdl0.M(this.f4197f, true);
        if (((DbObject) FeedModule.m1140H().me_()).id.equals(((DbObject) userM16628e8).id)) {
            if (TextUtils.equals(this.f4204m.status, "pending")) {
                this.f4197f.setText(R$string.f512e5);
                this.f4197f.setTextColor(Color.parseColor("#4d000000"));
                xdl0.M(this.f4197f, sti.m14317c());
                return;
            }
            return;
        }
        boolean zM12207E = nkg.m12207E();
        TextView textView = this.f4197f;
        if (zM12207E) {
            textView.setText(vqg.m15493Q(userM16628e8, (long) this.f4204m.createdTime, userM16628e8.getLastActiveTimeMillis()));
            this.f4197f.setTextColor(Color.parseColor("#4d000000"));
        } else {
            textView.setText("即将在" + a5i.m8415o(this.f4204m.createdTime + 8.64E7d) + "后消失");
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m6665t0() {
        PhotoAlbumPlayerView childPlayerView = this.f4193b.getChildPlayerView();
        if (childPlayerView != null) {
            boolean z = !childPlayerView.m6549x();
            m6637M(childPlayerView, z);
            f4191p = z;
        }
    }

    /* JADX INFO: renamed from: u0 */
    public final void m6666u0() {
        PhotoAlbumPlayerView childPlayerView = this.f4193b.getChildPlayerView();
        if (childPlayerView != null) {
            childPlayerView.m6543r(new C2174a(childPlayerView));
        }
    }

    /* JADX INFO: renamed from: v0 */
    public final void m6667v0() {
        if (s1i.m13980d(this.f4203l, "p_other_state")) {
            return;
        }
        boolean zM12199A = nkg.m12199A();
        Act act = this.f4203l;
        if (zM12199A) {
            act.startActivity(FeedSelectAndPostStatusAct.m6958q2(act, this.f4204m, "p_other_state"));
        } else {
            act.startActivity(FeedPostStatusAct.m6951q2(act, this.f4204m, "p_other_state"));
        }
        this.f4203l.overridePendingTransition(0, 0);
        zvf0.u("e_my_state_edit", "p_my_state", new j760[]{vwb.Y("state_id", this.f4204m.f191id)});
    }

    public FeedStateCardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4205n = new ArrayList<>();
        m6627V(context);
    }

    public FeedStateCardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4205n = new ArrayList<>();
        m6627V(context);
    }
}
