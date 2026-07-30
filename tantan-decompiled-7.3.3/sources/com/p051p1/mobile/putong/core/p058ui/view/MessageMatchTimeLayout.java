package com.p051p1.mobile.putong.core.p058ui.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ConvAdditionalMatchInfo;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationAdditional;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.data.User;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import p151v.VDraweeView;
import p151v.VLinear;
import p153l.bnl0;
import p153l.g9c0;
import p153l.gta;
import p153l.uqb0;
import p153l.vnb;
import p153l.xzz;

/* JADX INFO: loaded from: classes12.dex */
public class MessageMatchTimeLayout extends VLinear {

    /* JADX INFO: renamed from: c */
    public MessageMatchTimeLayout f37661c;

    /* JADX INFO: renamed from: d */
    public VLinear f37662d;

    /* JADX INFO: renamed from: e */
    public VDraweeView f37663e;

    /* JADX INFO: renamed from: f */
    public VText_Bold f37664f;

    /* JADX INFO: renamed from: g */
    public VLinear f37665g;

    /* JADX INFO: renamed from: h */
    public VDraweeView f37666h;

    /* JADX INFO: renamed from: i */
    public VText_Bold f37667i;

    /* JADX INFO: renamed from: j */
    public VLinear f37668j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f37669k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f37670l;

    /* JADX INFO: renamed from: m */
    public VText_Bold f37671m;

