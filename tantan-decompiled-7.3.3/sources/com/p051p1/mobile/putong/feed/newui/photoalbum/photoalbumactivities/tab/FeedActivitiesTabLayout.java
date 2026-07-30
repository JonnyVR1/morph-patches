package com.p051p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import p153l.qa00;

/* JADX INFO: loaded from: classes13.dex */
public class FeedActivitiesTabLayout extends TabLayout {
    public FeedActivitiesTabLayout(Context context) {
        super(context);
        m66182a();
    }

    /* JADX INFO: renamed from: a */
    public final void m66182a() {
        try {
            Field declaredField = TabLayout.class.getDeclaredField("scrollableTabMinWidth");
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(qa00.m175859d(57.0f)));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            CrashHelper.m82479c(e);
        }
    }

    public FeedActivitiesTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m66182a();
    }

    public FeedActivitiesTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m66182a();
    }
}
