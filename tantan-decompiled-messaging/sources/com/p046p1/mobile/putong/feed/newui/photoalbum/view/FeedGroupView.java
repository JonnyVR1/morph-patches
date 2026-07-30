package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.google.android.gms.common.api.Api;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.Group;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.TopicOperationsGroup;
import com.p046p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p046p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p147v.text.CustomTypefaceSpan;
import p149l.bsg;
import p149l.f3c0;
import p149l.j760;
import p149l.mqi0;
import p149l.nkg;
import p149l.p6j0;
import p149l.qib0;
import p149l.s7i;
import p149l.t100;
import p149l.vqg;
import p149l.vs0;
import p149l.vwb;
import p149l.xdl0;
import p149l.y6h;

/* JADX INFO: loaded from: classes12.dex */
public class FeedGroupView extends VRelative {

    /* JADX INFO: renamed from: A */
    public VImage f42384A;

    /* JADX INFO: renamed from: B */
    public VImage f42385B;

    /* JADX INFO: renamed from: C */
    public String f42386C;

    /* JADX INFO: renamed from: D */
    public boolean f42387D;

    /* JADX INFO: renamed from: E */
    public Group f42388E;

    /* JADX INFO: renamed from: F */
    public Moment f42389F;

    /* JADX INFO: renamed from: d */
    public VRelative f42390d;

    /* JADX INFO: renamed from: e */
    public VRelative f42391e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f42392f;

    /* JADX INFO: renamed from: g */
    public VRelative f42393g;

    /* JADX INFO: renamed from: h */
    public VImage f42394h;

    /* JADX INFO: renamed from: i */
    public VLinear f42395i;

    /* JADX INFO: renamed from: j */
    public VRelative f42396j;

    /* JADX INFO: renamed from: k */
    public TextView f42397k;

    /* JADX INFO: renamed from: l */
    public VLinear f42398l;

    /* JADX INFO: renamed from: m */
    public VFrame f42399m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f42400n;

    /* JADX INFO: renamed from: o */
    public VFrame f42401o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f42402p;

    /* JADX INFO: renamed from: q */
    public VFrame f42403q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f42404r;

    /* JADX INFO: renamed from: s */
    public VText f42405s;

    /* JADX INFO: renamed from: t */
    public VImage f42406t;

    /* JADX INFO: renamed from: u */
    public TextView f42407u;

    /* JADX INFO: renamed from: v */
    public VFrame f42408v;

    /* JADX INFO: renamed from: w */
    public FeedAudioPlayerView f42409w;

    /* JADX INFO: renamed from: x */
    public VFrame f42410x;

    /* JADX INFO: renamed from: y */
    public VFrame f42411y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f42412z;

    public FeedGroupView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m65120I(View view) {
        this.f42389F.setRecommendTime(mqi0.m155944o() - ((long) ((new Random().nextInt(5) + 1) * 1000)));
        m65128z();
        getContext().startActivity(new FeedGroupDetailAct.C11200a((Act) getContext(), this.f42388E.f56011id).m61990d(this.f42389F.f56011id).m61987a());
    }

