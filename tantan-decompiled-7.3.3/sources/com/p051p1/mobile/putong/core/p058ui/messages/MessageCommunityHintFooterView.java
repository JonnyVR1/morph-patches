package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.y4z;

/* JADX INFO: loaded from: classes3.dex */
public class MessageCommunityHintFooterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText f32440c;

    public MessageCommunityHintFooterView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: R */
    public /* synthetic */ void m50043R(View view) {
        getContext().startActivity(WebViewAct.m81347a2(getContext(), getContext().getString(R$string.f21744j4), "https://m.tantanapp.com/middle-platform/communityConvention"));
    }

    /* JADX INFO: renamed from: Q */
    public final void m50044Q(View view) {
        y4z.m214281a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50044Q(this);
        bnl0.m105509E0(this.f32440c, new View.OnClickListener() { // from class: l.x4z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192445a.m50043R(view);
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
