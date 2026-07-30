package com.p051p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveMultiPkPanelUser;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.izs;
import p153l.mm10;
import p153l.n9c0;
import p153l.obc0;
import p153l.wlj;
import p153l.y20;

/* JADX INFO: loaded from: classes5.dex */
public class MultiCallPkCreateItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f52283d;

    /* JADX INFO: renamed from: e */
    public VImage f52284e;

    /* JADX INFO: renamed from: f */
    public VImage f52285f;

    /* JADX INFO: renamed from: g */
    public VText f52286g;

    public MultiCallPkCreateItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m77062i0(View view) {
        mm10.m158953a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m77063j0(BLiveMultiPkPanelUser bLiveMultiPkPanelUser, final int i, final y20<Integer> y20Var) {
        wlj hierarchy = this.f52283d.getHierarchy();
        if (bLiveMultiPkPanelUser.picked) {
            hierarchy.m207040C(this.f52283d.getResources().getDrawable(n9c0.f140787P));
        } else {
            hierarchy.m207040C(null);
        }
        boolean zEquals = bLiveMultiPkPanelUser.f45256id.equals(User.ID_TEAM_ACCOUNT);
        VText vText = this.f52286g;
        if (zEquals) {
            vText.setText("待邀请");
            VText vText2 = this.f52286g;
            vText2.setTextColor(vText2.getResources().getColor(n9c0.f140838j1));
            this.f52283d.setActualImageResource(obc0.f146392k6);
            this.f52284e.setVisibility(8);
            this.f52285f.setVisibility(8);
        } else {
            vText.setText(bLiveMultiPkPanelUser.name);
            izs.m142868s("context_single_room", this.f52283d, bLiveMultiPkPanelUser.avatar);
            this.f52285f.setVisibility((bLiveMultiPkPanelUser.role.equals("spectator") || !bLiveMultiPkPanelUser.picked) ? 0 : 8);
            this.f52284e.setVisibility(bLiveMultiPkPanelUser.picked ? 0 : 8);
            VText vText3 = this.f52286g;
            vText3.setTextColor(vText3.getResources().getColor(n9c0.f140853o1));
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.lm10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(Integer.valueOf(i));
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77062i0(this);
    }
}
