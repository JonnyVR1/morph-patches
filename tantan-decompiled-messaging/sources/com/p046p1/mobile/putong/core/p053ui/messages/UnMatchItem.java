package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.a1c0;
import p149l.ura;
import p149l.vkj0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class UnMatchItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public UnMatchItem f31686a;

    /* JADX INFO: renamed from: b */
    public VText f31687b;

    public UnMatchItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m49007a(View view) {
        vkj0.m198748a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m49008b(User user, Message message, @Nullable Conversation conversation) {
        if (CoreModule.m29935P().m94658i().mo158354c()) {
            int i = message.localFailType;
            VText vText = this.f31687b;
            if (i >= 1) {
                xdl0.m208344M(vText, true);
                if (user.onlineMatch() && message.localFailType == 2) {
                    this.f31687b.setText(user.isFemale() ? R$string.f20794K5 : R$string.f20802L5);
                } else {
                    this.f31687b.setText(R$string.f21057p5);
                }
            } else {
                xdl0.m208344M(vText, false);
            }
        } else {
            this.f31687b.setText(R$string.f21057p5);
        }
        int i2 = message.localFailType;
        if (i2 == 7) {
            boolean zIsEmpty = TextUtils.isEmpty(message.localExtraInfo);
            VText vText2 = this.f31687b;
            if (zIsEmpty) {
                vText2.setText("");
                return;
            } else {
                vText2.setText(ItemText.m48725p(message.localExtraInfo.replaceAll(SignParameters.NEW_LINE, "<br/>"), message));
                this.f31687b.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
        }
        if (i2 == 6) {
            this.f31687b.setText("信号已消失 对方已经离开了对话");
            return;
        }
        if (i2 == 5) {
            this.f31687b.setText("发送消息数已达上限，请耐心等待对方回应哦");
            return;
        }
        if (i2 == 8) {
            this.f31687b.setText(R$string.f21104v3);
        } else if (NullChecker.m81303a(conversation) && conversation.isHeartbeatConv() && xdl0.m208349O0(this.f31687b)) {
            this.f31687b.setText("信号已消失 对方已经离开了对话");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49007a(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31687b.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public UnMatchItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UnMatchItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
