package com.p046p1.mobile.putong.live.livingroom.common.debugdialog;

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
import p149l.a5j0;
import p149l.b8c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class TraceDataDialog extends DialogFragment {

    /* JADX INFO: renamed from: A */
    public ImageView f48965A;

    /* JADX INFO: renamed from: B */
    public TabLayout f48966B;

    /* JADX INFO: renamed from: C */
    public ViewPager f48967C;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f48968z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.debugdialog.TraceDataDialog$a */
    public class C12749a extends FragmentPagerAdapter {

        /* JADX INFO: renamed from: a */
        public List<?> f48969a;

        /* JADX INFO: renamed from: b */
        public List<String> f48970b;

        public C12749a(FragmentManager fragmentManager, List<?> list, List<String> list2) {
            super(fragmentManager);
            this.f48969a = list;
            this.f48970b = list2;
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter, p149l.w660
        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            super.destroyItem(viewGroup, i, obj);
        }

        @Override // p149l.w660
        public int getCount() {
            List<?> list = this.f48969a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        @Override // androidx.fragment.app.FragmentPagerAdapter
        public Fragment getItem(int i) {
            return (Fragment) this.f48969a.get(i);
        }

        @Override // p149l.w660
        public CharSequence getPageTitle(int i) {
            List<String> list = this.f48970b;
            return list != null ? list.get(i) : "";
        }
    }

    /* JADX INFO: renamed from: Y3 */
    private void m72801Y3() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add("打点耗时");
        arrayList2.add(new TraceFragment());
        C12749a c12749a = new C12749a(getChildFragmentManager(), arrayList2, arrayList);
        this.f48967C.setAdapter(c12749a);
        this.f48967C.setOffscreenPageLimit(arrayList2.size());
        c12749a.notifyDataSetChanged();
        this.f48966B.setTabMode(1);
        this.f48966B.setupWithViewPager(this.f48967C);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m72802W3(View view) {
        a5j0.m95045a(this, view);
    }

    /* JADX INFO: renamed from: X3 */
    public View m72803X3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a5j0.m95046b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m72804Z3(View view) {
        dismiss();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, b8c0.f74084a);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        return m72803X3(layoutInflater, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        m72802W3(view);
        xdl0.m208329E0(this.f48965A, new View.OnClickListener() { // from class: l.z4j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f201601a.m72804Z3(view2);
            }
        });
        m72801Y3();
    }
}
