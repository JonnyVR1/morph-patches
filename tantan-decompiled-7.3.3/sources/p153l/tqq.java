package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.live.base.data.BLiveJsDialogItemType;
import com.p051p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogButton;
import com.p051p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogCheckBox;
import com.p051p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogInput;
import com.p051p1.mobile.putong.live.livingroom.common.plughub.plugs.dialog.JsDialogText;

/* JADX INFO: loaded from: classes4.dex */
public class tqq {
    /* JADX INFO: renamed from: a */
    public static crq m192350a(Context context, BLiveJsDialogItemType bLiveJsDialogItemType, String str) {
        View viewM74285f;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(TextUtils.equals(bLiveJsDialogItemType.type, "checkBox") ? -2 : -1, -2);
        int iM175859d = qa00.m175859d(24.0f);
        layoutParams.topMargin = qa00.m175859d(bLiveJsDialogItemType.topMargin);
        layoutParams.leftMargin = iM175859d;
        layoutParams.rightMargin = iM175859d;
        String str2 = bLiveJsDialogItemType.type;
        str2.getClass();
        switch (str2) {
            case "button":
                viewM74285f = new JsDialogButton(context).m74285f(LayoutInflater.from(context), null);
                break;
            case "text":
                viewM74285f = new JsDialogText(context);
                break;
            case "input":
                viewM74285f = new JsDialogInput(context);
                break;
            case "checkBox":
                viewM74285f = new JsDialogCheckBox(context);
                break;
            default:
                viewM74285f = null;
                break;
        }
        if (viewM74285f == null) {
            return null;
        }
        ((sqq) viewM74285f).mo74286g(bLiveJsDialogItemType, str, layoutParams);
        return new crq(viewM74285f, layoutParams);
    }
}
