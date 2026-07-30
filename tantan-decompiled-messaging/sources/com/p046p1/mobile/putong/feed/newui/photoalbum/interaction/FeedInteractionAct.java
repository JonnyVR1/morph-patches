package com.p046p1.mobile.putong.feed.newui.photoalbum.interaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.navigationbar.VNavigationBar;
import p149l.b5c0;
import p149l.cwf0;
import p149l.d30;
import p149l.d8h;
import p149l.e8h;
import p149l.eah;
import p149l.k8h;
import p149l.o6c0;
import p149l.p6j0;
import p149l.pkg;
import p149l.pvg;
import p149l.u2c0;
import p149l.vwb;
import p149l.zmg;

/* JADX INFO: loaded from: classes12.dex */
public class FeedInteractionAct extends PutongAct implements ViewPager.InterfaceC0716j, k8h {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f41987c;

    /* JADX INFO: renamed from: d */
    public TabLayout f41988d;

    /* JADX INFO: renamed from: e */
    public ViewPager f41989e;

    /* JADX INFO: renamed from: g */
    public e8h f41991g;

    /* JADX INFO: renamed from: f */
    public List<pkg> f41990f = new ArrayList();

    /* JADX INFO: renamed from: h */
    public cwf0 f41992h = new cwf0("p_interactcell_detail", FeedInteractionAct.class.getName());

    /* JADX INFO: renamed from: i */
    public d30 f41993i = new d30() { // from class: l.b8h
        @Override // p149l.d30
        public final void call() {
            this.f74127a.m64742h2();
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.interaction.FeedInteractionAct$a */
    public class C11303a implements TabLayout.OnTabSelectedListener {
        public C11303a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            pkg pkgVar = (pkg) FeedInteractionAct.this.f41990f.get(tab.getPosition());
            ((TextView) tab.view.findViewById(b5c0.f73556d2)).setTextColor(Color.parseColor("#fe7e1d"));
            FeedInteractionAct.this.f41992h.m109039o(p6j0.m167667a(p6j0.C19147a.m167678g("interact_type", pkgVar.mo115417d().getValue())));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            pkg pkgVar = (pkg) FeedInteractionAct.this.f41990f.get(tab.getPosition());
            ((TextView) tab.view.findViewById(b5c0.f73556d2)).setTextColor(Color.parseColor("#e6000000"));
            FeedInteractionAct.this.f41992h.m109031g();
            pkgVar.m170050j();
        }
    }

    /* JADX INFO: renamed from: c2 */
    private void m64740c2() {
        this.f41987c.setTitle("互动消息");
        this.f41987c.setLeftIconResource(u2c0.f173386n);
        this.f41987c.setLeftIconOnClick(new View.OnClickListener() { // from class: l.c8h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f79767a.m64747g2(view);
            }
        });
    }

    /* JADX INFO: renamed from: d2 */
    private void m64741d2() {
        this.f41988d.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C11303a());
        for (int i = 0; i < this.f41990f.size(); i++) {
            this.f41988d.getTabAt(i).setCustomView(m64745b2(i));
        }
    }

    @Override // p149l.k8h
    /* JADX INFO: renamed from: W */
    public d30 mo64743W() {
        return this.f41993i;
    }

    /* JADX INFO: renamed from: a2 */
    public View m64744a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d8h.m110324b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b2 */
    public View m64745b2(int i) {
        View viewInflate = act().inflater().inflate(o6c0.f142111T0, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(b5c0.f73556d2);
        this.f41990f.get(i).m170047f().mo124943d((TextView) viewInflate.findViewById(b5c0.f73560e2));
        textView.setText(this.f41990f.get(i).getTitle());
        if (i == 0) {
            textView.setTextColor(Color.parseColor("#fe7e1d"));
            this.f41992h.m109039o(p6j0.m167667a(p6j0.C19147a.m167678g("interact_type", "like")));
            this.f41992h.m109042r();
        }
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public void m64746e2() {
        this.f41990f.add(new eah());
        this.f41990f.add(new pvg());
        this.f41990f.add(new zmg());
        e8h e8hVar = new e8h(this.act.getSupportFragmentManager(), this.act, this.f41990f);
        this.f41991g = e8hVar;
        this.f41989e.setAdapter(e8hVar);
        this.f41989e.setOnPageChangeListener(this);
        this.f41989e.setOffscreenPageLimit(2);
        this.f41988d.setupWithViewPager(this.f41989e);
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m64747g2(View view) {
        m47815F2();
    }

    /* JADX INFO: renamed from: i2, reason: merged with bridge method [inline-methods] */
    public final void m64742h2() {
        Iterator<pkg> it = this.f41990f.iterator();
        while (it.hasNext()) {
            it.next().f149986a.m64764W4().m64997V();
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM64744a2 = m64744a2(layoutInflater, viewGroup);
        this.f41992h.m109027c();
        m64740c2();
        m64746e2();
        m64741d2();
        return viewM64744a2;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == PhotoAlbumActivitiesAct.f42243i && i2 == -1 && NullChecker.m81303a(intent)) {
            int intExtra = intent.getIntExtra(PhotoAlbumActivitiesAct.f42248n, 0);
            Bundle bundleExtra = intent.getBundleExtra(PhotoAlbumActivitiesAct.f42249o);
            if (NullChecker.m81303a(bundleExtra)) {
                ArrayList<String> stringArrayList = bundleExtra.getStringArrayList(PhotoAlbumActivitiesAct.f42246l);
                ArrayList<String> stringArrayList2 = bundleExtra.getStringArrayList(PhotoAlbumActivitiesAct.f42247m);
                ArrayList<User> arrayList = new ArrayList<>();
                if (!vwb.m200296J(stringArrayList)) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        User userM209447e8 = FeedModule.f38855d.m209447e8(it.next());
                        if (NullChecker.m81303a(userM209447e8)) {
                            arrayList.add(userM209447e8);
                        }
                    }
                }
                for (pkg pkgVar : this.f41990f) {
                    pkgVar.m170048h(arrayList, intExtra);
                    pkgVar.m170051k(stringArrayList2);
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        pkg pkgVar = this.f41990f.get(i);
        this.f41992h.m109042r();
        pkgVar.m170049i();
    }
}