    private List<j760<String, String>> getFeedGroupViewTrackingParis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.m140076a("circle_id", this.f42388E.f56011id));
        arrayList.add(j760.m140076a("moment_id", this.f42389F.f56011id));
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public final void m65122B() {
        xdl0.m208344M(this.f42408v, true);
        if (vqg.m199530X(this.f42389F)) {
            xdl0.m208344M(this.f42409w, true);
            xdl0.m208344M(this.f42410x, false);
            xdl0.m208344M(this.f42411y, false);
            this.f42409w.m66281Z0(this.f42389F, false);
            this.f42409w.m66284e1(this.f42386C, this.f42387D);
        } else if (vwb.m200296J(this.f42389F.media)) {
            xdl0.m208344M(this.f42408v, false);
            xdl0.m208344M(this.f42409w, false);
            xdl0.m208344M(this.f42410x, false);
            xdl0.m208344M(this.f42411y, false);
        } else {
            Media media = this.f42389F.media.get(0);
            if (media instanceof Video) {
                xdl0.m208344M(this.f42409w, false);
                xdl0.m208344M(this.f42410x, false);
                xdl0.m208344M(this.f42411y, true);
                m65126O(media);
            } else if (media instanceof Picture) {
                xdl0.m208344M(this.f42409w, false);
                xdl0.m208344M(this.f42410x, true);
                xdl0.m208344M(this.f42411y, false);
                m65125M(this.f42389F.media);
            }
        }
        xdl0.m208357U(this.f42390d, t100.m186890d(xdl0.m208349O0(this.f42408v) ? 18.0f : 15.0f));
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: H */
    public final void m65123H(List<User> list, int i) {
        String str;
        this.f42397k.setText(this.f42388E.name);
        if (list.size() >= 3) {
            qib0.f154691G.m102341Q0(this.f42400n, list.get(2).m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f42402p, list.get(1).m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f42404r, list.get(0).m60124fp().profileSmall());
        }
        if (TextUtils.equals(this.f42386C, "from_nearby_focus")) {
            if (i > 99) {
                str = "99+";
            } else {
                str = i + "";
            }
            this.f42405s.setText("等人更新了" + str + "条内容");
        } else {
            this.f42405s.setText(this.f42388E.userCounter + "人正在圈子中热聊");
        }
        User userM209447e8 = FeedModule.f38855d.m209447e8(this.f42389F.owner);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@" + vs0.m199795a(this.f42389F, s7i.m182497k(userM209447e8 != null ? userM209447e8.name : "", 8)));
        if (!TextUtils.isEmpty(this.f42389F.value)) {
            spannableStringBuilder.append((CharSequence) ": ");
        }
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) this.f42389F.value);
        this.f42407u.setText(spannableStringBuilder);
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.x6h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191243a.m65120I(view);
            }
        });
        this.f42409w.setMaxWidth(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        m65122B();
    }

    /* JADX INFO: renamed from: L */
    public void m65124L(String str, boolean z, Moment moment, j760<TopicOperationsGroup, Group> j760Var) {
        TopicOperationsGroup topicOperationsGroup;
        Group group;
        boolean z2 = false;
        if (j760Var == null || moment == null || (topicOperationsGroup = j760Var.f116564a) == null || (group = j760Var.f116565b) == null) {
            xdl0.m208344M(this.f42390d, false);
            return;
        }
        this.f42386C = str;
        this.f42387D = z;
        this.f42388E = group;
        this.f42389F = moment;
        TopicOperationsGroup topicOperationsGroup2 = topicOperationsGroup;
        xdl0.m208344M(this.f42390d, true);
        xdl0.m208344M(this.f42393g, nkg.m159858O());
        xdl0.m208344M(this.f42392f, !nkg.m159858O());
        if (!nkg.m159858O()) {
            qib0.f154691G.m102325I0(this.f42392f, this.f42388E.headIcon, t100.m186890d(38.0f), t100.m186890d(40.0f));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = topicOperationsGroup2.userIds.iterator();
        while (it.hasNext()) {
            User userM209447e8 = FeedModule.f38855d.m209447e8(it.next());
            if (NullChecker.m81303a(userM209447e8)) {
                arrayList.add(userM209447e8);
            }
        }
        VLinear vLinear = this.f42398l;
        if (topicOperationsGroup2.unread >= 3 && arrayList.size() >= 3) {
            z2 = true;
        }
        xdl0.m208344M(vLinear, z2);
        m65123H(arrayList, topicOperationsGroup2.unread);
    }

    /* JADX INFO: renamed from: M */
    public final void m65125M(List<Media> list) {
        bsg.m103715f(this.f42389F, list, this.f42410x, "", true, null);
    }

    /* JADX INFO: renamed from: O */
    public final void m65126O(Media media) {
        Picture picture = ((Video) media).cover;
        if (picture == null) {
            return;
        }
        this.f42412z.getHierarchy().m112053H(RoundingParams.m8249c(vqg.m199581y()).m8269w(RoundingParams.RoundingMethod.BITMAP_ONLY));
        xdl0.m208344M(this.f42384A, false);
        this.f42385B.setImageResource(f3c0.f94295B6);
        if (TEnum.equals(picture.status, "raw") || TextUtils.isEmpty(picture.url)) {
            return;
        }
        qib0.f154691G.m102341Q0(this.f42412z, picture.calculatedWidth(t100.m186890d(94.0f)));
        this.f42412z.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setPadding(0, 1, 0, 0);
        m65127q(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m65127q(View view) {
        y6h.m213128a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m65128z() {
        p6j0.m167669c("e_circle_update", vqg.m199515K(this.f42386C, this.f42387D), (j760[]) getFeedGroupViewTrackingParis().toArray(new j760[0]));
    }

    public FeedGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
