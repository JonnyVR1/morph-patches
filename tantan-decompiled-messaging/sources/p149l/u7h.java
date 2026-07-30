package p149l;

import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.NotifyUser;
import com.p046p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p046p1.mobile.putong.newui.view.HighlightData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class u7h {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m192136a(Act act, NotifyUser notifyUser, String str, String str2) {
        act.startActivity(PhotoAlbumFeedAct.m64355V1(act, notifyUser.userId, str, 0, -1));
        zvf0.m220399u("e_at_robot", str2, vwb.m200311Y("robotname", notifyUser.name));
    }

    /* JADX INFO: renamed from: b */
    public static List<HighlightData> m192137b(final Act act, final String str, final String str2, List<NotifyUser> list) {
        ArrayList arrayList = new ArrayList();
        for (final NotifyUser notifyUser : list) {
            arrayList.add(new HighlightData("@" + notifyUser.name, true, true, new d30() { // from class: l.t7h
                @Override // p149l.d30
                public final void call() {
                    u7h.m192136a(act, notifyUser, str2, str);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static void m192138c(Act act, VText vText, CharSequence charSequence, Moment moment, String str, String str2) {
        List<NotifyUser> list = moment.notifyUsers;
        if (vwb.m200296J(list)) {
            vText.setText(charSequence, TextView.BufferType.SPANNABLE);
            return;
        }
        List<HighlightData> listM192137b = m192137b(act, str2, str, list);
        if (vwb.m200296J(listM192137b)) {
            return;
        }
        new k2l().m144307b(vText, charSequence, listM192137b);
    }

    /* JADX INFO: renamed from: d */
    public static void m192139d(Moment moment, String str) {
        if (vwb.m200296J(moment.notifyUsers)) {
            return;
        }
        Iterator<NotifyUser> it = moment.notifyUsers.iterator();
        while (it.hasNext()) {
            zvf0.m220368A("e_at_robot", str, vwb.m200311Y("robotname", it.next().name));
        }
    }
}
