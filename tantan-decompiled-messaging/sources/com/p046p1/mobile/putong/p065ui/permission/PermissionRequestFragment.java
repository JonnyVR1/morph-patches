package com.p046p1.mobile.putong.p065ui.permission;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.common.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p149l.ane0;
import p149l.b50;
import p149l.bne0;
import p149l.dd80;
import p149l.du2;
import p149l.e16;
import p149l.e30;
import p149l.e6c0;
import p149l.eqh0;
import p149l.f30;
import p149l.fk60;
import p149l.s2j;
import p149l.s4c0;
import p149l.t100;
import p149l.uj60;
import p149l.v4e;
import p149l.vqd0;
import p149l.vwb;
import p149l.w2c0;
import p149l.w4e;
import p149l.wj60;
import p149l.x4e;
import p149l.zqx;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class PermissionRequestFragment extends Fragment {

    /* JADX INFO: renamed from: l */
    public static final vqd0 f54630l = new vqd0("permission_denied_track", new HashSet());

    /* JADX INFO: renamed from: m */
    public static final Map<String, List<String>> f54631m;

    /* JADX INFO: renamed from: a */
    public List<String> f54632a;

    /* JADX INFO: renamed from: b */
    public PermissionHelper.InterfaceC13129b f54633b;

    /* JADX INFO: renamed from: c */
    public v4e f54634c;

    /* JADX INFO: renamed from: d */
    public w4e f54635d;

    /* JADX INFO: renamed from: e */
    public x4e f54636e;

    /* JADX INFO: renamed from: f */
    public boolean f54637f = true;

    /* JADX INFO: renamed from: g */
    public boolean f54638g;

    /* JADX INFO: renamed from: h */
    public boolean f54639h;

    /* JADX INFO: renamed from: i */
    public boolean f54640i;

    /* JADX INFO: renamed from: j */
    public int f54641j;

    /* JADX INFO: renamed from: k */
    public uj60 f54642k;

    public static class CheckPermissionsData {

        /* JADX INFO: renamed from: a */
        public final Type f54643a;

        /* JADX INFO: renamed from: b */
        public final Set<String> f54644b = new LinkedHashSet();

        /* JADX INFO: renamed from: c */
        public final Set<String> f54645c = new LinkedHashSet();

        /* JADX INFO: renamed from: d */
        public final Set<String> f54646d;

        /* JADX INFO: renamed from: e */
        public final Set<String> f54647e;

        /* JADX INFO: renamed from: f */
        public final Set<String> f54648f;

        /* JADX INFO: renamed from: g */
        public final Set<String> f54649g;

        /* JADX INFO: renamed from: h */
        public final Set<String> f54650h;

        /* JADX INFO: renamed from: i */
        public final Set<String> f54651i;

        /* JADX INFO: renamed from: j */
        public final Set<String> f54652j;

        public enum Type {
            GRANTED,
            DENIED,
            DENIED_FOREVER
        }

        public CheckPermissionsData(final Activity activity, List<String> list, final boolean z, @Nullable final f30<String, Type> f30Var) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            this.f54646d = linkedHashSet;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            this.f54647e = linkedHashSet2;
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            this.f54648f = linkedHashSet3;
            this.f54649g = new LinkedHashSet();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            this.f54650h = linkedHashSet4;
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            this.f54651i = linkedHashSet5;
            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
            this.f54652j = linkedHashSet6;
            if (list == null) {
                this.f54643a = Type.GRANTED;
                return;
            }
            vwb.m200354z(list, new e30() { // from class: l.dk60
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f86621a.m79933b(activity, f30Var, z, (String) obj);
                }
            });
            linkedHashSet.addAll(linkedHashSet2);
            linkedHashSet.addAll(linkedHashSet3);
            linkedHashSet4.addAll(linkedHashSet5);
            linkedHashSet4.addAll(linkedHashSet6);
            if (!linkedHashSet2.isEmpty()) {
                this.f54643a = Type.DENIED;
            } else if (linkedHashSet3.isEmpty()) {
                this.f54643a = Type.GRANTED;
            } else {
                this.f54643a = Type.DENIED_FOREVER;
            }
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m79933b(Activity activity, f30 f30Var, boolean z, String str) {
            String strM79915l = PermissionRequestFragment.m79915l(activity, str);
            this.f54644b.add(str);
            if (e16.m114373a(activity, str) == 0) {
                this.f54645c.add(str);
                this.f54649g.add(strM79915l);
                if (NullChecker.m81303a(f30Var)) {
                    f30Var.call(str, Type.GRANTED);
                    return;
                }
                return;
            }
            if (z) {
                this.f54647e.add(str);
                this.f54651i.add(strM79915l);
                if (NullChecker.m81303a(f30Var)) {
                    f30Var.call(str, Type.DENIED);
                    return;
                }
                return;
            }
            if (zqx.m219898k() && (TextUtils.equals("android.permission.READ_MEDIA_IMAGES", str) || TextUtils.equals("android.permission.READ_MEDIA_VIDEO", str))) {
                if (e16.m114373a(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                    this.f54647e.add(str);
                    this.f54651i.add(strM79915l);
                    if (NullChecker.m81303a(f30Var)) {
                        f30Var.call(str, Type.DENIED);
                        return;
                    }
                    return;
                }
                this.f54648f.add(str);
                this.f54652j.add(strM79915l);
                if (NullChecker.m81303a(f30Var)) {
                    f30Var.call(str, Type.DENIED_FOREVER);
                    return;
                }
                return;
            }
            if (b50.m100290x(activity, str)) {
                this.f54647e.add(str);
                this.f54651i.add(strM79915l);
                if (NullChecker.m81303a(f30Var)) {
                    f30Var.call(str, Type.DENIED);
                    return;
                }
                return;
            }
            this.f54648f.add(str);
            this.f54652j.add(strM79915l);
            if (NullChecker.m81303a(f30Var)) {
                f30Var.call(str, Type.DENIED_FOREVER);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.permission.PermissionRequestFragment$a */
    public static /* synthetic */ class C13131a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f54653a;

        static {
            int[] iArr = new int[CheckPermissionsData.Type.values().length];
            f54653a = iArr;
            try {
                iArr[CheckPermissionsData.Type.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f54653a[CheckPermissionsData.Type.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f54653a[CheckPermissionsData.Type.DENIED_FOREVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f54631m = map;
        map.put("android.permission-group.ACTIVITY_RECOGNITION", vwb.m200324f0("android.permission.ACTIVITY_RECOGNITION"));
        map.put("android.permission-group.CALENDAR", vwb.m200324f0("android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"));
        map.put("android.permission-group.CALL_LOG", vwb.m200324f0("android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG"));
        map.put("android.permission-group.CAMERA", vwb.m200324f0("android.permission.CAMERA"));
        map.put("android.permission-group.CONTACTS", vwb.m200324f0("android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.GET_ACCOUNTS"));
        map.put("android.permission-group.LOCATION", vwb.m200324f0("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"));
        map.put("android.permission-group.MICROPHONE", vwb.m200324f0("android.permission.RECORD_AUDIO"));
        map.put("android.permission-group.SENSORS", vwb.m200324f0("android.permission.BODY_SENSORS"));
        map.put("android.permission-group.PHONE", vwb.m200324f0("android.permission.READ_PHONE_STATE", "android.permission.CALL_PHONE", "com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission.USE_SIP", "android.permission.PROCESS_OUTGOING_CALLS", "android.permission.READ_PHONE_NUMBERS", "android.permission.ACCEPT_HANDOVER", "android.permission.ANSWER_PHONE_CALLS"));
        map.put("android.permission-group.SMS", vwb.m200324f0("android.permission.READ_SMS", "android.permission.RECEIVE_MMS", "android.permission.RECEIVE_SMS", "android.permission.SEND_SMS", "android.permission.RECEIVE_WAP_PUSH"));
        map.put("android.permission-group.STORAGE", vwb.m200324f0("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"));
    }

    /* JADX INFO: renamed from: l */
    public static String m79915l(Context context, String str) {
        try {
            String key = context.getPackageManager().getPermissionInfo(str, 0).group;
            if (Build.VERSION.SDK_INT > 28) {
                for (Map.Entry<String, List<String>> entry : f54631m.entrySet()) {
                    if (entry.getValue().contains(str)) {
                        key = entry.getKey();
                        break;
                    }
                }
            }
            return TextUtils.equals("android.permission-group.UNDEFINED", key) ? str : key;
        } catch (PackageManager.NameNotFoundException e) {
            CrashHelper.m81296c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static PermissionRequestFragment m79916t(String[] strArr, PermissionHelper.InterfaceC13129b interfaceC13129b, v4e v4eVar, w4e w4eVar, x4e x4eVar, boolean z, boolean z2, boolean z3, boolean z4, int i, PermissionHelper.InterfaceC13130c interfaceC13130c) {
        PermissionRequestFragment permissionRequestFragment = new PermissionRequestFragment();
        permissionRequestFragment.f54632a = vwb.m200324f0(strArr);
        permissionRequestFragment.f54637f = z;
        permissionRequestFragment.f54638g = z2;
        permissionRequestFragment.f54639h = z3;
        permissionRequestFragment.f54633b = interfaceC13129b;
        permissionRequestFragment.f54634c = v4eVar;
        permissionRequestFragment.f54635d = w4eVar;
        permissionRequestFragment.f54636e = x4eVar;
        permissionRequestFragment.f54640i = z4;
        permissionRequestFragment.f54641j = i;
        return permissionRequestFragment;
    }

    /* JADX INFO: renamed from: i */
    public final void m79917i(Set<String> set) {
        if (Build.VERSION.SDK_INT >= 33 && set.contains("android.permission.READ_MEDIA_IMAGES") && set.contains("android.permission.READ_MEDIA_VIDEO")) {
            set.remove("android.permission.READ_MEDIA_VIDEO");
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m79918j(boolean z) {
        CheckPermissionsData checkPermissionsData = new CheckPermissionsData(getActivity(), this.f54632a, this.f54637f && z, (this.f54637f && z) ? null : new f30() { // from class: com.p1.mobile.putong.ui.permission.a
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f54657a.m79920m((String) obj, (PermissionRequestFragment.CheckPermissionsData.Type) obj2);
            }
        });
        int i = C13131a.f54653a[checkPermissionsData.f54643a.ordinal()];
        if (i == 1) {
            m79919k(true, PermissionHelper.PermissionDeniedReason.Null);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            m79929w(checkPermissionsData);
        } else if (z) {
            m79928v(checkPermissionsData, this.f54638g);
        } else if (this.f54639h) {
            m79928v(checkPermissionsData, true);
        } else {
            m79919k(false, PermissionHelper.PermissionDeniedReason.Unknown);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m79919k(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        du2.m113670a("[putong-common][permission]", "request peremissions = " + this.f54632a + ", granted = " + z + ", reason = " + permissionDeniedReason);
        if (z) {
            zvf0.m220377J();
        }
        this.f54642k.m194006d();
        if (NullChecker.m81303a(this.f54633b)) {
            this.f54633b.mo79906a(z, permissionDeniedReason);
        }
        if (NullChecker.m81304b(getFragmentManager())) {
            getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m79920m(String str, CheckPermissionsData.Type type) {
        if (type == CheckPermissionsData.Type.GRANTED) {
            if (NullChecker.m81303a(this.f54634c)) {
                this.f54634c.mo37393a();
            }
        } else {
            if (this.f54639h || !NullChecker.m81303a(this.f54634c)) {
                return;
            }
            this.f54634c.mo37394b(type == CheckPermissionsData.Type.DENIED_FOREVER);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m79921n(Set set) {
        if (NullChecker.m81303a(this.f54635d)) {
            this.f54635d.mo37390a();
        }
        s2j.m182066a(this, (String[]) set.toArray(new String[0]), 0);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m79922o(DialogInterface dialogInterface) {
        m79919k(false, PermissionHelper.PermissionDeniedReason.PermissionCancelForRequest);
        if (NullChecker.m81303a(this.f54635d)) {
            this.f54635d.mo37391b();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f54642k = new uj60(this.f54632a);
        if (this.f54632a == null) {
            m79919k(false, PermissionHelper.PermissionDeniedReason.Unknown);
        } else {
            m79918j(true);
        }
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        m79918j(false);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m79923p() {
        m79919k(false, PermissionHelper.PermissionDeniedReason.PermissionCancelForRequest);
        if (NullChecker.m81303a(this.f54635d)) {
            this.f54635d.mo37391b();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m79924q(Set set) {
        if (NullChecker.m81303a(this.f54636e)) {
            this.f54636e.mo37401a();
        }
        if (NullChecker.m81303a(getActivity())) {
            if (Build.VERSION.SDK_INT > 30 && !vwb.m200296J(set) && set.contains("android.permission.BLUETOOTH_CONNECT")) {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + getActivity().getPackageName()));
                getActivity().startActivityForResult(intent, bne0.f76394a);
                m79919k(false, PermissionHelper.PermissionDeniedReason.GoToSettingPage);
                return;
            }
            ane0.m97752x(getActivity());
        }
        m79919k(false, PermissionHelper.PermissionDeniedReason.GoToSettingPage);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m79925r(DialogInterface dialogInterface) {
        m79919k(false, PermissionHelper.PermissionDeniedReason.PermissionCancelForSetting);
        if (NullChecker.m81303a(this.f54636e)) {
            this.f54636e.mo37402b();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m79926s() {
        m79919k(false, PermissionHelper.PermissionDeniedReason.PermissionCancelForSetting);
        if (NullChecker.m81303a(this.f54636e)) {
            this.f54636e.mo37402b();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m79927u(FragmentManager fragmentManager) {
        fragmentManager.beginTransaction().add(this, (String) null).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: v */
    public final void m79928v(CheckPermissionsData checkPermissionsData, boolean z) {
        if (z && wj60.m203409t(checkPermissionsData.f54651i)) {
            if (NullChecker.m81303a(this.f54634c)) {
                this.f54634c.mo37394b(false);
            }
            m79930x(checkPermissionsData.f54651i, checkPermissionsData.f54646d);
        } else {
            if (NullChecker.m81303a(this.f54634c)) {
                this.f54634c.mo37395c();
            }
            this.f54642k.m194008f(getActivity());
            s2j.m182066a(this, (String[]) checkPermissionsData.f54646d.toArray(new String[0]), 0);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m79929w(CheckPermissionsData checkPermissionsData) {
        if (NullChecker.m81303a(this.f54634c)) {
            vqd0 vqd0Var = f54630l;
            if (!vqd0Var.get().containsAll(checkPermissionsData.f54646d)) {
                this.f54634c.mo37394b(true);
                HashSet<String> hashSet = vqd0Var.get();
                hashSet.addAll(checkPermissionsData.f54646d);
                vqd0Var.put(hashSet);
            }
        }
        m79931y(checkPermissionsData.f54652j);
    }

    /* JADX INFO: renamed from: x */
    public final void m79930x(Set<String> set, final Set<String> set2) {
        if (set.isEmpty()) {
            return;
        }
        dd80.C16336a c16336a = new dd80.C16336a(getActivity());
        if (set.size() == 1) {
            String next = set.iterator().next();
            Integer num = wj60.f186612e.get(next);
            int iIntValue = num == null ? w2c0.f184189n0 : num.intValue();
            Integer num2 = wj60.f186613f.get(next);
            c16336a.m110964S(iIntValue).m110990s0(num2 == null ? R$string.f17427e1 : num2.intValue(), new Object[0]).m110996y0(PermissionHelper.m79880a(next));
        } else {
            LinearLayout linearLayout = (LinearLayout) getActivity().getLayoutInflater().inflate(e6c0.f89527I, (ViewGroup) null);
            TextView textView = (TextView) linearLayout.findViewById(s4c0.f162360s0);
            textView.setText(R$string.f17394X0);
            textView.setTypeface(eqh0.m117752c(3), 1);
            ListView listView = new ListView(getActivity());
            listView.setDivider(null);
            m79917i(set);
            listView.setAdapter((ListAdapter) new wj60(getActivity(), set));
            linearLayout.addView(listView);
            c16336a.m110963R(linearLayout);
        }
        c16336a.m110972a0(R$string.f17435g, new Runnable() { // from class: l.ak60
            @Override // java.lang.Runnable
            public final void run() {
                this.f70249a.m79921n(set2);
            }
        }).m110961P(this.f54640i).m110983l0(new DialogInterface.OnCancelListener() { // from class: l.bk60
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f75968a.m79922o(dialogInterface);
            }
        });
        dd80.C16336a c16336aM110976e0 = c16336a.m110976e0(true);
        if (this.f54640i) {
            c16336aM110976e0 = c16336aM110976e0.m110966U(R$string.f17405a, new Runnable() { // from class: l.ck60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f81300a.m79923p();
                }
            });
        }
        c16336aM110976e0.m110989r0();
        if (NullChecker.m81303a(this.f54635d)) {
            this.f54635d.mo37392c();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m79931y(final Set<String> set) {
        if (NullChecker.m81303a(null)) {
            throw null;
        }
        ListView listView = new ListView(getActivity());
        int iM186890d = t100.m186890d(20.0f);
        listView.setPadding(iM186890d, iM186890d, iM186890d, iM186890d * 2);
        listView.setDivider(null);
        m79917i(set);
        listView.setAdapter((ListAdapter) new fk60(getActivity(), set));
        Dialog.C4309e c4309e = new Dialog.C4309e(getActivity());
        int i = this.f54641j;
        if (i == 0) {
            i = R$string.f17394X0;
        }
        Dialog.C4309e c4309eM20494A = c4309e.m20503E0(i).m20520P(listView, false).m20556t0(R$string.f17435g, new Runnable() { // from class: l.xj60
            @Override // java.lang.Runnable
            public final void run() {
                this.f193184a.m79924q(set);
            }
        }).m20496B(this.f54640i).m20494A(new DialogInterface.OnCancelListener() { // from class: l.yj60
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f198597a.m79925r(dialogInterface);
            }
        });
        if (this.f54640i) {
            c4309eM20494A = c4309eM20494A.m20542l0(R$string.f17405a, new Runnable() { // from class: l.zj60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f203385a.m79926s();
                }
            });
        }
        c4309eM20494A.m20568z0();
        if (NullChecker.m81303a(this.f54636e)) {
            this.f54636e.mo37403c();
        }
    }
}
