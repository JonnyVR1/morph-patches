package com.p046p1.mobile.putong.feed.newui.photoalbum.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.OperationType;
import com.p046p1.mobile.putong.feed.data.PublishGuide;
import com.p046p1.mobile.putong.feed.data.TopicMoment;
import com.p046p1.mobile.putong.feed.data.TopicOperations;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedFrag;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.e30;
import p149l.iih;
import p149l.j760;
import p149l.mkd0;
import p149l.oe40;
import p149l.p6j0;
import p149l.roj0;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class FeedNewUserBubbleView extends VRelative {

    /* JADX INFO: renamed from: d */
    public VRelative f42431d;

    /* JADX INFO: renamed from: e */
    public VImage f42432e;

    /* JADX INFO: renamed from: f */
    public VText f42433f;

    /* JADX INFO: renamed from: g */
    public VLinear f42434g;

    /* JADX INFO: renamed from: h */
    public TextView f42435h;

    /* JADX INFO: renamed from: i */
    public VText f42436i;

    /* JADX INFO: renamed from: j */
    public PhotoAlbumFeedFrag f42437j;

    /* JADX INFO: renamed from: k */
    public TopicOperations f42438k;

    /* JADX INFO: renamed from: l */
    public int f42439l;

    /* JADX INFO: renamed from: m */
    public boolean f42440m;

    public FeedNewUserBubbleView(Context context) {
        super(context);
        m65156H(context);
    }

    /* JADX INFO: renamed from: H */
    private void m65156H(Context context) {
        setPadding(0, 1, 0, 0);
        addView(m65167z(LayoutInflater.from(context), this));
        this.f42433f.setTypeface(null, 1);
        xdl0.m208344M(this.f42431d, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public /* synthetic */ void m65157I(View view) {
        m65158Q();
    }

    /* JADX INFO: renamed from: Q */
    private void m65158Q() {
        m65162B();
        if (NullChecker.m81303a(this.f42438k) && NullChecker.m81303a(this.f42438k.publishGuide)) {
            TopicMoment topicMomentNew_ = TopicMoment.new_();
            PublishGuide publishGuide = this.f42438k.publishGuide;
            topicMomentNew_.f39247id = publishGuide.topicId;
            topicMomentNew_.name = publishGuide.topicName;
            oe40.m163852n0(this.f42437j.act(), vwb.m200324f0(new Media[0]), false, "newuser_checkin", this.f42438k.publishGuide.momentValue, null, topicMomentNew_, null);
        }
    }

    private String getPageId() {
        int i = this.f42439l;
        if (i == 12) {
            return "p_like";
        }
        if (i != 14) {
            return i != 15 ? "p_follow" : "p_discover_discussion";
        }
        return "p_discover_dating";
    }

    /* JADX INFO: renamed from: r */
    private void m65161r() {
        xdl0.m208329E0(this.f42431d, new View.OnClickListener() { // from class: l.hih
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107929a.m65157I(view);
            }
        });
    }

    /* JADX INFO: renamed from: B */
    public void m65162B() {
        p6j0.m167669c("e_newuser_checkin_moment", getPageId(), new j760[0]);
    }

    /* JADX INFO: renamed from: L */
    public final /* synthetic */ void m65163L(roj0 roj0Var) {
        xdl0.m208344M(this.f42431d, false);
    }

    /* JADX INFO: renamed from: M */
    public void m65164M(PhotoAlbumFeedFrag photoAlbumFeedFrag, int i) {
        this.f42437j = photoAlbumFeedFrag;
        this.f42439l = i;
        m65161r();
        photoAlbumFeedFrag.duringCreated(FeedModule.f38855d.f192976A1).subscribe(mkd0.m154955G(new e30() { // from class: l.gih
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f102900a.m65163L((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O */
    public void m65165O(TopicOperations topicOperations) {
        if (topicOperations == null || !TEnum.equals(topicOperations.operationType, OperationType.newUserAIMoment)) {
            xdl0.m208344M(this.f42431d, false);
            return;
        }
        this.f42438k = topicOperations;
        PublishGuide publishGuide = topicOperations.publishGuide;
        if (publishGuide != null) {
            this.f42435h.setText(publishGuide.title);
            this.f42436i.setText(publishGuide.subTitle);
            xdl0.m208344M(this.f42431d, true);
            if (this.f42440m) {
                return;
            }
            m65166P();
        }
    }

    /* JADX INFO: renamed from: P */
    public void m65166P() {
        this.f42440m = true;
        p6j0.m167671e("e_newuser_checkin_moment", getPageId(), new j760[0]);
    }

    /* JADX INFO: renamed from: z */
    public View m65167z(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return iih.m136393b(this, layoutInflater, viewGroup);
    }

    public FeedNewUserBubbleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m65156H(context);
    }

    public FeedNewUserBubbleView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m65156H(context);
    }
}
