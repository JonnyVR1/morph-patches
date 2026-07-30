package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.likers.MeetItemLikerHeadDefaultView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.likers.MeetItemLikerHeadView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadView;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;

/* JADX INFO: loaded from: classes10.dex */
public class jby {
    /* JADX INFO: renamed from: a */
    public static void m144333a(MeetItemLikerHeadView meetItemLikerHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetItemLikerHeadView._title_layout_default = (MeetItemLikerHeadDefaultView) viewGroup.getChildAt(0);
        meetItemLikerHeadView._meet_head_layout = (MeetItemEntryHeadView) viewGroup.getChildAt(1);
        meetItemLikerHeadView._meet_head_layout_my_tab_style = (MeetItemEntryHeadViewMyTabStyle) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m144334b(MeetItemLikerHeadView meetItemLikerHeadView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152056y0, viewGroup, true);
        m144333a(meetItemLikerHeadView, viewInflate);
        return viewInflate;
    }
}
