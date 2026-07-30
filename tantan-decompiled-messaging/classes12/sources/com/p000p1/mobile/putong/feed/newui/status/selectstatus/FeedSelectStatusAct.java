package com.p000p1.mobile.putong.feed.newui.status.selectstatus;

import android.content.Context;
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
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.feed.data.StateEmotion;
import com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.b6c0;
import l.j760;
import l.jxk;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import p007l.cyh;
import p007l.e1c0;
import p007l.fyh;
import p007l.l80;
import p007l.nkg;
import p007l.sti;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedSelectStatusAct extends FeedMyStatusBaseAct {

    /* JADX INFO: renamed from: k */
    public static final int f4433k;

    /* JADX INFO: renamed from: l */
    public static final int f4434l;

    /* JADX INFO: renamed from: m */
    public static final int f4435m;

    /* JADX INFO: renamed from: n */
    public static final int f4436n;

    /* JADX INFO: renamed from: o */
    public static final int f4437o;

    /* JADX INFO: renamed from: p */
    public static final int f4438p;

    /* JADX INFO: renamed from: q */
    public static final int f4439q;

    /* JADX INFO: renamed from: r */
    public static final int f4440r;

    /* JADX INFO: renamed from: s */
    public static final int f4441s;

    /* JADX INFO: renamed from: t */
    public static final int f4442t;

    /* JADX INFO: renamed from: u */
    public static final int f4443u;

    /* JADX INFO: renamed from: v */
    public static final int f4444v;

    /* JADX INFO: renamed from: w */
    public static final int f4445w;

    /* JADX INFO: renamed from: x */
    public static final int f4446x;

    /* JADX INFO: renamed from: y */
    public static final int f4447y;

    /* JADX INFO: renamed from: i */
    public cyh f4449i;

    /* JADX INFO: renamed from: h */
    public List<fyh> f4448h = new ArrayList();

    /* JADX INFO: renamed from: j */
    public l80 f4450j = new C2192a();

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct$b */
    public class C2193b extends GridLayoutManager.c {
        public C2193b() {
        }

        /* JADX INFO: renamed from: f */
        public int m6979f(int i) {
            return FeedSelectStatusAct.this.f4449i.mo9107F(i) ? 3 : 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct$c */
    public class C2194c extends RecyclerView.n {
        public C2194c() {
        }

        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.z zVar) {
            if (FeedSelectStatusAct.this.f4449i.mo9107F(recyclerView.getChildAdapterPosition(view))) {
                rect.top = FeedSelectStatusAct.f4444v;
                rect.bottom = FeedSelectStatusAct.f4445w;
                rect.left = FeedSelectStatusAct.f4441s;
                rect.right = FeedSelectStatusAct.f4441s;
                return;
            }
            rect.left = FeedSelectStatusAct.f4441s;
            rect.right = FeedSelectStatusAct.f4441s;
            rect.top = FeedSelectStatusAct.f4442t;
            rect.bottom = FeedSelectStatusAct.f4442t;
        }
    }

    static {
        int iD = t100.d(16.0f);
        f4433k = iD;
        int iD2 = t100.d(20.0f);
        f4434l = iD2;
        int iD3 = t100.d(40.0f);
        f4435m = iD3;
        int iD4 = t100.d(24.0f);
        f4436n = iD4;
        int iD5 = t100.d(12.0f);
        f4437o = iD5;
        f4438p = t100.d(4.0f);
        int iD6 = t100.d(32.0f);
        f4439q = iD6;
        f4440r = t100.d(41.0f);
        int i = iD / 2;
        f4441s = i;
        int i2 = iD2 / 2;
        f4442t = i2;
        f4443u = iD3 - i;
        int i3 = iD4 - i2;
        f4444v = i3;
        f4445w = iD5 - i2;
        f4446x = iD6 - i3;
        f4447y = t100.d(61.0f);
    }

    /* JADX INFO: renamed from: D2 */
    public static void m6963D2(Act act) {
        act.startActivity(m6969u2(act));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: E2 */
    public static void m6964E2(Act act, String str) {
        act.startActivity(m6970v2(act, str));
        act.overridePendingTransition(0, 0);
    }

    /* JADX INFO: renamed from: u2 */
    public static Intent m6969u2(Act act) {
        return new Intent((Context) act, (Class<?>) FeedSelectStatusAct.class);
    }

    /* JADX INFO: renamed from: v2 */
    public static Intent m6970v2(Act act, String str) {
        Intent intent = new Intent((Context) act, (Class<?>) FeedSelectStatusAct.class);
        intent.putExtra("from", str);
        return intent;
    }

    /* JADX INFO: renamed from: w2 */
    private void m6971w2() {
        this.f4449i.m9263M(this.f4448h);
    }

    /* JADX INFO: renamed from: z2 */
    private void m6972z2() {
        String str = (String) sti.f13081g.get();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        for (StateEmotion stateEmotion : JSON.parseArray(str, StateEmotion.class)) {
            this.f4448h.add(new fyh(true, null, stateEmotion.categoryName));
            Iterator<Emotion> it = stateEmotion.emotions.iterator();
            while (it.hasNext()) {
                this.f4448h.add(new fyh(false, it.next(), stateEmotion.categoryName));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: A2 */
    public final View m6973A2() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(this);
        textView.setTextSize(24.0f);
        textView.getPaint().setFakeBoldText(true);
        textView.setTextColor(getResources().getColor(e1c0.f7166w));
        textView.setPadding(0, 0, 0, f4438p);
        TextView textView2 = new TextView(this);
        if (nkg.m12207E()) {
            textView2.setText("24小时后将自动消失");
            textView.setText("发布此刻状态");
        } else {
            textView2.setText("仅好友可见，24小时后将自动消失");
            textView.setText("发布我的状态");
        }
        textView2.setTextSize(14.0f);
        textView2.setTextColor(getResources().getColor(e1c0.f7108G));
        textView2.setPadding(0, 0, 0, f4446x);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        xdl0.d0(linearLayout, f4435m);
        return linearLayout;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B2 */
    public final View m6974B2() {
        RecyclerView recyclerView = new RecyclerView(this);
        cyh cyhVar = new cyh(this, getIntent().getStringExtra("from"), this.f4450j);
        this.f4449i = cyhVar;
        recyclerView.setAdapter(new jxk(cyhVar));
        recyclerView.addItemDecoration(new C2194c());
        int i = f4443u;
        recyclerView.setPadding(i, 0, i, f4447y);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 3);
        gridLayoutManager.v(new C2193b());
        recyclerView.setLayoutManager(gridLayoutManager);
        recyclerView.setClipToPadding(false);
        recyclerView.setLayoutParams(new LinearLayout.LayoutParams(xdl0.y0(), -1));
        return recyclerView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    /* JADX INFO: renamed from: C2 */
    public final LinearLayout m6975C2() {
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        linearLayout.addView(m6976y2());
        linearLayout.addView(m6973A2());
        linearLayout.addView(m6974B2());
        return linearLayout;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: g2 */
    public int[] mo6944g2() {
        return new int[]{getResources().getColor(e1c0.f7110I), getResources().getColor(e1c0.f7110I), getResources().getColor(e1c0.f7110I)};
    }

    public void initDataOnCreate() {
        super.initDataOnCreate();
        ((PutongAct) this).pageHelper.p(new j760[]{j760.a("where_show_from", "moment")});
    }

    @Override // com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: l2 */
    public View mo4076l2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LinearLayout linearLayoutM6975C2 = m6975C2();
        m6972z2();
        m6971w2();
        return linearLayoutM6975C2;
    }

    @Override // com.p000p1.mobile.putong.feed.newui.status.post.FeedMyStatusBaseAct
    /* JADX INFO: renamed from: m2 */
    public Integer mo6947m2() {
        return super.mo6947m2();
    }

    public String pageId() {
        return "p_set_my_state";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y2 */
    public final View m6976y2() {
        FrameLayout frameLayout = new FrameLayout(this);
        LayoutInflater.from(this).inflate(b6c0.k, frameLayout);
        frameLayout.setPadding(0, t100.d(15.0f), 0, t100.d(25.0f));
        return frameLayout;
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.status.selectstatus.FeedSelectStatusAct$a */
    public class C2192a extends l80<fyh> {
        public C2192a() {
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public void mo2866j(fyh fyhVar, int i) {
            if (NullChecker.a(fyhVar) && NullChecker.a(fyhVar.m10328b())) {
                zvf0.A("e_set_my_state_type", "p_set_my_state", new j760[]{vwb.Y("state_type_id", fyhVar.m10328b().f209id)});
            }
        }

        @Override // p007l.l80
        /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
        public void mo2867l(fyh fyhVar, int i, long j) {
        }
    }
}
