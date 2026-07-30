package p007l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.topic.topiclist.NewPostTopicItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.f30;
import l.t100;
import l.xdl0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class me5 extends eac0<TopicMoment> {

    /* JADX INFO: renamed from: e */
    public Act f10440e;

    /* JADX INFO: renamed from: f */
    public String f10441f;

    /* JADX INFO: renamed from: g */
    public f30<String, TopicMoment> f10442g;

    /* JADX INFO: renamed from: d */
    public List<TopicMoment> f10439d = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f10443h = false;

    /* JADX INFO: renamed from: l.me5$a */
    public class RunnableC2427a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ NewPostTopicItemView f10444a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TopicMoment f10445b;

        public RunnableC2427a(NewPostTopicItemView newPostTopicItemView, TopicMoment topicMoment) {
            this.f10444a = newPostTopicItemView;
            this.f10445b = topicMoment;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (me5.this.m11924N(this.f10444a)) {
                nlg nlgVarM12287g = nlg.m12287g();
                Act act = me5.this.f10440e;
                boolean zM11925O = me5.this.m11925O(this.f10444a.f4676f);
                NewPostTopicItemView newPostTopicItemView = this.f10444a;
                if (zM11925O) {
                    view = newPostTopicItemView;
                    view = newPostTopicItemView.f4676f;
                }
                view = newPostTopicItemView;
                nlgVarM12287g.m12289c(act, view, this.f10445b);
            }
        }
    }

    public me5(Act act) {
        this.f10440e = act;
    }

    /* JADX INFO: renamed from: C */
    public int m11918C() {
        return this.f10439d.size();
    }

    /* JADX INFO: renamed from: D */
    public View m11919D(ViewGroup viewGroup, int i) {
        return new NewPostTopicItemView(this.f10440e);
    }

    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void m11917A(View view, TopicMoment topicMoment, int i, int i2) {
        NewPostTopicItemView newPostTopicItemView = (NewPostTopicItemView) view;
        newPostTopicItemView.m7258i(topicMoment);
        if (i2 == 0 && NullChecker.b(topicMoment)) {
            newPostTopicItemView.m7260k(topicMoment.name);
            if (nkg.m12258p0() && !this.f10443h) {
                this.f10443h = true;
                zvf0.x("e_create_topic", "p_moment_post");
            }
        } else {
            newPostTopicItemView.m7261l();
        }
        newPostTopicItemView.setViewSelected(topicMoment.selected);
        m11923M(newPostTopicItemView, topicMoment);
        if (NullChecker.a(topicMoment) && topicMoment.isActivityTopic() && topicMoment.selected && TextUtils.equals(topicMoment.f708id, nlg.m12287g().f10828c)) {
            newPostTopicItemView.f4676f.post(new RunnableC2427a(newPostTopicItemView, topicMoment));
        }
    }

    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f10439d.get(i);
    }

    /* JADX INFO: renamed from: L */
    public int m11922L(TopicMoment topicMoment) {
        if (NullChecker.a(this.f10439d) && NullChecker.b(topicMoment)) {
            return this.f10439d.indexOf(topicMoment);
        }
        return -1;
    }

    /* JADX INFO: renamed from: M */
    public final void m11923M(final NewPostTopicItemView newPostTopicItemView, final TopicMoment topicMoment) {
        xdl0.E0(newPostTopicItemView, new View.OnClickListener() { // from class: l.le5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10013a.m11926P(newPostTopicItemView, topicMoment, view);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final boolean m11924N(View view) {
        if (!xdl0.O0(view)) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[0] + t100.o < this.f10440e.getWindow().getDecorView().getWidth();
    }

    /* JADX INFO: renamed from: O */
    public final boolean m11925O(View view) {
        if (!xdl0.O0(view)) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return (iArr[0] + view.getMeasuredWidth()) + t100.o < this.f10440e.getWindow().getDecorView().getWidth();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m11926P(NewPostTopicItemView newPostTopicItemView, TopicMoment topicMoment, View view) {
        nlg nlgVarM12287g = nlg.m12287g();
        boolean zM11925O = m11925O(newPostTopicItemView.f4676f);
        View view2 = newPostTopicItemView;
        if (zM11925O) {
            view2 = newPostTopicItemView.f4676f;
        }
        nlgVarM12287g.m12288b(view2);
        if (NullChecker.a(this.f10442g)) {
            this.f10442g.call(this.f10441f, topicMoment);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m11927Q(String str, List<TopicMoment> list) {
        this.f10441f = str;
        this.f10439d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: R */
    public void m11928R(f30<String, TopicMoment> f30Var) {
        this.f10442g = f30Var;
    }

    public int getItemViewType(int i) {
        return super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.getItemViewType(i);
    }
}
