package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.discovery.TopicUsersListFrag;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class v2j0 {
    /* JADX INFO: renamed from: a */
    public static void m9804a(TopicUsersListFrag topicUsersListFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        topicUsersListFrag.z = viewGroup.getChildAt(0);
        topicUsersListFrag.A = viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m9805b(TopicUsersListFrag topicUsersListFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.cf, viewGroup, false);
        m9804a(topicUsersListFrag, viewInflate);
        return viewInflate;
    }
}
