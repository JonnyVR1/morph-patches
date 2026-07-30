package com.p051p1.mobile.putong.core.p058ui.profile.loop.input;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.putong.app.PutongMvpAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.ProfileEditLoopBaseFrag;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p153l.xpa0;
import p153l.zpa0;

/* JADX INFO: loaded from: classes4.dex */
public class ProfileLoopFragAct extends PutongMvpAct<xpa0, zpa0> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m52832Z1(Context context, LoopInputType loopInputType) {
        Intent intent = new Intent(context, (Class<?>) ProfileLoopFragAct.class);
        intent.putExtra("loop_create_tag_info", loopInputType);
        return intent;
    }

    /* JADX INFO: renamed from: a2 */
    public static Intent m52833a2(Context context, LoopInputType loopInputType, String str, String str2) {
        Intent intent = new Intent(context, (Class<?>) ProfileLoopFragAct.class);
        intent.putExtra("loop_create_tag_info", loopInputType);
        intent.putExtra("ext_from_page", str);
        intent.putExtra("ext_value", str2);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public xpa0 mo29671X1() {
        return new xpa0(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public zpa0 mo29672Y1() {
        return new zpa0(this.act);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, p153l.e6m
    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void onPickImagesResult(List<Media> list, int i) {
        for (Media media : list) {
            if (media instanceof Picture) {
                ((Picture) media).status = MediaLocalStatus.get(MediaLocalStatus.preprocessed);
            }
        }
        if (!NullChecker.m82487b(((zpa0) this.f17892d).f205444e) || list.size() <= 0) {
            return;
        }
        ((ProfileEditLoopBaseFrag) ((zpa0) this.f17892d).f205444e).mo52783Y4(list, i);
    }
}
