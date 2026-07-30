package com.p051p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomLevelRight;
import p151v.VDraweeView;
import p153l.b1m0;
import p153l.izs;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualLevelRightItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VirtualLevelRightItem f53576d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f53577e;

    /* JADX INFO: renamed from: f */
    public TextView f53578f;

    public VirtualLevelRightItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m78662h0(View view) {
        b1m0.m101484a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m78663i0(BLiveVoiceVirtualRoomLevelRight bLiveVoiceVirtualRoomLevelRight) {
        this.f53578f.setText(bLiveVoiceVirtualRoomLevelRight.title);
        izs.m142868s("context_livingAct", this.f53577e, bLiveVoiceVirtualRoomLevelRight.icon);
        boolean z = bLiveVoiceVirtualRoomLevelRight.lightUp;
        TextView textView = this.f53578f;
        if (z) {
            textView.setTextColor(Color.parseColor("#CCFFFFFF"));
        } else {
            textView.setTextColor(Color.parseColor("#33FFFFFF"));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78662h0(this);
    }

    public VirtualLevelRightItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLevelRightItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
