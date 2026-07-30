package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ContinuousChatTip;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageTipsContent;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p147v.VDraweeView;
import p149l.a1c0;
import p149l.b86;
import p149l.c3c0;
import p149l.eqh0;
import p149l.hvc0;
import p149l.i0g0;
import p149l.i25;
import p149l.j000;
import p149l.o6j0;
import p149l.qib0;
import p149l.qsz;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ChatTipsItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ChatTipsItem f30699a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f30700b;

    /* JADX INFO: renamed from: c */
    public ItemText f30701c;

    /* JADX INFO: renamed from: d */
    public ItemText f30702d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ChatTipsItem$a */
    public class C8474a extends ClickableSpan {
        public C8474a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            CoreModule.m29932K().mo30688Fo(ChatTipsItem.this.getContext());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ChatTipsItem.this.getResources().getColor(ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67161o));
        }
    }

    public ChatTipsItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m47877b(View view) {
        i25.m134046a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m47878c(ContinuousChatTip continuousChatTip, View view) {
        o6j0.m162859c("e_chat_continuous_chat_tips_message", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
        if (getContext() instanceof Act) {
            b86.m100758c((Act) getContext(), continuousChatTip.clickH5Url);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m47879d(int i, Message message, qsz qszVar) {
        if (message == null) {
            return;
        }
        xdl0.m208344M(this.f30700b, false);
        xdl0.m208344M(this.f30702d, false);
        MessageTipsContent messageTipsContentM139089N = j000.m139089N(message);
        xdl0.m208344M(this.f30701c, true);
        if (i == 249 && TEnum.equals(message.messageType, MessageType.local_friend_active_remind_female)) {
            this.f30701c.setText(getFriendActiveRemindFemaleText());
            this.f30701c.setMovementMethod(LinkMovementMethod.getInstance());
        } else if (i == 252 && TEnum.equals(message.messageType, MessageType.continuous_chat_tip)) {
            setContinuousChatTip(message);
        } else if (!NullChecker.m81303a(messageTipsContentM139089N) || (TextUtils.isEmpty(messageTipsContentM139089N.value) && TextUtils.isEmpty(messageTipsContentM139089N.androidValue))) {
            xdl0.m208344M(this.f30701c, false);
        } else {
            if (!TextUtils.isEmpty(messageTipsContentM139089N.statsModuleId) && !qszVar.m176377a(message.f56011id)) {
                qszVar.m176378b(message.f56011id);
                String strPageId = getContext() instanceof Act ? ((Act) getContext()).pageId() : "";
                boolean zIsEmpty = TextUtils.isEmpty(messageTipsContentM139089N.statsModuleParameter);
                String str = messageTipsContentM139089N.statsModuleId;
                if (zIsEmpty) {
                    zvf0.m220402x(str, strPageId);
                } else {
                    try {
                        zvf0.m220404z(str, strPageId, new JSONObject(messageTipsContentM139089N.statsModuleParameter));
                    } catch (Exception unused) {
                    }
                }
            }
            if (!TextUtils.isEmpty(messageTipsContentM139089N.androidValue) && NullChecker.m81303a(message.extData) && NullChecker.m81303a(message.extData.chatTips)) {
                messageTipsContentM139089N.value = messageTipsContentM139089N.androidValue;
                if (NullChecker.m81303a(message.extData.chatTips.selfShown)) {
                    MessageTipsContent messageTipsContent = message.extData.chatTips.selfShown;
                    messageTipsContent.value = messageTipsContent.androidValue;
                }
                if (NullChecker.m81303a(message.extData.chatTips.otherShown)) {
                    MessageTipsContent messageTipsContent2 = message.extData.chatTips.otherShown;
                    messageTipsContent2.value = messageTipsContent2.androidValue;
                }
            }
            boolean zEquals = TextUtils.equals(messageTipsContentM139089N.style, "redBackground");
            ItemText itemText = this.f30701c;
            if (zEquals) {
                itemText.setBackground(hvc0.m133155b(c3c0.f78739f1));
                xdl0.m208378h0(this.f30701c, t100.f167261j);
            } else {
                itemText.setBackground(null);
                xdl0.m208378h0(this.f30701c, 0);
            }
            this.f30701c.m48727D(messageTipsContentM139089N.value, message);
        }
        this.f30701c.setGravity(17);
    }

    public CharSequence getFriendActiveRemindFemaleText() {
        SpannableStringBuilder spannableStringBuilderM133861b0 = i0g0.m133861b0("对方没有回复？系统将为您再次提醒对方\n点击可关闭", vwb.m200299M("点击可关闭"), ura.m195053e().m195057d().mo33699I4() ? a1c0.f67156j : a1c0.f67161o, eqh0.m117752c(3));
        spannableStringBuilderM133861b0.setSpan(new C8474a(), "对方没有回复？系统将为您再次提醒对方\n点击可关闭".indexOf("点击可关闭"), "对方没有回复？系统将为您再次提醒对方\n点击可关闭".length(), 33);
        return spannableStringBuilderM133861b0;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47877b(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f30701c.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f30702d.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public void setContinuousChatTip(Message message) {
        if (!NullChecker.m81303a(message) || !NullChecker.m81303a(message.additionalData) || !NullChecker.m81303a(message.additionalData.continuousChatTip)) {
            xdl0.m208344M(this.f30701c, false);
            return;
        }
        final ContinuousChatTip continuousChatTip = message.additionalData.continuousChatTip;
        if (continuousChatTip.days > 0) {
            xdl0.m208344M(this.f30700b, true);
            xdl0.m208344M(this.f30702d, true);
            qib0.f154691G.m102331L0(this.f30700b, continuousChatTip.flameImgUrl);
            this.f30701c.setText(String.format("已连续聊天%d天，点亮", Integer.valueOf(continuousChatTip.days)));
            this.f30702d.setText("标识");
            this.f30701c.setTextColor(Color.parseColor("#FF8231"));
            this.f30702d.setTextColor(Color.parseColor("#FF8231"));
            o6j0.m162864h("e_chat_continuous_chat_tips_message", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.h25
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f105489a.m47878c(continuousChatTip, view);
            }
        });
    }

    public ChatTipsItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ChatTipsItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
