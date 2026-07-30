package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemTantanVerifyToast;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.a1c0;
import p149l.bpz;
import p149l.c3c0;
import p149l.dqy;
import p149l.eqh0;
import p149l.guy;
import p149l.i0g0;
import p149l.jjb0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.qsz;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemTantanVerifyToast extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f31515a;

    public ItemTantanVerifyToast(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m48713a(String str, View view) {
        if (str.contains("不想错过最新回复")) {
            zvf0.m220396r("e_miss_open_tips", OMSDialogPositon.p_chat_view);
        } else {
            zvf0.m220396r("e_offline_open_tips", OMSDialogPositon.p_chat_view);
        }
        CoreModule.m29935P().m94658i().mo158305T();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m48716d(View view) {
        zvf0.m220396r("e_offline_open_notification", OMSDialogPositon.p_chat_view);
        CoreModule.m29935P().m94658i().mo158305T();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m48718f(View view) {
        if (getContext() instanceof MessagesAct) {
            ((MessagesAct) getContext()).mo48974l().m120850v6("messages_friend_comment_toast");
        }
        o6j0.m162859c("e_impression_update", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m48719g(View view) {
        if (!ItemMessageBase.m48312Y(getContext()) && (getContext() instanceof MessagesAct)) {
            guy guyVarM156457g0 = ((MessagesAct) getContext()).mo48954A0().m156457g0();
            dqy dqyVarM128212u0 = guyVarM156457g0.m128212u0();
            if (!NullChecker.m81303a(dqyVarM128212u0) || dqyVarM128212u0.m113220d0()) {
                return;
            }
            guyVarM156457g0.m128175a2();
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m48720h(View view) {
        zvf0.m220396r("e_toast_chat_page_verification_guide", OMSDialogPositon.p_chat_view);
        getContext().startActivity(CoreModule.m29935P().m94651a().mo33486dn(getContext(), false, "im"));
    }

    /* JADX INFO: renamed from: i */
    public void m48721i(Message message, qsz qszVar) {
        final String str;
        if (TextUtils.equals(message.msgData, String.valueOf(TantanException.Client.TantanForbidden.MESSAGE_SENSITIVE_VERIFY_CODE))) {
            this.f31515a.setGravity(1);
            if (NullChecker.m81303a(qszVar) && !qszVar.m176377a("e_wechat_notice")) {
                qszVar.m176378b("e_wechat_notice");
                zvf0.m220368A("e_wechat_notice", OMSDialogPositon.p_chat_view, vwb.m200311Y("receiver_user_id", message.cid));
            }
        }
        this.f31515a.setBackgroundColor(0);
        this.f31515a.setTextColor(getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67155i : a1c0.f67126H));
        if ((((MessagesAct) getContext()).f31640f.m120842t7() instanceof bpz) && ((bpz) ((MessagesAct) getContext()).f31640f.m120842t7()).f76692M1) {
            this.f31515a.setBackground(getResources().getDrawable(c3c0.f78625R4));
            this.f31515a.setTextColor(getResources().getColor(a1c0.f67146a0));
        }
        if (TEnum.equals(message.messageType(), "local_friend_comment_toast")) {
            this.f31515a.setText(i0g0.m133861b0("更新了好友印象，立即查看", vwb.m200324f0("立即查看"), getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67122D), eqh0.m117752c(3)));
            xdl0.m208329E0(this.f31515a, new View.OnClickListener() { // from class: l.yeq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f197715a.m48718f(view);
                }
            });
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_real_shot_tips)) {
            String string = getContext().getResources().getString(R$string.f20841Q4);
            String string2 = getContext().getResources().getString(R$string.f20825O4, string);
            if ("2".equals(message.value)) {
                string2 = getContext().getResources().getString(R$string.f20833P4, string);
            }
            this.f31515a.setText(i0g0.m133861b0(string2, vwb.m200299M(string), getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67122D), eqh0.m117752c(3)));
            xdl0.m208342L(this.f31515a, new View.OnClickListener() { // from class: l.zeq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f202856a.m48719g(view);
                }
            });
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_normal_tips)) {
            this.f31515a.setGravity(1);
            this.f31515a.setText(message.value);
            return;
        }
        if (!TEnum.equals(message.messageType, MessageType.local_push_switch)) {
            if (!TEnum.equals(message.messageType, MessageType.local_push_switch_plus)) {
                String string3 = jjb0.m141784b() ? "头像认证" : getContext().getResources().getString(R$string.f20965f3);
                this.f31515a.setText(i0g0.m133861b0(getContext().getResources().getString(R$string.f20974g3, string3), vwb.m200299M(string3), getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67122D), eqh0.m117752c(3)));
                xdl0.m208329E0(this.f31515a, new View.OnClickListener() { // from class: l.cfq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f80649a.m48720h(view);
                    }
                });
                return;
            }
            User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(message.getHostId());
            if (NullChecker.m81303a(userM169430Pa)) {
                if (NullChecker.m81303a(qszVar) && !qszVar.m176377a(MessageType.local_push_switch_plus)) {
                    qszVar.m176378b(MessageType.local_push_switch_plus);
                    zvf0.m220402x("e_offline_open_notification", OMSDialogPositon.p_chat_view);
                }
                this.f31515a.setText(i0g0.m133861b0(String.format("开启通知后及时接收%s的消息", userM169430Pa.isFemale() ? "她" : "他"), vwb.m200299M("开启通知"), getResources().getColor(a1c0.f67122D), eqh0.m117752c(3)));
                xdl0.m208329E0(this.f31515a, new View.OnClickListener() { // from class: l.bfq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ItemTantanVerifyToast.m48716d(view);
                    }
                });
                return;
            }
            return;
        }
        User userM169430Pa2 = CoreModule.f17545c.f19639e0.m169430Pa(message.getHostId());
        long jM155944o = mqi0.m155944o();
        if (NullChecker.m81303a(userM169430Pa2) && NullChecker.m81303a(userM169430Pa2.location)) {
            if (NullChecker.m81303a(qszVar) && !qszVar.m176377a(MessageType.local_push_switch)) {
                qszVar.m176378b(MessageType.local_push_switch);
                if (jM155944o - userM169430Pa2.location.updatedTime < 300000.0d) {
                    zvf0.m220402x("e_miss_open_tips", OMSDialogPositon.p_chat_view);
                } else {
                    zvf0.m220402x("e_offline_open_tips", OMSDialogPositon.p_chat_view);
                }
            }
            if (jM155944o - userM169430Pa2.location.updatedTime < 300000.0d) {
                str = "不想错过最新回复？点击开启提醒";
            } else {
                str = String.format("%s不在线，点击开启提醒上线后及时通知你", userM169430Pa2.isFemale() ? "她" : "他");
            }
            this.f31515a.setText(i0g0.m133861b0(str, vwb.m200299M("点击开启提醒"), getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67122D), eqh0.m117752c(3)));
            xdl0.m208329E0(this.f31515a, new View.OnClickListener() { // from class: l.afq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemTantanVerifyToast.m48713a(str, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31515a = (VText) findViewById(y4c0.f196260y4);
    }

    public ItemTantanVerifyToast(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemTantanVerifyToast(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
