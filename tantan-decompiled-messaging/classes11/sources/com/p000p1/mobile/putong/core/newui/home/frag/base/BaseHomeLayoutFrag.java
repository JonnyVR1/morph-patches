package com.p000p1.mobile.putong.core.newui.home.frag.base;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import l.e30;
import l.e51;
import l.pc8;
import l.u4c0;
import l.upa;
import l.vwb;
import l.w9j;
import p009l.bm2;
import p009l.va40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class BaseHomeLayoutFrag extends PutongFrag {

    /* JADX INFO: renamed from: z */
    public NewTanFragTag f1777z = NewTanFragTag.HOME;

    /* JADX INFO: renamed from: A */
    public NewTanFragTag f1775A = NewTanFragTag.UNKNOWN;

    /* JADX INFO: renamed from: B */
    public final Map<NewTanFragTag, Fragment> f1776B = new HashMap();

    public BaseHomeLayoutFrag() {
        creates(new e30() { // from class: l.xl2
            public final void call(Object obj) {
                this.f22642a.m2477T4((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return super/*com.p1.mobile.android.app.Frag*/.act();
    }

    /* JADX INFO: renamed from: R4 */
    public void m2475R4(NewTanFragTag newTanFragTag) {
        FragmentManager fragmentManagerM2478U4 = m2478U4();
        k kVarM = fragmentManagerM2478U4.m();
        NewTanFragTag newTanFragTag2 = TextUtils.equals(newTanFragTag.getTag(), NewTanFragTag.ALREADY_AUTH.getTag()) ? NewTanFragTag.HOME : newTanFragTag;
        Frag fragI0 = fragmentManagerM2478U4.i0(newTanFragTag2.getTag());
        if (fragI0 == null) {
            fragI0 = m2480W4(newTanFragTag, getArguments());
            kVarM.c(u4c0.Q1, fragI0, newTanFragTag2.getTag());
        } else {
            fragI0.setArguments(getArguments());
            kVarM.y(fragI0);
        }
        this.f1776B.put(newTanFragTag, fragI0);
        m2481X4(newTanFragTag2, kVarM);
        kVarM.j();
        fragmentManagerM2478U4.e0();
        this.f1775A = newTanFragTag;
        mo2490f5();
    }

    /* JADX INFO: renamed from: S4 */
    public final boolean m2476S4(NewTanFragTag newTanFragTag) {
        if (getFragmentManager() == null || !isStateSaved()) {
            return false;
        }
        Fragment fragmentI0 = m2478U4().i0(newTanFragTag.getTag());
        if (fragmentI0 == null) {
            return true;
        }
        m2478U4().m().r(fragmentI0).l();
        return true;
    }

    /* JADX INFO: renamed from: T4 */
    public void m2477T4(Bundle bundle) {
        if (upa.n1() || NullChecker.a(m2479V4())) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            m2485b5(this.f1777z);
            return;
        }
        String string = arguments.getString("frag_tag");
        if (TextUtils.equals(getTag(), string)) {
            return;
        }
        m2485b5(NewTanFragTag.find(string));
    }

    /* JADX INFO: renamed from: U4 */
    public FragmentManager m2478U4() {
        return getChildFragmentManager();
    }

    /* JADX INFO: renamed from: V4 */
    public PutongFrag m2479V4() {
        FragmentManager fragmentManagerM2478U4 = m2478U4();
        NewTanFragTag newTanFragTag = this.f1775A;
        if (TextUtils.equals(newTanFragTag.getTag(), NewTanFragTag.ALREADY_AUTH.getTag())) {
            newTanFragTag = NewTanFragTag.HOME;
        }
        return this.f1776B.containsKey(newTanFragTag) ? fragmentManagerM2478U4.i0(newTanFragTag.getTag()) : m2478U4().h0(u4c0.Q1);
    }

    /* JADX INFO: renamed from: W4 */
    public Frag m2480W4(NewTanFragTag newTanFragTag, Bundle bundle) {
        return va40.m23336g(newTanFragTag, bundle);
    }

    /* JADX INFO: renamed from: X4 */
    public final void m2481X4(@NonNull NewTanFragTag newTanFragTag, k kVar) {
        for (Fragment fragment : m2478U4().t0()) {
            if (NewTanFragTag.find(fragment.getTag()) != newTanFragTag) {
                kVar.p(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public boolean m2482Y4(Frag frag) {
        if (frag == null) {
            return false;
        }
        c cVarLifecycle_ = frag.lifecycle_();
        return cVarLifecycle_ == c.g || cVarLifecycle_ == c.h || cVarLifecycle_ == c.i || cVarLifecycle_ == c.j || cVarLifecycle_ == c.k || cVarLifecycle_ == c.l;
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m2483Z4(final PutongFrag putongFrag, final boolean z, Bundle bundle) {
        if (m2482Y4(putongFrag)) {
            putongFrag.onHiddenChanged(z);
        } else {
            putongFrag.creates(new e30() { // from class: l.cm2
                public final void call(Object obj) {
                    putongFrag.onHiddenChanged(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m2484a5(NewTanFragTag newTanFragTag) {
        m2486c5(newTanFragTag, "homepage");
    }

    /* JADX INFO: renamed from: b5 */
    public boolean m2485b5(final NewTanFragTag newTanFragTag) {
        Object objS0 = pc8.s0(m2478U4(), "mExecutingActions");
        if (objS0 == null || !(objS0 instanceof Boolean) || !((Boolean) objS0).booleanValue()) {
            return m2486c5(newTanFragTag, "homepage");
        }
        e51.F(act(), new Runnable() { // from class: l.yl2
            @Override // java.lang.Runnable
            public final void run() {
                this.f23130a.m2484a5(newTanFragTag);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: c5 */
    public boolean m2486c5(NewTanFragTag newTanFragTag, String str) {
        if (upa.e2() && CoreModule.c.e0.a8()) {
            newTanFragTag = NewTanFragTag.MARRY_MODE;
        }
        PutongFrag putongFragM2479V4 = m2479V4();
        String tag = putongFragM2479V4 == null ? null : putongFragM2479V4.getTag();
        if (!(upa.J3() && TextUtils.equals(NewTanFragTag.HOME.getTag(), newTanFragTag.getTag())) && TextUtils.equals(tag, newTanFragTag.getTag())) {
            this.f1775A = newTanFragTag;
            return false;
        }
        m2489e5(newTanFragTag, str);
        m2475R4(newTanFragTag);
        return true;
    }

    /* JADX INFO: renamed from: d4 */
    public void m2487d4() {
        super.d4();
        Bundle arguments = getArguments();
        if (NullChecker.a(arguments)) {
            ArrayList<String> stringArrayList = arguments.getStringArrayList("temp_tag_show_list");
            if (vwb.J(stringArrayList)) {
                return;
            }
            va40.f21505f.clear();
            va40.f21505f.addAll(vwb.Q(stringArrayList, new bm2()));
        }
    }

    /* JADX INFO: renamed from: d5 */
    public void m2488d5(NewTanFragTag newTanFragTag, String str, NewTanFragTag newTanFragTag2) {
        if (newTanFragTag == null && NullChecker.a(newTanFragTag2)) {
            newTanFragTag = (!NullChecker.a(getArguments()) || TextUtils.isEmpty(getArguments().getString("frag_tag")) || NewTanFragTag.find(getArguments().getString("frag_tag")) == NewTanFragTag.UNKNOWN) ? newTanFragTag2 : NewTanFragTag.find(getArguments().getString("frag_tag"));
        }
        if (newTanFragTag == null || NewTanFragTag.find(newTanFragTag.getTag()) == NewTanFragTag.UNKNOWN) {
            newTanFragTag = this.f1777z;
        }
        m2486c5(newTanFragTag, str);
    }

    /* JADX INFO: renamed from: e5 */
    public void m2489e5(NewTanFragTag newTanFragTag, String str) {
        if (NullChecker.a(getArguments())) {
            getArguments().putString("frag_tag", newTanFragTag.getTag());
            getArguments().putString("from", str);
            if (vwb.J(va40.f21505f)) {
                return;
            }
            getArguments().putStringArrayList("temp_tag_show_list", vwb.Q(va40.f21505f, new w9j() { // from class: l.dm2
                public final Object call(Object obj) {
                    return ((NewTanFragTag) obj).getTag();
                }
            }));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("frag_tag", newTanFragTag.getTag());
        if (m2476S4(newTanFragTag)) {
            return;
        }
        setArguments(bundle);
    }

    /* JADX INFO: renamed from: f5 */
    public void mo2490f5() {
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(act());
        frameLayout.setId(u4c0.Q1);
        return frameLayout;
    }

    public void onActivityCreated(@Nullable Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onActivityCreated(bundle);
        if (NullChecker.a(bundle)) {
            this.f1775A = NewTanFragTag.find(bundle.getString("tantanFrag_saved_tag"));
            mo2490f5();
        }
    }

    public void onHiddenChanged(final boolean z) {
        super.onHiddenChanged(z);
        final PutongFrag putongFragM2479V4 = m2479V4();
        if (NullChecker.a(putongFragM2479V4)) {
            if (!m2482Y4(this)) {
                creates(new e30() { // from class: l.am2
                    public final void call(Object obj) {
                        this.f9569a.m2483Z4(putongFragM2479V4, z, (Bundle) obj);
                    }
                });
            } else if (m2482Y4(putongFragM2479V4)) {
                putongFragM2479V4.onHiddenChanged(z);
            } else {
                putongFragM2479V4.creates(new e30() { // from class: l.zl2
                    public final void call(Object obj) {
                        putongFragM2479V4.onHiddenChanged(z);
                    }
                });
            }
        }
    }

    public void onResume() {
        Bundle arguments = getArguments();
        if (NullChecker.a(arguments)) {
            ArrayList<String> stringArrayList = arguments.getStringArrayList("temp_tag_show_list");
            if (!vwb.J(stringArrayList)) {
                va40.f21505f.clear();
                va40.f21505f.addAll(vwb.Q(stringArrayList, new bm2()));
            }
        }
        super/*com.p1.mobile.android.app.Frag*/.onResume();
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putString("tantanFrag_saved_tag", this.f1775A.getTag());
        super/*androidx.fragment.app.Fragment*/.onSaveInstanceState(bundle);
    }
}
