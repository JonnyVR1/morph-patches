package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.p053ui.settings.MomentMutedAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VLinear;
import p147v.VList;
import p147v.VProgressBar;
import p147v.VText;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class th00 implements s7m<rh00> {

    /* JADX INFO: renamed from: a */
    public VLinear f170172a;

    /* JADX INFO: renamed from: b */
    public VNavigationBar f170173b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f170174c;

    /* JADX INFO: renamed from: d */
    public VText f170175d;

    /* JADX INFO: renamed from: e */
    public VList f170176e;

    /* JADX INFO: renamed from: f */
    public MomentMutedAct f170177f;

    /* JADX INFO: renamed from: g */
    public oh00 f170178g;

    public th00(MomentMutedAct momentMutedAct) {
        this.f170177f = momentMutedAct;
    }

    /* JADX INFO: renamed from: d */
    private void m188837d() {
        this.f170175d.setText(this.f170177f.getString(R$string.f18125Si));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m188838e(View view) {
        act().onBackPressed();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f170177f;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f170177f;
    }

    /* JADX INFO: renamed from: b */
    public View m188839b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uh00.m193606b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f */
    public void m188841f(List<String> list) {
        this.f170174c.setVisibility(4);
        xdl0.m208345M0(this.f170176e, NullChecker.m81303a(list) && list.size() > 0);
        xdl0.m208345M0(this.f170175d, !NullChecker.m81303a(list) || list.size() == 0);
        this.f170178g.m164324K(list);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m188839b(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m188842r() {
        this.f170173b.setTitle(act().getString(R$string.f18130Sn));
        this.f170173b.setLeftIconOnClick(new View.OnClickListener() { // from class: l.sh00
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f164506a.m188838e(view);
            }
        });
        this.f170174c.setVisibility(0);
        this.f170176e.setVisibility(4);
        this.f170175d.setVisibility(4);
        this.f170178g = new oh00(this.f170177f);
        View view = new View(this.f170177f);
        view.setClickable(false);
        view.setEnabled(false);
        view.setMinimumHeight(t100.m186890d(2.0f));
        this.f170176e.addHeaderView(view);
        this.f170176e.setRecyclerListener(this.f170178g);
        this.f170176e.setAdapter((ListAdapter) this.f170178g);
        m188837d();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rh00 rh00Var) {
    }
}
