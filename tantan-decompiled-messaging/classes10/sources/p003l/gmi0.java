package p003l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.putong.core.newui.discovery.ThemeSuggestFrag;
import l.f6c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gmi0 {
    /* JADX INFO: renamed from: a */
    public static void m6772a(ThemeSuggestFrag themeSuggestFrag, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        themeSuggestFrag.z = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        themeSuggestFrag.A = viewGroup.getChildAt(1);
        themeSuggestFrag.B = viewGroup.getChildAt(2);
    }

    /* JADX INFO: renamed from: b */
    public static View m6773b(ThemeSuggestFrag themeSuggestFrag, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.df, viewGroup, false);
        m6772a(themeSuggestFrag, viewInflate);
        return viewInflate;
    }
}
