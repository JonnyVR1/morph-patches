package com.p046p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.data.GroupApplyStatus;
import com.p046p1.mobile.putong.core.data.GroupNotification;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.group.GroupNotificationItemView;
import com.p046p1.mobile.putong.core.p053ui.messages.view.GroupMemberAvatarFrame;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VText;
import p149l.c3c0;
import p149l.igk;
import p149l.mqi0;
import p149l.qib0;
import p149l.tbk;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class GroupNotificationItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public GroupMemberAvatarFrame f21553a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f21554b;

    /* JADX INFO: renamed from: c */
    public VText f21555c;

    /* JADX INFO: renamed from: d */
    public VText f21556d;

    /* JADX INFO: renamed from: e */
    public VText f21557e;

    /* JADX INFO: renamed from: f */
    public VText f21558f;

    /* JADX INFO: renamed from: g */
    public VText f21559g;

    /* JADX INFO: renamed from: h */
    public VButton f21560h;

    /* JADX INFO: renamed from: i */
    public VButton f21561i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.group.GroupNotificationItemView$a */
    public static class C7849a {
        /* JADX INFO: renamed from: b */
        public static void m36571b(GroupNotificationItemView groupNotificationItemView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            groupNotificationItemView.f21553a = (GroupMemberAvatarFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            groupNotificationItemView.f21554b = (VDraweeView) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            groupNotificationItemView.f21555c = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
            groupNotificationItemView.f21556d = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
            groupNotificationItemView.f21557e = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
            groupNotificationItemView.f21558f = (VText) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
            groupNotificationItemView.f21559g = (VText) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
            groupNotificationItemView.f21560h = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0);
            groupNotificationItemView.f21561i = (VButton) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1);
        }
    }

    public GroupNotificationItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m36555c(View view) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m36557e(View view) {
    }

    /* JADX INFO: renamed from: o */
    public final void m36567o(View view) {
        C7849a.m36571b(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m36567o(this);
    }

    /* JADX INFO: renamed from: p */
    public void m36568p(final GroupNotification groupNotification, final igk igkVar) {
        if (groupNotification.userData == null) {
            return;
        }
        xdl0.m208329E0(this.f21553a, new View.OnClickListener() { // from class: l.rfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                igk igkVar2 = igkVar;
                GroupNotification groupNotification2 = groupNotification;
                igkVar2.m136068q0(groupNotification2.chatGroupData, groupNotification2.userData);
            }
        });
        if (NullChecker.m81303a(groupNotification.chatGroupData) && NullChecker.m81303a(groupNotification.userData) && TEnum.equals(groupNotification.chatGroupData.groupType, "anonymous")) {
            qib0.f154691G.m102356Z0(this.f21554b, tbk.m187864k(groupNotification.userData));
        } else if (TextUtils.isEmpty(groupNotification.userData.pictures.get(0).cover().profileSmall().formatted())) {
            qib0.f154691G.m102354Y0(this.f21554b, c3c0.f78540I0);
        } else {
            qib0.f154691G.m102356Z0(this.f21554b, groupNotification.userData.pictures.get(0).cover().profileSmall().formatted());
        }
        this.f21555c.setText(groupNotification.userData.name);
        this.f21555c.requestLayout();
        CoreBusinessService coreBusinessServiceM94658i = CoreModule.m29935P().m94658i();
        VText vText = this.f21556d;
        User user = groupNotification.userData;
        coreBusinessServiceM94658i.mo158330X0(vText, user.gender, user.age.intValue(), false, groupNotification.userData);
        this.f21557e.setText(mqi0.f135251c.format(Double.valueOf(groupNotification.createdTime)));
        this.f21558f.setText(groupNotification.chatGroupData.name);
        if (!NullChecker.m81303a(groupNotification.groupApplyData) || TextUtils.isEmpty(groupNotification.groupApplyData.reason)) {
            this.f21559g.setVisibility(8);
        } else {
            this.f21559g.setVisibility(0);
            this.f21559g.setText(groupNotification.groupApplyData.reason);
        }
        m36569q(groupNotification, igkVar);
    }

    /* JADX INFO: renamed from: q */
    public void m36569q(final GroupNotification groupNotification, final igk igkVar) {
        if (NullChecker.m81303a(groupNotification.groupApplyData)) {
            String string = groupNotification.groupApplyData.status.toString();
            string.getClass();
            switch (string) {
                case "rejected":
                    this.f21561i.setVisibility(8);
                    this.f21560h.setVisibility(0);
                    this.f21560h.setSelected(true);
                    this.f21560h.setText(R$string.f20962f0);
                    xdl0.m208329E0(this.f21560h, new View.OnClickListener() { // from class: l.vfk
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            GroupNotificationItemView.m36555c(view);
                        }
                    });
                    break;
                case "approved":
                    this.f21561i.setVisibility(0);
                    this.f21561i.setSelected(true);
                    this.f21561i.setText(R$string.f20944d0);
                    xdl0.m208329E0(this.f21561i, new View.OnClickListener() { // from class: l.ufk
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            GroupNotificationItemView.m36557e(view);
                        }
                    });
                    this.f21560h.setVisibility(8);
                    break;
                case "default":
                    this.f21561i.setVisibility(0);
                    this.f21561i.setSelected(false);
                    this.f21561i.setText(R$string.f20935c0);
                    xdl0.m208329E0(this.f21561i, new View.OnClickListener() { // from class: l.sfk
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            igkVar.m136065A0(groupNotification, GroupApplyStatus.get("approved"));
                        }
                    });
                    this.f21560h.setVisibility(0);
                    this.f21560h.setSelected(false);
                    this.f21560h.setText(R$string.f20953e0);
                    xdl0.m208329E0(this.f21560h, new View.OnClickListener() { // from class: l.tfk
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            igkVar.m136065A0(groupNotification, GroupApplyStatus.get("rejected"));
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
