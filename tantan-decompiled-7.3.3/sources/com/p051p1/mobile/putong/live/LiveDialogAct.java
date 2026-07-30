package com.p051p1.mobile.putong.live;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.KeyEvent;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.act.LivingBaseAct;
import io.agora.rtc2.internal.AudioRoutingController;
import p153l.g1e;
import p153l.n3d0;
import p153l.n9c0;
import p153l.r7c0;
import p153l.y20;

/* JADX INFO: loaded from: classes13.dex */
public class LiveDialogAct extends LivingBaseAct {

    /* JADX INFO: renamed from: c */
    public g1e f44900c;

    /* JADX INFO: renamed from: d */
    public String f44901d = "";

    /* JADX INFO: renamed from: e */
    public String f44902e = "";

    /* JADX INFO: renamed from: f */
    public boolean f44903f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: c2 */
    public /* synthetic */ void m68357c2() {
        this.f44900c.dismiss();
        m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d2 */
    public /* synthetic */ void m68358d2() {
        this.f44900c.dismiss();
        m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g2 */
    public /* synthetic */ void m68359g2(Bundle bundle) {
        if (this.f44903f) {
            this.f44900c = newDialog().m146056y0(this.f44901d).m146051t0(m68362b2(this.f44902e)).m146032a0(R$string.f48271o2, new Runnable() { // from class: l.l8s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f130511a.m68357c2();
                }
            }).m146049r0();
        } else {
            this.f44900c = dialog().m21506G0(this.f44901d).m21503F(this.f44902e).m21555t0(R$string.f48271o2, new Runnable() { // from class: l.m8s
                @Override // java.lang.Runnable
                public final void run() {
                    this.f135279a.m68358d2();
                }
            }).m21567z0();
        }
        this.f44900c.setCanceledOnTouchOutside(false);
        this.f44900c.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: l.n8s
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                return this.f140710a.m68363e2(dialogInterface, i, keyEvent);
            }
        });
    }

    /* JADX INFO: renamed from: h2 */
    public static void m68360h2(Act act, String str, String str2) {
        Intent intent = new Intent(act, (Class<?>) LiveDialogAct.class);
        intent.putExtra("title_args", str);
        intent.putExtra("content_args", str2);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        act.startActivity(intent);
    }

    /* JADX INFO: renamed from: i2 */
    public static void m68361i2(Act act, String str, String str2, boolean z) {
        Intent intent = new Intent(act, (Class<?>) LiveDialogAct.class);
        intent.putExtra("title_args", str);
        intent.putExtra("content_args", str2);
        intent.putExtra("is_new_ui_args", z);
        intent.addFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        act.startActivity(intent);
    }

    /* JADX INFO: renamed from: b2 */
    public final SpannableString m68362b2(String str) {
        SpannableString spannableString = new SpannableString(str);
        spannableString.setSpan(new ForegroundColorSpan(n3d0.m161277a(n9c0.f140789Q)), 0, str.length(), 33);
        return spannableString;
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ boolean m68363e2(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        dialogInterface.dismiss();
        m68056e2();
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Act, android.app.Activity
    /* JADX INFO: renamed from: finish */
    public void m68056e2() {
        super.m68056e2();
        overridePendingTransition(0, r7c0.f161600a);
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.k8s
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124412a.m68359g2((Bundle) obj);
            }
        });
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void preCreateView(Bundle bundle) {
        super.preCreateView(bundle);
        this.f44901d = getIntent().getStringExtra("title_args");
        this.f44902e = getIntent().getStringExtra("content_args");
        this.f44903f = getIntent().getBooleanExtra("is_new_ui_args", false);
    }
}
