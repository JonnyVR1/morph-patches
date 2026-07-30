package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.livingroom.common.fansclub.widget.LiveFansClubMedalEditPanel;
import p151v.VEditText;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class lds {
    /* JADX INFO: renamed from: a */
    public static void m153787a(LiveFansClubMedalEditPanel liveFansClubMedalEditPanel, View view) {
        liveFansClubMedalEditPanel.f49951a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        liveFansClubMedalEditPanel.f49952b = viewGroup.getChildAt(0);
        liveFansClubMedalEditPanel.f49953c = (LinearLayout) viewGroup.getChildAt(1);
        liveFansClubMedalEditPanel.f49954d = (VEditText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        liveFansClubMedalEditPanel.f49955e = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m153788b(LiveFansClubMedalEditPanel liveFansClubMedalEditPanel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198848N0, viewGroup, false);
        m153787a(liveFansClubMedalEditPanel, viewInflate);
        return viewInflate;
    }
}
