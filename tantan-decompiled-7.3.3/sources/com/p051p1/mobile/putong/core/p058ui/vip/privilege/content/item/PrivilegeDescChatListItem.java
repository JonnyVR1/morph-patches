package com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p051p1.mobile.putong.api.api.TantanException;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.PrivilegeTopChat;
import com.p051p1.mobile.putong.core.p058ui.vip.privilege.content.item.PrivilegeDescChatListItem;
import com.p051p1.mobile.putong.data.Picture;
import java.util.Date;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.fsb0;
import p153l.h390;
import p153l.jic0;
import p153l.joa;
import p153l.lyh0;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.r1j0;
import p153l.s290;
import p153l.uqb0;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeDescChatListItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f38420a;

    /* JADX INFO: renamed from: b */
    public VText f38421b;

    /* JADX INFO: renamed from: c */
    public VText f38422c;

    /* JADX INFO: renamed from: d */
    public VText f38423d;

    public PrivilegeDescChatListItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m58276c(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            int i = tantanForbidden.code;
            String str = tantanForbidden.message;
            if (i == 40399) {
                r1j0.m179420g(str);
                return;
            }
        }
        r1j0.m179420g("设置失败，请稍后再试");
    }

    /* JADX INFO: renamed from: d */
    public final void m58277d(View view) {
        s290.m184115a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m58278e(PrivilegeTopChat privilegeTopChat, Boolean bool) {
        privilegeTopChat.isClicked = true;
        CoreModule.f18264c.f20297C0.m146428y4();
        this.f38423d.setText("已置顶");
        this.f38423d.setBackground(CoreModule.f18263b.getResources().getDrawable(dbc0.f86831am));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m58279f(final PrivilegeTopChat privilegeTopChat, jic0 jic0Var, PutongFrag putongFrag, View view) {
        if (privilegeTopChat.isClicked) {
            return;
        }
        if (joa.m146410w4() <= 0) {
            r1j0.m179420g("特权次数已用完");
        } else {
            jic0Var.mo68557c(putongFrag, CoreModule.f18264c.f20383e2.m172823w3(privilegeTopChat.user.f56859id, true)).subscribe(psd0.m173597H(new y20() { // from class: l.q290
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f155309a.m58278e(privilegeTopChat, (Boolean) obj);
                }
            }, new y20() { // from class: l.r290
                @Override // p153l.y20
                public final void call(Object obj) {
                    PrivilegeDescChatListItem.m58276c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m58280g(final PrivilegeTopChat privilegeTopChat, final jic0<h390> jic0Var, final PutongFrag putongFrag) {
        this.f38421b.setText(privilegeTopChat.user.name);
        this.f38421b.setTypeface(lyh0.m156283c(3));
        this.f38422c.setTextColor(Color.parseColor("#66000000"));
        Date date = new Date((long) privilegeTopChat.conversation.latestTime);
        this.f38422c.setText("最近聊天于 " + pzi0.f154860g.format(date));
        fsb0 fsb0Var = uqb0.f180374G;
        VDraweeView vDraweeView = this.f38420a;
        Picture pictureM61308fp = privilegeTopChat.user.m61308fp();
        int i = qa00.f156291D;
        fsb0Var.m127109I0(vDraweeView, pictureM61308fp.profileSize(i).formatted(), i, i);
        boolean z = privilegeTopChat.isClicked;
        VText vText = this.f38423d;
        if (z) {
            vText.setText("已置顶");
            this.f38423d.setBackground(CoreModule.f18263b.getResources().getDrawable(dbc0.f86831am));
        } else {
            vText.setText("去置顶");
            this.f38423d.setBackground(CoreModule.f18263b.getResources().getDrawable(dbc0.f86798Zl));
        }
        bnl0.m105509E0(this.f38423d, new View.OnClickListener() { // from class: l.p290
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150252a.m58279f(privilegeTopChat, jic0Var, putongFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58277d(this);
        setMinimumHeight(qa00.f156297J);
        this.f38421b.setTextColor(getContext().getResources().getColor(c9c0.f80447p1));
        this.f38422c.setTextColor(getContext().getResources().getColor(c9c0.f80444o1));
        this.f38422c.setMaxLines(1);
    }

    public PrivilegeDescChatListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescChatListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
