package p153l;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.view.menu.MenuBuilder;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.Report;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.VerifyData;
import com.p051p1.mobile.putong.data.VerifyReason;
import com.p051p1.mobile.putong.data.Video;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.R$string;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.slf4j.Marker;
import p151v.VButton_FakeShadowSmall;
import p151v.VListCell;
import p151v.VMaterialEdit;

/* JADX INFO: loaded from: classes13.dex */
public class k3h extends w1e {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    public static w30 f123717a;

    /* JADX INFO: renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    public static th0 f123718b;

    /* JADX INFO: renamed from: A0 */
    public static void m148027A0(Act act, final x20 x20Var, boolean z) {
        mxg mxgVarM160665g = new mxg(act).m160668j(R$string.f40029y3).m160662d(R$string.f40017w3).m160665g(R$string.f40011v3);
        if (z) {
            mxgVarM160665g.m160667i(R$string.f40023x3, new Runnable() { // from class: l.e1h
                @Override // java.lang.Runnable
                public final void run() {
                    x20Var.call();
                }
            });
        }
        mxgVarM160665g.show();
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m148028B(Long l2) {
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: B0 */
    public static String m148029B0(Act act) {
        String line1Number;
        try {
            String[] strArr = new String[1];
            strArr[0] = Build.VERSION.SDK_INT <= 29 ? "android.permission.READ_PHONE_STATE" : "android.permission.READ_PHONE_NUMBERS";
            line1Number = PermissionHelper.m81064b(strArr) ? ((TelephonyManager) act.getSystemService("phone")).getLine1Number() : "";
        } catch (SecurityException unused) {
        }
        return (TextUtils.isEmpty(line1Number) || !line1Number.startsWith("+86")) ? "" : line1Number.substring(3);
    }

    /* JADX INFO: renamed from: C0 */
    public static void m148031C0() {
        if (NullChecker.m82486a(f123718b) && f123718b.m191138d()) {
            f123718b.m191137c();
            f123718b = null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m148032D(x20 x20Var, View view) {
        m148031C0();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static void m148033D0() {
        if (NullChecker.m82486a(f123717a) && f123717a.m204616d()) {
            f123717a.m204614b();
            f123717a = null;
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ boolean m148034E(boolean z, final x20 x20Var, Act act, final y20 y20Var, MenuItem menuItem) {
        if (z) {
            x20Var.call();
            return true;
        }
        new mxg(act).m160668j(R$string.f39845W3).m160662d(R$string.f39851X3).m160667i(R$string.f39942l, new Runnable() { // from class: l.i1h
            @Override // java.lang.Runnable
            public final void run() {
                k3h.m148090o(y20Var, x20Var);
            }
        }).m160665g(R$string.f39865a).show();
        wf70.m206060l0(true);
        return true;
    }

    /* JADX INFO: renamed from: E0 */
    public static void m148035E0(final Act act, final int i) {
        new mxg(act).m160668j(R$string.f39982q4).m160661c(true).m160662d(R$string.f39975p4).m160667i(R$string.f39981q3, new Runnable() { // from class: l.h1h
            @Override // java.lang.Runnable
            public final void run() {
                k3h.m148056P(act, i);
            }
        }).m160665g(R$string.f39865a).show();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m148036F(Dialog dialog, C4470c c4470c) {
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: F0 */
    public static Menu m148037F0(final Act act, Menu menu, final String str, pcj<Moment> pcjVar, final pcj<Media> pcjVar2, final x20 x20Var, final x20 x20Var2, final y20<Boolean> y20Var, final y20<Boolean> y20Var2, final y20<FollowshipStatus> y20Var3, boolean z, boolean z2, boolean z3, boolean z4) {
        final FollowshipStatus followshipStatus = null;
        final Moment momentCall = pcjVar == null ? null : pcjVar.call();
        if (vqb0.m202371a().equals(str)) {
            if (NullChecker.m82486a(momentCall) && TEnum.equals(momentCall.status(), "normal")) {
                menu.add(act.getString(R$string.f39815R3)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.g1h
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return k3h.m148103u0(act, x20Var, momentCall, x20Var2, menuItem);
                    }
                });
            }
        } else if (!mrb0.m159646X(str).isTeamAccount()) {
            if (NullChecker.m82486a(momentCall) && momentCall.isLive && j4h.m143419c()) {
                User userM145688e8 = FeedModule.f39703d.m145688e8(str);
                if (NullChecker.m82486a(userM145688e8) && NullChecker.m82486a(userM145688e8.localRelationship) && !TEnum.equals(userM145688e8.localRelationship.state, "matched")) {
                    String string = act.getString(R$string.f39814R2);
                    if (NullChecker.m82486a(userM145688e8.localFollowship)) {
                        followshipStatus = userM145688e8.localFollowship.state;
                        if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                            string = act.getString(R$string.f39802P2);
                        } else if (TEnum.equals(userM145688e8.localFollowship.state, "matched")) {
                            string = act.getString(R$string.f39790N2);
                        }
                    }
                    menu.add(string).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.r1h
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            return k3h.m148112z(y20Var3, followshipStatus, menuItem);
                        }
                    });
                }
            }
            if (NullChecker.m82486a(momentCall)) {
                menu.add(act.getString(R$string.f39821S3)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.c2h
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return k3h.m148048L(act, str, momentCall, menuItem);
                    }
                });
            }
            if (z3) {
                List<String> listM159277n = FeedModule.f39702c.f40057M.m159277n();
                final boolean z5 = listM159277n != null && listM159277n.contains(str);
                final x20 x20Var3 = new x20() { // from class: l.n2h
                    @Override // p153l.x20
                    public final void call() {
                        k3h.m148077h0(act, str, z5, y20Var);
                    }
                };
                menu.add(act.getString(!z5 ? R$string.f40012v4 : R$string.f40030y4)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.y2h
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return k3h.m148034E(z5, x20Var3, act, y20Var2, menuItem);
                    }
                });
            }
            if (z) {
                menu.add(act.getString(R$string.f40036z4)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.g3h
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return k3h.m148108x(act, str, menuItem);
                    }
                });
            }
        }
        if (z2 && NullChecker.m82486a(momentCall) && !TextUtils.isEmpty(momentCall.value)) {
            menu.add(R$string.f39893e).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.h3h
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return k3h.m148075g0(momentCall, menuItem);
                }
            });
        }
        if (NullChecker.m82486a(pcjVar2) && z4) {
            menu.add(act.getString(R$string.f39963o)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.i3h
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return k3h.m148038G(act, pcjVar2, menuItem);
                }
            });
        }
        return menu;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ boolean m148038G(Act act, pcj pcjVar, MenuItem menuItem) {
        snh.m186928k().m186930h(act, (Media) pcjVar.call());
        return true;
    }

    /* JADX INFO: renamed from: G0 */
    public static Menu m148039G0(Act act, Menu menu, String str, pcj<Moment> pcjVar, pcj<Media> pcjVar2, x20 x20Var, y20<Boolean> y20Var, y20<Boolean> y20Var2, y20<FollowshipStatus> y20Var3, boolean z, boolean z2, boolean z3) {
        return m148037F0(act, menu, str, pcjVar, pcjVar2, null, x20Var, y20Var, y20Var2, y20Var3, z, z2, z3, true);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m148040H(TextView textView, final VMaterialEdit vMaterialEdit, final VButton_FakeShadowSmall vButton_FakeShadowSmall, final VMaterialEdit vMaterialEdit2, final Act act, View view) {
        VerifyData verifyData = new VerifyData();
        verifyData.language = q8g0.m175820y();
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = bsj0.m106251I(textView);
        verifyData.mobileNumber = bsj0.m106255M(vMaterialEdit);
        bnl0.m105591y(vButton_FakeShadowSmall, false);
        vButton_FakeShadowSmall.setChecked(true);
        vButton_FakeShadowSmall.setText("...");
        FeedModule.m61405F().send(verifyData).subscribe(psd0.m173600K(new y20() { // from class: l.a2h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148102u(vMaterialEdit2, vButton_FakeShadowSmall, act, vMaterialEdit, (uxj0) obj);
            }
        }, new y20() { // from class: l.b2h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148052N(vButton_FakeShadowSmall, vMaterialEdit, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: H0 */
    public static void m148041H0(final Act act, final l4g0 l4g0Var) {
        final View viewInflate = act.inflater().inflate(tec0.f173713n0, (ViewGroup) null);
        final Dialog dialogM21566z = act.dialog().m21515L(fgc0.f98905h).m21519P(viewInflate, false).m21495B(false).m21496B0(new DialogInterface.OnShowListener() { // from class: l.j3h
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                k3h.m148044J(l4g0Var, dialogInterface);
            }
        }).m21525V(new DialogInterface.OnDismissListener() { // from class: l.w0h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                w1e.m204401e(l4g0Var);
            }
        }).m21566z();
        viewInflate.findViewById(hdc0.f108960s0).setOnClickListener(new View.OnClickListener() { // from class: l.x0h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k3h.m148097r0(dialogM21566z, view);
            }
        });
        viewInflate.findViewById(hdc0.f108901b2).setOnClickListener(new View.OnClickListener() { // from class: l.y0h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k3h.m148060S(dialogM21566z, view);
            }
        });
        viewInflate.findViewById(hdc0.f108905c2).setOnClickListener(new View.OnClickListener() { // from class: l.z0h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k3h.m148092p(viewInflate, act, dialogM21566z, view);
            }
        });
        dialogM21566z.show();
        act.lifecycle().filter(new qcj() { // from class: l.a1h
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16268j);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.b1h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148036F(dialogM21566z, (C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m148042I(Act act, boolean z, y20 y20Var, uxj0 uxj0Var) {
        act.supportInvalidateOptionsMenu();
        act.progressDismiss();
        if (!z) {
            act.hideInput();
        }
        o1j0.m165643q(z ? act.getString(R$string.f39833U3) : act.getString(R$string.f39827T3), act.getResources().getDrawable(lbc0.f130985Z1));
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.valueOf(!z));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static void m148043I0(Act act, String str) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_user_passive_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(pk50.m172568j().m172574f().m181658V("p_user_passive_show_nearby", pf60.m172085a("userpassive_showfrom", "moment"), pf60.m172085a("userpassive_word", str)));
        m148041H0(act, l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m148044J(l4g0 l4g0Var, DialogInterface dialogInterface) {
        pk50.m172568j().m172574f().m181664b0("p_user_passive_show_nearby", 0, false);
        w1e.m204402f(l4g0Var);
    }

    /* JADX INFO: renamed from: J0 */
    public static void m148045J0(Act act, String str) {
        l4g0 l4g0VarM204399c = w1e.m204399c("p_user_passive_popup", Dialog.class.getName());
        l4g0VarM204399c.m152781p(pk50.m172568j().m172574f().m181658V("p_user_passive_show_nearby", pf60.m172085a("userpassive_showfrom", "moment_evaluate"), pf60.m172085a("userpassive_word", str)));
        m148041H0(act, l4g0VarM204399c);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m148046K(boolean z, TextView textView, String str) {
        if (z) {
            textView.setText(str.replaceAll("\\+", ""));
        } else {
            textView.setText(str);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public static void m148047K0(Act act, String str, final x20 x20Var) {
        if (act == null || act.isFinishing()) {
            return;
        }
        act.creates(new y20() { // from class: l.v1h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148093p0((Bundle) obj);
            }
        }, new w1h());
        th0.C20312a c20312a = new th0.C20312a(act);
        c20312a.m191151j(str).m191158q(com.p051p1.mobile.putong.common.R$string.f18053I0).m191156o(new View.OnClickListener() { // from class: l.x1h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k3h.m148032D(x20Var, view);
            }
        }).m191146e(R$string.f39865a).m191144c(new View.OnClickListener() { // from class: l.y1h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k3h.m148031C0();
            }
        });
        th0 th0VarM191142a = c20312a.m191142a();
        f123718b = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ boolean m148048L(Act act, String str, Moment moment, MenuItem menuItem) {
        act.startActivity(orb0.m168884a(act, str, false, null, moment.f56859id));
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    public static void m148049L0(final Act act, final String str, final String str2) {
        if (cmg.m111232r0()) {
            iyh.m142656b(act, str, str2);
        } else {
            wf70.m206060l0(true);
            m148051M0(act, new y20() { // from class: l.r2h
                @Override // p153l.y20
                public final void call(Object obj) {
                    k3h.m148066Y(act, str, str2, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m148050M(x20 x20Var, DialogInterface dialogInterface) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        l3h.m152703a();
    }

    /* JADX INFO: renamed from: M0 */
    public static void m148051M0(final Act act, final y20<String> y20Var) {
        if (act == null || act.isFinishing()) {
            return;
        }
        act.creates(new y20() { // from class: l.u2h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148095q0((Bundle) obj);
            }
        }, new x20() { // from class: l.v2h
            @Override // p153l.x20
            public final void call() {
                k3h.m148033D0();
            }
        });
        final ArrayList arrayListM147507f0 = jyb.m147507f0(act.string(R$string.f39798O4), act.string(R$string.f39762I4), act.string(R$string.f39756H4), act.string(R$string.f39780L4), act.string(R$string.f39768J4), act.string(R$string.f39804P4), act.string(R$string.f39786M4), act.string(R$string.f39792N4), act.string(R$string.f39774K4));
        w30.C21001b c21001b = new w30.C21001b(act);
        c21001b.m204656H(R$string.f39865a).m204669U(new View.OnClickListener() { // from class: l.w2h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k3h.m148033D0();
            }
        }).m204665Q(arrayListM147507f0).m204668T(new DialogInterface.OnDismissListener() { // from class: l.x2h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                wf70.m206060l0(false);
            }
        }).m204670V(new w30.InterfaceC21003d() { // from class: l.z2h
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                k3h.m148054O(arrayListM147507f0, act, y20Var, vListCell, c22660a, i);
            }
        });
        w30 w30VarM204654F = c21001b.m204654F();
        f123717a = w30VarM204654F;
        w30VarM204654F.m204618f();
        wf70.m206060l0(true);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m148052N(VButton_FakeShadowSmall vButton_FakeShadowSmall, VMaterialEdit vMaterialEdit, Throwable th) {
        vButton_FakeShadowSmall.setClickable(true);
        vButton_FakeShadowSmall.setChecked(false);
        vButton_FakeShadowSmall.setText(R$string.f39885c5);
        if (!vButton_FakeShadowSmall.isChecked()) {
            if (vMaterialEdit.getText().toString().isEmpty()) {
                bnl0.m105591y(vButton_FakeShadowSmall, false);
            } else {
                bnl0.m105591y(vButton_FakeShadowSmall, true);
            }
        }
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: N0 */
    public static void m148053N0(Act act, Media media, MomentMessage momentMessage) {
        final List<pf60<String, Runnable>> listM148055O0 = m148055O0(act, media, momentMessage);
        act.dialog().m21534e0(jyb.m147486Q(listM148055O0, new qcj() { // from class: l.g2h
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return k3h.m148094q((pf60) obj);
            }
        })).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.h2h
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                ((Runnable) ((pf60) listM148055O0.get(i)).f152157b).run();
            }
        }).m21567z0();
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m148054O(ArrayList arrayList, final Act act, y20 y20Var, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        m148033D0();
        if (i != arrayList.size() - 1) {
            y20Var.call(c22660a.f210081a.toString());
            return;
        }
        Dialog dialogM204426n = w1e.m204400d(act).m204428p(true).m204420E(10).m204419D(100).m204421F(y20Var).m204426n();
        dialogM204426n.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.c3h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                k3h.m148072e0(act, dialogInterface);
            }
        });
        dialogM204426n.show();
        wf70.m206060l0(true);
    }

    /* JADX INFO: renamed from: O0 */
    public static List<pf60<String, Runnable>> m148055O0(final Act act, final Media media, final MomentMessage momentMessage) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(jyb.m147494Y(FeedModule.f39700a.getString(R$string.f39963o), new Runnable() { // from class: l.k2h
            @Override // java.lang.Runnable
            public final void run() {
                snh.m186928k().m186930h(act, media);
            }
        }));
        if (NullChecker.m82486a(momentMessage) && !momentMessage.isMe() && !((Boolean) jyb.m147493X(mrb0.m159646X(momentMessage.owner), new qcj() { // from class: l.l2h
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).isTeamAccount());
            }
        }, Boolean.FALSE)).booleanValue()) {
            arrayList.add(jyb.m147494Y(FeedModule.f39700a.getString(media instanceof Video ? R$string.f40024x4 : R$string.f40018w4), new Runnable() { // from class: l.m2h
                @Override // java.lang.Runnable
                public final void run() {
                    k3h.m148104v(act, momentMessage);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m148056P(Act act, int i) {
        try {
            act.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), i);
        } catch (Exception e) {
            CrashHelper.m82479c(new Exception("Dlg location exception:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public static void m148057P0(final Act act, @NonNull final x20 x20Var, boolean z, @Nullable final x20 x20Var2, String str) {
        View viewInflate = act.inflater().inflate(tec0.f173734q0, (ViewGroup) null);
        final TextView textView = (TextView) viewInflate.findViewById(hdc0.f108968v);
        final VMaterialEdit vMaterialEdit = (VMaterialEdit) viewInflate.findViewById(hdc0.f108929i2);
        final VMaterialEdit vMaterialEdit2 = (VMaterialEdit) viewInflate.findViewById(hdc0.f108974x);
        final VButton_FakeShadowSmall vButton_FakeShadowSmall = (VButton_FakeShadowSmall) viewInflate.findViewById(hdc0.f108870S);
        final boolean z2 = false;
        final Dialog dialogM21566z = act.dialog().m21558v().m21502E0(R$string.f40027y1).m21503F(act.getResources().getString(R$string.f39950m0)).m21519P(viewInflate, false).m21553s0(R$string.f39864Z4).m21540k0(R$string.f39846W4).m21495B(false).m21548q(false).m21525V(new DialogInterface.OnDismissListener() { // from class: l.j1h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                k3h.m148050M(x20Var, dialogInterface);
            }
        }).m21566z();
        dialogM21566z.m21473o0(new Runnable() { // from class: l.k1h
            @Override // java.lang.Runnable
            public final void run() {
                k3h.m148083k0(vMaterialEdit, vMaterialEdit2, act, textView, dialogM21566z, x20Var2);
            }
        });
        dialogM21566z.m21471m0(new Runnable() { // from class: l.l1h
            @Override // java.lang.Runnable
            public final void run() {
                k3h.m148070c0(dialogM21566z);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.m1h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedModule.m61405F().dialogCCode(act, new y20() { // from class: l.z1h
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        k3h.m148046K(z, textView, (String) obj);
                    }
                });
            }
        });
        vButton_FakeShadowSmall.setOnClickListener(new View.OnClickListener() { // from class: l.n1h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k3h.m148040H(textView, vMaterialEdit, vButton_FakeShadowSmall, vMaterialEdit2, act, view);
            }
        });
        textView.setText(Marker.ANY_NON_NULL_MARKER + nsb.f143476d.get(0).f143479b);
        if (l51.m152882B(act.getLocalClassName())) {
            vButton_FakeShadowSmall.setChecked(true);
            vButton_FakeShadowSmall.setClickable(false);
            vButton_FakeShadowSmall.setText(R$string.f39892d5);
            act.duringCreated(l51.m152894N(act.getLocalClassName(), 60)).subscribe(psd0.m173598I(new y20() { // from class: l.o1h
                @Override // p153l.y20
                public final void call(Object obj) {
                    k3h.m148028B((Long) obj);
                }
            }, new y20() { // from class: l.p1h
                @Override // p153l.y20
                public final void call(Object obj) {
                    k3h.m148100t((Throwable) obj);
                }
            }, new x20() { // from class: l.q1h
                @Override // p153l.x20
                public final void call() {
                    k3h.m148061T(vButton_FakeShadowSmall, vMaterialEdit);
                }
            }));
        } else {
            bnl0.m105591y(vButton_FakeShadowSmall, vMaterialEdit.getText().length() > 0);
        }
        vMaterialEdit.m224373H().subscribe(psd0.m173596G(new y20() { // from class: l.s1h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148058Q(vButton_FakeShadowSmall, vMaterialEdit, (CharSequence) obj);
            }
        }));
        String strM148029B0 = m148029B0(act);
        if (!TextUtils.isEmpty(strM148029B0)) {
            vMaterialEdit.setText(strM148029B0);
        }
        l3h.m152704b(new String[]{z ? "on" : BLiveOperationTitleShowType.off}[0], new String[]{TextUtils.isEmpty(vMaterialEdit.getText().toString()) ? "no_number" : "secret_number"}[0], str);
        dialogM21566z.show();
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m148058Q(VButton_FakeShadowSmall vButton_FakeShadowSmall, VMaterialEdit vMaterialEdit, CharSequence charSequence) {
        if (vButton_FakeShadowSmall.isChecked()) {
            return;
        }
        if (vMaterialEdit.getText().toString().isEmpty()) {
            bnl0.m105591y(vButton_FakeShadowSmall, false);
        } else {
            bnl0.m105591y(vButton_FakeShadowSmall, true);
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m148060S(Dialog dialog, View view) {
        dialog.dismiss();
        tfj0.m190939b("e_user_passive_popup_ok", "p_user_passive_popup", new tfj0.C20302a[0]);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m148061T(VButton_FakeShadowSmall vButton_FakeShadowSmall, VMaterialEdit vMaterialEdit) {
        vButton_FakeShadowSmall.setChecked(false);
        vButton_FakeShadowSmall.setText(R$string.f39885c5);
        if (vButton_FakeShadowSmall.isChecked()) {
            return;
        }
        if (vMaterialEdit.getText().toString().isEmpty()) {
            bnl0.m105591y(vButton_FakeShadowSmall, false);
        } else {
            bnl0.m105591y(vButton_FakeShadowSmall, true);
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m148062U(x20 x20Var, View view) {
        m148031C0();
        if (NullChecker.m82486a(view)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m148064W(Bundle bundle) {
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m148065X(Act act, uxj0 uxj0Var) {
        act.progressDismiss();
        wf70.m206060l0(false);
        o1j0.m165651y(lu6.m155846b(R$string.f39810Q4, R$string.f39750G4));
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m148066Y(final Act act, String str, String str2, String str3) {
        act.progress(R$string.f39832U2, true);
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = str3;
        FeedModule.f39702c.m61937t4(str, str2, report).subscribe(psd0.m173597H(new y20() { // from class: l.a3h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148065X(act, (uxj0) obj);
            }
        }, new y20() { // from class: l.b3h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148085l0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m148067Z(Act act, Throwable th) {
        i4h.m138538g(th);
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m148070c0(Dialog dialog) {
        m148111y0(dialog);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m148071d0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m148072e0(Act act, DialogInterface dialogInterface) {
        wf70.m206060l0(false);
        Objects.requireNonNull(act);
        l51.m152888H(act, new ob20(act), 100L);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ boolean m148075g0(Moment moment, MenuItem menuItem) {
        l51.m152911q(moment.value);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m148076h(VButton_FakeShadowSmall vButton_FakeShadowSmall, VMaterialEdit vMaterialEdit) {
        vButton_FakeShadowSmall.setChecked(false);
        vButton_FakeShadowSmall.setText(R$string.f39885c5);
        if (vButton_FakeShadowSmall.isChecked()) {
            return;
        }
        if (vMaterialEdit.getText().toString().isEmpty()) {
            bnl0.m105591y(vButton_FakeShadowSmall, false);
        } else {
            bnl0.m105591y(vButton_FakeShadowSmall, true);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m148077h0(final Act act, String str, final boolean z, final y20 y20Var) {
        wf70.m206060l0(false);
        act.progress(R$string.f39832U2, true);
        FeedModule.f39702c.f40057M.m61956M(str, !z).subscribe(psd0.m173597H(new y20() { // from class: l.c1h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148042I(act, z, y20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.d1h
            @Override // p153l.y20
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m148078i(x20 x20Var, View view) {
        m148031C0();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m148080j(Act act, uxj0 uxj0Var) {
        act.progressDismiss();
        o1j0.m165651y(lu6.m155846b(R$string.f39810Q4, R$string.f39750G4));
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Moment m148081j0(Moment moment) {
        return moment;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m148082k(Act act, Throwable th) {
        act.progressDismiss();
        bsj0.m106246D(th);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m148083k0(VMaterialEdit vMaterialEdit, VMaterialEdit vMaterialEdit2, final Act act, TextView textView, final Dialog dialog, final x20 x20Var) {
        if (TextUtils.isEmpty(vMaterialEdit.getText()) || TextUtils.isEmpty(vMaterialEdit2.getText())) {
            return;
        }
        act.progress(R$string.f39832U2);
        VerifyData verifyData = new VerifyData();
        verifyData.code = bsj0.m106251I(vMaterialEdit2);
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = bsj0.m106251I(textView);
        verifyData.mobileNumber = bsj0.m106255M(vMaterialEdit);
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.countryCode = bsj0.m106251I(textView);
        verifyData.mobileNumber = bsj0.m106255M(vMaterialEdit);
        FeedModule.m61405F().verify(verifyData).subscribe(psd0.m173600K(new y20() { // from class: l.i2h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148084l(act, dialog, x20Var, (uxj0) obj);
            }
        }, new y20() { // from class: l.j2h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148082k(act, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m148084l(Act act, Dialog dialog, x20 x20Var, uxj0 uxj0Var) {
        act.progressDismiss();
        mrb0.m159635M(FeedModule.m61405F().userId());
        l51.m152891K(act.getLocalClassName());
        o1j0.m165651y(act.string(R$string.f39955m5));
        m148111y0(dialog);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
            dialog.setOnDismissListener(null);
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m148085l0(Act act, Throwable th) {
        wf70.m206060l0(false);
        act.progressDismiss();
        i4h.m138538g(th);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m148088n(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m148089n0(Act act, x20 x20Var, uxj0 uxj0Var) {
        act.progressDismiss();
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m148090o(y20 y20Var, x20 x20Var) {
        if (NullChecker.m82486a(y20Var)) {
            y20Var.call(Boolean.TRUE);
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m148092p(View view, Act act, Dialog dialog, View view2) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + ((TextView) view.findViewById(hdc0.f108905c2)).getText().toString()));
        act.startActivity(intent);
        dialog.dismiss();
        tfj0.m190939b("e_user_passive_popup_number", "p_user_passive_popup", new tfj0.C20302a[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m148093p0(Bundle bundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m148094q(pf60 pf60Var) {
        return (String) pf60Var.f152156a;
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m148095q0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m148097r0(Dialog dialog, View view) {
        dialog.dismiss();
        tfj0.m190939b("e_user_passive_popup_cancel", "p_user_passive_popup", new tfj0.C20302a[0]);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m148100t(Throwable th) {
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m148101t0(final Act act, x20 x20Var, Moment moment, final x20 x20Var2) {
        act.progress(R$string.f39832U2, true);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        FeedModule.f39702c.m61910g3(moment.f56859id).subscribe(psd0.m173597H(new y20() { // from class: l.t1h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148089n0(act, x20Var2, (uxj0) obj);
            }
        }, new y20() { // from class: l.u1h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148067Z(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m148102u(VMaterialEdit vMaterialEdit, final VButton_FakeShadowSmall vButton_FakeShadowSmall, Act act, final VMaterialEdit vMaterialEdit2, uxj0 uxj0Var) {
        vMaterialEdit.requestFocus();
        vButton_FakeShadowSmall.setChecked(true);
        vButton_FakeShadowSmall.setClickable(false);
        vButton_FakeShadowSmall.setText(R$string.f39892d5);
        act.duringCreated(l51.m152894N(act.getLocalClassName(), 60)).subscribe(psd0.m173598I(new y20() { // from class: l.o2h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148110y(vButton_FakeShadowSmall, (Long) obj);
            }
        }, new y20() { // from class: l.p2h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148088n((Throwable) obj);
            }
        }, new x20() { // from class: l.q2h
            @Override // p153l.x20
            public final void call() {
                k3h.m148076h(vButton_FakeShadowSmall, vMaterialEdit2);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ boolean m148103u0(final Act act, final x20 x20Var, final Moment moment, final x20 x20Var2, MenuItem menuItem) {
        new mxg(act).m160662d(R$string.f39773K3).m160667i(R$string.f39983r, new Runnable() { // from class: l.f1h
            @Override // java.lang.Runnable
            public final void run() {
                k3h.m148101t0(act, x20Var, moment, x20Var2);
            }
        }).m160665g(R$string.f39865a).show();
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m148104v(final Act act, MomentMessage momentMessage) {
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = "";
        act.progress(R$string.f39832U2, true);
        mrb0.m159637O(momentMessage.owner, momentMessage.f56856id, report).subscribe(psd0.m173597H(new y20() { // from class: l.s2h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148080j(act, (uxj0) obj);
            }
        }, new y20() { // from class: l.t2h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148106w(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v0 */
    public static void m148105v0(Act act, String str, final x20 x20Var) {
        if (act == null || act.isFinishing()) {
            return;
        }
        act.creates(new y20() { // from class: l.d2h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148071d0((Bundle) obj);
            }
        }, new w1h());
        th0.C20312a c20312a = new th0.C20312a(act);
        c20312a.m191151j(str).m191158q(com.p051p1.mobile.putong.common.R$string.f18159h).m191156o(new View.OnClickListener() { // from class: l.e2h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k3h.m148078i(x20Var, view);
            }
        }).m191146e(R$string.f39865a).m191144c(new View.OnClickListener() { // from class: l.f2h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k3h.m148031C0();
            }
        });
        th0 th0VarM191142a = c20312a.m191142a();
        f123718b = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m148106w(Act act, Throwable th) {
        act.progressDismiss();
        i4h.m138538g(th);
    }

    /* JADX INFO: renamed from: w0 */
    public static void m148107w0(Act act, String str, final x20 x20Var) {
        if (act == null || act.isFinishing()) {
            return;
        }
        act.creates(new y20() { // from class: l.d3h
            @Override // p153l.y20
            public final void call(Object obj) {
                k3h.m148064W((Bundle) obj);
            }
        }, new w1h());
        th0.C20312a c20312a = new th0.C20312a(act);
        c20312a.m191160s(act.getString(R$string.f39900f)).m191151j(str).m191159r(act.getString(R$string.f39900f)).m191156o(new View.OnClickListener() { // from class: l.e3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k3h.m148062U(x20Var, view);
            }
        }).m191146e(R$string.f39865a).m191144c(new View.OnClickListener() { // from class: l.f3h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                k3h.m148031C0();
            }
        });
        th0 th0VarM191142a = c20312a.m191142a();
        f123718b = th0VarM191142a;
        th0VarM191142a.m191141g();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ boolean m148108x(Act act, String str, MenuItem menuItem) {
        orb0.m168875D(act, str, null, null, null, "moment_page");
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public static void m148109x0(Act act, String str, final Moment moment, y20<Boolean> y20Var, y20<Boolean> y20Var2, y20<FollowshipStatus> y20Var3, boolean z, boolean z2, boolean z3) {
        Menu menuM148039G0 = m148039G0(act, new MenuBuilder(act), str, new pcj() { // from class: l.v0h
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return k3h.m148081j0(moment);
            }
        }, null, null, y20Var, y20Var2, y20Var3, z, z2, z3);
        if (menuM148039G0.size() > 0) {
            act.dialog().m21539j0(menuM148039G0).m21567z0();
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m148110y(VButton_FakeShadowSmall vButton_FakeShadowSmall, Long l2) {
        long jLongValue = 60 - l2.longValue();
        if (jLongValue > 0) {
            vButton_FakeShadowSmall.setText(String.format("%ds", Long.valueOf(jLongValue)));
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static void m148111y0(@NonNull Dialog dialog) {
        try {
            Window window = dialog.getWindow();
            InputMethodManager inputMethodManager = (InputMethodManager) dialog.getContext().getSystemService("input_method");
            if (NullChecker.m82487b(window) && NullChecker.m82487b(inputMethodManager)) {
                window.setSoftInputMode(2);
                if (NullChecker.m82486a(window.getCurrentFocus())) {
                    inputMethodManager.hideSoftInputFromWindow(window.getCurrentFocus().getWindowToken(), 0);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                }
            }
        } catch (Exception e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m148112z(y20 y20Var, FollowshipStatus followshipStatus, MenuItem menuItem) {
        if (!NullChecker.m82486a(y20Var)) {
            return true;
        }
        y20Var.call(followshipStatus);
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public static void m148113z0(Act act, x20 x20Var) {
        m148027A0(act, x20Var, true);
    }
}
