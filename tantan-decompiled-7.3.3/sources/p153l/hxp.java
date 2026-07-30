package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.voice.intl.manager.invite.IntlVoiceLiveManagerInvitePageView;

/* JADX INFO: loaded from: classes4.dex */
public class hxp {
    /* JADX INFO: renamed from: a */
    public static void m137631a(gxp gxpVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        gxpVar._empty = viewGroup.getChildAt(0);
        gxpVar._contentView = (LinearLayout) viewGroup.getChildAt(1);
        gxpVar._managerDialogTitle = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        gxpVar._voiceManagerExplain = (ImageView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        gxpVar._line = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        gxpVar._onlineView = (IntlVoiceLiveManagerInvitePageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m137632b(gxp gxpVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198874P2, viewGroup, false);
        m137631a(gxpVar, viewInflate);
        return viewInflate;
    }
}
