package com.p000p1.mobile.putong.feed.newui.kankan.recorder;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.k;
import com.p000p1.mobile.putong.feed.newui.kankan.recorder.ComicFaceRecorderActivity;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import l.d30;
import l.e30;
import l.j760;
import l.lsi0;
import l.xck0;
import l.xdl0;
import l.zo40;
import l.zqx;
import p007l.b5c0;
import p007l.oe40;
import p007l.ue5;
import p007l.vb4;
import p007l.yb4;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class ComicFaceRecorderActivity extends PutongAct {

    /* JADX INFO: renamed from: f */
    public static e30<j760<Act, Intent>> f1591f = xck0.a(400, new e30() { // from class: l.qe5
        public final void call(Object obj) {
            j760 j760Var = (j760) obj;
            ((Act) j760Var.a).startActivity((Intent) j760Var.b);
        }
    });

    /* JADX INFO: renamed from: c */
    public FrameLayout f1592c;

    /* JADX INFO: renamed from: d */
    public View f1593d;

    /* JADX INFO: renamed from: e */
    public ComicFaceRecorderFrag f1594e;

    /* JADX INFO: renamed from: c2 */
    public static boolean m3038c2() {
        String[] strArrSplit;
        String strF = RemoteConfig.x().F("comic_face_black_list");
        if (TextUtils.isEmpty(strF) || (strArrSplit = strF.split(",")) == null || strArrSplit.length == 0) {
            return false;
        }
        return !Arrays.asList(strArrSplit).contains(Build.MODEL);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public void m3039d2(Bundle bundle) {
        setTransparentStatusBar();
        setSwipeBackEnable(false);
        ComicFaceRecorderFrag comicFaceRecorderFrag = new ComicFaceRecorderFrag();
        this.f1594e = comicFaceRecorderFrag;
        m3044e2(comicFaceRecorderFrag);
        m3043b2();
        yb4.m17102c().m17114m(null);
    }

    /* JADX INFO: renamed from: g2 */
    public static final void m3040g2(final Act act) {
        final Intent intent = new Intent((Context) act, (Class<?>) ComicFaceRecorderActivity.class);
        PermissionHelper.c().r(zqx.k() ? new String[]{"android.permission.CAMERA"} : new String[]{"android.permission.CAMERA", "android.permission.WRITE_EXTERNAL_STORAGE"}).w(false).u(true).o(new d30() { // from class: l.te5
            public final void call() {
                ComicFaceRecorderActivity.f1591f.call(new j760(act, intent));
            }
        }).i(act);
    }

    /* JADX INFO: renamed from: h2 */
    public static void m3041h2(final Act act) {
        if (Build.VERSION.SDK_INT < 28 || !m3038c2()) {
            lsi0.j("由于机型问题,暂不支持本功能～");
        } else if (vb4.m15410i()) {
            m3040g2(act);
        } else {
            oe40.m12563a0(act, new d30() { // from class: l.se5
                public final void call() {
                    ComicFaceRecorderActivity.m3040g2(act);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a2 */
    public View m3042a2(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ue5.m15089b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: b2 */
    public final void m3043b2() {
        if (zo40.h(this)) {
            xdl0.g0(new View[]{this.f1593d});
        }
    }

    /* JADX INFO: renamed from: e2 */
    public final void m3044e2(PutongFrag putongFrag) {
        k kVarM = getSupportFragmentManager().m();
        kVarM.t(b5c0.f5944A, putongFrag, putongFrag.getClass().getSimpleName());
        kVarM.j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        getWindow().addFlags(128);
        View viewM3042a2 = m3042a2(layoutInflater, viewGroup);
        this.f1593d = viewM3042a2;
        return viewM3042a2;
    }

    public void initSubscription() {
        super.initSubscription();
        ((PutongAct) this).mIfInNewUi1ShouldUseThemNewUI2 = true;
        creates(new e30() { // from class: l.re5
            public final void call(Object obj) {
                this.f12624a.m3039d2((Bundle) obj);
            }
        });
    }

    public void onBackPressed() {
        if (NullChecker.a(this.f1594e)) {
            this.f1594e.m3046o();
        } else {
            finish();
        }
    }

    public String pageId() {
        return "p_camera_video";
    }
}
