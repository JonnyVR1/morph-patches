package com.p000p1.mobile.putong.feed.newui.topic.topicplugin;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedAggregationTabLayout extends TabLayout {
    public FeedAggregationTabLayout(Context context) {
        super(context);
        m7283a();
    }

    /* JADX INFO: renamed from: a */
    private void m7283a() {
        try {
            Field declaredField = TabLayout.class.getDeclaredField("scrollableTabMinWidth");
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(t100.d(46.0f)));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            CrashHelper.c(e);
        }
    }

    public FeedAggregationTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m7283a();
    }

    public FeedAggregationTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m7283a();
    }
}
