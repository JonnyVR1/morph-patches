package com.p046p1.mobile.putong.feed.newui.kankan.recorder;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.AbstractC0427k;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderActivity;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import p149l.b5c0;
import p149l.d30;
import p149l.e30;
import p149l.j760;
import p149l.lsi0;
import p149l.oe40;
import p149l.ue5;
import p149l.vb4;
import p149l.xck0;
import p149l.xdl0;
import p149l.yb4;
import p149l.zo40;
import p149l.zqx;

/* JADX INFO: loaded from: classes12.dex */
public class ComicFaceRecorderActivity extends PutongAct {

    /* JADX INFO: renamed from: f */
    public static e30<j760<Act, Intent>> f40130f = xck0.m208120a(400, new e30() { // from class: l.qe5
        @Override // p149l.e30
        public final void call(Object obj) {
            j760 j760Var = (j760) obj;
            ((Act) j760Var.f116564a).startActivity((Intent) j760Var.f116565b);
        }
    });

    /* JADX INFO: renamed from: c */
    public FrameLayout f40131c;

    /* JADX INFO: renamed from: d */
    public View f40132d;

    /* JADX INFO: renamed from: e */
    public ComicFaceRecorderFrag f40133e;

    /* JADX INFO: renamed from: c2 */
    public static boolean m62057c2() {
        String[] strArrSplit;
        String strM79302F = RemoteConfig.m79298x().m79302F("comic_face_black_list");
        if (TextUtils.isEmpty(strM79302F) || (strArrSplit = strM79302F.split(Constants.SEPARATOR_COMMA)) == null || strArrSplit.length == 0) {
            return false;
        }
        return !Arrays.asList(strArrSplit).contains(Build.MODEL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public void m62058d2(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        ComicFaceRecorderFrag comicFaceRecorderFrag = new ComicFaceRecorderFrag();
        this.f40133e = comicFaceRecorderFrag;
        m62063e2(comicFaceRecorderFrag);
        m62062b2();
        yb4.m213936c().m213948m(null);
    }

    /* JADX INFO: renamed from: g2 */
    public static final void m62059g2(final Act act) {
        final Intent intent = new Intent(act, (Class<?>) ComicFaceRecorderActivity.class);
        PermissionHelper.m79882c().m79900r(zqx.m219898k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}).m79905w(false).m79903u(true).m79897o(new d30() { // from class: l.te5
            @Override // p149l.d30
            public final void call() {
                ComicFaceRecorderActivity.f40130f.call(new j760<>(act, intent));
            }
        }).m79891i(act);
    }

    /* JADX INFO: renamed from: h2 */
    public static void m62060h2(final Act act) {
        if (Build.VERSION.SDK_INT < 28 || !m62057c2()) {
            lsi0.m151580j("由于机型问题,暂不支持本功能～");
        } else if (vb4.m197675i()) {
            m62059g2(act);
        } else {
            oe40.m163826a0(act, new d30() { // from class: l.se5
                @Override // p149l.d30
                public final void call() {
                    ComicFaceRecorderActivity.m62059g2(act);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a2 */
    public View m62061a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ue5.m193220b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b2 */
    public final void m62062b2() {
        if (zo40.m219551h(this)) {
            xdl0.m208376g0(this.f40132d);
        }
    }

    /* JADX INFO: renamed from: e2 */
    public final void m62063e2(PutongFrag putongFrag) {
        AbstractC0427k abstractC0427kM2567m = getSupportFragmentManager().m2567m();
        abstractC0427kM2567m.m2812t(b5c0.f73463A, putongFrag, putongFrag.getClass().getSimpleName());
        abstractC0427kM2567m.mo2708j();
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        getWindow().addFlags(128);
        View viewM62061a2 = m62061a2(layoutInflater, viewGroup);
        this.f40132d = viewM62061a2;
        return viewM62061a2;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        this.mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new e30() { // from class: l.re5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159032a.m62058d2((Bundle) obj);
            }
        });
    }

    @Override // androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        if (NullChecker.m81303a(this.f40133e)) {
            this.f40133e.m62064o();
        } else {
            lambda$debugItems$19();
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_camera_video";
    }
}
