package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.upa;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpSuperLikeButton extends ExpOperationButton {
    public ExpSuperLikeButton(@NonNull Context context) {
        super(context);
        m1404b();
    }

    /* JADX INFO: renamed from: b */
    public void m1404b() {
        this.f981b.setText("超级喜欢");
        this.f981b.setTextColor(-1);
        setStyle("default");
    }

    public void setStyle(String str) {
        if ("oDiamond".equals(str)) {
            setBackgroundResource(x2c0.Q2);
            this.f980a.setImageResource(x2c0.Ih);
            this.f981b.setTextColor(Color.parseColor("#E8CA8A"));
        } else if ("default".equals(str)) {
            if (upa.L3()) {
                setBackgroundResource(x2c0.E5);
                this.f980a.setImageDrawable(getResources().getDrawable(x2c0.gs));
            } else {
                setBackgroundResource(x2c0.Xq);
                this.f980a.setImageDrawable(getResources().getDrawable(x2c0.Hh));
            }
        }
    }

    public ExpSuperLikeButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m1404b();
    }

    public ExpSuperLikeButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1404b();
    }
}
