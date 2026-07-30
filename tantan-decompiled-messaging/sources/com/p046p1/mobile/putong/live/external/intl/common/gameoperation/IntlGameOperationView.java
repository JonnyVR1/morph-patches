package com.p046p1.mobile.putong.live.external.intl.common.gameoperation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.putong.live.base.data.BLiveGameOperationConfig;
import com.p046p1.mobile.putong.live.base.data.BLiveGameOperationRedDot;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VPager;
import p149l.e30;
import p149l.gl3;
import p149l.gld0;
import p149l.lin;
import p149l.mep0;
import p149l.rin;
import p149l.s7m;
import p149l.s9s;
import p149l.t100;
import p149l.vin;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes13.dex */
public class IntlGameOperationView extends RelativeLayout implements s7m<rin> {

    /* JADX INFO: renamed from: a */
    public VPager f45552a;

    /* JADX INFO: renamed from: b */
    public VImage f45553b;

    /* JADX INFO: renamed from: c */
    public rin f45554c;

    /* JADX INFO: renamed from: d */
    public final List<BLiveGameOperationConfig> f45555d;

    /* JADX INFO: renamed from: e */
    public lin f45556e;

    /* JADX INFO: renamed from: f */
    public int f45557f;

    /* JADX INFO: renamed from: g */
    public final Runnable f45558g;

    /* JADX INFO: renamed from: h */
    public final Handler f45559h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationView$a */
    public class C12538a implements ViewPager.InterfaceC0716j {
        public C12538a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            if (i != 0) {
                return;
            }
            int i2 = IntlGameOperationView.this.f45557f;
            IntlGameOperationView intlGameOperationView = IntlGameOperationView.this;
            if (i2 == 0) {
                intlGameOperationView.f45552a.m4176T(intlGameOperationView.f45555d.size() - 2, false);
            } else if (intlGameOperationView.f45557f == IntlGameOperationView.this.f45555d.size() - 1) {
                IntlGameOperationView.this.f45552a.m4176T(1, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            IntlGameOperationView.this.m69949m();
            if (IntlGameOperationView.this.f45555d.size() <= 1) {
                return;
            }
            IntlGameOperationView.this.f45557f = i;
            IntlGameOperationView.this.m69945s();
        }
    }

