package com.p000p1.mobile.putong.core.p001ui.likedusers.mytab;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.data.LikedUser;
import l.v9j;
import p007l.bgr;
import p007l.egr;
import p007l.nfr;
import p007l.stl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class LikedUsersMyTabFrag extends PutongFrag implements v9j<String>, stl {

    /* JADX INFO: renamed from: A */
    public egr f121A;

    /* JADX INFO: renamed from: B */
    public nfr f122B;

    /* JADX INFO: renamed from: z */
    public bgr f123z;

    @Override // p007l.stl
    /* JADX INFO: renamed from: G2 */
    public String mo451G2(boolean z) {
        return "p_navigation,ilike_module";
    }

    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "我喜欢";
    }

    /* JADX INFO: renamed from: N4 */
    public void m491N4() {
        this.f123z = new bgr(this);
        egr egrVar = new egr(this);
        this.f121A = egrVar;
        this.f123z.C(egrVar);
    }

    /* JADX INFO: renamed from: O4 */
    public nfr m492O4() {
        if (this.f122B == null) {
            this.f122B = new nfr(m494Q4());
        }
        return this.f122B;
    }

    /* JADX INFO: renamed from: P4 */
    public final egr m493P4() {
        if (this.f121A == null) {
            m491N4();
        }
        return this.f121A;
    }

    /* JADX INFO: renamed from: Q4 */
    public bgr m494Q4() {
        if (this.f123z == null) {
            m491N4();
        }
        return this.f123z;
    }

    @Override // p007l.stl
    /* JADX INFO: renamed from: Z0 */
    public void mo458Z0() {
        bgr bgrVar = this.f123z;
        bgrVar.f6320b = null;
        bgrVar.f6321c = null;
    }

    /* JADX INFO: renamed from: d4 */
    public void m495d4() {
        super.d4();
        m494Q4().m8884Z();
    }

    /* JADX INFO: renamed from: f4 */
    public void m496f4() {
        super.f4();
        m494Q4().m8885a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m497g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m493P4().inflateView(layoutInflater, viewGroup);
    }

    @Override // p007l.stl
    public void notifyDataSetChanged() {
        m492O4().notifyDataSetChanged();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (m494Q4().m8879H0(i, i2, intent)) {
            return;
        }
        super/*com.p1.mobile.android.app.Frag*/.onActivityResult(i, i2, intent);
    }

    public void onDestroy() {
        super/*com.p1.mobile.android.app.Frag*/.onDestroy();
        m494Q4().destroy();
        m493P4().destroy();
    }

    @Override // p007l.stl
    /* JADX INFO: renamed from: w0 */
    public void mo463w0(boolean z, String str, LikedUser likedUser) {
        if (!(z && TextUtils.isEmpty(str)) && TextUtils.isEmpty(str)) {
            this.f123z.m8881J0(likedUser);
        }
    }
}
