package com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftList;
import com.p046p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.hxs;
import p149l.kvc0;
import p149l.rms;
import p149l.vwb;
import p149l.w8u;
import p149l.w9j;
import p149l.wps;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftWallGiftListItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public SVGAnimationView f49665A;

    /* JADX INFO: renamed from: B */
    public View f49666B;

    /* JADX INFO: renamed from: C */
    public VDraweeView f49667C;

    /* JADX INFO: renamed from: D */
    public VDraweeView f49668D;

    /* JADX INFO: renamed from: E */
    public TextView f49669E;

    /* JADX INFO: renamed from: F */
    public LiveGiftFiveStarView f49670F;

    /* JADX INFO: renamed from: G */
    public wps f49671G;

    /* JADX INFO: renamed from: d */
    public TextView f49672d;

    /* JADX INFO: renamed from: e */
    public VImage f49673e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f49674f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f49675g;

    /* JADX INFO: renamed from: h */
    public View f49676h;

    /* JADX INFO: renamed from: i */
    public SVGAnimationView f49677i;

    /* JADX INFO: renamed from: j */
    public View f49678j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f49679k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f49680l;

    /* JADX INFO: renamed from: m */
    public TextView f49681m;

    /* JADX INFO: renamed from: n */
    public LiveGiftFiveStarView f49682n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f49683o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f49684p;

    /* JADX INFO: renamed from: q */
    public View f49685q;

    /* JADX INFO: renamed from: r */
    public SVGAnimationView f49686r;

    /* JADX INFO: renamed from: s */
    public View f49687s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f49688t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f49689u;

    /* JADX INFO: renamed from: v */
    public TextView f49690v;

    /* JADX INFO: renamed from: w */
    public LiveGiftFiveStarView f49691w;

    /* JADX INFO: renamed from: x */
    public ConstraintLayout f49692x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f49693y;

    /* JADX INFO: renamed from: z */
    public View f49694z;

    public LiveGiftWallGiftListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m73634l0(View view) {
        rms.m180047a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m73635m0(BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList, int i, View view) {
        this.f49671G.m204944Z3(bLiveNewGiftWallGiftList.gifts.get(i));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m73636n0(BLiveNewGiftWallUser bLiveNewGiftWallUser, View view) {
        this.f49671G.m204946b4(bLiveNewGiftWallUser);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: o0 */
    public void m73637o0(final BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList, final wps wpsVar) {
        this.f49671G = wpsVar;
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.nms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wpsVar.m204943Y3(bLiveNewGiftWallGiftList.category.f44410id);
            }
        });
        this.f49672d.setText(bLiveNewGiftWallGiftList.category.name + "(" + bLiveNewGiftWallGiftList.tab.progress.current + "/" + bLiveNewGiftWallGiftList.tab.progress.total + ")");
        m73638p0(bLiveNewGiftWallGiftList);
        m73639q0(bLiveNewGiftWallGiftList, 0, this.f49675g, this.f49680l, this.f49679k, this.f49678j, this.f49681m, this.f49682n, this.f49677i, this.f49676h, this.f49674f);
        m73639q0(bLiveNewGiftWallGiftList, 1, this.f49684p, this.f49689u, this.f49688t, this.f49687s, this.f49690v, this.f49691w, this.f49686r, this.f49685q, this.f49683o);
        m73639q0(bLiveNewGiftWallGiftList, 2, this.f49693y, this.f49668D, this.f49667C, this.f49666B, this.f49669E, this.f49670F, this.f49665A, this.f49694z, this.f49692x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        xdl0.m208345M0(this.f49674f, false);
        xdl0.m208345M0(this.f49683o, false);
        xdl0.m208345M0(this.f49692x, false);
        xdl0.m208344M(this.f49679k, false);
        xdl0.m208344M(this.f49688t, false);
        xdl0.m208344M(this.f49667C, false);
        this.f49677i.stopAnimation(true);
        this.f49686r.stopAnimation(true);
        this.f49665A.stopAnimation(true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73634l0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m73638p0(BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList) {
        if (bLiveNewGiftWallGiftList.gifts.size() > 0) {
            xdl0.m208345M0(this.f49674f, true);
            hxs.m133406s("context_livingAct", this.f49675g, bLiveNewGiftWallGiftList.category.cardBgUrl);
        }
        if (bLiveNewGiftWallGiftList.gifts.size() > 1) {
            xdl0.m208345M0(this.f49683o, true);
            hxs.m133406s("context_livingAct", this.f49684p, bLiveNewGiftWallGiftList.category.cardBgUrl);
        }
        if (bLiveNewGiftWallGiftList.gifts.size() > 2) {
            xdl0.m208345M0(this.f49692x, true);
            hxs.m133406s("context_livingAct", this.f49693y, bLiveNewGiftWallGiftList.category.cardBgUrl);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m73639q0(final BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList, final int i, VDraweeView vDraweeView, VDraweeView vDraweeView2, VDraweeView vDraweeView3, View view, TextView textView, LiveGiftFiveStarView liveGiftFiveStarView, SVGAnimationView sVGAnimationView, View view2, View view3) {
        boolean z = false;
        if (bLiveNewGiftWallGiftList.gifts.size() <= i) {
            xdl0.m208345M0(view3, false);
            return;
        }
        xdl0.m208345M0(view3, true);
        xdl0.m208329E0(vDraweeView, new View.OnClickListener() { // from class: l.oms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                this.f144683a.m73635m0(bLiveNewGiftWallGiftList, i, view4);
            }
        });
        final BLiveNewGiftWallGift bLiveNewGiftWallGift = bLiveNewGiftWallGiftList.gifts.get(i);
        final BLiveNewGiftWallUser bLiveNewGiftWallUser = (BLiveNewGiftWallUser) vwb.m200346r(bLiveNewGiftWallGiftList.users, new w9j() { // from class: l.pms
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveNewGiftWallUser) obj).f44416id.equals(bLiveNewGiftWallGift.namedUserId));
            }
        });
        boolean z2 = !TextUtils.isEmpty(bLiveNewGiftWallGiftList.category.avatarBorderColor) && NullChecker.m81303a(bLiveNewGiftWallUser);
        xdl0.m208344M(view, z2);
        if (z2) {
            view.setBackground(kvc0.m147354c(bLiveNewGiftWallGiftList.category.avatarBorderColor, 30));
        }
        xdl0.m208344M(vDraweeView3, NullChecker.m81303a(bLiveNewGiftWallUser));
        if (NullChecker.m81303a(bLiveNewGiftWallUser)) {
            hxs.m133406s("context_livingAct", vDraweeView3, bLiveNewGiftWallUser.avatar);
            xdl0.m208329E0(vDraweeView3, new View.OnClickListener() { // from class: l.qms
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    this.f155337a.m73636n0(bLiveNewGiftWallUser, view4);
                }
            });
        }
        hxs.m133406s("context_livingAct", vDraweeView2, bLiveNewGiftWallGift.icon);
        textView.setText(w8u.m202216s(bLiveNewGiftWallGift.name, 5));
        liveGiftFiveStarView.m73668j0(bLiveNewGiftWallGift.grade);
        xdl0.m208344M(liveGiftFiveStarView, bLiveNewGiftWallGift.grade > 0);
        xdl0.m208344M(view2, bLiveNewGiftWallGift.grade <= 0);
        kvc0.m147360i(vDraweeView2, bLiveNewGiftWallGift.grade <= 0);
        if (bLiveNewGiftWallGift.grade > 0 && !TextUtils.isEmpty(bLiveNewGiftWallGiftList.category.cardBgSvgaUrl)) {
            z = true;
        }
        xdl0.m208344M(sVGAnimationView, z);
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
