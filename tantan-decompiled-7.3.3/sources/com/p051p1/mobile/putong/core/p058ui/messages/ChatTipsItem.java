package com.p051p1.mobile.putong.core.p058ui.messages;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ContinuousChatTip;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageTipsContent;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import org.json.JSONObject;
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.g900;
import p153l.g96;
import p153l.g9c0;
import p153l.gta;
import p153l.h35;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.k3d0;
import p153l.lyh0;
import p153l.n100;
import p153l.q8g0;
import p153l.qa00;
import p153l.sfj0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class ChatTipsItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ChatTipsItem f31547a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31548b;

    /* JADX INFO: renamed from: c */
    public ItemText f31549c;

    /* JADX INFO: renamed from: d */
    public ItemText f31550d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ChatTipsItem$a */
    public class C8637a extends ClickableSpan {
        public C8637a() {
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(@NonNull View view) {
            CoreModule.m30930K().mo31691Fo(ChatTipsItem.this.getContext());
        }

        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
        public void updateDrawState(TextPaint textPaint) {
            textPaint.setColor(ChatTipsItem.this.getResources().getColor(gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102825o));
        }
    }

    public ChatTipsItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: b */
    public final void m49060b(View view) {
        h35.m133410a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m49061c(ContinuousChatTip continuousChatTip, View view) {
        sfj0.m185596c("e_chat_continuous_chat_tips_message", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
        if (getContext() instanceof Act) {
            g96.m129516c((Act) getContext(), continuousChatTip.clickH5Url);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m49062d(int i, Message message, n100 n100Var) {
        if (message == null) {
            return;
        }
        bnl0.m105524M(this.f31548b, false);
        bnl0.m105524M(this.f31550d, false);
        MessageTipsContent messageTipsContentM129476N = g900.m129476N(message);
        bnl0.m105524M(this.f31549c, true);
        if (i == 249 && TEnum.equals(message.messageType, MessageType.local_friend_active_remind_female)) {
            this.f31549c.setText(getFriendActiveRemindFemaleText());
            this.f31549c.setMovementMethod(LinkMovementMethod.getInstance());
        } else if (i == 252 && TEnum.equals(message.messageType, MessageType.continuous_chat_tip)) {
            setContinuousChatTip(message);
        } else if (!NullChecker.m82486a(messageTipsContentM129476N) || (TextUtils.isEmpty(messageTipsContentM129476N.value) && TextUtils.isEmpty(messageTipsContentM129476N.androidValue))) {
            bnl0.m105524M(this.f31549c, false);
        } else {
            if (!TextUtils.isEmpty(messageTipsContentM129476N.statsModuleId) && !n100Var.m161054a(message.f56859id)) {
                n100Var.m161055b(message.f56859id);
                String strPageId = getContext() instanceof Act ? ((Act) getContext()).pageId() : "";
                boolean zIsEmpty = TextUtils.isEmpty(messageTipsContentM129476N.statsModuleParameter);
                String str = messageTipsContentM129476N.statsModuleId;
                if (zIsEmpty) {
                    i4g0.m138526x(str, strPageId);
                } else {
                    try {
                        i4g0.m138528z(str, strPageId, new JSONObject(messageTipsContentM129476N.statsModuleParameter));
                    } catch (Exception unused) {
                    }
                }
            }
            if (!TextUtils.isEmpty(messageTipsContentM129476N.androidValue) && NullChecker.m82486a(message.extData) && NullChecker.m82486a(message.extData.chatTips)) {
                messageTipsContentM129476N.value = messageTipsContentM129476N.androidValue;
                if (NullChecker.m82486a(message.extData.chatTips.selfShown)) {
                    MessageTipsContent messageTipsContent = message.extData.chatTips.selfShown;
                    messageTipsContent.value = messageTipsContent.androidValue;
                }
                if (NullChecker.m82486a(message.extData.chatTips.otherShown)) {
                    MessageTipsContent messageTipsContent2 = message.extData.chatTips.otherShown;
                    messageTipsContent2.value = messageTipsContent2.androidValue;
                }
            }
            boolean zEquals = TextUtils.equals(messageTipsContentM129476N.style, "redBackground");
            ItemText itemText = this.f31549c;
            if (zEquals) {
                itemText.setBackground(k3d0.m148006b(ibc0.f114014f1));
                bnl0.m105558h0(this.f31549c, qa00.f156323j);
            } else {
                itemText.setBackground(null);
                bnl0.m105558h0(this.f31549c, 0);
            }
            this.f31549c.m49910D(messageTipsContentM129476N.value, message);
        }
        this.f31549c.setGravity(17);
    }

    public CharSequence getFriendActiveRemindFemaleText() {
        SpannableStringBuilder spannableStringBuilderM175796b0 = q8g0.m175796b0("对方没有回复？系统将为您再次提醒对方\n点击可关闭", jyb.m147482M("点击可关闭"), gta.m132210e().m132214d().mo34702I4() ? g9c0.f102820j : g9c0.f102825o, lyh0.m156283c(3));
        spannableStringBuilderM175796b0.setSpan(new C8637a(), "对方没有回复？系统将为您再次提醒对方\n点击可关闭".indexOf("点击可关闭"), "对方没有回复？系统将为您再次提醒对方\n点击可关闭".length(), 33);
        return spannableStringBuilderM175796b0;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49060b(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f31549c.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f31550d.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public void setContinuousChatTip(Message message) {
        if (!NullChecker.m82486a(message) || !NullChecker.m82486a(message.additionalData) || !NullChecker.m82486a(message.additionalData.continuousChatTip)) {
            bnl0.m105524M(this.f31549c, false);
            return;
        }
        final ContinuousChatTip continuousChatTip = message.additionalData.continuousChatTip;
        if (continuousChatTip.days > 0) {
            bnl0.m105524M(this.f31548b, true);
            bnl0.m105524M(this.f31550d, true);
            uqb0.f180374G.m127115L0(this.f31548b, continuousChatTip.flameImgUrl);
            this.f31549c.setText(String.format("已连续聊天%d天，点亮", Integer.valueOf(continuousChatTip.days)));
            this.f31550d.setText("标识");
            this.f31549c.setTextColor(Color.parseColor("#FF8231"));
            this.f31550d.setTextColor(Color.parseColor("#FF8231"));
            sfj0.m185601h("e_chat_continuous_chat_tips_message", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.g35
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f101946a.m49061c(continuousChatTip, view);
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
