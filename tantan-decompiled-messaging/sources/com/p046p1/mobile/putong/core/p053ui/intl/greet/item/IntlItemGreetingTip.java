package com.p046p1.mobile.putong.core.p053ui.intl.greet.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase;
import java.util.List;
import p147v.VFrame;
import p147v.VText;
import p149l.knb0;

/* JADX INFO: loaded from: classes10.dex */
public class IntlItemGreetingTip extends VFrame implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public IntlItemGreetingTip f29776a;

    /* JADX INFO: renamed from: b */
    public VText f29777b;

    /* JADX INFO: renamed from: c */
    public Message f29778c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intl.greet.item.IntlItemGreetingTip$a */
    public static class C8377a {
        /* JADX INFO: renamed from: b */
        public static void m46160b(IntlItemGreetingTip intlItemGreetingTip, View view) {
            intlItemGreetingTip.f29776a = (IntlItemGreetingTip) view;
            intlItemGreetingTip.f29777b = (VText) ((ViewGroup) view).getChildAt(0);
        }
    }

    public IntlItemGreetingTip(Context context) {
        super(context);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        this.f29778c = message;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46158u(this);
    }

    /* JADX INFO: renamed from: u */
    public final void m46158u(View view) {
        C8377a.m46160b(this, view);
    }

    public IntlItemGreetingTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlItemGreetingTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
