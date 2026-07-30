package com.p000p1.mobile.putong.feed.newui.kankan.view.properties;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.feed.newui.kankan.view.FeedComicFaceCategoryView;
import l.xdl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class AnimLinearLayoutManager extends LinearLayoutManager {
    public AnimLinearLayoutManager(Context context, int i) {
        super(context, i, false);
    }

    /* JADX INFO: renamed from: a */
    public final void m3166a() {
        float f = 2.0f;
        float width = getWidth() / 2.0f;
        float f2 = 1.5f * width;
        int childCount = getChildCount();
        float f3 = 0.0f;
        int i = 0;
        while (i < childCount) {
            FeedComicFaceCategoryView feedComicFaceCategoryView = (FeedComicFaceCategoryView) getChildAt(i);
            float left = (feedComicFaceCategoryView.getLeft() + feedComicFaceCategoryView.getRight()) / f;
            float fAbs = Math.abs(left - width);
            feedComicFaceCategoryView.setActivated(fAbs < ((float) xdl0.w(75.0f)));
            if (i == 0) {
                float measuredWidth = fAbs / feedComicFaceCategoryView.getMeasuredWidth();
                if (measuredWidth > 1.0f) {
                    measuredWidth = 1.0f;
                }
                feedComicFaceCategoryView.f1657b.getBackground().setAlpha((int) ((1.0f - measuredWidth) * 255.0f));
                feedComicFaceCategoryView.f1657b.setImageAlpha((int) (measuredWidth * 255.0f));
            }
            float f4 = 1.0f - ((fAbs / f2) * 0.3f);
            feedComicFaceCategoryView.setScaleX(f4);
            feedComicFaceCategoryView.setScaleY(f4);
            float width2 = (((left > width ? -1 : 1) * feedComicFaceCategoryView.getWidth()) * (1.0f - f4)) / f;
            feedComicFaceCategoryView.setTranslationX(f3 + width2);
            if (width2 <= 0.0f || i < 1) {
                if (width2 < 0.0f) {
                    f3 = width2 * f;
                }
                i++;
                f = f;
            } else {
                int i2 = i - 1;
                getChildAt(i2).setTranslationX(getChildAt(i2).getTranslationX() + (width2 * f));
            }
            f3 = 0.0f;
            i++;
            f = f;
        }
    }

    public int getExtraLayoutSpace(RecyclerView.z zVar) {
        return getWidth() * 2;
    }

    public void onLayoutChildren(RecyclerView.v vVar, RecyclerView.z zVar) {
        super.onLayoutChildren(vVar, zVar);
    }

    public void onLayoutCompleted(RecyclerView.z zVar) {
        super.onLayoutCompleted(zVar);
        m3166a();
    }

    public int scrollHorizontallyBy(int i, RecyclerView.v vVar, RecyclerView.z zVar) {
        int iScrollHorizontallyBy = super.scrollHorizontallyBy(i, vVar, zVar);
        m3166a();
        return iScrollHorizontallyBy;
    }
}
