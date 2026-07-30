package p149l;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.TopicCategorie;
import com.p046p1.mobile.putong.feed.newui.group.dialog.insert.twolevellinkage.FeedPostTopicCategoryItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class wyi0 extends dac0<TopicCategorie> {

    /* JADX INFO: renamed from: c */
    public List<TopicCategorie> f188569c = new ArrayList();

    /* JADX INFO: renamed from: d */
    public Act f188570d;

    /* JADX INFO: renamed from: e */
    public l80 f188571e;

    /* JADX INFO: renamed from: f */
    public e30<TopicCategorie> f188572f;

    public wyi0(Act act, l80 l80Var) {
        this.f188570d = act;
        this.f188571e = l80Var;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f188569c.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return this.f188570d.inflater().inflate(o6c0.f142053J2, viewGroup, false);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, TopicCategorie topicCategorie, int i, int i2) {
        FeedPostTopicCategoryItemView feedPostTopicCategoryItemView = (FeedPostTopicCategoryItemView) view;
        feedPostTopicCategoryItemView.m61977b(topicCategorie);
        xdl0.m208358V(feedPostTopicCategoryItemView, i2 == 0 ? t100.m186890d(16.0f) : 0);
        m206106H(feedPostTopicCategoryItemView, topicCategorie);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
    public TopicCategorie getItem(int i) {
        return this.f188569c.get(i);
    }

    /* JADX INFO: renamed from: H */
    public final void m206106H(View view, final TopicCategorie topicCategorie) {
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.vyi0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f183532a.m206107I(topicCategorie, view2);
            }
        });
    }

    /* JADX INFO: renamed from: I */
    public final /* synthetic */ void m206107I(TopicCategorie topicCategorie, View view) {
        p6j0.m167669c("e_topic_category", "p_pick_topic", j760.m140076a("topic_category_name", topicCategorie.name));
        if (NullChecker.m81303a(this.f188572f)) {
            this.f188572f.call(topicCategorie);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m206108J(List<TopicCategorie> list) {
        this.f188569c = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: K */
    public void m206109K(e30<TopicCategorie> e30Var) {
        this.f188572f = e30Var;
    }

    @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        super.onBindViewHolder(abstractC0566d0, i);
        this.f188571e.m148839h(abstractC0566d0.itemView, this.f188569c.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewAttachedToWindow(abstractC0566d0);
        this.f188571e.m148838g(abstractC0566d0.itemView);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        super.onViewDetachedFromWindow(abstractC0566d0);
        this.f188571e.m148840i(abstractC0566d0.itemView);
    }
}
