package com.p046p1.mobile.putong.core.newui.messages.itemview;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import p133rx.C22306c;
import p147v.VImage;
import p147v.VText;
import p149l.cpl;
import p149l.dml;
import p149l.e30;
import p149l.eqh0;
import p149l.j760;
import p149l.mkd0;
import p149l.o6j0;
import p149l.pi6;
import p149l.rd6;
import p149l.u59;
import p149l.upa;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.x2c0;
import p149l.x86;
import p149l.x9j;
import p149l.xdl0;
import p149l.ye40;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationItemGreetSubTitleView extends LinearLayout implements cpl {

    /* JADX INFO: renamed from: a */
    public ConversationItemGreetSubTitleView f25809a;

    /* JADX INFO: renamed from: b */
    public VImage f25810b;

    /* JADX INFO: renamed from: c */
    public VText f25811c;

    /* JADX INFO: renamed from: d */
    public VText f25812d;

    /* JADX INFO: renamed from: e */
    public VText f25813e;

    /* JADX INFO: renamed from: f */
    public pi6 f25814f;

    public ConversationItemGreetSubTitleView(Context context) {
        super(context);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: J */
    public void mo42401J(pi6 pi6Var) {
        this.f25814f = pi6Var;
        final boolean zEquals = TextUtils.equals(pi6Var.f149101a.f56011id, "fake_conversation_anonymous_greeting");
        if (!zEquals && ye40.m214334b()) {
            m42405i1();
            return;
        }
        this.f25811c.setText("");
        this.f25812d.setText("");
        int i = pi6Var.f149101a.additional.kankan.greetingSummaryDetail.unseen;
        m42404h1();
        if (i > 0) {
            this.f25811c.setVisibility(8);
            this.f25812d.setVisibility(0);
            if (u59.m191811T()) {
                this.f25812d.setText(CoreModule.f17544b.getString(R$string.f18291Y4, Integer.valueOf(i)));
            } else if (!upa.m194649I2()) {
                this.f25812d.setText("又有" + pi6Var.f149101a.additional.kankan.greetingSummaryDetail.unseen + "个人回应了你");
            } else if (pi6Var.f149101a.additional.kankan.greetingSummaryDetail.unseen > 99) {
                if (zEquals) {
                    this.f25812d.setText("又有99+个人给你发消息");
                } else if (CoreModule.f17557o.m195057d().mo33700I5() || CoreModule.m29935P().m94651a().mo33526jj()) {
                    this.f25812d.setText("又有99+个人给你告白");
                } else {
                    this.f25812d.setText("又有99+个人给你打招呼");
                }
            } else if (zEquals) {
                this.f25812d.setText("又有" + i + "个人给你发消息");
            } else if (CoreModule.f17557o.m195057d().mo33700I5() || CoreModule.m29935P().m94651a().mo33526jj()) {
                this.f25812d.setText("又有" + i + "个人给你告白");
            } else {
                this.f25812d.setText(CoreModule.f17544b.getString(R$string.f18291Y4, Integer.valueOf(i)));
            }
        } else if (TextUtils.isEmpty(pi6Var.f149101a.additional.kankan.greetingSummaryDetail.latestUserId) || TextUtils.isEmpty(pi6Var.f149101a.additional.kankan.greetingSummaryDetail.latestMessageId)) {
            this.f25811c.setVisibility(8);
            this.f25812d.setVisibility(0);
            if ((zEquals || !CoreModule.f17557o.m195057d().mo33700I5()) && !CoreModule.m29935P().m94651a().mo33526jj()) {
                this.f25812d.setText(zEquals ? "暂无新消息" : CoreModule.f17544b.getString(R$string.f18321Z4));
            } else {
                this.f25812d.setText("暂无新告白");
            }
        } else {
            this.f25811c.setVisibility(0);
            this.f25812d.setVisibility(0);
            this.f25811c.setText("");
            this.f25812d.setText("");
            pi6Var.f149104d.mo67374c(pi6Var.f149124x, C22306c.combineLatest(CoreModule.f17545c.f19639e0.m169410Ka(pi6Var.f149101a.additional.kankan.greetingSummaryDetail.latestUserId), CoreModule.f17545c.f19678r0.m34153w6(pi6Var.f149101a.additional.kankan.greetingSummaryDetail.latestMessageId), new x9j() { // from class: l.p86
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return new j760((User) obj, (List) obj2);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.q86
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f153133a.m42403g1(zEquals, (j760) obj);
                }
            }));
        }
        o6j0.m162864h("e_anonymous_cell", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
        dml dmlVar = pi6Var.f149104d;
        if (zEquals) {
            dmlVar.mo67374c(pi6Var.f149124x, CoreModule.f17545c.f19678r0.f20034o0.flatMap(new w9j() { // from class: l.r86
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19678r0.m34159z6();
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.s86
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19678r0.m34122h5();
                }
            }, new e30() { // from class: l.t86
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19678r0.m34122h5();
                }
            }));
        } else {
            dmlVar.mo67374c(pi6Var.f149124x, CoreModule.f17545c.f19678r0.f20033n0.flatMap(new w9j() { // from class: l.u86
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19678r0.m34078C6();
                }
            })).subscribe(mkd0.m154956H(new e30() { // from class: l.v86
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19678r0.m34124i5();
                }
            }, new e30() { // from class: l.w86
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19678r0.m34124i5();
                }
            }));
        }
        xdl0.m208344M(this.f25813e, false);
        if (xdl0.m208349O0(this.f25813e)) {
            o6j0.m162864h("e_kankan_stranger_message_red_dot", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m42402f1(View view) {
        x86.m207368a(this, view);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m42403g1(boolean z, j760 j760Var) {
        String str;
        boolean z2;
        List list = (List) j760Var.f116565b;
        String strConcat = NullChecker.m81303a(j760Var.f116564a) ? ((User) j760Var.f116564a).name : "";
        if (vwb.m200296J(list)) {
            if ((z || !CoreModule.f17557o.m195057d().mo33700I5()) && !CoreModule.m29935P().m94651a().mo33526jj()) {
                this.f25812d.setText(z ? "暂无新消息" : CoreModule.f17544b.getString(R$string.f18321Z4));
                return;
            } else {
                this.f25812d.setText("暂无新告白");
                return;
            }
        }
        Message message = (Message) list.get(0);
        boolean zEquals = TextUtils.equals(message.owner, CoreModule.m29931H().userId());
        if (TextUtils.isEmpty(strConcat)) {
            str = "";
        } else {
            if (zEquals) {
                if (z) {
                    this.f25811c.setText("我");
                }
                z2 = false;
            } else {
                User user = (User) j760Var.f116564a;
                if (NullChecker.m81303a(user) && !user.isHideIconFromSVipWithMe() && user.isODiamond()) {
                    z2 = true;
                    xdl0.m208344M(this.f25810b, true);
                    this.f25810b.setImageResource(x2c0.f189744Sq);
                    this.f25811c.setTextColor(Color.parseColor("#a0000000"));
                    this.f25811c.setTypeface(eqh0.m117752c(3));
                } else {
                    m42404h1();
                    z2 = false;
                }
                VText vText = this.f25811c;
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
            this.f25812d.setText(str.concat(zEquals ? "送了一个礼物" : "送了你一个礼物"));
        } else if (TEnum.equals(message.messageType, "picture")) {
            this.f25812d.setText(str + CoreModule.f17544b.getResources().getString(R$string.f18334Zh, ""));
        } else {
            Boolean bool = message.recalled;
            if (bool == null || !bool.booleanValue()) {
                this.f25812d.setText(str + message.value);
            } else {
                this.f25812d.setText(str + CoreModule.f17544b.getResources().getString(R$string.f17735Fi));
            }
        }
        if (!z || zEquals) {
            this.f25811c.setTextSize(13.0f);
            return;
        }
        this.f25811c.setTextSize(14.0f);
        this.f25811c.setText("");
        if (strConcat.length() > 5) {
            strConcat = strConcat.substring(0, 5).concat("…");
        }
        this.f25812d.setText(strConcat + str + message.value);
    }

    @Override // p149l.rd6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m42404h1() {
        xdl0.m208344M(this.f25810b, false);
        this.f25811c.setTextColor(getResources().getColor(w0c0.f183858j0));
        this.f25811c.setTypeface(eqh0.m117752c(2));
        if (upa.m194847z()) {
            rd6.m178873e0(this.f25811c);
            rd6.m178873e0(this.f25812d);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m42405i1() {
        this.f25812d.setText(ye40.m214333a());
        xdl0.m208344M(this.f25811c, false);
        xdl0.m208344M(this.f25812d, true);
        xdl0.m208344M(this.f25813e, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42402f1(this);
    }

    @Override // p149l.bpl
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
