package p003l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import l.mlr;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class plr {
    /* JADX INFO: renamed from: a */
    public static void m8759a(mlr mlrVar, View view) {
        mlrVar.d = (RelativeLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        mlrVar.e = (RelativeLayout) viewGroup.getChildAt(0);
        mlrVar.f = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        mlrVar.g = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        mlrVar.h = (ImageView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
    }
}
