package p149l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BFansRecallUser;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class k8g implements s7m<x8g> {

    /* JADX INFO: renamed from: a */
    public x8g f121807a;

    /* JADX INFO: renamed from: b */
    public final RecyclerView f121808b;

    /* JADX INFO: renamed from: c */
    public u4g f121809c = new u4g();

    /* JADX INFO: renamed from: l.k8g$a */
    public class C17955a extends RecyclerView.AbstractC0576n {
        public C17955a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0588z c0588z) {
            super.getItemOffsets(rect, view, recyclerView, c0588z);
            if (k8g.this.f121809c.m67353H(recyclerView.getChildAdapterPosition(view)) instanceof pgg) {
                rect.bottom = t100.f167261j;
            }
        }
    }

    public k8g(Act act) {
        RecyclerView recyclerView = new RecyclerView(act);
        this.f121808b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(act));
        recyclerView.setNestedScrollingEnabled(true);
        recyclerView.setAdapter(this.f121809c);
        recyclerView.addItemDecoration(new C17955a());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f121808b.getContext();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(x8g x8gVar) {
        this.f121807a = x8gVar;
    }

    /* JADX INFO: renamed from: c */
    public View m144930c() {
        return this.f121808b;
    }

    /* JADX INFO: renamed from: d */
    public void m144931d(BFansRecallUser bFansRecallUser) {
        pgg pggVarM191732f0;
        u4g u4gVar = this.f121809c;
        if (u4gVar == null || (pggVarM191732f0 = u4gVar.m191732f0(bFansRecallUser)) == null) {
            return;
        }
        this.f121809c.m67360O(pggVarM191732f0);
    }

    /* JADX INFO: renamed from: e */
    public void m144932e(boolean z, fdg fdgVar) {
        this.f121809c.m191735i0(z, fdgVar, this.f121807a);
    }

    /* JADX INFO: renamed from: f */
    public void m144933f(fdg fdgVar, kgg kggVar) {
        this.f121809c.m191733g0(fdgVar, kggVar, this.f121807a);
    }

    /* JADX INFO: renamed from: i */
    public void m144934i(y8g y8gVar, fdg fdgVar) {
        this.f121809c.m191734h0(y8gVar, fdgVar, this.f121807a);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
