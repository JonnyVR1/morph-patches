package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/* JADX INFO: loaded from: classes10.dex */
public class e8n {
    /* JADX INFO: renamed from: a */
    public static void m119830a(d8n d8nVar, View view) {
        d8nVar.f85655a = (LinearLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        d8nVar.f85656b = (TextView) viewGroup.getChildAt(0);
        d8nVar.f85657c = (TextView) viewGroup.getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m119831b(d8n d8nVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(rec0.f162597r, viewGroup, false);
        m119830a(d8nVar, viewInflate);
        return viewInflate;
    }
}
