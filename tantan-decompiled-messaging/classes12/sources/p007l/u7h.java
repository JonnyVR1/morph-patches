package p007l;

import android.widget.TextView;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.NotifyUser;
import com.p000p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.newui.view.HighlightData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.d30;
import l.j760;
import l.k2l;
import l.vwb;
import l.zvf0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class u7h {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m14783a(Act act, NotifyUser notifyUser, String str, String str2) {
        act.startActivity(PhotoAlbumFeedAct.m5428V1(act, notifyUser.userId, str, 0, -1));
        zvf0.u("e_at_robot", str2, new j760[]{vwb.Y("robotname", notifyUser.name)});
    }

    /* JADX INFO: renamed from: b */
    public static List<HighlightData> m14784b(final Act act, final String str, final String str2, List<NotifyUser> list) {
        ArrayList arrayList = new ArrayList();
        for (final NotifyUser notifyUser : list) {
            arrayList.add(new HighlightData("@" + notifyUser.name, true, true, new d30() { // from class: l.t7h
                public final void call() {
                    u7h.m14783a(act, notifyUser, str2, str);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static void m14785c(Act act, VText vText, CharSequence charSequence, Moment moment, String str, String str2) {
        List<NotifyUser> list = moment.notifyUsers;
        if (vwb.J(list)) {
            vText.setText(charSequence, TextView.BufferType.SPANNABLE);
            return;
        }
        List<HighlightData> listM14784b = m14784b(act, str2, str, list);
        if (vwb.J(listM14784b)) {
            return;
        }
        new k2l().b(vText, charSequence, listM14784b);
    }

    /* JADX INFO: renamed from: d */
    public static void m14786d(Moment moment, String str) {
        if (vwb.J(moment.notifyUsers)) {
            return;
        }
        Iterator<NotifyUser> it = moment.notifyUsers.iterator();
        while (it.hasNext()) {
            zvf0.A("e_at_robot", str, new j760[]{vwb.Y("robotname", it.next().name)});
        }
    }
}
