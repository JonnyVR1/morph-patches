package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.LoveBuzzControlView;
import com.p046p1.mobile.putong.core.p053ui.lovebuzz.widget.MediaBuzzCallControlView;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ghx {
    /* JADX INFO: renamed from: a */
    public static void m126244a(MediaBuzzCallControlView mediaBuzzCallControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaBuzzCallControlView._add_time = (LoveBuzzControlView) viewGroup.getChildAt(0);
        mediaBuzzCallControlView._add_time_count = (VText) viewGroup.getChildAt(1);
        mediaBuzzCallControlView._quit = (LoveBuzzControlView) viewGroup.getChildAt(2);
        mediaBuzzCallControlView._like = (LoveBuzzControlView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m126245b(MediaBuzzCallControlView mediaBuzzCallControlView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(h6c0.f106032i, viewGroup, true);
        m126244a(mediaBuzzCallControlView, viewInflate);
        return viewInflate;
    }
}
