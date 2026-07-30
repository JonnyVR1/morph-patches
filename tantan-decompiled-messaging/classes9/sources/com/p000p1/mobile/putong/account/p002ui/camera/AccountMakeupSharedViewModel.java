package com.p000p1.mobile.putong.account.p002ui.camera;

import android.util.Pair;
import com.p000p1.mobile.putong.account.p002ui.camera.adapter.AccountMakeupPageAdapter;
import com.p000p1.mobile.putong.account.p002ui.camera.view.AccountMakeUpMenuView;
import l.jcl0;
import l.kt10;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountMakeupSharedViewModel extends jcl0 {

    /* JADX INFO: renamed from: a */
    public kt10<Integer> f646a = new kt10<>();

    /* JADX INFO: renamed from: b */
    public kt10<Integer> f647b = new kt10<>();

    /* JADX INFO: renamed from: c */
    public kt10<Integer> f648c = new kt10<>();

    /* JADX INFO: renamed from: d */
    public kt10<Integer> f649d = new kt10<>();

    /* JADX INFO: renamed from: e */
    public kt10<Integer> f650e = new kt10<>();

    /* JADX INFO: renamed from: f */
    public kt10<Integer> f651f = new kt10<>();

    /* JADX INFO: renamed from: g */
    public kt10<Pair<Integer, Integer>> f652g = new kt10<>();

    /* JADX INFO: renamed from: h */
    public kt10<Pair<Float, Boolean>> f653h = new kt10<>();

    /* JADX INFO: renamed from: i */
    public kt10<Pair<Float, Boolean>> f654i = new kt10<>();

    /* JADX INFO: renamed from: j */
    public kt10<xaj0<Boolean, Float, Float>> f655j = new kt10<>();

    /* JADX INFO: renamed from: k */
    public kt10<xaj0<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean>> f656k = new kt10<>();

    /* JADX INFO: renamed from: l */
    public kt10<xaj0<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean>> f657l = new kt10<>();

    /* JADX INFO: renamed from: m */
    public kt10<xaj0<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean>> f658m = new kt10<>();

    /* JADX INFO: renamed from: n */
    public kt10<xaj0<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean>> f659n = new kt10<>();

    /* JADX INFO: renamed from: o */
    public kt10<xaj0<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean>> f660o = new kt10<>();

    /* JADX INFO: renamed from: p */
    public kt10<xaj0<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean>> f661p = new kt10<>();

    /* JADX INFO: renamed from: q */
    public kt10<Pair<AccountMakeupPageAdapter.MakeupItem, Integer>> f662q = new kt10<>();

    /* JADX INFO: renamed from: a */
    public kt10<Pair<Float, Boolean>> m665a() {
        return this.f654i;
    }

    /* JADX INFO: renamed from: b */
    public kt10<xaj0<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean>> m666b() {
        return this.f657l;
    }

    /* JADX INFO: renamed from: c */
    public kt10<xaj0<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean>> m667c() {
        return this.f660o;
    }

    /* JADX INFO: renamed from: d */
    public kt10<xaj0<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean>> m668d() {
        return this.f661p;
    }

    /* JADX INFO: renamed from: e */
    public kt10<Pair<Float, Boolean>> m669e() {
        return this.f653h;
    }

    /* JADX INFO: renamed from: f */
    public kt10<xaj0<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean>> m670f() {
        return this.f658m;
    }

    /* JADX INFO: renamed from: g */
    public kt10<Pair<Integer, Integer>> m671g() {
        return this.f652g;
    }

    /* JADX INFO: renamed from: h */
    public kt10<xaj0<Boolean, Float, Float>> m672h() {
        return this.f655j;
    }

    /* JADX INFO: renamed from: i */
    public kt10<xaj0<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean>> m673i() {
        return this.f659n;
    }

    /* JADX INFO: renamed from: j */
    public kt10<Integer> m674j() {
        return this.f646a;
    }

    /* JADX INFO: renamed from: k */
    public void m675k(Pair<Float, Boolean> pair) {
        this.f654i.o(pair);
    }

    /* JADX INFO: renamed from: l */
    public kt10<xaj0<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean>> m676l() {
        return this.f656k;
    }

    /* JADX INFO: renamed from: m */
    public void m677m(Pair<Float, Boolean> pair) {
        this.f653h.o(pair);
    }

    /* JADX INFO: renamed from: n */
    public void m678n(xaj0<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> xaj0Var) {
        this.f656k.o(xaj0Var);
    }

    /* JADX INFO: renamed from: o */
    public void m679o(xaj0<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> xaj0Var) {
        this.f657l.o(xaj0Var);
    }

    /* JADX INFO: renamed from: p */
    public void m680p(xaj0<AccountMakeUpMenuView.MakeupCategory, Integer, Boolean> xaj0Var) {
        this.f660o.o(xaj0Var);
    }

    /* JADX INFO: renamed from: q */
    public void m681q(xaj0<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> xaj0Var) {
        this.f661p.o(xaj0Var);
    }

    /* JADX INFO: renamed from: r */
    public void m682r(xaj0<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> xaj0Var) {
        this.f658m.o(xaj0Var);
    }

    /* JADX INFO: renamed from: s */
    public void m683s(Pair<Integer, Integer> pair) {
        this.f652g.o(pair);
    }

    /* JADX INFO: renamed from: t */
    public void m684t(xaj0<Boolean, Float, Float> xaj0Var) {
        this.f655j.o(xaj0Var);
    }

    /* JADX INFO: renamed from: u */
    public void m685u(xaj0<AccountMakeupPageAdapter.MakeupItem, Integer, Boolean> xaj0Var) {
        this.f659n.o(xaj0Var);
    }

    /* JADX INFO: renamed from: v */
    public void m686v(int i) {
        this.f646a.o(Integer.valueOf(i));
    }
}
