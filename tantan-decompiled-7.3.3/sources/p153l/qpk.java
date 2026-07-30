package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.newui.group.SwipeRefreshList;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class qpk {
    /* JADX INFO: renamed from: a */
    public static void m177457a(ppk ppkVar, View view) {
        ppkVar.f153552a = (FrameLayout) view.findViewById(edc0.f93284T3);
        ViewGroup viewGroup = (ViewGroup) view;
        ppkVar.f153553b = (SwipeRefreshList) viewGroup.getChildAt(0);
        ppkVar.f153554c = (VLinear) view.findViewById(edc0.f93337c0);
        ppkVar.f153555d = (VRecyclerView) view.findViewById(edc0.f93439q4);
        ppkVar.f153556e = (LinearLayout) view.findViewById(edc0.f93334b4);
        ppkVar.f153557f = (VText) view.findViewById(edc0.f93208H);
        ppkVar.f153558g = (VRecyclerView) view.findViewById(edc0.f93432p4);
        ppkVar.f153559h = (VRelative) viewGroup.getChildAt(1);
        ppkVar.f153560i = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ppkVar.f153561j = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m177458b(ppk ppkVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157050j, viewGroup, false);
        m177457a(ppkVar, viewInflate);
        return viewInflate;
    }
}
