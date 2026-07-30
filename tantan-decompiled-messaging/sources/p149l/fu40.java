package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.cardview.widget.CardView;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.mytab.NotifyHeaderView;
import p147v.VCard;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class fu40 {
    /* JADX INFO: renamed from: a */
    public static void m123135a(NotifyHeaderView notifyHeaderView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        notifyHeaderView.f26624a = (FrameLayout) viewGroup.getChildAt(0);
        notifyHeaderView.f26625b = (VCard) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        notifyHeaderView.f26626c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        notifyHeaderView.f26627d = (CardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        notifyHeaderView.f26628e = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0);
        notifyHeaderView.f26629f = (CardView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        notifyHeaderView.f26630g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        notifyHeaderView.f26631h = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        notifyHeaderView.f26632i = (ViewStub) viewGroup.getChildAt(1);
    }
}
