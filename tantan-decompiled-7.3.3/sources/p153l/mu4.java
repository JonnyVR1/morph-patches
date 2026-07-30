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
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.AtChatGuides;
import com.p051p1.mobile.putong.feed.data.NotifyUsers;
import com.p051p1.mobile.putong.feed.newui.mediapicker.chatat.ChatAtQuestionItemView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VLinear;

/* JADX INFO: loaded from: classes13.dex */
public class mu4 {

    /* JADX INFO: renamed from: a */
    public VLinear f138722a;

    /* JADX INFO: renamed from: b */
    public ImageView f138723b;

    /* JADX INFO: renamed from: c */
    public TextView f138724c;

    /* JADX INFO: renamed from: d */
    public RecyclerView f138725d;

    /* JADX INFO: renamed from: e */
    public View f138726e;

    /* JADX INFO: renamed from: f */
    public Act f138727f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f138728g;

    /* JADX INFO: renamed from: h */
    public C18712b f138729h;

    /* JADX INFO: renamed from: i */
    public y20<String> f138730i;

    /* JADX INFO: renamed from: j */
    public List<String> f138731j = new ArrayList();

    /* JADX INFO: renamed from: k */
    public h80 f138732k = new C18711a();

    /* JADX INFO: renamed from: l */
    public int f138733l = 0;

    /* JADX INFO: renamed from: l.mu4$a */
    public class C18711a extends h80<String> {
        public C18711a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(String str, int i) {
            tfj0.m190942e("e_problem_guide", "p_moment_post", pf60.m172085a("problem", str));
        }
    }

    /* JADX INFO: renamed from: l.mu4$b */
    public class C18712b extends jic0<String> {

        /* JADX INFO: renamed from: c */
        public List<String> f138735c = new ArrayList();

        /* JADX INFO: renamed from: d */
        public Act f138736d;

        /* JADX INFO: renamed from: e */
        public h80 f138737e;

