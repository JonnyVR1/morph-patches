package com.p000p1.mobile.putong.core.p001ui.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.CoreModule;
import p003l.y4c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ItemGreetRecalled extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f1832a;

    public ItemGreetRecalled(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m3150a(Message message) {
        this.f1832a.setText(CoreModule.P().i().P5(message));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1832a = findViewById(y4c0.f8650A4);
    }

    public ItemGreetRecalled(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGreetRecalled(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
