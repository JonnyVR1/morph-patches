package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.profile.R$string;
import p151v.VButton_FakeShadow;
import p151v.VMaterialEdit;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class vi60 implements iam<si60> {

    /* JADX INFO: renamed from: a */
    public VNavigationBar f184217a;

    /* JADX INFO: renamed from: b */
    public VMaterialEdit f184218b;

    /* JADX INFO: renamed from: c */
    public VButton_FakeShadow f184219c;

    /* JADX INFO: renamed from: d */
    public si60 f184220d;

    /* JADX INFO: renamed from: e */
    public Act f184221e;

    public vi60(Act act) {
        this.f184221e = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m201327e(View view) {
        act().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public /* synthetic */ void m201328f() {
        this.f184218b.requestFocus();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f184221e;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f184221e;
    }

    /* JADX INFO: renamed from: c */
    public View m201329c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wi60.m206555b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(si60 si60Var) {
        this.f184220d = si60Var;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m201329c(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m201331r() {
        this.f184217a.setTitle(act().getString(R$string.f28748o0));
        this.f184217a.setLeftIconOnClick(new View.OnClickListener() { // from class: l.ti60
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174447a.m201327e(view);
            }
        });
        l51.m152887G(new Runnable() { // from class: l.ui60
            @Override // java.lang.Runnable
            public final void run() {
                this.f179080a.m201328f();
            }
        });
        this.f184220d.m186013o0(this.f184218b);
        bnl0.m105509E0(this.f184219c, this.f184220d.m186009j0(this.f184218b));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
