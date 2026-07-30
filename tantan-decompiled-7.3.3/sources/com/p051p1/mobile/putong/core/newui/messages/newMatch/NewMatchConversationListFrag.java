package com.p051p1.mobile.putong.core.newui.messages.newMatch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import p153l.dk30;
import p153l.mk30;

/* JADX INFO: loaded from: classes11.dex */
public class NewMatchConversationListFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public dk30 f26611A;

    /* JADX INFO: renamed from: z */
    public mk30 f26612z;

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return (NewMainAct) getActivity();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.f26611A = new dk30(this);
        mk30 mk30Var = new mk30(this);
        this.f26612z = mk30Var;
        this.f26611A.mo52715C(mk30Var);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        this.f26611A.mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f26612z.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_new_match";
    }
}
