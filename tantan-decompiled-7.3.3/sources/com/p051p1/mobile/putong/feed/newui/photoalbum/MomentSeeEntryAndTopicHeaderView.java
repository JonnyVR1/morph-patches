package com.p051p1.mobile.putong.feed.newui.photoalbum;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.feed.newui.group.FeedGroupEntranceView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear;
import p153l.cmg;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class MomentSeeEntryAndTopicHeaderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public FeedGroupEntranceView f41881c;

    public MomentSeeEntryAndTopicHeaderView(Context context) {
        super(context);
        m64437P(context);
    }

    /* JADX INFO: renamed from: P */
    private void m64437P(Context context) {
        setOrientation(1);
        setPadding(getPaddingLeft(), getPaddingTop(), getPaddingRight(), qa00.m175859d(8.0f));
        if (cmg.m111186N()) {
            FeedGroupEntranceView feedGroupEntranceView = new FeedGroupEntranceView(context);
            this.f41881c = feedGroupEntranceView;
            addView(feedGroupEntranceView);
        }
    }

    /* JADX INFO: renamed from: Q */
    public void m64438Q(PutongFrag putongFrag) {
        m64439R(putongFrag);
    }

    /* JADX INFO: renamed from: R */
    public void m64439R(PutongFrag putongFrag) {
        if (NullChecker.m82486a(this.f41881c)) {
            this.f41881c.m63077X(putongFrag);
        }
    }

    public MomentSeeEntryAndTopicHeaderView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        m64437P(context);
    }

    public MomentSeeEntryAndTopicHeaderView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m64437P(context);
    }
}
