package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedDraftView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class i2h {
    /* JADX INFO: renamed from: a */
    public static void m134051a(FeedDraftView feedDraftView, View view) {
        feedDraftView.f42364d = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedDraftView.f42365e = (VFrame) viewGroup.getChildAt(0);
        feedDraftView.f42366f = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedDraftView.f42367g = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedDraftView.f42368h = (VImage) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedDraftView.f42369i = (VImage) viewGroup.getChildAt(1);
        feedDraftView.f42370j = (VLinear) viewGroup.getChildAt(2);
        feedDraftView.f42371k = (TextView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        feedDraftView.f42372l = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m134052b(FeedDraftView feedDraftView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142272r0, viewGroup, false);
        m134051a(feedDraftView, viewInflate);
        return viewInflate;
    }
}
