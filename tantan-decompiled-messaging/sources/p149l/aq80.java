package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p046p1.mobile.putong.live.base.R$string;
import java.util.List;
import p147v.VRecyclerView;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes13.dex */
public class aq80 implements s7m<rp80> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f71135a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f71136b;

    /* JADX INFO: renamed from: c */
    public rp80 f71137c;

    /* JADX INFO: renamed from: d */
    public hn80 f71138d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m98231d(View view) {
        act().onBackPressed();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f71136b.getContext();
    }

    /* JADX INFO: renamed from: b */
    public View m98232b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cq80.m108234b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rp80 rp80Var) {
        this.f71137c = rp80Var;
    }

    /* JADX INFO: renamed from: e */
    public void m98234e(List<uo80<?>> list) {
        this.f71135a.setTitle(s9s.f163227a.getString(R$string.f44174i0));
        this.f71135a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.tp80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171451a.m98231d(view);
            }
        });
        if (vwb.m200296J(list)) {
            return;
        }
        if (this.f71138d == null) {
            this.f71138d = new hn80();
            this.f71136b.setLayoutManager(new LinearLayoutManager(getContext()));
            this.f71136b.setAdapter(this.f71138d);
        }
        this.f71138d.m131883e0(list);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m98232b(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
