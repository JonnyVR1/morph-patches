package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p1.mobile.putong.core.newui.newmeet.feed.likers.MeetItemLikerHeadDefaultView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class k2y {
    /* JADX INFO: renamed from: a */
    public static void m7492a(MeetItemLikerHeadDefaultView meetItemLikerHeadDefaultView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetItemLikerHeadDefaultView.a = (LinearLayout) viewGroup.getChildAt(0);
        meetItemLikerHeadDefaultView.b = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        meetItemLikerHeadDefaultView.c = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7493b(MeetItemLikerHeadDefaultView meetItemLikerHeadDefaultView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5608x0, viewGroup, true);
        m7492a(meetItemLikerHeadDefaultView, viewInflate);
        return viewInflate;
    }
}
