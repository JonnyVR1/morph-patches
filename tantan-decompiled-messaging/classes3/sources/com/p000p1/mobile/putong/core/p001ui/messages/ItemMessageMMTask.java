package com.p000p1.mobile.putong.core.p001ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MsgDataMMTask;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.breaking.SwapAnswerBottomSheetAct;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import l.e8q;
import l.lsi0;
import l.mqm0;
import l.tqm0;
import l.ura;
import l.vwb;
import l.xdl0;
import l.y19;
import l.zvf0;
import p003l.dqy;
import p003l.j000;
import p003l.qsz;
import p003l.tmf0;
import p003l.uxz;
import p003l.xoy;
import p028v.VLinear;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ItemMessageMMTask extends VLinear {

    /* JADX INFO: renamed from: c */
    public ItemMessageMMTask f1083c;

    /* JADX INFO: renamed from: d */
    public VLinear f1084d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f1085e;

    /* JADX INFO: renamed from: f */
    public VText f1086f;

    /* JADX INFO: renamed from: g */
    public VText f1087g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f1088h;

    /* JADX INFO: renamed from: i */
    public VText f1089i;

    /* JADX INFO: renamed from: j */
    public boolean f1090j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask$a */
    public class ViewOnClickListenerC0084a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f1091a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f1092b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f1093c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f1094d;

        public ViewOnClickListenerC0084a(MessagesAct messagesAct, User user, Map map, String str) {
            this.f1091a = messagesAct;
            this.f1092b = user;
            this.f1093c = map;
            this.f1094d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ItemMessageMMTask.m1510R(this.f1091a, this.f1092b)) {
                return;
            }
            zvf0.s("e_spark_level_up", "p_chat_view", this.f1093c);
            Conversation conversationZp = CoreModule.c.f0.zp(this.f1094d);
            if (!NullChecker.a(conversationZp) || conversationZp.doubleDefault()) {
                PutongAct putongAct = this.f1091a;
                putongAct.startActivity(MessageChatFireSettingAct.m1927Z1(putongAct, this.f1094d));
            } else {
                boolean zM4261k4 = this.f1091a.f1531f.m6497e0().mo2066l().m4261k4(this.f1091a.f1531f.m6497e0().mo2066l().m4295r3());
                PutongAct putongAct2 = this.f1091a;
                putongAct2.startActivity(MessageProfileSettingAct.m2006Y1(putongAct2, zM4261k4, this.f1094d));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask$b */
    public class ViewOnClickListenerC0085b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f1096a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f1097b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f1098c;

        public ViewOnClickListenerC0085b(MessagesAct messagesAct, User user, Map map) {
            this.f1096a = messagesAct;
            this.f1097b = user;
            this.f1098c = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ItemMessageMMTask.m1510R(this.f1096a, this.f1097b)) {
                return;
            }
            zvf0.s("e_spark_level_up", "p_chat_view", this.f1098c);
            MessagesAct messagesAct = this.f1096a;
            uxz.m8260t(messagesAct, messagesAct.f1531f.m4295r3(), "", "from_entrance_type");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask$c */
    public class ViewOnClickListenerC0086c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f1100a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f1101b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f1102c;

        public ViewOnClickListenerC0086c(MessagesAct messagesAct, User user, Map map) {
            this.f1100a = messagesAct;
            this.f1101b = user;
            this.f1102c = map;
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [android.content.Context, com.p1.mobile.putong.core.ui.messages.MessagesAct] */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ItemMessageMMTask.m1510R(this.f1100a, this.f1101b)) {
                return;
            }
            zvf0.s("e_spark_level_up", "p_chat_view", this.f1102c);
            mqm0.h().o("voice_mm_task_item");
            dqy dqyVarM4846u0 = this.f1100a.mo2046A0().m6499g0().m4846u0();
            if (NullChecker.a(dqyVarM4846u0) && dqyVarM4846u0.m3703d0()) {
                lsi0.w(R.string.C5);
                return;
            }
            mqm0.h().o("voice_mm_task_item");
            tqm0 tqm0VarP = tqm0.p();
            ?? r2 = this.f1100a;
            tqm0VarP.h((Context) r2, r2.f1531f.m4295r3(), "");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask$d */
    public class ViewOnClickListenerC0087d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f1104a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f1105b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f1106c;

        public ViewOnClickListenerC0087d(MessagesAct messagesAct, User user, Map map) {
            this.f1104a = messagesAct;
            this.f1105b = user;
            this.f1106c = map;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0034  */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            if (ItemMessageMMTask.m1510R(this.f1104a, this.f1105b)) {
                return;
            }
            zvf0.s("e_spark_level_up", "p_chat_view", this.f1106c);
            User userM4325x6 = this.f1104a.f1531f.m4325x6();
            if (NullChecker.a(userM4325x6)) {
                List listD = y19.D();
                if (!vwb.J(listD)) {
                    str = listD.contains("聊聊你的感情经历") ? "聊聊你的感情经历" : null;
                }
                SwapAnswerBottomSheetAct.D2(this.f1104a, ((DbObject) userM4325x6).id, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask$e */
    public class ViewOnClickListenerC0088e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f1108a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f1109b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f1110c;

        public ViewOnClickListenerC0088e(MessagesAct messagesAct, User user, Map map) {
            this.f1108a = messagesAct;
            this.f1109b = user;
            this.f1110c = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ItemMessageMMTask.m1510R(this.f1108a, this.f1109b)) {
                return;
            }
            zvf0.s("e_spark_level_up", "p_chat_view", this.f1110c);
            MessagesAct messagesAct = this.f1108a;
            tmf0.m7819a(messagesAct, messagesAct.f1531f.f3543c);
        }
    }

    public ItemMessageMMTask(Context context) {
        super(context);
        this.f1090j = false;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m1510R(MessagesAct messagesAct, User user) {
        if (messagesAct.m2050D2()) {
            return true;
        }
        if (NullChecker.a(user) && user.isAccountCancellation()) {
            lsi0.y("对方已注销");
            return true;
        }
        if (ura.e().d().W8()) {
            return false;
        }
        lsi0.y("功能已下线");
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final void m1511Q(View view) {
        e8q.a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public void m1512S(MessagesAct messagesAct, j000 j000Var, Message message) {
        MsgDataMMTask msgDataMMTask;
        ItemMessageMMTask itemMessageMMTask;
        String str;
        if (!NullChecker.a(message) || messagesAct == null || messagesAct.isFinishing()) {
            return;
        }
        String str2 = messagesAct.f1531f.f3543c;
        User userOa = CoreModule.c.e0.oa(str2);
        try {
            msgDataMMTask = (MsgDataMMTask) MsgDataMMTask.JSON_ADAPTER.parse(message.msgData);
        } catch (IOException e) {
            CrashHelper.c(e);
            msgDataMMTask = null;
        }
        MsgDataMMTask msgDataMMTask2 = msgDataMMTask;
        if (NullChecker.a(msgDataMMTask2)) {
            HashMap map = new HashMap();
            int i = msgDataMMTask2.level;
            map.put("spark_level", String.valueOf(i));
            if (i == 1) {
                m1513T(messagesAct, userOa, msgDataMMTask2, map);
                str = "https://fe-static.tancdn.com/v1/raw/753e736a-14c5-4112-880a-34506bf8892614.svga";
                itemMessageMMTask = this;
            } else if (i == 2) {
                itemMessageMMTask = this;
                itemMessageMMTask.m1514V(messagesAct, str2, userOa, msgDataMMTask2, map);
                str = "https://fe-static.tancdn.com/v1/raw/c192eff9-8ece-4fe3-8fbd-d3aaa5e275af14.svga";
            } else {
                itemMessageMMTask = this;
                if (i >= 3) {
                    itemMessageMMTask.m1515W(messagesAct, str2, userOa, msgDataMMTask2, map);
                    str = "https://fe-static.tancdn.com/v1/raw/8be24bd9-1be1-470d-a176-a75236f70aa914.svga";
                } else {
                    str = "";
                }
            }
            if (!itemMessageMMTask.m1517Y(j000Var.f4538r, message, map) || TextUtils.isEmpty(str)) {
                return;
            }
            SVGALoader.with(itemMessageMMTask.getContext()).from(str).autoPlay(true).repeatCount(1).into(itemMessageMMTask.f1085e);
            itemMessageMMTask.m1516X();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m1513T(MessagesAct messagesAct, User user, MsgDataMMTask msgDataMMTask, Map<String, Object> map) {
        this.f1086f.setText(String.format("已互发%s条消息，成功点亮火花", Integer.valueOf(msgDataMMTask.mmCnt)));
        this.f1087g.setText("聊得越多火花越旺盛，关系更密切");
        this.f1089i.setText("去看看");
        xdl0.E0(this.f1089i, new ViewOnClickListenerC0088e(messagesAct, user, map));
    }

    /* JADX INFO: renamed from: V */
    public final void m1514V(MessagesAct messagesAct, String str, User user, MsgDataMMTask msgDataMMTask, Map<String, Object> map) {
        CharSequence charSequence;
        CharSequence charSequence2;
        View.OnClickListener viewOnClickListenerC0087d;
        CharSequence charSequence3;
        this.f1086f.setText(String.format("你们已互发%s条消息", Integer.valueOf(msgDataMMTask.mmCnt)));
        List list = msgDataMMTask.taskNames;
        if (!vwb.J(list)) {
            int i = 0;
            while (true) {
                if (i < list.size()) {
                    String str2 = (String) list.get(i);
                    if (!TextUtils.equals(str2, "change_pic")) {
                        if (!TextUtils.equals(str2, "voice")) {
                            if (TextUtils.equals(str2, "change_answer") && xoy.m8737h(str, false, user)) {
                                charSequence = "change_answer";
                                break;
                            }
                            i++;
                        }
                    } else {
                        if (xoy.m8735f(str, false)) {
                            charSequence = "change_pic";
                            break;
                        }
                        i++;
                    }
                }
                charSequence = "voice";
                break;
            }
        }
        charSequence = "voice";
        break;
        if (TextUtils.equals(charSequence, "change_pic")) {
            map.put("second_spark_task", "exchange_photo");
            viewOnClickListenerC0087d = new ViewOnClickListenerC0085b(messagesAct, user, map);
            charSequence2 = "互相交换一张全身照，了解真实的一面";
            charSequence3 = "立即交换";
        } else if (TextUtils.equals(charSequence, "voice")) {
            map.put("second_spark_task", "voice_chat");
            viewOnClickListenerC0087d = new ViewOnClickListenerC0086c(messagesAct, user, map);
            charSequence2 = "语音聊天，听听对方的声音";
            charSequence3 = "发起邀请";
        } else if (TextUtils.equals(charSequence, "change_answer")) {
            map.put("second_spark_task", "exchange_answer");
            viewOnClickListenerC0087d = new ViewOnClickListenerC0087d(messagesAct, user, map);
            charSequence2 = "聊聊你们的感情经历，加深对彼此的了解";
            charSequence3 = "交换答案";
        } else {
            charSequence2 = "";
            viewOnClickListenerC0087d = null;
            charSequence3 = "";
        }
        this.f1087g.setText(charSequence2);
        this.f1089i.setText(charSequence3);
        xdl0.E0(this.f1089i, viewOnClickListenerC0087d);
    }

    /* JADX INFO: renamed from: W */
    public final void m1515W(MessagesAct messagesAct, String str, User user, MsgDataMMTask msgDataMMTask, Map<String, Object> map) {
        this.f1086f.setText(String.format("互发%s条消息，成为密友啦", Integer.valueOf(msgDataMMTask.mmCnt)));
        this.f1087g.setText("你们的消息已自动置顶");
        this.f1089i.setText("更改设置");
        xdl0.E0(this.f1089i, new ViewOnClickListenerC0084a(messagesAct, user, map, str));
    }

    /* JADX INFO: renamed from: X */
    public final void m1516X() {
        if (this.f1090j) {
            return;
        }
        this.f1090j = true;
        this.f1085e.startAnimation();
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m1517Y(qsz qszVar, Message message, Map<String, Object> map) {
        String str = "ITEM_MESSAGE_MM_TASKe_spark_level_up" + map.toString() + ((DbObject) message).id;
        if (qszVar.m7030a(str)) {
            return false;
        }
        qszVar.m7031b(str);
        zvf0.y("e_spark_level_up", "p_chat_view", map);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f1085e.stopAnimation(false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m1511Q(this);
    }

    public ItemMessageMMTask(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1090j = false;
    }

    public ItemMessageMMTask(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1090j = false;
    }
}
