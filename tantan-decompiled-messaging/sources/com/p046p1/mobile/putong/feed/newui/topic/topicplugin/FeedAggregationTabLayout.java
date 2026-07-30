package com.p046p1.mobile.putong.feed.newui.topic.topicplugin;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class FeedAggregationTabLayout extends TabLayout {
    public FeedAggregationTabLayout(Context context) {
        super(context);
        m66131a();
    }

    /* JADX INFO: renamed from: a */
    private void m66131a() {
        try {
            Field declaredField = TabLayout.class.getDeclaredField("scrollableTabMinWidth");
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(t100.m186890d(46.0f)));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            CrashHelper.m81296c(e);
        }
    }

    public FeedAggregationTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m66131a();
    }

    public FeedAggregationTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66131a();
    }
}
