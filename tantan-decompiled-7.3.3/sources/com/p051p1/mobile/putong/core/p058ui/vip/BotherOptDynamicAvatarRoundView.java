package com.p051p1.mobile.putong.core.p058ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VFrame;
import p153l.p9r;
import p153l.xa3;

/* JADX INFO: loaded from: classes12.dex */
public class BotherOptDynamicAvatarRoundView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ViewStub f37796a;

    /* JADX INFO: renamed from: b */
    public ViewStub f37797b;

    /* JADX INFO: renamed from: c */
    public ViewStub f37798c;

    public BotherOptDynamicAvatarRoundView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m57406r();
    }

    /* JADX INFO: renamed from: r */
    private void m57406r() {
        addView(m57407p(p9r.m171370a(getContext()), null));
    }

    /* JADX INFO: renamed from: p */
    public View m57407p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xa3.m209833b(this, layoutInflater, viewGroup);
    }

    public BotherOptDynamicAvatarRoundView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BotherOptDynamicAvatarRoundView(@NonNull Context context) {
        this(context, null);
    }
}
