package p002l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BFansRecallUser;
import l.s7m;
import l.t100;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class k8g implements s7m<x8g> {

    /* JADX INFO: renamed from: a */
    public x8g f14247a;

    /* JADX INFO: renamed from: b */
    public final RecyclerView f14248b;

    /* JADX INFO: renamed from: c */
    public u4g f14249c = new u4g();

    /* JADX INFO: renamed from: l.k8g$a */
    public class C0649a extends RecyclerView.n {
        public C0649a() {
        }

        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.z zVar) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            if (k8g.this.f14249c.H(recyclerView.getChildAdapterPosition(view)) instanceof pgg) {
                rect.bottom = t100.j;
            }
        }
    }

    public k8g(Act act) {
        RecyclerView recyclerView = new RecyclerView(act);
        this.f14248b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(act));
        recyclerView.setNestedScrollingEnabled(true);
        recyclerView.setAdapter(this.f14249c);
        recyclerView.addItemDecoration(new C0649a());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m16542C0() {
        return this.f14248b.getContext();
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m16549i1(x8g x8gVar) {
        this.f14247a = x8gVar;
    }

    /* JADX INFO: renamed from: c */
    public View m16544c() {
        return this.f14248b;
    }

    /* JADX INFO: renamed from: d */
    public void m16545d(BFansRecallUser bFansRecallUser) {
        pgg pggVarM23280f0;
        u4g u4gVar = this.f14249c;
        if (u4gVar == null || (pggVarM23280f0 = u4gVar.m23280f0(bFansRecallUser)) == null) {
            return;
        }
        this.f14249c.O(pggVarM23280f0);
    }

    /* JADX INFO: renamed from: e */
    public void m16546e(boolean z, fdg fdgVar) {
        this.f14249c.m23283i0(z, fdgVar, this.f14247a);
    }

    /* JADX INFO: renamed from: f */
    public void m16547f(fdg fdgVar, kgg kggVar) {
        this.f14249c.m23281g0(fdgVar, kggVar, this.f14247a);
    }

    /* JADX INFO: renamed from: i */
    public void m16548i(y8g y8gVar, fdg fdgVar) {
        this.f14249c.m23282h0(y8gVar, fdgVar, this.f14247a);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
