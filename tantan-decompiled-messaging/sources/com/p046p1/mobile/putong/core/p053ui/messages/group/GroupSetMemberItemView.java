package com.p046p1.mobile.putong.core.p053ui.messages.group;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VFrame_Squared;
import p147v.VText;
import p149l.c3c0;
import p149l.qib0;
import p149l.tbk;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes3.dex */
public class GroupSetMemberItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VFrame_Squared f31798a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f31799b;

    /* JADX INFO: renamed from: c */
    public VText f31800c;

    /* JADX INFO: renamed from: d */
    public VText f31801d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.GroupSetMemberItemView$a */
    public static class C8527a {
        /* JADX INFO: renamed from: b */
        public static void m49135b(GroupSetMemberItemView groupSetMemberItemView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            groupSetMemberItemView.f31798a = (VFrame_Squared) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            groupSetMemberItemView.f31799b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            groupSetMemberItemView.f31800c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            groupSetMemberItemView.f31801d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        }
    }

    public GroupSetMemberItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m49132e(View view) {
        C8527a.m49135b(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m49133f(ChatGroup chatGroup, ChatGroupMember chatGroupMember, boolean z, boolean z2) {
        if (z2 || chatGroupMember == null) {
            xdl0.m208344M(this.f31800c, false);
            this.f31799b.setImageResource(c3c0.f78900x0);
            this.f31801d.setText(R$string.f20756G);
            return;
        }
        xdl0.m208344M(this.f31800c, true);
        if (TextUtils.equals(chatGroup.ownerUserId, chatGroupMember.userId)) {
            this.f31800c.setText(R$string.f20828P);
            this.f31800c.setBackgroundResource(c3c0.f78918z0);
        } else if (vwb.m200296J(chatGroup.adminUserIds) || !chatGroup.adminUserIds.contains(chatGroupMember.userId)) {
            xdl0.m208344M(this.f31800c, false);
        } else {
            this.f31800c.setText(R$string.f20852S);
            this.f31800c.setBackgroundResource(c3c0.f78909y0);
        }
        User userById = CoreModule.m29932K().getUserById(chatGroupMember.userId);
        if (z) {
            qib0.f154691G.m102356Z0(this.f31799b, tbk.m187863j(chatGroupMember));
        } else if (!TextUtils.isEmpty(chatGroupMember.avatar)) {
            if (TextUtils.equals(chatGroupMember.userId, CoreModule.m29931H().userId())) {
                qib0.f154691G.m102356Z0(this.f31799b, NullChecker.m81303a(userById) ? userById.pictures.get(0).url : chatGroupMember.avatar);
            } else if (NullChecker.m81303a(userById) && userById.isBanedOrInactivated()) {
                qib0.f154691G.m102354Y0(this.f31799b, CoreModule.m29935P().m94658i().mo158306T0());
            } else {
                qib0.f154691G.m102356Z0(this.f31799b, chatGroupMember.avatar);
            }
        }
        if (NullChecker.m81303a(userById) && !userById.isMe() && userById.isBanedOrInactivated()) {
            this.f31801d.setText(userById.publicId);
        } else {
            this.f31801d.setText(chatGroupMember.groupMemberName());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49132e(this);
    }

    public GroupSetMemberItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GroupSetMemberItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
