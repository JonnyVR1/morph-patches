package com.p046p1.mobile.putong.live.livingroom.virtual.roomInfo.view;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceVirtualRoomLevelRight;
import p147v.VDraweeView;
import p149l.hxs;
import p149l.xrl0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualLevelRightItem extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VirtualLevelRightItem f52728d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f52729e;

    /* JADX INFO: renamed from: f */
    public TextView f52730f;

    public VirtualLevelRightItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m77479h0(View view) {
        xrl0.m210701a(this, view);
    }

    /* JADX INFO: renamed from: i0 */
    public void m77480i0(BLiveVoiceVirtualRoomLevelRight bLiveVoiceVirtualRoomLevelRight) {
        this.f52730f.setText(bLiveVoiceVirtualRoomLevelRight.title);
        hxs.m133406s("context_livingAct", this.f52729e, bLiveVoiceVirtualRoomLevelRight.icon);
        boolean z = bLiveVoiceVirtualRoomLevelRight.lightUp;
        TextView textView = this.f52730f;
        if (z) {
            textView.setTextColor(Color.parseColor("#CCFFFFFF"));
        } else {
            textView.setTextColor(Color.parseColor("#33FFFFFF"));
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77479h0(this);
    }

    public VirtualLevelRightItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualLevelRightItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
