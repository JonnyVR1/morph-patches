package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p151v.VImage;
import p151v.VRecyclerView;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jzr {
    /* JADX INFO: renamed from: a */
    public static void m147715a(izr izrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        izrVar._shadow = viewGroup.getChildAt(0);
        izrVar._bg = viewGroup.getChildAt(1);
        izrVar._title = (VText) viewGroup.getChildAt(2);
        izrVar._back = (VImage) viewGroup.getChildAt(3);
        izrVar._divider = viewGroup.getChildAt(4);
        izrVar._recyclerView = (VRecyclerView) viewGroup.getChildAt(5);
        izrVar._emptyView = (VImage) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m147716b(izr izrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199237s, viewGroup, false);
        m147715a(izrVar, viewInflate);
        return viewInflate;
    }
}
