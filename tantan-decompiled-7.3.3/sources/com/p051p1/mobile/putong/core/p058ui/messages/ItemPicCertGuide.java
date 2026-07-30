package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.idq;
import p153l.jyb;
import p153l.lyh0;
import p153l.n100;
import p153l.ovb0;
import p153l.r1j0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPicCertGuide extends LinearLayout implements InterfaceC8682a {

    /* JADX INFO: renamed from: a */
    public ItemPicCertGuide f32207a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f32208b;

    /* JADX INFO: renamed from: c */
    public VImage f32209c;

    /* JADX INFO: renamed from: d */
    public VText f32210d;

    /* JADX INFO: renamed from: e */
    public VText f32211e;

    /* JADX INFO: renamed from: f */
    public VText f32212f;

    public ItemPicCertGuide(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m49753d(User user, View view) {
        VerificationCenter verificationCenterM32615k4 = CoreModule.f18264c.f20294B0.m32615k4();
        if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "verified")) {
            r1j0.m179420g("已认证");
        } else if (NullChecker.m82486a(verificationCenterM32615k4) && TEnum.equals(verificationCenterM32615k4.picVerificationInfo.status, "pending")) {
            r1j0.m179420g("正在审核中");
        } else {
            gta.m132210e().m132214d().mo34682Eg(m49755c());
        }
        i4g0.m138523u("e_chat_view_verification", OMSDialogPositon.p_chat_view, jyb.m147494Y("receiver_user_id", user.f56859id));
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
    public final void m49754b(View view) {
        idq.m139540a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m49755c() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m49756e(final User user, n100 n100Var) {
        if (user == null || n100Var == null) {
            return;
        }
        this.f32211e.setText(String.format("%s可能更喜欢和真实的人聊天，完成认证表达诚意", user.getPronoun()));
        bnl0.m105509E0(this.f32208b, new View.OnClickListener() { // from class: l.hdq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109031a.m49753d(user, view);
            }
        });
        if (n100Var.m161054a("PIC_CERT_GUIDE_MV_KEY")) {
            return;
        }
        n100Var.m161055b("PIC_CERT_GUIDE_MV_KEY");
        i4g0.m138492A("e_chat_view_verification", OMSDialogPositon.p_chat_view, jyb.m147494Y("receiver_user_id", user.f56859id));
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.messages.InterfaceC8682a
    /* JADX INFO: renamed from: m */
    public void mo43404m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49754b(this);
        this.f32210d.setTypeface(lyh0.m156283c(3), 1);
        this.f32212f.setTypeface(lyh0.m156283c(3), 1);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f32210d.setTextColor(getResources().getColor(g9c0.f102817g));
            this.f32211e.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f32212f.setTextColor(getResources().getColor(g9c0.f102820j));
        }
    }

    public ItemPicCertGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPicCertGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
