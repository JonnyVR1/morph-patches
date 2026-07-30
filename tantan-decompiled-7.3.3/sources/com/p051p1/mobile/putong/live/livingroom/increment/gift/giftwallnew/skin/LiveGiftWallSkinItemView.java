package com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.skin;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveNewGiftWallGiftDetail;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.giftwallnew.skin.LiveGiftWallSkinItemView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.fqs;
import p153l.izs;
import p153l.jqs;
import p153l.n3d0;
import p153l.obc0;
import p153l.qa00;
import p153l.xau;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGiftWallSkinItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f50566a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f50567b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f50568c;

    /* JADX INFO: renamed from: d */
    public VText f50569d;

    /* JADX INFO: renamed from: e */
    public jqs f50570e;

    public LiveGiftWallSkinItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m74838a(jqs jqsVar, BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, View view) {
        if (NullChecker.m82486a(jqsVar)) {
            jqsVar.m146631W3(bLiveNewGiftWallGiftDetail.user);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m74839b(jqs jqsVar, BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, View view) {
        if (NullChecker.m82486a(jqsVar)) {
            jqsVar.m146630V3(bLiveNewGiftWallGiftDetail.gift);
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m74840c(View view) {
        fqs.m126799a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public void m74841d(final BLiveNewGiftWallGiftDetail bLiveNewGiftWallGiftDetail, final jqs jqsVar) {
        this.f50570e = jqsVar;
        if (NullChecker.m82486a(bLiveNewGiftWallGiftDetail.gift)) {
            this.f50569d.setText(xau.m209909s(bLiveNewGiftWallGiftDetail.gift.name, 5));
            izs.m142868s("context_livingAct", this.f50567b, bLiveNewGiftWallGiftDetail.gift.icon);
            n3d0.m161285i(this.f50567b, TextUtils.isEmpty(bLiveNewGiftWallGiftDetail.gift.namedUserId));
            boolean zIsEmpty = TextUtils.isEmpty(bLiveNewGiftWallGiftDetail.gift.namedUserId);
            VDraweeView vDraweeView = this.f50566a;
            if (zIsEmpty) {
                vDraweeView.setActualImageResource(obc0.f146145P0);
            } else {
                vDraweeView.setActualImageResource(obc0.f146134O0);
            }
        }
        boolean zM82486a = NullChecker.m82486a(bLiveNewGiftWallGiftDetail.user);
        VDraweeView vDraweeView2 = this.f50568c;
        if (zM82486a) {
            izs.m142868s("context_livingAct", vDraweeView2, bLiveNewGiftWallGiftDetail.user.avatar);
            bnl0.m105524M(this.f50568c, true);
            bnl0.m105509E0(this.f50568c, new View.OnClickListener() { // from class: l.dqs
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LiveGiftWallSkinItemView.m74838a(jqsVar, bLiveNewGiftWallGiftDetail, view);
                }
            });
        } else {
            bnl0.m105524M(vDraweeView2, false);
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.eqs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LiveGiftWallSkinItemView.m74839b(jqsVar, bLiveNewGiftWallGiftDetail, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74840c(this);
        bnl0.m105505C0(this, qa00.m175859d(175.0f));
    }

    public LiveGiftWallSkinItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveGiftWallSkinItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
