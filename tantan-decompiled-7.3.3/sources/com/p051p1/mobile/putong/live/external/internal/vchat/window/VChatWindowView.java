package com.p051p1.mobile.putong.live.external.internal.vchat.window;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.open.p112im.C14536IM;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.bxk0;
import p153l.izs;

/* JADX INFO: loaded from: classes9.dex */
public class VChatWindowView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f46336d;

    /* JADX INFO: renamed from: e */
    public VImage f46337e;

    public VChatWindowView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m71020h0(View view) {
        bxk0.m106896a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71020h0(this);
    }

    public void setWindowData(String str) {
        izs.m142868s(C14536IM.CHAT_TYPE_VIDEO_CHAT, this.f46336d, str);
    }

    public VChatWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VChatWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
