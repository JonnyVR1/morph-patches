package com.p000p1.mobile.putong.live.livingroom.other.obs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.android.app.Act;
import l.s7m;
import l.xdl0;
import p002l.e250;
import p002l.j250;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ObsPreviewView extends FrameLayout implements s7m<e250> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f7273a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f7274b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f7275c;

    /* JADX INFO: renamed from: d */
    public VImage f7276d;

    /* JADX INFO: renamed from: e */
    public VImage f7277e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f7278f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f7279g;

    /* JADX INFO: renamed from: h */
    public VText f7280h;

    /* JADX INFO: renamed from: i */
    public VText f7281i;

    /* JADX INFO: renamed from: j */
    public VText f7282j;

    /* JADX INFO: renamed from: k */
    public e250 f7283k;

    public ObsPreviewView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m9177j(View view) {
        e250 e250Var = this.f7283k;
        if (e250Var != null) {
            e250Var.m12142k4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m9178k(View view) {
        this.f7283k.m12143l4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m9179l(View view) {
        e250 e250Var = this.f7283k;
        if (e250Var != null) {
            e250Var.m12144m4();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m9180C0() {
        return null;
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public final void m9181e(View view) {
        j250.m15567a(this, view);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m9184i1(e250 e250Var) {
        this.f7283k = e250Var;
    }

    /* JADX INFO: renamed from: i */
    public void m9183i() {
        xdl0.M(this.f7274b, false);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m9185m(View view) {
        e250 e250Var = this.f7283k;
        if (e250Var != null) {
            e250Var.m12145n4();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m9186n(boolean z) {
        this.f7281i.setEnabled(z);
        this.f7281i.setText(R$string.f3585tc);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m9181e(this);
        this.f7281i.setEnabled(false);
        this.f7276d.setOnClickListener(new View.OnClickListener() { // from class: l.f250
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10106a.m9177j(view);
            }
        });
        this.f7281i.setOnClickListener(new View.OnClickListener() { // from class: l.g250
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10730a.m9178k(view);
            }
        });
        this.f7279g.setOnClickListener(new View.OnClickListener() { // from class: l.h250
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11848a.m9179l(view);
            }
        });
        this.f7277e.setOnClickListener(new View.OnClickListener() { // from class: l.i250
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12402a.m9185m(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m9187p(boolean z) {
        xdl0.M0(this.f7278f, !z);
        xdl0.M0(this.f7279g, !z);
    }

    /* JADX INFO: renamed from: q */
    public void m9188q(boolean z) {
        xdl0.M0(this, z);
    }

    /* JADX INFO: renamed from: s */
    public void m9189s(Act act, String str) {
        this.f7280h.setText(act.getString(R$string.f3629vc, str));
    }

    public ObsPreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObsPreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
