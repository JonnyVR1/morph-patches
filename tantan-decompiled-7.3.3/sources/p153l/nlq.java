package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.p058ui.account.JailedDialogLikeAct;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class nlq {
    /* JADX INFO: renamed from: a */
    public static void m163764a(JailedDialogLikeAct jailedDialogLikeAct, View view) {
        jailedDialogLikeAct.f29091c = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        jailedDialogLikeAct.f29092d = (LinearLayout) viewGroup.getChildAt(0);
        jailedDialogLikeAct.f29093e = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        jailedDialogLikeAct.f29094f = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        jailedDialogLikeAct.f29095g = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        jailedDialogLikeAct.f29096h = (VButton) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
        jailedDialogLikeAct.f29097i = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(4);
    }

    /* JADX INFO: renamed from: b */
    public static View m163765b(JailedDialogLikeAct jailedDialogLikeAct, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167568h, viewGroup, false);
        m163764a(jailedDialogLikeAct, viewInflate);
        return viewInflate;
    }
}
