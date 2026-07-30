package com.p051p1.mobile.putong.feed.newui.status.entrance.followheader;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.alibaba.fastjson.JSON;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.StateEmotion;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p137rx.subjects.C22508b;
import p151v.VFrame;
import p153l.hdc0;
import p153l.jyb;
import p153l.ksg;
import p153l.m2i;
import p153l.owi;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.qxh;
import p153l.tec0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedStateFollowFeedHeaderView extends VFrame implements qxh {

    /* JADX INFO: renamed from: h */
    public static C22508b<String> f43773h = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public RecyclerView f43774a;

    /* JADX INFO: renamed from: b */
    public m2i f43775b;

    /* JADX INFO: renamed from: c */
    public List<BubbleInfo> f43776c;

    /* JADX INFO: renamed from: d */
    public Act f43777d;

    /* JADX INFO: renamed from: e */
    public String f43778e;

    /* JADX INFO: renamed from: f */
    public boolean f43779f;

    /* JADX INFO: renamed from: g */
    public String f43780g;

    public FeedStateFollowFeedHeaderView(Context context, String str) {
        super(context);
        this.f43776c = new ArrayList();
        this.f43780g = str;
        m66940G(context);
    }

    /* JADX INFO: renamed from: G */
    private void m66940G(Context context) {
        this.f43777d = (Act) context;
        LayoutInflater.from(context).inflate(tec0.f173538M0, this);
        setVisibility(8);
        m66950K(context);
        m66959T();
        m66949F(false);
        this.f43777d.duringCreated(FeedModule.f39703d.f121380t1).subscribe(psd0.m173596G(new y20() { // from class: l.d2i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84792a.m66953N((Boolean) obj);
            }
        }));
    }

    private String getPageId() {
        return ksg.m151174K(this.f43780g, false);
    }

    /* JADX INFO: renamed from: C */
    public final BubbleInfo m66947C(final BubbleInfo bubbleInfo) {
        ArrayList arrayListM147507f0 = jyb.m147507f0(new BubbleInfo[0]);
        String str = owi.f149488g.get();
        if (!TextUtils.isEmpty(str)) {
            Iterator it = JSON.parseArray(str, StateEmotion.class).iterator();
            while (it.hasNext()) {
                for (Emotion emotion : ((StateEmotion) it.next()).emotions) {
                    BubbleInfo bubbleInfoNew_ = BubbleInfo.new_();
                    bubbleInfoNew_.emotion = emotion;
                    bubbleInfoNew_.setPostSelectBubbleState(true);
                    arrayListM147507f0.add(bubbleInfoNew_);
                }
            }
            if (NullChecker.m82486a(bubbleInfo)) {
                BubbleInfo bubbleInfo2 = (BubbleInfo) jyb.m147529r(arrayListM147507f0, new qcj() { // from class: l.j2i
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        BubbleInfo bubbleInfo3 = bubbleInfo;
                        BubbleInfo bubbleInfo4 = (BubbleInfo) obj;
                        return Boolean.valueOf(NullChecker.m82486a(bubbleInfo3.emotion) && NullChecker.m82486a(bubbleInfo4.emotion) && TextUtils.equals(bubbleInfo3.emotion.f39596id, bubbleInfo4.emotion.f39596id));
                    }
                });
                if (NullChecker.m82486a(bubbleInfo2)) {
                    bubbleInfo.emotion.backgroundColor = bubbleInfo2.emotion.backgroundColor;
                }
            }
        }
        return bubbleInfo;
    }

    /* JADX INFO: renamed from: E */
    public final List<BubbleInfo> m66948E(List<BubbleInfo> list) {
        ArrayList arrayListM147507f0 = jyb.m147507f0(new BubbleInfo[0]);
        String str = owi.f149488g.get();
        if (!TextUtils.isEmpty(str)) {
            Iterator it = JSON.parseArray(str, StateEmotion.class).iterator();
            while (it.hasNext()) {
                for (Emotion emotion : ((StateEmotion) it.next()).emotions) {
                    BubbleInfo bubbleInfoNew_ = BubbleInfo.new_();
                    bubbleInfoNew_.emotion = emotion;
                    bubbleInfoNew_.setPostSelectBubbleState(true);
                    arrayListM147507f0.add(bubbleInfoNew_);
                }
            }
            if (!jyb.m147479J(list) && !jyb.m147479J(arrayListM147507f0)) {
                for (final BubbleInfo bubbleInfo : list) {
                    BubbleInfo bubbleInfo2 = (BubbleInfo) jyb.m147529r(arrayListM147507f0, new qcj() { // from class: l.g2i
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            BubbleInfo bubbleInfo3 = bubbleInfo;
                            BubbleInfo bubbleInfo4 = (BubbleInfo) obj;
                            return Boolean.valueOf(NullChecker.m82486a(bubbleInfo3.emotion) && NullChecker.m82486a(bubbleInfo4.emotion) && TextUtils.equals(bubbleInfo3.emotion.f39596id, bubbleInfo4.emotion.f39596id));
                        }
                    });
                    if (NullChecker.m82486a(bubbleInfo2)) {
                        bubbleInfo.emotion.backgroundColor = bubbleInfo2.emotion.backgroundColor;
                    }
                }
            }
        }
        return list;
    }

    /* JADX INFO: renamed from: F */
    public final void m66949F(final boolean z) {
        if (z) {
            this.f43778e = "";
        }
        this.f43777d.duringCreated(FeedModule.f39703d.m145475A7(this.f43778e)).subscribe(psd0.m173597H(new y20() { // from class: l.e2i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f91766a.m66951L(z, (Envelope) obj);
            }
        }, new y20() { // from class: l.f2i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f96884a.m66952M((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: K */
    public final void m66950K(Context context) {
        RecyclerView recyclerView = (RecyclerView) findViewById(hdc0.f108976x1);
        this.f43774a = recyclerView;
        recyclerView.setPadding(qa00.m175859d(9.0f), 1, 0, 0);
        this.f43774a.setLayoutManager(new LinearLayoutManager(context, 0, false));
        m2i m2iVar = new m2i((Act) context, this.f43780g);
        this.f43775b = m2iVar;
        m2iVar.m156855V(new y20() { // from class: l.h2i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107559a.m66954O((Integer) obj);
            }
        });
        this.f43774a.setAdapter(this.f43775b);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m66951L(boolean z, Envelope envelope) {
        if (z) {
            this.f43776c.clear();
        }
        m66956Q(((FeedData) envelope.data.getModuleData(FeedData.class)).states);
        this.f43779f = false;
        String str = envelope.pagination.links.next;
        this.f43778e = str;
        this.f43775b.m156856W(str);
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m66952M(Throwable th) {
        this.f43779f = false;
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m66953N(Boolean bool) {
        mo66960b();
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m66954O(Integer num) {
        if (num.intValue() <= this.f43775b.getItemCount() - 4 || this.f43779f) {
            return;
        }
        m66957R();
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m66955P(Map map) {
        BubbleInfo bubbleInfo = (BubbleInfo) map.get(FeedModule.m61406H().me_().f56859id);
        if (this.f43776c.size() > 0) {
            this.f43776c.remove(0);
            List<BubbleInfo> list = this.f43776c;
            if (bubbleInfo == null) {
                list.add(0, new MineAskPostState());
            } else {
                list.add(0, m66947C(bubbleInfo));
            }
            this.f43775b.notifyItemChanged(0);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m66956Q(List<BubbleInfo> list) {
        if (this.f43776c.size() == 0 && (list.size() == 0 || !FeedModule.m61406H().me_().f56859id.equals(list.get(0).owner.f39651id))) {
            this.f43776c.add(new MineAskPostState());
        }
        this.f43776c.addAll(m66948E(list));
        if (this.f43776c.size() > 0) {
            setVisibility(0);
        }
        m66958S(this.f43776c);
    }

    /* JADX INFO: renamed from: R */
    public final void m66957R() {
        if (TextUtils.isEmpty(this.f43778e)) {
            return;
        }
        m66949F(false);
        this.f43779f = true;
    }

    /* JADX INFO: renamed from: S */
    public void m66958S(List<BubbleInfo> list) {
        this.f43776c = list;
        this.f43775b.m156854U(list);
    }

    /* JADX INFO: renamed from: T */
    public final void m66959T() {
        this.f43777d.duringCreated(FeedModule.f39703d.m145548K7()).subscribe(psd0.m173596G(new y20() { // from class: l.i2i
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112622a.m66955P((Map) obj);
            }
        }));
    }

    @Override // p153l.qxh
    /* JADX INFO: renamed from: b */
    public void mo66960b() {
        m66949F(true);
    }

    public FeedStateFollowFeedHeaderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f43776c = new ArrayList();
        m66940G(context);
    }

    public FeedStateFollowFeedHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f43776c = new ArrayList();
        m66940G(context);
    }
}
