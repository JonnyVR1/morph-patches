package p153l;

import android.app.PendingIntent;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.api.push.PushTrackData;
import com.p051p1.mobile.putong.app.TantanApp;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.VoiceCallStatus;
import com.p051p1.mobile.putong.core.p058ui.messages.game.MsgGameMkWebViewAct;
import com.p051p1.mobile.putong.data.PushMessage;
import com.p051p1.mobile.putong.data.PushMessageContent;
import com.p051p1.mobile.putong.data.PushMessageCustom;
import com.p051p1.mobile.putong.data.PushMessageIntent;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class bua {

    /* JADX INFO: renamed from: a */
    public long f78472a = 0;

    /* JADX INFO: renamed from: b */
    public long f78473b = 0;

    /* JADX INFO: renamed from: l.bua$a */
    public class C16116a implements cmb0.InterfaceC16312g {
        public C16116a() {
        }

        @Override // p153l.cmb0.InterfaceC16312g
        /* JADX INFO: renamed from: a */
        public boolean mo103259a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            if (uqb0.f180396b0.f170324a.signedIn_()) {
                return bua.this.m106507n(CoreModule.m30929H().userId(), str, str2, pushMessage, pushTrackData);
            }
            if (!NullChecker.m82486a(pushMessage) || pushMessage.silent) {
                return false;
            }
            if (!PushMessageIntent.suggested_list.equals(pushMessage.intent) && !PushMessageIntent.huawei_unreadMsg.equals(pushMessage.intent) && (!CoreModule.m30929H().mo29162a().mo105649c() || !"devicepush.list".equals(pushMessage.intent))) {
                return true;
            }
            CoreModule.f18274m.m207536j(pushMessage, pushTrackData);
            return true;
        }

        @Override // p153l.cmb0.InterfaceC16312g
        /* JADX INFO: renamed from: b */
        public PendingIntent mo103260b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return CoreModule.f18274m.m207533e(pushMessage, pushTrackData, true);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m106495b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m106497d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m106498e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m106499f(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m106501h(uxj0 uxj0Var) {
        CoreModule.f18264c.f20381e0.m116478J9();
        if (d09.m113376m() || d09.m113377n()) {
            of7.m167420o().m167438z();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m106503j(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m106504k(String str, uxj0 uxj0Var) {
        if (TextUtils.equals(str, MsgGameMkWebViewAct.f32635j)) {
            CoreModule.f18264c.f20384f0.m33656Ge(str);
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m106505l(String str) {
        return TextUtils.equals(String.valueOf(str), NullChecker.m82486a(CoreBusinessModule.f18252c) ? CoreBusinessModule.f18252c.m193947z() : null);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m106506m(int i) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        return (userM116600p9 != null && userM116600p9.settings.previewPushMessage().booleanValue()) || i == -1;
    }

    /* JADX WARN: Code duplicated, block: B:447:0x0a30  */
    /* JADX WARN: Code duplicated, block: B:454:0x0a87  */
    /* JADX WARN: Code duplicated, block: B:456:0x0a91  */
    /* JADX WARN: Code duplicated, block: B:458:0x0a95  */
    /* JADX WARN: Code duplicated, block: B:464:0x0a3a A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public boolean m106507n(String str, String str2, String str3, final PushMessage pushMessage, PushTrackData pushTrackData) {
        boolean zM106506m;
        boolean z;
        final String str4;
        if (NullChecker.m82486a(pushMessage)) {
            if (pushMessage.intent.equals(PushMessageIntent.user_state_changed)) {
                CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
            } else if (pushMessage.intent.equals(PushMessageIntent.conversation_single_delete) && pushMessage.content.type.equals("conversation")) {
                tu2.m192703a(PushMessageIntent.conversation_single_delete, "id:" + pushMessage.content.f39652id);
                CoreModule.f18264c.f20384f0.m33653Fo();
                if (!TantanApp.f17899c.m111127N()) {
                    return true;
                }
            } else if (pushMessage.intent.equals("greeting.list")) {
                CoreModule.f18264c.f20420r0.f20778q0.m137019l(Boolean.TRUE);
                m106508o(pushMessage.messageCustom.channel);
                if (NullChecker.m82486a(pushMessage.content) && !TextUtils.isEmpty(pushMessage.content.f39652id) && TextUtils.equals(pushMessage.content.type, "greeting")) {
                    CoreModule.f18264c.f20420r0.m35093I6(pushMessage.content.f39652id);
                }
                String str5 = pushMessage.content.f39652id;
            } else if (pushMessage.intent.equals("greeting.single")) {
                CoreModule.f18264c.f20420r0.m35089G6(pushMessage.content.f39652id, TextUtils.equals(pushMessage.messageCustom.channel, "anonymous"));
                CoreModule.f18264c.f20420r0.f20778q0.m137019l(Boolean.TRUE);
                m106508o(pushMessage.messageCustom.channel);
                if (m106505l(pushMessage.content.f39652id) || esf0.m122324e().m122347y(pushMessage.content.f39652id)) {
                    return true;
                }
            } else if (pushMessage.intent.equals("greeting.update")) {
                CoreModule.f18264c.f20384f0.m33653Fo();
                CoreModule.f18264c.f20420r0.f20778q0.m137019l(Boolean.TRUE);
                m106508o(pushMessage.messageCustom.channel);
                String str6 = pushMessage.content.f39652id;
            } else if (pushMessage.intent.equals(PushMessageIntent.conversation_single_blocked) && pushMessage.content.type.equals("conversation")) {
                CoreModule.f18264c.f20381e0.m116447Ba(pushMessage.content.f39652id);
                CoreModule.f18264c.f20384f0.m33653Fo();
            } else {
                if (pushMessage.intent.equals(PushMessageIntent.conversation_single_update_oneside)) {
                    CoreModule.f18264c.f20384f0.m33653Fo();
                    return true;
                }
                if (pushMessage.intent.equals("chatheat.exchat")) {
                    CoreModule.f18264c.f20384f0.m33653Fo();
                } else {
                    if ((pushMessage.intent.equals(PushMessageIntent.conversation_single) || pushMessage.intent.equals("male.message.repeat")) && pushMessage.content.type.equals("conversation")) {
                        CoreModule.f18264c.f20328M1.m111465C3(pushMessage.content.f39652id);
                        CoreModule.f18264c.f20384f0.m33653Fo();
                        if (!TantanApp.f17899c.m111127N() || m106505l(String.valueOf(pushMessage.stackId + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL)) || esf0.m122324e().m122347y(String.valueOf(pushMessage.stackId + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL))) {
                            return true;
                        }
                        zM106506m = m106506m(pushMessage.stackId + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL);
                        z = true;
                    } else if ((pushMessage.intent.equals(PushMessageIntent.message_single_update) || pushMessage.intent.equals("message.group.update")) && pushMessage.content.type.equals("message")) {
                        if (!gra.m131637V1() && pushMessage.intent.equals("message.group.update")) {
                            return true;
                        }
                        if (NullChecker.m82486a(pushMessage.content.parent) && pushMessage.content.parent.type.equals("conversation")) {
                            if (NullChecker.m82486a(CoreModule.f18264c.f20384f0.m33859Xe(pushMessage.content.parent.f39607id))) {
                                C4891g c4891g = CoreModule.f18264c.f20384f0;
                                PushMessageContent pushMessageContent = pushMessage.content;
                                c4891g.m33725Ln(pushMessageContent.parent.f39607id, pushMessageContent.f39652id, pushMessage.messageCustom.msgSingleUpdateIgnoreConvStatus);
                            }
                            if (!TantanApp.f17899c.m111127N()) {
                                return true;
                            }
                        } else if (NullChecker.m82486a(pushMessage.content.parent) && TextUtils.equals(pushMessage.content.parent.type, "greeting")) {
                            CoreModule.f18264c.f20420r0.m35087F6(pushMessage.content.parent.f39607id, true, false);
                            CoreModule.f18264c.f20420r0.m35095J6();
                            CoreModule.f18264c.f20420r0.f20778q0.m137019l(Boolean.FALSE);
                        }
                    } else {
                        if (pushMessage.intent.equals("single.comment.delete") && pushMessage.content.type.equals("message")) {
                            if (NullChecker.m82486a(pushMessage.content.parent)) {
                                C4891g c4891g2 = CoreModule.f18264c.f20384f0;
                                PushMessageContent pushMessageContent2 = pushMessage.content;
                                c4891g2.m33761On(pushMessageContent2.parent.f39607id, pushMessageContent2.f39652id);
                            }
                            return true;
                        }
                        if (pushMessage.intent.equals(PushMessageIntent.conversation_list) || pushMessage.intent.equals("kankan.match")) {
                            CoreModule.f18264c.f20384f0.m33653Fo();
                            this.f78472a++;
                            if (!TantanApp.f17899c.m111127N()) {
                                return true;
                            }
                            if (gra.m131701j2() && pushMessage.intent.equals(PushMessageIntent.conversation_list)) {
                                if (gra.m131722n3()) {
                                    pdi.m171821d0(pushMessage.content.f39652id, true);
                                } else {
                                    wgx.m206283A().m206314N(pushMessage.content.f39652id);
                                }
                            }
                            if (gta.m132210e().m132214d().mo34882lk() && pushMessage.intent.equals(PushMessageIntent.conversation_list) && NullChecker.m82486a(pushMessage) && NullChecker.m82486a(pushMessage.content)) {
                                String str7 = pushMessage.content.f39652id;
                                if (!TextUtils.isEmpty(str7) && CoreModule.f18264c.f20446z2.m31250o3(str7)) {
                                    return true;
                                }
                            }
                        } else {
                            if (pushMessage.intent.equals("conversation.single.message.audiotext") || pushMessage.intent.equals("conversation.group.message.audiotext")) {
                                C22507a<pf60<String, String>> c22507a = CoreModule.f18264c.f20384f0.f20669c2;
                                PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
                                c22507a.m137019l(pf60.m172085a(pushMessageCustom.otherID, pushMessageCustom.messageID));
                            } else if (pushMessage.intent.equals(PushMessageIntent.user_status_changed)) {
                                CoreModule.f18264c.f20381e0.m116527W9(str).subscribe(psd0.m173597H(new y20() { // from class: l.qta
                                    @Override // p153l.y20
                                    public final void call(Object obj) {
                                        bua.m106501h((uxj0) obj);
                                    }
                                }, new y20() { // from class: l.tta
                                    @Override // p153l.y20
                                    public final void call(Object obj) {
                                        bua.m106498e((Throwable) obj);
                                    }
                                }));
                            } else if (pushMessage.intent.equals(PushMessageIntent.superLike_received) || pushMessage.intent.equals(PushMessageIntent.letter_received)) {
                                pushMessage.title = CoreModule.f18263b.getResources().getString(R$string.f19072Zp);
                                pushMessage.value = pushMessage.ticker;
                                if (NullChecker.m82486a(CoreModule.f18264c)) {
                                    CoreSuggested coreSuggested = CoreModule.f18264c.f20405m0;
                                    coreSuggested.f20124W = 0L;
                                    coreSuggested.f20127X = 0;
                                }
                            } else if (pushMessage.intent.equals(PushMessageIntent.oms_reload)) {
                                pk50.m172568j().m172583p(uqb0.f180362A);
                            } else if (pushMessage.intent.equals(PushMessageIntent.user_status_good2fake)) {
                                if (NullChecker.m82486a(Act.foreground_())) {
                                    CoreModule.f18264c.f20381e0.m116527W9(str).subscribe(psd0.m173597H(new y20() { // from class: l.uta
                                        @Override // p153l.y20
                                        public final void call(Object obj) {
                                            CoreModule.f18264c.f20335O2.put(pushMessage.primaryPicture);
                                        }
                                    }, new y20() { // from class: l.vta
                                        @Override // p153l.y20
                                        public final void call(Object obj) {
                                            bua.m106499f((Throwable) obj);
                                        }
                                    }));
                                }
                            } else if (pushMessage.intent.equals(PushMessageIntent.user_verification_reason)) {
                                if (NullChecker.m82486a(Act.foreground_()) && NullChecker.m82486a(pushMessage.value)) {
                                    CoreModule.f18264c.f20338P2.put(pushMessage.value.toString());
                                }
                            } else if (pushMessage.intent.equals(PushMessageIntent.user_membership_changed)) {
                                CoreModule.f18264c.f20381e0.m116527W9(str);
                            } else if (pushMessage.intent.equals(PushMessageIntent.user_picture_verification)) {
                                CoreModule.f18264c.f20381e0.m116527W9(str);
                                if (gra.m131654Z2()) {
                                    CoreModule.f18264c.f20306F0.m118454q3();
                                }
                                if (d09.m113376m()) {
                                    CoreModule.f18264c.f20294B0.m32620p4(str).subscribe(psd0.m173597H(new y20() { // from class: l.wta
                                        @Override // p153l.y20
                                        public final void call(Object obj) {
                                            of7.m167420o().m167438z();
                                        }
                                    }, new y20() { // from class: l.xta
                                        @Override // p153l.y20
                                        public final void call(Object obj) {
                                            bua.m106495b((Throwable) obj);
                                        }
                                    }));
                                } else if (gra.m131589K1() || gra.m131667c3()) {
                                    CoreModule.f18264c.f20294B0.m32620p4(str).subscribe(psd0.m173597H(new y20() { // from class: l.yta
                                        @Override // p153l.y20
                                        public final void call(Object obj) {
                                            CoreModule.f18264c.f20381e0.m116470H9();
                                        }
                                    }, new y20() { // from class: l.zta
                                        @Override // p153l.y20
                                        public final void call(Object obj) {
                                            bua.m106503j((Throwable) obj);
                                        }
                                    }));
                                } else {
                                    CoreModule.f18264c.f20294B0.m32620p4(str);
                                }
                            } else {
                                if (!pushMessage.intent.equals(PushMessageIntent.quickchat_match) && !pushMessage.intent.equals("quickchat.speed-match")) {
                                    if (!pushMessage.intent.equals(PushMessageIntent.quickchat_broadcast) && !pushMessage.intent.equals("quickchat.bell") && !pushMessage.intent.equals("quickchat.speed-push") && !pushMessage.intent.equals("quickchat.oneside") && (!rm50.m182044e() || !pushMessage.intent.equals("voicechat.broadcast"))) {
                                        if (pushMessage.intent.equals(PushMessageIntent.selectedcard_received)) {
                                            pushMessage.value = pushMessage.ticker;
                                        } else if (!pushMessage.intent.equals(PushMessageIntent.suggested_list) && !pushMessage.intent.equals(PushMessageIntent.huawei_unreadMsg)) {
                                            if (pushMessage.intent.equals(PushMessageIntent.suggest_swipe)) {
                                                CoreModule.f18264c.f20405m0.f20112S.m137019l(jyb.m147494Y(pushMessage.messageCustom.toJson(), Long.valueOf(uqb0.f180376H.guessedCurrentServerTime())));
                                                return true;
                                            }
                                            if (pushMessage.intent.equals(PushMessageIntent.shuoshuo_callback)) {
                                                return true;
                                            }
                                            if (pushMessage.intent.equals(PushMessageIntent.user_idcard_verification) || pushMessage.intent.equals("user.age.verification") || pushMessage.intent.equals("user.ctdid.verification")) {
                                                CoreModule.f18264c.f20381e0.m116527W9(str);
                                                CoreModule.f18264c.f20294B0.m32620p4(str);
                                            } else {
                                                if (TextUtils.equals(pushMessage.intent, "newMaleUserLike.received") || TextUtils.equals(pushMessage.intent, "newMaleUserLike.send") || TextUtils.equals(pushMessage.intent, "growth.dauMale")) {
                                                    return true;
                                                }
                                                if (TextUtils.equals(pushMessage.intent, PushMessageIntent.call_voice_single)) {
                                                    AudioBusinessType audioBusinessTypeMo171474c = pb1.m171472b().mo171474c();
                                                    if ((audioBusinessTypeMo171474c == AudioBusinessType.CHAT_ROOM_WINDOW || audioBusinessTypeMo171474c == AudioBusinessType.VIDEO_CHAT || audioBusinessTypeMo171474c == AudioBusinessType.LIVE_IN_ROOM) && TEnum.equals(VoiceCallStatus.get(pushMessage.messageCustom.voiceStatus), VoiceCallStatus.calling)) {
                                                        return true;
                                                    }
                                                    xzm0.m213760p().m213778v(pushMessage, false);
                                                    if (!w1n0.m204457d() && !pushMessage.silent) {
                                                        u17.m193903O(pushMessage.stackId);
                                                        xzm0.m213760p().m213780x(Integer.valueOf(pushMessage.stackId));
                                                        CoreBusinessModule.f18253d.m207537k(pushMessage, pushTrackData, false);
                                                    }
                                                    if (pushMessage.silent) {
                                                        u17.m193904P(pushMessage.stackId);
                                                        xzm0.m213760p().m213764g();
                                                        CoreBusinessModule.f18253d.m207530b(pushMessage.stackId);
                                                    }
                                                    return true;
                                                }
                                                if (!TextUtils.equals(pushMessage.intent, PushMessageIntent.growth_follow) && !TextUtils.equals(pushMessage.intent, "common.link") && !TextUtils.equals(pushMessage.intent, "heartbeat.match.link") && !TextUtils.equals(pushMessage.intent, "heartbeat.match.recall") && !TextUtils.equals(pushMessage.intent, "visit.notify") && !TextUtils.equals(pushMessage.intent, PushMessageIntent.see_picks)) {
                                                    if (TextUtils.equals(pushMessage.intent, PushMessageIntent.push_pay_landpage)) {
                                                        CoreModule.f18264c.f20396j0.m31588G5("purchase_result", pushMessage.messageCustom);
                                                    } else if (TextUtils.equals(pushMessage.intent, PushMessageIntent.chat_conversation_other_read)) {
                                                        C4891g c4891g3 = CoreModule.f18264c.f20384f0;
                                                        PushMessageCustom pushMessageCustom2 = pushMessage.messageCustom;
                                                        c4891g3.m34066nq(pushMessageCustom2.otherUserID, pushMessageCustom2.readUntilId);
                                                        CoreModule.f18264c.f20384f0.m33653Fo();
                                                    } else if (TextUtils.equals(pushMessage.intent, PushMessageIntent.call_voiceinviting_single)) {
                                                        u17.m193903O(pushMessage.stackId);
                                                        CoreModule.f18264c.f20384f0.m33653Fo();
                                                        if (pushMessage.content.type.equals("message") && NullChecker.m82486a(pushMessage.content.parent) && !TextUtils.isEmpty(pushMessage.content.parent.f39607id) && !TextUtils.isEmpty(pushMessage.content.f39652id) && pushMessage.content.parent.type.equals("conversation") && NullChecker.m82486a(CoreModule.f18264c.f20384f0.m33859Xe(pushMessage.content.parent.f39607id))) {
                                                            C4891g c4891g4 = CoreModule.f18264c.f20384f0;
                                                            PushMessageContent pushMessageContent3 = pushMessage.content;
                                                            c4891g4.m33713Kn(pushMessageContent3.parent.f39607id, pushMessageContent3.f39652id);
                                                        }
                                                    } else if (!TextUtils.equals(pushMessage.intent, "boost.end.push")) {
                                                        if (!TextUtils.equals(pushMessage.intent, "order.firstPay.fail.sendCoupon") && !TextUtils.equals(pushMessage.intent, "userbag.couponbag.changed")) {
                                                            if (!TextUtils.equals(pushMessage.intent, PushMessageIntent.conversation_group)) {
                                                                boolean zEquals = TextUtils.equals(pushMessage.intent, PushMessageIntent.conversation_group_update);
                                                                String str8 = pushMessage.intent;
                                                                if (zEquals) {
                                                                    if (TextUtils.equals(pushMessage.messageCustom.source, "topic")) {
                                                                        CoreModule.f18264c.f20387g0.m32806F6(1);
                                                                        CoreModule.f18264c.f20387g0.m32870a9();
                                                                    } else {
                                                                        CoreModule.f18264c.f20384f0.m33653Fo();
                                                                    }
                                                                    return true;
                                                                }
                                                                if (TextUtils.equals(str8, "group.notification.list")) {
                                                                    if (!gra.m131637V1()) {
                                                                        return true;
                                                                    }
                                                                    CoreModule.f18264c.f20387g0.m32852U8();
                                                                    if (!TantanApp.f17899c.m111127N()) {
                                                                        return true;
                                                                    }
                                                                    if (TextUtils.isEmpty(pushMessage.title)) {
                                                                        pushMessage.title = CoreModule.f18263b.getResources().getString(R$string.f19757w1);
                                                                    }
                                                                    CoreBusinessModule.f18253d.m207537k(pushMessage, pushTrackData, false);
                                                                    return true;
                                                                }
                                                                if (TextUtils.equals(pushMessage.intent, "group.member.update")) {
                                                                    if (!gra.m131637V1()) {
                                                                        return true;
                                                                    }
                                                                    PushMessageContent pushMessageContent4 = pushMessage.content;
                                                                    String str9 = pushMessageContent4.f39652id;
                                                                    String str10 = NullChecker.m82486a(pushMessageContent4.parent) ? pushMessage.content.parent.f39607id : null;
                                                                    if (!TextUtils.isEmpty(str9) && !TextUtils.isEmpty(str10)) {
                                                                        CoreModule.f18264c.f20387g0.m32867Z8(str10, str9);
                                                                    }
                                                                    return true;
                                                                }
                                                                if (TextUtils.equals(pushMessage.intent, "group.update")) {
                                                                    if (!gra.m131637V1()) {
                                                                        return true;
                                                                    }
                                                                    String str11 = pushMessage.content.f39652id;
                                                                    if (!TextUtils.isEmpty(str11)) {
                                                                        if (TextUtils.equals(pushMessage.messageCustom.source, "topic")) {
                                                                            CoreModule.f18264c.f20387g0.m32806F6(1);
                                                                            CoreModule.f18264c.f20387g0.m32870a9();
                                                                        }
                                                                        CoreModule.f18264c.f20387g0.m32861X8(str11);
                                                                        CoreModule.f18264c.f20387g0.f20527g0.m137019l(str11);
                                                                    }
                                                                    return true;
                                                                }
                                                                if (TextUtils.equals(pushMessage.intent, "monetizationGift.chatmessage.push")) {
                                                                    if (spl0.m187388n()) {
                                                                        PushMessageCustom pushMessageCustom3 = pushMessage.messageCustom;
                                                                        String str12 = pushMessageCustom3.messageID;
                                                                        String str13 = pushMessageCustom3.receiveUserID;
                                                                        if (!TextUtils.isEmpty(str12) && !TextUtils.isEmpty(str13)) {
                                                                            Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str13);
                                                                            if (NullChecker.m82486a(conversationM33859Xe)) {
                                                                                CoreModule.f18264c.f20384f0.m33713Kn(conversationM33859Xe.f56859id, str12);
                                                                            } else {
                                                                                CoreModule.f18264c.f20420r0.m35087F6(str13, true, false);
                                                                            }
                                                                        }
                                                                    }
                                                                    return true;
                                                                }
                                                                if (!TextUtils.equals(pushMessage.intent, "guide.update") && !TextUtils.equals(pushMessage.intent, PushMessageIntent.membership_expiration)) {
                                                                    if (!TextUtils.equals(pushMessage.intent, "voicechat.match")) {
                                                                        if (!TextUtils.equals(pushMessage.intent, "quickchat.bell-greet")) {
                                                                            if (!TextUtils.equals(pushMessage.intent, "quickchat.speed-delete") && !TextUtils.equals(pushMessage.intent, "quickchat.oneside-delete")) {
                                                                                if (TextUtils.equals(pushMessage.intent, "heartbeat.match.broadcast")) {
                                                                                    long jM174454o = pzi0.m174454o();
                                                                                    f49 f49Var = CoreModule.f18264c.f20313H1;
                                                                                    if ((jM174454o > f49Var.f97080h0 || f49Var.m123905K3(pushMessage.messageCustom)) && NullChecker.m82486a(pushMessage.messageCustom) && !TextUtils.isEmpty(pushMessage.messageCustom.userId)) {
                                                                                        upm.m197127X(pushMessage.messageCustom);
                                                                                    }
                                                                                    return true;
                                                                                }
                                                                                if (TextUtils.equals(pushMessage.intent, PushMessageIntent.growth_match_recall)) {
                                                                                    x19.m208996w().m209002F(pushMessage);
                                                                                    return true;
                                                                                }
                                                                                if (!TextUtils.equals(pushMessage.intent, "quickchat.party")) {
                                                                                    if (TextUtils.equals(pushMessage.intent, "user.setting.changed")) {
                                                                                        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
                                                                                        return true;
                                                                                    }
                                                                                    if (TextUtils.equals(pushMessage.intent, "user.setting.changed")) {
                                                                                        CoreModule.f18264c.f20381e0.m116527W9(CoreModule.m30929H().userId());
                                                                                        return true;
                                                                                    }
                                                                                    if (TextUtils.equals(pushMessage.intent, "moment-lab.verification.push")) {
                                                                                        CoreModule.f18264c.f20294B0.f20504j0.m137019l(Long.valueOf(pzi0.m174454o()));
                                                                                        return true;
                                                                                    }
                                                                                    if (TextUtils.equals(pushMessage.intent, "chat.online.guide")) {
                                                                                        w20.m204489d();
                                                                                        return true;
                                                                                    }
                                                                                    if (TextUtils.equals(pushMessage.intent, "intl.receive.liked")) {
                                                                                        CoreModule.f18264c.f20429u0.m31481t7();
                                                                                        return true;
                                                                                    }
                                                                                    if (TextUtils.equals(pushMessage.intent, "user.picture.tags.changed")) {
                                                                                        if (NullChecker.m82486a(pushMessage.messageCustom) && !TextUtils.isEmpty(pushMessage.messageCustom.tagID)) {
                                                                                            ArrayList arrayList = new ArrayList();
                                                                                            arrayList.add(pushMessage.messageCustom.tagID);
                                                                                            gj40.m130415o().m130445p(arrayList);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            return true;
                                                                        }
                                                                        if (!TextUtils.isEmpty(pushMessage.messageCustom.greetID)) {
                                                                            CoreModule.f18264c.f20405m0.m31997E8(pushMessage.messageCustom.greetID);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (!gra.m131637V1()) {
                                                                    return true;
                                                                }
                                                                this.f78473b++;
                                                                if (TextUtils.equals(pushMessage.messageCustom.source, "topic")) {
                                                                    CoreModule.f18264c.f20387g0.m32806F6(1);
                                                                    CoreModule.f18264c.f20387g0.m32870a9();
                                                                } else {
                                                                    CoreModule.f18264c.f20384f0.m33653Fo();
                                                                }
                                                                if (!TantanApp.f17899c.m111127N() || pushMessage.silent || m106505l(String.valueOf(pushMessage.stackId + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL)) || CoreBusinessModule.f18252c.m193932F() || esf0.m122324e().m122347y(String.valueOf(pushMessage.stackId + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL))) {
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
                                l51.m152888H(CoreModule.f18263b, new Runnable() { // from class: l.aua
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        CoreModule.f18264c.f20312H0.m155449k5();
                                    }
                                }, 1000L);
                            }
                            zM106506m = false;
                            z = false;
                        }
                    }
                    if (TextUtils.equals(pushMessage.intent, "game.woodenfish.update")) {
                        str4 = pushMessage.content.f39652id;
                        if (!TextUtils.isEmpty(str4)) {
                            try {
                                CoreModule.f18264c.f20384f0.f20684h2.m137019l(jyb.m147495Z(str4, Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.added)), Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.total)), Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.unread))));
                            } catch (Exception unused) {
                                return true;
                            }
                        }
                        CoreModule.f18264c.f20384f0.m33653Fo().subscribe(psd0.m173597H(new y20() { // from class: l.rta
                            @Override // p153l.y20
                            public final void call(Object obj) {
                                bua.m106504k(str4, (uxj0) obj);
                            }
                        }, new y20() { // from class: l.sta
                            @Override // p153l.y20
                            public final void call(Object obj) {
                                bua.m106497d((Throwable) obj);
                            }
                        }));
                        return true;
                    }
                    if (TextUtils.equals(pushMessage.intent, "match.tooMany")) {
                        w20.m204492g();
                        return true;
                    }
                    if (!pushMessage.silent && z) {
                        CoreBusinessModule.f18253d.m207537k(pushMessage, pushTrackData, zM106506m);
                        return true;
                    }
                }
            }
            zM106506m = false;
            z = true;
            if (TextUtils.equals(pushMessage.intent, "game.woodenfish.update")) {
                str4 = pushMessage.content.f39652id;
                if (!TextUtils.isEmpty(str4)) {
                    CoreModule.f18264c.f20384f0.f20684h2.m137019l(jyb.m147495Z(str4, Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.added)), Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.total)), Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.unread))));
                }
                CoreModule.f18264c.f20384f0.m33653Fo().subscribe(psd0.m173597H(new y20() { // from class: l.rta
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        bua.m106504k(str4, (uxj0) obj);
                    }
                }, new y20() { // from class: l.sta
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        bua.m106497d((Throwable) obj);
                    }
                }));
                return true;
            }
            if (TextUtils.equals(pushMessage.intent, "match.tooMany")) {
                w20.m204492g();
                return true;
            }
            if (!pushMessage.silent) {
                CoreBusinessModule.f18253d.m207537k(pushMessage, pushTrackData, zM106506m);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m106508o(String str) {
        CoreModule.f18264c.f20420r0.m35097K6(false);
    }

    /* JADX INFO: renamed from: p */
    public void m106509p() {
        TantanApp.f17899c.m111140a0(new C16116a(), jyb.m147507f0("unknown_", PushMessageIntent.conversation_single_delete, PushMessageIntent.message_single_update, PushMessageIntent.conversation_single, PushMessageIntent.conversation_list, PushMessageIntent.suggested_list, PushMessageIntent.huawei_unreadMsg, PushMessageIntent.local_message_secret, PushMessageIntent.secretcrush_received, PushMessageIntent.superLike_received, PushMessageIntent.superLike_invite, PushMessageIntent.user_status_changed, PushMessageIntent.user_status_good2fake, PushMessageIntent.user_verification_reason, PushMessageIntent.friendship_request, PushMessageIntent.user_membership_changed, PushMessageIntent.user_state_changed, PushMessageIntent.user_picture_verification, PushMessageIntent.suggested_liked, "gift.received.like", PushMessageIntent.push_arrival_ab_local_push, PushMessageIntent.home_picks, PushMessageIntent.rev_low_price, PushMessageIntent.lucky_money_received, PushMessageIntent.lucky_money_taken, "placesv2.challenge", PushMessageIntent.sayHiLiked_received, PushMessageIntent.letter_received, PushMessageIntent.growth_follow, PushMessageIntent.conversation_single_blocked, PushMessageIntent.friend_reminder, PushMessageIntent.quickchat_match, PushMessageIntent.selectedcard_received, PushMessageIntent.quickchat_broadcast, "boost.status", PushMessageIntent.pcs_broadcast_status, PushMessageIntent.soulship_agree, "seenotice.received", PushMessageIntent.shuoshuo_callback, PushMessageIntent.user_idcard_verification, "newMaleUserLike.received", "newMaleUserLike.send", PushMessageIntent.call_voice_single, "devicepush.list", "growth.dauMale", PushMessageIntent.chat_conversation_other_read, "user.age.verification", PushMessageIntent.call_voiceinviting_single, PushMessageIntent.conversation_notify, PushMessageIntent.conversation_single_self_delete, PushMessageIntent.push_pay_landpage, "boost.end.push", "order.firstPay.fail.sendCoupon", "userbag.couponbag.changed", PushMessageIntent.conversation_group, "message.group.update", "group.notification.list", "group.member.update", "visit.notify", "group.update", PushMessageIntent.conversation_single_update_oneside, "kankan.match", "conversation.single.message.audiotext", "conversation.group.message.audiotext", "greeting.list", "greeting.single", "greeting.update", "greeting.kankantab", "monetizationGift.chatmessage.push", "guide.update", "common.link", "voicechat.match", PushMessageIntent.see_picks, "quickchat.bell", "quickchat.bell-greet", "group.member.join", "group.member.leave", "quickchat.speed-match", "quickchat.speed-delete", "quickchat.speed-push", PushMessageIntent.conversation_group_update, "creation.soul2", "quickchat_state.push", "quickchat_state.match", "heartbeat.match.broadcast", "quickchat_state.match", "quickchat.oneside", "quickchat.oneside-delete", "avatar.like", PushMessageIntent.suggest_swipe, "heartbeat.match.link", "quickchat.bubble.chatroom", "heartbeat.match.tagFill", "chatheat.exchat", "voicechat.broadcast", "heartbeat.match.recall", "extreme_pick.list", "extreme_pick.daily", "game.woodenfish.update", "male.message.repeat", "match.tooMany", PushMessageIntent.growth_match_recall, PushMessageIntent.membership_expiration, "quickchat.party", "user.setting.changed", "intl.ai_avatar.status.change", "user.picture.tags.changed", "user.ctdid.verification", "moment-lab.verification.push", "chat.online.guide", "intl.receive.liked"));
    }
}
