package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.upa;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpOneMatchButton extends ExpOperationButton {
    public ExpOneMatchButton(@NonNull Context context) {
        super(context);
        m1401b();
    }

    /* JADX INFO: renamed from: b */
    public void m1401b() {
        this.f981b.setText("超级喜欢");
        this.f981b.setTextColor(Color.parseColor("#E8CA8A"));
        setTextSwitchMode(true);
        setBackgroundResource(x2c0.Wq);
        if (upa.L3()) {
            setTextureImageVisible(true);
            this.f980a.setImageDrawable(getResources().getDrawable(x2c0.ds));
        } else {
            setTextureImageVisible(false);
            this.f980a.setImageDrawable(getResources().getDrawable(x2c0.Vq));
        }
    }

    public ExpOneMatchButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m1401b();
    }

    public ExpOneMatchButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1401b();
    }
}
