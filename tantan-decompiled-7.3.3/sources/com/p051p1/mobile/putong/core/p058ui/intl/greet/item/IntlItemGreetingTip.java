package com.p051p1.mobile.putong.core.p058ui.intl.greet.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemMessageBase;
import java.util.List;
import p151v.VFrame;
import p151v.VText;
import p153l.ovb0;

/* JADX INFO: loaded from: classes3.dex */
public class IntlItemGreetingTip extends VFrame implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public IntlItemGreetingTip f30624a;

    /* JADX INFO: renamed from: b */
    public VText f30625b;

    /* JADX INFO: renamed from: c */
    public Message f30626c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intl.greet.item.IntlItemGreetingTip$a */
    public static class C8540a {
        /* JADX INFO: renamed from: b */
        public static void m47343b(IntlItemGreetingTip intlItemGreetingTip, View view) {
            intlItemGreetingTip.f30624a = (IntlItemGreetingTip) view;
            intlItemGreetingTip.f30625b = (VText) ((ViewGroup) view).getChildAt(0);
        }
    }

    public IntlItemGreetingTip(Context context) {
        super(context);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
        this.f30626c = message;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47341u(this);
    }

    /* JADX INFO: renamed from: u */
    public final void m47341u(View view) {
        C8540a.m47343b(this, view);
    }

    public IntlItemGreetingTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlItemGreetingTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
