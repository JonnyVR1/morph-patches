package com.p051p1.mobile.putong.feed.newui.photoalbum.commend.preview;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.StickerInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p153l.a8c0;
import p153l.fxg;
import p153l.hxg;
import p153l.jyb;
import p153l.k9c0;
import p153l.uqb0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class FeedCommentPhotoPreviewAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public hxg f42326c;

    /* JADX INFO: renamed from: d */
    public fxg f42327d;

    /* JADX INFO: renamed from: e */
    public StickerInfo f42328e;

    /* JADX INFO: renamed from: f */
    public Picture f42329f;

    /* JADX INFO: renamed from: g */
    public String f42330g;

    /* JADX INFO: renamed from: X1 */
    public static Intent m65249X1(Context context, ArrayList<Media> arrayList, StickerInfo stickerInfo, String str) {
        Intent intent = new Intent(context, (Class<?>) FeedCommentPhotoPreviewAct.class);
        intent.putExtra("selectedImages", arrayList);
        intent.putExtra("stickerInfo", stickerInfo);
        intent.putExtra("momentId", str);
        return intent;
    }

    /* JADX INFO: renamed from: Y1 */
    public void m65250Y1() {
        setSwipeBackEnable(false);
        setStatusBarColor(getResources().getColor(k9c0.f124524o0));
        decorOrSwipingDecorView().setBackgroundColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        dimStatusBar(true);
        if (Build.VERSION.SDK_INT >= 26) {
            getWindow().getDecorView().setSystemUiVisibility(getWindow().getDecorView().getSystemUiVisibility() | 16);
        }
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(a8c0.f68903c, a8c0.f68904d);
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void lambda$debugItems$19() {
        super.lambda$debugItems$19();
        if (hasCustomTransition()) {
            return;
        }
        overridePendingTransition(a8c0.f68901a, a8c0.f68902b);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return setTopViewLayout(this.f42326c.inflateView(layoutInflater, viewGroup));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initDataOnCreate() {
        this.f42326c = new hxg(this);
        fxg fxgVar = new fxg(this);
        this.f42327d = fxgVar;
        fxgVar.mo52715C(this.f42326c);
        super.initDataOnCreate();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.f42327d.mo40473a0();
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
            lambda$debugItems$19();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void onResumeLifecycle() {
        super.onResumeLifecycle();
        this.f42326c.m137606l();
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_comment_picture_preview";
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        m65250Y1();
        Intent intent = getIntent();
        this.f42328e = (StickerInfo) intent.getSerializableExtra("stickerInfo");
        ArrayList arrayList = (ArrayList) intent.getSerializableExtra("selectedImages");
        if (!jyb.m147479J(arrayList)) {
            this.f42329f = (Picture) arrayList.get(0);
        }
        Picture picture = null;
        Picture picture2 = NullChecker.m82486a(this.f42328e) ? this.f42328e.pictures.get(0) : null;
        if (NullChecker.m82486a(this.f42329f)) {
            picture = this.f42329f;
        } else if (NullChecker.m82486a(picture2)) {
            picture = picture2;
        }
        if (NullChecker.m82486a(picture)) {
            uqb0.f180374G.m127160x0(picture.url);
        }
        String stringExtra = intent.getStringExtra("momentId");
        this.f42330g = stringExtra;
        this.pageHelper.m152781p(jyb.m147494Y("moment_id", stringExtra));
        super.preCreateView(bundle);
    }
}
