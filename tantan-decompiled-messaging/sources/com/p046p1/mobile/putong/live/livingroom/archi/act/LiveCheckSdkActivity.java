package com.p046p1.mobile.putong.live.livingroom.archi.act;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.ConnectivityReceiver;
import p149l.d30;
import p149l.djt;
import p149l.e30;
import p149l.ffw;
import p149l.gkh0;
import p149l.hgt;
import p149l.lsi0;
import p149l.vet;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
public class LiveCheckSdkActivity extends PutongAct {

    /* JADX INFO: renamed from: c */
    public Dialog f47703c;

    /* JADX INFO: renamed from: d */
    public String f47704d;

    /* JADX INFO: renamed from: g2 */
    private void m71709g2() {
        Dialog dialog = this.f47703c;
        if (dialog == null || !dialog.isShowing()) {
            this.act.m66873d2();
        } else {
            this.f47703c.dismiss();
        }
    }

    /* JADX INFO: renamed from: e2 */
    public final void m71710e2() {
        final Intent intent = getIntent();
        intent.setClass(this, LiveAct.class);
        final int iM130907N = TextUtils.equals(this.f47704d, "ffmpeg_so_type") ? hgt.INSTANCE.m130907N() : hgt.INSTANCE.m130912S();
        if (djt.m112138u()) {
            startActivity(intent);
            m66873d2();
        } else {
            m71711h2();
            vet.m198236t(iM130907N, this, new d30() { // from class: l.u2s
                @Override // p149l.d30
                public final void call() {
                    this.f173514a.m71712i2(intent);
                }
            }, new e30() { // from class: l.v2s
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f179601a.m71713k2(iM130907N, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final void m71711h2() {
        Dialog dialogProgress = progress(TextUtils.equals(this.f47704d, "ffmpeg_so_type") ? R$string.f46948S2 : R$string.f47265gj, true);
        this.f47703c = dialogProgress;
        dialogProgress.setCancelable(true);
        this.f47703c.setCanceledOnTouchOutside(true);
        this.f47703c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.w2s
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f184283a.m71714l2(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m71712i2(Intent intent) {
        if (djt.m112138u()) {
            startActivity(intent);
            gkh0.m126627j("[live][sdk_download]", "sdk download  success   start voice act ");
            m71709g2();
        }
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m71713k2(int i, Throwable th) {
        if (!hgt.INSTANCE.m130906M(i)) {
            lsi0.m151593w(R$string.f46764J9);
        }
        gkh0.m126627j("[live][sdk_download]", "sdk download error  : " + th.getMessage());
        m71709g2();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m71714l2(DialogInterface dialogInterface) {
        if (isFinishing()) {
            return;
        }
        m66873d2();
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m71715m2(C4319c c4319c) {
        m71710e2();
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m71716n2(Throwable th) {
        if (isFinishing()) {
            return;
        }
        m71709g2();
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m71717o2(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            m71709g2();
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m71718p2(Throwable th) {
        m71709g2();
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f47704d = getIntent().getStringExtra("download_type");
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.p2s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15545f);
            }
        }).subscribe(ffw.m121194e(new e30() { // from class: l.q2s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152302a.m71715m2((C4319c) obj);
            }
        }, new e30() { // from class: l.r2s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f157444a.m71716n2((Throwable) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m81290m()).subscribe(ffw.m121194e(new e30() { // from class: l.s2s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f162001a.m71717o2((NetworkInfo) obj);
            }
        }, new e30() { // from class: l.t2s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f167545a.m71718p2((Throwable) obj);
            }
        }));
    }
}
