package p149l;

import android.app.PendingIntent;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.api.push.PushTrackData;
import com.p046p1.mobile.putong.app.TantanApp;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.VoiceCallStatus;
import com.p046p1.mobile.putong.core.p053ui.messages.game.MsgGameMkWebViewAct;
import com.p046p1.mobile.putong.data.PushMessage;
import com.p046p1.mobile.putong.data.PushMessageContent;
import com.p046p1.mobile.putong.data.PushMessageCustom;
import com.p046p1.mobile.putong.data.PushMessageIntent;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.util.audio.AudioBusinessType;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes9.dex */
public class psa {

    /* JADX INFO: renamed from: a */
    public long f150984a = 0;

    /* JADX INFO: renamed from: b */
    public long f150985b = 0;

    /* JADX INFO: renamed from: l.psa$a */
    public class C19322a implements ydb0.InterfaceC21375g {
        public C19322a() {
        }

        @Override // p149l.ydb0.InterfaceC21375g
        /* JADX INFO: renamed from: a */
        public boolean mo98941a(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            if (qib0.f154713b0.f139230a.signedIn_()) {
                return psa.this.m171128n(CoreModule.m29931H().userId(), str, str2, pushMessage, pushTrackData);
            }
            if (!NullChecker.m81303a(pushMessage) || pushMessage.silent) {
                return false;
            }
            if (!PushMessageIntent.suggested_list.equals(pushMessage.intent) && !PushMessageIntent.huawei_unreadMsg.equals(pushMessage.intent) && (!CoreModule.m29931H().mo28163a().mo132033c() || !"devicepush.list".equals(pushMessage.intent))) {
                return true;
            }
            CoreModule.f17555m.m127655j(pushMessage, pushTrackData);
            return true;
        }

