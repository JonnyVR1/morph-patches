package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.Report;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.VerifyData;
import com.p046p1.mobile.putong.data.VerifyReason;
import com.p046p1.mobile.putong.data.Video;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.R$string;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationTitleShowType;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.slf4j.Marker;
import p147v.VButton_FakeShadowSmall;
import p147v.VListCell;
import p147v.VMaterialEdit;

/* JADX INFO: loaded from: classes12.dex */
public class v1h extends i0e {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    public static c40 f179233a;

    /* JADX INFO: renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    public static xh0 f179234b;

    /* JADX INFO: renamed from: A0 */
    public static void m196550A0(Act act, final d30 d30Var, boolean z) {
        xvg xvgVarM211288g = new xvg(act).m211291j(R$string.f39181y3).m211285d(R$string.f39169w3).m211288g(R$string.f39163v3);
        if (z) {
            xvgVarM211288g.m211290i(R$string.f39175x3, new Runnable() { // from class: l.pzg
                @Override // java.lang.Runnable
                public final void run() {
                    d30Var.call();
                }
            });
        }
        xvgVarM211288g.show();
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m196551B(Long l2) {
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: B0 */
    public static String m196552B0(Act act) {
        String line1Number;
        try {
            String[] strArr = new String[1];
            strArr[0] = Build.VERSION.SDK_INT <= 29 ? "android.permission.READ_PHONE_STATE" : "android.permission.READ_PHONE_NUMBERS";
            line1Number = PermissionHelper.m79881b(strArr) ? ((TelephonyManager) act.getSystemService("phone")).getLine1Number() : "";
        } catch (SecurityException unused) {
        }
        return (TextUtils.isEmpty(line1Number) || !line1Number.startsWith("+86")) ? "" : line1Number.substring(3);
    }

    /* JADX INFO: renamed from: C0 */
    public static void m196554C0() {
        if (NullChecker.m81303a(f179234b) && f179234b.m208718d()) {
            f179234b.m208717c();
            f179234b = null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m196555D(d30 d30Var, View view) {
        m196554C0();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static void m196556D0() {
        if (NullChecker.m81303a(f179233a) && f179233a.m105115d()) {
            f179233a.m105113b();
            f179233a = null;
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ boolean m196557E(boolean z, final d30 d30Var, Act act, final e30 e30Var, MenuItem menuItem) {
        if (z) {
            d30Var.call();
            return true;
        }
        new xvg(act).m211291j(R$string.f38997W3).m211285d(R$string.f39003X3).m211290i(R$string.f39094l, new Runnable() { // from class: l.tzg
            @Override // java.lang.Runnable
            public final void run() {
                v1h.m196613o(e30Var, d30Var);
            }
        }).m211288g(R$string.f39017a).show();
        q770.m173197l0(true);
        return true;
    }

    /* JADX INFO: renamed from: E0 */
    public static void m196558E0(final Act act, final int i) {
        new xvg(act).m211291j(R$string.f39134q4).m211284c(true).m211285d(R$string.f39127p4).m211290i(R$string.f39133q3, new Runnable() { // from class: l.szg
            @Override // java.lang.Runnable
            public final void run() {
                v1h.m196579P(act, i);
            }
        }).m211288g(R$string.f39017a).show();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m196559F(Dialog dialog, C4319c c4319c) {
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: F0 */
    public static Menu m196560F0(final Act act, Menu menu, final String str, v9j<Moment> v9jVar, final v9j<Media> v9jVar2, final d30 d30Var, final d30 d30Var2, final e30<Boolean> e30Var, final e30<Boolean> e30Var2, final e30<FollowshipStatus> e30Var3, boolean z, boolean z2, boolean z3, boolean z4) {
        final FollowshipStatus followshipStatus = null;
        final Moment momentCall = v9jVar == null ? null : v9jVar.call();
        if (rib0.m179488a().equals(str)) {
            if (NullChecker.m81303a(momentCall) && TEnum.equals(momentCall.status(), "normal")) {
                menu.add(act.getString(R$string.f38967R3)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.rzg
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return v1h.m196626u0(act, d30Var, momentCall, d30Var2, menuItem);
                    }
                });
            }
        } else if (!ijb0.m136560X(str).isTeamAccount()) {
            if (NullChecker.m81303a(momentCall) && momentCall.isLive && u2h.m191494c()) {
                User userM209447e8 = FeedModule.f38855d.m209447e8(str);
                if (NullChecker.m81303a(userM209447e8) && NullChecker.m81303a(userM209447e8.localRelationship) && !TEnum.equals(userM209447e8.localRelationship.state, "matched")) {
                    String string = act.getString(R$string.f38966R2);
                    if (NullChecker.m81303a(userM209447e8.localFollowship)) {
                        followshipStatus = userM209447e8.localFollowship.state;
                        if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                            string = act.getString(R$string.f38954P2);
                        } else if (TEnum.equals(userM209447e8.localFollowship.state, "matched")) {
                            string = act.getString(R$string.f38942N2);
                        }
                    }
                    menu.add(string).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.c0h
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            return v1h.m196635z(e30Var3, followshipStatus, menuItem);
                        }
                    });
                }
            }
            if (NullChecker.m81303a(momentCall)) {
                menu.add(act.getString(R$string.f38973S3)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.n0h
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return v1h.m196571L(act, str, momentCall, menuItem);
                    }
                });
            }
            if (z3) {
                List<String> listM121233n = FeedModule.f38854c.f39209M.m121233n();
                final boolean z5 = listM121233n != null && listM121233n.contains(str);
                final d30 d30Var3 = new d30() { // from class: l.y0h
                    @Override // p149l.d30
                    public final void call() {
                        v1h.m196600h0(act, str, z5, e30Var);
                    }
                };
                menu.add(act.getString(!z5 ? R$string.f39164v4 : R$string.f39182y4)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.j1h
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return v1h.m196557E(z5, d30Var3, act, e30Var2, menuItem);
                    }
                });
            }
            if (z) {
                menu.add(act.getString(R$string.f39188z4)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.r1h
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return v1h.m196631x(act, str, menuItem);
                    }
                });
            }
        }
        if (z2 && NullChecker.m81303a(momentCall) && !TextUtils.isEmpty(momentCall.value)) {
            menu.add(R$string.f39045e).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.s1h
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return v1h.m196598g0(momentCall, menuItem);
                }
            });
        }
        if (NullChecker.m81303a(v9jVar2) && z4) {
            menu.add(act.getString(R$string.f39115o)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.t1h
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return v1h.m196561G(act, v9jVar2, menuItem);
                }
            });
        }
        return menu;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ boolean m196561G(Act act, v9j v9jVar, MenuItem menuItem) {
        dmh.m112483k().m112485h(act, (Media) v9jVar.call());
        return true;
    }

    /* JADX INFO: renamed from: G0 */
    public static Menu m196562G0(Act act, Menu menu, String str, v9j<Moment> v9jVar, v9j<Media> v9jVar2, d30 d30Var, e30<Boolean> e30Var, e30<Boolean> e30Var2, e30<FollowshipStatus> e30Var3, boolean z, boolean z2, boolean z3) {
        return m196560F0(act, menu, str, v9jVar, v9jVar2, null, d30Var, e30Var, e30Var2, e30Var3, z, z2, z3, true);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m196563H(TextView textView, final VMaterialEdit vMaterialEdit, final VButton_FakeShadowSmall vButton_FakeShadowSmall, final VMaterialEdit vMaterialEdit2, final Act act, View view) {
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.m133885y();
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.m214931I(textView);
        verifyData.mobileNumber = yij0.m214935M(vMaterialEdit);
        xdl0.m208411y(vButton_FakeShadowSmall, false);
        vButton_FakeShadowSmall.setChecked(true);
        vButton_FakeShadowSmall.setText("...");
        FeedModule.m60221F().send(verifyData).subscribe(mkd0.m154959K(new e30() { // from class: l.l0h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196625u(vMaterialEdit2, vButton_FakeShadowSmall, act, vMaterialEdit, (roj0) obj);
            }
        }, new e30() { // from class: l.m0h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196575N(vButton_FakeShadowSmall, vMaterialEdit, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: H0 */
    public static void m196564H0(final Act act, final cwf0 cwf0Var) {
        final View viewInflate = act.inflater().inflate(o6c0.f142244n0, (ViewGroup) null);
        final Dialog dialogM20567z = act.dialog().m20516L(a8c0.f68019h).m20520P(viewInflate, false).m20496B(false).m20497B0(new DialogInterface.OnShowListener() { // from class: l.u1h
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                v1h.m196567J(cwf0Var, dialogInterface);
            }
        }).m20526V(new DialogInterface.OnDismissListener() { // from class: l.hzg
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.m133796e(cwf0Var);
            }
        }).m20567z();
        viewInflate.findViewById(b5c0.f73607s0).setOnClickListener(new View.OnClickListener() { // from class: l.izg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m196620r0(dialogM20567z, view);
            }
        });
        viewInflate.findViewById(b5c0.f73548b2).setOnClickListener(new View.OnClickListener() { // from class: l.jzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m196583S(dialogM20567z, view);
            }
        });
        viewInflate.findViewById(b5c0.f73552c2).setOnClickListener(new View.OnClickListener() { // from class: l.kzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m196615p(viewInflate, act, dialogM20567z, view);
            }
        });
        dialogM20567z.show();
        act.lifecycle().filter(new w9j() { // from class: l.lzg
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15549j);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.mzg
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196559F(dialogM20567z, (C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m196565I(Act act, boolean z, e30 e30Var, roj0 roj0Var) {
        act.supportInvalidateOptionsMenu();
        act.progressDismiss();
        if (!z) {
            act.hideInput();
        }
        lsi0.m151587q(z ? act.getString(R$string.f38985U3) : act.getString(R$string.f38979T3), act.getResources().getDrawable(f3c0.f94467Z1));
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.valueOf(!z));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static void m196566I0(Act act, String str) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_user_passive_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(ic50.m135327j().m135333f().m145235V("p_user_passive_show_nearby", j760.m140076a("userpassive_showfrom", "moment"), j760.m140076a("userpassive_word", str)));
        m196564H0(act, cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m196567J(cwf0 cwf0Var, DialogInterface dialogInterface) {
        ic50.m135327j().m135333f().m145241b0("p_user_passive_show_nearby", 0, false);
        i0e.m133797f(cwf0Var);
    }

    /* JADX INFO: renamed from: J0 */
    public static void m196568J0(Act act, String str) {
        cwf0 cwf0VarM133794c = i0e.m133794c("p_user_passive_popup", Dialog.class.getName());
        cwf0VarM133794c.m109040p(ic50.m135327j().m135333f().m145235V("p_user_passive_show_nearby", j760.m140076a("userpassive_showfrom", "moment_evaluate"), j760.m140076a("userpassive_word", str)));
        m196564H0(act, cwf0VarM133794c);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m196569K(boolean z, TextView textView, String str) {
        if (z) {
            textView.setText(str.replaceAll("\\+", ""));
        } else {
            textView.setText(str);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public static void m196570K0(Act act, String str, final d30 d30Var) {
        if (act == null || act.isFinishing()) {
            return;
        }
        act.creates(new e30() { // from class: l.g0h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196616p0((Bundle) obj);
            }
        }, new h0h());
        xh0.C21150a c21150a = new xh0.C21150a(act);
        c21150a.m208731j(str).m208738q(com.p046p1.mobile.putong.common.R$string.f17334I0).m208736o(new View.OnClickListener() { // from class: l.i0h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m196555D(d30Var, view);
            }
        }).m208726e(R$string.f39017a).m208724c(new View.OnClickListener() { // from class: l.j0h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m196554C0();
            }
        });
        xh0 xh0VarM208722a = c21150a.m208722a();
        f179234b = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ boolean m196571L(Act act, String str, Moment moment, MenuItem menuItem) {
        act.startActivity(kjb0.m146190a(act, str, false, null, moment.f56011id));
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    public static void m196572L0(final Act act, final String str, final String str2) {
        if (nkg.m159903r0()) {
            twh.m190860b(act, str, str2);
        } else {
            q770.m173197l0(true);
            m196574M0(act, new e30() { // from class: l.c1h
                @Override // p149l.e30
                public final void call(Object obj) {
                    v1h.m196589Y(act, str, str2, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m196573M(d30 d30Var, DialogInterface dialogInterface) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        w1h.m200929a();
    }

    /* JADX INFO: renamed from: M0 */
    public static void m196574M0(final Act act, final e30<String> e30Var) {
        if (act == null || act.isFinishing()) {
            return;
        }
        act.creates(new e30() { // from class: l.f1h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196618q0((Bundle) obj);
            }
        }, new d30() { // from class: l.g1h
            @Override // p149l.d30
            public final void call() {
                v1h.m196556D0();
            }
        });
        final ArrayList arrayListM200324f0 = vwb.m200324f0(act.string(R$string.f38950O4), act.string(R$string.f38914I4), act.string(R$string.f38908H4), act.string(R$string.f38932L4), act.string(R$string.f38920J4), act.string(R$string.f38956P4), act.string(R$string.f38938M4), act.string(R$string.f38944N4), act.string(R$string.f38926K4));
        c40.C16057b c16057b = new c40.C16057b(act);
        c16057b.m105155H(R$string.f39017a).m105168U(new View.OnClickListener() { // from class: l.h1h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m196556D0();
            }
        }).m105164Q(arrayListM200324f0).m105167T(new DialogInterface.OnDismissListener() { // from class: l.i1h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                q770.m173197l0(false);
            }
        }).m105169V(new c40.InterfaceC16059d() { // from class: l.k1h
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                v1h.m196577O(arrayListM200324f0, act, e30Var, vListCell, c22545a, i);
            }
        });
        c40 c40VarM105153F = c16057b.m105153F();
        f179233a = c40VarM105153F;
        c40VarM105153F.m105117f();
        q770.m173197l0(true);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m196575N(VButton_FakeShadowSmall vButton_FakeShadowSmall, VMaterialEdit vMaterialEdit, Throwable th) {
        vButton_FakeShadowSmall.setClickable(true);
        vButton_FakeShadowSmall.setChecked(false);
        vButton_FakeShadowSmall.setText(R$string.f39037c5);
        if (!vButton_FakeShadowSmall.isChecked()) {
            if (vMaterialEdit.getText().toString().isEmpty()) {
                xdl0.m208411y(vButton_FakeShadowSmall, false);
            } else {
                xdl0.m208411y(vButton_FakeShadowSmall, true);
            }
        }
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: N0 */
    public static void m196576N0(Act act, Media media, MomentMessage momentMessage) {
        final List<j760<String, Runnable>> listM196578O0 = m196578O0(act, media, momentMessage);
        act.dialog().m20535e0(vwb.m200303Q(listM196578O0, new w9j() { // from class: l.r0h
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return v1h.m196617q((j760) obj);
            }
        })).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.s0h
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                ((Runnable) ((j760) listM196578O0.get(i)).f116565b).run();
            }
        }).m20568z0();
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m196577O(ArrayList arrayList, final Act act, e30 e30Var, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        m196556D0();
        if (i != arrayList.size() - 1) {
            e30Var.call(c22545a.f209159a.toString());
            return;
        }
        Dialog dialogM133821n = i0e.m133795d(act).m133823p(true).m133815E(10).m133814D(100).m133816F(e30Var).m133821n();
        dialogM133821n.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.n1h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                v1h.m196595e0(act, dialogInterface);
            }
        });
        dialogM133821n.show();
        q770.m173197l0(true);
    }

    /* JADX INFO: renamed from: O0 */
    public static List<j760<String, Runnable>> m196578O0(final Act act, final Media media, final MomentMessage momentMessage) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.m200311Y(FeedModule.f38852a.getString(R$string.f39115o), new Runnable() { // from class: l.v0h
            @Override // java.lang.Runnable
            public final void run() {
                dmh.m112483k().m112485h(act, media);
            }
        }));
        if (NullChecker.m81303a(momentMessage) && !momentMessage.isMe() && !((Boolean) vwb.m200310X(ijb0.m136560X(momentMessage.owner), new w9j() { // from class: l.w0h
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).isTeamAccount());
            }
        }, Boolean.FALSE)).booleanValue()) {
            arrayList.add(vwb.m200311Y(FeedModule.f38852a.getString(media instanceof Video ? R$string.f39176x4 : R$string.f39170w4), new Runnable() { // from class: l.x0h
                @Override // java.lang.Runnable
                public final void run() {
                    v1h.m196627v(act, momentMessage);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m196579P(Act act, int i) {
        try {
            act.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), i);
        } catch (Exception e) {
            CrashHelper.m81296c(new Exception("Dlg location exception:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public static void m196580P0(final Act act, @NonNull final d30 d30Var, boolean z, @Nullable final d30 d30Var2, String str) {
        View viewInflate = act.inflater().inflate(o6c0.f142265q0, (ViewGroup) null);
        final TextView textView = (TextView) viewInflate.findViewById(b5c0.f73615v);
        final VMaterialEdit vMaterialEdit = (VMaterialEdit) viewInflate.findViewById(b5c0.f73576i2);
        final VMaterialEdit vMaterialEdit2 = (VMaterialEdit) viewInflate.findViewById(b5c0.f73621x);
        final VButton_FakeShadowSmall vButton_FakeShadowSmall = (VButton_FakeShadowSmall) viewInflate.findViewById(b5c0.f73517S);
        final boolean z2 = false;
        final Dialog dialogM20567z = act.dialog().m20559v().m20503E0(R$string.f39179y1).m20504F(act.getResources().getString(R$string.f39102m0)).m20520P(viewInflate, false).m20554s0(R$string.f39016Z4).m20541k0(R$string.f38998W4).m20496B(false).m20549q(false).m20526V(new DialogInterface.OnDismissListener() { // from class: l.uzg
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                v1h.m196573M(d30Var, dialogInterface);
            }
        }).m20567z();
        dialogM20567z.m20474o0(new Runnable() { // from class: l.vzg
            @Override // java.lang.Runnable
            public final void run() {
                v1h.m196606k0(vMaterialEdit, vMaterialEdit2, act, textView, dialogM20567z, d30Var2);
            }
        });
        dialogM20567z.m20472m0(new Runnable() { // from class: l.wzg
            @Override // java.lang.Runnable
            public final void run() {
                v1h.m196593c0(dialogM20567z);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.xzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedModule.m60221F().dialogCCode(act, new e30() { // from class: l.k0h
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        v1h.m196569K(z, textView, (String) obj);
                    }
                });
            }
        });
        vButton_FakeShadowSmall.setOnClickListener(new View.OnClickListener() { // from class: l.yzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m196563H(textView, vMaterialEdit, vButton_FakeShadowSmall, vMaterialEdit2, act, view);
            }
        });
        textView.setText(Marker.ANY_NON_NULL_MARKER + zqb.f204369d.get(0).f204372b);
        if (e51.m114737B(act.getLocalClassName())) {
            vButton_FakeShadowSmall.setChecked(true);
            vButton_FakeShadowSmall.setClickable(false);
            vButton_FakeShadowSmall.setText(R$string.f39044d5);
            act.duringCreated(e51.m114749N(act.getLocalClassName(), 60)).subscribe(mkd0.m154957I(new e30() { // from class: l.zzg
                @Override // p149l.e30
                public final void call(Object obj) {
                    v1h.m196551B((Long) obj);
                }
            }, new e30() { // from class: l.a0h
                @Override // p149l.e30
                public final void call(Object obj) {
                    v1h.m196623t((Throwable) obj);
                }
            }, new d30() { // from class: l.b0h
                @Override // p149l.d30
                public final void call() {
                    v1h.m196584T(vButton_FakeShadowSmall, vMaterialEdit);
                }
            }));
        } else {
            xdl0.m208411y(vButton_FakeShadowSmall, vMaterialEdit.getText().length() > 0);
        }
        vMaterialEdit.m223127H().subscribe(mkd0.m154955G(new e30() { // from class: l.d0h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196581Q(vButton_FakeShadowSmall, vMaterialEdit, (CharSequence) obj);
            }
        }));
        String strM196552B0 = m196552B0(act);
        if (!TextUtils.isEmpty(strM196552B0)) {
            vMaterialEdit.setText(strM196552B0);
        }
        w1h.m200930b(new String[]{z ? "on" : BLiveOperationTitleShowType.off}[0], new String[]{TextUtils.isEmpty(vMaterialEdit.getText().toString()) ? "no_number" : "secret_number"}[0], str);
        dialogM20567z.show();
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m196581Q(VButton_FakeShadowSmall vButton_FakeShadowSmall, VMaterialEdit vMaterialEdit, CharSequence charSequence) {
        if (vButton_FakeShadowSmall.isChecked()) {
            return;
        }
        if (vMaterialEdit.getText().toString().isEmpty()) {
            xdl0.m208411y(vButton_FakeShadowSmall, false);
        } else {
            xdl0.m208411y(vButton_FakeShadowSmall, true);
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m196583S(Dialog dialog, View view) {
        dialog.dismiss();
        p6j0.m167668b("e_user_passive_popup_ok", "p_user_passive_popup", new p6j0.C19147a[0]);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m196584T(VButton_FakeShadowSmall vButton_FakeShadowSmall, VMaterialEdit vMaterialEdit) {
        vButton_FakeShadowSmall.setChecked(false);
        vButton_FakeShadowSmall.setText(R$string.f39037c5);
        if (vButton_FakeShadowSmall.isChecked()) {
            return;
        }
        if (vMaterialEdit.getText().toString().isEmpty()) {
            xdl0.m208411y(vButton_FakeShadowSmall, false);
        } else {
            xdl0.m208411y(vButton_FakeShadowSmall, true);
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m196585U(d30 d30Var, View view) {
        m196554C0();
        if (NullChecker.m81303a(view)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m196587W(Bundle bundle) {
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m196588X(Act act, roj0 roj0Var) {
        act.progressDismiss();
        q770.m173197l0(false);
        lsi0.m151595y(it6.m138181b(R$string.f38962Q4, R$string.f38902G4));
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m196589Y(final Act act, String str, String str2, String str3) {
        act.progress(R$string.f38984U2, true);
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = str3;
        FeedModule.f38854c.m60753t4(str, str2, report).subscribe(mkd0.m154956H(new e30() { // from class: l.l1h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196588X(act, (roj0) obj);
            }
        }, new e30() { // from class: l.m1h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196608l0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m196590Z(Act act, Throwable th) {
        t2h.m186976g(th);
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m196593c0(Dialog dialog) {
        m196634y0(dialog);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m196594d0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m196595e0(Act act, DialogInterface dialogInterface) {
        q770.m173197l0(false);
        Objects.requireNonNull(act);
        e51.m114743H(act, new g320(act), 100L);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ boolean m196598g0(Moment moment, MenuItem menuItem) {
        e51.m114766q(moment.value);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m196599h(VButton_FakeShadowSmall vButton_FakeShadowSmall, VMaterialEdit vMaterialEdit) {
        vButton_FakeShadowSmall.setChecked(false);
        vButton_FakeShadowSmall.setText(R$string.f39037c5);
        if (vButton_FakeShadowSmall.isChecked()) {
            return;
        }
        if (vMaterialEdit.getText().toString().isEmpty()) {
            xdl0.m208411y(vButton_FakeShadowSmall, false);
        } else {
            xdl0.m208411y(vButton_FakeShadowSmall, true);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m196600h0(final Act act, String str, final boolean z, final e30 e30Var) {
        q770.m173197l0(false);
        act.progress(R$string.f38984U2, true);
        FeedModule.f38854c.f39209M.m60772M(str, !z).subscribe(mkd0.m154956H(new e30() { // from class: l.nzg
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196565I(act, z, e30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.ozg
            @Override // p149l.e30
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m196601i(d30 d30Var, View view) {
        m196554C0();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m196603j(Act act, roj0 roj0Var) {
        act.progressDismiss();
        lsi0.m151595y(it6.m138181b(R$string.f38962Q4, R$string.f38902G4));
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Moment m196604j0(Moment moment) {
        return moment;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m196605k(Act act, Throwable th) {
        act.progressDismiss();
        yij0.m214926D(th);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m196606k0(VMaterialEdit vMaterialEdit, VMaterialEdit vMaterialEdit2, final Act act, TextView textView, final Dialog dialog, final d30 d30Var) {
        if (TextUtils.isEmpty(vMaterialEdit.getText()) || TextUtils.isEmpty(vMaterialEdit2.getText())) {
            return;
        }
        act.progress(R$string.f38984U2);
        VerifyData verifyData = new VerifyData();
        verifyData.code = yij0.m214931I(vMaterialEdit2);
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.m214931I(textView);
        verifyData.mobileNumber = yij0.m214935M(vMaterialEdit);
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.countryCode = yij0.m214931I(textView);
        verifyData.mobileNumber = yij0.m214935M(vMaterialEdit);
        FeedModule.m60221F().verify(verifyData).subscribe(mkd0.m154959K(new e30() { // from class: l.t0h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196607l(act, dialog, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.u0h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196605k(act, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m196607l(Act act, Dialog dialog, d30 d30Var, roj0 roj0Var) {
        act.progressDismiss();
        ijb0.m136549M(FeedModule.m60221F().userId());
        e51.m114746K(act.getLocalClassName());
        lsi0.m151595y(act.string(R$string.f39107m5));
        m196634y0(dialog);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
            dialog.setOnDismissListener(null);
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m196608l0(Act act, Throwable th) {
        q770.m173197l0(false);
        act.progressDismiss();
        t2h.m186976g(th);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m196611n(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m196612n0(Act act, d30 d30Var, roj0 roj0Var) {
        act.progressDismiss();
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m196613o(e30 e30Var, d30 d30Var) {
        if (NullChecker.m81303a(e30Var)) {
            e30Var.call(Boolean.TRUE);
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m196615p(View view, Act act, Dialog dialog, View view2) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + ((TextView) view.findViewById(b5c0.f73552c2)).getText().toString()));
        act.startActivity(intent);
        dialog.dismiss();
        p6j0.m167668b("e_user_passive_popup_number", "p_user_passive_popup", new p6j0.C19147a[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m196616p0(Bundle bundle) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m196617q(j760 j760Var) {
        return (String) j760Var.f116564a;
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m196618q0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m196620r0(Dialog dialog, View view) {
        dialog.dismiss();
        p6j0.m167668b("e_user_passive_popup_cancel", "p_user_passive_popup", new p6j0.C19147a[0]);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m196623t(Throwable th) {
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m196624t0(final Act act, d30 d30Var, Moment moment, final d30 d30Var2) {
        act.progress(R$string.f38984U2, true);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        FeedModule.f38854c.m60726g3(moment.f56011id).subscribe(mkd0.m154956H(new e30() { // from class: l.e0h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196612n0(act, d30Var2, (roj0) obj);
            }
        }, new e30() { // from class: l.f0h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196590Z(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m196625u(VMaterialEdit vMaterialEdit, final VButton_FakeShadowSmall vButton_FakeShadowSmall, Act act, final VMaterialEdit vMaterialEdit2, roj0 roj0Var) {
        vMaterialEdit.requestFocus();
        vButton_FakeShadowSmall.setChecked(true);
        vButton_FakeShadowSmall.setClickable(false);
        vButton_FakeShadowSmall.setText(R$string.f39044d5);
        act.duringCreated(e51.m114749N(act.getLocalClassName(), 60)).subscribe(mkd0.m154957I(new e30() { // from class: l.z0h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196633y(vButton_FakeShadowSmall, (Long) obj);
            }
        }, new e30() { // from class: l.a1h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196611n((Throwable) obj);
            }
        }, new d30() { // from class: l.b1h
            @Override // p149l.d30
            public final void call() {
                v1h.m196599h(vButton_FakeShadowSmall, vMaterialEdit2);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ boolean m196626u0(final Act act, final d30 d30Var, final Moment moment, final d30 d30Var2, MenuItem menuItem) {
        new xvg(act).m211285d(R$string.f38925K3).m211290i(R$string.f39135r, new Runnable() { // from class: l.qzg
            @Override // java.lang.Runnable
            public final void run() {
                v1h.m196624t0(act, d30Var, moment, d30Var2);
            }
        }).m211288g(R$string.f39017a).show();
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m196627v(final Act act, MomentMessage momentMessage) {
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = "";
        act.progress(R$string.f38984U2, true);
        ijb0.m136551O(momentMessage.owner, momentMessage.f56008id, report).subscribe(mkd0.m154956H(new e30() { // from class: l.d1h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196603j(act, (roj0) obj);
            }
        }, new e30() { // from class: l.e1h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196629w(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v0 */
    public static void m196628v0(Act act, String str, final d30 d30Var) {
        if (act == null || act.isFinishing()) {
            return;
        }
        act.creates(new e30() { // from class: l.o0h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196594d0((Bundle) obj);
            }
        }, new h0h());
        xh0.C21150a c21150a = new xh0.C21150a(act);
        c21150a.m208731j(str).m208738q(com.p046p1.mobile.putong.common.R$string.f17440h).m208736o(new View.OnClickListener() { // from class: l.p0h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m196601i(d30Var, view);
            }
        }).m208726e(R$string.f39017a).m208724c(new View.OnClickListener() { // from class: l.q0h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m196554C0();
            }
        });
        xh0 xh0VarM208722a = c21150a.m208722a();
        f179234b = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m196629w(Act act, Throwable th) {
        act.progressDismiss();
        t2h.m186976g(th);
    }

    /* JADX INFO: renamed from: w0 */
    public static void m196630w0(Act act, String str, final d30 d30Var) {
        if (act == null || act.isFinishing()) {
            return;
        }
        act.creates(new e30() { // from class: l.o1h
            @Override // p149l.e30
            public final void call(Object obj) {
                v1h.m196587W((Bundle) obj);
            }
        }, new h0h());
        xh0.C21150a c21150a = new xh0.C21150a(act);
        c21150a.m208740s(act.getString(R$string.f39052f)).m208731j(str).m208739r(act.getString(R$string.f39052f)).m208736o(new View.OnClickListener() { // from class: l.p1h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m196585U(d30Var, view);
            }
        }).m208726e(R$string.f39017a).m208724c(new View.OnClickListener() { // from class: l.q1h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m196554C0();
            }
        });
        xh0 xh0VarM208722a = c21150a.m208722a();
        f179234b = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ boolean m196631x(Act act, String str, MenuItem menuItem) {
        kjb0.m146181D(act, str, null, null, null, "moment_page");
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public static void m196632x0(Act act, String str, final Moment moment, e30<Boolean> e30Var, e30<Boolean> e30Var2, e30<FollowshipStatus> e30Var3, boolean z, boolean z2, boolean z3) {
        Menu menuM196562G0 = m196562G0(act, new MenuBuilder(act), str, new v9j() { // from class: l.gzg
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return v1h.m196604j0(moment);
            }
        }, null, null, e30Var, e30Var2, e30Var3, z, z2, z3);
        if (menuM196562G0.size() > 0) {
            act.dialog().m20540j0(menuM196562G0).m20568z0();
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m196633y(VButton_FakeShadowSmall vButton_FakeShadowSmall, Long l2) {
        long jLongValue = 60 - l2.longValue();
        if (jLongValue > 0) {
            vButton_FakeShadowSmall.setText(String.format("%ds", Long.valueOf(jLongValue)));
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static void m196634y0(@NonNull Dialog dialog) {
        try {
            Window window = dialog.getWindow();
            InputMethodManager inputMethodManager = (InputMethodManager) dialog.getContext().getSystemService("input_method");
            if (NullChecker.m81304b(window) && NullChecker.m81304b(inputMethodManager)) {
                window.setSoftInputMode(2);
                if (NullChecker.m81303a(window.getCurrentFocus())) {
                    inputMethodManager.hideSoftInputFromWindow(window.getCurrentFocus().getWindowToken(), 0);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                }
            }
        } catch (Exception e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m196635z(e30 e30Var, FollowshipStatus followshipStatus, MenuItem menuItem) {
        if (!NullChecker.m81303a(e30Var)) {
            return true;
        }
        e30Var.call(followshipStatus);
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public static void m196636z0(Act act, d30 d30Var) {
        m196550A0(act, d30Var, true);
    }
}
