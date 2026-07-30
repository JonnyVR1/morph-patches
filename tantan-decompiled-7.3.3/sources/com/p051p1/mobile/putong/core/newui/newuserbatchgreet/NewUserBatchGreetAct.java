package com.p051p1.mobile.putong.core.newui.newuserbatchgreet;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import p153l.g9c0;
import p153l.jyb;
import p153l.pf60;
import p153l.qn40;
import p153l.vn40;
import p153l.x20;
import p153l.y7c0;

/* JADX INFO: loaded from: classes11.dex */
public class NewUserBatchGreetAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public qn40 f27076c;

    /* JADX INFO: renamed from: d */
    public vn40 f27077d;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$0() {
        this.f27077d.f184814j.setText("欢迎新人，热烈欢迎,欢迎新人，热烈欢迎,欢迎新人，热烈欢迎");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$debugItems$1() {
        m44058g2(3);
    }

    /* JADX INFO: renamed from: b2 */
    public final qn40 m44054b2() {
        return new qn40(this);
    }

    /* JADX INFO: renamed from: c2 */
    public final vn40 m44055c2() {
        return new vn40(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        super.checkGradientColors();
        setStatusBarColorResId(g9c0.f102807Y);
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m44056d2() {
        m44058g2(6);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public ArrayList<pf60<String, x20>> debugItems() {
        ArrayList<pf60<String, x20>> arrayListDebugItems = super.debugItems();
        arrayListDebugItems.add(jyb.m147494Y("预设文本", new x20() { // from class: l.dn40
            @Override // p153l.x20
            public final void call() {
                this.f89755a.lambda$debugItems$0();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("添加数量3", new x20() { // from class: l.en40
            @Override // p153l.x20
            public final void call() {
                this.f94725a.lambda$debugItems$1();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("添加数量6", new x20() { // from class: l.fn40
            @Override // p153l.x20
            public final void call() {
                this.f99865a.m44056d2();
            }
        }));
        arrayListDebugItems.add(jyb.m147494Y("添加数量9", new x20() { // from class: l.gn40
            @Override // p153l.x20
            public final void call() {
                this.f105057a.m44057e2();
            }
        }));
        return arrayListDebugItems;
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m44057e2() {
        m44058g2(9);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        act().overridePendingTransition(0, y7c0.f197764b);
    }

    /* JADX INFO: renamed from: g2 */
    public final void m44058g2(int i) {
        ArrayList arrayList = new ArrayList();
        User userMe_ = CoreModule.m30930K().me_();
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(userMe_);
        }
        this.f27077d.m201912p(arrayList);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f27077d.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.f27076c = m44054b2();
        vn40 vn40VarM44055c2 = m44055c2();
        this.f27077d = vn40VarM44055c2;
        this.f27076c.mo52715C(vn40VarM44055c2);
        this.f27077d.mo22064i1(this.f27076c);
        this.f27076c.mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
    }
}
