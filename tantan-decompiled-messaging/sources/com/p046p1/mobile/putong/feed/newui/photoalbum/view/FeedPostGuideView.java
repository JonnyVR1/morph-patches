package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.OperationType;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.a5i;
import p149l.fm20;
import p149l.hth;
import p149l.j760;
import p149l.mqi0;
import p149l.nkg;
import p149l.oe40;
import p149l.p6j0;
import p149l.tpd0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.zpd0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedPostGuideView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VRelative f42450d;

    /* JADX INFO: renamed from: e */
    public VImage f42451e;

    /* JADX INFO: renamed from: f */
    public VText f42452f;

    /* JADX INFO: renamed from: g */
    public VLinear f42453g;

    /* JADX INFO: renamed from: h */
    public TextView f42454h;

    /* JADX INFO: renamed from: i */
    public VText f42455i;

    /* JADX INFO: renamed from: j */
    public PhotoAlbumBaseFrag f42456j;

    /* JADX INFO: renamed from: k */
    public int f42457k;

    /* JADX INFO: renamed from: l */
    public TopicOperations f42458l;

    /* JADX INFO: renamed from: m */
    public List<TopicMoment> f42459m;

    /* JADX INFO: renamed from: n */
    public boolean f42460n;

    public FeedPostGuideView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m65178H(View view) {
        m65182B();
        final String str = this.f42458l.postGuide.topicId;
        if (!TextUtils.isEmpty(str) && TEnum.equals(this.f42458l.operationType, OperationType.man_made)) {
            TopicMoment topicMoment = (TopicMoment) vwb.m200346r(this.f42459m, new w9j() { // from class: l.gth
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f39247id.equals(str));
                }
            });
            if (NullChecker.m81303a(topicMoment)) {
                Act act = this.f42456j.act();
                ArrayList arrayListM200324f0 = vwb.m200324f0(new Media[0]);
                TopicOperations topicOperations = this.f42458l;
                oe40.m163850m0(act, arrayListM200324f0, true, "moment_post_guide", topicOperations.postGuide.momentValue, topicOperations.operationType.toString(), topicMoment);
                return;
            }
        }
        Act act2 = this.f42456j.act();
        ArrayList arrayListM200324f1 = vwb.m200324f0(new Media[0]);
        TopicOperations topicOperations2 = this.f42458l;
        oe40.m163848l0(act2, arrayListM200324f1, true, "moment_post_guide", topicOperations2.postGuide.momentValue, topicOperations2.operationType.toString());
    }

    private List<j760<String, String>> getGuideViewTrackingParis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.m140076a("moment_post_guide_type", this.f42458l.operationType.toString()));
        arrayList.add(j760.m140076a("moment_post_guide_id", this.f42458l.f39248id));
        return arrayList;
    }

    private String getPageId() {
        if (!nkg.m159904s()) {
            return OMSDialogPositon.p_nearby;
        }
        int i = this.f42457k;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    /* JADX INFO: renamed from: r */
    private void m65181r() {
        if (TEnum.equals(this.f42458l.operationType, OperationType.album_num_inc)) {
            FeedModule.f38859h.lastDetectedMediaCount.put(Integer.valueOf(this.f42456j.f41451A.f151816o));
        }
        this.f42454h.setText(this.f42458l.postGuide.title);
        boolean zIsEmpty = TextUtils.isEmpty(this.f42458l.postGuide.subTitle);
        VText vText = this.f42455i;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f42455i.setText(this.f42458l.postGuide.subTitle);
        }
        this.f42450d.setOnClickListener(new View.OnClickListener() { // from class: l.fth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99208a.m65178H(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m65182B() {
        p6j0.m167669c("e_moment_post_guide", getPageId(), (j760[]) getGuideViewTrackingParis().toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: I */
    public void m65183I(PhotoAlbumBaseFrag photoAlbumBaseFrag, int i, j760<TopicOperations, List<TopicMoment>> j760Var) {
        this.f42456j = photoAlbumBaseFrag;
        this.f42457k = i;
        this.f42459m = j760Var.f116565b;
        if (NullChecker.m81303a(this.f42458l) && !this.f42458l.operationType.equals(j760Var.f116564a.operationType)) {
            int i2 = this.f42458l.position;
            TopicOperations topicOperations = j760Var.f116564a;
            if (i2 == topicOperations.position && !this.f42460n) {
                this.f42458l = topicOperations;
                m65185M();
            }
        }
        this.f42458l = j760Var.f116564a;
        m65181r();
        xdl0.m208344M(this.f42450d, true);
    }

    /* JADX INFO: renamed from: L */
    public void m65184L() {
        this.f42460n = true;
    }

    /* JADX INFO: renamed from: M */
    public void m65185M() {
        zpd0 zpd0Var = new zpd0("show_guide_time_" + this.f42458l.operationType + FeedModule.m60221F().userId() + this.f42457k, 0L);
        long jLongValue = zpd0Var.get().longValue();
        zpd0Var.put(Long.valueOf(mqi0.m155944o()));
        if (TEnum.equals(this.f42458l.operationType, OperationType.man_made)) {
            tpd0 tpd0Var = new tpd0("show_man_made_guide_count_" + this.f42458l.operationType + FeedModule.m60221F().userId() + this.f42457k, 0);
            int iIntValue = tpd0Var.get().intValue();
            if (jLongValue <= 0 || !a5i.m95036l(jLongValue, mqi0.m155944o())) {
                tpd0Var.put(1);
            } else if (iIntValue < fm20.m122131n()) {
                tpd0Var.put(Integer.valueOf(iIntValue + 1));
            }
        }
        this.f42460n = false;
        p6j0.m167671e("e_moment_post_guide", getPageId(), (j760[]) getGuideViewTrackingParis().toArray(new j760[0]));
    }

    public TopicOperations getShowTopicOperations() {
        return this.f42458l;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPadding(0, 1, 0, 0);
        m65186z(this);
        xdl0.m208344M(this.f42450d, false);
        this.f42452f.setTypeface(null, 1);
    }

    /* JADX INFO: renamed from: z */
    public final void m65186z(View view) {
        hth.m132865a(this, view);
    }

    public FeedPostGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPostGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
