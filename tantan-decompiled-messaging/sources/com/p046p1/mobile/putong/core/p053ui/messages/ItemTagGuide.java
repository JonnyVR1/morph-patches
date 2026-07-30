package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.knb0;
import p149l.qsz;
import p149l.seq;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemTagGuide extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemTagGuide f31501a;

    /* JADX INFO: renamed from: b */
    public VImage f31502b;

    /* JADX INFO: renamed from: c */
    public VText f31503c;

    /* JADX INFO: renamed from: d */
    public VText f31504d;

    /* JADX INFO: renamed from: e */
    public VText f31505e;

    /* JADX INFO: renamed from: f */
    public boolean f31506f;

    public ItemTagGuide(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m48694d(User user, View view) {
        if (this.f31506f) {
            return;
        }
        CoreModule.m29935P().m94658i().mo158242H5(m48696c(), user.f56011id, "from_message_tag_guide", TabName.Msg.name());
        zvf0.m220396r("e_add_tag_guide", OMSDialogPositon.p_chat_view);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m48695b(View view) {
        seq.m183676a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m48696c() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m48697e(Message message, final User user, qsz qszVar) {
        int i;
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(message) && NullChecker.m81303a(user) && NullChecker.m81303a(userM169527p9)) {
            List<String> list = userM169527p9.profile.extensions.interest.tags;
            boolean z = !vwb.m200296J(list) && list.size() >= 4;
            this.f31506f = z;
            this.f31505e.setText(z ? "完成" : "添加");
            VText vText = this.f31505e;
            MessagesAct messagesActM48696c = m48696c();
            if (this.f31506f) {
                i = c3c0.f78633S4;
            } else {
                i = ura.m195053e().m195057d().mo33699I4() ? c3c0.f78863t : c3c0.f78641T4;
            }
            vText.setBackground(messagesActM48696c.getDrawable(i));
            xdl0.m208329E0(this.f31505e, new View.OnClickListener() { // from class: l.req
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f159079a.m48694d(user, view);
                }
            });
            if (qszVar.m176377a("TAG_GUIDE_MV_KEY")) {
                return;
            }
            qszVar.m176378b("TAG_GUIDE_MV_KEY");
            zvf0.m220368A("e_add_tag_guide", OMSDialogPositon.p_chat_view, vwb.m200311Y("tag_click_status", Integer.valueOf(this.f31506f ? 1 : 0)));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48695b(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31503c.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31504d.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31505e.setBackgroundResource(c3c0.f78863t);
        }
    }

    public ItemTagGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemTagGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
