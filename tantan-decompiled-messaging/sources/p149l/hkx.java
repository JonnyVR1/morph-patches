package p149l;

import android.net.Uri;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p046p1.mobile.putong.core.data.ReminderAction;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.p053ui.breaking.SwapAnswerBottomSheetAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.base.MedialItemType;
import com.p046p1.mobile.putong.core.p053ui.messages.redpacket.SendRedPacketAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p046p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes3.dex */
public class hkx implements ekx {

    /* JADX INFO: renamed from: a */
    public MessagesAct f108293a;

    /* JADX INFO: renamed from: b */
    public gyq f108294b;

    /* JADX INFO: renamed from: c */
    public C22393b<j760<MedialItemType, Boolean>> f108295c = C22393b.m221521b();

    /* JADX INFO: renamed from: d */
    public hpd0 f108296d;

    /* JADX INFO: renamed from: e */
    public hpd0 f108297e;

    /* JADX INFO: renamed from: l.hkx$a */
    public static /* synthetic */ class C17335a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f108298a;

        static {
            int[] iArr = new int[MedialItemType.values().length];
            f108298a = iArr;
            try {
                iArr[MedialItemType.PICTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f108298a[MedialItemType.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f108298a[MedialItemType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f108298a[MedialItemType.LOCATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f108298a[MedialItemType.VOICE_CALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f108298a[MedialItemType.RED_PACKAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f108298a[MedialItemType.CHALLENGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f108298a[MedialItemType.EXCLUSIVE_CHAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f108298a[MedialItemType.AICG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f108298a[MedialItemType.NEW_PIC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f108298a[MedialItemType.LOVE_LETTER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f108298a[MedialItemType.SWAP_ANSWER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public hkx(MessagesAct messagesAct) {
        Boolean bool = Boolean.FALSE;
        this.f108296d = new hpd0("message_media_item_exclusive", bool);
        this.f108297e = new hpd0("message_media_item_aicg", bool);
        this.f108293a = messagesAct;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m131602c() {
    }

    @Override // p149l.ekx
    /* JADX INFO: renamed from: a */
    public void mo117015a(MedialItemType medialItemType) {
        String str = "";
        switch (C17335a.f108298a[medialItemType.ordinal()]) {
            case 1:
                o6j0.m162859c("e_chat_more_picture", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
                MessagesAct messagesAct = this.f108293a;
                messagesAct.startActivityForResult(MediaPickerAct.m78919X1(messagesAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(6).showPreviewEditBtn(false).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withSubmitButtonTitle(this.f108293a.getString(R$string.f20979h)).withFromType(4).withIsNewUIAb(ura.m195053e().m195057d().mo33699I4()).build()), PutongAct.REQUEST_CODE_PICKER);
                this.f108293a.overridePendingTransition(szb0.f167030e, szb0.f167026a);
                pxz.m171969f(this.f108293a.pageId(), this.f108293a.f31640f.mo120828r3(), ReminderAction.photo);
                break;
            case 2:
                if (CoreModule.m29935P().m94651a().mo158210C(100010)) {
                    o6j0.m162859c("e_chat_more_shoot", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
                    pxz.m171969f(this.f108293a.pageId(), this.f108293a.f31640f.mo120828r3(), "photograph");
                    oyx.m166739m(this.f108293a, false, true);
                    break;
                }
                break;
            case 3:
                if (CoreModule.m29935P().m94651a().mo158210C(100010)) {
                    o6j0.m162859c("e_chat_more_shoot", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
                    pxz.m171969f(this.f108293a.pageId(), this.f108293a.f31640f.mo120828r3(), "photograph");
                    oyx.m166737k(this.f108293a, false, true);
                    break;
                }
                break;
            case 4:
                o6j0.m162859c("e_chat_more_location", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
                CoreModule.m29935P().m94658i().mo158264L4(this.f108293a, 48);
                pxz.m171969f(this.f108293a.pageId(), this.f108293a.f31640f.mo120828r3(), "location");
                break;
            case 5:
                dqy dqyVarM128212u0 = this.f108293a.mo48954A0().m156457g0().m128212u0();
                if (NullChecker.m81303a(dqyVarM128212u0) && dqyVarM128212u0.m113220d0()) {
                    lsi0.m151593w(R$string.f20730C5);
                } else {
                    o6j0.m162859c("e_chat_more_voice_call", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
                    CoreModule.m29935P().m94658i().mo158281O4();
                    tqm0 tqm0VarM190131p = tqm0.m190131p();
                    MessagesAct messagesAct2 = this.f108293a;
                    tqm0VarM190131p.m190136h(messagesAct2, messagesAct2.f31640f.mo120828r3(), "");
                }
                break;
            case 6:
                if (!CoreModule.m29932K().me_().isJailed()) {
                    zvf0.m220399u("e_send_red_packet", "p_group_chat_view", vwb.m200311Y("groupchat_id", this.f108293a.mo48974l().f96910b));
                    MessagesAct messagesAct3 = this.f108293a;
                    this.f108293a.startActivity(SendRedPacketAct.m49753Z1(messagesAct3, messagesAct3.mo48974l().mo120828r3()));
                } else {
                    CoreModule.m29935P().m94658i().mo158421o2();
                }
                break;
            case 7:
                zvf0.m220396r("e_in_harmony_test_entrance_two", OMSDialogPositon.p_chat_view);
                CoreBusinessService coreBusinessServiceM94658i = CoreModule.m29935P().m94658i();
                MessagesAct messagesAct4 = this.f108293a;
                coreBusinessServiceM94658i.mo158364d5(messagesAct4, "", messagesAct4.mo48974l().mo120858x6().f56011id, "conversation_plus");
                break;
            case 8:
                zvf0.m220396r("e_private_chat_entrance", OMSDialogPositon.p_chat_view);
                CoreModule.f17545c.f19586M1.m215248r3(this.f108293a.f31640f.mo120828r3());
                this.f108296d.put(Boolean.TRUE);
                m131607h(false, MedialItemType.EXCLUSIVE_CHAT);
                break;
            case 9:
                zvf0.m220396r("e_paip_chat_bottom_more", OMSDialogPositon.p_chat_view);
                j2e0.m139446m(this.f108293a, Uri.parse("tantan://create_ai_avatar?uid=" + this.f108293a.mo48974l().f96910b + "&from=default"));
                this.f108297e.put(Boolean.TRUE);
                m131607h(false, MedialItemType.AICG);
                break;
            case 10:
                zvf0.m220396r("e_newphoto_icon", OMSDialogPositon.p_chat_view);
                CoreModule.f17545c.f19642f0.f19842A1.put(Boolean.TRUE);
                m131607h(false, MedialItemType.NEW_PIC);
                m131608i();
                break;
            case 11:
                zvf0.m220396r("e_love_letter", OMSDialogPositon.p_chat_view);
                LoveLetterEntryInfo loveLetterEntryInfoM221515e = CoreModule.f17545c.f19639e0.f149279U1.m221515e();
                if (loveLetterEntryInfoM221515e != null && loveLetterEntryInfoM221515e.endTime < mqi0.m155944o()) {
                    lsi0.m151595y("本次活动已结束");
                } else if (CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified()) {
                    LoveLetterEntryInfo loveLetterEntryInfoM221515e2 = CoreModule.f17545c.f19639e0.f149279U1.m221515e();
                    CoreBusinessService coreBusinessServiceM94658i2 = CoreModule.m29935P().m94658i();
                    MessagesAct messagesAct5 = this.f108293a;
                    if (loveLetterEntryInfoM221515e2 != null && loveLetterEntryInfoM221515e2.count > 0) {
                        str = messagesAct5.f31640f.f96911c;
                    }
                    coreBusinessServiceM94658i2.mo158212C1(messagesAct5, str);
                } else if (!TEnum.equals(CoreModule.f17545c.f19552B0.m31620s4(), "pending")) {
                    CoreModule.m29935P().m94651a().mo158253J5(this.f108293a, new d30() { // from class: l.gkx
                        @Override // p149l.d30
                        public final void call() {
                            hkx.m131602c();
                        }
                    });
                } else {
                    lsi0.m151595y("请稍后，正在审核中。");
                }
                break;
            case 12:
                zvf0.m220396r("e_exchange_answer", OMSDialogPositon.p_chat_view);
                User userMo120858x6 = this.f108293a.f31640f.mo120858x6();
                if (NullChecker.m81303a(userMo120858x6)) {
                    SwapAnswerBottomSheetAct.m44449D2(this.f108293a, userMo120858x6.f56011id, null);
                    CoreModule.f17545c.f19642f0.f19845B1.put(Boolean.TRUE);
                }
                m131607h(false, MedialItemType.SWAP_ANSWER);
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public gyq m131603d(y5z y5zVar) {
        ArrayList arrayListM200324f0;
        ArrayList arrayList = new ArrayList();
        this.f108294b = new gyq();
        fcz<? extends DbObject, ?> fczVarMo48974l = y5zVar.m156455e0().mo48974l();
        y5zVar.m156455e0().mo48974l().mo120828r3();
        if (fczVarMo48974l.mo120764e4()) {
            this.f108294b.m128730e(3);
            arrayListM200324f0 = fczVarMo48974l.mo120779h4() ? vwb.m200324f0(MedialItemType.PICTURE, MedialItemType.CAMERA) : vwb.m200324f0(MedialItemType.PICTURE, MedialItemType.CAMERA, MedialItemType.VIDEO, MedialItemType.LOCATION);
            ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(this.f108293a.mo48974l().mo120828r3());
            if (!NullChecker.m81303a(chatGroupM31920s6) || !tbk.m187862i(chatGroupM31920s6)) {
                arrayListM200324f0.add(MedialItemType.RED_PACKAGE);
            }
        } else if (!CoreModule.m29935P().m94658i().mo158378g() || !fczVarMo48974l.mo120824q4() || !NullChecker.m81303a(fczVarMo48974l.mo120858x6()) || fczVarMo48974l.mo120858x6().isTeamAccount() || fczVarMo48974l.mo120858x6().onlineMatchLocked() || CoreModule.m29935P().m94652b().mo35100Pe(fczVarMo48974l.f96919k)) {
            arrayListM200324f0 = vwb.m200324f0(MedialItemType.PICTURE, MedialItemType.CAMERA, MedialItemType.VIDEO, MedialItemType.LOCATION);
        } else {
            arrayListM200324f0 = !CoreModule.m29935P().m94658i().mo158344a1() ? vwb.m200324f0(MedialItemType.PICTURE, MedialItemType.CAMERA, MedialItemType.VIDEO, MedialItemType.LOCATION, MedialItemType.VOICE_CALL) : vwb.m200324f0(MedialItemType.CAMERA, MedialItemType.LOCATION, MedialItemType.PICTURE, MedialItemType.VOICE_CALL, MedialItemType.VIDEO);
        }
        if ((y5zVar.m156455e0().mo48974l() instanceof mcz) || tqm0.m190131p().m190146s()) {
            arrayListM200324f0.remove(MedialItemType.VOICE_CALL);
        }
        if (fczVarMo48974l.mo120751b6()) {
            arrayListM200324f0.add(MedialItemType.EXCLUSIVE_CHAT);
        }
        if (xoy.m210451f(fczVarMo48974l.f96911c, fczVarMo48974l.mo120764e4())) {
            arrayListM200324f0.add(MedialItemType.NEW_PIC);
        }
        if (xoy.m210452g(fczVarMo48974l.f96911c, fczVarMo48974l.mo120764e4(), fczVarMo48974l.mo120858x6())) {
            arrayListM200324f0.add(MedialItemType.LOVE_LETTER);
        }
        if (xoy.m210453h(fczVarMo48974l.f96911c, fczVarMo48974l.mo120764e4(), fczVarMo48974l.mo120858x6())) {
            arrayListM200324f0.add(MedialItemType.SWAP_ANSWER);
        }
        if (ml6.m155120e(CoreModule.f17545c.f19642f0.m32856Xe(y5zVar.m156455e0().mo48974l().mo120828r3()))) {
            arrayListM200324f0 = vwb.m200324f0(MedialItemType.PICTURE, MedialItemType.VOICE_CALL, MedialItemType.LOCATION);
        }
        for (int i = 0; i < arrayListM200324f0.size(); i++) {
            switch (C17335a.f108298a[((MedialItemType) arrayListM200324f0.get(i)).ordinal()]) {
                case 1:
                    arrayList.add(new hyq(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78687Z2 : c3c0.f78679Y2, R$string.f20798L1, MedialItemType.PICTURE));
                    break;
                case 2:
                    arrayList.add(new hyq(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78655V2 : c3c0.f78647U2, R$string.f21037n3, MedialItemType.CAMERA));
                    break;
                case 3:
                    arrayList.add(new hyq(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78723d3 : c3c0.f78714c3, R$string.f21046o3, MedialItemType.VIDEO));
                    break;
                case 4:
                    arrayList.add(new hyq(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78671X2 : c3c0.f78663W2, R$string.f21055p3, MedialItemType.LOCATION));
                    break;
                case 5:
                    arrayList.add(new hyq(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78741f3 : c3c0.f78732e3, R$string.f20771H6, MedialItemType.VOICE_CALL));
                    break;
                case 6:
                    arrayList.add(new hyq(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78705b3 : c3c0.f78696a3, R$string.f20998j0, MedialItemType.RED_PACKAGE));
                    break;
                case 7:
                    arrayList.add(new hyq(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78630S1 : CoreModule.m29935P().m94651a().mo158275N2(), "真相测试", MedialItemType.CHALLENGE));
                    break;
                case 8:
                    hyq hyqVar = new hyq(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78676Y : CoreModule.m29935P().m94651a().mo158273N0(), "专属聊天", MedialItemType.EXCLUSIVE_CHAT);
                    if (!this.f108296d.get().booleanValue()) {
                        hyqVar.m133622c(true);
                    }
                    arrayList.add(hyqVar);
                    break;
                case 9:
                    User userMo120858x6 = fczVarMo48974l.mo120858x6();
                    hyq hyqVar2 = new hyq(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78849r3 : c3c0.f78840q3, String.format("送%s魔法照", (NullChecker.m81303a(userMo120858x6) && TEnum.equals(userMo120858x6.gender, "female")) ? "她" : "他"), MedialItemType.AICG);
                    if (!this.f108297e.get().booleanValue()) {
                        hyqVar2.m133622c(true);
                    }
                    arrayList.add(hyqVar2);
                    break;
                case 10:
                    hyq hyqVar3 = new hyq(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78588N3 : c3c0.f78579M3, "图片玩法", MedialItemType.NEW_PIC);
                    if (!CoreModule.f17545c.f19642f0.f19842A1.get().booleanValue()) {
                        hyqVar3.m133622c(true);
                    }
                    arrayList.add(hyqVar3);
                    break;
                case 11:
                    hyq hyqVar4 = new hyq(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78811n1 : c3c0.f78802m1, "传递情书", MedialItemType.LOVE_LETTER);
                    LoveLetterEntryInfo loveLetterEntryInfoM221515e = CoreModule.f17545c.f19639e0.f149279U1.m221515e();
                    if (loveLetterEntryInfoM221515e == null || loveLetterEntryInfoM221515e.count <= 0) {
                        hyqVar4.m133623d("");
                    } else {
                        hyqVar4.m133623d(String.format(Locale.getDefault(), "可发送%d封情书", Integer.valueOf(loveLetterEntryInfoM221515e.count)));
                        hyqVar4.m133624e(CoreModule.f17545c.f19639e0.f149279U1.map(new w9j() { // from class: l.fkx
                            @Override // p149l.w9j
                            public final Object call(Object obj) {
                                LoveLetterEntryInfo loveLetterEntryInfo = (LoveLetterEntryInfo) obj;
                                return Boolean.valueOf(loveLetterEntryInfo != null && loveLetterEntryInfo.count > 0);
                            }
                        }));
                    }
                    arrayList.add(hyqVar4);
                    break;
                case 12:
                    hyq hyqVar5 = new hyq(ura.m195053e().m195057d().mo33699I4() ? c3c0.f78538H7 : c3c0.f78529G7, "交换答案", MedialItemType.SWAP_ANSWER);
                    if (!CoreModule.f17545c.f19642f0.f19845B1.get().booleanValue()) {
                        hyqVar5.m133622c(true);
                    }
                    arrayList.add(hyqVar5);
                    break;
            }
        }
        this.f108294b.m128729d(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((hyq) it.next()).m133621b(this);
        }
        return this.f108294b;
    }

    /* JADX INFO: renamed from: e */
    public C22306c<j760<MedialItemType, Boolean>> m131604e() {
        return this.f108295c;
    }

    /* JADX INFO: renamed from: f */
    public void m131605f(MedialItemType medialItemType) {
        switch (C17335a.f108298a[medialItemType.ordinal()]) {
            case 1:
                o6j0.m162864h("e_chat_more_picture", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
                break;
            case 2:
                o6j0.m162864h("e_chat_more_shoot", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
                break;
            case 4:
                o6j0.m162864h("e_chat_more_location", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
                break;
            case 5:
                o6j0.m162864h("e_chat_more_voice_call", OMSDialogPositon.p_chat_view, new o6j0.C18854a[0]);
                break;
            case 7:
                zvf0.m220402x("e_in_harmony_test_entrance_two", OMSDialogPositon.p_chat_view);
                break;
            case 8:
                zvf0.m220402x("e_private_chat_entrance", OMSDialogPositon.p_chat_view);
                break;
            case 9:
                zvf0.m220402x("e_paip_chat_bottom_more", OMSDialogPositon.p_chat_view);
                break;
            case 10:
                zvf0.m220402x("e_newphoto_icon", OMSDialogPositon.p_chat_view);
                break;
            case 11:
                zvf0.m220402x("e_love_letter", OMSDialogPositon.p_chat_view);
                break;
            case 12:
                zvf0.m220402x("e_exchange_answer", OMSDialogPositon.p_chat_view);
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m131606g() {
        if (!NullChecker.m81303a(this.f108294b) || vwb.m200296J(this.f108294b.f105032a)) {
            return;
        }
        Iterator<hyq> it = this.f108294b.f105032a.iterator();
        while (it.hasNext()) {
            m131605f(it.next().m133620a());
        }
    }

    /* JADX INFO: renamed from: h */
    public void m131607h(boolean z, MedialItemType medialItemType) {
        this.f108295c.onNext(j760.m140076a(medialItemType, Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: i */
    public final void m131608i() {
        MessagesAct messagesAct = this.f108293a;
        uxz.m196230t(messagesAct, messagesAct.f31640f.mo120828r3(), "", "from_entrance_type");
    }
}
