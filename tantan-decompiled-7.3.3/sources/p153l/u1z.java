package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.firebase.messaging.Constants;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.data.ChatGroupMember;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.Sticker;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.helper.MessageWarmingUpHelper;
import com.p051p1.mobile.putong.core.p058ui.messages.model.messagebar.MessageBarActionItemType;
import com.p051p1.mobile.putong.core.p058ui.messages.sogou.C8748b;
import com.p051p1.mobile.putong.core.p058ui.messages.sogou.ImageHeaderParser;
import com.p051p1.mobile.putong.core.p058ui.messages.view.MessageInputBaseEditView;
import com.p051p1.mobile.putong.data.Dimension;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.MediaLocalStatus;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.webview.p073mk.MkWebViewAct;
import com.p051p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONObject;
import org.spongycastle.crypto.tls.CipherSuite;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes4.dex */
public class u1z extends j3z<d3z> {

    /* JADX INFO: renamed from: g */
    public static C22508b<uxj0> f177142g = C22508b.m222767b();

    /* JADX INFO: renamed from: h */
    public static int f177143h = 10;

    /* JADX INFO: renamed from: i */
    public static int f177144i = 20;

    /* JADX INFO: renamed from: j */
    public static jxd0 f177145j;

    /* JADX INFO: renamed from: k */
    public static jxd0 f177146k;

    /* JADX INFO: renamed from: b */
    public int f177147b;

    /* JADX INFO: renamed from: c */
    public C22507a<String> f177148c;

    /* JADX INFO: renamed from: d */
    public l4g0 f177149d;

    /* JADX INFO: renamed from: e */
    public boolean f177150e;

    /* JADX INFO: renamed from: f */
    public boolean f177151f;

