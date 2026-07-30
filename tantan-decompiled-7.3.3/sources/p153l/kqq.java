package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogButton;

/* JADX INFO: loaded from: classes4.dex */
public class kqq {
    /* JADX INFO: renamed from: a */
    public static void m150924a(JsDialogButton jsDialogButton, View view) {
        jsDialogButton.f50102a = (TextView) ((ViewGroup) view).getChildAt(0);
    }

    /* JADX INFO: renamed from: b */
    public static View m150925b(JsDialogButton jsDialogButton, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(yec0.f198934U2, viewGroup, false);
        m150924a(jsDialogButton, viewInflate);
        return viewInflate;
    }
}
