package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.voice.intl.manager.invite.IntlVoiceLiveManagerInvitePageView;

/* JADX INFO: loaded from: classes4.dex */
public class hvp {
    /* JADX INFO: renamed from: a */
    public static void m133197a(gvp gvpVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gvpVar._empty = viewGroup.getChildAt(0);
        gvpVar._contentView = (LinearLayout) viewGroup.getChildAt(1);
        gvpVar._managerDialogTitle = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        gvpVar._voiceManagerExplain = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        gvpVar._line = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        gvpVar._onlineView = (IntlVoiceLiveManagerInvitePageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m133198b(gvp gvpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168142P2, viewGroup, false);
        m133197a(gvpVar, viewInflate);
        return viewInflate;
    }
}
