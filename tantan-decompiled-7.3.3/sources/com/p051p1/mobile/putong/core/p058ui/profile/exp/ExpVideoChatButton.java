package com.p051p1.mobile.putong.core.p058ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p153l.dbc0;
import p153l.gra;

/* JADX INFO: loaded from: classes4.dex */
public class ExpVideoChatButton extends ExpOperationButton {
    public ExpVideoChatButton(@NonNull Context context) {
        super(context);
        m52149b();
    }

    /* JADX INFO: renamed from: b */
    public void m52149b() {
        this.f34007b.setText("视频闪聊");
        this.f34007b.setTextColor(-1);
        setBackgroundResource(dbc0.f86768Yn);
        if (gra.m131596L3()) {
            setTextureImageVisible(true);
            this.f34006a.setImageDrawable(getResources().getDrawable(dbc0.f86736Xn));
        } else {
            setTextureImageVisible(false);
            this.f34006a.setImageDrawable(getResources().getDrawable(dbc0.f86736Xn));
        }
    }

    public ExpVideoChatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m52149b();
    }

    public ExpVideoChatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m52149b();
    }
}
