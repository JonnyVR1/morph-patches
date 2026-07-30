package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageSeeletterFooterView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VLinear;
import p153l.bnl0;
import p153l.clz;
import p153l.jye;
import p153l.qa00;
import p153l.u500;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class MessageSeeletterFooterView extends VLinear {

    /* JADX INFO: renamed from: c */
    public VFrame f32474c;

    /* JADX INFO: renamed from: d */
    public VDraweeView f32475d;

    /* JADX INFO: renamed from: e */
    public VFrame f32476e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f32477f;

    /* JADX INFO: renamed from: g */
    public VFrame f32478g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f32479h;

    /* JADX INFO: renamed from: i */
    public VFrame f32480i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f32481j;

    /* JADX INFO: renamed from: k */
    public String[] f32482k;

    public MessageSeeletterFooterView(Context context) {
        super(context);
        this.f32482k = new String[]{"❤️", "☺️", "👋", "😉"};
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m50104R(clz clzVar, String str) {
        if (CoreModule.m30933P().m143412i().mo180333H4()) {
            CoreModule.m30933P().m143412i().showProofAgeDlg(clzVar.act(), "chat_page_enter_text");
        } else {
            clzVar.m110914S6(str);
        }
    }

    /* JADX INFO: renamed from: W */
    public final void m50108W(View view) {
        u500.m194520a(this, view);
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m50109X(y20 y20Var, View view) {
        y20Var.call(this.f32482k[0]);
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m50110Y(y20 y20Var, View view) {
        y20Var.call(this.f32482k[0]);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m50111Z(y20 y20Var, View view) {
        y20Var.call(this.f32482k[1]);
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m50112a0(y20 y20Var, View view) {
        y20Var.call(this.f32482k[2]);
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m50113b0(y20 y20Var, View view) {
        y20Var.call(this.f32482k[3]);
    }

    /* JADX INFO: renamed from: c0 */
    public void m50114c0(final clz clzVar) {
        final y20 y20Var = new y20() { // from class: l.o500
            @Override // p153l.y20
            public final void call(Object obj) {
                MessageSeeletterFooterView.m50104R(clzVar, (String) obj);
            }
        };
        bnl0.m105509E0(this.f32474c, new View.OnClickListener() { // from class: l.p500
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150586a.m50109X(y20Var, view);
            }
        });
        bnl0.m105509E0(this.f32474c, new View.OnClickListener() { // from class: l.q500
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155643a.m50110Y(y20Var, view);
            }
        });
        bnl0.m105509E0(this.f32476e, new View.OnClickListener() { // from class: l.r500
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161267a.m50111Z(y20Var, view);
            }
        });
        bnl0.m105509E0(this.f32478g, new View.OnClickListener() { // from class: l.s500
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166306a.m50112a0(y20Var, view);
            }
        });
        bnl0.m105509E0(this.f32480i, new View.OnClickListener() { // from class: l.t500
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172168a.m50113b0(y20Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50108W(this);
        this.f32475d.setImageDrawable(new jye(getContext(), this.f32482k[0], 16.0f, qa00.m175859d(24.0f)));
        this.f32477f.setImageDrawable(new jye(getContext(), this.f32482k[1], 16.0f, qa00.m175859d(24.0f)));
        this.f32479h.setImageDrawable(new jye(getContext(), this.f32482k[2], 16.0f, qa00.m175859d(24.0f)));
        this.f32481j.setImageDrawable(new jye(getContext(), this.f32482k[3], 16.0f, qa00.m175859d(24.0f)));
    }

    public MessageSeeletterFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32482k = new String[]{"❤️", "☺️", "👋", "😉"};
    }

    public MessageSeeletterFooterView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32482k = new String[]{"❤️", "☺️", "👋", "😉"};
    }
}
