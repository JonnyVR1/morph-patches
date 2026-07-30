package com.p000p1.mobile.putong.feed.newui.photoalbum.commend.preview;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.StickerInfo;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.j760;
import l.qib0;
import l.vwb;
import p007l.e1c0;
import p007l.qvg;
import p007l.svg;
import p007l.uzb0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class FeedCommentPhotoPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public svg f2939c;

    /* JADX INFO: renamed from: d */
    public qvg f2940d;

    /* JADX INFO: renamed from: e */
    public StickerInfo f2941e;

    /* JADX INFO: renamed from: f */
    public Picture f2942f;

    /* JADX INFO: renamed from: g */
    public String f2943g;

    /* JADX INFO: renamed from: V1 */
    public static Intent m5113V1(Context context, ArrayList<Media> arrayList, StickerInfo stickerInfo, String str) {
        Intent intent = new Intent(context, (Class<?>) FeedCommentPhotoPreviewAct.class);
        intent.putExtra("selectedImages", arrayList);
        intent.putExtra("stickerInfo", stickerInfo);
        intent.putExtra("momentId", str);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X1 */
    public void m5114X1() {
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(e1c0.f7157o0));
        decorOrSwipingDecorView().setBackgroundColor(-16777216);
        dimStatusBar(true);
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 16);
        }
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(uzb0.f13989c, uzb0.f13990d);
    }

    public void finish() {
        super/*com.p1.mobile.android.app.Act*/.finish();
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(uzb0.f13987a, uzb0.f13988b);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return setTopViewLayout(this.f2939c.inflateView(layoutInflater, viewGroup));
    }

    public void initDataOnCreate() {
        this.f2939c = new svg(this);
        qvg qvgVar = new qvg(this);
        this.f2940d = qvgVar;
        qvgVar.C(this.f2939c);
        super.initDataOnCreate();
    }

    public void initSubscription() {
        super.initSubscription();
        this.f2940d.m13737a0();
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

    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        this.f2939c.m14331l();
    }

    public String pageId() {
        return "p_comment_picture_preview";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        m5114X1();
        Intent intent = getIntent();
        this.f2941e = (StickerInfo) intent.getSerializableExtra("stickerInfo");
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("selectedImages");
        if (!vwb.J(arrayList)) {
            this.f2942f = (Picture) arrayList.get(0);
        }
        Picture picture = null;
        Picture picture2 = NullChecker.a(this.f2941e) ? this.f2941e.pictures.get(0) : null;
        if (NullChecker.a(this.f2942f)) {
            picture = this.f2942f;
        } else if (NullChecker.a(picture2)) {
            picture = picture2;
        }
        if (NullChecker.a(picture)) {
            qib0.G.x0(picture.url);
        }
        String stringExtra = intent.getStringExtra("momentId");
        this.f2943g = stringExtra;
        ((PutongAct) this).pageHelper.p(new j760[]{vwb.Y("moment_id", stringExtra)});
        super.preCreateView(bundle);
    }
}
