package com.p051p1.mobile.putong.core.p058ui.messages.compliment;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VImage;
import p151v.VText_NoTopPadding;
import p153l.edc0;
import p153l.jyb;
import p153l.ovb0;
import p153l.zr5;

/* JADX INFO: loaded from: classes3.dex */
public class ItemComplimentMessageRight extends ConstraintLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: d */
    public VImage f32629d;

    /* JADX INFO: renamed from: e */
    public AutoVDraweeView f32630e;

    /* JADX INFO: renamed from: f */
    public VText_NoTopPadding f32631f;

    public ItemComplimentMessageRight(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        zr5.m221153b(message, this.f32629d, this.f32630e, this.f32631f, (Act) getContext());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return jyb.m147507f0(new ovb0[0]);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32629d = (VImage) findViewById(edc0.f93304X);
        this.f32630e = (AutoVDraweeView) findViewById(edc0.f93292V);
        this.f32631f = (VText_NoTopPadding) findViewById(edc0.f93298W);
    }

    public ItemComplimentMessageRight(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemComplimentMessageRight(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
