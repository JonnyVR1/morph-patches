package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.feed.newui.photoalbum.view.FeedClipBoardTipsView;
import p151v.VFrame;

/* JADX INFO: loaded from: classes13.dex */
public class dwg {
    /* JADX INFO: renamed from: a */
    public static void m118412a(FeedClipBoardTipsView feedClipBoardTipsView, View view) {
        feedClipBoardTipsView.f43205a = (VFrame) view;
    }

    /* JADX INFO: renamed from: b */
    public static View m118413b(FeedClipBoardTipsView feedClipBoardTipsView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173657f0, viewGroup, false);
        m118412a(feedClipBoardTipsView, viewInflate);
        return viewInflate;
    }
}
