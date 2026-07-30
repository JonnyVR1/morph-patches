package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

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
import com.p1.mobile.putong.core.data.Privilege;
import com.tantanapp.common.utils.NullChecker;
import l.z590;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeItemIntroPage1 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public Space f4846a;

    /* JADX INFO: renamed from: b */
    public TextView f4847b;

    /* JADX INFO: renamed from: c */
    public TextView f4848c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f4849d;

    /* JADX INFO: renamed from: e */
    public TextView f4850e;

    /* JADX INFO: renamed from: f */
    public Privilege f4851f;

    /* JADX INFO: renamed from: g */
    public ExplodeLayout f4852g;

    /* JADX INFO: renamed from: h */
    public QuickChatPrivilegeAnimView f4853h;

    /* JADX INFO: renamed from: i */
    public SvipDlgSeeAnimLayout f4854i;

    public PrivilegeItemIntroPage1(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7587a(View view) {
        z590.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7588b() {
        Privilege privilege = this.f4851f;
        Privilege privilege2 = Privilege.see_who_likes_me;
        if (privilege == privilege2 && NullChecker.a(this.f4852g)) {
            this.f4852g.m7563l(true);
            return;
        }
        if (this.f4851f == Privilege.online_match_tickets && NullChecker.a(this.f4853h)) {
            this.f4853h.m7644t0();
        } else if (this.f4851f == privilege2 && NullChecker.a(this.f4854i)) {
            this.f4854i.m7658l0();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7587a(this);
        this.f4847b.setTypeface(Typeface.DEFAULT_BOLD);
    }

    public PrivilegeItemIntroPage1(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeItemIntroPage1(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
