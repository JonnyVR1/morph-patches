package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubAnchorProfileView;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class n8g {
    /* JADX INFO: renamed from: a */
    public static void m161921a(m8g m8gVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        m8gVar.f135177k = (FrameLayout) viewGroup.getChildAt(0);
        m8gVar.f135178l = (VImage) viewGroup.getChildAt(1);
        m8gVar.f135179m = (LinearLayout) viewGroup.getChildAt(2);
        m8gVar.f135180n = (LiveFansClubAnchorProfileView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(0);
        m8gVar.f135181o = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(1);
        m8gVar.f135182p = (RecyclerView) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(2);
        m8gVar.f135183q = (VText) ((ViewGroup) viewGroup.getChildAt(2)).getChildAt(3);
    }
}
