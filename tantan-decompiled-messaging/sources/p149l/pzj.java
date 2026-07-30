package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.gift.layer.CoreGiftLayer;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p147v.VText_AutoFit;

/* JADX INFO: loaded from: classes10.dex */
public class pzj {
    /* JADX INFO: renamed from: a */
    public static void m172236a(ozj ozjVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ozjVar.f146456a = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ozjVar.f146457b = (VImage) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        ozjVar.f146458c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        ozjVar.f146459d = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        ozjVar.f146460e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        ozjVar.f146461f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        ozjVar.f146462g = (VText_AutoFit) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        ozjVar.f146463h = (VPullUpRecyclerView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        ozjVar.f146464i = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        ozjVar.f146465j = (LinearLayout) viewGroup.getChildAt(1);
        ozjVar.f146466k = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ozjVar.f146467l = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        ozjVar.f146468m = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        ozjVar.f146469n = (CoreGiftLayer) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m172237b(ozj ozjVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126604y4, viewGroup, false);
        m172236a(ozjVar, viewInflate);
        return viewInflate;
    }
}
