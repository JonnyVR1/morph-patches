package com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGift;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftList;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallUser;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.view.LiveGiftFiveStarView;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bnl0;
import p153l.izs;
import p153l.jyb;
import p153l.n3d0;
import p153l.qcj;
import p153l.sos;
import p153l.xau;
import p153l.xrs;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftWallGiftListItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: A */
    public SVGAnimationView f50513A;

    /* JADX INFO: renamed from: B */
    public View f50514B;

    /* JADX INFO: renamed from: C */
    public VDraweeView f50515C;

    /* JADX INFO: renamed from: D */
    public VDraweeView f50516D;

    /* JADX INFO: renamed from: E */
    public TextView f50517E;

    /* JADX INFO: renamed from: F */
    public LiveGiftFiveStarView f50518F;

    /* JADX INFO: renamed from: G */
    public xrs f50519G;

    /* JADX INFO: renamed from: d */
    public TextView f50520d;

    /* JADX INFO: renamed from: e */
    public VImage f50521e;

    /* JADX INFO: renamed from: f */
    public ConstraintLayout f50522f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f50523g;

    /* JADX INFO: renamed from: h */
    public View f50524h;

    /* JADX INFO: renamed from: i */
    public SVGAnimationView f50525i;

    /* JADX INFO: renamed from: j */
    public View f50526j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f50527k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f50528l;

    /* JADX INFO: renamed from: m */
    public TextView f50529m;

    /* JADX INFO: renamed from: n */
    public LiveGiftFiveStarView f50530n;

    /* JADX INFO: renamed from: o */
    public ConstraintLayout f50531o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f50532p;

    /* JADX INFO: renamed from: q */
    public View f50533q;

    /* JADX INFO: renamed from: r */
    public SVGAnimationView f50534r;

    /* JADX INFO: renamed from: s */
    public View f50535s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f50536t;

    /* JADX INFO: renamed from: u */
    public VDraweeView f50537u;

    /* JADX INFO: renamed from: v */
    public TextView f50538v;

    /* JADX INFO: renamed from: w */
    public LiveGiftFiveStarView f50539w;

    /* JADX INFO: renamed from: x */
    public ConstraintLayout f50540x;

    /* JADX INFO: renamed from: y */
    public VDraweeView f50541y;

    /* JADX INFO: renamed from: z */
    public View f50542z;

    public LiveGiftWallGiftListItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: l0 */
    public final void m74817l0(View view) {
        sos.m187276a(this, view);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m74818m0(BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList, int i, View view) {
        this.f50519G.m212859Z3(bLiveNewGiftWallGiftList.gifts.get(i));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m74819n0(BLiveNewGiftWallUser bLiveNewGiftWallUser, View view) {
        this.f50519G.m212861b4(bLiveNewGiftWallUser);
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: o0 */
    public void m74820o0(final BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList, final xrs xrsVar) {
        this.f50519G = xrsVar;
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.oos
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                xrsVar.m212858Y3(bLiveNewGiftWallGiftList.category.f45258id);
            }
        });
        this.f50520d.setText(bLiveNewGiftWallGiftList.category.name + "(" + bLiveNewGiftWallGiftList.tab.progress.current + "/" + bLiveNewGiftWallGiftList.tab.progress.total + ")");
        m74821p0(bLiveNewGiftWallGiftList);
        m74822q0(bLiveNewGiftWallGiftList, 0, this.f50523g, this.f50528l, this.f50527k, this.f50526j, this.f50529m, this.f50530n, this.f50525i, this.f50524h, this.f50522f);
        m74822q0(bLiveNewGiftWallGiftList, 1, this.f50532p, this.f50537u, this.f50536t, this.f50535s, this.f50538v, this.f50539w, this.f50534r, this.f50533q, this.f50531o);
        m74822q0(bLiveNewGiftWallGiftList, 2, this.f50541y, this.f50516D, this.f50515C, this.f50514B, this.f50517E, this.f50518F, this.f50513A, this.f50542z, this.f50540x);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        bnl0.m105525M0(this.f50522f, false);
        bnl0.m105525M0(this.f50531o, false);
        bnl0.m105525M0(this.f50540x, false);
        bnl0.m105524M(this.f50527k, false);
        bnl0.m105524M(this.f50536t, false);
        bnl0.m105524M(this.f50515C, false);
        this.f50525i.stopAnimation(true);
        this.f50534r.stopAnimation(true);
        this.f50513A.stopAnimation(true);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74817l0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public void m74821p0(BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList) {
        if (bLiveNewGiftWallGiftList.gifts.size() > 0) {
            bnl0.m105525M0(this.f50522f, true);
            izs.m142868s("context_livingAct", this.f50523g, bLiveNewGiftWallGiftList.category.cardBgUrl);
        }
        if (bLiveNewGiftWallGiftList.gifts.size() > 1) {
            bnl0.m105525M0(this.f50531o, true);
            izs.m142868s("context_livingAct", this.f50532p, bLiveNewGiftWallGiftList.category.cardBgUrl);
        }
        if (bLiveNewGiftWallGiftList.gifts.size() > 2) {
            bnl0.m105525M0(this.f50540x, true);
            izs.m142868s("context_livingAct", this.f50541y, bLiveNewGiftWallGiftList.category.cardBgUrl);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public final void m74822q0(final BLiveNewGiftWallGiftList bLiveNewGiftWallGiftList, final int i, VDraweeView vDraweeView, VDraweeView vDraweeView2, VDraweeView vDraweeView3, View view, TextView textView, LiveGiftFiveStarView liveGiftFiveStarView, SVGAnimationView sVGAnimationView, View view2, View view3) {
        boolean z = false;
        if (bLiveNewGiftWallGiftList.gifts.size() <= i) {
            bnl0.m105525M0(view3, false);
            return;
        }
        bnl0.m105525M0(view3, true);
        bnl0.m105509E0(vDraweeView, new View.OnClickListener() { // from class: l.pos
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                this.f153422a.m74818m0(bLiveNewGiftWallGiftList, i, view4);
            }
        });
        final BLiveNewGiftWallGift bLiveNewGiftWallGift = bLiveNewGiftWallGiftList.gifts.get(i);
        final BLiveNewGiftWallUser bLiveNewGiftWallUser = (BLiveNewGiftWallUser) jyb.m147529r(bLiveNewGiftWallGiftList.users, new qcj() { // from class: l.qos
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveNewGiftWallUser) obj).f45264id.equals(bLiveNewGiftWallGift.namedUserId));
            }
        });
        boolean z2 = !TextUtils.isEmpty(bLiveNewGiftWallGiftList.category.avatarBorderColor) && NullChecker.m82486a(bLiveNewGiftWallUser);
        bnl0.m105524M(view, z2);
        if (z2) {
            view.setBackground(n3d0.m161279c(bLiveNewGiftWallGiftList.category.avatarBorderColor, 30));
        }
        bnl0.m105524M(vDraweeView3, NullChecker.m82486a(bLiveNewGiftWallUser));
        if (NullChecker.m82486a(bLiveNewGiftWallUser)) {
            izs.m142868s("context_livingAct", vDraweeView3, bLiveNewGiftWallUser.avatar);
            bnl0.m105509E0(vDraweeView3, new View.OnClickListener() { // from class: l.ros
                @Override // android.view.View.OnClickListener
                public final void onClick(View view4) {
                    this.f164235a.m74819n0(bLiveNewGiftWallUser, view4);
                }
            });
        }
        izs.m142868s("context_livingAct", vDraweeView2, bLiveNewGiftWallGift.icon);
        textView.setText(xau.m209909s(bLiveNewGiftWallGift.name, 5));
        liveGiftFiveStarView.m74851j0(bLiveNewGiftWallGift.grade);
        bnl0.m105524M(liveGiftFiveStarView, bLiveNewGiftWallGift.grade > 0);
        bnl0.m105524M(view2, bLiveNewGiftWallGift.grade <= 0);
        n3d0.m161285i(vDraweeView2, bLiveNewGiftWallGift.grade <= 0);
        if (bLiveNewGiftWallGift.grade > 0 && !TextUtils.isEmpty(bLiveNewGiftWallGiftList.category.cardBgSvgaUrl)) {
            z = true;
        }
        bnl0.m105524M(sVGAnimationView, z);
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
