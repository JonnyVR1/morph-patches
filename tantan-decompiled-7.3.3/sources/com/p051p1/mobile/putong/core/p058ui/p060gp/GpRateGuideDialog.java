package com.p051p1.mobile.putong.core.p058ui.p060gp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.R$string;
import com.tantanapp.common.utils.NullChecker;
import p151v.VCheckBox;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.l7k;
import p153l.p9r;

/* JADX INFO: loaded from: classes3.dex */
public class GpRateGuideDialog extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f30137a;

    /* JADX INFO: renamed from: b */
    public VText f30138b;

    /* JADX INFO: renamed from: c */
    public VText f30139c;

    /* JADX INFO: renamed from: d */
    public VLinear f30140d;

    /* JADX INFO: renamed from: e */
    public VCheckBox f30141e;

    /* JADX INFO: renamed from: f */
    public VText f30142f;

    /* JADX INFO: renamed from: g */
    public VText f30143g;

    /* JADX INFO: renamed from: h */
    public VText f30144h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gp.GpRateGuideDialog$a */
    public interface InterfaceC8508a {
        /* JADX INFO: renamed from: a */
        void mo46739a(View view, boolean z);
    }

    public GpRateGuideDialog(Context context) {
        super(context);
        m46735d(context);
    }

    /* JADX INFO: renamed from: c */
    public View m46734c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return l7k.m153143b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public final void m46735d(Context context) {
        addView(m46734c(p9r.m171370a(context), this));
        this.f30138b.setText(R$string.f19068Zl);
        this.f30139c.setText(R$string.f19130bm);
        this.f30142f.setText(R$string.f19192dm);
        this.f30143g.setText(R$string.f19222em);
        this.f30144h.setText(R$string.f19099am);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m46736e(InterfaceC8508a interfaceC8508a, View view) {
        interfaceC8508a.mo46739a(view, this.f30141e.isChecked());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m46737f(InterfaceC8508a interfaceC8508a, View view) {
        interfaceC8508a.mo46739a(view, this.f30141e.isChecked());
    }

    /* JADX INFO: renamed from: g */
    public void m46738g(final InterfaceC8508a interfaceC8508a, final InterfaceC8508a interfaceC8508a2) {
        boolean zM82486a = NullChecker.m82486a(interfaceC8508a);
        VText vText = this.f30143g;
        if (zM82486a) {
            bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.j7k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f118691a.m46736e(interfaceC8508a, view);
                }
            });
        } else {
            bnl0.m105509E0(vText, null);
        }
        boolean zM82486a2 = NullChecker.m82486a(interfaceC8508a2);
        VText vText2 = this.f30144h;
        if (zM82486a2) {
            bnl0.m105509E0(vText2, new View.OnClickListener() { // from class: l.k7k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f124271a.m46737f(interfaceC8508a2, view);
                }
            });
        } else {
            bnl0.m105509E0(vText2, null);
        }
    }

    public GpRateGuideDialog(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m46735d(context);
    }

    public GpRateGuideDialog(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m46735d(context);
    }
}
