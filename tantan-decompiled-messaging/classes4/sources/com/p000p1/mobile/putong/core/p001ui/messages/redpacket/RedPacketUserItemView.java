package com.p000p1.mobile.putong.core.p001ui.messages.redpacket;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ReceiveRecords;
import com.p1.mobile.putong.core.data.RedPacket;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.c3c0;
import l.e30;
import l.mkd0;
import l.qib0;
import l.vlc0;
import l.xdl0;
import p002l.jkc0;
import p002l.wlc0;
import v.VDraweeView;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class RedPacketUserItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f99a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f100b;

    /* JADX INFO: renamed from: c */
    public VText f101c;

    /* JADX INFO: renamed from: d */
    public VText f102d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f103e;

    /* JADX INFO: renamed from: f */
    public VText f104f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f105g;

    /* JADX INFO: renamed from: h */
    public VImage f106h;

    /* JADX INFO: renamed from: i */
    public View f107i;

    public RedPacketUserItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m165b(View view) {
        vlc0.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public PutongAct m166c() {
        return getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m167d(boolean z, User user) {
        if (z) {
            qib0.G.Z0(this.f99a, "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ.png");
        } else if (NullChecker.a(user)) {
            qib0.G.Q0(this.f99a, user.fp().profileSmall());
        } else {
            qib0.G.Y0(this.f99a, c3c0.I0);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m168e(ReceiveRecords receiveRecords, final boolean z, RedPacket redPacket, jkc0 jkc0Var, long j) {
        qib0.G.Y0(this.f99a, c3c0.I0);
        jkc0Var.c(m166c(), CoreModule.c.e0.Ma(receiveRecords.userId)).subscribe(mkd0.G(new e30() { // from class: l.ulc0
            public final void call(Object obj) {
                this.f20697a.m167d(z, (User) obj);
            }
        }));
        this.f101c.setText(receiveRecords.name);
        this.f104f.setText(receiveRecords.amount + " 元");
        this.f102d.setText(wlc0.m24690a(receiveRecords.createTime, true, redPacket.createTime, j) + "前");
        if (TextUtils.equals(redPacket.splitType, "random")) {
            xdl0.M(this.f105g, receiveRecords.highest);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m165b(this);
    }

    public RedPacketUserItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RedPacketUserItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
