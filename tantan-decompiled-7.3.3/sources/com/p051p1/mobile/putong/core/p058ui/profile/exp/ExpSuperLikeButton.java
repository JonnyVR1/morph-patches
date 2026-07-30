package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.dbc0;
import p153l.gra;

/* JADX INFO: loaded from: classes4.dex */
public class ExpSuperLikeButton extends ExpOperationButton {
    public ExpSuperLikeButton(@NonNull Context context) {
        super(context);
        m52139b();
    }

    /* JADX INFO: renamed from: b */
    public void m52139b() {
        this.f34007b.setText("超级喜欢");
        this.f34007b.setTextColor(-1);
        setStyle("default");
    }

    public void setStyle(String str) {
        if ("oDiamond".equals(str)) {
            setBackgroundResource(dbc0.f86523R2);
            this.f34006a.setImageResource(dbc0.f87548wi);
            this.f34007b.setTextColor(Color.parseColor("#E8CA8A"));
        } else if ("default".equals(str)) {
            if (gra.m131596L3()) {
                setBackgroundResource(dbc0.f86142F5);
                this.f34006a.setImageDrawable(getResources().getDrawable(dbc0.f86645Us));
            } else {
                setBackgroundResource(dbc0.f86356Lr);
                this.f34006a.setImageDrawable(getResources().getDrawable(dbc0.f87516vi));
            }
        }
    }

    public ExpSuperLikeButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m52139b();
    }

    public ExpSuperLikeButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52139b();
    }
}
