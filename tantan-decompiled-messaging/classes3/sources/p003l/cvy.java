package p003l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import com.p000p1.mobile.putong.core.p001ui.messages.MessageChatFireSettingAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ChatMM;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.dvy;
import l.j760;
import l.s7m;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p028v.VSwitchButton;
import p028v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class cvy implements s7m<bvy> {

    /* JADX INFO: renamed from: a */
    public VText_Medium f2818a;

    /* JADX INFO: renamed from: b */
    public VSwitchButton f2819b;

    /* JADX INFO: renamed from: c */
    public VText f2820c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f2821d;

    /* JADX INFO: renamed from: e */
    public VText_Medium f2822e;

    /* JADX INFO: renamed from: f */
    public VSwitchButton f2823f;

    /* JADX INFO: renamed from: g */
    public VText f2824g;

    /* JADX INFO: renamed from: h */
    public bvy f2825h;

    /* JADX INFO: renamed from: i */
    public final MessageChatFireSettingAct f2826i;

    /* JADX INFO: renamed from: j */
    public boolean f2827j = false;

    /* JADX INFO: renamed from: k */
    public boolean f2828k = false;

    /* JADX INFO: renamed from: l */
    public int f2829l = 0;

    /* JADX INFO: renamed from: m */
    public Conversation f2830m;

    /* JADX INFO: renamed from: l.cvy$a */
    public class C0211a implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Conversation f2831a;

        public C0211a(Conversation conversation) {
            this.f2831a = conversation;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            zvf0.u("e_spark_switch", cvy.this.f2826i.pageId(), new j760[]{vwb.Y("spark_switch_status", !cvy.this.f2827j ? "on" : "off")});
            cvy cvyVar = cvy.this;
            cvyVar.f2827j = !cvyVar.f2827j;
            if (!cvy.this.f2827j) {
                cvy.this.f2828k = false;
            }
            cvy.this.f2825h.m3189k0(((DbObject) this.f2831a).id, cvy.this.f2827j, cvy.this.f2828k);
        }
    }

    /* JADX INFO: renamed from: l.cvy$b */
    public class C0212b implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Conversation f2833a;

        public C0212b(Conversation conversation) {
            this.f2833a = conversation;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            zvf0.u("e_close_friend_switch", cvy.this.f2826i.pageId(), new j760[]{vwb.Y("close_friend_switch_status", !cvy.this.f2828k ? "on" : "off")});
            cvy cvyVar = cvy.this;
            cvyVar.f2828k = !cvyVar.f2828k;
            cvy.this.f2825h.m3189k0(((DbObject) this.f2833a).id, cvy.this.f2827j, cvy.this.f2828k);
        }
    }

    public cvy(MessageChatFireSettingAct messageChatFireSettingAct) {
        this.f2826i = messageChatFireSettingAct;
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m3476C0() {
        return this.f2826i;
    }

    @Nullable
    public Act act() {
        return this.f2826i;
    }

    /* JADX INFO: renamed from: i */
    public View m3477i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dvy.b(this, layoutInflater, viewGroup);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m3477i(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void m3478i1(bvy bvyVar) {
        this.f2825h = bvyVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: k */
    public void m3480k(Conversation conversation) {
        this.f2830m = conversation;
        if (NullChecker.a(conversation) && NullChecker.a(conversation.additional) && NullChecker.a(conversation.additional.chatMM)) {
            ChatMM chatMM = conversation.additional.chatMM;
            this.f2827j = chatMM.sparkSwitch;
            this.f2828k = chatMM.partnerSwitch;
            this.f2829l = chatMM.level;
        } else {
            this.f2827j = true;
            this.f2828k = false;
        }
        this.f2819b.setOnCheckedChangeListener(new C0211a(conversation));
        this.f2823f.setOnCheckedChangeListener(new C0212b(conversation));
        boolean z = this.f2827j;
        VSwitchButton vSwitchButton = this.f2819b;
        if (z) {
            vSwitchButton.setCheckedNoEvent(true);
            this.f2819b.setEnabled(true);
            this.f2819b.setClickable(true);
            this.f2819b.setFocusable(true);
            xdl0.M(this.f2821d, true);
            if (this.f2828k) {
                this.f2823f.setCheckedNoEvent(true);
                this.f2823f.setEnabled(true);
                this.f2823f.setClickable(true);
                this.f2823f.setFocusable(true);
                this.f2822e.setTextColor(Color.parseColor("#CC000000"));
                this.f2824g.setTextColor(Color.parseColor("#66000000"));
            } else {
                int i = this.f2829l;
                VSwitchButton vSwitchButton2 = this.f2823f;
                if (i >= 3) {
                    vSwitchButton2.setCheckedNoEvent(false);
                    this.f2823f.setEnabled(true);
                    this.f2823f.setClickable(true);
                    this.f2823f.setFocusable(true);
                    this.f2822e.setTextColor(Color.parseColor("#CC000000"));
                    this.f2824g.setTextColor(Color.parseColor("#66000000"));
                } else {
                    vSwitchButton2.setCheckedNoEvent(false);
                    this.f2823f.setEnabled(false);
                    this.f2823f.setClickable(false);
                    this.f2823f.setFocusable(false);
                    this.f2822e.setTextColor(Color.parseColor("#33000000"));
                    this.f2824g.setTextColor(Color.parseColor("#33000000"));
                }
            }
        } else {
            vSwitchButton.setCheckedNoEvent(false);
            this.f2819b.setEnabled(true);
            this.f2819b.setClickable(true);
            this.f2819b.setFocusable(true);
            xdl0.M(this.f2821d, false);
        }
        int i2 = this.f2829l;
        AppCompatTextView appCompatTextView = this.f2824g;
        if (i2 >= 3) {
            appCompatTextView.setText("开启后，将展示你们的密友标识，同时默认置顶该密友的对话框");
        } else {
            appCompatTextView.setText("点亮3级聊天火花，即可建立密友关系");
        }
    }

    public void destroy() {
    }
}
