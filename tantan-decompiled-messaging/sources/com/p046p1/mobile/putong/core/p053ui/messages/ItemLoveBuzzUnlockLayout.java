package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.User;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VText;
import p149l.rw6;
import p149l.z5q;

/* JADX INFO: loaded from: classes3.dex */
public class ItemLoveBuzzUnlockLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f31111a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31112b;

    /* JADX INFO: renamed from: c */
    public VText f31113c;

    /* JADX INFO: renamed from: d */
    public VText f31114d;

    public ItemLoveBuzzUnlockLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m48293a(View view) {
        z5q.m217368a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m48294b(User user, Message message) {
        CoreModule.f17554l.m94652b().mo35132xp(this.f31112b, rw6.m181385a(user).profileSmall(), 0);
        this.f31113c.setText(String.format(getContext().getString(R$string.f21120x3), "50%"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48293a(this);
    }

    public ItemLoveBuzzUnlockLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLoveBuzzUnlockLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
