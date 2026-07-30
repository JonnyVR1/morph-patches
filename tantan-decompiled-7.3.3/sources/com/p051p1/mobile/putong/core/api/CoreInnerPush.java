package com.p051p1.mobile.putong.core.api;

import android.graphics.Color;
import android.text.TextUtils;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageAdditionalData;
import com.p051p1.mobile.putong.core.data.MessageAdditionalDataCompliment;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.data.LiveRegionTag;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.fo0;
import p153l.gta;
import p153l.jyb;
import p153l.lyh0;
import p153l.psd0;
import p153l.pzi0;
import p153l.q8g0;
import p153l.x95;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class CoreInnerPush {

    /* JADX INFO: renamed from: a */
    public C22508b<C4867a> f19912a = C22508b.m222767b();

    /* JADX INFO: renamed from: b */
    public HashMap<String, Boolean> f19913b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final HashSet<String> f19914c = new HashSet<>();

    /* JADX INFO: renamed from: d */
    public long f19915d;

    public enum InnerPushLayoutType {
        DEFAULT_MESSAGE,
        COUNTDOWN_CONV_CREATE
    }

    public enum InnerPushType {
        DEFAULT,
        NEW_MSG
    }

    public CoreInnerPush() {
        this.f19915d = -1L;
        this.f19915d = pzi0.m174454o();
    }

    /* JADX INFO: renamed from: d */
    public C22421c<C4867a> m31125d() {
        return this.f19912a.asObservable().observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m31126e(Message message, User user) {
        if (NullChecker.m82486a(user)) {
            C4867a c4867aMo34894o8 = gta.m132210e().m132214d().mo34894o8(user, message);
            c4867aMo34894o8.m31137c(InnerPushType.NEW_MSG);
            this.f19912a.onNext(c4867aMo34894o8);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m31127f(Message message, User user) {
        if (NullChecker.m82486a(user)) {
            this.f19912a.onNext(gta.m132210e().m132214d().mo34817da(user, message));
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m31128g(Message message, User user) {
        if (!NullChecker.m82486a(user) || user.isTeamAccount()) {
            return;
        }
        String str = TextUtils.isEmpty(user.publicId) ? message.cid : user.publicId;
        HashMap map = new HashMap();
        map.put("sender_name", user.name);
        map.put("match_id", str);
        map.put("msg_type", m31129h(message));
        x95.INSTANCE.m209793m("Receive new message", map);
    }

    /* JADX INFO: renamed from: h */
    public final String m31129h(Message message) {
        if (TEnum.equals(message.messageType, "text")) {
            return "text";
        }
        if (TEnum.equals(message.messageType, "audio")) {
            return "audio";
        }
        if (TEnum.equals(message.messageType, "picture")) {
            return ReminderAction.photo;
        }
        return TEnum.equals(message.messageType, "video") ? "video" : LiveRegionTag.others;
    }

    /* JADX INFO: renamed from: i */
    public void m31130i(final Message message) {
        MessageAdditionalData messageAdditionalData;
        MessageAdditionalDataCompliment messageAdditionalDataCompliment;
        if (!message.isGroupMessage() && System.nanoTime() - message.localCreatedTime < 5000000000L) {
            long j = this.f19915d;
            if ((j <= 0 || message.createdTime >= j) && !this.f19913b.containsKey(message.f56859id)) {
                this.f19913b.put(message.f56859id, Boolean.TRUE);
                if ((!TEnum.equals(message.messageType, "picture_compliment") || (messageAdditionalData = message.additionalData) == null || (messageAdditionalDataCompliment = messageAdditionalData.compliment) == null || !"free".equals(messageAdditionalDataCompliment.type)) && !message.isGroupMessage() && TextUtils.isEmpty(message.localGreetingId)) {
                    CoreModule.f18264c.f20381e0.m116491Ma(message.cid).take(1).first().subscribe(new y20() { // from class: l.h49
                        @Override // p153l.y20
                        public final void call(Object obj) {
                            this.f107768a.m31126e(message, (User) obj);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m31131j(final Message message) {
        if (message.isGroupMessage() || !TextUtils.isEmpty(message.localGreetingId)) {
            return;
        }
        CoreModule.f18264c.f20381e0.m116491Ma(message.getHostId()).take(1).first().subscribe(new y20() { // from class: l.g49
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f102155a.m31127f(message, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m31132k() {
        C4867a c4867a = new C4867a();
        c4867a.f19916a = "消息已发送消息已发送消息已发送";
        c4867a.f19917b = "消息已发送消息已发送消息已发送消息已发送消息已发送消息已发送消息已发送消息已发送消息已发送";
        c4867a.f19918c = CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted();
        this.f19912a.onNext(c4867a);
    }

    /* JADX INFO: renamed from: l */
    public void m31133l() {
        C4867a c4867a = new C4867a();
        c4867a.m31136b(true);
        c4867a.f19922g = "test_countdown";
        c4867a.f19916a = q8g0.m175796b0(((pzi0.m174454o() % 10) + "").concat("特邀嘉宾 已帮你找到有缘的她，快去看看吧"), jyb.m147507f0("特邀嘉宾"), Color.parseColor("#ff5c31"), lyh0.m156283c(2));
        c4867a.m31135a(InnerPushLayoutType.COUNTDOWN_CONV_CREATE).m31138d(jyb.m147507f0(TabName.Card, TabName.Msg, TabName.Moment, TabName.Me));
        c4867a.f19918c = CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall().formatted();
        this.f19912a.onNext(c4867a);
    }

    /* JADX INFO: renamed from: m */
    public void m31134m(final Message message) {
        if (message.isGroupMessage() || TextUtils.isEmpty(message.f56859id) || this.f19914c.contains(message.f56859id) || !TextUtils.isEmpty(message.localGreetingId) || TEnum.equals(message.messageType, "picture_compliment")) {
            return;
        }
        this.f19914c.add(message.f56859id);
        CoreModule.f18264c.f20381e0.m116491Ma(message.cid).take(1).first().subscribe(psd0.m173596G(new y20() { // from class: l.i49
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112851a.m31128g(message, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreInnerPush$a */
    public static class C4867a {

        /* JADX INFO: renamed from: a */
        public CharSequence f19916a;

        /* JADX INFO: renamed from: b */
        public CharSequence f19917b;

        /* JADX INFO: renamed from: c */
        public String f19918c;

        /* JADX INFO: renamed from: d */
        public int f19919d;

        /* JADX INFO: renamed from: e */
        public boolean f19920e;

        /* JADX INFO: renamed from: f */
        public String f19921f;

        /* JADX INFO: renamed from: g */
        public String f19922g;

        /* JADX INFO: renamed from: h */
        public InnerPushType f19923h;

        /* JADX INFO: renamed from: i */
        public List<TabName> f19924i;

        /* JADX INFO: renamed from: j */
        public InnerPushLayoutType f19925j;

        /* JADX INFO: renamed from: k */
        public long f19926k;

        /* JADX INFO: renamed from: l */
        public boolean f19927l;

        public C4867a(String str) {
            this.f19919d = -1;
            this.f19920e = false;
            this.f19922g = null;
            this.f19923h = InnerPushType.DEFAULT;
            this.f19924i = jyb.m147482M(TabName.Card);
            this.f19925j = InnerPushLayoutType.DEFAULT_MESSAGE;
            this.f19926k = 3000L;
            this.f19927l = false;
            this.f19922g = str;
        }

        /* JADX INFO: renamed from: a */
        public C4867a m31135a(InnerPushLayoutType innerPushLayoutType) {
            this.f19925j = innerPushLayoutType;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C4867a m31136b(boolean z) {
            this.f19927l = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C4867a m31137c(InnerPushType innerPushType) {
            this.f19923h = innerPushType;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C4867a m31138d(List<TabName> list) {
            this.f19924i = list;
            return this;
        }

        public C4867a() {
            this.f19919d = -1;
            this.f19920e = false;
            this.f19922g = null;
            this.f19923h = InnerPushType.DEFAULT;
            this.f19924i = jyb.m147482M(TabName.Card);
            this.f19925j = InnerPushLayoutType.DEFAULT_MESSAGE;
            this.f19926k = 3000L;
            this.f19927l = false;
        }
    }
}
