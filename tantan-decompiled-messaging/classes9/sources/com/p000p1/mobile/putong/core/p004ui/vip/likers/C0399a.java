package com.p000p1.mobile.putong.core.p004ui.vip.likers;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.view.LikersFilterItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.ui.home.member.likeme.adapter.item.LikeMeUserNoDataItem;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.d30;
import l.dac0;
import l.e51;
import l.j760;
import l.k6c0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p006l.gr9;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0399a extends dac0<User> {

    /* JADX INFO: renamed from: d */
    public C0401c f7108d;

    /* JADX INFO: renamed from: e */
    public LikersFrag f7109e;

    /* JADX INFO: renamed from: c */
    public ArrayList<User> f7107c = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public int f7111g = 0;

    /* JADX INFO: renamed from: h */
    public int f7112h = 0;

    /* JADX INFO: renamed from: i */
    public boolean f7113i = false;

    /* JADX INFO: renamed from: f */
    public final boolean f7110f = false;

    public C0399a(LikersFrag likersFrag) {
        this.f7108d = likersFrag.m10024S4();
        this.f7109e = likersFrag;
    }

    /* JADX INFO: renamed from: A1 */
    public boolean m10062A1(User user, boolean z) {
        int iM10067M = m10067M(user);
        if (iM10067M == -1) {
            return false;
        }
        this.f7107c.remove(user);
        this.f7109e.m10021P4().notifyItemRemoved(iM10067M);
        this.f7109e.m10021P4().notifyItemRangeChanged(iM10067M, getItemCount());
        return true;
    }

    /* JADX INFO: renamed from: C */
    public int m10063C() {
        int size = this.f7107c.size();
        if (size == 0 && !this.f7113i) {
            C0401c c0401c = this.f7108d;
            if (c0401c.f7123f && !c0401c.m10146Q1()) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C0401c c0401c2 = this.f7108d;
                if (jElapsedRealtime - c0401c2.f7119b > 1000) {
                    c0401c2.m10131C1(null);
                    this.f7108d.f7123f = false;
                } else {
                    e51.J(c0401c2.f7137t);
                    Act act = this.f7108d.act();
                    C0401c c0401c3 = this.f7108d;
                    e51.H(act, c0401c3.f7137t, (1000 - jElapsedRealtime) + c0401c3.f7119b);
                }
            }
        }
        if (this.f7108d.m10141L1()) {
            return size + 1;
        }
        if (!CoreModule.m1854P().m11706a().m5466k()) {
            return size;
        }
        if (gr9.m15939h()) {
            this.f7111g = 2;
            this.f7112h = this.f7113i ? 1 : 0;
        } else {
            this.f7111g = 1;
        }
        return size + this.f7111g + this.f7112h;
    }

    /* JADX INFO: renamed from: D */
    public View m10064D(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return this.f7108d.act().inflater().inflate(k6c0.p2, viewGroup, false);
        }
        if (i == 2) {
            return CoreModule.m1854P().m11706a().m5381Xo(this.f7108d.act(), viewGroup);
        }
        if (i == 3) {
            return LayoutInflater.from(this.f7108d.act()).inflate(k6c0.f0, viewGroup, false);
        }
        if (i == 5) {
            return LayoutInflater.from(this.f7108d.act()).inflate(k6c0.Z, viewGroup, false);
        }
        if (i == 4) {
            return LayoutInflater.from(this.f7108d.act()).inflate(k6c0.a0, viewGroup, false);
        }
        boolean z = this.f7110f;
        C0401c c0401c = this.f7108d;
        return z ? LayoutInflater.from(c0401c.act()).inflate(k6c0.e0, viewGroup, false) : c0401c.act().inflater().inflate(k6c0.q2, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void m10061A(View view, final User user, int i, int i2) {
        if (i == 2) {
            CoreModule.m1854P().m11706a().m5233C9(view, this.f7108d.f7125h);
            return;
        }
        if (i == 1) {
            if (!this.f7110f) {
                final LikersItemView likersItemView = (LikersItemView) view;
                likersItemView.m10047m(this.f7109e, user, this.f7108d.f7118a, new d30() { // from class: l.rhr
                    public final void call() {
                        this.f20556a.m10071Q(user, likersItemView);
                    }
                }, this.f7108d.m10146Q1(), this.f7108d.m10175z1(), new d30() { // from class: l.shr
                    public final void call() {
                        this.f21322a.m10072R(user);
                    }
                }, new d30() { // from class: l.thr
                    public final void call() {
                        this.f22120a.m10073S(user);
                    }
                });
                return;
            } else {
                final LikersBigCardItemView likersBigCardItemView = (LikersBigCardItemView) view;
                zvf0.A("e_see_likes_me_card", "p_see_who_likes_me_view", new j760[]{vwb.Y("see_card_source", CoreModule.f1534c.f3676u0.m2420y5(user) ? "instant_chat" : "see")});
                likersBigCardItemView.m10007p(user, new d30() { // from class: l.ohr
                    public final void call() {
                        this.f18242a.m10068N(user, likersBigCardItemView);
                    }
                }, new d30() { // from class: l.phr
                    public final void call() {
                        this.f18739a.m10069O(user);
                    }
                }, new d30() { // from class: l.qhr
                    public final void call() {
                        this.f19760a.m10070P(user);
                    }
                });
                likersBigCardItemView.m10010t(user, this.f7108d.f7118a);
                return;
            }
        }
        if (i == 5) {
            LikeMeUserNoDataItem likeMeUserNoDataItem = (LikeMeUserNoDataItem) view;
            likeMeUserNoDataItem.b();
            xdl0.U(likeMeUserNoDataItem, t100.p);
        } else if (i == 3) {
            LikersFilterItemView likersFilterItemView = (LikersFilterItemView) view;
            likersFilterItemView.m9554B(this);
            likersFilterItemView.m9555C();
        }
    }

    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        int i2;
        if (this.f7108d.m10141L1()) {
            if (i == 0) {
                return null;
            }
            return this.f7107c.get(i - 1);
        }
        if (!CoreModule.m1854P().m11706a().m5466k()) {
            return this.f7107c.get(i);
        }
        if (i - this.f7111g < this.f7107c.size() && i >= (i2 = this.f7111g)) {
            return this.f7107c.get(i - i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public int m10067M(User user) {
        if (this.f7108d.m10141L1()) {
            if (this.f7107c.contains(user)) {
                return this.f7107c.indexOf(user) + 1;
            }
            return -1;
        }
        boolean zM5466k = CoreModule.m1854P().m11706a().m5466k();
        ArrayList<User> arrayList = this.f7107c;
        if (!zM5466k) {
            return arrayList.indexOf(user);
        }
        if (arrayList.contains(user)) {
            return this.f7107c.indexOf(user) + this.f7111g;
        }
        return -1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m10068N(User user, LikersBigCardItemView likersBigCardItemView) {
        C0401c c0401c = this.f7108d;
        c0401c.f7121d = user;
        c0401c.f7122e = likersBigCardItemView;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m10069O(User user) {
        zvf0.u("e_see_who_likes_me_like", "p_see_who_likes_me_view", new j760[]{vwb.Y("see_card_source", CoreModule.f1534c.f3676u0.m2420y5(user) ? "instant_chat" : "see")});
        this.f7108d.m10133E(user, true, true);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m10070P(User user) {
        zvf0.r("e_see_card_greet", "p_see_who_likes_me_view");
        this.f7108d.m10136H1(user, true, true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m10071Q(User user, LikersItemView likersItemView) {
        C0401c c0401c = this.f7108d;
        c0401c.f7121d = user;
        c0401c.f7122e = likersItemView;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m10072R(User user) {
        this.f7108d.m10133E(user, true, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m10073S(User user) {
        this.f7108d.m10133E(user, false, false);
    }

    /* JADX INFO: renamed from: T */
    public void m10074T(List<User> list) {
        this.f7107c.clear();
        if (!vwb.J(list)) {
            this.f7107c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: U */
    public void m10075U(boolean z) {
        this.f7113i = z;
    }

    /* JADX INFO: renamed from: e */
    public void m10076e(int i) {
        if (this.f7108d.m10146Q1() || this.f7107c.isEmpty() || i < ((this.f7107c.size() + this.f7111g) - 2) - this.f7112h) {
            return;
        }
        Links links = this.f7108d.f7120c;
        if (links == null || NullChecker.a(links.next)) {
            C0401c c0401c = this.f7108d;
            c0401c.m10131C1(c0401c.f7120c);
        }
    }

    public int getItemViewType(int i) {
        if (this.f7108d.m10141L1() && i == 0) {
            return 0;
        }
        if (CoreModule.m1854P().m11706a().m5466k() && i == 0) {
            return 2;
        }
        if (gr9.m15939h() && i == 1) {
            return 3;
        }
        if (this.f7113i && i == this.f7111g + this.f7107c.size()) {
            return this.f7107c.isEmpty() ? 5 : 4;
        }
        return 1;
    }
}
