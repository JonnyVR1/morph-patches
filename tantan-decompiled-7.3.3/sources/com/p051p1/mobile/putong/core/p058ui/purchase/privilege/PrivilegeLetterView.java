package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.pay.R$string;
import p153l.c17;
import p153l.fe90;
import p153l.jbc0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeLetterView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f35931a;

    /* JADX INFO: renamed from: b */
    public ImageView f35932b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f35933c;

    /* JADX INFO: renamed from: d */
    public TextView f35934d;

    /* JADX INFO: renamed from: e */
    public TextView f35935e;

    public PrivilegeLetterView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55443a(View view) {
        fe90.m125299a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55444b() {
        this.f35931a.setImageResource(c17.m107528u0() ? jbc0.f119375Q8 : jbc0.f119361P8);
        this.f35934d.setText(R$string.f28060L0);
        this.f35935e.setText(R$string.f28248c);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55443a(this);
    }

    public PrivilegeLetterView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeLetterView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
