package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p000p1.mobile.putong.feed.newui.group.FeedGroupEntranceItemView;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.j760;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class tdk extends dac0<Group> {

    /* JADX INFO: renamed from: c */
    public List<Group> f13265c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f13266d;

    /* JADX INFO: renamed from: e */
    public l80 f13267e;

    public tdk(Act act, l80 l80Var) {
        this.f13266d = act;
        this.f13267e = l80Var;
    }

    /* JADX INFO: renamed from: K */
    private String m14484K() {
        return nkg.m12263s() ? "p_discover_dating" : OMSDialogPositon.p_nearby;
    }

    /* JADX INFO: renamed from: C */
    public int m14486C() {
        return this.f13265c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m14487D(ViewGroup viewGroup, int i) {
        return this.f13266d.inflater().inflate(o6c0.f11034D0, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.view.View, com.p1.mobile.putong.feed.newui.group.FeedGroupEntranceItemView] */
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m14485A(View view, Group group, int i, int i2) {
        ?? r1 = (FeedGroupEntranceItemView) view;
        r1.m2850s(group);
        m14493L(r1, group);
        if (i2 == m14486C() - 1) {
            xdl0.W((View) r1, m14492J(group));
        } else {
            xdl0.W((View) r1, 0);
        }
        if (i2 == 0) {
            xdl0.V((View) r1, m14492J(group));
        } else {
            xdl0.V((View) r1, t100.d(12.0f));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m14489G(Group group) {
        p6j0.m12913c("e_circle", m14484K(), new j760("circle_id", ((DbObject) group).id), new j760("circle_source", m14490H()));
    }

    /* JADX INFO: renamed from: H */
    public final String m14490H() {
        if (nkg.m12263s()) {
            return "dating";
        }
        User userMe_ = FeedModule.m1140H().me_();
        return (NullChecker.a(userMe_) && userMe_.isFemale()) ? "recommend" : "nearby";
    }

    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Group getItem(int i) {
        return this.f13265c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final int m14492J(Group group) {
        return group.unReadMomentCounter > 0 ? t100.d(17.0f) / 2 : t100.d(12.0f);
    }

    /* JADX INFO: renamed from: L */
    public final void m14493L(View view, final Group group) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.sdk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f12891a.m14494M(group, view2);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m14494M(Group group, View view) {
        m14489G(group);
        Act act = this.f13266d;
        act.startActivity(new FeedGroupDetailAct.C2044a(act, ((DbObject) group).id).m2961a());
    }

    /* JADX INFO: renamed from: N */
    public void m14495N(List<Group> list) {
        this.f13265c = list;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        super.onBindViewHolder(d0Var, i);
        this.f13267e.m11594h(d0Var.itemView, this.f13265c.get(i), i);
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f13267e.m11593g(d0Var.itemView);
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f13267e.m11595i(d0Var.itemView);
    }
}
