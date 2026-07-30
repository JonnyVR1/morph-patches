package p007l;

import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.SuperlikeReason;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p000p1.mobile.putong.feed.newui.group.allgroup.FeedAllGroupItemView;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.j760;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class dmg extends dac0<Group> {

    /* JADX INFO: renamed from: c */
    public List<Group> f6992c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f6993d;

    /* JADX INFO: renamed from: e */
    public int f6994e;

    public dmg(Act act, int i) {
        this.f6993d = act;
        this.f6994e = i;
    }

    /* JADX INFO: renamed from: H */
    private void m9473H(View view, final Group group) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.cmg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f6686a.m9474I(group, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m9474I(Group group, View view) {
        Act act = this.f6993d;
        act.startActivity(new FeedGroupDetailAct.C2044a(act, ((DbObject) group).id).m2961a());
        p6j0.m12913c("e_circle_card", "p_circle_list", new j760("circle_id", ((DbObject) group).id), new j760("circle_source", this.f6994e == 0 ? "joined" : SuperlikeReason.popular));
    }

    /* JADX INFO: renamed from: C */
    public int m9476C() {
        return this.f6992c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m9477D(ViewGroup viewGroup, int i) {
        return this.f6993d.inflater().inflate(o6c0.f11020B, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.p1.mobile.putong.feed.newui.group.allgroup.FeedAllGroupItemView] */
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m9475A(View view, Group group, int i, int i2) {
        ?? r1 = (FeedAllGroupItemView) view;
        r1.m2884z(group, this.f6994e);
        m9473H(r1, group);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Group getItem(int i) {
        return this.f6992c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m9480J(List<Group> list) {
        this.f6992c = list;
        notifyDataSetChanged();
    }
}
