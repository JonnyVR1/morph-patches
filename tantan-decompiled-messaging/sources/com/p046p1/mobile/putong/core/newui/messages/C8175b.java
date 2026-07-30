package com.p046p1.mobile.putong.core.newui.messages;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p149l.dac0;
import p149l.f6c0;
import p149l.lsi0;
import p149l.vwb;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.b */
/* JADX INFO: loaded from: classes11.dex */
public class C8175b extends dac0<Conversation> implements ShareMessageToFriendListItemView.InterfaceC8138a {

    /* JADX INFO: renamed from: c */
    public Act f25723c;

    /* JADX INFO: renamed from: d */
    public List<Conversation> f25724d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: e */
    public Set<String> f25725e = new HashSet(5);

    /* JADX INFO: renamed from: f */
    public int f25726f;

    /* JADX INFO: renamed from: g */
    public String f25727g;

    /* JADX INFO: renamed from: h */
    public a f25728h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.b$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo42295a(Set<String> set);
    }

    public C8175b(Act act, int i, String str) {
        this.f25723c = act;
        this.f25726f = i;
        this.f25727g = str;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f25724d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        ShareMessageToFriendListItemView shareMessageToFriendListItemView = (ShareMessageToFriendListItemView) this.f25723c.inflater().inflate(f6c0.f95534Qb, viewGroup, false);
        shareMessageToFriendListItemView.setOnSelectChangeListener(this);
        return shareMessageToFriendListItemView;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, Conversation conversation, int i, int i2) {
        ((ShareMessageToFriendListItemView) view).m41817Y(this.f25723c, this, conversation, this.f25725e.contains(conversation.f56011id));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public Conversation getItem(int i) {
        return this.f25724d.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m42293G(List<Conversation> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        this.f25724d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: H */
    public void m42294H(a aVar) {
        this.f25728h = aVar;
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView.InterfaceC8138a
    /* JADX INFO: renamed from: b */
    public void mo41818b() {
        lsi0.m151595y(this.f25727g);
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView.InterfaceC8138a
    /* JADX INFO: renamed from: s */
    public boolean mo41819s(String str) {
        return this.f25725e.size() < this.f25726f || this.f25725e.contains(str);
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.ShareMessageToFriendListItemView.InterfaceC8138a
    /* JADX INFO: renamed from: w */
    public void mo41820w(Conversation conversation, boolean z) {
        Set<String> set = this.f25725e;
        if (z) {
            set.add(conversation.f56011id);
        } else {
            set.remove(conversation.f56011id);
        }
        if (NullChecker.m81303a(this.f25728h)) {
            this.f25728h.mo42295a(this.f25725e);
        }
    }
}
