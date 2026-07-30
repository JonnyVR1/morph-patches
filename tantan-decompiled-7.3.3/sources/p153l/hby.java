package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.likers.MeetItemLikerHeadDefaultView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class hby {
    /* JADX INFO: renamed from: a */
    public static void m134439a(MeetItemLikerHeadDefaultView meetItemLikerHeadDefaultView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetItemLikerHeadDefaultView._title_layout_default = (LinearLayout) viewGroup.getChildAt(0);
        meetItemLikerHeadDefaultView._title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        meetItemLikerHeadDefaultView._subtitle = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m134440b(MeetItemLikerHeadDefaultView meetItemLikerHeadDefaultView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152053x0, viewGroup, true);
        m134439a(meetItemLikerHeadDefaultView, viewInflate);
        return viewInflate;
    }
}
