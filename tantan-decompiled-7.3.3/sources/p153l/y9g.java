package p153l;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BFansRecallUser;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public class y9g implements iam<lag> {

    /* JADX INFO: renamed from: a */
    public lag f198087a;

    /* JADX INFO: renamed from: b */
    public final RecyclerView f198088b;

    /* JADX INFO: renamed from: c */
    public i6g f198089c = new i6g();

    /* JADX INFO: renamed from: l.y9g$a */
    public class C21546a extends RecyclerView.AbstractC0578n {
        public C21546a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull @NotNull Rect rect, @NonNull @NotNull View view, @NonNull @NotNull RecyclerView recyclerView, @NonNull @NotNull RecyclerView.C0561a0 c0561a0) {
            super.getItemOffsets(rect, view, recyclerView, c0561a0);
            if (y9g.this.f198089c.m68536H(recyclerView.getChildAdapterPosition(view)) instanceof dig) {
                rect.bottom = qa00.f156323j;
            }
        }
    }

    public y9g(Act act) {
        RecyclerView recyclerView = new RecyclerView(act);
        this.f198088b = recyclerView;
        recyclerView.setLayoutManager(new LinearLayoutManager(act));
        recyclerView.setNestedScrollingEnabled(true);
        recyclerView.setAdapter(this.f198089c);
        recyclerView.addItemDecoration(new C21546a());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f198088b.getContext();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(lag lagVar) {
        this.f198087a = lagVar;
    }

    /* JADX INFO: renamed from: c */
    public View m214822c() {
        return this.f198088b;
    }

    /* JADX INFO: renamed from: d */
    public void m214823d(BFansRecallUser bFansRecallUser) {
        dig digVarM138816f0;
        i6g i6gVar = this.f198089c;
        if (i6gVar == null || (digVarM138816f0 = i6gVar.m138816f0(bFansRecallUser)) == null) {
            return;
        }
        this.f198089c.m68543O(digVarM138816f0);
    }

    /* JADX INFO: renamed from: e */
    public void m214824e(boolean z, teg tegVar) {
        this.f198089c.m138819i0(z, tegVar, this.f198087a);
    }

    /* JADX INFO: renamed from: f */
    public void m214825f(teg tegVar, yhg yhgVar) {
        this.f198089c.m138817g0(tegVar, yhgVar, this.f198087a);
    }

    /* JADX INFO: renamed from: i */
    public void m214826i(mag magVar, teg tegVar) {
        this.f198089c.m138818h0(magVar, tegVar, this.f198087a);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
