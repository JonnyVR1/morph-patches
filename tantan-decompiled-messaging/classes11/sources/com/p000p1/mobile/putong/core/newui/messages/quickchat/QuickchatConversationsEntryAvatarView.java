package com.p000p1.mobile.putong.core.newui.messages.quickchat;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c4g0;
import l.mkd0;
import l.t100;
import l.u4c0;
import l.xdl0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class QuickchatConversationsEntryAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final List<String> f4664a;

    /* JADX INFO: renamed from: b */
    public final List<QuickchatEntryAvatarBorderView> f4665b;

    /* JADX INFO: renamed from: c */
    public c4g0 f4666c;

    /* JADX INFO: renamed from: d */
    public final float[] f4667d;

    /* JADX INFO: renamed from: e */
    public Animator f4668e;

    public QuickchatConversationsEntryAvatarView(@NonNull Context context) {
        super(context);
        this.f4664a = new ArrayList();
        this.f4665b = new ArrayList();
        this.f4667d = new float[]{1.0f, 1.0f, 0.0f};
    }

    /* JADX INFO: renamed from: a */
    public void m6658a() {
        xdl0.M(this, false);
        mkd0.z(this.f4666c);
        if (NullChecker.a(this.f4668e)) {
            this.f4668e.removeAllListeners();
            this.f4668e.cancel();
        }
        ((QuickchatEntryAvatarBorderView) this.f4665b.get(0)).setTranslationX(0.0f);
        ((QuickchatEntryAvatarBorderView) this.f4665b.get(0)).setTranslationY(0.0f);
        ((QuickchatEntryAvatarBorderView) this.f4665b.get(0)).setAlpha(this.f4667d[0]);
        VDraweeView vDraweeView = (QuickchatEntryAvatarBorderView) this.f4665b.get(1);
        int i = t100.j;
        vDraweeView.setTranslationX(i);
        ((QuickchatEntryAvatarBorderView) this.f4665b.get(1)).setTranslationY(-i);
        ((QuickchatEntryAvatarBorderView) this.f4665b.get(1)).setAlpha(this.f4667d[1]);
        VDraweeView vDraweeView2 = (QuickchatEntryAvatarBorderView) this.f4665b.get(2);
        int i2 = t100.m;
        vDraweeView2.setTranslationX(i2);
        ((QuickchatEntryAvatarBorderView) this.f4665b.get(2)).setTranslationY(-i2);
        ((QuickchatEntryAvatarBorderView) this.f4665b.get(2)).setAlpha(this.f4667d[2]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.z(this.f4666c);
        if (NullChecker.a(this.f4668e)) {
            this.f4668e.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f4665b.clear();
        this.f4665b.add((QuickchatEntryAvatarBorderView) findViewById(u4c0.X1));
        this.f4665b.add((QuickchatEntryAvatarBorderView) findViewById(u4c0.Y1));
        this.f4665b.add((QuickchatEntryAvatarBorderView) findViewById(u4c0.Z1));
        m6658a();
    }

    public QuickchatConversationsEntryAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4664a = new ArrayList();
        this.f4665b = new ArrayList();
        this.f4667d = new float[]{1.0f, 1.0f, 0.0f};
    }

    public QuickchatConversationsEntryAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4664a = new ArrayList();
        this.f4665b = new ArrayList();
        this.f4667d = new float[]{1.0f, 1.0f, 0.0f};
    }
}
