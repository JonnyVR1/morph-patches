package com.p000p1.mobile.putong.core.newui.group;

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
import com.p000p1.mobile.putong.core.newui.group.CoreGroupChatHeaderView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupTag;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.GroupApply;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.group.GroupProfileAct;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import l.a1c0;
import l.c3c0;
import l.e30;
import l.j760;
import l.jo0;
import l.l6c0;
import l.lsi0;
import l.ly8;
import l.mkd0;
import l.o6j0;
import l.oa8;
import l.qib0;
import l.roj0;
import l.t100;
import l.tbk;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.y4c0;
import p009l.o7r;
import rx.subjects.b;
import v.VDraweeView;
import v.VLinear;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CoreGroupChatHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: l */
    public static b<Boolean> f319l = b.b();

    /* JADX INFO: renamed from: a */
    public CoreGroupChatHeaderView f320a;

    /* JADX INFO: renamed from: b */
    public VRelative f321b;

    /* JADX INFO: renamed from: c */
    public VText f322c;

    /* JADX INFO: renamed from: d */
    public VText f323d;

    /* JADX INFO: renamed from: e */
    public VLinear f324e;

    /* JADX INFO: renamed from: f */
    public VRelative f325f;

    /* JADX INFO: renamed from: g */
    public VText f326g;

    /* JADX INFO: renamed from: h */
    public VText f327h;

    /* JADX INFO: renamed from: i */
    public List<ChatGroup> f328i;

    /* JADX INFO: renamed from: j */
    public List<GroupApply> f329j;

    /* JADX INFO: renamed from: k */
    public String f330k;

    public CoreGroupChatHeaderView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m433c(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m435e(Throwable th) {
    }

    /* JADX INFO: renamed from: A */
    public final /* synthetic */ void m446A(View view) {
        CoreModule.Q().m9067rh(m457q());
    }

    /* JADX INFO: renamed from: B */
    public final /* synthetic */ void m447B(roj0 roj0Var) {
        m455J();
    }

    /* JADX INFO: renamed from: C */
    public final /* synthetic */ void m448C(Boolean bool) {
        xdl0.M(this.f325f, false);
    }

    /* JADX INFO: renamed from: D */
    public final /* synthetic */ void m449D(e30 e30Var, CoreData coreData) {
        List<ChatGroup> list = coreData.chatGroups;
        this.f328i = list;
        List<GroupApply> list2 = coreData.groupApplies;
        this.f329j = list2;
        m454I(list, list2, e30Var);
    }

    /* JADX INFO: renamed from: E */
    public final /* synthetic */ void m450E(e30 e30Var, Throwable th) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
        m462v();
    }

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ void m451F(ChatGroup chatGroup, View view) {
        m457q().startActivity(GroupProfileAct.Z1(m457q(), ((DbObject) chatGroup).id, chatGroup, false));
        o6j0.e("e_group_chat_list", "p_circle_detail", new j760[]{j760.a("circle_detail_tab", "group"), j760.a("group_name", chatGroup.name), j760.a("groupchat_id", ((DbObject) chatGroup).id)});
    }

    /* JADX INFO: renamed from: G */
    public final void m452G(ChatGroup chatGroup) {
        VText vText;
        int iM461u = m461u(chatGroup);
        if (iM461u == -1 || iM461u > this.f324e.getChildCount() + 1 || (vText = (VText) this.f324e.getChildAt(iM461u).findViewById(y4c0.F1)) == null) {
            return;
        }
        m459s(chatGroup, chatGroup.groupApply, vText);
    }

    /* JADX INFO: renamed from: H */
    public void m453H(String str, String str2, final e30<Boolean> e30Var) {
        this.f330k = str;
        m457q().duringCreated(CoreModule.c.g0.p6(str2)).subscribe(mkd0.H(new e30() { // from class: l.hy8
            public final void call(Object obj) {
                this.f14302a.m449D(e30Var, (CoreData) obj);
            }
        }, new e30() { // from class: l.iy8
            public final void call(Object obj) {
                this.f14857a.m450E(e30Var, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public final void m454I(List<ChatGroup> list, List<GroupApply> list2, e30<Boolean> e30Var) {
        if (list == null || list.size() == 0) {
            if (NullChecker.a(e30Var)) {
                e30Var.call(Boolean.FALSE);
            }
            m462v();
            return;
        }
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.TRUE);
        }
        this.f324e.removeAllViews();
        for (int i = 0; i < list.size(); i++) {
            final ChatGroup chatGroup = list.get(i);
            o6j0.l("e_group_chat_list", "p_circle_detail", new j760[]{j760.a("circle_detail_tab", "group"), j760.a("group_name", chatGroup.name), j760.a("groupchat_id", ((DbObject) chatGroup).id)});
            View viewInflate = o7r.m19649a(getContext()).inflate(l6c0.g0, (ViewGroup) null);
            VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(y4c0.c1);
            VText vText = (VText) viewInflate.findViewById(y4c0.F1);
            TextPaint paint = vText.getPaint();
            if (NullChecker.a(paint)) {
                paint.setFakeBoldText(true);
            }
            VText vTextFindViewById = viewInflate.findViewById(y4c0.E2);
            TextPaint paint2 = vTextFindViewById.getPaint();
            if (NullChecker.a(paint2)) {
                paint2.setFakeBoldText(true);
            }
            VText vTextFindViewById2 = viewInflate.findViewById(y4c0.Z);
            VLinear vLinear = (VLinear) viewInflate.findViewById(y4c0.u4);
            vTextFindViewById2.setText(chatGroup.description);
            vTextFindViewById.setText(chatGroup.name);
            if (chatGroup.avatars.size() > 0) {
                qib0.G.Z0(vDraweeViewFindViewById, ((Picture) chatGroup.avatars.get(0)).cover().profileSmall().formatted());
            }
            m459s(chatGroup, m460t(((DbObject) chatGroup).id, list2), vText);
            m458r(vLinear, chatGroup);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -2);
            layoutParams.height = t100.d(76.0f);
            viewInflate.setLayoutParams(layoutParams);
            xdl0.E0(viewInflate, new View.OnClickListener() { // from class: l.xx8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22753a.m451F(chatGroup, view);
                }
            });
            this.f324e.addView(viewInflate);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m455J() {
        GroupApply groupApply;
        HashMap mapB6 = CoreModule.c.g0.B6();
        for (final String str : mapB6.keySet()) {
            ChatGroup chatGroup = (ChatGroup) vwb.r(this.f328i, new w9j() { // from class: l.jy8
                public final Object call(Object obj) {
                    return Boolean.valueOf(((DbObject) ((ChatGroup) obj)).id.equals(str));
                }
            });
            if (NullChecker.a(chatGroup) && (groupApply = (GroupApply) mapB6.get(str)) != null && !TEnum.equals(chatGroup.groupApply.status, groupApply.status)) {
                chatGroup.groupApply.status = groupApply.status;
                m452G(chatGroup);
            }
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m456p(this);
        TextPaint paint = this.f322c.getPaint();
        if (NullChecker.a(paint)) {
            paint.setFakeBoldText(true);
        }
        TextPaint paint2 = this.f323d.getPaint();
        if (NullChecker.a(paint2)) {
            paint2.setFakeBoldText(true);
        }
        TextPaint paint3 = this.f326g.getPaint();
        if (NullChecker.a(paint3)) {
            paint3.setFakeBoldText(true);
        }
        TextPaint paint4 = this.f327h.getPaint();
        if (NullChecker.a(paint4)) {
            paint4.setFakeBoldText(true);
        }
        xdl0.E0(this.f323d, new View.OnClickListener() { // from class: l.wx8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22352a.m466z(view);
            }
        });
        xdl0.E0(this.f327h, new View.OnClickListener() { // from class: l.cy8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10817a.m446A(view);
            }
        });
        CoreModule.c.g0.B6().clear();
        m457q().duringCreated(CoreModule.c.g0.A6()).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.dy8
            public final void call(Object obj) {
                this.f12044a.m447B((roj0) obj);
            }
        }, new e30() { // from class: l.ey8
            public final void call(Object obj) {
                CoreGroupChatHeaderView.m435e((Throwable) obj);
            }
        }));
        m457q().duringCreated(f319l).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.fy8
            public final void call(Object obj) {
                this.f13222a.m448C((Boolean) obj);
            }
        }, new e30() { // from class: l.gy8
            public final void call(Object obj) {
                CoreGroupChatHeaderView.m433c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p */
    public final void m456p(View view) {
        ly8.a(this, view);
    }

    /* JADX INFO: renamed from: q */
    public Act m457q() {
        return getContext();
    }

    /* JADX INFO: renamed from: r */
    public void m458r(final VLinear vLinear, ChatGroup chatGroup) {
        if (vLinear.getChildCount() > 0) {
            vLinear.removeAllViews();
        }
        xdl0.M(vLinear, chatGroup.tags.size() > 0);
        if (chatGroup.tags.size() > 0) {
            vwb.z(chatGroup.tags, new e30() { // from class: l.by8
                public final void call(Object obj) {
                    this.f10355a.m463w(vLinear, (ChatGroupTag) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: s */
    public void m459s(final ChatGroup chatGroup, final GroupApply groupApply, VText vText) {
        if (groupApply == null) {
            groupApply = chatGroup.groupApply;
        }
        if (NullChecker.a(groupApply) && TEnum.equals(groupApply.status, "default")) {
            vText.setBackground(getResources().getDrawable(c3c0.q0));
            vText.setText(R.string.y);
            vText.setTextColor(getResources().getColor(a1c0.Z));
        } else if (NullChecker.a(groupApply) && TEnum.equals(groupApply.status, "approved")) {
            vText.setBackground(getResources().getDrawable(c3c0.p0));
            vText.setText(R.string.Q);
            vText.setTextColor(getResources().getColor(a1c0.a0));
        } else {
            vText.setBackground(getResources().getDrawable(c3c0.p0));
            vText.setText(R.string.D);
            vText.setTextColor(getResources().getColor(a1c0.a0));
        }
        xdl0.E0(vText, new View.OnClickListener() { // from class: l.yx8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23264a.m465y(chatGroup, groupApply, view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final GroupApply m460t(final String str, List<GroupApply> list) {
        if (vwb.J(list)) {
            return null;
        }
        return (GroupApply) vwb.r(list, new w9j() { // from class: l.ay8
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((GroupApply) obj).groupId, str));
            }
        });
    }

    /* JADX INFO: renamed from: u */
    public int m461u(ChatGroup chatGroup) {
        for (int i = 0; i < this.f328i.size(); i++) {
            if (TextUtils.equals(((DbObject) this.f328i.get(i)).id, ((DbObject) chatGroup).id)) {
                return i;
            }
        }
        return -1;
    }

    /* JADX INFO: renamed from: v */
    public final void m462v() {
        vwb.z(vwb.f0(new View[]{this.f321b, this.f322c, this.f323d, this.f324e}), new e30() { // from class: l.ky8
            public final void call(Object obj) {
                xdl0.M((View) obj, false);
            }
        });
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m463w(VLinear vLinear, ChatGroupTag chatGroupTag) {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, t100.d(14.0f));
        VText vText = new VText(getContext());
        vText.setGravity(16);
        vText.setText(chatGroupTag.name);
        vText.setTextSize(9.0f);
        vText.setTextColor(Color.parseColor("#4C000000"));
        vText.setBackgroundDrawable(CoreModule.b.getDrawable(c3c0.r0));
        vText.setPadding(t100.d(5.0f), 0, t100.d(5.0f), 0);
        layoutParams.rightMargin = t100.d(4.0f);
        vText.setLayoutParams(layoutParams);
        vLinear.addView(vText);
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m464x(Conversation conversation) {
        m457q().startActivity(MessagesAct.i2(m457q(), ((DbObject) conversation).id, false, false));
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m465y(ChatGroup chatGroup, GroupApply groupApply, View view) {
        o6j0.e("e_enter_group_chat", "p_circle_detail", new j760[]{j760.a("circle_detail_tab", "group"), j760.a("group_name", chatGroup.name), j760.a("is_anonymou_group", Integer.valueOf(tbk.s(chatGroup) ? 1 : 0)), j760.a("groupchat_id", ((DbObject) chatGroup).id)});
        if (CoreModule.K().me_().isBanned()) {
            lsi0.w(R.string.H0);
            return;
        }
        if (TEnum.equals(groupApply.status, "default")) {
            return;
        }
        if (!TEnum.equals(groupApply.status, "approved")) {
            tbk.t(m457q(), ((DbObject) chatGroup).id, "", "suggest");
        } else if (CoreModule.K().me_().isBanned()) {
            lsi0.w(R.string.H0);
        } else {
            m457q().duringCreated(CoreModule.c.f0.Dg(((DbObject) chatGroup).id)).filter(new oa8()).take(1).subscribe(mkd0.G(new e30() { // from class: l.zx8
                public final void call(Object obj) {
                    this.f24018a.m464x((Conversation) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m466z(View view) {
        m457q().startActivity(new Intent((Context) m457q(), (Class<?>) GroupSuggestAct.class));
    }

    public CoreGroupChatHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CoreGroupChatHeaderView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
