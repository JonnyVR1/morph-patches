package com.p046p1.mobile.putong.live.livingroom.common.signin.medal;

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
import com.p046p1.mobile.putong.live.base.data.BLiveSignInAchievementMedals;
import com.p046p1.mobile.putong.live.base.data.BLiveSignInMedal;
import com.p046p1.mobile.putong.live.base.view.DialogTitleBar;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.common.signin.C12769a;
import java.util.List;
import p147v.VImage;
import p147v.VPager;
import p147v.VText;
import p149l.dac0;
import p149l.eb2;
import p149l.t100;
import p149l.t6c0;
import p149l.u3f0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
public class SignInMedalFrame extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public DialogTitleBar f49343a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f49344b;

    /* JADX INFO: renamed from: c */
    public VPager f49345c;

    /* JADX INFO: renamed from: d */
    public VImage f49346d;

    /* JADX INFO: renamed from: e */
    public VImage f49347e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f49348f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f49349g;

    /* JADX INFO: renamed from: h */
    public MedalProgressView f49350h;

    /* JADX INFO: renamed from: i */
    public VText f49351i;

    /* JADX INFO: renamed from: j */
    public VText f49352j;

    /* JADX INFO: renamed from: k */
    public C12769a f49353k;

    /* JADX INFO: renamed from: l */
    public int f49354l;

    /* JADX INFO: renamed from: m */
    public int f49355m;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame$a */
    public class C12776a extends RecyclerView.AbstractC0576n {
        public C12776a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            rect.set(0, 0, (recyclerView.getChildAdapterPosition(view) == SignInMedalFrame.this.f49355m - 1 || SignInMedalFrame.this.f49355m == 1) ? 0 : (((SignInMedalFrame.this.f49348f.getWidth() - SignInMedalFrame.this.f49348f.getPaddingStart()) - SignInMedalFrame.this.f49348f.getPaddingEnd()) - (SignInMedalFrame.this.f49355m * t100.m186890d(54.0f))) / (SignInMedalFrame.this.f49355m - 1), 0);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame$b */
    public class C12777b extends ViewPager.C0719m {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ BLiveSignInAchievementMedals f49357a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C12779d f49358b;

        public C12777b(BLiveSignInAchievementMedals bLiveSignInAchievementMedals, C12779d c12779d) {
            this.f49357a = bLiveSignInAchievementMedals;
            this.f49358b = c12779d;
        }

        @Override // androidx.viewpager.widget.ViewPager.C0719m, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            SignInMedalFrame.this.f49354l = i;
            SignInMedalFrame.this.m73257m(this.f49357a.medals.size());
            this.f49358b.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame$c */
    public static class C12778c extends eb2 {

        /* JADX INFO: renamed from: e */
        public final List<BLiveSignInMedal> f49360e;

        public C12778c(List<BLiveSignInMedal> list) {
            this.f49360e = list;
        }

        @Override // p149l.w660
        public int getCount() {
            return this.f49360e.size();
        }

        @Override // p149l.w660
        public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
            return view == obj;
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: o */
        public void mo39042o(ViewGroup viewGroup, int i, Object obj) {
            viewGroup.removeView((View) obj);
        }

        @Override // p149l.eb2
        /* JADX INFO: renamed from: p */
        public Object mo39043p(ViewGroup viewGroup, int i) {
            BigMedal bigMedal = (BigMedal) View.inflate(viewGroup.getContext(), t6c0.f168025F5, null);
            viewGroup.addView(bigMedal);
            bigMedal.m73244b(this.f49360e.get(i));
            return bigMedal;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.common.signin.medal.SignInMedalFrame$d */
    public class C12779d extends dac0<BLiveSignInMedal> {

        /* JADX INFO: renamed from: c */
        public final List<BLiveSignInMedal> f49361c;

        public C12779d(List<BLiveSignInMedal> list) {
            this.f49361c = list;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: H */
        public /* synthetic */ void m73260H(int i, View view) {
            SignInMedalFrame.this.f49345c.m4176T(i, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f49361c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            View viewInflate = View.inflate(viewGroup.getContext(), t6c0.f168049H5, null);
            viewInflate.setLayoutParams(new ViewGroup.LayoutParams(t100.m186890d(54.0f), t100.m186890d(54.0f)));
            return viewInflate;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, BLiveSignInMedal bLiveSignInMedal, int i, final int i2) {
            ((SmallMedal) view).m73264b(bLiveSignInMedal, SignInMedalFrame.this.f49354l == i2);
            view.setOnClickListener(new View.OnClickListener() { // from class: l.t3f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f167632a.m73260H(i2, view2);
                }
            });
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public BLiveSignInMedal getItem(int i) {
            return this.f49361c.get(i);
        }
    }

    public SignInMedalFrame(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* JADX INFO: renamed from: h */
    public final void m73252h(View view) {
        u3f0.m191574a(this, view);
    }

    /* JADX INFO: renamed from: i */
    public void m73253i(C12769a c12769a) {
        this.f49353k = c12769a;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m73254j(View view) {
        C12769a c12769a = this.f49353k;
        if (c12769a != null) {
            c12769a.m73174r4(false);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m73255k(View view) {
        int i = this.f49354l;
        if (i > 0) {
            VPager vPager = this.f49345c;
            int i2 = i - 1;
            this.f49354l = i2;
            vPager.setCurrentItem(i2);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m73256l(BLiveSignInAchievementMedals bLiveSignInAchievementMedals, View view) {
        if (this.f49354l < bLiveSignInAchievementMedals.medals.size() - 1) {
            VPager vPager = this.f49345c;
            int i = this.f49354l + 1;
            this.f49354l = i;
            vPager.setCurrentItem(i);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m73257m(int i) {
        xdl0.m208344M(this.f49346d, this.f49354l >= 1);
        xdl0.m208344M(this.f49347e, this.f49354l <= i + (-2));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: n */
    public void m73258n(final BLiveSignInAchievementMedals bLiveSignInAchievementMedals) {
        if (!vwb.m200296J(bLiveSignInAchievementMedals.medals)) {
            this.f49355m = bLiveSignInAchievementMedals.medals.size();
            this.f49354l = 0;
            for (int size = bLiveSignInAchievementMedals.medals.size() - 1; size >= 0; size--) {
                if (bLiveSignInAchievementMedals.medals.get(size).show) {
                    this.f49354l = size;
                    break;
                }
            }
            m73257m(bLiveSignInAchievementMedals.medals.size());
            C12779d c12779d = new C12779d(bLiveSignInAchievementMedals.medals);
            this.f49348f.setAdapter(c12779d);
            this.f49345c.setAdapter(new C12778c(bLiveSignInAchievementMedals.medals));
            this.f49345c.setOnPageChangeListener(new C12777b(bLiveSignInAchievementMedals, c12779d));
            this.f49345c.m4176T(this.f49354l, false);
            this.f49346d.setOnClickListener(new View.OnClickListener() { // from class: l.r3f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f157530a.m73255k(view);
                }
            });
            this.f49347e.setOnClickListener(new View.OnClickListener() { // from class: l.s3f0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f162135a.m73256l(bLiveSignInAchievementMedals, view);
                }
            });
        }
        if (!vwb.m200296J(bLiveSignInAchievementMedals.progress) && bLiveSignInAchievementMedals.progress.size() == 2) {
            this.f49351i.setText(bLiveSignInAchievementMedals.progress.get(0) + "/" + bLiveSignInAchievementMedals.progress.get(1));
            this.f49350h.setProgress(Math.abs((((float) bLiveSignInAchievementMedals.progress.get(0).intValue()) * 1.0f) / ((float) bLiveSignInAchievementMedals.progress.get(1).intValue())));
        }
        if (vwb.m200296J(bLiveSignInAchievementMedals.explainContents)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bLiveSignInAchievementMedals.explainContents.size(); i++) {
            sb.append(bLiveSignInAchievementMedals.explainContents.get(i));
            if (i != bLiveSignInAchievementMedals.explainContents.size() - 1) {
                sb.append(SignParameters.NEW_LINE);
            }
        }
        this.f49352j.setText(sb.toString());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73252h(this);
        this.f49348f.setHasFixedSize(true);
        this.f49348f.setOverScrollMode(2);
        this.f49348f.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f49348f.addItemDecoration(new C12776a());
        this.f49343a.m68713d(R$string.f46768Jd, true);
        this.f49343a.setBackListener(new View.OnClickListener() { // from class: l.q3f0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f152433a.m73254j(view);
            }
        });
        this.f49343a.setLeftView(1);
        this.f49343a.setDivider(true);
    }
}
