package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.dbc0;
import p153l.gra;

/* JADX INFO: loaded from: classes4.dex */
public class ExpOneMatchButton extends ExpOperationButton {
    public ExpOneMatchButton(@NonNull Context context) {
        super(context);
        m52136b();
    }

    /* JADX INFO: renamed from: b */
    public void m52136b() {
        this.f34007b.setText("超级喜欢");
        this.f34007b.setTextColor(Color.parseColor("#E8CA8A"));
        setTextSwitchMode(true);
        setBackgroundResource(dbc0.f86324Kr);
        if (gra.m131596L3()) {
            setTextureImageVisible(true);
            this.f34006a.setImageDrawable(getResources().getDrawable(dbc0.f86549Rs));
        } else {
            setTextureImageVisible(false);
            this.f34006a.setImageDrawable(getResources().getDrawable(dbc0.f86292Jr));
        }
    }

    public ExpOneMatchButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m52136b();
    }

    public ExpOneMatchButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52136b();
    }
}
