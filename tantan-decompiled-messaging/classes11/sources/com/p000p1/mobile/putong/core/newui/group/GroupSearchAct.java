package com.p000p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.PutongCoreAct;
import p009l.mik;
import p009l.wik;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GroupSearchAct extends PutongCoreAct {

    /* JADX INFO: renamed from: d */
    public mik f340d;

    /* JADX INFO: renamed from: e */
    public wik f341e;

    /* JADX INFO: renamed from: X1 */
    public static Intent m511X1(Context context) {
        return new Intent(context, (Class<?>) GroupSearchAct.class);
    }

    /* JADX INFO: renamed from: Y1 */
    public wik m512Y1() {
        return this.f341e;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f340d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initDataOnCreate();
        this.f340d = new mik(this);
        wik wikVar = new wik(this);
        this.f341e = wikVar;
        wikVar.C(this.f340d);
        this.f341e.m24234a0();
    }

    public String pageId() {
        return "p_search_result";
    }
}
