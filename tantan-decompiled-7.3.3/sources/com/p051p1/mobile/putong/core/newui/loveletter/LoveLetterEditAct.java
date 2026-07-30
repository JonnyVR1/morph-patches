package com.p051p1.mobile.putong.core.newui.loveletter;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.User;
import io.agora.rtc2.internal.AudioRoutingController;
import p151v.navigationbar.VNavigationBar;
import p153l.adc0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dgq0;
import p153l.i4g0;
import p153l.il50;
import p153l.kec0;
import p153l.kkl0;
import p153l.l4g0;
import p153l.o1j0;
import p153l.psd0;
import p153l.th0;
import p153l.uqb0;
import p153l.w1e;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterEditAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public LoveLetterEditLayout f25122c;

    /* JADX INFO: renamed from: h2 */
    public static Intent m40566h2(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) LoveLetterEditAct.class);
        intent.putExtra("user_id", str);
        return intent;
    }

    /* JADX INFO: renamed from: i2 */
    private void m40567i2() {
        if (Build.VERSION.SDK_INT >= 30) {
            kkl0.m150194y0(act().getWindow().getDecorView(), new il50() { // from class: l.kcw
                @Override // p153l.il50
                public final dgq0 onApplyWindowInsets(View view, dgq0 dgq0Var) {
                    return this.f125107a.m40569l2(view, dgq0Var);
                }
            });
        } else {
            setUpKeyboardDetectorLayout(new View(this), this.f25122c, new z20() { // from class: l.lcw
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f131386a.m40570m2((Boolean) obj, (Integer) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: k2 */
    public /* synthetic */ void m40568k2(View view) {
        this.act.m68056e2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$1(Bundle bundle) {
        setTransparentStatusBar();
        setLightStatusBar(16);
        m40567i2();
        String stringExtra = getIntent().getStringExtra("user_id");
        if (TextUtils.isEmpty(stringExtra)) {
            m68056e2();
            return;
        }
        LoveLetterEntryInfo loveLetterEntryInfoM222761e = CoreModule.f18264c.f20381e0.f89136U1.m222761e();
        String str = loveLetterEntryInfoM222761e == null ? "纸短情长，传递你的心意" : loveLetterEntryInfoM222761e.shadingWord;
        int i = loveLetterEntryInfoM222761e == null ? 10 : loveLetterEntryInfoM222761e.msgLimit;
        bnl0.m105524M(this.f25122c, true);
        this.f25122c.m40589n(this, stringExtra, i, str);
    }

    @Override // com.p051p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(kec0.f126150y6, viewGroup, false);
        VNavigationBar vNavigationBar = (VNavigationBar) viewInflate.findViewById(adc0.f70034N8);
        this.f25122c = (LoveLetterEditLayout) viewInflate.findViewById(adc0.f70449m3);
        vNavigationBar.setBackgroundResource(c9c0.f80383V1);
        vNavigationBar.setLeftIconOnClick(new View.OnClickListener() { // from class: l.jcw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120096a.m40568k2(view);
            }
        });
        bnl0.m105540X(vNavigationBar, bnl0.m105511F0());
        return viewInflate;
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new y20() { // from class: l.icw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114447a.lambda$initSubscription$1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ dgq0 m40569l2(View view, dgq0 dgq0Var) {
        WindowInsets windowInsetsM115695v = dgq0Var.m115695v();
        if (windowInsetsM115695v != null) {
            this.f25122c.m40588m(Boolean.valueOf(windowInsetsM115695v.isVisible(WindowInsets.Type.ime())), Integer.valueOf(windowInsetsM115695v.getInsets(WindowInsets.Type.ime()).bottom));
        }
        return dgq0Var;
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m40570m2(Boolean bool, Integer num) {
        this.f25122c.m40588m(bool, num);
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m40571n2(User user, String str, View view) {
        i4g0.m138520r("e_confirm_send", "p_send_letter_pop");
        m40575r2(user, str);
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m40572o2(User user, Message message) {
        this.act.progressDismiss();
        CoreModule.f18264c.f20381e0.m116554da();
        Intent intentM40550b2 = LoveLetterAct.m40550b2(this.act, user.f56859id, message.f56859id);
        intentM40550b2.setFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        this.act.startActivity(intentM40550b2);
        this.act.m68056e2();
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m40573p2(Message message, Throwable th) {
        this.act.progressDismiss();
        if (!TextUtils.isEmpty(message.f56859id)) {
            CoreModule.f18264c.f20384f0.m33753Of(message.f56859id);
        }
        o1j0.m165651y("发送失败，请稍后再试");
    }

    @Override // com.p051p1.mobile.putong.app.PutongAct, com.p051p1.mobile.android.app.Act, p153l.e6m
    public String pageId() {
        return "p_write_letter";
    }

    /* JADX INFO: renamed from: q2 */
    public void m40574q2(final User user, final String str) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_send_letter_pop", Dialog.class.getName());
        new th0.C20312a(this.act).m191160s("你将使用1次情书传递机会").m191151j("机会仅有一次，用心书写每个字表达你的心意，对方更能感受到你的真诚和用心").m191148g(true).m191147f("返回编辑").m191159r("确认发送").m191144c(new View.OnClickListener() { // from class: l.mcw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                i4g0.m138520r("e_back", "p_send_letter_pop");
            }
        }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.ncw
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m191156o(new View.OnClickListener() { // from class: l.ocw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146742a.m40571n2(user, str, view);
            }
        }).m191142a().m191141g();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: r2 */
    public void m40575r2(final User user, String str) {
        String strTrim = str.trim();
        if (uqb0.f180394Z.m95954K(strTrim) || uqb0.f180394Z.m95956M(strTrim)) {
            o1j0.m165651y("抱歉，您的信息违反了社区规范，请重新编辑");
            return;
        }
        this.act.progress(R$string.f18632L5, true);
        final Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.love_letter);
        messageNew_.value = str;
        duringCreated(CoreModule.f18264c.f20384f0.m33626Dn(user.f56859id, messageNew_, null)).subscribe(psd0.m173597H(new y20() { // from class: l.pcw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f151635a.m40572o2(user, (Message) obj);
            }
        }, new y20() { // from class: l.qcw
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156628a.m40573p2(messageNew_, (Throwable) obj);
            }
        }));
    }
}
