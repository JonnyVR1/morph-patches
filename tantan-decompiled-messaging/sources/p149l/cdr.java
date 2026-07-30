package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import p147v.VDraweeView;

/* JADX INFO: loaded from: classes10.dex */
public class cdr {
    /* JADX INFO: renamed from: a */
    public static void m106280a(bdr bdrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        bdrVar._setting_img = (VDraweeView) viewGroup.getChildAt(0);
        bdrVar._setting_content_title = (TextView) viewGroup.getChildAt(1);
        bdrVar._setting_content_desc = (TextView) viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m106281b(bdr bdrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f95543R4, viewGroup, false);
        m106280a(bdrVar, viewInflate);
        return viewInflate;
    }
}
