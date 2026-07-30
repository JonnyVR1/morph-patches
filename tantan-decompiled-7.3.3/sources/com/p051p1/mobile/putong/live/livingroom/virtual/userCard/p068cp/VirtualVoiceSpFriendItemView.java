package com.p051p1.mobile.putong.live.livingroom.virtual.userCard.p068cp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.putong.live.base.data.BLiveSpecialFriendRelation;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.cdm0;
import p153l.izs;
import p153l.n3d0;
import p153l.obc0;
import p153l.qa00;
import p153l.qnp0;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualVoiceSpFriendItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f53635d;

    /* JADX INFO: renamed from: e */
    public View f53636e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f53637f;

    /* JADX INFO: renamed from: g */
    public VText f53638g;

    public VirtualVoiceSpFriendItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m78740i0(View view) {
        cdm0.m109225a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m78741j0(final BLiveSpecialFriendRelation bLiveSpecialFriendRelation, final y20<BLiveSpecialFriendRelation> y20Var) {
        if (bLiveSpecialFriendRelation == null) {
            return;
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.bdm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(bLiveSpecialFriendRelation);
            }
        });
        qnp0.m177261d1(this.f53638g, qa00.f156318e);
        this.f53638g.setBackgroundColor(n3d0.m161284h(bLiveSpecialFriendRelation.bgColor, -7829368));
        if (!bLiveSpecialFriendRelation.isUnLocked) {
            bnl0.m105524M(this.f53636e, false);
            bnl0.m105524M(this.f53637f, false);
            this.f53638g.setText(bLiveSpecialFriendRelation.name);
            izs.m142873x(this.f53635d, obc0.f146208U8);
            return;
        }
        VDraweeView vDraweeView = this.f53635d;
        String str = bLiveSpecialFriendRelation.icon;
        int i = qa00.f156291D;
        izs.m142870u("context_livingAct", vDraweeView, str, i, i);
        bnl0.m105524M(this.f53636e, true);
        bnl0.m105524M(this.f53637f, true);
        VDraweeView vDraweeView2 = this.f53637f;
        String str2 = bLiveSpecialFriendRelation.otherUserAvatar;
        int i2 = qa00.f156328o;
        izs.m142870u("context_livingAct", vDraweeView2, str2, i2, i2);
        this.f53638g.setText("Lv." + bLiveSpecialFriendRelation.level + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bLiveSpecialFriendRelation.name);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78740i0(this);
    }

    public VirtualVoiceSpFriendItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualVoiceSpFriendItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
