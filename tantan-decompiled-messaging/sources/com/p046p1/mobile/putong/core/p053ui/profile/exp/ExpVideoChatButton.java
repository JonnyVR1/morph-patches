package com.p046p1.mobile.putong.core.p053ui.profile.exp;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.upa;
import p149l.x2c0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpVideoChatButton extends ExpOperationButton {
    public ExpVideoChatButton(@NonNull Context context) {
        super(context);
        m50966b();
    }

    /* JADX INFO: renamed from: b */
    public void m50966b() {
        this.f33159b.setText("视频闪聊");
        this.f33159b.setTextColor(-1);
        setBackgroundResource(x2c0.f190306kn);
        if (upa.m194665L3()) {
            setTextureImageVisible(true);
            this.f33158a.setImageDrawable(getResources().getDrawable(x2c0.f190274jn));
        } else {
            setTextureImageVisible(false);
            this.f33158a.setImageDrawable(getResources().getDrawable(x2c0.f190274jn));
        }
    }

    public ExpVideoChatButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m50966b();
    }

    public ExpVideoChatButton(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m50966b();
    }
}
