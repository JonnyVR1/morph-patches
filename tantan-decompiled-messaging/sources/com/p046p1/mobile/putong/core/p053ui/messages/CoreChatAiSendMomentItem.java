package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreAiStoryShareStatus;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.e30;
import p149l.e51;
import p149l.j760;
import p149l.osi0;
import p149l.ue7;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class CoreChatAiSendMomentItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CoreChatAiSendMomentItem f30704a;

    /* JADX INFO: renamed from: b */
    public VLinear f30705b;

    /* JADX INFO: renamed from: c */
    public VImage f30706c;

    /* JADX INFO: renamed from: d */
    public VText f30707d;

    /* JADX INFO: renamed from: e */
    public boolean f30708e;

    public CoreChatAiSendMomentItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m47885d(View view) {
        ue7.m193221a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m47886e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public String m47887f(Message message) {
        if (message != null && User.isAiStory(message.owner) && !TextUtils.isEmpty(message.msgData)) {
            try {
                CoreAiStoryShareStatus coreAiStoryShareStatus = CoreAiStoryShareStatus.JSON_ADAPTER.parse(message.msgData);
                if (NullChecker.m81303a(coreAiStoryShareStatus)) {
                    return coreAiStoryShareStatus.shareStatus;
                }
            } catch (IOException e) {
                CrashHelper.m81296c(e);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m47888g(Message message, String str) {
        if (TextUtils.isEmpty(str)) {
            osi0.m165783g("分享失败，请重试");
            return;
        }
        zvf0.m220399u("e_ai_story_share_to_moment", OMSDialogPositon.p_chat_view, new j760("moment_id", str), new j760(Constants.MessagePayloadKeys.MSGID_SERVER, message == null ? "" : message.f56011id));
        CoreModule.f17545c.f19642f0.m32710Kn(message.owner, message.f56011id);
        e51.m114748M(new Runnable() { // from class: l.te7
            @Override // java.lang.Runnable
            public final void run() {
                this.f169800a.m47891j();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m47889h(final Message message, View view) {
        if (CoreModule.m29934N().isPostingMoment()) {
            return;
        }
        CoreModule.m29934N().mo60290Kr(m47886e(), message.value, message.f56011id, new e30() { // from class: l.se7
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f163931a.m47888g(message, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m47890i(final Message message) {
        if (message == null) {
            setVisibility(8);
            return;
        }
        if (m47893l(message)) {
            xdl0.m208329E0(this.f30705b, new View.OnClickListener() { // from class: l.re7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f159034a.m47889h(message, view);
                }
            });
            setVisibility(0);
            this.f30706c.setImageResource(c3c0.f78773j);
            this.f30707d.setText("分享至动态");
            this.f30707d.setTextColor(CoreModule.f17544b.getResources().getColor(a1c0.f67168v));
        } else {
            if (!m47892k(message)) {
                this.f30705b.setOnClickListener(null);
                setVisibility(8);
                return;
            }
            m47891j();
        }
        if (this.f30708e) {
            return;
        }
        this.f30708e = true;
        zvf0.m220368A("e_ai_story_share_to_moment", OMSDialogPositon.p_chat_view, new j760(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56011id));
    }

    /* JADX INFO: renamed from: j */
    public final void m47891j() {
        this.f30705b.setOnClickListener(null);
        setVisibility(0);
        this.f30706c.setImageResource(c3c0.f78764i);
        this.f30707d.setText("已分享至动态");
        this.f30707d.setTextColor(CoreModule.f17544b.getResources().getColor(a1c0.f67165s));
    }

    /* JADX INFO: renamed from: k */
    public boolean m47892k(Message message) {
        return TextUtils.equals(m47887f(message), "shared");
    }

    /* JADX INFO: renamed from: l */
    public boolean m47893l(Message message) {
        return TextUtils.equals(m47887f(message), "toShare");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47885d(this);
    }

    public CoreChatAiSendMomentItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreChatAiSendMomentItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
