package com.p046p1.mobile.putong.live.external.internal.vchat.window;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.tencent.open.p107im.C14373IM;
import p147v.VDraweeView;
import p147v.VImage;
import p149l.hxs;
import p149l.vnk0;

/* JADX INFO: loaded from: classes13.dex */
public class VChatWindowView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VDraweeView f45488d;

    /* JADX INFO: renamed from: e */
    public VImage f45489e;

    public VChatWindowView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m69837h0(View view) {
        vnk0.m199032a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69837h0(this);
    }

    public void setWindowData(String str) {
        hxs.m133406s(C14373IM.CHAT_TYPE_VIDEO_CHAT, this.f45488d, str);
    }

    public VChatWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VChatWindowView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
