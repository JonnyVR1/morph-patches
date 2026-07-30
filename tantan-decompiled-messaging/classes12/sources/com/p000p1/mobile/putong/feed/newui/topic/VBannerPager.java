package com.p000p1.mobile.putong.feed.newui.topic;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class VBannerPager extends VPager {
    public VBannerPager(Context context) {
        super(context);
    }

    public void onAttachedToWindow() {
        super/*androidx.viewpager.widget.ViewPager*/.onAttachedToWindow();
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.FALSE);
            getAdapter().notifyDataSetChanged();
            setCurrentItem(getCurrentItem());
        } catch (Exception e) {
            CrashHelper.c(e);
            App.d.k(new Exception("onAttachedToWindow change mFirstLayout error", e));
        }
    }

    public VBannerPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
