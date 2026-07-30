package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.newui.meet.likers.items.MeetLikersNewLikersView;

/* JADX INFO: loaded from: classes10.dex */
public class n3y {
    /* JADX INFO: renamed from: a */
    public static void m157790a(MeetLikersNewLikersView meetLikersNewLikersView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetLikersNewLikersView._new_likers_title = (TextView) viewGroup.getChildAt(0);
        meetLikersNewLikersView._new_likers_recycler = (RecyclerView) viewGroup.getChildAt(1);
        meetLikersNewLikersView._new_likers_divider = viewGroup.getChildAt(2);
    }
}
