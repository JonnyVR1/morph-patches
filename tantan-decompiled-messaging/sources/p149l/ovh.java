package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.feed.newui.status.display.view.FeedStatesMediaView;
import p147v.VDraweeView;
import p147v.VEditText;
import p147v.VImage;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes12.dex */
public class ovh {
    /* JADX INFO: renamed from: a */
    public static void m166192a(nvh nvhVar, View view) {
        nvhVar.f140717a = (VRelative) view;
        ViewGroup viewGroup = (ViewGroup) view;
        nvhVar.f140718b = (FeedStatesMediaView) viewGroup.getChildAt(0);
        nvhVar.f140719c = viewGroup.getChildAt(1);
        nvhVar.f140720d = (VImage) viewGroup.getChildAt(2);
        nvhVar.f140721e = (VRelative) viewGroup.getChildAt(3);
        nvhVar.f140722f = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(0);
        nvhVar.f140723g = (VEditText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(1);
        nvhVar.f140724h = (VText) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(2);
        nvhVar.f140725i = (VImage) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(3);
        nvhVar.f140726j = (VDraweeView) ((ViewGroup) viewGroup.getChildAt(3)).getChildAt(4);
        nvhVar.f140727k = (ConstraintLayout) viewGroup.getChildAt(4);
        nvhVar.f140728l = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(0);
        nvhVar.f140729m = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(1);
        nvhVar.f140730n = (VImage) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(2);
        nvhVar.f140731o = (VText) ((ViewGroup) viewGroup.getChildAt(4)).getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m166193b(nvh nvhVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(o6c0.f142271r, viewGroup, false);
        m166192a(nvhVar, viewInflate);
        return viewInflate;
    }
}
