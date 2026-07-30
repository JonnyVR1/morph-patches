package com.p000p1.mobile.putong.core.newui.greet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.greet.DynamicGreetStatusView;
import com.p000p1.mobile.putong.core.newui.greet.NewTagStatusItem;
import com.p000p1.mobile.putong.core.newui.greet.tag.ImTagContainerLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import l.c3c0;
import l.cwf0;
import l.e30;
import l.j760;
import l.l5j0;
import l.l6c0;
import l.mkd0;
import l.phe;
import l.roj0;
import l.vwb;
import l.x7c0;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p009l.da40;
import p009l.ea40;
import p009l.i0e;
import p009l.o7r;
import v.VFrame;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class DynamicGreetStatusView extends VFrame {

    /* JADX INFO: renamed from: a */
    public DynamicGreetStatusView f278a;

    /* JADX INFO: renamed from: b */
    public VText f279b;

    /* JADX INFO: renamed from: c */
    public VText f280c;

    /* JADX INFO: renamed from: d */
    public da40 f281d;

    /* JADX INFO: renamed from: e */
    public Dialog f282e;

    /* JADX INFO: renamed from: f */
    public Act f283f;

    /* JADX INFO: renamed from: g */
    public Boolean f284g;

    /* JADX INFO: renamed from: h */
    public Boolean f285h;

    /* JADX INFO: renamed from: i */
    public ea40[] f286i;

    public DynamicGreetStatusView(Context context) {
        super(context);
        Boolean bool = Boolean.FALSE;
        this.f284g = bool;
        this.f285h = bool;
        this.f286i = new ea40[]{new ea40(1, CoreModule.b.getString(R.string.E2), c3c0.m0), new ea40(2, CoreModule.b.getString(R.string.F2), c3c0.l0)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m402F(View view) {
        m408B();
        this.f284g = Boolean.TRUE;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m405u(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public void m408B() {
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_stranger_message_setting", Dialog.class.getName());
        i0e.m16065f(cwf0VarM16062c);
        this.f282e = new l5j0(getContext(), x7c0.d);
        View viewInflate = o7r.m19649a(getContext()).inflate(l6c0.H, (ViewGroup) null);
        final ImTagContainerLayout imTagContainerLayout = (ImTagContainerLayout) viewInflate.findViewById(y4c0.k4);
        da40 da40Var = new da40();
        this.f281d = da40Var;
        da40Var.m23363k(new e30() { // from class: l.lhe
            public final void call(Object obj) {
                this.f16161a.m409C(imTagContainerLayout, (NewTagStatusItem) obj);
            }
        });
        imTagContainerLayout.setCanAdjustChildHeight(false);
        imTagContainerLayout.setAdapter(this.f281d);
        this.f281d.m13039o(Arrays.asList(this.f286i));
        this.f281d.m23364l(this.f286i[!this.f285h.booleanValue() ? 1 : 0]);
        this.f281d.m23362j();
        this.f282e.setContentView(viewInflate);
        this.f282e.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.mhe
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f16922a.m410E(cwf0VarM16062c, dialogInterface);
            }
        });
        this.f282e.show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m409C(ImTagContainerLayout imTagContainerLayout, NewTagStatusItem newTagStatusItem) {
        if (NullChecker.a(newTagStatusItem)) {
            m412K(imTagContainerLayout.indexOfChild(newTagStatusItem));
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m410E(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m16064e(cwf0Var);
        this.f284g = Boolean.FALSE;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m411G(int i, roj0 roj0Var) {
        this.f285h = Boolean.valueOf(i == 0);
        this.f282e.dismiss();
    }

    /* JADX INFO: renamed from: K */
    public final void m412K(final int i) {
        zvf0.u("e_stranger_message_setting_button", "p_stranger_message_setting", new j760[]{vwb.Y("stranger_message_state", i == 0 ? "off" : "open")});
        xdl0.M0(this.f280c, i == 0);
        xdl0.M0(this.f279b, i != 0);
        this.f283f.duringCreated(CoreModule.c.r0.D6(Boolean.valueOf(i == 0))).subscribe(mkd0.H(new e30() { // from class: l.nhe
            public final void call(Object obj) {
                this.f17467a.m411G(i, (roj0) obj);
            }
        }, new e30() { // from class: l.ohe
            public final void call(Object obj) {
                DynamicGreetStatusView.m405u((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m413z(this);
        this.f283f = xdl0.E(this);
        xdl0.E0(this.f278a, new View.OnClickListener() { // from class: l.khe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15676a.m402F(view);
            }
        });
    }

    public void setSelectTag(Boolean bool) {
        xdl0.M0(this.f280c, bool.booleanValue());
        xdl0.M0(this.f279b, !bool.booleanValue());
        this.f285h = bool;
    }

    /* JADX INFO: renamed from: z */
    public final void m413z(View view) {
        phe.a(this, view);
    }

    public DynamicGreetStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Boolean bool = Boolean.FALSE;
        this.f284g = bool;
        this.f285h = bool;
        this.f286i = new ea40[]{new ea40(1, CoreModule.b.getString(R.string.E2), c3c0.m0), new ea40(2, CoreModule.b.getString(R.string.F2), c3c0.l0)};
    }

    public DynamicGreetStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Boolean bool = Boolean.FALSE;
        this.f284g = bool;
        this.f285h = bool;
        this.f286i = new ea40[]{new ea40(1, CoreModule.b.getString(R.string.E2), c3c0.m0), new ea40(2, CoreModule.b.getString(R.string.F2), c3c0.l0)};
    }
}
