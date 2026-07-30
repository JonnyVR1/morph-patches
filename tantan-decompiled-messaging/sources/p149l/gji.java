package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.animation.Interpolator;
import android.widget.TextView;
import com.momo.mcamera.filtermanager.MMPresetFilter;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.p053ui.messages.media.widget.FilterScrollMoreViewPager;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarOpt;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class gji {

    /* JADX INFO: renamed from: a */
    public FilterScrollMoreViewPager f103048a;

    /* JADX INFO: renamed from: b */
    public ValueAnimator f103049b;

    /* JADX INFO: renamed from: e */
    public Animator f103052e;

    /* JADX INFO: renamed from: f */
    public TextView f103053f;

    /* JADX INFO: renamed from: g */
    public List<MMPresetFilter> f103054g;

    /* JADX INFO: renamed from: j */
    public anx f103057j;

    /* JADX INFO: renamed from: k */
    public dqy f103058k;

    /* JADX INFO: renamed from: l */
    public c4g0 f103059l;

    /* JADX INFO: renamed from: c */
    public int f103050c = 0;

    /* JADX INFO: renamed from: d */
    public float f103051d = 0.0f;

    /* JADX INFO: renamed from: h */
    public List<MMPresetFilter> f103055h = new ArrayList();

    /* JADX INFO: renamed from: i */
    public volatile boolean f103056i = false;

    /* JADX INFO: renamed from: m */
    public volatile boolean f103060m = false;

    /* JADX INFO: renamed from: n */
    public final e30<List<MMPresetFilter>> f103061n = new e30() { // from class: l.aji
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f70117a.m126533w((List) obj);
        }
    };

    /* JADX INFO: renamed from: l.gji$a */
    public class C17092a implements FilterScrollMoreViewPager.InterfaceC8533c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean f103062a;

        public C17092a(boolean z) {
            this.f103062a = z;
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC8533c
        /* JADX INFO: renamed from: a */
        public boolean mo49204a() {
            return this.f103062a;
        }
    }

    /* JADX INFO: renamed from: l.gji$c */
    public class C17094c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f103066a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f103067b;

        public C17094c(int i, boolean z) {
            this.f103066a = i;
            this.f103067b = z;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            gji.this.m126519A(this.f103066a, this.f103067b);
            gji.this.f103051d = 0.0f;
        }
    }

    public gji(MessageBarOpt messageBarOpt, anx anxVar, dqy dqyVar) {
        this.f103057j = anxVar;
        this.f103058k = dqyVar;
        m126529s(messageBarOpt);
    }

    /* JADX INFO: renamed from: A */
    public final void m126519A(int i, boolean z) {
        if (this.f103054g.size() <= i || i < 0) {
            return;
        }
        boolean z2 = this.f103050c != i;
        this.f103050c = i;
        this.f103057j.m97818b(i, true, 0.0f);
        if (z2) {
            m126521C(z);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m126520B(boolean z) {
        this.f103048a.setOnIntercept(new C17092a(z));
    }

    /* JADX INFO: renamed from: C */
    public final void m126521C(boolean z) {
        String filterName = this.f103054g.get(this.f103050c).getFilterName();
        if (TextUtils.isEmpty(filterName)) {
            return;
        }
        this.f103053f.setText(filterName);
        m126522D(z);
    }

    /* JADX INFO: renamed from: D */
    public final void m126522D(boolean z) {
        bt0.m103732e(this.f103053f);
        if (NullChecker.m81303a(this.f103052e)) {
            this.f103052e.cancel();
        }
        Animator animatorM103743p = bt0.m103743p(this.f103053f, "translationX", 0L, 300L, bt0.f77154a, z ? -100.0f : 100.0f, 0.0f);
        TextView textView = this.f103053f;
        Interpolator interpolator = bt0.f77157d;
        Animator animatorM103753z = bt0.m103753z(animatorM103743p, bt0.m103743p(textView, "alpha", 0L, 300L, interpolator, 0.0f, 1.2f), bt0.m103743p(this.f103053f, "alpha", 1800L, 600L, interpolator, 1.2f, 0.0f));
        this.f103052e = animatorM103753z;
        bt0.m103749v(animatorM103753z, new Runnable() { // from class: l.eji
            @Override // java.lang.Runnable
            public final void run() {
                this.f91724a.m126534x();
            }
        });
        bt0.m103733f(this.f103052e, new Runnable() { // from class: l.fji
            @Override // java.lang.Runnable
            public final void run() {
                this.f97789a.m126535y();
            }
        });
        this.f103052e.start();
    }

    /* JADX INFO: renamed from: E */
    public final void m126523E(boolean z, float f) {
        int i = this.f103050c;
        float f2 = z ? -f : 1.0f - f;
        this.f103051d = f2;
        this.f103057j.m97818b(i, z, f2);
    }

    /* JADX INFO: renamed from: F */
    public final void m126524F(final boolean z, boolean z2, boolean z3, long j) {
        final int size = this.f103054g.size();
        if (size == 0) {
            return;
        }
        int i = this.f103050c;
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
            m126519A(i2, z);
            return;
        }
        int i3 = z3 ? z ? 1 : 0 : !z;
        if (NullChecker.m81303a(this.f103049b) && this.f103049b.isRunning()) {
            this.f103049b.cancel();
        }
        if (this.f103049b == null) {
            this.f103049b = new ValueAnimator();
        }
        this.f103049b.setDuration(j);
        this.f103049b.setFloatValues(this.f103051d, i3);
        this.f103049b.removeAllUpdateListeners();
        this.f103049b.removeAllListeners();
        this.f103049b.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.dji
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f86540a.m126536z(size, z, valueAnimator);
            }
        });
        this.f103049b.addListener(new C17094c(i2, z));
        this.f103049b.start();
    }

    /* JADX INFO: renamed from: o */
    public void m126525o() {
        CoreModule.m29934N().mo60373n(this.f103061n);
    }

    /* JADX INFO: renamed from: p */
    public void m126526p() {
        this.f103060m = true;
        mkd0.m154992z(this.f103059l);
    }

    /* JADX INFO: renamed from: q */
    public final List<MMPresetFilter> m126527q(List<MMPresetFilter> list) {
        this.f103054g.clear();
        for (String str : CoreModule.m29935P().m94658i().mo158219D2().split("_")) {
            for (MMPresetFilter mMPresetFilter : list) {
                if (str.equals(mMPresetFilter.getmFilterId())) {
                    boolean zEquals = "0".equals(str);
                    List<MMPresetFilter> list2 = this.f103054g;
                    if (zEquals) {
                        list2.add(0, mMPresetFilter);
                    } else {
                        list2.add(mMPresetFilter);
                    }
                }
            }
        }
        return this.f103054g;
    }

    /* JADX INFO: renamed from: r */
    public String m126528r() {
        List<MMPresetFilter> list = this.f103055h;
        if (list == null) {
            return "0";
        }
        int size = list.size();
        int i = this.f103050c;
        return size > i ? this.f103055h.get(i).getmFilterId() : "0";
    }

    /* JADX INFO: renamed from: s */
    public final void m126529s(MessageBarOpt messageBarOpt) {
        this.f103048a = messageBarOpt.getFilterView();
        this.f103053f = messageBarOpt.getFilterNameView();
        this.f103054g = new ArrayList();
        m126525o();
        final lc4 lc4Var = new lc4(this.f103057j);
        this.f103048a.setBeforeCheckEnableTouchListener(new FilterScrollMoreViewPager.InterfaceC8532b() { // from class: l.cji
            @Override // com.p046p1.mobile.putong.core.p053ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC8532b
            /* JADX INFO: renamed from: a */
            public final boolean mo49203a(MotionEvent motionEvent) {
                return lc4Var.m149279a(motionEvent);
            }
        });
        this.f103048a.setOnVerticalFlingListener(new C17093b());
    }

    /* JADX INFO: renamed from: t */
    public void m126530t(List<MMPresetFilter> list) {
        if (list == null || list.size() <= 1) {
            return;
        }
        this.f103057j.m97823g(list);
        this.f103057j.m97818b(this.f103050c, true, 0.0f);
    }

    /* JADX INFO: renamed from: u */
    public final boolean m126531u() {
        ValueAnimator valueAnimator = this.f103049b;
        return valueAnimator != null && valueAnimator.isRunning();
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m126532v(roj0 roj0Var) {
        if (this.f103056i) {
            return;
        }
        this.f103056i = true;
        m126525o();
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m126533w(List list) {
        if (this.f103060m) {
            return;
        }
        this.f103055h = list;
        if (list == null || list.size() <= 1) {
            this.f103059l = CoreModule.m29934N().filter().subscribe(mkd0.m154955G(new e30() { // from class: l.bji
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f75917a.m126532v((roj0) obj);
                }
            }));
        } else {
            m126530t(m126527q(this.f103055h));
        }
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m126534x() {
        this.f103053f.setScaleY(1.6f);
        this.f103053f.setScaleX(1.6f);
        this.f103053f.setVisibility(0);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m126535y() {
        this.f103052e = null;
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m126536z(int i, boolean z, ValueAnimator valueAnimator) {
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if (fFloatValue >= 1.0f || fFloatValue <= 0.0f) {
            return;
        }
        this.f103057j.m97818b(i, !z, fFloatValue);
    }

    /* JADX INFO: renamed from: l.gji$b */
    public class C17093b implements FilterScrollMoreViewPager.InterfaceC8534d {

        /* JADX INFO: renamed from: a */
        public boolean f103064a = false;

        public C17093b() {
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC8534d
        /* JADX INFO: renamed from: a */
        public void mo49205a(float f) {
            if (gji.this.f103057j.m97825i() || gji.this.m126531u()) {
                return;
            }
            boolean z = f < 0.0f;
            this.f103064a = z;
            gji.this.m126523E(z, f);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC8534d
        /* JADX INFO: renamed from: b */
        public void mo49206b(float f) {
            if (gji.this.f103057j.m97825i() || gji.this.m126531u() || gji.this.f103051d == 0.0f) {
                return;
            }
            gji.this.m126524F(f > 0.0f, true, false, 200L);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC8534d
        /* JADX INFO: renamed from: d */
        public void mo49208d() {
            gji.this.f103058k.m113196G0();
            gji.this.f103058k.m113209O();
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC8534d
        public void onCancel() {
            if (gji.this.f103057j.m97825i() || gji.this.m126531u() || gji.this.f103051d == 0.0f) {
                return;
            }
            gji.this.m126524F(!this.f103064a, true, true, 200L);
        }

        @Override // com.p046p1.mobile.putong.core.p053ui.messages.media.widget.FilterScrollMoreViewPager.InterfaceC8534d
        /* JADX INFO: renamed from: c */
        public void mo49207c(boolean z) {
        }
    }
}
