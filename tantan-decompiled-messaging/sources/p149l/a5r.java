package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvTuningSeekBar;
import com.p046p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvTuningViewModel;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLine;
import p147v.VLinear;
import p147v.VSwitchButton;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class a5r {
    /* JADX INFO: renamed from: a */
    public static void m95056a(KtvTuningViewModel ktvTuningViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ktvTuningViewModel.f52460a = (VFrame) viewGroup.getChildAt(0);
        ktvTuningViewModel.f52461b = (ConstraintLayout) viewGroup.getChildAt(1);
        ktvTuningViewModel.f52462c = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ktvTuningViewModel.f52463d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ktvTuningViewModel.f52464e = (VLine) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ktvTuningViewModel.f52465f = (VSwitchButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        ktvTuningViewModel.f52466g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        ktvTuningViewModel.f52467h = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        ktvTuningViewModel.f52468i = (VSwitchButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        ktvTuningViewModel.f52469j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        ktvTuningViewModel.f52470k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        ktvTuningViewModel.f52471l = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        ktvTuningViewModel.f52472m = (KtvTuningSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
        ktvTuningViewModel.f52473n = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
        ktvTuningViewModel.f52474o = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12);
        ktvTuningViewModel.f52475p = (KtvTuningSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13);
        ktvTuningViewModel.f52476q = (HorizontalScrollView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14);
        ktvTuningViewModel.f52477r = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14)).getChildAt(0);
        ktvTuningViewModel.f52478s = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15);
        ktvTuningViewModel.f52479t = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(16);
        ktvTuningViewModel.f52480u = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(17);
        ktvTuningViewModel.f52481v = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(18);
    }

    /* JADX INFO: renamed from: b */
    public static View m95057b(KtvTuningViewModel ktvTuningViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168489q9, viewGroup, false);
        m95056a(ktvTuningViewModel, viewInflate);
        return viewInflate;
    }
}
