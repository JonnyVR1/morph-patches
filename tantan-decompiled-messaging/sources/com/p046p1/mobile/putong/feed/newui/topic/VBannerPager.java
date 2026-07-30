package com.p046p1.mobile.putong.feed.newui.topic;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import p147v.VPager;

/* JADX INFO: loaded from: classes12.dex */
public class VBannerPager extends VPager {
    public VBannerPager(Context context) {
        super(context);
    }

    @Override // androidx.viewpager.widget.ViewPager, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            Field declaredField = ViewPager.class.getDeclaredField("mFirstLayout");
            declaredField.setAccessible(true);
            declaredField.set(this, Boolean.FALSE);
            getAdapter().notifyDataSetChanged();
            setCurrentItem(getCurrentItem());
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            App.f15368d.m20433k(new Exception("onAttachedToWindow change mFirstLayout error", e));
        }
    }

    public VBannerPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
