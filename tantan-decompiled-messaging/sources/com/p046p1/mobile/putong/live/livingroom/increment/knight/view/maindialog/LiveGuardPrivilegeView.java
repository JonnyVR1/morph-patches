package com.p046p1.mobile.putong.live.livingroom.increment.knight.view.maindialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.p046p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardInfoView;
import p147v.VImage;
import p147v.VPager;
import p147v.VText;
import p149l.jsk;
import p149l.ksk;
import p149l.mpw;
import p149l.xdl0;
import p149l.yrs;
import p149l.zqs;

/* JADX INFO: loaded from: classes4.dex */
public class LiveGuardPrivilegeView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f50504d;

    /* JADX INFO: renamed from: e */
    public VText f50505e;

    /* JADX INFO: renamed from: f */
    public VImage f50506f;

    /* JADX INFO: renamed from: g */
    public LiveGuardInfoView f50507g;

    /* JADX INFO: renamed from: h */
    public VPager f50508h;

    /* JADX INFO: renamed from: i */
    public ViewPager2 f50509i;

    /* JADX INFO: renamed from: j */
    public VImage f50510j;

    /* JADX INFO: renamed from: k */
    public jsk f50511k;

    /* JADX INFO: renamed from: l */
    public ksk f50512l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeView$a */
    public class C12849a implements ViewPager.InterfaceC0716j {
        public C12849a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            LiveGuardPrivilegeView.this.f50509i.m4250j(i, false);
        }
    }

    public LiveGuardPrivilegeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m74698j0(View view) {
        yrs.m215857a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m74699k0(final zqs zqsVar, mpw mpwVar) {
        this.f50505e.setText(mpwVar.f135091a);
        this.f50507g.m74647i0(mpwVar);
        int size = mpwVar.f135096f.size();
        this.f50511k = new jsk(zqsVar);
        this.f50508h.setOffscreenPageLimit(size);
        this.f50508h.setAdapter(this.f50511k);
        this.f50511k.m143046q(mpwVar.f135097g, mpwVar.f135096f);
        this.f50508h.m4185d(new C12849a());
        ksk kskVar = new ksk(zqsVar);
        this.f50512l = kskVar;
        kskVar.m147083y(mpwVar);
        this.f50509i.setUserInputEnabled(false);
        this.f50509i.setAdapter(this.f50512l);
        xdl0.m208329E0(this.f50504d, new View.OnClickListener() { // from class: l.wrs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zqsVar.m219892N();
            }
        });
        xdl0.m208329E0(this.f50506f, new View.OnClickListener() { // from class: l.xrs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zqsVar.m219886H();
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74698j0(this);
    }

    public LiveGuardPrivilegeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
