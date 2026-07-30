package com.p046p1.mobile.putong.live.external.internal.vchat.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import p147v.VImage;
import p147v.VText;
import p149l.jmu;
import p149l.kmu;
import p149l.s7m;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatMessageView extends ConstraintLayout implements s7m<jmu> {

    /* JADX INFO: renamed from: d */
    public VImage f45390d;

    /* JADX INFO: renamed from: e */
    public VText f45391e;

    /* JADX INFO: renamed from: f */
    public VText f45392f;

    public LiveVChatMessageView(@NonNull Context context) {
        super(context);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: h0 */
    public final void m69739h0(View view) {
        kmu.m146554a(this, view);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69739h0(this);
        this.f45391e.setText("重要提示");
        this.f45392f.setText("聊天过程中请不要泄漏个人隐私，谨防上当受骗；房间内请遵守平台规定，严禁涉及诈骗涉黄等行为。");
    }

    public LiveVChatMessageView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public LiveVChatMessageView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: i0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(jmu jmuVar) {
    }
}
