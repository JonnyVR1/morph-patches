package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.photoalbum.postguide.FeedPostGuideOneView;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ath {
    /* JADX INFO: renamed from: a */
    public static void m98798a(FeedPostGuideOneView feedPostGuideOneView, View view) {
        feedPostGuideOneView.f42310c = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostGuideOneView.f42311d = (VText) viewGroup.getChildAt(0);
        feedPostGuideOneView.f42312e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        feedPostGuideOneView.f42313f = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m98799b(FeedPostGuideOneView feedPostGuideOneView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142323y2, viewGroup, false);
        m98798a(feedPostGuideOneView, viewInflate);
        return viewInflate;
    }
}
