package com.p046p1.mobile.putong.core.newui.group;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupTag;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.GroupApply;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.group.CoreGroupChatHeaderView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.group.GroupProfileAct;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p133rx.subjects.C22393b;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VRelative;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.e30;
import p149l.j760;
import p149l.jo0;
import p149l.l6c0;
import p149l.lsi0;
import p149l.ly8;
import p149l.mkd0;
import p149l.o6j0;
import p149l.o7r;
import p149l.oa8;
import p149l.qib0;
import p149l.roj0;
import p149l.t100;
import p149l.tbk;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.y4c0;

/* JADX INFO: loaded from: classes11.dex */
public class CoreGroupChatHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: l */
    public static C22393b<Boolean> f21541l = C22393b.m221521b();

    /* JADX INFO: renamed from: a */
    public CoreGroupChatHeaderView f21542a;

    /* JADX INFO: renamed from: b */
    public VRelative f21543b;

    /* JADX INFO: renamed from: c */
    public VText f21544c;

    /* JADX INFO: renamed from: d */
    public VText f21545d;

    /* JADX INFO: renamed from: e */
    public VLinear f21546e;

    /* JADX INFO: renamed from: f */
    public VRelative f21547f;

    /* JADX INFO: renamed from: g */
    public VText f21548g;

    /* JADX INFO: renamed from: h */
    public VText f21549h;

    /* JADX INFO: renamed from: i */
    public List<ChatGroup> f21550i;

    /* JADX INFO: renamed from: j */
    public List<GroupApply> f21551j;

    /* JADX INFO: renamed from: k */
    public String f21552k;

    public CoreGroupChatHeaderView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m36504c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m36506e(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m36517A(View view) {
        CoreModule.m29936Q().mo67282rh(m36528q());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m36518B(roj0 roj0Var) {
        m36526J();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m36519C(Boolean bool) {
        xdl0.m208344M(this.f21547f, false);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m36520D(e30 e30Var, CoreData coreData) {
        List<ChatGroup> list = coreData.chatGroups;
        this.f21550i = list;
        List<GroupApply> list2 = coreData.groupApplies;
        this.f21551j = list2;
        m36525I(list, list2, e30Var);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m36521E(e30 e30Var, Throwable th) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
        m36533v();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m36522F(ChatGroup chatGroup, View view) {
        m36528q().startActivity(GroupProfileAct.m49107Z1(m36528q(), chatGroup.f56011id, chatGroup, false));
        o6j0.m162861e("e_group_chat_list", "p_circle_detail", j760.m140076a("circle_detail_tab", "group"), j760.m140076a("group_name", chatGroup.name), j760.m140076a("groupchat_id", chatGroup.f56011id));
    }

    /* JADX INFO: renamed from: G */
    public final void m36523G(ChatGroup chatGroup) {
        VText vText;
        int iM36532u = m36532u(chatGroup);
        if (iM36532u == -1 || iM36532u > this.f21546e.getChildCount() + 1 || (vText = (VText) this.f21546e.getChildAt(iM36532u).findViewById(y4c0.f195963F1)) == null) {
            return;
        }
        m36530s(chatGroup, chatGroup.groupApply, vText);
    }

    /* JADX INFO: renamed from: H */
    public void m36524H(String str, String str2, final e30<Boolean> e30Var) {
        this.f21552k = str;
        m36528q().duringCreated(CoreModule.f17545c.f19645g0.m31911p6(str2)).subscribe(mkd0.m154956H(new e30() { // from class: l.hy8
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f110036a.m36520D(e30Var, (CoreData) obj);
            }
        }, new e30() { // from class: l.iy8
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115434a.m36521E(e30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public final void m36525I(List<ChatGroup> list, List<GroupApply> list2, e30<Boolean> e30Var) {
        if (list == null || list.size() == 0) {
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call(Boolean.FALSE);
            }
            m36533v();
            return;
        }
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.TRUE);
        }
        this.f21546e.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            final ChatGroup chatGroup = list.get(i);
            o6j0.m162868l("e_group_chat_list", "p_circle_detail", j760.m140076a("circle_detail_tab", "group"), j760.m140076a("group_name", chatGroup.name), j760.m140076a("groupchat_id", chatGroup.f56011id));
            View viewInflate = o7r.m163037a(getContext()).inflate(l6c0.f126474g0, (ViewGroup) null);
            VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(y4c0.f196103c1);
            VText vText = (VText) viewInflate.findViewById(y4c0.f195963F1);
            TextPaint paint = vText.getPaint();
            if (NullChecker.m81303a(paint)) {
                paint.setFakeBoldText(true);
            }
            VText vText2 = (VText) viewInflate.findViewById(y4c0.f195958E2);
            TextPaint paint2 = vText2.getPaint();
            if (NullChecker.m81303a(paint2)) {
                paint2.setFakeBoldText(true);
            }
            VText vText3 = (VText) viewInflate.findViewById(y4c0.f196081Z);
            VLinear vLinear = (VLinear) viewInflate.findViewById(y4c0.f196232u4);
            vText3.setText(chatGroup.description);
            vText2.setText(chatGroup.name);
            if (chatGroup.avatars.size() > 0) {
                qib0.f154691G.m102356Z0(vDraweeView, chatGroup.avatars.get(0).cover().profileSmall().formatted());
            }
            m36530s(chatGroup, m36531t(chatGroup.f56011id, list2), vText);
            m36529r(vLinear, chatGroup);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            layoutParams.height = t100.m186890d(76.0f);
            viewInflate.setLayoutParams(layoutParams);
            xdl0.m208329E0(viewInflate, new View.OnClickListener() { // from class: l.xx8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f194816a.m36522F(chatGroup, view);
                }
            });
            this.f21546e.addView(viewInflate);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m36526J() {
        GroupApply groupApply;
        HashMap<String, GroupApply> mapM31791B6 = CoreModule.f17545c.f19645g0.m31791B6();
        for (final String str : mapM31791B6.keySet()) {
            ChatGroup chatGroup = (ChatGroup) vwb.m200346r(this.f21550i, new w9j() { // from class: l.jy8
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((ChatGroup) obj).f56011id.equals(str));
                }
            });
            if (NullChecker.m81303a(chatGroup) && (groupApply = mapM31791B6.get(str)) != null && !TEnum.equals(chatGroup.groupApply.status, groupApply.status)) {
                chatGroup.groupApply.status = groupApply.status;
                m36523G(chatGroup);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36527p(this);
        TextPaint paint = this.f21544c.getPaint();
        if (NullChecker.m81303a(paint)) {
            paint.setFakeBoldText(true);
        }
        TextPaint paint2 = this.f21545d.getPaint();
        if (NullChecker.m81303a(paint2)) {
            paint2.setFakeBoldText(true);
        }
        TextPaint paint3 = this.f21548g.getPaint();
        if (NullChecker.m81303a(paint3)) {
            paint3.setFakeBoldText(true);
        }
        TextPaint paint4 = this.f21549h.getPaint();
        if (NullChecker.m81303a(paint4)) {
            paint4.setFakeBoldText(true);
        }
        xdl0.m208329E0(this.f21545d, new View.OnClickListener() { // from class: l.wx8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188433a.m36537z(view);
            }
        });
        xdl0.m208329E0(this.f21549h, new View.OnClickListener() { // from class: l.cy8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82931a.m36517A(view);
            }
        });
        CoreModule.f17545c.f19645g0.m31791B6().clear();
        m36528q().duringCreated(CoreModule.f17545c.f19645g0.m31788A6()).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.dy8
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88354a.m36518B((roj0) obj);
            }
        }, new e30() { // from class: l.ey8
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreGroupChatHeaderView.m36506e((Throwable) obj);
            }
        }));
        m36528q().duringCreated(f21541l).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.fy8
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99840a.m36519C((Boolean) obj);
            }
        }, new e30() { // from class: l.gy8
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreGroupChatHeaderView.m36504c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final void m36527p(View view) {
        ly8.m152119a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public Act m36528q() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: r */
    public void m36529r(final VLinear vLinear, ChatGroup chatGroup) {
        if (vLinear.getChildCount() > 0) {
            vLinear.removeAllViews();
        }
        xdl0.m208344M(vLinear, chatGroup.tags.size() > 0);
        if (chatGroup.tags.size() > 0) {
            vwb.m200354z(chatGroup.tags, new e30() { // from class: l.by8
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f77887a.m36534w(vLinear, (ChatGroupTag) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public void m36530s(final ChatGroup chatGroup, final GroupApply groupApply, VText vText) {
        if (groupApply == null) {
            groupApply = chatGroup.groupApply;
        }
        if (NullChecker.m81303a(groupApply) && TEnum.equals(groupApply.status, "default")) {
            vText.setBackground(getResources().getDrawable(c3c0.f78837q0));
            vText.setText(R$string.f21124y);
            vText.setTextColor(getResources().getColor(a1c0.f67144Z));
        } else if (NullChecker.m81303a(groupApply) && TEnum.equals(groupApply.status, "approved")) {
            vText.setBackground(getResources().getDrawable(c3c0.f78828p0));
            vText.setText(R$string.f20836Q);
            vText.setTextColor(getResources().getColor(a1c0.f67146a0));
        } else {
            vText.setBackground(getResources().getDrawable(c3c0.f78828p0));
            vText.setText(R$string.f20732D);
            vText.setTextColor(getResources().getColor(a1c0.f67146a0));
        }
        xdl0.m208329E0(vText, new View.OnClickListener() { // from class: l.yx8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f200579a.m36536y(chatGroup, groupApply, view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final GroupApply m36531t(final String str, List<GroupApply> list) {
        if (vwb.m200296J(list)) {
            return null;
        }
        return (GroupApply) vwb.m200346r(list, new w9j() { // from class: l.ay8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((GroupApply) obj).groupId, str));
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public int m36532u(ChatGroup chatGroup) {
        for (int i = 0; i < this.f21550i.size(); i++) {
            if (TextUtils.equals(this.f21550i.get(i).f56011id, chatGroup.f56011id)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: v */
    public final void m36533v() {
        vwb.m200354z(vwb.m200324f0(this.f21543b, this.f21544c, this.f21545d, this.f21546e), new e30() { // from class: l.ky8
            @Override // p149l.e30
            public final void call(Object obj) {
                xdl0.m208344M((View) obj, false);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m36534w(VLinear vLinear, ChatGroupTag chatGroupTag) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, t100.m186890d(14.0f));
        VText vText = new VText(getContext());
        vText.setGravity(16);
        vText.setText(chatGroupTag.name);
        vText.setTextSize(9.0f);
        vText.setTextColor(Color.parseColor("#4C000000"));
        vText.setBackgroundDrawable(CoreModule.f17544b.getDrawable(c3c0.f78846r0));
        vText.setPadding(t100.m186890d(5.0f), 0, t100.m186890d(5.0f), 0);
        layoutParams.rightMargin = t100.m186890d(4.0f);
        vText.setLayoutParams(layoutParams);
        vLinear.addView(vText);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m36535x(Conversation conversation) {
        m36528q().startActivity(MessagesAct.m48943i2(m36528q(), conversation.f56011id, false, false));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m36536y(ChatGroup chatGroup, GroupApply groupApply, View view) {
        o6j0.m162861e("e_enter_group_chat", "p_circle_detail", j760.m140076a("circle_detail_tab", "group"), j760.m140076a("group_name", chatGroup.name), j760.m140076a("is_anonymou_group", Integer.valueOf(tbk.m187872s(chatGroup) ? 1 : 0)), j760.m140076a("groupchat_id", chatGroup.f56011id));
        if (CoreModule.m29932K().me_().isBanned()) {
            lsi0.m151593w(R$string.f20765H0);
            return;
        }
        if (TEnum.equals(groupApply.status, "default")) {
            return;
        }
        if (!TEnum.equals(groupApply.status, "approved")) {
            tbk.m187873t(m36528q(), chatGroup.f56011id, "", "suggest");
        } else if (CoreModule.m29932K().me_().isBanned()) {
            lsi0.m151593w(R$string.f20765H0);
        } else {
            m36528q().duringCreated(CoreModule.f17545c.f19642f0.m32616Dg(chatGroup.f56011id)).filter(new oa8()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.zx8
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f205387a.m36535x((Conversation) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m36537z(View view) {
        m36528q().startActivity(new Intent(m36528q(), (Class<?>) GroupSuggestAct.class));
    }

    public CoreGroupChatHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreGroupChatHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
