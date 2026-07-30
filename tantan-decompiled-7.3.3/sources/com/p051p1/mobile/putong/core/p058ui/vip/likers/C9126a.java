package com.p051p1.mobile.putong.core.p058ui.vip.likers;

import android.os.SystemClock;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.home.member.likeme.adapter.item.LikeMeUserNoDataItem;
import com.p051p1.mobile.putong.core.p058ui.view.LikersFilterItemView;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jic0;
import p153l.jyb;
import p153l.l51;
import p153l.pec0;
import p153l.qa00;
import p153l.rs9;
import p153l.x20;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.likers.a */
/* JADX INFO: loaded from: classes12.dex */
public class C9126a extends jic0<User> {

    /* JADX INFO: renamed from: d */
    public C9128c f38175d;

    /* JADX INFO: renamed from: e */
    public LikersFrag f38176e;

    /* JADX INFO: renamed from: c */
    public ArrayList<User> f38174c = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public int f38178g = 0;

    /* JADX INFO: renamed from: h */
    public int f38179h = 0;

    /* JADX INFO: renamed from: i */
    public boolean f38180i = false;

    /* JADX INFO: renamed from: f */
    public final boolean f38177f = false;

    public C9126a(LikersFrag likersFrag) {
        this.f38175d = likersFrag.m57765S4();
        this.f38176e = likersFrag;
    }

