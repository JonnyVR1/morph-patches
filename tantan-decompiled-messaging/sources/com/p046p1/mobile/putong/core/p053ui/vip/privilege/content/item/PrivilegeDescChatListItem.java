package com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item;

import android.content.Context;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.p046p1.mobile.putong.api.api.TantanException;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.PrivilegeTopChat;
import com.p046p1.mobile.putong.core.p053ui.vip.privilege.content.item.PrivilegeDescChatListItem;
import com.p046p1.mobile.putong.data.Picture;
import java.util.Date;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bkb0;
import p149l.dac0;
import p149l.dv80;
import p149l.e30;
import p149l.eqh0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.osi0;
import p149l.ou80;
import p149l.qib0;
import p149l.t100;
import p149l.w0c0;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xma;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeDescChatListItem extends RelativeLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f37572a;

    /* JADX INFO: renamed from: b */
    public VText f37573b;

    /* JADX INFO: renamed from: c */
    public VText f37574c;

    /* JADX INFO: renamed from: d */
    public VText f37575d;

    public PrivilegeDescChatListItem(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m57093c(Throwable th) {
        if (th instanceof TantanException.Client.TantanForbidden) {
            TantanException.Client.TantanForbidden tantanForbidden = (TantanException.Client.TantanForbidden) th;
            int i = tantanForbidden.code;
            String str = tantanForbidden.message;
            if (i == 40399) {
                osi0.m165783g(str);
                return;
            }
        }
        osi0.m165783g("设置失败，请稍后再试");
    }

    /* JADX INFO: renamed from: d */
    public final void m57094d(View view) {
        ou80.m165982a(this, view);
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m57095e(PrivilegeTopChat privilegeTopChat, Boolean bool) {
        privilegeTopChat.isClicked = true;
        CoreModule.f17545c.f19555C0.m210115x4();
        this.f37575d.setText("已置顶");
        this.f37575d.setBackground(CoreModule.f17544b.getResources().getDrawable(x2c0.f190368ml));
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m57096f(final PrivilegeTopChat privilegeTopChat, dac0 dac0Var, PutongFrag putongFrag, View view) {
        if (privilegeTopChat.isClicked) {
            return;
        }
        if (xma.m210095v4() <= 0) {
            osi0.m165783g("特权次数已用完");
        } else {
            dac0Var.mo67374c(putongFrag, CoreModule.f17545c.f19641e2.m112214w3(privilegeTopChat.user.f56011id, true)).subscribe(mkd0.m154956H(new e30() { // from class: l.mu80
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f135764a.m57095e(privilegeTopChat, (Boolean) obj);
                }
            }, new e30() { // from class: l.nu80
                @Override // p149l.e30
                public final void call(Object obj) {
                    PrivilegeDescChatListItem.m57093c((Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m57097g(final PrivilegeTopChat privilegeTopChat, final dac0<dv80> dac0Var, final PutongFrag putongFrag) {
        this.f37573b.setText(privilegeTopChat.user.name);
        this.f37573b.setTypeface(eqh0.m117752c(3));
        this.f37574c.setTextColor(Color.parseColor("#66000000"));
        Date date = new Date((long) privilegeTopChat.conversation.latestTime);
        this.f37574c.setText("最近聊天于 " + mqi0.f135255g.format(date));
        bkb0 bkb0Var = qib0.f154691G;
        VDraweeView vDraweeView = this.f37572a;
        Picture pictureM60124fp = privilegeTopChat.user.m60124fp();
        int i = t100.f167229D;
        bkb0Var.m102325I0(vDraweeView, pictureM60124fp.profileSize(i).formatted(), i, i);
        boolean z = privilegeTopChat.isClicked;
        VText vText = this.f37575d;
        if (z) {
            vText.setText("已置顶");
            this.f37575d.setBackground(CoreModule.f17544b.getResources().getDrawable(x2c0.f190368ml));
        } else {
            vText.setText("去置顶");
            this.f37575d.setBackground(CoreModule.f17544b.getResources().getDrawable(x2c0.f190336ll));
        }
        xdl0.m208329E0(this.f37575d, new View.OnClickListener() { // from class: l.lu80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130034a.m57096f(privilegeTopChat, dac0Var, putongFrag, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57094d(this);
        setMinimumHeight(t100.f167235J);
        this.f37573b.setTextColor(getContext().getResources().getColor(w0c0.f183874o1));
        this.f37574c.setTextColor(getContext().getResources().getColor(w0c0.f183871n1));
        this.f37574c.setMaxLines(1);
    }

    public PrivilegeDescChatListItem(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeDescChatListItem(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
