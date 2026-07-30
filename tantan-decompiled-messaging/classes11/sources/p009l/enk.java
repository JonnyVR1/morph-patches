package p009l;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.newui.group.GroupTabItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.GroupTab;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import l.d30;
import l.dac0;
import l.e30;
import l.l6c0;
import l.mcr;
import l.o6j0;
import l.v9j;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class enk extends dac0<GroupTab> implements mcr {

    /* JADX INFO: renamed from: c */
    public Act f12621c;

    /* JADX INFO: renamed from: e */
    public rmk f12623e;

    /* JADX INFO: renamed from: d */
    public List<GroupTab> f12622d = Collections.EMPTY_LIST;

    /* JADX INFO: renamed from: f */
    public final HashSet<Integer> f12624f = new HashSet<>();

    public enk(@NonNull Act act, rmk rmkVar) {
        this.f12621c = act;
        this.f12623e = rmkVar;
    }

    /* JADX INFO: renamed from: C */
    public int m14003C() {
        return this.f12622d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m14004D(ViewGroup viewGroup, int i) {
        return o7r.m19649a(viewGroup.getContext()).inflate(l6c0.k, viewGroup, false);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m14002A(View view, GroupTab groupTab, int i, int i2) {
        if (view instanceof GroupTabItemView) {
            GroupTabItemView groupTabItemView = (GroupTabItemView) view;
            groupTabItemView.m558d(getItem(i2), this);
            this.f12623e.m21732Q0(groupTabItemView, groupTab);
            if (this.f12624f.contains(Integer.valueOf(groupTab.id))) {
                return;
            }
            o6j0.h("e_group_chat_type_tab", this.f12623e.pageId(), new o6j0.a[]{o6j0.a.h("group_chat_type", groupTab.name)});
            this.f12624f.add(Integer.valueOf(groupTab.id));
        }
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public GroupTab getItem(int i) {
        return this.f12622d.get(i);
    }

    /* JADX INFO: renamed from: G */
    public void m14007G(List<GroupTab> list) {
        this.f12622d = list;
        notifyDataSetChanged();
    }

    public void creates(e30<Bundle> e30Var, d30 d30Var) {
        this.f12621c.creates(e30Var, d30Var);
    }

    public <T> c<T> duringCreated(v9j<c<T>> v9jVar, boolean z) {
        return g(this.f12621c, (c) v9jVar.call(), z);
    }

    public long getItemId(int i) {
        return i;
    }

    public c<com.p1.mobile.android.app.c> lifecycle() {
        return this.f12621c.lifecycle();
    }

    public com.p1.mobile.android.app.c lifecycle_() {
        return this.f12621c.lifecycle_();
    }

    public void creates(e30<Bundle> e30Var) {
        this.f12621c.creates(e30Var);
    }

    public <T> c<T> duringCreated(v9j<c<T>> v9jVar) {
        return c(this.f12621c, (c) v9jVar.call());
    }

    public <V> c<V> duringCreated(c<V> cVar) {
        return super.c(this.f12621c, cVar);
    }
}
