package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.p058ui.settings.MomentMutedAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VLinear;
import p151v.VList;
import p151v.VProgressBar;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes12.dex */
public class cq00 implements iam<aq00> {

    /* JADX INFO: renamed from: a */
    public VLinear f83052a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f83053b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f83054c;

    /* JADX INFO: renamed from: d */
    public VText f83055d;

    /* JADX INFO: renamed from: e */
    public VList f83056e;

    /* JADX INFO: renamed from: f */
    public MomentMutedAct f83057f;

    /* JADX INFO: renamed from: g */
    public xp00 f83058g;

    public cq00(MomentMutedAct momentMutedAct) {
        this.f83057f = momentMutedAct;
    }

    /* JADX INFO: renamed from: d */
    private void m111858d() {
        this.f83055d.setText(this.f83057f.getString(R$string.f19527oj));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m111859e(View view) {
        act().onBackPressed();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f83057f;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f83057f;
    }

    /* JADX INFO: renamed from: b */
    public View m111860b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dq00.m117436b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f */
    public void m111862f(List<String> list) {
        this.f83054c.setVisibility(4);
        bnl0.m105525M0(this.f83056e, NullChecker.m82486a(list) && list.size() > 0);
        bnl0.m105525M0(this.f83055d, !NullChecker.m82486a(list) || list.size() == 0);
        this.f83058g.m212505K(list);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m111860b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m111863r() {
        this.f83053b.setTitle(act().getString(R$string.f19563po));
        this.f83053b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.bq00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f77843a.m111859e(view);
            }
        });
        this.f83054c.setVisibility(0);
        this.f83056e.setVisibility(4);
        this.f83055d.setVisibility(4);
        this.f83058g = new xp00(this.f83057f);
        View view = new View(this.f83057f);
        view.setClickable(false);
        view.setEnabled(false);
        view.setMinimumHeight(qa00.m175859d(2.0f));
        this.f83056e.addHeaderView(view);
        this.f83056e.setRecyclerListener(this.f83058g);
        this.f83056e.setAdapter((ListAdapter) this.f83058g);
        m111858d();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(aq00 aq00Var) {
    }
}
