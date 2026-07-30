package com.p051p1.mobile.putong.p070ui.permission;

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
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.common.R$string;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p153l.as60;
import p153l.cbc0;
import p153l.cs60;
import p153l.hve0;
import p153l.i4g0;
import p153l.ive0;
import p153l.j26;
import p153l.j6e;
import p153l.jec0;
import p153l.jl80;
import p153l.jyb;
import p153l.k6e;
import p153l.l6e;
import p153l.ls60;
import p153l.lyh0;
import p153l.n5j;
import p153l.qa00;
import p153l.tu2;
import p153l.v40;
import p153l.wzx;
import p153l.xyd0;
import p153l.y20;
import p153l.ycc0;
import p153l.z20;

/* JADX INFO: loaded from: classes10.dex */
public class PermissionRequestFragment extends Fragment {

    /* JADX INFO: renamed from: l */
    public static final xyd0 f55478l = new xyd0("permission_denied_track", new HashSet());

    /* JADX INFO: renamed from: m */
    public static final Map<String, List<String>> f55479m;

    /* JADX INFO: renamed from: a */
    public List<String> f55480a;

    /* JADX INFO: renamed from: b */
    public PermissionHelper.InterfaceC13292b f55481b;

    /* JADX INFO: renamed from: c */
    public j6e f55482c;

    /* JADX INFO: renamed from: d */
    public k6e f55483d;

    /* JADX INFO: renamed from: e */
    public l6e f55484e;

    /* JADX INFO: renamed from: f */
    public boolean f55485f = true;

    /* JADX INFO: renamed from: g */
    public boolean f55486g;

    /* JADX INFO: renamed from: h */
    public boolean f55487h;

    /* JADX INFO: renamed from: i */
    public boolean f55488i;

    /* JADX INFO: renamed from: j */
    public int f55489j;

    /* JADX INFO: renamed from: k */
    public as60 f55490k;

    public static class CheckPermissionsData {

        /* JADX INFO: renamed from: a */
        public final Type f55491a;

        /* JADX INFO: renamed from: b */
        public final Set<String> f55492b = new LinkedHashSet();

        /* JADX INFO: renamed from: c */
        public final Set<String> f55493c = new LinkedHashSet();

        /* JADX INFO: renamed from: d */
        public final Set<String> f55494d;

        /* JADX INFO: renamed from: e */
        public final Set<String> f55495e;

        /* JADX INFO: renamed from: f */
        public final Set<String> f55496f;

        /* JADX INFO: renamed from: g */
        public final Set<String> f55497g;

        /* JADX INFO: renamed from: h */
        public final Set<String> f55498h;

        /* JADX INFO: renamed from: i */
        public final Set<String> f55499i;

        /* JADX INFO: renamed from: j */
        public final Set<String> f55500j;

        public enum Type {
            GRANTED,
            DENIED,
            DENIED_FOREVER
        }

