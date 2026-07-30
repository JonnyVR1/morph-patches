package com.p046p1.mobile.putong.core.newui.home.frag.base;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0427k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p149l.bm2;
import p149l.e30;
import p149l.e51;
import p149l.pc8;
import p149l.u4c0;
import p149l.upa;
import p149l.va40;
import p149l.vwb;
import p149l.w9j;

/* JADX INFO: loaded from: classes11.dex */
public class BaseHomeLayoutFrag extends PutongFrag {

    /* JADX INFO: renamed from: z */
    public NewTanFragTag f22999z = NewTanFragTag.HOME;

    /* JADX INFO: renamed from: A */
    public NewTanFragTag f22997A = NewTanFragTag.UNKNOWN;

    /* JADX INFO: renamed from: B */
    public final Map<NewTanFragTag, Fragment> f22998B = new HashMap();

    public BaseHomeLayoutFrag() {
        creates(new e30() { // from class: l.xl2
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193381a.m38499T4((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return (NewMainAct) super.act();
    }

    /* JADX INFO: renamed from: R4 */
    public void m38497R4(NewTanFragTag newTanFragTag) {
        FragmentManager fragmentManagerM38500U4 = m38500U4();
        AbstractC0427k abstractC0427kM2567m = fragmentManagerM38500U4.m2567m();
        NewTanFragTag newTanFragTag2 = TextUtils.equals(newTanFragTag.getTag(), NewTanFragTag.ALREADY_AUTH.getTag()) ? NewTanFragTag.HOME : newTanFragTag;
        Fragment fragmentM2557i0 = fragmentManagerM38500U4.m2557i0(newTanFragTag2.getTag());
        if (fragmentM2557i0 == null) {
            fragmentM2557i0 = m38502W4(newTanFragTag, getArguments());
            abstractC0427kM2567m.m2804c(u4c0.f173990Q1, fragmentM2557i0, newTanFragTag2.getTag());
        } else {
            fragmentM2557i0.setArguments(getArguments());
            abstractC0427kM2567m.mo2717y(fragmentM2557i0);
        }
        this.f22998B.put(newTanFragTag, fragmentM2557i0);
        m38503X4(newTanFragTag2, abstractC0427kM2567m);
        abstractC0427kM2567m.mo2708j();
        fragmentManagerM38500U4.m2545e0();
        this.f22997A = newTanFragTag;
        mo38511f5();
    }

    /* JADX INFO: renamed from: S4 */
    public final boolean m38498S4(NewTanFragTag newTanFragTag) {
        if (getFragmentManager() == null || !isStateSaved()) {
            return false;
        }
        Fragment fragmentM2557i0 = m38500U4().m2557i0(newTanFragTag.getTag());
        if (fragmentM2557i0 == null) {
            return true;
        }
        m38500U4().m2567m().mo2715r(fragmentM2557i0).mo2710l();
        return true;
    }

    /* JADX INFO: renamed from: T4 */
    public void m38499T4(Bundle bundle) {
        if (upa.m194789n1() || NullChecker.m81303a(m38501V4())) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            m38507b5(this.f22999z);
            return;
        }
        String string = arguments.getString("frag_tag");
        if (TextUtils.equals(getTag(), string)) {
            return;
        }
        m38507b5(NewTanFragTag.find(string));
    }

    /* JADX INFO: renamed from: U4 */
    public FragmentManager m38500U4() {
        return getChildFragmentManager();
    }

    /* JADX INFO: renamed from: V4 */
    public PutongFrag m38501V4() {
        FragmentManager fragmentManagerM38500U4 = m38500U4();
        NewTanFragTag newTanFragTag = this.f22997A;
        if (TextUtils.equals(newTanFragTag.getTag(), NewTanFragTag.ALREADY_AUTH.getTag())) {
            newTanFragTag = NewTanFragTag.HOME;
        }
        return this.f22998B.containsKey(newTanFragTag) ? (PutongFrag) fragmentManagerM38500U4.m2557i0(newTanFragTag.getTag()) : (PutongFrag) m38500U4().m2554h0(u4c0.f173990Q1);
    }

    /* JADX INFO: renamed from: W4 */
    public Frag m38502W4(NewTanFragTag newTanFragTag, Bundle bundle) {
        return va40.m197625g(newTanFragTag, bundle);
    }

    /* JADX INFO: renamed from: X4 */
    public final void m38503X4(@NonNull NewTanFragTag newTanFragTag, AbstractC0427k abstractC0427k) {
        for (Fragment fragment : m38500U4().m2589t0()) {
            if (NewTanFragTag.find(fragment.getTag()) != newTanFragTag) {
                abstractC0427k.mo2713p(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public boolean m38504Y4(Frag frag) {
        if (frag == null) {
            return false;
        }
        C4319c c4319cLifecycle_ = frag.lifecycle_();
        return c4319cLifecycle_ == C4319c.f15546g || c4319cLifecycle_ == C4319c.f15547h || c4319cLifecycle_ == C4319c.f15548i || c4319cLifecycle_ == C4319c.f15549j || c4319cLifecycle_ == C4319c.f15550k || c4319cLifecycle_ == C4319c.f15551l;
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m38505Z4(final PutongFrag putongFrag, final boolean z, Bundle bundle) {
        if (m38504Y4(putongFrag)) {
            putongFrag.onHiddenChanged(z);
        } else {
            putongFrag.creates(new e30() { // from class: l.cm2
                @Override // p149l.e30
                public final void call(Object obj) {
                    putongFrag.onHiddenChanged(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m38506a5(NewTanFragTag newTanFragTag) {
        m38508c5(newTanFragTag, "homepage");
    }

    /* JADX INFO: renamed from: b5 */
    public boolean m38507b5(final NewTanFragTag newTanFragTag) {
        Object objM168315s0 = pc8.m168315s0(m38500U4(), "mExecutingActions");
        if (objM168315s0 == null || !(objM168315s0 instanceof Boolean) || !((Boolean) objM168315s0).booleanValue()) {
            return m38508c5(newTanFragTag, "homepage");
        }
        e51.m114741F(act(), new Runnable() { // from class: l.yl2
            @Override // java.lang.Runnable
            public final void run() {
                this.f198855a.m38506a5(newTanFragTag);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: c5 */
    public boolean m38508c5(NewTanFragTag newTanFragTag, String str) {
        if (upa.m194745e2() && CoreModule.f17545c.f19639e0.m169468a8()) {
            newTanFragTag = NewTanFragTag.MARRY_MODE;
        }
        PutongFrag putongFragM38501V4 = m38501V4();
        String tag = putongFragM38501V4 == null ? null : putongFragM38501V4.getTag();
        if (!(upa.m194655J3() && TextUtils.equals(NewTanFragTag.HOME.getTag(), newTanFragTag.getTag())) && TextUtils.equals(tag, newTanFragTag.getTag())) {
            this.f22997A = newTanFragTag;
            return false;
        }
        m38510e5(newTanFragTag, str);
        m38497R4(newTanFragTag);
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        Bundle arguments = getArguments();
        if (NullChecker.m81303a(arguments)) {
            ArrayList<String> stringArrayList = arguments.getStringArrayList("temp_tag_show_list");
            if (vwb.m200296J(stringArrayList)) {
                return;
            }
            va40.f180706f.clear();
            va40.f180706f.addAll(vwb.m200303Q(stringArrayList, new bm2()));
        }
    }

    /* JADX INFO: renamed from: d5 */
    public void m38509d5(NewTanFragTag newTanFragTag, String str, NewTanFragTag newTanFragTag2) {
        if (newTanFragTag == null && NullChecker.m81303a(newTanFragTag2)) {
            newTanFragTag = (!NullChecker.m81303a(getArguments()) || TextUtils.isEmpty(getArguments().getString("frag_tag")) || NewTanFragTag.find(getArguments().getString("frag_tag")) == NewTanFragTag.UNKNOWN) ? newTanFragTag2 : NewTanFragTag.find(getArguments().getString("frag_tag"));
        }
        if (newTanFragTag == null || NewTanFragTag.find(newTanFragTag.getTag()) == NewTanFragTag.UNKNOWN) {
            newTanFragTag = this.f22999z;
        }
        m38508c5(newTanFragTag, str);
    }

    /* JADX INFO: renamed from: e5 */
    public void m38510e5(NewTanFragTag newTanFragTag, String str) {
        if (NullChecker.m81303a(getArguments())) {
            getArguments().putString("frag_tag", newTanFragTag.getTag());
            getArguments().putString("from", str);
            if (vwb.m200296J(va40.f180706f)) {
                return;
            }
            getArguments().putStringArrayList("temp_tag_show_list", vwb.m200303Q(va40.f180706f, new w9j() { // from class: l.dm2
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((NewTanFragTag) obj).getTag();
                }
            }));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("frag_tag", newTanFragTag.getTag());
        if (m38498S4(newTanFragTag)) {
            return;
        }
        setArguments(bundle);
    }

    /* JADX INFO: renamed from: f5 */
    public void mo38511f5() {
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(act());
        frameLayout.setId(u4c0.f173990Q1);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        if (NullChecker.m81303a(bundle)) {
            this.f22997A = NewTanFragTag.find(bundle.getString("tantanFrag_saved_tag"));
            mo38511f5();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(final boolean z) {
        super.onHiddenChanged(z);
        final PutongFrag putongFragM38501V4 = m38501V4();
        if (NullChecker.m81303a(putongFragM38501V4)) {
            if (!m38504Y4(this)) {
                creates(new e30() { // from class: l.am2
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f70541a.m38505Z4(putongFragM38501V4, z, (Bundle) obj);
                    }
                });
            } else if (m38504Y4(putongFragM38501V4)) {
                putongFragM38501V4.onHiddenChanged(z);
            } else {
                putongFragM38501V4.creates(new e30() { // from class: l.zl2
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        putongFragM38501V4.onHiddenChanged(z);
                    }
                });
            }
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        Bundle arguments = getArguments();
        if (NullChecker.m81303a(arguments)) {
            ArrayList<String> stringArrayList = arguments.getStringArrayList("temp_tag_show_list");
            if (!vwb.m200296J(stringArrayList)) {
                va40.f180706f.clear();
                va40.f180706f.addAll(vwb.m200303Q(stringArrayList, new bm2()));
            }
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putString("tantanFrag_saved_tag", this.f22997A.getTag());
        super.onSaveInstanceState(bundle);
    }
}
