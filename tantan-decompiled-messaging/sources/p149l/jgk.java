package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.putong.core.data.GroupApply;
import com.p046p1.mobile.putong.core.data.GroupNotification;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.group.GroupNotificationAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class jgk implements s7m<igk>, SwipeRefreshLayout.InterfaceC0700j {

    /* JADX INFO: renamed from: a */
    public SwipeRefreshLayout f117795a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f117796b;

    /* JADX INFO: renamed from: c */
    public final GroupNotificationAct f117797c;

    /* JADX INFO: renamed from: d */
    public igk f117798d;

    /* JADX INFO: renamed from: e */
    public qfk f117799e;

    /* JADX INFO: renamed from: l.jgk$a */
    public static class C17765a {
        /* JADX INFO: renamed from: b */
        public static void m141310b(jgk jgkVar, View view) {
            jgkVar.f117795a = (SwipeRefreshLayout) view;
            jgkVar.f117796b = (VRecyclerView) view.findViewById(y4c0.f195983I3);
        }

        /* JADX INFO: renamed from: c */
        public static View m141311c(jgk jgkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(l6c0.f126558s0, viewGroup, false);
            m141310b(jgkVar, viewInflate);
            return viewInflate;
        }
    }

    public jgk(GroupNotificationAct groupNotificationAct) {
        this.f117797c = groupNotificationAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f117797c;
    }

    /* JADX INFO: renamed from: c */
    public View m141303c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C17765a.m141311c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(igk igkVar) {
        this.f117798d = igkVar;
    }

    /* JADX INFO: renamed from: e */
    public void m141305e(List<GroupNotification> list) {
        if (NullChecker.m81303a(this.f117799e)) {
            this.f117799e.m174355H(list);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m141306f(boolean z) {
        this.f117795a.setRefreshing(z);
    }

    /* JADX INFO: renamed from: i */
    public void m141307i(GroupApply groupApply) {
        if (NullChecker.m81303a(this.f117799e)) {
            this.f117799e.m174356I(groupApply);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m141303c(layoutInflater, viewGroup);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
    /* JADX INFO: renamed from: q */
    public void mo4094q() {
        this.f117798d.m136066C0();
    }

    /* JADX INFO: renamed from: r */
    public void m141308r() {
        this.f117797c.setTitle(R$string.f20926b0);
        qfk qfkVar = new qfk(this.f117797c, this.f117798d);
        this.f117799e = qfkVar;
        this.f117796b.setAdapter(qfkVar);
        this.f117795a.setOnRefreshListener(this);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
