package com.p051p1.mobile.putong.feed.newui.photoalbum.commend;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.fgc0;
import p153l.k9c0;
import p153l.teh;
import p153l.zeh;

/* JADX INFO: loaded from: classes13.dex */
public class FeedMemePhotoPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public zeh f42324c;

    /* JADX INFO: renamed from: d */
    public teh f42325d;

    /* JADX INFO: renamed from: X1 */
    public static Intent m65248X1(Context context, ArrayList<Media> arrayList) {
        Intent intent = new Intent(context, (Class<?>) FeedMemePhotoPreviewAct.class);
        intent.putExtra("selectedImages", arrayList);
        return intent;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct
    public void checkGradientColors() {
        if (NullChecker.m82486a(this.act.toolbar())) {
            this.act.toolbar().setBackgroundColor(this.act.color(k9c0.f124495a));
        }
        Act act = this.act;
        act.setStatusBarColor(act.color(k9c0.f124495a));
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f42324c.inflateView(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f42324c = new zeh(this);
        teh tehVar = new teh(this);
        this.f42325d = tehVar;
        tehVar.mo52715C(this.f42324c);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f42325d.mo40473a0();
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
        setTheme(fgc0.f98907j);
    }
}
