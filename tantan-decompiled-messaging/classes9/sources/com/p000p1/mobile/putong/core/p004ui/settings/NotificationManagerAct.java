package com.p000p1.mobile.putong.core.p004ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p1.mobile.putong.data.SettingGroups;
import l.e30;
import l.mkd0;
import l.mr40;
import l.yij0;
import p006l.irk;
import v.VFrame;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class NotificationManagerAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VFrame f5620c;

    /* JADX INFO: renamed from: d */
    public VText f5621d;

    /* JADX INFO: renamed from: e */
    public VLinear f5622e;

    /* JADX INFO: renamed from: f */
    public VLinear f5623f;

    /* JADX INFO: renamed from: g */
    public VLinear f5624g;

    /* JADX INFO: renamed from: h */
    public VLinear f5625h;

    /* JADX INFO: renamed from: i */
    public VLinear f5626i;

    /* JADX INFO: renamed from: j */
    public VLinear f5627j;

    /* JADX INFO: renamed from: k */
    public VLinear f5628k;

    /* JADX INFO: renamed from: l */
    public VLinear f5629l;

    /* JADX INFO: renamed from: m */
    public VLinear f5630m;

    /* JADX INFO: renamed from: n */
    public SettingGroups f5631n;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m8385g2(View view) {
        this.f5631n.push.newMatchPush = Boolean.valueOf(yij0.T(this.f5622e));
        m8394o2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m8386h2(View view) {
        this.f5631n.push.messagePush = Boolean.valueOf(yij0.T(this.f5623f));
        m8394o2();
    }

    /* JADX INFO: renamed from: d2 */
    public View m8387d2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mr40.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e2 */
    public final void m8388e2() {
        yij0.t(this.f5622e, this.f5631n.push.newMatchPush.booleanValue());
        yij0.t(this.f5623f, this.f5631n.push.messagePush.booleanValue());
        yij0.t(this.f5624g, this.f5631n.push.superLikePush.booleanValue());
        if (irk.m16952c()) {
            yij0.t(this.f5626i, this.f5631n.fake.weeklyReportPush.booleanValue());
            yij0.t(this.f5627j, this.f5631n.fake.dailyReportPush.booleanValue());
            yij0.t(this.f5628k, this.f5631n.push.officialPush.booleanValue());
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m8389i2(View view) {
        this.f5631n.push.superLikePush = Boolean.valueOf(yij0.T(this.f5624g));
        m8394o2();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8387d2(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.fr40
            public final void call(Object obj) {
                this.f12868a.m8391l2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m8390k2(View view) {
        this.f5631n.push.officialPush = Boolean.valueOf(yij0.T(this.f5628k));
        m8394o2();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m8391l2(Bundle bundle) {
        this.f5631n = ((SettingGroups) CoreModule.f1534c.f3628e0.f18865R.get()).clone();
        m8388e2();
        this.f5622e.setOnClickListener(new View.OnClickListener() { // from class: l.gr40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13452a.m8385g2(view);
            }
        });
        this.f5623f.setOnClickListener(new View.OnClickListener() { // from class: l.hr40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14024a.m8386h2(view);
            }
        });
        this.f5624g.setOnClickListener(new View.OnClickListener() { // from class: l.ir40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14712a.m8389i2(view);
            }
        });
        if (irk.m16952c()) {
            this.f5628k.setVisibility(0);
            this.f5628k.setOnClickListener(new View.OnClickListener() { // from class: l.jr40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f15359a.m8390k2(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m8392m2(SettingGroups settingGroups) {
        this.f5631n = settingGroups;
        m8388e2();
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m8393n2(Throwable th) {
        this.f5631n = ((SettingGroups) CoreModule.f1534c.f3628e0.f18865R.get()).clone();
        m8388e2();
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: o2 */
    public final void m8394o2() {
        act().progress(act().getString(R$string.f1831J5), true);
        duringCreated(CoreModule.f1534c.f3628e0.m21332A9(this.f5631n.push)).subscribe(mkd0.H(new e30() { // from class: l.kr40
            public final void call(Object obj) {
                this.f15966a.m8392m2((SettingGroups) obj);
            }
        }, new e30() { // from class: l.lr40
            public final void call(Object obj) {
                this.f16584a.m8393n2((Throwable) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public String pageId() {
        return "p_pushmanagement_view";
    }
}
