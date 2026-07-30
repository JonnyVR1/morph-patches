package com.p000p1.mobile.putong.feed.newui.photoalbum.interaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.cwf0;
import l.d30;
import l.u2c0;
import l.vwb;
import p007l.b5c0;
import p007l.d8h;
import p007l.e8h;
import p007l.eah;
import p007l.k8h;
import p007l.o6c0;
import p007l.p6j0;
import p007l.pkg;
import p007l.pvg;
import p007l.zmg;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedInteractionAct extends PutongAct implements ViewPager.j, k8h {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f3448c;

    /* JADX INFO: renamed from: d */
    public TabLayout f3449d;

    /* JADX INFO: renamed from: e */
    public ViewPager f3450e;

    /* JADX INFO: renamed from: g */
    public e8h f3452g;

    /* JADX INFO: renamed from: f */
    public List<pkg> f3451f = new ArrayList();

    /* JADX INFO: renamed from: h */
    public cwf0 f3453h = new cwf0("p_interactcell_detail", FeedInteractionAct.class.getName());

    /* JADX INFO: renamed from: i */
    public d30 f3454i = new d30() { // from class: l.b8h
        public final void call() {
            this.f6174a.m5838h2();
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.interaction.FeedInteractionAct$a */
    public class C2147a implements TabLayout.OnTabSelectedListener {
        public C2147a() {
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            pkg pkgVar = (pkg) FeedInteractionAct.this.f3451f.get(tab.getPosition());
            ((TextView) tab.view.findViewById(b5c0.f6037d2)).setTextColor(Color.parseColor("#fe7e1d"));
            FeedInteractionAct.this.f3453h.o(p6j0.m12911a(p6j0.C2456a.m12922g("interact_type", pkgVar.mo9686d().getValue())));
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            pkg pkgVar = (pkg) FeedInteractionAct.this.f3451f.get(tab.getPosition());
            ((TextView) tab.view.findViewById(b5c0.f6037d2)).setTextColor(Color.parseColor("#e6000000"));
            FeedInteractionAct.this.f3453h.g();
            pkgVar.m13071j();
        }
    }

    /* JADX INFO: renamed from: c2 */
    private void m5836c2() {
        this.f3448c.setTitle("互动消息");
        this.f3448c.setLeftIconResource(u2c0.n);
        this.f3448c.setLeftIconOnClick(new View.OnClickListener() { // from class: l.c8h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6564a.m5843g2(view);
            }
        });
    }

    /* JADX INFO: renamed from: d2 */
    private void m5837d2() {
        this.f3449d.addOnTabSelectedListener(new C2147a());
        for (int i = 0; i < this.f3451f.size(); i++) {
            this.f3449d.getTabAt(i).setCustomView(m5841b2(i));
        }
    }

    @Override // p007l.k8h
    /* JADX INFO: renamed from: W */
    public d30 mo5839W() {
        return this.f3454i;
    }

    /* JADX INFO: renamed from: a2 */
    public View m5840a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return d8h.m9353b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b2 */
    public View m5841b2(int i) {
        View viewInflate = act().inflater().inflate(o6c0.f11130T0, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(b5c0.f6037d2);
        this.f3451f.get(i).m13068f().mo10432d((TextView) viewInflate.findViewById(b5c0.f6041e2));
        textView.setText(this.f3451f.get(i).getTitle());
        if (i == 0) {
            textView.setTextColor(Color.parseColor("#fe7e1d"));
            this.f3453h.o(p6j0.m12911a(p6j0.C2456a.m12922g("interact_type", "like")));
            this.f3453h.r();
        }
        return viewInflate;
    }

    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: e2 */
    public void m5842e2() {
        this.f3451f.add(new eah());
        this.f3451f.add(new pvg());
        this.f3451f.add(new zmg());
        e8h e8hVar = new e8h(((Act) this).act.getSupportFragmentManager(), ((Act) this).act, this.f3451f);
        this.f3452g = e8hVar;
        this.f3450e.setAdapter(e8hVar);
        this.f3450e.setOnPageChangeListener(this);
        this.f3450e.setOffscreenPageLimit(2);
        this.f3449d.setupWithViewPager(this.f3450e);
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m5843g2(View view) {
        finish();
    }

    /* JADX INFO: renamed from: i2, reason: merged with bridge method [inline-methods] */
    public final void m5838h2() {
        Iterator<pkg> it = this.f3451f.iterator();
        while (it.hasNext()) {
            it.next().f11877a.m5860W4().m6097V();
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM5840a2 = m5840a2(layoutInflater, viewGroup);
        this.f3453h.c();
        m5836c2();
        m5842e2();
        m5837d2();
        return viewM5840a2;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == PhotoAlbumActivitiesAct.f3704i && i2 == -1 && NullChecker.a(intent)) {
            int intExtra = intent.getIntExtra(PhotoAlbumActivitiesAct.f3709n, 0);
            Bundle bundleExtra = intent.getBundleExtra(PhotoAlbumActivitiesAct.f3710o);
            if (NullChecker.a(bundleExtra)) {
                ArrayList<String> stringArrayList = bundleExtra.getStringArrayList(PhotoAlbumActivitiesAct.f3707l);
                ArrayList<String> stringArrayList2 = bundleExtra.getStringArrayList(PhotoAlbumActivitiesAct.f3708m);
                ArrayList<User> arrayList = new ArrayList<>();
                if (!vwb.J(stringArrayList)) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        User userM16628e8 = FeedModule.f316d.m16628e8(it.next());
                        if (NullChecker.a(userM16628e8)) {
                            arrayList.add(userM16628e8);
                        }
                    }
                }
                for (pkg pkgVar : this.f3451f) {
                    pkgVar.m13069h(arrayList, intExtra);
                    pkgVar.m13072k(stringArrayList2);
                }
            }
        }
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
    }

    public void onPageSelected(int i) {
        pkg pkgVar = this.f3451f.get(i);
        this.f3453h.r();
        pkgVar.m13070i();
    }
}
