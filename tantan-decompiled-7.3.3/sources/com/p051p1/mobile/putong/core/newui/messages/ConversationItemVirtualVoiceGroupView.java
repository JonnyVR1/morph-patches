package com.p051p1.mobile.putong.core.newui.messages;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemVirtualVoiceGroupView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.VirtualVoiceGroupConversationCell;
import com.p051p1.mobile.putong.data.VirtualVoiceGroupConversationItemInfo;
import com.p051p1.mobile.putong.p070ui.MultipleChatIconView;
import com.tantanapp.common.utils.CrashHelper;
import java.util.ArrayList;
import java.util.HashMap;
import p151v.VImage;
import p151v.VLinear;
import p151v.VListCell;
import p151v.VText;
import p153l.bnl0;
import p153l.ff6;
import p153l.gra;
import p153l.gta;
import p153l.i4g0;
import p153l.jyb;
import p153l.pzi0;
import p153l.qa00;
import p153l.sj6;
import p153l.th0;
import p153l.ue6;
import p153l.w30;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemVirtualVoiceGroupView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public LiveHaloAvatar f25682d;

    /* JADX INFO: renamed from: e */
    public MultipleChatIconView f25683e;

    /* JADX INFO: renamed from: f */
    public VImage f25684f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f25685g;

    /* JADX INFO: renamed from: h */
    public VText f25686h;

    /* JADX INFO: renamed from: i */
    public TextView f25687i;

    /* JADX INFO: renamed from: j */
    public VText f25688j;

    /* JADX INFO: renamed from: k */
    public VLinear f25689k;

    /* JADX INFO: renamed from: l */
    public VText f25690l;

    /* JADX INFO: renamed from: m */
    public VImage f25691m;

    /* JADX INFO: renamed from: n */
    public VText f25692n;

    /* JADX INFO: renamed from: o */
    public VText f25693o;

    /* JADX INFO: renamed from: p */
    public w30 f25694p;

    /* JADX INFO: renamed from: q */
    public boolean f25695q;

    /* JADX INFO: renamed from: r */
    public String f25696r;

    public ConversationItemVirtualVoiceGroupView(Context context) {
        super(context);
    }

    private Act act() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m42046i0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, View view) {
        CoreModule.f18264c.f20423s0.m181937i3(virtualVoiceGroupConversationCell);
        CoreModule.m30934Q().mo68463r9().mo108371e(virtualVoiceGroupConversationCell.roomInfo.roomId, "undisplay", virtualVoiceGroupConversationCell.chatInfo.currentSeq, null);
        if (virtualVoiceGroupConversationCell.cellInfo.isGuest && gta.m132210e().m132214d().mo34787Xk()) {
            i4g0.m138523u("e_recommand_audio_room_operate", OMSDialogPositon.p_messages_view, jyb.m147494Y("operation_type", "hide"));
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m42048k0(View view) {
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m42050m0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, View view) {
        CoreModule.f18264c.f20423s0.m181937i3(virtualVoiceGroupConversationCell);
        if (!virtualVoiceGroupConversationCell.cellInfo.isGuest || !gta.m132210e().m132214d().mo34787Xk()) {
            CoreModule.m30934Q().mo68463r9().mo108371e(virtualVoiceGroupConversationCell.roomInfo.roomId, RequestParameters.SUBRESOURCE_DELETE, virtualVoiceGroupConversationCell.chatInfo.currentSeq, null);
        } else {
            CoreModule.m30934Q().mo68463r9().mo108369c(virtualVoiceGroupConversationCell.roomInfo.roomId, RequestParameters.SUBRESOURCE_DELETE, virtualVoiceGroupConversationCell.chatInfo.currentSeq, GameIdentity.guest, null);
            i4g0.m138523u("e_recommand_audio_room_operate", OMSDialogPositon.p_messages_view, jyb.m147494Y("operation_type", RequestParameters.SUBRESOURCE_DELETE));
        }
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m42051n0(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y0 */
    public /* synthetic */ void m42055y0(View view) {
        this.f25694p.m204614b();
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ boolean m42056B0(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, PutongAct putongAct, final Conversation conversation, View view) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(!virtualVoiceGroupConversationCell.cellInfo.isOnTop ? "置顶" : "取消置顶");
        arrayList.add("不显示");
        arrayList.add("删除");
        w30 w30VarM204654F = new w30.C21001b(putongAct).m204657I(putongAct.getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.xe6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f193738a.m42055y0(view2);
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.ye6
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f198665a.m42069z0(conversation, virtualVoiceGroupConversationCell, vListCell, c22660a, i);
            }
        }).m204654F();
        this.f25694p = w30VarM204654F;
        w30VarM204654F.m204618f();
        i4g0.m138526x("e_recommand_audio_room_operate", OMSDialogPositon.p_messages_view);
        return true;
    }

    /* JADX INFO: renamed from: D0 */
    public final void m42057D0(final Conversation conversation, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        if (virtualVoiceGroupConversationCell.cellInfo.isOnTop) {
            CoreModule.m30934Q().mo68463r9().mo108371e(virtualVoiceGroupConversationCell.roomInfo.roomId, "unstick", virtualVoiceGroupConversationCell.chatInfo.currentSeq, new Runnable() { // from class: l.df6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f88132a.m42066u0(conversation);
                }
            });
        } else {
            CoreModule.m30934Q().mo68463r9().mo108371e(virtualVoiceGroupConversationCell.roomInfo.roomId, "stick", virtualVoiceGroupConversationCell.chatInfo.currentSeq, new Runnable() { // from class: l.ef6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f93708a.m42067v0(conversation);
                }
            });
        }
        CoreModule.f18264c.f20423s0.m181938j3(virtualVoiceGroupConversationCell);
        i4g0.m138523u("e_recommand_audio_room_operate", OMSDialogPositon.p_messages_view, jyb.m147494Y("operation_type", "topped"));
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
    public void m42058E0(final PutongAct putongAct, final Conversation conversation, final int i) {
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
        this.f25687i.setText(virtualVoiceGroupConversationCell.roomInfo.title);
        bnl0.m105524M(this.f25691m, !virtualVoiceGroupConversationCell.cellInfo.isRemind);
        float f = gra.m131778z() ? 64.0f : 55.0f;
        if (virtualVoiceGroupConversationCell.cellInfo.isEntrance && virtualVoiceGroupConversationCell.roomInfo.isLiving) {
            f -= 8.0f;
        }
        this.f25683e.setRadius(f);
        bnl0.m105507D0(qa00.m175859d(f), this.f25683e);
        bnl0.m105505C0(this.f25683e, qa00.m175859d(f));
        this.f25683e.m80580p0(virtualVoiceGroupConversationCell.roomInfo.avatars, false);
        if (virtualVoiceGroupConversationCell.chatInfo.unreadedCount > 0) {
            VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo2 = virtualVoiceGroupConversationCell.cellInfo;
            z = (virtualVoiceGroupConversationItemInfo2.isRemoved || virtualVoiceGroupConversationItemInfo2.isDissolved) ? false : true;
        }
        this.f25695q = z;
        if (z) {
            boolean z2 = virtualVoiceGroupConversationCell.cellInfo.isRemind;
            VImage vImage = this.f25684f;
            if (z2) {
                vImage.setVisibility(4);
                this.f25685g.setVisibility(0);
                VText vText = this.f25686h;
                int i2 = virtualVoiceGroupConversationCell.chatInfo.unreadedCount;
                vText.setText(i2 < 100 ? String.valueOf(i2) : "99+");
            } else {
                vImage.setVisibility(0);
                this.f25685g.setVisibility(4);
            }
        } else {
            this.f25685g.setVisibility(4);
            this.f25684f.setVisibility(4);
        }
        this.f25696r = "";
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        String str2 = virtualVoiceGroupConversationCell.roomInfo.roomStateText;
        if (!TextUtils.isEmpty(str2)) {
            if (!TextUtils.isEmpty(virtualVoiceGroupConversationCell.chatInfo.currentSenderName) || !TextUtils.isEmpty(virtualVoiceGroupConversationCell.chatInfo.commonMsg)) {
                str2 = str2 + " · ";
            }
            this.f25696r = str2;
            spannableStringBuilder.append((CharSequence) str2);
        }
        if (this.f25695q && !virtualVoiceGroupConversationCell.cellInfo.isRemind) {
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
        if (!TextUtils.isEmpty(this.f25696r)) {
            try {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(Color.parseColor(virtualVoiceGroupConversationCell.roomInfo.roomStateTextColor)), 0, this.f25696r.length(), 34);
            } catch (Exception e) {
                CrashHelper.m82479c(e);
            }
        }
        this.f25688j.setText(spannableStringBuilder);
        this.f25690l.setText(pzi0.m174442G(virtualVoiceGroupConversationCell.chatInfo.currentTime));
        m42059G0(virtualVoiceGroupConversationCell);
        m42062J0(conversation);
        VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo3 = virtualVoiceGroupConversationCell.cellInfo;
        if (virtualVoiceGroupConversationItemInfo3.isEntrance) {
            i4g0.m138526x("e_audio_liked_room_cell", OMSDialogPositon.p_messages_view);
        } else if (!virtualVoiceGroupConversationItemInfo3.isGuest) {
            i4g0.m138527y("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, m42065t0(virtualVoiceGroupConversationCell, i));
        } else if (gta.m132210e().m132214d().mo34787Xk()) {
            i4g0.m138492A("e_radio_room_recommend", OMSDialogPositon.p_messages_view, jyb.m147494Y("anchorId", "NA"), jyb.m147494Y("liveId", virtualVoiceGroupConversationCell.roomInfo.liveId), jyb.m147494Y("audio_card_type", "message_cell"), jyb.m147494Y("roomId", virtualVoiceGroupConversationCell.roomInfo.roomId));
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.ve6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183701a.m42068w0(virtualVoiceGroupConversationCell, i, view);
            }
        });
        if (virtualVoiceGroupConversationCell.cellInfo.isEntrance) {
            return;
        }
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.we6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f188668a.m42056B0(virtualVoiceGroupConversationCell, putongAct, conversation, view);
            }
        });
    }

    /* JADX INFO: renamed from: G0 */
    public final void m42059G0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        boolean z = false;
        bnl0.m105525M0(this.f25682d, virtualVoiceGroupConversationCell.cellInfo.isEntrance && virtualVoiceGroupConversationCell.roomInfo.isLiving);
        bnl0.m105525M0(this.f25693o, virtualVoiceGroupConversationCell.cellInfo.isEntrance && !virtualVoiceGroupConversationCell.roomInfo.isLiving);
        VText vText = this.f25690l;
        if (virtualVoiceGroupConversationCell.cellInfo.isEntrance && virtualVoiceGroupConversationCell.roomInfo.isLiving) {
            z = true;
        }
        bnl0.m105525M0(vText, z);
        if (virtualVoiceGroupConversationCell.cellInfo.isEntrance && virtualVoiceGroupConversationCell.roomInfo.isLiving) {
            this.f25682d.m42681f();
        } else {
            this.f25682d.m42682g();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public final void m42060H0(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        new th0.C20312a(act()).m191160s("不显示该聊天").m191151j("点击确定当前会话消失，收到新消息会再次出现").m191148g(false).m191147f("确定").m191144c(new View.OnClickListener() { // from class: l.bf6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemVirtualVoiceGroupView.m42046i0(virtualVoiceGroupConversationCell, view);
            }
        }).m191159r("再想想").m191156o(new View.OnClickListener() { // from class: l.cf6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemVirtualVoiceGroupView.m42048k0(view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: I0 */
    public final void m42061I0(final VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        new th0.C20312a(act()).m191160s("是否要删除该对话？").m191151j("确认后，好友会话及聊天记录会消失，下次收到消息时会话会再次出现").m191148g(false).m191147f("确定").m191144c(new View.OnClickListener() { // from class: l.ze6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemVirtualVoiceGroupView.m42050m0(virtualVoiceGroupConversationCell, view);
            }
        }).m191159r("再想想").m191156o(new View.OnClickListener() { // from class: l.af6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ConversationItemVirtualVoiceGroupView.m42051n0(view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: J0 */
    public final void m42062J0(Conversation conversation) {
        bnl0.m105524M(this.f25692n, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42063r0(this);
        if (gra.m131778z()) {
            bnl0.m105505C0(this, sj6.f168906R);
            int iM175859d = qa00.m175859d(6.0f);
            int i = sj6.f168905Q;
            ue6.m195676v(iM175859d + i, this.f25682d);
            LiveHaloAvatar liveHaloAvatar = this.f25682d;
            int i2 = qa00.f156321h;
            liveHaloAvatar.m42679d(i - i2, qa00.f156320g + i);
            ue6.m195676v(i - i2, this.f25683e);
            ue6.m195671k0(this.f25687i, this.f25690l);
            ue6.m195667e0(this.f25688j);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m42063r0(View view) {
        ff6.m125359a(this, view);
    }

    /* JADX INFO: renamed from: s0 */
    public final void m42064s0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell) {
        i4g0.m138520r("e_audio_liked_room_cell", OMSDialogPositon.p_messages_view);
        CoreModule.m30934Q().mo68412M6().mo127343n(act());
    }

    /* JADX INFO: renamed from: t0 */
    public final HashMap<String, Object> m42065t0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, int i) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("anchorId", "NA");
        map.put("liveId", virtualVoiceGroupConversationCell.roomInfo.liveId);
        map.put("audio_card_type", "message_settled_room");
        map.put(FirebaseAnalytics.Param.INDEX, Integer.valueOf(i));
        return map;
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m42066u0(Conversation conversation) {
        conversation.additional.liveVirtualVoice.cellInfo.isOnTop = false;
        setBackgroundColor(0);
        CoreModule.m30934Q().mo68463r9().mo108368b(conversation.additional.liveVirtualVoice);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m42067v0(Conversation conversation) {
        conversation.additional.liveVirtualVoice.cellInfo.isOnTop = true;
        setBackgroundColor(Color.parseColor("#08000000"));
        CoreModule.m30934Q().mo68463r9().mo108368b(conversation.additional.liveVirtualVoice);
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m42068w0(VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, int i, View view) {
        VirtualVoiceGroupConversationItemInfo virtualVoiceGroupConversationItemInfo = virtualVoiceGroupConversationCell.cellInfo;
        if (virtualVoiceGroupConversationItemInfo.isEntrance) {
            m42064s0(virtualVoiceGroupConversationCell);
            return;
        }
        if (virtualVoiceGroupConversationItemInfo.isDissolved) {
            new th0.C20312a(act()).m191151j(virtualVoiceGroupConversationCell.cellInfo.dissolveReason).m191159r("确认").m191142a().m191141g();
            return;
        }
        CoreModule.m30934Q().mo68412M6().mo127345p(act(), virtualVoiceGroupConversationCell.roomInfo.liveId, "suggest-card", "", null);
        if (!virtualVoiceGroupConversationCell.cellInfo.isGuest) {
            i4g0.m138521s("e_live_audio_room_enter", OMSDialogPositon.p_messages_view, m42065t0(virtualVoiceGroupConversationCell, i));
        } else if (gta.m132210e().m132214d().mo34787Xk()) {
            CoreModule.m30934Q().mo68463r9().mo108369c(virtualVoiceGroupConversationCell.roomInfo.roomId, "click", virtualVoiceGroupConversationCell.chatInfo.currentSeq, GameIdentity.guest, null);
            i4g0.m138523u("e_radio_room_recommend", OMSDialogPositon.p_messages_view, jyb.m147494Y("anchorId", "NA"), jyb.m147494Y("liveId", virtualVoiceGroupConversationCell.roomInfo.liveId), jyb.m147494Y("audio_card_type", "message_cell"), jyb.m147494Y("roomId", virtualVoiceGroupConversationCell.roomInfo.roomId));
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m42069z0(Conversation conversation, VirtualVoiceGroupConversationCell virtualVoiceGroupConversationCell, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        if (i == 0) {
            m42057D0(conversation, virtualVoiceGroupConversationCell);
        } else if (i != 1) {
            m42061I0(virtualVoiceGroupConversationCell);
        } else {
            m42060H0(virtualVoiceGroupConversationCell);
        }
        this.f25694p.m204614b();
    }

    public ConversationItemVirtualVoiceGroupView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemVirtualVoiceGroupView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
