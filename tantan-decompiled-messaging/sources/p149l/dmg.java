package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.SuperlikeReason;
import com.p046p1.mobile.putong.feed.data.Group;
import com.p046p1.mobile.putong.feed.newui.group.allgroup.FeedAllGroupItemView;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class dmg extends dac0<Group> {

    /* JADX INFO: renamed from: c */
    public List<Group> f86945c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f86946d;

    /* JADX INFO: renamed from: e */
    public int f86947e;

    public dmg(Act act, int i) {
        this.f86946d = act;
        this.f86947e = i;
    }

    /* JADX INFO: renamed from: H */
    private void m112469H(View view, final Group group) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.cmg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f81559a.m112470I(group, view2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m112470I(Group group, View view) {
        Act act = this.f86946d;
        act.startActivity(new FeedGroupDetailAct.C11200a(act, group.f56011id).m61987a());
        p6j0.m167669c("e_circle_card", "p_circle_list", new j760("circle_id", group.f56011id), new j760("circle_source", this.f86947e == 0 ? "joined" : SuperlikeReason.popular));
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f86945c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f86946d.inflater().inflate(o6c0.f142001B, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, Group group, int i, int i2) {
        FeedAllGroupItemView feedAllGroupItemView = (FeedAllGroupItemView) view;
        feedAllGroupItemView.m61910z(group, this.f86947e);
        m112469H(feedAllGroupItemView, group);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public Group getItem(int i) {
        return this.f86945c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public void m112473J(List<Group> list) {
        this.f86945c = list;
        notifyDataSetChanged();
    }
}
