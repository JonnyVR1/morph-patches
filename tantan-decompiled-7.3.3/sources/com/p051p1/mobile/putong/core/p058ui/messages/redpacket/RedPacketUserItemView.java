package com.p051p1.mobile.putong.core.p058ui.messages.redpacket;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ReceiveRecords;
import com.p051p1.mobile.putong.core.data.RedPacket;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLivePkCategory;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.cuc0;
import p153l.duc0;
import p153l.ibc0;
import p153l.psd0;
import p153l.qsc0;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class RedPacketUserItemView extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f33125a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f33126b;

    /* JADX INFO: renamed from: c */
    public VText f33127c;

    /* JADX INFO: renamed from: d */
    public VText f33128d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f33129e;

    /* JADX INFO: renamed from: f */
    public VText f33130f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f33131g;

    /* JADX INFO: renamed from: h */
    public VImage f33132h;

    /* JADX INFO: renamed from: i */
    public View f33133i;

    public RedPacketUserItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m50932b(View view) {
        cuc0.m112665a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public PutongAct m50933c() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m50934d(boolean z, User user) {
        if (z) {
            uqb0.f180374G.m127140Z0(this.f33125a, "https://auto.tancdn.com/v1/images/eyJpZCI6IlVLWVo3Q0lEWk9LVFVHVVJHNktEM1pIVzNEVFJVRiIsInciOjcyMCwiaCI6NzIwLCJkIjowLCJtdCI6ImltYWdlL2pwZWcifQ.png");
        } else if (NullChecker.m82486a(user)) {
            uqb0.f180374G.m127125Q0(this.f33125a, user.m61308fp().profileSmall());
        } else {
            uqb0.f180374G.m127138Y0(this.f33125a, ibc0.f113815I0);
        }
    }

    /* JADX INFO: renamed from: e */
    public void m50935e(ReceiveRecords receiveRecords, final boolean z, RedPacket redPacket, qsc0 qsc0Var, long j) {
        uqb0.f180374G.m127138Y0(this.f33125a, ibc0.f113815I0);
        qsc0Var.mo68557c(m50933c(), CoreModule.f18264c.f20381e0.m116491Ma(receiveRecords.userId)).subscribe(psd0.m173596G(new y20() { // from class: l.buc0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78480a.m50934d(z, (User) obj);
            }
        }));
        this.f33127c.setText(receiveRecords.name);
        this.f33130f.setText(receiveRecords.amount + " 元");
        this.f33128d.setText(duc0.m118127a(receiveRecords.createTime, true, redPacket.createTime, j) + "前");
        if (TextUtils.equals(redPacket.splitType, BLivePkCategory.random)) {
            bnl0.m105524M(this.f33131g, receiveRecords.highest);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50932b(this);
    }

    public RedPacketUserItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public RedPacketUserItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
