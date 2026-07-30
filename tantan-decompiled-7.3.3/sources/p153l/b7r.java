package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvTuningSeekBar;
import com.p051p1.mobile.putong.live.livingroom.virtual.ktv.view.KtvTuningViewModel;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLine;
import p151v.VLinear;
import p151v.VSwitchButton;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class b7r {
    /* JADX INFO: renamed from: a */
    public static void m102869a(KtvTuningViewModel ktvTuningViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        ktvTuningViewModel.f53308a = (VFrame) viewGroup.getChildAt(0);
        ktvTuningViewModel.f53309b = (ConstraintLayout) viewGroup.getChildAt(1);
        ktvTuningViewModel.f53310c = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        ktvTuningViewModel.f53311d = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1);
        ktvTuningViewModel.f53312e = (VLine) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(2);
        ktvTuningViewModel.f53313f = (VSwitchButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(3);
        ktvTuningViewModel.f53314g = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(4);
        ktvTuningViewModel.f53315h = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(5);
        ktvTuningViewModel.f53316i = (VSwitchButton) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(6);
        ktvTuningViewModel.f53317j = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(7);
        ktvTuningViewModel.f53318k = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(8);
        ktvTuningViewModel.f53319l = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(9);
        ktvTuningViewModel.f53320m = (KtvTuningSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(10);
        ktvTuningViewModel.f53321n = (VText) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(11);
        ktvTuningViewModel.f53322o = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(12);
        ktvTuningViewModel.f53323p = (KtvTuningSeekBar) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(13);
        ktvTuningViewModel.f53324q = (HorizontalScrollView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14);
        ktvTuningViewModel.f53325r = (VLinear) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(14)).getChildAt(0);
        ktvTuningViewModel.f53326s = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(15);
        ktvTuningViewModel.f53327t = (VImage) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(16);
        ktvTuningViewModel.f53328u = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(17);
        ktvTuningViewModel.f53329v = (TextView) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(18);
    }

    /* JADX INFO: renamed from: b */
    public static View m102870b(KtvTuningViewModel ktvTuningViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f199221q9, viewGroup, false);
        m102869a(ktvTuningViewModel, viewInflate);
        return viewInflate;
    }
}
