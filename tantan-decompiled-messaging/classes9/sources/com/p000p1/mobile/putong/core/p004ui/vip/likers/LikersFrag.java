package com.p000p1.mobile.putong.core.p004ui.vip.likers;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.data.User;
import l.v9j;
import p006l.mlr;
import p006l.otl;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class LikersFrag extends PutongFrag implements v9j<String>, C0400b.a, otl {

    /* JADX INFO: renamed from: A */
    public mlr f7069A;

    /* JADX INFO: renamed from: B */
    public C0400b f7070B;

    /* JADX INFO: renamed from: C */
    public C0399a f7071C;

    /* JADX INFO: renamed from: z */
    public C0401c f7072z;

    @Override // p006l.otl
    /* JADX INFO: renamed from: A1 */
    public boolean mo10016A1(@NonNull User user, boolean z) {
        return m10021P4().m10062A1(user, z);
    }

    /* JADX INFO: renamed from: M4, reason: merged with bridge method [inline-methods] */
    public String call() {
        return "喜欢我";
    }

    /* JADX INFO: renamed from: N4 */
    public void m10018N4() {
        this.f7072z = new C0401c(this);
        mlr mlrVar = new mlr(this);
        this.f7069A = mlrVar;
        this.f7072z.C(mlrVar);
    }

    @Override // p006l.otl
    /* JADX INFO: renamed from: O2 */
    public int mo10019O2() {
        return m10021P4().m10063C();
    }

    /* JADX INFO: renamed from: O4 */
    public void m10020O4() {
        if (TextUtils.equals("from_meet", m10024S4().m10147U0())) {
            Intent intent = new Intent();
            intent.putExtra("see_count", m10024S4().getSeeCount());
            act().setResult(-1, intent);
        }
    }

    /* JADX INFO: renamed from: P4 */
    public C0399a m10021P4() {
        if (this.f7071C == null) {
            this.f7071C = new C0399a(this);
        }
        return this.f7071C;
    }

    /* JADX INFO: renamed from: Q4 */
    public k.e m10022Q4() {
        if (this.f7070B == null) {
            this.f7070B = new C0400b(this);
        }
        return this.f7070B;
    }

    /* JADX INFO: renamed from: R4 */
    public mlr m10023R4() {
        if (this.f7069A == null) {
            m10018N4();
        }
        return this.f7069A;
    }

    /* JADX INFO: renamed from: S4 */
    public C0401c m10024S4() {
        if (this.f7072z == null) {
            m10018N4();
        }
        return this.f7072z;
    }

    /* JADX INFO: renamed from: T4 */
    public boolean m10025T4(Menu menu) {
        return m10024S4().m10135F1(menu);
    }

    /* JADX INFO: renamed from: U4 */
    public void m10026U4(int i) {
        m10023R4().m19311X(i);
    }

    /* JADX INFO: renamed from: V4 */
    public void m10027V4(CharSequence charSequence) {
        m10023R4().setTitle(charSequence);
    }

    /* JADX INFO: renamed from: W4 */
    public void m10028W4(String str) {
        m10024S4().m10142N1(str);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.likers.C0400b.a
    /* JADX INFO: renamed from: b */
    public void mo10029b(User user, boolean z) {
        m10024S4().m10133E(user, z, false);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.likers.C0400b.a
    /* JADX INFO: renamed from: c */
    public void mo10030c(boolean z) {
        m10024S4().m10155c(z);
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: d4 */
    public void mo1548d4() {
        super.mo1548d4();
        m10024S4().m10151Z();
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: f4 */
    public void mo1549f4() {
        super.mo1549f4();
        m10024S4().m10152a0();
    }

    /* JADX INFO: renamed from: g4 */
    public void m10031g4(Bundle bundle) {
        super.g4(bundle);
    }

    @Nullable
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m10023R4().inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.vip.likers.C0400b.a
    /* JADX INFO: renamed from: n */
    public boolean mo10032n() {
        return m10024S4().m10146Q1();
    }

    @Override // p006l.otl
    public void notifyDataSetChanged() {
        m10021P4().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: o */
    public boolean m10033o() {
        return m10024S4().m10134E1();
    }

    public void onDestroy() {
        super.onDestroy();
        m10024S4().destroy();
        m10023R4().destroy();
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    public String pageId() {
        return "p_see_who_likes_me_view";
    }
}
