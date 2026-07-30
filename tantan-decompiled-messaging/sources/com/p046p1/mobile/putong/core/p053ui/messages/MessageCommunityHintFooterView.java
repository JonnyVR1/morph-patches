package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
import p147v.VLinear;
import p147v.VText;
import p149l.bwy;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class MessageCommunityHintFooterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f31592c;

    public MessageCommunityHintFooterView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m48860R(View view) {
        getContext().startActivity(WebViewAct.m80164Z1(getContext(), getContext().getString(R$string.f21002j4), "https://m.tantanapp.com/middle-platform/communityConvention"));
    }

    /* JADX INFO: renamed from: Q */
    public final void m48861Q(View view) {
        bwy.m104255a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48861Q(this);
        xdl0.m208329E0(this.f31592c, new View.OnClickListener() { // from class: l.awy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72085a.m48860R(view);
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
