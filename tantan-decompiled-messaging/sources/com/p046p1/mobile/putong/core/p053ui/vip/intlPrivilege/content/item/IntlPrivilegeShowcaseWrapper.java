package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege.content.item.IntlPrivilegeShowcaseWrapper;
import com.tantanapp.common.utils.NullChecker;
import p147v.VIcon;
import p147v.VMarqueeText;
import p149l.c3m;
import p149l.d30;
import p149l.t100;
import p149l.u1p;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlPrivilegeShowcaseWrapper extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public RelativeLayout f37197a;

    /* JADX INFO: renamed from: b */
    public VMarqueeText f37198b;

    /* JADX INFO: renamed from: c */
    public VIcon f37199c;

    /* JADX INFO: renamed from: d */
    public c3m f37200d;

    public IntlPrivilegeShowcaseWrapper(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m56519a(d30 d30Var, View view) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m56520b(View view) {
        u1p.m191428a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public c3m m56521c() {
        return this.f37200d;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56520b(this);
    }

    public void setPromotionListener(final d30 d30Var) {
        xdl0.m208329E0(this.f37197a, new View.OnClickListener() { // from class: l.t1p
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                IntlPrivilegeShowcaseWrapper.m56519a(d30Var, view);
            }
        });
    }

    public void setPromotionTheme(boolean z) {
        this.f37197a.setBackgroundResource(z ? x2c0.f189325Fb : x2c0.f189293Eb);
        this.f37198b.setTextColor(getResources().getColor(z ? w0c0.f183813V0 : w0c0.f183822Y0));
        this.f37199c.setImageResource(z ? x2c0.f189261Db : x2c0.f189229Cb);
    }

    public void setPromotionVisible(boolean z) {
        xdl0.m208344M(this.f37197a, z);
        this.f37198b.setText(R$string.f17853Jg);
    }

    public void setUpShowcaseComponent(c3m c3mVar) {
        this.f37200d = c3mVar;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.setMargins(0, 0, 0, t100.m186890d(16.0f));
        setClipChildren(false);
        setClipToPadding(false);
        addView(c3mVar.mo105092a(this, false), layoutParams);
    }

    public IntlPrivilegeShowcaseWrapper(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IntlPrivilegeShowcaseWrapper(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
