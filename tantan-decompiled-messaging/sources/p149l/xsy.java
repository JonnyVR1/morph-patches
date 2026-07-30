package p149l;

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
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.data.ChatGroupMember;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.Sticker;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.helper.MessageWarmingUpHelper;
import com.p046p1.mobile.putong.core.p053ui.messages.model.messagebar.MessageBarActionItemType;
import com.p046p1.mobile.putong.core.p053ui.messages.sogou.C8585b;
import com.p046p1.mobile.putong.core.p053ui.messages.sogou.ImageHeaderParser;
import com.p046p1.mobile.putong.core.p053ui.messages.view.MessageInputBaseEditView;
import com.p046p1.mobile.putong.data.Dimension;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.MediaLocalStatus;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.webview.p068mk.MkWebViewAct;
import com.p046p1.mobile.putong.remote_config.RemoteConfig;
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
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes3.dex */
public class xsy extends muy<guy> {

    /* JADX INFO: renamed from: g */
    public static C22393b<roj0> f194325g = C22393b.m221521b();

    /* JADX INFO: renamed from: h */
    public static int f194326h = 10;

    /* JADX INFO: renamed from: i */
    public static int f194327i = 20;

    /* JADX INFO: renamed from: j */
    public static hpd0 f194328j;

    /* JADX INFO: renamed from: k */
    public static hpd0 f194329k;

    /* JADX INFO: renamed from: b */
    public int f194330b;

    /* JADX INFO: renamed from: c */
    public C22392a<String> f194331c;

    /* JADX INFO: renamed from: d */
    public cwf0 f194332d;

    /* JADX INFO: renamed from: e */
    public boolean f194333e;

    /* JADX INFO: renamed from: f */
    public boolean f194334f;

