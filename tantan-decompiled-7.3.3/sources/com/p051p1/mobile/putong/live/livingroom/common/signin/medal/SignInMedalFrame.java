package com.p051p1.mobile.putong.live.livingroom.common.signin.medal;

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
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInAchievementMedals;
import com.p051p1.mobile.putong.live.base.data.BLiveSignInMedal;
import com.p051p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.common.signin.C12932a;
import java.util.List;
import p151v.VImage;
import p151v.VPager;
import p151v.VText;
import p153l.bcf0;
import p153l.bnl0;
import p153l.jic0;
import p153l.jyb;
import p153l.lb2;
import p153l.qa00;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public class SignInMedalFrame extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public DialogTitleBar f50191a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f50192b;

    /* JADX INFO: renamed from: c */
    public VPager f50193c;

    /* JADX INFO: renamed from: d */
    public VImage f50194d;

    /* JADX INFO: renamed from: e */
    public VImage f50195e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f50196f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f50197g;

    /* JADX INFO: renamed from: h */
    public MedalProgressView f50198h;

    /* JADX INFO: renamed from: i */
    public VText f50199i;

    /* JADX INFO: renamed from: j */
    public VText f50200j;

    /* JADX INFO: renamed from: k */
    public C12932a f50201k;

    /* JADX INFO: renamed from: l */
    public int f50202l;

    /* JADX INFO: renamed from: m */
    public int f50203m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame$a */
    public class C12939a extends RecyclerView.AbstractC0578n {
        public C12939a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            rect.set(0, 0, (recyclerView.getChildAdapterPosition(view) == SignInMedalFrame.this.f50203m - 1 || SignInMedalFrame.this.f50203m == 1) ? 0 : (((SignInMedalFrame.this.f50196f.getWidth() - SignInMedalFrame.this.f50196f.getPaddingStart()) - SignInMedalFrame.this.f50196f.getPaddingEnd()) - (SignInMedalFrame.this.f50203m * qa00.m175859d(54.0f))) / (SignInMedalFrame.this.f50203m - 1), 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame$b */
    public class C12940b extends ViewPager.C0721m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveSignInAchievementMedals f50205a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C12942d f50206b;

        public C12940b(BLiveSignInAchievementMedals bLiveSignInAchievementMedals, C12942d c12942d) {
            this.f50205a = bLiveSignInAchievementMedals;
            this.f50206b = c12942d;
        }

        @Override // androidx.viewpager.widget.ViewPager.C0721m, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            SignInMedalFrame.this.f50202l = i;
            SignInMedalFrame.this.m74440m(this.f50205a.medals.size());
            this.f50206b.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame$c */
    public static class C12941c extends lb2 {

        /* JADX INFO: renamed from: e */
        public final List<BLiveSignInMedal> f50208e;

        public C12941c(List<BLiveSignInMedal> list) {
            this.f50208e = list;
        }

        @Override // p153l.cf60
        public int getCount() {
            return this.f50208e.size();
        }

        @Override // p153l.cf60
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: o */
        public void mo40045o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p153l.lb2
        /* JADX INFO: renamed from: p */
        public Object mo40046p(ViewGroup viewGroup, int i) {
            BigMedal bigMedal = (BigMedal) View.inflate(viewGroup.getContext(), yec0.f198757F5, null);
            viewGroup.addView(bigMedal);
            bigMedal.m74427b(this.f50208e.get(i));
            return bigMedal;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame$d */
    public class C12942d extends jic0<BLiveSignInMedal> {

        /* JADX INFO: renamed from: c */
        public final List<BLiveSignInMedal> f50209c;

        public C12942d(List<BLiveSignInMedal> list) {
            this.f50209c = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m74443H(int i, View view) {
            SignInMedalFrame.this.f50193c.m4178T(i, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f50209c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            View viewInflate = View.inflate(viewGroup.getContext(), yec0.f198781H5, null);
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(qa00.m175859d(54.0f), qa00.m175859d(54.0f)));
            return viewInflate;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, BLiveSignInMedal bLiveSignInMedal, int i, final int i2) {
            ((SmallMedal) view).m74447b(bLiveSignInMedal, SignInMedalFrame.this.f50202l == i2);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.acf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f69702a.m74443H(i2, view2);
                }
            });
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public BLiveSignInMedal getItem(int i) {
            return this.f50209c.get(i);
        }
    }

    public SignInMedalFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: h */
    public final void m74435h(View view) {
        bcf0.m103505a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m74436i(C12932a c12932a) {
        this.f50201k = c12932a;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m74437j(View view) {
        C12932a c12932a = this.f50201k;
        if (c12932a != null) {
            c12932a.m74357r4(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m74438k(View view) {
        int i = this.f50202l;
        if (i > 0) {
            VPager vPager = this.f50193c;
            int i2 = i - 1;
            this.f50202l = i2;
            vPager.setCurrentItem(i2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m74439l(BLiveSignInAchievementMedals bLiveSignInAchievementMedals, View view) {
        if (this.f50202l < bLiveSignInAchievementMedals.medals.size() - 1) {
            VPager vPager = this.f50193c;
            int i = this.f50202l + 1;
            this.f50202l = i;
            vPager.setCurrentItem(i);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m74440m(int i) {
        bnl0.m105524M(this.f50194d, this.f50202l >= 1);
        bnl0.m105524M(this.f50195e, this.f50202l <= i + (-2));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n */
    public void m74441n(final BLiveSignInAchievementMedals bLiveSignInAchievementMedals) {
        if (!jyb.m147479J(bLiveSignInAchievementMedals.medals)) {
            this.f50203m = bLiveSignInAchievementMedals.medals.size();
            this.f50202l = 0;
            for (int size = bLiveSignInAchievementMedals.medals.size() - 1; size >= 0; size--) {
                if (bLiveSignInAchievementMedals.medals.get(size).show) {
                    this.f50202l = size;
                    break;
                }
            }
            m74440m(bLiveSignInAchievementMedals.medals.size());
            C12942d c12942d = new C12942d(bLiveSignInAchievementMedals.medals);
            this.f50196f.setAdapter(c12942d);
            this.f50193c.setAdapter(new C12941c(bLiveSignInAchievementMedals.medals));
            this.f50193c.setOnPageChangeListener(new C12940b(bLiveSignInAchievementMedals, c12942d));
            this.f50193c.m4178T(this.f50202l, false);
            this.f50194d.setOnClickListener(new View.OnClickListener() { // from class: l.ybf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f198305a.m74438k(view);
                }
            });
            this.f50195e.setOnClickListener(new View.OnClickListener() { // from class: l.zbf0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f203666a.m74439l(bLiveSignInAchievementMedals, view);
                }
            });
        }
        if (!jyb.m147479J(bLiveSignInAchievementMedals.progress) && bLiveSignInAchievementMedals.progress.size() == 2) {
            this.f50199i.setText(bLiveSignInAchievementMedals.progress.get(0) + "/" + bLiveSignInAchievementMedals.progress.get(1));
            this.f50198h.setProgress(Math.abs((((float) bLiveSignInAchievementMedals.progress.get(0).intValue()) * 1.0f) / ((float) bLiveSignInAchievementMedals.progress.get(1).intValue())));
        }
        if (jyb.m147479J(bLiveSignInAchievementMedals.explainContents)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bLiveSignInAchievementMedals.explainContents.size(); i++) {
            sb.append(bLiveSignInAchievementMedals.explainContents.get(i));
            if (i != bLiveSignInAchievementMedals.explainContents.size() - 1) {
                sb.append(SignParameters.NEW_LINE);
            }
        }
        this.f50200j.setText(sb.toString());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74435h(this);
        this.f50196f.setHasFixedSize(true);
        this.f50196f.setOverScrollMode(2);
        this.f50196f.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f50196f.addItemDecoration(new C12939a());
        this.f50191a.m69896d(R$string.f47616Jd, true);
        this.f50191a.setBackListener(new View.OnClickListener() { // from class: l.xbf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193159a.m74437j(view);
            }
        });
        this.f50191a.setLeftView(1);
        this.f50191a.setDivider(true);
    }
}
