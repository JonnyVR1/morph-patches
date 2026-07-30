package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemVirtualVoiceGroupView;
import com.p000p1.mobile.putong.p004ui.MultipleChatIconView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p1.mobile.putong.data.VirtualVoiceGroupConversationItemInfo;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import l.c40;
import l.ce6;
import l.j760;
import l.t100;
import l.upa;
import l.ura;
import l.vwb;
import l.xdl0;
import l.xh0;
import l.zvf0;
import p009l.mqi0;
import p009l.pi6;
import p009l.rd6;
import v.VImage;
import v.VLinear;
import v.VListCell;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemVirtualVoiceGroupView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveHaloAvatar f3718d;

    /* JADX INFO: renamed from: e */
    public MultipleChatIconView f3719e;

    /* JADX INFO: renamed from: f */
    public VImage f3720f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f3721g;

    /* JADX INFO: renamed from: h */
    public VText f3722h;

    /* JADX INFO: renamed from: i */
    public TextView f3723i;

    /* JADX INFO: renamed from: j */
    public VText f3724j;

    /* JADX INFO: renamed from: k */
    public VLinear f3725k;

    /* JADX INFO: renamed from: l */
    public VText f3726l;

    /* JADX INFO: renamed from: m */
    public VImage f3727m;

    /* JADX INFO: renamed from: n */
    public VText f3728n;

    /* JADX INFO: renamed from: o */
    public VText f3729o;

    /* JADX INFO: renamed from: p */
    public c40 f3730p;

    /* JADX INFO: renamed from: q */
    public boolean f3731q;

    /* JADX INFO: renamed from: r */
    public String f3732r;

    public ConversationItemVirtualVoiceGroupView(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private Act act() {
        return getContext();
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m5137i0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, View view) {
        CoreModule.c.s0.i3(virtualVoiceGroupConversationCell);
        CoreModule.Q().m9065r9().m25557e(virtualVoiceGroupConversationCell.roomInfo.roomId, "undisplay", virtualVoiceGroupConversationCell.chatInfo.currentSeq, null);
        if (virtualVoiceGroupConversationCell.cellInfo.isGuest && ura.e().d().Xk()) {
            zvf0.u("e_recommand_audio_room_operate", "p_messages_view", new j760[]{vwb.Y("operation_type", "hide")});
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m5139k0(View view) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m5141m0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, View view) {
        CoreModule.c.s0.i3(virtualVoiceGroupConversationCell);
        if (!virtualVoiceGroupConversationCell.cellInfo.isGuest || !ura.e().d().Xk()) {
            CoreModule.Q().m9065r9().m25557e(virtualVoiceGroupConversationCell.roomInfo.roomId, "delete", virtualVoiceGroupConversationCell.chatInfo.currentSeq, null);
        } else {
            CoreModule.Q().m9065r9().m25555c(virtualVoiceGroupConversationCell.roomInfo.roomId, "delete", virtualVoiceGroupConversationCell.chatInfo.currentSeq, "guest", null);
            zvf0.u("e_recommand_audio_room_operate", "p_messages_view", new j760[]{vwb.Y("operation_type", "delete")});
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m5142n0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m5146y0(View view) {
        this.f3730p.b();
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ boolean m5147B0(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, PutongAct putongAct, final Conversation conversation, View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(!virtualVoiceGroupConversationCell.cellInfo.isOnTop ? "置顶" : "取消置顶");
        arrayList.add("不显示");
        arrayList.add("删除");
        c40 c40VarF = new c40.b(putongAct).I(putongAct.getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.ud6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f21083a.m5146y0(view2);
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.vd6
            /* JADX INFO: renamed from: a */
            public final void m23355a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f21539a.m5160z0(conversation, virtualVoiceGroupConversationCell, vListCell, aVar, i);
            }
        }).F();
        this.f3730p = c40VarF;
        c40VarF.f();
        zvf0.x("e_recommand_audio_room_operate", "p_messages_view");
        return true;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m5148D0(final Conversation conversation, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        if (virtualVoiceGroupConversationCell.cellInfo.isOnTop) {
            CoreModule.Q().m9065r9().m25557e(virtualVoiceGroupConversationCell.roomInfo.roomId, "unstick", virtualVoiceGroupConversationCell.chatInfo.currentSeq, new Runnable() { // from class: l.ae6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9430a.m5157u0(conversation);
                }
            });
        } else {
            CoreModule.Q().m9065r9().m25557e(virtualVoiceGroupConversationCell.roomInfo.roomId, "stick", virtualVoiceGroupConversationCell.chatInfo.currentSeq, new Runnable() { // from class: l.be6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10027a.m5158v0(conversation);
                }
            });
        }
        CoreModule.c.s0.j3(virtualVoiceGroupConversationCell);
        zvf0.u("e_recommand_audio_room_operate", "p_messages_view", new j760[]{vwb.Y("operation_type", "topped")});
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: E0 */
    public void m5149E0(final PutongAct putongAct, final Conversation conversation, final int i) {
        VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo;
        boolean z;
        String str;
        final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell = conversation.additional.liveVirtualVoice;
        if (virtualVoiceGroupConversationCell == null || (virtualVoiceGroupConversationItemInfo = virtualVoiceGroupConversationCell.cellInfo) == null || virtualVoiceGroupConversationCell.chatInfo == null || virtualVoiceGroupConversationCell.roomInfo == null) {
            return;
        }
        if (virtualVoiceGroupConversationItemInfo.isOnTop) {
            setBackgroundColor(Color.parseColor("#08000000"));
        } else {
            setBackgroundColor(0);
        }
        this.f3723i.setText(virtualVoiceGroupConversationCell.roomInfo.title);
        xdl0.M(this.f3727m, !virtualVoiceGroupConversationCell.cellInfo.isRemind);
        float f = upa.z() ? 64.0f : 55.0f;
        if (virtualVoiceGroupConversationCell.cellInfo.isEntrance && virtualVoiceGroupConversationCell.roomInfo.isLiving) {
            f -= 8.0f;
        }
        this.f3719e.setRadius(f);
        xdl0.D0(t100.d(f), new View[]{this.f3719e});
        xdl0.C0(this.f3719e, t100.d(f));
        this.f3719e.m9718p0(virtualVoiceGroupConversationCell.roomInfo.avatars, false);
        if (virtualVoiceGroupConversationCell.chatInfo.unreadedCount > 0) {
            VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo2 = virtualVoiceGroupConversationCell.cellInfo;
            z = (virtualVoiceGroupConversationItemInfo2.isRemoved || virtualVoiceGroupConversationItemInfo2.isDissolved) ? false : true;
        }
        this.f3731q = z;
        if (z) {
            boolean z2 = virtualVoiceGroupConversationCell.cellInfo.isRemind;
            VImage vImage = this.f3720f;
            if (z2) {
                vImage.setVisibility(4);
                this.f3721g.setVisibility(0);
                VText vText = this.f3722h;
                int i2 = virtualVoiceGroupConversationCell.chatInfo.unreadedCount;
                vText.setText(i2 < 100 ? String.valueOf(i2) : "99+");
            } else {
                vImage.setVisibility(0);
                this.f3721g.setVisibility(4);
            }
        } else {
            this.f3721g.setVisibility(4);
            this.f3720f.setVisibility(4);
        }
        this.f3732r = "";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = virtualVoiceGroupConversationCell.roomInfo.roomStateText;
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(virtualVoiceGroupConversationCell.chatInfo.currentSenderName) || !TextUtils.isEmpty(virtualVoiceGroupConversationCell.chatInfo.commonMsg)) {
                str2 = str2 + " · ";
            }
            this.f3732r = str2;
            spannableStringBuilder.append((CharSequence) str2);
        }
        if (this.f3731q && !virtualVoiceGroupConversationCell.cellInfo.isRemind) {
            if (virtualVoiceGroupConversationCell.chatInfo.unreadedCount > 99) {
                str = "[99+]";
            } else {
                str = "[" + virtualVoiceGroupConversationCell.chatInfo.unreadedCount + "条]";
            }
            spannableStringBuilder.append((CharSequence) str);
        }
        if (!TextUtils.isEmpty(virtualVoiceGroupConversationCell.chatInfo.currentSenderName) && TextUtils.isEmpty(virtualVoiceGroupConversationCell.chatInfo.commonMsg)) {
            spannableStringBuilder.append((CharSequence) virtualVoiceGroupConversationCell.chatInfo.currentSenderName).append((CharSequence) ":").append((CharSequence) virtualVoiceGroupConversationCell.chatInfo.currentMsg);
        }
        if (!TextUtils.isEmpty(virtualVoiceGroupConversationCell.chatInfo.commonMsg)) {
            spannableStringBuilder.append((CharSequence) virtualVoiceGroupConversationCell.chatInfo.commonMsg);
        }
        if (!TextUtils.isEmpty(this.f3732r)) {
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(virtualVoiceGroupConversationCell.roomInfo.roomStateTextColor)), 0, this.f3732r.length(), 34);
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
        this.f3724j.setText(spannableStringBuilder);
        this.f3726l.setText(mqi0.m18538G(virtualVoiceGroupConversationCell.chatInfo.currentTime));
        m5150G0(virtualVoiceGroupConversationCell);
        m5153J0(conversation);
        VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo3 = virtualVoiceGroupConversationCell.cellInfo;
        if (virtualVoiceGroupConversationItemInfo3.isEntrance) {
            zvf0.x("e_audio_liked_room_cell", "p_messages_view");
        } else if (!virtualVoiceGroupConversationItemInfo3.isGuest) {
            zvf0.y("e_live_audio_room_enter", "p_messages_view", m5156t0(virtualVoiceGroupConversationCell, i));
        } else if (ura.e().d().Xk()) {
            zvf0.A("e_radio_room_recommend", "p_messages_view", new j760[]{vwb.Y("anchorId", "NA"), vwb.Y("liveId", virtualVoiceGroupConversationCell.roomInfo.liveId), vwb.Y("audio_card_type", "message_cell"), vwb.Y("roomId", virtualVoiceGroupConversationCell.roomInfo.roomId)});
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.sd6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20177a.m5159w0(virtualVoiceGroupConversationCell, i, view);
            }
        });
        if (virtualVoiceGroupConversationCell.cellInfo.isEntrance) {
            return;
        }
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.td6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f20619a.m5147B0(virtualVoiceGroupConversationCell, putongAct, conversation, view);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public final void m5150G0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        boolean z = false;
        xdl0.M0(this.f3718d, virtualVoiceGroupConversationCell.cellInfo.isEntrance && virtualVoiceGroupConversationCell.roomInfo.isLiving);
        xdl0.M0(this.f3729o, virtualVoiceGroupConversationCell.cellInfo.isEntrance && !virtualVoiceGroupConversationCell.roomInfo.isLiving);
        VText vText = this.f3726l;
        if (virtualVoiceGroupConversationCell.cellInfo.isEntrance && virtualVoiceGroupConversationCell.roomInfo.isLiving) {
            z = true;
        }
        xdl0.M0(vText, z);
        if (virtualVoiceGroupConversationCell.cellInfo.isEntrance && virtualVoiceGroupConversationCell.roomInfo.isLiving) {
            this.f3718d.m5794f();
        } else {
            this.f3718d.m5795g();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m5151H0(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        new xh0.a(act()).s("不显示该聊天").j("点击确定当前会话消失，收到新消息会再次出现").g(false).f("确定").c(new View.OnClickListener() { // from class: l.yd6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemVirtualVoiceGroupView.m5137i0(virtualVoiceGroupConversationCell, view);
            }
        }).r("再想想").o(new View.OnClickListener() { // from class: l.zd6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemVirtualVoiceGroupView.m5139k0(view);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: I0 */
    public final void m5152I0(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        new xh0.a(act()).s("是否要删除该对话？").j("确认后，好友会话及聊天记录会消失，下次收到消息时会话会再次出现").g(false).f("确定").c(new View.OnClickListener() { // from class: l.wd6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemVirtualVoiceGroupView.m5141m0(virtualVoiceGroupConversationCell, view);
            }
        }).r("再想想").o(new View.OnClickListener() { // from class: l.xd6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemVirtualVoiceGroupView.m5142n0(view);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: J0 */
    public final void m5153J0(Conversation conversation) {
        xdl0.M(this.f3728n, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5154r0(this);
        if (upa.z()) {
            xdl0.C0(this, pi6.f18602R);
            int iD = t100.d(6.0f);
            int i = pi6.f18601Q;
            rd6.m21523v(iD + i, this.f3718d);
            LiveHaloAvatar liveHaloAvatar = this.f3718d;
            int i2 = t100.h;
            liveHaloAvatar.m5792d(i - i2, t100.g + i);
            rd6.m21523v(i - i2, this.f3719e);
            rd6.m21518k0(this.f3723i, this.f3726l);
            rd6.m21514e0(this.f3724j);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m5154r0(View view) {
        ce6.a(this, view);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m5155s0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        zvf0.r("e_audio_liked_room_cell", "p_messages_view");
        CoreModule.Q().m9019M6().m12095n(act());
    }

    /* JADX INFO: renamed from: t0 */
    public final HashMap<String, Object> m5156t0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, int i) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("anchorId", "NA");
        map.put("liveId", virtualVoiceGroupConversationCell.roomInfo.liveId);
        map.put("audio_card_type", "message_settled_room");
        map.put("index", Integer.valueOf(i));
        return map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m5157u0(Conversation conversation) {
        conversation.additional.liveVirtualVoice.cellInfo.isOnTop = false;
        setBackgroundColor(0);
        CoreModule.Q().m9065r9().m25554b(conversation.additional.liveVirtualVoice);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m5158v0(Conversation conversation) {
        conversation.additional.liveVirtualVoice.cellInfo.isOnTop = true;
        setBackgroundColor(Color.parseColor("#08000000"));
        CoreModule.Q().m9065r9().m25554b(conversation.additional.liveVirtualVoice);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m5159w0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, int i, View view) {
        VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = virtualVoiceGroupConversationCell.cellInfo;
        if (virtualVoiceGroupConversationItemInfo.isEntrance) {
            m5155s0(virtualVoiceGroupConversationCell);
            return;
        }
        if (virtualVoiceGroupConversationItemInfo.isDissolved) {
            new xh0.a(act()).j(virtualVoiceGroupConversationCell.cellInfo.dissolveReason).r("确认").a().g();
            return;
        }
        CoreModule.Q().m9019M6().m12097p(act(), virtualVoiceGroupConversationCell.roomInfo.liveId, "suggest-card", "", null);
        if (!virtualVoiceGroupConversationCell.cellInfo.isGuest) {
            zvf0.s("e_live_audio_room_enter", "p_messages_view", m5156t0(virtualVoiceGroupConversationCell, i));
        } else if (ura.e().d().Xk()) {
            CoreModule.Q().m9065r9().m25555c(virtualVoiceGroupConversationCell.roomInfo.roomId, "click", virtualVoiceGroupConversationCell.chatInfo.currentSeq, "guest", null);
            zvf0.u("e_radio_room_recommend", "p_messages_view", new j760[]{vwb.Y("anchorId", "NA"), vwb.Y("liveId", virtualVoiceGroupConversationCell.roomInfo.liveId), vwb.Y("audio_card_type", "message_cell"), vwb.Y("roomId", virtualVoiceGroupConversationCell.roomInfo.roomId)});
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m5160z0(Conversation conversation, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, VListCell vListCell, VListCell.a aVar, int i) {
        if (i == 0) {
            m5148D0(conversation, virtualVoiceGroupConversationCell);
        } else if (i != 1) {
            m5152I0(virtualVoiceGroupConversationCell);
        } else {
            m5151H0(virtualVoiceGroupConversationCell);
        }
        this.f3730p.b();
    }

    public ConversationItemVirtualVoiceGroupView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemVirtualVoiceGroupView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
