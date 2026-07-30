package com.p051p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupTag;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.GroupApply;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.group.CoreGroupChatHeaderView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.group.GroupProfileAct;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p137rx.subjects.C22508b;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.edc0;
import p153l.fo0;
import p153l.g9c0;
import p153l.ibc0;
import p153l.jek;
import p153l.jyb;
import p153l.o1j0;
import p153l.p9r;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.qec0;
import p153l.sb8;
import p153l.sfj0;
import p153l.tz8;
import p153l.uqb0;
import p153l.uxj0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class CoreGroupChatHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: l */
    public static C22508b<Boolean> f22283l = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public CoreGroupChatHeaderView f22284a;

    /* JADX INFO: renamed from: b */
    public VRelative f22285b;

    /* JADX INFO: renamed from: c */
    public VText f22286c;

    /* JADX INFO: renamed from: d */
    public VText f22287d;

    /* JADX INFO: renamed from: e */
    public VLinear f22288e;

    /* JADX INFO: renamed from: f */
    public VRelative f22289f;

    /* JADX INFO: renamed from: g */
    public VText f22290g;

    /* JADX INFO: renamed from: h */
    public VText f22291h;

    /* JADX INFO: renamed from: i */
    public List<ChatGroup> f22292i;

    /* JADX INFO: renamed from: j */
    public List<GroupApply> f22293j;

    /* JADX INFO: renamed from: k */
    public String f22294k;

    public CoreGroupChatHeaderView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m37507c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m37509e(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m37520A(View view) {
        CoreModule.m30934Q().mo68465rh(m37531q());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m37521B(uxj0 uxj0Var) {
        m37529J();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m37522C(Boolean bool) {
        bnl0.m105524M(this.f22289f, false);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m37523D(y20 y20Var, CoreData coreData) {
        List<ChatGroup> list = coreData.chatGroups;
        this.f22292i = list;
        List<GroupApply> list2 = coreData.groupApplies;
        this.f22293j = list2;
        m37528I(list, list2, y20Var);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m37524E(y20 y20Var, Throwable th) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.FALSE);
        }
        m37536v();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m37525F(ChatGroup chatGroup, View view) {
        m37531q().startActivity(GroupProfileAct.m50290a2(m37531q(), chatGroup.f56859id, chatGroup, false));
        sfj0.m185598e("e_group_chat_list", "p_circle_detail", pf60.m172085a("circle_detail_tab", "group"), pf60.m172085a("group_name", chatGroup.name), pf60.m172085a("groupchat_id", chatGroup.f56859id));
    }

    /* JADX INFO: renamed from: G */
    public final void m37526G(ChatGroup chatGroup) {
        VText vText;
        int iM37535u = m37535u(chatGroup);
        if (iM37535u == -1 || iM37535u > this.f22288e.getChildCount() + 1 || (vText = (VText) this.f22288e.getChildAt(iM37535u).findViewById(edc0.f93198F1)) == null) {
            return;
        }
        m37533s(chatGroup, chatGroup.groupApply, vText);
    }

    /* JADX INFO: renamed from: H */
    public void m37527H(String str, String str2, final y20<Boolean> y20Var) {
        this.f22294k = str;
        m37531q().duringCreated(CoreModule.f18264c.f20387g0.m32914p6(str2)).subscribe(psd0.m173597H(new y20() { // from class: l.pz8
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154726a.m37523D(y20Var, (CoreData) obj);
            }
        }, new y20() { // from class: l.qz8
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160229a.m37524E(y20Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public final void m37528I(List<ChatGroup> list, List<GroupApply> list2, y20<Boolean> y20Var) {
        if (list == null || list.size() == 0) {
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call(Boolean.FALSE);
            }
            m37536v();
            return;
        }
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.TRUE);
        }
        this.f22288e.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            final ChatGroup chatGroup = list.get(i);
            sfj0.m185605l("e_group_chat_list", "p_circle_detail", pf60.m172085a("circle_detail_tab", "group"), pf60.m172085a("group_name", chatGroup.name), pf60.m172085a("groupchat_id", chatGroup.f56859id));
            View viewInflate = p9r.m171370a(getContext()).inflate(qec0.f157030g0, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(edc0.f93338c1);
            VText vText = (VText) viewInflate.findViewById(edc0.f93198F1);
            TextPaint paint = vText.getPaint();
            if (NullChecker.m82486a(paint)) {
                paint.setFakeBoldText(true);
            }
            VText vText2 = (VText) viewInflate.findViewById(edc0.f93193E2);
            TextPaint paint2 = vText2.getPaint();
            if (NullChecker.m82486a(paint2)) {
                paint2.setFakeBoldText(true);
            }
            VText vText3 = (VText) viewInflate.findViewById(edc0.f93316Z);
            VLinear vLinear = (VLinear) viewInflate.findViewById(edc0.f93467u4);
            vText3.setText(chatGroup.description);
            vText2.setText(chatGroup.name);
            if (chatGroup.avatars.size() > 0) {
                uqb0.f180374G.m127140Z0(vDraweeView, chatGroup.avatars.get(0).cover().profileSmall().formatted());
            }
            m37533s(chatGroup, m37534t(chatGroup.f56859id, list2), vText);
            m37532r(vLinear, chatGroup);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            layoutParams.height = qa00.m175859d(76.0f);
            viewInflate.setLayoutParams(layoutParams);
            bnl0.m105509E0(viewInflate, new View.OnClickListener() { // from class: l.fz8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f101451a.m37525F(chatGroup, view);
                }
            });
            this.f22288e.addView(viewInflate);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m37529J() {
        GroupApply groupApply;
        HashMap<String, GroupApply> mapM32794B6 = CoreModule.f18264c.f20387g0.m32794B6();
        for (final String str : mapM32794B6.keySet()) {
            ChatGroup chatGroup = (ChatGroup) jyb.m147529r(this.f22292i, new qcj() { // from class: l.rz8
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((ChatGroup) obj).f56859id.equals(str));
                }
            });
            if (NullChecker.m82486a(chatGroup) && (groupApply = mapM32794B6.get(str)) != null && !TEnum.equals(chatGroup.groupApply.status, groupApply.status)) {
                chatGroup.groupApply.status = groupApply.status;
                m37526G(chatGroup);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37530p(this);
        TextPaint paint = this.f22286c.getPaint();
        if (NullChecker.m82486a(paint)) {
            paint.setFakeBoldText(true);
        }
        TextPaint paint2 = this.f22287d.getPaint();
        if (NullChecker.m82486a(paint2)) {
            paint2.setFakeBoldText(true);
        }
        TextPaint paint3 = this.f22290g.getPaint();
        if (NullChecker.m82486a(paint3)) {
            paint3.setFakeBoldText(true);
        }
        TextPaint paint4 = this.f22291h.getPaint();
        if (NullChecker.m82486a(paint4)) {
            paint4.setFakeBoldText(true);
        }
        bnl0.m105509E0(this.f22287d, new View.OnClickListener() { // from class: l.ez8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96569a.m37540z(view);
            }
        });
        bnl0.m105509E0(this.f22291h, new View.OnClickListener() { // from class: l.kz8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129392a.m37520A(view);
            }
        });
        CoreModule.f18264c.f20387g0.m32794B6().clear();
        m37531q().duringCreated(CoreModule.f18264c.f20387g0.m32791A6()).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.lz8
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134163a.m37521B((uxj0) obj);
            }
        }, new y20() { // from class: l.mz8
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreGroupChatHeaderView.m37509e((Throwable) obj);
            }
        }));
        m37531q().duringCreated(f22283l).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.nz8
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144412a.m37522C((Boolean) obj);
            }
        }, new y20() { // from class: l.oz8
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreGroupChatHeaderView.m37507c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final void m37530p(View view) {
        tz8.m193651a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public Act m37531q() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: r */
    public void m37532r(final VLinear vLinear, ChatGroup chatGroup) {
        if (vLinear.getChildCount() > 0) {
            vLinear.removeAllViews();
        }
        bnl0.m105524M(vLinear, chatGroup.tags.size() > 0);
        if (chatGroup.tags.size() > 0) {
            jyb.m147537z(chatGroup.tags, new y20() { // from class: l.jz8
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f123238a.m37537w(vLinear, (ChatGroupTag) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public void m37533s(final ChatGroup chatGroup, final GroupApply groupApply, VText vText) {
        if (groupApply == null) {
            groupApply = chatGroup.groupApply;
        }
        if (NullChecker.m82486a(groupApply) && TEnum.equals(groupApply.status, "default")) {
            vText.setBackground(getResources().getDrawable(ibc0.f114112q0));
            vText.setText(R$string.f21866y);
            vText.setTextColor(getResources().getColor(g9c0.f102808Z));
        } else if (NullChecker.m82486a(groupApply) && TEnum.equals(groupApply.status, "approved")) {
            vText.setBackground(getResources().getDrawable(ibc0.f114103p0));
            vText.setText(R$string.f21578Q);
            vText.setTextColor(getResources().getColor(g9c0.f102810a0));
        } else {
            vText.setBackground(getResources().getDrawable(ibc0.f114103p0));
            vText.setText(R$string.f21474D);
            vText.setTextColor(getResources().getColor(g9c0.f102810a0));
        }
        bnl0.m105509E0(vText, new View.OnClickListener() { // from class: l.gz8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107176a.m37539y(chatGroup, groupApply, view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final GroupApply m37534t(final String str, List<GroupApply> list) {
        if (jyb.m147479J(list)) {
            return null;
        }
        return (GroupApply) jyb.m147529r(list, new qcj() { // from class: l.iz8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((GroupApply) obj).groupId, str));
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public int m37535u(ChatGroup chatGroup) {
        for (int i = 0; i < this.f22292i.size(); i++) {
            if (TextUtils.equals(this.f22292i.get(i).f56859id, chatGroup.f56859id)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: v */
    public final void m37536v() {
        jyb.m147537z(jyb.m147507f0(this.f22285b, this.f22286c, this.f22287d, this.f22288e), new y20() { // from class: l.sz8
            @Override // p153l.y20
            public final void call(Object obj) {
                bnl0.m105524M((View) obj, false);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m37537w(VLinear vLinear, ChatGroupTag chatGroupTag) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, qa00.m175859d(14.0f));
        VText vText = new VText(getContext());
        vText.setGravity(16);
        vText.setText(chatGroupTag.name);
        vText.setTextSize(9.0f);
        vText.setTextColor(Color.parseColor("#4C000000"));
        vText.setBackgroundDrawable(CoreModule.f18263b.getDrawable(ibc0.f114121r0));
        vText.setPadding(qa00.m175859d(5.0f), 0, qa00.m175859d(5.0f), 0);
        layoutParams.rightMargin = qa00.m175859d(4.0f);
        vText.setLayoutParams(layoutParams);
        vLinear.addView(vText);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m37538x(Conversation conversation) {
        m37531q().startActivity(MessagesAct.m50126k2(m37531q(), conversation.f56859id, false, false));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m37539y(ChatGroup chatGroup, GroupApply groupApply, View view) {
        sfj0.m185598e("e_enter_group_chat", "p_circle_detail", pf60.m172085a("circle_detail_tab", "group"), pf60.m172085a("group_name", chatGroup.name), pf60.m172085a("is_anonymou_group", Integer.valueOf(jek.m144587s(chatGroup) ? 1 : 0)), pf60.m172085a("groupchat_id", chatGroup.f56859id));
        if (CoreModule.m30930K().me_().isBanned()) {
            o1j0.m165649w(R$string.f21507H0);
            return;
        }
        if (TEnum.equals(groupApply.status, "default")) {
            return;
        }
        if (!TEnum.equals(groupApply.status, "approved")) {
            jek.m144588t(m37531q(), chatGroup.f56859id, "", "suggest");
        } else if (CoreModule.m30930K().me_().isBanned()) {
            o1j0.m165649w(R$string.f21507H0);
        } else {
            m37531q().duringCreated(CoreModule.f18264c.f20384f0.m33619Dg(chatGroup.f56859id)).filter(new sb8()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.hz8
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f112217a.m37538x((Conversation) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m37540z(View view) {
        m37531q().startActivity(new Intent(m37531q(), (Class<?>) GroupSuggestAct.class));
    }

    public CoreGroupChatHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreGroupChatHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
