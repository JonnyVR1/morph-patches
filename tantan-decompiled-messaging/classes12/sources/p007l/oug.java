package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.photoalbum.view.FeedClipBoardTipsView;
import v.VFrame;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class oug {
    /* JADX INFO: renamed from: a */
    public static void m12856a(FeedClipBoardTipsView feedClipBoardTipsView, View view) {
        feedClipBoardTipsView.f3818a = (VFrame) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m12857b(FeedClipBoardTipsView feedClipBoardTipsView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11207f0, viewGroup, false);
        m12856a(feedClipBoardTipsView, viewInflate);
        return viewInflate;
    }
}
