package com.p051p1.mobile.putong.core.p058ui.messages.group;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VFrame_Squared;
import p151v.VText;
import p153l.bnl0;
import p153l.ibc0;
import p153l.jek;
import p153l.jyb;
import p153l.uqb0;

/* JADX INFO: loaded from: classes3.dex */
public class GroupSetMemberItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VFrame_Squared f32646a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f32647b;

    /* JADX INFO: renamed from: c */
    public VText f32648c;

    /* JADX INFO: renamed from: d */
    public VText f32649d;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.group.GroupSetMemberItemView$a */
    public static class C8690a {
        /* JADX INFO: renamed from: b */
        public static void m50318b(GroupSetMemberItemView groupSetMemberItemView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            groupSetMemberItemView.f32646a = (VFrame_Squared) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            groupSetMemberItemView.f32647b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            groupSetMemberItemView.f32648c = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(1);
            groupSetMemberItemView.f32649d = (VText) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
        }
    }

    public GroupSetMemberItemView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: e */
    public final void m50315e(View view) {
        C8690a.m50318b(this, view);
    }

    /* JADX INFO: renamed from: f */
    public void m50316f(ChatGroup chatGroup, ChatGroupMember chatGroupMember, boolean z, boolean z2) {
        if (z2 || chatGroupMember == null) {
            bnl0.m105524M(this.f32648c, false);
            this.f32647b.setImageResource(ibc0.f114175x0);
            this.f32649d.setText(R$string.f21498G);
            return;
        }
        bnl0.m105524M(this.f32648c, true);
        if (TextUtils.equals(chatGroup.ownerUserId, chatGroupMember.userId)) {
            this.f32648c.setText(R$string.f21570P);
            this.f32648c.setBackgroundResource(ibc0.f114193z0);
        } else if (jyb.m147479J(chatGroup.adminUserIds) || !chatGroup.adminUserIds.contains(chatGroupMember.userId)) {
            bnl0.m105524M(this.f32648c, false);
        } else {
            this.f32648c.setText(R$string.f21594S);
            this.f32648c.setBackgroundResource(ibc0.f114184y0);
        }
        User userById = CoreModule.m30930K().getUserById(chatGroupMember.userId);
        if (z) {
            uqb0.f180374G.m127140Z0(this.f32647b, jek.m144578j(chatGroupMember));
        } else if (!TextUtils.isEmpty(chatGroupMember.avatar)) {
            if (TextUtils.equals(chatGroupMember.userId, CoreModule.m30929H().userId())) {
                uqb0.f180374G.m127140Z0(this.f32647b, NullChecker.m82486a(userById) ? userById.pictures.get(0).url : chatGroupMember.avatar);
            } else if (NullChecker.m82486a(userById) && userById.isBanedOrInactivated()) {
                uqb0.f180374G.m127138Y0(this.f32647b, CoreModule.m30933P().m143412i().mo180398T0());
            } else {
                uqb0.f180374G.m127140Z0(this.f32647b, chatGroupMember.avatar);
            }
        }
        if (NullChecker.m82486a(userById) && !userById.isMe() && userById.isBanedOrInactivated()) {
            this.f32649d.setText(userById.publicId);
        } else {
            this.f32649d.setText(chatGroupMember.groupMemberName());
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50315e(this);
    }

    public GroupSetMemberItemView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GroupSetMemberItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
