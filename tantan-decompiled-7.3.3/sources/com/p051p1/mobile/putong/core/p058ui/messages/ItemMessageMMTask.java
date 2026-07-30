package com.p051p1.mobile.putong.core.p058ui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MsgDataMMTask;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.breaking.SwapAnswerBottomSheetAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p151v.VLinear;
import p151v.VText;
import p153l.azy;
import p153l.bnl0;
import p153l.cvf0;
import p153l.eaq;
import p153l.g900;
import p153l.gta;
import p153l.h39;
import p153l.i4g0;
import p153l.jyb;
import p153l.n100;
import p153l.o1j0;
import p153l.qzm0;
import p153l.r600;
import p153l.uxy;
import p153l.xzm0;

/* JADX INFO: loaded from: classes3.dex */
public class ItemMessageMMTask extends VLinear {

    /* JADX INFO: renamed from: c */
    public ItemMessageMMTask f32040c;

    /* JADX INFO: renamed from: d */
    public VLinear f32041d;

    /* JADX INFO: renamed from: e */
    public SVGAnimationView f32042e;

    /* JADX INFO: renamed from: f */
    public VText f32043f;

    /* JADX INFO: renamed from: g */
    public VText f32044g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f32045h;

    /* JADX INFO: renamed from: i */
    public VText f32046i;

    /* JADX INFO: renamed from: j */
    public boolean f32047j;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask$a */
    public class ViewOnClickListenerC8664a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f32048a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f32049b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f32050c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f32051d;

