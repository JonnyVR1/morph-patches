package com.p000p1.mobile.putong.core.newui.messages.itemview;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.List;
import l.dml;
import l.e30;
import l.eqh0;
import l.j760;
import l.mkd0;
import l.o6j0;
import l.u59;
import l.upa;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.x86;
import l.x9j;
import l.xdl0;
import p009l.cpl;
import p009l.pi6;
import p009l.rd6;
import p009l.ye40;
import rx.c;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationItemGreetSubTitleView extends LinearLayout implements cpl {

    /* JADX INFO: renamed from: a */
    public ConversationItemGreetSubTitleView f4587a;

    /* JADX INFO: renamed from: b */
    public VImage f4588b;

    /* JADX INFO: renamed from: c */
    public VText f4589c;

    /* JADX INFO: renamed from: d */
    public VText f4590d;

    /* JADX INFO: renamed from: e */
    public VText f4591e;

    /* JADX INFO: renamed from: f */
    public pi6 f4592f;

    public ConversationItemGreetSubTitleView(Context context) {
        super(context);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: J */
    public void mo6556J(pi6 pi6Var) {
        this.f4592f = pi6Var;
        final boolean zEquals = TextUtils.equals(((DbObject) pi6Var.f18622a).id, "fake_conversation_anonymous_greeting");
        if (!zEquals && ye40.m25301b()) {
            m6560i1();
            return;
        }
        this.f4589c.setText("");
        this.f4590d.setText("");
        int i = pi6Var.f18622a.additional.kankan.greetingSummaryDetail.unseen;
        m6559h1();
        if (i > 0) {
            this.f4589c.setVisibility(8);
            this.f4590d.setVisibility(0);
            if (u59.T()) {
                this.f4590d.setText(CoreModule.b.getString(R.string.Y4, Integer.valueOf(i)));
            } else if (!upa.I2()) {
                this.f4590d.setText("又有" + pi6Var.f18622a.additional.kankan.greetingSummaryDetail.unseen + "个人回应了你");
            } else if (pi6Var.f18622a.additional.kankan.greetingSummaryDetail.unseen > 99) {
                if (zEquals) {
                    this.f4590d.setText("又有99+个人给你发消息");
                } else if (CoreModule.o.d().I5() || CoreModule.P().a().jj()) {
                    this.f4590d.setText("又有99+个人给你告白");
                } else {
                    this.f4590d.setText("又有99+个人给你打招呼");
                }
            } else if (zEquals) {
                this.f4590d.setText("又有" + i + "个人给你发消息");
            } else if (CoreModule.o.d().I5() || CoreModule.P().a().jj()) {
                this.f4590d.setText("又有" + i + "个人给你告白");
            } else {
                this.f4590d.setText(CoreModule.b.getString(R.string.Y4, Integer.valueOf(i)));
            }
        } else if (TextUtils.isEmpty(pi6Var.f18622a.additional.kankan.greetingSummaryDetail.latestUserId) || TextUtils.isEmpty(pi6Var.f18622a.additional.kankan.greetingSummaryDetail.latestMessageId)) {
            this.f4589c.setVisibility(8);
            this.f4590d.setVisibility(0);
            if ((zEquals || !CoreModule.o.d().I5()) && !CoreModule.P().a().jj()) {
                this.f4590d.setText(zEquals ? "暂无新消息" : CoreModule.b.getString(R.string.Z4));
            } else {
                this.f4590d.setText("暂无新告白");
            }
        } else {
            this.f4589c.setVisibility(0);
            this.f4590d.setVisibility(0);
            this.f4589c.setText("");
            this.f4590d.setText("");
            pi6Var.f18625d.c(pi6Var.f18645x, c.combineLatest(CoreModule.c.e0.Ka(pi6Var.f18622a.additional.kankan.greetingSummaryDetail.latestUserId), CoreModule.c.r0.w6(pi6Var.f18622a.additional.kankan.greetingSummaryDetail.latestMessageId), new x9j() { // from class: l.p86
                public final Object call(Object obj, Object obj2) {
                    return new j760((User) obj, (List) obj2);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.q86
                public final void call(Object obj) {
                    this.f19066a.m6558g1(zEquals, (j760) obj);
                }
            }));
        }
        o6j0.h("e_anonymous_cell", "p_messages_view", new o6j0.a[0]);
        dml dmlVar = pi6Var.f18625d;
        if (zEquals) {
            dmlVar.c(pi6Var.f18645x, CoreModule.c.r0.o0.flatMap(new w9j() { // from class: l.r86
                public final Object call(Object obj) {
                    return CoreModule.c.r0.z6();
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.s86
                public final void call(Object obj) {
                    CoreModule.c.r0.h5();
                }
            }, new e30() { // from class: l.t86
                public final void call(Object obj) {
                    CoreModule.c.r0.h5();
                }
            }));
        } else {
            dmlVar.c(pi6Var.f18645x, CoreModule.c.r0.n0.flatMap(new w9j() { // from class: l.u86
                public final Object call(Object obj) {
                    return CoreModule.c.r0.C6();
                }
            })).subscribe(mkd0.H(new e30() { // from class: l.v86
                public final void call(Object obj) {
                    CoreModule.c.r0.i5();
                }
            }, new e30() { // from class: l.w86
                public final void call(Object obj) {
                    CoreModule.c.r0.i5();
                }
            }));
        }
        xdl0.M(this.f4591e, false);
        if (xdl0.O0(this.f4591e)) {
            o6j0.h("e_kankan_stranger_message_red_dot", "p_messages_view", new o6j0.a[0]);
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final void m6557f1(View view) {
        x86.a(this, view);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0098  */
    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m6558g1(boolean z, j760 j760Var) {
        String str;
        boolean z2;
        List list = (List) j760Var.b;
        String strConcat = NullChecker.a(j760Var.a) ? ((User) j760Var.a).name : "";
        if (vwb.J(list)) {
            if ((z || !CoreModule.o.d().I5()) && !CoreModule.P().a().jj()) {
                this.f4590d.setText(z ? "暂无新消息" : CoreModule.b.getString(R.string.Z4));
                return;
            } else {
                this.f4590d.setText("暂无新告白");
                return;
            }
        }
        Message message = (Message) list.get(0);
        boolean zEquals = TextUtils.equals(message.owner, CoreModule.H().userId());
        if (TextUtils.isEmpty(strConcat)) {
            str = "";
        } else {
            if (zEquals) {
                if (z) {
                    this.f4589c.setText("我");
                }
                z2 = false;
            } else {
                User user = (User) j760Var.a;
                if (NullChecker.a(user) && !user.isHideIconFromSVipWithMe() && user.isODiamond()) {
                    z2 = true;
                    xdl0.M(this.f4588b, true);
                    this.f4588b.setImageResource(x2c0.Sq);
                    this.f4589c.setTextColor(Color.parseColor("#a0000000"));
                    this.f4589c.setTypeface(eqh0.c(3));
                } else {
                    m6559h1();
                    z2 = false;
                }
                VText vText = this.f4589c;
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
        if (TEnum.equals(message.messageType, "chat_gift")) {
            this.f4590d.setText(str.concat(zEquals ? "送了一个礼物" : "送了你一个礼物"));
        } else if (TEnum.equals(message.messageType, "picture")) {
            this.f4590d.setText(str + CoreModule.b.getResources().getString(R.string.Zh, ""));
        } else {
            Boolean bool = message.recalled;
            if (bool == null || !bool.booleanValue()) {
                this.f4590d.setText(str + message.value);
            } else {
                this.f4590d.setText(str + CoreModule.b.getResources().getString(R.string.Fi));
            }
        }
        if (!z || zEquals) {
            this.f4589c.setTextSize(13.0f);
            return;
        }
        this.f4589c.setTextSize(14.0f);
        this.f4589c.setText("");
        if (strConcat.length() > 5) {
            strConcat = strConcat.substring(0, 5).concat("…");
        }
        this.f4590d.setText(strConcat + str + message.value);
    }

    @Override // p009l.rd6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    /* JADX INFO: renamed from: h1 */
    public final void m6559h1() {
        xdl0.M(this.f4588b, false);
        this.f4589c.setTextColor(getResources().getColor(w0c0.j0));
        this.f4589c.setTypeface(eqh0.c(2));
        if (upa.z()) {
            rd6.m21514e0(this.f4589c);
            rd6.m21514e0(this.f4590d);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public final void m6560i1() {
        this.f4590d.setText(ye40.m25300a());
        xdl0.M(this.f4589c, false);
        xdl0.M(this.f4590d, true);
        xdl0.M(this.f4591e, false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6557f1(this);
    }

    @Override // p009l.bpl
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