    /* JADX INFO: renamed from: A1 */
    public boolean m57801A1(User user, boolean z) {
        int iM57804M = m57804M(user);
        if (iM57804M == -1) {
            return false;
        }
        this.f38174c.remove(user);
        this.f38176e.m57762P4().notifyItemRemoved(iM57804M);
        this.f38176e.m57762P4().notifyItemRangeChanged(iM57804M, getItemCount());
        return true;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        int size = this.f38174c.size();
        if (size == 0 && !this.f38180i) {
            C9128c c9128c = this.f38175d;
            if (c9128c.f38190f && !c9128c.m57872Q1()) {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                C9128c c9128c2 = this.f38175d;
                if (jElapsedRealtime - c9128c2.f38186b > 1000) {
                    c9128c2.m57857C1(null);
                    this.f38175d.f38190f = false;
                } else {
                    l51.m152890J(c9128c2.f38204t);
                    Act act = this.f38175d.act();
                    C9128c c9128c3 = this.f38175d;
                    l51.m152888H(act, c9128c3.f38204t, (1000 - jElapsedRealtime) + c9128c3.f38186b);
                }
            }
        }
        if (this.f38175d.m57867L1()) {
            return size + 1;
        }
        if (!CoreModule.m30933P().m143405a().mo34532k()) {
            return size;
        }
        if (rs9.m182939h()) {
            this.f38178g = 2;
            this.f38179h = this.f38180i ? 1 : 0;
        } else {
            this.f38178g = 1;
        }
        return size + this.f38178g + this.f38179h;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        if (i == 0) {
            return this.f38175d.act().inflater().inflate(pec0.f152028p2, viewGroup, false);
        }
        if (i == 2) {
            return CoreModule.m30933P().m143405a().mo34447Xo(this.f38175d.act(), viewGroup);
        }
        if (i == 3) {
            return LayoutInflater.from(this.f38175d.act()).inflate(pec0.f151986f0, viewGroup, false);
        }
        if (i == 5) {
            return LayoutInflater.from(this.f38175d.act()).inflate(pec0.f151962Z, viewGroup, false);
        }
        if (i == 4) {
            return LayoutInflater.from(this.f38175d.act()).inflate(pec0.f151966a0, viewGroup, false);
        }
        boolean z = this.f38177f;
        C9128c c9128c = this.f38175d;
        return z ? LayoutInflater.from(c9128c.act()).inflate(pec0.f151982e0, viewGroup, false) : c9128c.act().inflater().inflate(pec0.f152032q2, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, final User user, int i, int i2) {
        if (i == 2) {
            CoreModule.m30933P().m143405a().mo34299C9(view, this.f38175d.f38192h);
            return;
        }
        if (i == 1) {
            if (!this.f38177f) {
                final LikersItemView likersItemView = (LikersItemView) view;
                likersItemView.m57787m(this.f38176e, user, this.f38175d.f38185a, new x20() { // from class: l.sjr
                    @Override // p153l.x20
                    public final void call() {
                        this.f169169a.m57808Q(user, likersItemView);
                    }
                }, this.f38175d.m57872Q1(), this.f38175d.m57899z1(), new x20() { // from class: l.tjr
                    @Override // p153l.x20
                    public final void call() {
                        this.f174606a.m57809R(user);
                    }
                }, new x20() { // from class: l.ujr
                    @Override // p153l.x20
                    public final void call() {
                        this.f179326a.m57810S(user);
                    }
                });
                return;
            } else {
                final LikersBigCardItemView likersBigCardItemView = (LikersBigCardItemView) view;
                i4g0.m138492A("e_see_likes_me_card", "p_see_who_likes_me_view", jyb.m147494Y("see_card_source", CoreModule.f18264c.f20429u0.m31381C5(user) ? "instant_chat" : "see"));
                likersBigCardItemView.m57748p(user, new x20() { // from class: l.pjr
                    @Override // p153l.x20
                    public final void call() {
                        this.f152734a.m57805N(user, likersBigCardItemView);
                    }
                }, new x20() { // from class: l.qjr
                    @Override // p153l.x20
                    public final void call() {
                        this.f158030a.m57806O(user);
                    }
                }, new x20() { // from class: l.rjr
                    @Override // p153l.x20
                    public final void call() {
                        this.f163501a.m57807P(user);
                    }
                });
                likersBigCardItemView.m57751t(user, this.f38175d.f38185a);
                return;
            }
        }
        if (i == 5) {
            LikeMeUserNoDataItem likeMeUserNoDataItem = (LikeMeUserNoDataItem) view;
            likeMeUserNoDataItem.m47278b();
            bnl0.m105537U(likeMeUserNoDataItem, qa00.f156329p);
        } else if (i == 3) {
            LikersFilterItemView likersFilterItemView = (LikersFilterItemView) view;
            likersFilterItemView.m57312B(this);
            likersFilterItemView.m57313C();
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public User getItem(int i) {
        int i2;
        if (this.f38175d.m57867L1()) {
            if (i == 0) {
                return null;
            }
            return this.f38174c.get(i - 1);
        }
        if (!CoreModule.m30933P().m143405a().mo34532k()) {
            return this.f38174c.get(i);
        }
        if (i - this.f38178g < this.f38174c.size() && i >= (i2 = this.f38178g)) {
            return this.f38174c.get(i - i2);
        }
        return null;
    }

    /* JADX INFO: renamed from: M */
    public int m57804M(User user) {
        if (this.f38175d.m57867L1()) {
            if (this.f38174c.contains(user)) {
                return this.f38174c.indexOf(user) + 1;
            }
            return -1;
        }
        boolean zMo34532k = CoreModule.m30933P().m143405a().mo34532k();
        ArrayList<User> arrayList = this.f38174c;
        if (!zMo34532k) {
            return arrayList.indexOf(user);
        }
        if (arrayList.contains(user)) {
            return this.f38174c.indexOf(user) + this.f38178g;
        }
        return -1;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m57805N(User user, LikersBigCardItemView likersBigCardItemView) {
        C9128c c9128c = this.f38175d;
        c9128c.f38188d = user;
        c9128c.f38189e = likersBigCardItemView;
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m57806O(User user) {
        i4g0.m138523u("e_see_who_likes_me_like", "p_see_who_likes_me_view", jyb.m147494Y("see_card_source", CoreModule.f18264c.f20429u0.m31381C5(user) ? "instant_chat" : "see"));
        this.f38175d.m57859E(user, true, true);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m57807P(User user) {
        i4g0.m138520r("e_see_card_greet", "p_see_who_likes_me_view");
        this.f38175d.m57862H1(user, true, true);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m57808Q(User user, LikersItemView likersItemView) {
        C9128c c9128c = this.f38175d;
        c9128c.f38188d = user;
        c9128c.f38189e = likersItemView;
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m57809R(User user) {
        this.f38175d.m57859E(user, true, false);
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m57810S(User user) {
        this.f38175d.m57859E(user, false, false);
    }

    /* JADX INFO: renamed from: T */
    public void m57811T(List<User> list) {
        this.f38174c.clear();
        if (!jyb.m147479J(list)) {
            this.f38174c.addAll(list);
        }
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: U */
    public void m57812U(boolean z) {
        this.f38180i = z;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: e */
    public void mo48510e(int i) {
        if (this.f38175d.m57872Q1() || this.f38174c.isEmpty() || i < ((this.f38174c.size() + this.f38178g) - 2) - this.f38179h) {
            return;
        }
        Links links = this.f38175d.f38187c;
        if (links == null || NullChecker.m82486a(links.next)) {
            C9128c c9128c = this.f38175d;
            c9128c.m57857C1(c9128c.f38187c);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        if (this.f38175d.m57867L1() && i == 0) {
            return 0;
        }
        if (CoreModule.m30933P().m143405a().mo34532k() && i == 0) {
            return 2;
        }
        if (rs9.m182939h() && i == 1) {
            return 3;
        }
        if (this.f38180i && i == this.f38178g + this.f38174c.size()) {
            return this.f38174c.isEmpty() ? 5 : 4;
        }
        return 1;
    }
}
