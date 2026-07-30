package com.p046p1.mobile.putong.live.livingroom.virtual.userCard.p063cp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.putong.live.base.data.BLiveSpecialFriendRelation;
import p147v.VDraweeView;
import p147v.VText;
import p149l.e30;
import p149l.hxs;
import p149l.i3c0;
import p149l.kvc0;
import p149l.mep0;
import p149l.t100;
import p149l.xdl0;
import p149l.y3m0;

/* JADX INFO: loaded from: classes5.dex */
public class VirtualVoiceSpFriendItemView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f52787d;

    /* JADX INFO: renamed from: e */
    public View f52788e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f52789f;

    /* JADX INFO: renamed from: g */
    public VText f52790g;

    public VirtualVoiceSpFriendItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m77557i0(View view) {
        y3m0.m212846a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m77558j0(final BLiveSpecialFriendRelation bLiveSpecialFriendRelation, final e30<BLiveSpecialFriendRelation> e30Var) {
        if (bLiveSpecialFriendRelation == null) {
            return;
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.x3m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(bLiveSpecialFriendRelation);
            }
        });
        mep0.m154302d1(this.f52790g, t100.f167256e);
        this.f52790g.setBackgroundColor(kvc0.m147359h(bLiveSpecialFriendRelation.bgColor, -7829368));
        if (!bLiveSpecialFriendRelation.isUnLocked) {
            xdl0.m208344M(this.f52788e, false);
            xdl0.m208344M(this.f52789f, false);
            this.f52790g.setText(bLiveSpecialFriendRelation.name);
            hxs.m133411x(this.f52787d, i3c0.f110880U8);
            return;
        }
        VDraweeView vDraweeView = this.f52787d;
        String str = bLiveSpecialFriendRelation.icon;
        int i = t100.f167229D;
        hxs.m133408u("context_livingAct", vDraweeView, str, i, i);
        xdl0.m208344M(this.f52788e, true);
        xdl0.m208344M(this.f52789f, true);
        VDraweeView vDraweeView2 = this.f52789f;
        String str2 = bLiveSpecialFriendRelation.otherUserAvatar;
        int i2 = t100.f167266o;
        hxs.m133408u("context_livingAct", vDraweeView2, str2, i2, i2);
        this.f52790g.setText("Lv." + bLiveSpecialFriendRelation.level + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bLiveSpecialFriendRelation.name);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m77557i0(this);
    }

    public VirtualVoiceSpFriendItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VirtualVoiceSpFriendItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
