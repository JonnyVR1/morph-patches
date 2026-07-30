package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.p051p1.mobile.putong.live.base.R$string;
import java.util.List;
import p151v.VRecyclerView;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class ey80 implements iam<vx80> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f96408a;

    /* JADX INFO: renamed from: b */
    public VRecyclerView f96409b;

    /* JADX INFO: renamed from: c */
    public vx80 f96410c;

    /* JADX INFO: renamed from: d */
    public lv80 f96411d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m123186d(View view) {
        act().onBackPressed();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f96409b.getContext();
    }

    /* JADX INFO: renamed from: b */
    public View m123187b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gy80.m132938b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(vx80 vx80Var) {
        this.f96410c = vx80Var;
    }

    /* JADX INFO: renamed from: e */
    public void m123189e(List<yw80<?>> list) {
        this.f96408a.setTitle(tbs.f172988a.getString(R$string.f45022i0));
        this.f96408a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.xx80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f196617a.m123186d(view);
            }
        });
        if (jyb.m147479J(list)) {
            return;
        }
        if (this.f96411d == null) {
            this.f96411d = new lv80();
            this.f96409b.setLayoutManager(new LinearLayoutManager(getContext()));
            this.f96409b.setAdapter(this.f96411d);
        }
        this.f96411d.m155978e0(list);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m123187b(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
