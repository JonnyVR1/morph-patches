package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedTopicsView;
import p147v.VButton;
import p147v.VMenuBar;

/* JADX INFO: loaded from: classes12.dex */
public class fuh {
    /* JADX INFO: renamed from: a */
    public static void m123187a(FeedPostSelectedTopicsView feedPostSelectedTopicsView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostSelectedTopicsView.f39999a = (VMenuBar) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPostSelectedTopicsView.f40000b = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedPostSelectedTopicsView.f40001c = (VButton) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m123188b(FeedPostSelectedTopicsView feedPostSelectedTopicsView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142040H1, viewGroup, false);
        m123187a(feedPostSelectedTopicsView, viewInflate);
        return viewInflate;
    }
}
