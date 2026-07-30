package com.p000p1.mobile.putong.core.p001ui.p002gp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.R;
import com.tantanapp.common.utils.NullChecker;
import l.o7r;
import l.xdl0;
import p003l.t4k;
import v.VCheckBox;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GpRateGuideDialog extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f1683a;

    /* JADX INFO: renamed from: b */
    public VText f1684b;

    /* JADX INFO: renamed from: c */
    public VText f1685c;

    /* JADX INFO: renamed from: d */
    public VLinear f1686d;

    /* JADX INFO: renamed from: e */
    public VCheckBox f1687e;

    /* JADX INFO: renamed from: f */
    public VText f1688f;

    /* JADX INFO: renamed from: g */
    public VText f1689g;

    /* JADX INFO: renamed from: h */
    public VText f1690h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gp.GpRateGuideDialog$a */
    public interface InterfaceC3120a {
        /* JADX INFO: renamed from: a */
        void mo2892a(View view, boolean z);
    }

    public GpRateGuideDialog(Context context) {
        super(context);
        m2888d(context);
    }

    /* JADX INFO: renamed from: c */
    public View m2887c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t4k.m9539b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public final void m2888d(Context context) {
        addView(m2887c(o7r.a(context), this));
        this.f1684b.setText(R.string.Dl);
        this.f1685c.setText(R.string.Fl);
        this.f1688f.setText(R.string.Hl);
        this.f1689g.setText(R.string.Il);
        this.f1690h.setText(R.string.El);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m2889e(InterfaceC3120a interfaceC3120a, View view) {
        interfaceC3120a.mo2892a(view, this.f1687e.isChecked());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m2890f(InterfaceC3120a interfaceC3120a, View view) {
        interfaceC3120a.mo2892a(view, this.f1687e.isChecked());
    }

    /* JADX INFO: renamed from: g */
    public void m2891g(final InterfaceC3120a interfaceC3120a, final InterfaceC3120a interfaceC3120a2) {
        boolean zA = NullChecker.a(interfaceC3120a);
        VText vText = this.f1689g;
        if (zA) {
            xdl0.E0(vText, new View.OnClickListener() { // from class: l.r4k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7122a.m2889e(interfaceC3120a, view);
                }
            });
        } else {
            xdl0.E0(vText, (View.OnClickListener) null);
        }
        boolean zA2 = NullChecker.a(interfaceC3120a2);
        VText vText2 = this.f1690h;
        if (zA2) {
            xdl0.E0(vText2, new View.OnClickListener() { // from class: l.s4k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f7279a.m2890f(interfaceC3120a2, view);
                }
            });
        } else {
            xdl0.E0(vText2, (View.OnClickListener) null);
        }
    }

    public GpRateGuideDialog(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m2888d(context);
    }

    public GpRateGuideDialog(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m2888d(context);
    }
}
