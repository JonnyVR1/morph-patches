package com.p046p1.mobile.putong.feed.newui.kankan.view.properties;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.newui.kankan.view.FeedComicFaceCategoryView;
import p149l.xdl0;

/* JADX INFO: loaded from: classes12.dex */
public class AnimLinearLayoutManager extends LinearLayoutManager {
    public AnimLinearLayoutManager(Context context, int i) {
        super(context, i, false);
    }

    /* JADX INFO: renamed from: a */
    public final void m62184a() {
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
            feedComicFaceCategoryView.setActivated(fAbs < ((float) xdl0.m208407w(75.0f)));
            if (i == 0) {
                float measuredWidth = fAbs / feedComicFaceCategoryView.getMeasuredWidth();
                if (measuredWidth > 1.0f) {
                    measuredWidth = 1.0f;
                }
                feedComicFaceCategoryView.f40196b.getBackground().setAlpha((int) ((1.0f - measuredWidth) * 255.0f));
                feedComicFaceCategoryView.f40196b.setImageAlpha((int) (measuredWidth * 255.0f));
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

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public int getExtraLayoutSpace(RecyclerView.C0588z c0588z) {
        return getWidth() * 2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onLayoutChildren(RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        super.onLayoutChildren(c0584v, c0588z);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public void onLayoutCompleted(RecyclerView.C0588z c0588z) {
        super.onLayoutCompleted(c0588z);
        m62184a();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
    public int scrollHorizontallyBy(int i, RecyclerView.C0584v c0584v, RecyclerView.C0588z c0588z) {
        int iScrollHorizontallyBy = super.scrollHorizontallyBy(i, c0584v, c0588z);
        m62184a();
        return iScrollHorizontallyBy;
    }
}
