package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.MeetItemLikerHeadDefaultView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class k2y {
    /* JADX INFO: renamed from: a */
    public static void m144355a(MeetItemLikerHeadDefaultView meetItemLikerHeadDefaultView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetItemLikerHeadDefaultView._title_layout_default = (LinearLayout) viewGroup.getChildAt(0);
        meetItemLikerHeadDefaultView._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        meetItemLikerHeadDefaultView._subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m144356b(MeetItemLikerHeadDefaultView meetItemLikerHeadDefaultView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121445x0, viewGroup, true);
        m144355a(meetItemLikerHeadDefaultView, viewInflate);
        return viewInflate;
    }
}
