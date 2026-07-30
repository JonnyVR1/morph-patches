package com.p046p1.mobile.putong.feed.newui.photoalbum.photoalbumactivities.tab;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.material.tabs.TabLayout;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import p149l.t100;

/* JADX INFO: loaded from: classes12.dex */
public class FeedActivitiesTabLayout extends TabLayout {
    public FeedActivitiesTabLayout(Context context) {
        super(context);
        m64999a();
    }

    /* JADX INFO: renamed from: a */
    public final void m64999a() {
        try {
            Field declaredField = TabLayout.class.getDeclaredField("scrollableTabMinWidth");
            declaredField.setAccessible(true);
            declaredField.set(this, Integer.valueOf(t100.m186890d(57.0f)));
        } catch (IllegalAccessException | NoSuchFieldException e) {
            CrashHelper.m81296c(e);
        }
    }

    public FeedActivitiesTabLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m64999a();
    }

    public FeedActivitiesTabLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m64999a();
    }
}
