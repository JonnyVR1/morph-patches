package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.external.internal.live.square.home.submodule.teenmode.LiveTeenModeViewModel;
import com.p051p1.mobile.putong.live.external.view.widgets.NoSaveStateViewPager;
import p151v.VFrame;
import p151v.VLinear;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes9.dex */
public class z6u implements iam<q4u> {

    /* JADX INFO: renamed from: a */
    public VFrame f203185a;

    /* JADX INFO: renamed from: b */
    public NoSaveStateViewPager f203186b;

    /* JADX INFO: renamed from: c */
    public View f203187c;

    /* JADX INFO: renamed from: d */
    public VLinear f203188d;

    /* JADX INFO: renamed from: e */
    public View f203189e;

    /* JADX INFO: renamed from: f */
    public VNavigationBar f203190f;

    /* JADX INFO: renamed from: g */
    public TabLayout f203191g;

    /* JADX INFO: renamed from: h */
    public LiveTeenModeViewModel f203192h;

    /* JADX INFO: renamed from: i */
    public q4u f203193i;

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return bnl0.m105508E(this.f203185a);
    }

    /* JADX INFO: renamed from: a */
    public View m218811a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a7u.m96384b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(q4u q4uVar) {
        this.f203193i = q4uVar;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m218811a(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: r */
    public void m218813r() {
        ((PutongAct) this.f203193i.act()).setTransparentStatusBar();
        PutongAct.setLightStatusBar(this.f203193i.act().getWindow(), 0);
        bnl0.m105542Z(this.f203188d);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
