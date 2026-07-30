package com.p046p1.mobile.putong.core.p053ui.vip.likers;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C0605k;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.data.User;
import p149l.mlr;
import p149l.otl;
import p149l.v9j;

/* JADX INFO: loaded from: classes9.dex */
public class LikersFrag extends PutongFrag implements v9j<String>, C8964b.a, otl {

    /* JADX INFO: renamed from: A */
    public mlr f37288A;

    /* JADX INFO: renamed from: B */
    public C8964b f37289B;

    /* JADX INFO: renamed from: C */
    public C8963a f37290C;

    /* JADX INFO: renamed from: z */
    public C8965c f37291z;

    @Override // p149l.otl
    /* JADX INFO: renamed from: A1 */
    public boolean mo56574A1(@NonNull User user, boolean z) {
        return m56579P4().m56618A1(user, z);
    }

    @Override // p149l.v9j, java.util.concurrent.Callable
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "喜欢我";
    }

    /* JADX INFO: renamed from: N4 */
    public void m56576N4() {
        this.f37291z = new C8965c(this);
        mlr mlrVar = new mlr(this);
        this.f37288A = mlrVar;
        this.f37291z.mo51532C(mlrVar);
    }

    @Override // p149l.otl
    /* JADX INFO: renamed from: O2 */
    public int mo56577O2() {
        return m56579P4().getPageCount();
    }

    /* JADX INFO: renamed from: O4 */
    public void m56578O4() {
        if (TextUtils.equals("from_meet", m56582S4().m56690U0())) {
            Intent intent = new Intent();
            intent.putExtra("see_count", m56582S4().getSeeCount());
            act().setResult(-1, intent);
        }
    }

    /* JADX INFO: renamed from: P4 */
    public C8963a m56579P4() {
        if (this.f37290C == null) {
            this.f37290C = new C8963a(this);
        }
        return this.f37290C;
    }

    /* JADX INFO: renamed from: Q4 */
    public C0605k.e m56580Q4() {
        if (this.f37289B == null) {
            this.f37289B = new C8964b(this);
        }
        return this.f37289B;
    }

    /* JADX INFO: renamed from: R4 */
    public mlr m56581R4() {
        if (this.f37288A == null) {
            m56576N4();
        }
        return this.f37288A;
    }

    /* JADX INFO: renamed from: S4 */
    public C8965c m56582S4() {
        if (this.f37291z == null) {
            m56576N4();
        }
        return this.f37291z;
    }

    /* JADX INFO: renamed from: T4 */
    public boolean m56583T4(Menu menu) {
        return m56582S4().m56678F1(menu);
    }

    /* JADX INFO: renamed from: U4 */
    public void m56584U4(int i) {
        m56581R4().m155229X(i);
    }

    /* JADX INFO: renamed from: V4 */
    public void m56585V4(CharSequence charSequence) {
        m56581R4().setTitle(charSequence);
    }

    /* JADX INFO: renamed from: W4 */
    public void m56586W4(String str) {
        m56582S4().m56685N1(str);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.likers.C8964b.a
    /* JADX INFO: renamed from: b */
    public void mo56587b(User user, boolean z) {
        m56582S4().m56676E(user, z, false);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.likers.C8964b.a
    /* JADX INFO: renamed from: c */
    public void mo56588c(boolean z) {
        m56582S4().m56696c(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        m56582S4().mo39469Z();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        m56582S4().mo39470a0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m56581R4().inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.vip.likers.C8964b.a
    /* JADX INFO: renamed from: n */
    public boolean mo56589n() {
        return m56582S4().m56689Q1();
    }

    @Override // p149l.otl
    public void notifyDataSetChanged() {
        m56579P4().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o */
    public boolean m56590o() {
        return m56582S4().m56677E1();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m56582S4().destroy();
        m56581R4().destroy();
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_see_who_likes_me_view";
    }
}
