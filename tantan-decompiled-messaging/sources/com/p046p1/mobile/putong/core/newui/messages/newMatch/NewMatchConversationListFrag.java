package com.p046p1.mobile.putong.core.newui.messages.newMatch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import p149l.pb30;
import p149l.yb30;

/* JADX INFO: loaded from: classes11.dex */
public class NewMatchConversationListFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public pb30 f25869A;

    /* JADX INFO: renamed from: z */
    public yb30 f25870z;

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return (NewMainAct) getActivity();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.f25869A = new pb30(this);
        yb30 yb30Var = new yb30(this);
        this.f25870z = yb30Var;
        this.f25869A.mo51532C(yb30Var);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        this.f25869A.mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f25870z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_new_match";
    }
}
