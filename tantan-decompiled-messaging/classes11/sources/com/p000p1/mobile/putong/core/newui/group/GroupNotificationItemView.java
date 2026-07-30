package com.p000p1.mobile.putong.core.newui.group;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.group.GroupNotificationItemView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.core.data.GroupApplyStatus;
import com.p1.mobile.putong.core.data.GroupNotification;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.messages.view.GroupMemberAvatarFrame;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.c3c0;
import l.qib0;
import l.tbk;
import l.xdl0;
import p009l.igk;
import p009l.mqi0;
import v.VButton;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class GroupNotificationItemView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public GroupMemberAvatarFrame f331a;

    /* JADX INFO: renamed from: b */
    public VDraweeView f332b;

    /* JADX INFO: renamed from: c */
    public VText f333c;

    /* JADX INFO: renamed from: d */
    public VText f334d;

    /* JADX INFO: renamed from: e */
    public VText f335e;

    /* JADX INFO: renamed from: f */
    public VText f336f;

    /* JADX INFO: renamed from: g */
    public VText f337g;

    /* JADX INFO: renamed from: h */
    public VButton f338h;

    /* JADX INFO: renamed from: i */
    public VButton f339i;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.group.GroupNotificationItemView$a */
    public static class C0013a {
        /* JADX INFO: renamed from: b */
        public static void m510b(GroupNotificationItemView groupNotificationItemView, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            groupNotificationItemView.f331a = ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            groupNotificationItemView.f332b = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0)).getChildAt(0);
            groupNotificationItemView.f333c = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(0);
            groupNotificationItemView.f334d = ((ViewGroup) ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(0)).getChildAt(1);
            groupNotificationItemView.f335e = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(0)).getChildAt(1);
            groupNotificationItemView.f336f = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(1)).getChildAt(1);
            groupNotificationItemView.f337g = ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(2);
            groupNotificationItemView.f338h = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(0);
            groupNotificationItemView.f339i = ((ViewGroup) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1)).getChildAt(3)).getChildAt(1);
        }
    }

    public GroupNotificationItemView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m494c(View view) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m496e(View view) {
    }

    /* JADX INFO: renamed from: o */
    public final void m506o(View view) {
        C0013a.m510b(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m506o(this);
    }

    /* JADX INFO: renamed from: p */
    public void m507p(final GroupNotification groupNotification, final igk igkVar) {
        if (groupNotification.userData == null) {
            return;
        }
        xdl0.E0(this.f331a, new View.OnClickListener() { // from class: l.rfk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                igk igkVar2 = igkVar;
                GroupNotification groupNotification2 = groupNotification;
                igkVar2.m16541q0(groupNotification2.chatGroupData, groupNotification2.userData);
            }
        });
        if (NullChecker.a(groupNotification.chatGroupData) && NullChecker.a(groupNotification.userData) && TEnum.equals(groupNotification.chatGroupData.groupType, "anonymous")) {
            qib0.G.Z0(this.f332b, tbk.k(groupNotification.userData));
        } else if (TextUtils.isEmpty(((Media) groupNotification.userData.pictures.get(0)).cover().profileSmall().formatted())) {
            qib0.G.Y0(this.f332b, c3c0.I0);
        } else {
            qib0.G.Z0(this.f332b, ((Media) groupNotification.userData.pictures.get(0)).cover().profileSmall().formatted());
        }
        this.f333c.setText(groupNotification.userData.name);
        this.f333c.requestLayout();
        CoreBusinessService coreBusinessServiceI = CoreModule.P().i();
        VText vText = this.f334d;
        User user = groupNotification.userData;
        coreBusinessServiceI.X0(vText, user.gender, user.age.intValue(), false, groupNotification.userData);
        this.f335e.setText(mqi0.f17027c.format(Double.valueOf(groupNotification.createdTime)));
        this.f336f.setText(groupNotification.chatGroupData.name);
        if (!NullChecker.a(groupNotification.groupApplyData) || TextUtils.isEmpty(groupNotification.groupApplyData.reason)) {
            this.f337g.setVisibility(8);
        } else {
            this.f337g.setVisibility(0);
            this.f337g.setText(groupNotification.groupApplyData.reason);
        }
        m508q(groupNotification, igkVar);
    }

    /* JADX INFO: renamed from: q */
    public void m508q(final GroupNotification groupNotification, final igk igkVar) {
        if (NullChecker.a(groupNotification.groupApplyData)) {
            String string = groupNotification.groupApplyData.status.toString();
            string.getClass();
            switch (string) {
                case "rejected":
                    this.f339i.setVisibility(8);
                    this.f338h.setVisibility(0);
                    this.f338h.setSelected(true);
                    this.f338h.setText(R.string.f0);
                    xdl0.E0(this.f338h, new View.OnClickListener() { // from class: l.vfk
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            GroupNotificationItemView.m494c(view);
                        }
                    });
                    break;
                case "approved":
                    this.f339i.setVisibility(0);
                    this.f339i.setSelected(true);
                    this.f339i.setText(R.string.d0);
                    xdl0.E0(this.f339i, new View.OnClickListener() { // from class: l.ufk
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            GroupNotificationItemView.m496e(view);
                        }
                    });
                    this.f338h.setVisibility(8);
                    break;
                case "default":
                    this.f339i.setVisibility(0);
                    this.f339i.setSelected(false);
                    this.f339i.setText(R.string.c0);
                    xdl0.E0(this.f339i, new View.OnClickListener() { // from class: l.sfk
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            igkVar.m16537A0(groupNotification, GroupApplyStatus.get("approved"));
                        }
                    });
                    this.f338h.setVisibility(0);
                    this.f338h.setSelected(false);
                    this.f338h.setText(R.string.e0);
                    xdl0.E0(this.f338h, new View.OnClickListener() { // from class: l.tfk
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            igkVar.m16537A0(groupNotification, GroupApplyStatus.get("rejected"));
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
