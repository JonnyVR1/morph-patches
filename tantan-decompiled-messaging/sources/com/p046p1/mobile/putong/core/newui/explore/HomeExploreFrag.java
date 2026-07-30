package com.p046p1.mobile.putong.core.newui.explore;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongMvpFrag;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import p149l.c7l;
import p149l.g7l;
import p149l.lsi0;
import p149l.pql;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeExploreFrag extends PutongMvpFrag<c7l, g7l> implements pql {

    /* JADX INFO: renamed from: B */
    public String f21391B;

    /* JADX INFO: renamed from: C */
    public String f21392C;

    /* JADX INFO: renamed from: P4 */
    private void m36352P4() {
        this.f21391B = getArguments().getString("key_from");
        this.f21392C = getArguments().getString("key_explore_type");
    }

    @Override // p149l.pql
    /* JADX INFO: renamed from: D0 */
    public void mo36353D0(View view, SwipeDirection swipeDirection) {
        v v2 = this.f17174A;
        if (v2 == 0) {
            return;
        }
        ((g7l) v2).m124711u(view, swipeDirection);
    }

    @Override // p149l.pql
    /* JADX INFO: renamed from: M3 */
    public void mo36354M3(boolean z, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        zvf0.m220371D("e_user_cant_rightswipe_reason", "p_tantanx_card", vwb.m200311Y("reason_type", str));
    }

    /* JADX INFO: renamed from: O4 */
    public void m36355O4() {
        ((g7l) this.f17174A).m124703j();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public c7l mo29641M4() {
        return new c7l(this, this.f21392C);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag
    /* JADX INFO: renamed from: R4, reason: merged with bridge method [inline-methods] */
    public g7l mo29642N4() {
        return new g7l(this);
    }

    /* JADX INFO: renamed from: S4 */
    public void m36358S4() {
        lsi0.m151595y("当前用户状态异常，请更新状态后尝试");
    }

    /* JADX INFO: renamed from: T4 */
    public void m36359T4() {
        ((g7l) this.f17174A).m124715y();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        m36352P4();
        super.mo20583d4();
    }

    @Override // p149l.pql
    /* JADX INFO: renamed from: f3 */
    public void mo36360f3(boolean z) {
        p p = this.f17175z;
        if (p == 0) {
            return;
        }
        ((c7l) p).m105592s0(z);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        ((g7l) this.f17174A).m124709r();
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpFrag, com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ((g7l) this.f17174A).inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }
}
