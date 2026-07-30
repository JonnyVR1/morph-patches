package com.p046p1.mobile.putong.core.p053ui.messages.group;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p149l.dac0;
import p149l.l6c0;
import p149l.nbk;
import p149l.o7r;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.a */
/* JADX INFO: loaded from: classes3.dex */
public class C8528a extends dac0<nbk> implements GroupRemoveMemberItemView.InterfaceC8526b {

    /* JADX INFO: renamed from: c */
    public Context f31803c;

    /* JADX INFO: renamed from: e */
    public a f31805e;

    /* JADX INFO: renamed from: d */
    public Set<String> f31804d = new HashSet();

    /* JADX INFO: renamed from: f */
    public List<nbk> f31806f = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo49149a(List<nbk> list);
    }

    public C8528a(Context context, a aVar) {
        this.f31803c = context;
        this.f31805e = aVar;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f31806f.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return o7r.m163037a(this.f31803c).inflate(l6c0.f126586w0, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, nbk nbkVar, int i, int i2) {
        GroupRemoveMemberItemView groupRemoveMemberItemView = (GroupRemoveMemberItemView) view;
        groupRemoveMemberItemView.m49121i(nbkVar, i, this.f31804d.contains(nbkVar.f138038a));
        groupRemoveMemberItemView.setOnGroupMemberRemoveChangeListener(this);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public nbk getItem(int i) {
        return this.f31806f.get(i);
    }

    /* JADX INFO: renamed from: H */
    public List<nbk> m49145H() {
        return vwb.m200339n(this.f31806f, new w9j() { // from class: l.dhk
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f86306a.m49146I((nbk) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Boolean m49146I(nbk nbkVar) {
        return Boolean.valueOf(this.f31804d.contains(nbkVar.f138038a));
    }

    /* JADX INFO: renamed from: J */
    public void m49147J(List<String> list) {
        this.f31804d.removeAll(list);
    }

    /* JADX INFO: renamed from: K */
    public void m49148K(List<nbk> list) {
        this.f31806f.clear();
        this.f31806f.addAll(list);
        notifyDataSetChanged();
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.group.GroupRemoveMemberItemView.InterfaceC8526b
    /* JADX INFO: renamed from: d */
    public void mo49124d(nbk nbkVar, boolean z) {
        Set<String> set = this.f31804d;
        if (z) {
            set.add(nbkVar.f138038a);
        } else {
            set.remove(nbkVar.f138038a);
        }
        if (NullChecker.m81303a(this.f31805e)) {
            this.f31805e.mo49149a(m49145H());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).f138042e;
    }
}
