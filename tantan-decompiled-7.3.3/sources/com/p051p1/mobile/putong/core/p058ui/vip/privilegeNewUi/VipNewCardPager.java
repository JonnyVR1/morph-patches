package com.p051p1.mobile.putong.core.p058ui.vip.privilegeNewUi;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p151v.VFrame;
import p153l.bnl0;
import p153l.kec0;
import p153l.lb2;
import p153l.p9r;
import p153l.qa00;
import p153l.vnb;
import p153l.xsl0;

/* JADX INFO: loaded from: classes12.dex */
public class VipNewCardPager extends FrameLayout implements ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: a */
    public VFrame f38709a;

    /* JADX INFO: renamed from: b */
    public ViewPager f38710b;

    /* JADX INFO: renamed from: c */
    public ArrayList<PurchaseType> f38711c;

    /* JADX INFO: renamed from: d */
    public C9179a f38712d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.VipNewCardPager$a */
    public static class C9179a extends lb2 {

        /* JADX INFO: renamed from: e */
        public PutongFrag f38713e;

        /* JADX INFO: renamed from: f */
        public ArrayList<PurchaseType> f38714f = new ArrayList<>();

        /* JADX INFO: renamed from: g */
        public int f38715g;

        @Override // p153l.cf60
        public int getCount() {
            return this.f38714f.size() * 100;
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: m */
        public void mo44299m(Object obj) {
            super.mo44299m(obj);
            if (obj instanceof IntlPrivilegeCard) {
                ((IntlPrivilegeCard) obj).m58667v();
            }
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            m58677q(i);
            IntlPrivilegeCard intlPrivilegeCard = (IntlPrivilegeCard) this.f38713e.act().inflater().inflate(kec0.f125331Af, viewGroup, false);
            viewGroup.addView(intlPrivilegeCard);
            return intlPrivilegeCard;
        }

        /* JADX INFO: renamed from: q */
        public int m58677q(int i) {
            if (this.f38714f.size() == 0) {
                return 0;
            }
            return i % this.f38714f.size();
        }

        /* JADX INFO: renamed from: r */
        public void m58678r(int i) {
            this.f38715g = i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.VipNewCardPager$b */
    public interface InterfaceC9180b {
    }

    public VipNewCardPager(@NonNull Context context) {
        super(context);
        this.f38711c = new ArrayList<>();
        m58674d();
    }

    /* JADX INFO: renamed from: c */
    private void m58673c() {
        if (bnl0.m105588w0() <= 1280) {
            ViewGroup.LayoutParams layoutParams = this.f38710b.getLayoutParams();
            layoutParams.height = qa00.m175859d(vnb.m201953m1() * 188.0f);
            layoutParams.width = qa00.m175859d(vnb.m201953m1() * 340.0f);
            this.f38710b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m58674d() {
        addView(m58676b(p9r.m171370a(getContext()), this));
        this.f38710b.setOffscreenPageLimit(2);
        this.f38710b.setPageMargin(qa00.m175859d(3.0f));
        C9179a c9179a = new C9179a();
        this.f38712d = c9179a;
        this.f38710b.setAdapter(c9179a);
        this.f38710b.m4187d(this);
        setOnTouchListener(new View.OnTouchListener() { // from class: l.wsl0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f190657a.m58675e(view, motionEvent);
            }
        });
        m58673c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean m58675e(View view, MotionEvent motionEvent) {
        return this.f38710b.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: b */
    public View m58676b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xsl0.m212988b(this, layoutInflater, viewGroup);
    }

    public C9179a getAdapter() {
        return this.f38712d;
    }

    public int getPosition() {
        return this.f38712d.m58677q(this.f38710b.getCurrentItem());
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
        this.f38709a.invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        boolean zM82486a = NullChecker.m82486a(null);
        C9179a c9179a = this.f38712d;
        if (zM82486a) {
            c9179a.m58677q(i);
            throw null;
        }
        c9179a.m58678r(i);
    }

    public void setCurrentItem(int i) {
        this.f38710b.setCurrentItem((this.f38711c.size() * 50) + i);
    }

    public void setOnPageChangeListener(InterfaceC9180b interfaceC9180b) {
    }

    public VipNewCardPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38711c = new ArrayList<>();
        m58674d();
    }

    public VipNewCardPager(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38711c = new ArrayList<>();
        m58674d();
    }
}
