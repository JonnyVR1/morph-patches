package com.p051p1.mobile.putong.feed.newui.topic;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.App;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.reflect.Field;
import p151v.VPager;

/* JADX INFO: loaded from: classes13.dex */
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
            CrashHelper.m82479c(e);
            App.f16087d.m21432k(new Exception("onAttachedToWindow change mFirstLayout error", e));
        }
    }

    public VBannerPager(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
