package p002l;

import android.annotation.SuppressLint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import androidx.annotation.Nullable;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.q;
import com.p000p1.mobile.putong.live.livingroom.R$string;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import com.p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p1.mobile.putong.live.base.data.BLiveTemplate;
import java.util.List;
import l.hfw;
import l.ki60;
import l.li60;
import l.n2w;
import l.vwb;
import l.ypv;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class vp2<P extends q> extends n2w<P> {

    /* JADX INFO: renamed from: a */
    public final String f21257a = "no_care";

    /* JADX INFO: renamed from: b */
    public Boolean f21258b = Boolean.TRUE;

    /* JADX INFO: renamed from: c */
    public und f21259c;

    /* JADX INFO: renamed from: d */
    public LiveMessage f21260d;

    /* JADX INFO: renamed from: e */
    public LiveControlMessage f21261e;

    public vp2(und undVar) {
        this.f21259c = undVar;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m24085a(q qVar, ki60 ki60Var) {
        mo19191g(qVar, ki60Var);
        mo10389v();
        return m24096s();
    }

    /* JADX INFO: renamed from: b */
    public abstract Class<P> mo9244b();

    /* JADX INFO: renamed from: d */
    public q m24086d(LongLinkMessage.Msg msg) throws InvalidProtocolBufferException {
        if (msg.hasData()) {
            return li60.b(mo9244b(), msg.getData());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "";
    }

    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo13261f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON;
    }

    /* JADX INFO: renamed from: g */
    public void mo19191g(q qVar, ki60 ki60Var) {
        mo10390y(ki60Var.a.getMsgId(), ki60Var.b, rzv.f18731j);
    }

    /* JADX INFO: renamed from: h */
    public List<String> mo12303h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final String m24087i(@Nullable LongLinkChatMessage.LiveChatMessage liveChatMessage, LiveMessage.ExtInfo extInfo) {
        if (liveChatMessage != null) {
            return liveChatMessage.getUserId();
        }
        return extInfo != null ? extInfo.messageUserId : "";
    }

    /* JADX INFO: renamed from: j */
    public final LiveMessage m24088j(String str, int i) {
        return m24089k(str, null, i);
    }

    /* JADX INFO: renamed from: k */
    public LiveMessage m24089k(String str, LongLinkChatMessage.LiveChatMessage liveChatMessage, int i) {
        String str2;
        if (liveChatMessage == null || liveChatMessage.getValue() == null) {
            l1w.m16937b(str, i, this.f21259c);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ypv.e.getString(R$string.f3536r7));
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(uz00.f20886a, true), 0, spannableStringBuilder.length(), 34);
            return LiveMessage.create().setId(str).isErrorMessage(true).setCategory(LiveMessage.NORMAL_CHAT_CATEGORY).setSpan(vwb.f0(new SpannableStringBuilder[]{spannableStringBuilder}));
        }
        if (TextUtils.isEmpty(liveChatMessage.getUsername())) {
            str2 = "";
        } else {
            str2 = liveChatMessage.getUsername() + ":";
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2 + liveChatMessage.getValue());
        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(uz00.f20886a, true), 0, spannableStringBuilder2.length(), 34);
        return LiveMessage.create().setId(str).isErrorMessage(true).setSpan(vwb.f0(new SpannableStringBuilder[]{spannableStringBuilder2})).setCategory(LiveMessage.NORMAL_CHAT_CATEGORY);
    }

    /* JADX INFO: renamed from: l */
    public LiveMessage m24090l(LongLinkChatMessage.LiveChatMessage liveChatMessage, String str, int i, LiveUserInfo liveUserInfo, String str2, Template.TemplateData templateData, LiveMessage.ExtInfo extInfo) {
        return m24091m(liveChatMessage, str, i, liveUserInfo, str2, templateData, extInfo, null, -1);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: m */
    public LiveMessage m24091m(LongLinkChatMessage.LiveChatMessage liveChatMessage, String str, int i, LiveUserInfo liveUserInfo, String str2, Template.TemplateData templateData, LiveMessage.ExtInfo extInfo, LongLinkChatMessage.SharedVoiceLiveInfo sharedVoiceLiveInfo, int i2) {
        und undVar = this.f21259c;
        if (undVar == null) {
            return m24088j(str, i);
        }
        BLiveTemplate bLiveTemplateM20739f = undVar.m23568d().m20739f(i);
        if (bLiveTemplateM20739f == null) {
            hfw.a("[err]", "template 为空 ！！！！！ ID = " + i);
            return m24088j(str, i);
        }
        pwz pwzVarM23568d = this.f21259c.m23568d();
        long j = liveUserInfo == null ? 0L : liveUserInfo.grade;
        crc0 crc0Var = new crc0();
        crc0Var.f8911a = this.f21259c.m23565a();
        crc0Var.f8912b = str2;
        crc0Var.f8913c = j;
        crc0Var.f8914d = liveChatMessage;
        crc0Var.f8919i = m24087i(liveChatMessage, extInfo);
        if (liveUserInfo != null && !TextUtils.isEmpty(liveUserInfo.userIdentity)) {
            crc0Var.f8921k = liveUserInfo.userIdentity;
        }
        if (extInfo != null) {
            crc0Var.f8918h = extInfo.voiceGiftItems;
            crc0Var.f8917g = extInfo.buttonUserId;
            crc0Var.f8915e = extInfo.voiceFollowSource;
            crc0Var.f8920j = extInfo.isVoiceCallApplyMessage;
            BLiveAtUserInfo bLiveAtUserInfo = extInfo.atUserInfo;
            if (bLiveAtUserInfo != null) {
                crc0Var.f8916f = bLiveAtUserInfo.userId;
            }
            e5t.m12202g(templateData, bLiveTemplateM20739f, extInfo);
            extInfo.buttonScene = e5t.m12219x(bLiveTemplateM20739f);
            if (liveChatMessage != null) {
                crc0Var.f8921k = liveChatMessage.getUserIdentity();
            }
        }
        LiveMessage span = LiveMessage.create(bLiveTemplateM20739f, liveChatMessage == null ? null : liveChatMessage.getH5()).setCategory(bLiveTemplateM20739f.category).setSpan(pwzVarM23568d.m20738e(templateData, bLiveTemplateM20739f.format, crc0Var));
        LongLinkChatMessage.LiveChatMessage liveChatMessage2 = crc0Var.f8914d;
        if (liveChatMessage2 != null && liveChatMessage2.getExtInfo() != null && !TextUtils.isEmpty(crc0Var.f8914d.getExtInfo().getTraceInfo())) {
            span.traceJson = crc0Var.f8914d.getExtInfo().getTraceInfo();
        }
        if (i2 != -1) {
            span.setCategory(i2);
        }
        if (extInfo != null) {
            span.setExtInfo(extInfo);
        }
        if (liveUserInfo != null) {
            span.setUser(liveUserInfo);
        }
        if (liveChatMessage != null) {
            span.setSeq(liveChatMessage.getSeq());
            span.setChatShadeConfig(liveChatMessage.getChatShadingConfig());
            span.setCreateTime(liveChatMessage.getCreatedTime());
            span.setPreSeq(liveChatMessage.getPreSeq());
            span.setPreMessageTime(liveChatMessage.getPreTimestamp());
            span.setUserIdentity(liveChatMessage.getUserIdentity());
        }
        span.setId(str);
        span.setSharedVoiceLiveInfo(sharedVoiceLiveInfo);
        if (liveChatMessage != null && liveChatMessage.hasExtInfo()) {
            LongLinkChatMessage.LiveChatMessageExtInfo extInfo2 = liveChatMessage.getExtInfo();
            if (extInfo2.getGroupControl()) {
                span.setLiveMessageType(extInfo2.getGroupType());
            }
            span.setOpenGradientFlow(extInfo2.getColorfulMode());
        }
        if (liveChatMessage != null) {
            span.setMessageContent(liveChatMessage.getValue());
            span.source = liveChatMessage.getSource();
        }
        return span;
    }

    /* JADX INFO: renamed from: n */
    public LiveMessage m24092n(String str, int i, LongLinkLiveMessage.UserInfo userInfo, LongLinkLiveMessage.UserInfo userInfo2, Template.TemplateData templateData) {
        return m24093o(str, i, userInfo, userInfo2, templateData, null);
    }

    /* JADX INFO: renamed from: o */
    public LiveMessage m24093o(String str, int i, LongLinkLiveMessage.UserInfo userInfo, LongLinkLiveMessage.UserInfo userInfo2, Template.TemplateData templateData, LiveMessage.ExtInfo extInfo) {
        return m24090l(null, str, i, userInfo != null ? new LiveUserInfo(userInfo.getId(), userInfo.getName(), 0L) : null, userInfo2 != null ? userInfo2.getId() : null, templateData, extInfo);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m24094p(String str, String str2) {
        return TextUtils.equals(str2, "no_care") || TextUtils.equals(str, str2);
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo9246q(P p, String str);

    /* JADX INFO: renamed from: r */
    public boolean m24095r(String str, String str2, String str3) {
        und undVar;
        return (str == null || str2 == null || str3 == null || (undVar = this.f21259c) == null || undVar.m23565a() == null || !m24094p(this.f21259c.m23565a().id, str3) || !m24094p(this.f21259c.m23565a().room.id, str) || !m24094p(this.f21259c.m23565a().anchor.id, str2)) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public boolean m24096s() {
        return true;
    }

    /* JADX INFO: renamed from: t */
    public void m24097t() {
        und undVar = this.f21259c;
        if (undVar == null || undVar.m23566b() == null || this.f21261e == null) {
            return;
        }
        this.f21259c.m23566b().onNext(this.f21261e);
        this.f21261e = null;
    }

    /* JADX INFO: renamed from: u */
    public void m24098u() {
        und undVar = this.f21259c;
        if (undVar == null || undVar.m23567c() == null || this.f21260d == null) {
            return;
        }
        this.f21259c.m23567c().m20686c(this.f21260d);
        this.f21260d = null;
    }

    /* JADX INFO: renamed from: v */
    public void mo10389v() {
        if (this.f21258b.booleanValue()) {
            m24098u();
            m24097t();
        }
    }

    /* JADX INFO: renamed from: w */
    public LiveControlMessage mo10148w(String str, P p, String str2) {
        return null;
    }

    /* JADX INFO: renamed from: x */
    public LiveMessage mo9247x(String str, P p, String str2) {
        return null;
    }

    /* JADX INFO: renamed from: y */
    public vp2 mo10390y(String str, q qVar, String str2) {
        Boolean boolValueOf = Boolean.valueOf(mo9246q(qVar, str2));
        this.f21258b = boolValueOf;
        if (!boolValueOf.booleanValue()) {
            hfw.a("[live]msg_observer_handler", "ObserverHandler=" + toString() + ", message=" + qVar);
        }
        toString();
        this.f21258b.toString();
        mo13261f().name();
        mo9245e();
        if (this.f21258b.booleanValue()) {
            this.f21261e = mo10148w(str, qVar, str2);
            this.f21260d = mo9247x(str, qVar, str2);
        }
        return this;
    }
}
