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
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.data.GivenGiftBrief;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.AtChatGuides;
import com.p000p1.mobile.putong.feed.data.NotifyUsers;
import com.p000p1.mobile.putong.feed.newui.mediapicker.chatat.ChatAtQuestionItemView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.bt0;
import l.dac0;
import l.e30;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class nt4 {

    /* JADX INFO: renamed from: a */
    public VLinear f10861a;

    /* JADX INFO: renamed from: b */
    public ImageView f10862b;

    /* JADX INFO: renamed from: c */
    public TextView f10863c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f10864d;

    /* JADX INFO: renamed from: e */
    public View f10865e;

    /* JADX INFO: renamed from: f */
    public Act f10866f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f10867g;

    /* JADX INFO: renamed from: h */
    public C2442b f10868h;

    /* JADX INFO: renamed from: i */
    public e30<String> f10869i;

    /* JADX INFO: renamed from: j */
    public List<String> f10870j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public l80 f10871k = new C2441a();

    /* JADX INFO: renamed from: l */
    public int f10872l = 0;

    /* JADX INFO: renamed from: l.nt4$a */
    public class C2441a extends l80<String> {
        public C2441a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(String str, int i) {
            p6j0.m12915e("e_problem_guide", "p_moment_post", j760.a("problem", str));
        }
    }

    /* JADX INFO: renamed from: l.nt4$b */
    public class C2442b extends dac0<String> {

        /* JADX INFO: renamed from: c */
        public List<String> f10874c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public Act f10875d;

        /* JADX INFO: renamed from: e */
        public l80 f10876e;

        public C2442b(Act act, l80 l80Var) {
            this.f10875d = act;
            this.f10876e = l80Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m12327H(String str, View view) {
            p6j0.m12913c("e_problem_guide", "p_moment_post", j760.a("problem", str));
            nt4.this.m12319o(str);
        }

        /* JADX INFO: renamed from: C */
        public int m12329C() {
            return this.f10874c.size();
        }

        /* JADX INFO: renamed from: D */
        public View m12330D(ViewGroup viewGroup, int i) {
            return this.f10875d.inflater().inflate(o6c0.f11186c0, viewGroup, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m12328A(View view, final String str, int i, int i2) {
            ((ChatAtQuestionItemView) view).m3635s(str);
            if (i2 == 0) {
                xdl0.V(view, t100.d(12.0f));
                xdl0.W(view, 0);
            } else if (i2 == m12329C() - 1) {
                xdl0.V(view, t100.d(6.0f));
                xdl0.W(view, t100.d(12.0f));
            } else {
                xdl0.V(view, t100.d(6.0f));
                xdl0.W(view, 0);
            }
            xdl0.E0(view, new View.OnClickListener() { // from class: l.ot4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f11613a.m12327H(str, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return this.f10874c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public void m12333I(List<String> list) {
            this.f10874c.clear();
            this.f10874c.addAll(list);
            notifyDataSetChanged();
        }

        public void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
            super.onBindViewHolder(d0Var, i);
            this.f10876e.m11594h(d0Var.itemView, this.f10874c.get(i), i);
        }

        public void onViewAttachedToWindow(@NonNull RecyclerView.d0 d0Var) {
            super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewAttachedToWindow(d0Var);
            this.f10876e.m11593g(d0Var.itemView);
        }

        public void onViewDetachedFromWindow(@NonNull RecyclerView.d0 d0Var) {
            super/*androidx.recyclerview.widget.RecyclerView.Adapter*/.onViewDetachedFromWindow(d0Var);
            this.f10876e.m11595i(d0Var.itemView);
        }
    }

    public nt4(Act act, FrameLayout frameLayout) {
        this.f10866f = act;
        this.f10867g = frameLayout;
        frameLayout.addView(m12310f(LayoutInflater.from(act), frameLayout));
        NotifyUsers notifyUsersM16537R7 = FeedModule.f316d.m16537R7(User.ID_WISDOM_STAR);
        if (NullChecker.a(notifyUsersM16537R7)) {
            for (AtChatGuides atChatGuides : notifyUsersM16537R7.guides) {
                if (!TextUtils.isEmpty(atChatGuides.title)) {
                    this.f10870j.add(atChatGuides.title);
                }
            }
        }
        m12313i();
    }

    /* JADX INFO: renamed from: f */
    public View m12310f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pt4.m13217b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: g */
    public void m12311g() {
        if (xdl0.O0(this.f10867g)) {
            xdl0.M(this.f10867g, false);
            this.f10868h.m12333I(new ArrayList());
            if (this.f10865e.getHeight() > 0) {
                m12323s(-this.f10865e.getHeight(), 0, GivenGiftBrief.ADVANCED_GIFT_LEVEL, true);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m12312h() {
        int i = this.f10872l;
        if (i > 0) {
            int iD = i + t100.d(185.0f);
            this.f10872l = 0;
            m12324t(iD, t100.d(185.0f), GivenGiftBrief.LUXURY_GIFT_LEVEL);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m12313i() {
        C2442b c2442b = new C2442b(this.f10866f, this.f10871k);
        this.f10868h = c2442b;
        c2442b.m12333I(this.f10870j);
        this.f10864d.setAdapter(this.f10868h);
        this.f10864d.setLayoutManager(new LinearLayoutManager(this.f10866f, 0, false));
        this.f10864d.clearAnimation();
    }

    /* JADX INFO: renamed from: j */
    public boolean m12314j() {
        return xdl0.O0(this.f10867g);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m12315k() {
        this.f10871k.m11597o();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m12316l(boolean z) {
        if (z) {
            xdl0.M(this.f10867g, false);
        }
        this.f10861a.post(new Runnable() { // from class: l.mt4
            @Override // java.lang.Runnable
            public final void run() {
                this.f10565a.m12315k();
            }
        });
        this.f10861a.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m12317m(ValueAnimator valueAnimator) {
        xdl0.C0(this.f10865e, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m12318n(int i) {
        xdl0.C0(this.f10865e, i);
    }

    /* JADX INFO: renamed from: o */
    public final void m12319o(String str) {
        this.f10869i.call(str);
    }

    /* JADX INFO: renamed from: p */
    public void m12320p(e30<String> e30Var) {
        this.f10869i = e30Var;
    }

    /* JADX INFO: renamed from: q */
    public void m12321q() {
        if (xdl0.O0(this.f10867g) || vwb.J(this.f10870j)) {
            return;
        }
        this.f10868h.m12333I(this.f10870j);
        xdl0.M(this.f10867g, true);
        if (this.f10865e.getHeight() > 0) {
            m12323s(this.f10865e.getHeight(), 0, GivenGiftBrief.ADVANCED_GIFT_LEVEL, false);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m12322r(int i) {
        if (this.f10872l == i) {
            return;
        }
        this.f10872l = i;
        int iD = t100.d(185.0f) + i;
        if (i > 0) {
            m12324t(t100.d(185.0f), iD, GivenGiftBrief.ADVANCED_GIFT_LEVEL);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m12323s(int i, int i2, int i3, final boolean z) {
        Animator animatorP = bt0.p(this.f10861a, "translationY", 0L, i3, new LinearInterpolator(), new float[]{i, i2});
        bt0.f(animatorP, new Runnable() { // from class: l.jt4
            @Override // java.lang.Runnable
            public final void run() {
                this.f9514a.m12316l(z);
            }
        });
        animatorP.start();
    }

    /* JADX INFO: renamed from: t */
    public final void m12324t(int i, final int i2, int i3) {
        Animator animatorK = bt0.k(ValueAnimator.ofInt(i, i2), new LinearInterpolator(), 0L, i3);
        ((ValueAnimator) animatorK).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kt4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9788a.m12317m(valueAnimator);
            }
        });
        bt0.f(animatorK, new Runnable() { // from class: l.lt4
            @Override // java.lang.Runnable
            public final void run() {
                this.f10129a.m12318n(i2);
            }
        });
        animatorK.start();
    }
}
