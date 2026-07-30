package com.p000p1.mobile.putong.live.livingroom.common.debugdialog;

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
import l.b8c0;
import l.xdl0;
import p002l.a5j0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class TraceDataDialog extends DialogFragment {

    /* JADX INFO: renamed from: A */
    public ImageView f5007A;

    /* JADX INFO: renamed from: B */
    public TabLayout f5008B;

    /* JADX INFO: renamed from: C */
    public ViewPager f5009C;

    /* JADX INFO: renamed from: z */
    public RelativeLayout f5010z;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.debugdialog.TraceDataDialog$a */
    public class C0338a extends FragmentPagerAdapter {

        /* JADX INFO: renamed from: a */
        public List<?> f5011a;

        /* JADX INFO: renamed from: b */
        public List<String> f5012b;

        public C0338a(FragmentManager fragmentManager, List<?> list, List<String> list2) {
            super(fragmentManager);
            this.f5011a = list;
            this.f5012b = list2;
        }

        public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
            super.destroyItem(viewGroup, i, obj);
        }

        public int getCount() {
            List<?> list = this.f5011a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public Fragment getItem(int i) {
            return (Fragment) this.f5011a.get(i);
        }

        public CharSequence getPageTitle(int i) {
            List<String> list = this.f5012b;
            return list != null ? list.get(i) : "";
        }
    }

    /* JADX INFO: renamed from: Y3 */
    private void m6310Y3() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList.add("打点耗时");
        arrayList2.add(new TraceFragment());
        C0338a c0338a = new C0338a(getChildFragmentManager(), arrayList2, arrayList);
        this.f5009C.setAdapter(c0338a);
        this.f5009C.setOffscreenPageLimit(arrayList2.size());
        c0338a.notifyDataSetChanged();
        this.f5008B.setTabMode(1);
        this.f5008B.setupWithViewPager(this.f5009C);
    }

    /* JADX INFO: renamed from: W3 */
    public final void m6311W3(View view) {
        a5j0.m9398a(this, view);
    }

    /* JADX INFO: renamed from: X3 */
    public View m6312X3(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a5j0.m9399b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m6313Z3(View view) {
        dismiss();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStyle(0, b8c0.a);
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, Bundle bundle) {
        return m6312X3(layoutInflater, viewGroup);
    }

    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super/*androidx.fragment.app.Fragment*/.onViewCreated(view, bundle);
        m6311W3(view);
        xdl0.E0(this.f5007A, new View.OnClickListener() { // from class: l.z4j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f23242a.m6313Z3(view2);
            }
        });
        m6310Y3();
    }
}
