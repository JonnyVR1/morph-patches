package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import l.bwy;
import l.xdl0;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageCommunityHintFooterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f1483c;

    public MessageCommunityHintFooterView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m1947R(View view) {
        getContext().startActivity(WebViewAct.Z1(getContext(), getContext().getString(R.string.j4), "https://m.tantanapp.com/middle-platform/communityConvention"));
    }

    /* JADX INFO: renamed from: Q */
    public final void m1948Q(View view) {
        bwy.a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1948Q(this);
        xdl0.E0(this.f1483c, new View.OnClickListener() { // from class: l.awy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f2308a.m1947R(view);
            }
        });
    }

    public MessageCommunityHintFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageCommunityHintFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
