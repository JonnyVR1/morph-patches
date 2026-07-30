package com.p000p1.mobile.putong.p004ui;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import com.p1.mobile.putong.app.PutongAct;
import l.e30;
import l.e6c0;
import l.s4c0;
import l.w2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NotificationSettingsAct extends PutongAct {
    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$0(Bundle bundle) {
        setTitle("开启通知设置");
    }

    /* JADX INFO: renamed from: X1 */
    public final void m9720X1(LinearLayout linearLayout, String str, int i) {
        View viewInflate = inflater().inflate(e6c0.B, (ViewGroup) linearLayout, false);
        ((TextView) viewInflate.findViewById(s4c0.r0)).setText(str);
        ((ImageView) viewInflate.findViewById(s4c0.G)).setImageResource(i);
        linearLayout.addView(viewInflate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ScrollView scrollView = new ScrollView(this);
        LinearLayout linearLayout = new LinearLayout(this);
        linearLayout.setOrientation(1);
        String str = Build.MANUFACTURER;
        if (str.toLowerCase().equals("oppo")) {
            m9720X1(linearLayout, "第一步：开启消息通知", w2c0.r0);
            m9720X1(linearLayout, "第二步：关闭后台冻结，否则锁屏下无法及时收到消息", w2c0.s0);
            m9720X1(linearLayout, "第三步：开启后台常驻，避免被系统自动删除进程", w2c0.t0);
        } else if (str.toLowerCase().equals("vivo")) {
            m9720X1(linearLayout, "第一步：开启自启动，否则无法及时收到消息", w2c0.y0);
            m9720X1(linearLayout, "第二步：开启后台常驻，否免被系统自动删除进程", w2c0.z0);
        }
        scrollView.addView(linearLayout);
        return scrollView;
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.ot40
            public final void call(Object obj) {
                this.f18240a.lambda$initSubscription$0((Bundle) obj);
            }
        });
    }
}
