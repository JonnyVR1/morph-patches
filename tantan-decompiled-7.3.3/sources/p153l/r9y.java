package p153l;

import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.newui.newmeet.feed.MeetFeedBaseItemView;

/* JADX INFO: loaded from: classes11.dex */
public class r9y {
    /* JADX INFO: renamed from: a */
    public static czl m180662a(int i) {
        czl y9yVar;
        if (i == 1) {
            y9yVar = new y9y();
        } else if (i == 2) {
            y9yVar = new bby();
        } else if (i != 4) {
            y9yVar = i != 5 ? null : new hq30();
        } else {
            y9yVar = new bay();
        }
        if (y9yVar != null) {
            return y9yVar;
        }
        i2r0.m138234a("viewType: ", i, " not support");
        return null;
    }

    /* JADX INFO: renamed from: b */
    public static MeetFeedBaseItemView m180663b(ViewGroup viewGroup, int i) {
        MeetFeedBaseItemView meetFeedBaseItemView = (MeetFeedBaseItemView) p9r.m171370a(viewGroup.getContext()).inflate(pec0.f151994h0, viewGroup, false);
        czl czlVarM180662a = m180662a(i);
        meetFeedBaseItemView.setMainContentItemView(czlVarM180662a);
        if (meetFeedBaseItemView.f26922s.getChildCount() == 0) {
            meetFeedBaseItemView.f26922s.addView(czlVarM180662a.mo103246c(p9r.m171370a(viewGroup.getContext()), meetFeedBaseItemView.f26922s));
        }
        return meetFeedBaseItemView;
    }
}
