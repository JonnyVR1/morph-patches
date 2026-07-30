package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class p14 implements s7m<a74> {

    /* JADX INFO: renamed from: a */
    public RecyclerView f146644a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f146645b;

    /* JADX INFO: renamed from: c */
    public TextView f146646c;

    /* JADX INFO: renamed from: d */
    public a74 f146647d;

    /* JADX INFO: renamed from: e */
    public LiveBaseAdapter f146648e;

    /* JADX INFO: renamed from: f */
    public nfp0 f146649f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m167018f(View view) {
        this.f146647d.m95225s4();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f146647d.act();
    }

    /* JADX INFO: renamed from: b */
    public View m167019b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return q14.m172371b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(a74 a74Var) {
        this.f146647d = a74Var;
    }

    /* JADX INFO: renamed from: d */
    public List<d1q<?>> m167021d() {
        return this.f146648e.m67355J();
    }

    /* JADX INFO: renamed from: e */
    public View m167022e() {
        View viewM167019b = m167019b(act().inflater(), null);
        this.f146644a.setLayoutManager(new LinearLayoutManager(act(), 1, false));
        this.f146644a.setItemAnimator(null);
        LiveBaseAdapter liveBaseAdapter = new LiveBaseAdapter();
        this.f146648e = liveBaseAdapter;
        this.f146644a.setAdapter(liveBaseAdapter);
        xdl0.m208329E0(this.f146646c, new View.OnClickListener() { // from class: l.o14
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f141403a.m167018f(view);
            }
        });
        this.f146646c.setText(ypv.m215672k().m195735T3().callSettingButtonText);
        this.f146649f = new nfp0();
        return viewM167019b;
    }

    /* JADX INFO: renamed from: i */
    public void m167023i(mfp0 mfp0Var) {
        this.f146648e.m67360O(mfp0Var);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m167024j(d1q d1qVar) {
        if (d1qVar != null) {
            this.f146648e.m67368W(d1qVar);
        }
        if (this.f146648e.m67355J().size() == 1) {
            this.f146648e.m67355J().remove(this.f146649f);
        }
        m167026l(this.f146648e.getItemCount() == 0);
    }

    /* JADX INFO: renamed from: k */
    public void m167025k(List<d1q<?>> list) {
        if (list.contains(this.f146649f)) {
            list.remove(this.f146649f);
        }
        if (!vwb.m200296J(list)) {
            list.add(this.f146649f);
        }
        this.f146648e.m67371Z(list);
        m167026l(this.f146648e.getItemCount() == 0);
    }

    /* JADX INFO: renamed from: l */
    public void m167026l(boolean z) {
        xdl0.m208344M(this.f146645b, z);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
