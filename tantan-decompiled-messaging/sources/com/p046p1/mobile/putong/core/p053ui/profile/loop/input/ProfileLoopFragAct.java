package com.p046p1.mobile.putong.core.p053ui.profile.loop.input;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.putong.app.PutongMvpAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p149l.tha0;
import p149l.vha0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopFragAct extends PutongMvpAct<tha0, vha0> {
    /* JADX INFO: renamed from: Y1 */
    public static Intent m51649Y1(Context context, LoopInputType loopInputType) {
        Intent intent = new Intent(context, (Class<?>) ProfileLoopFragAct.class);
        intent.putExtra("loop_create_tag_info", loopInputType);
        return intent;
    }

    /* JADX INFO: renamed from: Z1 */
    public static Intent m51650Z1(Context context, LoopInputType loopInputType, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) ProfileLoopFragAct.class);
        intent.putExtra("loop_create_tag_info", loopInputType);
        intent.putExtra("ext_from_page", str);
        intent.putExtra("ext_value", str2);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public tha0 mo28672V1() {
        return new tha0(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public vha0 mo28673X1() {
        return new vha0(this.act);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, p149l.n3m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list, int i) {
        for (Media media : list) {
            if (media instanceof Picture) {
                ((Picture) media).status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            }
        }
        if (!NullChecker.m81304b(((vha0) this.f17173d).f181482e) || list.size() <= 0) {
            return;
        }
        ((ProfileEditLoopBaseFrag) ((vha0) this.f17173d).f181482e).mo51600Y4(list, i);
    }
}
