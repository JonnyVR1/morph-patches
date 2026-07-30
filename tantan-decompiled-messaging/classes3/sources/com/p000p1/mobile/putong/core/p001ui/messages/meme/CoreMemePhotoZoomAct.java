package com.p000p1.mobile.putong.core.p001ui.messages.meme;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.a1c0;
import l.x7c0;
import p003l.js9;
import p003l.ls9;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CoreMemePhotoZoomAct extends PutongMvpAct<js9, ls9> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m2357Y1(Context context, ArrayList<Media> arrayList) {
        Intent intent = new Intent(context, (Class<?>) CoreMemePhotoZoomAct.class);
        intent.putExtra("selectedImages", arrayList);
        return intent;
    }

    /* JADX INFO: renamed from: Z1, reason: merged with bridge method [inline-methods] */
    public js9 m2358V1() {
        return new js9(this);
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public ls9 m2359X1() {
        return new ls9(this);
    }

    public void checkGradientColors() {
        if (NullChecker.a(((Act) this).act.toolbar())) {
            ((Act) this).act.toolbar().setBackgroundColor(((Act) this).act.color(a1c0.a));
        }
        Act act = ((Act) this).act;
        act.setStatusBarColor(act.color(a1c0.a));
    }

    public String pageId() {
        return "p_stickers_from_album";
    }

    public void setTheme() {
        setTheme(x7c0.l);
    }
}
