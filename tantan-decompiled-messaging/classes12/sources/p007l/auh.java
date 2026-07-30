package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedHeader;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class auh {
    /* JADX INFO: renamed from: a */
    public static void m8614a(FeedPostSelectedHeader feedPostSelectedHeader, View view) {
        feedPostSelectedHeader.f1453a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostSelectedHeader.f1454b = viewGroup.getChildAt(0);
        feedPostSelectedHeader.f1455c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPostSelectedHeader.f1456d = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedPostSelectedHeader.f1457e = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedPostSelectedHeader.f1458f = viewGroup.getChildAt(1);
        feedPostSelectedHeader.f1459g = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8615b(FeedPostSelectedHeader feedPostSelectedHeader, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11054G2, viewGroup, false);
        m8614a(feedPostSelectedHeader, viewInflate);
        return viewInflate;
    }
}
