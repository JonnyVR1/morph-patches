package com.p046p1.mobile.putong.feed.newui.status.entrance.followheader;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.StateEmotion;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p133rx.subjects.C22393b;
import p147v.VFrame;
import p149l.b5c0;
import p149l.bwh;
import p149l.e30;
import p149l.mkd0;
import p149l.o6c0;
import p149l.sti;
import p149l.t100;
import p149l.vqg;
import p149l.vwb;
import p149l.w9j;
import p149l.x0i;

/* JADX INFO: loaded from: classes12.dex */
public class FeedStateFollowFeedHeaderView extends VFrame implements bwh {

    /* JADX INFO: renamed from: h */
    public static C22393b<String> f42925h = C22393b.m221521b();

    /* JADX INFO: renamed from: a */
    public RecyclerView f42926a;

    /* JADX INFO: renamed from: b */
    public x0i f42927b;

    /* JADX INFO: renamed from: c */
    public List<BubbleInfo> f42928c;

    /* JADX INFO: renamed from: d */
    public Act f42929d;

    /* JADX INFO: renamed from: e */
    public String f42930e;

    /* JADX INFO: renamed from: f */
    public boolean f42931f;

    /* JADX INFO: renamed from: g */
    public String f42932g;

    public FeedStateFollowFeedHeaderView(Context context, String str) {
        super(context);
        this.f42928c = new ArrayList();
        this.f42932g = str;
        m65757G(context);
    }

