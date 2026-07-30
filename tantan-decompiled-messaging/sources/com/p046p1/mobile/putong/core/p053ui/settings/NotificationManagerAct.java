package com.p046p1.mobile.putong.core.p053ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.SettingGroups;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VText;
import p149l.e30;
import p149l.irk;
import p149l.mkd0;
import p149l.mr40;
import p149l.yij0;

/* JADX INFO: loaded from: classes9.dex */
public class NotificationManagerAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VFrame f35839c;

    /* JADX INFO: renamed from: d */
    public VText f35840d;

    /* JADX INFO: renamed from: e */
    public VLinear f35841e;

    /* JADX INFO: renamed from: f */
    public VLinear f35842f;

    /* JADX INFO: renamed from: g */
    public VLinear f35843g;

    /* JADX INFO: renamed from: h */
    public VLinear f35844h;

    /* JADX INFO: renamed from: i */
    public VLinear f35845i;

    /* JADX INFO: renamed from: j */
    public VLinear f35846j;

    /* JADX INFO: renamed from: k */
    public VLinear f35847k;

    /* JADX INFO: renamed from: l */
    public VLinear f35848l;

    /* JADX INFO: renamed from: m */
    public VLinear f35849m;

    /* JADX INFO: renamed from: n */
    public SettingGroups f35850n;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m55019g2(View view) {
        this.f35850n.push.newMatchPush = Boolean.valueOf(yij0.m214942T(this.f35841e));
        m55028o2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m55020h2(View view) {
        this.f35850n.push.messagePush = Boolean.valueOf(yij0.m214942T(this.f35842f));
        m55028o2();
    }

    /* JADX INFO: renamed from: d2 */
    public View m55021d2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mr40.m156018b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e2 */
    public final void m55022e2() {
        yij0.m214964t(this.f35841e, this.f35850n.push.newMatchPush.booleanValue());
        yij0.m214964t(this.f35842f, this.f35850n.push.messagePush.booleanValue());
        yij0.m214964t(this.f35843g, this.f35850n.push.superLikePush.booleanValue());
        if (irk.m137901c()) {
            yij0.m214964t(this.f35845i, this.f35850n.fake.weeklyReportPush.booleanValue());
            yij0.m214964t(this.f35846j, this.f35850n.fake.dailyReportPush.booleanValue());
            yij0.m214964t(this.f35847k, this.f35850n.push.officialPush.booleanValue());
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m55023i2(View view) {
        this.f35850n.push.superLikePush = Boolean.valueOf(yij0.m214942T(this.f35843g));
        m55028o2();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m55021d2(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.fr40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98891a.m55025l2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m55024k2(View view) {
        this.f35850n.push.officialPush = Boolean.valueOf(yij0.m214942T(this.f35847k));
        m55028o2();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m55025l2(Bundle bundle) {
        this.f35850n = CoreModule.f17545c.f19639e0.f149253R.get().mo223809clone();
        m55022e2();
        this.f35841e.setOnClickListener(new View.OnClickListener() { // from class: l.gr40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104016a.m55019g2(view);
            }
        });
        this.f35842f.setOnClickListener(new View.OnClickListener() { // from class: l.hr40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109175a.m55020h2(view);
            }
        });
        this.f35843g.setOnClickListener(new View.OnClickListener() { // from class: l.ir40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114586a.m55023i2(view);
            }
        });
        if (irk.m137901c()) {
            this.f35847k.setVisibility(0);
            this.f35847k.setOnClickListener(new View.OnClickListener() { // from class: l.jr40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f119378a.m55024k2(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m55026m2(SettingGroups settingGroups) {
        this.f35850n = settingGroups;
        m55022e2();
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m55027n2(Throwable th) {
        this.f35850n = CoreModule.f17545c.f19639e0.f149253R.get().mo223809clone();
        m55022e2();
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: o2 */
    public final void m55028o2() {
        act().progress(act().getString(R$string.f17842J5), true);
        duringCreated(CoreModule.f17545c.f19639e0.m169369A9(this.f35850n.push)).subscribe(mkd0.m154956H(new e30() { // from class: l.kr40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f124321a.m55026m2((SettingGroups) obj);
            }
        }, new e30() { // from class: l.lr40
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129462a.m55027n2((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_pushmanagement_view";
    }
}
