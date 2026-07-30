package com.p046p1.mobile.putong.core.p053ui.seepage.likers;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import p149l.l0g;
import p149l.tae0;
import p149l.tyf;
import p149l.v9j;
import p149l.yzf;

/* JADX INFO: loaded from: classes9.dex */
public class FakeLikersFrag extends PutongFrag implements v9j<String> {

    /* JADX INFO: renamed from: A */
    public l0g f35779A;

    /* JADX INFO: renamed from: B */
    public tyf f35780B;

    /* JADX INFO: renamed from: z */
    public yzf f35781z;

    @Override // p149l.v9j, java.util.concurrent.Callable
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "喜欢我";
    }

    /* JADX INFO: renamed from: N4 */
    public void m54959N4() {
        this.f35781z = new yzf(this);
        l0g l0gVar = new l0g(this);
        this.f35779A = l0gVar;
        this.f35781z.mo51532C(l0gVar);
    }

    /* JADX INFO: renamed from: O4 */
    public tyf m54960O4() {
        if (this.f35780B == null) {
            this.f35780B = new tyf(this);
        }
        return this.f35780B;
    }

    /* JADX INFO: renamed from: P4 */
    public l0g m54961P4() {
        if (this.f35779A == null) {
            m54959N4();
        }
        return this.f35779A;
    }

    /* JADX INFO: renamed from: Q4 */
    public yzf m54962Q4() {
        if (this.f35781z == null) {
            m54959N4();
        }
        return this.f35781z;
    }

    /* JADX INFO: renamed from: R4 */
    public void m54963R4(int i) {
        m54961P4().m148085Z(i);
    }

    /* JADX INFO: renamed from: S4 */
    public void m54964S4(CharSequence charSequence) {
        m54961P4().m148086a0(charSequence);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        m54962Q4().mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m54962Q4().mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m54961P4().inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m54962Q4().destroy();
        m54961P4().destroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putBoolean("price_recall_shown", tae0.m187705h().m187718o());
        super.onSaveInstanceState(bundle);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_see_who_likes_me_view";
    }
}
