package com.p051p1.mobile.putong.feed.newui.topic.topicplugin;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class FeedAggregationTabLayout extends TabLayout {
    public FeedAggregationTabLayout(Context context) {
        super(context);
        m67314a();
    }

    /* JADX INFO: renamed from: a */
    private void m67314a() {
        try {
            Field declaredField = TabLayout.class.getDeclaredField("scrollableTabMinWidth");
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(qa00.m175859d(46.0f)));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            CrashHelper.m82479c(e);
        }
    }

    public FeedAggregationTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m67314a();
    }

    public FeedAggregationTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m67314a();
    }
}
