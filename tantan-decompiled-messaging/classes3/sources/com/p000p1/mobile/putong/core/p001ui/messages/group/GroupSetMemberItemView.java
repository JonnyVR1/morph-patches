package com.p000p1.mobile.putong.core.p001ui.messages.group;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.c3c0;
import l.qib0;
import l.vwb;
import l.xdl0;
import p003l.tbk;
import p028v.VDraweeView;
import p028v.VFrame_Squared;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class GroupSetMemberItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VFrame_Squared f1689a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f1690b;

    /* JADX INFO: renamed from: c */
    public VText f1691c;

    /* JADX INFO: renamed from: d */
    public VText f1692d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.GroupSetMemberItemView$a */
    public static class C0110a {
        /* JADX INFO: renamed from: b */
        public static void m2248b(GroupSetMemberItemView groupSetMemberItemView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            groupSetMemberItemView.f1689a = (VFrame_Squared) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            groupSetMemberItemView.f1690b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            groupSetMemberItemView.f1691c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            groupSetMemberItemView.f1692d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        }
    }

    public GroupSetMemberItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m2245e(View view) {
        C0110a.m2248b(this, view);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: f */
    public void m2246f(ChatGroup chatGroup, ChatGroupMember chatGroupMember, boolean z, boolean z2) {
        if (z2 || chatGroupMember == null) {
            xdl0.M(this.f1691c, false);
            this.f1690b.setImageResource(c3c0.x0);
            this.f1692d.setText(R.string.G);
            return;
        }
        xdl0.M(this.f1691c, true);
        if (TextUtils.equals(chatGroup.ownerUserId, chatGroupMember.userId)) {
            this.f1691c.setText(R.string.P);
            this.f1691c.setBackgroundResource(c3c0.z0);
        } else if (vwb.J(chatGroup.adminUserIds) || !chatGroup.adminUserIds.contains(chatGroupMember.userId)) {
            xdl0.M(this.f1691c, false);
        } else {
            this.f1691c.setText(R.string.S);
            this.f1691c.setBackgroundResource(c3c0.y0);
        }
        User userById = CoreModule.K().getUserById(chatGroupMember.userId);
        if (z) {
            qib0.G.Z0(this.f1690b, tbk.m7716j(chatGroupMember));
        } else if (!TextUtils.isEmpty(chatGroupMember.avatar)) {
            if (TextUtils.equals(chatGroupMember.userId, CoreModule.H().userId())) {
                qib0.G.Z0(this.f1690b, NullChecker.a(userById) ? ((Media) userById.pictures.get(0)).url : chatGroupMember.avatar);
            } else if (NullChecker.a(userById) && userById.isBanedOrInactivated()) {
                qib0.G.Y0(this.f1690b, CoreModule.P().i().T0());
            } else {
                qib0.G.Z0(this.f1690b, chatGroupMember.avatar);
            }
        }
        if (NullChecker.a(userById) && !userById.isMe() && userById.isBanedOrInactivated()) {
            this.f1692d.setText(userById.publicId);
        } else {
            this.f1692d.setText(chatGroupMember.groupMemberName());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2245e(this);
    }

    public GroupSetMemberItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GroupSetMemberItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
