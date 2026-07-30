package com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftList;
import com.p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import l.hxs;
import l.kvc0;
import l.vwb;
import l.w8u;
import l.w9j;
import l.xdl0;
import p002l.rms;
import p002l.wps;
import v.VDraweeView;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGiftWallGiftListItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public SVGAnimationView f5707A;

    /* JADX INFO: renamed from: B */
    public View f5708B;

    /* JADX INFO: renamed from: C */
    public VDraweeView f5709C;

    /* JADX INFO: renamed from: D */
    public VDraweeView f5710D;

    /* JADX INFO: renamed from: E */
    public TextView f5711E;

    /* JADX INFO: renamed from: F */
    public LiveGiftFiveStarView f5712F;

    /* JADX INFO: renamed from: G */
    public wps f5713G;

    /* JADX INFO: renamed from: d */
    public TextView f5714d;

    /* JADX INFO: renamed from: e */
    public VImage f5715e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f5716f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f5717g;

    /* JADX INFO: renamed from: h */
    public View f5718h;

    /* JADX INFO: renamed from: i */
    public SVGAnimationView f5719i;

    /* JADX INFO: renamed from: j */
    public View f5720j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f5721k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f5722l;

    /* JADX INFO: renamed from: m */
    public TextView f5723m;

    /* JADX INFO: renamed from: n */
    public LiveGiftFiveStarView f5724n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f5725o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f5726p;

    /* JADX INFO: renamed from: q */
    public View f5727q;

    /* JADX INFO: renamed from: r */
    public SVGAnimationView f5728r;

    /* JADX INFO: renamed from: s */
    public View f5729s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f5730t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f5731u;

    /* JADX INFO: renamed from: v */
    public TextView f5732v;

    /* JADX INFO: renamed from: w */
    public LiveGiftFiveStarView f5733w;

    /* JADX INFO: renamed from: x */
    public ConstraintLayout f5734x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f5735y;

    /* JADX INFO: renamed from: z */
    public View f5736z;

    public LiveGiftWallGiftListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m7182l0(View view) {
        rms.m22081a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m7183m0(BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList, int i, View view) {
        this.f5713G.m25281Z3((BLiveNewGiftWallGift) bLiveNewGiftWallGiftList.gifts.get(i));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m7184n0(BLiveNewGiftWallUser bLiveNewGiftWallUser, View view) {
        this.f5713G.m25283b4(bLiveNewGiftWallUser);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: o0 */
    public void m7185o0(final BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList, final wps wpsVar) {
        this.f5713G = wpsVar;
        xdl0.E0(this, new View.OnClickListener() { // from class: l.nms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wpsVar.m25280Y3(bLiveNewGiftWallGiftList.category.id);
            }
        });
        this.f5714d.setText(bLiveNewGiftWallGiftList.category.name + "(" + bLiveNewGiftWallGiftList.tab.progress.current + "/" + bLiveNewGiftWallGiftList.tab.progress.total + ")");
        m7186p0(bLiveNewGiftWallGiftList);
        m7187q0(bLiveNewGiftWallGiftList, 0, this.f5717g, this.f5722l, this.f5721k, this.f5720j, this.f5723m, this.f5724n, this.f5719i, this.f5718h, this.f5716f);
        m7187q0(bLiveNewGiftWallGiftList, 1, this.f5726p, this.f5731u, this.f5730t, this.f5729s, this.f5732v, this.f5733w, this.f5728r, this.f5727q, this.f5725o);
        m7187q0(bLiveNewGiftWallGiftList, 2, this.f5735y, this.f5710D, this.f5709C, this.f5708B, this.f5711E, this.f5712F, this.f5707A, this.f5736z, this.f5734x);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        xdl0.M0(this.f5716f, false);
        xdl0.M0(this.f5725o, false);
        xdl0.M0(this.f5734x, false);
        xdl0.M(this.f5721k, false);
        xdl0.M(this.f5730t, false);
        xdl0.M(this.f5709C, false);
        this.f5719i.stopAnimation(true);
        this.f5728r.stopAnimation(true);
        this.f5707A.stopAnimation(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7182l0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m7186p0(BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList) {
        if (bLiveNewGiftWallGiftList.gifts.size() > 0) {
            xdl0.M0(this.f5716f, true);
            hxs.s("context_livingAct", this.f5717g, bLiveNewGiftWallGiftList.category.cardBgUrl);
        }
        if (bLiveNewGiftWallGiftList.gifts.size() > 1) {
            xdl0.M0(this.f5725o, true);
            hxs.s("context_livingAct", this.f5726p, bLiveNewGiftWallGiftList.category.cardBgUrl);
        }
        if (bLiveNewGiftWallGiftList.gifts.size() > 2) {
            xdl0.M0(this.f5734x, true);
            hxs.s("context_livingAct", this.f5735y, bLiveNewGiftWallGiftList.category.cardBgUrl);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final void m7187q0(final BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList, final int i, VDraweeView vDraweeView, VDraweeView vDraweeView2, VDraweeView vDraweeView3, View view, TextView textView, LiveGiftFiveStarView liveGiftFiveStarView, SVGAnimationView sVGAnimationView, View view2, View view3) {
        boolean z = false;
        if (bLiveNewGiftWallGiftList.gifts.size() <= i) {
            xdl0.M0(view3, false);
            return;
        }
        xdl0.M0(view3, true);
        xdl0.E0(vDraweeView, new View.OnClickListener() { // from class: l.oms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                this.f16720a.m7183m0(bLiveNewGiftWallGiftList, i, view4);
            }
        });
        final BLiveNewGiftWallGift bLiveNewGiftWallGift = (BLiveNewGiftWallGift) bLiveNewGiftWallGiftList.gifts.get(i);
        final BLiveNewGiftWallUser bLiveNewGiftWallUser = (BLiveNewGiftWallUser) vwb.r(bLiveNewGiftWallGiftList.users, new w9j() { // from class: l.pms
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveNewGiftWallUser) obj).id.equals(bLiveNewGiftWallGift.namedUserId));
            }
        });
        boolean z2 = !TextUtils.isEmpty(bLiveNewGiftWallGiftList.category.avatarBorderColor) && NullChecker.a(bLiveNewGiftWallUser);
        xdl0.M(view, z2);
        if (z2) {
            view.setBackground(kvc0.c(bLiveNewGiftWallGiftList.category.avatarBorderColor, 30));
        }
        xdl0.M(vDraweeView3, NullChecker.a(bLiveNewGiftWallUser));
        if (NullChecker.a(bLiveNewGiftWallUser)) {
            hxs.s("context_livingAct", vDraweeView3, bLiveNewGiftWallUser.avatar);
            xdl0.E0(vDraweeView3, new View.OnClickListener() { // from class: l.qms
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    this.f18095a.m7184n0(bLiveNewGiftWallUser, view4);
                }
            });
        }
        hxs.s("context_livingAct", vDraweeView2, bLiveNewGiftWallGift.icon);
        textView.setText(w8u.s(bLiveNewGiftWallGift.name, 5));
        liveGiftFiveStarView.m7216j0(bLiveNewGiftWallGift.grade);
        xdl0.M(liveGiftFiveStarView, bLiveNewGiftWallGift.grade > 0);
        xdl0.M(view2, bLiveNewGiftWallGift.grade <= 0);
        kvc0.i(vDraweeView2, bLiveNewGiftWallGift.grade <= 0);
        if (bLiveNewGiftWallGift.grade > 0 && !TextUtils.isEmpty(bLiveNewGiftWallGiftList.category.cardBgSvgaUrl)) {
            z = true;
        }
        xdl0.M(sVGAnimationView, z);
        if (bLiveNewGiftWallGift.grade <= 0 || TextUtils.isEmpty(bLiveNewGiftWallGiftList.category.cardBgSvgaUrl)) {
            return;
        }
        SVGALoader.with(getContext()).from(bLiveNewGiftWallGiftList.category.cardBgSvgaUrl).repeatCount(-1).into(sVGAnimationView);
    }

    public LiveGiftWallGiftListItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftWallGiftListItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
