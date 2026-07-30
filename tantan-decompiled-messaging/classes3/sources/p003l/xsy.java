package p003l;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p000p1.mobile.putong.core.p001ui.messages.helper.MessageWarmingUpHelper;
import com.p000p1.mobile.putong.core.p001ui.messages.model.messagebar.MessageBarActionItemType;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.a;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.data.ChatGroupMember;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MessageType;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.Sticker;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.messages.sogou.ImageHeaderParser;
import com.p1.mobile.putong.core.ui.messages.sogou.b;
import com.p1.mobile.putong.core.ui.messages.view.MessageInputBaseEditView;
import com.p1.mobile.putong.data.Dimension;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.MediaLocalStatus;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import l.c16;
import l.cwf0;
import l.e51;
import l.hap;
import l.hpd0;
import l.j760;
import l.jq2;
import l.l6c0;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.mqi0;
import l.n3m;
import l.o6j0;
import l.qib0;
import l.rhi;
import l.roj0;
import l.s7m;
import l.tpd0;
import l.txd;
import l.u95;
import l.v4e;
import l.vwb;
import l.w4e;
import l.x4e;
import l.xdl0;
import l.xh0;
import l.y4c0;
import l.zqx;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.json.JSONObject;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import org.spongycastle.crypto.tls.CipherSuite;
import p014rx.C1099c;
import p014rx.subjects.C1185a;
import p014rx.subjects.C1186b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class xsy extends muy<guy> {

    /* JADX INFO: renamed from: g */
    public static C1186b<roj0> f8832g = C1186b.m9978b();

    /* JADX INFO: renamed from: h */
    public static int f8833h = 10;

    /* JADX INFO: renamed from: i */
    public static int f8834i = 20;

    /* JADX INFO: renamed from: j */
    public static hpd0 f8835j;

    /* JADX INFO: renamed from: k */
    public static hpd0 f8836k;

    /* JADX INFO: renamed from: b */
    public int f8837b;

    /* JADX INFO: renamed from: c */
    public C1185a<String> f8838c;

    /* JADX INFO: renamed from: d */
    public cwf0 f8839d;

    /* JADX INFO: renamed from: e */
    public boolean f8840e;

    /* JADX INFO: renamed from: f */
    public boolean f8841f;

    /* JADX INFO: renamed from: l.xsy$a */
    public class C0641a implements v4e {
        public C0641a() {
        }

        /* JADX INFO: renamed from: a */
        public void m8849a() {
            CoreModule.P().i().e3("message");
        }

        /* JADX INFO: renamed from: b */
        public void m8850b(boolean z) {
            CoreModule.P().i().u2("message", z);
        }

        /* JADX INFO: renamed from: c */
        public void m8851c() {
            CoreModule.P().i().F1("message");
        }
    }

    /* JADX INFO: renamed from: l.xsy$b */
    public class C0642b implements w4e {
        public C0642b() {
        }

        /* JADX INFO: renamed from: a */
        public void m8852a() {
            CoreModule.P().i().X2("message");
        }

        /* JADX INFO: renamed from: b */
        public void m8853b() {
            CoreModule.P().i().z4("message");
        }

        /* JADX INFO: renamed from: c */
        public void m8854c() {
            CoreModule.P().i().i4("message");
        }
    }

    /* JADX INFO: renamed from: l.xsy$c */
    public class C0643c implements x4e {
        public C0643c() {
        }

        /* JADX INFO: renamed from: a */
        public void m8855a() {
            CoreModule.P().i().r4("message");
        }

        /* JADX INFO: renamed from: b */
        public void m8856b() {
            CoreModule.P().i().V5("message");
        }

        /* JADX INFO: renamed from: c */
        public void m8857c() {
            CoreModule.P().i().Q5("message");
        }
    }

    /* JADX INFO: renamed from: l.xsy$d */
    public class C0644d implements n3m {
        public C0644d() {
        }

        public boolean disableAutoPV() {
            return false;
        }

        public String pageId() {
            return "p_chat_view_sensitiveword_block_popup_show";
        }
    }

    /* JADX INFO: renamed from: l.xsy$e */
    public static /* synthetic */ class C0645e {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8846a;

        static {
            int[] iArr = new int[ImageHeaderParser.ImageType.values().length];
            f8846a = iArr;
            try {
                iArr[ImageHeaderParser.ImageType.JPEG.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8846a[ImageHeaderParser.ImageType.PNG.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8846a[ImageHeaderParser.ImageType.PNG_A.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f8846a[ImageHeaderParser.ImageType.GIF.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f8846a[ImageHeaderParser.ImageType.WEBP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f8846a[ImageHeaderParser.ImageType.WEBP_A.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        Boolean bool = Boolean.FALSE;
        f8835j = new hpd0("r_s_t_1_s", bool);
        f8836k = new hpd0("r_s_t_2_s", bool);
    }

    public xsy(mcr mcrVar) {
        super(mcrVar);
        this.f8837b = 1;
        this.f8838c = C1185a.m9969b();
        this.f8839d = new cwf0(new C0644d());
        this.f8840e = false;
        this.f8841f = false;
    }

    /* JADX INFO: renamed from: D1 */
    private boolean m8742D1() {
        return ((Boolean) m6497e0().mo2066l().f3525J.get()).booleanValue();
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m8759X0(Throwable th) {
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m8762b1(Throwable th) {
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ void m8763c1(String str, String str2, String str3, Dialog dialog, View view) {
        o6j0.c("e_chat_view_sensitiveword_block_popup", "p_chat_view_sensitiveword_block_popup_show", new o6j0.a[]{o6j0.a.h("message_id", ""), o6j0.a.h("message_send_status", ""), o6j0.a.h("message_receiver", str), o6j0.a.h("sensitiveword", str2), o6j0.a.h("sensitive_text", str3), o6j0.a.h("message_send_values", "reject")});
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m8768h0() {
    }

    /* JADX INFO: renamed from: h1 */
    public static /* synthetic */ Conversation m8769h1(Boolean bool, Conversation conversation) {
        return conversation;
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m8773l0(Throwable th) {
    }

    /* JADX INFO: renamed from: o1 */
    private void m8777o1(final String str) {
        qib0.Z.Q(str, OmsDialog.p_user_passive_show_chat.getIdentifier()).subscribe((m250) mkd0.H(new e30() { // from class: l.yry
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9126a.m8794J1(str, (Boolean) obj);
            }
        }, new e30() { // from class: l.asy
            @Override // p003l.e30
            public final void call(Object obj) {
                xsy.m8759X0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m8778p0(MessageInputBaseEditView messageInputBaseEditView, boolean z, int i, String str, int i2) {
        messageInputBaseEditView.getContext().showInput(messageInputBaseEditView, 0);
        if (z) {
            messageInputBaseEditView.setSelection(i + str.length(), i2 + str.length());
        } else {
            messageInputBaseEditView.setSelection(str.length() + i, i + str.length());
        }
        ((Vibrator) CoreModule.b.getSystemService("vibrator")).vibrate(50L);
    }

    /* JADX INFO: renamed from: u1 */
    private void m8784u1() {
        creates(new e30() { // from class: l.zry
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f9405a.m8799Q1((Bundle) obj);
            }
        }, new d30() { // from class: l.ksy
            @Override // p003l.d30
            public final void call() {
                xsy.m8768h0();
            }
        });
        if (CoreModule.P().i().l()) {
            lifecycle().filter(new w9j() { // from class: l.rsy
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.j);
                }
            }).subscribe((m250) mkd0.G(new e30() { // from class: l.ssy
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f7298a.m8800R1((c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B1 */
    public void m8788B1(CharSequence charSequence) {
        ((guy) ((jq2) this).viewModel).m4844t0().getBar_center_text().getText().insert(((guy) ((jq2) this).viewModel).m4844t0().getBar_center_text().getSelectionStart(), charSequence);
    }

    /* JADX INFO: renamed from: C1 */
    public void m8789C1(User user, ChatGroupMember chatGroupMember) {
        String str = ((DbObject) user).id;
        StringBuilder sb = new StringBuilder("@");
        sb.append(TextUtils.isEmpty(chatGroupMember.nickName) ? user.name : chatGroupMember.nickName);
        sb.append(" ");
        final String string = sb.toString();
        int selectionStart = ((guy) ((jq2) this).viewModel).m4844t0().getBar_center_text().getSelectionStart();
        int selectionEnd = ((guy) ((jq2) this).viewModel).m4844t0().getBar_center_text().getSelectionEnd();
        final boolean z = selectionStart == selectionEnd || selectionEnd < 0;
        final int i = selectionStart < 0 ? 0 : selectionStart;
        final int i2 = selectionEnd < 0 ? 0 : selectionEnd;
        final MessageInputBaseEditView bar_center_text = ((guy) ((jq2) this).viewModel).m4844t0().getBar_center_text();
        bar_center_text.p(str, i, string.length() + i);
        bar_center_text.getText().insert(i, string);
        bar_center_text.requestFocus();
        e51.H(bar_center_text.getContext(), new Runnable() { // from class: l.sry
            @Override // java.lang.Runnable
            public final void run() {
                xsy.m8778p0(bar_center_text, z, i, string, i2);
            }
        }, 10L);
    }

    /* JADX INFO: renamed from: E1 */
    public boolean m8790E1() {
        return xdl0.O0(((guy) ((jq2) this).viewModel).m4844t0().getRecordLayout());
    }

    /* JADX INFO: renamed from: F1 */
    public boolean m8791F1() {
        return this.f8841f;
    }

    /* JADX INFO: renamed from: H1 */
    public final /* synthetic */ List m8792H1(ArrayList arrayList) throws Exception {
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
                    File file = new File(CoreModule.b.getExternalCacheDir(), System.currentTimeMillis() + "_" + SystemClock.uptimeMillis() + ".copy");
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        try {
                            rhi.f(inputStreamOpenInputStream, fileOutputStream);
                            arrayList2.add(file);
                        } catch (IOException e2) {
                            e = e2;
                            CrashHelper.c(e);
                            Objects.toString(uri);
                        }
                    } catch (Throwable th) {
                        th = th;
                        inputStream = inputStreamOpenInputStream;
                        u95.a(inputStream);
                        u95.a(fileOutputStream);
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
            u95.a(inputStreamOpenInputStream);
            u95.a(fileOutputStream);
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m8793I1(ArrayList arrayList, List list) {
        act().progressDismiss();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            File file = (File) it.next();
            Picture picture = new Picture();
            ((Media) picture).url = rhi.B(file.getAbsolutePath());
            ((Media) picture).status = MediaLocalStatus.get("raw");
            arrayList.add(picture);
        }
        if (arrayList.size() > 0) {
            m6497e0().mo2066l().m4273m6(arrayList);
        } else {
            lsi0.h(R.string.A2);
        }
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m8794J1(String str, Boolean bool) {
        if (bool.booleanValue()) {
            CoreModule.P().i().W4(act(), str);
        }
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m8795L1(ArrayList arrayList) {
        ArrayList<Media> arrayList2 = new ArrayList<>();
        ArrayList<Uri> arrayList3 = new ArrayList<>();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Uri uri = (Uri) it.next();
            String strG = c16.g(uri);
            if (NullChecker.a(strG)) {
                String strB = rhi.B(strG);
                Picture picture = new Picture();
                ((Media) picture).url = strB;
                ((Media) picture).status = MediaLocalStatus.get("raw");
                arrayList2.add(picture);
            } else if ("content".equals(uri.getScheme())) {
                arrayList3.add(uri);
            }
        }
        if (!arrayList3.isEmpty()) {
            m8824l1(arrayList2, arrayList3);
        } else if (arrayList2.size() > 0) {
            m6497e0().mo2066l().m4273m6(arrayList2);
        } else {
            lsi0.h(R.string.A2);
        }
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ void m8796N1(final ArrayList arrayList, View view) {
        final d30 d30Var = new d30() { // from class: l.csy
            @Override // p003l.d30
            public final void call() {
                this.f2799a.m8795L1(arrayList);
            }
        };
        C0641a c0641a = new C0641a();
        C0642b c0642b = new C0642b();
        C0643c c0643c = new C0643c();
        if (zqx.k()) {
            new zqx().d(act(), (View) null, new d30() { // from class: l.dsy
                @Override // p003l.d30
                public final void call() {
                    d30Var.call();
                }
            }, (e30) null, c0643c, c0642b, c0641a);
        } else {
            PermissionHelper.c().r(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}).w(false).u(false).o(d30Var).p(c0641a).t(c0642b).v(c0643c).i(act());
        }
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m8797O1(c cVar) {
        m8818i1();
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m8798P1(c cVar) {
        if (cVar == c.i) {
            if (this.f8840e) {
                this.f8839d.r();
            }
        } else if (cVar == c.j && this.f8840e) {
            this.f8839d.g();
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m8799Q1(Bundle bundle) {
        if (CoreModule.P().i().G1()) {
            this.f8837b = 3;
        }
        ((guy) ((jq2) this).viewModel).m4757B0();
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m8800R1(c cVar) {
        Conversation conversationXe = CoreModule.c.f0.Xe(m6497e0().mo2066l().m4250i3());
        if (!NullChecker.a(conversationXe) || TextUtils.isEmpty(((guy) ((jq2) this).viewModel).m4842s0()) || ((guy) ((jq2) this).viewModel).m4842s0().equals(conversationXe.localDraft)) {
            return;
        }
        String strM4842s0 = ((guy) ((jq2) this).viewModel).m4842s0();
        final Conversation conversationClone = conversationXe.clone();
        if (conversationXe.localEverHasMessage) {
            conversationClone.latestTime = mqi0.o();
        }
        conversationClone.localDraft = strM4842s0;
        e51.y(new Runnable() { // from class: l.rry
            @Override // java.lang.Runnable
            public final void run() {
                CoreModule.c.U.a(new d30() { // from class: l.wry
                    @Override // p003l.d30
                    public final void call() {
                        CoreModule.c.f0.mq(conversation);
                    }
                });
            }
        });
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ void m8801S1(roj0 roj0Var) {
        ((guy) ((jq2) this).viewModel).m4826k0();
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m8802T1(Conversation conversation) {
        if (!hap.b(conversation)) {
            ((guy) ((jq2) this).viewModel).m4763E1();
            return;
        }
        if (TextUtils.equals(conversation.additional.oneSide.initiator, CoreModule.H().userId())) {
            ((guy) ((jq2) this).viewModel).m4795V1(new d30() { // from class: l.ury
                @Override // p003l.d30
                public final void call() {
                    lsi0.w(R.string.J3);
                }
            });
        } else if (!CoreModule.P().i().I0() || CoreModule.K().me_().isFemale() || CoreModule.P().i().ws() > 0) {
            ((guy) ((jq2) this).viewModel).m4763E1();
        } else {
            ((guy) ((jq2) this).viewModel).m4795V1(new d30() { // from class: l.vry
                @Override // p003l.d30
                public final void call() {
                    this.f8402a.m8803U1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m8803U1() {
        CoreModule.P().i().wr(act(), "intl_letter_reply", Privilege.see_letter_gp);
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m8804V1() {
        ((guy) ((jq2) this).viewModel).m4817f0();
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m8805W1(Integer num) {
        if (num.intValue() >= 5) {
            e51.M(new Runnable() { // from class: l.try
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7716a.m8804V1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m8806X1(Integer num) {
        boolean z = ((guy) ((jq2) this).viewModel).m4844t0().mo1916b(MessageBarActionItemType.SHI_PAI) != null;
        if (num.intValue() >= f8834i && !((Boolean) f8836k.get()).booleanValue() && z) {
            Message messageM8828n1 = m8828n1();
            messageM8828n1.value = "2";
            CoreModule.c.f0.Zg(messageM8828n1);
            f8836k.put(Boolean.TRUE);
            return;
        }
        if (num.intValue() < f8833h || ((Boolean) f8835j.get()).booleanValue() || ((Boolean) f8836k.get()).booleanValue() || !z) {
            return;
        }
        Message messageM8828n2 = m8828n1();
        messageM8828n2.value = "1";
        CoreModule.c.f0.Zg(messageM8828n2);
        f8835j.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ boolean m8807Y1(MessageWarmingUpHelper.WarmingUpLevel warmingUpLevel, int i, int i2, Intent intent) {
        int intExtra;
        if (i2 == -1 && NullChecker.a(intent) && intent.hasExtra("featureID") && (intExtra = intent.getIntExtra("featureID", -1)) >= 1 && intExtra <= 4) {
            ((guy) ((jq2) this).viewModel).m4773K0(warmingUpLevel, intExtra);
        }
        return true;
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m8808Z1(String str, String str2, Boolean bool) {
        User userPa = CoreModule.c.e0.Pa(str);
        User userP9 = CoreModule.c.e0.p9();
        Conversation conversationXe = CoreModule.c.f0.Xe(str);
        if (userPa == null || userP9 == null || conversationXe == null) {
            return;
        }
        fcz<? extends DbObject, ?> fczVarMo2066l = m6497e0().mo2066l();
        final MessageWarmingUpHelper.WarmingUpLevel warmingUpLevelM4265l3 = fczVarMo2066l.m4265l3();
        String anonymousUrl = ((Media) userPa.fp()).url;
        String anonymousUrl2 = ((Media) userP9.fp()).url;
        if (conversationXe.isAnonymous()) {
            anonymousUrl = userPa.getAnonymousUrl();
            anonymousUrl2 = userP9.getAnonymousUrl();
        }
        Uri.Builder builderBuildUpon = Uri.parse(g.Z2).buildUpon();
        builderBuildUpon.appendQueryParameter("other_avatar_url", anonymousUrl);
        builderBuildUpon.appendQueryParameter("other_name", userPa.name);
        builderBuildUpon.appendQueryParameter("self_avatar_url", anonymousUrl2);
        builderBuildUpon.appendQueryParameter("temperature", "" + MessageWarmingUpHelper.m2291b(fczVarMo2066l.m4270m3()));
        builderBuildUpon.appendQueryParameter("mm", "" + conversationXe.mm);
        builderBuildUpon.appendQueryParameter("feature_available", bool.booleanValue() ? "1" : "0");
        builderBuildUpon.appendQueryParameter("source", str2);
        builderBuildUpon.appendQueryParameter("isOtherUserMale", userPa.isFemale() ? "0" : "1");
        MessagesAct messagesActM4797X = ((guy) ((jq2) this).viewModel).act();
        if (NullChecker.a(messagesActM4797X)) {
            Intent intentC2 = MkWebViewAct.c2(((guy) ((jq2) this).viewModel).act(), "", builderBuildUpon.toString(), true, true, (ResultReceiver) null);
            intentC2.putExtra("hideNotch", true);
            messagesActM4797X.startActivityForResult(intentC2, new a.a() { // from class: l.bsy
                /* JADX INFO: renamed from: a */
                public final boolean m3169a(int i, int i2, Intent intent) {
                    return this.f2490a.m8807Y1(warmingUpLevelM4265l3, i, i2, intent);
                }
            });
        }
    }

    /* JADX INFO: renamed from: a0 */
    public void m8809a0() {
        super.a0();
        m8784u1();
        m8837s1();
        m8833q1();
        m8842v1();
        m8845x1();
        m8848z1();
        m8839t1();
        m8835r1();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m8810a2(String str, List list, String str2, String str3, Boolean bool) {
        CoreModule.c.f0.Np(bool.booleanValue());
        m6497e0().mo2066l().m4178T6(str, list);
        o6j0.h("e_chat_view_sensitive_words_send_tips", m6497e0().mo2066l().pageId(), new o6j0.a[]{o6j0.a.h("message_id", ""), o6j0.a.h("message_send_status", ""), o6j0.a.h("message_receiver", str2), o6j0.a.h("sensitiveword", str3), o6j0.a.h("sensitive_text", str), o6j0.a.h("message_send_values", "send")});
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m8811b2(DialogInterface dialogInterface) {
        this.f8839d.c();
        this.f8839d.r();
        this.f8840e = true;
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m8812c2(DialogInterface dialogInterface) {
        this.f8839d.g();
        this.f8839d.e();
        this.f8840e = false;
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m8813d2(String str, String str2, String str3, Dialog dialog, View view) {
        ((guy) ((jq2) this).viewModel).m4844t0().getBar_center_text().setText("");
        m6497e0().mo2066l().m4173S6(str);
        o6j0.c("e_chat_view_sensitiveword_block_popup", "p_chat_view_sensitiveword_block_popup_show", new o6j0.a[]{o6j0.a.h("message_id", ""), o6j0.a.h("message_send_status", ""), o6j0.a.h("message_receiver", str2), o6j0.a.h("sensitiveword", str3), o6j0.a.h("sensitive_text", str), o6j0.a.h("message_send_values", "send")});
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m8814e2(View view) {
        CoreModule.P().i().C5(true);
        xdl0.M(((guy) ((jq2) this).viewModel).m4844t0().getBar_send(), false);
        ((guy) ((jq2) this).viewModel).m4844t0().getBar_center_text().setImeOptions(4);
        ((guy) ((jq2) this).viewModel).m4844t0().getBar_center_text().setInputType(((guy) ((jq2) this).viewModel).m4844t0().getBar_center_text().getInputType() ^ PKIFailureInfo.unsupportedVersion);
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m8815f2(Sticker sticker) {
        act().progressDismiss();
        if (sticker == null) {
            return;
        }
        for (Picture picture : sticker.pictures) {
            m8820j1(picture);
            Dimension dimension = picture.size;
            if (dimension.width == 0 || dimension.height == 0) {
                dimension.height = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256;
                dimension.width = CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_128_CBC_SHA256;
            }
        }
        m6497e0().mo2066l().m4168R6(sticker, true);
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m8816g2(List list, Throwable th) {
        act().progressDismiss();
        rhi.m(rhi.z(((Media) list.get(0)).url));
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ File m8817h2(File file) throws Exception {
        String name = file.getName();
        String str = act().getCacheDir() + "/sogou/gif/";
        rhi.c(file.getPath(), str);
        return new File(str, name);
    }

    /* JADX INFO: renamed from: i1 */
    public final void m8818i1() {
        MessageInputBaseEditView bar_center_text = ((guy) ((jq2) this).viewModel).m4844t0().getBar_center_text();
        if (NullChecker.a(bar_center_text) && bar_center_text.isFocused()) {
            ((InputMethodManager) act().getSystemService("input_method")).hideSoftInputFromWindow(bar_center_text.getWindowToken(), 0);
            bar_center_text.clearFocus();
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ C1099c m8819i2(final File file) {
        return C1099c.fromCallable(new Callable() { // from class: l.hsy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4274a.m8817h2(file);
            }
        });
    }

    /* JADX INFO: renamed from: j1 */
    public final void m8820j1(Media media) {
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
    public void m8822k1() {
        ((guy) ((jq2) this).viewModel).m4844t0().getBar_send().performClick();
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ File m8823k2(Uri uri) throws Exception {
        return b.a(uri, act().getExternalCacheDir().getPath() + "/sogou");
    }

    /* JADX INFO: renamed from: l1 */
    public final void m8824l1(final ArrayList<Media> arrayList, final ArrayList<Uri> arrayList2) {
        act().progress(R.string.I2);
        duringCreated(C1099c.fromCallable(new Callable() { // from class: l.isy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f4490a.m8792H1(arrayList2);
            }
        }).compose(mkd0.C())).subscribe((m250) mkd0.G(new e30() { // from class: l.jsy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4722a.m8793I1(arrayList, (List) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ C1099c m8825l2(final Uri uri) {
        return C1099c.fromCallable(new Callable() { // from class: l.qsy
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f6693a.m8823k2(uri);
            }
        });
    }

    /* JADX INFO: renamed from: m1 */
    public boolean m8826m1(MotionEvent motionEvent) {
        return m8790E1() && motionEvent.getPointerCount() > 1 && motionEvent.getActionIndex() != 0;
    }

    /* JADX INFO: renamed from: n1 */
    public final Message m8828n1() {
        Message messageNew_ = Message.new_();
        messageNew_.messageType = MessageType.get("local_real_shot_tips");
        messageNew_.cid = m6497e0().mo2066l().m4295r3();
        messageNew_.localInConversation = true;
        long jO = mqi0.o();
        messageNew_.owner = CoreModule.H().userId();
        messageNew_.createdTime = jO;
        messageNew_.localCreatedTime = jO;
        messageNew_.recalled = Boolean.FALSE;
        messageNew_.hostId = CoreModule.H().userId();
        tpd0 tpd0Var = App.i;
        messageNew_.localCreatedSession = ((Integer) tpd0Var.get()).intValue();
        ((DbObject) messageNew_).id = DbObject.GENERATE_UNIQUE_FAKE_ID(((Integer) tpd0Var.get()).intValue());
        return messageNew_;
    }

    /* JADX INFO: renamed from: n2 */
    public void m8829n2(final String str) {
        final String str2 = m6497e0().mo2066l().f3543c;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        duringCreated(CoreModule.c.M1.w3(str2)).take(1).subscribe((m250) mkd0.H(new e30() { // from class: l.pry
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6498a.m8808Z1(str2, str, (Boolean) obj);
            }
        }, new e30() { // from class: l.qry
            @Override // p003l.e30
            public final void call(Object obj) {
                xsy.m8773l0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o2 */
    public void m8830o2() {
        ((guy) ((jq2) this).viewModel).m4755A0();
    }

    /* JADX INFO: renamed from: p1 */
    public void m8831p1(final ArrayList<Uri> arrayList) {
        new xh0.a(act()).j(act().getString(R.string.T5)).e(R.string.a).q(R.string.k).o(new View.OnClickListener() { // from class: l.xry
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8828a.m8796N1(arrayList, view);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: p2 */
    public void m8832p2(boolean z) {
        this.f8841f = z;
        ((guy) ((jq2) this).viewModel).m4762E0();
    }

    /* JADX INFO: renamed from: q1 */
    public final void m8833q1() {
        if (txd.d()) {
            lifecycle().filter(new w9j() { // from class: l.dry
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((c) obj) == c.j);
                }
            }).subscribe((m250) mkd0.G(new e30() { // from class: l.ory
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f6220a.m8797O1((c) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: q2 */
    public void m8834q2(Editable editable, List<String> list) {
        m8836r2(editable, list, true);
    }

    /* JADX INFO: renamed from: r1 */
    public final void m8835r1() {
        if (CoreModule.P().i().si()) {
            CoreModule.P().i().S5(true);
        }
    }

    /* JADX INFO: renamed from: r2 */
    public void m8836r2(Editable editable, final List<String> list, boolean z) {
        String strTrim = editable.toString().trim();
        if (TextUtils.isEmpty(strTrim)) {
            return;
        }
        if (CoreModule.P().i().E() && !vwb.J(list)) {
            ForegroundColorSpan[] foregroundColorSpanArr = (ForegroundColorSpan[]) editable.getSpans(0, editable.length(), ForegroundColorSpan.class);
            ArrayList arrayList = new ArrayList();
            for (ForegroundColorSpan foregroundColorSpan : foregroundColorSpanArr) {
                arrayList.add(j760.a(Integer.valueOf(editable.getSpanStart(foregroundColorSpan)), Integer.valueOf(editable.getSpanEnd(foregroundColorSpan))));
            }
            for (int length = foregroundColorSpanArr.length - 1; length >= 0; length--) {
                ForegroundColorSpan foregroundColorSpan2 = foregroundColorSpanArr[length];
                editable.removeSpan(foregroundColorSpan2);
            }
        }
        CoreModule.c.f0.Np(false);
        final String strTrim2 = strTrim.toString().trim();
        boolean z2 = qib0.Z.K(strTrim2) || qib0.Z.M(strTrim2);
        if (!z2) {
            m8777o1(strTrim2);
            if (!((Boolean) MessagesAct.f1527s.get()).booleanValue() && z) {
                new xh0.a(act()).s(act().getResources().getString(R.string.G5)).j(act().getResources().getString(R.string.F5)).g(true).r(act().getResources().getString(R.string.f)).o(new View.OnClickListener() { // from class: l.nry
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f5958a.m8814e2(view);
                    }
                }).f(act().getResources().getString(R.string.e)).a().g();
                MessagesAct.f1527s.put(Boolean.TRUE);
            }
            ((guy) ((jq2) this).viewModel).m4844t0().getBar_center_text().setText("");
            m6497e0().mo2066l().m4178T6(editable.toString().trim(), list);
            return;
        }
        final String strM4295r3 = m6497e0().mo2066l().m4295r3();
        final String strL = qib0.Z.L(strTrim2);
        if (m6497e0().mo2066l().m4231e4()) {
            this.f8839d.p(new j760[]{j760.a("sensitiveword", strL), j760.a("message_id", ""), j760.a("message_send_status", ""), j760.a("message_receiver", strM4295r3), j760.a("sensitive_text", strTrim2)});
            View viewInflate = act().getLayoutInflater().inflate(l6c0.v, (ViewGroup) null);
            final Dialog dialogZ = act().dialog().O(viewInflate).B0(new DialogInterface.OnShowListener() { // from class: l.jry
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f4719a.m8811b2(dialogInterface);
                }
            }).V(new DialogInterface.OnDismissListener() { // from class: l.kry
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f5019a.m8812c2(dialogInterface);
                }
            }).z();
            viewInflate.findViewById(y4c0.r3).setOnClickListener(new View.OnClickListener() { // from class: l.lry
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f5395a.m8813d2(strTrim2, strM4295r3, strL, dialogZ, view);
                }
            });
            viewInflate.findViewById(y4c0.G2).setOnClickListener(new View.OnClickListener() { // from class: l.mry
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    xsy.m8763c1(strM4295r3, strL, strTrim2, dialogZ, view);
                }
            });
            dialogZ.show();
        } else {
            String strM4295r4 = m6497e0().mo2066l().m4295r3();
            String strM4250i3 = m6497e0().mo2066l().m4250i3();
            ((guy) ((jq2) this).viewModel).m4844t0().getBar_center_text().setText("");
            if (z2) {
                C1099c c1099cDuringCreated = duringCreated(CoreModule.c.f0.zh(strM4295r4, strM4250i3, strTrim2));
                e30 e30Var = new e30() { // from class: l.hry
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        this.f4266a.m8810a2(strTrim2, list, strM4295r3, strL, (Boolean) obj);
                    }
                };
                strM4295r3 = strM4295r3;
                c1099cDuringCreated.subscribe((m250) mkd0.H(e30Var, new e30() { // from class: l.iry
                    @Override // p003l.e30
                    public final void call(Object obj) {
                        xsy.m8762b1((Throwable) obj);
                    }
                }));
            } else {
                CoreModule.c.f0.Np(true);
                m6497e0().mo2066l().m4178T6(strTrim2, list);
                o6j0.h("e_wechat_notice", act().pageId(), new o6j0.a[0]);
            }
        }
        HashSet hashSet = new HashSet((Collection) MessagesAct.f1526r.get());
        hashSet.add(strM4295r3);
        MessagesAct.f1526r.put(hashSet);
    }

    /* JADX INFO: renamed from: s1 */
    public final void m8837s1() {
        lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.wsy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8616a.m8798P1((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s2 */
    public final void m8838s2(final List<Media> list) {
        act().progress(R.string.I2);
        duringCreated(CoreModule.c.f0.Lo(list, "sogoutest")).subscribe((m250) mkd0.H(new e30() { // from class: l.lsy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5410a.m8815f2((Sticker) obj);
            }
        }, new e30() { // from class: l.msy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5756a.m8816g2(list, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t1 */
    public final void m8839t1() {
        m6497e0().mo2066l().m4318w3(m6497e0().mo2066l().m4295r3());
    }

    /* JADX INFO: renamed from: t2 */
    public void m8840t2(Uri uri) {
        String path = uri.getPath();
        if (TextUtils.isEmpty(path)) {
            return;
        }
        boolean zContains = path.contains(".hotexp");
        s7m s7mVar = ((jq2) this).viewModel;
        if (zContains) {
            o6j0.c("e_sougou_gif", ((guy) s7mVar).act().pageId(), new o6j0.a[]{o6j0.a.f("sougou_gif_type", 0)});
        } else {
            o6j0.c("e_sougou_gif", ((guy) s7mVar).act().pageId(), new o6j0.a[]{o6j0.a.f("sougou_gif_type", 1)});
        }
        if (Build.VERSION.SDK_INT >= 30) {
            m8843v2(uri);
            return;
        }
        if (path.startsWith("/externalshare")) {
            path = path.substring(14, path.length());
        }
        File file = new File(Environment.getExternalStorageDirectory(), path);
        if (!file.canRead() || file.length() == 0) {
            return;
        }
        duringCreated(((C1099c) new w9j() { // from class: l.esy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f3372a.m8819i2((File) obj);
            }
        }.call(file)).compose(mkd0.Q()).map(new w9j() { // from class: l.fsy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                File file2 = (File) obj;
                return j760.a(b.c(file2), file2);
            }
        }).compose(mkd0.C())).subscribe((m250) mkd0.G(new e30() { // from class: l.gsy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f4006a.m8821j2((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u2, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final void m8827m2(j760<ImageHeaderParser.ImageType, File> j760Var) {
        if (NullChecker.a(j760Var.b)) {
            ImageHeaderParser.ImageType imageType = (ImageHeaderParser.ImageType) j760Var.a;
            File file = (File) j760Var.b;
            Picture picture = new Picture();
            picture.nullCheck();
            ((Media) picture).url = rhi.B(file.getPath());
            ((Media) picture).status = MediaLocalStatus.get("raw");
            ArrayList arrayList = new ArrayList();
            arrayList.add(picture);
            switch (C0645e.f8846a[imageType.ordinal()]) {
                case 1:
                    ((Media) picture).mediaType = "image/jpg";
                    m8844w2(arrayList);
                    break;
                case 2:
                case 3:
                    ((Media) picture).mediaType = DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG;
                    m8844w2(arrayList);
                    break;
                case 4:
                    ((Media) picture).mediaType = "image/gif";
                    m8838s2(arrayList);
                    break;
                case 5:
                case 6:
                    ((Media) picture).mediaType = "image/webp";
                    m8838s2(arrayList);
                    break;
            }
        }
    }

    /* JADX INFO: renamed from: v1 */
    public final void m8842v1() {
        duringCreated(f8832g).subscribe((m250) mkd0.G(new e30() { // from class: l.tsy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7718a.m8801S1((roj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v2 */
    public final void m8843v2(final Uri uri) {
        duringCreated(((C1099c) new w9j() { // from class: l.nsy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return this.f5962a.m8825l2((Uri) obj);
            }
        }.call(uri)).compose(mkd0.Q()).map(new w9j() { // from class: l.osy
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return j760.a(b.b(uri), (File) obj);
            }
        }).compose(mkd0.C())).subscribe((m250) mkd0.G(new e30() { // from class: l.psy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6507a.m8827m2((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w2 */
    public final void m8844w2(List<Media> list) {
        Message message = new Message();
        message.media = new ArrayList(list);
        message.messageType = MessageType.get("picture");
        m6497e0().mo2066l().m4096A6(message);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m8845x1() {
        if (CoreModule.P().i().B()) {
            duringCreated(mkd0.r(CoreModule.c.n3().map(new w9j() { // from class: l.ery
                @Override // p003l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(CoreModule.P().i().ws() > 0);
                }
            }).distinctUntilChanged(), CoreModule.c.f0.Ne(m6497e0().mo2066l().m4295r3()), new x9j() { // from class: l.fry
                @Override // p003l.x9j
                public final Object call(Object obj, Object obj2) {
                    return xsy.m8769h1((Boolean) obj, (Conversation) obj2);
                }
            })).subscribe((m250) mkd0.G(new e30() { // from class: l.gry
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f4000a.m8802T1((Conversation) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: x2 */
    public void m8846x2(int i) {
        this.f8837b = i;
    }

    /* JADX INFO: renamed from: y2 */
    public void m8847y2(int i) {
        ((guy) ((jq2) this).viewModel).m4812c2(i);
    }

    /* JADX INFO: renamed from: z1 */
    public final void m8848z1() {
        if (!m8742D1()) {
            duringCreated(CoreModule.c.f0.Pe(m6497e0().mo2066l().m4295r3())).subscribe((m250) mkd0.G(new e30() { // from class: l.usy
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f8090a.m8805W1((Integer) obj);
                }
            }));
        }
        try {
            JSONObject jSONObject = new JSONObject(RemoteConfig.x().F("live_message_guide_tip_threshold"));
            f8833h = jSONObject.optInt("live_message_guide_tip_threshold_1", 10);
            f8834i = jSONObject.optInt("live_message_guide_tip_threshold_2", 20);
        } catch (Exception unused) {
        }
        duringCreated(CoreModule.c.f0.Pe(m6497e0().mo2066l().m4295r3())).subscribe((m250) mkd0.G(new e30() { // from class: l.vsy
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8404a.m8806X1((Integer) obj);
            }
        }));
    }

    public void destroy() {
    }
}
