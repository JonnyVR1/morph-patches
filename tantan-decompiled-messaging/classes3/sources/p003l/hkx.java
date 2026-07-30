package p003l;

import android.content.Context;
import android.net.Uri;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.base.MedialItemType;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.inject.provider.CoreBusinessService;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.LoveLetterEntryInfo;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.ui.breaking.SwapAnswerBottomSheetAct;
import com.p1.mobile.putong.core.ui.messages.redpacket.SendRedPacketAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.MediaPickerAct;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickConfig;
import com.p1.mobile.putong.newui.mediaoperation.mediapicker.config.MediaPickerParamsObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import l.c3c0;
import l.hpd0;
import l.j2e0;
import l.j760;
import l.lsi0;
import l.mcz;
import l.mqi0;
import l.o6j0;
import l.oyx;
import l.pxz;
import l.szb0;
import l.tqm0;
import l.ura;
import l.vwb;
import l.zvf0;
import p014rx.C1099c;
import p014rx.subjects.C1186b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class hkx implements ekx {

    /* JADX INFO: renamed from: a */
    public MessagesAct f4224a;

    /* JADX INFO: renamed from: b */
    public gyq f4225b;

    /* JADX INFO: renamed from: c */
    public C1186b<j760<MedialItemType, Boolean>> f4226c = C1186b.m9978b();

    /* JADX INFO: renamed from: d */
    public hpd0 f4227d;

    /* JADX INFO: renamed from: e */
    public hpd0 f4228e;

    /* JADX INFO: renamed from: l.hkx$a */
    public static /* synthetic */ class C0336a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4229a;

        static {
            int[] iArr = new int[MedialItemType.values().length];
            f4229a = iArr;
            try {
                iArr[MedialItemType.PICTURE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4229a[MedialItemType.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4229a[MedialItemType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4229a[MedialItemType.LOCATION.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4229a[MedialItemType.VOICE_CALL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4229a[MedialItemType.RED_PACKAGE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4229a[MedialItemType.CHALLENGE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4229a[MedialItemType.EXCLUSIVE_CHAT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4229a[MedialItemType.AICG.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4229a[MedialItemType.NEW_PIC.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4229a[MedialItemType.LOVE_LETTER.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4229a[MedialItemType.SWAP_ANSWER.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public hkx(MessagesAct messagesAct) {
        Boolean bool = Boolean.FALSE;
        this.f4227d = new hpd0("message_media_item_exclusive", bool);
        this.f4228e = new hpd0("message_media_item_aicg", bool);
        this.f4224a = messagesAct;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m4981c() {
    }

    /* JADX WARN: Type inference failed for: r7v9, types: [android.content.Context, com.p1.mobile.putong.core.ui.messages.MessagesAct] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p003l.ekx
    /* JADX INFO: renamed from: a */
    public void mo3900a(MedialItemType medialItemType) {
        String str = "";
        switch (C0336a.f4229a[medialItemType.ordinal()]) {
            case 1:
                o6j0.c("e_chat_more_picture", "p_chat_view", new o6j0.a[0]);
                PutongAct putongAct = this.f4224a;
                putongAct.startActivityForResult(MediaPickerAct.X1(putongAct, MediaPickerParamsObject.MediaPickerParamsObjectBuilder.aBuilder().withImagePickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().withMaxPickCount(6).showPreviewEditBtn(false).build()).withVideoPickConfig(MediaPickConfig.MediaPickConfigBuilder.aBuilder().canClickSubmitInPreviewWhenNoSelectedMedia().withMaxPickCount(1).build()).needAllSelectedMediaPreview().withSubmitButtonTitle(this.f4224a.getString(R.string.h)).withFromType(4).withIsNewUIAb(ura.e().d().I4()).build()), 786);
                this.f4224a.overridePendingTransition(szb0.e, szb0.a);
                pxz.f(this.f4224a.pageId(), this.f4224a.f1531f.m4295r3(), "photo");
                break;
            case 2:
                if (CoreModule.P().a().C(100010)) {
                    o6j0.c("e_chat_more_shoot", "p_chat_view", new o6j0.a[0]);
                    pxz.f(this.f4224a.pageId(), this.f4224a.f1531f.m4295r3(), "photograph");
                    oyx.m(this.f4224a, false, true);
                    break;
                }
                break;
            case 3:
                if (CoreModule.P().a().C(100010)) {
                    o6j0.c("e_chat_more_shoot", "p_chat_view", new o6j0.a[0]);
                    pxz.f(this.f4224a.pageId(), this.f4224a.f1531f.m4295r3(), "photograph");
                    oyx.k(this.f4224a, false, true);
                    break;
                }
                break;
            case 4:
                o6j0.c("e_chat_more_location", "p_chat_view", new o6j0.a[0]);
                CoreModule.P().i().L4(this.f4224a, 48);
                pxz.f(this.f4224a.pageId(), this.f4224a.f1531f.m4295r3(), "location");
                break;
            case 5:
                dqy dqyVarM4846u0 = this.f4224a.mo2046A0().m6499g0().m4846u0();
                if (NullChecker.a(dqyVarM4846u0) && dqyVarM4846u0.m3703d0()) {
                    lsi0.w(R.string.C5);
                } else {
                    o6j0.c("e_chat_more_voice_call", "p_chat_view", new o6j0.a[0]);
                    CoreModule.P().i().O4();
                    tqm0 tqm0VarP = tqm0.p();
                    ?? r7 = this.f4224a;
                    tqm0VarP.h((Context) r7, r7.f1531f.m4295r3(), "");
                }
                break;
            case 6:
                if (!CoreModule.K().me_().isJailed()) {
                    zvf0.u("e_send_red_packet", "p_group_chat_view", new j760[]{vwb.Y("groupchat_id", this.f4224a.mo2066l().f3542b)});
                    MessagesAct messagesAct = this.f4224a;
                    this.f4224a.startActivity(SendRedPacketAct.Z1(messagesAct, messagesAct.mo2066l().m4295r3()));
                } else {
                    CoreModule.P().i().o2();
                }
                break;
            case 7:
                zvf0.r("e_in_harmony_test_entrance_two", "p_chat_view");
                CoreBusinessService coreBusinessServiceI = CoreModule.P().i();
                MessagesAct messagesAct2 = this.f4224a;
                coreBusinessServiceI.d5(messagesAct2, "", ((DbObject) messagesAct2.mo2066l().m4325x6()).id, "conversation_plus");
                break;
            case 8:
                zvf0.r("e_private_chat_entrance", "p_chat_view");
                CoreModule.c.M1.r3(this.f4224a.f1531f.m4295r3());
                this.f4227d.put(Boolean.TRUE);
                m4986h(false, MedialItemType.EXCLUSIVE_CHAT);
                break;
            case 9:
                zvf0.r("e_paip_chat_bottom_more", "p_chat_view");
                j2e0.m(this.f4224a, Uri.parse("tantan://create_ai_avatar?uid=" + this.f4224a.mo2066l().f3542b + "&from=default"));
                this.f4228e.put(Boolean.TRUE);
                m4986h(false, MedialItemType.AICG);
                break;
            case 10:
                zvf0.r("e_newphoto_icon", "p_chat_view");
                CoreModule.c.f0.A1.put(Boolean.TRUE);
                m4986h(false, MedialItemType.NEW_PIC);
                m4987i();
                break;
            case 11:
                zvf0.r("e_love_letter", "p_chat_view");
                LoveLetterEntryInfo loveLetterEntryInfo = (LoveLetterEntryInfo) CoreModule.c.e0.U1.m9972e();
                if (loveLetterEntryInfo != null && loveLetterEntryInfo.endTime < mqi0.o()) {
                    lsi0.y("本次活动已结束");
                } else if (CoreModule.c.e0.p9().isPicVerificationVerified()) {
                    LoveLetterEntryInfo loveLetterEntryInfo2 = (LoveLetterEntryInfo) CoreModule.c.e0.U1.m9972e();
                    CoreBusinessService coreBusinessServiceI2 = CoreModule.P().i();
                    MessagesAct messagesAct3 = this.f4224a;
                    if (loveLetterEntryInfo2 != null && loveLetterEntryInfo2.count > 0) {
                        str = messagesAct3.f1531f.f3543c;
                    }
                    coreBusinessServiceI2.C1(messagesAct3, str);
                } else if (!TEnum.equals(CoreModule.c.B0.s4(), "pending")) {
                    CoreModule.P().a().J5(this.f4224a, new d30() { // from class: l.gkx
                        @Override // p003l.d30
                        public final void call() {
                            hkx.m4981c();
                        }
                    });
                } else {
                    lsi0.y("请稍后，正在审核中。");
                }
                break;
            case 12:
                zvf0.r("e_exchange_answer", "p_chat_view");
                User userM4325x6 = this.f4224a.f1531f.m4325x6();
                if (NullChecker.a(userM4325x6)) {
                    SwapAnswerBottomSheetAct.D2(this.f4224a, ((DbObject) userM4325x6).id, (String) null);
                    CoreModule.c.f0.B1.put(Boolean.TRUE);
                }
                m4986h(false, MedialItemType.SWAP_ANSWER);
                break;
        }
    }

    /* JADX INFO: renamed from: d */
    public gyq m4982d(y5z y5zVar) {
        ArrayList arrayListF0;
        ArrayList arrayList = new ArrayList();
        this.f4225b = new gyq();
        fcz<? extends DbObject, ?> fczVarMo2066l = y5zVar.m6497e0().mo2066l();
        y5zVar.m6497e0().mo2066l().m4295r3();
        if (fczVarMo2066l.m4231e4()) {
            this.f4225b.m4901e(3);
            arrayListF0 = fczVarMo2066l.m4246h4() ? vwb.f0(new MedialItemType[]{MedialItemType.PICTURE, MedialItemType.CAMERA}) : vwb.f0(new MedialItemType[]{MedialItemType.PICTURE, MedialItemType.CAMERA, MedialItemType.VIDEO, MedialItemType.LOCATION});
            ChatGroup chatGroupS6 = CoreModule.c.g0.s6(this.f4224a.mo2066l().m4295r3());
            if (!NullChecker.a(chatGroupS6) || !tbk.m7715i(chatGroupS6)) {
                arrayListF0.add(MedialItemType.RED_PACKAGE);
            }
        } else if (!CoreModule.P().i().g() || !fczVarMo2066l.m4291q4() || !NullChecker.a(fczVarMo2066l.m4325x6()) || fczVarMo2066l.m4325x6().isTeamAccount() || fczVarMo2066l.m4325x6().onlineMatchLocked() || CoreModule.P().b().Pe(fczVarMo2066l.f3551k)) {
            arrayListF0 = vwb.f0(new MedialItemType[]{MedialItemType.PICTURE, MedialItemType.CAMERA, MedialItemType.VIDEO, MedialItemType.LOCATION});
        } else {
            arrayListF0 = !CoreModule.P().i().a1() ? vwb.f0(new MedialItemType[]{MedialItemType.PICTURE, MedialItemType.CAMERA, MedialItemType.VIDEO, MedialItemType.LOCATION, MedialItemType.VOICE_CALL}) : vwb.f0(new MedialItemType[]{MedialItemType.CAMERA, MedialItemType.LOCATION, MedialItemType.PICTURE, MedialItemType.VOICE_CALL, MedialItemType.VIDEO});
        }
        if ((y5zVar.m6497e0().mo2066l() instanceof mcz) || tqm0.p().s()) {
            arrayListF0.remove(MedialItemType.VOICE_CALL);
        }
        if (fczVarMo2066l.m4218b6()) {
            arrayListF0.add(MedialItemType.EXCLUSIVE_CHAT);
        }
        if (xoy.m8735f(fczVarMo2066l.f3543c, fczVarMo2066l.m4231e4())) {
            arrayListF0.add(MedialItemType.NEW_PIC);
        }
        if (xoy.m8736g(fczVarMo2066l.f3543c, fczVarMo2066l.m4231e4(), fczVarMo2066l.m4325x6())) {
            arrayListF0.add(MedialItemType.LOVE_LETTER);
        }
        if (xoy.m8737h(fczVarMo2066l.f3543c, fczVarMo2066l.m4231e4(), fczVarMo2066l.m4325x6())) {
            arrayListF0.add(MedialItemType.SWAP_ANSWER);
        }
        if (ml6.m6413e(CoreModule.c.f0.Xe(y5zVar.m6497e0().mo2066l().m4295r3()))) {
            arrayListF0 = vwb.f0(new MedialItemType[]{MedialItemType.PICTURE, MedialItemType.VOICE_CALL, MedialItemType.LOCATION});
        }
        for (int i = 0; i < arrayListF0.size(); i++) {
            switch (C0336a.f4229a[((MedialItemType) arrayListF0.get(i)).ordinal()]) {
                case 1:
                    arrayList.add(new hyq(ura.e().d().I4() ? c3c0.Z2 : c3c0.Y2, R.string.L1, MedialItemType.PICTURE));
                    break;
                case 2:
                    arrayList.add(new hyq(ura.e().d().I4() ? c3c0.V2 : c3c0.U2, R.string.n3, MedialItemType.CAMERA));
                    break;
                case 3:
                    arrayList.add(new hyq(ura.e().d().I4() ? c3c0.d3 : c3c0.c3, R.string.o3, MedialItemType.VIDEO));
                    break;
                case 4:
                    arrayList.add(new hyq(ura.e().d().I4() ? c3c0.X2 : c3c0.W2, R.string.p3, MedialItemType.LOCATION));
                    break;
                case 5:
                    arrayList.add(new hyq(ura.e().d().I4() ? c3c0.f3 : c3c0.e3, R.string.H6, MedialItemType.VOICE_CALL));
                    break;
                case 6:
                    arrayList.add(new hyq(ura.e().d().I4() ? c3c0.b3 : c3c0.a3, R.string.j0, MedialItemType.RED_PACKAGE));
                    break;
                case 7:
                    arrayList.add(new hyq(ura.e().d().I4() ? c3c0.S1 : CoreModule.P().a().N2(), "真相测试", MedialItemType.CHALLENGE));
                    break;
                case 8:
                    hyq hyqVar = new hyq(ura.e().d().I4() ? c3c0.Y : CoreModule.P().a().N0(), "专属聊天", MedialItemType.EXCLUSIVE_CHAT);
                    if (!((Boolean) this.f4227d.get()).booleanValue()) {
                        hyqVar.m5009c(true);
                    }
                    arrayList.add(hyqVar);
                    break;
                case 9:
                    User userM4325x6 = fczVarMo2066l.m4325x6();
                    hyq hyqVar2 = new hyq(ura.e().d().I4() ? c3c0.r3 : c3c0.q3, String.format("送%s魔法照", (NullChecker.a(userM4325x6) && TEnum.equals(userM4325x6.gender, "female")) ? "她" : "他"), MedialItemType.AICG);
                    if (!((Boolean) this.f4228e.get()).booleanValue()) {
                        hyqVar2.m5009c(true);
                    }
                    arrayList.add(hyqVar2);
                    break;
                case 10:
                    hyq hyqVar3 = new hyq(ura.e().d().I4() ? c3c0.N3 : c3c0.M3, "图片玩法", MedialItemType.NEW_PIC);
                    if (!((Boolean) CoreModule.c.f0.A1.get()).booleanValue()) {
                        hyqVar3.m5009c(true);
                    }
                    arrayList.add(hyqVar3);
                    break;
                case 11:
                    hyq hyqVar4 = new hyq(ura.e().d().I4() ? c3c0.n1 : c3c0.m1, "传递情书", MedialItemType.LOVE_LETTER);
                    LoveLetterEntryInfo loveLetterEntryInfo = (LoveLetterEntryInfo) CoreModule.c.e0.U1.m9972e();
                    if (loveLetterEntryInfo == null || loveLetterEntryInfo.count <= 0) {
                        hyqVar4.m5010d("");
                    } else {
                        hyqVar4.m5010d(String.format(Locale.getDefault(), "可发送%d封情书", Integer.valueOf(loveLetterEntryInfo.count)));
                        hyqVar4.m5011e(CoreModule.c.e0.U1.map(new w9j() { // from class: l.fkx
                            @Override // p003l.w9j
                            public final Object call(Object obj) {
                                LoveLetterEntryInfo loveLetterEntryInfo2 = (LoveLetterEntryInfo) obj;
                                return Boolean.valueOf(loveLetterEntryInfo2 != null && loveLetterEntryInfo2.count > 0);
                            }
                        }));
                    }
                    arrayList.add(hyqVar4);
                    break;
                case 12:
                    hyq hyqVar5 = new hyq(ura.e().d().I4() ? c3c0.H7 : c3c0.G7, "交换答案", MedialItemType.SWAP_ANSWER);
                    if (!((Boolean) CoreModule.c.f0.B1.get()).booleanValue()) {
                        hyqVar5.m5009c(true);
                    }
                    arrayList.add(hyqVar5);
                    break;
            }
        }
        this.f4225b.m4900d(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((hyq) it.next()).m5008b(this);
        }
        return this.f4225b;
    }

    /* JADX INFO: renamed from: e */
    public C1099c<j760<MedialItemType, Boolean>> m4983e() {
        return this.f4226c;
    }

    /* JADX INFO: renamed from: f */
    public void m4984f(MedialItemType medialItemType) {
        switch (C0336a.f4229a[medialItemType.ordinal()]) {
            case 1:
                o6j0.h("e_chat_more_picture", "p_chat_view", new o6j0.a[0]);
                break;
            case 2:
                o6j0.h("e_chat_more_shoot", "p_chat_view", new o6j0.a[0]);
                break;
            case 4:
                o6j0.h("e_chat_more_location", "p_chat_view", new o6j0.a[0]);
                break;
            case 5:
                o6j0.h("e_chat_more_voice_call", "p_chat_view", new o6j0.a[0]);
                break;
            case 7:
                zvf0.x("e_in_harmony_test_entrance_two", "p_chat_view");
                break;
            case 8:
                zvf0.x("e_private_chat_entrance", "p_chat_view");
                break;
            case 9:
                zvf0.x("e_paip_chat_bottom_more", "p_chat_view");
                break;
            case 10:
                zvf0.x("e_newphoto_icon", "p_chat_view");
                break;
            case 11:
                zvf0.x("e_love_letter", "p_chat_view");
                break;
            case 12:
                zvf0.x("e_exchange_answer", "p_chat_view");
                break;
        }
    }

    /* JADX INFO: renamed from: g */
    public void m4985g() {
        if (!NullChecker.a(this.f4225b) || vwb.J(this.f4225b.f4089a)) {
            return;
        }
        Iterator<hyq> it = this.f4225b.f4089a.iterator();
        while (it.hasNext()) {
            m4984f(it.next().m5007a());
        }
    }

    /* JADX INFO: renamed from: h */
    public void m4986h(boolean z, MedialItemType medialItemType) {
        this.f4226c.onNext(j760.a(medialItemType, Boolean.valueOf(z)));
    }

    /* JADX INFO: renamed from: i */
    public final void m4987i() {
        MessagesAct messagesAct = this.f4224a;
        uxz.m8260t(messagesAct, messagesAct.f1531f.m4295r3(), "", "from_entrance_type");
    }
}
