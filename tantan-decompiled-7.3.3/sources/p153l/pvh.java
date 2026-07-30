package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.feed.newui.group.dialog.insert.selecteditem.FeedPostSelectedHeader;
import org.apmem.tools.layouts.FlowLayout;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class pvh {
    /* JADX INFO: renamed from: a */
    public static void m173960a(FeedPostSelectedHeader feedPostSelectedHeader, View view) {
        feedPostSelectedHeader.f40840a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        feedPostSelectedHeader.f40841b = (ConstraintLayout) viewGroup.getChildAt(0);
        feedPostSelectedHeader.f40842c = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        feedPostSelectedHeader.f40843d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        feedPostSelectedHeader.f40844e = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        feedPostSelectedHeader.f40845f = (FlowLayout) viewGroup.getChildAt(1);
        feedPostSelectedHeader.f40846g = (VText) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m173961b(FeedPostSelectedHeader feedPostSelectedHeader, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(tec0.f173504G2, viewGroup, false);
        m173960a(feedPostSelectedHeader, viewInflate);
        return viewInflate;
    }
}
