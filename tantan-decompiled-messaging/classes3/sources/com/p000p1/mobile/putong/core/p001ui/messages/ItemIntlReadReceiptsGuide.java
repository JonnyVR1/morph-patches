package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import l.c30;
import l.j760;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p003l.e30;
import p003l.qsz;
import p028v.VLinear;
import p028v.VText_NoTopPadding;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemIntlReadReceiptsGuide extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f938c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f939d;

    public ItemIntlReadReceiptsGuide(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m1314T(View view) {
        m1316W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m1315V(View view) {
        m1316W();
    }

    /* JADX INFO: renamed from: W */
    private void m1316W() {
        CoreModule.P().a().qm(c30.d(), "p_chat_view,e_intl_im_readreceipt_btn,click", Privilege.message_read_state, new e30() { // from class: l.a5q
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2081a.m1317S((PurchaseType) obj);
            }
        });
        zvf0.u("e_intl_im_readreceipt_btn", "p_chat_view", new j760[]{vwb.Y("readreceipt_entrance", "0_message")});
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m1317S(PurchaseType purchaseType) {
        xdl0.M(this, false);
    }

    /* JADX INFO: renamed from: X */
    public void m1318X(User user, Message message, qsz qszVar) {
        if (user == null || message == null) {
            return;
        }
        this.f938c.setText(String.format(App.e.getString(R.string.w6), user.isFemale() ? App.e.getString(R.string.o4) : App.e.getString(R.string.n4)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f938c = (VText_NoTopPadding) findViewById(y4c0.Q4);
        this.f939d = (VText_NoTopPadding) findViewById(y4c0.N);
        xdl0.E0(this.f938c, new View.OnClickListener() { // from class: l.y4q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8917a.m1314T(view);
            }
        });
        xdl0.E0(this.f939d, new View.OnClickListener() { // from class: l.z4q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9198a.m1315V(view);
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
