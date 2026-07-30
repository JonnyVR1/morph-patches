package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemTantanVerifyToast;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.azy;
import p153l.bnl0;
import p153l.d3z;
import p153l.edc0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.lyh0;
import p153l.n100;
import p153l.nrb0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.sfj0;
import p153l.yxz;

/* JADX INFO: loaded from: classes3.dex */
public class ItemTantanVerifyToast extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VText f32363a;

    public ItemTantanVerifyToast(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49896a(String str, View view) {
        if (str.contains("不想错过最新回复")) {
            i4g0.m138520r("e_miss_open_tips", OMSDialogPositon.p_chat_view);
        } else {
            i4g0.m138520r("e_offline_open_tips", OMSDialogPositon.p_chat_view);
        }
        CoreModule.m30933P().m143412i().mo180397T();
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m49899d(View view) {
        i4g0.m138520r("e_offline_open_notification", OMSDialogPositon.p_chat_view);
        CoreModule.m30933P().m143412i().mo180397T();
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m49901f(View view) {
        if (getContext() instanceof MessagesAct) {
            ((MessagesAct) getContext()).mo50158l().m111056v6("messages_friend_comment_toast");
        }
        sfj0.m185596c("e_impression_update", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m49902g(View view) {
        if (!ItemMessageBase.m49495Y(getContext()) && (getContext() instanceof MessagesAct)) {
            d3z d3zVarM143374g0 = ((MessagesAct) getContext()).mo50138B0().m143374g0();
            azy azyVarM114043u0 = d3zVarM143374g0.m114043u0();
            if (!NullChecker.m82486a(azyVarM114043u0) || azyVarM114043u0.m101199d0()) {
                return;
            }
            d3zVarM143374g0.m114004a2();
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m49903h(View view) {
        i4g0.m138520r("e_toast_chat_page_verification_guide", OMSDialogPositon.p_chat_view);
        getContext().startActivity(CoreModule.m30933P().m143405a().mo34489dn(getContext(), false, "im"));
    }

    /* JADX INFO: renamed from: i */
    public void m49904i(Message message, n100 n100Var) {
        final String str;
        if (TextUtils.equals(message.msgData, String.valueOf(TantanException.Client.TantanForbidden.MESSAGE_SENSITIVE_VERIFY_CODE))) {
            this.f32363a.setGravity(1);
            if (NullChecker.m82486a(n100Var) && !n100Var.m161054a("e_wechat_notice")) {
                n100Var.m161055b("e_wechat_notice");
                i4g0.m138492A("e_wechat_notice", OMSDialogPositon.p_chat_view, jyb.m147494Y("receiver_user_id", message.cid));
            }
        }
        this.f32363a.setBackgroundColor(0);
        this.f32363a.setTextColor(getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102819i : g9c0.f102790H));
        if ((((MessagesAct) getContext()).f32488f.m111048t7() instanceof yxz) && ((yxz) ((MessagesAct) getContext()).f32488f.m111048t7()).f202025M1) {
            this.f32363a.setBackground(getResources().getDrawable(ibc0.f113900R4));
            this.f32363a.setTextColor(getResources().getColor(g9c0.f102810a0));
        }
        if (TEnum.equals(message.messageType(), "local_friend_comment_toast")) {
            this.f32363a.setText(q8g0.m175796b0("更新了好友印象，立即查看", jyb.m147507f0("立即查看"), getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102786D), lyh0.m156283c(3)));
            bnl0.m105509E0(this.f32363a, new View.OnClickListener() { // from class: l.ygq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f199868a.m49901f(view);
                }
            });
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_real_shot_tips)) {
            String string = getContext().getResources().getString(R$string.f21583Q4);
            String string2 = getContext().getResources().getString(R$string.f21567O4, string);
            if ("2".equals(message.value)) {
                string2 = getContext().getResources().getString(R$string.f21575P4, string);
            }
            this.f32363a.setText(q8g0.m175796b0(string2, jyb.m147482M(string), getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102786D), lyh0.m156283c(3)));
            bnl0.m105522L(this.f32363a, new View.OnClickListener() { // from class: l.zgq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f204331a.m49902g(view);
                }
            });
            return;
        }
        if (TEnum.equals(message.messageType, MessageType.local_normal_tips)) {
            this.f32363a.setGravity(1);
            this.f32363a.setText(message.value);
            return;
        }
        if (!TEnum.equals(message.messageType, MessageType.local_push_switch)) {
            if (!TEnum.equals(message.messageType, MessageType.local_push_switch_plus)) {
                String string3 = nrb0.m164466b() ? "头像认证" : getContext().getResources().getString(R$string.f21707f3);
                this.f32363a.setText(q8g0.m175796b0(getContext().getResources().getString(R$string.f21716g3, string3), jyb.m147482M(string3), getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102786D), lyh0.m156283c(3)));
                bnl0.m105509E0(this.f32363a, new View.OnClickListener() { // from class: l.chq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f81857a.m49903h(view);
                    }
                });
                return;
            }
            User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(message.getHostId());
            if (NullChecker.m82486a(userM116503Pa)) {
                if (NullChecker.m82486a(n100Var) && !n100Var.m161054a(MessageType.local_push_switch_plus)) {
                    n100Var.m161055b(MessageType.local_push_switch_plus);
                    i4g0.m138526x("e_offline_open_notification", OMSDialogPositon.p_chat_view);
                }
                this.f32363a.setText(q8g0.m175796b0(String.format("开启通知后及时接收%s的消息", userM116503Pa.isFemale() ? "她" : "他"), jyb.m147482M("开启通知"), getResources().getColor(g9c0.f102786D), lyh0.m156283c(3)));
                bnl0.m105509E0(this.f32363a, new View.OnClickListener() { // from class: l.bhq
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ItemTantanVerifyToast.m49899d(view);
                    }
                });
                return;
            }
            return;
        }
        User userM116503Pa2 = CoreModule.f18264c.f20381e0.m116503Pa(message.getHostId());
        long jM174454o = pzi0.m174454o();
        if (NullChecker.m82486a(userM116503Pa2) && NullChecker.m82486a(userM116503Pa2.location)) {
            if (NullChecker.m82486a(n100Var) && !n100Var.m161054a(MessageType.local_push_switch)) {
                n100Var.m161055b(MessageType.local_push_switch);
                if (jM174454o - userM116503Pa2.location.updatedTime < 300000.0d) {
                    i4g0.m138526x("e_miss_open_tips", OMSDialogPositon.p_chat_view);
                } else {
                    i4g0.m138526x("e_offline_open_tips", OMSDialogPositon.p_chat_view);
                }
            }
            if (jM174454o - userM116503Pa2.location.updatedTime < 300000.0d) {
                str = "不想错过最新回复？点击开启提醒";
            } else {
                str = String.format("%s不在线，点击开启提醒上线后及时通知你", userM116503Pa2.isFemale() ? "她" : "他");
            }
            this.f32363a.setText(q8g0.m175796b0(str, jyb.m147482M("点击开启提醒"), getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102786D), lyh0.m156283c(3)));
            bnl0.m105509E0(this.f32363a, new View.OnClickListener() { // from class: l.ahq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ItemTantanVerifyToast.m49896a(str, view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32363a = (VText) findViewById(edc0.f93495y4);
    }

    public ItemTantanVerifyToast(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemTantanVerifyToast(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
