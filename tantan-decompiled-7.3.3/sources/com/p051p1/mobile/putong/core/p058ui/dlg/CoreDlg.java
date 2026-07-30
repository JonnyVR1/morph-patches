package com.p051p1.mobile.putong.core.p058ui.dlg;

import android.animation.AnimatorInflater;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.ResultReceiver;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4468a;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.core.data.ReportFrom;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.newui.messages.C8326b;
import com.p051p1.mobile.putong.core.newui.messages.SetNicknameAct;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.dlg.CoreDlg;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.core.p058ui.report.ReportAct;
import com.p051p1.mobile.putong.core.p058ui.settings.PersonalDetailsAct;
import com.p051p1.mobile.putong.core.p058ui.settings.SetTickleAct;
import com.p051p1.mobile.putong.core.p058ui.verification.AgeVerificationDoubleGuideView;
import com.p051p1.mobile.putong.core.p058ui.verification.AgeVerificationSingleGuideView;
import com.p051p1.mobile.putong.core.p058ui.vip.widget.IntlLetterSendPanel;
import com.p051p1.mobile.putong.data.Converter;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.IdBoxed;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.LinkChannel;
import com.p051p1.mobile.putong.data.LinkIntent;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Picture;
import com.p051p1.mobile.putong.data.Report;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserStatus;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.p051p1.mobile.putong.p070ui.download.C13274a;
import com.p051p1.mobile.putong.p070ui.download.DownloadTask;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import com.p051p1.mobile.putong.p070ui.webview.WebViewAct;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.wdullaer.materialdatetimepicker.date.DatePickerDialog;
import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.fourthline.cling.model.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VListCell;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.adc0;
import p153l.agc0;
import p153l.bnl0;
import p153l.bsj0;
import p153l.c9c0;
import p153l.d09;
import p153l.dbc0;
import p153l.e1b;
import p153l.ey6;
import p153l.fhw;
import p153l.fph0;
import p153l.g6e;
import p153l.gra;
import p153l.hve0;
import p153l.i4g0;
import p153l.jl80;
import p153l.jyb;
import p153l.kec0;
import p153l.l4g0;
import p153l.l51;
import p153l.l7y;
import p153l.lu6;
import p153l.lyh0;
import p153l.o1j0;
import p153l.o3z;
import p153l.ovb0;
import p153l.p9r;
import p153l.pcj;
import p153l.pf60;
import p153l.pk50;
import p153l.psd0;
import p153l.q8g0;
import p153l.qa00;
import p153l.qcj;
import p153l.qxv;
import p153l.qxw;
import p153l.qzd;
import p153l.rbb0;
import p153l.rcj;
import p153l.sfj0;
import p153l.th0;
import p153l.u7c0;
import p153l.uqb0;
import p153l.uxj0;
import p153l.vb0;
import p153l.vcc0;
import p153l.vg60;
import p153l.vsb;
import p153l.w1e;
import p153l.w30;
import p153l.wzx;
import p153l.x20;
import p153l.xxv;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes12.dex */
public final class CoreDlg extends g6e {

    public static class ProfileMenuBuildParam implements Serializable {
        public String contentType;
        public String momentId;
        public String profileCommentText;
        public ReportFrom reportFrom;
        public String reportTypeId;

        public ProfileMenuBuildParam setContentType(String str) {
            this.contentType = str;
            return this;
        }

        public ProfileMenuBuildParam setMomentIdText(String str) {
            return this;
        }

        public ProfileMenuBuildParam setProfileCommentText(String str) {
            this.profileCommentText = str;
            return this;
        }

        public ProfileMenuBuildParam setReportFrom(ReportFrom reportFrom) {
            this.reportFrom = reportFrom;
            return this;
        }

