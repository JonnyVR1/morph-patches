package com.p000p1.mobile.putong.core.p001ui.messages.chatheat;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.PutongCoreAct;
import com.p1.mobile.putong.core.data.ChatHeat;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.j760;
import l.l6c0;
import l.mkd0;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p003l.e30;
import p003l.m250;
import p003l.w9j;
import p028v.VSwitchButton;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MessageSpecialNotifyAct extends PutongCoreAct {

    /* JADX INFO: renamed from: d */
    public View f1665d;

    /* JADX INFO: renamed from: e */
    public VSwitchButton f1666e;

    /* JADX INFO: renamed from: f */
    public String f1667f;

    /* JADX INFO: renamed from: g */
    public VText f1668g;

    /* JADX INFO: renamed from: g2 */
    public static Intent m2179g2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) MessageSpecialNotifyAct.class);
        intent.putExtra("user_id_arg", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m2180h2(View view) {
        zvf0.u("e_special_remind_switch", "p_special_remind_setting", new j760[]{vwb.Y("is_special_remind_on", Boolean.valueOf(!this.f1666e.isChecked()))});
        view.setEnabled(false);
        m2185n2(!this.f1666e.isChecked());
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m2181i2(Pair pair) {
        boolean zA = NullChecker.a(pair.first);
        VSwitchButton vSwitchButton = this.f1666e;
        if (zA) {
            vSwitchButton.setChecked(((ChatHeat) pair.first).specialRemind);
        } else {
            vSwitchButton.setChecked(false);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.D2, (ViewGroup) null);
        this.f1665d = viewInflate;
        AppCompatTextView appCompatTextView = (VText) viewInflate.findViewById(y4c0.Q4);
        this.f1668g = (VText) this.f1665d.findViewById(y4c0.n4);
        appCompatTextView.getPaint().setFakeBoldText(true);
        this.f1666e = (VSwitchButton) this.f1665d.findViewById(y4c0.g4);
        xdl0.E0(appCompatTextView, new View.OnClickListener() { // from class: l.gxz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.P().a().og();
            }
        });
        xdl0.E0(this.f1665d, new View.OnClickListener() { // from class: l.hxz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4302a.m2180h2(view);
            }
        });
        return this.f1665d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void initSubscription() {
        super/*com.p1.mobile.putong.app.PutongAct*/.initSubscription();
        setTitle("设置特殊提示");
        String stringExtra = getIntent().getStringExtra("user_id_arg");
        this.f1667f = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
        } else {
            duringCreated(CoreModule.c.M1.s3(this.f1667f).map(new w9j() { // from class: l.ixz
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Pair.create((ChatHeat) obj, "");
                }
            })).subscribe((m250) mkd0.G(new e30() { // from class: l.jxz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f4762a.m2181i2((Pair) obj);
                }
            }));
            duringCreated(CoreModule.c.e0.Ka(this.f1667f).map(new w9j() { // from class: l.kxz
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).gender;
                }
            }).distinctUntilChanged()).subscribe((m250) mkd0.G(new e30() { // from class: l.lxz
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f5478a.m2182k2((Gender) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m2182k2(Gender gender) {
        AppCompatTextView appCompatTextView = this.f1668g;
        StringBuilder sb = new StringBuilder("开启后，");
        sb.append(TEnum.equals(gender, "female") ? "她" : "他");
        sb.append("的聊天消息可以设置特别提示音，同时带有特殊标识");
        appCompatTextView.setText(sb.toString());
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m2183l2(boolean z, Envelope envelope) {
        this.f1665d.setEnabled(true);
        CoreModule.c.M1.o3(this.f1667f);
        if (z) {
            CoreModule.P().a().og();
        }
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m2184m2(Throwable th) {
        this.f1665d.setEnabled(true);
    }

    /* JADX INFO: renamed from: n2 */
    public final void m2185n2(final boolean z) {
        duringCreated(CoreModule.c.M1.B3(this.f1667f, z)).subscribe((m250) mkd0.H(new e30() { // from class: l.mxz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5807a.m2183l2(z, (Envelope) obj);
            }
        }, new e30() { // from class: l.nxz
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5997a.m2184m2((Throwable) obj);
            }
        }));
    }

    public String pageId() {
        return "p_special_remind_setting";
    }
}
