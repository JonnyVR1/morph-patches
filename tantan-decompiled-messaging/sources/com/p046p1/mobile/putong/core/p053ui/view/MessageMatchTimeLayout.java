package com.p046p1.mobile.putong.core.p053ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ConvAdditionalMatchInfo;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationAdditional;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.data.User;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p147v.VDraweeView;
import p147v.VLinear;
import p149l.a1c0;
import p149l.arz;
import p149l.hmb;
import p149l.qib0;
import p149l.ura;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class MessageMatchTimeLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public MessageMatchTimeLayout f36813c;

    /* JADX INFO: renamed from: d */
    public VLinear f36814d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f36815e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f36816f;

    /* JADX INFO: renamed from: g */
    public VLinear f36817g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f36818h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f36819i;

    /* JADX INFO: renamed from: j */
    public VLinear f36820j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f36821k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f36822l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f36823m;

    public MessageMatchTimeLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m56148P(View view) {
        arz.m98577a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final String m56149Q(double d) {
        int i = Calendar.getInstance().get(1);
        Calendar calendar = Calendar.getInstance();
        long j = (long) d;
        calendar.setTimeInMillis(j);
        return (calendar.get(1) == i ? new SimpleDateFormat("M月d日 HH:mm", Locale.getDefault()) : new SimpleDateFormat("yyyy年M月d日 HH:mm", Locale.getDefault())).format(new Date(j));
    }

    /* JADX INFO: renamed from: R */
    public final void m56150R(Conversation conversation, User user, User user2, ConvAdditionalMatchInfo convAdditionalMatchInfo) {
        boolean zEquals = TextUtils.equals(convAdditionalMatchInfo.verifyInviteOwner, CoreModule.m29931H().userId());
        double d = convAdditionalMatchInfo.verifyInviteTime;
        if (!zEquals) {
            if (d >= convAdditionalMatchInfo.likeTime) {
                xdl0.m208344M(this.f36814d, true);
                qib0.f154691G.m102341Q0(this.f36815e, user.m60124fp().profileSmall());
                VText_Bold vText_Bold = this.f36816f;
                StringBuilder sb = new StringBuilder();
                sb.append(m56149Q(convAdditionalMatchInfo.likeTime));
                sb.append(" 你");
                sb.append("superliked".equals(convAdditionalMatchInfo.state) ? "超级喜欢" : "喜欢");
                sb.append("了");
                sb.append(user2.getPronoun());
                vText_Bold.setText(sb.toString());
                xdl0.m208344M(this.f36817g, true);
                qib0.f154691G.m102341Q0(this.f36818h, user2.m60124fp().profileSmall());
                this.f36819i.setText(m56149Q(convAdditionalMatchInfo.verifyInviteTime) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user2.getPronoun() + "邀请你做认证");
                xdl0.m208344M(this.f36820j, true);
                qib0.f154691G.m102341Q0(this.f36821k, user.m60124fp().profileSmall());
                qib0.f154691G.m102341Q0(this.f36822l, user2.m60124fp().profileSmall());
                this.f36823m.setText(m56149Q(convAdditionalMatchInfo.likedByTime) + "  你完成了认证，" + user2.getPronoun() + "喜欢了你，匹配成功");
                return;
            }
            qib0.f154691G.m102341Q0(this.f36815e, user2.m60124fp().profileSmall());
            this.f36816f.setText(m56149Q(convAdditionalMatchInfo.verifyInviteTime) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user2.getPronoun() + "邀请你做认证");
            double d2 = convAdditionalMatchInfo.likeTime;
            double d3 = convAdditionalMatchInfo.likedByTime;
            VLinear vLinear = this.f36817g;
            if (d2 >= d3) {
                xdl0.m208344M(vLinear, true);
                qib0.f154691G.m102341Q0(this.f36818h, user.m60124fp().profileSmall());
                this.f36819i.setText(m56149Q(convAdditionalMatchInfo.likedByTime) + " 你完成了认证，" + user2.getPronoun() + "喜欢了你");
                xdl0.m208344M(this.f36820j, true);
                boolean z = convAdditionalMatchInfo.likeTime < convAdditionalMatchInfo.likedByTime;
                qib0.f154691G.m102341Q0(this.f36821k, user.m60124fp().profileSmall());
                qib0.f154691G.m102341Q0(this.f36822l, user2.m60124fp().profileSmall());
                this.f36823m.setText(String.format("%s %s%s了%s，匹配成功", m56149Q(z ? convAdditionalMatchInfo.likedByTime : convAdditionalMatchInfo.likeTime), z ? user2.getPronoun() : "你", "superliked".equals(z ? convAdditionalMatchInfo.otherState : convAdditionalMatchInfo.state) ? "超级喜欢" : "喜欢", z ? "你" : user2.getPronoun()));
                return;
            }
            xdl0.m208344M(vLinear, true);
            qib0.f154691G.m102341Q0(this.f36818h, user.m60124fp().profileSmall());
            VText_Bold vText_Bold2 = this.f36819i;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m56149Q(convAdditionalMatchInfo.likeTime));
            sb2.append(" 你");
            sb2.append("superliked".equals(convAdditionalMatchInfo.state) ? "超级喜欢" : "喜欢");
            sb2.append("了");
            sb2.append(user2.getPronoun());
            vText_Bold2.setText(sb2.toString());
            xdl0.m208344M(this.f36820j, true);
            qib0.f154691G.m102341Q0(this.f36821k, user.m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f36822l, user2.m60124fp().profileSmall());
            this.f36823m.setText(m56149Q(convAdditionalMatchInfo.likedByTime) + " 你完成了认证，" + user2.getPronoun() + "喜欢了你，匹配成功");
            return;
        }
        double d4 = convAdditionalMatchInfo.likedByTime;
        if (d >= d4) {
            xdl0.m208344M(this.f36814d, true);
            qib0.f154691G.m102341Q0(this.f36815e, user2.m60124fp().profileSmall());
            VText_Bold vText_Bold3 = this.f36816f;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m56149Q(convAdditionalMatchInfo.likedByTime));
            sb3.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb3.append(user2.getPronoun());
            sb3.append("superliked".equals(convAdditionalMatchInfo.otherState) ? "超级喜欢" : "喜欢");
            sb3.append("了你");
            vText_Bold3.setText(sb3.toString());
            xdl0.m208344M(this.f36817g, true);
            qib0.f154691G.m102341Q0(this.f36818h, user.m60124fp().profileSmall());
            this.f36819i.setText(m56149Q(convAdditionalMatchInfo.verifyInviteTime) + " 你邀请" + user2.getPronoun() + "做认证");
            xdl0.m208344M(this.f36820j, true);
            qib0.f154691G.m102341Q0(this.f36821k, user.m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f36822l, user2.m60124fp().profileSmall());
            this.f36823m.setText(m56149Q(convAdditionalMatchInfo.likeTime) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user2.getPronoun() + "完成了认证，帮你发出喜欢，匹配成功");
            return;
        }
        if (d4 >= convAdditionalMatchInfo.likeTime) {
            qib0.f154691G.m102341Q0(this.f36815e, user.m60124fp().profileSmall());
            this.f36816f.setText(m56149Q(convAdditionalMatchInfo.verifyInviteTime) + " 你邀请" + user2.getPronoun() + "做认证");
            if (convAdditionalMatchInfo.likeTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                xdl0.m208344M(this.f36817g, true);
                qib0.f154691G.m102341Q0(this.f36818h, user2.m60124fp().profileSmall());
                this.f36819i.setText(m56149Q(convAdditionalMatchInfo.likeTime) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user2.getPronoun() + "完成了认证，帮你发出喜欢");
            }
            xdl0.m208344M(this.f36820j, true);
            boolean z2 = convAdditionalMatchInfo.likeTime < convAdditionalMatchInfo.likedByTime;
            qib0.f154691G.m102341Q0(this.f36821k, user.m60124fp().profileSmall());
            qib0.f154691G.m102341Q0(this.f36822l, user2.m60124fp().profileSmall());
            this.f36823m.setText(String.format("%s %s%s了%s，匹配成功", m56149Q(convAdditionalMatchInfo.likedByTime), user2.getPronoun(), "superliked".equals(convAdditionalMatchInfo.otherState) ? "超级喜欢" : "喜欢", z2 ? "你" : user2.getPronoun()));
            return;
        }
        qib0.f154691G.m102341Q0(this.f36815e, user.m60124fp().profileSmall());
        this.f36816f.setText(m56149Q(convAdditionalMatchInfo.verifyInviteTime) + " 你邀请" + user2.getPronoun() + "做认证");
        xdl0.m208344M(this.f36817g, true);
        qib0.f154691G.m102341Q0(this.f36818h, user2.m60124fp().profileSmall());
        VText_Bold vText_Bold4 = this.f36819i;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(m56149Q(convAdditionalMatchInfo.likedByTime));
        sb4.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb4.append(user2.getPronoun());
        sb4.append("superliked".equals(convAdditionalMatchInfo.otherState) ? "超级喜欢" : "喜欢");
        sb4.append("了你");
        vText_Bold4.setText(sb4.toString());
        xdl0.m208344M(this.f36820j, true);
        qib0.f154691G.m102341Q0(this.f36821k, user.m60124fp().profileSmall());
        qib0.f154691G.m102341Q0(this.f36822l, user2.m60124fp().profileSmall());
        this.f36823m.setText(m56149Q(convAdditionalMatchInfo.likeTime) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user2.getPronoun() + "完成了认证，帮你发出喜欢，匹配成功");
    }

    /* JADX INFO: renamed from: S */
    public final void m56151S(Conversation conversation, User user, User user2, ConvAdditionalMatchInfo convAdditionalMatchInfo) {
        this.f36823m.setText(String.format("%s 通过%s匹配成功", m56149Q(convAdditionalMatchInfo.matchTime), convAdditionalMatchInfo.source));
        qib0.f154691G.m102341Q0(this.f36821k, user.m60124fp().profileSmall());
        qib0.f154691G.m102341Q0(this.f36822l, user2.m60124fp().profileSmall());
    }

    /* JADX INFO: renamed from: T */
    public final void m56152T(Conversation conversation, User user, User user2) {
        ConvAdditionalMatchInfo convAdditionalMatchInfo = conversation.additional.matchInfo;
        double d = convAdditionalMatchInfo.likeTime;
        double d2 = convAdditionalMatchInfo.likedByTime;
        boolean z = d < d2;
        VText_Bold vText_Bold = this.f36819i;
        if (!z) {
            d = d2;
        }
        vText_Bold.setText(String.format("%s %s%s了%s", m56149Q(d), z ? "你" : user2.getPronoun(), "superliked".equals(z ? convAdditionalMatchInfo.state : convAdditionalMatchInfo.otherState) ? "超级喜欢" : "喜欢", z ? user2.getPronoun() : "你"));
        this.f36823m.setText(String.format("%s %s%s了%s，匹配成功", m56149Q(z ? convAdditionalMatchInfo.likedByTime : convAdditionalMatchInfo.likeTime), z ? user2.getPronoun() : "你", "superliked".equals(z ? convAdditionalMatchInfo.otherState : convAdditionalMatchInfo.state) ? "超级喜欢" : "喜欢", z ? "你" : user2.getPronoun()));
        qib0.f154691G.m102341Q0(this.f36818h, (z ? user.m60124fp() : user2.m60124fp()).profileSmall());
        qib0.f154691G.m102341Q0(this.f36821k, user.m60124fp().profileSmall());
        qib0.f154691G.m102341Q0(this.f36822l, user2.m60124fp().profileSmall());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX INFO: renamed from: V */
    public void m56153V(@NonNull Conversation conversation, @NonNull User user, @NonNull User user2) {
        boolean z;
        ConversationAdditional conversationAdditional = conversation.additional;
        if (conversationAdditional == null || conversationAdditional.matchInfo == null) {
            return;
        }
        xdl0.m208344M(this.f36814d, false);
        ConvAdditionalMatchInfo convAdditionalMatchInfo = conversation.additional.matchInfo;
        if (!ura.m195053e().m195057d().mo33924t9() || !ura.m195053e().m195057d().mo33793Ze() || TextUtils.isEmpty(convAdditionalMatchInfo.verifyInviteOwner) || convAdditionalMatchInfo.verifyInviteTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            z = true;
        } else {
            boolean zEquals = TextUtils.equals(convAdditionalMatchInfo.verifyInviteOwner, CoreModule.m29931H().userId());
            double d = convAdditionalMatchInfo.verifyInviteTime;
            if (!zEquals ? d > convAdditionalMatchInfo.likedByTime : d > convAdditionalMatchInfo.likeTime) {
                z = true;
            } else {
                z = false;
            }
        }
        if (ura.m195053e().m195057d().mo33924t9() && ura.m195053e().m195057d().mo33793Ze() && TextUtils.isEmpty(convAdditionalMatchInfo.source) && z && !TextUtils.isEmpty(convAdditionalMatchInfo.verifyInviteOwner) && convAdditionalMatchInfo.verifyInviteTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            xdl0.m208344M(this.f36814d, true);
            hmb.m131701M(this.f36817g, false);
            hmb.m131701M(this.f36820j, false);
            m56150R(conversation, user2, user, convAdditionalMatchInfo);
            return;
        }
        if (!TextUtils.isEmpty(convAdditionalMatchInfo.source) && convAdditionalMatchInfo.matchTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            m56151S(conversation, user2, user, convAdditionalMatchInfo);
            hmb.m131701M(this.f36817g, false);
            hmb.m131701M(this.f36820j, true);
        } else {
            if (convAdditionalMatchInfo.likeTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || convAdditionalMatchInfo.likedByTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            m56152T(conversation, user2, user);
            hmb.m131701M(this.f36817g, true);
            hmb.m131701M(this.f36820j, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m56148P(this);
        if (ura.m195053e().m195057d().mo33699I4()) {
            this.f36819i.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f36823m.setTextColor(getResources().getColor(a1c0.f67155i));
            this.f36816f.setTextColor(getResources().getColor(a1c0.f67155i));
        }
    }

    public MessageMatchTimeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageMatchTimeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
