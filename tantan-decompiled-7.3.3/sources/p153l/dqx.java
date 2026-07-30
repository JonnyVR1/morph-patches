package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.LoveBuzzControlView;
import com.p051p1.mobile.putong.core.p058ui.lovebuzz.widget.MediaBuzzCallControlView;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class dqx {
    /* JADX INFO: renamed from: a */
    public static void m117583a(MediaBuzzCallControlView mediaBuzzCallControlView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        mediaBuzzCallControlView._add_time = (LoveBuzzControlView) viewGroup.getChildAt(0);
        mediaBuzzCallControlView._add_time_count = (VText) viewGroup.getChildAt(1);
        mediaBuzzCallControlView._quit = (LoveBuzzControlView) viewGroup.getChildAt(2);
        mediaBuzzCallControlView._like = (LoveBuzzControlView) viewGroup.getChildAt(3);
    }

    /* JADX INFO: renamed from: b */
    public static View m117584b(MediaBuzzCallControlView mediaBuzzCallControlView, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(mec0.f136474i, viewGroup, true);
        m117583a(mediaBuzzCallControlView, viewInflate);
        return viewInflate;
    }
}
