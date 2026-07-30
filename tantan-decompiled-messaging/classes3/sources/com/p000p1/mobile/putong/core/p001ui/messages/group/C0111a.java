package com.p000p1.mobile.putong.core.p001ui.messages.group;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import l.l6c0;
import l.o7r;
import l.vwb;
import p003l.dac0;
import p003l.nbk;
import p003l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C0111a extends dac0<nbk> implements GroupRemoveMemberItemView.InterfaceC0109b {

    /* JADX INFO: renamed from: c */
    public Context f1694c;

    /* JADX INFO: renamed from: e */
    public a f1696e;

    /* JADX INFO: renamed from: d */
    public Set<String> f1695d = new HashSet();

    /* JADX INFO: renamed from: f */
    public List<nbk> f1697f = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo2266a(List<nbk> list);
    }

    public C0111a(Context context, a aVar) {
        this.f1694c = context;
        this.f1696e = aVar;
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: C */
    public int mo203C() {
        return this.f1697f.size();
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: D */
    public View mo204D(ViewGroup viewGroup, int i) {
        return o7r.a(this.f1694c).inflate(l6c0.w0, viewGroup, false);
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo202A(View view, nbk nbkVar, int i, int i2) {
        GroupRemoveMemberItemView groupRemoveMemberItemView = (GroupRemoveMemberItemView) view;
        groupRemoveMemberItemView.m2232i(nbkVar, i, this.f1695d.contains(nbkVar.f5858a));
        groupRemoveMemberItemView.setOnGroupMemberRemoveChangeListener(this);
    }

    @Override // p003l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public nbk getItem(int i) {
        return this.f1697f.get(i);
    }

    /* JADX INFO: renamed from: H */
    public List<nbk> m2262H() {
        return vwb.n(this.f1697f, new w9j() { // from class: l.dhk
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f3005a.m2263I((nbk) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Boolean m2263I(nbk nbkVar) {
        return Boolean.valueOf(this.f1695d.contains(nbkVar.f5858a));
    }

    /* JADX INFO: renamed from: J */
    public void m2264J(List<String> list) {
        this.f1695d.removeAll(list);
    }

    /* JADX INFO: renamed from: K */
    public void m2265K(List<nbk> list) {
        this.f1697f.clear();
        this.f1697f.addAll(list);
        notifyDataSetChanged();
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.group.GroupRemoveMemberItemView.InterfaceC0109b
    /* JADX INFO: renamed from: d */
    public void mo2235d(nbk nbkVar, boolean z) {
        Set<String> set = this.f1695d;
        if (z) {
            set.add(nbkVar.f5858a);
        } else {
            set.remove(nbkVar.f5858a);
        }
        if (NullChecker.a(this.f1696e)) {
            this.f1696e.mo2266a(m2262H());
        }
    }

    public int getItemViewType(int i) {
        return getItem(i).f5862e;
    }
}
