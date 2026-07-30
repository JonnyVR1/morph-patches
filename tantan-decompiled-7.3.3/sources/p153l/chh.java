package p153l;

import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.TextTheme;
import com.p051p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostSelectStatusAct;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class chh implements iam<ygh> {

    /* JADX INFO: renamed from: m */
    public static final int f81813m;

    /* JADX INFO: renamed from: n */
    public static final int f81814n;

    /* JADX INFO: renamed from: o */
    public static final int f81815o;

    /* JADX INFO: renamed from: p */
    public static final int f81816p;

    /* JADX INFO: renamed from: q */
    public static final int f81817q;

    /* JADX INFO: renamed from: r */
    public static final int f81818r;

    /* JADX INFO: renamed from: s */
    public static final int f81819s;

    /* JADX INFO: renamed from: t */
    public static final int f81820t;

    /* JADX INFO: renamed from: u */
    public static final int f81821u;

    /* JADX INFO: renamed from: v */
    public static final int f81822v;

    /* JADX INFO: renamed from: w */
    public static final int f81823w;

    /* JADX INFO: renamed from: a */
    public VFrame f81824a;

    /* JADX INFO: renamed from: b */
    public VLinear f81825b;

    /* JADX INFO: renamed from: c */
    public VRelative f81826c;

    /* JADX INFO: renamed from: d */
    public View f81827d;

    /* JADX INFO: renamed from: e */
    public VText f81828e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f81829f;

    /* JADX INFO: renamed from: g */
    public VText f81830g;

    /* JADX INFO: renamed from: h */
    public VText f81831h;

    /* JADX INFO: renamed from: i */
    public ygh f81832i;

    /* JADX INFO: renamed from: j */
    public FeedMomentPostSelectStatusAct f81833j;

    /* JADX INFO: renamed from: k */
    public rzh f81834k;

    /* JADX INFO: renamed from: l */
    public h80 f81835l = new C16254a();

    /* JADX INFO: renamed from: l.chh$b */
    public class C16255b extends GridLayoutManager.AbstractC0554c {
        public C16255b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return chh.this.f81834k.mo180208F(i) ? 4 : 1;
        }
    }

    /* JADX INFO: renamed from: l.chh$c */
    public class C16256c extends RecyclerView.AbstractC0578n {
        public C16256c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (!chh.this.f81834k.mo180208F(childAdapterPosition)) {
                rect.left = chh.f81820t;
                rect.right = chh.f81820t;
                rect.top = chh.f81821u;
                rect.bottom = chh.f81821u;
                return;
            }
            int iM175859d = chh.f81822v;
            if (childAdapterPosition == 0) {
                iM175859d += qa00.m175859d(4.0f);
            }
            rect.top = iM175859d;
            rect.bottom = chh.f81823w;
            rect.left = chh.f81820t;
            rect.right = chh.f81820t;
        }
    }

    static {
        int iM175859d = qa00.m175859d(8.0f);
        f81813m = iM175859d;
        int iM175859d2 = qa00.m175859d(8.0f);
        f81814n = iM175859d2;
        int iM175859d3 = qa00.m175859d(22.0f);
        f81815o = iM175859d3;
        int iM175859d4 = qa00.m175859d(11.0f);
        f81816p = iM175859d4;
        int iM175859d5 = qa00.m175859d(20.0f);
        f81817q = iM175859d5;
        f81818r = iM175859d5 - (iM175859d2 / 2);
        f81819s = qa00.m175859d(52.0f);
        int i = iM175859d / 2;
        f81820t = i;
        f81821u = iM175859d2 / 2;
        f81822v = iM175859d3 - i;
        f81823w = iM175859d4 - i;
    }

    public chh(FeedMomentPostSelectStatusAct feedMomentPostSelectStatusAct) {
        this.f81833j = feedMomentPostSelectStatusAct;
    }

    /* JADX INFO: renamed from: n */
    private void m109787n() {
        Intent intent = new Intent();
        intent.putExtra("userState", this.f81833j.f41652i);
        this.f81833j.setResult(-1, intent);
        this.f81833j.m48999H2();
    }

    /* JADX INFO: renamed from: p */
    private void m109788p() {
        rzh rzhVar = new rzh(this.f81833j, "p_moment_fast_state_post", this.f81835l);
        this.f81834k = rzhVar;
        rzhVar.m183753N(new y20() { // from class: l.bhh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f76787a.m109794u((Emotion) obj);
            }
        });
        this.f81829f.setAdapter(this.f81834k);
        this.f81829f.addItemDecoration(new C16256c());
        RecyclerView recyclerView = this.f81829f;
        int i = f81818r;
        recyclerView.setPadding(i, 0, i, f81819s);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f81833j, 4);
        gridLayoutManager.m3327v(new C16255b());
        this.f81829f.setLayoutManager(gridLayoutManager);
        this.f81829f.setClipToPadding(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m109789q(View view) {
        m109795v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m109790s(View view) {
        i4g0.m138520r("e_state_clear", "p_moment_fast_state_post");
        FeedMomentPostSelectStatusAct feedMomentPostSelectStatusAct = this.f81833j;
        feedMomentPostSelectStatusAct.f41652i = null;
        feedMomentPostSelectStatusAct.f41651h = null;
        m109787n();
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f81833j;
    }

    @Override // p153l.iam
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f81833j;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM109791k = m109791k(layoutInflater, viewGroup);
        TextPaint paint = this.f81828e.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        TextPaint paint2 = this.f81830g.getPaint();
        if (paint2 != null) {
            paint2.setFakeBoldText(true);
        }
        m109788p();
        this.f81828e.setText("此刻状态");
        bnl0.m105509E0(this.f81831h, new View.OnClickListener() { // from class: l.zgh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204303a.m109789q(view);
            }
        });
        bnl0.m105509E0(this.f81830g, new View.OnClickListener() { // from class: l.ahh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f71359a.m109790s(view);
            }
        });
        return viewM109791k;
    }

    /* JADX INFO: renamed from: k */
    public View m109791k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dhh.m115803b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ygh yghVar) {
        this.f81832i = yghVar;
    }

    /* JADX INFO: renamed from: m */
    public void m109793m() {
        this.f81834k.m183752M(this.f81832i.f199831a);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m109794u(Emotion emotion) {
        this.f81833j.f41651h = emotion;
    }

    /* JADX INFO: renamed from: v */
    public final void m109795v() {
        Emotion emotion = this.f81833j.f41651h;
        if (emotion == null) {
            return;
        }
        tfj0.m190939b("e_confirm", "p_moment_fast_state_post", tfj0.C20302a.m190949g("state_id", emotion.f39596id));
        BubbleInfo bubbleInfo = new BubbleInfo();
        bubbleInfo.emotion = this.f81833j.f41651h;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = this.f81833j.f41651h.backgroundColor;
        if (cmg.m111177E()) {
            textTheme.iconColor = this.f81833j.f41651h.iconColor;
        }
        bubbleInfo.textTheme = textTheme;
        this.f81833j.f41652i = bubbleInfo;
        m109787n();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.chh$a */
    public class C16254a extends h80<uzh> {
        public C16254a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(uzh uzhVar, int i) {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(uzh uzhVar, int i, long j) {
        }
    }
}
