package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.putong.core.data.GroupApply;
import com.p051p1.mobile.putong.core.data.GroupNotification;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.group.GroupNotificationAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VRecyclerView;

/* JADX INFO: loaded from: classes11.dex */
public class zik implements iam<yik>, SwipeRefreshLayout.InterfaceC0702j {

    /* JADX INFO: renamed from: a */
    public SwipeRefreshLayout f204591a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f204592b;

    /* JADX INFO: renamed from: c */
    public final GroupNotificationAct f204593c;

    /* JADX INFO: renamed from: d */
    public yik f204594d;

    /* JADX INFO: renamed from: e */
    public gik f204595e;

    /* JADX INFO: renamed from: l.zik$a */
    public static class C21826a {
        /* JADX INFO: renamed from: b */
        public static void m219923b(zik zikVar, View view) {
            zikVar.f204591a = (SwipeRefreshLayout) view;
            zikVar.f204592b = (VRecyclerView) view.findViewById(edc0.f93218I3);
        }

        /* JADX INFO: renamed from: c */
        public static View m219924c(zik zikVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(qec0.f157114s0, viewGroup, false);
            m219923b(zikVar, viewInflate);
            return viewInflate;
        }
    }

    public zik(GroupNotificationAct groupNotificationAct) {
        this.f204593c = groupNotificationAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f204593c;
    }

    /* JADX INFO: renamed from: c */
    public View m219916c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C21826a.m219924c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(yik yikVar) {
        this.f204594d = yikVar;
    }

    /* JADX INFO: renamed from: e */
    public void m219918e(List<GroupNotification> list) {
        if (NullChecker.m82486a(this.f204595e)) {
            this.f204595e.m130329H(list);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m219919f(boolean z) {
        this.f204591a.setRefreshing(z);
    }

    /* JADX INFO: renamed from: i */
    public void m219920i(GroupApply groupApply) {
        if (NullChecker.m82486a(this.f204595e)) {
            this.f204595e.m130330I(groupApply);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m219916c(layoutInflater, viewGroup);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
    /* JADX INFO: renamed from: p */
    public void mo4096p() {
        this.f204594d.m216107C0();
    }

    /* JADX INFO: renamed from: r */
    public void m219921r() {
        this.f204593c.setTitle(R$string.f21668b0);
        gik gikVar = new gik(this.f204593c, this.f204594d);
        this.f204595e = gikVar;
        this.f204592b.setAdapter(gikVar);
        this.f204591a.setOnRefreshListener(this);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
