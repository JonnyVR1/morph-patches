package com.p046p1.mobile.putong.core.p053ui.messages;

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
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageRedPacketStatus;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemRedPacket;
import com.p046p1.mobile.putong.core.p053ui.messages.redpacket.RedPacketRecordAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import p147v.VText;
import p149l.c3c0;
import p149l.e30;
import p149l.j760;
import p149l.knb0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.szb0;
import p149l.t100;
import p149l.vwb;
import p149l.w3z;
import p149l.xdl0;
import p149l.y4c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemRedPacket extends FrameLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public LinearLayout f31455a;

    /* JADX INFO: renamed from: b */
    public VText f31456b;

    /* JADX INFO: renamed from: c */
    public VText f31457c;

    /* JADX INFO: renamed from: d */
    public ImageView f31458d;

    /* JADX INFO: renamed from: e */
    public View f31459e;

    public ItemRedPacket(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m48637a(View view) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m48640g() {
        m48641d().duringCreated(CoreModule.f17545c.f19570H0.m210360k4(new AuthTask(m48641d()))).subscribe(mkd0.m154956H(new e30() { // from class: l.ndq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f138302a.m48643f((j760) obj);
            }
        }, new e30() { // from class: l.odq
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f143232a.m48642e((Throwable) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(final Message message) throws IOException {
        MessageRedPacketStatus messageRedPacketStatus;
        if (message.isMe()) {
            setPadding(0, 0, t100.f167257f, 0);
        } else {
            setPadding(t100.f167257f, 0, 0, 0);
        }
        if (TextUtils.isEmpty(message.msgData)) {
            return;
        }
        MessageRedPacketStatus messageRedPacketStatus2 = null;
        try {
            messageRedPacketStatus = MessageRedPacketStatus.JSON_ADAPTER.parse(message.msgData);
            try {
                if (NullChecker.m81303a(message.localRedPacketType)) {
                    messageRedPacketStatus2 = MessageRedPacketStatus.JSON_ADAPTER.parse(message.localRedPacketType);
                }
            } catch (IOException e) {
                e = e;
                CrashHelper.m81296c(e);
            }
        } catch (IOException e2) {
            e = e2;
            messageRedPacketStatus = null;
        }
        if (NullChecker.m81303a(messageRedPacketStatus)) {
            this.f31456b.setText(messageRedPacketStatus.redPacketTitle);
            final String str = messageRedPacketStatus.redPacketId;
            if (NullChecker.m81303a(messageRedPacketStatus2) && messageRedPacketStatus2.localIsRedPacketOpen) {
                setPacketOpen(m48641d().getString(R$string.f21016l0));
            } else if (NullChecker.m81303a(messageRedPacketStatus2) && "finish".equals(messageRedPacketStatus2.localRedPacketStatus)) {
                setPacketOpen(m48641d().getString(R$string.f21007k0));
            } else if (NullChecker.m81303a(messageRedPacketStatus2) && "expired".equals(messageRedPacketStatus2.localRedPacketStatus)) {
                setPacketOpen("已过期");
            } else {
                xdl0.m208344M(this.f31457c, false);
                this.f31455a.setBackground(m48641d().getDrawable(c3c0.f78742f4));
                this.f31459e.setBackgroundColor(Color.parseColor("#fdb96b"));
                this.f31458d.setImageResource(c3c0.f78733e4);
            }
            final String str2 = "average".equals(messageRedPacketStatus.redPacketSplitType) ? "normal_red_packet" : "luck_red_packet";
            final String str3 = (messageRedPacketStatus2 == null || messageRedPacketStatus2.expireTime * 1000 >= mqi0.m155944o() || messageRedPacketStatus2.expireTime == 0) ? "effective" : "overdue";
            xdl0.m208329E0(this.f31455a, new View.OnClickListener() { // from class: l.kdq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f122596a.m48644h(str, message, str2, str3, view);
                }
            });
            this.f31455a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ldq
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return ItemRedPacket.m48637a(view);
                }
            });
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public MessagesAct m48641d() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m48642e(Throwable th) {
        m48641d().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.m151578h(R$string.f21032m7);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 41905) {
            lsi0.m151578h(R$string.f21041n7);
        } else if (i == 41906) {
            w3z.m201403I(m48641d());
        } else {
            lsi0.m151578h(R$string.f21032m7);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m48643f(j760<Integer, String> j760Var) {
        m48641d().progressDismiss();
        if (9000 == j760Var.f116564a.intValue()) {
            lsi0.m151593w(R$string.f21050o7);
            return;
        }
        if ("41905".equals(j760Var.f116565b)) {
            lsi0.m151578h(R$string.f21041n7);
        } else if ("41906".equals(j760Var.f116565b)) {
            w3z.m201403I(m48641d());
        } else {
            lsi0.m151578h(R$string.f21032m7);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m48644h(String str, Message message, String str2, String str3, View view) {
        zvf0.m220399u("e_red_packet", "p_group_chat_view", vwb.m200311Y("red_packet_id", str), vwb.m200311Y("actor_user_id", message.owner), vwb.m200311Y("red_packet_type", str2), vwb.m200311Y("groupchat_id", message.hostId), vwb.m200311Y("red_packet_state", str3));
        if (!ConnectivityReceiver.m81284g()) {
            lsi0.m151584n(R$string.f20719B2);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!CoreModule.f17545c.f19570H0.m210322C4()) {
            w3z.m201402H(m48641d(), new Runnable() { // from class: l.mdq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f133284a.m48640g();
                }
            });
        } else {
            if (CoreModule.m29935P().m94658i().mo158287Q()) {
                return;
            }
            m48641d().startActivity(RedPacketRecordAct.m49745Z1(m48641d(), message, str, m48641d().mo48974l().mo120828r3()));
            m48641d().overridePendingTransition(szb0.f167028c, szb0.f167029d);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f31455a = (LinearLayout) findViewById(y4c0.f196001L3);
        this.f31456b = (VText) findViewById(y4c0.f196032Q4);
        this.f31457c = (VText) findViewById(y4c0.f196190o4);
        this.f31458d = (ImageView) findViewById(y4c0.f196159k1);
        this.f31459e = findViewById(y4c0.f196228u0);
        xdl0.m208344M(this.f31457c, false);
    }

    public void setPacketOpen(String str) {
        this.f31455a.setBackground(m48641d().getDrawable(c3c0.f78751g4));
        this.f31459e.setBackgroundColor(Color.parseColor("#80fdb96b"));
        this.f31458d.setImageResource(c3c0.f78760h4);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        xdl0.m208344M(this.f31457c, true);
        this.f31457c.setText(str);
    }

    public ItemRedPacket(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemRedPacket(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
