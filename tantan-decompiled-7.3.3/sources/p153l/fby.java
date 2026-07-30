package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadViewMyTabStyle;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fby {
    /* JADX INFO: renamed from: a */
    public static void m124965a(MeetItemEntryHeadViewMyTabStyle meetItemEntryHeadViewMyTabStyle, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetItemEntryHeadViewMyTabStyle._title = (VText) viewGroup.getChildAt(0);
        meetItemEntryHeadViewMyTabStyle._more = (VText) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m124966b(MeetItemEntryHeadViewMyTabStyle meetItemEntryHeadViewMyTabStyle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152050w0, viewGroup, true);
        m124965a(meetItemEntryHeadViewMyTabStyle, viewInflate);
        return viewInflate;
    }
}
