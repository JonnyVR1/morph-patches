package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class s0x {
    /* JADX INFO: renamed from: a */
    public static void m183985a(r0x r0xVar, View view) {
        r0xVar.f160704c = (VLinear) view;
        ViewGroup viewGroup = (ViewGroup) view;
        r0xVar.f160705d = (VText) viewGroup.getChildAt(0);
        r0xVar.f160706e = (VFrame) viewGroup.getChildAt(1);
        r0xVar.f160707f = (WheelPicker) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(0);
        r0xVar.f160708g = (WheelPicker) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(1)).getChildAt(1);
    }

    /* JADX INFO: renamed from: b */
    public static View m183986b(r0x r0xVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(sec0.f167531Q, viewGroup, false);
        m183985a(r0xVar, viewInflate);
        return viewInflate;
    }
}
