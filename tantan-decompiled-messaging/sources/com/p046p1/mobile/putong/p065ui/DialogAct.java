package com.p046p1.mobile.putong.p065ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.common.R$string;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.DialogAct;
import java.io.Serializable;
import p147v.VDraweeView;
import p147v.VText;
import p149l.e51;
import p149l.e6c0;
import p149l.qib0;
import p149l.s4c0;
import p149l.tpd0;

/* JADX INFO: loaded from: classes11.dex */
public class DialogAct extends AppCompatActivity {

    /* JADX INFO: renamed from: f */
    public static final tpd0 f54271f = new tpd0("oppo_notification_dialog2", 0);

    /* JADX INFO: renamed from: c */
    public int f54272c;

    /* JADX INFO: renamed from: d */
    public Serializable f54273d;

    /* JADX INFO: renamed from: e */
    public boolean f54274e = false;

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m79371H0(Activity activity) {
        f54271f.put(3);
        activity.finish();
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m79375L0(Activity activity) {
        f54271f.put(3);
        activity.startActivity(new Intent(activity, (Class<?>) NotificationSettingsAct.class));
        activity.finish();
    }

    /* JADX INFO: renamed from: O0 */
    public static Intent m79377O0(Context context, int i, Serializable serializable) {
        Intent intent = new Intent(context, (Class<?>) DialogAct.class);
        intent.addFlags(268435456);
        intent.putExtra("type", i);
        intent.putExtra("data", serializable);
        return intent;
    }

    /* JADX INFO: renamed from: P0 */
    public static Intent m79378P0(Context context, int i, Serializable serializable, boolean z) {
        Intent intentM79377O0 = m79377O0(context, i, serializable);
        intentM79377O0.putExtra("is_anonymous", z);
        return intentM79377O0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m79379V0(DialogInterface dialogInterface) {
        e51.m114743H(this, new Runnable() { // from class: l.nzd
            @Override // java.lang.Runnable
            public final void run() {
                this.f141202a.m79385U0();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: X0 */
    public static Dialog.C4309e m79380X0(final Activity activity) {
        tpd0 tpd0Var = f54271f;
        tpd0Var.put(Integer.valueOf(tpd0Var.get().intValue() + 1));
        return new Dialog.C4309e(activity).m20507G0("开启设置以及时收到消息").m20504F("您的手机系统默认设置可能导致无法及时收到对方消息，请开启相关设置。").m20559v().m20560v0("查看开启方法", new Runnable() { // from class: l.ozd
            @Override // java.lang.Runnable
            public final void run() {
                DialogAct.m79375L0(activity);
            }
        }).m20544n0("不再提醒", new Runnable() { // from class: l.pzd
            @Override // java.lang.Runnable
            public final void run() {
                DialogAct.m79371H0(activity);
            }
        });
    }

    /* JADX INFO: renamed from: Q0 */
    public final View m79381Q0(User user) {
        View viewInflate = getLayoutInflater().inflate(e6c0.f89565x, (ViewGroup) null, false);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(s4c0.f162326b0);
        if (this.f54274e) {
            qib0.f154691G.m102331L0(vDraweeView, user.getAnonymousUrl());
        } else {
            qib0.f154691G.m102341Q0(vDraweeView, user.m60124fp().profileSmall());
        }
        ((VText) viewInflate.findViewById(s4c0.f162361t)).setText(App.f15369e.getString(R$string.f17387V1) + "\n\n" + App.f15369e.getString(R$string.f17391W1));
        return viewInflate;
    }

    /* JADX INFO: renamed from: R0 */
    public final Dialog.C4309e m79382R0(int i) {
        if (i == 1) {
            return new Dialog.C4309e(this).m20504F((String) this.f54273d).m20496B(false).m20556t0(R$string.f17430f, new Runnable() { // from class: l.lzd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f130647a.m79383S0();
                }
            });
        }
        if (i != 2) {
            return i != 3 ? new Dialog.C4309e(this) : m79380X0(this);
        }
        return new Dialog.C4309e(this).m20556t0(R$string.f17383U1, new Runnable() { // from class: l.mzd
            @Override // java.lang.Runnable
            public final void run() {
                this.f136369a.m79384T0();
            }
        }).m20496B(true).m20519O(m79381Q0((User) this.f54273d)).m20555t().m20557u();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m79386W0() {
        m79382R0(this.f54272c).m20494A(new DialogInterface.OnCancelListener() { // from class: l.kzd
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f125369a.m79379V0(dialogInterface);
            }
        }).m20568z0();
    }

    @Override // android.app.Activity
    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m79385U0() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(new View(this));
        this.f54272c = getIntent().getIntExtra("type", 1);
        if (getIntent().hasExtra("data")) {
            this.f54273d = getIntent().getSerializableExtra("data");
        }
        if (getIntent().hasExtra("is_anonymous")) {
            this.f54274e = getIntent().getBooleanExtra("is_anonymous", false);
        }
        e51.m114743H(this, new Runnable() { // from class: l.izd
            @Override // java.lang.Runnable
            public final void run() {
                this.f115554a.m79386W0();
            }
        }, 50L);
    }
}
