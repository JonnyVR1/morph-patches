package com.p000p1.mobile.putong.feed.newui.status.display.card.bgrender;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import com.p000p1.mobile.putong.data.BubbleInfo;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.feed.newui.status.display.card.FeedStateCardView;
import l.t100;
import l.vwb;
import p007l.k2i;
import p007l.w7h;
import p007l.z9i;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public enum FeedStateCardBgRenderCenter {
    IMAGE(new w7h()),
    VIDEO(new z9i()),
    TEXT(new k2i() { // from class: l.y4i
        @Override // p007l.k2i
        /* JADX INFO: renamed from: a */
        public void mo11387a(FeedStateCardView feedStateCardView, BubbleInfo bubbleInfo) {
            int[] iArr;
            if (vwb.J(bubbleInfo.textTheme.backgroundColor)) {
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
            gradientDrawable.setCornerRadius(t100.v);
            gradientDrawable.setGradientType(0);
            gradientDrawable.setOrientation(GradientDrawable.Orientation.TL_BR);
            feedStateCardView.f4192a.setBackground(gradientDrawable);
            feedStateCardView.f4192a.setVisibility(0);
            feedStateCardView.f4194c.setVisibility(8);
        }
    });

    k2i cardRender;

    FeedStateCardBgRenderCenter(k2i k2iVar) {
        this.cardRender = k2iVar;
    }

    public static void doRender(FeedStateCardView feedStateCardView, BubbleInfo bubbleInfo) {
        if (bubbleInfo.media.size() == 0) {
            TEXT.cardRender.mo11387a(feedStateCardView, bubbleInfo);
        } else if (bubbleInfo.media.get(0) instanceof Video) {
            VIDEO.cardRender.mo11387a(feedStateCardView, bubbleInfo);
        } else if (bubbleInfo.media.get(0) instanceof Picture) {
            IMAGE.cardRender.mo11387a(feedStateCardView, bubbleInfo);
        }
    }
}
