package com.p051p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p151v.VImage;
import p151v.VText;
import p153l.iam;
import p153l.kou;
import p153l.lou;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatMessageView extends ConstraintLayout implements iam<kou> {

    /* JADX INFO: renamed from: d */
    public VImage f46238d;

    /* JADX INFO: renamed from: e */
    public VText f46239e;

    /* JADX INFO: renamed from: f */
    public VText f46240f;

    public LiveVChatMessageView(@NonNull Context context) {
        super(context);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: h0 */
    public final void m70922h0(View view) {
        lou.m155102a(this, view);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70922h0(this);
        this.f46239e.setText("重要提示");
        this.f46240f.setText("聊天过程中请不要泄漏个人隐私，谨防上当受骗；房间内请遵守平台规定，严禁涉及诈骗涉黄等行为。");
    }

    public LiveVChatMessageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatMessageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(kou kouVar) {
    }
}
