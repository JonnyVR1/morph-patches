package com.p000p1.mobile.putong.core.api;

import android.graphics.Color;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageAdditionalData;
import com.p1.mobile.putong.core.data.MessageAdditionalDataCompliment;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import l.e30;
import l.eqh0;
import l.i0g0;
import l.jo0;
import l.mkd0;
import l.mqi0;
import l.vwb;
import l.w85;
import p006l.ura;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class CoreInnerPush {

    /* JADX INFO: renamed from: a */
    public b<C0142a> f3160a = b.b();

    /* JADX INFO: renamed from: b */
    public HashMap<String, Boolean> f3161b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final HashSet<String> f3162c = new HashSet<>();

    /* JADX INFO: renamed from: d */
    public long f3163d;

    public enum InnerPushLayoutType {
        DEFAULT_MESSAGE,
        COUNTDOWN_CONV_CREATE
    }

    public enum InnerPushType {
        DEFAULT,
        NEW_MSG
    }

    public CoreInnerPush() {
        this.f3163d = -1L;
        this.f3163d = mqi0.o();
    }

    /* JADX INFO: renamed from: d */
    public c<C0142a> m2055d() {
        return this.f3160a.asObservable().observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m2056e(Message message, User user) {
        if (NullChecker.a(user)) {
            C0142a c0142aM5828o8 = ura.m25555e().m25559d().m5828o8(user, message);
            c0142aM5828o8.m2067c(InnerPushType.NEW_MSG);
            this.f3160a.onNext(c0142aM5828o8);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m2057f(Message message, User user) {
        if (NullChecker.a(user)) {
            this.f3160a.onNext(ura.m25555e().m25559d().m5751da(user, message));
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m2058g(Message message, User user) {
        if (!NullChecker.a(user) || user.isTeamAccount()) {
            return;
        }
        String str = TextUtils.isEmpty(user.publicId) ? message.cid : user.publicId;
        HashMap map = new HashMap();
        map.put("sender_name", user.name);
        map.put("match_id", str);
        map.put("msg_type", m2059h(message));
        w85.INSTANCE.m("Receive new message", map);
    }

    /* JADX INFO: renamed from: h */
    public final String m2059h(Message message) {
        if (TEnum.equals(message.messageType, "text")) {
            return "text";
        }
        if (TEnum.equals(message.messageType, "audio")) {
            return "audio";
        }
        if (TEnum.equals(message.messageType, "picture")) {
            return "photo";
        }
        return TEnum.equals(message.messageType, "video") ? "video" : "others";
    }

    /* JADX INFO: renamed from: i */
    public void m2060i(final Message message) {
        MessageAdditionalData messageAdditionalData;
        MessageAdditionalDataCompliment messageAdditionalDataCompliment;
        if (!message.isGroupMessage() && System.nanoTime() - message.localCreatedTime < 5000000000L) {
            long j = this.f3163d;
            if ((j <= 0 || message.createdTime >= j) && !this.f3161b.containsKey(((DbObject) message).id)) {
                this.f3161b.put(((DbObject) message).id, Boolean.TRUE);
                if ((!TEnum.equals(message.messageType, "picture_compliment") || (messageAdditionalData = message.additionalData) == null || (messageAdditionalDataCompliment = messageAdditionalData.compliment) == null || !"free".equals(messageAdditionalDataCompliment.type)) && !message.isGroupMessage() && TextUtils.isEmpty(message.localGreetingId)) {
                    CoreModule.f1534c.f3628e0.m21381Ma(message.cid).take(1).first().subscribe(new e30() { // from class: l.y29
                        public final void call(Object obj) {
                            this.f27861a.m2056e(message, (User) obj);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m2061j(final Message message) {
        if (message.isGroupMessage() || !TextUtils.isEmpty(message.localGreetingId)) {
            return;
        }
        CoreModule.f1534c.f3628e0.m21381Ma(message.getHostId()).take(1).first().subscribe(new e30() { // from class: l.x29
            public final void call(Object obj) {
                this.f25674a.m2057f(message, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m2062k() {
        C0142a c0142a = new C0142a();
        c0142a.f3164a = "消息已发送消息已发送消息已发送";
        c0142a.f3165b = "消息已发送消息已发送消息已发送消息已发送消息已发送消息已发送消息已发送消息已发送消息已发送";
        c0142a.f3166c = CoreModule.f1534c.f3628e0.m21490p9().fp().profileSmall().formatted();
        this.f3160a.onNext(c0142a);
    }

    /* JADX INFO: renamed from: l */
    public void m2063l() {
        C0142a c0142a = new C0142a();
        c0142a.m2066b(true);
        c0142a.f3170g = "test_countdown";
        c0142a.f3164a = i0g0.b0(((mqi0.o() % 10) + "").concat("特邀嘉宾 已帮你找到有缘的她，快去看看吧"), vwb.f0(new String[]{"特邀嘉宾"}), Color.parseColor("#ff5c31"), eqh0.c(2));
        c0142a.m2065a(InnerPushLayoutType.COUNTDOWN_CONV_CREATE).m2068d(vwb.f0(new TabName[]{TabName.Card, TabName.Msg, TabName.Moment, TabName.Me}));
        c0142a.f3166c = CoreModule.f1534c.f3628e0.m21490p9().fp().profileSmall().formatted();
        this.f3160a.onNext(c0142a);
    }

    /* JADX INFO: renamed from: m */
    public void m2064m(final Message message) {
        if (message.isGroupMessage() || TextUtils.isEmpty(((DbObject) message).id) || this.f3162c.contains(((DbObject) message).id) || !TextUtils.isEmpty(message.localGreetingId) || TEnum.equals(message.messageType, "picture_compliment")) {
            return;
        }
        this.f3162c.add(((DbObject) message).id);
        CoreModule.f1534c.f3628e0.m21381Ma(message.cid).take(1).first().subscribe(mkd0.G(new e30() { // from class: l.z29
            public final void call(Object obj) {
                this.f28561a.m2058g(message, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreInnerPush$a */
    public static class C0142a {

        /* JADX INFO: renamed from: a */
        public CharSequence f3164a;

        /* JADX INFO: renamed from: b */
        public CharSequence f3165b;

        /* JADX INFO: renamed from: c */
        public String f3166c;

        /* JADX INFO: renamed from: d */
        public int f3167d;

        /* JADX INFO: renamed from: e */
        public boolean f3168e;

        /* JADX INFO: renamed from: f */
        public String f3169f;

        /* JADX INFO: renamed from: g */
        public String f3170g;

        /* JADX INFO: renamed from: h */
        public InnerPushType f3171h;

        /* JADX INFO: renamed from: i */
        public List<TabName> f3172i;

        /* JADX INFO: renamed from: j */
        public InnerPushLayoutType f3173j;

        /* JADX INFO: renamed from: k */
        public long f3174k;

        /* JADX INFO: renamed from: l */
        public boolean f3175l;

        public C0142a(String str) {
            this.f3167d = -1;
            this.f3168e = false;
            this.f3170g = null;
            this.f3171h = InnerPushType.DEFAULT;
            this.f3172i = vwb.M(TabName.Card);
            this.f3173j = InnerPushLayoutType.DEFAULT_MESSAGE;
            this.f3174k = 3000L;
            this.f3175l = false;
            this.f3170g = str;
        }

        /* JADX INFO: renamed from: a */
        public C0142a m2065a(InnerPushLayoutType innerPushLayoutType) {
            this.f3173j = innerPushLayoutType;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C0142a m2066b(boolean z) {
            this.f3175l = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0142a m2067c(InnerPushType innerPushType) {
            this.f3171h = innerPushType;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0142a m2068d(List<TabName> list) {
            this.f3172i = list;
            return this;
        }

        public C0142a() {
            this.f3167d = -1;
            this.f3168e = false;
            this.f3170g = null;
            this.f3171h = InnerPushType.DEFAULT;
            this.f3172i = vwb.M(TabName.Card);
            this.f3173j = InnerPushLayoutType.DEFAULT_MESSAGE;
            this.f3174k = 3000L;
            this.f3175l = false;
        }
    }
}
