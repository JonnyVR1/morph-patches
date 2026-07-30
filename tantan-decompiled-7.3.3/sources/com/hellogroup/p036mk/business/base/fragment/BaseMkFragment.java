package com.hellogroup.p036mk.business.base.fragment;

import android.app.Activity;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.hellogroup.p036mk.business.base.activity.BaseMkActivity;
import java.lang.ref.WeakReference;
import p153l.c2j0;
import p153l.jzv;
import p153l.vo2;
import p153l.x310;
import p153l.ykw;

/* JADX INFO: loaded from: classes7.dex */
public abstract class BaseMkFragment extends Fragment {

    /* JADX INFO: renamed from: B */
    private int f12009B;

    /* JADX INFO: renamed from: C */
    private int f12010C;

    /* JADX INFO: renamed from: D */
    private Intent f12011D;

    /* JADX INFO: renamed from: K */
    private Toolbar f12018K;

    /* JADX INFO: renamed from: L */
    protected c2j0 f12019L;

    /* JADX INFO: renamed from: M */
    private Toolbar f12020M;

    /* JADX INFO: renamed from: R */
    private boolean f12025R;

    /* JADX INFO: renamed from: z */
    public String f12030z = getClass().getSimpleName();

    /* JADX INFO: renamed from: A */
    private boolean f12008A = false;

    /* JADX INFO: renamed from: E */
    private boolean f12012E = false;

    /* JADX INFO: renamed from: F */
    private WeakReference<View> f12013F = null;

    /* JADX INFO: renamed from: G */
    private SparseArray<WeakReference<View>> f12014G = null;

    /* JADX INFO: renamed from: H */
    private Dialog f12015H = null;

    /* JADX INFO: renamed from: I */
    private boolean f12016I = false;

    /* JADX INFO: renamed from: J */
    private boolean f12017J = false;

    /* JADX INFO: renamed from: N */
    private boolean f12021N = false;

    /* JADX INFO: renamed from: O */
    private boolean f12022O = false;

    /* JADX INFO: renamed from: P */
    private boolean f12023P = false;

    /* JADX INFO: renamed from: Q */
    private boolean f12024Q = false;

    /* JADX INFO: renamed from: S */
    private boolean f12026S = false;

    /* JADX INFO: renamed from: T */
    boolean f12027T = false;

    /* JADX INFO: renamed from: U */
    private boolean f12028U = false;

    /* JADX INFO: renamed from: V */
    private boolean f12029V = false;

