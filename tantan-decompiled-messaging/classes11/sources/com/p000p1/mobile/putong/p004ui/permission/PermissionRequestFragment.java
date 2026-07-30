package com.p000p1.mobile.putong.p004ui.permission;

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
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.common.R;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import l.b50;
import l.bne0;
import l.dd80;
import l.du2;
import l.e16;
import l.e30;
import l.e6c0;
import l.eqh0;
import l.f30;
import l.s2j;
import l.s4c0;
import l.t100;
import l.vqd0;
import l.vwb;
import l.w2c0;
import l.zvf0;
import p009l.ane0;
import p009l.fk60;
import p009l.uj60;
import p009l.v4e;
import p009l.w4e;
import p009l.wj60;
import p009l.x4e;
import p009l.zqx;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class PermissionRequestFragment extends Fragment {

    /* JADX INFO: renamed from: l */
    public static final vqd0 f8236l = new vqd0("permission_denied_track", new HashSet());

    /* JADX INFO: renamed from: m */
    public static final Map<String, List<String>> f8237m;

    /* JADX INFO: renamed from: a */
    public List<String> f8238a;

    /* JADX INFO: renamed from: b */
    public PermissionHelper.InterfaceC0531b f8239b;

    /* JADX INFO: renamed from: c */
    public v4e f8240c;

    /* JADX INFO: renamed from: d */
    public w4e f8241d;

    /* JADX INFO: renamed from: e */
    public x4e f8242e;

    /* JADX INFO: renamed from: f */
    public boolean f8243f = true;

    /* JADX INFO: renamed from: g */
    public boolean f8244g;

    /* JADX INFO: renamed from: h */
    public boolean f8245h;

    /* JADX INFO: renamed from: i */
    public boolean f8246i;

    /* JADX INFO: renamed from: j */
    public int f8247j;

    /* JADX INFO: renamed from: k */
    public uj60 f8248k;

    public static class CheckPermissionsData {

        /* JADX INFO: renamed from: a */
        public final Type f8249a;

        /* JADX INFO: renamed from: b */
        public final Set<String> f8250b = new LinkedHashSet();

        /* JADX INFO: renamed from: c */
        public final Set<String> f8251c = new LinkedHashSet();

        /* JADX INFO: renamed from: d */
        public final Set<String> f8252d;

        /* JADX INFO: renamed from: e */
        public final Set<String> f8253e;

        /* JADX INFO: renamed from: f */
        public final Set<String> f8254f;

        /* JADX INFO: renamed from: g */
        public final Set<String> f8255g;

        /* JADX INFO: renamed from: h */
        public final Set<String> f8256h;

        /* JADX INFO: renamed from: i */
        public final Set<String> f8257i;

        /* JADX INFO: renamed from: j */
        public final Set<String> f8258j;

        public enum Type {
            GRANTED,
            DENIED,
            DENIED_FOREVER
        }

        public CheckPermissionsData(final Activity activity, List<String> list, final boolean z, @Nullable final f30<String, Type> f30Var) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            this.f8252d = linkedHashSet;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            this.f8253e = linkedHashSet2;
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            this.f8254f = linkedHashSet3;
            this.f8255g = new LinkedHashSet();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            this.f8256h = linkedHashSet4;
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            this.f8257i = linkedHashSet5;
            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
            this.f8258j = linkedHashSet6;
            if (list == null) {
                this.f8249a = Type.GRANTED;
                return;
            }
            vwb.z(list, new e30() { // from class: l.dk60
                public final void call(Object obj) {
                    this.f11886a.m10262b(activity, f30Var, z, (String) obj);
                }
            });
            linkedHashSet.addAll(linkedHashSet2);
            linkedHashSet.addAll(linkedHashSet3);
            linkedHashSet4.addAll(linkedHashSet5);
            linkedHashSet4.addAll(linkedHashSet6);
            if (!linkedHashSet2.isEmpty()) {
                this.f8249a = Type.DENIED;
            } else if (linkedHashSet3.isEmpty()) {
                this.f8249a = Type.GRANTED;
            } else {
                this.f8249a = Type.DENIED_FOREVER;
            }
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m10262b(Activity activity, f30 f30Var, boolean z, String str) {
            String strM10244l = PermissionRequestFragment.m10244l(activity, str);
            this.f8250b.add(str);
            if (e16.a(activity, str) == 0) {
                this.f8251c.add(str);
                this.f8255g.add(strM10244l);
                if (NullChecker.a(f30Var)) {
                    f30Var.call(str, Type.GRANTED);
                    return;
                }
                return;
            }
            if (z) {
                this.f8253e.add(str);
                this.f8257i.add(strM10244l);
                if (NullChecker.a(f30Var)) {
                    f30Var.call(str, Type.DENIED);
                    return;
                }
                return;
            }
            if (zqx.m25938k() && (TextUtils.equals("android.permission.READ_MEDIA_IMAGES", str) || TextUtils.equals("android.permission.READ_MEDIA_VIDEO", str))) {
                if (e16.a(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                    this.f8253e.add(str);
                    this.f8257i.add(strM10244l);
                    if (NullChecker.a(f30Var)) {
                        f30Var.call(str, Type.DENIED);
                        return;
                    }
                    return;
                }
                this.f8254f.add(str);
                this.f8258j.add(strM10244l);
                if (NullChecker.a(f30Var)) {
                    f30Var.call(str, Type.DENIED_FOREVER);
                    return;
                }
                return;
            }
            if (b50.x(activity, str)) {
                this.f8253e.add(str);
                this.f8257i.add(strM10244l);
                if (NullChecker.a(f30Var)) {
                    f30Var.call(str, Type.DENIED);
                    return;
                }
                return;
            }
            this.f8254f.add(str);
            this.f8258j.add(strM10244l);
            if (NullChecker.a(f30Var)) {
                f30Var.call(str, Type.DENIED_FOREVER);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.permission.PermissionRequestFragment$a */
    public static /* synthetic */ class C0533a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f8259a;

        static {
            int[] iArr = new int[CheckPermissionsData.Type.values().length];
            f8259a = iArr;
            try {
                iArr[CheckPermissionsData.Type.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f8259a[CheckPermissionsData.Type.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f8259a[CheckPermissionsData.Type.DENIED_FOREVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f8237m = map;
        map.put("android.permission-group.ACTIVITY_RECOGNITION", vwb.f0(new String[]{"android.permission.ACTIVITY_RECOGNITION"}));
        map.put("android.permission-group.CALENDAR", vwb.f0(new String[]{"android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"}));
        map.put("android.permission-group.CALL_LOG", vwb.f0(new String[]{"android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG"}));
        map.put("android.permission-group.CAMERA", vwb.f0(new String[]{"android.permission.CAMERA"}));
        map.put("android.permission-group.CONTACTS", vwb.f0(new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.GET_ACCOUNTS"}));
        map.put("android.permission-group.LOCATION", vwb.f0(new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"}));
        map.put("android.permission-group.MICROPHONE", vwb.f0(new String[]{"android.permission.RECORD_AUDIO"}));
        map.put("android.permission-group.SENSORS", vwb.f0(new String[]{"android.permission.BODY_SENSORS"}));
        map.put("android.permission-group.PHONE", vwb.f0(new String[]{"android.permission.READ_PHONE_STATE", "android.permission.CALL_PHONE", "com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission.USE_SIP", "android.permission.PROCESS_OUTGOING_CALLS", "android.permission.READ_PHONE_NUMBERS", "android.permission.ACCEPT_HANDOVER", "android.permission.ANSWER_PHONE_CALLS"}));
        map.put("android.permission-group.SMS", vwb.f0(new String[]{"android.permission.READ_SMS", "android.permission.RECEIVE_MMS", "android.permission.RECEIVE_SMS", "android.permission.SEND_SMS", "android.permission.RECEIVE_WAP_PUSH"}));
        map.put("android.permission-group.STORAGE", vwb.f0(new String[]{"android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"}));
    }

    /* JADX INFO: renamed from: l */
    public static String m10244l(Context context, String str) {
        try {
            String key = context.getPackageManager().getPermissionInfo(str, 0).group;
            if (Build.VERSION.SDK_INT > 28) {
                for (Map.Entry<String, List<String>> entry : f8237m.entrySet()) {
                    if (entry.getValue().contains(str)) {
                        key = entry.getKey();
                        break;
                    }
                }
            }
            return TextUtils.equals("android.permission-group.UNDEFINED", key) ? str : key;
        } catch (PackageManager.NameNotFoundException e) {
            CrashHelper.c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static PermissionRequestFragment m10245t(String[] strArr, PermissionHelper.InterfaceC0531b interfaceC0531b, v4e v4eVar, w4e w4eVar, x4e x4eVar, boolean z, boolean z2, boolean z3, boolean z4, int i, PermissionHelper.InterfaceC0532c interfaceC0532c) {
        PermissionRequestFragment permissionRequestFragment = new PermissionRequestFragment();
        permissionRequestFragment.f8238a = vwb.f0(strArr);
        permissionRequestFragment.f8243f = z;
        permissionRequestFragment.f8244g = z2;
        permissionRequestFragment.f8245h = z3;
        permissionRequestFragment.f8239b = interfaceC0531b;
        permissionRequestFragment.f8240c = v4eVar;
        permissionRequestFragment.f8241d = w4eVar;
        permissionRequestFragment.f8242e = x4eVar;
        permissionRequestFragment.f8246i = z4;
        permissionRequestFragment.f8247j = i;
        return permissionRequestFragment;
    }

    /* JADX INFO: renamed from: i */
    public final void m10246i(Set<String> set) {
        if (Build.VERSION.SDK_INT >= 33 && set.contains("android.permission.READ_MEDIA_IMAGES") && set.contains("android.permission.READ_MEDIA_VIDEO")) {
            set.remove("android.permission.READ_MEDIA_VIDEO");
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m10247j(boolean z) {
        CheckPermissionsData checkPermissionsData = new CheckPermissionsData(getActivity(), this.f8238a, this.f8243f && z, (this.f8243f && z) ? null : new f30() { // from class: com.p1.mobile.putong.ui.permission.a
            public final void call(Object obj, Object obj2) {
                this.f8263a.m10249m((String) obj, (PermissionRequestFragment.CheckPermissionsData.Type) obj2);
            }
        });
        int i = C0533a.f8259a[checkPermissionsData.f8249a.ordinal()];
        if (i == 1) {
            m10248k(true, PermissionHelper.PermissionDeniedReason.Null);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            m10258w(checkPermissionsData);
        } else if (z) {
            m10257v(checkPermissionsData, this.f8244g);
        } else if (this.f8245h) {
            m10257v(checkPermissionsData, true);
        } else {
            m10248k(false, PermissionHelper.PermissionDeniedReason.Unknown);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m10248k(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        du2.a("[putong-common][permission]", "request peremissions = " + this.f8238a + ", granted = " + z + ", reason = " + permissionDeniedReason);
        if (z) {
            zvf0.J();
        }
        this.f8248k.m23060d();
        if (NullChecker.a(this.f8239b)) {
            this.f8239b.mo10235a(z, permissionDeniedReason);
        }
        if (NullChecker.b(getFragmentManager())) {
            getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m10249m(String str, CheckPermissionsData.Type type) {
        if (type == CheckPermissionsData.Type.GRANTED) {
            if (NullChecker.a(this.f8240c)) {
                this.f8240c.mo1362a();
            }
        } else {
            if (this.f8245h || !NullChecker.a(this.f8240c)) {
                return;
            }
            this.f8240c.mo1363b(type == CheckPermissionsData.Type.DENIED_FOREVER);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m10250n(Set set) {
        if (NullChecker.a(this.f8241d)) {
            this.f8241d.mo1359a();
        }
        s2j.a(this, (String[]) set.toArray(new String[0]), 0);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m10251o(DialogInterface dialogInterface) {
        m10248k(false, PermissionHelper.PermissionDeniedReason.PermissionCancelForRequest);
        if (NullChecker.a(this.f8241d)) {
            this.f8241d.mo1360b();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f8248k = new uj60(this.f8238a);
        if (this.f8238a == null) {
            m10248k(false, PermissionHelper.PermissionDeniedReason.Unknown);
        } else {
            m10247j(true);
        }
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        m10247j(false);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m10252p() {
        m10248k(false, PermissionHelper.PermissionDeniedReason.PermissionCancelForRequest);
        if (NullChecker.a(this.f8241d)) {
            this.f8241d.mo1360b();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m10253q(Set set) {
        if (NullChecker.a(this.f8242e)) {
            this.f8242e.mo1372a();
        }
        if (NullChecker.a(getActivity())) {
            if (Build.VERSION.SDK_INT > 30 && !vwb.J(set) && set.contains("android.permission.BLUETOOTH_CONNECT")) {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + getActivity().getPackageName()));
                getActivity().startActivityForResult(intent, bne0.a);
                m10248k(false, PermissionHelper.PermissionDeniedReason.GoToSettingPage);
                return;
            }
            ane0.m11527x(getActivity());
        }
        m10248k(false, PermissionHelper.PermissionDeniedReason.GoToSettingPage);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m10254r(DialogInterface dialogInterface) {
        m10248k(false, PermissionHelper.PermissionDeniedReason.PermissionCancelForSetting);
        if (NullChecker.a(this.f8242e)) {
            this.f8242e.mo1373b();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m10255s() {
        m10248k(false, PermissionHelper.PermissionDeniedReason.PermissionCancelForSetting);
        if (NullChecker.a(this.f8242e)) {
            this.f8242e.mo1373b();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m10256u(FragmentManager fragmentManager) {
        fragmentManager.beginTransaction().add(this, (String) null).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: v */
    public final void m10257v(CheckPermissionsData checkPermissionsData, boolean z) {
        if (z && wj60.m24262t(checkPermissionsData.f8257i)) {
            if (NullChecker.a(this.f8240c)) {
                this.f8240c.mo1363b(false);
            }
            m10259x(checkPermissionsData.f8257i, checkPermissionsData.f8252d);
        } else {
            if (NullChecker.a(this.f8240c)) {
                this.f8240c.mo1364c();
            }
            this.f8248k.m23062f(getActivity());
            s2j.a(this, (String[]) checkPermissionsData.f8252d.toArray(new String[0]), 0);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m10258w(CheckPermissionsData checkPermissionsData) {
        if (NullChecker.a(this.f8240c)) {
            vqd0 vqd0Var = f8236l;
            if (!((HashSet) vqd0Var.get()).containsAll(checkPermissionsData.f8252d)) {
                this.f8240c.mo1363b(true);
                HashSet hashSet = (HashSet) vqd0Var.get();
                hashSet.addAll(checkPermissionsData.f8252d);
                vqd0Var.put(hashSet);
            }
        }
        m10260y(checkPermissionsData.f8258j);
    }

    /* JADX INFO: renamed from: x */
    public final void m10259x(Set<String> set, final Set<String> set2) {
        if (set.isEmpty()) {
            return;
        }
        dd80.a aVar = new dd80.a(getActivity());
        if (set.size() == 1) {
            String next = set.iterator().next();
            Integer num = wj60.f22156e.get(next);
            int iIntValue = num == null ? w2c0.n0 : num.intValue();
            Integer num2 = wj60.f22157f.get(next);
            aVar.S(iIntValue).s0(num2 == null ? R.string.e1 : num2.intValue(), new Object[0]).y0(PermissionHelper.m10209a(next));
        } else {
            LinearLayout linearLayout = (LinearLayout) getActivity().getLayoutInflater().inflate(e6c0.I, (ViewGroup) null);
            TextView textView = (TextView) linearLayout.findViewById(s4c0.s0);
            textView.setText(R.string.X0);
            textView.setTypeface(eqh0.c(3), 1);
            ListView listView = new ListView(getActivity());
            listView.setDivider(null);
            m10246i(set);
            listView.setAdapter((ListAdapter) new wj60(getActivity(), set));
            linearLayout.addView(listView);
            aVar.R(linearLayout);
        }
        aVar.a0(R.string.g, new Runnable() { // from class: l.ak60
            @Override // java.lang.Runnable
            public final void run() {
                this.f9555a.m10250n(set2);
            }
        }).P(this.f8246i).l0(new DialogInterface.OnCancelListener() { // from class: l.bk60
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f10149a.m10251o(dialogInterface);
            }
        });
        dd80.a aVarE0 = aVar.e0(true);
        if (this.f8246i) {
            aVarE0 = aVarE0.U(R.string.a, new Runnable() { // from class: l.ck60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10658a.m10252p();
                }
            });
        }
        aVarE0.r0();
        if (NullChecker.a(this.f8241d)) {
            this.f8241d.mo1361c();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m10260y(final Set<String> set) {
        if (NullChecker.a((Object) null)) {
            throw null;
        }
        ListView listView = new ListView(getActivity());
        int iD = t100.d(20.0f);
        listView.setPadding(iD, iD, iD, iD * 2);
        listView.setDivider(null);
        m10246i(set);
        listView.setAdapter((ListAdapter) new fk60(getActivity(), set));
        Dialog.e eVar = new Dialog.e(getActivity());
        int i = this.f8247j;
        if (i == 0) {
            i = R.string.X0;
        }
        Dialog.e eVarA = eVar.E0(i).P(listView, false).t0(R.string.g, new Runnable() { // from class: l.xj60
            @Override // java.lang.Runnable
            public final void run() {
                this.f22626a.m10253q(set);
            }
        }).B(this.f8246i).A(new DialogInterface.OnCancelListener() { // from class: l.yj60
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f23106a.m10254r(dialogInterface);
            }
        });
        if (this.f8246i) {
            eVarA = eVarA.l0(R.string.a, new Runnable() { // from class: l.zj60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23709a.m10255s();
                }
            });
        }
        eVarA.z0();
        if (NullChecker.a(this.f8242e)) {
            this.f8242e.mo1374c();
        }
    }
}
