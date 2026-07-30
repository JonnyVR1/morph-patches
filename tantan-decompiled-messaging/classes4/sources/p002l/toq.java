package p002l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogButton;
import com.p000p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogCheckBox;
import com.p000p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogInput;
import com.p000p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogText;
import com.p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import l.t100;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class toq {
    /* JADX INFO: renamed from: a */
    public static cpq m23102a(Context context, BLiveJsDialogItemType bLiveJsDialogItemType, String str) {
        VText vTextM6628f;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(TextUtils.equals(bLiveJsDialogItemType.type, "checkBox") ? -2 : -1, -2);
        int iD = t100.d(24.0f);
        layoutParams.topMargin = t100.d(bLiveJsDialogItemType.topMargin);
        layoutParams.leftMargin = iD;
        layoutParams.rightMargin = iD;
        String str2 = bLiveJsDialogItemType.type;
        str2.getClass();
        switch (str2) {
            case "button":
                vTextM6628f = new JsDialogButton(context).m6628f(LayoutInflater.from(context), null);
                break;
            case "text":
                vTextM6628f = new JsDialogText(context);
                break;
            case "input":
                vTextM6628f = new JsDialogInput(context);
                break;
            case "checkBox":
                vTextM6628f = new JsDialogCheckBox(context);
                break;
            default:
                vTextM6628f = null;
                break;
        }
        if (vTextM6628f == null) {
            return null;
        }
        ((soq) vTextM6628f).mo6629g(bLiveJsDialogItemType, str, layoutParams);
        return new cpq(vTextM6628f, layoutParams);
    }
}
