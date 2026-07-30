package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageMarryHeaderLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageUserHeaderLayout;
import com.p046p1.mobile.putong.core.p053ui.view.MessageKnowHimLayout;
import com.p046p1.mobile.putong.core.p053ui.view.MessageMatchTimeLayout;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class uzz {
    /* JADX INFO: renamed from: a */
    public static void m196456a(tzz tzzVar, View view) {
        tzzVar.f172792a = (FrameLayout) view;
        ViewGroup viewGroup = (ViewGroup) view;
        tzzVar.f172793b = (VProgressBar) viewGroup.getChildAt(0);
        tzzVar.f172794c = (FrameLayout) viewGroup.getChildAt(1);
        tzzVar.f172795d = (LinearLayout) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0);
        tzzVar.f172796e = (MessageMatchTimeLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(0);
        tzzVar.f172797f = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        tzzVar.f172798g = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1);
        tzzVar.f172799h = (LinearLayout) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0);
        tzzVar.f172800i = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0);
        tzzVar.f172801j = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
        tzzVar.f172802k = (MessageUserHeaderLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(2);
        tzzVar.f172803l = (MessageKnowHimLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(3);
        tzzVar.f172804m = (MessageMarryHeaderLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(4);
        tzzVar.f172805n = (ViewStub) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(5);
        tzzVar.f172806o = (ViewStub) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(6);
        tzzVar.f172807p = (ViewStub) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(7);
        tzzVar.f172808q = (TextView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(8);
        tzzVar.f172809r = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(9);
        tzzVar.f172810s = (TextView) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(9)).getChildAt(1);
        tzzVar.f172811t = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(10);
        tzzVar.f172812u = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(11);
        tzzVar.f172813v = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(11)).getChildAt(0)).getChildAt(0);
        tzzVar.f172814w = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(12);
        tzzVar.f172815x = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(0);
        tzzVar.f172816y = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(12)).getChildAt(0)).getChildAt(1);
        tzzVar.f172817z = (LinearLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(13);
        tzzVar.f172771A = (VImage) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(13)).getChildAt(0);
        tzzVar.f172772B = (FrameLayout) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(14);
        tzzVar.f172773C = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(14)).getChildAt(0);
        tzzVar.f172774D = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(15);
        tzzVar.f172775E = (ViewStub) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(16);
        tzzVar.f172776F = (ViewStub) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(17);
        tzzVar.f172777G = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(18);
        tzzVar.f172778H = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(1)).getChildAt(0)).getChildAt(19);
    }

    /* JADX INFO: renamed from: b */
    public static View m196457b(tzz tzzVar, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126465e5, viewGroup, false);
        m196456a(tzzVar, viewInflate);
        return viewInflate;
    }
}
