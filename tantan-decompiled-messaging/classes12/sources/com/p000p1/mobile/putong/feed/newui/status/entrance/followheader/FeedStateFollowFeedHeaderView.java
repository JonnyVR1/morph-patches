package com.p000p1.mobile.putong.feed.newui.status.entrance.followheader;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Emotion;
import com.p000p1.mobile.putong.data.Envelope;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.FeedData;
import com.p000p1.mobile.putong.feed.data.StateEmotion;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import l.e30;
import l.mkd0;
import l.t100;
import l.vwb;
import l.w9j;
import p007l.b5c0;
import p007l.bwh;
import p007l.o6c0;
import p007l.sti;
import p007l.vqg;
import p007l.x0i;
import rx.subjects.b;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedStateFollowFeedHeaderView extends VFrame implements bwh {

    /* JADX INFO: renamed from: h */
    public static b<String> f4386h = b.b();

    /* JADX INFO: renamed from: a */
    public RecyclerView f4387a;

    /* JADX INFO: renamed from: b */
    public x0i f4388b;

    /* JADX INFO: renamed from: c */
    public List<BubbleInfo> f4389c;

    /* JADX INFO: renamed from: d */
    public Act f4390d;

    /* JADX INFO: renamed from: e */
    public String f4391e;

    /* JADX INFO: renamed from: f */
    public boolean f4392f;

    /* JADX INFO: renamed from: g */
    public String f4393g;

    public FeedStateFollowFeedHeaderView(Context context, String str) {
        super(context);
        this.f4389c = new ArrayList();
        this.f4393g = str;
        m6903G(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G */
    private void m6903G(Context context) {
        this.f4390d = (Act) context;
        LayoutInflater.from(context).inflate(o6c0.f11088M0, (ViewGroup) this);
        setVisibility(8);
        m6913K(context);
        m6922T();
        m6912F(false);
        this.f4390d.duringCreated(FeedModule.f316d.f15005t1).subscribe(mkd0.G(new e30() { // from class: l.o0i
            public final void call(Object obj) {
                this.f10966a.m6916N((Boolean) obj);
            }
        }));
    }

    private String getPageId() {
        return vqg.m15485K(this.f4393g, false);
    }

    /* JADX INFO: renamed from: C */
    public final BubbleInfo m6910C(final BubbleInfo bubbleInfo) {
        ArrayList arrayListF0 = vwb.f0(new BubbleInfo[0]);
        String str = (String) sti.f13081g.get();
        if (!TextUtils.isEmpty(str)) {
            Iterator it = JSON.parseArray(str, StateEmotion.class).iterator();
            while (it.hasNext()) {
                for (Emotion emotion : ((StateEmotion) it.next()).emotions) {
                    BubbleInfo bubbleInfoNew_ = BubbleInfo.new_();
                    bubbleInfoNew_.emotion = emotion;
                    bubbleInfoNew_.setPostSelectBubbleState(true);
                    arrayListF0.add(bubbleInfoNew_);
                }
            }
            if (NullChecker.a(bubbleInfo)) {
                BubbleInfo bubbleInfo2 = (BubbleInfo) vwb.r(arrayListF0, new w9j() { // from class: l.u0i
                    public final Object call(Object obj) {
                        BubbleInfo bubbleInfo3 = bubbleInfo;
                        BubbleInfo bubbleInfo4 = (BubbleInfo) obj;
                        return Boolean.valueOf(NullChecker.a(bubbleInfo3.emotion) && NullChecker.a(bubbleInfo4.emotion) && TextUtils.equals(bubbleInfo3.emotion.f209id, bubbleInfo4.emotion.f209id));
                    }
                });
                if (NullChecker.a(bubbleInfo2)) {
                    bubbleInfo.emotion.backgroundColor = bubbleInfo2.emotion.backgroundColor;
                }
            }
        }
        return bubbleInfo;
    }

    /* JADX INFO: renamed from: E */
    public final List<BubbleInfo> m6911E(List<BubbleInfo> list) {
        ArrayList arrayListF0 = vwb.f0(new BubbleInfo[0]);
        String str = (String) sti.f13081g.get();
        if (!TextUtils.isEmpty(str)) {
            Iterator it = JSON.parseArray(str, StateEmotion.class).iterator();
            while (it.hasNext()) {
                for (Emotion emotion : ((StateEmotion) it.next()).emotions) {
                    BubbleInfo bubbleInfoNew_ = BubbleInfo.new_();
                    bubbleInfoNew_.emotion = emotion;
                    bubbleInfoNew_.setPostSelectBubbleState(true);
                    arrayListF0.add(bubbleInfoNew_);
                }
            }
            if (!vwb.J(list) && !vwb.J(arrayListF0)) {
                for (final BubbleInfo bubbleInfo : list) {
                    BubbleInfo bubbleInfo2 = (BubbleInfo) vwb.r(arrayListF0, new w9j() { // from class: l.r0i
                        public final Object call(Object obj) {
                            BubbleInfo bubbleInfo3 = bubbleInfo;
                            BubbleInfo bubbleInfo4 = (BubbleInfo) obj;
                            return Boolean.valueOf(NullChecker.a(bubbleInfo3.emotion) && NullChecker.a(bubbleInfo4.emotion) && TextUtils.equals(bubbleInfo3.emotion.f209id, bubbleInfo4.emotion.f209id));
                        }
                    });
                    if (NullChecker.a(bubbleInfo2)) {
                        bubbleInfo.emotion.backgroundColor = bubbleInfo2.emotion.backgroundColor;
                    }
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: F */
    public final void m6912F(final boolean z) {
        if (z) {
            this.f4391e = "";
        }
        this.f4390d.duringCreated(FeedModule.f316d.m16415A7(this.f4391e)).subscribe(mkd0.H(new e30() { // from class: l.p0i
            public final void call(Object obj) {
                this.f11665a.m6914L(z, (Envelope) obj);
            }
        }, new e30() { // from class: l.q0i
            public final void call(Object obj) {
                this.f12042a.m6915M((Throwable) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K */
    public final void m6913K(Context context) {
        RecyclerView recyclerViewFindViewById = findViewById(b5c0.f6104x1);
        this.f4387a = recyclerViewFindViewById;
        recyclerViewFindViewById.setPadding(t100.d(9.0f), 1, 0, 0);
        this.f4387a.setLayoutManager(new LinearLayoutManager(context, 0, false));
        x0i x0iVar = new x0i((Act) context, this.f4393g);
        this.f4388b = x0iVar;
        x0iVar.m15973V(new e30() { // from class: l.s0i
            public final void call(Object obj) {
                this.f12774a.m6917O((Integer) obj);
            }
        });
        this.f4387a.setAdapter(this.f4388b);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m6914L(boolean z, Envelope envelope) {
        if (z) {
            this.f4389c.clear();
        }
        m6919Q(((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        this.f4392f = false;
        String str = envelope.pagination.links.next;
        this.f4391e = str;
        this.f4388b.m15974W(str);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m6915M(Throwable th) {
        this.f4392f = false;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m6916N(Boolean bool) {
        mo6923b();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m6917O(Integer num) {
        if (num.intValue() <= this.f4388b.getItemCount() - 4 || this.f4392f) {
            return;
        }
        m6920R();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m6918P(Map map) {
        BubbleInfo bubbleInfo = (BubbleInfo) map.get(((DbObject) FeedModule.m1140H().me_()).id);
        if (this.f4389c.size() > 0) {
            this.f4389c.remove(0);
            List<BubbleInfo> list = this.f4389c;
            if (bubbleInfo == null) {
                list.add(0, new MineAskPostState());
            } else {
                list.add(0, m6910C(bubbleInfo));
            }
            this.f4388b.notifyItemChanged(0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public final void m6919Q(List<BubbleInfo> list) {
        if (this.f4389c.size() == 0 && (list.size() == 0 || !((DbObject) FeedModule.m1140H().me_()).id.equals(list.get(0).owner.f264id))) {
            this.f4389c.add(new MineAskPostState());
        }
        this.f4389c.addAll(m6911E(list));
        if (this.f4389c.size() > 0) {
            setVisibility(0);
        }
        m6921S(this.f4389c);
    }

    /* JADX INFO: renamed from: R */
    public final void m6920R() {
        if (TextUtils.isEmpty(this.f4391e)) {
            return;
        }
        m6912F(false);
        this.f4392f = true;
    }

    /* JADX INFO: renamed from: S */
    public void m6921S(List<BubbleInfo> list) {
        this.f4389c = list;
        this.f4388b.m15972U(list);
    }

    /* JADX INFO: renamed from: T */
    public final void m6922T() {
        this.f4390d.duringCreated(FeedModule.f316d.m16488K7()).subscribe(mkd0.G(new e30() { // from class: l.t0i
            public final void call(Object obj) {
                this.f13145a.m6918P((Map) obj);
            }
        }));
    }

    @Override // p007l.bwh
    /* JADX INFO: renamed from: b */
    public void mo6923b() {
        m6912F(true);
    }

    public FeedStateFollowFeedHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4389c = new ArrayList();
        m6903G(context);
    }

    public FeedStateFollowFeedHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4389c = new ArrayList();
        m6903G(context);
    }
}
