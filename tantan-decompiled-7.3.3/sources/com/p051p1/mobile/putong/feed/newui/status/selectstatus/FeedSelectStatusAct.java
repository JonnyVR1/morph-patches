package com.p051p1.mobile.putong.feed.newui.status.selectstatus;

import android.content.Intent;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.feed.data.StateEmotion;
import com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p153l.bnl0;
import p153l.cmg;
import p153l.gec0;
import p153l.h80;
import p153l.i4g0;
import p153l.jyb;
import p153l.k9c0;
import p153l.owi;
import p153l.pf60;
import p153l.qa00;
import p153l.rzh;
import p153l.uzh;
import p153l.zzk;

/* JADX INFO: loaded from: classes13.dex */
public class FeedSelectStatusAct extends FeedMyStatusBaseAct {

    /* JADX INFO: renamed from: k */
    public static final int f43820k;

    /* JADX INFO: renamed from: l */
    public static final int f43821l;

    /* JADX INFO: renamed from: m */
    public static final int f43822m;

    /* JADX INFO: renamed from: n */
    public static final int f43823n;

    /* JADX INFO: renamed from: o */
    public static final int f43824o;

    /* JADX INFO: renamed from: p */
    public static final int f43825p;

    /* JADX INFO: renamed from: q */
    public static final int f43826q;

    /* JADX INFO: renamed from: r */
    public static final int f43827r;

    /* JADX INFO: renamed from: s */
    public static final int f43828s;

    /* JADX INFO: renamed from: t */
    public static final int f43829t;

    /* JADX INFO: renamed from: u */
    public static final int f43830u;

    /* JADX INFO: renamed from: v */
    public static final int f43831v;

    /* JADX INFO: renamed from: w */
    public static final int f43832w;

    /* JADX INFO: renamed from: x */
    public static final int f43833x;

    /* JADX INFO: renamed from: y */
    public static final int f43834y;

    /* JADX INFO: renamed from: i */
    public rzh f43836i;

    /* JADX INFO: renamed from: h */
    public List<uzh> f43835h = new ArrayList();

    /* JADX INFO: renamed from: j */
    public h80 f43837j = new C11511a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct$b */
    public class C11512b extends GridLayoutManager.AbstractC0554c {
        public C11512b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0554c
        /* JADX INFO: renamed from: f */
        public int mo3330f(int i) {
            return FeedSelectStatusAct.this.f43836i.mo180208F(i) ? 3 : 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct$c */
    public class C11513c extends RecyclerView.AbstractC0578n {
        public C11513c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            if (FeedSelectStatusAct.this.f43836i.mo180208F(recyclerView.getChildAdapterPosition(view))) {
                rect.top = FeedSelectStatusAct.f43831v;
                rect.bottom = FeedSelectStatusAct.f43832w;
                rect.left = FeedSelectStatusAct.f43828s;
                rect.right = FeedSelectStatusAct.f43828s;
                return;
            }
            rect.left = FeedSelectStatusAct.f43828s;
            rect.right = FeedSelectStatusAct.f43828s;
            rect.top = FeedSelectStatusAct.f43829t;
            rect.bottom = FeedSelectStatusAct.f43829t;
        }
    }

    static {
        int iM175859d = qa00.m175859d(16.0f);
        f43820k = iM175859d;
        int iM175859d2 = qa00.m175859d(20.0f);
        f43821l = iM175859d2;
        int iM175859d3 = qa00.m175859d(40.0f);
        f43822m = iM175859d3;
        int iM175859d4 = qa00.m175859d(24.0f);
        f43823n = iM175859d4;
        int iM175859d5 = qa00.m175859d(12.0f);
        f43824o = iM175859d5;
        f43825p = qa00.m175859d(4.0f);
        int iM175859d6 = qa00.m175859d(32.0f);
        f43826q = iM175859d6;
        f43827r = qa00.m175859d(41.0f);
        int i = iM175859d / 2;
        f43828s = i;
        int i2 = iM175859d2 / 2;
        f43829t = i2;
        f43830u = iM175859d3 - i;
        int i3 = iM175859d4 - i2;
        f43831v = i3;
        f43832w = iM175859d5 - i2;
        f43833x = iM175859d6 - i3;
        f43834y = qa00.m175859d(61.0f);
    }

