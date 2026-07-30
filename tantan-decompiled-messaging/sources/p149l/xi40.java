package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.nightclub.view.NightClubDlgView;
import p147v.AutoVDraweeView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class xi40 {
    /* JADX INFO: renamed from: a */
    public static void m208913a(NightClubDlgView nightClubDlgView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        nightClubDlgView._background = (AutoVDraweeView) viewGroup.getChildAt(0);
        nightClubDlgView._match_image = (AutoVDraweeView) viewGroup.getChildAt(1);
        nightClubDlgView._pop_title = (VText) viewGroup.getChildAt(2);
        nightClubDlgView._pop_content = (VText) viewGroup.getChildAt(3);
        nightClubDlgView._pop_confirm = (VText) viewGroup.getChildAt(4);
        nightClubDlgView._pop_cancel = (VText) viewGroup.getChildAt(5);
    }
}
