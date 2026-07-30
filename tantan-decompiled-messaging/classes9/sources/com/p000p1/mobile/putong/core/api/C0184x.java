package com.p000p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.api.api.Network;
import com.p000p1.mobile.putong.api.api.PaymentApi;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.C0154a;
import com.p000p1.mobile.putong.core.api.C0184x;
import com.p1.mobile.putong.core.data.CoreData;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageRedPacketStatus;
import com.p1.mobile.putong.core.data.RedPacket;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import l.d30;
import l.hpd0;
import l.j760;
import l.utc0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.zpd0;
import org.json.JSONException;
import org.json.JSONObject;
import p006l.ax6;
import rx.c;
import rx.schedulers.Schedulers;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.x */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class C0184x extends ax6 {

    /* JADX INFO: renamed from: R */
    public static zpd0 f4125R = new zpd0("red_packet_duration_10x", 1L);

    /* JADX INFO: renamed from: S */
    public static hpd0 f4126S = new hpd0("red_packet_anim_always_show", Boolean.FALSE);

    public C0184x(C0158c c0158c) {
        super(c0158c);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ c m6808d3(RedPacket redPacket) {
        if (NullChecker.a(redPacket) && CameraSticker.CATEGORY_DEFAULT_FILTER.equals(redPacket.status)) {
            return c.just(PaymentApi.PaymentResultStatus.succeed);
        }
        return (NullChecker.a(redPacket) && "payFailed".equals(redPacket.status)) ? c.just(PaymentApi.PaymentResultStatus.failed) : c.just((Object) null);
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ void m6812h3(MessageRedPacketStatus messageRedPacketStatus, RedPacket redPacket, Message message) {
        messageRedPacketStatus.localRedPacketStatus = redPacket.status;
        messageRedPacketStatus.localIsRedPacketOpen = NullChecker.a(redPacket.myInfo) && !TextUtils.isEmpty(redPacket.myInfo.amount);
        messageRedPacketStatus.expireTime = redPacket.expireTime;
        CoreModule.f1542k.f11195c.update(vwb.f0(new j760[]{vwb.Y(Message.LOCALREDPACKETTYPE, messageRedPacketStatus.toJson())}), Message.ID.EQ(((DbObject) message).id));
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ Envelope m6813i3(Message message, Envelope envelope) {
        CoreModule.f1534c.f3626d1.m6828x3(message, (RedPacket) envelope.getModuleData(CoreData.class).redPackets.get(0));
        return envelope;
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ RedPacket m6814j3(Envelope envelope) {
        if (vwb.J(envelope.getModuleData(CoreData.class).redPackets)) {
            return null;
        }
        return (RedPacket) envelope.getModuleData(CoreData.class).redPackets.get(0);
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ RedPacket m6815k3(Envelope envelope) {
        if (vwb.J(envelope.getModuleData(CoreData.class).redPackets)) {
            return null;
        }
        return (RedPacket) envelope.getModuleData(CoreData.class).redPackets.get(0);
    }

    /* JADX INFO: renamed from: m3 */
    public static /* synthetic */ RedPacket m6817m3(Envelope envelope) {
        return (RedPacket) envelope.getModuleData(CoreData.class).redPackets.get(0);
    }

    /* JADX INFO: renamed from: s3 */
    public c<PaymentApi.PaymentResultStatus> m6823s3(final String str) {
        return c.interval(0L, 1000L, TimeUnit.MILLISECONDS).timeout(5L, TimeUnit.MINUTES).onBackpressureDrop().observeOn(Schedulers.io()).flatMap(new w9j() { // from class: l.jua
            public final Object call(Object obj) {
                return this.f15429a.m6825u3(str, (Long) obj);
            }
        }).takeUntil(new w9j() { // from class: l.kua
            public final Object call(Object obj) {
                RedPacket redPacket = (RedPacket) obj;
                return Boolean.valueOf(NullChecker.a(redPacket) && (CameraSticker.CATEGORY_DEFAULT_FILTER.equals(redPacket.status) || "payFailed".equals(redPacket.status)));
            }
        }).flatMap(new w9j() { // from class: l.lua
            public final Object call(Object obj) {
                return C0184x.m6808d3((RedPacket) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public c<RedPacket> m6824t3(final String str) {
        return CoreModule.f1534c.scheduled("getRedPacketDetail" + str, 0, new v9j() { // from class: l.zta
            public final Object call() {
                return new la20(new v9j() { // from class: l.pua
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/red-packets/" + str)).f().b();
                    }
                }).filter(new w9j() { // from class: l.qua
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!vwb.J(((Envelope) obj).getModuleData(CoreData.class).redPackets));
                    }
                }).map(new w9j() { // from class: l.aua
                    public final Object call(Object obj) {
                        return C0184x.m6817m3((Envelope) obj);
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ c m6825u3(final String str, Long l2) {
        return this.f8580Q.scheduled("sendRedPacket" + str, 0, new v9j() { // from class: l.bua
            public final Object call() {
                return new la20(new v9j() { // from class: l.dua
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/red-packets/" + str)).f().b();
                    }
                }).map(new w9j() { // from class: l.eua
                    public final Object call(Object obj) {
                        return C0184x.m6815k3((Envelope) obj);
                    }
                }).retry().compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public c<Envelope> m6826v3(final Message message, final String str) {
        final utc0 utc0VarCreate = utc0.create(Network.JSON, "");
        return this.f8580Q.scheduled("receiveRedPacket" + str, 0, new v9j() { // from class: l.cua
            public final Object call() {
                return new la20(new v9j() { // from class: l.fua
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/red-packets/" + str + "/receive-records")).l(utc0Var).b();
                    }
                }).filter(new w9j() { // from class: l.gua
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!vwb.J(((Envelope) obj).getModuleData(CoreData.class).redPackets));
                    }
                }).map(new w9j() { // from class: l.hua
                    public final Object call(Object obj) {
                        return C0184x.m6813i3(message, (Envelope) obj);
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public c<RedPacket> m6827w3(String str, String str2, String str3, int i) {
        String string;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("receiveType", "group");
            jSONObject.put("receiveId", str);
            jSONObject.put("splitType", str2);
            jSONObject.put("quantity", i);
            jSONObject.put("totalAmount", str3);
            string = jSONObject.toString();
        } catch (JSONException e) {
            CrashHelper.c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return this.f8580Q.scheduled("sendRedPacket", 0, new v9j() { // from class: l.iua
            public final Object call() {
                return new la20(new v9j() { // from class: l.nua
                    public final Object call() {
                        return C0154a.f3483P.auth().q(C0154a.m3130G("/red-packets")).l(utc0Var).b();
                    }
                }).map(new w9j() { // from class: l.oua
                    public final Object call(Object obj) {
                        return C0184x.m6814j3((Envelope) obj);
                    }
                }).compose(C0154a.m3182T2());
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public void m6828x3(final Message message, final RedPacket redPacket) {
        if (TextUtils.isEmpty(message.msgData)) {
            return;
        }
        try {
            final MessageRedPacketStatus messageRedPacketStatus = (MessageRedPacketStatus) MessageRedPacketStatus.JSON_ADAPTER.parse(message.msgData);
            if (NullChecker.a(messageRedPacketStatus)) {
                this.f8580Q.f3598U.m13685a(new d30() { // from class: l.mua
                    public final void call() {
                        C0184x.m6812h3(messageRedPacketStatus, redPacket, message);
                    }
                });
            }
        } catch (IOException e) {
            CrashHelper.c(e);
        }
    }
}
