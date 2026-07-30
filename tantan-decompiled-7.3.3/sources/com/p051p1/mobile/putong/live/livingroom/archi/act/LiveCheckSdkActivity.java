package com.p051p1.mobile.putong.live.livingroom.archi.act;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.tantanapp.common.utils.ConnectivityReceiver;
import p153l.dhw;
import p153l.elt;
import p153l.iit;
import p153l.nsh0;
import p153l.o1j0;
import p153l.qcj;
import p153l.wgt;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class LiveCheckSdkActivity extends PutongAct {

    /* JADX INFO: renamed from: c */
    public Dialog f48551c;

    /* JADX INFO: renamed from: d */
    public String f48552d;

    /* JADX INFO: renamed from: h2 */
    private void m72892h2() {
        Dialog dialog = this.f48551c;
        if (dialog == null || !dialog.isShowing()) {
            this.act.m68056e2();
        } else {
            this.f48551c.dismiss();
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final void m72893g2() {
        final Intent intent = getIntent();
        intent.setClass(this, LiveAct.class);
        final int iM140128N = TextUtils.equals(this.f48552d, "ffmpeg_so_type") ? iit.INSTANCE.m140128N() : iit.INSTANCE.m140133S();
        if (elt.m121283u()) {
            startActivity(intent);
            m68056e2();
        } else {
            m72894i2();
            wgt.m206253t(iM140128N, this, new x20() { // from class: l.v4s
                @Override // p153l.x20
                public final void call() {
                    this.f182421a.m72895k2(intent);
                }
            }, new y20() { // from class: l.w4s
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f187432a.m72896l2(iM140128N, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final void m72894i2() {
        Dialog dialogProgress = progress(TextUtils.equals(this.f48552d, "ffmpeg_so_type") ? R$string.f47796S2 : R$string.f48113gj, true);
        this.f48551c = dialogProgress;
        dialogProgress.setCancelable(true);
        this.f48551c.setCanceledOnTouchOutside(true);
        this.f48551c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.x4s
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f192430a.m72897m2(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m72895k2(Intent intent) {
        if (elt.m121283u()) {
            startActivity(intent);
            nsh0.m164608j("[live][sdk_download]", "sdk download  success   start voice act ");
            m72892h2();
        }
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m72896l2(int i, Throwable th) {
        if (!iit.INSTANCE.m140127M(i)) {
            o1j0.m165649w(R$string.f47612J9);
        }
        nsh0.m164608j("[live][sdk_download]", "sdk download error  : " + th.getMessage());
        m72892h2();
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m72897m2(DialogInterface dialogInterface) {
        if (isFinishing()) {
            return;
        }
        m68056e2();
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m72898n2(C4470c c4470c) {
        m72893g2();
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m72899o2(Throwable th) {
        if (isFinishing()) {
            return;
        }
        m72892h2();
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m72900p2(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            m72892h2();
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f48552d = getIntent().getStringExtra("download_type");
        duringCreated(lifecycle()).filter(new qcj() { // from class: l.q4s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16264f);
            }
        }).subscribe(dhw.m115826e(new y20() { // from class: l.r4s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f161240a.m72898n2((C4470c) obj);
            }
        }, new y20() { // from class: l.s4s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f166271a.m72899o2((Throwable) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m82473m()).subscribe(dhw.m115826e(new y20() { // from class: l.t4s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f172099a.m72900p2((NetworkInfo) obj);
            }
        }, new y20() { // from class: l.u4s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177485a.m72901q2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m72901q2(Throwable th) {
        m72892h2();
    }
}
