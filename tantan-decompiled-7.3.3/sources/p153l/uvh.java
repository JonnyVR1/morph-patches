package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedTopicsView;
import p151v.VButton;
import p151v.VMenuBar;

/* JADX INFO: loaded from: classes13.dex */
public class uvh {
    /* JADX INFO: renamed from: a */
    public static void m198263a(FeedPostSelectedTopicsView feedPostSelectedTopicsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostSelectedTopicsView.f40847a = (VMenuBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPostSelectedTopicsView.f40848b = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedPostSelectedTopicsView.f40849c = (VButton) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m198264b(FeedPostSelectedTopicsView feedPostSelectedTopicsView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173509H1, viewGroup, false);
        m198263a(feedPostSelectedTopicsView, viewInflate);
        return viewInflate;
    }
}
