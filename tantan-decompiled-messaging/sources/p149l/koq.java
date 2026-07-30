package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogButton;

/* JADX INFO: loaded from: classes4.dex */
public class koq {
    /* JADX INFO: renamed from: a */
    public static void m146752a(JsDialogButton jsDialogButton, View view) {
        jsDialogButton.f49254a = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m146753b(JsDialogButton jsDialogButton, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(t6c0.f168202U2, viewGroup, false);
        m146752a(jsDialogButton, viewInflate);
        return viewInflate;
    }
}
