package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.model.MessageProfileSettingViewModel;
import com.p046p1.mobile.putong.core.p053ui.view.GradientBgButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VSwitchButton;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class wvz {
    /* JADX INFO: renamed from: a */
    public static void m205788a(MessageProfileSettingViewModel messageProfileSettingViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        messageProfileSettingViewModel.f31904c = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageProfileSettingViewModel.f31905d = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageProfileSettingViewModel.f31906e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageProfileSettingViewModel.f31907f = (GradientBgButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        messageProfileSettingViewModel.f31908g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageProfileSettingViewModel.f31909h = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        messageProfileSettingViewModel.f31910i = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        messageProfileSettingViewModel.f31911j = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        messageProfileSettingViewModel.f31912k = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        messageProfileSettingViewModel.f31913l = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        messageProfileSettingViewModel.f31914m = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
        messageProfileSettingViewModel.f31915n = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(4);
        messageProfileSettingViewModel.f31916o = (VSwitchButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(4)).getChildAt(1);
        messageProfileSettingViewModel.f31917p = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5);
        messageProfileSettingViewModel.f31918q = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5)).getChildAt(1);
        messageProfileSettingViewModel.f31919r = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5)).getChildAt(2);
        messageProfileSettingViewModel.f31920s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5)).getChildAt(3);
        messageProfileSettingViewModel.f31921t = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(6);
        messageProfileSettingViewModel.f31922u = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(6)).getChildAt(0);
        messageProfileSettingViewModel.f31923v = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(7);
        messageProfileSettingViewModel.f31924w = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(7)).getChildAt(0);
        messageProfileSettingViewModel.f31925x = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(8);
        messageProfileSettingViewModel.f31926y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(8)).getChildAt(0);
        messageProfileSettingViewModel.f31927z = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(9);
        messageProfileSettingViewModel.f31895A = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(9)).getChildAt(0);
        messageProfileSettingViewModel.f31896B = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(10);
        messageProfileSettingViewModel.f31897C = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(10)).getChildAt(0);
        messageProfileSettingViewModel.f31898D = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(11);
        messageProfileSettingViewModel.f31899E = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(12);
    }

    /* JADX INFO: renamed from: b */
    public static View m205789b(MessageProfileSettingViewModel messageProfileSettingViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126602y2, viewGroup, false);
        m205788a(messageProfileSettingViewModel, viewInflate);
        return viewInflate;
    }
}
