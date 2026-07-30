package com.p046p1.mobile.putong.core.newui.greet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.greet.DynamicGreetStatusView;
import com.p046p1.mobile.putong.core.newui.greet.NewTagStatusItem;
import com.p046p1.mobile.putong.core.newui.greet.tag.ImTagContainerLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import p147v.VFrame;
import p147v.VText;
import p149l.c3c0;
import p149l.cwf0;
import p149l.da40;
import p149l.e30;
import p149l.ea40;
import p149l.i0e;
import p149l.l5j0;
import p149l.l6c0;
import p149l.mkd0;
import p149l.o7r;
import p149l.phe;
import p149l.roj0;
import p149l.vwb;
import p149l.x7c0;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class DynamicGreetStatusView extends VFrame {

    /* JADX INFO: renamed from: a */
    public DynamicGreetStatusView f21500a;

    /* JADX INFO: renamed from: b */
    public VText f21501b;

    /* JADX INFO: renamed from: c */
    public VText f21502c;

    /* JADX INFO: renamed from: d */
    public da40 f21503d;

    /* JADX INFO: renamed from: e */
    public Dialog f21504e;

    /* JADX INFO: renamed from: f */
    public Act f21505f;

    /* JADX INFO: renamed from: g */
    public Boolean f21506g;

    /* JADX INFO: renamed from: h */
    public Boolean f21507h;

    /* JADX INFO: renamed from: i */
    public ea40[] f21508i;

    public DynamicGreetStatusView(Context context) {
        super(context);
        Boolean bool = Boolean.FALSE;
        this.f21506g = bool;
        this.f21507h = bool;
        this.f21508i = new ea40[]{new ea40(1, CoreModule.f17544b.getString(R$string.f20743E2), c3c0.f78801m0), new ea40(2, CoreModule.f17544b.getString(R$string.f20751F2), c3c0.f78792l0)};
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F */
    public /* synthetic */ void m36473F(View view) {
        m36479B();
        this.f21506g = Boolean.TRUE;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m36476u(Throwable th) {
    }

    /* JADX INFO: renamed from: B */
    public void m36479B() {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_stranger_message_setting", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        this.f21504e = new l5j0(getContext(), x7c0.f191335d);
        View viewInflate = o7r.m163037a(getContext()).inflate(l6c0.f126304H, (ViewGroup) null);
        final ImTagContainerLayout imTagContainerLayout = (ImTagContainerLayout) viewInflate.findViewById(y4c0.f196162k4);
        da40 da40Var = new da40();
        this.f21503d = da40Var;
        da40Var.m198009k(new e30() { // from class: l.lhe
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128095a.m36480C(imTagContainerLayout, (NewTagStatusItem) obj);
            }
        });
        imTagContainerLayout.setCanAdjustChildHeight(false);
        imTagContainerLayout.setAdapter(this.f21503d);
        this.f21503d.m110563o(Arrays.asList(this.f21508i));
        this.f21503d.m198010l(this.f21508i[!this.f21507h.booleanValue() ? 1 : 0]);
        this.f21503d.m198008j();
        this.f21504e.setContentView(viewInflate);
        this.f21504e.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.mhe
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f133811a.m36481E(cwf0VarM133794c, dialogInterface);
            }
        });
        this.f21504e.show();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m36480C(ImTagContainerLayout imTagContainerLayout, NewTagStatusItem newTagStatusItem) {
        if (NullChecker.m81303a(newTagStatusItem)) {
            m36483K(imTagContainerLayout.indexOfChild(newTagStatusItem));
        }
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m36481E(cwf0 cwf0Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
        this.f21506g = Boolean.FALSE;
    }

    /* JADX INFO: renamed from: G */
    public final /* synthetic */ void m36482G(int i, roj0 roj0Var) {
        this.f21507h = Boolean.valueOf(i == 0);
        this.f21504e.dismiss();
    }

    /* JADX INFO: renamed from: K */
    public final void m36483K(final int i) {
        zvf0.m220399u("e_stranger_message_setting_button", "p_stranger_message_setting", vwb.m200311Y("stranger_message_state", i == 0 ? BLiveOperationTitleShowType.off : "open"));
        xdl0.m208345M0(this.f21502c, i == 0);
        xdl0.m208345M0(this.f21501b, i != 0);
        this.f21505f.duringCreated(CoreModule.f17545c.f19678r0.m34080D6(Boolean.valueOf(i == 0))).subscribe(mkd0.m154956H(new e30() { // from class: l.nhe
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138971a.m36482G(i, (roj0) obj);
            }
        }, new e30() { // from class: l.ohe
            @Override // p149l.e30
            public final void call(Object obj) {
                DynamicGreetStatusView.m36476u((Throwable) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36484z(this);
        this.f21505f = (Act) xdl0.m208328E(this);
        xdl0.m208329E0(this.f21500a, new View.OnClickListener() { // from class: l.khe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123142a.m36473F(view);
            }
        });
    }

    public void setSelectTag(Boolean bool) {
        xdl0.m208345M0(this.f21502c, bool.booleanValue());
        xdl0.m208345M0(this.f21501b, !bool.booleanValue());
        this.f21507h = bool;
    }

    /* JADX INFO: renamed from: z */
    public final void m36484z(View view) {
        phe.m168941a(this, view);
    }

    public DynamicGreetStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Boolean bool = Boolean.FALSE;
        this.f21506g = bool;
        this.f21507h = bool;
        this.f21508i = new ea40[]{new ea40(1, CoreModule.f17544b.getString(R$string.f20743E2), c3c0.f78801m0), new ea40(2, CoreModule.f17544b.getString(R$string.f20751F2), c3c0.f78792l0)};
    }

    public DynamicGreetStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Boolean bool = Boolean.FALSE;
        this.f21506g = bool;
        this.f21507h = bool;
        this.f21508i = new ea40[]{new ea40(1, CoreModule.f17544b.getString(R$string.f20743E2), c3c0.f78801m0), new ea40(2, CoreModule.f17544b.getString(R$string.f20751F2), c3c0.f78792l0)};
    }
}
