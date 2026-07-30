package com.p046p1.mobile.putong.core.p053ui.p055gp;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.R$string;
import com.tantanapp.common.utils.NullChecker;
import p147v.VCheckBox;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.o7r;
import p149l.t4k;
import p149l.xdl0;

/* JADX INFO: loaded from: classes10.dex */
public class GpRateGuideDialog extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VImage f29289a;

    /* JADX INFO: renamed from: b */
    public VText f29290b;

    /* JADX INFO: renamed from: c */
    public VText f29291c;

    /* JADX INFO: renamed from: d */
    public VLinear f29292d;

    /* JADX INFO: renamed from: e */
    public VCheckBox f29293e;

    /* JADX INFO: renamed from: f */
    public VText f29294f;

    /* JADX INFO: renamed from: g */
    public VText f29295g;

    /* JADX INFO: renamed from: h */
    public VText f29296h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gp.GpRateGuideDialog$a */
    public interface InterfaceC8345a {
        /* JADX INFO: renamed from: a */
        void mo45556a(View view, boolean z);
    }

    public GpRateGuideDialog(Context context) {
        super(context);
        m45552d(context);
    }

    /* JADX INFO: renamed from: c */
    public View m45551c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t4k.m187217b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public final void m45552d(Context context) {
        addView(m45551c(o7r.m163037a(context), this));
        this.f29290b.setText(R$string.f17678Dl);
        this.f29291c.setText(R$string.f17738Fl);
        this.f29294f.setText(R$string.f17798Hl);
        this.f29295g.setText(R$string.f17828Il);
        this.f29296h.setText(R$string.f17708El);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m45553e(InterfaceC8345a interfaceC8345a, View view) {
        interfaceC8345a.mo45556a(view, this.f29293e.isChecked());
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m45554f(InterfaceC8345a interfaceC8345a, View view) {
        interfaceC8345a.mo45556a(view, this.f29293e.isChecked());
    }

    /* JADX INFO: renamed from: g */
    public void m45555g(final InterfaceC8345a interfaceC8345a, final InterfaceC8345a interfaceC8345a2) {
        boolean zM81303a = NullChecker.m81303a(interfaceC8345a);
        VText vText = this.f29295g;
        if (zM81303a) {
            xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.r4k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f157703a.m45553e(interfaceC8345a, view);
                }
            });
        } else {
            xdl0.m208329E0(vText, null);
        }
        boolean zM81303a2 = NullChecker.m81303a(interfaceC8345a2);
        VText vText2 = this.f29296h;
        if (zM81303a2) {
            xdl0.m208329E0(vText2, new View.OnClickListener() { // from class: l.s4k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f162450a.m45554f(interfaceC8345a2, view);
                }
            });
        } else {
            xdl0.m208329E0(vText2, null);
        }
    }

    public GpRateGuideDialog(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m45552d(context);
    }

    public GpRateGuideDialog(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m45552d(context);
    }
}
