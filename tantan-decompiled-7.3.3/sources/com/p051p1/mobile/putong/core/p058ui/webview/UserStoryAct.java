package com.p051p1.mobile.putong.core.p058ui.webview;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct;
import java.util.List;
import p153l.ajk0;
import p153l.lup0;
import p153l.sup0;
import p153l.uik0;

/* JADX INFO: loaded from: classes12.dex */
public class UserStoryAct extends AccessTokenWebViewAct {
    /* JADX INFO: renamed from: a2 */
    public static Intent m59324a2(Context context, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) UserStoryAct.class);
        intent.putExtra("title", str);
        intent.putExtra("url", str2);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct, com.p051p1.mobile.putong.p070ui.webview.WebViewAct
    /* JADX INFO: renamed from: c2 */
    public lup0 mo30698c2() {
        return new uik0(this);
    }

    @Override // com.p051p1.mobile.putong.p070ui.webview.AccessTokenWebViewAct, com.p051p1.mobile.putong.p070ui.webview.WebViewAct
    /* JADX INFO: renamed from: d2 */
    public sup0 mo30699d2() {
        return new ajk0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list) {
        if (list.size() > 0) {
            Media media = list.get(0);
            if (media instanceof Picture) {
                ((uik0) this.f55606c).m196291A0((Picture) media);
            }
        }
    }
}
