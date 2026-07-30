package com.p051p1.mobile.putong.core.p058ui.vip.likers;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C0607k;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.data.User;
import p153l.cwl;
import p153l.nnr;
import p153l.pcj;

/* JADX INFO: loaded from: classes12.dex */
public class LikersFrag extends PutongFrag implements pcj<String>, C9127b.a, cwl {

    /* JADX INFO: renamed from: A */
    public nnr f38136A;

    /* JADX INFO: renamed from: B */
    public C9127b f38137B;

    /* JADX INFO: renamed from: C */
    public C9126a f38138C;

    /* JADX INFO: renamed from: z */
    public C9128c f38139z;

    @Override // p153l.cwl
    /* JADX INFO: renamed from: A1 */
    public boolean mo57757A1(@NonNull User user, boolean z) {
        return m57762P4().m57801A1(user, z);
    }

    @Override // p153l.pcj, java.util.concurrent.Callable
    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "喜欢我";
    }

    /* JADX INFO: renamed from: N4 */
    public void m57759N4() {
        this.f38139z = new C9128c(this);
        nnr nnrVar = new nnr(this);
        this.f38136A = nnrVar;
        this.f38139z.mo52715C(nnrVar);
    }

    @Override // p153l.cwl
    /* JADX INFO: renamed from: O2 */
    public int mo57760O2() {
        return m57762P4().getPageCount();
    }

    /* JADX INFO: renamed from: O4 */
    public void m57761O4() {
        if (TextUtils.equals("from_meet", m57765S4().m57873U0())) {
            Intent intent = new Intent();
            intent.putExtra("see_count", m57765S4().getSeeCount());
            act().setResult(-1, intent);
        }
    }

    /* JADX INFO: renamed from: P4 */
    public C9126a m57762P4() {
        if (this.f38138C == null) {
            this.f38138C = new C9126a(this);
        }
        return this.f38138C;
    }

    /* JADX INFO: renamed from: Q4 */
    public C0607k.e m57763Q4() {
        if (this.f38137B == null) {
            this.f38137B = new C9127b(this);
        }
        return this.f38137B;
    }

    /* JADX INFO: renamed from: R4 */
    public nnr m57764R4() {
        if (this.f38136A == null) {
            m57759N4();
        }
        return this.f38136A;
    }

    /* JADX INFO: renamed from: S4 */
    public C9128c m57765S4() {
        if (this.f38139z == null) {
            m57759N4();
        }
        return this.f38139z;
    }

    /* JADX INFO: renamed from: T4 */
    public boolean m57766T4(Menu menu) {
        return m57765S4().m57861F1(menu);
    }

    /* JADX INFO: renamed from: U4 */
    public void m57767U4(int i) {
        m57764R4().m163940X(i);
    }

    /* JADX INFO: renamed from: V4 */
    public void m57768V4(CharSequence charSequence) {
        m57764R4().setTitle(charSequence);
    }

    /* JADX INFO: renamed from: W4 */
    public void m57769W4(String str) {
        m57765S4().m57868N1(str);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.likers.C9127b.a
    /* JADX INFO: renamed from: b */
    public void mo57770b(User user, boolean z) {
        m57765S4().m57859E(user, z, false);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.likers.C9127b.a
    /* JADX INFO: renamed from: c */
    public void mo57771c(boolean z) {
        m57765S4().m57879c(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        m57765S4().mo40472Z();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        m57765S4().mo40473a0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m57764R4().inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.vip.likers.C9127b.a
    /* JADX INFO: renamed from: n */
    public boolean mo57772n() {
        return m57765S4().m57872Q1();
    }

    @Override // p153l.cwl
    public void notifyDataSetChanged() {
        m57762P4().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o */
    public boolean m57773o() {
        return m57765S4().m57860E1();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        m57765S4().destroy();
        m57764R4().destroy();
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_see_who_likes_me_view";
    }
}
