package com.p000p1.mobile.putong.core.p001ui.intl.greet.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.ui.messages.ItemMessageBase;
import com.p1.mobile.putong.core.ui.messages.a;
import java.util.List;
import l.knb0;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class IntlItemGreetingTip extends VFrame implements a {

    /* JADX INFO: renamed from: a */
    public IntlItemGreetingTip f2170a;

    /* JADX INFO: renamed from: b */
    public VText f2171b;

    /* JADX INFO: renamed from: c */
    public Message f2172c;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.intl.greet.item.IntlItemGreetingTip$a */
    public static class C3152a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: b */
        public static void m3528b(IntlItemGreetingTip intlItemGreetingTip, View view) {
            intlItemGreetingTip.f2170a = (IntlItemGreetingTip) view;
            intlItemGreetingTip.f2171b = ((ViewGroup) view).getChildAt(0);
        }
    }

    public IntlItemGreetingTip(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: A */
    public void m3523A(Message message) {
        this.f2172c = message;
    }

    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> m3524J() {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public void m3525m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m3526u(this);
    }

    /* JADX INFO: renamed from: u */
    public final void m3526u(View view) {
        C3152a.m3528b(this, view);
    }

    public IntlItemGreetingTip(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlItemGreetingTip(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
