package com.p051p1.mobile.putong.live.livingroom.common.debugdialog;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import java.util.ArrayList;
import java.util.List;
import p153l.bnl0;
import p153l.eej0;
import p153l.ggc0;

/* JADX INFO: loaded from: classes4.dex */
public class TraceDataDialog extends DialogFragment {

    /* JADX INFO: renamed from: A */
    public ImageView f49813A;

    /* JADX INFO: renamed from: B */
    public TabLayout f49814B;

    /* JADX INFO: renamed from: C */
    public ViewPager f49815C;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f49816z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.debugdialog.TraceDataDialog$a */
    public class C12912a extends FragmentPagerAdapter {

        /* JADX INFO: renamed from: a */
        public List<?> f49817a;

        /* JADX INFO: renamed from: b */
        public List<String> f49818b;

        public C12912a(FragmentManager fragmentManager, List<?> list, List<String> list2) {
            super(fragmentManager);
            this.f49817a = list;
            this.f49818b = list2;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, p153l.cf60
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            super.destroyItem(viewGroup, i, obj);
        }

        @Override // p153l.cf60
        public int getCount() {
            List<?> list = this.f49817a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            return (Fragment) this.f49817a.get(i);
        }

        @Override // p153l.cf60
        public CharSequence getPageTitle(int i) {
            List<String> list = this.f49818b;
            return list != null ? list.get(i) : "";
        }
    }

    /* JADX INFO: renamed from: Y3 */
    private void m73984Y3() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add("打点耗时");
        arrayList2.add(new TraceFragment());
        C12912a c12912a = new C12912a(getChildFragmentManager(), arrayList2, arrayList);
        this.f49815C.setAdapter(c12912a);
        this.f49815C.setOffscreenPageLimit(arrayList2.size());
        c12912a.notifyDataSetChanged();
        this.f49814B.setTabMode(1);
        this.f49814B.setupWithViewPager(this.f49815C);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m73985W3(View view) {
        eej0.m120548a(this, view);
    }

    /* JADX INFO: renamed from: X3 */
    public View m73986X3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return eej0.m120549b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m73987Z3(View view) {
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, ggc0.f104003a);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        return m73986X3(layoutInflater, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        m73985W3(view);
        bnl0.m105509E0(this.f49813A, new View.OnClickListener() { // from class: l.dej0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f88035a.m73987Z3(view2);
            }
        });
        m73984Y3();
    }
}
