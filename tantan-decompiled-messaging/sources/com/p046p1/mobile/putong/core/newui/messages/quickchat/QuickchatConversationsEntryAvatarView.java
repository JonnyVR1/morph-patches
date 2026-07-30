package com.p046p1.mobile.putong.core.newui.messages.quickchat;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.c4g0;
import p149l.mkd0;
import p149l.t100;
import p149l.u4c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class QuickchatConversationsEntryAvatarView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final List<String> f25886a;

    /* JADX INFO: renamed from: b */
    public final List<QuickchatEntryAvatarBorderView> f25887b;

    /* JADX INFO: renamed from: c */
    public c4g0 f25888c;

    /* JADX INFO: renamed from: d */
    public final float[] f25889d;

    /* JADX INFO: renamed from: e */
    public Animator f25890e;

    public QuickchatConversationsEntryAvatarView(@NonNull Context context) {
        super(context);
        this.f25886a = new ArrayList();
        this.f25887b = new ArrayList();
        this.f25889d = new float[]{1.0f, 1.0f, 0.0f};
    }

    /* JADX INFO: renamed from: a */
    public void m42499a() {
        xdl0.m208344M(this, false);
        mkd0.m154992z(this.f25888c);
        if (NullChecker.m81303a(this.f25890e)) {
            this.f25890e.removeAllListeners();
            this.f25890e.cancel();
        }
        this.f25887b.get(0).setTranslationX(0.0f);
        this.f25887b.get(0).setTranslationY(0.0f);
        this.f25887b.get(0).setAlpha(this.f25889d[0]);
        QuickchatEntryAvatarBorderView quickchatEntryAvatarBorderView = this.f25887b.get(1);
        int i = t100.f167261j;
        quickchatEntryAvatarBorderView.setTranslationX(i);
        this.f25887b.get(1).setTranslationY(-i);
        this.f25887b.get(1).setAlpha(this.f25889d[1]);
        QuickchatEntryAvatarBorderView quickchatEntryAvatarBorderView2 = this.f25887b.get(2);
        int i2 = t100.f167264m;
        quickchatEntryAvatarBorderView2.setTranslationX(i2);
        this.f25887b.get(2).setTranslationY(-i2);
        this.f25887b.get(2).setAlpha(this.f25889d[2]);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f25888c);
        if (NullChecker.m81303a(this.f25890e)) {
            this.f25890e.cancel();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f25887b.clear();
        this.f25887b.add((QuickchatEntryAvatarBorderView) findViewById(u4c0.f174105X1));
        this.f25887b.add((QuickchatEntryAvatarBorderView) findViewById(u4c0.f174121Y1));
        this.f25887b.add((QuickchatEntryAvatarBorderView) findViewById(u4c0.f174137Z1));
        m42499a();
    }

    public QuickchatConversationsEntryAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25886a = new ArrayList();
        this.f25887b = new ArrayList();
        this.f25889d = new float[]{1.0f, 1.0f, 0.0f};
    }

    public QuickchatConversationsEntryAvatarView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25886a = new ArrayList();
        this.f25887b = new ArrayList();
        this.f25889d = new float[]{1.0f, 1.0f, 0.0f};
    }
}
