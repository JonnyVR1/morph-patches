package com.p051p1.mobile.putong.core.newui.messages;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p153l.jic0;
import p153l.jyb;
import p153l.kec0;
import p153l.o1j0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.b */
/* JADX INFO: loaded from: classes11.dex */
public class C8326b extends jic0<Conversation> implements ShareMessageToFriendListItemView.InterfaceC8289a {

    /* JADX INFO: renamed from: c */
    public Act f26465c;

    /* JADX INFO: renamed from: d */
    public List<Conversation> f26466d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: e */
    public Set<String> f26467e = new HashSet(5);

    /* JADX INFO: renamed from: f */
    public int f26468f;

    /* JADX INFO: renamed from: g */
    public String f26469g;

    /* JADX INFO: renamed from: h */
    public a f26470h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo43306a(Set<String> set);
    }

    public C8326b(Act act, int i, String str) {
        this.f26465c = act;
        this.f26468f = i;
        this.f26469g = str;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f26466d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        ShareMessageToFriendListItemView shareMessageToFriendListItemView = (ShareMessageToFriendListItemView) this.f26465c.inflater().inflate(kec0.f125700Xb, viewGroup, false);
        shareMessageToFriendListItemView.setOnSelectChangeListener(this);
        return shareMessageToFriendListItemView;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, Conversation conversation, int i, int i2) {
        ((ShareMessageToFriendListItemView) view).m42828Y(this.f26465c, this, conversation, this.f26467e.contains(conversation.f56859id));
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Conversation getItem(int i) {
        return this.f26466d.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m43304G(List<Conversation> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        this.f26466d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m43305H(a aVar) {
        this.f26470h = aVar;
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView.InterfaceC8289a
    /* JADX INFO: renamed from: b */
    public void mo42829b() {
        o1j0.m165651y(this.f26469g);
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView.InterfaceC8289a
    /* JADX INFO: renamed from: s */
    public boolean mo42830s(String str) {
        return this.f26467e.size() < this.f26468f || this.f26467e.contains(str);
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView.InterfaceC8289a
    /* JADX INFO: renamed from: w */
    public void mo42831w(Conversation conversation, boolean z) {
        Set<String> set = this.f26467e;
        if (z) {
            set.add(conversation.f56859id);
        } else {
            set.remove(conversation.f56859id);
        }
        if (NullChecker.m82486a(this.f26470h)) {
            this.f26470h.mo43306a(this.f26467e);
        }
    }
}
