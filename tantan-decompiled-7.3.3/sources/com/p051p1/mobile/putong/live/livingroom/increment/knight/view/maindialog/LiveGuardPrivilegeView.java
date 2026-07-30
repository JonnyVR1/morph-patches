package com.p051p1.mobile.putong.live.livingroom.increment.knight.view.maindialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.p051p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardInfoView;
import p151v.VImage;
import p151v.VPager;
import p151v.VText;
import p153l.ats;
import p153l.avk;
import p153l.bnl0;
import p153l.lsw;
import p153l.zts;
import p153l.zuk;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardPrivilegeView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f51352d;

    /* JADX INFO: renamed from: e */
    public VText f51353e;

    /* JADX INFO: renamed from: f */
    public VImage f51354f;

    /* JADX INFO: renamed from: g */
    public LiveGuardInfoView f51355g;

    /* JADX INFO: renamed from: h */
    public VPager f51356h;

    /* JADX INFO: renamed from: i */
    public ViewPager2 f51357i;

    /* JADX INFO: renamed from: j */
    public VImage f51358j;

    /* JADX INFO: renamed from: k */
    public zuk f51359k;

    /* JADX INFO: renamed from: l */
    public avk f51360l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeView$a */
    public class C13012a implements ViewPager.InterfaceC0718j {
        public C13012a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            LiveGuardPrivilegeView.this.f51357i.m4252j(i, false);
        }
    }

    public LiveGuardPrivilegeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m75881j0(View view) {
        zts.m221570a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m75882k0(final ats atsVar, lsw lswVar) {
        this.f51353e.setText(lswVar.f133467a);
        this.f51355g.m75830i0(lswVar);
        int size = lswVar.f133472f.size();
        this.f51359k = new zuk(atsVar);
        this.f51356h.setOffscreenPageLimit(size);
        this.f51356h.setAdapter(this.f51359k);
        this.f51359k.m221665q(lswVar.f133473g, lswVar.f133472f);
        this.f51356h.m4187d(new C13012a());
        avk avkVar = new avk(atsVar);
        this.f51360l = avkVar;
        avkVar.m100465y(lswVar);
        this.f51357i.setUserInputEnabled(false);
        this.f51357i.setAdapter(this.f51360l);
        bnl0.m105509E0(this.f51352d, new View.OnClickListener() { // from class: l.xts
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                atsVar.m100258N();
            }
        });
        bnl0.m105509E0(this.f51354f, new View.OnClickListener() { // from class: l.yts
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                atsVar.m100252H();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75881j0(this);
    }

    public LiveGuardPrivilegeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
