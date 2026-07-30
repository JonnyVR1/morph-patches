package com.p046p1.mobile.putong.core.newui.messages.expirence.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChallengeMsg;
import com.p046p1.mobile.putong.core.data.ChallengeMsgList;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a;
import com.p046p1.mobile.putong.core.p053ui.messages.ItemMessageBase;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.c3c0;
import p149l.efq;
import p149l.fcz;
import p149l.knb0;
import p149l.qib0;
import p149l.t100;
import p149l.ura;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ItemTestChallengeView extends RelativeLayout implements InterfaceC8519a {

    /* JADX INFO: renamed from: a */
    public ItemTestChallengeView f25802a;

    /* JADX INFO: renamed from: b */
    public VLinear f25803b;

    /* JADX INFO: renamed from: c */
    public VDraweeView f25804c;

    /* JADX INFO: renamed from: d */
    public VText f25805d;

    /* JADX INFO: renamed from: e */
    public VText f25806e;

    /* JADX INFO: renamed from: f */
    public VText f25807f;

    /* JADX INFO: renamed from: g */
    public boolean f25808g;

    public ItemTestChallengeView(Context context) {
        super(context);
        this.f25808g = false;
    }

    /* JADX INFO: renamed from: c */
    private Act m42387c() {
        return (Act) xdl0.m208326D(getContext());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: A */
    public void mo42388A(Message message) {
        final ChallengeMsg challengeMsgMo158477y5 = CoreModule.m29935P().m94658i().mo158477y5(ChallengeMsgList.parse(message.msgData), message);
        if (NullChecker.m81303a(challengeMsgMo158477y5)) {
            this.f25805d.setTypeface(null, 1);
            this.f25806e.setTypeface(null, 1);
            this.f25807f.setTypeface(null, 1);
            this.f25805d.setText(challengeMsgMo158477y5.title);
            this.f25806e.setText(challengeMsgMo158477y5.subTitle);
            this.f25807f.setText(challengeMsgMo158477y5.buttonText);
            this.f25804c.getHierarchy().m112053H(RoundingParams.m8248b(t100.m186890d(10.0f), t100.m186890d(10.0f), 0.0f, 0.0f));
            if (TextUtils.isEmpty(challengeMsgMo158477y5.picUrl)) {
                qib0.f154691G.m102354Y0(this.f25804c, c3c0.f78886v4);
            } else {
                qib0.f154691G.m102331L0(this.f25804c, challengeMsgMo158477y5.picUrl);
            }
            xdl0.m208329E0(this.f25802a, new View.OnClickListener() { // from class: l.dfq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f85969a.m42391d(challengeMsgMo158477y5, view);
                }
            });
            m42392e(true, challengeMsgMo158477y5.eventlog);
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: J */
    public List<knb0<String, Runnable, Integer, Void>> mo42389J() {
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final void m42390b(View view) {
        efq.m116089a(this, view);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0023  */
    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m42391d(ChallengeMsg challengeMsg, View view) {
        String str;
        if (m42387c() instanceof MessagesAct) {
            fcz<? extends DbObject, ?> fczVarMo48974l = ((MessagesAct) m42387c()).mo48974l();
            if (NullChecker.m81303a(fczVarMo48974l.mo120858x6())) {
                str = fczVarMo48974l.mo120858x6().f56011id;
            } else {
                str = "";
            }
        } else {
            str = "";
        }
        CoreModule.m29935P().m94658i().mo158364d5(m42387c(), challengeMsg.link, str, "conversation");
        m42392e(false, challengeMsg.eventlog);
    }

    /* JADX INFO: renamed from: e */
    public final void m42392e(boolean z, String str) {
        if (!z) {
            zvf0.m220399u("e_in_harmony_test_entrance1_messege_card", OMSDialogPositon.p_chat_view, vwb.m200311Y("in_harmony_test_string", str));
        } else {
            if (this.f25808g) {
                return;
            }
            this.f25808g = true;
            zvf0.m220368A("e_in_harmony_test_entrance1_messege_card", OMSDialogPositon.p_chat_view, vwb.m200311Y("in_harmony_test_string", str));
        }
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.messages.InterfaceC8519a
    /* JADX INFO: renamed from: m */
    public void mo42393m(int i, boolean z, ItemMessageBase itemMessageBase) {
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42390b(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f25806e.setTextColor(getResources().getColor(a1c0.f67153g));
            this.f25807f.setTextColor(getResources().getColor(a1c0.f67156j));
        }
    }

    public ItemTestChallengeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25808g = false;
    }

    public ItemTestChallengeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25808g = false;
    }

    public ItemTestChallengeView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f25808g = false;
    }
}
