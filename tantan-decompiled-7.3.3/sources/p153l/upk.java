package p153l;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.data.GroupTab;
import com.p051p1.mobile.putong.core.newui.group.GroupTabItemView;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes11.dex */
public class upk extends jic0<GroupTab> implements ner {

    /* JADX INFO: renamed from: c */
    public Act f180278c;

    /* JADX INFO: renamed from: e */
    public hpk f180280e;

    /* JADX INFO: renamed from: d */
    public List<GroupTab> f180279d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: f */
    public final HashSet<Integer> f180281f = new HashSet<>();

    public upk(@NonNull Act act, hpk hpkVar) {
        this.f180278c = act;
        this.f180280e = hpkVar;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f180279d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return p9r.m171370a(viewGroup.getContext()).inflate(qec0.f157057k, viewGroup, false);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, GroupTab groupTab, int i, int i2) {
        if (view instanceof GroupTabItemView) {
            GroupTabItemView groupTabItemView = (GroupTabItemView) view;
            groupTabItemView.m37619d(getItem(i2), this);
            this.f180280e.m136562Q0(groupTabItemView, groupTab);
            if (this.f180281f.contains(Integer.valueOf(groupTab.f21149id))) {
                return;
            }
            sfj0.m185601h("e_group_chat_type_tab", this.f180280e.pageId(), sfj0.C20032a.m185615h("group_chat_type", groupTab.name));
            this.f180281f.add(Integer.valueOf(groupTab.f21149id));
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public GroupTab getItem(int i) {
        return this.f180279d.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m197099G(List<GroupTab> list) {
        this.f180279d = list;
        notifyDataSetChanged();
    }

    @Override // p153l.ner
    public void creates(y20<Bundle> y20Var, x20 x20Var) {
        this.f180278c.creates(y20Var, x20Var);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar, boolean z) {
        return (C22421c<T>) mo68561g(this.f180278c, pcjVar.call(), z);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public long getItemId(int i) {
        return i;
    }

    @Override // p153l.ner, p153l.r1e
    public C22421c<C4470c> lifecycle() {
        return this.f180278c.lifecycle();
    }

    @Override // p153l.ner
    public C4470c lifecycle_() {
        return this.f180278c.lifecycle_();
    }

    @Override // p153l.ner
    public void creates(y20<Bundle> y20Var) {
        this.f180278c.creates(y20Var);
    }

    @Override // p153l.ner
    public <T> C22421c<T> duringCreated(pcj<C22421c<T>> pcjVar) {
        return (C22421c<T>) mo68557c(this.f180278c, pcjVar.call());
    }

    @Override // p153l.ner
    public <V> C22421c<V> duringCreated(C22421c<V> c22421c) {
        return super.mo68557c(this.f180278c, c22421c);
    }
}
