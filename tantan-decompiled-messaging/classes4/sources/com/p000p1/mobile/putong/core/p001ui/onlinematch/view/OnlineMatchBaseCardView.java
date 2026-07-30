package com.p000p1.mobile.putong.core.p001ui.onlinematch.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p1.mobile.putong.core.data.QuickChatCardWrapper;
import l.f30;
import l.ffx;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class OnlineMatchBaseCardView extends CardView {
    public OnlineMatchBaseCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public boolean m735b() {
        int iW0 = xdl0.w0();
        return iW0 >= 960 && ((int) (((float) iW0) / t100.c().density)) <= 700;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m736e() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        measure(ffx.b(getWidth()), ffx.b(getHeight()));
        layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo737f(QuickChatCardWrapper quickChatCardWrapper, f30<Boolean, String> f30Var);

    public OnlineMatchBaseCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnlineMatchBaseCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
