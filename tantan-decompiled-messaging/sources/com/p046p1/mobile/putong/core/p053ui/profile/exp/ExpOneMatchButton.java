package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.upa;
import p149l.x2c0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpOneMatchButton extends ExpOperationButton {
    public ExpOneMatchButton(@NonNull Context context) {
        super(context);
        m50953b();
    }

    /* JADX INFO: renamed from: b */
    public void m50953b() {
        this.f33159b.setText("超级喜欢");
        this.f33159b.setTextColor(Color.parseColor("#E8CA8A"));
        setTextSwitchMode(true);
        setBackgroundResource(x2c0.f189868Wq);
        if (upa.m194665L3()) {
            setTextureImageVisible(true);
            this.f33158a.setImageDrawable(getResources().getDrawable(x2c0.f190089ds));
        } else {
            setTextureImageVisible(false);
            this.f33158a.setImageDrawable(getResources().getDrawable(x2c0.f189837Vq));
        }
    }

    public ExpOneMatchButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m50953b();
    }

    public ExpOneMatchButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50953b();
    }
}
