package com.p046p1.mobile.putong.core.p053ui.likedusers.mytab;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.LikedUser;
import p149l.bgr;
import p149l.egr;
import p149l.nfr;
import p149l.stl;
import p149l.v9j;

/* JADX INFO: loaded from: classes12.dex */
public class LikedUsersMyTabFrag extends PutongFrag implements v9j<String>, stl {

    /* JADX INFO: renamed from: A */
    public egr f30012A;

    /* JADX INFO: renamed from: B */
    public nfr f30013B;

    /* JADX INFO: renamed from: z */
    public bgr f30014z;

    @Override // p149l.stl
    /* JADX INFO: renamed from: G2 */
    public String mo46779G2(boolean z) {
        return "p_navigation,ilike_module";
    }

    @Override // p149l.v9j, java.util.concurrent.Callable
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "我喜欢";
    }

    /* JADX INFO: renamed from: N4 */
    public void m46816N4() {
        this.f30014z = new bgr(this);
        egr egrVar = new egr(this);
        this.f30012A = egrVar;
        this.f30014z.mo51532C(egrVar);
    }

    /* JADX INFO: renamed from: O4 */
    public nfr m46817O4() {
        if (this.f30013B == null) {
            this.f30013B = new nfr(m46819Q4());
        }
        return this.f30013B;
    }

    /* JADX INFO: renamed from: P4 */
    public final egr m46818P4() {
        if (this.f30012A == null) {
            m46816N4();
        }
        return this.f30012A;
    }

    /* JADX INFO: renamed from: Q4 */
    public bgr m46819Q4() {
        if (this.f30014z == null) {
            m46816N4();
        }
        return this.f30014z;
    }

    @Override // p149l.stl
    /* JADX INFO: renamed from: Z0 */
    public void mo46786Z0() {
        bgr bgrVar = this.f30014z;
        bgrVar.f75486b = null;
        bgrVar.f75487c = null;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        m46819Q4().mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m46819Q4().mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m46818P4().inflateView(layoutInflater, viewGroup);
    }

    @Override // p149l.stl
    public void notifyDataSetChanged() {
        m46817O4().notifyDataSetChanged();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (m46819Q4().m101701H0(i, i2, intent)) {
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m46819Q4().destroy();
        m46818P4().destroy();
    }

    @Override // p149l.stl
    /* JADX INFO: renamed from: w0 */
    public void mo46788w0(boolean z, String str, LikedUser likedUser) {
        if (!(z && TextUtils.isEmpty(str)) && TextUtils.isEmpty(str)) {
            this.f30014z.m101703J0(likedUser);
        }
    }
}
