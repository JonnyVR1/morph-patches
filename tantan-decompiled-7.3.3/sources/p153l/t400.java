package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.model.MessageProfileSettingViewModel;
import com.p051p1.mobile.putong.core.p058ui.view.GradientBgButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VSwitchButton;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class t400 {
    /* JADX INFO: renamed from: a */
    public static void m189136a(MessageProfileSettingViewModel messageProfileSettingViewModel, View view) {
        ViewGroup viewGroup = (ViewGroup) view;
        messageProfileSettingViewModel.f32752c = (RelativeLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
        messageProfileSettingViewModel.f32753d = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageProfileSettingViewModel.f32754e = (VDraweeView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(0);
        messageProfileSettingViewModel.f32755f = (GradientBgButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0)).getChildAt(1);
        messageProfileSettingViewModel.f32756g = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        messageProfileSettingViewModel.f32757h = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1)).getChildAt(1);
        messageProfileSettingViewModel.f32758i = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
        messageProfileSettingViewModel.f32759j = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(0);
        messageProfileSettingViewModel.f32760k = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
        messageProfileSettingViewModel.f32761l = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(2);
        messageProfileSettingViewModel.f32762m = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(3);
        messageProfileSettingViewModel.f32763n = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(4);
        messageProfileSettingViewModel.f32764o = (VSwitchButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(4)).getChildAt(1);
        messageProfileSettingViewModel.f32765p = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5);
        messageProfileSettingViewModel.f32766q = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5)).getChildAt(1);
        messageProfileSettingViewModel.f32767r = (ImageView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5)).getChildAt(2);
        messageProfileSettingViewModel.f32768s = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(5)).getChildAt(3);
        messageProfileSettingViewModel.f32769t = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(6);
        messageProfileSettingViewModel.f32770u = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(6)).getChildAt(0);
        messageProfileSettingViewModel.f32771v = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(7);
        messageProfileSettingViewModel.f32772w = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(7)).getChildAt(0);
        messageProfileSettingViewModel.f32773x = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(8);
        messageProfileSettingViewModel.f32774y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(8)).getChildAt(0);
        messageProfileSettingViewModel.f32775z = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(9);
        messageProfileSettingViewModel.f32743A = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(9)).getChildAt(0);
        messageProfileSettingViewModel.f32744B = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(10);
        messageProfileSettingViewModel.f32745C = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(10)).getChildAt(0);
        messageProfileSettingViewModel.f32746D = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(11);
        messageProfileSettingViewModel.f32747E = (RelativeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(12);
    }

    /* JADX INFO: renamed from: b */
    public static View m189137b(MessageProfileSettingViewModel messageProfileSettingViewModel, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f157158y2, viewGroup, false);
        m189136a(messageProfileSettingViewModel, viewInflate);
        return viewInflate;
    }
}
