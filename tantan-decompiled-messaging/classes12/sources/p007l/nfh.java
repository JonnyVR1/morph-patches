package p007l;

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
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.data.TextTheme;
import com.p000p1.mobile.putong.feed.newui.mediapicker.post.state.FeedMomentPostSelectStatusAct;
import com.p1.mobile.android.app.Act;
import l.e30;
import l.s7m;
import l.t100;
import l.xdl0;
import l.zvf0;
import v.VFrame;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class nfh implements s7m<jfh> {

    /* JADX INFO: renamed from: m */
    public static final int f10769m;

    /* JADX INFO: renamed from: n */
    public static final int f10770n;

    /* JADX INFO: renamed from: o */
    public static final int f10771o;

    /* JADX INFO: renamed from: p */
    public static final int f10772p;

    /* JADX INFO: renamed from: q */
    public static final int f10773q;

    /* JADX INFO: renamed from: r */
    public static final int f10774r;

    /* JADX INFO: renamed from: s */
    public static final int f10775s;

    /* JADX INFO: renamed from: t */
    public static final int f10776t;

    /* JADX INFO: renamed from: u */
    public static final int f10777u;

    /* JADX INFO: renamed from: v */
    public static final int f10778v;

    /* JADX INFO: renamed from: w */
    public static final int f10779w;

    /* JADX INFO: renamed from: a */
    public VFrame f10780a;

    /* JADX INFO: renamed from: b */
    public VLinear f10781b;

    /* JADX INFO: renamed from: c */
    public VRelative f10782c;

    /* JADX INFO: renamed from: d */
    public View f10783d;

    /* JADX INFO: renamed from: e */
    public VText f10784e;

    /* JADX INFO: renamed from: f */
    public RecyclerView f10785f;

    /* JADX INFO: renamed from: g */
    public VText f10786g;

    /* JADX INFO: renamed from: h */
    public VText f10787h;

    /* JADX INFO: renamed from: i */
    public jfh f10788i;

    /* JADX INFO: renamed from: j */
    public FeedMomentPostSelectStatusAct f10789j;

    /* JADX INFO: renamed from: k */
    public cyh f10790k;

    /* JADX INFO: renamed from: l */
    public l80 f10791l = new C2436a();

    /* JADX INFO: renamed from: l.nfh$b */
    public class C2437b extends GridLayoutManager.c {
        public C2437b() {
        }

        /* JADX INFO: renamed from: f */
        public int m12174f(int i) {
            return nfh.this.f10790k.mo9107F(i) ? 4 : 1;
        }
    }

    /* JADX INFO: renamed from: l.nfh$c */
    public class C2438c extends RecyclerView.n {
        public C2438c() {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (!nfh.this.f10790k.mo9107F(childAdapterPosition)) {
                rect.left = nfh.f10776t;
                rect.right = nfh.f10776t;
                rect.top = nfh.f10777u;
                rect.bottom = nfh.f10777u;
                return;
            }
            int iD = nfh.f10778v;
            if (childAdapterPosition == 0) {
                iD += t100.d(4.0f);
            }
            rect.top = iD;
            rect.bottom = nfh.f10779w;
            rect.left = nfh.f10776t;
            rect.right = nfh.f10776t;
        }
    }

    static {
        int iD = t100.d(8.0f);
        f10769m = iD;
        int iD2 = t100.d(8.0f);
        f10770n = iD2;
        int iD3 = t100.d(22.0f);
        f10771o = iD3;
        int iD4 = t100.d(11.0f);
        f10772p = iD4;
        int iD5 = t100.d(20.0f);
        f10773q = iD5;
        f10774r = iD5 - (iD2 / 2);
        f10775s = t100.d(52.0f);
        int i = iD / 2;
        f10776t = i;
        f10777u = iD2 / 2;
        f10778v = iD3 - i;
        f10779w = iD4 - i;
    }

    public nfh(FeedMomentPostSelectStatusAct feedMomentPostSelectStatusAct) {
        this.f10789j = feedMomentPostSelectStatusAct;
    }

    /* JADX INFO: renamed from: n */
    private void m12161n() {
        Intent intent = new Intent();
        intent.putExtra("userState", this.f10789j.f2265i);
        this.f10789j.setResult(-1, intent);
        this.f10789j.finish();
    }

    /* JADX INFO: renamed from: p */
    private void m12162p() {
        cyh cyhVar = new cyh(this.f10789j, "p_moment_fast_state_post", this.f10791l);
        this.f10790k = cyhVar;
        cyhVar.m9264N(new e30() { // from class: l.mfh
            public final void call(Object obj) {
                this.f10456a.m12170u((Emotion) obj);
            }
        });
        this.f10785f.setAdapter(this.f10790k);
        this.f10785f.addItemDecoration(new C2438c());
        RecyclerView recyclerView = this.f10785f;
        int i = f10774r;
        recyclerView.setPadding(i, 0, i, f10775s);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f10789j, 4);
        gridLayoutManager.v(new C2437b());
        this.f10785f.setLayoutManager(gridLayoutManager);
        this.f10785f.setClipToPadding(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m12163q(View view) {
        m12171v();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m12164s(View view) {
        zvf0.r("e_state_clear", "p_moment_fast_state_post");
        FeedMomentPostSelectStatusAct feedMomentPostSelectStatusAct = this.f10789j;
        feedMomentPostSelectStatusAct.f2265i = null;
        feedMomentPostSelectStatusAct.f2264h = null;
        m12161n();
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12165C0() {
        return this.f10789j;
    }

    @Nullable
    @org.jetbrains.annotations.Nullable
    public Act act() {
        return this.f10789j;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM12167k = m12167k(layoutInflater, viewGroup);
        TextPaint paint = this.f10784e.getPaint();
        if (paint != null) {
            paint.setFakeBoldText(true);
        }
        TextPaint paint2 = this.f10786g.getPaint();
        if (paint2 != null) {
            paint2.setFakeBoldText(true);
        }
        m12162p();
        this.f10784e.setText("此刻状态");
        xdl0.E0(this.f10787h, new View.OnClickListener() { // from class: l.kfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9703a.m12163q(view);
            }
        });
        xdl0.E0(this.f10786g, new View.OnClickListener() { // from class: l.lfh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10022a.m12164s(view);
            }
        });
        return viewM12167k;
    }

    /* JADX INFO: renamed from: k */
    public View m12167k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ofh.m12634b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m12166i1(jfh jfhVar) {
        this.f10788i = jfhVar;
    }

    /* JADX INFO: renamed from: m */
    public void m12169m() {
        this.f10790k.m9263M(this.f10788i.f9338a);
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m12170u(Emotion emotion) {
        this.f10789j.f2264h = emotion;
    }

    /* JADX INFO: renamed from: v */
    public final void m12171v() {
        Emotion emotion = this.f10789j.f2264h;
        if (emotion == null) {
            return;
        }
        p6j0.m12912b("e_confirm", "p_moment_fast_state_post", p6j0.C2456a.m12922g("state_id", emotion.f209id));
        BubbleInfo bubbleInfo = new BubbleInfo();
        bubbleInfo.emotion = this.f10789j.f2264h;
        TextTheme textTheme = new TextTheme();
        textTheme.backgroundColor = this.f10789j.f2264h.backgroundColor;
        if (nkg.m12207E()) {
            textTheme.iconColor = this.f10789j.f2264h.iconColor;
        }
        bubbleInfo.textTheme = textTheme;
        this.f10789j.f2265i = bubbleInfo;
        m12161n();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.nfh$a */
    public class C2436a extends l80<fyh> {
        public C2436a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(fyh fyhVar, int i) {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(fyh fyhVar, int i, long j) {
        }
    }
}
