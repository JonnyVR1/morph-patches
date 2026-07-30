package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;

/* JADX INFO: loaded from: classes4.dex */
public class vha0 implements s7m<tha0> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f181478a;

    /* JADX INFO: renamed from: b */
    public VImage f181479b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f181480c;

    /* JADX INFO: renamed from: d */
    public Act f181481d;

    /* JADX INFO: renamed from: e */
    public Fragment f181482e;

    public vha0(Act act) {
        this.f181481d = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m198422e(View view) {
        if (NullChecker.m81303a(this.f181482e)) {
            Fragment fragment = this.f181482e;
            if (fragment instanceof ProfileEditLoopBaseFrag) {
                ((ProfileEditLoopBaseFrag) fragment).mo51587M4();
                return;
            }
        }
        this.f181481d.lambda$debugItems$19();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f181481d;
    }

    /* JADX INFO: renamed from: b */
    public View m198423b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wha0.m203118b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m198425d(LoopInputType loopInputType) {
        xdl0.m208329E0(this.f181479b, new View.OnClickListener() { // from class: l.uha0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176544a.m198422e(view);
            }
        });
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        AbstractC0427k abstractC0427kM2567m = supportFragmentManager.m2567m();
        Fragment fragmentInstantiate = supportFragmentManager.m2583r0().instantiate(loopInputType.fragmentClass.getClassLoader(), loopInputType.fragmentClass.getName());
        this.f181482e = fragmentInstantiate;
        if (fragmentInstantiate instanceof ProfileEditLoopBaseFrag) {
            String stringExtra = "";
            String stringExtra2 = (NullChecker.m81303a(this.f181481d.getIntent()) && this.f181481d.getIntent().hasExtra("ext_from_page")) ? this.f181481d.getIntent().getStringExtra("ext_from_page") : "";
            if (NullChecker.m81303a(this.f181481d.getIntent()) && this.f181481d.getIntent().hasExtra("ext_value")) {
                stringExtra = this.f181481d.getIntent().getStringExtra("ext_value");
            }
            ((ProfileEditLoopBaseFrag) this.f181482e).m51603b5(loopInputType, stringExtra2, stringExtra);
        }
        abstractC0427kM2567m.m2804c(a5c0.f67701x, this.f181482e, loopInputType.tagKey);
        try {
            abstractC0427kM2567m.mo2708j();
        } catch (Exception unused) {
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m198423b(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(tha0 tha0Var) {
    }
}
