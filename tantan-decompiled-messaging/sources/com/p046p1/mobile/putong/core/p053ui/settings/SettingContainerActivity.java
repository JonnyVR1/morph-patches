package com.p046p1.mobile.putong.core.p053ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import p149l.e30;
import p149l.u4c0;

/* JADX INFO: loaded from: classes9.dex */
public class SettingContainerActivity extends PutongAct {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X1 */
    public void m55035X1(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("from");
        PutongFrag putongFragM55036Y1 = m55036Y1(stringExtra);
        if (putongFragM55036Y1 == null) {
            m66873d2();
            return;
        }
        AbstractC0427k abstractC0427kM2567m = getSupportFragmentManager().m2567m();
        abstractC0427kM2567m.m2812t(u4c0.f174232ec, putongFragM55036Y1, stringExtra);
        abstractC0427kM2567m.mo2708j();
    }

    /* JADX INFO: renamed from: Y1 */
    public final PutongFrag m55036Y1(String str) {
        return null;
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(u4c0.f174232ec);
        return frameLayout;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.cne0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81661a.m55035X1((Bundle) obj);
            }
        });
    }
}
