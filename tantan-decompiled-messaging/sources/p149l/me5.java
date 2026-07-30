package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.topic.topiclist.NewPostTopicItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class me5 extends eac0<TopicMoment> {

    /* JADX INFO: renamed from: e */
    public Act f133362e;

    /* JADX INFO: renamed from: f */
    public String f133363f;

    /* JADX INFO: renamed from: g */
    public f30<String, TopicMoment> f133364g;

    /* JADX INFO: renamed from: d */
    public List<TopicMoment> f133361d = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f133365h = false;

    /* JADX INFO: renamed from: l.me5$a */
    public class RunnableC18441a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ NewPostTopicItemView f133366a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TopicMoment f133367b;

        public RunnableC18441a(NewPostTopicItemView newPostTopicItemView, TopicMoment topicMoment) {
            this.f133366a = newPostTopicItemView;
            this.f133367b = topicMoment;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (me5.this.m154136N(this.f133366a)) {
                nlg nlgVarM160044g = nlg.m160044g();
                Act act = me5.this.f133362e;
                boolean zM154137O = me5.this.m154137O(this.f133366a.f43215f);
                NewPostTopicItemView newPostTopicItemView = this.f133366a;
                if (zM154137O) {
                    view = newPostTopicItemView;
                    view = newPostTopicItemView.f43215f;
                }
                view = newPostTopicItemView;
                nlgVarM160044g.m160046c(act, view, this.f133367b);
            }
        }
    }

    public me5(Act act) {
        this.f133362e = act;
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f133361d.size();
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: D */
    public View mo28825D(ViewGroup viewGroup, int i) {
        return new NewPostTopicItemView(this.f133362e);
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo28823A(View view, TopicMoment topicMoment, int i, int i2) {
        NewPostTopicItemView newPostTopicItemView = (NewPostTopicItemView) view;
        newPostTopicItemView.m66106i(topicMoment);
        if (i2 == 0 && NullChecker.m81304b(topicMoment)) {
            newPostTopicItemView.m66108k(topicMoment.name);
            if (nkg.m159899p0() && !this.f133365h) {
                this.f133365h = true;
                zvf0.m220402x("e_create_topic", "p_moment_post");
            }
        } else {
            newPostTopicItemView.m66109l();
        }
        newPostTopicItemView.setViewSelected(topicMoment.selected);
        m154135M(newPostTopicItemView, topicMoment);
        if (NullChecker.m81303a(topicMoment) && topicMoment.isActivityTopic() && topicMoment.selected && TextUtils.equals(topicMoment.f39247id, nlg.m160044g().f139548c)) {
            newPostTopicItemView.f43215f.post(new RunnableC18441a(newPostTopicItemView, topicMoment));
        }
    }

    @Override // p149l.dac0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f133361d.get(i);
    }

    /* JADX INFO: renamed from: L */
    public int m154134L(TopicMoment topicMoment) {
        if (NullChecker.m81303a(this.f133361d) && NullChecker.m81304b(topicMoment)) {
            return this.f133361d.indexOf(topicMoment);
        }
        return -1;
    }

    /* JADX INFO: renamed from: M */
    public final void m154135M(final NewPostTopicItemView newPostTopicItemView, final TopicMoment topicMoment) {
        xdl0.m208329E0(newPostTopicItemView, new View.OnClickListener() { // from class: l.le5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127652a.m154138P(newPostTopicItemView, topicMoment, view);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final boolean m154136N(View view) {
        if (!xdl0.m208349O0(view)) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[0] + t100.f167266o < this.f133362e.getWindow().getDecorView().getWidth();
    }

    /* JADX INFO: renamed from: O */
    public final boolean m154137O(View view) {
        if (!xdl0.m208349O0(view)) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return (iArr[0] + view.getMeasuredWidth()) + t100.f167266o < this.f133362e.getWindow().getDecorView().getWidth();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m154138P(NewPostTopicItemView newPostTopicItemView, TopicMoment topicMoment, View view) {
        nlg nlgVarM160044g = nlg.m160044g();
        boolean zM154137O = m154137O(newPostTopicItemView.f43215f);
        View view2 = newPostTopicItemView;
        if (zM154137O) {
            view2 = newPostTopicItemView.f43215f;
        }
        nlgVarM160044g.m160045b(view2);
        if (NullChecker.m81303a(this.f133364g)) {
            this.f133364g.call(this.f133363f, topicMoment);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m154139Q(String str, List<TopicMoment> list) {
        this.f133363f = str;
        this.f133361d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: R */
    public void m154140R(f30<String, TopicMoment> f30Var) {
        this.f133364g = f30Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return super.getItemViewType(i);
    }
}
