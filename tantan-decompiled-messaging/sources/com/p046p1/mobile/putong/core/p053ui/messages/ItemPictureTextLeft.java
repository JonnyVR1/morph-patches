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
import p149l.acq;
import p149l.knb0;
import p149l.t100;
import p149l.ubq;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPictureTextLeft extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemPictureTextLeft f31365a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f31366b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f31367c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f31368d;

    /* JADX INFO: renamed from: e */
    public VText f31369e;

    /* JADX INFO: renamed from: f */
    public VText f31370f;

    /* JADX INFO: renamed from: g */
    public VText f31371g;

    /* JADX INFO: renamed from: h */
    public final ubq f31372h;

    public ItemPictureTextLeft(Context context) {
        super(context);
        this.f31372h = new ubq();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f31372h.mo192930x(message);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return this.f31372h.m192927u();
    }

    /* JADX INFO: renamed from: a */
    public final void m48574a(View view) {
        acq.m95832a(this, view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
        this.f31372h.m192922n(i, z, itemMessageBase);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f31372h.mo192924r();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48574a(this);
        this.f31366b.getHierarchy().m112053H(RoundingParams.m8248b(t100.m186890d(8.0f), t100.m186890d(8.0f), 0.0f, 0.0f).m8266t(-1));
        this.f31372h.m192920l(this.f31365a, this.f31366b, this.f31367c, this.f31369e, this.f31370f, this.f31371g, this.f31368d);
    }

    public ItemPictureTextLeft(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31372h = new ubq();
    }

    public ItemPictureTextLeft(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31372h = new ubq();
    }

    public ItemPictureTextLeft(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f31372h = new ubq();
    }
}
