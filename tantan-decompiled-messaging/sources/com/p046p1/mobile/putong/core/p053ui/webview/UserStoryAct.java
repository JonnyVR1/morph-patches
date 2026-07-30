package com.p046p1.mobile.putong.core.p053ui.webview;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct;
import java.util.List;
import p149l.hlp0;
import p149l.o9k0;
import p149l.olp0;
import p149l.u9k0;

/* JADX INFO: loaded from: classes9.dex */
public class UserStoryAct extends AccessTokenWebViewAct {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m58141Z1(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) UserStoryAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct, com.p046p1.mobile.putong.p065ui.webview.WebViewAct
    /* JADX INFO: renamed from: b2 */
    public hlp0 mo29700b2() {
        return new o9k0(this);
    }

    @Override // com.p046p1.mobile.putong.p065ui.webview.AccessTokenWebViewAct, com.p046p1.mobile.putong.p065ui.webview.WebViewAct
    /* JADX INFO: renamed from: c2 */
    public olp0 mo29701c2() {
        return new u9k0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (list.size() > 0) {
            Media media = list.get(0);
            if (media instanceof Picture) {
                ((o9k0) this.f54758c).m163207A0((Picture) media);
            }
        }
    }
}
