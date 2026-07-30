package com.p000p1.mobile.putong.core.newui.explore;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.app.PutongMvpFrag;
import com.p1.mobile.putong.core.data.SwipeDirection;
import l.j760;
import l.jq2;
import l.lsi0;
import l.s7m;
import l.vwb;
import l.zvf0;
import p009l.c7l;
import p009l.g7l;
import p009l.pql;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeExploreFrag extends PutongMvpFrag<c7l, g7l> implements pql {

    /* JADX INFO: renamed from: B */
    public String f169B;

    /* JADX INFO: renamed from: C */
    public String f170C;

    /* JADX INFO: renamed from: P4 */
    private void m277P4() {
        this.f169B = getArguments().getString("key_from");
        this.f170C = getArguments().getString("key_explore_type");
    }

    @Override // p009l.pql
    /* JADX INFO: renamed from: D0 */
    public void mo278D0(View view, SwipeDirection swipeDirection) {
        s7m s7mVar = ((PutongMvpFrag) this).A;
        if (s7mVar == null) {
            return;
        }
        ((g7l) s7mVar).m14816u(view, swipeDirection);
    }

    @Override // p009l.pql
    /* JADX INFO: renamed from: M3 */
    public void mo279M3(boolean z, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zvf0.D("e_user_cant_rightswipe_reason", "p_tantanx_card", new j760[]{vwb.Y("reason_type", str)});
    }

    /* JADX INFO: renamed from: O4 */
    public void m282O4() {
        ((g7l) ((PutongMvpFrag) this).A).m14808j();
    }

    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public c7l m280M4() {
        return new c7l(this, this.f170C);
    }

    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public g7l m281N4() {
        return new g7l(this);
    }

    /* JADX INFO: renamed from: S4 */
    public void m285S4() {
        lsi0.y("当前用户状态异常，请更新状态后尝试");
    }

    /* JADX INFO: renamed from: T4 */
    public void m286T4() {
        ((g7l) ((PutongMvpFrag) this).A).m14820y();
    }

    /* JADX INFO: renamed from: d4 */
    public void m287d4() {
        m277P4();
        super.d4();
    }

    @Override // p009l.pql
    /* JADX INFO: renamed from: f3 */
    public void mo288f3(boolean z) {
        jq2 jq2Var = ((PutongMvpFrag) this).z;
        if (jq2Var == null) {
            return;
        }
        ((c7l) jq2Var).m12403s0(z);
    }

    /* JADX INFO: renamed from: g4 */
    public void m289g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        ((g7l) ((PutongMvpFrag) this).A).m14814r();
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((g7l) ((PutongMvpFrag) this).A).inflateView(layoutInflater, viewGroup);
    }

    public void onHiddenChanged(boolean z) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
    }
}
