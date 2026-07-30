package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.MarryEditProfileFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.MarryPreviewProfileFrag;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.MarryProfileEditAct;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.MarryProfileEditPresenter;
import com.p051p1.mobile.putong.core.p058ui.marry.profile.edit.base.MarryEditProfileBaseFrag;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p151v.VButton;
import p151v.VImage;

/* JADX INFO: loaded from: classes3.dex */
public class u4x implements iam<MarryProfileEditPresenter>, myl {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f177547a;

    /* JADX INFO: renamed from: b */
    public VImage f177548b;

    /* JADX INFO: renamed from: c */
    public VButton f177549c;

    /* JADX INFO: renamed from: d */
    public TabLayout f177550d;

    /* JADX INFO: renamed from: e */
    public ViewPager2 f177551e;

    /* JADX INFO: renamed from: f */
    public MarryProfileEditAct f177552f;

    /* JADX INFO: renamed from: g */
    public MarryProfileEditPresenter f177553g;

    /* JADX INFO: renamed from: h */
    public ArrayList<MarryEditProfileBaseFrag> f177554h;

    /* JADX INFO: renamed from: i */
    public TabLayoutMediator f177555i;

    /* JADX INFO: renamed from: j */
    public boolean f177556j;

    /* JADX INFO: renamed from: k */
    public MarryEditProfileFrag f177557k;

    /* JADX INFO: renamed from: l */
    public MarryPreviewProfileFrag f177558l;

    /* JADX INFO: renamed from: m */
    public final String f177559m = "MarryEditProfileFrag";

    /* JADX INFO: renamed from: n */
    public final String f177560n = "MarryPreviewProfileFrag";

    /* JADX INFO: renamed from: o */
    public final ViewPager2.AbstractC0742i f177561o = new C20485a();

    /* JADX INFO: renamed from: l.u4x$a */
    public class C20485a extends ViewPager2.AbstractC0742i {
        public C20485a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.AbstractC0742i
        public void onPageSelected(int i) {
            int tabCount = u4x.this.f177550d.getTabCount();
            for (int i2 = 0; i2 < tabCount; i2++) {
                TabLayout.Tab tabAt = u4x.this.f177550d.getTabAt(i2);
                TextView textView = (TextView) tabAt.getCustomView();
                if (tabAt.getPosition() == i) {
                    textView.setTextColor(Color.parseColor("#FE7E1D"));
                } else {
                    textView.setTextColor(Color.parseColor("#66000000"));
                }
            }
            if (i == 0) {
                u4x.this.m194517w();
            }
        }
    }

    /* JADX INFO: renamed from: l.u4x$b */
    public class C20486b extends FragmentStateAdapter {

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ String[] f177563j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C20486b(FragmentManager fragmentManager, Lifecycle lifecycle, String[] strArr) {
            super(fragmentManager, lifecycle);
            this.f177563j = strArr;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter
        @NonNull
        /* JADX INFO: renamed from: A */
        public Fragment mo4210A(int i) {
            return (Fragment) u4x.this.f177554h.get(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.f177563j.length;
        }

        @Override // androidx.viewpager2.adapter.FragmentStateAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return super.getItemId(i);
        }
    }

    public u4x(MarryProfileEditAct marryProfileEditAct) {
        this.f177552f = marryProfileEditAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f177552f;
    }

    @Override // p153l.myl
    /* JADX INFO: renamed from: I0 */
    public boolean mo48630I0(User user, boolean z) {
        Iterator<MarryEditProfileBaseFrag> it = this.f177554h.iterator();
        while (it.hasNext()) {
            if (!it.next().mo48630I0(user, z)) {
                return false;
            }
        }
        return super.mo48630I0(user, z);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f177552f;
    }

    @Override // p153l.myl
    /* JADX INFO: renamed from: d */
    public void mo48632d(User user) {
        for (MarryEditProfileBaseFrag marryEditProfileBaseFrag : this.f177554h) {
            if (NullChecker.m82486a(marryEditProfileBaseFrag)) {
                marryEditProfileBaseFrag.mo48632d(user);
            }
        }
    }

