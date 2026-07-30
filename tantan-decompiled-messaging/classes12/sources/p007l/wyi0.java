package p007l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.data.TopicCategorie;
import com.p000p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostTopicCategoryItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.dac0;
import l.e30;
import l.j760;
import l.t100;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class wyi0 extends dac0<TopicCategorie> {

    /* JADX INFO: renamed from: c */
    public List<TopicCategorie> f14704c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f14705d;

    /* JADX INFO: renamed from: e */
    public l80 f14706e;

    /* JADX INFO: renamed from: f */
    public e30<TopicCategorie> f14707f;

    public wyi0(Act act, l80 l80Var) {
        this.f14705d = act;
        this.f14706e = l80Var;
    }

    /* JADX INFO: renamed from: C */
    public int m15936C() {
        return this.f14704c.size();
    }

    /* JADX INFO: renamed from: D */
    public View m15937D(ViewGroup viewGroup, int i) {
        return this.f14705d.inflater().inflate(o6c0.f11072J2, viewGroup, false);
    }

    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void m15935A(View view, TopicCategorie topicCategorie, int i, int i2) {
        FeedPostTopicCategoryItemView feedPostTopicCategoryItemView = (FeedPostTopicCategoryItemView) view;
        feedPostTopicCategoryItemView.m2951b(topicCategorie);
        xdl0.V(feedPostTopicCategoryItemView, i2 == 0 ? t100.d(16.0f) : 0);
        m15940H(feedPostTopicCategoryItemView, topicCategorie);
    }

    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public TopicCategorie getItem(int i) {
        return this.f14704c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final void m15940H(View view, final TopicCategorie topicCategorie) {
        xdl0.E0(view, new View.OnClickListener() { // from class: l.vyi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14333a.m15941I(topicCategorie, view2);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m15941I(TopicCategorie topicCategorie, View view) {
        p6j0.m12913c("e_topic_category", "p_pick_topic", j760.a("topic_category_name", topicCategorie.name));
        if (NullChecker.a(this.f14707f)) {
            this.f14707f.call(topicCategorie);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m15942J(List<TopicCategorie> list) {
        this.f14704c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m15943K(e30<TopicCategorie> e30Var) {
        this.f14707f = e30Var;
    }

    public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        super.onBindViewHolder(d0Var, i);
        this.f14706e.m11594h(d0Var.itemView, this.f14704c.get(i), i);
    }

    public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
        this.f14706e.m11593g(d0Var.itemView);
    }

    public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
        super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
        this.f14706e.m11595i(d0Var.itemView);
    }
}
