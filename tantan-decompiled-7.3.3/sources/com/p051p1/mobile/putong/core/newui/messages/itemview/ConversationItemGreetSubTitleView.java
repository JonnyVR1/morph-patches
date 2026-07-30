package com.p051p1.mobile.putong.core.newui.messages.itemview;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p137rx.C22421c;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.ca6;
import p153l.d79;
import p153l.dbc0;
import p153l.gra;
import p153l.jyb;
import p153l.lyh0;
import p153l.mn40;
import p153l.orl;
import p153l.pf60;
import p153l.pol;
import p153l.psd0;
import p153l.qcj;
import p153l.rcj;
import p153l.sfj0;
import p153l.sj6;
import p153l.ue6;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemGreetSubTitleView extends LinearLayout implements orl {

    /* JADX INFO: renamed from: a */
    public ConversationItemGreetSubTitleView f26551a;

    /* JADX INFO: renamed from: b */
    public VImage f26552b;

    /* JADX INFO: renamed from: c */
    public VText f26553c;

    /* JADX INFO: renamed from: d */
    public VText f26554d;

    /* JADX INFO: renamed from: e */
    public VText f26555e;

    /* JADX INFO: renamed from: f */
    public sj6 f26556f;

    public ConversationItemGreetSubTitleView(Context context) {
        super(context);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: J */
    public void mo43412J(sj6 sj6Var) {
        this.f26556f = sj6Var;
        final boolean zEquals = TextUtils.equals(sj6Var.f168926a.f56859id, "fake_conversation_anonymous_greeting");
        if (!zEquals && mn40.m159114b()) {
            m43416i1();
            return;
        }
        this.f26553c.setText("");
        this.f26554d.setText("");
        int i = sj6Var.f168926a.additional.kankan.greetingSummaryDetail.unseen;
        m43415h1();
        if (i > 0) {
            this.f26553c.setVisibility(8);
            this.f26554d.setVisibility(0);
            if (d79.m114662U()) {
                this.f26554d.setText(CoreModule.f18263b.getString(R$string.f19082a5, Integer.valueOf(i)));
            } else if (!gra.m131580I2()) {
                this.f26554d.setText("又有" + sj6Var.f168926a.additional.kankan.greetingSummaryDetail.unseen + "个人回应了你");
            } else if (sj6Var.f168926a.additional.kankan.greetingSummaryDetail.unseen > 99) {
                if (zEquals) {
                    this.f26554d.setText("又有99+个人给你发消息");
                } else if (CoreModule.f18276o.m132214d().mo34703I5() || CoreModule.m30933P().m143405a().mo34529jj()) {
                    this.f26554d.setText("又有99+个人给你告白");
                } else {
                    this.f26554d.setText("又有99+个人给你打招呼");
                }
            } else if (zEquals) {
                this.f26554d.setText("又有" + i + "个人给你发消息");
            } else if (CoreModule.f18276o.m132214d().mo34703I5() || CoreModule.m30933P().m143405a().mo34529jj()) {
                this.f26554d.setText("又有" + i + "个人给你告白");
            } else {
                this.f26554d.setText(CoreModule.f18263b.getString(R$string.f19082a5, Integer.valueOf(i)));
            }
        } else if (TextUtils.isEmpty(sj6Var.f168926a.additional.kankan.greetingSummaryDetail.latestUserId) || TextUtils.isEmpty(sj6Var.f168926a.additional.kankan.greetingSummaryDetail.latestMessageId)) {
            this.f26553c.setVisibility(8);
            this.f26554d.setVisibility(0);
            if ((zEquals || !CoreModule.f18276o.m132214d().mo34703I5()) && !CoreModule.m30933P().m143405a().mo34529jj()) {
                this.f26554d.setText(zEquals ? "暂无新消息" : CoreModule.f18263b.getString(R$string.f19113b5));
            } else {
                this.f26554d.setText("暂无新告白");
            }
        } else {
            this.f26553c.setVisibility(0);
            this.f26554d.setVisibility(0);
            this.f26553c.setText("");
            this.f26554d.setText("");
            sj6Var.f168929d.mo68557c(sj6Var.f168949x, C22421c.combineLatest(CoreModule.f18264c.f20381e0.m116483Ka(sj6Var.f168926a.additional.kankan.greetingSummaryDetail.latestUserId), CoreModule.f18264c.f20420r0.m35156w6(sj6Var.f168926a.additional.kankan.greetingSummaryDetail.latestMessageId), new rcj() { // from class: l.u96
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return new pf60((User) obj, (List) obj2);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.v96
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f182957a.m43414g1(zEquals, (pf60) obj);
                }
            }));
        }
        sfj0.m185601h("e_anonymous_cell", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
        pol polVar = sj6Var.f168929d;
        if (zEquals) {
            polVar.mo68557c(sj6Var.f168949x, CoreModule.f18264c.f20420r0.f20776o0.flatMap(new qcj() { // from class: l.w96
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20420r0.m35162z6();
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.x96
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20420r0.m35125h5();
                }
            }, new y20() { // from class: l.y96
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20420r0.m35125h5();
                }
            }));
        } else {
            polVar.mo68557c(sj6Var.f168949x, CoreModule.f18264c.f20420r0.f20775n0.flatMap(new qcj() { // from class: l.z96
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20420r0.m35081C6();
                }
            })).subscribe(psd0.m173597H(new y20() { // from class: l.aa6
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20420r0.m35127i5();
                }
            }, new y20() { // from class: l.ba6
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20420r0.m35127i5();
                }
            }));
        }
        bnl0.m105524M(this.f26555e, false);
        if (bnl0.m105529O0(this.f26555e)) {
            sfj0.m185601h("e_kankan_stranger_message_red_dot", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m43413f1(View view) {
        ca6.m108473a(this, view);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m43414g1(boolean z, pf60 pf60Var) {
        String str;
        boolean z2;
        List list = (List) pf60Var.f152157b;
        String strConcat = NullChecker.m82486a(pf60Var.f152156a) ? ((User) pf60Var.f152156a).name : "";
        if (jyb.m147479J(list)) {
            if ((z || !CoreModule.f18276o.m132214d().mo34703I5()) && !CoreModule.m30933P().m143405a().mo34529jj()) {
                this.f26554d.setText(z ? "暂无新消息" : CoreModule.f18263b.getString(R$string.f19113b5));
                return;
            } else {
                this.f26554d.setText("暂无新告白");
                return;
            }
        }
        Message message = (Message) list.get(0);
        boolean zEquals = TextUtils.equals(message.owner, CoreModule.m30929H().userId());
        if (TextUtils.isEmpty(strConcat)) {
            str = "";
        } else {
            if (zEquals) {
                if (z) {
                    this.f26553c.setText("我");
                }
                z2 = false;
            } else {
                User user = (User) pf60Var.f152156a;
                if (NullChecker.m82486a(user) && !user.isHideIconFromSVipWithMe() && user.isODiamond()) {
                    z2 = true;
                    bnl0.m105524M(this.f26552b, true);
                    this.f26552b.setImageResource(dbc0.f86196Gr);
                    this.f26553c.setTextColor(Color.parseColor("#a0000000"));
                    this.f26553c.setTypeface(lyh0.m156283c(3));
                } else {
                    m43415h1();
                    z2 = false;
                }
                VText vText = this.f26553c;
                if (z2) {
                    vText.setText(String.format("%s：", strConcat));
                } else {
                    vText.setText(strConcat);
                }
            }
            if (z2) {
                str = "";
            } else {
                str = z ? ":" : "：";
            }
        }
        if (TEnum.equals(message.messageType, MessageType.chat_gift)) {
            this.f26554d.setText(str.concat(zEquals ? "送了一个礼物" : "送了你一个礼物"));
        } else if (TEnum.equals(message.messageType, "picture")) {
            this.f26554d.setText(str + CoreModule.f18263b.getResources().getString(R$string.f19712ui, ""));
        } else {
            Boolean bool = message.recalled;
            if (bool == null || !bool.booleanValue()) {
                this.f26554d.setText(str + message.value);
            } else {
                this.f26554d.setText(str + CoreModule.f18263b.getResources().getString(R$string.f19127bj));
            }
        }
        if (!z || zEquals) {
            this.f26553c.setTextSize(13.0f);
            return;
        }
        this.f26553c.setTextSize(14.0f);
        this.f26553c.setText("");
        if (strConcat.length() > 5) {
            strConcat = strConcat.substring(0, 5).concat("…");
        }
        this.f26554d.setText(strConcat + str + message.value);
    }

    @Override // p153l.ue6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m43415h1() {
        bnl0.m105524M(this.f26552b, false);
        this.f26553c.setTextColor(getResources().getColor(c9c0.f80431k0));
        this.f26553c.setTypeface(lyh0.m156283c(2));
        if (gra.m131778z()) {
            ue6.m195667e0(this.f26553c);
            ue6.m195667e0(this.f26554d);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m43416i1() {
        this.f26554d.setText(mn40.m159113a());
        bnl0.m105524M(this.f26553c, false);
        bnl0.m105524M(this.f26554d, true);
        bnl0.m105524M(this.f26555e, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43413f1(this);
    }

    @Override // p153l.nrl
    public /* bridge */ /* synthetic */ void setPicPercent(float f) {
        super.setPicPercent(f);
    }

    public ConversationItemGreetSubTitleView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ConversationItemGreetSubTitleView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