    public IntlGameOperationView(Context context) {
        super(context);
        this.f45555d = new ArrayList();
        this.f45558g = new Runnable() { // from class: l.sin
            @Override // java.lang.Runnable
            public final void run() {
                this.f164725a.m69943n();
            }
        };
        this.f45559h = new Handler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m69943n() {
        VPager vPager = this.f45552a;
        vPager.setCurrentItem(vPager.getCurrentItem() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ boolean m69944q(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                }
            }
            m69945s();
            return false;
        }
        this.f45559h.removeCallbacks(this.f45558g);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m69945s() {
        if (vwb.m200296J(this.f45555d) || this.f45555d.size() <= this.f45552a.getCurrentItem()) {
            return;
        }
        int i = this.f45555d.get(this.f45552a.getCurrentItem()).durTimeSec;
        if (i <= 0) {
            i = 10;
        }
        this.f45559h.removeCallbacks(this.f45558g);
        this.f45559h.postDelayed(this.f45558g, i * 1000);
    }

    private void setViewPager(List<BLiveGameOperationConfig> list) {
        if (this.f45556e == null) {
            lin linVar = new lin(new e30() { // from class: l.tin
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f170596a.m69950p((BLiveGameOperationConfig) obj);
                }
            });
            this.f45556e = linVar;
            this.f45552a.setAdapter(linVar);
        }
        if (list.size() > 1) {
            m69946v();
            this.f45555d.clear();
            this.f45555d.add(list.get(list.size() - 1));
            this.f45555d.addAll(list);
            this.f45555d.add(list.get(0));
        } else {
            this.f45559h.removeCallbacks(this.f45558g);
            this.f45552a.m4189i();
            this.f45552a.setOnTouchListener(null);
            this.f45555d.clear();
            this.f45555d.addAll(list);
        }
        this.f45552a.setOffscreenPageLimit(1);
        this.f45556e.m149920q(this.f45555d);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: v */
    private void m69946v() {
        this.f45552a.m4185d(new C12538a());
        this.f45552a.setOnTouchListener(new View.OnTouchListener() { // from class: l.uin
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f176662a.m69944q(view, motionEvent);
            }
        });
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
        xdl0.m208344M(this, false);
        this.f45559h.removeCallbacks(this.f45558g);
        this.f45552a.setOnTouchListener(null);
        this.f45552a.m4189i();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m69947k(View view) {
        vin.m198586a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rin rinVar) {
        this.f45554c = rinVar;
    }

    /* JADX INFO: renamed from: m */
    public final void m69949m() {
        if (vwb.m200296J(this.f45555d) || this.f45552a.getCurrentItem() >= this.f45555d.size()) {
            xdl0.m208344M(this.f45553b, false);
            return;
        }
        BLiveGameOperationConfig bLiveGameOperationConfig = this.f45555d.get(this.f45552a.getCurrentItem());
        if (!NullChecker.m81303a(bLiveGameOperationConfig) || TextUtils.isEmpty(bLiveGameOperationConfig.promptMethod)) {
            xdl0.m208344M(this.f45553b, false);
            return;
        }
        BLiveGameOperationRedDot bLiveGameOperationRedDot = ((gl3) s9s.m182763m(gld0.f103315e)).f103289j.get();
        if (bLiveGameOperationRedDot == null || !bLiveGameOperationRedDot.data.contains(bLiveGameOperationConfig.alias)) {
            xdl0.m208344M(this.f45553b, true);
        } else {
            xdl0.m208344M(this.f45553b, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69947k(this);
        mep0.m154301c1(this.f45552a, 0, 0, 0, 0, t100.m186890d(12.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m69950p(BLiveGameOperationConfig bLiveGameOperationConfig) {
        if (TextUtils.isEmpty(bLiveGameOperationConfig.url)) {
            return;
        }
        xdl0.m208344M(this.f45553b, false);
        if (!TextUtils.isEmpty(bLiveGameOperationConfig.promptMethod)) {
            gld0<gl3> gld0Var = gld0.f103315e;
            BLiveGameOperationRedDot bLiveGameOperationRedDotNew_ = ((gl3) s9s.m182763m(gld0Var)).f103289j.get();
            if (bLiveGameOperationRedDotNew_ == null) {
                bLiveGameOperationRedDotNew_ = BLiveGameOperationRedDot.new_();
            }
            if (!bLiveGameOperationRedDotNew_.data.contains(bLiveGameOperationConfig.alias)) {
                bLiveGameOperationRedDotNew_.data.add(bLiveGameOperationConfig.alias);
                ((gl3) s9s.m182763m(gld0Var)).f103289j.put(bLiveGameOperationRedDotNew_);
            }
        }
        this.f45554c.m179527Y2(bLiveGameOperationConfig);
    }

    /* JADX INFO: renamed from: u */
    public void m69951u(List<BLiveGameOperationConfig> list) {
        if (vwb.m200296J(list)) {
            xdl0.m208344M(this, false);
            this.f45559h.removeCallbacks(this.f45558g);
            List<BLiveGameOperationConfig> list2 = this.f45555d;
            if (list2 != null) {
                list2.clear();
                return;
            }
            return;
        }
        xdl0.m208344M(this, true);
        setViewPager(list);
        m69952w();
        int size = this.f45555d.size();
        VPager vPager = this.f45552a;
        if (size > 1) {
            vPager.setCurrentItem(1);
        } else {
            vPager.setCurrentItem(0);
        }
        m69949m();
    }

    /* JADX INFO: renamed from: w */
    public final void m69952w() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = t100.m186890d(70.0f);
        layoutParams.height = t100.m186890d(70.0f);
        setLayoutParams(layoutParams);
    }

    public IntlGameOperationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45555d = new ArrayList();
        this.f45558g = new Runnable() { // from class: l.sin
            @Override // java.lang.Runnable
            public final void run() {
                this.f164725a.m69943n();
            }
        };
        this.f45559h = new Handler();
    }

    public IntlGameOperationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45555d = new ArrayList();
        this.f45558g = new Runnable() { // from class: l.sin
            @Override // java.lang.Runnable
            public final void run() {
                this.f164725a.m69943n();
            }
        };
        this.f45559h = new Handler();
    }
}
