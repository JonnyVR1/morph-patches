package com.p046p1.mobile.putong.core.p053ui.vip;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p147v.VFrame;
import p149l.ia3;
import p149l.o7r;

/* JADX INFO: loaded from: classes9.dex */
public class BotherOptDynamicAvatarRoundView extends VFrame {

    /* JADX INFO: renamed from: a */
    public ViewStub f36948a;

    /* JADX INFO: renamed from: b */
    public ViewStub f36949b;

    /* JADX INFO: renamed from: c */
    public ViewStub f36950c;

    public BotherOptDynamicAvatarRoundView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m56223r();
    }

    /* JADX INFO: renamed from: r */
    private void m56223r() {
        addView(m56224p(o7r.m163037a(getContext()), null));
    }

    /* JADX INFO: renamed from: p */
    public View m56224p(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ia3.m135125b(this, layoutInflater, viewGroup);
    }

    public BotherOptDynamicAvatarRoundView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BotherOptDynamicAvatarRoundView(@NonNull Context context) {
        this(context, null);
    }
}
