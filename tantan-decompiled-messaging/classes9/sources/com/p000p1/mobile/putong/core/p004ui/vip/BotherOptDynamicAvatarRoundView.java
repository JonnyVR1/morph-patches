package com.p000p1.mobile.putong.core.p004ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.ia3;
import l.o7r;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class BotherOptDynamicAvatarRoundView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ViewStub f6729a;

    /* JADX INFO: renamed from: b */
    public ViewStub f6730b;

    /* JADX INFO: renamed from: c */
    public ViewStub f6731c;

    public BotherOptDynamicAvatarRoundView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m9656r();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: r */
    private void m9656r() {
        addView(m9657p(o7r.a(getContext()), null));
    }

    /* JADX INFO: renamed from: p */
    public View m9657p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ia3.b(this, layoutInflater, viewGroup);
    }

    public BotherOptDynamicAvatarRoundView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BotherOptDynamicAvatarRoundView(@NonNull Context context) {
        this(context, null);
    }
}
