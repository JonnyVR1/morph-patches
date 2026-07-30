package com.p051p1.mobile.putong.core.p058ui.messages.chatheat;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.PutongCoreAct;
import com.p051p1.mobile.putong.core.data.ChatHeat;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p151v.VSwitchButton;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.psd0;
import p153l.qcj;
import p153l.qec0;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class MessageSpecialNotifyAct extends PutongCoreAct {

    /* JADX INFO: renamed from: d */
    public View f32622d;

    /* JADX INFO: renamed from: e */
    public VSwitchButton f32623e;

    /* JADX INFO: renamed from: f */
    public String f32624f;

    /* JADX INFO: renamed from: g */
    public VText f32625g;

    /* JADX INFO: renamed from: h2 */
    public static Intent m50264h2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) MessageSpecialNotifyAct.class);
        intent.putExtra("user_id_arg", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m50265i2(View view) {
        i4g0.m138523u("e_special_remind_switch", "p_special_remind_setting", jyb.m147494Y("is_special_remind_on", Boolean.valueOf(!this.f32623e.isChecked())));
        view.setEnabled(false);
        m50270o2(!this.f32623e.isChecked());
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(qec0.f156835D2, (ViewGroup) null);
        this.f32622d = viewInflate;
        VText vText = (VText) viewInflate.findViewById(edc0.f93267Q4);
        this.f32625g = (VText) this.f32622d.findViewById(edc0.f93418n4);
        vText.getPaint().setFakeBoldText(true);
        this.f32623e = (VSwitchButton) this.f32622d.findViewById(edc0.f93369g4);
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.d600
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.m30933P().m143405a().mo34559og();
            }
        });
        bnl0.m105509E0(this.f32622d, new View.OnClickListener() { // from class: l.e600
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92251a.m50265i2(view);
            }
        });
        return this.f32622d;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        setTitle("设置特殊提示");
        String stringExtra = getIntent().getStringExtra("user_id_arg");
        this.f32624f = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            m68056e2();
        } else {
            duringCreated((C22421c) CoreModule.f18264c.f20328M1.m111474s3(this.f32624f).map(new qcj() { // from class: l.f600
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Pair.create((ChatHeat) obj, "");
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.g600
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f102370a.m50266k2((Pair) obj);
                }
            }));
            duringCreated(CoreModule.f18264c.f20381e0.m116483Ka(this.f32624f).map(new qcj() { // from class: l.h600
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ((User) obj).gender;
                }
            }).distinctUntilChanged()).subscribe(psd0.m173596G(new y20() { // from class: l.i600
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f113128a.m50267l2((Gender) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m50266k2(Pair pair) {
        boolean zM82486a = NullChecker.m82486a(pair.first);
        VSwitchButton vSwitchButton = this.f32623e;
        if (zM82486a) {
            vSwitchButton.setChecked(((ChatHeat) pair.first).specialRemind);
        } else {
            vSwitchButton.setChecked(false);
        }
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m50267l2(Gender gender) {
        VText vText = this.f32625g;
        StringBuilder sb = new StringBuilder("开启后，");
        sb.append(TEnum.equals(gender, "female") ? "她" : "他");
        sb.append("的聊天消息可以设置特别提示音，同时带有特殊标识");
        vText.setText(sb.toString());
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m50268m2(boolean z, Envelope envelope) {
        this.f32622d.setEnabled(true);
        CoreModule.f18264c.f20328M1.m111470o3(this.f32624f);
        if (z) {
            CoreModule.m30933P().m143405a().mo34559og();
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m50269n2(Throwable th) {
        this.f32622d.setEnabled(true);
    }

    /* JADX INFO: renamed from: o2 */
    public final void m50270o2(final boolean z) {
        duringCreated(CoreModule.f18264c.f20328M1.m111464B3(this.f32624f, z)).subscribe(psd0.m173597H(new y20() { // from class: l.j600
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118512a.m50268m2(z, (Envelope) obj);
            }
        }, new y20() { // from class: l.k600
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f124149a.m50269n2((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_special_remind_setting";
    }
}
