package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.view.LiveHaloAvatar;
import com.p051p1.mobile.putong.live.external.intl.common.gameguide.IntlGameGuideDialogView;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class xjn {
    /* JADX INFO: renamed from: a */
    public static void m211238a(IntlGameGuideDialogView intlGameGuideDialogView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlGameGuideDialogView._avatar = (LiveHaloAvatar) viewGroup.getChildAt(0);
        intlGameGuideDialogView._name = (VText) viewGroup.getChildAt(1);
        intlGameGuideDialogView._content = (VText) viewGroup.getChildAt(2);
        intlGameGuideDialogView._btn_positive = (VButton) viewGroup.getChildAt(3);
        intlGameGuideDialogView._btn_negative = (VText) viewGroup.getChildAt(4);
    }
}
