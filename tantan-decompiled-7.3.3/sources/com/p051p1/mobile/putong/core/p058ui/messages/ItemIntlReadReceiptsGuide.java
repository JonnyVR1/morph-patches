package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import p151v.VLinear;
import p151v.VText_NoTopPadding;
import p153l.bnl0;
import p153l.edc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.n100;
import p153l.w20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class ItemIntlReadReceiptsGuide extends VLinear {

    /* JADX INFO: renamed from: c */
    public VText_NoTopPadding f31895c;

    /* JADX INFO: renamed from: d */
    public VText_NoTopPadding f31896d;

    public ItemIntlReadReceiptsGuide(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m49415T(View view) {
        m49417W();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m49416V(View view) {
        m49417W();
    }

    /* JADX INFO: renamed from: W */
    private void m49417W() {
        CoreModule.m30933P().m143405a().mo34575qm(w20.m204489d(), "p_chat_view,e_intl_im_readreceipt_btn,click", Privilege.message_read_state, new y20() { // from class: l.a7q
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68837a.m49418S((PurchaseType) obj);
            }
        });
        i4g0.m138523u("e_intl_im_readreceipt_btn", OMSDialogPositon.p_chat_view, jyb.m147494Y("readreceipt_entrance", "0_message"));
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m49418S(PurchaseType purchaseType) {
        bnl0.m105524M(this, false);
    }

    /* JADX INFO: renamed from: X */
    public void m49419X(User user, Message message, n100 n100Var) {
        if (user == null || message == null) {
            return;
        }
        this.f31895c.setText(String.format(App.f16088e.getString(R$string.f21857w6), user.isFemale() ? App.f16088e.getString(R$string.f21789o4) : App.f16088e.getString(R$string.f21780n4)));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31895c = (VText_NoTopPadding) findViewById(edc0.f93267Q4);
        this.f31896d = (VText_NoTopPadding) findViewById(edc0.f93244N);
        bnl0.m105509E0(this.f31895c, new View.OnClickListener() { // from class: l.y6q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f197705a.m49415T(view);
            }
        });
        bnl0.m105509E0(this.f31896d, new View.OnClickListener() { // from class: l.z6q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203175a.m49416V(view);
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
