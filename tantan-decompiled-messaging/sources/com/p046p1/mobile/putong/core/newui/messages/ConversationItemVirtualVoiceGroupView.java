package com.p046p1.mobile.putong.core.newui.messages;

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
import com.alibaba.sdk.android.oss.common.RequestParameters;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemVirtualVoiceGroupView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p046p1.mobile.putong.data.VirtualVoiceGroupConversationItemInfo;
import com.p046p1.mobile.putong.p065ui.MultipleChatIconView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import p147v.VImage;
import p147v.VLinear;
import p147v.VListCell;
import p147v.VText;
import p149l.c40;
import p149l.ce6;
import p149l.mqi0;
import p149l.pi6;
import p149l.rd6;
import p149l.t100;
import p149l.upa;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.xh0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemVirtualVoiceGroupView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveHaloAvatar f24940d;

    /* JADX INFO: renamed from: e */
    public MultipleChatIconView f24941e;

    /* JADX INFO: renamed from: f */
    public VImage f24942f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f24943g;

    /* JADX INFO: renamed from: h */
    public VText f24944h;

    /* JADX INFO: renamed from: i */
    public TextView f24945i;

    /* JADX INFO: renamed from: j */
    public VText f24946j;

    /* JADX INFO: renamed from: k */
    public VLinear f24947k;

    /* JADX INFO: renamed from: l */
    public VText f24948l;

    /* JADX INFO: renamed from: m */
    public VImage f24949m;

    /* JADX INFO: renamed from: n */
    public VText f24950n;

    /* JADX INFO: renamed from: o */
    public VText f24951o;

    /* JADX INFO: renamed from: p */
    public c40 f24952p;

    /* JADX INFO: renamed from: q */
    public boolean f24953q;

    /* JADX INFO: renamed from: r */
    public String f24954r;

    public ConversationItemVirtualVoiceGroupView(Context context) {
        super(context);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m41035i0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, View view) {
        CoreModule.f17545c.f19681s0.m136784i3(virtualVoiceGroupConversationCell);
        CoreModule.m29936Q().mo67280r9().mo123879e(virtualVoiceGroupConversationCell.roomInfo.roomId, "undisplay", virtualVoiceGroupConversationCell.chatInfo.currentSeq, null);
        if (virtualVoiceGroupConversationCell.cellInfo.isGuest && ura.m195053e().m195057d().mo33784Xk()) {
            zvf0.m220399u("e_recommand_audio_room_operate", OMSDialogPositon.p_messages_view, vwb.m200311Y("operation_type", "hide"));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m41037k0(View view) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m41039m0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, View view) {
        CoreModule.f17545c.f19681s0.m136784i3(virtualVoiceGroupConversationCell);
        if (!virtualVoiceGroupConversationCell.cellInfo.isGuest || !ura.m195053e().m195057d().mo33784Xk()) {
            CoreModule.m29936Q().mo67280r9().mo123879e(virtualVoiceGroupConversationCell.roomInfo.roomId, RequestParameters.SUBRESOURCE_DELETE, virtualVoiceGroupConversationCell.chatInfo.currentSeq, null);
        } else {
            CoreModule.m29936Q().mo67280r9().mo123877c(virtualVoiceGroupConversationCell.roomInfo.roomId, RequestParameters.SUBRESOURCE_DELETE, virtualVoiceGroupConversationCell.chatInfo.currentSeq, GameIdentity.guest, null);
            zvf0.m220399u("e_recommand_audio_room_operate", OMSDialogPositon.p_messages_view, vwb.m200311Y("operation_type", RequestParameters.SUBRESOURCE_DELETE));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m41040n0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m41044y0(View view) {
        this.f24952p.m105113b();
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ boolean m41045B0(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, PutongAct putongAct, final Conversation conversation, View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(!virtualVoiceGroupConversationCell.cellInfo.isOnTop ? "置顶" : "取消置顶");
        arrayList.add("不显示");
        arrayList.add("删除");
        c40 c40VarM105153F = new c40.C16057b(putongAct).m105156I(putongAct.getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.ud6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f175899a.m41044y0(view2);
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.vd6
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f181024a.m41058z0(conversation, virtualVoiceGroupConversationCell, vListCell, c22545a, i);
            }
        }).m105153F();
        this.f24952p = c40VarM105153F;
        c40VarM105153F.m105117f();
        zvf0.m220402x("e_recommand_audio_room_operate", OMSDialogPositon.p_messages_view);
        return true;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m41046D0(final Conversation conversation, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        if (virtualVoiceGroupConversationCell.cellInfo.isOnTop) {
            CoreModule.m29936Q().mo67280r9().mo123879e(virtualVoiceGroupConversationCell.roomInfo.roomId, "unstick", virtualVoiceGroupConversationCell.chatInfo.currentSeq, new Runnable() { // from class: l.ae6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f69008a.m41055u0(conversation);
                }
            });
        } else {
            CoreModule.m29936Q().mo67280r9().mo123879e(virtualVoiceGroupConversationCell.roomInfo.roomId, "stick", virtualVoiceGroupConversationCell.chatInfo.currentSeq, new Runnable() { // from class: l.be6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f75116a.m41056v0(conversation);
                }
            });
        }
        CoreModule.f17545c.f19681s0.m136785j3(virtualVoiceGroupConversationCell);
        zvf0.m220399u("e_recommand_audio_room_operate", OMSDialogPositon.p_messages_view, vwb.m200311Y("operation_type", "topped"));
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0089  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: E0 */
    public void m41047E0(final PutongAct putongAct, final Conversation conversation, final int i) {
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
        this.f24945i.setText(virtualVoiceGroupConversationCell.roomInfo.title);
        xdl0.m208344M(this.f24949m, !virtualVoiceGroupConversationCell.cellInfo.isRemind);
        float f = upa.m194847z() ? 64.0f : 55.0f;
        if (virtualVoiceGroupConversationCell.cellInfo.isEntrance && virtualVoiceGroupConversationCell.roomInfo.isLiving) {
            f -= 8.0f;
        }
        this.f24941e.setRadius(f);
        xdl0.m208327D0(t100.m186890d(f), this.f24941e);
        xdl0.m208325C0(this.f24941e, t100.m186890d(f));
        this.f24941e.m79397p0(virtualVoiceGroupConversationCell.roomInfo.avatars, false);
        if (virtualVoiceGroupConversationCell.chatInfo.unreadedCount > 0) {
            VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo2 = virtualVoiceGroupConversationCell.cellInfo;
            z = (virtualVoiceGroupConversationItemInfo2.isRemoved || virtualVoiceGroupConversationItemInfo2.isDissolved) ? false : true;
        }
        this.f24953q = z;
        if (z) {
            boolean z2 = virtualVoiceGroupConversationCell.cellInfo.isRemind;
            VImage vImage = this.f24942f;
            if (z2) {
                vImage.setVisibility(4);
                this.f24943g.setVisibility(0);
                VText vText = this.f24944h;
                int i2 = virtualVoiceGroupConversationCell.chatInfo.unreadedCount;
                vText.setText(i2 < 100 ? String.valueOf(i2) : "99+");
            } else {
                vImage.setVisibility(0);
                this.f24943g.setVisibility(4);
            }
        } else {
            this.f24943g.setVisibility(4);
            this.f24942f.setVisibility(4);
        }
        this.f24954r = "";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = virtualVoiceGroupConversationCell.roomInfo.roomStateText;
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(virtualVoiceGroupConversationCell.chatInfo.currentSenderName) || !TextUtils.isEmpty(virtualVoiceGroupConversationCell.chatInfo.commonMsg)) {
                str2 = str2 + " · ";
            }
            this.f24954r = str2;
            spannableStringBuilder.append((CharSequence) str2);
        }
        if (this.f24953q && !virtualVoiceGroupConversationCell.cellInfo.isRemind) {
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
        if (!TextUtils.isEmpty(this.f24954r)) {
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(virtualVoiceGroupConversationCell.roomInfo.roomStateTextColor)), 0, this.f24954r.length(), 34);
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
        this.f24946j.setText(spannableStringBuilder);
        this.f24948l.setText(mqi0.m155932G(virtualVoiceGroupConversationCell.chatInfo.currentTime));
        m41048G0(virtualVoiceGroupConversationCell);
        m41051J0(conversation);
        VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo3 = virtualVoiceGroupConversationCell.cellInfo;
        if (virtualVoiceGroupConversationItemInfo3.isEntrance) {
            zvf0.m220402x("e_audio_liked_room_cell", OMSDialogPositon.p_messages_view);
        } else if (!virtualVoiceGroupConversationItemInfo3.isGuest) {
            zvf0.m220403y("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, m41054t0(virtualVoiceGroupConversationCell, i));
        } else if (ura.m195053e().m195057d().mo33784Xk()) {
            zvf0.m220368A("e_radio_room_recommend", OMSDialogPositon.p_messages_view, vwb.m200311Y("anchorId", "NA"), vwb.m200311Y("liveId", virtualVoiceGroupConversationCell.roomInfo.liveId), vwb.m200311Y("audio_card_type", "message_cell"), vwb.m200311Y("roomId", virtualVoiceGroupConversationCell.roomInfo.roomId));
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.sd6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163804a.m41057w0(virtualVoiceGroupConversationCell, i, view);
            }
        });
        if (virtualVoiceGroupConversationCell.cellInfo.isEntrance) {
            return;
        }
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.td6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f169497a.m41045B0(virtualVoiceGroupConversationCell, putongAct, conversation, view);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public final void m41048G0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        boolean z = false;
        xdl0.m208345M0(this.f24940d, virtualVoiceGroupConversationCell.cellInfo.isEntrance && virtualVoiceGroupConversationCell.roomInfo.isLiving);
        xdl0.m208345M0(this.f24951o, virtualVoiceGroupConversationCell.cellInfo.isEntrance && !virtualVoiceGroupConversationCell.roomInfo.isLiving);
        VText vText = this.f24948l;
        if (virtualVoiceGroupConversationCell.cellInfo.isEntrance && virtualVoiceGroupConversationCell.roomInfo.isLiving) {
            z = true;
        }
        xdl0.m208345M0(vText, z);
        if (virtualVoiceGroupConversationCell.cellInfo.isEntrance && virtualVoiceGroupConversationCell.roomInfo.isLiving) {
            this.f24940d.m41670f();
        } else {
            this.f24940d.m41671g();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m41049H0(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        new xh0.C21150a(act()).m208740s("不显示该聊天").m208731j("点击确定当前会话消失，收到新消息会再次出现").m208728g(false).m208727f("确定").m208724c(new View.OnClickListener() { // from class: l.yd6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemVirtualVoiceGroupView.m41035i0(virtualVoiceGroupConversationCell, view);
            }
        }).m208739r("再想想").m208736o(new View.OnClickListener() { // from class: l.zd6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemVirtualVoiceGroupView.m41037k0(view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: I0 */
    public final void m41050I0(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        new xh0.C21150a(act()).m208740s("是否要删除该对话？").m208731j("确认后，好友会话及聊天记录会消失，下次收到消息时会话会再次出现").m208728g(false).m208727f("确定").m208724c(new View.OnClickListener() { // from class: l.wd6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemVirtualVoiceGroupView.m41039m0(virtualVoiceGroupConversationCell, view);
            }
        }).m208739r("再想想").m208736o(new View.OnClickListener() { // from class: l.xd6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemVirtualVoiceGroupView.m41040n0(view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: J0 */
    public final void m41051J0(Conversation conversation) {
        xdl0.m208344M(this.f24950n, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41052r0(this);
        if (upa.m194847z()) {
            xdl0.m208325C0(this, pi6.f149081R);
            int iM186890d = t100.m186890d(6.0f);
            int i = pi6.f149080Q;
            rd6.m178882v(iM186890d + i, this.f24940d);
            LiveHaloAvatar liveHaloAvatar = this.f24940d;
            int i2 = t100.f167259h;
            liveHaloAvatar.m41668d(i - i2, t100.f167258g + i);
            rd6.m178882v(i - i2, this.f24941e);
            rd6.m178877k0(this.f24945i, this.f24948l);
            rd6.m178873e0(this.f24946j);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m41052r0(View view) {
        ce6.m106315a(this, view);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m41053s0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        zvf0.m220396r("e_audio_liked_room_cell", OMSDialogPositon.p_messages_view);
        CoreModule.m29936Q().mo67229M6().mo102429n(act());
    }

    /* JADX INFO: renamed from: t0 */
    public final HashMap<String, Object> m41054t0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, int i) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("anchorId", "NA");
        map.put("liveId", virtualVoiceGroupConversationCell.roomInfo.liveId);
        map.put("audio_card_type", "message_settled_room");
        map.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        return map;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m41055u0(Conversation conversation) {
        conversation.additional.liveVirtualVoice.cellInfo.isOnTop = false;
        setBackgroundColor(0);
        CoreModule.m29936Q().mo67280r9().mo123876b(conversation.additional.liveVirtualVoice);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m41056v0(Conversation conversation) {
        conversation.additional.liveVirtualVoice.cellInfo.isOnTop = true;
        setBackgroundColor(Color.parseColor("#08000000"));
        CoreModule.m29936Q().mo67280r9().mo123876b(conversation.additional.liveVirtualVoice);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m41057w0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, int i, View view) {
        VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = virtualVoiceGroupConversationCell.cellInfo;
        if (virtualVoiceGroupConversationItemInfo.isEntrance) {
            m41053s0(virtualVoiceGroupConversationCell);
            return;
        }
        if (virtualVoiceGroupConversationItemInfo.isDissolved) {
            new xh0.C21150a(act()).m208731j(virtualVoiceGroupConversationCell.cellInfo.dissolveReason).m208739r("确认").m208722a().m208721g();
            return;
        }
        CoreModule.m29936Q().mo67229M6().mo102431p(act(), virtualVoiceGroupConversationCell.roomInfo.liveId, "suggest-card", "", null);
        if (!virtualVoiceGroupConversationCell.cellInfo.isGuest) {
            zvf0.m220397s("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, m41054t0(virtualVoiceGroupConversationCell, i));
        } else if (ura.m195053e().m195057d().mo33784Xk()) {
            CoreModule.m29936Q().mo67280r9().mo123877c(virtualVoiceGroupConversationCell.roomInfo.roomId, "click", virtualVoiceGroupConversationCell.chatInfo.currentSeq, GameIdentity.guest, null);
            zvf0.m220399u("e_radio_room_recommend", OMSDialogPositon.p_messages_view, vwb.m200311Y("anchorId", "NA"), vwb.m200311Y("liveId", virtualVoiceGroupConversationCell.roomInfo.liveId), vwb.m200311Y("audio_card_type", "message_cell"), vwb.m200311Y("roomId", virtualVoiceGroupConversationCell.roomInfo.roomId));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m41058z0(Conversation conversation, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        if (i == 0) {
            m41046D0(conversation, virtualVoiceGroupConversationCell);
        } else if (i != 1) {
            m41050I0(virtualVoiceGroupConversationCell);
        } else {
            m41049H0(virtualVoiceGroupConversationCell);
        }
        this.f24952p.m105113b();
    }

    public ConversationItemVirtualVoiceGroupView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemVirtualVoiceGroupView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
