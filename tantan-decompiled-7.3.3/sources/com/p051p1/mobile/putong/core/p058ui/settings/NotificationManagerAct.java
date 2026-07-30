package com.p051p1.mobile.putong.core.p058ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.SettingGroups;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;
import p153l.b050;
import p153l.bsj0;
import p153l.psd0;
import p153l.y20;
import p153l.ytk;

/* JADX INFO: loaded from: classes12.dex */
public class NotificationManagerAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public VFrame f36687c;

    /* JADX INFO: renamed from: d */
    public VText f36688d;

    /* JADX INFO: renamed from: e */
    public VLinear f36689e;

    /* JADX INFO: renamed from: f */
    public VLinear f36690f;

    /* JADX INFO: renamed from: g */
    public VLinear f36691g;

    /* JADX INFO: renamed from: h */
    public VLinear f36692h;

    /* JADX INFO: renamed from: i */
    public VLinear f36693i;

    /* JADX INFO: renamed from: j */
    public VLinear f36694j;

    /* JADX INFO: renamed from: k */
    public VLinear f36695k;

    /* JADX INFO: renamed from: l */
    public VLinear f36696l;

    /* JADX INFO: renamed from: m */
    public VLinear f36697m;

    /* JADX INFO: renamed from: n */
    public SettingGroups f36698n;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m56202h2(View view) {
        this.f36698n.push.newMatchPush = Boolean.valueOf(bsj0.m106262T(this.f36689e));
        m56211p2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m56203i2(View view) {
        this.f36698n.push.messagePush = Boolean.valueOf(bsj0.m106262T(this.f36690f));
        m56211p2();
    }

    /* JADX INFO: renamed from: e2 */
    public View m56204e2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b050.m101263b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: g2 */
    public final void m56205g2() {
        bsj0.m106284t(this.f36689e, this.f36698n.push.newMatchPush.booleanValue());
        bsj0.m106284t(this.f36690f, this.f36698n.push.messagePush.booleanValue());
        bsj0.m106284t(this.f36691g, this.f36698n.push.superLikePush.booleanValue());
        if (ytk.m217339c()) {
            bsj0.m106284t(this.f36693i, this.f36698n.fake.weeklyReportPush.booleanValue());
            bsj0.m106284t(this.f36694j, this.f36698n.fake.dailyReportPush.booleanValue());
            bsj0.m106284t(this.f36695k, this.f36698n.push.officialPush.booleanValue());
        }
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m56204e2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.uz40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181701a.m56208m2((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m56206k2(View view) {
        this.f36698n.push.superLikePush = Boolean.valueOf(bsj0.m106262T(this.f36691g));
        m56211p2();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m56207l2(View view) {
        this.f36698n.push.officialPush = Boolean.valueOf(bsj0.m106262T(this.f36695k));
        m56211p2();
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m56208m2(Bundle bundle) {
        this.f36698n = CoreModule.f18264c.f20381e0.f89110R.get().mo225055clone();
        m56205g2();
        this.f36689e.setOnClickListener(new View.OnClickListener() { // from class: l.vz40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f186442a.m56202h2(view);
            }
        });
        this.f36690f.setOnClickListener(new View.OnClickListener() { // from class: l.wz40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191727a.m56203i2(view);
            }
        });
        this.f36691g.setOnClickListener(new View.OnClickListener() { // from class: l.xz40
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196832a.m56206k2(view);
            }
        });
        if (ytk.m217339c()) {
            this.f36695k.setVisibility(0);
            this.f36695k.setOnClickListener(new View.OnClickListener() { // from class: l.yz40
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f202171a.m56207l2(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m56209n2(SettingGroups settingGroups) {
        this.f36698n = settingGroups;
        m56205g2();
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m56210o2(Throwable th) {
        this.f36698n = CoreModule.f18264c.f20381e0.f89110R.get().mo225055clone();
        m56205g2();
        act().progressDismiss();
    }

    /* JADX INFO: renamed from: p2 */
    public final void m56211p2() {
        act().progress(act().getString(R$string.f18632L5), true);
        duringCreated(CoreModule.f18264c.f20381e0.m116442A9(this.f36698n.push)).subscribe(psd0.m173597H(new y20() { // from class: l.zz40
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206671a.m56209n2((SettingGroups) obj);
            }
        }, new y20() { // from class: l.a050
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f67689a.m56210o2((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_pushmanagement_view";
    }
}
