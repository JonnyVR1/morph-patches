package com.p051p1.mobile.putong.core.p058ui.vip.intlPrivilege;

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
import p153l.vmp;
import p153l.vnb;

/* JADX INFO: loaded from: classes12.dex */
public class IntlVipNewCardPager extends FrameLayout implements ViewPager.InterfaceC0718j {

    /* JADX INFO: renamed from: a */
    public VFrame f37950a;

    /* JADX INFO: renamed from: b */
    public ViewPager f37951b;

    /* JADX INFO: renamed from: c */
    public ArrayList<PurchaseType> f37952c;

    /* JADX INFO: renamed from: d */
    public C9111a f37953d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.IntlVipNewCardPager$a */
    public static class C9111a extends lb2 {

        /* JADX INFO: renamed from: e */
        public PutongFrag f37954e;

        /* JADX INFO: renamed from: f */
        public ArrayList<PurchaseType> f37955f = new ArrayList<>();

        /* JADX INFO: renamed from: g */
        public int f37956g;

        @Override // p153l.cf60
        public int getCount() {
            return this.f37955f.size() * 100;
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
                ((IntlPrivilegeCard) obj).m57517s();
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
            m57530q(i);
            IntlPrivilegeCard intlPrivilegeCard = (IntlPrivilegeCard) this.f37954e.act().inflater().inflate(kec0.f125928l5, viewGroup, false);
            viewGroup.addView(intlPrivilegeCard);
            return intlPrivilegeCard;
        }

        /* JADX INFO: renamed from: q */
        public int m57530q(int i) {
            if (this.f37955f.size() == 0) {
                return 0;
            }
            return i % this.f37955f.size();
        }

        /* JADX INFO: renamed from: r */
        public void m57531r(int i) {
            this.f37956g = i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.IntlVipNewCardPager$b */
    public interface InterfaceC9112b {
    }

    public IntlVipNewCardPager(@NonNull Context context) {
        super(context);
        this.f37952c = new ArrayList<>();
        m57527d();
    }

    /* JADX INFO: renamed from: c */
    private void m57526c() {
        if (bnl0.m105588w0() <= 1280) {
            ViewGroup.LayoutParams layoutParams = this.f37951b.getLayoutParams();
            layoutParams.height = qa00.m175859d(vnb.m201953m1() * 100.0f);
            layoutParams.width = qa00.m175859d(vnb.m201953m1() * 340.0f);
            this.f37951b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m57527d() {
        addView(m57528b(p9r.m171370a(getContext()), this));
        this.f37951b.setOffscreenPageLimit(3);
        this.f37951b.setPageMargin(qa00.m175859d(3.0f));
        C9111a c9111a = new C9111a();
        this.f37953d = c9111a;
        this.f37951b.setAdapter(c9111a);
        this.f37951b.m4187d(this);
        setOnTouchListener(new View.OnTouchListener() { // from class: l.ump
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f179663a.m57529e(view, motionEvent);
            }
        });
        m57526c();
    }

    /* JADX INFO: renamed from: b */
    public View m57528b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vmp.m201763b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m57529e(View view, MotionEvent motionEvent) {
        return this.f37951b.dispatchTouchEvent(motionEvent);
    }

    public C9111a getAdapter() {
        return this.f37953d;
    }

    public int getPosition() {
        return this.f37953d.m57530q(this.f37951b.getCurrentItem());
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageScrolled(int i, float f, int i2) {
        this.f37950a.invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
    public void onPageSelected(int i) {
        boolean zM82486a = NullChecker.m82486a(null);
        C9111a c9111a = this.f37953d;
        if (zM82486a) {
            c9111a.m57530q(i);
            throw null;
        }
        c9111a.m57531r(i);
    }

    public void setCurrentItem(int i) {
        this.f37951b.setCurrentItem((this.f37952c.size() * 50) + i);
    }

    public void setOnPageChangeListener(InterfaceC9112b interfaceC9112b) {
    }

    public IntlVipNewCardPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37952c = new ArrayList<>();
        m57527d();
    }

    public IntlVipNewCardPager(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37952c = new ArrayList<>();
        m57527d();
    }
}
