package com.p046p1.mobile.putong.core.newui.newuserbatchgreet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import p149l.a1c0;
import p149l.cf40;
import p149l.d30;
import p149l.hf40;
import p149l.j760;
import p149l.szb0;
import p149l.vwb;

/* JADX INFO: loaded from: classes11.dex */
public class NewUserBatchGreetAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public cf40 f26334c;

    /* JADX INFO: renamed from: d */
    public hf40 f26335d;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$0() {
        this.f26335d.f107440j.setText("欢迎新人，热烈欢迎,欢迎新人，热烈欢迎,欢迎新人，热烈欢迎");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$1() {
        m43047e2(3);
    }

    /* JADX INFO: renamed from: a2 */
    public final cf40 m43043a2() {
        return new cf40(this);
    }

    /* JADX INFO: renamed from: b2 */
    public final hf40 m43044b2() {
        return new hf40(this);
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m43045c2() {
        m43047e2(6);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        setStatusBarColorResId(a1c0.f67143Y);
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m43046d2() {
        m43047e2(9);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public ArrayList<j760<String, d30>> debugItems() {
        ArrayList<j760<String, d30>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(vwb.m200311Y("预设文本", new d30() { // from class: l.pe40
            @Override // p149l.d30
            public final void call() {
                this.f148401a.lambda$debugItems$0();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("添加数量3", new d30() { // from class: l.qe40
            @Override // p149l.d30
            public final void call() {
                this.f153998a.lambda$debugItems$1();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("添加数量6", new d30() { // from class: l.re40
            @Override // p149l.d30
            public final void call() {
                this.f159031a.m43045c2();
            }
        }));
        arrayListDebugItems.add(vwb.m200311Y("添加数量9", new d30() { // from class: l.se40
            @Override // p149l.d30
            public final void call() {
                this.f163928a.m43046d2();
            }
        }));
        return arrayListDebugItems;
    }

    /* JADX INFO: renamed from: e2 */
    public final void m43047e2(int i) {
        ArrayList arrayList = new ArrayList();
        User userMe_ = CoreModule.m29932K().me_();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(userMe_);
        }
        this.f26335d.m130746p(arrayList);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        act().overridePendingTransition(0, szb0.f167027b);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f26335d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f26334c = m43043a2();
        hf40 hf40VarM43044b2 = m43044b2();
        this.f26335d = hf40VarM43044b2;
        this.f26334c.mo51532C(hf40VarM43044b2);
        this.f26335d.mo21065i1(this.f26334c);
        this.f26334c.mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
