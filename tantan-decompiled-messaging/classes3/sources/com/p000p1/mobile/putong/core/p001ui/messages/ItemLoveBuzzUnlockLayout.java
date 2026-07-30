package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import l.rw6;
import l.z5q;
import p028v.VDraweeView;
import p028v.VImage;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemLoveBuzzUnlockLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f1002a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1003b;

    /* JADX INFO: renamed from: c */
    public VText f1004c;

    /* JADX INFO: renamed from: d */
    public VText f1005d;

    public ItemLoveBuzzUnlockLayout(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m1377a(View view) {
        z5q.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m1378b(User user, Message message) {
        CoreModule.l.b().xp(this.f1003b, rw6.a(user).profileSmall(), 0);
        this.f1004c.setText(String.format(getContext().getString(R.string.x3), "50%"));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1377a(this);
    }

    public ItemLoveBuzzUnlockLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemLoveBuzzUnlockLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
