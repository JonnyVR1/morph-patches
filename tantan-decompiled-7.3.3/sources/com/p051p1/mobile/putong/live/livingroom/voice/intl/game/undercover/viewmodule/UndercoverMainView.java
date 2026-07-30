package com.p051p1.mobile.putong.live.livingroom.voice.intl.game.undercover.viewmodule;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.iam;
import p153l.izs;
import p153l.jvj0;
import p153l.lvj0;
import p153l.qa00;
import p153l.zft;

/* JADX INFO: loaded from: classes5.dex */
public class UndercoverMainView extends VFrame implements iam<jvj0> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53993a;

    /* JADX INFO: renamed from: b */
    public VText f53994b;

    /* JADX INFO: renamed from: c */
    public VImage f53995c;

    /* JADX INFO: renamed from: d */
    public jvj0 f53996d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.game.undercover.viewmodule.UndercoverMainView$a */
    public class ViewOnClickListenerC13184a implements View.OnClickListener {
        public ViewOnClickListenerC13184a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UndercoverMainView.this.f53996d != null) {
                UndercoverMainView.this.f53996d.m147075v4();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.game.undercover.viewmodule.UndercoverMainView$b */
    public class ViewOnClickListenerC13185b implements View.OnClickListener {
        public ViewOnClickListenerC13185b() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m79340b() {
            if (UndercoverMainView.this.f53996d != null) {
                UndercoverMainView.this.f53996d.m147058b4();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UndercoverMainView.this.act().dialog().m21499D(R$string.f48485xi).m21540k0(R$string.f47690N1).m21555t0(R$string.f48195ke, new Runnable() { // from class: l.kvj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f128965a.m79340b();
                }
            }).m21566z().show();
        }
    }

    public UndercoverMainView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m79334r() {
        this.f53994b.setOnClickListener(new ViewOnClickListenerC13184a());
        this.f53995c.setOnClickListener(new ViewOnClickListenerC13185b());
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79335s(this);
        m79334r();
        izs.m142870u("context_livingAct", this.f53993a, zft.f204221p, bnl0.m105592y0(), qa00.m175859d(290.0f));
    }

    /* JADX INFO: renamed from: s */
    public final void m79335s(View view) {
        lvj0.m155994a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(jvj0 jvj0Var) {
        this.f53996d = jvj0Var;
    }

    /* JADX INFO: renamed from: v */
    public void m79337v(boolean z) {
        bnl0.m105525M0(this.f53995c, z);
    }

    /* JADX INFO: renamed from: w */
    public void m79338w(boolean z) {
        bnl0.m105524M(this, !z);
    }

    public UndercoverMainView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UndercoverMainView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
