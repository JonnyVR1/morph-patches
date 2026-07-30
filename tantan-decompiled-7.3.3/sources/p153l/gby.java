package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.view.MeetItemEntryHeadView;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class gby {
    /* JADX INFO: renamed from: a */
    public static void m129812a(MeetItemEntryHeadView meetItemEntryHeadView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetItemEntryHeadView._icon = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        meetItemEntryHeadView._title = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        meetItemEntryHeadView._desc = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m129813b(MeetItemEntryHeadView meetItemEntryHeadView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f152047v0, viewGroup, true);
        m129812a(meetItemEntryHeadView, viewInflate);
        return viewInflate;
    }
}
