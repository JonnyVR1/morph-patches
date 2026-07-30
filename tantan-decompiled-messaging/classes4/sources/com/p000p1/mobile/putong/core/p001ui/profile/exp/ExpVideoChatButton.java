package com.p000p1.mobile.putong.core.p001ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.upa;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ExpVideoChatButton extends ExpOperationButton {
    public ExpVideoChatButton(@NonNull Context context) {
        super(context);
        m1414b();
    }

    /* JADX INFO: renamed from: b */
    public void m1414b() {
        this.f981b.setText("视频闪聊");
        this.f981b.setTextColor(-1);
        setBackgroundResource(x2c0.kn);
        if (upa.L3()) {
            setTextureImageVisible(true);
            this.f980a.setImageDrawable(getResources().getDrawable(x2c0.jn));
        } else {
            setTextureImageVisible(false);
            this.f980a.setImageDrawable(getResources().getDrawable(x2c0.jn));
        }
    }

    public ExpVideoChatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m1414b();
    }

    public ExpVideoChatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1414b();
    }
}
