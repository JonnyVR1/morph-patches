package p153l;

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
public final class uew0 {

    /* JADX INFO: renamed from: a */
    public final ehv0 f178709a;

    /* JADX INFO: renamed from: b */
    public final String f178710b;

    /* JADX INFO: renamed from: c */
    public final String f178711c;

    /* JADX INFO: renamed from: d */
    public final String f178712d;

    /* JADX INFO: renamed from: e */
    public final Context f178713e;

    /* JADX INFO: renamed from: f */
    public final c7w0 f178714f;

    /* JADX INFO: renamed from: g */
    public final h7w0 f178715g;

    /* JADX INFO: renamed from: h */
    public final Clock f178716h;

    /* JADX INFO: renamed from: i */
    public final v2s0 f178717i;

    public uew0(ehv0 ehv0Var, zzcei zzceiVar, String str, String str2, Context context, @Nullable c7w0 c7w0Var, @Nullable h7w0 h7w0Var, Clock clock, v2s0 v2s0Var) {
        this.f178709a = ehv0Var;
        this.f178710b = zzceiVar.zza;
        this.f178711c = str;
        this.f178712d = str2;
        this.f178713e = context;
        this.f178714f = c7w0Var;
        this.f178715g = h7w0Var;
        this.f178716h = clock;
        this.f178717i = v2s0Var;
    }

    /* JADX INFO: renamed from: f */
    public static final List m195811f(int i, int i2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m195815j((String) it.next(), "@gw_mpe@", "2." + i2));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: g */
    public static final List m195812g(List list, String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m195815j((String) it.next(), "@gw_adnetstatus@", str));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static final List m195813h(List list, long j) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(m195815j((String) it.next(), "@gw_ttr@", Long.toString(j, 10)));
        }
        return arrayList;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public static String m195814i(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return cct0.m109067k() ? "fakeForAdDebugLog" : str;
    }

    /* JADX INFO: renamed from: j */
    public static String m195815j(String str, String str2, @Nullable String str3) {
        if (true == TextUtils.isEmpty(str3)) {
            str3 = "";
        }
        return str.replaceAll(str2, str3);
    }

    /* JADX INFO: renamed from: c */
    public final List m195816c(b7w0 b7w0Var, q6w0 q6w0Var, List list) {
        return m195817d(b7w0Var, q6w0Var, false, "", "", list);
    }

    /* JADX INFO: renamed from: d */
    public final List m195817d(b7w0 b7w0Var, @Nullable q6w0 q6w0Var, boolean z, @Nullable String str, @Nullable String str2, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            boolean z2 = true;
            String strM195815j = m195815j(m195815j(m195815j((String) it.next(), "@gw_adlocid@", b7w0Var.f75342a.f197721a.f145320f), "@gw_adnetrefresh@", true != z ? "0" : "1"), "@gw_sdkver@", this.f178710b);
            if (q6w0Var != null) {
                strM195815j = u9t0.m195119c(m195815j(m195815j(m195815j(strM195815j, "@gw_qdata@", q6w0Var.f155919z), "@gw_adnetid@", q6w0Var.f155918y), "@gw_allocid@", q6w0Var.f155917x), this.f178713e, q6w0Var.f155870X);
            }
            String strM195815j2 = m195815j(m195815j(m195815j(m195815j(strM195815j, "@gw_adnetstatus@", this.f178709a.m120865g()), "@gw_ttr@", Long.toString(this.f178709a.m120863a(), 10)), "@gw_seqnum@", this.f178711c), "@gw_sessid@", this.f178712d);
            boolean z3 = false;
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168426p3)).booleanValue() && !TextUtils.isEmpty(str)) {
                z3 = true;
            }
            boolean zIsEmpty = TextUtils.isEmpty(str2);
            boolean z4 = !zIsEmpty;
            if (z3) {
                z2 = z4;
            } else {
                if (!zIsEmpty) {
                }
                arrayList.add(strM195815j2);
            }
            if (this.f178717i.m199150f(Uri.parse(strM195815j2))) {
                Uri.Builder builderBuildUpon = Uri.parse(strM195815j2).buildUpon();
                if (z3) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("ms", str);
                }
                if (z2) {
                    builderBuildUpon = builderBuildUpon.appendQueryParameter("attok", str2);
                }
                strM195815j2 = builderBuildUpon.build().toString();
            }
            arrayList.add(strM195815j2);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060 A[LOOP:0: B:13:0x005a->B:15:0x0060, LOOP_END] */
    /* JADX INFO: renamed from: e */
    public final List m195818e(q6w0 q6w0Var, List list, f5t0 f5t0Var) {
        c7w0 c7w0Var;
        zzfwz zzfwzVarZzd;
        String str;
        String str2;
        Iterator it;
        ArrayList arrayList = new ArrayList();
        long jCurrentTimeMillis = this.f178716h.currentTimeMillis();
        try {
            String strZzc = f5t0Var.zzc();
            String string = Integer.toString(f5t0Var.zzb());
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168439q3)).booleanValue()) {
                h7w0 h7w0Var = this.f178715g;
                if (h7w0Var == null) {
                    zzfwzVarZzd = zzfwz.zzc();
                } else {
                    c7w0Var = h7w0Var.f108172a;
                }
                str = (String) zzfwzVarZzd.zza(new eow0() { // from class: l.sew0
                    @Override // p153l.eow0
                    public final Object apply(Object obj) {
                        return uew0.m195814i(((c7w0) obj).f80151a);
                    }
                }).zzb("");
                str2 = (String) zzfwzVarZzd.zza(new eow0() { // from class: l.tew0
                    @Override // p153l.eow0
                    public final Object apply(Object obj) {
                        return uew0.m195814i(((c7w0) obj).f80152b);
                    }
                }).zzb("");
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(u9t0.m195119c(m195815j(m195815j(m195815j(m195815j(m195815j(m195815j((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.f178710b), this.f178713e, q6w0Var.f155870X));
                }
                return arrayList;
            }
            c7w0Var = this.f178714f;
            zzfwzVarZzd = zzfwz.zzd(c7w0Var);
            str = (String) zzfwzVarZzd.zza(new eow0() { // from class: l.sew0
                @Override // p153l.eow0
                public final Object apply(Object obj) {
                    return uew0.m195814i(((c7w0) obj).f80151a);
                }
            }).zzb("");
            str2 = (String) zzfwzVarZzd.zza(new eow0() { // from class: l.tew0
                @Override // p153l.eow0
                public final Object apply(Object obj) {
                    return uew0.m195814i(((c7w0) obj).f80152b);
                }
            }).zzb("");
            it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(u9t0.m195119c(m195815j(m195815j(m195815j(m195815j(m195815j(m195815j((String) it.next(), "@gw_rwd_userid@", Uri.encode(str)), "@gw_rwd_custom_data@", Uri.encode(str2)), "@gw_tmstmp@", Long.toString(jCurrentTimeMillis)), "@gw_rwd_itm@", Uri.encode(strZzc)), "@gw_rwd_amt@", string), "@gw_sdkver@", this.f178710b), this.f178713e, q6w0Var.f155870X));
            }
            return arrayList;
        } catch (RemoteException e) {
            dct0.m115296e("Unable to determine award type and amount.", e);
            return arrayList;
        }
    }
}
