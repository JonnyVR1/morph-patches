package com.p051p1.mobile.putong.feed.newui.status.display.card.bgrender;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import p153l.l9h;
import p153l.obi;
import p153l.z3i;

/* JADX INFO: loaded from: classes13.dex */
public enum FeedStateCardBgRenderCenter {
    IMAGE(new l9h()),
    VIDEO(new obi()),
    TEXT(new z3i() { // from class: l.n6i
        @Override // p153l.z3i
        /* JADX INFO: renamed from: a */
        public void mo153427a(FeedStateCardView feedStateCardView, BubbleInfo bubbleInfo) {
            int[] iArr;
            if (jyb.m147479J(bubbleInfo.textTheme.backgroundColor)) {
                iArr = new int[]{-10066330, -10066330};
            } else {
                iArr = new int[bubbleInfo.textTheme.backgroundColor.size()];
                for (int i = 0; i < bubbleInfo.textTheme.backgroundColor.size(); i++) {
                    iArr[i] = Color.parseColor(bubbleInfo.textTheme.backgroundColor.get(i));
                }
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setColors(iArr);
            gradientDrawable.setCornerRadius(qa00.f156335v);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
            feedStateCardView.f43579a.setBackground(gradientDrawable);
            feedStateCardView.f43579a.setVisibility(0);
            feedStateCardView.f43581c.setVisibility(8);
        }
    });

    z3i cardRender;

    FeedStateCardBgRenderCenter(z3i z3iVar) {
        this.cardRender = z3iVar;
    }

    public static void doRender(FeedStateCardView feedStateCardView, BubbleInfo bubbleInfo) {
        if (bubbleInfo.media.size() == 0) {
            TEXT.cardRender.mo153427a(feedStateCardView, bubbleInfo);
        } else if (bubbleInfo.media.get(0) instanceof Video) {
            VIDEO.cardRender.mo153427a(feedStateCardView, bubbleInfo);
        } else if (bubbleInfo.media.get(0) instanceof Picture) {
            IMAGE.cardRender.mo153427a(feedStateCardView, bubbleInfo);
        }
    }
}
