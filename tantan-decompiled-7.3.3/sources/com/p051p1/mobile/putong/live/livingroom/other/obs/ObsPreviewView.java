package com.p051p1.mobile.putong.live.livingroom.other.obs;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.iam;
import p153l.ta50;
import p153l.ya50;

/* JADX INFO: loaded from: classes5.dex */
public class ObsPreviewView extends FrameLayout implements iam<ta50> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f52079a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f52080b;

    /* JADX INFO: renamed from: c */
    public LinearLayout f52081c;

    /* JADX INFO: renamed from: d */
    public VImage f52082d;

    /* JADX INFO: renamed from: e */
    public VImage f52083e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f52084f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f52085g;

    /* JADX INFO: renamed from: h */
    public VText f52086h;

    /* JADX INFO: renamed from: i */
    public VText f52087i;

    /* JADX INFO: renamed from: j */
    public VText f52088j;

    /* JADX INFO: renamed from: k */
    public ta50 f52089k;

    public ObsPreviewView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public /* synthetic */ void m76725j(View view) {
        ta50 ta50Var = this.f52089k;
        if (ta50Var != null) {
            ta50Var.m189800k4();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k */
    public /* synthetic */ void m76726k(View view) {
        this.f52089k.m189801l4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public /* synthetic */ void m76727l(View view) {
        ta50 ta50Var = this.f52089k;
        if (ta50Var != null) {
            ta50Var.m189802m4();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public final void m76728e(View view) {
        ya50.m214856a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ta50 ta50Var) {
        this.f52089k = ta50Var;
    }

    /* JADX INFO: renamed from: i */
    public void m76730i() {
        bnl0.m105524M(this.f52080b, false);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m76731m(View view) {
        ta50 ta50Var = this.f52089k;
        if (ta50Var != null) {
            ta50Var.m189803n4();
        }
    }

    /* JADX INFO: renamed from: n */
    public void m76732n(boolean z) {
        this.f52087i.setEnabled(z);
        this.f52087i.setText(R$string.f48391tc);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76728e(this);
        this.f52087i.setEnabled(false);
        this.f52082d.setOnClickListener(new View.OnClickListener() { // from class: l.ua50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178179a.m76725j(view);
            }
        });
        this.f52087i.setOnClickListener(new View.OnClickListener() { // from class: l.va50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183066a.m76726k(view);
            }
        });
        this.f52085g.setOnClickListener(new View.OnClickListener() { // from class: l.wa50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188087a.m76727l(view);
            }
        });
        this.f52083e.setOnClickListener(new View.OnClickListener() { // from class: l.xa50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f192989a.m76731m(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public void m76733p(boolean z) {
        bnl0.m105525M0(this.f52084f, !z);
        bnl0.m105525M0(this.f52085g, !z);
    }

    /* JADX INFO: renamed from: q */
    public void m76734q(boolean z) {
        bnl0.m105525M0(this, z);
    }

    /* JADX INFO: renamed from: s */
    public void m76735s(Act act, String str) {
        this.f52086h.setText(act.getString(R$string.f48435vc, str));
    }

    public ObsPreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ObsPreviewView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
