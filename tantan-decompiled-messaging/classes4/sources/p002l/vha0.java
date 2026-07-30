package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import l.a5c0;
import l.s7m;
import l.wha0;
import l.xdl0;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vha0 implements s7m<tha0> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f21126a;

    /* JADX INFO: renamed from: b */
    public VImage f21127b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f21128c;

    /* JADX INFO: renamed from: d */
    public Act f21129d;

    /* JADX INFO: renamed from: e */
    public Fragment f21130e;

    public vha0(Act act) {
        this.f21129d = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ void m23945e(View view) {
        if (NullChecker.a(this.f21130e)) {
            ProfileEditLoopBaseFrag profileEditLoopBaseFrag = this.f21130e;
            if (profileEditLoopBaseFrag instanceof ProfileEditLoopBaseFrag) {
                profileEditLoopBaseFrag.mo2073M4();
                return;
            }
        }
        this.f21129d.finish();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m23946C0() {
        return this.f21129d;
    }

    /* JADX INFO: renamed from: b */
    public View m23947b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return wha0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d */
    public void m23949d(LoopInputType loopInputType) {
        xdl0.E0(this.f21127b, new View.OnClickListener() { // from class: l.uha0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20654a.m23945e(view);
            }
        });
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        k kVarM = supportFragmentManager.m();
        Fragment fragmentInstantiate = supportFragmentManager.r0().instantiate(loopInputType.fragmentClass.getClassLoader(), loopInputType.fragmentClass.getName());
        this.f21130e = fragmentInstantiate;
        if (fragmentInstantiate instanceof ProfileEditLoopBaseFrag) {
            String stringExtra = "";
            String stringExtra2 = (NullChecker.a(this.f21129d.getIntent()) && this.f21129d.getIntent().hasExtra("ext_from_page")) ? this.f21129d.getIntent().getStringExtra("ext_from_page") : "";
            if (NullChecker.a(this.f21129d.getIntent()) && this.f21129d.getIntent().hasExtra("ext_value")) {
                stringExtra = this.f21129d.getIntent().getStringExtra("ext_value");
            }
            this.f21130e.m2089b5(loopInputType, stringExtra2, stringExtra);
        }
        kVarM.c(a5c0.x, this.f21130e, loopInputType.tagKey);
        try {
            kVarM.j();
        } catch (Exception unused) {
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m23947b(layoutInflater, viewGroup);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void m23950i1(tha0 tha0Var) {
    }
}
