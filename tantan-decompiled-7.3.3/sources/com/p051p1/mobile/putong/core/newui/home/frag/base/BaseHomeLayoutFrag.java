package com.p051p1.mobile.putong.core.newui.home.frag.base;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.AbstractC0428k;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.home.frag.base.NewTanFragTag;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import p153l.adc0;
import p153l.gra;
import p153l.jj40;
import p153l.jm2;
import p153l.jyb;
import p153l.l51;
import p153l.qcj;
import p153l.td8;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class BaseHomeLayoutFrag extends PutongFrag {

    /* JADX INFO: renamed from: z */
    public NewTanFragTag f23741z = NewTanFragTag.HOME;

    /* JADX INFO: renamed from: A */
    public NewTanFragTag f23739A = NewTanFragTag.UNKNOWN;

    /* JADX INFO: renamed from: B */
    public final Map<NewTanFragTag, Fragment> f23740B = new HashMap();

    public BaseHomeLayoutFrag() {
        creates(new y20() { // from class: l.fm2
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f99710a.m39502T4((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: Q4, reason: merged with bridge method [inline-methods] */
    public NewMainAct act() {
        return (NewMainAct) super.act();
    }

    /* JADX INFO: renamed from: R4 */
    public void m39500R4(NewTanFragTag newTanFragTag) {
        FragmentManager fragmentManagerM39503U4 = m39503U4();
        AbstractC0428k abstractC0428kM2568m = fragmentManagerM39503U4.m2568m();
        NewTanFragTag newTanFragTag2 = TextUtils.equals(newTanFragTag.getTag(), NewTanFragTag.ALREADY_AUTH.getTag()) ? NewTanFragTag.HOME : newTanFragTag;
        Fragment fragmentM2558i0 = fragmentManagerM39503U4.m2558i0(newTanFragTag2.getTag());
        if (fragmentM2558i0 == null) {
            fragmentM2558i0 = m39505W4(newTanFragTag, getArguments());
            abstractC0428kM2568m.m2805c(adc0.f70078Q1, fragmentM2558i0, newTanFragTag2.getTag());
        } else {
            fragmentM2558i0.setArguments(getArguments());
            abstractC0428kM2568m.mo2718y(fragmentM2558i0);
        }
        this.f23740B.put(newTanFragTag, fragmentM2558i0);
        m39506X4(newTanFragTag2, abstractC0428kM2568m);
        abstractC0428kM2568m.mo2709j();
        fragmentManagerM39503U4.m2546e0();
        this.f23739A = newTanFragTag;
        mo39514f5();
    }

    /* JADX INFO: renamed from: S4 */
    public final boolean m39501S4(NewTanFragTag newTanFragTag) {
        if (getFragmentManager() == null || !isStateSaved()) {
            return false;
        }
        Fragment fragmentM2558i0 = m39503U4().m2558i0(newTanFragTag.getTag());
        if (fragmentM2558i0 == null) {
            return true;
        }
        m39503U4().m2568m().mo2716r(fragmentM2558i0).mo2711l();
        return true;
    }

    /* JADX INFO: renamed from: T4 */
    public void m39502T4(Bundle bundle) {
        if (gra.m131720n1() || NullChecker.m82486a(m39504V4())) {
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null) {
            m39510b5(this.f23741z);
            return;
        }
        String string = arguments.getString("frag_tag");
        if (TextUtils.equals(getTag(), string)) {
            return;
        }
        m39510b5(NewTanFragTag.find(string));
    }

    /* JADX INFO: renamed from: U4 */
    public FragmentManager m39503U4() {
        return getChildFragmentManager();
    }

    /* JADX INFO: renamed from: V4 */
    public PutongFrag m39504V4() {
        FragmentManager fragmentManagerM39503U4 = m39503U4();
        NewTanFragTag newTanFragTag = this.f23739A;
        if (TextUtils.equals(newTanFragTag.getTag(), NewTanFragTag.ALREADY_AUTH.getTag())) {
            newTanFragTag = NewTanFragTag.HOME;
        }
        return this.f23740B.containsKey(newTanFragTag) ? (PutongFrag) fragmentManagerM39503U4.m2558i0(newTanFragTag.getTag()) : (PutongFrag) m39503U4().m2555h0(adc0.f70078Q1);
    }

    /* JADX INFO: renamed from: W4 */
    public Frag m39505W4(NewTanFragTag newTanFragTag, Bundle bundle) {
        return jj40.m145004g(newTanFragTag, bundle);
    }

    /* JADX INFO: renamed from: X4 */
    public final void m39506X4(@NonNull NewTanFragTag newTanFragTag, AbstractC0428k abstractC0428k) {
        for (Fragment fragment : m39503U4().m2590t0()) {
            if (NewTanFragTag.find(fragment.getTag()) != newTanFragTag) {
                abstractC0428k.mo2714p(fragment);
            }
        }
    }

    /* JADX INFO: renamed from: Y4 */
    public boolean m39507Y4(Frag frag) {
        if (frag == null) {
            return false;
        }
        C4470c c4470cLifecycle_ = frag.lifecycle_();
        return c4470cLifecycle_ == C4470c.f16265g || c4470cLifecycle_ == C4470c.f16266h || c4470cLifecycle_ == C4470c.f16267i || c4470cLifecycle_ == C4470c.f16268j || c4470cLifecycle_ == C4470c.f16269k || c4470cLifecycle_ == C4470c.f16270l;
    }

    /* JADX INFO: renamed from: Z4 */
    public final /* synthetic */ void m39508Z4(final PutongFrag putongFrag, final boolean z, Bundle bundle) {
        if (m39507Y4(putongFrag)) {
            putongFrag.onHiddenChanged(z);
        } else {
            putongFrag.creates(new y20() { // from class: l.km2
                @Override // p153l.y20
                public final void call(Object obj) {
                    putongFrag.onHiddenChanged(z);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a5 */
    public final /* synthetic */ void m39509a5(NewTanFragTag newTanFragTag) {
        m39511c5(newTanFragTag, "homepage");
    }

    /* JADX INFO: renamed from: b5 */
    public boolean m39510b5(final NewTanFragTag newTanFragTag) {
        Object objM190609s0 = td8.m190609s0(m39503U4(), "mExecutingActions");
        if (objM190609s0 == null || !(objM190609s0 instanceof Boolean) || !((Boolean) objM190609s0).booleanValue()) {
            return m39511c5(newTanFragTag, "homepage");
        }
        l51.m152886F(act(), new Runnable() { // from class: l.gm2
            @Override // java.lang.Runnable
            public final void run() {
                this.f104909a.m39509a5(newTanFragTag);
            }
        });
        return true;
    }

    /* JADX INFO: renamed from: c5 */
    public boolean m39511c5(NewTanFragTag newTanFragTag, String str) {
        if (gra.m131676e2() && CoreModule.f18264c.f20381e0.m116541a8()) {
            newTanFragTag = NewTanFragTag.MARRY_MODE;
        }
        PutongFrag putongFragM39504V4 = m39504V4();
        String tag = putongFragM39504V4 == null ? null : putongFragM39504V4.getTag();
        if (!(gra.m131586J3() && TextUtils.equals(NewTanFragTag.HOME.getTag(), newTanFragTag.getTag())) && TextUtils.equals(tag, newTanFragTag.getTag())) {
            this.f23739A = newTanFragTag;
            return false;
        }
        m39513e5(newTanFragTag, str);
        m39500R4(newTanFragTag);
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        Bundle arguments = getArguments();
        if (NullChecker.m82486a(arguments)) {
            ArrayList<String> stringArrayList = arguments.getStringArrayList("temp_tag_show_list");
            if (jyb.m147479J(stringArrayList)) {
                return;
            }
            jj40.f121143f.clear();
            jj40.f121143f.addAll(jyb.m147486Q(stringArrayList, new jm2()));
        }
    }

    /* JADX INFO: renamed from: d5 */
    public void m39512d5(NewTanFragTag newTanFragTag, String str, NewTanFragTag newTanFragTag2) {
        if (newTanFragTag == null && NullChecker.m82486a(newTanFragTag2)) {
            newTanFragTag = (!NullChecker.m82486a(getArguments()) || TextUtils.isEmpty(getArguments().getString("frag_tag")) || NewTanFragTag.find(getArguments().getString("frag_tag")) == NewTanFragTag.UNKNOWN) ? newTanFragTag2 : NewTanFragTag.find(getArguments().getString("frag_tag"));
        }
        if (newTanFragTag == null || NewTanFragTag.find(newTanFragTag.getTag()) == NewTanFragTag.UNKNOWN) {
            newTanFragTag = this.f23741z;
        }
        m39511c5(newTanFragTag, str);
    }

    /* JADX INFO: renamed from: e5 */
    public void m39513e5(NewTanFragTag newTanFragTag, String str) {
        if (NullChecker.m82486a(getArguments())) {
            getArguments().putString("frag_tag", newTanFragTag.getTag());
            getArguments().putString("from", str);
            if (jyb.m147479J(jj40.f121143f)) {
                return;
            }
            getArguments().putStringArrayList("temp_tag_show_list", jyb.m147486Q(jj40.f121143f, new qcj() { // from class: l.lm2
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((NewTanFragTag) obj).getTag();
                }
            }));
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putString("frag_tag", newTanFragTag.getTag());
        if (m39501S4(newTanFragTag)) {
            return;
        }
        setArguments(bundle);
    }

    /* JADX INFO: renamed from: f5 */
    public void mo39514f5() {
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        FrameLayout frameLayout = new FrameLayout(act());
        frameLayout.setId(adc0.f70078Q1);
        return frameLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        if (NullChecker.m82486a(bundle)) {
            this.f23739A = NewTanFragTag.find(bundle.getString("tantanFrag_saved_tag"));
            mo39514f5();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(final boolean z) {
        super.onHiddenChanged(z);
        final PutongFrag putongFragM39504V4 = m39504V4();
        if (NullChecker.m82486a(putongFragM39504V4)) {
            if (!m39507Y4(this)) {
                creates(new y20() { // from class: l.im2
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f115644a.m39508Z4(putongFragM39504V4, z, (Bundle) obj);
                    }
                });
            } else if (m39507Y4(putongFragM39504V4)) {
                putongFragM39504V4.onHiddenChanged(z);
            } else {
                putongFragM39504V4.creates(new y20() { // from class: l.hm2
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        putongFragM39504V4.onHiddenChanged(z);
                    }
                });
            }
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        Bundle arguments = getArguments();
        if (NullChecker.m82486a(arguments)) {
            ArrayList<String> stringArrayList = arguments.getStringArrayList("temp_tag_show_list");
            if (!jyb.m147479J(stringArrayList)) {
                jj40.f121143f.clear();
                jj40.f121143f.addAll(jyb.m147486Q(stringArrayList, new jm2()));
            }
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        bundle.putString("tantanFrag_saved_tag", this.f23739A.getTag());
        super.onSaveInstanceState(bundle);
    }
}
