package com.p051p1.mobile.putong.core.p058ui.messages.meme;

import android.content.Context;
import android.content.Intent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.PutongCoreMvpAct;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.cgc0;
import p153l.g9c0;
import p153l.ht9;
import p153l.jt9;

/* JADX INFO: loaded from: classes3.dex */
public class CoreMemePhotoPreviewAct extends PutongCoreMvpAct<ht9, jt9> {
    /* JADX INFO: renamed from: a2 */
    public static Intent m50416a2(Context context, ArrayList<Media> arrayList) {
        Intent intent = new Intent(context, (Class<?>) CoreMemePhotoPreviewAct.class);
        intent.putExtra("selectedImages", arrayList);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: b2, reason: merged with bridge method [inline-methods] */
    public ht9 mo30949Y1() {
        return new ht9(this);
    }

    @Override // com.p051p1.mobile.putong.core.PutongCoreMvpAct
    /* JADX INFO: renamed from: c2, reason: merged with bridge method [inline-methods] */
    public jt9 mo30950Z1() {
        return new jt9(this);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        if (NullChecker.m82486a(this.act.toolbar())) {
            this.act.toolbar().setBackgroundColor(this.act.color(g9c0.f102809a));
        }
        Act act = this.act;
        act.setStatusBarColor(act.color(g9c0.f102809a));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
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
            m68056e2();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void setTheme() {
        setTheme(cgc0.f81656l);
    }
}
