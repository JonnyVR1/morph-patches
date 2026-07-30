package p149l;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzfwz;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class o5w0 {

    /* JADX INFO: renamed from: a */
    public final y7v0 f141942a;

    /* JADX INFO: renamed from: b */
    public final String f141943b;

    /* JADX INFO: renamed from: c */
    public final String f141944c;

    /* JADX INFO: renamed from: d */
    public final String f141945d;

    /* JADX INFO: renamed from: e */
    public final Context f141946e;

    /* JADX INFO: renamed from: f */
    public final wxv0 f141947f;

    /* JADX INFO: renamed from: g */
    public final byv0 f141948g;

    /* JADX INFO: renamed from: h */
    public final Clock f141949h;

    /* JADX INFO: renamed from: i */
    public final ptr0 f141950i;

    public o5w0(y7v0 y7v0Var, zzcei zzceiVar, String str, String str2, Context context, @Nullable wxv0 wxv0Var, @Nullable byv0 byv0Var, Clock clock, ptr0 ptr0Var) {
        this.f141942a = y7v0Var;
        this.f141943b = zzceiVar.zza;
        this.f141944c = str;
        this.f141945d = str2;
        this.f141946e = context;
        this.f141947f = wxv0Var;
        this.f141948g = byv0Var;
        this.f141949h = clock;
        this.f141950i = ptr0Var;
    }

    /* JADX INFO: renamed from: f */
    public static final List m162808f(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m162812j((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static final List m162809g(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m162812j((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static final List m162810h(List list, long j) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m162812j((String) it.next(), "@gw_ttr@", Long.toString(j, 10)));
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static String m162811i(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return w2t0.m201220k() ? "fakeForAdDebugLog" : str;
    }

    /* JADX INFO: renamed from: j */
    public static String m162812j(String str, String str2, @Nullable String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: renamed from: c */
    public final List m162813c(vxv0 vxv0Var, kxv0 kxv0Var, List list) {
        return m162814d(vxv0Var, kxv0Var, false, "", "", list);
    }

    /* JADX INFO: renamed from: d */
    public final List m162814d(vxv0 vxv0Var, @Nullable kxv0 kxv0Var, boolean z, @Nullable String str, @Nullable String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String strM162812j = m162812j(m162812j(m162812j((String) it.next(), "@gw_adlocid@", vxv0Var.f183477a.f166831a.f115496f), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.f141943b);
            if (kxv0Var != null) {
                strM162812j = o0t0.m162169c(m162812j(m162812j(m162812j(strM162812j, "@gw_qdata@", kxv0Var.f125229z), "@gw_adnetid@", kxv0Var.f125228y), "@gw_allocid@", kxv0Var.f125227x), this.f141946e, kxv0Var.f125180X);
            }
            String strM162812j2 = m162812j(m162812j(m162812j(m162812j(strM162812j, "@gw_adnetstatus@", this.f141942a.m213330g()), "@gw_ttr@", Long.toString(this.f141942a.m213328a(), 10)), "@gw_seqnum@", this.f141944c), "@gw_sessid@", this.f141945d);
            boolean z3 = false;
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132355p3)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !zIsEmpty;
            if (z3) {
                z2 = z4;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strM162812j2);
            }
            if (this.f141950i.m171381f(Uri.parse(strM162812j2))) {
                Uri.Builder builderBuildUpon = Uri.parse(strM162812j2).buildUpon();
                if (z3) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strM162812j2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strM162812j2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060 A[LOOP:0: B:13:0x005a->B:15:0x0060, LOOP_END] */
    /* JADX INFO: renamed from: e */
    public final List m162815e(kxv0 kxv0Var, List list, zvs0 zvs0Var) {
        wxv0 wxv0Var;
        zzfwz zzfwzVarZzd;
        String str;
        String str2;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = this.f141949h.currentTimeMillis();
        try {
            String strZzc = zvs0Var.zzc();
            String string = Integer.toString(zvs0Var.zzb());
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132368q3)).booleanValue()) {
                byv0 byv0Var = this.f141948g;
                if (byv0Var == null) {
                    zzfwzVarZzd = zzfwz.zzc();
                } else {
                    wxv0Var = byv0Var.f77972a;
                }
                str = (String) zzfwzVarZzd.zza(new yew0() { // from class: l.m5w0
                    @Override // p149l.yew0
                    public final Object apply(Object obj) {
                        return o5w0.m162811i(((wxv0) obj).f188521a);
                    }
                }).zzb("");
                str2 = (String) zzfwzVarZzd.zza(new yew0() { // from class: l.n5w0
                    @Override // p149l.yew0
                    public final Object apply(Object obj) {
                        return o5w0.m162811i(((wxv0) obj).f188522b);
                    }
                }).zzb("");
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(o0t0.m162169c(m162812j(m162812j(m162812j(m162812j(m162812j(m162812j((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.f141943b), this.f141946e, kxv0Var.f125180X));
                }
                return arrayList;
            }
            wxv0Var = this.f141947f;
            zzfwzVarZzd = zzfwz.zzd(wxv0Var);
            str = (String) zzfwzVarZzd.zza(new yew0() { // from class: l.m5w0
                @Override // p149l.yew0
                public final Object apply(Object obj) {
                    return o5w0.m162811i(((wxv0) obj).f188521a);
                }
            }).zzb("");
            str2 = (String) zzfwzVarZzd.zza(new yew0() { // from class: l.n5w0
                @Override // p149l.yew0
                public final Object apply(Object obj) {
                    return o5w0.m162811i(((wxv0) obj).f188522b);
                }
            }).zzb("");
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(o0t0.m162169c(m162812j(m162812j(m162812j(m162812j(m162812j(m162812j((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.f141943b), this.f141946e, kxv0Var.f125180X));
            }
            return arrayList;
        } catch (RemoteException e) {
            x2t0.m206867e("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
