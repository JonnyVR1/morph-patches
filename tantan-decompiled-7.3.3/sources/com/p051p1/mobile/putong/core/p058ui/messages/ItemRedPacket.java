package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.alipay.sdk.app.AuthTask;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageRedPacketStatus;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.messages.ItemRedPacket;
import com.p051p1.mobile.putong.core.p058ui.messages.redpacket.RedPacketRecordAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.o1j0;
import p153l.ovb0;
import p153l.pf60;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.tcz;
import p153l.y20;
import p153l.y7c0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemRedPacket extends FrameLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public LinearLayout f32303a;

    /* JADX INFO: renamed from: b */
    public VText f32304b;

    /* JADX INFO: renamed from: c */
    public VText f32305c;

    /* JADX INFO: renamed from: d */
    public ImageView f32306d;

    /* JADX INFO: renamed from: e */
    public View f32307e;

    public ItemRedPacket(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m49820a(View view) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m49823g() {
        m49824d().duringCreated(CoreModule.f18264c.f20312H0.m155448k4(new AuthTask(m49824d()))).subscribe(psd0.m173597H(new y20() { // from class: l.nfq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141754a.m49826f((pf60) obj);
            }
        }, new y20() { // from class: l.ofq
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147095a.m49825e((Throwable) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(final Message message) throws IOException {
        MessageRedPacketStatus messageRedPacketStatus;
        if (message.isMe()) {
            setPadding(0, 0, qa00.f156319f, 0);
        } else {
            setPadding(qa00.f156319f, 0, 0, 0);
        }
        if (TextUtils.isEmpty(message.msgData)) {
            return;
        }
        MessageRedPacketStatus messageRedPacketStatus2 = null;
        try {
            messageRedPacketStatus = MessageRedPacketStatus.JSON_ADAPTER.parse(message.msgData);
            try {
                if (NullChecker.m82486a(message.localRedPacketType)) {
                    messageRedPacketStatus2 = MessageRedPacketStatus.JSON_ADAPTER.parse(message.localRedPacketType);
                }
            } catch (IOException e) {
                e = e;
                CrashHelper.m82479c(e);
            }
        } catch (IOException e2) {
            e = e2;
            messageRedPacketStatus = null;
        }
        if (NullChecker.m82486a(messageRedPacketStatus)) {
            this.f32304b.setText(messageRedPacketStatus.redPacketTitle);
            final String str = messageRedPacketStatus.redPacketId;
            if (NullChecker.m82486a(messageRedPacketStatus2) && messageRedPacketStatus2.localIsRedPacketOpen) {
                setPacketOpen(m49824d().getString(R$string.f21758l0));
            } else if (NullChecker.m82486a(messageRedPacketStatus2) && "finish".equals(messageRedPacketStatus2.localRedPacketStatus)) {
                setPacketOpen(m49824d().getString(R$string.f21749k0));
            } else if (NullChecker.m82486a(messageRedPacketStatus2) && "expired".equals(messageRedPacketStatus2.localRedPacketStatus)) {
                setPacketOpen("已过期");
            } else {
                bnl0.m105524M(this.f32305c, false);
                this.f32303a.setBackground(m49824d().getDrawable(ibc0.f114017f4));
                this.f32307e.setBackgroundColor(Color.parseColor("#fdb96b"));
                this.f32306d.setImageResource(ibc0.f114008e4);
            }
            final String str2 = "average".equals(messageRedPacketStatus.redPacketSplitType) ? "normal_red_packet" : "luck_red_packet";
            final String str3 = (messageRedPacketStatus2 == null || messageRedPacketStatus2.expireTime * 1000 >= pzi0.m174454o() || messageRedPacketStatus2.expireTime == 0) ? "effective" : "overdue";
            bnl0.m105509E0(this.f32303a, new View.OnClickListener() { // from class: l.kfq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f126490a.m49827h(str, message, str2, str3, view);
                }
            });
            this.f32303a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.lfq
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return ItemRedPacket.m49820a(view);
                }
            });
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public MessagesAct m49824d() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m49825e(Throwable th) {
        m49824d().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            o1j0.m165634h(R$string.f21774m7);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 41905) {
            o1j0.m165634h(R$string.f21783n7);
        } else if (i == 41906) {
            tcz.m190531I(m49824d());
        } else {
            o1j0.m165634h(R$string.f21774m7);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m49826f(pf60<Integer, String> pf60Var) {
        m49824d().progressDismiss();
        if (9000 == pf60Var.f152156a.intValue()) {
            o1j0.m165649w(R$string.f21792o7);
            return;
        }
        if ("41905".equals(pf60Var.f152157b)) {
            o1j0.m165634h(R$string.f21783n7);
        } else if ("41906".equals(pf60Var.f152157b)) {
            tcz.m190531I(m49824d());
        } else {
            o1j0.m165634h(R$string.f21774m7);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m49827h(String str, Message message, String str2, String str3, View view) {
        i4g0.m138523u("e_red_packet", "p_group_chat_view", jyb.m147494Y("red_packet_id", str), jyb.m147494Y("actor_user_id", message.owner), jyb.m147494Y("red_packet_type", str2), jyb.m147494Y("groupchat_id", message.hostId), jyb.m147494Y("red_packet_state", str3));
        if (!ConnectivityReceiver.m82467g()) {
            o1j0.m165640n(R$string.f21461B2);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!CoreModule.f18264c.f20312H0.m155410C4()) {
            tcz.m190530H(m49824d(), new Runnable() { // from class: l.mfq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f136663a.m49823g();
                }
            });
        } else {
            if (CoreModule.m30933P().m143412i().mo180379Q()) {
                return;
            }
            m49824d().startActivity(RedPacketRecordAct.m50928a2(m49824d(), message, str, m49824d().mo50158l().mo111034r3()));
            m49824d().overridePendingTransition(y7c0.f197765c, y7c0.f197766d);
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f32303a = (LinearLayout) findViewById(edc0.f93236L3);
        this.f32304b = (VText) findViewById(edc0.f93267Q4);
        this.f32305c = (VText) findViewById(edc0.f93425o4);
        this.f32306d = (ImageView) findViewById(edc0.f93394k1);
        this.f32307e = findViewById(edc0.f93463u0);
        bnl0.m105524M(this.f32305c, false);
    }

    public void setPacketOpen(String str) {
        this.f32303a.setBackground(m49824d().getDrawable(ibc0.f114026g4));
        this.f32307e.setBackgroundColor(Color.parseColor("#80fdb96b"));
        this.f32306d.setImageResource(ibc0.f114035h4);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        bnl0.m105524M(this.f32305c, true);
        this.f32305c.setText(str);
    }

    public ItemRedPacket(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemRedPacket(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
