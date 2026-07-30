package com.p051p1.mobile.putong.p070ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatActivity;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.common.R$string;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.DialogAct;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.io.Serializable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.jec0;
import p153l.l51;
import p153l.uqb0;
import p153l.vxd0;
import p153l.ycc0;

/* JADX INFO: loaded from: classes10.dex */
public class DialogAct extends AppCompatActivity {

    /* JADX INFO: renamed from: f */
    public static final vxd0 f55119f = new vxd0("oppo_notification_dialog2", 0);

    /* JADX INFO: renamed from: c */
    public int f55120c;

    /* JADX INFO: renamed from: d */
    public Serializable f55121d;

    /* JADX INFO: renamed from: e */
    public boolean f55122e = false;

    /* JADX INFO: renamed from: I0 */
    public static /* synthetic */ void m80554I0(Activity activity) {
        f55119f.put(3);
        activity.finish();
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m80558N0(Activity activity) {
        f55119f.put(3);
        activity.startActivity(new Intent(activity, (Class<?>) NotificationSettingsAct.class));
        activity.finish();
    }

    /* JADX INFO: renamed from: P0 */
    public static Intent m80560P0(Context context, int i, Serializable serializable) {
        Intent intent = new Intent(context, (Class<?>) DialogAct.class);
        intent.addFlags(SQLiteDatabase.CREATE_IF_NECESSARY);
        intent.putExtra("type", i);
        intent.putExtra("data", serializable);
        return intent;
    }

    /* JADX INFO: renamed from: Q0 */
    public static Intent m80561Q0(Context context, int i, Serializable serializable, boolean z) {
        Intent intentM80560P0 = m80560P0(context, i, serializable);
        intentM80560P0.putExtra("is_anonymous", z);
        return intentM80560P0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m80562W0(DialogInterface dialogInterface) {
        l51.m152888H(this, new Runnable() { // from class: l.b1e
            @Override // java.lang.Runnable
            public final void run() {
                this.f74367a.m80568V0();
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: Y0 */
    public static Dialog.C4460e m80563Y0(final Activity activity) {
        vxd0 vxd0Var = f55119f;
        vxd0Var.put(Integer.valueOf(vxd0Var.get().intValue() + 1));
        return new Dialog.C4460e(activity).m21506G0("开启设置以及时收到消息").m21503F("您的手机系统默认设置可能导致无法及时收到对方消息，请开启相关设置。").m21558v().m21559v0("查看开启方法", new Runnable() { // from class: l.c1e
            @Override // java.lang.Runnable
            public final void run() {
                DialogAct.m80558N0(activity);
            }
        }).m21543n0("不再提醒", new Runnable() { // from class: l.d1e
            @Override // java.lang.Runnable
            public final void run() {
                DialogAct.m80554I0(activity);
            }
        });
    }

    /* JADX INFO: renamed from: R0 */
    public final View m80564R0(User user) {
        View viewInflate = getLayoutInflater().inflate(jec0.f120478x, (ViewGroup) null, false);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(ycc0.f198447b0);
        if (this.f55122e) {
            uqb0.f180374G.m127115L0(vDraweeView, user.getAnonymousUrl());
        } else {
            uqb0.f180374G.m127125Q0(vDraweeView, user.m61308fp().profileSmall());
        }
        ((VText) viewInflate.findViewById(ycc0.f198482t)).setText(App.f16088e.getString(R$string.f18106V1) + "\n\n" + App.f16088e.getString(R$string.f18110W1));
        return viewInflate;
    }

    /* JADX INFO: renamed from: S0 */
    public final Dialog.C4460e m80565S0(int i) {
        if (i == 1) {
            return new Dialog.C4460e(this).m21503F((String) this.f55121d).m21495B(false).m21555t0(R$string.f18149f, new Runnable() { // from class: l.z0e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f202299a.m80566T0();
                }
            });
        }
        if (i != 2) {
            return i != 3 ? new Dialog.C4460e(this) : m80563Y0(this);
        }
        return new Dialog.C4460e(this).m21555t0(R$string.f18102U1, new Runnable() { // from class: l.a1e
            @Override // java.lang.Runnable
            public final void run() {
                this.f67807a.m80567U0();
            }
        }).m21495B(true).m21518O(m80564R0((User) this.f55121d)).m21554t().m21556u();
    }

    /* JADX INFO: renamed from: X0 */
    public final /* synthetic */ void m80569X0() {
        m80565S0(this.f55120c).m21493A(new DialogInterface.OnCancelListener() { // from class: l.y0e
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f196960a.m80562W0(dialogInterface);
            }
        }).m21567z0();
    }

    @Override // android.app.Activity
    /* JADX INFO: renamed from: finish, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void m80568V0() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(new View(this));
        this.f55120c = getIntent().getIntExtra("type", 1);
        if (getIntent().hasExtra("data")) {
            this.f55121d = getIntent().getSerializableExtra("data");
        }
        if (getIntent().hasExtra("is_anonymous")) {
            this.f55122e = getIntent().getBooleanExtra("is_anonymous", false);
        }
        l51.m152888H(this, new Runnable() { // from class: l.w0e
            @Override // java.lang.Runnable
            public final void run() {
                this.f186560a.m80569X0();
            }
        }, 50L);
    }
}
