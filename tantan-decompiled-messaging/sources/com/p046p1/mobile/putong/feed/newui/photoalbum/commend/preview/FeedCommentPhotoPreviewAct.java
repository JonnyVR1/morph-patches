package com.p046p1.mobile.putong.feed.newui.photoalbum.commend.preview;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.StickerInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p149l.e1c0;
import p149l.qib0;
import p149l.qvg;
import p149l.svg;
import p149l.uzb0;
import p149l.vwb;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class FeedCommentPhotoPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public svg f41478c;

    /* JADX INFO: renamed from: d */
    public qvg f41479d;

    /* JADX INFO: renamed from: e */
    public StickerInfo f41480e;

    /* JADX INFO: renamed from: f */
    public Picture f41481f;

    /* JADX INFO: renamed from: g */
    public String f41482g;

    /* JADX INFO: renamed from: V1 */
    public static Intent m64066V1(Context context, ArrayList<Media> arrayList, StickerInfo stickerInfo, String str) {
        Intent intent = new Intent(context, (Class<?>) FeedCommentPhotoPreviewAct.class);
        intent.putExtra("selectedImages", arrayList);
        intent.putExtra("stickerInfo", stickerInfo);
        intent.putExtra("momentId", str);
        return intent;
    }

    /* JADX INFO: renamed from: X1 */
    public void m64067X1() {
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(e1c0.f88801o0));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        dimStatusBar(true);
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 16);
        }
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(uzb0.f178978c, uzb0.f178979d);
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(uzb0.f178976a, uzb0.f178977b);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return setTopViewLayout(this.f41478c.inflateView(layoutInflater, viewGroup));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f41478c = new svg(this);
        qvg qvgVar = new qvg(this);
        this.f41479d = qvgVar;
        qvgVar.mo51532C(this.f41478c);
        super.initDataOnCreate();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f41479d.mo39470a0();
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
            lambda$debugItems$19();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        this.f41478c.m186078l();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_comment_picture_preview";
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        m64067X1();
        Intent intent = getIntent();
        this.f41480e = (StickerInfo) intent.getSerializableExtra("stickerInfo");
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("selectedImages");
        if (!vwb.m200296J(arrayList)) {
            this.f41481f = (Picture) arrayList.get(0);
        }
        Picture picture = null;
        Picture picture2 = NullChecker.m81303a(this.f41480e) ? this.f41480e.pictures.get(0) : null;
        if (NullChecker.m81303a(this.f41481f)) {
            picture = this.f41481f;
        } else if (NullChecker.m81303a(picture2)) {
            picture = picture2;
        }
        if (NullChecker.m81303a(picture)) {
            qib0.f154691G.m102377x0(picture.url);
        }
        String stringExtra = intent.getStringExtra("momentId");
        this.f41482g = stringExtra;
        this.pageHelper.m109040p(vwb.m200311Y("moment_id", stringExtra));
        super.preCreateView(bundle);
    }
}