    public MessageMatchTimeLayout(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m57331P(View view) {
        xzz.m213823a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final String m57332Q(double d) {
        int i = Calendar.getInstance().get(1);
        Calendar calendar = Calendar.getInstance();
        long j = (long) d;
        calendar.setTimeInMillis(j);
        return (calendar.get(1) == i ? new SimpleDateFormat("M月d日 HH:mm", Locale.getDefault()) : new SimpleDateFormat("yyyy年M月d日 HH:mm", Locale.getDefault())).format(new Date(j));
    }

    /* JADX INFO: renamed from: R */
    public final void m57333R(Conversation conversation, User user, User user2, ConvAdditionalMatchInfo convAdditionalMatchInfo) {
        boolean zEquals = TextUtils.equals(convAdditionalMatchInfo.verifyInviteOwner, CoreModule.m30929H().userId());
        double d = convAdditionalMatchInfo.verifyInviteTime;
        if (!zEquals) {
            if (d >= convAdditionalMatchInfo.likeTime) {
                bnl0.m105524M(this.f37662d, true);
                uqb0.f180374G.m127125Q0(this.f37663e, user.m61308fp().profileSmall());
                VText_Bold vText_Bold = this.f37664f;
                StringBuilder sb = new StringBuilder();
                sb.append(m57332Q(convAdditionalMatchInfo.likeTime));
                sb.append(" 你");
                sb.append("superliked".equals(convAdditionalMatchInfo.state) ? "超级喜欢" : "喜欢");
                sb.append("了");
                sb.append(user2.getPronoun());
                vText_Bold.setText(sb.toString());
                bnl0.m105524M(this.f37665g, true);
                uqb0.f180374G.m127125Q0(this.f37666h, user2.m61308fp().profileSmall());
                this.f37667i.setText(m57332Q(convAdditionalMatchInfo.verifyInviteTime) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user2.getPronoun() + "邀请你做认证");
                bnl0.m105524M(this.f37668j, true);
                uqb0.f180374G.m127125Q0(this.f37669k, user.m61308fp().profileSmall());
                uqb0.f180374G.m127125Q0(this.f37670l, user2.m61308fp().profileSmall());
                this.f37671m.setText(m57332Q(convAdditionalMatchInfo.likedByTime) + "  你完成了认证，" + user2.getPronoun() + "喜欢了你，匹配成功");
                return;
            }
            uqb0.f180374G.m127125Q0(this.f37663e, user2.m61308fp().profileSmall());
            this.f37664f.setText(m57332Q(convAdditionalMatchInfo.verifyInviteTime) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user2.getPronoun() + "邀请你做认证");
            double d2 = convAdditionalMatchInfo.likeTime;
            double d3 = convAdditionalMatchInfo.likedByTime;
            VLinear vLinear = this.f37665g;
            if (d2 >= d3) {
                bnl0.m105524M(vLinear, true);
                uqb0.f180374G.m127125Q0(this.f37666h, user.m61308fp().profileSmall());
                this.f37667i.setText(m57332Q(convAdditionalMatchInfo.likedByTime) + " 你完成了认证，" + user2.getPronoun() + "喜欢了你");
                bnl0.m105524M(this.f37668j, true);
                boolean z = convAdditionalMatchInfo.likeTime < convAdditionalMatchInfo.likedByTime;
                uqb0.f180374G.m127125Q0(this.f37669k, user.m61308fp().profileSmall());
                uqb0.f180374G.m127125Q0(this.f37670l, user2.m61308fp().profileSmall());
                this.f37671m.setText(String.format("%s %s%s了%s，匹配成功", m57332Q(z ? convAdditionalMatchInfo.likedByTime : convAdditionalMatchInfo.likeTime), z ? user2.getPronoun() : "你", "superliked".equals(z ? convAdditionalMatchInfo.otherState : convAdditionalMatchInfo.state) ? "超级喜欢" : "喜欢", z ? "你" : user2.getPronoun()));
                return;
            }
            bnl0.m105524M(vLinear, true);
            uqb0.f180374G.m127125Q0(this.f37666h, user.m61308fp().profileSmall());
            VText_Bold vText_Bold2 = this.f37667i;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m57332Q(convAdditionalMatchInfo.likeTime));
            sb2.append(" 你");
            sb2.append("superliked".equals(convAdditionalMatchInfo.state) ? "超级喜欢" : "喜欢");
            sb2.append("了");
            sb2.append(user2.getPronoun());
            vText_Bold2.setText(sb2.toString());
            bnl0.m105524M(this.f37668j, true);
            uqb0.f180374G.m127125Q0(this.f37669k, user.m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f37670l, user2.m61308fp().profileSmall());
            this.f37671m.setText(m57332Q(convAdditionalMatchInfo.likedByTime) + " 你完成了认证，" + user2.getPronoun() + "喜欢了你，匹配成功");
            return;
        }
        double d4 = convAdditionalMatchInfo.likedByTime;
        if (d >= d4) {
            bnl0.m105524M(this.f37662d, true);
            uqb0.f180374G.m127125Q0(this.f37663e, user2.m61308fp().profileSmall());
            VText_Bold vText_Bold3 = this.f37664f;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m57332Q(convAdditionalMatchInfo.likedByTime));
            sb3.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
            sb3.append(user2.getPronoun());
            sb3.append("superliked".equals(convAdditionalMatchInfo.otherState) ? "超级喜欢" : "喜欢");
            sb3.append("了你");
            vText_Bold3.setText(sb3.toString());
            bnl0.m105524M(this.f37665g, true);
            uqb0.f180374G.m127125Q0(this.f37666h, user.m61308fp().profileSmall());
            this.f37667i.setText(m57332Q(convAdditionalMatchInfo.verifyInviteTime) + " 你邀请" + user2.getPronoun() + "做认证");
            bnl0.m105524M(this.f37668j, true);
            uqb0.f180374G.m127125Q0(this.f37669k, user.m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f37670l, user2.m61308fp().profileSmall());
            this.f37671m.setText(m57332Q(convAdditionalMatchInfo.likeTime) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user2.getPronoun() + "完成了认证，帮你发出喜欢，匹配成功");
            return;
        }
        if (d4 >= convAdditionalMatchInfo.likeTime) {
            uqb0.f180374G.m127125Q0(this.f37663e, user.m61308fp().profileSmall());
            this.f37664f.setText(m57332Q(convAdditionalMatchInfo.verifyInviteTime) + " 你邀请" + user2.getPronoun() + "做认证");
            if (convAdditionalMatchInfo.likeTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                bnl0.m105524M(this.f37665g, true);
                uqb0.f180374G.m127125Q0(this.f37666h, user2.m61308fp().profileSmall());
                this.f37667i.setText(m57332Q(convAdditionalMatchInfo.likeTime) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user2.getPronoun() + "完成了认证，帮你发出喜欢");
            }
            bnl0.m105524M(this.f37668j, true);
            boolean z2 = convAdditionalMatchInfo.likeTime < convAdditionalMatchInfo.likedByTime;
            uqb0.f180374G.m127125Q0(this.f37669k, user.m61308fp().profileSmall());
            uqb0.f180374G.m127125Q0(this.f37670l, user2.m61308fp().profileSmall());
            this.f37671m.setText(String.format("%s %s%s了%s，匹配成功", m57332Q(convAdditionalMatchInfo.likedByTime), user2.getPronoun(), "superliked".equals(convAdditionalMatchInfo.otherState) ? "超级喜欢" : "喜欢", z2 ? "你" : user2.getPronoun()));
            return;
        }
        uqb0.f180374G.m127125Q0(this.f37663e, user.m61308fp().profileSmall());
        this.f37664f.setText(m57332Q(convAdditionalMatchInfo.verifyInviteTime) + " 你邀请" + user2.getPronoun() + "做认证");
        bnl0.m105524M(this.f37665g, true);
        uqb0.f180374G.m127125Q0(this.f37666h, user2.m61308fp().profileSmall());
        VText_Bold vText_Bold4 = this.f37667i;
        StringBuilder sb4 = new StringBuilder();
        sb4.append(m57332Q(convAdditionalMatchInfo.likedByTime));
        sb4.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb4.append(user2.getPronoun());
        sb4.append("superliked".equals(convAdditionalMatchInfo.otherState) ? "超级喜欢" : "喜欢");
        sb4.append("了你");
        vText_Bold4.setText(sb4.toString());
        bnl0.m105524M(this.f37668j, true);
        uqb0.f180374G.m127125Q0(this.f37669k, user.m61308fp().profileSmall());
        uqb0.f180374G.m127125Q0(this.f37670l, user2.m61308fp().profileSmall());
        this.f37671m.setText(m57332Q(convAdditionalMatchInfo.likeTime) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + user2.getPronoun() + "完成了认证，帮你发出喜欢，匹配成功");
    }

