package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.TextView;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.MediaLocalStatus;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.Group;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.TopicOperationsGroup;
import com.p000p1.mobile.putong.feed.newui.camera.widget.MakeUpMenuView;
import com.p000p1.mobile.putong.feed.newui.group.groupdetail.FeedGroupDetailAct;
import com.p000p1.mobile.putong.feed.newui.view.FeedAudioPlayerView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import l.j760;
import l.mqi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import p007l.bsg;
import p007l.f3c0;
import p007l.nkg;
import p007l.p6j0;
import p007l.s7i;
import p007l.vqg;
import p007l.vs0;
import p007l.y6h;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;
import v.text.CustomTypefaceSpan;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedGroupView extends VRelative {

    /* JADX INFO: renamed from: A */
    public VImage f3845A;

    /* JADX INFO: renamed from: B */
    public VImage f3846B;

    /* JADX INFO: renamed from: C */
    public String f3847C;

    /* JADX INFO: renamed from: D */
    public boolean f3848D;

    /* JADX INFO: renamed from: E */
    public Group f3849E;

    /* JADX INFO: renamed from: F */
    public Moment f3850F;

    /* JADX INFO: renamed from: d */
    public VRelative f3851d;

    /* JADX INFO: renamed from: e */
    public VRelative f3852e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f3853f;

    /* JADX INFO: renamed from: g */
    public VRelative f3854g;

    /* JADX INFO: renamed from: h */
    public VImage f3855h;

    /* JADX INFO: renamed from: i */
    public VLinear f3856i;

    /* JADX INFO: renamed from: j */
    public VRelative f3857j;

    /* JADX INFO: renamed from: k */
    public TextView f3858k;

    /* JADX INFO: renamed from: l */
    public VLinear f3859l;

    /* JADX INFO: renamed from: m */
    public VFrame f3860m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f3861n;

    /* JADX INFO: renamed from: o */
    public VFrame f3862o;

    /* JADX INFO: renamed from: p */
    public VDraweeView f3863p;

    /* JADX INFO: renamed from: q */
    public VFrame f3864q;

    /* JADX INFO: renamed from: r */
    public VDraweeView f3865r;

    /* JADX INFO: renamed from: s */
    public VText f3866s;

    /* JADX INFO: renamed from: t */
    public VImage f3867t;

    /* JADX INFO: renamed from: u */
    public TextView f3868u;

    /* JADX INFO: renamed from: v */
    public VFrame f3869v;

    /* JADX INFO: renamed from: w */
    public FeedAudioPlayerView f3870w;

    /* JADX INFO: renamed from: x */
    public VFrame f3871x;

    /* JADX INFO: renamed from: y */
    public VFrame f3872y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f3873z;

    public FeedGroupView(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m6221I(View view) {
        this.f3850F.setRecommendTime(mqi0.o() - ((long) ((new Random().nextInt(5) + 1) * MakeUpMenuView.MakeupCategory.TYPE_MAKEUP_BEAUTYAUTO)));
        m6229z();
        getContext().startActivity(new FeedGroupDetailAct.C2044a(getContext(), ((DbObject) this.f3849E).id).m2964d(((DbObject) this.f3850F).id).m2961a());
    }

    private List<j760<String, String>> getFeedGroupViewTrackingParis() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.a("circle_id", ((DbObject) this.f3849E).id));
        arrayList.add(j760.a("moment_id", ((DbObject) this.f3850F).id));
        return arrayList;
    }

    /* JADX INFO: renamed from: B */
    public final void m6223B() {
        xdl0.M(this.f3869v, true);
        if (vqg.m15500X(this.f3850F)) {
            xdl0.M(this.f3870w, true);
            xdl0.M(this.f3871x, false);
            xdl0.M(this.f3872y, false);
            this.f3870w.m7441Z0(this.f3850F, false);
            this.f3870w.m7444e1(this.f3847C, this.f3848D);
        } else if (vwb.J(this.f3850F.media)) {
            xdl0.M(this.f3869v, false);
            xdl0.M(this.f3870w, false);
            xdl0.M(this.f3871x, false);
            xdl0.M(this.f3872y, false);
        } else {
            Media media = this.f3850F.media.get(0);
            if (media instanceof Video) {
                xdl0.M(this.f3870w, false);
                xdl0.M(this.f3871x, false);
                xdl0.M(this.f3872y, true);
                m6227O(media);
            } else if (media instanceof Picture) {
                xdl0.M(this.f3870w, false);
                xdl0.M(this.f3871x, true);
                xdl0.M(this.f3872y, false);
                m6226M(this.f3850F.media);
            }
        }
        xdl0.U(this.f3851d, t100.d(xdl0.O0(this.f3869v) ? 18.0f : 15.0f));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: H */
    public final void m6224H(List<User> list, int i) {
        String str;
        this.f3858k.setText(this.f3849E.name);
        if (list.size() >= 3) {
            qib0.G.Q0(this.f3861n, list.get(2).m1042fp().profileSmall());
            qib0.G.Q0(this.f3863p, list.get(1).m1042fp().profileSmall());
            qib0.G.Q0(this.f3865r, list.get(0).m1042fp().profileSmall());
        }
        if (TextUtils.equals(this.f3847C, "from_nearby_focus")) {
            if (i > 99) {
                str = "99+";
            } else {
                str = i + "";
            }
            this.f3866s.setText("等人更新了" + str + "条内容");
        } else {
            this.f3866s.setText(this.f3849E.userCounter + "人正在圈子中热聊");
        }
        User userM16628e8 = FeedModule.f316d.m16628e8(this.f3850F.owner);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("@" + vs0.m15563a(this.f3850F, s7i.m14045k(userM16628e8 != null ? userM16628e8.name : "", 8)));
        if (!TextUtils.isEmpty(this.f3850F.value)) {
            spannableStringBuilder.append((CharSequence) ": ");
        }
        spannableStringBuilder.setSpan(new CustomTypefaceSpan("sans-serif", Typeface.DEFAULT_BOLD), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) this.f3850F.value);
        this.f3868u.setText(spannableStringBuilder);
        xdl0.E0(this, new View.OnClickListener() { // from class: l.x6h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14781a.m6221I(view);
            }
        });
        this.f3870w.setMaxWidth(Integer.MAX_VALUE);
        m6223B();
    }

    /* JADX INFO: renamed from: L */
    public void m6225L(String str, boolean z, Moment moment, j760<TopicOperationsGroup, Group> j760Var) {
        Object obj;
        Object obj2;
        boolean z2 = false;
        if (j760Var == null || moment == null || (obj = j760Var.a) == null || (obj2 = j760Var.b) == null) {
            xdl0.M(this.f3851d, false);
            return;
        }
        this.f3847C = str;
        this.f3848D = z;
        this.f3849E = (Group) obj2;
        this.f3850F = moment;
        TopicOperationsGroup topicOperationsGroup = (TopicOperationsGroup) obj;
        xdl0.M(this.f3851d, true);
        xdl0.M(this.f3854g, nkg.m12217O());
        xdl0.M(this.f3853f, !nkg.m12217O());
        if (!nkg.m12217O()) {
            qib0.G.I0(this.f3853f, this.f3849E.headIcon, t100.d(38.0f), t100.d(40.0f));
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = topicOperationsGroup.userIds.iterator();
        while (it.hasNext()) {
            User userM16628e8 = FeedModule.f316d.m16628e8(it.next());
            if (NullChecker.a(userM16628e8)) {
                arrayList.add(userM16628e8);
            }
        }
        VLinear vLinear = this.f3859l;
        if (topicOperationsGroup.unread >= 3 && arrayList.size() >= 3) {
            z2 = true;
        }
        xdl0.M(vLinear, z2);
        m6224H(arrayList, topicOperationsGroup.unread);
    }

    /* JADX INFO: renamed from: M */
    public final void m6226M(List<Media> list) {
        bsg.m9028f(this.f3850F, list, this.f3871x, "", true, null);
    }

    /* JADX INFO: renamed from: O */
    public final void m6227O(Media media) {
        Picture picture = ((Video) media).cover;
        if (picture == null) {
            return;
        }
        this.f3873z.getHierarchy().H(RoundingParams.c(vqg.m15551y()).w(RoundingParams.RoundingMethod.BITMAP_ONLY));
        xdl0.M(this.f3845A, false);
        this.f3846B.setImageResource(f3c0.f7578B6);
        if (TEnum.equals(picture.status, MediaLocalStatus.raw) || TextUtils.isEmpty(picture.url)) {
            return;
        }
        qib0.G.Q0(this.f3873z, picture.calculatedWidth(t100.d(94.0f)));
        this.f3873z.setZoomAnimationKey(Media.URL_TO_CACHEKEY(picture.url));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        setPadding(0, 1, 0, 0);
        m6228q(this);
    }

    /* JADX INFO: renamed from: q */
    public final void m6228q(View view) {
        y6h.m16947a(this, view);
    }

    /* JADX INFO: renamed from: z */
    public void m6229z() {
        p6j0.m12913c("e_circle_update", vqg.m15485K(this.f3847C, this.f3848D), (j760[]) getFeedGroupViewTrackingParis().toArray(new j760[0]));
    }

    public FeedGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public FeedGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
