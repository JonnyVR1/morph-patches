package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.profile.R$string;
import p147v.VButton_FakeShadow;
import p147v.VMaterialEdit;
import p147v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes8.dex */
public class qa60 implements s7m<na60> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f153508a;

    /* JADX INFO: renamed from: b */
    public VMaterialEdit f153509b;

    /* JADX INFO: renamed from: c */
    public VButton_FakeShadow f153510c;

    /* JADX INFO: renamed from: d */
    public na60 f153511d;

    /* JADX INFO: renamed from: e */
    public Act f153512e;

    public qa60(Act act) {
        this.f153512e = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m173685e(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m173686f() {
        this.f153509b.requestFocus();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f153512e;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f153512e;
    }

    /* JADX INFO: renamed from: c */
    public View m173687c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ra60.m178471b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(na60 na60Var) {
        this.f153511d = na60Var;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m173687c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m173689r() {
        this.f153508a.setTitle(act().getString(R$string.f27900o0));
        this.f153508a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.oa60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f142780a.m173685e(view);
            }
        });
        e51.m114742G(new Runnable() { // from class: l.pa60
            @Override // java.lang.Runnable
            public final void run() {
                this.f147947a.m173686f();
            }
        });
        this.f153511d.m158591o0(this.f153509b);
        xdl0.m208329E0(this.f153510c, this.f153511d.m158587j0(this.f153509b));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
