package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Group;
import com.p046p1.mobile.putong.feed.newui.group.FeedGroupEntranceItemView;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class tdk extends dac0<Group> {

    /* JADX INFO: renamed from: c */
    public List<Group> f169565c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f169566d;

    /* JADX INFO: renamed from: e */
    public l80 f169567e;

    public tdk(Act act, l80 l80Var) {
        this.f169566d = act;
        this.f169567e = l80Var;
    }

    /* JADX INFO: renamed from: K */
    private String m188127K() {
        return nkg.m159904s() ? "p_discover_dating" : OMSDialogPositon.p_nearby;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f169565c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f169566d.inflater().inflate(o6c0.f142015D0, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, Group group, int i, int i2) {
        FeedGroupEntranceItemView feedGroupEntranceItemView = (FeedGroupEntranceItemView) view;
        feedGroupEntranceItemView.m61883s(group);
        m188133L(feedGroupEntranceItemView, group);
        if (i2 == getPageCount() - 1) {
            xdl0.m208359W(feedGroupEntranceItemView, m188132J(group));
        } else {
            xdl0.m208359W(feedGroupEntranceItemView, 0);
        }
        if (i2 == 0) {
            xdl0.m208358V(feedGroupEntranceItemView, m188132J(group));
        } else {
            xdl0.m208358V(feedGroupEntranceItemView, t100.m186890d(12.0f));
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m188129G(Group group) {
        p6j0.m167669c("e_circle", m188127K(), new j760("circle_id", group.f56011id), new j760("circle_source", m188130H()));
    }

    /* JADX INFO: renamed from: H */
    public final String m188130H() {
        if (nkg.m159904s()) {
            return "dating";
        }
        User userMe_ = FeedModule.m60222H().me_();
        return (NullChecker.m81303a(userMe_) && userMe_.isFemale()) ? "recommend" : "nearby";
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public Group getItem(int i) {
        return this.f169565c.get(i);
    }

    /* JADX INFO: renamed from: J */
    public final int m188132J(Group group) {
        return group.unReadMomentCounter > 0 ? t100.m186890d(17.0f) / 2 : t100.m186890d(12.0f);
    }

    /* JADX INFO: renamed from: L */
    public final void m188133L(View view, final Group group) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.sdk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f163858a.m188134M(group, view2);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m188134M(Group group, View view) {
        m188129G(group);
        Act act = this.f169566d;
        act.startActivity(new FeedGroupDetailAct.C11200a(act, group.f56011id).m61987a());
    }

    /* JADX INFO: renamed from: N */
    public void m188135N(List<Group> list) {
        this.f169565c = list;
        notifyDataSetChanged();
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        super.onBindViewHolder(abstractC0566d0, i);
        this.f169567e.m148839h(abstractC0566d0.itemView, this.f169565c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f169567e.m148838g(abstractC0566d0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f169567e.m148840i(abstractC0566d0.itemView);
    }
}
