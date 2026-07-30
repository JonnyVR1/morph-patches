package com.p046p1.mobile.putong.core.p053ui.messages.model.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4749o;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.newui.talk.view.NewTalkProgressView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.model.view.MessageActionBarLeftLayout;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageUserHeaderLayout;
import com.p046p1.mobile.putong.core.util.CertificationUtil;
import com.p046p1.mobile.putong.data.BubbleInfo;
import com.p046p1.mobile.putong.data.MatchFrom;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p046p1.mobile.putong.p065ui.headframe.HeaderFrameWrapper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.Map;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.a1c0;
import p149l.bkb0;
import p149l.bpz;
import p149l.c3c0;
import p149l.fcz;
import p149l.hmb;
import p149l.ikf0;
import p149l.iny;
import p149l.j760;
import p149l.jjb0;
import p149l.knb0;
import p149l.lsi0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.odm;
import p149l.qib0;
import p149l.qly;
import p149l.rw6;
import p149l.t100;
import p149l.tmf0;
import p149l.tqz;
import p149l.u4z;
import p149l.ura;
import p149l.vwb;
import p149l.xaj0;
import p149l.xdl0;
import p149l.zvf0;
import p149l.zz6;

/* JADX INFO: loaded from: classes3.dex */
public class MessageActionBarLeftLayout extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public MessageActionBarLeftLayout f32098a;

    /* JADX INFO: renamed from: b */
    public VFrame f32099b;

    /* JADX INFO: renamed from: c */
    public HeaderFrameWrapper f32100c;

    /* JADX INFO: renamed from: d */
    public VLinear f32101d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f32102e;

    /* JADX INFO: renamed from: f */
    public VLinear f32103f;

    /* JADX INFO: renamed from: g */
    public VFrame f32104g;

    /* JADX INFO: renamed from: h */
    public NewTalkProgressView f32105h;

    /* JADX INFO: renamed from: i */
    public VDraweeView f32106i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f32107j;

    /* JADX INFO: renamed from: k */
    public LinearLayout f32108k;

    /* JADX INFO: renamed from: l */
    public VText f32109l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f32110m;

    /* JADX INFO: renamed from: n */
    public VImage f32111n;

    /* JADX INFO: renamed from: o */
    public VLinear f32112o;

    /* JADX INFO: renamed from: p */
    public ODiamondTagLabel f32113p;

    /* JADX INFO: renamed from: q */
    public VImage f32114q;

    /* JADX INFO: renamed from: r */
    public VLinear f32115r;

    /* JADX INFO: renamed from: s */
    public VText f32116s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f32117t;

    /* JADX INFO: renamed from: u */
    public VImage f32118u;

    /* JADX INFO: renamed from: v */
    public VText f32119v;

    /* JADX INFO: renamed from: w */
    public VText f32120w;

    /* JADX INFO: renamed from: x */
    public VImage f32121x;

    /* JADX INFO: renamed from: y */
    public VText f32122y;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.view.MessageActionBarLeftLayout$a */
    public class ViewOnClickListenerC8572a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f32123a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Map f32124b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ MessagesAct f32125c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ iny f32126d;

        public ViewOnClickListenerC8572a(User user, Map map, MessagesAct messagesAct, iny inyVar) {
            this.f32123a = user;
            this.f32124b = map;
            this.f32125c = messagesAct;
            this.f32126d = inyVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(this.f32123a.f56011id);
            if (!NullChecker.m81303a(conversationM33216zp) || !conversationM33216zp.doubleDefault() || !NullChecker.m81303a(conversationM33216zp.additional.chatMM) || !conversationM33216zp.additional.chatMM.sparkSwitch) {
                MessageActionBarLeftLayout.this.m49500u(this.f32123a, this.f32126d.m156455e0().mo48974l());
            } else {
                zvf0.m220397s("e_spark", OMSDialogPositon.p_chat_view, this.f32124b);
                MessagesAct messagesAct = this.f32125c;
                tmf0.m189689a(messagesAct, messagesAct.f31640f.f96911c);
            }
        }
    }

    public MessageActionBarLeftLayout(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m49478a(MessagesAct messagesAct, User user, View view) {
        zvf0.m220399u("e_character_guide", OMSDialogPositon.p_chat_view, vwb.m200311Y("guide_type", "tag"));
        C4749o.m34344r3(messagesAct, user, C4749o.m34345s3(C4749o.f20068T, user.f56011id, false, "chat_tag"));
    }

    /* JADX INFO: renamed from: A */
    public void m49483A(User user) {
        xdl0.m208344M(this.f32117t, !TextUtils.isEmpty(this.f32119v.getText()));
        xdl0.m208344M(this.f32120w, false);
    }

    /* JADX INFO: renamed from: B */
    public void m49484B(String str) {
        VText vText = this.f32109l;
        if (TextUtils.isEmpty(str)) {
            str = "已注销";
        }
        vText.setText(str);
    }

    /* JADX INFO: renamed from: f */
    public final void m49485f(View view) {
        qly.m175526a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final String m49486g(User user) {
        if (!user.unilateralBlock() && (user.isHideActiveFromSVip() || CoreModule.f17545c.f19561E0.m203801x3(user))) {
            return user.isHideActiveFromSVip() ? mqi0.m155934I(CoreModule.m29935P().m94658i().mo158323W(user), true) : "";
        }
        if (user.location.isHideUpdateTime() || user.unilateralBlock()) {
            return "";
        }
        return CoreModule.m29935P().m94658i().mo158244I1(user) ? mqi0.m155934I(System.currentTimeMillis(), true) : mqi0.m155935J(user.location.updatedTime, true);
    }

    /* JADX INFO: renamed from: h */
    public final CharSequence m49487h(String str, String str2) {
        if (TextUtils.isEmpty(str2)) {
            return str;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        int iIndexOf = str.toLowerCase().indexOf(str2.toLowerCase());
        if (iIndexOf != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(getContext().getResources().getColor(a1c0.f67161o)), iIndexOf, str2.length() + iIndexOf, 33);
        }
        return spannableStringBuilder;
    }

    /* JADX INFO: renamed from: i */
    public void m49488i() {
        if (NullChecker.m81303a(this.f32101d)) {
            xdl0.m208344M(this.f32101d, false);
        }
    }

    /* JADX INFO: renamed from: j */
    public void m49489j(Act act) {
        this.f32109l.setTextColor(ura.m195053e().m195057d().mo33699I4() ? getResources().getColor(a1c0.f67153g) : act.getAppTheme().mo103046f());
        this.f32119v.setTextColor(ura.m195053e().m195057d().mo33699I4() ? getResources().getColor(a1c0.f67155i) : Color.parseColor("#99212121"));
        this.f32109l.setTextSize(2, 16.0f);
        this.f32109l.getPaint().setFakeBoldText(true);
    }

    /* JADX INFO: renamed from: k */
    public void m49490k(final User user, iny inyVar) {
        this.f32100c.m79694E0(false, OMSDialogPositon.p_chat_view);
        final fcz<? extends DbObject, ?> fczVarMo48974l = inyVar.m156455e0().mo48974l();
        this.f32098a.setOnClickListener(new View.OnClickListener() { // from class: l.ply
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f150181a.m49497r(user, fczVarMo48974l, view);
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
    public void m49491l(final MessagesAct messagesAct, iny inyVar, knb0<User, Boolean, j760<Integer, Boolean>, Conversation> knb0Var) {
        String str;
        MessageActionBarLeftLayout messageActionBarLeftLayout;
        MessagesAct messagesAct2;
        iny inyVar2;
        if (messagesAct.isTaskRoot()) {
            messagesAct.setTaskDescription(new ActivityManager.TaskDescription(knb0Var.f123873a.name, (Bitmap) null, messagesAct.getResources().getColor(a1c0.f67139U)));
        }
        this.f32100c.setPadding(0, 0, 0, 0);
        this.f32100c.setBackgroundResource(0);
        final User user = knb0Var.f123873a;
        StringBuilder sb = new StringBuilder();
        String strM49486g = m49486g(user);
        if (!TextUtils.isEmpty(strM49486g)) {
            sb.append(strM49486g);
        }
        if (!user.unilateralBlock() && messagesAct.f31640f.mo120802l7() && !user.isHideLocationFromSVip()) {
            String strM49965L = MessageUserHeaderLayout.m49965L(user);
            if (TextUtils.isEmpty(sb)) {
                sb.append(strM49965L);
            } else {
                sb.append(" · ");
                sb.append(strM49965L);
            }
        }
        this.f32119v.setText(sb);
        boolean z = !TextUtils.isEmpty(sb);
        m49484B(user.name);
        String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(user.f56011id);
        if (!TextUtils.isEmpty(strM169561y7)) {
            m49484B(strM169561y7);
        } else if (TextUtils.isEmpty(strM169561y7) && CoreModule.m29935P().m94658i().mo33304De()) {
            if (!NullChecker.m81303a(user) || user.inactivated) {
                m49484B("已注销");
            } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                m49484B("昵称已重置");
            }
        }
        xdl0.m208344M(this.f32113p, false);
        if (CoreModule.m29935P().m94656g().mo35056e() && NullChecker.m81303a(user) && !user.isHideIconFromSVipWithMe() && user.isSupremePartner()) {
            xdl0.m208344M(this.f32113p, true);
            this.f32113p.m79166n0();
        } else if (CoreModule.m29935P().m94656g().mo35048b8() && NullChecker.m81303a(user) && !user.isHideIconFromSVipWithMe() && user.isPlatinum()) {
            xdl0.m208344M(this.f32113p, true);
            this.f32113p.m79165m0();
        } else if (CoreModule.m29935P().m94658i().mo158201A1() && NullChecker.m81303a(user) && C4749o.m34343n3(user) && !jjb0.m141784b()) {
            String str2 = user.settings.getUserCharacter().classification;
            this.f32116s.setText(str2);
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
            this.f32116s.setBackground(odm.m163687a(Color.parseColor(str), t100.f167256e));
            zvf0.m220368A("e_character_guide", OMSDialogPositon.p_chat_view, vwb.m200311Y("guide_type", "tag"));
            xdl0.m208345M0(this.f32115r, true);
            xdl0.m208329E0(this.f32115r, new View.OnClickListener() { // from class: l.oly
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    MessageActionBarLeftLayout.m49478a(messagesAct, user, view);
                }
            });
        }
        String string = this.f32119v.getText().toString();
        if (TextUtils.isEmpty(string)) {
            string = "";
        }
        String str3 = string;
        xdl0.m208344M(this.f32118u, false);
        xdl0.m208360X(this.f32117t, 0);
        if (ura.m195053e().m195057d().mo33773W8() && NullChecker.m81303a(knb0Var.f123876d) && NullChecker.m81303a(knb0Var.f123876d.additional) && NullChecker.m81303a(knb0Var.f123876d.additional.chatMM)) {
            Conversation conversation = knb0Var.f123876d;
            if (conversation.additional.chatMM.sparkSwitch && conversation.doubleDefault()) {
                Conversation conversation2 = knb0Var.f123876d;
                if (conversation2.additional.chatMM.level <= 0 || conversation2.additional.chatMM.mmCnt < 3) {
                    messageActionBarLeftLayout = this;
                    messagesAct2 = messagesAct;
                    inyVar2 = inyVar;
                    if (!CoreModule.m29935P().m94651a().mo33526jj()) {
                        if (!CoreModule.m29935P().m94656g().mo35085xn()) {
                            if (!CoreModule.f17557o.m195057d().mo33700I5()) {
                                if (!CoreModule.m29935P().m94658i().mo158450u()) {
                                    if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                        messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                                    }
                                } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                    messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                                }
                            } else if (!CoreModule.m29935P().m94658i().mo158450u()) {
                                if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                    messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                                }
                            } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                            }
                        } else if (!CoreModule.f17557o.m195057d().mo33700I5()) {
                            if (!CoreModule.m29935P().m94658i().mo158450u()) {
                                if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                    messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                                }
                            } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                            }
                        } else if (!CoreModule.m29935P().m94658i().mo158450u()) {
                            if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                            }
                        } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                            messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                        }
                    } else if (!CoreModule.m29935P().m94656g().mo35085xn()) {
                        if (!CoreModule.f17557o.m195057d().mo33700I5()) {
                            if (!CoreModule.m29935P().m94658i().mo158450u()) {
                                if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                    messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                                }
                            } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                            }
                        } else if (!CoreModule.m29935P().m94658i().mo158450u()) {
                            if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                            }
                        } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                            messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                        }
                    } else if (!CoreModule.f17557o.m195057d().mo33700I5()) {
                        if (!CoreModule.m29935P().m94658i().mo158450u()) {
                            if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                            }
                        } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                            messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                        }
                    } else if (!CoreModule.m29935P().m94658i().mo158450u()) {
                        if (CoreModule.m29935P().m94654e().mo34990wq()) {
                            messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                        }
                    } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                        messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                    }
                } else {
                    xdl0.m208344M(this.f32118u, true);
                    Conversation conversation3 = knb0Var.f123876d;
                    int i = conversation3.additional.chatMM.level;
                    int i2 = conversation3.additional.chatMM.mmCnt;
                    xdl0.m208344M(this.f32118u, true);
                    HashMap map = new HashMap();
                    if (i == 1) {
                        this.f32118u.setBackgroundResource(c3c0.f78584N);
                    } else {
                        VImage vImage = this.f32118u;
                        if (i == 2) {
                            vImage.setBackgroundResource(c3c0.f78593O);
                        } else {
                            vImage.setBackgroundResource(c3c0.f78602P);
                        }
                    }
                    xdl0.m208360X(this.f32117t, -t100.f167254c);
                    map.put("spark_level", Integer.valueOf(i));
                    map.put("message_pairs", Integer.valueOf(i2));
                    zvf0.m220403y("e_spark", OMSDialogPositon.p_chat_view, map);
                    boolean zIsEmpty = TextUtils.isEmpty(str3);
                    VText vText = this.f32119v;
                    if (zIsEmpty) {
                        vText.setText(String.valueOf(i2));
                    } else {
                        vText.setText(zz6.m220999p0(String.valueOf(i2), str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                    }
                    messageActionBarLeftLayout = this;
                    messagesAct2 = messagesAct;
                    inyVar2 = inyVar;
                    xdl0.m208329E0(this.f32117t, messageActionBarLeftLayout.new ViewOnClickListenerC8572a(user, map, messagesAct2, inyVar2));
                }
                z = true;
            } else {
                messageActionBarLeftLayout = this;
                messagesAct2 = messagesAct;
                inyVar2 = inyVar;
                if (!CoreModule.m29935P().m94651a().mo33526jj()) {
                    if (!CoreModule.m29935P().m94656g().mo35085xn()) {
                        if (!CoreModule.f17557o.m195057d().mo33700I5()) {
                            if (!CoreModule.m29935P().m94658i().mo158450u()) {
                                if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                    messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                                    z = true;
                                }
                            } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                                z = true;
                            }
                        } else if (!CoreModule.m29935P().m94658i().mo158450u()) {
                            if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                                z = true;
                            }
                        } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                            messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                            z = true;
                        }
                    } else if (!CoreModule.f17557o.m195057d().mo33700I5()) {
                        if (!CoreModule.m29935P().m94658i().mo158450u()) {
                            if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                                z = true;
                            }
                        } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                            messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                            z = true;
                        }
                    } else if (!CoreModule.m29935P().m94658i().mo158450u()) {
                        if (CoreModule.m29935P().m94654e().mo34990wq()) {
                            messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                            z = true;
                        }
                    } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                        messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                        z = true;
                    }
                } else if (!CoreModule.m29935P().m94656g().mo35085xn()) {
                    if (!CoreModule.f17557o.m195057d().mo33700I5()) {
                        if (!CoreModule.m29935P().m94658i().mo158450u()) {
                            if (CoreModule.m29935P().m94654e().mo34990wq()) {
                                messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                                z = true;
                            }
                        } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                            messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                            z = true;
                        }
                    } else if (!CoreModule.m29935P().m94658i().mo158450u()) {
                        if (CoreModule.m29935P().m94654e().mo34990wq()) {
                            messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                            z = true;
                        }
                    } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                        messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                        z = true;
                    }
                } else if (!CoreModule.f17557o.m195057d().mo33700I5()) {
                    if (!CoreModule.m29935P().m94658i().mo158450u()) {
                        if (CoreModule.m29935P().m94654e().mo34990wq()) {
                            messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                            z = true;
                        }
                    } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                        messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                        z = true;
                    }
                } else if (!CoreModule.m29935P().m94658i().mo158450u()) {
                    if (CoreModule.m29935P().m94654e().mo34990wq()) {
                        messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                        z = true;
                    }
                } else if (CoreModule.m29935P().m94654e().mo34990wq()) {
                    messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
                    z = true;
                }
            }
        } else {
            messageActionBarLeftLayout = this;
            messagesAct2 = messagesAct;
            inyVar2 = inyVar;
            if (!CoreModule.m29935P().m94651a().mo33526jj() && NullChecker.m81303a(knb0Var.f123876d) && knb0Var.f123876d.isConfessionFirstConv()) {
                messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自抢先告白", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
            } else if (!CoreModule.m29935P().m94656g().mo35085xn() && NullChecker.m81303a(knb0Var.f123876d) && knb0Var.f123876d.isConfessionFirstConv()) {
                messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自抢先告白", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
            } else if (!CoreModule.f17557o.m195057d().mo33700I5() && NullChecker.m81303a(knb0Var.f123876d) && NullChecker.m81303a(knb0Var.f123876d.additional) && NullChecker.m81303a(knb0Var.f123876d.additional.greetingInfo) && knb0Var.f123876d.additional.greetingInfo.fromGreeting) {
                messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自抢先告白", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
            } else if (!CoreModule.m29935P().m94658i().mo158450u() && NullChecker.m81303a(knb0Var.f123876d) && knb0Var.f123876d.isHeartbeatConv()) {
                if (CoreModule.m29935P().m94658i().mo33602uh() && !knb0Var.f123876d.isLimitMatch()) {
                    messageActionBarLeftLayout.f32119v.setText(zz6.m220998o0(CoreModule.f17544b.getString(R$string.f20920a3), str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k)));
                }
            } else if (CoreModule.m29935P().m94654e().mo34990wq() && NullChecker.m81303a(knb0Var.f123873a) && NullChecker.m81303a(knb0Var.f123873a.localRelationship) && NullChecker.m81303a(knb0Var.f123873a.localRelationship.status) && knb0Var.f123873a.localRelationship.status.contains(MatchFrom.get("boosted"))) {
                messageActionBarLeftLayout.f32119v.setText(zz6.m220999p0("来自加速配对", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k), false));
            }
            z = true;
        }
        if (CoreModule.m29935P().m94658i().mo33602uh() && CoreModule.m29935P().m94658i().mo158354c() && NullChecker.m81303a(knb0Var.f123876d) && TextUtils.equals(knb0Var.f123876d.convType, "quickchat")) {
            messageActionBarLeftLayout.f32119v.setText(zz6.m220998o0(CoreModule.m29935P().m94658i().mo158398j5(knb0Var.f123876d) ? "来自语音闪聊" : "来自闪聊匹配", str3, CoreModule.f17544b.getResources().getColor(a1c0.f67157k), CoreModule.f17544b.getResources().getColor(a1c0.f67157k)));
            z = true;
        }
        if (messagesAct2.m48958D2()) {
            z = false;
        }
        messageActionBarLeftLayout.f32109l.requestLayout();
        if (xdl0.m208349O0(messageActionBarLeftLayout.f32117t)) {
            inyVar2.m137225Q1();
            xdl0.m208344M(messageActionBarLeftLayout.f32120w, false);
        }
        xdl0.m208344M(messagesAct2.mo48974l().m120842t7().m190316m0().getRightIconContainer(), true);
        xdl0.m208344M(messageActionBarLeftLayout.f32117t, z);
        messageActionBarLeftLayout.f32109l.requestLayout();
    }

    /* JADX INFO: renamed from: m */
    public void m49492m(j760<User, j760<Integer, Boolean>> j760Var, int i) {
        User user = j760Var.f116564a;
        if (CoreModule.m29935P().m94658i().mo33304De() && (!NullChecker.m81303a(user) || user.inactivated || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN)))) {
            this.f32100c.m79713z0(c3c0.f78784k1);
            xdl0.m208344M(this.f32104g, false);
            xdl0.m208344M(this.f32099b, true);
            xdl0.m208344M(this.f32117t, false);
            return;
        }
        if (NullChecker.m81303a(user)) {
            CoreModule.m29935P().m94652b().mo35132xp(this.f32100c.get_pic(), rw6.m181385a(user).profileSmall(), i);
            this.f32100c.m79695G0(false);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m49493n(Act act, User user) {
        if (jjb0.m141784b()) {
            if (this.f32112o.getChildCount() > 0) {
                return;
            }
            xdl0.m208344M(this.f32111n, false);
            View viewM58147f = CertificationUtil.m58147f(act, user, CertificationUtil.CertificationIconStyle.IM);
            xdl0.m208344M(this.f32112o, NullChecker.m81303a(viewM58147f));
            if (viewM58147f == null) {
                return;
            }
            this.f32112o.addView(viewM58147f);
            return;
        }
        if (!ura.m195053e().m195057d().mo33699I4()) {
            qib0.f154713b0.f139231b.showUserVerificationLogo(act, user, this.f32111n);
            return;
        }
        if (this.f32112o.getChildCount() > 0) {
            return;
        }
        xdl0.m208344M(this.f32111n, false);
        View viewM58147f2 = CertificationUtil.m58147f(act, user, CertificationUtil.CertificationIconStyle.IM_EXP);
        if (viewM58147f2 == null) {
            return;
        }
        this.f32112o.addView(viewM58147f2);
        xdl0.m208344M(this.f32112o, true);
    }

    /* JADX INFO: renamed from: o */
    public void m49494o(Act act, User user) {
        if (CoreModule.m29935P().m94658i().mo158233G1()) {
            if (!jjb0.m141784b()) {
                if (!ura.m195053e().m195057d().mo33699I4()) {
                    qib0.f154713b0.f139231b.showUserVerificationLogo(act, user, this.f32111n);
                    return;
                }
                if (this.f32112o.getChildCount() > 0) {
                    return;
                }
                xdl0.m208344M(this.f32111n, false);
                View viewM58147f = CertificationUtil.m58147f(act, user, CertificationUtil.CertificationIconStyle.IM_EXP);
                if (viewM58147f == null) {
                    return;
                }
                this.f32112o.addView(viewM58147f);
                xdl0.m208344M(this.f32112o, true);
                return;
            }
            if (this.f32112o.getChildCount() > 0) {
                return;
            }
            xdl0.m208344M(this.f32111n, false);
            if (!ura.m195053e().m195057d().mo33924t9() || ikf0.m136795i(xdl0.m208412y0()) >= 400.0f) {
                View viewM58147f2 = CertificationUtil.m58147f(act, user, CertificationUtil.CertificationIconStyle.IM);
                if (viewM58147f2 == null) {
                    return;
                }
                this.f32112o.addView(viewM58147f2);
                xdl0.m208344M(this.f32112o, true);
                return;
            }
            int iM58150i = CertificationUtil.m58150i(user, false);
            if (iM58150i == -1) {
                return;
            }
            ImageView imageView = new ImageView(act);
            imageView.setImageResource(iM58150i);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(t100.m186890d(16.0f), t100.m186890d(16.0f)));
            this.f32112o.addView(imageView);
            xdl0.m208344M(this.f32112o, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49485f(this);
        this.f32121x.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78706b4 : c3c0.f78697a4);
    }

    /* JADX INFO: renamed from: p */
    public void m49495p(MessagesAct messagesAct, xaj0<User, j760<Integer, Boolean>, Conversation> xaj0Var, iny inyVar) {
        tqz tqzVarM120842t7 = inyVar.m156455e0().mo48974l().m120842t7();
        if (tqzVarM120842t7 instanceof bpz) {
            bpz bpzVar = (bpz) tqzVarM120842t7;
            User user = xaj0Var.f191751a;
            if (CoreModule.m29935P().m94658i().mo33304De() && (!NullChecker.m81303a(user) || user.inactivated || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN)))) {
                this.f32100c.m79713z0(c3c0.f78784k1);
                xdl0.m208344M(this.f32104g, false);
                xdl0.m208344M(this.f32099b, true);
                xdl0.m208344M(this.f32117t, false);
                return;
            }
            int iMo137235l0 = inyVar.mo137235l0();
            if (iMo137235l0 != 100) {
                if (NullChecker.m81303a(bpzVar.f171758t1.mo191240c())) {
                    bpzVar.f171758t1.mo191240c().m49999F0(user, iMo137235l0);
                }
                CoreModule.m29935P().m94658i().mo158474y2(this.f32100c.get_pic(), rw6.m181385a(user).profileSmall(), iMo137235l0);
                CoreModule.m29935P().m94658i().mo158474y2(this.f32106i, rw6.m181385a(user).profileSmall(), iMo137235l0);
                xdl0.m208344M(this.f32104g, true);
                xdl0.m208344M(this.f32099b, false);
                if (CoreModule.m29935P().m94658i().mo33602uh()) {
                    this.f32105h.setBitmapRes(c3c0.f78682Y5);
                }
                this.f32105h.setThreeDp(t100.m186890d(2.5f));
                this.f32105h.setProgress(iMo137235l0);
                this.f32100c.m79695G0(false);
            } else {
                boolean zM137227e1 = inyVar.m137227e1();
                u4z u4zVar = bpzVar.f171758t1;
                if (zM137227e1) {
                    if (NullChecker.m81303a(u4zVar.mo191240c())) {
                        bpzVar.f171758t1.mo191240c().m50001G0(user, 0);
                    }
                } else if (NullChecker.m81303a(u4zVar.mo191240c())) {
                    bpzVar.f171758t1.mo191240c().setOtherSmallImage(user);
                }
                if (inyVar.m137227e1()) {
                    CoreModule.m29935P().m94658i().mo158474y2(this.f32100c.get_pic(), rw6.m181385a(user).profileSmall(), 0);
                    this.f32100c.m79695G0(false);
                } else {
                    this.f32100c.m79710v0(user, rw6.m181385a(user).profileSmall());
                    if (messagesAct.m48958D2()) {
                        this.f32100c.m79695G0(false);
                    }
                }
                xdl0.m208344M(this.f32104g, false);
                xdl0.m208344M(this.f32099b, true);
            }
            if (xaj0Var.f191753c.isQuickChatClearAvatar(CoreModule.f17545c.f19639e0.m169520na()) && NullChecker.m81303a(bpzVar.f171758t1.mo191240c())) {
                bpzVar.f171758t1.mo191240c().setOtherSmallImage(user);
                qib0.f154691G.m102331L0(this.f32106i, rw6.m181385a(user).profileSmall().formatted());
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m49496q(iny inyVar) {
        final fcz<? extends DbObject, ?> fczVarMo48974l = inyVar.m156455e0().mo48974l();
        final View view = (View) this.f32121x.getParent();
        view.post(new Runnable() { // from class: l.mly
            @Override // java.lang.Runnable
            public final void run() {
                this.f134539a.m49498s(view);
            }
        });
        xdl0.m208359W(this.f32107j, t100.m186890d(32.0f));
        xdl0.m208372e0(this.f32108k, t100.m186890d(6.0f));
        hmb.m131701M(this.f32121x, true);
        xdl0.m208329E0(this.f32121x, new View.OnClickListener() { // from class: l.nly
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f139602a.m49499t(fczVarMo48974l, view2);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m49497r(User user, fcz fczVar, View view) {
        m49500u(user, fczVar);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m49498s(View view) {
        Rect rect = new Rect();
        this.f32121x.getHitRect(rect);
        rect.top -= 10;
        rect.bottom += 10;
        rect.left -= 10;
        rect.right += 10;
        TouchDelegate touchDelegate = new TouchDelegate(rect, this.f32121x);
        if (View.class.isInstance(this.f32121x.getParent())) {
            view.setTouchDelegate(touchDelegate);
        }
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ void m49499t(fcz fczVar, View view) {
        if (fczVar.m120842t7().m190318n0()) {
            fczVar.m120842t7().m190297e0();
            this.f32121x.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78688Z3 : c3c0.f78680Y3);
        } else {
            fczVar.m120842t7().m190305h0();
            this.f32121x.setImageResource(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78706b4 : c3c0.f78697a4);
        }
    }

    /* JADX INFO: renamed from: u */
    public final void m49500u(User user, fcz fczVar) {
        if (CoreModule.m29935P().m94658i().mo33304De()) {
            if (!NullChecker.m81303a(user) || user.inactivated) {
                lsi0.m151580j("对方已注销");
                return;
            } else if (user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN))) {
                lsi0.m151580j("对方账号异常");
                return;
            }
        }
        o6j0.m162859c("e_chat_avatar", fczVar.pageId(), o6j0.C18854a.m162878h("is_self_avatar", String.valueOf(TextUtils.equals(CoreModule.m29931H().userId(), fczVar.mo120828r3()))));
        fczVar.m120850v6("messages_title");
    }

    /* JADX INFO: renamed from: v */
    public void m49501v(String str) {
        xdl0.m208344M(this.f32101d, true);
        qib0.f154691G.m102331L0(this.f32102e, str);
    }

    /* JADX INFO: renamed from: w */
    public void m49502w(BubbleInfo bubbleInfo) {
        xdl0.m208344M(this.f32101d, true);
        bkb0 bkb0Var = qib0.f154691G;
        VDraweeView vDraweeView = this.f32102e;
        String str = bubbleInfo.emotion.emojiUrl;
        int i = t100.f167267p;
        bkb0Var.m102325I0(vDraweeView, str, i, i);
    }

    /* JADX INFO: renamed from: x */
    public void m49503x(ChatGroup chatGroup, boolean z) {
        if (vwb.m200296J(chatGroup.avatars)) {
            qib0.f154691G.m102354Y0(this.f32100c.get_pic(), c3c0.f78540I0);
        } else {
            qib0.f154691G.m102356Z0(this.f32100c.get_pic(), chatGroup.avatars.get(0).cover().profileSmall().formatted());
        }
        if (chatGroup.onlineCount <= 1 || !z) {
            xdl0.m208344M(this.f32122y, true);
            xdl0.m208344M(this.f32103f, false);
            this.f32122y.setText(chatGroup.name);
            return;
        }
        xdl0.m208344M(this.f32122y, false);
        xdl0.m208344M(this.f32103f, true);
        String str = chatGroup.onlineCount + getContext().getResources().getString(R$string.f21064q3);
        this.f32119v.setText(m49487h(str + getContext().getResources().getString(R$string.f21075r6), str));
        this.f32109l.setText(chatGroup.name);
    }

    /* JADX INFO: renamed from: y */
    public void m49504y(MessagesAct messagesAct, iny inyVar, User user) {
        Conversation conversation = inyVar.m156455e0().mo48974l().f96919k;
        if (CoreModule.m29935P().m94658i().mo33304De() && (!NullChecker.m81303a(user) || user.inactivated || user.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN)))) {
            this.f32100c.m79713z0(c3c0.f78784k1);
            xdl0.m208344M(this.f32104g, false);
            xdl0.m208344M(this.f32099b, true);
            xdl0.m208344M(this.f32117t, false);
        } else if ((CoreModule.m29935P().m94658i().mo158354c() && user.onlineMatchLocked()) || inyVar.m137227e1()) {
            CoreModule.m29935P().m94658i().mo158474y2(this.f32100c.get_pic(), rw6.m181385a(user).profileSmall(), inyVar.mo137235l0());
        } else if (CoreModule.m29935P().m94652b().mo35107Yg() && NullChecker.m81303a(user) && user.isLoveBuzz()) {
            CoreModule.m29935P().m94652b().mo35132xp(this.f32100c.get_pic(), rw6.m181385a(user).profileSmall(), inyVar.mo137233k0());
        } else {
            if ((NullChecker.m81303a(conversation) && conversation.isAnonymous()) || inyVar.m156455e0().mo48974l().m120734Y3()) {
                qib0.f154691G.m102331L0(this.f32100c.get_pic(), user.getAnonymousUrl());
            } else {
                this.f32100c.m79710v0(user, rw6.m181385a(user).profileSmall());
                if (messagesAct.m48958D2()) {
                }
            }
            this.f32100c.m79695G0(false);
        }
        if (NullChecker.m81303a(conversation) && conversation.isQuickChatClearAvatar(CoreModule.f17545c.f19639e0.m169520na())) {
            qib0.f154691G.m102331L0(this.f32100c.get_pic(), user.m60124fp().profileSmall().formatted());
            qib0.f154691G.m102331L0(this.f32106i, rw6.m181385a(user).profileSmall().formatted());
        }
    }

    /* JADX INFO: renamed from: z */
    public void m49505z(User user) {
        boolean z = false;
        xdl0.m208344M(this.f32117t, false);
        VText vText = this.f32120w;
        if (NullChecker.m81303a(user) && !user.unilateralBlock()) {
            z = true;
        }
        xdl0.m208344M(vText, z);
    }

    public MessageActionBarLeftLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MessageActionBarLeftLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
