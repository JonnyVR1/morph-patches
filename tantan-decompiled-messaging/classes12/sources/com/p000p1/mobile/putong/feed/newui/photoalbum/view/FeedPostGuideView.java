package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.OMSDialogPositon;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.OperationType;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p000p1.mobile.putong.feed.newui.photoalbum.basefrag.PhotoAlbumBaseFrag;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.mqi0;
import l.tpd0;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zpd0;
import p007l.a5i;
import p007l.fm20;
import p007l.hth;
import p007l.nkg;
import p007l.oe40;
import p007l.p6j0;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedPostGuideView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VRelative f3911d;

    /* JADX INFO: renamed from: e */
    public VImage f3912e;

    /* JADX INFO: renamed from: f */
    public VText f3913f;

    /* JADX INFO: renamed from: g */
    public VLinear f3914g;

    /* JADX INFO: renamed from: h */
    public TextView f3915h;

    /* JADX INFO: renamed from: i */
    public VText f3916i;

    /* JADX INFO: renamed from: j */
    public PhotoAlbumBaseFrag f3917j;

    /* JADX INFO: renamed from: k */
    public int f3918k;

    /* JADX INFO: renamed from: l */
    public TopicOperations f3919l;

    /* JADX INFO: renamed from: m */
    public List<TopicMoment> f3920m;

    /* JADX INFO: renamed from: n */
    public boolean f3921n;

    public FeedPostGuideView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: H */
    public /* synthetic */ void m6279H(View view) {
        m6283B();
        final String str = this.f3919l.postGuide.topicId;
        if (!TextUtils.isEmpty(str) && TEnum.equals(this.f3919l.operationType, OperationType.man_made)) {
            TopicMoment topicMoment = (TopicMoment) vwb.r(this.f3920m, new w9j() { // from class: l.gth
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TopicMoment) obj).f708id.equals(str));
                }
            });
            if (NullChecker.a(topicMoment)) {
                Act act = this.f3917j.act();
                ArrayList arrayListF0 = vwb.f0(new Media[0]);
                TopicOperations topicOperations = this.f3919l;
                oe40.m12587m0(act, arrayListF0, true, "moment_post_guide", topicOperations.postGuide.momentValue, topicOperations.operationType.toString(), topicMoment);
                return;
            }
        }
        Act act2 = this.f3917j.act();
        ArrayList arrayListF1 = vwb.f0(new Media[0]);
        TopicOperations topicOperations2 = this.f3919l;
        oe40.m12585l0(act2, arrayListF1, true, "moment_post_guide", topicOperations2.postGuide.momentValue, topicOperations2.operationType.toString());
    }

    private List<j760<String, String>> getGuideViewTrackingParis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.a("moment_post_guide_type", this.f3919l.operationType.toString()));
        arrayList.add(j760.a("moment_post_guide_id", this.f3919l.f709id));
        return arrayList;
    }

    private String getPageId() {
        if (!nkg.m12263s()) {
            return OMSDialogPositon.p_nearby;
        }
        int i = this.f3918k;
        if (i == 14) {
            return "p_discover_dating";
        }
        return i == 15 ? "p_discover_discussion" : "p_follow";
    }

    /* JADX INFO: renamed from: r */
    private void m6282r() {
        if (TEnum.equals(this.f3919l.operationType, OperationType.album_num_inc)) {
            FeedModule.f320h.lastDetectedMediaCount.put(Integer.valueOf(this.f3917j.f2912A.f12024o));
        }
        this.f3915h.setText(this.f3919l.postGuide.title);
        boolean zIsEmpty = TextUtils.isEmpty(this.f3919l.postGuide.subTitle);
        VText vText = this.f3916i;
        if (zIsEmpty) {
            vText.setVisibility(8);
        } else {
            vText.setVisibility(0);
            this.f3916i.setText(this.f3919l.postGuide.subTitle);
        }
        this.f3911d.setOnClickListener(new View.OnClickListener() { // from class: l.fth
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8250a.m6279H(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m6283B() {
        p6j0.m12913c("e_moment_post_guide", getPageId(), (j760[]) getGuideViewTrackingParis().toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: I */
    public void m6284I(PhotoAlbumBaseFrag photoAlbumBaseFrag, int i, j760<TopicOperations, List<TopicMoment>> j760Var) {
        this.f3917j = photoAlbumBaseFrag;
        this.f3918k = i;
        this.f3920m = (List) j760Var.b;
        if (NullChecker.a(this.f3919l) && !this.f3919l.operationType.equals(((TopicOperations) j760Var.a).operationType)) {
            int i2 = this.f3919l.position;
            Object obj = j760Var.a;
            if (i2 == ((TopicOperations) obj).position && !this.f3921n) {
                this.f3919l = (TopicOperations) obj;
                m6286M();
            }
        }
        this.f3919l = (TopicOperations) j760Var.a;
        m6282r();
        xdl0.M(this.f3911d, true);
    }

    /* JADX INFO: renamed from: L */
    public void m6285L() {
        this.f3921n = true;
    }

    /* JADX INFO: renamed from: M */
    public void m6286M() {
        zpd0 zpd0Var = new zpd0("show_guide_time_" + this.f3919l.operationType + FeedModule.m1139F().userId() + this.f3918k, 0L);
        long jLongValue = ((Long) zpd0Var.get()).longValue();
        zpd0Var.put(Long.valueOf(mqi0.o()));
        if (TEnum.equals(this.f3919l.operationType, OperationType.man_made)) {
            tpd0 tpd0Var = new tpd0("show_man_made_guide_count_" + this.f3919l.operationType + FeedModule.m1139F().userId() + this.f3918k, 0);
            int iIntValue = ((Integer) tpd0Var.get()).intValue();
            if (jLongValue <= 0 || !a5i.m8412l(jLongValue, mqi0.o())) {
                tpd0Var.put(1);
            } else if (iIntValue < fm20.m10234n()) {
                tpd0Var.put(Integer.valueOf(iIntValue + 1));
            }
        }
        this.f3921n = false;
        p6j0.m12915e("e_moment_post_guide", getPageId(), (j760[]) getGuideViewTrackingParis().toArray(new j760[0]));
    }

    public TopicOperations getShowTopicOperations() {
        return this.f3919l;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        setPadding(0, 1, 0, 0);
        m6287z(this);
        xdl0.M(this.f3911d, false);
        this.f3913f.setTypeface((Typeface) null, 1);
    }

    /* JADX INFO: renamed from: z */
    public final void m6287z(View view) {
        hth.m10730a(this, view);
    }

    public FeedPostGuideView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedPostGuideView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
