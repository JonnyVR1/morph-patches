package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.topic.topiclist.NewPostTopicItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes13.dex */
public class mf5 extends kic0<TopicMoment> {

    /* JADX INFO: renamed from: e */
    public Act f136607e;

    /* JADX INFO: renamed from: f */
    public String f136608f;

    /* JADX INFO: renamed from: g */
    public z20<String, TopicMoment> f136609g;

    /* JADX INFO: renamed from: d */
    public List<TopicMoment> f136606d = new ArrayList();

    /* JADX INFO: renamed from: h */
    public boolean f136610h = false;

    /* JADX INFO: renamed from: l.mf5$a */
    public class RunnableC18605a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ NewPostTopicItemView f136611a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ TopicMoment f136612b;

        public RunnableC18605a(NewPostTopicItemView newPostTopicItemView, TopicMoment topicMoment) {
            this.f136611a = newPostTopicItemView;
            this.f136612b = topicMoment;
        }

        @Override // java.lang.Runnable
        public void run() {
            View view;
            if (mf5.this.m158142N(this.f136611a)) {
                cng cngVarM111504g = cng.m111504g();
                Act act = mf5.this.f136607e;
                boolean zM158143O = mf5.this.m158143O(this.f136611a.f44063f);
                NewPostTopicItemView newPostTopicItemView = this.f136611a;
                if (zM158143O) {
                    view = newPostTopicItemView;
                    view = newPostTopicItemView.f44063f;
                }
                view = newPostTopicItemView;
                cngVarM111504g.m111506c(act, view, this.f136612b);
            }
        }
    }

    public mf5(Act act) {
        this.f136607e = act;
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: C */
    public int getPageCount() {
        return this.f136606d.size();
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: D */
    public View mo29824D(ViewGroup viewGroup, int i) {
        return new NewPostTopicItemView(this.f136607e);
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public void mo29822A(View view, TopicMoment topicMoment, int i, int i2) {
        NewPostTopicItemView newPostTopicItemView = (NewPostTopicItemView) view;
        newPostTopicItemView.m67289i(topicMoment);
        if (i2 == 0 && NullChecker.m82487b(topicMoment)) {
            newPostTopicItemView.m67291k(topicMoment.name);
            if (cmg.m111228p0() && !this.f136610h) {
                this.f136610h = true;
                i4g0.m138526x("e_create_topic", "p_moment_post");
            }
        } else {
            newPostTopicItemView.m67292l();
        }
        newPostTopicItemView.setViewSelected(topicMoment.selected);
        m158141M(newPostTopicItemView, topicMoment);
        if (NullChecker.m82486a(topicMoment) && topicMoment.isActivityTopic() && topicMoment.selected && TextUtils.equals(topicMoment.f40095id, cng.m111504g().f82718c)) {
            newPostTopicItemView.f44063f.post(new RunnableC18605a(newPostTopicItemView, topicMoment));
        }
    }

    @Override // p153l.jic0
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public TopicMoment getItem(int i) {
        return this.f136606d.get(i);
    }

    /* JADX INFO: renamed from: L */
    public int m158140L(TopicMoment topicMoment) {
        if (NullChecker.m82486a(this.f136606d) && NullChecker.m82487b(topicMoment)) {
            return this.f136606d.indexOf(topicMoment);
        }
        return -1;
    }

    /* JADX INFO: renamed from: M */
    public final void m158141M(final NewPostTopicItemView newPostTopicItemView, final TopicMoment topicMoment) {
        bnl0.m105509E0(newPostTopicItemView, new View.OnClickListener() { // from class: l.lf5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f131805a.m158144P(newPostTopicItemView, topicMoment, view);
            }
        });
    }

    /* JADX INFO: renamed from: N */
    public final boolean m158142N(View view) {
        if (!bnl0.m105529O0(view)) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return iArr[0] + qa00.f156328o < this.f136607e.getWindow().getDecorView().getWidth();
    }

    /* JADX INFO: renamed from: O */
    public final boolean m158143O(View view) {
        if (!bnl0.m105529O0(view)) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        return (iArr[0] + view.getMeasuredWidth()) + qa00.f156328o < this.f136607e.getWindow().getDecorView().getWidth();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m158144P(NewPostTopicItemView newPostTopicItemView, TopicMoment topicMoment, View view) {
        cng cngVarM111504g = cng.m111504g();
        boolean zM158143O = m158143O(newPostTopicItemView.f44063f);
        View view2 = newPostTopicItemView;
        if (zM158143O) {
            view2 = newPostTopicItemView.f44063f;
        }
        cngVarM111504g.m111505b(view2);
        if (NullChecker.m82486a(this.f136609g)) {
            this.f136609g.call(this.f136608f, topicMoment);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m158145Q(String str, List<TopicMoment> list) {
        this.f136608f = str;
        this.f136606d = list;
        notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: R */
    public void m158146R(z20<String, TopicMoment> z20Var) {
        this.f136609g = z20Var;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        return super.getItemViewType(i);
    }
}
