package p003l;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.edit.MarryEditProfileFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.edit.MarryPreviewProfileFrag;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.edit.MarryProfileEditAct;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.edit.MarryProfileEditPresenter;
import com.p000p1.mobile.putong.core.p001ui.marry.profile.edit.base.MarryEditProfileBaseFrag;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import l.s7m;
import l.w1x;
import l.xdl0;
import l.xh0;
import p028v.VButton;
import p028v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class v1x implements s7m<MarryProfileEditPresenter>, uvl {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f8167a;

    /* JADX INFO: renamed from: b */
    public VImage f8168b;

    /* JADX INFO: renamed from: c */
    public VButton f8169c;

    /* JADX INFO: renamed from: d */
    public TabLayout f8170d;

    /* JADX INFO: renamed from: e */
    public ViewPager2 f8171e;

    /* JADX INFO: renamed from: f */
    public MarryProfileEditAct f8172f;

    /* JADX INFO: renamed from: g */
    public MarryProfileEditPresenter f8173g;

    /* JADX INFO: renamed from: h */
    public ArrayList<MarryEditProfileBaseFrag> f8174h;

    /* JADX INFO: renamed from: i */
    public TabLayoutMediator f8175i;

    /* JADX INFO: renamed from: j */
    public boolean f8176j;

    /* JADX INFO: renamed from: k */
    public MarryEditProfileFrag f8177k;

    /* JADX INFO: renamed from: l */
    public MarryPreviewProfileFrag f8178l;

    /* JADX INFO: renamed from: m */
    public final String f8179m = "MarryEditProfileFrag";

    /* JADX INFO: renamed from: n */
    public final String f8180n = "MarryPreviewProfileFrag";

    /* JADX INFO: renamed from: o */
    public final ViewPager2.i f8181o = new C0592a();

    /* JADX INFO: renamed from: l.v1x$a */
    public class C0592a extends ViewPager2.i {
        public C0592a() {
        }

        public void onPageSelected(int i) {
            int tabCount = v1x.this.f8170d.getTabCount();
            for (int i2 = 0; i2 < tabCount; i2++) {
                TabLayout.Tab tabAt = v1x.this.f8170d.getTabAt(i2);
                TextView textView = (TextView) tabAt.getCustomView();
                if (tabAt.getPosition() == i) {
                    textView.setTextColor(Color.parseColor("#FE7E1D"));
                } else {
                    textView.setTextColor(Color.parseColor("#66000000"));
                }
            }
            if (i == 0) {
                v1x.this.m8293w();
            }
        }
    }

    /* JADX INFO: renamed from: l.v1x$b */
    public class C0593b extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ String[] f8183j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0593b(FragmentManager fragmentManager, Lifecycle lifecycle, String[] strArr) {
            super(fragmentManager, lifecycle);
            this.f8183j = strArr;
        }

        @NonNull
        /* JADX INFO: renamed from: A */
        public Fragment m8294A(int i) {
            return (Fragment) v1x.this.f8174h.get(i);
        }

        public int getItemCount() {
            return this.f8183j.length;
        }

        public long getItemId(int i) {
            return super.getItemId(i);
        }
    }

    public v1x(MarryProfileEditAct marryProfileEditAct) {
        this.f8172f = marryProfileEditAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8281C0() {
        return this.f8172f;
    }

    @Override // p003l.uvl
    /* JADX INFO: renamed from: I0 */
    public boolean mo492I0(User user, boolean z) {
        Iterator<MarryEditProfileBaseFrag> it = this.f8174h.iterator();
        while (it.hasNext()) {
            if (!it.next().mo492I0(user, z)) {
                return false;
            }
        }
        return super.mo492I0(user, z);
    }

    @Nullable
    public Act act() {
        return this.f8172f;
    }

    @Override // p003l.uvl
    /* JADX INFO: renamed from: d */
    public void mo494d(User user) {
        for (MarryEditProfileBaseFrag marryEditProfileBaseFrag : this.f8174h) {
            if (NullChecker.a(marryEditProfileBaseFrag)) {
                marryEditProfileBaseFrag.mo494d(user);
            }
        }
    }

    public void destroy() {
        this.f8175i.detach();
        this.f8171e.n(this.f8181o);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m8283j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m8283j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w1x.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void m8282i1(MarryProfileEditPresenter marryProfileEditPresenter) {
        this.f8173g = marryProfileEditPresenter;
    }

    /* JADX INFO: renamed from: l */
    public Frag m8285l() {
        return this.f8174h.get(this.f8171e.getCurrentItem());
    }

    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: m */
    public void m8286m(Bundle bundle) {
        final String[] strArr = {"编辑", "预览"};
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        Fragment fragmentP0 = bundle == null ? null : supportFragmentManager.p0(bundle, "MarryEditProfileFrag");
        Fragment fragmentP1 = bundle != null ? supportFragmentManager.p0(bundle, "MarryPreviewProfileFrag") : null;
        if (fragmentP0 instanceof MarryEditProfileFrag) {
            this.f8177k = (MarryEditProfileFrag) fragmentP0;
        } else {
            this.f8177k = new MarryEditProfileFrag();
        }
        this.f8177k.m452P4(this.f8173g);
        if (fragmentP1 instanceof MarryPreviewProfileFrag) {
            this.f8178l = (MarryPreviewProfileFrag) fragmentP1;
        } else {
            this.f8178l = new MarryPreviewProfileFrag();
        }
        ArrayList<MarryEditProfileBaseFrag> arrayList = new ArrayList<>();
        this.f8174h = arrayList;
        arrayList.add(this.f8177k);
        this.f8174h.add(this.f8178l);
        this.f8171e.setAdapter(new C0593b(supportFragmentManager, act().getLifecycle(), strArr));
        this.f8171e.g(this.f8181o);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(this.f8170d, this.f8171e, new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.r1x
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                this.f6769a.m8287n(strArr, tab, i);
            }
        });
        this.f8175i = tabLayoutMediator;
        tabLayoutMediator.attach();
        xdl0.E0(this.f8169c, new View.OnClickListener() { // from class: l.s1x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7138a.m8288p(view);
            }
        });
        xdl0.E0(this.f8168b, new View.OnClickListener() { // from class: l.t1x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7395a.m8289q(view);
            }
        });
        this.f8171e.setCurrentItem(this.f8173g.m483o0());
        this.f8171e.setUserInputEnabled(false);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m8287n(String[] strArr, TabLayout.Tab tab, int i) {
        TextView textView = new TextView(act());
        textView.setText(strArr[i]);
        textView.setTypeface(eqh0.m3924c(3), 1);
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        tab.setCustomView(textView);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m8288p(View view) {
        this.f8173g.m479k0(false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m8289q(View view) {
        act().onBackPressed();
    }

    @Override // p003l.uvl
    /* JADX INFO: renamed from: r0 */
    public boolean mo497r0(boolean z) {
        Iterator<MarryEditProfileBaseFrag> it = this.f8174h.iterator();
        while (it.hasNext()) {
            if (it.next().mo497r0(z)) {
                return true;
            }
        }
        return super.mo497r0(z);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m8290s(xh0[] xh0VarArr, View view) {
        xh0VarArr[0].c();
        act().finish();
    }

    /* JADX INFO: renamed from: u */
    public void m8291u(Bundle bundle) {
        FragmentManager supportFragmentManager = act().getSupportFragmentManager();
        if (NullChecker.a(this.f8178l) && this.f8178l.isAdded()) {
            supportFragmentManager.d1(bundle, "MarryPreviewProfileFrag", this.f8178l);
        }
        if (NullChecker.a(this.f8177k) && this.f8177k.isAdded()) {
            supportFragmentManager.d1(bundle, "MarryEditProfileFrag", this.f8177k);
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m8292v() {
        User userP9 = CoreModule.c.e0.p9();
        String userInfoForMarryStatus = userP9.getUserInfoForMarryStatus();
        if (!userP9.isAudit() && !TextUtils.equals("audit_ignore", userInfoForMarryStatus) && !TextUtils.equals("auditing_ignore", userInfoForMarryStatus)) {
            return false;
        }
        xh0 xh0VarA = new xh0.a(act()).g(false).h(false).j(act().getString(R.string.N)).r(act().getResources().getString(R.string.L)).o(new View.OnClickListener() { // from class: l.u1x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7877a.m8290s(xh0VarArr, view);
            }
        }).a();
        final xh0[] xh0VarArr = {xh0VarA};
        xh0VarA.g();
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m8293w() {
        m8292v();
    }
}
