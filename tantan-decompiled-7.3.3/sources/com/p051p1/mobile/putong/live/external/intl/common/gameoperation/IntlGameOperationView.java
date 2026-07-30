package com.p051p1.mobile.putong.live.external.intl.common.gameoperation;

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
import com.p051p1.mobile.putong.live.base.data.BLiveGameOperationConfig;
import com.p051p1.mobile.putong.live.base.data.BLiveGameOperationRedDot;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VPager;
import p153l.bnl0;
import p153l.fm3;
import p153l.iam;
import p153l.itd0;
import p153l.jyb;
import p153l.lkn;
import p153l.qa00;
import p153l.qnp0;
import p153l.rkn;
import p153l.tbs;
import p153l.vkn;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class IntlGameOperationView extends RelativeLayout implements iam<rkn> {

    /* JADX INFO: renamed from: a */
    public VPager f46400a;

    /* JADX INFO: renamed from: b */
    public VImage f46401b;

    /* JADX INFO: renamed from: c */
    public rkn f46402c;

    /* JADX INFO: renamed from: d */
    public final List<BLiveGameOperationConfig> f46403d;

    /* JADX INFO: renamed from: e */
    public lkn f46404e;

    /* JADX INFO: renamed from: f */
    public int f46405f;

    /* JADX INFO: renamed from: g */
    public final Runnable f46406g;

    /* JADX INFO: renamed from: h */
    public final Handler f46407h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.intl.common.gameoperation.IntlGameOperationView$a */
    public class C12701a implements ViewPager.InterfaceC0718j {
        public C12701a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            if (i != 0) {
                return;
            }
            int i2 = IntlGameOperationView.this.f46405f;
            IntlGameOperationView intlGameOperationView = IntlGameOperationView.this;
            if (i2 == 0) {
                intlGameOperationView.f46400a.m4178T(intlGameOperationView.f46403d.size() - 2, false);
            } else if (intlGameOperationView.f46405f == IntlGameOperationView.this.f46403d.size() - 1) {
                IntlGameOperationView.this.f46400a.m4178T(1, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            IntlGameOperationView.this.m71132m();
            if (IntlGameOperationView.this.f46403d.size() <= 1) {
                return;
            }
            IntlGameOperationView.this.f46405f = i;
            IntlGameOperationView.this.m71128s();
        }
    }

    public IntlGameOperationView(Context context) {
        super(context);
        this.f46403d = new ArrayList();
        this.f46406g = new Runnable() { // from class: l.skn
            @Override // java.lang.Runnable
            public final void run() {
                this.f169309a.m71126n();
            }
        };
        this.f46407h = new Handler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m71126n() {
        VPager vPager = this.f46400a;
        vPager.setCurrentItem(vPager.getCurrentItem() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ boolean m71127q(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                }
            }
            m71128s();
            return false;
        }
        this.f46407h.removeCallbacks(this.f46406g);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public void m71128s() {
        if (jyb.m147479J(this.f46403d) || this.f46403d.size() <= this.f46400a.getCurrentItem()) {
            return;
        }
        int i = this.f46403d.get(this.f46400a.getCurrentItem()).durTimeSec;
        if (i <= 0) {
            i = 10;
        }
        this.f46407h.removeCallbacks(this.f46406g);
        this.f46407h.postDelayed(this.f46406g, i * 1000);
    }

    private void setViewPager(List<BLiveGameOperationConfig> list) {
        if (this.f46404e == null) {
            lkn lknVar = new lkn(new y20() { // from class: l.tkn
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f174732a.m71133p((BLiveGameOperationConfig) obj);
                }
            });
            this.f46404e = lknVar;
            this.f46400a.setAdapter(lknVar);
        }
        if (list.size() > 1) {
            m71129v();
            this.f46403d.clear();
            this.f46403d.add(list.get(list.size() - 1));
            this.f46403d.addAll(list);
            this.f46403d.add(list.get(0));
        } else {
            this.f46407h.removeCallbacks(this.f46406g);
            this.f46400a.m4191i();
            this.f46400a.setOnTouchListener(null);
            this.f46403d.clear();
            this.f46403d.addAll(list);
        }
        this.f46400a.setOffscreenPageLimit(1);
        this.f46404e.m154648q(this.f46403d);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: v */
    private void m71129v() {
        this.f46400a.m4187d(new C12701a());
        this.f46400a.setOnTouchListener(new View.OnTouchListener() { // from class: l.ukn
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f179440a.m71127q(view, motionEvent);
            }
        });
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public void destroy() {
        bnl0.m105524M(this, false);
        this.f46407h.removeCallbacks(this.f46406g);
        this.f46400a.setOnTouchListener(null);
        this.f46400a.m4191i();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: k */
    public final void m71130k(View view) {
        vkn.m201574a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(rkn rknVar) {
        this.f46402c = rknVar;
    }

    /* JADX INFO: renamed from: m */
    public final void m71132m() {
        if (jyb.m147479J(this.f46403d) || this.f46400a.getCurrentItem() >= this.f46403d.size()) {
            bnl0.m105524M(this.f46401b, false);
            return;
        }
        BLiveGameOperationConfig bLiveGameOperationConfig = this.f46403d.get(this.f46400a.getCurrentItem());
        if (!NullChecker.m82486a(bLiveGameOperationConfig) || TextUtils.isEmpty(bLiveGameOperationConfig.promptMethod)) {
            bnl0.m105524M(this.f46401b, false);
            return;
        }
        BLiveGameOperationRedDot bLiveGameOperationRedDot = ((fm3) tbs.m190077m(itd0.f116823e)).f99720j.get();
        if (bLiveGameOperationRedDot == null || !bLiveGameOperationRedDot.data.contains(bLiveGameOperationConfig.alias)) {
            bnl0.m105524M(this.f46401b, true);
        } else {
            bnl0.m105524M(this.f46401b, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m71130k(this);
        qnp0.m177260c1(this.f46400a, 0, 0, 0, 0, qa00.m175859d(12.0f));
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m71133p(BLiveGameOperationConfig bLiveGameOperationConfig) {
        if (TextUtils.isEmpty(bLiveGameOperationConfig.url)) {
            return;
        }
        bnl0.m105524M(this.f46401b, false);
        if (!TextUtils.isEmpty(bLiveGameOperationConfig.promptMethod)) {
            itd0<fm3> itd0Var = itd0.f116823e;
            BLiveGameOperationRedDot bLiveGameOperationRedDotNew_ = ((fm3) tbs.m190077m(itd0Var)).f99720j.get();
            if (bLiveGameOperationRedDotNew_ == null) {
                bLiveGameOperationRedDotNew_ = BLiveGameOperationRedDot.new_();
            }
            if (!bLiveGameOperationRedDotNew_.data.contains(bLiveGameOperationConfig.alias)) {
                bLiveGameOperationRedDotNew_.data.add(bLiveGameOperationConfig.alias);
                ((fm3) tbs.m190077m(itd0Var)).f99720j.put(bLiveGameOperationRedDotNew_);
            }
        }
        this.f46402c.m181872Y2(bLiveGameOperationConfig);
    }

    /* JADX INFO: renamed from: u */
    public void m71134u(List<BLiveGameOperationConfig> list) {
        if (jyb.m147479J(list)) {
            bnl0.m105524M(this, false);
            this.f46407h.removeCallbacks(this.f46406g);
            List<BLiveGameOperationConfig> list2 = this.f46403d;
            if (list2 != null) {
                list2.clear();
                return;
            }
            return;
        }
        bnl0.m105524M(this, true);
        setViewPager(list);
        m71135w();
        int size = this.f46403d.size();
        VPager vPager = this.f46400a;
        if (size > 1) {
            vPager.setCurrentItem(1);
        } else {
            vPager.setCurrentItem(0);
        }
        m71132m();
    }

    /* JADX INFO: renamed from: w */
    public final void m71135w() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = qa00.m175859d(70.0f);
        layoutParams.height = qa00.m175859d(70.0f);
        setLayoutParams(layoutParams);
    }

    public IntlGameOperationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f46403d = new ArrayList();
        this.f46406g = new Runnable() { // from class: l.skn
            @Override // java.lang.Runnable
            public final void run() {
                this.f169309a.m71126n();
            }
        };
        this.f46407h = new Handler();
    }

    public IntlGameOperationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f46403d = new ArrayList();
        this.f46406g = new Runnable() { // from class: l.skn
            @Override // java.lang.Runnable
            public final void run() {
                this.f169309a.m71126n();
            }
        };
        this.f46407h = new Handler();
    }
}
