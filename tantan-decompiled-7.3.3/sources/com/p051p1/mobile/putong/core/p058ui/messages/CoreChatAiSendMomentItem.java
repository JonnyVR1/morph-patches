package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreAiStoryShareStatus;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.l51;
import p153l.pf60;
import p153l.r1j0;
import p153l.y20;
import p153l.yf7;

/* JADX INFO: loaded from: classes3.dex */
public class CoreChatAiSendMomentItem extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CoreChatAiSendMomentItem f31552a;

    /* JADX INFO: renamed from: b */
    public VLinear f31553b;

    /* JADX INFO: renamed from: c */
    public VImage f31554c;

    /* JADX INFO: renamed from: d */
    public VText f31555d;

    /* JADX INFO: renamed from: e */
    public boolean f31556e;

    public CoreChatAiSendMomentItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: d */
    public final void m49068d(View view) {
        yf7.m215525a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public Act m49069e() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: f */
    public String m49070f(Message message) {
        if (message != null && User.isAiStory(message.owner) && !TextUtils.isEmpty(message.msgData)) {
            try {
                CoreAiStoryShareStatus coreAiStoryShareStatus = CoreAiStoryShareStatus.JSON_ADAPTER.parse(message.msgData);
                if (NullChecker.m82486a(coreAiStoryShareStatus)) {
                    return coreAiStoryShareStatus.shareStatus;
                }
            } catch (IOException e) {
                CrashHelper.m82479c(e);
            }
        }
        return "";
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m49071g(Message message, String str) {
        if (TextUtils.isEmpty(str)) {
            r1j0.m179420g("分享失败，请重试");
            return;
        }
        i4g0.m138523u("e_ai_story_share_to_moment", OMSDialogPositon.p_chat_view, new pf60("moment_id", str), new pf60(Constants.MessagePayloadKeys.MSGID_SERVER, message == null ? "" : message.f56859id));
        CoreModule.f18264c.f20384f0.m33713Kn(message.owner, message.f56859id);
        l51.m152893M(new Runnable() { // from class: l.xf7
            @Override // java.lang.Runnable
            public final void run() {
                this.f194008a.m49074j();
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m49072h(final Message message, View view) {
        if (CoreModule.m30932N().isPostingMoment()) {
            return;
        }
        CoreModule.m30932N().mo61474Kr(m49069e(), message.value, message.f56859id, new y20() { // from class: l.wf7
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f188746a.m49071g(message, (String) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public void m49073i(final Message message) {
        if (message == null) {
            setVisibility(8);
            return;
        }
        if (m49076l(message)) {
            bnl0.m105509E0(this.f31553b, new View.OnClickListener() { // from class: l.vf7
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f183883a.m49072h(message, view);
                }
            });
            setVisibility(0);
            this.f31554c.setImageResource(ibc0.f114048j);
            this.f31555d.setText("分享至动态");
            this.f31555d.setTextColor(CoreModule.f18263b.getResources().getColor(g9c0.f102832v));
        } else {
            if (!m49075k(message)) {
                this.f31553b.setOnClickListener(null);
                setVisibility(8);
                return;
            }
            m49074j();
        }
        if (this.f31556e) {
            return;
        }
        this.f31556e = true;
        i4g0.m138492A("e_ai_story_share_to_moment", OMSDialogPositon.p_chat_view, new pf60(Constants.MessagePayloadKeys.MSGID_SERVER, message.f56859id));
    }

    /* JADX INFO: renamed from: j */
    public final void m49074j() {
        this.f31553b.setOnClickListener(null);
        setVisibility(0);
        this.f31554c.setImageResource(ibc0.f114039i);
        this.f31555d.setText("已分享至动态");
        this.f31555d.setTextColor(CoreModule.f18263b.getResources().getColor(g9c0.f102829s));
    }

    /* JADX INFO: renamed from: k */
    public boolean m49075k(Message message) {
        return TextUtils.equals(m49070f(message), "shared");
    }

    /* JADX INFO: renamed from: l */
    public boolean m49076l(Message message) {
        return TextUtils.equals(m49070f(message), "toShare");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49068d(this);
    }

    public CoreChatAiSendMomentItem(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreChatAiSendMomentItem(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
