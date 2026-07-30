package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.MarryEditProfileFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.MarryPreviewProfileFrag;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.MarryProfileEditAct;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.MarryProfileEditPresenter;
import com.p046p1.mobile.putong.core.p053ui.marry.profile.edit.base.MarryEditProfileBaseFrag;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p147v.VButton;
import p147v.VImage;

/* JADX INFO: loaded from: classes3.dex */
public class v1x implements s7m<MarryProfileEditPresenter>, uvl {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f179286a;

    /* JADX INFO: renamed from: b */
    public VImage f179287b;

    /* JADX INFO: renamed from: c */
    public VButton f179288c;

    /* JADX INFO: renamed from: d */
    public TabLayout f179289d;

    /* JADX INFO: renamed from: e */
    public ViewPager2 f179290e;

    /* JADX INFO: renamed from: f */
    public MarryProfileEditAct f179291f;

    /* JADX INFO: renamed from: g */
    public MarryProfileEditPresenter f179292g;

    /* JADX INFO: renamed from: h */
    public ArrayList<MarryEditProfileBaseFrag> f179293h;

    /* JADX INFO: renamed from: i */
    public TabLayoutMediator f179294i;

    /* JADX INFO: renamed from: j */
    public boolean f179295j;

    /* JADX INFO: renamed from: k */
    public MarryEditProfileFrag f179296k;

    /* JADX INFO: renamed from: l */
    public MarryPreviewProfileFrag f179297l;

    /* JADX INFO: renamed from: m */
    public final String f179298m = "MarryEditProfileFrag";

    /* JADX INFO: renamed from: n */
    public final String f179299n = "MarryPreviewProfileFrag";

    /* JADX INFO: renamed from: o */
    public final ViewPager2.AbstractC0740i f179300o = new C20560a();

    /* JADX INFO: renamed from: l.v1x$a */
    public class C20560a extends ViewPager2.AbstractC0740i {
        public C20560a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0740i
        public void onPageSelected(int i) {
            int tabCount = v1x.this.f179289d.getTabCount();
            for (int i2 = 0; i2 < tabCount; i2++) {
                TabLayout.Tab tabAt = v1x.this.f179289d.getTabAt(i2);
                TextView textView = (TextView) tabAt.getCustomView();
                if (tabAt.getPosition() == i) {
                    textView.setTextColor(Color.parseColor("#FE7E1D"));
                } else {
                    textView.setTextColor(Color.parseColor("#66000000"));
                }
            }
            if (i == 0) {
                v1x.this.m196668w();
            }
        }
    }

    /* JADX INFO: renamed from: l.v1x$b */
    public class C20561b extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ String[] f179302j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20561b(FragmentManager fragmentManager, Lifecycle lifecycle, String[] strArr) {
            super(fragmentManager, lifecycle);
            this.f179302j = strArr;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NonNull
        /* JADX INFO: renamed from: A */
        public Fragment mo4208A(int i) {
            return (Fragment) v1x.this.f179293h.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f179302j.length;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return super.getItemId(i);
        }
    }

    public v1x(MarryProfileEditAct marryProfileEditAct) {
        this.f179291f = marryProfileEditAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f179291f;
    }

    @Override // p149l.uvl
    /* JADX INFO: renamed from: I0 */
    public boolean mo47447I0(User user, boolean z) {
        Iterator<MarryEditProfileBaseFrag> it = this.f179293h.iterator();
        while (it.hasNext()) {
            if (!it.next().mo47447I0(user, z)) {
                return false;
            }
        }
        return super.mo47447I0(user, z);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f179291f;
    }

