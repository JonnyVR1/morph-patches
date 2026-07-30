package com.p051p1.mobile.putong.feed.newui.kankan.recorder;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0428k;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderActivity;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import p153l.bnl0;
import p153l.cn40;
import p153l.dmk0;
import p153l.hdc0;
import p153l.nx40;
import p153l.o1j0;
import p153l.pf60;
import p153l.uc4;
import p153l.uf5;
import p153l.wzx;
import p153l.x20;
import p153l.xc4;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class ComicFaceRecorderActivity extends PutongAct {

    /* JADX INFO: renamed from: f */
    public static y20<pf60<Act, Intent>> f40978f = dmk0.m116962a(400, new y20() { // from class: l.qf5
        @Override // p153l.y20
        public final void call(Object obj) {
            pf60 pf60Var = (pf60) obj;
            ((Act) pf60Var.f152156a).startActivity((Intent) pf60Var.f152157b);
        }
    });

    /* JADX INFO: renamed from: c */
    public FrameLayout f40979c;

    /* JADX INFO: renamed from: d */
    public View f40980d;

    /* JADX INFO: renamed from: e */
    public ComicFaceRecorderFrag f40981e;

    /* JADX INFO: renamed from: d2 */
    public static boolean m63240d2() {
        String[] strArrSplit;
        String strM80485F = RemoteConfig.m80481x().m80485F("comic_face_black_list");
        if (TextUtils.isEmpty(strM80485F) || (strArrSplit = strM80485F.split(Constants.SEPARATOR_COMMA)) == null || strArrSplit.length == 0) {
            return false;
        }
        return !Arrays.asList(strArrSplit).contains(Build.MODEL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public void m63241e2(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        ComicFaceRecorderFrag comicFaceRecorderFrag = new ComicFaceRecorderFrag();
        this.f40981e = comicFaceRecorderFrag;
        m63246g2(comicFaceRecorderFrag);
        m63245c2();
        xc4.m210114c().m210126m(null);
    }

    /* JADX INFO: renamed from: h2 */
    public static final void m63242h2(final Act act) {
        final Intent intent = new Intent(act, (Class<?>) ComicFaceRecorderActivity.class);
        PermissionHelper.m81065c().m81083r(wzx.m208784k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}).m81088w(false).m81086u(true).m81080o(new x20() { // from class: l.tf5
            @Override // p153l.x20
            public final void call() {
                ComicFaceRecorderActivity.f40978f.call(new pf60<>(act, intent));
            }
        }).m81074i(act);
    }

    /* JADX INFO: renamed from: i2 */
    public static void m63243i2(final Act act) {
        if (Build.VERSION.SDK_INT < 28 || !m63240d2()) {
            o1j0.m165636j("由于机型问题,暂不支持本功能～");
        } else if (uc4.m195359i()) {
            m63242h2(act);
        } else {
            cn40.m111376a0(act, new x20() { // from class: l.sf5
                @Override // p153l.x20
                public final void call() {
                    ComicFaceRecorderActivity.m63242h2(act);
                }
            });
        }
    }

    /* JADX INFO: renamed from: b2 */
    public View m63244b2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uf5.m195823b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: c2 */
    public final void m63245c2() {
        if (nx40.m165092h(this)) {
            bnl0.m105556g0(this.f40980d);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final void m63246g2(PutongFrag putongFrag) {
        AbstractC0428k abstractC0428kM2568m = getSupportFragmentManager().m2568m();
        abstractC0428kM2568m.m2813t(hdc0.f108816A, putongFrag, putongFrag.getClass().getSimpleName());
        abstractC0428kM2568m.mo2709j();
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        getWindow().addFlags(128);
        View viewM63244b2 = m63244b2(layoutInflater, viewGroup);
        this.f40980d = viewM63244b2;
        return viewM63244b2;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new y20() { // from class: l.rf5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f162760a.m63241e2((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (NullChecker.m82486a(this.f40981e)) {
            this.f40981e.m63247o();
        } else {
            lambda$debugItems$19();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_camera_video";
    }
}
