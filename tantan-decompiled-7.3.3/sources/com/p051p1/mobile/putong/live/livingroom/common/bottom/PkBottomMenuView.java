package com.p051p1.mobile.putong.live.livingroom.common.bottom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.izs;
import p153l.obc0;
import p153l.qa00;
import p153l.ss70;

/* JADX INFO: loaded from: classes4.dex */
public class PkBottomMenuView extends FrameLayout implements RedDot {

    /* JADX INFO: renamed from: a */
    public PkBottomMenuView f49376a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f49377b;

    /* JADX INFO: renamed from: c */
    public AnimEffectPlayer f49378c;

    /* JADX INFO: renamed from: d */
    public View f49379d;

    public PkBottomMenuView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m73369a(View view) {
        ss70.m187690a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m73370b() {
        bnl0.m105524M(this.f49377b, false);
        bnl0.m105524M(this.f49378c, true);
        this.f49378c.m69683j("https://auto.tancdn.com/v1/raw/b397b07f-304c-4a32-b675-4ff555a3a26411.pdf", -1);
    }

    /* JADX INFO: renamed from: c */
    public void m73371c() {
        bnl0.m105524M(this.f49377b, true);
        bnl0.m105524M(this.f49378c, false);
        this.f49378c.m69687n();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.common.bottom.RedDot
    /* JADX INFO: renamed from: g0 */
    public void mo73321g0(boolean z) {
        bnl0.m105524M(this.f49379d, z);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73369a(this);
    }

    public void setIcon(String str) {
        izs.m142870u("context_livingAct", this.f49377b, str, qa00.m175859d(44.0f), qa00.m175859d(38.0f));
    }

    public void setPkBackGround(boolean z) {
        if (z) {
            setBackgroundResource(0);
        } else {
            setBackgroundResource(obc0.f146188T);
        }
    }

    public PkBottomMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PkBottomMenuView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void setIcon(int i) {
        this.f49377b.setImageResource(i);
    }
}
