package p153l;

import android.annotation.SuppressLint;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import androidx.annotation.Nullable;
import com.google.protobuf.InterfaceC3442q;
import com.google.protobuf.InvalidProtocolBufferException;
import com.p051p1.mobile.longlink.msg.connector.LongLinkMessage;
import com.p051p1.mobile.longlink.msg.livechat.LongLinkChatMessage;
import com.p051p1.mobile.longlink.msg.liveroom.LongLinkLiveMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveAtUserInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveControlMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveUserInfo;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mq2<P extends InterfaceC3442q> extends l4w<P> {

    /* JADX INFO: renamed from: a */
    public final String f137991a = "no_care";

    /* JADX INFO: renamed from: b */
    public Boolean f137992b = Boolean.TRUE;

    /* JADX INFO: renamed from: c */
    public zod f137993c;

    /* JADX INFO: renamed from: d */
    public LiveMessage f137994d;

    /* JADX INFO: renamed from: e */
    public LiveControlMessage f137995e;

    public mq2(zod zodVar) {
        this.f137993c = zodVar;
    }

    @Override // p153l.fxl, p153l.exl
    /* JADX INFO: renamed from: a */
    public final boolean mo123068a(InterfaceC3442q interfaceC3442q, pq60 pq60Var) {
        mo159451g(interfaceC3442q, pq60Var);
        mo145145v();
        return m159461s();
    }

    @Override // p153l.fxl
    /* JADX INFO: renamed from: b */
    public abstract Class<P> mo95510b();

    @Override // p153l.l4w, p153l.fxl
    /* JADX INFO: renamed from: d */
    public InterfaceC3442q mo127983d(LongLinkMessage.Msg msg) throws InvalidProtocolBufferException {
        if (msg.hasData()) {
            return qq60.m177481b(mo95510b(), msg.getData());
        }
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "";
    }

    @Override // p153l.fxl
    /* JADX INFO: renamed from: f */
    public LongLinkMessage.MsgTypeEnum mo102648f() {
        return LongLinkMessage.MsgTypeEnum.MSG_TYPE_COMMON;
    }

    /* JADX INFO: renamed from: g */
    public void mo159451g(InterfaceC3442q interfaceC3442q, pq60 pq60Var) {
        mo145146y(pq60Var.f153643a.getMsgId(), pq60Var.f153644b, p1w.f150202j);
    }

    /* JADX INFO: renamed from: h */
    public List<String> mo116845h() {
        return null;
    }

    /* JADX INFO: renamed from: i */
    public final String m159452i(@Nullable LongLinkChatMessage.LiveChatMessage liveChatMessage, LiveMessage.ExtInfo extInfo) {
        if (liveChatMessage != null) {
            return liveChatMessage.getUserId();
        }
        return extInfo != null ? extInfo.messageUserId : "";
    }

    /* JADX INFO: renamed from: j */
    public final LiveMessage m159453j(String str, int i) {
        return m159454k(str, null, i);
    }

    /* JADX INFO: renamed from: k */
    public LiveMessage m159454k(String str, LongLinkChatMessage.LiveChatMessage liveChatMessage, int i) {
        String str2;
        if (liveChatMessage == null || liveChatMessage.getValue() == null) {
            j3w.m143366b(str, i, this.f137993c);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(zrv.f205803e.getString(R$string.f48342r7));
            spannableStringBuilder.setSpan(new AbsoluteSizeSpan(e810.f92500a, true), 0, spannableStringBuilder.length(), 34);
            return LiveMessage.create().setId(str).isErrorMessage(true).setCategory(LiveMessage.NORMAL_CHAT_CATEGORY).setSpan(jyb.m147507f0(spannableStringBuilder));
        }
        if (TextUtils.isEmpty(liveChatMessage.getUsername())) {
            str2 = "";
        } else {
            str2 = liveChatMessage.getUsername() + ":";
        }
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(str2 + liveChatMessage.getValue());
        spannableStringBuilder2.setSpan(new AbsoluteSizeSpan(e810.f92500a, true), 0, spannableStringBuilder2.length(), 34);
        return LiveMessage.create().setId(str).isErrorMessage(true).setSpan(jyb.m147507f0(spannableStringBuilder2)).setCategory(LiveMessage.NORMAL_CHAT_CATEGORY);
    }

    /* JADX INFO: renamed from: l */
    public LiveMessage m159455l(LongLinkChatMessage.LiveChatMessage liveChatMessage, String str, int i, LiveUserInfo liveUserInfo, String str2, Template.TemplateData templateData, LiveMessage.ExtInfo extInfo) {
        return m159456m(liveChatMessage, str, i, liveUserInfo, str2, templateData, extInfo, null, -1);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: m */
    public LiveMessage m159456m(LongLinkChatMessage.LiveChatMessage liveChatMessage, String str, int i, LiveUserInfo liveUserInfo, String str2, Template.TemplateData templateData, LiveMessage.ExtInfo extInfo, LongLinkChatMessage.SharedVoiceLiveInfo sharedVoiceLiveInfo, int i2) {
        zod zodVar = this.f137993c;
        if (zodVar == null) {
            return m159453j(str, i);
        }
        BLiveTemplate bLiveTemplateM157079f = zodVar.m220736d().m157079f(i);
        if (bLiveTemplateM157079f == null) {
            fhw.m125605a("[err]", "template 为空 ！！！！！ ID = " + i);
            return m159453j(str, i);
        }
        m500 m500VarM220736d = this.f137993c.m220736d();
        long j = liveUserInfo == null ? 0L : liveUserInfo.grade;
        hzc0 hzc0Var = new hzc0();
        hzc0Var.f112221a = this.f137993c.m220733a();
        hzc0Var.f112222b = str2;
        hzc0Var.f112223c = j;
        hzc0Var.f112224d = liveChatMessage;
        hzc0Var.f112229i = m159452i(liveChatMessage, extInfo);
        if (liveUserInfo != null && !TextUtils.isEmpty(liveUserInfo.userIdentity)) {
            hzc0Var.f112231k = liveUserInfo.userIdentity;
        }
        if (extInfo != null) {
            hzc0Var.f112228h = extInfo.voiceGiftItems;
            hzc0Var.f112227g = extInfo.buttonUserId;
            hzc0Var.f112225e = extInfo.voiceFollowSource;
            hzc0Var.f112230j = extInfo.isVoiceCallApplyMessage;
            BLiveAtUserInfo bLiveAtUserInfo = extInfo.atUserInfo;
            if (bLiveAtUserInfo != null) {
                hzc0Var.f112226f = bLiveAtUserInfo.userId;
            }
            f7t.m124487g(templateData, bLiveTemplateM157079f, extInfo);
            extInfo.buttonScene = f7t.m124504x(bLiveTemplateM157079f);
            if (liveChatMessage != null) {
                hzc0Var.f112231k = liveChatMessage.getUserIdentity();
            }
        }
        LiveMessage span = LiveMessage.create(bLiveTemplateM157079f, liveChatMessage == null ? null : liveChatMessage.getH5()).setCategory(bLiveTemplateM157079f.category).setSpan(m500VarM220736d.m157078e(templateData, bLiveTemplateM157079f.format, hzc0Var));
        LongLinkChatMessage.LiveChatMessage liveChatMessage2 = hzc0Var.f112224d;
        if (liveChatMessage2 != null && liveChatMessage2.getExtInfo() != null && !TextUtils.isEmpty(hzc0Var.f112224d.getExtInfo().getTraceInfo())) {
            span.traceJson = hzc0Var.f112224d.getExtInfo().getTraceInfo();
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
    public LiveMessage m159457n(String str, int i, LongLinkLiveMessage.UserInfo userInfo, LongLinkLiveMessage.UserInfo userInfo2, Template.TemplateData templateData) {
        return m159458o(str, i, userInfo, userInfo2, templateData, null);
    }

    /* JADX INFO: renamed from: o */
    public LiveMessage m159458o(String str, int i, LongLinkLiveMessage.UserInfo userInfo, LongLinkLiveMessage.UserInfo userInfo2, Template.TemplateData templateData, LiveMessage.ExtInfo extInfo) {
        return m159455l(null, str, i, userInfo != null ? new LiveUserInfo(userInfo.getId(), userInfo.getName(), 0L) : null, userInfo2 != null ? userInfo2.getId() : null, templateData, extInfo);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m159459p(String str, String str2) {
        return TextUtils.equals(str2, "no_care") || TextUtils.equals(str, str2);
    }

    /* JADX INFO: renamed from: q */
    public abstract boolean mo95512q(P p, String str);

    /* JADX INFO: renamed from: r */
    public boolean m159460r(String str, String str2, String str3) {
        zod zodVar;
        return (str == null || str2 == null || str3 == null || (zodVar = this.f137993c) == null || zodVar.m220733a() == null || !m159459p(this.f137993c.m220733a().f45171id, str3) || !m159459p(this.f137993c.m220733a().room.f45267id, str) || !m159459p(this.f137993c.m220733a().anchor.f45267id, str2)) ? false : true;
    }

    /* JADX INFO: renamed from: s */
    public boolean m159461s() {
        return true;
    }

    /* JADX INFO: renamed from: t */
    public void m159462t() {
        zod zodVar = this.f137993c;
        if (zodVar == null || zodVar.m220734b() == null || this.f137995e == null) {
            return;
        }
        this.f137993c.m220734b().onNext(this.f137995e);
        this.f137995e = null;
    }

    /* JADX INFO: renamed from: u */
    public void m159463u() {
        zod zodVar = this.f137993c;
        if (zodVar == null || zodVar.m220735c() == null || this.f137994d == null) {
            return;
        }
        this.f137993c.m220735c().m113046c(this.f137994d);
        this.f137994d = null;
    }

    /* JADX INFO: renamed from: v */
    public void mo145145v() {
        if (this.f137992b.booleanValue()) {
            m159463u();
            m159462t();
        }
    }

    /* JADX INFO: renamed from: w */
    public LiveControlMessage mo95513w(String str, P p, String str2) {
        return null;
    }

    /* JADX INFO: renamed from: x */
    public LiveMessage mo113619x(String str, P p, String str2) {
        return null;
    }

    /* JADX INFO: renamed from: y */
    public mq2 mo145146y(String str, InterfaceC3442q interfaceC3442q, String str2) {
        Boolean boolValueOf = Boolean.valueOf(mo95512q(interfaceC3442q, str2));
        this.f137992b = boolValueOf;
        if (!boolValueOf.booleanValue()) {
            fhw.m125605a("[live]msg_observer_handler", "ObserverHandler=" + toString() + ", message=" + interfaceC3442q);
        }
        toString();
        this.f137992b.toString();
        mo102648f().name();
        mo95511e();
        if (this.f137992b.booleanValue()) {
            this.f137995e = mo95513w(str, interfaceC3442q, str2);
            this.f137994d = mo113619x(str, interfaceC3442q, str2);
        }
        return this;
    }
}
