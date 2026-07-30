package com.p046p1.mobile.putong.core.p053ui.messages.redpacket;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ReceiveRecords;
import com.p046p1.mobile.putong.core.data.RedPacket;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLivePkCategory;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.c3c0;
import p149l.e30;
import p149l.jkc0;
import p149l.mkd0;
import p149l.qib0;
import p149l.vlc0;
import p149l.wlc0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class RedPacketUserItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f32277a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f32278b;

    /* JADX INFO: renamed from: c */
    public VText f32279c;

    /* JADX INFO: renamed from: d */
    public VText f32280d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f32281e;

    /* JADX INFO: renamed from: f */
    public VText f32282f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f32283g;

    /* JADX INFO: renamed from: h */
    public VImage f32284h;

    /* JADX INFO: renamed from: i */
    public View f32285i;

    public RedPacketUserItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m49749b(View view) {
        vlc0.m198795a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public PutongAct m49750c() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m49751d(boolean z, User user) {
        if (z) {
            qib0.f154691G.m102356Z0(this.f32277a, "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ.png");
        } else if (NullChecker.m81303a(user)) {
            qib0.f154691G.m102341Q0(this.f32277a, user.m60124fp().profileSmall());
        } else {
            qib0.f154691G.m102354Y0(this.f32277a, c3c0.f78540I0);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m49752e(ReceiveRecords receiveRecords, final boolean z, RedPacket redPacket, jkc0 jkc0Var, long j) {
        qib0.f154691G.m102354Y0(this.f32277a, c3c0.f78540I0);
        jkc0Var.mo67374c(m49750c(), CoreModule.f17545c.f19639e0.m169418Ma(receiveRecords.userId)).subscribe(mkd0.m154955G(new e30() { // from class: l.ulc0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f177042a.m49751d(z, (User) obj);
            }
        }));
        this.f32279c.setText(receiveRecords.name);
        this.f32282f.setText(receiveRecords.amount + " 元");
        this.f32280d.setText(wlc0.m203804a(receiveRecords.createTime, true, redPacket.createTime, j) + "前");
        if (TextUtils.equals(redPacket.splitType, BLivePkCategory.random)) {
            xdl0.m208344M(this.f32283g, receiveRecords.highest);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49749b(this);
    }

    public RedPacketUserItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RedPacketUserItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
