package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class zpa0 implements iam<xpa0> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f205440a;

    /* JADX INFO: renamed from: b */
    public VImage f205441b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f205442c;

    /* JADX INFO: renamed from: d */
    public Act f205443d;

    /* JADX INFO: renamed from: e */
    public Fragment f205444e;

    public zpa0(Act act) {
        this.f205443d = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m220826e(View view) {
        if (NullChecker.m82486a(this.f205444e)) {
            Fragment fragment = this.f205444e;
            if (fragment instanceof ProfileEditLoopBaseFrag) {
                ((ProfileEditLoopBaseFrag) fragment).mo52770M4();
                return;
            }
        }
        this.f205443d.lambda$debugItems$19();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f205443d;
    }

    /* JADX INFO: renamed from: b */
    public View m220827b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aqa0.m99442b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m220829d(LoopInputType loopInputType) {
        bnl0.m105509E0(this.f205441b, new View.OnClickListener() { // from class: l.ypa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201052a.m220826e(view);
            }
        });
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        AbstractC0428k abstractC0428kM2568m = supportFragmentManager.m2568m();
        Fragment fragmentInstantiate = supportFragmentManager.m2584r0().instantiate(loopInputType.fragmentClass.getClassLoader(), loopInputType.fragmentClass.getName());
        this.f205444e = fragmentInstantiate;
        if (fragmentInstantiate instanceof ProfileEditLoopBaseFrag) {
            String stringExtra = "";
            String stringExtra2 = (NullChecker.m82486a(this.f205443d.getIntent()) && this.f205443d.getIntent().hasExtra("ext_from_page")) ? this.f205443d.getIntent().getStringExtra("ext_from_page") : "";
            if (NullChecker.m82486a(this.f205443d.getIntent()) && this.f205443d.getIntent().hasExtra("ext_value")) {
                stringExtra = this.f205443d.getIntent().getStringExtra("ext_value");
            }
            ((ProfileEditLoopBaseFrag) this.f205444e).m52786b5(loopInputType, stringExtra2, stringExtra);
        }
        abstractC0428kM2568m.m2805c(gdc0.f103696x, this.f205444e, loopInputType.tagKey);
        try {
            abstractC0428kM2568m.mo2709j();
        } catch (Exception unused) {
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m220827b(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(xpa0 xpa0Var) {
    }
}
