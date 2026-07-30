package com.p046p1.mobile.putong.core.p053ui.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import p147v.VText;
import p149l.y4c0;

/* JADX INFO: loaded from: classes10.dex */
public class ItemGreetRecalled extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f29438a;

    public ItemGreetRecalled(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m45809a(Message message) {
        this.f29438a.setText(CoreModule.m29935P().m94658i().mo158286P5(message));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f29438a = (VText) findViewById(y4c0.f195933A4);
    }

    public ItemGreetRecalled(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGreetRecalled(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
