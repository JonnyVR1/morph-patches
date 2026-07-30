package p007l;

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
import com.p000p1.mobile.putong.data.FollowshipStatus;
import com.p000p1.mobile.putong.data.Media;
import com.p000p1.mobile.putong.data.Report;
import com.p000p1.mobile.putong.data.User;
import com.p000p1.mobile.putong.data.VerifyData;
import com.p000p1.mobile.putong.data.VerifyReason;
import com.p000p1.mobile.putong.data.Video;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p000p1.mobile.putong.feed.FeedModule;
import com.p000p1.mobile.putong.feed.R$string;
import com.p000p1.mobile.putong.feed.data.Moment;
import com.p000p1.mobile.putong.feed.data.MomentMessage;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.common.R;
import com.p1.mobile.putong.ui.permission.PermissionHelper;
import com.tantanapp.common.data.CopyObject;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import l.c40;
import l.cwf0;
import l.d30;
import l.e30;
import l.e51;
import l.g320;
import l.i0e;
import l.i0g0;
import l.ic50;
import l.it6;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.v9j;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xh0;
import l.yij0;
import v.VButton_FakeShadowSmall;
import v.VListCell;
import v.VMaterialEdit;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class v1h extends i0e {

    /* JADX INFO: renamed from: a */
    @SuppressLint({"StaticFieldLeak"})
    public static c40 f14017a;

    /* JADX INFO: renamed from: b */
    @SuppressLint({"StaticFieldLeak"})
    public static xh0 f14018b;

    /* JADX INFO: renamed from: A0 */
    public static void m15189A0(Act act, final d30 d30Var, boolean z) {
        xvg xvgVarM16861g = new xvg(act).m16864j(R$string.f642y3).m16858d(R$string.f630w3).m16861g(R$string.f624v3);
        if (z) {
            xvgVarM16861g.m16863i(R$string.f636x3, new Runnable() { // from class: l.pzg
                @Override // java.lang.Runnable
                public final void run() {
                    d30Var.call();
                }
            });
        }
        xvgVarM16861g.show();
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m15190B(Long l2) {
    }

    @SuppressLint({"MissingPermission"})
    /* JADX INFO: renamed from: B0 */
    public static String m15191B0(Act act) {
        String line1Number;
        try {
            String[] strArr = new String[1];
            strArr[0] = Build.VERSION.SDK_INT <= 29 ? "android.permission.READ_PHONE_STATE" : "android.permission.READ_PHONE_NUMBERS";
            line1Number = PermissionHelper.b(strArr) ? ((TelephonyManager) act.getSystemService("phone")).getLine1Number() : "";
        } catch (SecurityException unused) {
        }
        return (TextUtils.isEmpty(line1Number) || !line1Number.startsWith("+86")) ? "" : line1Number.substring(3);
    }

    /* JADX INFO: renamed from: C0 */
    public static void m15193C0() {
        if (NullChecker.a(f14018b) && f14018b.d()) {
            f14018b.c();
            f14018b = null;
        }
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ void m15194D(d30 d30Var, View view) {
        m15193C0();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: D0 */
    public static void m15195D0() {
        if (NullChecker.a(f14017a) && f14017a.d()) {
            f14017a.b();
            f14017a = null;
        }
    }

    /* JADX INFO: renamed from: E */
    public static /* synthetic */ boolean m15196E(boolean z, final d30 d30Var, Act act, final e30 e30Var, MenuItem menuItem) {
        if (z) {
            d30Var.call();
            return true;
        }
        new xvg(act).m16864j(R$string.f458W3).m16858d(R$string.f464X3).m16863i(R$string.f555l, new Runnable() { // from class: l.tzg
            @Override // java.lang.Runnable
            public final void run() {
                v1h.m15252o(e30Var, d30Var);
            }
        }).m16861g(R$string.f478a).show();
        q770.m13441l0(true);
        return true;
    }

    /* JADX INFO: renamed from: E0 */
    public static void m15197E0(final Act act, final int i) {
        new xvg(act).m16864j(R$string.f595q4).m16857c(true).m16858d(R$string.f588p4).m16863i(R$string.f594q3, new Runnable() { // from class: l.szg
            @Override // java.lang.Runnable
            public final void run() {
                v1h.m15218P(act, i);
            }
        }).m16861g(R$string.f478a).show();
    }

    /* JADX INFO: renamed from: F */
    public static /* synthetic */ void m15198F(Dialog dialog, c cVar) {
        if (dialog == null || !dialog.isShowing()) {
            return;
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: F0 */
    public static Menu m15199F0(final Act act, Menu menu, final String str, v9j<Moment> v9jVar, final v9j<Media> v9jVar2, final d30 d30Var, final d30 d30Var2, final e30<Boolean> e30Var, final e30<Boolean> e30Var2, final e30<FollowshipStatus> e30Var3, boolean z, boolean z2, boolean z3, boolean z4) {
        final FollowshipStatus followshipStatus = null;
        final Moment moment = v9jVar == null ? null : (Moment) v9jVar.call();
        if (rib0.m13904a().equals(str)) {
            if (NullChecker.a(moment) && TEnum.equals(moment.status(), "normal")) {
                menu.add(act.getString(R$string.f428R3)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.rzg
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return v1h.m15265u0(act, d30Var, moment, d30Var2, menuItem);
                    }
                });
            }
        } else if (!ijb0.m10913X(str).isTeamAccount()) {
            if (NullChecker.a(moment) && moment.isLive && u2h.m14718c()) {
                User userM16628e8 = FeedModule.f316d.m16628e8(str);
                if (NullChecker.a(userM16628e8) && NullChecker.a(userM16628e8.localRelationship) && !TEnum.equals(userM16628e8.localRelationship.state, "matched")) {
                    String string = act.getString(R$string.f427R2);
                    if (NullChecker.a(userM16628e8.localFollowship)) {
                        followshipStatus = userM16628e8.localFollowship.state;
                        if (TEnum.equals(followshipStatus, FollowshipStatus.following)) {
                            string = act.getString(R$string.f415P2);
                        } else if (TEnum.equals(userM16628e8.localFollowship.state, "matched")) {
                            string = act.getString(R$string.f403N2);
                        }
                    }
                    menu.add(string).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.c0h
                        @Override // android.view.MenuItem.OnMenuItemClickListener
                        public final boolean onMenuItemClick(MenuItem menuItem) {
                            return v1h.m15274z(e30Var3, followshipStatus, menuItem);
                        }
                    });
                }
            }
            if (NullChecker.a(moment)) {
                menu.add(act.getString(R$string.f434S3)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.n0h
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return v1h.m15210L(act, str, moment, menuItem);
                    }
                });
            }
            if (z3) {
                List list = (List) FeedModule.f315c.f670M.n();
                final boolean z5 = list != null && list.contains(str);
                final d30 d30Var3 = new d30() { // from class: l.y0h
                    public final void call() {
                        v1h.m15239h0(act, str, z5, e30Var);
                    }
                };
                menu.add(act.getString(!z5 ? R$string.f625v4 : R$string.f643y4)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.j1h
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return v1h.m15196E(z5, d30Var3, act, e30Var2, menuItem);
                    }
                });
            }
            if (z) {
                menu.add(act.getString(R$string.f649z4)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.r1h
                    @Override // android.view.MenuItem.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        return v1h.m15270x(act, str, menuItem);
                    }
                });
            }
        }
        if (z2 && NullChecker.a(moment) && !TextUtils.isEmpty(moment.value)) {
            menu.add(R$string.f506e).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.s1h
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return v1h.m15237g0(moment, menuItem);
                }
            });
        }
        if (NullChecker.a(v9jVar2) && z4) {
            menu.add(act.getString(R$string.f576o)).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() { // from class: l.t1h
                @Override // android.view.MenuItem.OnMenuItemClickListener
                public final boolean onMenuItemClick(MenuItem menuItem) {
                    return v1h.m15200G(act, v9jVar2, menuItem);
                }
            });
        }
        return menu;
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ boolean m15200G(Act act, v9j v9jVar, MenuItem menuItem) {
        dmh.m9487k().m9489h(act, (Media) v9jVar.call());
        return true;
    }

    /* JADX INFO: renamed from: G0 */
    public static Menu m15201G0(Act act, Menu menu, String str, v9j<Moment> v9jVar, v9j<Media> v9jVar2, d30 d30Var, e30<Boolean> e30Var, e30<Boolean> e30Var2, e30<FollowshipStatus> e30Var3, boolean z, boolean z2, boolean z3) {
        return m15199F0(act, menu, str, v9jVar, v9jVar2, null, d30Var, e30Var, e30Var2, e30Var3, z, z2, z3, true);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m15202H(TextView textView, final VMaterialEdit vMaterialEdit, final VButton_FakeShadowSmall vButton_FakeShadowSmall, final VMaterialEdit vMaterialEdit2, final Act act, View view) {
        VerifyData verifyData = new VerifyData();
        verifyData.language = i0g0.y();
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.I(textView);
        verifyData.mobileNumber = yij0.M(vMaterialEdit);
        xdl0.y(vButton_FakeShadowSmall, false);
        vButton_FakeShadowSmall.setChecked(true);
        vButton_FakeShadowSmall.setText("...");
        FeedModule.m1139F().send(verifyData).subscribe(mkd0.K(new e30() { // from class: l.l0h
            public final void call(Object obj) {
                v1h.m15264u(vMaterialEdit2, vButton_FakeShadowSmall, act, vMaterialEdit, (roj0) obj);
            }
        }, new e30() { // from class: l.m0h
            public final void call(Object obj) {
                v1h.m15214N(vButton_FakeShadowSmall, vMaterialEdit, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: H0 */
    public static void m15203H0(final Act act, final cwf0 cwf0Var) {
        final View viewInflate = act.inflater().inflate(o6c0.f11263n0, (ViewGroup) null);
        final Dialog dialogZ = act.dialog().L(a8c0.f5639h).P(viewInflate, false).B(false).B0(new DialogInterface.OnShowListener() { // from class: l.u1h
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                v1h.m15206J(cwf0Var, dialogInterface);
            }
        }).V(new DialogInterface.OnDismissListener() { // from class: l.hzg
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                i0e.e(cwf0Var);
            }
        }).z();
        viewInflate.findViewById(b5c0.f6088s0).setOnClickListener(new View.OnClickListener() { // from class: l.izg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m15259r0(dialogZ, view);
            }
        });
        viewInflate.findViewById(b5c0.f6029b2).setOnClickListener(new View.OnClickListener() { // from class: l.jzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m15222S(dialogZ, view);
            }
        });
        viewInflate.findViewById(b5c0.f6033c2).setOnClickListener(new View.OnClickListener() { // from class: l.kzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m15254p(viewInflate, act, dialogZ, view);
            }
        });
        dialogZ.show();
        act.lifecycle().filter(new w9j() { // from class: l.lzg
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.j);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.mzg
            public final void call(Object obj) {
                v1h.m15198F(dialogZ, (c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ void m15204I(Act act, boolean z, e30 e30Var, roj0 roj0Var) {
        act.supportInvalidateOptionsMenu();
        act.progressDismiss();
        if (!z) {
            act.hideInput();
        }
        lsi0.q(z ? act.getString(R$string.f446U3) : act.getString(R$string.f440T3), act.getResources().getDrawable(f3c0.f7750Z1));
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.valueOf(!z));
        }
    }

    /* JADX INFO: renamed from: I0 */
    public static void m15205I0(Act act, String str) {
        cwf0 cwf0VarC = i0e.c("p_user_passive_popup", Dialog.class.getName());
        cwf0VarC.p(ic50.j().f().V("p_user_passive_show_nearby", new j760[]{j760.a("userpassive_showfrom", "moment"), j760.a("userpassive_word", str)}));
        m15203H0(act, cwf0VarC);
    }

    /* JADX INFO: renamed from: J */
    public static /* synthetic */ void m15206J(cwf0 cwf0Var, DialogInterface dialogInterface) {
        ic50.j().f().b0("p_user_passive_show_nearby", 0, false);
        i0e.f(cwf0Var);
    }

    /* JADX INFO: renamed from: J0 */
    public static void m15207J0(Act act, String str) {
        cwf0 cwf0VarC = i0e.c("p_user_passive_popup", Dialog.class.getName());
        cwf0VarC.p(ic50.j().f().V("p_user_passive_show_nearby", new j760[]{j760.a("userpassive_showfrom", "moment_evaluate"), j760.a("userpassive_word", str)}));
        m15203H0(act, cwf0VarC);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m15208K(boolean z, TextView textView, String str) {
        if (z) {
            textView.setText(str.replaceAll("\\+", ""));
        } else {
            textView.setText(str);
        }
    }

    /* JADX INFO: renamed from: K0 */
    public static void m15209K0(Act act, String str, final d30 d30Var) {
        if (act == null || act.isFinishing()) {
            return;
        }
        act.creates(new e30() { // from class: l.g0h
            public final void call(Object obj) {
                v1h.m15255p0((Bundle) obj);
            }
        }, new h0h());
        xh0.a aVar = new xh0.a(act);
        aVar.j(str).q(R.string.I0).o(new View.OnClickListener() { // from class: l.i0h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m15194D(d30Var, view);
            }
        }).e(R$string.f478a).c(new View.OnClickListener() { // from class: l.j0h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m15193C0();
            }
        });
        xh0 xh0VarA = aVar.a();
        f14018b = xh0VarA;
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ boolean m15210L(Act act, String str, Moment moment, MenuItem menuItem) {
        act.startActivity(kjb0.m11449a(act, str, false, null, ((DbObject) moment).id));
        return true;
    }

    /* JADX INFO: renamed from: L0 */
    public static void m15211L0(final Act act, final String str, final String str2) {
        if (nkg.m12262r0()) {
            twh.m14674b(act, str, str2);
        } else {
            q770.m13441l0(true);
            m15213M0(act, new e30() { // from class: l.c1h
                public final void call(Object obj) {
                    v1h.m15228Y(act, str, str2, (String) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m15212M(d30 d30Var, DialogInterface dialogInterface) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        w1h.m15670a();
    }

    /* JADX INFO: renamed from: M0 */
    public static void m15213M0(final Act act, final e30<String> e30Var) {
        if (act == null || act.isFinishing()) {
            return;
        }
        act.creates(new e30() { // from class: l.f1h
            public final void call(Object obj) {
                v1h.m15257q0((Bundle) obj);
            }
        }, new d30() { // from class: l.g1h
            public final void call() {
                v1h.m15195D0();
            }
        });
        final ArrayList arrayListF0 = vwb.f0(new CharSequence[]{act.string(R$string.f411O4), act.string(R$string.f375I4), act.string(R$string.f369H4), act.string(R$string.f393L4), act.string(R$string.f381J4), act.string(R$string.f417P4), act.string(R$string.f399M4), act.string(R$string.f405N4), act.string(R$string.f387K4)});
        c40.b bVar = new c40.b(act);
        bVar.H(R$string.f478a).U(new View.OnClickListener() { // from class: l.h1h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m15195D0();
            }
        }).Q(arrayListF0).T(new DialogInterface.OnDismissListener() { // from class: l.i1h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                q770.m13441l0(false);
            }
        }).V(new c40.d() { // from class: l.k1h
            /* JADX INFO: renamed from: a */
            public final void m11384a(VListCell vListCell, VListCell.a aVar, int i) {
                v1h.m15216O(arrayListF0, act, e30Var, vListCell, aVar, i);
            }
        });
        c40 c40VarF = bVar.F();
        f14017a = c40VarF;
        c40VarF.f();
        q770.m13441l0(true);
    }

    /* JADX INFO: renamed from: N */
    public static /* synthetic */ void m15214N(VButton_FakeShadowSmall vButton_FakeShadowSmall, VMaterialEdit vMaterialEdit, Throwable th) {
        vButton_FakeShadowSmall.setClickable(true);
        vButton_FakeShadowSmall.setChecked(false);
        vButton_FakeShadowSmall.setText(R$string.f498c5);
        if (!vButton_FakeShadowSmall.isChecked()) {
            if (vMaterialEdit.getText().toString().isEmpty()) {
                xdl0.y(vButton_FakeShadowSmall, false);
            } else {
                xdl0.y(vButton_FakeShadowSmall, true);
            }
        }
        yij0.D(th);
    }

    /* JADX INFO: renamed from: N0 */
    public static void m15215N0(Act act, Media media, MomentMessage momentMessage) {
        final List<j760<String, Runnable>> listM15217O0 = m15217O0(act, media, momentMessage);
        act.dialog().e0(vwb.Q(listM15217O0, new w9j() { // from class: l.r0h
            public final Object call(Object obj) {
                return v1h.m15256q((j760) obj);
            }
        })).g0(new Dialog.g() { // from class: l.s0h
            /* JADX INFO: renamed from: a */
            public final void m13976a(Dialog dialog, View view, int i, CharSequence charSequence) {
                ((Runnable) ((j760) listM15217O0.get(i)).b).run();
            }
        }).z0();
    }

    /* JADX INFO: renamed from: O */
    public static /* synthetic */ void m15216O(ArrayList arrayList, final Act act, e30 e30Var, VListCell vListCell, VListCell.a aVar, int i) {
        m15195D0();
        if (i != arrayList.size() - 1) {
            e30Var.call(aVar.a.toString());
            return;
        }
        Dialog dialogN = i0e.d(act).p(true).E(10).D(100).F(e30Var).n();
        dialogN.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.n1h
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                v1h.m15234e0(act, dialogInterface);
            }
        });
        dialogN.show();
        q770.m13441l0(true);
    }

    /* JADX INFO: renamed from: O0 */
    public static List<j760<String, Runnable>> m15217O0(final Act act, final Media media, final MomentMessage momentMessage) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(vwb.Y(FeedModule.f313a.getString(R$string.f576o), new Runnable() { // from class: l.v0h
            @Override // java.lang.Runnable
            public final void run() {
                dmh.m9487k().m9489h(act, media);
            }
        }));
        if (NullChecker.a(momentMessage) && !momentMessage.isMe() && !((Boolean) vwb.X(ijb0.m10913X(momentMessage.owner), new w9j() { // from class: l.w0h
            public final Object call(Object obj) {
                return Boolean.valueOf(((User) obj).isTeamAccount());
            }
        }, Boolean.FALSE)).booleanValue()) {
            arrayList.add(vwb.Y(FeedModule.f313a.getString(media instanceof Video ? R$string.f637x4 : R$string.f631w4), new Runnable() { // from class: l.x0h
                @Override // java.lang.Runnable
                public final void run() {
                    v1h.m15266v(act, momentMessage);
                }
            }));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m15218P(Act act, int i) {
        try {
            act.startActivityForResult(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"), i);
        } catch (Exception e) {
            CrashHelper.c(new Exception("Dlg location exception:" + e.getMessage(), e));
        }
    }

    /* JADX INFO: renamed from: P0 */
    public static void m15219P0(final Act act, @NonNull final d30 d30Var, boolean z, @Nullable final d30 d30Var2, String str) {
        View viewInflate = act.inflater().inflate(o6c0.f11284q0, (ViewGroup) null);
        final TextView textView = (TextView) viewInflate.findViewById(b5c0.f6096v);
        final VMaterialEdit vMaterialEditFindViewById = viewInflate.findViewById(b5c0.f6057i2);
        final VMaterialEdit vMaterialEditFindViewById2 = viewInflate.findViewById(b5c0.f6102x);
        final VButton_FakeShadowSmall vButton_FakeShadowSmallFindViewById = viewInflate.findViewById(b5c0.f5998S);
        final boolean z2 = false;
        final Dialog dialogZ = act.dialog().v().E0(R$string.f640y1).F(act.getResources().getString(R$string.f563m0)).P(viewInflate, false).s0(R$string.f477Z4).k0(R$string.f459W4).B(false).q(false).V(new DialogInterface.OnDismissListener() { // from class: l.uzg
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                v1h.m15212M(d30Var, dialogInterface);
            }
        }).z();
        dialogZ.o0(new Runnable() { // from class: l.vzg
            @Override // java.lang.Runnable
            public final void run() {
                v1h.m15245k0(vMaterialEditFindViewById, vMaterialEditFindViewById2, act, textView, dialogZ, d30Var2);
            }
        });
        dialogZ.m0(new Runnable() { // from class: l.wzg
            @Override // java.lang.Runnable
            public final void run() {
                v1h.m15232c0(dialogZ);
            }
        });
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.xzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FeedModule.m1139F().dialogCCode(act, new e30() { // from class: l.k0h
                    public final void call(Object obj) {
                        v1h.m15208K(z, textView, (String) obj);
                    }
                });
            }
        });
        vButton_FakeShadowSmallFindViewById.setOnClickListener(new View.OnClickListener() { // from class: l.yzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m15202H(textView, vMaterialEditFindViewById, vButton_FakeShadowSmallFindViewById, vMaterialEditFindViewById2, act, view);
            }
        });
        textView.setText("+" + zqb.f15832d.get(0).f15835b);
        if (e51.B(act.getLocalClassName())) {
            vButton_FakeShadowSmallFindViewById.setChecked(true);
            vButton_FakeShadowSmallFindViewById.setClickable(false);
            vButton_FakeShadowSmallFindViewById.setText(R$string.f505d5);
            act.duringCreated(e51.N(act.getLocalClassName(), 60)).subscribe(mkd0.I(new e30() { // from class: l.zzg
                public final void call(Object obj) {
                    v1h.m15190B((Long) obj);
                }
            }, new e30() { // from class: l.a0h
                public final void call(Object obj) {
                    v1h.m15262t((Throwable) obj);
                }
            }, new d30() { // from class: l.b0h
                public final void call() {
                    v1h.m15223T(vButton_FakeShadowSmallFindViewById, vMaterialEditFindViewById);
                }
            }));
        } else {
            xdl0.y(vButton_FakeShadowSmallFindViewById, vMaterialEditFindViewById.getText().length() > 0);
        }
        vMaterialEditFindViewById.H().subscribe(mkd0.G(new e30() { // from class: l.d0h
            public final void call(Object obj) {
                v1h.m15220Q(vButton_FakeShadowSmallFindViewById, vMaterialEditFindViewById, (CharSequence) obj);
            }
        }));
        String strM15191B0 = m15191B0(act);
        if (!TextUtils.isEmpty(strM15191B0)) {
            vMaterialEditFindViewById.setText(strM15191B0);
        }
        w1h.m15671b(new String[]{z ? "on" : "off"}[0], new String[]{TextUtils.isEmpty(vMaterialEditFindViewById.getText().toString()) ? "no_number" : "secret_number"}[0], str);
        dialogZ.show();
    }

    /* JADX INFO: renamed from: Q */
    public static /* synthetic */ void m15220Q(VButton_FakeShadowSmall vButton_FakeShadowSmall, VMaterialEdit vMaterialEdit, CharSequence charSequence) {
        if (vButton_FakeShadowSmall.isChecked()) {
            return;
        }
        if (vMaterialEdit.getText().toString().isEmpty()) {
            xdl0.y(vButton_FakeShadowSmall, false);
        } else {
            xdl0.y(vButton_FakeShadowSmall, true);
        }
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m15222S(Dialog dialog, View view) {
        dialog.dismiss();
        p6j0.m12912b("e_user_passive_popup_ok", "p_user_passive_popup", new p6j0.C2456a[0]);
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m15223T(VButton_FakeShadowSmall vButton_FakeShadowSmall, VMaterialEdit vMaterialEdit) {
        vButton_FakeShadowSmall.setChecked(false);
        vButton_FakeShadowSmall.setText(R$string.f498c5);
        if (vButton_FakeShadowSmall.isChecked()) {
            return;
        }
        if (vMaterialEdit.getText().toString().isEmpty()) {
            xdl0.y(vButton_FakeShadowSmall, false);
        } else {
            xdl0.y(vButton_FakeShadowSmall, true);
        }
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m15224U(d30 d30Var, View view) {
        m15193C0();
        if (NullChecker.a(view)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m15226W(Bundle bundle) {
    }

    /* JADX INFO: renamed from: X */
    public static /* synthetic */ void m15227X(Act act, roj0 roj0Var) {
        act.progressDismiss();
        q770.m13441l0(false);
        lsi0.y(it6.b(R$string.f423Q4, R$string.f363G4));
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m15228Y(final Act act, String str, String str2, String str3) {
        act.progress(R$string.f445U2, true);
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = str3;
        FeedModule.f315c.m1679t4(str, str2, report).subscribe(mkd0.H(new e30() { // from class: l.l1h
            public final void call(Object obj) {
                v1h.m15227X(act, (roj0) obj);
            }
        }, new e30() { // from class: l.m1h
            public final void call(Object obj) {
                v1h.m15247l0(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: Z */
    public static /* synthetic */ void m15229Z(Act act, Throwable th) {
        t2h.m14427g(th);
        act.progressDismiss();
    }

    /* JADX INFO: renamed from: c0 */
    public static /* synthetic */ void m15232c0(Dialog dialog) {
        m15273y0(dialog);
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: d0 */
    public static /* synthetic */ void m15233d0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m15234e0(Act act, DialogInterface dialogInterface) {
        q770.m13441l0(false);
        Objects.requireNonNull(act);
        e51.H(act, new g320(act), 100L);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ boolean m15237g0(Moment moment, MenuItem menuItem) {
        e51.q(moment.value);
        return true;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m15238h(VButton_FakeShadowSmall vButton_FakeShadowSmall, VMaterialEdit vMaterialEdit) {
        vButton_FakeShadowSmall.setChecked(false);
        vButton_FakeShadowSmall.setText(R$string.f498c5);
        if (vButton_FakeShadowSmall.isChecked()) {
            return;
        }
        if (vMaterialEdit.getText().toString().isEmpty()) {
            xdl0.y(vButton_FakeShadowSmall, false);
        } else {
            xdl0.y(vButton_FakeShadowSmall, true);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m15239h0(final Act act, String str, final boolean z, final e30 e30Var) {
        q770.m13441l0(false);
        act.progress(R$string.f445U2, true);
        FeedModule.f315c.f670M.m1698M(str, !z).subscribe(mkd0.H(new e30() { // from class: l.nzg
            public final void call(Object obj) {
                v1h.m15204I(act, z, e30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.ozg
            public final void call(Object obj) {
                act.progressDismiss();
            }
        }));
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m15240i(d30 d30Var, View view) {
        m15193C0();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ void m15242j(Act act, roj0 roj0Var) {
        act.progressDismiss();
        lsi0.y(it6.b(R$string.f423Q4, R$string.f363G4));
    }

    /* JADX INFO: renamed from: j0 */
    public static /* synthetic */ Moment m15243j0(Moment moment) {
        return moment;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m15244k(Act act, Throwable th) {
        act.progressDismiss();
        yij0.D(th);
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m15245k0(VMaterialEdit vMaterialEdit, VMaterialEdit vMaterialEdit2, final Act act, TextView textView, final Dialog dialog, final d30 d30Var) {
        if (TextUtils.isEmpty(vMaterialEdit.getText()) || TextUtils.isEmpty(vMaterialEdit2.getText())) {
            return;
        }
        act.progress(R$string.f445U2);
        VerifyData verifyData = new VerifyData();
        verifyData.code = yij0.I(vMaterialEdit2);
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.codeLength = 6;
        verifyData.countryCode = yij0.I(textView);
        verifyData.mobileNumber = yij0.M(vMaterialEdit);
        verifyData.action = VerifyReason.get(VerifyReason.bind_mobile);
        verifyData.countryCode = yij0.I(textView);
        verifyData.mobileNumber = yij0.M(vMaterialEdit);
        FeedModule.m1139F().verify(verifyData).subscribe(mkd0.K(new e30() { // from class: l.t0h
            public final void call(Object obj) {
                v1h.m15246l(act, dialog, d30Var, (roj0) obj);
            }
        }, new e30() { // from class: l.u0h
            public final void call(Object obj) {
                v1h.m15244k(act, (Throwable) obj);
            }
        }, false));
    }

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m15246l(Act act, Dialog dialog, d30 d30Var, roj0 roj0Var) {
        act.progressDismiss();
        ijb0.m10902M(FeedModule.m1139F().userId());
        e51.K(act.getLocalClassName());
        lsi0.y(act.string(R$string.f568m5));
        m15273y0(dialog);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
            dialog.setOnDismissListener((DialogInterface.OnDismissListener) null);
        }
        dialog.dismiss();
    }

    /* JADX INFO: renamed from: l0 */
    public static /* synthetic */ void m15247l0(Act act, Throwable th) {
        q770.m13441l0(false);
        act.progressDismiss();
        t2h.m14427g(th);
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m15250n(Throwable th) {
    }

    /* JADX INFO: renamed from: n0 */
    public static /* synthetic */ void m15251n0(Act act, d30 d30Var, roj0 roj0Var) {
        act.progressDismiss();
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: o */
    public static /* synthetic */ void m15252o(e30 e30Var, d30 d30Var) {
        if (NullChecker.a(e30Var)) {
            e30Var.call(Boolean.TRUE);
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m15254p(View view, Act act, Dialog dialog, View view2) {
        Intent intent = new Intent("android.intent.action.DIAL");
        intent.setData(Uri.parse("tel:" + ((TextView) view.findViewById(b5c0.f6033c2)).getText().toString()));
        act.startActivity(intent);
        dialog.dismiss();
        p6j0.m12912b("e_user_passive_popup_number", "p_user_passive_popup", new p6j0.C2456a[0]);
    }

    /* JADX INFO: renamed from: p0 */
    public static /* synthetic */ void m15255p0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ String m15256q(j760 j760Var) {
        return (String) j760Var.a;
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ void m15257q0(Bundle bundle) {
    }

    /* JADX INFO: renamed from: r0 */
    public static /* synthetic */ void m15259r0(Dialog dialog, View view) {
        dialog.dismiss();
        p6j0.m12912b("e_user_passive_popup_cancel", "p_user_passive_popup", new p6j0.C2456a[0]);
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ void m15262t(Throwable th) {
    }

    /* JADX INFO: renamed from: t0 */
    public static /* synthetic */ void m15263t0(final Act act, d30 d30Var, Moment moment, final d30 d30Var2) {
        act.progress(R$string.f445U2, true);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        FeedModule.f315c.m1652g3(((DbObject) moment).id).subscribe(mkd0.H(new e30() { // from class: l.e0h
            public final void call(Object obj) {
                v1h.m15251n0(act, d30Var2, (roj0) obj);
            }
        }, new e30() { // from class: l.f0h
            public final void call(Object obj) {
                v1h.m15229Z(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m15264u(VMaterialEdit vMaterialEdit, final VButton_FakeShadowSmall vButton_FakeShadowSmall, Act act, final VMaterialEdit vMaterialEdit2, roj0 roj0Var) {
        vMaterialEdit.requestFocus();
        vButton_FakeShadowSmall.setChecked(true);
        vButton_FakeShadowSmall.setClickable(false);
        vButton_FakeShadowSmall.setText(R$string.f505d5);
        act.duringCreated(e51.N(act.getLocalClassName(), 60)).subscribe(mkd0.I(new e30() { // from class: l.z0h
            public final void call(Object obj) {
                v1h.m15272y(vButton_FakeShadowSmall, (Long) obj);
            }
        }, new e30() { // from class: l.a1h
            public final void call(Object obj) {
                v1h.m15250n((Throwable) obj);
            }
        }, new d30() { // from class: l.b1h
            public final void call() {
                v1h.m15238h(vButton_FakeShadowSmall, vMaterialEdit2);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ boolean m15265u0(final Act act, final d30 d30Var, final Moment moment, final d30 d30Var2, MenuItem menuItem) {
        new xvg(act).m16858d(R$string.f386K3).m16863i(R$string.f596r, new Runnable() { // from class: l.qzg
            @Override // java.lang.Runnable
            public final void run() {
                v1h.m15263t0(act, d30Var, moment, d30Var2);
            }
        }).m16861g(R$string.f478a).show();
        return true;
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m15266v(final Act act, MomentMessage momentMessage) {
        Report report = new Report();
        report.category = Report.CATEGORY_DEFAULT;
        report.value = "";
        act.progress(R$string.f445U2, true);
        ijb0.m10904O(momentMessage.owner, ((CopyObject) momentMessage).id, report).subscribe(mkd0.H(new e30() { // from class: l.d1h
            public final void call(Object obj) {
                v1h.m15242j(act, (roj0) obj);
            }
        }, new e30() { // from class: l.e1h
            public final void call(Object obj) {
                v1h.m15268w(act, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v0 */
    public static void m15267v0(Act act, String str, final d30 d30Var) {
        if (act == null || act.isFinishing()) {
            return;
        }
        act.creates(new e30() { // from class: l.o0h
            public final void call(Object obj) {
                v1h.m15233d0((Bundle) obj);
            }
        }, new h0h());
        xh0.a aVar = new xh0.a(act);
        aVar.j(str).q(R.string.h).o(new View.OnClickListener() { // from class: l.p0h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m15240i(d30Var, view);
            }
        }).e(R$string.f478a).c(new View.OnClickListener() { // from class: l.q0h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m15193C0();
            }
        });
        xh0 xh0VarA = aVar.a();
        f14018b = xh0VarA;
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m15268w(Act act, Throwable th) {
        act.progressDismiss();
        t2h.m14427g(th);
    }

    /* JADX INFO: renamed from: w0 */
    public static void m15269w0(Act act, String str, final d30 d30Var) {
        if (act == null || act.isFinishing()) {
            return;
        }
        act.creates(new e30() { // from class: l.o1h
            public final void call(Object obj) {
                v1h.m15226W((Bundle) obj);
            }
        }, new h0h());
        xh0.a aVar = new xh0.a(act);
        aVar.s(act.getString(R$string.f513f)).j(str).r(act.getString(R$string.f513f)).o(new View.OnClickListener() { // from class: l.p1h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m15224U(d30Var, view);
            }
        }).e(R$string.f478a).c(new View.OnClickListener() { // from class: l.q1h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                v1h.m15193C0();
            }
        });
        xh0 xh0VarA = aVar.a();
        f14018b = xh0VarA;
        xh0VarA.g();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ boolean m15270x(Act act, String str, MenuItem menuItem) {
        kjb0.m11440D(act, str, null, null, null, "moment_page");
        return true;
    }

    /* JADX INFO: renamed from: x0 */
    public static void m15271x0(Act act, String str, final Moment moment, e30<Boolean> e30Var, e30<Boolean> e30Var2, e30<FollowshipStatus> e30Var3, boolean z, boolean z2, boolean z3) {
        Menu menuM15201G0 = m15201G0(act, new MenuBuilder(act), str, new v9j() { // from class: l.gzg
            public final Object call() {
                return v1h.m15243j0(moment);
            }
        }, null, null, e30Var, e30Var2, e30Var3, z, z2, z3);
        if (menuM15201G0.size() > 0) {
            act.dialog().j0(menuM15201G0).z0();
        }
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m15272y(VButton_FakeShadowSmall vButton_FakeShadowSmall, Long l2) {
        long jLongValue = 60 - l2.longValue();
        if (jLongValue > 0) {
            vButton_FakeShadowSmall.setText(String.format("%ds", Long.valueOf(jLongValue)));
        }
    }

    /* JADX INFO: renamed from: y0 */
    public static void m15273y0(@NonNull Dialog dialog) {
        try {
            Window window = dialog.getWindow();
            InputMethodManager inputMethodManager = (InputMethodManager) dialog.getContext().getSystemService("input_method");
            if (NullChecker.b(window) && NullChecker.b(inputMethodManager)) {
                window.setSoftInputMode(2);
                if (NullChecker.a(window.getCurrentFocus())) {
                    inputMethodManager.hideSoftInputFromWindow(window.getCurrentFocus().getWindowToken(), 0);
                } else {
                    inputMethodManager.hideSoftInputFromWindow(window.getDecorView().getWindowToken(), 0);
                }
            }
        } catch (Exception e) {
            CrashHelper.c(e);
        }
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ boolean m15274z(e30 e30Var, FollowshipStatus followshipStatus, MenuItem menuItem) {
        if (!NullChecker.a(e30Var)) {
            return true;
        }
        e30Var.call(followshipStatus);
        return true;
    }

    /* JADX INFO: renamed from: z0 */
    public static void m15275z0(Act act, d30 d30Var) {
        m15189A0(act, d30Var, true);
    }
}
