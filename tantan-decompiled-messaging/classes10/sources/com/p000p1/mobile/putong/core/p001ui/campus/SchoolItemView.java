package com.p000p1.mobile.putong.core.p001ui.campus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.data.School;
import l.xdl0;
import p003l.f3e0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class SchoolItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f1047a;

    /* JADX INFO: renamed from: b */
    public VText f1048b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f1049c;

    /* JADX INFO: renamed from: d */
    public VText f1050d;

    public SchoolItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m1764b(View view) {
        f3e0.m6378a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public SelectSchoolAct m1765c() {
        return (SelectSchoolAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m1766d(School school, boolean z, View view) {
        m1765c().f1051c.m10490w(school, z);
    }

    /* JADX INFO: renamed from: e */
    public void m1767e(final boolean z, final School school, int i, boolean z2) {
        this.f1048b.setText(z ? "" : school.firstLetter);
        boolean z3 = false;
        boolean z4 = !z && z2;
        xdl0.M(this.f1048b, z4);
        View view = this.f1047a;
        if (z4 && i != 0) {
            z3 = true;
        }
        xdl0.M(view, z3);
        this.f1049c.setOnClickListener(new View.OnClickListener() { // from class: l.e3e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f4249a.m1766d(school, z, view2);
            }
        });
        this.f1050d.setText(school.name);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1764b(this);
    }

    public SchoolItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SchoolItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
