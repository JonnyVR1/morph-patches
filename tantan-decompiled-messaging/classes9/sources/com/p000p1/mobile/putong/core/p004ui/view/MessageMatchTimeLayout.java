package com.p000p1.mobile.putong.core.p004ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ConvAdditionalMatchInfo;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationAdditional;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.data.User;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import l.a1c0;
import l.arz;
import l.hmb;
import l.xdl0;
import p006l.qib0;
import p006l.ura;
import v.VDraweeView;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class MessageMatchTimeLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public MessageMatchTimeLayout f6594c;

    /* JADX INFO: renamed from: d */
    public VLinear f6595d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f6596e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f6597f;

    /* JADX INFO: renamed from: g */
    public VLinear f6598g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f6599h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f6600i;

    /* JADX INFO: renamed from: j */
    public VLinear f6601j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f6602k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f6603l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f6604m;

    public MessageMatchTimeLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m9575P(View view) {
        arz.a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final String m9576Q(double d) {
        int i = Calendar.getInstance().get(1);
        Calendar calendar = Calendar.getInstance();
        long j = (long) d;
        calendar.setTimeInMillis(j);
        return (calendar.get(1) == i ? new SimpleDateFormat("M月d日 HH:mm", Locale.getDefault()) : new SimpleDateFormat("yyyy年M月d日 HH:mm", Locale.getDefault())).format(new Date(j));
    }

    /* JADX INFO: renamed from: R */
    public final void m9577R(Conversation conversation, User user, User user2, ConvAdditionalMatchInfo convAdditionalMatchInfo) {
        boolean zEquals = TextUtils.equals(convAdditionalMatchInfo.verifyInviteOwner, CoreModule.m1850H().userId());
        double d = convAdditionalMatchInfo.verifyInviteTime;
        if (!zEquals) {
            if (d >= convAdditionalMatchInfo.likeTime) {
                xdl0.M(this.f6595d, true);
                qib0.f19782G.m12754Q0(this.f6596e, user.fp().profileSmall());
                VText_Bold vText_Bold = this.f6597f;
                StringBuilder sb = new StringBuilder();
                sb.append(m9576Q(convAdditionalMatchInfo.likeTime));
                sb.append(" 你");
                sb.append("superliked".equals(convAdditionalMatchInfo.state) ? "超级喜欢" : "喜欢");
                sb.append("了");
                sb.append(user2.getPronoun());
                vText_Bold.setText(sb.toString());
                xdl0.M(this.f6598g, true);
                qib0.f19782G.m12754Q0(this.f6599h, user2.fp().profileSmall());
                this.f6600i.setText(m9576Q(convAdditionalMatchInfo.verifyInviteTime) + " " + user2.getPronoun() + "邀请你做认证");
                xdl0.M(this.f6601j, true);
                qib0.f19782G.m12754Q0(this.f6602k, user.fp().profileSmall());
                qib0.f19782G.m12754Q0(this.f6603l, user2.fp().profileSmall());
                this.f6604m.setText(m9576Q(convAdditionalMatchInfo.likedByTime) + "  你完成了认证，" + user2.getPronoun() + "喜欢了你，匹配成功");
                return;
            }
            qib0.f19782G.m12754Q0(this.f6596e, user2.fp().profileSmall());
            this.f6597f.setText(m9576Q(convAdditionalMatchInfo.verifyInviteTime) + " " + user2.getPronoun() + "邀请你做认证");
            double d2 = convAdditionalMatchInfo.likeTime;
            double d3 = convAdditionalMatchInfo.likedByTime;
            VLinear vLinear = this.f6598g;
            if (d2 >= d3) {
                xdl0.M(vLinear, true);
                qib0.f19782G.m12754Q0(this.f6599h, user.fp().profileSmall());
                this.f6600i.setText(m9576Q(convAdditionalMatchInfo.likedByTime) + " 你完成了认证，" + user2.getPronoun() + "喜欢了你");
                xdl0.M(this.f6601j, true);
                boolean z = convAdditionalMatchInfo.likeTime < convAdditionalMatchInfo.likedByTime;
                qib0.f19782G.m12754Q0(this.f6602k, user.fp().profileSmall());
                qib0.f19782G.m12754Q0(this.f6603l, user2.fp().profileSmall());
                this.f6604m.setText(String.format("%s %s%s了%s，匹配成功", m9576Q(z ? convAdditionalMatchInfo.likedByTime : convAdditionalMatchInfo.likeTime), z ? user2.getPronoun() : "你", "superliked".equals(z ? convAdditionalMatchInfo.otherState : convAdditionalMatchInfo.state) ? "超级喜欢" : "喜欢", z ? "你" : user2.getPronoun()));
                return;
            }
            xdl0.M(vLinear, true);
            qib0.f19782G.m12754Q0(this.f6599h, user.fp().profileSmall());
            VText_Bold vText_Bold2 = this.f6600i;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m9576Q(convAdditionalMatchInfo.likeTime));
            sb2.append(" 你");
            sb2.append("superliked".equals(convAdditionalMatchInfo.state) ? "超级喜欢" : "喜欢");
            sb2.append("了");
            sb2.append(user2.getPronoun());
            vText_Bold2.setText(sb2.toString());
            xdl0.M(this.f6601j, true);
            qib0.f19782G.m12754Q0(this.f6602k, user.fp().profileSmall());
            qib0.f19782G.m12754Q0(this.f6603l, user2.fp().profileSmall());
            this.f6604m.setText(m9576Q(convAdditionalMatchInfo.likedByTime) + " 你完成了认证，" + user2.getPronoun() + "喜欢了你，匹配成功");
            return;
        }
        double d4 = convAdditionalMatchInfo.likedByTime;
        if (d >= d4) {
            xdl0.M(this.f6595d, true);
            qib0.f19782G.m12754Q0(this.f6596e, user2.fp().profileSmall());
            VText_Bold vText_Bold3 = this.f6597f;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m9576Q(convAdditionalMatchInfo.likedByTime));
            sb3.append(" ");
            sb3.append(user2.getPronoun());
            sb3.append("superliked".equals(convAdditionalMatchInfo.otherState) ? "超级喜欢" : "喜欢");
            sb3.append("了你");
            vText_Bold3.setText(sb3.toString());
            xdl0.M(this.f6598g, true);
            qib0.f19782G.m12754Q0(this.f6599h, user.fp().profileSmall());
            this.f6600i.setText(m9576Q(convAdditionalMatchInfo.verifyInviteTime) + " 你邀请" + user2.getPronoun() + "做认证");
            xdl0.M(this.f6601j, true);
            qib0.f19782G.m12754Q0(this.f6602k, user.fp().profileSmall());
            qib0.f19782G.m12754Q0(this.f6603l, user2.fp().profileSmall());
            this.f6604m.setText(m9576Q(convAdditionalMatchInfo.likeTime) + " " + user2.getPronoun() + "完成了认证，帮你发出喜欢，匹配成功");
            return;
        }
        if (d4 >= convAdditionalMatchInfo.likeTime) {
            qib0.f19782G.m12754Q0(this.f6596e, user.fp().profileSmall());
            this.f6597f.setText(m9576Q(convAdditionalMatchInfo.verifyInviteTime) + " 你邀请" + user2.getPronoun() + "做认证");
            if (convAdditionalMatchInfo.likeTime > 0.0d) {
                xdl0.M(this.f6598g, true);
                qib0.f19782G.m12754Q0(this.f6599h, user2.fp().profileSmall());
                this.f6600i.setText(m9576Q(convAdditionalMatchInfo.likeTime) + " " + user2.getPronoun() + "完成了认证，帮你发出喜欢");
            }
            xdl0.M(this.f6601j, true);
            boolean z2 = convAdditionalMatchInfo.likeTime < convAdditionalMatchInfo.likedByTime;
            qib0.f19782G.m12754Q0(this.f6602k, user.fp().profileSmall());
            qib0.f19782G.m12754Q0(this.f6603l, user2.fp().profileSmall());
            this.f6604m.setText(String.format("%s %s%s了%s，匹配成功", m9576Q(convAdditionalMatchInfo.likedByTime), user2.getPronoun(), "superliked".equals(convAdditionalMatchInfo.otherState) ? "超级喜欢" : "喜欢", z2 ? "你" : user2.getPronoun()));
            return;
        }
        qib0.f19782G.m12754Q0(this.f6596e, user.fp().profileSmall());
        this.f6597f.setText(m9576Q(convAdditionalMatchInfo.verifyInviteTime) + " 你邀请" + user2.getPronoun() + "做认证");
        xdl0.M(this.f6598g, true);
        qib0.f19782G.m12754Q0(this.f6599h, user2.fp().profileSmall());
        VText_Bold vText_Bold4 = this.f6600i;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(m9576Q(convAdditionalMatchInfo.likedByTime));
        sb4.append(" ");
        sb4.append(user2.getPronoun());
        sb4.append("superliked".equals(convAdditionalMatchInfo.otherState) ? "超级喜欢" : "喜欢");
        sb4.append("了你");
        vText_Bold4.setText(sb4.toString());
        xdl0.M(this.f6601j, true);
        qib0.f19782G.m12754Q0(this.f6602k, user.fp().profileSmall());
        qib0.f19782G.m12754Q0(this.f6603l, user2.fp().profileSmall());
        this.f6604m.setText(m9576Q(convAdditionalMatchInfo.likeTime) + " " + user2.getPronoun() + "完成了认证，帮你发出喜欢，匹配成功");
    }

    /* JADX INFO: renamed from: S */
    public final void m9578S(Conversation conversation, User user, User user2, ConvAdditionalMatchInfo convAdditionalMatchInfo) {
        this.f6604m.setText(String.format("%s 通过%s匹配成功", m9576Q(convAdditionalMatchInfo.matchTime), convAdditionalMatchInfo.source));
        qib0.f19782G.m12754Q0(this.f6602k, user.fp().profileSmall());
        qib0.f19782G.m12754Q0(this.f6603l, user2.fp().profileSmall());
    }

    /* JADX INFO: renamed from: T */
    public final void m9579T(Conversation conversation, User user, User user2) {
        ConvAdditionalMatchInfo convAdditionalMatchInfo = conversation.additional.matchInfo;
        double d = convAdditionalMatchInfo.likeTime;
        double d2 = convAdditionalMatchInfo.likedByTime;
        boolean z = d < d2;
        VText_Bold vText_Bold = this.f6600i;
        if (!z) {
            d = d2;
        }
        vText_Bold.setText(String.format("%s %s%s了%s", m9576Q(d), z ? "你" : user2.getPronoun(), "superliked".equals(z ? convAdditionalMatchInfo.state : convAdditionalMatchInfo.otherState) ? "超级喜欢" : "喜欢", z ? user2.getPronoun() : "你"));
        this.f6604m.setText(String.format("%s %s%s了%s，匹配成功", m9576Q(z ? convAdditionalMatchInfo.likedByTime : convAdditionalMatchInfo.likeTime), z ? user2.getPronoun() : "你", "superliked".equals(z ? convAdditionalMatchInfo.otherState : convAdditionalMatchInfo.state) ? "超级喜欢" : "喜欢", z ? "你" : user2.getPronoun()));
        qib0.f19782G.m12754Q0(this.f6599h, (z ? user.fp() : user2.fp()).profileSmall());
        qib0.f19782G.m12754Q0(this.f6602k, user.fp().profileSmall());
        qib0.f19782G.m12754Q0(this.f6603l, user2.fp().profileSmall());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX INFO: renamed from: V */
    public void m9580V(@NonNull Conversation conversation, @NonNull User user, @NonNull User user2) {
        boolean z;
        ConversationAdditional conversationAdditional = conversation.additional;
        if (conversationAdditional == null || conversationAdditional.matchInfo == null) {
            return;
        }
        xdl0.M(this.f6595d, false);
        ConvAdditionalMatchInfo convAdditionalMatchInfo = conversation.additional.matchInfo;
        if (!ura.m25555e().m25559d().m5861t9() || !ura.m25555e().m25559d().m5730Ze() || TextUtils.isEmpty(convAdditionalMatchInfo.verifyInviteOwner) || convAdditionalMatchInfo.verifyInviteTime <= 0.0d) {
            z = true;
        } else {
            boolean zEquals = TextUtils.equals(convAdditionalMatchInfo.verifyInviteOwner, CoreModule.m1850H().userId());
            double d = convAdditionalMatchInfo.verifyInviteTime;
            if (!zEquals ? d > convAdditionalMatchInfo.likedByTime : d > convAdditionalMatchInfo.likeTime) {
                z = true;
            } else {
                z = false;
            }
        }
        if (ura.m25555e().m25559d().m5861t9() && ura.m25555e().m25559d().m5730Ze() && TextUtils.isEmpty(convAdditionalMatchInfo.source) && z && !TextUtils.isEmpty(convAdditionalMatchInfo.verifyInviteOwner) && convAdditionalMatchInfo.verifyInviteTime > 0.0d) {
            xdl0.M(this.f6595d, true);
            hmb.M(this.f6598g, false);
            hmb.M(this.f6601j, false);
            m9577R(conversation, user2, user, convAdditionalMatchInfo);
            return;
        }
        if (!TextUtils.isEmpty(convAdditionalMatchInfo.source) && convAdditionalMatchInfo.matchTime > 0.0d) {
            m9578S(conversation, user2, user, convAdditionalMatchInfo);
            hmb.M(this.f6598g, false);
            hmb.M(this.f6601j, true);
        } else {
            if (convAdditionalMatchInfo.likeTime <= 0.0d || convAdditionalMatchInfo.likedByTime <= 0.0d) {
                return;
            }
            m9579T(conversation, user2, user);
            hmb.M(this.f6598g, true);
            hmb.M(this.f6601j, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m9575P(this);
        if (ura.m25555e().m25559d().m5636I4()) {
            this.f6600i.setTextColor(getResources().getColor(a1c0.i));
            this.f6604m.setTextColor(getResources().getColor(a1c0.i));
            this.f6597f.setTextColor(getResources().getColor(a1c0.i));
        }
    }

    public MessageMatchTimeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageMatchTimeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
