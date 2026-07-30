package com.p046p1.mobile.putong.core.p053ui.messages.meme;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.a1c0;
import p149l.js9;
import p149l.ls9;
import p149l.x7c0;

/* JADX INFO: loaded from: classes3.dex */
public class CoreMemePhotoZoomAct extends PutongMvpAct<js9, ls9> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m49236Y1(Context context, ArrayList<Media> arrayList) {
        Intent intent = new Intent(context, (Class<?>) CoreMemePhotoZoomAct.class);
        intent.putExtra("selectedImages", arrayList);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public js9 mo28672V1() {
        return new js9(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public ls9 mo28673X1() {
        return new ls9(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        if (NullChecker.m81303a(this.act.toolbar())) {
            this.act.toolbar().setBackgroundColor(this.act.color(a1c0.f67145a));
        }
        Act act = this.act;
        act.setStatusBarColor(act.color(a1c0.f67145a));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_stickers_from_album";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        setTheme(x7c0.f191343l);
    }
}
