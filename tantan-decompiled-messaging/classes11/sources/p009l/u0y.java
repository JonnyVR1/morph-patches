package p009l;

import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.newui.newmeet.feed.MeetFeedBaseItemView;
import l.ctq0;
import l.k6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class u0y {
    /* JADX INFO: renamed from: a */
    public static kwl m22736a(int i) {
        kwl b1yVar;
        if (i == 1) {
            b1yVar = new b1y();
        } else if (i == 2) {
            b1yVar = new e2y();
        } else if (i != 4) {
            b1yVar = i != 5 ? null : new th30();
        } else {
            b1yVar = new e1y();
        }
        if (b1yVar != null) {
            return b1yVar;
        }
        ctq0.a("viewType: ", i, " not support");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static MeetFeedBaseItemView m22737b(ViewGroup viewGroup, int i) {
        MeetFeedBaseItemView meetFeedBaseItemView = (MeetFeedBaseItemView) o7r.m19649a(viewGroup.getContext()).inflate(k6c0.h0, viewGroup, false);
        kwl kwlVarM22736a = m22736a(i);
        meetFeedBaseItemView.setMainContentItemView(kwlVarM22736a);
        if (meetFeedBaseItemView.f4958s.getChildCount() == 0) {
            meetFeedBaseItemView.f4958s.addView(kwlVarM22736a.mo11818c(o7r.m19649a(viewGroup.getContext()), meetFeedBaseItemView.f4958s));
        }
        return meetFeedBaseItemView;
    }
}
