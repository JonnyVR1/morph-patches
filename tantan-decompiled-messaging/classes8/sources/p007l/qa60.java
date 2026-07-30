package p007l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p003p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.profile.R;
import l.ra60;
import l.xdl0;
import v.VButton_FakeShadow;
import v.VMaterialEdit;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class qa60 implements s7m<na60> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f3822a;

    /* JADX INFO: renamed from: b */
    public VMaterialEdit f3823b;

    /* JADX INFO: renamed from: c */
    public VButton_FakeShadow f3824c;

    /* JADX INFO: renamed from: d */
    public na60 f3825d;

    /* JADX INFO: renamed from: e */
    public Act f3826e;

    public qa60(Act act) {
        this.f3826e = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m10304e(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m10305f() {
        this.f3823b.requestFocus();
    }

    @Override // p007l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo1334C0() {
        return this.f3826e;
    }

    @Override // p007l.s7m
    @Nullable
    public Act act() {
        return this.f3826e;
    }

    /* JADX INFO: renamed from: c */
    public View m10306c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ra60.b(this, layoutInflater, viewGroup);
    }

    @Override // p007l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo1337i1(na60 na60Var) {
        this.f3825d = na60Var;
    }

    @Override // p007l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m10306c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m10308r() {
        this.f3822a.setTitle(act().getString(R.string.o0));
        this.f3822a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.oa60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f3515a.m10304e(view);
            }
        });
        e51.m9024G(new Runnable() { // from class: l.pa60
            @Override // java.lang.Runnable
            public final void run() {
                this.f3706a.m10305f();
            }
        });
        this.f3825d.m9978o0(this.f3823b);
        xdl0.E0(this.f3824c, this.f3825d.m9974j0(this.f3823b));
    }

    @Override // p007l.s7m
    public void destroy() {
    }
}
