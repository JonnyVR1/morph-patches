package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.feed.newui.photoalbum.view.FeedClipBoardTipsView;
import p147v.VFrame;

/* JADX INFO: loaded from: classes12.dex */
public class oug {
    /* JADX INFO: renamed from: a */
    public static void m166067a(FeedClipBoardTipsView feedClipBoardTipsView, View view) {
        feedClipBoardTipsView.f42357a = (VFrame) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m166068b(FeedClipBoardTipsView feedClipBoardTipsView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142188f0, viewGroup, false);
        m166067a(feedClipBoardTipsView, viewInflate);
        return viewInflate;
    }
}
