package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p147v.VImage;
import p147v.VRecyclerView;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class ixr {
    /* JADX INFO: renamed from: a */
    public static void m138890a(hxr hxrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hxrVar._shadow = viewGroup.getChildAt(0);
        hxrVar._bg = viewGroup.getChildAt(1);
        hxrVar._title = (VText) viewGroup.getChildAt(2);
        hxrVar._back = (VImage) viewGroup.getChildAt(3);
        hxrVar._divider = viewGroup.getChildAt(4);
        hxrVar._recyclerView = (VRecyclerView) viewGroup.getChildAt(5);
        hxrVar._emptyView = (VImage) viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m138891b(hxr hxrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168505s, viewGroup, false);
        m138890a(hxrVar, viewInflate);
        return viewInflate;
    }
}
