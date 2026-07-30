package com.p046p1.mobile.putong.core.api;

import android.text.TextUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.api.api.Network;
import com.p046p1.mobile.putong.api.api.PaymentApi;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4728a;
import com.p046p1.mobile.putong.core.api.C4758x;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageRedPacketStatus;
import com.p046p1.mobile.putong.core.data.RedPacket;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p149l.ax6;
import p149l.d30;
import p149l.hpd0;
import p149l.utc0;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.zpd0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.api.x */
/* JADX INFO: loaded from: classes9.dex */
public class C4758x extends ax6 {

    /* JADX INFO: renamed from: R */
    public static zpd0 f20136R = new zpd0("red_packet_duration_10x", 1L);

    /* JADX INFO: renamed from: S */
    public static hpd0 f20137S = new hpd0("red_packet_anim_always_show", Boolean.FALSE);

    public C4758x(C4732c c4732c) {
        super(c4732c);
    }

    /* JADX INFO: renamed from: d3 */
    public static /* synthetic */ C22306c m34871d3(RedPacket redPacket) {
        if (NullChecker.m81303a(redPacket) && "default".equals(redPacket.status)) {
            return C22306c.just(PaymentApi.PaymentResultStatus.succeed);
        }
        return (NullChecker.m81303a(redPacket) && "payFailed".equals(redPacket.status)) ? C22306c.just(PaymentApi.PaymentResultStatus.failed) : C22306c.just(null);
    }

    /* JADX INFO: renamed from: h3 */
    public static /* synthetic */ void m34875h3(MessageRedPacketStatus messageRedPacketStatus, RedPacket redPacket, Message message) {
        messageRedPacketStatus.localRedPacketStatus = redPacket.status;
        messageRedPacketStatus.localIsRedPacketOpen = NullChecker.m81303a(redPacket.myInfo) && !TextUtils.isEmpty(redPacket.myInfo.amount);
        messageRedPacketStatus.expireTime = redPacket.expireTime;
        CoreModule.f17553k.f91940c.update(vwb.m200324f0(vwb.m200311Y(Message.LOCALREDPACKETTYPE, messageRedPacketStatus.toJson())), Message.f20441ID.mo60175EQ(message.f56011id));
    }

    /* JADX INFO: renamed from: i3 */
    public static /* synthetic */ Envelope m34876i3(Message message, Envelope envelope) {
        CoreModule.f17545c.f19637d1.m34891x3(message, ((CoreData) envelope.getModuleData(CoreData.class)).redPackets.get(0));
        return envelope;
    }

    /* JADX INFO: renamed from: j3 */
    public static /* synthetic */ RedPacket m34877j3(Envelope envelope) {
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).redPackets)) {
            return null;
        }
        return ((CoreData) envelope.getModuleData(CoreData.class)).redPackets.get(0);
    }

    /* JADX INFO: renamed from: k3 */
    public static /* synthetic */ RedPacket m34878k3(Envelope envelope) {
        if (vwb.m200296J(((CoreData) envelope.getModuleData(CoreData.class)).redPackets)) {
            return null;
        }
        return ((CoreData) envelope.getModuleData(CoreData.class)).redPackets.get(0);
    }

    /* JADX INFO: renamed from: s3 */
    public C22306c<PaymentApi.PaymentResultStatus> m34886s3(final String str) {
        return C22306c.interval(0L, 1000L, TimeUnit.MILLISECONDS).timeout(5L, TimeUnit.MINUTES).onBackpressureDrop().observeOn(Schedulers.m221493io()).flatMap(new w9j() { // from class: l.jua
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f119749a.m34888u3(str, (Long) obj);
            }
        }).takeUntil((w9j<? super R, Boolean>) new w9j() { // from class: l.kua
            @Override // p149l.w9j
            public final Object call(Object obj) {
                RedPacket redPacket = (RedPacket) obj;
                return Boolean.valueOf(NullChecker.m81303a(redPacket) && ("default".equals(redPacket.status) || "payFailed".equals(redPacket.status)));
            }
        }).flatMap(new w9j() { // from class: l.lua
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return C4758x.m34871d3((RedPacket) obj);
            }
        });
    }

    /* JADX INFO: renamed from: t3 */
    public C22306c<RedPacket> m34887t3(final String str) {
        return CoreModule.f17545c.scheduled("getRedPacketDetail" + str, 0, new v9j() { // from class: l.zta
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.pua
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/red-packets/" + str)).m185887f().m185883b();
                    }
                }).filter(new w9j() { // from class: l.qua
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!vwb.m200296J(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).redPackets));
                    }
                }).map(new w9j() { // from class: l.aua
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).redPackets.get(0);
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: u3 */
    public final /* synthetic */ C22306c m34888u3(final String str, Long l2) {
        return this.f72126Q.scheduled("sendRedPacket" + str, 0, new v9j() { // from class: l.bua
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.dua
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/red-packets/" + str)).m185887f().m185883b();
                    }
                }).map(new w9j() { // from class: l.eua
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4758x.m34878k3((Envelope) obj);
                    }
                }).retry().compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: v3 */
    public C22306c<Envelope> m34889v3(final Message message, final String str) {
        final utc0 utc0VarCreate = utc0.create(Network.JSON, "");
        return this.f72126Q.scheduled("receiveRedPacket" + str, 0, new v9j() { // from class: l.cua
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.fua
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/red-packets/" + str + "/receive-records")).m185893l(utc0Var).m185883b();
                    }
                }).filter(new w9j() { // from class: l.gua
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!vwb.m200296J(((CoreData) ((Envelope) obj).getModuleData(CoreData.class)).redPackets));
                    }
                }).map(new w9j() { // from class: l.hua
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4758x.m34876i3(message, (Envelope) obj);
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: w3 */
    public C22306c<RedPacket> m34890w3(String str, String str2, String str3, int i) {
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
            CrashHelper.m81296c(e);
            string = "";
        }
        final utc0 utc0VarCreate = utc0.create(Network.JSON, string);
        return this.f72126Q.scheduled("sendRedPacket", 0, new v9j() { // from class: l.iua
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return new la20(new v9j() { // from class: l.nua
                    @Override // p149l.v9j, java.util.concurrent.Callable
                    public final Object call() {
                        return C4728a.f19494P.auth().m185898q(C4728a.m31200G("/red-packets")).m185893l(utc0Var).m185883b();
                    }
                }).map(new w9j() { // from class: l.oua
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return C4758x.m34877j3((Envelope) obj);
                    }
                }).compose(C4728a.m31252T2());
            }
        });
    }

    /* JADX INFO: renamed from: x3 */
    public void m34891x3(final Message message, final RedPacket redPacket) {
        if (TextUtils.isEmpty(message.msgData)) {
            return;
        }
        try {
            final MessageRedPacketStatus messageRedPacketStatus = MessageRedPacketStatus.JSON_ADAPTER.parse(message.msgData);
            if (NullChecker.m81303a(messageRedPacketStatus)) {
                this.f72126Q.f19609U.m109085a(new d30() { // from class: l.mua
                    @Override // p149l.d30
                    public final void call() {
                        C4758x.m34875h3(messageRedPacketStatus, redPacket, message);
                    }
                });
            }
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }
}
