package com.p046p1.mobile.putong.core.p053ui.vip.privilegeNewUi;

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
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p147v.VFrame;
import p149l.eb2;
import p149l.f6c0;
import p149l.hmb;
import p149l.o7r;
import p149l.t100;
import p149l.tjl0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class VipNewCardPager extends FrameLayout implements ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: a */
    public VFrame f37861a;

    /* JADX INFO: renamed from: b */
    public ViewPager f37862b;

    /* JADX INFO: renamed from: c */
    public ArrayList<PurchaseType> f37863c;

    /* JADX INFO: renamed from: d */
    public C9016a f37864d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.VipNewCardPager$a */
    public static class C9016a extends eb2 {

        /* JADX INFO: renamed from: e */
        public PutongFrag f37865e;

        /* JADX INFO: renamed from: f */
        public ArrayList<PurchaseType> f37866f = new ArrayList<>();

        /* JADX INFO: renamed from: g */
        public int f37867g;

        @Override // p149l.w660
        public int getCount() {
            return this.f37866f.size() * 100;
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: m */
        public void mo43284m(Object obj) {
            super.mo43284m(obj);
            if (obj instanceof IntlPrivilegeCard) {
                ((IntlPrivilegeCard) obj).m57484v();
            }
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            m57494q(i);
            IntlPrivilegeCard intlPrivilegeCard = (IntlPrivilegeCard) this.f37865e.act().inflater().inflate(f6c0.f96020tf, viewGroup, false);
            viewGroup.addView(intlPrivilegeCard);
            return intlPrivilegeCard;
        }

        /* JADX INFO: renamed from: q */
        public int m57494q(int i) {
            if (this.f37866f.size() == 0) {
                return 0;
            }
            return i % this.f37866f.size();
        }

        /* JADX INFO: renamed from: r */
        public void m57495r(int i) {
            this.f37867g = i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.VipNewCardPager$b */
    public interface InterfaceC9017b {
    }

    public VipNewCardPager(@NonNull Context context) {
        super(context);
        this.f37863c = new ArrayList<>();
        m57491d();
    }

    /* JADX INFO: renamed from: c */
    private void m57490c() {
        if (xdl0.m208408w0() <= 1280) {
            ViewGroup.LayoutParams layoutParams = this.f37862b.getLayoutParams();
            layoutParams.height = t100.m186890d(hmb.m131708m1() * 188.0f);
            layoutParams.width = t100.m186890d(hmb.m131708m1() * 340.0f);
            this.f37862b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m57491d() {
        addView(m57493b(o7r.m163037a(getContext()), this));
        this.f37862b.setOffscreenPageLimit(2);
        this.f37862b.setPageMargin(t100.m186890d(3.0f));
        C9016a c9016a = new C9016a();
        this.f37864d = c9016a;
        this.f37862b.setAdapter(c9016a);
        this.f37862b.m4185d(this);
        setOnTouchListener(new View.OnTouchListener() { // from class: l.sjl0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f164858a.m57492e(view, motionEvent);
            }
        });
        m57490c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean m57492e(View view, MotionEvent motionEvent) {
        return this.f37862b.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: b */
    public View m57493b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tjl0.m189346b(this, layoutInflater, viewGroup);
    }

    public C9016a getAdapter() {
        return this.f37864d;
    }

    public int getPosition() {
        return this.f37864d.m57494q(this.f37862b.getCurrentItem());
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
        this.f37861a.invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        boolean zM81303a = NullChecker.m81303a(null);
        C9016a c9016a = this.f37864d;
        if (zM81303a) {
            c9016a.m57494q(i);
            throw null;
        }
        c9016a.m57495r(i);
    }

    public void setCurrentItem(int i) {
        this.f37862b.setCurrentItem((this.f37863c.size() * 50) + i);
    }

    public void setOnPageChangeListener(InterfaceC9017b interfaceC9017b) {
    }

    public VipNewCardPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37863c = new ArrayList<>();
        m57491d();
    }

    public VipNewCardPager(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37863c = new ArrayList<>();
        m57491d();
    }
}
