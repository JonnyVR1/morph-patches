package com.p051p1.mobile.putong.core.p058ui.seepage.likers;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import p153l.h0g;
import p153l.m1g;
import p153l.pcj;
import p153l.yie0;
import p153l.z1g;

/* JADX INFO: loaded from: classes12.dex */
public class FakeLikersFrag extends PutongFrag implements pcj<String> {

    /* JADX INFO: renamed from: A */
    public z1g f36627A;

    /* JADX INFO: renamed from: B */
    public h0g f36628B;

    /* JADX INFO: renamed from: z */
    public m1g f36629z;

    @Override // p153l.pcj, java.util.concurrent.Callable
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "喜欢我";
    }

    /* JADX INFO: renamed from: N4 */
    public void m56142N4() {
        this.f36629z = new m1g(this);
        z1g z1gVar = new z1g(this);
        this.f36627A = z1gVar;
        this.f36629z.mo52715C(z1gVar);
    }

    /* JADX INFO: renamed from: O4 */
    public h0g m56143O4() {
        if (this.f36628B == null) {
            this.f36628B = new h0g(this);
        }
        return this.f36628B;
    }

    /* JADX INFO: renamed from: P4 */
    public z1g m56144P4() {
        if (this.f36627A == null) {
            m56142N4();
        }
        return this.f36627A;
    }

    /* JADX INFO: renamed from: Q4 */
    public m1g m56145Q4() {
        if (this.f36629z == null) {
            m56142N4();
        }
        return this.f36629z;
    }

    /* JADX INFO: renamed from: R4 */
    public void m56146R4(int i) {
        m56144P4().m218333Z(i);
    }

    /* JADX INFO: renamed from: S4 */
    public void m56147S4(CharSequence charSequence) {
        m56144P4().m218334a0(charSequence);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m56145Q4().mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m56145Q4().mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m56144P4().inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m56145Q4().destroy();
        m56144P4().destroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putBoolean("price_recall_shown", yie0.m216076h().m216089o());
        super.onSaveInstanceState(bundle);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_see_who_likes_me_view";
    }
}
