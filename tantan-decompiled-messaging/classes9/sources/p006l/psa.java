package p006l;

import android.app.PendingIntent;
import android.text.TextUtils;
import com.p000p1.mobile.putong.api.push.PushTrackData;
import com.p000p1.mobile.putong.app.TantanApp;
import com.p000p1.mobile.putong.core.CoreBusinessModule;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.R$string;
import com.p000p1.mobile.putong.core.api.C0166g;
import com.p000p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.VoiceCallStatus;
import com.p1.mobile.putong.core.ui.messages.game.MsgGameMkWebViewAct;
import com.p1.mobile.putong.data.PushMessage;
import com.p1.mobile.putong.data.PushMessageContent;
import com.p1.mobile.putong.data.PushMessageCustom;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.aci;
import l.c30;
import l.du2;
import l.e30;
import l.e51;
import l.ib1;
import l.ic50;
import l.j760;
import l.ke7;
import l.mkd0;
import l.mqi0;
import l.p09;
import l.r07;
import l.roj0;
import l.sa40;
import l.snm;
import l.ssm0;
import l.tqm0;
import l.vjf0;
import l.vwb;
import l.xdx;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class psa {

    /* JADX INFO: renamed from: a */
    public long f19282a = 0;

    /* JADX INFO: renamed from: b */
    public long f19283b = 0;

    /* JADX INFO: renamed from: l.psa$a */
    public class C1146a implements ydb0.InterfaceC1476g {
        public C1146a() {
        }

        @Override // p006l.ydb0.InterfaceC1476g
        /* JADX INFO: renamed from: a */
        public boolean mo12244a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            if (qib0.f19804b0.f17706a.signedIn_()) {
                return psa.this.m21672n(CoreModule.m1850H().userId(), str, str2, pushMessage, pushTrackData);
            }
            if (!NullChecker.a(pushMessage) || pushMessage.silent) {
                return false;
            }
            if (!"suggested.list".equals(pushMessage.intent) && !"huawei.unreadMsg".equals(pushMessage.intent) && (!CoreModule.m1850H().mo58a().mo16299c() || !"devicepush.list".equals(pushMessage.intent))) {
                return true;
            }
            CoreModule.f1544m.j(pushMessage, pushTrackData);
            return true;
        }

        @Override // p006l.ydb0.InterfaceC1476g
        /* JADX INFO: renamed from: b */
        public PendingIntent mo12245b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return CoreModule.f1544m.e(pushMessage, pushTrackData, true);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m21660b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m21662d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m21663e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m21664f(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m21666h(roj0 roj0Var) {
        CoreModule.f1534c.f3628e0.m21368J9();
        if (vy8.m26022m() || vy8.m26023n()) {
            ke7.o().z();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m21668j(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m21669k(String str, roj0 roj0Var) {
        if (TextUtils.equals(str, MsgGameMkWebViewAct.j)) {
            CoreModule.f1534c.f3631f0.m4583Ge(str);
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m21670l(String str) {
        return TextUtils.equals(String.valueOf(str), NullChecker.a(CoreBusinessModule.f1522c) ? CoreBusinessModule.f1522c.z() : null);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m21671m(int i) {
        User userM21490p9 = CoreModule.f1534c.f3628e0.m21490p9();
        return (userM21490p9 != null && userM21490p9.settings.previewPushMessage().booleanValue()) || i == -1;
    }

    /* JADX WARN: Code duplicated, block: B:443:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:450:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:452:0x0a7f  */
    /* JADX WARN: Code duplicated, block: B:454:0x0a83  */
    /* JADX WARN: Code duplicated, block: B:460:0x0a28 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public boolean m21672n(String str, String str2, String str3, final PushMessage pushMessage, PushTrackData pushTrackData) {
        boolean zM21671m;
        boolean z;
        final String str4;
        if (NullChecker.a(pushMessage)) {
            if (pushMessage.intent.equals("user.state.changed")) {
                CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
            } else if (pushMessage.intent.equals("conversation.single.delete") && pushMessage.content.type.equals("conversation")) {
                du2.a("conversation.single.delete", "id:" + pushMessage.content.id);
                CoreModule.f1534c.f3631f0.m4580Fo();
                if (!TantanApp.f1169c.m28196N()) {
                    return true;
                }
            } else if (pushMessage.intent.equals("greeting.list")) {
                CoreModule.f1534c.f3667r0.f4025q0.onNext(Boolean.TRUE);
                m21673o(pushMessage.messageCustom.channel);
                if (NullChecker.a(pushMessage.content) && !TextUtils.isEmpty(pushMessage.content.id) && TextUtils.equals(pushMessage.content.type, "greeting")) {
                    CoreModule.f1534c.f3667r0.m6027I6(pushMessage.content.id);
                }
                String str5 = pushMessage.content.id;
            } else if (pushMessage.intent.equals("greeting.single")) {
                CoreModule.f1534c.f3667r0.m6023G6(pushMessage.content.id, TextUtils.equals(pushMessage.messageCustom.channel, "anonymous"));
                CoreModule.f1534c.f3667r0.f4025q0.onNext(Boolean.TRUE);
                m21673o(pushMessage.messageCustom.channel);
                if (m21670l(pushMessage.content.id) || vjf0.e().y(pushMessage.content.id)) {
                    return true;
                }
            } else if (pushMessage.intent.equals("greeting.update")) {
                CoreModule.f1534c.f3631f0.m4580Fo();
                CoreModule.f1534c.f3667r0.f4025q0.onNext(Boolean.TRUE);
                m21673o(pushMessage.messageCustom.channel);
                String str6 = pushMessage.content.id;
            } else if (pushMessage.intent.equals("conversation.single.blocked") && pushMessage.content.type.equals("conversation")) {
                CoreModule.f1534c.f3628e0.m21337Ba(pushMessage.content.id);
                CoreModule.f1534c.f3631f0.m4580Fo();
            } else {
                if (pushMessage.intent.equals("conversation.single.update.oneside")) {
                    CoreModule.f1534c.f3631f0.m4580Fo();
                    return true;
                }
                if (pushMessage.intent.equals("chatheat.exchat")) {
                    CoreModule.f1534c.f3631f0.m4580Fo();
                } else {
                    if ((pushMessage.intent.equals("conversation.single") || pushMessage.intent.equals("male.message.repeat")) && pushMessage.content.type.equals("conversation")) {
                        CoreModule.f1534c.f3575M1.m28298C3(pushMessage.content.id);
                        CoreModule.f1534c.f3631f0.m4580Fo();
                        if (!TantanApp.f1169c.m28196N() || m21670l(String.valueOf(pushMessage.stackId - 10000)) || vjf0.e().y(String.valueOf(pushMessage.stackId - 10000))) {
                            return true;
                        }
                        zM21671m = m21671m(pushMessage.stackId - 10000);
                        z = true;
                    } else if ((pushMessage.intent.equals("message.single.update") || pushMessage.intent.equals("message.group.update")) && pushMessage.content.type.equals("message")) {
                        if (!upa.m25404V1() && pushMessage.intent.equals("message.group.update")) {
                            return true;
                        }
                        if (NullChecker.a(pushMessage.content.parent) && pushMessage.content.parent.type.equals("conversation")) {
                            if (NullChecker.a(CoreModule.f1534c.f3631f0.m4786Xe(pushMessage.content.parent.id))) {
                                C0166g c0166g = CoreModule.f1534c.f3631f0;
                                PushMessageContent pushMessageContent = pushMessage.content;
                                c0166g.m4652Ln(pushMessageContent.parent.id, pushMessageContent.id, pushMessage.messageCustom.msgSingleUpdateIgnoreConvStatus);
                            }
                            if (!TantanApp.f1169c.m28196N()) {
                                return true;
                            }
                        } else if (NullChecker.a(pushMessage.content.parent) && TextUtils.equals(pushMessage.content.parent.type, "greeting")) {
                            CoreModule.f1534c.f3667r0.m6021F6(pushMessage.content.parent.id, true, false);
                            CoreModule.f1534c.f3667r0.m6029J6();
                            CoreModule.f1534c.f3667r0.f4025q0.onNext(Boolean.FALSE);
                        }
                    } else {
                        if (pushMessage.intent.equals("single.comment.delete") && pushMessage.content.type.equals("message")) {
                            if (NullChecker.a(pushMessage.content.parent)) {
                                C0166g c0166g2 = CoreModule.f1534c.f3631f0;
                                PushMessageContent pushMessageContent2 = pushMessage.content;
                                c0166g2.m4688On(pushMessageContent2.parent.id, pushMessageContent2.id);
                            }
                            return true;
                        }
                        if (pushMessage.intent.equals("conversation.list") || pushMessage.intent.equals("kankan.match")) {
                            CoreModule.f1534c.f3631f0.m4580Fo();
                            this.f19282a++;
                            if (!TantanApp.f1169c.m28196N()) {
                                return true;
                            }
                            if (upa.m25468j2() && pushMessage.intent.equals("conversation.list")) {
                                if (upa.m25489n3()) {
                                    aci.d0(pushMessage.content.id, true);
                                } else {
                                    xdx.A().N(pushMessage.content.id);
                                }
                            }
                            if (ura.m25555e().m25559d().m5816lk() && pushMessage.intent.equals("conversation.list") && NullChecker.a(pushMessage) && NullChecker.a(pushMessage.content)) {
                                String str7 = pushMessage.content.id;
                                if (!TextUtils.isEmpty(str7) && CoreModule.f1534c.f3693z2.m2180o3(str7)) {
                                    return true;
                                }
                            }
                        } else {
                            if (pushMessage.intent.equals("conversation.single.message.audiotext") || pushMessage.intent.equals("conversation.group.message.audiotext")) {
                                a<j760<String, String>> aVar = CoreModule.f1534c.f3631f0.f3916c2;
                                PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
                                aVar.onNext(j760.a(pushMessageCustom.otherID, pushMessageCustom.messageID));
                            } else if (pushMessage.intent.equals("user.status.changed")) {
                                CoreModule.f1534c.f3628e0.m21417W9(str).subscribe(mkd0.H(new e30() { // from class: l.esa
                                    public final void call(Object obj) {
                                        psa.m21666h((roj0) obj);
                                    }
                                }, new e30() { // from class: l.hsa
                                    public final void call(Object obj) {
                                        psa.m21663e((Throwable) obj);
                                    }
                                }));
                            } else if (pushMessage.intent.equals("superLike.received") || pushMessage.intent.equals("letter.received")) {
                                pushMessage.title = CoreModule.f1533b.getResources().getString(R$string.f1701Ep);
                                pushMessage.value = pushMessage.ticker;
                                if (NullChecker.a(CoreModule.f1534c)) {
                                    CoreSuggested coreSuggested = CoreModule.f1534c.f3652m0;
                                    coreSuggested.f3371W = 0L;
                                    coreSuggested.f3374X = 0;
                                }
                            } else if (pushMessage.intent.equals("oms.reload")) {
                                ic50.j().p(qib0.f19770A);
                            } else if (pushMessage.intent.equals("user.status.good2fake")) {
                                if (NullChecker.a(Act.foreground_())) {
                                    CoreModule.f1534c.f3628e0.m21417W9(str).subscribe(mkd0.H(new e30() { // from class: l.isa
                                        public final void call(Object obj) {
                                            CoreModule.f1534c.f3582O2.put(pushMessage.primaryPicture);
                                        }
                                    }, new e30() { // from class: l.jsa
                                        public final void call(Object obj) {
                                            psa.m21664f((Throwable) obj);
                                        }
                                    }));
                                }
                            } else if (pushMessage.intent.equals("user.verification.reason")) {
                                if (NullChecker.a(Act.foreground_()) && NullChecker.a(pushMessage.value)) {
                                    CoreModule.f1534c.f3585P2.put(pushMessage.value.toString());
                                }
                            } else if (pushMessage.intent.equals("user.membership.changed")) {
                                CoreModule.f1534c.f3628e0.m21417W9(str);
                            } else if (pushMessage.intent.equals("user.picture.verification")) {
                                CoreModule.f1534c.f3628e0.m21417W9(str);
                                if (upa.m25421Z2()) {
                                    CoreModule.f1534c.f3553F0.m12317q3();
                                }
                                if (vy8.m26022m()) {
                                    CoreModule.f1534c.f3541B0.m3547p4(str).subscribe(mkd0.H(new e30() { // from class: l.ksa
                                        public final void call(Object obj) {
                                            ke7.o().z();
                                        }
                                    }, new e30() { // from class: l.lsa
                                        public final void call(Object obj) {
                                            psa.m21660b((Throwable) obj);
                                        }
                                    }));
                                } else if (upa.m25356K1() || upa.m25434c3()) {
                                    CoreModule.f1534c.f3541B0.m3547p4(str).subscribe(mkd0.H(new e30() { // from class: l.msa
                                        public final void call(Object obj) {
                                            CoreModule.f1534c.f3628e0.m21360H9();
                                        }
                                    }, new e30() { // from class: l.nsa
                                        public final void call(Object obj) {
                                            psa.m21668j((Throwable) obj);
                                        }
                                    }));
                                } else {
                                    CoreModule.f1534c.f3541B0.m3547p4(str);
                                }
                            } else {
                                if (!pushMessage.intent.equals("quickchat.match") && !pushMessage.intent.equals("quickchat.speed-match")) {
                                    if (!pushMessage.intent.equals("quickchat.broadcast") && !pushMessage.intent.equals("quickchat.bell") && !pushMessage.intent.equals("quickchat.speed-push") && !pushMessage.intent.equals("quickchat.oneside") && (!ke50.m18105e() || !pushMessage.intent.equals("voicechat.broadcast"))) {
                                        if (pushMessage.intent.equals("selectedcard.received")) {
                                            pushMessage.value = pushMessage.ticker;
                                        } else if (!pushMessage.intent.equals("suggested.list") && !pushMessage.intent.equals("huawei.unreadMsg")) {
                                            if (pushMessage.intent.equals("suggest.swipe")) {
                                                CoreModule.f1534c.f3652m0.f3359S.onNext(vwb.Y(pushMessage.messageCustom.toJson(), Long.valueOf(qib0.f19784H.guessedCurrentServerTime())));
                                                return true;
                                            }
                                            if (pushMessage.intent.equals("shuoshuo.callback")) {
                                                return true;
                                            }
                                            if (pushMessage.intent.equals("user.idcard.verification") || pushMessage.intent.equals("user.age.verification") || pushMessage.intent.equals("user.ctdid.verification")) {
                                                CoreModule.f1534c.f3628e0.m21417W9(str);
                                                CoreModule.f1534c.f3541B0.m3547p4(str);
                                            } else {
                                                if (TextUtils.equals(pushMessage.intent, "newMaleUserLike.received") || TextUtils.equals(pushMessage.intent, "newMaleUserLike.send") || TextUtils.equals(pushMessage.intent, "growth.dauMale")) {
                                                    return true;
                                                }
                                                if (TextUtils.equals(pushMessage.intent, "call.voice.single")) {
                                                    AudioBusinessType audioBusinessTypeC = ib1.b().c();
                                                    if ((audioBusinessTypeC == AudioBusinessType.CHAT_ROOM_WINDOW || audioBusinessTypeC == AudioBusinessType.VIDEO_CHAT || audioBusinessTypeC == AudioBusinessType.LIVE_IN_ROOM) && TEnum.equals(VoiceCallStatus.get(pushMessage.messageCustom.voiceStatus), "calling")) {
                                                        return true;
                                                    }
                                                    tqm0.p().v(pushMessage, false);
                                                    if (!ssm0.d() && !pushMessage.silent) {
                                                        r07.O(pushMessage.stackId);
                                                        tqm0.p().x(Integer.valueOf(pushMessage.stackId));
                                                        CoreBusinessModule.f1523d.k(pushMessage, pushTrackData, false);
                                                    }
                                                    if (pushMessage.silent) {
                                                        r07.P(pushMessage.stackId);
                                                        tqm0.p().g();
                                                        CoreBusinessModule.f1523d.b(pushMessage.stackId);
                                                    }
                                                    return true;
                                                }
                                                if (!TextUtils.equals(pushMessage.intent, "growth.follow") && !TextUtils.equals(pushMessage.intent, "common.link") && !TextUtils.equals(pushMessage.intent, "heartbeat.match.link") && !TextUtils.equals(pushMessage.intent, "heartbeat.match.recall") && !TextUtils.equals(pushMessage.intent, "visit.notify") && !TextUtils.equals(pushMessage.intent, "see.picks")) {
                                                    if (TextUtils.equals(pushMessage.intent, "push.pay.landpage")) {
                                                        CoreModule.f1534c.f3643j0.m2513G5("purchase_result", pushMessage.messageCustom);
                                                    } else if (TextUtils.equals(pushMessage.intent, "chat.conversation.other_read")) {
                                                        C0166g c0166g3 = CoreModule.f1534c.f3631f0;
                                                        PushMessageCustom pushMessageCustom2 = pushMessage.messageCustom;
                                                        c0166g3.m4993nq(pushMessageCustom2.otherUserID, pushMessageCustom2.readUntilId);
                                                        CoreModule.f1534c.f3631f0.m4580Fo();
                                                    } else if (TextUtils.equals(pushMessage.intent, "call.voiceinviting.single")) {
                                                        r07.O(pushMessage.stackId);
                                                        CoreModule.f1534c.f3631f0.m4580Fo();
                                                        if (pushMessage.content.type.equals("message") && NullChecker.a(pushMessage.content.parent) && !TextUtils.isEmpty(pushMessage.content.parent.id) && !TextUtils.isEmpty(pushMessage.content.id) && pushMessage.content.parent.type.equals("conversation") && NullChecker.a(CoreModule.f1534c.f3631f0.m4786Xe(pushMessage.content.parent.id))) {
                                                            C0166g c0166g4 = CoreModule.f1534c.f3631f0;
                                                            PushMessageContent pushMessageContent3 = pushMessage.content;
                                                            c0166g4.m4640Kn(pushMessageContent3.parent.id, pushMessageContent3.id);
                                                        }
                                                    } else if (!TextUtils.equals(pushMessage.intent, "boost.end.push")) {
                                                        if (!TextUtils.equals(pushMessage.intent, "order.firstPay.fail.sendCoupon") && !TextUtils.equals(pushMessage.intent, "userbag.couponbag.changed")) {
                                                            if (!TextUtils.equals(pushMessage.intent, "conversation.group")) {
                                                                boolean zEquals = TextUtils.equals(pushMessage.intent, "conversation.group.update");
                                                                String str8 = pushMessage.intent;
                                                                if (zEquals) {
                                                                    if (TextUtils.equals(pushMessage.messageCustom.source, "topic")) {
                                                                        CoreModule.f1534c.f3634g0.m3733F6(1);
                                                                        CoreModule.f1534c.f3634g0.m3797a9();
                                                                    } else {
                                                                        CoreModule.f1534c.f3631f0.m4580Fo();
                                                                    }
                                                                    return true;
                                                                }
                                                                if (TextUtils.equals(str8, "group.notification.list")) {
                                                                    if (!upa.m25404V1()) {
                                                                        return true;
                                                                    }
                                                                    CoreModule.f1534c.f3634g0.m3779U8();
                                                                    if (!TantanApp.f1169c.m28196N()) {
                                                                        return true;
                                                                    }
                                                                    if (TextUtils.isEmpty(pushMessage.title)) {
                                                                        pushMessage.title = CoreModule.f1533b.getResources().getString(R$string.f3009w1);
                                                                    }
                                                                    CoreBusinessModule.f1523d.k(pushMessage, pushTrackData, false);
                                                                    return true;
                                                                }
                                                                if (TextUtils.equals(pushMessage.intent, "group.member.update")) {
                                                                    if (!upa.m25404V1()) {
                                                                        return true;
                                                                    }
                                                                    PushMessageContent pushMessageContent4 = pushMessage.content;
                                                                    String str9 = pushMessageContent4.id;
                                                                    String str10 = NullChecker.a(pushMessageContent4.parent) ? pushMessage.content.parent.id : null;
                                                                    if (!TextUtils.isEmpty(str9) && !TextUtils.isEmpty(str10)) {
                                                                        CoreModule.f1534c.f3634g0.m3794Z8(str10, str9);
                                                                    }
                                                                    return true;
                                                                }
                                                                if (TextUtils.equals(pushMessage.intent, "group.update")) {
                                                                    if (!upa.m25404V1()) {
                                                                        return true;
                                                                    }
                                                                    String str11 = pushMessage.content.id;
                                                                    if (!TextUtils.isEmpty(str11)) {
                                                                        if (TextUtils.equals(pushMessage.messageCustom.source, "topic")) {
                                                                            CoreModule.f1534c.f3634g0.m3733F6(1);
                                                                            CoreModule.f1534c.f3634g0.m3797a9();
                                                                        }
                                                                        CoreModule.f1534c.f3634g0.m3788X8(str11);
                                                                        CoreModule.f1534c.f3634g0.f3774g0.onNext(str11);
                                                                    }
                                                                    return true;
                                                                }
                                                                if (TextUtils.equals(pushMessage.intent, "monetizationGift.chatmessage.push")) {
                                                                    if (ogl0.m20651n()) {
                                                                        PushMessageCustom pushMessageCustom3 = pushMessage.messageCustom;
                                                                        String str12 = pushMessageCustom3.messageID;
                                                                        String str13 = pushMessageCustom3.receiveUserID;
                                                                        if (!TextUtils.isEmpty(str12) && !TextUtils.isEmpty(str13)) {
                                                                            Conversation conversationM4786Xe = CoreModule.f1534c.f3631f0.m4786Xe(str13);
                                                                            if (NullChecker.a(conversationM4786Xe)) {
                                                                                CoreModule.f1534c.f3631f0.m4640Kn(((DbObject) conversationM4786Xe).id, str12);
                                                                            } else {
                                                                                CoreModule.f1534c.f3667r0.m6021F6(str13, true, false);
                                                                            }
                                                                        }
                                                                    }
                                                                    return true;
                                                                }
                                                                if (!TextUtils.equals(pushMessage.intent, "guide.update") && !TextUtils.equals(pushMessage.intent, "membership.expiration")) {
                                                                    if (!TextUtils.equals(pushMessage.intent, "voicechat.match")) {
                                                                        if (!TextUtils.equals(pushMessage.intent, "quickchat.bell-greet")) {
                                                                            if (!TextUtils.equals(pushMessage.intent, "quickchat.speed-delete") && !TextUtils.equals(pushMessage.intent, "quickchat.oneside-delete")) {
                                                                                if (TextUtils.equals(pushMessage.intent, "heartbeat.match.broadcast")) {
                                                                                    long jO = mqi0.o();
                                                                                    w29 w29Var = CoreModule.f1534c.f3560H1;
                                                                                    if ((jO > w29Var.f24782h0 || w29Var.m26125K3(pushMessage.messageCustom)) && NullChecker.a(pushMessage.messageCustom) && !TextUtils.isEmpty(pushMessage.messageCustom.userId)) {
                                                                                        snm.X(pushMessage.messageCustom);
                                                                                    }
                                                                                    return true;
                                                                                }
                                                                                if (TextUtils.equals(pushMessage.intent, "growth.match.recall")) {
                                                                                    p09.w().F(pushMessage);
                                                                                    return true;
                                                                                }
                                                                                if (!TextUtils.equals(pushMessage.intent, "quickchat.party")) {
                                                                                    if (TextUtils.equals(pushMessage.intent, "user.setting.changed")) {
                                                                                        CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
                                                                                        return true;
                                                                                    }
                                                                                    if (TextUtils.equals(pushMessage.intent, "user.setting.changed")) {
                                                                                        CoreModule.f1534c.f3628e0.m21417W9(CoreModule.m1850H().userId());
                                                                                        return true;
                                                                                    }
                                                                                    if (TextUtils.equals(pushMessage.intent, "moment-lab.verification.push")) {
                                                                                        CoreModule.f1534c.f3541B0.f3751j0.onNext(Long.valueOf(mqi0.o()));
                                                                                        return true;
                                                                                    }
                                                                                    if (TextUtils.equals(pushMessage.intent, "chat.online.guide")) {
                                                                                        c30.d();
                                                                                        return true;
                                                                                    }
                                                                                    if (TextUtils.equals(pushMessage.intent, "user.picture.tags.changed")) {
                                                                                        if (NullChecker.a(pushMessage.messageCustom) && !TextUtils.isEmpty(pushMessage.messageCustom.tagID)) {
                                                                                            ArrayList arrayList = new ArrayList();
                                                                                            arrayList.add(pushMessage.messageCustom.tagID);
                                                                                            sa40.o().p(arrayList);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            return true;
                                                                        }
                                                                        if (!TextUtils.isEmpty(pushMessage.messageCustom.greetID)) {
                                                                            CoreModule.f1534c.f3652m0.m2924E8(pushMessage.messageCustom.greetID);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (!upa.m25404V1()) {
                                                                    return true;
                                                                }
                                                                this.f19283b++;
                                                                if (TextUtils.equals(pushMessage.messageCustom.source, "topic")) {
                                                                    CoreModule.f1534c.f3634g0.m3733F6(1);
                                                                    CoreModule.f1534c.f3634g0.m3797a9();
                                                                } else {
                                                                    CoreModule.f1534c.f3631f0.m4580Fo();
                                                                }
                                                                if (!TantanApp.f1169c.m28196N() || pushMessage.silent || m21670l(String.valueOf(pushMessage.stackId - 10000)) || CoreBusinessModule.f1522c.F() || vjf0.e().y(String.valueOf(pushMessage.stackId - 10000))) {
                                                                    return true;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    return true;
                                }
                                e51.H(CoreModule.f1533b, new Runnable() { // from class: l.osa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        CoreModule.f1534c.f3559H0.m27536k5();
                                    }
                                }, 1000L);
                            }
                            zM21671m = false;
                            z = false;
                        }
                    }
                    if (TextUtils.equals(pushMessage.intent, "game.woodenfish.update")) {
                        str4 = pushMessage.content.id;
                        if (!TextUtils.isEmpty(str4)) {
                            try {
                                CoreModule.f1534c.f3631f0.f3931h2.onNext(vwb.Z(str4, Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.added)), Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.total)), Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.unread))));
                            } catch (Exception unused) {
                                return true;
                            }
                        }
                        CoreModule.f1534c.f3631f0.m4580Fo().subscribe(mkd0.H(new e30() { // from class: l.fsa
                            public final void call(Object obj) {
                                psa.m21669k(str4, (roj0) obj);
                            }
                        }, new e30() { // from class: l.gsa
                            public final void call(Object obj) {
                                psa.m21662d((Throwable) obj);
                            }
                        }));
                        return true;
                    }
                    if (TextUtils.equals(pushMessage.intent, "match.tooMany")) {
                        c30.g();
                        return true;
                    }
                    if (!pushMessage.silent && z) {
                        CoreBusinessModule.f1523d.k(pushMessage, pushTrackData, zM21671m);
                        return true;
                    }
                }
            }
            zM21671m = false;
            z = true;
            if (TextUtils.equals(pushMessage.intent, "game.woodenfish.update")) {
                str4 = pushMessage.content.id;
                if (!TextUtils.isEmpty(str4)) {
                    CoreModule.f1534c.f3631f0.f3931h2.onNext(vwb.Z(str4, Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.added)), Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.total)), Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.unread))));
                }
                CoreModule.f1534c.f3631f0.m4580Fo().subscribe(mkd0.H(new e30() { // from class: l.fsa
                    public final void call(Object obj) {
                        psa.m21669k(str4, (roj0) obj);
                    }
                }, new e30() { // from class: l.gsa
                    public final void call(Object obj) {
                        psa.m21662d((Throwable) obj);
                    }
                }));
                return true;
            }
            if (TextUtils.equals(pushMessage.intent, "match.tooMany")) {
                c30.g();
                return true;
            }
            if (!pushMessage.silent) {
                CoreBusinessModule.f1523d.k(pushMessage, pushTrackData, zM21671m);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m21673o(String str) {
        CoreModule.f1534c.f3667r0.m6031K6(false);
    }

    /* JADX INFO: renamed from: p */
    public void m21674p() {
        TantanApp.f1169c.m28209a0(new C1146a(), vwb.f0(new String[]{"unknown_", "conversation.single.delete", "message.single.update", "conversation.single", "conversation.list", "suggested.list", "huawei.unreadMsg", "local.message.secret", "secretcrush.received", "superLike.received", "superLike.invite", "user.status.changed", "user.status.good2fake", "user.verification.reason", "friendship.request", "user.membership.changed", "user.state.changed", "user.picture.verification", "suggested.liked", "gift.received.like", "push.arrival.ab.local.push", "home.picks", "rev.low.price", "lucky.money.received", "lucky.money.taken", "placesv2.challenge", "sayHiLiked.received", "letter.received", "growth.follow", "conversation.single.blocked", "friend.reminder", "quickchat.match", "selectedcard.received", "quickchat.broadcast", "boost.status", "pcs.broadcast.status", "soulship.agree", "seenotice.received", "shuoshuo.callback", "user.idcard.verification", "newMaleUserLike.received", "newMaleUserLike.send", "call.voice.single", "devicepush.list", "growth.dauMale", "chat.conversation.other_read", "user.age.verification", "call.voiceinviting.single", "conversation.notify", "conversation.single.self.delete", "push.pay.landpage", "boost.end.push", "order.firstPay.fail.sendCoupon", "userbag.couponbag.changed", "conversation.group", "message.group.update", "group.notification.list", "group.member.update", "visit.notify", "group.update", "conversation.single.update.oneside", "kankan.match", "conversation.single.message.audiotext", "conversation.group.message.audiotext", "greeting.list", "greeting.single", "greeting.update", "greeting.kankantab", "monetizationGift.chatmessage.push", "guide.update", "common.link", "voicechat.match", "see.picks", "quickchat.bell", "quickchat.bell-greet", "group.member.join", "group.member.leave", "quickchat.speed-match", "quickchat.speed-delete", "quickchat.speed-push", "conversation.group.update", "creation.soul2", "quickchat_state.push", "quickchat_state.match", "heartbeat.match.broadcast", "quickchat_state.match", "quickchat.oneside", "quickchat.oneside-delete", "avatar.like", "suggest.swipe", "heartbeat.match.link", "quickchat.bubble.chatroom", "heartbeat.match.tagFill", "chatheat.exchat", "voicechat.broadcast", "heartbeat.match.recall", "extreme_pick.list", "extreme_pick.daily", "game.woodenfish.update", "male.message.repeat", "match.tooMany", "growth.match.recall", "membership.expiration", "quickchat.party", "user.setting.changed", "intl.ai_avatar.status.change", "user.picture.tags.changed", "user.ctdid.verification", "moment-lab.verification.push", "chat.online.guide"}));
    }
}
