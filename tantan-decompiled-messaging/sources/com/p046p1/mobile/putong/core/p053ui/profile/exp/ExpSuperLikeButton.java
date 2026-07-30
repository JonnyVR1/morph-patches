package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.upa;
import p149l.x2c0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpSuperLikeButton extends ExpOperationButton {
    public ExpSuperLikeButton(@NonNull Context context) {
        super(context);
        m50956b();
    }

    /* JADX INFO: renamed from: b */
    public void m50956b() {
        this.f33159b.setText("超级喜欢");
        this.f33159b.setTextColor(-1);
        setStyle("default");
    }

    public void setStyle(String str) {
        if ("oDiamond".equals(str)) {
            setBackgroundResource(x2c0.f189658Q2);
            this.f33158a.setImageResource(x2c0.f189425Ih);
            this.f33159b.setTextColor(Color.parseColor("#E8CA8A"));
        } else if ("default".equals(str)) {
            if (upa.m194665L3()) {
                setBackgroundResource(x2c0.f189287E5);
                this.f33158a.setImageDrawable(getResources().getDrawable(x2c0.f190185gs));
            } else {
                setBackgroundResource(x2c0.f189899Xq);
                this.f33158a.setImageDrawable(getResources().getDrawable(x2c0.f189394Hh));
            }
        }
    }

    public ExpSuperLikeButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m50956b();
    }

    public ExpSuperLikeButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50956b();
    }
}
