package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedHeader;
import org.apmem.tools.layouts.FlowLayout;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class auh {
    /* JADX INFO: renamed from: a */
    public static void m98993a(FeedPostSelectedHeader feedPostSelectedHeader, View view) {
        feedPostSelectedHeader.f39992a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostSelectedHeader.f39993b = (ConstraintLayout) viewGroup.getChildAt(0);
        feedPostSelectedHeader.f39994c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPostSelectedHeader.f39995d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedPostSelectedHeader.f39996e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedPostSelectedHeader.f39997f = (FlowLayout) viewGroup.getChildAt(1);
        feedPostSelectedHeader.f39998g = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m98994b(FeedPostSelectedHeader feedPostSelectedHeader, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142035G2, viewGroup, false);
        m98993a(feedPostSelectedHeader, viewInflate);
        return viewInflate;
    }
}
