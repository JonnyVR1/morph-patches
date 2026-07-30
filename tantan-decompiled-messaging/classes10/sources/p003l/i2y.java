package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class i2y {
    /* JADX INFO: renamed from: a */
    public static void m7124a(MeetItemEntryHeadViewMyTabStyle meetItemEntryHeadViewMyTabStyle, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetItemEntryHeadViewMyTabStyle.a = viewGroup.getChildAt(0);
        meetItemEntryHeadViewMyTabStyle.b = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m7125b(MeetItemEntryHeadViewMyTabStyle meetItemEntryHeadViewMyTabStyle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f5605w0, viewGroup, true);
        m7124a(meetItemEntryHeadViewMyTabStyle, viewInflate);
        return viewInflate;
    }
}
