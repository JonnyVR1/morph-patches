package com.p051p1.mobile.putong.core.p058ui.messages.model.view;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Rect;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.TouchDelegate;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4900o;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.model.view.MessageActionBarLeftLayout;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageUserHeaderLayout;
import com.p051p1.mobile.putong.core.util.CertificationUtil;
import com.p051p1.mobile.putong.data.BubbleInfo;
import com.p051p1.mobile.putong.data.MatchFrom;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p051p1.mobile.putong.p070ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bkj0;
import p153l.bnl0;
import p153l.c17;
import p153l.clz;
import p153l.cvf0;
import p153l.egm;
import p153l.fsb0;
import p153l.fwy;
import p153l.g9c0;
import p153l.gta;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.nrb0;
import p153l.nuy;
import p153l.o1j0;
import p153l.ovb0;
import p153l.pf60;
import p153l.pzi0;
import p153l.qa00;
import p153l.qzz;
import p153l.rdz;
import p153l.rsf0;
import p153l.sfj0;
import p153l.uqb0;
import p153l.ux6;
import p153l.vnb;
import p153l.yxz;

/* JADX INFO: loaded from: classes4.dex */
public class MessageActionBarLeftLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MessageActionBarLeftLayout f32946a;

    /* JADX INFO: renamed from: b */
    public VFrame f32947b;

    /* JADX INFO: renamed from: c */
    public HeaderFrameWrapper f32948c;

    /* JADX INFO: renamed from: d */
    public VLinear f32949d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f32950e;

    /* JADX INFO: renamed from: f */
    public VLinear f32951f;

    /* JADX INFO: renamed from: g */
    public VFrame f32952g;

    /* JADX INFO: renamed from: h */
    public NewTalkProgressView f32953h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f32954i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f32955j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f32956k;

    /* JADX INFO: renamed from: l */
    public VText f32957l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f32958m;

    /* JADX INFO: renamed from: n */
    public VImage f32959n;

    /* JADX INFO: renamed from: o */
    public VLinear f32960o;

    /* JADX INFO: renamed from: p */
    public ODiamondTagLabel f32961p;

    /* JADX INFO: renamed from: q */
    public VImage f32962q;

    /* JADX INFO: renamed from: r */
    public VLinear f32963r;

    /* JADX INFO: renamed from: s */
    public VText f32964s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f32965t;

    /* JADX INFO: renamed from: u */
    public VImage f32966u;

    /* JADX INFO: renamed from: v */
    public VText f32967v;

    /* JADX INFO: renamed from: w */
    public VText f32968w;

    /* JADX INFO: renamed from: x */
    public VImage f32969x;

    /* JADX INFO: renamed from: y */
    public VText f32970y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.view.MessageActionBarLeftLayout$a */
    public class ViewOnClickListenerC8735a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f32971a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f32972b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MessagesAct f32973c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ fwy f32974d;

        public ViewOnClickListenerC8735a(User user, Map map, MessagesAct messagesAct, fwy fwyVar) {
            this.f32971a = user;
            this.f32972b = map;
            this.f32973c = messagesAct;
            this.f32974d = fwyVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(this.f32971a.f56859id);
            if (!NullChecker.m82486a(conversationM34219zp) || !conversationM34219zp.doubleDefault() || !NullChecker.m82486a(conversationM34219zp.additional.chatMM) || !conversationM34219zp.additional.chatMM.sparkSwitch) {
                MessageActionBarLeftLayout.this.m50683u(this.f32971a, this.f32974d.m143372e0().mo50158l());
            } else {
                i4g0.m138521s("e_spark", OMSDialogPositon.p_chat_view, this.f32972b);
                MessagesAct messagesAct = this.f32973c;
                cvf0.m112809a(messagesAct, messagesAct.f32488f.f82474c);
            }
        }
    }

    public MessageActionBarLeftLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m50661a(MessagesAct messagesAct, User user, View view) {
        i4g0.m138523u("e_character_guide", OMSDialogPositon.p_chat_view, jyb.m147494Y("guide_type", "tag"));
        C4900o.m35347r3(messagesAct, user, C4900o.m35348s3(C4900o.f20810T, user.f56859id, false, "chat_tag"));
    }

    /* JADX INFO: renamed from: A */
    public void m50666A(User user) {
        bnl0.m105524M(this.f32965t, !TextUtils.isEmpty(this.f32967v.getText()));
        bnl0.m105524M(this.f32968w, false);
    }

    /* JADX INFO: renamed from: B */
    public void m50667B(String str) {
        VText vText = this.f32957l;
        if (TextUtils.isEmpty(str)) {
            str = "已注销";
        }
        vText.setText(str);
    }

    /* JADX INFO: renamed from: f */
    public final void m50668f(View view) {
        nuy.m164820a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m50669g(User user) {
        if (!user.unilateralBlock() && (user.isHideActiveFromSVip() || CoreModule.f18264c.f20303E0.m141089x3(user))) {
            return user.isHideActiveFromSVip() ? pzi0.m174444I(CoreModule.m30933P().m143412i().mo180415W(user), true) : "";
        }
        if (user.location.isHideUpdateTime() || user.unilateralBlock()) {
            return "";
        }
        return CoreModule.m30933P().m143412i().mo180336I1(user) ? pzi0.m174444I(System.currentTimeMillis(), true) : pzi0.m174445J(user.location.updatedTime, true);
    }

    /* JADX INFO: renamed from: h */
    public final CharSequence m50670h(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = str.toLowerCase().indexOf(str2.toLowerCase());
        if (iIndexOf != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(g9c0.f102825o)), iIndexOf, str2.length() + iIndexOf, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: i */
    public void m50671i() {
        if (NullChecker.m82486a(this.f32949d)) {
            bnl0.m105524M(this.f32949d, false);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m50672j(Act act) {
        this.f32957l.setTextColor(gta.m132210e().m132214d().mo34702I4() ? getResources().getColor(g9c0.f102817g) : act.getAppTheme().mo134826f());
        this.f32967v.setTextColor(gta.m132210e().m132214d().mo34702I4() ? getResources().getColor(g9c0.f102819i) : Color.parseColor("#99212121"));
        this.f32957l.setTextSize(2, 16.0f);
        this.f32957l.getPaint().setFakeBoldText(true);
    }

    /* JADX INFO: renamed from: k */
    public void m50673k(final User user, fwy fwyVar) {
        this.f32948c.m80877E0(false, OMSDialogPositon.p_chat_view);
        final clz<? extends DbObject, ?> clzVarMo50158l = fwyVar.m143372e0().mo50158l();
        this.f32946a.setOnClickListener(new View.OnClickListener() { // from class: l.muy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138860a.m50680r(user, clzVarMo50158l, view);
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:115:0x02e9  */
    /* JADX WARN: Code duplicated, block: B:117:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:122:0x0330  */
    /* JADX WARN: Code duplicated, block: B:124:0x033e  */
    /* JADX WARN: Code duplicated, block: B:129:0x0373  */
    /* JADX WARN: Code duplicated, block: B:131:0x037f  */
    /* JADX WARN: Code duplicated, block: B:140:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:142:0x03de  */
    /* JADX WARN: Code duplicated, block: B:151:0x0433  */
    /* JADX WARN: Code duplicated, block: B:153:0x0441  */
    /* JADX INFO: renamed from: l */
    public void m50674l(final MessagesAct messagesAct, fwy fwyVar, ovb0<User, Boolean, pf60<Integer, Boolean>, Conversation> ovb0Var) {
        String str;
        MessageActionBarLeftLayout messageActionBarLeftLayout;
        MessagesAct messagesAct2;
        fwy fwyVar2;
        if (messagesAct.isTaskRoot()) {
            messagesAct.setTaskDescription(new ActivityManager.TaskDescription(ovb0Var.f149248a.name, (Bitmap) null, messagesAct.getResources().getColor(g9c0.f102803U)));
        }
        this.f32948c.setPadding(0, 0, 0, 0);
        this.f32948c.setBackgroundResource(0);
        final User user = ovb0Var.f149248a;
        StringBuilder sb = new StringBuilder();
        String strM50669g = m50669g(user);
        if (!TextUtils.isEmpty(strM50669g)) {
            sb.append(strM50669g);
        }
        if (!user.unilateralBlock() && messagesAct.f32488f.mo111008l7() && !user.isHideLocationFromSVip()) {
            String strM51148L = MessageUserHeaderLayout.m51148L(user);
            if (TextUtils.isEmpty(sb)) {
                sb.append(strM51148L);
            } else {
                sb.append(" · ");
                sb.append(strM51148L);
            }
        }
        this.f32967v.setText(sb);
        boolean z = !TextUtils.isEmpty(sb);
        m50667B(user.name);
        String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(user.f56859id);
        if (!TextUtils.isEmpty(strM116634y7)) {
            m50667B(strM116634y7);
        } else if (TextUtils.isEmpty(strM116634y7) && CoreModule.m30933P().m143412i().mo34307De()) {
            if (!NullChecker.m82486a(user) || user.inactivated) {
                m50667B("已注销");
            } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                m50667B("昵称已重置");
            }
        }
        bnl0.m105524M(this.f32961p, false);
        if (CoreModule.m30933P().m143410g().mo36059e() && NullChecker.m82486a(user) && !user.isHideIconFromSVipWithMe() && user.isSupremePartner()) {
            bnl0.m105524M(this.f32961p, true);
            this.f32961p.m80349n0();
        } else if (CoreModule.m30933P().m143410g().mo36051b8() && NullChecker.m82486a(user) && !user.isHideIconFromSVipWithMe() && user.isPlatinum()) {
            bnl0.m105524M(this.f32961p, true);
            this.f32961p.m80348m0();
        } else if (CoreModule.m30933P().m143412i().mo180293A1() && NullChecker.m82486a(user) && C4900o.m35346n3(user) && !nrb0.m164466b()) {
            String str2 = user.settings.getUserCharacter().classification;
            this.f32964s.setText(str2);
            if (TextUtils.equals(str2, "冰山威士忌")) {
                str = "#309cec";
            } else if (TextUtils.equals(str2, "陈年拉菲酒")) {
                str = "#e498b1";
            } else if (TextUtils.equals(str2, "清醒冰美式")) {
                str = "#6f4106";
            } else if (TextUtils.equals(str2, "手打柠檬茶")) {
                str = "#d5d700";
            } else if (TextUtils.equals(str2, "奥利奥奶茶")) {
                str = "#dfb74d";
            } else if (TextUtils.equals(str2, "橘子盐汽水")) {
                str = "#ff913b";
            } else {
                str = TextUtils.equals(str2, "纯纯凉白开") ? "#1fd2de" : "#65cb72";
            }
            this.f32964s.setBackground(egm.m120790a(Color.parseColor(str), qa00.f156318e));
            i4g0.m138492A("e_character_guide", OMSDialogPositon.p_chat_view, jyb.m147494Y("guide_type", "tag"));
            bnl0.m105525M0(this.f32963r, true);
            bnl0.m105509E0(this.f32963r, new View.OnClickListener() { // from class: l.luy
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessageActionBarLeftLayout.m50661a(messagesAct, user, view);
                }
            });
        }
        String string = this.f32967v.getText().toString();
        if (TextUtils.isEmpty(string)) {
            string = "";
        }
        String str3 = string;
        bnl0.m105524M(this.f32966u, false);
        bnl0.m105540X(this.f32965t, 0);
        if (gta.m132210e().m132214d().mo34776W8() && NullChecker.m82486a(ovb0Var.f149251d) && NullChecker.m82486a(ovb0Var.f149251d.additional) && NullChecker.m82486a(ovb0Var.f149251d.additional.chatMM)) {
            Conversation conversation = ovb0Var.f149251d;
            if (conversation.additional.chatMM.sparkSwitch && conversation.doubleDefault()) {
                Conversation conversation2 = ovb0Var.f149251d;
                if (conversation2.additional.chatMM.level <= 0 || conversation2.additional.chatMM.mmCnt < 3) {
                    messageActionBarLeftLayout = this;
                    messagesAct2 = messagesAct;
                    fwyVar2 = fwyVar;
                    if (!CoreModule.m30933P().m143405a().mo34529jj()) {
                        if (!CoreModule.m30933P().m143410g().mo36088xn()) {
                            if (!CoreModule.f18276o.m132214d().mo34703I5()) {
                                if (!CoreModule.m30933P().m143412i().mo180542u()) {
                                    if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                        messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                                    }
                                } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                    messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                                }
                            } else if (!CoreModule.m30933P().m143412i().mo180542u()) {
                                if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                    messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                                }
                            } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                            }
                        } else if (!CoreModule.f18276o.m132214d().mo34703I5()) {
                            if (!CoreModule.m30933P().m143412i().mo180542u()) {
                                if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                    messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                                }
                            } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                            }
                        } else if (!CoreModule.m30933P().m143412i().mo180542u()) {
                            if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                            }
                        } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                            messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                        }
                    } else if (!CoreModule.m30933P().m143410g().mo36088xn()) {
                        if (!CoreModule.f18276o.m132214d().mo34703I5()) {
                            if (!CoreModule.m30933P().m143412i().mo180542u()) {
                                if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                    messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                                }
                            } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                            }
                        } else if (!CoreModule.m30933P().m143412i().mo180542u()) {
                            if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                            }
                        } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                            messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                        }
                    } else if (!CoreModule.f18276o.m132214d().mo34703I5()) {
                        if (!CoreModule.m30933P().m143412i().mo180542u()) {
                            if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                            }
                        } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                            messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                        }
                    } else if (!CoreModule.m30933P().m143412i().mo180542u()) {
                        if (CoreModule.m30933P().m143408e().mo35993wq()) {
                            messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                        }
                    } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                        messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                    }
                } else {
                    bnl0.m105524M(this.f32966u, true);
                    Conversation conversation3 = ovb0Var.f149251d;
                    int i = conversation3.additional.chatMM.level;
                    int i2 = conversation3.additional.chatMM.mmCnt;
                    bnl0.m105524M(this.f32966u, true);
                    HashMap map = new HashMap();
                    if (i == 1) {
                        this.f32966u.setBackgroundResource(ibc0.f113859N);
                    } else {
                        VImage vImage = this.f32966u;
                        if (i == 2) {
                            vImage.setBackgroundResource(ibc0.f113868O);
                        } else {
                            vImage.setBackgroundResource(ibc0.f113877P);
                        }
                    }
                    bnl0.m105540X(this.f32965t, -qa00.f156316c);
                    map.put("spark_level", Integer.valueOf(i));
                    map.put("message_pairs", Integer.valueOf(i2));
                    i4g0.m138527y("e_spark", OMSDialogPositon.p_chat_view, map);
                    boolean zIsEmpty = TextUtils.isEmpty(str3);
                    VText vText = this.f32967v;
                    if (zIsEmpty) {
                        vText.setText(String.valueOf(i2));
                    } else {
                        vText.setText(c17.m107523p0(String.valueOf(i2), str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                    }
                    messageActionBarLeftLayout = this;
                    messagesAct2 = messagesAct;
                    fwyVar2 = fwyVar;
                    bnl0.m105509E0(this.f32965t, messageActionBarLeftLayout.new ViewOnClickListenerC8735a(user, map, messagesAct2, fwyVar2));
                }
                z = true;
            } else {
                messageActionBarLeftLayout = this;
                messagesAct2 = messagesAct;
                fwyVar2 = fwyVar;
                if (!CoreModule.m30933P().m143405a().mo34529jj()) {
                    if (!CoreModule.m30933P().m143410g().mo36088xn()) {
                        if (!CoreModule.f18276o.m132214d().mo34703I5()) {
                            if (!CoreModule.m30933P().m143412i().mo180542u()) {
                                if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                    messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                                    z = true;
                                }
                            } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                                z = true;
                            }
                        } else if (!CoreModule.m30933P().m143412i().mo180542u()) {
                            if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                                z = true;
                            }
                        } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                            messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                            z = true;
                        }
                    } else if (!CoreModule.f18276o.m132214d().mo34703I5()) {
                        if (!CoreModule.m30933P().m143412i().mo180542u()) {
                            if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                                z = true;
                            }
                        } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                            messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                            z = true;
                        }
                    } else if (!CoreModule.m30933P().m143412i().mo180542u()) {
                        if (CoreModule.m30933P().m143408e().mo35993wq()) {
                            messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                            z = true;
                        }
                    } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                        messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                        z = true;
                    }
                } else if (!CoreModule.m30933P().m143410g().mo36088xn()) {
                    if (!CoreModule.f18276o.m132214d().mo34703I5()) {
                        if (!CoreModule.m30933P().m143412i().mo180542u()) {
                            if (CoreModule.m30933P().m143408e().mo35993wq()) {
                                messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                                z = true;
                            }
                        } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                            messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                            z = true;
                        }
                    } else if (!CoreModule.m30933P().m143412i().mo180542u()) {
                        if (CoreModule.m30933P().m143408e().mo35993wq()) {
                            messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                            z = true;
                        }
                    } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                        messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                        z = true;
                    }
                } else if (!CoreModule.f18276o.m132214d().mo34703I5()) {
                    if (!CoreModule.m30933P().m143412i().mo180542u()) {
                        if (CoreModule.m30933P().m143408e().mo35993wq()) {
                            messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                            z = true;
                        }
                    } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                        messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                        z = true;
                    }
                } else if (!CoreModule.m30933P().m143412i().mo180542u()) {
                    if (CoreModule.m30933P().m143408e().mo35993wq()) {
                        messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                        z = true;
                    }
                } else if (CoreModule.m30933P().m143408e().mo35993wq()) {
                    messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
                    z = true;
                }
            }
        } else {
            messageActionBarLeftLayout = this;
            messagesAct2 = messagesAct;
            fwyVar2 = fwyVar;
            if (!CoreModule.m30933P().m143405a().mo34529jj() && NullChecker.m82486a(ovb0Var.f149251d) && ovb0Var.f149251d.isConfessionFirstConv()) {
                messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自抢先告白", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
            } else if (!CoreModule.m30933P().m143410g().mo36088xn() && NullChecker.m82486a(ovb0Var.f149251d) && ovb0Var.f149251d.isConfessionFirstConv()) {
                messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自抢先告白", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
            } else if (!CoreModule.f18276o.m132214d().mo34703I5() && NullChecker.m82486a(ovb0Var.f149251d) && NullChecker.m82486a(ovb0Var.f149251d.additional) && NullChecker.m82486a(ovb0Var.f149251d.additional.greetingInfo) && ovb0Var.f149251d.additional.greetingInfo.fromGreeting) {
                messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自抢先告白", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
            } else if (!CoreModule.m30933P().m143412i().mo180542u() && NullChecker.m82486a(ovb0Var.f149251d) && ovb0Var.f149251d.isHeartbeatConv()) {
                if (CoreModule.m30933P().m143412i().mo34605uh() && !ovb0Var.f149251d.isLimitMatch()) {
                    messageActionBarLeftLayout.f32967v.setText(c17.m107522o0(CoreModule.f18263b.getString(R$string.f21662a3), str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k)));
                }
            } else if (CoreModule.m30933P().m143408e().mo35993wq() && NullChecker.m82486a(ovb0Var.f149248a) && NullChecker.m82486a(ovb0Var.f149248a.localRelationship) && NullChecker.m82486a(ovb0Var.f149248a.localRelationship.status) && ovb0Var.f149248a.localRelationship.status.contains(MatchFrom.get("boosted"))) {
                messageActionBarLeftLayout.f32967v.setText(c17.m107523p0("来自加速配对", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k), false));
            }
            z = true;
        }
        if (CoreModule.m30933P().m143412i().mo34605uh() && CoreModule.m30933P().m143412i().mo180446c() && NullChecker.m82486a(ovb0Var.f149251d) && TextUtils.equals(ovb0Var.f149251d.convType, "quickchat")) {
            messageActionBarLeftLayout.f32967v.setText(c17.m107522o0(CoreModule.m30933P().m143412i().mo180490j5(ovb0Var.f149251d) ? "来自语音闪聊" : "来自闪聊匹配", str3, CoreModule.f18263b.getResources().getColor(g9c0.f102821k), CoreModule.f18263b.getResources().getColor(g9c0.f102821k)));
            z = true;
        }
        if (messagesAct2.m50142E2()) {
            z = false;
        }
        messageActionBarLeftLayout.f32957l.requestLayout();
        if (bnl0.m105529O0(messageActionBarLeftLayout.f32965t)) {
            fwyVar2.m127900Q1();
            bnl0.m105524M(messageActionBarLeftLayout.f32968w, false);
        }
        bnl0.m105524M(messagesAct2.mo50158l().m111048t7().m178960m0().getRightIconContainer(), true);
        bnl0.m105524M(messageActionBarLeftLayout.f32965t, z);
        messageActionBarLeftLayout.f32957l.requestLayout();
    }

    /* JADX INFO: renamed from: m */
    public void m50675m(pf60<User, pf60<Integer, Boolean>> pf60Var, int i) {
        User user = pf60Var.f152156a;
        if (CoreModule.m30933P().m143412i().mo34307De() && (!NullChecker.m82486a(user) || user.inactivated || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN)))) {
            this.f32948c.m80896z0(ibc0.f114059k1);
            bnl0.m105524M(this.f32952g, false);
            bnl0.m105524M(this.f32947b, true);
            bnl0.m105524M(this.f32965t, false);
            return;
        }
        if (NullChecker.m82486a(user)) {
            CoreModule.m30933P().m143406b().mo36135xp(this.f32948c.get_pic(), ux6.m198403a(user).profileSmall(), i);
            this.f32948c.m80878G0(false);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m50676n(Act act, User user) {
        if (nrb0.m164466b()) {
            if (this.f32960o.getChildCount() > 0) {
                return;
            }
            bnl0.m105524M(this.f32959n, false);
            View viewM59330f = CertificationUtil.m59330f(act, user, CertificationUtil.CertificationIconStyle.IM);
            bnl0.m105524M(this.f32960o, NullChecker.m82486a(viewM59330f));
            if (viewM59330f == null) {
                return;
            }
            this.f32960o.addView(viewM59330f);
            return;
        }
        if (!gta.m132210e().m132214d().mo34702I4()) {
            uqb0.f180396b0.f170325b.showUserVerificationLogo(act, user, this.f32959n);
            return;
        }
        if (this.f32960o.getChildCount() > 0) {
            return;
        }
        bnl0.m105524M(this.f32959n, false);
        View viewM59330f2 = CertificationUtil.m59330f(act, user, CertificationUtil.CertificationIconStyle.IM_EXP);
        if (viewM59330f2 == null) {
            return;
        }
        this.f32960o.addView(viewM59330f2);
        bnl0.m105524M(this.f32960o, true);
    }

    /* JADX INFO: renamed from: o */
    public void m50677o(Act act, User user) {
        if (CoreModule.m30933P().m143412i().mo180325G1()) {
            if (!nrb0.m164466b()) {
                if (!gta.m132210e().m132214d().mo34702I4()) {
                    uqb0.f180396b0.f170325b.showUserVerificationLogo(act, user, this.f32959n);
                    return;
                }
                if (this.f32960o.getChildCount() > 0) {
                    return;
                }
                bnl0.m105524M(this.f32959n, false);
                View viewM59330f = CertificationUtil.m59330f(act, user, CertificationUtil.CertificationIconStyle.IM_EXP);
                if (viewM59330f == null) {
                    return;
                }
                this.f32960o.addView(viewM59330f);
                bnl0.m105524M(this.f32960o, true);
                return;
            }
            if (this.f32960o.getChildCount() > 0) {
                return;
            }
            bnl0.m105524M(this.f32959n, false);
            if (!gta.m132210e().m132214d().mo34927t9() || rsf0.m182965i(bnl0.m105592y0()) >= 400.0f) {
                View viewM59330f2 = CertificationUtil.m59330f(act, user, CertificationUtil.CertificationIconStyle.IM);
                if (viewM59330f2 == null) {
                    return;
                }
                this.f32960o.addView(viewM59330f2);
                bnl0.m105524M(this.f32960o, true);
                return;
            }
            int iM59333i = CertificationUtil.m59333i(user, false);
            if (iM59333i == -1) {
                return;
            }
            ImageView imageView = new ImageView(act);
            imageView.setImageResource(iM59333i);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(qa00.m175859d(16.0f), qa00.m175859d(16.0f)));
            this.f32960o.addView(imageView);
            bnl0.m105524M(this.f32960o, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m50668f(this);
        this.f32969x.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113981b4 : ibc0.f113972a4);
    }

    /* JADX INFO: renamed from: p */
    public void m50678p(MessagesAct messagesAct, bkj0<User, pf60<Integer, Boolean>, Conversation> bkj0Var, fwy fwyVar) {
        qzz qzzVarM111048t7 = fwyVar.m143372e0().mo50158l().m111048t7();
        if (qzzVarM111048t7 instanceof yxz) {
            yxz yxzVar = (yxz) qzzVarM111048t7;
            User user = bkj0Var.f77081a;
            if (CoreModule.m30933P().m143412i().mo34307De() && (!NullChecker.m82486a(user) || user.inactivated || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN)))) {
                this.f32948c.m80896z0(ibc0.f114059k1);
                bnl0.m105524M(this.f32952g, false);
                bnl0.m105524M(this.f32947b, true);
                bnl0.m105524M(this.f32965t, false);
                return;
            }
            int iMo127910l0 = fwyVar.mo127910l0();
            if (iMo127910l0 != 100) {
                if (NullChecker.m82486a(yxzVar.f160421t1.mo175736c())) {
                    yxzVar.f160421t1.mo175736c().m51182F0(user, iMo127910l0);
                }
                CoreModule.m30933P().m143412i().mo180566y2(this.f32948c.get_pic(), ux6.m198403a(user).profileSmall(), iMo127910l0);
                CoreModule.m30933P().m143412i().mo180566y2(this.f32954i, ux6.m198403a(user).profileSmall(), iMo127910l0);
                bnl0.m105524M(this.f32952g, true);
                bnl0.m105524M(this.f32947b, false);
                if (CoreModule.m30933P().m143412i().mo34605uh()) {
                    this.f32953h.setBitmapRes(ibc0.f113957Y5);
                }
                this.f32953h.setThreeDp(qa00.m175859d(2.5f));
                this.f32953h.setProgress(iMo127910l0);
                this.f32948c.m80878G0(false);
            } else {
                boolean zM127902e1 = fwyVar.m127902e1();
                rdz rdzVar = yxzVar.f160421t1;
                if (zM127902e1) {
                    if (NullChecker.m82486a(rdzVar.mo175736c())) {
                        yxzVar.f160421t1.mo175736c().m51184G0(user, 0);
                    }
                } else if (NullChecker.m82486a(rdzVar.mo175736c())) {
                    yxzVar.f160421t1.mo175736c().setOtherSmallImage(user);
                }
                if (fwyVar.m127902e1()) {
                    CoreModule.m30933P().m143412i().mo180566y2(this.f32948c.get_pic(), ux6.m198403a(user).profileSmall(), 0);
                    this.f32948c.m80878G0(false);
                } else {
                    this.f32948c.m80893v0(user, ux6.m198403a(user).profileSmall());
                    if (messagesAct.m50142E2()) {
                        this.f32948c.m80878G0(false);
                    }
                }
                bnl0.m105524M(this.f32952g, false);
                bnl0.m105524M(this.f32947b, true);
            }
            if (bkj0Var.f77083c.isQuickChatClearAvatar(CoreModule.f18264c.f20381e0.m116593na()) && NullChecker.m82486a(yxzVar.f160421t1.mo175736c())) {
                yxzVar.f160421t1.mo175736c().setOtherSmallImage(user);
                uqb0.f180374G.m127115L0(this.f32954i, ux6.m198403a(user).profileSmall().formatted());
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m50679q(fwy fwyVar) {
        final clz<? extends DbObject, ?> clzVarMo50158l = fwyVar.m143372e0().mo50158l();
        final View view = (View) this.f32969x.getParent();
        view.post(new Runnable() { // from class: l.juy
            @Override // java.lang.Runnable
            public final void run() {
                this.f122750a.m50681s(view);
            }
        });
        bnl0.m105539W(this.f32955j, qa00.m175859d(32.0f));
        bnl0.m105552e0(this.f32956k, qa00.m175859d(6.0f));
        vnb.m201946M(this.f32969x, true);
        bnl0.m105509E0(this.f32969x, new View.OnClickListener() { // from class: l.kuy
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f128928a.m50682t(clzVarMo50158l, view2);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m50680r(User user, clz clzVar, View view) {
        m50683u(user, clzVar);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m50681s(View view) {
        Rect rect = new Rect();
        this.f32969x.getHitRect(rect);
        rect.top -= 10;
        rect.bottom += 10;
        rect.left -= 10;
        rect.right += 10;
        TouchDelegate touchDelegate = new TouchDelegate(rect, this.f32969x);
        if (View.class.isInstance(this.f32969x.getParent())) {
            view.setTouchDelegate(touchDelegate);
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m50682t(clz clzVar, View view) {
        if (clzVar.m111048t7().m178962n0()) {
            clzVar.m111048t7().m178940e0();
            this.f32969x.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113963Z3 : ibc0.f113955Y3);
        } else {
            clzVar.m111048t7().m178948h0();
            this.f32969x.setImageResource(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113981b4 : ibc0.f113972a4);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m50683u(User user, clz clzVar) {
        if (CoreModule.m30933P().m143412i().mo34307De()) {
            if (!NullChecker.m82486a(user) || user.inactivated) {
                o1j0.m165636j("对方已注销");
                return;
            } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                o1j0.m165636j("对方账号异常");
                return;
            }
        }
        sfj0.m185596c("e_chat_avatar", clzVar.pageId(), sfj0.C20032a.m185615h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.m30929H().userId(), clzVar.mo111034r3()))));
        clzVar.m111056v6("messages_title");
    }

    /* JADX INFO: renamed from: v */
    public void m50684v(String str) {
        bnl0.m105524M(this.f32949d, true);
        uqb0.f180374G.m127115L0(this.f32950e, str);
    }

    /* JADX INFO: renamed from: w */
    public void m50685w(BubbleInfo bubbleInfo) {
        bnl0.m105524M(this.f32949d, true);
        fsb0 fsb0Var = uqb0.f180374G;
        VDraweeView vDraweeView = this.f32950e;
        String str = bubbleInfo.emotion.emojiUrl;
        int i = qa00.f156329p;
        fsb0Var.m127109I0(vDraweeView, str, i, i);
    }

    /* JADX INFO: renamed from: x */
    public void m50686x(ChatGroup chatGroup, boolean z) {
        if (jyb.m147479J(chatGroup.avatars)) {
            uqb0.f180374G.m127138Y0(this.f32948c.get_pic(), ibc0.f113815I0);
        } else {
            uqb0.f180374G.m127140Z0(this.f32948c.get_pic(), chatGroup.avatars.get(0).cover().profileSmall().formatted());
        }
        if (chatGroup.onlineCount <= 1 || !z) {
            bnl0.m105524M(this.f32970y, true);
            bnl0.m105524M(this.f32951f, false);
            this.f32970y.setText(chatGroup.name);
            return;
        }
        bnl0.m105524M(this.f32970y, false);
        bnl0.m105524M(this.f32951f, true);
        String str = chatGroup.onlineCount + getContext().getResources().getString(R$string.f21806q3);
        this.f32967v.setText(m50670h(str + getContext().getResources().getString(R$string.f21817r6), str));
        this.f32957l.setText(chatGroup.name);
    }

    /* JADX INFO: renamed from: y */
    public void m50687y(MessagesAct messagesAct, fwy fwyVar, User user) {
        Conversation conversation = fwyVar.m143372e0().mo50158l().f82482k;
        if (CoreModule.m30933P().m143412i().mo34307De() && (!NullChecker.m82486a(user) || user.inactivated || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN)))) {
            this.f32948c.m80896z0(ibc0.f114059k1);
            bnl0.m105524M(this.f32952g, false);
            bnl0.m105524M(this.f32947b, true);
            bnl0.m105524M(this.f32965t, false);
        } else if ((CoreModule.m30933P().m143412i().mo180446c() && user.onlineMatchLocked()) || fwyVar.m127902e1()) {
            CoreModule.m30933P().m143412i().mo180566y2(this.f32948c.get_pic(), ux6.m198403a(user).profileSmall(), fwyVar.mo127910l0());
        } else if (CoreModule.m30933P().m143406b().mo36110Yg() && NullChecker.m82486a(user) && user.isLoveBuzz()) {
            CoreModule.m30933P().m143406b().mo36135xp(this.f32948c.get_pic(), ux6.m198403a(user).profileSmall(), fwyVar.mo127908k0());
        } else {
            if ((NullChecker.m82486a(conversation) && conversation.isAnonymous()) || fwyVar.m143372e0().mo50158l().m110940Y3()) {
                uqb0.f180374G.m127115L0(this.f32948c.get_pic(), user.getAnonymousUrl());
            } else {
                this.f32948c.m80893v0(user, ux6.m198403a(user).profileSmall());
                if (messagesAct.m50142E2()) {
                }
            }
            this.f32948c.m80878G0(false);
        }
        if (NullChecker.m82486a(conversation) && conversation.isQuickChatClearAvatar(CoreModule.f18264c.f20381e0.m116593na())) {
            uqb0.f180374G.m127115L0(this.f32948c.get_pic(), user.m61308fp().profileSmall().formatted());
            uqb0.f180374G.m127115L0(this.f32954i, ux6.m198403a(user).profileSmall().formatted());
        }
    }

    /* JADX INFO: renamed from: z */
    public void m50688z(User user) {
        boolean z = false;
        bnl0.m105524M(this.f32965t, false);
        VText vText = this.f32968w;
        if (NullChecker.m82486a(user) && !user.unilateralBlock()) {
            z = true;
        }
        bnl0.m105524M(vText, z);
    }

    public MessageActionBarLeftLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageActionBarLeftLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
