package com.p000p1.mobile.putong.core.p001ui.dlg;

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
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p000p1.mobile.putong.core.data.Active;
import com.p000p1.mobile.putong.core.data.Conversation;
import com.p000p1.mobile.putong.core.data.CoreGiftPanelName;
import com.p000p1.mobile.putong.core.data.Message;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.Reason;
import com.p000p1.mobile.putong.core.data.ReportFrom;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.p001ui.dlg.CoreDlg;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.a;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.newui.messages.SetNicknameAct;
import com.p1.mobile.putong.core.newui.messages.b;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.report.ReportAct;
import com.p1.mobile.putong.core.ui.settings.PersonalDetailsAct;
import com.p1.mobile.putong.core.ui.settings.SetTickleAct;
import com.p1.mobile.putong.core.ui.verification.AgeVerificationDoubleGuideView;
import com.p1.mobile.putong.core.ui.verification.AgeVerificationSingleGuideView;
import com.p1.mobile.putong.core.ui.vip.widget.IntlLetterSendPanel;
import com.p1.mobile.putong.data.Converter;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.IdBoxed;
import com.p1.mobile.putong.data.Link;
import com.p1.mobile.putong.data.LinkChannel;
import com.p1.mobile.putong.data.LinkIntent;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.Picture;
import com.p1.mobile.putong.data.Report;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserStatus;
import com.p1.mobile.putong.data.Video;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.ui.download.DownloadTask;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.p1.mobile.putong.ui.share.ShareHelper;
import com.p1.mobile.putong.ui.webview.WebViewAct;
import com.tantanapp.common.data.DbObject;
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
import l.ane0;
import l.bx6;
import l.c40;
import l.cwf0;
import l.d30;
import l.dd80;
import l.dyd;
import l.e30;
import l.e51;
import l.eqh0;
import l.f30;
import l.f6c0;
import l.hfw;
import l.hrb;
import l.i0e;
import l.i0g0;
import l.ic50;
import l.it6;
import l.j760;
import l.knb0;
import l.lsi0;
import l.mkd0;
import l.n3b0;
import l.o7r;
import l.oyx;
import l.ozb0;
import l.p4c0;
import l.pvv;
import l.q860;
import l.qib0;
import l.roj0;
import l.ruw;
import l.ruy;
import l.rza;
import l.t100;
import l.u4c0;
import l.upa;
import l.v7c0;
import l.v9j;
import l.vwb;
import l.vy8;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.x9j;
import l.xdl0;
import l.xh0;
import l.yij0;
import l.zb0;
import l.zqx;
import l.zvf0;
import org.json.JSONException;
import org.json.JSONObject;
import p003l.o6j0;
import p003l.s4e;
import p003l.wvv;
import p003l.ygh0;
import rx.c;
import v.VButton;
import v.VDraweeView;
import v.VImage;
import v.VListCell;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
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
    public class C3088a implements a.a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f1295a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Act f1296b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ d30 f1297c;

        public C3088a(int i, Act act, d30 d30Var) {
            this.f1295a = i;
            this.f1296b = act;
            this.f1297c = d30Var;
        }

        /* JADX INFO: renamed from: a */
        public boolean m2438a(int i, int i2, Intent intent) {
            if (i != this.f1295a) {
                return false;
            }
            this.f1296b.unregisterOnActivityResultListener(this);
            if (!NullChecker.a(this.f1297c)) {
                return false;
            }
            this.f1297c.call();
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.dlg.CoreDlg$b */
    public class ViewOnLayoutChangeListenerC3089b implements View.OnLayoutChangeListener {

        /* JADX INFO: renamed from: a */
        public boolean f1298a = true;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ScrollView f1299b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ IntlLetterSendPanel f1300c;

        public ViewOnLayoutChangeListenerC3089b(ScrollView scrollView, IntlLetterSendPanel intlLetterSendPanel) {
            this.f1299b = scrollView;
            this.f1300c = intlLetterSendPanel;
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m2440b(ScrollView scrollView, IntlLetterSendPanel intlLetterSendPanel) {
            scrollView.fullScroll(130);
            if (!this.f1298a) {
                intlLetterSendPanel.e.requestFocus();
            }
            this.f1298a = false;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            final ScrollView scrollView = this.f1299b;
            final IntlLetterSendPanel intlLetterSendPanel = this.f1300c;
            scrollView.post(new Runnable() { // from class: l.so8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7419a.m2440b(scrollView, intlLetterSendPanel);
                }
            });
        }
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m2283A(final String str, final Act act, final d30 d30Var, j760 j760Var) {
        User userById = CoreModule.N().getUserById(str);
        if (!CoreModule.N().isMatchedByRelationship(userById) && CoreModule.N().isMatchedByFollowship(userById)) {
            CoreModule.N().following(CoreModule.H().userId(), userById, false, (String) null, (String) null).subscribe(mkd0.H(new e30() { // from class: l.tk8
                public final void call(Object obj) {
                    CoreDlg.m2405p(act, d30Var, (Followship) obj);
                }
            }, new e30() { // from class: l.uk8
                public final void call(Object obj) {
                    CoreDlg.m2384i(act, (Throwable) obj);
                }
            }));
        } else {
            act.progress(R.string.J5, true);
            CoreModule.c.f0.qe(str, act).subscribe(mkd0.H(new e30() { // from class: l.vk8
                public final void call(Object obj) {
                    CoreDlg.m2402o(str, act, d30Var, (roj0) obj);
                }
            }, new e30() { // from class: l.wk8
                public final void call(Object obj) {
                    CoreDlg.m2338S0(act, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: A0 */
    public static /* synthetic */ void m2284A0(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: A1 */
    public static void m2285A1(Menu menu, String str, Act act, d30 d30Var) {
        m2395l1(true, false, menu, str, act, true, null, 10, null);
        m2383h1(act, menu, d30Var);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m2286B(final e30 e30Var, final String str, final Act act, final d30 d30Var, final String str2, final Conversation conversation, final d30 d30Var2, j760 j760Var) {
        final e30 e30Var2 = new e30() { // from class: l.xk8
            public final void call(Object obj) {
                CoreDlg.m2372d1(e30Var, str, act, d30Var, (String) obj);
            }
        };
        ArrayList arrayList = new ArrayList();
        if (((Boolean) j760Var.a).booleanValue()) {
            arrayList.add(act.string(R.string.zq));
            arrayList.add(act.string(R.string.yq));
        } else {
            arrayList.add(act.string(R.string.vq));
        }
        if (!((Boolean) j760Var.b).booleanValue()) {
            arrayList.add(act.string(R.string.Aq));
        }
        arrayList.add(act.string(R.string.xq));
        arrayList.add(act.string(R.string.wq));
        final cwf0 cwf0VarC = i0e.c("p_unmatch_dialog", Dialog.class.getName());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("tooltips_trigger_mode", Active.TYPE);
            if (NullChecker.a(str2)) {
                jSONObject.put("unmatch_dialog_show_from", str2);
            }
        } catch (JSONException e) {
            CrashHelper.c(e);
        }
        cwf0VarC.o(jSONObject);
        c40.b bVar = new c40.b(act);
        bVar.M(R.string.Bq).K(R.string.uq);
        bVar.H(R.string.c).U(new View.OnClickListener() { // from class: l.yk8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c40VarArr[0].b();
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.zk8
            /* JADX INFO: renamed from: a */
            public final void m11430a(VListCell vListCell, VListCell.a aVar, int i) {
                CoreDlg.m2424v0(e30Var2, conversation, str, str2, act, c40VarArr, vListCell, aVar, i);
            }
        }).S(new DialogInterface.OnCancelListener() { // from class: l.al8
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                CoreDlg.m2430x0(d30Var2, dialogInterface);
            }
        }).T(new DialogInterface.OnDismissListener() { // from class: l.bl8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).W(new DialogInterface.OnShowListener() { // from class: l.cl8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        });
        c40 c40VarF = bVar.F();
        final c40[] c40VarArr = {c40VarF};
        c40VarF.f();
    }

    /* JADX INFO: renamed from: B1 */
    public static boolean m2288B1(User user) {
        if (user == null || user.localRelationship == null) {
            return false;
        }
        return user.letter() || user.likedMe() || user.superLikedMe();
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m2289C(Set set, VButton vButton, Set set2) {
        set.clear();
        set.addAll(set2);
        vButton.setEnabled(!set.isEmpty());
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ boolean m2290C0(final Act act, String str, final boolean z, final d30 d30Var, ProfileMenuBuildParam profileMenuBuildParam, MenuItem menuItem) {
        act.startActivity(ReportAct.b2(act, str, z, new ResultReceiver(null) { // from class: com.p1.mobile.putong.core.ui.dlg.CoreDlg.1
            @Override // android.os.ResultReceiver
            public void onReceiveResult(int i, Bundle bundle) {
                if (i == -1) {
                    if (!z) {
                        if (NullChecker.a(d30Var)) {
                            d30Var.call();
                        } else {
                            act.setResult(SwipeDirection.LEFT.getValue());
                            act.finish();
                        }
                    }
                    bundle.getString(Reason.TYPE);
                }
            }
        }, profileMenuBuildParam));
        return true;
    }

    /* JADX INFO: renamed from: C1 */
    public static c m2291C1(Act act, String str, String str2, ArrayList<LinkChannel> arrayList) {
        Link link = new Link();
        link.intent = LinkIntent.get("invite");
        link.resources = vwb.f0(new IdBoxed[]{new IdBoxed(CoreModule.H().userId(), "user")});
        link.href = "https://int.tantanapp.com";
        link.channel = LinkChannel.get("wechat-moments");
        return new ShareHelper(link, str).w0(act, act.getString(R.string.Ug), str2, arrayList, true);
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m2292D(e30 e30Var, android.app.Dialog dialog, String str) {
        e30Var.call(str);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: D0 */
    public static /* synthetic */ void m2293D0(boolean z, Runnable runnable, Dialog dialog, View view) {
        if (z) {
            ygh0.m11177A();
        } else {
            ygh0.m11240x();
        }
        runnable.run();
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: D1 */
    public static c m2294D1(Act act, String str, ArrayList<LinkChannel> arrayList) {
        return m2291C1(act, str, act.getString(R.string.bt), arrayList);
    }

    /* JADX INFO: renamed from: E1 */
    public static void m2297E1(Act act, String str, CharSequence charSequence, int i, String str2, d30 d30Var, boolean z, String str3, d30 d30Var2, d30 d30Var3) {
        m2300F1(act, str, charSequence, i, str2, d30Var, z, str3, d30Var2, d30Var3, null, true, false, null, null);
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m2298F(d30 d30Var, User user) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        o6j0.m8403c("e_alert_dislike_who_liked_me_like", "p_alert_dislike_who_liked_me_popup", o6j0.C3390a.m8422h("receiver_user_id", ((DbObject) user).id));
    }

    /* JADX INFO: renamed from: F1 */
    public static void m2300F1(Act act, String str, CharSequence charSequence, int i, String str2, d30 d30Var, boolean z, String str3, d30 d30Var2, d30 d30Var3, @Nullable User user, boolean z2, boolean z3, String str4, d30 d30Var4) {
        m2303G1(act, str, charSequence, i, str2, d30Var, z, str3, d30Var2, d30Var3, user, z2, z3, str4, d30Var4, false);
    }

    /* JADX INFO: renamed from: G0 */
    public static /* synthetic */ boolean m2302G0(Act act, String str, MenuItem menuItem) {
        act.startActivity(SetTickleAct.Z1(act, str));
        return true;
    }

    /* JADX INFO: renamed from: G1 */
    public static void m2303G1(Act act, String str, CharSequence charSequence, int i, String str2, d30 d30Var, boolean z, String str3, d30 d30Var2, d30 d30Var3, @Nullable User user, boolean z2, boolean z3, String str4, d30 d30Var4, boolean z4) {
        String str5;
        cwf0 cwf0VarC;
        if (TextUtils.isEmpty(str4)) {
            str5 = str4;
            cwf0VarC = null;
        } else {
            str5 = str4;
            cwf0VarC = i0e.c(str5, "pic_verification_dialog");
        }
        m2306H1(act, str, charSequence, i, str2, d30Var, z, str3, d30Var2, d30Var3, user, z2, z3, str5, d30Var4, cwf0VarC);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m2304H(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m2305H0(d30 d30Var) {
        zvf0.r("e_user_profile_share_agreement_popup_cancel", "p_user_profile_share_agreement_popup");
        d30Var.call();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0055  */
    /* JADX WARN: Code duplicated, block: B:33:0x00b4  */
    /* JADX INFO: renamed from: H1 */
    public static void m2306H1(Act act, String str, CharSequence charSequence, int i, String str2, final d30 d30Var, boolean z, String str3, final d30 d30Var2, final d30 d30Var3, @Nullable User user, boolean z2, boolean z3, final String str4, final d30 d30Var4, final cwf0 cwf0Var) {
        boolean z4;
        dd80 dd80VarO;
        int i2;
        dd80.a aVarC0 = act.newDialog().y0(str).t0(new SpannableStringBuilder(charSequence)).S(i).P(z2).n0(new DialogInterface.OnDismissListener() { // from class: l.rm8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoreDlg.m2388j0(str4, cwf0Var, dialogInterface);
            }
        }).c0(str2, new Runnable() { // from class: l.sm8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m2304H(d30Var);
            }
        });
        if (z) {
            aVarC0.X(str3, new Runnable() { // from class: l.tm8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreDlg.m2340T(d30Var2);
                }
            });
        }
        if (z) {
            z4 = true;
            if (!z3 ? xdl0.w0() > 900 : xdl0.w0() > 1200) {
                z4 = false;
            }
        } else {
            z4 = false;
        }
        if (NullChecker.a(user)) {
            View viewInflate = act.inflater().inflate(f6c0.qe, (ViewGroup) null);
            VImage vImageFindViewById = viewInflate.findViewById(u4c0.Xe);
            user.showPicVerificationIcon(vImageFindViewById, vImageFindViewById);
            if (z4) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) ((FrameLayout) viewInflate.findViewById(u4c0.Oa)).getLayoutParams();
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
                layoutParams.topMargin = t100.d(i2);
            }
            qib0.G.J0(viewInflate.findViewById(u4c0.Na), user.fp().profileMiddle(), false);
            dd80VarO = aVarC0.R(viewInflate).O();
        } else {
            if (z4 && z3) {
                String language2 = Locale.getDefault().getLanguage();
                if (!"ja".equals(language2) && !"in".equals(language2) && !"id".equals(language2)) {
                    "en".equals(language2);
                }
            }
            dd80VarO = aVarC0.S(i).O();
        }
        if (NullChecker.a(d30Var3)) {
            dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.um8
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    CoreDlg.m2362a1(d30Var3, d30Var4, dialogInterface);
                }
            });
        }
        if (!TextUtils.isEmpty(str4)) {
            i0e.f(cwf0Var);
        }
        dd80VarO.show();
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m2307I(Dialog dialog, d30 d30Var) {
        dialog.dismiss();
        d30Var.call();
    }

    /* JADX INFO: renamed from: I1 */
    public static void m2309I1(final Act act, v9j<Double> v9jVar, final e30<Double> e30Var, final e30<Boolean> e30Var2) {
        Date date = new Date((long) ((Double) v9jVar.call()).doubleValue());
        DatePickerDialog datePickerDialogH4 = DatePickerDialog.h4(new DatePickerDialog.d() { // from class: l.bn8
            /* JADX INFO: renamed from: a */
            public final void m5747a(DatePickerDialog datePickerDialog, int i, int i2, int i3) {
                CoreDlg.m2328P(e30Var2, e30Var, datePickerDialog, i, i2, i3);
            }
        }, date.getYear() + 1900, date.getMonth(), date.getDate(), true);
        datePickerDialogH4.o4(true);
        datePickerDialogH4.L1(new DatePickerDialog.c() { // from class: l.cn8
            /* JADX INFO: renamed from: a */
            public final void m5970a() {
                CoreDlg.m2369c1(act);
            }
        });
        datePickerDialogH4.l4(act.string(R.string.T));
        datePickerDialogH4.j4(act.string(R.string.c));
        datePickerDialogH4.show(act.getSupportFragmentManager(), "dpd");
    }

    /* JADX INFO: renamed from: J0 */
    public static /* synthetic */ void m2311J0(Act act) {
        CoreModule.c.f0.o0.put(Boolean.TRUE);
        o6j0.m8403c("e_cheat_prevention_guide_click", "p_alert_cheat_prevention__tips_popup", o6j0.C3390a.m8422h("cheat_prevention_from", "tips_popup"));
        o6j0.m8403c("e_alert_cheat_prevention__tips_click", "p_alert_cheat_prevention__tips_popup", o6j0.C3390a.m8422h("no_prompt_again", "yes"));
        act.startActivity(WebViewAct.a2(act, "", "https://live-web.tantanapp.com/anti_fraud_reminder/guide", true));
    }

    /* JADX INFO: renamed from: J1 */
    public static void m2312J1(Menu menu, String str, Act act, boolean z, boolean z2, String str2, d30 d30Var, d30 d30Var2, String str3) {
        m2315K1(menu, str, act, z, z2, str2, d30Var, d30Var2, true, false, str3);
    }

    /* JADX INFO: renamed from: K0 */
    public static /* synthetic */ void m2314K0(Act act, roj0 roj0Var) {
        act.progressDismiss();
        lsi0.y(it6.b(R.string.dm, R.string.Sl));
    }

    /* JADX INFO: renamed from: K1 */
    public static void m2315K1(Menu menu, String str, Act act, boolean z, boolean z2, String str2, d30 d30Var, d30 d30Var2, boolean z3, boolean z4, String str3) {
        m2318L1(menu, str, act, z, z2, str2, d30Var, d30Var2, z3, z4, str3, null);
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m2316L(VText vText, b bVar, q860 q860Var) {
        xdl0.M(vText, vwb.J(q860Var.a));
        bVar.G(q860Var.a);
    }

    /* JADX INFO: renamed from: L0 */
    public static /* synthetic */ void m2317L0(cwf0 cwf0Var, f30 f30Var, StringBuilder sb, BottomSheetDialog bottomSheetDialog, roj0 roj0Var) {
        i0e.e(cwf0Var);
        f30Var.call("success", sb.toString());
        bottomSheetDialog.dismiss();
        CoreModule.c.f0.Fo();
    }

    /* JADX INFO: renamed from: L1 */
    public static void m2318L1(Menu menu, String str, Act act, boolean z, boolean z2, String str2, d30 d30Var, d30 d30Var2, boolean z3, boolean z4, String str3, ProfileMenuBuildParam profileMenuBuildParam) {
        User user;
        User userPa = CoreModule.c.e0.Pa(str);
        if (userPa == null) {
            userPa = CoreModule.K().getUserById(str);
        }
        User user2 = userPa;
        boolean z5 = (user2 == null || ((DbObject) user2).id.equals(CoreModule.H().userId()) || user2.isTeamAccount()) ? false : true;
        if (z5 || z) {
            if (NullChecker.a(user2) && (act instanceof MessagesAct) && !user2.isTeamAccount()) {
                m2398m1(act, menu, str);
            }
            m2392k1(z5, z2, menu, str, act, d30Var, profileMenuBuildParam);
            m2386i1(z, menu, str, act);
            if (z3) {
                user = user2;
                m2407p1(z5, z2, user, act, menu, str, d30Var2, str3);
            } else {
                user = user2;
            }
            if (z4 && NullChecker.a(user) && !user.isTeamAccount()) {
                m2404o1(act, menu, ((DbObject) user).id);
            }
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m2319M(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: M0 */
    public static /* synthetic */ void m2320M0(Runnable runnable, boolean z) {
        runnable.run();
        if (z) {
            ygh0.m11178B();
        } else {
            ygh0.m11241y();
        }
    }

    /* JADX INFO: renamed from: M1 */
    public static void m2321M1(Act act, Media media, Message message) {
        final List<j760<String, Runnable>> listM2324N1 = m2324N1(act, media, message);
        ArrayList arrayList = new ArrayList();
        Iterator<j760<String, Runnable>> it = listM2324N1.iterator();
        while (it.hasNext()) {
            arrayList.add((CharSequence) it.next().a);
        }
        c40 c40VarF = new c40.b(act).I(act.getString(R.string.c)).U(new View.OnClickListener() { // from class: l.co8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c40VarArr[0].b();
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.do8
            /* JADX INFO: renamed from: a */
            public final void m6182a(VListCell vListCell, VListCell.a aVar, int i) {
                CoreDlg.m2387j(listM2324N1, c40VarArr, vListCell, aVar, i);
            }
        }).F();
        c40VarF.f();
        final c40[] c40VarArr = {c40VarF};
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ boolean m2322N(Act act, String str, d30 d30Var, String str2, MenuItem menuItem) {
        m2425v1(act, str, null, null, d30Var, str2);
        return true;
    }

    /* JADX INFO: renamed from: N0 */
    public static /* synthetic */ void m2323N0(boolean z, Runnable runnable) {
        if (z) {
            ygh0.m11177A();
        } else {
            ygh0.m11240x();
        }
        runnable.run();
    }

    /* JADX INFO: renamed from: N1 */
    public static List<j760<String, Runnable>> m2324N1(final Act act, final Media media, final Message message) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.Y(CoreModule.b.getString(R.string.u), new Runnable() { // from class: l.ko8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m2428w1(act, media);
            }
        }));
        if (NullChecker.a(message) && !message.isGroupMessage() && !message.isMe() && !((Boolean) vwb.X(CoreModule.c.e0.Pa(message.owner), new w9j() { // from class: l.lo8
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).isTeamAccount());
            }
        }, Boolean.FALSE)).booleanValue()) {
            arrayList.add(vwb.Y(CoreModule.b.getString(media instanceof Video ? R.string.Pj : R.string.Oj), new Runnable() { // from class: l.mo8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreDlg.m2355Y(act, message);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: O1 */
    public static List<knb0<String, Runnable, Integer, Void>> m2327O1(final Act act, final Media media, final Message message) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.Z(CoreModule.b.getString(R.string.u), new Runnable() { // from class: l.dm8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m2428w1(act, media);
            }
        }, Integer.valueOf(x2c0.re), (Object) null));
        if (NullChecker.a(message) && !message.isGroupMessage() && !message.isMe() && !((Boolean) vwb.X(CoreModule.c.e0.Pa(message.owner), new w9j() { // from class: l.om8
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).isTeamAccount());
            }
        }, Boolean.FALSE)).booleanValue()) {
            boolean z = media instanceof Video;
            arrayList.add(vwb.Z(CoreModule.b.getString(z ? R.string.Pj : R.string.Oj), new Runnable() { // from class: l.zm8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreDlg.m2381h(act, message);
                }
            }, Integer.valueOf(z ? x2c0.qe : x2c0.qe), (Object) null));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m2328P(e30 e30Var, e30 e30Var2, DatePickerDialog datePickerDialog, int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Converter.CALENDAR.get();
        gregorianCalendar.set(i, i2, i3, 0, 0, 0);
        gregorianCalendar.set(14, 0);
        Date time = gregorianCalendar.getTime();
        if (time.compareTo(yij0.V()) > 0) {
            lsi0.h(R.string.u9);
            if (NullChecker.a(e30Var)) {
                e30Var.call(Boolean.TRUE);
                return;
            }
            return;
        }
        if (time.compareTo(yij0.N()) >= 0) {
            e30Var2.call(Double.valueOf(time.getTime()));
            return;
        }
        lsi0.h(R.string.t9);
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: P0 */
    public static /* synthetic */ void m2329P0(DownloadTask downloadTask, Throwable th) {
        lsi0.h(R.string.n4);
        CrashHelper.d(new Exception("downloadMedia Fail exception:" + th.getMessage(), th), 50);
    }

    /* JADX INFO: renamed from: P1 */
    public static BottomSheetDialog m2330P1(Act act, final String str, String str2, String str3, int i, String str4, String str5, final String str6, List<String> list, String str7, final f30<String, String> f30Var) {
        List<String> arrayList = list == null ? new ArrayList<>() : list;
        final cwf0 cwf0VarC = i0e.c("p_friends_list", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("share_source", str7)});
        final BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(act);
        View viewInflate = o7r.a(act).inflate(f6c0.Pb, (ViewGroup) null);
        bottomSheetDialog.setContentView(viewInflate);
        Window window = bottomSheetDialog.getWindow();
        if (NullChecker.a(window)) {
            window.findViewById(p4c0.E).setBackgroundResource(w0c0.U1);
        }
        VText vTextFindViewById = viewInflate.findViewById(u4c0.ge);
        VText vTextFindViewById2 = viewInflate.findViewById(u4c0.Zc);
        final VButton vButtonFindViewById = viewInflate.findViewById(u4c0.F0);
        final VText vTextFindViewById3 = viewInflate.findViewById(u4c0.v3);
        vTextFindViewById.setText(str2);
        if (TextUtils.isEmpty(str3)) {
            xdl0.M(vTextFindViewById2, false);
        } else {
            vTextFindViewById2.setText(str3);
        }
        vButtonFindViewById.setEnabled(false);
        vButtonFindViewById.setText(str4);
        VRecyclerView vRecyclerViewFindViewById = viewInflate.findViewById(u4c0.B4);
        vRecyclerViewFindViewById.setLayoutManager(new LinearLayoutManager(act, 1, false));
        final b bVar = new b(act, i, str5);
        final HashSet hashSet = new HashSet();
        bVar.H(new b.a() { // from class: l.em8
            /* JADX INFO: renamed from: a */
            public final void m6306a(Set set) {
                CoreDlg.m2289C(hashSet, vButtonFindViewById, set);
            }
        });
        vRecyclerViewFindViewById.setAdapter(bVar);
        act.duringCreated(CoreModule.c.f0.pn(arrayList)).subscribe(mkd0.G(new e30() { // from class: l.fm8
            public final void call(Object obj) {
                CoreDlg.m2316L(vTextFindViewById3, bVar, (q860) obj);
            }
        }));
        i0e.f(cwf0VarC);
        bottomSheetDialog.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gm8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        });
        bottomSheetDialog.getBehavior().setState(3);
        bottomSheetDialog.getBehavior().setSkipCollapsed(true);
        bottomSheetDialog.show();
        xdl0.E0(vButtonFindViewById, new View.OnClickListener() { // from class: l.hm8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m2359Z0(hashSet, str, str6, cwf0VarC, f30Var, bottomSheetDialog, view);
            }
        });
        return bottomSheetDialog;
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ boolean m2332Q0(Act act, String str, MenuItem menuItem) {
        m2419t1(act, str, null, null);
        return true;
    }

    /* JADX INFO: renamed from: Q1 */
    public static void m2333Q1(Act act, String str, String str2, String str3, int i, String str4, String str5, String str6, String str7, f30<String, String> f30Var) {
        m2330P1(act, str, str2, str3, i, str4, str5, str6, new ArrayList(), str7, f30Var);
    }

    /* JADX INFO: renamed from: R */
    public static /* synthetic */ void m2334R(String str, Act act, d30 d30Var, roj0 roj0Var) {
        CoreModule.N().updateUserOnBlock(str);
        act.progressDismiss();
        CoreModule.c.e0.J1.onNext(str);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        List listD = CoreModule.N().coreMomentMutedUsers().d();
        if (listD == null) {
            listD = new ArrayList();
        }
        CoreModule.N().coreMomentMutedUsers().e(vwb.c0(listD, str));
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ void m2335R0(dd80 dd80Var, View view) {
        o6j0.m8403c("e_alert_cheat_prevention__risk_alarm_click", "p_alert_cheat_prevention__risk_alarm_popup", new o6j0.C3390a[0]);
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: R1 */
    public static void m2336R1(Act act, String str, String str2, String str3, int i, String str4, String str5, String str6, f30<String, String> f30Var) {
        m2330P1(act, str, str2, str3, i, str4, str5, str6, new ArrayList(), "", f30Var);
    }

    /* JADX INFO: renamed from: S0 */
    public static /* synthetic */ void m2338S0(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: S1 */
    public static void m2339S1(final Act act, boolean z) {
        final cwf0 cwf0VarC = i0e.c("p_alert_cheat_prevention__risk_alarm_popup", Dialog.class.getName());
        cwf0VarC.p(ic50.j().f().V(OmsDialog.alert_cheat_risk_alarm_popup.getIdentifier(), new j760[]{j760.a("tooltips_trigger_mode", z ? Active.TYPE : "passive"), j760.a("tooltips_type_ui", "alert_self_definition_basic"), j760.a("tooltips_trigger_page", "swipe_page"), j760.a("tooltips_trigger_module", "null"), j760.a("tooltips_trigger_reason", "cheat_prevention")}));
        View viewInflate = o7r.a(act).inflate(f6c0.Jb, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.Zc);
        VButton vButtonFindViewById = viewInflate.findViewById(u4c0.xa);
        final VButton vButtonFindViewById2 = viewInflate.findViewById(u4c0.Zd);
        vTextFindViewById.setText(i0g0.b0("你的好友中有疑似境外诈骗团伙，TA已被探探封禁并从你的好友列表中移除！请尽快搜索了解“杀猪盘”欺诈信息，不要参与任何赌博，竞猜，彩票，虚拟货币等项目，如有任何异常，请及时在“设置页”“帮助与反馈”中举报", vwb.M("已被探探封禁并从你的好友列表中移除"), act.getResources().getColor(w0c0.I), eqh0.c(2)));
        final dd80 dd80VarO = new dd80.a(act).R(viewInflate).P(false).M(false).n0(new DialogInterface.OnDismissListener() { // from class: l.gl8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).O();
        vButtonFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.il8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m2412r0(act, view);
            }
        });
        vButtonFindViewById2.setText("10s");
        vButtonFindViewById2.setEnabled(false);
        vButtonFindViewById2.setStateListAnimator(AnimatorInflater.loadStateListAnimator(CoreModule.b, ozb0.e));
        act.duringCreated(e51.N(act.getLocalClassName(), 10), false).subscribe(mkd0.G(new e30() { // from class: l.jl8
            public final void call(Object obj) {
                CoreDlg.m2366b1(vButtonFindViewById2, act, dd80VarO, (Long) obj);
            }
        }));
        dd80VarO.show();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m2340T(d30 d30Var) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: T1 */
    public static void m2342T1(final Act act) {
        final cwf0 cwf0VarC = i0e.c("p_alert_cheat_prevention__tips_popup", Dialog.class.getName());
        cwf0VarC.p(ic50.j().f().V(OmsDialog.alert_cheat_tips_popup.getIdentifier(), new j760[]{j760.a("tooltips_trigger_mode", Active.TYPE), j760.a("tooltips_type_ui", "alert_self_definition_basic"), j760.a("tooltips_trigger_page", "message_list_page"), j760.a("tooltips_trigger_module", "null"), j760.a("tooltips_trigger_reason", "cheat_prevention")}));
        View viewInflate = o7r.a(act).inflate(f6c0.Jb, (ViewGroup) null);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.ge);
        VText vTextFindViewById2 = viewInflate.findViewById(u4c0.Zc);
        VButton vButtonFindViewById = viewInflate.findViewById(u4c0.xa);
        VButton vButtonFindViewById2 = viewInflate.findViewById(u4c0.Zd);
        xdl0.M(vButtonFindViewById, false);
        xdl0.M(vButtonFindViewById2, false);
        vTextFindViewById.setText("温馨提示");
        vTextFindViewById2.setText(i0g0.b0("系统检测到你的好友列表中有企图诈骗用户，TA已被探探封禁并从你的好友列表中移除！聊天过程中如果涉及任何资金往来，请注意提高警惕", vwb.f0(new String[]{"企图诈骗用户", "涉及任何资金往来"}), act.getResources().getColor(w0c0.I), eqh0.c(2)));
        final dd80 dd80VarO = new dd80.a(act).R(viewInflate).b0("了解更多防骗技巧").W("知道啦").P(false).M(false).n0(new DialogInterface.OnDismissListener() { // from class: l.wl8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).O();
        dd80VarO.W(new Runnable() { // from class: l.xl8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m2311J0(act);
            }
        });
        dd80VarO.V(new Runnable() { // from class: l.yl8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m2380g1(dd80VarO);
            }
        });
        dd80VarO.show();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m2343U(cwf0 cwf0Var, DialogInterface dialogInterface) {
        ic50.j().f().b0(OmsDialog.p_user_passive_show_chat.getIdentifier(), 0, false);
        i0e.f(cwf0Var);
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m2344U0(PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
    }

    /* JADX INFO: renamed from: U1 */
    public static void m2345U1(final Act act, User user, final e30<String> e30Var, final d30 d30Var) {
        final android.app.Dialog dialog = new android.app.Dialog(act, v7c0.z);
        final cwf0 cwf0VarC = i0e.c("p_choose_letter_or_superlike", dialog.getClass().getName());
        dialog.setCancelable(true);
        dialog.setCanceledOnTouchOutside(true);
        ScrollView scrollView = (ScrollView) act.inflater().inflate(f6c0.zd, (ViewGroup) null, false);
        IntlLetterSendPanel intlLetterSendPanelFindViewById = scrollView.findViewById(u4c0.S6);
        intlLetterSendPanelFindViewById.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC3089b(scrollView, intlLetterSendPanelFindViewById));
        if (NullChecker.a(e30Var)) {
            intlLetterSendPanelFindViewById.setSendClickCallBack(new e30() { // from class: l.vm8
                public final void call(Object obj) {
                    CoreDlg.m2292D(e30Var, dialog, (String) obj);
                }
            });
        }
        if (NullChecker.a(d30Var)) {
            intlLetterSendPanelFindViewById.setSuperLikeClickCallBack(new d30() { // from class: l.wm8
                public final void call() {
                    CoreDlg.m2396m(d30Var, dialog);
                }
            });
        }
        intlLetterSendPanelFindViewById.setCloseCallBack(new hrb(dialog));
        dialog.setContentView(scrollView);
        ViewGroup.LayoutParams layoutParams = intlLetterSendPanelFindViewById.getLayoutParams();
        layoutParams.width = act.getResources().getDisplayMetrics().widthPixels;
        intlLetterSendPanelFindViewById.setLayoutParams(layoutParams);
        dialog.getWindow().setGravity(80);
        dialog.getWindow().setWindowAnimations(v7c0.A);
        intlLetterSendPanelFindViewById.setLetterWrapperLibraries(CoreModule.d.B(user.gender, i0g0.y()));
        intlLetterSendPanelFindViewById.t(user, new d30() { // from class: l.xm8
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
                i0e.e(cwf0VarC);
            }
        });
        dialog.show();
        i0e.f(cwf0VarC);
    }

    /* JADX INFO: renamed from: V1 */
    public static void m2348V1(Act act, User user, final d30 d30Var, final d30 d30Var2) {
        final cwf0 cwf0VarC = i0e.c("p_suggest_live_room_pop", Dialog.class.getName());
        qib0.G.Q0(new dd80.a(act).Q(f6c0.M0).P(false).M(true).n0(new DialogInterface.OnDismissListener() { // from class: l.im8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).o0(new DialogInterface.OnShowListener() { // from class: l.jm8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                i0e.f(cwf0VarC);
            }
        }).c0(act.getString(R.string.Yg), new Runnable() { // from class: l.km8
            @Override // java.lang.Runnable
            public final void run() {
                d30Var.call();
            }
        }).X(act.getString(R.string.bh), new Runnable() { // from class: l.lm8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m2352X(d30Var2);
            }
        }).r0().L().findViewById(u4c0.O), user.fp().profileSmall());
    }

    /* JADX INFO: renamed from: W0 */
    public static /* synthetic */ void m2350W0(Runnable runnable, DialogInterface dialogInterface) {
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
    }

    /* JADX INFO: renamed from: W1 */
    public static void m2351W1(final Act act, String str) {
        final cwf0 cwf0VarC = i0e.c("p_user_passive_popup", Dialog.class.getName());
        cwf0VarC.p(ic50.j().f().V(OmsDialog.p_user_passive_show_chat.getIdentifier(), new j760[]{j760.a("userpassive_showfrom", CoreGiftPanelName.chat), j760.a("userpassive_word", str)}));
        final View viewInflate = act.getLayoutInflater().inflate(f6c0.j2, (ViewGroup) null);
        final dd80 dd80VarO = act.newDialog().R(viewInflate).P(false).o0(new DialogInterface.OnShowListener() { // from class: l.on8
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                CoreDlg.m2343U(cwf0VarC, dialogInterface);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.pn8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).O();
        viewInflate.findViewById(u4c0.h6).setOnClickListener(new View.OnClickListener() { // from class: l.qn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m2397m0(dd80VarO, view);
            }
        });
        viewInflate.findViewById(u4c0.Ae).setOnClickListener(new View.OnClickListener() { // from class: l.rn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m2429x(dd80VarO, view);
            }
        });
        viewInflate.findViewById(u4c0.Ge).setOnClickListener(new View.OnClickListener() { // from class: l.sn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m2377f0(viewInflate, act, dd80VarO, view);
            }
        });
        dd80VarO.show();
        act.lifecycle().filter(new w9j() { // from class: l.tn8
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.j);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.un8
            public final void call(Object obj) {
                CoreDlg.m2382h0(dd80VarO, (com.p1.mobile.android.app.c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m2352X(d30 d30Var) {
        zvf0.r("e_suggest_live_room_card_popup_no", "p_suggest_live_room_pop");
        d30Var.call();
    }

    /* JADX INFO: renamed from: X1 */
    public static void m2354X1(Act act, boolean z) {
        m2357Y1(act, z, null);
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m2355Y(final Act act, Message message) {
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = "";
        act.progress(R.string.J5, true);
        CoreModule.c.f0.qp(message.owner, ((DbObject) message).id, report).subscribe(mkd0.H(new e30() { // from class: l.po8
            public final void call(Object obj) {
                CoreDlg.m2400n0(act, (roj0) obj);
            }
        }, new e30() { // from class: l.qo8
            public final void call(Object obj) {
                CoreDlg.m2284A0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ void m2356Y0(d30 d30Var, DialogInterface dialogInterface) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public static void m2357Y1(final Act act, boolean z, final d30 d30Var) {
        new xh0.a(act).g(z).s(act.getString(R.string.o2)).r(act.getString(R.string.Vj)).e(R.string.c).j(String.format("%s\n%s\n%s", act.getString(R.string.n2), act.getString(R.string.p2), act.getString(R.string.m2))).k(8388611).o(new View.OnClickListener() { // from class: l.am8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m2391k0(act, d30Var, view);
            }
        }).a().g();
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m2358Z(d30 d30Var, Act act) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        act.finish();
    }

    /* JADX INFO: renamed from: Z0 */
    public static /* synthetic */ void m2359Z0(Set set, String str, String str2, final cwf0 cwf0Var, final f30 f30Var, final BottomSheetDialog bottomSheetDialog, View view) {
        o6j0.m8403c("e_friends_share", "p_friends_list", o6j0.C3390a.m8420f("share_friends_nums", set.size()));
        final StringBuilder sb = new StringBuilder();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            sb.append((String) it.next());
            sb.append(',');
        }
        if (sb.toString().endsWith(",")) {
            sb.deleteCharAt(sb.length() - 1);
        }
        ArrayList arrayList = new ArrayList(set);
        if (TextUtils.equals(str, "sendMsg")) {
            try {
                CoreModule.c.f0.Ho(dyd.a(), arrayList, (Message) Message.JSON_ADAPTER.parse(URLDecoder.decode(str2, "UTF-8"))).subscribe(mkd0.H(new e30() { // from class: l.ao8
                    public final void call(Object obj) {
                        CoreDlg.m2317L0(cwf0Var, f30Var, sb, bottomSheetDialog, (roj0) obj);
                    }
                }, new e30() { // from class: l.bo8
                    public final void call(Object obj) {
                        CoreDlg.m2415s0(f30Var, sb, (Throwable) obj);
                    }
                }));
                return;
            } catch (IOException e) {
                CrashHelper.c(e);
                return;
            }
        }
        if (TextUtils.equals(str, "selectFriends")) {
            i0e.e(cwf0Var);
            f30Var.call("success", sb.toString());
            bottomSheetDialog.dismiss();
        }
    }

    /* JADX INFO: renamed from: Z1 */
    public static void m2360Z1(Act act, final d30 d30Var, String str) {
        final cwf0 cwf0VarC = i0e.c("p_age_verify_popup", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("age_verify_show_from", str), vwb.Y("tooltips_trigger_mode", Active.TYPE)});
        i0e.f(cwf0VarC);
        AgeVerificationSingleGuideView ageVerificationSingleGuideViewInflate = act.inflater().inflate(f6c0.cd, (ViewGroup) null, false);
        final dd80 dd80VarO = act.newDialog().R(ageVerificationSingleGuideViewInflate).P(true).n0(new DialogInterface.OnDismissListener() { // from class: l.tl8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).O();
        ageVerificationSingleGuideViewInflate.T(Boolean.valueOf(zb0.d()), new d30() { // from class: l.ul8
            public final void call() {
                CoreDlg.m2393l(d30Var, dd80VarO);
            }
        }, new d30() { // from class: l.vl8
            public final void call() {
                dd80VarO.dismiss();
            }
        });
        dd80VarO.show();
    }

    /* JADX INFO: renamed from: a1 */
    public static /* synthetic */ void m2362a1(d30 d30Var, d30 d30Var2, DialogInterface dialogInterface) {
        d30Var.call();
        if (NullChecker.a(d30Var2)) {
            d30Var2.call();
        }
    }

    /* JADX INFO: renamed from: a2 */
    public static void m2363a2(Act act, Runnable runnable) {
        Dialog.e eVar = new Dialog.e(act);
        int iColor = act.color(w0c0.J);
        eVar.o(iColor).o0(iColor).K(14.0f).E0(R.string.gk).H0(act.color(w0c0.C)).F(n3b0.g() - qib0.H.guessedCurrentServerTime() >= 0 ? act.string(R.string.fk) : "开启此功能会导致“查看谁喜欢我“列表内不会再有新的喜欢你的用户，如果后续再购买“查看谁喜欢我“将默认重新关闭").G(act.color(w0c0.D)).s0(R.string.O3).l0(R.string.M, runnable).z0();
    }

    /* JADX INFO: renamed from: b */
    public static void m2364b(Act act, final String str) {
        act.dialog().e0(vwb.f0(new String[]{act.getString(R.string.i)})).g0(new Dialog.g() { // from class: l.sl8
            /* JADX INFO: renamed from: a */
            public final void m9360a(Dialog dialog, View view, int i, CharSequence charSequence) {
                e51.q(str);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: b0 */
    public static /* synthetic */ void m2365b0(Act act, String str, d30 d30Var, Followship followship) {
        act.progressDismiss();
        CoreModule.c.e0.J1.onNext(str);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b1 */
    public static /* synthetic */ void m2366b1(VButton vButton, Act act, final dd80 dd80Var, Long l2) {
        if (l2.longValue() < 9) {
            vButton.setText(String.format("%ds", Long.valueOf(9 - l2.longValue())));
            return;
        }
        vButton.setText("知道了");
        vButton.setTextColor(act.res.getColor(w0c0.D));
        vButton.setEnabled(true);
        vButton.setOnClickListener(new View.OnClickListener() { // from class: l.nn8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m2335R0(dd80Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: b2 */
    public static void m2367b2(final PutongAct putongAct) {
        final cwf0 cwf0VarC = i0e.c("p_age_verify_photo_upload_type_popup", Dialog.class.getName());
        cwf0VarC.p(new j760[]{vwb.Y("tooltips_trigger_mode", Active.TYPE)});
        i0e.f(cwf0VarC);
        final String strString = putongAct.string(R.string.C);
        final String strString2 = putongAct.string(R.string.D);
        putongAct.dialog().e0(vwb.f0(new String[]{strString, strString2})).g0(new Dialog.g() { // from class: l.bm8
            /* JADX INFO: renamed from: a */
            public final void m5741a(Dialog dialog, View view, int i, CharSequence charSequence) {
                CoreDlg.m2433y0(strString, putongAct, strString2, dialog, view, i, charSequence);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.cm8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m2368c0(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: c1 */
    public static /* synthetic */ void m2369c1(Act act) {
        if (NullChecker.a(act) && (act instanceof PersonalDetailsAct)) {
            zvf0.r("e_edit_basic_info_calendar", "p_edit_basic_info_view");
        }
    }

    /* JADX INFO: renamed from: c2 */
    public static dd80 m2370c2(Act act, final d30 d30Var, final d30 d30Var2) {
        final cwf0 cwf0VarC = i0e.c("p_user_profile_share_agreement_popup", Dialog.class.getName());
        i0e.f(cwf0VarC);
        return new dd80.a(act).y0("分享新功能").t0("进入ta人主页可分享名片给你的朋友，使用截图有更多惊喜！默认为您打开了分享功能的使用权，若您不想被他人分享，可前往设置-隐私和通知进行关闭。").c0("我知道了", new Runnable() { // from class: l.jn8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m2427w0(d30Var);
            }
        }).X("后续了解", new Runnable() { // from class: l.ln8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m2305H0(d30Var2);
            }
        }).P(false).n0(new DialogInterface.OnDismissListener() { // from class: l.mn8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).r0();
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m2371d0(roj0 roj0Var) {
    }

    /* JADX INFO: renamed from: d1 */
    public static /* synthetic */ void m2372d1(e30 e30Var, final String str, final Act act, final d30 d30Var, String str2) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(str2);
        }
        User userById = CoreModule.N().getUserById(str);
        if (!CoreModule.N().isMatchedByRelationship(userById) && CoreModule.N().isMatchedByFollowship(userById) && !m2288B1(userById)) {
            CoreModule.N().following(CoreModule.H().userId(), userById, false, (String) null, (String) null).subscribe(mkd0.H(new e30() { // from class: l.mm8
                public final void call(Object obj) {
                    CoreDlg.m2365b0(act, str, d30Var, (Followship) obj);
                }
            }, new e30() { // from class: l.nm8
                public final void call(Object obj) {
                    CoreDlg.m2385i0(act, (Throwable) obj);
                }
            }));
        } else {
            act.progress(R.string.J5, true);
            CoreModule.c.f0.qe(str, act).subscribe(mkd0.H(new e30() { // from class: l.pm8
                public final void call(Object obj) {
                    CoreDlg.m2334R(str, act, d30Var, (roj0) obj);
                }
            }, new e30() { // from class: l.qm8
                public final void call(Object obj) {
                    CoreDlg.m2394l0(act, (Throwable) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: d2 */
    public static void m2373d2(final User user, Act act, final d30 d30Var, final d30 d30Var2) {
        final cwf0 cwf0VarC = i0e.c("p_alert_dislike_who_liked_me_popup", "showSpecialLikeRetailDlg");
        cwf0VarC.o(ic50.j().f().U(OmsDialog.p_alert_dislike_who_liked_me_popup.getIdentifier(), o6j0.m8402b(o6j0.C3390a.m8422h("tooltips_trigger_mode", Active.TYPE), o6j0.C3390a.m8422h("tooltips_type", "alert"), o6j0.C3390a.m8422h("tooltips_type_ui", "alert_self_definition_basic"), o6j0.C3390a.m8422h("tooltips_trigger_reason", "swipe"), o6j0.C3390a.m8422h("tooltips_trigger_page", "swipe_page"), o6j0.C3390a.m8422h("tooltips_trigger_module", "card"), o6j0.C3390a.m8422h("receiver_user_id", ((DbObject) user).id))));
        i0e.f(cwf0VarC);
        View viewInflate = act.inflater().inflate(f6c0.Tb, (ViewGroup) null);
        VDraweeView vDraweeViewFindViewById = viewInflate.findViewById(u4c0.Qa);
        VDraweeView vDraweeViewFindViewById2 = viewInflate.findViewById(u4c0.Ra);
        qib0.G.Q0(vDraweeViewFindViewById, CoreModule.c.e0.p9().fp().profileSmall());
        qib0.G.Q0(vDraweeViewFindViewById2, user.fp().profileSmall());
        ((TextView) viewInflate.findViewById(u4c0.V6)).setText(user.isFemale() ? String.format("%s\n%s", act.getString(R.string.pp), act.getString(R.string.qp)) : String.format("%s\n%s", act.getString(R.string.rp), act.getString(R.string.sp)));
        new dd80.a(act).R(viewInflate).P(false).a0(user.isFemale() ? R.string.vp : R.string.wp, new Runnable() { // from class: l.kl8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m2298F(d30Var, user);
            }
        }).U(user.isFemale() ? R.string.tp : R.string.up, new Runnable() { // from class: l.ll8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m2375e1(d30Var2, user);
            }
        }).n0(new DialogInterface.OnDismissListener() { // from class: l.ml8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).r0();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m2374e0(d30 d30Var, final Act act, final String str, c40[] c40VarArr, VListCell vListCell, VListCell.a aVar, int i) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        act.progress(R.string.J5, true);
        CoreModule.c.f0.xn(str).subscribe(mkd0.I(new e30() { // from class: l.eo8
            public final void call(Object obj) {
                CoreDlg.m2371d0((roj0) obj);
            }
        }, new e30() { // from class: l.fo8
            public final void call(Object obj) {
                CoreDlg.m2319M(act, (Throwable) obj);
            }
        }, new d30() { // from class: l.ho8
            public final void call() {
                CoreDlg.m2418t0(str, act);
            }
        }));
        c40VarArr[0].b();
    }

    /* JADX INFO: renamed from: e1 */
    public static /* synthetic */ void m2375e1(d30 d30Var, User user) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        o6j0.m8403c("e_alert_dislike_who_liked_me_dislike", "p_alert_dislike_who_liked_me_popup", o6j0.C3390a.m8422h("receiver_user_id", ((DbObject) user).id));
    }

    /* JADX INFO: renamed from: e2 */
    public static void m2376e2(Act act, final d30 d30Var, boolean z) {
        final cwf0 cwf0VarC = i0e.c("p_unlock_message_popup", Dialog.class.getName());
        cwf0VarC.o(o6j0.m8402b(o6j0.C3390a.m8422h("unlock_message_step", z ? "vipMembership" : "ageCheck"), o6j0.C3390a.m8422h("tooltips_trigger_mode", Active.TYPE)));
        i0e.f(cwf0VarC);
        o6j0.m8403c("e_unlock_message", "p_unlock_message_popup", o6j0.C3390a.m8422h("unlock_message_step", z ? "vipMembership" : "ageCheck"));
        AgeVerificationDoubleGuideView ageVerificationDoubleGuideViewInflate = act.inflater().inflate(f6c0.bd, (ViewGroup) null, false);
        final Dialog dialogZ = act.dialog().P(ageVerificationDoubleGuideViewInflate, true).B(true).u().V(new DialogInterface.OnDismissListener() { // from class: l.xn8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0VarC);
            }
        }).z();
        ageVerificationDoubleGuideViewInflate.S(new d30() { // from class: l.yn8
            public final void call() {
                CoreDlg.m2307I(dialogZ, d30Var);
            }
        }, new d30() { // from class: l.zn8
            public final void call() {
                dialogZ.dismiss();
            }
        });
        dialogZ.show();
    }

    /* JADX INFO: renamed from: f0 */
    public static /* synthetic */ void m2377f0(View view, Act act, dd80 dd80Var, View view2) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + ((TextView) view.findViewById(u4c0.Ge)).getText().toString()));
        act.startActivity(intent);
        dd80Var.dismiss();
        o6j0.m8403c("e_user_passive_popup_number", "p_user_passive_popup", new o6j0.C3390a[0]);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m2379g0(DownloadTask downloadTask, StringBuilder sb) {
        CoreModule.b.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.parse("file://" + downloadTask.v())));
        lsi0.j(CoreModule.b.getString(R.string.P3, sb.toString()));
    }

    /* JADX INFO: renamed from: g1 */
    public static /* synthetic */ void m2380g1(dd80 dd80Var) {
        o6j0.m8403c("e_alert_cheat_prevention__tips_click", "p_alert_cheat_prevention__tips_popup", o6j0.C3390a.m8422h("no_prompt_again", "no"));
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m2381h(final Act act, Message message) {
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = "";
        act.progress(R.string.J5, true);
        CoreModule.c.f0.qp(message.owner, ((DbObject) message).id, report).subscribe(mkd0.H(new e30() { // from class: l.dl8
            public final void call(Object obj) {
                CoreDlg.m2314K0(act, (roj0) obj);
            }
        }, new e30() { // from class: l.el8
            public final void call(Object obj) {
                CoreDlg.m2368c0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m2382h0(dd80 dd80Var, com.p1.mobile.android.app.c cVar) {
        if (dd80Var == null || !dd80Var.isShowing()) {
            return;
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: h1 */
    public static void m2383h1(Act act, Menu menu, final d30 d30Var) {
        menu.add(0, 6, 30, act.string(R.string.c)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.zl8
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return CoreDlg.m2403o0(d30Var, menuItem);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m2384i(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: i0 */
    public static /* synthetic */ void m2385i0(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: i1 */
    public static void m2386i1(boolean z, Menu menu, String str, Act act) {
        m2389j1(z, menu, str, act, 15);
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m2387j(List list, c40[] c40VarArr, VListCell vListCell, VListCell.a aVar, int i) {
        ((Runnable) ((j760) list.get(i)).b).run();
        c40VarArr[0].b();
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ void m2388j0(String str, cwf0 cwf0Var, DialogInterface dialogInterface) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        i0e.e(cwf0Var);
    }

    /* JADX INFO: renamed from: j1 */
    public static void m2389j1(boolean z, Menu menu, final String str, final Act act, int i) {
        if (z) {
            menu.add(0, 2, i, R.string.Nj).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.sk8
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return CoreDlg.m2332Q0(act, str, menuItem);
                }
            });
        }
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m2391k0(Act act, d30 d30Var, View view) {
        hfw.a("checkPermissionDlg", "click to setting");
        if (pvv.c()) {
            if (!wvv.m10581o()) {
                act.registerOnActivityResultListener(new C3088a(1010, act, d30Var));
                act.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), 1010);
                return;
            } else if (NullChecker.a(d30Var)) {
                d30Var.call();
            }
        } else if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        try {
            ane0.x(act);
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public static void m2392k1(boolean z, boolean z2, Menu menu, String str, Act act, d30 d30Var, ProfileMenuBuildParam profileMenuBuildParam) {
        m2395l1(z, z2, menu, str, act, false, d30Var, 10, profileMenuBuildParam);
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m2393l(d30 d30Var, dd80 dd80Var) {
        zvf0.r("e_age_verify_operate", "p_age_verify_popup");
        if (zb0.d()) {
            lsi0.w(R.string.J);
        } else {
            d30Var.call();
        }
        dd80Var.dismiss();
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m2394l0(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: l1 */
    public static void m2395l1(boolean z, final boolean z2, Menu menu, final String str, final Act act, boolean z3, final d30 d30Var, int i, final ProfileMenuBuildParam profileMenuBuildParam) {
        if ((z3 || z2) && z) {
            menu.add(0, 1, i, m2437z1(act, false, R.string.r, 0)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.fl8
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return CoreDlg.m2290C0(act, str, z2, d30Var, profileMenuBuildParam, menuItem);
                }
            });
        }
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m2396m(d30 d30Var, android.app.Dialog dialog) {
        d30Var.call();
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: m0 */
    public static /* synthetic */ void m2397m0(dd80 dd80Var, View view) {
        dd80Var.dismiss();
        o6j0.m8403c("e_user_passive_popup_cancel", "p_user_passive_popup", new o6j0.C3390a[0]);
    }

    /* JADX INFO: renamed from: m1 */
    public static void m2398m1(Act act, Menu menu, String str) {
        m2401n1(act, menu, str, 5);
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m2400n0(Act act, roj0 roj0Var) {
        act.progressDismiss();
        lsi0.y(it6.b(R.string.dm, R.string.Sl));
    }

    /* JADX INFO: renamed from: n1 */
    public static void m2401n1(final Act act, Menu menu, final String str, int i) {
        menu.add(0, 0, i, rza.S0(act, act.string(R.string.oc))).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.ro8
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return CoreDlg.m2406p0(act, str, menuItem);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m2402o(String str, Act act, d30 d30Var, roj0 roj0Var) {
        CoreModule.N().updateUserOnBlock(str);
        act.progressDismiss();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        List listD = CoreModule.N().coreMomentMutedUsers().d();
        if (listD == null) {
            listD = new ArrayList();
        }
        CoreModule.N().coreMomentMutedUsers().e(vwb.c0(listD, str));
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ boolean m2403o0(d30 d30Var, MenuItem menuItem) {
        d30Var.call();
        return true;
    }

    /* JADX INFO: renamed from: o1 */
    public static void m2404o1(final Act act, Menu menu, final String str) {
        menu.add(0, 4, 4, R.string.H1).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.kn8
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(MenuItem menuItem) {
                return CoreDlg.m2302G0(act, str, menuItem);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m2405p(Act act, d30 d30Var, Followship followship) {
        act.progressDismiss();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ boolean m2406p0(Act act, String str, MenuItem menuItem) {
        zvf0.r("e_message_page_set_nickname", "p_chat_view");
        if (CoreModule.c.e0.p9().isVIP()) {
            act.startActivity(SetNicknameAct.Y1(act, str));
            return true;
        }
        com.p1.mobile.putong.core.ui.purchase.c.J1(act, "p_chat_view,e_message_page_set_nickname,click", Privilege.vip_membership_remark_gp);
        return true;
    }

    /* JADX INFO: renamed from: p1 */
    public static void m2407p1(boolean z, boolean z2, User user, Act act, Menu menu, String str, d30 d30Var, String str2) {
        m2410q1(z, z2, user, act, menu, str, d30Var, str2, 20);
    }

    /* JADX INFO: renamed from: q1 */
    public static void m2410q1(boolean z, boolean z2, User user, final Act act, Menu menu, final String str, final d30 d30Var, final String str2, int i) {
        if (z && z2) {
            CoreModule.N().isMatchedByRelationship(user);
            if (user != null) {
                user.unilateralBlock();
            }
            if (!TextUtils.isEmpty(str) && NullChecker.a(CoreModule.c)) {
                CoreModule.c.f0.Xe(str);
            }
            menu.add(0, 3, i, act.getString(R.string.Qj)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.hl8
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return CoreDlg.m2322N(act, str, d30Var, str2, menuItem);
                }
            });
        }
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m2412r0(Act act, View view) {
        o6j0.m8403c("e_cheat_prevention_guide_click", "p_alert_cheat_prevention__risk_alarm_popup", o6j0.C3390a.m8422h("cheat_prevention_from", "risk_alarm_popup"));
        act.startActivity(WebViewAct.a2(act, "", "https://live-web.tantanapp.com/anti_fraud_reminder/guide", true));
    }

    /* JADX INFO: renamed from: r1 */
    public static void m2413r1(Act act) {
        ic50.j().f().s0(act, OmsDialog.p_verification_canceled_profile_avatar_popup.getIdentifier());
    }

    /* JADX INFO: renamed from: s0 */
    public static /* synthetic */ void m2415s0(f30 f30Var, StringBuilder sb, Throwable th) {
        f30Var.call("failed", sb.toString());
        bx6.b(th);
    }

    /* JADX INFO: renamed from: s1 */
    public static void m2416s1(final Act act, final String str, final d30 d30Var, final d30 d30Var2) {
        User userPa = CoreModule.c.e0.Pa(str);
        String str2 = userPa == null ? "" : userPa.name;
        String strY7 = CoreModule.c.e0.y7(((DbObject) userPa).id);
        if (!TextUtils.isEmpty(strY7)) {
            str2 = strY7;
        } else if (upa.t1() && TextUtils.isEmpty(strY7) && (!NullChecker.a(userPa) || userPa.inactivated || userPa.status.contains(UserStatus.get("RISK_TAG_CHAT_PROFILE_PICTURE_HIDDEN")))) {
            str2 = "ta";
        }
        act.dialog().F(String.format("是否要解除和%s的配对？", str2)).B(false).v0("解除", new Runnable() { // from class: l.io8
            @Override // java.lang.Runnable
            public final void run() {
                Act act2 = act;
                String str3 = str;
                act2.duringCreated(mkd0.r(CoreModule.c.f0.Mg(str3), CoreModule.c.f0.Ig(str3), new x9j() { // from class: l.no8
                    public final Object call(Object obj, Object obj2) {
                        return vwb.Y((Boolean) obj, (Boolean) obj2);
                    }
                }).first()).subscribe(mkd0.G(new e30() { // from class: l.oo8
                    public final void call(Object obj) {
                        CoreDlg.m2283A(str3, act2, d30Var, (j760) obj);
                    }
                }));
            }
        }).l0(R.string.c, new Runnable() { // from class: l.jo8
            @Override // java.lang.Runnable
            public final void run() {
                CoreDlg.m2358Z(d30Var2, act);
            }
        }).z0();
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m2418t0(String str, Act act) {
        if (ruy.g().e(str)) {
            CoreModule.c.f0.Fo();
        }
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: t1 */
    public static void m2419t1(final Act act, final String str, final d30 d30Var, final d30 d30Var2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(act.getString(R.string.Nj));
        c40.b bVar = new c40.b(act);
        bVar.I(act.getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.nl8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                c40VarArr[0].b();
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.ol8
            /* JADX INFO: renamed from: a */
            public final void m8501a(VListCell vListCell, VListCell.a aVar, int i) {
                CoreDlg.m2374e0(d30Var, act, str, c40VarArr, vListCell, aVar, i);
            }
        }).T(new DialogInterface.OnDismissListener() { // from class: l.pl8
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                CoreDlg.m2356Y0(d30Var2, dialogInterface);
            }
        });
        c40 c40VarF = bVar.F();
        final c40[] c40VarArr = {c40VarF};
        c40VarF.f();
    }

    /* JADX INFO: renamed from: u1 */
    public static void m2422u1(Act act, String str, String str2) {
        m2425v1(act, str, null, null, null, str2);
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m2424v0(e30 e30Var, Conversation conversation, String str, String str2, Act act, c40[] c40VarArr, VListCell vListCell, VListCell.a aVar, int i) {
        String str3;
        String string = aVar.a.toString();
        e30Var.call(string.toString());
        if (NullChecker.a(conversation)) {
            o6j0.m8403c("e_cancelmatch", "p_messages_view", o6j0.C3390a.m8422h("receiver_user_id", str), o6j0.C3390a.m8422h("source_type", str2), o6j0.C3390a.m8422h("cancel_item", string.toString()), o6j0.C3390a.m8422h("matchfrom", CoreModule.c.e0.M7(str).matchFromForTrack()));
        }
        String string2 = string.toString();
        if (act.string(R.string.vq).equals(string2)) {
            str3 = "dont_talk";
        } else if (act.string(R.string.zq).equals(string2)) {
            str3 = "spam";
        } else if (act.string(R.string.yq).equals(string2)) {
            str3 = "harassment";
        } else if (act.string(R.string.xq).equals(string2)) {
            str3 = "fake_profile";
        } else if (act.string(R.string.wq).equals(string2)) {
            str3 = "dont_want_to_tell_you";
        } else {
            str3 = act.string(R.string.Aq).equals(string2) ? "swiped_wrong" : "";
        }
        zvf0.u("e_chat_unmatch", "p_unmatch_dialog", new j760[]{vwb.Y("unmatch_reason", str3)});
        c40VarArr[0].b();
    }

    /* JADX INFO: renamed from: v1 */
    public static void m2425v1(final Act act, final String str, final e30<String> e30Var, final d30 d30Var, final d30 d30Var2, final String str2) {
        final Conversation conversationXe = CoreModule.c.f0.Xe(str);
        act.duringCreated(mkd0.r(CoreModule.c.f0.Mg(str), CoreModule.c.f0.Jg(str), new x9j() { // from class: l.vn8
            public final Object call(Object obj, Object obj2) {
                return vwb.Y((Boolean) obj, (Boolean) obj2);
            }
        }).first()).subscribe(mkd0.G(new e30() { // from class: l.go8
            public final void call(Object obj) {
                CoreDlg.m2286B(e30Var, str, act, d30Var2, str2, conversationXe, d30Var, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ void m2427w0(d30 d30Var) {
        zvf0.r("e_user_profile_share_agreement_popup_confirm", "p_user_profile_share_agreement_popup");
        d30Var.call();
    }

    /* JADX INFO: renamed from: w1 */
    public static void m2428w1(Act act, final Media media) {
        if (zqx.k()) {
            m2431x1(media);
        } else {
            PermissionHelper.c().r(new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}).w(false).u(true).m(new d30() { // from class: l.ql8
                public final void call() {
                    CoreDlg.m2431x1(media);
                }
            }, new e30() { // from class: l.rl8
                public final void call(Object obj) {
                    CoreDlg.m2344U0((PermissionHelper.PermissionDeniedReason) obj);
                }
            }).i(act);
        }
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ void m2429x(dd80 dd80Var, View view) {
        dd80Var.dismiss();
        o6j0.m8403c("e_user_passive_popup_ok", "p_user_passive_popup", new o6j0.C3390a[0]);
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m2430x0(d30 d30Var, DialogInterface dialogInterface) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static void m2431x1(Media media) {
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
            CrashHelper.c(new Exception("downloadMediaWithPermission exception:" + e.getMessage(), e));
            str = null;
        }
        if (TextUtils.isEmpty(str4) || TextUtils.isEmpty(str)) {
            lsi0.h(R.string.n4);
            return;
        }
        DownloadTask downloadTaskA = new DownloadTask.b(qib0.H.getDownloadHttp()).q(str4).o(str).j(new f30() { // from class: l.dn8
            public final void call(Object obj, Object obj2) {
                e51.G(new Runnable() { // from class: l.wn8
                    @Override // java.lang.Runnable
                    public final void run() {
                        CoreDlg.m2379g0(downloadTask, sb);
                    }
                });
            }
        }).f(new f30() { // from class: l.en8
            public final void call(Object obj, Object obj2) {
                CoreDlg.m2329P0((DownloadTask) obj, (Throwable) obj2);
            }
        }).a();
        if (com.p1.mobile.putong.ui.download.a.u().y(downloadTaskA.x())) {
            lsi0.h(R.string.Gq);
        } else {
            com.p1.mobile.putong.ui.download.a.u().o(downloadTaskA);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ void m2433y0(String str, PutongAct putongAct, String str2, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (str.equals(charSequence)) {
            zvf0.u("e_age_verify_photo_upload_type", "p_age_verify_photo_upload_type_popup", new j760[]{vwb.Y("select_photo_way", "select_from_album")});
            putongAct.pickImagesWithPicker(1, false, false, false);
        } else if (str2.equals(charSequence)) {
            zvf0.u("e_age_verify_photo_upload_type", "p_age_verify_photo_upload_type_popup", new j760[]{vwb.Y("select_photo_way", "take_photo")});
            oyx.l(putongAct);
        }
    }

    /* JADX INFO: renamed from: y1 */
    public static void m2434y1(Act act, User user, final boolean z, final Runnable runnable, final Runnable runnable2) {
        int i;
        if (z) {
            i = TEnum.equals(user.gender, "male") ? R.string.G3 : R.string.F3;
        } else {
            i = TEnum.equals(user.gender, "male") ? R.string.C3 : R.string.B3;
        }
        if (z) {
            ygh0.m11179C();
        } else {
            ygh0.m11242z();
        }
        if (!IntlCountryCodeController.v() && !vy8.g()) {
            act.dialog().B(true).A(new DialogInterface.OnCancelListener() { // from class: l.fn8
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    CoreDlg.m2350W0(runnable, dialogInterface);
                }
            }).u().s().c0(z ? x2c0.Mr : x2c0.Kr).G0(act.getResources().getString(z ? R.string.H3 : R.string.D3)).E(i, new Object[]{user.name}).l0(R.string.c, new Runnable() { // from class: l.gn8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreDlg.m2320M0(runnable, z);
                }
            }).t0(z ? R.string.E3 : R.string.A3, new Runnable() { // from class: l.hn8
                @Override // java.lang.Runnable
                public final void run() {
                    CoreDlg.m2323N0(z, runnable2);
                }
            }).z0();
            return;
        }
        int i2 = z ? R.string.dr : R.string.cr;
        int i3 = z ? R.string.E3 : R.string.A3;
        final Dialog dialogZ = act.dialog().B(false).M(f6c0.kf).u().z();
        dialogZ.setCanceledOnTouchOutside(false);
        View viewP = dialogZ.P();
        VImage vImageFindViewById = viewP.findViewById(u4c0.L5);
        VText vTextFindViewById = viewP.findViewById(u4c0.L0);
        VText vTextFindViewById2 = viewP.findViewById(u4c0.ge);
        VText vTextFindViewById3 = viewP.findViewById(u4c0.P1);
        vTextFindViewById2.setText(i2);
        vTextFindViewById3.setText(dialogZ.getContext().getString(i, user.name));
        vTextFindViewById.setText(i3);
        vImageFindViewById.setImageResource(z ? x2c0.Nr : x2c0.Lr);
        vTextFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.in8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreDlg.m2293D0(z, runnable2, dialogZ, view);
            }
        });
        dialogZ.show();
    }

    /* JADX INFO: renamed from: z1 */
    public static CharSequence m2437z1(Act act, boolean z, int i, int i2) {
        String string = act.getString(i);
        if (!z || i2 <= 0) {
            return string;
        }
        SpannableStringBuilder spannableStringBuilderAppend = new SpannableStringBuilder(string).append((CharSequence) " ");
        BitmapDrawable bitmapDrawable = new BitmapDrawable(act.getResources(), BitmapFactory.decodeResource(act.getResources(), i2));
        bitmapDrawable.setBounds(0, 0, bitmapDrawable.getIntrinsicWidth(), bitmapDrawable.getIntrinsicHeight());
        spannableStringBuilderAppend.setSpan(new ruw(bitmapDrawable, t100.d(8.0f)), spannableStringBuilderAppend.length() - 1, spannableStringBuilderAppend.length(), 17);
        return spannableStringBuilderAppend;
    }
}
