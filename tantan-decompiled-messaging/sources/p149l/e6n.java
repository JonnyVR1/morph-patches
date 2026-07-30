package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class e6n {
    /* JADX INFO: renamed from: a */
    public static void m115100a(d6n d6nVar, View view) {
        d6nVar.f84643a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        d6nVar.f84644b = (TextView) viewGroup.getChildAt(0);
        d6nVar.f84645c = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m115101b(d6n d6nVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(m6c0.f131637r, viewGroup, false);
        m115100a(d6nVar, viewInflate);
        return viewInflate;
    }
}
