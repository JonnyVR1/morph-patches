package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageSeeletterFooterView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VLinear;
import p149l.e30;
import p149l.fcz;
import p149l.fxe;
import p149l.t100;
import p149l.xdl0;
import p149l.xwz;

/* JADX INFO: loaded from: classes3.dex */
public class MessageSeeletterFooterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f31626c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f31627d;

    /* JADX INFO: renamed from: e */
    public VFrame f31628e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f31629f;

    /* JADX INFO: renamed from: g */
    public VFrame f31630g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f31631h;

    /* JADX INFO: renamed from: i */
    public VFrame f31632i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f31633j;

    /* JADX INFO: renamed from: k */
    public String[] f31634k;

    public MessageSeeletterFooterView(Context context) {
        super(context);
        this.f31634k = new String[]{"❤️", "☺️", "👋", "😉"};
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m48921R(fcz fczVar, String str) {
        if (CoreModule.m29935P().m94658i().mo158241H4()) {
            CoreModule.m29935P().m94658i().showProofAgeDlg(fczVar.act(), "chat_page_enter_text");
        } else {
            fczVar.m120708S6(str);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m48925W(View view) {
        xwz.m211431a(this, view);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m48926X(e30 e30Var, View view) {
        e30Var.call(this.f31634k[0]);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m48927Y(e30 e30Var, View view) {
        e30Var.call(this.f31634k[0]);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m48928Z(e30 e30Var, View view) {
        e30Var.call(this.f31634k[1]);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m48929a0(e30 e30Var, View view) {
        e30Var.call(this.f31634k[2]);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m48930b0(e30 e30Var, View view) {
        e30Var.call(this.f31634k[3]);
    }

    /* JADX INFO: renamed from: c0 */
    public void m48931c0(final fcz fczVar) {
        final e30 e30Var = new e30() { // from class: l.rwz
            @Override // p149l.e30
            public final void call(Object obj) {
                MessageSeeletterFooterView.m48921R(fczVar, (String) obj);
            }
        };
        xdl0.m208329E0(this.f31626c, new View.OnClickListener() { // from class: l.swz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166767a.m48926X(e30Var, view);
            }
        });
        xdl0.m208329E0(this.f31626c, new View.OnClickListener() { // from class: l.twz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172439a.m48927Y(e30Var, view);
            }
        });
        xdl0.m208329E0(this.f31628e, new View.OnClickListener() { // from class: l.uwz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f178690a.m48928Z(e30Var, view);
            }
        });
        xdl0.m208329E0(this.f31630g, new View.OnClickListener() { // from class: l.vwz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183405a.m48929a0(e30Var, view);
            }
        });
        xdl0.m208329E0(this.f31632i, new View.OnClickListener() { // from class: l.wwz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188417a.m48930b0(e30Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48925W(this);
        this.f31627d.setImageDrawable(new fxe(getContext(), this.f31634k[0], 16.0f, t100.m186890d(24.0f)));
        this.f31629f.setImageDrawable(new fxe(getContext(), this.f31634k[1], 16.0f, t100.m186890d(24.0f)));
        this.f31631h.setImageDrawable(new fxe(getContext(), this.f31634k[2], 16.0f, t100.m186890d(24.0f)));
        this.f31633j.setImageDrawable(new fxe(getContext(), this.f31634k[3], 16.0f, t100.m186890d(24.0f)));
    }

    public MessageSeeletterFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31634k = new String[]{"❤️", "☺️", "👋", "😉"};
    }

    public MessageSeeletterFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31634k = new String[]{"❤️", "☺️", "👋", "😉"};
    }
}
