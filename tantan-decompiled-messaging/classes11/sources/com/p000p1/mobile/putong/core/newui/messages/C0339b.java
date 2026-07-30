package com.p000p1.mobile.putong.core.newui.messages;

import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l.dac0;
import l.f6c0;
import l.lsi0;
import l.vwb;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.b */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class C0339b extends dac0<Conversation> implements ShareMessageToFriendListItemView.InterfaceC0302a {

    /* JADX INFO: renamed from: c */
    public Act f4501c;

    /* JADX INFO: renamed from: d */
    public List<Conversation> f4502d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: e */
    public Set<String> f4503e = new HashSet(5);

    /* JADX INFO: renamed from: f */
    public int f4504f;

    /* JADX INFO: renamed from: g */
    public String f4505g;

    /* JADX INFO: renamed from: h */
    public a f4506h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void m6447a(Set<String> set);
    }

    public C0339b(Act act, int i, String str) {
        this.f4501c = act;
        this.f4504f = i;
        this.f4505g = str;
    }

    /* JADX INFO: renamed from: C */
    public int m6441C() {
        return this.f4502d.size();
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, com.p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView] */
    /* JADX INFO: renamed from: D */
    public View m6442D(ViewGroup viewGroup, int i) {
        ?? r3 = (ShareMessageToFriendListItemView) this.f4501c.inflater().inflate(f6c0.Qb, viewGroup, false);
        r3.setOnSelectChangeListener(this);
        return r3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m6440A(View view, Conversation conversation, int i, int i2) {
        ((ShareMessageToFriendListItemView) view).m5943Y(this.f4501c, this, conversation, this.f4503e.contains(((DbObject) conversation).id));
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Conversation getItem(int i) {
        return this.f4502d.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m6445G(List<Conversation> list) {
        if (vwb.J(list)) {
            return;
        }
        this.f4502d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m6446H(a aVar) {
        this.f4506h = aVar;
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView.InterfaceC0302a
    /* JADX INFO: renamed from: b */
    public void mo5944b() {
        lsi0.y(this.f4505g);
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView.InterfaceC0302a
    /* JADX INFO: renamed from: s */
    public boolean mo5945s(String str) {
        return this.f4503e.size() < this.f4504f || this.f4503e.contains(str);
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView.InterfaceC0302a
    /* JADX INFO: renamed from: w */
    public void mo5946w(Conversation conversation, boolean z) {
        Set<String> set = this.f4503e;
        if (z) {
            set.add(((DbObject) conversation).id);
        } else {
            set.remove(((DbObject) conversation).id);
        }
        if (NullChecker.a(this.f4506h)) {
            this.f4506h.m6447a(this.f4503e);
        }
    }
}
