package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadView;
import p147v.VDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class j2y {
    /* JADX INFO: renamed from: a */
    public static void m139513a(MeetItemEntryHeadView meetItemEntryHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetItemEntryHeadView._icon = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        meetItemEntryHeadView._title = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        meetItemEntryHeadView._desc = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m139514b(MeetItemEntryHeadView meetItemEntryHeadView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121439v0, viewGroup, true);
        m139513a(meetItemEntryHeadView, viewInflate);
        return viewInflate;
    }
}
