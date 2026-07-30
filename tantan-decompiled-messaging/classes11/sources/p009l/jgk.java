package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p000p1.mobile.putong.core.newui.group.GroupNotificationAct;
import com.p1.mobile.putong.core.data.GroupApply;
import com.p1.mobile.putong.core.data.GroupNotification;
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.l6c0;
import l.s7m;
import l.y4c0;
import v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class jgk implements s7m<igk>, SwipeRefreshLayout.j {

    /* JADX INFO: renamed from: a */
    public SwipeRefreshLayout f15111a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f15112b;

    /* JADX INFO: renamed from: c */
    public final GroupNotificationAct f15113c;

    /* JADX INFO: renamed from: d */
    public igk f15114d;

    /* JADX INFO: renamed from: e */
    public qfk f15115e;

    /* JADX INFO: renamed from: l.jgk$a */
    public static class C0973a {
        /* JADX INFO: renamed from: b */
        public static void m17001b(jgk jgkVar, View view) {
            jgkVar.f15111a = (SwipeRefreshLayout) view;
            jgkVar.f15112b = view.findViewById(y4c0.I3);
        }

        /* JADX INFO: renamed from: c */
        public static View m17002c(jgk jgkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.s0, viewGroup, false);
            m17001b(jgkVar, viewInflate);
            return viewInflate;
        }
    }

    public jgk(GroupNotificationAct groupNotificationAct) {
        this.f15113c = groupNotificationAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m16991C0() {
        return this.f15113c;
    }

    /* JADX INFO: renamed from: c */
    public View m16992c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C0973a.m17002c(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m16997i1(igk igkVar) {
        this.f15114d = igkVar;
    }

    /* JADX INFO: renamed from: e */
    public void m16994e(List<GroupNotification> list) {
        if (NullChecker.a(this.f15115e)) {
            this.f15115e.m20970H(list);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m16995f(boolean z) {
        this.f15111a.setRefreshing(z);
    }

    /* JADX INFO: renamed from: i */
    public void m16996i(GroupApply groupApply) {
        if (NullChecker.a(this.f15115e)) {
            this.f15115e.m20971I(groupApply);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m16992c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: q */
    public void m16998q() {
        this.f15114d.m16538C0();
    }

    /* JADX INFO: renamed from: r */
    public void m16999r() {
        this.f15113c.setTitle(R.string.b0);
        qfk qfkVar = new qfk(this.f15113c, this.f15114d);
        this.f15115e = qfkVar;
        this.f15112b.setAdapter(qfkVar);
        this.f15111a.setOnRefreshListener(this);
    }

    public void destroy() {
    }
}
