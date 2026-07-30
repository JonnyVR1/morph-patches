package com.p000p1.mobile.putong.core.newui.loveletter;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import l.ace;
import l.bd50;
import l.cwf0;
import l.e30;
import l.f30;
import l.f6c0;
import l.gbl0;
import l.jlf0;
import l.lsi0;
import l.m7q0;
import l.mkd0;
import l.o7q0;
import l.qib0;
import l.u4c0;
import l.w0c0;
import l.xdl0;
import l.xh0;
import l.y6q0;
import l.zvf0;
import p009l.i0e;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LoveLetterEditAct extends PutongAct {

    /* JADX INFO: renamed from: c */
    public LoveLetterEditLayout f3158c;

    /* JADX INFO: renamed from: g2 */
    public static Intent m3634g2(Act act, String str) {
        Intent intent = new Intent((Context) act, (Class<?>) LoveLetterEditAct.class);
        intent.putExtra("user_id", str);
        return intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h2 */
    private void m3635h2() {
        if (Build.VERSION.SDK_INT >= 30) {
            gbl0.y0(act().getWindow().getDecorView(), new bd50() { // from class: l.maw
                public final y6q0 onApplyWindowInsets(View view, y6q0 y6q0Var) {
                    return this.f16782a.m3637k2(view, y6q0Var);
                }
            });
        } else {
            setUpKeyboardDetectorLayout(new View(this), this.f3158c, new f30() { // from class: l.naw
                public final void call(Object obj, Object obj2) {
                    this.f17380a.m3638l2((Boolean) obj, (Integer) obj2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i2 */
    public /* synthetic */ void m3636i2(View view) {
        ((Act) this).act.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ void lambda$initSubscription$1(Bundle bundle) {
        setTransparentStatusBar();
        setLightStatusBar(16);
        m3635h2();
        String stringExtra = getIntent().getStringExtra("user_id");
        if (TextUtils.isEmpty(stringExtra)) {
            finish();
            return;
        }
        LoveLetterEntryInfo loveLetterEntryInfo = (LoveLetterEntryInfo) CoreModule.c.e0.U1.e();
        String str = loveLetterEntryInfo == null ? "纸短情长，传递你的心意" : loveLetterEntryInfo.shadingWord;
        int i = loveLetterEntryInfo == null ? 10 : loveLetterEntryInfo.msgLimit;
        xdl0.M(this.f3158c, true);
        this.f3158c.m3657n(this, stringExtra, i, str);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(f6c0.x6, viewGroup, false);
        VNavigationBar vNavigationBarFindViewById = viewInflate.findViewById(u4c0.L8);
        this.f3158c = (LoveLetterEditLayout) viewInflate.findViewById(u4c0.k3);
        vNavigationBarFindViewById.setBackgroundResource(w0c0.U1);
        vNavigationBarFindViewById.setLeftIconOnClick(new View.OnClickListener() { // from class: l.law
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16038a.m3636i2(view);
            }
        });
        xdl0.X(vNavigationBarFindViewById, xdl0.F0());
        return viewInflate;
    }

    public void initSubscription() {
        super.initSubscription();
        creates(new e30() { // from class: l.kaw
            public final void call(Object obj) {
                this.f15569a.lambda$initSubscription$1((Bundle) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ y6q0 m3637k2(View view, y6q0 y6q0Var) {
        WindowInsets windowInsetsV = y6q0Var.v();
        if (windowInsetsV != null) {
            this.f3158c.m3656m(Boolean.valueOf(o7q0.a(windowInsetsV, jlf0.a())), Integer.valueOf(ace.a(m7q0.a(windowInsetsV, jlf0.a()))));
        }
        return y6q0Var;
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m3638l2(Boolean bool, Integer num) {
        this.f3158c.m3656m(bool, num);
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m3639m2(User user, String str, View view) {
        zvf0.r("e_confirm_send", "p_send_letter_pop");
        m3643q2(user, str);
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m3640n2(User user, Message message) {
        ((Act) this).act.progressDismiss();
        CoreModule.c.e0.da();
        Intent intentM3616a2 = LoveLetterAct.m3616a2(((Act) this).act, ((DbObject) user).id, ((DbObject) message).id);
        intentM3616a2.setFlags(67108864);
        ((Act) this).act.startActivity(intentM3616a2);
        ((Act) this).act.finish();
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m3641o2(Message message, Throwable th) {
        ((Act) this).act.progressDismiss();
        if (!TextUtils.isEmpty(((DbObject) message).id)) {
            CoreModule.c.f0.Of(((DbObject) message).id);
        }
        lsi0.y("发送失败，请稍后再试");
    }

    /* JADX INFO: renamed from: p2 */
    public void m3642p2(final User user, final String str) {
        final cwf0 cwf0VarM16062c = i0e.m16062c("p_send_letter_pop", Dialog.class.getName());
        new xh0.a(((Act) this).act).s("你将使用1次情书传递机会").j("机会仅有一次，用心书写每个字表达你的心意，对方更能感受到你的真诚和用心").g(true).f("返回编辑").r("确认发送").c(new View.OnClickListener() { // from class: l.oaw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                zvf0.r("e_back", "p_send_letter_pop");
            }
        }).m(new DialogInterface.OnDismissListener() { // from class: l.paw
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m16064e(cwf0VarM16062c);
            }
        }).o(new View.OnClickListener() { // from class: l.qaw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f19121a.m3639m2(user, str, view);
            }
        }).a().g();
        i0e.m16065f(cwf0VarM16062c);
    }

    public String pageId() {
        return "p_write_letter";
    }

    /* JADX INFO: renamed from: q2 */
    public void m3643q2(final User user, String str) {
        String strTrim = str.trim();
        if (qib0.Z.K(strTrim) || qib0.Z.M(strTrim)) {
            lsi0.y("抱歉，您的信息违反了社区规范，请重新编辑");
            return;
        }
        ((Act) this).act.progress(R.string.J5, true);
        final Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("love_letter");
        messageNew_.value = str;
        duringCreated(CoreModule.c.f0.Dn(((DbObject) user).id, messageNew_, (Sticker) null)).subscribe(mkd0.H(new e30() { // from class: l.raw
            public final void call(Object obj) {
                this.f19713a.m3640n2(user, (Message) obj);
            }
        }, new e30() { // from class: l.saw
            public final void call(Object obj) {
                this.f20148a.m3641o2(messageNew_, (Throwable) obj);
            }
        }));
    }
}
