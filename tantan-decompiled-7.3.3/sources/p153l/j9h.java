package p153l;

import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.NotifyUser;
import com.p051p1.mobile.putong.feed.newui.photoalbum.feed.PhotoAlbumFeedAct;
import com.p051p1.mobile.putong.newui.view.HighlightData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class j9h {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m143942a(Act act, NotifyUser notifyUser, String str, String str2) {
        act.startActivity(PhotoAlbumFeedAct.m65538X1(act, notifyUser.userId, str, 0, -1));
        i4g0.m138523u("e_at_robot", str2, jyb.m147494Y("robotname", notifyUser.name));
    }

    /* JADX INFO: renamed from: b */
    public static List<HighlightData> m143943b(final Act act, final String str, final String str2, List<NotifyUser> list) {
        ArrayList arrayList = new ArrayList();
        for (final NotifyUser notifyUser : list) {
            arrayList.add(new HighlightData("@" + notifyUser.name, true, true, new x20() { // from class: l.i9h
                @Override // p153l.x20
                public final void call() {
                    j9h.m143942a(act, notifyUser, str2, str);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static void m143944c(Act act, VText vText, CharSequence charSequence, Moment moment, String str, String str2) {
        List<NotifyUser> list = moment.notifyUsers;
        if (jyb.m147479J(list)) {
            vText.setText(charSequence, TextView.BufferType.SPANNABLE);
            return;
        }
        List<HighlightData> listM143943b = m143943b(act, str2, str, list);
        if (jyb.m147479J(listM143943b)) {
            return;
        }
        new a5l().m96237b(vText, charSequence, listM143943b);
    }

    /* JADX INFO: renamed from: d */
    public static void m143945d(Moment moment, String str) {
        if (jyb.m147479J(moment.notifyUsers)) {
            return;
        }
        Iterator<NotifyUser> it = moment.notifyUsers.iterator();
        while (it.hasNext()) {
            i4g0.m138492A("e_at_robot", str, jyb.m147494Y("robotname", it.next().name));
        }
    }
}