    @Override // p153l.iam
    public void destroy() {
        this.f177555i.detach();
        this.f177551e.m4256n(this.f177561o);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m194507j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m194507j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return v4x.m199739b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(MarryProfileEditPresenter marryProfileEditPresenter) {
        this.f177553g = marryProfileEditPresenter;
    }

    /* JADX INFO: renamed from: l */
    public Frag m194509l() {
        return this.f177554h.get(this.f177551e.getCurrentItem());
    }

    @SuppressLint({"ResourceType"})
    /* JADX INFO: renamed from: m */
    public void m194510m(Bundle bundle) {
        final String[] strArr = {"编辑", "预览"};
        FragmentManager supportFragmentManager = getAct().getSupportFragmentManager();
        Fragment fragmentM2578p0 = bundle == null ? null : supportFragmentManager.m2578p0(bundle, "MarryEditProfileFrag");
        Fragment fragmentM2578p1 = bundle != null ? supportFragmentManager.m2578p0(bundle, "MarryPreviewProfileFrag") : null;
        if (fragmentM2578p0 instanceof MarryEditProfileFrag) {
            this.f177557k = (MarryEditProfileFrag) fragmentM2578p0;
        } else {
            this.f177557k = new MarryEditProfileFrag();
        }
        this.f177557k.m48592P4(this.f177553g);
        if (fragmentM2578p1 instanceof MarryPreviewProfileFrag) {
            this.f177558l = (MarryPreviewProfileFrag) fragmentM2578p1;
        } else {
            this.f177558l = new MarryPreviewProfileFrag();
        }
        ArrayList<MarryEditProfileBaseFrag> arrayList = new ArrayList<>();
        this.f177554h = arrayList;
        arrayList.add(this.f177557k);
        this.f177554h.add(this.f177558l);
        this.f177551e.setAdapter(new C20486b(supportFragmentManager, getAct().getLifecycle(), strArr));
        this.f177551e.m4249g(this.f177561o);
        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(this.f177550d, this.f177551e, new TabLayoutMediator.TabConfigurationStrategy() { // from class: l.q4x
            @Override // com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
            public final void onConfigureTab(TabLayout.Tab tab, int i) {
                this.f155621a.m194511n(strArr, tab, i);
            }
        });
        this.f177555i = tabLayoutMediator;
        tabLayoutMediator.attach();
        bnl0.m105509E0(this.f177549c, new View.OnClickListener() { // from class: l.r4x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161251a.m194512p(view);
            }
        });
        bnl0.m105509E0(this.f177548b, new View.OnClickListener() { // from class: l.s4x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f166294a.m194513q(view);
            }
        });
        this.f177551e.setCurrentItem(this.f177553g.m48621o0());
        this.f177551e.setUserInputEnabled(false);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m194511n(String[] strArr, TabLayout.Tab tab, int i) {
        TextView textView = new TextView(getAct());
        textView.setText(strArr[i]);
        textView.setTypeface(lyh0.m156283c(3), 1);
        textView.setTextSize(15.0f);
        textView.setGravity(17);
        tab.setCustomView(textView);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m194512p(View view) {
        this.f177553g.m48617k0(false);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m194513q(View view) {
        getAct().onBackPressed();
    }

    @Override // p153l.myl
    /* JADX INFO: renamed from: r0 */
    public boolean mo48633r0(boolean z) {
        Iterator<MarryEditProfileBaseFrag> it = this.f177554h.iterator();
        while (it.hasNext()) {
            if (it.next().mo48633r0(z)) {
                return true;
            }
        }
        return super.mo48633r0(z);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m194514s(th0[] th0VarArr, View view) {
        th0VarArr[0].m191137c();
        getAct().m48999H2();
    }

    /* JADX INFO: renamed from: u */
    public void m194515u(Bundle bundle) {
        FragmentManager supportFragmentManager = getAct().getSupportFragmentManager();
        if (NullChecker.m82486a(this.f177558l) && this.f177558l.isAdded()) {
            supportFragmentManager.m2544d1(bundle, "MarryPreviewProfileFrag", this.f177558l);
        }
        if (NullChecker.m82486a(this.f177557k) && this.f177557k.isAdded()) {
            supportFragmentManager.m2544d1(bundle, "MarryEditProfileFrag", this.f177557k);
        }
    }

    /* JADX INFO: renamed from: v */
    public final boolean m194516v() {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        String userInfoForMarryStatus = userM116600p9.getUserInfoForMarryStatus();
        if (!userM116600p9.isAudit() && !TextUtils.equals("audit_ignore", userInfoForMarryStatus) && !TextUtils.equals("auditing_ignore", userInfoForMarryStatus)) {
            return false;
        }
        th0 th0VarM191142a = new th0.C20312a(getAct()).m191148g(false).m191149h(false).m191151j(getAct().getString(R$string.f28598N)).m191159r(getAct().getResources().getString(R$string.f28588L)).m191156o(new View.OnClickListener() { // from class: l.t4x
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f172149a.m194514s(th0VarArr, view);
            }
        }).m191142a();
        final th0[] th0VarArr = {th0VarM191142a};
        th0VarM191142a.m191141g();
        return true;
    }

    /* JADX INFO: renamed from: w */
    public final void m194517w() {
        m194516v();
    }
}
