package com.p051p1.mobile.putong.core.p058ui.campus;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.data.School;
import p151v.VText;
import p153l.bnl0;
import p153l.jbe0;

/* JADX INFO: loaded from: classes9.dex */
public class SchoolItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public View f29501a;

    /* JADX INFO: renamed from: b */
    public VText f29502b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f29503c;

    /* JADX INFO: renamed from: d */
    public VText f29504d;

    public SchoolItemView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m45648b(View view) {
        jbe0.m144201a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public SelectSchoolAct m45649c() {
        return (SelectSchoolAct) getContext();
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m45650d(School school, boolean z, View view) {
        m45649c().f29505c.m105052w(school, z);
    }

    /* JADX INFO: renamed from: e */
    public void m45651e(final boolean z, final School school, int i, boolean z2) {
        this.f29502b.setText(z ? "" : school.firstLetter);
        boolean z3 = false;
        boolean z4 = !z && z2;
        bnl0.m105524M(this.f29502b, z4);
        View view = this.f29501a;
        if (z4 && i != 0) {
            z3 = true;
        }
        bnl0.m105524M(view, z3);
        this.f29503c.setOnClickListener(new View.OnClickListener() { // from class: l.ibe0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f114205a.m45650d(school, z, view2);
            }
        });
        this.f29504d.setText(school.name);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45648b(this);
    }

    public SchoolItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SchoolItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
