package com.p051p1.mobile.putong.core.p058ui.messages.group;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p153l.dek;
import p153l.jic0;
import p153l.jyb;
import p153l.p9r;
import p153l.qcj;
import p153l.qec0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.a */
/* JADX INFO: loaded from: classes3.dex */
public class C8691a extends jic0<dek> implements GroupRemoveMemberItemView.InterfaceC8689b {

    /* JADX INFO: renamed from: c */
    public Context f32651c;

    /* JADX INFO: renamed from: e */
    public a f32653e;

    /* JADX INFO: renamed from: d */
    public Set<String> f32652d = new HashSet();

    /* JADX INFO: renamed from: f */
    public List<dek> f32654f = new ArrayList();

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.a$a */
    public interface a {
        /* JADX INFO: renamed from: a */
        void mo50332a(List<dek> list);
    }

    public C8691a(Context context, a aVar) {
        this.f32651c = context;
        this.f32653e = aVar;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f32654f.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return p9r.m171370a(this.f32651c).inflate(qec0.f157142w0, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, dek dekVar, int i, int i2) {
        GroupRemoveMemberItemView groupRemoveMemberItemView = (GroupRemoveMemberItemView) view;
        groupRemoveMemberItemView.m50304i(dekVar, i, this.f32652d.contains(dekVar.f88036a));
        groupRemoveMemberItemView.setOnGroupMemberRemoveChangeListener(this);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public dek getItem(int i) {
        return this.f32654f.get(i);
    }

    /* JADX INFO: renamed from: H */
    public List<dek> m50328H() {
        return jyb.m147522n(this.f32654f, new qcj() { // from class: l.tjk
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f174593a.m50329I((dek) obj);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ Boolean m50329I(dek dekVar) {
        return Boolean.valueOf(this.f32652d.contains(dekVar.f88036a));
    }

    /* JADX INFO: renamed from: J */
    public void m50330J(List<String> list) {
        this.f32652d.removeAll(list);
    }

    /* JADX INFO: renamed from: K */
    public void m50331K(List<dek> list) {
        this.f32654f.clear();
        this.f32654f.addAll(list);
        notifyDataSetChanged();
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.group.GroupRemoveMemberItemView.InterfaceC8689b
    /* JADX INFO: renamed from: d */
    public void mo50307d(dek dekVar, boolean z) {
        Set<String> set = this.f32652d;
        if (z) {
            set.add(dekVar.f88036a);
        } else {
            set.remove(dekVar.f88036a);
        }
        if (NullChecker.m82486a(this.f32653e)) {
            this.f32653e.mo50332a(m50328H());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return getItem(i).f88040e;
    }
}
