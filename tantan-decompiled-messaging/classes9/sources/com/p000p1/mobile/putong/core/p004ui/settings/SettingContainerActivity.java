package com.p000p1.mobile.putong.core.p004ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.app.PutongFrag;
import l.e30;
import p006l.u4c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SettingContainerActivity extends PutongAct {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X1 */
    public void m8401X1(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("from");
        PutongFrag putongFragM8402Y1 = m8402Y1(stringExtra);
        if (putongFragM8402Y1 == null) {
            finish();
            return;
        }
        k kVarM = getSupportFragmentManager().m();
        kVarM.t(u4c0.f22980ec, putongFragM8402Y1, stringExtra);
        kVarM.j();
    }

    /* JADX INFO: renamed from: Y1 */
    public final PutongFrag m8402Y1(String str) {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(u4c0.f22980ec);
        return frameLayout;
    }

    @Override // com.p000p1.mobile.putong.app.PutongAct
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.cne0
            public final void call(Object obj) {
                this.f9745a.m8401X1((Bundle) obj);
            }
        });
    }
}
