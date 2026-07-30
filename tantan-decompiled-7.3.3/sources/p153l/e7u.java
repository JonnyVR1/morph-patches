package p153l;

import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.live.base.view.LiveHaloAvatar;
import com.p051p1.mobile.putong.live.external.view.widgets.LiveSquareVoiceCompanionDialogView;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes9.dex */
public class e7u {
    /* JADX INFO: renamed from: a */
    public static void m119771a(LiveSquareVoiceCompanionDialogView liveSquareVoiceCompanionDialogView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveSquareVoiceCompanionDialogView._avatar = (LiveHaloAvatar) viewGroup.getChildAt(0);
        liveSquareVoiceCompanionDialogView._name = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveSquareVoiceCompanionDialogView._age = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveSquareVoiceCompanionDialogView._content = (VText) viewGroup.getChildAt(2);
        liveSquareVoiceCompanionDialogView._btn_positive = (VButton) viewGroup.getChildAt(3);
        liveSquareVoiceCompanionDialogView._btn_negative = (VText) viewGroup.getChildAt(4);
    }
}
