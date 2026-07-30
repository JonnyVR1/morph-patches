package com.p051p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.GroupApplyStatus;
import com.p051p1.mobile.putong.core.data.GroupNotification;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.group.GroupNotificationItemView;
import com.p051p1.mobile.putong.core.p058ui.messages.view.GroupMemberAvatarFrame;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.ibc0;
import p153l.jek;
import p153l.pzi0;
import p153l.uqb0;
import p153l.yik;

/* JADX INFO: loaded from: classes11.dex */
public class GroupNotificationItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public GroupMemberAvatarFrame f22295a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f22296b;

    /* JADX INFO: renamed from: c */
    public VText f22297c;

    /* JADX INFO: renamed from: d */
    public VText f22298d;

    /* JADX INFO: renamed from: e */
    public VText f22299e;

    /* JADX INFO: renamed from: f */
    public VText f22300f;

    /* JADX INFO: renamed from: g */
    public VText f22301g;

    /* JADX INFO: renamed from: h */
    public VButton f22302h;

    /* JADX INFO: renamed from: i */
    public VButton f22303i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.group.GroupNotificationItemView$a */
    public static class C8000a {
        /* JADX INFO: renamed from: b */
        public static void m37574b(GroupNotificationItemView groupNotificationItemView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            groupNotificationItemView.f22295a = (GroupMemberAvatarFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            groupNotificationItemView.f22296b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            groupNotificationItemView.f22297c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
            groupNotificationItemView.f22298d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
            groupNotificationItemView.f22299e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
            groupNotificationItemView.f22300f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
            groupNotificationItemView.f22301g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
            groupNotificationItemView.f22302h = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0);
            groupNotificationItemView.f22303i = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1);
        }
    }

    public GroupNotificationItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m37558c(View view) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m37560e(View view) {
    }

    /* JADX INFO: renamed from: o */
    public final void m37570o(View view) {
        C8000a.m37574b(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m37570o(this);
    }

    /* JADX INFO: renamed from: p */
    public void m37571p(final GroupNotification groupNotification, final yik yikVar) {
        if (groupNotification.userData == null) {
            return;
        }
        bnl0.m105509E0(this.f22295a, new View.OnClickListener() { // from class: l.hik
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                yik yikVar2 = yikVar;
                GroupNotification groupNotification2 = groupNotification;
                yikVar2.m216109q0(groupNotification2.chatGroupData, groupNotification2.userData);
            }
        });
        if (NullChecker.m82486a(groupNotification.chatGroupData) && NullChecker.m82486a(groupNotification.userData) && TEnum.equals(groupNotification.chatGroupData.groupType, "anonymous")) {
            uqb0.f180374G.m127140Z0(this.f22296b, jek.m144579k(groupNotification.userData));
        } else if (TextUtils.isEmpty(groupNotification.userData.pictures.get(0).cover().profileSmall().formatted())) {
            uqb0.f180374G.m127138Y0(this.f22296b, ibc0.f113815I0);
        } else {
            uqb0.f180374G.m127140Z0(this.f22296b, groupNotification.userData.pictures.get(0).cover().profileSmall().formatted());
        }
        this.f22297c.setText(groupNotification.userData.name);
        this.f22297c.requestLayout();
        CoreBusinessService coreBusinessServiceM143412i = CoreModule.m30933P().m143412i();
        VText vText = this.f22298d;
        User user = groupNotification.userData;
        coreBusinessServiceM143412i.mo180422X0(vText, user.gender, user.age.intValue(), false, groupNotification.userData);
        this.f22299e.setText(pzi0.f154856c.format(Double.valueOf(groupNotification.createdTime)));
        this.f22300f.setText(groupNotification.chatGroupData.name);
        if (!NullChecker.m82486a(groupNotification.groupApplyData) || TextUtils.isEmpty(groupNotification.groupApplyData.reason)) {
            this.f22301g.setVisibility(8);
        } else {
            this.f22301g.setVisibility(0);
            this.f22301g.setText(groupNotification.groupApplyData.reason);
        }
        m37572q(groupNotification, yikVar);
    }

    /* JADX INFO: renamed from: q */
    public void m37572q(final GroupNotification groupNotification, final yik yikVar) {
        if (NullChecker.m82486a(groupNotification.groupApplyData)) {
            String string = groupNotification.groupApplyData.status.toString();
            string.getClass();
            switch (string) {
                case "rejected":
                    this.f22303i.setVisibility(8);
                    this.f22302h.setVisibility(0);
                    this.f22302h.setSelected(true);
                    this.f22302h.setText(R$string.f21704f0);
                    bnl0.m105509E0(this.f22302h, new View.OnClickListener() { // from class: l.lik
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            GroupNotificationItemView.m37558c(view);
                        }
                    });
                    break;
                case "approved":
                    this.f22303i.setVisibility(0);
                    this.f22303i.setSelected(true);
                    this.f22303i.setText(R$string.f21686d0);
                    bnl0.m105509E0(this.f22303i, new View.OnClickListener() { // from class: l.kik
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            GroupNotificationItemView.m37560e(view);
                        }
                    });
                    this.f22302h.setVisibility(8);
                    break;
                case "default":
                    this.f22303i.setVisibility(0);
                    this.f22303i.setSelected(false);
                    this.f22303i.setText(R$string.f21677c0);
                    bnl0.m105509E0(this.f22303i, new View.OnClickListener() { // from class: l.iik
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            yikVar.m216106A0(groupNotification, GroupApplyStatus.get("approved"));
                        }
                    });
                    this.f22302h.setVisibility(0);
                    this.f22302h.setSelected(false);
                    this.f22302h.setText(R$string.f21695e0);
                    bnl0.m105509E0(this.f22302h, new View.OnClickListener() { // from class: l.jik
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            yikVar.m216106A0(groupNotification, GroupApplyStatus.get("rejected"));
                        }
                    });
                    break;
            }
        }
    }

    public GroupNotificationItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public GroupNotificationItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
