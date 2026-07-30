package com.p000p1.mobile.putong.core.p001ui.messages.meme;

import android.content.Context;
import android.content.Intent;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.PutongCoreMvpAct;
import com.p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.a1c0;
import l.x7c0;
import p003l.wr9;
import p003l.yr9;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class CoreMemePhotoPreviewAct extends PutongCoreMvpAct<wr9, yr9> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m2352Z1(Context context, ArrayList<Media> arrayList) {
        Intent intent = new Intent(context, (Class<?>) CoreMemePhotoPreviewAct.class);
        intent.putExtra("selectedImages", arrayList);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public wr9 m2353X1() {
        return new wr9(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public yr9 m2354Y1() {
        return new yr9(this);
    }

    public void checkGradientColors() {
        if (NullChecker.a(((Act) this).act.toolbar())) {
            ((Act) this).act.toolbar().setBackgroundColor(((Act) this).act.color(a1c0.a));
        }
        Act act = ((Act) this).act;
        act.setStatusBarColor(act.color(a1c0.a));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 292) {
            if (i2 != -1) {
                super/*com.p1.mobile.putong.app.PutongAct*/.onActivityResult(i, i2, intent);
                return;
            }
            ArrayList arrayList = (ArrayList) act().getIntent().getSerializableExtra("selectedImages");
            if (arrayList.size() > 0) {
                Intent intent2 = new Intent();
                intent2.putExtra("selectedImages", arrayList);
                intent2.putExtra("isDone", true);
                setResult(-1, intent2);
            } else {
                setResult(0);
            }
            finish();
        }
    }

    public void setTheme() {
        setTheme(x7c0.l);
    }
}
