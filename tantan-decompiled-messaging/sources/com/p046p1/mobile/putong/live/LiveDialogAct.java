package com.p046p1.mobile.putong.live;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.act.LivingBaseAct;
import io.agora.rtc2.internal.AudioRoutingController;
import p149l.e30;
import p149l.h1c0;
import p149l.kvc0;
import p149l.mzb0;
import p149l.szd;

/* JADX INFO: loaded from: classes13.dex */
public class LiveDialogAct extends LivingBaseAct {

    /* JADX INFO: renamed from: c */
    public szd f44052c;

    /* JADX INFO: renamed from: d */
    public String f44053d = "";

    /* JADX INFO: renamed from: e */
    public String f44054e = "";

    /* JADX INFO: renamed from: f */
    public boolean f44055f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b2 */
    public /* synthetic */ void m67174b2() {
        this.f44052c.dismiss();
        m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m67175c2() {
        this.f44052c.dismiss();
        m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: e2 */
    public /* synthetic */ void m67176e2(Bundle bundle) {
        if (this.f44055f) {
            this.f44052c = newDialog().m110996y0(this.f44053d).m110991t0(m67179a2(this.f44054e)).m110972a0(R$string.f47423o2, new Runnable() { // from class: l.k6s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f121502a.m67174b2();
                }
            }).m110989r0();
        } else {
            this.f44052c = dialog().m20507G0(this.f44053d).m20504F(this.f44054e).m20556t0(R$string.f47423o2, new Runnable() { // from class: l.l6s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f126659a.m67175c2();
                }
            }).m20568z0();
        }
        this.f44052c.setCanceledOnTouchOutside(false);
        this.f44052c.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.m6s
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f131761a.m67180d2(dialogInterface, i, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: g2 */
    public static void m67177g2(Act act, String str, String str2) {
        Intent intent = new Intent(act, (Class<?>) LiveDialogAct.class);
        intent.putExtra("title_args", str);
        intent.putExtra("content_args", str2);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        act.startActivity(intent);
    }

    /* JADX INFO: renamed from: h2 */
    public static void m67178h2(Act act, String str, String str2, boolean z) {
        Intent intent = new Intent(act, (Class<?>) LiveDialogAct.class);
        intent.putExtra("title_args", str);
        intent.putExtra("content_args", str2);
        intent.putExtra("is_new_ui_args", z);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        act.startActivity(intent);
    }

    /* JADX INFO: renamed from: a2 */
    public final SpannableString m67179a2(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(kvc0.m147352a(h1c0.f105328Q)), 0, str.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ boolean m67180d2(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        dialogInterface.dismiss();
        m66873d2();
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m66873d2() {
        super.m66873d2();
        overridePendingTransition(0, mzb0.f136365a);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.j6s
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f116536a.m67176e2((Bundle) obj);
            }
        });
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f44053d = getIntent().getStringExtra("title_args");
        this.f44054e = getIntent().getStringExtra("content_args");
        this.f44055f = getIntent().getBooleanExtra("is_new_ui_args", false);
    }
}
