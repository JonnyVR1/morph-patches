package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.p001ui.gift.layer.CoreGiftLayer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class pzj {
    /* JADX INFO: renamed from: a */
    public static void m8846a(ozj ozjVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ozjVar.f6768a = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        ozjVar.f6769b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        ozjVar.f6770c = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(2);
        ozjVar.f6771d = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        ozjVar.f6772e = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        ozjVar.f6773f = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        ozjVar.f6774g = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(2);
        ozjVar.f6775h = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1);
        ozjVar.f6776i = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
        ozjVar.f6777j = (LinearLayout) viewGroup.getChildAt(1);
        ozjVar.f6778k = ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ozjVar.f6779l = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        ozjVar.f6780m = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
        ozjVar.f6781n = (CoreGiftLayer) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m8847b(ozj ozjVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f6113y4, viewGroup, false);
        m8846a(ozjVar, viewInflate);
        return viewInflate;
    }
}
