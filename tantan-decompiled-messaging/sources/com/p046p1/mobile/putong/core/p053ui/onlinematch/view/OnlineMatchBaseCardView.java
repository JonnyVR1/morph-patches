package com.p046p1.mobile.putong.core.p053ui.onlinematch.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.core.data.QuickChatCardWrapper;
import p149l.f30;
import p149l.ffx;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OnlineMatchBaseCardView extends CardView {
    public OnlineMatchBaseCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public boolean m50304b() {
        int iM208408w0 = xdl0.m208408w0();
        return iM208408w0 >= 960 && ((int) (((float) iM208408w0) / t100.m186889c().density)) <= 700;
    }

    /* JADX INFO: renamed from: e */
    public void m50305e() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        measure(ffx.m121199b(getWidth()), ffx.m121199b(getHeight()));
        layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo50306f(QuickChatCardWrapper quickChatCardWrapper, f30<Boolean, String> f30Var);

    public OnlineMatchBaseCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnlineMatchBaseCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
