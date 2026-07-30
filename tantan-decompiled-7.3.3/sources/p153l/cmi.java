package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.p058ui.messages.media.widget.FilterScrollMoreViewPager;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarOpt;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class cmi {

    /* JADX INFO: renamed from: a */
    public FilterScrollMoreViewPager f82599a;

    /* JADX INFO: renamed from: b */
    public ValueAnimator f82600b;

    /* JADX INFO: renamed from: e */
    public Animator f82603e;

    /* JADX INFO: renamed from: f */
    public TextView f82604f;

    /* JADX INFO: renamed from: g */
    public List<MMPresetFilter> f82605g;

    /* JADX INFO: renamed from: j */
    public xvx f82608j;

    /* JADX INFO: renamed from: k */
    public azy f82609k;

    /* JADX INFO: renamed from: l */
    public kcg0 f82610l;

    /* JADX INFO: renamed from: c */
    public int f82601c = 0;

    /* JADX INFO: renamed from: d */
    public float f82602d = 0.0f;

    /* JADX INFO: renamed from: h */
    public List<MMPresetFilter> f82606h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public volatile boolean f82607i = false;

    /* JADX INFO: renamed from: m */
    public volatile boolean f82611m = false;

    /* JADX INFO: renamed from: n */
    public final y20<List<MMPresetFilter>> f82612n = new y20() { // from class: l.wli
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f189695a.m111277w((List) obj);
        }
    };

    /* JADX INFO: renamed from: l.cmi$a */
    public class C16313a implements FilterScrollMoreViewPager.InterfaceC8696c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f82613a;

        public C16313a(boolean z) {
            this.f82613a = z;
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC8696c
        /* JADX INFO: renamed from: a */
        public boolean mo50387a() {
            return this.f82613a;
        }
    }

    /* JADX INFO: renamed from: l.cmi$c */
    public class C16315c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f82617a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f82618b;

        public C16315c(int i, boolean z) {
            this.f82617a = i;
            this.f82618b = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            cmi.this.m111263A(this.f82617a, this.f82618b);
            cmi.this.f82602d = 0.0f;
        }
    }

    public cmi(MessageBarOpt messageBarOpt, xvx xvxVar, azy azyVar) {
        this.f82608j = xvxVar;
        this.f82609k = azyVar;
        m111273s(messageBarOpt);
    }

    /* JADX INFO: renamed from: A */
    public final void m111263A(int i, boolean z) {
        if (this.f82605g.size() <= i || i < 0) {
            return;
        }
        boolean z2 = this.f82601c != i;
        this.f82601c = i;
        this.f82608j.m213263b(i, true, 0.0f);
        if (z2) {
            m111265C(z);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m111264B(boolean z) {
        this.f82599a.setOnIntercept(new C16313a(z));
    }

    /* JADX INFO: renamed from: C */
    public final void m111265C(boolean z) {
        String filterName = this.f82605g.get(this.f82601c).getFilterName();
        if (TextUtils.isEmpty(filterName)) {
            return;
        }
        this.f82604f.setText(filterName);
        m111266D(z);
    }

    /* JADX INFO: renamed from: D */
    public final void m111266D(boolean z) {
        gt0.m132159e(this.f82604f);
        if (NullChecker.m82486a(this.f82603e)) {
            this.f82603e.cancel();
        }
        Animator animatorM132170p = gt0.m132170p(this.f82604f, "translationX", 0L, 300L, gt0.f106346a, z ? -100.0f : 100.0f, 0.0f);
        TextView textView = this.f82604f;
        Interpolator interpolator = gt0.f106349d;
        Animator animatorM132180z = gt0.m132180z(animatorM132170p, gt0.m132170p(textView, "alpha", 0L, 300L, interpolator, 0.0f, 1.2f), gt0.m132170p(this.f82604f, "alpha", 1800L, 600L, interpolator, 1.2f, 0.0f));
        this.f82603e = animatorM132180z;
        gt0.m132176v(animatorM132180z, new Runnable() { // from class: l.ami
            @Override // java.lang.Runnable
            public final void run() {
                this.f72225a.m111278x();
            }
        });
        gt0.m132160f(this.f82603e, new Runnable() { // from class: l.bmi
            @Override // java.lang.Runnable
            public final void run() {
                this.f77306a.m111279y();
            }
        });
        this.f82603e.start();
    }

    /* JADX INFO: renamed from: E */
    public final void m111267E(boolean z, float f) {
        int i = this.f82601c;
        float f2 = z ? -f : 1.0f - f;
        this.f82602d = f2;
        this.f82608j.m213263b(i, z, f2);
    }

    /* JADX INFO: renamed from: F */
    public final void m111268F(final boolean z, boolean z2, boolean z3, long j) {
        final int size = this.f82605g.size();
        if (size == 0) {
            return;
        }
        int i = this.f82601c;
        int i2 = (z ? -1 : 1) + i;
        if (z3) {
            i2 = i;
        }
        if (i2 < 0) {
            i2 = size - 1;
        } else if (i2 >= size) {
            size = i;
            i2 = 0;
        } else {
            size = i;
        }
        if (!z2) {
            m111263A(i2, z);
            return;
        }
        int i3 = z3 ? z ? 1 : 0 : !z;
        if (NullChecker.m82486a(this.f82600b) && this.f82600b.isRunning()) {
            this.f82600b.cancel();
        }
        if (this.f82600b == null) {
            this.f82600b = new ValueAnimator();
        }
        this.f82600b.setDuration(j);
        this.f82600b.setFloatValues(this.f82602d, i3);
        this.f82600b.removeAllUpdateListeners();
        this.f82600b.removeAllListeners();
        this.f82600b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zli
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f204925a.m111280z(size, z, valueAnimator);
            }
        });
        this.f82600b.addListener(new C16315c(i2, z));
        this.f82600b.start();
    }

    /* JADX INFO: renamed from: o */
    public void m111269o() {
        CoreModule.m30932N().mo61557n(this.f82612n);
    }

    /* JADX INFO: renamed from: p */
    public void m111270p() {
        this.f82611m = true;
        psd0.m173633z(this.f82610l);
    }

    /* JADX INFO: renamed from: q */
    public final List<MMPresetFilter> m111271q(List<MMPresetFilter> list) {
        this.f82605g.clear();
        for (String str : CoreModule.m30933P().m143412i().mo180311D2().split("_")) {
            for (MMPresetFilter mMPresetFilter : list) {
                if (str.equals(mMPresetFilter.getmFilterId())) {
                    boolean zEquals = "0".equals(str);
                    List<MMPresetFilter> list2 = this.f82605g;
                    if (zEquals) {
                        list2.add(0, mMPresetFilter);
                    } else {
                        list2.add(mMPresetFilter);
                    }
                }
            }
        }
        return this.f82605g;
    }

    /* JADX INFO: renamed from: r */
    public String m111272r() {
        List<MMPresetFilter> list = this.f82606h;
        if (list == null) {
            return "0";
        }
        int size = list.size();
        int i = this.f82601c;
        return size > i ? this.f82606h.get(i).getmFilterId() : "0";
    }

    /* JADX INFO: renamed from: s */
    public final void m111273s(MessageBarOpt messageBarOpt) {
        this.f82599a = messageBarOpt.getFilterView();
        this.f82604f = messageBarOpt.getFilterNameView();
        this.f82605g = new ArrayList();
        m111269o();
        final kd4 kd4Var = new kd4(this.f82608j);
        this.f82599a.setBeforeCheckEnableTouchListener(new FilterScrollMoreViewPager.InterfaceC8695b() { // from class: l.yli
            @Override // com.p051p1.mobile.putong.core.p058ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC8695b
            /* JADX INFO: renamed from: a */
            public final boolean mo50386a(MotionEvent motionEvent) {
                return kd4Var.m149173a(motionEvent);
            }
        });
        this.f82599a.setOnVerticalFlingListener(new C16314b());
    }

    /* JADX INFO: renamed from: t */
    public void m111274t(List<MMPresetFilter> list) {
        if (list == null || list.size() <= 1) {
            return;
        }
        this.f82608j.m213268g(list);
        this.f82608j.m213263b(this.f82601c, true, 0.0f);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m111275u() {
        ValueAnimator valueAnimator = this.f82600b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m111276v(uxj0 uxj0Var) {
        if (this.f82607i) {
            return;
        }
        this.f82607i = true;
        m111269o();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m111277w(List list) {
        if (this.f82611m) {
            return;
        }
        this.f82606h = list;
        if (list == null || list.size() <= 1) {
            this.f82610l = CoreModule.m30932N().filter().subscribe(psd0.m173596G(new y20() { // from class: l.xli
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f194972a.m111276v((uxj0) obj);
                }
            }));
        } else {
            m111274t(m111271q(this.f82606h));
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m111278x() {
        this.f82604f.setScaleY(1.6f);
        this.f82604f.setScaleX(1.6f);
        this.f82604f.setVisibility(0);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m111279y() {
        this.f82603e = null;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m111280z(int i, boolean z, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue >= 1.0f || fFloatValue <= 0.0f) {
            return;
        }
        this.f82608j.m213263b(i, !z, fFloatValue);
    }

    /* JADX INFO: renamed from: l.cmi$b */
    public class C16314b implements FilterScrollMoreViewPager.InterfaceC8697d {

        /* JADX INFO: renamed from: a */
        public boolean f82615a = false;

        public C16314b() {
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC8697d
        /* JADX INFO: renamed from: a */
        public void mo50388a(float f) {
            if (cmi.this.f82608j.m213270i() || cmi.this.m111275u()) {
                return;
            }
            boolean z = f < 0.0f;
            this.f82615a = z;
            cmi.this.m111267E(z, f);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC8697d
        /* JADX INFO: renamed from: b */
        public void mo50389b(float f) {
            if (cmi.this.f82608j.m213270i() || cmi.this.m111275u() || cmi.this.f82602d == 0.0f) {
                return;
            }
            cmi.this.m111268F(f > 0.0f, true, false, 200L);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC8697d
        /* JADX INFO: renamed from: d */
        public void mo50391d() {
            cmi.this.f82609k.m101175G0();
            cmi.this.f82609k.m101188O();
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC8697d
        public void onCancel() {
            if (cmi.this.f82608j.m213270i() || cmi.this.m111275u() || cmi.this.f82602d == 0.0f) {
                return;
            }
            cmi.this.m111268F(!this.f82615a, true, true, 200L);
        }

        @Override // com.p051p1.mobile.putong.core.p058ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC8697d
        /* JADX INFO: renamed from: c */
        public void mo50390c(boolean z) {
        }
    }
}
