package p149l;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.data.GroupTab;
import com.p046p1.mobile.putong.core.newui.group.GroupTabItemView;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p133rx.C22306c;

/* JADX INFO: loaded from: classes11.dex */
public class enk extends dac0<GroupTab> implements mcr {

    /* JADX INFO: renamed from: c */
    public Act f92320c;

    /* JADX INFO: renamed from: e */
    public rmk f92322e;

    /* JADX INFO: renamed from: d */
    public List<GroupTab> f92321d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: f */
    public final HashSet<Integer> f92323f = new HashSet<>();

    public enk(@NonNull Act act, rmk rmkVar) {
        this.f92320c = act;
        this.f92322e = rmkVar;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f92321d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return o7r.m163037a(viewGroup.getContext()).inflate(l6c0.f126501k, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, GroupTab groupTab, int i, int i2) {
        if (view instanceof GroupTabItemView) {
            GroupTabItemView groupTabItemView = (GroupTabItemView) view;
            groupTabItemView.m36616d(getItem(i2), this);
            this.f92322e.m180014Q0(groupTabItemView, groupTab);
            if (this.f92323f.contains(Integer.valueOf(groupTab.f20407id))) {
                return;
            }
            o6j0.m162864h("e_group_chat_type_tab", this.f92322e.pageId(), o6j0.C18854a.m162878h("group_chat_type", groupTab.name));
            this.f92323f.add(Integer.valueOf(groupTab.f20407id));
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public GroupTab getItem(int i) {
        return this.f92321d.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m117282G(List<GroupTab> list) {
        this.f92321d = list;
        notifyDataSetChanged();
    }

    @Override // p149l.mcr
    public void creates(e30<Bundle> e30Var, d30 d30Var) {
        this.f92320c.creates(e30Var, d30Var);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar, boolean z) {
        return (C22306c<T>) mo67378g(this.f92320c, v9jVar.call(), z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // p149l.mcr, p149l.d0e
    public C22306c<C4319c> lifecycle() {
        return this.f92320c.lifecycle();
    }

    @Override // p149l.mcr
    public C4319c lifecycle_() {
        return this.f92320c.lifecycle_();
    }

    @Override // p149l.mcr
    public void creates(e30<Bundle> e30Var) {
        this.f92320c.creates(e30Var);
    }

    @Override // p149l.mcr
    public <T> C22306c<T> duringCreated(v9j<C22306c<T>> v9jVar) {
        return (C22306c<T>) mo67374c(this.f92320c, v9jVar.call());
    }

    @Override // p149l.mcr
    public <V> C22306c<V> duringCreated(C22306c<V> c22306c) {
        return super.mo67374c(this.f92320c, c22306c);
    }
}
