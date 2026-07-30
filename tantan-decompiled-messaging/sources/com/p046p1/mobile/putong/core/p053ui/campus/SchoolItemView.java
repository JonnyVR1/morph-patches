package com.p046p1.mobile.putong.core.p053ui.campus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.data.School;
import p147v.VText;
import p149l.f3e0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class SchoolItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f28653a;

    /* JADX INFO: renamed from: b */
    public VText f28654b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f28655c;

    /* JADX INFO: renamed from: d */
    public VText f28656d;

    public SchoolItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m44465b(View view) {
        f3e0.m119258a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public SelectSchoolAct m44466c() {
        return (SelectSchoolAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m44467d(School school, boolean z, View view) {
        m44466c().f28657c.m202734w(school, z);
    }

    /* JADX INFO: renamed from: e */
    public void m44468e(final boolean z, final School school, int i, boolean z2) {
        this.f28654b.setText(z ? "" : school.firstLetter);
        boolean z3 = false;
        boolean z4 = !z && z2;
        xdl0.m208344M(this.f28654b, z4);
        View view = this.f28653a;
        if (z4 && i != 0) {
            z3 = true;
        }
        xdl0.m208344M(view, z3);
        this.f28655c.setOnClickListener(new View.OnClickListener() { // from class: l.e3e0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f89171a.m44467d(school, z, view2);
            }
        });
        this.f28656d.setText(school.name);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44465b(this);
    }

    public SchoolItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SchoolItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
