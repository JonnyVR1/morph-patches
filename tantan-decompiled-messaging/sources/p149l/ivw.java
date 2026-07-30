package p149l;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.home.view.MarryAdCardView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class ivw {
    /* JADX INFO: renamed from: a */
    public static void m138667a(MarryAdCardView marryAdCardView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        marryAdCardView.f29717a = (VDraweeView) viewGroup.getChildAt(0);
        marryAdCardView.f29718b = (SimpleDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        marryAdCardView.f29719c = (VText_Bold) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(3);
        marryAdCardView.f29720d = (VText_Bold) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3)).getChildAt(0)).getChildAt(1)).getChildAt(4);
        marryAdCardView.f29721e = (VText_Bold) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
