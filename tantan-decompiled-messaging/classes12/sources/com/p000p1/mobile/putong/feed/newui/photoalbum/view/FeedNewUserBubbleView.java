package com.p000p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.data.OperationType;
import com.p000p1.mobile.putong.feed.data.PublishGuide;
import com.p000p1.mobile.putong.feed.data.TopicMoment;
import com.p000p1.mobile.putong.feed.data.TopicOperations;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.j760;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.xdl0;
import p007l.iih;
import p007l.oe40;
import p007l.p6j0;
import v.VImage;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedNewUserBubbleView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VRelative f3892d;

    /* JADX INFO: renamed from: e */
    public VImage f3893e;

    /* JADX INFO: renamed from: f */
    public VText f3894f;

    /* JADX INFO: renamed from: g */
    public VLinear f3895g;

    /* JADX INFO: renamed from: h */
    public TextView f3896h;

    /* JADX INFO: renamed from: i */
    public VText f3897i;

    /* JADX INFO: renamed from: j */
    public PhotoAlbumFeedFrag f3898j;

    /* JADX INFO: renamed from: k */
    public TopicOperations f3899k;

    /* JADX INFO: renamed from: l */
    public int f3900l;

    /* JADX INFO: renamed from: m */
    public boolean f3901m;

    public FeedNewUserBubbleView(Context context) {
        super(context);
        m6257H(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H */
    private void m6257H(Context context) {
        setPadding(0, 1, 0, 0);
        addView(m6268z(LayoutInflater.from(context), this));
        this.f3894f.setTypeface((Typeface) null, 1);
        xdl0.M(this.f3892d, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m6258I(View view) {
        m6259Q();
    }

    /* JADX INFO: renamed from: Q */
    private void m6259Q() {
        m6263B();
        if (NullChecker.a(this.f3899k) && NullChecker.a(this.f3899k.publishGuide)) {
            TopicMoment topicMomentNew_ = TopicMoment.new_();
            PublishGuide publishGuide = this.f3899k.publishGuide;
            topicMomentNew_.f708id = publishGuide.topicId;
            topicMomentNew_.name = publishGuide.topicName;
            oe40.m12589n0(this.f3898j.act(), vwb.f0(new Media[0]), false, "newuser_checkin", this.f3899k.publishGuide.momentValue, null, topicMomentNew_, null);
        }
    }

    private String getPageId() {
        int i = this.f3900l;
        if (i == 12) {
            return "p_like";
        }
        if (i != 14) {
            return i != 15 ? "p_follow" : "p_discover_discussion";
        }
        return "p_discover_dating";
    }

    /* JADX INFO: renamed from: r */
    private void m6262r() {
        xdl0.E0(this.f3892d, new View.OnClickListener() { // from class: l.hih
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8746a.m6258I(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m6263B() {
        p6j0.m12913c("e_newuser_checkin_moment", getPageId(), new j760[0]);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m6264L(roj0 roj0Var) {
        xdl0.M(this.f3892d, false);
    }

    /* JADX INFO: renamed from: M */
    public void m6265M(PhotoAlbumFeedFrag photoAlbumFeedFrag, int i) {
        this.f3898j = photoAlbumFeedFrag;
        this.f3900l = i;
        m6262r();
        photoAlbumFeedFrag.duringCreated(FeedModule.f316d.f14911A1).subscribe(mkd0.G(new e30() { // from class: l.gih
            public final void call(Object obj) {
                this.f8463a.m6264L((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m6266O(TopicOperations topicOperations) {
        if (topicOperations == null || !TEnum.equals(topicOperations.operationType, OperationType.newUserAIMoment)) {
            xdl0.M(this.f3892d, false);
            return;
        }
        this.f3899k = topicOperations;
        PublishGuide publishGuide = topicOperations.publishGuide;
        if (publishGuide != null) {
            this.f3896h.setText(publishGuide.title);
            this.f3897i.setText(publishGuide.subTitle);
            xdl0.M(this.f3892d, true);
            if (this.f3901m) {
                return;
            }
            m6267P();
        }
    }

    /* JADX INFO: renamed from: P */
    public void m6267P() {
        this.f3901m = true;
        p6j0.m12915e("e_newuser_checkin_moment", getPageId(), new j760[0]);
    }

    /* JADX INFO: renamed from: z */
    public View m6268z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return iih.m10889b(this, layoutInflater, viewGroup);
    }

    public FeedNewUserBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6257H(context);
    }

    public FeedNewUserBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6257H(context);
    }
}
