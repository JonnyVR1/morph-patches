package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.recreation.multiplayerchat.view.LiveCallView;
import p151v.VDraweeView;

/* JADX INFO: loaded from: classes4.dex */
public class a3s {
    /* JADX INFO: renamed from: a */
    public static void m95867a(LiveCallView liveCallView, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        liveCallView.f52353a = (FrameLayout) viewGroup.getChildAt(0);
        liveCallView.f52354b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        liveCallView.f52355c = (FrameLayout) viewGroup.getChildAt(1);
        liveCallView.f52356d = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        liveCallView.f52357e = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        liveCallView.f52358f = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        liveCallView.f52359g = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        liveCallView.f52360h = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        liveCallView.f52361i = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        liveCallView.f52362j = (ImageView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
    }
}
