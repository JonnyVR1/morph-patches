package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.TextTheme;
import com.p046p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostSelectStatusAct;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class nfh implements s7m<jfh> {

    /* JADX INFO: renamed from: m */
    public static final int f138774m;

    /* JADX INFO: renamed from: n */
    public static final int f138775n;

    /* JADX INFO: renamed from: o */
    public static final int f138776o;

    /* JADX INFO: renamed from: p */
    public static final int f138777p;

    /* JADX INFO: renamed from: q */
    public static final int f138778q;

    /* JADX INFO: renamed from: r */
    public static final int f138779r;

    /* JADX INFO: renamed from: s */
    public static final int f138780s;

    /* JADX INFO: renamed from: t */
    public static final int f138781t;

    /* JADX INFO: renamed from: u */
    public static final int f138782u;

    /* JADX INFO: renamed from: v */
    public static final int f138783v;

    /* JADX INFO: renamed from: w */
    public static final int f138784w;

    /* JADX INFO: renamed from: a */
    public VFrame f138785a;

    /* JADX INFO: renamed from: b */
    public VLinear f138786b;

    /* JADX INFO: renamed from: c */
    public VRelative f138787c;

    /* JADX INFO: renamed from: d */
    public View f138788d;

    /* JADX INFO: renamed from: e */
    public VText f138789e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f138790f;

    /* JADX INFO: renamed from: g */
    public VText f138791g;

    /* JADX INFO: renamed from: h */
    public VText f138792h;

    /* JADX INFO: renamed from: i */
    public jfh f138793i;

    /* JADX INFO: renamed from: j */
    public FeedMomentPostSelectStatusAct f138794j;

    /* JADX INFO: renamed from: k */
    public cyh f138795k;

    /* JADX INFO: renamed from: l */
    public l80 f138796l = new C18686a();

    /* JADX INFO: renamed from: l.nfh$b */
    public class C18687b extends GridLayoutManager.AbstractC0553c {
        public C18687b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return nfh.this.f138795k.mo105565F(i) ? 4 : 1;
        }
    }

    /* JADX INFO: renamed from: l.nfh$c */
    public class C18688c extends RecyclerView.AbstractC0576n {
        public C18688c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (!nfh.this.f138795k.mo105565F(childAdapterPosition)) {
                rect.left = nfh.f138781t;
                rect.right = nfh.f138781t;
                rect.top = nfh.f138782u;
                rect.bottom = nfh.f138782u;
                return;
            }
            int iM186890d = nfh.f138783v;
            if (childAdapterPosition == 0) {
                iM186890d += t100.m186890d(4.0f);
            }
            rect.top = iM186890d;
            rect.bottom = nfh.f138784w;
            rect.left = nfh.f138781t;
            rect.right = nfh.f138781t;
        }
    }

    static {
        int iM186890d = t100.m186890d(8.0f);
        f138774m = iM186890d;
        int iM186890d2 = t100.m186890d(8.0f);
        f138775n = iM186890d2;
        int iM186890d3 = t100.m186890d(22.0f);
        f138776o = iM186890d3;
        int iM186890d4 = t100.m186890d(11.0f);
        f138777p = iM186890d4;
        int iM186890d5 = t100.m186890d(20.0f);
        f138778q = iM186890d5;
        f138779r = iM186890d5 - (iM186890d2 / 2);
        f138780s = t100.m186890d(52.0f);
        int i = iM186890d / 2;
        f138781t = i;
        f138782u = iM186890d2 / 2;
        f138783v = iM186890d3 - i;
        f138784w = iM186890d4 - i;
    }

    public nfh(FeedMomentPostSelectStatusAct feedMomentPostSelectStatusAct) {
        this.f138794j = feedMomentPostSelectStatusAct;
    }

    /* JADX INFO: renamed from: n */
    private void m159246n() {
        Intent intent = new Intent();
        intent.putExtra("userState", this.f138794j.f40804i);
        this.f138794j.setResult(-1, intent);
        this.f138794j.m47815F2();
    }

    /* JADX INFO: renamed from: p */
    private void m159247p() {
        cyh cyhVar = new cyh(this.f138794j, "p_moment_fast_state_post", this.f138796l);
        this.f138795k = cyhVar;
        cyhVar.m109316N(new e30() { // from class: l.mfh
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133593a.m159253u((Emotion) obj);
            }
        });
        this.f138790f.setAdapter(this.f138795k);
        this.f138790f.addItemDecoration(new C18688c());
        RecyclerView recyclerView = this.f138790f;
        int i = f138779r;
        recyclerView.setPadding(i, 0, i, f138780s);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f138794j, 4);
        gridLayoutManager.m3326v(new C18687b());
        this.f138790f.setLayoutManager(gridLayoutManager);
        this.f138790f.setClipToPadding(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m159248q(View view) {
        m159254v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m159249s(View view) {
        zvf0.m220396r("e_state_clear", "p_moment_fast_state_post");
        FeedMomentPostSelectStatusAct feedMomentPostSelectStatusAct = this.f138794j;
        feedMomentPostSelectStatusAct.f40804i = null;
        feedMomentPostSelectStatusAct.f40803h = null;
        m159246n();
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f138794j;
    }

    @Override // p149l.s7m
    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f138794j;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM159250k = m159250k(layoutInflater, viewGroup);
        TextPaint paint = this.f138789e.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        TextPaint paint2 = this.f138791g.getPaint();
        if (paint2 != null) {
            paint2.setFakeBoldText(true);
        }
        m159247p();
        this.f138789e.setText("此刻状态");
        xdl0.m208329E0(this.f138792h, new View.OnClickListener() { // from class: l.kfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122942a.m159248q(view);
            }
        });
        xdl0.m208329E0(this.f138791g, new View.OnClickListener() { // from class: l.lfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127885a.m159249s(view);
            }
        });
        return viewM159250k;
    }

    /* JADX INFO: renamed from: k */
    public View m159250k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ofh.m164069b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(jfh jfhVar) {
        this.f138793i = jfhVar;
    }

    /* JADX INFO: renamed from: m */
    public void m159252m() {
        this.f138795k.m109315M(this.f138793i.f117659a);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m159253u(Emotion emotion) {
        this.f138794j.f40803h = emotion;
    }

    /* JADX INFO: renamed from: v */
    public final void m159254v() {
        Emotion emotion = this.f138794j.f40803h;
        if (emotion == null) {
            return;
        }
        p6j0.m167668b("e_confirm", "p_moment_fast_state_post", p6j0.C19147a.m167678g("state_id", emotion.f38748id));
        BubbleInfo bubbleInfo = new BubbleInfo();
        bubbleInfo.emotion = this.f138794j.f40803h;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = this.f138794j.f40803h.backgroundColor;
        if (nkg.m159848E()) {
            textTheme.iconColor = this.f138794j.f40803h.iconColor;
        }
        bubbleInfo.textTheme = textTheme;
        this.f138794j.f40804i = bubbleInfo;
        m159246n();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.nfh$a */
    public class C18686a extends l80<fyh> {
        public C18686a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(fyh fyhVar, int i) {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(fyh fyhVar, int i, long j) {
        }
    }
}
