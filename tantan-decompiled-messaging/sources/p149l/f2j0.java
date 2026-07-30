package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.newui.mediapicker.buildtopic.TopicSearchAssociationItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.C22306c;
import p147v.VLinear;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class f2j0 {

    /* JADX INFO: renamed from: a */
    public VLinear f94187a;

    /* JADX INFO: renamed from: b */
    public ImageView f94188b;

    /* JADX INFO: renamed from: c */
    public View f94189c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f94190d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f94191e;

    /* JADX INFO: renamed from: f */
    public VText f94192f;

    /* JADX INFO: renamed from: g */
    public ImageView f94193g;

    /* JADX INFO: renamed from: h */
    public View f94194h;

    /* JADX INFO: renamed from: i */
    public Act f94195i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f94196j;

    /* JADX INFO: renamed from: k */
    public v1j0 f94197k;

    /* JADX INFO: renamed from: l */
    public C16742a f94198l;

    /* JADX INFO: renamed from: m */
    public String f94199m;

    /* JADX INFO: renamed from: n */
    public TopicMoment f94200n;

    /* JADX INFO: renamed from: o */
    public o6e0<TopicMoment> f94201o;

    /* JADX INFO: renamed from: r */
    public d30 f94204r;

    /* JADX INFO: renamed from: s */
    public d30 f94205s;

    /* JADX INFO: renamed from: t */
    public d30 f94206t;

    /* JADX INFO: renamed from: u */
    public v9j<C22306c<j760<Links, List<TopicMoment>>>> f94207u;

    /* JADX INFO: renamed from: v */
    public e30<TopicMoment> f94208v;

    /* JADX INFO: renamed from: w */
    public e30<String> f94209w;

    /* JADX INFO: renamed from: x */
    public f30<String, List<TopicMoment>> f94210x;

    /* JADX INFO: renamed from: p */
    public cwf0 f94202p = new cwf0("p_add_topic_pop", f2j0.class.getName());

    /* JADX INFO: renamed from: q */
    public e30<o6e0<TopicMoment>> f94203q = new e30() { // from class: l.a2j0
        @Override // p149l.e30
        public final void call(Object obj) {
            this.f67268a.m119211r((o6e0) obj);
        }
    };

    /* JADX INFO: renamed from: y */
    public int f94211y = 0;

    public f2j0(Act act, FrameLayout frameLayout) {
        this.f94195i = act;
        this.f94196j = frameLayout;
        frameLayout.addView(m119202i(LayoutInflater.from(act), frameLayout));
        m119207n();
        this.f94202p.m109027c();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m119190f(View view) {
    }

    /* JADX INFO: renamed from: A */
    public void m119193A(v9j<C22306c<j760<Links, List<TopicMoment>>>> v9jVar) {
        this.f94207u = v9jVar;
        if (NullChecker.m81303a(this.f94197k)) {
            this.f94197k.m196643n(this.f94207u);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m119194B(d30 d30Var) {
        this.f94204r = d30Var;
    }

    /* JADX INFO: renamed from: C */
    public void m119195C(e30<String> e30Var) {
        this.f94209w = e30Var;
    }

    /* JADX INFO: renamed from: D */
    public void m119196D(f30<String, List<TopicMoment>> f30Var) {
        this.f94210x = f30Var;
    }

    /* JADX INFO: renamed from: E */
    public void m119197E(e30<TopicMoment> e30Var) {
        this.f94208v = e30Var;
    }

    /* JADX INFO: renamed from: F */
    public void m119198F() {
        if (xdl0.m208349O0(this.f94196j)) {
            return;
        }
        this.f94202p.m109042r();
        xdl0.m208344M(this.f94196j, true);
        v1j0 v1j0Var = new v1j0();
        this.f94197k = v1j0Var;
        v1j0Var.m196644o(this.f94203q);
        this.f94197k.m196643n(this.f94207u);
        m119217x("");
        if (this.f94194h.getHeight() > 0) {
            m119200H(this.f94187a.getHeight() - this.f94194h.getHeight(), 0, 200, false);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m119199G(int i) {
        if (this.f94211y == i) {
            return;
        }
        this.f94211y = i;
        if (i > 0) {
            m119201I(0, i, 200);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m119200H(int i, int i2, int i3, final boolean z) {
        Animator animatorM103743p = bt0.m103743p(this.f94187a, "translationY", 0L, i3, new LinearInterpolator(), i, i2);
        bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.z1j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f201081a.m119212s(z);
            }
        });
        animatorM103743p.start();
    }

    /* JADX INFO: renamed from: I */
    public final void m119201I(int i, final int i2, int i3) {
        Animator animatorM103738k = bt0.m103738k(ValueAnimator.ofInt(i, i2), new LinearInterpolator(), 0L, i3);
        ((ValueAnimator) animatorM103738k).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.x1j0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f189079a.m119213t(valueAnimator);
            }
        });
        bt0.m103733f(animatorM103738k, new Runnable() { // from class: l.y1j0
            @Override // java.lang.Runnable
            public final void run() {
                this.f195420a.m119214u(i2);
            }
        });
        animatorM103738k.start();
    }

    /* JADX INFO: renamed from: i */
    public View m119202i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return g2j0.m124161b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m119203j() {
        if (NullChecker.m81303a(this.f94205s)) {
            this.f94205s.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m119204k() {
        if (NullChecker.m81303a(this.f94206t)) {
            this.f94206t.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m119205l() {
        if (xdl0.m208349O0(this.f94196j)) {
            this.f94202p.m109031g();
            if (NullChecker.m81303a(this.f94197k)) {
                this.f94197k.m196644o(null);
                this.f94197k.m114928d();
            }
            m119200H(0, this.f94187a.getHeight() - this.f94194h.getHeight(), 200, true);
            if (NullChecker.m81303a(this.f94201o) && TextUtils.equals(this.f94199m, this.f94201o.f142342c) && !TextUtils.isEmpty(this.f94201o.f142342c) && NullChecker.m81303a(this.f94210x)) {
                f30<String, List<TopicMoment>> f30Var = this.f94210x;
                o6e0<TopicMoment> o6e0Var = this.f94201o;
                f30Var.call(o6e0Var.f142342c, o6e0Var.f142341b.f116565b);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m119206m() {
        int i = this.f94211y;
        if (i > 0) {
            this.f94211y = 0;
            m119201I(i, 0, 300);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m119207n() {
        if (u2h.m191499h()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f94188b.getLayoutParams();
            layoutParams.width = t100.m186890d(20.0f);
            layoutParams.height = t100.m186890d(20.0f);
            layoutParams.rightMargin = t100.m186890d(8.0f);
            this.f94188b.setImageResource(f3c0.f94630t5);
            this.f94193g.setImageResource(f3c0.f94622s5);
        }
        this.f94196j.setOnClickListener(new View.OnClickListener() { // from class: l.b2j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                f2j0.m119190f(view);
            }
        });
        xdl0.m208329E0(this.f94189c, new View.OnClickListener() { // from class: l.c2j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f78365a.m119209p(view);
            }
        });
        xdl0.m208329E0(this.f94191e, new View.OnClickListener() { // from class: l.d2j0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83413a.m119210q(view);
            }
        });
        C16742a c16742a = new C16742a(this.f94195i);
        this.f94198l = c16742a;
        this.f94190d.setAdapter(c16742a);
        this.f94190d.clearAnimation();
    }

    /* JADX INFO: renamed from: o */
    public boolean m119208o() {
        return xdl0.m208349O0(this.f94196j);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m119209p(View view) {
        m119205l();
        m119204k();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m119210q(View view) {
        zvf0.m220396r("e_pick_topic", "p_add_topic_pop");
        d30 d30Var = this.f94204r;
        if (d30Var == null) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m119211r(o6e0 o6e0Var) {
        if (NullChecker.m81303a(o6e0Var) && TextUtils.equals(this.f94199m, o6e0Var.f142342c)) {
            m119216w(o6e0Var);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m119212s(boolean z) {
        if (z) {
            xdl0.m208344M(this.f94196j, false);
        }
        this.f94187a.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m119213t(ValueAnimator valueAnimator) {
        xdl0.m208325C0(this.f94194h, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m119214u(int i) {
        xdl0.m208325C0(this.f94194h, i);
    }

    /* JADX INFO: renamed from: v */
    public final void m119215v(TopicMoment topicMoment, boolean z) {
        if (z) {
            m119205l();
            m119203j();
        }
        if (NullChecker.m81303a(this.f94208v)) {
            this.f94208v.call(topicMoment);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m119216w(o6e0<TopicMoment> o6e0Var) {
        this.f94201o = o6e0Var;
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m81303a(o6e0Var) && o6e0Var.m162847a()) {
            if (vwb.m200296J(o6e0Var.f142341b.f116565b)) {
                return;
            } else {
                arrayList.addAll(o6e0Var.f142341b.f116565b);
            }
        }
        TopicMoment topicMoment = null;
        TopicMoment topicMoment2 = arrayList.size() > 0 ? (TopicMoment) arrayList.get(0) : null;
        if (topicMoment2 != null && TextUtils.equals(this.f94199m, topicMoment2.name)) {
            topicMoment = topicMoment2;
        }
        this.f94200n = topicMoment;
        this.f94198l.m119224I(o6e0Var.f142342c, arrayList);
        this.f94190d.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: x */
    public void m119217x(String str) {
        v1j0 v1j0Var = this.f94197k;
        if (v1j0Var == null) {
            return;
        }
        this.f94199m = str;
        v1j0Var.m114933i(str);
    }

    /* JADX INFO: renamed from: y */
    public void m119218y(d30 d30Var) {
        this.f94205s = d30Var;
    }

    /* JADX INFO: renamed from: z */
    public void m119219z(d30 d30Var) {
        this.f94206t = d30Var;
    }

    /* JADX INFO: renamed from: l.f2j0$a */
    public class C16742a extends dac0<TopicMoment> {

        /* JADX INFO: renamed from: d */
        public Act f94213d;

        /* JADX INFO: renamed from: e */
        public String f94214e;

        /* JADX INFO: renamed from: c */
        public List<TopicMoment> f94212c = new ArrayList();

        /* JADX INFO: renamed from: f */
        public l80<TopicMoment> f94215f = new a();

        public C16742a(Act act) {
            this.f94213d = act;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m119221H(TopicMoment topicMoment, View view) {
            zi60.m218961w().m218970b(topicMoment, "p_add_topic_pop", j760.m140076a("topic_attribute", Integer.valueOf(TextUtils.isEmpty(this.f94214e) ? 1 : 2)));
            f2j0.this.m119215v(topicMoment, true);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f94212c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return this.f94213d.inflater().inflate(o6c0.f142042H3, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final TopicMoment topicMoment, int i, int i2) {
            this.f94215f.m148839h(view, topicMoment, i2);
            ((TopicSearchAssociationItemView) view).m62628b(i2, topicMoment);
            zi60.m218961w().m218972d(topicMoment, "p_add_topic_pop", j760.m140076a("topic_attribute", Integer.valueOf(TextUtils.isEmpty(this.f94214e) ? 1 : 2)));
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.e2j0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f88926a.m119221H(topicMoment, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public TopicMoment getItem(int i) {
            return this.f94212c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public void m119224I(String str, List<TopicMoment> list) {
            this.f94214e = str;
            if (list == null) {
                list = new ArrayList<>();
            }
            this.f94212c.clear();
            this.f94212c.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
            super.onViewAttachedToWindow(abstractC0566d0);
            this.f94215f.m148842o();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
            super.onViewDetachedFromWindow(abstractC0566d0);
            this.f94215f.m148842o();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: e */
        public void mo47327e(int i) {
        }

        /* JADX INFO: renamed from: l.f2j0$a$a */
        public class a extends l80<TopicMoment> {
            public a() {
            }

            @Override // p149l.l80
            /* JADX INFO: renamed from: f */
            public void mo55694f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            }

            @Override // p149l.l80
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public void mo63937k(TopicMoment topicMoment, int i, View view) {
            }

            @Override // p149l.l80
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public void mo55696m(TopicMoment topicMoment, int i, long j, View view) {
            }
        }
    }
}
