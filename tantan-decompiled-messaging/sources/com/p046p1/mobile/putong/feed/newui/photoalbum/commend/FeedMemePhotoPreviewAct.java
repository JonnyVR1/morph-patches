package com.p046p1.mobile.putong.feed.newui.photoalbum.commend;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.a8c0;
import p149l.e1c0;
import p149l.edh;
import p149l.kdh;

/* JADX INFO: loaded from: classes12.dex */
public class FeedMemePhotoPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public kdh f41476c;

    /* JADX INFO: renamed from: d */
    public edh f41477d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m64065V1(Context context, ArrayList<Media> arrayList) {
        Intent intent = new Intent(context, (Class<?>) FeedMemePhotoPreviewAct.class);
        intent.putExtra("selectedImages", arrayList);
        return intent;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        if (NullChecker.m81303a(this.act.toolbar())) {
            this.act.toolbar().setBackgroundColor(this.act.color(e1c0.f88772a));
        }
        Act act = this.act;
        act.setStatusBarColor(act.color(e1c0.f88772a));
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f41476c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f41476c = new kdh(this);
        edh edhVar = new edh(this);
        this.f41477d = edhVar;
        edhVar.mo51532C(this.f41476c);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f41477d.mo39470a0();
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
        setTheme(a8c0.f68021j);
    }
}
