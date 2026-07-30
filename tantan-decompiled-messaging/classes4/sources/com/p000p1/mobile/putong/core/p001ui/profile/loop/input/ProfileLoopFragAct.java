package com.p000p1.mobile.putong.core.p001ui.profile.loop.input;

import android.content.Context;
import android.content.Intent;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongMvpAct;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import p002l.tha0;
import p002l.vha0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ProfileLoopFragAct extends PutongMvpAct<tha0, vha0> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m2146Y1(Context context, LoopInputType loopInputType) {
        Intent intent = new Intent(context, (Class<?>) ProfileLoopFragAct.class);
        intent.putExtra("loop_create_tag_info", loopInputType);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m2147Z1(Context context, LoopInputType loopInputType, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) ProfileLoopFragAct.class);
        intent.putExtra("loop_create_tag_info", loopInputType);
        intent.putExtra("ext_from_page", str);
        intent.putExtra("ext_value", str2);
        return intent;
    }

    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public tha0 m2148V1() {
        return new tha0(this);
    }

    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public vha0 m2149X1() {
        return new vha0(((Act) this).act);
    }

    public boolean disableAutoPV() {
        return true;
    }

    public void onPickImagesResult(List<Media> list, int i) {
        Iterator<Media> it = list.iterator();
        while (it.hasNext()) {
            Picture picture = (Media) it.next();
            if (picture instanceof Picture) {
                ((Media) picture).status = MediaLocalStatus.get("preprocessed");
            }
        }
        if (!NullChecker.b(((vha0) ((PutongMvpAct) this).d).f21130e) || list.size() <= 0) {
            return;
        }
        ((vha0) ((PutongMvpAct) this).d).f21130e.mo2086Y4(list, i);
    }
}
