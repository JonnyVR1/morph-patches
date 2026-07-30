package p149l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.ChatMM;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.messages.MessageChatFireSettingAct;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.tantanapp.common.utils.NullChecker;
import p147v.VSwitchButton;
import p147v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class cvy implements s7m<bvy> {

    /* JADX INFO: renamed from: a */
    public VText_Medium f82705a;

    /* JADX INFO: renamed from: b */
    public VSwitchButton f82706b;

    /* JADX INFO: renamed from: c */
    public VText f82707c;

    /* JADX INFO: renamed from: d */
    public FrameLayout f82708d;

    /* JADX INFO: renamed from: e */
    public VText_Medium f82709e;

    /* JADX INFO: renamed from: f */
    public VSwitchButton f82710f;

    /* JADX INFO: renamed from: g */
    public VText f82711g;

    /* JADX INFO: renamed from: h */
    public bvy f82712h;

    /* JADX INFO: renamed from: i */
    public final MessageChatFireSettingAct f82713i;

    /* JADX INFO: renamed from: j */
    public boolean f82714j = false;

    /* JADX INFO: renamed from: k */
    public boolean f82715k = false;

    /* JADX INFO: renamed from: l */
    public int f82716l = 0;

    /* JADX INFO: renamed from: m */
    public Conversation f82717m;

    /* JADX INFO: renamed from: l.cvy$a */
    public class C16257a implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Conversation f82718a;

        public C16257a(Conversation conversation) {
            this.f82718a = conversation;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            zvf0.m220399u("e_spark_switch", cvy.this.f82713i.pageId(), vwb.m200311Y("spark_switch_status", !cvy.this.f82714j ? "on" : BLiveOperationTitleShowType.off));
            cvy cvyVar = cvy.this;
            cvyVar.f82714j = !cvyVar.f82714j;
            if (!cvy.this.f82714j) {
                cvy.this.f82715k = false;
            }
            cvy.this.f82712h.m104093k0(this.f82718a.f56011id, cvy.this.f82714j, cvy.this.f82715k);
        }
    }

    /* JADX INFO: renamed from: l.cvy$b */
    public class C16258b implements CompoundButton.OnCheckedChangeListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Conversation f82720a;

        public C16258b(Conversation conversation) {
            this.f82720a = conversation;
        }

        @Override // android.widget.CompoundButton.OnCheckedChangeListener
        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            zvf0.m220399u("e_close_friend_switch", cvy.this.f82713i.pageId(), vwb.m200311Y("close_friend_switch_status", !cvy.this.f82715k ? "on" : BLiveOperationTitleShowType.off));
            cvy cvyVar = cvy.this;
            cvyVar.f82715k = !cvyVar.f82715k;
            cvy.this.f82712h.m104093k0(this.f82720a.f56011id, cvy.this.f82714j, cvy.this.f82715k);
        }
    }

    public cvy(MessageChatFireSettingAct messageChatFireSettingAct) {
        this.f82713i = messageChatFireSettingAct;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f82713i;
    }

    @Override // p149l.s7m
    @Nullable
    public Act act() {
        return this.f82713i;
    }

    /* JADX INFO: renamed from: i */
    public View m108975i(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return dvy.m113857b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m108975i(layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(bvy bvyVar) {
        this.f82712h = bvyVar;
    }

    /* JADX INFO: renamed from: k */
    public void m108977k(Conversation conversation) {
        this.f82717m = conversation;
        if (NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.additional) && NullChecker.m81303a(conversation.additional.chatMM)) {
            ChatMM chatMM = conversation.additional.chatMM;
            this.f82714j = chatMM.sparkSwitch;
            this.f82715k = chatMM.partnerSwitch;
            this.f82716l = chatMM.level;
        } else {
            this.f82714j = true;
            this.f82715k = false;
        }
        this.f82706b.setOnCheckedChangeListener(new C16257a(conversation));
        this.f82710f.setOnCheckedChangeListener(new C16258b(conversation));
        boolean z = this.f82714j;
        VSwitchButton vSwitchButton = this.f82706b;
        if (z) {
            vSwitchButton.setCheckedNoEvent(true);
            this.f82706b.setEnabled(true);
            this.f82706b.setClickable(true);
            this.f82706b.setFocusable(true);
            xdl0.m208344M(this.f82708d, true);
            if (this.f82715k) {
                this.f82710f.setCheckedNoEvent(true);
                this.f82710f.setEnabled(true);
                this.f82710f.setClickable(true);
                this.f82710f.setFocusable(true);
                this.f82709e.setTextColor(Color.parseColor("#CC000000"));
                this.f82711g.setTextColor(Color.parseColor("#66000000"));
            } else {
                int i = this.f82716l;
                VSwitchButton vSwitchButton2 = this.f82710f;
                if (i >= 3) {
                    vSwitchButton2.setCheckedNoEvent(false);
                    this.f82710f.setEnabled(true);
                    this.f82710f.setClickable(true);
                    this.f82710f.setFocusable(true);
                    this.f82709e.setTextColor(Color.parseColor("#CC000000"));
                    this.f82711g.setTextColor(Color.parseColor("#66000000"));
                } else {
                    vSwitchButton2.setCheckedNoEvent(false);
                    this.f82710f.setEnabled(false);
                    this.f82710f.setClickable(false);
                    this.f82710f.setFocusable(false);
                    this.f82709e.setTextColor(Color.parseColor("#33000000"));
                    this.f82711g.setTextColor(Color.parseColor("#33000000"));
                }
            }
        } else {
            vSwitchButton.setCheckedNoEvent(false);
            this.f82706b.setEnabled(true);
            this.f82706b.setClickable(true);
            this.f82706b.setFocusable(true);
            xdl0.m208344M(this.f82708d, false);
        }
        int i2 = this.f82716l;
        VText vText = this.f82711g;
        if (i2 >= 3) {
            vText.setText("开启后，将展示你们的密友标识，同时默认置顶该密友的对话框");
        } else {
            vText.setText("点亮3级聊天火花，即可建立密友关系");
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
