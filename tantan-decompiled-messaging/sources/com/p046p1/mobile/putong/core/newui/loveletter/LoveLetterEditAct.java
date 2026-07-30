package com.p046p1.mobile.putong.core.newui.loveletter;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.User;
import io.agora.rtc2.internal.AudioRoutingController;
import p147v.navigationbar.VNavigationBar;
import p149l.bd50;
import p149l.cwf0;
import p149l.e30;
import p149l.f30;
import p149l.f6c0;
import p149l.gbl0;
import p149l.i0e;
import p149l.lsi0;
import p149l.mkd0;
import p149l.qib0;
import p149l.u4c0;
import p149l.w0c0;
import p149l.xdl0;
import p149l.xh0;
import p149l.y6q0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class LoveLetterEditAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public LoveLetterEditLayout f24380c;

    /* JADX INFO: renamed from: g2 */
    public static Intent m39563g2(Act act, String str) {
        Intent intent = new Intent(act, (Class<?>) LoveLetterEditAct.class);
        intent.putExtra("user_id", str);
        return intent;
    }

    /* JADX INFO: renamed from: h2 */
    private void m39564h2() {
        if (Build.VERSION.SDK_INT >= 30) {
            gbl0.m125231y0(act().getWindow().getDecorView(), new bd50() { // from class: l.maw
                @Override // p149l.bd50
                public final y6q0 onApplyWindowInsets(View view, y6q0 y6q0Var) {
                    return this.f132961a.m39566k2(view, y6q0Var);
                }
            });
        } else {
            setUpKeyboardDetectorLayout(new View(this), this.f24380c, new f30() { // from class: l.naw
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f137976a.m39567l2((Boolean) obj, (Integer) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m39565i2(View view) {
        this.act.m66873d2();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initSubscription$1(Bundle bundle) {
        setTransparentStatusBar();
        setLightStatusBar(16);
        m39564h2();
        String stringExtra = getIntent().getStringExtra("user_id");
        if (TextUtils.isEmpty(stringExtra)) {
            m66873d2();
            return;
        }
        LoveLetterEntryInfo loveLetterEntryInfoM221515e = CoreModule.f17545c.f19639e0.f149279U1.m221515e();
        String str = loveLetterEntryInfoM221515e == null ? "纸短情长，传递你的心意" : loveLetterEntryInfoM221515e.shadingWord;
        int i = loveLetterEntryInfoM221515e == null ? 10 : loveLetterEntryInfoM221515e.msgLimit;
        xdl0.m208344M(this.f24380c, true);
        this.f24380c.m39586n(this, stringExtra, i, str);
    }

    @Override // com.p046p1.mobile.android.app.Act
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.f96079x6, viewGroup, false);
        VNavigationBar vNavigationBar = (VNavigationBar) viewInflate.findViewById(u4c0.f173912L8);
        this.f24380c = (LoveLetterEditLayout) viewInflate.findViewById(u4c0.f174324k3);
        vNavigationBar.setBackgroundResource(w0c0.f183811U1);
        vNavigationBar.setLeftIconOnClick(new View.OnClickListener() { // from class: l.law
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127250a.m39565i2(view);
            }
        });
        xdl0.m208360X(vNavigationBar, xdl0.m208331F0());
        return viewInflate;
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act
    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.kaw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122156a.lambda$initSubscription$1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ y6q0 m39566k2(View view, y6q0 y6q0Var) {
        WindowInsets windowInsetsM213194v = y6q0Var.m213194v();
        if (windowInsetsM213194v != null) {
            this.f24380c.m39585m(Boolean.valueOf(windowInsetsM213194v.isVisible(WindowInsets.Type.ime())), Integer.valueOf(windowInsetsM213194v.getInsets(WindowInsets.Type.ime()).bottom));
        }
        return y6q0Var;
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m39567l2(Boolean bool, Integer num) {
        this.f24380c.m39585m(bool, num);
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m39568m2(User user, String str, View view) {
        zvf0.m220396r("e_confirm_send", "p_send_letter_pop");
        m39572q2(user, str);
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m39569n2(User user, Message message) {
        this.act.progressDismiss();
        CoreModule.f17545c.f19639e0.m169481da();
        Intent intentM39547a2 = LoveLetterAct.m39547a2(this.act, user.f56011id, message.f56011id);
        intentM39547a2.setFlags(AudioRoutingController.DEVICE_OUT_USB_HEADSET);
        this.act.startActivity(intentM39547a2);
        this.act.m66873d2();
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m39570o2(Message message, Throwable th) {
        this.act.progressDismiss();
        if (!TextUtils.isEmpty(message.f56011id)) {
            CoreModule.f17545c.f19642f0.m32750Of(message.f56011id);
        }
        lsi0.m151595y("发送失败，请稍后再试");
    }

    /* JADX INFO: renamed from: p2 */
    public void m39571p2(final User user, final String str) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_send_letter_pop", Dialog.class.getName());
        new xh0.C21150a(this.act).m208740s("你将使用1次情书传递机会").m208731j("机会仅有一次，用心书写每个字表达你的心意，对方更能感受到你的真诚和用心").m208728g(true).m208727f("返回编辑").m208739r("确认发送").m208724c(new View.OnClickListener() { // from class: l.oaw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zvf0.m220396r("e_back", "p_send_letter_pop");
            }
        }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.paw
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m208736o(new View.OnClickListener() { // from class: l.qaw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f153578a.m39568m2(user, str, view);
            }
        }).m208722a().m208721g();
        i0e.m133797f(cwf0VarM133794c);
    }

    @Override // com.p046p1.mobile.putong.app.PutongAct, com.p046p1.mobile.android.app.Act, p149l.n3m
    public String pageId() {
        return "p_write_letter";
    }

    /* JADX INFO: renamed from: q2 */
    public void m39572q2(final User user, String str) {
        String strTrim = str.trim();
        if (qib0.f154711Z.m119125K(strTrim) || qib0.f154711Z.m119127M(strTrim)) {
            lsi0.m151595y("抱歉，您的信息违反了社区规范，请重新编辑");
            return;
        }
        this.act.progress(R$string.f17842J5, true);
        final Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.love_letter);
        messageNew_.value = str;
        duringCreated(CoreModule.f17545c.f19642f0.m32623Dn(user.f56011id, messageNew_, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.raw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f158564a.m39569n2(user, (Message) obj);
            }
        }, new e30() { // from class: l.saw
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163457a.m39570o2(messageNew_, (Throwable) obj);
            }
        }));
    }
}
