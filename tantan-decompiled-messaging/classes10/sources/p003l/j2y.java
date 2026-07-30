package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class j2y {
    /* JADX INFO: renamed from: a */
    public static void m7330a(MeetItemEntryHeadView meetItemEntryHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetItemEntryHeadView.a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        meetItemEntryHeadView.b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        meetItemEntryHeadView.c = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7331b(MeetItemEntryHeadView meetItemEntryHeadView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5602v0, viewGroup, true);
        m7330a(meetItemEntryHeadView, viewInflate);
        return viewInflate;
    }
}
