package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.newui.discovery.TopicUsersListFrag;
import com.p046p1.mobile.putong.core.newui.view.CoreEmptyView;

/* JADX INFO: loaded from: classes10.dex */
public class v2j0 {
    /* JADX INFO: renamed from: a */
    public static void m196791a(TopicUsersListFrag topicUsersListFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicUsersListFrag.f21383z = (RecyclerView) viewGroup.getChildAt(0);
        topicUsersListFrag.f21380A = (CoreEmptyView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m196792b(TopicUsersListFrag topicUsersListFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95732cf, viewGroup, false);
        m196791a(topicUsersListFrag, viewInflate);
        return viewInflate;
    }
}
