package com.p051p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.qa00;
import p153l.uum;

/* JADX INFO: loaded from: classes4.dex */
public class InputCallButton extends RelativeLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public VDraweeView f49361a;

    /* JADX INFO: renamed from: b */
    public AnimEffectPlayer f49362b;

    /* JADX INFO: renamed from: c */
    public View f49363c;

    public InputCallButton(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public final void m73339a(View view) {
        uum.m198210a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73340b(boolean z) {
        if (bnl0.m105529O0(this.f49361a) || bnl0.m105529O0(this.f49362b)) {
            if (z) {
                bnl0.m105524M(this.f49362b, true);
                bnl0.m105524M(this.f49361a, false);
                this.f49362b.m69683j("https://auto.tancdn.com/v1/raw/5a4eb7ec-aef8-40e8-abb3-25884bc4f3f510.so", -1);
            } else {
                bnl0.m105524M(this.f49361a, true);
                bnl0.m105524M(this.f49362b, false);
                this.f49362b.m69687n();
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public void m73341c(boolean z) {
        if (!z) {
            bnl0.m105524M(this, false);
            bnl0.m105524M(this.f49362b, false);
            bnl0.m105524M(this.f49361a, false);
        } else {
            bnl0.m105524M(this, true);
            bnl0.m105524M(this.f49361a, true);
            bnl0.m105524M(this.f49362b, false);
            this.f49362b.m69687n();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f49363c, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73339a(this);
    }

    public void setIcon(String str) {
        izs.m142869t("context_livingAct", this.f49361a, str, qa00.f156328o);
    }
}