        public C18712b(Act act, h80 h80Var) {
            this.f138736d = act;
            this.f138737e = h80Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m160098H(String str, View view) {
            tfj0.m190940c("e_problem_guide", "p_moment_post", pf60.m172085a("problem", str));
            mu4.this.m160090o(str);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f138735c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return this.f138736d.inflater().inflate(tec0.f173636c0, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, final String str, int i, int i2) {
            ((ChatAtQuestionItemView) view).m63813s(str);
            if (i2 == 0) {
                bnl0.m105538V(view, qa00.m175859d(12.0f));
                bnl0.m105539W(view, 0);
            } else if (i2 == getPageCount() - 1) {
                bnl0.m105538V(view, qa00.m175859d(6.0f));
                bnl0.m105539W(view, qa00.m175859d(12.0f));
            } else {
                bnl0.m105538V(view, qa00.m175859d(6.0f));
                bnl0.m105539W(view, 0);
            }
            bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.nu4
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f143675a.m160098H(str, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public String getItem(int i) {
            return this.f138735c.get(i);
        }

        /* JADX INFO: renamed from: I */
        public void m160101I(List<String> list) {
            this.f138735c.clear();
            this.f138735c.addAll(list);
            notifyDataSetChanged();
        }

        @Override // p153l.jic0, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
            super.onBindViewHolder(abstractC0569e0, i);
            this.f138737e.m133881h(abstractC0569e0.itemView, this.f138735c.get(i), i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewAttachedToWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
            super.onViewAttachedToWindow(abstractC0569e0);
            this.f138737e.m133880g(abstractC0569e0.itemView);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onViewDetachedFromWindow(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
            super.onViewDetachedFromWindow(abstractC0569e0);
            this.f138737e.m133882i(abstractC0569e0.itemView);
        }
    }

    public mu4(Act act, FrameLayout frameLayout) {
        this.f138727f = act;
        this.f138728g = frameLayout;
        frameLayout.addView(m160081f(LayoutInflater.from(act), frameLayout));
        NotifyUsers notifyUsersM145597R7 = FeedModule.f39703d.m145597R7(User.ID_WISDOM_STAR);
        if (NullChecker.m82486a(notifyUsersM145597R7)) {
            for (AtChatGuides atChatGuides : notifyUsersM145597R7.guides) {
                if (!TextUtils.isEmpty(atChatGuides.title)) {
                    this.f138731j.add(atChatGuides.title);
                }
            }
        }
        m160084i();
    }

    /* JADX INFO: renamed from: f */
    public View m160081f(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ou4.m169221b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: g */
    public void m160082g() {
        if (bnl0.m105529O0(this.f138728g)) {
            bnl0.m105524M(this.f138728g, false);
            this.f138729h.m160101I(new ArrayList());
            if (this.f138726e.getHeight() > 0) {
                m160094s(-this.f138726e.getHeight(), 0, 200, true);
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public void m160083h() {
        int i = this.f138733l;
        if (i > 0) {
            int iM175859d = i + qa00.m175859d(185.0f);
            this.f138733l = 0;
            m160095t(iM175859d, qa00.m175859d(185.0f), 300);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m160084i() {
        C18712b c18712b = new C18712b(this.f138727f, this.f138732k);
        this.f138729h = c18712b;
        c18712b.m160101I(this.f138731j);
        this.f138725d.setAdapter(this.f138729h);
        this.f138725d.setLayoutManager(new LinearLayoutManager(this.f138727f, 0, false));
        this.f138725d.clearAnimation();
    }

    /* JADX INFO: renamed from: j */
    public boolean m160085j() {
        return bnl0.m105529O0(this.f138728g);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m160086k() {
        this.f138732k.m133884o();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m160087l(boolean z) {
        if (z) {
            bnl0.m105524M(this.f138728g, false);
        }
        this.f138722a.post(new Runnable() { // from class: l.lu4
            @Override // java.lang.Runnable
            public final void run() {
                this.f133592a.m160086k();
            }
        });
        this.f138722a.setTranslationY(0.0f);
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m160088m(ValueAnimator valueAnimator) {
        bnl0.m105505C0(this.f138726e, ((Integer) valueAnimator.getAnimatedValue()).intValue());
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m160089n(int i) {
        bnl0.m105505C0(this.f138726e, i);
    }

    /* JADX INFO: renamed from: o */
    public final void m160090o(String str) {
        this.f138730i.call(str);
    }

    /* JADX INFO: renamed from: p */
    public void m160091p(y20<String> y20Var) {
        this.f138730i = y20Var;
    }

    /* JADX INFO: renamed from: q */
    public void m160092q() {
        if (bnl0.m105529O0(this.f138728g) || jyb.m147479J(this.f138731j)) {
            return;
        }
        this.f138729h.m160101I(this.f138731j);
        bnl0.m105524M(this.f138728g, true);
        if (this.f138726e.getHeight() > 0) {
            m160094s(this.f138726e.getHeight(), 0, 200, false);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m160093r(int i) {
        if (this.f138733l == i) {
            return;
        }
        this.f138733l = i;
        int iM175859d = qa00.m175859d(185.0f) + i;
        if (i > 0) {
            m160095t(qa00.m175859d(185.0f), iM175859d, 200);
        }
    }

    /* JADX INFO: renamed from: s */
    public final void m160094s(int i, int i2, int i3, final boolean z) {
        Animator animatorM132170p = gt0.m132170p(this.f138722a, "translationY", 0L, i3, new LinearInterpolator(), i, i2);
        gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.iu4
            @Override // java.lang.Runnable
            public final void run() {
                this.f116889a.m160087l(z);
            }
        });
        animatorM132170p.start();
    }

    /* JADX INFO: renamed from: t */
    public final void m160095t(int i, final int i2, int i3) {
        Animator animatorM132165k = gt0.m132165k(ValueAnimator.ofInt(i, i2), new LinearInterpolator(), 0L, i3);
        ((ValueAnimator) animatorM132165k).addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ju4
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f122689a.m160088m(valueAnimator);
            }
        });
        gt0.m132160f(animatorM132165k, new Runnable() { // from class: l.ku4
            @Override // java.lang.Runnable
            public final void run() {
                this.f128811a.m160089n(i2);
            }
        });
        animatorM132165k.start();
    }
}
