package com.p000p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedActivitiesTabLayout extends TabLayout {
    public FeedActivitiesTabLayout(Context context) {
        super(context);
        m6099a();
    }

    /* JADX INFO: renamed from: a */
    public final void m6099a() {
        try {
            Field declaredField = TabLayout.class.getDeclaredField("scrollableTabMinWidth");
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(t100.d(57.0f)));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            CrashHelper.c(e);
        }
    }

    public FeedActivitiesTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m6099a();
    }

    public FeedActivitiesTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m6099a();
    }
}