        @Override // p149l.ydb0.InterfaceC21375g
        /* JADX INFO: renamed from: b */
        public PendingIntent mo98942b(String str, String str2, PushMessage pushMessage, PushTrackData pushTrackData) {
            return CoreModule.f17555m.m127652e(pushMessage, pushTrackData, true);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m171116b(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m171118d(Throwable th) {
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m171119e(Throwable th) {
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ void m171120f(Throwable th) {
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m171122h(roj0 roj0Var) {
        CoreModule.f17545c.f19639e0.m169405J9();
        if (vy8.m200615m() || vy8.m200616n()) {
            ke7.m145732o().m145750z();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m171124j(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m171125k(String str, roj0 roj0Var) {
        if (TextUtils.equals(str, MsgGameMkWebViewAct.f31787j)) {
            CoreModule.f17545c.f19642f0.m32653Ge(str);
        }
    }

    /* JADX INFO: renamed from: l */
    public static boolean m171126l(String str) {
        return TextUtils.equals(String.valueOf(str), NullChecker.m81303a(CoreBusinessModule.f17533c) ? CoreBusinessModule.f17533c.m177378z() : null);
    }

    /* JADX INFO: renamed from: m */
    public static boolean m171127m(int i) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        return (userM169527p9 != null && userM169527p9.settings.previewPushMessage().booleanValue()) || i == -1;
    }

    /* JADX WARN: Code duplicated, block: B:443:0x0a1e  */
    /* JADX WARN: Code duplicated, block: B:450:0x0a75  */
    /* JADX WARN: Code duplicated, block: B:452:0x0a7f  */
    /* JADX WARN: Code duplicated, block: B:454:0x0a83  */
    /* JADX WARN: Code duplicated, block: B:460:0x0a28 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: n */
    public boolean m171128n(String str, String str2, String str3, final PushMessage pushMessage, PushTrackData pushTrackData) {
        boolean zM171127m;
        boolean z;
        final String str4;
        if (NullChecker.m81303a(pushMessage)) {
            if (pushMessage.intent.equals(PushMessageIntent.user_state_changed)) {
                CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
            } else if (pushMessage.intent.equals(PushMessageIntent.conversation_single_delete) && pushMessage.content.type.equals("conversation")) {
                du2.m113670a(PushMessageIntent.conversation_single_delete, "id:" + pushMessage.content.f38804id);
                CoreModule.f17545c.f19642f0.m32650Fo();
                if (!TantanApp.f17180c.m214249N()) {
                    return true;
                }
            } else if (pushMessage.intent.equals("greeting.list")) {
                CoreModule.f17545c.f19678r0.f20036q0.m132487l(Boolean.TRUE);
                m171129o(pushMessage.messageCustom.channel);
                if (NullChecker.m81303a(pushMessage.content) && !TextUtils.isEmpty(pushMessage.content.f38804id) && TextUtils.equals(pushMessage.content.type, "greeting")) {
                    CoreModule.f17545c.f19678r0.m34090I6(pushMessage.content.f38804id);
                }
                String str5 = pushMessage.content.f38804id;
            } else if (pushMessage.intent.equals("greeting.single")) {
                CoreModule.f17545c.f19678r0.m34086G6(pushMessage.content.f38804id, TextUtils.equals(pushMessage.messageCustom.channel, "anonymous"));
                CoreModule.f17545c.f19678r0.f20036q0.m132487l(Boolean.TRUE);
                m171129o(pushMessage.messageCustom.channel);
                if (m171126l(pushMessage.content.f38804id) || vjf0.m198623e().m198646y(pushMessage.content.f38804id)) {
                    return true;
                }
            } else if (pushMessage.intent.equals("greeting.update")) {
                CoreModule.f17545c.f19642f0.m32650Fo();
                CoreModule.f17545c.f19678r0.f20036q0.m132487l(Boolean.TRUE);
                m171129o(pushMessage.messageCustom.channel);
                String str6 = pushMessage.content.f38804id;
            } else if (pushMessage.intent.equals(PushMessageIntent.conversation_single_blocked) && pushMessage.content.type.equals("conversation")) {
                CoreModule.f17545c.f19639e0.m169374Ba(pushMessage.content.f38804id);
                CoreModule.f17545c.f19642f0.m32650Fo();
            } else {
                if (pushMessage.intent.equals(PushMessageIntent.conversation_single_update_oneside)) {
                    CoreModule.f17545c.f19642f0.m32650Fo();
                    return true;
                }
                if (pushMessage.intent.equals("chatheat.exchat")) {
                    CoreModule.f17545c.f19642f0.m32650Fo();
                } else {
                    if ((pushMessage.intent.equals(PushMessageIntent.conversation_single) || pushMessage.intent.equals("male.message.repeat")) && pushMessage.content.type.equals("conversation")) {
                        CoreModule.f17545c.f19586M1.m215240C3(pushMessage.content.f38804id);
                        CoreModule.f17545c.f19642f0.m32650Fo();
                        if (!TantanApp.f17180c.m214249N() || m171126l(String.valueOf(pushMessage.stackId + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL)) || vjf0.m198623e().m198646y(String.valueOf(pushMessage.stackId + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL))) {
                            return true;
                        }
                        zM171127m = m171127m(pushMessage.stackId + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL);
                        z = true;
                    } else if ((pushMessage.intent.equals(PushMessageIntent.message_single_update) || pushMessage.intent.equals("message.group.update")) && pushMessage.content.type.equals("message")) {
                        if (!upa.m194706V1() && pushMessage.intent.equals("message.group.update")) {
                            return true;
                        }
                        if (NullChecker.m81303a(pushMessage.content.parent) && pushMessage.content.parent.type.equals("conversation")) {
                            if (NullChecker.m81303a(CoreModule.f17545c.f19642f0.m32856Xe(pushMessage.content.parent.f38759id))) {
                                C4740g c4740g = CoreModule.f17545c.f19642f0;
                                PushMessageContent pushMessageContent = pushMessage.content;
                                c4740g.m32722Ln(pushMessageContent.parent.f38759id, pushMessageContent.f38804id, pushMessage.messageCustom.msgSingleUpdateIgnoreConvStatus);
                            }
                            if (!TantanApp.f17180c.m214249N()) {
                                return true;
                            }
                        } else if (NullChecker.m81303a(pushMessage.content.parent) && TextUtils.equals(pushMessage.content.parent.type, "greeting")) {
                            CoreModule.f17545c.f19678r0.m34084F6(pushMessage.content.parent.f38759id, true, false);
                            CoreModule.f17545c.f19678r0.m34092J6();
                            CoreModule.f17545c.f19678r0.f20036q0.m132487l(Boolean.FALSE);
                        }
                    } else {
                        if (pushMessage.intent.equals("single.comment.delete") && pushMessage.content.type.equals("message")) {
                            if (NullChecker.m81303a(pushMessage.content.parent)) {
                                C4740g c4740g2 = CoreModule.f17545c.f19642f0;
                                PushMessageContent pushMessageContent2 = pushMessage.content;
                                c4740g2.m32758On(pushMessageContent2.parent.f38759id, pushMessageContent2.f38804id);
                            }
                            return true;
                        }
                        if (pushMessage.intent.equals(PushMessageIntent.conversation_list) || pushMessage.intent.equals("kankan.match")) {
                            CoreModule.f17545c.f19642f0.m32650Fo();
                            this.f150984a++;
                            if (!TantanApp.f17180c.m214249N()) {
                                return true;
                            }
                            if (upa.m194770j2() && pushMessage.intent.equals(PushMessageIntent.conversation_list)) {
                                if (upa.m194791n3()) {
                                    aci.m95755d0(pushMessage.content.f38804id, true);
                                } else {
                                    xdx.m208433A().m208464N(pushMessage.content.f38804id);
                                }
                            }
                            if (ura.m195053e().m195057d().mo33879lk() && pushMessage.intent.equals(PushMessageIntent.conversation_list) && NullChecker.m81303a(pushMessage) && NullChecker.m81303a(pushMessage.content)) {
                                String str7 = pushMessage.content.f38804id;
                                if (!TextUtils.isEmpty(str7) && CoreModule.f17545c.f19704z2.m30252o3(str7)) {
                                    return true;
                                }
                            }
                        } else {
                            if (pushMessage.intent.equals("conversation.single.message.audiotext") || pushMessage.intent.equals("conversation.group.message.audiotext")) {
                                C22392a<j760<String, String>> c22392a = CoreModule.f17545c.f19642f0.f19927c2;
                                PushMessageCustom pushMessageCustom = pushMessage.messageCustom;
                                c22392a.m132487l(j760.m140076a(pushMessageCustom.otherID, pushMessageCustom.messageID));
                            } else if (pushMessage.intent.equals(PushMessageIntent.user_status_changed)) {
                                CoreModule.f17545c.f19639e0.m169454W9(str).subscribe(mkd0.m154956H(new e30() { // from class: l.esa
                                    @Override // p149l.e30
                                    public final void call(Object obj) {
                                        psa.m171122h((roj0) obj);
                                    }
                                }, new e30() { // from class: l.hsa
                                    @Override // p149l.e30
                                    public final void call(Object obj) {
                                        psa.m171119e((Throwable) obj);
                                    }
                                }));
                            } else if (pushMessage.intent.equals(PushMessageIntent.superLike_received) || pushMessage.intent.equals(PushMessageIntent.letter_received)) {
                                pushMessage.title = CoreModule.f17544b.getResources().getString(R$string.f17712Ep);
                                pushMessage.value = pushMessage.ticker;
                                if (NullChecker.m81303a(CoreModule.f17545c)) {
                                    CoreSuggested coreSuggested = CoreModule.f17545c.f19663m0;
                                    coreSuggested.f19382W = 0L;
                                    coreSuggested.f19385X = 0;
                                }
                            } else if (pushMessage.intent.equals(PushMessageIntent.oms_reload)) {
                                ic50.m135327j().m135342p(qib0.f154679A);
                            } else if (pushMessage.intent.equals(PushMessageIntent.user_status_good2fake)) {
                                if (NullChecker.m81303a(Act.foreground_())) {
                                    CoreModule.f17545c.f19639e0.m169454W9(str).subscribe(mkd0.m154956H(new e30() { // from class: l.isa
                                        @Override // p149l.e30
                                        public final void call(Object obj) {
                                            CoreModule.f17545c.f19593O2.put(pushMessage.primaryPicture);
                                        }
                                    }, new e30() { // from class: l.jsa
                                        @Override // p149l.e30
                                        public final void call(Object obj) {
                                            psa.m171120f((Throwable) obj);
                                        }
                                    }));
                                }
                            } else if (pushMessage.intent.equals(PushMessageIntent.user_verification_reason)) {
                                if (NullChecker.m81303a(Act.foreground_()) && NullChecker.m81303a(pushMessage.value)) {
                                    CoreModule.f17545c.f19596P2.put(pushMessage.value.toString());
                                }
                            } else if (pushMessage.intent.equals(PushMessageIntent.user_membership_changed)) {
                                CoreModule.f17545c.f19639e0.m169454W9(str);
                            } else if (pushMessage.intent.equals(PushMessageIntent.user_picture_verification)) {
                                CoreModule.f17545c.f19639e0.m169454W9(str);
                                if (upa.m194723Z2()) {
                                    CoreModule.f17545c.f19564F0.m99250q3();
                                }
                                if (vy8.m200615m()) {
                                    CoreModule.f17545c.f19552B0.m31617p4(str).subscribe(mkd0.m154956H(new e30() { // from class: l.ksa
                                        @Override // p149l.e30
                                        public final void call(Object obj) {
                                            ke7.m145732o().m145750z();
                                        }
                                    }, new e30() { // from class: l.lsa
                                        @Override // p149l.e30
                                        public final void call(Object obj) {
                                            psa.m171116b((Throwable) obj);
                                        }
                                    }));
                                } else if (upa.m194658K1() || upa.m194736c3()) {
                                    CoreModule.f17545c.f19552B0.m31617p4(str).subscribe(mkd0.m154956H(new e30() { // from class: l.msa
                                        @Override // p149l.e30
                                        public final void call(Object obj) {
                                            CoreModule.f17545c.f19639e0.m169397H9();
                                        }
                                    }, new e30() { // from class: l.nsa
                                        @Override // p149l.e30
                                        public final void call(Object obj) {
                                            psa.m171124j((Throwable) obj);
                                        }
                                    }));
                                } else {
                                    CoreModule.f17545c.f19552B0.m31617p4(str);
                                }
                            } else {
                                if (!pushMessage.intent.equals(PushMessageIntent.quickchat_match) && !pushMessage.intent.equals("quickchat.speed-match")) {
                                    if (!pushMessage.intent.equals(PushMessageIntent.quickchat_broadcast) && !pushMessage.intent.equals("quickchat.bell") && !pushMessage.intent.equals("quickchat.speed-push") && !pushMessage.intent.equals("quickchat.oneside") && (!ke50.m145718e() || !pushMessage.intent.equals("voicechat.broadcast"))) {
                                        if (pushMessage.intent.equals(PushMessageIntent.selectedcard_received)) {
                                            pushMessage.value = pushMessage.ticker;
                                        } else if (!pushMessage.intent.equals(PushMessageIntent.suggested_list) && !pushMessage.intent.equals(PushMessageIntent.huawei_unreadMsg)) {
                                            if (pushMessage.intent.equals(PushMessageIntent.suggest_swipe)) {
                                                CoreModule.f17545c.f19663m0.f19370S.m132487l(vwb.m200311Y(pushMessage.messageCustom.toJson(), Long.valueOf(qib0.f154693H.guessedCurrentServerTime())));
                                                return true;
                                            }
                                            if (pushMessage.intent.equals(PushMessageIntent.shuoshuo_callback)) {
                                                return true;
                                            }
                                            if (pushMessage.intent.equals(PushMessageIntent.user_idcard_verification) || pushMessage.intent.equals("user.age.verification") || pushMessage.intent.equals("user.ctdid.verification")) {
                                                CoreModule.f17545c.f19639e0.m169454W9(str);
                                                CoreModule.f17545c.f19552B0.m31617p4(str);
                                            } else {
                                                if (TextUtils.equals(pushMessage.intent, "newMaleUserLike.received") || TextUtils.equals(pushMessage.intent, "newMaleUserLike.send") || TextUtils.equals(pushMessage.intent, "growth.dauMale")) {
                                                    return true;
                                                }
                                                if (TextUtils.equals(pushMessage.intent, PushMessageIntent.call_voice_single)) {
                                                    AudioBusinessType audioBusinessTypeMo135235c = ib1.m135233b().mo135235c();
                                                    if ((audioBusinessTypeMo135235c == AudioBusinessType.CHAT_ROOM_WINDOW || audioBusinessTypeMo135235c == AudioBusinessType.VIDEO_CHAT || audioBusinessTypeMo135235c == AudioBusinessType.LIVE_IN_ROOM) && TEnum.equals(VoiceCallStatus.get(pushMessage.messageCustom.voiceStatus), VoiceCallStatus.calling)) {
                                                        return true;
                                                    }
                                                    tqm0.m190131p().m190149v(pushMessage, false);
                                                    if (!ssm0.m185760d() && !pushMessage.silent) {
                                                        r07.m177334O(pushMessage.stackId);
                                                        tqm0.m190131p().m190151x(Integer.valueOf(pushMessage.stackId));
                                                        CoreBusinessModule.f17534d.m127656k(pushMessage, pushTrackData, false);
                                                    }
                                                    if (pushMessage.silent) {
                                                        r07.m177335P(pushMessage.stackId);
                                                        tqm0.m190131p().m190135g();
                                                        CoreBusinessModule.f17534d.m127649b(pushMessage.stackId);
                                                    }
                                                    return true;
                                                }
                                                if (!TextUtils.equals(pushMessage.intent, PushMessageIntent.growth_follow) && !TextUtils.equals(pushMessage.intent, "common.link") && !TextUtils.equals(pushMessage.intent, "heartbeat.match.link") && !TextUtils.equals(pushMessage.intent, "heartbeat.match.recall") && !TextUtils.equals(pushMessage.intent, "visit.notify") && !TextUtils.equals(pushMessage.intent, PushMessageIntent.see_picks)) {
                                                    if (TextUtils.equals(pushMessage.intent, PushMessageIntent.push_pay_landpage)) {
                                                        CoreModule.f17545c.f19654j0.m30585G5("purchase_result", pushMessage.messageCustom);
                                                    } else if (TextUtils.equals(pushMessage.intent, PushMessageIntent.chat_conversation_other_read)) {
                                                        C4740g c4740g3 = CoreModule.f17545c.f19642f0;
                                                        PushMessageCustom pushMessageCustom2 = pushMessage.messageCustom;
                                                        c4740g3.m33063nq(pushMessageCustom2.otherUserID, pushMessageCustom2.readUntilId);
                                                        CoreModule.f17545c.f19642f0.m32650Fo();
                                                    } else if (TextUtils.equals(pushMessage.intent, PushMessageIntent.call_voiceinviting_single)) {
                                                        r07.m177334O(pushMessage.stackId);
                                                        CoreModule.f17545c.f19642f0.m32650Fo();
                                                        if (pushMessage.content.type.equals("message") && NullChecker.m81303a(pushMessage.content.parent) && !TextUtils.isEmpty(pushMessage.content.parent.f38759id) && !TextUtils.isEmpty(pushMessage.content.f38804id) && pushMessage.content.parent.type.equals("conversation") && NullChecker.m81303a(CoreModule.f17545c.f19642f0.m32856Xe(pushMessage.content.parent.f38759id))) {
                                                            C4740g c4740g4 = CoreModule.f17545c.f19642f0;
                                                            PushMessageContent pushMessageContent3 = pushMessage.content;
                                                            c4740g4.m32710Kn(pushMessageContent3.parent.f38759id, pushMessageContent3.f38804id);
                                                        }
                                                    } else if (!TextUtils.equals(pushMessage.intent, "boost.end.push")) {
                                                        if (!TextUtils.equals(pushMessage.intent, "order.firstPay.fail.sendCoupon") && !TextUtils.equals(pushMessage.intent, "userbag.couponbag.changed")) {
                                                            if (!TextUtils.equals(pushMessage.intent, PushMessageIntent.conversation_group)) {
                                                                boolean zEquals = TextUtils.equals(pushMessage.intent, PushMessageIntent.conversation_group_update);
                                                                String str8 = pushMessage.intent;
                                                                if (zEquals) {
                                                                    if (TextUtils.equals(pushMessage.messageCustom.source, "topic")) {
                                                                        CoreModule.f17545c.f19645g0.m31803F6(1);
                                                                        CoreModule.f17545c.f19645g0.m31867a9();
                                                                    } else {
                                                                        CoreModule.f17545c.f19642f0.m32650Fo();
                                                                    }
                                                                    return true;
                                                                }
                                                                if (TextUtils.equals(str8, "group.notification.list")) {
                                                                    if (!upa.m194706V1()) {
                                                                        return true;
                                                                    }
                                                                    CoreModule.f17545c.f19645g0.m31849U8();
                                                                    if (!TantanApp.f17180c.m214249N()) {
                                                                        return true;
                                                                    }
                                                                    if (TextUtils.isEmpty(pushMessage.title)) {
                                                                        pushMessage.title = CoreModule.f17544b.getResources().getString(R$string.f19020w1);
                                                                    }
                                                                    CoreBusinessModule.f17534d.m127656k(pushMessage, pushTrackData, false);
                                                                    return true;
                                                                }
                                                                if (TextUtils.equals(pushMessage.intent, "group.member.update")) {
                                                                    if (!upa.m194706V1()) {
                                                                        return true;
                                                                    }
                                                                    PushMessageContent pushMessageContent4 = pushMessage.content;
                                                                    String str9 = pushMessageContent4.f38804id;
                                                                    String str10 = NullChecker.m81303a(pushMessageContent4.parent) ? pushMessage.content.parent.f38759id : null;
                                                                    if (!TextUtils.isEmpty(str9) && !TextUtils.isEmpty(str10)) {
                                                                        CoreModule.f17545c.f19645g0.m31864Z8(str10, str9);
                                                                    }
                                                                    return true;
                                                                }
                                                                if (TextUtils.equals(pushMessage.intent, "group.update")) {
                                                                    if (!upa.m194706V1()) {
                                                                        return true;
                                                                    }
                                                                    String str11 = pushMessage.content.f38804id;
                                                                    if (!TextUtils.isEmpty(str11)) {
                                                                        if (TextUtils.equals(pushMessage.messageCustom.source, "topic")) {
                                                                            CoreModule.f17545c.f19645g0.m31803F6(1);
                                                                            CoreModule.f17545c.f19645g0.m31867a9();
                                                                        }
                                                                        CoreModule.f17545c.f19645g0.m31858X8(str11);
                                                                        CoreModule.f17545c.f19645g0.f19785g0.m132487l(str11);
                                                                    }
                                                                    return true;
                                                                }
                                                                if (TextUtils.equals(pushMessage.intent, "monetizationGift.chatmessage.push")) {
                                                                    if (ogl0.m164261n()) {
                                                                        PushMessageCustom pushMessageCustom3 = pushMessage.messageCustom;
                                                                        String str12 = pushMessageCustom3.messageID;
                                                                        String str13 = pushMessageCustom3.receiveUserID;
                                                                        if (!TextUtils.isEmpty(str12) && !TextUtils.isEmpty(str13)) {
                                                                            Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str13);
                                                                            if (NullChecker.m81303a(conversationM32856Xe)) {
                                                                                CoreModule.f17545c.f19642f0.m32710Kn(conversationM32856Xe.f56011id, str12);
                                                                            } else {
                                                                                CoreModule.f17545c.f19678r0.m34084F6(str13, true, false);
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
                                                                                    long jM155944o = mqi0.m155944o();
                                                                                    w29 w29Var = CoreModule.f17545c.f19571H1;
                                                                                    if ((jM155944o > w29Var.f184114h0 || w29Var.m201052K3(pushMessage.messageCustom)) && NullChecker.m81303a(pushMessage.messageCustom) && !TextUtils.isEmpty(pushMessage.messageCustom.userId)) {
                                                                                        snm.m185093X(pushMessage.messageCustom);
                                                                                    }
                                                                                    return true;
                                                                                }
                                                                                if (TextUtils.equals(pushMessage.intent, PushMessageIntent.growth_match_recall)) {
                                                                                    p09.m166948w().m166954F(pushMessage);
                                                                                    return true;
                                                                                }
                                                                                if (!TextUtils.equals(pushMessage.intent, "quickchat.party")) {
                                                                                    if (TextUtils.equals(pushMessage.intent, "user.setting.changed")) {
                                                                                        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
                                                                                        return true;
                                                                                    }
                                                                                    if (TextUtils.equals(pushMessage.intent, "user.setting.changed")) {
                                                                                        CoreModule.f17545c.f19639e0.m169454W9(CoreModule.m29931H().userId());
                                                                                        return true;
                                                                                    }
                                                                                    if (TextUtils.equals(pushMessage.intent, "moment-lab.verification.push")) {
                                                                                        CoreModule.f17545c.f19552B0.f19762j0.m132487l(Long.valueOf(mqi0.m155944o()));
                                                                                        return true;
                                                                                    }
                                                                                    if (TextUtils.equals(pushMessage.intent, "chat.online.guide")) {
                                                                                        c30.m104962d();
                                                                                        return true;
                                                                                    }
                                                                                    if (TextUtils.equals(pushMessage.intent, "user.picture.tags.changed")) {
                                                                                        if (NullChecker.m81303a(pushMessage.messageCustom) && !TextUtils.isEmpty(pushMessage.messageCustom.tagID)) {
                                                                                            ArrayList arrayList = new ArrayList();
                                                                                            arrayList.add(pushMessage.messageCustom.tagID);
                                                                                            sa40.m182802o().m182832p(arrayList);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            return true;
                                                                        }
                                                                        if (!TextUtils.isEmpty(pushMessage.messageCustom.greetID)) {
                                                                            CoreModule.f17545c.f19663m0.m30994E8(pushMessage.messageCustom.greetID);
                                                                        }
                                                                    }
                                                                }
                                                            } else {
                                                                if (!upa.m194706V1()) {
                                                                    return true;
                                                                }
                                                                this.f150985b++;
                                                                if (TextUtils.equals(pushMessage.messageCustom.source, "topic")) {
                                                                    CoreModule.f17545c.f19645g0.m31803F6(1);
                                                                    CoreModule.f17545c.f19645g0.m31867a9();
                                                                } else {
                                                                    CoreModule.f17545c.f19642f0.m32650Fo();
                                                                }
                                                                if (!TantanApp.f17180c.m214249N() || pushMessage.silent || m171126l(String.valueOf(pushMessage.stackId + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL)) || CoreBusinessModule.f17533c.m177363F() || vjf0.m198623e().m198646y(String.valueOf(pushMessage.stackId + ShareConstants.ERROR_LOAD_GET_INTENT_FAIL))) {
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
                                e51.m114743H(CoreModule.f17544b, new Runnable() { // from class: l.osa
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        CoreModule.f17545c.f19570H0.m210361k5();
                                    }
                                }, 1000L);
                            }
                            zM171127m = false;
                            z = false;
                        }
                    }
                    if (TextUtils.equals(pushMessage.intent, "game.woodenfish.update")) {
                        str4 = pushMessage.content.f38804id;
                        if (!TextUtils.isEmpty(str4)) {
                            try {
                                CoreModule.f17545c.f19642f0.f19942h2.m132487l(vwb.m200312Z(str4, Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.added)), Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.total)), Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.unread))));
                            } catch (Exception unused) {
                                return true;
                            }
                        }
                        CoreModule.f17545c.f19642f0.m32650Fo().subscribe(mkd0.m154956H(new e30() { // from class: l.fsa
                            @Override // p149l.e30
                            public final void call(Object obj) {
                                psa.m171125k(str4, (roj0) obj);
                            }
                        }, new e30() { // from class: l.gsa
                            @Override // p149l.e30
                            public final void call(Object obj) {
                                psa.m171118d((Throwable) obj);
                            }
                        }));
                        return true;
                    }
                    if (TextUtils.equals(pushMessage.intent, "match.tooMany")) {
                        c30.m104965g();
                        return true;
                    }
                    if (!pushMessage.silent && z) {
                        CoreBusinessModule.f17534d.m127656k(pushMessage, pushTrackData, zM171127m);
                        return true;
                    }
                }
            }
            zM171127m = false;
            z = true;
            if (TextUtils.equals(pushMessage.intent, "game.woodenfish.update")) {
                str4 = pushMessage.content.f38804id;
                if (!TextUtils.isEmpty(str4)) {
                    CoreModule.f17545c.f19642f0.f19942h2.m132487l(vwb.m200312Z(str4, Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.added)), Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.total)), Integer.valueOf(Integer.parseInt(pushMessage.messageCustom.unread))));
                }
                CoreModule.f17545c.f19642f0.m32650Fo().subscribe(mkd0.m154956H(new e30() { // from class: l.fsa
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        psa.m171125k(str4, (roj0) obj);
                    }
                }, new e30() { // from class: l.gsa
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        psa.m171118d((Throwable) obj);
                    }
                }));
                return true;
            }
            if (TextUtils.equals(pushMessage.intent, "match.tooMany")) {
                c30.m104965g();
                return true;
            }
            if (!pushMessage.silent) {
                CoreBusinessModule.f17534d.m127656k(pushMessage, pushTrackData, zM171127m);
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: o */
    public final void m171129o(String str) {
        CoreModule.f17545c.f19678r0.m34094K6(false);
    }

    /* JADX INFO: renamed from: p */
    public void m171130p() {
        TantanApp.f17180c.m214262a0(new C19322a(), vwb.m200324f0("unknown_", PushMessageIntent.conversation_single_delete, PushMessageIntent.message_single_update, PushMessageIntent.conversation_single, PushMessageIntent.conversation_list, PushMessageIntent.suggested_list, PushMessageIntent.huawei_unreadMsg, PushMessageIntent.local_message_secret, PushMessageIntent.secretcrush_received, PushMessageIntent.superLike_received, PushMessageIntent.superLike_invite, PushMessageIntent.user_status_changed, PushMessageIntent.user_status_good2fake, PushMessageIntent.user_verification_reason, PushMessageIntent.friendship_request, PushMessageIntent.user_membership_changed, PushMessageIntent.user_state_changed, PushMessageIntent.user_picture_verification, PushMessageIntent.suggested_liked, "gift.received.like", PushMessageIntent.push_arrival_ab_local_push, PushMessageIntent.home_picks, PushMessageIntent.rev_low_price, PushMessageIntent.lucky_money_received, PushMessageIntent.lucky_money_taken, "placesv2.challenge", PushMessageIntent.sayHiLiked_received, PushMessageIntent.letter_received, PushMessageIntent.growth_follow, PushMessageIntent.conversation_single_blocked, PushMessageIntent.friend_reminder, PushMessageIntent.quickchat_match, PushMessageIntent.selectedcard_received, PushMessageIntent.quickchat_broadcast, "boost.status", PushMessageIntent.pcs_broadcast_status, PushMessageIntent.soulship_agree, "seenotice.received", PushMessageIntent.shuoshuo_callback, PushMessageIntent.user_idcard_verification, "newMaleUserLike.received", "newMaleUserLike.send", PushMessageIntent.call_voice_single, "devicepush.list", "growth.dauMale", PushMessageIntent.chat_conversation_other_read, "user.age.verification", PushMessageIntent.call_voiceinviting_single, PushMessageIntent.conversation_notify, PushMessageIntent.conversation_single_self_delete, PushMessageIntent.push_pay_landpage, "boost.end.push", "order.firstPay.fail.sendCoupon", "userbag.couponbag.changed", PushMessageIntent.conversation_group, "message.group.update", "group.notification.list", "group.member.update", "visit.notify", "group.update", PushMessageIntent.conversation_single_update_oneside, "kankan.match", "conversation.single.message.audiotext", "conversation.group.message.audiotext", "greeting.list", "greeting.single", "greeting.update", "greeting.kankantab", "monetizationGift.chatmessage.push", "guide.update", "common.link", "voicechat.match", PushMessageIntent.see_picks, "quickchat.bell", "quickchat.bell-greet", "group.member.join", "group.member.leave", "quickchat.speed-match", "quickchat.speed-delete", "quickchat.speed-push", PushMessageIntent.conversation_group_update, "creation.soul2", "quickchat_state.push", "quickchat_state.match", "heartbeat.match.broadcast", "quickchat_state.match", "quickchat.oneside", "quickchat.oneside-delete", "avatar.like", PushMessageIntent.suggest_swipe, "heartbeat.match.link", "quickchat.bubble.chatroom", "heartbeat.match.tagFill", "chatheat.exchat", "voicechat.broadcast", "heartbeat.match.recall", "extreme_pick.list", "extreme_pick.daily", "game.woodenfish.update", "male.message.repeat", "match.tooMany", PushMessageIntent.growth_match_recall, PushMessageIntent.membership_expiration, "quickchat.party", "user.setting.changed", "intl.ai_avatar.status.change", "user.picture.tags.changed", "user.ctdid.verification", "moment-lab.verification.push", "chat.online.guide"));
    }
}
