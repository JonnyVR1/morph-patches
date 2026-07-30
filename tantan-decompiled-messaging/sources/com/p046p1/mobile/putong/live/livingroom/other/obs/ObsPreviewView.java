package com.p046p1.mobile.putong.live.livingroom.other.obs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VImage;
import p147v.VText;
import p149l.e250;
import p149l.j250;
import p149l.s7m;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class ObsPreviewView extends FrameLayout implements s7m<e250> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f51231a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f51232b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f51233c;

    /* JADX INFO: renamed from: d */
    public VImage f51234d;

    /* JADX INFO: renamed from: e */
    public VImage f51235e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f51236f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f51237g;

    /* JADX INFO: renamed from: h */
    public VText f51238h;

    /* JADX INFO: renamed from: i */
    public VText f51239i;

    /* JADX INFO: renamed from: j */
    public VText f51240j;

    /* JADX INFO: renamed from: k */
    public e250 f51241k;

    public ObsPreviewView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m75542j(View view) {
        e250 e250Var = this.f51241k;
        if (e250Var != null) {
            e250Var.m114484k4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m75543k(View view) {
        this.f51241k.m114485l4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m75544l(View view) {
        e250 e250Var = this.f51241k;
        if (e250Var != null) {
            e250Var.m114486m4();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public final void m75545e(View view) {
        j250.m139416a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(e250 e250Var) {
        this.f51241k = e250Var;
    }

    /* JADX INFO: renamed from: i */
    public void m75547i() {
        xdl0.m208344M(this.f51232b, false);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m75548m(View view) {
        e250 e250Var = this.f51241k;
        if (e250Var != null) {
            e250Var.m114487n4();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m75549n(boolean z) {
        this.f51239i.setEnabled(z);
        this.f51239i.setText(R$string.f47543tc);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75545e(this);
        this.f51239i.setEnabled(false);
        this.f51234d.setOnClickListener(new View.OnClickListener() { // from class: l.f250
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f94150a.m75542j(view);
            }
        });
        this.f51239i.setOnClickListener(new View.OnClickListener() { // from class: l.g250
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100234a.m75543k(view);
            }
        });
        this.f51237g.setOnClickListener(new View.OnClickListener() { // from class: l.h250
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105491a.m75544l(view);
            }
        });
        this.f51235e.setOnClickListener(new View.OnClickListener() { // from class: l.i250
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110535a.m75548m(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m75550p(boolean z) {
        xdl0.m208345M0(this.f51236f, !z);
        xdl0.m208345M0(this.f51237g, !z);
    }

    /* JADX INFO: renamed from: q */
    public void m75551q(boolean z) {
        xdl0.m208345M0(this, z);
    }

    /* JADX INFO: renamed from: s */
    public void m75552s(Act act, String str) {
        this.f51238h.setText(act.getString(R$string.f47587vc, str));
    }

    public ObsPreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObsPreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
