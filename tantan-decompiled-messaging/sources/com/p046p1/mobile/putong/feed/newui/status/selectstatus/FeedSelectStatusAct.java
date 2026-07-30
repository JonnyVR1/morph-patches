package com.p046p1.mobile.putong.feed.newui.status.selectstatus;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.feed.data.StateEmotion;
import com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p149l.b6c0;
import p149l.cyh;
import p149l.e1c0;
import p149l.fyh;
import p149l.j760;
import p149l.jxk;
import p149l.l80;
import p149l.nkg;
import p149l.sti;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedSelectStatusAct extends FeedMyStatusBaseAct {

    /* JADX INFO: renamed from: k */
    public static final int f42972k;

    /* JADX INFO: renamed from: l */
    public static final int f42973l;

    /* JADX INFO: renamed from: m */
    public static final int f42974m;

    /* JADX INFO: renamed from: n */
    public static final int f42975n;

    /* JADX INFO: renamed from: o */
    public static final int f42976o;

    /* JADX INFO: renamed from: p */
    public static final int f42977p;

    /* JADX INFO: renamed from: q */
    public static final int f42978q;

    /* JADX INFO: renamed from: r */
    public static final int f42979r;

    /* JADX INFO: renamed from: s */
    public static final int f42980s;

    /* JADX INFO: renamed from: t */
    public static final int f42981t;

    /* JADX INFO: renamed from: u */
    public static final int f42982u;

    /* JADX INFO: renamed from: v */
    public static final int f42983v;

    /* JADX INFO: renamed from: w */
    public static final int f42984w;

    /* JADX INFO: renamed from: x */
    public static final int f42985x;

    /* JADX INFO: renamed from: y */
    public static final int f42986y;

    /* JADX INFO: renamed from: i */
    public cyh f42988i;

    /* JADX INFO: renamed from: h */
    public List<fyh> f42987h = new ArrayList();

    /* JADX INFO: renamed from: j */
    public l80 f42989j = new C11348a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct$b */
    public class C11349b extends GridLayoutManager.AbstractC0553c {
        public C11349b() {
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int i) {
            return FeedSelectStatusAct.this.f42988i.mo105565F(i) ? 3 : 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct$c */
    public class C11350c extends RecyclerView.AbstractC0576n {
        public C11350c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            if (FeedSelectStatusAct.this.f42988i.mo105565F(recyclerView.getChildAdapterPosition(view))) {
                rect.top = FeedSelectStatusAct.f42983v;
                rect.bottom = FeedSelectStatusAct.f42984w;
                rect.left = FeedSelectStatusAct.f42980s;
                rect.right = FeedSelectStatusAct.f42980s;
                return;
            }
            rect.left = FeedSelectStatusAct.f42980s;
            rect.right = FeedSelectStatusAct.f42980s;
            rect.top = FeedSelectStatusAct.f42981t;
            rect.bottom = FeedSelectStatusAct.f42981t;
        }
    }

    static {
        int iM186890d = t100.m186890d(16.0f);
        f42972k = iM186890d;
        int iM186890d2 = t100.m186890d(20.0f);
        f42973l = iM186890d2;
        int iM186890d3 = t100.m186890d(40.0f);
        f42974m = iM186890d3;
        int iM186890d4 = t100.m186890d(24.0f);
        f42975n = iM186890d4;
        int iM186890d5 = t100.m186890d(12.0f);
        f42976o = iM186890d5;
        f42977p = t100.m186890d(4.0f);
        int iM186890d6 = t100.m186890d(32.0f);
        f42978q = iM186890d6;
        f42979r = t100.m186890d(41.0f);
        int i = iM186890d / 2;
        f42980s = i;
        int i2 = iM186890d2 / 2;
        f42981t = i2;
        f42982u = iM186890d3 - i;
        int i3 = iM186890d4 - i2;
        f42983v = i3;
        f42984w = iM186890d5 - i2;
        f42985x = iM186890d6 - i3;
        f42986y = t100.m186890d(61.0f);
    }

    /* JADX INFO: renamed from: D2 */
    public static void m65817D2(Act act) {
        act.startActivity(m65823u2(act));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: E2 */
    public static void m65818E2(Act act, String str) {
        act.startActivity(m65824v2(act, str));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: u2 */
    public static Intent m65823u2(Act act) {
        return new Intent(act, (Class<?>) FeedSelectStatusAct.class);
    }

    /* JADX INFO: renamed from: v2 */
    public static Intent m65824v2(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) FeedSelectStatusAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: w2 */
    private void m65825w2() {
        this.f42988i.m109315M(this.f42987h);
    }

    /* JADX INFO: renamed from: z2 */
    private void m65826z2() {
        String str = sti.f166363g.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (StateEmotion stateEmotion : JSON.parseArray(str, StateEmotion.class)) {
            this.f42987h.add(new fyh(true, null, stateEmotion.categoryName));
            Iterator<Emotion> it = stateEmotion.emotions.iterator();
            while (it.hasNext()) {
                this.f42987h.add(new fyh(false, it.next(), stateEmotion.categoryName));
            }
        }
    }

    /* JADX INFO: renamed from: A2 */
    public final View m65827A2() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this);
        textView.setTextSize(24.0f);
        textView.getPaint().setFakeBoldText(true);
        textView.setTextColor(getResources().getColor(e1c0.f88810w));
        textView.setPadding(0, 0, 0, f42977p);
        TextView textView2 = new TextView(this);
        if (nkg.m159848E()) {
            textView2.setText("24小时后将自动消失");
            textView.setText("发布此刻状态");
        } else {
            textView2.setText("仅好友可见，24小时后将自动消失");
            textView.setText("发布我的状态");
        }
        textView2.setTextSize(14.0f);
        textView2.setTextColor(getResources().getColor(e1c0.f88752G));
        textView2.setPadding(0, 0, 0, f42985x);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        xdl0.m208370d0(linearLayout, f42974m);
        return linearLayout;
    }

    /* JADX INFO: renamed from: B2 */
    public final View m65828B2() {
        RecyclerView recyclerView = new RecyclerView(this);
        cyh cyhVar = new cyh(this, getIntent().getStringExtra("from"), this.f42989j);
        this.f42988i = cyhVar;
        recyclerView.setAdapter(new jxk(cyhVar));
        recyclerView.addItemDecoration(new C11350c());
        int i = f42982u;
        recyclerView.setPadding(i, 0, i, f42986y);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        gridLayoutManager.m3326v(new C11349b());
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(xdl0.m208412y0(), -1));
        return recyclerView;
    }

    @NotNull
    /* JADX INFO: renamed from: C2 */
    public final LinearLayout m65829C2() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.addView(m65830y2());
        linearLayout.addView(m65827A2());
        linearLayout.addView(m65828B2());
        return linearLayout;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: g2 */
    public int[] mo65798g2() {
        return new int[]{getResources().getColor(e1c0.f88754I), getResources().getColor(e1c0.f88754I), getResources().getColor(e1c0.f88754I)};
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        super.initDataOnCreate();
        this.pageHelper.m109040p(j760.m140076a("where_show_from", "moment"));
    }

    @Override // com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: l2 */
    public View mo63060l2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LinearLayout linearLayoutM65829C2 = m65829C2();
        m65826z2();
        m65825w2();
        return linearLayoutM65829C2;
    }

    @Override // com.p046p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: m2 */
    public Integer mo65801m2() {
        return super.mo65801m2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_set_my_state";
    }

    /* JADX INFO: renamed from: y2 */
    public final View m65830y2() {
        FrameLayout frameLayout = new FrameLayout(this);
        LayoutInflater.from(this).inflate(b6c0.f73785k, frameLayout);
        frameLayout.setPadding(0, t100.m186890d(15.0f), 0, t100.m186890d(25.0f));
        return frameLayout;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct$a */
    public class C11348a extends l80<fyh> {
        public C11348a() {
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo55695j(fyh fyhVar, int i) {
            if (NullChecker.m81303a(fyhVar) && NullChecker.m81303a(fyhVar.m123767b())) {
                zvf0.m220368A("e_set_my_state_type", "p_set_my_state", vwb.m200311Y("state_type_id", fyhVar.m123767b().f38748id));
            }
        }

        @Override // p149l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo57958l(fyh fyhVar, int i, long j) {
        }
    }
}
