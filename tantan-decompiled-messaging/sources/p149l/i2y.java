package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class i2y {
    /* JADX INFO: renamed from: a */
    public static void m134109a(MeetItemEntryHeadViewMyTabStyle meetItemEntryHeadViewMyTabStyle, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetItemEntryHeadViewMyTabStyle._title = (VText) viewGroup.getChildAt(0);
        meetItemEntryHeadViewMyTabStyle._more = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m134110b(MeetItemEntryHeadViewMyTabStyle meetItemEntryHeadViewMyTabStyle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(k6c0.f121442w0, viewGroup, true);
        m134109a(meetItemEntryHeadViewMyTabStyle, viewInflate);
        return viewInflate;
    }
}
