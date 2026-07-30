package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.n100;
import p153l.ovb0;
import p153l.sgq;

/* JADX INFO: loaded from: classes3.dex */
public class ItemTagGuide extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemTagGuide f32349a;

    /* JADX INFO: renamed from: b */
    public VImage f32350b;

    /* JADX INFO: renamed from: c */
    public VText f32351c;

    /* JADX INFO: renamed from: d */
    public VText f32352d;

    /* JADX INFO: renamed from: e */
    public VText f32353e;

    /* JADX INFO: renamed from: f */
    public boolean f32354f;

    public ItemTagGuide(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m49877d(User user, View view) {
        if (this.f32354f) {
            return;
        }
        CoreModule.m30933P().m143412i().mo180334H5(m49879c(), user.f56859id, "from_message_tag_guide", TabName.Msg.name());
        i4g0.m138520r("e_add_tag_guide", OMSDialogPositon.p_chat_view);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: A */
    public void mo43399A(Message message) {
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: J */
    public List<ovb0<String, Runnable, Integer, Void>> mo43400J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m49878b(View view) {
        sgq.m185827a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m49879c() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m49880e(Message message, final User user, n100 n100Var) {
        int i;
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(message) && NullChecker.m82486a(user) && NullChecker.m82486a(userM116600p9)) {
            List<String> list = userM116600p9.profile.extensions.interest.tags;
            boolean z = !jyb.m147479J(list) && list.size() >= 4;
            this.f32354f = z;
            this.f32353e.setText(z ? "完成" : "添加");
            VText vText = this.f32353e;
            MessagesAct messagesActM49879c = m49879c();
            if (this.f32354f) {
                i = ibc0.f113908S4;
            } else {
                i = gta.m132210e().m132214d().mo34702I4() ? ibc0.f114138t : ibc0.f113916T4;
            }
            vText.setBackground(messagesActM49879c.getDrawable(i));
            bnl0.m105509E0(this.f32353e, new View.OnClickListener() { // from class: l.rgq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f163031a.m49877d(user, view);
                }
            });
            if (n100Var.m161054a("TAG_GUIDE_MV_KEY")) {
                return;
            }
            n100Var.m161055b("TAG_GUIDE_MV_KEY");
            i4g0.m138492A("e_add_tag_guide", OMSDialogPositon.p_chat_view, jyb.m147494Y("tag_click_status", Integer.valueOf(this.f32354f ? 1 : 0)));
        }
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49878b(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32351c.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32352d.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32353e.setBackgroundResource(ibc0.f114138t);
        }
    }

    public ItemTagGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemTagGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
