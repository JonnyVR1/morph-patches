package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ixr {
    /* JADX INFO: renamed from: a */
    public static void m15502a(hxr hxrVar, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        hxrVar._shadow = viewGroup.getChildAt(0);
        hxrVar._bg = viewGroup.getChildAt(1);
        hxrVar._title = viewGroup.getChildAt(2);
        hxrVar._back = viewGroup.getChildAt(3);
        hxrVar._divider = viewGroup.getChildAt(4);
        hxrVar._recyclerView = viewGroup.getChildAt(5);
        hxrVar._emptyView = viewGroup.getChildAt(6);
    }

    /* JADX INFO: renamed from: b */
    public static View m15503b(hxr hxrVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f20001s, viewGroup, false);
        m15502a(hxrVar, viewInflate);
        return viewInflate;
    }
}