    /* JADX INFO: renamed from: com.hellogroup.mk.business.base.fragment.BaseMkFragment$a */
    public class RunnableC3508a implements Runnable {
        public RunnableC3508a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (BaseMkFragment.this.m17786V3()) {
                BaseMkFragment.this.m17788X3();
                BaseMkFragment.this.m17805p4();
            }
        }
    }

    /* JADX INFO: renamed from: n4 */
    private void m17785n4() {
        if (m17786V3()) {
            vo2.m202063i(this);
            mo17803m4();
            m17805p4();
            m17787W3();
            return;
        }
        if (m17798h4() && m17797g4()) {
            m17787W3();
        }
    }

    /* JADX INFO: renamed from: V3 */
    public boolean m17786V3() {
        return this.f12012E && !this.f12008A && getUserVisibleHint() && this.f12026S && m17797g4();
    }

    /* JADX INFO: renamed from: W3 */
    public void m17787W3() {
        Toolbar toolbarM17789Y3;
        if (this.f12022O) {
            return;
        }
        if (this.f12027T) {
            getParentFragment();
            this.f12027T = false;
            return;
        }
        if (isCreated()) {
            m17804o4(true);
            if (!m17800j4() && (toolbarM17789Y3 = m17789Y3()) != null) {
                int iM17795e4 = m17795e4();
                Toolbar.InterfaceC0161f interfaceC0161fM17794d4 = m17794d4();
                if (iM17795e4 > 0) {
                    try {
                        toolbarM17789Y3.getMenu().clear();
                        toolbarM17789Y3.inflateMenu(iM17795e4);
                        toolbarM17789Y3.setOnMenuItemClickListener(interfaceC0161fM17794d4);
                        m17806q4();
                    } catch (Exception e) {
                        jzv.m147730c(this.f12030z, "", e);
                    }
                } else {
                    toolbarM17789Y3.getMenu().clear();
                }
            }
        }
        mo17802l4();
        m17807r4(true);
    }

    /* JADX INFO: renamed from: X3 */
    public void m17788X3() {
        vo2.m202063i(this);
        mo17803m4();
    }

    /* JADX INFO: renamed from: Y3 */
    public Toolbar m17789Y3() {
        if (this.f12020M == null) {
            this.f12020M = m17793c4();
        }
        Toolbar toolbar = this.f12020M;
        if (toolbar != null) {
            return toolbar;
        }
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (parentFragment instanceof BaseMkFragment)) {
            return ((BaseMkFragment) parentFragment).m17793c4();
        }
        FragmentActivity activity = getActivity();
        if (activity == null || !(activity instanceof BaseMkActivity)) {
            return null;
        }
        return ((BaseMkActivity) activity).m17775K0();
    }

    @Nullable
    /* JADX INFO: renamed from: Z3 */
    public <T extends View> T m17790Z3(@IdRes int i) {
        T t = null;
        T t2 = this.f12014G.get(i) != null ? (T) this.f12014G.get(i).get() : null;
        if (t2 != null) {
            return t2;
        }
        if (m17791a4() != null) {
            t = (T) m17791a4().findViewById(i);
        }
        if (t != null) {
            this.f12014G.put(i, new WeakReference<>(t));
        }
        return t;
    }

    /* JADX INFO: renamed from: a4 */
    public View m17791a4() {
        WeakReference<View> weakReference = this.f12013F;
        if (weakReference == null || weakReference.get() == null) {
            if (getActivity() == null) {
                return null;
            }
            this.f12013F = new WeakReference<>(LayoutInflater.from(getActivity()).inflate(mo17792b4(), (ViewGroup) null, false));
        }
        return this.f12013F.get();
    }

    /* JADX INFO: renamed from: b4 */
    public abstract int mo17792b4();

    /* JADX INFO: renamed from: c4 */
    public Toolbar m17793c4() {
        return this.f12018K;
    }

    /* JADX INFO: renamed from: d4 */
    public Toolbar.InterfaceC0161f m17794d4() {
        return null;
    }

    /* JADX INFO: renamed from: e4 */
    public int m17795e4() {
        return -1;
    }

    /* JADX INFO: renamed from: f4 */
    public abstract void mo17796f4(View view);

    /* JADX INFO: renamed from: g4 */
    public boolean m17797g4() {
        return this.f12021N;
    }

    /* JADX INFO: renamed from: h4 */
    public boolean m17798h4() {
        return this.f12008A;
    }

    /* JADX INFO: renamed from: i4 */
    public boolean mo17799i4() {
        return true;
    }

    public boolean isCreated() {
        return this.f12016I;
    }

    /* JADX INFO: renamed from: j4 */
    public boolean m17800j4() {
        return this.f12025R;
    }

    /* JADX INFO: renamed from: k4 */
    public void mo17801k4(int i, int i2, Intent intent) {
    }

    /* JADX INFO: renamed from: l4 */
    public void mo17802l4() {
        vo2.m202069o(this);
        this.f12022O = true;
        this.f12023P = false;
    }

    /* JADX INFO: renamed from: m4 */
    public abstract void mo17803m4();

    /* JADX INFO: renamed from: o4 */
    public void m17804o4(boolean z) {
        this.f12021N = z;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f12016I = true;
        if (this.f12017J) {
            mo17801k4(this.f12009B, this.f12010C, this.f12011D);
            this.f12017J = false;
        }
        if (mo17799i4()) {
            x310.m209185c(Integer.valueOf(hashCode()), new RunnableC3508a());
        } else if (m17786V3()) {
            m17788X3();
            m17805p4();
        }
        vo2.m202056b(this, bundle);
        if (mo17799i4() || m17798h4()) {
            return;
        }
        vo2.m202063i(this);
        mo17803m4();
        m17805p4();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.f12016I) {
            mo17801k4(i, i2, intent);
        } else {
            this.f12017J = true;
            this.f12009B = i;
            this.f12010C = i2;
            this.f12011D = intent;
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        vo2.m202057c(this, activity);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f12014G = new SparseArray<>();
        this.f12013F = null;
        this.f12016I = false;
        vo2.m202058d(this, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewInflate;
        WeakReference<View> weakReference = this.f12013F;
        if (weakReference == null || weakReference.get() == null) {
            viewInflate = layoutInflater.inflate(mo17792b4(), viewGroup, false);
            this.f12013F = new WeakReference<>(viewInflate);
        } else {
            viewInflate = this.f12013F.get();
        }
        c2j0 c2j0VarM107689d = c2j0.m107689d(this);
        this.f12019L = c2j0VarM107689d;
        this.f12018K = c2j0VarM107689d.m107695g();
        this.f12012E = true;
        mo17796f4(viewInflate);
        this.f12026S = true;
        vo2.m202059e(this, layoutInflater, viewGroup, bundle);
        this.f12026S = true;
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        vo2.m202060f(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        x310.m209183a(Integer.valueOf(hashCode()));
        super.onDestroyView();
        this.f12026S = false;
        this.f12013F.clear();
        this.f12013F = null;
        this.f12014G.clear();
        vo2.m202061g(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDetach() {
        super.onDetach();
        this.f12016I = false;
        vo2.m202062h(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.f12029V = z;
        if (z) {
            return;
        }
        try {
            if (this.f12028U) {
                return;
            }
            this.f12028U = true;
        } catch (Exception e) {
            ykw.m216540a().m216541b(e);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        vo2.m202064j(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        vo2.m202065k(this);
        if (this.f12024Q) {
            return;
        }
        if (m17786V3()) {
            vo2.m202063i(this);
            mo17803m4();
            m17805p4();
            m17787W3();
        } else if (m17798h4() && m17797g4()) {
            m17787W3();
        }
        this.f12024Q = true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        vo2.m202066l(this, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        vo2.m202067m(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        vo2.m202068n(this);
    }

    /* JADX INFO: renamed from: p4 */
    public void m17805p4() {
        this.f12008A = true;
    }

    /* JADX INFO: renamed from: q4 */
    public void m17806q4() {
    }

    /* JADX INFO: renamed from: r4 */
    public void m17807r4(boolean z) {
        if (this.f12026S) {
            this.f12025R = z;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (getUserVisibleHint()) {
            m17785n4();
        }
        try {
            if (!this.f12029V && getUserVisibleHint() && !this.f12028U) {
                this.f12028U = true;
            }
        } catch (Exception e) {
            ykw.m216540a().m216541b(e);
        }
        if (getUserVisibleHint()) {
            m17785n4();
        }
    }
}
