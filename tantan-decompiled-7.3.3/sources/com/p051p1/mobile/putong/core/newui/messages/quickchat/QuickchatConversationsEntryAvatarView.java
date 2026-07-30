package com.p051p1.mobile.putong.core.newui.messages.quickchat;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.adc0;
import p153l.bnl0;
import p153l.kcg0;
import p153l.psd0;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class QuickchatConversationsEntryAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final List<String> f26628a;

    /* JADX INFO: renamed from: b */
    public final List<QuickchatEntryAvatarBorderView> f26629b;

    /* JADX INFO: renamed from: c */
    public kcg0 f26630c;

    /* JADX INFO: renamed from: d */
    public final float[] f26631d;

    /* JADX INFO: renamed from: e */
    public Animator f26632e;

    public QuickchatConversationsEntryAvatarView(@NonNull Context context) {
        super(context);
        this.f26628a = new ArrayList();
        this.f26629b = new ArrayList();
        this.f26631d = new float[]{1.0f, 1.0f, 0.0f};
    }

    /* JADX INFO: renamed from: a */
    public void m43510a() {
        bnl0.m105524M(this, false);
        psd0.m173633z(this.f26630c);
        if (NullChecker.m82486a(this.f26632e)) {
            this.f26632e.removeAllListeners();
            this.f26632e.cancel();
        }
        this.f26629b.get(0).setTranslationX(0.0f);
        this.f26629b.get(0).setTranslationY(0.0f);
        this.f26629b.get(0).setAlpha(this.f26631d[0]);
        QuickchatEntryAvatarBorderView quickchatEntryAvatarBorderView = this.f26629b.get(1);
        int i = qa00.f156323j;
        quickchatEntryAvatarBorderView.setTranslationX(i);
        this.f26629b.get(1).setTranslationY(-i);
        this.f26629b.get(1).setAlpha(this.f26631d[1]);
        QuickchatEntryAvatarBorderView quickchatEntryAvatarBorderView2 = this.f26629b.get(2);
        int i2 = qa00.f156326m;
        quickchatEntryAvatarBorderView2.setTranslationX(i2);
        this.f26629b.get(2).setTranslationY(-i2);
        this.f26629b.get(2).setAlpha(this.f26631d[2]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f26630c);
        if (NullChecker.m82486a(this.f26632e)) {
            this.f26632e.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f26629b.clear();
        this.f26629b.add((QuickchatEntryAvatarBorderView) findViewById(adc0.f70228Z1));
        this.f26629b.add((QuickchatEntryAvatarBorderView) findViewById(adc0.f70245a2));
        this.f26629b.add((QuickchatEntryAvatarBorderView) findViewById(adc0.f70262b2));
        m43510a();
    }

    public QuickchatConversationsEntryAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26628a = new ArrayList();
        this.f26629b = new ArrayList();
        this.f26631d = new float[]{1.0f, 1.0f, 0.0f};
    }

    public QuickchatConversationsEntryAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26628a = new ArrayList();
        this.f26629b = new ArrayList();
        this.f26631d = new float[]{1.0f, 1.0f, 0.0f};
    }
}
