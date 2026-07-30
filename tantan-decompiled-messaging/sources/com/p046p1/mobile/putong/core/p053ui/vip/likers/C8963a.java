package com.p046p1.mobile.putong.core.p053ui.vip.likers;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.home.member.likeme.adapter.item.LikeMeUserNoDataItem;
import com.p046p1.mobile.putong.core.p053ui.view.LikersFilterItemView;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p149l.d30;
import p149l.dac0;
import p149l.e51;
import p149l.gr9;
import p149l.k6c0;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.a */
/* JADX INFO: loaded from: classes9.dex */
public class C8963a extends dac0<User> {

    /* JADX INFO: renamed from: d */
    public C8965c f37327d;

    /* JADX INFO: renamed from: e */
    public LikersFrag f37328e;

    /* JADX INFO: renamed from: c */
    public ArrayList<User> f37326c = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public int f37330g = 0;

    /* JADX INFO: renamed from: h */
    public int f37331h = 0;

    /* JADX INFO: renamed from: i */
    public boolean f37332i = false;

    /* JADX INFO: renamed from: f */
    public final boolean f37329f = false;

    public C8963a(LikersFrag likersFrag) {
        this.f37327d = likersFrag.m56582S4();
        this.f37328e = likersFrag;
    }

    /* JADX INFO: renamed from: A1 */
    public boolean m56618A1(User user, boolean z) {
        int iM56621M = m56621M(user);
        if (iM56621M == -1) {
            return false;
        }
        this.f37326c.remove(user);
        this.f37328e.m56579P4().notifyItemRemoved(iM56621M);
        this.f37328e.m56579P4().notifyItemRangeChanged(iM56621M, getItemCount());
        return true;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        int size = this.f37326c.size();
        if (size == 0 && !this.f37332i) {
            C8965c c8965c = this.f37327d;
            if (c8965c.f37342f && !c8965c.m56689Q1()) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C8965c c8965c2 = this.f37327d;
                if (jElapsedRealtime - c8965c2.f37338b > 1000) {
                    c8965c2.m56674C1(null);
                    this.f37327d.f37342f = false;
                } else {
                    e51.m114745J(c8965c2.f37356t);
                    Act act = this.f37327d.act();
                    C8965c c8965c3 = this.f37327d;
                    e51.m114743H(act, c8965c3.f37356t, (1000 - jElapsedRealtime) + c8965c3.f37338b);
                }
            }
        }
        if (this.f37327d.m56684L1()) {
            return size + 1;
        }
        if (!CoreModule.m29935P().m94651a().mo33529k()) {
            return size;
        }
        if (gr9.m127683h()) {
            this.f37330g = 2;
            this.f37331h = this.f37332i ? 1 : 0;
        } else {
            this.f37330g = 1;
        }
        return size + this.f37330g + this.f37331h;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return this.f37327d.act().inflater().inflate(k6c0.f121420p2, viewGroup, false);
        }
        if (i == 2) {
            return CoreModule.m29935P().m94651a().mo33444Xo(this.f37327d.act(), viewGroup);
        }
        if (i == 3) {
            return LayoutInflater.from(this.f37327d.act()).inflate(k6c0.f121378f0, viewGroup, false);
        }
        if (i == 5) {
            return LayoutInflater.from(this.f37327d.act()).inflate(k6c0.f121354Z, viewGroup, false);
        }
        if (i == 4) {
            return LayoutInflater.from(this.f37327d.act()).inflate(k6c0.f121358a0, viewGroup, false);
        }
        boolean z = this.f37329f;
        C8965c c8965c = this.f37327d;
        return z ? LayoutInflater.from(c8965c.act()).inflate(k6c0.f121374e0, viewGroup, false) : c8965c.act().inflater().inflate(k6c0.f121424q2, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, final User user, int i, int i2) {
        if (i == 2) {
            CoreModule.m29935P().m94651a().mo33296C9(view, this.f37327d.f37344h);
            return;
        }
        if (i == 1) {
            if (!this.f37329f) {
                final LikersItemView likersItemView = (LikersItemView) view;
                likersItemView.m56604m(this.f37328e, user, this.f37327d.f37337a, new d30() { // from class: l.rhr
                    @Override // p149l.d30
                    public final void call() {
                        this.f159474a.m56625Q(user, likersItemView);
                    }
                }, this.f37327d.m56689Q1(), this.f37327d.m56716z1(), new d30() { // from class: l.shr
                    @Override // p149l.d30
                    public final void call() {
                        this.f164624a.m56626R(user);
                    }
                }, new d30() { // from class: l.thr
                    @Override // p149l.d30
                    public final void call() {
                        this.f170273a.m56627S(user);
                    }
                });
                return;
            } else {
                final LikersBigCardItemView likersBigCardItemView = (LikersBigCardItemView) view;
                zvf0.m220368A("e_see_likes_me_card", "p_see_who_likes_me_view", vwb.m200311Y("see_card_source", CoreModule.f17545c.f19687u0.m30492y5(user) ? "instant_chat" : "see"));
                likersBigCardItemView.m56565p(user, new d30() { // from class: l.ohr
                    @Override // p149l.d30
                    public final void call() {
                        this.f144039a.m56622N(user, likersBigCardItemView);
                    }
                }, new d30() { // from class: l.phr
                    @Override // p149l.d30
                    public final void call() {
                        this.f149039a.m56623O(user);
                    }
                }, new d30() { // from class: l.qhr
                    @Override // p149l.d30
                    public final void call() {
                        this.f154508a.m56624P(user);
                    }
                });
                likersBigCardItemView.m56568t(user, this.f37327d.f37337a);
                return;
            }
        }
        if (i == 5) {
            LikeMeUserNoDataItem likeMeUserNoDataItem = (LikeMeUserNoDataItem) view;
            likeMeUserNoDataItem.m46095b();
            xdl0.m208357U(likeMeUserNoDataItem, t100.f167267p);
        } else if (i == 3) {
            LikersFilterItemView likersFilterItemView = (LikersFilterItemView) view;
            likersFilterItemView.m56129B(this);
            likersFilterItemView.m56130C();
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        int i2;
        if (this.f37327d.m56684L1()) {
            if (i == 0) {
                return null;
            }
            return this.f37326c.get(i - 1);
        }
        if (!CoreModule.m29935P().m94651a().mo33529k()) {
            return this.f37326c.get(i);
        }
        if (i - this.f37330g < this.f37326c.size() && i >= (i2 = this.f37330g)) {
            return this.f37326c.get(i - i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public int m56621M(User user) {
        if (this.f37327d.m56684L1()) {
            if (this.f37326c.contains(user)) {
                return this.f37326c.indexOf(user) + 1;
            }
            return -1;
        }
        boolean zMo33529k = CoreModule.m29935P().m94651a().mo33529k();
        ArrayList<User> arrayList = this.f37326c;
        if (!zMo33529k) {
            return arrayList.indexOf(user);
        }
        if (arrayList.contains(user)) {
            return this.f37326c.indexOf(user) + this.f37330g;
        }
        return -1;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m56622N(User user, LikersBigCardItemView likersBigCardItemView) {
        C8965c c8965c = this.f37327d;
        c8965c.f37340d = user;
        c8965c.f37341e = likersBigCardItemView;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m56623O(User user) {
        zvf0.m220399u("e_see_who_likes_me_like", "p_see_who_likes_me_view", vwb.m200311Y("see_card_source", CoreModule.f17545c.f19687u0.m30492y5(user) ? "instant_chat" : "see"));
        this.f37327d.m56676E(user, true, true);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m56624P(User user) {
        zvf0.m220396r("e_see_card_greet", "p_see_who_likes_me_view");
        this.f37327d.m56679H1(user, true, true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m56625Q(User user, LikersItemView likersItemView) {
        C8965c c8965c = this.f37327d;
        c8965c.f37340d = user;
        c8965c.f37341e = likersItemView;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m56626R(User user) {
        this.f37327d.m56676E(user, true, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m56627S(User user) {
        this.f37327d.m56676E(user, false, false);
    }

    /* JADX INFO: renamed from: T */
    public void m56628T(List<User> list) {
        this.f37326c.clear();
        if (!vwb.m200296J(list)) {
            this.f37326c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: U */
    public void m56629U(boolean z) {
        this.f37332i = z;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: e */
    public void mo47327e(int i) {
        if (this.f37327d.m56689Q1() || this.f37326c.isEmpty() || i < ((this.f37326c.size() + this.f37330g) - 2) - this.f37331h) {
            return;
        }
        Links links = this.f37327d.f37339c;
        if (links == null || NullChecker.m81303a(links.next)) {
            C8965c c8965c = this.f37327d;
            c8965c.m56674C1(c8965c.f37339c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f37327d.m56684L1() && i == 0) {
            return 0;
        }
        if (CoreModule.m29935P().m94651a().mo33529k() && i == 0) {
            return 2;
        }
        if (gr9.m127683h() && i == 1) {
            return 3;
        }
        if (this.f37332i && i == this.f37330g + this.f37326c.size()) {
            return this.f37326c.isEmpty() ? 5 : 4;
        }
        return 1;
    }
}
