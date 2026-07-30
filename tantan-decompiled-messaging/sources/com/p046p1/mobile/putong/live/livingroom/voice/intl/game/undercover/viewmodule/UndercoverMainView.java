package com.p046p1.mobile.putong.live.livingroom.voice.intl.game.undercover.viewmodule;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VText;
import p149l.gmj0;
import p149l.hxs;
import p149l.imj0;
import p149l.s7m;
import p149l.t100;
import p149l.xdl0;
import p149l.ydt;

/* JADX INFO: loaded from: classes5.dex */
public class UndercoverMainView extends VFrame implements s7m<gmj0> {

    /* JADX INFO: renamed from: a */
    public VDraweeView f53145a;

    /* JADX INFO: renamed from: b */
    public VText f53146b;

    /* JADX INFO: renamed from: c */
    public VImage f53147c;

    /* JADX INFO: renamed from: d */
    public gmj0 f53148d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.game.undercover.viewmodule.UndercoverMainView$a */
    public class ViewOnClickListenerC13021a implements View.OnClickListener {
        public ViewOnClickListenerC13021a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (UndercoverMainView.this.f53148d != null) {
                UndercoverMainView.this.f53148d.m127021v4();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.game.undercover.viewmodule.UndercoverMainView$b */
    public class ViewOnClickListenerC13022b implements View.OnClickListener {
        public ViewOnClickListenerC13022b() {
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m78157b() {
            if (UndercoverMainView.this.f53148d != null) {
                UndercoverMainView.this.f53148d.m127004b4();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            UndercoverMainView.this.act().dialog().m20500D(R$string.f47637xi).m20541k0(R$string.f46842N1).m20556t0(R$string.f47347ke, new Runnable() { // from class: l.hmj0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108442a.m78157b();
                }
            }).m20567z().show();
        }
    }

    public UndercoverMainView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: r */
    private void m78151r() {
        this.f53146b.setOnClickListener(new ViewOnClickListenerC13021a());
        this.f53147c.setOnClickListener(new ViewOnClickListenerC13022b());
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78152s(this);
        m78151r();
        hxs.m133408u("context_livingAct", this.f53145a, ydt.f197626p, xdl0.m208412y0(), t100.m186890d(290.0f));
    }

    /* JADX INFO: renamed from: s */
    public final void m78152s(View view) {
        imj0.m137079a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(gmj0 gmj0Var) {
        this.f53148d = gmj0Var;
    }

    /* JADX INFO: renamed from: v */
    public void m78154v(boolean z) {
        xdl0.m208345M0(this.f53147c, z);
    }

    /* JADX INFO: renamed from: w */
    public void m78155w(boolean z) {
        xdl0.m208344M(this, !z);
    }

    public UndercoverMainView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UndercoverMainView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
