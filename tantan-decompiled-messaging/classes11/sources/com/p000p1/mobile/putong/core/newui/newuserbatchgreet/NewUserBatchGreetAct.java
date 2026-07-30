package com.p000p1.mobile.putong.core.newui.newuserbatchgreet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import java.util.ArrayList;
import l.a1c0;
import l.d30;
import l.j760;
import l.szb0;
import l.vwb;
import p009l.cf40;
import p009l.hf40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewUserBatchGreetAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public cf40 f5112c;

    /* JADX INFO: renamed from: d */
    public hf40 f5113d;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$0() {
        this.f5113d.f14043j.setText("欢迎新人，热烈欢迎,欢迎新人，热烈欢迎,欢迎新人，热烈欢迎");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$1() {
        m7249e2(3);
    }

    /* JADX INFO: renamed from: a2 */
    public final cf40 m7245a2() {
        return new cf40(this);
    }

    /* JADX INFO: renamed from: b2 */
    public final hf40 m7246b2() {
        return new hf40(this);
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m7247c2() {
        m7249e2(6);
    }

    public void checkGradientColors() {
        super.checkGradientColors();
        setStatusBarColorResId(a1c0.Y);
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m7248d2() {
        m7249e2(9);
    }

    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(vwb.Y("预设文本", new d30() { // from class: l.pe40
            public final void call() {
                this.f18506a.lambda$debugItems$0();
            }
        }));
        arrayListDebugItems.add(vwb.Y("添加数量3", new d30() { // from class: l.qe40
            public final void call() {
                this.f19170a.lambda$debugItems$1();
            }
        }));
        arrayListDebugItems.add(vwb.Y("添加数量6", new d30() { // from class: l.re40
            public final void call() {
                this.f19783a.m7247c2();
            }
        }));
        arrayListDebugItems.add(vwb.Y("添加数量9", new d30() { // from class: l.se40
            public final void call() {
                this.f20208a.m7248d2();
            }
        }));
        return arrayListDebugItems;
    }

    /* JADX INFO: renamed from: e2 */
    public final void m7249e2(int i) {
        ArrayList arrayList = new ArrayList();
        User userMe_ = CoreModule.K().me_();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(userMe_);
        }
        this.f5113d.m15628p(arrayList);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        act().overridePendingTransition(0, szb0.b);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f5113d.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f5112c = m7245a2();
        hf40 hf40VarM7246b2 = m7246b2();
        this.f5113d = hf40VarM7246b2;
        this.f5112c.C(hf40VarM7246b2);
        this.f5113d.m15624i1(this.f5112c);
        this.f5112c.m12545Z();
    }

    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
