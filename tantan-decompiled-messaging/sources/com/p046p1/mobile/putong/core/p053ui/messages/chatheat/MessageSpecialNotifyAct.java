package com.p046p1.mobile.putong.core.p053ui.messages.chatheat;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.PutongCoreAct;
import com.p046p1.mobile.putong.core.data.ChatHeat;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p147v.VSwitchButton;
import p147v.VText;
import p149l.e30;
import p149l.l6c0;
import p149l.mkd0;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class MessageSpecialNotifyAct extends PutongCoreAct {

    /* JADX INFO: renamed from: d */
    public View f31774d;

    /* JADX INFO: renamed from: e */
    public VSwitchButton f31775e;

    /* JADX INFO: renamed from: f */
    public String f31776f;

    /* JADX INFO: renamed from: g */
    public VText f31777g;

    /* JADX INFO: renamed from: g2 */
    public static Intent m49081g2(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) MessageSpecialNotifyAct.class);
        intent.putExtra("user_id_arg", str);
        return intent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h2 */
    public /* synthetic */ void m49082h2(View view) {
        zvf0.m220399u("e_special_remind_switch", "p_special_remind_setting", vwb.m200311Y("is_special_remind_on", Boolean.valueOf(!this.f31775e.isChecked())));
        view.setEnabled(false);
        m49087n2(!this.f31775e.isChecked());
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m49083i2(Pair pair) {
        boolean zM81303a = NullChecker.m81303a(pair.first);
        VSwitchButton vSwitchButton = this.f31775e;
        if (zM81303a) {
            vSwitchButton.setChecked(((ChatHeat) pair.first).specialRemind);
        } else {
            vSwitchButton.setChecked(false);
        }
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(l6c0.f126279D2, (ViewGroup) null);
        this.f31774d = viewInflate;
        VText vText = (VText) viewInflate.findViewById(y4c0.f196032Q4);
        this.f31777g = (VText) this.f31774d.findViewById(y4c0.f196183n4);
        vText.getPaint().setFakeBoldText(true);
        this.f31775e = (VSwitchButton) this.f31774d.findViewById(y4c0.f196134g4);
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.gxz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreModule.m29935P().m94651a().mo33556og();
            }
        });
        xdl0.m208329E0(this.f31774d, new View.OnClickListener() { // from class: l.hxz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f110004a.m49082h2(view);
            }
        });
        return this.f31774d;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        setTitle("设置特殊提示");
        String stringExtra = getIntent().getStringExtra("user_id_arg");
        this.f31776f = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            m66873d2();
        } else {
            duringCreated((C22306c) CoreModule.f17545c.f19586M1.m215249s3(this.f31776f).map(new w9j() { // from class: l.ixz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Pair.create((ChatHeat) obj, "");
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.jxz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f120272a.m49083i2((Pair) obj);
                }
            }));
            duringCreated(CoreModule.f17545c.f19639e0.m169410Ka(this.f31776f).map(new w9j() { // from class: l.kxz
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ((User) obj).gender;
                }
            }).distinctUntilChanged()).subscribe(mkd0.m154955G(new e30() { // from class: l.lxz
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f130481a.m49084k2((Gender) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m49084k2(Gender gender) {
        VText vText = this.f31777g;
        StringBuilder sb = new StringBuilder("开启后，");
        sb.append(TEnum.equals(gender, "female") ? "她" : "他");
        sb.append("的聊天消息可以设置特别提示音，同时带有特殊标识");
        vText.setText(sb.toString());
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m49085l2(boolean z, Envelope envelope) {
        this.f31774d.setEnabled(true);
        CoreModule.f17545c.f19586M1.m215245o3(this.f31776f);
        if (z) {
            CoreModule.m29935P().m94651a().mo33556og();
        }
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m49086m2(Throwable th) {
        this.f31774d.setEnabled(true);
    }

    /* JADX INFO: renamed from: n2 */
    public final void m49087n2(final boolean z) {
        duringCreated(CoreModule.f17545c.f19586M1.m215239B3(this.f31776f, z)).subscribe(mkd0.m154956H(new e30() { // from class: l.mxz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f136236a.m49085l2(z, (Envelope) obj);
            }
        }, new e30() { // from class: l.nxz
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f141075a.m49086m2((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_special_remind_setting";
    }
}