        public ProfileMenuBuildParam setReportTypeId(String str) {
            this.reportTypeId = str;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.CoreDlg$a */
    public class C8476a implements C4468a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f29749a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f29750b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ x20 f29751c;

        public C8476a(int i, Act act, x20 x20Var) {
            this.f29749a = i;
            this.f29750b = act;
            this.f29751c = x20Var;
        }

        @Override // com.p051p1.mobile.android.app.C4468a.a
        /* JADX INFO: renamed from: a */
        public boolean mo21400a(int i, int i2, Intent intent) {
            if (i != this.f29749a) {
                return false;
            }
            this.f29750b.unregisterOnActivityResultListener(this);
            if (!NullChecker.m82486a(this.f29751c)) {
                return false;
            }
            this.f29751c.call();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.CoreDlg$b */
    public class ViewOnLayoutChangeListenerC8477b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public boolean f29752a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScrollView f29753b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ IntlLetterSendPanel f29754c;

        public ViewOnLayoutChangeListenerC8477b(ScrollView scrollView, IntlLetterSendPanel intlLetterSendPanel) {
            this.f29753b = scrollView;
            this.f29754c = intlLetterSendPanel;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m46306b(ScrollView scrollView, IntlLetterSendPanel intlLetterSendPanel) {
            scrollView.fullScroll(130);
            if (!this.f29752a) {
                intlLetterSendPanel.f38821e.requestFocus();
            }
            this.f29752a = false;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            final ScrollView scrollView = this.f29753b;
            final IntlLetterSendPanel intlLetterSendPanel = this.f29754c;
            scrollView.post(new Runnable() { // from class: l.xp8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f195693a.m46306b(scrollView, intlLetterSendPanel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m46150A(final String str, final Act act, final x20 x20Var, pf60 pf60Var) {
        User userById = CoreModule.m30932N().getUserById(str);
        if (!CoreModule.m30932N().isMatchedByRelationship(userById) && CoreModule.m30932N().isMatchedByFollowship(userById)) {
            CoreModule.m30932N().following(CoreModule.m30929H().userId(), userById, false, null, null).subscribe(psd0.m173597H(new y20() { // from class: l.yl8
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreDlg.m46272p(act, x20Var, (Followship) obj);
                }
            }, new y20() { // from class: l.zl8
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreDlg.m46251i(act, (Throwable) obj);
                }
            }));
        } else {
            act.progress(R$string.f18632L5, true);
            CoreModule.f18264c.f20384f0.m34093qe(str, act).subscribe(psd0.m173597H(new y20() { // from class: l.am8
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreDlg.m46269o(str, act, x20Var, (uxj0) obj);
                }
            }, new y20() { // from class: l.bm8
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreDlg.m46205S0(act, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m46151A0(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: A1 */
    public static void m46152A1(Menu menu, String str, Act act, x20 x20Var) {
        m46262l1(true, false, menu, str, act, true, null, 10, null);
        m46250h1(act, menu, x20Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m46153B(final y20 y20Var, final String str, final Act act, final x20 x20Var, final String str2, final Conversation conversation, final x20 x20Var2, pf60 pf60Var) {
        final y20 y20Var2 = new y20() { // from class: l.cm8
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreDlg.m46239d1(y20Var, str, act, x20Var, (String) obj);
            }
        };
        ArrayList arrayList = new ArrayList();
        if (((Boolean) pf60Var.f152156a).booleanValue()) {
            arrayList.add(act.string(R$string.f18923Uq));
            arrayList.add(act.string(R$string.f18893Tq));
        } else {
            arrayList.add(act.string(R$string.f18803Qq));
        }
        if (!((Boolean) pf60Var.f152157b).booleanValue()) {
            arrayList.add(act.string(R$string.f18953Vq));
        }
        arrayList.add(act.string(R$string.f18863Sq));
        arrayList.add(act.string(R$string.f18833Rq));
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_unmatch_dialog", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            if (NullChecker.m82486a(str2)) {
                jSONObject.put("unmatch_dialog_show_from", str2);
            }
        } catch (JSONException e) {
            CrashHelper.m82479c(e);
        }
        l4g0VarM204399c.m152780o(jSONObject);
        w30.C21001b c21001b = new w30.C21001b(act);
        c21001b.m204661M(R$string.f18983Wq).m204659K(R$string.f18773Pq);
        c21001b.m204656H(R$string.f19138c).m204669U(new View.OnClickListener() { // from class: l.dm8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w30VarArr[0].m204614b();
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.em8
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                CoreDlg.m46291v0(y20Var2, conversation, str, str2, act, w30VarArr, vListCell, c22660a, i);
            }
        }).m204667S(new DialogInterface.OnCancelListener() { // from class: l.fm8
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                CoreDlg.m46297x0(x20Var2, dialogInterface);
            }
        }).m204668T(new DialogInterface.OnDismissListener() { // from class: l.gm8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m204671W(new DialogInterface.OnShowListener() { // from class: l.hm8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        final w30[] w30VarArr = {w30VarM204654F};
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: B1 */
    public static boolean m46155B1(User user) {
        if (user == null || user.localRelationship == null) {
            return false;
        }
        return user.letter() || user.likedMe() || user.superLikedMe();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m46156C(Set set, VButton vButton, Set set2) {
        set.clear();
        set.addAll(set2);
        vButton.setEnabled(!set.isEmpty());
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ boolean m46157C0(final Act act, String str, final boolean z, final x20 x20Var, ProfileMenuBuildParam profileMenuBuildParam, MenuItem menuItem) {
        act.startActivity(ReportAct.m55812c2(act, str, z, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.ui.dlg.CoreDlg.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (i == -1) {
                    if (!z) {
                        if (NullChecker.m82486a(x20Var)) {
                            x20Var.call();
                        } else {
                            act.setResult(SwipeDirection.LEFT.getValue());
                            act.m68056e2();
                        }
                    }
                    bundle.getString(Reason.TYPE);
                }
            }
        }, profileMenuBuildParam));
        return true;
    }

    /* JADX INFO: renamed from: C1 */
    public static C22421c m46158C1(Act act, String str, String str2, ArrayList<LinkChannel> arrayList) {
        Link link = new Link();
        link.intent = LinkIntent.get("invite");
        link.resources = jyb.m147507f0(new IdBoxed(CoreModule.m30929H().userId(), "user"));
        link.href = "https://thetantanapp.com";
        link.channel = LinkChannel.get("wechat-moments");
        return new ShareHelper(link, str).m81202w0(act, act.getString(R$string.f19556ph), str2, arrayList, true);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m46159D(y20 y20Var, android.app.Dialog dialog, String str) {
        y20Var.call(str);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m46160D0(boolean z, Runnable runnable, Dialog dialog, View view) {
        if (z) {
            fph0.m126630A();
        } else {
            fph0.m126693x();
        }
        runnable.run();
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: D1 */
    public static C22421c m46161D1(Act act, String str, ArrayList<LinkChannel> arrayList) {
        return m46158C1(act, str, act.getString(R$string.f19847yt), arrayList);
    }

    /* JADX INFO: renamed from: E1 */
    public static void m46164E1(Act act, String str, CharSequence charSequence, int i, String str2, x20 x20Var, boolean z, String str3, x20 x20Var2, x20 x20Var3) {
        m46167F1(act, str, charSequence, i, str2, x20Var, z, str3, x20Var2, x20Var3, null, true, false, null, null);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m46165F(x20 x20Var, User user) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        sfj0.m185596c("e_alert_dislike_who_liked_me_like", "p_alert_dislike_who_liked_me_popup", sfj0.C20032a.m185615h("receiver_user_id", user.f56859id));
    }

    /* JADX INFO: renamed from: F1 */
    public static void m46167F1(Act act, String str, CharSequence charSequence, int i, String str2, x20 x20Var, boolean z, String str3, x20 x20Var2, x20 x20Var3, @Nullable User user, boolean z2, boolean z3, String str4, x20 x20Var4) {
        m46170G1(act, str, charSequence, i, str2, x20Var, z, str3, x20Var2, x20Var3, user, z2, z3, str4, x20Var4, false);
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ boolean m46169G0(Act act, String str, MenuItem menuItem) {
        act.startActivity(SetTickleAct.m56213a2(act, str));
        return true;
    }

    /* JADX INFO: renamed from: G1 */
    public static void m46170G1(Act act, String str, CharSequence charSequence, int i, String str2, x20 x20Var, boolean z, String str3, x20 x20Var2, x20 x20Var3, @Nullable User user, boolean z2, boolean z3, String str4, x20 x20Var4, boolean z4) {
        String str5;
        l4g0 l4g0VarM204399c;
        if (TextUtils.isEmpty(str4)) {
            str5 = str4;
            l4g0VarM204399c = null;
        } else {
            str5 = str4;
            l4g0VarM204399c = w1e.m204399c(str5, "pic_verification_dialog");
        }
        m46173H1(act, str, charSequence, i, str2, x20Var, z, str3, x20Var2, x20Var3, user, z2, z3, str5, x20Var4, l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m46171H(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m46172H0(x20 x20Var) {
        i4g0.m138520r("e_user_profile_share_agreement_popup_cancel", "p_user_profile_share_agreement_popup");
        x20Var.call();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX INFO: renamed from: H1 */
    public static void m46173H1(Act act, String str, CharSequence charSequence, int i, String str2, final x20 x20Var, boolean z, String str3, final x20 x20Var2, final x20 x20Var3, @Nullable User user, boolean z2, boolean z3, final String str4, final x20 x20Var4, final l4g0 l4g0Var) {
        boolean z4;
        jl80 jl80VarM146020O;
        int i2;
        jl80.C17971a c17971aM146034c0 = act.newDialog().m146056y0(str).m146051t0(new SpannableStringBuilder(charSequence)).m146024S(i).m146021P(z2).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.wn8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoreDlg.m46255j0(str4, l4g0Var, dialogInterface);
            }
        }).m146034c0(str2, new Runnable() { // from class: l.xn8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m46171H(x20Var);
            }
        });
        if (z) {
            c17971aM146034c0.m146029X(str3, new Runnable() { // from class: l.yn8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreDlg.m46207T(x20Var2);
                }
            });
        }
        if (z) {
            z4 = true;
            if (!z3 ? bnl0.m105588w0() > 900 : bnl0.m105588w0() > 1200) {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        if (NullChecker.m82486a(user)) {
            View viewInflate = act.inflater().inflate(kec0.f126141xe, (ViewGroup) null);
            VImage vImage = (VImage) viewInflate.findViewById(adc0.f70258af);
            user.showPicVerificationIcon(vImage, vImage);
            if (z4) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((FrameLayout) viewInflate.findViewById(adc0.f70087Qa)).getLayoutParams();
                if (z3) {
                    String language = Locale.getDefault().getLanguage();
                    if ("ja".equals(language) || "in".equals(language) || "id".equals(language)) {
                        i2 = 10;
                    } else if ("en".equals(language)) {
                        i2 = 4;
                    } else {
                        i2 = 20;
                    }
                } else {
                    i2 = 20;
                }
                layoutParams.topMargin = qa00.m175859d(i2);
            }
            uqb0.f180374G.m127111J0((VDraweeView) viewInflate.findViewById(adc0.f70070Pa), user.m61308fp().profileMiddle(), false);
            jl80VarM146020O = c17971aM146034c0.m146023R(viewInflate).m146020O();
        } else {
            if (z4 && z3) {
                String language2 = Locale.getDefault().getLanguage();
                if (!"ja".equals(language2) && !"in".equals(language2) && !"id".equals(language2)) {
                    "en".equals(language2);
                }
            }
            jl80VarM146020O = c17971aM146034c0.m146024S(i).m146020O();
        }
        if (NullChecker.m82486a(x20Var3)) {
            jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.zn8
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    CoreDlg.m46229a1(x20Var3, x20Var4, dialogInterface);
                }
            });
        }
        if (!TextUtils.isEmpty(str4)) {
            w1e.m204402f(l4g0Var);
        }
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m46174I(Dialog dialog, x20 x20Var) {
        dialog.dismiss();
        x20Var.call();
    }

    /* JADX INFO: renamed from: I1 */
    public static void m46176I1(final Act act, pcj<Double> pcjVar, final y20<Double> y20Var, final y20<Boolean> y20Var2) {
        Date date = new Date((long) pcjVar.call().doubleValue());
        DatePickerDialog datePickerDialogM86253h4 = DatePickerDialog.m86253h4(new DatePickerDialog.InterfaceC14809d() { // from class: l.go8
            @Override // com.wdullaer.materialdatetimepicker.date.DatePickerDialog.InterfaceC14809d
            /* JADX INFO: renamed from: a */
            public final void mo86280a(DatePickerDialog datePickerDialog, int i, int i2, int i3) {
                CoreDlg.m46195P(y20Var2, y20Var, datePickerDialog, i, i2, i3);
            }
        }, date.getYear() + Constants.UPNP_MULTICAST_PORT, date.getMonth(), date.getDate(), true);
        datePickerDialogM86253h4.m86274o4(true);
        datePickerDialogM86253h4.mo86262L1(new DatePickerDialog.InterfaceC14808c() { // from class: l.ho8
            @Override // com.wdullaer.materialdatetimepicker.date.DatePickerDialog.InterfaceC14808c
            /* JADX INFO: renamed from: a */
            public final void mo86279a() {
                CoreDlg.m46236c1(act);
            }
        });
        datePickerDialogM86253h4.m86271l4(act.string(R$string.f18866T));
        datePickerDialogM86253h4.m86269j4(act.string(R$string.f19138c));
        datePickerDialogM86253h4.show(act.getSupportFragmentManager(), "dpd");
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m46178J0(Act act) {
        CoreModule.f18264c.f20384f0.f20703o0.put(Boolean.TRUE);
        sfj0.m185596c("e_cheat_prevention_guide_click", "p_alert_cheat_prevention__tips_popup", sfj0.C20032a.m185615h("cheat_prevention_from", "tips_popup"));
        sfj0.m185596c("e_alert_cheat_prevention__tips_click", "p_alert_cheat_prevention__tips_popup", sfj0.C20032a.m185615h("no_prompt_again", "yes"));
        act.startActivity(WebViewAct.m81348b2(act, "", "https://live-web.tantanapp.com/anti_fraud_reminder/guide", true));
    }

    /* JADX INFO: renamed from: J1 */
    public static void m46179J1(Menu menu, String str, Act act, boolean z, boolean z2, String str2, x20 x20Var, x20 x20Var2, String str3) {
        m46182K1(menu, str, act, z, z2, str2, x20Var, x20Var2, true, false, str3);
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m46181K0(Act act, uxj0 uxj0Var) {
        act.progressDismiss();
        o1j0.m165651y(lu6.m155846b(R$string.f19871zm, R$string.f19530om));
    }

    /* JADX INFO: renamed from: K1 */
    public static void m46182K1(Menu menu, String str, Act act, boolean z, boolean z2, String str2, x20 x20Var, x20 x20Var2, boolean z3, boolean z4, String str3) {
        m46185L1(menu, str, act, z, z2, str2, x20Var, x20Var2, z3, z4, str3, null);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m46183L(VText vText, C8326b c8326b, vg60 vg60Var) {
        bnl0.m105524M(vText, jyb.m147479J(vg60Var.f184001a));
        c8326b.m43304G(vg60Var.f184001a);
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m46184L0(l4g0 l4g0Var, z20 z20Var, StringBuilder sb, BottomSheetDialog bottomSheetDialog, uxj0 uxj0Var) {
        w1e.m204401e(l4g0Var);
        z20Var.call("success", sb.toString());
        bottomSheetDialog.dismiss();
        CoreModule.f18264c.f20384f0.m33653Fo();
    }

    /* JADX INFO: renamed from: L1 */
    public static void m46185L1(Menu menu, String str, Act act, boolean z, boolean z2, String str2, x20 x20Var, x20 x20Var2, boolean z3, boolean z4, String str3, ProfileMenuBuildParam profileMenuBuildParam) {
        User user;
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        if (userM116503Pa == null) {
            userM116503Pa = CoreModule.m30930K().getUserById(str);
        }
        User user2 = userM116503Pa;
        boolean z5 = (user2 == null || user2.f56859id.equals(CoreModule.m30929H().userId()) || user2.isTeamAccount()) ? false : true;
        if (z5 || z) {
            if (NullChecker.m82486a(user2) && (act instanceof MessagesAct) && !user2.isTeamAccount()) {
                m46265m1(act, menu, str);
            }
            m46259k1(z5, z2, menu, str, act, x20Var, profileMenuBuildParam);
            m46253i1(z, menu, str, act);
            if (z3) {
                user = user2;
                m46274p1(z5, z2, user, act, menu, str, x20Var2, str3);
            } else {
                user = user2;
            }
            if (z4 && NullChecker.m82486a(user) && !user.isTeamAccount()) {
                m46271o1(act, menu, user.f56859id);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m46186M(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m46187M0(Runnable runnable, boolean z) {
        runnable.run();
        if (z) {
            fph0.m126631B();
        } else {
            fph0.m126694y();
        }
    }

    /* JADX INFO: renamed from: M1 */
    public static void m46188M1(Act act, Media media, Message message) {
        final List<pf60<String, Runnable>> listM46191N1 = m46191N1(act, media, message);
        ArrayList arrayList = new ArrayList();
        Iterator<pf60<String, Runnable>> it = listM46191N1.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f152156a);
        }
        w30 w30VarM204654F = new w30.C21001b(act).m204657I(act.getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.hp8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w30VarArr[0].m204614b();
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.ip8
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                CoreDlg.m46254j(listM46191N1, w30VarArr, vListCell, c22660a, i);
            }
        }).m204654F();
        w30VarM204654F.m204618f();
        final w30[] w30VarArr = {w30VarM204654F};
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ boolean m46189N(Act act, String str, x20 x20Var, String str2, MenuItem menuItem) {
        m46292v1(act, str, null, null, x20Var, str2);
        return true;
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m46190N0(boolean z, Runnable runnable) {
        if (z) {
            fph0.m126630A();
        } else {
            fph0.m126693x();
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: N1 */
    public static List<pf60<String, Runnable>> m46191N1(final Act act, final Media media, final Message message) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(jyb.m147494Y(CoreModule.f18263b.getString(R$string.f19693u), new Runnable() { // from class: l.pp8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m46295w1(act, media);
            }
        }));
        if (NullChecker.m82486a(message) && !message.isGroupMessage() && !message.isMe() && !((Boolean) jyb.m147493X(CoreModule.f18264c.f20381e0.m116503Pa(message.owner), new qcj() { // from class: l.qp8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).isTeamAccount());
            }
        }, Boolean.FALSE)).booleanValue()) {
            arrayList.add(jyb.m147494Y(CoreModule.f18263b.getString(media instanceof Video ? R$string.f19435lk : R$string.f19404kk), new Runnable() { // from class: l.rp8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreDlg.m46222Y(act, message);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O1 */
    public static List<ovb0<String, Runnable, Integer, Void>> m46194O1(final Act act, final Media media, final Message message) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(jyb.m147495Z(CoreModule.f18263b.getString(R$string.f19693u), new Runnable() { // from class: l.in8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m46295w1(act, media);
            }
        }, Integer.valueOf(dbc0.f86988ff), null));
        if (NullChecker.m82486a(message) && !message.isGroupMessage() && !message.isMe() && !((Boolean) jyb.m147493X(CoreModule.f18264c.f20381e0.m116503Pa(message.owner), new qcj() { // from class: l.tn8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).isTeamAccount());
            }
        }, Boolean.FALSE)).booleanValue()) {
            boolean z = media instanceof Video;
            arrayList.add(jyb.m147495Z(CoreModule.f18263b.getString(z ? R$string.f19435lk : R$string.f19404kk), new Runnable() { // from class: l.eo8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreDlg.m46248h(act, message);
                }
            }, Integer.valueOf(z ? dbc0.f86955ef : dbc0.f86955ef), null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m46195P(y20 y20Var, y20 y20Var2, DatePickerDialog datePickerDialog, int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = Converter.CALENDAR.get();
        gregorianCalendar.set(i, i2, i3, 0, 0, 0);
        gregorianCalendar.set(14, 0);
        Date time = gregorianCalendar.getTime();
        if (time.compareTo(bsj0.m106264V()) > 0) {
            o1j0.m165634h(R$string.f18295A9);
            if (NullChecker.m82486a(y20Var)) {
                y20Var.call(Boolean.TRUE);
                return;
            }
            return;
        }
        if (time.compareTo(bsj0.m106256N()) >= 0) {
            y20Var2.call(Double.valueOf(time.getTime()));
            return;
        }
        o1j0.m165634h(R$string.f19858z9);
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m46196P0(DownloadTask downloadTask, Throwable th) {
        o1j0.m165634h(R$string.f19543p4);
        CrashHelper.m82480d(new Exception("downloadMedia Fail exception:" + th.getMessage(), th), 50);
    }

    /* JADX INFO: renamed from: P1 */
    public static BottomSheetDialog m46197P1(Act act, final String str, String str2, String str3, int i, String str4, String str5, final String str6, List<String> list, String str7, final z20<String, String> z20Var) {
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_friends_list", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("share_source", str7));
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(act);
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125684Wb, (ViewGroup) null);
        bottomSheetDialog.setContentView(viewInflate);
        Window window = bottomSheetDialog.getWindow();
        if (NullChecker.m82486a(window)) {
            window.findViewById(vcc0.f183363E).setBackgroundResource(c9c0.f80383V1);
        }
        VText vText = (VText) viewInflate.findViewById(adc0.f70409je);
        VText vText2 = (VText) viewInflate.findViewById(adc0.f70273bd);
        final VButton vButton = (VButton) viewInflate.findViewById(adc0.f69890F0);
        final VText vText3 = (VText) viewInflate.findViewById(adc0.f70636x3);
        vText.setText(str2);
        if (TextUtils.isEmpty(str3)) {
            bnl0.m105524M(vText2, false);
        } else {
            vText2.setText(str3);
        }
        vButton.setEnabled(false);
        vButton.setText(str4);
        VRecyclerView vRecyclerView = (VRecyclerView) viewInflate.findViewById(adc0.f69860D4);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(act, 1, false));
        final C8326b c8326b = new C8326b(act, i, str5);
        final HashSet hashSet = new HashSet();
        c8326b.m43305H(new C8326b.a() { // from class: l.jn8
            @Override // com.p051p1.mobile.putong.core.newui.messages.C8326b.a
            /* JADX INFO: renamed from: a */
            public final void mo43306a(Set set) {
                CoreDlg.m46156C(hashSet, vButton, set);
            }
        });
        vRecyclerView.setAdapter(c8326b);
        act.duringCreated(CoreModule.f18264c.f20384f0.m34089pn(arrayList)).subscribe(psd0.m173596G(new y20() { // from class: l.kn8
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreDlg.m46183L(vText3, c8326b, (vg60) obj);
            }
        }));
        w1e.m204402f(l4g0VarM204399c);
        bottomSheetDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ln8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        bottomSheetDialog.getBehavior().setState(3);
        bottomSheetDialog.getBehavior().setSkipCollapsed(true);
        bottomSheetDialog.show();
        bnl0.m105509E0(vButton, new View.OnClickListener() { // from class: l.mn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m46226Z0(hashSet, str, str6, l4g0VarM204399c, z20Var, bottomSheetDialog, view);
            }
        });
        return bottomSheetDialog;
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ boolean m46199Q0(Act act, String str, MenuItem menuItem) {
        m46286t1(act, str, null, null);
        return true;
    }

    /* JADX INFO: renamed from: Q1 */
    public static void m46200Q1(Act act, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, z20<String, String> z20Var) {
        m46197P1(act, str, str2, str3, i, str4, str5, str6, new ArrayList(), str7, z20Var);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m46201R(String str, Act act, x20 x20Var, uxj0 uxj0Var) {
        CoreModule.m30932N().updateUserOnBlock(str);
        act.progressDismiss();
        CoreModule.f18264c.f20381e0.f89054J1.m137019l(str);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        List<String> listMo173497d = CoreModule.m30932N().coreMomentMutedUsers().mo173497d();
        if (listMo173497d == null) {
            listMo173497d = new ArrayList<>();
        }
        CoreModule.m30932N().coreMomentMutedUsers().mo173498e(jyb.m147501c0(listMo173497d, str));
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m46202R0(jl80 jl80Var, View view) {
        sfj0.m185596c("e_alert_cheat_prevention__risk_alarm_click", "p_alert_cheat_prevention__risk_alarm_popup", new sfj0.C20032a[0]);
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: R1 */
    public static void m46203R1(Act act, String str, String str2, String str3, int i, String str4, String str5, String str6, z20<String, String> z20Var) {
        m46197P1(act, str, str2, str3, i, str4, str5, str6, new ArrayList(), "", z20Var);
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m46205S0(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: S1 */
    public static void m46206S1(final Act act, boolean z) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_alert_cheat_prevention__risk_alarm_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(pk50.m172568j().m172574f().m181658V(OmsDialog.alert_cheat_risk_alarm_popup.getIdentifier(), pf60.m172085a("tooltips_trigger_mode", z ? Active.TYPE : "passive"), pf60.m172085a("tooltips_type_ui", "alert_self_definition_basic"), pf60.m172085a("tooltips_trigger_page", "swipe_page"), pf60.m172085a("tooltips_trigger_module", "null"), pf60.m172085a("tooltips_trigger_reason", "cheat_prevention")));
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125588Qb, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(adc0.f70273bd);
        VButton vButton = (VButton) viewInflate.findViewById(adc0.f70677za);
        final VButton vButton2 = (VButton) viewInflate.findViewById(adc0.f70291ce);
        vText.setText(q8g0.m175796b0("你的好友中有疑似境外诈骗团伙，TA已被探探封禁并从你的好友列表中移除！请尽快搜索了解“杀猪盘”欺诈信息，不要参与任何赌博，竞猜，彩票，虚拟货币等项目，如有任何异常，请及时在“设置页”“帮助与反馈”中举报", jyb.m147482M("已被探探封禁并从你的好友列表中移除"), act.getResources().getColor(c9c0.f80342I), lyh0.m156283c(2)));
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(viewInflate).m146021P(false).m146018M(false).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.lm8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146020O();
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.nm8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m46279r0(act, view);
            }
        });
        vButton2.setText("10s");
        vButton2.setEnabled(false);
        vButton2.setStateListAnimator(AnimatorInflater.loadStateListAnimator(CoreModule.f18263b, u7c0.f177899e));
        act.duringCreated((C22421c) l51.m152894N(act.getLocalClassName(), 10), false).subscribe(psd0.m173596G(new y20() { // from class: l.om8
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreDlg.m46233b1(vButton2, act, jl80VarM146020O, (Long) obj);
            }
        }));
        jl80VarM146020O.show();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m46207T(x20 x20Var) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: T1 */
    public static void m46209T1(final Act act) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_alert_cheat_prevention__tips_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(pk50.m172568j().m172574f().m181658V(OmsDialog.alert_cheat_tips_popup.getIdentifier(), pf60.m172085a("tooltips_trigger_mode", Active.TYPE), pf60.m172085a("tooltips_type_ui", "alert_self_definition_basic"), pf60.m172085a("tooltips_trigger_page", "message_list_page"), pf60.m172085a("tooltips_trigger_module", "null"), pf60.m172085a("tooltips_trigger_reason", "cheat_prevention")));
        View viewInflate = p9r.m171370a(act).inflate(kec0.f125588Qb, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(adc0.f70409je);
        VText vText2 = (VText) viewInflate.findViewById(adc0.f70273bd);
        VButton vButton = (VButton) viewInflate.findViewById(adc0.f70677za);
        VButton vButton2 = (VButton) viewInflate.findViewById(adc0.f70291ce);
        bnl0.m105524M(vButton, false);
        bnl0.m105524M(vButton2, false);
        vText.setText("温馨提示");
        vText2.setText(q8g0.m175796b0("系统检测到你的好友列表中有企图诈骗用户，TA已被探探封禁并从你的好友列表中移除！聊天过程中如果涉及任何资金往来，请注意提高警惕", jyb.m147507f0("企图诈骗用户", "涉及任何资金往来"), act.getResources().getColor(c9c0.f80342I), lyh0.m156283c(2)));
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(viewInflate).m146033b0("了解更多防骗技巧").m146028W("知道啦").m146021P(false).m146018M(false).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.bn8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146020O();
        jl80VarM146020O.m145975W(new Runnable() { // from class: l.cn8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m46178J0(act);
            }
        });
        jl80VarM146020O.m145974V(new Runnable() { // from class: l.dn8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m46247g1(jl80VarM146020O);
            }
        });
        jl80VarM146020O.show();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m46210U(l4g0 l4g0Var, DialogInterface dialogInterface) {
        pk50.m172568j().m172574f().m181664b0(OmsDialog.p_user_passive_show_chat.getIdentifier(), 0, false);
        w1e.m204402f(l4g0Var);
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m46211U0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: U1 */
    public static void m46212U1(final Act act, User user, final y20<String> y20Var, final x20 x20Var) {
        final android.app.Dialog dialog = new android.app.Dialog(act, agc0.f71140z);
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_choose_letter_or_superlike", dialog.getClass().getName());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        ScrollView scrollView = (ScrollView) act.inflater().inflate(kec0.f125430Gd, (ViewGroup) null, false);
        IntlLetterSendPanel intlLetterSendPanel = (IntlLetterSendPanel) scrollView.findViewById(adc0.f70151U6);
        intlLetterSendPanel.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC8477b(scrollView, intlLetterSendPanel));
        if (NullChecker.m82486a(y20Var)) {
            intlLetterSendPanel.setSendClickCallBack(new y20() { // from class: l.ao8
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreDlg.m46159D(y20Var, dialog, (String) obj);
                }
            });
        }
        if (NullChecker.m82486a(x20Var)) {
            intlLetterSendPanel.setSuperLikeClickCallBack(new x20() { // from class: l.bo8
                @Override // p153l.x20
                public final void call() {
                    CoreDlg.m46263m(x20Var, dialog);
                }
            });
        }
        intlLetterSendPanel.setCloseCallBack(new vsb(dialog));
        dialog.setContentView(scrollView);
        ViewGroup.LayoutParams layoutParams = intlLetterSendPanel.getLayoutParams();
        layoutParams.width = act.getResources().getDisplayMetrics().widthPixels;
        intlLetterSendPanel.setLayoutParams(layoutParams);
        dialog.getWindow().setGravity(80);
        dialog.getWindow().setWindowAnimations(agc0.f71107A);
        intlLetterSendPanel.setLetterWrapperLibraries(CoreModule.f18265d.m217942B(user.gender, q8g0.m175820y()));
        intlLetterSendPanel.m58893t(user, new x20() { // from class: l.co8
            @Override // p153l.x20
            public final void call() {
                ((InputMethodManager) act.getSystemService("input_method")).toggleSoftInput(0, 2);
            }
        });
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.do8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ((InputMethodManager) act.getSystemService("input_method")).toggleSoftInput(0, 2);
            }
        });
        dialog.getWindow().setSoftInputMode(16);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fo8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        });
        dialog.show();
        w1e.m204402f(l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: V1 */
    public static void m46215V1(Act act, User user, final x20 x20Var, final x20 x20Var2) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_suggest_live_room_pop", Dialog.class.getName());
        uqb0.f180374G.m127125Q0((VDraweeView) new jl80.C17971a(act).m146022Q(kec0.f125513M0).m146021P(false).m146018M(true).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.nn8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146046o0(new DialogInterface.OnShowListener() { // from class: l.on8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                w1e.m204402f(l4g0VarM204399c);
            }
        }).m146034c0(act.getString(R$string.f19680th), new Runnable() { // from class: l.pn8
            @Override // java.lang.Runnable
            public final void run() {
                x20Var.call();
            }
        }).m146029X(act.getString(R$string.f19773wh), new Runnable() { // from class: l.qn8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m46219X(x20Var2);
            }
        }).m146049r0().m145966L().findViewById(adc0.f70042O), user.m61308fp().profileSmall());
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m46217W0(Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: W1 */
    public static void m46218W1(final Act act, String str) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_user_passive_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(pk50.m172568j().m172574f().m181658V(OmsDialog.p_user_passive_show_chat.getIdentifier(), pf60.m172085a("userpassive_showfrom", "chat"), pf60.m172085a("userpassive_word", str)));
        final View viewInflate = act.getLayoutInflater().inflate(kec0.f125891j2, (ViewGroup) null);
        final jl80 jl80VarM146020O = act.newDialog().m146023R(viewInflate).m146021P(false).m146046o0(new DialogInterface.OnShowListener() { // from class: l.to8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CoreDlg.m46210U(l4g0VarM204399c, dialogInterface);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.uo8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146020O();
        viewInflate.findViewById(adc0.f70401j6).setOnClickListener(new View.OnClickListener() { // from class: l.vo8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m46264m0(jl80VarM146020O, view);
            }
        });
        viewInflate.findViewById(adc0.f69870De).setOnClickListener(new View.OnClickListener() { // from class: l.wo8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m46296x(jl80VarM146020O, view);
            }
        });
        viewInflate.findViewById(adc0.f69972Je).setOnClickListener(new View.OnClickListener() { // from class: l.xo8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m46244f0(viewInflate, act, jl80VarM146020O, view);
            }
        });
        jl80VarM146020O.show();
        act.lifecycle().filter(new qcj() { // from class: l.yo8
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16268j);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.zo8
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreDlg.m46249h0(jl80VarM146020O, (C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m46219X(x20 x20Var) {
        i4g0.m138520r("e_suggest_live_room_card_popup_no", "p_suggest_live_room_pop");
        x20Var.call();
    }

    /* JADX INFO: renamed from: X1 */
    public static void m46221X1(Act act, boolean z) {
        m46224Y1(act, z, null);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m46222Y(final Act act, Message message) {
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = "";
        act.progress(R$string.f18632L5, true);
        CoreModule.f18264c.f20384f0.m34104qp(message.owner, message.f56859id, report).subscribe(psd0.m173597H(new y20() { // from class: l.up8
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreDlg.m46267n0(act, (uxj0) obj);
            }
        }, new y20() { // from class: l.vp8
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreDlg.m46151A0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m46223Y0(x20 x20Var, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static void m46224Y1(final Act act, boolean z, final x20 x20Var) {
        new th0.C20312a(act).m191148g(z).m191160s(act.getString(R$string.f19510o2)).m191159r(act.getString(R$string.f19621rk)).m191146e(R$string.f19138c).m191151j(String.format("%s\n%s\n%s", act.getString(R$string.f19479n2), act.getString(R$string.f19541p2), act.getString(R$string.f19448m2))).m191152k(8388611).m191156o(new View.OnClickListener() { // from class: l.fn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m46258k0(act, x20Var, view);
            }
        }).m191142a().m191141g();
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m46225Z(x20 x20Var, Act act) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        act.m68056e2();
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ void m46226Z0(Set set, String str, String str2, final l4g0 l4g0Var, final z20 z20Var, final BottomSheetDialog bottomSheetDialog, View view) {
        sfj0.m185596c("e_friends_share", "p_friends_list", sfj0.C20032a.m185613f("share_friends_nums", set.size()));
        final StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(',');
        }
        if (sb.toString().endsWith(com.clevertap.android.sdk.Constants.SEPARATOR_COMMA)) {
            sb.deleteCharAt(sb.length() - 1);
        }
        ArrayList arrayList = new ArrayList(set);
        if (TextUtils.equals(str, "sendMsg")) {
            try {
                CoreModule.f18264c.f20384f0.m33678Ho(qzd.m178768a(), arrayList, Message.JSON_ADAPTER.parse(URLDecoder.decode(str2, "UTF-8"))).subscribe(psd0.m173597H(new y20() { // from class: l.fp8
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreDlg.m46184L0(l4g0Var, z20Var, sb, bottomSheetDialog, (uxj0) obj);
                    }
                }, new y20() { // from class: l.gp8
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreDlg.m46282s0(z20Var, sb, (Throwable) obj);
                    }
                }));
                return;
            } catch (IOException e) {
                CrashHelper.m82479c(e);
                return;
            }
        }
        if (TextUtils.equals(str, "selectFriends")) {
            w1e.m204401e(l4g0Var);
            z20Var.call("success", sb.toString());
            bottomSheetDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public static void m46227Z1(Act act, final x20 x20Var, String str) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_age_verify_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("age_verify_show_from", str), jyb.m147494Y("tooltips_trigger_mode", Active.TYPE));
        w1e.m204402f(l4g0VarM204399c);
        View viewInflate = act.inflater().inflate(kec0.f125902jd, (ViewGroup) null, false);
        final jl80 jl80VarM146020O = act.newDialog().m146023R(viewInflate).m146021P(true).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.ym8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146020O();
        ((AgeVerificationSingleGuideView) viewInflate).m57161T(Boolean.valueOf(vb0.m200642d()), new x20() { // from class: l.zm8
            @Override // p153l.x20
            public final void call() {
                CoreDlg.m46260l(x20Var, jl80VarM146020O);
            }
        }, new x20() { // from class: l.an8
            @Override // p153l.x20
            public final void call() {
                jl80VarM146020O.dismiss();
            }
        });
        jl80VarM146020O.show();
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m46229a1(x20 x20Var, x20 x20Var2, DialogInterface dialogInterface) {
        x20Var.call();
        if (NullChecker.m82486a(x20Var2)) {
            x20Var2.call();
        }
    }

    /* JADX INFO: renamed from: a2 */
    public static void m46230a2(Act act, Runnable runnable) {
        Dialog.C4460e c4460e = new Dialog.C4460e(act);
        int iColor = act.color(c9c0.f80345J);
        c4460e.m21544o(iColor).m21545o0(iColor).m21513K(14.0f).m21502E0(R$string.f18368Ck).m21508H0(act.color(c9c0.f80324C)).m21503F(rbb0.m180735g() - uqb0.f180376H.guessedCurrentServerTime() >= 0 ? act.string(R$string.f18337Bk) : "开启此功能会导致“查看谁喜欢我“列表内不会再有新的喜欢你的用户，如果后续再购买“查看谁喜欢我“将默认重新关闭").m21505G(act.color(c9c0.f80327D)).m21553s0(R$string.f18780Q3).m21541l0(R$string.f18656M, runnable).m21567z0();
    }

    /* JADX INFO: renamed from: b */
    public static void m46231b(Act act, final String str) {
        act.dialog().m21534e0(jyb.m147507f0(act.getString(R$string.f19323i))).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.xm8
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                l51.m152911q(str);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m46232b0(Act act, String str, x20 x20Var, Followship followship) {
        act.progressDismiss();
        CoreModule.f18264c.f20381e0.f89054J1.m137019l(str);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m46233b1(VButton vButton, Act act, final jl80 jl80Var, Long l2) {
        if (l2.longValue() < 9) {
            vButton.setText(String.format("%ds", Long.valueOf(9 - l2.longValue())));
            return;
        }
        vButton.setText("知道了");
        vButton.setTextColor(act.res.getColor(c9c0.f80327D));
        vButton.setEnabled(true);
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.so8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m46202R0(jl80Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: b2 */
    public static void m46234b2(final PutongAct putongAct) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_age_verify_photo_upload_type_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(jyb.m147494Y("tooltips_trigger_mode", Active.TYPE));
        w1e.m204402f(l4g0VarM204399c);
        final String strString = putongAct.string(R$string.f18347C);
        final String strString2 = putongAct.string(R$string.f18378D);
        putongAct.dialog().m21534e0(jyb.m147507f0(strString, strString2)).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.gn8
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                CoreDlg.m46300y0(strString, putongAct, strString2, dialog, view, i, charSequence);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.hn8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m46235c0(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ void m46236c1(Act act) {
        if (NullChecker.m82486a(act) && (act instanceof PersonalDetailsAct)) {
            i4g0.m138520r("e_edit_basic_info_calendar", "p_edit_basic_info_view");
        }
    }

    /* JADX INFO: renamed from: c2 */
    public static jl80 m46237c2(Act act, final x20 x20Var, final x20 x20Var2) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_user_profile_share_agreement_popup", Dialog.class.getName());
        w1e.m204402f(l4g0VarM204399c);
        return new jl80.C17971a(act).m146056y0("分享新功能").m146051t0("进入ta人主页可分享名片给你的朋友，使用截图有更多惊喜！默认为您打开了分享功能的使用权，若您不想被他人分享，可前往设置-隐私和通知进行关闭。").m146034c0("我知道了", new Runnable() { // from class: l.oo8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m46294w0(x20Var);
            }
        }).m146029X("后续了解", new Runnable() { // from class: l.qo8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m46172H0(x20Var2);
            }
        }).m146021P(false).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.ro8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146049r0();
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m46238d0(uxj0 uxj0Var) {
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m46239d1(y20 y20Var, final String str, final Act act, final x20 x20Var, String str2) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(str2);
        }
        User userById = CoreModule.m30932N().getUserById(str);
        if (!CoreModule.m30932N().isMatchedByRelationship(userById) && CoreModule.m30932N().isMatchedByFollowship(userById) && !m46155B1(userById)) {
            CoreModule.m30932N().following(CoreModule.m30929H().userId(), userById, false, null, null).subscribe(psd0.m173597H(new y20() { // from class: l.rn8
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreDlg.m46232b0(act, str, x20Var, (Followship) obj);
                }
            }, new y20() { // from class: l.sn8
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreDlg.m46252i0(act, (Throwable) obj);
                }
            }));
        } else {
            act.progress(R$string.f18632L5, true);
            CoreModule.f18264c.f20384f0.m34093qe(str, act).subscribe(psd0.m173597H(new y20() { // from class: l.un8
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreDlg.m46201R(str, act, x20Var, (uxj0) obj);
                }
            }, new y20() { // from class: l.vn8
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreDlg.m46261l0(act, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d2 */
    public static void m46240d2(final User user, Act act, final x20 x20Var, final x20 x20Var2) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_alert_dislike_who_liked_me_popup", "showSpecialLikeRetailDlg");
        l4g0VarM204399c.m152780o(pk50.m172568j().m172574f().m181657U(OmsDialog.p_alert_dislike_who_liked_me_popup.getIdentifier(), sfj0.m185595b(sfj0.C20032a.m185615h("tooltips_trigger_mode", Active.TYPE), sfj0.C20032a.m185615h("tooltips_type", "alert"), sfj0.C20032a.m185615h("tooltips_type_ui", "alert_self_definition_basic"), sfj0.C20032a.m185615h("tooltips_trigger_reason", "swipe"), sfj0.C20032a.m185615h("tooltips_trigger_page", "swipe_page"), sfj0.C20032a.m185615h("tooltips_trigger_module", "card"), sfj0.C20032a.m185615h("receiver_user_id", user.f56859id))));
        w1e.m204402f(l4g0VarM204399c);
        View viewInflate = act.inflater().inflate(kec0.f125749ac, (ViewGroup) null);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(adc0.f70121Sa);
        VDraweeView vDraweeView2 = (VDraweeView) viewInflate.findViewById(adc0.f70138Ta);
        uqb0.f180374G.m127125Q0(vDraweeView, CoreModule.f18264c.f20381e0.m116600p9().m61308fp().profileSmall());
        uqb0.f180374G.m127125Q0(vDraweeView2, user.m61308fp().profileSmall());
        ((TextView) viewInflate.findViewById(adc0.f70201X6)).setText(user.isFemale() ? String.format("%s\n%s", act.getString(R$string.f18652Lp), act.getString(R$string.f18682Mp)) : String.format("%s\n%s", act.getString(R$string.f18712Np), act.getString(R$string.f18742Op)));
        new jl80.C17971a(act).m146023R(viewInflate).m146021P(false).m146032a0(user.isFemale() ? R$string.f18832Rp : R$string.f18862Sp, new Runnable() { // from class: l.pm8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m46165F(x20Var, user);
            }
        }).m146026U(user.isFemale() ? R$string.f18772Pp : R$string.f18802Qp, new Runnable() { // from class: l.qm8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m46242e1(x20Var2, user);
            }
        }).m146045n0(new DialogInterface.OnDismissListener() { // from class: l.rm8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m146049r0();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m46241e0(x20 x20Var, final Act act, final String str, w30[] w30VarArr, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        act.progress(R$string.f18632L5, true);
        CoreModule.f18264c.f20384f0.m34191xn(str).subscribe(psd0.m173598I(new y20() { // from class: l.jp8
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreDlg.m46238d0((uxj0) obj);
            }
        }, new y20() { // from class: l.kp8
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreDlg.m46186M(act, (Throwable) obj);
            }
        }, new x20() { // from class: l.mp8
            @Override // p153l.x20
            public final void call() {
                CoreDlg.m46285t0(str, act);
            }
        }));
        w30VarArr[0].m204614b();
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m46242e1(x20 x20Var, User user) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        sfj0.m185596c("e_alert_dislike_who_liked_me_dislike", "p_alert_dislike_who_liked_me_popup", sfj0.C20032a.m185615h("receiver_user_id", user.f56859id));
    }

    /* JADX INFO: renamed from: e2 */
    public static void m46243e2(Act act, final x20 x20Var, boolean z) {
        final l4g0 l4g0VarM204399c = w1e.m204399c("p_unlock_message_popup", Dialog.class.getName());
        l4g0VarM204399c.m152780o(sfj0.m185595b(sfj0.C20032a.m185615h("unlock_message_step", z ? "vipMembership" : "ageCheck"), sfj0.C20032a.m185615h("tooltips_trigger_mode", Active.TYPE)));
        w1e.m204402f(l4g0VarM204399c);
        sfj0.m185596c("e_unlock_message", "p_unlock_message_popup", sfj0.C20032a.m185615h("unlock_message_step", z ? "vipMembership" : "ageCheck"));
        View viewInflate = act.inflater().inflate(kec0.f125886id, (ViewGroup) null, false);
        final Dialog dialogM21566z = act.dialog().m21519P(viewInflate, true).m21495B(true).m21556u().m21525V(new DialogInterface.OnDismissListener() { // from class: l.cp8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0VarM204399c);
            }
        }).m21566z();
        ((AgeVerificationDoubleGuideView) viewInflate).m57156S(new x20() { // from class: l.dp8
            @Override // p153l.x20
            public final void call() {
                CoreDlg.m46174I(dialogM21566z, x20Var);
            }
        }, new x20() { // from class: l.ep8
            @Override // p153l.x20
            public final void call() {
                dialogM21566z.dismiss();
            }
        });
        dialogM21566z.show();
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m46244f0(View view, Act act, jl80 jl80Var, View view2) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + ((TextView) view.findViewById(adc0.f69972Je)).getText().toString()));
        act.startActivity(intent);
        jl80Var.dismiss();
        sfj0.m185596c("e_user_passive_popup_number", "p_user_passive_popup", new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m46246g0(DownloadTask downloadTask, StringBuilder sb) {
        CoreModule.f18263b.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.m80804v())));
        o1j0.m165636j(CoreModule.f18263b.getString(R$string.f18810R3, sb.toString()));
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m46247g1(jl80 jl80Var) {
        sfj0.m185596c("e_alert_cheat_prevention__tips_click", "p_alert_cheat_prevention__tips_popup", sfj0.C20032a.m185615h("no_prompt_again", "no"));
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m46248h(final Act act, Message message) {
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = "";
        act.progress(R$string.f18632L5, true);
        CoreModule.f18264c.f20384f0.m34104qp(message.owner, message.f56859id, report).subscribe(psd0.m173597H(new y20() { // from class: l.im8
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreDlg.m46181K0(act, (uxj0) obj);
            }
        }, new y20() { // from class: l.jm8
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreDlg.m46235c0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m46249h0(jl80 jl80Var, C4470c c4470c) {
        if (jl80Var == null || !jl80Var.isShowing()) {
            return;
        }
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: h1 */
    public static void m46250h1(Act act, Menu menu, final x20 x20Var) {
        menu.add(0, 6, 30, act.string(R$string.f19138c)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.en8
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return CoreDlg.m46270o0(x20Var, menuItem);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m46251i(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m46252i0(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: i1 */
    public static void m46253i1(boolean z, Menu menu, String str, Act act) {
        m46256j1(z, menu, str, act, 15);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m46254j(List list, w30[] w30VarArr, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        ((Runnable) ((pf60) list.get(i)).f152157b).run();
        w30VarArr[0].m204614b();
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m46255j0(String str, l4g0 l4g0Var, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        w1e.m204401e(l4g0Var);
    }

    /* JADX INFO: renamed from: j1 */
    public static void m46256j1(boolean z, Menu menu, final String str, final Act act, int i) {
        if (z) {
            menu.add(0, 2, i, R$string.f19373jk).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.xl8
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return CoreDlg.m46199Q0(act, str, menuItem);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m46258k0(Act act, x20 x20Var, View view) {
        fhw.m125605a("checkPermissionDlg", "click to setting");
        if (qxv.m178618c()) {
            if (!xxv.m213588o()) {
                act.registerOnActivityResultListener(new C8476a(1010, act, x20Var));
                act.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1010);
                return;
            } else if (NullChecker.m82486a(x20Var)) {
                x20Var.call();
            }
        } else if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        try {
            hve0.m137322x(act);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public static void m46259k1(boolean z, boolean z2, Menu menu, String str, Act act, x20 x20Var, ProfileMenuBuildParam profileMenuBuildParam) {
        m46262l1(z, z2, menu, str, act, false, x20Var, 10, profileMenuBuildParam);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m46260l(x20 x20Var, jl80 jl80Var) {
        i4g0.m138520r("e_age_verify_operate", "p_age_verify_popup");
        if (vb0.m200642d()) {
            o1j0.m165649w(R$string.f18564J);
        } else {
            x20Var.call();
        }
        jl80Var.dismiss();
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m46261l0(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: l1 */
    public static void m46262l1(boolean z, final boolean z2, Menu menu, final String str, final Act act, boolean z3, final x20 x20Var, int i, final ProfileMenuBuildParam profileMenuBuildParam) {
        if ((z3 || z2) && z) {
            menu.add(0, 1, i, m46304z1(act, false, R$string.f19600r, 0)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.km8
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return CoreDlg.m46157C0(act, str, z2, x20Var, profileMenuBuildParam, menuItem);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m46263m(x20 x20Var, android.app.Dialog dialog) {
        x20Var.call();
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m46264m0(jl80 jl80Var, View view) {
        jl80Var.dismiss();
        sfj0.m185596c("e_user_passive_popup_cancel", "p_user_passive_popup", new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: m1 */
    public static void m46265m1(Act act, Menu menu, String str) {
        m46268n1(act, menu, str, 5);
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m46267n0(Act act, uxj0 uxj0Var) {
        act.progressDismiss();
        o1j0.m165651y(lu6.m155846b(R$string.f19871zm, R$string.f19530om));
    }

    /* JADX INFO: renamed from: n1 */
    public static void m46268n1(final Act act, Menu menu, final String str, int i) {
        menu.add(0, 0, i, e1b.m118961S0(act, act.string(R$string.f18391Dc))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.wp8
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return CoreDlg.m46273p0(act, str, menuItem);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m46269o(String str, Act act, x20 x20Var, uxj0 uxj0Var) {
        CoreModule.m30932N().updateUserOnBlock(str);
        act.progressDismiss();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        List<String> listMo173497d = CoreModule.m30932N().coreMomentMutedUsers().mo173497d();
        if (listMo173497d == null) {
            listMo173497d = new ArrayList<>();
        }
        CoreModule.m30932N().coreMomentMutedUsers().mo173498e(jyb.m147501c0(listMo173497d, str));
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ boolean m46270o0(x20 x20Var, MenuItem menuItem) {
        x20Var.call();
        return true;
    }

    /* JADX INFO: renamed from: o1 */
    public static void m46271o1(final Act act, Menu menu, final String str) {
        menu.add(0, 4, 4, R$string.f18504H1).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.po8
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return CoreDlg.m46169G0(act, str, menuItem);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m46272p(Act act, x20 x20Var, Followship followship) {
        act.progressDismiss();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ boolean m46273p0(Act act, String str, MenuItem menuItem) {
        i4g0.m138520r("e_message_page_set_nickname", OMSDialogPositon.p_chat_view);
        if (CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
            act.startActivity(SetNicknameAct.m42817Z1(act, str));
            return true;
        }
        C8927c.m54586J1(act, "p_chat_view,e_message_page_set_nickname,click", Privilege.vip_membership_remark_gp);
        return true;
    }

    /* JADX INFO: renamed from: p1 */
    public static void m46274p1(boolean z, boolean z2, User user, Act act, Menu menu, String str, x20 x20Var, String str2) {
        m46277q1(z, z2, user, act, menu, str, x20Var, str2, 20);
    }

    /* JADX INFO: renamed from: q1 */
    public static void m46277q1(boolean z, boolean z2, User user, final Act act, Menu menu, final String str, final x20 x20Var, final String str2, int i) {
        if (z && z2) {
            CoreModule.m30932N().isMatchedByRelationship(user);
            if (user != null) {
                user.unilateralBlock();
            }
            if (!TextUtils.isEmpty(str) && NullChecker.m82486a(CoreModule.f18264c)) {
                CoreModule.f18264c.f20384f0.m33859Xe(str);
            }
            menu.add(0, 3, i, act.getString(R$string.f19466mk)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.mm8
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return CoreDlg.m46189N(act, str, x20Var, str2, menuItem);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m46279r0(Act act, View view) {
        sfj0.m185596c("e_cheat_prevention_guide_click", "p_alert_cheat_prevention__risk_alarm_popup", sfj0.C20032a.m185615h("cheat_prevention_from", "risk_alarm_popup"));
        act.startActivity(WebViewAct.m81348b2(act, "", "https://live-web.tantanapp.com/anti_fraud_reminder/guide", true));
    }

    /* JADX INFO: renamed from: r1 */
    public static void m46280r1(Act act) {
        pk50.m172568j().m172574f().m181681s0(act, OmsDialog.p_verification_canceled_profile_avatar_popup.getIdentifier());
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m46282s0(z20 z20Var, StringBuilder sb, Throwable th) {
        z20Var.call("failed", sb.toString());
        ey6.m123174b(th);
    }

    /* JADX INFO: renamed from: s1 */
    public static void m46283s1(final Act act, final String str, final x20 x20Var, final x20 x20Var2) {
        User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str);
        String str2 = userM116503Pa == null ? "" : userM116503Pa.name;
        String strM116634y7 = CoreModule.f18264c.f20381e0.m116634y7(userM116503Pa.f56859id);
        if (!TextUtils.isEmpty(strM116634y7)) {
            str2 = strM116634y7;
        } else if (gra.m131750t1() && TextUtils.isEmpty(strM116634y7) && (!NullChecker.m82486a(userM116503Pa) || userM116503Pa.inactivated || userM116503Pa.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN)))) {
            str2 = "ta";
        }
        act.dialog().m21503F(String.format("是否要解除和%s的配对？", str2)).m21495B(false).m21559v0("解除", new Runnable() { // from class: l.np8
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                String str3 = str;
                act2.duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m33730Mg(str3), CoreModule.f18264c.f20384f0.m33682Ig(str3), new rcj() { // from class: l.sp8
                    @Override // p153l.rcj
                    public final Object call(Object obj, Object obj2) {
                        return jyb.m147494Y((Boolean) obj, (Boolean) obj2);
                    }
                }).first()).subscribe(psd0.m173596G(new y20() { // from class: l.tp8
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        CoreDlg.m46150A(str3, act2, x20Var, (pf60) obj);
                    }
                }));
            }
        }).m21541l0(R$string.f19138c, new Runnable() { // from class: l.op8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m46225Z(x20Var2, act);
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m46285t0(String str, Act act) {
        if (o3z.m165898g().m165901e(str)) {
            CoreModule.f18264c.f20384f0.m33653Fo();
        }
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: t1 */
    public static void m46286t1(final Act act, final String str, final x20 x20Var, final x20 x20Var2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(act.getString(R$string.f19373jk));
        w30.C21001b c21001b = new w30.C21001b(act);
        c21001b.m204657I(act.getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.sm8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                w30VarArr[0].m204614b();
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.tm8
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                CoreDlg.m46241e0(x20Var, act, str, w30VarArr, vListCell, c22660a, i);
            }
        }).m204668T(new DialogInterface.OnDismissListener() { // from class: l.um8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoreDlg.m46223Y0(x20Var2, dialogInterface);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        final w30[] w30VarArr = {w30VarM204654F};
        w30VarM204654F.m204618f();
    }

    /* JADX INFO: renamed from: u1 */
    public static void m46289u1(Act act, String str, String str2) {
        m46292v1(act, str, null, null, null, str2);
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m46291v0(y20 y20Var, Conversation conversation, String str, String str2, Act act, w30[] w30VarArr, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        String str3;
        String string = c22660a.f210081a.toString();
        y20Var.call(string.toString());
        if (NullChecker.m82486a(conversation)) {
            sfj0.m185596c("e_cancelmatch", OMSDialogPositon.p_messages_view, sfj0.C20032a.m185615h("receiver_user_id", str), sfj0.C20032a.m185615h("source_type", str2), sfj0.C20032a.m185615h("cancel_item", string.toString()), sfj0.C20032a.m185615h("matchfrom", CoreModule.f18264c.f20381e0.m116488M7(str).matchFromForTrack()));
        }
        String string2 = string.toString();
        if (act.string(R$string.f18803Qq).equals(string2)) {
            str3 = "dont_talk";
        } else if (act.string(R$string.f18923Uq).equals(string2)) {
            str3 = "spam";
        } else if (act.string(R$string.f18893Tq).equals(string2)) {
            str3 = "harassment";
        } else if (act.string(R$string.f18863Sq).equals(string2)) {
            str3 = "fake_profile";
        } else if (act.string(R$string.f18833Rq).equals(string2)) {
            str3 = "dont_want_to_tell_you";
        } else {
            str3 = act.string(R$string.f18953Vq).equals(string2) ? "swiped_wrong" : "";
        }
        i4g0.m138523u("e_chat_unmatch", "p_unmatch_dialog", jyb.m147494Y("unmatch_reason", str3));
        w30VarArr[0].m204614b();
    }

    /* JADX INFO: renamed from: v1 */
    public static void m46292v1(final Act act, final String str, final y20<String> y20Var, final x20 x20Var, final x20 x20Var2, final String str2) {
        final Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str);
        act.duringCreated(psd0.m173625r(CoreModule.f18264c.f20384f0.m33730Mg(str), CoreModule.f18264c.f20384f0.m33694Jg(str), new rcj() { // from class: l.ap8
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return jyb.m147494Y((Boolean) obj, (Boolean) obj2);
            }
        }).first()).subscribe(psd0.m173596G(new y20() { // from class: l.lp8
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreDlg.m46153B(y20Var, str, act, x20Var2, str2, conversationM33859Xe, x20Var, (pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m46294w0(x20 x20Var) {
        i4g0.m138520r("e_user_profile_share_agreement_popup_confirm", "p_user_profile_share_agreement_popup");
        x20Var.call();
    }

    /* JADX INFO: renamed from: w1 */
    public static void m46295w1(Act act, final Media media) {
        if (wzx.m208784k()) {
            m46298x1(media);
        } else {
            PermissionHelper.m81065c().m81083r("android.permission.WRITE_EXTERNAL_STORAGE").m81088w(false).m81086u(true).m81078m(new x20() { // from class: l.vm8
                @Override // p153l.x20
                public final void call() {
                    CoreDlg.m46298x1(media);
                }
            }, new y20() { // from class: l.wm8
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreDlg.m46211U0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m81074i(act);
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m46296x(jl80 jl80Var, View view) {
        jl80Var.dismiss();
        sfj0.m185596c("e_user_passive_popup_ok", "p_user_passive_popup", new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m46297x0(x20 x20Var, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m46298x1(Media media) {
        String str;
        String aspectRatio;
        String str2;
        String str3;
        final StringBuilder sb = new StringBuilder();
        String str4 = null;
        try {
            if (media instanceof Video) {
                aspectRatio = ((Video) media).formatAspectRatio();
                str2 = Environment.DIRECTORY_MOVIES;
            } else if (media instanceof Picture) {
                aspectRatio = ((Picture) media).aspectRatioBiggest().formatted();
                str2 = Environment.DIRECTORY_PICTURES;
            } else {
                aspectRatio = null;
                str2 = null;
            }
            if (!TextUtils.isEmpty(aspectRatio) && !TextUtils.isEmpty(str2)) {
                String strSubstring = aspectRatio.substring(aspectRatio.lastIndexOf("."), aspectRatio.length());
                int iIndexOf = strSubstring.indexOf(63);
                if (iIndexOf == -1) {
                    str3 = System.currentTimeMillis() + strSubstring;
                } else {
                    str3 = System.currentTimeMillis() + strSubstring.substring(0, iIndexOf);
                }
                StringBuilder sb2 = new StringBuilder(Environment.getExternalStoragePublicDirectory(str2).getAbsolutePath());
                String str5 = File.separator;
                sb2.append(str5);
                sb2.append("Tantan");
                String string = sb2.toString();
                File file = new File(string);
                if (file.exists() || (!file.exists() && file.mkdirs())) {
                    sb.append(str2);
                    sb.append(str5);
                    sb.append("Tantan");
                    sb.append(str5);
                    sb.append(str3);
                    str4 = string + str5 + str3;
                }
            }
            String str6 = str4;
            str4 = aspectRatio;
            str = str6;
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("downloadMediaWithPermission exception:" + e.getMessage(), e));
            str = null;
        }
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str)) {
            o1j0.m165634h(R$string.f19543p4);
            return;
        }
        DownloadTask downloadTaskM80809a = new DownloadTask.C13273b(uqb0.f180376H.getDownloadHttp()).m80825q(str4).m80823o(str).m80818j(new z20() { // from class: l.io8
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                l51.m152887G(new Runnable() { // from class: l.bp8
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreDlg.m46246g0(downloadTask, sb);
                    }
                });
            }
        }).m80814f(new z20() { // from class: l.jo8
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                CoreDlg.m46196P0((DownloadTask) obj, (Throwable) obj2);
            }
        }).m80809a();
        if (C13274a.m80837u().m80857y(downloadTaskM80809a.m80806x())) {
            o1j0.m165634h(R$string.f19135br);
        } else {
            C13274a.m80837u().m80848o(downloadTaskM80809a);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m46300y0(String str, PutongAct putongAct, String str2, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (str.equals(charSequence)) {
            i4g0.m138523u("e_age_verify_photo_upload_type", "p_age_verify_photo_upload_type_popup", jyb.m147494Y("select_photo_way", "select_from_album"));
            putongAct.pickImagesWithPicker(1, false, false, false);
        } else if (str2.equals(charSequence)) {
            i4g0.m138523u("e_age_verify_photo_upload_type", "p_age_verify_photo_upload_type_popup", jyb.m147494Y("select_photo_way", "take_photo"));
            l7y.m153160l(putongAct);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public static void m46301y1(Act act, User user, final boolean z, final Runnable runnable, final Runnable runnable2) {
        int i;
        if (z) {
            i = TEnum.equals(user.gender, "male") ? R$string.f18537I3 : R$string.f18506H3;
        } else {
            i = TEnum.equals(user.gender, "male") ? R$string.f18413E3 : R$string.f18382D3;
        }
        if (z) {
            fph0.m126632C();
        } else {
            fph0.m126695z();
        }
        if (!IntlCountryCodeController.m29125v() && !d09.m113370g()) {
            act.dialog().m21495B(true).m21493A(new DialogInterface.OnCancelListener() { // from class: l.ko8
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    CoreDlg.m46217W0(runnable, dialogInterface);
                }
            }).m21556u().m21552s().m21532c0(z ? dbc0.f86005As : dbc0.f87622ys).m21506G0(act.getResources().getString(z ? R$string.f18568J3 : R$string.f18444F3)).m21501E(i, user.name).m21541l0(R$string.f19138c, new Runnable() { // from class: l.lo8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreDlg.m46187M0(runnable, z);
                }
            }).m21555t0(z ? R$string.f18475G3 : R$string.f18351C3, new Runnable() { // from class: l.mo8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreDlg.m46190N0(z, runnable2);
                }
            }).m21567z0();
            return;
        }
        int i2 = z ? R$string.f19845yr : R$string.f19814xr;
        int i3 = z ? R$string.f18475G3 : R$string.f18351C3;
        final Dialog dialogM21566z = act.dialog().m21495B(false).m21516M(kec0.f126040rf).m21556u().m21566z();
        dialogM21566z.setCanceledOnTouchOutside(false);
        View viewM21457P = dialogM21566z.m21457P();
        VImage vImage = (VImage) viewM21457P.findViewById(adc0.f70031N5);
        VText vText = (VText) viewM21457P.findViewById(adc0.f69992L0);
        VText vText2 = (VText) viewM21457P.findViewById(adc0.f70409je);
        VText vText3 = (VText) viewM21457P.findViewById(adc0.f70061P1);
        vText2.setText(i2);
        vText3.setText(dialogM21566z.getContext().getString(i, user.name));
        vText.setText(i3);
        vImage.setImageResource(z ? dbc0.f86037Bs : dbc0.f87654zs);
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.no8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m46160D0(z, runnable2, dialogM21566z, view);
            }
        });
        dialogM21566z.show();
    }

    /* JADX INFO: renamed from: z1 */
    public static CharSequence m46304z1(Act act, boolean z, int i, int i2) {
        String string = act.getString(i);
        if (!z || i2 <= 0) {
            return string;
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(string).append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(act.getResources(), BitmapFactory.decodeResource(act.getResources(), i2));
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        spannableStringBuilderAppend.setSpan(new qxw(bitmapDrawable, qa00.m175859d(8.0f)), spannableStringBuilderAppend.length() - 1, spannableStringBuilderAppend.length(), 17);
        return spannableStringBuilderAppend;
    }
}
