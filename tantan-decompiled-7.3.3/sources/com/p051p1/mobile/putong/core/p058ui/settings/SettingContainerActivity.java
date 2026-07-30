package com.p051p1.mobile.putong.core.p058ui.settings;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import p153l.adc0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class SettingContainerActivity extends PutongAct {
    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y1 */
    public void m56218Y1(Bundle bundle) {
        String stringExtra = getIntent().getStringExtra("from");
        PutongFrag putongFragM56219Z1 = m56219Z1(stringExtra);
        if (putongFragM56219Z1 == null) {
            m68056e2();
            return;
        }
        AbstractC0428k abstractC0428kM2568m = getSupportFragmentManager().m2568m();
        abstractC0428kM2568m.m2813t(adc0.f70357gc, putongFragM56219Z1, stringExtra);
        abstractC0428kM2568m.mo2709j();
    }

    /* JADX INFO: renamed from: Z1 */
    public final PutongFrag m56219Z1(String str) {
        return null;
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(this);
        frameLayout.setId(adc0.f70357gc);
        return frameLayout;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.jve0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122799a.m56218Y1((Bundle) obj);
            }
        });
    }
}
