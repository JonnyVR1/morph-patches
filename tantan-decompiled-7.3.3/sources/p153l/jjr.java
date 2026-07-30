package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.p058ui.likedusers.LikedUserFilterBar;
import p151v.VFrame;
import p151v.VImage;
import p151v.VProgressBar;
import p151v.VPullUpRecyclerView;
import p151v.VText;
import p151v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: classes10.dex */
public class jjr {
    /* JADX INFO: renamed from: a */
    public static void m145112a(ijr ijrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ijrVar.f115255a = (VNavigationBar) viewGroup.getChildAt(0);
        ijrVar.f115256b = (RecyclerView) viewGroup.getChildAt(1);
        ijrVar.f115257c = (VFrame) viewGroup.getChildAt(2);
        ijrVar.f115258d = (VFrame) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        ijrVar.f115259e = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0);
        ijrVar.f115260f = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        ijrVar.f115261g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        ijrVar.f115262h = (VProgressBar) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0)).getChildAt(1);
        ijrVar.f115263i = (VPullUpRecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        ijrVar.f115264j = ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        ijrVar.f115265k = (LikedUserFilterBar) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
        ijrVar.f115266l = (Button) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(4);
        ijrVar.f115267m = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5);
        ijrVar.f115268n = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(0);
        ijrVar.f115269o = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(5)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m145113b(ijr ijrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(pec0.f151978d0, viewGroup, false);
        m145112a(ijrVar, viewInflate);
        return viewInflate;
    }
}
