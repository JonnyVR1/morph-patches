package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.newui.meet.likers.items.MeetLikersNewLikersView;

/* JADX INFO: loaded from: classes10.dex */
public class kcy {
    /* JADX INFO: renamed from: a */
    public static void m149140a(MeetLikersNewLikersView meetLikersNewLikersView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        meetLikersNewLikersView._new_likers_title = (TextView) viewGroup.getChildAt(0);
        meetLikersNewLikersView._new_likers_recycler = (RecyclerView) viewGroup.getChildAt(1);
        meetLikersNewLikersView._new_likers_divider = viewGroup.getChildAt(2);
    }
}
