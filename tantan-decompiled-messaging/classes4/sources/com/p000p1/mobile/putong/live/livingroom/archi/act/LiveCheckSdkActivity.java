package com.p000p1.mobile.putong.live.livingroom.archi.act;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.app.PutongAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import l.d30;
import l.djt;
import l.e30;
import l.ffw;
import l.gkh0;
import l.hgt;
import l.lsi0;
import l.w9j;
import p002l.vet;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveCheckSdkActivity extends PutongAct {

    /* JADX INFO: renamed from: c */
    public Dialog f3745c;

    /* JADX INFO: renamed from: d */
    public String f3746d;

    /* JADX INFO: renamed from: g2 */
    private void m5075g2() {
        Dialog dialog = this.f3745c;
        if (dialog == null || !dialog.isShowing()) {
            ((Act) this).act.finish();
        } else {
            this.f3745c.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e2 */
    public final void m5076e2() {
        final Intent intent = getIntent();
        intent.setClass(this, LiveAct.class);
        final int iN = TextUtils.equals(this.f3746d, "ffmpeg_so_type") ? hgt.Companion.N() : hgt.Companion.S();
        if (djt.u()) {
            startActivity(intent);
            finish();
        } else {
            m5077h2();
            vet.m23928t(iN, this, new d30() { // from class: l.u2s
                public final void call() {
                    this.f20471a.m5078i2(intent);
                }
            }, new e30() { // from class: l.v2s
                public final void call(Object obj) {
                    this.f20934a.m5079k2(iN, (Throwable) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: h2 */
    public final void m5077h2() {
        Dialog dialogProgress = progress(TextUtils.equals(this.f3746d, "ffmpeg_so_type") ? R$string.f2990S2 : R$string.f3307gj, true);
        this.f3745c = dialogProgress;
        dialogProgress.setCancelable(true);
        this.f3745c.setCanceledOnTouchOutside(true);
        this.f3745c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.w2s
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f21429a.m5080l2(dialogInterface);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m5078i2(Intent intent) {
        if (djt.u()) {
            startActivity(intent);
            gkh0.j("[live][sdk_download]", "sdk download  success   start voice act ");
            m5075g2();
        }
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m5079k2(int i, Throwable th) {
        if (!hgt.Companion.M(i)) {
            lsi0.w(R$string.f2806J9);
        }
        gkh0.j("[live][sdk_download]", "sdk download error  : " + th.getMessage());
        m5075g2();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m5080l2(DialogInterface dialogInterface) {
        if (isFinishing()) {
            return;
        }
        finish();
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m5081m2(c cVar) {
        m5076e2();
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m5082n2(Throwable th) {
        if (isFinishing()) {
            return;
        }
        m5075g2();
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m5083o2(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isConnected()) {
            m5075g2();
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m5084p2(Throwable th) {
        m5075g2();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f3746d = getIntent().getStringExtra("download_type");
        duringCreated(lifecycle()).filter(new w9j() { // from class: l.p2s
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.f);
            }
        }).subscribe(ffw.e(new e30() { // from class: l.q2s
            public final void call(Object obj) {
                this.f17769a.m5081m2((c) obj);
            }
        }, new e30() { // from class: l.r2s
            public final void call(Object obj) {
                this.f18333a.m5082n2((Throwable) obj);
            }
        }));
        duringCreated(ConnectivityReceiver.m()).subscribe(ffw.e(new e30() { // from class: l.s2s
            public final void call(Object obj) {
                this.f18767a.m5083o2((NetworkInfo) obj);
            }
        }, new e30() { // from class: l.t2s
            public final void call(Object obj) {
                this.f19404a.m5084p2((Throwable) obj);
            }
        }));
    }
}
