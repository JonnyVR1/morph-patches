package com.p046p1.mobile.putong.core.api;

import android.graphics.Color;
import android.text.TextUtils;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageAdditionalData;
import com.p046p1.mobile.putong.core.data.MessageAdditionalDataCompliment;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.data.LiveRegionTag;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.e30;
import p149l.eqh0;
import p149l.i0g0;
import p149l.jo0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.ura;
import p149l.vwb;
import p149l.w85;

/* JADX INFO: loaded from: classes9.dex */
public class CoreInnerPush {

    /* JADX INFO: renamed from: a */
    public C22393b<C4716a> f19171a = C22393b.m221521b();

    /* JADX INFO: renamed from: b */
    public HashMap<String, Boolean> f19172b = new HashMap<>();

    /* JADX INFO: renamed from: c */
    public final HashSet<String> f19173c = new HashSet<>();

    /* JADX INFO: renamed from: d */
    public long f19174d;

    public enum InnerPushLayoutType {
        DEFAULT_MESSAGE,
        COUNTDOWN_CONV_CREATE
    }

    public enum InnerPushType {
        DEFAULT,
        NEW_MSG
    }

    public CoreInnerPush() {
        this.f19174d = -1L;
        this.f19174d = mqi0.m155944o();
    }

    /* JADX INFO: renamed from: d */
    public C22306c<C4716a> m30127d() {
        return this.f19171a.asObservable().observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m30128e(Message message, User user) {
        if (NullChecker.m81303a(user)) {
            C4716a c4716aMo33891o8 = ura.m195053e().m195057d().mo33891o8(user, message);
            c4716aMo33891o8.m30139c(InnerPushType.NEW_MSG);
            this.f19171a.onNext(c4716aMo33891o8);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m30129f(Message message, User user) {
        if (NullChecker.m81303a(user)) {
            this.f19171a.onNext(ura.m195053e().m195057d().mo33814da(user, message));
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m30130g(Message message, User user) {
        if (!NullChecker.m81303a(user) || user.isTeamAccount()) {
            return;
        }
        String str = TextUtils.isEmpty(user.publicId) ? message.cid : user.publicId;
        HashMap map = new HashMap();
        map.put("sender_name", user.name);
        map.put("match_id", str);
        map.put("msg_type", m30131h(message));
        w85.INSTANCE.m202145m("Receive new message", map);
    }

    /* JADX INFO: renamed from: h */
    public final String m30131h(Message message) {
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
    public void m30132i(final Message message) {
        MessageAdditionalData messageAdditionalData;
        MessageAdditionalDataCompliment messageAdditionalDataCompliment;
        if (!message.isGroupMessage() && System.nanoTime() - message.localCreatedTime < 5000000000L) {
            long j = this.f19174d;
            if ((j <= 0 || message.createdTime >= j) && !this.f19172b.containsKey(message.f56011id)) {
                this.f19172b.put(message.f56011id, Boolean.TRUE);
                if ((!TEnum.equals(message.messageType, "picture_compliment") || (messageAdditionalData = message.additionalData) == null || (messageAdditionalDataCompliment = messageAdditionalData.compliment) == null || !"free".equals(messageAdditionalDataCompliment.type)) && !message.isGroupMessage() && TextUtils.isEmpty(message.localGreetingId)) {
                    CoreModule.f17545c.f19639e0.m169418Ma(message.cid).take(1).first().subscribe(new e30() { // from class: l.y29
                        @Override // p149l.e30
                        public final void call(Object obj) {
                            this.f195499a.m30128e(message, (User) obj);
                        }
                    });
                }
            }
        }
    }

    /* JADX INFO: renamed from: j */
    public void m30133j(final Message message) {
        if (message.isGroupMessage() || !TextUtils.isEmpty(message.localGreetingId)) {
            return;
        }
        CoreModule.f17545c.f19639e0.m169418Ma(message.getHostId()).take(1).first().subscribe(new e30() { // from class: l.x29
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f189137a.m30129f(message, (User) obj);
            }
        });
    }

    /* JADX INFO: renamed from: k */
    public void m30134k() {
        C4716a c4716a = new C4716a();
        c4716a.f19175a = "消息已发送消息已发送消息已发送";
        c4716a.f19176b = "消息已发送消息已发送消息已发送消息已发送消息已发送消息已发送消息已发送消息已发送消息已发送";
        c4716a.f19177c = CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted();
        this.f19171a.onNext(c4716a);
    }

    /* JADX INFO: renamed from: l */
    public void m30135l() {
        C4716a c4716a = new C4716a();
        c4716a.m30138b(true);
        c4716a.f19181g = "test_countdown";
        c4716a.f19175a = i0g0.m133861b0(((mqi0.m155944o() % 10) + "").concat("特邀嘉宾 已帮你找到有缘的她，快去看看吧"), vwb.m200324f0("特邀嘉宾"), Color.parseColor("#ff5c31"), eqh0.m117752c(2));
        c4716a.m30137a(InnerPushLayoutType.COUNTDOWN_CONV_CREATE).m30140d(vwb.m200324f0(TabName.Card, TabName.Msg, TabName.Moment, TabName.Me));
        c4716a.f19177c = CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall().formatted();
        this.f19171a.onNext(c4716a);
    }

    /* JADX INFO: renamed from: m */
    public void m30136m(final Message message) {
        if (message.isGroupMessage() || TextUtils.isEmpty(message.f56011id) || this.f19173c.contains(message.f56011id) || !TextUtils.isEmpty(message.localGreetingId) || TEnum.equals(message.messageType, "picture_compliment")) {
            return;
        }
        this.f19173c.add(message.f56011id);
        CoreModule.f17545c.f19639e0.m169418Ma(message.cid).take(1).first().subscribe(mkd0.m154955G(new e30() { // from class: l.z29
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f201170a.m30130g(message, (User) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.api.CoreInnerPush$a */
    public static class C4716a {

        /* JADX INFO: renamed from: a */
        public CharSequence f19175a;

        /* JADX INFO: renamed from: b */
        public CharSequence f19176b;

        /* JADX INFO: renamed from: c */
        public String f19177c;

        /* JADX INFO: renamed from: d */
        public int f19178d;

        /* JADX INFO: renamed from: e */
        public boolean f19179e;

        /* JADX INFO: renamed from: f */
        public String f19180f;

        /* JADX INFO: renamed from: g */
        public String f19181g;

        /* JADX INFO: renamed from: h */
        public InnerPushType f19182h;

        /* JADX INFO: renamed from: i */
        public List<TabName> f19183i;

        /* JADX INFO: renamed from: j */
        public InnerPushLayoutType f19184j;

        /* JADX INFO: renamed from: k */
        public long f19185k;

        /* JADX INFO: renamed from: l */
        public boolean f19186l;

        public C4716a(String str) {
            this.f19178d = -1;
            this.f19179e = false;
            this.f19181g = null;
            this.f19182h = InnerPushType.DEFAULT;
            this.f19183i = vwb.m200299M(TabName.Card);
            this.f19184j = InnerPushLayoutType.DEFAULT_MESSAGE;
            this.f19185k = 3000L;
            this.f19186l = false;
            this.f19181g = str;
        }

        /* JADX INFO: renamed from: a */
        public C4716a m30137a(InnerPushLayoutType innerPushLayoutType) {
            this.f19184j = innerPushLayoutType;
            return this;
        }

        /* JADX INFO: renamed from: b */
        public C4716a m30138b(boolean z) {
            this.f19186l = z;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C4716a m30139c(InnerPushType innerPushType) {
            this.f19182h = innerPushType;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C4716a m30140d(List<TabName> list) {
            this.f19183i = list;
            return this;
        }

        public C4716a() {
            this.f19178d = -1;
            this.f19179e = false;
            this.f19181g = null;
            this.f19182h = InnerPushType.DEFAULT;
            this.f19183i = vwb.m200299M(TabName.Card);
            this.f19184j = InnerPushLayoutType.DEFAULT_MESSAGE;
            this.f19185k = 3000L;
            this.f19186l = false;
        }
    }
}
