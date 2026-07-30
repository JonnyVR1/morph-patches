package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

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
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.profile.R;
import com.tantanapp.common.utils.NullChecker;
import l.a5c0;
import l.e30;
import l.hka0;
import l.n6c0;
import l.ura;
import l.xdl0;
import l.yij0;
import v.VSwitch;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopSchoolHideAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public TextView f1343c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f1344d;

    /* JADX INFO: renamed from: e */
    public VSwitch f1345e;

    /* JADX INFO: renamed from: a2 */
    public static Intent m2177a2(Context context) {
        return new Intent(context, (Class<?>) ProfileLoopSchoolHideAct.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public /* synthetic */ void m2178b2(Bundle bundle) {
        m2180r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m2179c2(View view) {
        ura.e().d().Uc().settings.getSettingGroup().privacy.hideSchool = Boolean.valueOf(yij0.T(this.f1344d));
    }

    /* JADX INFO: renamed from: r */
    private void m2180r() {
        if (!NullChecker.a(ura.e().d().Uc())) {
            act().finish();
            return;
        }
        setTitle("学校");
        if (NullChecker.a(ura.e().d().Uc())) {
            this.f1343c.setText(ura.e().d().Uc().profile.studies.school);
            yij0.t(this.f1344d, ura.e().d().Uc().settings.hideSchoolName());
            this.f1344d.setOnClickListener(new View.OnClickListener() { // from class: l.gka0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11483a.m2179c2(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public View m2181Z1(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return hka0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m2182d2(View view) {
        m2183e2();
    }

    public boolean disableAutoPV() {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e2 */
    public final void m2183e2() {
        setResult(-1, new Intent());
        finish();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m2181Z1(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        creates(new e30() { // from class: l.fka0
            public final void call(Object obj) {
                this.f10436a.m2178b2((Bundle) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuItem menuItemAdd = menu.add(getString(R.string.e));
        menuItemAdd.setActionView(n6c0.u);
        xdl0.E0(menuItemAdd.getActionView().findViewById(a5c0.O), new View.OnClickListener() { // from class: l.eka0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9835a.m2182d2(view);
            }
        });
        menuItemAdd.setShowAsAction(2);
        return super/*android.app.Activity*/.onCreateOptionsMenu(menu);
    }
}
