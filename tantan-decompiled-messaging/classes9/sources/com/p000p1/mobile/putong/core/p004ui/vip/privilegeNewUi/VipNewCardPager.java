package com.p000p1.mobile.putong.core.p004ui.vip.privilegeNewUi;

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
import l.tjl0;
import l.xdl0;
import p006l.f6c0;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VipNewCardPager extends FrameLayout implements ViewPager.j {

    /* JADX INFO: renamed from: a */
    public VFrame f7642a;

    /* JADX INFO: renamed from: b */
    public ViewPager f7643b;

    /* JADX INFO: renamed from: c */
    public ArrayList<PurchaseType> f7644c;

    /* JADX INFO: renamed from: d */
    public C0452a f7645d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.VipNewCardPager$a */
    public static class C0452a extends eb2 {

        /* JADX INFO: renamed from: e */
        public PutongFrag f7646e;

        /* JADX INFO: renamed from: f */
        public ArrayList<PurchaseType> f7647f = new ArrayList<>();

        /* JADX INFO: renamed from: g */
        public int f7648g;

        public int getCount() {
            return this.f7647f.size() * 100;
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: m */
        public void m10982m(Object obj) {
            super.m(obj);
            if (obj instanceof IntlPrivilegeCard) {
                ((IntlPrivilegeCard) obj).m10972v();
            }
        }

        /* JADX INFO: renamed from: o */
        public void m10983o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        /* JADX INFO: renamed from: p */
        public Object m10984p(ViewGroup viewGroup, int i) {
            m10985q(i);
            IntlPrivilegeCard intlPrivilegeCard = (IntlPrivilegeCard) this.f7646e.act().inflater().inflate(f6c0.f12434tf, viewGroup, false);
            viewGroup.addView(intlPrivilegeCard);
            return intlPrivilegeCard;
        }

        /* JADX INFO: renamed from: q */
        public int m10985q(int i) {
            if (this.f7647f.size() == 0) {
                return 0;
            }
            return i % this.f7647f.size();
        }

        /* JADX INFO: renamed from: r */
        public void m10986r(int i) {
            this.f7648g = i;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilegeNewUi.VipNewCardPager$b */
    public interface InterfaceC0453b {
    }

    public VipNewCardPager(@NonNull Context context) {
        super(context);
        this.f7644c = new ArrayList<>();
        m10979d();
    }

    /* JADX INFO: renamed from: c */
    private void m10978c() {
        if (xdl0.w0() <= 1280) {
            ViewGroup.LayoutParams layoutParams = this.f7643b.getLayoutParams();
            layoutParams.height = t100.d(hmb.m1() * 188.0f);
            layoutParams.width = t100.d(hmb.m1() * 340.0f);
            this.f7643b.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: d */
    private void m10979d() {
        addView(m10981b(o7r.a(getContext()), this));
        this.f7643b.setOffscreenPageLimit(2);
        this.f7643b.setPageMargin(t100.d(3.0f));
        C0452a c0452a = new C0452a();
        this.f7645d = c0452a;
        this.f7643b.setAdapter(c0452a);
        this.f7643b.d(this);
        setOnTouchListener(new View.OnTouchListener() { // from class: l.sjl0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f21366a.m10980e(view, motionEvent);
            }
        });
        m10978c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e */
    public /* synthetic */ boolean m10980e(View view, MotionEvent motionEvent) {
        return this.f7643b.dispatchTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: b */
    public View m10981b(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return tjl0.b(this, layoutInflater, viewGroup);
    }

    public C0452a getAdapter() {
        return this.f7645d;
    }

    public int getPosition() {
        return this.f7645d.m10985q(this.f7643b.getCurrentItem());
    }

    public void onPageScrollStateChanged(int i) {
    }

    public void onPageScrolled(int i, float f, int i2) {
        this.f7642a.invalidate();
    }

    public void onPageSelected(int i) {
        boolean zA = NullChecker.a((Object) null);
        C0452a c0452a = this.f7645d;
        if (zA) {
            c0452a.m10985q(i);
            throw null;
        }
        c0452a.m10986r(i);
    }

    public void setCurrentItem(int i) {
        this.f7643b.setCurrentItem((this.f7644c.size() * 50) + i);
    }

    public void setOnPageChangeListener(InterfaceC0453b interfaceC0453b) {
    }

    public VipNewCardPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7644c = new ArrayList<>();
        m10979d();
    }

    public VipNewCardPager(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7644c = new ArrayList<>();
        m10979d();
    }
}
