package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import p147v.VLinear;
import p147v.VText_NoTopPadding;
import p149l.c30;
import p149l.e30;
import p149l.qsz;
import p149l.vwb;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemIntlReadReceiptsGuide extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f31047c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f31048d;

    public ItemIntlReadReceiptsGuide(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m48232T(View view) {
        m48234W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m48233V(View view) {
        m48234W();
    }

    /* JADX INFO: renamed from: W */
    private void m48234W() {
        CoreModule.m29935P().m94651a().mo33572qm(c30.m104962d(), "p_chat_view,e_intl_im_readreceipt_btn,click", Privilege.message_read_state, new e30() { // from class: l.a5q
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67718a.m48235S((PurchaseType) obj);
            }
        });
        zvf0.m220399u("e_intl_im_readreceipt_btn", OMSDialogPositon.p_chat_view, vwb.m200311Y("readreceipt_entrance", "0_message"));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m48235S(PurchaseType purchaseType) {
        xdl0.m208344M(this, false);
    }

    /* JADX INFO: renamed from: X */
    public void m48236X(User user, Message message, qsz qszVar) {
        if (user == null || message == null) {
            return;
        }
        this.f31047c.setText(String.format(App.f15369e.getString(R$string.f21115w6), user.isFemale() ? App.f15369e.getString(R$string.f21047o4) : App.f15369e.getString(R$string.f21038n4)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31047c = (VText_NoTopPadding) findViewById(y4c0.f196032Q4);
        this.f31048d = (VText_NoTopPadding) findViewById(y4c0.f196009N);
        xdl0.m208329E0(this.f31047c, new View.OnClickListener() { // from class: l.y4q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196326a.m48232T(view);
            }
        });
        xdl0.m208329E0(this.f31048d, new View.OnClickListener() { // from class: l.z4q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201625a.m48233V(view);
            }
        });
    }

    public ItemIntlReadReceiptsGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemIntlReadReceiptsGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
