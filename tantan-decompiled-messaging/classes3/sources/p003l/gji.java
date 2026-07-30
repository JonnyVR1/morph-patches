package p003l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p000p1.mobile.putong.core.p001ui.messages.media.widget.FilterScrollMoreViewPager;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarOpt;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.bt0;
import l.mkd0;
import l.roj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class gji {

    /* JADX INFO: renamed from: a */
    public FilterScrollMoreViewPager f3900a;

    /* JADX INFO: renamed from: b */
    public ValueAnimator f3901b;

    /* JADX INFO: renamed from: e */
    public Animator f3904e;

    /* JADX INFO: renamed from: f */
    public TextView f3905f;

    /* JADX INFO: renamed from: g */
    public List<MMPresetFilter> f3906g;

    /* JADX INFO: renamed from: j */
    public anx f3909j;

    /* JADX INFO: renamed from: k */
    public dqy f3910k;

    /* JADX INFO: renamed from: l */
    public c4g0 f3911l;

    /* JADX INFO: renamed from: c */
    public int f3902c = 0;

    /* JADX INFO: renamed from: d */
    public float f3903d = 0.0f;

    /* JADX INFO: renamed from: h */
    public List<MMPresetFilter> f3907h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public volatile boolean f3908i = false;

    /* JADX INFO: renamed from: m */
    public volatile boolean f3912m = false;

    /* JADX INFO: renamed from: n */
    public final e30<List<MMPresetFilter>> f3913n = new e30() { // from class: l.aji
        @Override // p003l.e30
        public final void call(Object obj) {
            this.f2227a.m4582w((List) obj);
        }
    };

    /* JADX INFO: renamed from: l.gji$a */
    public class C0307a implements FilterScrollMoreViewPager.InterfaceC0116c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f3914a;

        public C0307a(boolean z) {
            this.f3914a = z;
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC0116c
        /* JADX INFO: renamed from: a */
        public boolean mo2323a() {
            return this.f3914a;
        }
    }

    /* JADX INFO: renamed from: l.gji$c */
    public class C0309c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f3918a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f3919b;

        public C0309c(int i, boolean z) {
            this.f3918a = i;
            this.f3919b = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            gji.this.m4568A(this.f3918a, this.f3919b);
            gji.this.f3903d = 0.0f;
        }
    }

    public gji(MessageBarOpt messageBarOpt, anx anxVar, dqy dqyVar) {
        this.f3909j = anxVar;
        this.f3910k = dqyVar;
        m4578s(messageBarOpt);
    }

    /* JADX INFO: renamed from: A */
    public final void m4568A(int i, boolean z) {
        if (this.f3906g.size() <= i || i < 0) {
            return;
        }
        boolean z2 = this.f3902c != i;
        this.f3902c = i;
        this.f3909j.m2887b(i, true, 0.0f);
        if (z2) {
            m4570C(z);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m4569B(boolean z) {
        this.f3900a.setOnIntercept(new C0307a(z));
    }

    /* JADX INFO: renamed from: C */
    public final void m4570C(boolean z) {
        String filterName = this.f3906g.get(this.f3902c).getFilterName();
        if (TextUtils.isEmpty(filterName)) {
            return;
        }
        this.f3905f.setText(filterName);
        m4571D(z);
    }

    /* JADX INFO: renamed from: D */
    public final void m4571D(boolean z) {
        bt0.e(this.f3905f);
        if (NullChecker.a(this.f3904e)) {
            this.f3904e.cancel();
        }
        Animator animatorP = bt0.p(this.f3905f, "translationX", 0L, 300L, bt0.a, new float[]{z ? -100.0f : 100.0f, 0.0f});
        TextView textView = this.f3905f;
        Interpolator interpolator = bt0.d;
        Animator animatorZ = bt0.z(new Animator[]{animatorP, bt0.p(textView, "alpha", 0L, 300L, interpolator, new float[]{0.0f, 1.2f}), bt0.p(this.f3905f, "alpha", 1800L, 600L, interpolator, new float[]{1.2f, 0.0f})});
        this.f3904e = animatorZ;
        bt0.v(animatorZ, new Runnable() { // from class: l.eji
            @Override // java.lang.Runnable
            public final void run() {
                this.f3316a.m4583x();
            }
        });
        bt0.f(this.f3904e, new Runnable() { // from class: l.fji
            @Override // java.lang.Runnable
            public final void run() {
                this.f3651a.m4584y();
            }
        });
        this.f3904e.start();
    }

    /* JADX INFO: renamed from: E */
    public final void m4572E(boolean z, float f) {
        int i = this.f3902c;
        float f2 = z ? -f : 1.0f - f;
        this.f3903d = f2;
        this.f3909j.m2887b(i, z, f2);
    }

    /* JADX INFO: renamed from: F */
    public final void m4573F(final boolean z, boolean z2, boolean z3, long j) {
        final int size = this.f3906g.size();
        if (size == 0) {
            return;
        }
        int i = this.f3902c;
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
            m4568A(i2, z);
            return;
        }
        int i3 = z3 ? z ? 1 : 0 : !z;
        if (NullChecker.a(this.f3901b) && this.f3901b.isRunning()) {
            this.f3901b.cancel();
        }
        if (this.f3901b == null) {
            this.f3901b = new ValueAnimator();
        }
        this.f3901b.setDuration(j);
        this.f3901b.setFloatValues(this.f3903d, i3);
        this.f3901b.removeAllUpdateListeners();
        this.f3901b.removeAllListeners();
        this.f3901b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dji
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f3010a.m4585z(size, z, valueAnimator);
            }
        });
        this.f3901b.addListener(new C0309c(i2, z));
        this.f3901b.start();
    }

    /* JADX INFO: renamed from: o */
    public void m4574o() {
        CoreModule.N().n(this.f3913n);
    }

    /* JADX INFO: renamed from: p */
    public void m4575p() {
        this.f3912m = true;
        mkd0.z(this.f3911l);
    }

    /* JADX INFO: renamed from: q */
    public final List<MMPresetFilter> m4576q(List<MMPresetFilter> list) {
        this.f3906g.clear();
        for (String str : CoreModule.P().i().D2().split("_")) {
            for (MMPresetFilter mMPresetFilter : list) {
                if (str.equals(mMPresetFilter.getmFilterId())) {
                    boolean zEquals = "0".equals(str);
                    List<MMPresetFilter> list2 = this.f3906g;
                    if (zEquals) {
                        list2.add(0, mMPresetFilter);
                    } else {
                        list2.add(mMPresetFilter);
                    }
                }
            }
        }
        return this.f3906g;
    }

    /* JADX INFO: renamed from: r */
    public String m4577r() {
        List<MMPresetFilter> list = this.f3907h;
        if (list == null) {
            return "0";
        }
        int size = list.size();
        int i = this.f3902c;
        return size > i ? this.f3907h.get(i).getmFilterId() : "0";
    }

    /* JADX INFO: renamed from: s */
    public final void m4578s(MessageBarOpt messageBarOpt) {
        this.f3900a = messageBarOpt.getFilterView();
        this.f3905f = messageBarOpt.getFilterNameView();
        this.f3906g = new ArrayList();
        m4574o();
        final lc4 lc4Var = new lc4(this.f3909j);
        this.f3900a.setBeforeCheckEnableTouchListener(new FilterScrollMoreViewPager.InterfaceC0115b() { // from class: l.cji
            @Override // com.p000p1.mobile.putong.core.p001ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC0115b
            /* JADX INFO: renamed from: a */
            public final boolean mo2322a(MotionEvent motionEvent) {
                return lc4Var.m5999a(motionEvent);
            }
        });
        this.f3900a.setOnVerticalFlingListener(new C0308b());
    }

    /* JADX INFO: renamed from: t */
    public void m4579t(List<MMPresetFilter> list) {
        if (list == null || list.size() <= 1) {
            return;
        }
        this.f3909j.m2892g(list);
        this.f3909j.m2887b(this.f3902c, true, 0.0f);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m4580u() {
        ValueAnimator valueAnimator = this.f3901b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m4581v(roj0 roj0Var) {
        if (this.f3908i) {
            return;
        }
        this.f3908i = true;
        m4574o();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m4582w(List list) {
        if (this.f3912m) {
            return;
        }
        this.f3907h = list;
        if (list == null || list.size() <= 1) {
            this.f3911l = CoreModule.N().filter().subscribe((m250) mkd0.G(new e30() { // from class: l.bji
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2401a.m4581v((roj0) obj);
                }
            }));
        } else {
            m4579t(m4576q(this.f3907h));
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m4583x() {
        this.f3905f.setScaleY(1.6f);
        this.f3905f.setScaleX(1.6f);
        this.f3905f.setVisibility(0);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m4584y() {
        this.f3904e = null;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m4585z(int i, boolean z, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue >= 1.0f || fFloatValue <= 0.0f) {
            return;
        }
        this.f3909j.m2887b(i, !z, fFloatValue);
    }

    /* JADX INFO: renamed from: l.gji$b */
    public class C0308b implements FilterScrollMoreViewPager.InterfaceC0117d {

        /* JADX INFO: renamed from: a */
        public boolean f3916a = false;

        public C0308b() {
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC0117d
        /* JADX INFO: renamed from: a */
        public void mo2324a(float f) {
            if (gji.this.f3909j.m2894i() || gji.this.m4580u()) {
                return;
            }
            boolean z = f < 0.0f;
            this.f3916a = z;
            gji.this.m4572E(z, f);
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC0117d
        /* JADX INFO: renamed from: b */
        public void mo2325b(float f) {
            if (gji.this.f3909j.m2894i() || gji.this.m4580u() || gji.this.f3903d == 0.0f) {
                return;
            }
            gji.this.m4573F(f > 0.0f, true, false, 200L);
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC0117d
        /* JADX INFO: renamed from: d */
        public void mo2327d() {
            gji.this.f3910k.m3679G0();
            gji.this.f3910k.m3692O();
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC0117d
        public void onCancel() {
            if (gji.this.f3909j.m2894i() || gji.this.m4580u() || gji.this.f3903d == 0.0f) {
                return;
            }
            gji.this.m4573F(!this.f3916a, true, true, 200L);
        }

        @Override // com.p000p1.mobile.putong.core.p001ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC0117d
        /* JADX INFO: renamed from: c */
        public void mo2326c(boolean z) {
        }
    }
}
