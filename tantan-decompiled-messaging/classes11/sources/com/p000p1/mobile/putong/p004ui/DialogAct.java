package com.p000p1.mobile.putong.p004ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.p000p1.mobile.putong.miniwidget.MiniWidgetProvider;
import com.p000p1.mobile.putong.p004ui.DialogAct;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.data.User;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import java.io.Serializable;
import l.e51;
import l.e6c0;
import l.qib0;
import l.s4c0;
import l.tpd0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class DialogAct extends AppCompatActivity {

    /* JADX INFO: renamed from: f */
    public static final tpd0 f7877f = new tpd0("oppo_notification_dialog2", 0);

    /* JADX INFO: renamed from: c */
    public int f7878c;

    /* JADX INFO: renamed from: d */
    public Serializable f7879d;

    /* JADX INFO: renamed from: e */
    public boolean f7880e = false;

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m9692H0(Activity activity) {
        f7877f.put(3);
        activity.finish();
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m9696L0(Activity activity) {
        f7877f.put(3);
        activity.startActivity(new Intent(activity, (Class<?>) NotificationSettingsAct.class));
        activity.finish();
    }

    /* JADX INFO: renamed from: O0 */
    public static Intent m9698O0(Context context, int i, Serializable serializable) {
        Intent intent = new Intent(context, (Class<?>) DialogAct.class);
        intent.addFlags(268435456);
        intent.putExtra(MiniWidgetProvider.KEY_TYPE, i);
        intent.putExtra(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, serializable);
        return intent;
    }

    /* JADX INFO: renamed from: P0 */
    public static Intent m9699P0(Context context, int i, Serializable serializable, boolean z) {
        Intent intentM9698O0 = m9698O0(context, i, serializable);
        intentM9698O0.putExtra("is_anonymous", z);
        return intentM9698O0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m9700V0(DialogInterface dialogInterface) {
        e51.H(this, new Runnable() { // from class: l.nzd
            @Override // java.lang.Runnable
            public final void run() {
                this.f17780a.m9706U0();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: X0 */
    public static Dialog.e m9701X0(final Activity activity) {
        tpd0 tpd0Var = f7877f;
        tpd0Var.put(Integer.valueOf(((Integer) tpd0Var.get()).intValue() + 1));
        return new Dialog.e(activity).G0("开启设置以及时收到消息").F("您的手机系统默认设置可能导致无法及时收到对方消息，请开启相关设置。").v().v0("查看开启方法", new Runnable() { // from class: l.ozd
            @Override // java.lang.Runnable
            public final void run() {
                DialogAct.m9696L0(activity);
            }
        }).n0("不再提醒", new Runnable() { // from class: l.pzd
            @Override // java.lang.Runnable
            public final void run() {
                DialogAct.m9692H0(activity);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q0 */
    public final View m9702Q0(User user) {
        View viewInflate = getLayoutInflater().inflate(e6c0.x, (ViewGroup) null, false);
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(s4c0.b0);
        if (this.f7880e) {
            qib0.G.L0(vDraweeViewFindViewById, user.getAnonymousUrl());
        } else {
            qib0.G.Q0(vDraweeViewFindViewById, user.fp().profileSmall());
        }
        viewInflate.findViewById(s4c0.t).setText(App.e.getString(R.string.V1) + "\n\n" + App.e.getString(R.string.W1));
        return viewInflate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R0 */
    public final Dialog.e m9703R0(int i) {
        if (i == 1) {
            return new Dialog.e(this).F((String) this.f7879d).B(false).t0(R.string.f, new Runnable() { // from class: l.lzd
                @Override // java.lang.Runnable
                public final void run() {
                    this.f16462a.m9704S0();
                }
            });
        }
        if (i != 2) {
            return i != 3 ? new Dialog.e(this) : m9701X0(this);
        }
        return new Dialog.e(this).t0(R.string.U1, new Runnable() { // from class: l.mzd
            @Override // java.lang.Runnable
            public final void run() {
                this.f17162a.m9705T0();
            }
        }).B(true).O(m9702Q0(this.f7879d)).t().u();
    }

    /* JADX INFO: renamed from: W0 */
    public final /* synthetic */ void m9707W0() {
        m9703R0(this.f7878c).A(new DialogInterface.OnCancelListener() { // from class: l.kzd
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f15888a.m9700V0(dialogInterface);
            }
        }).z0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m9706U0() {
        super/*android.app.Activity*/.finish();
        overridePendingTransition(0, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(new View(this));
        this.f7878c = getIntent().getIntExtra(MiniWidgetProvider.KEY_TYPE, 1);
        if (getIntent().hasExtra(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA)) {
            this.f7879d = getIntent().getSerializableExtra(WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA);
        }
        if (getIntent().hasExtra("is_anonymous")) {
            this.f7880e = getIntent().getBooleanExtra("is_anonymous", false);
        }
        e51.H(this, new Runnable() { // from class: l.izd
            @Override // java.lang.Runnable
            public final void run() {
                this.f14874a.m9707W0();
            }
        }, 50L);
    }
}
