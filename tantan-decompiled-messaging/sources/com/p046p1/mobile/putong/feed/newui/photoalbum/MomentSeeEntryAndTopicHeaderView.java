package com.p046p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.feed.newui.group.FeedGroupEntranceView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear;
import p149l.nkg;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class MomentSeeEntryAndTopicHeaderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public FeedGroupEntranceView f41033c;

    public MomentSeeEntryAndTopicHeaderView(Context context) {
        super(context);
        m63254P(context);
    }

    /* JADX INFO: renamed from: P */
    private void m63254P(Context context) {
        setOrientation(1);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), t100.m186890d(8.0f));
        if (nkg.m159857N()) {
            FeedGroupEntranceView feedGroupEntranceView = new FeedGroupEntranceView(context);
            this.f41033c = feedGroupEntranceView;
            addView(feedGroupEntranceView);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m63255Q(PutongFrag putongFrag) {
        m63256R(putongFrag);
    }

    /* JADX INFO: renamed from: R */
    public void m63256R(PutongFrag putongFrag) {
        if (NullChecker.m81303a(this.f41033c)) {
            this.f41033c.m61894X(putongFrag);
        }
    }

    public MomentSeeEntryAndTopicHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m63254P(context);
    }

    public MomentSeeEntryAndTopicHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m63254P(context);
    }
}
