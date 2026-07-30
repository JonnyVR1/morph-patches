package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.newui.intlmeet.likers.items.IntlMeetLikersNewLikersView;

/* JADX INFO: loaded from: classes10.dex */
public class dho {
    /* JADX INFO: renamed from: a */
    public static void m115807a(IntlMeetLikersNewLikersView intlMeetLikersNewLikersView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlMeetLikersNewLikersView._new_likers_title = (TextView) viewGroup.getChildAt(0);
        intlMeetLikersNewLikersView._new_likers_recycler = (RecyclerView) viewGroup.getChildAt(1);
    }
}
