package com.p051p1.mobile.putong.core.p058ui.messages.meme;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.cgc0;
import p153l.g9c0;
import p153l.ut9;
import p153l.wt9;

/* JADX INFO: loaded from: classes3.dex */
public class CoreMemePhotoZoomAct extends PutongMvpAct<ut9, wt9> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m50419Z1(Context context, ArrayList<Media> arrayList) {
        Intent intent = new Intent(context, (Class<?>) CoreMemePhotoZoomAct.class);
        intent.putExtra("selectedImages", arrayList);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public ut9 mo29671X1() {
        return new ut9(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public wt9 mo29672Y1() {
        return new wt9(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        if (NullChecker.m82486a(this.act.toolbar())) {
            this.act.toolbar().setBackgroundColor(this.act.color(g9c0.f102809a));
        }
        Act act = this.act;
        act.setStatusBarColor(act.color(g9c0.f102809a));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_stickers_from_album";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        setTheme(cgc0.f81656l);
    }
}
