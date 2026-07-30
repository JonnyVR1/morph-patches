package p007l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView;
import v.VRelative;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ovh {
    /* JADX INFO: renamed from: a */
    public static void m12866a(nvh nvhVar, View view) {
        nvhVar.f10893a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nvhVar.f10894b = (FeedStatesMediaView) viewGroup.getChildAt(0);
        nvhVar.f10895c = viewGroup.getChildAt(1);
        nvhVar.f10896d = viewGroup.getChildAt(2);
        nvhVar.f10897e = viewGroup.getChildAt(3);
        nvhVar.f10898f = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        nvhVar.f10899g = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        nvhVar.f10900h = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        nvhVar.f10901i = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        nvhVar.f10902j = ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        nvhVar.f10903k = viewGroup.getChildAt(4);
        nvhVar.f10904l = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        nvhVar.f10905m = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        nvhVar.f10906n = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        nvhVar.f10907o = ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m12867b(nvh nvhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f11290r, viewGroup, false);
        m12866a(nvhVar, viewInflate);
        return viewInflate;
    }
}
