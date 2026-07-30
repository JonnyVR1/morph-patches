package com.p000p1.mobile.putong.core.p004ui.vip.intlPrivilege;

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
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.eb2;
import l.hmb;
import l.o7r;
import l.t100;
import l.vkp;
import l.xdl0;
import p006l.f6c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class IntlVipNewCardPager extends FrameLayout implements ViewPager.j {

    /* JADX INFO: renamed from: a */
    public VFrame f6883a;

    /* JADX INFO: renamed from: b */
    public ViewPager f6884b;

    /* JADX INFO: renamed from: c */
    public ArrayList<PurchaseType> f6885c;

    /* JADX INFO: renamed from: d */
    public C0384a f6886d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.IntlVipNewCardPager$a */
    public static class C0384a extends eb2 {

        /* JADX INFO: renamed from: e */
        public PutongFrag f6887e;

        /* JADX INFO: renamed from: f */
        public ArrayList<PurchaseType> f6888f = new ArrayList<>();

        /* JADX INFO: renamed from: g */
        public int f6889g;

        public int getCount() {
            return this.f6888f.size() * 100;
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: m */
        public void m9781m(Object obj) {
            super.m(obj);
            if (obj instanceof IntlPrivilegeCard) {
                ((IntlPrivilegeCard) obj).m9768s();
            }
        }

        /* JADX INFO: renamed from: o */
        public void m9782o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        /* JADX INFO: renamed from: p */
        public Object m9783p(ViewGroup viewGroup, int i) {
            m9784q(i);
            IntlPrivilegeCard intlPrivilegeCard = (IntlPrivilegeCard) this.f6887e.act().inflater().inflate(f6c0.f12271k5, viewGroup, false);
            viewGroup.addView(intlPrivilegeCard);
            return intlPrivilegeCard;
        }

        /* JADX INFO: renamed from: q */
        public int m9784q(int i) {
            if (this.f6888f.size() == 0) {
                return 0;
            }
            return i % this.f6888f.size();
        }

        /* JADX INFO: renamed from: r */
        public void m9785r(int i) {
            this.f6889g = i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.intlPrivilege.IntlVipNewCardPager$b */
    public interface InterfaceC0385b {
    }

    public IntlVipNewCardPager(@NonNull Context context) {
        super(context);
        this.f6885c = new ArrayList<>();
        m9778d();
    }

    /* JADX INFO: renamed from: c */
    private void m9777c() {
        if (xdl0.w0() <= 1280) {
            ViewGroup.LayoutParams layoutParams = this.f6884b.getLayoutParams();
            layoutParams.height = t100.d(hmb.m1() * 100.0f);
            layoutParams.width = t100.d(hmb.m1() * 340.0f);
            this.f6884b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m9778d() {
        addView(m9779b(o7r.a(getContext()), this));
        this.f6884b.setOffscreenPageLimit(3);
        this.f6884b.setPageMargin(t100.d(3.0f));
        C0384a c0384a = new C0384a();
        this.f6886d = c0384a;
        this.f6884b.setAdapter(c0384a);
        this.f6884b.d(this);
        setOnTouchListener(new View.OnTouchListener() { // from class: l.ukp
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f23592a.m9780e(view, motionEvent);
            }
        });
        m9777c();
    }

    /* JADX INFO: renamed from: b */
    public View m9779b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return vkp.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ boolean m9780e(View view, MotionEvent motionEvent) {
        return this.f6884b.dispatchTouchEvent(motionEvent);
    }

    public C0384a getAdapter() {
        return this.f6886d;
    }

    public int getPosition() {
        return this.f6886d.m9784q(this.f6884b.getCurrentItem());
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.f6883a.invalidate();
    }

    public void onPageSelected(int i) {
        boolean zA = NullChecker.a((Object) null);
        C0384a c0384a = this.f6886d;
        if (zA) {
            c0384a.m9784q(i);
            throw null;
        }
        c0384a.m9785r(i);
    }

    public void setCurrentItem(int i) {
        this.f6884b.setCurrentItem((this.f6885c.size() * 50) + i);
    }

    public void setOnPageChangeListener(InterfaceC0385b interfaceC0385b) {
    }

    public IntlVipNewCardPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6885c = new ArrayList<>();
        m9778d();
    }

    public IntlVipNewCardPager(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6885c = new ArrayList<>();
        m9778d();
    }
}
