package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.MeetItemLikerHeadDefaultView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.likers.MeetItemLikerHeadView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadView;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;

/* JADX INFO: loaded from: classes10.dex */
public class m2y {
    /* JADX INFO: renamed from: a */
    public static void m152741a(MeetItemLikerHeadView meetItemLikerHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetItemLikerHeadView._title_layout_default = (MeetItemLikerHeadDefaultView) viewGroup.getChildAt(0);
        meetItemLikerHeadView._meet_head_layout = (MeetItemEntryHeadView) viewGroup.getChildAt(1);
        meetItemLikerHeadView._meet_head_layout_my_tab_style = (MeetItemEntryHeadViewMyTabStyle) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m152742b(MeetItemLikerHeadView meetItemLikerHeadView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121448y0, viewGroup, true);
        m152741a(meetItemLikerHeadView, viewInflate);
        return viewInflate;
    }
}
