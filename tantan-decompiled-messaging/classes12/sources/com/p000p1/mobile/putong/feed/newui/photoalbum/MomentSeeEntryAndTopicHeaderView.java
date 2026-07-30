package com.p000p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.feed.newui.group.FeedGroupEntranceView;
import com.p1.mobile.putong.app.PutongFrag;
import com.tantanapp.common.utils.NullChecker;
import l.t100;
import p007l.nkg;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class MomentSeeEntryAndTopicHeaderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public FeedGroupEntranceView f2494c;

    public MomentSeeEntryAndTopicHeaderView(Context context) {
        super(context);
        m4271P(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [android.view.View, com.p1.mobile.putong.feed.newui.group.FeedGroupEntranceView] */
    /* JADX INFO: renamed from: P */
    private void m4271P(Context context) {
        setOrientation(1);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), t100.d(8.0f));
        if (nkg.m12216N()) {
            ?? feedGroupEntranceView = new FeedGroupEntranceView(context);
            this.f2494c = feedGroupEntranceView;
            addView(feedGroupEntranceView);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m4272Q(PutongFrag putongFrag) {
        m4273R(putongFrag);
    }

    /* JADX INFO: renamed from: R */
    public void m4273R(PutongFrag putongFrag) {
        if (NullChecker.a(this.f2494c)) {
            this.f2494c.m2861X(putongFrag);
        }
    }

    public MomentSeeEntryAndTopicHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m4271P(context);
    }

    public MomentSeeEntryAndTopicHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m4271P(context);
    }
}
