package com.p051p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.PutongCoreAct;
import p153l.clk;
import p153l.mlk;

/* JADX INFO: loaded from: classes11.dex */
public class GroupSearchAct extends PutongCoreAct {

    /* JADX INFO: renamed from: d */
    public clk f22304d;

    /* JADX INFO: renamed from: e */
    public mlk f22305e;

    /* JADX INFO: renamed from: Y1 */
    public static Intent m37575Y1(Context context) {
        return new Intent(context, (Class<?>) GroupSearchAct.class);
    }

    /* JADX INFO: renamed from: Z1 */
    public mlk m37576Z1() {
        return this.f22305e;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f22304d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f22304d = new clk(this);
        mlk mlkVar = new mlk(this);
        this.f22305e = mlkVar;
        mlkVar.mo52715C(this.f22304d);
        this.f22305e.mo40473a0();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_search_result";
    }
}
