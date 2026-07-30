package com.p000p1.mobile.putong.core.p004ui.seepage.likers;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.app.PutongFrag;
import l.v9j;
import p006l.l0g;
import p006l.tae0;
import p006l.tyf;
import p006l.yzf;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class FakeLikersFrag extends PutongFrag implements v9j<String> {

    /* JADX INFO: renamed from: A */
    public l0g f5560A;

    /* JADX INFO: renamed from: B */
    public tyf f5561B;

    /* JADX INFO: renamed from: z */
    public yzf f5562z;

    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "喜欢我";
    }

    /* JADX INFO: renamed from: N4 */
    public void m8323N4() {
        this.f5562z = new yzf(this);
        l0g l0gVar = new l0g(this);
        this.f5560A = l0gVar;
        this.f5562z.m28497C(l0gVar);
    }

    /* JADX INFO: renamed from: O4 */
    public tyf m8324O4() {
        if (this.f5561B == null) {
            this.f5561B = new tyf(this);
        }
        return this.f5561B;
    }

    /* JADX INFO: renamed from: P4 */
    public l0g m8325P4() {
        if (this.f5560A == null) {
            m8323N4();
        }
        return this.f5560A;
    }

    /* JADX INFO: renamed from: Q4 */
    public yzf m8326Q4() {
        if (this.f5562z == null) {
            m8323N4();
        }
        return this.f5562z;
    }

    /* JADX INFO: renamed from: R4 */
    public void m8327R4(int i) {
        m8325P4().m18477Z(i);
    }

    /* JADX INFO: renamed from: S4 */
    public void m8328S4(CharSequence charSequence) {
        m8325P4().m18478a0(charSequence);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: d4 */
    public void mo1548d4() {
        super.mo1548d4();
        m8326Q4().m28509Z();
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: f4 */
    public void mo1549f4() {
        super.mo1549f4();
        m8326Q4().m28510a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m8329g4(Bundle bundle) {
        super.g4(bundle);
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8325P4().inflateView(layoutInflater, viewGroup);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
    }

    public void onDestroy() {
        super.onDestroy();
        m8326Q4().destroy();
        m8325P4().destroy();
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putBoolean("price_recall_shown", tae0.m24547h().m24560o());
        super/*androidx.fragment.app.Fragment*/.onSaveInstanceState(bundle);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public String pageId() {
        return "p_see_who_likes_me_view";
    }
}
