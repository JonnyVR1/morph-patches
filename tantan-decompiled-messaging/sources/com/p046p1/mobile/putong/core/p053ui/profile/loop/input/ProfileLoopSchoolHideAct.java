package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

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
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.tantanapp.common.utils.NullChecker;
import p147v.VSwitch;
import p149l.a5c0;
import p149l.e30;
import p149l.hka0;
import p149l.n6c0;
import p149l.ura;
import p149l.xdl0;
import p149l.yij0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopSchoolHideAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public TextView f33521c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f33522d;

    /* JADX INFO: renamed from: e */
    public VSwitch f33523e;

    /* JADX INFO: renamed from: a2 */
    public static Intent m51666a2(Context context) {
        return new Intent(context, (Class<?>) ProfileLoopSchoolHideAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public /* synthetic */ void m51667b2(Bundle bundle) {
        m51669r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m51668c2(View view) {
        ura.m195053e().m195057d().mo33757Uc().settings.getSettingGroup().privacy.hideSchool = Boolean.valueOf(yij0.m214942T(this.f33522d));
    }

    /* JADX INFO: renamed from: r */
    private void m51669r() {
        if (!NullChecker.m81303a(ura.m195053e().m195057d().mo33757Uc())) {
            act().lambda$debugItems$19();
            return;
        }
        setTitle("学校");
        if (NullChecker.m81303a(ura.m195053e().m195057d().mo33757Uc())) {
            this.f33521c.setText(ura.m195053e().m195057d().mo33757Uc().profile.studies.school);
            yij0.m214964t(this.f33522d, ura.m195053e().m195057d().mo33757Uc().settings.hideSchoolName());
            this.f33522d.setOnClickListener(new View.OnClickListener() { // from class: l.gka0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f103180a.m51668c2(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public View m51670Z1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hka0.m131462b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m51671d2(View view) {
        m51672e2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public final void m51672e2() {
        setResult(-1, new Intent());
        lambda$debugItems$19();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m51670Z1(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.fka0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98053a.m51667b2((Bundle) obj);
            }
        });
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(getString(R$string.f27839e));
        menuItemAdd.setActionView(n6c0.f137380u);
        xdl0.m208329E0(menuItemAdd.getActionView().findViewById(a5c0.f67661O), new View.OnClickListener() { // from class: l.eka0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f91962a.m51671d2(view);
            }
        });
        menuItemAdd.setShowAsAction(2);
        return super.onCreateOptionsMenu(menu);
    }
}
