package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.NullChecker;
import p151v.VSwitch;
import p153l.bnl0;
import p153l.bsj0;
import p153l.gdc0;
import p153l.gta;
import p153l.lsa0;
import p153l.sec0;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSchoolHideAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public TextView f34369c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f34370d;

    /* JADX INFO: renamed from: e */
    public VSwitch f34371e;

    /* JADX INFO: renamed from: b2 */
    public static Intent m52849b2(Context context) {
        return new Intent(context, (Class<?>) ProfileLoopSchoolHideAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m52850c2(Bundle bundle) {
        m52852r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m52851d2(View view) {
        gta.m132210e().m132214d().mo34760Uc().settings.getSettingGroup().privacy.hideSchool = Boolean.valueOf(bsj0.m106262T(this.f34370d));
    }

    /* JADX INFO: renamed from: r */
    private void m52852r() {
        if (!NullChecker.m82486a(gta.m132210e().m132214d().mo34760Uc())) {
            act().lambda$debugItems$19();
            return;
        }
        setTitle("学校");
        if (NullChecker.m82486a(gta.m132210e().m132214d().mo34760Uc())) {
            this.f34369c.setText(gta.m132210e().m132214d().mo34760Uc().profile.studies.school);
            bsj0.m106284t(this.f34370d, gta.m132210e().m132214d().mo34760Uc().settings.hideSchoolName());
            this.f34370d.setOnClickListener(new View.OnClickListener() { // from class: l.ksa0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f128553a.m52851d2(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a2 */
    public View m52853a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lsa0.m155686b(this, layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m52854e2(View view) {
        m52855g2();
    }

    /* JADX INFO: renamed from: g2 */
    public final void m52855g2() {
        setResult(-1, new Intent());
        lambda$debugItems$19();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m52853a2(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new y20() { // from class: l.jsa0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122445a.m52850c2((Bundle) obj);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(getString(R$string.f28687e));
        menuItemAdd.setActionView(sec0.f167594u);
        bnl0.m105509E0(menuItemAdd.getActionView().findViewById(gdc0.f103656O), new View.OnClickListener() { // from class: l.isa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f116637a.m52854e2(view);
            }
        });
        menuItemAdd.setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }
}
