package com.p000p1.mobile.putong.feed.newui.photoalbum.commend;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Media;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p007l.a8c0;
import p007l.e1c0;
import p007l.edh;
import p007l.kdh;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedMemePhotoPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public kdh f2937c;

    /* JADX INFO: renamed from: d */
    public edh f2938d;

    /* JADX INFO: renamed from: V1 */
    public static Intent m5112V1(Context context, ArrayList<Media> arrayList) {
        Intent intent = new Intent(context, (Class<?>) FeedMemePhotoPreviewAct.class);
        intent.putExtra("selectedImages", arrayList);
        return intent;
    }

    public void checkGradientColors() {
        if (NullChecker.a(((Act) this).act.toolbar())) {
            ((Act) this).act.toolbar().setBackgroundColor(((Act) this).act.color(e1c0.f7128a));
        }
        Act act = ((Act) this).act;
        act.setStatusBarColor(act.color(e1c0.f7128a));
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return this.f2937c.inflateView(layoutInflater, viewGroup);
    }

    public void initDataOnCreate() {
        this.f2937c = new kdh(this);
        edh edhVar = new edh(this);
        this.f2938d = edhVar;
        edhVar.C(this.f2937c);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f2938d.m9813a0();
    }

    /* JADX WARN: Multi-variable type inference failed */
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
            finish();
        }
    }

    public void setTheme() {
        setTheme(a8c0.f5641j);
    }
}
