package com.p051p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.api.api.Network;
import com.p051p1.mobile.putong.api.api.PaymentApi;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4879a;
import com.p051p1.mobile.putong.core.api.C4909x;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageRedPacketStatus;
import com.p051p1.mobile.putong.core.data.RedPacket;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p153l.byd0;
import p153l.dy6;
import p153l.jxd0;
import p153l.jyb;
import p153l.pcj;
import p153l.qcj;
import p153l.x20;
import p153l.z1d0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.x */
/* JADX INFO: loaded from: classes9.dex */
public class C4909x extends dy6 {

    /* JADX INFO: renamed from: R */
    public static byd0 f20878R = new byd0("red_packet_duration_10x", 1L);

    /* JADX INFO: renamed from: S */
    public static jxd0 f20879S = new jxd0("red_packet_anim_always_show", Boolean.FALSE);

    public C4909x(C4883c c4883c) {
        super(c4883c);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ C22421c m35874d3(RedPacket redPacket) {
        if (NullChecker.m82486a(redPacket) && "default".equals(redPacket.status)) {
            return C22421c.just(PaymentApi.PaymentResultStatus.succeed);
        }
        return (NullChecker.m82486a(redPacket) && "payFailed".equals(redPacket.status)) ? C22421c.just(PaymentApi.PaymentResultStatus.failed) : C22421c.just(null);
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ void m35878h3(MessageRedPacketStatus messageRedPacketStatus, RedPacket redPacket, Message message) {
        messageRedPacketStatus.localRedPacketStatus = redPacket.status;
        messageRedPacketStatus.localIsRedPacketOpen = NullChecker.m82486a(redPacket.myInfo) && !TextUtils.isEmpty(redPacket.myInfo.amount);
        messageRedPacketStatus.expireTime = redPacket.expireTime;
        CoreModule.f18272k.f115535c.update(jyb.m147507f0(jyb.m147494Y(Message.LOCALREDPACKETTYPE, messageRedPacketStatus.toJson())), Message.f21183ID.mo61359EQ(message.f56859id));
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ Envelope m35879i3(Message message, Envelope envelope) {
        CoreModule.f18264c.f20379d1.m35894x3(message, ((CoreData) envelope.getModuleData(CoreData.class)).redPackets.get(0));
        return envelope;
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ RedPacket m35880j3(Envelope envelope) {
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).redPackets)) {
            return null;
        }
        return ((CoreData) envelope.getModuleData(CoreData.class)).redPackets.get(0);
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ RedPacket m35881k3(Envelope envelope) {
        if (jyb.m147479J(((CoreData) envelope.getModuleData(CoreData.class)).redPackets)) {
            return null;
        }
        return ((CoreData) envelope.getModuleData(CoreData.class)).redPackets.get(0);
    }

    /* JADX INFO: renamed from: s3 */
    public C22421c<PaymentApi.PaymentResultStatus> m35889s3(final String str) {
        return C22421c.interval(0L, 1000L, TimeUnit.MILLISECONDS).timeout(5L, TimeUnit.MINUTES).onBackpressureDrop().observeOn(Schedulers.m222739io()).flatMap(new qcj() { // from class: l.vva
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f185916a.m35891u3(str, (Long) obj);
            }
        }).takeUntil((qcj<? super R, Boolean>) new qcj() { // from class: l.wva
            @Override // p153l.qcj
            public final Object call(Object obj) {
                RedPacket redPacket = (RedPacket) obj;
                return Boolean.valueOf(NullChecker.m82486a(redPacket) && ("default".equals(redPacket.status) || "payFailed".equals(redPacket.status)));
            }
        }).flatMap(new qcj() { // from class: l.xva
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return C4909x.m35874d3((RedPacket) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public C22421c<RedPacket> m35890t3(final String str) {
        return CoreModule.f18264c.scheduled("getRedPacketDetail" + str, 0, new pcj() { // from class: l.lva
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.bwa
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/red-packets/" + str)).m209032f().m209028b();
                    }
                }).filter(new qcj() { // from class: l.cwa
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!jyb.m147479J(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).redPackets));
                    }
                }).map(new qcj() { // from class: l.mva
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).redPackets.get(0);
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ C22421c m35891u3(final String str, Long l2) {
        return this.f91137Q.scheduled("sendRedPacket" + str, 0, new pcj() { // from class: l.nva
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.pva
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/red-packets/" + str)).m209032f().m209028b();
                    }
                }).map(new qcj() { // from class: l.qva
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4909x.m35881k3((Envelope) obj);
                    }
                }).retry().compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public C22421c<Envelope> m35892v3(final Message message, final String str) {
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, "");
        return this.f91137Q.scheduled("receiveRedPacket" + str, 0, new pcj() { // from class: l.ova
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.rva
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/red-packets/" + str + "/receive-records")).m209038l(z1d0Var).m209028b();
                    }
                }).filter(new qcj() { // from class: l.sva
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!jyb.m147479J(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).redPackets));
                    }
                }).map(new qcj() { // from class: l.tva
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4909x.m35879i3(message, (Envelope) obj);
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public C22421c<RedPacket> m35893w3(String str, String str2, String str3, int i) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("receiveType", "group");
            jSONObject.put("receiveId", str);
            jSONObject.put("splitType", str2);
            jSONObject.put(FirebaseAnalytics.Param.QUANTITY, i);
            jSONObject.put("totalAmount", str3);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
            string = "";
        }
        final z1d0 z1d0VarCreate = z1d0.create(Network.JSON, string);
        return this.f91137Q.scheduled("sendRedPacket", 0, new pcj() { // from class: l.uva
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return new ti20(new pcj() { // from class: l.zva
                    @Override // p153l.pcj, java.util.concurrent.Callable
                    public final Object call() {
                        return C4879a.f20236P.auth().m209043q(C4879a.m32203G("/red-packets")).m209038l(z1d0Var).m209028b();
                    }
                }).map(new qcj() { // from class: l.awa
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return C4909x.m35880j3((Envelope) obj);
                    }
                }).compose(C4879a.m32255T2());
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public void m35894x3(final Message message, final RedPacket redPacket) {
        if (TextUtils.isEmpty(message.msgData)) {
            return;
        }
        try {
            final MessageRedPacketStatus messageRedPacketStatus = MessageRedPacketStatus.JSON_ADAPTER.parse(message.msgData);
            if (NullChecker.m82486a(messageRedPacketStatus)) {
                this.f91137Q.f20351U.m128074a(new x20() { // from class: l.yva
                    @Override // p153l.x20
                    public final void call() {
                        C4909x.m35878h3(messageRedPacketStatus, redPacket, message);
                    }
                });
            }
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }
}