    /* JADX INFO: renamed from: S */
    public final void m57334S(Conversation conversation, User user, User user2, ConvAdditionalMatchInfo convAdditionalMatchInfo) {
        this.f37671m.setText(String.format("%s 通过%s匹配成功", m57332Q(convAdditionalMatchInfo.matchTime), convAdditionalMatchInfo.source));
        uqb0.f180374G.m127125Q0(this.f37669k, user.m61308fp().profileSmall());
        uqb0.f180374G.m127125Q0(this.f37670l, user2.m61308fp().profileSmall());
    }

    /* JADX INFO: renamed from: T */
    public final void m57335T(Conversation conversation, User user, User user2) {
        ConvAdditionalMatchInfo convAdditionalMatchInfo = conversation.additional.matchInfo;
        double d = convAdditionalMatchInfo.likeTime;
        double d2 = convAdditionalMatchInfo.likedByTime;
        boolean z = d < d2;
        VText_Bold vText_Bold = this.f37667i;
        if (!z) {
            d = d2;
        }
        vText_Bold.setText(String.format("%s %s%s了%s", m57332Q(d), z ? "你" : user2.getPronoun(), "superliked".equals(z ? convAdditionalMatchInfo.state : convAdditionalMatchInfo.otherState) ? "超级喜欢" : "喜欢", z ? user2.getPronoun() : "你"));
        this.f37671m.setText(String.format("%s %s%s了%s，匹配成功", m57332Q(z ? convAdditionalMatchInfo.likedByTime : convAdditionalMatchInfo.likeTime), z ? user2.getPronoun() : "你", "superliked".equals(z ? convAdditionalMatchInfo.otherState : convAdditionalMatchInfo.state) ? "超级喜欢" : "喜欢", z ? "你" : user2.getPronoun()));
        uqb0.f180374G.m127125Q0(this.f37666h, (z ? user.m61308fp() : user2.m61308fp()).profileSmall());
        uqb0.f180374G.m127125Q0(this.f37669k, user.m61308fp().profileSmall());
        uqb0.f180374G.m127125Q0(this.f37670l, user2.m61308fp().profileSmall());
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0062  */
    /* JADX INFO: renamed from: V */
    public void m57336V(@NonNull Conversation conversation, @NonNull User user, @NonNull User user2) {
        boolean z;
        ConversationAdditional conversationAdditional = conversation.additional;
        if (conversationAdditional == null || conversationAdditional.matchInfo == null) {
            return;
        }
        bnl0.m105524M(this.f37662d, false);
        ConvAdditionalMatchInfo convAdditionalMatchInfo = conversation.additional.matchInfo;
        if (!gta.m132210e().m132214d().mo34927t9() || !gta.m132210e().m132214d().mo34796Ze() || TextUtils.isEmpty(convAdditionalMatchInfo.verifyInviteOwner) || convAdditionalMatchInfo.verifyInviteTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            z = true;
        } else {
            boolean zEquals = TextUtils.equals(convAdditionalMatchInfo.verifyInviteOwner, CoreModule.m30929H().userId());
            double d = convAdditionalMatchInfo.verifyInviteTime;
            if (!zEquals ? d > convAdditionalMatchInfo.likedByTime : d > convAdditionalMatchInfo.likeTime) {
                z = true;
            } else {
                z = false;
            }
        }
        if (gta.m132210e().m132214d().mo34927t9() && gta.m132210e().m132214d().mo34796Ze() && TextUtils.isEmpty(convAdditionalMatchInfo.source) && z && !TextUtils.isEmpty(convAdditionalMatchInfo.verifyInviteOwner) && convAdditionalMatchInfo.verifyInviteTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            bnl0.m105524M(this.f37662d, true);
            vnb.m201946M(this.f37665g, false);
            vnb.m201946M(this.f37668j, false);
            m57333R(conversation, user2, user, convAdditionalMatchInfo);
            return;
        }
        if (!TextUtils.isEmpty(convAdditionalMatchInfo.source) && convAdditionalMatchInfo.matchTime > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
            m57334S(conversation, user2, user, convAdditionalMatchInfo);
            vnb.m201946M(this.f37665g, false);
            vnb.m201946M(this.f37668j, true);
        } else {
            if (convAdditionalMatchInfo.likeTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || convAdditionalMatchInfo.likedByTime <= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE) {
                return;
            }
            m57335T(conversation, user2, user);
            vnb.m201946M(this.f37665g, true);
            vnb.m201946M(this.f37668j, true);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57331P(this);
        if (gta.m132210e().m132214d().mo34702I4()) {
            this.f37667i.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f37671m.setTextColor(getResources().getColor(g9c0.f102819i));
            this.f37664f.setTextColor(getResources().getColor(g9c0.f102819i));
        }
    }

    public MessageMatchTimeLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MessageMatchTimeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