        public CheckPermissionsData(final Activity activity, List<String> list, final boolean z, @Nullable final z20<String, Type> z20Var) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            this.f55494d = linkedHashSet;
            LinkedHashSet linkedHashSet2 = new LinkedHashSet();
            this.f55495e = linkedHashSet2;
            LinkedHashSet linkedHashSet3 = new LinkedHashSet();
            this.f55496f = linkedHashSet3;
            this.f55497g = new LinkedHashSet();
            LinkedHashSet linkedHashSet4 = new LinkedHashSet();
            this.f55498h = linkedHashSet4;
            LinkedHashSet linkedHashSet5 = new LinkedHashSet();
            this.f55499i = linkedHashSet5;
            LinkedHashSet linkedHashSet6 = new LinkedHashSet();
            this.f55500j = linkedHashSet6;
            if (list == null) {
                this.f55491a = Type.GRANTED;
                return;
            }
            jyb.m147537z(list, new y20() { // from class: l.js60
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f122429a.m81116b(activity, z20Var, z, (String) obj);
                }
            });
            linkedHashSet.addAll(linkedHashSet2);
            linkedHashSet.addAll(linkedHashSet3);
            linkedHashSet4.addAll(linkedHashSet5);
            linkedHashSet4.addAll(linkedHashSet6);
            if (!linkedHashSet2.isEmpty()) {
                this.f55491a = Type.DENIED;
            } else if (linkedHashSet3.isEmpty()) {
                this.f55491a = Type.GRANTED;
            } else {
                this.f55491a = Type.DENIED_FOREVER;
            }
        }

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ void m81116b(Activity activity, z20 z20Var, boolean z, String str) {
            String strM81098l = PermissionRequestFragment.m81098l(activity, str);
            this.f55492b.add(str);
            if (j26.m143188a(activity, str) == 0) {
                this.f55493c.add(str);
                this.f55497g.add(strM81098l);
                if (NullChecker.m82486a(z20Var)) {
                    z20Var.call(str, Type.GRANTED);
                    return;
                }
                return;
            }
            if (z) {
                this.f55495e.add(str);
                this.f55499i.add(strM81098l);
                if (NullChecker.m82486a(z20Var)) {
                    z20Var.call(str, Type.DENIED);
                    return;
                }
                return;
            }
            if (wzx.m208784k() && (TextUtils.equals("android.permission.READ_MEDIA_IMAGES", str) || TextUtils.equals("android.permission.READ_MEDIA_VIDEO", str))) {
                if (j26.m143188a(activity, "android.permission.READ_MEDIA_VISUAL_USER_SELECTED") == 0) {
                    this.f55495e.add(str);
                    this.f55499i.add(strM81098l);
                    if (NullChecker.m82486a(z20Var)) {
                        z20Var.call(str, Type.DENIED);
                        return;
                    }
                    return;
                }
                this.f55496f.add(str);
                this.f55500j.add(strM81098l);
                if (NullChecker.m82486a(z20Var)) {
                    z20Var.call(str, Type.DENIED_FOREVER);
                    return;
                }
                return;
            }
            if (v40.m199647x(activity, str)) {
                this.f55495e.add(str);
                this.f55499i.add(strM81098l);
                if (NullChecker.m82486a(z20Var)) {
                    z20Var.call(str, Type.DENIED);
                    return;
                }
                return;
            }
            this.f55496f.add(str);
            this.f55500j.add(strM81098l);
            if (NullChecker.m82486a(z20Var)) {
                z20Var.call(str, Type.DENIED_FOREVER);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.ui.permission.PermissionRequestFragment$a */
    public static /* synthetic */ class C13294a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f55501a;

        static {
            int[] iArr = new int[CheckPermissionsData.Type.values().length];
            f55501a = iArr;
            try {
                iArr[CheckPermissionsData.Type.GRANTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55501a[CheckPermissionsData.Type.DENIED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55501a[CheckPermissionsData.Type.DENIED_FOREVER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f55479m = map;
        map.put("android.permission-group.ACTIVITY_RECOGNITION", jyb.m147507f0("android.permission.ACTIVITY_RECOGNITION"));
        map.put("android.permission-group.CALENDAR", jyb.m147507f0("android.permission.WRITE_CALENDAR", "android.permission.READ_CALENDAR"));
        map.put("android.permission-group.CALL_LOG", jyb.m147507f0("android.permission.READ_CALL_LOG", "android.permission.WRITE_CALL_LOG"));
        map.put("android.permission-group.CAMERA", jyb.m147507f0("android.permission.CAMERA"));
        map.put("android.permission-group.CONTACTS", jyb.m147507f0("android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS", "android.permission.GET_ACCOUNTS"));
        map.put("android.permission-group.LOCATION", jyb.m147507f0("android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_MEDIA_LOCATION"));
        map.put("android.permission-group.MICROPHONE", jyb.m147507f0("android.permission.RECORD_AUDIO"));
        map.put("android.permission-group.SENSORS", jyb.m147507f0("android.permission.BODY_SENSORS"));
        map.put("android.permission-group.PHONE", jyb.m147507f0("android.permission.READ_PHONE_STATE", "android.permission.CALL_PHONE", "com.android.voicemail.permission.ADD_VOICEMAIL", "android.permission.USE_SIP", "android.permission.PROCESS_OUTGOING_CALLS", "android.permission.READ_PHONE_NUMBERS", "android.permission.ACCEPT_HANDOVER", "android.permission.ANSWER_PHONE_CALLS"));
        map.put("android.permission-group.SMS", jyb.m147507f0("android.permission.READ_SMS", "android.permission.RECEIVE_MMS", "android.permission.RECEIVE_SMS", "android.permission.SEND_SMS", "android.permission.RECEIVE_WAP_PUSH"));
        map.put("android.permission-group.STORAGE", jyb.m147507f0("android.permission.READ_EXTERNAL_STORAGE", "android.permission.WRITE_EXTERNAL_STORAGE"));
    }

    /* JADX INFO: renamed from: l */
    public static String m81098l(Context context, String str) {
        try {
            String key = context.getPackageManager().getPermissionInfo(str, 0).group;
            if (Build.VERSION.SDK_INT > 28) {
                for (Map.Entry<String, List<String>> entry : f55479m.entrySet()) {
                    if (entry.getValue().contains(str)) {
                        key = entry.getKey();
                        break;
                    }
                }
            }
            return TextUtils.equals("android.permission-group.UNDEFINED", key) ? str : key;
        } catch (PackageManager.NameNotFoundException e) {
            CrashHelper.m82479c(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: t */
    public static PermissionRequestFragment m81099t(String[] strArr, PermissionHelper.InterfaceC13292b interfaceC13292b, j6e j6eVar, k6e k6eVar, l6e l6eVar, boolean z, boolean z2, boolean z3, boolean z4, int i, PermissionHelper.InterfaceC13293c interfaceC13293c) {
        PermissionRequestFragment permissionRequestFragment = new PermissionRequestFragment();
        permissionRequestFragment.f55480a = jyb.m147507f0(strArr);
        permissionRequestFragment.f55485f = z;
        permissionRequestFragment.f55486g = z2;
        permissionRequestFragment.f55487h = z3;
        permissionRequestFragment.f55481b = interfaceC13292b;
        permissionRequestFragment.f55482c = j6eVar;
        permissionRequestFragment.f55483d = k6eVar;
        permissionRequestFragment.f55484e = l6eVar;
        permissionRequestFragment.f55488i = z4;
        permissionRequestFragment.f55489j = i;
        return permissionRequestFragment;
    }

    /* JADX INFO: renamed from: i */
    public final void m81100i(Set<String> set) {
        if (Build.VERSION.SDK_INT >= 33 && set.contains("android.permission.READ_MEDIA_IMAGES") && set.contains("android.permission.READ_MEDIA_VIDEO")) {
            set.remove("android.permission.READ_MEDIA_VIDEO");
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m81101j(boolean z) {
        CheckPermissionsData checkPermissionsData = new CheckPermissionsData(getActivity(), this.f55480a, this.f55485f && z, (this.f55485f && z) ? null : new z20() { // from class: com.p1.mobile.putong.ui.permission.a
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f55505a.m81103m((String) obj, (PermissionRequestFragment.CheckPermissionsData.Type) obj2);
            }
        });
        int i = C13294a.f55501a[checkPermissionsData.f55491a.ordinal()];
        if (i == 1) {
            m81102k(true, PermissionHelper.PermissionDeniedReason.Null);
            return;
        }
        if (i != 2) {
            if (i != 3) {
                return;
            }
            m81112w(checkPermissionsData);
        } else if (z) {
            m81111v(checkPermissionsData, this.f55486g);
        } else if (this.f55487h) {
            m81111v(checkPermissionsData, true);
        } else {
            m81102k(false, PermissionHelper.PermissionDeniedReason.Unknown);
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m81102k(boolean z, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        tu2.m192703a("[putong-common][permission]", "request peremissions = " + this.f55480a + ", granted = " + z + ", reason = " + permissionDeniedReason);
        if (z) {
            i4g0.m138501J();
        }
        this.f55490k.m99888d();
        if (NullChecker.m82486a(this.f55481b)) {
            this.f55481b.mo81089a(z, permissionDeniedReason);
        }
        if (NullChecker.m82487b(getFragmentManager())) {
            getFragmentManager().beginTransaction().remove(this).commitAllowingStateLoss();
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m81103m(String str, CheckPermissionsData.Type type) {
        if (type == CheckPermissionsData.Type.GRANTED) {
            if (NullChecker.m82486a(this.f55482c)) {
                this.f55482c.mo38396a();
            }
        } else {
            if (this.f55487h || !NullChecker.m82486a(this.f55482c)) {
                return;
            }
            this.f55482c.mo38397b(type == CheckPermissionsData.Type.DENIED_FOREVER);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m81104n(Set set) {
        if (NullChecker.m82486a(this.f55483d)) {
            this.f55483d.mo38393a();
        }
        n5j.m161726a(this, (String[]) set.toArray(new String[0]), 0);
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m81105o(DialogInterface dialogInterface) {
        m81102k(false, PermissionHelper.PermissionDeniedReason.PermissionCancelForRequest);
        if (NullChecker.m82486a(this.f55483d)) {
            this.f55483d.mo38394b();
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(@Nullable Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f55490k = new as60(this.f55480a);
        if (this.f55480a == null) {
            m81102k(false, PermissionHelper.PermissionDeniedReason.Unknown);
        } else {
            m81101j(true);
        }
    }

    @Override // android.app.Fragment
    public void onRequestPermissionsResult(int i, @NonNull String[] strArr, @NonNull int[] iArr) {
        m81101j(false);
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m81106p() {
        m81102k(false, PermissionHelper.PermissionDeniedReason.PermissionCancelForRequest);
        if (NullChecker.m82486a(this.f55483d)) {
            this.f55483d.mo38394b();
        }
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m81107q(Set set) {
        if (NullChecker.m82486a(this.f55484e)) {
            this.f55484e.mo38404a();
        }
        if (NullChecker.m82486a(getActivity())) {
            if (Build.VERSION.SDK_INT > 30 && !jyb.m147479J(set) && set.contains("android.permission.BLUETOOTH_CONNECT")) {
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.parse("package:" + getActivity().getPackageName()));
                getActivity().startActivityForResult(intent, ive0.f117051a);
                m81102k(false, PermissionHelper.PermissionDeniedReason.GoToSettingPage);
                return;
            }
            hve0.m137322x(getActivity());
        }
        m81102k(false, PermissionHelper.PermissionDeniedReason.GoToSettingPage);
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m81108r(DialogInterface dialogInterface) {
        m81102k(false, PermissionHelper.PermissionDeniedReason.PermissionCancelForSetting);
        if (NullChecker.m82486a(this.f55484e)) {
            this.f55484e.mo38405b();
        }
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m81109s() {
        m81102k(false, PermissionHelper.PermissionDeniedReason.PermissionCancelForSetting);
        if (NullChecker.m82486a(this.f55484e)) {
            this.f55484e.mo38405b();
        }
    }

    /* JADX INFO: renamed from: u */
    public void m81110u(FragmentManager fragmentManager) {
        fragmentManager.beginTransaction().add(this, (String) null).commitAllowingStateLoss();
    }

    /* JADX INFO: renamed from: v */
    public final void m81111v(CheckPermissionsData checkPermissionsData, boolean z) {
        if (z && cs60.m112152t(checkPermissionsData.f55499i)) {
            if (NullChecker.m82486a(this.f55482c)) {
                this.f55482c.mo38397b(false);
            }
            m81113x(checkPermissionsData.f55499i, checkPermissionsData.f55494d);
        } else {
            if (NullChecker.m82486a(this.f55482c)) {
                this.f55482c.mo38398c();
            }
            this.f55490k.m99890f(getActivity());
            n5j.m161726a(this, (String[]) checkPermissionsData.f55494d.toArray(new String[0]), 0);
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m81112w(CheckPermissionsData checkPermissionsData) {
        if (NullChecker.m82486a(this.f55482c)) {
            xyd0 xyd0Var = f55478l;
            if (!xyd0Var.get().containsAll(checkPermissionsData.f55494d)) {
                this.f55482c.mo38397b(true);
                HashSet<String> hashSet = xyd0Var.get();
                hashSet.addAll(checkPermissionsData.f55494d);
                xyd0Var.put(hashSet);
            }
        }
        m81114y(checkPermissionsData.f55500j);
    }

    /* JADX INFO: renamed from: x */
    public final void m81113x(Set<String> set, final Set<String> set2) {
        if (set.isEmpty()) {
            return;
        }
        jl80.C17971a c17971a = new jl80.C17971a(getActivity());
        if (set.size() == 1) {
            String next = set.iterator().next();
            Integer num = cs60.f83419e.get(next);
            int iIntValue = num == null ? cbc0.f80785n0 : num.intValue();
            Integer num2 = cs60.f83420f.get(next);
            c17971a.m146024S(iIntValue).m146050s0(num2 == null ? R$string.f18146e1 : num2.intValue(), new Object[0]).m146056y0(PermissionHelper.m81063a(next));
        } else {
            LinearLayout linearLayout = (LinearLayout) getActivity().getLayoutInflater().inflate(jec0.f120440I, (ViewGroup) null);
            TextView textView = (TextView) linearLayout.findViewById(ycc0.f198481s0);
            textView.setText(R$string.f18113X0);
            textView.setTypeface(lyh0.m156283c(3), 1);
            ListView listView = new ListView(getActivity());
            listView.setDivider(null);
            m81100i(set);
            listView.setAdapter((ListAdapter) new cs60(getActivity(), set));
            linearLayout.addView(listView);
            c17971a.m146023R(linearLayout);
        }
        c17971a.m146032a0(R$string.f18154g, new Runnable() { // from class: l.gs60
            @Override // java.lang.Runnable
            public final void run() {
                this.f106235a.m81104n(set2);
            }
        }).m146021P(this.f55488i).m146043l0(new DialogInterface.OnCancelListener() { // from class: l.hs60
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f111421a.m81105o(dialogInterface);
            }
        });
        jl80.C17971a c17971aM146036e0 = c17971a.m146036e0(true);
        if (this.f55488i) {
            c17971aM146036e0 = c17971aM146036e0.m146026U(R$string.f18124a, new Runnable() { // from class: l.is60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f116629a.m81106p();
                }
            });
        }
        c17971aM146036e0.m146049r0();
        if (NullChecker.m82486a(this.f55483d)) {
            this.f55483d.mo38395c();
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m81114y(final Set<String> set) {
        if (NullChecker.m82486a(null)) {
            throw null;
        }
        ListView listView = new ListView(getActivity());
        int iM175859d = qa00.m175859d(20.0f);
        listView.setPadding(iM175859d, iM175859d, iM175859d, iM175859d * 2);
        listView.setDivider(null);
        m81100i(set);
        listView.setAdapter((ListAdapter) new ls60(getActivity(), set));
        Dialog.C4460e c4460e = new Dialog.C4460e(getActivity());
        int i = this.f55489j;
        if (i == 0) {
            i = R$string.f18113X0;
        }
        Dialog.C4460e c4460eM21493A = c4460e.m21502E0(i).m21519P(listView, false).m21555t0(R$string.f18154g, new Runnable() { // from class: l.ds60
            @Override // java.lang.Runnable
            public final void run() {
                this.f90462a.m81107q(set);
            }
        }).m21495B(this.f55488i).m21493A(new DialogInterface.OnCancelListener() { // from class: l.es60
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                this.f95571a.m81108r(dialogInterface);
            }
        });
        if (this.f55488i) {
            c4460eM21493A = c4460eM21493A.m21541l0(R$string.f18124a, new Runnable() { // from class: l.fs60
                @Override // java.lang.Runnable
                public final void run() {
                    this.f100549a.m81109s();
                }
            });
        }
        c4460eM21493A.m21567z0();
        if (NullChecker.m82486a(this.f55484e)) {
            this.f55484e.mo38406c();
        }
    }
}
