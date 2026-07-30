package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.newui.mediapicker.buildtopic.TopicSearchAssociationItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.C22421c;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class jbj0 {

    /* JADX INFO: renamed from: a */
    public VLinear f119939a;

    /* JADX INFO: renamed from: b */
    public ImageView f119940b;

    /* JADX INFO: renamed from: c */
    public View f119941c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f119942d;

    /* JADX INFO: renamed from: e */
    public RelativeLayout f119943e;

    /* JADX INFO: renamed from: f */
    public VText f119944f;

    /* JADX INFO: renamed from: g */
    public ImageView f119945g;

    /* JADX INFO: renamed from: h */
    public View f119946h;

    /* JADX INFO: renamed from: i */
    public Act f119947i;

    /* JADX INFO: renamed from: j */
    public FrameLayout f119948j;

    /* JADX INFO: renamed from: k */
    public zaj0 f119949k;

    /* JADX INFO: renamed from: l */
    public C17919a f119950l;

    /* JADX INFO: renamed from: m */
    public String f119951m;

    /* JADX INFO: renamed from: n */
    public TopicMoment f119952n;

    /* JADX INFO: renamed from: o */
    public tee0<TopicMoment> f119953o;

    /* JADX INFO: renamed from: r */
    public x20 f119956r;

    /* JADX INFO: renamed from: s */
    public x20 f119957s;

    /* JADX INFO: renamed from: t */
    public x20 f119958t;

    /* JADX INFO: renamed from: u */
    public pcj<C22421c<pf60<Links, List<TopicMoment>>>> f119959u;

    /* JADX INFO: renamed from: v */
    public y20<TopicMoment> f119960v;

    /* JADX INFO: renamed from: w */
    public y20<String> f119961w;

    /* JADX INFO: renamed from: x */
    public z20<String, List<TopicMoment>> f119962x;

    /* JADX INFO: renamed from: p */
    public l4g0 f119954p = new l4g0("p_add_topic_pop", jbj0.class.getName());

    /* JADX INFO: renamed from: q */
    public y20<tee0<TopicMoment>> f119955q = new y20() { // from class: l.ebj0
        @Override // p153l.y20
        public final void call(Object obj) {
            this.f92929a.m144310r((tee0) obj);
        }
    };

    /* JADX INFO: renamed from: y */
    public int f119963y = 0;

    public jbj0(Act act, FrameLayout frameLayout) {
        this.f119947i = act;
        this.f119948j = frameLayout;
        frameLayout.addView(m144301i(LayoutInflater.from(act), frameLayout));
        m144306n();
        this.f119954p.m152768c();
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m144289f(View view) {
    }

    /* JADX INFO: renamed from: A */
    public void m144292A(pcj<C22421c<pf60<Links, List<TopicMoment>>>> pcjVar) {
        this.f119959u = pcjVar;
        if (NullChecker.m82486a(this.f119949k)) {
            this.f119949k.m219127n(this.f119959u);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m144293B(x20 x20Var) {
        this.f119956r = x20Var;
    }

    /* JADX INFO: renamed from: C */
    public void m144294C(y20<String> y20Var) {
        this.f119961w = y20Var;
    }

    /* JADX INFO: renamed from: D */
    public void m144295D(z20<String, List<TopicMoment>> z20Var) {
        this.f119962x = z20Var;
    }

    /* JADX INFO: renamed from: E */
    public void m144296E(y20<TopicMoment> y20Var) {
        this.f119960v = y20Var;
    }

    /* JADX INFO: renamed from: F */
    public void m144297F() {
        if (bnl0.m105529O0(this.f119948j)) {
            return;
        }
        this.f119954p.m152783r();
        bnl0.m105524M(this.f119948j, true);
        zaj0 zaj0Var = new zaj0();
        this.f119949k = zaj0Var;
        zaj0Var.m219128o(this.f119955q);
        this.f119949k.m219127n(this.f119959u);
        m144316x("");
        if (this.f119946h.getHeight() > 0) {
            m144299H(this.f119939a.getHeight() - this.f119946h.getHeight(), 0, 200, false);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m144298G(int i) {
        if (this.f119963y == i) {
            return;
        }
        this.f119963y = i;
        if (i > 0) {
            m144300I(0, i, 200);
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m144299H(int i, int i2, int i3, final boolean z) {
        Animator animatorM132170p = gt0.m132170p(this.f119939a, "translationY", 0L, i3, new LinearInterpolator(), i, i2);
        gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.dbj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f87678a.m144311s(z);
            }
        });
        animatorM132170p.start();
    }

    /* JADX INFO: renamed from: I */
    public final void m144300I(int i, final int i2, int i3) {
        Animator animatorM132165k = gt0.m132165k(ValueAnimator.ofInt(i, i2), new LinearInterpolator(), 0L, i3);
        ((ValueAnimator) animatorM132165k).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.bbj0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f75959a.m144312t(valueAnimator);
            }
        });
        gt0.m132160f(animatorM132165k, new Runnable() { // from class: l.cbj0
            @Override // java.lang.Runnable
            public final void run() {
                this.f80827a.m144313u(i2);
            }
        });
        animatorM132165k.start();
    }

    /* JADX INFO: renamed from: i */
    public View m144301i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kbj0.m149062b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public final void m144302j() {
        if (NullChecker.m82486a(this.f119957s)) {
            this.f119957s.call();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m144303k() {
        if (NullChecker.m82486a(this.f119958t)) {
            this.f119958t.call();
        }
    }

    /* JADX INFO: renamed from: l */
    public void m144304l() {
        if (bnl0.m105529O0(this.f119948j)) {
            this.f119954p.m152772g();
            if (NullChecker.m82486a(this.f119949k)) {
                this.f119949k.m219128o(null);
                this.f119949k.m102680d();
            }
            m144299H(0, this.f119939a.getHeight() - this.f119946h.getHeight(), 200, true);
            if (NullChecker.m82486a(this.f119953o) && TextUtils.equals(this.f119951m, this.f119953o.f173807c) && !TextUtils.isEmpty(this.f119953o.f173807c) && NullChecker.m82486a(this.f119962x)) {
                z20<String, List<TopicMoment>> z20Var = this.f119962x;
                tee0<TopicMoment> tee0Var = this.f119953o;
                z20Var.call(tee0Var.f173807c, tee0Var.f173806b.f152157b);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public void m144305m() {
        int i = this.f119963y;
        if (i > 0) {
            this.f119963y = 0;
            m144300I(i, 0, 300);
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m144306n() {
        if (j4h.m143424h()) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.f119940b.getLayoutParams();
            layoutParams.width = qa00.m175859d(20.0f);
            layoutParams.height = qa00.m175859d(20.0f);
            layoutParams.rightMargin = qa00.m175859d(8.0f);
            this.f119940b.setImageResource(lbc0.f131148t5);
            this.f119945g.setImageResource(lbc0.f131140s5);
        }
        this.f119948j.setOnClickListener(new View.OnClickListener() { // from class: l.fbj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jbj0.m144289f(view);
            }
        });
        bnl0.m105509E0(this.f119941c, new View.OnClickListener() { // from class: l.gbj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f103474a.m144308p(view);
            }
        });
        bnl0.m105509E0(this.f119943e, new View.OnClickListener() { // from class: l.hbj0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f108594a.m144309q(view);
            }
        });
        C17919a c17919a = new C17919a(this.f119947i);
        this.f119950l = c17919a;
        this.f119942d.setAdapter(c17919a);
        this.f119942d.clearAnimation();
    }

    /* JADX INFO: renamed from: o */
    public boolean m144307o() {
        return bnl0.m105529O0(this.f119948j);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m144308p(View view) {
        m144304l();
        m144303k();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m144309q(View view) {
        i4g0.m138520r("e_pick_topic", "p_add_topic_pop");
        x20 x20Var = this.f119956r;
        if (x20Var == null) {
            return;
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m144310r(tee0 tee0Var) {
        if (NullChecker.m82486a(tee0Var) && TextUtils.equals(this.f119951m, tee0Var.f173807c)) {
            m144315w(tee0Var);
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m144311s(boolean z) {
        if (z) {
            bnl0.m105524M(this.f119948j, false);
        }
        this.f119939a.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m144312t(ValueAnimator valueAnimator) {
        bnl0.m105505C0(this.f119946h, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m144313u(int i) {
        bnl0.m105505C0(this.f119946h, i);
    }

    /* JADX INFO: renamed from: v */
    public final void m144314v(TopicMoment topicMoment, boolean z) {
        if (z) {
            m144304l();
            m144302j();
        }
        if (NullChecker.m82486a(this.f119960v)) {
            this.f119960v.call(topicMoment);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m144315w(tee0<TopicMoment> tee0Var) {
        this.f119953o = tee0Var;
        ArrayList arrayList = new ArrayList();
        if (NullChecker.m82486a(tee0Var) && tee0Var.m190692a()) {
            if (jyb.m147479J(tee0Var.f173806b.f152157b)) {
                return;
            } else {
                arrayList.addAll(tee0Var.f173806b.f152157b);
            }
        }
        TopicMoment topicMoment = null;
        TopicMoment topicMoment2 = arrayList.size() > 0 ? (TopicMoment) arrayList.get(0) : null;
        if (topicMoment2 != null && TextUtils.equals(this.f119951m, topicMoment2.name)) {
            topicMoment = topicMoment2;
        }
        this.f119952n = topicMoment;
        this.f119950l.m144323I(tee0Var.f173807c, arrayList);
        this.f119942d.scrollToPosition(0);
    }

    /* JADX INFO: renamed from: x */
    public void m144316x(String str) {
        zaj0 zaj0Var = this.f119949k;
        if (zaj0Var == null) {
            return;
        }
        this.f119951m = str;
        zaj0Var.m102685i(str);
    }

    /* JADX INFO: renamed from: y */
    public void m144317y(x20 x20Var) {
        this.f119957s = x20Var;
    }

    /* JADX INFO: renamed from: z */
    public void m144318z(x20 x20Var) {
        this.f119958t = x20Var;
    }

    /* JADX INFO: renamed from: l.jbj0$a */
    public class C17919a extends jic0<TopicMoment> {

        /* JADX INFO: renamed from: d */
        public Act f119965d;

        /* JADX INFO: renamed from: e */
        public String f119966e;

        /* JADX INFO: renamed from: c */
        public List<TopicMoment> f119964c = new ArrayList();

        /* JADX INFO: renamed from: f */
        public h80<TopicMoment> f119967f = new a();

        public C17919a(Act act) {
            this.f119965d = act;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m144320H(TopicMoment topicMoment, View view) {
            er60.m122104w().m122113b(topicMoment, "p_add_topic_pop", pf60.m172085a("topic_attribute", Integer.valueOf(TextUtils.isEmpty(this.f119966e) ? 1 : 2)));
            jbj0.this.m144314v(topicMoment, true);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f119964c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return this.f119965d.inflater().inflate(tec0.f173511H3, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final TopicMoment topicMoment, int i, int i2) {
            this.f119967f.m133881h(view, topicMoment, i2);
            ((TopicSearchAssociationItemView) view).m63811b(i2, topicMoment);
            er60.m122104w().m122115d(topicMoment, "p_add_topic_pop", pf60.m172085a("topic_attribute", Integer.valueOf(TextUtils.isEmpty(this.f119966e) ? 1 : 2)));
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.ibj0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f114227a.m144320H(topicMoment, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public TopicMoment getItem(int i) {
            return this.f119964c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public void m144323I(String str, List<TopicMoment> list) {
            this.f119966e = str;
            if (list == null) {
                list = new ArrayList<>();
            }
            this.f119964c.clear();
            this.f119964c.addAll(list);
            notifyDataSetChanged();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
            super.onViewAttachedToWindow(abstractC0569e0);
            this.f119967f.m133884o();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
            super.onViewDetachedFromWindow(abstractC0569e0);
            this.f119967f.m133884o();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: e */
        public void mo48510e(int i) {
        }

        /* JADX INFO: renamed from: l.jbj0$a$a */
        public class a extends h80<TopicMoment> {
            public a() {
            }

            @Override // p153l.h80
            /* JADX INFO: renamed from: f */
            public void mo56877f(ViewGroup viewGroup, ViewGroup viewGroup2) {
            }

            @Override // p153l.h80
            /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
            public void mo65120k(TopicMoment topicMoment, int i, View view) {
            }

            @Override // p153l.h80
            /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
            public void mo56879m(TopicMoment topicMoment, int i, long j, View view) {
            }
        }
    }
}