    /* JADX INFO: renamed from: G */
    private void m65757G(Context context) {
        this.f42929d = (Act) context;
        LayoutInflater.from(context).inflate(o6c0.f142069M0, this);
        setVisibility(8);
        m65767K(context);
        m65776T();
        m65766F(false);
        this.f42929d.duringCreated(FeedModule.f38855d.f193070t1).subscribe(mkd0.m154955G(new e30() { // from class: l.o0i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141337a.m65770N((Boolean) obj);
            }
        }));
    }

    private String getPageId() {
        return vqg.m199515K(this.f42932g, false);
    }

    /* JADX INFO: renamed from: C */
    public final BubbleInfo m65764C(final BubbleInfo bubbleInfo) {
        ArrayList arrayListM200324f0 = vwb.m200324f0(new BubbleInfo[0]);
        String str = sti.f166363g.get();
        if (!TextUtils.isEmpty(str)) {
            Iterator it = JSON.parseArray(str, StateEmotion.class).iterator();
            while (it.hasNext()) {
                for (Emotion emotion : ((StateEmotion) it.next()).emotions) {
                    BubbleInfo bubbleInfoNew_ = BubbleInfo.new_();
                    bubbleInfoNew_.emotion = emotion;
                    bubbleInfoNew_.setPostSelectBubbleState(true);
                    arrayListM200324f0.add(bubbleInfoNew_);
                }
            }
            if (NullChecker.m81303a(bubbleInfo)) {
                BubbleInfo bubbleInfo2 = (BubbleInfo) vwb.m200346r(arrayListM200324f0, new w9j() { // from class: l.u0i
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        BubbleInfo bubbleInfo3 = bubbleInfo;
                        BubbleInfo bubbleInfo4 = (BubbleInfo) obj;
                        return Boolean.valueOf(NullChecker.m81303a(bubbleInfo3.emotion) && NullChecker.m81303a(bubbleInfo4.emotion) && TextUtils.equals(bubbleInfo3.emotion.f38748id, bubbleInfo4.emotion.f38748id));
                    }
                });
                if (NullChecker.m81303a(bubbleInfo2)) {
                    bubbleInfo.emotion.backgroundColor = bubbleInfo2.emotion.backgroundColor;
                }
            }
        }
        return bubbleInfo;
    }

    /* JADX INFO: renamed from: E */
    public final List<BubbleInfo> m65765E(List<BubbleInfo> list) {
        ArrayList arrayListM200324f0 = vwb.m200324f0(new BubbleInfo[0]);
        String str = sti.f166363g.get();
        if (!TextUtils.isEmpty(str)) {
            Iterator it = JSON.parseArray(str, StateEmotion.class).iterator();
            while (it.hasNext()) {
                for (Emotion emotion : ((StateEmotion) it.next()).emotions) {
                    BubbleInfo bubbleInfoNew_ = BubbleInfo.new_();
                    bubbleInfoNew_.emotion = emotion;
                    bubbleInfoNew_.setPostSelectBubbleState(true);
                    arrayListM200324f0.add(bubbleInfoNew_);
                }
            }
            if (!vwb.m200296J(list) && !vwb.m200296J(arrayListM200324f0)) {
                for (final BubbleInfo bubbleInfo : list) {
                    BubbleInfo bubbleInfo2 = (BubbleInfo) vwb.m200346r(arrayListM200324f0, new w9j() { // from class: l.r0i
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            BubbleInfo bubbleInfo3 = bubbleInfo;
                            BubbleInfo bubbleInfo4 = (BubbleInfo) obj;
                            return Boolean.valueOf(NullChecker.m81303a(bubbleInfo3.emotion) && NullChecker.m81303a(bubbleInfo4.emotion) && TextUtils.equals(bubbleInfo3.emotion.f38748id, bubbleInfo4.emotion.f38748id));
                        }
                    });
                    if (NullChecker.m81303a(bubbleInfo2)) {
                        bubbleInfo.emotion.backgroundColor = bubbleInfo2.emotion.backgroundColor;
                    }
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: F */
    public final void m65766F(final boolean z) {
        if (z) {
            this.f42930e = "";
        }
        this.f42929d.duringCreated(FeedModule.f38855d.m209234A7(this.f42930e)).subscribe(mkd0.m154956H(new e30() { // from class: l.p0i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f146601a.m65768L(z, (Envelope) obj);
            }
        }, new e30() { // from class: l.q0i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152058a.m65769M((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public final void m65767K(Context context) {
        RecyclerView recyclerView = (RecyclerView) findViewById(b5c0.f73623x1);
        this.f42926a = recyclerView;
        recyclerView.setPadding(t100.m186890d(9.0f), 1, 0, 0);
        this.f42926a.setLayoutManager(new LinearLayoutManager(context, 0, false));
        x0i x0iVar = new x0i((Act) context, this.f42932g);
        this.f42927b = x0iVar;
        x0iVar.m206628V(new e30() { // from class: l.s0i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f161772a.m65771O((Integer) obj);
            }
        });
        this.f42926a.setAdapter(this.f42927b);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m65768L(boolean z, Envelope envelope) {
        if (z) {
            this.f42928c.clear();
        }
        m65773Q(((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        this.f42931f = false;
        String str = envelope.pagination.links.next;
        this.f42930e = str;
        this.f42927b.m206629W(str);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m65769M(Throwable th) {
        this.f42931f = false;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m65770N(Boolean bool) {
        mo65777b();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m65771O(Integer num) {
        if (num.intValue() <= this.f42927b.getItemCount() - 4 || this.f42931f) {
            return;
        }
        m65774R();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m65772P(Map map) {
        BubbleInfo bubbleInfo = (BubbleInfo) map.get(FeedModule.m60222H().me_().f56011id);
        if (this.f42928c.size() > 0) {
            this.f42928c.remove(0);
            List<BubbleInfo> list = this.f42928c;
            if (bubbleInfo == null) {
                list.add(0, new MineAskPostState());
            } else {
                list.add(0, m65764C(bubbleInfo));
            }
            this.f42927b.notifyItemChanged(0);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m65773Q(List<BubbleInfo> list) {
        if (this.f42928c.size() == 0 && (list.size() == 0 || !FeedModule.m60222H().me_().f56011id.equals(list.get(0).owner.f38803id))) {
            this.f42928c.add(new MineAskPostState());
        }
        this.f42928c.addAll(m65765E(list));
        if (this.f42928c.size() > 0) {
            setVisibility(0);
        }
        m65775S(this.f42928c);
    }

    /* JADX INFO: renamed from: R */
    public final void m65774R() {
        if (TextUtils.isEmpty(this.f42930e)) {
            return;
        }
        m65766F(false);
        this.f42931f = true;
    }

    /* JADX INFO: renamed from: S */
    public void m65775S(List<BubbleInfo> list) {
        this.f42928c = list;
        this.f42927b.m206627U(list);
    }

    /* JADX INFO: renamed from: T */
    public final void m65776T() {
        this.f42929d.duringCreated(FeedModule.f38855d.m209307K7()).subscribe(mkd0.m154955G(new e30() { // from class: l.t0i
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167189a.m65772P((Map) obj);
            }
        }));
    }

    @Override // p149l.bwh
    /* JADX INFO: renamed from: b */
    public void mo65777b() {
        m65766F(true);
    }

    public FeedStateFollowFeedHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f42928c = new ArrayList();
        m65757G(context);
    }

    public FeedStateFollowFeedHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f42928c = new ArrayList();
        m65757G(context);
    }
}
