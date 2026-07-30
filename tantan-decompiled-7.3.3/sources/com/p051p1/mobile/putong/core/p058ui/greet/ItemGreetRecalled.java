package com.p051p1.mobile.putong.core.p058ui.greet;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import p151v.VText;
import p153l.edc0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemGreetRecalled extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f30286a;

    public ItemGreetRecalled(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public void m46992a(Message message) {
        this.f30286a.setText(CoreModule.m30933P().m143412i().mo180378P5(message));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f30286a = (VText) findViewById(edc0.f93168A4);
    }

    public ItemGreetRecalled(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemGreetRecalled(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
