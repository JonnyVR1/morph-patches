package p153l;

import android.net.Uri;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p051p1.mobile.putong.core.data.ReminderAction;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.p058ui.breaking.SwapAnswerBottomSheetAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.base.MedialItemType;
import com.p051p1.mobile.putong.core.p058ui.messages.redpacket.SendRedPacketAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p051p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes3.dex */
public class etx implements btx {

    /* JADX INFO: renamed from: a */
    public MessagesAct f95820a;

    /* JADX INFO: renamed from: b */
    public g0r f95821b;

    /* JADX INFO: renamed from: c */
    public C22508b<pf60<MedialItemType, Boolean>> f95822c = C22508b.m222767b();

    /* JADX INFO: renamed from: d */
    public jxd0 f95823d;

    /* JADX INFO: renamed from: e */
    public jxd0 f95824e;

    /* JADX INFO: renamed from: l.etx$a */
    public static /* synthetic */ class C16830a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f95825a;

        static {
            int[] iArr = new int[MedialItemType.values().length];
            f95825a = iArr;
            try {
                iArr[MedialItemType.PICTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95825a[MedialItemType.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95825a[MedialItemType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f95825a[MedialItemType.LOCATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f95825a[MedialItemType.VOICE_CALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f95825a[MedialItemType.RED_PACKAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f95825a[MedialItemType.CHALLENGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f95825a[MedialItemType.EXCLUSIVE_CHAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f95825a[MedialItemType.AICG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f95825a[MedialItemType.NEW_PIC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f95825a[MedialItemType.LOVE_LETTER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f95825a[MedialItemType.SWAP_ANSWER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public etx(MessagesAct messagesAct) {
        Boolean bool = Boolean.FALSE;
        this.f95823d = new jxd0("message_media_item_exclusive", bool);
        this.f95824e = new jxd0("message_media_item_aicg", bool);
        this.f95820a = messagesAct;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m122505c() {
    }

    @Override // p153l.btx
    /* JADX INFO: renamed from: a */
    public void mo106409a(MedialItemType medialItemType) {
        String str = "";
        switch (C16830a.f95825a[medialItemType.ordinal()]) {
            case 1:
                sfj0.m185596c("e_chat_more_picture", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
                MessagesAct messagesAct = this.f95820a;
                messagesAct.startActivityForResult(MediaPickerAct.m80102Y1(messagesAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(6).showPreviewEditBtn(false).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withSubmitButtonTitle(this.f95820a.getString(R$string.f21721h)).withFromType(4).withIsNewUIAb(gta.m132210e().m132214d().mo34702I4()).build()), PutongAct.REQUEST_CODE_PICKER);
                this.f95820a.overridePendingTransition(y7c0.f197767e, y7c0.f197763a);
                m600.m157133f(this.f95820a.pageId(), this.f95820a.f32488f.mo111034r3(), ReminderAction.photo);
                break;
            case 2:
                if (CoreModule.m30933P().m143405a().mo180302C(100010)) {
                    sfj0.m185596c("e_chat_more_shoot", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
                    m600.m157133f(this.f95820a.pageId(), this.f95820a.f32488f.mo111034r3(), "photograph");
                    l7y.m153161m(this.f95820a, false, true);
                    break;
                }
                break;
            case 3:
                if (CoreModule.m30933P().m143405a().mo180302C(100010)) {
                    sfj0.m185596c("e_chat_more_shoot", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
                    m600.m157133f(this.f95820a.pageId(), this.f95820a.f32488f.mo111034r3(), "photograph");
                    l7y.m153159k(this.f95820a, false, true);
                    break;
                }
                break;
            case 4:
                sfj0.m185596c("e_chat_more_location", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
                CoreModule.m30933P().m143412i().mo180356L4(this.f95820a, 48);
                m600.m157133f(this.f95820a.pageId(), this.f95820a.f32488f.mo111034r3(), "location");
                break;
            case 5:
                azy azyVarM114043u0 = this.f95820a.mo50138B0().m143374g0().m114043u0();
                if (NullChecker.m82486a(azyVarM114043u0) && azyVarM114043u0.m101199d0()) {
                    o1j0.m165649w(R$string.f21472C5);
                } else {
                    sfj0.m185596c("e_chat_more_voice_call", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
                    CoreModule.m30933P().m143412i().mo180373O4();
                    xzm0 xzm0VarM213760p = xzm0.m213760p();
                    MessagesAct messagesAct2 = this.f95820a;
                    xzm0VarM213760p.m213765h(messagesAct2, messagesAct2.f32488f.mo111034r3(), "");
                }
                break;
            case 6:
                if (!CoreModule.m30930K().me_().isJailed()) {
                    i4g0.m138523u("e_send_red_packet", "p_group_chat_view", jyb.m147494Y("groupchat_id", this.f95820a.mo50158l().f82473b));
                    MessagesAct messagesAct3 = this.f95820a;
                    this.f95820a.startActivity(SendRedPacketAct.m50936a2(messagesAct3, messagesAct3.mo50158l().mo111034r3()));
                } else {
                    CoreModule.m30933P().m143412i().mo180513o2();
                }
                break;
            case 7:
                i4g0.m138520r("e_in_harmony_test_entrance_two", OMSDialogPositon.p_chat_view);
                CoreBusinessService coreBusinessServiceM143412i = CoreModule.m30933P().m143412i();
                MessagesAct messagesAct4 = this.f95820a;
                coreBusinessServiceM143412i.mo180456d5(messagesAct4, "", messagesAct4.mo50158l().mo111064x6().f56859id, "conversation_plus");
                break;
            case 8:
                i4g0.m138520r("e_private_chat_entrance", OMSDialogPositon.p_chat_view);
                CoreModule.f18264c.f20328M1.m111473r3(this.f95820a.f32488f.mo111034r3());
                this.f95823d.put(Boolean.TRUE);
                m122510h(false, MedialItemType.EXCLUSIVE_CHAT);
                break;
            case 9:
                i4g0.m138520r("e_paip_chat_bottom_more", OMSDialogPositon.p_chat_view);
                nae0.m162083m(this.f95820a, Uri.parse("tantan://create_ai_avatar?uid=" + this.f95820a.mo50158l().f82473b + "&from=default"));
                this.f95824e.put(Boolean.TRUE);
                m122510h(false, MedialItemType.AICG);
                break;
            case 10:
                i4g0.m138520r("e_newphoto_icon", OMSDialogPositon.p_chat_view);
                CoreModule.f18264c.f20384f0.f20584A1.put(Boolean.TRUE);
                m122510h(false, MedialItemType.NEW_PIC);
                m122511i();
                break;
            case 11:
                i4g0.m138520r("e_love_letter", OMSDialogPositon.p_chat_view);
                LoveLetterEntryInfo loveLetterEntryInfoM222761e = CoreModule.f18264c.f20381e0.f89136U1.m222761e();
                if (loveLetterEntryInfoM222761e != null && loveLetterEntryInfoM222761e.endTime < pzi0.m174454o()) {
                    o1j0.m165651y("本次活动已结束");
                } else if (CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified()) {
                    LoveLetterEntryInfo loveLetterEntryInfoM222761e2 = CoreModule.f18264c.f20381e0.f89136U1.m222761e();
                    CoreBusinessService coreBusinessServiceM143412i2 = CoreModule.m30933P().m143412i();
                    MessagesAct messagesAct5 = this.f95820a;
                    if (loveLetterEntryInfoM222761e2 != null && loveLetterEntryInfoM222761e2.count > 0) {
                        str = messagesAct5.f32488f.f82474c;
                    }
                    coreBusinessServiceM143412i2.mo180304C1(messagesAct5, str);
                } else if (!TEnum.equals(CoreModule.f18264c.f20294B0.m32623s4(), "pending")) {
                    CoreModule.m30933P().m143405a().mo180345J5(this.f95820a, new x20() { // from class: l.dtx
                        @Override // p153l.x20
                        public final void call() {
                            etx.m122505c();
                        }
                    });
                } else {
                    o1j0.m165651y("请稍后，正在审核中。");
                }
                break;
            case 12:
                i4g0.m138520r("e_exchange_answer", OMSDialogPositon.p_chat_view);
                User userMo111064x6 = this.f95820a.f32488f.mo111064x6();
                if (NullChecker.m82486a(userMo111064x6)) {
                    SwapAnswerBottomSheetAct.m45633E2(this.f95820a, userMo111064x6.f56859id, null);
                    CoreModule.f18264c.f20384f0.f20587B1.put(Boolean.TRUE);
                }
                m122510h(false, MedialItemType.SWAP_ANSWER);
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public g0r m122506d(vez vezVar) {
        ArrayList arrayListM147507f0;
        ArrayList arrayList = new ArrayList();
        this.f95821b = new g0r();
        clz<? extends DbObject, ?> clzVarMo50158l = vezVar.m143372e0().mo50158l();
        vezVar.m143372e0().mo50158l().mo111034r3();
        if (clzVarMo50158l.mo110970e4()) {
            this.f95821b.m128467e(3);
            arrayListM147507f0 = clzVarMo50158l.mo110985h4() ? jyb.m147507f0(MedialItemType.PICTURE, MedialItemType.CAMERA) : jyb.m147507f0(MedialItemType.PICTURE, MedialItemType.CAMERA, MedialItemType.VIDEO, MedialItemType.LOCATION);
            ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(this.f95820a.mo50158l().mo111034r3());
            if (!NullChecker.m82486a(chatGroupM32923s6) || !jek.m144577i(chatGroupM32923s6)) {
                arrayListM147507f0.add(MedialItemType.RED_PACKAGE);
            }
        } else if (!CoreModule.m30933P().m143412i().mo180470g() || !clzVarMo50158l.mo111030q4() || !NullChecker.m82486a(clzVarMo50158l.mo111064x6()) || clzVarMo50158l.mo111064x6().isTeamAccount() || clzVarMo50158l.mo111064x6().onlineMatchLocked() || CoreModule.m30933P().m143406b().mo36103Pe(clzVarMo50158l.f82482k)) {
            arrayListM147507f0 = jyb.m147507f0(MedialItemType.PICTURE, MedialItemType.CAMERA, MedialItemType.VIDEO, MedialItemType.LOCATION);
        } else {
            arrayListM147507f0 = !CoreModule.m30933P().m143412i().mo180436a1() ? jyb.m147507f0(MedialItemType.PICTURE, MedialItemType.CAMERA, MedialItemType.VIDEO, MedialItemType.LOCATION, MedialItemType.VOICE_CALL) : jyb.m147507f0(MedialItemType.CAMERA, MedialItemType.LOCATION, MedialItemType.PICTURE, MedialItemType.VOICE_CALL, MedialItemType.VIDEO);
        }
        if ((vezVar.m143372e0().mo50158l() instanceof jlz) || xzm0.m213760p().m213775s()) {
            arrayListM147507f0.remove(MedialItemType.VOICE_CALL);
        }
        if (clzVarMo50158l.mo110957b6()) {
            arrayListM147507f0.add(MedialItemType.EXCLUSIVE_CHAT);
        }
        if (uxy.m198555f(clzVarMo50158l.f82474c, clzVarMo50158l.mo110970e4())) {
            arrayListM147507f0.add(MedialItemType.NEW_PIC);
        }
        if (uxy.m198556g(clzVarMo50158l.f82474c, clzVarMo50158l.mo110970e4(), clzVarMo50158l.mo111064x6())) {
            arrayListM147507f0.add(MedialItemType.LOVE_LETTER);
        }
        if (uxy.m198557h(clzVarMo50158l.f82474c, clzVarMo50158l.mo110970e4(), clzVarMo50158l.mo111064x6())) {
            arrayListM147507f0.add(MedialItemType.SWAP_ANSWER);
        }
        if (pm6.m172917e(CoreModule.f18264c.f20384f0.m33859Xe(vezVar.m143372e0().mo50158l().mo111034r3()))) {
            arrayListM147507f0 = jyb.m147507f0(MedialItemType.PICTURE, MedialItemType.VOICE_CALL, MedialItemType.LOCATION);
        }
        for (int i = 0; i < arrayListM147507f0.size(); i++) {
            switch (C16830a.f95825a[((MedialItemType) arrayListM147507f0.get(i)).ordinal()]) {
                case 1:
                    arrayList.add(new h0r(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113962Z2 : ibc0.f113954Y2, R$string.f21540L1, MedialItemType.PICTURE));
                    break;
                case 2:
                    arrayList.add(new h0r(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113930V2 : ibc0.f113922U2, R$string.f21779n3, MedialItemType.CAMERA));
                    break;
                case 3:
                    arrayList.add(new h0r(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113998d3 : ibc0.f113989c3, R$string.f21788o3, MedialItemType.VIDEO));
                    break;
                case 4:
                    arrayList.add(new h0r(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113946X2 : ibc0.f113938W2, R$string.f21797p3, MedialItemType.LOCATION));
                    break;
                case 5:
                    arrayList.add(new h0r(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114016f3 : ibc0.f114007e3, R$string.f21513H6, MedialItemType.VOICE_CALL));
                    break;
                case 6:
                    arrayList.add(new h0r(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113980b3 : ibc0.f113971a3, R$string.f21740j0, MedialItemType.RED_PACKAGE));
                    break;
                case 7:
                    arrayList.add(new h0r(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113905S1 : CoreModule.m30933P().m143405a().mo180367N2(), "真相测试", MedialItemType.CHALLENGE));
                    break;
                case 8:
                    h0r h0rVar = new h0r(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113951Y : CoreModule.m30933P().m143405a().mo180365N0(), "专属聊天", MedialItemType.EXCLUSIVE_CHAT);
                    if (!this.f95823d.get().booleanValue()) {
                        h0rVar.m133192c(true);
                    }
                    arrayList.add(h0rVar);
                    break;
                case 9:
                    User userMo111064x6 = clzVarMo50158l.mo111064x6();
                    h0r h0rVar2 = new h0r(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114124r3 : ibc0.f114115q3, String.format("送%s魔法照", (NullChecker.m82486a(userMo111064x6) && TEnum.equals(userMo111064x6.gender, "female")) ? "她" : "他"), MedialItemType.AICG);
                    if (!this.f95824e.get().booleanValue()) {
                        h0rVar2.m133192c(true);
                    }
                    arrayList.add(h0rVar2);
                    break;
                case 10:
                    h0r h0rVar3 = new h0r(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113863N3 : ibc0.f113854M3, "图片玩法", MedialItemType.NEW_PIC);
                    if (!CoreModule.f18264c.f20384f0.f20584A1.get().booleanValue()) {
                        h0rVar3.m133192c(true);
                    }
                    arrayList.add(h0rVar3);
                    break;
                case 11:
                    h0r h0rVar4 = new h0r(gta.m132210e().m132214d().mo34702I4() ? ibc0.f114086n1 : ibc0.f114077m1, "传递情书", MedialItemType.LOVE_LETTER);
                    LoveLetterEntryInfo loveLetterEntryInfoM222761e = CoreModule.f18264c.f20381e0.f89136U1.m222761e();
                    if (loveLetterEntryInfoM222761e == null || loveLetterEntryInfoM222761e.count <= 0) {
                        h0rVar4.m133193d("");
                    } else {
                        h0rVar4.m133193d(String.format(Locale.getDefault(), "可发送%d封情书", Integer.valueOf(loveLetterEntryInfoM222761e.count)));
                        h0rVar4.m133194e(CoreModule.f18264c.f20381e0.f89136U1.map(new qcj() { // from class: l.ctx
                            @Override // p153l.qcj
                            public final Object call(Object obj) {
                                LoveLetterEntryInfo loveLetterEntryInfo = (LoveLetterEntryInfo) obj;
                                return Boolean.valueOf(loveLetterEntryInfo != null && loveLetterEntryInfo.count > 0);
                            }
                        }));
                    }
                    arrayList.add(h0rVar4);
                    break;
                case 12:
                    h0r h0rVar5 = new h0r(gta.m132210e().m132214d().mo34702I4() ? ibc0.f113813H7 : ibc0.f113804G7, "交换答案", MedialItemType.SWAP_ANSWER);
                    if (!CoreModule.f18264c.f20384f0.f20587B1.get().booleanValue()) {
                        h0rVar5.m133192c(true);
                    }
                    arrayList.add(h0rVar5);
                    break;
            }
        }
        this.f95821b.m128466d(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((h0r) it.next()).m133191b(this);
        }
        return this.f95821b;
    }

    /* JADX INFO: renamed from: e */
    public C22421c<pf60<MedialItemType, Boolean>> m122507e() {
        return this.f95822c;
    }

    /* JADX INFO: renamed from: f */
    public void m122508f(MedialItemType medialItemType) {
        switch (C16830a.f95825a[medialItemType.ordinal()]) {
            case 1:
                sfj0.m185601h("e_chat_more_picture", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
                break;
            case 2:
                sfj0.m185601h("e_chat_more_shoot", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
                break;
            case 4:
                sfj0.m185601h("e_chat_more_location", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
                break;
            case 5:
                sfj0.m185601h("e_chat_more_voice_call", OMSDialogPositon.p_chat_view, new sfj0.C20032a[0]);
                break;
            case 7:
                i4g0.m138526x("e_in_harmony_test_entrance_two", OMSDialogPositon.p_chat_view);
                break;
            case 8:
                i4g0.m138526x("e_private_chat_entrance", OMSDialogPositon.p_chat_view);
                break;
            case 9:
                i4g0.m138526x("e_paip_chat_bottom_more", OMSDialogPositon.p_chat_view);
                break;
            case 10:
                i4g0.m138526x("e_newphoto_icon", OMSDialogPositon.p_chat_view);
                break;
            case 11:
                i4g0.m138526x("e_love_letter", OMSDialogPositon.p_chat_view);
                break;
            case 12:
                i4g0.m138526x("e_exchange_answer", OMSDialogPositon.p_chat_view);
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m122509g() {
        if (!NullChecker.m82486a(this.f95821b) || jyb.m147479J(this.f95821b.f101675a)) {
            return;
        }
        Iterator<h0r> it = this.f95821b.f101675a.iterator();
        while (it.hasNext()) {
            m122508f(it.next().m133190a());
        }
    }

    /* JADX INFO: renamed from: h */
    public void m122510h(boolean z, MedialItemType medialItemType) {
        this.f95822c.onNext(pf60.m172085a(medialItemType, Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: i */
    public final void m122511i() {
        MessagesAct messagesAct = this.f95820a;
        r600.m179973t(messagesAct, messagesAct.f32488f.mo111034r3(), "", "from_entrance_type");
    }
}
