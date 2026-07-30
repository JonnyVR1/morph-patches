package com.p046p1.mobile.putong.core.p053ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MsgDataMMTask;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.breaking.SwapAnswerBottomSheetAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p147v.VLinear;
import p147v.VText;
import p149l.dqy;
import p149l.e8q;
import p149l.j000;
import p149l.lsi0;
import p149l.mqm0;
import p149l.qsz;
import p149l.tmf0;
import p149l.tqm0;
import p149l.ura;
import p149l.uxz;
import p149l.vwb;
import p149l.xdl0;
import p149l.xoy;
import p149l.y19;
import p149l.zvf0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageMMTask extends VLinear {

    /* JADX INFO: renamed from: c */
    public ItemMessageMMTask f31192c;

    /* JADX INFO: renamed from: d */
    public VLinear f31193d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f31194e;

    /* JADX INFO: renamed from: f */
    public VText f31195f;

    /* JADX INFO: renamed from: g */
    public VText f31196g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f31197h;

    /* JADX INFO: renamed from: i */
    public VText f31198i;

    /* JADX INFO: renamed from: j */
    public boolean f31199j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask$a */
    public class ViewOnClickListenerC8501a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f31200a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f31201b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f31202c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f31203d;

        public ViewOnClickListenerC8501a(MessagesAct messagesAct, User user, Map map, String str) {
            this.f31200a = messagesAct;
            this.f31201b = user;
            this.f31202c = map;
            this.f31203d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ItemMessageMMTask.m48426R(this.f31200a, this.f31201b)) {
                return;
            }
            zvf0.m220397s("e_spark_level_up", OMSDialogPositon.p_chat_view, this.f31202c);
            Conversation conversationM33216zp = CoreModule.f17545c.f19642f0.m33216zp(this.f31203d);
            if (!NullChecker.m81303a(conversationM33216zp) || conversationM33216zp.doubleDefault()) {
                MessagesAct messagesAct = this.f31200a;
                messagesAct.startActivity(MessageChatFireSettingAct.m48842Z1(messagesAct, this.f31203d));
            } else {
                boolean zM120794k4 = this.f31200a.f31640f.m156455e0().mo48974l().m120794k4(this.f31200a.f31640f.m156455e0().mo48974l().mo120828r3());
                MessagesAct messagesAct2 = this.f31200a;
                messagesAct2.startActivity(MessageProfileSettingAct.m48916Y1(messagesAct2, zM120794k4, this.f31203d));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask$b */
    public class ViewOnClickListenerC8502b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f31205a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f31206b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f31207c;

        public ViewOnClickListenerC8502b(MessagesAct messagesAct, User user, Map map) {
            this.f31205a = messagesAct;
            this.f31206b = user;
            this.f31207c = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ItemMessageMMTask.m48426R(this.f31205a, this.f31206b)) {
                return;
            }
            zvf0.m220397s("e_spark_level_up", OMSDialogPositon.p_chat_view, this.f31207c);
            MessagesAct messagesAct = this.f31205a;
            uxz.m196230t(messagesAct, messagesAct.f31640f.mo120828r3(), "", "from_entrance_type");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask$c */
    public class ViewOnClickListenerC8503c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f31209a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f31210b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f31211c;

        public ViewOnClickListenerC8503c(MessagesAct messagesAct, User user, Map map) {
            this.f31209a = messagesAct;
            this.f31210b = user;
            this.f31211c = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ItemMessageMMTask.m48426R(this.f31209a, this.f31210b)) {
                return;
            }
            zvf0.m220397s("e_spark_level_up", OMSDialogPositon.p_chat_view, this.f31211c);
            mqm0.m155965h().m155976o("voice_mm_task_item");
            dqy dqyVarM128212u0 = this.f31209a.mo48954A0().m156457g0().m128212u0();
            if (NullChecker.m81303a(dqyVarM128212u0) && dqyVarM128212u0.m113220d0()) {
                lsi0.m151593w(R$string.f20730C5);
                return;
            }
            mqm0.m155965h().m155976o("voice_mm_task_item");
            tqm0 tqm0VarM190131p = tqm0.m190131p();
            MessagesAct messagesAct = this.f31209a;
            tqm0VarM190131p.m190136h(messagesAct, messagesAct.f31640f.mo120828r3(), "");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask$d */
    public class ViewOnClickListenerC8504d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f31213a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f31214b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f31215c;

        public ViewOnClickListenerC8504d(MessagesAct messagesAct, User user, Map map) {
            this.f31213a = messagesAct;
            this.f31214b = user;
            this.f31215c = map;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0034  */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            if (ItemMessageMMTask.m48426R(this.f31213a, this.f31214b)) {
                return;
            }
            zvf0.m220397s("e_spark_level_up", OMSDialogPositon.p_chat_view, this.f31215c);
            User userMo120858x6 = this.f31213a.f31640f.mo120858x6();
            if (NullChecker.m81303a(userMo120858x6)) {
                List<String> listM212144D = y19.m212144D();
                if (!vwb.m200296J(listM212144D)) {
                    str = listM212144D.contains("聊聊你的感情经历") ? "聊聊你的感情经历" : null;
                }
                SwapAnswerBottomSheetAct.m44449D2(this.f31213a, userMo120858x6.f56011id, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask$e */
    public class ViewOnClickListenerC8505e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f31217a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f31218b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f31219c;

        public ViewOnClickListenerC8505e(MessagesAct messagesAct, User user, Map map) {
            this.f31217a = messagesAct;
            this.f31218b = user;
            this.f31219c = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ItemMessageMMTask.m48426R(this.f31217a, this.f31218b)) {
                return;
            }
            zvf0.m220397s("e_spark_level_up", OMSDialogPositon.p_chat_view, this.f31219c);
            MessagesAct messagesAct = this.f31217a;
            tmf0.m189689a(messagesAct, messagesAct.f31640f.f96911c);
        }
    }

    public ItemMessageMMTask(Context context) {
        super(context);
        this.f31199j = false;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m48426R(MessagesAct messagesAct, User user) {
        if (messagesAct.m48958D2()) {
            return true;
        }
        if (NullChecker.m81303a(user) && user.isAccountCancellation()) {
            lsi0.m151595y("对方已注销");
            return true;
        }
        if (ura.m195053e().m195057d().mo33773W8()) {
            return false;
        }
        lsi0.m151595y("功能已下线");
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final void m48427Q(View view) {
        e8q.m115277a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public void m48428S(MessagesAct messagesAct, j000 j000Var, Message message) {
        MsgDataMMTask msgDataMMTask;
        ItemMessageMMTask itemMessageMMTask;
        String str;
        if (!NullChecker.m81303a(message) || messagesAct == null || messagesAct.isFinishing()) {
            return;
        }
        String str2 = messagesAct.f31640f.f96911c;
        User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(str2);
        try {
            msgDataMMTask = MsgDataMMTask.JSON_ADAPTER.parse(message.msgData);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
            msgDataMMTask = null;
        }
        MsgDataMMTask msgDataMMTask2 = msgDataMMTask;
        if (NullChecker.m81303a(msgDataMMTask2)) {
            HashMap map = new HashMap();
            int i = msgDataMMTask2.level;
            map.put("spark_level", String.valueOf(i));
            if (i == 1) {
                m48429T(messagesAct, userM169524oa, msgDataMMTask2, map);
                str = "https://fe-static.tancdn.com/v1/raw/753e736a-14c5-4112-880a-34506bf8892614.svga";
                itemMessageMMTask = this;
            } else if (i == 2) {
                itemMessageMMTask = this;
                itemMessageMMTask.m48430V(messagesAct, str2, userM169524oa, msgDataMMTask2, map);
                str = "https://fe-static.tancdn.com/v1/raw/c192eff9-8ece-4fe3-8fbd-d3aaa5e275af14.svga";
            } else {
                itemMessageMMTask = this;
                if (i >= 3) {
                    itemMessageMMTask.m48431W(messagesAct, str2, userM169524oa, msgDataMMTask2, map);
                    str = "https://fe-static.tancdn.com/v1/raw/8be24bd9-1be1-470d-a176-a75236f70aa914.svga";
                } else {
                    str = "";
                }
            }
            if (!itemMessageMMTask.m48433Y(j000Var.f115625r, message, map) || TextUtils.isEmpty(str)) {
                return;
            }
            SVGALoader.with(itemMessageMMTask.getContext()).from(str).autoPlay(true).repeatCount(1).into(itemMessageMMTask.f31194e);
            itemMessageMMTask.m48432X();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m48429T(MessagesAct messagesAct, User user, MsgDataMMTask msgDataMMTask, Map<String, Object> map) {
        this.f31195f.setText(String.format("已互发%s条消息，成功点亮火花", Integer.valueOf(msgDataMMTask.mmCnt)));
        this.f31196g.setText("聊得越多火花越旺盛，关系更密切");
        this.f31198i.setText("去看看");
        xdl0.m208329E0(this.f31198i, new ViewOnClickListenerC8505e(messagesAct, user, map));
    }

    /* JADX INFO: renamed from: V */
    public final void m48430V(MessagesAct messagesAct, String str, User user, MsgDataMMTask msgDataMMTask, Map<String, Object> map) {
        CharSequence charSequence;
        String str2;
        View.OnClickListener viewOnClickListenerC8504d;
        String str3;
        this.f31195f.setText(String.format("你们已互发%s条消息", Integer.valueOf(msgDataMMTask.mmCnt)));
        List<String> list = msgDataMMTask.taskNames;
        if (!vwb.m200296J(list)) {
            int i = 0;
            while (true) {
                if (i < list.size()) {
                    String str4 = list.get(i);
                    if (!TextUtils.equals(str4, "change_pic")) {
                        if (!TextUtils.equals(str4, "voice")) {
                            if (TextUtils.equals(str4, "change_answer") && xoy.m210453h(str, false, user)) {
                                charSequence = "change_answer";
                                break;
                            }
                            i++;
                        }
                    } else {
                        if (xoy.m210451f(str, false)) {
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
            viewOnClickListenerC8504d = new ViewOnClickListenerC8502b(messagesAct, user, map);
            str2 = "互相交换一张全身照，了解真实的一面";
            str3 = "立即交换";
        } else if (TextUtils.equals(charSequence, "voice")) {
            map.put("second_spark_task", "voice_chat");
            viewOnClickListenerC8504d = new ViewOnClickListenerC8503c(messagesAct, user, map);
            str2 = "语音聊天，听听对方的声音";
            str3 = "发起邀请";
        } else if (TextUtils.equals(charSequence, "change_answer")) {
            map.put("second_spark_task", "exchange_answer");
            viewOnClickListenerC8504d = new ViewOnClickListenerC8504d(messagesAct, user, map);
            str2 = "聊聊你们的感情经历，加深对彼此的了解";
            str3 = "交换答案";
        } else {
            str2 = "";
            viewOnClickListenerC8504d = null;
            str3 = "";
        }
        this.f31196g.setText(str2);
        this.f31198i.setText(str3);
        xdl0.m208329E0(this.f31198i, viewOnClickListenerC8504d);
    }

    /* JADX INFO: renamed from: W */
    public final void m48431W(MessagesAct messagesAct, String str, User user, MsgDataMMTask msgDataMMTask, Map<String, Object> map) {
        this.f31195f.setText(String.format("互发%s条消息，成为密友啦", Integer.valueOf(msgDataMMTask.mmCnt)));
        this.f31196g.setText("你们的消息已自动置顶");
        this.f31198i.setText("更改设置");
        xdl0.m208329E0(this.f31198i, new ViewOnClickListenerC8501a(messagesAct, user, map, str));
    }

    /* JADX INFO: renamed from: X */
    public final void m48432X() {
        if (this.f31199j) {
            return;
        }
        this.f31199j = true;
        this.f31194e.startAnimation();
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m48433Y(qsz qszVar, Message message, Map<String, Object> map) {
        String str = "ITEM_MESSAGE_MM_TASKe_spark_level_up" + map.toString() + message.f56011id;
        if (qszVar.m176377a(str)) {
            return false;
        }
        qszVar.m176378b(str);
        zvf0.m220403y("e_spark_level_up", OMSDialogPositon.p_chat_view, map);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f31194e.stopAnimation(false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48427Q(this);
    }

    public ItemMessageMMTask(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31199j = false;
    }

    public ItemMessageMMTask(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f31199j = false;
    }
}
