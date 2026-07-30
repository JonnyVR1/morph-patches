package com.p046p1.mobile.putong.live.livingroom.voice.intl.sweet.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p147v.VText;
import p149l.e30;
import p149l.eto0;
import p149l.h1c0;
import p149l.kvc0;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceSweetTabView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f53587a;

    /* JADX INFO: renamed from: b */
    public VText f53588b;

    /* JADX INFO: renamed from: c */
    public e30 f53589c;

    public VoiceSweetTabView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public final void m78552c(View view) {
        eto0.m118129a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m78553d(View view) {
        m78555f(0);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m78554e(View view) {
        m78555f(1);
    }

    /* JADX INFO: renamed from: f */
    public void m78555f(int i) {
        VText vText = this.f53587a;
        if (i == 0) {
            vText.setTextColor(kvc0.m147352a(h1c0.f105362e1));
            this.f53588b.setTextColor(kvc0.m147352a(h1c0.f105386m1));
        } else {
            vText.setTextColor(kvc0.m147352a(h1c0.f105386m1));
            this.f53588b.setTextColor(kvc0.m147352a(h1c0.f105362e1));
        }
        e30 e30Var = this.f53589c;
        if (e30Var != null) {
            e30Var.call(Integer.valueOf(i));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m78556g(int i, int i2) {
        this.f53587a.setText(kvc0.m147355d(i));
        this.f53588b.setText(kvc0.m147355d(i2));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78552c(this);
        m78555f(0);
        xdl0.m208329E0(this.f53587a, new View.OnClickListener() { // from class: l.cto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82495a.m78553d(view);
            }
        });
        xdl0.m208329E0(this.f53588b, new View.OnClickListener() { // from class: l.dto0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f87865a.m78554e(view);
            }
        });
    }

    public void setMargin(boolean z) {
        xdl0.m208358V(this.f53588b, z ? -t100.f167266o : 0);
    }

    public void setOnTabSelectedListener(e30<Integer> e30Var) {
        this.f53589c = e30Var;
    }

    public VoiceSweetTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VoiceSweetTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
