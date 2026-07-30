package com.p051p1.mobile.putong.feed.newui.photoalbum.interaction;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.PhotoAlbumActivitiesAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.navigationbar.VNavigationBar;
import p153l.abc0;
import p153l.emg;
import p153l.exg;
import p153l.hdc0;
import p153l.jyb;
import p153l.l4g0;
import p153l.oog;
import p153l.s9h;
import p153l.t9h;
import p153l.tbh;
import p153l.tec0;
import p153l.tfj0;
import p153l.x20;
import p153l.z9h;

/* JADX INFO: loaded from: classes13.dex */
public class FeedInteractionAct extends PutongAct implements ViewPager.InterfaceC0718j, z9h {

    /* JADX INFO: renamed from: c */
    public VNavigationBar f42835c;

    /* JADX INFO: renamed from: d */
    public TabLayout f42836d;

    /* JADX INFO: renamed from: e */
    public ViewPager f42837e;

    /* JADX INFO: renamed from: g */
    public t9h f42839g;

    /* JADX INFO: renamed from: f */
    public List<emg> f42838f = new ArrayList();

    /* JADX INFO: renamed from: h */
    public l4g0 f42840h = new l4g0("p_interactcell_detail", FeedInteractionAct.class.getName());

    /* JADX INFO: renamed from: i */
    public x20 f42841i = new x20() { // from class: l.q9h
        @Override // p153l.x20
        public final void call() {
            this.f156242a.m65925i2();
        }
    };

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.photoalbum.interaction.FeedInteractionAct$a */
    public class C11466a implements TabLayout.OnTabSelectedListener {
        public C11466a() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            emg emgVar = (emg) FeedInteractionAct.this.f42838f.get(tab.getPosition());
            ((TextView) tab.view.findViewById(hdc0.f108909d2)).setTextColor(Color.parseColor("#fe7e1d"));
            FeedInteractionAct.this.f42840h.m152780o(tfj0.m190938a(tfj0.C20302a.m190949g("interact_type", emgVar.mo121359d().getValue())));
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            emg emgVar = (emg) FeedInteractionAct.this.f42838f.get(tab.getPosition());
            ((TextView) tab.view.findViewById(hdc0.f108909d2)).setTextColor(Color.parseColor("#e6000000"));
            FeedInteractionAct.this.f42840h.m152772g();
            emgVar.m121365j();
        }
    }

    /* JADX INFO: renamed from: d2 */
    private void m65923d2() {
        this.f42835c.setTitle("互动消息");
        this.f42835c.setLeftIconResource(abc0.f69506n);
        this.f42835c.setLeftIconOnClick(new View.OnClickListener() { // from class: l.r9h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f161813a.m65930h2(view);
            }
        });
    }

    /* JADX INFO: renamed from: e2 */
    private void m65924e2() {
        this.f42836d.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C11466a());
        for (int i = 0; i < this.f42838f.size(); i++) {
            this.f42836d.getTabAt(i).setCustomView(m65928c2(i));
        }
    }

    @Override // p153l.z9h
    /* JADX INFO: renamed from: X */
    public x20 mo65926X() {
        return this.f42841i;
    }

    /* JADX INFO: renamed from: b2 */
    public View m65927b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s9h.m185177b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c2 */
    public View m65928c2(int i) {
        View viewInflate = act().inflater().inflate(tec0.f173580T0, (ViewGroup) null);
        TextView textView = (TextView) viewInflate.findViewById(hdc0.f108909d2);
        this.f42838f.get(i).m121361f().mo200711d((TextView) viewInflate.findViewById(hdc0.f108913e2));
        textView.setText(this.f42838f.get(i).getTitle());
        if (i == 0) {
            textView.setTextColor(Color.parseColor("#fe7e1d"));
            this.f42840h.m152780o(tfj0.m190938a(tfj0.C20302a.m190949g("interact_type", "like")));
            this.f42840h.m152783r();
        }
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: g2 */
    public void m65929g2() {
        this.f42838f.add(new tbh());
        this.f42838f.add(new exg());
        this.f42838f.add(new oog());
        t9h t9hVar = new t9h(this.act.getSupportFragmentManager(), this.act, this.f42838f);
        this.f42839g = t9hVar;
        this.f42837e.setAdapter(t9hVar);
        this.f42837e.setOnPageChangeListener(this);
        this.f42837e.setOffscreenPageLimit(2);
        this.f42836d.setupWithViewPager(this.f42837e);
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m65930h2(View view) {
        m48999H2();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM65927b2 = m65927b2(layoutInflater, viewGroup);
        this.f42840h.m152768c();
        m65923d2();
        m65929g2();
        m65924e2();
        return viewM65927b2;
    }

    /* JADX INFO: renamed from: k2, reason: merged with bridge method [inline-methods] */
    public final void m65925i2() {
        Iterator<emg> it = this.f42838f.iterator();
        while (it.hasNext()) {
            it.next().f94649a.m65947W4().m66180V();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == PhotoAlbumActivitiesAct.f43091i && i2 == -1 && NullChecker.m82486a(intent)) {
            int intExtra = intent.getIntExtra(PhotoAlbumActivitiesAct.f43096n, 0);
            Bundle bundleExtra = intent.getBundleExtra(PhotoAlbumActivitiesAct.f43097o);
            if (NullChecker.m82486a(bundleExtra)) {
                ArrayList<String> stringArrayList = bundleExtra.getStringArrayList(PhotoAlbumActivitiesAct.f43094l);
                ArrayList<String> stringArrayList2 = bundleExtra.getStringArrayList(PhotoAlbumActivitiesAct.f43095m);
                ArrayList<User> arrayList = new ArrayList<>();
                if (!jyb.m147479J(stringArrayList)) {
                    Iterator<String> it = stringArrayList.iterator();
                    while (it.hasNext()) {
                        User userM145688e8 = FeedModule.f39703d.m145688e8(it.next());
                        if (NullChecker.m82486a(userM145688e8)) {
                            arrayList.add(userM145688e8);
                        }
                    }
                }
                for (emg emgVar : this.f42838f) {
                    emgVar.m121363h(arrayList, intExtra);
                    emgVar.m121366k(stringArrayList2);
                }
            }
        }
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        emg emgVar = this.f42838f.get(i);
        this.f42840h.m152783r();
        emgVar.m121364i();
    }
}
