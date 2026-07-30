package com.p000p1.mobile.putong.core.newui.messages.newMatch;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.app.PutongFrag;
import p009l.pb30;
import p009l.yb30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewMatchConversationListFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public pb30 f4647A;

    /* JADX INFO: renamed from: z */
    public yb30 f4648z;

    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return getActivity();
    }

    /* JADX INFO: renamed from: d4 */
    public void m6650d4() {
        super.d4();
        this.f4647A = new pb30(this);
        yb30 yb30Var = new yb30(this);
        this.f4648z = yb30Var;
        this.f4647A.C(yb30Var);
    }

    public boolean disableAutoPV() {
        return false;
    }

    /* JADX INFO: renamed from: f4 */
    public void m6651f4() {
        super.f4();
        this.f4647A.m20112a0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f4648z.inflateView(layoutInflater, viewGroup);
    }

    public String pageId() {
        return "p_new_match";
    }
}
