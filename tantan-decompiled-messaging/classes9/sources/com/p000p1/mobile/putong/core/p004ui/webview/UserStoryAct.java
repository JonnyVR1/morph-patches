package com.p000p1.mobile.putong.core.p004ui.webview;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.ui.webview.AccessTokenWebViewAct;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import java.util.List;
import l.hlp0;
import l.olp0;
import p006l.o9k0;
import p006l.u9k0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class UserStoryAct extends AccessTokenWebViewAct {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m11674Z1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) UserStoryAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        return intent;
    }

    /* JADX INFO: renamed from: b2 */
    public hlp0 m11675b2() {
        return new o9k0(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c2 */
    public olp0 m11676c2() {
        return new u9k0(this);
    }

    public void onPickImagesResult(List<Media> list) {
        if (list.size() > 0) {
            Picture picture = (Media) list.get(0);
            if (picture instanceof Picture) {
                ((WebViewAct) this).c.m20437A0(picture);
            }
        }
    }
}
