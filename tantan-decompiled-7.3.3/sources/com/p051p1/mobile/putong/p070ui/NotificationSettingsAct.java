package com.p051p1.mobile.putong.p070ui;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.p051p1.mobile.putong.app.PutongAct;
import io.agora.base.internal.voiceengine.earmonitor.HardwareEarMonitorUtils;
import p153l.cbc0;
import p153l.jec0;
import p153l.y20;
import p153l.ycc0;

/* JADX INFO: loaded from: classes10.dex */
public class NotificationSettingsAct extends PutongAct {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        setTitle("开启通知设置");
    }

    /* JADX INFO: renamed from: Y1 */
    public final void m80582Y1(LinearLayout linearLayout, String str, int i) {
        View viewInflate = inflater().inflate(jec0.f120433B, (ViewGroup) linearLayout, false);
        ((TextView) viewInflate.findViewById(ycc0.f198479r0)).setText(str);
        ((ImageView) viewInflate.findViewById(ycc0.f198416G)).setImageResource(i);
        linearLayout.addView(viewInflate);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ScrollView scrollView = new ScrollView(this);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        String str = Build.MANUFACTURER;
        if (str.toLowerCase().equals(HardwareEarMonitorUtils.MANUFACTURER_OPPO)) {
            m80582Y1(linearLayout, "第一步：开启消息通知", cbc0.f80793r0);
            m80582Y1(linearLayout, "第二步：关闭后台冻结，否则锁屏下无法及时收到消息", cbc0.f80795s0);
            m80582Y1(linearLayout, "第三步：开启后台常驻，避免被系统自动删除进程", cbc0.f80797t0);
        } else if (str.toLowerCase().equals(HardwareEarMonitorUtils.MANUFACTURER_VIVO)) {
            m80582Y1(linearLayout, "第一步：开启自启动，否则无法及时收到消息", cbc0.f80807y0);
            m80582Y1(linearLayout, "第二步：开启后台常驻，否免被系统自动删除进程", cbc0.f80809z0);
        }
        scrollView.addView(linearLayout);
        return scrollView;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.d250
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84753a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }
}
