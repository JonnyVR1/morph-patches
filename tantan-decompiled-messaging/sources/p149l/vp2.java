package p149l;

import android.annotation.SuppressLint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import androidx.annotation.Nullable;
import com.google.protobuf.InterfaceC3419q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p046p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p046p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p046p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vp2<P extends InterfaceC3419q> extends n2w<P> {

    /* JADX INFO: renamed from: a */
    public final String f182443a = "no_care";

    /* JADX INFO: renamed from: b */
    public Boolean f182444b = Boolean.TRUE;

    /* JADX INFO: renamed from: c */
    public und f182445c;

    /* JADX INFO: renamed from: d */
    public LiveMessage f182446d;

    /* JADX INFO: renamed from: e */
    public LiveControlMessage f182447e;

    public vp2(und undVar) {
        this.f182445c = undVar;
    }

    @Override // p149l.sul, p149l.rul
    /* JADX INFO: renamed from: a */
    public final boolean mo133933a(InterfaceC3419q interfaceC3419q, ki60 ki60Var) {
        mo162321g(interfaceC3419q, ki60Var);
        mo102259v();
        return m199213s();
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: b */
    public abstract Class<P> mo94398b();

    @Override // p149l.n2w, p149l.sul
    /* JADX INFO: renamed from: d */
    public InterfaceC3419q mo157683d(LongLinkMessage.Msg msg) throws InvalidProtocolBufferException {
        if (msg.hasData()) {
            return li60.m149879b(mo94398b(), msg.getData());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "";
    }

    @Override // p149l.sul
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo94756f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON;
    }

    /* JADX INFO: renamed from: g */
    public void mo162321g(InterfaceC3419q interfaceC3419q, ki60 ki60Var) {
        mo102260y(ki60Var.f123271a.getMsgId(), ki60Var.f123272b, rzv.f161691j);
    }

    /* JADX INFO: renamed from: h */
    public List<String> mo115407h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final String m199204i(@Nullable LongLinkChatMessage.LiveChatMessage liveChatMessage, LiveMessage.ExtInfo extInfo) {
        if (liveChatMessage != null) {
            return liveChatMessage.getUserId();
        }
        return extInfo != null ? extInfo.messageUserId : "";
    }

    /* JADX INFO: renamed from: j */
    public final LiveMessage m199205j(String str, int i) {
        return m199206k(str, null, i);
    }

    /* JADX INFO: renamed from: k */
    public LiveMessage m199206k(String str, LongLinkChatMessage.LiveChatMessage liveChatMessage, int i) {
        String str2;
        if (liveChatMessage == null || liveChatMessage.getValue() == null) {
            l1w.m148203b(str, i, this.f182445c);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ypv.f199497e.getString(R$string.f47494r7));
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(uz00.f178934a, true), 0, spannableStringBuilder.length(), 34);
            return LiveMessage.create().setId(str).isErrorMessage(true).setCategory(LiveMessage.NORMAL_CHAT_CATEGORY).setSpan(vwb.m200324f0(spannableStringBuilder));
        }
        if (TextUtils.isEmpty(liveChatMessage.getUsername())) {
            str2 = "";
        } else {
            str2 = liveChatMessage.getUsername() + ":";
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2 + liveChatMessage.getValue());
        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(uz00.f178934a, true), 0, spannableStringBuilder2.length(), 34);
        return LiveMessage.create().setId(str).isErrorMessage(true).setSpan(vwb.m200324f0(spannableStringBuilder2)).setCategory(LiveMessage.NORMAL_CHAT_CATEGORY);
    }

    /* JADX INFO: renamed from: l */
    public LiveMessage m199207l(LongLinkChatMessage.LiveChatMessage liveChatMessage, String str, int i, LiveUserInfo liveUserInfo, String str2, Template.TemplateData templateData, LiveMessage.ExtInfo extInfo) {
        return m199208m(liveChatMessage, str, i, liveUserInfo, str2, templateData, extInfo, null, -1);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: m */
    public LiveMessage m199208m(LongLinkChatMessage.LiveChatMessage liveChatMessage, String str, int i, LiveUserInfo liveUserInfo, String str2, Template.TemplateData templateData, LiveMessage.ExtInfo extInfo, LongLinkChatMessage.SharedVoiceLiveInfo sharedVoiceLiveInfo, int i2) {
        und undVar = this.f182445c;
        if (undVar == null) {
            return m199205j(str, i);
        }
        BLiveTemplate bLiveTemplateM171773f = undVar.m194417d().m171773f(i);
        if (bLiveTemplateM171773f == null) {
            hfw.m130790a("[err]", "template 为空 ！！！！！ ID = " + i);
            return m199205j(str, i);
        }
        pwz pwzVarM194417d = this.f182445c.m194417d();
        long j = liveUserInfo == null ? 0L : liveUserInfo.grade;
        crc0 crc0Var = new crc0();
        crc0Var.f82197a = this.f182445c.m194414a();
        crc0Var.f82198b = str2;
        crc0Var.f82199c = j;
        crc0Var.f82200d = liveChatMessage;
        crc0Var.f82205i = m199204i(liveChatMessage, extInfo);
        if (liveUserInfo != null && !TextUtils.isEmpty(liveUserInfo.userIdentity)) {
            crc0Var.f82207k = liveUserInfo.userIdentity;
        }
        if (extInfo != null) {
            crc0Var.f82204h = extInfo.voiceGiftItems;
            crc0Var.f82203g = extInfo.buttonUserId;
            crc0Var.f82201e = extInfo.voiceFollowSource;
            crc0Var.f82206j = extInfo.isVoiceCallApplyMessage;
            BLiveAtUserInfo bLiveAtUserInfo = extInfo.atUserInfo;
            if (bLiveAtUserInfo != null) {
                crc0Var.f82202f = bLiveAtUserInfo.userId;
            }
            e5t.m114903g(templateData, bLiveTemplateM171773f, extInfo);
            extInfo.buttonScene = e5t.m114920x(bLiveTemplateM171773f);
            if (liveChatMessage != null) {
                crc0Var.f82207k = liveChatMessage.getUserIdentity();
            }
        }
        LiveMessage span = LiveMessage.create(bLiveTemplateM171773f, liveChatMessage == null ? null : liveChatMessage.getH5()).setCategory(bLiveTemplateM171773f.category).setSpan(pwzVarM194417d.m171772e(templateData, bLiveTemplateM171773f.format, crc0Var));
        LongLinkChatMessage.LiveChatMessage liveChatMessage2 = crc0Var.f82200d;
        if (liveChatMessage2 != null && liveChatMessage2.getExtInfo() != null && !TextUtils.isEmpty(crc0Var.f82200d.getExtInfo().getTraceInfo())) {
            span.traceJson = crc0Var.f82200d.getExtInfo().getTraceInfo();
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
    public LiveMessage m199209n(String str, int i, LongLinkLiveMessage.UserInfo userInfo, LongLinkLiveMessage.UserInfo userInfo2, Template.TemplateData templateData) {
        return m199210o(str, i, userInfo, userInfo2, templateData, null);
    }

    /* JADX INFO: renamed from: o */
    public LiveMessage m199210o(String str, int i, LongLinkLiveMessage.UserInfo userInfo, LongLinkLiveMessage.UserInfo userInfo2, Template.TemplateData templateData, LiveMessage.ExtInfo extInfo) {
        return m199207l(null, str, i, userInfo != null ? new LiveUserInfo(userInfo.getId(), userInfo.getName(), 0L) : null, userInfo2 != null ? userInfo2.getId() : null, templateData, extInfo);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m199211p(String str, String str2) {
        return TextUtils.equals(str2, "no_care") || TextUtils.equals(str, str2);
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo94400q(P p, String str);

    /* JADX INFO: renamed from: r */
    public boolean m199212r(String str, String str2, String str3) {
        und undVar;
        return (str == null || str2 == null || str3 == null || (undVar = this.f182445c) == null || undVar.m194414a() == null || !m199211p(this.f182445c.m194414a().f44323id, str3) || !m199211p(this.f182445c.m194414a().room.f44419id, str) || !m199211p(this.f182445c.m194414a().anchor.f44419id, str2)) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public boolean m199213s() {
        return true;
    }

    /* JADX INFO: renamed from: t */
    public void m199214t() {
        und undVar = this.f182445c;
        if (undVar == null || undVar.m194415b() == null || this.f182447e == null) {
            return;
        }
        this.f182445c.m194415b().onNext(this.f182447e);
        this.f182447e = null;
    }

    /* JADX INFO: renamed from: u */
    public void m199215u() {
        und undVar = this.f182445c;
        if (undVar == null || undVar.m194416c() == null || this.f182446d == null) {
            return;
        }
        this.f182445c.m194416c().m171441c(this.f182446d);
        this.f182446d = null;
    }

    /* JADX INFO: renamed from: v */
    public void mo102259v() {
        if (this.f182444b.booleanValue()) {
            m199215u();
            m199214t();
        }
    }

    /* JADX INFO: renamed from: w */
    public LiveControlMessage mo99811w(String str, P p, String str2) {
        return null;
    }

    /* JADX INFO: renamed from: x */
    public LiveMessage mo94401x(String str, P p, String str2) {
        return null;
    }

    /* JADX INFO: renamed from: y */
    public vp2 mo102260y(String str, InterfaceC3419q interfaceC3419q, String str2) {
        Boolean boolValueOf = Boolean.valueOf(mo94400q(interfaceC3419q, str2));
        this.f182444b = boolValueOf;
        if (!boolValueOf.booleanValue()) {
            hfw.m130790a("[live]msg_observer_handler", "ObserverHandler=" + toString() + ", message=" + interfaceC3419q);
        }
        toString();
        this.f182444b.toString();
        mo94756f().name();
        mo94399e();
        if (this.f182444b.booleanValue()) {
            this.f182447e = mo99811w(str, interfaceC3419q, str2);
            this.f182446d = mo94401x(str, interfaceC3419q, str2);
        }
        return this;
    }
}
