package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.OperationType;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.byd0;
import p153l.cmg;
import p153l.cn40;
import p153l.jyb;
import p153l.p6i;
import p153l.pf60;
import p153l.pu20;
import p153l.pzi0;
import p153l.qcj;
import p153l.tfj0;
import p153l.vxd0;
import p153l.wuh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedPostGuideView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VRelative f43298d;

    /* JADX INFO: renamed from: e */
    public VImage f43299e;

    /* JADX INFO: renamed from: f */
    public VText f43300f;

    /* JADX INFO: renamed from: g */
    public VLinear f43301g;

    /* JADX INFO: renamed from: h */
    public TextView f43302h;

    /* JADX INFO: renamed from: i */
    public VText f43303i;

    /* JADX INFO: renamed from: j */
    public PhotoAlbumBaseFrag f43304j;

    /* JADX INFO: renamed from: k */
    public int f43305k;

    /* JADX INFO: renamed from: l */
    public TopicOperations f43306l;

    /* JADX INFO: renamed from: m */
    public List<TopicMoment> f43307m;

    /* JADX INFO: renamed from: n */
    public boolean f43308n;

    public FeedPostGuideView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m66361H(View view) {
        m66365B();
        final String str = this.f43306l.postGuide.topicId;
        if (!TextUtils.isEmpty(str) && TEnum.equals(this.f43306l.operationType, OperationType.man_made)) {
            TopicMoment topicMoment = (TopicMoment) jyb.m147529r(this.f43307m, new qcj() { // from class: l.vuh
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f40095id.equals(str));
                }
            });
            if (NullChecker.m82486a(topicMoment)) {
                Act act = this.f43304j.act();
                ArrayList arrayListM147507f0 = jyb.m147507f0(new Media[0]);
                TopicOperations topicOperations = this.f43306l;
                cn40.m111400m0(act, arrayListM147507f0, true, "moment_post_guide", topicOperations.postGuide.momentValue, topicOperations.operationType.toString(), topicMoment);
                return;
            }
        }
        Act act2 = this.f43304j.act();
        ArrayList arrayListM147507f1 = jyb.m147507f0(new Media[0]);
        TopicOperations topicOperations2 = this.f43306l;
        cn40.m111398l0(act2, arrayListM147507f1, true, "moment_post_guide", topicOperations2.postGuide.momentValue, topicOperations2.operationType.toString());
    }

    private List<pf60<String, String>> getGuideViewTrackingParis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pf60.m172085a("moment_post_guide_type", this.f43306l.operationType.toString()));
        arrayList.add(pf60.m172085a("moment_post_guide_id", this.f43306l.f40096id));
        return arrayList;
    }

    private String getPageId() {
        if (!cmg.m111233s()) {
            return OMSDialogPositon.p_nearby;
        }
        int i = this.f43305k;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    /* JADX INFO: renamed from: r */
    private void m66364r() {
        if (TEnum.equals(this.f43306l.operationType, OperationType.album_num_inc)) {
            FeedModule.f39707h.lastDetectedMediaCount.put(Integer.valueOf(this.f43304j.f42299A.f182618o));
        }
        this.f43302h.setText(this.f43306l.postGuide.title);
        boolean zIsEmpty = TextUtils.isEmpty(this.f43306l.postGuide.subTitle);
        VText vText = this.f43303i;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f43303i.setText(this.f43306l.postGuide.subTitle);
        }
        this.f43298d.setOnClickListener(new View.OnClickListener() { // from class: l.uuh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f181079a.m66361H(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m66365B() {
        tfj0.m190940c("e_moment_post_guide", getPageId(), (pf60[]) getGuideViewTrackingParis().toArray(new pf60[0]));
    }

    /* JADX INFO: renamed from: I */
    public void m66366I(PhotoAlbumBaseFrag photoAlbumBaseFrag, int i, pf60<TopicOperations, List<TopicMoment>> pf60Var) {
        this.f43304j = photoAlbumBaseFrag;
        this.f43305k = i;
        this.f43307m = pf60Var.f152157b;
        if (NullChecker.m82486a(this.f43306l) && !this.f43306l.operationType.equals(pf60Var.f152156a.operationType)) {
            int i2 = this.f43306l.position;
            TopicOperations topicOperations = pf60Var.f152156a;
            if (i2 == topicOperations.position && !this.f43308n) {
                this.f43306l = topicOperations;
                m66368M();
            }
        }
        this.f43306l = pf60Var.f152156a;
        m66364r();
        bnl0.m105524M(this.f43298d, true);
    }

    /* JADX INFO: renamed from: L */
    public void m66367L() {
        this.f43308n = true;
    }

    /* JADX INFO: renamed from: M */
    public void m66368M() {
        byd0 byd0Var = new byd0("show_guide_time_" + this.f43306l.operationType + FeedModule.m61405F().userId() + this.f43305k, 0L);
        long jLongValue = byd0Var.get().longValue();
        byd0Var.put(Long.valueOf(pzi0.m174454o()));
        if (TEnum.equals(this.f43306l.operationType, OperationType.man_made)) {
            vxd0 vxd0Var = new vxd0("show_man_made_guide_count_" + this.f43306l.operationType + FeedModule.m61405F().userId() + this.f43305k, 0);
            int iIntValue = vxd0Var.get().intValue();
            if (jLongValue <= 0 || !p6i.m170903l(jLongValue, pzi0.m174454o())) {
                vxd0Var.put(1);
            } else if (iIntValue < pu20.m173819n()) {
                vxd0Var.put(Integer.valueOf(iIntValue + 1));
            }
        }
        this.f43308n = false;
        tfj0.m190942e("e_moment_post_guide", getPageId(), (pf60[]) getGuideViewTrackingParis().toArray(new pf60[0]));
    }

    public TopicOperations getShowTopicOperations() {
        return this.f43306l;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPadding(0, 1, 0, 0);
        m66369z(this);
        bnl0.m105524M(this.f43298d, false);
        this.f43300f.setTypeface(null, 1);
    }

    /* JADX INFO: renamed from: z */
    public final void m66369z(View view) {
        wuh.m207950a(this, view);
    }

    public FeedPostGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPostGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
