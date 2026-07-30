package com.p046p1.mobile.putong.core.p053ui.messages.meme;

import android.content.Context;
import android.content.Intent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.PutongCoreMvpAct;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.a1c0;
import p149l.wr9;
import p149l.x7c0;
import p149l.yr9;

/* JADX INFO: loaded from: classes3.dex */
public class CoreMemePhotoPreviewAct extends PutongCoreMvpAct<wr9, yr9> {
    /* JADX INFO: renamed from: Z1 */
    public static Intent m49233Z1(Context context, ArrayList<Media> arrayList) {
        Intent intent = new Intent(context, (Class<?>) CoreMemePhotoPreviewAct.class);
        intent.putExtra("selectedImages", arrayList);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: a2, reason: merged with bridge method [inline-methods] */
    public wr9 mo29951X1() {
        return new wr9(this);
    }

    @Override // com.p046p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public yr9 mo29952Y1() {
        return new yr9(this);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        if (NullChecker.m81303a(this.act.toolbar())) {
            this.act.toolbar().setBackgroundColor(this.act.color(a1c0.f67145a));
        }
        Act act = this.act;
        act.setStatusBarColor(act.color(a1c0.f67145a));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 292) {
            if (i2 != -1) {
                super.onActivityResult(i, i2, intent);
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
            m66873d2();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void setTheme() {
        setTheme(x7c0.f191343l);
    }
}
