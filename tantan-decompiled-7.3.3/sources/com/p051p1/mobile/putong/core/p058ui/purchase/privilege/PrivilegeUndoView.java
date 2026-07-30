package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p153l.ak90;
import p153l.bnl0;
import p153l.c17;
import p153l.jbc0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeUndoView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f35961a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f35962b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f35963c;

    /* JADX INFO: renamed from: d */
    public VImage f35964d;

    /* JADX INFO: renamed from: e */
    public VImage f35965e;

    public PrivilegeUndoView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55465a(View view) {
        ak90.m98559a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55466b() {
        this.f35964d.setImageResource(jbc0.f119800v9);
        bnl0.m105524M(this.f35961a, false);
        bnl0.m105524M(this.f35965e, true);
        this.f35965e.setImageResource(c17.m107528u0() ? jbc0.f119183Cc : jbc0.f119155Ac);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55465a(this);
    }

    public PrivilegeUndoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeUndoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