        public ViewOnClickListenerC8664a(MessagesAct messagesAct, User user, Map map, String str) {
            this.f32048a = messagesAct;
            this.f32049b = user;
            this.f32050c = map;
            this.f32051d = str;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ItemMessageMMTask.m49609R(this.f32048a, this.f32049b)) {
                return;
            }
            i4g0.m138521s("e_spark_level_up", OMSDialogPositon.p_chat_view, this.f32050c);
            Conversation conversationM34219zp = CoreModule.f18264c.f20384f0.m34219zp(this.f32051d);
            if (!NullChecker.m82486a(conversationM34219zp) || conversationM34219zp.doubleDefault()) {
                MessagesAct messagesAct = this.f32048a;
                messagesAct.startActivity(MessageChatFireSettingAct.m50025a2(messagesAct, this.f32051d));
            } else {
                boolean zM111000k4 = this.f32048a.f32488f.m143372e0().mo50158l().m111000k4(this.f32048a.f32488f.m143372e0().mo50158l().mo111034r3());
                MessagesAct messagesAct2 = this.f32048a;
                messagesAct2.startActivity(MessageProfileSettingAct.m50099Z1(messagesAct2, zM111000k4, this.f32051d));
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask$b */
    public class ViewOnClickListenerC8665b implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f32053a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f32054b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f32055c;

        public ViewOnClickListenerC8665b(MessagesAct messagesAct, User user, Map map) {
            this.f32053a = messagesAct;
            this.f32054b = user;
            this.f32055c = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ItemMessageMMTask.m49609R(this.f32053a, this.f32054b)) {
                return;
            }
            i4g0.m138521s("e_spark_level_up", OMSDialogPositon.p_chat_view, this.f32055c);
            MessagesAct messagesAct = this.f32053a;
            r600.m179973t(messagesAct, messagesAct.f32488f.mo111034r3(), "", "from_entrance_type");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask$c */
    public class ViewOnClickListenerC8666c implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f32057a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f32058b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f32059c;

        public ViewOnClickListenerC8666c(MessagesAct messagesAct, User user, Map map) {
            this.f32057a = messagesAct;
            this.f32058b = user;
            this.f32059c = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ItemMessageMMTask.m49609R(this.f32057a, this.f32058b)) {
                return;
            }
            i4g0.m138521s("e_spark_level_up", OMSDialogPositon.p_chat_view, this.f32059c);
            qzm0.m178812h().m178823o("voice_mm_task_item");
            azy azyVarM114043u0 = this.f32057a.mo50138B0().m143374g0().m114043u0();
            if (NullChecker.m82486a(azyVarM114043u0) && azyVarM114043u0.m101199d0()) {
                o1j0.m165649w(R$string.f21472C5);
                return;
            }
            qzm0.m178812h().m178823o("voice_mm_task_item");
            xzm0 xzm0VarM213760p = xzm0.m213760p();
            MessagesAct messagesAct = this.f32057a;
            xzm0VarM213760p.m213765h(messagesAct, messagesAct.f32488f.mo111034r3(), "");
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask$d */
    public class ViewOnClickListenerC8667d implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f32061a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f32062b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f32063c;

        public ViewOnClickListenerC8667d(MessagesAct messagesAct, User user, Map map) {
            this.f32061a = messagesAct;
            this.f32062b = user;
            this.f32063c = map;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0034  */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str;
            if (ItemMessageMMTask.m49609R(this.f32061a, this.f32062b)) {
                return;
            }
            i4g0.m138521s("e_spark_level_up", OMSDialogPositon.p_chat_view, this.f32063c);
            User userMo111064x6 = this.f32061a.f32488f.mo111064x6();
            if (NullChecker.m82486a(userMo111064x6)) {
                List<String> listM133415D = h39.m133415D();
                if (!jyb.m147479J(listM133415D)) {
                    str = listM133415D.contains("聊聊你的感情经历") ? "聊聊你的感情经历" : null;
                }
                SwapAnswerBottomSheetAct.m45633E2(this.f32061a, userMo111064x6.f56859id, str);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.ItemMessageMMTask$e */
    public class ViewOnClickListenerC8668e implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ MessagesAct f32065a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ User f32066b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Map f32067c;

        public ViewOnClickListenerC8668e(MessagesAct messagesAct, User user, Map map) {
            this.f32065a = messagesAct;
            this.f32066b = user;
            this.f32067c = map;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (ItemMessageMMTask.m49609R(this.f32065a, this.f32066b)) {
                return;
            }
            i4g0.m138521s("e_spark_level_up", OMSDialogPositon.p_chat_view, this.f32067c);
            MessagesAct messagesAct = this.f32065a;
            cvf0.m112809a(messagesAct, messagesAct.f32488f.f82474c);
        }
    }

    public ItemMessageMMTask(Context context) {
        super(context);
        this.f32047j = false;
    }

    /* JADX INFO: renamed from: R */
    public static boolean m49609R(MessagesAct messagesAct, User user) {
        if (messagesAct.m50142E2()) {
            return true;
        }
        if (NullChecker.m82486a(user) && user.isAccountCancellation()) {
            o1j0.m165651y("对方已注销");
            return true;
        }
        if (gta.m132210e().m132214d().mo34776W8()) {
            return false;
        }
        o1j0.m165651y("功能已下线");
        return true;
    }

    /* JADX INFO: renamed from: Q */
    public final void m49610Q(View view) {
        eaq.m120100a(this, view);
    }

    /* JADX INFO: renamed from: S */
    public void m49611S(MessagesAct messagesAct, g900 g900Var, Message message) {
        MsgDataMMTask msgDataMMTask;
        ItemMessageMMTask itemMessageMMTask;
        String str;
        if (!NullChecker.m82486a(message) || messagesAct == null || messagesAct.isFinishing()) {
            return;
        }
        String str2 = messagesAct.f32488f.f82474c;
        User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(str2);
        try {
            msgDataMMTask = MsgDataMMTask.JSON_ADAPTER.parse(message.msgData);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
            msgDataMMTask = null;
        }
        MsgDataMMTask msgDataMMTask2 = msgDataMMTask;
        if (NullChecker.m82486a(msgDataMMTask2)) {
            HashMap map = new HashMap();
            int i = msgDataMMTask2.level;
            map.put("spark_level", String.valueOf(i));
            if (i == 1) {
                m49612T(messagesAct, userM116597oa, msgDataMMTask2, map);
                str = "https://fe-static.tancdn.com/v1/raw/753e736a-14c5-4112-880a-34506bf8892614.svga";
                itemMessageMMTask = this;
            } else if (i == 2) {
                itemMessageMMTask = this;
                itemMessageMMTask.m49613V(messagesAct, str2, userM116597oa, msgDataMMTask2, map);
                str = "https://fe-static.tancdn.com/v1/raw/c192eff9-8ece-4fe3-8fbd-d3aaa5e275af14.svga";
            } else {
                itemMessageMMTask = this;
                if (i >= 3) {
                    itemMessageMMTask.m49614W(messagesAct, str2, userM116597oa, msgDataMMTask2, map);
                    str = "https://fe-static.tancdn.com/v1/raw/8be24bd9-1be1-470d-a176-a75236f70aa914.svga";
                } else {
                    str = "";
                }
            }
            if (!itemMessageMMTask.m49616Y(g900Var.f102745r, message, map) || TextUtils.isEmpty(str)) {
                return;
            }
            SVGALoader.with(itemMessageMMTask.getContext()).from(str).autoPlay(true).repeatCount(1).into(itemMessageMMTask.f32042e);
            itemMessageMMTask.m49615X();
        }
    }

    /* JADX INFO: renamed from: T */
    public final void m49612T(MessagesAct messagesAct, User user, MsgDataMMTask msgDataMMTask, Map<String, Object> map) {
        this.f32043f.setText(String.format("已互发%s条消息，成功点亮火花", Integer.valueOf(msgDataMMTask.mmCnt)));
        this.f32044g.setText("聊得越多火花越旺盛，关系更密切");
        this.f32046i.setText("去看看");
        bnl0.m105509E0(this.f32046i, new ViewOnClickListenerC8668e(messagesAct, user, map));
    }

    /* JADX INFO: renamed from: V */
    public final void m49613V(MessagesAct messagesAct, String str, User user, MsgDataMMTask msgDataMMTask, Map<String, Object> map) {
        CharSequence charSequence;
        String str2;
        View.OnClickListener viewOnClickListenerC8667d;
        String str3;
        this.f32043f.setText(String.format("你们已互发%s条消息", Integer.valueOf(msgDataMMTask.mmCnt)));
        List<String> list = msgDataMMTask.taskNames;
        if (!jyb.m147479J(list)) {
            int i = 0;
            while (true) {
                if (i < list.size()) {
                    String str4 = list.get(i);
                    if (!TextUtils.equals(str4, "change_pic")) {
                        if (!TextUtils.equals(str4, "voice")) {
                            if (TextUtils.equals(str4, "change_answer") && uxy.m198557h(str, false, user)) {
                                charSequence = "change_answer";
                                break;
                            }
                            i++;
                        }
                    } else {
                        if (uxy.m198555f(str, false)) {
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
            viewOnClickListenerC8667d = new ViewOnClickListenerC8665b(messagesAct, user, map);
            str2 = "互相交换一张全身照，了解真实的一面";
            str3 = "立即交换";
        } else if (TextUtils.equals(charSequence, "voice")) {
            map.put("second_spark_task", "voice_chat");
            viewOnClickListenerC8667d = new ViewOnClickListenerC8666c(messagesAct, user, map);
            str2 = "语音聊天，听听对方的声音";
            str3 = "发起邀请";
        } else if (TextUtils.equals(charSequence, "change_answer")) {
            map.put("second_spark_task", "exchange_answer");
            viewOnClickListenerC8667d = new ViewOnClickListenerC8667d(messagesAct, user, map);
            str2 = "聊聊你们的感情经历，加深对彼此的了解";
            str3 = "交换答案";
        } else {
            str2 = "";
            viewOnClickListenerC8667d = null;
            str3 = "";
        }
        this.f32044g.setText(str2);
        this.f32046i.setText(str3);
        bnl0.m105509E0(this.f32046i, viewOnClickListenerC8667d);
    }

    /* JADX INFO: renamed from: W */
    public final void m49614W(MessagesAct messagesAct, String str, User user, MsgDataMMTask msgDataMMTask, Map<String, Object> map) {
        this.f32043f.setText(String.format("互发%s条消息，成为密友啦", Integer.valueOf(msgDataMMTask.mmCnt)));
        this.f32044g.setText("你们的消息已自动置顶");
        this.f32046i.setText("更改设置");
        bnl0.m105509E0(this.f32046i, new ViewOnClickListenerC8664a(messagesAct, user, map, str));
    }

    /* JADX INFO: renamed from: X */
    public final void m49615X() {
        if (this.f32047j) {
            return;
        }
        this.f32047j = true;
        this.f32042e.startAnimation();
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m49616Y(n100 n100Var, Message message, Map<String, Object> map) {
        String str = "ITEM_MESSAGE_MM_TASKe_spark_level_up" + map.toString() + message.f56859id;
        if (n100Var.m161054a(str)) {
            return false;
        }
        n100Var.m161055b(str);
        i4g0.m138527y("e_spark_level_up", OMSDialogPositon.p_chat_view, map);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f32042e.stopAnimation(false);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m49610Q(this);
    }

    public ItemMessageMMTask(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32047j = false;
    }

    public ItemMessageMMTask(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32047j = false;
    }
}
