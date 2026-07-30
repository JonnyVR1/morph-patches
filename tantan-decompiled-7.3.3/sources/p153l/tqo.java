package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Space;
import com.p051p1.mobile.putong.core.p058ui.nightclub.view.IntlNightClubDlgView;
import com.tantan.library.svga.SVGAnimationView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class tqo {
    /* JADX INFO: renamed from: a */
    public static void m192319a(IntlNightClubDlgView intlNightClubDlgView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        intlNightClubDlgView._pop_title = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        intlNightClubDlgView._pop_content = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        intlNightClubDlgView._pop_confirm = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        intlNightClubDlgView._pop_cancel = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        intlNightClubDlgView._match_anim = (SVGAnimationView) viewGroup.getChildAt(1);
        intlNightClubDlgView._space = (Space) viewGroup.getChildAt(2);
    }
}
