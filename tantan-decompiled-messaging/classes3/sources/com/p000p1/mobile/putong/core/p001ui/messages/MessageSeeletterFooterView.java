package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageSeeletterFooterView;
import com.p1.mobile.putong.core.CoreModule;
import l.t100;
import l.xdl0;
import l.xwz;
import p003l.e30;
import p003l.fcz;
import p003l.fxe;
import p028v.VDraweeView;
import p028v.VFrame;
import p028v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageSeeletterFooterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f1517c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f1518d;

    /* JADX INFO: renamed from: e */
    public VFrame f1519e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f1520f;

    /* JADX INFO: renamed from: g */
    public VFrame f1521g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f1522h;

    /* JADX INFO: renamed from: i */
    public VFrame f1523i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f1524j;

    /* JADX INFO: renamed from: k */
    public String[] f1525k;

    public MessageSeeletterFooterView(Context context) {
        super(context);
        this.f1525k = new String[]{"❤️", "☺️", "👋", "😉"};
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m2013R(fcz fczVar, String str) {
        if (CoreModule.P().i().H4()) {
            CoreModule.P().i().showProofAgeDlg(fczVar.act(), "chat_page_enter_text");
        } else {
            fczVar.m4173S6(str);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m2017W(View view) {
        xwz.a(this, view);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m2018X(e30 e30Var, View view) {
        e30Var.call(this.f1525k[0]);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m2019Y(e30 e30Var, View view) {
        e30Var.call(this.f1525k[0]);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m2020Z(e30 e30Var, View view) {
        e30Var.call(this.f1525k[1]);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m2021a0(e30 e30Var, View view) {
        e30Var.call(this.f1525k[2]);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m2022b0(e30 e30Var, View view) {
        e30Var.call(this.f1525k[3]);
    }

    /* JADX INFO: renamed from: c0 */
    public void m2023c0(final fcz fczVar) {
        final e30 e30Var = new e30() { // from class: l.rwz
            @Override // p003l.e30
            public final void call(Object obj) {
                MessageSeeletterFooterView.m2013R(fczVar, (String) obj);
            }
        };
        xdl0.E0(this.f1517c, new View.OnClickListener() { // from class: l.swz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7358a.m2018X(e30Var, view);
            }
        });
        xdl0.E0(this.f1517c, new View.OnClickListener() { // from class: l.twz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7820a.m2019Y(e30Var, view);
            }
        });
        xdl0.E0(this.f1519e, new View.OnClickListener() { // from class: l.uwz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8117a.m2020Z(e30Var, view);
            }
        });
        xdl0.E0(this.f1521g, new View.OnClickListener() { // from class: l.vwz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8458a.m2021a0(e30Var, view);
            }
        });
        xdl0.E0(this.f1523i, new View.OnClickListener() { // from class: l.wwz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8637a.m2022b0(e30Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2017W(this);
        this.f1518d.setImageDrawable(new fxe(getContext(), this.f1525k[0], 16.0f, t100.d(24.0f)));
        this.f1520f.setImageDrawable(new fxe(getContext(), this.f1525k[1], 16.0f, t100.d(24.0f)));
        this.f1522h.setImageDrawable(new fxe(getContext(), this.f1525k[2], 16.0f, t100.d(24.0f)));
        this.f1524j.setImageDrawable(new fxe(getContext(), this.f1525k[3], 16.0f, t100.d(24.0f)));
    }

    public MessageSeeletterFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1525k = new String[]{"❤️", "☺️", "👋", "😉"};
    }

    public MessageSeeletterFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1525k = new String[]{"❤️", "☺️", "👋", "😉"};
    }
}
