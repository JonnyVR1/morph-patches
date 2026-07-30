package com.p046p1.mobile.putong.core.p053ui.messages.compliment;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.VImage;
import p147v.VText_NoTopPadding;
import p149l.knb0;
import p149l.vq5;
import p149l.vwb;
import p149l.y4c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemComplimentMessageRight extends ConstraintLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: d */
    public VImage f31781d;

    /* JADX INFO: renamed from: e */
    public AutoVDraweeView f31782e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f31783f;

    public ItemComplimentMessageRight(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        vq5.m199450b(message, this.f31781d, this.f31782e, this.f31783f, (Act) getContext());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return vwb.m200324f0(new knb0[0]);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31781d = (VImage) findViewById(y4c0.f196069X);
        this.f31782e = (AutoVDraweeView) findViewById(y4c0.f196057V);
        this.f31783f = (VText_NoTopPadding) findViewById(y4c0.f196063W);
    }

    public ItemComplimentMessageRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemComplimentMessageRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
