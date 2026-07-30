package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.live.base.view.LiveHaloAvatar;
import com.p046p1.mobile.putong.live.external.intl.common.gameguide.IntlGameGuideDialogView;
import p147v.VButton;
import p147v.VText;

/* JADX INFO: loaded from: classes13.dex */
public class xhn {
    /* JADX INFO: renamed from: a */
    public static void m208800a(IntlGameGuideDialogView intlGameGuideDialogView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlGameGuideDialogView._avatar = (LiveHaloAvatar) viewGroup.getChildAt(0);
        intlGameGuideDialogView._name = (VText) viewGroup.getChildAt(1);
        intlGameGuideDialogView._content = (VText) viewGroup.getChildAt(2);
        intlGameGuideDialogView._btn_positive = (VButton) viewGroup.getChildAt(3);
        intlGameGuideDialogView._btn_negative = (VText) viewGroup.getChildAt(4);
    }
}
