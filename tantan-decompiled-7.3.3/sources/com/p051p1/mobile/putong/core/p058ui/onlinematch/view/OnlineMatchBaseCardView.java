package com.p051p1.mobile.putong.core.p058ui.onlinematch.view;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.core.data.QuickChatCardWrapper;
import p153l.bnl0;
import p153l.dox;
import p153l.qa00;
import p153l.z20;

/* JADX INFO: loaded from: classes4.dex */
public abstract class OnlineMatchBaseCardView extends CardView {
    public OnlineMatchBaseCardView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public boolean m51487b() {
        int iM105588w0 = bnl0.m105588w0();
        return iM105588w0 >= 960 && ((int) (((float) iM105588w0) / qa00.m175858c().density)) <= 700;
    }

    /* JADX INFO: renamed from: e */
    public void m51488e() {
        if (getWidth() <= 0 || getHeight() <= 0) {
            return;
        }
        measure(dox.m117364b(getWidth()), dox.m117364b(getHeight()));
        layout(getLeft(), getTop(), getLeft() + getWidth(), getTop() + getHeight());
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo51489f(QuickChatCardWrapper quickChatCardWrapper, z20<Boolean, String> z20Var);

    public OnlineMatchBaseCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public OnlineMatchBaseCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
