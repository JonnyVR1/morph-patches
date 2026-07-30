package com.p046p1.mobile.putong.core.p053ui.vip.intlPrivilege;

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
import p149l.vkp;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class IntlVipNewCardPager extends FrameLayout implements ViewPager.InterfaceC0716j {

    /* JADX INFO: renamed from: a */
    public VFrame f37102a;

    /* JADX INFO: renamed from: b */
    public ViewPager f37103b;

    /* JADX INFO: renamed from: c */
    public ArrayList<PurchaseType> f37104c;

    /* JADX INFO: renamed from: d */
    public C8948a f37105d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.IntlVipNewCardPager$a */
    public static class C8948a extends eb2 {

        /* JADX INFO: renamed from: e */
        public PutongFrag f37106e;

        /* JADX INFO: renamed from: f */
        public ArrayList<PurchaseType> f37107f = new ArrayList<>();

        /* JADX INFO: renamed from: g */
        public int f37108g;

        @Override // p149l.w660
        public int getCount() {
            return this.f37107f.size() * 100;
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
                ((IntlPrivilegeCard) obj).m56334s();
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
            m56347q(i);
            IntlPrivilegeCard intlPrivilegeCard = (IntlPrivilegeCard) this.f37106e.act().inflater().inflate(f6c0.f95857k5, viewGroup, false);
            viewGroup.addView(intlPrivilegeCard);
            return intlPrivilegeCard;
        }

        /* JADX INFO: renamed from: q */
        public int m56347q(int i) {
            if (this.f37107f.size() == 0) {
                return 0;
            }
            return i % this.f37107f.size();
        }

        /* JADX INFO: renamed from: r */
        public void m56348r(int i) {
            this.f37108g = i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.IntlVipNewCardPager$b */
    public interface InterfaceC8949b {
    }

    public IntlVipNewCardPager(@NonNull Context context) {
        super(context);
        this.f37104c = new ArrayList<>();
        m56344d();
    }

    /* JADX INFO: renamed from: c */
    private void m56343c() {
        if (xdl0.m208408w0() <= 1280) {
            ViewGroup.LayoutParams layoutParams = this.f37103b.getLayoutParams();
            layoutParams.height = t100.m186890d(hmb.m131708m1() * 100.0f);
            layoutParams.width = t100.m186890d(hmb.m131708m1() * 340.0f);
            this.f37103b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m56344d() {
        addView(m56345b(o7r.m163037a(getContext()), this));
        this.f37103b.setOffscreenPageLimit(3);
        this.f37103b.setPageMargin(t100.m186890d(3.0f));
        C8948a c8948a = new C8948a();
        this.f37105d = c8948a;
        this.f37103b.setAdapter(c8948a);
        this.f37103b.m4185d(this);
        setOnTouchListener(new View.OnTouchListener() { // from class: l.ukp
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f176950a.m56346e(view, motionEvent);
            }
        });
        m56343c();
    }

    /* JADX INFO: renamed from: b */
    public View m56345b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vkp.m198750b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m56346e(View view, MotionEvent motionEvent) {
        return this.f37103b.dispatchTouchEvent(motionEvent);
    }

    public C8948a getAdapter() {
        return this.f37105d;
    }

    public int getPosition() {
        return this.f37105d.m56347q(this.f37103b.getCurrentItem());
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrollStateChanged(int i) {
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageScrolled(int i, float f, int i2) {
        this.f37102a.invalidate();
    }

    @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
    public void onPageSelected(int i) {
        boolean zM81303a = NullChecker.m81303a(null);
        C8948a c8948a = this.f37105d;
        if (zM81303a) {
            c8948a.m56347q(i);
            throw null;
        }
        c8948a.m56348r(i);
    }

    public void setCurrentItem(int i) {
        this.f37103b.setCurrentItem((this.f37104c.size() * 50) + i);
    }

    public void setOnPageChangeListener(InterfaceC8949b interfaceC8949b) {
    }

    public IntlVipNewCardPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37104c = new ArrayList<>();
        m56344d();
    }

    public IntlVipNewCardPager(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37104c = new ArrayList<>();
        m56344d();
    }
}
