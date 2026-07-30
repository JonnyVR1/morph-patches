package com.p046p1.mobile.putong.core.p053ui.dlg;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4317a;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Active;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.core.data.ReportFrom;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.newui.messages.C8175b;
import com.p046p1.mobile.putong.core.newui.messages.SetNicknameAct;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.dlg.CoreDlg;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.core.p053ui.report.ReportAct;
import com.p046p1.mobile.putong.core.p053ui.settings.PersonalDetailsAct;
import com.p046p1.mobile.putong.core.p053ui.settings.SetTickleAct;
import com.p046p1.mobile.putong.core.p053ui.verification.AgeVerificationDoubleGuideView;
import com.p046p1.mobile.putong.core.p053ui.verification.AgeVerificationSingleGuideView;
import com.p046p1.mobile.putong.core.p053ui.vip.widget.IntlLetterSendPanel;
import com.p046p1.mobile.putong.data.Converter;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.IdBoxed;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.LinkChannel;
import com.p046p1.mobile.putong.data.LinkIntent;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Picture;
import com.p046p1.mobile.putong.data.Report;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserStatus;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.p046p1.mobile.putong.p065ui.download.C13111a;
import com.p046p1.mobile.putong.p065ui.download.DownloadTask;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.p046p1.mobile.putong.p065ui.webview.WebViewAct;
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
import p133rx.C22306c;
import p147v.VButton;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VListCell;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.ane0;
import p149l.bx6;
import p149l.c40;
import p149l.cwf0;
import p149l.d30;
import p149l.dd80;
import p149l.dyd;
import p149l.e30;
import p149l.e51;
import p149l.eqh0;
import p149l.f30;
import p149l.f6c0;
import p149l.hfw;
import p149l.hrb;
import p149l.i0e;
import p149l.i0g0;
import p149l.ic50;
import p149l.it6;
import p149l.j760;
import p149l.knb0;
import p149l.lsi0;
import p149l.mkd0;
import p149l.n3b0;
import p149l.o6j0;
import p149l.o7r;
import p149l.oyx;
import p149l.ozb0;
import p149l.p4c0;
import p149l.pvv;
import p149l.q860;
import p149l.qib0;
import p149l.roj0;
import p149l.ruw;
import p149l.ruy;
import p149l.rza;
import p149l.s4e;
import p149l.t100;
import p149l.u4c0;
import p149l.upa;
import p149l.v7c0;
import p149l.v9j;
import p149l.vwb;
import p149l.vy8;
import p149l.w0c0;
import p149l.w9j;
import p149l.wvv;
import p149l.x2c0;
import p149l.x9j;
import p149l.xdl0;
import p149l.xh0;
import p149l.ygh0;
import p149l.yij0;
import p149l.zb0;
import p149l.zqx;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public final class CoreDlg extends s4e {

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
    public class C8313a implements C4317a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f28901a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f28902b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d30 f28903c;

        public C8313a(int i, Act act, d30 d30Var) {
            this.f28901a = i;
            this.f28902b = act;
            this.f28903c = d30Var;
        }

        @Override // com.p046p1.mobile.android.app.C4317a.a
        /* JADX INFO: renamed from: a */
        public boolean mo20401a(int i, int i2, Intent intent) {
            if (i != this.f28901a) {
                return false;
            }
            this.f28902b.unregisterOnActivityResultListener(this);
            if (!NullChecker.m81303a(this.f28903c)) {
                return false;
            }
            this.f28903c.call();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.CoreDlg$b */
    public class ViewOnLayoutChangeListenerC8314b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public boolean f28904a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScrollView f28905b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ IntlLetterSendPanel f28906c;

        public ViewOnLayoutChangeListenerC8314b(ScrollView scrollView, IntlLetterSendPanel intlLetterSendPanel) {
            this.f28905b = scrollView;
            this.f28906c = intlLetterSendPanel;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m45123b(ScrollView scrollView, IntlLetterSendPanel intlLetterSendPanel) {
            scrollView.fullScroll(130);
            if (!this.f28904a) {
                intlLetterSendPanel.f37973e.requestFocus();
            }
            this.f28904a = false;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            final ScrollView scrollView = this.f28905b;
            final IntlLetterSendPanel intlLetterSendPanel = this.f28906c;
            scrollView.post(new Runnable() { // from class: l.so8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165565a.m45123b(scrollView, intlLetterSendPanel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m44967A(final String str, final Act act, final d30 d30Var, j760 j760Var) {
        User userById = CoreModule.m29934N().getUserById(str);
        if (!CoreModule.m29934N().isMatchedByRelationship(userById) && CoreModule.m29934N().isMatchedByFollowship(userById)) {
            CoreModule.m29934N().following(CoreModule.m29931H().userId(), userById, false, null, null).subscribe(mkd0.m154956H(new e30() { // from class: l.tk8
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreDlg.m45089p(act, d30Var, (Followship) obj);
                }
            }, new e30() { // from class: l.uk8
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreDlg.m45068i(act, (Throwable) obj);
                }
            }));
        } else {
            act.progress(R$string.f17842J5, true);
            CoreModule.f17545c.f19642f0.m33090qe(str, act).subscribe(mkd0.m154956H(new e30() { // from class: l.vk8
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreDlg.m45086o(str, act, d30Var, (roj0) obj);
                }
            }, new e30() { // from class: l.wk8
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreDlg.m45022S0(act, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m44968A0(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: A1 */
    public static void m44969A1(Menu menu, String str, Act act, d30 d30Var) {
        m45079l1(true, false, menu, str, act, true, null, 10, null);
        m45067h1(act, menu, d30Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m44970B(final e30 e30Var, final String str, final Act act, final d30 d30Var, final String str2, final Conversation conversation, final d30 d30Var2, j760 j760Var) {
        final e30 e30Var2 = new e30() { // from class: l.xk8
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreDlg.m45056d1(e30Var, str, act, d30Var, (String) obj);
            }
        };
        ArrayList arrayList = new ArrayList();
        if (((Boolean) j760Var.f116564a).booleanValue()) {
            arrayList.add(act.string(R$string.f19135zq));
            arrayList.add(act.string(R$string.f19105yq));
        } else {
            arrayList.add(act.string(R$string.f19015vq));
        }
        if (!((Boolean) j760Var.f116565b).booleanValue()) {
            arrayList.add(act.string(R$string.f17593Aq));
        }
        arrayList.add(act.string(R$string.f19075xq));
        arrayList.add(act.string(R$string.f19045wq));
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_unmatch_dialog", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            if (NullChecker.m81303a(str2)) {
                jSONObject.put("unmatch_dialog_show_from", str2);
            }
        } catch (JSONException e) {
            CrashHelper.m81296c(e);
        }
        cwf0VarM133794c.m109039o(jSONObject);
        c40.C16057b c16057b = new c40.C16057b(act);
        c16057b.m105160M(R$string.f17623Bq).m105158K(R$string.f18985uq);
        c16057b.m105155H(R$string.f18408c).m105168U(new View.OnClickListener() { // from class: l.yk8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c40VarArr[0].m105113b();
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.zk8
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                CoreDlg.m45108v0(e30Var2, conversation, str, str2, act, c40VarArr, vListCell, c22545a, i);
            }
        }).m105166S(new DialogInterface.OnCancelListener() { // from class: l.al8
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                CoreDlg.m45114x0(d30Var2, dialogInterface);
            }
        }).m105167T(new DialogInterface.OnDismissListener() { // from class: l.bl8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m105170W(new DialogInterface.OnShowListener() { // from class: l.cl8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        final c40[] c40VarArr = {c40VarM105153F};
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: B1 */
    public static boolean m44972B1(User user) {
        if (user == null || user.localRelationship == null) {
            return false;
        }
        return user.letter() || user.likedMe() || user.superLikedMe();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m44973C(Set set, VButton vButton, Set set2) {
        set.clear();
        set.addAll(set2);
        vButton.setEnabled(!set.isEmpty());
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ boolean m44974C0(final Act act, String str, final boolean z, final d30 d30Var, ProfileMenuBuildParam profileMenuBuildParam, MenuItem menuItem) {
        act.startActivity(ReportAct.m54629b2(act, str, z, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.ui.dlg.CoreDlg.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (i == -1) {
                    if (!z) {
                        if (NullChecker.m81303a(d30Var)) {
                            d30Var.call();
                        } else {
                            act.setResult(SwipeDirection.LEFT.getValue());
                            act.m66873d2();
                        }
                    }
                    bundle.getString(Reason.TYPE);
                }
            }
        }, profileMenuBuildParam));
        return true;
    }

    /* JADX INFO: renamed from: C1 */
    public static C22306c m44975C1(Act act, String str, String str2, ArrayList<LinkChannel> arrayList) {
        Link link = new Link();
        link.intent = LinkIntent.get("invite");
        link.resources = vwb.m200324f0(new IdBoxed(CoreModule.m29931H().userId(), "user"));
        link.href = "https://int.tantanapp.com";
        link.channel = LinkChannel.get("wechat-moments");
        return new ShareHelper(link, str).m80019w0(act, act.getString(R$string.f18183Ug), str2, arrayList, true);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m44976D(e30 e30Var, android.app.Dialog dialog, String str) {
        e30Var.call(str);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m44977D0(boolean z, Runnable runnable, Dialog dialog, View view) {
        if (z) {
            ygh0.m214642A();
        } else {
            ygh0.m214705x();
        }
        runnable.run();
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: D1 */
    public static C22306c m44978D1(Act act, String str, ArrayList<LinkChannel> arrayList) {
        return m44975C1(act, str, act.getString(R$string.f18407bt), arrayList);
    }

    /* JADX INFO: renamed from: E1 */
    public static void m44981E1(Act act, String str, CharSequence charSequence, int i, String str2, d30 d30Var, boolean z, String str3, d30 d30Var2, d30 d30Var3) {
        m44984F1(act, str, charSequence, i, str2, d30Var, z, str3, d30Var2, d30Var3, null, true, false, null, null);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m44982F(d30 d30Var, User user) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        o6j0.m162859c("e_alert_dislike_who_liked_me_like", "p_alert_dislike_who_liked_me_popup", o6j0.C18854a.m162878h("receiver_user_id", user.f56011id));
    }

    /* JADX INFO: renamed from: F1 */
    public static void m44984F1(Act act, String str, CharSequence charSequence, int i, String str2, d30 d30Var, boolean z, String str3, d30 d30Var2, d30 d30Var3, @Nullable User user, boolean z2, boolean z3, String str4, d30 d30Var4) {
        m44987G1(act, str, charSequence, i, str2, d30Var, z, str3, d30Var2, d30Var3, user, z2, z3, str4, d30Var4, false);
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ boolean m44986G0(Act act, String str, MenuItem menuItem) {
        act.startActivity(SetTickleAct.m55030Z1(act, str));
        return true;
    }

    /* JADX INFO: renamed from: G1 */
    public static void m44987G1(Act act, String str, CharSequence charSequence, int i, String str2, d30 d30Var, boolean z, String str3, d30 d30Var2, d30 d30Var3, @Nullable User user, boolean z2, boolean z3, String str4, d30 d30Var4, boolean z4) {
        String str5;
        cwf0 cwf0VarM133794c;
        if (TextUtils.isEmpty(str4)) {
            str5 = str4;
            cwf0VarM133794c = null;
        } else {
            str5 = str4;
            cwf0VarM133794c = i0e.m133794c(str5, "pic_verification_dialog");
        }
        m44990H1(act, str, charSequence, i, str2, d30Var, z, str3, d30Var2, d30Var3, user, z2, z3, str5, d30Var4, cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m44988H(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m44989H0(d30 d30Var) {
        zvf0.m220396r("e_user_profile_share_agreement_popup_cancel", "p_user_profile_share_agreement_popup");
        d30Var.call();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX INFO: renamed from: H1 */
    public static void m44990H1(Act act, String str, CharSequence charSequence, int i, String str2, final d30 d30Var, boolean z, String str3, final d30 d30Var2, final d30 d30Var3, @Nullable User user, boolean z2, boolean z3, final String str4, final d30 d30Var4, final cwf0 cwf0Var) {
        boolean z4;
        dd80 dd80VarM110960O;
        int i2;
        dd80.C16336a c16336aM110974c0 = act.newDialog().m110996y0(str).m110991t0(new SpannableStringBuilder(charSequence)).m110964S(i).m110961P(z2).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.rm8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoreDlg.m45072j0(str4, cwf0Var, dialogInterface);
            }
        }).m110974c0(str2, new Runnable() { // from class: l.sm8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m44988H(d30Var);
            }
        });
        if (z) {
            c16336aM110974c0.m110969X(str3, new Runnable() { // from class: l.tm8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreDlg.m45024T(d30Var2);
                }
            });
        }
        if (z) {
            z4 = true;
            if (!z3 ? xdl0.m208408w0() > 900 : xdl0.m208408w0() > 1200) {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        if (NullChecker.m81303a(user)) {
            View viewInflate = act.inflater().inflate(f6c0.f95968qe, (ViewGroup) null);
            VImage vImage = (VImage) viewInflate.findViewById(u4c0.f174118Xe);
            user.showPicVerificationIcon(vImage, vImage);
            if (z4) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((FrameLayout) viewInflate.findViewById(u4c0.f173965Oa)).getLayoutParams();
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
                layoutParams.topMargin = t100.m186890d(i2);
            }
            qib0.f154691G.m102327J0((VDraweeView) viewInflate.findViewById(u4c0.f173948Na), user.m60124fp().profileMiddle(), false);
            dd80VarM110960O = c16336aM110974c0.m110963R(viewInflate).m110960O();
        } else {
            if (z4 && z3) {
                String language2 = Locale.getDefault().getLanguage();
                if (!"ja".equals(language2) && !"in".equals(language2) && !"id".equals(language2)) {
                    "en".equals(language2);
                }
            }
            dd80VarM110960O = c16336aM110974c0.m110964S(i).m110960O();
        }
        if (NullChecker.m81303a(d30Var3)) {
            dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.um8
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    CoreDlg.m45046a1(d30Var3, d30Var4, dialogInterface);
                }
            });
        }
        if (!TextUtils.isEmpty(str4)) {
            i0e.m133797f(cwf0Var);
        }
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m44991I(Dialog dialog, d30 d30Var) {
        dialog.dismiss();
        d30Var.call();
    }

    /* JADX INFO: renamed from: I1 */
    public static void m44993I1(final Act act, v9j<Double> v9jVar, final e30<Double> e30Var, final e30<Boolean> e30Var2) {
        Date date = new Date((long) v9jVar.call().doubleValue());
        DatePickerDialog datePickerDialogM85082h4 = DatePickerDialog.m85082h4(new DatePickerDialog.InterfaceC14661d() { // from class: l.bn8
            @Override // com.wdullaer.materialdatetimepicker.date.DatePickerDialog.InterfaceC14661d
            /* JADX INFO: renamed from: a */
            public final void mo85109a(DatePickerDialog datePickerDialog, int i, int i2, int i3) {
                CoreDlg.m45012P(e30Var2, e30Var, datePickerDialog, i, i2, i3);
            }
        }, date.getYear() + Constants.UPNP_MULTICAST_PORT, date.getMonth(), date.getDate(), true);
        datePickerDialogM85082h4.m85103o4(true);
        datePickerDialogM85082h4.mo85091L1(new DatePickerDialog.InterfaceC14660c() { // from class: l.cn8
            @Override // com.wdullaer.materialdatetimepicker.date.DatePickerDialog.InterfaceC14660c
            /* JADX INFO: renamed from: a */
            public final void mo85108a() {
                CoreDlg.m45053c1(act);
            }
        });
        datePickerDialogM85082h4.m85100l4(act.string(R$string.f18136T));
        datePickerDialogM85082h4.m85098j4(act.string(R$string.f18408c));
        datePickerDialogM85082h4.show(act.getSupportFragmentManager(), "dpd");
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m44995J0(Act act) {
        CoreModule.f17545c.f19642f0.f19961o0.put(Boolean.TRUE);
        o6j0.m162859c("e_cheat_prevention_guide_click", "p_alert_cheat_prevention__tips_popup", o6j0.C18854a.m162878h("cheat_prevention_from", "tips_popup"));
        o6j0.m162859c("e_alert_cheat_prevention__tips_click", "p_alert_cheat_prevention__tips_popup", o6j0.C18854a.m162878h("no_prompt_again", "yes"));
        act.startActivity(WebViewAct.m80165a2(act, "", "https://live-web.tantanapp.com/anti_fraud_reminder/guide", true));
    }

    /* JADX INFO: renamed from: J1 */
    public static void m44996J1(Menu menu, String str, Act act, boolean z, boolean z2, String str2, d30 d30Var, d30 d30Var2, String str3) {
        m44999K1(menu, str, act, z, z2, str2, d30Var, d30Var2, true, false, str3);
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m44998K0(Act act, roj0 roj0Var) {
        act.progressDismiss();
        lsi0.m151595y(it6.m138181b(R$string.f18462dm, R$string.f18128Sl));
    }

    /* JADX INFO: renamed from: K1 */
    public static void m44999K1(Menu menu, String str, Act act, boolean z, boolean z2, String str2, d30 d30Var, d30 d30Var2, boolean z3, boolean z4, String str3) {
        m45002L1(menu, str, act, z, z2, str2, d30Var, d30Var2, z3, z4, str3, null);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m45000L(VText vText, C8175b c8175b, q860 q860Var) {
        xdl0.m208344M(vText, vwb.m200296J(q860Var.f153135a));
        c8175b.m42293G(q860Var.f153135a);
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m45001L0(cwf0 cwf0Var, f30 f30Var, StringBuilder sb, BottomSheetDialog bottomSheetDialog, roj0 roj0Var) {
        i0e.m133796e(cwf0Var);
        f30Var.call("success", sb.toString());
        bottomSheetDialog.dismiss();
        CoreModule.f17545c.f19642f0.m32650Fo();
    }

    /* JADX INFO: renamed from: L1 */
    public static void m45002L1(Menu menu, String str, Act act, boolean z, boolean z2, String str2, d30 d30Var, d30 d30Var2, boolean z3, boolean z4, String str3, ProfileMenuBuildParam profileMenuBuildParam) {
        User user;
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        if (userM169430Pa == null) {
            userM169430Pa = CoreModule.m29932K().getUserById(str);
        }
        User user2 = userM169430Pa;
        boolean z5 = (user2 == null || user2.f56011id.equals(CoreModule.m29931H().userId()) || user2.isTeamAccount()) ? false : true;
        if (z5 || z) {
            if (NullChecker.m81303a(user2) && (act instanceof MessagesAct) && !user2.isTeamAccount()) {
                m45082m1(act, menu, str);
            }
            m45076k1(z5, z2, menu, str, act, d30Var, profileMenuBuildParam);
            m45070i1(z, menu, str, act);
            if (z3) {
                user = user2;
                m45091p1(z5, z2, user, act, menu, str, d30Var2, str3);
            } else {
                user = user2;
            }
            if (z4 && NullChecker.m81303a(user) && !user.isTeamAccount()) {
                m45088o1(act, menu, user.f56011id);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m45003M(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m45004M0(Runnable runnable, boolean z) {
        runnable.run();
        if (z) {
            ygh0.m214643B();
        } else {
            ygh0.m214706y();
        }
    }

    /* JADX INFO: renamed from: M1 */
    public static void m45005M1(Act act, Media media, Message message) {
        final List<j760<String, Runnable>> listM45008N1 = m45008N1(act, media, message);
        ArrayList arrayList = new ArrayList();
        Iterator<j760<String, Runnable>> it = listM45008N1.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().f116564a);
        }
        c40 c40VarM105153F = new c40.C16057b(act).m105156I(act.getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.co8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c40VarArr[0].m105113b();
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.do8
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                CoreDlg.m45071j(listM45008N1, c40VarArr, vListCell, c22545a, i);
            }
        }).m105153F();
        c40VarM105153F.m105117f();
        final c40[] c40VarArr = {c40VarM105153F};
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ boolean m45006N(Act act, String str, d30 d30Var, String str2, MenuItem menuItem) {
        m45109v1(act, str, null, null, d30Var, str2);
        return true;
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m45007N0(boolean z, Runnable runnable) {
        if (z) {
            ygh0.m214642A();
        } else {
            ygh0.m214705x();
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: N1 */
    public static List<j760<String, Runnable>> m45008N1(final Act act, final Media media, final Message message) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.m200311Y(CoreModule.f17544b.getString(R$string.f18958u), new Runnable() { // from class: l.ko8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m45112w1(act, media);
            }
        }));
        if (NullChecker.m81303a(message) && !message.isGroupMessage() && !message.isMe() && !((Boolean) vwb.m200310X(CoreModule.f17545c.f19639e0.m169430Pa(message.owner), new w9j() { // from class: l.lo8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).isTeamAccount());
            }
        }, Boolean.FALSE)).booleanValue()) {
            arrayList.add(vwb.m200311Y(CoreModule.f17544b.getString(media instanceof Video ? R$string.f18036Pj : R$string.f18006Oj), new Runnable() { // from class: l.mo8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreDlg.m45039Y(act, message);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O1 */
    public static List<knb0<String, Runnable, Integer, Void>> m45011O1(final Act act, final Media media, final Message message) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.m200312Z(CoreModule.f17544b.getString(R$string.f18958u), new Runnable() { // from class: l.dm8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m45112w1(act, media);
            }
        }, Integer.valueOf(x2c0.f190521re), null));
        if (NullChecker.m81303a(message) && !message.isGroupMessage() && !message.isMe() && !((Boolean) vwb.m200310X(CoreModule.f17545c.f19639e0.m169430Pa(message.owner), new w9j() { // from class: l.om8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).isTeamAccount());
            }
        }, Boolean.FALSE)).booleanValue()) {
            boolean z = media instanceof Video;
            arrayList.add(vwb.m200312Z(CoreModule.f17544b.getString(z ? R$string.f18036Pj : R$string.f18006Oj), new Runnable() { // from class: l.zm8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreDlg.m45065h(act, message);
                }
            }, Integer.valueOf(z ? x2c0.f190489qe : x2c0.f190489qe), null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m45012P(e30 e30Var, e30 e30Var2, DatePickerDialog datePickerDialog, int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = Converter.CALENDAR.get();
        gregorianCalendar.set(i, i2, i3, 0, 0, 0);
        gregorianCalendar.set(14, 0);
        Date time = gregorianCalendar.getTime();
        if (time.compareTo(yij0.m214944V()) > 0) {
            lsi0.m151578h(R$string.f18968u9);
            if (NullChecker.m81303a(e30Var)) {
                e30Var.call(Boolean.TRUE);
                return;
            }
            return;
        }
        if (time.compareTo(yij0.m214936N()) >= 0) {
            e30Var2.call(Double.valueOf(time.getTime()));
            return;
        }
        lsi0.m151578h(R$string.f18938t9);
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m45013P0(DownloadTask downloadTask, Throwable th) {
        lsi0.m151578h(R$string.f18751n4);
        CrashHelper.m81297d(new Exception("downloadMedia Fail exception:" + th.getMessage(), th), 50);
    }

    /* JADX INFO: renamed from: P1 */
    public static BottomSheetDialog m45014P1(Act act, final String str, String str2, String str3, int i, String str4, String str5, final String str6, List<String> list, String str7, final f30<String, String> f30Var) {
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_friends_list", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("share_source", str7));
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(act);
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f95518Pb, (ViewGroup) null);
        bottomSheetDialog.setContentView(viewInflate);
        Window window = bottomSheetDialog.getWindow();
        if (NullChecker.m81303a(window)) {
            window.findViewById(p4c0.f147063E).setBackgroundResource(w0c0.f183811U1);
        }
        VText vText = (VText) viewInflate.findViewById(u4c0.f174268ge);
        VText vText2 = (VText) viewInflate.findViewById(u4c0.f174148Zc);
        final VButton vButton = (VButton) viewInflate.findViewById(u4c0.f173802F0);
        final VText vText3 = (VText) viewInflate.findViewById(u4c0.f174511v3);
        vText.setText(str2);
        if (TextUtils.isEmpty(str3)) {
            xdl0.m208344M(vText2, false);
        } else {
            vText2.setText(str3);
        }
        vButton.setEnabled(false);
        vButton.setText(str4);
        VRecyclerView vRecyclerView = (VRecyclerView) viewInflate.findViewById(u4c0.f173738B4);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(act, 1, false));
        final C8175b c8175b = new C8175b(act, i, str5);
        final HashSet hashSet = new HashSet();
        c8175b.m42294H(new C8175b.a() { // from class: l.em8
            @Override // com.p046p1.mobile.putong.core.newui.messages.C8175b.a
            /* JADX INFO: renamed from: a */
            public final void mo42295a(Set set) {
                CoreDlg.m44973C(hashSet, vButton, set);
            }
        });
        vRecyclerView.setAdapter(c8175b);
        act.duringCreated(CoreModule.f17545c.f19642f0.m33086pn(arrayList)).subscribe(mkd0.m154955G(new e30() { // from class: l.fm8
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreDlg.m45000L(vText3, c8175b, (q860) obj);
            }
        }));
        i0e.m133797f(cwf0VarM133794c);
        bottomSheetDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gm8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        bottomSheetDialog.getBehavior().setState(3);
        bottomSheetDialog.getBehavior().setSkipCollapsed(true);
        bottomSheetDialog.show();
        xdl0.m208329E0(vButton, new View.OnClickListener() { // from class: l.hm8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m45043Z0(hashSet, str, str6, cwf0VarM133794c, f30Var, bottomSheetDialog, view);
            }
        });
        return bottomSheetDialog;
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ boolean m45016Q0(Act act, String str, MenuItem menuItem) {
        m45103t1(act, str, null, null);
        return true;
    }

    /* JADX INFO: renamed from: Q1 */
    public static void m45017Q1(Act act, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, f30<String, String> f30Var) {
        m45014P1(act, str, str2, str3, i, str4, str5, str6, new ArrayList(), str7, f30Var);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m45018R(String str, Act act, d30 d30Var, roj0 roj0Var) {
        CoreModule.m29934N().updateUserOnBlock(str);
        act.progressDismiss();
        CoreModule.f17545c.f19639e0.f149197J1.m132487l(str);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        List<String> listMo106876d = CoreModule.m29934N().coreMomentMutedUsers().mo106876d();
        if (listMo106876d == null) {
            listMo106876d = new ArrayList<>();
        }
        CoreModule.m29934N().coreMomentMutedUsers().mo106877e(vwb.m200318c0(listMo106876d, str));
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m45019R0(dd80 dd80Var, View view) {
        o6j0.m162859c("e_alert_cheat_prevention__risk_alarm_click", "p_alert_cheat_prevention__risk_alarm_popup", new o6j0.C18854a[0]);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: R1 */
    public static void m45020R1(Act act, String str, String str2, String str3, int i, String str4, String str5, String str6, f30<String, String> f30Var) {
        m45014P1(act, str, str2, str3, i, str4, str5, str6, new ArrayList(), "", f30Var);
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m45022S0(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: S1 */
    public static void m45023S1(final Act act, boolean z) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_alert_cheat_prevention__risk_alarm_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(ic50.m135327j().m135333f().m145235V(OmsDialog.alert_cheat_risk_alarm_popup.getIdentifier(), j760.m140076a("tooltips_trigger_mode", z ? Active.TYPE : "passive"), j760.m140076a("tooltips_type_ui", "alert_self_definition_basic"), j760.m140076a("tooltips_trigger_page", "swipe_page"), j760.m140076a("tooltips_trigger_module", "null"), j760.m140076a("tooltips_trigger_reason", "cheat_prevention")));
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f95422Jb, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174148Zc);
        VButton vButton = (VButton) viewInflate.findViewById(u4c0.f174552xa);
        final VButton vButton2 = (VButton) viewInflate.findViewById(u4c0.f174149Zd);
        vText.setText(i0g0.m133861b0("你的好友中有疑似境外诈骗团伙，TA已被探探封禁并从你的好友列表中移除！请尽快搜索了解“杀猪盘”欺诈信息，不要参与任何赌博，竞猜，彩票，虚拟货币等项目，如有任何异常，请及时在“设置页”“帮助与反馈”中举报", vwb.m200299M("已被探探封禁并从你的好友列表中移除"), act.getResources().getColor(w0c0.f183773I), eqh0.m117752c(2)));
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(viewInflate).m110961P(false).m110958M(false).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.gl8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110960O();
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.il8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m45096r0(act, view);
            }
        });
        vButton2.setText("10s");
        vButton2.setEnabled(false);
        vButton2.setStateListAnimator(AnimatorInflater.loadStateListAnimator(CoreModule.f17544b, ozb0.f146417e));
        act.duringCreated((C22306c) e51.m114749N(act.getLocalClassName(), 10), false).subscribe(mkd0.m154955G(new e30() { // from class: l.jl8
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreDlg.m45050b1(vButton2, act, dd80VarM110960O, (Long) obj);
            }
        }));
        dd80VarM110960O.show();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m45024T(d30 d30Var) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: T1 */
    public static void m45026T1(final Act act) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_alert_cheat_prevention__tips_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(ic50.m135327j().m135333f().m145235V(OmsDialog.alert_cheat_tips_popup.getIdentifier(), j760.m140076a("tooltips_trigger_mode", Active.TYPE), j760.m140076a("tooltips_type_ui", "alert_self_definition_basic"), j760.m140076a("tooltips_trigger_page", "message_list_page"), j760.m140076a("tooltips_trigger_module", "null"), j760.m140076a("tooltips_trigger_reason", "cheat_prevention")));
        View viewInflate = o7r.m163037a(act).inflate(f6c0.f95422Jb, (ViewGroup) null);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174268ge);
        VText vText2 = (VText) viewInflate.findViewById(u4c0.f174148Zc);
        VButton vButton = (VButton) viewInflate.findViewById(u4c0.f174552xa);
        VButton vButton2 = (VButton) viewInflate.findViewById(u4c0.f174149Zd);
        xdl0.m208344M(vButton, false);
        xdl0.m208344M(vButton2, false);
        vText.setText("温馨提示");
        vText2.setText(i0g0.m133861b0("系统检测到你的好友列表中有企图诈骗用户，TA已被探探封禁并从你的好友列表中移除！聊天过程中如果涉及任何资金往来，请注意提高警惕", vwb.m200324f0("企图诈骗用户", "涉及任何资金往来"), act.getResources().getColor(w0c0.f183773I), eqh0.m117752c(2)));
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(viewInflate).m110973b0("了解更多防骗技巧").m110968W("知道啦").m110961P(false).m110958M(false).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.wl8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110960O();
        dd80VarM110960O.m110915W(new Runnable() { // from class: l.xl8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m44995J0(act);
            }
        });
        dd80VarM110960O.m110914V(new Runnable() { // from class: l.yl8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m45064g1(dd80VarM110960O);
            }
        });
        dd80VarM110960O.show();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m45027U(cwf0 cwf0Var, DialogInterface dialogInterface) {
        ic50.m135327j().m135333f().m145241b0(OmsDialog.p_user_passive_show_chat.getIdentifier(), 0, false);
        i0e.m133797f(cwf0Var);
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m45028U0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: U1 */
    public static void m45029U1(final Act act, User user, final e30<String> e30Var, final d30 d30Var) {
        final android.app.Dialog dialog = new android.app.Dialog(act, v7c0.f180379z);
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_choose_letter_or_superlike", dialog.getClass().getName());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        ScrollView scrollView = (ScrollView) act.inflater().inflate(f6c0.f96119zd, (ViewGroup) null, false);
        IntlLetterSendPanel intlLetterSendPanel = (IntlLetterSendPanel) scrollView.findViewById(u4c0.f174029S6);
        intlLetterSendPanel.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC8314b(scrollView, intlLetterSendPanel));
        if (NullChecker.m81303a(e30Var)) {
            intlLetterSendPanel.setSendClickCallBack(new e30() { // from class: l.vm8
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreDlg.m44976D(e30Var, dialog, (String) obj);
                }
            });
        }
        if (NullChecker.m81303a(d30Var)) {
            intlLetterSendPanel.setSuperLikeClickCallBack(new d30() { // from class: l.wm8
                @Override // p149l.d30
                public final void call() {
                    CoreDlg.m45080m(d30Var, dialog);
                }
            });
        }
        intlLetterSendPanel.setCloseCallBack(new hrb(dialog));
        dialog.setContentView(scrollView);
        ViewGroup.LayoutParams layoutParams = intlLetterSendPanel.getLayoutParams();
        layoutParams.width = act.getResources().getDisplayMetrics().widthPixels;
        intlLetterSendPanel.setLayoutParams(layoutParams);
        dialog.getWindow().setGravity(80);
        dialog.getWindow().setWindowAnimations(v7c0.f180346A);
        intlLetterSendPanel.setLetterWrapperLibraries(CoreModule.f17546d.m200496B(user.gender, i0g0.m133885y()));
        intlLetterSendPanel.m57710t(user, new d30() { // from class: l.xm8
            @Override // p149l.d30
            public final void call() {
                ((InputMethodManager) act.getSystemService("input_method")).toggleSoftInput(0, 2);
            }
        });
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.ym8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ((InputMethodManager) act.getSystemService("input_method")).toggleSoftInput(0, 2);
            }
        });
        dialog.getWindow().setSoftInputMode(16);
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.an8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        });
        dialog.show();
        i0e.m133797f(cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: V1 */
    public static void m45032V1(Act act, User user, final d30 d30Var, final d30 d30Var2) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_suggest_live_room_pop", Dialog.class.getName());
        qib0.f154691G.m102341Q0((VDraweeView) new dd80.C16336a(act).m110962Q(f6c0.f95459M0).m110961P(false).m110958M(true).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.im8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110986o0(new DialogInterface.OnShowListener() { // from class: l.jm8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.m133797f(cwf0VarM133794c);
            }
        }).m110974c0(act.getString(R$string.f18303Yg), new Runnable() { // from class: l.km8
            @Override // java.lang.Runnable
            public final void run() {
                d30Var.call();
            }
        }).m110969X(act.getString(R$string.f18395bh), new Runnable() { // from class: l.lm8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m45036X(d30Var2);
            }
        }).m110989r0().m110906L().findViewById(u4c0.f173954O), user.m60124fp().profileSmall());
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m45034W0(Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: W1 */
    public static void m45035W1(final Act act, String str) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_user_passive_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(ic50.m135327j().m135333f().m145235V(OmsDialog.p_user_passive_show_chat.getIdentifier(), j760.m140076a("userpassive_showfrom", "chat"), j760.m140076a("userpassive_word", str)));
        final View viewInflate = act.getLayoutInflater().inflate(f6c0.f95837j2, (ViewGroup) null);
        final dd80 dd80VarM110960O = act.newDialog().m110963R(viewInflate).m110961P(false).m110986o0(new DialogInterface.OnShowListener() { // from class: l.on8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CoreDlg.m45027U(cwf0VarM133794c, dialogInterface);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.pn8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110960O();
        viewInflate.findViewById(u4c0.f174277h6).setOnClickListener(new View.OnClickListener() { // from class: l.qn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m45081m0(dd80VarM110960O, view);
            }
        });
        viewInflate.findViewById(u4c0.f173731Ae).setOnClickListener(new View.OnClickListener() { // from class: l.rn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m45113x(dd80VarM110960O, view);
            }
        });
        viewInflate.findViewById(u4c0.f173833Ge).setOnClickListener(new View.OnClickListener() { // from class: l.sn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m45061f0(viewInflate, act, dd80VarM110960O, view);
            }
        });
        dd80VarM110960O.show();
        act.lifecycle().filter(new w9j() { // from class: l.tn8
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15549j);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.un8
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreDlg.m45066h0(dd80VarM110960O, (C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m45036X(d30 d30Var) {
        zvf0.m220396r("e_suggest_live_room_card_popup_no", "p_suggest_live_room_pop");
        d30Var.call();
    }

    /* JADX INFO: renamed from: X1 */
    public static void m45038X1(Act act, boolean z) {
        m45041Y1(act, z, null);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m45039Y(final Act act, Message message) {
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = "";
        act.progress(R$string.f17842J5, true);
        CoreModule.f17545c.f19642f0.m33101qp(message.owner, message.f56011id, report).subscribe(mkd0.m154956H(new e30() { // from class: l.po8
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreDlg.m45084n0(act, (roj0) obj);
            }
        }, new e30() { // from class: l.qo8
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreDlg.m44968A0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m45040Y0(d30 d30Var, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static void m45041Y1(final Act act, boolean z, final d30 d30Var) {
        new xh0.C21150a(act).m208728g(z).m208740s(act.getString(R$string.f18780o2)).m208739r(act.getString(R$string.f18216Vj)).m208726e(R$string.f18408c).m208731j(String.format("%s\n%s\n%s", act.getString(R$string.f18749n2), act.getString(R$string.f18811p2), act.getString(R$string.f18718m2))).m208732k(8388611).m208736o(new View.OnClickListener() { // from class: l.am8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m45075k0(act, d30Var, view);
            }
        }).m208722a().m208721g();
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m45042Z(d30 d30Var, Act act) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        act.m66873d2();
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ void m45043Z0(Set set, String str, String str2, final cwf0 cwf0Var, final f30 f30Var, final BottomSheetDialog bottomSheetDialog, View view) {
        o6j0.m162859c("e_friends_share", "p_friends_list", o6j0.C18854a.m162876f("share_friends_nums", set.size()));
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
                CoreModule.f17545c.f19642f0.m32675Ho(dyd.m114055a(), arrayList, Message.JSON_ADAPTER.parse(URLDecoder.decode(str2, "UTF-8"))).subscribe(mkd0.m154956H(new e30() { // from class: l.ao8
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreDlg.m45001L0(cwf0Var, f30Var, sb, bottomSheetDialog, (roj0) obj);
                    }
                }, new e30() { // from class: l.bo8
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreDlg.m45099s0(f30Var, sb, (Throwable) obj);
                    }
                }));
                return;
            } catch (IOException e) {
                CrashHelper.m81296c(e);
                return;
            }
        }
        if (TextUtils.equals(str, "selectFriends")) {
            i0e.m133796e(cwf0Var);
            f30Var.call("success", sb.toString());
            bottomSheetDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public static void m45044Z1(Act act, final d30 d30Var, String str) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_age_verify_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("age_verify_show_from", str), vwb.m200311Y("tooltips_trigger_mode", Active.TYPE));
        i0e.m133797f(cwf0VarM133794c);
        View viewInflate = act.inflater().inflate(f6c0.f95730cd, (ViewGroup) null, false);
        final dd80 dd80VarM110960O = act.newDialog().m110963R(viewInflate).m110961P(true).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.tl8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110960O();
        ((AgeVerificationSingleGuideView) viewInflate).m55978T(Boolean.valueOf(zb0.m217807d()), new d30() { // from class: l.ul8
            @Override // p149l.d30
            public final void call() {
                CoreDlg.m45077l(d30Var, dd80VarM110960O);
            }
        }, new d30() { // from class: l.vl8
            @Override // p149l.d30
            public final void call() {
                dd80VarM110960O.dismiss();
            }
        });
        dd80VarM110960O.show();
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m45046a1(d30 d30Var, d30 d30Var2, DialogInterface dialogInterface) {
        d30Var.call();
        if (NullChecker.m81303a(d30Var2)) {
            d30Var2.call();
        }
    }

    /* JADX INFO: renamed from: a2 */
    public static void m45047a2(Act act, Runnable runnable) {
        Dialog.C4309e c4309e = new Dialog.C4309e(act);
        int iColor = act.color(w0c0.f183776J);
        c4309e.m20545o(iColor).m20546o0(iColor).m20514K(14.0f).m20503E0(R$string.f18552gk).m20509H0(act.color(w0c0.f183755C)).m20504F(n3b0.m157733g() - qib0.f154693H.guessedCurrentServerTime() >= 0 ? act.string(R$string.f18521fk) : "开启此功能会导致“查看谁喜欢我“列表内不会再有新的喜欢你的用户，如果后续再购买“查看谁喜欢我“将默认重新关闭").m20506G(act.color(w0c0.f183758D)).m20554s0(R$string.f17990O3).m20542l0(R$string.f17926M, runnable).m20568z0();
    }

    /* JADX INFO: renamed from: b */
    public static void m45048b(Act act, final String str) {
        act.dialog().m20535e0(vwb.m200324f0(act.getString(R$string.f18593i))).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.sl8
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                e51.m114766q(str);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m45049b0(Act act, String str, d30 d30Var, Followship followship) {
        act.progressDismiss();
        CoreModule.f17545c.f19639e0.f149197J1.m132487l(str);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m45050b1(VButton vButton, Act act, final dd80 dd80Var, Long l2) {
        if (l2.longValue() < 9) {
            vButton.setText(String.format("%ds", Long.valueOf(9 - l2.longValue())));
            return;
        }
        vButton.setText("知道了");
        vButton.setTextColor(act.res.getColor(w0c0.f183758D));
        vButton.setEnabled(true);
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.nn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m45019R0(dd80Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: b2 */
    public static void m45051b2(final PutongAct putongAct) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_age_verify_photo_upload_type_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(vwb.m200311Y("tooltips_trigger_mode", Active.TYPE));
        i0e.m133797f(cwf0VarM133794c);
        final String strString = putongAct.string(R$string.f17626C);
        final String strString2 = putongAct.string(R$string.f17656D);
        putongAct.dialog().m20535e0(vwb.m200324f0(strString, strString2)).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.bm8
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                CoreDlg.m45117y0(strString, putongAct, strString2, dialog, view, i, charSequence);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.cm8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m45052c0(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ void m45053c1(Act act) {
        if (NullChecker.m81303a(act) && (act instanceof PersonalDetailsAct)) {
            zvf0.m220396r("e_edit_basic_info_calendar", "p_edit_basic_info_view");
        }
    }

    /* JADX INFO: renamed from: c2 */
    public static dd80 m45054c2(Act act, final d30 d30Var, final d30 d30Var2) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_user_profile_share_agreement_popup", Dialog.class.getName());
        i0e.m133797f(cwf0VarM133794c);
        return new dd80.C16336a(act).m110996y0("分享新功能").m110991t0("进入ta人主页可分享名片给你的朋友，使用截图有更多惊喜！默认为您打开了分享功能的使用权，若您不想被他人分享，可前往设置-隐私和通知进行关闭。").m110974c0("我知道了", new Runnable() { // from class: l.jn8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m45111w0(d30Var);
            }
        }).m110969X("后续了解", new Runnable() { // from class: l.ln8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m44989H0(d30Var2);
            }
        }).m110961P(false).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.mn8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110989r0();
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m45055d0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m45056d1(e30 e30Var, final String str, final Act act, final d30 d30Var, String str2) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(str2);
        }
        User userById = CoreModule.m29934N().getUserById(str);
        if (!CoreModule.m29934N().isMatchedByRelationship(userById) && CoreModule.m29934N().isMatchedByFollowship(userById) && !m44972B1(userById)) {
            CoreModule.m29934N().following(CoreModule.m29931H().userId(), userById, false, null, null).subscribe(mkd0.m154956H(new e30() { // from class: l.mm8
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreDlg.m45049b0(act, str, d30Var, (Followship) obj);
                }
            }, new e30() { // from class: l.nm8
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreDlg.m45069i0(act, (Throwable) obj);
                }
            }));
        } else {
            act.progress(R$string.f17842J5, true);
            CoreModule.f17545c.f19642f0.m33090qe(str, act).subscribe(mkd0.m154956H(new e30() { // from class: l.pm8
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreDlg.m45018R(str, act, d30Var, (roj0) obj);
                }
            }, new e30() { // from class: l.qm8
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreDlg.m45078l0(act, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d2 */
    public static void m45057d2(final User user, Act act, final d30 d30Var, final d30 d30Var2) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_alert_dislike_who_liked_me_popup", "showSpecialLikeRetailDlg");
        cwf0VarM133794c.m109039o(ic50.m135327j().m135333f().m145234U(OmsDialog.p_alert_dislike_who_liked_me_popup.getIdentifier(), o6j0.m162858b(o6j0.C18854a.m162878h("tooltips_trigger_mode", Active.TYPE), o6j0.C18854a.m162878h("tooltips_type", "alert"), o6j0.C18854a.m162878h("tooltips_type_ui", "alert_self_definition_basic"), o6j0.C18854a.m162878h("tooltips_trigger_reason", "swipe"), o6j0.C18854a.m162878h("tooltips_trigger_page", "swipe_page"), o6j0.C18854a.m162878h("tooltips_trigger_module", "card"), o6j0.C18854a.m162878h("receiver_user_id", user.f56011id))));
        i0e.m133797f(cwf0VarM133794c);
        View viewInflate = act.inflater().inflate(f6c0.f95582Tb, (ViewGroup) null);
        VDraweeView vDraweeView = (VDraweeView) viewInflate.findViewById(u4c0.f173999Qa);
        VDraweeView vDraweeView2 = (VDraweeView) viewInflate.findViewById(u4c0.f174016Ra);
        qib0.f154691G.m102341Q0(vDraweeView, CoreModule.f17545c.f19639e0.m169527p9().m60124fp().profileSmall());
        qib0.f154691G.m102341Q0(vDraweeView2, user.m60124fp().profileSmall());
        ((TextView) viewInflate.findViewById(u4c0.f174078V6)).setText(user.isFemale() ? String.format("%s\n%s", act.getString(R$string.f18834pp), act.getString(R$string.f18864qp)) : String.format("%s\n%s", act.getString(R$string.f18894rp), act.getString(R$string.f18924sp)));
        new dd80.C16336a(act).m110963R(viewInflate).m110961P(false).m110972a0(user.isFemale() ? R$string.f19014vp : R$string.f19044wp, new Runnable() { // from class: l.kl8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m44982F(d30Var, user);
            }
        }).m110966U(user.isFemale() ? R$string.f18954tp : R$string.f18984up, new Runnable() { // from class: l.ll8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m45059e1(d30Var2, user);
            }
        }).m110985n0(new DialogInterface.OnDismissListener() { // from class: l.ml8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m110989r0();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m45058e0(d30 d30Var, final Act act, final String str, c40[] c40VarArr, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        act.progress(R$string.f17842J5, true);
        CoreModule.f17545c.f19642f0.m33188xn(str).subscribe(mkd0.m154957I(new e30() { // from class: l.eo8
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreDlg.m45055d0((roj0) obj);
            }
        }, new e30() { // from class: l.fo8
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreDlg.m45003M(act, (Throwable) obj);
            }
        }, new d30() { // from class: l.ho8
            @Override // p149l.d30
            public final void call() {
                CoreDlg.m45102t0(str, act);
            }
        }));
        c40VarArr[0].m105113b();
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m45059e1(d30 d30Var, User user) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        o6j0.m162859c("e_alert_dislike_who_liked_me_dislike", "p_alert_dislike_who_liked_me_popup", o6j0.C18854a.m162878h("receiver_user_id", user.f56011id));
    }

    /* JADX INFO: renamed from: e2 */
    public static void m45060e2(Act act, final d30 d30Var, boolean z) {
        final cwf0 cwf0VarM133794c = i0e.m133794c("p_unlock_message_popup", Dialog.class.getName());
        cwf0VarM133794c.m109039o(o6j0.m162858b(o6j0.C18854a.m162878h("unlock_message_step", z ? "vipMembership" : "ageCheck"), o6j0.C18854a.m162878h("tooltips_trigger_mode", Active.TYPE)));
        i0e.m133797f(cwf0VarM133794c);
        o6j0.m162859c("e_unlock_message", "p_unlock_message_popup", o6j0.C18854a.m162878h("unlock_message_step", z ? "vipMembership" : "ageCheck"));
        View viewInflate = act.inflater().inflate(f6c0.f95713bd, (ViewGroup) null, false);
        final Dialog dialogM20567z = act.dialog().m20520P(viewInflate, true).m20496B(true).m20557u().m20526V(new DialogInterface.OnDismissListener() { // from class: l.xn8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0VarM133794c);
            }
        }).m20567z();
        ((AgeVerificationDoubleGuideView) viewInflate).m55973S(new d30() { // from class: l.yn8
            @Override // p149l.d30
            public final void call() {
                CoreDlg.m44991I(dialogM20567z, d30Var);
            }
        }, new d30() { // from class: l.zn8
            @Override // p149l.d30
            public final void call() {
                dialogM20567z.dismiss();
            }
        });
        dialogM20567z.show();
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m45061f0(View view, Act act, dd80 dd80Var, View view2) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + ((TextView) view.findViewById(u4c0.f173833Ge)).getText().toString()));
        act.startActivity(intent);
        dd80Var.dismiss();
        o6j0.m162859c("e_user_passive_popup_number", "p_user_passive_popup", new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m45063g0(DownloadTask downloadTask, StringBuilder sb) {
        CoreModule.f17544b.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.m79621v())));
        lsi0.m151580j(CoreModule.f17544b.getString(R$string.f18020P3, sb.toString()));
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m45064g1(dd80 dd80Var) {
        o6j0.m162859c("e_alert_cheat_prevention__tips_click", "p_alert_cheat_prevention__tips_popup", o6j0.C18854a.m162878h("no_prompt_again", "no"));
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m45065h(final Act act, Message message) {
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = "";
        act.progress(R$string.f17842J5, true);
        CoreModule.f17545c.f19642f0.m33101qp(message.owner, message.f56011id, report).subscribe(mkd0.m154956H(new e30() { // from class: l.dl8
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreDlg.m44998K0(act, (roj0) obj);
            }
        }, new e30() { // from class: l.el8
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreDlg.m45052c0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m45066h0(dd80 dd80Var, C4319c c4319c) {
        if (dd80Var == null || !dd80Var.isShowing()) {
            return;
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: h1 */
    public static void m45067h1(Act act, Menu menu, final d30 d30Var) {
        menu.add(0, 6, 30, act.string(R$string.f18408c)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.zl8
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return CoreDlg.m45087o0(d30Var, menuItem);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m45068i(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m45069i0(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: i1 */
    public static void m45070i1(boolean z, Menu menu, String str, Act act) {
        m45073j1(z, menu, str, act, 15);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m45071j(List list, c40[] c40VarArr, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        ((Runnable) ((j760) list.get(i)).f116565b).run();
        c40VarArr[0].m105113b();
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m45072j0(String str, cwf0 cwf0Var, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        i0e.m133796e(cwf0Var);
    }

    /* JADX INFO: renamed from: j1 */
    public static void m45073j1(boolean z, Menu menu, final String str, final Act act, int i) {
        if (z) {
            menu.add(0, 2, i, R$string.f17976Nj).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.sk8
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return CoreDlg.m45016Q0(act, str, menuItem);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m45075k0(Act act, d30 d30Var, View view) {
        hfw.m130790a("checkPermissionDlg", "click to setting");
        if (pvv.m171693c()) {
            if (!wvv.m205775o()) {
                act.registerOnActivityResultListener(new C8313a(1010, act, d30Var));
                act.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1010);
                return;
            } else if (NullChecker.m81303a(d30Var)) {
                d30Var.call();
            }
        } else if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        try {
            ane0.m97752x(act);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public static void m45076k1(boolean z, boolean z2, Menu menu, String str, Act act, d30 d30Var, ProfileMenuBuildParam profileMenuBuildParam) {
        m45079l1(z, z2, menu, str, act, false, d30Var, 10, profileMenuBuildParam);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m45077l(d30 d30Var, dd80 dd80Var) {
        zvf0.m220396r("e_age_verify_operate", "p_age_verify_popup");
        if (zb0.m217807d()) {
            lsi0.m151593w(R$string.f17836J);
        } else {
            d30Var.call();
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m45078l0(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: l1 */
    public static void m45079l1(boolean z, final boolean z2, Menu menu, final String str, final Act act, boolean z3, final d30 d30Var, int i, final ProfileMenuBuildParam profileMenuBuildParam) {
        if ((z3 || z2) && z) {
            menu.add(0, 1, i, m45121z1(act, false, R$string.f18868r, 0)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.fl8
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return CoreDlg.m44974C0(act, str, z2, d30Var, profileMenuBuildParam, menuItem);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m45080m(d30 d30Var, android.app.Dialog dialog) {
        d30Var.call();
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m45081m0(dd80 dd80Var, View view) {
        dd80Var.dismiss();
        o6j0.m162859c("e_user_passive_popup_cancel", "p_user_passive_popup", new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: m1 */
    public static void m45082m1(Act act, Menu menu, String str) {
        m45085n1(act, menu, str, 5);
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m45084n0(Act act, roj0 roj0Var) {
        act.progressDismiss();
        lsi0.m151595y(it6.m138181b(R$string.f18462dm, R$string.f18128Sl));
    }

    /* JADX INFO: renamed from: n1 */
    public static void m45085n1(final Act act, Menu menu, final String str, int i) {
        menu.add(0, 0, i, rza.m181739S0(act, act.string(R$string.f18790oc))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ro8
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return CoreDlg.m45090p0(act, str, menuItem);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m45086o(String str, Act act, d30 d30Var, roj0 roj0Var) {
        CoreModule.m29934N().updateUserOnBlock(str);
        act.progressDismiss();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        List<String> listMo106876d = CoreModule.m29934N().coreMomentMutedUsers().mo106876d();
        if (listMo106876d == null) {
            listMo106876d = new ArrayList<>();
        }
        CoreModule.m29934N().coreMomentMutedUsers().mo106877e(vwb.m200318c0(listMo106876d, str));
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ boolean m45087o0(d30 d30Var, MenuItem menuItem) {
        d30Var.call();
        return true;
    }

    /* JADX INFO: renamed from: o1 */
    public static void m45088o1(final Act act, Menu menu, final String str) {
        menu.add(0, 4, 4, R$string.f17778H1).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.kn8
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return CoreDlg.m44986G0(act, str, menuItem);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m45089p(Act act, d30 d30Var, Followship followship) {
        act.progressDismiss();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ boolean m45090p0(Act act, String str, MenuItem menuItem) {
        zvf0.m220396r("e_message_page_set_nickname", OMSDialogPositon.p_chat_view);
        if (CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
            act.startActivity(SetNicknameAct.m41806Y1(act, str));
            return true;
        }
        C8764c.m53403J1(act, "p_chat_view,e_message_page_set_nickname,click", Privilege.vip_membership_remark_gp);
        return true;
    }

    /* JADX INFO: renamed from: p1 */
    public static void m45091p1(boolean z, boolean z2, User user, Act act, Menu menu, String str, d30 d30Var, String str2) {
        m45094q1(z, z2, user, act, menu, str, d30Var, str2, 20);
    }

    /* JADX INFO: renamed from: q1 */
    public static void m45094q1(boolean z, boolean z2, User user, final Act act, Menu menu, final String str, final d30 d30Var, final String str2, int i) {
        if (z && z2) {
            CoreModule.m29934N().isMatchedByRelationship(user);
            if (user != null) {
                user.unilateralBlock();
            }
            if (!TextUtils.isEmpty(str) && NullChecker.m81303a(CoreModule.f17545c)) {
                CoreModule.f17545c.f19642f0.m32856Xe(str);
            }
            menu.add(0, 3, i, act.getString(R$string.f18066Qj)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.hl8
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return CoreDlg.m45006N(act, str, d30Var, str2, menuItem);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m45096r0(Act act, View view) {
        o6j0.m162859c("e_cheat_prevention_guide_click", "p_alert_cheat_prevention__risk_alarm_popup", o6j0.C18854a.m162878h("cheat_prevention_from", "risk_alarm_popup"));
        act.startActivity(WebViewAct.m80165a2(act, "", "https://live-web.tantanapp.com/anti_fraud_reminder/guide", true));
    }

    /* JADX INFO: renamed from: r1 */
    public static void m45097r1(Act act) {
        ic50.m135327j().m135333f().m145258s0(act, OmsDialog.p_verification_canceled_profile_avatar_popup.getIdentifier());
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m45099s0(f30 f30Var, StringBuilder sb, Throwable th) {
        f30Var.call("failed", sb.toString());
        bx6.m104283b(th);
    }

    /* JADX INFO: renamed from: s1 */
    public static void m45100s1(final Act act, final String str, final d30 d30Var, final d30 d30Var2) {
        User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str);
        String str2 = userM169430Pa == null ? "" : userM169430Pa.name;
        String strM169561y7 = CoreModule.f17545c.f19639e0.m169561y7(userM169430Pa.f56011id);
        if (!TextUtils.isEmpty(strM169561y7)) {
            str2 = strM169561y7;
        } else if (upa.m194819t1() && TextUtils.isEmpty(strM169561y7) && (!NullChecker.m81303a(userM169430Pa) || userM169430Pa.inactivated || userM169430Pa.status.contains(UserStatus.get(UserStatus.RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN)))) {
            str2 = "ta";
        }
        act.dialog().m20504F(String.format("是否要解除和%s的配对？", str2)).m20496B(false).m20560v0("解除", new Runnable() { // from class: l.io8
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                String str3 = str;
                act2.duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m32727Mg(str3), CoreModule.f17545c.f19642f0.m32679Ig(str3), new x9j() { // from class: l.no8
                    @Override // p149l.x9j
                    public final Object call(Object obj, Object obj2) {
                        return vwb.m200311Y((Boolean) obj, (Boolean) obj2);
                    }
                }).first()).subscribe(mkd0.m154955G(new e30() { // from class: l.oo8
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        CoreDlg.m44967A(str3, act2, d30Var, (j760) obj);
                    }
                }));
            }
        }).m20542l0(R$string.f18408c, new Runnable() { // from class: l.jo8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m45042Z(d30Var2, act);
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m45102t0(String str, Act act) {
        if (ruy.m181215g().m181218e(str)) {
            CoreModule.f17545c.f19642f0.m32650Fo();
        }
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: t1 */
    public static void m45103t1(final Act act, final String str, final d30 d30Var, final d30 d30Var2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(act.getString(R$string.f17976Nj));
        c40.C16057b c16057b = new c40.C16057b(act);
        c16057b.m105156I(act.getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.nl8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c40VarArr[0].m105113b();
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.ol8
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                CoreDlg.m45058e0(d30Var, act, str, c40VarArr, vListCell, c22545a, i);
            }
        }).m105167T(new DialogInterface.OnDismissListener() { // from class: l.pl8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoreDlg.m45040Y0(d30Var2, dialogInterface);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        final c40[] c40VarArr = {c40VarM105153F};
        c40VarM105153F.m105117f();
    }

    /* JADX INFO: renamed from: u1 */
    public static void m45106u1(Act act, String str, String str2) {
        m45109v1(act, str, null, null, null, str2);
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m45108v0(e30 e30Var, Conversation conversation, String str, String str2, Act act, c40[] c40VarArr, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        String str3;
        String string = c22545a.f209159a.toString();
        e30Var.call(string.toString());
        if (NullChecker.m81303a(conversation)) {
            o6j0.m162859c("e_cancelmatch", OMSDialogPositon.p_messages_view, o6j0.C18854a.m162878h("receiver_user_id", str), o6j0.C18854a.m162878h("source_type", str2), o6j0.C18854a.m162878h("cancel_item", string.toString()), o6j0.C18854a.m162878h("matchfrom", CoreModule.f17545c.f19639e0.m169415M7(str).matchFromForTrack()));
        }
        String string2 = string.toString();
        if (act.string(R$string.f19015vq).equals(string2)) {
            str3 = "dont_talk";
        } else if (act.string(R$string.f19135zq).equals(string2)) {
            str3 = "spam";
        } else if (act.string(R$string.f19105yq).equals(string2)) {
            str3 = "harassment";
        } else if (act.string(R$string.f19075xq).equals(string2)) {
            str3 = "fake_profile";
        } else if (act.string(R$string.f19045wq).equals(string2)) {
            str3 = "dont_want_to_tell_you";
        } else {
            str3 = act.string(R$string.f17593Aq).equals(string2) ? "swiped_wrong" : "";
        }
        zvf0.m220399u("e_chat_unmatch", "p_unmatch_dialog", vwb.m200311Y("unmatch_reason", str3));
        c40VarArr[0].m105113b();
    }

    /* JADX INFO: renamed from: v1 */
    public static void m45109v1(final Act act, final String str, final e30<String> e30Var, final d30 d30Var, final d30 d30Var2, final String str2) {
        final Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str);
        act.duringCreated(mkd0.m154984r(CoreModule.f17545c.f19642f0.m32727Mg(str), CoreModule.f17545c.f19642f0.m32691Jg(str), new x9j() { // from class: l.vn8
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return vwb.m200311Y((Boolean) obj, (Boolean) obj2);
            }
        }).first()).subscribe(mkd0.m154955G(new e30() { // from class: l.go8
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreDlg.m44970B(e30Var, str, act, d30Var2, str2, conversationM32856Xe, d30Var, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m45111w0(d30 d30Var) {
        zvf0.m220396r("e_user_profile_share_agreement_popup_confirm", "p_user_profile_share_agreement_popup");
        d30Var.call();
    }

    /* JADX INFO: renamed from: w1 */
    public static void m45112w1(Act act, final Media media) {
        if (zqx.m219898k()) {
            m45115x1(media);
        } else {
            PermissionHelper.m79882c().m79900r("android.permission.WRITE_EXTERNAL_STORAGE").m79905w(false).m79903u(true).m79895m(new d30() { // from class: l.ql8
                @Override // p149l.d30
                public final void call() {
                    CoreDlg.m45115x1(media);
                }
            }, new e30() { // from class: l.rl8
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreDlg.m45028U0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).m79891i(act);
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m45113x(dd80 dd80Var, View view) {
        dd80Var.dismiss();
        o6j0.m162859c("e_user_passive_popup_ok", "p_user_passive_popup", new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m45114x0(d30 d30Var, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m45115x1(Media media) {
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
            CrashHelper.m81296c(new Exception("downloadMediaWithPermission exception:" + e.getMessage(), e));
            str = null;
        }
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str)) {
            lsi0.m151578h(R$string.f18751n4);
            return;
        }
        DownloadTask downloadTaskM79626a = new DownloadTask.C13110b(qib0.f154693H.getDownloadHttp()).m79642q(str4).m79640o(str).m79635j(new f30() { // from class: l.dn8
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                e51.m114742G(new Runnable() { // from class: l.wn8
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreDlg.m45063g0(downloadTask, sb);
                    }
                });
            }
        }).m79631f(new f30() { // from class: l.en8
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                CoreDlg.m45013P0((DownloadTask) obj, (Throwable) obj2);
            }
        }).m79626a();
        if (C13111a.m79654u().m79674y(downloadTaskM79626a.m79623x())) {
            lsi0.m151578h(R$string.f17773Gq);
        } else {
            C13111a.m79654u().m79665o(downloadTaskM79626a);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m45117y0(String str, PutongAct putongAct, String str2, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (str.equals(charSequence)) {
            zvf0.m220399u("e_age_verify_photo_upload_type", "p_age_verify_photo_upload_type_popup", vwb.m200311Y("select_photo_way", "select_from_album"));
            putongAct.pickImagesWithPicker(1, false, false, false);
        } else if (str2.equals(charSequence)) {
            zvf0.m220399u("e_age_verify_photo_upload_type", "p_age_verify_photo_upload_type_popup", vwb.m200311Y("select_photo_way", "take_photo"));
            oyx.m166738l(putongAct);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public static void m45118y1(Act act, User user, final boolean z, final Runnable runnable, final Runnable runnable2) {
        int i;
        if (z) {
            i = TEnum.equals(user.gender, "male") ? R$string.f17750G3 : R$string.f17720F3;
        } else {
            i = TEnum.equals(user.gender, "male") ? R$string.f17630C3 : R$string.f17600B3;
        }
        if (z) {
            ygh0.m214644C();
        } else {
            ygh0.m214707z();
        }
        if (!IntlCountryCodeController.m28126v() && !vy8.m200609g()) {
            act.dialog().m20496B(true).m20494A(new DialogInterface.OnCancelListener() { // from class: l.fn8
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    CoreDlg.m45034W0(runnable, dialogInterface);
                }
            }).m20557u().m20553s().m20533c0(z ? x2c0.f189559Mr : x2c0.f189497Kr).m20507G0(act.getResources().getString(z ? R$string.f17780H3 : R$string.f17660D3)).m20502E(i, user.name).m20542l0(R$string.f18408c, new Runnable() { // from class: l.gn8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreDlg.m45004M0(runnable, z);
                }
            }).m20556t0(z ? R$string.f17690E3 : R$string.f17570A3, new Runnable() { // from class: l.hn8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreDlg.m45007N0(z, runnable2);
                }
            }).m20568z0();
            return;
        }
        int i2 = z ? R$string.f18466dr : R$string.f18436cr;
        int i3 = z ? R$string.f17690E3 : R$string.f17570A3;
        final Dialog dialogM20567z = act.dialog().m20496B(false).m20517M(f6c0.f95867kf).m20557u().m20567z();
        dialogM20567z.setCanceledOnTouchOutside(false);
        View viewM20458P = dialogM20567z.m20458P();
        VImage vImage = (VImage) viewM20458P.findViewById(u4c0.f173909L5);
        VText vText = (VText) viewM20458P.findViewById(u4c0.f173904L0);
        VText vText2 = (VText) viewM20458P.findViewById(u4c0.f174268ge);
        VText vText3 = (VText) viewM20458P.findViewById(u4c0.f173973P1);
        vText2.setText(i2);
        vText3.setText(dialogM20567z.getContext().getString(i, user.name));
        vText.setText(i3);
        vImage.setImageResource(z ? x2c0.f189590Nr : x2c0.f189528Lr);
        vText.setOnClickListener(new View.OnClickListener() { // from class: l.in8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m44977D0(z, runnable2, dialogM20567z, view);
            }
        });
        dialogM20567z.show();
    }

    /* JADX INFO: renamed from: z1 */
    public static CharSequence m45121z1(Act act, boolean z, int i, int i2) {
        String string = act.getString(i);
        if (!z || i2 <= 0) {
            return string;
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(string).append((CharSequence) MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        BitmapDrawable bitmapDrawable = new BitmapDrawable(act.getResources(), BitmapFactory.decodeResource(act.getResources(), i2));
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        spannableStringBuilderAppend.setSpan(new ruw(bitmapDrawable, t100.m186890d(8.0f)), spannableStringBuilderAppend.length() - 1, spannableStringBuilderAppend.length(), 17);
        return spannableStringBuilderAppend;
    }
}
