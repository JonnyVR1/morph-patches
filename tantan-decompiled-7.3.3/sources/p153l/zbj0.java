package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.newui.discovery.TopicUsersListFrag;
import com.p051p1.mobile.putong.core.newui.view.CoreEmptyView;

/* JADX INFO: loaded from: classes10.dex */
public class zbj0 {
    /* JADX INFO: renamed from: a */
    public static void m219195a(TopicUsersListFrag topicUsersListFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicUsersListFrag.f22125z = (RecyclerView) viewGroup.getChildAt(0);
        topicUsersListFrag.f22122A = (CoreEmptyView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m219196b(TopicUsersListFrag topicUsersListFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f125921kf, viewGroup, false);
        m219195a(topicUsersListFrag, viewInflate);
        return viewInflate;
    }
}