    /* JADX INFO: renamed from: A2 */
    private void m67000A2() {
        String str = owi.f149488g.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (StateEmotion stateEmotion : JSON.parseArray(str, StateEmotion.class)) {
            this.f43835h.add(new uzh(true, null, stateEmotion.categoryName));
            Iterator<Emotion> it = stateEmotion.emotions.iterator();
            while (it.hasNext()) {
                this.f43835h.add(new uzh(false, it.next(), stateEmotion.categoryName));
            }
        }
    }

    /* JADX INFO: renamed from: E2 */
    public static void m67001E2(Act act) {
        act.startActivity(m67007v2(act));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: F2 */
    public static void m67002F2(Act act, String str) {
        act.startActivity(m67008w2(act, str));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: v2 */
    public static Intent m67007v2(Act act) {
        return new Intent(act, (Class<?>) FeedSelectStatusAct.class);
    }

    /* JADX INFO: renamed from: w2 */
    public static Intent m67008w2(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) FeedSelectStatusAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: y2 */
    private void m67009y2() {
        this.f43836i.m183752M(this.f43835h);
    }

    /* JADX INFO: renamed from: B2 */
    public final View m67010B2() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this);
        textView.setTextSize(24.0f);
        textView.getPaint().setFakeBoldText(true);
        textView.setTextColor(getResources().getColor(k9c0.f124533w));
        textView.setPadding(0, 0, 0, f43825p);
        TextView textView2 = new TextView(this);
        if (cmg.m111177E()) {
            textView2.setText("24小时后将自动消失");
            textView.setText("发布此刻状态");
        } else {
            textView2.setText("仅好友可见，24小时后将自动消失");
            textView.setText("发布我的状态");
        }
        textView2.setTextSize(14.0f);
        textView2.setTextColor(getResources().getColor(k9c0.f124475G));
        textView2.setPadding(0, 0, 0, f43833x);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        bnl0.m105550d0(linearLayout, f43822m);
        return linearLayout;
    }

    /* JADX INFO: renamed from: C2 */
    public final View m67011C2() {
        RecyclerView recyclerView = new RecyclerView(this);
        rzh rzhVar = new rzh(this, getIntent().getStringExtra("from"), this.f43837j);
        this.f43836i = rzhVar;
        recyclerView.setAdapter(new zzk(rzhVar));
        recyclerView.addItemDecoration(new C11513c());
        int i = f43830u;
        recyclerView.setPadding(i, 0, i, f43834y);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        gridLayoutManager.m3327v(new C11512b());
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(bnl0.m105592y0(), -1));
        return recyclerView;
    }

    @NotNull
    /* JADX INFO: renamed from: D2 */
    public final LinearLayout m67012D2() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.addView(m67013z2());
        linearLayout.addView(m67010B2());
        linearLayout.addView(m67011C2());
        return linearLayout;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: h2 */
    public int[] mo66981h2() {
        return new int[]{getResources().getColor(k9c0.f124477I), getResources().getColor(k9c0.f124477I), getResources().getColor(k9c0.f124477I)};
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.pageHelper.m152781p(pf60.m172085a("where_show_from", "moment"));
    }

    @Override // com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: m2 */
    public View mo64243m2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LinearLayout linearLayoutM67012D2 = m67012D2();
        m67000A2();
        m67009y2();
        return linearLayoutM67012D2;
    }

    @Override // com.p051p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: n2 */
    public Integer mo66984n2() {
        return super.mo66984n2();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_set_my_state";
    }

    /* JADX INFO: renamed from: z2 */
    public final View m67013z2() {
        FrameLayout frameLayout = new FrameLayout(this);
        LayoutInflater.from(this).inflate(gec0.f103798k, frameLayout);
        frameLayout.setPadding(0, qa00.m175859d(15.0f), 0, qa00.m175859d(25.0f));
        return frameLayout;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct$a */
    public class C11511a extends h80<uzh> {
        public C11511a() {
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo56878j(uzh uzhVar, int i) {
            if (NullChecker.m82486a(uzhVar) && NullChecker.m82486a(uzhVar.m198834b())) {
                i4g0.m138492A("e_set_my_state_type", "p_set_my_state", jyb.m147494Y("state_type_id", uzhVar.m198834b().f39596id));
            }
        }

        @Override // p153l.h80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo59141l(uzh uzhVar, int i, long j) {
        }
    }
}
