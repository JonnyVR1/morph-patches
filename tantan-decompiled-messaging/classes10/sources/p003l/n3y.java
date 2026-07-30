package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p1.mobile.putong.core.newui.meet.likers.items.MeetLikersNewLikersView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class n3y {
    /* JADX INFO: renamed from: a */
    public static void m8306a(MeetLikersNewLikersView meetLikersNewLikersView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetLikersNewLikersView.a = (TextView) viewGroup.getChildAt(0);
        meetLikersNewLikersView.b = viewGroup.getChildAt(1);
        meetLikersNewLikersView.c = viewGroup.getChildAt(2);
    }
}