    /* JADX INFO: renamed from: l.u1z$a */
    public class C20460a implements j6e {
        public C20460a() {
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: a */
        public void mo38396a() {
            CoreModule.m30933P().m143412i().mo180460e3("message");
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: b */
        public void mo38397b(boolean z) {
            CoreModule.m30933P().m143412i().mo180544u2("message", z);
        }

        @Override // p153l.j6e
        /* JADX INFO: renamed from: c */
        public void mo38398c() {
            CoreModule.m30933P().m143412i().mo180321F1("message");
        }
    }

    /* JADX INFO: renamed from: l.u1z$b */
    public class C20461b implements k6e {
        public C20461b() {
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: a */
        public void mo38393a() {
            CoreModule.m30933P().m143412i().mo180424X2("message");
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: b */
        public void mo38394b() {
            CoreModule.m30933P().m143412i().mo180574z4("message");
        }

        @Override // p153l.k6e
        /* JADX INFO: renamed from: c */
        public void mo38395c() {
            CoreModule.m30933P().m143412i().mo180485i4("message");
        }
    }

    /* JADX INFO: renamed from: l.u1z$c */
    public class C20462c implements l6e {
        public C20462c() {
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: a */
        public void mo38404a() {
            CoreModule.m30933P().m143412i().mo180532r4("message");
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: b */
        public void mo38405b() {
            CoreModule.m30933P().m143412i().mo180414V5("message");
        }

        @Override // p153l.l6e
        /* JADX INFO: renamed from: c */
        public void mo38406c() {
            CoreModule.m30933P().m143412i().mo180384Q5("message");
        }
    }

    /* JADX INFO: renamed from: l.u1z$d */
    public class C20463d implements e6m {
        public C20463d() {
        }

        @Override // p153l.e6m
        public boolean disableAutoPV() {
            return false;
        }

        @Override // p153l.e6m
        public String pageId() {
            return "p_chat_view_sensitiveword_block_popup_show";
        }
    }

    /* JADX INFO: renamed from: l.u1z$e */
    public static /* synthetic */ class C20464e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f177156a;

        static {
            int[] iArr = new int[ImageHeaderParser.ImageType.values().length];
            f177156a = iArr;
            try {
                iArr[ImageHeaderParser.ImageType.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f177156a[ImageHeaderParser.ImageType.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f177156a[ImageHeaderParser.ImageType.PNG_A.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f177156a[ImageHeaderParser.ImageType.GIF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f177156a[ImageHeaderParser.ImageType.WEBP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f177156a[ImageHeaderParser.ImageType.WEBP_A.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f177145j = new jxd0("r_s_t_1_s", bool);
        f177146k = new jxd0("r_s_t_2_s", bool);
    }

    public u1z(ner nerVar) {
        super(nerVar);
        this.f177147b = 1;
        this.f177148c = C22507a.m222758b();
        this.f177149d = new l4g0(new C20463d());
        this.f177150e = false;
        this.f177151f = false;
    }

    /* JADX INFO: renamed from: D1 */
    private boolean m194122D1() {
        return m143372e0().mo50158l().f82456J.get().booleanValue();
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m194139X0(Throwable th) {
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m194142b1(Throwable th) {
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ void m194143c1(String str, String str2, String str3, Dialog dialog, View view) {
        sfj0.m185596c("e_chat_view_sensitiveword_block_popup", "p_chat_view_sensitiveword_block_popup_show", sfj0.C20032a.m185615h(Constants.MessagePayloadKeys.MSGID_SERVER, ""), sfj0.C20032a.m185615h("message_send_status", ""), sfj0.C20032a.m185615h("message_receiver", str), sfj0.C20032a.m185615h("sensitiveword", str2), sfj0.C20032a.m185615h("sensitive_text", str3), sfj0.C20032a.m185615h("message_send_values", "reject"));
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m194148h0() {
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ Conversation m194149h1(Boolean bool, Conversation conversation) {
        return conversation;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m194153l0(Throwable th) {
    }

    /* JADX INFO: renamed from: o1 */
    private void m194157o1(final String str) {
        uqb0.f180394Z.m95960Q(str, OmsDialog.p_user_passive_show_chat.getIdentifier()).subscribe(psd0.m173597H(new y20() { // from class: l.v0z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181914a.m194174J1(str, (Boolean) obj);
            }
        }, new y20() { // from class: l.x0z
            @Override // p153l.y20
            public final void call(Object obj) {
                u1z.m194139X0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m194158p0(MessageInputBaseEditView messageInputBaseEditView, boolean z, int i, String str, int i2) {
        ((PutongAct) messageInputBaseEditView.getContext()).showInput(messageInputBaseEditView, 0);
        if (z) {
            messageInputBaseEditView.setSelection(i + str.length(), i2 + str.length());
        } else {
            messageInputBaseEditView.setSelection(str.length() + i, i + str.length());
        }
        ((Vibrator) CoreModule.f18263b.getSystemService("vibrator")).vibrate(50L);
    }

    /* JADX INFO: renamed from: u1 */
    private void m194164u1() {
        creates(new y20() { // from class: l.w0z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186739a.m194179Q1((Bundle) obj);
            }
        }, new x20() { // from class: l.h1z
            @Override // p153l.x20
            public final void call() {
                u1z.m194148h0();
            }
        });
        if (CoreModule.m30933P().m143412i().mo180495l()) {
            lifecycle().filter(new qcj() { // from class: l.o1z
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16268j);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.p1z
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f150226a.m194180R1((C4470c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m194168B1(CharSequence charSequence) {
        ((d3z) this.viewModel).m114041t0().getBar_center_text().getText().insert(((d3z) this.viewModel).m114041t0().getBar_center_text().getSelectionStart(), charSequence);
    }

    /* JADX INFO: renamed from: C1 */
    public void m194169C1(User user, ChatGroupMember chatGroupMember) {
        String str = user.f56859id;
        StringBuilder sb = new StringBuilder("@");
        sb.append(TextUtils.isEmpty(chatGroupMember.nickName) ? user.name : chatGroupMember.nickName);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        final String string = sb.toString();
        int selectionStart = ((d3z) this.viewModel).m114041t0().getBar_center_text().getSelectionStart();
        int selectionEnd = ((d3z) this.viewModel).m114041t0().getBar_center_text().getSelectionEnd();
        final boolean z = selectionStart == selectionEnd || selectionEnd < 0;
        final int i = selectionStart < 0 ? 0 : selectionStart;
        final int i2 = selectionEnd < 0 ? 0 : selectionEnd;
        final MessageInputBaseEditView bar_center_text = ((d3z) this.viewModel).m114041t0().getBar_center_text();
        bar_center_text.m51103p(str, i, string.length() + i);
        bar_center_text.getText().insert(i, string);
        bar_center_text.requestFocus();
        l51.m152888H(bar_center_text.getContext(), new Runnable() { // from class: l.p0z
            @Override // java.lang.Runnable
            public final void run() {
                u1z.m194158p0(bar_center_text, z, i, string, i2);
            }
        }, 10L);
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m194170E1() {
        return bnl0.m105529O0(((d3z) this.viewModel).m114041t0().getRecordLayout());
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m194171F1() {
        return this.f177151f;
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ List m194172H1(ArrayList arrayList) throws Exception {
        FileOutputStream fileOutputStream;
        IOException e;
        InputStream inputStreamOpenInputStream;
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            InputStream inputStream = null;
            try {
                inputStreamOpenInputStream = act().getContentResolver().openInputStream(uri);
                try {
                    File file = new File(CoreModule.f18263b.getExternalCacheDir(), System.currentTimeMillis() + "_" + SystemClock.uptimeMillis() + ".copy");
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        try {
                            oki.m168018f(inputStreamOpenInputStream, fileOutputStream);
                            arrayList2.add(file);
                        } catch (IOException e2) {
                            e = e2;
                            CrashHelper.m82479c(e);
                            Objects.toString(uri);
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStreamOpenInputStream;
                        va5.m200497a(inputStream);
                        va5.m200497a(fileOutputStream);
                        throw th;
                    }
                } catch (IOException e3) {
                    fileOutputStream = null;
                    e = e3;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (IOException e4) {
                fileOutputStream = null;
                e = e4;
                inputStreamOpenInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
            va5.m200497a(inputStreamOpenInputStream);
            va5.m200497a(fileOutputStream);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m194173I1(ArrayList arrayList, List list) {
        act().progressDismiss();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            Picture picture = new Picture();
            picture.url = oki.m168011B(file.getAbsolutePath());
            picture.status = MediaLocalStatus.get("raw");
            arrayList.add(picture);
        }
        if (arrayList.size() > 0) {
            m143372e0().mo50158l().m111012m6(arrayList);
        } else {
            o1j0.m165634h(R$string.f21453A2);
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m194174J1(String str, Boolean bool) {
        if (bool.booleanValue()) {
            CoreModule.m30933P().m143412i().mo180419W4(act(), str);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m194175L1(ArrayList arrayList) {
        ArrayList<Media> arrayList2 = new ArrayList<>();
        ArrayList<Uri> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            String strM133370g = h26.m133370g(uri);
            if (NullChecker.m82486a(strM133370g)) {
                String strM168011B = oki.m168011B(strM133370g);
                Picture picture = new Picture();
                picture.url = strM168011B;
                picture.status = MediaLocalStatus.get("raw");
                arrayList2.add(picture);
            } else if ("content".equals(uri.getScheme())) {
                arrayList3.add(uri);
            }
        }
        if (!arrayList3.isEmpty()) {
            m194203l1(arrayList2, arrayList3);
        } else if (arrayList2.size() > 0) {
            m143372e0().mo50158l().m111012m6(arrayList2);
        } else {
            o1j0.m165634h(R$string.f21453A2);
        }
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m194176N1(final ArrayList arrayList, View view) {
        final x20 x20Var = new x20() { // from class: l.z0z
            @Override // p153l.x20
            public final void call() {
                this.f202467a.m194175L1(arrayList);
            }
        };
        C20460a c20460a = new C20460a();
        C20461b c20461b = new C20461b();
        C20462c c20462c = new C20462c();
        if (wzx.m208784k()) {
            new wzx().m208785d(act(), null, new x20() { // from class: l.a1z
                @Override // p153l.x20
                public final void call() {
                    x20Var.call();
                }
            }, null, c20462c, c20461b, c20460a);
        } else {
            PermissionHelper.m81065c().m81083r("android.permission.READ_EXTERNAL_STORAGE").m81088w(false).m81086u(false).m81080o(x20Var).m81081p(c20460a).m81085t(c20461b).m81087v(c20462c).m81074i(act());
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m194177O1(C4470c c4470c) {
        m194197i1();
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m194178P1(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            if (this.f177150e) {
                this.f177149d.m152783r();
            }
        } else if (c4470c == C4470c.f16268j && this.f177150e) {
            this.f177149d.m152772g();
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m194179Q1(Bundle bundle) {
        if (CoreModule.m30933P().m143412i().mo180325G1()) {
            this.f177147b = 3;
        }
        ((d3z) this.viewModel).m113953B0();
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m194180R1(C4470c c4470c) {
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(m143372e0().mo50158l().m110989i3());
        if (!NullChecker.m82486a(conversationM33859Xe) || TextUtils.isEmpty(((d3z) this.viewModel).m114039s0()) || ((d3z) this.viewModel).m114039s0().equals(conversationM33859Xe.localDraft)) {
            return;
        }
        String strM114039s0 = ((d3z) this.viewModel).m114039s0();
        final Conversation conversationMo225055clone = conversationM33859Xe.mo225055clone();
        if (conversationM33859Xe.localEverHasMessage) {
            conversationMo225055clone.latestTime = pzi0.m174454o();
        }
        conversationMo225055clone.localDraft = strM114039s0;
        l51.m152919y(new Runnable() { // from class: l.o0z
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.t0z
                    @Override // p153l.x20
                    public final void call() {
                        CoreModule.f18264c.f20384f0.m34053mq(conversation);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m194181S1(uxj0 uxj0Var) {
        ((d3z) this.viewModel).m114023k0();
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m194182T1(Conversation conversation) {
        if (!hcp.m134489b(conversation)) {
            ((d3z) this.viewModel).m113958E1();
            return;
        }
        if (TextUtils.equals(conversation.additional.oneSide.initiator, CoreModule.m30929H().userId())) {
            ((d3z) this.viewModel).m113990V1(new x20() { // from class: l.r0z
                @Override // p153l.x20
                public final void call() {
                    o1j0.m165649w(R$string.f21526J3);
                }
            });
        } else if (!CoreModule.m30933P().m143412i().mo180335I0() || CoreModule.m30930K().me_().isFemale() || CoreModule.m30933P().m143412i().mo34626ws() > 0) {
            ((d3z) this.viewModel).m113958E1();
        } else {
            ((d3z) this.viewModel).m113990V1(new x20() { // from class: l.s0z
                @Override // p153l.x20
                public final void call() {
                    this.f165743a.m194183U1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m194183U1() {
        CoreModule.m30933P().m143412i().mo34625wr(act(), "intl_letter_reply", Privilege.see_letter_gp);
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m194184V1() {
        ((d3z) this.viewModel).m114015f0();
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m194185W1(Integer num) {
        if (num.intValue() >= 5) {
            l51.m152893M(new Runnable() { // from class: l.q0z
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155125a.m194184V1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m194186X1(Integer num) {
        boolean z = ((d3z) this.viewModel).m114041t0().mo50014b(MessageBarActionItemType.SHI_PAI) != null;
        if (num.intValue() >= f177144i && !f177146k.get().booleanValue() && z) {
            Message messageM194207n1 = m194207n1();
            messageM194207n1.value = "2";
            CoreModule.f18264c.f20384f0.m33885Zg(messageM194207n1);
            f177146k.put(Boolean.TRUE);
            return;
        }
        if (num.intValue() < f177143h || f177145j.get().booleanValue() || f177146k.get().booleanValue() || !z) {
            return;
        }
        Message messageM194207n2 = m194207n1();
        messageM194207n2.value = "1";
        CoreModule.f18264c.f20384f0.m33885Zg(messageM194207n2);
        f177145j.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ boolean m194187Y1(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, int i, int i2, Intent intent) {
        int intExtra;
        if (i2 == -1 && NullChecker.m82486a(intent) && intent.hasExtra("featureID") && (intExtra = intent.getIntExtra("featureID", -1)) >= 1 && intExtra <= 4) {
            ((d3z) this.viewModel).m113968K0(warmingUpLevel, intExtra);
        }
        return true;
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m194188Z1(String str, String str2, Boolean bool) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str);
        if (userM116503Pa == null || userM116600p9 == null || conversationM33859Xe == null) {
            return;
        }
        clz<? extends DbObject, ?> clzVarMo50158l = m143372e0().mo50158l();
        final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM111004l3 = clzVarMo50158l.m111004l3();
        String anonymousUrl = userM116503Pa.m61308fp().url;
        String anonymousUrl2 = userM116600p9.m61308fp().url;
        if (conversationM33859Xe.isAnonymous()) {
            anonymousUrl = userM116503Pa.getAnonymousUrl();
            anonymousUrl2 = userM116600p9.getAnonymousUrl();
        }
        Uri.Builder builderBuildUpon = Uri.parse(C4891g.f20579Z2).buildUpon();
        builderBuildUpon.appendQueryParameter("other_avatar_url", anonymousUrl);
        builderBuildUpon.appendQueryParameter("other_name", userM116503Pa.name);
        builderBuildUpon.appendQueryParameter("self_avatar_url", anonymousUrl2);
        builderBuildUpon.appendQueryParameter("temperature", "" + MessageWarmingUpHelper.m50355b(clzVarMo50158l.m111009m3()));
        builderBuildUpon.appendQueryParameter("mm", "" + conversationM33859Xe.f21116mm);
        builderBuildUpon.appendQueryParameter("feature_available", bool.booleanValue() ? "1" : "0");
        builderBuildUpon.appendQueryParameter("source", str2);
        builderBuildUpon.appendQueryParameter("isOtherUserMale", userM116503Pa.isFemale() ? "0" : "1");
        MessagesAct messagesActAct = ((d3z) this.viewModel).act();
        if (NullChecker.m82486a(messagesActAct)) {
            Intent intentM81421d2 = MkWebViewAct.m81421d2(((d3z) this.viewModel).act(), "", builderBuildUpon.toString(), true, true, null);
            intentM81421d2.putExtra("hideNotch", true);
            messagesActAct.startActivityForResult(intentM81421d2, new C4468a.a() { // from class: l.y0z
                @Override // com.p051p1.mobile.android.app.C4468a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo21400a(int i, int i2, Intent intent) {
                    return this.f197064a.m194187Y1(warmingUpLevelM111004l3, i, i2, intent);
                }
            });
        }
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m194164u1();
        m194216s1();
        m194212q1();
        m194221v1();
        m194224x1();
        m194227z1();
        m194218t1();
        m194214r1();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m194189a2(String str, List list, String str2, String str3, Boolean bool) {
        CoreModule.f18264c.f20384f0.m33751Np(bool.booleanValue());
        m143372e0().mo50158l().m110919T6(str, list);
        sfj0.m185601h("e_chat_view_sensitive_words_send_tips", m143372e0().mo50158l().pageId(), sfj0.C20032a.m185615h(Constants.MessagePayloadKeys.MSGID_SERVER, ""), sfj0.C20032a.m185615h("message_send_status", ""), sfj0.C20032a.m185615h("message_receiver", str2), sfj0.C20032a.m185615h("sensitiveword", str3), sfj0.C20032a.m185615h("sensitive_text", str), sfj0.C20032a.m185615h("message_send_values", "send"));
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m194190b2(DialogInterface dialogInterface) {
        this.f177149d.m152768c();
        this.f177149d.m152783r();
        this.f177150e = true;
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m194191c2(DialogInterface dialogInterface) {
        this.f177149d.m152772g();
        this.f177149d.m152770e();
        this.f177150e = false;
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m194192d2(String str, String str2, String str3, Dialog dialog, View view) {
        ((d3z) this.viewModel).m114041t0().getBar_center_text().setText("");
        m143372e0().mo50158l().m110914S6(str);
        sfj0.m185596c("e_chat_view_sensitiveword_block_popup", "p_chat_view_sensitiveword_block_popup_show", sfj0.C20032a.m185615h(Constants.MessagePayloadKeys.MSGID_SERVER, ""), sfj0.C20032a.m185615h("message_send_status", ""), sfj0.C20032a.m185615h("message_receiver", str2), sfj0.C20032a.m185615h("sensitiveword", str3), sfj0.C20032a.m185615h("sensitive_text", str), sfj0.C20032a.m185615h("message_send_values", "send"));
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m194193e2(View view) {
        CoreModule.m30933P().m143412i().mo180307C5(true);
        bnl0.m105524M(((d3z) this.viewModel).m114041t0().getBar_send(), false);
        ((d3z) this.viewModel).m114041t0().getBar_center_text().setImeOptions(4);
        ((d3z) this.viewModel).m114041t0().getBar_center_text().setInputType(((d3z) this.viewModel).m114041t0().getBar_center_text().getInputType() ^ 131072);
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m194194f2(Sticker sticker) {
        act().progressDismiss();
        if (sticker == null) {
            return;
        }
        for (Picture picture : sticker.pictures) {
            m194199j1(picture);
            Dimension dimension = picture.size;
            if (dimension.width == 0 || dimension.height == 0) {
                dimension.height = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256;
                dimension.width = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256;
            }
        }
        m143372e0().mo50158l().m110909R6(sticker, true);
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m194195g2(List list, Throwable th) {
        act().progressDismiss();
        oki.m168025m(oki.m168038z(((Media) list.get(0)).url));
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ File m194196h2(File file) throws Exception {
        String name = file.getName();
        String str = act().getCacheDir() + "/sogou/gif/";
        oki.m168015c(file.getPath(), str);
        return new File(str, name);
    }

    /* JADX INFO: renamed from: i1 */
    public final void m194197i1() {
        MessageInputBaseEditView bar_center_text = ((d3z) this.viewModel).m114041t0().getBar_center_text();
        if (NullChecker.m82486a(bar_center_text) && bar_center_text.isFocused()) {
            ((InputMethodManager) act().getSystemService("input_method")).hideSoftInputFromWindow(bar_center_text.getWindowToken(), 0);
            bar_center_text.clearFocus();
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ C22421c m194198i2(final File file) {
        return C22421c.fromCallable(new Callable() { // from class: l.e1z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f91687a.m194196h2(file);
            }
        });
    }

    /* JADX INFO: renamed from: j1 */
    public final void m194199j1(Media media) {
        if ("image/gif".equals(media.mediaType) || "image/webp".equals(media.mediaType) || "image/jpg".equals(media.mediaType) || DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG.equals(media.mediaType)) {
            return;
        }
        String str = media.url;
        if (str.endsWith(".gif")) {
            media.mediaType = "image/gif";
            return;
        }
        if (str.endsWith(".webp")) {
            media.mediaType = "image/webp";
            return;
        }
        if (str.endsWith(".jpep") || str.endsWith(".jpg")) {
            media.mediaType = "image/jpg";
        } else if (str.endsWith(".png")) {
            media.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG;
        } else {
            media.mediaType = "image/*";
        }
    }

    /* JADX INFO: renamed from: k1 */
    public void m194201k1() {
        ((d3z) this.viewModel).m114041t0().getBar_send().performClick();
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ File m194202k2(Uri uri) throws Exception {
        return C8748b.m50943a(uri, act().getExternalCacheDir().getPath() + "/sogou");
    }

    /* JADX INFO: renamed from: l1 */
    public final void m194203l1(final ArrayList<Media> arrayList, final ArrayList<Uri> arrayList2) {
        act().progress(R$string.f21517I2);
        duringCreated(C22421c.fromCallable(new Callable() { // from class: l.f1z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f96840a.m194172H1(arrayList2);
            }
        }).compose(psd0.m173592C())).subscribe(psd0.m173596G(new y20() { // from class: l.g1z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f101793a.m194173I1(arrayList, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ C22421c m194204l2(final Uri uri) {
        return C22421c.fromCallable(new Callable() { // from class: l.n1z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f139800a.m194202k2(uri);
            }
        });
    }

    /* JADX INFO: renamed from: m1 */
    public boolean m194205m1(MotionEvent motionEvent) {
        return m194170E1() && motionEvent.getPointerCount() > 1 && motionEvent.getActionIndex() != 0;
    }

    /* JADX INFO: renamed from: n1 */
    public final Message m194207n1() {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_real_shot_tips);
        messageNew_.cid = m143372e0().mo50158l().mo111034r3();
        messageNew_.localInConversation = true;
        long jM174454o = pzi0.m174454o();
        messageNew_.owner = CoreModule.m30929H().userId();
        messageNew_.createdTime = jM174454o;
        messageNew_.localCreatedTime = jM174454o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m30929H().userId();
        vxd0 vxd0Var = App.f16092i;
        messageNew_.localCreatedSession = vxd0Var.get().intValue();
        messageNew_.f56859id = DbObject.GENERATE_UNIQUE_FAKE_ID(vxd0Var.get().intValue());
        return messageNew_;
    }

    /* JADX INFO: renamed from: n2 */
    public void m194208n2(final String str) {
        final String str2 = m143372e0().mo50158l().f82474c;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        duringCreated(CoreModule.f18264c.f20328M1.m111478w3(str2)).take(1).subscribe(psd0.m173597H(new y20() { // from class: l.m0z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134373a.m194188Z1(str2, str, (Boolean) obj);
            }
        }, new y20() { // from class: l.n0z
            @Override // p153l.y20
            public final void call(Object obj) {
                u1z.m194153l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o2 */
    public void m194209o2() {
        ((d3z) this.viewModel).m113951A0();
    }

    /* JADX INFO: renamed from: p1 */
    public void m194210p1(final ArrayList<Uri> arrayList) {
        new th0.C20312a(act()).m191151j(act().getString(R$string.f21608T5)).m191146e(R$string.f21658a).m191158q(R$string.f21748k).m191156o(new View.OnClickListener() { // from class: l.u0z
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f176955a.m194176N1(arrayList, view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: p2 */
    public void m194211p2(boolean z) {
        this.f177151f = z;
        ((d3z) this.viewModel).m113957E0();
    }

    /* JADX INFO: renamed from: q1 */
    public final void m194212q1() {
        if (hzd.m137888d()) {
            lifecycle().filter(new qcj() { // from class: l.a0z
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4470c) obj) == C4470c.f16268j);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.l0z
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f129629a.m194177O1((C4470c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q2 */
    public void m194213q2(Editable editable, List<String> list) {
        m194215r2(editable, list, true);
    }

    /* JADX INFO: renamed from: r1 */
    public final void m194214r1() {
        if (CoreModule.m30933P().m143412i().mo34591si()) {
            CoreModule.m30933P().m143412i().mo180396S5(true);
        }
    }

    /* JADX INFO: renamed from: r2 */
    public void m194215r2(Editable editable, final List<String> list, boolean z) {
        String strTrim = editable.toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        if (CoreModule.m30933P().m143412i().mo180314E() && !jyb.m147479J(list)) {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) editable.getSpans(0, editable.length(), ForegroundColorSpan.class);
            ArrayList arrayList = new ArrayList();
            for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                arrayList.add(pf60.m172085a(Integer.valueOf(editable.getSpanStart(foregroundColorSpan)), Integer.valueOf(editable.getSpanEnd(foregroundColorSpan))));
            }
            for (int length = foregroundColorSpanArr.length - 1; length >= 0; length--) {
                ForegroundColorSpan foregroundColorSpan2 = foregroundColorSpanArr[length];
                editable.removeSpan(foregroundColorSpan2);
            }
        }
        CoreModule.f18264c.f20384f0.m33751Np(false);
        final String strTrim2 = strTrim.toString().trim();
        boolean z2 = uqb0.f180394Z.m95954K(strTrim2) || uqb0.f180394Z.m95956M(strTrim2);
        if (!z2) {
            m194157o1(strTrim2);
            if (!MessagesAct.f32484s.get().booleanValue() && z) {
                new th0.C20312a(act()).m191160s(act().getResources().getString(R$string.f21504G5)).m191151j(act().getResources().getString(R$string.f21496F5)).m191148g(true).m191159r(act().getResources().getString(R$string.f21703f)).m191156o(new View.OnClickListener() { // from class: l.k0z
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f123435a.m194193e2(view);
                    }
                }).m191147f(act().getResources().getString(R$string.f21694e)).m191142a().m191141g();
                MessagesAct.f32484s.put(Boolean.TRUE);
            }
            ((d3z) this.viewModel).m114041t0().getBar_center_text().setText("");
            m143372e0().mo50158l().m110919T6(editable.toString().trim(), list);
            return;
        }
        final String strMo111034r3 = m143372e0().mo50158l().mo111034r3();
        final String strM95955L = uqb0.f180394Z.m95955L(strTrim2);
        if (m143372e0().mo50158l().mo110970e4()) {
            this.f177149d.m152781p(pf60.m172085a("sensitiveword", strM95955L), pf60.m172085a(Constants.MessagePayloadKeys.MSGID_SERVER, ""), pf60.m172085a("message_send_status", ""), pf60.m172085a("message_receiver", strMo111034r3), pf60.m172085a("sensitive_text", strTrim2));
            View viewInflate = act().getLayoutInflater().inflate(qec0.f157134v, (ViewGroup) null);
            final Dialog dialogM21566z = act().dialog().m21518O(viewInflate).m21496B0(new DialogInterface.OnShowListener() { // from class: l.g0z
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f101696a.m194190b2(dialogInterface);
                }
            }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.h0z
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f107358a.m194191c2(dialogInterface);
                }
            }).m21566z();
            viewInflate.findViewById(edc0.f93445r3).setOnClickListener(new View.OnClickListener() { // from class: l.i0z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f112461a.m194192d2(strTrim2, strMo111034r3, strM95955L, dialogM21566z, view);
                }
            });
            viewInflate.findViewById(edc0.f93205G2).setOnClickListener(new View.OnClickListener() { // from class: l.j0z
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    u1z.m194143c1(strMo111034r3, strM95955L, strTrim2, dialogM21566z, view);
                }
            });
            dialogM21566z.show();
        } else {
            String strMo111034r4 = m143372e0().mo50158l().mo111034r3();
            String strM110989i3 = m143372e0().mo50158l().m110989i3();
            ((d3z) this.viewModel).m114041t0().getBar_center_text().setText("");
            if (z2) {
                C22421c<T> c22421cDuringCreated = duringCreated(CoreModule.f18264c.f20384f0.m34211zh(strMo111034r4, strM110989i3, strTrim2));
                y20 y20Var = new y20() { // from class: l.e0z
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f91555a.m194189a2(strTrim2, list, strMo111034r3, strM95955L, (Boolean) obj);
                    }
                };
                strMo111034r3 = strMo111034r3;
                c22421cDuringCreated.subscribe(psd0.m173597H(y20Var, new y20() { // from class: l.f0z
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        u1z.m194142b1((Throwable) obj);
                    }
                }));
            } else {
                CoreModule.f18264c.f20384f0.m33751Np(true);
                m143372e0().mo50158l().m110919T6(strTrim2, list);
                sfj0.m185601h("e_wechat_notice", act().pageId(), new sfj0.C20032a[0]);
            }
        }
        HashSet hashSet = new HashSet(MessagesAct.f32483r.get());
        hashSet.add(strMo111034r3);
        MessagesAct.f32483r.put(hashSet);
    }

    /* JADX INFO: renamed from: s1 */
    public final void m194216s1() {
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.t1z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171701a.m194178P1((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s2 */
    public final void m194217s2(final List<Media> list) {
        act().progress(R$string.f21517I2);
        duringCreated(CoreModule.f18264c.f20384f0.m33726Lo(list, "sogoutest")).subscribe(psd0.m173597H(new y20() { // from class: l.i1z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f112573a.m194194f2((Sticker) obj);
            }
        }, new y20() { // from class: l.j1z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f118001a.m194195g2(list, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t1 */
    public final void m194218t1() {
        m143372e0().mo50158l().m111057w3(m143372e0().mo50158l().mo111034r3());
    }

    /* JADX INFO: renamed from: t2 */
    public void m194219t2(Uri uri) {
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return;
        }
        boolean zContains = path.contains(".hotexp");
        V v2 = this.viewModel;
        if (zContains) {
            sfj0.m185596c("e_sougou_gif", ((d3z) v2).act().pageId(), sfj0.C20032a.m185613f("sougou_gif_type", 0));
        } else {
            sfj0.m185596c("e_sougou_gif", ((d3z) v2).act().pageId(), sfj0.C20032a.m185613f("sougou_gif_type", 1));
        }
        if (Build.VERSION.SDK_INT >= 30) {
            m194222v2(uri);
            return;
        }
        if (path.startsWith("/externalshare")) {
            path = path.substring(14, path.length());
        }
        File file = new File(Environment.getExternalStorageDirectory(), path);
        if (!file.canRead() || file.length() == 0) {
            return;
        }
        duringCreated(((C22421c) new qcj() { // from class: l.b1z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f74406a.m194198i2((File) obj);
            }
        }.call(file)).compose(psd0.m173606Q()).map(new qcj() { // from class: l.c1z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                File file2 = (File) obj;
                return pf60.m172085a(C8748b.m50945c(file2), file2);
            }
        }).compose(psd0.m173592C())).subscribe(psd0.m173596G(new y20() { // from class: l.d1z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f84742a.m194200j2((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m194206m2(pf60<ImageHeaderParser.ImageType, File> pf60Var) {
        if (NullChecker.m82486a(pf60Var.f152157b)) {
            ImageHeaderParser.ImageType imageType = pf60Var.f152156a;
            File file = pf60Var.f152157b;
            Picture picture = new Picture();
            picture.nullCheck();
            picture.url = oki.m168011B(file.getPath());
            picture.status = MediaLocalStatus.get("raw");
            ArrayList arrayList = new ArrayList();
            arrayList.add(picture);
            switch (C20464e.f177156a[imageType.ordinal()]) {
                case 1:
                    picture.mediaType = "image/jpg";
                    m194223w2(arrayList);
                    break;
                case 2:
                case 3:
                    picture.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG;
                    m194223w2(arrayList);
                    break;
                case 4:
                    picture.mediaType = "image/gif";
                    m194217s2(arrayList);
                    break;
                case 5:
                case 6:
                    picture.mediaType = "image/webp";
                    m194217s2(arrayList);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m194221v1() {
        duringCreated(f177142g).subscribe(psd0.m173596G(new y20() { // from class: l.q1z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f155239a.m194181S1((uxj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v2 */
    public final void m194222v2(final Uri uri) {
        duringCreated(((C22421c) new qcj() { // from class: l.k1z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f123561a.m194204l2((Uri) obj);
            }
        }.call(uri)).compose(psd0.m173606Q()).map(new qcj() { // from class: l.l1z
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pf60.m172085a(C8748b.m50944b(uri), (File) obj);
            }
        }).compose(psd0.m173592C())).subscribe(psd0.m173596G(new y20() { // from class: l.m1z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134486a.m194206m2((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w2 */
    public final void m194223w2(List<Media> list) {
        Message message = new Message();
        message.media = new ArrayList(list);
        message.messageType = MessageType.get("picture");
        m143372e0().mo50158l().m110837A6(message);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m194224x1() {
        if (CoreModule.m30933P().m143412i().mo180296B()) {
            duringCreated(psd0.m173625r(CoreModule.f18264c.m32486n3().map(new qcj() { // from class: l.b0z
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(CoreModule.m30933P().m143412i().mo34626ws() > 0);
                }
            }).distinctUntilChanged(), CoreModule.f18264c.f20384f0.m33740Ne(m143372e0().mo50158l().mo111034r3()), new rcj() { // from class: l.c0z
                @Override // p153l.rcj
                public final Object call(Object obj, Object obj2) {
                    return u1z.m194149h1((Boolean) obj, (Conversation) obj2);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.d0z
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f84629a.m194182T1((Conversation) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x2 */
    public void m194225x2(int i) {
        this.f177147b = i;
    }

    /* JADX INFO: renamed from: y2 */
    public void m194226y2(int i) {
        ((d3z) this.viewModel).m114010c2(i);
    }

    /* JADX INFO: renamed from: z1 */
    public final void m194227z1() {
        if (!m194122D1()) {
            duringCreated(CoreModule.f18264c.f20384f0.m33764Pe(m143372e0().mo50158l().mo111034r3())).subscribe(psd0.m173596G(new y20() { // from class: l.r1z
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f160864a.m194185W1((Integer) obj);
                }
            }));
        }
        try {
            JSONObject jSONObject = new JSONObject(RemoteConfig.m80481x().m80485F("live_message_guide_tip_threshold"));
            f177143h = jSONObject.optInt("live_message_guide_tip_threshold_1", 10);
            f177144i = jSONObject.optInt("live_message_guide_tip_threshold_2", 20);
        } catch (Exception unused) {
        }
        duringCreated(CoreModule.f18264c.f20384f0.m33764Pe(m143372e0().mo50158l().mo111034r3())).subscribe(psd0.m173596G(new y20() { // from class: l.s1z
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165817a.m194186X1((Integer) obj);
            }
        }));
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
