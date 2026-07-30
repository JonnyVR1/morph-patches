package com.p046p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.PutongCoreAct;
import p149l.mik;
import p149l.wik;

/* JADX INFO: loaded from: classes11.dex */
public class GroupSearchAct extends PutongCoreAct {

    /* JADX INFO: renamed from: d */
    public mik f21562d;

    /* JADX INFO: renamed from: e */
    public wik f21563e;

    /* JADX INFO: renamed from: X1 */
    public static Intent m36572X1(Context context) {
        return new Intent(context, (Class<?>) GroupSearchAct.class);
    }

    /* JADX INFO: renamed from: Y1 */
    public wik m36573Y1() {
        return this.f21563e;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f21562d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f21562d = new mik(this);
        wik wikVar = new wik(this);
        this.f21563e = wikVar;
        wikVar.mo51532C(this.f21562d);
        this.f21563e.mo39470a0();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_search_result";
    }
}
