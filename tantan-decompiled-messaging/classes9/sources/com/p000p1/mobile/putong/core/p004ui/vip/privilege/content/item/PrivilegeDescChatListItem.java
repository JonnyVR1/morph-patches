package com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p000p1.mobile.putong.api.api.TantanException;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.vip.privilege.content.item.PrivilegeDescChatListItem;
import com.p1.mobile.putong.core.data.PrivilegeTopChat;
import com.p1.mobile.putong.data.Picture;
import com.tantanapp.common.data.DbObject;
import java.util.Date;
import l.dac0;
import l.e30;
import l.eqh0;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.ou80;
import l.t100;
import l.xdl0;
import p006l.bkb0;
import p006l.dv80;
import p006l.qib0;
import p006l.w0c0;
import p006l.x2c0;
import p006l.xma;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeDescChatListItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f7353a;

    /* JADX INFO: renamed from: b */
    public VText f7354b;

    /* JADX INFO: renamed from: c */
    public VText f7355c;

    /* JADX INFO: renamed from: d */
    public VText f7356d;

    public PrivilegeDescChatListItem(Context context) {
        super(context);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m10564c(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            int i = tantanForbidden.code;
            String str = tantanForbidden.message;
            if (i == 40399) {
                osi0.g(str);
                return;
            }
        }
        osi0.g("设置失败，请稍后再试");
    }

    /* JADX INFO: renamed from: d */
    public final void m10565d(View view) {
        ou80.a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m10566e(PrivilegeTopChat privilegeTopChat, Boolean bool) {
        privilegeTopChat.isClicked = true;
        CoreModule.f1534c.f3544C0.m27423x4();
        this.f7356d.setText("已置顶");
        this.f7356d.setBackground(CoreModule.f1533b.getResources().getDrawable(x2c0.f26904ml));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m10567f(final PrivilegeTopChat privilegeTopChat, dac0 dac0Var, PutongFrag putongFrag, View view) {
        if (privilegeTopChat.isClicked) {
            return;
        }
        if (xma.m27403v4() <= 0) {
            osi0.g("特权次数已用完");
        } else {
            dac0Var.c(putongFrag, CoreModule.f1534c.f3630e2.m14079w3(((DbObject) privilegeTopChat.user).id, true)).subscribe(mkd0.H(new e30() { // from class: l.mu80
                public final void call(Object obj) {
                    this.f17283a.m10566e(privilegeTopChat, (Boolean) obj);
                }
            }, new e30() { // from class: l.nu80
                public final void call(Object obj) {
                    PrivilegeDescChatListItem.m10564c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m10568g(final PrivilegeTopChat privilegeTopChat, final dac0<dv80> dac0Var, final PutongFrag putongFrag) {
        this.f7354b.setText(privilegeTopChat.user.name);
        this.f7354b.setTypeface(eqh0.c(3));
        this.f7355c.setTextColor(Color.parseColor("#66000000"));
        Date date = new Date((long) privilegeTopChat.conversation.latestTime);
        this.f7355c.setText("最近聊天于 " + mqi0.g.format(date));
        bkb0 bkb0Var = qib0.f19782G;
        VDraweeView vDraweeView = this.f7353a;
        Picture pictureFp = privilegeTopChat.user.fp();
        int i = t100.D;
        bkb0Var.m12738I0(vDraweeView, pictureFp.profileSize(i).formatted(), i, i);
        boolean z = privilegeTopChat.isClicked;
        VText vText = this.f7356d;
        if (z) {
            vText.setText("已置顶");
            this.f7356d.setBackground(CoreModule.f1533b.getResources().getDrawable(x2c0.f26904ml));
        } else {
            vText.setText("去置顶");
            this.f7356d.setBackground(CoreModule.f1533b.getResources().getDrawable(x2c0.f26872ll));
        }
        xdl0.E0(this.f7356d, new View.OnClickListener() { // from class: l.lu80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16648a.m10567f(privilegeTopChat, dac0Var, putongFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10565d(this);
        setMinimumHeight(t100.J);
        this.f7354b.setTextColor(getContext().getResources().getColor(w0c0.f24714o1));
        this.f7355c.setTextColor(getContext().getResources().getColor(w0c0.f24711n1));
        this.f7355c.setMaxLines(1);
    }

    public PrivilegeDescChatListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescChatListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
