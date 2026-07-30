package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.widget.Space;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.tantanapp.common.utils.NullChecker;
import p153l.de90;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeItemIntroPage1 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Space f35913a;

    /* JADX INFO: renamed from: b */
    public TextView f35914b;

    /* JADX INFO: renamed from: c */
    public TextView f35915c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f35916d;

    /* JADX INFO: renamed from: e */
    public TextView f35917e;

    /* JADX INFO: renamed from: f */
    public Privilege f35918f;

    /* JADX INFO: renamed from: g */
    public ExplodeLayout f35919g;

    /* JADX INFO: renamed from: h */
    public QuickChatPrivilegeAnimView f35920h;

    /* JADX INFO: renamed from: i */
    public SvipDlgSeeAnimLayout f35921i;

    public PrivilegeItemIntroPage1(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55435a(View view) {
        de90.m115402a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55436b() {
        Privilege privilege = this.f35918f;
        Privilege privilege2 = Privilege.see_who_likes_me;
        if (privilege == privilege2 && NullChecker.m82486a(this.f35919g)) {
            this.f35919g.m55411l(true);
            return;
        }
        if (this.f35918f == Privilege.online_match_tickets && NullChecker.m82486a(this.f35920h)) {
            this.f35920h.m55492t0();
        } else if (this.f35918f == privilege2 && NullChecker.m82486a(this.f35921i)) {
            this.f35921i.m55506l0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55435a(this);
        this.f35914b.setTypeface(Typeface.DEFAULT_BOLD);
    }

    public PrivilegeItemIntroPage1(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeItemIntroPage1(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
