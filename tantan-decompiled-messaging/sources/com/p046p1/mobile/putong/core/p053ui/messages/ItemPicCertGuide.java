package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VImage;
import p147v.VText;
import p149l.a1c0;
import p149l.eqh0;
import p149l.ibq;
import p149l.knb0;
import p149l.osi0;
import p149l.qsz;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemPicCertGuide extends LinearLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemPicCertGuide f31359a;

    /* JADX INFO: renamed from: b */
    public ConstraintLayout f31360b;

    /* JADX INFO: renamed from: c */
    public VImage f31361c;

    /* JADX INFO: renamed from: d */
    public VText f31362d;

    /* JADX INFO: renamed from: e */
    public VText f31363e;

    /* JADX INFO: renamed from: f */
    public VText f31364f;

    public ItemPicCertGuide(Context context) {
        super(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d */
    public /* synthetic */ void m48570d(User user, View view) {
        VerificationCenter verificationCenterM31612k4 = CoreModule.f17545c.f19552B0.m31612k4();
        if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "verified")) {
            osi0.m165783g("已认证");
        } else if (NullChecker.m81303a(verificationCenterM31612k4) && TEnum.equals(verificationCenterM31612k4.picVerificationInfo.status, "pending")) {
            osi0.m165783g("正在审核中");
        } else {
            ura.m195053e().m195057d().mo33679Eg(m48572c());
        }
        zvf0.m220399u("e_chat_view_verification", OMSDialogPositon.p_chat_view, vwb.m200311Y("receiver_user_id", user.f56011id));
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
    public final void m48571b(View view) {
        ibq.m135267a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public MessagesAct m48572c() {
        return (MessagesAct) getContext();
    }

    /* JADX INFO: renamed from: e */
    public void m48573e(final User user, qsz qszVar) {
        if (user == null || qszVar == null) {
            return;
        }
        this.f31363e.setText(String.format("%s可能更喜欢和真实的人聊天，完成认证表达诚意", user.getPronoun()));
        xdl0.m208329E0(this.f31360b, new View.OnClickListener() { // from class: l.hbq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f106955a.m48570d(user, view);
            }
        });
        if (qszVar.m176377a("PIC_CERT_GUIDE_MV_KEY")) {
            return;
        }
        qszVar.m176378b("PIC_CERT_GUIDE_MV_KEY");
        zvf0.m220368A("e_chat_view_verification", OMSDialogPositon.p_chat_view, vwb.m200311Y("receiver_user_id", user.f56011id));
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48571b(this);
        this.f31362d.setTypeface(eqh0.m117752c(3), 1);
        this.f31364f.setTypeface(eqh0.m117752c(3), 1);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f31362d.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f31363e.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f31364f.setTextColor(getResources().getColor(a1c0.f67156j));
        }
    }

    public ItemPicCertGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ItemPicCertGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
