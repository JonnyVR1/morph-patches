package com.p046p1.mobile.putong.live.livingroom.recreation.multiPk.dialog.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveMultiPkPanelUser;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.ce10;
import p149l.djj;
import p149l.e30;
import p149l.h1c0;
import p149l.hxs;
import p149l.i3c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
public class MultiCallPkCreateItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f51435d;

    /* JADX INFO: renamed from: e */
    public VImage f51436e;

    /* JADX INFO: renamed from: f */
    public VImage f51437f;

    /* JADX INFO: renamed from: g */
    public VText f51438g;

    public MultiCallPkCreateItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m75879i0(View view) {
        ce10.m106303a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m75880j0(BLiveMultiPkPanelUser bLiveMultiPkPanelUser, final int i, final e30<Integer> e30Var) {
        djj hierarchy = this.f51435d.getHierarchy();
        if (bLiveMultiPkPanelUser.picked) {
            hierarchy.m112048C(this.f51435d.getResources().getDrawable(h1c0.f105326P));
        } else {
            hierarchy.m112048C(null);
        }
        boolean zEquals = bLiveMultiPkPanelUser.f44408id.equals(User.ID_TEAM_ACCOUNT);
        VText vText = this.f51438g;
        if (zEquals) {
            vText.setText("待邀请");
            VText vText2 = this.f51438g;
            vText2.setTextColor(vText2.getResources().getColor(h1c0.f105377j1));
            this.f51435d.setActualImageResource(i3c0.f111064k6);
            this.f51436e.setVisibility(8);
            this.f51437f.setVisibility(8);
        } else {
            vText.setText(bLiveMultiPkPanelUser.name);
            hxs.m133406s("context_single_room", this.f51435d, bLiveMultiPkPanelUser.avatar);
            this.f51437f.setVisibility((bLiveMultiPkPanelUser.role.equals("spectator") || !bLiveMultiPkPanelUser.picked) ? 0 : 8);
            this.f51436e.setVisibility(bLiveMultiPkPanelUser.picked ? 0 : 8);
            VText vText3 = this.f51438g;
            vText3.setTextColor(vText3.getResources().getColor(h1c0.f105392o1));
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.be10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(Integer.valueOf(i));
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75879i0(this);
    }
}
