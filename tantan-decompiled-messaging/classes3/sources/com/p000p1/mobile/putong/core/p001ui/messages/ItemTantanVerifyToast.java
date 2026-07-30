package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.messages.ItemTantanVerifyToast;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.c3c0;
import l.i0g0;
import l.j760;
import l.jjb0;
import l.mqi0;
import l.o6j0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p003l.bpz;
import p003l.dqy;
import p003l.eqh0;
import p003l.guy;
import p003l.qsz;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemTantanVerifyToast extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f1406a;

    public ItemTantanVerifyToast(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m1797a(String str, View view) {
        if (str.contains("不想错过最新回复")) {
            zvf0.r("e_miss_open_tips", "p_chat_view");
        } else {
            zvf0.r("e_offline_open_tips", "p_chat_view");
        }
        CoreModule.P().i().T();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m1800d(View view) {
        zvf0.r("e_offline_open_notification", "p_chat_view");
        CoreModule.P().i().T();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m1802f(View view) {
        if (getContext() instanceof MessagesAct) {
            ((MessagesAct) getContext()).mo2066l().m4317v6("messages_friend_comment_toast");
        }
        o6j0.c("e_impression_update", "p_chat_view", new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m1803g(View view) {
        if (!ItemMessageBase.m1396Y(getContext()) && (getContext() instanceof MessagesAct)) {
            guy guyVarM6499g0 = ((MessagesAct) getContext()).mo2046A0().m6499g0();
            dqy dqyVarM4846u0 = guyVarM6499g0.m4846u0();
            if (!NullChecker.a(dqyVarM4846u0) || dqyVarM4846u0.m3703d0()) {
                return;
            }
            guyVarM6499g0.m4808a2();
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m1804h(View view) {
        zvf0.r("e_toast_chat_page_verification_guide", "p_chat_view");
        getContext().startActivity(CoreModule.P().a().dn(getContext(), false, "im"));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: i */
    public void m1805i(Message message, qsz qszVar) {
        final String str;
        if (TextUtils.equals(message.msgData, String.valueOf(40339))) {
            this.f1406a.setGravity(1);
            if (NullChecker.a(qszVar) && !qszVar.m7030a("e_wechat_notice")) {
                qszVar.m7031b("e_wechat_notice");
                zvf0.A("e_wechat_notice", "p_chat_view", new j760[]{vwb.Y("receiver_user_id", message.cid)});
            }
        }
        this.f1406a.setBackgroundColor(0);
        this.f1406a.setTextColor(getResources().getColor(ura.e().d().I4() ? a1c0.i : a1c0.H));
        if ((((MessagesAct) getContext()).f1531f.m4309t7() instanceof bpz) && ((bpz) ((MessagesAct) getContext()).f1531f.m4309t7()).f2427M1) {
            this.f1406a.setBackground(getResources().getDrawable(c3c0.R4));
            this.f1406a.setTextColor(getResources().getColor(a1c0.a0));
        }
        if (TEnum.equals(message.messageType(), "local_friend_comment_toast")) {
            this.f1406a.setText(i0g0.b0("更新了好友印象，立即查看", vwb.f0(new String[]{"立即查看"}), getResources().getColor(ura.e().d().I4() ? a1c0.j : a1c0.D), eqh0.m3924c(3)));
            xdl0.E0(this.f1406a, new View.OnClickListener() { // from class: l.yeq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9064a.m1802f(view);
                }
            });
            return;
        }
        if (TEnum.equals(message.messageType, "local_real_shot_tips")) {
            String string = getContext().getResources().getString(R.string.Q4);
            String string2 = getContext().getResources().getString(R.string.O4, string);
            if ("2".equals(message.value)) {
                string2 = getContext().getResources().getString(R.string.P4, string);
            }
            this.f1406a.setText(i0g0.b0(string2, vwb.M(string), getResources().getColor(ura.e().d().I4() ? a1c0.j : a1c0.D), eqh0.m3924c(3)));
            xdl0.L(this.f1406a, new View.OnClickListener() { // from class: l.zeq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9329a.m1803g(view);
                }
            });
            return;
        }
        if (TEnum.equals(message.messageType, "local_normal_tips")) {
            this.f1406a.setGravity(1);
            this.f1406a.setText(message.value);
            return;
        }
        if (!TEnum.equals(message.messageType, "local_push_switch")) {
            if (!TEnum.equals(message.messageType, "local_push_switch_plus")) {
                String string3 = jjb0.b() ? "头像认证" : getContext().getResources().getString(R.string.f3);
                this.f1406a.setText(i0g0.b0(getContext().getResources().getString(R.string.g3, string3), vwb.M(string3), getResources().getColor(ura.e().d().I4() ? a1c0.j : a1c0.D), eqh0.m3924c(3)));
                xdl0.E0(this.f1406a, new View.OnClickListener() { // from class: l.cfq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f2640a.m1804h(view);
                    }
                });
                return;
            }
            User userPa = CoreModule.c.e0.Pa(message.getHostId());
            if (NullChecker.a(userPa)) {
                if (NullChecker.a(qszVar) && !qszVar.m7030a("local_push_switch_plus")) {
                    qszVar.m7031b("local_push_switch_plus");
                    zvf0.x("e_offline_open_notification", "p_chat_view");
                }
                this.f1406a.setText(i0g0.b0(String.format("开启通知后及时接收%s的消息", userPa.isFemale() ? "她" : "他"), vwb.M("开启通知"), getResources().getColor(a1c0.D), eqh0.m3924c(3)));
                xdl0.E0(this.f1406a, new View.OnClickListener() { // from class: l.bfq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ItemTantanVerifyToast.m1800d(view);
                    }
                });
                return;
            }
            return;
        }
        User userPa2 = CoreModule.c.e0.Pa(message.getHostId());
        long jO = mqi0.o();
        if (NullChecker.a(userPa2) && NullChecker.a(userPa2.location)) {
            if (NullChecker.a(qszVar) && !qszVar.m7030a("local_push_switch")) {
                qszVar.m7031b("local_push_switch");
                if (jO - userPa2.location.updatedTime < 300000.0d) {
                    zvf0.x("e_miss_open_tips", "p_chat_view");
                } else {
                    zvf0.x("e_offline_open_tips", "p_chat_view");
                }
            }
            if (jO - userPa2.location.updatedTime < 300000.0d) {
                str = "不想错过最新回复？点击开启提醒";
            } else {
                str = String.format("%s不在线，点击开启提醒上线后及时通知你", userPa2.isFemale() ? "她" : "他");
            }
            this.f1406a.setText(i0g0.b0(str, vwb.M("点击开启提醒"), getResources().getColor(ura.e().d().I4() ? a1c0.j : a1c0.D), eqh0.m3924c(3)));
            xdl0.E0(this.f1406a, new View.OnClickListener() { // from class: l.afq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemTantanVerifyToast.m1797a(str, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1406a = (VText) findViewById(y4c0.y4);
    }

    public ItemTantanVerifyToast(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemTantanVerifyToast(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
