package com.p051p1.mobile.putong.core.newui.explore;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongMvpFrag;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import p153l.btl;
import p153l.i4g0;
import p153l.jyb;
import p153l.o1j0;
import p153l.s9l;
import p153l.w9l;

/* JADX INFO: loaded from: classes11.dex */
public class HomeExploreFrag extends PutongMvpFrag<s9l, w9l> implements btl {

    /* JADX INFO: renamed from: B */
    public String f22133B;

    /* JADX INFO: renamed from: C */
    public String f22134C;

    /* JADX INFO: renamed from: P4 */
    private void m37355P4() {
        this.f22133B = getArguments().getString("key_from");
        this.f22134C = getArguments().getString("key_explore_type");
    }

    @Override // p153l.btl
    /* JADX INFO: renamed from: D0 */
    public void mo37356D0(View view, SwipeDirection swipeDirection) {
        v v2 = this.f17893A;
        if (v2 == 0) {
            return;
        }
        ((w9l) v2).m205592u(view, swipeDirection);
    }

    @Override // p153l.btl
    /* JADX INFO: renamed from: M3 */
    public void mo37357M3(boolean z, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        i4g0.m138495D("e_user_cant_rightswipe_reason", "p_tantanx_card", jyb.m147494Y("reason_type", str));
    }

    /* JADX INFO: renamed from: O4 */
    public void m37358O4() {
        ((w9l) this.f17893A).m205584j();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public s9l mo30639M4() {
        return new s9l(this, this.f22134C);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public w9l mo30640N4() {
        return new w9l(this);
    }

    /* JADX INFO: renamed from: S4 */
    public void m37361S4() {
        o1j0.m165651y("当前用户状态异常，请更新状态后尝试");
    }

    /* JADX INFO: renamed from: T4 */
    public void m37362T4() {
        ((w9l) this.f17893A).m205596y();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        m37355P4();
        super.mo21582d4();
    }

    @Override // p153l.btl
    /* JADX INFO: renamed from: f3 */
    public void mo37363f3(boolean z) {
        p p = this.f17894z;
        if (p == 0) {
            return;
        }
        ((s9l) p).m185216s0(z);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        ((w9l) this.f17893A).m205590r();
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpFrag, com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((w9l) this.f17893A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }
}
