package com.p046p1.mobile.putong.feed.newui.status.display.card.bgrender;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import p149l.k2i;
import p149l.w7h;
import p149l.z9i;

/* JADX INFO: loaded from: classes12.dex */
public enum FeedStateCardBgRenderCenter {
    IMAGE(new w7h()),
    VIDEO(new z9i()),
    TEXT(new k2i() { // from class: l.y4i
        @Override // p149l.k2i
        /* JADX INFO: renamed from: a */
        public void mo144304a(FeedStateCardView feedStateCardView, BubbleInfo bubbleInfo) {
            int[] iArr;
            if (vwb.m200296J(bubbleInfo.textTheme.backgroundColor)) {
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
            gradientDrawable.setCornerRadius(t100.f167273v);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
            feedStateCardView.f42731a.setBackground(gradientDrawable);
            feedStateCardView.f42731a.setVisibility(0);
            feedStateCardView.f42733c.setVisibility(8);
        }
    });

    k2i cardRender;

    FeedStateCardBgRenderCenter(k2i k2iVar) {
        this.cardRender = k2iVar;
    }

    public static void doRender(FeedStateCardView feedStateCardView, BubbleInfo bubbleInfo) {
        if (bubbleInfo.media.size() == 0) {
            TEXT.cardRender.mo144304a(feedStateCardView, bubbleInfo);
        } else if (bubbleInfo.media.get(0) instanceof Video) {
            VIDEO.cardRender.mo144304a(feedStateCardView, bubbleInfo);
        } else if (bubbleInfo.media.get(0) instanceof Picture) {
            IMAGE.cardRender.mo144304a(feedStateCardView, bubbleInfo);
        }
    }
}
