package com.p000p1.mobile.putong.live.livingroom.common.signin.medal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.common.signin.C0358a;
import com.p1.mobile.putong.live.base.data.BLiveSignInAchievementMedals;
import com.p1.mobile.putong.live.base.data.BLiveSignInMedal;
import com.p1.mobile.putong.live.base.view.DialogTitleBar;
import java.util.List;
import l.dac0;
import l.eb2;
import l.t100;
import l.vwb;
import l.xdl0;
import p002l.t6c0;
import p002l.u3f0;
import v.VImage;
import v.VPager;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class SignInMedalFrame extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public DialogTitleBar f5385a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f5386b;

    /* JADX INFO: renamed from: c */
    public VPager f5387c;

    /* JADX INFO: renamed from: d */
    public VImage f5388d;

    /* JADX INFO: renamed from: e */
    public VImage f5389e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f5390f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f5391g;

    /* JADX INFO: renamed from: h */
    public MedalProgressView f5392h;

    /* JADX INFO: renamed from: i */
    public VText f5393i;

    /* JADX INFO: renamed from: j */
    public VText f5394j;

    /* JADX INFO: renamed from: k */
    public C0358a f5395k;

    /* JADX INFO: renamed from: l */
    public int f5396l;

    /* JADX INFO: renamed from: m */
    public int f5397m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame$a */
    public class C0365a extends RecyclerView.n {
        public C0365a() {
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            rect.set(0, 0, (recyclerView.getChildAdapterPosition(view) == SignInMedalFrame.this.f5397m - 1 || SignInMedalFrame.this.f5397m == 1) ? 0 : (((SignInMedalFrame.this.f5390f.getWidth() - SignInMedalFrame.this.f5390f.getPaddingStart()) - SignInMedalFrame.this.f5390f.getPaddingEnd()) - (SignInMedalFrame.this.f5397m * t100.d(54.0f))) / (SignInMedalFrame.this.f5397m - 1), 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame$b */
    public class C0366b extends ViewPager.m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveSignInAchievementMedals f5399a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C0368d f5400b;

        public C0366b(BLiveSignInAchievementMedals bLiveSignInAchievementMedals, C0368d c0368d) {
            this.f5399a = bLiveSignInAchievementMedals;
            this.f5400b = c0368d;
        }

        public void onPageSelected(int i) {
            SignInMedalFrame.this.f5396l = i;
            SignInMedalFrame.this.m6787m(this.f5399a.medals.size());
            this.f5400b.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame$c */
    public static class C0367c extends eb2 {

        /* JADX INFO: renamed from: e */
        public final List<BLiveSignInMedal> f5402e;

        public C0367c(List<BLiveSignInMedal> list) {
            this.f5402e = list;
        }

        public int getCount() {
            return this.f5402e.size();
        }

        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        /* JADX INFO: renamed from: o */
        public void m6789o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        /* JADX INFO: renamed from: p */
        public Object m6790p(ViewGroup viewGroup, int i) {
            BigMedal bigMedal = (BigMedal) View.inflate(viewGroup.getContext(), t6c0.f19521F5, null);
            viewGroup.addView(bigMedal);
            bigMedal.m6774b(this.f5402e.get(i));
            return bigMedal;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame$d */
    public class C0368d extends dac0<BLiveSignInMedal> {

        /* JADX INFO: renamed from: c */
        public final List<BLiveSignInMedal> f5403c;

        public C0368d(List<BLiveSignInMedal> list) {
            this.f5403c = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m6792H(int i, View view) {
            SignInMedalFrame.this.f5387c.T(i, false);
        }

        /* JADX INFO: renamed from: C */
        public int m6794C() {
            return this.f5403c.size();
        }

        /* JADX INFO: renamed from: D */
        public View m6795D(ViewGroup viewGroup, int i) {
            View viewInflate = View.inflate(viewGroup.getContext(), t6c0.f19545H5, null);
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(t100.d(54.0f), t100.d(54.0f)));
            return viewInflate;
        }

        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void m6793A(View view, BLiveSignInMedal bLiveSignInMedal, int i, final int i2) {
            ((SmallMedal) view).m6799b(bLiveSignInMedal, SignInMedalFrame.this.f5396l == i2);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.t3f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f19411a.m6792H(i2, view2);
                }
            });
        }

        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public BLiveSignInMedal getItem(int i) {
            return this.f5403c.get(i);
        }
    }

    public SignInMedalFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: h */
    public final void m6782h(View view) {
        u3f0.m23276a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m6783i(C0358a c0358a) {
        this.f5395k = c0358a;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m6784j(View view) {
        C0358a c0358a = this.f5395k;
        if (c0358a != null) {
            c0358a.m6702r4(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m6785k(View view) {
        int i = this.f5396l;
        if (i > 0) {
            VPager vPager = this.f5387c;
            int i2 = i - 1;
            this.f5396l = i2;
            vPager.setCurrentItem(i2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m6786l(BLiveSignInAchievementMedals bLiveSignInAchievementMedals, View view) {
        if (this.f5396l < bLiveSignInAchievementMedals.medals.size() - 1) {
            VPager vPager = this.f5387c;
            int i = this.f5396l + 1;
            this.f5396l = i;
            vPager.setCurrentItem(i);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m6787m(int i) {
        xdl0.M(this.f5388d, this.f5396l >= 1);
        xdl0.M(this.f5389e, this.f5396l <= i + (-2));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n */
    public void m6788n(final BLiveSignInAchievementMedals bLiveSignInAchievementMedals) {
        if (!vwb.J(bLiveSignInAchievementMedals.medals)) {
            this.f5397m = bLiveSignInAchievementMedals.medals.size();
            this.f5396l = 0;
            for (int size = bLiveSignInAchievementMedals.medals.size() - 1; size >= 0; size--) {
                if (((BLiveSignInMedal) bLiveSignInAchievementMedals.medals.get(size)).show) {
                    this.f5396l = size;
                    break;
                }
            }
            m6787m(bLiveSignInAchievementMedals.medals.size());
            C0368d c0368d = new C0368d(bLiveSignInAchievementMedals.medals);
            this.f5390f.setAdapter(c0368d);
            this.f5387c.setAdapter(new C0367c(bLiveSignInAchievementMedals.medals));
            this.f5387c.setOnPageChangeListener(new C0366b(bLiveSignInAchievementMedals, c0368d));
            this.f5387c.T(this.f5396l, false);
            this.f5388d.setOnClickListener(new View.OnClickListener() { // from class: l.r3f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18353a.m6785k(view);
                }
            });
            this.f5389e.setOnClickListener(new View.OnClickListener() { // from class: l.s3f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18777a.m6786l(bLiveSignInAchievementMedals, view);
                }
            });
        }
        if (!vwb.J(bLiveSignInAchievementMedals.progress) && bLiveSignInAchievementMedals.progress.size() == 2) {
            this.f5393i.setText(bLiveSignInAchievementMedals.progress.get(0) + "/" + bLiveSignInAchievementMedals.progress.get(1));
            this.f5392h.setProgress(Math.abs((((float) ((Integer) bLiveSignInAchievementMedals.progress.get(0)).intValue()) * 1.0f) / ((float) ((Integer) bLiveSignInAchievementMedals.progress.get(1)).intValue())));
        }
        if (vwb.J(bLiveSignInAchievementMedals.explainContents)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bLiveSignInAchievementMedals.explainContents.size(); i++) {
            sb.append((String) bLiveSignInAchievementMedals.explainContents.get(i));
            if (i != bLiveSignInAchievementMedals.explainContents.size() - 1) {
                sb.append("\n");
            }
        }
        this.f5394j.setText(sb.toString());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6782h(this);
        this.f5390f.setHasFixedSize(true);
        this.f5390f.setOverScrollMode(2);
        this.f5390f.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f5390f.addItemDecoration(new C0365a());
        this.f5385a.d(R$string.f2810Jd, true);
        this.f5385a.setBackListener(new View.OnClickListener() { // from class: l.q3f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f17795a.m6784j(view);
            }
        });
        this.f5385a.setLeftView(1);
        this.f5385a.setDivider(true);
    }
}
