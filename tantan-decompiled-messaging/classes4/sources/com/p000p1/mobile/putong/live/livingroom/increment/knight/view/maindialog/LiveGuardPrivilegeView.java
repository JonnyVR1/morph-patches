package com.p000p1.mobile.putong.live.livingroom.increment.knight.view.maindialog;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;
import com.p000p1.mobile.putong.live.livingroom.increment.knight.view.LiveGuardInfoView;
import l.xdl0;
import p002l.jsk;
import p002l.ksk;
import p002l.mpw;
import p002l.yrs;
import p002l.zqs;
import v.VImage;
import v.VPager;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveGuardPrivilegeView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f6546d;

    /* JADX INFO: renamed from: e */
    public VText f6547e;

    /* JADX INFO: renamed from: f */
    public VImage f6548f;

    /* JADX INFO: renamed from: g */
    public LiveGuardInfoView f6549g;

    /* JADX INFO: renamed from: h */
    public VPager f6550h;

    /* JADX INFO: renamed from: i */
    public ViewPager2 f6551i;

    /* JADX INFO: renamed from: j */
    public VImage f6552j;

    /* JADX INFO: renamed from: k */
    public jsk f6553k;

    /* JADX INFO: renamed from: l */
    public ksk f6554l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.knight.view.maindialog.LiveGuardPrivilegeView$a */
    public class C0438a implements ViewPager.j {
        public C0438a() {
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            LiveGuardPrivilegeView.this.f6551i.j(i, false);
        }
    }

    public LiveGuardPrivilegeView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m8292j0(View view) {
        yrs.m26915a(this, view);
    }

    /* JADX INFO: renamed from: k0 */
    public void m8293k0(final zqs zqsVar, mpw mpwVar) {
        this.f6547e.setText(mpwVar.f15519a);
        this.f6549g.m8240i0(mpwVar);
        int size = mpwVar.f15524f.size();
        this.f6553k = new jsk(zqsVar);
        this.f6550h.setOffscreenPageLimit(size);
        this.f6550h.setAdapter(this.f6553k);
        this.f6553k.m16213q(mpwVar.f15525g, mpwVar.f15524f);
        this.f6550h.d(new C0438a());
        ksk kskVar = new ksk(zqsVar);
        this.f6554l = kskVar;
        kskVar.m16783y(mpwVar);
        this.f6551i.setUserInputEnabled(false);
        this.f6551i.setAdapter(this.f6554l);
        xdl0.E0(this.f6546d, new View.OnClickListener() { // from class: l.wrs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zqsVar.m27520N();
            }
        });
        xdl0.E0(this.f6548f, new View.OnClickListener() { // from class: l.xrs
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zqsVar.m27514H();
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8292j0(this);
    }

    public LiveGuardPrivilegeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
