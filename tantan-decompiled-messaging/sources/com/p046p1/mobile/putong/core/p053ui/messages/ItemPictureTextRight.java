package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.putong.core.data.Message;
import java.util.List;
import p147v.AutoVDraweeView;
import p147v.VText;
import p149l.bcq;
import p149l.knb0;
import p149l.t100;
import p149l.ubq;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPictureTextRight extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemPictureTextRight f31373a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f31374b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f31375c;

    /* JADX INFO: renamed from: d */
    public VText f31376d;

    /* JADX INFO: renamed from: e */
    public VText f31377e;

    /* JADX INFO: renamed from: f */
    public VText f31378f;

    /* JADX INFO: renamed from: g */
    public final ubq f31379g;

    public ItemPictureTextRight(Context context) {
        super(context);
        this.f31379g = new ubq();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f31379g.mo192930x(message);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return this.f31379g.m192927u();
    }

    /* JADX INFO: renamed from: a */
    public final void m48575a(View view) {
        bcq.m101119a(this, view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f31379g.m192922n(i, z, itemMessageBase);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48575a(this);
        this.f31374b.getHierarchy().m112053H(RoundingParams.m8248b(t100.m186890d(8.0f), t100.m186890d(8.0f), 0.0f, 0.0f).m8266t(-1));
        this.f31379g.m192920l(this.f31373a, this.f31374b, null, this.f31376d, this.f31377e, this.f31378f, this.f31375c);
    }

    public ItemPictureTextRight(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31379g = new ubq();
    }

    public ItemPictureTextRight(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31379g = new ubq();
    }

    public ItemPictureTextRight(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f31379g = new ubq();
    }
}