    @Override // p149l.uvl
    /* JADX INFO: renamed from: d */
    public void mo47449d(User user) {
        for (MarryEditProfileBaseFrag marryEditProfileBaseFrag : this.f179293h) {
            if (NullChecker.m81303a(marryEditProfileBaseFrag)) {
                marryEditProfileBaseFrag.mo47449d(user);
            }
        }
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f179294i.detach();
        this.f179290e.m4254n(this.f179300o);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m196658j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m196658j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return w1x.m200983b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(MarryProfileEditPresenter marryProfileEditPresenter) {
        this.f179292g = marryProfileEditPresenter;
    }

    /* JADX INFO: renamed from: l */
    public Frag m196660l() {
        return this.f179293h.get(this.f179290e.getCurrentItem());
    }

    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: m */
    public void m196661m(Bundle bundle) {
        final String[] strArr = {"编辑", "预览"};
        FragmentManager supportFragmentManager = getAct().getSupportFragmentManager();
        Fragment fragmentM2577p0 = bundle == null ? null : supportFragmentManager.m2577p0(bundle, "MarryEditProfileFrag");
        Fragment fragmentM2577p1 = bundle != null ? supportFragmentManager.m2577p0(bundle, "MarryPreviewProfileFrag") : null;
        if (fragmentM2577p0 instanceof MarryEditProfileFrag) {
            this.f179296k = (MarryEditProfileFrag) fragmentM2577p0;
        } else {
            this.f179296k = new MarryEditProfileFrag();
        }
        this.f179296k.m47409P4(this.f179292g);
        if (fragmentM2577p1 instanceof MarryPreviewProfileFrag) {
            this.f179297l = (MarryPreviewProfileFrag) fragmentM2577p1;
        } else {
            this.f179297l = new MarryPreviewProfileFrag();
        }
        ArrayList<MarryEditProfileBaseFrag> arrayList = new ArrayList<>();
        this.f179293h = arrayList;
        arrayList.add(this.f179296k);
        this.f179293h.add(this.f179297l);
        this.f179290e.setAdapter(new C20561b(supportFragmentManager, getAct().getLifecycle(), strArr));
        this.f179290e.m4247g(this.f179300o);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(this.f179289d, this.f179290e, new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.r1x
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                this.f157344a.m196662n(strArr, tab, i);
            }
        });
        this.f179294i = tabLayoutMediator;
        tabLayoutMediator.attach();
        xdl0.m208329E0(this.f179288c, new View.OnClickListener() { // from class: l.s1x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161949a.m196663p(view);
            }
        });
        xdl0.m208329E0(this.f179287b, new View.OnClickListener() { // from class: l.t1x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167407a.m196664q(view);
            }
        });
        this.f179290e.setCurrentItem(this.f179292g.m47438o0());
        this.f179290e.setUserInputEnabled(false);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m196662n(String[] strArr, TabLayout.Tab tab, int i) {
        TextView textView = new TextView(getAct());
        textView.setText(strArr[i]);
        textView.setTypeface(eqh0.m117752c(3), 1);
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        tab.setCustomView(textView);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m196663p(View view) {
        this.f179292g.m47434k0(false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m196664q(View view) {
        getAct().onBackPressed();
    }

    @Override // p149l.uvl
    /* JADX INFO: renamed from: r0 */
    public boolean mo47450r0(boolean z) {
        Iterator<MarryEditProfileBaseFrag> it = this.f179293h.iterator();
        while (it.hasNext()) {
            if (it.next().mo47450r0(z)) {
                return true;
            }
        }
        return super.mo47450r0(z);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m196665s(xh0[] xh0VarArr, View view) {
        xh0VarArr[0].m208717c();
        getAct().m47815F2();
    }

    /* JADX INFO: renamed from: u */
    public void m196666u(Bundle bundle) {
        FragmentManager supportFragmentManager = getAct().getSupportFragmentManager();
        if (NullChecker.m81303a(this.f179297l) && this.f179297l.isAdded()) {
            supportFragmentManager.m2543d1(bundle, "MarryPreviewProfileFrag", this.f179297l);
        }
        if (NullChecker.m81303a(this.f179296k) && this.f179296k.isAdded()) {
            supportFragmentManager.m2543d1(bundle, "MarryEditProfileFrag", this.f179296k);
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m196667v() {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        String userInfoForMarryStatus = userM169527p9.getUserInfoForMarryStatus();
        if (!userM169527p9.isAudit() && !TextUtils.equals("audit_ignore", userInfoForMarryStatus) && !TextUtils.equals("auditing_ignore", userInfoForMarryStatus)) {
            return false;
        }
        xh0 xh0VarM208722a = new xh0.C21150a(getAct()).m208728g(false).m208729h(false).m208731j(getAct().getString(R$string.f27750N)).m208739r(getAct().getResources().getString(R$string.f27740L)).m208736o(new View.OnClickListener() { // from class: l.u1x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f173052a.m196665s(xh0VarArr, view);
            }
        }).m208722a();
        final xh0[] xh0VarArr = {xh0VarM208722a};
        xh0VarM208722a.m208721g();
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m196668w() {
        m196667v();
    }
}
