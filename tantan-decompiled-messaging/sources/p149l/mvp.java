package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.manager.invite.IntlVoiceLiveManagerInvitePageView;
import p147v.smart_refresh.SmartRefreshLayout;

/* JADX INFO: loaded from: classes4.dex */
public class mvp {
    /* JADX INFO: renamed from: a */
    public static void m156577a(IntlVoiceLiveManagerInvitePageView intlVoiceLiveManagerInvitePageView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlVoiceLiveManagerInvitePageView._emptyView = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlVoiceLiveManagerInvitePageView._emptyTitle = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlVoiceLiveManagerInvitePageView._refreshLayout = (SmartRefreshLayout) viewGroup.getChildAt(1);
        intlVoiceLiveManagerInvitePageView._list = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
    }
}
