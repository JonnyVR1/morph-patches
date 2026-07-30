package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p000p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogButton;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class koq {
    /* JADX INFO: renamed from: a */
    public static void m16731a(JsDialogButton jsDialogButton, View view) {
        jsDialogButton.f5296a = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m16732b(JsDialogButton jsDialogButton, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f19698U2, viewGroup, false);
        m16731a(jsDialogButton, viewInflate);
        return viewInflate;
    }
}
