package com.p000p1.mobile.putong.core.p001ui.messages;

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
import com.p000p1.mobile.putong.core.p001ui.messages.ItemRedPacket;
import com.p1.mobile.putong.api.api.TantanException;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageRedPacketStatus;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.redpacket.RedPacketRecordAct;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.List;
import l.c3c0;
import l.j760;
import l.knb0;
import l.lsi0;
import l.mkd0;
import l.mqi0;
import l.szb0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.y4c0;
import l.zvf0;
import p003l.e30;
import p003l.m250;
import p003l.w3z;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemRedPacket extends FrameLayout implements InterfaceC0102a {

    /* JADX INFO: renamed from: a */
    public LinearLayout f1346a;

    /* JADX INFO: renamed from: b */
    public VText f1347b;

    /* JADX INFO: renamed from: c */
    public VText f1348c;

    /* JADX INFO: renamed from: d */
    public ImageView f1349d;

    /* JADX INFO: renamed from: e */
    public View f1350e;

    public ItemRedPacket(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ boolean m1721a(View view) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public /* synthetic */ void m1724g() {
        m1725d().duringCreated(CoreModule.c.H0.k4(new AuthTask(m1725d()))).subscribe((m250) mkd0.H(new e30() { // from class: l.ndq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5879a.m1727f((j760) obj);
            }
        }, new e30() { // from class: l.odq
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6108a.m1726e((Throwable) obj);
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: A */
    public void mo1056A(final Message message) {
        MessageRedPacketStatus messageRedPacketStatus;
        if (message.isMe()) {
            setPadding(0, 0, t100.f, 0);
        } else {
            setPadding(t100.f, 0, 0, 0);
        }
        if (TextUtils.isEmpty(message.msgData)) {
            return;
        }
        MessageRedPacketStatus messageRedPacketStatus2 = null;
        try {
            messageRedPacketStatus = (MessageRedPacketStatus) MessageRedPacketStatus.JSON_ADAPTER.parse(message.msgData);
            try {
                if (NullChecker.a(message.localRedPacketType)) {
                    messageRedPacketStatus2 = (MessageRedPacketStatus) MessageRedPacketStatus.JSON_ADAPTER.parse(message.localRedPacketType);
                }
            } catch (IOException e) {
                e = e;
                CrashHelper.c(e);
            }
        } catch (IOException e2) {
            e = e2;
            messageRedPacketStatus = null;
        }
        if (NullChecker.a(messageRedPacketStatus)) {
            this.f1347b.setText(messageRedPacketStatus.redPacketTitle);
            final String str = messageRedPacketStatus.redPacketId;
            if (NullChecker.a(messageRedPacketStatus2) && messageRedPacketStatus2.localIsRedPacketOpen) {
                setPacketOpen(m1725d().getString(R.string.l0));
            } else if (NullChecker.a(messageRedPacketStatus2) && "finish".equals(messageRedPacketStatus2.localRedPacketStatus)) {
                setPacketOpen(m1725d().getString(R.string.k0));
            } else if (NullChecker.a(messageRedPacketStatus2) && "expired".equals(messageRedPacketStatus2.localRedPacketStatus)) {
                setPacketOpen("已过期");
            } else {
                xdl0.M(this.f1348c, false);
                this.f1346a.setBackground(m1725d().getDrawable(c3c0.f4));
                this.f1350e.setBackgroundColor(Color.parseColor("#fdb96b"));
                this.f1349d.setImageResource(c3c0.e4);
            }
            final String str2 = "average".equals(messageRedPacketStatus.redPacketSplitType) ? "normal_red_packet" : "luck_red_packet";
            final String str3 = (messageRedPacketStatus2 == null || messageRedPacketStatus2.expireTime * 1000 >= mqi0.o() || messageRedPacketStatus2.expireTime == 0) ? "effective" : "overdue";
            xdl0.E0(this.f1346a, new View.OnClickListener() { // from class: l.kdq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f4901a.m1728h(str, message, str2, str3, view);
                }
            });
            this.f1346a.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ldq
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view) {
                    return ItemRedPacket.m1721a(view);
                }
            });
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo1057J() {
        return null;
    }

    /* JADX INFO: renamed from: d */
    public MessagesAct m1725d() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m1726e(Throwable th) {
        m1725d().progressDismiss();
        if (!(th instanceof TantanException.Client.CoreService)) {
            lsi0.h(R.string.m7);
            return;
        }
        int i = ((TantanException.Client.CoreService) th).subCode;
        if (i == 41905) {
            lsi0.h(R.string.n7);
        } else if (i == 41906) {
            w3z.m8437I(m1725d());
        } else {
            lsi0.h(R.string.m7);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m1727f(j760<Integer, String> j760Var) {
        m1725d().progressDismiss();
        if (9000 == ((Integer) j760Var.a).intValue()) {
            lsi0.w(R.string.o7);
            return;
        }
        if ("41905".equals(j760Var.b)) {
            lsi0.h(R.string.n7);
        } else if ("41906".equals(j760Var.b)) {
            w3z.m8437I(m1725d());
        } else {
            lsi0.h(R.string.m7);
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m1728h(String str, Message message, String str2, String str3, View view) {
        zvf0.u("e_red_packet", "p_group_chat_view", new j760[]{vwb.Y("red_packet_id", str), vwb.Y("actor_user_id", message.owner), vwb.Y("red_packet_type", str2), vwb.Y("groupchat_id", message.hostId), vwb.Y("red_packet_state", str3)});
        if (!ConnectivityReceiver.g()) {
            lsi0.n(R.string.B2);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (!CoreModule.c.H0.C4()) {
            w3z.m8436H(m1725d(), new Runnable() { // from class: l.mdq
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5590a.m1724g();
                }
            });
        } else {
            if (CoreModule.P().i().Q()) {
                return;
            }
            m1725d().startActivity(RedPacketRecordAct.Z1(m1725d(), message, str, m1725d().mo2066l().m4295r3()));
            m1725d().overridePendingTransition(szb0.c, szb0.d);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.messages.InterfaceC0102a
    /* JADX INFO: renamed from: m */
    public void mo1062m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f1346a = (LinearLayout) findViewById(y4c0.L3);
        this.f1347b = (VText) findViewById(y4c0.Q4);
        this.f1348c = (VText) findViewById(y4c0.o4);
        this.f1349d = (ImageView) findViewById(y4c0.k1);
        this.f1350e = findViewById(y4c0.u0);
        xdl0.M(this.f1348c, false);
    }

    public void setPacketOpen(String str) {
        this.f1346a.setBackground(m1725d().getDrawable(c3c0.g4));
        this.f1350e.setBackgroundColor(Color.parseColor("#80fdb96b"));
        this.f1349d.setImageResource(c3c0.h4);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        xdl0.M(this.f1348c, true);
        this.f1348c.setText(str);
    }

    public ItemRedPacket(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemRedPacket(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
