package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.ytj0;

/* JADX INFO: loaded from: classes3.dex */
public class UnMatchItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public UnMatchItem f32534a;

    /* JADX INFO: renamed from: b */
    public VText f32535b;

    public UnMatchItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m50190a(View view) {
        ytj0.m217336a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m50191b(User user, Message message, @Nullable Conversation conversation) {
        if (CoreModule.m30933P().m143412i().mo180446c()) {
            int i = message.localFailType;
            VText vText = this.f32535b;
            if (i >= 1) {
                bnl0.m105524M(vText, true);
                if (user.onlineMatch() && message.localFailType == 2) {
                    this.f32535b.setText(user.isFemale() ? R$string.f21536K5 : R$string.f21544L5);
                } else {
                    this.f32535b.setText(R$string.f21799p5);
                }
            } else {
                bnl0.m105524M(vText, false);
            }
        } else {
            this.f32535b.setText(R$string.f21799p5);
        }
        int i2 = message.localFailType;
        if (i2 == 7) {
            boolean zIsEmpty = TextUtils.isEmpty(message.localExtraInfo);
            VText vText2 = this.f32535b;
            if (zIsEmpty) {
                vText2.setText("");
                return;
            } else {
                vText2.setText(ItemText.m49908p(message.localExtraInfo.replaceAll(SignParameters.NEW_LINE, "<br/>"), message));
                this.f32535b.setMovementMethod(LinkMovementMethod.getInstance());
                return;
            }
        }
        if (i2 == 6) {
            this.f32535b.setText("信号已消失 对方已经离开了对话");
            return;
        }
        if (i2 == 5) {
            this.f32535b.setText("发送消息数已达上限，请耐心等待对方回应哦");
            return;
        }
        if (i2 == 8) {
            this.f32535b.setText(R$string.f21846v3);
        } else if (NullChecker.m82486a(conversation) && conversation.isHeartbeatConv() && bnl0.m105529O0(this.f32535b)) {
            this.f32535b.setText("信号已消失 对方已经离开了对话");
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50190a(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32535b.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public UnMatchItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public UnMatchItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
