package com.p051p1.mobile.putong.core.p058ui.messages.compliment;

import android.content.Context;
import android.util.AttributeSet;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import java.util.List;
import p151v.AutoVDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText_NoTopPadding;
import p153l.edc0;
import p153l.jyb;
import p153l.ovb0;
import p153l.zr5;

/* JADX INFO: loaded from: classes3.dex */
public class ItemComplimentMessageLeft extends VFrame implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public VImage f32626a;

    /* JADX INFO: renamed from: b */
    public AutoVDraweeView f32627b;

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f32628c;

    public ItemComplimentMessageLeft(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        zr5.m221153b(message, this.f32626a, this.f32627b, this.f32628c, (Act) getContext());
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
        this.f32626a = (VImage) findViewById(edc0.f93304X);
        this.f32627b = (AutoVDraweeView) findViewById(edc0.f93292V);
        this.f32628c = (VText_NoTopPadding) findViewById(edc0.f93298W);
    }

    public ItemComplimentMessageLeft(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemComplimentMessageLeft(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
