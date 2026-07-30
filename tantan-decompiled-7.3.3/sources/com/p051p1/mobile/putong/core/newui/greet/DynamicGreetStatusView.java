package com.p051p1.mobile.putong.core.newui.greet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.greet.DynamicGreetStatusView;
import com.p051p1.mobile.putong.core.newui.greet.NewTagStatusItem;
import com.p051p1.mobile.putong.core.newui.greet.tag.ImTagContainerLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import p151v.VFrame;
import p151v.VText;
import p153l.bnl0;
import p153l.cgc0;
import p153l.edc0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.l4g0;
import p153l.p9r;
import p153l.pej0;
import p153l.psd0;
import p153l.qec0;
import p153l.ri40;
import p153l.si40;
import p153l.tie;
import p153l.uxj0;
import p153l.w1e;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class DynamicGreetStatusView extends VFrame {

    /* JADX INFO: renamed from: a */
    public DynamicGreetStatusView f22242a;

    /* JADX INFO: renamed from: b */
    public VText f22243b;

    /* JADX INFO: renamed from: c */
    public VText f22244c;

    /* JADX INFO: renamed from: d */
    public ri40 f22245d;

    /* JADX INFO: renamed from: e */
    public Dialog f22246e;

    /* JADX INFO: renamed from: f */
    public Act f22247f;

    /* JADX INFO: renamed from: g */
    public Boolean f22248g;

    /* JADX INFO: renamed from: h */
    public Boolean f22249h;

    /* JADX INFO: renamed from: i */
    public si40[] f22250i;

    public DynamicGreetStatusView(Context context) {
        super(context);
        Boolean bool = Boolean.FALSE;
        this.f22248g = bool;
        this.f22249h = bool;
        this.f22250i = new si40[]{new si40(1, CoreModule.f18263b.getString(R$string.f21485E2), ibc0.f114076m0), new si40(2, CoreModule.f18263b.getString(R$string.f21493F2), ibc0.f114067l0)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m37476F(View view) {
        m37482B();
        this.f22248g = Boolean.TRUE;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m37479u(Throwable th) {
    }

    /* JADX INFO: renamed from: B */
    public void m37482B() {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_stranger_message_setting", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        this.f22246e = new pej0(getContext(), cgc0.f81648d);
        View viewInflate = p9r.m171370a(getContext()).inflate(qec0.f156860H, (ViewGroup) null);
        final ImTagContainerLayout imTagContainerLayout = (ImTagContainerLayout) viewInflate.findViewById(edc0.f93397k4);
        ri40 ri40Var = new ri40();
        this.f22245d = ri40Var;
        ri40Var.m154087k(new y20() { // from class: l.pie
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152528a.m37483C(imTagContainerLayout, (NewTagStatusItem) obj);
            }
        });
        imTagContainerLayout.setCanAdjustChildHeight(false);
        imTagContainerLayout.setAdapter(this.f22245d);
        this.f22245d.m181574o(Arrays.asList(this.f22250i));
        this.f22245d.m154088l(this.f22250i[!this.f22249h.booleanValue() ? 1 : 0]);
        this.f22245d.m154086j();
        this.f22246e.setContentView(viewInflate);
        this.f22246e.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.qie
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f157830a.m37484E(l4g0VarM204399c, dialogInterface);
            }
        });
        this.f22246e.show();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m37483C(ImTagContainerLayout imTagContainerLayout, NewTagStatusItem newTagStatusItem) {
        if (NullChecker.m82486a(newTagStatusItem)) {
            m37486K(imTagContainerLayout.indexOfChild(newTagStatusItem));
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m37484E(l4g0 l4g0Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
        this.f22248g = Boolean.FALSE;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m37485G(int i, uxj0 uxj0Var) {
        this.f22249h = Boolean.valueOf(i == 0);
        this.f22246e.dismiss();
    }

    /* JADX INFO: renamed from: K */
    public final void m37486K(final int i) {
        i4g0.m138523u("e_stranger_message_setting_button", "p_stranger_message_setting", jyb.m147494Y("stranger_message_state", i == 0 ? BLiveOperationTitleShowType.off : "open"));
        bnl0.m105525M0(this.f22244c, i == 0);
        bnl0.m105525M0(this.f22243b, i != 0);
        this.f22247f.duringCreated(CoreModule.f18264c.f20420r0.m35083D6(Boolean.valueOf(i == 0))).subscribe(psd0.m173597H(new y20() { // from class: l.rie
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163358a.m37485G(i, (uxj0) obj);
            }
        }, new y20() { // from class: l.sie
            @Override // p153l.y20
            public final void call(Object obj) {
                DynamicGreetStatusView.m37479u((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37487z(this);
        this.f22247f = (Act) bnl0.m105508E(this);
        bnl0.m105509E0(this.f22242a, new View.OnClickListener() { // from class: l.oie
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f147526a.m37476F(view);
            }
        });
    }

    public void setSelectTag(Boolean bool) {
        bnl0.m105525M0(this.f22244c, bool.booleanValue());
        bnl0.m105525M0(this.f22243b, !bool.booleanValue());
        this.f22249h = bool;
    }

    /* JADX INFO: renamed from: z */
    public final void m37487z(View view) {
        tie.m191329a(this, view);
    }

    public DynamicGreetStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Boolean bool = Boolean.FALSE;
        this.f22248g = bool;
        this.f22249h = bool;
        this.f22250i = new si40[]{new si40(1, CoreModule.f18263b.getString(R$string.f21485E2), ibc0.f114076m0), new si40(2, CoreModule.f18263b.getString(R$string.f21493F2), ibc0.f114067l0)};
    }

    public DynamicGreetStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Boolean bool = Boolean.FALSE;
        this.f22248g = bool;
        this.f22249h = bool;
        this.f22250i = new si40[]{new si40(1, CoreModule.f18263b.getString(R$string.f21485E2), ibc0.f114076m0), new si40(2, CoreModule.f18263b.getString(R$string.f21493F2), ibc0.f114067l0)};
    }
}
