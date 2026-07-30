package p149l;

import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.newui.newmeet.feed.MeetFeedBaseItemView;

/* JADX INFO: loaded from: classes11.dex */
public class u0y {
    /* JADX INFO: renamed from: a */
    public static kwl m191365a(int i) {
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
        ctq0.m108694a("viewType: ", i, " not support");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static MeetFeedBaseItemView m191366b(ViewGroup viewGroup, int i) {
        MeetFeedBaseItemView meetFeedBaseItemView = (MeetFeedBaseItemView) o7r.m163037a(viewGroup.getContext()).inflate(k6c0.f121386h0, viewGroup, false);
        kwl kwlVarM191365a = m191365a(i);
        meetFeedBaseItemView.setMainContentItemView(kwlVarM191365a);
        if (meetFeedBaseItemView.f26180s.getChildCount() == 0) {
            meetFeedBaseItemView.f26180s.addView(kwlVarM191365a.mo99892c(o7r.m163037a(viewGroup.getContext()), meetFeedBaseItemView.f26180s));
        }
        return meetFeedBaseItemView;
    }
}
