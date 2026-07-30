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
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.AtChatGuides;
import com.p046p1.mobile.putong.feed.data.NotifyUsers;
import com.p046p1.mobile.putong.feed.newui.mediapicker.chatat.ChatAtQuestionItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VLinear;

/* JADX INFO: loaded from: classes12.dex */
public class nt4 {

    /* JADX INFO: renamed from: a */
    public VLinear f140415a;

    /* JADX INFO: renamed from: b */
    public ImageView f140416b;

    /* JADX INFO: renamed from: c */
    public TextView f140417c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f140418d;

    /* JADX INFO: renamed from: e */
    public View f140419e;

    /* JADX INFO: renamed from: f */
    public Act f140420f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f140421g;

    /* JADX INFO: renamed from: h */
    public C18769b f140422h;

    /* JADX INFO: renamed from: i */
    public e30<String> f140423i;

    /* JADX INFO: renamed from: j */
    public List<String> f140424j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public l80 f140425k = new C18768a();

    /* JADX INFO: renamed from: l */
    public int f140426l = 0;

    /* JADX INFO: renamed from: l.nt4$a */
    public class C18768a extends l80<String> {
        public C18768a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(String str, int i) {
            p6j0.m167671e("e_problem_guide", "p_moment_post", j760.m140076a("problem", str));
        }
    }

    /* JADX INFO: renamed from: l.nt4$b */
    public class C18769b extends dac0<String> {

        /* JADX INFO: renamed from: c */
        public List<String> f140428c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public Act f140429d;

        /* JADX INFO: renamed from: e */
        public l80 f140430e;

        public C18769b(Act act, l80 l80Var) {
            this.f140429d = act;
            this.f140430e = l80Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m161327H(String str, View view) {
            p6j0.m167669c("e_problem_guide", "p_moment_post", j760.m140076a("problem", str));
            nt4.this.m161319o(str);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f140428c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return this.f140429d.inflater().inflate(o6c0.f142167c0, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, final String str, int i, int i2) {
            ((ChatAtQuestionItemView) view).m62630s(str);
            if (i2 == 0) {
                xdl0.m208358V(view, t100.m186890d(12.0f));
                xdl0.m208359W(view, 0);
            } else if (i2 == getPageCount() - 1) {
                xdl0.m208358V(view, t100.m186890d(6.0f));
                xdl0.m208359W(view, t100.m186890d(12.0f));
            } else {
                xdl0.m208358V(view, t100.m186890d(6.0f));
                xdl0.m208359W(view, 0);
            }
            xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.ot4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f145543a.m161327H(str, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return this.f140428c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public void m161330I(List<String> list) {
            this.f140428c.clear();
            this.f140428c.addAll(list);
            notifyDataSetChanged();
        }

        @Override // p149l.dac0, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
            super.onBindViewHolder(abstractC0566d0, i);
            this.f140430e.m148839h(abstractC0566d0.itemView, this.f140428c.get(i), i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
            super.onViewAttachedToWindow(abstractC0566d0);
            this.f140430e.m148838g(abstractC0566d0.itemView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
            super.onViewDetachedFromWindow(abstractC0566d0);
            this.f140430e.m148840i(abstractC0566d0.itemView);
        }
    }

    public nt4(Act act, FrameLayout frameLayout) {
        this.f140420f = act;
        this.f140421g = frameLayout;
        frameLayout.addView(m161310f(LayoutInflater.from(act), frameLayout));
        NotifyUsers notifyUsersM209356R7 = FeedModule.f38855d.m209356R7(User.ID_WISDOM_STAR);
        if (NullChecker.m81303a(notifyUsersM209356R7)) {
            for (AtChatGuides atChatGuides : notifyUsersM209356R7.guides) {
                if (!TextUtils.isEmpty(atChatGuides.title)) {
                    this.f140424j.add(atChatGuides.title);
                }
            }
        }
        m161313i();
    }

    /* JADX INFO: renamed from: f */
    public View m161310f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pt4.m171281b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: g */
    public void m161311g() {
        if (xdl0.m208349O0(this.f140421g)) {
            xdl0.m208344M(this.f140421g, false);
            this.f140422h.m161330I(new ArrayList());
            if (this.f140419e.getHeight() > 0) {
                m161323s(-this.f140419e.getHeight(), 0, 200, true);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m161312h() {
        int i = this.f140426l;
        if (i > 0) {
            int iM186890d = i + t100.m186890d(185.0f);
            this.f140426l = 0;
            m161324t(iM186890d, t100.m186890d(185.0f), 300);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m161313i() {
        C18769b c18769b = new C18769b(this.f140420f, this.f140425k);
        this.f140422h = c18769b;
        c18769b.m161330I(this.f140424j);
        this.f140418d.setAdapter(this.f140422h);
        this.f140418d.setLayoutManager(new LinearLayoutManager(this.f140420f, 0, false));
        this.f140418d.clearAnimation();
    }

    /* JADX INFO: renamed from: j */
    public boolean m161314j() {
        return xdl0.m208349O0(this.f140421g);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m161315k() {
        this.f140425k.m148842o();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m161316l(boolean z) {
        if (z) {
            xdl0.m208344M(this.f140421g, false);
        }
        this.f140415a.post(new Runnable() { // from class: l.mt4
            @Override // java.lang.Runnable
            public final void run() {
                this.f135552a.m161315k();
            }
        });
        this.f140415a.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m161317m(ValueAnimator valueAnimator) {
        xdl0.m208325C0(this.f140419e, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m161318n(int i) {
        xdl0.m208325C0(this.f140419e, i);
    }

    /* JADX INFO: renamed from: o */
    public final void m161319o(String str) {
        this.f140423i.call(str);
    }

    /* JADX INFO: renamed from: p */
    public void m161320p(e30<String> e30Var) {
        this.f140423i = e30Var;
    }

    /* JADX INFO: renamed from: q */
    public void m161321q() {
        if (xdl0.m208349O0(this.f140421g) || vwb.m200296J(this.f140424j)) {
            return;
        }
        this.f140422h.m161330I(this.f140424j);
        xdl0.m208344M(this.f140421g, true);
        if (this.f140419e.getHeight() > 0) {
            m161323s(this.f140419e.getHeight(), 0, 200, false);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m161322r(int i) {
        if (this.f140426l == i) {
            return;
        }
        this.f140426l = i;
        int iM186890d = t100.m186890d(185.0f) + i;
        if (i > 0) {
            m161324t(t100.m186890d(185.0f), iM186890d, 200);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m161323s(int i, int i2, int i3, final boolean z) {
        Animator animatorM103743p = bt0.m103743p(this.f140415a, "translationY", 0L, i3, new LinearInterpolator(), i, i2);
        bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.jt4
            @Override // java.lang.Runnable
            public final void run() {
                this.f119568a.m161316l(z);
            }
        });
        animatorM103743p.start();
    }

    /* JADX INFO: renamed from: t */
    public final void m161324t(int i, final int i2, int i3) {
        Animator animatorM103738k = bt0.m103738k(ValueAnimator.ofInt(i, i2), new LinearInterpolator(), 0L, i3);
        ((ValueAnimator) animatorM103738k).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kt4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f124563a.m161317m(valueAnimator);
            }
        });
        bt0.m103733f(animatorM103738k, new Runnable() { // from class: l.lt4
            @Override // java.lang.Runnable
            public final void run() {
                this.f129933a.m161318n(i2);
            }
        });
        animatorM103738k.start();
    }
}
