package p153l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.ChatMM;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.messages.MessageChatFireSettingAct;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import p151v.VSwitchButton;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class z3z implements iam<y3z> {

    /* JADX INFO: renamed from: a */
    public VText_Medium f202870a;

    /* JADX INFO: renamed from: b */
    public VSwitchButton f202871b;

    /* JADX INFO: renamed from: c */
    public VText f202872c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f202873d;

    /* JADX INFO: renamed from: e */
    public VText_Medium f202874e;

    /* JADX INFO: renamed from: f */
    public VSwitchButton f202875f;

    /* JADX INFO: renamed from: g */
    public VText f202876g;

    /* JADX INFO: renamed from: h */
    public y3z f202877h;

    /* JADX INFO: renamed from: i */
    public final MessageChatFireSettingAct f202878i;

    /* JADX INFO: renamed from: j */
    public boolean f202879j = false;

    /* JADX INFO: renamed from: k */
    public boolean f202880k = false;

    /* JADX INFO: renamed from: l */
    public int f202881l = 0;

    /* JADX INFO: renamed from: m */
    public Conversation f202882m;

    /* JADX INFO: renamed from: l.z3z$a */
    public class C21757a implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Conversation f202883a;

        public C21757a(Conversation conversation) {
            this.f202883a = conversation;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            i4g0.m138523u("e_spark_switch", z3z.this.f202878i.pageId(), jyb.m147494Y("spark_switch_status", !z3z.this.f202879j ? "on" : BLiveOperationTitleShowType.off));
            z3z z3zVar = z3z.this;
            z3zVar.f202879j = !z3zVar.f202879j;
            if (!z3z.this.f202879j) {
                z3z.this.f202880k = false;
            }
            z3z.this.f202877h.m214182k0(this.f202883a.f56859id, z3z.this.f202879j, z3z.this.f202880k);
        }
    }

    /* JADX INFO: renamed from: l.z3z$b */
    public class C21758b implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Conversation f202885a;

        public C21758b(Conversation conversation) {
            this.f202885a = conversation;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            i4g0.m138523u("e_close_friend_switch", z3z.this.f202878i.pageId(), jyb.m147494Y("close_friend_switch_status", !z3z.this.f202880k ? "on" : BLiveOperationTitleShowType.off));
            z3z z3zVar = z3z.this;
            z3zVar.f202880k = !z3zVar.f202880k;
            z3z.this.f202877h.m214182k0(this.f202885a.f56859id, z3z.this.f202879j, z3z.this.f202880k);
        }
    }

    public z3z(MessageChatFireSettingAct messageChatFireSettingAct) {
        this.f202878i = messageChatFireSettingAct;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f202878i;
    }

    @Override // p153l.iam
    @Nullable
    public Act act() {
        return this.f202878i;
    }

    /* JADX INFO: renamed from: i */
    public View m218521i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return a4z.m96007b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m218521i(layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(y3z y3zVar) {
        this.f202877h = y3zVar;
    }

    /* JADX INFO: renamed from: k */
    public void m218523k(Conversation conversation) {
        this.f202882m = conversation;
        if (NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.additional) && NullChecker.m82486a(conversation.additional.chatMM)) {
            ChatMM chatMM = conversation.additional.chatMM;
            this.f202879j = chatMM.sparkSwitch;
            this.f202880k = chatMM.partnerSwitch;
            this.f202881l = chatMM.level;
        } else {
            this.f202879j = true;
            this.f202880k = false;
        }
        this.f202871b.setOnCheckedChangeListener(new C21757a(conversation));
        this.f202875f.setOnCheckedChangeListener(new C21758b(conversation));
        boolean z = this.f202879j;
        VSwitchButton vSwitchButton = this.f202871b;
        if (z) {
            vSwitchButton.setCheckedNoEvent(true);
            this.f202871b.setEnabled(true);
            this.f202871b.setClickable(true);
            this.f202871b.setFocusable(true);
            bnl0.m105524M(this.f202873d, true);
            if (this.f202880k) {
                this.f202875f.setCheckedNoEvent(true);
                this.f202875f.setEnabled(true);
                this.f202875f.setClickable(true);
                this.f202875f.setFocusable(true);
                this.f202874e.setTextColor(Color.parseColor("#CC000000"));
                this.f202876g.setTextColor(Color.parseColor("#66000000"));
            } else {
                int i = this.f202881l;
                VSwitchButton vSwitchButton2 = this.f202875f;
                if (i >= 3) {
                    vSwitchButton2.setCheckedNoEvent(false);
                    this.f202875f.setEnabled(true);
                    this.f202875f.setClickable(true);
                    this.f202875f.setFocusable(true);
                    this.f202874e.setTextColor(Color.parseColor("#CC000000"));
                    this.f202876g.setTextColor(Color.parseColor("#66000000"));
                } else {
                    vSwitchButton2.setCheckedNoEvent(false);
                    this.f202875f.setEnabled(false);
                    this.f202875f.setClickable(false);
                    this.f202875f.setFocusable(false);
                    this.f202874e.setTextColor(Color.parseColor("#33000000"));
                    this.f202876g.setTextColor(Color.parseColor("#33000000"));
                }
            }
        } else {
            vSwitchButton.setCheckedNoEvent(false);
            this.f202871b.setEnabled(true);
            this.f202871b.setClickable(true);
            this.f202871b.setFocusable(true);
            bnl0.m105524M(this.f202873d, false);
        }
        int i2 = this.f202881l;
        VText vText = this.f202876g;
        if (i2 >= 3) {
            vText.setText("开启后，将展示你们的密友标识，同时默认置顶该密友的对话框");
        } else {
            vText.setText("点亮3级聊天火花，即可建立密友关系");
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