    /* JADX INFO: renamed from: l.xsy$a */
    public class C21209a implements v4e {
        public C21209a() {
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: a */
        public void mo37393a() {
            CoreModule.m29935P().m94658i().mo158368e3("message");
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: b */
        public void mo37394b(boolean z) {
            CoreModule.m29935P().m94658i().mo158452u2("message", z);
        }

        @Override // p149l.v4e
        /* JADX INFO: renamed from: c */
        public void mo37395c() {
            CoreModule.m29935P().m94658i().mo158229F1("message");
        }
    }

    /* JADX INFO: renamed from: l.xsy$b */
    public class C21210b implements w4e {
        public C21210b() {
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: a */
        public void mo37390a() {
            CoreModule.m29935P().m94658i().mo158332X2("message");
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: b */
        public void mo37391b() {
            CoreModule.m29935P().m94658i().mo158482z4("message");
        }

        @Override // p149l.w4e
        /* JADX INFO: renamed from: c */
        public void mo37392c() {
            CoreModule.m29935P().m94658i().mo158393i4("message");
        }
    }

    /* JADX INFO: renamed from: l.xsy$c */
    public class C21211c implements x4e {
        public C21211c() {
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: a */
        public void mo37401a() {
            CoreModule.m29935P().m94658i().mo158440r4("message");
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: b */
        public void mo37402b() {
            CoreModule.m29935P().m94658i().mo158322V5("message");
        }

        @Override // p149l.x4e
        /* JADX INFO: renamed from: c */
        public void mo37403c() {
            CoreModule.m29935P().m94658i().mo158292Q5("message");
        }
    }

    /* JADX INFO: renamed from: l.xsy$d */
    public class C21212d implements n3m {
        public C21212d() {
        }

        @Override // p149l.n3m
        public boolean disableAutoPV() {
            return false;
        }

        @Override // p149l.n3m
        public String pageId() {
            return "p_chat_view_sensitiveword_block_popup_show";
        }
    }

    /* JADX INFO: renamed from: l.xsy$e */
    public static /* synthetic */ class C21213e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f194339a;

        static {
            int[] iArr = new int[ImageHeaderParser.ImageType.values().length];
            f194339a = iArr;
            try {
                iArr[ImageHeaderParser.ImageType.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f194339a[ImageHeaderParser.ImageType.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f194339a[ImageHeaderParser.ImageType.PNG_A.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f194339a[ImageHeaderParser.ImageType.GIF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f194339a[ImageHeaderParser.ImageType.WEBP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f194339a[ImageHeaderParser.ImageType.WEBP_A.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f194328j = new hpd0("r_s_t_1_s", bool);
        f194329k = new hpd0("r_s_t_2_s", bool);
    }

    public xsy(mcr mcrVar) {
        super(mcrVar);
        this.f194330b = 1;
        this.f194331c = C22392a.m221512b();
        this.f194332d = new cwf0(new C21212d());
        this.f194333e = false;
        this.f194334f = false;
    }

    /* JADX INFO: renamed from: D1 */
    private boolean m210844D1() {
        return m156455e0().mo48974l().f96893J.get().booleanValue();
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m210861X0(Throwable th) {
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m210864b1(Throwable th) {
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ void m210865c1(String str, String str2, String str3, Dialog dialog, View view) {
        o6j0.m162859c("e_chat_view_sensitiveword_block_popup", "p_chat_view_sensitiveword_block_popup_show", o6j0.C18854a.m162878h(Constants.MessagePayloadKeys.MSGID_SERVER, ""), o6j0.C18854a.m162878h("message_send_status", ""), o6j0.C18854a.m162878h("message_receiver", str), o6j0.C18854a.m162878h("sensitiveword", str2), o6j0.C18854a.m162878h("sensitive_text", str3), o6j0.C18854a.m162878h("message_send_values", "reject"));
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m210870h0() {
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ Conversation m210871h1(Boolean bool, Conversation conversation) {
        return conversation;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m210875l0(Throwable th) {
    }

    /* JADX INFO: renamed from: o1 */
    private void m210879o1(final String str) {
        qib0.f154711Z.m119131Q(str, OmsDialog.p_user_passive_show_chat.getIdentifier()).subscribe(mkd0.m154956H(new e30() { // from class: l.yry
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f199725a.m210896J1(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.asy
            @Override // p149l.e30
            public final void call(Object obj) {
                xsy.m210861X0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m210880p0(MessageInputBaseEditView messageInputBaseEditView, boolean z, int i, String str, int i2) {
        ((PutongAct) messageInputBaseEditView.getContext()).showInput(messageInputBaseEditView, 0);
        if (z) {
            messageInputBaseEditView.setSelection(i + str.length(), i2 + str.length());
        } else {
            messageInputBaseEditView.setSelection(str.length() + i, i + str.length());
        }
        ((Vibrator) CoreModule.f17544b.getSystemService("vibrator")).vibrate(50L);
    }

    /* JADX INFO: renamed from: u1 */
    private void m210886u1() {
        creates(new e30() { // from class: l.zry
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f204554a.m210901Q1((Bundle) obj);
            }
        }, new d30() { // from class: l.ksy
            @Override // p149l.d30
            public final void call() {
                xsy.m210870h0();
            }
        });
        if (CoreModule.m29935P().m94658i().mo158403l()) {
            lifecycle().filter(new w9j() { // from class: l.rsy
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15549j);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.ssy
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f166257a.m210902R1((C4319c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m210890B1(CharSequence charSequence) {
        ((guy) this.viewModel).m128210t0().getBar_center_text().getText().insert(((guy) this.viewModel).m128210t0().getBar_center_text().getSelectionStart(), charSequence);
    }

    /* JADX INFO: renamed from: C1 */
    public void m210891C1(User user, ChatGroupMember chatGroupMember) {
        String str = user.f56011id;
        StringBuilder sb = new StringBuilder("@");
        sb.append(TextUtils.isEmpty(chatGroupMember.nickName) ? user.name : chatGroupMember.nickName);
        sb.append(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        final String string = sb.toString();
        int selectionStart = ((guy) this.viewModel).m128210t0().getBar_center_text().getSelectionStart();
        int selectionEnd = ((guy) this.viewModel).m128210t0().getBar_center_text().getSelectionEnd();
        final boolean z = selectionStart == selectionEnd || selectionEnd < 0;
        final int i = selectionStart < 0 ? 0 : selectionStart;
        final int i2 = selectionEnd < 0 ? 0 : selectionEnd;
        final MessageInputBaseEditView bar_center_text = ((guy) this.viewModel).m128210t0().getBar_center_text();
        bar_center_text.m49920p(str, i, string.length() + i);
        bar_center_text.getText().insert(i, string);
        bar_center_text.requestFocus();
        e51.m114743H(bar_center_text.getContext(), new Runnable() { // from class: l.sry
            @Override // java.lang.Runnable
            public final void run() {
                xsy.m210880p0(bar_center_text, z, i, string, i2);
            }
        }, 10L);
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m210892E1() {
        return xdl0.m208349O0(((guy) this.viewModel).m128210t0().getRecordLayout());
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m210893F1() {
        return this.f194334f;
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ List m210894H1(ArrayList arrayList) throws Exception {
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
                    File file = new File(CoreModule.f17544b.getExternalCacheDir(), System.currentTimeMillis() + "_" + SystemClock.uptimeMillis() + ".copy");
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        try {
                            rhi.m179362f(inputStreamOpenInputStream, fileOutputStream);
                            arrayList2.add(file);
                        } catch (IOException e2) {
                            e = e2;
                            CrashHelper.m81296c(e);
                            Objects.toString(uri);
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStreamOpenInputStream;
                        u95.m192263a(inputStream);
                        u95.m192263a(fileOutputStream);
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
            u95.m192263a(inputStreamOpenInputStream);
            u95.m192263a(fileOutputStream);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m210895I1(ArrayList arrayList, List list) {
        act().progressDismiss();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            Picture picture = new Picture();
            picture.url = rhi.m179355B(file.getAbsolutePath());
            picture.status = MediaLocalStatus.get("raw");
            arrayList.add(picture);
        }
        if (arrayList.size() > 0) {
            m156455e0().mo48974l().m120806m6(arrayList);
        } else {
            lsi0.m151578h(R$string.f20711A2);
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m210896J1(String str, Boolean bool) {
        if (bool.booleanValue()) {
            CoreModule.m29935P().m94658i().mo158327W4(act(), str);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m210897L1(ArrayList arrayList) {
        ArrayList<Media> arrayList2 = new ArrayList<>();
        ArrayList<Uri> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            String strM104830g = c16.m104830g(uri);
            if (NullChecker.m81303a(strM104830g)) {
                String strM179355B = rhi.m179355B(strM104830g);
                Picture picture = new Picture();
                picture.url = strM179355B;
                picture.status = MediaLocalStatus.get("raw");
                arrayList2.add(picture);
            } else if ("content".equals(uri.getScheme())) {
                arrayList3.add(uri);
            }
        }
        if (!arrayList3.isEmpty()) {
            m210925l1(arrayList2, arrayList3);
        } else if (arrayList2.size() > 0) {
            m156455e0().mo48974l().m120806m6(arrayList2);
        } else {
            lsi0.m151578h(R$string.f20711A2);
        }
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m210898N1(final ArrayList arrayList, View view) {
        final d30 d30Var = new d30() { // from class: l.csy
            @Override // p149l.d30
            public final void call() {
                this.f82433a.m210897L1(arrayList);
            }
        };
        C21209a c21209a = new C21209a();
        C21210b c21210b = new C21210b();
        C21211c c21211c = new C21211c();
        if (zqx.m219898k()) {
            new zqx().m219899d(act(), null, new d30() { // from class: l.dsy
                @Override // p149l.d30
                public final void call() {
                    d30Var.call();
                }
            }, null, c21211c, c21210b, c21209a);
        } else {
            PermissionHelper.m79882c().m79900r("android.permission.READ_EXTERNAL_STORAGE").m79905w(false).m79903u(false).m79897o(d30Var).m79898p(c21209a).m79902t(c21210b).m79904v(c21211c).m79891i(act());
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m210899O1(C4319c c4319c) {
        m210919i1();
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m210900P1(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            if (this.f194333e) {
                this.f194332d.m109042r();
            }
        } else if (c4319c == C4319c.f15549j && this.f194333e) {
            this.f194332d.m109031g();
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m210901Q1(Bundle bundle) {
        if (CoreModule.m29935P().m94658i().mo158233G1()) {
            this.f194330b = 3;
        }
        ((guy) this.viewModel).m128125B0();
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m210902R1(C4319c c4319c) {
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(m156455e0().mo48974l().m120783i3());
        if (!NullChecker.m81303a(conversationM32856Xe) || TextUtils.isEmpty(((guy) this.viewModel).m128208s0()) || ((guy) this.viewModel).m128208s0().equals(conversationM32856Xe.localDraft)) {
            return;
        }
        String strM128208s0 = ((guy) this.viewModel).m128208s0();
        final Conversation conversationMo223809clone = conversationM32856Xe.mo223809clone();
        if (conversationM32856Xe.localEverHasMessage) {
            conversationMo223809clone.latestTime = mqi0.m155944o();
        }
        conversationMo223809clone.localDraft = strM128208s0;
        e51.m114774y(new Runnable() { // from class: l.rry
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.wry
                    @Override // p149l.d30
                    public final void call() {
                        CoreModule.f17545c.f19642f0.m33050mq(conversation);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m210903S1(roj0 roj0Var) {
        ((guy) this.viewModel).m128192k0();
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m210904T1(Conversation conversation) {
        if (!hap.m130153b(conversation)) {
            ((guy) this.viewModel).m128130E1();
            return;
        }
        if (TextUtils.equals(conversation.additional.oneSide.initiator, CoreModule.m29931H().userId())) {
            ((guy) this.viewModel).m128162V1(new d30() { // from class: l.ury
                @Override // p149l.d30
                public final void call() {
                    lsi0.m151593w(R$string.f20784J3);
                }
            });
        } else if (!CoreModule.m29935P().m94658i().mo158243I0() || CoreModule.m29932K().me_().isFemale() || CoreModule.m29935P().m94658i().mo33623ws() > 0) {
            ((guy) this.viewModel).m128130E1();
        } else {
            ((guy) this.viewModel).m128162V1(new d30() { // from class: l.vry
                @Override // p149l.d30
                public final void call() {
                    this.f182752a.m210905U1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m210905U1() {
        CoreModule.m29935P().m94658i().mo33622wr(act(), "intl_letter_reply", Privilege.see_letter_gp);
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m210906V1() {
        ((guy) this.viewModel).m128184f0();
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m210907W1(Integer num) {
        if (num.intValue() >= 5) {
            e51.m114748M(new Runnable() { // from class: l.try
                @Override // java.lang.Runnable
                public final void run() {
                    this.f171882a.m210906V1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m210908X1(Integer num) {
        boolean z = ((guy) this.viewModel).m128210t0().mo48831b(MessageBarActionItemType.SHI_PAI) != null;
        if (num.intValue() >= f194327i && !f194329k.get().booleanValue() && z) {
            Message messageM210929n1 = m210929n1();
            messageM210929n1.value = "2";
            CoreModule.f17545c.f19642f0.m32882Zg(messageM210929n1);
            f194329k.put(Boolean.TRUE);
            return;
        }
        if (num.intValue() < f194326h || f194328j.get().booleanValue() || f194329k.get().booleanValue() || !z) {
            return;
        }
        Message messageM210929n2 = m210929n1();
        messageM210929n2.value = "1";
        CoreModule.f17545c.f19642f0.m32882Zg(messageM210929n2);
        f194328j.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ boolean m210909Y1(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, int i, int i2, Intent intent) {
        int intExtra;
        if (i2 == -1 && NullChecker.m81303a(intent) && intent.hasExtra("featureID") && (intExtra = intent.getIntExtra("featureID", -1)) >= 1 && intExtra <= 4) {
            ((guy) this.viewModel).m128140K0(warmingUpLevel, intExtra);
        }
        return true;
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m210910Z1(String str, String str2, Boolean bool) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str);
        if (userM169430Pa == null || userM169527p9 == null || conversationM32856Xe == null) {
            return;
        }
        fcz<? extends DbObject, ?> fczVarMo48974l = m156455e0().mo48974l();
        final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM120798l3 = fczVarMo48974l.m120798l3();
        String anonymousUrl = userM169430Pa.m60124fp().url;
        String anonymousUrl2 = userM169527p9.m60124fp().url;
        if (conversationM32856Xe.isAnonymous()) {
            anonymousUrl = userM169430Pa.getAnonymousUrl();
            anonymousUrl2 = userM169527p9.getAnonymousUrl();
        }
        Uri.Builder builderBuildUpon = Uri.parse(C4740g.f19837Z2).buildUpon();
        builderBuildUpon.appendQueryParameter("other_avatar_url", anonymousUrl);
        builderBuildUpon.appendQueryParameter("other_name", userM169430Pa.name);
        builderBuildUpon.appendQueryParameter("self_avatar_url", anonymousUrl2);
        builderBuildUpon.appendQueryParameter("temperature", "" + MessageWarmingUpHelper.m49172b(fczVarMo48974l.m120803m3()));
        builderBuildUpon.appendQueryParameter("mm", "" + conversationM32856Xe.f20374mm);
        builderBuildUpon.appendQueryParameter("feature_available", bool.booleanValue() ? "1" : "0");
        builderBuildUpon.appendQueryParameter("source", str2);
        builderBuildUpon.appendQueryParameter("isOtherUserMale", userM169430Pa.isFemale() ? "0" : "1");
        MessagesAct messagesActAct = ((guy) this.viewModel).act();
        if (NullChecker.m81303a(messagesActAct)) {
            Intent intentM80238c2 = MkWebViewAct.m80238c2(((guy) this.viewModel).act(), "", builderBuildUpon.toString(), true, true, null);
            intentM80238c2.putExtra("hideNotch", true);
            messagesActAct.startActivityForResult(intentM80238c2, new C4317a.a() { // from class: l.bsy
                @Override // com.p046p1.mobile.android.app.C4317a.a
                /* JADX INFO: renamed from: a */
                public final boolean mo20401a(int i, int i2, Intent intent) {
                    return this.f77145a.m210909Y1(warmingUpLevelM120798l3, i, i2, intent);
                }
            });
        }
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m210886u1();
        m210938s1();
        m210934q1();
        m210943v1();
        m210946x1();
        m210949z1();
        m210940t1();
        m210936r1();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m210911a2(String str, List list, String str2, String str3, Boolean bool) {
        CoreModule.f17545c.f19642f0.m32748Np(bool.booleanValue());
        m156455e0().mo48974l().m120713T6(str, list);
        o6j0.m162864h("e_chat_view_sensitive_words_send_tips", m156455e0().mo48974l().pageId(), o6j0.C18854a.m162878h(Constants.MessagePayloadKeys.MSGID_SERVER, ""), o6j0.C18854a.m162878h("message_send_status", ""), o6j0.C18854a.m162878h("message_receiver", str2), o6j0.C18854a.m162878h("sensitiveword", str3), o6j0.C18854a.m162878h("sensitive_text", str), o6j0.C18854a.m162878h("message_send_values", "send"));
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m210912b2(DialogInterface dialogInterface) {
        this.f194332d.m109027c();
        this.f194332d.m109042r();
        this.f194333e = true;
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m210913c2(DialogInterface dialogInterface) {
        this.f194332d.m109031g();
        this.f194332d.m109029e();
        this.f194333e = false;
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m210914d2(String str, String str2, String str3, Dialog dialog, View view) {
        ((guy) this.viewModel).m128210t0().getBar_center_text().setText("");
        m156455e0().mo48974l().m120708S6(str);
        o6j0.m162859c("e_chat_view_sensitiveword_block_popup", "p_chat_view_sensitiveword_block_popup_show", o6j0.C18854a.m162878h(Constants.MessagePayloadKeys.MSGID_SERVER, ""), o6j0.C18854a.m162878h("message_send_status", ""), o6j0.C18854a.m162878h("message_receiver", str2), o6j0.C18854a.m162878h("sensitiveword", str3), o6j0.C18854a.m162878h("sensitive_text", str), o6j0.C18854a.m162878h("message_send_values", "send"));
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m210915e2(View view) {
        CoreModule.m29935P().m94658i().mo158215C5(true);
        xdl0.m208344M(((guy) this.viewModel).m128210t0().getBar_send(), false);
        ((guy) this.viewModel).m128210t0().getBar_center_text().setImeOptions(4);
        ((guy) this.viewModel).m128210t0().getBar_center_text().setInputType(((guy) this.viewModel).m128210t0().getBar_center_text().getInputType() ^ 131072);
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m210916f2(Sticker sticker) {
        act().progressDismiss();
        if (sticker == null) {
            return;
        }
        for (Picture picture : sticker.pictures) {
            m210921j1(picture);
            Dimension dimension = picture.size;
            if (dimension.width == 0 || dimension.height == 0) {
                dimension.height = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256;
                dimension.width = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256;
            }
        }
        m156455e0().mo48974l().m120703R6(sticker, true);
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m210917g2(List list, Throwable th) {
        act().progressDismiss();
        rhi.m179369m(rhi.m179382z(((Media) list.get(0)).url));
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ File m210918h2(File file) throws Exception {
        String name = file.getName();
        String str = act().getCacheDir() + "/sogou/gif/";
        rhi.m179359c(file.getPath(), str);
        return new File(str, name);
    }

    /* JADX INFO: renamed from: i1 */
    public final void m210919i1() {
        MessageInputBaseEditView bar_center_text = ((guy) this.viewModel).m128210t0().getBar_center_text();
        if (NullChecker.m81303a(bar_center_text) && bar_center_text.isFocused()) {
            ((InputMethodManager) act().getSystemService("input_method")).hideSoftInputFromWindow(bar_center_text.getWindowToken(), 0);
            bar_center_text.clearFocus();
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ C22306c m210920i2(final File file) {
        return C22306c.fromCallable(new Callable() { // from class: l.hsy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f109354a.m210918h2(file);
            }
        });
    }

    /* JADX INFO: renamed from: j1 */
    public final void m210921j1(Media media) {
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
    public void m210923k1() {
        ((guy) this.viewModel).m128210t0().getBar_send().performClick();
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ File m210924k2(Uri uri) throws Exception {
        return C8585b.m49760a(uri, act().getExternalCacheDir().getPath() + "/sogou");
    }

    /* JADX INFO: renamed from: l1 */
    public final void m210925l1(final ArrayList<Media> arrayList, final ArrayList<Uri> arrayList2) {
        act().progress(R$string.f20775I2);
        duringCreated(C22306c.fromCallable(new Callable() { // from class: l.isy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f114812a.m210894H1(arrayList2);
            }
        }).compose(mkd0.m154951C())).subscribe(mkd0.m154955G(new e30() { // from class: l.jsy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119550a.m210895I1(arrayList, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ C22306c m210926l2(final Uri uri) {
        return C22306c.fromCallable(new Callable() { // from class: l.qsy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f156287a.m210924k2(uri);
            }
        });
    }

    /* JADX INFO: renamed from: m1 */
    public boolean m210927m1(MotionEvent motionEvent) {
        return m210892E1() && motionEvent.getPointerCount() > 1 && motionEvent.getActionIndex() != 0;
    }

    /* JADX INFO: renamed from: n1 */
    public final Message m210929n1() {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get(MessageType.local_real_shot_tips);
        messageNew_.cid = m156455e0().mo48974l().mo120828r3();
        messageNew_.localInConversation = true;
        long jM155944o = mqi0.m155944o();
        messageNew_.owner = CoreModule.m29931H().userId();
        messageNew_.createdTime = jM155944o;
        messageNew_.localCreatedTime = jM155944o;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.m29931H().userId();
        tpd0 tpd0Var = App.f15373i;
        messageNew_.localCreatedSession = tpd0Var.get().intValue();
        messageNew_.f56011id = DbObject.GENERATE_UNIQUE_FAKE_ID(tpd0Var.get().intValue());
        return messageNew_;
    }

    /* JADX INFO: renamed from: n2 */
    public void m210930n2(final String str) {
        final String str2 = m156455e0().mo48974l().f96911c;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        duringCreated(CoreModule.f17545c.f19586M1.m215253w3(str2)).take(1).subscribe(mkd0.m154956H(new e30() { // from class: l.pry
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150961a.m210910Z1(str2, str, (Boolean) obj);
            }
        }, new e30() { // from class: l.qry
            @Override // p149l.e30
            public final void call(Object obj) {
                xsy.m210875l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o2 */
    public void m210931o2() {
        ((guy) this.viewModel).m128123A0();
    }

    /* JADX INFO: renamed from: p1 */
    public void m210932p1(final ArrayList<Uri> arrayList) {
        new xh0.C21150a(act()).m208731j(act().getString(R$string.f20866T5)).m208726e(R$string.f20916a).m208738q(R$string.f21006k).m208736o(new View.OnClickListener() { // from class: l.xry
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f194191a.m210898N1(arrayList, view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: p2 */
    public void m210933p2(boolean z) {
        this.f194334f = z;
        ((guy) this.viewModel).m128129E0();
    }

    /* JADX INFO: renamed from: q1 */
    public final void m210934q1() {
        if (txd.m190951d()) {
            lifecycle().filter(new w9j() { // from class: l.dry
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((C4319c) obj) == C4319c.f15549j);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.ory
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f145364a.m210899O1((C4319c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q2 */
    public void m210935q2(Editable editable, List<String> list) {
        m210937r2(editable, list, true);
    }

    /* JADX INFO: renamed from: r1 */
    public final void m210936r1() {
        if (CoreModule.m29935P().m94658i().mo33588si()) {
            CoreModule.m29935P().m94658i().mo158304S5(true);
        }
    }

    /* JADX INFO: renamed from: r2 */
    public void m210937r2(Editable editable, final List<String> list, boolean z) {
        String strTrim = editable.toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        if (CoreModule.m29935P().m94658i().mo158222E() && !vwb.m200296J(list)) {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) editable.getSpans(0, editable.length(), ForegroundColorSpan.class);
            ArrayList arrayList = new ArrayList();
            for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                arrayList.add(j760.m140076a(Integer.valueOf(editable.getSpanStart(foregroundColorSpan)), Integer.valueOf(editable.getSpanEnd(foregroundColorSpan))));
            }
            for (int length = foregroundColorSpanArr.length - 1; length >= 0; length--) {
                ForegroundColorSpan foregroundColorSpan2 = foregroundColorSpanArr[length];
                editable.removeSpan(foregroundColorSpan2);
            }
        }
        CoreModule.f17545c.f19642f0.m32748Np(false);
        final String strTrim2 = strTrim.toString().trim();
        boolean z2 = qib0.f154711Z.m119125K(strTrim2) || qib0.f154711Z.m119127M(strTrim2);
        if (!z2) {
            m210879o1(strTrim2);
            if (!MessagesAct.f31636s.get().booleanValue() && z) {
                new xh0.C21150a(act()).m208740s(act().getResources().getString(R$string.f20762G5)).m208731j(act().getResources().getString(R$string.f20754F5)).m208728g(true).m208739r(act().getResources().getString(R$string.f20961f)).m208736o(new View.OnClickListener() { // from class: l.nry
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f140229a.m210915e2(view);
                    }
                }).m208727f(act().getResources().getString(R$string.f20952e)).m208722a().m208721g();
                MessagesAct.f31636s.put(Boolean.TRUE);
            }
            ((guy) this.viewModel).m128210t0().getBar_center_text().setText("");
            m156455e0().mo48974l().m120713T6(editable.toString().trim(), list);
            return;
        }
        final String strMo120828r3 = m156455e0().mo48974l().mo120828r3();
        final String strM119126L = qib0.f154711Z.m119126L(strTrim2);
        if (m156455e0().mo48974l().mo120764e4()) {
            this.f194332d.m109040p(j760.m140076a("sensitiveword", strM119126L), j760.m140076a(Constants.MessagePayloadKeys.MSGID_SERVER, ""), j760.m140076a("message_send_status", ""), j760.m140076a("message_receiver", strMo120828r3), j760.m140076a("sensitive_text", strTrim2));
            View viewInflate = act().getLayoutInflater().inflate(l6c0.f126578v, (ViewGroup) null);
            final Dialog dialogM20567z = act().dialog().m20519O(viewInflate).m20497B0(new DialogInterface.OnShowListener() { // from class: l.jry
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f119455a.m210912b2(dialogInterface);
                }
            }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.kry
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f124405a.m210913c2(dialogInterface);
                }
            }).m20567z();
            viewInflate.findViewById(y4c0.f196210r3).setOnClickListener(new View.OnClickListener() { // from class: l.lry
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f129790a.m210914d2(strTrim2, strMo120828r3, strM119126L, dialogM20567z, view);
                }
            });
            viewInflate.findViewById(y4c0.f195970G2).setOnClickListener(new View.OnClickListener() { // from class: l.mry
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xsy.m210865c1(strMo120828r3, strM119126L, strTrim2, dialogM20567z, view);
                }
            });
            dialogM20567z.show();
        } else {
            String strMo120828r4 = m156455e0().mo48974l().mo120828r3();
            String strM120783i3 = m156455e0().mo48974l().m120783i3();
            ((guy) this.viewModel).m128210t0().getBar_center_text().setText("");
            if (z2) {
                C22306c<T> c22306cDuringCreated = duringCreated(CoreModule.f17545c.f19642f0.m33208zh(strMo120828r4, strM120783i3, strTrim2));
                e30 e30Var = new e30() { // from class: l.hry
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f109274a.m210911a2(strTrim2, list, strMo120828r3, strM119126L, (Boolean) obj);
                    }
                };
                strMo120828r3 = strMo120828r3;
                c22306cDuringCreated.subscribe(mkd0.m154956H(e30Var, new e30() { // from class: l.iry
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        xsy.m210864b1((Throwable) obj);
                    }
                }));
            } else {
                CoreModule.f17545c.f19642f0.m32748Np(true);
                m156455e0().mo48974l().m120713T6(strTrim2, list);
                o6j0.m162864h("e_wechat_notice", act().pageId(), new o6j0.C18854a[0]);
            }
        }
        HashSet hashSet = new HashSet(MessagesAct.f31635r.get());
        hashSet.add(strMo120828r3);
        MessagesAct.f31635r.put(hashSet);
    }

    /* JADX INFO: renamed from: s1 */
    public final void m210938s1() {
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.wsy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187985a.m210900P1((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s2 */
    public final void m210939s2(final List<Media> list) {
        act().progress(R$string.f20775I2);
        duringCreated(CoreModule.f17545c.f19642f0.m32723Lo(list, "sogoutest")).subscribe(mkd0.m154956H(new e30() { // from class: l.lsy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129915a.m210916f2((Sticker) obj);
            }
        }, new e30() { // from class: l.msy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f135541a.m210917g2(list, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t1 */
    public final void m210940t1() {
        m156455e0().mo48974l().m120851w3(m156455e0().mo48974l().mo120828r3());
    }

    /* JADX INFO: renamed from: t2 */
    public void m210941t2(Uri uri) {
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return;
        }
        boolean zContains = path.contains(".hotexp");
        V v2 = this.viewModel;
        if (zContains) {
            o6j0.m162859c("e_sougou_gif", ((guy) v2).act().pageId(), o6j0.C18854a.m162876f("sougou_gif_type", 0));
        } else {
            o6j0.m162859c("e_sougou_gif", ((guy) v2).act().pageId(), o6j0.C18854a.m162876f("sougou_gif_type", 1));
        }
        if (Build.VERSION.SDK_INT >= 30) {
            m210944v2(uri);
            return;
        }
        if (path.startsWith("/externalshare")) {
            path = path.substring(14, path.length());
        }
        File file = new File(Environment.getExternalStorageDirectory(), path);
        if (!file.canRead() || file.length() == 0) {
            return;
        }
        duringCreated(((C22306c) new w9j() { // from class: l.esy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f93065a.m210920i2((File) obj);
            }
        }.call(file)).compose(mkd0.m154965Q()).map(new w9j() { // from class: l.fsy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                File file2 = (File) obj;
                return j760.m140076a(C8585b.m49762c(file2), file2);
            }
        }).compose(mkd0.m154951C())).subscribe(mkd0.m154955G(new e30() { // from class: l.gsy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f104229a.m210922j2((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m210928m2(j760<ImageHeaderParser.ImageType, File> j760Var) {
        if (NullChecker.m81303a(j760Var.f116565b)) {
            ImageHeaderParser.ImageType imageType = j760Var.f116564a;
            File file = j760Var.f116565b;
            Picture picture = new Picture();
            picture.nullCheck();
            picture.url = rhi.m179355B(file.getPath());
            picture.status = MediaLocalStatus.get("raw");
            ArrayList arrayList = new ArrayList();
            arrayList.add(picture);
            switch (C21213e.f194339a[imageType.ordinal()]) {
                case 1:
                    picture.mediaType = "image/jpg";
                    m210945w2(arrayList);
                    break;
                case 2:
                case 3:
                    picture.mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG;
                    m210945w2(arrayList);
                    break;
                case 4:
                    picture.mediaType = "image/gif";
                    m210939s2(arrayList);
                    break;
                case 5:
                case 6:
                    picture.mediaType = "image/webp";
                    m210939s2(arrayList);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m210943v1() {
        duringCreated(f194325g).subscribe(mkd0.m154955G(new e30() { // from class: l.tsy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171975a.m210903S1((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v2 */
    public final void m210944v2(final Uri uri) {
        duringCreated(((C22306c) new w9j() { // from class: l.nsy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f140304a.m210926l2((Uri) obj);
            }
        }.call(uri)).compose(mkd0.m154965Q()).map(new w9j() { // from class: l.osy
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j760.m140076a(C8585b.m49761b(uri), (File) obj);
            }
        }).compose(mkd0.m154951C())).subscribe(mkd0.m154955G(new e30() { // from class: l.psy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f151078a.m210928m2((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w2 */
    public final void m210945w2(List<Media> list) {
        Message message = new Message();
        message.media = new ArrayList(list);
        message.messageType = MessageType.get("picture");
        m156455e0().mo48974l().m120631A6(message);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m210946x1() {
        if (CoreModule.m29935P().m94658i().mo158204B()) {
            duringCreated(mkd0.m154984r(CoreModule.f17545c.m31483n3().map(new w9j() { // from class: l.ery
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(CoreModule.m29935P().m94658i().mo33623ws() > 0);
                }
            }).distinctUntilChanged(), CoreModule.f17545c.f19642f0.m32737Ne(m156455e0().mo48974l().mo120828r3()), new x9j() { // from class: l.fry
                @Override // p149l.x9j
                public final Object call(Object obj, Object obj2) {
                    return xsy.m210871h1((Boolean) obj, (Conversation) obj2);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.gry
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f104126a.m210904T1((Conversation) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x2 */
    public void m210947x2(int i) {
        this.f194330b = i;
    }

    /* JADX INFO: renamed from: y2 */
    public void m210948y2(int i) {
        ((guy) this.viewModel).m128179c2(i);
    }

    /* JADX INFO: renamed from: z1 */
    public final void m210949z1() {
        if (!m210844D1()) {
            duringCreated(CoreModule.f17545c.f19642f0.m32761Pe(m156455e0().mo48974l().mo120828r3())).subscribe(mkd0.m154955G(new e30() { // from class: l.usy
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178212a.m210907W1((Integer) obj);
                }
            }));
        }
        try {
            JSONObject jSONObject = new JSONObject(RemoteConfig.m79298x().m79302F("live_message_guide_tip_threshold"));
            f194326h = jSONObject.optInt("live_message_guide_tip_threshold_1", 10);
            f194327i = jSONObject.optInt("live_message_guide_tip_threshold_2", 20);
        } catch (Exception unused) {
        }
        duringCreated(CoreModule.f17545c.f19642f0.m32761Pe(m156455e0().mo48974l().mo120828r3())).subscribe(mkd0.m154955G(new e30() { // from class: l.vsy
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f182893a.m210908X1((Integer) obj);
            }
        }));
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
