package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderView;
import p151v.VCard;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class u250 {
    /* JADX INFO: renamed from: a */
    public static void m194246a(NotifyHeaderView notifyHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        notifyHeaderView.f27472a = (FrameLayout) viewGroup.getChildAt(0);
        notifyHeaderView.f27473b = (VCard) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        notifyHeaderView.f27474c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        notifyHeaderView.f27475d = (CardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        notifyHeaderView.f27476e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        notifyHeaderView.f27477f = (CardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        notifyHeaderView.f27478g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        notifyHeaderView.f27479h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        notifyHeaderView.f27480i = (ViewStub) viewGroup.getChildAt(1);
    }
}
