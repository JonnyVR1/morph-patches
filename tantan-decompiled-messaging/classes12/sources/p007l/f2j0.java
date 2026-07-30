package p007l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.GivenGiftBrief;
import com.p000p1.mobile.putong.data.Links;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.newui.mediapicker.buildtopic.TopicSearchAssociationItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.bt0;
import l.cwf0;
import l.d30;
import l.dac0;
import l.e30;
import l.f30;
import l.j760;
import l.t100;
import l.v9j;
import l.vwb;
import l.xdl0;
import l.zvf0;
import rx.c;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class f2j0 {

    /* JADX INFO: renamed from: a */
    public VLinear f7526a;

    /* JADX INFO: renamed from: b */
    public ImageView f7527b;

    /* JADX INFO: renamed from: c */
    public View f7528c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f7529d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f7530e;

    /* JADX INFO: renamed from: f */
    public VText f7531f;

    /* JADX INFO: renamed from: g */
    public ImageView f7532g;

    /* JADX INFO: renamed from: h */
    public View f7533h;

    /* JADX INFO: renamed from: i */
    public Act f7534i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f7535j;

    /* JADX INFO: renamed from: k */
    public v1j0 f7536k;

    /* JADX INFO: renamed from: l */
    public C2382a f7537l;

    /* JADX INFO: renamed from: m */
    public String f7538m;

    /* JADX INFO: renamed from: n */
    public TopicMoment f7539n;

    /* JADX INFO: renamed from: o */
    public o6e0<TopicMoment> f7540o;

    /* JADX INFO: renamed from: r */
    public d30 f7543r;

    /* JADX INFO: renamed from: s */
    public d30 f7544s;

    /* JADX INFO: renamed from: t */
    public d30 f7545t;

    /* JADX INFO: renamed from: u */
    public v9j<c<j760<Links, List<TopicMoment>>>> f7546u;

    /* JADX INFO: renamed from: v */
    public e30<TopicMoment> f7547v;

    /* JADX INFO: renamed from: w */
    public e30<String> f7548w;

    /* JADX INFO: renamed from: x */
    public f30<String, List<TopicMoment>> f7549x;

    /* JADX INFO: renamed from: p */
    public cwf0 f7541p = new cwf0("p_add_topic_pop", f2j0.class.getName());

    /* JADX INFO: renamed from: q */
    public e30<o6e0<TopicMoment>> f7542q = new e30() { // from class: l.a2j0
        public final void call(Object obj) {
            this.f5560a.m10022r((o6e0) obj);
        }
    };

    /* JADX INFO: renamed from: y */
    public int f7550y = 0;

    public f2j0(Act act, FrameLayout frameLayout) {
        this.f7534i = act;
        this.f7535j = frameLayout;
        frameLayout.addView(m10013i(LayoutInflater.from(act), frameLayout));
        m10018n();
        this.f7541p.c();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m10001f(View view) {
    }

    /* JADX INFO: renamed from: A */
    public void m10004A(v9j<c<j760<Links, List<TopicMoment>>>> v9jVar) {
        this.f7546u = v9jVar;
        if (NullChecker.a(this.f7536k)) {
            this.f7536k.m15277n(this.f7546u);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m10005B(d30 d30Var) {
        this.f7543r = d30Var;
    }

    /* JADX INFO: renamed from: C */
    public void m10006C(e30<String> e30Var) {
        this.f7548w = e30Var;
    }

    /* JADX INFO: renamed from: D */
    public void m10007D(f30<String, List<TopicMoment>> f30Var) {
        this.f7549x = f30Var;
    }

    /* JADX INFO: renamed from: E */
    public void m10008E(e30<TopicMoment> e30Var) {
        this.f7547v = e30Var;
    }

    /* JADX INFO: renamed from: F */
    public void m10009F() {
        if (xdl0.O0(this.f7535j)) {
            return;
        }
        this.f7541p.r();
        xdl0.M(this.f7535j, true);
        v1j0 v1j0Var = new v1j0();
        this.f7536k = v1j0Var;
        v1j0Var.m15278o(this.f7542q);
        this.f7536k.m15277n(this.f7546u);
        m10028x("");
        if (this.f7533h.getHeight() > 0) {
            m10011H(this.f7526a.getHeight() - this.f7533h.getHeight(), 0, GivenGiftBrief.ADVANCED_GIFT_LEVEL, false);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m10010G(int i) {
        if (this.f7550y == i) {
            return;
        }
        this.f7550y = i;
        if (i > 0) {
            m10012I(0, i, GivenGiftBrief.ADVANCED_GIFT_LEVEL);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m10011H(int i, int i2, int i3, final boolean z) {
        Animator animatorP = bt0.p(this.f7526a, "translationY", 0L, i3, new LinearInterpolator(), new float[]{i, i2});
        bt0.f(animatorP, new Runnable() { // from class: l.z1j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15557a.m10023s(z);
            }
        });
        animatorP.start();
    }

    /* JADX INFO: renamed from: I */
    public final void m10012I(int i, final int i2, int i3) {
        Animator animatorK = bt0.k(ValueAnimator.ofInt(i, i2), new LinearInterpolator(), 0L, i3);
        ((ValueAnimator) animatorK).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.x1j0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f14740a.m10024t(valueAnimator);
            }
        });
        bt0.f(animatorK, new Runnable() { // from class: l.y1j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f15203a.m10025u(i2);
            }
        });
        animatorK.start();
    }

    /* JADX INFO: renamed from: i */
    public View m10013i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g2j0.m10365b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m10014j() {
        if (NullChecker.a(this.f7544s)) {
            this.f7544s.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10015k() {
        if (NullChecker.a(this.f7545t)) {
            this.f7545t.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m10016l() {
        if (xdl0.O0(this.f7535j)) {
            this.f7541p.g();
            if (NullChecker.a(this.f7536k)) {
                this.f7536k.m15278o(null);
                this.f7536k.m9629d();
            }
            m10011H(0, this.f7526a.getHeight() - this.f7533h.getHeight(), GivenGiftBrief.ADVANCED_GIFT_LEVEL, true);
            if (NullChecker.a(this.f7540o) && TextUtils.equals(this.f7538m, this.f7540o.f11355c) && !TextUtils.isEmpty(this.f7540o.f11355c) && NullChecker.a(this.f7549x)) {
                f30<String, List<TopicMoment>> f30Var = this.f7549x;
                o6e0<TopicMoment> o6e0Var = this.f7540o;
                f30Var.call(o6e0Var.f11355c, (List) o6e0Var.f11354b.b);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m10017m() {
        int i = this.f7550y;
        if (i > 0) {
            this.f7550y = 0;
            m10012I(i, 0, GivenGiftBrief.LUXURY_GIFT_LEVEL);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m10018n() {
        if (u2h.m14723h()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f7527b.getLayoutParams();
            layoutParams.width = t100.d(20.0f);
            layoutParams.height = t100.d(20.0f);
            layoutParams.rightMargin = t100.d(8.0f);
            this.f7527b.setImageResource(f3c0.f7913t5);
            this.f7532g.setImageResource(f3c0.f7905s5);
        }
        this.f7535j.setOnClickListener(new View.OnClickListener() { // from class: l.b2j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f2j0.m10001f(view);
            }
        });
        xdl0.E0(this.f7528c, new View.OnClickListener() { // from class: l.c2j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6494a.m10020p(view);
            }
        });
        xdl0.E0(this.f7530e, new View.OnClickListener() { // from class: l.d2j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f6783a.m10021q(view);
            }
        });
        C2382a c2382a = new C2382a(this.f7534i);
        this.f7537l = c2382a;
        this.f7529d.setAdapter(c2382a);
        this.f7529d.clearAnimation();
    }

    /* JADX INFO: renamed from: o */
    public boolean m10019o() {
        return xdl0.O0(this.f7535j);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m10020p(View view) {
        m10016l();
        m10015k();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m10021q(View view) {
        zvf0.r("e_pick_topic", "p_add_topic_pop");
        d30 d30Var = this.f7543r;
        if (d30Var == null) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m10022r(o6e0 o6e0Var) {
        if (NullChecker.a(o6e0Var) && TextUtils.equals(this.f7538m, o6e0Var.f11355c)) {
            m10027w(o6e0Var);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m10023s(boolean z) {
        if (z) {
            xdl0.M(this.f7535j, false);
        }
        this.f7526a.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m10024t(ValueAnimator valueAnimator) {
        xdl0.C0(this.f7533h, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m10025u(int i) {
        xdl0.C0(this.f7533h, i);
    }

    /* JADX INFO: renamed from: v */
    public final void m10026v(TopicMoment topicMoment, boolean z) {
        if (z) {
            m10016l();
            m10014j();
        }
        if (NullChecker.a(this.f7547v)) {
            this.f7547v.call(topicMoment);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m10027w(o6e0<TopicMoment> o6e0Var) {
        this.f7540o = o6e0Var;
        ArrayList arrayList = new ArrayList();
        if (NullChecker.a(o6e0Var) && o6e0Var.m12446a()) {
            if (vwb.J((Collection) o6e0Var.f11354b.b)) {
                return;
            } else {
                arrayList.addAll((Collection) o6e0Var.f11354b.b);
            }
        }
        TopicMoment topicMoment = null;
        TopicMoment topicMoment2 = arrayList.size() > 0 ? (TopicMoment) arrayList.get(0) : null;
        if (topicMoment2 != null && TextUtils.equals(this.f7538m, topicMoment2.name)) {
            topicMoment = topicMoment2;
        }
        this.f7539n = topicMoment;
        this.f7537l.m10038I(o6e0Var.f11355c, arrayList);
        this.f7529d.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: x */
    public void m10028x(String str) {
        v1j0 v1j0Var = this.f7536k;
        if (v1j0Var == null) {
            return;
        }
        this.f7538m = str;
        v1j0Var.m9634i(str);
    }

    /* JADX INFO: renamed from: y */
    public void m10029y(d30 d30Var) {
        this.f7544s = d30Var;
    }

    /* JADX INFO: renamed from: z */
    public void m10030z(d30 d30Var) {
        this.f7545t = d30Var;
    }

    /* JADX INFO: renamed from: l.f2j0$a */
    public class C2382a extends dac0<TopicMoment> {

        /* JADX INFO: renamed from: d */
        public Act f7552d;

        /* JADX INFO: renamed from: e */
        public String f7553e;

        /* JADX INFO: renamed from: c */
        public List<TopicMoment> f7551c = new ArrayList();

        /* JADX INFO: renamed from: f */
        public l80<TopicMoment> f7554f = new a();

        public C2382a(Act act) {
            this.f7552d = act;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m10032H(TopicMoment topicMoment, View view) {
            zi60.m17436w().m17445b(topicMoment, "p_add_topic_pop", j760.a("topic_attribute", Integer.valueOf(TextUtils.isEmpty(this.f7553e) ? 1 : 2)));
            f2j0.this.m10026v(topicMoment, true);
        }

        /* JADX INFO: renamed from: C */
        public int m10034C() {
            return this.f7551c.size();
        }

        /* JADX INFO: renamed from: D */
        public View m10035D(ViewGroup viewGroup, int i) {
            return this.f7552d.inflater().inflate(o6c0.f11061H3, viewGroup, false);
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m10033A(View view, final TopicMoment topicMoment, int i, int i2) {
            this.f7554f.m11594h(view, topicMoment, i2);
            ((TopicSearchAssociationItemView) view).m3633b(i2, topicMoment);
            zi60.m17436w().m17447d(topicMoment, "p_add_topic_pop", j760.a("topic_attribute", Integer.valueOf(TextUtils.isEmpty(this.f7553e) ? 1 : 2)));
            xdl0.E0(view, new View.OnClickListener() { // from class: l.e2j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f7179a.m10032H(topicMoment, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public TopicMoment getItem(int i) {
            return this.f7551c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public void m10038I(String str, List<TopicMoment> list) {
            this.f7553e = str;
            if (list == null) {
                list = new ArrayList<>();
            }
            this.f7551c.clear();
            this.f7551c.addAll(list);
            notifyDataSetChanged();
        }

        public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
            super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
            this.f7554f.m11597o();
        }

        public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
            super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
            this.f7554f.m11597o();
        }

        /* JADX INFO: renamed from: e */
        public void m10039e(int i) {
        }

        /* JADX INFO: renamed from: l.f2j0$a$a */
        public class a extends l80<TopicMoment> {
            public a() {
            }

            @Override // p007l.l80
            /* JADX INFO: renamed from: f */
            public void mo2865f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            }

            @Override // p007l.l80
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public void mo4975k(TopicMoment topicMoment, int i, View view) {
            }

            @Override // p007l.l80
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public void mo4978m(TopicMoment topicMoment, int i, long j, View view) {
            }
        }
    }
}
