package com.p051p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.OperationType;
import com.p051p1.mobile.putong.feed.data.PublishGuide;
import com.p051p1.mobile.putong.feed.data.TopicMoment;
import com.p051p1.mobile.putong.feed.data.TopicOperations;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.cn40;
import p153l.jyb;
import p153l.pf60;
import p153l.psd0;
import p153l.tfj0;
import p153l.uxj0;
import p153l.xjh;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class FeedNewUserBubbleView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VRelative f43279d;

    /* JADX INFO: renamed from: e */
    public VImage f43280e;

    /* JADX INFO: renamed from: f */
    public VText f43281f;

    /* JADX INFO: renamed from: g */
    public VLinear f43282g;

    /* JADX INFO: renamed from: h */
    public TextView f43283h;

    /* JADX INFO: renamed from: i */
    public VText f43284i;

    /* JADX INFO: renamed from: j */
    public PhotoAlbumFeedFrag f43285j;

    /* JADX INFO: renamed from: k */
    public TopicOperations f43286k;

    /* JADX INFO: renamed from: l */
    public int f43287l;

    /* JADX INFO: renamed from: m */
    public boolean f43288m;

    public FeedNewUserBubbleView(Context context) {
        super(context);
        m66339H(context);
    }

    /* JADX INFO: renamed from: H */
    private void m66339H(Context context) {
        setPadding(0, 1, 0, 0);
        addView(m66350z(LayoutInflater.from(context), this));
        this.f43281f.setTypeface(null, 1);
        bnl0.m105524M(this.f43279d, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m66340I(View view) {
        m66341Q();
    }

    /* JADX INFO: renamed from: Q */
    private void m66341Q() {
        m66345B();
        if (NullChecker.m82486a(this.f43286k) && NullChecker.m82486a(this.f43286k.publishGuide)) {
            TopicMoment topicMomentNew_ = TopicMoment.new_();
            PublishGuide publishGuide = this.f43286k.publishGuide;
            topicMomentNew_.f40095id = publishGuide.topicId;
            topicMomentNew_.name = publishGuide.topicName;
            cn40.m111402n0(this.f43285j.act(), jyb.m147507f0(new Media[0]), false, "newuser_checkin", this.f43286k.publishGuide.momentValue, null, topicMomentNew_, null);
        }
    }

    private String getPageId() {
        int i = this.f43287l;
        if (i == 12) {
            return "p_like";
        }
        if (i != 14) {
            return i != 15 ? "p_follow" : "p_discover_discussion";
        }
        return "p_discover_dating";
    }

    /* JADX INFO: renamed from: r */
    private void m66344r() {
        bnl0.m105509E0(this.f43279d, new View.OnClickListener() { // from class: l.wjh
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f189458a.m66340I(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m66345B() {
        tfj0.m190940c("e_newuser_checkin_moment", getPageId(), new pf60[0]);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m66346L(uxj0 uxj0Var) {
        bnl0.m105524M(this.f43279d, false);
    }

    /* JADX INFO: renamed from: M */
    public void m66347M(PhotoAlbumFeedFrag photoAlbumFeedFrag, int i) {
        this.f43285j = photoAlbumFeedFrag;
        this.f43287l = i;
        m66344r();
        photoAlbumFeedFrag.duringCreated(FeedModule.f39703d.f121286A1).subscribe(psd0.m173596G(new y20() { // from class: l.vjh
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f184385a.m66346L((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m66348O(TopicOperations topicOperations) {
        if (topicOperations == null || !TEnum.equals(topicOperations.operationType, OperationType.newUserAIMoment)) {
            bnl0.m105524M(this.f43279d, false);
            return;
        }
        this.f43286k = topicOperations;
        PublishGuide publishGuide = topicOperations.publishGuide;
        if (publishGuide != null) {
            this.f43283h.setText(publishGuide.title);
            this.f43284i.setText(publishGuide.subTitle);
            bnl0.m105524M(this.f43279d, true);
            if (this.f43288m) {
                return;
            }
            m66349P();
        }
    }

    /* JADX INFO: renamed from: P */
    public void m66349P() {
        this.f43288m = true;
        tfj0.m190942e("e_newuser_checkin_moment", getPageId(), new pf60[0]);
    }

    /* JADX INFO: renamed from: z */
    public View m66350z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return xjh.m211216b(this, layoutInflater, viewGroup);
    }

    public FeedNewUserBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m66339H(context);
    }

    public FeedNewUserBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66339H(context);
    }
}
