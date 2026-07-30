package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import com.p046p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogButton;
import com.p046p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogCheckBox;
import com.p046p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogInput;
import com.p046p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogText;

/* JADX INFO: loaded from: classes4.dex */
public class toq {
    /* JADX INFO: renamed from: a */
    public static cpq m189918a(Context context, BLiveJsDialogItemType bLiveJsDialogItemType, String str) {
        View viewM73102f;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(TextUtils.equals(bLiveJsDialogItemType.type, "checkBox") ? -2 : -1, -2);
        int iM186890d = t100.m186890d(24.0f);
        layoutParams.topMargin = t100.m186890d(bLiveJsDialogItemType.topMargin);
        layoutParams.leftMargin = iM186890d;
        layoutParams.rightMargin = iM186890d;
        String str2 = bLiveJsDialogItemType.type;
        str2.getClass();
        switch (str2) {
            case "button":
                viewM73102f = new JsDialogButton(context).m73102f(LayoutInflater.from(context), null);
                break;
            case "text":
                viewM73102f = new JsDialogText(context);
                break;
            case "input":
                viewM73102f = new JsDialogInput(context);
                break;
            case "checkBox":
                viewM73102f = new JsDialogCheckBox(context);
                break;
            default:
                viewM73102f = null;
                break;
        }
        if (viewM73102f == null) {
            return null;
        }
        ((soq) viewM73102f).mo73103g(bLiveJsDialogItemType, str, layoutParams);
        return new cpq(viewM73102f, layoutParams);
    }
}
